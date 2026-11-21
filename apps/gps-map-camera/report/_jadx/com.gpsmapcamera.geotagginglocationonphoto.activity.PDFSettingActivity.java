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
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.concurrent.cf.OTysxApt;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.PDFSettingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RoundImageView;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.itextpdf.text.pdf.codec.TIFFConstants;
import com.itextpdf.text.pdf.parser.HriA.jumTrYZsYnyZCd;
import defpackage.a7;
import defpackage.ad3;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.fs7;
import defpackage.g65;
import defpackage.ge4;
import defpackage.h20;
import defpackage.hk7;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.iw3;
import defpackage.j64;
import defpackage.k54;
import defpackage.l76;
import defpackage.lf3;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mq7;
import defpackage.mv1;
import defpackage.n8;
import defpackage.pn9;
import defpackage.q6;
import defpackage.st2;
import defpackage.t30;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.v30;
import defpackage.v5;
import defpackage.vb7;
import defpackage.vc4;
import defpackage.w49;
import defpackage.yf3;
import defpackage.yg2;
import defpackage.z55;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class PDFSettingActivity extends bj {
    public static final /* synthetic */ int Y = 0;
    public v5 B;
    public boolean C;
    public SP D;
    public boolean F;
    public boolean G;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int V;
    public mo1 W;
    public g65 E = new g65();
    public boolean H = true;
    public boolean I = true;
    public String N = "";
    public String O = "";
    public String P = "";
    public String Q = "";
    public String R = "";
    public String S = "";
    public String T = "";
    public String U = "";
    public final Handler X = new Handler(Looper.getMainLooper());

    public static void D(l12 l12Var, NativeAdView nativeAdView) {
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
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new k54(29, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void B() {
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new ad3(10, this));
    }

    public final void C() {
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 5));
    }

    public final void E() {
        t().setBoolean(this, SP.IS_PDF_LOGO, t().getBoolean(this, "mIS_pdf_logo", false));
        t().setBoolean(this, SP.IS_PDF_COMPANY_NAME, t().getBoolean(this, "mIS_pdf_company_name", false));
        t().setBoolean(this, SP.IS_PDF_TITLE, t().getBoolean(this, "mIS_pdf_title", true));
        t().setBoolean(this, SP.IS_PDF_SUPERVISOR, t().getBoolean(this, "mIS_pdf_supervisor", false));
        t().setBoolean(this, SP.IS_PDF_REPORT_BY, t().getBoolean(this, "mIS_pdf_report_by", false));
        t().setBoolean(this, SP.IS_PDF_PROJECT_NAME, t().getBoolean(this, "mIS_pdf_project_name", false));
        t().setBoolean(this, SP.IS_PDF_REMARK, t().getBoolean(this, "mIS_pdf_remark", false));
        SP spT = t();
        String string = t().getString(this, "m_pdf_logo", Default.LOGO_uri);
        string.getClass();
        spT.setString(this, SP.PDF_LOGO, string);
        t().setString(this, SP.PDF_COMPANY_NAME, u());
        SP spT2 = t();
        String string2 = t().getString(this, "m_pdf_title", getString(R.string.work_report));
        string2.getClass();
        spT2.setString(this, SP.PDF_TITLE, string2);
        t().setString(this, SP.PDF_SUPERVISOR, y());
        t().setString(this, SP.PDF_REPORT_BY, x());
        t().setString(this, SP.PDF_PROJECT_NAME, v());
        t().setString(this, SP.PDF_REMARK, w());
        int integer = t().getInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
        if (integer > i) {
            integer = i;
        }
        if (!AllAdsApproval.iSPDFSettingScreenFS(this)) {
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
        int i3 = 9;
        if (i2 == 9) {
            int i4 = RemoteAdData.PDF_SETTING_SCREEN_FS_TYPE;
            if (i4 == 1) {
                z();
            } else if (i4 == 2) {
                A();
            }
        } else if (i2 == 1) {
            z();
        } else if (i2 == 2) {
            A();
        }
        Handler handler = this.X;
        handler.getClass();
        handler.postDelayed(new vc4(i3, this), 7000L);
    }

    public final void F() {
        String string = t().getString(this, "m_pdf_logo", Default.LOGO_uri);
        string.getClass();
        if (string.equals(Default.LOGO_uri)) {
            ((RoundImageView) s().d).setImageResource(R.drawable.splash_icon);
        } else {
            Executors.newSingleThreadExecutor().execute(new iw3(12, string, this));
        }
        t().setString(this, SP.PDF_LOGO, string);
    }

    public final void G() {
        String string = t().getString(this, "m_pdf_title", getString(R.string.work_report));
        string.getClass();
        ((TextView) s().A).setText(string);
        t().setString(this, SP.PDF_TITLE, string);
    }

    public final void H(int i) {
        String strJ = fs7.j(i, "PDFSettingFragment_");
        yg2 yg2VarC = o().C(strJ);
        if (yg2VarC == null || !yg2VarC.u()) {
            g65 g65Var = new g65();
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            g65Var.X(bundle);
            g65Var.o0 = new j64(5, this);
            this.E = g65Var;
            g65Var.d0(o(), strJ);
        }
    }

    public final void I(String str) {
        yf3 yf3VarH;
        cc6 cc6VarI = cc6.i((RelativeLayout) s().b, str, -1);
        h20 h20Var = cc6VarI.i;
        if (((MaterialCardView) s().c).getVisibility() == 0) {
            cc6VarI.f((MaterialCardView) s().c);
        } else {
            int i = this.V;
            if (i <= 0) {
                RelativeLayout relativeLayout = (RelativeLayout) s().b;
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
                    h20Var.post(new t30(cc6VarI, i, 1));
                }
            }
        }
        cc6VarI.k();
    }

    public final void J(boolean z) {
        String strU = u();
        int length = strU.length();
        int i = R.drawable.ic_uncheck_box_tple;
        if (length == 0 || strU.equals("-")) {
            ((ImageView) st2.f(this, this, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (z) {
            ((ImageView) st2.f(this, this, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
        } else {
            boolean z2 = t().getBoolean(this, "mIS_pdf_company_name", false);
            ImageView imageView = (ImageView) s().e;
            if (z2) {
                i = R.drawable.ic_select_btn;
            }
            imageView.setImageResource(i);
        }
        ((TextView) s().u).setText(strU);
        t().setString(this, SP.PDF_COMPANY_NAME, strU);
    }

    public final void K(boolean z) {
        String strV = v();
        int length = strV.length();
        int i = R.drawable.ic_uncheck_box_tple;
        if (length == 0 || strV.equals("-")) {
            ((ImageView) st2.f(this, this, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (z) {
            ((ImageView) st2.f(this, this, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
        } else {
            boolean z2 = t().getBoolean(this, "mIS_pdf_project_name", false);
            ImageView imageView = (ImageView) s().g;
            if (z2) {
                i = R.drawable.ic_select_btn;
            }
            imageView.setImageResource(i);
        }
        ((TextView) s().w).setText(strV);
        t().setString(this, SP.PDF_PROJECT_NAME, strV);
    }

    public final void L(boolean z) {
        String strW = w();
        int length = strW.length();
        int i = R.drawable.ic_uncheck_box_tple;
        if (length == 0 || strW.equals("-")) {
            ((ImageView) st2.f(this, this, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (z) {
            ((ImageView) st2.f(this, this, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
        } else {
            boolean z2 = t().getBoolean(this, "mIS_pdf_remark", false);
            ImageView imageView = (ImageView) s().h;
            if (z2) {
                i = R.drawable.ic_select_btn;
            }
            imageView.setImageResource(i);
        }
        ((TextView) s().x).setText(strW);
        t().setString(this, SP.PDF_REMARK, strW);
    }

    public final void M(boolean z) {
        String strX = x();
        int length = strX.length();
        String str = jumTrYZsYnyZCd.sziQHG;
        int i = R.drawable.ic_uncheck_box_tple;
        if (length == 0 || strX.equals("-")) {
            ((ImageView) st2.f(this, this, str, false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (z) {
            ((ImageView) st2.f(this, this, str, true).i).setImageResource(R.drawable.ic_select_btn);
        } else {
            boolean z2 = t().getBoolean(this, str, false);
            ImageView imageView = (ImageView) s().i;
            if (z2) {
                i = R.drawable.ic_select_btn;
            }
            imageView.setImageResource(i);
        }
        ((TextView) s().y).setText(strX);
        t().setString(this, SP.PDF_REPORT_BY, strX);
    }

    public final void N(boolean z) {
        String strY = y();
        int length = strY.length();
        int i = R.drawable.ic_uncheck_box_tple;
        if (length == 0 || strY.equals("-")) {
            ((ImageView) st2.f(this, this, "mIS_pdf_supervisor", false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (z) {
            ((ImageView) st2.f(this, this, "mIS_pdf_supervisor", true).j).setImageResource(R.drawable.ic_select_btn);
        } else {
            boolean z2 = t().getBoolean(this, "mIS_pdf_supervisor", false);
            ImageView imageView = (ImageView) s().j;
            if (z2) {
                i = R.drawable.ic_select_btn;
            }
            imageView.setImageResource(i);
        }
        ((TextView) s().z).setText(strY);
        t().setString(this, SP.PDF_SUPERVISOR, strY);
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
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_pdfreporting, (ViewGroup) null, false);
        int i4 = R.id.card_view_home_ads;
        MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.card_view_home_ads, viewInflate);
        if (materialCardView != null) {
            i4 = R.id.imageview_logo;
            RoundImageView roundImageView = (RoundImageView) pn9.a(R.id.imageview_logo, viewInflate);
            if (roundImageView != null) {
                i4 = R.id.imgCompanyName;
                ImageView imageView = (ImageView) pn9.a(R.id.imgCompanyName, viewInflate);
                if (imageView != null) {
                    i4 = R.id.imgDateTime;
                    if (((ImageView) pn9.a(R.id.imgDateTime, viewInflate)) != null) {
                        i4 = R.id.img_logo;
                        ImageView imageView2 = (ImageView) pn9.a(R.id.img_logo, viewInflate);
                        if (imageView2 != null) {
                            i4 = R.id.imgProjectName;
                            ImageView imageView3 = (ImageView) pn9.a(R.id.imgProjectName, viewInflate);
                            if (imageView3 != null) {
                                i4 = R.id.imgRemark;
                                ImageView imageView4 = (ImageView) pn9.a(R.id.imgRemark, viewInflate);
                                if (imageView4 != null) {
                                    i4 = R.id.imgReportBy;
                                    ImageView imageView5 = (ImageView) pn9.a(R.id.imgReportBy, viewInflate);
                                    if (imageView5 != null) {
                                        i4 = R.id.imgSupervisor;
                                        ImageView imageView6 = (ImageView) pn9.a(R.id.imgSupervisor, viewInflate);
                                        if (imageView6 != null) {
                                            i4 = R.id.imgTitle;
                                            ImageView imageView7 = (ImageView) pn9.a(R.id.imgTitle, viewInflate);
                                            if (imageView7 != null) {
                                                i4 = R.id.linCompanyName;
                                                LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.linCompanyName, viewInflate);
                                                if (linearLayout != null) {
                                                    i4 = R.id.linDateTime;
                                                    if (((LinearLayout) pn9.a(R.id.linDateTime, viewInflate)) != null) {
                                                        i4 = R.id.lin_logo;
                                                        LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.lin_logo, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i4 = R.id.linProjectName;
                                                            LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.linProjectName, viewInflate);
                                                            if (linearLayout3 != null) {
                                                                i4 = R.id.linRemark;
                                                                LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.linRemark, viewInflate);
                                                                if (linearLayout4 != null) {
                                                                    i4 = R.id.linReportBy;
                                                                    LinearLayout linearLayout5 = (LinearLayout) pn9.a(R.id.linReportBy, viewInflate);
                                                                    if (linearLayout5 != null) {
                                                                        i4 = R.id.linSupervisor;
                                                                        LinearLayout linearLayout6 = (LinearLayout) pn9.a(R.id.linSupervisor, viewInflate);
                                                                        if (linearLayout6 != null) {
                                                                            i4 = R.id.linTitle;
                                                                            LinearLayout linearLayout7 = (LinearLayout) pn9.a(R.id.linTitle, viewInflate);
                                                                            if (linearLayout7 != null) {
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
                                                                                                i4 = R.id.txtDateTime;
                                                                                                TextView textView2 = (TextView) pn9.a(R.id.txtDateTime, viewInflate);
                                                                                                if (textView2 != null) {
                                                                                                    i4 = R.id.txtProjectName;
                                                                                                    TextView textView3 = (TextView) pn9.a(R.id.txtProjectName, viewInflate);
                                                                                                    if (textView3 != null) {
                                                                                                        i4 = R.id.txtRemark;
                                                                                                        TextView textView4 = (TextView) pn9.a(R.id.txtRemark, viewInflate);
                                                                                                        if (textView4 != null) {
                                                                                                            i4 = R.id.txtReportBy;
                                                                                                            TextView textView5 = (TextView) pn9.a(R.id.txtReportBy, viewInflate);
                                                                                                            if (textView5 != null) {
                                                                                                                i4 = R.id.txtSupervisor;
                                                                                                                TextView textView6 = (TextView) pn9.a(R.id.txtSupervisor, viewInflate);
                                                                                                                if (textView6 != null) {
                                                                                                                    i4 = R.id.txtTitle;
                                                                                                                    TextView textView7 = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                                                                    if (textView7 != null) {
                                                                                                                        this.B = new v5(relativeLayout, materialCardView, roundImageView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, relativeLayout, frameLayout, l76VarA, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                                                                        setContentView((RelativeLayout) s().a);
                                                                                                                        ((TextView) ((l76) s().t).l).setText(getString(R.string.photo_report));
                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) s().b;
                                                                                                                        z55 z55Var = new z55(i3, this);
                                                                                                                        WeakHashMap weakHashMap = cc7.a;
                                                                                                                        ub7.c(relativeLayout2, z55Var);
                                                                                                                        final int i5 = 8;
                                                                                                                        ((RelativeLayout) ((l76) s().t).c).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i6 = i5;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i6) {
                                                                                                                                    case 0:
                                                                                                                                        int i7 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i8 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i9 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i10 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i11 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i6 = 14;
                                                                                                                        ((LinearLayout) s().m).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i7 = i6;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i7) {
                                                                                                                                    case 0:
                                                                                                                                        int i8 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i9 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i10 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i11 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        ((ImageView) s().f).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i7 = i3;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i7) {
                                                                                                                                    case 0:
                                                                                                                                        int i8 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i9 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i10 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i11 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        ((LinearLayout) s().l).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i7 = i2;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i7) {
                                                                                                                                    case 0:
                                                                                                                                        int i8 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i9 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i10 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i11 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i7 = 2;
                                                                                                                        ((ImageView) s().e).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i8 = i7;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i8) {
                                                                                                                                    case 0:
                                                                                                                                        int i9 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i10 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i11 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i8 = 3;
                                                                                                                        ((LinearLayout) s().r).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i9 = i8;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i9) {
                                                                                                                                    case 0:
                                                                                                                                        int i10 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i11 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i9 = 4;
                                                                                                                        ((ImageView) s().k).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i10 = i9;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i10) {
                                                                                                                                    case 0:
                                                                                                                                        int i11 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i10 = 5;
                                                                                                                        ((LinearLayout) s().q).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i11 = i10;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i11) {
                                                                                                                                    case 0:
                                                                                                                                        int i12 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i11 = 6;
                                                                                                                        ((ImageView) s().j).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i12 = i11;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i12) {
                                                                                                                                    case 0:
                                                                                                                                        int i13 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i115 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i12 = 7;
                                                                                                                        ((LinearLayout) s().p).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i13 = i12;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i13) {
                                                                                                                                    case 0:
                                                                                                                                        int i14 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i115 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i116 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i13 = 9;
                                                                                                                        ((ImageView) s().i).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i14 = i13;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i14) {
                                                                                                                                    case 0:
                                                                                                                                        int i15 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i115 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i116 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i117 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i14 = 10;
                                                                                                                        ((LinearLayout) s().n).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i15 = i14;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i15) {
                                                                                                                                    case 0:
                                                                                                                                        int i16 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i115 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i116 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i117 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i118 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i15 = 11;
                                                                                                                        ((ImageView) s().g).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i16 = i15;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i16) {
                                                                                                                                    case 0:
                                                                                                                                        int i17 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i115 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i116 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i117 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i118 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i119 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i16 = 12;
                                                                                                                        ((LinearLayout) s().o).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i17 = i16;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i17) {
                                                                                                                                    case 0:
                                                                                                                                        int i18 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i115 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i116 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i117 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i118 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i119 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i1110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final int i17 = 13;
                                                                                                                        ((ImageView) s().h).setOnClickListener(new View.OnClickListener(this) { // from class: y55
                                                                                                                            public final /* synthetic */ PDFSettingActivity b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i18 = i17;
                                                                                                                                PDFSettingActivity pDFSettingActivity = this.b;
                                                                                                                                switch (i18) {
                                                                                                                                    case 0:
                                                                                                                                        int i19 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_logo", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", true).f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_logo", false).f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1:
                                                                                                                                        int i110 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(2);
                                                                                                                                        break;
                                                                                                                                    case 2:
                                                                                                                                        int i111 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.u().length() == 0 || pDFSettingActivity.u().equals("-")) {
                                                                                                                                            String string2 = pDFSettingActivity.getString(R.string.enter_company_name);
                                                                                                                                            string2.getClass();
                                                                                                                                            pDFSettingActivity.I(string2);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_company_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", true).e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_company_name", false).e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 3:
                                                                                                                                        int i112 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(3);
                                                                                                                                        break;
                                                                                                                                    case 4:
                                                                                                                                        int i113 = PDFSettingActivity.Y;
                                                                                                                                        if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_title", true)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", true).k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_title", false).k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 5:
                                                                                                                                        int i114 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(4);
                                                                                                                                        break;
                                                                                                                                    case 6:
                                                                                                                                        int i115 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.y().length() == 0 || pDFSettingActivity.y().equals("-")) {
                                                                                                                                            String string3 = pDFSettingActivity.getString(R.string.enter_supervisor);
                                                                                                                                            string3.getClass();
                                                                                                                                            pDFSettingActivity.I(string3);
                                                                                                                                        } else {
                                                                                                                                            SP spT = pDFSettingActivity.t();
                                                                                                                                            String str = OTysxApt.CppofWupp;
                                                                                                                                            if (!spT.getBoolean(pDFSettingActivity, str, false)) {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, true).j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                            } else {
                                                                                                                                                ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, str, false).j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 7:
                                                                                                                                        int i116 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(5);
                                                                                                                                        break;
                                                                                                                                    case 8:
                                                                                                                                        int i117 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.E();
                                                                                                                                        break;
                                                                                                                                    case 9:
                                                                                                                                        int i118 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.x().length() == 0 || pDFSettingActivity.x().equals("-")) {
                                                                                                                                            String string4 = pDFSettingActivity.getString(R.string.enter_reportby);
                                                                                                                                            string4.getClass();
                                                                                                                                            pDFSettingActivity.I(string4);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_report_by", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", true).i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_report_by", false).i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 10:
                                                                                                                                        int i119 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(6);
                                                                                                                                        break;
                                                                                                                                    case 11:
                                                                                                                                        int i1110 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.v().length() == 0 || pDFSettingActivity.v().equals("-")) {
                                                                                                                                            String string5 = pDFSettingActivity.getString(R.string.enter_project_name);
                                                                                                                                            string5.getClass();
                                                                                                                                            pDFSettingActivity.I(string5);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_project_name", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", true).g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_project_name", false).g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 12:
                                                                                                                                        int i1111 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(7);
                                                                                                                                        break;
                                                                                                                                    case 13:
                                                                                                                                        int i20 = PDFSettingActivity.Y;
                                                                                                                                        if (pDFSettingActivity.w().length() == 0 || pDFSettingActivity.w().equals("-")) {
                                                                                                                                            String string6 = pDFSettingActivity.getString(R.string.enter_remark);
                                                                                                                                            string6.getClass();
                                                                                                                                            pDFSettingActivity.I(string6);
                                                                                                                                        } else if (!pDFSettingActivity.t().getBoolean(pDFSettingActivity, "mIS_pdf_remark", false)) {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", true).h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                                        } else {
                                                                                                                                            ((ImageView) st2.f(pDFSettingActivity, pDFSettingActivity, "mIS_pdf_remark", false).h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        int i21 = PDFSettingActivity.Y;
                                                                                                                                        pDFSettingActivity.H(1);
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        k().a(this, new n8(this, 19));
                                                                                                                        this.E.o0 = new lf3(i14, this);
                                                                                                                        this.F = t().getBoolean(this, SP.IS_PDF_LOGO, false);
                                                                                                                        this.G = t().getBoolean(this, SP.IS_PDF_COMPANY_NAME, false);
                                                                                                                        this.H = t().getBoolean(this, SP.IS_PDF_TITLE, true);
                                                                                                                        this.I = t().getBoolean(this, SP.IS_PDF_DATE_TIME, true);
                                                                                                                        this.J = t().getBoolean(this, SP.IS_PDF_SUPERVISOR, false);
                                                                                                                        this.K = t().getBoolean(this, SP.IS_PDF_REPORT_BY, false);
                                                                                                                        this.L = t().getBoolean(this, SP.IS_PDF_PROJECT_NAME, false);
                                                                                                                        this.M = t().getBoolean(this, SP.IS_PDF_REMARK, false);
                                                                                                                        String string2 = t().getString(this, SP.PDF_LOGO, Default.LOGO_uri);
                                                                                                                        string2.getClass();
                                                                                                                        this.N = string2;
                                                                                                                        String string3 = t().getString(this, SP.PDF_COMPANY_NAME, "-");
                                                                                                                        string3.getClass();
                                                                                                                        this.O = string3;
                                                                                                                        String string4 = t().getString(this, SP.PDF_TITLE, getString(R.string.work_report));
                                                                                                                        string4.getClass();
                                                                                                                        this.P = string4;
                                                                                                                        String string5 = t().getString(this, SP.PDF_DATE_TIME, "-");
                                                                                                                        string5.getClass();
                                                                                                                        this.Q = string5;
                                                                                                                        String string6 = t().getString(this, SP.PDF_SUPERVISOR, "-");
                                                                                                                        string6.getClass();
                                                                                                                        this.R = string6;
                                                                                                                        String string7 = t().getString(this, SP.PDF_REPORT_BY, "-");
                                                                                                                        string7.getClass();
                                                                                                                        this.S = string7;
                                                                                                                        String string8 = t().getString(this, SP.PDF_PROJECT_NAME, "-");
                                                                                                                        string8.getClass();
                                                                                                                        this.T = string8;
                                                                                                                        String string9 = t().getString(this, SP.PDF_REMARK, "-");
                                                                                                                        string9.getClass();
                                                                                                                        this.U = string9;
                                                                                                                        t().setBoolean(this, "mIS_pdf_logo", this.F);
                                                                                                                        t().setBoolean(this, "mIS_pdf_company_name", this.G);
                                                                                                                        t().setBoolean(this, "mIS_pdf_title", this.H);
                                                                                                                        t().setBoolean(this, "mIS_pdf_date_time", this.I);
                                                                                                                        t().setBoolean(this, "mIS_pdf_supervisor", this.J);
                                                                                                                        t().setBoolean(this, "mIS_pdf_report_by", this.K);
                                                                                                                        t().setBoolean(this, "mIS_pdf_project_name", this.L);
                                                                                                                        t().setBoolean(this, "mIS_pdf_remark", this.M);
                                                                                                                        t().setString(this, "m_pdf_logo", this.N);
                                                                                                                        t().setString(this, "m_pdf_company_name", this.O);
                                                                                                                        t().setString(this, "m_pdf_title", this.P);
                                                                                                                        t().setString(this, "m_pdf_date_time", this.Q);
                                                                                                                        t().setString(this, "m_pdf_supervisor", this.R);
                                                                                                                        t().setString(this, "m_pdf_report_by", this.S);
                                                                                                                        t().setString(this, "m_pdf_project_name", this.T);
                                                                                                                        t().setString(this, "m_pdf_remark", this.U);
                                                                                                                        if (this.F) {
                                                                                                                            ((ImageView) s().f).setImageResource(R.drawable.ic_select_btn);
                                                                                                                        } else {
                                                                                                                            ((ImageView) s().f).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                        }
                                                                                                                        if (this.G) {
                                                                                                                            ((ImageView) s().e).setImageResource(R.drawable.ic_select_btn);
                                                                                                                        } else {
                                                                                                                            ((ImageView) s().e).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                        }
                                                                                                                        if (this.H) {
                                                                                                                            ((ImageView) s().k).setImageResource(R.drawable.ic_select_btn);
                                                                                                                        } else {
                                                                                                                            ((ImageView) s().k).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                        }
                                                                                                                        if (this.J) {
                                                                                                                            ((ImageView) s().j).setImageResource(R.drawable.ic_select_btn);
                                                                                                                        } else {
                                                                                                                            ((ImageView) s().j).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                        }
                                                                                                                        if (this.K) {
                                                                                                                            ((ImageView) s().i).setImageResource(R.drawable.ic_select_btn);
                                                                                                                        } else {
                                                                                                                            ((ImageView) s().i).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                        }
                                                                                                                        if (this.L) {
                                                                                                                            ((ImageView) s().g).setImageResource(R.drawable.ic_select_btn);
                                                                                                                        } else {
                                                                                                                            ((ImageView) s().g).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                        }
                                                                                                                        if (this.M) {
                                                                                                                            ((ImageView) s().h).setImageResource(R.drawable.ic_select_btn);
                                                                                                                        } else {
                                                                                                                            ((ImageView) s().h).setImageResource(R.drawable.ic_uncheck_box_tple);
                                                                                                                        }
                                                                                                                        F();
                                                                                                                        J(false);
                                                                                                                        G();
                                                                                                                        t().getInteger(this, SP.TEMPLATE_TYPE, 0);
                                                                                                                        ((TextView) s().v).setText(HelperClass.setDateTimeFormatPDF(this, Default.DEFAULT_DATE_FORMAT));
                                                                                                                        N(false);
                                                                                                                        M(false);
                                                                                                                        K(false);
                                                                                                                        L(false);
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
        if (AllAdsApproval.isPDFSettingSmallNative(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i != 9) {
                if (i == 1) {
                    B();
                    return;
                } else {
                    if (i == 2) {
                        C();
                        return;
                    }
                    return;
                }
            }
            int i2 = RemoteAdData.PDF_SETTING_SCREEN_NATIVE_TYPE;
            if (i2 == 1) {
                B();
            } else if (i2 == 2) {
                C();
            }
        }
    }

    public final v5 s() {
        v5 v5Var = this.B;
        if (v5Var != null) {
            return v5Var;
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

    public final String u() {
        String string = t().getString(this, "m_pdf_company_name", "-");
        string.getClass();
        return string;
    }

    public final String v() {
        String string = t().getString(this, "m_pdf_project_name", "-");
        string.getClass();
        return string;
    }

    public final String w() {
        String string = t().getString(this, "m_pdf_remark", "-");
        string.getClass();
        return string;
    }

    public final String x() {
        String string = t().getString(this, "m_pdf_report_by", "-");
        string.getClass();
        return string;
    }

    public final String y() {
        String string = t().getString(this, "m_pdf_supervisor", "-");
        string.getClass();
        return string;
    }

    public final void z() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ge4(3, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}