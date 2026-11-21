> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Protect PDF

Encrypt a PDF with a password.

## How it works
- `Tools.Protect` (`internalName=PROTECT`, `offlineSupport=true`).
- `ProtectLocalTask` → `PDFNativeLib.protect(input, output, password)` →
  K1 `nativeProtect` AES encryption; `ProtectParams` carries the password;
  `PasswordTextValidator`/`PasswordHintValidator` enforce password policy
  (`shared_password_*` hints), `CheckPasswordUseCase` validates.
- Remote equivalent: `ProtectTask` (`Tool.PROTECT_PDF`, `ProtectParams`).
- Result is opened in a password-protected viewer (`ReadPdfActivity`/`PdfViewActivityCompose` via `PdfDocument` password API).
