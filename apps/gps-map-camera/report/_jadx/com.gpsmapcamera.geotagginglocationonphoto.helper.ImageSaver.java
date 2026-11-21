package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import android.provider.DocumentsContract;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.camera.core.internal.compat.quirk.Je.zXAusrmFrBIQHr;
import androidx.core.content.kG.GXMEboNuu;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.CameraActivity;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.xmp.properties.dd.YMHDd;
import defpackage.eo7;
import defpackage.f02;
import defpackage.f83;
import defpackage.lq1;
import defpackage.nh6;
import defpackage.ql2;
import defpackage.t92;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class ImageSaver {
    private static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    private static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    private static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    private static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    static File file;
    static Uri uri;
    private int DH;
    private int DW;
    boolean isTablet;
    HelperClass mHelperClass;
    SP mSP;
    TypedArray mWeatherIcon;
    CameraActivity main_activity;
    float scale;

    public ImageSaver(CameraActivity cameraActivity) {
        this.main_activity = cameraActivity;
        this.mSP = new SP(cameraActivity);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        cameraActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.DW = displayMetrics.heightPixels;
        this.DH = displayMetrics.widthPixels;
        this.scale = displayMetrics.scaledDensity;
        this.isTablet = HelperClass.isTablet(cameraActivity);
        this.mWeatherIcon = cameraActivity.getResources().obtainTypedArray(R.array.wI);
        this.mHelperClass = new HelperClass();
    }

    private static String getRealPathFromUri(Context context, Uri uri2) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (cursorQuery == null) {
                return null;
            }
            cursorQuery.close();
            return null;
        } catch (Exception e) {
            Log.e("TAG", "getRealPathExc: " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$storeImage$2(byte[] bArr, f83 f83Var, String str, Uri uri2) {
        if (uri2 != null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.main_activity.getContentResolver().openFileDescriptor(uri2, "rw");
                try {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        setExifFrompfd(bArr, parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), str);
                    } else {
                        setExifFromData(bArr, new File(str), str);
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                } catch (Throwable th) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                f83Var.h(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:117:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    public /* synthetic */ void lambda$storeImage$3(Bitmap bitmap, int i, nh6 nh6Var, final f83 f83Var, final byte[] bArr, ExecutorService executorService) throws Throwable {
        float f;
        Bitmap bitmap2;
        boolean z;
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        if (i == 2) {
            f = 0.75f;
        } else {
            f = i == 3 ? 0.5f : 1.0f;
        }
        boolean z2 = false;
        if (f >= 1.0f || bitmap == null) {
            bitmap2 = bitmap;
            z = false;
        } else {
            try {
                if (bitmap.isRecycled()) {
                    bitmap2 = bitmap;
                    z = false;
                } else {
                    int iRound = Math.round(bitmap.getWidth() * f);
                    int iRound2 = Math.round(bitmap.getHeight() * f);
                    if (iRound <= 0 || iRound2 <= 0) {
                        bitmap2 = bitmap;
                        z = false;
                    } else {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true);
                        z = bitmapCreateScaledBitmap != bitmap;
                        bitmap2 = bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bitmap2 = bitmap;
                try {
                    e.printStackTrace();
                    f83Var.h(e);
                    if (z2) {
                        bitmap2.recycle();
                    }
                    bitmap.recycle();
                    executorService.shutdownNow();
                } catch (Throwable th2) {
                    th = th2;
                    if (z2 && bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    bitmap.recycle();
                    executorService.shutdownNow();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap2 = bitmap;
                if (z2) {
                    bitmap2.recycle();
                }
                bitmap.recycle();
                executorService.shutdownNow();
                throw th;
            }
        }
        try {
            try {
                OutputStream outputStreamOpenOutputStream = null;
                if (nh6Var.a()) {
                    String strCreateMediaFilename = new FileNameUtils(this.main_activity).createMediaFilename(0, ".jpg");
                    String string = PreferenceManager.getDefaultSharedPreferences(this.main_activity).getString(PreferenceKeys.SaveLocationSAFPreferenceKey, "");
                    Uri uri2 = Uri.parse(string);
                    File file2 = new File(this.main_activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES), strCreateMediaFilename);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (string != null) {
                        ContentResolver contentResolver = this.main_activity.getContentResolver();
                        try {
                            contentResolver.takePersistableUriPermission(uri2, 3);
                        } catch (SecurityException e4) {
                            e4.printStackTrace();
                        }
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri2, DocumentsContract.getTreeDocumentId(uri2));
                        Uri uriCreateDocument = Uri.parse("");
                        try {
                            uriCreateDocument = DocumentsContract.createDocument(contentResolver, uriBuildDocumentUriUsingTree, "image/*", strCreateMediaFilename);
                            if (uriCreateDocument == null) {
                                uriCreateDocument = Uri.parse("");
                            }
                        } catch (FileNotFoundException e5) {
                            e5.printStackTrace();
                        }
                        f83Var.n("", String.valueOf(uriCreateDocument));
                        try {
                            fileInputStream = new FileInputStream(file2);
                        } catch (FileNotFoundException e6) {
                            e6.printStackTrace();
                            fileInputStream = null;
                        }
                        byte[] bArr2 = new byte[(int) file2.length()];
                        try {
                            fileInputStream.read(bArr2);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        try {
                            outputStreamOpenOutputStream = this.main_activity.getContentResolver().openOutputStream(uriCreateDocument);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                outputStreamOpenOutputStream.write(bArr2);
                                outputStreamOpenOutputStream.close();
                                try {
                                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.main_activity.getContentResolver().openFileDescriptor(uriCreateDocument, "rw");
                                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                        try {
                                            setExifFrompfd(bArr, parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), file2.getAbsolutePath());
                                        } catch (Throwable th4) {
                                            try {
                                                parcelFileDescriptorOpenFileDescriptor.close();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                    }
                                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                    }
                                } catch (Exception e9) {
                                    f83Var.h(e9);
                                    if (z && bitmap2 != null && !bitmap2.isRecycled()) {
                                        bitmap2.recycle();
                                    }
                                    bitmap.recycle();
                                    executorService.shutdownNow();
                                    return;
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            try {
                                outputStreamOpenOutputStream.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        System.gc();
                    }
                } else {
                    File file3 = new File(this.mSP.getString(this.main_activity, SP.FOLDER_PATH, Default.DEFAULT_FOLDER_PATH));
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    file = new File(file3, new FileNameUtils(this.main_activity).createMediaFilename(0, ".jpg"));
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    f83Var.n(file.getAbsolutePath(), "");
                    MediaScannerConnection.scanFile(this.main_activity, new String[]{file.toString()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: g83
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str, Uri uri3) {
                            this.a.lambda$storeImage$2(bArr, f83Var, str, uri3);
                        }
                    });
                }
                if (z && bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
            } catch (Exception e12) {
                e = e12;
                z2 = z;
                e.printStackTrace();
                f83Var.h(e);
                if (z2 && bitmap2 != null && !bitmap2.isRecycled()) {
                }
                bitmap.recycle();
                executorService.shutdownNow();
            }
            bitmap.recycle();
            executorService.shutdownNow();
        } catch (Throwable th6) {
            th = th6;
            z2 = z;
            if (z2) {
                bitmap2.recycle();
            }
            bitmap.recycle();
            executorService.shutdownNow();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$storePDFImage$0(String str, Uri uri2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$storePDFImage$1(nh6 nh6Var, Context context, String str, Bitmap bitmap, f83 f83Var, ExecutorService executorService) {
        FileInputStream fileInputStream;
        try {
            try {
                OutputStream outputStreamOpenOutputStream = null;
                if (nh6Var.a()) {
                    String string = PreferenceManager.getDefaultSharedPreferences(context).getString(PreferenceKeys.SaveLocationSAFPreferenceKey, "");
                    Uri uri2 = Uri.parse(string);
                    File file2 = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), str);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (string != null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        try {
                            contentResolver.takePersistableUriPermission(uri2, 3);
                        } catch (SecurityException e2) {
                            e2.printStackTrace();
                        }
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri2, DocumentsContract.getTreeDocumentId(uri2));
                        Uri uriCreateDocument = Uri.parse("");
                        try {
                            uriCreateDocument = DocumentsContract.createDocument(contentResolver, uriBuildDocumentUriUsingTree, "image/*", str);
                            if (uriCreateDocument == null) {
                                uriCreateDocument = Uri.parse("");
                            }
                        } catch (FileNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        f83Var.n("", String.valueOf(uriCreateDocument));
                        try {
                            fileInputStream = new FileInputStream(file2);
                        } catch (FileNotFoundException e4) {
                            e4.printStackTrace();
                            fileInputStream = null;
                        }
                        byte[] bArr = new byte[(int) file2.length()];
                        try {
                            fileInputStream.read(bArr);
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        try {
                            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriCreateDocument);
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                outputStreamOpenOutputStream.write(bArr);
                                outputStreamOpenOutputStream.close();
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                            try {
                                outputStreamOpenOutputStream.close();
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                        System.gc();
                    }
                } else {
                    File file3 = new File(new SP(context).getString(context, SP.FOLDER_PATH, Default.DEFAULT_FOLDER_PATH));
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    file = new File(file3, str);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    File file4 = file;
                    if (file4 != null) {
                        f83Var.n(file4.getAbsolutePath(), "");
                        MediaScannerConnection.scanFile(context, new String[]{file.toString()}, null, new t92(1));
                    }
                }
            } finally {
                bitmap.recycle();
                executorService.shutdownNow();
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public static Bitmap rotateAndScaleSticker(Bitmap bitmap, int i, int i2, int i3) {
        float[] fArr;
        int i4 = (360 - (((i3 % 360) + 360) % 360)) % 360;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f = i;
        float f2 = i2;
        float[] fArr2 = {ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, width, ColumnText.GLOBAL_SPACE_CHAR_RATIO, width, height, ColumnText.GLOBAL_SPACE_CHAR_RATIO, height};
        if (i4 == 90) {
            fArr = new float[]{f, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f, f2, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f2, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO};
        } else if (i4 == 180) {
            fArr = new float[]{f, f2, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f2, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f, ColumnText.GLOBAL_SPACE_CHAR_RATIO};
        } else {
            fArr = i4 == 270 ? new float[]{ColumnText.GLOBAL_SPACE_CHAR_RATIO, f2, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f, f2} : new float[]{ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f, f2, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f2};
        }
        float[] fArr3 = fArr;
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(fArr2, 0, fArr3, 0, 4);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(7);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        canvas.drawBitmap(bitmap, matrix, paint);
        return bitmapCreateBitmap;
    }

    private void setDateTimeExif(f02 f02Var) {
        String strD = f02Var.d("DateTime");
        if (strD != null) {
            f02Var.I(TAG_DATETIME_ORIGINAL, strD);
            f02Var.I(TAG_DATETIME_DIGITIZED, strD);
        }
    }

    private void setExif(f02 f02Var, f02 f02Var2, String str) {
        SP sp = new SP(this.main_activity);
        String string = sp.getString(this.main_activity, SP.LATITUDE, "");
        String string2 = sp.getString(this.main_activity, SP.LONGITUDE, "");
        String strD = f02Var.d("FNumber");
        String strD2 = f02Var.d("DateTime");
        String strD3 = f02Var.d("ExposureTime");
        String strD4 = f02Var.d("Flash");
        String str2 = YMHDd.wIdqKtHKl;
        String strD5 = f02Var.d(str2);
        String strD6 = f02Var.d("GPSAltitude");
        String strD7 = f02Var.d("GPSAltitudeRef");
        String strD8 = f02Var.d("GPSDateStamp");
        String strD9 = f02Var.d("GPSLatitude");
        String strD10 = f02Var.d("GPSLatitudeRef");
        String strD11 = f02Var.d("GPSLongitude");
        String strD12 = f02Var.d("GPSLongitudeRef");
        String strD13 = f02Var.d("GPSProcessingMethod");
        String strD14 = f02Var.d("GPSTimeStamp");
        String strD15 = f02Var.d("ISOSpeedRatings");
        String strD16 = f02Var.d("Make");
        String strD17 = f02Var.d("Model");
        String strD18 = f02Var.d("WhiteBalance");
        String strD19 = f02Var.d(TAG_DATETIME_DIGITIZED);
        String strD20 = f02Var.d("SubSecTime");
        String strD21 = f02Var.d("SubSecTimeDigitized");
        String strD22 = f02Var.d("SubSecTimeOriginal");
        String strD23 = f02Var.d("ApertureValue");
        String strD24 = f02Var.d("BrightnessValue");
        String strD25 = f02Var.d("CFAPattern");
        String strD26 = f02Var.d("ColorSpace");
        String strD27 = f02Var.d("ComponentsConfiguration");
        String strD28 = f02Var.d("CompressedBitsPerPixel");
        String strD29 = f02Var.d("Compression");
        String strD30 = f02Var.d("Contrast");
        String strD31 = f02Var.d(TAG_DATETIME_ORIGINAL);
        String strD32 = f02Var.d("DeviceSettingDescription");
        String strD33 = f02Var.d("DigitalZoomRatio");
        String strD34 = f02Var.d("ExposureBiasValue");
        String strD35 = f02Var.d("ExposureIndex");
        String strD36 = f02Var.d("ExposureMode");
        String strD37 = f02Var.d("ExposureProgram");
        String strD38 = f02Var.d("FlashEnergy");
        String strD39 = f02Var.d("FocalLengthIn35mmFilm");
        String strD40 = f02Var.d("FocalPlaneResolutionUnit");
        String strD41 = f02Var.d("FocalPlaneXResolution");
        String strD42 = f02Var.d("FocalPlaneYResolution");
        String strD43 = f02Var.d("GainControl");
        String str3 = zXAusrmFrBIQHr.fQQdZfQY;
        String strD44 = f02Var.d(str3);
        String strD45 = f02Var.d("GPSDifferential");
        String strD46 = f02Var.d("GPSDOP");
        String strD47 = f02Var.d("GPSMeasureMode");
        String strD48 = f02Var.d("ImageDescription");
        String strD49 = f02Var.d("LightSource");
        String strD50 = f02Var.d("MakerNote");
        String strD51 = f02Var.d("MaxApertureValue");
        String strD52 = f02Var.d("MeteringMode");
        String strD53 = f02Var.d("OECF");
        String strD54 = f02Var.d("PhotometricInterpretation");
        String strD55 = f02Var.d("Saturation");
        String strD56 = f02Var.d("SceneCaptureType");
        String strD57 = f02Var.d("SceneType");
        String strD58 = f02Var.d("SensingMethod");
        String strD59 = f02Var.d("Sharpness");
        String strD60 = f02Var.d("ShutterSpeedValue");
        String strD61 = f02Var.d("Software");
        String strD62 = f02Var.d("UserComment");
        if (strD != null) {
            f02Var2.I("FNumber", strD);
        }
        if (strD2 != null) {
            f02Var2.I("DateTime", strD2);
        }
        if (strD3 != null) {
            f02Var2.I("ExposureTime", strD3);
        }
        if (strD4 != null) {
            f02Var2.I("Flash", strD4);
        }
        if (strD5 != null) {
            f02Var2.I(str2, strD5);
        }
        if (strD6 != null) {
            f02Var2.I("GPSAltitude", strD6);
        }
        if (strD7 != null) {
            f02Var2.I("GPSAltitudeRef", strD7);
        }
        if (strD8 != null) {
            f02Var2.I("GPSDateStamp", strD8);
        }
        if (strD13 != null) {
            f02Var2.I("GPSProcessingMethod", strD13);
        }
        if (strD14 != null) {
            f02Var2.I("GPSTimeStamp", strD14);
        }
        if (strD15 != null) {
            f02Var2.I("ISOSpeedRatings", strD15);
        }
        if (strD16 != null) {
            f02Var2.I("Make", strD16);
        }
        if (strD17 != null) {
            f02Var2.I("Model", strD17.concat(" :: Captured by - GPS Map Camera"));
        }
        if (strD18 != null) {
            f02Var2.I("WhiteBalance", strD18);
        }
        if (string == null || string.isEmpty() || string2 == null || string2.isEmpty()) {
            if (strD9 != null && !strD9.equals("0/1,0/1,0/1")) {
                f02Var2.I("GPSLatitude", strD9);
            }
            if (strD10 != null && !strD10.isEmpty()) {
                f02Var2.I("GPSLatitudeRef", strD10);
            }
            if (strD11 != null && !strD11.equals("0/1,0/1,0/1")) {
                f02Var2.I("GPSLongitude", strD11);
            }
            if (strD12 != null && !strD12.isEmpty()) {
                f02Var2.I("GPSLongitudeRef", strD12);
            }
        } else {
            try {
                double d = Double.parseDouble(string);
                double d2 = Double.parseDouble(string2);
                if (d == 0.0d && d2 == 0.0d) {
                    f02Var2.I("GPSLatitude", ql2.a(d));
                    f02Var2.I("GPSLongitude", ql2.a(d2));
                    f02Var2.I("GPSLatitudeRef", d < 0.0d ? "S" : "N");
                    f02Var2.I("GPSLongitudeRef", d2 < 0.0d ? "W" : GXMEboNuu.aQGnrwK);
                } else {
                    f02Var2.J(d, d2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (strD19 != null) {
            f02Var2.I(TAG_DATETIME_DIGITIZED, strD19);
        }
        if (strD20 != null) {
            f02Var2.I("SubSecTime", strD20);
        }
        if (strD21 != null) {
            f02Var2.I("SubSecTimeDigitized", strD21);
        }
        if (strD22 != null) {
            f02Var2.I("SubSecTimeOriginal", strD22);
        }
        if (strD23 != null) {
            f02Var2.I("ApertureValue", strD23);
        }
        if (strD24 != null) {
            f02Var2.I("BrightnessValue", strD24);
        }
        if (strD25 != null) {
            f02Var2.I("CFAPattern", strD25);
        }
        if (strD26 != null) {
            f02Var2.I("ColorSpace", strD26);
        }
        if (strD27 != null) {
            f02Var2.I("ComponentsConfiguration", strD27);
        }
        if (strD28 != null) {
            f02Var2.I("CompressedBitsPerPixel", strD28);
        }
        if (strD29 != null) {
            f02Var2.I("Compression", strD29);
        }
        if (strD30 != null) {
            f02Var2.I("Contrast", strD30);
        }
        if (strD31 != null) {
            f02Var2.I(TAG_DATETIME_ORIGINAL, strD31);
        }
        if (strD32 != null) {
            f02Var2.I("DeviceSettingDescription", strD32);
        }
        if (strD33 != null) {
            f02Var2.I("DigitalZoomRatio", strD33);
        }
        if (strD34 != null) {
            f02Var2.I("ExposureBiasValue", strD34);
        }
        if (strD35 != null) {
            f02Var2.I("ExposureIndex", strD35);
        }
        if (strD36 != null) {
            f02Var2.I("ExposureMode", strD36);
        }
        if (strD37 != null) {
            f02Var2.I("ExposureProgram", strD37);
        }
        if (strD38 != null) {
            f02Var2.I("FlashEnergy", strD38);
        }
        if (strD39 != null) {
            f02Var2.I("FocalLengthIn35mmFilm", strD39);
        }
        if (strD40 != null) {
            f02Var2.I("FocalPlaneResolutionUnit", strD40);
        }
        if (strD41 != null) {
            f02Var2.I("FocalPlaneXResolution", strD41);
        }
        if (strD42 != null) {
            f02Var2.I("FocalPlaneYResolution", strD42);
        }
        if (strD43 != null) {
            f02Var2.I("GainControl", strD43);
        }
        if (strD44 != null) {
            f02Var2.I(str3, strD44);
        }
        if (strD45 != null) {
            f02Var2.I("GPSDifferential", strD45);
        }
        if (strD46 != null) {
            f02Var2.I("GPSDOP", strD46);
        }
        if (strD47 != null) {
            f02Var2.I("GPSMeasureMode", strD47);
        }
        if (strD48 != null) {
            f02Var2.I("ImageDescription", strD48);
        }
        if (strD49 != null) {
            f02Var2.I("LightSource", strD49);
        }
        if (strD50 != null) {
            f02Var2.I("MakerNote", strD50);
        }
        if (strD51 != null) {
            f02Var2.I("MaxApertureValue", strD51);
        }
        if (strD52 != null) {
            f02Var2.I("MeteringMode", strD52);
        }
        if (strD53 != null) {
            f02Var2.I("OECF", strD53);
        }
        if (strD54 != null) {
            f02Var2.I("PhotometricInterpretation", strD54);
        }
        if (strD55 != null) {
            f02Var2.I("Saturation", strD55);
        }
        if (strD56 != null) {
            f02Var2.I("SceneCaptureType", strD56);
        }
        if (strD57 != null) {
            f02Var2.I("SceneType", strD57);
        }
        if (strD58 != null) {
            f02Var2.I("SensingMethod", strD58);
        }
        if (strD59 != null) {
            f02Var2.I("Sharpness", strD59);
        }
        if (strD60 != null) {
            f02Var2.I("ShutterSpeedValue", strD60);
        }
        if (strD61 != null) {
            f02Var2.I("Software", strD61);
        }
        if (strD62 != null) {
            f02Var2.I("UserComment", strD62);
        }
        setDateTimeExif(f02Var2);
        f02Var2.E();
        try {
            new File(str).setLastModified(HelperClass.date.getTime());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String storePDFImage(Bitmap bitmap, Context context, f83 f83Var) {
        nh6 nh6Var = new nh6(context);
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString() + "/GMC_Reporting");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        file = null;
        uri = null;
        String strX = eo7.x("GPS_Map_Camera_Report_", new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()), ".jpg");
        file = new File(file2, strX);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new lq1(nh6Var, context, strX, bitmap, f83Var, executorServiceNewSingleThreadExecutor, 1));
        return file.getAbsolutePath();
    }

    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v26 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v27 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v31 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v32 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public android.graphics.Bitmap capturedStampBitmap(android.graphics.Bitmap r30, android.graphics.Bitmap r31, int r32, android.graphics.Bitmap r33, android.graphics.Bitmap r34, int r35, int r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gpsmapcamera.geotagginglocationonphoto.helper.ImageSaver.capturedStampBitmap(android.graphics.Bitmap, android.graphics.Bitmap, int, android.graphics.Bitmap, android.graphics.Bitmap, int, int, int, int, int):android.graphics.Bitmap");
    }

    public String getSaveLocation(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PreferenceKeys.SaveLocationPreferenceKey, "OpenCamera");
    }

    public void setExifFromData(byte[] bArr, File file2, String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            try {
                setExif(new f02(byteArrayInputStream2), new f02(file2.getAbsolutePath()), str);
                byteArrayInputStream2.close();
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void setExifFrompfd(byte[] bArr, FileDescriptor fileDescriptor, String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            try {
                setExif(new f02(byteArrayInputStream2), new f02(fileDescriptor), str);
                byteArrayInputStream2.close();
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void storeImage(final byte[] bArr, final int i, final Bitmap bitmap, final f83 f83Var) {
        final nh6 nh6Var = new nh6(this.main_activity);
        file = null;
        uri = null;
        final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: h83
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.a.lambda$storeImage$3(bitmap, i, nh6Var, f83Var, bArr, executorServiceNewSingleThreadExecutor);
            }
        });
    }
}