# Unity Android lifecycle and deep-link bridge

> [Observation] Artifact: base.apk
> [Observation] Package: com.easybrain.arrow.puzzle.game
> [Observation] SHA-256: 3e86c708abeb06ae7885f9bdf0d4d4c149f8a7b4a90580eb6e07e5e5540b97f0

## UI entry
- [Observation] Android entry is the manifest activity lifecycle and ACTION_VIEW filter; no Unity C# receiver is linked.

## Parameter model
- [Observation] Lifecycle methods take Activity/Bundle or Activity/Intent; deeplink input is Intent data string. SetUnityMessageHandler takes name and JavaMessageHandler.

## Exact execution path
- [Observation] WrapperAndroid dispatches to EasyUtils and DeeplinkActivityListener. SetUnityMessageHandler initializes WrapperMessageSender then UnityPlugin.UnityInit. ACTION_VIEW URL is stored, intent data cleared, and EDeeplinkActivated sent.

## Premium and offline flags
- [Unknown] No premium flag; route dispatch is local, while destination/offline content behavior is unknown.

## Input to output
- [Observation] Intent/lifecycle -> listeners; URL -> stored string and Unity message; GetDeeplink -> string.

## Evidence
- [Observation] Evidence ev_e5cd640317997637d67c288e184505212240fab63026c59401ac9494412ff0c3, ev_dbd92001f21486958da7126d946c94ba6b2dcfd29df21c311c55fea08a7434e9, ev_87708aa94f4d8e231e8098ab325a106120cfc769376dc8aa25c09cc6cc5fbf39, ev_3a43728fde46d21585855881e0236cf59baa22b3af380534121048bde2dc13b6.
