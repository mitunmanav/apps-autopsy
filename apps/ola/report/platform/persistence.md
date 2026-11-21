# Persistence — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`

## Mechanisms present (obs)

### 1. Room (`com.olacabs.customer.app.room.AppDatabase` + `AppDatabase_Impl`)
- Room database with generated impl, migrations, `MultiInstanceInvalidationService` (obs).
- Known entities/DAO-adjacent classes (obs, names partially obfuscated):
  - `com.olacabs.connect.inbox.InboxEntity` — 5 fields: `String a`, `Long b`, `Long c`, `String d`, `String e` (ev_c80a0e53…) → notification/communication-hub inbox rows (inf mapping).
  - `com.olacabs.customer.app.room.a–f` — obfuscated entities/DAOs.
  - Ola Money + Razorpay transaction entities (`EntityOptions`, `UpiEntity`).
- Full schema/DAO query coverage: **partial** — not exhaustively decompiled (limitation).

### 2. Volley disk cache (`OlaDiskBasedCache`, ev_15b43aa3…)
- Implements `com.android.volley.Cache`: `initialize()`, `b(String)→Entry`, `c(String,Entry)` (put), `clear()`, file-per-key storage, header serialization helpers — legacy HTTP response cache layer (obs).

### 3. Preferences (strings observed in DEX/resources)
- Proto DataStore: `datastore_preferences_core`, `preferences_pb` (obs).
- SharedPreferences-style names: `app_feedback_preferences`, `ride_preferences*`, `category_revamp_*`, `review_preferences`, `rn_dev_preferences`, `rzp_payment_preferences`, `rzp_preferences_storage_bridge`, `current_preferences_state`, `shared_prefs` (obs).
- Exact key→value model not fully decoded (unk).

### 4. File/asset storage
- FileProvider + RNCWebViewFileProvider + ChuckerFileProvider for sharing files/URI access (obs).
- Image caching via Fresco/Coil (disk caches managed by those libs, inf).

### 5. Keystore/crypto
- `nimbusds.jose` JWT classes → token parse/validate (obs, usage sites untraced).
- No evidence of SQLCipher/encrypted DB (unk whether Room content is encrypted — default Room is plaintext; assume unencrypted, inf).

## Data classes observed persisted (inf)
- Notification inbox items (Room InboxEntity)
- UPI/wallet transaction records (entities)
- Ride/feedback/review preferences
- HTTP response cache (Volley)
- RN/razorpay bridge prefs

## Unknowns
- Complete Room schema, migration count, and DAO operations.
- Whether auth tokens persist in DataStore, prefs, or Keystore — storage class not traced to a specific mechanism (unk).
- Cache eviction sizes (`OlaDiskBasedCache` max size param exists but the configured value not resolved).
