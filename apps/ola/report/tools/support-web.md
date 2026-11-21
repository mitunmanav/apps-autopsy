# Tool: Support & Web Surfaces — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `SelfServeActivity` (help.olacabs.com/self_serve/v1/), `OlaWebViewActivity`, `CommonWebViewActivity`, `OlaElectricWebActivity`, OM `WebViewActivity` (**exported, no filter**).
- **Parameter model (inf):** target URL + auth headers; 6 `setJavaScriptEnabled` + 6 `addJavascriptInterface` call sites in DEX (obs).
- **Execution path (obs):** self-serve help → REST `help.olacabs.com/self_serve/v1/`; marketing/merchandising → `webapps.olacabs.com` (+ `/consumer-ola-hub`); OM web → exported `WebViewActivity`.
- **Local vs remote:** remote content, local WebView shell + JS bridges.
- **Premium/offline:** online-only.
- **Input→output:** help topic/order id → web flow → resolution/complaint (also `TransactionComplaintActivity` native path).
- **Risk note (inf):** exported `olamoneyrest…WebViewActivity` + JS interfaces = review-worthy surface; exploitability unk.
- **Unknowns:** JS bridge object names/methods exposed, URL allowlists, auth header injection into WebView.
