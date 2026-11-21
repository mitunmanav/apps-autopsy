# Android identification bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Unknown] Unity caller and any UI route are not linked to identifier getters.

## Parameter model
- [Observation] Zero-arg string getters: Adjust ID, advertising ID, EasyApp ID, EUID, installation ID; SetEuid(String) takes a string.

## Exact execution path
- [Observation] GetEasyAppId returns from identification service; personalization request uses EasyApp ID and EUID as explicit headers. Other transmission callers are unresolved.

## Premium and offline flags
- [Unknown] No premium flag is evidenced; ID persistence, consent and offline availability are unknown.

## Input to output
- [Observation] Getter -> string; SetEuid string -> void.

## Evidence
- [Observation] Evidence ev_5cfb071df409fb10063ce44368e00b28284a6b1deae959f4ae0d674ff73d9d64 and ev_c2883f9cd400acf70abfd79533d7fa2a1dbcd69022901e002dc6d62f5f4cf729.
