# Tool: Scan & Pay (QR) — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

- **UI entry (obs):** `com.olacabs.qrcode_reader.{QrCode,QrCodeAuto}Activity` (internal). CAMERA permission declared.
- **Parameter model (inf):** QR payload → likely UPI/merchant VPA or Ola Money merchant code; `MerchantPayActivity`, `P2PActivity`, `SendPayActivity` exist as pay destinations in OM stack.
- **Execution path (inf, bounded):** camera decode (ZXing-family, obs classes) → parse UPI/merchant intent → route into OM `MerchantPay`/`SendPay` or UPI flow → `olamoney/v3/validateAndDebit` / UPI authorize → confirm.
- **Local vs remote:** decode local; payment remote (obs endpoints).
- **Premium/offline:** online-only for pay; decode works offline (inf).
- **Input→output:** QR image → payment intent → amount confirm → debit → transaction row.
- **Unknowns:** exact QR payload grammar, whether `QrCodeAuto` = auto-capture mode, routing rules between OM vs UPI rails.
