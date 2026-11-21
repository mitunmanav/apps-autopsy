> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Localization

## How it works
`values-{ca,de,es,fr,it,ja,ko,nl,pl,pt,ru,tr,uk,zh}/` resource dirs (14 locales)
+ `LanguageUtils`, `LocaleUtils`, `ChangeLanguage*`, `LanguageActivity` —
in-app locale override stored in settings; `strings.xml` is the default
English catalog (~1,900 entries incl. all tool labels/descriptions,
`tool_desc_*`, `how_it_works_*` explainers).
