package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import ads_mobile_sdk.mo1;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.gIwi.GdCAWuElcaQTW;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.BefAftSettingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RoundImageView;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.itextpdf.text.pdf.codec.TIFFConstants;
import defpackage.a7;
import defpackage.b40;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.e51;
import defpackage.fo4;
import defpackage.fs7;
import defpackage.g5;
import defpackage.h20;
import defpackage.hk7;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.k54;
import defpackage.l76;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.m8;
import defpackage.mm4;
import defpackage.mq7;
import defpackage.mv1;
import defpackage.n8;
import defpackage.pn9;
import defpackage.q6;
import defpackage.rm;
import defpackage.t30;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.v30;
import defpackage.vb7;
import defpackage.vm8;
import defpackage.w49;
import defpackage.yf3;
import defpackage.yg2;
import defpackage.z2;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class BefAftSettingActivity extends bj {
    public static final /* synthetic */ int Q = 0;
    public g5 B;
    public boolean C;
    public SP D;
    public boolean F;
    public int N;
    public mo1 O;
    public b40 E = new b40();
    public boolean G = true;
    public boolean H = true;
    public boolean I = true;
    public String J = "";
    public String K = "";
    public String L = "";
    public String M = "";
    public final Handler P = new Handler(Looper.getMainLooper());

    public static void y(l12 l12Var, NativeAdView nativeAdView) {
        tv5 tv5Var = l12Var.m;
        String str = l12Var.g;
        String str2 = l12Var.f;
        String str3 = l12Var.d;
        if (nativeAdView != null) {
            nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.primary));
            nativeAdView.setBodyView(nativeAdView.findViewById(R.id.secondary));
            nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.call_to_action));
            nativeAdView.setIconView(nativeAdView.findViewById(R.id.icon));
        }
        if (str3 != null) {
            try {
                nativeAdView.getClass();
                View headlineView = nativeAdView.getHeadlineView();
                headlineView.getClass();
                ((TextView) headlineView).setText(str3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (str2 != null) {
            try {
                nativeAdView.getClass();
                View bodyView = nativeAdView.getBodyView();
                bodyView.getClass();
                ((TextView) bodyView).setText(str2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (str != null) {
            try {
                nativeAdView.getClass();
                View callToActionView = nativeAdView.getCallToActionView();
                callToActionView.getClass();
                ((Button) callToActionView).setText(str);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            tv5Var.getClass();
            if (((Drawable) tv5Var.b) != null) {
                nativeAdView.getClass();
                View iconView = nativeAdView.getIconView();
                iconView.getClass();
                tv5Var.getClass();
                ((ImageView) iconView).setImageDrawable((Drawable) tv5Var.b);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        nativeAdView.getClass();
        nativeAdView.b(l12Var, null);
    }

    public final void A() {
        String string = t().getString(this, "m_bef_aft_logo", Default.LOGO_uri);
        string.getClass();
        if (string.equals(Default.LOGO_uri)) {
            ((RoundImageView) s().k).setImageResource(R.drawable.splash_icon);
        } else {
            Executors.newSingleThreadExecutor().execute(new m8(20, string, this));
        }
        t().setString(this, SP.BEF_AFT_PDF_LOGO, string);
    }

    public final void B() {
        String string = t().getString(this, "m_bef_aft_title", "");
        string.getClass();
        s().h.setText(string);
        t().setString(this, SP.BEF_AFT_PDF_REPORT_NAME, string);
    }

    public final void C(int i) {
        String strJ = fs7.j(i, "BefAftSettingFragment_");
        yg2 yg2VarC = o().C(strJ);
        if (yg2VarC == null || !yg2VarC.u()) {
            b40 b40Var = new b40();
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            b40Var.X(bundle);
            b40Var.o0 = new tv5(7, this);
            this.E = b40Var;
            b40Var.d0(o(), strJ);
        }
    }

    public final void D(String str) {
        yf3 yf3VarH;
        cc6 cc6VarI = cc6.i((RelativeLayout) s().i, str, -1);
        h20 h20Var = cc6VarI.i;
        if (((MaterialCardView) s().j).getVisibility() == 0) {
            cc6VarI.f((MaterialCardView) s().j);
        } else {
            int i = this.N;
            int i2 = 0;
            if (i <= 0) {
                RelativeLayout relativeLayout = (RelativeLayout) s().i;
                WeakHashMap weakHashMap = cc7.a;
                hk7 hk7VarA = vb7.a(relativeLayout);
                i = (hk7VarA == null || (yf3VarH = hk7VarA.a.h(TIFFConstants.TIFFTAG_JPEGQTABLES)) == null) ? 0 : yf3VarH.d;
            }
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = h20Var.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin += i;
                    h20Var.setLayoutParams(marginLayoutParams);
                } else {
                    h20Var.post(new t30(cc6VarI, i, i2));
                }
            }
        }
        cc6VarI.k();
    }

    public final void E(boolean z) {
        String string = t().getString(this, "m_bef_aft_company_name", "");
        string.getClass();
        int length = string.length();
        int i = R.drawable.ic_uncheck_box_tple;
        if (length == 0 || string.equals("-")) {
            t().setBoolean(this, "mIS_bef_aft_company_name", false);
            s().d.setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (z) {
            t().setBoolean(this, "mIS_bef_aft_company_name", true);
            s().d.setImageResource(R.drawable.ic_select_btn);
        } else {
            boolean z2 = t().getBoolean(this, "mIS_bef_aft_company_name", false);
            ImageView imageView = s().d;
            if (z2) {
                i = R.drawable.ic_select_btn;
            }
            imageView.setImageResource(i);
        }
        s().c.setText(string);
        t().setString(this, SP.BEF_AFT_PDF_COMPANY_NAME, string);
    }

    public final void F(boolean z) {
        String string = t().getString(this, "m_bef_aft_prepared_by", "");
        string.getClass();
        int length = string.length();
        int i = R.drawable.ic_uncheck_box_tple;
        if (length == 0 || string.equals("-")) {
            t().setBoolean(this, "mIS_bef_aft_prepared_by", false);
            ((ImageView) s().l).setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (z) {
            t().setBoolean(this, "mIS_bef_aft_prepared_by", true);
            ((ImageView) s().l).setImageResource(R.drawable.ic_select_btn);
        } else {
            boolean z2 = t().getBoolean(this, "mIS_bef_aft_prepared_by", false);
            ImageView imageView = (ImageView) s().l;
            if (z2) {
                i = R.drawable.ic_select_btn;
            }
            imageView.setImageResource(i);
        }
        s().g.setText(string);
        t().setString(this, SP.BEF_AFT_PDF_PERSON_NAME, string);
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        new HelperClass().SetLanguage(this);
        this.D = new SP(this);
        String string = t().getString(this, SP.APP_THEME, Default.LIGHT);
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
        super.onCreate(bundle);
        lt1.a(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_befaftsetting, (ViewGroup) null, false);
        int i4 = R.id.card_view_home_ads;
        MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.card_view_home_ads, viewInflate);
        if (materialCardView != null) {
            i4 = R.id.imageview_logo;
            RoundImageView roundImageView = (RoundImageView) pn9.a(R.id.imageview_logo, viewInflate);
            if (roundImageView != null) {
                i4 = R.id.imgCompanyName;
                ImageView imageView = (ImageView) pn9.a(R.id.imgCompanyName, viewInflate);
                if (imageView != null) {
                    i4 = R.id.img_logo;
                    ImageView imageView2 = (ImageView) pn9.a(R.id.img_logo, viewInflate);
                    if (imageView2 != null) {
                        i4 = R.id.imgPreparedBy;
                        ImageView imageView3 = (ImageView) pn9.a(R.id.imgPreparedBy, viewInflate);
                        if (imageView3 != null) {
                            i4 = R.id.imgTitle;
                            ImageView imageView4 = (ImageView) pn9.a(R.id.imgTitle, viewInflate);
                            if (imageView4 != null) {
                                i4 = R.id.linCompanyName;
                                LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.linCompanyName, viewInflate);
                                if (linearLayout != null) {
                                    i4 = R.id.lin_logo;
                                    LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.lin_logo, viewInflate);
                                    if (linearLayout2 != null) {
                                        i4 = R.id.linPreparedBy;
                                        LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.linPreparedBy, viewInflate);
                                        if (linearLayout3 != null) {
                                            i4 = R.id.linTitle;
                                            LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.linTitle, viewInflate);
                                            if (linearLayout4 != null) {
                                                i4 = R.id.llMainSetting;
                                                if (((LinearLayout) pn9.a(R.id.llMainSetting, viewInflate)) != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                    i4 = R.id.nativeadframe;
                                                    FrameLayout frameLayout = (FrameLayout) pn9.a(R.id.nativeadframe, viewInflate);
                                                    if (frameLayout != null) {
                                                        i4 = R.id.toolbar;
                                                        View viewA = pn9.a(R.id.toolbar, viewInflate);
                                                        if (viewA != null) {
                                                            l76 l76VarA = l76.a(viewA);
                                                            i4 = R.id.txtCompanyName;
                                                            TextView textView = (TextView) pn9.a(R.id.txtCompanyName, viewInflate);
                                                            if (textView != null) {
                                                                i4 = R.id.txtPreparedBy;
                                                                TextView textView2 = (TextView) pn9.a(R.id.txtPreparedBy, viewInflate);
                                                                if (textView2 != null) {
                                                                    i4 = R.id.txtTitle;
                                                                    TextView textView3 = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                    if (textView3 != null) {
                                                                        this.B = new g5(relativeLayout, materialCardView, roundImageView, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, frameLayout, l76VarA, textView, textView2, textView3);
                                                                        setContentView(s().b);
                                                                        ((TextView) ((l76) s().r).l).setText(getString(R.string.before_after));
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) s().i;
                                                                        final int i5 = 5;
                                                                        e51 e51Var = new e51(i5, this);
                                                                        WeakHashMap weakHashMap = cc7.a;
                                                                        ub7.c(relativeLayout2, e51Var);
                                                                        ((RelativeLayout) ((l76) s().r).c).setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i6 = i2;
                                                                                int i7 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i6) {
                                                                                    case 0:
                                                                                        int i8 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i7 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i7);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i9 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i10 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i11 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i7 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i7);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i12 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i13 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i7 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i7);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i7 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i7);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i6 = 2;
                                                                        ((LinearLayout) s().n).setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i7 = i6;
                                                                                int i8 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i7) {
                                                                                    case 0:
                                                                                        int i9 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i8 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i8);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i10 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i11 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i12 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i8 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i8);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i13 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i8 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i8);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i8 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i8);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i7 = 3;
                                                                        s().e.setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i8 = i7;
                                                                                int i9 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i8) {
                                                                                    case 0:
                                                                                        int i10 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i9 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i9);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i11 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i12 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i13 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i9 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i9);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i9 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i9);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i9 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i9);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i18 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i8 = 4;
                                                                        s().f.setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i9 = i8;
                                                                                int i10 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i9) {
                                                                                    case 0:
                                                                                        int i11 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i10 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i10);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i12 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i13 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i10 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i10);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i10 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i10);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i18 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i10 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i10);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i19 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        s().d.setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i9 = i5;
                                                                                int i10 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i9) {
                                                                                    case 0:
                                                                                        int i11 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i10 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i10);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i12 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i13 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i10 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i10);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i10 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i10);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i18 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i10 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i10);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i19 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i9 = 6;
                                                                        ((LinearLayout) s().p).setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i10 = i9;
                                                                                int i11 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i10) {
                                                                                    case 0:
                                                                                        int i12 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i11 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i11);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i13 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i11 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i11);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i11 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i11);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i18 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i19 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i11 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i11);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i110 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i10 = 7;
                                                                        ((ImageView) s().m).setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i11 = i10;
                                                                                int i12 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i11) {
                                                                                    case 0:
                                                                                        int i13 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i12 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i12);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i12 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i12);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i18 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i12 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i12);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i19 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i110 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i12 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i12);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i111 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i11 = 8;
                                                                        ((LinearLayout) s().o).setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i12 = i11;
                                                                                int i13 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i12) {
                                                                                    case 0:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i13 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i13);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i13 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i13);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i18 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i19 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i13 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i13);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i110 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i111 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i13 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i13);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i112 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        ((ImageView) s().l).setOnClickListener(new View.OnClickListener(this) { // from class: s30
                                                                            public final /* synthetic */ BefAftSettingActivity b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i12 = i3;
                                                                                int i13 = R.drawable.ic_uncheck_box_tple;
                                                                                BefAftSettingActivity befAftSettingActivity = this.b;
                                                                                switch (i12) {
                                                                                    case 0:
                                                                                        int i14 = BefAftSettingActivity.Q;
                                                                                        String string2 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_prepared_by", "");
                                                                                        string2.getClass();
                                                                                        if (string2.length() != 0) {
                                                                                            boolean z = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_prepared_by", !z);
                                                                                            ImageView imageView5 = (ImageView) befAftSettingActivity.s().l;
                                                                                            if (!z) {
                                                                                                i13 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView5.setImageResource(i13);
                                                                                        } else {
                                                                                            String string3 = befAftSettingActivity.getString(R.string.enter_prepared_by);
                                                                                            string3.getClass();
                                                                                            befAftSettingActivity.D(string3);
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        int i15 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.z();
                                                                                        break;
                                                                                    case 2:
                                                                                        int i16 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(1);
                                                                                        break;
                                                                                    case 3:
                                                                                        int i17 = BefAftSettingActivity.Q;
                                                                                        boolean z2 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_logo", false);
                                                                                        befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_logo", !z2);
                                                                                        ImageView imageView6 = befAftSettingActivity.s().e;
                                                                                        if (!z2) {
                                                                                            i13 = R.drawable.ic_select_btn;
                                                                                        }
                                                                                        imageView6.setImageResource(i13);
                                                                                        break;
                                                                                    case 4:
                                                                                        int i18 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(2);
                                                                                        break;
                                                                                    case 5:
                                                                                        int i19 = BefAftSettingActivity.Q;
                                                                                        String string4 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_company_name", "");
                                                                                        string4.getClass();
                                                                                        if (string4.length() != 0) {
                                                                                            boolean z3 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", false);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_company_name", !z3);
                                                                                            ImageView imageView7 = befAftSettingActivity.s().d;
                                                                                            if (!z3) {
                                                                                                i13 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView7.setImageResource(i13);
                                                                                        } else {
                                                                                            String string5 = befAftSettingActivity.getString(R.string.enter_company_name);
                                                                                            string5.getClass();
                                                                                            befAftSettingActivity.D(string5);
                                                                                        }
                                                                                        break;
                                                                                    case 6:
                                                                                        int i110 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(3);
                                                                                        break;
                                                                                    case 7:
                                                                                        int i111 = BefAftSettingActivity.Q;
                                                                                        String string6 = befAftSettingActivity.t().getString(befAftSettingActivity, "m_bef_aft_title", "");
                                                                                        string6.getClass();
                                                                                        if (string6.length() != 0) {
                                                                                            boolean z4 = befAftSettingActivity.t().getBoolean(befAftSettingActivity, "mIS_bef_aft_title", true);
                                                                                            befAftSettingActivity.t().setBoolean(befAftSettingActivity, "mIS_bef_aft_title", !z4);
                                                                                            ImageView imageView8 = (ImageView) befAftSettingActivity.s().m;
                                                                                            if (!z4) {
                                                                                                i13 = R.drawable.ic_select_btn;
                                                                                            }
                                                                                            imageView8.setImageResource(i13);
                                                                                        } else {
                                                                                            String string7 = befAftSettingActivity.getString(R.string.report_name_empty);
                                                                                            string7.getClass();
                                                                                            befAftSettingActivity.D(string7);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        int i112 = BefAftSettingActivity.Q;
                                                                                        befAftSettingActivity.C(4);
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        k().a(this, new n8(this, i6));
                                                                        this.E.o0 = new rm(i11, this);
                                                                        this.F = t().getBoolean(this, SP.IS_BEF_AFT_LOGO, false);
                                                                        this.G = t().getBoolean(this, SP.IS_BEF_AFT_COMPANY_NAME, false);
                                                                        this.H = t().getBoolean(this, SP.IS_BEF_AFT_TITLE, true);
                                                                        this.I = t().getBoolean(this, SP.IS_BEF_AFT_PREPARED_BY, false);
                                                                        String string2 = t().getString(this, SP.BEF_AFT_PDF_LOGO, Default.LOGO_uri);
                                                                        string2.getClass();
                                                                        this.J = string2;
                                                                        String string3 = t().getString(this, SP.BEF_AFT_PDF_COMPANY_NAME, "");
                                                                        string3.getClass();
                                                                        this.K = string3;
                                                                        String string4 = t().getString(this, SP.BEF_AFT_PDF_REPORT_NAME, "");
                                                                        string4.getClass();
                                                                        this.L = string4;
                                                                        String string5 = t().getString(this, SP.BEF_AFT_PDF_PERSON_NAME, "");
                                                                        string5.getClass();
                                                                        this.M = string5;
                                                                        t().setBoolean(this, "mIS_bef_aft_logo", this.F);
                                                                        t().setBoolean(this, "mIS_bef_aft_company_name", this.G);
                                                                        t().setBoolean(this, "mIS_bef_aft_title", this.H);
                                                                        t().setBoolean(this, "mIS_bef_aft_prepared_by", this.I);
                                                                        t().setString(this, GdCAWuElcaQTW.mjczNVoGZ, this.J);
                                                                        t().setString(this, "m_bef_aft_company_name", this.K);
                                                                        t().setString(this, "m_bef_aft_title", this.L);
                                                                        t().setString(this, "m_bef_aft_prepared_by", this.M);
                                                                        if (this.F) {
                                                                            s().e.setImageResource(R.drawable.ic_select_btn);
                                                                        } else {
                                                                            s().e.setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                        }
                                                                        if (this.G) {
                                                                            s().d.setImageResource(R.drawable.ic_select_btn);
                                                                        } else {
                                                                            s().d.setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                        }
                                                                        if (this.I) {
                                                                            ((ImageView) s().l).setImageResource(R.drawable.ic_select_btn);
                                                                        } else {
                                                                            ((ImageView) s().l).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                        }
                                                                        A();
                                                                        E(false);
                                                                        B();
                                                                        F(false);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
        if (AllAdsApproval.isBefAftPDFSettingSmallNative(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                if (RemoteAdData.BEF_AFT_SETTING_SCREEN_NATIVE == 1) {
                    w();
                    return;
                } else {
                    if (RemoteAdData.BEF_AFT_SETTING_SCREEN_NATIVE_TYPE == 2) {
                        x();
                        return;
                    }
                    return;
                }
            }
            if (i == 1) {
                w();
            } else if (i == 2) {
                x();
            }
        }
    }

    public final g5 s() {
        g5 g5Var = this.B;
        if (g5Var != null) {
            return g5Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final SP t() {
        SP sp = this.D;
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
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new fo4(7, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new k54(5, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void w() {
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new vm8(8, this));
    }

    public final void x() {
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 0));
    }

    public final void z() {
        t().setBoolean(this, SP.IS_BEF_AFT_LOGO, t().getBoolean(this, "mIS_bef_aft_logo", false));
        t().setBoolean(this, SP.IS_BEF_AFT_COMPANY_NAME, t().getBoolean(this, "mIS_bef_aft_company_name", false));
        t().setBoolean(this, SP.IS_BEF_AFT_TITLE, t().getBoolean(this, "mIS_bef_aft_title", true));
        t().setBoolean(this, SP.IS_BEF_AFT_PREPARED_BY, t().getBoolean(this, "mIS_bef_aft_prepared_by", false));
        SP spT = t();
        String string = t().getString(this, "m_bef_aft_logo", Default.LOGO_uri);
        string.getClass();
        spT.setString(this, SP.BEF_AFT_PDF_LOGO, string);
        SP spT2 = t();
        String string2 = t().getString(this, "m_bef_aft_company_name", "");
        string2.getClass();
        spT2.setString(this, SP.BEF_AFT_PDF_COMPANY_NAME, string2);
        SP spT3 = t();
        String string3 = t().getString(this, "m_bef_aft_title", "");
        string3.getClass();
        spT3.setString(this, SP.BEF_AFT_PDF_REPORT_NAME, string3);
        SP spT4 = t();
        String string4 = t().getString(this, "m_bef_aft_prepared_by", "");
        string4.getClass();
        spT4.setString(this, SP.BEF_AFT_PDF_PERSON_NAME, string4);
        int integer = t().getInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
        if (integer > i) {
            integer = i;
        }
        if (!AllAdsApproval.iSBefAftSettingScreenFS(this)) {
            finish();
            return;
        }
        if (integer < RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
            t().setInteger(this, HelperClass.SETTING_COUNTADS, integer + 1);
            finish();
            return;
        }
        CPD.ShowDialog(this, getString(R.string.cluster_loading));
        t().setInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i2 = RemoteAdData.ADS_NETWORK_TYPE;
        if (i2 == 9) {
            int i3 = RemoteAdData.BEF_AFT_SETTING_SCREEN_FS_TYPE;
            if (i3 == 1) {
                u();
            } else if (i3 == 2) {
                v();
            }
        } else if (i2 == 1) {
            u();
        } else if (i2 == 2) {
            v();
        }
        Handler handler = this.P;
        handler.getClass();
        handler.postDelayed(new z2(10, this), 7000L);
    }
}