package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import com.airbnb.lottie.ugsD.hwFONEpCMKZ;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Ju.NKqVA;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.pdf.PdfContentParser;
import com.itextpdf.text.pdf.fonts.otf.lujf.ZPpqUfsYTcWxP;
import defpackage.bj;
import defpackage.dq9;
import defpackage.ej6;
import defpackage.eo7;
import defpackage.fp;
import defpackage.fz7;
import defpackage.gc1;
import defpackage.hl9;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.lj6;
import defpackage.mz8;
import defpackage.n18;
import defpackage.oq5;
import defpackage.pj2;
import defpackage.rx0;
import defpackage.tz;
import defpackage.u40;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class utils {

    public static final class PollutantRange {
        private final double bpHigh;
        private final double bpLow;
        private final int iHigh;
        private final int iLow;

        public PollutantRange(double d, double d2, int i, int i2) {
            this.bpLow = d;
            this.bpHigh = d2;
            this.iLow = i;
            this.iHigh = i2;
        }

        public static /* synthetic */ PollutantRange copy$default(PollutantRange pollutantRange, double d, double d2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                d = pollutantRange.bpLow;
            }
            double d3 = d;
            if ((i3 & 2) != 0) {
                d2 = pollutantRange.bpHigh;
            }
            double d4 = d2;
            if ((i3 & 4) != 0) {
                i = pollutantRange.iLow;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = pollutantRange.iHigh;
            }
            return pollutantRange.copy(d3, d4, i4, i2);
        }

        public final double component1() {
            return this.bpLow;
        }

        public final double component2() {
            return this.bpHigh;
        }

        public final int component3() {
            return this.iLow;
        }

        public final int component4() {
            return this.iHigh;
        }

        public final PollutantRange copy(double d, double d2, int i, int i2) {
            return new PollutantRange(d, d2, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PollutantRange)) {
                return false;
            }
            PollutantRange pollutantRange = (PollutantRange) obj;
            return Double.compare(this.bpLow, pollutantRange.bpLow) == 0 && Double.compare(this.bpHigh, pollutantRange.bpHigh) == 0 && this.iLow == pollutantRange.iLow && this.iHigh == pollutantRange.iHigh;
        }

        public final double getBpHigh() {
            return this.bpHigh;
        }

        public final double getBpLow() {
            return this.bpLow;
        }

        public final int getIHigh() {
            return this.iHigh;
        }

        public final int getILow() {
            return this.iLow;
        }

        public int hashCode() {
            return Integer.hashCode(this.iHigh) + fz7.e(this.iLow, (Double.hashCode(this.bpHigh) + (Double.hashCode(this.bpLow) * 31)) * 31, 31);
        }

        public String toString() {
            return "PollutantRange(bpLow=" + this.bpLow + ", bpHigh=" + this.bpHigh + ", iLow=" + this.iLow + ", iHigh=" + this.iHigh + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence exportLocationsToCSV$lambda$0(Cursor cursor, int i) {
        String string = cursor.getString(i);
        return string != null ? lj6.n(string, ",", " ") : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence exportNotesToCSV$lambda$0(Cursor cursor, int i) {
        String string = cursor.getString(i);
        return string != null ? lj6.n(string, ",", " ") : "";
    }

    public final int calculateAQI(double d, double d2, double d3, double d4, double d5, double d6) {
        Comparable comparable;
        Iterator it = iv0.g(Integer.valueOf(calculateSubIndex(d, iv0.g(new PollutantRange(0.0d, 30.0d, 0, 50), new PollutantRange(31.0d, 60.0d, 51, 100), new PollutantRange(61.0d, 90.0d, 101, PdfContentParser.COMMAND_TYPE), new PollutantRange(91.0d, 120.0d, 201, 300), new PollutantRange(121.0d, 250.0d, 301, 400), new PollutantRange(251.0d, 350.0d, 401, 500)))), Integer.valueOf(calculateSubIndex(d2, iv0.g(new PollutantRange(0.0d, 50.0d, 0, 50), new PollutantRange(51.0d, 100.0d, 51, 100), new PollutantRange(101.0d, 250.0d, 101, PdfContentParser.COMMAND_TYPE), new PollutantRange(251.0d, 350.0d, 201, 300), new PollutantRange(351.0d, 430.0d, 301, 400), new PollutantRange(431.0d, 600.0d, 401, 500)))), Integer.valueOf(calculateSubIndex(d3, iv0.g(new PollutantRange(0.0d, 40.0d, 0, 50), new PollutantRange(41.0d, 80.0d, 51, 100), new PollutantRange(81.0d, 180.0d, 101, PdfContentParser.COMMAND_TYPE), new PollutantRange(181.0d, 280.0d, 201, 300), new PollutantRange(281.0d, 400.0d, 301, 400), new PollutantRange(401.0d, 1000.0d, 401, 500)))), Integer.valueOf(calculateSubIndex(d4, iv0.g(new PollutantRange(0.0d, 50.0d, 0, 50), new PollutantRange(51.0d, 100.0d, 51, 100), new PollutantRange(101.0d, 168.0d, 101, PdfContentParser.COMMAND_TYPE), new PollutantRange(169.0d, 208.0d, 201, 300), new PollutantRange(209.0d, 748.0d, 301, 400), new PollutantRange(749.0d, 1000.0d, 401, 500)))), Integer.valueOf(calculateSubIndex(d5, iv0.g(new PollutantRange(0.0d, 40.0d, 0, 50), new PollutantRange(41.0d, 80.0d, 51, 100), new PollutantRange(81.0d, 380.0d, 101, PdfContentParser.COMMAND_TYPE), new PollutantRange(381.0d, 800.0d, 201, 300), new PollutantRange(801.0d, 1600.0d, 301, 400), new PollutantRange(1601.0d, 2000.0d, 401, 500)))), Integer.valueOf(calculateSubIndex(d6 / 1000.0d, iv0.g(new PollutantRange(0.0d, 1.0d, 0, 50), new PollutantRange(1.1d, 2.0d, 51, 100), new PollutantRange(2.1d, 10.0d, 101, PdfContentParser.COMMAND_TYPE), new PollutantRange(10.1d, 17.0d, 201, 300), new PollutantRange(17.1d, 34.0d, 301, 400), new PollutantRange(34.1d, 50.0d, 401, 500))))).iterator();
        if (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable3 = (Comparable) it.next();
                if (comparable2.compareTo(comparable3) < 0) {
                    comparable2 = comparable3;
                }
            }
            comparable = comparable2;
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int calculateSubIndex(double d, List<PollutantRange> list) {
        list.getClass();
        for (PollutantRange pollutantRange : list) {
            double bpLow = pollutantRange.getBpLow();
            if (d <= pollutantRange.getBpHigh() && bpLow <= d) {
                return (int) ((((d - pollutantRange.getBpLow()) * ((double) (pollutantRange.getIHigh() - pollutantRange.getILow()))) / (pollutantRange.getBpHigh() - pollutantRange.getBpLow())) + ((double) pollutantRange.getILow()));
            }
        }
        return 500;
    }

    public final String countryCodeToFlagEmoji(String str) {
        str.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        ArrayList arrayList = new ArrayList(upperCase.length());
        for (int i = 0; i < upperCase.length(); i++) {
            char[] chars = Character.toChars(upperCase.charAt(i) + 61861);
            chars.getClass();
            arrayList.add(new String(chars));
        }
        return hv0.B(arrayList, "", null, null, 0, null, 62);
    }

    public final File exportLocationsToCSV(bj bjVar, gc1 gc1Var) {
        String str = hwFONEpCMKZ.FmCLNHNLjhj;
        bjVar.getClass();
        gc1Var.getClass();
        CPD.ShowDialog(bjVar);
        File file = new File(eo7.i(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).toString(), "/GPS Map Camera/Backups"));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, eo7.x(NKqVA.ayGlCb, new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()), ".csv"));
        try {
            file2.createNewFile();
            FileWriter fileWriter = new FileWriter(file2);
            Cursor cursorRawQuery = gc1Var.getReadableDatabase().rawQuery("SELECT * FROM LocationAll", null);
            cursorRawQuery.getClass();
            String[] columnNames = cursorRawQuery.getColumnNames();
            columnNames.getClass();
            fileWriter.append((CharSequence) fp.s(columnNames, ZPpqUfsYTcWxP.YVpiyVhqUVq, null, 62));
            fileWriter.append((CharSequence) str);
            while (cursorRawQuery.moveToNext()) {
                fileWriter.append((CharSequence) hv0.B(mz8.f(0, cursorRawQuery.getColumnCount()), ZPpqUfsYTcWxP.YVpiyVhqUVq, null, null, 0, new n18(cursorRawQuery, 1), 30));
                fileWriter.append((CharSequence) str);
            }
            cursorRawQuery.close();
            fileWriter.flush();
            fileWriter.close();
            CPD.DismissDialog();
            Toast.makeText(bjVar, "Locations exported successfully at " + file2.getAbsolutePath(), 0).show();
            return file2;
        } catch (Exception e) {
            CPD.DismissDialog();
            e.printStackTrace();
            Toast.makeText(bjVar, "Locations export failed", 0).show();
            return null;
        }
    }

    public final File exportLocationsToGMC(bj bjVar, gc1 gc1Var) {
        File file;
        String absolutePath;
        File file2;
        bjVar.getClass();
        gc1Var.getClass();
        CPD.ShowDialog(bjVar);
        String strX = eo7.x("LocationsBackup_", new SimpleDateFormat("ddMMyyyy_HHmmss", Locale.getDefault()).format(new Date()), ".gmc");
        File file3 = null;
        try {
            Cursor cursorRawQuery = gc1Var.getReadableDatabase().rawQuery("SELECT * FROM LocationAll", null);
            cursorRawQuery.getClass();
            JSONArray jSONArray = new JSONArray();
            while (true) {
                absolutePath = "";
                if (!cursorRawQuery.moveToNext()) {
                    break;
                }
                JSONObject jSONObject = new JSONObject();
                file = file3;
                try {
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_title"));
                    if (string == null) {
                        string = "";
                    }
                    jSONObject.put("loc_title", string);
                    String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_latitude"));
                    if (string2 == null) {
                        string2 = "";
                    }
                    jSONObject.put("loc_latitude", string2);
                    String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_longitude"));
                    if (string3 == null) {
                        string3 = "";
                    }
                    jSONObject.put("loc_longitude", string3);
                    String string4 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_line_1_address"));
                    if (string4 == null) {
                        string4 = "";
                    }
                    jSONObject.put("loc_line_1_address", string4);
                    String string5 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_line_2_city"));
                    if (string5 == null) {
                        string5 = "";
                    }
                    jSONObject.put("loc_line_2_city", string5);
                    String string6 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_line_3_state"));
                    if (string6 == null) {
                        string6 = "";
                    }
                    jSONObject.put("loc_line_3_state", string6);
                    String string7 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_line_4_country"));
                    if (string7 == null) {
                        string7 = "";
                    }
                    jSONObject.put("loc_line_4_country", string7);
                    String string8 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_line_5_pincode"));
                    if (string8 == null) {
                        string8 = "";
                    }
                    jSONObject.put("loc_line_5_pincode", string8);
                    jSONObject.put("loc_radius", cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("loc_radius")));
                    String string9 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("loc_timestamp"));
                    if (string9 == null) {
                        string9 = "";
                    }
                    jSONObject.put("loc_timestamp", string9);
                    jSONArray.put(jSONObject);
                    file3 = file;
                } catch (Exception e) {
                    e = e;
                }
                e = e;
                CPD.DismissDialog();
                e.printStackTrace();
                Toast.makeText(bjVar, bjVar.getString(R.string.locations_export_failed), 0).show();
                return file;
            }
            file = file3;
            cursorRawQuery.close();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", 1);
            jSONObject2.put("app", "GPSMapCamera");
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("locations", jSONArray);
            CryptoUtils cryptoUtils = CryptoUtils.INSTANCE;
            String string10 = jSONObject2.toString();
            string10.getClass();
            byte[] bArrEncrypt = cryptoUtils.encrypt(string10);
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", strX);
                contentValues.put("mime_type", "application/octet-stream");
                contentValues.put("relative_path", Environment.DIRECTORY_DOCUMENTS + "/GPS Map Camera/Backups");
                Uri uriInsert = bjVar.getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
                if (uriInsert != null) {
                    OutputStream outputStreamOpenOutputStream = bjVar.getContentResolver().openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.write(bArrEncrypt);
                            outputStreamOpenOutputStream.flush();
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                dq9.a(outputStreamOpenOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                    String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).toString() + "/GPS Map Camera/Backups" + strX;
                    file2 = new File(str);
                    absolutePath = str;
                } else {
                    file2 = file;
                }
            } else {
                File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).toString() + "/GPS Map Camera/Backups");
                if (!file4.exists()) {
                    file4.mkdirs();
                }
                File file5 = new File(file4, strX);
                FileOutputStream fileOutputStream = new FileOutputStream(file5);
                try {
                    fileOutputStream.write(bArrEncrypt);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    absolutePath = file5.getAbsolutePath();
                    absolutePath.getClass();
                    file2 = file5;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        dq9.a(fileOutputStream, th3);
                        throw th4;
                    }
                }
            }
            CPD.DismissDialog();
            Toast.makeText(bjVar, bjVar.getString(R.string.locations_exported_successfully_at, absolutePath), 1).show();
            return file2;
        } catch (Exception e2) {
            e = e2;
            file = file3;
        }
    }

    public final File exportNotesToCSV(bj bjVar, gc1 gc1Var) {
        bjVar.getClass();
        gc1Var.getClass();
        CPD.ShowDialog(bjVar);
        File file = new File(eo7.i(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).toString(), "/GPS Map Camera/Backups"));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, eo7.x("NotesBackup_", new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()), ".csv"));
        int i = 0;
        try {
            file2.createNewFile();
            FileWriter fileWriter = new FileWriter(file2);
            Cursor cursorRawQuery = gc1Var.getReadableDatabase().rawQuery("SELECT * FROM NoteAll", null);
            cursorRawQuery.getClass();
            String[] columnNames = cursorRawQuery.getColumnNames();
            columnNames.getClass();
            fileWriter.append((CharSequence) fp.s(columnNames, ",", null, 62));
            fileWriter.append((CharSequence) "\n");
            while (cursorRawQuery.moveToNext()) {
                fileWriter.append((CharSequence) hv0.B(mz8.f(0, cursorRawQuery.getColumnCount()), ",", null, null, 0, new n18(cursorRawQuery, i), 30));
                fileWriter.append((CharSequence) "\n");
            }
            cursorRawQuery.close();
            fileWriter.flush();
            fileWriter.close();
            CPD.DismissDialog();
            Toast.makeText(bjVar, bjVar.getString(R.string.notes_exported_successfully_at, file2.getAbsolutePath()), 0).show();
            return file2;
        } catch (Exception e) {
            CPD.DismissDialog();
            e.printStackTrace();
            Toast.makeText(bjVar, bjVar.getString(R.string.notes_export_failed), 0).show();
            return null;
        }
    }

    public final Bitmap generateMapQr(String str) {
        str.getClass();
        u40 u40VarF = new oq5(15).f(str, tz.a, 512, 512, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.RGB_565);
        for (int i = 0; i < 512; i++) {
            for (int i2 = 0; i2 < 512; i2++) {
                bitmapCreateBitmap.setPixel(i, i2, u40VarF.a(i, i2) ? -16777216 : -1);
            }
        }
        return bitmapCreateBitmap;
    }

    public final String getFlagEmojiFromLatLong(String str) {
        str.getClass();
        return countryCodeToFlagEmoji(str);
    }

    public final String getMapLink(double d, double d2) {
        return "https://maps.google.com/?q=" + d + "," + d2 + "&t=h&z=18";
    }

    public final void importLocationsFromCSV(bj bjVar, gc1 gc1Var, Uri uri, pj2 pj2Var) {
        bjVar.getClass();
        gc1Var.getClass();
        uri.getClass();
        pj2Var.getClass();
        try {
            CPD.ShowDialog(bjVar);
            InputStream inputStreamOpenInputStream = bjVar.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream));
                    try {
                        gc1Var.getWritableDatabase().beginTransaction();
                        boolean z = true;
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                gc1Var.getWritableDatabase().setTransactionSuccessful();
                                pj2Var.invoke(Boolean.TRUE);
                                gc1Var.getWritableDatabase().endTransaction();
                                bufferedReader.close();
                                CPD.DismissDialog();
                                Toast.makeText(bjVar, "Locations imported successfully", 0).show();
                                bufferedReader.close();
                                inputStreamOpenInputStream.close();
                                return;
                            }
                            if (z) {
                                z = false;
                            } else {
                                List listN = ej6.N(line, new String[]{","}, 0, 6);
                                if (listN.size() >= 11) {
                                    String string = ej6.Y((String) listN.get(1)).toString();
                                    if (string.length() != 0) {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("loc_title", (String) listN.get(1));
                                        contentValues.put("loc_latitude", (String) listN.get(2));
                                        contentValues.put("loc_longitude", (String) listN.get(3));
                                        contentValues.put("loc_line_1_address", (String) listN.get(4));
                                        contentValues.put("loc_line_2_city", (String) listN.get(5));
                                        contentValues.put("loc_line_3_state", (String) listN.get(6));
                                        contentValues.put("loc_line_4_country", (String) listN.get(7));
                                        contentValues.put("loc_line_5_pincode", (String) listN.get(8));
                                        if (Integer.parseInt((String) listN.get(9)) < 10) {
                                            contentValues.put("loc_radius", (Integer) 10);
                                        } else if (Integer.parseInt((String) listN.get(9)) > 1000) {
                                            contentValues.put("loc_radius", Integer.valueOf(PdfGraphics2D.AFM_DIVISOR));
                                        } else {
                                            contentValues.put("loc_radius", lj6.r((String) listN.get(9)));
                                        }
                                        contentValues.put("loc_timestamp", (String) listN.get(10));
                                        Cursor cursorRawQuery = gc1Var.getReadableDatabase().rawQuery("SELECT COUNT(*) FROM LocationAll WHERE loc_title = ?", new String[]{string});
                                        cursorRawQuery.getClass();
                                        boolean z2 = cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) > 0;
                                        cursorRawQuery.close();
                                        if (!z2) {
                                            gc1Var.getWritableDatabase().insert("LocationAll", null, contentValues);
                                        }
                                    }
                                }
                            }
                            try {
                                throw th;
                            } catch (Throwable th) {
                                dq9.a(inputStreamOpenInputStream, th);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            dq9.a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            CPD.DismissDialog();
            pj2Var.invoke(Boolean.FALSE);
            Toast.makeText(bjVar, "Locations import failed", 0).show();
        }
    }

    public final void importLocationsFromGMC(bj bjVar, gc1 gc1Var, Uri uri, pj2 pj2Var) {
        byte[] bArr;
        int i;
        String str;
        String str2;
        String str3 = "loc_line_5_pincode";
        String str4 = "loc_title";
        bjVar.getClass();
        gc1Var.getClass();
        uri.getClass();
        pj2Var.getClass();
        try {
            CPD.ShowDialog(bjVar);
            InputStream inputStreamOpenInputStream = bjVar.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    byte[] bArrC = hl9.c(inputStreamOpenInputStream);
                    inputStreamOpenInputStream.close();
                    bArr = bArrC;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dq9.a(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            } else {
                bArr = null;
            }
            if (bArr != null && bArr.length != 0) {
                CryptoUtils.DecryptResult decryptResultDecrypt = CryptoUtils.INSTANCE.decrypt(bArr);
                if (decryptResultDecrypt instanceof CryptoUtils.DecryptResult.InvalidFormat) {
                    CPD.DismissDialog();
                    pj2Var.invoke(Boolean.FALSE);
                    Toast.makeText(bjVar, bjVar.getString(R.string.select_gmc_file), 0).show();
                    return;
                }
                if (decryptResultDecrypt instanceof CryptoUtils.DecryptResult.TamperedOrCorrupted) {
                    CPD.DismissDialog();
                    pj2Var.invoke(Boolean.FALSE);
                    Toast.makeText(bjVar, bjVar.getString(R.string.tampered_backup_file), 1).show();
                    return;
                }
                if (!(decryptResultDecrypt instanceof CryptoUtils.DecryptResult.Success)) {
                    throw new rx0(7, (byte) 0);
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject(((CryptoUtils.DecryptResult.Success) decryptResultDecrypt).getData()).optJSONArray("locations");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                if (jSONArrayOptJSONArray.length() == 0) {
                    CPD.DismissDialog();
                    pj2Var.invoke(Boolean.FALSE);
                    Toast.makeText(bjVar, bjVar.getString(R.string.select_gmc_file), 0).show();
                    return;
                }
                gc1Var.getWritableDatabase().beginTransaction();
                try {
                    int length = jSONArrayOptJSONArray.length();
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = length;
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                        String strOptString = jSONObject.optString(str4, "");
                        strOptString.getClass();
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        String string = ej6.Y(strOptString).toString();
                        if (string.length() == 0) {
                            str2 = str3;
                            str = str4;
                            i = i2;
                        } else {
                            i = i2;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(str4, string);
                            str = str4;
                            contentValues.put("loc_latitude", jSONObject.optString("loc_latitude", ""));
                            contentValues.put("loc_longitude", jSONObject.optString("loc_longitude", ""));
                            contentValues.put("loc_line_1_address", jSONObject.optString("loc_line_1_address", ""));
                            contentValues.put("loc_line_2_city", jSONObject.optString("loc_line_2_city", ""));
                            contentValues.put("loc_line_3_state", jSONObject.optString("loc_line_3_state", ""));
                            contentValues.put("loc_line_4_country", jSONObject.optString("loc_line_4_country", ""));
                            contentValues.put(str3, jSONObject.optString(str3, ""));
                            int iOptInt = jSONObject.optInt("loc_radius", 50);
                            str2 = str3;
                            if (iOptInt < 10) {
                                contentValues.put("loc_radius", (Integer) 10);
                            } else if (iOptInt > 1000) {
                                contentValues.put("loc_radius", Integer.valueOf(PdfGraphics2D.AFM_DIVISOR));
                            } else {
                                contentValues.put("loc_radius", Integer.valueOf(iOptInt));
                            }
                            contentValues.put("loc_timestamp", jSONObject.optString("loc_timestamp", ""));
                            Cursor cursorRawQuery = gc1Var.getReadableDatabase().rawQuery("SELECT COUNT(*) FROM LocationAll WHERE loc_title = ?", new String[]{string});
                            cursorRawQuery.getClass();
                            boolean z = cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) > 0;
                            cursorRawQuery.close();
                            if (!z) {
                                gc1Var.getWritableDatabase().insert("LocationAll", null, contentValues);
                                i3++;
                            }
                            i2 = i + 1;
                            length = i4;
                            jSONArrayOptJSONArray = jSONArray;
                            str4 = str;
                            str3 = str2;
                        }
                        i2 = i + 1;
                        length = i4;
                        jSONArrayOptJSONArray = jSONArray;
                        str4 = str;
                        str3 = str2;
                    }
                    gc1Var.getWritableDatabase().setTransactionSuccessful();
                    gc1Var.getWritableDatabase().endTransaction();
                    CPD.DismissDialog();
                    if (i3 > 0) {
                        Toast.makeText(bjVar, bjVar.getString(R.string.locations_imported_successfully), 0).show();
                        pj2Var.invoke(Boolean.TRUE);
                        return;
                    } else {
                        Toast.makeText(bjVar, bjVar.getString(R.string.no_new_locations_imported), 0).show();
                        pj2Var.invoke(Boolean.TRUE);
                        return;
                    }
                } catch (Throwable th3) {
                    gc1Var.getWritableDatabase().endTransaction();
                    throw th3;
                }
            }
            CPD.DismissDialog();
            pj2Var.invoke(Boolean.FALSE);
            Toast.makeText(bjVar, bjVar.getString(R.string.select_gmc_file), 0).show();
        } catch (Exception e) {
            e.printStackTrace();
            CPD.DismissDialog();
            pj2Var.invoke(Boolean.FALSE);
            Toast.makeText(bjVar, bjVar.getString(R.string.locations_import_failed), 0).show();
        }
    }

    public final void importNotesFromCSV(bj bjVar, gc1 gc1Var, Uri uri, pj2 pj2Var) {
        bjVar.getClass();
        gc1Var.getClass();
        uri.getClass();
        pj2Var.getClass();
        try {
            InputStream inputStreamOpenInputStream = bjVar.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream));
                    try {
                        gc1Var.getWritableDatabase().beginTransaction();
                        boolean z = true;
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                gc1Var.getWritableDatabase().setTransactionSuccessful();
                                pj2Var.invoke(Boolean.TRUE);
                                gc1Var.getWritableDatabase().endTransaction();
                                bufferedReader.close();
                                Toast.makeText(bjVar, bjVar.getString(R.string.notes_imported_successfully), 0).show();
                                bufferedReader.close();
                                inputStreamOpenInputStream.close();
                                return;
                            }
                            if (z) {
                                z = false;
                            } else {
                                List listN = ej6.N(line, new String[]{","}, 0, 6);
                                if (listN.size() >= 3) {
                                    String strSubstring = ej6.Y((String) listN.get(1)).toString().length() > 34 ? ej6.Y((String) listN.get(1)).toString().substring(0, 34) : ej6.Y((String) listN.get(1)).toString();
                                    if (strSubstring.length() != 0) {
                                        String strSubstring2 = ej6.Y((String) listN.get(2)).toString().length() > 50 ? ej6.Y((String) listN.get(2)).toString().substring(0, 50) : ej6.Y((String) listN.get(2)).toString();
                                        if (strSubstring2.length() != 0) {
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put("title_name", strSubstring);
                                            contentValues.put("note_name", strSubstring2);
                                            Cursor cursorRawQuery = gc1Var.getReadableDatabase().rawQuery("SELECT COUNT(*) FROM NoteAll WHERE title_name = ? AND note_name = ?", new String[]{strSubstring, strSubstring2});
                                            cursorRawQuery.getClass();
                                            boolean z2 = cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) > 0;
                                            cursorRawQuery.close();
                                            if (!z2) {
                                                gc1Var.getWritableDatabase().insert("NoteAll", null, contentValues);
                                            }
                                        }
                                    }
                                }
                            }
                            try {
                                throw th;
                            } catch (Throwable th) {
                                dq9.a(inputStreamOpenInputStream, th);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            dq9.a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            CPD.DismissDialog();
            pj2Var.invoke(Boolean.FALSE);
            Toast.makeText(bjVar, bjVar.getString(R.string.notes_import_failed), 0).show();
        }
    }
}