package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import defpackage.bi3;
import defpackage.bj;
import defpackage.cc7;
import defpackage.d63;
import defpackage.gd4;
import defpackage.ge4;
import defpackage.hv0;
import defpackage.ie8;
import defpackage.iv0;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mq7;
import defpackage.mv1;
import defpackage.mx4;
import defpackage.pm;
import defpackage.pn9;
import defpackage.px4;
import defpackage.q6;
import defpackage.q71;
import defpackage.qj;
import defpackage.s65;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.v30;
import defpackage.vm1;
import defpackage.w49;
import defpackage.x32;
import defpackage.x7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OnBoardingActivity extends bj {
    public static final /* synthetic */ int C = 0;
    public ie8 B;

    public static void u(l12 l12Var, NativeAdView nativeAdView) {
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
        nativeAdView.b(l12Var, (MediaView) nativeAdView.findViewById(R.id.appinstall_media));
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        setTheme(R.style.AppTheme);
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_on_boarding, (ViewGroup) null, false);
        int i2 = R.id.card_view_home_ads;
        MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.card_view_home_ads, viewInflate);
        if (materialCardView != null) {
            i2 = R.id.dots_indicator;
            DotsIndicator dotsIndicator = (DotsIndicator) pn9.a(R.id.dots_indicator, viewInflate);
            if (dotsIndicator != null) {
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                i2 = R.id.mainText;
                TextView textView = (TextView) pn9.a(R.id.mainText, viewInflate);
                if (textView != null) {
                    i2 = R.id.nativeadframe;
                    FrameLayout frameLayout = (FrameLayout) pn9.a(R.id.nativeadframe, viewInflate);
                    if (frameLayout != null) {
                        i2 = R.id.progress_button;
                        View viewA = pn9.a(R.id.progress_button, viewInflate);
                        if (viewA != null) {
                            int i3 = R.id.centerButton;
                            ImageButton imageButton = (ImageButton) pn9.a(R.id.centerButton, viewA);
                            if (imageButton != null) {
                                i3 = R.id.circularProgress;
                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) pn9.a(R.id.circularProgress, viewA);
                                if (circularProgressIndicator != null) {
                                    pm pmVar = new pm((RelativeLayout) viewA, imageButton, circularProgressIndicator, 23, false);
                                    i2 = R.id.subText;
                                    TextView textView2 = (TextView) pn9.a(R.id.subText, viewInflate);
                                    if (textView2 != null) {
                                        i2 = R.id.view_pager;
                                        ViewPager viewPager = (ViewPager) pn9.a(R.id.view_pager, viewInflate);
                                        if (viewPager != null) {
                                            this.B = new ie8(relativeLayout, materialCardView, dotsIndicator, relativeLayout, textView, frameLayout, pmVar, textView2, viewPager, 2);
                                            setContentView((RelativeLayout) t().b);
                                            k().a(this, new mx4(true, i));
                                            s();
                                            RelativeLayout relativeLayout2 = (RelativeLayout) t().e;
                                            x32 x32Var = new x32(29, this);
                                            WeakHashMap weakHashMap = cc7.a;
                                            ub7.c(relativeLayout2, x32Var);
                                            return;
                                        }
                                    }
                                }
                            }
                            mq7.o("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i3)));
                            return;
                        }
                    }
                }
            }
        }
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((ViewPager) t().j).setAdapter(new px4(this));
        DotsIndicator dotsIndicator = (DotsIndicator) t().d;
        ViewPager viewPager = (ViewPager) t().j;
        s65 adapter = viewPager.getAdapter();
        if (adapter == null) {
            qj.l("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
            return;
        }
        adapter.a.registerObserver(new q71(3, new vm1(0, dotsIndicator)));
        dotsIndicator.setPager(new d63(viewPager));
        dotsIndicator.d();
        ViewPager viewPager2 = (ViewPager) t().j;
        gd4 gd4Var = new gd4(1, this);
        ArrayList arrayList = viewPager2.R;
        if (arrayList == null) {
            arrayList = new ArrayList();
            viewPager2.R = arrayList;
        }
        arrayList.add(gd4Var);
        ((ImageButton) ((pm) t().h).c).setOnClickListener(new x7(11, this));
    }

    public final void s() {
        if (AllAdsApproval.iSOnboardNative(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i != 9) {
                if (i == 1) {
                    v();
                    return;
                } else {
                    if (i == 2) {
                        w();
                        return;
                    }
                    return;
                }
            }
            int i2 = RemoteAdData.ONBOARD_NATIVE_TYPE;
            if (i2 == 1) {
                v();
            } else if (i2 == 2) {
                w();
            }
        }
    }

    public final ie8 t() {
        ie8 ie8Var = this.B;
        if (ie8Var != null) {
            return ie8Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final void v() {
        List listF = iv0.f(lm4.a);
        String str = RemoteAdData.ONBOARDING_NATIVE_ID;
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listF);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new ge4(2, this));
    }

    public final void w() {
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 4));
    }
}