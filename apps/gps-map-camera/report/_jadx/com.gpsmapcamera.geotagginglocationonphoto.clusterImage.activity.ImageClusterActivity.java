package com.gpsmapcamera.geotagginglocationonphoto.clusterImage.activity;

import ads_mobile_sdk.mo1;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.a;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.card.MaterialCardView;
import com.google.maps.android.ui.RotationLayout;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.clusterImage.activity.ImageClusterActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RoundImageView;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.events.le.bqcsmGRRmsYO;
import com.itextpdf.text.pdf.fonts.otf.lujf.ZPpqUfsYTcWxP;
import defpackage.a7;
import defpackage.bj;
import defpackage.bw4;
import defpackage.c54;
import defpackage.c66;
import defpackage.c73;
import defpackage.cc7;
import defpackage.cr3;
import defpackage.d73;
import defpackage.e4;
import defpackage.e88;
import defpackage.eo7;
import defpackage.gb0;
import defpackage.gg8;
import defpackage.gu0;
import defpackage.i41;
import defpackage.i73;
import defpackage.ja1;
import defpackage.je8;
import defpackage.kg1;
import defpackage.l76;
import defpackage.la9;
import defpackage.lt1;
import defpackage.mk9;
import defpackage.mq7;
import defpackage.mx0;
import defpackage.n5;
import defpackage.n8;
import defpackage.oj9;
import defpackage.p;
import defpackage.p56;
import defpackage.pa1;
import defpackage.pn8;
import defpackage.pn9;
import defpackage.pp2;
import defpackage.pr5;
import defpackage.r64;
import defpackage.r73;
import defpackage.rx0;
import defpackage.s78;
import defpackage.t49;
import defpackage.t64;
import defpackage.tv5;
import defpackage.u;
import defpackage.ub7;
import defpackage.ut5;
import defpackage.v60;
import defpackage.v91;
import defpackage.w40;
import defpackage.wl1;
import defpackage.wt9;
import defpackage.xx4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class ImageClusterActivity extends bj implements xx4 {
    public static final /* synthetic */ int S = 0;
    public n5 B;
    public s78 C;
    public v91 L;
    public SP M;
    public v60 N;
    public boolean R;
    public final ArrayList D = new ArrayList();
    public ArrayList E = new ArrayList();
    public ArrayList F = new ArrayList();
    public final HashMap G = new HashMap();
    public final ArrayList H = new ArrayList();
    public float I = -1.0f;
    public final ConcurrentHashMap J = new ConcurrentHashMap();
    public final ExecutorService K = Executors.newFixedThreadPool(4);
    public Handler O = new Handler(Looper.getMainLooper());
    public mo1 P = null;
    public boolean Q = false;

    public ImageClusterActivity() {
        new Admob();
        this.R = false;
    }

    public static PointF C(LatLng latLng, float f) {
        double dPow = Math.pow(2.0d, f) * 256.0d;
        double d = ((latLng.e + 180.0d) / 360.0d) * dPow;
        double dMax = Math.max(-0.9999d, Math.min(0.9999d, Math.sin(Math.toRadians(latLng.d))));
        return new PointF((float) d, (float) ((0.5d - (Math.log((dMax + 1.0d) / (1.0d - dMax)) / 12.566370614359172d)) * dPow));
    }

    public static gu0 x(gu0 gu0Var, ArrayList arrayList) {
        gu0 gu0Var2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet(gu0Var.c);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            gu0 gu0Var3 = (gu0) obj;
            ArrayList arrayList2 = gu0Var3.c;
            int size2 = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                if (hashSet.contains((String) obj2)) {
                    i3++;
                }
            }
            if (i3 > i) {
                gu0Var2 = gu0Var3;
                i = i3;
            }
        }
        return gu0Var2;
    }

    public final void A() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new tv5(24, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void B() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new pp2(28, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final Bitmap D(Uri uri, String str) {
        Object file;
        if (uri != null) {
            file = uri;
        } else {
            file = !str.isEmpty() ? new File(str) : null;
        }
        if (file == null) {
            return null;
        }
        try {
            return (Bitmap) ((pr5) ((pr5) a.e(getApplicationContext()).k().I(file).j(120, 120)).b()).J().get();
        } catch (Exception unused) {
            if (!file.equals(uri) || str.isEmpty()) {
                return null;
            }
            try {
                return (Bitmap) ((pr5) ((pr5) a.e(getApplicationContext()).k().I(new File(str)).j(120, 120)).b()).J().get();
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x0324  */
    public final void E() {
        LatLng latLng;
        boolean z;
        float f;
        LatLng latLng2;
        final r64 r64VarS;
        char c;
        ArrayList arrayList;
        if (this.C != null) {
            ArrayList arrayList2 = this.D;
            if (arrayList2.isEmpty()) {
                return;
            }
            if (this.E.isEmpty()) {
                HashMap map = new HashMap();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    r73 r73Var = (r73) obj;
                    cr3 cr3Var = r73Var.c;
                    if (cr3Var != null) {
                        double dRound = Math.round(cr3Var.a * 10000.0d) / 10000.0d;
                        double dRound2 = Math.round(r73Var.c.b * 10000.0d) / 10000.0d;
                        String str = dRound + "," + dRound2;
                        gu0 gu0Var = (gu0) map.getOrDefault(str, new gu0(dRound, dRound2));
                        gu0Var.a(r73Var.b, r73Var.a);
                        map.put(str, gu0Var);
                    }
                }
                this.E = new ArrayList(map.values());
            }
            float f2 = this.C.p().e;
            boolean zIsEmpty = this.F.isEmpty();
            boolean z2 = f2 > this.I;
            this.I = f2;
            float f3 = getResources().getDisplayMetrics().density * 38.0f;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.E;
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                gu0 gu0Var2 = (gu0) obj2;
                double d = gu0Var2.a;
                ArrayList arrayList5 = gu0Var2.d;
                double d2 = gu0Var2.b;
                boolean z3 = zIsEmpty;
                ArrayList arrayList6 = gu0Var2.c;
                PointF pointFC = C(new LatLng(d, d2), f2);
                int size3 = arrayList3.size();
                gu0 gu0Var3 = null;
                double d3 = Double.MAX_VALUE;
                ArrayList arrayList7 = arrayList4;
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    int i4 = i3 + 1;
                    gu0 gu0Var4 = (gu0) obj3;
                    int i5 = size2;
                    boolean z4 = z2;
                    ArrayList arrayList8 = arrayList3;
                    double d4 = d2;
                    PointF pointFC2 = C(new LatLng(gu0Var4.a, gu0Var4.b), f2);
                    double dHypot = Math.hypot(pointFC.x - pointFC2.x, pointFC.y - pointFC2.y);
                    if (dHypot <= f3 && dHypot < d3) {
                        gu0Var3 = gu0Var4;
                        d3 = dHypot;
                    }
                    size2 = i5;
                    i3 = i4;
                    z2 = z4;
                    arrayList3 = arrayList8;
                    d2 = d4;
                }
                int i6 = size2;
                double d5 = d2;
                boolean z5 = z2;
                ArrayList arrayList9 = arrayList3;
                if (gu0Var3 != null) {
                    for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                        gu0Var3.a((Uri) arrayList5.get(i7), (String) arrayList6.get(i7));
                    }
                    arrayList = arrayList9;
                } else {
                    gu0 gu0Var5 = new gu0(gu0Var2.a, d5);
                    for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                        gu0Var5.a((Uri) arrayList5.get(i8), (String) arrayList6.get(i8));
                    }
                    arrayList = arrayList9;
                    arrayList.add(gu0Var5);
                }
                arrayList3 = arrayList;
                zIsEmpty = z3;
                arrayList4 = arrayList7;
                size2 = i6;
                z2 = z5;
            }
            boolean z6 = zIsEmpty;
            boolean z7 = z2;
            ArrayList arrayList10 = arrayList3;
            ArrayList arrayList11 = this.H;
            int size4 = arrayList11.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj4 = arrayList11.get(i9);
                i9++;
                ValueAnimator valueAnimator = (ValueAnimator) obj4;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
            }
            arrayList11.clear();
            ja1.a.clear();
            int size5 = arrayList10.size();
            int i10 = 0;
            while (i10 < size5) {
                Object obj5 = arrayList10.get(i10);
                i10++;
                gu0 gu0Var6 = (gu0) obj5;
                ja1.a.add(new pa1(new LatLng(gu0Var6.a, gu0Var6.b), gu0Var6.c, gu0Var6.d));
            }
            HashMap map2 = this.G;
            if (z6) {
                this.C.m();
                map2.clear();
                int size6 = arrayList10.size();
                int i11 = 0;
                while (i11 < size6) {
                    Object obj6 = arrayList10.get(i11);
                    i11++;
                    gu0 gu0Var7 = (gu0) obj6;
                    r64 r64VarS2 = s(gu0Var7, new LatLng(gu0Var7.a, gu0Var7.b), 1.0f);
                    if (r64VarS2 != null) {
                        map2.put(gu0Var7, r64VarS2);
                    }
                }
            } else {
                ArrayList arrayList12 = new ArrayList(this.F);
                HashMap map3 = new HashMap(map2);
                map2.clear();
                for (Map.Entry entry : map3.entrySet()) {
                    gu0 gu0Var8 = (gu0) entry.getKey();
                    final r64 r64Var = (r64) entry.getValue();
                    if (r64Var != null) {
                        gu0 gu0VarX = x(gu0Var8, arrayList10);
                        if (gu0VarX == null || z7) {
                            r64Var.c();
                        } else {
                            final LatLng latLngA = r64Var.a();
                            final LatLng latLng3 = new LatLng(gu0VarX.a, gu0VarX.b);
                            if (Math.hypot(latLngA.d - latLng3.d, latLngA.e - latLng3.e) > 1.0E-6d) {
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ColumnText.GLOBAL_SPACE_CHAR_RATIO, 1.0f);
                                valueAnimatorOfFloat.setDuration(320L);
                                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f73
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        int i12 = ImageClusterActivity.S;
                                        float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        LatLng latLng4 = latLng3;
                                        double d6 = latLng4.d;
                                        LatLng latLng5 = latLngA;
                                        double d7 = latLng5.d;
                                        double d8 = fFloatValue;
                                        double d9 = ((d6 - d7) * d8) + d7;
                                        double d10 = latLng4.e;
                                        double d11 = latLng5.e;
                                        LatLng latLng6 = new LatLng(d9, ((d10 - d11) * d8) + d11);
                                        r64 r64Var2 = r64Var;
                                        r64Var2.f(latLng6);
                                        r64Var2.d(1.0f - fFloatValue);
                                    }
                                });
                                valueAnimatorOfFloat.addListener(new e4(9, r64Var));
                                valueAnimatorOfFloat.start();
                                arrayList11.add(valueAnimatorOfFloat);
                            } else {
                                r64Var.c();
                            }
                        }
                    }
                }
                int i12 = 0;
                for (int size7 = arrayList10.size(); i12 < size7; size7 = size7) {
                    int i13 = i12 + 1;
                    gu0 gu0Var9 = (gu0) arrayList10.get(i12);
                    final LatLng latLng4 = new LatLng(gu0Var9.a, gu0Var9.b);
                    gu0 gu0VarX2 = x(gu0Var9, arrayList12);
                    LatLng latLng5 = gu0VarX2 != null ? new LatLng(gu0VarX2.a, gu0VarX2.b) : latLng4;
                    if (!z7 || gu0VarX2 == null) {
                        latLng = latLng5;
                    } else {
                        latLng = latLng5;
                        z = Math.hypot(latLng5.d - latLng4.d, latLng5.e - latLng4.e) > 1.0E-6d;
                        if (z) {
                            f = 0.2f;
                        } else {
                            f = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                        }
                        if (z) {
                            latLng2 = latLng;
                        } else {
                            latLng2 = latLng4;
                        }
                        r64VarS = s(gu0Var9, latLng2, f);
                        if (r64VarS != null) {
                            map2.put(gu0Var9, r64VarS);
                            c = 2;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(ColumnText.GLOBAL_SPACE_CHAR_RATIO, 1.0f);
                            valueAnimatorOfFloat2.setDuration(320L);
                            valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                            final boolean z8 = z;
                            final LatLng latLng6 = latLng;
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g73
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    int i14 = ImageClusterActivity.S;
                                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    boolean z9 = z8;
                                    r64 r64Var2 = r64VarS;
                                    if (z9) {
                                        LatLng latLng7 = latLng4;
                                        double d6 = latLng7.d;
                                        LatLng latLng8 = latLng6;
                                        double d7 = latLng8.d;
                                        double d8 = fFloatValue;
                                        double d9 = ((d6 - d7) * d8) + d7;
                                        double d10 = latLng7.e;
                                        double d11 = latLng8.e;
                                        r64Var2.f(new LatLng(d9, ((d10 - d11) * d8) + d11));
                                    }
                                    r64Var2.d(fFloatValue);
                                }
                            });
                            valueAnimatorOfFloat2.start();
                            arrayList11.add(valueAnimatorOfFloat2);
                        } else {
                            c = 2;
                        }
                        i12 = i13;
                    }
                    if (z) {
                        f = 0.2f;
                    } else {
                        f = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                    }
                    if (z) {
                        latLng2 = latLng;
                    } else {
                        latLng2 = latLng4;
                    }
                    r64VarS = s(gu0Var9, latLng2, f);
                    if (r64VarS != null) {
                        map2.put(gu0Var9, r64VarS);
                        c = 2;
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(ColumnText.GLOBAL_SPACE_CHAR_RATIO, 1.0f);
                        valueAnimatorOfFloat3.setDuration(320L);
                        valueAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator());
                        final boolean z9 = z;
                        final LatLng latLng7 = latLng;
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g73
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                int i14 = ImageClusterActivity.S;
                                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                boolean z10 = z9;
                                r64 r64Var2 = r64VarS;
                                if (z10) {
                                    LatLng latLng8 = latLng4;
                                    double d6 = latLng8.d;
                                    LatLng latLng9 = latLng7;
                                    double d7 = latLng9.d;
                                    double d8 = fFloatValue;
                                    double d9 = ((d6 - d7) * d8) + d7;
                                    double d10 = latLng8.e;
                                    double d11 = latLng9.e;
                                    r64Var2.f(new LatLng(d9, ((d10 - d11) * d8) + d11));
                                }
                                r64Var2.d(fFloatValue);
                            }
                        });
                        valueAnimatorOfFloat3.start();
                        arrayList11.add(valueAnimatorOfFloat3);
                    } else {
                        c = 2;
                    }
                    i12 = i13;
                }
            }
            this.F = arrayList10;
        }
    }

    @Override // defpackage.xx4
    public final void g(s78 s78Var) {
        this.C = s78Var;
        int integer = this.M.getInteger(this, SP.MAP_TYPE_CLUSTER, 0);
        if (integer == 0) {
            this.C.z(1);
        } else if (integer == 1) {
            this.C.z(2);
        } else if (integer == 2) {
            this.C.z(3);
        } else if (integer == 3) {
            this.C.z(4);
        }
        if (!this.D.isEmpty()) {
            E();
        }
        this.C.B(new c73(this));
        s78 s78Var2 = this.C;
        c73 c73Var = new c73(this);
        t49 t49Var = (t49) s78Var2.b;
        try {
            e88 e88Var = new e88(s78Var2, c73Var);
            Parcel parcelK = t49Var.K();
            pn8.c(parcelK, e88Var);
            t49Var.N(parcelK, 30);
            String string = this.M.getString(this, SP.LATITUDE, "0.0");
            String string2 = this.M.getString(this, SP.LONGITUDE, "0.0");
            if (string.isEmpty()) {
                string = "0.0";
            }
            runOnUiThread(new p(27, this, string, string2.isEmpty() ? "0.0" : string2));
        } catch (RemoteException e) {
            mq7.k(e);
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        SP sp = new SP(this);
        this.M = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        if (string.equals(Default.DARK)) {
            this.Q = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.Q = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.Q = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        new HelperClass().SetLanguage(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_image_cluster, (ViewGroup) null, false);
        int i2 = R.id.animation;
        if (((LottieAnimationView) pn9.a(R.id.animation, viewInflate)) != null) {
            i2 = R.id.btnGrantPermission;
            Button button = (Button) pn9.a(R.id.btnGrantPermission, viewInflate);
            if (button != null) {
                i2 = R.id.cardCurrentLocation;
                MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.cardCurrentLocation, viewInflate);
                if (materialCardView != null) {
                    i2 = R.id.cardMapType;
                    MaterialCardView materialCardView2 = (MaterialCardView) pn9.a(R.id.cardMapType, viewInflate);
                    if (materialCardView2 != null) {
                        i2 = R.id.cardPermission;
                        CardView cardView = (CardView) pn9.a(R.id.cardPermission, viewInflate);
                        if (cardView != null) {
                            i2 = R.id.conLottie;
                            RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.conLottie, viewInflate);
                            if (relativeLayout != null) {
                                i2 = R.id.ivCurrentLocation;
                                ImageView imageView = (ImageView) pn9.a(R.id.ivCurrentLocation, viewInflate);
                                if (imageView != null) {
                                    i2 = R.id.ivMapType;
                                    ImageView imageView2 = (ImageView) pn9.a(R.id.ivMapType, viewInflate);
                                    if (imageView2 != null) {
                                        i2 = R.id.lay_toolbar;
                                        View viewA = pn9.a(R.id.lay_toolbar, viewInflate);
                                        if (viewA != null) {
                                            l76 l76VarA = l76.a(viewA);
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i2 = R.id.rel_adaptive_banner;
                                            if (((RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate)) != null) {
                                                if (((TextView) pn9.a(R.id.txt_load, viewInflate)) != null) {
                                                    this.B = new n5(constraintLayout, button, materialCardView, materialCardView2, cardView, relativeLayout, imageView, imageView2, l76VarA, constraintLayout);
                                                    setContentView(constraintLayout);
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) this.B.g;
                                                    c73 c73Var = new c73(this);
                                                    WeakHashMap weakHashMap = cc7.a;
                                                    ub7.c(constraintLayout2, c73Var);
                                                    ((CardView) this.B.i).setVisibility(8);
                                                    ((Button) this.B.h).setOnClickListener(new d73(this, 6));
                                                    this.M = new SP(this);
                                                    k().a(this, new n8(this, 13));
                                                    ((SupportMapFragment) o().B(R.id.googleMap)).a0(this);
                                                    if (Build.VERSION.SDK_INT > 32 || la9.a(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                                                        v();
                                                    } else {
                                                        la9.g(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1002);
                                                    }
                                                    this.L = v91.a(getLayoutInflater());
                                                    v60 v60Var = new v60(this);
                                                    this.N = v60Var;
                                                    v60Var.setContentView((CoordinatorLayout) this.L.a);
                                                    Window window = this.N.getWindow();
                                                    if (window != null) {
                                                        WindowManager.LayoutParams attributes = window.getAttributes();
                                                        attributes.alpha = 1.0f;
                                                        attributes.dimAmount = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
                                                        window.setAttributes(attributes);
                                                        window.setBackgroundDrawable(new ColorDrawable(0));
                                                    }
                                                    ((RelativeLayout) ((l76) this.B.e).c).setOnClickListener(new d73(this, 7));
                                                    ((TextView) ((l76) this.B.e).l).setText(getString(R.string.image_on_map));
                                                    return;
                                                }
                                                i2 = R.id.txt_load;
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
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ValueAnimator valueAnimator = (ValueAnimator) obj;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
        }
        arrayList.clear();
        ExecutorService executorService = this.K;
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdownNow();
        }
        this.J.clear();
        this.E.clear();
        this.F.clear();
        this.G.clear();
        ja1.a.clear();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.O = null;
        super.onPause();
    }

    @Override // defpackage.bh2, defpackage.gy0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1002) {
            if (i == 1001) {
                ((CardView) this.B.i).setVisibility(8);
                z();
                return;
            }
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            ((RelativeLayout) this.B.b).setVisibility(8);
            ((CardView) this.B.i).setVisibility(0);
        } else {
            ((CardView) this.B.i).setVisibility(8);
            v();
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        n5 n5Var = this.B;
        if (n5Var == null || ((CardView) n5Var.i).getVisibility() != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT > 32 || la9.a(this, ZPpqUfsYTcWxP.bHUtAroByEyP) == 0) {
            ((CardView) this.B.i).setVisibility(8);
            v();
        }
    }

    public final r64 s(gu0 gu0Var, LatLng latLng, float f) {
        ExecutorService executorService;
        ArrayList arrayList = gu0Var.c;
        ArrayList arrayList2 = gu0Var.d;
        String str = !arrayList.isEmpty() ? (String) arrayList.get(0) : "";
        Uri uri = !arrayList2.isEmpty() ? (Uri) arrayList2.get(0) : null;
        Bitmap bitmapY = y(uri, str);
        w40 w40VarW = w(gu0Var, bitmapY);
        try {
            s78 s78Var = this.C;
            t64 t64Var = new t64();
            t64Var.d = latLng;
            t64Var.g = w40VarW;
            t64Var.p = f;
            r64 r64VarD = s78Var.d(t64Var);
            if (r64VarD != null) {
                try {
                    gg8 gg8Var = r64VarD.a;
                    bw4 bw4Var = new bw4(gu0Var);
                    je8 je8Var = (je8) gg8Var;
                    Parcel parcelK = je8Var.K();
                    pn8.c(parcelK, bw4Var);
                    je8Var.N(parcelK, 29);
                } catch (RemoteException e) {
                    throw new rx0(e, 8);
                }
            }
            if (bitmapY == null && ((!str.isEmpty() || uri != null) && (executorService = this.K) != null && !executorService.isShutdown())) {
                executorService.execute(new mx0(this, str, uri, gu0Var, r64VarD, 2));
                return r64VarD;
            }
            return r64VarD;
        } catch (Exception e2) {
            Log.e("CLUSTER_TAG", "ExceptionException       : " + e2.getMessage());
            return null;
        }
    }

    public final void t(String str, Uri uri, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.J;
        if (uri != null) {
            concurrentHashMap.put(uri.toString(), bitmap);
        }
        if (str.isEmpty()) {
            return;
        }
        concurrentHashMap.put(str, bitmap);
    }

    public final void u() {
        int integer = this.M.getInteger(this, bqcsmGRRmsYO.bDqqNGNJceiLGP, 0);
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.app_main, typedValue, true);
        int i = typedValue.data;
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(R.attr.app_text_main, typedValue2, true);
        int i2 = typedValue2.data;
        int color = getColor(android.R.color.transparent);
        Typeface typefaceA = ut5.a(this, R.font.rubik_medium);
        Typeface typefaceA2 = ut5.a(this, R.font.rubik_regular);
        ((MaterialCardView) this.L.c).setStrokeColor(ColorStateList.valueOf(integer == 0 ? i : color));
        ((TextView) this.L.k).setTextColor(integer == 0 ? i : i2);
        ((TextView) this.L.k).setTypeface(integer == 0 ? typefaceA : typefaceA2);
        ((MaterialCardView) this.L.d).setStrokeColor(ColorStateList.valueOf(integer == 1 ? i : color));
        ((TextView) this.L.l).setTextColor(integer == 1 ? i : i2);
        ((TextView) this.L.l).setTypeface(integer == 1 ? typefaceA : typefaceA2);
        ((MaterialCardView) this.L.e).setStrokeColor(ColorStateList.valueOf(integer == 2 ? i : color));
        ((TextView) this.L.m).setTextColor(integer == 2 ? i : i2);
        ((TextView) this.L.m).setTypeface(integer == 2 ? typefaceA : typefaceA2);
        MaterialCardView materialCardView = (MaterialCardView) this.L.b;
        if (integer == 3) {
            color = i;
        }
        materialCardView.setStrokeColor(ColorStateList.valueOf(color));
        TextView textView = (TextView) this.L.j;
        if (integer != 3) {
            i = i2;
        }
        textView.setTextColor(i);
        TextView textView2 = (TextView) this.L.j;
        if (integer != 3) {
            typefaceA = typefaceA2;
        }
        textView2.setTypeface(typefaceA);
    }

    public final void v() {
        if (Build.VERSION.SDK_INT < 29 || la9.a(this, "android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            z();
        } else {
            la9.g(this, new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 1001);
        }
    }

    public final w40 w(gu0 gu0Var, Bitmap bitmap) {
        p56 p56Var = new p56(this);
        p56Var.U(new ColorDrawable(0));
        View viewInflate = View.inflate(this, R.layout.clusterview, null);
        RotationLayout rotationLayout = (RotationLayout) p56Var.c;
        rotationLayout.removeAllViews();
        rotationLayout.addView(viewInflate);
        p56Var.e = viewInflate;
        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
        p56Var.d = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        RoundImageView roundImageView = (RoundImageView) viewInflate.findViewById(R.id.image_show_cluster);
        ((TextView) viewInflate.findViewById(R.id.tvCount)).setText(String.valueOf(gu0Var.c.size()));
        if (bitmap == null || bitmap.isRecycled()) {
            roundImageView.setImageResource(R.drawable.null_image);
        } else {
            roundImageView.setImageBitmap(bitmap);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) p56Var.b;
        viewGroup.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        viewGroup.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        viewGroup.draw(new Canvas(bitmapCreateBitmap));
        return oj9.d(bitmapCreateBitmap);
    }

    public final Bitmap y(Uri uri, String str) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ConcurrentHashMap concurrentHashMap = this.J;
        if (uri != null && concurrentHashMap.containsKey(uri.toString()) && (bitmap2 = (Bitmap) concurrentHashMap.get(uri.toString())) != null && !bitmap2.isRecycled()) {
            return bitmap2;
        }
        if (str == null || str.isEmpty() || !concurrentHashMap.containsKey(str) || (bitmap = (Bitmap) concurrentHashMap.get(str)) == null || bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }

    public final void z() {
        if (this.R) {
            return;
        }
        this.R = true;
        ((CardView) this.B.i).setVisibility(8);
        ((RelativeLayout) this.B.b).setVisibility(0);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/");
        String strO = eo7.o(sb, Environment.DIRECTORY_DCIM, "/GPS Map Camera");
        ConcurrentHashMap concurrentHashMap = i73.a;
        u uVar = new u(9, this);
        kg1 kg1Var = wl1.a;
        mk9.g(wt9.a(c54.a), null, null, new gb0(this, strO, uVar, (i41) null, 16), 3);
    }
}