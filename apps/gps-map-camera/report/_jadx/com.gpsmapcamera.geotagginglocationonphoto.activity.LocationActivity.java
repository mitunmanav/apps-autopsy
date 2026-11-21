package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.Hueb.CvmpVJvatR;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.AddLocationActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.LocationActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.UserGuide_Answer_Activity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.LocationSupplier;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SafeNestedScrollView;
import com.gpsmapcamera.geotagginglocationonphoto.helper.utils;
import com.gpsmapcamera.geotagginglocationonphoto.model.LoctionModel;
import com.itextpdf.text.pdf.ColumnText;
import defpackage.a7;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c6;
import defpackage.c66;
import defpackage.cc7;
import defpackage.d68;
import defpackage.do9;
import defpackage.e8;
import defpackage.et3;
import defpackage.f8;
import defpackage.fo4;
import defpackage.fp8;
import defpackage.gc1;
import defpackage.gf1;
import defpackage.hv0;
import defpackage.i46;
import defpackage.i6;
import defpackage.iv0;
import defpackage.ix3;
import defpackage.kf8;
import defpackage.kx3;
import defpackage.ky3;
import defpackage.la9;
import defpackage.lm4;
import defpackage.ln5;
import defpackage.lt1;
import defpackage.ly3;
import defpackage.m5;
import defpackage.mm4;
import defpackage.mq7;
import defpackage.mv1;
import defpackage.n8;
import defpackage.nk;
import defpackage.p64;
import defpackage.pn9;
import defpackage.q6;
import defpackage.r64;
import defpackage.s78;
import defpackage.sp3;
import defpackage.t64;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.uz0;
import defpackage.v30;
import defpackage.v60;
import defpackage.v68;
import defpackage.w49;
import defpackage.ws3;
import defpackage.xx4;
import defpackage.zn4;
import defpackage.zy3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class LocationActivity extends bj implements xx4 {
    public static final /* synthetic */ int i0 = 0;
    public m5 B;
    public SP F;
    public s78 G;
    public fp8 H;
    public double I;
    public double J;
    public gc1 O;
    public zy3 P;
    public zy3 Q;
    public v68 U;
    public LocationRequest V;
    public ly3 W;
    public ln5 X;
    public ln5 Y;
    public ln5 Z;
    public Location a0;
    public HelperClass b0;
    public LocationSupplier c0;
    public boolean d0;
    public i6 e0;
    public mo1 f0;
    public final Handler g0;
    public r64 h0;
    public final int C = 100;
    public final long D = 1000;
    public final long E = 2000;
    public String K = "";
    public String L = "";
    public String M = "";
    public String N = "";
    public ArrayList R = new ArrayList();
    public final ArrayList S = new ArrayList();
    public final ArrayList T = new ArrayList();

    public LocationActivity() {
        new Admob();
        this.g0 = new Handler(Looper.getMainLooper());
    }

    public static void B(l12 l12Var, NativeAdView nativeAdView) {
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

    public static void C(RecyclerView recyclerView) {
        View viewFindViewById;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && (viewFindViewById = childAt.findViewById(R.id.rowFG)) != null) {
                viewFindViewById.animate().cancel();
                viewFindViewById.setTranslationX(ColumnText.GLOBAL_SPACE_CHAR_RATIO);
                viewFindViewById.setAlpha(1.0f);
            }
        }
    }

    public static boolean w(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (recyclerView.getVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        recyclerView.getGlobalVisibleRect(rect);
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public final void A() {
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 2));
    }

    public final void D(LatLng latLng) {
        s78 s78Var = this.G;
        if (s78Var != null) {
            try {
                s78Var.u(do9.a(latLng));
                s78 s78Var2 = this.G;
                s78Var2.getClass();
                s78Var2.e(do9.b(latLng, 14.0f));
                boolean zIsTablet = HelperClass.isTablet(this);
                s78 s78Var3 = this.G;
                if (zIsTablet) {
                    s78Var3.getClass();
                    t64 t64Var = new t64();
                    t64Var.d = latLng;
                    t64Var.l = true;
                    t64Var.j = false;
                    t64Var.h = 0.5f;
                    t64Var.i = 0.5f;
                    HelperClass helperClass = this.b0;
                    helperClass.getClass();
                    t64Var.g = helperClass.BitmapFromVector(this, R.drawable.google_map_pin, 20, 35);
                    s78Var3.d(t64Var);
                } else {
                    s78Var3.getClass();
                    t64 t64Var2 = new t64();
                    t64Var2.d = latLng;
                    t64Var2.l = true;
                    t64Var2.j = false;
                    t64Var2.h = 0.5f;
                    t64Var2.i = 0.5f;
                    HelperClass helperClass2 = this.b0;
                    helperClass2.getClass();
                    t64Var2.g = helperClass2.BitmapFromVector(this, R.drawable.google_map_pin, 35, 60);
                    s78Var3.d(t64Var2);
                }
                s78 s78Var4 = this.G;
                s78Var4.getClass();
                s78Var4.z(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void E(int i) {
        SP sp = this.F;
        if (i == (sp != null ? sp.getInteger(this, SP.SELECTED_LOCATION, -1) : -1)) {
            return;
        }
        gc1 gc1Var = this.O;
        ArrayList arrayListH = gc1Var != null ? gc1Var.H(i) : new ArrayList();
        String title = !arrayListH.isEmpty() ? ((LoctionModel) arrayListH.get(0)).getTitle() : "Location";
        v60 v60Var = new v60(this, R.style.AppBottomSheetDialogTheme);
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_delete_location_confirm, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_delete_msg);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewInflate.findViewById(R.id.cardCancel);
        viewFindViewById2.getClass();
        MaterialCardView materialCardView = (MaterialCardView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.btnCancel);
        viewFindViewById3.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.btnDelete);
        viewFindViewById4.getClass();
        AppCompatButton appCompatButton2 = (AppCompatButton) viewFindViewById4;
        String string = getString(R.string.delete_location_confirm_msg, title);
        string.getClass();
        ((TextView) viewFindViewById).setText(Html.fromHtml(string, 0));
        if (this.d0) {
            materialCardView.setCardBackgroundColor(getColor(R.color.custom_date_bg_dark));
            appCompatButton.setTextColor(getColor(R.color.app_text_main_dark));
        } else {
            materialCardView.setCardBackgroundColor(getColor(R.color.custom_date_bg_light));
            appCompatButton.setTextColor(getColor(R.color.app_text_main_light));
        }
        appCompatButton.setOnClickListener(new e8(v60Var, 5));
        appCompatButton2.setOnClickListener(new f8(this, i, v60Var, 2));
        v60Var.show();
    }

    public final void F() {
        ArrayList arrayList = this.S;
        if (arrayList.isEmpty()) {
            t().c.setVisibility(8);
            ((RecyclerView) t().p).setVisibility(8);
            return;
        }
        ((RecyclerView) t().p).setVisibility(0);
        ((RecyclerView) t().p).setNestedScrollingEnabled(false);
        t().c.setVisibility(0);
        t().g.setVisibility(8);
        zy3 zy3Var = this.P;
        if (zy3Var != null) {
            zy3Var.o(arrayList);
            H();
            return;
        }
        fo4 fo4Var = new fo4(28, this);
        zy3 zy3Var2 = new zy3();
        new ArrayList();
        zy3Var2.g = 0;
        zy3Var2.h = -1;
        zy3Var2.c = this;
        zy3Var2.d = arrayList;
        zy3Var2.f = fo4Var;
        SP sp = new SP(this);
        zy3Var2.e = sp;
        zy3Var2.i = new int[zy3Var2.d.size()];
        zy3Var2.g = 0;
        zy3Var2.h = sp.getInteger(this, SP.SELECTED_LOCATION, -1);
        this.P = zy3Var2;
        ((RecyclerView) t().p).setLayoutManager(new LinearLayoutManager(this));
        ((RecyclerView) t().p).setItemAnimator(new gf1());
        ((RecyclerView) t().p).setAdapter(this.P);
        ln5 ln5Var = new ln5(this, (RecyclerView) t().p);
        this.Y = ln5Var;
        int i = 13;
        i46 i46Var = new i46(i);
        ln5Var.Q = true;
        ln5Var.M = i46Var;
        sp3 sp3Var = new sp3(i);
        ln5Var.R = true;
        ln5Var.N = sp3Var;
        ln5Var.l(Integer.valueOf(R.id.edit_layout), Integer.valueOf(R.id.delete_layout));
        ln5Var.m(new kx3(this, 3));
        ln5Var.k(new kx3(this, 4));
        RecyclerView recyclerView = (RecyclerView) t().p;
        ln5 ln5Var2 = this.Y;
        ln5Var2.getClass();
        recyclerView.i(ln5Var2);
        H();
    }

    public final void G() {
        ArrayList arrayList = this.T;
        if (arrayList.isEmpty()) {
            ((RecyclerView) t().q).setVisibility(8);
            t().e.setVisibility(8);
            return;
        }
        int i = 0;
        ((RecyclerView) t().q).setVisibility(0);
        ((RecyclerView) t().q).setNestedScrollingEnabled(false);
        t().e.setVisibility(0);
        zy3 zy3Var = this.Q;
        if (zy3Var != null) {
            zy3Var.o(arrayList);
            H();
            return;
        }
        zy3 zy3Var2 = new zy3();
        new ArrayList();
        zy3Var2.g = 0;
        zy3Var2.h = -1;
        zy3Var2.c = this;
        zy3Var2.d = arrayList;
        SP sp = new SP(this);
        zy3Var2.e = sp;
        zy3Var2.i = new int[zy3Var2.d.size()];
        zy3Var2.g = 1;
        zy3Var2.h = sp.getInteger(this, SP.SELECTED_LOCATION, -1);
        this.Q = zy3Var2;
        ((RecyclerView) t().q).setLayoutManager(new LinearLayoutManager(this));
        ((RecyclerView) t().q).setItemAnimator(new gf1());
        ((RecyclerView) t().q).setAdapter(this.Q);
        ln5 ln5Var = new ln5(this, (RecyclerView) t().q);
        this.X = ln5Var;
        int i2 = 13;
        c66 c66Var = new c66(i2);
        ln5Var.Q = true;
        ln5Var.M = c66Var;
        sp3 sp3Var = new sp3(i2);
        ln5Var.R = true;
        ln5Var.N = sp3Var;
        ln5Var.l(Integer.valueOf(R.id.edit_layout), Integer.valueOf(R.id.delete_layout));
        ln5Var.m(new kx3(this, i));
        ln5Var.k(new kx3(this, 1));
        RecyclerView recyclerView = (RecyclerView) t().q;
        ln5 ln5Var2 = this.X;
        ln5Var2.getClass();
        recyclerView.i(ln5Var2);
        H();
    }

    public final void H() {
        SP sp = this.F;
        int integer = sp != null ? sp.getInteger(this, SP.SELECTED_LOCATION, -1) : -1;
        if (this.Y != null) {
            ArrayList arrayList = new ArrayList();
            if (integer != -1) {
                ArrayList arrayList2 = this.S;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (((LoctionModel) arrayList2.get(i)).getId() == integer) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
            ln5 ln5Var = this.Y;
            ln5Var.getClass();
            ln5Var.d = new ArrayList(arrayList);
        }
        if (this.X != null) {
            ArrayList arrayList3 = new ArrayList();
            if (integer != -1) {
                ArrayList arrayList4 = this.T;
                int size2 = arrayList4.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((LoctionModel) arrayList4.get(i2)).getId() == integer) {
                        arrayList3.add(Integer.valueOf(i2));
                    }
                }
            }
            ln5 ln5Var2 = this.X;
            ln5Var2.getClass();
            ln5Var2.d = new ArrayList(arrayList3);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ln5 ln5Var;
        ln5 ln5Var2;
        if (motionEvent != null) {
            if (motionEvent.getActionMasked() == 0) {
                ln5 ln5Var3 = this.Y;
                if (ln5Var3 != null && ln5Var3.z && w((RecyclerView) t().q, motionEvent) && (ln5Var2 = this.Y) != null) {
                    ln5Var2.e(true);
                }
                ln5 ln5Var4 = this.X;
                if (ln5Var4 != null && ln5Var4.z && w((RecyclerView) t().p, motionEvent) && (ln5Var = this.X) != null) {
                    ln5Var.e(true);
                }
            }
            ln5 ln5Var5 = this.X;
            if (ln5Var5 != null) {
                ln5Var5.h(motionEvent);
            }
            ln5 ln5Var6 = this.Y;
            if (ln5Var6 != null) {
                ln5Var6.h(motionEvent);
            }
            ln5 ln5Var7 = this.Z;
            if (ln5Var7 != null) {
                ln5Var7.h(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.xx4
    public final void g(s78 s78Var) {
        try {
            this.G = s78Var;
            s78Var.r().e();
            if (((MapView) t().m).getViewTreeObserver().isAlive()) {
                ((MapView) t().m).getViewTreeObserver().addOnGlobalLayoutListener(new nk(3, this));
            }
            D(new LatLng(this.I, this.J));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        HelperClass helperClass = new HelperClass();
        this.b0 = helperClass;
        helperClass.SetLanguage(this);
        SP sp = new SP(this);
        this.F = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 1;
        final int i3 = 0;
        if (bi3.b(string, Default.DARK)) {
            this.d0 = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.d0 = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.d0 = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_location, (ViewGroup) null, false);
        int i4 = R.id.card_view_home_ads;
        MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.card_view_home_ads, viewInflate);
        if (materialCardView != null) {
            i4 = R.id.img_add_address;
            ImageView imageView = (ImageView) pn9.a(R.id.img_add_address, viewInflate);
            if (imageView != null) {
                i4 = R.id.ivApplyStatus;
                ImageView imageView2 = (ImageView) pn9.a(R.id.ivApplyStatus, viewInflate);
                if (imageView2 != null) {
                    i4 = R.id.llInRange;
                    LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.llInRange, viewInflate);
                    if (linearLayout != null) {
                        i4 = R.id.ll_liveLocation;
                        RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.ll_liveLocation, viewInflate);
                        if (relativeLayout != null) {
                            i4 = R.id.llOutRange;
                            LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.llOutRange, viewInflate);
                            if (linearLayout2 != null) {
                                RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                i4 = R.id.map;
                                MapView mapView = (MapView) pn9.a(R.id.map, viewInflate);
                                if (mapView != null) {
                                    i4 = R.id.map_card;
                                    if (((CardView) pn9.a(R.id.map_card, viewInflate)) != null) {
                                        i4 = R.id.nativeadframe;
                                        FrameLayout frameLayout = (FrameLayout) pn9.a(R.id.nativeadframe, viewInflate);
                                        if (frameLayout != null) {
                                            i4 = R.id.nestedScrollView;
                                            SafeNestedScrollView safeNestedScrollView = (SafeNestedScrollView) pn9.a(R.id.nestedScrollView, viewInflate);
                                            if (safeNestedScrollView != null) {
                                                i4 = R.id.rlInRangeLocations;
                                                if (((RelativeLayout) pn9.a(R.id.rlInRangeLocations, viewInflate)) != null) {
                                                    i4 = R.id.rv_detectedLocations;
                                                    RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.rv_detectedLocations, viewInflate);
                                                    if (recyclerView != null) {
                                                        i4 = R.id.rv_otherLocations;
                                                        RecyclerView recyclerView2 = (RecyclerView) pn9.a(R.id.rv_otherLocations, viewInflate);
                                                        if (recyclerView2 != null) {
                                                            i4 = R.id.seperator;
                                                            View viewA = pn9.a(R.id.seperator, viewInflate);
                                                            if (viewA != null) {
                                                                i4 = R.id.toolbar;
                                                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                                if (viewA2 != null) {
                                                                    uz0 uz0VarC = uz0.c(viewA2);
                                                                    i4 = R.id.tvEmptyText;
                                                                    TextView textView = (TextView) pn9.a(R.id.tvEmptyText, viewInflate);
                                                                    if (textView != null) {
                                                                        i4 = R.id.tvEmptyTextManual;
                                                                        TextView textView2 = (TextView) pn9.a(R.id.tvEmptyTextManual, viewInflate);
                                                                        if (textView2 != null) {
                                                                            i4 = R.id.tvMainLocation;
                                                                            if (((TextView) pn9.a(R.id.tvMainLocation, viewInflate)) != null) {
                                                                                i4 = R.id.txt_address;
                                                                                TextView textView3 = (TextView) pn9.a(R.id.txt_address, viewInflate);
                                                                                if (textView3 != null) {
                                                                                    i4 = R.id.txt_latlog;
                                                                                    TextView textView4 = (TextView) pn9.a(R.id.txt_latlog, viewInflate);
                                                                                    if (textView4 != null) {
                                                                                        i4 = R.id.txt_shortAddress;
                                                                                        TextView textView5 = (TextView) pn9.a(R.id.txt_shortAddress, viewInflate);
                                                                                        if (textView5 != null) {
                                                                                            this.B = new m5(relativeLayout2, materialCardView, imageView, imageView2, linearLayout, relativeLayout, linearLayout2, relativeLayout2, mapView, frameLayout, safeNestedScrollView, recyclerView, recyclerView2, viewA, uz0VarC, textView, textView2, textView3, textView4, textView5);
                                                                                            setContentView(t().b);
                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) t().l;
                                                                                            kx3 kx3Var = new kx3(this, 7);
                                                                                            WeakHashMap weakHashMap = cc7.a;
                                                                                            ub7.c(relativeLayout3, kx3Var);
                                                                                            this.O = new gc1(this);
                                                                                            v();
                                                                                            k().a(this, new n8(this, 15));
                                                                                            CPD.ShowDialog(this);
                                                                                            ((TextView) ((uz0) t().s).i).setText(getString(R.string.map_data));
                                                                                            ((RelativeLayout) ((uz0) t().s).f).setVisibility(0);
                                                                                            final int i5 = 3;
                                                                                            ((ImageView) t().j).setOnClickListener(new View.OnClickListener(this) { // from class: hx3
                                                                                                public final /* synthetic */ LocationActivity b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i6 = i5;
                                                                                                    final int i7 = 1;
                                                                                                    final LocationActivity locationActivity = this.b;
                                                                                                    final int i8 = 0;
                                                                                                    switch (i6) {
                                                                                                        case 0:
                                                                                                            int i9 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            Default.mSelectedLanguage = "";
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            int i10 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            try {
                                                                                                                locationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=488jwww9nd8&ab_channel=GPSMapCamera")));
                                                                                                            } catch (Exception e) {
                                                                                                                e.printStackTrace();
                                                                                                                return;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            int i11 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            bv0 bv0VarV = bv0.v(locationActivity.getLayoutInflater());
                                                                                                            ((TextView) bv0VarV.f).setText(locationActivity.getString(R.string.import_locations));
                                                                                                            ((TextView) bv0VarV.e).setText(locationActivity.getString(R.string.export_locations));
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) bv0VarV.b;
                                                                                                            relativeLayout4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                            int measuredHeight = relativeLayout4.getMeasuredHeight();
                                                                                                            int measuredWidth = relativeLayout4.getMeasuredWidth();
                                                                                                            final PopupWindow popupWindow = new PopupWindow((View) relativeLayout4, measuredWidth, measuredHeight, true);
                                                                                                            popupWindow.setOutsideTouchable(true);
                                                                                                            popupWindow.setFocusable(true);
                                                                                                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                                                                                            popupWindow.setElevation(16.0f);
                                                                                                            ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i12 = i8;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i12) {
                                                                                                                        case 0:
                                                                                                                            int i13 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i14 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i12 = i7;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i12) {
                                                                                                                        case 0:
                                                                                                                            int i13 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i14 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            if (view != null) {
                                                                                                                popupWindow.showAsDropDown(view, -(measuredWidth - view.getWidth()), 0);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            int i12 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) AddLocationActivity.class));
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            int i13 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.u();
                                                                                                            break;
                                                                                                        default:
                                                                                                            int i14 = LocationActivity.i0;
                                                                                                            locationActivity.s(true);
                                                                                                            SP sp2 = locationActivity.F;
                                                                                                            sp2.getClass();
                                                                                                            if (sp2.getInteger(locationActivity, SP.SELECTED_LOCATION, -1) != -1) {
                                                                                                                ((ImageView) locationActivity.t().k).setVisibility(0);
                                                                                                                SP sp3 = locationActivity.F;
                                                                                                                sp3.getClass();
                                                                                                                sp3.setInteger(locationActivity, SP.SELECTED_LOCATION, -1);
                                                                                                                locationActivity.F();
                                                                                                                locationActivity.G();
                                                                                                                locationActivity.H();
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            final int i6 = 4;
                                                                                            ((RelativeLayout) ((uz0) t().s).c).setOnClickListener(new View.OnClickListener(this) { // from class: hx3
                                                                                                public final /* synthetic */ LocationActivity b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i7 = i6;
                                                                                                    final int i8 = 1;
                                                                                                    final LocationActivity locationActivity = this.b;
                                                                                                    final int i9 = 0;
                                                                                                    switch (i7) {
                                                                                                        case 0:
                                                                                                            int i10 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            Default.mSelectedLanguage = "";
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            int i11 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            try {
                                                                                                                locationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=488jwww9nd8&ab_channel=GPSMapCamera")));
                                                                                                            } catch (Exception e) {
                                                                                                                e.printStackTrace();
                                                                                                                return;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            int i12 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            bv0 bv0VarV = bv0.v(locationActivity.getLayoutInflater());
                                                                                                            ((TextView) bv0VarV.f).setText(locationActivity.getString(R.string.import_locations));
                                                                                                            ((TextView) bv0VarV.e).setText(locationActivity.getString(R.string.export_locations));
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) bv0VarV.b;
                                                                                                            relativeLayout4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                            int measuredHeight = relativeLayout4.getMeasuredHeight();
                                                                                                            int measuredWidth = relativeLayout4.getMeasuredWidth();
                                                                                                            final PopupWindow popupWindow = new PopupWindow((View) relativeLayout4, measuredWidth, measuredHeight, true);
                                                                                                            popupWindow.setOutsideTouchable(true);
                                                                                                            popupWindow.setFocusable(true);
                                                                                                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                                                                                            popupWindow.setElevation(16.0f);
                                                                                                            ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i13 = i9;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i13) {
                                                                                                                        case 0:
                                                                                                                            int i14 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i13 = i8;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i13) {
                                                                                                                        case 0:
                                                                                                                            int i14 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            if (view != null) {
                                                                                                                popupWindow.showAsDropDown(view, -(measuredWidth - view.getWidth()), 0);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            int i13 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) AddLocationActivity.class));
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            int i14 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.u();
                                                                                                            break;
                                                                                                        default:
                                                                                                            int i15 = LocationActivity.i0;
                                                                                                            locationActivity.s(true);
                                                                                                            SP sp2 = locationActivity.F;
                                                                                                            sp2.getClass();
                                                                                                            if (sp2.getInteger(locationActivity, SP.SELECTED_LOCATION, -1) != -1) {
                                                                                                                ((ImageView) locationActivity.t().k).setVisibility(0);
                                                                                                                SP sp3 = locationActivity.F;
                                                                                                                sp3.getClass();
                                                                                                                sp3.setInteger(locationActivity, SP.SELECTED_LOCATION, -1);
                                                                                                                locationActivity.F();
                                                                                                                locationActivity.G();
                                                                                                                locationActivity.H();
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            final int i7 = 5;
                                                                                            t().d.setOnClickListener(new View.OnClickListener(this) { // from class: hx3
                                                                                                public final /* synthetic */ LocationActivity b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i8 = i7;
                                                                                                    final int i9 = 1;
                                                                                                    final LocationActivity locationActivity = this.b;
                                                                                                    final int i10 = 0;
                                                                                                    switch (i8) {
                                                                                                        case 0:
                                                                                                            int i11 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            Default.mSelectedLanguage = "";
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            int i12 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            try {
                                                                                                                locationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=488jwww9nd8&ab_channel=GPSMapCamera")));
                                                                                                            } catch (Exception e) {
                                                                                                                e.printStackTrace();
                                                                                                                return;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            int i13 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            bv0 bv0VarV = bv0.v(locationActivity.getLayoutInflater());
                                                                                                            ((TextView) bv0VarV.f).setText(locationActivity.getString(R.string.import_locations));
                                                                                                            ((TextView) bv0VarV.e).setText(locationActivity.getString(R.string.export_locations));
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) bv0VarV.b;
                                                                                                            relativeLayout4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                            int measuredHeight = relativeLayout4.getMeasuredHeight();
                                                                                                            int measuredWidth = relativeLayout4.getMeasuredWidth();
                                                                                                            final PopupWindow popupWindow = new PopupWindow((View) relativeLayout4, measuredWidth, measuredHeight, true);
                                                                                                            popupWindow.setOutsideTouchable(true);
                                                                                                            popupWindow.setFocusable(true);
                                                                                                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                                                                                            popupWindow.setElevation(16.0f);
                                                                                                            ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i14 = i10;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i14) {
                                                                                                                        case 0:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i14 = i9;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i14) {
                                                                                                                        case 0:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            if (view != null) {
                                                                                                                popupWindow.showAsDropDown(view, -(measuredWidth - view.getWidth()), 0);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            int i14 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) AddLocationActivity.class));
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            int i15 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.u();
                                                                                                            break;
                                                                                                        default:
                                                                                                            int i16 = LocationActivity.i0;
                                                                                                            locationActivity.s(true);
                                                                                                            SP sp2 = locationActivity.F;
                                                                                                            sp2.getClass();
                                                                                                            if (sp2.getInteger(locationActivity, SP.SELECTED_LOCATION, -1) != -1) {
                                                                                                                ((ImageView) locationActivity.t().k).setVisibility(0);
                                                                                                                SP sp3 = locationActivity.F;
                                                                                                                sp3.getClass();
                                                                                                                sp3.setInteger(locationActivity, SP.SELECTED_LOCATION, -1);
                                                                                                                locationActivity.F();
                                                                                                                locationActivity.G();
                                                                                                                locationActivity.H();
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            ((RelativeLayout) ((uz0) t().s).e).setOnClickListener(new View.OnClickListener(this) { // from class: hx3
                                                                                                public final /* synthetic */ LocationActivity b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i8 = i3;
                                                                                                    final int i9 = 1;
                                                                                                    final LocationActivity locationActivity = this.b;
                                                                                                    final int i10 = 0;
                                                                                                    switch (i8) {
                                                                                                        case 0:
                                                                                                            int i11 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            Default.mSelectedLanguage = "";
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            int i12 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            try {
                                                                                                                locationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=488jwww9nd8&ab_channel=GPSMapCamera")));
                                                                                                            } catch (Exception e) {
                                                                                                                e.printStackTrace();
                                                                                                                return;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            int i13 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            bv0 bv0VarV = bv0.v(locationActivity.getLayoutInflater());
                                                                                                            ((TextView) bv0VarV.f).setText(locationActivity.getString(R.string.import_locations));
                                                                                                            ((TextView) bv0VarV.e).setText(locationActivity.getString(R.string.export_locations));
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) bv0VarV.b;
                                                                                                            relativeLayout4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                            int measuredHeight = relativeLayout4.getMeasuredHeight();
                                                                                                            int measuredWidth = relativeLayout4.getMeasuredWidth();
                                                                                                            final PopupWindow popupWindow = new PopupWindow((View) relativeLayout4, measuredWidth, measuredHeight, true);
                                                                                                            popupWindow.setOutsideTouchable(true);
                                                                                                            popupWindow.setFocusable(true);
                                                                                                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                                                                                            popupWindow.setElevation(16.0f);
                                                                                                            ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i14 = i10;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i14) {
                                                                                                                        case 0:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i14 = i9;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i14) {
                                                                                                                        case 0:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            if (view != null) {
                                                                                                                popupWindow.showAsDropDown(view, -(measuredWidth - view.getWidth()), 0);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            int i14 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) AddLocationActivity.class));
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            int i15 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.u();
                                                                                                            break;
                                                                                                        default:
                                                                                                            int i16 = LocationActivity.i0;
                                                                                                            locationActivity.s(true);
                                                                                                            SP sp2 = locationActivity.F;
                                                                                                            sp2.getClass();
                                                                                                            if (sp2.getInteger(locationActivity, SP.SELECTED_LOCATION, -1) != -1) {
                                                                                                                ((ImageView) locationActivity.t().k).setVisibility(0);
                                                                                                                SP sp3 = locationActivity.F;
                                                                                                                sp3.getClass();
                                                                                                                sp3.setInteger(locationActivity, SP.SELECTED_LOCATION, -1);
                                                                                                                locationActivity.F();
                                                                                                                locationActivity.G();
                                                                                                                locationActivity.H();
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            ((RelativeLayout) ((uz0) t().s).h).setOnClickListener(new View.OnClickListener(this) { // from class: hx3
                                                                                                public final /* synthetic */ LocationActivity b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i8 = i2;
                                                                                                    final int i9 = 1;
                                                                                                    final LocationActivity locationActivity = this.b;
                                                                                                    final int i10 = 0;
                                                                                                    switch (i8) {
                                                                                                        case 0:
                                                                                                            int i11 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            Default.mSelectedLanguage = "";
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            int i12 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            try {
                                                                                                                locationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=488jwww9nd8&ab_channel=GPSMapCamera")));
                                                                                                            } catch (Exception e) {
                                                                                                                e.printStackTrace();
                                                                                                                return;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            int i13 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            bv0 bv0VarV = bv0.v(locationActivity.getLayoutInflater());
                                                                                                            ((TextView) bv0VarV.f).setText(locationActivity.getString(R.string.import_locations));
                                                                                                            ((TextView) bv0VarV.e).setText(locationActivity.getString(R.string.export_locations));
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) bv0VarV.b;
                                                                                                            relativeLayout4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                            int measuredHeight = relativeLayout4.getMeasuredHeight();
                                                                                                            int measuredWidth = relativeLayout4.getMeasuredWidth();
                                                                                                            final PopupWindow popupWindow = new PopupWindow((View) relativeLayout4, measuredWidth, measuredHeight, true);
                                                                                                            popupWindow.setOutsideTouchable(true);
                                                                                                            popupWindow.setFocusable(true);
                                                                                                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                                                                                            popupWindow.setElevation(16.0f);
                                                                                                            ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i14 = i10;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i14) {
                                                                                                                        case 0:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i14 = i9;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i14) {
                                                                                                                        case 0:
                                                                                                                            int i15 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            if (view != null) {
                                                                                                                popupWindow.showAsDropDown(view, -(measuredWidth - view.getWidth()), 0);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            int i14 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) AddLocationActivity.class));
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            int i15 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.u();
                                                                                                            break;
                                                                                                        default:
                                                                                                            int i16 = LocationActivity.i0;
                                                                                                            locationActivity.s(true);
                                                                                                            SP sp2 = locationActivity.F;
                                                                                                            sp2.getClass();
                                                                                                            if (sp2.getInteger(locationActivity, SP.SELECTED_LOCATION, -1) != -1) {
                                                                                                                ((ImageView) locationActivity.t().k).setVisibility(0);
                                                                                                                SP sp3 = locationActivity.F;
                                                                                                                sp3.getClass();
                                                                                                                sp3.setInteger(locationActivity, SP.SELECTED_LOCATION, -1);
                                                                                                                locationActivity.F();
                                                                                                                locationActivity.G();
                                                                                                                locationActivity.H();
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            final int i8 = 2;
                                                                                            ((RelativeLayout) ((uz0) t().s).f).setOnClickListener(new View.OnClickListener(this) { // from class: hx3
                                                                                                public final /* synthetic */ LocationActivity b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i9 = i8;
                                                                                                    final int i10 = 1;
                                                                                                    final LocationActivity locationActivity = this.b;
                                                                                                    final int i11 = 0;
                                                                                                    switch (i9) {
                                                                                                        case 0:
                                                                                                            int i12 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            Default.mSelectedLanguage = "";
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            int i13 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            try {
                                                                                                                locationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=488jwww9nd8&ab_channel=GPSMapCamera")));
                                                                                                            } catch (Exception e) {
                                                                                                                e.printStackTrace();
                                                                                                                return;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            int i14 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            bv0 bv0VarV = bv0.v(locationActivity.getLayoutInflater());
                                                                                                            ((TextView) bv0VarV.f).setText(locationActivity.getString(R.string.import_locations));
                                                                                                            ((TextView) bv0VarV.e).setText(locationActivity.getString(R.string.export_locations));
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) bv0VarV.b;
                                                                                                            relativeLayout4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                            int measuredHeight = relativeLayout4.getMeasuredHeight();
                                                                                                            int measuredWidth = relativeLayout4.getMeasuredWidth();
                                                                                                            final PopupWindow popupWindow = new PopupWindow((View) relativeLayout4, measuredWidth, measuredHeight, true);
                                                                                                            popupWindow.setOutsideTouchable(true);
                                                                                                            popupWindow.setFocusable(true);
                                                                                                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                                                                                            popupWindow.setElevation(16.0f);
                                                                                                            ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i15 = i11;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i15) {
                                                                                                                        case 0:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i17 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: lx3
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view2) {
                                                                                                                    int i15 = i10;
                                                                                                                    LocationActivity locationActivity2 = locationActivity;
                                                                                                                    PopupWindow popupWindow2 = popupWindow;
                                                                                                                    switch (i15) {
                                                                                                                        case 0:
                                                                                                                            int i16 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            gc1 gc1Var = locationActivity2.O;
                                                                                                                            if ((gc1Var != null ? gc1Var.q() : new ArrayList()).isEmpty()) {
                                                                                                                                HelperClass.showSnackBar(locationActivity2.t().b, locationActivity2.getString(R.string.atleast_one_location));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            utils utilsVar = new utils();
                                                                                                                            gc1 gc1Var2 = locationActivity2.O;
                                                                                                                            gc1Var2.getClass();
                                                                                                                            utilsVar.exportLocationsToGMC(locationActivity2, gc1Var2);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i17 = LocationActivity.i0;
                                                                                                                            popupWindow2.dismiss();
                                                                                                                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                                                                            intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                            intent.setType("*/*");
                                                                                                                            i6 i6Var = locationActivity2.e0;
                                                                                                                            if (i6Var != null) {
                                                                                                                                i6Var.a(intent, null);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bi3.g(CvmpVJvatR.LkUPjwovLe);
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            if (view != null) {
                                                                                                                popupWindow.showAsDropDown(view, -(measuredWidth - view.getWidth()), 0);
                                                                                                            }
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            int i15 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.startActivity(new Intent(locationActivity, (Class<?>) AddLocationActivity.class));
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            int i16 = LocationActivity.i0;
                                                                                                            locationActivity.s(false);
                                                                                                            locationActivity.u();
                                                                                                            break;
                                                                                                        default:
                                                                                                            int i17 = LocationActivity.i0;
                                                                                                            locationActivity.s(true);
                                                                                                            SP sp2 = locationActivity.F;
                                                                                                            sp2.getClass();
                                                                                                            if (sp2.getInteger(locationActivity, SP.SELECTED_LOCATION, -1) != -1) {
                                                                                                                ((ImageView) locationActivity.t().k).setVisibility(0);
                                                                                                                SP sp3 = locationActivity.F;
                                                                                                                sp3.getClass();
                                                                                                                sp3.setInteger(locationActivity, SP.SELECTED_LOCATION, -1);
                                                                                                                locationActivity.F();
                                                                                                                locationActivity.G();
                                                                                                                locationActivity.H();
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            ((RecyclerView) t().q).setNestedScrollingEnabled(false);
                                                                                            ((RecyclerView) t().p).setNestedScrollingEnabled(false);
                                                                                            ((SafeNestedScrollView) t().o).setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: gx3
                                                                                                @Override // android.view.View.OnScrollChangeListener
                                                                                                public final void onScrollChange(View view, int i9, int i10, int i11, int i12) {
                                                                                                    int i13 = LocationActivity.i0;
                                                                                                    if (Math.abs(i10 - i12) > 5) {
                                                                                                        this.a.s(true);
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            this.e0 = (i6) n(new kx3(this, i8), new c6(i5));
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
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        try {
            kf8 kf8Var = ((MapView) t().m).a;
            et3 et3Var = kf8Var.a;
            if (et3Var != null) {
                et3Var.onDestroy();
            } else {
                kf8Var.c(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.G = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        try {
            et3 et3Var = ((MapView) t().m).a.a;
            if (et3Var != null) {
                et3Var.onLowMemory();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        super.onPause();
        s(false);
        try {
            kf8 kf8Var = ((MapView) t().m).a;
            et3 et3Var = kf8Var.a;
            if (et3Var != null) {
                et3Var.onPause();
            } else {
                kf8Var.c(5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        s(false);
        CPD.ShowDialog(this);
        Executors.newSingleThreadExecutor().execute(new ix3(this, 3));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onStop() {
        super.onStop();
        s(false);
    }

    public final void s(boolean z) {
        try {
            ln5 ln5Var = this.X;
            if (ln5Var != null) {
                ln5Var.e(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ln5 ln5Var2 = this.Y;
            if (ln5Var2 != null) {
                ln5Var2.e(z);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        C((RecyclerView) t().q);
        C((RecyclerView) t().p);
    }

    public final m5 t() {
        m5 m5Var = this.B;
        if (m5Var != null) {
            return m5Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final void u() {
        SP sp = this.F;
        sp.getClass();
        int i = 0;
        int integer = sp.getInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSMapdataFS(this)) {
            finish();
            return;
        }
        int i3 = 1;
        if (integer >= RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler(Looper.getMainLooper()).postDelayed(new ix3(this, i), 200L);
            Handler handler = this.g0;
            handler.getClass();
            handler.postDelayed(new ix3(this, i3), 7000L);
            return;
        }
        SP sp2 = this.F;
        sp2.getClass();
        sp2.setInteger(this, HelperClass.COUNTADS, integer + 1);
        finish();
    }

    public final void v() {
        p64.g(this);
        this.c0 = new LocationSupplier(this);
        this.H = ky3.a(this);
        if (la9.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || la9.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            fp8 fp8Var = this.H;
            fp8Var.getClass();
            fp8Var.g().m(this, new kx3(this, 6));
        }
        ((MapView) t().m).b(null);
        kf8 kf8Var = ((MapView) t().m).a;
        kf8Var.getClass();
        kf8Var.d(null, new d68(kf8Var, 1));
        ((MapView) t().m).a(this);
    }

    public final void x() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new tv5(28, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void y() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ws3(1, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void z() {
        List listF = iv0.f(lm4.a);
        String str = RemoteAdData.LOCATION_SCREEN_NATIVE_ID;
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listF);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new zn4(28, this));
    }
}