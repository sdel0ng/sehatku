/* SehatKu service worker — supaya aplikasi yang dipasang (PC / iPhone / Android) tetap terbuka tanpa internet.
 * Strategi: selalu ambil dari jaringan dulu (jadi pembaruan langsung terlihat), simpan salinannya,
 * dan pakai salinan itu hanya kalau sedang offline. version.json tidak pernah disimpan. */
const CACHE = 'sehatku-offline-v1';
const CORE = [
  './SehatKu.html',
  './manifest.webmanifest',
  './icon-192.png',
  './icon-512.png',
  './icon-maskable-512.png',
  './apple-touch-icon.png',
];
const APP_PAGE = new URL('./SehatKu.html', self.registration.scope).href;
const NETWORK_TIMEOUT_MS = 8000;

self.addEventListener('install', event => {
  event.waitUntil((async () => {
    const cache = await caches.open(CACHE);
    // Satu file gagal tidak boleh menggagalkan pemasangan
    await Promise.all(CORE.map(path => cache.add(new Request(path, { cache: 'reload' })).catch(() => null)));
    await self.skipWaiting();
  })());
});

self.addEventListener('activate', event => {
  event.waitUntil((async () => {
    const keys = await caches.keys();
    await Promise.all(keys.filter(key => key.startsWith('sehatku-') && key !== CACHE).map(key => caches.delete(key)));
    await self.clients.claim();
  })());
});

// Kunci cache tanpa ?query, supaya SehatKu.html?v=2.3 dan SehatKu.html memakai salinan yang sama
const cacheKey = url => url.origin + url.pathname;

function fetchWithTimeout(request) {
  return new Promise((resolve, reject) => {
    const timer = setTimeout(() => reject(new Error('timeout')), NETWORK_TIMEOUT_MS);
    fetch(request).then(response => {
      clearTimeout(timer);
      resolve(response);
    }, error => {
      clearTimeout(timer);
      reject(error);
    });
  });
}

self.addEventListener('fetch', event => {
  const request = event.request;
  if (request.method !== 'GET') return;
  const url = new URL(request.url);
  if (url.origin !== self.location.origin) return;                // Firebase, GitHub, dll. langsung ke jaringan
  if (!url.href.startsWith(self.registration.scope)) return;
  if (url.pathname.endsWith('/version.json') || url.pathname.endsWith('/sw.js')) return;

  event.respondWith((async () => {
    const cache = await caches.open(CACHE);
    const key = cacheKey(url);
    try {
      const response = await fetchWithTimeout(request);
      if (response.ok && response.type === 'basic') {
        const copy = response.clone();
        event.waitUntil(cache.put(key, copy).catch(() => null));
      }
      return response;
    } catch (error) {
      const cached = await cache.match(key);
      if (cached) return cached;
      if (request.mode === 'navigate') {
        const page = await cache.match(APP_PAGE);
        if (page) return page;
      }
      throw error;
    }
  })());
});
