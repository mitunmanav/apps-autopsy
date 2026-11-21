# Feature: Advanced browsing & SAF integration

## `advancedbrowsing` namespace (verified names)

- `advancedbrowsing.browser.AdvancedBrowsingActivity` — power-user tree
  browsing beyond category views; raw filesystem tree incl. root-level dirs
  (within permission limits).
- `advancedbrowsing.picker.AdvancedBrowsingPickerActivity` — Files acting as a
  document/file picker for other apps.
- `documentbrowser.browselanding.documentsprovider.DocumentsProviderBrowserActivity`
  — browser over external `DocumentsProvider`s (USB OTG, network storage apps).
- `mediastore.receiver.ContentChangeListenerReceiver` — MediaStore
  content-change events keep browsed lists live without rescan.

## Providers exposed to other apps

- `libraries.safestorage.SafeContentProvider` — app-controlled content URIs.
- `offlinesharing.foldersharing.FolderSharingContentProvider` —
  sharing-scoped (see `sharing.md`).
- `androidx.core.content.FileProvider` + `libraries.storage.storagelib.
  FileProvider` — two file-serving providers.

## Evidence

Activity/provider names from manifest; ContentChangeListenerReceiver;
`qdc` externalstorage tree-URI handling (`com.android.externalstorage.documents`).

## Unknowns

- Whether Files registers its own full `DocumentsProvider` for system Files
  integration — the activity name suggests browse-INTO providers, not expose-AS.
- Root/privileged paths — none expected; no root checks found.
