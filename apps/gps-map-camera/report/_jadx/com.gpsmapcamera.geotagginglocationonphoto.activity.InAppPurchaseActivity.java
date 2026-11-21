package com.gpsmapcamera.geotagginglocationonphoto.activity;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.view.internal.compat.quirk.vQMJ.vlsa;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.a;
import com.facebook.login.ITY.SAqBqKHnKkFD;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.InAppPurchaseActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.BillingClientSetup;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.model.PurchaseModel;
import defpackage.ad3;
import defpackage.bj;
import defpackage.cc7;
import defpackage.ea;
import defpackage.g40;
import defpackage.gi5;
import defpackage.ki5;
import defpackage.l40;
import defpackage.la9;
import defpackage.lc;
import defpackage.lt1;
import defpackage.mg4;
import defpackage.o30;
import defpackage.pc;
import defpackage.qj;
import defpackage.ub7;
import defpackage.xc3;
import defpackage.yc3;
import defpackage.zc3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class InAppPurchaseActivity extends bj implements View.OnClickListener, ki5 {
    public static final /* synthetic */ int A0 = 0;
    public LinearLayout B;
    public LinearLayout C;
    public LinearLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public CardView H;
    public List K;
    public PurchaseHelper L;
    public boolean M;
    public ImageView N;
    public PurchaseModel O;
    public LottieAnimationView P;
    public SP Q;
    public double S;
    public RelativeLayout T;
    public TextView U;
    public TextView V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public TextView Z;
    public TextView a0;
    public TextView b0;
    public TextView c0;
    public TextView d0;
    public TextView e0;
    public TextView f0;
    public Button g0;
    public SP h0;
    public ImageView j0;
    public ImageView k0;
    public LinearLayout l0;
    public LinearLayout m0;
    public LinearLayout n0;
    public MaterialCardView p0;
    public g40 q0;
    public List r0;
    public double s0;
    public double t0;
    public String u0;
    public String v0;
    public String w0;
    public String x0;
    public final xc3 y0;
    public final Pattern z0;
    public boolean I = false;
    public final ArrayList J = new ArrayList();
    public int R = 0;
    public final ArrayList i0 = new ArrayList();
    public int o0 = 0;

    public InAppPurchaseActivity() {
        String str = vlsa.pzlmrgkaPjlNC;
        this.w0 = str;
        this.x0 = str;
        this.y0 = new xc3(this);
        this.z0 = Pattern.compile("([.,])00(?=\\D*$)");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.toolbar_back) {
            finish();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        NetworkCapabilities networkCapabilities;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.h0 = sp;
        String string = sp.getString(this, SP.APP_THEME, SAqBqKHnKkFD.HmVlJMFR);
        final int i2 = 0;
        final int i3 = 1;
        if (string.equals(Default.DARK)) {
            this.I = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.I = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.I = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_in_app_purchase);
        this.j0 = (ImageView) findViewById(R.id.ivBg);
        this.k0 = (ImageView) findViewById(R.id.ivProBanner);
        TextView textView = (TextView) findViewById(R.id.tv_inapp_price_offer);
        this.Z = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
        View viewFindViewById = findViewById(R.id.Main_lay_for_bg);
        xc3 xc3Var = new xc3(this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, xc3Var);
        String string2 = getResources().getString(R.string.PRODUCT_ID_ALL);
        ArrayList arrayList = this.i0;
        arrayList.add(string2);
        arrayList.add(getResources().getString(R.string.PRODUCT_ID_WITH_AD));
        arrayList.add(getResources().getString(R.string.PRODUCT_ID_AD));
        this.Q = new SP(this);
        this.T = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.U = (TextView) findViewById(R.id.tv_inapp_price);
        this.V = (TextView) findViewById(R.id.txt_standard);
        this.P = (LottieAnimationView) findViewById(R.id.lottie_pro_star);
        this.W = (TextView) findViewById(R.id.txt_premium);
        this.g0 = (Button) findViewById(R.id.btn_purchase);
        this.X = (TextView) findViewById(R.id.txt_title_inapp);
        this.B = (LinearLayout) findViewById(R.id.view_standard);
        this.C = (LinearLayout) findViewById(R.id.view_premium);
        this.N = (ImageView) findViewById(R.id.imag_remove_ads);
        this.E = (LinearLayout) findViewById(R.id.btn_standard);
        this.D = (LinearLayout) findViewById(R.id.btn_premium);
        this.H = (CardView) findViewById(R.id.lin_tablayout);
        this.F = (LinearLayout) findViewById(R.id.lin_stand_prem);
        this.G = (LinearLayout) findViewById(R.id.lin_remove_ads);
        this.Y = (TextView) findViewById(R.id.txt_mesg);
        this.a0 = (TextView) findViewById(R.id.tvDurationNoti);
        this.l0 = (LinearLayout) findViewById(R.id.oneyear__layout);
        this.m0 = (LinearLayout) findViewById(R.id.llSixMnth);
        this.n0 = (LinearLayout) findViewById(R.id.llSubscribeLay);
        this.p0 = (MaterialCardView) findViewById(R.id.centretext);
        this.b0 = (TextView) findViewById(R.id.txt_pricesm);
        this.c0 = (TextView) findViewById(R.id.txt_pricetw);
        this.d0 = (TextView) findViewById(R.id.txt_pricemnsm);
        this.e0 = (TextView) findViewById(R.id.txt_pricemntw);
        this.f0 = (TextView) findViewById(R.id.tv_subpolicy);
        Object systemService = getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if ((activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12)) {
            if (RemoteAdData.PURCHASE_TYPE == 1) {
                PurchaseHelper purchaseHelper = new PurchaseHelper(this, new yc3(this));
                this.L = purchaseHelper;
                if (purchaseHelper.isServiceConnected()) {
                    this.L.getPurchasedItems("inapp");
                } else {
                    this.M = true;
                }
            } else {
                g40 billingClientSetup = BillingClientSetup.getInstance(this, this);
                this.q0 = billingClientSetup;
                billingClientSetup.e(new ad3(i2, this));
            }
        }
        this.T.setOnClickListener(this);
        if (!this.Q.getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false) || this.Q.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false)) {
            t();
        } else {
            this.R = 1;
            if (this.I) {
                int i4 = RemoteAdData.IS_PRO_BANNER;
                TextView textView2 = this.Y;
                if (i4 == 0) {
                    textView2.setText(getResources().getString(R.string.pro_mes));
                    this.X.setText(getResources().getString(R.string.upgrade_gps_map_camera));
                    this.X.setTextColor(getColor(R.color.purchase_ad));
                    this.P.setAnimation(R.raw.lottie_pro_screen_ads);
                    this.P.e();
                    this.P.setRepeatMode(1);
                    this.P.animate();
                    this.X.setTextColor(getColor(R.color.purchase_ad));
                } else {
                    textView2.setVisibility(8);
                    this.X.setVisibility(8);
                    this.P.setVisibility(8);
                }
                this.H.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(0);
                this.g0.setBackground(getDrawable(R.drawable.rect_inapp_green));
                this.j0.setBackground(getDrawable(R.drawable.duv2_ic_pro_screen_ads_bg));
                this.a0.setText(getString(R.string.premium_noti));
            } else {
                int i5 = RemoteAdData.IS_PRO_BANNER;
                TextView textView3 = this.Y;
                if (i5 == 0) {
                    textView3.setText(getResources().getString(R.string.pro_mes));
                    this.X.setText(getResources().getString(R.string.upgrade_gps_map_camera));
                    this.X.setTextColor(getColor(R.color.purchase_ad));
                    this.P.setAnimation(R.raw.lottie_pro_screen_ads);
                    this.P.e();
                    this.P.setRepeatMode(1);
                    this.P.animate();
                    this.X.setTextColor(getColor(R.color.purchase_ad));
                } else {
                    textView3.setVisibility(8);
                    this.X.setVisibility(8);
                    this.P.setVisibility(8);
                }
                this.H.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(0);
                this.g0.setBackground(getDrawable(R.drawable.rect_inapp_green));
                this.j0.setBackground(getDrawable(R.drawable.duv2_ic_pro_screen_ads_bg));
                this.a0.setText(getString(R.string.premium_noti));
            }
        }
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: wc3
            public final /* synthetic */ InAppPurchaseActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i2;
                InAppPurchaseActivity inAppPurchaseActivity = this.b;
                switch (i6) {
                    case 0:
                        int i7 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.t();
                        ArrayList arrayList2 = inAppPurchaseActivity.J;
                        if (!arrayList2.isEmpty()) {
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                if (((PurchaseModel) arrayList2.get(i8)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_ALL))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList2.get(i8);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList2.get(i8)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList2.get(i8)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i9 = InAppPurchaseActivity.A0;
                        ArrayList arrayList3 = inAppPurchaseActivity.J;
                        if (inAppPurchaseActivity.I) {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        } else {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        }
                        if (!arrayList3.isEmpty()) {
                            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                if (((PurchaseModel) arrayList3.get(i10)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_WITH_AD))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList3.get(i10);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList3.get(i10)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList3.get(i10)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i11 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 0;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.p0.setVisibility(0);
                        int iDpToPx = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        if (!inAppPurchaseActivity.x0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_info_annual_text_2) + inAppPurchaseActivity.x0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_annual));
                        }
                        break;
                    default:
                        int i12 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 1;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.p0.setVisibility(8);
                        int iDpToPx2 = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        if (!inAppPurchaseActivity.w0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_half_info_1) + inAppPurchaseActivity.w0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_half));
                        }
                        break;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: wc3
            public final /* synthetic */ InAppPurchaseActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i3;
                InAppPurchaseActivity inAppPurchaseActivity = this.b;
                switch (i6) {
                    case 0:
                        int i7 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.t();
                        ArrayList arrayList2 = inAppPurchaseActivity.J;
                        if (!arrayList2.isEmpty()) {
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                if (((PurchaseModel) arrayList2.get(i8)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_ALL))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList2.get(i8);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList2.get(i8)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList2.get(i8)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i9 = InAppPurchaseActivity.A0;
                        ArrayList arrayList3 = inAppPurchaseActivity.J;
                        if (inAppPurchaseActivity.I) {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        } else {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        }
                        if (!arrayList3.isEmpty()) {
                            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                if (((PurchaseModel) arrayList3.get(i10)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_WITH_AD))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList3.get(i10);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList3.get(i10)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList3.get(i10)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i11 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 0;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.p0.setVisibility(0);
                        int iDpToPx = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        if (!inAppPurchaseActivity.x0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_info_annual_text_2) + inAppPurchaseActivity.x0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_annual));
                        }
                        break;
                    default:
                        int i12 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 1;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.p0.setVisibility(8);
                        int iDpToPx2 = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        if (!inAppPurchaseActivity.w0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_half_info_1) + inAppPurchaseActivity.w0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_half));
                        }
                        break;
                }
            }
        });
        final int i6 = 2;
        this.l0.setOnClickListener(new View.OnClickListener(this) { // from class: wc3
            public final /* synthetic */ InAppPurchaseActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                InAppPurchaseActivity inAppPurchaseActivity = this.b;
                switch (i7) {
                    case 0:
                        int i8 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.t();
                        ArrayList arrayList2 = inAppPurchaseActivity.J;
                        if (!arrayList2.isEmpty()) {
                            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                if (((PurchaseModel) arrayList2.get(i9)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_ALL))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList2.get(i9);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList2.get(i9)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList2.get(i9)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i10 = InAppPurchaseActivity.A0;
                        ArrayList arrayList3 = inAppPurchaseActivity.J;
                        if (inAppPurchaseActivity.I) {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        } else {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        }
                        if (!arrayList3.isEmpty()) {
                            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                                if (((PurchaseModel) arrayList3.get(i11)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_WITH_AD))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList3.get(i11);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList3.get(i11)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList3.get(i11)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i12 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 0;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.p0.setVisibility(0);
                        int iDpToPx = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        if (!inAppPurchaseActivity.x0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_info_annual_text_2) + inAppPurchaseActivity.x0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_annual));
                        }
                        break;
                    default:
                        int i13 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 1;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.p0.setVisibility(8);
                        int iDpToPx2 = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        if (!inAppPurchaseActivity.w0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_half_info_1) + inAppPurchaseActivity.w0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_half));
                        }
                        break;
                }
            }
        });
        final int i7 = 3;
        this.m0.setOnClickListener(new View.OnClickListener(this) { // from class: wc3
            public final /* synthetic */ InAppPurchaseActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i7;
                InAppPurchaseActivity inAppPurchaseActivity = this.b;
                switch (i8) {
                    case 0:
                        int i9 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.t();
                        ArrayList arrayList2 = inAppPurchaseActivity.J;
                        if (!arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                if (((PurchaseModel) arrayList2.get(i10)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_ALL))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList2.get(i10);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList2.get(i10)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList2.get(i10)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i11 = InAppPurchaseActivity.A0;
                        ArrayList arrayList3 = inAppPurchaseActivity.J;
                        if (inAppPurchaseActivity.I) {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        } else {
                            if (RemoteAdData.IS_PRO_BANNER == 0) {
                                inAppPurchaseActivity.P.setAnimation(R.raw.pro_screen_economical);
                                inAppPurchaseActivity.P.e();
                                inAppPurchaseActivity.P.setRepeatMode(1);
                                inAppPurchaseActivity.P.animate();
                                inAppPurchaseActivity.X.setText(inAppPurchaseActivity.getResources().getString(R.string.gps_camera_economical));
                                inAppPurchaseActivity.X.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            } else {
                                inAppPurchaseActivity.Y.setVisibility(8);
                                inAppPurchaseActivity.X.setVisibility(8);
                                inAppPurchaseActivity.P.setVisibility(8);
                            }
                            inAppPurchaseActivity.V.setTextColor(inAppPurchaseActivity.getColor(R.color.purchase_premium));
                            inAppPurchaseActivity.W.setTextColor(inAppPurchaseActivity.getColor(R.color.app_main_dark));
                            inAppPurchaseActivity.C.setVisibility(8);
                            inAppPurchaseActivity.B.setVisibility(0);
                            inAppPurchaseActivity.G.setVisibility(8);
                            inAppPurchaseActivity.F.setVisibility(0);
                            inAppPurchaseActivity.N.setImageResource(R.drawable.ic_cancel);
                            inAppPurchaseActivity.g0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.rect_inapp_skycolor));
                            inAppPurchaseActivity.j0.setBackground(inAppPurchaseActivity.getDrawable(R.drawable.duv2_ic_pro_screen_economical_bg));
                            inAppPurchaseActivity.a0.setText(inAppPurchaseActivity.getString(R.string.standard_noti));
                        }
                        if (!arrayList3.isEmpty()) {
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((PurchaseModel) arrayList3.get(i12)).getPakageid().equals(inAppPurchaseActivity.getResources().getString(R.string.PRODUCT_ID_WITH_AD))) {
                                    inAppPurchaseActivity.O = (PurchaseModel) arrayList3.get(i12);
                                    inAppPurchaseActivity.U.setText(((PurchaseModel) arrayList3.get(i12)).getPrice());
                                    if (RemoteAdData.IS_PRO_BANNER != 0 && RemoteAdData.IS_SHOW_DISCOUNT_PRICE != 0) {
                                        inAppPurchaseActivity.Z.setText(inAppPurchaseActivity.u(((PurchaseModel) arrayList3.get(i12)).getDiscountedPrice()));
                                        inAppPurchaseActivity.Z.setVisibility(0);
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int i13 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 0;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.p0.setVisibility(0);
                        int iDpToPx = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx, 0, iDpToPx, 0);
                        if (!inAppPurchaseActivity.x0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_info_annual_text_2) + inAppPurchaseActivity.x0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_annual));
                        }
                        break;
                    default:
                        int i14 = InAppPurchaseActivity.A0;
                        inAppPurchaseActivity.o0 = 1;
                        inAppPurchaseActivity.l0.setBackgroundResource(R.drawable.purchase_border_remove);
                        inAppPurchaseActivity.m0.setBackgroundResource(R.drawable.purchase_border);
                        inAppPurchaseActivity.p0.setVisibility(8);
                        int iDpToPx2 = HelperClass.dpToPx(inAppPurchaseActivity, 16);
                        inAppPurchaseActivity.m0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        inAppPurchaseActivity.l0.setPadding(iDpToPx2, 0, iDpToPx2, 0);
                        if (!inAppPurchaseActivity.w0.isEmpty()) {
                            inAppPurchaseActivity.f0.setText(inAppPurchaseActivity.getString(R.string.purchase_half_info_1) + inAppPurchaseActivity.w0 + inAppPurchaseActivity.getString(R.string.until_you_cancel_half));
                        }
                        break;
                }
            }
        });
        this.g0.setOnClickListener(new o30(4, this));
        if (RemoteAdData.IS_PRO_BANNER == 0 || RemoteAdData.PURCHASE_TEMPLATE.isEmpty()) {
            this.k0.setVisibility(8);
        } else {
            try {
                this.k0.setVisibility(0);
                a.b(this).d(this).k().H(Base64.decode(RemoteAdData.PURCHASE_TEMPLATE, 0)).E(this.k0);
            } catch (Exception unused) {
                this.k0.setVisibility(8);
            }
        }
        int i8 = RemoteAdData.PURCHASE_TYPE;
        LinearLayout linearLayout = this.n0;
        if (i8 == 1) {
            linearLayout.setVisibility(8);
            this.f0.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        int iDpToPx = HelperClass.dpToPx(this, 16);
        this.m0.setPadding(iDpToPx, 0, iDpToPx, 0);
        this.l0.setPadding(iDpToPx, 0, iDpToPx, 0);
        this.f0.setVisibility(0);
        this.H.setVisibility(8);
        findViewById(R.id.llPtype1).setVisibility(8);
        this.g0.setText(la9.e(this, R.string.subscribe));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        PurchaseHelper purchaseHelper = this.L;
        if (purchaseHelper != null) {
            purchaseHelper.endConnection();
        }
        super.onDestroy();
    }

    @Override // defpackage.ki5
    public final void onPurchasesUpdated(l40 l40Var, List list) {
        if (RemoteAdData.PURCHASE_TYPE == 2 && l40Var.a == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gi5 gi5Var = (gi5) it.next();
                if (((String) gi5Var.c().get(0)).equals(getResources().getString(R.string.PRODUCT_ID_6_MONTHS)) || (((String) gi5Var.c().get(0)).equals(getResources().getString(R.string.PRODUCT_ID_12_MONTHS)) && gi5Var.a() == 1)) {
                    if (gi5Var.c.optBoolean("acknowledged", true)) {
                        v(3, true);
                        mg4.s("Paid");
                    } else {
                        String strB = gi5Var.b();
                        if (strB == null) {
                            qj.h("Purchase token must be set");
                            return;
                        } else {
                            ea eaVar = new ea(4);
                            eaVar.b = strB;
                            this.q0.a(eaVar, this.y0);
                        }
                    }
                } else if (!((String) gi5Var.c().get(0)).equals(getResources().getString(R.string.PRODUCT_ID_6_MONTHS)) && (!((String) gi5Var.c().get(0)).equals(getResources().getString(R.string.PRODUCT_ID_12_MONTHS)) || gi5Var.a() != 2)) {
                    if (((String) gi5Var.c().get(0)).equals(getResources().getString(R.string.PRODUCT_ID_6_MONTHS)) || (((String) gi5Var.c().get(0)).equals(getResources().getString(R.string.PRODUCT_ID_12_MONTHS)) && gi5Var.a() == 0)) {
                        v(3, false);
                        mg4.s("Free");
                    }
                }
            }
            s();
        }
    }

    public final void s() {
        try {
            if (isFinishing()) {
                return;
            }
            pc pcVar = new pc(this);
            lc lcVar = pcVar.a;
            pcVar.setTitle(getResources().getString(R.string.congratulations));
            lcVar.f = getResources().getString(R.string.restart_msg);
            pcVar.d(getResources().getString(R.string.ok), new zc3(this, 0));
            lcVar.m = false;
            pcVar.create().show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void t() {
        if (this.I) {
            if (RemoteAdData.IS_PRO_BANNER == 0) {
                this.P.setAnimation(R.raw.pro_screen_premium);
                this.P.e();
                this.P.setRepeatMode(1);
                this.P.animate();
                this.X.setText(getResources().getString(R.string.gps_camera_premium));
                this.X.setTextColor(getColor(R.color.app_main_dark));
            } else {
                this.Y.setVisibility(8);
                this.X.setVisibility(8);
                this.P.setVisibility(8);
            }
            this.V.setTextColor(getColor(R.color.purchase_premium));
            this.W.setTextColor(getColor(R.color.app_main_dark));
            this.C.setVisibility(0);
            this.B.setVisibility(8);
            this.G.setVisibility(8);
            this.F.setVisibility(0);
            this.N.setImageResource(R.drawable.duv2_ic_done);
            this.g0.setBackground(getDrawable(R.drawable.rect_inapp));
            this.j0.setBackground(getDrawable(R.drawable.duv2_ic_pro_screen_premium_bg));
            this.a0.setText(getString(R.string.premium_noti));
            return;
        }
        if (RemoteAdData.IS_PRO_BANNER == 0) {
            this.P.setAnimation(R.raw.pro_screen_premium);
            this.P.e();
            this.P.setRepeatMode(1);
            this.P.animate();
            this.X.setText(getResources().getString(R.string.gps_camera_premium));
            this.X.setTextColor(getColor(R.color.app_main_dark));
        } else {
            this.Y.setVisibility(8);
            this.X.setVisibility(8);
            this.P.setVisibility(8);
        }
        this.V.setTextColor(getColor(R.color.purchase_premium));
        this.W.setTextColor(getColor(R.color.app_main_dark));
        this.C.setVisibility(0);
        this.B.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(0);
        this.N.setImageResource(R.drawable.duv2_ic_done);
        this.g0.setBackground(getDrawable(R.drawable.rect_inapp));
        this.j0.setBackground(getDrawable(R.drawable.duv2_ic_pro_screen_premium_bg));
        this.a0.setText(getString(R.string.premium_noti));
    }

    public final String u(String str) {
        if (str == null) {
            return null;
        }
        return this.z0.matcher(str).replaceAll("");
    }

    public final void v(int i, boolean z) {
        if (i == 0) {
            if (this.Q.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false)) {
                return;
            }
            this.Q.setBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, z);
        } else {
            if (i == 1) {
                this.Q.setBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, z);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.Q.setBoolean(this, HelperClass.IS_SUBSCRIBE, z);
            } else {
                if (this.Q.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false)) {
                    return;
                }
                this.Q.setBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, z);
            }
        }
    }
}