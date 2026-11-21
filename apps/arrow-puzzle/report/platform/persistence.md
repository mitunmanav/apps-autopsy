# Persistence and local state

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

- [Observation] EasyUtils.FlushSharedPreferences enumerates dataDir/shared_prefs files, filters preference-file extensions, and calls edit().commit(); RestartApp invokes it before starting a restart task and exiting.
- [Observation] RateDialogShow reads rate_is_disabled and increments rate_count in SharedPreferences in the observed code path.
- [Observation] Three Room-generated DB implementations exist: EtsDatabase_Impl, FairFaxDatabase_Impl, EventsCountDatabase_Impl; each exposes generated open-delegate, invalidation-tracker and clearAllTables methods.
- [Unknown] Room schemas, filenames, DAO callsites, retention rules and stored values were not recovered.
- [Observation] IL2CPP identifiers include GameSaveData, GameSaveDataManager, GameSaveRegistry and generated save-data types.
- [Unknown] These identifiers do not establish serialization, storage medium, write timing, encryption or restore behavior because native bodies are unavailable.
- [Observation] Packaged data names include arrowsdata.dat, arrowsequence.dat, ab_oldlevels.dat, ab_levels2_data_new.dat and ab_levels2_sequence_new.dat.
- [Unknown] Their schemas and consumers remain unresolved.
