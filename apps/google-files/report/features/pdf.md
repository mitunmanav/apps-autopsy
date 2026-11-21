# Feature: PDF preview & annotation

## Preview

- `pdf_preview_item_host_fragment.xml` — host layout; manifest declares
  `androidx.pdf.service.PdfDocumentService` + `PdfDocumentServiceImpl`
  (**`isolatedProcess="true"`** — sandboxed render) and
  `libraries.documents.common.service.PdfRendererService` → untrusted-document
  parsing runs in an isolated process.
- `gateway.pdf.PdfPreviewIntentGatewayHandler` + `EnablePdfPreviewActivityReceiver`
  gate the external `VIEW application/pdf` route.
- Viewer peer `jha` (preview fragment peer) + bottom-sheet layout
  `bottomsheet_pdf*`.
- **`gemini_button` FAB** inside the PDF host layout → entry to Gemini Q&A
  (see `gemini.md`).

## Annotation

Strings & layouts confirm an **annotation toolbar**: pen, highlighter, eraser,
undo, redo — edits save back to the document (write path via SAF/MediaStore
mutation for owned files).

## Viewing features

- Page thumbnails/scrubber, zoom, search-in-document hooks
  (strings for PDF navigation present).
- Locked-PDF path: `jld.h()` reads `is_pdf_locked` bundle state — password-gated
  viewer state carried through the bottom sheet session (`session_id`).

## Evidence

Manifest isolated services; `pdf_preview_item_host_fragment.xml` +
`gemini_button`; `jha`/`jld` peers; annotation strings.

## Unknowns

- Exact annotation persistence format (flattened ink vs embedded annots).
- Renderer = AndroidX PdfRenderer/Pdfium via isolated service — version inside
  dynamite/GMS or bundled classes unconfirmed.
