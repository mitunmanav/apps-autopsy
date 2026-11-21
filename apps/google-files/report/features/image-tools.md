# Feature: Image tools & native vision utils

## `libimageutilsjni.so` — VisionKit image utilities

Exported JNI (see `native.md` for full ELF details):

| Function | Purpose |
|---|---|
| `isBlurred` | blur classification — feeds "blurry photos" cleanup card |
| `getClarityValue` | numeric sharpness score |
| `downsampleImage` | fast downscale for thumbnails/ML input |
| `convertYUV420SPToARGB8888` | camera-pipeline format conversion |
| `convertARGB8888ToYUV420SP` | reverse conversion |

Class: `com.google.android.libraries.vision.visionkit.imageutils.ImageUtils`.

## Image viewer

- Gallery-style viewer (zoom/pan via `itt`-family peers + gesture classes);
  per-image info sheet (EXIF readout strings present);
  edit entry points route to system editors.
- Blur badge: `isBlurred`/`getClarityValue` score surfaces in cleanup cards
  (see `cleanup.md`).

## Evidence

JNI exports `ev_e80b834f286073b188e280224bf22829eed2e01094f7299fa4c6497602e3ae34`,
ELF `ev_ef096b3551be6b182d908af5296136ef3e869bff64e22b6af869b0ba8c06e2ee`,
JNI decl inventory `ev_b482f31ed2ac27b1f6487de7686a2ed4ac2391c94df9c665db946368a34651da`.

## Unknowns

- Blur threshold constant (inside native code).
- Whether `getClarityValue` also ranks scanner-capture quality.
