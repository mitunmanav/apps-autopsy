# Feature: Trash (Recycle Bin)

## Mechanism — rename-based trash + expiry DB

### On-disk naming

Class `hxz` builds the trash filename:

```java
String.format(Locale.ROOT, ".trashed-%d-%s.trash", epochMilli, originalName)
```

Patterns (`kpv`):

```regex
(?i)^\.(trashed)-(\d+)-([^/]+)$
(?i)^\.(trashed)-(\d+)-([^/]+)\.(trash)$
```

Files stay **in place**, renamed to a hidden `.trashed-<timestamp>-<name>.trash`
— no data movement, instant trash/restore on the same volume, invisible to
gallery apps (dotfile).

### `trash_table` (`trash_database`, DDL `lub`)

```sql
CREATE TABLE trash_table(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  file_name TEXT UNIQUE NOT NULL,
  size INTEGER NOT NULL,
  uri TEXT NOT NULL,
  file_date_modified_s INTEGER NOT NULL,
  original_path TEXT NOT NULL,
  expiry_date_s INTEGER NOT NULL,
  storage_location INTEGER NOT NULL);
```

- `expiry_date_s` → **30-day window** (strings: restore window + expiry messaging).
- `file_name UNIQUE` prevents double-trash collisions.
- `original_path` + `storage_location` enable restore-to-origin.
- Synthetic ID packing `((id << 2) | storage_location)` for mixed-volume listing.

## MediaStore vs legacy paths

- **Android 11+ (R)**: `qbw` uses MediaStore trash APIs
  (`Failed to update MediaStore to trash or restore files!`,
  `Failed to update document trash status to`, `More than one row is updated
  when updating trash status!`).
- **pre-R**: `lpv` storagelib `DocumentCollection` rename scheme
  (`Getting trash from storageLibDocumentCollection on pre-R!`).

## Lifecycle workers

- `keb` — `Failed to enqueue trash auto deletion worker to tiktok manager`
  (WorkManager periodic expiry sweep).
- `ak` — `Failed to enqueue trash database sync worker` (reconciles DB vs FS).
- `hmb` — `Failed to get trash stats for internal storage / sd card`
  (`SUM(size)`/`COUNT(id)` aggregate query for the trash UI).
- Boot handling: `trash.manager.impl.TrashDbMigrationBootCompleteReceiver`
  — the manifest's boot receiver exists specifically to run trash-DB migration
  on `BOOT_COMPLETED` (corrected: not a generic reschedule receiver; worker
  re-enqueue happens via WorkManager init).

## Guards

- `Move to trash being called on USB files!` (`jfr`) — OTG excluded.
- `Operation not supported for trash.` (`luf`) — per-doc-type whitelist.
- `Failed to get trashed or restored target document!` (`qbw`),
  `Index for selected file to trash was invalid.` (`jhz`),
  `Failed to move files to trash` / `Failed to restore files from trash`
  (`itd`,`jhn`,`hrd`,`ilf`,`ikq`), `Failure in batch trashing operation.`

## Evidence

DDL `lub`; queries `knh`/`hxz`/`lnl`/`oaa`; naming `kpv`/`hxz`/`lrp`;
workers `keb`/`ak`/`hmb`; MediaStore `qbw`; UI `TrashActivity` + refresh peer `lws`.

## Unknowns

- Exact expiry period (30 days per strings; not confirmed in code constants).
- Expiry sweep cadence (WorkManager interval obfuscated).
- Interaction between `.trashed-*` rename and MediaStore trash on the same file.
