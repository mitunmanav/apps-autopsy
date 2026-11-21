package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.BefAftReportingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.PDFReportingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.ReportingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
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
import defpackage.e65;
import defpackage.er3;
import defpackage.ge4;
import defpackage.h94;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.l76;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mq7;
import defpackage.mv1;
import defpackage.n8;
import defpackage.pn9;
import defpackage.q6;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.w49;
import defpackage.ws3;
import defpackage.xu6;
import defpackage.z55;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ReportingActivity extends bj {
    public static final /* synthetic */ int G = 0;
    public xu6 B;
    public boolean C;
    public SP D;
    public mo1 E;
    public final Handler F = new Handler(Looper.getMainLooper());

    public static void w(l12 l12Var, NativeAdView nativeAdView) {
        tv5 tv5Var = l12Var.m;
        String str = l12Var.g;
        String str2 = l12Var.f;
        String str3 = l12Var.d;
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.appinstall_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.appinstall_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.appinstall_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.appinstall_app_icon));
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
        nativeAdView.b(l12Var, null);
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.D = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 1;
        final int i3 = 0;
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
        lt1.a(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_reporting, (ViewGroup) null, false);
        int i4 = R.id.adlayout;
        View viewA = pn9.a(R.id.adlayout, viewInflate);
        if (viewA != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewA;
            er3 er3Var = new er3(i3, relativeLayout, relativeLayout);
            i4 = R.id.cardBefAftReporting;
            MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.cardBefAftReporting, viewInflate);
            if (materialCardView != null) {
                i4 = R.id.cardPdfReporting;
                MaterialCardView materialCardView2 = (MaterialCardView) pn9.a(R.id.cardPdfReporting, viewInflate);
                if (materialCardView2 != null) {
                    i4 = R.id.card_view_home_ads;
                    if (((MaterialCardView) pn9.a(R.id.card_view_home_ads, viewInflate)) != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                        i4 = R.id.nativeadframe;
                        FrameLayout frameLayout = (FrameLayout) pn9.a(R.id.nativeadframe, viewInflate);
                        if (frameLayout != null) {
                            i4 = R.id.toolbar;
                            View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                            if (viewA2 != null) {
                                this.B = new xu6(relativeLayout2, er3Var, materialCardView, materialCardView2, relativeLayout2, frameLayout, l76.a(viewA2), 1);
                                setContentView((RelativeLayout) s().b);
                                RelativeLayout relativeLayout3 = (RelativeLayout) s().f;
                                z55 z55Var = new z55(6, this);
                                WeakHashMap weakHashMap = cc7.a;
                                ub7.c(relativeLayout3, z55Var);
                                k().a(this, new n8(this, 22));
                                ((RelativeLayout) ((l76) s().h).c).setOnClickListener(new View.OnClickListener(this) { // from class: er5
                                    public final /* synthetic */ ReportingActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i5 = i3;
                                        ReportingActivity reportingActivity = this.b;
                                        switch (i5) {
                                            case 0:
                                                int i6 = ReportingActivity.G;
                                                reportingActivity.t();
                                                break;
                                            case 1:
                                                int i7 = ReportingActivity.G;
                                                reportingActivity.startActivity(new Intent(reportingActivity, (Class<?>) PDFReportingActivity.class));
                                                break;
                                            default:
                                                int i8 = ReportingActivity.G;
                                                reportingActivity.startActivity(new Intent(reportingActivity, (Class<?>) BefAftReportingActivity.class));
                                                break;
                                        }
                                    }
                                });
                                ((MaterialCardView) s().e).setOnClickListener(new View.OnClickListener(this) { // from class: er5
                                    public final /* synthetic */ ReportingActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i5 = i2;
                                        ReportingActivity reportingActivity = this.b;
                                        switch (i5) {
                                            case 0:
                                                int i6 = ReportingActivity.G;
                                                reportingActivity.t();
                                                break;
                                            case 1:
                                                int i7 = ReportingActivity.G;
                                                reportingActivity.startActivity(new Intent(reportingActivity, (Class<?>) PDFReportingActivity.class));
                                                break;
                                            default:
                                                int i8 = ReportingActivity.G;
                                                reportingActivity.startActivity(new Intent(reportingActivity, (Class<?>) BefAftReportingActivity.class));
                                                break;
                                        }
                                    }
                                });
                                final int i5 = 2;
                                ((MaterialCardView) s().d).setOnClickListener(new View.OnClickListener(this) { // from class: er5
                                    public final /* synthetic */ ReportingActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i5;
                                        ReportingActivity reportingActivity = this.b;
                                        switch (i6) {
                                            case 0:
                                                int i7 = ReportingActivity.G;
                                                reportingActivity.t();
                                                break;
                                            case 1:
                                                int i8 = ReportingActivity.G;
                                                reportingActivity.startActivity(new Intent(reportingActivity, (Class<?>) PDFReportingActivity.class));
                                                break;
                                            default:
                                                int i9 = ReportingActivity.G;
                                                reportingActivity.startActivity(new Intent(reportingActivity, (Class<?>) BefAftReportingActivity.class));
                                                break;
                                        }
                                    }
                                });
                                ((TextView) ((l76) s().h).l).setText(getString(R.string.reports));
                                return;
                            }
                        }
                    }
                }
            }
        }
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!AllAdsApproval.isReportingScreenBanner(this)) {
            ((RelativeLayout) ((er3) s().c).c).setVisibility(8);
            return;
        }
        Admob admob = new Admob();
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        if (i == 9) {
            int i2 = RemoteAdData.REPORTING_SCREEN_BANNER_TYPE;
            if (i2 == 1) {
                admob.loadAdaptive_banner(this, (RelativeLayout) ((er3) s().c).c, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
            } else if (i2 == 2) {
                admob.loadAdaptive_bannerAdax(this, (RelativeLayout) ((er3) s().c).c, RemoteAdData.ADAX_BANNER_ID);
            }
        } else if (i == 1) {
            admob.loadAdaptive_banner(this, (RelativeLayout) ((er3) s().c).c, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
        } else if (i == 2) {
            admob.loadAdaptive_bannerAdax(this, (RelativeLayout) ((er3) s().c).c, RemoteAdData.ADAX_BANNER_ID);
        }
        if (AllAdsApproval.isReportingScreenBanner(this)) {
            int i3 = RemoteAdData.ADS_NETWORK_TYPE;
            if (i3 != 9) {
                if (i3 == 1) {
                    x();
                    return;
                } else {
                    if (i3 == 2) {
                        y();
                        return;
                    }
                    return;
                }
            }
            int i4 = RemoteAdData.REPORTING_SCREEN_BANNER_TYPE;
            if (i4 == 1) {
                x();
            } else if (i4 == 2) {
                y();
            }
        }
    }

    public final xu6 s() {
        xu6 xu6Var = this.B;
        if (xu6Var != null) {
            return xu6Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final void t() {
        SP sp = this.D;
        if (sp == null) {
            bi3.g("mSP");
            throw null;
        }
        final int i = 0;
        int integer = sp.getInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSReportingFS(this)) {
            finish();
            return;
        }
        final int i3 = 1;
        if (integer >= RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler().postDelayed(new Runnable(this) { // from class: fr5
                public final /* synthetic */ ReportingActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    ReportingActivity reportingActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = ReportingActivity.G;
                            SP sp2 = reportingActivity.D;
                            if (sp2 == null) {
                                bi3.g("mSP");
                                throw null;
                            }
                            sp2.setInteger(reportingActivity, HelperClass.COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 != 9) {
                                if (i6 == 1) {
                                    reportingActivity.u();
                                    return;
                                } else {
                                    if (i6 == 2) {
                                        reportingActivity.v();
                                        return;
                                    }
                                    return;
                                }
                            }
                            int i7 = RemoteAdData.REPORTING_SCREEN_FS_TYPE;
                            if (i7 == 1) {
                                reportingActivity.u();
                                return;
                            } else {
                                if (i7 == 2) {
                                    reportingActivity.v();
                                    return;
                                }
                                return;
                            }
                        default:
                            int i8 = ReportingActivity.G;
                            CPD.DismissDialog();
                            mo1 mo1Var = reportingActivity.E;
                            if (mo1Var != null) {
                                mo1Var.b.a(reportingActivity);
                                return;
                            } else {
                                reportingActivity.finish();
                                return;
                            }
                    }
                }
            }, 200L);
            Handler handler = this.F;
            handler.getClass();
            handler.postDelayed(new Runnable(this) { // from class: fr5
                public final /* synthetic */ ReportingActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    ReportingActivity reportingActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = ReportingActivity.G;
                            SP sp2 = reportingActivity.D;
                            if (sp2 == null) {
                                bi3.g("mSP");
                                throw null;
                            }
                            sp2.setInteger(reportingActivity, HelperClass.COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 != 9) {
                                if (i6 == 1) {
                                    reportingActivity.u();
                                    return;
                                } else {
                                    if (i6 == 2) {
                                        reportingActivity.v();
                                        return;
                                    }
                                    return;
                                }
                            }
                            int i7 = RemoteAdData.REPORTING_SCREEN_FS_TYPE;
                            if (i7 == 1) {
                                reportingActivity.u();
                                return;
                            } else {
                                if (i7 == 2) {
                                    reportingActivity.v();
                                    return;
                                }
                                return;
                            }
                        default:
                            int i8 = ReportingActivity.G;
                            CPD.DismissDialog();
                            mo1 mo1Var = reportingActivity.E;
                            if (mo1Var != null) {
                                mo1Var.b.a(reportingActivity);
                                return;
                            } else {
                                reportingActivity.finish();
                                return;
                            }
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
        sp2.setInteger(this, HelperClass.COUNTADS, i4);
        finish();
    }

    public final void u() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ws3(14, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new h94(9, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void x() {
        List listF = iv0.f(lm4.a);
        String str = RemoteAdData.PDF_SETTING_SCREEN_NATIVE_ID;
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listF);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new ge4(8, this));
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new e65(4, this));
    }
}