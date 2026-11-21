package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.a7;
import defpackage.an;
import defpackage.bj;
import defpackage.c6;
import defpackage.c66;
import defpackage.cc7;
import defpackage.cp9;
import defpackage.fl0;
import defpackage.hv0;
import defpackage.i6;
import defpackage.iw3;
import defpackage.j64;
import defpackage.j85;
import defpackage.l85;
import defpackage.la9;
import defpackage.lf3;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mv1;
import defpackage.n8;
import defpackage.q6;
import defpackage.qc;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.v30;
import defpackage.w49;
import defpackage.ws3;
import defpackage.x7;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Permission_Activity extends bj {
    public static final /* synthetic */ int R = 0;
    public CardView B;
    public CardView C;
    public qc D;
    public SP E;
    public ImageView F;
    public ImageView G;
    public ImageView H;
    public ImageView I;
    public MaterialCardView J;
    public FrameLayout K;
    public TextView L;
    public TextView M;
    public boolean N = false;
    public Handler O = new Handler(Looper.getMainLooper());
    public i6 P;
    public mo1 Q;

    public static void z(l12 l12Var, NativeAdView nativeAdView) {
        tv5 tv5Var = l12Var.m;
        String str = l12Var.g;
        String str2 = l12Var.f;
        String str3 = l12Var.d;
        if (nativeAdView != null) {
            nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.appinstall_headline));
            nativeAdView.setBodyView(nativeAdView.findViewById(R.id.appinstall_body));
            nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.appinstall_call_to_action));
            nativeAdView.setIconView(nativeAdView.findViewById(R.id.appinstall_app_icon));
            nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.appinstall_advertiser));
            if (str3 != null) {
                try {
                    ((TextView) nativeAdView.getHeadlineView()).setText(str3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (str2 != null) {
                try {
                    ((TextView) nativeAdView.getBodyView()).setText(str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (str != null) {
                try {
                    ((Button) nativeAdView.getCallToActionView()).setText(str);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            try {
                if (((Drawable) tv5Var.b) != null) {
                    ((ImageView) nativeAdView.getIconView()).setImageDrawable((Drawable) tv5Var.b);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            nativeAdView.b(l12Var, (MediaView) nativeAdView.findViewById(R.id.appinstall_media));
        }
    }

    public final void A() {
        int i = Build.VERSION.SDK_INT;
        CardView cardView = this.B;
        if (i < 30) {
            cardView.setVisibility(0);
        } else {
            cardView.setVisibility(8);
        }
        boolean z = la9.a(this, "android.permission.CAMERA") == 0;
        ImageView imageView = this.F;
        if (z) {
            imageView.setImageResource(R.drawable.ic_permission_allowed);
        } else {
            imageView.setImageResource(R.drawable.ic_permission_needed);
        }
        boolean zT = t();
        ImageView imageView2 = this.G;
        if (zT) {
            imageView2.setImageResource(R.drawable.ic_permission_allowed);
        } else {
            imageView2.setImageResource(R.drawable.ic_permission_needed);
        }
        boolean zS = s();
        ImageView imageView3 = this.H;
        if (zS) {
            imageView3.setImageResource(R.drawable.ic_permission_allowed);
        } else {
            imageView3.setImageResource(R.drawable.ic_permission_needed);
        }
        if (la9.a(this, "android.permission.CAMERA") == 0 && s() && t()) {
            this.E.setBoolean(this, SP.ALL_PERMISSION_ACCESS, true);
            this.L.setVisibility(0);
            this.M.setText(getString(R.string.open_camera));
            this.I.setVisibility(0);
        } else {
            this.L.setVisibility(0);
            this.M.setText(getString(R.string.allow_permissions));
            this.I.setVisibility(8);
        }
        CardView cardView2 = this.B;
        CardView cardView3 = (cardView2 == null || cardView2.getVisibility() != 0) ? this.C : this.B;
        if (cardView3 == null) {
            return;
        }
        cardView3.post(new iw3(13, this, cardView3));
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2 = 1;
        this.P = (i6) n(new j85(this), new c6(i2));
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.E = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        int i3 = 0;
        if (string.equals(Default.DARK)) {
            this.N = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.N = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.N = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        cp9.b(getWindow(), false);
        setContentView(R.layout.activity_permission);
        View viewFindViewById = findViewById(R.id.mainlay);
        j85 j85Var = new j85(this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, j85Var);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.mainlay);
        ImageView imageView = (ImageView) findViewById(R.id.bgDevice);
        if (this.N) {
            relativeLayout.setBackgroundResource(2131232385);
            imageView.setImageResource(R.drawable.ic_permission_bg_dark);
        } else {
            imageView.setImageResource(R.drawable.ic_permission_bg);
        }
        imageView.addOnLayoutChangeListener(new fl0(2, imageView));
        this.B = (CardView) findViewById(R.id.cardView_storage_permission);
        this.C = (CardView) findViewById(R.id.cardView_location_permission);
        this.F = (ImageView) findViewById(R.id.ivCamPerAccessInfo);
        this.G = (ImageView) findViewById(R.id.ivStoragePerAccessInfo);
        this.H = (ImageView) findViewById(R.id.ivLocPerAccessInfo);
        this.J = (MaterialCardView) findViewById(R.id.card_view_home_ads);
        this.K = (FrameLayout) findViewById(R.id.nativeadframe);
        this.L = (TextView) findViewById(R.id.privacy_policy_text);
        this.M = (TextView) findViewById(R.id.tvButtonText);
        this.I = (ImageView) findViewById(R.id.ivArrow);
        String string2 = getString(R.string.termtext);
        SpannableString spannableString = new SpannableString(string2);
        String string3 = getString(R.string.terms_of_service);
        int iIndexOf = string2.indexOf(string3);
        String string4 = getString(R.string.privacy_policy);
        int iIndexOf2 = string2.indexOf(string4);
        int color = Color.parseColor("#0A66EA");
        if (iIndexOf >= 0) {
            spannableString.setSpan(new l85(this, color, i3), iIndexOf, string3.length() + iIndexOf, 33);
        }
        if (iIndexOf2 >= 0) {
            spannableString.setSpan(new l85(this, color, i2), iIndexOf2, string4.length() + iIndexOf2, 33);
        }
        this.L.setText(spannableString);
        this.L.setMovementMethod(LinkMovementMethod.getInstance());
        ((RelativeLayout) findViewById(R.id.btnSave)).setOnClickListener(new x7(14, this));
        if (AllAdsApproval.iSPermissionBanner(this)) {
            int i4 = RemoteAdData.ADS_NETWORK_TYPE;
            if (i4 == 9) {
                int i5 = RemoteAdData.PERMISSION_SCREEN_BANNER_TYPE;
                if (i5 == 1) {
                    x();
                } else if (i5 == 2) {
                    y();
                }
            } else if (i4 == 1) {
                x();
            } else if (i4 == 2) {
                y();
            }
        }
        k().a(this, new n8(this, 20));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_permission_cards);
        if (linearLayout != null) {
            linearLayout.addOnLayoutChangeListener(new fl0(3, this));
        }
        A();
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        qc qcVar = this.D;
        if (qcVar != null && qcVar.isShowing()) {
            this.D.dismiss();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        super.onPause();
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        an.c = false;
        A();
    }

    public final boolean s() {
        boolean z = la9.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
        if (la9.a(this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return false;
        }
        return z;
    }

    public final boolean t() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 || i > 29) {
            return true;
        }
        boolean z = la9.a(this, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        if (la9.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return z;
    }

    public final void u() {
        startActivity(new Intent(this, (Class<?>) CameraActivity.class));
        finish();
    }

    public final void v() {
        try {
            String str = RemoteAdData.IN_APP_FEATURE_SCREEN_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new lf3(11, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void w() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new j64(6, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void x() {
        List listAsList = Arrays.asList(lm4.a);
        String str = RemoteAdData.PERMISSION_SCREEN_NATIVE_ID;
        str.getClass();
        listAsList.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listAsList);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new ws3(10, this));
    }

    public final void y() {
        List listAsList = Arrays.asList(lm4.a);
        String str = RemoteAdData.ADAX_NATIVE_ID;
        str.getClass();
        listAsList.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listAsList);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 6));
    }
}