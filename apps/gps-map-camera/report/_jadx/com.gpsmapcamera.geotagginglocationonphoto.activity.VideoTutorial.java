package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import ads_mobile_sdk.mo1;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.a7;
import defpackage.ab2;
import defpackage.bi3;
import defpackage.bj;
import defpackage.bv0;
import defpackage.c;
import defpackage.c66;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.e63;
import defpackage.gb2;
import defpackage.ge4;
import defpackage.gq5;
import defpackage.h94;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.kb7;
import defpackage.l76;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mq7;
import defpackage.mv1;
import defpackage.nz0;
import defpackage.oa2;
import defpackage.pn9;
import defpackage.q6;
import defpackage.te9;
import defpackage.tq6;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.v30;
import defpackage.w49;
import defpackage.w7;
import defpackage.ws3;
import defpackage.x7;
import defpackage.z55;
import defpackage.za2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class VideoTutorial extends bj {
    public static final /* synthetic */ int I = 0;
    public bv0 B;
    public w7 D;
    public SP E;
    public boolean F;
    public mo1 G;
    public final ArrayList C = new ArrayList();
    public final Handler H = new Handler(Looper.getMainLooper());

    public static void w(l12 l12Var, NativeAdView nativeAdView) {
        tv5 tv5Var = l12Var.m;
        String str = l12Var.g;
        String str2 = l12Var.f;
        String str3 = l12Var.d;
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.appinstall_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.appinstall_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.appinstall_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.appinstall_app_icon));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.appinstall_advertiser));
        if (str3 != null) {
            try {
                TextView textView = (TextView) nativeAdView.getHeadlineView();
                textView.getClass();
                textView.setText(str3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (str2 != null) {
            try {
                TextView textView2 = (TextView) nativeAdView.getBodyView();
                textView2.getClass();
                textView2.setText(str2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (str != null) {
            try {
                Button button = (Button) nativeAdView.getCallToActionView();
                button.getClass();
                button.setText(str);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            tv5Var.getClass();
            if (((Drawable) tv5Var.b) != null) {
                ImageView imageView = (ImageView) nativeAdView.getIconView();
                imageView.getClass();
                tv5Var.getClass();
                imageView.setImageDrawable((Drawable) tv5Var.b);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            Double d = l12Var.j;
            if (d != null) {
                d.getClass();
                float fDoubleValue = (float) d.doubleValue();
                RatingBar ratingBar = (RatingBar) nativeAdView.getStarRatingView();
                ratingBar.getClass();
                ratingBar.setRating(fDoubleValue);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        View viewFindViewById = nativeAdView.findViewById(R.id.appinstall_media);
        viewFindViewById.getClass();
        nativeAdView.b(l12Var, (MediaView) viewFindViewById);
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        NetworkCapabilities networkCapabilities;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.E = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        boolean zHasCapability = false;
        if (bi3.b(string, Default.DARK)) {
            this.F = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.F = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.F = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_video_tutorial, (ViewGroup) null, false);
        int i2 = R.id.card_view_home_ads;
        if (((MaterialCardView) pn9.a(R.id.card_view_home_ads, viewInflate)) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            i2 = R.id.nativeadframe;
            FrameLayout frameLayout = (FrameLayout) pn9.a(R.id.nativeadframe, viewInflate);
            if (frameLayout != null) {
                i2 = R.id.rvVideoTutorials;
                RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.rvVideoTutorials, viewInflate);
                if (recyclerView != null) {
                    i2 = R.id.toolbar;
                    View viewA = pn9.a(R.id.toolbar, viewInflate);
                    if (viewA != null) {
                        this.B = new bv0(relativeLayout, relativeLayout, frameLayout, recyclerView, l76.a(viewA), 3);
                        setContentView((RelativeLayout) s().b);
                        RelativeLayout relativeLayout2 = (RelativeLayout) s().c;
                        z55 z55Var = new z55(28, this);
                        WeakHashMap weakHashMap = cc7.a;
                        ub7.c(relativeLayout2, z55Var);
                        int i3 = 2;
                        k().a(this, new tq6(this, i3));
                        ((TextView) ((l76) s().f).l).setText(R.string.video_tutorial);
                        Object systemService = getSystemService("connectivity");
                        systemService.getClass();
                        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                            zHasCapability = networkCapabilities.hasCapability(12);
                        }
                        if (zHasCapability) {
                            CPD.ShowDialog(this);
                            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                            executorServiceNewSingleThreadExecutor.execute(new c(29));
                            ab2 ab2VarC = ((gq5) oa2.c().b(gq5.class)).c();
                            ab2VarC.getClass();
                            Executor executor = ab2VarC.c;
                            gb2 gb2Var = new gb2();
                            gb2Var.a(3600L);
                            te9.c(new nz0(i3, ab2VarC, new gb2(gb2Var)), executor);
                            ab2VarC.d();
                            ab2VarC.a().o(executor, new za2(ab2VarC)).k(executorServiceNewSingleThreadExecutor, new e63(25, ab2VarC, this));
                        } else {
                            cc6.i((RelativeLayout) s().c, getString(R.string.no_internet_msg), -1).k();
                        }
                        ((RelativeLayout) ((l76) s().f).c).setOnClickListener(new x7(21, this));
                        return;
                    }
                }
            }
        }
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.iSVideoScreenNative(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i != 9) {
                if (i == 1) {
                    x();
                    return;
                } else {
                    if (i == 2) {
                        y();
                        return;
                    }
                    return;
                }
            }
            int i2 = RemoteAdData.VIDEO_TUTORIAL_SCREEN_NATIVE_TYPE;
            if (i2 == 1) {
                x();
            } else if (i2 == 2) {
                y();
            }
        }
    }

    public final bv0 s() {
        bv0 bv0Var = this.B;
        if (bv0Var != null) {
            return bv0Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final void t() {
        SP sp = this.E;
        if (sp == null) {
            bi3.g("mSP");
            throw null;
        }
        int i = 0;
        int integer = sp.getInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i2 = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSUserManualScreenFS(this)) {
            finish();
            return;
        }
        int i3 = 1;
        if (integer >= RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler(Looper.getMainLooper()).postDelayed(new kb7(this, i), 200L);
            Handler handler = this.H;
            handler.getClass();
            handler.postDelayed(new kb7(this, i3), 7000L);
            return;
        }
        int i4 = integer + 1;
        SP sp2 = this.E;
        if (sp2 == null) {
            bi3.g("mSP");
            throw null;
        }
        sp2.setInteger(this, HelperClass.SETTING_COUNTADS, i4);
        finish();
    }

    public final void u() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ws3(27, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new h94(20, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void x() {
        List listF = iv0.f(lm4.a);
        String str = RemoteAdData.FAQ_NATIVE_ID;
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listF);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new ge4(21, this));
    }

    public final void y() {
        List listF = iv0.f(lm4.a);
        String str = RemoteAdData.ADAX_NATIVE_ID;
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listF);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 7));
    }
}