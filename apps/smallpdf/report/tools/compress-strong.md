# Tool: Compress (Strong)

Artifact: `com.smallpdf.app.android` v3.7.0 — base SHA-256 `345548b0…f38eb6a6`.

- Descriptor `i3a.X`: id `"compress_strong"`, icon `tool_compress_32`, label `tool_compress_strong`, files `1..MAX`, group `j3a` `[obs]`.
- UI entry: Compress group (strong option) `[obs]`; no dedicated app-link path (reuses compress flow) `[inf]`.
- Params `[obs]`: `nt7(mt7.i)` = strong/force compression level.
- Execution `[obs]`: **remote** — same `zl`→`b72`→`nu7` pipeline as basic, differing only in `mt7` option.
- Premium `[inf]`: strong level is the paid tier (`isPremiumTool` gates; free users see paywall).
- Flow: identical to compress-basic; server applies stronger downsampling — output quality `[unk]` statically.
