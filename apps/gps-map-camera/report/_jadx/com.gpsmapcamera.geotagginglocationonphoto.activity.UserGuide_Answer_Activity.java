package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.UserGuide_Answer_Activity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.itextpdf.text.html.HtmlTags;
import defpackage.a7;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc7;
import defpackage.ge4;
import defpackage.h94;
import defpackage.lt1;
import defpackage.m6;
import defpackage.ro6;
import defpackage.ub7;
import defpackage.w57;
import defpackage.z55;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class UserGuide_Answer_Activity extends bj {
    public static final /* synthetic */ int H = 0;
    public SP C;
    public String[] D;
    public boolean E;
    public mo1 F;
    public final ro6 B = new ro6(new w57(2, this));
    public final Handler G = new Handler(Looper.getMainLooper());

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String networkCountryIso;
        lt1.a(this);
        this.C = new SP(this);
        String str = Default.mSelectedLanguage;
        str.getClass();
        if (str.length() == 0) {
            new HelperClass().SetLanguage(this);
            Default.mSelectedLanguage = t().getString(this, SP.SELECTED_LANGUAGE, Default.LANGUAGE);
        }
        String string = t().getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 1;
        final int i3 = 0;
        if (bi3.b(string, Default.DARK)) {
            this.E = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.E = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.E = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(s().a);
        RelativeLayout relativeLayout = s().e;
        z55 z55Var = new z55(25, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, z55Var);
        String stringExtra = getIntent().getStringExtra("queNo");
        stringExtra.getClass();
        int i4 = Integer.parseInt(stringExtra);
        if (i4 == 1) {
            ((TextView) s().j.l).setText(getString(R.string.user_guide));
        } else {
            ((TextView) s().j.l).setText(getString(R.string.user_guide_));
        }
        switch (i4) {
            case 1:
                s().f.setVisibility(0);
                ((RelativeLayout) s().j.d).setVisibility(0);
                this.D = getResources().getStringArray(R.array.lan_array);
                try {
                    Object systemService = getSystemService("phone");
                    systemService.getClass();
                    networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
                    networkCountryIso.getClass();
                } catch (Exception unused) {
                    networkCountryIso = "";
                }
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = networkCountryIso.toLowerCase(locale);
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case 3179:
                        if (lowerCase.equals("cn")) {
                            this.D = getResources().getStringArray(R.array.lan_array_zh);
                        }
                        break;
                    case 3201:
                        if (lowerCase.equals("de")) {
                            this.D = getResources().getStringArray(R.array.lan_array_de);
                        }
                        break;
                    case 3246:
                        if (lowerCase.equals("es")) {
                            this.D = getResources().getStringArray(R.array.lan_array_es);
                        }
                        break;
                    case 3276:
                        if (lowerCase.equals("fr")) {
                            this.D = getResources().getStringArray(R.array.lan_array_fr);
                        }
                        break;
                    case 3355:
                        if (lowerCase.equals("id")) {
                            this.D = getResources().getStringArray(R.array.lan_array_id);
                        }
                        break;
                    case 3365:
                        if (lowerCase.equals("in")) {
                            this.D = getResources().getStringArray(R.array.lan_array_in);
                        }
                        break;
                    case 3371:
                        if (lowerCase.equals("it")) {
                            this.D = getResources().getStringArray(R.array.lan_array_it);
                        }
                        break;
                    case 3428:
                        if (lowerCase.equals("ko")) {
                            this.D = getResources().getStringArray(R.array.lan_array_ko);
                        }
                        break;
                    case 3500:
                        if (lowerCase.equals("my")) {
                            this.D = getResources().getStringArray(R.array.lan_array_ms);
                        }
                        break;
                    case 3588:
                        if (lowerCase.equals("pt")) {
                            this.D = getResources().getStringArray(R.array.lan_array_pt);
                        }
                        break;
                    case 3651:
                        if (lowerCase.equals("ru")) {
                            this.D = getResources().getStringArray(R.array.lan_array_ru);
                        }
                        break;
                    case 3700:
                        if (lowerCase.equals(HtmlTags.TH)) {
                            this.D = getResources().getStringArray(R.array.lan_array_th);
                        }
                        break;
                    case 3768:
                        if (lowerCase.equals("vn")) {
                            this.D = getResources().getStringArray(R.array.lan_array_vn);
                        }
                        break;
                }
                break;
            case 2:
                s().h.setVisibility(0);
                break;
            case 3:
                s().i.setVisibility(0);
                break;
            case 4:
                s().d.setVisibility(0);
                break;
            case 5:
                s().c.setVisibility(0);
                break;
            case 6:
                s().g.setVisibility(0);
                break;
        }
        ((RelativeLayout) s().j.c).setOnClickListener(new View.OnClickListener(this) { // from class: i67
            public final /* synthetic */ UserGuide_Answer_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i5 = i3;
                final UserGuide_Answer_Activity userGuide_Answer_Activity = this.b;
                final int i6 = 1;
                switch (i5) {
                    case 0:
                        int i7 = UserGuide_Answer_Activity.H;
                        final int i8 = 0;
                        int integer = userGuide_Answer_Activity.t().getInteger(userGuide_Answer_Activity, HelperClass.SETTING_COUNTADS, 0);
                        int i9 = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
                        if (integer > i9) {
                            integer = i9;
                        }
                        if (!AllAdsApproval.iSUserManualAnswerScreenFS(userGuide_Answer_Activity)) {
                            userGuide_Answer_Activity.finish();
                        } else if (integer < RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
                            userGuide_Answer_Activity.t().setInteger(userGuide_Answer_Activity, HelperClass.SETTING_COUNTADS, integer + 1);
                            userGuide_Answer_Activity.finish();
                        } else {
                            CPD.ShowDialog(userGuide_Answer_Activity, userGuide_Answer_Activity.getString(R.string.cluster_loading));
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: j67
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10 = i8;
                                    UserGuide_Answer_Activity userGuide_Answer_Activity2 = userGuide_Answer_Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = UserGuide_Answer_Activity.H;
                                            userGuide_Answer_Activity2.t().setInteger(userGuide_Answer_Activity2, HelperClass.SETTING_COUNTADS, 0);
                                            int i12 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i12 == 9) {
                                                int i13 = RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE;
                                                if (i13 == 1) {
                                                    userGuide_Answer_Activity2.u();
                                                } else if (i13 == 2) {
                                                    userGuide_Answer_Activity2.v();
                                                }
                                            } else if (i12 == 1) {
                                                userGuide_Answer_Activity2.u();
                                            } else if (i12 == 2) {
                                                userGuide_Answer_Activity2.v();
                                            }
                                            break;
                                        default:
                                            int i14 = UserGuide_Answer_Activity.H;
                                            int i15 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i15 != 9) {
                                                if (i15 == 1) {
                                                    mo1 mo1Var = userGuide_Answer_Activity2.F;
                                                    if (mo1Var == null) {
                                                        userGuide_Answer_Activity2.finish();
                                                    } else {
                                                        mo1Var.b.a(userGuide_Answer_Activity2);
                                                    }
                                                }
                                            } else if (RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE == 1) {
                                                mo1 mo1Var2 = userGuide_Answer_Activity2.F;
                                                if (mo1Var2 == null) {
                                                    userGuide_Answer_Activity2.finish();
                                                } else {
                                                    mo1Var2.b.a(userGuide_Answer_Activity2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, 200L);
                            Handler handler = userGuide_Answer_Activity.G;
                            handler.getClass();
                            handler.postDelayed(new Runnable() { // from class: j67
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10 = i6;
                                    UserGuide_Answer_Activity userGuide_Answer_Activity2 = userGuide_Answer_Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = UserGuide_Answer_Activity.H;
                                            userGuide_Answer_Activity2.t().setInteger(userGuide_Answer_Activity2, HelperClass.SETTING_COUNTADS, 0);
                                            int i12 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i12 == 9) {
                                                int i13 = RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE;
                                                if (i13 == 1) {
                                                    userGuide_Answer_Activity2.u();
                                                } else if (i13 == 2) {
                                                    userGuide_Answer_Activity2.v();
                                                }
                                            } else if (i12 == 1) {
                                                userGuide_Answer_Activity2.u();
                                            } else if (i12 == 2) {
                                                userGuide_Answer_Activity2.v();
                                            }
                                            break;
                                        default:
                                            int i14 = UserGuide_Answer_Activity.H;
                                            int i15 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i15 != 9) {
                                                if (i15 == 1) {
                                                    mo1 mo1Var = userGuide_Answer_Activity2.F;
                                                    if (mo1Var == null) {
                                                        userGuide_Answer_Activity2.finish();
                                                    } else {
                                                        mo1Var.b.a(userGuide_Answer_Activity2);
                                                    }
                                                }
                                            } else if (RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE == 1) {
                                                mo1 mo1Var2 = userGuide_Answer_Activity2.F;
                                                if (mo1Var2 == null) {
                                                    userGuide_Answer_Activity2.finish();
                                                } else {
                                                    mo1Var2.b.a(userGuide_Answer_Activity2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, 7000L);
                        }
                        break;
                    default:
                        int i10 = UserGuide_Answer_Activity.H;
                        view.getClass();
                        AlertDialog.Builder builder = new AlertDialog.Builder(userGuide_Answer_Activity);
                        Object systemService2 = userGuide_Answer_Activity.getSystemService("layout_inflater");
                        systemService2.getClass();
                        View viewInflate = ((LayoutInflater) systemService2).inflate(R.layout.popup_language_list, (ViewGroup) null);
                        builder.setView(viewInflate);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        Window window = alertDialogCreate.getWindow();
                        window.getClass();
                        window.setBackgroundDrawableResource(android.R.color.transparent);
                        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rvLanguageList);
                        recyclerView.setLayoutManager(new LinearLayoutManager(userGuide_Answer_Activity));
                        DisplayMetrics displayMetrics = userGuide_Answer_Activity.getResources().getDisplayMetrics();
                        int iMin = Math.min((int) (350.0f * displayMetrics.density), (int) (((double) displayMetrics.heightPixels) * 0.4d));
                        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                        layoutParams.height = iMin;
                        recyclerView.setLayoutParams(layoutParams);
                        String[] strArr = userGuide_Answer_Activity.D;
                        er3 er3Var = new er3(21, alertDialogCreate, userGuide_Answer_Activity);
                        w7 w7Var = new w7(5);
                        w7Var.d = Default.LANGUAGE;
                        w7Var.e = strArr;
                        w7Var.f = er3Var;
                        w7Var.d = Default.mSelectedLanguage;
                        recyclerView.setAdapter(w7Var);
                        if (userGuide_Answer_Activity.D != null && (str2 = Default.mSelectedLanguage) != null && str2.length() != 0) {
                            String[] strArr2 = userGuide_Answer_Activity.D;
                            strArr2.getClass();
                            int iQ = fp.q(Default.mSelectedLanguage, strArr2);
                            if (iQ >= 0) {
                                recyclerView.i0(iQ);
                            }
                        }
                        alertDialogCreate.show();
                        Window window2 = alertDialogCreate.getWindow();
                        if (window2 != null) {
                            window2.setLayout(Math.min((int) (((double) displayMetrics.widthPixels) * 0.82d), (int) (340.0f * displayMetrics.density)), -2);
                            window2.setGravity(17);
                        }
                        break;
                }
            }
        });
        ((RelativeLayout) s().j.d).setOnClickListener(new View.OnClickListener(this) { // from class: i67
            public final /* synthetic */ UserGuide_Answer_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i5 = i2;
                final UserGuide_Answer_Activity userGuide_Answer_Activity = this.b;
                final int i6 = 1;
                switch (i5) {
                    case 0:
                        int i7 = UserGuide_Answer_Activity.H;
                        final int i8 = 0;
                        int integer = userGuide_Answer_Activity.t().getInteger(userGuide_Answer_Activity, HelperClass.SETTING_COUNTADS, 0);
                        int i9 = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
                        if (integer > i9) {
                            integer = i9;
                        }
                        if (!AllAdsApproval.iSUserManualAnswerScreenFS(userGuide_Answer_Activity)) {
                            userGuide_Answer_Activity.finish();
                        } else if (integer < RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
                            userGuide_Answer_Activity.t().setInteger(userGuide_Answer_Activity, HelperClass.SETTING_COUNTADS, integer + 1);
                            userGuide_Answer_Activity.finish();
                        } else {
                            CPD.ShowDialog(userGuide_Answer_Activity, userGuide_Answer_Activity.getString(R.string.cluster_loading));
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: j67
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10 = i8;
                                    UserGuide_Answer_Activity userGuide_Answer_Activity2 = userGuide_Answer_Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = UserGuide_Answer_Activity.H;
                                            userGuide_Answer_Activity2.t().setInteger(userGuide_Answer_Activity2, HelperClass.SETTING_COUNTADS, 0);
                                            int i12 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i12 == 9) {
                                                int i13 = RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE;
                                                if (i13 == 1) {
                                                    userGuide_Answer_Activity2.u();
                                                } else if (i13 == 2) {
                                                    userGuide_Answer_Activity2.v();
                                                }
                                            } else if (i12 == 1) {
                                                userGuide_Answer_Activity2.u();
                                            } else if (i12 == 2) {
                                                userGuide_Answer_Activity2.v();
                                            }
                                            break;
                                        default:
                                            int i14 = UserGuide_Answer_Activity.H;
                                            int i15 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i15 != 9) {
                                                if (i15 == 1) {
                                                    mo1 mo1Var = userGuide_Answer_Activity2.F;
                                                    if (mo1Var == null) {
                                                        userGuide_Answer_Activity2.finish();
                                                    } else {
                                                        mo1Var.b.a(userGuide_Answer_Activity2);
                                                    }
                                                }
                                            } else if (RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE == 1) {
                                                mo1 mo1Var2 = userGuide_Answer_Activity2.F;
                                                if (mo1Var2 == null) {
                                                    userGuide_Answer_Activity2.finish();
                                                } else {
                                                    mo1Var2.b.a(userGuide_Answer_Activity2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, 200L);
                            Handler handler = userGuide_Answer_Activity.G;
                            handler.getClass();
                            handler.postDelayed(new Runnable() { // from class: j67
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10 = i6;
                                    UserGuide_Answer_Activity userGuide_Answer_Activity2 = userGuide_Answer_Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = UserGuide_Answer_Activity.H;
                                            userGuide_Answer_Activity2.t().setInteger(userGuide_Answer_Activity2, HelperClass.SETTING_COUNTADS, 0);
                                            int i12 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i12 == 9) {
                                                int i13 = RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE;
                                                if (i13 == 1) {
                                                    userGuide_Answer_Activity2.u();
                                                } else if (i13 == 2) {
                                                    userGuide_Answer_Activity2.v();
                                                }
                                            } else if (i12 == 1) {
                                                userGuide_Answer_Activity2.u();
                                            } else if (i12 == 2) {
                                                userGuide_Answer_Activity2.v();
                                            }
                                            break;
                                        default:
                                            int i14 = UserGuide_Answer_Activity.H;
                                            int i15 = RemoteAdData.ADS_NETWORK_TYPE;
                                            if (i15 != 9) {
                                                if (i15 == 1) {
                                                    mo1 mo1Var = userGuide_Answer_Activity2.F;
                                                    if (mo1Var == null) {
                                                        userGuide_Answer_Activity2.finish();
                                                    } else {
                                                        mo1Var.b.a(userGuide_Answer_Activity2);
                                                    }
                                                }
                                            } else if (RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS_TYPE == 1) {
                                                mo1 mo1Var2 = userGuide_Answer_Activity2.F;
                                                if (mo1Var2 == null) {
                                                    userGuide_Answer_Activity2.finish();
                                                } else {
                                                    mo1Var2.b.a(userGuide_Answer_Activity2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, 7000L);
                        }
                        break;
                    default:
                        int i10 = UserGuide_Answer_Activity.H;
                        view.getClass();
                        AlertDialog.Builder builder = new AlertDialog.Builder(userGuide_Answer_Activity);
                        Object systemService2 = userGuide_Answer_Activity.getSystemService("layout_inflater");
                        systemService2.getClass();
                        View viewInflate = ((LayoutInflater) systemService2).inflate(R.layout.popup_language_list, (ViewGroup) null);
                        builder.setView(viewInflate);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        Window window = alertDialogCreate.getWindow();
                        window.getClass();
                        window.setBackgroundDrawableResource(android.R.color.transparent);
                        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rvLanguageList);
                        recyclerView.setLayoutManager(new LinearLayoutManager(userGuide_Answer_Activity));
                        DisplayMetrics displayMetrics = userGuide_Answer_Activity.getResources().getDisplayMetrics();
                        int iMin = Math.min((int) (350.0f * displayMetrics.density), (int) (((double) displayMetrics.heightPixels) * 0.4d));
                        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                        layoutParams.height = iMin;
                        recyclerView.setLayoutParams(layoutParams);
                        String[] strArr = userGuide_Answer_Activity.D;
                        er3 er3Var = new er3(21, alertDialogCreate, userGuide_Answer_Activity);
                        w7 w7Var = new w7(5);
                        w7Var.d = Default.LANGUAGE;
                        w7Var.e = strArr;
                        w7Var.f = er3Var;
                        w7Var.d = Default.mSelectedLanguage;
                        recyclerView.setAdapter(w7Var);
                        if (userGuide_Answer_Activity.D != null && (str2 = Default.mSelectedLanguage) != null && str2.length() != 0) {
                            String[] strArr2 = userGuide_Answer_Activity.D;
                            strArr2.getClass();
                            int iQ = fp.q(Default.mSelectedLanguage, strArr2);
                            if (iQ >= 0) {
                                recyclerView.i0(iQ);
                            }
                        }
                        alertDialogCreate.show();
                        Window window2 = alertDialogCreate.getWindow();
                        if (window2 != null) {
                            window2.setLayout(Math.min((int) (((double) displayMetrics.widthPixels) * 0.82d), (int) (340.0f * displayMetrics.density)), -2);
                            window2.setGravity(17);
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.iSUserManualAnswerScreenBanner(this)) {
            Admob admob = new Admob();
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                if (RemoteAdData.USER_MANUAL_SCREEN_BANNER_TYPE == 1) {
                    admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                    return;
                } else {
                    if (RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BANNER_TYPE == 2) {
                        admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
                        return;
                    }
                    return;
                }
            }
            if (i == 1) {
                admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
            } else if (i == 2) {
                admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
            }
        }
    }

    public final m6 s() {
        return (m6) this.B.getValue();
    }

    public final SP t() {
        SP sp = this.C;
        if (sp != null) {
            return sp;
        }
        bi3.g("mSP");
        throw null;
    }

    public final void u() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new h94(19, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ge4(20, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}