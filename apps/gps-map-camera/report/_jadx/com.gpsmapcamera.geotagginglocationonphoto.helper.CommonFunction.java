package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.camera.core.RWg.fuEBEyZ;
import androidx.camera.core.internal.compat.quirk.Je.zXAusrmFrBIQHr;
import androidx.viewpager2.widget.oTG.WYysgTwsdXDD;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.model.DateTime;
import com.itextpdf.text.html.HtmlTags;
import com.itextpdf.text.pdf.ColumnText;
import com.onesignal.notifications.activities.MF.UdXpKYRTUg;
import defpackage.bl1;
import defpackage.bl8;
import defpackage.c10;
import defpackage.cc6;
import defpackage.ci4;
import defpackage.d09;
import defpackage.dt7;
import defpackage.e7;
import defpackage.e76;
import defpackage.eo7;
import defpackage.fp8;
import defpackage.fs7;
import defpackage.fz7;
import defpackage.gc1;
import defpackage.ja;
import defpackage.k58;
import defpackage.ky3;
import defpackage.la9;
import defpackage.lf3;
import defpackage.ly3;
import defpackage.mi;
import defpackage.mn0;
import defpackage.mu5;
import defpackage.n10;
import defpackage.n5;
import defpackage.nu5;
import defpackage.ny3;
import defpackage.pk2;
import defpackage.px3;
import defpackage.vt8;
import defpackage.w48;
import defpackage.wu0;
import defpackage.x8a;
import defpackage.xr8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class CommonFunction {
    public static String BROADCAST_LOCATION = "android.intent.broadcast.location";
    public static final String Details_Native = "ca-app-pub-1531973473735447/8818925614";
    private static final long FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = 900000;
    public static String ISDELETE_SIGNATURE = "is_deleteSignature";
    public static String ISEDIT_SIGNATURE = "is_editSignature";
    public static String ISSELECT_SIGNATURE = "is_selectSignature";
    private static final long UPDATE_INTERVAL_IN_MILLISECONDS = 900000;
    String addressFull;
    String area;
    String cityName;
    String countryName;
    private Location mCurrentLocation;
    private pk2 mFusedLocationClient;
    private px3 mLocationCallback;
    private LocationRequest mLocationRequest;
    private ly3 mLocationSettingsRequest;
    private e76 mSettingsClient;
    private TextView mTextViewRatingValue;
    public ProgressDialog pDownloadDialog;
    private RatingBar rating_bar;
    String stateName;
    public static String[] repeat = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static String TAG = "CommonFunction";
    final int REQUEST_CHECK_SETTINGS = 1;
    public int progressTotal = -1;
    public Double tmp = Double.valueOf(0.0d);

    public CommonFunction() {
        String str = UdXpKYRTUg.ZuzAxQflORnwqB;
        this.addressFull = str;
        this.cityName = str;
        this.area = str;
        this.stateName = str;
        this.countryName = str;
    }

    private String addExtention(String str) {
        Calendar calendar = Calendar.getInstance();
        String[] strArrSplit = str.split(HtmlTags.TH);
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            String strConcat = new SimpleDateFormat(str2, Locale.getDefault()).format(calendar.getTime());
            char cCharAt = strConcat.charAt(strConcat.length() - 1);
            char cCharAt2 = strConcat.charAt(strConcat.length() - 2);
            char cCharAt3 = str2.charAt(str2.length() - 1);
            char cCharAt4 = str2.charAt(str2.length() - 2);
            if (cCharAt3 == 'd' && cCharAt4 == 'd') {
                if (cCharAt == '1' && (cCharAt2 == '0' || cCharAt2 == '2' || cCharAt2 == '3')) {
                    strConcat = strConcat.concat("st");
                } else if (cCharAt == '2' && (cCharAt2 == '0' || cCharAt2 == '2')) {
                    strConcat = strConcat.concat("nd");
                } else if (cCharAt == '3' && (cCharAt2 == '0' || cCharAt2 == '2')) {
                    strConcat = strConcat.concat("rd");
                } else if (cCharAt == '4' || cCharAt == '5' || cCharAt == '6' || cCharAt == '7' || cCharAt == '8' || cCharAt == '9' || cCharAt == '0') {
                    strConcat = strConcat.concat(HtmlTags.TH);
                }
            }
            sb.append(strConcat);
        }
        return sb.toString();
    }

    public static void buildToast(Context context, String str) {
    }

    private String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (z && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                z = false;
            } else {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean checkPermission(Context context, String str) {
        return la9.a(context, str) == 0;
    }

    private void copyFile(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(context.getFilesDir() + "/font/" + str);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i == -1) {
                    inputStreamOpen.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
        }
    }

    private Bitmap createNewIcon(Bitmap bitmap, int i, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, bitmap.getWidth(), bitmap.getHeight()), new RectF(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, i, i2), Matrix.ScaleToFit.CENTER);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private e7 getAdSize(Activity activity, FrameLayout frameLayout) {
        int iB;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f = displayMetrics.density;
        float width = frameLayout.getWidth();
        if (width == ColumnText.GLOBAL_SPACE_CHAR_RATIO) {
            width = displayMetrics.widthPixels;
        }
        int i = (int) (width / f);
        int i2 = e7.d;
        Resources resources = activity.getApplicationContext().getResources();
        DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
        int i3 = resources.getConfiguration().orientation;
        int iMin = Math.min(90, mn0.a(((double) mn0.b(displayMetrics2.heightPixels / displayMetrics2.density)) * 0.15d));
        if (i > 655) {
            iB = mn0.b((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            iB = 81;
        } else if (i > 526) {
            iB = mn0.b((i / 468.0f) * 60.0f);
        } else {
            iB = i > 432 ? 68 : mn0.b((i / 320.0f) * 50.0f);
        }
        return new e7(i, Math.max(Math.min(iB, iMin), 50), null, 52);
    }

    private String getDayNumberSuffix(int i) {
        String str = zXAusrmFrBIQHr.UOuRFBNSTx;
        if (i >= 11 && i <= 13) {
            return str;
        }
        int i2 = i % 10;
        if (i2 == 1) {
            return "st";
        }
        if (i2 != 2) {
            return i2 != 3 ? str : "rd";
        }
        return "nd";
    }

    private static String getPermissionType(String str) {
        String str2 = (str.equals("android.permission.ACCESS_MOCK_LOCATION") || str.equals("android.permission.ACCESS_COARSE_LOCATION") || str.equals("android.permission.ACCESS_FINE_LOCATION") || str.equals("com.google.android.providers.gsf.permission.READ_GSERVICES")) ? "Gps Permission," : "";
        if (str.equals("android.permission.READ_EXTERNAL_STORAGE") || str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            str2 = "Storage Permission,";
        }
        if (str.equals("android.permission.CAMERA")) {
            str2 = "Camera Permission,";
        }
        return (str.equals("com.android.vending.CHECK_LICENSE") || str.equals("android.permission.ACCESS_NETWORK_STATE") || str.equals("android.permission.INTERNET") || str.equals("android.permission.ACCESS_WIFI_STATE") || str.equals("android.permission.SYSTEM_ALERT_WINDOW") || str.equals("android.permission.WAKE_LOCK") || str.equals("android.permission.WRITE_SETTINGS") || str.equals("com.android.vending.BILLING") || str.equals("com.ebizzinfotech.DateTimeSignatureStampOnPhotos.gcm.permission.C2D_MESSAGE") || str.equals("com.google.android.c2dm.permission.RECEIVE") || str.equals("com.autostamper.datetimestampphoto.permission.C2D_MESSAGE") || str.equals("android.permission.RECEIVE_BOOT_COMPLETED")) ? "Other App Capabilities," : str2;
    }

    private String getPermissions(String[] strArr) {
        String strX = "";
        for (String str : strArr) {
            strX = eo7.x(strX, str, ",");
        }
        return strX;
    }

    private Boolean isAnyPackagePurchased(Context context) {
        return Boolean.FALSE;
    }

    public static void setFirebaseEve(Context context, String str) {
        if (context != null) {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
            Bundle bundle = new Bundle();
            bundle.putString("item_name", str);
            firebaseAnalytics.a("select_content", bundle);
        }
    }

    public static void setFirebaseUserProperty(Context context, String str, String str2) {
        if (context != null) {
            d09 d09Var = FirebaseAnalytics.getInstance(context).a;
            d09Var.getClass();
            d09Var.c(new vt8(d09Var, (String) null, str, (Object) str2, false));
        }
    }

    public static void watchYoutubeVideo(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:" + str));
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.youtube.com/watch?v=" + str));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(intent2);
        }
    }

    public void copyAssets(Context context, String str) {
        try {
            String[] list = context.getAssets().list("");
            if (list != null) {
                for (String str2 : list) {
                    if (!new File(str, str2).exists()) {
                        copyFile(context, str2);
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    public long dateDiffenceday(Date date, Date date2) {
        date2.getTime();
        date.getTime();
        return (int) ((date2.getTime() - date.getTime()) / 86400000);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void displayLocationSettingsRequest(final Context context) {
        c10 c10VarJ;
        boolean z;
        n5 n5Var = new n5(context);
        n5Var.b(ky3.a);
        w48 w48VarD = n5Var.d();
        w48VarD.connect();
        LocationRequest locationRequestG = LocationRequest.g();
        x8a.b(100);
        locationRequestG.d = 100;
        locationRequestG.o(10000L);
        locationRequestG.f = 5000L;
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequestG);
        ci4 ci4Var = ky3.c;
        ly3 ly3Var = new ly3(arrayList, true, false);
        ci4Var.getClass();
        xr8 xr8Var = new xr8(ci4Var, w48VarD, ly3Var);
        ReentrantLock reentrantLock = w48VarD.b;
        mi miVar = xr8Var.p;
        boolean zContainsKey = w48VarD.o.containsKey(xr8Var.o);
        String str = miVar != null ? miVar.c : "the API";
        StringBuilder sb = new StringBuilder(str.length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        bl8.a(sb.toString(), zContainsKey);
        reentrantLock.lock();
        try {
            k58 k58Var = w48VarD.d;
            if (k58Var == null) {
                w48VarD.h.add(xr8Var);
                c10VarJ = xr8Var;
            } else {
                c10VarJ = k58Var.j(xr8Var);
            }
            reentrantLock.unlock();
            nu5 nu5Var = new nu5() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.CommonFunction.2
                @Override // defpackage.nu5
                public void onResult(ny3 ny3Var) {
                    Status status = ny3Var.d;
                    int i = status.d;
                    if (i == 0) {
                        Log.i(CommonFunction.TAG, "All location settings are satisfied.");
                        return;
                    }
                    if (i != 6) {
                        if (i != 8502) {
                            return;
                        }
                        Log.i(CommonFunction.TAG, "Location settings are inadequate, and cannot be fixed here. Dialog not created.");
                    } else {
                        Log.i(CommonFunction.TAG, "Location settings are not satisfied. Show the user a dialog to upgrade location settings ");
                        try {
                            status.k(1, (Activity) context);
                        } catch (IntentSender.SendIntentException unused) {
                            Log.i(CommonFunction.TAG, "PendingIntent unable to execute request.");
                        }
                    }
                }
            };
            synchronized (c10VarJ.a) {
                try {
                    bl8.j("Result has already been consumed.", !c10VarJ.j);
                    synchronized (c10VarJ.a) {
                        z = c10VarJ.k;
                    }
                    if (z) {
                        return;
                    }
                    if (c10VarJ.e()) {
                        n10 n10Var = c10VarJ.b;
                        mu5 mu5VarG = c10VarJ.g();
                        ja jaVar = BasePendingResult.n;
                        n10Var.sendMessage(n10Var.obtainMessage(1, new Pair(nu5Var, mu5VarG)));
                    } else {
                        c10VarJ.f = nu5Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public String getCalculatedDate(String str, int i) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        calendar.add(6, i);
        return simpleDateFormat.format(new Date(calendar.getTimeInMillis()));
    }

    public String getDate(long j, String str) {
        if (str.contains("ddth")) {
            return getThFormat(HelperClass.date.getTime(), str);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        System.out.println(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return simpleDateFormat.format(calendar.getTime());
    }

    public String getDateTime(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            return simpleDateFormat.format(simpleDateFormat.parse(str2));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<DateTime> getDatearray(Context context) {
        return new SharePref(context).getDates(context, SharePref.arryDates);
    }

    public ArrayList<DateTime> getDatearrayHorizontal(Context context) {
        return new SharePref(context).getDates(context, SharePref.arryDates_horizontal);
    }

    public String getDeviceName() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? capitalize(str2) : fz7.h(new StringBuilder(), capitalize(str), " ", str2);
    }

    public String getFormat(String str) {
        if (str.equals("CLEAR")) {
            return "";
        }
        if (str.equals(":")) {
            return ":";
        }
        if ((str.contains("th)") || str.contains("st)") || str.contains("nd)") || str.contains("rd)")) && !str.contains("MMMM(")) {
            return "ddth";
        }
        if (str.equals("/")) {
            return "/";
        }
        if (str.equals(",")) {
            return ",";
        }
        if (str.equals(".")) {
            return ".";
        }
        if (str.equals("-")) {
            return "-";
        }
        if (str.contains("date(")) {
            return "dd";
        }
        if (str.equals("hh(12)")) {
            return "hh";
        }
        if (str.equals("hh(24)")) {
            return "HH";
        }
        if (str.equals("") || str.equalsIgnoreCase("select one") || str.equalsIgnoreCase("select")) {
            return "";
        }
        if (str.contains("second(")) {
            return "ss";
        }
        if (str.equals("AM")) {
            return "AM";
        }
        if (str.equals("am")) {
            return "am";
        }
        if (str.equals("PM")) {
            return "PM";
        }
        if (str.equals("pm")) {
            return "pm";
        }
        if (str.contains("EEEE(")) {
            return "EEEE";
        }
        if (str.contains("EEE(")) {
            return "EEE";
        }
        if (str.contains("E(")) {
            return "E";
        }
        if (str.contains("yyyy(")) {
            return "yyyy";
        }
        if (str.contains("yy(")) {
            return "yy";
        }
        if (str.contains("MMMM(")) {
            return "MMMM";
        }
        if (str.contains("MMM(")) {
            return "MMM";
        }
        if (str.contains("MM(")) {
            return "MM";
        }
        if (str.contains("Hour")) {
            return "HH";
        }
        if (str.contains("hour")) {
            return "hh";
        }
        if (str.contains("Minute(")) {
            return "mm";
        }
        if (str.contains("a(")) {
            return HtmlTags.A;
        }
        return str.equalsIgnoreCase("SPACE") ? " " : str;
    }

    public String getLatLong(int i, double d, double d2, boolean z) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (z && Double.compare(d, this.tmp.doubleValue()) == 0 && Double.compare(d2, this.tmp.doubleValue()) == 0) {
            return "0";
        }
        if (i == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("###.#####");
            sb.append(decimalFormat.format(Math.abs(d)));
            sb.append("°");
            sb2.append(decimalFormat.format(Math.abs(d2)));
            sb2.append("°");
        } else if (i == 1) {
            String[] strArrSplit = Location.convert(Math.abs(d), 1).split(":");
            String[] strArrSplit2 = Location.convert(Math.abs(d2), 1).split(":");
            new DecimalFormat("###.###");
            sb.append(strArrSplit[0]);
            sb.append("° ");
            sb.append(strArrSplit[1]);
            sb.append("'");
            sb2.append(strArrSplit2[0]);
            sb2.append("° ");
            sb2.append(strArrSplit2[1]);
            sb2.append("'");
        } else if (i == 2) {
            String[] strArrSplit3 = Location.convert(Math.abs(d), 2).split(":");
            String[] strArrSplit4 = Location.convert(Math.abs(d2), 2).split(":");
            new DecimalFormat("###.#");
            sb.append(strArrSplit3[0]);
            sb.append("° ");
            sb.append(strArrSplit3[1]);
            sb.append("' ");
            sb.append(strArrSplit3[2]);
            sb.append("\"");
            sb2.append(strArrSplit4[0]);
            sb2.append("° ");
            sb2.append(strArrSplit4[1]);
            sb2.append("' ");
            sb2.append(strArrSplit4[2]);
            sb2.append("\"");
        } else {
            DecimalFormat decimalFormat2 = new DecimalFormat("###.#####");
            sb.append(decimalFormat2.format(Math.abs(d)));
            sb.append("°");
            sb2.append(decimalFormat2.format(Math.abs(d2)));
            sb2.append("°");
        }
        if (d < 0.0d) {
            sb.append(" S");
        } else {
            sb.append(" N");
        }
        if (d2 < 0.0d) {
            sb2.append(" W");
        } else {
            sb2.append(" E");
        }
        return ((Object) sb) + " " + ((Object) sb2);
    }

    public int getLocationMode(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public Bitmap getResizedBitmap(Bitmap bitmap, int i, int i2) {
        return Bitmap.createScaledBitmap(bitmap, i, i2, false);
    }

    public String getThFormat(long j, String str) {
        String strX;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        String dayNumberSuffix = getDayNumberSuffix(calendar.get(5));
        if (str.contains("ddth")) {
            strX = str.replace("ddth", "d'" + dayNumberSuffix + "'");
        } else {
            strX = eo7.x("d'", dayNumberSuffix, "'");
        }
        return new SimpleDateFormat(strX).format(calendar.getTime());
    }

    public void redirectToPlayStore(Activity activity) {
        String packageName = activity.getPackageName();
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }

    public String setDateTimeFormat(Context context, int i) {
        ArrayList arrayListT = new gc1(context).t();
        Calendar calendar = Calendar.getInstance();
        if (i <= arrayListT.size() - 1) {
            return ((DateTime) arrayListT.get(i)).getDate_format().contains("ddth") ? getThFormat(calendar.getTimeInMillis(), ((DateTime) arrayListT.get(i)).getDate_format()) : new SimpleDateFormat(((DateTime) arrayListT.get(i)).getDate_format(), Locale.getDefault()).format(calendar.getTime());
        }
        return "";
    }

    public String setDateTimeFormatNew(Context context, int i, ArrayList<DateTime> arrayList) {
        Calendar calendar = Calendar.getInstance();
        return arrayList.get(i).getDate_format().contains("ddth") ? getThFormat(calendar.getTimeInMillis(), arrayList.get(i).getDate_format()) : new SimpleDateFormat(arrayList.get(i).getDate_format(), Locale.getDefault()).format(calendar.getTime());
    }

    public void setLocale(int i, Activity activity) {
        String str;
        switch (i) {
            case 0:
                str = "en";
                break;
            case 1:
                str = "af";
                break;
            case 2:
                str = "in";
                break;
            case 3:
                str = "pt";
                break;
            case 4:
                str = "ru";
                break;
            case 5:
                str = "fr";
                break;
            case 6:
                str = "es";
                break;
            case 7:
                str = "de";
                break;
            case 8:
                str = "ms";
                break;
            case 9:
                str = HtmlTags.TR;
                break;
            case 10:
                str = HtmlTags.TH;
                break;
            case 11:
                str = "vi";
                break;
            case 12:
                str = "ko";
                break;
            default:
                str = "";
                break;
        }
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        activity.getResources().updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
        activity.onConfigurationChanged(configuration);
    }

    public Typeface setTypefaceFontStyle(Context context, String str) {
        File file = new File(context.getFilesDir(), eo7.w("font/", str));
        Typeface typefaceCreateFromFile = null;
        if (!file.exists()) {
            return null;
        }
        try {
            typefaceCreateFromFile = Typeface.createFromFile(file);
        } catch (Exception unused) {
        }
        return typefaceCreateFromFile != null ? typefaceCreateFromFile : Typeface.createFromAsset(context.getAssets(), "ROBOTO_REGULAR.TTF");
    }

    public void setTypefacefromassets(Context context, TextView textView, String str) {
        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), str));
    }

    public String setdate(String str) {
        Log.e("LLLL 1", "" + str);
        Log.e("LLLL 2", "" + str.contains(HtmlTags.TH));
        if (str.equals("CLEAR")) {
            return "";
        }
        if ((str.contains("th)") || str.contains("st)") || str.contains("nd)") || str.contains("rd)")) && !str.contains("MMMM(")) {
            return getThFormat(HelperClass.date.getTime(), str);
        }
        if (str.equals("hh(12)")) {
            return getDate(HelperClass.date.getTime(), "hh");
        }
        if (str.equals("hh(24)")) {
            return getDate(HelperClass.date.getTime(), "HH");
        }
        if (str.equals("") || str.equalsIgnoreCase("select one") || str.equalsIgnoreCase("select")) {
            return "";
        }
        if (str.equals("AM")) {
            return "AM";
        }
        if (str.equals("am")) {
            return "am";
        }
        if (str.equals("PM")) {
            return "PM";
        }
        if (str.equals("pm")) {
            return "pm";
        }
        if (str.equals(":")) {
            return ":";
        }
        if (str.equals("/")) {
            return "/";
        }
        if (str.equals(",")) {
            return ",";
        }
        if (str.equals(".")) {
            return ".";
        }
        if (str.equals("-")) {
            return "-";
        }
        if (str.contains("second(")) {
            return getDate(HelperClass.date.getTime(), "ss");
        }
        if (str.contains("date(")) {
            return getDate(HelperClass.date.getTime(), "dd");
        }
        if (str.contains("EEEE(")) {
            return getDate(HelperClass.date.getTime(), "EEEE");
        }
        if (str.contains("EEE(")) {
            return getDate(HelperClass.date.getTime(), "EEE");
        }
        if (str.contains("yyyy(")) {
            return getDate(HelperClass.date.getTime(), "yyyy");
        }
        if (str.contains("yy(")) {
            return getDate(HelperClass.date.getTime(), "yy");
        }
        if (str.contains("E(")) {
            return getDate(HelperClass.date.getTime(), "E");
        }
        if (str.contains("MMMM(")) {
            return getDate(HelperClass.date.getTime(), fuEBEyZ.YIrIUDWWMl);
        }
        if (str.contains("MMM(")) {
            return getDate(HelperClass.date.getTime(), "MMM");
        }
        if (str.contains("MM(")) {
            return getDate(HelperClass.date.getTime(), "MM");
        }
        if (str.equalsIgnoreCase("SPACE")) {
            return " ";
        }
        if (str.contains("Hour")) {
            return getDate(HelperClass.date.getTime(), "HH");
        }
        if (str.contains(WYysgTwsdXDD.BDshViL)) {
            return getDate(HelperClass.date.getTime(), "hh");
        }
        if (str.contains("Minute(")) {
            return getDate(HelperClass.date.getTime(), "mm");
        }
        return str.contains("a(") ? getDate(HelperClass.date.getTime(), HtmlTags.A) : getDate(HelperClass.date.getTime(), str);
    }

    public void showSimpleDialog(Context context, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.create();
        builder.setPositiveButton(context.getResources().getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.CommonFunction.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.setCancelable(true);
        builder.show();
    }

    public void showSnackBar(View view, String str) {
        if (view != null) {
            try {
                cc6.i(view, "" + str, -1).k();
            } catch (IllegalArgumentException | IllegalStateException | NullPointerException unused) {
            }
        }
    }

    public void stopLocationUpdates() {
        px3 px3Var;
        pk2 pk2Var = this.mFusedLocationClient;
        if (pk2Var == null || (px3Var = this.mLocationCallback) == null) {
            return;
        }
        ((fp8) pk2Var).d(lf3.v(px3Var, px3.class.getSimpleName()), 2418).n(bl1.f, wu0.j);
    }

    public String stringWithText(int i, String str) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String strK7;
        String strK8;
        String strK9;
        String strK10;
        String strK11;
        String strK12;
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length == 3) {
            float length = strArrSplit[0].length();
            float length2 = strArrSplit[1].length();
            float length3 = strArrSplit[2].length();
            if (length > length2 && length > length3) {
                float f = (length - length3) / 2.0f;
                float f2 = (length - length2) / 2.0f;
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                if (f2 == 0.5d) {
                    f2 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                if (f == 0.5d) {
                    f = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                for (int i2 = 0; i2 < f2; i2++) {
                    sb2.append("  ");
                }
                for (int i3 = 0; i3 < f; i3++) {
                    sb.append("  ");
                }
                if (i == 0 || i == 2 || i == 5 || i == 6) {
                    strK11 = sb2.toString() + strArrSplit[1];
                    strK12 = sb.toString() + strArrSplit[2];
                } else {
                    strK11 = dt7.k(new StringBuilder(), strArrSplit[1], sb2);
                    strK12 = dt7.k(new StringBuilder(), strArrSplit[2], sb);
                }
                StringBuilder sb3 = new StringBuilder();
                fs7.m(sb3, strArrSplit[0], "\n", strK11, "\n");
                sb3.append(strK12);
                return sb3.toString();
            }
            if (length2 > length && length2 > length3) {
                float f3 = (length2 - length) / 2.0f;
                float f4 = (length2 - length3) / 2.0f;
                StringBuilder sb4 = new StringBuilder();
                StringBuilder sb5 = new StringBuilder();
                if (f3 == 0.5d) {
                    f3 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                if (f4 == 0.5d) {
                    f4 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                for (int i4 = 0; i4 < f3; i4++) {
                    sb4.append("  ");
                }
                for (int i5 = 0; i5 < f4; i5++) {
                    sb5.append("  ");
                }
                if (i == 0 || i == 2 || i == 5 || i == 6) {
                    strK9 = sb4.toString() + strArrSplit[0];
                    strK10 = sb5.toString() + strArrSplit[2];
                } else {
                    strK9 = dt7.k(new StringBuilder(), strArrSplit[0], sb4);
                    strK10 = dt7.k(new StringBuilder(), strArrSplit[2], sb5);
                }
                return fz7.h(dt7.m(strK9, "\n"), strArrSplit[1], "\n", strK10);
            }
            if (length3 > length2 && length3 > length) {
                float f5 = (length3 - length) / 2.0f;
                float f6 = (length3 - length2) / 2.0f;
                StringBuilder sb6 = new StringBuilder();
                StringBuilder sb7 = new StringBuilder();
                if (f5 == 0.5d) {
                    f5 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                if (f6 == 0.5d) {
                    f6 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                for (int i6 = 0; i6 < f5; i6++) {
                    sb6.append("  ");
                }
                for (int i7 = 0; i7 < f6; i7++) {
                    sb7.append("  ");
                }
                if (i == 0 || i == 2 || i == 5 || i == 6) {
                    strK7 = sb6.toString() + strArrSplit[0];
                    strK8 = sb7.toString() + strArrSplit[1];
                } else {
                    strK7 = dt7.k(new StringBuilder(), strArrSplit[0], sb6);
                    strK8 = dt7.k(new StringBuilder(), strArrSplit[1], sb7);
                }
                return strK7 + "\n" + strK8 + "\n" + strArrSplit[2];
            }
            if (length == length2) {
                if (length > length3) {
                    float f7 = (length - length3) / 2.0f;
                    StringBuilder sb8 = new StringBuilder();
                    float f8 = ((double) f7) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f7;
                    for (int i8 = 0; i8 < f8; i8++) {
                        sb8.append("  ");
                    }
                    String strK13 = (i == 0 || i == 2 || i == 5 || i == 6) ? sb8.toString() + strArrSplit[2] : dt7.k(new StringBuilder(), strArrSplit[2], sb8);
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(strArrSplit[0]);
                    sb9.append("\n");
                    return fz7.h(sb9, strArrSplit[1], "\n", strK13);
                }
                if (length3 <= length) {
                    return "";
                }
                float f9 = (length3 - length) / 2.0f;
                float f10 = (length3 - length2) / 2.0f;
                StringBuilder sb10 = new StringBuilder();
                StringBuilder sb11 = new StringBuilder();
                if (f9 == 0.5d) {
                    f9 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                if (f10 == 0.5d) {
                    f10 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                for (int i9 = 0; i9 < f9; i9++) {
                    sb10.append("  ");
                }
                for (int i10 = 0; i10 < f10; i10++) {
                    sb11.append("  ");
                }
                if (i == 0 || i == 2 || i == 5 || i == 6) {
                    strK5 = sb10.toString() + strArrSplit[0];
                    strK6 = sb11.toString() + strArrSplit[1];
                } else {
                    strK5 = dt7.k(new StringBuilder(), strArrSplit[0], sb10);
                    strK6 = dt7.k(new StringBuilder(), strArrSplit[1], sb11);
                }
                return strK5 + "\n" + strK6 + "\n" + strArrSplit[2];
            }
            if (length2 == length3) {
                if (length2 > length) {
                    float f11 = (length2 - length) / 2.0f;
                    StringBuilder sb12 = new StringBuilder();
                    float f12 = ((double) f11) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f11;
                    for (int i11 = 0; i11 < f12; i11++) {
                        sb12.append("  ");
                    }
                    StringBuilder sbM = dt7.m((i == 0 || i == 2 || i == 5 || i == 6) ? sb12.toString() + strArrSplit[0] : dt7.k(new StringBuilder(), strArrSplit[0], sb12), "\n");
                    sbM.append(strArrSplit[1]);
                    sbM.append("\n");
                    sbM.append(strArrSplit[2]);
                    return sbM.toString();
                }
                if (length2 >= length) {
                    return "";
                }
                float f13 = (length - length3) / 2.0f;
                float f14 = (length - length2) / 2.0f;
                StringBuilder sb13 = new StringBuilder();
                StringBuilder sb14 = new StringBuilder();
                if (f14 == 0.5d) {
                    f14 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                if (f13 == 0.5d) {
                    f13 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                for (int i12 = 0; i12 < f14; i12++) {
                    sb14.append("  ");
                }
                for (int i13 = 0; i13 < f13; i13++) {
                    sb13.append("  ");
                }
                if (i == 0 || i == 2 || i == 5 || i == 6) {
                    strK3 = sb14.toString() + strArrSplit[1];
                    strK4 = sb13.toString() + strArrSplit[2];
                } else {
                    strK3 = dt7.k(new StringBuilder(), strArrSplit[1], sb14);
                    strK4 = dt7.k(new StringBuilder(), strArrSplit[2], sb13);
                }
                StringBuilder sb15 = new StringBuilder();
                fs7.m(sb15, strArrSplit[0], "\n", strK3, "\n");
                sb15.append(strK4);
                return sb15.toString();
            }
            if (length == length3) {
                if (length > length2) {
                    float f15 = (length - length2) / 2.0f;
                    StringBuilder sb16 = new StringBuilder();
                    float f16 = ((double) f15) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f15;
                    for (int i14 = 0; i14 < f16; i14++) {
                        sb16.append("  ");
                    }
                    String strK14 = (i == 0 || i == 2 || i == 5 || i == 6) ? sb16.toString() + strArrSplit[1] : dt7.k(new StringBuilder(), strArrSplit[1], sb16);
                    StringBuilder sb17 = new StringBuilder();
                    fs7.m(sb17, strArrSplit[0], "\n", strK14, "\n");
                    sb17.append(strArrSplit[2]);
                    return sb17.toString();
                }
                if (length2 <= length) {
                    return "";
                }
                float f17 = (length2 - length) / 2.0f;
                float f18 = (length2 - length3) / 2.0f;
                StringBuilder sb18 = new StringBuilder();
                StringBuilder sb19 = new StringBuilder();
                if (f17 == 0.5d) {
                    f17 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                if (f18 == 0.5d) {
                    f18 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                }
                for (int i15 = 0; i15 < f17; i15++) {
                    sb18.append("  ");
                }
                for (int i16 = 0; i16 < f18; i16++) {
                    sb19.append("  ");
                }
                if (i == 0 || i == 2 || i == 5 || i == 6) {
                    strK = sb18.toString() + strArrSplit[0];
                    strK2 = sb19.toString() + strArrSplit[2];
                } else {
                    strK = dt7.k(new StringBuilder(), strArrSplit[0], sb18);
                    strK2 = dt7.k(new StringBuilder(), strArrSplit[2], sb19);
                }
                return fz7.h(dt7.m(strK, "\n"), strArrSplit[1], "\n", strK2);
            }
        } else if (strArrSplit.length == 2) {
            float length4 = strArrSplit[0].length();
            float length5 = strArrSplit[1].length();
            if (length4 > length5) {
                float f19 = (length4 - length5) / 2.0f;
                float f20 = ((double) f19) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f19;
                StringBuilder sb20 = new StringBuilder();
                for (int i17 = 0; i17 < f20; i17++) {
                    sb20.append("  ");
                }
                return fz7.h(new StringBuilder(), strArrSplit[0], "\n", (i == 0 || i == 2 || i == 5 || i == 6) ? sb20.toString() + strArrSplit[1] : dt7.k(new StringBuilder(), strArrSplit[1], sb20));
            }
            if (length5 > length4) {
                float f21 = (length5 - length4) / 2.0f;
                float f22 = ((double) f21) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f21;
                StringBuilder sb21 = new StringBuilder();
                for (int i18 = 0; i18 < f22; i18++) {
                    sb21.append("  ");
                }
                StringBuilder sbM2 = dt7.m((i == 0 || i == 2 || i == 5 || i == 6) ? sb21.toString() + strArrSplit[0] : dt7.k(new StringBuilder(), strArrSplit[0], sb21), "\n");
                sbM2.append(strArrSplit[1]);
                return sbM2.toString();
            }
            if (length4 != length5) {
                return "";
            }
        }
        return str;
    }

    public String stringWithTextNoSpace(int i, String str) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length != 3) {
            if (strArrSplit.length != 2) {
                return str;
            }
            float length = strArrSplit[0].length();
            float length2 = strArrSplit[1].length();
            if (length > length2) {
                float f = (length - length2) / 2.0f;
                float f2 = ((double) f) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f;
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < f2; i2++) {
                    sb.append("");
                }
                return fz7.h(new StringBuilder(), strArrSplit[0], "\n", (i == 0 || i == 2 || i == 5 || i == 6) ? sb.toString() + strArrSplit[1] : dt7.k(new StringBuilder(), strArrSplit[1], sb));
            }
            if (length2 <= length) {
                return strArrSplit[0] + "\n" + strArrSplit[1];
            }
            float f3 = (length2 - length) / 2.0f;
            float f4 = ((double) f3) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f3;
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < f4; i3++) {
                sb2.append("");
            }
            StringBuilder sbM = dt7.m((i == 0 || i == 2 || i == 5 || i == 6) ? sb2.toString() + strArrSplit[0] : dt7.k(new StringBuilder(), strArrSplit[0], sb2), "\n");
            sbM.append(strArrSplit[1]);
            return sbM.toString();
        }
        float length3 = strArrSplit[0].length();
        float length4 = strArrSplit[1].length();
        float length5 = strArrSplit[2].length();
        if (length3 > length4 && length3 > length5) {
            float f5 = (length3 - length5) / 2.0f;
            float f6 = (length3 - length4) / 2.0f;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            if (f6 == 0.5d) {
                f6 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            float f7 = ((double) f5) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f5;
            for (int i4 = 0; i4 < f6; i4++) {
                sb4.append("");
            }
            for (int i5 = 0; i5 < f7; i5++) {
                sb3.append("");
            }
            if (i == 0 || i == 2 || i == 5 || i == 6) {
                strK5 = sb4.toString() + strArrSplit[1];
                strK6 = sb3.toString() + strArrSplit[2];
            } else {
                strK5 = dt7.k(new StringBuilder(), strArrSplit[1], sb4);
                strK6 = dt7.k(new StringBuilder(), strArrSplit[2], sb3);
            }
            StringBuilder sb5 = new StringBuilder();
            fs7.m(sb5, strArrSplit[0], "\n", strK5, "\n");
            sb5.append(strK6);
            return sb5.toString();
        }
        if (length4 > length3 && length4 > length5) {
            float f8 = (length4 - length3) / 2.0f;
            float f9 = (length4 - length5) / 2.0f;
            StringBuilder sb6 = new StringBuilder();
            StringBuilder sb7 = new StringBuilder();
            if (f8 == 0.5d) {
                f8 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            if (f9 == 0.5d) {
                f9 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            for (int i6 = 0; i6 < f8; i6++) {
                sb6.append("");
            }
            for (int i7 = 0; i7 < f9; i7++) {
                sb7.append("");
            }
            if (i == 0 || i == 2 || i == 5 || i == 6) {
                strK3 = sb6.toString() + strArrSplit[0];
                strK4 = sb7.toString() + strArrSplit[2];
            } else {
                strK3 = dt7.k(new StringBuilder(), strArrSplit[0], sb6);
                strK4 = dt7.k(new StringBuilder(), strArrSplit[2], sb7);
            }
            return fz7.h(dt7.m(strK3, "\n"), strArrSplit[1], "\n", strK4);
        }
        if (length5 <= length4 || length5 <= length3) {
            return strArrSplit[0] + "\n" + strArrSplit[1] + "\n" + strArrSplit[2];
        }
        float f10 = (length5 - length3) / 2.0f;
        float f11 = (length5 - length4) / 2.0f;
        StringBuilder sb8 = new StringBuilder();
        StringBuilder sb9 = new StringBuilder();
        if (f10 == 0.5d) {
            f10 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        }
        if (f11 == 0.5d) {
            f11 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        }
        for (int i8 = 0; i8 < f10; i8++) {
            sb8.append("");
        }
        for (int i9 = 0; i9 < f11; i9++) {
            sb9.append("");
        }
        if (i == 0 || i == 2 || i == 5 || i == 6) {
            strK = sb8.toString() + strArrSplit[0];
            strK2 = sb9.toString() + strArrSplit[1];
        } else {
            strK = dt7.k(new StringBuilder(), strArrSplit[0], sb8);
            strK2 = dt7.k(new StringBuilder(), strArrSplit[1], sb9);
        }
        return strK + "\n" + strK2 + "\n" + strArrSplit[2];
    }

    public String stringWithTextSingleSpace(int i, String str) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String strK7;
        String strK8;
        String strK9;
        String strK10;
        String strK11;
        String strK12;
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length != 3) {
            if (strArrSplit.length == 2) {
                float length = strArrSplit[0].length();
                float length2 = strArrSplit[1].length();
                if (length > length2) {
                    float f = (length - length2) / 2.0f;
                    float f2 = ((double) f) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f;
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < f2; i2++) {
                        sb.append(" ");
                    }
                    return fz7.h(new StringBuilder(), strArrSplit[0], "\n", (i == 0 || i == 2 || i == 5 || i == 6) ? sb.toString() + strArrSplit[1] : dt7.k(new StringBuilder(), strArrSplit[1], sb));
                }
                if (length2 > length) {
                    float f3 = (length2 - length) / 2.0f;
                    float f4 = ((double) f3) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f3;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i3 = 0; i3 < f4; i3++) {
                        sb2.append(" ");
                    }
                    StringBuilder sbM = dt7.m((i == 0 || i == 2 || i == 5 || i == 6) ? sb2.toString() + strArrSplit[0] : dt7.k(new StringBuilder(), strArrSplit[0], sb2), "\n");
                    sbM.append(strArrSplit[1]);
                    return sbM.toString();
                }
                if (length != length2) {
                    return null;
                }
            }
            return str;
        }
        float length3 = strArrSplit[0].length();
        float length4 = strArrSplit[1].length();
        float length5 = strArrSplit[2].length();
        if (length3 > length4 && length3 > length5) {
            float f5 = (length3 - length5) / 2.0f;
            float f6 = (length3 - length4) / 2.0f;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            if (f6 == 0.5d) {
                f6 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            float f7 = ((double) f5) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f5;
            for (int i4 = 0; i4 < f6; i4++) {
                sb4.append(" ");
            }
            for (int i5 = 0; i5 < f7; i5++) {
                sb3.append(" ");
            }
            if (i == 0 || i == 2 || i == 5 || i == 6) {
                strK11 = sb4.toString() + strArrSplit[1];
                strK12 = sb3.toString() + strArrSplit[2];
            } else {
                strK11 = dt7.k(new StringBuilder(), strArrSplit[1], sb4);
                strK12 = dt7.k(new StringBuilder(), strArrSplit[2], sb3);
            }
            StringBuilder sb5 = new StringBuilder();
            fs7.m(sb5, strArrSplit[0], "\n", strK11, "\n");
            sb5.append(strK12);
            return sb5.toString();
        }
        if (length4 > length3 && length4 > length5) {
            float f8 = (length4 - length3) / 2.0f;
            float f9 = (length4 - length5) / 2.0f;
            StringBuilder sb6 = new StringBuilder();
            StringBuilder sb7 = new StringBuilder();
            if (f8 == 0.5d) {
                f8 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            if (f9 == 0.5d) {
                f9 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            for (int i6 = 0; i6 < f8; i6++) {
                sb6.append(" ");
            }
            for (int i7 = 0; i7 < f9; i7++) {
                sb7.append(" ");
            }
            if (i == 0 || i == 2 || i == 5 || i == 6) {
                strK9 = sb6.toString() + strArrSplit[0];
                strK10 = sb7.toString() + strArrSplit[2];
            } else {
                strK9 = dt7.k(new StringBuilder(), strArrSplit[0], sb6);
                strK10 = dt7.k(new StringBuilder(), strArrSplit[2], sb7);
            }
            return fz7.h(dt7.m(strK9, "\n"), strArrSplit[1], "\n", strK10);
        }
        if (length5 > length4 && length5 > length3) {
            float f10 = (length5 - length3) / 2.0f;
            float f11 = (length5 - length4) / 2.0f;
            StringBuilder sb8 = new StringBuilder();
            StringBuilder sb9 = new StringBuilder();
            if (f10 == 0.5d) {
                f10 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            if (f11 == 0.5d) {
                f11 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            for (int i8 = 0; i8 < f10; i8++) {
                sb8.append(" ");
            }
            for (int i9 = 0; i9 < f11; i9++) {
                sb9.append(" ");
            }
            if (i == 0 || i == 2 || i == 5 || i == 6) {
                strK7 = sb8.toString() + strArrSplit[0];
                strK8 = sb9.toString() + strArrSplit[1];
            } else {
                strK7 = dt7.k(new StringBuilder(), strArrSplit[0], sb8);
                strK8 = dt7.k(new StringBuilder(), strArrSplit[1], sb9);
            }
            return strK7 + "\n" + strK8 + "\n" + strArrSplit[2];
        }
        if (length3 == length4) {
            if (length3 > length5) {
                float f12 = (length3 - length5) / 2.0f;
                StringBuilder sb10 = new StringBuilder();
                float f13 = ((double) f12) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f12;
                for (int i10 = 0; i10 < f13; i10++) {
                    sb10.append(" ");
                }
                String strK13 = (i == 0 || i == 2 || i == 5 || i == 6) ? sb10.toString() + strArrSplit[2] : dt7.k(new StringBuilder(), strArrSplit[2], sb10);
                StringBuilder sb11 = new StringBuilder();
                sb11.append(strArrSplit[0]);
                sb11.append("\n");
                return fz7.h(sb11, strArrSplit[1], "\n", strK13);
            }
            if (length5 <= length3) {
                return null;
            }
            float f14 = (length5 - length3) / 2.0f;
            float f15 = (length5 - length4) / 2.0f;
            StringBuilder sb12 = new StringBuilder();
            StringBuilder sb13 = new StringBuilder();
            if (f14 == 0.5d) {
                f14 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            if (f15 == 0.5d) {
                f15 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            for (int i11 = 0; i11 < f14; i11++) {
                sb12.append(" ");
            }
            for (int i12 = 0; i12 < f15; i12++) {
                sb13.append(" ");
            }
            if (i == 0 || i == 2 || i == 5 || i == 6) {
                strK5 = sb12.toString() + strArrSplit[0];
                strK6 = sb13.toString() + strArrSplit[1];
            } else {
                strK5 = dt7.k(new StringBuilder(), strArrSplit[0], sb12);
                strK6 = dt7.k(new StringBuilder(), strArrSplit[1], sb13);
            }
            return strK5 + "\n" + strK6 + "\n" + strArrSplit[2];
        }
        if (length4 != length5) {
            if (length3 != length5) {
                return null;
            }
            if (length3 > length4) {
                float f16 = (length3 - length4) / 2.0f;
                StringBuilder sb14 = new StringBuilder();
                float f17 = ((double) f16) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f16;
                for (int i13 = 0; i13 < f17; i13++) {
                    sb14.append(" ");
                }
                String strK14 = (i == 0 || i == 2 || i == 5 || i == 6) ? sb14.toString() + strArrSplit[1] : dt7.k(new StringBuilder(), strArrSplit[1], sb14);
                StringBuilder sb15 = new StringBuilder();
                fs7.m(sb15, strArrSplit[0], "\n", strK14, "\n");
                sb15.append(strArrSplit[2]);
                return sb15.toString();
            }
            if (length4 <= length3) {
                return null;
            }
            float f18 = (length4 - length3) / 2.0f;
            float f19 = (length4 - length5) / 2.0f;
            StringBuilder sb16 = new StringBuilder();
            StringBuilder sb17 = new StringBuilder();
            if (f18 == 0.5d) {
                f18 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            if (f19 == 0.5d) {
                f19 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
            }
            for (int i14 = 0; i14 < f18; i14++) {
                sb16.append(" ");
            }
            for (int i15 = 0; i15 < f19; i15++) {
                sb17.append(" ");
            }
            if (i == 0 || i == 2 || i == 5 || i == 6) {
                strK = sb16.toString() + strArrSplit[0];
                strK2 = sb17.toString() + strArrSplit[2];
            } else {
                strK = dt7.k(new StringBuilder(), strArrSplit[0], sb16);
                strK2 = dt7.k(new StringBuilder(), strArrSplit[2], sb17);
            }
            return fz7.h(dt7.m(strK, "\n"), strArrSplit[1], "\n", strK2);
        }
        if (length4 > length3) {
            float f20 = (length4 - length3) / 2.0f;
            StringBuilder sb18 = new StringBuilder();
            float f21 = ((double) f20) == 0.5d ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : f20;
            for (int i16 = 0; i16 < f21; i16++) {
                sb18.append(" ");
            }
            StringBuilder sbM2 = dt7.m((i == 0 || i == 2 || i == 5 || i == 6) ? sb18.toString() + strArrSplit[0] : dt7.k(new StringBuilder(), strArrSplit[0], sb18), "\n");
            sbM2.append(strArrSplit[1]);
            sbM2.append("\n");
            sbM2.append(strArrSplit[2]);
            return sbM2.toString();
        }
        if (length4 >= length3) {
            return null;
        }
        float f22 = (length3 - length5) / 2.0f;
        float f23 = (length3 - length4) / 2.0f;
        StringBuilder sb19 = new StringBuilder();
        StringBuilder sb20 = new StringBuilder();
        if (f23 == 0.5d) {
            f23 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        }
        if (f22 == 0.5d) {
            f22 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        }
        for (int i17 = 0; i17 < f23; i17++) {
            sb20.append(" ");
        }
        for (int i18 = 0; i18 < f22; i18++) {
            sb19.append(" ");
        }
        if (i == 0 || i == 2 || i == 5 || i == 6) {
            strK3 = sb20.toString() + strArrSplit[1];
            strK4 = sb19.toString() + strArrSplit[2];
        } else {
            strK3 = dt7.k(new StringBuilder(), strArrSplit[1], sb20);
            strK4 = dt7.k(new StringBuilder(), strArrSplit[2], sb19);
        }
        StringBuilder sb21 = new StringBuilder();
        fs7.m(sb21, strArrSplit[0], "\n", strK3, "\n");
        sb21.append(strK4);
        return sb21.toString();
    }

    public boolean validateString(String str) {
        return (str == null || str.isEmpty() || str.length() <= 0 || str.equals("null")) ? false : true;
    }
}