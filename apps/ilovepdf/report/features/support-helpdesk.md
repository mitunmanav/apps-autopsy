> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Support — contact form (Freshdesk)

## How it works
`ContactActivity`/`FreshdeskContactActivity` (`contact` strings: subject,
description, category, attachments) posts to `ilovepdf.freshdesk.com`
(Freshdesk SDK metadata in manifest); device/app info (`DeviceUtils`,
`ApplicationInfo`) auto-attached; `ilovepdf_help`/`how_it_works` links open
`WebViewActivity` with ilovepdf.com help pages (`help_url`). FAQs/legal reuse
the same WebView host.
