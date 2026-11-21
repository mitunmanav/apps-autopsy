> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Sign PDF

Electronic signatures: draw/type, saved signatures, and hardware-key signing.

## How it works
- `Tools.Sign` (`internalName=sign`).
- `SignatureActivity` (`com.ilovepdf.signaturekit`) — draw signature (Ink),
  type it, or reuse stored `signature_storage` entries
  (`SignatureFilesProvider`, `MySignaturesActivity`, `DeleteSignaturesActivity`).
- Placement UI on page thumbnails → signature flattened into the PDF; K1
  `k1_pdfsig` native call is the signing primitive for cryptographic sign.
- Smartcard/PKI path: `signaturekit_*` smartcard strings + Yubico YubiKit
  (`yubikit_*` strings, `NFC` permission, `nfc_tech_filter` xml, YubiKey UI
  classes) → sign with a hardware key over NFC/USB, PIN entry dialogs.
- `signature_cert`/`keychain_password` flows manage signing certificates;
  timestamp/reason/location fields from sign params (`SignParams` remote).
