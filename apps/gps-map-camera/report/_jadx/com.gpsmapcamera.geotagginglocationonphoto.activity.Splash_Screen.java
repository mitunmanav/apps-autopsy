package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import androidx.media.LPcH.FSXa;
import com.google.android.material.bottomappbar.fQ.ohAxISostGa;
import com.gpsmapcamera.geotagginglocationonphoto.LocalNotification.AlarmReceiver;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.Splash_Screen;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.itextpdf.text.io.PagedChannelRandomAccessSource;
import com.onesignal.location.Mp.JtDQJ;
import defpackage.a7;
import defpackage.a8a;
import defpackage.aj9;
import defpackage.bj;
import defpackage.c66;
import defpackage.e65;
import defpackage.gc1;
import defpackage.ge4;
import defpackage.h40;
import defpackage.ki5;
import defpackage.l40;
import defpackage.la9;
import defpackage.nd6;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class Splash_Screen extends bj implements ki5 {
    public static final /* synthetic */ int P = 0;
    public Handler B;
    public SP C;
    public mo1 D;
    public boolean E;
    public List F;
    public PurchaseHelper G;
    public boolean H;
    public aj9 I;
    public gc1 J;
    public h40 L;
    public RelativeLayout M;
    public boolean K = false;
    public final AtomicBoolean N = new AtomicBoolean(false);
    public final nd6 O = new nd6(this);

    public final void A() {
        new SP(this).getString(this, SP.ADS_STATUS, "1");
        this.E = this.C.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) || this.C.getBoolean(this, HelperClass.IS_SUBSCRIBE, false);
        if (AllAdsApproval.iSSplashFS(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                int i2 = RemoteAdData.SPLASH_SCREEN_FS_TYPE;
                if (i2 == 1) {
                    x();
                } else if (i2 == 2) {
                    y();
                }
            } else if (i == 1) {
                x();
            } else if (i == 2) {
                y();
            }
        }
        final int i3 = 3;
        this.B.postDelayed(new Runnable(this) { // from class: md6
            public final /* synthetic */ Splash_Screen b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                Splash_Screen splash_Screen = this.b;
                switch (i4) {
                    case 0:
                        int i5 = Splash_Screen.P;
                        if (HelperClass.centrebitmap == null) {
                            HelperClass.centrebitmap = HelperClass.convertDrawableToImage(splash_Screen, R.drawable.duv2_centre_white);
                        }
                        if (HelperClass.centrebitmap_yellow == null) {
                            HelperClass.centrebitmap_yellow = HelperClass.convertDrawableToImage(splash_Screen, R.drawable.duv2_centre_yellow);
                        }
                        break;
                    case 1:
                        int i6 = Splash_Screen.P;
                        if (!splash_Screen.C.getBoolean(splash_Screen, SP.DEFAULT_NOTE, false)) {
                            splash_Screen.J.S(Default.notes_desc, Default.notes_title);
                            splash_Screen.C.setBoolean(splash_Screen, SP.DEFAULT_NOTE, true);
                            splash_Screen.C.setString(splash_Screen, "notes", "Note :Captured by GPS Map Camera");
                        }
                        break;
                    case 2:
                        int i7 = Splash_Screen.P;
                        int integer = splash_Screen.C.getInteger(splash_Screen, HelperClass.TOTAL_TIME_APP_OPEN, 0);
                        if (integer == 0) {
                            splash_Screen.C.setLong(splash_Screen, HelperClass.FIRST_TIME_OPEN_DATE, System.currentTimeMillis());
                        }
                        int i8 = integer + 1;
                        if (splash_Screen.E) {
                            splash_Screen.C.setInteger(splash_Screen, HelperClass.TOTAL_TIME_APP_OPEN, i8);
                            break;
                        } else {
                            new AlarmReceiver();
                            new SP(splash_Screen).setLong(splash_Screen, SP.OPEN_TIME, System.currentTimeMillis());
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(ub9.a(splash_Screen));
                            calendar2.set(11, 21);
                            calendar2.set(12, calendar.get(12));
                            calendar2.set(13, 0);
                            calendar2.set(14, 0);
                            calendar2.add(5, 15);
                            AlarmReceiver.a(splash_Screen, calendar2.getTimeInMillis(), 51);
                            if (i8 == 10) {
                                Calendar calendar3 = Calendar.getInstance();
                                calendar3.set(11, 20);
                                calendar3.set(12, calendar.get(12));
                                AlarmReceiver.a(splash_Screen, dt7.d(calendar3, 13, 0, 14, 0), 52);
                                splash_Screen.C.setInteger(splash_Screen, HelperClass.TOTAL_TIME_APP_OPEN, i8);
                            } else {
                                SP sp = splash_Screen.C;
                                if (i8 == 1) {
                                    sp.setInteger(splash_Screen, HelperClass.TOTAL_TIME_APP_OPEN, i8);
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.set(11, 21);
                                    calendar4.set(12, calendar.get(12));
                                    calendar4.set(13, 0);
                                    calendar4.set(14, 0);
                                    calendar4.add(5, 1);
                                    AlarmReceiver.a(splash_Screen, calendar4.getTimeInMillis(), 57);
                                } else {
                                    sp.setInteger(splash_Screen, HelperClass.TOTAL_TIME_APP_OPEN, i8);
                                }
                            }
                            int integer2 = splash_Screen.C.getInteger(splash_Screen, HelperClass.TOTAL_PHOTO_CAPTURE, 0);
                            if (i8 != 9 && integer2 != 30) {
                                if (i8 != 5 && integer2 != 25) {
                                    if (i8 != 6 && integer2 != 20) {
                                        if (i8 != 7 && integer2 != 15) {
                                            if (i8 != 4 && integer2 != 18) {
                                                if (integer2 == 10) {
                                                    if (splash_Screen.C.getInteger(splash_Screen, HelperClass.FONT_STYLE_OPEN_TIME, 0) == 0) {
                                                        Calendar calendar5 = Calendar.getInstance();
                                                        calendar5.set(11, 21);
                                                        calendar5.set(12, calendar.get(12));
                                                        AlarmReceiver.a(splash_Screen, dt7.d(calendar5, 13, 0, 14, 0), 63);
                                                    }
                                                    break;
                                                } else if (integer2 == 13 && splash_Screen.C.getInteger(splash_Screen, HelperClass.STAMP_POS_OPEN_TIME, 0) == 0) {
                                                    Calendar calendar6 = Calendar.getInstance();
                                                    calendar6.set(11, 20);
                                                    calendar6.set(12, calendar.get(12));
                                                    AlarmReceiver.a(splash_Screen, dt7.d(calendar6, 13, 0, 14, 0), 64);
                                                    break;
                                                }
                                            } else {
                                                if (splash_Screen.C.getInteger(splash_Screen, HelperClass.TEMPLT_OPEN_TIME, 0) == 0) {
                                                    Calendar calendar7 = Calendar.getInstance();
                                                    calendar7.set(11, 20);
                                                    calendar7.set(12, calendar.get(12));
                                                    AlarmReceiver.a(splash_Screen, dt7.d(calendar7, 13, 0, 14, 0), 62);
                                                }
                                                break;
                                            }
                                        } else {
                                            if (splash_Screen.C.getInteger(splash_Screen, HelperClass.FILE_NAME_OPEN_TIME, 0) == 0) {
                                                Calendar calendar8 = Calendar.getInstance();
                                                calendar8.set(11, 21);
                                                calendar8.set(12, calendar.get(12));
                                                AlarmReceiver.a(splash_Screen, dt7.d(calendar8, 13, 0, 14, 0), 61);
                                            }
                                            break;
                                        }
                                    } else {
                                        if (splash_Screen.C.getInteger(splash_Screen, HelperClass.FOLDER_OPEN_TIME, 0) == 0) {
                                            Calendar calendar9 = Calendar.getInstance();
                                            calendar9.set(11, 20);
                                            calendar9.set(12, calendar.get(12));
                                            AlarmReceiver.a(splash_Screen, dt7.d(calendar9, 13, 0, 14, 0), 60);
                                        }
                                        break;
                                    }
                                } else {
                                    if (splash_Screen.C.getInteger(splash_Screen, HelperClass.CAM_SET_OPEN_TIME, 0) == 0) {
                                        Calendar calendar10 = Calendar.getInstance();
                                        calendar10.set(11, 21);
                                        calendar10.set(12, calendar.get(12));
                                        AlarmReceiver.a(splash_Screen, dt7.d(calendar10, 13, 0, 14, 0), 59);
                                    }
                                    break;
                                }
                            } else {
                                if (splash_Screen.C.getInteger(splash_Screen, HelperClass.MAP_DATA_OPEN_TIME, 0) == 0) {
                                    Calendar calendar11 = Calendar.getInstance();
                                    calendar11.set(11, 20);
                                    calendar11.set(12, calendar.get(12));
                                    AlarmReceiver.a(splash_Screen, dt7.d(calendar11, 13, 0, 14, 0), 58);
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        int i9 = Splash_Screen.P;
                        if (splash_Screen.D == null) {
                            splash_Screen.v();
                            break;
                        } else if (!splash_Screen.isFinishing() && !splash_Screen.isDestroyed()) {
                            mo1 mo1Var = splash_Screen.D;
                            mo1Var.getClass();
                            mo1Var.b.a(splash_Screen);
                            break;
                        }
                        break;
                }
            }
        }, 7000L);
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        FSXa.MTGPaCQiyDfYqUK.invoke(null, this, bundle);
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        ohAxISostGa.nLLydrKXFkyzMHa.invoke(null, this);
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() throws IllegalAccessException, InvocationTargetException {
        JtDQJ.zjvmkwJyxf.invoke(null, this);
    }

    @Override // defpackage.ki5
    public final void onPurchasesUpdated(l40 l40Var, List list) {
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() throws IllegalAccessException, InvocationTargetException {
        FSXa.bwBoaqry.invoke(null, this);
    }

    public final boolean s() {
        return la9.a(this, "android.permission.CAMERA") == 0;
    }

    public final boolean t() {
        boolean z = la9.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
        if (la9.a(this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return false;
        }
        return z;
    }

    public final boolean u() {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i >= 34) {
            if (la9.a(this, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0) {
                z = la9.a(this, "android.permission.READ_MEDIA_IMAGES") == 0;
                if (la9.a(this, "android.permission.READ_MEDIA_VIDEO") != 0) {
                    return false;
                }
            }
            return z;
        }
        if (i > 32) {
            z = la9.a(this, "android.permission.READ_MEDIA_IMAGES") == 0;
            if (la9.a(this, "android.permission.READ_MEDIA_VIDEO") != 0) {
                return false;
            }
            return z;
        }
        z = la9.a(this, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        if (la9.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return z;
    }

    public final void v() {
        Intent intent;
        int integer = this.C.getInteger(this, SP.LANGUAGE_COUNT, 0);
        boolean z = this.C.getBoolean(this, SP.ALL_PERMISSION_ACCESS, false);
        if (z) {
            if (getIntent().hasExtra("noti_code")) {
                switch (getIntent().getIntExtra("noti_code", 0)) {
                    case 1:
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (z) {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = (s() && t() && u()) ? new Intent(this, (Class<?>) CameraActivity.class) : new Intent(this, (Class<?>) Permission_Activity.class);
                        }
                        a8a.a(this, getString(R.string.click_15th_day_app_open), getString(R.string.click_15th_day_app_open));
                        break;
                    case 2:
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (z) {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = (s() && t() && u()) ? new Intent(this, (Class<?>) CameraActivity.class) : new Intent(this, (Class<?>) Permission_Activity.class);
                        }
                        a8a.a(this, getString(R.string.click_10_time_open_45_pics), getString(R.string.click_10_time_open_45_pics));
                        break;
                    case 3:
                        a8a.a(this, getString(R.string.click_10_time_open_45_pics), getString(R.string.click_10_time_open_45_pics));
                        intent = new Intent(this, (Class<?>) InAppPurchaseActivity.class);
                        break;
                    case 4:
                        a8a.a(this, getString(R.string.click_50_photo_click_pro_screen), getString(R.string.click_50_photo_click_pro_screen));
                        intent = new Intent(this, (Class<?>) InAppPurchaseActivity.class);
                        break;
                    case 5:
                        a8a.a(this, getString(R.string.click_100_times_photo_click), getString(R.string.click_100_times_photo_click));
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (!z) {
                            intent = (!s() || !t() || !u()) ? new Intent(this, (Class<?>) Permission_Activity.class) : new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        }
                        break;
                    case 6:
                    default:
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (!z) {
                            intent = (!s() || !t() || !u()) ? new Intent(this, (Class<?>) Permission_Activity.class) : new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        }
                        break;
                    case 7:
                        a8a.a(this, getString(R.string.click_2nd_day_app_open), getString(R.string.click_2nd_day_app_open));
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (!z) {
                            intent = (!s() || !t() || !u()) ? new Intent(this, (Class<?>) Permission_Activity.class) : new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        }
                        break;
                    case 8:
                        a8a.a(this, getString(R.string.click_map_open_time), getString(R.string.click_map_open_time));
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (!z) {
                            intent = (!s() || !t() || !u()) ? new Intent(this, (Class<?>) Permission_Activity.class) : new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        }
                        break;
                    case 9:
                        a8a.a(this, getString(R.string.click_camset_open_time), getString(R.string.click_camset_open_time));
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (!z) {
                            intent = (!s() || !t() || !u()) ? new Intent(this, (Class<?>) Permission_Activity.class) : new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        }
                        break;
                    case 10:
                        a8a.a(this, getString(R.string.click_fold_open_time), getString(R.string.click_fold_open_time));
                        intent = new Intent(this, (Class<?>) FolderActivity.class);
                        break;
                    case 11:
                        a8a.a(this, getString(R.string.click_file_open_time), getString(R.string.click_file_open_time));
                        intent = new Intent(this, (Class<?>) FileName_Activity.class);
                        break;
                    case 12:
                        a8a.a(this, getString(R.string.click_temp_open_time), getString(R.string.click_temp_open_time));
                        intent = new Intent(this, (Class<?>) TempletSelectionActivity.class);
                        break;
                    case 13:
                        a8a.a(this, getString(R.string.click_font_open_time), getString(R.string.click_font_open_time));
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (!z) {
                            intent = (!s() || !t() || !u()) ? new Intent(this, (Class<?>) Permission_Activity.class) : new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        }
                        break;
                    case 14:
                        a8a.a(this, getString(R.string.click_stamppos_open_time), getString(R.string.click_stamppos_open_time));
                        if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                            intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                        } else if (!z) {
                            intent = (!s() || !t() || !u()) ? new Intent(this, (Class<?>) Permission_Activity.class) : new Intent(this, (Class<?>) CameraActivity.class);
                        } else {
                            intent = new Intent(this, (Class<?>) CameraActivity.class);
                        }
                        break;
                    case 15:
                        a8a.a(this, getString(R.string.click_3_time_no_buy), getString(R.string.click_3_time_no_buy));
                        intent = new Intent(this, (Class<?>) InAppPurchaseActivity.class);
                        break;
                    case 16:
                        a8a.a(this, getString(R.string.click_3_time_no_buy_stan), getString(R.string.click_3_time_no_buy_stan));
                        intent = new Intent(this, (Class<?>) InAppPurchaseActivity.class);
                        break;
                    case 17:
                        a8a.a(this, "click_drive_promo_notif", "click_drive_promo_notif");
                        intent = new Intent(this, (Class<?>) MyFilesActivity.class);
                        if (getIntent().getBooleanExtra("auto_connect_drive", false)) {
                            intent.putExtra("auto_connect_drive", true);
                        }
                        break;
                }
            } else if (!this.C.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
            } else if (z) {
                intent = new Intent(this, (Class<?>) CameraActivity.class);
            } else {
                intent = (s() && t() && u()) ? new Intent(this, (Class<?>) CameraActivity.class) : new Intent(this, (Class<?>) Permission_Activity.class);
            }
        } else if (integer == 0) {
            this.C.setInteger(this, SP.LANGUAGE_COUNT, 0);
            intent = new Intent(this, (Class<?>) LanguageSelectionActivity.class);
        } else {
            intent = new Intent(this, (Class<?>) Permission_Activity.class);
        }
        intent.setFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
        intent.setFlags(131072);
        startActivity(intent);
        if (RemoteAdData.SPLASH_SCREEN_FS_TYPE == 1) {
            this.D = null;
        }
        finish();
    }

    public final void w() {
        RelativeLayout relativeLayout = this.M;
        if (relativeLayout == null) {
            relativeLayout = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
            this.M = relativeLayout;
        }
        if (relativeLayout == null) {
            return;
        }
        Admob admob = new Admob();
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        if (i != 9) {
            if (i == 1) {
                admob.loadAdaptive_banner(this, this.M, RemoteAdData.SPLASH_SCREEN_BANNER_ID);
                return;
            } else {
                if (i == 2) {
                    admob.loadAdaptive_bannerAdax(this, this.M, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i2 = RemoteAdData.SPLASH_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            admob.loadAdaptive_banner(this, this.M, RemoteAdData.SPLASH_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            admob.loadAdaptive_bannerAdax(this, this.M, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final void x() {
        try {
            String str = RemoteAdData.SPLASH_SCREEN_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ge4(13, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void y() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new e65(9, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void z(int i, boolean z) {
        if (i != 0) {
            if (i == 1) {
                this.C.setBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, z);
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.C.setBoolean(this, HelperClass.IS_SUBSCRIBE, z);
                return;
            }
        }
        if (this.C.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false)) {
            return;
        }
        this.C.setBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, z);
    }
}