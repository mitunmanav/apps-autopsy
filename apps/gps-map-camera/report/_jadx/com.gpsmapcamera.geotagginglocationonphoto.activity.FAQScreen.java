package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.FAQScreen;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.a7;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc7;
import defpackage.j42;
import defpackage.lt1;
import defpackage.mq7;
import defpackage.n8;
import defpackage.pg5;
import defpackage.pn9;
import defpackage.pp2;
import defpackage.qj;
import defpackage.sy;
import defpackage.ub7;
import defpackage.x32;
import defpackage.zn4;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class FAQScreen extends bj {
    public static final /* synthetic */ int H = 0;
    public pg5 B;
    public boolean C;
    public SP D;
    public x32 E;
    public mo1 F;
    public final Handler G = new Handler(Looper.getMainLooper());

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        new HelperClass().SetLanguage(this);
        lt1.a(this);
        SP sp = new SP(this);
        this.D = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 1;
        boolean z = false;
        if (bi3.b(string, Default.DARK)) {
            this.C = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.C = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.C = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_faqscreen, (ViewGroup) null, false);
        if (((FrameLayout) pn9.a(R.id.container, viewInflate)) == null) {
            mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.container)));
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        this.B = new pg5(relativeLayout, relativeLayout, 3, z);
        setContentView(relativeLayout);
        pg5 pg5Var = this.B;
        if (pg5Var == null) {
            bi3.g("binding");
            throw null;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) pg5Var.c;
        x32 x32Var = new x32(i2, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout2, x32Var);
        k().a(this, new n8(this, 5));
        if (bundle == null) {
            j42 j42Var = new j42();
            sy syVar = new sy(o());
            syVar.f(R.id.container, j42Var, null, 2);
            if (!syVar.h) {
                qj.l("This FragmentTransaction is not allowed to be added to the back stack.");
                return;
            }
            syVar.g = true;
            syVar.i = null;
            syVar.d(false);
        }
    }

    public final void s() {
        SP sp = this.D;
        if (sp == null) {
            bi3.g("mSP");
            throw null;
        }
        final int i = 0;
        int integer = sp.getInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i2 = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSUserManualScreenFS(this)) {
            finish();
            return;
        }
        final int i3 = 1;
        if (integer >= RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: m42
                public final /* synthetic */ FAQScreen b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    FAQScreen fAQScreen = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = FAQScreen.H;
                            SP sp2 = fAQScreen.D;
                            if (sp2 == null) {
                                bi3.g("mSP");
                                throw null;
                            }
                            sp2.setInteger(fAQScreen, HelperClass.SETTING_COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 != 9) {
                                if (i6 == 1) {
                                    fAQScreen.t();
                                    return;
                                } else {
                                    if (i6 == 2) {
                                        fAQScreen.u();
                                        return;
                                    }
                                    return;
                                }
                            }
                            int i7 = RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE;
                            if (i7 == 1) {
                                fAQScreen.t();
                                return;
                            } else {
                                if (i7 == 2) {
                                    fAQScreen.u();
                                    return;
                                }
                                return;
                            }
                        default:
                            int i8 = FAQScreen.H;
                            int i9 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i9 == 9) {
                                if (RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE == 1) {
                                    mo1 mo1Var = fAQScreen.F;
                                    if (mo1Var != null) {
                                        mo1Var.b.a(fAQScreen);
                                        return;
                                    } else {
                                        fAQScreen.finish();
                                        return;
                                    }
                                }
                                return;
                            }
                            if (i9 == 1) {
                                mo1 mo1Var2 = fAQScreen.F;
                                if (mo1Var2 != null) {
                                    mo1Var2.b.a(fAQScreen);
                                    return;
                                } else {
                                    fAQScreen.finish();
                                    return;
                                }
                            }
                            return;
                    }
                }
            }, 200L);
            Handler handler = this.G;
            handler.getClass();
            handler.postDelayed(new Runnable(this) { // from class: m42
                public final /* synthetic */ FAQScreen b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    FAQScreen fAQScreen = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = FAQScreen.H;
                            SP sp2 = fAQScreen.D;
                            if (sp2 == null) {
                                bi3.g("mSP");
                                throw null;
                            }
                            sp2.setInteger(fAQScreen, HelperClass.SETTING_COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 != 9) {
                                if (i6 == 1) {
                                    fAQScreen.t();
                                    return;
                                } else {
                                    if (i6 == 2) {
                                        fAQScreen.u();
                                        return;
                                    }
                                    return;
                                }
                            }
                            int i7 = RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE;
                            if (i7 == 1) {
                                fAQScreen.t();
                                return;
                            } else {
                                if (i7 == 2) {
                                    fAQScreen.u();
                                    return;
                                }
                                return;
                            }
                        default:
                            int i8 = FAQScreen.H;
                            int i9 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i9 == 9) {
                                if (RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE == 1) {
                                    mo1 mo1Var = fAQScreen.F;
                                    if (mo1Var != null) {
                                        mo1Var.b.a(fAQScreen);
                                        return;
                                    } else {
                                        fAQScreen.finish();
                                        return;
                                    }
                                }
                                return;
                            }
                            if (i9 == 1) {
                                mo1 mo1Var2 = fAQScreen.F;
                                if (mo1Var2 != null) {
                                    mo1Var2.b.a(fAQScreen);
                                    return;
                                } else {
                                    fAQScreen.finish();
                                    return;
                                }
                            }
                            return;
                    }
                }
            }, 7000L);
            return;
        }
        int i4 = integer + 1;
        SP sp2 = this.D;
        if (sp2 == null) {
            bi3.g("mSP");
            throw null;
        }
        sp2.setInteger(this, HelperClass.SETTING_COUNTADS, i4);
        finish();
    }

    public final void t() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new pp2(22, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void u() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new zn4(19, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}