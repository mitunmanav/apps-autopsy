package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.RWg.fuEBEyZ;
import androidx.camera.view.internal.compat.quirk.vQMJ.vlsa;
import androidx.core.content.FileProvider;
import androidx.core.content.kG.ctcdTNpUjlfYHm;
import com.androidmodule.camerax.views.BA.GBTljJJcQz;
import com.facebook.login.ITY.XIBrjfXRiD;
import com.facebook.share.Hueb.CvmpVJvatR;
import com.google.android.gms.ads.mediation.rvI.zUHsDp;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.DocWriter;
import com.itextpdf.text.html.HtmlTags;
import com.itextpdf.text.pdf.BidiOrder;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.events.le.bqcsmGRRmsYO;
import com.itextpdf.text.pdf.parser.HriA.jumTrYZsYnyZCd;
import com.tiktok.appevents.base.AVQ.idmhT;
import defpackage.a50;
import defpackage.b30;
import defpackage.c30;
import defpackage.cc6;
import defpackage.cs5;
import defpackage.dt7;
import defpackage.eo7;
import defpackage.f99;
import defpackage.fea;
import defpackage.fq1;
import defpackage.fs5;
import defpackage.fs7;
import defpackage.gc1;
import defpackage.gi5;
import defpackage.h74;
import defpackage.jw1;
import defpackage.kp2;
import defpackage.l36;
import defpackage.la9;
import defpackage.ld0;
import defpackage.ls5;
import defpackage.mg;
import defpackage.mq7;
import defpackage.oj9;
import defpackage.p;
import defpackage.pc;
import defpackage.pr5;
import defpackage.qc;
import defpackage.st2;
import defpackage.v60;
import defpackage.w40;
import defpackage.xa1;
import defpackage.xp6;
import defpackage.ya;
import defpackage.yc;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class HelperClass {
    public static final String CAM_SET_OPEN_TIME = "CAM_SET_OPEN_TIME";
    public static String COUNTADS = "counts_ads";
    public static final int DECIMAL = 0;
    public static final int DEC_DEGS = 1;
    public static final int DEC_DEGS_MICRO = 2;
    public static final int DEC_MIN = 3;
    public static final int DEC_MIN_SEC = 5;
    public static final int DEG_MIN_SEC = 4;
    public static final String EVENT_3RD_DAY = "EVENT_3RD_DAY";
    public static final String FILE_NAME_OPEN_TIME = "FILE_NAME_OPEN_TIME";
    public static final String FIRST_TIME_OPEN_DATE = "FIRST_TIME_OPEN_DATE";
    public static final String FOLDER_OPEN_TIME = "FOLDER_OPEN_TIME";
    public static final String FONT_STYLE_OPEN_TIME = "FONT_STYLE_OPEN_TIME";
    public static int GalleryAdCount = 2;
    public static String IS_FROM_NOTIFICATION = "isfromnotification";
    public static String IS_FROM_NOTIFICATION_MESSAGE = "isfromnotificationmessage";
    public static String IS_FROM_NOTIFICATION_type = "isfromnotificationtype";
    public static String IS_PURCHESH_OR_NOT = "isPurcheshOrNot";
    public static String IS_SUBSCRIBE = "IS_SUBSCRIBE";
    public static String IS_USE_ALL_FUNCTION = "is_use_all_function";
    public static String KEY_COUNT = "appCount";
    public static final String MAP_DATA_OPEN_TIME = "MAP_DATA_OPEN_TIME";
    public static final int MGRS_USNG = 7;
    public static final String PURCHASE_3_TIME_CLICK = "PURCHASE_3_TIME_CLICK";
    public static final String PURCHASE_3_TIME_CLICK_STAN = "PURCHASE_3_TIME_CLICK_STAN";
    public static final String PURCHASE_3_TIME_SHOWN = "PURCHASE_3_TIME_SHOWN";
    public static final String PURCHASE_3_TIME_SHOWN_STAN = "PURCHASE_3_TIME_SHOWN_STAN";
    public static String RATE = "rate";
    public static String SETTING_COUNTADS = "counts_ads";
    public static String SHARE = "share";
    public static String SPLASH_SCREEN_AD = "splashscreenad";
    public static String SPLASH_SCREEN_AD_TYPE = "splashscreenadtype";
    public static final String STAMP_POS_OPEN_TIME = "STAMP_POS_OPEN_TIME";
    public static final String TEMPLT_OPEN_TIME = "TEMPLT_OPEN_TIME";
    public static final String TOTAL_PHOTO_CAPTURE = "TOTAL_PHOTO_CAPTURE";
    public static final String TOTAL_PHOTO_CAPTURE_FORINAPPREVIEW = "TOTAL_PHOTO_CAPTURE_FORINAPPREVIEW";
    public static final String TOTAL_TIME_APP_OPEN = "TOTAL_TIME_APP_OPEN";
    public static final int UTM = 6;
    public static Calendar calendar = null;
    public static Bitmap centrebitmap = null;
    public static Bitmap centrebitmap_yellow = null;
    public static Date date = null;
    public static int mbackground_edit = -1;
    public static Typeface mfontedit;
    public static List<gi5> purchaseHistory;
    private static ImageView rate_main;
    static Typeface tf;
    private static TextView txt_rate_title;
    private static int val;
    public static ArrayList<String> f = new ArrayList<>();
    public static int FONTPOSITION = 3;
    public static boolean isAutomatic = true;
    public static final Map<String, Typeface> fontCache = new HashMap();
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public interface FontCallback {
        void onFontReady(Typeface typeface);
    }

    public static String addExtention(String str) {
        String strConcat;
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        String[] strArrSplit = str.split(HtmlTags.TH);
        String str2 = new SimpleDateFormat(strArrSplit[0], Locale.getDefault()).format(date);
        char cCharAt = str2.charAt(str2.length() - 1);
        if (str2.substring(str2.length() - 2).equalsIgnoreCase("13") || str2.equalsIgnoreCase("13") || str2.substring(str2.length() - 2).equalsIgnoreCase("12") || str2.equalsIgnoreCase("12") || str2.substring(str2.length() - 2).equalsIgnoreCase("11") || str2.equalsIgnoreCase("11")) {
            strConcat = str2.concat(HtmlTags.TH);
        } else if (cCharAt == '1') {
            strConcat = str2.concat("st");
        } else if (cCharAt == '2') {
            strConcat = str2.concat("nd");
        } else {
            strConcat = cCharAt == '3' ? str2.concat("rd") : str2.concat(HtmlTags.TH);
        }
        if (strArrSplit.length == 1) {
            new SimpleDateFormat(strArrSplit[0], Locale.getDefault());
            return strConcat;
        }
        return strConcat + new SimpleDateFormat(strArrSplit[1], Locale.getDefault()).format(date);
    }

    public static boolean checkCameraPermission(Context context) {
        return la9.a(context, "android.permission.CAMERA") == 0;
    }

    public static boolean checkLocationPermission(Context context) {
        boolean z = la9.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        if (la9.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return false;
        }
        return z;
    }

    public static boolean checkMicrophonePermission(Context context) {
        return la9.a(context, "android.permission.RECORD_AUDIO") == 0;
    }

    public static boolean checkStoragePermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i >= 34) {
            if (la9.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0) {
                z = la9.a(context, "android.permission.READ_MEDIA_IMAGES") == 0;
                if (la9.a(context, "android.permission.READ_MEDIA_VIDEO") != 0) {
                    return false;
                }
            }
            return z;
        }
        if (i > 32) {
            z = la9.a(context, "android.permission.READ_MEDIA_IMAGES") == 0;
            if (la9.a(context, "android.permission.READ_MEDIA_VIDEO") != 0) {
                return false;
            }
            return z;
        }
        z = la9.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        if (la9.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return z;
    }

    private static void chngeVal() {
    }

    public static Bitmap convertDrawableToImage(Context context, int i) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        return Bitmap.createScaledBitmap(bitmapDecodeResource, (int) (((double) bitmapDecodeResource.getWidth()) * 0.75d), (int) (((double) bitmapDecodeResource.getHeight()) * 0.75d), true);
    }

    public static double convertToDecimal(String str, String str2) {
        if (str == null) {
            return 0.0d;
        }
        String[] strArrSplit = str.split(",");
        double fraction = (parseFraction(strArrSplit[2]) / 3600.0d) + (parseFraction(strArrSplit[1]) / 60.0d) + parseFraction(strArrSplit[0]);
        return (jumTrYZsYnyZCd.dDYRDKApJyB.equalsIgnoreCase(str2) || "W".equalsIgnoreCase(str2)) ? fraction * (-1.0d) : fraction;
    }

    public static Bitmap decodeBase64(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static int dpToPx(Context context, int i) {
        return Math.round((context.getResources().getDisplayMetrics().xdpi / 160.0f) * i);
    }

    public static int dpToPxFloat(Context context, float f2) {
        return Math.round((context.getResources().getDisplayMetrics().xdpi / 160.0f) * f2);
    }

    public static Bitmap drawableToBitmap(Drawable drawable, Context context) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return isTablet(context) ? Bitmap.createScaledBitmap(bitmapCreateBitmap, (int) (((double) bitmapCreateBitmap.getWidth()) * 1.8d), (int) (((double) bitmapCreateBitmap.getHeight()) * 1.8d), true) : bitmapCreateBitmap;
    }

    public static Bitmap drawableToBitmapCapture(Drawable drawable, Context context, int i, int i2) {
        try {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    return bitmapDrawable.getBitmap();
                }
            }
            Bitmap bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i2, true);
        } catch (Exception unused) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
                if (bitmapDrawable2.getBitmap() != null) {
                    return bitmapDrawable2.getBitmap();
                }
            }
            Bitmap bitmapCreateBitmap2 = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            return Bitmap.createScaledBitmap(bitmapCreateBitmap2, i, i2, true);
        }
    }

    public static String encodeTobase64(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 60, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static void generateBitmap(int i, Context context, final a50 a50Var) {
        pr5 pr5VarK = com.bumptech.glide.a.e(context).k();
        pr5VarK.z(pr5VarK.I(Integer.valueOf(i))).a(new ls5().j(dpToPx(context, 28), dpToPx(context, 28))).F(new cs5() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass.3
            @Override // defpackage.cs5
            public boolean onLoadFailed(kp2 kp2Var, Object obj, xp6 xp6Var, boolean z) {
                a50Var.b();
                return false;
            }

            @Override // defpackage.cs5
            public boolean onResourceReady(Bitmap bitmap, Object obj, xp6 xp6Var, xa1 xa1Var, boolean z) {
                a50Var.a(bitmap);
                return true;
            }
        }).J();
    }

    public static String getAccuracy(Context context, int i) {
        double d = new SP(context).getFloat(context, SP.ACCURACY_VALUE);
        if (i == 0) {
            return new DecimalFormat("##.##").format(d) + " m";
        }
        if (i != 1) {
            return "";
        }
        double d2 = d * 39.370078d;
        return (((int) (d2 - ((double) (((int) (d2 / 63360.0d)) * 63360)))) / 12) + " ft";
    }

    public static String getAltitudeconvert(Context context, int i) {
        double d = new SP(context).getFloat(context, SP.ALTITUDE_VALUE);
        if (i == 0) {
            return new DecimalFormat("##.##").format(d) + " m";
        }
        if (i != 1) {
            return "";
        }
        double d2 = d * 39.370078d;
        return (((int) (d2 - ((double) (((int) (d2 / 63360.0d)) * 63360)))) / 12) + " ft";
    }

    public static String getAqiValueText(Context context, String str) {
        String strX;
        int integer = new SP(context).getInteger(context, SP.AQI_VALUE, 1);
        if (integer == 1) {
            strX = eo7.x("AQI: 🟢 ", str, " (Good)");
        } else if (integer == 2) {
            strX = eo7.x("AQI: 🟡 ", str, " (Moderate)");
        } else if (integer == 3) {
            strX = eo7.x("AQI: 🟠 ", str, " (Unhealthy [Sensitive])");
        } else if (integer == 4) {
            strX = eo7.x("AQI: 🔴 ", str, " (Unhealthy)");
        } else {
            strX = integer == 5 ? eo7.x("AQI: 🟣 ", str, " (Hazardous)") : eo7.x("AQI: 🟤 ", str, " (Very Hazardous)");
        }
        return str.equals("-") ? "-" : strX;
    }

    public static String getCelcius(float f2) {
        return "" + f2 + "° C";
    }

    public static String getDateTimeDt(Context context, String str) {
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        if (str.contains(" MMM ")) {
            str = str.replace("MMM", "MMMM");
        }
        Locale locale = getLocale(context);
        String str2 = new SimpleDateFormat(str, locale).format(date);
        return (locale.getLanguage().equals("hi") || locale.getLanguage().equals("es")) ? str2.replace("am", "AM").replace("pm", "PM") : str2;
    }

    public static String getDateTimeDt(Context context, String str, boolean z) {
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        if (str.contains(" MMM ")) {
            str = str.replace("MMM", "MMMM");
        }
        if (z) {
            str = str.equals(Default.DEFAULT_TIME_FORMAT_DT) ? "hh:mm:ss a" : "HH:mm:ss";
        }
        if (str.equals("hh:mm")) {
            str = "HH:mm";
        }
        Locale locale = getLocale(context);
        String str2 = new SimpleDateFormat(str, locale).format(date);
        return (locale.getLanguage().equals("hi") || locale.getLanguage().equals("es")) ? str2.replace("am", "AM").replace("pm", "PM") : str2;
    }

    public static String getDayDt(Context context) {
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        return new SimpleDateFormat("EEEE", getLocale(context)).format(date);
    }

    public static String getFahrenheit(float f2) {
        return eo7.h("", ((Math.round(f2) * 9) / 5) + 32, "° F");
    }

    public static Typeface getFontStyle(Context context, String str) {
        File file = new File(context.getFilesDir(), eo7.w("font/", str));
        if (!file.exists()) {
            return Typeface.createFromAsset(context.getResources().getAssets(), str);
        }
        try {
            return Typeface.createFromFile(file);
        } catch (Exception unused) {
            return Typeface.createFromAsset(context.getResources().getAssets(), Default.DEFAULT_FONT_STYLE);
        }
    }

    public static void getFontStyleAsync(Context context, String str, FontCallback fontCallback) {
        Map<String, Typeface> map = fontCache;
        if (map.containsKey(str)) {
            fontCallback.onFontReady(map.get(str));
        } else {
            new Thread(new p(26, context, str, fontCallback)).start();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Locale getLocale(Context context) {
        String string = new SP(context).getString(context, SP.SELECTED_LANGUAGE, Default.LANGUAGE);
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -2133431923:
                if (string.equals("bahasa Indonesia (Indonesian)")) {
                    b = 0;
                }
                break;
            case -2052276004:
                if (string.equals("मराठी")) {
                    b = 1;
                }
                break;
            case -2013094062:
                if (string.equals("Española")) {
                    b = 2;
                }
                break;
            case -1931612036:
                if (string.equals("বাংলা")) {
                    b = 3;
                }
                break;
            case -1893112662:
                if (string.equals("Français (French)")) {
                    b = 4;
                }
                break;
            case -1848502141:
                if (string.equals("Bahasa Melayu")) {
                    b = 5;
                }
                break;
            case -1624082021:
                if (string.equals("मराठी (Marathi)")) {
                    b = 6;
                }
                break;
            case -1603099204:
                if (string.equals("தமிழ் (Tamil)")) {
                    b = 7;
                }
                break;
            case -1575530339:
                if (string.equals("Français")) {
                    b = 8;
                }
                break;
            case -1450814002:
                if (string.equals("தமிழ்")) {
                    b = 9;
                }
                break;
            case -1303615932:
                if (string.equals("Bahasa Melayu (Malay)")) {
                    b = 10;
                }
                break;
            case -1220530445:
                if (string.equals("ಕನ್ನಡ")) {
                    b = BidiOrder.AN;
                }
                break;
            case -1185086888:
                if (string.equals("Русский")) {
                    b = BidiOrder.CS;
                }
                break;
            case -1155591125:
                if (string.equals("Português")) {
                    b = BidiOrder.NSM;
                }
                break;
            case -1150224476:
                if (string.equals("हिन्दी (Hindi)")) {
                    b = BidiOrder.BN;
                }
                break;
            case -1071093480:
                if (string.equals("Deutsch")) {
                    b = BidiOrder.B;
                }
                break;
            case -745208288:
                if (string.equals("Italiano (Italian)")) {
                    b = BidiOrder.S;
                }
                break;
            case -601245009:
                if (string.equals("Española (Spanish)")) {
                    b = BidiOrder.WS;
                }
                break;
            case -98589738:
                if (string.equals("ไทย (Thai)")) {
                    b = 18;
                }
                break;
            case 917436:
                if (string.equals("漢語")) {
                    b = 19;
                }
                break;
            case 3625007:
                if (string.equals("ไทย")) {
                    b = 20;
                }
                break;
            case 53917191:
                if (string.equals("한국인")) {
                    b = 21;
                }
                break;
            case 60895824:
                if (string.equals(Default.LANGUAGE)) {
                    b = 22;
                }
                break;
            case 75053372:
                if (string.equals("ಕನ್ನಡ (Kannada)")) {
                    b = 23;
                }
                break;
            case 361404451:
                if (string.equals("Deutsch (German)")) {
                    b = 24;
                }
                break;
            case 621291606:
                if (string.equals("한국인 (Korean)")) {
                    b = 25;
                }
                break;
            case 644988668:
                if (string.equals("ગુજરાતી")) {
                    b = 26;
                }
                break;
            case 1127340175:
                if (string.equals("Italiano")) {
                    b = 27;
                }
                break;
            case 1132116197:
                if (string.equals("हिन्दी")) {
                    b = 28;
                }
                break;
            case 1188248865:
                if (string.equals("Português (Portuguese)")) {
                    b = 29;
                }
                break;
            case 1211661130:
                if (string.equals("bahasa Indonesia")) {
                    b = 30;
                }
                break;
            case 1225600157:
                if (string.equals("Tiếng Việt")) {
                    b = 31;
                }
                break;
            case 1394341750:
                if (string.equals("Русский (Russian)")) {
                    b = DocWriter.SPACE;
                }
                break;
            case 1418684864:
                if (string.equals("漢語 (Chinese)")) {
                    b = 33;
                }
                break;
            case 1786799653:
                if (string.equals("Tiếng Việt (Vietnamese)")) {
                    b = DocWriter.QUOTE;
                }
                break;
            case 2026735772:
                if (string.equals("ગુજરાતી (Gujarati)")) {
                    b = 35;
                }
                break;
            case 2135504683:
                if (string.equals("বাংলা (Bengali)")) {
                    b = 36;
                }
                break;
        }
        String str = "en";
        switch (b) {
            case 0:
            case 30:
                str = "in";
                break;
            case 1:
            case 6:
                str = "mr";
                break;
            case 2:
            case 17:
                str = "es";
                break;
            case 3:
            case 36:
                str = "bn";
                break;
            case 4:
            case 8:
                str = "fr";
                break;
            case 5:
            case 10:
                str = "ms";
                break;
            case 7:
            case 9:
                str = "ta";
                break;
            case 11:
            case 23:
                str = "kn";
                break;
            case 12:
            case 32:
                str = "ru";
                break;
            case 13:
            case 29:
                str = "pt";
                break;
            case 14:
            case 28:
                str = "hi";
                break;
            case 15:
            case 24:
                str = "de";
                break;
            case 16:
            case 27:
                str = "it";
                break;
            case 18:
            case 20:
                str = HtmlTags.TH;
                break;
            case 19:
            case 33:
                str = "zh";
                break;
            case 21:
            case 25:
                str = "ko";
                break;
            case 26:
            case 35:
                str = "gu";
                break;
            case 31:
            case 34:
                str = "vi";
                break;
        }
        return new Locale(str);
    }

    private static String getPluscode(SP sp, Context context, String str) {
        String string = sp.getString(context, SP.PLUS_CODE, "");
        if (string.isEmpty()) {
            return "-";
        }
        return str.equals(Default.PLUSCODE_TYPE) ? string : string.substring(4);
    }

    public static String getSoundLevel(Context context) {
        return new DecimalFormat("##.##").format(new SP(context).getFloat(context, SP.SOUND_LEVEL)) + " dB";
    }

    public static String getTemperature(String str, float f2) {
        return str.equals("Celsius") ? getCelcius(f2) : getFahrenheit(f2);
    }

    private static int getThemeColor(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static String getTimezone(int i) {
        String displayName = Calendar.getInstance().getTimeZone().getDisplayName(false, 1);
        Date time = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime();
        String str = new SimpleDateFormat("Z").format(time);
        String str2 = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(time);
        switch (i) {
            case 1:
                return str;
            case 2:
                return eo7.w("UTC ", str);
            case 3:
                return eo7.w("GMT ", str);
            case 4:
                return str2;
            case 5:
                return eo7.w("UTC ", str2);
            case 6:
                return eo7.w("GMT ", str2);
            case 7:
                return displayName;
            default:
                return "";
        }
    }

    public static String getpressureConvert(Context context, int i) {
        double d = new SP(context).getFloat(context, SP.PRESSURE_VALUE);
        if (i == 0) {
            return new DecimalFormat("##.##").format(d) + " hpa";
        }
        if (i == 1) {
            return new DecimalFormat("##.##").format(d * 0.75d) + " mmhg";
        }
        if (i != 2) {
            return "";
        }
        return new DecimalFormat("##.##").format(d * 0.03d) + ctcdTNpUjlfYHm.JnOGuOJ;
    }

    public static String getwindConvert(Context context, int i) {
        double d = new SP(context).getFloat(context, SP.WIND_VALUE);
        if (i == 0) {
            return new DecimalFormat("##.##").format(d * 3.6d) + " km/h";
        }
        if (i == 1) {
            return new DecimalFormat("##.##").format(d * 2.23694d) + " mph";
        }
        if (i == 2) {
            return new DecimalFormat("##.##").format(d) + " m/s";
        }
        if (i != 3) {
            return "";
        }
        return new DecimalFormat("##.##").format(d * 1.94384d) + " kt";
    }

    public static void hideSoftKeyboard(Activity activity, View view) {
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean isActivityValid(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static boolean isDarkTheme(Activity activity) {
        return isDarkTheme((Context) activity);
    }

    public static boolean isDarkTheme(Context context) {
        if (context == null) {
            return false;
        }
        String strK = st2.k(context, context, SP.APP_THEME, Default.LIGHT);
        if (strK.equalsIgnoreCase(Default.DARK)) {
            return true;
        }
        return strK.equalsIgnoreCase(Default.DEFAULT) && (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean isDefaultAdvance(Context context) {
        SP sp = new SP(context);
        int color = Color.parseColor("#9c000000");
        int integer = sp.getInteger(context, SP.BACKGROUND_COLOR, color);
        int integer2 = sp.getInteger(context, SP.ADDRESS_COLOR, -1);
        int integer3 = sp.getInteger(context, SP.SHORT_ADDRESS_COLOR, -1);
        int integer4 = sp.getInteger(context, SP.DATE_TIME_COLOR, -1);
        int integer5 = sp.getInteger(context, SP.LAT_LNG_COLOR, -1);
        int integer6 = sp.getInteger(context, SP.TIMEZONE, 6);
        int integer7 = sp.getInteger(context, CvmpVJvatR.ItMjqwGn, 78);
        boolean z = sp.getBoolean(context, SP.IS_MAP, true);
        boolean z2 = sp.getBoolean(context, SP.IS_COUNTRY_FLAG, true);
        int integer8 = sp.getInteger(context, SP.MAP_POS_TYPE, 0);
        boolean z3 = sp.getBoolean(context, SP.IS_ADDRESS, true);
        boolean z4 = sp.getBoolean(context, SP.IS_ADDRESS_CITY, true);
        boolean z5 = sp.getBoolean(context, SP.IS_ADDRESS_STATE, true);
        boolean z6 = sp.getBoolean(context, SP.IS_ADDRESS_COUNTRY, true);
        boolean z7 = sp.getBoolean(context, SP.IS_ADDRESS_PINCODE, true);
        boolean z8 = sp.getBoolean(context, SP.IS_PLUS_CODE, false);
        boolean z9 = sp.getBoolean(context, SP.IS_WEATHER, false);
        boolean z10 = sp.getBoolean(context, SP.IS_DATE_TIME, true);
        boolean z11 = sp.getBoolean(context, SP.IS_TIMEZONE, true);
        boolean z12 = sp.getBoolean(context, SP.IS_NUMBERING, false);
        boolean z13 = sp.getBoolean(context, SP.IS_PERSON_NAME, false);
        boolean z14 = sp.getBoolean(context, SP.IS_CONTACT_NUMBER, false);
        boolean z15 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD, false);
        boolean z16 = sp.getBoolean(context, SP.IS_COMPASS, false);
        boolean z17 = sp.getBoolean(context, SP.IS_WIND, false);
        boolean z18 = sp.getBoolean(context, SP.IS_LOGO, false);
        boolean z19 = sp.getBoolean(context, SP.IS_NOTES, true);
        boolean z20 = sp.getBoolean(context, SP.IS_PRESSURE, false);
        boolean z21 = sp.getBoolean(context, SP.IS_HUMIDITY, false);
        boolean z22 = sp.getBoolean(context, SP.IS_ALTITUDE, false);
        boolean z23 = sp.getBoolean(context, SP.IS_ACCURACY, false);
        boolean z24 = sp.getBoolean(context, SP.IS_SOUNDLEVEL, false);
        String string = sp.getString(context, SP.STAMP_FONT_STYLE, Default.DEFAULT_FONT_STYLE);
        String str = CvmpVJvatR.AzktSVCpmn;
        String string2 = sp.getString(context, SP.DATE_FORMAT, str);
        return z && sp.getString(context, SP.MAP_TYPE_TEMPLATE, Default.SETELLITE_2).equals(Default.SETELLITE_2) && z3 && z4 && z5 && z6 && z7 && z2 && z10 && string2.equals(str) && z11 && integer6 == 6 && string.equals(Default.DEFAULT_FONT_STYLE) && sp.getString(context, SP.STAMP_SIZE, Default.TEMPLATE_SIZE).equals(Default.TEMPLATE_SIZE) && sp.getString(context, SP.STAMP_POS, "Bottom").equals("Bottom") && integer8 == 0 && integer7 == 78 && integer3 == -1 && integer2 == -1 && integer5 == -1 && integer4 == -1 && !z8 && !z12 && !z19 && !z13 && !z14 && !z9 && !z16 && !z15 && !z17 && !z21 && !z20 && !z22 && !z23 && !z24 && !z18 && integer == color;
    }

    public static boolean isDefaultClassic(Context context) {
        SP sp = new SP(context);
        int color = Color.parseColor("#9c000000");
        int integer = sp.getInteger(context, SP.BACKGROUND_COLOR_CLASSIC, color);
        int integer2 = sp.getInteger(context, SP.ADDRESS_COLOR_CLASSIC, -1);
        int integer3 = sp.getInteger(context, SP.SHORT_ADDRESS_COLOR_CLASSIC, -1);
        int integer4 = sp.getInteger(context, SP.DATE_TIME_COLOR_CLASSIC, -1);
        int integer5 = sp.getInteger(context, SP.LAT_LNG_COLOR_CLASSIC, -1);
        int integer6 = sp.getInteger(context, SP.TIMEZONE_CLASSIC, 6);
        int integer7 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_CLASSIC, 78);
        boolean z = sp.getBoolean(context, SP.IS_MAP_CLASSIC, true);
        boolean z2 = sp.getBoolean(context, SP.IS_COUNTRY_FLAG_CLASSIC, true);
        int integer8 = sp.getInteger(context, SP.MAP_POS_TYPE_CLASSIC, 0);
        boolean z3 = sp.getBoolean(context, SP.IS_ADDRESS_CLASSIC, true);
        boolean z4 = sp.getBoolean(context, SP.IS_ADDRESS_CITY_CLASSIC, true);
        boolean z5 = sp.getBoolean(context, SP.IS_ADDRESS_STATE_CLASSIC, true);
        boolean z6 = sp.getBoolean(context, SP.IS_ADDRESS_COUNTRY_CLASSIC, true);
        boolean z7 = sp.getBoolean(context, SP.IS_ADDRESS_PINCODE_CLASSIC, true);
        boolean z8 = sp.getBoolean(context, SP.IS_PLUS_CODE_CLASSIC, false);
        boolean z9 = sp.getBoolean(context, SP.IS_WEATHER_CLASSIC, false);
        boolean z10 = sp.getBoolean(context, SP.IS_DATE_TIME_CLASSIC, true);
        boolean z11 = sp.getBoolean(context, SP.IS_TIMEZONE_CLASSIC, true);
        boolean z12 = sp.getBoolean(context, SP.IS_NUMBERING_CLASSIC, false);
        boolean z13 = sp.getBoolean(context, SP.IS_PERSON_NAME_CLASSIC, false);
        boolean z14 = sp.getBoolean(context, SP.IS_CONTACT_NUMBER_CLASSIC, false);
        boolean z15 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD_CLASSIC, false);
        boolean z16 = sp.getBoolean(context, SP.IS_COMPASS_CLASSIC, false);
        boolean z17 = sp.getBoolean(context, SP.IS_WIND_CLASSIC, false);
        boolean z18 = sp.getBoolean(context, SP.IS_LOGO_CLASSIC, false);
        boolean z19 = sp.getBoolean(context, SP.IS_NOTES_CLASSIC, true);
        boolean z20 = sp.getBoolean(context, SP.IS_PRESSURE_CLASSIC, false);
        boolean z21 = sp.getBoolean(context, SP.IS_HUMIDITY_CLASSIC, false);
        boolean z22 = sp.getBoolean(context, SP.IS_ALTITUDE_CLASSIC, false);
        boolean z23 = sp.getBoolean(context, SP.IS_ACCURACY_CLASSIC, false);
        boolean z24 = sp.getBoolean(context, SP.IS_SOUNDLEVEL_CLASSIC, false);
        String string = sp.getString(context, SP.STAMP_FONT_STYLE_CLASSIC, Default.DEFAULT_FONT_STYLE);
        String string2 = sp.getString(context, SP.DATE_FORMAT_CLASSIC, Default.DEFAULT_DATE_FORMAT);
        return z && sp.getString(context, SP.MAP_TYPE_TEMPLATE_CLASSIC, Default.SETELLITE_2).equals(Default.SETELLITE_2) && z3 && z4 && z5 && z6 && z7 && z2 && z10 && string2.equals(Default.DEFAULT_DATE_FORMAT) && z11 && integer6 == 6 && string.equals(Default.DEFAULT_FONT_STYLE) && sp.getString(context, SP.STAMP_SIZE_CLASSIC, Default.TEMPLATE_SIZE).equals(Default.TEMPLATE_SIZE) && sp.getString(context, SP.STAMP_POS_CLASSIC, "Bottom").equals("Bottom") && integer8 == 0 && integer7 == 78 && integer3 == -1 && integer2 == -1 && integer5 == -1 && integer4 == -1 && !z8 && !z12 && !z19 && !z13 && !z14 && !z9 && !z16 && !z15 && !z17 && !z21 && !z20 && !z22 && !z23 && !z24 && !z18 && integer == color;
    }

    public static boolean isDefaultDateTime(Context context) {
        SP sp = new SP(context);
        int color = Color.parseColor("#9c000000");
        int integer = sp.getInteger(context, SP.BACKGROUND_COLOR_DT, color);
        int integer2 = sp.getInteger(context, SP.ADDRESS_COLOR_DT, -1);
        int integer3 = sp.getInteger(context, SP.SHORT_ADDRESS_COLOR_DT, -1);
        int integer4 = sp.getInteger(context, SP.DATE_TIME_COLOR_DT, -1);
        int integer5 = sp.getInteger(context, SP.LAT_LNG_COLOR_DT, -1);
        int integer6 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_DT, 78);
        boolean z = sp.getBoolean(context, SP.IS_MAP_DT, false);
        boolean z2 = sp.getBoolean(context, SP.IS_COUNTRY_FLAG_DT, true);
        boolean z3 = sp.getBoolean(context, SP.IS_ADDRESS_DT, true);
        boolean z4 = sp.getBoolean(context, SP.IS_ADDRESS_CITY_DT, true);
        boolean z5 = sp.getBoolean(context, SP.IS_ADDRESS_STATE_DT, true);
        boolean z6 = sp.getBoolean(context, SP.IS_ADDRESS_COUNTRY_DT, true);
        boolean z7 = sp.getBoolean(context, SP.IS_ADDRESS_PINCODE_DT, true);
        boolean z8 = sp.getBoolean(context, SP.IS_WEATHER_DT, false);
        boolean z9 = sp.getBoolean(context, SP.IS_DATE_TIME_DT, true);
        boolean z10 = sp.getBoolean(context, SP.IS_PERSON_NAME_DT, false);
        boolean z11 = sp.getBoolean(context, SP.IS_CONTACT_NUMBER_DT, false);
        boolean z12 = sp.getBoolean(context, SP.IS_COMPASS_DT, false);
        boolean z13 = sp.getBoolean(context, SP.IS_LOGO_DT, false);
        boolean z14 = sp.getBoolean(context, SP.IS_NOTES_DT, true);
        boolean z15 = sp.getBoolean(context, SP.IS_ALTITUDE_DT, false);
        String string = sp.getString(context, SP.STAMP_FONT_STYLE_DT, Default.DEFAULT_FONT_STYLE_DT);
        return !z && z3 && z4 && z5 && z6 && z7 && z2 && z9 && sp.getString(context, SP.DATE_FORMAT_DT, Default.DEFAULT_DATE_FORMAT_DT).equals(Default.DEFAULT_DATE_FORMAT_DT) && sp.getString(context, SP.TIME_FORMAT_DT, Default.DEFAULT_TIME_FORMAT_DT).equals(Default.DEFAULT_TIME_FORMAT_DT) && string.equals(Default.DEFAULT_FONT_STYLE_DT) && sp.getString(context, SP.STAMP_SIZE_DT, Default.TEMPLATE_SIZE).equals(Default.TEMPLATE_SIZE) && sp.getString(context, SP.STAMP_POS_DT, "Bottom").equals("Bottom") && integer6 == 78 && integer3 == -1 && integer2 == -1 && integer5 == -1 && integer4 == -1 && !z14 && !z10 && !z11 && !z8 && !z12 && !z15 && !z13 && integer == color;
    }

    public static boolean isDefaultNav(Context context) {
        SP sp = new SP(context);
        int color = Color.parseColor("#9c000000");
        int integer = sp.getInteger(context, SP.BACKGROUND_COLOR_NC, color);
        int integer2 = sp.getInteger(context, SP.ADDRESS_COLOR_NC, -1);
        int integer3 = sp.getInteger(context, SP.SHORT_ADDRESS_COLOR_NC, -1);
        int integer4 = sp.getInteger(context, SP.DATE_TIME_COLOR_NC, -1);
        int integer5 = sp.getInteger(context, SP.LAT_LNG_COLOR_NC, -1);
        int integer6 = sp.getInteger(context, SP.TIMEZONE_NC, 6);
        int integer7 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_NC, 78);
        boolean z = sp.getBoolean(context, SP.IS_MAP_NC, true);
        boolean z2 = sp.getBoolean(context, SP.IS_COUNTRY_FLAG_NC, true);
        int integer8 = sp.getInteger(context, SP.MAP_POS_TYPE_NC, 0);
        boolean z3 = sp.getBoolean(context, SP.IS_ADDRESS_NC, true);
        boolean z4 = sp.getBoolean(context, SP.IS_ADDRESS_CITY_NC, true);
        boolean z5 = sp.getBoolean(context, SP.IS_ADDRESS_STATE_NC, true);
        boolean z6 = sp.getBoolean(context, SP.IS_ADDRESS_COUNTRY_NC, true);
        boolean z7 = sp.getBoolean(context, SP.IS_ADDRESS_PINCODE_NC, true);
        boolean z8 = sp.getBoolean(context, SP.IS_PLUS_CODE_NC, false);
        boolean z9 = sp.getBoolean(context, SP.IS_WEATHER_NC, false);
        boolean z10 = sp.getBoolean(context, SP.IS_DATE_TIME_NC, true);
        boolean z11 = sp.getBoolean(context, SP.IS_TIMEZONE_NC, true);
        boolean z12 = sp.getBoolean(context, SP.IS_NUMBERING_NC, false);
        boolean z13 = sp.getBoolean(context, SP.IS_PERSON_NAME_NC, false);
        boolean z14 = sp.getBoolean(context, SP.IS_CONTACT_NUMBER_NC, false);
        boolean z15 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD_NC, true);
        boolean z16 = sp.getBoolean(context, SP.IS_COMPASS_NC, true);
        boolean z17 = sp.getBoolean(context, SP.IS_WIND_NC, false);
        boolean z18 = sp.getBoolean(context, SP.IS_LOGO_NC, false);
        boolean z19 = sp.getBoolean(context, SP.IS_NOTES_NC, true);
        boolean z20 = sp.getBoolean(context, SP.IS_PRESSURE_NC, false);
        boolean z21 = sp.getBoolean(context, SP.IS_HUMIDITY_NC, false);
        boolean z22 = sp.getBoolean(context, SP.IS_ALTITUDE_NC, true);
        boolean z23 = sp.getBoolean(context, SP.IS_ACCURACY_NC, false);
        boolean z24 = sp.getBoolean(context, SP.IS_SOUNDLEVEL_NC, false);
        String string = sp.getString(context, SP.STAMP_FONT_STYLE_NC, Default.DEFAULT_FONT_STYLE);
        String string2 = sp.getString(context, SP.DATE_FORMAT_NC, Default.DEFAULT_DATE_FORMAT);
        return z && sp.getString(context, SP.MAP_TYPE_TEMPLATE_NC, Default.SETELLITE_2).equals(Default.SETELLITE_2) && z3 && z4 && z5 && z6 && z7 && z2 && z10 && string2.equals(Default.DEFAULT_DATE_FORMAT) && z11 && integer6 == 6 && string.equals(Default.DEFAULT_FONT_STYLE) && sp.getString(context, SP.STAMP_SIZE_NC, Default.TEMPLATE_SIZE).equals(Default.TEMPLATE_SIZE) && sp.getString(context, SP.STAMP_POS_NC, "Bottom").equals("Bottom") && integer8 == 0 && integer7 == 78 && integer3 == -1 && integer2 == -1 && integer5 == -1 && integer4 == -1 && !z8 && !z12 && !z19 && !z13 && !z14 && !z9 && z16 && z15 && !z17 && !z21 && !z20 && z22 && !z23 && !z24 && !z18 && integer == color && sp.getInteger(context, SP.AZIMUTH_COLOR_NC, -1) == -1 && sp.getInteger(context, SP.ORLABEL_TEXT_COLOR_NC, -1) == -1 && sp.getInteger(context, SP.ORLABEL_BG_COLOR_NC, Color.parseColor("#747474")) == Color.parseColor("#747474") && sp.getBoolean(context, SP.IS_ORIENTATION_LABEL_NC, true) && sp.getBoolean(context, SP.IS_AZIMUTH_NC, true);
    }

    public static boolean isDefaultReporting(Context context) {
        SP sp = new SP(context);
        int color = Color.parseColor("#9c000000");
        int integer = sp.getInteger(context, SP.BACKGROUND_COLOR_REPORTING, color);
        int integer2 = sp.getInteger(context, SP.ADDRESS_COLOR_REPORTING, -1);
        int integer3 = sp.getInteger(context, SP.SHORT_ADDRESS_COLOR_REPORTING, -1);
        int integer4 = sp.getInteger(context, SP.DATE_TIME_COLOR_REPORTING, -1);
        int integer5 = sp.getInteger(context, SP.LAT_LNG_COLOR_REPORTING, -1);
        int integer6 = sp.getInteger(context, SP.TIMEZONE_REPORTING, 6);
        int integer7 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_REPORTING, 78);
        boolean z = sp.getBoolean(context, SP.IS_MAP_REPORTING, true);
        boolean z2 = sp.getBoolean(context, SP.IS_COUNTRY_FLAG_REPORTING, true);
        int integer8 = sp.getInteger(context, SP.MAP_POS_TYPE_REPORTING, 0);
        boolean z3 = sp.getBoolean(context, SP.IS_ADDRESS_REPORTING, true);
        boolean z4 = sp.getBoolean(context, SP.IS_ADDRESS_CITY_REPORTING, true);
        boolean z5 = sp.getBoolean(context, SP.IS_ADDRESS_STATE_REPORTING, true);
        boolean z6 = sp.getBoolean(context, SP.IS_ADDRESS_COUNTRY_REPORTING, true);
        boolean z7 = sp.getBoolean(context, SP.IS_ADDRESS_PINCODE_REPORTING, true);
        boolean z8 = sp.getBoolean(context, SP.IS_PLUS_CODE_REPORTING, false);
        boolean z9 = sp.getBoolean(context, SP.IS_WEATHER_REPORTING, false);
        boolean z10 = sp.getBoolean(context, zUHsDp.WXdzzreigjLB, true);
        boolean z11 = sp.getBoolean(context, SP.IS_TIMEZONE_REPORTING, true);
        boolean z12 = sp.getBoolean(context, SP.IS_NUMBERING_REPORTING, false);
        boolean z13 = sp.getBoolean(context, SP.IS_PERSON_NAME_REPORTING, false);
        boolean z14 = sp.getBoolean(context, vlsa.ULSOiuNGd, false);
        boolean z15 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD_REPORTING, false);
        boolean z16 = sp.getBoolean(context, SP.IS_COMPASS_REPORTING, false);
        boolean z17 = sp.getBoolean(context, SP.IS_WIND_REPORTING, false);
        boolean z18 = sp.getBoolean(context, SP.IS_LOGO_REPORTING, false);
        boolean z19 = sp.getBoolean(context, SP.IS_NOTES_REPORTING, true);
        boolean z20 = sp.getBoolean(context, SP.IS_PRESSURE_REPORTING, false);
        boolean z21 = sp.getBoolean(context, SP.IS_HUMIDITY_REPORTING, false);
        boolean z22 = sp.getBoolean(context, SP.IS_ALTITUDE_REPORTING, false);
        boolean z23 = sp.getBoolean(context, SP.IS_ACCURACY_REPORTING, false);
        boolean z24 = sp.getBoolean(context, SP.IS_SOUNDLEVEL_REPORTING, false);
        String string = sp.getString(context, SP.STAMP_FONT_STYLE_REPORTING, Default.DEFAULT_FONT_STYLE);
        String string2 = sp.getString(context, SP.DATE_FORMAT_REPORTING, Default.DEFAULT_DATE_FORMAT);
        return z && sp.getString(context, SP.MAP_TYPE_TEMPLATE_REPORTING, Default.SETELLITE_2).equals(Default.SETELLITE_2) && z3 && z4 && z5 && z6 && z7 && z2 && z10 && string2.equals(Default.DEFAULT_DATE_FORMAT) && z11 && integer6 == 6 && string.equals(Default.DEFAULT_FONT_STYLE) && sp.getString(context, SP.STAMP_SIZE_REPORTING, Default.TEMPLATE_SIZE).equals(Default.TEMPLATE_SIZE) && sp.getString(context, SP.STAMP_POS_REPORTING, "Bottom").equals("Bottom") && integer8 == 0 && integer7 == 78 && integer3 == -1 && integer2 == -1 && integer5 == -1 && integer4 == -1 && !z8 && !z12 && !z19 && !z13 && !z14 && !z9 && !z16 && !z15 && !z17 && !z21 && !z20 && !z22 && !z23 && !z24 && !z18 && integer == color;
    }

    public static boolean isDefaultScanLocation(Context context) {
        SP sp = new SP(context);
        int color = Color.parseColor("#9c000000");
        int integer = sp.getInteger(context, SP.BACKGROUND_COLOR_QR, color);
        int integer2 = sp.getInteger(context, SP.ADDRESS_COLOR_QR, -1);
        int integer3 = sp.getInteger(context, SP.SHORT_ADDRESS_COLOR_QR, -1);
        int integer4 = sp.getInteger(context, SP.DATE_TIME_COLOR_QR, -1);
        int integer5 = sp.getInteger(context, SP.LAT_LNG_COLOR_QR, -1);
        int integer6 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_QR, 78);
        boolean z = sp.getBoolean(context, SP.IS_MAP_QR, true);
        boolean z2 = sp.getBoolean(context, SP.IS_COUNTRY_FLAG_QR, true);
        int integer7 = sp.getInteger(context, SP.MAP_POS_TYPE_QR, 0);
        boolean z3 = sp.getBoolean(context, SP.IS_ADDRESS_QR, true);
        boolean z4 = sp.getBoolean(context, SP.IS_ADDRESS_CITY_QR, true);
        boolean z5 = sp.getBoolean(context, SP.IS_ADDRESS_STATE_QR, true);
        boolean z6 = sp.getBoolean(context, SP.IS_ADDRESS_COUNTRY_QR, true);
        boolean z7 = sp.getBoolean(context, SP.IS_ADDRESS_PINCODE_QR, true);
        boolean z8 = sp.getBoolean(context, SP.IS_DATE_TIME_QR, true);
        String string = sp.getString(context, SP.STAMP_FONT_STYLE_QR, Default.DEFAULT_FONT_STYLE);
        String string2 = sp.getString(context, SP.DATE_FORMAT_QR, Default.DEFAULT_DATE_FORMAT);
        return z && sp.getString(context, SP.MAP_TYPE_TEMPLATE_QR, Default.SETELLITE_2).equals(Default.SETELLITE_2) && z3 && z4 && z5 && z6 && z7 && z2 && z8 && string2.equals(Default.DEFAULT_DATE_FORMAT) && string.equals(Default.DEFAULT_FONT_STYLE) && sp.getString(context, SP.STAMP_SIZE_QR, Default.TEMPLATE_SIZE).equals(Default.TEMPLATE_SIZE) && sp.getString(context, SP.STAMP_POS_QR, "Bottom").equals("Bottom") && integer7 == 0 && integer6 == 78 && integer3 == -1 && integer2 == -1 && integer5 == -1 && integer4 == -1 && integer == color;
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public static boolean isTablet(Context context) {
        boolean z = context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        float f3 = displayMetrics.heightPixels / displayMetrics.ydpi;
        boolean z2 = Math.sqrt((double) ((f3 * f3) + (f2 * f2))) >= 7.0d;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return (z || z2) && !(telephonyManager != null && telephonyManager.getPhoneType() != 0);
    }

    public static boolean isTimeAutomatic(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addReportingTag$13(Context context, ExecutorService executorService) {
        try {
            gc1 gc1VarL = gc1.l(context);
            if (gc1VarL.E().isEmpty()) {
                gc1VarL.O(0, Default.REPORT_TAG);
                gc1VarL.O(0, "Check Out");
                gc1VarL.O(0, "Clock In");
                gc1VarL.O(0, "Clock Out");
                gc1VarL.O(0, "Monitoring");
                gc1VarL.O(0, "Installation");
                gc1VarL.O(0, "Renovation And Restoration");
                gc1VarL.O(0, "Heavy Civil Construction");
                gc1VarL.O(0, "Infrastructure");
                gc1VarL.O(0, "Unlock");
                gc1VarL.O(0, "Security Patrol");
                gc1VarL.O(0, "Painting");
                gc1VarL.O(0, "Checklist");
                gc1VarL.O(0, "Construction");
                gc1VarL.O(0, "Inspection");
                gc1VarL.O(0, "Repair");
                gc1VarL.O(0, "Disinfection");
                gc1VarL.O(0, "Clean & Tidy");
                gc1VarL.O(0, "Sales");
                gc1VarL.O(0, "Delivery");
                gc1VarL.O(0, "Stock Check");
                gc1VarL.O(0, "Distribution");
                gc1VarL.O(0, "Time & Attendance");
                gc1VarL.O(0, "Construction Records");
                gc1VarL.O(0, "Work Record");
                gc1VarL.O(0, "Security Check");
                gc1VarL.O(0, "Police Enforcement");
                gc1VarL.O(0, "Quality Assurance");
                gc1VarL.O(0, "Market Surveillance");
                gc1VarL.O(0, "Environmental");
                gc1VarL.O(0, "Financial Reporting");
                gc1VarL.O(0, "Work Report");
                gc1VarL.O(0, "Cleaning");
                executorService.shutdown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getFontStyleAsync$11(FontCallback fontCallback) {
        fontCallback.onFontReady(tf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getFontStyleAsync$12(Context context, String str, FontCallback fontCallback) {
        Typeface typefaceCreateFromAsset;
        File file = new File(context.getFilesDir(), eo7.w("font/", str));
        if (file.exists()) {
            try {
                typefaceCreateFromAsset = Typeface.createFromFile(file);
                tf = typefaceCreateFromAsset;
            } catch (Exception unused) {
                typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), Default.DEFAULT_FONT_STYLE);
                tf = typefaceCreateFromAsset;
            }
        } else {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                tf = typefaceCreateFromAsset;
            } catch (Exception unused2) {
                typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), Default.DEFAULT_FONT_STYLE);
                tf = typefaceCreateFromAsset;
            }
        }
        fontCache.put(str, typefaceCreateFromAsset);
        new Handler(Looper.getMainLooper()).post(new fq1(15, fontCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showRateDialog$8(v60 v60Var, Context context, View view) {
        v60Var.dismiss();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSayThanksDialog$1(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, Context context, MaterialButton materialButton, ImageView imageView7, View view) {
        imageView.setImageResource(R.drawable.duv2_ic_rate_1);
        imageView2.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView3.setImageResource(R.drawable.non_fillstar);
        imageView4.setImageResource(R.drawable.non_fillstar);
        imageView5.setImageResource(R.drawable.non_fillstar);
        imageView6.setImageResource(R.drawable.non_fillstar);
        val = 1;
        chngeVal();
        onStarSelected(context, materialButton, imageView7, rate_main);
        materialButton.setText(context.getString(R.string.rateus));
        txt_rate_title.setText(context.getResources().getString(R.string.oh_no));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSayThanksDialog$2(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, Context context, MaterialButton materialButton, ImageView imageView7, View view) {
        imageView.setImageResource(R.drawable.duv2_ic_rate_2);
        imageView2.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView3.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView4.setImageResource(R.drawable.non_fillstar);
        imageView5.setImageResource(R.drawable.non_fillstar);
        imageView6.setImageResource(R.drawable.non_fillstar);
        val = 1;
        chngeVal();
        onStarSelected(context, materialButton, imageView7, rate_main);
        materialButton.setText(context.getString(R.string.rateus));
        txt_rate_title.setText(context.getResources().getString(R.string.dislike_it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSayThanksDialog$3(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, Context context, MaterialButton materialButton, ImageView imageView7, View view) {
        imageView.setImageResource(R.drawable.duv2_ic_rate_3);
        imageView2.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView3.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView4.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView5.setImageResource(R.drawable.non_fillstar);
        imageView6.setImageResource(R.drawable.non_fillstar);
        val = 1;
        chngeVal();
        onStarSelected(context, materialButton, imageView7, rate_main);
        materialButton.setText(context.getString(R.string.rateus));
        txt_rate_title.setText(context.getResources().getString(R.string.dislike_it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSayThanksDialog$4(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, Context context, MaterialButton materialButton, ImageView imageView7, View view) {
        imageView.setImageResource(R.drawable.duv2_ic_rate_4);
        imageView2.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView3.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView4.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView5.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView6.setImageResource(R.drawable.non_fillstar);
        val = 1;
        chngeVal();
        onStarSelected(context, materialButton, imageView7, rate_main);
        materialButton.setText(context.getString(R.string.rateus));
        txt_rate_title.setText(context.getResources().getString(R.string.liked_too));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSayThanksDialog$5(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, Context context, MaterialButton materialButton, ImageView imageView7, View view) {
        imageView.setImageResource(R.drawable.duv2_ic_rate_5);
        imageView2.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView3.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView4.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView5.setImageResource(R.drawable.duv2_ic_start_fil);
        imageView6.setImageResource(R.drawable.duv2_ic_start_fil);
        val = 2;
        chngeVal();
        onStarSelected(context, materialButton, imageView7, rate_main);
        materialButton.setText(context.getString(R.string.rate_on_google_play));
        txt_rate_title.setText(context.getResources().getString(R.string.liked_too));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showSayThanksDialog$7(Context context, v60 v60Var, View view, View view2) {
        int i = val;
        if (i == 2) {
            showRateDialog(context);
            v60Var.dismiss();
        } else {
            if (i != 1) {
                cc6.i(view, context.getString(R.string.rate_app_zero_star_error), -1).k();
                return;
            }
            v60Var.dismiss();
            h74 h74Var = new h74(context);
            h74Var.a.f = context.getString(R.string.thanks_for_rate);
            h74Var.e(new ld0(6));
            h74Var.create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showShareDialog$10(qc qcVar, boolean z, Activity activity, DialogInterface dialogInterface) {
        qcVar.g(-1).setBackgroundResource(R.drawable.my_ripple);
        qcVar.g(-2).setBackgroundResource(R.drawable.my_ripple);
        if (z) {
            qcVar.g(-2).setTextColor(activity.getColor(R.color.app_text_main_dark));
            qcVar.g(-1).setTextColor(activity.getColor(R.color.app_text_main_dark));
            TextView textView = (TextView) qcVar.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setTextColor(activity.getColor(R.color.app_text_main_dark));
            }
            TextView textView2 = (TextView) qcVar.findViewById(android.R.id.message);
            if (textView2 != null) {
                textView2.setTextColor(activity.getColor(R.color.app_text_main_dark));
                return;
            }
            return;
        }
        qcVar.g(-2).setTextColor(activity.getColor(R.color.app_text_main_light));
        qcVar.g(-1).setTextColor(activity.getColor(R.color.app_text_main_light));
        TextView textView3 = (TextView) qcVar.findViewById(android.R.id.title);
        if (textView3 != null) {
            textView3.setTextColor(activity.getColor(R.color.app_text_main_light));
        }
        TextView textView4 = (TextView) qcVar.findViewById(android.R.id.message);
        if (textView4 != null) {
            textView4.setTextColor(activity.getColor(R.color.app_text_main_light));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showShareDialog$9(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        new SP(activity).setBoolean(activity, SHARE, true);
    }

    public static String loction_latlng(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && isNumeric(str) && isNumeric(str2)) {
            double d = Double.parseDouble(str);
            double d2 = Double.parseDouble(str2);
            String strReplaceDelimiters = replaceDelimiters(Location.convert(d, 2), 8);
            String str3 = (d >= 0.0d ? 'N' : 'S') + " " + strReplaceDelimiters;
            String strReplaceDelimiters2 = replaceDelimiters(Location.convert(d2, 2), 8);
            str2 = (d2 >= 0.0d ? 'E' : 'W') + " " + strReplaceDelimiters2;
            str = str3;
        }
        return eo7.j(str, "_", str2);
    }

    private static void onStarSelected(Context context, MaterialButton materialButton, ImageView imageView, ImageView imageView2) {
        updateRateButtonState(context, materialButton, true);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    private static double parseFraction(String str) {
        String[] strArrSplit = str.split("/");
        return strArrSplit.length == 2 ? Double.parseDouble(strArrSplit[0]) / Double.parseDouble(strArrSplit[1]) : Double.parseDouble(str);
    }

    private static String replaceDelimins(String str, int i) {
        String strReplaceFirst = str.replaceFirst(":", "");
        int iIndexOf = strReplaceFirst.indexOf(".") + 1 + i;
        return iIndexOf < strReplaceFirst.length() ? strReplaceFirst.substring(0, iIndexOf) : strReplaceFirst;
    }

    private static String replaceDelimiters(String str, int i) {
        String strReplaceFirst = str.replaceFirst(":", "° ").replaceFirst(":", "' ");
        int iIndexOf = strReplaceFirst.indexOf(".") + 1 + i;
        if (iIndexOf < strReplaceFirst.length()) {
            strReplaceFirst = strReplaceFirst.substring(0, iIndexOf);
        }
        return strReplaceFirst.concat("\"");
    }

    private static String replaceDelimiterss(String str, int i) {
        String strReplaceFirst = str.replaceFirst(":", "").replaceFirst(":", "");
        int iIndexOf = strReplaceFirst.indexOf(".") + 1 + i;
        return iIndexOf < strReplaceFirst.length() ? strReplaceFirst.substring(0, iIndexOf) : strReplaceFirst;
    }

    public static void reportBug(Context context, String str, String str2, String str3) {
        PackageInfo packageInfo;
        String str4;
        int i;
        int i2;
        String displayCountry;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i3 = 0;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            try {
                str4 = packageInfo.versionName;
            } catch (Exception unused) {
                str4 = "";
            }
        } else {
            str4 = "1.0";
        }
        if (packageInfo != null) {
            try {
                i2 = packageInfo.versionCode;
            } catch (Exception unused2) {
                i = 0;
            }
        } else {
            i2 = 1;
        }
        i = i2;
        String str13 = Build.MANUFACTURER + " " + Build.MODEL;
        String str14 = Build.VERSION.RELEASE;
        int i4 = Build.VERSION.SDK_INT;
        try {
            displayCountry = new Locale("", ((TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso()).getDisplayCountry();
        } catch (Exception e2) {
            e2.printStackTrace();
            displayCountry = "";
        }
        String strConcat = str2 + ":" + context.getResources().getString(R.string.app_name);
        StringBuilder sb = new StringBuilder("\n");
        List<gi5> list = purchaseHistory;
        if (list != null && !list.isEmpty()) {
            strConcat = strConcat.concat(" [PRO]");
            sb.append("Order ID : \n");
        }
        List<gi5> list2 = purchaseHistory;
        if (list2 != null) {
            for (gi5 gi5Var : list2) {
                if (((String) gi5Var.c().get(i3)).equals(context.getResources().getString(R.string.PRODUCT_ID_ALL))) {
                    sb.append(" - (");
                    String strOptString = gi5Var.c.optString("orderId");
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = null;
                    }
                    sb.append(strOptString);
                    sb.append(")\n");
                }
                i3 = 0;
            }
        }
        SP sp = new SP(context);
        boolean z2 = sp.getBoolean(context, SP.IS_MAP, true);
        boolean z3 = sp.getBoolean(context, SP.IS_ADDRESS, true);
        boolean z4 = sp.getBoolean(context, SP.IS_WEATHER, false);
        String str15 = strConcat;
        boolean z5 = sp.getBoolean(context, SP.IS_DATE_TIME, true);
        boolean z6 = sp.getBoolean(context, SP.IS_TIMEZONE, true);
        boolean z7 = sp.getBoolean(context, SP.IS_NUMBERING, true);
        boolean z8 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD, false);
        boolean z9 = sp.getBoolean(context, SP.IS_COMPASS, false);
        boolean z10 = sp.getBoolean(context, SP.COMPASS_FOUND, false);
        boolean z11 = sp.getBoolean(context, SP.IS_PLUS_CODE, false);
        boolean z12 = sp.getBoolean(context, SP.IS_LOGO, false);
        boolean z13 = sp.getBoolean(context, SP.IS_NOTES, false);
        boolean z14 = sp.getBoolean(context, SP.IS_WIND, false);
        boolean z15 = sp.getBoolean(context, SP.IS_HUMIDITY, false);
        boolean z16 = sp.getBoolean(context, SP.IS_PRESSURE, false);
        boolean z17 = sp.getBoolean(context, SP.IS_ALTITUDE, false);
        boolean z18 = sp.getBoolean(context, SP.IS_ACCURACY, false);
        String string = sp.getString(context, SP.STAMP_SIZE, Default.TEMPLATE_SIZE);
        String string2 = sp.getString(context, SP.MAP_TYPE_TEMPLATE, Default.SETELLITE_2);
        boolean z19 = sp.getBoolean(context, SP.IS_SOUNDLEVEL, false);
        int integer = sp.getInteger(context, SP.MAP_ZOOM_SCALE, 78);
        if (sp.getInteger(context, SP.MAP_POS_TYPE, 0) != 0) {
            str6 = "Left";
            str5 = "Right";
        } else {
            str5 = "Left";
            str6 = str5;
        }
        if (string2.equals(Default.NORMAL_1)) {
            string2 = "Normal";
        }
        String str16 = str5;
        String str17 = string2;
        boolean z20 = sp.getBoolean(context, SP.IS_MAP_CLASSIC, true);
        boolean z21 = sp.getBoolean(context, SP.IS_ADDRESS_CLASSIC, true);
        boolean z22 = sp.getBoolean(context, SP.IS_WEATHER_CLASSIC, false);
        boolean z23 = sp.getBoolean(context, SP.IS_DATE_TIME_CLASSIC, true);
        boolean z24 = sp.getBoolean(context, SP.IS_TIMEZONE_CLASSIC, true);
        boolean z25 = sp.getBoolean(context, SP.IS_NUMBERING_CLASSIC, true);
        boolean z26 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD_CLASSIC, false);
        boolean z27 = sp.getBoolean(context, SP.IS_COMPASS_CLASSIC, false);
        boolean z28 = sp.getBoolean(context, SP.IS_PLUS_CODE_CLASSIC, false);
        boolean z29 = sp.getBoolean(context, XIBrjfXRiD.SxVgIV, false);
        boolean z30 = sp.getBoolean(context, SP.IS_NOTES_CLASSIC, false);
        boolean z31 = sp.getBoolean(context, SP.IS_WIND_CLASSIC, false);
        boolean z32 = sp.getBoolean(context, SP.IS_HUMIDITY_CLASSIC, false);
        boolean z33 = sp.getBoolean(context, SP.IS_PRESSURE_CLASSIC, false);
        boolean z34 = sp.getBoolean(context, SP.IS_ALTITUDE_CLASSIC, false);
        boolean z35 = sp.getBoolean(context, SP.IS_ACCURACY_CLASSIC, false);
        String string3 = sp.getString(context, SP.STAMP_SIZE_CLASSIC, Default.TEMPLATE_SIZE);
        String string4 = sp.getString(context, SP.MAP_TYPE_TEMPLATE_CLASSIC, Default.SETELLITE_2);
        boolean z36 = sp.getBoolean(context, SP.IS_SOUNDLEVEL_CLASSIC, false);
        int integer2 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_CLASSIC, 78);
        String str18 = sp.getInteger(context, SP.MAP_POS_TYPE_CLASSIC, 0) != 0 ? "Right" : str6;
        if (string4.equals(Default.NORMAL_1)) {
            string4 = "Normal";
        }
        String str19 = str18;
        boolean z37 = sp.getBoolean(context, SP.IS_MAP_REPORTING, true);
        boolean z38 = sp.getBoolean(context, SP.IS_ADDRESS_REPORTING, true);
        boolean z39 = sp.getBoolean(context, SP.IS_WEATHER_REPORTING, false);
        boolean z40 = sp.getBoolean(context, SP.IS_DATE_TIME_REPORTING, true);
        boolean z41 = sp.getBoolean(context, SP.IS_TIMEZONE_REPORTING, true);
        boolean z42 = sp.getBoolean(context, SP.IS_NUMBERING_REPORTING, true);
        boolean z43 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD_REPORTING, false);
        boolean z44 = sp.getBoolean(context, SP.IS_COMPASS_REPORTING, false);
        boolean z45 = sp.getBoolean(context, SP.IS_PLUS_CODE_REPORTING, false);
        boolean z46 = sp.getBoolean(context, SP.IS_LOGO_REPORTING, false);
        boolean z47 = sp.getBoolean(context, SP.IS_NOTES_REPORTING, false);
        boolean z48 = sp.getBoolean(context, SP.IS_WIND_REPORTING, false);
        boolean z49 = sp.getBoolean(context, SP.IS_HUMIDITY_REPORTING, false);
        boolean z50 = sp.getBoolean(context, SP.IS_PRESSURE_REPORTING, false);
        boolean z51 = sp.getBoolean(context, SP.IS_ALTITUDE_REPORTING, false);
        boolean z52 = sp.getBoolean(context, SP.IS_ACCURACY_REPORTING, false);
        boolean z53 = sp.getBoolean(context, SP.IS_SOUNDLEVEL_REPORTING, false);
        String string5 = sp.getString(context, SP.STAMP_SIZE_REPORTING, Default.TEMPLATE_SIZE);
        String string6 = sp.getString(context, SP.MAP_TYPE_TEMPLATE_REPORTING, Default.SETELLITE_2);
        String str20 = string4;
        int integer3 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_REPORTING, 78);
        if (sp.getInteger(context, SP.MAP_POS_TYPE_REPORTING, 0) != 0) {
            str6 = "Right";
        }
        if (string6.equals(Default.NORMAL_1)) {
            string6 = "Normal";
        }
        boolean z54 = sp.getBoolean(context, SP.IS_MAP_NC, true);
        boolean z55 = sp.getBoolean(context, SP.IS_ADDRESS_NC, true);
        boolean z56 = sp.getBoolean(context, SP.IS_WEATHER_NC, false);
        boolean z57 = sp.getBoolean(context, SP.IS_DATE_TIME_NC, true);
        boolean z58 = sp.getBoolean(context, SP.IS_TIMEZONE_NC, true);
        boolean z59 = sp.getBoolean(context, SP.IS_NUMBERING_NC, false);
        boolean z60 = sp.getBoolean(context, SP.IS_MAGNETIC_FIELD_NC, true);
        boolean z61 = sp.getBoolean(context, SP.IS_COMPASS_NC, true);
        boolean z62 = sp.getBoolean(context, SP.IS_PLUS_CODE_NC, false);
        boolean z63 = sp.getBoolean(context, SP.IS_LOGO_NC, false);
        boolean z64 = sp.getBoolean(context, SP.IS_NOTES_NC, false);
        boolean z65 = sp.getBoolean(context, SP.IS_WIND_NC, false);
        boolean z66 = sp.getBoolean(context, SP.IS_HUMIDITY_NC, false);
        boolean z67 = sp.getBoolean(context, SP.IS_PRESSURE_NC, false);
        boolean z68 = sp.getBoolean(context, SP.IS_ALTITUDE_NC, true);
        boolean z69 = sp.getBoolean(context, SP.IS_ACCURACY_NC, false);
        boolean z70 = sp.getBoolean(context, SP.IS_SOUNDLEVEL_NC, false);
        boolean z71 = sp.getBoolean(context, SP.IS_AQI_LEVEL_NC, false);
        boolean z72 = sp.getBoolean(context, SP.IS_AZIMUTH_NC, true);
        boolean z73 = sp.getBoolean(context, SP.IS_ORIENTATION_LABEL_NC, true);
        String string7 = sp.getString(context, SP.STAMP_SIZE_NC, Default.TEMPLATE_SIZE);
        String string8 = sp.getString(context, SP.MAP_TYPE_TEMPLATE_NC, Default.SETELLITE_2);
        int integer4 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_NC, 78);
        boolean z74 = sp.getBoolean(context, SP.IS_MAP_DT, true);
        boolean z75 = sp.getBoolean(context, SP.IS_ADDRESS_DT, true);
        boolean z76 = sp.getBoolean(context, SP.IS_WEATHER_DT, false);
        boolean z77 = sp.getBoolean(context, SP.IS_COMPASS_DT, false);
        boolean z78 = sp.getBoolean(context, SP.IS_LOGO_DT, false);
        boolean z79 = sp.getBoolean(context, SP.IS_NOTES_DT, false);
        boolean z80 = sp.getBoolean(context, SP.IS_ALTITUDE_DT, false);
        String string9 = sp.getString(context, SP.STAMP_SIZE_DT, Default.TEMPLATE_SIZE);
        String string10 = sp.getString(context, SP.MAP_TYPE_TEMPLATE_DT, Default.SETELLITE_2);
        int integer5 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_DT, 78);
        boolean z81 = sp.getBoolean(context, SP.IS_MAP_QR, true);
        boolean z82 = sp.getBoolean(context, SP.IS_ADDRESS_QR, true);
        boolean z83 = sp.getBoolean(context, SP.IS_DATE_TIME_QR, true);
        boolean z84 = sp.getBoolean(context, SP.IS_NOTES_QR, false);
        String string11 = sp.getString(context, SP.STAMP_SIZE_QR, Default.TEMPLATE_SIZE);
        String string12 = sp.getString(context, SP.MAP_TYPE_TEMPLATE_QR, Default.SETELLITE_2);
        int integer6 = sp.getInteger(context, SP.MAP_ZOOM_SCALE_QR, 78);
        String str21 = sp.getInteger(context, SP.MAP_POS_TYPE_QR, 0) != 0 ? "Right" : str19;
        String str22 = string12.equals(Default.NORMAL_1) ? "Normal" : string12;
        String str23 = sp.getInteger(context, SP.MAP_POS_TYPE_REPORTING, 0) != 0 ? "Right" : str6;
        if (string6.equals(Default.NORMAL_1)) {
            string6 = "Normal";
        }
        if (sp.getString(context, SP.VB_Setting, Default.CAPTURE).equals(Default.CAPTURE)) {
            str7 = "Capture";
            z = z84;
        } else {
            z = z84;
            str7 = sp.getString(context, SP.VB_Setting, Default.CAPTURE).equals(Default.VOLUME) ? "Volume" : "Zoom";
        }
        String str24 = str23;
        if (sp.getBoolean(context, SP.IS_SEND_EMAIL_PHOTOS, false)) {
            str9 = "Off";
            str8 = "On";
        } else {
            str8 = "Off";
            str9 = str8;
        }
        String str25 = sp.getString(context, SP.T_Setting, Default.CAPTURE).equals(Default.CAPTURE) ? "Capture" : "Focus";
        String str26 = string6;
        String str27 = sp.getInteger(context, SP.IMAGE_QUALITY, 1) == 1 ? "High" : sp.getInteger(context, SP.IMAGE_QUALITY, 1) == 2 ? Default.TEMPLATE_SIZE : "Low";
        String str28 = str21;
        String string13 = sp.getString(context, SP.DATE_FORMAT, Default.DEFAULT_DATE_FORMAT);
        int integer7 = sp.getInteger(context, SP.LAT_LNG_TYPE, 1);
        String string14 = sp.getString(context, SP.DATE_FORMAT_CLASSIC, Default.DEFAULT_DATE_FORMAT);
        int integer8 = sp.getInteger(context, SP.LAT_LNG_TYPE_CLASSIC, 1);
        String string15 = sp.getString(context, SP.DATE_FORMAT_REPORTING, Default.DEFAULT_DATE_FORMAT);
        int integer9 = sp.getInteger(context, SP.LAT_LNG_TYPE_REPORTING, 1);
        String string16 = sp.getString(context, SP.DATE_FORMAT_NC, Default.DEFAULT_DATE_FORMAT);
        int integer10 = sp.getInteger(context, SP.LAT_LNG_TYPE_NC, 1);
        String string17 = sp.getString(context, SP.DATE_FORMAT_DT, Default.DEFAULT_DATE_FORMAT_DT);
        String string18 = sp.getString(context, SP.TIME_FORMAT_DT, Default.DEFAULT_TIME_FORMAT_DT);
        int integer11 = sp.getInteger(context, SP.LAT_LNG_TYPE_DT, 1);
        String string19 = sp.getString(context, SP.DATE_FORMAT_QR, Default.DEFAULT_DATE_FORMAT);
        int integer12 = sp.getInteger(context, SP.LAT_LNG_TYPE_QR, 1);
        String string20 = sp.getString(context, SP.TEMPRATURE_TYPE, "Celsius");
        float f2 = sp.getFloat(context, SP.TEMPRETURE_VALUE);
        String string21 = sp.getString(context, SP.TEMPRATURE_TYPE_CLASSIC, "Celsius");
        String string22 = sp.getString(context, SP.TEMPRATURE_TYPE_REPORTING, "Celsius");
        String string23 = sp.getString(context, SP.TEMPRATURE_TYPE_NC, "Celsius");
        String string24 = sp.getString(context, SP.TEMPRATURE_TYPE_DT, "Celsius");
        String string25 = sp.getString(context, SP.LATITUDE, "");
        String string26 = sp.getString(context, SP.LONGITUDE, "");
        String strTrim = sp.getString(context, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = sp.getString(context, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = sp.getString(context, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = sp.getString(context, SP.LOC_LINE_4_COUNTRY, "").trim();
        String str29 = sp.getBoolean(context, SP.IS_WATER_MARK, true) ? "On" : str9;
        String str30 = sp.getBoolean(context, SP.IS_ORIGINAL_IMAGE, true) ? "On" : str9;
        int i5 = i;
        String string27 = sp.getString(context, SP.SELECTED_LANGUAGE, Default.LANGUAGE);
        String str31 = str4;
        if (sp.getInteger(context, SP.TEMPLATE_TYPE, 0) == 0) {
            str11 = "Advance";
            str10 = str25;
        } else {
            str10 = str25;
            if (sp.getInteger(context, SP.TEMPLATE_TYPE, 0) == 1) {
                str11 = "Classic";
            } else if (sp.getInteger(context, SP.TEMPLATE_TYPE, 0) == 2) {
                str11 = "Reporting";
            } else if (sp.getInteger(context, SP.TEMPLATE_TYPE, 0) == 3) {
                str11 = "Navigation Compass";
            } else {
                str11 = sp.getInteger(context, SP.TEMPLATE_TYPE, 0) == 3 ? "Date Time Template" : "Scan Location Template";
            }
        }
        String str32 = !sp.getBoolean(context, SP.IS_INCREMENT, true) ? "Decrement" : "Increment";
        String str33 = !sp.getBoolean(context, SP.IS_INCREMENT_CLASSIC, true) ? "Decrement" : "Increment";
        String str34 = !sp.getBoolean(context, SP.IS_INCREMENT_REPORTING, true) ? "Decrement" : "Increment";
        String str35 = sp.getBoolean(context, SP.IS_INCREMENT_NC, true) ? "Increment" : "Decrement";
        String str36 = str11;
        String str37 = sp.getString(context, SP.PREFIX, "") + "" + sp.getInteger(context, SP.SEQUENCE, 1) + "" + sp.getString(context, SP.SUFFIX, "");
        String str38 = sp.getString(context, SP.PREFIX_CLASSIC, "") + "" + sp.getInteger(context, SP.SEQUENCE_CLASSIC, 1) + "" + sp.getString(context, SP.SUFFIX_CLASSIC, "");
        String str39 = sp.getString(context, SP.PREFIX_REPORTING, "") + "" + sp.getInteger(context, SP.SEQUENCE_REPORTING, 1) + "" + sp.getString(context, SP.SUFFIX_REPORTING, "");
        String str40 = sp.getString(context, SP.PREFIX_NC, "") + "" + sp.getInteger(context, SP.SEQUENCE_NC, 1) + "" + sp.getString(context, SP.SUFFIX_NC, "");
        StringBuilder sbT = eo7.t("Your Message\n==========================\n", str3, "\n\nDevice Information-\n==========================\nDevice Name : ", str13, "\nAndroid API : ");
        sbT.append(i4);
        sbT.append("\nAndroid Version : ");
        sbT.append(str14);
        sbT.append("\nCountry : ");
        sbT.append(displayCountry);
        sbT.append("\n\n\nPermission Status -\nCamera Permission : ");
        sbT.append(checkCameraPermission(context));
        sbT.append("\nStorage Permission : ");
        sbT.append(checkStoragePermission(context));
        sbT.append("\nLocation Permission : ");
        sbT.append(checkLocationPermission(context));
        sbT.append("\nMicrophone Permission : ");
        sbT.append(checkMicrophonePermission(context));
        sbT.append("\n\n\nGeneral Information -\nWatermark : ");
        sbT.append(str29);
        sbT.append("\nKeep original photo : ");
        fs7.m(sbT, str30, "\nLanguage : ", string27, "\nVolume buttom setting : ");
        fs7.m(sbT, str7, "\nEmail setting : ", str8, "\nTouch setting : ");
        fs7.m(sbT, str10, "\nImage quality : ", str27, "\n\n\nApp Information -\n==========================\nVersion : ");
        sbT.append(str31);
        sbT.append("(");
        sbT.append(i5);
        sbT.append(")\nSelect Stamp Type : ");
        sbT.append(str36);
        sbT.append("\n\n\nAdvance template information -\nisMap : ");
        sbT.append(z2);
        sbT.append("\nisAddress : ");
        fs7.o(sbT, z3, "\nisShortAddress : true\nisLatLng : true\nisTemperature : ", z4, "\nisDateTime : ");
        fs7.o(sbT, z5, "\nisTimeZone : ", z6, "\nisPlusCode : ");
        fs7.o(sbT, z11, "\nisNumbering : ", z7, "\nisLogo : ");
        fs7.o(sbT, z12, "\nisNote : ", z13, "\nisMagneticField : ");
        fs7.o(sbT, z8, "\nisCompass : ", z9, "\nisCompassFound : ");
        fs7.o(sbT, z10, "\nisWind : ", z14, "\nisHumidity : ");
        fs7.o(sbT, z15, "\nisPressure : ", z16, "\nisAltitude : ");
        fs7.o(sbT, z17, "\nisAccuracy : ", z18, "\nisSoundLevel : ");
        sbT.append(z19);
        sbT.append("\nLatLng Type : ");
        sbT.append(integer7);
        sbT.append("\nLatitude : ");
        fs7.m(sbT, string25, "\nLongitude : ", string26, "\nAddress Line 1 : ");
        String str41 = fuEBEyZ.Ddeuk;
        fs7.m(sbT, strTrim, "\nCity : ", strTrim2, str41);
        fs7.m(sbT, strTrim3, "\nCountry Address : ", strTrim4, "\nMap Type : ");
        sbT.append(str17);
        sbT.append("\nPlus Code : ");
        sbT.append(getPluscode(sp, context, sp.getString(context, SP.PLUS_CODE_TYPE, Default.PLUSCODE_TYPE)));
        sbT.append("\nDate & Time : ");
        sbT.append(setDateTimeFormat(context, string13));
        sbT.append("\nTime Zone : ");
        sbT.append(getTimezone(sp.getInteger(context, SP.TIMEZONE, 6)));
        fs7.m(sbT, "\nNumbering : ", str32, " ", str37);
        sbT.append("\nNote/Hashtag : ");
        String str42 = bqcsmGRRmsYO.bPYr;
        sbT.append(sp.getString(context, SP.NOTES_HASHTAG, str42));
        sbT.append("\nTemperature : ");
        sbT.append(getTemperature(string20, f2));
        sbT.append("\nCompass : ");
        sbT.append(sp.getString(context, SP.COMPASS_VALUE, ""));
        sbT.append("\nMagnetic Field : ");
        String str43 = GBTljJJcQz.WNggJLXdDkKDir;
        sbT.append(sp.getString(context, str43, ""));
        sbT.append("\nWind : ");
        sbT.append(getwindConvert(context, sp.getInteger(context, SP.WIND_SELECT, 0)));
        sbT.append("\nHumidity : ");
        sbT.append(sp.getString(context, SP.HUMIDITY_VALUE, ""));
        sbT.append("%\nPressure : ");
        sbT.append(getpressureConvert(context, sp.getInteger(context, SP.PRESSURE_SELECT, 0)));
        sbT.append("\nAltitude : ");
        sbT.append(getAltitudeconvert(context, sp.getInteger(context, SP.ALTITUDE_SELECT, 0)));
        sbT.append("\nAccuracy : ");
        sbT.append(getAccuracy(context, sp.getInteger(context, SP.ACCURACY_SELECT, 0)));
        sbT.append("\nStamp Size : ");
        sbT.append(string);
        sbT.append("\nMap zoom scale : ");
        sbT.append(integer);
        sbT.append("\nMap position : ");
        sbT.append(str16);
        sbT.append("\nSound Level : ");
        sbT.append(getSoundLevel(context));
        sbT.append("\n\n\nClassic template information -\nisMap : ");
        sbT.append(z20);
        fs7.n(sbT, "\nisAddress : ", z21, "\nisShortAddress : true\nisLatLng : true\nisTemperature : ", z22);
        fs7.n(sbT, "\nisDateTime : ", z23, "\nisTimeZone : ", z24);
        fs7.n(sbT, "\nisPlusCode : ", z28, "\nisNumbering : ", z25);
        fs7.n(sbT, "\nisLogo : ", z29, "\nisNote : ", z30);
        fs7.n(sbT, "\nisMagneticField : ", z26, "\nisCompass : ", z27);
        fs7.n(sbT, "\nisCompassFound : ", z10, "\nisWind : ", z31);
        fs7.n(sbT, "\nisHumidity : ", z32, "\nisPressure : ", z33);
        fs7.n(sbT, "\nisAltitude : ", z34, "\nisAccuracy : ", z35);
        sbT.append("\nisSoundLevel : ");
        sbT.append(z36);
        sbT.append("\nLatLng Type : ");
        sbT.append(integer8);
        fs7.m(sbT, "\nLatitude : ", string25, "\nLongitude : ", string26);
        fs7.m(sbT, "\nAddress Line 1 : ", strTrim, "\nCity : ", strTrim2);
        fs7.m(sbT, str41, strTrim3, "\nCountry Address : ", strTrim4);
        sbT.append("\nMap Type : ");
        sbT.append(str20);
        sbT.append("\nPlus Code : ");
        sbT.append(getPluscode(sp, context, sp.getString(context, SP.PLUS_CODE_TYPE_CLASSIC, Default.PLUSCODE_TYPE)));
        sbT.append("\nDate & Time : ");
        sbT.append(setDateTimeFormat(context, string14));
        sbT.append("\nTime Zone : ");
        sbT.append(getTimezone(sp.getInteger(context, SP.TIMEZONE_CLASSIC, 6)));
        fs7.m(sbT, "\nNumbering : ", str33, " ", str38);
        sbT.append("\nNote/Hashtag : ");
        sbT.append(sp.getString(context, SP.NOTES_HASHTAG_CLASSIC, str42));
        sbT.append("\nTemperature : ");
        sbT.append(getTemperature(string21, f2));
        sbT.append("\nCompass : ");
        sbT.append(sp.getString(context, SP.COMPASS_VALUE, ""));
        sbT.append("\nMagnetic Field : ");
        sbT.append(sp.getString(context, str43, ""));
        sbT.append("\nWind : ");
        sbT.append(getwindConvert(context, sp.getInteger(context, SP.WIND_SELECT_CLASSIC, 0)));
        sbT.append("\nHumidity : ");
        sbT.append(sp.getString(context, SP.HUMIDITY_VALUE, ""));
        sbT.append("%\nPressure : ");
        sbT.append(getpressureConvert(context, sp.getInteger(context, SP.PRESSURE_SELECT_CLASSIC, 0)));
        sbT.append("\nAltitude : ");
        sbT.append(getAltitudeconvert(context, sp.getInteger(context, SP.ALTITUDE_SELECT_CLASSIC, 0)));
        sbT.append("\nAccuracy : ");
        sbT.append(getAccuracy(context, sp.getInteger(context, SP.ACCURACY_SELECT_CLASSIC, 0)));
        sbT.append("\nStamp Size : ");
        sbT.append(string3);
        sbT.append("\nMap zoom scale : ");
        sbT.append(integer2);
        sbT.append("\nMap position : ");
        sbT.append(str28);
        sbT.append("\nSound Level : ");
        sbT.append(getSoundLevel(context));
        sbT.append("\n\n\nReporting template information -\nisMap : ");
        sbT.append(z37);
        fs7.n(sbT, "\nisAddress : ", z38, "\nisShortAddress : true\nisLatLng : true\nisTemperature : ", z39);
        fs7.n(sbT, "\nisDateTime : ", z40, "\nisTimeZone : ", z41);
        fs7.n(sbT, "\nisPlusCode : ", z45, "\nisNumbering : ", z42);
        fs7.n(sbT, "\nisLogo : ", z46, "\nisNote : ", z47);
        fs7.n(sbT, "\nisMagneticField : ", z43, "\nisCompass : ", z44);
        fs7.n(sbT, "\nisCompassFound : ", z10, "\nisWind : ", z48);
        fs7.n(sbT, "\nisHumidity : ", z49, "\nisPressure : ", z50);
        fs7.n(sbT, "\nisAltitude : ", z51, "\nisAccuracy : ", z52);
        sbT.append("\nisSoundLevel : ");
        sbT.append(z53);
        sbT.append("\nisReporting Tag : true\nLatLng Type : ");
        sbT.append(integer9);
        fs7.m(sbT, "\nLatitude : ", string25, "\nLongitude : ", string26);
        fs7.m(sbT, "\nAddress Line 1 : ", strTrim, "\nCity : ", strTrim2);
        fs7.m(sbT, str41, strTrim3, "\nCountry Address : ", strTrim4);
        sbT.append("\nMap Type : ");
        sbT.append(str26);
        sbT.append("\nPlus Code : ");
        sbT.append(getPluscode(sp, context, sp.getString(context, SP.PLUS_CODE_TYPE_REPORTING, Default.PLUSCODE_TYPE)));
        sbT.append("\nDate & Time : ");
        sbT.append(setDateTimeFormat(context, string15));
        sbT.append("\nTime Zone : ");
        sbT.append(getTimezone(sp.getInteger(context, SP.TIMEZONE_REPORTING, 6)));
        fs7.m(sbT, "\nNumbering : ", str34, " ", str39);
        sbT.append("\nNote/Hashtag : ");
        sbT.append(sp.getString(context, SP.NOTES_HASHTAG_REPORTING, str42));
        sbT.append("\nTemperature : ");
        sbT.append(getTemperature(string22, f2));
        sbT.append("\nCompass : ");
        sbT.append(sp.getString(context, SP.COMPASS_VALUE, ""));
        sbT.append("\nMagnetic Field : ");
        sbT.append(sp.getString(context, str43, ""));
        sbT.append("\nWind : ");
        sbT.append(getwindConvert(context, sp.getInteger(context, SP.WIND_SELECT_REPORTING, 0)));
        sbT.append("\nHumidity : ");
        sbT.append(sp.getString(context, SP.HUMIDITY_VALUE, ""));
        sbT.append("%\nPressure : ");
        sbT.append(getpressureConvert(context, sp.getInteger(context, SP.PRESSURE_SELECT_REPORTING, 0)));
        sbT.append("\nAltitude : ");
        sbT.append(getAltitudeconvert(context, sp.getInteger(context, SP.ALTITUDE_SELECT_REPORTING, 0)));
        sbT.append("\nAccuracy : ");
        sbT.append(getAccuracy(context, sp.getInteger(context, SP.ACCURACY_SELECT_REPORTING, 0)));
        sbT.append("\nReporting Tag : ");
        fs7.m(sbT, sp.getString(context, SP.REPORT_TAG_REPORTING, Default.REPORT_TAG), "\nStamp Size : ", string5, "\nMap zoom scale : ");
        sbT.append(integer3);
        sbT.append("\nMap position : ");
        sbT.append(str24);
        sbT.append("\nSound Level : ");
        sbT.append(getSoundLevel(context));
        sbT.append("\n\n\nNavigation Compass template information -\nisMap : ");
        sbT.append(z54);
        sbT.append("\nisAddress : ");
        fs7.o(sbT, z55, "\nisShortAddress : true\nisLatLng : true\nisTemperature : ", z56, "\nisDateTime : ");
        fs7.o(sbT, z57, "\nisTimeZone : ", z58, "\nisPlusCode : ");
        fs7.o(sbT, z62, "\nisNumbering : ", z59, "\nisLogo : ");
        fs7.o(sbT, z63, "\nisNote : ", z64, "\nisMagneticField : ");
        fs7.o(sbT, z60, "\nisCompass : ", z61, "\nisCompassFound : ");
        fs7.o(sbT, z10, "\nisWind : ", z65, "\nisHumidity : ");
        fs7.o(sbT, z66, "\nisPressure : ", z67, "\nisAltitude : ");
        fs7.o(sbT, z68, "\nisAccuracy : ", z69, "\nisSoundLevel : ");
        fs7.o(sbT, z70, "\nisAQILevel : ", z71, "\nisAzimuth : ");
        fs7.o(sbT, z72, "\nisOrientationLabel : ", z73, "\nLatLng Type : ");
        sbT.append(integer10);
        sbT.append("\nLatitude : ");
        sbT.append(string25);
        sbT.append("\nLongitude : ");
        fs7.m(sbT, string26, "\nAddress Line 1 : ", strTrim, "\nCity : ");
        fs7.m(sbT, strTrim2, str41, strTrim3, "\nCountry Address : ");
        fs7.m(sbT, strTrim4, "\nMap Type : ", string8, "\nPlus Code : ");
        sbT.append(getPluscode(sp, context, sp.getString(context, SP.PLUS_CODE_TYPE_NC, Default.PLUSCODE_TYPE)));
        sbT.append("\nDate & Time : ");
        sbT.append(setDateTimeFormat(context, string16));
        sbT.append("\nTime Zone : ");
        sbT.append(getTimezone(sp.getInteger(context, SP.TIMEZONE_NC, 6)));
        fs7.m(sbT, "\nNumbering : ", str35, " ", str40);
        sbT.append("\nNote/Hashtag : ");
        sbT.append(sp.getString(context, SP.NOTES_HASHTAG_NC, str42));
        sbT.append("\nTemperature : ");
        sbT.append(getTemperature(string23, f2));
        sbT.append("\nCompass : ");
        sbT.append(sp.getString(context, SP.COMPASS_VALUE, ""));
        sbT.append("\nMagnetic Field : ");
        sbT.append(sp.getString(context, str43, ""));
        sbT.append("\nWind : ");
        sbT.append(getwindConvert(context, sp.getInteger(context, SP.WIND_SELECT_NC, 0)));
        sbT.append("\nHumidity : ");
        sbT.append(sp.getString(context, SP.HUMIDITY_VALUE, ""));
        sbT.append("%\nPressure : ");
        sbT.append(getpressureConvert(context, sp.getInteger(context, SP.PRESSURE_SELECT_NC, 0)));
        sbT.append("\nAltitude : ");
        sbT.append(getAltitudeconvert(context, sp.getInteger(context, SP.ALTITUDE_SELECT_NC, 0)));
        sbT.append("\nAccuracy : ");
        sbT.append(getAccuracy(context, sp.getInteger(context, SP.ACCURACY_SELECT_NC, 0)));
        sbT.append("\nAQI : ");
        sbT.append(getAqiValueText(context, sp.getString(context, SP.AQI_LEVEL_VALUE, "-")));
        sbT.append("\nStamp Size : ");
        sbT.append(string7);
        sbT.append("\nMap zoom scale : ");
        sbT.append(integer4);
        sbT.append("\nMap position : Left\nSound Level : ");
        sbT.append(getSoundLevel(context));
        fs7.n(sbT, "\n\n\nDateTime template information -\nisMap : ", z74, "\nisAddress : ", z75);
        fs7.n(sbT, "\nisShortAddress : true\nisLatLng : true\nisTemperature : ", z76, "\nisDateTime : true\nisLogo : ", z78);
        fs7.n(sbT, "\nisNote : ", z79, "\nisCompass : ", z77);
        fs7.n(sbT, "\nisCompassFound : ", z10, "\nisAltitude : ", z80);
        sbT.append("\nLatLng Type : ");
        sbT.append(integer11);
        sbT.append("\nLatitude : ");
        sbT.append(string25);
        fs7.m(sbT, "\nLongitude : ", string26, "\nAddress Line 1 : ", strTrim);
        fs7.m(sbT, "\nCity : ", strTrim2, str41, strTrim3);
        fs7.m(sbT, "\nCountry Address : ", strTrim4, "\nMap Type : ", string10);
        sbT.append("\nDate : ");
        sbT.append(setDateTimeFormat(context, string17));
        sbT.append(bqcsmGRRmsYO.DhEebR);
        sbT.append(setDateTimeFormat(context, string18));
        sbT.append("\nNote/Hashtag : ");
        sbT.append(sp.getString(context, SP.NOTES_HASHTAG_DT, str42));
        sbT.append("\nTemperature : ");
        sbT.append(getTemperature(string24, f2));
        sbT.append("\nCompass : ");
        sbT.append(sp.getString(context, SP.COMPASS_VALUE, ""));
        sbT.append("\nAltitude : ");
        sbT.append(getAltitudeconvert(context, sp.getInteger(context, SP.ALTITUDE_SELECT_DT, 0)));
        sbT.append("\nStamp Size : ");
        sbT.append(string9);
        sbT.append("\nMap zoom scale : ");
        sbT.append(integer5);
        sbT.append("\n\n\nScan Location Template information -\nisMap : ");
        sbT.append(z81);
        fs7.n(sbT, "\nisAddress : ", z82, "\nisShortAddress : true\nisLatLng : true\nisDateTime : ", z83);
        sbT.append("\nisNote : ");
        sbT.append(z);
        sbT.append("\nLatLng Type : ");
        sbT.append(integer12);
        fs7.m(sbT, "\nLatitude : ", string25, "\nLongitude : ", string26);
        fs7.m(sbT, "\nAddress Line 1 : ", strTrim, "\nCity : ", strTrim2);
        fs7.m(sbT, str41, strTrim3, "\nCountry Address : ", strTrim4);
        sbT.append("\nMap Type : ");
        sbT.append(str22);
        sbT.append("\nDate & Time : ");
        sbT.append(setDateTimeFormat(context, string19));
        sbT.append("\nNote/Hashtag : ");
        fs7.m(sbT, sp.getString(context, SP.NOTES_HASHTAG_QR, str42), "\nStamp Size : ", string11, "\nMap zoom scale : ");
        sbT.append(integer6);
        sbT.append("\nMap position : Left\n");
        sbT.append((Object) sb);
        sbT.append("\n");
        String string28 = sbT.toString();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("message/rfc822");
            String[] strArr = new String[1];
            StringBuilder sb2 = new StringBuilder();
            str12 = "";
            try {
                sb2.append(str12);
                sb2.append(str);
                strArr[0] = sb2.toString();
                intent.putExtra("android.intent.extra.EMAIL", strArr);
                intent.putExtra("android.intent.extra.SUBJECT", str15);
                intent.putExtra("android.intent.extra.TEXT", string28);
                context.startActivity(Intent.createChooser(intent, context.getString(R.string.email_choose_from_client)));
            } catch (ActivityNotFoundException unused3) {
                showDialog(context, str12, context.getResources().getString(R.string.email_no_client));
            }
        } catch (ActivityNotFoundException unused4) {
            str12 = "";
        }
    }

    public static double round(double d, int i) {
        if (i >= 0) {
            double dPow = (long) Math.pow(10.0d, i);
            return Math.round(d * dPow) / dPow;
        }
        l36.e();
        return 0.0d;
    }

    public static Uri saveImageExternal(Context context, Bitmap bitmap, String str) {
        try {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), str + " .png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.close();
            return FileProvider.c(context, file, context.getPackageName() + ".provider");
        } catch (Exception e) {
            Log.d("TAG", "IOException while trying to write file for sharing: " + e.getMessage());
            return null;
        }
    }

    public static void sendFBEvent(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str);
        FirebaseAnalytics.getInstance(context).a(str, bundle);
    }

    public static String setDateTimeFormat(Context context, String str) {
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        Locale locale = getLocale(context);
        String strAddExtention = str.contains("ddth") ? addExtention(str) : new SimpleDateFormat(str, locale).format(date);
        return (locale.getLanguage().equals("hi") || locale.getLanguage().equals("es")) ? strAddExtention.replace("am", "AM").replace("pm", "PM") : strAddExtention;
    }

    public static String setDateTimeFormatForCamera(Context context, String str, boolean z) {
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        if (z && str.equals(Default.DEFAULT_DATE_FORMAT)) {
            str = "EEEE, dd/MM/yyyy hh:mm:ss a";
        }
        Locale locale = getLocale(context);
        String strAddExtention = str.contains("ddth") ? addExtention(str) : new SimpleDateFormat(str, locale).format(date);
        return (locale.getLanguage().equals("hi") || locale.getLanguage().equals("es")) ? strAddExtention.replace("am", "AM").replace("pm", "PM") : strAddExtention;
    }

    public static String setDateTimeFormatPDF(Context context, String str) {
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        Locale locale = getLocale(context);
        String strAddExtention = str.contains("ddth") ? addExtention(str) : new SimpleDateFormat(str, locale).format(date);
        return (locale.getLanguage().equals("hi") || locale.getLanguage().equals("es")) ? strAddExtention.replace("am", "AM").replace(zUHsDp.vxewz, "PM") : strAddExtention;
    }

    public static String setDateTimeFormatforPDF(Context context, String str, Date date2) {
        Locale locale = getLocale(context);
        String strAddExtention = str.contains("ddth") ? addExtention(str) : new SimpleDateFormat(str, locale).format(date2);
        return (locale.getLanguage().equals("hi") || locale.getLanguage().equals("es")) ? strAddExtention.replace("am", "AM").replace("pm", "PM") : strAddExtention;
    }

    public static void shareApp(final Context context) {
        pr5 pr5VarK = com.bumptech.glide.a.e(context).k();
        pr5VarK.z(pr5VarK.I(Integer.valueOf(R.drawable.gps_map_camera_share_image))).a(new ls5().j(1024, PdfGraphics2D.AFM_DIVISOR)).F(new cs5() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass.1
            @Override // defpackage.cs5
            public boolean onLoadFailed(kp2 kp2Var, Object obj, xp6 xp6Var, boolean z) {
                return false;
            }

            @Override // defpackage.cs5
            public boolean onResourceReady(Bitmap bitmap, Object obj, xp6 xp6Var, xa1 xa1Var, boolean z) {
                StringBuilder sbM = dt7.m(context.getResources().getString(R.string.app_name) + "\n\n" + context.getString(R.string.share_app_desc), "\n");
                sbM.append(context.getString(R.string.share_link));
                String string = sbM.toString();
                Context context2 = context;
                HelperClass.shareImage(context2, bitmap, context2.getString(R.string.app_name), string);
                return false;
            }
        }).J();
    }

    public static void shareImage(Context context, Bitmap bitmap, String str, String str2) {
        Activity activity;
        ArrayList<? extends Parcelable> arrayList;
        Uri uriSaveImageExternal = saveImageExternal(context, bitmap, str);
        Context baseContext = (Activity) context;
        baseContext.getClass();
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", baseContext.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", baseContext.getPackageName());
        action.addFlags(PdfWriter.NonFullScreenPageModeUseOutlines);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
        if (uriSaveImageExternal != null) {
            arrayList = new ArrayList<>();
            arrayList.add(uriSaveImageExternal);
        } else {
            arrayList = null;
        }
        action.setType("image/*");
        action.putExtra("android.intent.extra.TEXT", (CharSequence) str2);
        if (arrayList == null || arrayList.size() <= 1) {
            action.setAction("android.intent.action.SEND");
            if (arrayList == null || arrayList.isEmpty()) {
                action.removeExtra("android.intent.extra.STREAM");
                action.setClipData(null);
                action.setFlags(action.getFlags() & (-2));
            } else {
                action.putExtra("android.intent.extra.STREAM", arrayList.get(0));
                f99.d(action, arrayList);
            }
        } else {
            action.setAction("android.intent.action.SEND_MULTIPLE");
            action.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            f99.d(action, arrayList);
        }
        context.startActivity(Intent.createChooser(action.setAction("android.intent.action.SEND").setDataAndType(uriSaveImageExternal, "image/*").addFlags(1), "Share image using"));
    }

    public static void showDialog(Context context, String str, String str2) {
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str);
            builder.setMessage(str2);
            builder.setPositiveButton(context.getString(R.string.ok), new ld0(7));
            builder.create().show();
        }
    }

    public static void showRateDialog(Context context) {
        v60 v60Var = new v60(context);
        View viewInflate = View.inflate(context, R.layout.play_store_dialog, null);
        v60Var.setContentView(viewInflate);
        v60Var.create();
        v60Var.show();
        ((Button) viewInflate.findViewById(R.id.btnrate)).setOnClickListener(new b30(8, v60Var, context));
        v60Var.show();
    }

    public static void showSayThanksDialog(final Context context) {
        val = 0;
        try {
            v60 v60Var = new v60(context);
            View viewInflate = View.inflate(context, R.layout.dialog_say_thanks, null);
            v60Var.setContentView(viewInflate);
            v60Var.create();
            v60Var.show();
            final MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.btnrate);
            final ImageView imageView = (ImageView) viewInflate.findViewById(R.id.star1);
            final ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.star2);
            final ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.star3);
            final ImageView imageView4 = (ImageView) viewInflate.findViewById(R.id.star4);
            final ImageView imageView5 = (ImageView) viewInflate.findViewById(R.id.star5);
            rate_main = (ImageView) viewInflate.findViewById(R.id.img_gif);
            final ImageView imageView6 = (ImageView) viewInflate.findViewById(R.id.threelines);
            txt_rate_title = (TextView) viewInflate.findViewById(R.id.txt_rate_title_1);
            final ImageView imageView7 = (ImageView) viewInflate.findViewById(R.id.iv_rate_main);
            updateRateButtonState(context, materialButton, false);
            if (imageView6 != null) {
                imageView6.setVisibility(0);
            }
            ImageView imageView8 = rate_main;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
                fs5 fs5VarE = com.bumptech.glide.a.e(context);
                Integer numValueOf = Integer.valueOf(R.drawable.duv2_ic_rate_arrow);
                pr5 pr5VarJ = fs5VarE.j(Drawable.class);
                pr5VarJ.z(pr5VarJ.I(numValueOf)).E(rate_main);
            }
            final int i = 0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: gv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            HelperClass.lambda$showSayThanksDialog$1(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 1:
                            HelperClass.lambda$showSayThanksDialog$2(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 2:
                            HelperClass.lambda$showSayThanksDialog$3(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 3:
                            HelperClass.lambda$showSayThanksDialog$4(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        default:
                            HelperClass.lambda$showSayThanksDialog$5(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                    }
                }
            });
            final int i2 = 1;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: gv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            HelperClass.lambda$showSayThanksDialog$1(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 1:
                            HelperClass.lambda$showSayThanksDialog$2(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 2:
                            HelperClass.lambda$showSayThanksDialog$3(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 3:
                            HelperClass.lambda$showSayThanksDialog$4(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        default:
                            HelperClass.lambda$showSayThanksDialog$5(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                    }
                }
            });
            final int i3 = 2;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: gv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            HelperClass.lambda$showSayThanksDialog$1(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 1:
                            HelperClass.lambda$showSayThanksDialog$2(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 2:
                            HelperClass.lambda$showSayThanksDialog$3(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 3:
                            HelperClass.lambda$showSayThanksDialog$4(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        default:
                            HelperClass.lambda$showSayThanksDialog$5(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                    }
                }
            });
            final int i4 = 3;
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: gv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            HelperClass.lambda$showSayThanksDialog$1(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 1:
                            HelperClass.lambda$showSayThanksDialog$2(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 2:
                            HelperClass.lambda$showSayThanksDialog$3(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 3:
                            HelperClass.lambda$showSayThanksDialog$4(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        default:
                            HelperClass.lambda$showSayThanksDialog$5(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                    }
                }
            });
            final int i5 = 4;
            imageView5.setOnClickListener(new View.OnClickListener() { // from class: gv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            HelperClass.lambda$showSayThanksDialog$1(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 1:
                            HelperClass.lambda$showSayThanksDialog$2(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 2:
                            HelperClass.lambda$showSayThanksDialog$3(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        case 3:
                            HelperClass.lambda$showSayThanksDialog$4(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                        default:
                            HelperClass.lambda$showSayThanksDialog$5(imageView7, imageView, imageView2, imageView3, imageView4, imageView5, context, materialButton, imageView6, view);
                            break;
                    }
                }
            });
            materialButton.setOnClickListener(new c30(v60Var, context, viewInflate));
            v60Var.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showShareDialog(final Activity activity, final boolean z) {
        pc pcVar = new pc(activity, R.style.MyDialogTheme);
        pcVar.setTitle(activity.getString(R.string.alert_share_title));
        pcVar.a.f = activity.getString(R.string.alert_share_dialog_mesg);
        pcVar.d(activity.getString(R.string.alert_share_btn_positive), new DialogInterface.OnClickListener() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                HelperClass.shareApp(activity);
                new SP(activity).setBoolean(activity, HelperClass.SHARE, true);
                dialogInterface.dismiss();
            }
        });
        pcVar.c(activity.getString(R.string.alert_share_btn_negative), new yc(8, activity));
        final qc qcVarCreate = pcVar.create();
        qcVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: fv2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HelperClass.lambda$showShareDialog$10(qcVarCreate, z, activity, dialogInterface);
            }
        });
        qcVarCreate.show();
    }

    public static void showSnackBar(View view, String str) {
        cc6.i(view, idmhT.NqgluL + str, -1).k();
    }

    public static void showSoftKeyboard(Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    private static void updateRateButtonState(Context context, MaterialButton materialButton, boolean z) {
        if (materialButton == null) {
            return;
        }
        materialButton.setEnabled(z);
        if (z) {
            materialButton.setBackgroundTintList(ColorStateList.valueOf(getThemeColor(context, R.attr.app_main)));
            materialButton.setTextColor(context.getColor(R.color.app_text_main_light));
        } else {
            materialButton.setBackgroundTintList(ColorStateList.valueOf(getThemeColor(context, R.attr.custom_date_bg)));
            materialButton.setTextColor(getThemeColor(context, R.attr.hint_color));
        }
    }

    public static byte[] uriToByteArray(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                inputStreamOpenInputStream.close();
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStreamOpenInputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    e.printStackTrace();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public w40 BitmapFromVector(Context context, int i, int i2, int i3) {
        Drawable drawable = context.getDrawable(i);
        drawable.setBounds(0, 0, i2, i3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        return oj9.d(bitmapCreateBitmap);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void SetLanguage(Activity activity) {
        String string = new SP(activity).getString(activity, SP.SELECTED_LANGUAGE, Default.LANGUAGE);
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -2133431923:
                if (string.equals("bahasa Indonesia (Indonesian)")) {
                    b = 0;
                }
                break;
            case -2052276004:
                if (string.equals("मराठी")) {
                    b = 1;
                }
                break;
            case -2013094062:
                if (string.equals("Española")) {
                    b = 2;
                }
                break;
            case -1931612036:
                if (string.equals("বাংলা")) {
                    b = 3;
                }
                break;
            case -1893112662:
                if (string.equals("Français (French)")) {
                    b = 4;
                }
                break;
            case -1848502141:
                if (string.equals("Bahasa Melayu")) {
                    b = 5;
                }
                break;
            case -1624082021:
                if (string.equals("मराठी (Marathi)")) {
                    b = 6;
                }
                break;
            case -1603099204:
                if (string.equals("தமிழ் (Tamil)")) {
                    b = 7;
                }
                break;
            case -1575530339:
                if (string.equals("Français")) {
                    b = 8;
                }
                break;
            case -1450814002:
                if (string.equals("தமிழ்")) {
                    b = 9;
                }
                break;
            case -1303615932:
                if (string.equals("Bahasa Melayu (Malay)")) {
                    b = 10;
                }
                break;
            case -1220530445:
                if (string.equals("ಕನ್ನಡ")) {
                    b = BidiOrder.AN;
                }
                break;
            case -1185086888:
                if (string.equals("Русский")) {
                    b = BidiOrder.CS;
                }
                break;
            case -1155591125:
                if (string.equals("Português")) {
                    b = BidiOrder.NSM;
                }
                break;
            case -1150224476:
                if (string.equals("हिन्दी (Hindi)")) {
                    b = BidiOrder.BN;
                }
                break;
            case -1071093480:
                if (string.equals("Deutsch")) {
                    b = BidiOrder.B;
                }
                break;
            case -745208288:
                if (string.equals("Italiano (Italian)")) {
                    b = BidiOrder.S;
                }
                break;
            case -601245009:
                if (string.equals("Española (Spanish)")) {
                    b = BidiOrder.WS;
                }
                break;
            case -98589738:
                if (string.equals("ไทย (Thai)")) {
                    b = 18;
                }
                break;
            case 917436:
                if (string.equals("漢語")) {
                    b = 19;
                }
                break;
            case 3625007:
                if (string.equals("ไทย")) {
                    b = 20;
                }
                break;
            case 53917191:
                if (string.equals("한국인")) {
                    b = 21;
                }
                break;
            case 60895824:
                if (string.equals(Default.LANGUAGE)) {
                    b = 22;
                }
                break;
            case 75053372:
                if (string.equals("ಕನ್ನಡ (Kannada)")) {
                    b = 23;
                }
                break;
            case 361404451:
                if (string.equals("Deutsch (German)")) {
                    b = 24;
                }
                break;
            case 621291606:
                if (string.equals("한국인 (Korean)")) {
                    b = 25;
                }
                break;
            case 644988668:
                if (string.equals("ગુજરાતી")) {
                    b = 26;
                }
                break;
            case 1127340175:
                if (string.equals("Italiano")) {
                    b = 27;
                }
                break;
            case 1132116197:
                if (string.equals("हिन्दी")) {
                    b = 28;
                }
                break;
            case 1188248865:
                if (string.equals("Português (Portuguese)")) {
                    b = 29;
                }
                break;
            case 1211661130:
                if (string.equals("bahasa Indonesia")) {
                    b = 30;
                }
                break;
            case 1225600157:
                if (string.equals("Tiếng Việt")) {
                    b = 31;
                }
                break;
            case 1394341750:
                if (string.equals("Русский (Russian)")) {
                    b = DocWriter.SPACE;
                }
                break;
            case 1418684864:
                if (string.equals("漢語 (Chinese)")) {
                    b = 33;
                }
                break;
            case 1786799653:
                if (string.equals("Tiếng Việt (Vietnamese)")) {
                    b = DocWriter.QUOTE;
                }
                break;
            case 2026735772:
                if (string.equals("ગુજરાતી (Gujarati)")) {
                    b = 35;
                }
                break;
            case 2135504683:
                if (string.equals("বাংলা (Bengali)")) {
                    b = 36;
                }
                break;
        }
        String str = "en";
        switch (b) {
            case 0:
            case 30:
                str = "in";
                break;
            case 1:
            case 6:
                str = "mr";
                break;
            case 2:
            case 17:
                str = "es";
                break;
            case 3:
            case 36:
                str = "bn";
                break;
            case 4:
            case 8:
                str = "fr";
                break;
            case 5:
            case 10:
                str = "ms";
                break;
            case 7:
            case 9:
                str = "ta";
                break;
            case 11:
            case 23:
                str = "kn";
                break;
            case 12:
            case 32:
                str = "ru";
                break;
            case 13:
            case 29:
                str = "pt";
                break;
            case 14:
            case 28:
                str = "hi";
                break;
            case 15:
            case 24:
                str = "de";
                break;
            case 16:
            case 27:
                str = "it";
                break;
            case 18:
            case 20:
                str = HtmlTags.TH;
                break;
            case 19:
            case 33:
                str = "zh";
                break;
            case 21:
            case 25:
                str = "ko";
                break;
            case 26:
            case 35:
                str = "gu";
                break;
            case 31:
            case 34:
                str = "vi";
                break;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            mq7.c(activity.getSystemService("locale")).setApplicationLocales(LocaleList.forLanguageTags(str));
            return;
        }
        Resources resources = activity.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(new Locale(str));
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public void addReportingTag(Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new jw1(14, context, executorServiceNewSingleThreadExecutor));
    }

    public boolean checkAudioPermission(Context context) {
        return la9.a(context, "android.permission.RECORD_AUDIO") == 0;
    }

    public boolean checkGPSPermission(Context context) {
        boolean z = la9.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        if (la9.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return false;
        }
        return z;
    }

    public boolean checkPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return la9.a(context, "android.permission.CAMERA") == 0;
        }
        if (i > 29) {
            return la9.a(context, "android.permission.CAMERA") == 0;
        }
        boolean z = la9.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        if (la9.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        if (la9.a(context, "android.permission.CAMERA") != 0) {
            return false;
        }
        return z;
    }

    public String dms_latlng(Context context) {
        SP sp = new SP(context);
        String string = sp.getString(context, SP.LATITUDE, "");
        String string2 = sp.getString(context, SP.LONGITUDE, "");
        if (string != null && !string.isEmpty() && string2 != null && !string2.isEmpty()) {
            Double dValueOf = Double.valueOf(string);
            Double dValueOf2 = Double.valueOf(string2);
            String strReplaceDelimiters = replaceDelimiters(Location.convert(dValueOf.doubleValue(), 2), 8);
            string = (dValueOf.doubleValue() >= 0.0d ? 'N' : 'S') + " " + strReplaceDelimiters;
            String strReplaceDelimiters2 = replaceDelimiters(Location.convert(dValueOf2.doubleValue(), 2), 8);
            string2 = (dValueOf2.doubleValue() >= 0.0d ? 'E' : 'W') + " " + strReplaceDelimiters2;
        }
        return eo7.j(string, "_", string2);
    }

    public String getLatLong(Context context, int i) {
        try {
            SP sp = new SP(context);
            String string = sp.getString(context, SP.LATITUDE, "0");
            String string2 = sp.getString(context, SP.LONGITUDE, "0");
            if (string != null && !string.isEmpty() && string2 != null && !string2.isEmpty()) {
                if (string.contains(",")) {
                    string = string.replace(",", ".");
                }
                if (string2.contains(",")) {
                    string2 = string2.replace(",", ".");
                }
                Double dValueOf = Double.valueOf(string);
                Double dValueOf2 = Double.valueOf(string2);
                if (dValueOf.doubleValue() != 0.0d && dValueOf2.doubleValue() != 0.0d) {
                    switch (i) {
                        case 0:
                            return "Lat " + string + " Long " + string2;
                        case 1:
                            return "Lat " + (string + "°") + " Long " + (string2 + "°");
                        case 2:
                            return "Lat " + (string + " " + (dValueOf.doubleValue() >= 0.0d ? 'N' : 'S')) + " Long " + (string2 + " " + (dValueOf2.doubleValue() >= 0.0d ? 'E' : 'W'));
                        case 3:
                            return "Lat " + replaceDelimins(Location.convert(dValueOf.doubleValue(), 1), 8) + " Long " + replaceDelimins(Location.convert(dValueOf2.doubleValue(), 1), 8);
                        case 4:
                            String strReplaceDelimiters = replaceDelimiters(Location.convert(dValueOf.doubleValue(), 2), 8);
                            String strReplace = (dValueOf.doubleValue() >= 0.0d ? 'N' : 'S') + " " + strReplaceDelimiters;
                            if (strReplace.endsWith(" \"")) {
                                strReplace = strReplace.replace(" \"", "");
                            }
                            String strReplaceDelimiters2 = replaceDelimiters(Location.convert(dValueOf2.doubleValue(), 2), 8);
                            String strReplace2 = (dValueOf2.doubleValue() >= 0.0d ? 'E' : 'W') + " " + strReplaceDelimiters2;
                            if (strReplace2.endsWith(" \"")) {
                                strReplace2 = strReplace2.replace(" \"", "");
                            }
                            return "Lat " + strReplace + " Long " + strReplace2;
                        case 5:
                            String str = replaceDelimiterss(Location.convert(dValueOf.doubleValue(), 2), 8) + " " + (dValueOf.doubleValue() >= 0.0d ? 'N' : 'S');
                            String strConvert = Location.convert(dValueOf2.doubleValue(), 2);
                            char c = dValueOf2.doubleValue() >= 0.0d ? 'E' : 'W';
                            return "Lat " + str + " Long " + (replaceDelimiterss(strConvert, 8) + " " + c);
                        case 6:
                            return fea.a(dValueOf.doubleValue(), dValueOf2.doubleValue());
                        case 7:
                            double dDoubleValue = dValueOf.doubleValue();
                            mg mgVar = new mg(dDoubleValue, dDoubleValue * 0.017453292519943295d);
                            double dDoubleValue2 = dValueOf2.doubleValue();
                            String str2 = ya.a(mgVar, new mg(dDoubleValue2, 0.017453292519943295d * dDoubleValue2)).b;
                            String[] strArrSplit = str2.split(" ");
                            if (strArrSplit.length <= 2) {
                                return str2;
                            }
                            return strArrSplit[0] + " " + strArrSplit[1] + " " + strArrSplit[2];
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "-";
        }
    }

    public String getLatLong(Context context, int i, String str, String str2) {
        String strReplace = str;
        String strReplace2 = str2;
        try {
            new SP(context);
            if (strReplace != null && !strReplace.isEmpty() && strReplace2 != null && !strReplace2.isEmpty()) {
                if (strReplace.contains(",")) {
                    strReplace = strReplace.replace(",", ".");
                }
                if (strReplace2.contains(",")) {
                    strReplace2 = strReplace2.replace(",", ".");
                }
                Double dValueOf = Double.valueOf(strReplace);
                Double dValueOf2 = Double.valueOf(strReplace2);
                DecimalFormat decimalFormat = new DecimalFormat("0.0000");
                if (dValueOf.doubleValue() != 0.0d && dValueOf2.doubleValue() != 0.0d) {
                    switch (i) {
                        case 0:
                            return "Lat " + decimalFormat.format(dValueOf) + " Long " + decimalFormat.format(dValueOf2);
                        case 1:
                            return "Lat " + decimalFormat.format(dValueOf) + " Long " + decimalFormat.format(dValueOf2);
                        case 2:
                            return "Lat " + (decimalFormat.format(dValueOf) + " " + (dValueOf.doubleValue() >= 0.0d ? 'N' : 'S')) + " Long " + (decimalFormat.format(dValueOf2) + " " + (dValueOf2.doubleValue() >= 0.0d ? 'E' : 'W'));
                        case 3:
                            return "Lat " + replaceDelimins(Location.convert(dValueOf.doubleValue(), 1), 8) + " Long " + replaceDelimins(Location.convert(dValueOf2.doubleValue(), 1), 8);
                        case 4:
                            String strReplaceDelimiters = replaceDelimiters(Location.convert(dValueOf.doubleValue(), 2), 8);
                            String strReplace3 = (dValueOf.doubleValue() >= 0.0d ? 'N' : 'S') + " " + strReplaceDelimiters;
                            if (strReplace3.endsWith(" \"")) {
                                strReplace3 = strReplace3.replace(" \"", "");
                            }
                            String strReplaceDelimiters2 = replaceDelimiters(Location.convert(dValueOf2.doubleValue(), 2), 8);
                            String strReplace4 = (dValueOf2.doubleValue() >= 0.0d ? 'E' : 'W') + " " + strReplaceDelimiters2;
                            if (strReplace4.endsWith(" \"")) {
                                strReplace4 = strReplace4.replace(" \"", "");
                            }
                            return "Lat " + strReplace3 + " Long " + strReplace4;
                        case 5:
                            String str3 = replaceDelimiterss(Location.convert(dValueOf.doubleValue(), 2), 8) + " " + (dValueOf.doubleValue() >= 0.0d ? 'N' : 'S');
                            String strConvert = Location.convert(dValueOf2.doubleValue(), 2);
                            char c = dValueOf2.doubleValue() >= 0.0d ? 'E' : 'W';
                            return "Lat " + str3 + " Long " + (replaceDelimiterss(strConvert, 8) + " " + c);
                        case 6:
                            return fea.a(dValueOf.doubleValue(), dValueOf2.doubleValue());
                        case 7:
                            double dDoubleValue = dValueOf.doubleValue();
                            mg mgVar = new mg(dDoubleValue, dDoubleValue * 0.017453292519943295d);
                            double dDoubleValue2 = dValueOf2.doubleValue();
                            String str4 = ya.a(mgVar, new mg(dDoubleValue2, 0.017453292519943295d * dDoubleValue2)).b;
                            String[] strArrSplit = str4.split(" ");
                            if (strArrSplit.length <= 2) {
                                return str4;
                            }
                            return strArrSplit[0] + " " + strArrSplit[1] + " " + strArrSplit[2];
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "-";
        }
    }

    public void openGallery(Uri uri, Context context) {
        if (uri != null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    uri = null;
                } else {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            } catch (IOException unused) {
            }
        }
        if (uri == null) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        try {
            context.startActivity(new Intent("com.android.camera.action.REVIEW", uri));
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                try {
                    context.startActivity(intent);
                } catch (SecurityException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}