> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Page Numbers

Stamp page numbers with position/format/typography options.

## How it works
- `Tools.PageNumbers` (`internalName=pageNumber`, remote `Tool.NUMBER_PAGES`).
- `NumberPagesTask`/`NumberPagesParams`: position (`NumberPagesPosition` grid),
  page range, first number, format (`NumberPagesFormat`: n / n of total /
  roman), font+size+color (`TextFormat`, `NumberPagesTyping`).
- UI: `tools.pagenumbers.PageNumbersToolFragment` → options fragment →
  preview thumbnails.
