# Endpoint catalog

All remote hosts observed in resources, configs and strings (static; FORM params are attribution codes).

| Host/URL | Feature |
|---|---|
| `jenson.api.swiftkey.com/models/…` | Language-pack model archives |
| `jenson.api.swiftkey.com/swiftkey/sksdk-3.0/sk-9.13.20/market/` | Model market base |
| `sk-connect.api.swiftkey.com/api/` | Account/connect (sync, devices) |
| `clip.api.swiftkey.com` | Cloud clipboard |
| `bibo.api.swiftkey.com` | BiBo config/model delivery |
| `houston.services.swiftkey.com` (phone path) | Telemetry upload |
| `assets.swiftkey.com` | Appconfig, cards media, sticker packs (`/stickers/`), how-to videos (`/files/`), tone video (`/app/tone-02.webm`) |
| `crowdsourcing.swiftkey.com` | Crowdsourcing tasks |
| `copilot.microsoft.com/?FORM=SWTACW` | Copilot/Ask Bing |
| `www.bing.com/search?` | Web search |
| `www.bing.com/api/swiftkey/` | Bing API (suggest/search backends) |
| `www.bing.com/images/create/ai-image-generator[?partner=swftkey&FORM=bicswk][template/anime-style]` | AI image creation + Camera Remix template |
| `www.bing.com/maps/?` | Maps cards |
| `www.bing.com/fd/auth/signin` | Bing auth |
| `api.giphy.com/` | GIPHY GIFs |
| `api.klipy.com` | Klipy GIFs/stickers + ad slots |
| `activity.windows.com` | Microsoft activity/Rewards |
| `app.adjust.com/n4j99i9` | Adjust tracker |
| `login.microsoftonline.com`/`login.live.com` | MSAL authorities (consumers tenant) |
| Play store URIs | In-app update, rate us |

`FORM=` codes seen: `SWTACW` (Copilot), `BICSKR` (camera remix), `bicswk` (image create) — traffic attribution back to SwiftKey.

Cleartext HTTP disabled globally (`network_security_config.xml`); all above are TLS.
