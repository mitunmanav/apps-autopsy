> **Scope:** iLovePDF `base.apk` only — `com.ilovepdf.www` v4.2.3 (4002003), SHA-256 `5e26b8e12fc3d1cbc91178d776fd24aa0e6e16dc7ad75589b0e2671b6e77ad41`. Static analysis; no runtime evidence.

# Unlock PDF

Remove the password from a protected PDF.

## How it works
- `Tools.Unlock` (`internalName=UNLOCK`, `offlineSupport=null` → effectively
  remote-preferred in UI classification but a local task exists).
- `UnlockLocalTask` → `PDFNativeLib.unlock(input, output, password)` →
  `nativeUnlock` in libk1sdk. The password is first probed with
  `pdfIsProtected`/`passwordIsCorrect` (codes 10/11 → missing/wrong).
- Remote: `UnlockTask` (`Tool.UNLOCK_PDF`, `UnlockParams` — password +
  `passwords` map for batch).
- `UnlockFileActivity`/`UnlockToolFragment` drive the password prompt;
  protected-file detection also uses `EncryptedFileChecker`.
