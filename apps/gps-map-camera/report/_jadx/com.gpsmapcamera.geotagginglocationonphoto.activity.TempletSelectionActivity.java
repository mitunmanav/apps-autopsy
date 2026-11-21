package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.fh;
import ads_mobile_sdk.l12;
import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.startup.fO.uBHp;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.facebook.login.ITY.XIBrjfXRiD;
import com.facebook.share.Hueb.CvmpVJvatR;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Ju.NKqVA;
import com.google.android.exoplayer2.ui.ra.ZOCVirpIr;
import com.google.android.gms.ads.mediation.rvI.zUHsDp;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.sidesheet.JCQ.vVvojdym;
import com.google.firebase.analytics.Tb.VCKtvKCuFgEI;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.helper.utils;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentParser;
import com.itextpdf.text.pdf.fonts.otf.lujf.ZPpqUfsYTcWxP;
import com.itextpdf.text.pdf.parser.HriA.jumTrYZsYnyZCd;
import defpackage.a7;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc7;
import defpackage.dt7;
import defpackage.e65;
import defpackage.eo7;
import defpackage.fz7;
import defpackage.ge4;
import defpackage.h94;
import defpackage.hv0;
import defpackage.j64;
import defpackage.kx0;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mv1;
import defpackage.n8;
import defpackage.nq6;
import defpackage.q6;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.w49;
import defpackage.ws3;
import defpackage.xk2;
import defpackage.z55;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class TempletSelectionActivity extends bj implements View.OnClickListener {
    public static final /* synthetic */ int s9 = 0;
    public ImageView A0;
    public String A1;
    public TextView A2;
    public LinearLayout A3;
    public boolean A4;
    public boolean A5;
    public int A6;
    public String A7;
    public String A8;
    public ImageView B;
    public ImageView B0;
    public String B1;
    public TextView B2;
    public LinearLayout B3;
    public boolean B4;
    public boolean B5;
    public int B6;
    public String B7;
    public String B8;
    public ImageView C;
    public ImageView C0;
    public String C1;
    public TextView C2;
    public LinearLayout C3;
    public boolean C4;
    public boolean C5;
    public int C6;
    public String C7;
    public String C8;
    public ImageView D;
    public ImageView D0;
    public String D1;
    public TextView D2;
    public LinearLayout D3;
    public boolean D4;
    public String D5;
    public int D6;
    public String D7;
    public String D8;
    public ImageView E;
    public ImageView E0;
    public int E1;
    public TextView E2;
    public RelativeLayout E3;
    public boolean E4;
    public LinearLayout E5;
    public int E6;
    public String E7;
    public String E8;
    public ImageView F;
    public LinearLayout F0;
    public int F1;
    public TextView F2;
    public RelativeLayout F3;
    public boolean F4;
    public LinearLayout F5;
    public int F6;
    public String F7;
    public String F8;
    public ImageView G;
    public LinearLayout G0;
    public int G1;
    public TextView G2;
    public GridLayout G3;
    public boolean G4;
    public TextView G5;
    public int G6;
    public String G7;
    public String G8;
    public ImageView H;
    public LinearLayout H0;
    public TextView H1;
    public TextView H2;
    public boolean H3;
    public boolean H4;
    public TextView H5;
    public int H6;
    public String H7;
    public String H8;
    public ImageView I;
    public LinearLayout I0;
    public ImageView I1;
    public TextView I2;
    public boolean I3;
    public boolean I4;
    public boolean I5;
    public int I6;
    public String I7;
    public String I8;
    public ImageView J;
    public LinearLayout J0;
    public ImageView J1;
    public LinearLayout J2;
    public boolean J4;
    public boolean J5;
    public int J6;
    public String J7;
    public String J8;
    public ImageView K;
    public LinearLayout K0;
    public ImageView K1;
    public LinearLayout K2;
    public boolean K4;
    public boolean K5;
    public int K6;
    public String K7;
    public String K8;
    public ImageView L;
    public LinearLayout L0;
    public ImageView L1;
    public LinearLayout L2;
    public boolean L3;
    public boolean L4;
    public boolean L5;
    public int L6;
    public String L7;
    public String L8;
    public ImageView M;
    public LinearLayout M0;
    public LinearLayout M1;
    public LinearLayout M2;
    public boolean M3;
    public boolean M4;
    public boolean M5;
    public int M6;
    public int M7;
    public String M8;
    public ImageView N;
    public LinearLayout N0;
    public LinearLayout N1;
    public LinearLayout N2;
    public boolean N3;
    public boolean N4;
    public boolean N5;
    public int N6;
    public int N7;
    public String N8;
    public ImageView O;
    public TextView O0;
    public RelativeLayout O1;
    public LinearLayout O2;
    public boolean O3;
    public boolean O4;
    public boolean O5;
    public int O6;
    public int O7;
    public String O8;
    public ImageView P;
    public TextView P0;
    public RelativeLayout P1;
    public LinearLayout P2;
    public boolean P3;
    public boolean P4;
    public boolean P5;
    public int P6;
    public int P7;
    public int P8;
    public ImageView Q;
    public ImageView Q0;
    public RelativeLayout Q1;
    public LinearLayout Q2;
    public boolean Q3;
    public boolean Q5;
    public int Q6;
    public int Q7;
    public int Q8;
    public ImageView R;
    public ImageView R0;
    public RelativeLayout R1;
    public LinearLayout R2;
    public boolean R3;
    public boolean R5;
    public int R6;
    public int R7;
    public int R8;
    public ImageView S;
    public boolean S0;
    public RelativeLayout S1;
    public LinearLayout S2;
    public boolean S3;
    public boolean S4;
    public boolean S5;
    public int S6;
    public int S7;
    public int S8;
    public ImageView T;
    public boolean T0;
    public RelativeLayout T1;
    public LinearLayout T2;
    public boolean T3;
    public boolean T4;
    public boolean T5;
    public int T6;
    public int T7;
    public SP T8;
    public ImageView U;
    public boolean U1;
    public LinearLayout U2;
    public boolean U3;
    public boolean U4;
    public int U5;
    public int U6;
    public int U7;
    public HelperClass U8;
    public ImageView V;
    public boolean V1;
    public LinearLayout V2;
    public boolean V3;
    public boolean V4;
    public int V5;
    public int V6;
    public int V7;
    public LinearLayout V8;
    public ImageView W;
    public boolean W0;
    public boolean W1;
    public LinearLayout W2;
    public boolean W3;
    public boolean W4;
    public int W5;
    public int W6;
    public int W7;
    public LinearLayout W8;
    public ImageView X;
    public boolean X0;
    public LinearLayout X2;
    public boolean X3;
    public boolean X4;
    public int X5;
    public int X6;
    public int X7;
    public LinearLayout X8;
    public ImageView Y;
    public boolean Y0;
    public boolean Y1;
    public LinearLayout Y2;
    public boolean Y3;
    public boolean Y4;
    public int Y5;
    public int Y6;
    public int Y7;
    public LinearLayout Y8;
    public ImageView Z;
    public boolean Z1;
    public RelativeLayout Z2;
    public boolean Z3;
    public boolean Z4;
    public int Z5;
    public int Z6;
    public int Z7;
    public LinearLayout Z8;
    public ImageView a0;
    public boolean a1;
    public boolean a2;
    public LinearLayout a3;
    public boolean a4;
    public boolean a5;
    public int a6;
    public int a7;
    public int a8;
    public LinearLayout a9;
    public ImageView b0;
    public boolean b1;
    public boolean b2;
    public LinearLayout b3;
    public boolean b4;
    public boolean b5;
    public int b6;
    public int b7;
    public int b8;
    public Admob b9;
    public ImageView c0;
    public boolean c1;
    public boolean c2;
    public LinearLayout c3;
    public boolean c4;
    public boolean c5;
    public int c6;
    public int c7;
    public int c8;
    public TextView c9;
    public ImageView d0;
    public boolean d1;
    public int d2;
    public LinearLayout d3;
    public boolean d5;
    public int d6;
    public int d7;
    public int d8;
    public RelativeLayout d9;
    public ImageView e0;
    public boolean e1;
    public int e2;
    public LinearLayout e3;
    public boolean e5;
    public int e6;
    public int e7;
    public int e8;
    public ImageView f0;
    public boolean f1;
    public int f2;
    public LinearLayout f3;
    public boolean f4;
    public boolean f5;
    public int f6;
    public int f7;
    public int f8;
    public TextView f9;
    public ImageView g0;
    public boolean g1;
    public int g2;
    public LinearLayout g3;
    public boolean g4;
    public boolean g5;
    public int g6;
    public int g7;
    public int g8;
    public TextView g9;
    public ImageView h0;
    public boolean h1;
    public int h2;
    public LinearLayout h3;
    public boolean h4;
    public int h5;
    public int h6;
    public int h7;
    public float h8;
    public TextView h9;
    public ImageView i0;
    public boolean i1;
    public int i2;
    public LinearLayout i3;
    public boolean i4;
    public int i5;
    public int i6;
    public int i7;
    public int i8;
    public TextView i9;
    public ImageView j0;
    public int j1;
    public String j2;
    public LinearLayout j3;
    public boolean j4;
    public int j5;
    public int j6;
    public int j7;
    public String j8;
    public TextView j9;
    public ImageView k0;
    public int k1;
    public String k2;
    public LinearLayout k3;
    public boolean k4;
    public int k5;
    public int k6;
    public int k7;
    public String k8;
    public TextView k9;
    public ImageView l0;
    public int l1;
    public String l2;
    public LinearLayout l3;
    public boolean l4;
    public int l5;
    public int l6;
    public int l7;
    public String l8;
    public TextView m0;
    public int m1;
    public String m2;
    public LinearLayout m3;
    public boolean m4;
    public int m5;
    public int m6;
    public int m7;
    public String m8;
    public ImageView m9;
    public TextView n0;
    public int n1;
    public String n2;
    public LinearLayout n3;
    public boolean n4;
    public boolean n5;
    public int n6;
    public int n7;
    public String n8;
    public TextView o0;
    public int o1;
    public int o2;
    public LinearLayout o3;
    public boolean o4;
    public boolean o5;
    public int o6;
    public int o7;
    public String o8;
    public kx0 o9;
    public TextView p0;
    public int p1;
    public int p2;
    public LinearLayout p3;
    public boolean p4;
    public boolean p5;
    public int p6;
    public int p7;
    public String p8;
    public TextView q0;
    public int q1;
    public TextView q2;
    public LinearLayout q3;
    public boolean q4;
    public boolean q5;
    public int q6;
    public int q7;
    public String q8;
    public MaterialCardView q9;
    public TextView r0;
    public int r1;
    public TextView r2;
    public LinearLayout r3;
    public boolean r4;
    public boolean r5;
    public int r6;
    public int r7;
    public TypedArray r8;
    public FrameLayout r9;
    public TextView s0;
    public int s1;
    public TextView s2;
    public LinearLayout s3;
    public boolean s4;
    public boolean s5;
    public int s6;
    public int s7;
    public boolean s8;
    public TextView t0;
    public int t1;
    public TextView t2;
    public LinearLayout t3;
    public boolean t4;
    public boolean t5;
    public int t6;
    public int t7;
    public boolean t8;
    public TextView u0;
    public String u1;
    public TextView u2;
    public LinearLayout u3;
    public boolean u4;
    public boolean u5;
    public int u6;
    public int u7;
    public boolean u8;
    public TextView v0;
    public String v1;
    public TextView v2;
    public LinearLayout v3;
    public boolean v4;
    public boolean v5;
    public int v6;
    public int v7;
    public String v8;
    public TextView w0;
    public String w1;
    public TextView w2;
    public LinearLayout w3;
    public boolean w4;
    public boolean w5;
    public int w6;
    public String w7;
    public TextView x0;
    public String x1;
    public TextView x2;
    public LinearLayout x3;
    public boolean x5;
    public int x6;
    public String x7;
    public String x8;
    public TextView y0;
    public String y1;
    public TextView y2;
    public LinearLayout y3;
    public boolean y5;
    public int y6;
    public String y7;
    public String y8;
    public TextView z0;
    public String z1;
    public TextView z2;
    public LinearLayout z3;
    public boolean z4;
    public boolean z5;
    public int z6;
    public String z7;
    public String z8;
    public final boolean U0 = true;
    public final boolean V0 = true;
    public final boolean Z0 = true;
    public boolean X1 = true;
    public final boolean J3 = true;
    public final boolean K3 = true;
    public final boolean d4 = true;
    public final boolean e4 = true;
    public final boolean x4 = true;
    public final boolean y4 = true;
    public final boolean Q4 = true;
    public final boolean R4 = true;
    public int w8 = 0;
    public mo1 e9 = null;
    public boolean l9 = false;
    public final Handler n9 = new Handler();
    public float p9 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;

    public static String s(int i, String str) {
        return "<font color=" + i + ">" + str + "</font>";
    }

    public static String t(int i) {
        String displayName = Calendar.getInstance().getTimeZone().getDisplayName(false, 1);
        Date time = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime();
        String str = new SimpleDateFormat("Z").format(time);
        String str2 = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(time);
        switch (i) {
            case 1:
                return str;
            case 2:
                return eo7.w("UTC ", str);
            case 3:
                return eo7.w("GMT ", str);
            case 4:
                return str2;
            case 5:
                return eo7.w("UTC ", str2);
            case 6:
                return eo7.w("GMT ", str2);
            case 7:
                return displayName;
            default:
                return VCKtvKCuFgEI.ecNTZrgIQ;
        }
    }

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
        nativeAdView.b(l12Var, null);
    }

    public final void A() {
        String str = this.y8;
        str.getClass();
        switch (str) {
            case "satellite":
                this.H.setImageResource(R.drawable.maptype_satellite);
                this.P.setImageResource(R.drawable.maptype_satellite);
                break;
            case "terrain":
                this.H.setImageResource(R.drawable.maptype_terrain);
                this.P.setImageResource(R.drawable.maptype_terrain);
                break;
            case "hybrid":
                this.H.setImageResource(R.drawable.maptype_hybrid);
                this.P.setImageResource(R.drawable.maptype_hybrid);
                break;
            case "roadmap":
                this.H.setImageResource(R.drawable.maptype_normal);
                this.P.setImageResource(R.drawable.maptype_normal);
                break;
        }
    }

    public final void B() {
        String str = this.y1;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1579103941:
                if (str.equals(Default.SETELLITE_2)) {
                    b = 0;
                }
                break;
            case -1423437003:
                if (str.equals(Default.TERRAIN_3)) {
                    b = 1;
                }
                break;
            case -1202757124:
                if (str.equals(NKqVA.FdeRFTBbfTP)) {
                    b = 2;
                }
                break;
            case 1366708796:
                if (str.equals(Default.NORMAL_1)) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
                this.A0.setImageResource(R.drawable.maptype_satellite);
                break;
            case 1:
                this.A0.setImageResource(R.drawable.maptype_terrain);
                break;
            case 2:
                this.A0.setImageResource(R.drawable.maptype_hybrid);
                break;
            case 3:
                this.A0.setImageResource(R.drawable.maptype_normal);
                break;
        }
    }

    public final void C() {
        String str = this.D8;
        str.getClass();
        switch (str) {
            case "satellite":
                this.Q.setImageResource(R.drawable.maptype_satellite);
                break;
            case "terrain":
                this.Q.setImageResource(R.drawable.maptype_terrain);
                break;
            case "hybrid":
                this.Q.setImageResource(R.drawable.maptype_hybrid);
                break;
            case "roadmap":
                this.Q.setImageResource(R.drawable.maptype_normal);
                break;
        }
    }

    public final void D() {
        String str = this.M8;
        str.getClass();
        switch (str) {
            case "satellite":
                this.d0.setImageResource(R.drawable.maptype_satellite);
                this.l0.setImageResource(R.drawable.maptype_satellite);
                break;
            case "terrain":
                this.d0.setImageResource(R.drawable.maptype_terrain);
                this.l0.setImageResource(R.drawable.maptype_terrain);
                break;
            case "hybrid":
                this.d0.setImageResource(R.drawable.maptype_hybrid);
                this.l0.setImageResource(R.drawable.maptype_hybrid);
                break;
            case "roadmap":
                this.d0.setImageResource(R.drawable.maptype_normal);
                this.l0.setImageResource(R.drawable.maptype_normal);
                break;
        }
    }

    public final void E() {
        String str = this.I8;
        str.getClass();
        switch (str) {
            case "satellite":
                this.U.setImageResource(R.drawable.maptype_satellite);
                this.c0.setImageResource(R.drawable.maptype_satellite);
                break;
            case "terrain":
                this.U.setImageResource(R.drawable.maptype_terrain);
                this.c0.setImageResource(R.drawable.maptype_terrain);
                break;
            case "hybrid":
                this.U.setImageResource(R.drawable.maptype_hybrid);
                this.c0.setImageResource(R.drawable.maptype_hybrid);
                break;
            case "roadmap":
                this.U.setImageResource(R.drawable.maptype_normal);
                this.c0.setImageResource(R.drawable.maptype_normal);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0927  */
    /* JADX WARN: Code duplicated, block: B:103:0x092d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0933  */
    /* JADX WARN: Code duplicated, block: B:108:0x0937  */
    /* JADX WARN: Code duplicated, block: B:111:0x093d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0943  */
    /* JADX WARN: Code duplicated, block: B:117:0x0949  */
    /* JADX WARN: Code duplicated, block: B:120:0x094f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0955  */
    /* JADX WARN: Code duplicated, block: B:126:0x095c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0962  */
    /* JADX WARN: Code duplicated, block: B:129:0x097a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0982  */
    /* JADX WARN: Code duplicated, block: B:132:0x0998  */
    /* JADX WARN: Code duplicated, block: B:134:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:136:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:138:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:141:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:142:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:144:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:148:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:168:0x0b30  */
    /* JADX WARN: Code duplicated, block: B:171:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:173:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0b42  */
    /* JADX WARN: Code duplicated, block: B:176:0x0b5c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:179:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:182:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:183:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:185:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:186:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:188:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:189:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:191:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:192:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:195:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0c3f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0c45  */
    /* JADX WARN: Code duplicated, block: B:200:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:203:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:205:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0ca3  */
    /* JADX WARN: Code duplicated, block: B:207:0x0cbb  */
    /* JADX WARN: Code duplicated, block: B:209:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:210:0x0cdb  */
    /* JADX WARN: Code duplicated, block: B:212:0x0ce3  */
    /* JADX WARN: Code duplicated, block: B:213:0x0cfd  */
    /* JADX WARN: Code duplicated, block: B:215:0x0d07  */
    /* JADX WARN: Code duplicated, block: B:216:0x0d1f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0d37  */
    /* JADX WARN: Code duplicated, block: B:219:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0d3e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:224:0x0d5e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0d66  */
    /* JADX WARN: Code duplicated, block: B:227:0x0d82  */
    /* JADX WARN: Code duplicated, block: B:229:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0da6  */
    /* JADX WARN: Code duplicated, block: B:231:0x0dc0  */
    /* JADX WARN: Code duplicated, block: B:233:0x0dcc  */
    /* JADX WARN: Code duplicated, block: B:234:0x0de6  */
    /* JADX WARN: Code duplicated, block: B:236:0x0dee  */
    /* JADX WARN: Code duplicated, block: B:237:0x0e08  */
    /* JADX WARN: Code duplicated, block: B:239:0x0e12  */
    /* JADX WARN: Code duplicated, block: B:240:0x0e2a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0e44  */
    /* JADX WARN: Code duplicated, block: B:243:0x0e4f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0e53  */
    /* JADX WARN: Code duplicated, block: B:247:0x0e59  */
    /* JADX WARN: Code duplicated, block: B:248:0x0e73  */
    /* JADX WARN: Code duplicated, block: B:250:0x0e7b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0e95  */
    /* JADX WARN: Code duplicated, block: B:253:0x0e9f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0eb7  */
    /* JADX WARN: Code duplicated, block: B:255:0x0ecf  */
    /* JADX WARN: Code duplicated, block: B:257:0x0ed5  */
    /* JADX WARN: Code duplicated, block: B:258:0x0eef  */
    /* JADX WARN: Code duplicated, block: B:260:0x0ef7  */
    /* JADX WARN: Code duplicated, block: B:261:0x0f11  */
    /* JADX WARN: Code duplicated, block: B:263:0x0f1b  */
    /* JADX WARN: Code duplicated, block: B:264:0x0f33  */
    /* JADX WARN: Code duplicated, block: B:265:0x0f4b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0f4e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0f52  */
    /* JADX WARN: Code duplicated, block: B:271:0x0f58  */
    /* JADX WARN: Code duplicated, block: B:272:0x0f72  */
    /* JADX WARN: Code duplicated, block: B:274:0x0f7a  */
    /* JADX WARN: Code duplicated, block: B:275:0x0f94  */
    /* JADX WARN: Code duplicated, block: B:277:0x0f9e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0fb6  */
    /* JADX WARN: Code duplicated, block: B:279:0x0fce  */
    /* JADX WARN: Code duplicated, block: B:281:0x0fd4  */
    /* JADX WARN: Code duplicated, block: B:282:0x0fee  */
    /* JADX WARN: Code duplicated, block: B:284:0x0ff6  */
    /* JADX WARN: Code duplicated, block: B:285:0x1010  */
    /* JADX WARN: Code duplicated, block: B:287:0x101a  */
    /* JADX WARN: Code duplicated, block: B:288:0x1032  */
    /* JADX WARN: Code duplicated, block: B:289:0x104a  */
    /* JADX WARN: Code duplicated, block: B:291:0x104d  */
    /* JADX WARN: Code duplicated, block: B:293:0x1051  */
    /* JADX WARN: Code duplicated, block: B:295:0x1057  */
    /* JADX WARN: Code duplicated, block: B:296:0x1073  */
    /* JADX WARN: Code duplicated, block: B:298:0x107b  */
    /* JADX WARN: Code duplicated, block: B:299:0x1095  */
    /* JADX WARN: Code duplicated, block: B:301:0x109f  */
    /* JADX WARN: Code duplicated, block: B:302:0x10b7  */
    /* JADX WARN: Code duplicated, block: B:303:0x10cf  */
    /* JADX WARN: Code duplicated, block: B:305:0x10d5  */
    /* JADX WARN: Code duplicated, block: B:306:0x10ef  */
    /* JADX WARN: Code duplicated, block: B:308:0x10f7  */
    /* JADX WARN: Code duplicated, block: B:309:0x1111  */
    /* JADX WARN: Code duplicated, block: B:311:0x111b  */
    /* JADX WARN: Code duplicated, block: B:312:0x1133  */
    /* JADX WARN: Code duplicated, block: B:313:0x114b  */
    /* JADX WARN: Code duplicated, block: B:315:0x1150  */
    /* JADX WARN: Code duplicated, block: B:317:0x1154  */
    /* JADX WARN: Code duplicated, block: B:319:0x115a  */
    /* JADX WARN: Code duplicated, block: B:320:0x1176  */
    /* JADX WARN: Code duplicated, block: B:322:0x117e  */
    /* JADX WARN: Code duplicated, block: B:323:0x1198  */
    /* JADX WARN: Code duplicated, block: B:325:0x11a2  */
    /* JADX WARN: Code duplicated, block: B:326:0x11ba  */
    /* JADX WARN: Code duplicated, block: B:327:0x11d2  */
    /* JADX WARN: Code duplicated, block: B:329:0x11d8  */
    /* JADX WARN: Code duplicated, block: B:330:0x11f2  */
    /* JADX WARN: Code duplicated, block: B:332:0x11fa  */
    /* JADX WARN: Code duplicated, block: B:333:0x1214  */
    /* JADX WARN: Code duplicated, block: B:335:0x121e  */
    /* JADX WARN: Code duplicated, block: B:336:0x1236  */
    /* JADX WARN: Code duplicated, block: B:337:0x124e  */
    /* JADX WARN: Code duplicated, block: B:339:0x1254  */
    /* JADX WARN: Code duplicated, block: B:341:0x1258  */
    /* JADX WARN: Code duplicated, block: B:343:0x125e  */
    /* JADX WARN: Code duplicated, block: B:344:0x127a  */
    /* JADX WARN: Code duplicated, block: B:346:0x1282  */
    /* JADX WARN: Code duplicated, block: B:347:0x129c  */
    /* JADX WARN: Code duplicated, block: B:349:0x12a6  */
    /* JADX WARN: Code duplicated, block: B:350:0x12be  */
    /* JADX WARN: Code duplicated, block: B:351:0x12d6  */
    /* JADX WARN: Code duplicated, block: B:353:0x12dc  */
    /* JADX WARN: Code duplicated, block: B:354:0x12f6  */
    /* JADX WARN: Code duplicated, block: B:356:0x12fe  */
    /* JADX WARN: Code duplicated, block: B:357:0x1318  */
    /* JADX WARN: Code duplicated, block: B:359:0x1322  */
    /* JADX WARN: Code duplicated, block: B:360:0x133a  */
    /* JADX WARN: Code duplicated, block: B:361:0x1352  */
    /* JADX WARN: Code duplicated, block: B:363:0x1358  */
    /* JADX WARN: Code duplicated, block: B:365:0x135c  */
    /* JADX WARN: Code duplicated, block: B:367:0x1362  */
    /* JADX WARN: Code duplicated, block: B:368:0x137e  */
    /* JADX WARN: Code duplicated, block: B:370:0x1386  */
    /* JADX WARN: Code duplicated, block: B:371:0x13a2  */
    /* JADX WARN: Code duplicated, block: B:373:0x13ac  */
    /* JADX WARN: Code duplicated, block: B:374:0x13c6  */
    /* JADX WARN: Code duplicated, block: B:375:0x13de  */
    /* JADX WARN: Code duplicated, block: B:377:0x13e8  */
    /* JADX WARN: Code duplicated, block: B:378:0x1402  */
    /* JADX WARN: Code duplicated, block: B:380:0x140a  */
    /* JADX WARN: Code duplicated, block: B:381:0x1424  */
    /* JADX WARN: Code duplicated, block: B:383:0x142e  */
    /* JADX WARN: Code duplicated, block: B:384:0x1446  */
    /* JADX WARN: Code duplicated, block: B:385:0x145e  */
    /* JADX WARN: Code duplicated, block: B:387:0x146a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:388:0x146c  */
    /* JADX WARN: Code duplicated, block: B:390:0x1472  */
    /* JADX WARN: Code duplicated, block: B:391:0x148c  */
    /* JADX WARN: Code duplicated, block: B:393:0x1494  */
    /* JADX WARN: Code duplicated, block: B:394:0x14ae  */
    /* JADX WARN: Code duplicated, block: B:396:0x14b8  */
    /* JADX WARN: Code duplicated, block: B:397:0x14d0  */
    /* JADX WARN: Code duplicated, block: B:398:0x14e8  */
    /* JADX WARN: Code duplicated, block: B:400:0x14ee  */
    /* JADX WARN: Code duplicated, block: B:401:0x1508  */
    /* JADX WARN: Code duplicated, block: B:403:0x1510  */
    /* JADX WARN: Code duplicated, block: B:404:0x152a  */
    /* JADX WARN: Code duplicated, block: B:406:0x1534  */
    /* JADX WARN: Code duplicated, block: B:407:0x154c  */
    /* JADX WARN: Code duplicated, block: B:408:0x1564 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x1566  */
    /* JADX WARN: Code duplicated, block: B:411:0x156c  */
    /* JADX WARN: Code duplicated, block: B:412:0x1588  */
    /* JADX WARN: Code duplicated, block: B:414:0x1590  */
    /* JADX WARN: Code duplicated, block: B:415:0x15aa  */
    /* JADX WARN: Code duplicated, block: B:417:0x15b4  */
    /* JADX WARN: Code duplicated, block: B:418:0x15cc  */
    /* JADX WARN: Code duplicated, block: B:419:0x15e4  */
    /* JADX WARN: Code duplicated, block: B:421:0x15ea  */
    /* JADX WARN: Code duplicated, block: B:422:0x1604  */
    /* JADX WARN: Code duplicated, block: B:424:0x160c  */
    /* JADX WARN: Code duplicated, block: B:425:0x1626  */
    /* JADX WARN: Code duplicated, block: B:427:0x1630  */
    /* JADX WARN: Code duplicated, block: B:428:0x1648  */
    /* JADX WARN: Code duplicated, block: B:429:0x1660  */
    /* JADX WARN: Code duplicated, block: B:431:0x1671  */
    /* JADX WARN: Code duplicated, block: B:432:0x1674  */
    /* JADX WARN: Code duplicated, block: B:434:0x1678  */
    /* JADX WARN: Code duplicated, block: B:437:0x167e  */
    /* JADX WARN: Code duplicated, block: B:440:0x1684  */
    /* JADX WARN: Code duplicated, block: B:442:0x1688  */
    /* JADX WARN: Code duplicated, block: B:445:0x168e  */
    /* JADX WARN: Code duplicated, block: B:448:0x1694  */
    /* JADX WARN: Code duplicated, block: B:451:0x169a  */
    /* JADX WARN: Code duplicated, block: B:454:0x16a0  */
    /* JADX WARN: Code duplicated, block: B:457:0x16a6  */
    /* JADX WARN: Code duplicated, block: B:460:0x16ad  */
    /* JADX WARN: Code duplicated, block: B:462:0x16b3  */
    /* JADX WARN: Code duplicated, block: B:463:0x16cc  */
    /* JADX WARN: Code duplicated, block: B:465:0x16d5  */
    /* JADX WARN: Code duplicated, block: B:466:0x16ec  */
    /* JADX WARN: Code duplicated, block: B:468:0x16f6  */
    /* JADX WARN: Code duplicated, block: B:469:0x170b  */
    /* JADX WARN: Code duplicated, block: B:470:0x1720  */
    /* JADX WARN: Code duplicated, block: B:472:0x1727  */
    /* JADX WARN: Code duplicated, block: B:473:0x173e  */
    /* JADX WARN: Code duplicated, block: B:475:0x1746  */
    /* JADX WARN: Code duplicated, block: B:476:0x175d  */
    /* JADX WARN: Code duplicated, block: B:478:0x1767  */
    /* JADX WARN: Code duplicated, block: B:479:0x177c  */
    /* JADX WARN: Code duplicated, block: B:482:0x1833  */
    /* JADX WARN: Code duplicated, block: B:500:0x1857  */
    /* JADX WARN: Code duplicated, block: B:503:0x185d  */
    /* JADX WARN: Code duplicated, block: B:505:0x1861  */
    /* JADX WARN: Code duplicated, block: B:507:0x1867  */
    /* JADX WARN: Code duplicated, block: B:508:0x1881  */
    /* JADX WARN: Code duplicated, block: B:510:0x1889  */
    /* JADX WARN: Code duplicated, block: B:511:0x18a3  */
    /* JADX WARN: Code duplicated, block: B:513:0x18ad  */
    /* JADX WARN: Code duplicated, block: B:514:0x18c5  */
    /* JADX WARN: Code duplicated, block: B:515:0x18dd  */
    /* JADX WARN: Code duplicated, block: B:517:0x18e3  */
    /* JADX WARN: Code duplicated, block: B:518:0x18fd  */
    /* JADX WARN: Code duplicated, block: B:520:0x1905  */
    /* JADX WARN: Code duplicated, block: B:521:0x191f  */
    /* JADX WARN: Code duplicated, block: B:523:0x1929  */
    /* JADX WARN: Code duplicated, block: B:524:0x1941  */
    /* JADX WARN: Code duplicated, block: B:525:0x1959  */
    /* JADX WARN: Code duplicated, block: B:527:0x195c  */
    /* JADX WARN: Code duplicated, block: B:529:0x1960  */
    /* JADX WARN: Code duplicated, block: B:531:0x1966  */
    /* JADX WARN: Code duplicated, block: B:532:0x1980  */
    /* JADX WARN: Code duplicated, block: B:534:0x1988  */
    /* JADX WARN: Code duplicated, block: B:535:0x19a2  */
    /* JADX WARN: Code duplicated, block: B:537:0x19ac  */
    /* JADX WARN: Code duplicated, block: B:538:0x19c4  */
    /* JADX WARN: Code duplicated, block: B:539:0x19dc  */
    /* JADX WARN: Code duplicated, block: B:541:0x19e2  */
    /* JADX WARN: Code duplicated, block: B:542:0x19fc  */
    /* JADX WARN: Code duplicated, block: B:544:0x1a04  */
    /* JADX WARN: Code duplicated, block: B:545:0x1a1e  */
    /* JADX WARN: Code duplicated, block: B:547:0x1a28  */
    /* JADX WARN: Code duplicated, block: B:548:0x1a40  */
    /* JADX WARN: Code duplicated, block: B:549:0x1a58  */
    /* JADX WARN: Code duplicated, block: B:551:0x1a5b  */
    /* JADX WARN: Code duplicated, block: B:553:0x1a5f  */
    /* JADX WARN: Code duplicated, block: B:555:0x1a65  */
    /* JADX WARN: Code duplicated, block: B:556:0x1a81  */
    /* JADX WARN: Code duplicated, block: B:558:0x1a89  */
    /* JADX WARN: Code duplicated, block: B:559:0x1aa5  */
    /* JADX WARN: Code duplicated, block: B:561:0x1aaf  */
    /* JADX WARN: Code duplicated, block: B:562:0x1ac9  */
    /* JADX WARN: Code duplicated, block: B:563:0x1ae3  */
    /* JADX WARN: Code duplicated, block: B:565:0x1aef  */
    /* JADX WARN: Code duplicated, block: B:566:0x1b09  */
    /* JADX WARN: Code duplicated, block: B:568:0x1b11  */
    /* JADX WARN: Code duplicated, block: B:569:0x1b2b  */
    /* JADX WARN: Code duplicated, block: B:571:0x1b35  */
    /* JADX WARN: Code duplicated, block: B:572:0x1b4d  */
    /* JADX WARN: Code duplicated, block: B:573:0x1b67  */
    /* JADX WARN: Code duplicated, block: B:575:0x1b74  */
    /* JADX WARN: Code duplicated, block: B:577:0x1b78  */
    /* JADX WARN: Code duplicated, block: B:579:0x1b7e  */
    /* JADX WARN: Code duplicated, block: B:580:0x1b98  */
    /* JADX WARN: Code duplicated, block: B:582:0x1ba0  */
    /* JADX WARN: Code duplicated, block: B:583:0x1bba  */
    /* JADX WARN: Code duplicated, block: B:585:0x1bc4  */
    /* JADX WARN: Code duplicated, block: B:586:0x1bdc  */
    /* JADX WARN: Code duplicated, block: B:587:0x1bf4  */
    /* JADX WARN: Code duplicated, block: B:589:0x1bfa  */
    /* JADX WARN: Code duplicated, block: B:590:0x1c14  */
    /* JADX WARN: Code duplicated, block: B:592:0x1c1c  */
    /* JADX WARN: Code duplicated, block: B:593:0x1c36  */
    /* JADX WARN: Code duplicated, block: B:595:0x1c40  */
    /* JADX WARN: Code duplicated, block: B:596:0x1c58  */
    /* JADX WARN: Code duplicated, block: B:597:0x1c70  */
    /* JADX WARN: Code duplicated, block: B:599:0x1c73  */
    /* JADX WARN: Code duplicated, block: B:601:0x1c77  */
    /* JADX WARN: Code duplicated, block: B:603:0x1c7d  */
    /* JADX WARN: Code duplicated, block: B:604:0x1c97  */
    /* JADX WARN: Code duplicated, block: B:606:0x1c9f  */
    /* JADX WARN: Code duplicated, block: B:607:0x1cb9  */
    /* JADX WARN: Code duplicated, block: B:609:0x1cc3  */
    /* JADX WARN: Code duplicated, block: B:610:0x1cdb  */
    /* JADX WARN: Code duplicated, block: B:611:0x1cf3  */
    /* JADX WARN: Code duplicated, block: B:613:0x1cf9  */
    /* JADX WARN: Code duplicated, block: B:614:0x1d13  */
    /* JADX WARN: Code duplicated, block: B:616:0x1d1b  */
    /* JADX WARN: Code duplicated, block: B:617:0x1d35  */
    /* JADX WARN: Code duplicated, block: B:619:0x1d3f  */
    /* JADX WARN: Code duplicated, block: B:620:0x1d57  */
    /* JADX WARN: Code duplicated, block: B:621:0x1d6f  */
    /* JADX WARN: Code duplicated, block: B:623:0x1d72  */
    /* JADX WARN: Code duplicated, block: B:625:0x1d76  */
    /* JADX WARN: Code duplicated, block: B:627:0x1d7c  */
    /* JADX WARN: Code duplicated, block: B:628:0x1d98  */
    /* JADX WARN: Code duplicated, block: B:630:0x1da0  */
    /* JADX WARN: Code duplicated, block: B:631:0x1dba  */
    /* JADX WARN: Code duplicated, block: B:633:0x1dc4  */
    /* JADX WARN: Code duplicated, block: B:634:0x1ddc  */
    /* JADX WARN: Code duplicated, block: B:635:0x1df4  */
    /* JADX WARN: Code duplicated, block: B:637:0x1dfa  */
    /* JADX WARN: Code duplicated, block: B:638:0x1e14  */
    /* JADX WARN: Code duplicated, block: B:63:0x051e  */
    /* JADX WARN: Code duplicated, block: B:640:0x1e1c  */
    /* JADX WARN: Code duplicated, block: B:641:0x1e36  */
    /* JADX WARN: Code duplicated, block: B:643:0x1e40  */
    /* JADX WARN: Code duplicated, block: B:644:0x1e58  */
    /* JADX WARN: Code duplicated, block: B:645:0x1e70  */
    /* JADX WARN: Code duplicated, block: B:647:0x1e75  */
    /* JADX WARN: Code duplicated, block: B:649:0x1e79  */
    /* JADX WARN: Code duplicated, block: B:64:0x0592  */
    /* JADX WARN: Code duplicated, block: B:651:0x1e7f  */
    /* JADX WARN: Code duplicated, block: B:652:0x1e99  */
    /* JADX WARN: Code duplicated, block: B:654:0x1ea1  */
    /* JADX WARN: Code duplicated, block: B:655:0x1ebb  */
    /* JADX WARN: Code duplicated, block: B:657:0x1ec5  */
    /* JADX WARN: Code duplicated, block: B:658:0x1edd  */
    /* JADX WARN: Code duplicated, block: B:659:0x1ef5  */
    /* JADX WARN: Code duplicated, block: B:661:0x1efb  */
    /* JADX WARN: Code duplicated, block: B:662:0x1f15  */
    /* JADX WARN: Code duplicated, block: B:664:0x1f1d  */
    /* JADX WARN: Code duplicated, block: B:665:0x1f37  */
    /* JADX WARN: Code duplicated, block: B:667:0x1f41  */
    /* JADX WARN: Code duplicated, block: B:668:0x1f59  */
    /* JADX WARN: Code duplicated, block: B:669:0x1f71  */
    /* JADX WARN: Code duplicated, block: B:671:0x1f75  */
    /* JADX WARN: Code duplicated, block: B:673:0x1f79  */
    /* JADX WARN: Code duplicated, block: B:675:0x1f7f  */
    /* JADX WARN: Code duplicated, block: B:676:0x1f99  */
    /* JADX WARN: Code duplicated, block: B:678:0x1fa1  */
    /* JADX WARN: Code duplicated, block: B:679:0x1fbb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0598  */
    /* JADX WARN: Code duplicated, block: B:681:0x1fc5  */
    /* JADX WARN: Code duplicated, block: B:682:0x1fdd  */
    /* JADX WARN: Code duplicated, block: B:683:0x1ff5  */
    /* JADX WARN: Code duplicated, block: B:685:0x1ffb  */
    /* JADX WARN: Code duplicated, block: B:686:0x2015  */
    /* JADX WARN: Code duplicated, block: B:688:0x201d  */
    /* JADX WARN: Code duplicated, block: B:689:0x2037  */
    /* JADX WARN: Code duplicated, block: B:691:0x2041  */
    /* JADX WARN: Code duplicated, block: B:692:0x2059  */
    /* JADX WARN: Code duplicated, block: B:693:0x2071  */
    /* JADX WARN: Code duplicated, block: B:695:0x2075  */
    /* JADX WARN: Code duplicated, block: B:697:0x2079  */
    /* JADX WARN: Code duplicated, block: B:699:0x207f  */
    /* JADX WARN: Code duplicated, block: B:69:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:700:0x209b  */
    /* JADX WARN: Code duplicated, block: B:702:0x20a3  */
    /* JADX WARN: Code duplicated, block: B:703:0x20bf  */
    /* JADX WARN: Code duplicated, block: B:705:0x20c9  */
    /* JADX WARN: Code duplicated, block: B:706:0x20e3  */
    /* JADX WARN: Code duplicated, block: B:707:0x20fb  */
    /* JADX WARN: Code duplicated, block: B:709:0x2105  */
    /* JADX WARN: Code duplicated, block: B:70:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:710:0x211f  */
    /* JADX WARN: Code duplicated, block: B:712:0x2127  */
    /* JADX WARN: Code duplicated, block: B:713:0x2141  */
    /* JADX WARN: Code duplicated, block: B:715:0x214b  */
    /* JADX WARN: Code duplicated, block: B:716:0x2163  */
    /* JADX WARN: Code duplicated, block: B:717:0x217b  */
    /* JADX WARN: Code duplicated, block: B:719:0x2187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:720:0x2189  */
    /* JADX WARN: Code duplicated, block: B:722:0x218f  */
    /* JADX WARN: Code duplicated, block: B:723:0x21a9  */
    /* JADX WARN: Code duplicated, block: B:725:0x21b1  */
    /* JADX WARN: Code duplicated, block: B:726:0x21cb  */
    /* JADX WARN: Code duplicated, block: B:728:0x21d5  */
    /* JADX WARN: Code duplicated, block: B:729:0x21ed  */
    /* JADX WARN: Code duplicated, block: B:730:0x2205  */
    /* JADX WARN: Code duplicated, block: B:732:0x220b  */
    /* JADX WARN: Code duplicated, block: B:733:0x2225  */
    /* JADX WARN: Code duplicated, block: B:735:0x222d  */
    /* JADX WARN: Code duplicated, block: B:736:0x2247  */
    /* JADX WARN: Code duplicated, block: B:738:0x2251  */
    /* JADX WARN: Code duplicated, block: B:739:0x2269  */
    /* JADX WARN: Code duplicated, block: B:740:0x2281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:741:0x2283  */
    /* JADX WARN: Code duplicated, block: B:743:0x2289  */
    /* JADX WARN: Code duplicated, block: B:744:0x22a5  */
    /* JADX WARN: Code duplicated, block: B:746:0x22ad  */
    /* JADX WARN: Code duplicated, block: B:747:0x22c7  */
    /* JADX WARN: Code duplicated, block: B:749:0x22d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x062a  */
    /* JADX WARN: Code duplicated, block: B:750:0x22e9  */
    /* JADX WARN: Code duplicated, block: B:751:0x2301  */
    /* JADX WARN: Code duplicated, block: B:753:0x2307  */
    /* JADX WARN: Code duplicated, block: B:754:0x2320  */
    /* JADX WARN: Code duplicated, block: B:756:0x2328  */
    /* JADX WARN: Code duplicated, block: B:757:0x2341  */
    /* JADX WARN: Code duplicated, block: B:759:0x234b  */
    /* JADX WARN: Code duplicated, block: B:760:0x2362  */
    /* JADX WARN: Code duplicated, block: B:763:0x237c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:797:0x23ef  */
    /* JADX WARN: Code duplicated, block: B:799:0x23f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:82:0x071f  */
    /* JADX WARN: Code duplicated, block: B:837:0x2449  */
    /* JADX WARN: Code duplicated, block: B:839:0x2454  */
    /* JADX WARN: Code duplicated, block: B:855:0x247a  */
    /* JADX WARN: Code duplicated, block: B:858:0x2484  */
    /* JADX WARN: Code duplicated, block: B:85:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0820  */
    /* JADX WARN: Code duplicated, block: B:895:0x24d3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0897  */
    /* JADX WARN: Code duplicated, block: B:92:0x0909  */
    /* JADX WARN: Code duplicated, block: B:95:0x091d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0921  */
    /* JADX WARN: Code duplicated, block: B:98:0x0924  */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x071f, please report this as an issue */
    public final void F() {
        float f;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        int i2;
        String str;
        boolean zEquals;
        TextView textView;
        int iDpToPx;
        int iDpToPx2;
        int iDpToPx3;
        int iDpToPx4;
        int iDpToPx5;
        int iDpToPx6;
        int iDpToPx7;
        int iDpToPx8;
        int iDpToPx9;
        int iDpToPx10;
        int iDpToPx11;
        int iDpToPx12;
        int iDpToPx13;
        int iDpToPx14;
        int iDpToPx15;
        int iDpToPx16;
        int iDpToPx17;
        int iDpToPx18;
        int iDpToPx19;
        int iDpToPx20;
        boolean z6;
        String str2;
        boolean zEquals2;
        RelativeLayout relativeLayout;
        boolean zEquals3;
        RelativeLayout relativeLayout2;
        boolean zEquals4;
        RelativeLayout relativeLayout3;
        boolean zEquals5;
        RelativeLayout relativeLayout4;
        String str3;
        boolean zEquals6;
        RelativeLayout relativeLayout5;
        boolean zEquals7;
        RelativeLayout relativeLayout6;
        String str4;
        boolean zEquals8;
        RelativeLayout relativeLayout7;
        boolean zEquals9;
        RelativeLayout relativeLayout8;
        String str5;
        boolean zEquals10;
        RelativeLayout relativeLayout9;
        boolean zEquals11;
        RelativeLayout relativeLayout10;
        String str6;
        boolean zEquals12;
        RelativeLayout relativeLayout11;
        boolean zEquals13;
        RelativeLayout relativeLayout12;
        String str7;
        boolean zEquals14;
        RelativeLayout relativeLayout13;
        boolean zEquals15;
        RelativeLayout relativeLayout14;
        String str8;
        boolean zEquals16;
        RelativeLayout relativeLayout15;
        boolean zEquals17;
        RelativeLayout relativeLayout16;
        String str9;
        boolean zEquals18;
        RelativeLayout relativeLayout17;
        boolean zEquals19;
        RelativeLayout relativeLayout18;
        String str10;
        boolean zEquals20;
        RelativeLayout relativeLayout19;
        boolean zEquals21;
        RelativeLayout relativeLayout20;
        String str11;
        boolean zEquals22;
        RelativeLayout relativeLayout21;
        boolean zEquals23;
        RelativeLayout relativeLayout22;
        boolean zEquals24;
        TextView textView2;
        boolean z7;
        int i3;
        String str12;
        boolean zEquals25;
        TextView textView3;
        int iDpToPx21;
        int iDpToPx22;
        int iDpToPx23;
        int iDpToPx24;
        int iDpToPx25;
        int iDpToPx26;
        int iDpToPx27;
        int iDpToPx28;
        int iDpToPx29;
        int iDpToPx30;
        int iDpToPx31;
        boolean z8;
        int iDpToPx32;
        int iDpToPx33;
        int iDpToPx34;
        int iDpToPx35;
        int iDpToPx36;
        int iDpToPx37;
        int iDpToPx38;
        int iDpToPx39;
        int iDpToPx40;
        int iDpToPx41;
        int iDpToPx42;
        boolean z9;
        String str13;
        boolean zEquals26;
        RelativeLayout relativeLayout23;
        boolean zEquals27;
        RelativeLayout relativeLayout24;
        boolean zEquals28;
        RelativeLayout relativeLayout25;
        boolean zEquals29;
        RelativeLayout relativeLayout26;
        String str14;
        boolean zEquals30;
        RelativeLayout relativeLayout27;
        boolean zEquals31;
        RelativeLayout relativeLayout28;
        String str15;
        boolean zEquals32;
        RelativeLayout relativeLayout29;
        boolean zEquals33;
        RelativeLayout relativeLayout30;
        String str16;
        boolean zEquals34;
        RelativeLayout relativeLayout31;
        boolean zEquals35;
        RelativeLayout relativeLayout32;
        String str17;
        boolean zEquals36;
        RelativeLayout relativeLayout33;
        boolean zEquals37;
        RelativeLayout relativeLayout34;
        String str18;
        boolean zEquals38;
        RelativeLayout relativeLayout35;
        boolean zEquals39;
        RelativeLayout relativeLayout36;
        String str19;
        boolean zEquals40;
        RelativeLayout relativeLayout37;
        boolean zEquals41;
        RelativeLayout relativeLayout38;
        String str20;
        boolean zEquals42;
        RelativeLayout relativeLayout39;
        boolean zEquals43;
        RelativeLayout relativeLayout40;
        String str21;
        boolean zEquals44;
        RelativeLayout relativeLayout41;
        boolean zEquals45;
        RelativeLayout relativeLayout42;
        String str22;
        boolean zEquals46;
        RelativeLayout relativeLayout43;
        boolean zEquals47;
        RelativeLayout relativeLayout44;
        boolean zEquals48;
        TextView textView4;
        TextView textView5;
        boolean zEquals49;
        float f2;
        this.r8 = getResources().obtainTypedArray(R.array.wI);
        this.k5 = this.T8.getInteger(this, SP.BACKGROUND_COLOR_NC, Color.parseColor("#9c000000"));
        this.X5 = this.T8.getInteger(this, SP.ADDRESS_COLOR_NC, -1);
        this.j6 = this.T8.getInteger(this, SP.SHORT_ADDRESS_COLOR_NC, -1);
        this.n6 = this.T8.getInteger(this, SP.DATE_TIME_COLOR_NC, -1);
        this.v6 = this.T8.getInteger(this, SP.LAT_LNG_COLOR_NC, -1);
        this.z6 = this.T8.getInteger(this, SP.PLUS_CODE_COLOR_NC, -1);
        this.D6 = this.T8.getInteger(this, SP.WEATHER_COLOR_NC, -1);
        this.H6 = this.T8.getInteger(this, SP.MAGNETIC_FIELD_COLOR_NC, -1);
        this.L6 = this.T8.getInteger(this, SP.COMPASS_COLOR_NC, -1);
        this.P6 = this.T8.getInteger(this, SP.NOTES_HASHTAG_COLOR_NC, -1);
        this.o7 = this.T8.getInteger(this, SP.AZIMUTH_COLOR_NC, -1);
        this.p7 = this.T8.getInteger(this, SP.AQILEVEL_COLOR_NC, -1);
        this.q7 = this.T8.getInteger(this, SP.ORLABEL_TEXT_COLOR_NC, -1);
        this.r7 = this.T8.getInteger(this, SP.ORLABEL_BG_COLOR_NC, Color.parseColor("#747474"));
        this.b6 = this.T8.getInteger(this, SP.PERSON_NAME_COLOR_NC, -1);
        this.f6 = this.T8.getInteger(this, SP.CONTACT_NUMBER_COLOR_NC, -1);
        this.r6 = this.T8.getInteger(this, SP.SOUNDLEVEL_COLOR_NC, -1);
        this.T6 = this.T8.getInteger(this, SP.WIND_COLOR_NC, -1);
        this.X6 = this.T8.getInteger(this, SP.HUMIDITY_COLOR_NC, -1);
        this.b7 = this.T8.getInteger(this, SP.PRESSURE_COLOR_NC, -1);
        this.T8.getInteger(this, SP.ELEVATION_COLOR_NC, -1);
        this.f7 = this.T8.getInteger(this, SP.ALTITUDE_COLOR_NC, -1);
        this.j7 = this.T8.getInteger(this, SP.ACCURACY_COLOR_NC, -1);
        this.n7 = this.T8.getInteger(this, SP.NUMBERING_COLOR_NC, -1);
        this.M7 = this.T8.getInteger(this, SP.TIMEZONE_NC, 6);
        int i4 = 1;
        this.v7 = this.T8.getInteger(this, SP.SEQUENCE_NC, 1);
        this.D7 = this.T8.getString(this, SP.SUFFIX_NC, "");
        this.z7 = this.T8.getString(this, SP.PREFIX_NC, "");
        this.H7 = this.T8.getString(this, SP.PERSON_NAME_NC, "-");
        this.L7 = this.T8.getString(this, SP.CONTACT_NUMBER_NC, Default.contactNumber);
        this.b4 = this.T8.getBoolean(this, SP.IS_MAP_NC, true);
        this.f4 = this.T8.getBoolean(this, SP.IS_COUNTRY_FLAG_NC, true);
        this.c4 = this.T8.getBoolean(this, SP.IS_ADDRESS_NC, true);
        this.z5 = this.T8.getBoolean(this, SP.IS_ADDRESS_CITY_NC, true);
        this.A5 = this.T8.getBoolean(this, SP.IS_ADDRESS_STATE_NC, true);
        this.C5 = this.T8.getBoolean(this, SP.IS_ADDRESS_PINCODE_NC, true);
        this.B5 = this.T8.getBoolean(this, SP.IS_ADDRESS_COUNTRY_NC, true);
        this.g4 = this.T8.getBoolean(this, SP.IS_PLUS_CODE_NC, false);
        this.t8 = this.T8.getBoolean(this, SP.IS_AQI_LEVEL_NC, false);
        this.u8 = this.T8.getBoolean(this, SP.IS_ORIENTATION_LABEL_NC, true);
        this.s8 = this.T8.getBoolean(this, SP.IS_AZIMUTH_NC, true);
        this.h4 = this.T8.getBoolean(this, SP.IS_WEATHER_NC, false);
        this.i4 = this.T8.getBoolean(this, SP.IS_DATE_TIME_NC, true);
        this.j4 = this.T8.getBoolean(this, SP.IS_TIMEZONE_NC, true);
        this.k4 = this.T8.getBoolean(this, SP.IS_NUMBERING_NC, false);
        this.P5 = this.T8.getBoolean(this, SP.IS_PERSON_NAME_NC, false);
        this.T5 = this.T8.getBoolean(this, SP.IS_CONTACT_NUMBER_NC, false);
        this.L5 = this.T8.getBoolean(this, ZPpqUfsYTcWxP.vtAGntUU, false);
        this.l4 = this.T8.getBoolean(this, SP.IS_MAGNETIC_FIELD_NC, true);
        this.m4 = this.T8.getBoolean(this, SP.IS_COMPASS_NC, true);
        this.n4 = this.T8.getBoolean(this, SP.IS_WIND_NC, false);
        this.o4 = this.T8.getBoolean(this, SP.IS_LOGO_NC, false);
        this.p4 = this.T8.getBoolean(this, SP.IS_NOTES_NC, true);
        this.r4 = this.T8.getBoolean(this, SP.IS_PRESSURE_NC, false);
        this.q4 = this.T8.getBoolean(this, SP.IS_HUMIDITY_NC, false);
        this.s4 = this.T8.getBoolean(this, SP.IS_ELEVATION_NC, false);
        this.t4 = this.T8.getBoolean(this, SP.IS_ALTITUDE_NC, true);
        this.u4 = this.T8.getBoolean(this, SP.IS_ACCURACY_NC, false);
        this.E8 = this.T8.getString(this, SP.LOGO_URI_NC, Default.LOGO_uri);
        this.F8 = this.T8.getString(this, SP.NOTES_HASHTAG_NC, Default.notes);
        this.G8 = this.T8.getString(this, SP.STAMP_FONT_STYLE_NC, Default.DEFAULT_FONT_STYLE);
        this.B8 = this.T8.getString(this, SP.DATE_FORMAT_NC, Default.DEFAULT_DATE_FORMAT);
        this.Q8 = this.T8.getInteger(this, SP.LAT_LNG_TYPE_NC, 1);
        this.C8 = this.T8.getString(this, SP.TEMPRATURE_TYPE_NC, "Celsius");
        this.h8 = this.T8.getFloat(this, SP.TEMPRETURE_VALUE);
        this.T8.getInteger(this, SP.WEATHER_ICON, 0);
        this.v8 = this.T8.getString(this, SP.AQI_LEVEL_VALUE, "-");
        this.D8 = this.T8.getString(this, SP.MAP_TYPE_TEMPLATE_NC, Default.SETELLITE_2);
        this.T8.getInteger(this, SP.MAP_POS_NC, 1);
        this.T8.getInteger(this, SP.MAP_ZOOM_SCALE_NC, 78);
        this.g8 = this.T8.getInteger(this, SP.MAP_POS_TYPE_NC, 0);
        this.T8.getString(this, SP.STAMP_POS_NC, "Bottom");
        this.m8 = this.T8.getString(this, SP.STAMP_SIZE_NC, Default.TEMPLATE_SIZE);
        this.q8 = this.T8.getString(this, SP.PLUS_CODE_TYPE_NC, Default.PLUSCODE_TYPE);
        this.Q7 = this.T8.getInteger(this, SP.WIND_SELECT_NC, 0);
        this.U7 = this.T8.getInteger(this, SP.ALTITUDE_SELECT_NC, 0);
        this.Y7 = this.T8.getInteger(this, SP.ACCURACY_SELECT_NC, 0);
        this.c8 = this.T8.getInteger(this, SP.PRESSURE_SELECT_NC, 0);
        boolean zIsTablet = HelperClass.isTablet(this);
        int i5 = this.g8;
        LinearLayout linearLayout = this.a3;
        if (i5 == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.b3.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21, -1);
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21, -1);
            this.a3.setLayoutParams(layoutParams);
            this.b3.setLayoutParams(layoutParams2);
            boolean z10 = this.T3;
            RelativeLayout relativeLayout45 = this.E3;
            if (z10) {
                relativeLayout45.setVisibility(0);
                this.F3.setVisibility(8);
            } else {
                relativeLayout45.setVisibility(8);
                this.F3.setVisibility(8);
            }
        } else {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.b3.getLayoutParams();
            layoutParams3.removeRule(21);
            layoutParams3.addRule(20, -1);
            layoutParams4.removeRule(21);
            layoutParams4.addRule(20, -1);
            this.a3.setLayoutParams(layoutParams3);
            this.b3.setLayoutParams(layoutParams4);
            boolean z11 = this.T3;
            RelativeLayout relativeLayout46 = this.E3;
            if (z11) {
                relativeLayout46.setVisibility(8);
                this.F3.setVisibility(0);
            } else {
                relativeLayout46.setVisibility(8);
                this.F3.setVisibility(8);
            }
        }
        this.Z2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        boolean z12 = this.o4;
        ImageView imageView = this.R;
        if (z12) {
            imageView.setVisibility(0);
            if (this.E8.equals(Default.LOGO_uri)) {
                this.R.setImageResource(R.drawable.new_watermark);
            } else {
                Executors.newSingleThreadExecutor().execute(new nq6(this, new Handler(), i4));
            }
        } else {
            imageView.setVisibility(8);
        }
        if (this.m8.equals(Default.TEMPLATE_SIZE)) {
            this.R.getLayoutParams().height = HelperClass.dpToPx(this, 44);
            this.R.getLayoutParams().width = HelperClass.dpToPx(this, 44);
        } else if (this.m8.equals("Small")) {
            this.R.getLayoutParams().height = HelperClass.dpToPx(this, 40);
            this.R.getLayoutParams().width = HelperClass.dpToPx(this, 40);
        } else {
            boolean zEquals50 = this.m8.equals("Extra Small");
            ImageView imageView2 = this.R;
            if (zEquals50) {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 36);
                this.R.getLayoutParams().width = HelperClass.dpToPx(this, 36);
            } else {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 48);
                this.R.getLayoutParams().width = HelperClass.dpToPx(this, 48);
            }
        }
        this.G3.removeAllViews();
        if (this.m8.equals(Default.TEMPLATE_SIZE)) {
            this.t2.setTextSize(10.0f);
            this.u2.setTextSize(10.0f);
        } else if (this.m8.equals("Small")) {
            this.t2.setTextSize(9.0f);
            this.u2.setTextSize(9.0f);
        } else {
            boolean zEquals51 = this.m8.equals("Extra Small");
            TextView textView6 = this.t2;
            if (zEquals51) {
                textView6.setTextSize(8.0f);
                this.u2.setTextSize(8.0f);
            } else {
                textView6.setTextSize(11.0f);
                this.u2.setTextSize(11.0f);
            }
        }
        String str23 = this.m8;
        if (!zIsTablet) {
            if (str23.equals("Large")) {
                f = 10.0f;
                i = 8;
            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                f = 9.0f;
                i = 6;
            } else if (this.m8.equals("Small")) {
                f = 8.0f;
                i = 4;
            }
            if (this.t4) {
                LinearLayout linearLayout2 = new LinearLayout(this);
                linearLayout2.setOrientation(0);
                GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
                layoutParams5.width = 0;
                layoutParams5.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams5.setMargins(0, 0, 0, i);
                linearLayout2.setLayoutParams(layoutParams5);
                linearLayout2.setGravity(8388611);
                ImageView imageView3 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams6.setMarginEnd(6);
                imageView3.setLayoutParams(layoutParams6);
                imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView3.setImageResource(R.drawable.ic_altitiude);
                TextView textView7 = new TextView(this);
                textView7.setText(HelperClass.getAltitudeconvert(this, this.U7));
                textView7.setTextSize(f);
                textView7.setTextColor(this.f7);
                textView7.setSingleLine(true);
                textView7.setEllipsize(TextUtils.TruncateAt.END);
                textView7.setTypeface(HelperClass.getFontStyle(this, this.G8));
                linearLayout2.addView(imageView3);
                linearLayout2.addView(textView7);
                this.G3.addView(linearLayout2);
            }
            if (this.h4) {
                LinearLayout linearLayout3 = new LinearLayout(this);
                linearLayout3.setOrientation(0);
                GridLayout.LayoutParams layoutParams7 = new GridLayout.LayoutParams();
                layoutParams7.width = 0;
                layoutParams7.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams7.setMargins(0, 0, 0, i);
                linearLayout3.setLayoutParams(layoutParams7);
                linearLayout3.setGravity(8388611);
                ImageView imageView4 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams8.setMarginEnd(6);
                imageView4.setLayoutParams(layoutParams8);
                imageView4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int integer = this.T8.getInteger(this, SP.WEATHER_ICON, 0);
                this.i8 = integer;
                imageView4.setImageResource(this.r8.getResourceId(integer, 0));
                textView5 = new TextView(this);
                zEquals49 = this.C8.equals("Celsius");
                f2 = this.h8;
                if (zEquals49) {
                    textView5.setText(HelperClass.getCelcius(f2));
                } else {
                    textView5.setText(HelperClass.getFahrenheit(f2));
                }
                textView5.setTextSize(f);
                textView5.setTextColor(this.D6);
                textView5.setSingleLine(true);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setTypeface(HelperClass.getFontStyle(this, this.G8));
                linearLayout3.addView(imageView4);
                linearLayout3.addView(textView5);
                this.G3.addView(linearLayout3);
            }
            if (this.l4) {
                LinearLayout linearLayout4 = new LinearLayout(this);
                linearLayout4.setOrientation(0);
                GridLayout.LayoutParams layoutParams9 = new GridLayout.LayoutParams();
                layoutParams9.width = 0;
                layoutParams9.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams9.setMargins(0, 0, 0, i);
                linearLayout4.setLayoutParams(layoutParams9);
                linearLayout4.setGravity(8388611);
                ImageView imageView5 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams10.setMarginEnd(6);
                imageView5.setLayoutParams(layoutParams10);
                imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView5.setImageResource(R.drawable.ic_magnetic_field);
                TextView textView8 = new TextView(this);
                textView8.setText(this.T8.getString(this, zUHsDp.mNYgW, "-"));
                textView8.setTextSize(f);
                textView8.setTextColor(this.H6);
                textView8.setSingleLine(true);
                textView8.setEllipsize(TextUtils.TruncateAt.END);
                textView8.setTypeface(HelperClass.getFontStyle(this, this.G8));
                linearLayout4.addView(imageView5);
                linearLayout4.addView(textView8);
                this.G3.addView(linearLayout4);
            }
            if (this.n4) {
                LinearLayout linearLayout5 = new LinearLayout(this);
                linearLayout5.setOrientation(0);
                GridLayout.LayoutParams layoutParams11 = new GridLayout.LayoutParams();
                layoutParams11.width = 0;
                layoutParams11.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams11.setMargins(0, 0, 0, i);
                linearLayout5.setLayoutParams(layoutParams11);
                linearLayout5.setGravity(8388611);
                ImageView imageView6 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams12.setMarginEnd(6);
                imageView6.setLayoutParams(layoutParams12);
                imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView6.setImageResource(R.drawable.ic_wind);
                TextView textView9 = new TextView(this);
                textView9.setText(HelperClass.getwindConvert(this, this.Q7));
                textView9.setTextSize(f);
                textView9.setTextColor(this.T6);
                textView9.setSingleLine(true);
                textView9.setEllipsize(TextUtils.TruncateAt.END);
                textView9.setTypeface(HelperClass.getFontStyle(this, this.G8));
                linearLayout5.addView(imageView6);
                linearLayout5.addView(textView9);
                this.G3.addView(linearLayout5);
            }
            if (this.q4) {
                LinearLayout linearLayout6 = new LinearLayout(this);
                linearLayout6.setOrientation(0);
                GridLayout.LayoutParams layoutParams13 = new GridLayout.LayoutParams();
                layoutParams13.width = 0;
                layoutParams13.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams13.setMargins(0, 0, 0, i);
                linearLayout6.setLayoutParams(layoutParams13);
                linearLayout6.setGravity(8388611);
                ImageView imageView7 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams14.setMarginEnd(6);
                imageView7.setLayoutParams(layoutParams14);
                imageView7.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView7.setImageResource(R.drawable.ic_humidity);
                TextView textView10 = new TextView(this);
                textView10.setText(this.T8.getString(this, SP.HUMIDITY_VALUE, "") + "%");
                textView10.setTextSize(f);
                textView10.setTextColor(this.X6);
                String str24 = this.G8;
                textView10.setSingleLine(true);
                textView10.setEllipsize(TextUtils.TruncateAt.END);
                textView10.setTypeface(HelperClass.getFontStyle(this, str24));
                linearLayout6.addView(imageView7);
                linearLayout6.addView(textView10);
                this.G3.addView(linearLayout6);
            }
            if (this.r4) {
                LinearLayout linearLayout7 = new LinearLayout(this);
                linearLayout7.setOrientation(0);
                GridLayout.LayoutParams layoutParams15 = new GridLayout.LayoutParams();
                layoutParams15.width = 0;
                layoutParams15.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams15.setMargins(0, 0, 0, i);
                linearLayout7.setLayoutParams(layoutParams15);
                linearLayout7.setGravity(8388611);
                ImageView imageView8 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams16.setMarginEnd(6);
                imageView8.setLayoutParams(layoutParams16);
                imageView8.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView8.setImageResource(R.drawable.ic_pressure);
                TextView textView11 = new TextView(this);
                textView11.setText(HelperClass.getpressureConvert(this, this.c8));
                textView11.setTextSize(f);
                textView11.setTextColor(this.b7);
                textView11.setSingleLine(true);
                textView11.setEllipsize(TextUtils.TruncateAt.END);
                textView11.setTypeface(HelperClass.getFontStyle(this, this.G8));
                linearLayout7.addView(imageView8);
                linearLayout7.addView(textView11);
                this.G3.addView(linearLayout7);
            }
            if (this.u4) {
                LinearLayout linearLayout8 = new LinearLayout(this);
                linearLayout8.setOrientation(0);
                GridLayout.LayoutParams layoutParams17 = new GridLayout.LayoutParams();
                layoutParams17.width = 0;
                layoutParams17.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams17.setMargins(0, 0, 0, i);
                linearLayout8.setLayoutParams(layoutParams17);
                linearLayout8.setGravity(8388611);
                ImageView imageView9 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams18.setMarginEnd(6);
                imageView9.setLayoutParams(layoutParams18);
                imageView9.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView9.setImageResource(R.drawable.ic_accuracy);
                TextView textView12 = new TextView(this);
                textView12.setText(HelperClass.getAccuracy(this, this.Y7));
                textView12.setTextSize(f);
                textView12.setTextColor(this.j7);
                textView12.setSingleLine(true);
                textView12.setEllipsize(TextUtils.TruncateAt.END);
                textView12.setTypeface(HelperClass.getFontStyle(this, this.G8));
                linearLayout8.addView(imageView9);
                linearLayout8.addView(textView12);
                this.G3.addView(linearLayout8);
            }
            if (this.L5) {
                LinearLayout linearLayout9 = new LinearLayout(this);
                linearLayout9.setOrientation(0);
                GridLayout.LayoutParams layoutParams19 = new GridLayout.LayoutParams();
                layoutParams19.width = 0;
                layoutParams19.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams19.setMargins(0, 0, 0, i);
                linearLayout9.setLayoutParams(layoutParams19);
                linearLayout9.setGravity(8388611);
                ImageView imageView10 = new ImageView(this);
                LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams20.setMarginEnd(6);
                imageView10.setLayoutParams(layoutParams20);
                imageView10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView10.setImageResource(R.drawable.sound_wave);
                TextView textView13 = new TextView(this);
                textView13.setText(HelperClass.getSoundLevel(this));
                textView13.setTextSize(f);
                textView13.setTextColor(this.r6);
                textView13.setSingleLine(true);
                textView13.setEllipsize(TextUtils.TruncateAt.END);
                textView13.setTypeface(HelperClass.getFontStyle(this, this.G8));
                linearLayout9.addView(imageView10);
                linearLayout9.addView(textView13);
                this.G3.addView(linearLayout9);
            }
            z = this.b4;
            z2 = this.e4;
            z3 = this.d4;
            if (z) {
                if (this.c4) {
                    i3 = (z3 ? 1 : 0) + 1;
                } else {
                    i3 = z3 ? 1 : 0;
                }
                if (z2) {
                    i3++;
                }
                if (this.g4) {
                    i3++;
                }
                if (this.i4) {
                    i3++;
                } else {
                    i3++;
                }
                if (this.k4) {
                    i3++;
                }
                if (this.p4) {
                    i3++;
                }
                if (this.P5) {
                    i3++;
                }
                if (this.s8) {
                    i3++;
                }
                if (this.t8) {
                    i3++;
                }
                str12 = this.m8;
                if (i3 < 6) {
                    if (str12.equals(Default.TEMPLATE_SIZE)) {
                        this.r2.setTextSize(0, HelperClass.dpToPx(this, 8));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    } else if (this.m8.equals("Small")) {
                        this.r2.setTextSize(0, HelperClass.dpToPx(this, 7));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    } else {
                        zEquals48 = this.m8.equals("Extra Small");
                        textView4 = this.r2;
                        if (zEquals48) {
                            textView4.setTextSize(0, HelperClass.dpToPx(this, 6));
                            this.s2.setTextSize(0, HelperClass.dpToPx(this, 6));
                        } else {
                            textView4.setTextSize(0, HelperClass.dpToPx(this, 9));
                            this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                        }
                    }
                } else if (str12.equals(Default.TEMPLATE_SIZE)) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 10));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 10));
                } else if (this.m8.equals("Small")) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                } else {
                    zEquals25 = this.m8.equals("Extra Small");
                    textView3 = this.r2;
                    if (zEquals25) {
                        textView3.setTextSize(0, HelperClass.dpToPx(this, 8));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    } else {
                        textView3.setTextSize(0, HelperClass.dpToPx(this, 11));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 11));
                    }
                }
                HelperClass.dpToPx(this, 70);
                HelperClass.dpToPx(this, 75);
                HelperClass.dpToPx(this, 80);
                HelperClass.dpToPx(this, 85);
                iDpToPx21 = HelperClass.dpToPx(this, 90);
                iDpToPx22 = HelperClass.dpToPx(this, 95);
                iDpToPx23 = HelperClass.dpToPx(this, 100);
                iDpToPx24 = HelperClass.dpToPx(this, fh.W0);
                iDpToPx25 = HelperClass.dpToPx(this, fh.k1);
                iDpToPx26 = HelperClass.dpToPx(this, 115);
                iDpToPx27 = HelperClass.dpToPx(this, 120);
                iDpToPx28 = HelperClass.dpToPx(this, 125);
                iDpToPx29 = HelperClass.dpToPx(this, 130);
                iDpToPx30 = HelperClass.dpToPx(this, 135);
                z4 = z2;
                iDpToPx31 = HelperClass.dpToPx(this, 140);
                z8 = z3 ? 1 : 0;
                iDpToPx32 = HelperClass.dpToPx(this, 145);
                iDpToPx33 = HelperClass.dpToPx(this, 150);
                iDpToPx34 = HelperClass.dpToPx(this, 155);
                iDpToPx35 = HelperClass.dpToPx(this, 160);
                iDpToPx36 = HelperClass.dpToPx(this, 165);
                iDpToPx37 = HelperClass.dpToPx(this, 170);
                iDpToPx38 = HelperClass.dpToPx(this, 175);
                iDpToPx39 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
                HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
                iDpToPx40 = HelperClass.dpToPx(this, 190);
                HelperClass.dpToPx(this, 195);
                iDpToPx41 = HelperClass.dpToPx(this, PdfContentParser.COMMAND_TYPE);
                HelperClass.dpToPx(this, 205);
                iDpToPx42 = HelperClass.dpToPx(this, 210);
                HelperClass.dpToPx(this, 215);
                HelperClass.dpToPx(this, 220);
                HelperClass.dpToPx(this, 225);
                HelperClass.dpToPx(this, 230);
                if (this.n4) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (this.o4) {
                    str22 = this.m8;
                    if (z9) {
                        obj = "Large";
                        if (str22.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx42;
                            this.E3.getLayoutParams().height = iDpToPx42;
                            this.F3.getLayoutParams().height = iDpToPx42;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx41;
                            this.E3.getLayoutParams().height = iDpToPx41;
                            this.F3.getLayoutParams().height = iDpToPx41;
                            z7 = z8;
                        } else {
                            zEquals47 = this.m8.equals("Small");
                            relativeLayout44 = this.Z2;
                            if (zEquals47) {
                                relativeLayout44.getLayoutParams().height = iDpToPx40;
                                this.E3.getLayoutParams().height = iDpToPx40;
                                this.F3.getLayoutParams().height = iDpToPx40;
                                z7 = z8;
                            } else {
                                relativeLayout44.getLayoutParams().height = iDpToPx39;
                                this.E3.getLayoutParams().height = iDpToPx39;
                                this.F3.getLayoutParams().height = iDpToPx39;
                                z7 = z8;
                            }
                        }
                    } else {
                        obj = r15;
                        if (str22.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx41;
                            this.E3.getLayoutParams().height = iDpToPx41;
                            this.F3.getLayoutParams().height = iDpToPx41;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx40;
                            this.E3.getLayoutParams().height = iDpToPx40;
                            this.F3.getLayoutParams().height = iDpToPx40;
                            z7 = z8;
                        } else {
                            zEquals46 = this.m8.equals("Small");
                            relativeLayout43 = this.Z2;
                            if (zEquals46) {
                                relativeLayout43.getLayoutParams().height = iDpToPx39;
                                this.E3.getLayoutParams().height = iDpToPx39;
                                this.F3.getLayoutParams().height = iDpToPx39;
                                z7 = z8;
                            } else {
                                relativeLayout43.getLayoutParams().height = iDpToPx37;
                                this.E3.getLayoutParams().height = iDpToPx37;
                                this.F3.getLayoutParams().height = iDpToPx37;
                                z7 = z8;
                            }
                        }
                    }
                } else {
                    obj = r15;
                    if (i3 == 2) {
                        str21 = this.m8;
                        if (z9) {
                            if (str21.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx30;
                                this.E3.getLayoutParams().height = iDpToPx30;
                                this.F3.getLayoutParams().height = iDpToPx30;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx28;
                                this.E3.getLayoutParams().height = iDpToPx28;
                                this.F3.getLayoutParams().height = iDpToPx28;
                                z7 = z8;
                            } else {
                                zEquals45 = this.m8.equals("Small");
                                relativeLayout42 = this.Z2;
                                if (zEquals45) {
                                    relativeLayout42.getLayoutParams().height = iDpToPx26;
                                    this.E3.getLayoutParams().height = iDpToPx26;
                                    this.F3.getLayoutParams().height = iDpToPx26;
                                    z7 = z8;
                                } else {
                                    relativeLayout42.getLayoutParams().height = iDpToPx24;
                                    this.E3.getLayoutParams().height = iDpToPx24;
                                    this.F3.getLayoutParams().height = iDpToPx24;
                                    z7 = z8;
                                }
                            }
                        } else if (str21.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx28;
                            this.E3.getLayoutParams().height = iDpToPx28;
                            this.F3.getLayoutParams().height = iDpToPx28;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx26;
                            this.E3.getLayoutParams().height = iDpToPx26;
                            this.F3.getLayoutParams().height = iDpToPx26;
                            z7 = z8;
                        } else {
                            zEquals44 = this.m8.equals("Small");
                            relativeLayout41 = this.Z2;
                            if (zEquals44) {
                                relativeLayout41.getLayoutParams().height = iDpToPx24;
                                this.E3.getLayoutParams().height = iDpToPx24;
                                this.F3.getLayoutParams().height = iDpToPx24;
                                z7 = z8;
                            } else {
                                relativeLayout41.getLayoutParams().height = iDpToPx22;
                                this.E3.getLayoutParams().height = iDpToPx22;
                                this.F3.getLayoutParams().height = iDpToPx22;
                                z7 = z8;
                            }
                        }
                    } else if (i3 == 3) {
                        str20 = this.m8;
                        if (z9) {
                            if (str20.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            } else {
                                zEquals43 = this.m8.equals("Small");
                                relativeLayout40 = this.Z2;
                                if (zEquals43) {
                                    relativeLayout40.getLayoutParams().height = iDpToPx25;
                                    this.E3.getLayoutParams().height = iDpToPx25;
                                    this.F3.getLayoutParams().height = iDpToPx25;
                                    z7 = z8;
                                } else {
                                    relativeLayout40.getLayoutParams().height = iDpToPx23;
                                    this.E3.getLayoutParams().height = iDpToPx23;
                                    this.F3.getLayoutParams().height = iDpToPx23;
                                    z7 = z8;
                                }
                            }
                        } else if (str20.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx25;
                            this.E3.getLayoutParams().height = iDpToPx25;
                            this.F3.getLayoutParams().height = iDpToPx25;
                            z7 = z8;
                        } else {
                            zEquals42 = this.m8.equals("Small");
                            relativeLayout39 = this.Z2;
                            if (zEquals42) {
                                relativeLayout39.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            } else {
                                relativeLayout39.getLayoutParams().height = iDpToPx21;
                                this.E3.getLayoutParams().height = iDpToPx21;
                                this.F3.getLayoutParams().height = iDpToPx21;
                                z7 = z8;
                            }
                        }
                    } else if (i3 == 4) {
                        str19 = this.m8;
                        if (z9) {
                            if (str19.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            } else {
                                zEquals41 = this.m8.equals("Small");
                                relativeLayout38 = this.Z2;
                                if (zEquals41) {
                                    relativeLayout38.getLayoutParams().height = iDpToPx25;
                                    this.E3.getLayoutParams().height = iDpToPx25;
                                    this.F3.getLayoutParams().height = iDpToPx25;
                                    z7 = z8;
                                } else {
                                    relativeLayout38.getLayoutParams().height = iDpToPx23;
                                    this.E3.getLayoutParams().height = iDpToPx23;
                                    this.F3.getLayoutParams().height = iDpToPx23;
                                    z7 = z8;
                                }
                            }
                        } else if (str19.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx25;
                            this.E3.getLayoutParams().height = iDpToPx25;
                            this.F3.getLayoutParams().height = iDpToPx25;
                            z7 = z8;
                        } else {
                            zEquals40 = this.m8.equals("Small");
                            relativeLayout37 = this.Z2;
                            if (zEquals40) {
                                relativeLayout37.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            } else {
                                relativeLayout37.getLayoutParams().height = iDpToPx21;
                                this.E3.getLayoutParams().height = iDpToPx21;
                                this.F3.getLayoutParams().height = iDpToPx21;
                                z7 = z8;
                            }
                        }
                    } else if (i3 == 5) {
                        str18 = this.m8;
                        if (z9) {
                            if (str18.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            } else {
                                zEquals39 = this.m8.equals("Small");
                                relativeLayout36 = this.Z2;
                                if (zEquals39) {
                                    relativeLayout36.getLayoutParams().height = iDpToPx25;
                                    this.E3.getLayoutParams().height = iDpToPx25;
                                    this.F3.getLayoutParams().height = iDpToPx25;
                                    z7 = z8;
                                } else {
                                    relativeLayout36.getLayoutParams().height = iDpToPx23;
                                    this.E3.getLayoutParams().height = iDpToPx23;
                                    this.F3.getLayoutParams().height = iDpToPx23;
                                    z7 = z8;
                                }
                            }
                        } else if (str18.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx25;
                            this.E3.getLayoutParams().height = iDpToPx25;
                            this.F3.getLayoutParams().height = iDpToPx25;
                            z7 = z8;
                        } else {
                            zEquals38 = this.m8.equals("Small");
                            relativeLayout35 = this.Z2;
                            if (zEquals38) {
                                relativeLayout35.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            } else {
                                relativeLayout35.getLayoutParams().height = iDpToPx21;
                                this.E3.getLayoutParams().height = iDpToPx21;
                                this.F3.getLayoutParams().height = iDpToPx21;
                                z7 = z8;
                            }
                        }
                    } else if (i3 == 6) {
                        str17 = this.m8;
                        if (z9) {
                            if (str17.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx31;
                                this.E3.getLayoutParams().height = iDpToPx31;
                                this.F3.getLayoutParams().height = iDpToPx31;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            } else {
                                zEquals37 = this.m8.equals("Small");
                                relativeLayout34 = this.Z2;
                                if (zEquals37) {
                                    relativeLayout34.getLayoutParams().height = iDpToPx27;
                                    this.E3.getLayoutParams().height = iDpToPx27;
                                    this.F3.getLayoutParams().height = iDpToPx27;
                                    z7 = z8;
                                } else {
                                    relativeLayout34.getLayoutParams().height = iDpToPx25;
                                    this.E3.getLayoutParams().height = iDpToPx25;
                                    this.F3.getLayoutParams().height = iDpToPx25;
                                    z7 = z8;
                                }
                            }
                        } else if (str17.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            zEquals36 = this.m8.equals("Small");
                            relativeLayout33 = this.Z2;
                            if (zEquals36) {
                                relativeLayout33.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            } else {
                                relativeLayout33.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            }
                        }
                    } else if (i3 == 7) {
                        str16 = this.m8;
                        if (z9) {
                            if (str16.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx33;
                                this.E3.getLayoutParams().height = iDpToPx33;
                                this.F3.getLayoutParams().height = iDpToPx33;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx31;
                                this.E3.getLayoutParams().height = iDpToPx31;
                                this.F3.getLayoutParams().height = iDpToPx31;
                                z7 = z8;
                            } else {
                                zEquals35 = this.m8.equals("Small");
                                relativeLayout32 = this.Z2;
                                if (zEquals35) {
                                    relativeLayout32.getLayoutParams().height = iDpToPx29;
                                    this.E3.getLayoutParams().height = iDpToPx29;
                                    this.F3.getLayoutParams().height = iDpToPx29;
                                    z7 = z8;
                                } else {
                                    relativeLayout32.getLayoutParams().height = iDpToPx27;
                                    this.E3.getLayoutParams().height = iDpToPx27;
                                    this.F3.getLayoutParams().height = iDpToPx27;
                                    z7 = z8;
                                }
                            }
                        } else if (str16.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx31;
                            this.E3.getLayoutParams().height = iDpToPx31;
                            this.F3.getLayoutParams().height = iDpToPx31;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else {
                            zEquals34 = this.m8.equals("Small");
                            relativeLayout31 = this.Z2;
                            if (zEquals34) {
                                relativeLayout31.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            } else {
                                relativeLayout31.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            }
                        }
                    } else if (i3 == 8) {
                        str15 = this.m8;
                        if (z9) {
                            if (str15.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx35;
                                this.E3.getLayoutParams().height = iDpToPx35;
                                this.F3.getLayoutParams().height = iDpToPx35;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx33;
                                this.E3.getLayoutParams().height = iDpToPx33;
                                this.F3.getLayoutParams().height = iDpToPx33;
                                z7 = z8;
                            } else {
                                zEquals33 = this.m8.equals("Small");
                                relativeLayout30 = this.Z2;
                                if (zEquals33) {
                                    relativeLayout30.getLayoutParams().height = iDpToPx31;
                                    this.E3.getLayoutParams().height = iDpToPx31;
                                    this.F3.getLayoutParams().height = iDpToPx31;
                                    z7 = z8;
                                } else {
                                    relativeLayout30.getLayoutParams().height = iDpToPx29;
                                    this.E3.getLayoutParams().height = iDpToPx29;
                                    this.F3.getLayoutParams().height = iDpToPx29;
                                    z7 = z8;
                                }
                            }
                        } else if (str15.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx33;
                            this.E3.getLayoutParams().height = iDpToPx33;
                            this.F3.getLayoutParams().height = iDpToPx33;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx31;
                            this.E3.getLayoutParams().height = iDpToPx31;
                            this.F3.getLayoutParams().height = iDpToPx31;
                            z7 = z8;
                        } else {
                            zEquals32 = this.m8.equals("Small");
                            relativeLayout29 = this.Z2;
                            if (zEquals32) {
                                relativeLayout29.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            } else {
                                relativeLayout29.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            }
                        }
                    } else if (i3 == 9) {
                        str14 = this.m8;
                        if (z9) {
                            if (str14.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx36;
                                this.E3.getLayoutParams().height = iDpToPx36;
                                this.F3.getLayoutParams().height = iDpToPx36;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx34;
                                this.E3.getLayoutParams().height = iDpToPx34;
                                this.F3.getLayoutParams().height = iDpToPx34;
                                z7 = z8;
                            } else {
                                zEquals31 = this.m8.equals("Small");
                                relativeLayout28 = this.Z2;
                                if (zEquals31) {
                                    relativeLayout28.getLayoutParams().height = iDpToPx32;
                                    this.E3.getLayoutParams().height = iDpToPx32;
                                    this.F3.getLayoutParams().height = iDpToPx32;
                                    z7 = z8;
                                } else {
                                    relativeLayout28.getLayoutParams().height = iDpToPx30;
                                    this.E3.getLayoutParams().height = iDpToPx30;
                                    this.F3.getLayoutParams().height = iDpToPx30;
                                    z7 = z8;
                                }
                            }
                        } else if (str14.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx34;
                            this.E3.getLayoutParams().height = iDpToPx34;
                            this.F3.getLayoutParams().height = iDpToPx34;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx32;
                            this.E3.getLayoutParams().height = iDpToPx32;
                            this.F3.getLayoutParams().height = iDpToPx32;
                            z7 = z8;
                        } else {
                            zEquals30 = this.m8.equals("Small");
                            relativeLayout27 = this.Z2;
                            if (zEquals30) {
                                relativeLayout27.getLayoutParams().height = iDpToPx30;
                                this.E3.getLayoutParams().height = iDpToPx30;
                                this.F3.getLayoutParams().height = iDpToPx30;
                                z7 = z8;
                            } else {
                                relativeLayout27.getLayoutParams().height = iDpToPx28;
                                this.E3.getLayoutParams().height = iDpToPx28;
                                this.F3.getLayoutParams().height = iDpToPx28;
                                z7 = z8;
                            }
                        }
                    } else {
                        str13 = this.m8;
                        if (i3 == 10) {
                            if (z9) {
                                if (str13.equals(obj)) {
                                    this.Z2.getLayoutParams().height = iDpToPx37;
                                    this.E3.getLayoutParams().height = iDpToPx37;
                                    this.F3.getLayoutParams().height = iDpToPx37;
                                    z7 = z8;
                                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                    this.Z2.getLayoutParams().height = iDpToPx35;
                                    this.E3.getLayoutParams().height = iDpToPx35;
                                    this.F3.getLayoutParams().height = iDpToPx35;
                                    z7 = z8;
                                } else {
                                    zEquals29 = this.m8.equals("Small");
                                    relativeLayout26 = this.Z2;
                                    if (zEquals29) {
                                        relativeLayout26.getLayoutParams().height = iDpToPx33;
                                        this.E3.getLayoutParams().height = iDpToPx33;
                                        this.F3.getLayoutParams().height = iDpToPx33;
                                        z7 = z8;
                                    } else {
                                        relativeLayout26.getLayoutParams().height = iDpToPx31;
                                        this.E3.getLayoutParams().height = iDpToPx31;
                                        this.F3.getLayoutParams().height = iDpToPx31;
                                        z7 = z8;
                                    }
                                }
                            } else if (str13.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx35;
                                this.E3.getLayoutParams().height = iDpToPx35;
                                this.F3.getLayoutParams().height = iDpToPx35;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx33;
                                this.E3.getLayoutParams().height = iDpToPx33;
                                this.F3.getLayoutParams().height = iDpToPx33;
                                z7 = z8;
                            } else {
                                zEquals28 = this.m8.equals("Small");
                                relativeLayout25 = this.Z2;
                                if (zEquals28) {
                                    relativeLayout25.getLayoutParams().height = iDpToPx31;
                                    this.E3.getLayoutParams().height = iDpToPx31;
                                    this.F3.getLayoutParams().height = iDpToPx31;
                                    z7 = z8;
                                } else {
                                    relativeLayout25.getLayoutParams().height = iDpToPx29;
                                    this.E3.getLayoutParams().height = iDpToPx29;
                                    this.F3.getLayoutParams().height = iDpToPx29;
                                    z7 = z8;
                                }
                            }
                        } else if (z9) {
                            if (str13.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx38;
                                this.E3.getLayoutParams().height = iDpToPx38;
                                this.F3.getLayoutParams().height = iDpToPx38;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx36;
                                this.E3.getLayoutParams().height = iDpToPx36;
                                this.F3.getLayoutParams().height = iDpToPx36;
                                z7 = z8;
                            } else {
                                zEquals27 = this.m8.equals("Small");
                                relativeLayout24 = this.Z2;
                                if (zEquals27) {
                                    relativeLayout24.getLayoutParams().height = iDpToPx34;
                                    this.E3.getLayoutParams().height = iDpToPx34;
                                    this.F3.getLayoutParams().height = iDpToPx34;
                                    z7 = z8;
                                } else {
                                    relativeLayout24.getLayoutParams().height = iDpToPx32;
                                    this.E3.getLayoutParams().height = iDpToPx32;
                                    this.F3.getLayoutParams().height = iDpToPx32;
                                    z7 = z8;
                                }
                            }
                        } else if (str13.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx36;
                            this.E3.getLayoutParams().height = iDpToPx36;
                            this.F3.getLayoutParams().height = iDpToPx36;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx34;
                            this.E3.getLayoutParams().height = iDpToPx34;
                            this.F3.getLayoutParams().height = iDpToPx34;
                            z7 = z8;
                        } else {
                            zEquals26 = this.m8.equals("Small");
                            relativeLayout23 = this.Z2;
                            if (zEquals26) {
                                relativeLayout23.getLayoutParams().height = iDpToPx32;
                                this.E3.getLayoutParams().height = iDpToPx32;
                                this.F3.getLayoutParams().height = iDpToPx32;
                                z7 = z8;
                            } else {
                                relativeLayout23.getLayoutParams().height = iDpToPx30;
                                this.E3.getLayoutParams().height = iDpToPx30;
                                this.F3.getLayoutParams().height = iDpToPx30;
                                z7 = z8;
                            }
                        }
                    }
                }
            } else {
                z4 = z2;
                z5 = z3 ? 1 : 0;
                obj = r15;
                this.Q.setVisibility(8);
                if (this.c4) {
                    i2 = (z5 ? 1 : 0) + 1;
                } else {
                    i2 = z5 ? 1 : 0;
                }
                if (z4) {
                    i2++;
                }
                if (this.g4) {
                    i2++;
                }
                if (this.i4) {
                    i2++;
                } else {
                    i2++;
                }
                if (this.k4) {
                    i2++;
                }
                if (this.p4) {
                    i2++;
                }
                if (this.P5) {
                    i2++;
                }
                if (this.s8) {
                    i2++;
                }
                if (this.t8) {
                    i2++;
                }
                str = this.m8;
                if (i2 < 6) {
                    if (str.equals(Default.TEMPLATE_SIZE)) {
                        this.r2.setTextSize(0, HelperClass.dpToPx(this, 8));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    } else if (this.m8.equals("Small")) {
                        this.r2.setTextSize(0, HelperClass.dpToPx(this, 7));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    } else {
                        zEquals24 = this.m8.equals("Extra Small");
                        textView2 = this.r2;
                        if (zEquals24) {
                            textView2.setTextSize(0, HelperClass.dpToPx(this, 6));
                            this.s2.setTextSize(0, HelperClass.dpToPx(this, 6));
                        } else {
                            textView2.setTextSize(0, HelperClass.dpToPx(this, 9));
                            this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                        }
                    }
                } else if (str.equals(Default.TEMPLATE_SIZE)) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 10));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 10));
                } else if (this.m8.equals("Small")) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                } else {
                    zEquals = this.m8.equals("Extra Small");
                    textView = this.r2;
                    if (zEquals) {
                        textView.setTextSize(0, HelperClass.dpToPx(this, 8));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    } else {
                        textView.setTextSize(0, HelperClass.dpToPx(this, 11));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 11));
                    }
                }
                HelperClass.dpToPx(this, 70);
                HelperClass.dpToPx(this, 75);
                HelperClass.dpToPx(this, 80);
                HelperClass.dpToPx(this, 85);
                iDpToPx = HelperClass.dpToPx(this, 90);
                iDpToPx2 = HelperClass.dpToPx(this, 95);
                iDpToPx3 = HelperClass.dpToPx(this, 100);
                iDpToPx4 = HelperClass.dpToPx(this, fh.W0);
                iDpToPx5 = HelperClass.dpToPx(this, fh.k1);
                iDpToPx6 = HelperClass.dpToPx(this, 115);
                iDpToPx7 = HelperClass.dpToPx(this, 120);
                iDpToPx8 = HelperClass.dpToPx(this, 125);
                iDpToPx9 = HelperClass.dpToPx(this, 130);
                iDpToPx10 = HelperClass.dpToPx(this, 135);
                iDpToPx11 = HelperClass.dpToPx(this, 140);
                iDpToPx12 = HelperClass.dpToPx(this, 145);
                iDpToPx13 = HelperClass.dpToPx(this, 150);
                iDpToPx14 = HelperClass.dpToPx(this, 155);
                iDpToPx15 = HelperClass.dpToPx(this, 160);
                iDpToPx16 = HelperClass.dpToPx(this, 165);
                iDpToPx17 = HelperClass.dpToPx(this, 170);
                iDpToPx18 = HelperClass.dpToPx(this, 175);
                iDpToPx19 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
                HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
                iDpToPx20 = HelperClass.dpToPx(this, 190);
                if (this.n4) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (this.o4) {
                    str11 = this.m8;
                    if (z6) {
                        if (str11.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx20;
                            this.E3.getLayoutParams().height = iDpToPx20;
                            this.F3.getLayoutParams().height = iDpToPx20;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx19;
                            this.E3.getLayoutParams().height = iDpToPx19;
                            this.F3.getLayoutParams().height = iDpToPx19;
                            z7 = z5;
                        } else {
                            zEquals23 = this.m8.equals("Small");
                            relativeLayout22 = this.Z2;
                            if (zEquals23) {
                                relativeLayout22.getLayoutParams().height = iDpToPx17;
                                this.E3.getLayoutParams().height = iDpToPx17;
                                this.F3.getLayoutParams().height = iDpToPx17;
                                z7 = z5;
                            } else {
                                relativeLayout22.getLayoutParams().height = iDpToPx15;
                                this.E3.getLayoutParams().height = iDpToPx15;
                                this.F3.getLayoutParams().height = iDpToPx15;
                                z7 = z5;
                            }
                        }
                    } else if (str11.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx19;
                        this.E3.getLayoutParams().height = iDpToPx19;
                        this.F3.getLayoutParams().height = iDpToPx19;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx17;
                        this.E3.getLayoutParams().height = iDpToPx17;
                        this.F3.getLayoutParams().height = iDpToPx17;
                        z7 = z5;
                    } else {
                        zEquals22 = this.m8.equals("Small");
                        relativeLayout21 = this.Z2;
                        if (zEquals22) {
                            relativeLayout21.getLayoutParams().height = iDpToPx15;
                            this.E3.getLayoutParams().height = iDpToPx15;
                            this.F3.getLayoutParams().height = iDpToPx15;
                            z7 = z5;
                        } else {
                            relativeLayout21.getLayoutParams().height = iDpToPx13;
                            this.E3.getLayoutParams().height = iDpToPx13;
                            this.F3.getLayoutParams().height = iDpToPx13;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 2) {
                    str10 = this.m8;
                    if (z6) {
                        if (str10.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx10;
                            this.E3.getLayoutParams().height = iDpToPx10;
                            this.F3.getLayoutParams().height = iDpToPx10;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx8;
                            this.E3.getLayoutParams().height = iDpToPx8;
                            this.F3.getLayoutParams().height = iDpToPx8;
                            z7 = z5;
                        } else {
                            zEquals21 = this.m8.equals("Small");
                            relativeLayout20 = this.Z2;
                            if (zEquals21) {
                                relativeLayout20.getLayoutParams().height = iDpToPx6;
                                this.E3.getLayoutParams().height = iDpToPx6;
                                this.F3.getLayoutParams().height = iDpToPx6;
                                z7 = z5;
                            } else {
                                relativeLayout20.getLayoutParams().height = iDpToPx4;
                                this.E3.getLayoutParams().height = iDpToPx4;
                                this.F3.getLayoutParams().height = iDpToPx4;
                                z7 = z5;
                            }
                        }
                    } else if (str10.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx8;
                        this.E3.getLayoutParams().height = iDpToPx8;
                        this.F3.getLayoutParams().height = iDpToPx8;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx6;
                        this.E3.getLayoutParams().height = iDpToPx6;
                        this.F3.getLayoutParams().height = iDpToPx6;
                        z7 = z5;
                    } else {
                        zEquals20 = this.m8.equals("Small");
                        relativeLayout19 = this.Z2;
                        if (zEquals20) {
                            relativeLayout19.getLayoutParams().height = iDpToPx4;
                            this.E3.getLayoutParams().height = iDpToPx4;
                            this.F3.getLayoutParams().height = iDpToPx4;
                            z7 = z5;
                        } else {
                            relativeLayout19.getLayoutParams().height = iDpToPx2;
                            this.E3.getLayoutParams().height = iDpToPx2;
                            this.F3.getLayoutParams().height = iDpToPx2;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 3) {
                    str9 = this.m8;
                    if (z6) {
                        if (str9.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        } else {
                            zEquals19 = this.m8.equals("Small");
                            relativeLayout18 = this.Z2;
                            if (zEquals19) {
                                relativeLayout18.getLayoutParams().height = iDpToPx5;
                                this.E3.getLayoutParams().height = iDpToPx5;
                                this.F3.getLayoutParams().height = iDpToPx5;
                                z7 = z5;
                            } else {
                                relativeLayout18.getLayoutParams().height = iDpToPx3;
                                this.E3.getLayoutParams().height = iDpToPx3;
                                this.F3.getLayoutParams().height = iDpToPx3;
                                z7 = z5;
                            }
                        }
                    } else if (str9.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx5;
                        this.E3.getLayoutParams().height = iDpToPx5;
                        this.F3.getLayoutParams().height = iDpToPx5;
                        z7 = z5;
                    } else {
                        zEquals18 = this.m8.equals("Small");
                        relativeLayout17 = this.Z2;
                        if (zEquals18) {
                            relativeLayout17.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        } else {
                            relativeLayout17.getLayoutParams().height = iDpToPx;
                            this.E3.getLayoutParams().height = iDpToPx;
                            this.F3.getLayoutParams().height = iDpToPx;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 4) {
                    str8 = this.m8;
                    if (z6) {
                        if (str8.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        } else {
                            zEquals17 = this.m8.equals("Small");
                            relativeLayout16 = this.Z2;
                            if (zEquals17) {
                                relativeLayout16.getLayoutParams().height = iDpToPx5;
                                this.E3.getLayoutParams().height = iDpToPx5;
                                this.F3.getLayoutParams().height = iDpToPx5;
                                z7 = z5;
                            } else {
                                relativeLayout16.getLayoutParams().height = iDpToPx3;
                                this.E3.getLayoutParams().height = iDpToPx3;
                                this.F3.getLayoutParams().height = iDpToPx3;
                                z7 = z5;
                            }
                        }
                    } else if (str8.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx5;
                        this.E3.getLayoutParams().height = iDpToPx5;
                        this.F3.getLayoutParams().height = iDpToPx5;
                        z7 = z5;
                    } else {
                        zEquals16 = this.m8.equals("Small");
                        relativeLayout15 = this.Z2;
                        if (zEquals16) {
                            relativeLayout15.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        } else {
                            relativeLayout15.getLayoutParams().height = iDpToPx;
                            this.E3.getLayoutParams().height = iDpToPx;
                            this.F3.getLayoutParams().height = iDpToPx;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 5) {
                    str7 = this.m8;
                    if (z6) {
                        if (str7.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        } else {
                            zEquals15 = this.m8.equals("Small");
                            relativeLayout14 = this.Z2;
                            if (zEquals15) {
                                relativeLayout14.getLayoutParams().height = iDpToPx5;
                                this.E3.getLayoutParams().height = iDpToPx5;
                                this.F3.getLayoutParams().height = iDpToPx5;
                                z7 = z5;
                            } else {
                                relativeLayout14.getLayoutParams().height = iDpToPx3;
                                this.E3.getLayoutParams().height = iDpToPx3;
                                this.F3.getLayoutParams().height = iDpToPx3;
                                z7 = z5;
                            }
                        }
                    } else if (str7.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx5;
                        this.E3.getLayoutParams().height = iDpToPx5;
                        this.F3.getLayoutParams().height = iDpToPx5;
                        z7 = z5;
                    } else {
                        zEquals14 = this.m8.equals("Small");
                        relativeLayout13 = this.Z2;
                        if (zEquals14) {
                            relativeLayout13.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        } else {
                            relativeLayout13.getLayoutParams().height = iDpToPx;
                            this.E3.getLayoutParams().height = iDpToPx;
                            this.F3.getLayoutParams().height = iDpToPx;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 6) {
                    str6 = this.m8;
                    if (z6) {
                        if (str6.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx11;
                            this.E3.getLayoutParams().height = iDpToPx11;
                            this.F3.getLayoutParams().height = iDpToPx11;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        } else {
                            zEquals13 = this.m8.equals("Small");
                            relativeLayout12 = this.Z2;
                            if (zEquals13) {
                                relativeLayout12.getLayoutParams().height = iDpToPx7;
                                this.E3.getLayoutParams().height = iDpToPx7;
                                this.F3.getLayoutParams().height = iDpToPx7;
                                z7 = z5;
                            } else {
                                relativeLayout12.getLayoutParams().height = iDpToPx5;
                                this.E3.getLayoutParams().height = iDpToPx5;
                                this.F3.getLayoutParams().height = iDpToPx5;
                                z7 = z5;
                            }
                        }
                    } else if (str6.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        zEquals12 = this.m8.equals("Small");
                        relativeLayout11 = this.Z2;
                        if (zEquals12) {
                            relativeLayout11.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        } else {
                            relativeLayout11.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 7) {
                    str5 = this.m8;
                    if (z6) {
                        if (str5.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx13;
                            this.E3.getLayoutParams().height = iDpToPx13;
                            this.F3.getLayoutParams().height = iDpToPx13;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx11;
                            this.E3.getLayoutParams().height = iDpToPx11;
                            this.F3.getLayoutParams().height = iDpToPx11;
                            z7 = z5;
                        } else {
                            zEquals11 = this.m8.equals("Small");
                            relativeLayout10 = this.Z2;
                            if (zEquals11) {
                                relativeLayout10.getLayoutParams().height = iDpToPx9;
                                this.E3.getLayoutParams().height = iDpToPx9;
                                this.F3.getLayoutParams().height = iDpToPx9;
                                z7 = z5;
                            } else {
                                relativeLayout10.getLayoutParams().height = iDpToPx7;
                                this.E3.getLayoutParams().height = iDpToPx7;
                                this.F3.getLayoutParams().height = iDpToPx7;
                                z7 = z5;
                            }
                        }
                    } else if (str5.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx11;
                        this.E3.getLayoutParams().height = iDpToPx11;
                        this.F3.getLayoutParams().height = iDpToPx11;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else {
                        zEquals10 = this.m8.equals("Small");
                        relativeLayout9 = this.Z2;
                        if (zEquals10) {
                            relativeLayout9.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        } else {
                            relativeLayout9.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 8) {
                    str4 = this.m8;
                    if (z6) {
                        if (str4.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx15;
                            this.E3.getLayoutParams().height = iDpToPx15;
                            this.F3.getLayoutParams().height = iDpToPx15;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx13;
                            this.E3.getLayoutParams().height = iDpToPx13;
                            this.F3.getLayoutParams().height = iDpToPx13;
                            z7 = z5;
                        } else {
                            zEquals9 = this.m8.equals("Small");
                            relativeLayout8 = this.Z2;
                            if (zEquals9) {
                                relativeLayout8.getLayoutParams().height = iDpToPx11;
                                this.E3.getLayoutParams().height = iDpToPx11;
                                this.F3.getLayoutParams().height = iDpToPx11;
                                z7 = z5;
                            } else {
                                relativeLayout8.getLayoutParams().height = iDpToPx9;
                                this.E3.getLayoutParams().height = iDpToPx9;
                                this.F3.getLayoutParams().height = iDpToPx9;
                                z7 = z5;
                            }
                        }
                    } else if (str4.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx11;
                        this.E3.getLayoutParams().height = iDpToPx11;
                        this.F3.getLayoutParams().height = iDpToPx11;
                        z7 = z5;
                    } else {
                        zEquals8 = this.m8.equals("Small");
                        relativeLayout7 = this.Z2;
                        if (zEquals8) {
                            relativeLayout7.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        } else {
                            relativeLayout7.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        }
                    }
                } else if (i2 == 9) {
                    str3 = this.m8;
                    if (z6) {
                        if (str3.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx16;
                            this.E3.getLayoutParams().height = iDpToPx16;
                            this.F3.getLayoutParams().height = iDpToPx16;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx14;
                            this.E3.getLayoutParams().height = iDpToPx14;
                            this.F3.getLayoutParams().height = iDpToPx14;
                            z7 = z5;
                        } else {
                            zEquals7 = this.m8.equals("Small");
                            relativeLayout6 = this.Z2;
                            if (zEquals7) {
                                relativeLayout6.getLayoutParams().height = iDpToPx12;
                                this.E3.getLayoutParams().height = iDpToPx12;
                                this.F3.getLayoutParams().height = iDpToPx12;
                                z7 = z5;
                            } else {
                                relativeLayout6.getLayoutParams().height = iDpToPx10;
                                this.E3.getLayoutParams().height = iDpToPx10;
                                this.F3.getLayoutParams().height = iDpToPx10;
                                z7 = z5;
                            }
                        }
                    } else if (str3.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx14;
                        this.E3.getLayoutParams().height = iDpToPx14;
                        this.F3.getLayoutParams().height = iDpToPx14;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx12;
                        this.E3.getLayoutParams().height = iDpToPx12;
                        this.F3.getLayoutParams().height = iDpToPx12;
                        z7 = z5;
                    } else {
                        zEquals6 = this.m8.equals("Small");
                        relativeLayout5 = this.Z2;
                        if (zEquals6) {
                            relativeLayout5.getLayoutParams().height = iDpToPx10;
                            this.E3.getLayoutParams().height = iDpToPx10;
                            this.F3.getLayoutParams().height = iDpToPx10;
                            z7 = z5;
                        } else {
                            relativeLayout5.getLayoutParams().height = iDpToPx8;
                            this.E3.getLayoutParams().height = iDpToPx8;
                            this.F3.getLayoutParams().height = iDpToPx8;
                            z7 = z5;
                        }
                    }
                } else {
                    str2 = this.m8;
                    if (i2 == 10) {
                        if (z6) {
                            if (str2.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx17;
                                this.E3.getLayoutParams().height = iDpToPx17;
                                this.F3.getLayoutParams().height = iDpToPx17;
                                z7 = z5;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx15;
                                this.E3.getLayoutParams().height = iDpToPx15;
                                this.F3.getLayoutParams().height = iDpToPx15;
                                z7 = z5;
                            } else {
                                zEquals5 = this.m8.equals("Small");
                                relativeLayout4 = this.Z2;
                                if (zEquals5) {
                                    relativeLayout4.getLayoutParams().height = iDpToPx13;
                                    this.E3.getLayoutParams().height = iDpToPx13;
                                    this.F3.getLayoutParams().height = iDpToPx13;
                                    z7 = z5;
                                } else {
                                    relativeLayout4.getLayoutParams().height = iDpToPx11;
                                    this.E3.getLayoutParams().height = iDpToPx11;
                                    this.F3.getLayoutParams().height = iDpToPx11;
                                    z7 = z5;
                                }
                            }
                        } else if (str2.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx15;
                            this.E3.getLayoutParams().height = iDpToPx15;
                            this.F3.getLayoutParams().height = iDpToPx15;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx13;
                            this.E3.getLayoutParams().height = iDpToPx13;
                            this.F3.getLayoutParams().height = iDpToPx13;
                            z7 = z5;
                        } else {
                            zEquals4 = this.m8.equals("Small");
                            relativeLayout3 = this.Z2;
                            if (zEquals4) {
                                relativeLayout3.getLayoutParams().height = iDpToPx11;
                                this.E3.getLayoutParams().height = iDpToPx11;
                                this.F3.getLayoutParams().height = iDpToPx11;
                                z7 = z5;
                            } else {
                                relativeLayout3.getLayoutParams().height = iDpToPx9;
                                this.E3.getLayoutParams().height = iDpToPx9;
                                this.F3.getLayoutParams().height = iDpToPx9;
                                z7 = z5;
                            }
                        }
                    } else if (z6) {
                        if (str2.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx18;
                            this.E3.getLayoutParams().height = iDpToPx18;
                            this.F3.getLayoutParams().height = iDpToPx18;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx16;
                            this.E3.getLayoutParams().height = iDpToPx16;
                            this.F3.getLayoutParams().height = iDpToPx16;
                            z7 = z5;
                        } else {
                            zEquals3 = this.m8.equals("Small");
                            relativeLayout2 = this.Z2;
                            if (zEquals3) {
                                relativeLayout2.getLayoutParams().height = iDpToPx14;
                                this.E3.getLayoutParams().height = iDpToPx14;
                                this.F3.getLayoutParams().height = iDpToPx14;
                                z7 = z5;
                            } else {
                                relativeLayout2.getLayoutParams().height = iDpToPx12;
                                this.E3.getLayoutParams().height = iDpToPx12;
                                this.F3.getLayoutParams().height = iDpToPx12;
                                z7 = z5;
                            }
                        }
                    } else if (str2.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx16;
                        this.E3.getLayoutParams().height = iDpToPx16;
                        this.F3.getLayoutParams().height = iDpToPx16;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx14;
                        this.E3.getLayoutParams().height = iDpToPx14;
                        this.F3.getLayoutParams().height = iDpToPx14;
                        z7 = z5;
                    } else {
                        zEquals2 = this.m8.equals("Small");
                        relativeLayout = this.Z2;
                        if (zEquals2) {
                            relativeLayout.getLayoutParams().height = iDpToPx12;
                            this.E3.getLayoutParams().height = iDpToPx12;
                            this.F3.getLayoutParams().height = iDpToPx12;
                            z7 = z5;
                        } else {
                            relativeLayout.getLayoutParams().height = iDpToPx10;
                            this.E3.getLayoutParams().height = iDpToPx10;
                            this.F3.getLayoutParams().height = iDpToPx10;
                            z7 = z5;
                        }
                    }
                }
            }
            if (this.c4) {
                this.Y2.setVisibility(0);
            } else {
                this.Y2.setVisibility(0);
            }
            if (z4) {
                this.X2.setVisibility(0);
                J();
            } else {
                this.X2.setVisibility(0);
                J();
            }
            if (z4) {
                this.q2.setVisibility(0);
            } else {
                this.q2.setVisibility(0);
            }
            if (this.b4) {
                this.Z2.setVisibility(0);
            } else {
                this.Z2.setVisibility(0);
            }
            this.a3.setVisibility(8);
            this.b3.setVisibility(8);
            this.Z2.setBackground(getDrawable(R.drawable.rect_grey));
            this.E3.setBackground(getDrawable(R.drawable.rect_grey_6));
            this.F3.setBackground(getDrawable(R.drawable.rect_grey_6));
            this.t2.setBackground(getDrawable(R.drawable.rect_grey_8));
            this.u2.setBackground(getDrawable(R.drawable.rect_grey_8));
            ((GradientDrawable) this.E3.getBackground().getCurrent()).setColor(this.k5);
            ((GradientDrawable) this.F3.getBackground().getCurrent()).setColor(this.k5);
            ((GradientDrawable) this.Z2.getBackground().getCurrent()).setColor(this.k5);
            ((GradientDrawable) this.u2.getBackground().getCurrent()).setColor(this.r7);
            ((GradientDrawable) this.t2.getBackground().getCurrent()).setColor(this.r7);
            this.t2.setTextColor(this.q7);
            this.u2.setTextColor(this.q7);
            this.r2.setTextColor(this.L6);
            this.s2.setTextColor(this.L6);
            C();
        }
        if (str23.equals("Large")) {
            f = 10.0f;
        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
            f = 9.0f;
        } else if (this.m8.equals("Small")) {
            f = 8.0f;
        }
        i = 2;
        if (this.t4) {
            LinearLayout linearLayout10 = new LinearLayout(this);
            linearLayout10.setOrientation(0);
            GridLayout.LayoutParams layoutParams21 = new GridLayout.LayoutParams();
            layoutParams21.width = 0;
            layoutParams21.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams21.setMargins(0, 0, 0, i);
            linearLayout10.setLayoutParams(layoutParams21);
            linearLayout10.setGravity(8388611);
            ImageView imageView11 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams22.setMarginEnd(6);
            imageView11.setLayoutParams(layoutParams22);
            imageView11.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView11.setImageResource(R.drawable.ic_altitiude);
            TextView textView14 = new TextView(this);
            textView14.setText(HelperClass.getAltitudeconvert(this, this.U7));
            textView14.setTextSize(f);
            textView14.setTextColor(this.f7);
            textView14.setSingleLine(true);
            textView14.setEllipsize(TextUtils.TruncateAt.END);
            textView14.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout10.addView(imageView11);
            linearLayout10.addView(textView14);
            this.G3.addView(linearLayout10);
        }
        if (this.h4) {
            LinearLayout linearLayout11 = new LinearLayout(this);
            linearLayout11.setOrientation(0);
            GridLayout.LayoutParams layoutParams23 = new GridLayout.LayoutParams();
            layoutParams23.width = 0;
            layoutParams23.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams23.setMargins(0, 0, 0, i);
            linearLayout11.setLayoutParams(layoutParams23);
            linearLayout11.setGravity(8388611);
            ImageView imageView12 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams24.setMarginEnd(6);
            imageView12.setLayoutParams(layoutParams24);
            imageView12.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int integer2 = this.T8.getInteger(this, SP.WEATHER_ICON, 0);
            this.i8 = integer2;
            imageView12.setImageResource(this.r8.getResourceId(integer2, 0));
            textView5 = new TextView(this);
            zEquals49 = this.C8.equals("Celsius");
            f2 = this.h8;
            if (zEquals49) {
                textView5.setText(HelperClass.getCelcius(f2));
            } else {
                textView5.setText(HelperClass.getFahrenheit(f2));
            }
            textView5.setTextSize(f);
            textView5.setTextColor(this.D6);
            textView5.setSingleLine(true);
            textView5.setEllipsize(TextUtils.TruncateAt.END);
            textView5.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout11.addView(imageView12);
            linearLayout11.addView(textView5);
            this.G3.addView(linearLayout11);
        }
        if (this.l4 && this.T3) {
            LinearLayout linearLayout12 = new LinearLayout(this);
            linearLayout12.setOrientation(0);
            GridLayout.LayoutParams layoutParams25 = new GridLayout.LayoutParams();
            layoutParams25.width = 0;
            layoutParams25.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams25.setMargins(0, 0, 0, i);
            linearLayout12.setLayoutParams(layoutParams25);
            linearLayout12.setGravity(8388611);
            ImageView imageView13 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams110 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams110.setMarginEnd(6);
            imageView13.setLayoutParams(layoutParams110);
            imageView13.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView13.setImageResource(R.drawable.ic_magnetic_field);
            TextView textView15 = new TextView(this);
            textView15.setText(this.T8.getString(this, zUHsDp.mNYgW, "-"));
            textView15.setTextSize(f);
            textView15.setTextColor(this.H6);
            textView15.setSingleLine(true);
            textView15.setEllipsize(TextUtils.TruncateAt.END);
            textView15.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout12.addView(imageView13);
            linearLayout12.addView(textView15);
            this.G3.addView(linearLayout12);
        }
        if (this.n4) {
            LinearLayout linearLayout13 = new LinearLayout(this);
            linearLayout13.setOrientation(0);
            GridLayout.LayoutParams layoutParams111 = new GridLayout.LayoutParams();
            layoutParams111.width = 0;
            layoutParams111.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams111.setMargins(0, 0, 0, i);
            linearLayout13.setLayoutParams(layoutParams111);
            linearLayout13.setGravity(8388611);
            ImageView imageView14 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams112 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams112.setMarginEnd(6);
            imageView14.setLayoutParams(layoutParams112);
            imageView14.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView14.setImageResource(R.drawable.ic_wind);
            TextView textView16 = new TextView(this);
            textView16.setText(HelperClass.getwindConvert(this, this.Q7));
            textView16.setTextSize(f);
            textView16.setTextColor(this.T6);
            textView16.setSingleLine(true);
            textView16.setEllipsize(TextUtils.TruncateAt.END);
            textView16.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout13.addView(imageView14);
            linearLayout13.addView(textView16);
            this.G3.addView(linearLayout13);
        }
        if (this.q4) {
            LinearLayout linearLayout14 = new LinearLayout(this);
            linearLayout14.setOrientation(0);
            GridLayout.LayoutParams layoutParams113 = new GridLayout.LayoutParams();
            layoutParams113.width = 0;
            layoutParams113.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams113.setMargins(0, 0, 0, i);
            linearLayout14.setLayoutParams(layoutParams113);
            linearLayout14.setGravity(8388611);
            ImageView imageView15 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams114 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams114.setMarginEnd(6);
            imageView15.setLayoutParams(layoutParams114);
            imageView15.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView15.setImageResource(R.drawable.ic_humidity);
            TextView textView17 = new TextView(this);
            textView17.setText(this.T8.getString(this, SP.HUMIDITY_VALUE, "") + "%");
            textView17.setTextSize(f);
            textView17.setTextColor(this.X6);
            String str25 = this.G8;
            textView17.setSingleLine(true);
            textView17.setEllipsize(TextUtils.TruncateAt.END);
            textView17.setTypeface(HelperClass.getFontStyle(this, str25));
            linearLayout14.addView(imageView15);
            linearLayout14.addView(textView17);
            this.G3.addView(linearLayout14);
        }
        if (this.r4) {
            LinearLayout linearLayout15 = new LinearLayout(this);
            linearLayout15.setOrientation(0);
            GridLayout.LayoutParams layoutParams115 = new GridLayout.LayoutParams();
            layoutParams115.width = 0;
            layoutParams115.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams115.setMargins(0, 0, 0, i);
            linearLayout15.setLayoutParams(layoutParams115);
            linearLayout15.setGravity(8388611);
            ImageView imageView16 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams116 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams116.setMarginEnd(6);
            imageView16.setLayoutParams(layoutParams116);
            imageView16.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView16.setImageResource(R.drawable.ic_pressure);
            TextView textView18 = new TextView(this);
            textView18.setText(HelperClass.getpressureConvert(this, this.c8));
            textView18.setTextSize(f);
            textView18.setTextColor(this.b7);
            textView18.setSingleLine(true);
            textView18.setEllipsize(TextUtils.TruncateAt.END);
            textView18.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout15.addView(imageView16);
            linearLayout15.addView(textView18);
            this.G3.addView(linearLayout15);
        }
        if (this.u4) {
            LinearLayout linearLayout16 = new LinearLayout(this);
            linearLayout16.setOrientation(0);
            GridLayout.LayoutParams layoutParams117 = new GridLayout.LayoutParams();
            layoutParams117.width = 0;
            layoutParams117.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams117.setMargins(0, 0, 0, i);
            linearLayout16.setLayoutParams(layoutParams117);
            linearLayout16.setGravity(8388611);
            ImageView imageView17 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams118 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams118.setMarginEnd(6);
            imageView17.setLayoutParams(layoutParams118);
            imageView17.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView17.setImageResource(R.drawable.ic_accuracy);
            TextView textView19 = new TextView(this);
            textView19.setText(HelperClass.getAccuracy(this, this.Y7));
            textView19.setTextSize(f);
            textView19.setTextColor(this.j7);
            textView19.setSingleLine(true);
            textView19.setEllipsize(TextUtils.TruncateAt.END);
            textView19.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout16.addView(imageView17);
            linearLayout16.addView(textView19);
            this.G3.addView(linearLayout16);
        }
        if (this.L5) {
            LinearLayout linearLayout17 = new LinearLayout(this);
            linearLayout17.setOrientation(0);
            GridLayout.LayoutParams layoutParams119 = new GridLayout.LayoutParams();
            layoutParams119.width = 0;
            layoutParams119.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams119.setMargins(0, 0, 0, i);
            linearLayout17.setLayoutParams(layoutParams119);
            linearLayout17.setGravity(8388611);
            ImageView imageView18 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams26.setMarginEnd(6);
            imageView18.setLayoutParams(layoutParams26);
            imageView18.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView18.setImageResource(R.drawable.sound_wave);
            TextView textView110 = new TextView(this);
            textView110.setText(HelperClass.getSoundLevel(this));
            textView110.setTextSize(f);
            textView110.setTextColor(this.r6);
            textView110.setSingleLine(true);
            textView110.setEllipsize(TextUtils.TruncateAt.END);
            textView110.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout17.addView(imageView18);
            linearLayout17.addView(textView110);
            this.G3.addView(linearLayout17);
        }
        z = this.b4;
        z2 = this.e4;
        z3 = this.d4;
        if (z) {
            if (this.c4) {
                i3 = (z3 ? 1 : 0) + 1;
            } else {
                i3 = z3 ? 1 : 0;
            }
            if (z2) {
                i3++;
            }
            if (this.g4) {
                i3++;
            }
            if (this.i4 || this.j4) {
                i3++;
            }
            if (this.k4) {
                i3++;
            }
            if (this.p4) {
                i3++;
            }
            if (this.P5) {
                i3++;
            }
            if (this.s8) {
                i3++;
            }
            if (this.t8) {
                i3++;
            }
            str12 = this.m8;
            if (i3 < 6) {
                if (str12.equals(Default.TEMPLATE_SIZE)) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else if (this.m8.equals("Small")) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 7));
                } else {
                    zEquals48 = this.m8.equals("Extra Small");
                    textView4 = this.r2;
                    if (zEquals48) {
                        textView4.setTextSize(0, HelperClass.dpToPx(this, 6));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 6));
                    } else {
                        textView4.setTextSize(0, HelperClass.dpToPx(this, 9));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    }
                }
            } else if (str12.equals(Default.TEMPLATE_SIZE)) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 10));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 10));
            } else if (this.m8.equals("Small")) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 9));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
            } else {
                zEquals25 = this.m8.equals("Extra Small");
                textView3 = this.r2;
                if (zEquals25) {
                    textView3.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else {
                    textView3.setTextSize(0, HelperClass.dpToPx(this, 11));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 11));
                }
            }
            HelperClass.dpToPx(this, 70);
            HelperClass.dpToPx(this, 75);
            HelperClass.dpToPx(this, 80);
            HelperClass.dpToPx(this, 85);
            iDpToPx21 = HelperClass.dpToPx(this, 90);
            iDpToPx22 = HelperClass.dpToPx(this, 95);
            iDpToPx23 = HelperClass.dpToPx(this, 100);
            iDpToPx24 = HelperClass.dpToPx(this, fh.W0);
            iDpToPx25 = HelperClass.dpToPx(this, fh.k1);
            iDpToPx26 = HelperClass.dpToPx(this, 115);
            iDpToPx27 = HelperClass.dpToPx(this, 120);
            iDpToPx28 = HelperClass.dpToPx(this, 125);
            iDpToPx29 = HelperClass.dpToPx(this, 130);
            iDpToPx30 = HelperClass.dpToPx(this, 135);
            z4 = z2;
            iDpToPx31 = HelperClass.dpToPx(this, 140);
            z8 = z3 ? 1 : 0;
            iDpToPx32 = HelperClass.dpToPx(this, 145);
            iDpToPx33 = HelperClass.dpToPx(this, 150);
            iDpToPx34 = HelperClass.dpToPx(this, 155);
            iDpToPx35 = HelperClass.dpToPx(this, 160);
            iDpToPx36 = HelperClass.dpToPx(this, 165);
            iDpToPx37 = HelperClass.dpToPx(this, 170);
            iDpToPx38 = HelperClass.dpToPx(this, 175);
            iDpToPx39 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
            HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
            iDpToPx40 = HelperClass.dpToPx(this, 190);
            HelperClass.dpToPx(this, 195);
            iDpToPx41 = HelperClass.dpToPx(this, PdfContentParser.COMMAND_TYPE);
            HelperClass.dpToPx(this, 205);
            iDpToPx42 = HelperClass.dpToPx(this, 210);
            HelperClass.dpToPx(this, 215);
            HelperClass.dpToPx(this, 220);
            HelperClass.dpToPx(this, 225);
            HelperClass.dpToPx(this, 230);
            if (this.n4 || this.q4 || this.r4 || this.t4 || this.u4 || this.L5 || this.h4 || this.m4 || this.l4 || this.s4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.o4) {
                str22 = this.m8;
                if (z9) {
                    obj = "Large";
                    if (str22.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx42;
                        this.E3.getLayoutParams().height = iDpToPx42;
                        this.F3.getLayoutParams().height = iDpToPx42;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx41;
                        this.E3.getLayoutParams().height = iDpToPx41;
                        this.F3.getLayoutParams().height = iDpToPx41;
                        z7 = z8;
                    } else {
                        zEquals47 = this.m8.equals("Small");
                        relativeLayout44 = this.Z2;
                        if (zEquals47) {
                            relativeLayout44.getLayoutParams().height = iDpToPx40;
                            this.E3.getLayoutParams().height = iDpToPx40;
                            this.F3.getLayoutParams().height = iDpToPx40;
                            z7 = z8;
                        } else {
                            relativeLayout44.getLayoutParams().height = iDpToPx39;
                            this.E3.getLayoutParams().height = iDpToPx39;
                            this.F3.getLayoutParams().height = iDpToPx39;
                            z7 = z8;
                        }
                    }
                } else {
                    obj = r15;
                    if (str22.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx41;
                        this.E3.getLayoutParams().height = iDpToPx41;
                        this.F3.getLayoutParams().height = iDpToPx41;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx40;
                        this.E3.getLayoutParams().height = iDpToPx40;
                        this.F3.getLayoutParams().height = iDpToPx40;
                        z7 = z8;
                    } else {
                        zEquals46 = this.m8.equals("Small");
                        relativeLayout43 = this.Z2;
                        if (zEquals46) {
                            relativeLayout43.getLayoutParams().height = iDpToPx39;
                            this.E3.getLayoutParams().height = iDpToPx39;
                            this.F3.getLayoutParams().height = iDpToPx39;
                            z7 = z8;
                        } else {
                            relativeLayout43.getLayoutParams().height = iDpToPx37;
                            this.E3.getLayoutParams().height = iDpToPx37;
                            this.F3.getLayoutParams().height = iDpToPx37;
                            z7 = z8;
                        }
                    }
                }
            } else {
                obj = r15;
                if (i3 == 2) {
                    str21 = this.m8;
                    if (z9) {
                        if (str21.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx30;
                            this.E3.getLayoutParams().height = iDpToPx30;
                            this.F3.getLayoutParams().height = iDpToPx30;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx28;
                            this.E3.getLayoutParams().height = iDpToPx28;
                            this.F3.getLayoutParams().height = iDpToPx28;
                            z7 = z8;
                        } else {
                            zEquals45 = this.m8.equals("Small");
                            relativeLayout42 = this.Z2;
                            if (zEquals45) {
                                relativeLayout42.getLayoutParams().height = iDpToPx26;
                                this.E3.getLayoutParams().height = iDpToPx26;
                                this.F3.getLayoutParams().height = iDpToPx26;
                                z7 = z8;
                            } else {
                                relativeLayout42.getLayoutParams().height = iDpToPx24;
                                this.E3.getLayoutParams().height = iDpToPx24;
                                this.F3.getLayoutParams().height = iDpToPx24;
                                z7 = z8;
                            }
                        }
                    } else if (str21.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx28;
                        this.E3.getLayoutParams().height = iDpToPx28;
                        this.F3.getLayoutParams().height = iDpToPx28;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx26;
                        this.E3.getLayoutParams().height = iDpToPx26;
                        this.F3.getLayoutParams().height = iDpToPx26;
                        z7 = z8;
                    } else {
                        zEquals44 = this.m8.equals("Small");
                        relativeLayout41 = this.Z2;
                        if (zEquals44) {
                            relativeLayout41.getLayoutParams().height = iDpToPx24;
                            this.E3.getLayoutParams().height = iDpToPx24;
                            this.F3.getLayoutParams().height = iDpToPx24;
                            z7 = z8;
                        } else {
                            relativeLayout41.getLayoutParams().height = iDpToPx22;
                            this.E3.getLayoutParams().height = iDpToPx22;
                            this.F3.getLayoutParams().height = iDpToPx22;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 3) {
                    str20 = this.m8;
                    if (z9) {
                        if (str20.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            zEquals43 = this.m8.equals("Small");
                            relativeLayout40 = this.Z2;
                            if (zEquals43) {
                                relativeLayout40.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            } else {
                                relativeLayout40.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            }
                        }
                    } else if (str20.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx25;
                        this.E3.getLayoutParams().height = iDpToPx25;
                        this.F3.getLayoutParams().height = iDpToPx25;
                        z7 = z8;
                    } else {
                        zEquals42 = this.m8.equals("Small");
                        relativeLayout39 = this.Z2;
                        if (zEquals42) {
                            relativeLayout39.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        } else {
                            relativeLayout39.getLayoutParams().height = iDpToPx21;
                            this.E3.getLayoutParams().height = iDpToPx21;
                            this.F3.getLayoutParams().height = iDpToPx21;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 4) {
                    str19 = this.m8;
                    if (z9) {
                        if (str19.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            zEquals41 = this.m8.equals("Small");
                            relativeLayout38 = this.Z2;
                            if (zEquals41) {
                                relativeLayout38.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            } else {
                                relativeLayout38.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            }
                        }
                    } else if (str19.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx25;
                        this.E3.getLayoutParams().height = iDpToPx25;
                        this.F3.getLayoutParams().height = iDpToPx25;
                        z7 = z8;
                    } else {
                        zEquals40 = this.m8.equals("Small");
                        relativeLayout37 = this.Z2;
                        if (zEquals40) {
                            relativeLayout37.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        } else {
                            relativeLayout37.getLayoutParams().height = iDpToPx21;
                            this.E3.getLayoutParams().height = iDpToPx21;
                            this.F3.getLayoutParams().height = iDpToPx21;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 5) {
                    str18 = this.m8;
                    if (z9) {
                        if (str18.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            zEquals39 = this.m8.equals("Small");
                            relativeLayout36 = this.Z2;
                            if (zEquals39) {
                                relativeLayout36.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            } else {
                                relativeLayout36.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            }
                        }
                    } else if (str18.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx25;
                        this.E3.getLayoutParams().height = iDpToPx25;
                        this.F3.getLayoutParams().height = iDpToPx25;
                        z7 = z8;
                    } else {
                        zEquals38 = this.m8.equals("Small");
                        relativeLayout35 = this.Z2;
                        if (zEquals38) {
                            relativeLayout35.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        } else {
                            relativeLayout35.getLayoutParams().height = iDpToPx21;
                            this.E3.getLayoutParams().height = iDpToPx21;
                            this.F3.getLayoutParams().height = iDpToPx21;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 6) {
                    str17 = this.m8;
                    if (z9) {
                        if (str17.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx31;
                            this.E3.getLayoutParams().height = iDpToPx31;
                            this.F3.getLayoutParams().height = iDpToPx31;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else {
                            zEquals37 = this.m8.equals("Small");
                            relativeLayout34 = this.Z2;
                            if (zEquals37) {
                                relativeLayout34.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            } else {
                                relativeLayout34.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            }
                        }
                    } else if (str17.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx29;
                        this.E3.getLayoutParams().height = iDpToPx29;
                        this.F3.getLayoutParams().height = iDpToPx29;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else {
                        zEquals36 = this.m8.equals("Small");
                        relativeLayout33 = this.Z2;
                        if (zEquals36) {
                            relativeLayout33.getLayoutParams().height = iDpToPx25;
                            this.E3.getLayoutParams().height = iDpToPx25;
                            this.F3.getLayoutParams().height = iDpToPx25;
                            z7 = z8;
                        } else {
                            relativeLayout33.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 7) {
                    str16 = this.m8;
                    if (z9) {
                        if (str16.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx33;
                            this.E3.getLayoutParams().height = iDpToPx33;
                            this.F3.getLayoutParams().height = iDpToPx33;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx31;
                            this.E3.getLayoutParams().height = iDpToPx31;
                            this.F3.getLayoutParams().height = iDpToPx31;
                            z7 = z8;
                        } else {
                            zEquals35 = this.m8.equals("Small");
                            relativeLayout32 = this.Z2;
                            if (zEquals35) {
                                relativeLayout32.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            } else {
                                relativeLayout32.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            }
                        }
                    } else if (str16.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx31;
                        this.E3.getLayoutParams().height = iDpToPx31;
                        this.F3.getLayoutParams().height = iDpToPx31;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx29;
                        this.E3.getLayoutParams().height = iDpToPx29;
                        this.F3.getLayoutParams().height = iDpToPx29;
                        z7 = z8;
                    } else {
                        zEquals34 = this.m8.equals("Small");
                        relativeLayout31 = this.Z2;
                        if (zEquals34) {
                            relativeLayout31.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            relativeLayout31.getLayoutParams().height = iDpToPx25;
                            this.E3.getLayoutParams().height = iDpToPx25;
                            this.F3.getLayoutParams().height = iDpToPx25;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 8) {
                    str15 = this.m8;
                    if (z9) {
                        if (str15.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx35;
                            this.E3.getLayoutParams().height = iDpToPx35;
                            this.F3.getLayoutParams().height = iDpToPx35;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx33;
                            this.E3.getLayoutParams().height = iDpToPx33;
                            this.F3.getLayoutParams().height = iDpToPx33;
                            z7 = z8;
                        } else {
                            zEquals33 = this.m8.equals("Small");
                            relativeLayout30 = this.Z2;
                            if (zEquals33) {
                                relativeLayout30.getLayoutParams().height = iDpToPx31;
                                this.E3.getLayoutParams().height = iDpToPx31;
                                this.F3.getLayoutParams().height = iDpToPx31;
                                z7 = z8;
                            } else {
                                relativeLayout30.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            }
                        }
                    } else if (str15.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx33;
                        this.E3.getLayoutParams().height = iDpToPx33;
                        this.F3.getLayoutParams().height = iDpToPx33;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx31;
                        this.E3.getLayoutParams().height = iDpToPx31;
                        this.F3.getLayoutParams().height = iDpToPx31;
                        z7 = z8;
                    } else {
                        zEquals32 = this.m8.equals("Small");
                        relativeLayout29 = this.Z2;
                        if (zEquals32) {
                            relativeLayout29.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else {
                            relativeLayout29.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 9) {
                    str14 = this.m8;
                    if (z9) {
                        if (str14.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx36;
                            this.E3.getLayoutParams().height = iDpToPx36;
                            this.F3.getLayoutParams().height = iDpToPx36;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx34;
                            this.E3.getLayoutParams().height = iDpToPx34;
                            this.F3.getLayoutParams().height = iDpToPx34;
                            z7 = z8;
                        } else {
                            zEquals31 = this.m8.equals("Small");
                            relativeLayout28 = this.Z2;
                            if (zEquals31) {
                                relativeLayout28.getLayoutParams().height = iDpToPx32;
                                this.E3.getLayoutParams().height = iDpToPx32;
                                this.F3.getLayoutParams().height = iDpToPx32;
                                z7 = z8;
                            } else {
                                relativeLayout28.getLayoutParams().height = iDpToPx30;
                                this.E3.getLayoutParams().height = iDpToPx30;
                                this.F3.getLayoutParams().height = iDpToPx30;
                                z7 = z8;
                            }
                        }
                    } else if (str14.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx34;
                        this.E3.getLayoutParams().height = iDpToPx34;
                        this.F3.getLayoutParams().height = iDpToPx34;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx32;
                        this.E3.getLayoutParams().height = iDpToPx32;
                        this.F3.getLayoutParams().height = iDpToPx32;
                        z7 = z8;
                    } else {
                        zEquals30 = this.m8.equals("Small");
                        relativeLayout27 = this.Z2;
                        if (zEquals30) {
                            relativeLayout27.getLayoutParams().height = iDpToPx30;
                            this.E3.getLayoutParams().height = iDpToPx30;
                            this.F3.getLayoutParams().height = iDpToPx30;
                            z7 = z8;
                        } else {
                            relativeLayout27.getLayoutParams().height = iDpToPx28;
                            this.E3.getLayoutParams().height = iDpToPx28;
                            this.F3.getLayoutParams().height = iDpToPx28;
                            z7 = z8;
                        }
                    }
                } else {
                    str13 = this.m8;
                    if (i3 == 10) {
                        if (z9) {
                            if (str13.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx37;
                                this.E3.getLayoutParams().height = iDpToPx37;
                                this.F3.getLayoutParams().height = iDpToPx37;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx35;
                                this.E3.getLayoutParams().height = iDpToPx35;
                                this.F3.getLayoutParams().height = iDpToPx35;
                                z7 = z8;
                            } else {
                                zEquals29 = this.m8.equals("Small");
                                relativeLayout26 = this.Z2;
                                if (zEquals29) {
                                    relativeLayout26.getLayoutParams().height = iDpToPx33;
                                    this.E3.getLayoutParams().height = iDpToPx33;
                                    this.F3.getLayoutParams().height = iDpToPx33;
                                    z7 = z8;
                                } else {
                                    relativeLayout26.getLayoutParams().height = iDpToPx31;
                                    this.E3.getLayoutParams().height = iDpToPx31;
                                    this.F3.getLayoutParams().height = iDpToPx31;
                                    z7 = z8;
                                }
                            }
                        } else if (str13.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx35;
                            this.E3.getLayoutParams().height = iDpToPx35;
                            this.F3.getLayoutParams().height = iDpToPx35;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx33;
                            this.E3.getLayoutParams().height = iDpToPx33;
                            this.F3.getLayoutParams().height = iDpToPx33;
                            z7 = z8;
                        } else {
                            zEquals28 = this.m8.equals("Small");
                            relativeLayout25 = this.Z2;
                            if (zEquals28) {
                                relativeLayout25.getLayoutParams().height = iDpToPx31;
                                this.E3.getLayoutParams().height = iDpToPx31;
                                this.F3.getLayoutParams().height = iDpToPx31;
                                z7 = z8;
                            } else {
                                relativeLayout25.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            }
                        }
                    } else if (z9) {
                        if (str13.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx38;
                            this.E3.getLayoutParams().height = iDpToPx38;
                            this.F3.getLayoutParams().height = iDpToPx38;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx36;
                            this.E3.getLayoutParams().height = iDpToPx36;
                            this.F3.getLayoutParams().height = iDpToPx36;
                            z7 = z8;
                        } else {
                            zEquals27 = this.m8.equals("Small");
                            relativeLayout24 = this.Z2;
                            if (zEquals27) {
                                relativeLayout24.getLayoutParams().height = iDpToPx34;
                                this.E3.getLayoutParams().height = iDpToPx34;
                                this.F3.getLayoutParams().height = iDpToPx34;
                                z7 = z8;
                            } else {
                                relativeLayout24.getLayoutParams().height = iDpToPx32;
                                this.E3.getLayoutParams().height = iDpToPx32;
                                this.F3.getLayoutParams().height = iDpToPx32;
                                z7 = z8;
                            }
                        }
                    } else if (str13.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx36;
                        this.E3.getLayoutParams().height = iDpToPx36;
                        this.F3.getLayoutParams().height = iDpToPx36;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx34;
                        this.E3.getLayoutParams().height = iDpToPx34;
                        this.F3.getLayoutParams().height = iDpToPx34;
                        z7 = z8;
                    } else {
                        zEquals26 = this.m8.equals("Small");
                        relativeLayout23 = this.Z2;
                        if (zEquals26) {
                            relativeLayout23.getLayoutParams().height = iDpToPx32;
                            this.E3.getLayoutParams().height = iDpToPx32;
                            this.F3.getLayoutParams().height = iDpToPx32;
                            z7 = z8;
                        } else {
                            relativeLayout23.getLayoutParams().height = iDpToPx30;
                            this.E3.getLayoutParams().height = iDpToPx30;
                            this.F3.getLayoutParams().height = iDpToPx30;
                            z7 = z8;
                        }
                    }
                }
            }
        } else {
            z4 = z2;
            z5 = z3 ? 1 : 0;
            obj = r15;
            this.Q.setVisibility(8);
            if (this.c4) {
                i2 = (z5 ? 1 : 0) + 1;
            } else {
                i2 = z5 ? 1 : 0;
            }
            if (z4) {
                i2++;
            }
            if (this.g4) {
                i2++;
            }
            if (this.i4 || this.j4) {
                i2++;
            }
            if (this.k4) {
                i2++;
            }
            if (this.p4) {
                i2++;
            }
            if (this.P5) {
                i2++;
            }
            if (this.s8) {
                i2++;
            }
            if (this.t8) {
                i2++;
            }
            str = this.m8;
            if (i2 < 6) {
                if (str.equals(Default.TEMPLATE_SIZE)) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else if (this.m8.equals("Small")) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 7));
                } else {
                    zEquals24 = this.m8.equals("Extra Small");
                    textView2 = this.r2;
                    if (zEquals24) {
                        textView2.setTextSize(0, HelperClass.dpToPx(this, 6));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 6));
                    } else {
                        textView2.setTextSize(0, HelperClass.dpToPx(this, 9));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    }
                }
            } else if (str.equals(Default.TEMPLATE_SIZE)) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 10));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 10));
            } else if (this.m8.equals("Small")) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 9));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
            } else {
                zEquals = this.m8.equals("Extra Small");
                textView = this.r2;
                if (zEquals) {
                    textView.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else {
                    textView.setTextSize(0, HelperClass.dpToPx(this, 11));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 11));
                }
            }
            HelperClass.dpToPx(this, 70);
            HelperClass.dpToPx(this, 75);
            HelperClass.dpToPx(this, 80);
            HelperClass.dpToPx(this, 85);
            iDpToPx = HelperClass.dpToPx(this, 90);
            iDpToPx2 = HelperClass.dpToPx(this, 95);
            iDpToPx3 = HelperClass.dpToPx(this, 100);
            iDpToPx4 = HelperClass.dpToPx(this, fh.W0);
            iDpToPx5 = HelperClass.dpToPx(this, fh.k1);
            iDpToPx6 = HelperClass.dpToPx(this, 115);
            iDpToPx7 = HelperClass.dpToPx(this, 120);
            iDpToPx8 = HelperClass.dpToPx(this, 125);
            iDpToPx9 = HelperClass.dpToPx(this, 130);
            iDpToPx10 = HelperClass.dpToPx(this, 135);
            iDpToPx11 = HelperClass.dpToPx(this, 140);
            iDpToPx12 = HelperClass.dpToPx(this, 145);
            iDpToPx13 = HelperClass.dpToPx(this, 150);
            iDpToPx14 = HelperClass.dpToPx(this, 155);
            iDpToPx15 = HelperClass.dpToPx(this, 160);
            iDpToPx16 = HelperClass.dpToPx(this, 165);
            iDpToPx17 = HelperClass.dpToPx(this, 170);
            iDpToPx18 = HelperClass.dpToPx(this, 175);
            iDpToPx19 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
            HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
            iDpToPx20 = HelperClass.dpToPx(this, 190);
            if (this.n4 || this.q4 || this.r4 || this.t4 || this.u4 || this.L5 || this.h4 || this.m4 || this.l4) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.o4) {
                str11 = this.m8;
                if (z6) {
                    if (str11.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx20;
                        this.E3.getLayoutParams().height = iDpToPx20;
                        this.F3.getLayoutParams().height = iDpToPx20;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx19;
                        this.E3.getLayoutParams().height = iDpToPx19;
                        this.F3.getLayoutParams().height = iDpToPx19;
                        z7 = z5;
                    } else {
                        zEquals23 = this.m8.equals("Small");
                        relativeLayout22 = this.Z2;
                        if (zEquals23) {
                            relativeLayout22.getLayoutParams().height = iDpToPx17;
                            this.E3.getLayoutParams().height = iDpToPx17;
                            this.F3.getLayoutParams().height = iDpToPx17;
                            z7 = z5;
                        } else {
                            relativeLayout22.getLayoutParams().height = iDpToPx15;
                            this.E3.getLayoutParams().height = iDpToPx15;
                            this.F3.getLayoutParams().height = iDpToPx15;
                            z7 = z5;
                        }
                    }
                } else if (str11.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx19;
                    this.E3.getLayoutParams().height = iDpToPx19;
                    this.F3.getLayoutParams().height = iDpToPx19;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx17;
                    this.E3.getLayoutParams().height = iDpToPx17;
                    this.F3.getLayoutParams().height = iDpToPx17;
                    z7 = z5;
                } else {
                    zEquals22 = this.m8.equals("Small");
                    relativeLayout21 = this.Z2;
                    if (zEquals22) {
                        relativeLayout21.getLayoutParams().height = iDpToPx15;
                        this.E3.getLayoutParams().height = iDpToPx15;
                        this.F3.getLayoutParams().height = iDpToPx15;
                        z7 = z5;
                    } else {
                        relativeLayout21.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    }
                }
            } else if (i2 == 2) {
                str10 = this.m8;
                if (z6) {
                    if (str10.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx10;
                        this.E3.getLayoutParams().height = iDpToPx10;
                        this.F3.getLayoutParams().height = iDpToPx10;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx8;
                        this.E3.getLayoutParams().height = iDpToPx8;
                        this.F3.getLayoutParams().height = iDpToPx8;
                        z7 = z5;
                    } else {
                        zEquals21 = this.m8.equals("Small");
                        relativeLayout20 = this.Z2;
                        if (zEquals21) {
                            relativeLayout20.getLayoutParams().height = iDpToPx6;
                            this.E3.getLayoutParams().height = iDpToPx6;
                            this.F3.getLayoutParams().height = iDpToPx6;
                            z7 = z5;
                        } else {
                            relativeLayout20.getLayoutParams().height = iDpToPx4;
                            this.E3.getLayoutParams().height = iDpToPx4;
                            this.F3.getLayoutParams().height = iDpToPx4;
                            z7 = z5;
                        }
                    }
                } else if (str10.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx8;
                    this.E3.getLayoutParams().height = iDpToPx8;
                    this.F3.getLayoutParams().height = iDpToPx8;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx6;
                    this.E3.getLayoutParams().height = iDpToPx6;
                    this.F3.getLayoutParams().height = iDpToPx6;
                    z7 = z5;
                } else {
                    zEquals20 = this.m8.equals("Small");
                    relativeLayout19 = this.Z2;
                    if (zEquals20) {
                        relativeLayout19.getLayoutParams().height = iDpToPx4;
                        this.E3.getLayoutParams().height = iDpToPx4;
                        this.F3.getLayoutParams().height = iDpToPx4;
                        z7 = z5;
                    } else {
                        relativeLayout19.getLayoutParams().height = iDpToPx2;
                        this.E3.getLayoutParams().height = iDpToPx2;
                        this.F3.getLayoutParams().height = iDpToPx2;
                        z7 = z5;
                    }
                }
            } else if (i2 == 3) {
                str9 = this.m8;
                if (z6) {
                    if (str9.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        zEquals19 = this.m8.equals("Small");
                        relativeLayout18 = this.Z2;
                        if (zEquals19) {
                            relativeLayout18.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        } else {
                            relativeLayout18.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        }
                    }
                } else if (str9.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx5;
                    this.E3.getLayoutParams().height = iDpToPx5;
                    this.F3.getLayoutParams().height = iDpToPx5;
                    z7 = z5;
                } else {
                    zEquals18 = this.m8.equals("Small");
                    relativeLayout17 = this.Z2;
                    if (zEquals18) {
                        relativeLayout17.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    } else {
                        relativeLayout17.getLayoutParams().height = iDpToPx;
                        this.E3.getLayoutParams().height = iDpToPx;
                        this.F3.getLayoutParams().height = iDpToPx;
                        z7 = z5;
                    }
                }
            } else if (i2 == 4) {
                str8 = this.m8;
                if (z6) {
                    if (str8.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        zEquals17 = this.m8.equals("Small");
                        relativeLayout16 = this.Z2;
                        if (zEquals17) {
                            relativeLayout16.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        } else {
                            relativeLayout16.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        }
                    }
                } else if (str8.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx5;
                    this.E3.getLayoutParams().height = iDpToPx5;
                    this.F3.getLayoutParams().height = iDpToPx5;
                    z7 = z5;
                } else {
                    zEquals16 = this.m8.equals("Small");
                    relativeLayout15 = this.Z2;
                    if (zEquals16) {
                        relativeLayout15.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    } else {
                        relativeLayout15.getLayoutParams().height = iDpToPx;
                        this.E3.getLayoutParams().height = iDpToPx;
                        this.F3.getLayoutParams().height = iDpToPx;
                        z7 = z5;
                    }
                }
            } else if (i2 == 5) {
                str7 = this.m8;
                if (z6) {
                    if (str7.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        zEquals15 = this.m8.equals("Small");
                        relativeLayout14 = this.Z2;
                        if (zEquals15) {
                            relativeLayout14.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        } else {
                            relativeLayout14.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        }
                    }
                } else if (str7.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx5;
                    this.E3.getLayoutParams().height = iDpToPx5;
                    this.F3.getLayoutParams().height = iDpToPx5;
                    z7 = z5;
                } else {
                    zEquals14 = this.m8.equals("Small");
                    relativeLayout13 = this.Z2;
                    if (zEquals14) {
                        relativeLayout13.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    } else {
                        relativeLayout13.getLayoutParams().height = iDpToPx;
                        this.E3.getLayoutParams().height = iDpToPx;
                        this.F3.getLayoutParams().height = iDpToPx;
                        z7 = z5;
                    }
                }
            } else if (i2 == 6) {
                str6 = this.m8;
                if (z6) {
                    if (str6.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx11;
                        this.E3.getLayoutParams().height = iDpToPx11;
                        this.F3.getLayoutParams().height = iDpToPx11;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else {
                        zEquals13 = this.m8.equals("Small");
                        relativeLayout12 = this.Z2;
                        if (zEquals13) {
                            relativeLayout12.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        } else {
                            relativeLayout12.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        }
                    }
                } else if (str6.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx9;
                    this.E3.getLayoutParams().height = iDpToPx9;
                    this.F3.getLayoutParams().height = iDpToPx9;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else {
                    zEquals12 = this.m8.equals("Small");
                    relativeLayout11 = this.Z2;
                    if (zEquals12) {
                        relativeLayout11.getLayoutParams().height = iDpToPx5;
                        this.E3.getLayoutParams().height = iDpToPx5;
                        this.F3.getLayoutParams().height = iDpToPx5;
                        z7 = z5;
                    } else {
                        relativeLayout11.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    }
                }
            } else if (i2 == 7) {
                str5 = this.m8;
                if (z6) {
                    if (str5.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx11;
                        this.E3.getLayoutParams().height = iDpToPx11;
                        this.F3.getLayoutParams().height = iDpToPx11;
                        z7 = z5;
                    } else {
                        zEquals11 = this.m8.equals("Small");
                        relativeLayout10 = this.Z2;
                        if (zEquals11) {
                            relativeLayout10.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        } else {
                            relativeLayout10.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        }
                    }
                } else if (str5.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx11;
                    this.E3.getLayoutParams().height = iDpToPx11;
                    this.F3.getLayoutParams().height = iDpToPx11;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx9;
                    this.E3.getLayoutParams().height = iDpToPx9;
                    this.F3.getLayoutParams().height = iDpToPx9;
                    z7 = z5;
                } else {
                    zEquals10 = this.m8.equals("Small");
                    relativeLayout9 = this.Z2;
                    if (zEquals10) {
                        relativeLayout9.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        relativeLayout9.getLayoutParams().height = iDpToPx5;
                        this.E3.getLayoutParams().height = iDpToPx5;
                        this.F3.getLayoutParams().height = iDpToPx5;
                        z7 = z5;
                    }
                }
            } else if (i2 == 8) {
                str4 = this.m8;
                if (z6) {
                    if (str4.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx15;
                        this.E3.getLayoutParams().height = iDpToPx15;
                        this.F3.getLayoutParams().height = iDpToPx15;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    } else {
                        zEquals9 = this.m8.equals("Small");
                        relativeLayout8 = this.Z2;
                        if (zEquals9) {
                            relativeLayout8.getLayoutParams().height = iDpToPx11;
                            this.E3.getLayoutParams().height = iDpToPx11;
                            this.F3.getLayoutParams().height = iDpToPx11;
                            z7 = z5;
                        } else {
                            relativeLayout8.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        }
                    }
                } else if (str4.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx13;
                    this.E3.getLayoutParams().height = iDpToPx13;
                    this.F3.getLayoutParams().height = iDpToPx13;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx11;
                    this.E3.getLayoutParams().height = iDpToPx11;
                    this.F3.getLayoutParams().height = iDpToPx11;
                    z7 = z5;
                } else {
                    zEquals8 = this.m8.equals("Small");
                    relativeLayout7 = this.Z2;
                    if (zEquals8) {
                        relativeLayout7.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else {
                        relativeLayout7.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    }
                }
            } else if (i2 == 9) {
                str3 = this.m8;
                if (z6) {
                    if (str3.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx16;
                        this.E3.getLayoutParams().height = iDpToPx16;
                        this.F3.getLayoutParams().height = iDpToPx16;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx14;
                        this.E3.getLayoutParams().height = iDpToPx14;
                        this.F3.getLayoutParams().height = iDpToPx14;
                        z7 = z5;
                    } else {
                        zEquals7 = this.m8.equals("Small");
                        relativeLayout6 = this.Z2;
                        if (zEquals7) {
                            relativeLayout6.getLayoutParams().height = iDpToPx12;
                            this.E3.getLayoutParams().height = iDpToPx12;
                            this.F3.getLayoutParams().height = iDpToPx12;
                            z7 = z5;
                        } else {
                            relativeLayout6.getLayoutParams().height = iDpToPx10;
                            this.E3.getLayoutParams().height = iDpToPx10;
                            this.F3.getLayoutParams().height = iDpToPx10;
                            z7 = z5;
                        }
                    }
                } else if (str3.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx14;
                    this.E3.getLayoutParams().height = iDpToPx14;
                    this.F3.getLayoutParams().height = iDpToPx14;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx12;
                    this.E3.getLayoutParams().height = iDpToPx12;
                    this.F3.getLayoutParams().height = iDpToPx12;
                    z7 = z5;
                } else {
                    zEquals6 = this.m8.equals("Small");
                    relativeLayout5 = this.Z2;
                    if (zEquals6) {
                        relativeLayout5.getLayoutParams().height = iDpToPx10;
                        this.E3.getLayoutParams().height = iDpToPx10;
                        this.F3.getLayoutParams().height = iDpToPx10;
                        z7 = z5;
                    } else {
                        relativeLayout5.getLayoutParams().height = iDpToPx8;
                        this.E3.getLayoutParams().height = iDpToPx8;
                        this.F3.getLayoutParams().height = iDpToPx8;
                        z7 = z5;
                    }
                }
            } else {
                str2 = this.m8;
                if (i2 == 10) {
                    if (z6) {
                        if (str2.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx17;
                            this.E3.getLayoutParams().height = iDpToPx17;
                            this.F3.getLayoutParams().height = iDpToPx17;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx15;
                            this.E3.getLayoutParams().height = iDpToPx15;
                            this.F3.getLayoutParams().height = iDpToPx15;
                            z7 = z5;
                        } else {
                            zEquals5 = this.m8.equals("Small");
                            relativeLayout4 = this.Z2;
                            if (zEquals5) {
                                relativeLayout4.getLayoutParams().height = iDpToPx13;
                                this.E3.getLayoutParams().height = iDpToPx13;
                                this.F3.getLayoutParams().height = iDpToPx13;
                                z7 = z5;
                            } else {
                                relativeLayout4.getLayoutParams().height = iDpToPx11;
                                this.E3.getLayoutParams().height = iDpToPx11;
                                this.F3.getLayoutParams().height = iDpToPx11;
                                z7 = z5;
                            }
                        }
                    } else if (str2.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx15;
                        this.E3.getLayoutParams().height = iDpToPx15;
                        this.F3.getLayoutParams().height = iDpToPx15;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    } else {
                        zEquals4 = this.m8.equals("Small");
                        relativeLayout3 = this.Z2;
                        if (zEquals4) {
                            relativeLayout3.getLayoutParams().height = iDpToPx11;
                            this.E3.getLayoutParams().height = iDpToPx11;
                            this.F3.getLayoutParams().height = iDpToPx11;
                            z7 = z5;
                        } else {
                            relativeLayout3.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        }
                    }
                } else if (z6) {
                    if (str2.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx18;
                        this.E3.getLayoutParams().height = iDpToPx18;
                        this.F3.getLayoutParams().height = iDpToPx18;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx16;
                        this.E3.getLayoutParams().height = iDpToPx16;
                        this.F3.getLayoutParams().height = iDpToPx16;
                        z7 = z5;
                    } else {
                        zEquals3 = this.m8.equals("Small");
                        relativeLayout2 = this.Z2;
                        if (zEquals3) {
                            relativeLayout2.getLayoutParams().height = iDpToPx14;
                            this.E3.getLayoutParams().height = iDpToPx14;
                            this.F3.getLayoutParams().height = iDpToPx14;
                            z7 = z5;
                        } else {
                            relativeLayout2.getLayoutParams().height = iDpToPx12;
                            this.E3.getLayoutParams().height = iDpToPx12;
                            this.F3.getLayoutParams().height = iDpToPx12;
                            z7 = z5;
                        }
                    }
                } else if (str2.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx16;
                    this.E3.getLayoutParams().height = iDpToPx16;
                    this.F3.getLayoutParams().height = iDpToPx16;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx14;
                    this.E3.getLayoutParams().height = iDpToPx14;
                    this.F3.getLayoutParams().height = iDpToPx14;
                    z7 = z5;
                } else {
                    zEquals2 = this.m8.equals("Small");
                    relativeLayout = this.Z2;
                    if (zEquals2) {
                        relativeLayout.getLayoutParams().height = iDpToPx12;
                        this.E3.getLayoutParams().height = iDpToPx12;
                        this.F3.getLayoutParams().height = iDpToPx12;
                        z7 = z5;
                    } else {
                        relativeLayout.getLayoutParams().height = iDpToPx10;
                        this.E3.getLayoutParams().height = iDpToPx10;
                        this.F3.getLayoutParams().height = iDpToPx10;
                        z7 = z5;
                    }
                }
            }
        }
        if (this.c4 || z7 || z4 || this.i4 || this.p4 || this.n4 || this.q4 || this.u4 || this.L5 || this.r4 || this.t4 || this.j4 || this.k4 || this.g4 || this.P5) {
            this.Y2.setVisibility(0);
        } else {
            this.Y2.setVisibility(8);
            if (this.o4 && !this.b4) {
                boolean zEquals52 = this.m8.equals(obj);
                RelativeLayout relativeLayout47 = this.Z2;
                if (zEquals52) {
                    relativeLayout47.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_80dp);
                } else {
                    relativeLayout47.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_40);
                }
            }
        }
        if (z4 || this.c4 || z7 || this.l4 || this.h4 || this.m4 || this.i4 || this.b4 || this.p4 || this.n4 || this.q4 || this.u4 || this.L5 || this.r4 || this.t4 || this.o4 || this.j4 || this.k4 || this.g4 || this.P5) {
            this.X2.setVisibility(0);
            J();
        } else {
            this.X2.setVisibility(8);
        }
        if (z4 || this.c4 || z7 || this.i4 || this.p4 || this.j4 || this.k4 || this.g4 || this.P5) {
            this.q2.setVisibility(0);
        } else {
            this.q2.setVisibility(8);
        }
        if (this.b4 || this.c4 || z7 || this.m4 || this.i4 || z4 || this.l4 || this.h4 || this.p4 || this.n4 || this.q4 || this.u4 || this.L5 || this.r4 || this.t4 || this.o4 || this.j4 || this.k4 || this.g4 || this.P5) {
            this.Z2.setVisibility(0);
        } else {
            this.Z2.setVisibility(4);
        }
        this.a3.setVisibility(8);
        this.b3.setVisibility(8);
        this.Z2.setBackground(getDrawable(R.drawable.rect_grey));
        this.E3.setBackground(getDrawable(R.drawable.rect_grey_6));
        this.F3.setBackground(getDrawable(R.drawable.rect_grey_6));
        this.t2.setBackground(getDrawable(R.drawable.rect_grey_8));
        this.u2.setBackground(getDrawable(R.drawable.rect_grey_8));
        ((GradientDrawable) this.E3.getBackground().getCurrent()).setColor(this.k5);
        ((GradientDrawable) this.F3.getBackground().getCurrent()).setColor(this.k5);
        ((GradientDrawable) this.Z2.getBackground().getCurrent()).setColor(this.k5);
        ((GradientDrawable) this.u2.getBackground().getCurrent()).setColor(this.r7);
        ((GradientDrawable) this.t2.getBackground().getCurrent()).setColor(this.r7);
        this.t2.setTextColor(this.q7);
        this.u2.setTextColor(this.q7);
        this.r2.setTextColor(this.L6);
        this.s2.setTextColor(this.L6);
        C();
        f = 7.0f;
        i = 2;
        if (this.t4) {
            LinearLayout linearLayout18 = new LinearLayout(this);
            linearLayout18.setOrientation(0);
            GridLayout.LayoutParams layoutParams27 = new GridLayout.LayoutParams();
            layoutParams27.width = 0;
            layoutParams27.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams27.setMargins(0, 0, 0, i);
            linearLayout18.setLayoutParams(layoutParams27);
            linearLayout18.setGravity(8388611);
            ImageView imageView19 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams28.setMarginEnd(6);
            imageView19.setLayoutParams(layoutParams28);
            imageView19.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView19.setImageResource(R.drawable.ic_altitiude);
            TextView textView111 = new TextView(this);
            textView111.setText(HelperClass.getAltitudeconvert(this, this.U7));
            textView111.setTextSize(f);
            textView111.setTextColor(this.f7);
            textView111.setSingleLine(true);
            textView111.setEllipsize(TextUtils.TruncateAt.END);
            textView111.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout18.addView(imageView19);
            linearLayout18.addView(textView111);
            this.G3.addView(linearLayout18);
        }
        if (this.h4) {
            LinearLayout linearLayout19 = new LinearLayout(this);
            linearLayout19.setOrientation(0);
            GridLayout.LayoutParams layoutParams29 = new GridLayout.LayoutParams();
            layoutParams29.width = 0;
            layoutParams29.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams29.setMargins(0, 0, 0, i);
            linearLayout19.setLayoutParams(layoutParams29);
            linearLayout19.setGravity(8388611);
            ImageView imageView110 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams210 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams210.setMarginEnd(6);
            imageView110.setLayoutParams(layoutParams210);
            imageView110.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int integer3 = this.T8.getInteger(this, SP.WEATHER_ICON, 0);
            this.i8 = integer3;
            imageView110.setImageResource(this.r8.getResourceId(integer3, 0));
            textView5 = new TextView(this);
            zEquals49 = this.C8.equals("Celsius");
            f2 = this.h8;
            if (zEquals49) {
                textView5.setText(HelperClass.getCelcius(f2));
            } else {
                textView5.setText(HelperClass.getFahrenheit(f2));
            }
            textView5.setTextSize(f);
            textView5.setTextColor(this.D6);
            textView5.setSingleLine(true);
            textView5.setEllipsize(TextUtils.TruncateAt.END);
            textView5.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout19.addView(imageView110);
            linearLayout19.addView(textView5);
            this.G3.addView(linearLayout19);
        }
        if (this.l4) {
            LinearLayout linearLayout110 = new LinearLayout(this);
            linearLayout110.setOrientation(0);
            GridLayout.LayoutParams layoutParams211 = new GridLayout.LayoutParams();
            layoutParams211.width = 0;
            layoutParams211.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams211.setMargins(0, 0, 0, i);
            linearLayout110.setLayoutParams(layoutParams211);
            linearLayout110.setGravity(8388611);
            ImageView imageView111 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams1110 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams1110.setMarginEnd(6);
            imageView111.setLayoutParams(layoutParams1110);
            imageView111.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView111.setImageResource(R.drawable.ic_magnetic_field);
            TextView textView112 = new TextView(this);
            textView112.setText(this.T8.getString(this, zUHsDp.mNYgW, "-"));
            textView112.setTextSize(f);
            textView112.setTextColor(this.H6);
            textView112.setSingleLine(true);
            textView112.setEllipsize(TextUtils.TruncateAt.END);
            textView112.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout110.addView(imageView111);
            linearLayout110.addView(textView112);
            this.G3.addView(linearLayout110);
        }
        if (this.n4) {
            LinearLayout linearLayout111 = new LinearLayout(this);
            linearLayout111.setOrientation(0);
            GridLayout.LayoutParams layoutParams1111 = new GridLayout.LayoutParams();
            layoutParams1111.width = 0;
            layoutParams1111.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams1111.setMargins(0, 0, 0, i);
            linearLayout111.setLayoutParams(layoutParams1111);
            linearLayout111.setGravity(8388611);
            ImageView imageView112 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams1112 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams1112.setMarginEnd(6);
            imageView112.setLayoutParams(layoutParams1112);
            imageView112.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView112.setImageResource(R.drawable.ic_wind);
            TextView textView113 = new TextView(this);
            textView113.setText(HelperClass.getwindConvert(this, this.Q7));
            textView113.setTextSize(f);
            textView113.setTextColor(this.T6);
            textView113.setSingleLine(true);
            textView113.setEllipsize(TextUtils.TruncateAt.END);
            textView113.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout111.addView(imageView112);
            linearLayout111.addView(textView113);
            this.G3.addView(linearLayout111);
        }
        if (this.q4) {
            LinearLayout linearLayout112 = new LinearLayout(this);
            linearLayout112.setOrientation(0);
            GridLayout.LayoutParams layoutParams1113 = new GridLayout.LayoutParams();
            layoutParams1113.width = 0;
            layoutParams1113.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams1113.setMargins(0, 0, 0, i);
            linearLayout112.setLayoutParams(layoutParams1113);
            linearLayout112.setGravity(8388611);
            ImageView imageView113 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams1114 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams1114.setMarginEnd(6);
            imageView113.setLayoutParams(layoutParams1114);
            imageView113.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView113.setImageResource(R.drawable.ic_humidity);
            TextView textView114 = new TextView(this);
            textView114.setText(this.T8.getString(this, SP.HUMIDITY_VALUE, "") + "%");
            textView114.setTextSize(f);
            textView114.setTextColor(this.X6);
            String str26 = this.G8;
            textView114.setSingleLine(true);
            textView114.setEllipsize(TextUtils.TruncateAt.END);
            textView114.setTypeface(HelperClass.getFontStyle(this, str26));
            linearLayout112.addView(imageView113);
            linearLayout112.addView(textView114);
            this.G3.addView(linearLayout112);
        }
        if (this.r4) {
            LinearLayout linearLayout113 = new LinearLayout(this);
            linearLayout113.setOrientation(0);
            GridLayout.LayoutParams layoutParams1115 = new GridLayout.LayoutParams();
            layoutParams1115.width = 0;
            layoutParams1115.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams1115.setMargins(0, 0, 0, i);
            linearLayout113.setLayoutParams(layoutParams1115);
            linearLayout113.setGravity(8388611);
            ImageView imageView114 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams1116 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams1116.setMarginEnd(6);
            imageView114.setLayoutParams(layoutParams1116);
            imageView114.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView114.setImageResource(R.drawable.ic_pressure);
            TextView textView115 = new TextView(this);
            textView115.setText(HelperClass.getpressureConvert(this, this.c8));
            textView115.setTextSize(f);
            textView115.setTextColor(this.b7);
            textView115.setSingleLine(true);
            textView115.setEllipsize(TextUtils.TruncateAt.END);
            textView115.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout113.addView(imageView114);
            linearLayout113.addView(textView115);
            this.G3.addView(linearLayout113);
        }
        if (this.u4) {
            LinearLayout linearLayout114 = new LinearLayout(this);
            linearLayout114.setOrientation(0);
            GridLayout.LayoutParams layoutParams1117 = new GridLayout.LayoutParams();
            layoutParams1117.width = 0;
            layoutParams1117.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams1117.setMargins(0, 0, 0, i);
            linearLayout114.setLayoutParams(layoutParams1117);
            linearLayout114.setGravity(8388611);
            ImageView imageView115 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams1118 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams1118.setMarginEnd(6);
            imageView115.setLayoutParams(layoutParams1118);
            imageView115.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView115.setImageResource(R.drawable.ic_accuracy);
            TextView textView116 = new TextView(this);
            textView116.setText(HelperClass.getAccuracy(this, this.Y7));
            textView116.setTextSize(f);
            textView116.setTextColor(this.j7);
            textView116.setSingleLine(true);
            textView116.setEllipsize(TextUtils.TruncateAt.END);
            textView116.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout114.addView(imageView115);
            linearLayout114.addView(textView116);
            this.G3.addView(linearLayout114);
        }
        if (this.L5) {
            LinearLayout linearLayout115 = new LinearLayout(this);
            linearLayout115.setOrientation(0);
            GridLayout.LayoutParams layoutParams1119 = new GridLayout.LayoutParams();
            layoutParams1119.width = 0;
            layoutParams1119.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams1119.setMargins(0, 0, 0, i);
            linearLayout115.setLayoutParams(layoutParams1119);
            linearLayout115.setGravity(8388611);
            ImageView imageView116 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams212 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams212.setMarginEnd(6);
            imageView116.setLayoutParams(layoutParams212);
            imageView116.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView116.setImageResource(R.drawable.sound_wave);
            TextView textView117 = new TextView(this);
            textView117.setText(HelperClass.getSoundLevel(this));
            textView117.setTextSize(f);
            textView117.setTextColor(this.r6);
            textView117.setSingleLine(true);
            textView117.setEllipsize(TextUtils.TruncateAt.END);
            textView117.setTypeface(HelperClass.getFontStyle(this, this.G8));
            linearLayout115.addView(imageView116);
            linearLayout115.addView(textView117);
            this.G3.addView(linearLayout115);
        }
        z = this.b4;
        z2 = this.e4;
        z3 = this.d4;
        if (z) {
            if (this.c4) {
                i3 = (z3 ? 1 : 0) + 1;
            } else {
                i3 = z3 ? 1 : 0;
            }
            if (z2) {
                i3++;
            }
            if (this.g4) {
                i3++;
            }
            if (this.i4) {
                i3++;
            } else {
                i3++;
            }
            if (this.k4) {
                i3++;
            }
            if (this.p4) {
                i3++;
            }
            if (this.P5) {
                i3++;
            }
            if (this.s8) {
                i3++;
            }
            if (this.t8) {
                i3++;
            }
            str12 = this.m8;
            if (i3 < 6) {
                if (str12.equals(Default.TEMPLATE_SIZE)) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else if (this.m8.equals("Small")) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 7));
                } else {
                    zEquals48 = this.m8.equals("Extra Small");
                    textView4 = this.r2;
                    if (zEquals48) {
                        textView4.setTextSize(0, HelperClass.dpToPx(this, 6));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 6));
                    } else {
                        textView4.setTextSize(0, HelperClass.dpToPx(this, 9));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    }
                }
            } else if (str12.equals(Default.TEMPLATE_SIZE)) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 10));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 10));
            } else if (this.m8.equals("Small")) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 9));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
            } else {
                zEquals25 = this.m8.equals("Extra Small");
                textView3 = this.r2;
                if (zEquals25) {
                    textView3.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else {
                    textView3.setTextSize(0, HelperClass.dpToPx(this, 11));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 11));
                }
            }
            HelperClass.dpToPx(this, 70);
            HelperClass.dpToPx(this, 75);
            HelperClass.dpToPx(this, 80);
            HelperClass.dpToPx(this, 85);
            iDpToPx21 = HelperClass.dpToPx(this, 90);
            iDpToPx22 = HelperClass.dpToPx(this, 95);
            iDpToPx23 = HelperClass.dpToPx(this, 100);
            iDpToPx24 = HelperClass.dpToPx(this, fh.W0);
            iDpToPx25 = HelperClass.dpToPx(this, fh.k1);
            iDpToPx26 = HelperClass.dpToPx(this, 115);
            iDpToPx27 = HelperClass.dpToPx(this, 120);
            iDpToPx28 = HelperClass.dpToPx(this, 125);
            iDpToPx29 = HelperClass.dpToPx(this, 130);
            iDpToPx30 = HelperClass.dpToPx(this, 135);
            z4 = z2;
            iDpToPx31 = HelperClass.dpToPx(this, 140);
            z8 = z3 ? 1 : 0;
            iDpToPx32 = HelperClass.dpToPx(this, 145);
            iDpToPx33 = HelperClass.dpToPx(this, 150);
            iDpToPx34 = HelperClass.dpToPx(this, 155);
            iDpToPx35 = HelperClass.dpToPx(this, 160);
            iDpToPx36 = HelperClass.dpToPx(this, 165);
            iDpToPx37 = HelperClass.dpToPx(this, 170);
            iDpToPx38 = HelperClass.dpToPx(this, 175);
            iDpToPx39 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
            HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
            iDpToPx40 = HelperClass.dpToPx(this, 190);
            HelperClass.dpToPx(this, 195);
            iDpToPx41 = HelperClass.dpToPx(this, PdfContentParser.COMMAND_TYPE);
            HelperClass.dpToPx(this, 205);
            iDpToPx42 = HelperClass.dpToPx(this, 210);
            HelperClass.dpToPx(this, 215);
            HelperClass.dpToPx(this, 220);
            HelperClass.dpToPx(this, 225);
            HelperClass.dpToPx(this, 230);
            if (this.n4) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (this.o4) {
                str22 = this.m8;
                if (z9) {
                    obj = "Large";
                    if (str22.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx42;
                        this.E3.getLayoutParams().height = iDpToPx42;
                        this.F3.getLayoutParams().height = iDpToPx42;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx41;
                        this.E3.getLayoutParams().height = iDpToPx41;
                        this.F3.getLayoutParams().height = iDpToPx41;
                        z7 = z8;
                    } else {
                        zEquals47 = this.m8.equals("Small");
                        relativeLayout44 = this.Z2;
                        if (zEquals47) {
                            relativeLayout44.getLayoutParams().height = iDpToPx40;
                            this.E3.getLayoutParams().height = iDpToPx40;
                            this.F3.getLayoutParams().height = iDpToPx40;
                            z7 = z8;
                        } else {
                            relativeLayout44.getLayoutParams().height = iDpToPx39;
                            this.E3.getLayoutParams().height = iDpToPx39;
                            this.F3.getLayoutParams().height = iDpToPx39;
                            z7 = z8;
                        }
                    }
                } else {
                    obj = r15;
                    if (str22.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx41;
                        this.E3.getLayoutParams().height = iDpToPx41;
                        this.F3.getLayoutParams().height = iDpToPx41;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx40;
                        this.E3.getLayoutParams().height = iDpToPx40;
                        this.F3.getLayoutParams().height = iDpToPx40;
                        z7 = z8;
                    } else {
                        zEquals46 = this.m8.equals("Small");
                        relativeLayout43 = this.Z2;
                        if (zEquals46) {
                            relativeLayout43.getLayoutParams().height = iDpToPx39;
                            this.E3.getLayoutParams().height = iDpToPx39;
                            this.F3.getLayoutParams().height = iDpToPx39;
                            z7 = z8;
                        } else {
                            relativeLayout43.getLayoutParams().height = iDpToPx37;
                            this.E3.getLayoutParams().height = iDpToPx37;
                            this.F3.getLayoutParams().height = iDpToPx37;
                            z7 = z8;
                        }
                    }
                }
            } else {
                obj = r15;
                if (i3 == 2) {
                    str21 = this.m8;
                    if (z9) {
                        if (str21.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx30;
                            this.E3.getLayoutParams().height = iDpToPx30;
                            this.F3.getLayoutParams().height = iDpToPx30;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx28;
                            this.E3.getLayoutParams().height = iDpToPx28;
                            this.F3.getLayoutParams().height = iDpToPx28;
                            z7 = z8;
                        } else {
                            zEquals45 = this.m8.equals("Small");
                            relativeLayout42 = this.Z2;
                            if (zEquals45) {
                                relativeLayout42.getLayoutParams().height = iDpToPx26;
                                this.E3.getLayoutParams().height = iDpToPx26;
                                this.F3.getLayoutParams().height = iDpToPx26;
                                z7 = z8;
                            } else {
                                relativeLayout42.getLayoutParams().height = iDpToPx24;
                                this.E3.getLayoutParams().height = iDpToPx24;
                                this.F3.getLayoutParams().height = iDpToPx24;
                                z7 = z8;
                            }
                        }
                    } else if (str21.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx28;
                        this.E3.getLayoutParams().height = iDpToPx28;
                        this.F3.getLayoutParams().height = iDpToPx28;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx26;
                        this.E3.getLayoutParams().height = iDpToPx26;
                        this.F3.getLayoutParams().height = iDpToPx26;
                        z7 = z8;
                    } else {
                        zEquals44 = this.m8.equals("Small");
                        relativeLayout41 = this.Z2;
                        if (zEquals44) {
                            relativeLayout41.getLayoutParams().height = iDpToPx24;
                            this.E3.getLayoutParams().height = iDpToPx24;
                            this.F3.getLayoutParams().height = iDpToPx24;
                            z7 = z8;
                        } else {
                            relativeLayout41.getLayoutParams().height = iDpToPx22;
                            this.E3.getLayoutParams().height = iDpToPx22;
                            this.F3.getLayoutParams().height = iDpToPx22;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 3) {
                    str20 = this.m8;
                    if (z9) {
                        if (str20.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            zEquals43 = this.m8.equals("Small");
                            relativeLayout40 = this.Z2;
                            if (zEquals43) {
                                relativeLayout40.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            } else {
                                relativeLayout40.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            }
                        }
                    } else if (str20.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx25;
                        this.E3.getLayoutParams().height = iDpToPx25;
                        this.F3.getLayoutParams().height = iDpToPx25;
                        z7 = z8;
                    } else {
                        zEquals42 = this.m8.equals("Small");
                        relativeLayout39 = this.Z2;
                        if (zEquals42) {
                            relativeLayout39.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        } else {
                            relativeLayout39.getLayoutParams().height = iDpToPx21;
                            this.E3.getLayoutParams().height = iDpToPx21;
                            this.F3.getLayoutParams().height = iDpToPx21;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 4) {
                    str19 = this.m8;
                    if (z9) {
                        if (str19.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            zEquals41 = this.m8.equals("Small");
                            relativeLayout38 = this.Z2;
                            if (zEquals41) {
                                relativeLayout38.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            } else {
                                relativeLayout38.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            }
                        }
                    } else if (str19.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx25;
                        this.E3.getLayoutParams().height = iDpToPx25;
                        this.F3.getLayoutParams().height = iDpToPx25;
                        z7 = z8;
                    } else {
                        zEquals40 = this.m8.equals("Small");
                        relativeLayout37 = this.Z2;
                        if (zEquals40) {
                            relativeLayout37.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        } else {
                            relativeLayout37.getLayoutParams().height = iDpToPx21;
                            this.E3.getLayoutParams().height = iDpToPx21;
                            this.F3.getLayoutParams().height = iDpToPx21;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 5) {
                    str18 = this.m8;
                    if (z9) {
                        if (str18.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            zEquals39 = this.m8.equals("Small");
                            relativeLayout36 = this.Z2;
                            if (zEquals39) {
                                relativeLayout36.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            } else {
                                relativeLayout36.getLayoutParams().height = iDpToPx23;
                                this.E3.getLayoutParams().height = iDpToPx23;
                                this.F3.getLayoutParams().height = iDpToPx23;
                                z7 = z8;
                            }
                        }
                    } else if (str18.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx25;
                        this.E3.getLayoutParams().height = iDpToPx25;
                        this.F3.getLayoutParams().height = iDpToPx25;
                        z7 = z8;
                    } else {
                        zEquals38 = this.m8.equals("Small");
                        relativeLayout35 = this.Z2;
                        if (zEquals38) {
                            relativeLayout35.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        } else {
                            relativeLayout35.getLayoutParams().height = iDpToPx21;
                            this.E3.getLayoutParams().height = iDpToPx21;
                            this.F3.getLayoutParams().height = iDpToPx21;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 6) {
                    str17 = this.m8;
                    if (z9) {
                        if (str17.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx31;
                            this.E3.getLayoutParams().height = iDpToPx31;
                            this.F3.getLayoutParams().height = iDpToPx31;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else {
                            zEquals37 = this.m8.equals("Small");
                            relativeLayout34 = this.Z2;
                            if (zEquals37) {
                                relativeLayout34.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            } else {
                                relativeLayout34.getLayoutParams().height = iDpToPx25;
                                this.E3.getLayoutParams().height = iDpToPx25;
                                this.F3.getLayoutParams().height = iDpToPx25;
                                z7 = z8;
                            }
                        }
                    } else if (str17.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx29;
                        this.E3.getLayoutParams().height = iDpToPx29;
                        this.F3.getLayoutParams().height = iDpToPx29;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx27;
                        this.E3.getLayoutParams().height = iDpToPx27;
                        this.F3.getLayoutParams().height = iDpToPx27;
                        z7 = z8;
                    } else {
                        zEquals36 = this.m8.equals("Small");
                        relativeLayout33 = this.Z2;
                        if (zEquals36) {
                            relativeLayout33.getLayoutParams().height = iDpToPx25;
                            this.E3.getLayoutParams().height = iDpToPx25;
                            this.F3.getLayoutParams().height = iDpToPx25;
                            z7 = z8;
                        } else {
                            relativeLayout33.getLayoutParams().height = iDpToPx23;
                            this.E3.getLayoutParams().height = iDpToPx23;
                            this.F3.getLayoutParams().height = iDpToPx23;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 7) {
                    str16 = this.m8;
                    if (z9) {
                        if (str16.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx33;
                            this.E3.getLayoutParams().height = iDpToPx33;
                            this.F3.getLayoutParams().height = iDpToPx33;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx31;
                            this.E3.getLayoutParams().height = iDpToPx31;
                            this.F3.getLayoutParams().height = iDpToPx31;
                            z7 = z8;
                        } else {
                            zEquals35 = this.m8.equals("Small");
                            relativeLayout32 = this.Z2;
                            if (zEquals35) {
                                relativeLayout32.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            } else {
                                relativeLayout32.getLayoutParams().height = iDpToPx27;
                                this.E3.getLayoutParams().height = iDpToPx27;
                                this.F3.getLayoutParams().height = iDpToPx27;
                                z7 = z8;
                            }
                        }
                    } else if (str16.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx31;
                        this.E3.getLayoutParams().height = iDpToPx31;
                        this.F3.getLayoutParams().height = iDpToPx31;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx29;
                        this.E3.getLayoutParams().height = iDpToPx29;
                        this.F3.getLayoutParams().height = iDpToPx29;
                        z7 = z8;
                    } else {
                        zEquals34 = this.m8.equals("Small");
                        relativeLayout31 = this.Z2;
                        if (zEquals34) {
                            relativeLayout31.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        } else {
                            relativeLayout31.getLayoutParams().height = iDpToPx25;
                            this.E3.getLayoutParams().height = iDpToPx25;
                            this.F3.getLayoutParams().height = iDpToPx25;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 8) {
                    str15 = this.m8;
                    if (z9) {
                        if (str15.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx35;
                            this.E3.getLayoutParams().height = iDpToPx35;
                            this.F3.getLayoutParams().height = iDpToPx35;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx33;
                            this.E3.getLayoutParams().height = iDpToPx33;
                            this.F3.getLayoutParams().height = iDpToPx33;
                            z7 = z8;
                        } else {
                            zEquals33 = this.m8.equals("Small");
                            relativeLayout30 = this.Z2;
                            if (zEquals33) {
                                relativeLayout30.getLayoutParams().height = iDpToPx31;
                                this.E3.getLayoutParams().height = iDpToPx31;
                                this.F3.getLayoutParams().height = iDpToPx31;
                                z7 = z8;
                            } else {
                                relativeLayout30.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            }
                        }
                    } else if (str15.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx33;
                        this.E3.getLayoutParams().height = iDpToPx33;
                        this.F3.getLayoutParams().height = iDpToPx33;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx31;
                        this.E3.getLayoutParams().height = iDpToPx31;
                        this.F3.getLayoutParams().height = iDpToPx31;
                        z7 = z8;
                    } else {
                        zEquals32 = this.m8.equals("Small");
                        relativeLayout29 = this.Z2;
                        if (zEquals32) {
                            relativeLayout29.getLayoutParams().height = iDpToPx29;
                            this.E3.getLayoutParams().height = iDpToPx29;
                            this.F3.getLayoutParams().height = iDpToPx29;
                            z7 = z8;
                        } else {
                            relativeLayout29.getLayoutParams().height = iDpToPx27;
                            this.E3.getLayoutParams().height = iDpToPx27;
                            this.F3.getLayoutParams().height = iDpToPx27;
                            z7 = z8;
                        }
                    }
                } else if (i3 == 9) {
                    str14 = this.m8;
                    if (z9) {
                        if (str14.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx36;
                            this.E3.getLayoutParams().height = iDpToPx36;
                            this.F3.getLayoutParams().height = iDpToPx36;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx34;
                            this.E3.getLayoutParams().height = iDpToPx34;
                            this.F3.getLayoutParams().height = iDpToPx34;
                            z7 = z8;
                        } else {
                            zEquals31 = this.m8.equals("Small");
                            relativeLayout28 = this.Z2;
                            if (zEquals31) {
                                relativeLayout28.getLayoutParams().height = iDpToPx32;
                                this.E3.getLayoutParams().height = iDpToPx32;
                                this.F3.getLayoutParams().height = iDpToPx32;
                                z7 = z8;
                            } else {
                                relativeLayout28.getLayoutParams().height = iDpToPx30;
                                this.E3.getLayoutParams().height = iDpToPx30;
                                this.F3.getLayoutParams().height = iDpToPx30;
                                z7 = z8;
                            }
                        }
                    } else if (str14.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx34;
                        this.E3.getLayoutParams().height = iDpToPx34;
                        this.F3.getLayoutParams().height = iDpToPx34;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx32;
                        this.E3.getLayoutParams().height = iDpToPx32;
                        this.F3.getLayoutParams().height = iDpToPx32;
                        z7 = z8;
                    } else {
                        zEquals30 = this.m8.equals("Small");
                        relativeLayout27 = this.Z2;
                        if (zEquals30) {
                            relativeLayout27.getLayoutParams().height = iDpToPx30;
                            this.E3.getLayoutParams().height = iDpToPx30;
                            this.F3.getLayoutParams().height = iDpToPx30;
                            z7 = z8;
                        } else {
                            relativeLayout27.getLayoutParams().height = iDpToPx28;
                            this.E3.getLayoutParams().height = iDpToPx28;
                            this.F3.getLayoutParams().height = iDpToPx28;
                            z7 = z8;
                        }
                    }
                } else {
                    str13 = this.m8;
                    if (i3 == 10) {
                        if (z9) {
                            if (str13.equals(obj)) {
                                this.Z2.getLayoutParams().height = iDpToPx37;
                                this.E3.getLayoutParams().height = iDpToPx37;
                                this.F3.getLayoutParams().height = iDpToPx37;
                                z7 = z8;
                            } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                                this.Z2.getLayoutParams().height = iDpToPx35;
                                this.E3.getLayoutParams().height = iDpToPx35;
                                this.F3.getLayoutParams().height = iDpToPx35;
                                z7 = z8;
                            } else {
                                zEquals29 = this.m8.equals("Small");
                                relativeLayout26 = this.Z2;
                                if (zEquals29) {
                                    relativeLayout26.getLayoutParams().height = iDpToPx33;
                                    this.E3.getLayoutParams().height = iDpToPx33;
                                    this.F3.getLayoutParams().height = iDpToPx33;
                                    z7 = z8;
                                } else {
                                    relativeLayout26.getLayoutParams().height = iDpToPx31;
                                    this.E3.getLayoutParams().height = iDpToPx31;
                                    this.F3.getLayoutParams().height = iDpToPx31;
                                    z7 = z8;
                                }
                            }
                        } else if (str13.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx35;
                            this.E3.getLayoutParams().height = iDpToPx35;
                            this.F3.getLayoutParams().height = iDpToPx35;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx33;
                            this.E3.getLayoutParams().height = iDpToPx33;
                            this.F3.getLayoutParams().height = iDpToPx33;
                            z7 = z8;
                        } else {
                            zEquals28 = this.m8.equals("Small");
                            relativeLayout25 = this.Z2;
                            if (zEquals28) {
                                relativeLayout25.getLayoutParams().height = iDpToPx31;
                                this.E3.getLayoutParams().height = iDpToPx31;
                                this.F3.getLayoutParams().height = iDpToPx31;
                                z7 = z8;
                            } else {
                                relativeLayout25.getLayoutParams().height = iDpToPx29;
                                this.E3.getLayoutParams().height = iDpToPx29;
                                this.F3.getLayoutParams().height = iDpToPx29;
                                z7 = z8;
                            }
                        }
                    } else if (z9) {
                        if (str13.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx38;
                            this.E3.getLayoutParams().height = iDpToPx38;
                            this.F3.getLayoutParams().height = iDpToPx38;
                            z7 = z8;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx36;
                            this.E3.getLayoutParams().height = iDpToPx36;
                            this.F3.getLayoutParams().height = iDpToPx36;
                            z7 = z8;
                        } else {
                            zEquals27 = this.m8.equals("Small");
                            relativeLayout24 = this.Z2;
                            if (zEquals27) {
                                relativeLayout24.getLayoutParams().height = iDpToPx34;
                                this.E3.getLayoutParams().height = iDpToPx34;
                                this.F3.getLayoutParams().height = iDpToPx34;
                                z7 = z8;
                            } else {
                                relativeLayout24.getLayoutParams().height = iDpToPx32;
                                this.E3.getLayoutParams().height = iDpToPx32;
                                this.F3.getLayoutParams().height = iDpToPx32;
                                z7 = z8;
                            }
                        }
                    } else if (str13.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx36;
                        this.E3.getLayoutParams().height = iDpToPx36;
                        this.F3.getLayoutParams().height = iDpToPx36;
                        z7 = z8;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx34;
                        this.E3.getLayoutParams().height = iDpToPx34;
                        this.F3.getLayoutParams().height = iDpToPx34;
                        z7 = z8;
                    } else {
                        zEquals26 = this.m8.equals("Small");
                        relativeLayout23 = this.Z2;
                        if (zEquals26) {
                            relativeLayout23.getLayoutParams().height = iDpToPx32;
                            this.E3.getLayoutParams().height = iDpToPx32;
                            this.F3.getLayoutParams().height = iDpToPx32;
                            z7 = z8;
                        } else {
                            relativeLayout23.getLayoutParams().height = iDpToPx30;
                            this.E3.getLayoutParams().height = iDpToPx30;
                            this.F3.getLayoutParams().height = iDpToPx30;
                            z7 = z8;
                        }
                    }
                }
            }
        } else {
            z4 = z2;
            z5 = z3 ? 1 : 0;
            obj = r15;
            this.Q.setVisibility(8);
            if (this.c4) {
                i2 = (z5 ? 1 : 0) + 1;
            } else {
                i2 = z5 ? 1 : 0;
            }
            if (z4) {
                i2++;
            }
            if (this.g4) {
                i2++;
            }
            if (this.i4) {
                i2++;
            } else {
                i2++;
            }
            if (this.k4) {
                i2++;
            }
            if (this.p4) {
                i2++;
            }
            if (this.P5) {
                i2++;
            }
            if (this.s8) {
                i2++;
            }
            if (this.t8) {
                i2++;
            }
            str = this.m8;
            if (i2 < 6) {
                if (str.equals(Default.TEMPLATE_SIZE)) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else if (this.m8.equals("Small")) {
                    this.r2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 7));
                } else {
                    zEquals24 = this.m8.equals("Extra Small");
                    textView2 = this.r2;
                    if (zEquals24) {
                        textView2.setTextSize(0, HelperClass.dpToPx(this, 6));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 6));
                    } else {
                        textView2.setTextSize(0, HelperClass.dpToPx(this, 9));
                        this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    }
                }
            } else if (str.equals(Default.TEMPLATE_SIZE)) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 10));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 10));
            } else if (this.m8.equals("Small")) {
                this.r2.setTextSize(0, HelperClass.dpToPx(this, 9));
                this.s2.setTextSize(0, HelperClass.dpToPx(this, 9));
            } else {
                zEquals = this.m8.equals("Extra Small");
                textView = this.r2;
                if (zEquals) {
                    textView.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else {
                    textView.setTextSize(0, HelperClass.dpToPx(this, 11));
                    this.s2.setTextSize(0, HelperClass.dpToPx(this, 11));
                }
            }
            HelperClass.dpToPx(this, 70);
            HelperClass.dpToPx(this, 75);
            HelperClass.dpToPx(this, 80);
            HelperClass.dpToPx(this, 85);
            iDpToPx = HelperClass.dpToPx(this, 90);
            iDpToPx2 = HelperClass.dpToPx(this, 95);
            iDpToPx3 = HelperClass.dpToPx(this, 100);
            iDpToPx4 = HelperClass.dpToPx(this, fh.W0);
            iDpToPx5 = HelperClass.dpToPx(this, fh.k1);
            iDpToPx6 = HelperClass.dpToPx(this, 115);
            iDpToPx7 = HelperClass.dpToPx(this, 120);
            iDpToPx8 = HelperClass.dpToPx(this, 125);
            iDpToPx9 = HelperClass.dpToPx(this, 130);
            iDpToPx10 = HelperClass.dpToPx(this, 135);
            iDpToPx11 = HelperClass.dpToPx(this, 140);
            iDpToPx12 = HelperClass.dpToPx(this, 145);
            iDpToPx13 = HelperClass.dpToPx(this, 150);
            iDpToPx14 = HelperClass.dpToPx(this, 155);
            iDpToPx15 = HelperClass.dpToPx(this, 160);
            iDpToPx16 = HelperClass.dpToPx(this, 165);
            iDpToPx17 = HelperClass.dpToPx(this, 170);
            iDpToPx18 = HelperClass.dpToPx(this, 175);
            iDpToPx19 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
            HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
            iDpToPx20 = HelperClass.dpToPx(this, 190);
            if (this.n4) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (this.o4) {
                str11 = this.m8;
                if (z6) {
                    if (str11.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx20;
                        this.E3.getLayoutParams().height = iDpToPx20;
                        this.F3.getLayoutParams().height = iDpToPx20;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx19;
                        this.E3.getLayoutParams().height = iDpToPx19;
                        this.F3.getLayoutParams().height = iDpToPx19;
                        z7 = z5;
                    } else {
                        zEquals23 = this.m8.equals("Small");
                        relativeLayout22 = this.Z2;
                        if (zEquals23) {
                            relativeLayout22.getLayoutParams().height = iDpToPx17;
                            this.E3.getLayoutParams().height = iDpToPx17;
                            this.F3.getLayoutParams().height = iDpToPx17;
                            z7 = z5;
                        } else {
                            relativeLayout22.getLayoutParams().height = iDpToPx15;
                            this.E3.getLayoutParams().height = iDpToPx15;
                            this.F3.getLayoutParams().height = iDpToPx15;
                            z7 = z5;
                        }
                    }
                } else if (str11.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx19;
                    this.E3.getLayoutParams().height = iDpToPx19;
                    this.F3.getLayoutParams().height = iDpToPx19;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx17;
                    this.E3.getLayoutParams().height = iDpToPx17;
                    this.F3.getLayoutParams().height = iDpToPx17;
                    z7 = z5;
                } else {
                    zEquals22 = this.m8.equals("Small");
                    relativeLayout21 = this.Z2;
                    if (zEquals22) {
                        relativeLayout21.getLayoutParams().height = iDpToPx15;
                        this.E3.getLayoutParams().height = iDpToPx15;
                        this.F3.getLayoutParams().height = iDpToPx15;
                        z7 = z5;
                    } else {
                        relativeLayout21.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    }
                }
            } else if (i2 == 2) {
                str10 = this.m8;
                if (z6) {
                    if (str10.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx10;
                        this.E3.getLayoutParams().height = iDpToPx10;
                        this.F3.getLayoutParams().height = iDpToPx10;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx8;
                        this.E3.getLayoutParams().height = iDpToPx8;
                        this.F3.getLayoutParams().height = iDpToPx8;
                        z7 = z5;
                    } else {
                        zEquals21 = this.m8.equals("Small");
                        relativeLayout20 = this.Z2;
                        if (zEquals21) {
                            relativeLayout20.getLayoutParams().height = iDpToPx6;
                            this.E3.getLayoutParams().height = iDpToPx6;
                            this.F3.getLayoutParams().height = iDpToPx6;
                            z7 = z5;
                        } else {
                            relativeLayout20.getLayoutParams().height = iDpToPx4;
                            this.E3.getLayoutParams().height = iDpToPx4;
                            this.F3.getLayoutParams().height = iDpToPx4;
                            z7 = z5;
                        }
                    }
                } else if (str10.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx8;
                    this.E3.getLayoutParams().height = iDpToPx8;
                    this.F3.getLayoutParams().height = iDpToPx8;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx6;
                    this.E3.getLayoutParams().height = iDpToPx6;
                    this.F3.getLayoutParams().height = iDpToPx6;
                    z7 = z5;
                } else {
                    zEquals20 = this.m8.equals("Small");
                    relativeLayout19 = this.Z2;
                    if (zEquals20) {
                        relativeLayout19.getLayoutParams().height = iDpToPx4;
                        this.E3.getLayoutParams().height = iDpToPx4;
                        this.F3.getLayoutParams().height = iDpToPx4;
                        z7 = z5;
                    } else {
                        relativeLayout19.getLayoutParams().height = iDpToPx2;
                        this.E3.getLayoutParams().height = iDpToPx2;
                        this.F3.getLayoutParams().height = iDpToPx2;
                        z7 = z5;
                    }
                }
            } else if (i2 == 3) {
                str9 = this.m8;
                if (z6) {
                    if (str9.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        zEquals19 = this.m8.equals("Small");
                        relativeLayout18 = this.Z2;
                        if (zEquals19) {
                            relativeLayout18.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        } else {
                            relativeLayout18.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        }
                    }
                } else if (str9.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx5;
                    this.E3.getLayoutParams().height = iDpToPx5;
                    this.F3.getLayoutParams().height = iDpToPx5;
                    z7 = z5;
                } else {
                    zEquals18 = this.m8.equals("Small");
                    relativeLayout17 = this.Z2;
                    if (zEquals18) {
                        relativeLayout17.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    } else {
                        relativeLayout17.getLayoutParams().height = iDpToPx;
                        this.E3.getLayoutParams().height = iDpToPx;
                        this.F3.getLayoutParams().height = iDpToPx;
                        z7 = z5;
                    }
                }
            } else if (i2 == 4) {
                str8 = this.m8;
                if (z6) {
                    if (str8.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        zEquals17 = this.m8.equals("Small");
                        relativeLayout16 = this.Z2;
                        if (zEquals17) {
                            relativeLayout16.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        } else {
                            relativeLayout16.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        }
                    }
                } else if (str8.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx5;
                    this.E3.getLayoutParams().height = iDpToPx5;
                    this.F3.getLayoutParams().height = iDpToPx5;
                    z7 = z5;
                } else {
                    zEquals16 = this.m8.equals("Small");
                    relativeLayout15 = this.Z2;
                    if (zEquals16) {
                        relativeLayout15.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    } else {
                        relativeLayout15.getLayoutParams().height = iDpToPx;
                        this.E3.getLayoutParams().height = iDpToPx;
                        this.F3.getLayoutParams().height = iDpToPx;
                        z7 = z5;
                    }
                }
            } else if (i2 == 5) {
                str7 = this.m8;
                if (z6) {
                    if (str7.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        zEquals15 = this.m8.equals("Small");
                        relativeLayout14 = this.Z2;
                        if (zEquals15) {
                            relativeLayout14.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        } else {
                            relativeLayout14.getLayoutParams().height = iDpToPx3;
                            this.E3.getLayoutParams().height = iDpToPx3;
                            this.F3.getLayoutParams().height = iDpToPx3;
                            z7 = z5;
                        }
                    }
                } else if (str7.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx5;
                    this.E3.getLayoutParams().height = iDpToPx5;
                    this.F3.getLayoutParams().height = iDpToPx5;
                    z7 = z5;
                } else {
                    zEquals14 = this.m8.equals("Small");
                    relativeLayout13 = this.Z2;
                    if (zEquals14) {
                        relativeLayout13.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    } else {
                        relativeLayout13.getLayoutParams().height = iDpToPx;
                        this.E3.getLayoutParams().height = iDpToPx;
                        this.F3.getLayoutParams().height = iDpToPx;
                        z7 = z5;
                    }
                }
            } else if (i2 == 6) {
                str6 = this.m8;
                if (z6) {
                    if (str6.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx11;
                        this.E3.getLayoutParams().height = iDpToPx11;
                        this.F3.getLayoutParams().height = iDpToPx11;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else {
                        zEquals13 = this.m8.equals("Small");
                        relativeLayout12 = this.Z2;
                        if (zEquals13) {
                            relativeLayout12.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        } else {
                            relativeLayout12.getLayoutParams().height = iDpToPx5;
                            this.E3.getLayoutParams().height = iDpToPx5;
                            this.F3.getLayoutParams().height = iDpToPx5;
                            z7 = z5;
                        }
                    }
                } else if (str6.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx9;
                    this.E3.getLayoutParams().height = iDpToPx9;
                    this.F3.getLayoutParams().height = iDpToPx9;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx7;
                    this.E3.getLayoutParams().height = iDpToPx7;
                    this.F3.getLayoutParams().height = iDpToPx7;
                    z7 = z5;
                } else {
                    zEquals12 = this.m8.equals("Small");
                    relativeLayout11 = this.Z2;
                    if (zEquals12) {
                        relativeLayout11.getLayoutParams().height = iDpToPx5;
                        this.E3.getLayoutParams().height = iDpToPx5;
                        this.F3.getLayoutParams().height = iDpToPx5;
                        z7 = z5;
                    } else {
                        relativeLayout11.getLayoutParams().height = iDpToPx3;
                        this.E3.getLayoutParams().height = iDpToPx3;
                        this.F3.getLayoutParams().height = iDpToPx3;
                        z7 = z5;
                    }
                }
            } else if (i2 == 7) {
                str5 = this.m8;
                if (z6) {
                    if (str5.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx11;
                        this.E3.getLayoutParams().height = iDpToPx11;
                        this.F3.getLayoutParams().height = iDpToPx11;
                        z7 = z5;
                    } else {
                        zEquals11 = this.m8.equals("Small");
                        relativeLayout10 = this.Z2;
                        if (zEquals11) {
                            relativeLayout10.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        } else {
                            relativeLayout10.getLayoutParams().height = iDpToPx7;
                            this.E3.getLayoutParams().height = iDpToPx7;
                            this.F3.getLayoutParams().height = iDpToPx7;
                            z7 = z5;
                        }
                    }
                } else if (str5.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx11;
                    this.E3.getLayoutParams().height = iDpToPx11;
                    this.F3.getLayoutParams().height = iDpToPx11;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx9;
                    this.E3.getLayoutParams().height = iDpToPx9;
                    this.F3.getLayoutParams().height = iDpToPx9;
                    z7 = z5;
                } else {
                    zEquals10 = this.m8.equals("Small");
                    relativeLayout9 = this.Z2;
                    if (zEquals10) {
                        relativeLayout9.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    } else {
                        relativeLayout9.getLayoutParams().height = iDpToPx5;
                        this.E3.getLayoutParams().height = iDpToPx5;
                        this.F3.getLayoutParams().height = iDpToPx5;
                        z7 = z5;
                    }
                }
            } else if (i2 == 8) {
                str4 = this.m8;
                if (z6) {
                    if (str4.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx15;
                        this.E3.getLayoutParams().height = iDpToPx15;
                        this.F3.getLayoutParams().height = iDpToPx15;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    } else {
                        zEquals9 = this.m8.equals("Small");
                        relativeLayout8 = this.Z2;
                        if (zEquals9) {
                            relativeLayout8.getLayoutParams().height = iDpToPx11;
                            this.E3.getLayoutParams().height = iDpToPx11;
                            this.F3.getLayoutParams().height = iDpToPx11;
                            z7 = z5;
                        } else {
                            relativeLayout8.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        }
                    }
                } else if (str4.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx13;
                    this.E3.getLayoutParams().height = iDpToPx13;
                    this.F3.getLayoutParams().height = iDpToPx13;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx11;
                    this.E3.getLayoutParams().height = iDpToPx11;
                    this.F3.getLayoutParams().height = iDpToPx11;
                    z7 = z5;
                } else {
                    zEquals8 = this.m8.equals("Small");
                    relativeLayout7 = this.Z2;
                    if (zEquals8) {
                        relativeLayout7.getLayoutParams().height = iDpToPx9;
                        this.E3.getLayoutParams().height = iDpToPx9;
                        this.F3.getLayoutParams().height = iDpToPx9;
                        z7 = z5;
                    } else {
                        relativeLayout7.getLayoutParams().height = iDpToPx7;
                        this.E3.getLayoutParams().height = iDpToPx7;
                        this.F3.getLayoutParams().height = iDpToPx7;
                        z7 = z5;
                    }
                }
            } else if (i2 == 9) {
                str3 = this.m8;
                if (z6) {
                    if (str3.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx16;
                        this.E3.getLayoutParams().height = iDpToPx16;
                        this.F3.getLayoutParams().height = iDpToPx16;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx14;
                        this.E3.getLayoutParams().height = iDpToPx14;
                        this.F3.getLayoutParams().height = iDpToPx14;
                        z7 = z5;
                    } else {
                        zEquals7 = this.m8.equals("Small");
                        relativeLayout6 = this.Z2;
                        if (zEquals7) {
                            relativeLayout6.getLayoutParams().height = iDpToPx12;
                            this.E3.getLayoutParams().height = iDpToPx12;
                            this.F3.getLayoutParams().height = iDpToPx12;
                            z7 = z5;
                        } else {
                            relativeLayout6.getLayoutParams().height = iDpToPx10;
                            this.E3.getLayoutParams().height = iDpToPx10;
                            this.F3.getLayoutParams().height = iDpToPx10;
                            z7 = z5;
                        }
                    }
                } else if (str3.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx14;
                    this.E3.getLayoutParams().height = iDpToPx14;
                    this.F3.getLayoutParams().height = iDpToPx14;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx12;
                    this.E3.getLayoutParams().height = iDpToPx12;
                    this.F3.getLayoutParams().height = iDpToPx12;
                    z7 = z5;
                } else {
                    zEquals6 = this.m8.equals("Small");
                    relativeLayout5 = this.Z2;
                    if (zEquals6) {
                        relativeLayout5.getLayoutParams().height = iDpToPx10;
                        this.E3.getLayoutParams().height = iDpToPx10;
                        this.F3.getLayoutParams().height = iDpToPx10;
                        z7 = z5;
                    } else {
                        relativeLayout5.getLayoutParams().height = iDpToPx8;
                        this.E3.getLayoutParams().height = iDpToPx8;
                        this.F3.getLayoutParams().height = iDpToPx8;
                        z7 = z5;
                    }
                }
            } else {
                str2 = this.m8;
                if (i2 == 10) {
                    if (z6) {
                        if (str2.equals(obj)) {
                            this.Z2.getLayoutParams().height = iDpToPx17;
                            this.E3.getLayoutParams().height = iDpToPx17;
                            this.F3.getLayoutParams().height = iDpToPx17;
                            z7 = z5;
                        } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                            this.Z2.getLayoutParams().height = iDpToPx15;
                            this.E3.getLayoutParams().height = iDpToPx15;
                            this.F3.getLayoutParams().height = iDpToPx15;
                            z7 = z5;
                        } else {
                            zEquals5 = this.m8.equals("Small");
                            relativeLayout4 = this.Z2;
                            if (zEquals5) {
                                relativeLayout4.getLayoutParams().height = iDpToPx13;
                                this.E3.getLayoutParams().height = iDpToPx13;
                                this.F3.getLayoutParams().height = iDpToPx13;
                                z7 = z5;
                            } else {
                                relativeLayout4.getLayoutParams().height = iDpToPx11;
                                this.E3.getLayoutParams().height = iDpToPx11;
                                this.F3.getLayoutParams().height = iDpToPx11;
                                z7 = z5;
                            }
                        }
                    } else if (str2.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx15;
                        this.E3.getLayoutParams().height = iDpToPx15;
                        this.F3.getLayoutParams().height = iDpToPx15;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx13;
                        this.E3.getLayoutParams().height = iDpToPx13;
                        this.F3.getLayoutParams().height = iDpToPx13;
                        z7 = z5;
                    } else {
                        zEquals4 = this.m8.equals("Small");
                        relativeLayout3 = this.Z2;
                        if (zEquals4) {
                            relativeLayout3.getLayoutParams().height = iDpToPx11;
                            this.E3.getLayoutParams().height = iDpToPx11;
                            this.F3.getLayoutParams().height = iDpToPx11;
                            z7 = z5;
                        } else {
                            relativeLayout3.getLayoutParams().height = iDpToPx9;
                            this.E3.getLayoutParams().height = iDpToPx9;
                            this.F3.getLayoutParams().height = iDpToPx9;
                            z7 = z5;
                        }
                    }
                } else if (z6) {
                    if (str2.equals(obj)) {
                        this.Z2.getLayoutParams().height = iDpToPx18;
                        this.E3.getLayoutParams().height = iDpToPx18;
                        this.F3.getLayoutParams().height = iDpToPx18;
                        z7 = z5;
                    } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                        this.Z2.getLayoutParams().height = iDpToPx16;
                        this.E3.getLayoutParams().height = iDpToPx16;
                        this.F3.getLayoutParams().height = iDpToPx16;
                        z7 = z5;
                    } else {
                        zEquals3 = this.m8.equals("Small");
                        relativeLayout2 = this.Z2;
                        if (zEquals3) {
                            relativeLayout2.getLayoutParams().height = iDpToPx14;
                            this.E3.getLayoutParams().height = iDpToPx14;
                            this.F3.getLayoutParams().height = iDpToPx14;
                            z7 = z5;
                        } else {
                            relativeLayout2.getLayoutParams().height = iDpToPx12;
                            this.E3.getLayoutParams().height = iDpToPx12;
                            this.F3.getLayoutParams().height = iDpToPx12;
                            z7 = z5;
                        }
                    }
                } else if (str2.equals(obj)) {
                    this.Z2.getLayoutParams().height = iDpToPx16;
                    this.E3.getLayoutParams().height = iDpToPx16;
                    this.F3.getLayoutParams().height = iDpToPx16;
                    z7 = z5;
                } else if (this.m8.equals(Default.TEMPLATE_SIZE)) {
                    this.Z2.getLayoutParams().height = iDpToPx14;
                    this.E3.getLayoutParams().height = iDpToPx14;
                    this.F3.getLayoutParams().height = iDpToPx14;
                    z7 = z5;
                } else {
                    zEquals2 = this.m8.equals("Small");
                    relativeLayout = this.Z2;
                    if (zEquals2) {
                        relativeLayout.getLayoutParams().height = iDpToPx12;
                        this.E3.getLayoutParams().height = iDpToPx12;
                        this.F3.getLayoutParams().height = iDpToPx12;
                        z7 = z5;
                    } else {
                        relativeLayout.getLayoutParams().height = iDpToPx10;
                        this.E3.getLayoutParams().height = iDpToPx10;
                        this.F3.getLayoutParams().height = iDpToPx10;
                        z7 = z5;
                    }
                }
            }
        }
        if (this.c4) {
            this.Y2.setVisibility(0);
        } else {
            this.Y2.setVisibility(0);
        }
        if (z4) {
            this.X2.setVisibility(0);
            J();
        } else {
            this.X2.setVisibility(0);
            J();
        }
        if (z4) {
            this.q2.setVisibility(0);
        } else {
            this.q2.setVisibility(0);
        }
        if (this.b4) {
            this.Z2.setVisibility(0);
        } else {
            this.Z2.setVisibility(0);
        }
        this.a3.setVisibility(8);
        this.b3.setVisibility(8);
        this.Z2.setBackground(getDrawable(R.drawable.rect_grey));
        this.E3.setBackground(getDrawable(R.drawable.rect_grey_6));
        this.F3.setBackground(getDrawable(R.drawable.rect_grey_6));
        this.t2.setBackground(getDrawable(R.drawable.rect_grey_8));
        this.u2.setBackground(getDrawable(R.drawable.rect_grey_8));
        ((GradientDrawable) this.E3.getBackground().getCurrent()).setColor(this.k5);
        ((GradientDrawable) this.F3.getBackground().getCurrent()).setColor(this.k5);
        ((GradientDrawable) this.Z2.getBackground().getCurrent()).setColor(this.k5);
        ((GradientDrawable) this.u2.getBackground().getCurrent()).setColor(this.r7);
        ((GradientDrawable) this.t2.getBackground().getCurrent()).setColor(this.r7);
        this.t2.setTextColor(this.q7);
        this.u2.setTextColor(this.q7);
        this.r2.setTextColor(this.L6);
        this.s2.setTextColor(this.L6);
        C();
    }

    public final void G() {
        String strReplace;
        String string;
        String strTrim = this.T8.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.T8.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.T8.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.T8.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.T8.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strTrim6 = this.T8.getString(this, SP.PLUS_CODE, "").trim();
        if (!strTrim6.isEmpty() && this.n8.equals("concise")) {
            strTrim6 = strTrim6.substring(4);
        }
        String strConcat = (strTrim2 == null || strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (strTrim3 != null && !strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (strTrim4 != null && !strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (this.L3 && (string = this.T8.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (this.n5) {
            strTrim = strTrim.trim().isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        boolean z = this.o5;
        boolean z2 = this.q5;
        if (z) {
            if (z2) {
                strTrim3 = strTrim.trim().isEmpty() ? eo7.j(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.trim().isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (z2) {
            strTrim3 = strTrim.trim().isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!this.p5) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.trim().isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.trim().isEmpty()) {
            strTrim4 = "Loading...";
        }
        if (strTrim4.trim().isEmpty()) {
            strReplace = "";
        } else {
            if (strTrim4.equalsIgnoreCase("null")) {
                strTrim4 = "Loading...";
            }
            strReplace = s(this.U5, strTrim4);
        }
        String strS = s(this.s6, this.U8.getLatLong(this, this.P8));
        Log.e("latLong111 : ", strS);
        int i = this.P8;
        if (i != 6 && i != 7 && strS.length() > 55 && this.H3 && !this.N3 && !this.R3 && !this.S3) {
            String[] strArrSplit = strS.split(" Long");
            strS = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        boolean z3 = this.K3;
        if (z3) {
            strReplace = this.I3 ? eo7.x(strReplace, "<br/>", strS) : strS;
        }
        if (this.M3) {
            String strS2 = s(this.w6, "Plus Code : ".concat(strTrim6));
            strReplace = (this.I3 || z3) ? eo7.x(strReplace, "<br/>", strS2) : strS2;
        }
        if (this.O3) {
            String strS3 = s(this.k6, HelperClass.setDateTimeFormat(this, this.T8.getString(this, XIBrjfXRiD.CtieqgO, Default.DEFAULT_DATE_FORMAT)));
            strReplace = (this.I3 || z3 || this.M3) ? eo7.x(strReplace, "<br/>", strS3) : strS3;
        }
        if (this.P3) {
            String strS4 = s(this.k6, t(this.T8.getInteger(this, SP.TIMEZONE, 6)));
            if (this.O3) {
                strReplace = eo7.x(strReplace, " ", strS4);
            } else {
                strReplace = (this.I3 || z3 || this.M3) ? eo7.x(strReplace, "<br/>", strS4) : strS4;
            }
        }
        if (this.W3) {
            String strS5 = s(this.M6, this.T8.getString(this, SP.NOTES_HASHTAG, Default.notes));
            strReplace = (this.I3 || z3 || this.O3 || this.P3 || this.M3) ? eo7.x(strReplace, "<br/>", strS5) : strS5;
        }
        if (this.Q3) {
            String strS6 = s(this.k7, (this.w7 + " " + this.s7 + " " + this.A7).trim());
            strReplace = (this.I3 || z3 || this.O3 || this.P3 || this.W3 || this.M3) ? eo7.x(strReplace, "<br/>", strS6) : strS6;
        }
        if (this.M5) {
            String strS7 = s(this.Y5, (getString(R.string.person_name) + " : " + this.E7).trim());
            strReplace = (this.I3 || z3 || this.O3 || this.P3 || this.W3 || this.M3 || this.Q3) ? eo7.x(strReplace, "<br/>", strS7) : strS7;
        }
        if (this.Q5) {
            String strS8 = s(this.c6, this.I7.trim());
            strReplace = (this.I3 || z3 || this.O3 || this.P3 || this.W3 || this.M3 || this.Q3 || this.M5) ? eo7.x(strReplace, "<br/>", strS8) : strS8;
        }
        if (this.U3) {
            this.q0.setText(HelperClass.getwindConvert(this, this.N7));
            this.q0.setTextColor(this.Q6);
            this.M.setImageResource(R.drawable.ic_wind);
        }
        if (this.S3) {
            this.r0.setText(this.T8.getString(this, SP.COMPASS_VALUE, ""));
            this.r0.setTextColor(this.I6);
        }
        if (this.N3) {
            boolean zEquals = this.x8.equals("Celsius");
            TextView textView = this.n0;
            float f = this.h8;
            if (zEquals) {
                textView.setText(HelperClass.getCelcius(f));
            } else {
                textView.setText(HelperClass.getFahrenheit(f));
            }
            this.n0.setTextColor(this.A6);
        }
        if (this.R3) {
            this.s0.setText(this.T8.getString(this, SP.MAGNETIC_FIELD_VALUE, ""));
            this.s0.setTextColor(this.E6);
        }
        if (this.X3) {
            this.p0.setText(eo7.o(new StringBuilder(), this.T8.getString(this, SP.HUMIDITY_VALUE, ""), "%"));
            this.p0.setTextColor(this.U6);
            this.O.setImageResource(R.drawable.ic_humidity);
        }
        if (this.Y3) {
            this.o0.setText(HelperClass.getpressureConvert(this, this.Z7));
            this.o0.setTextColor(this.Y6);
            this.L.setImageResource(R.drawable.ic_pressure);
        }
        if (strReplace.contains("null")) {
            strReplace = strReplace.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.m0.setText(Html.fromHtml(strReplace));
        } else {
            SpannableString spannableString = new SpannableString(strConcat);
            spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(this.g6), 0, strConcat.length(), 0);
            Html.fromHtml("<br/>" + strReplace);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strReplace));
            this.m0.setText(spannableStringBuilder);
        }
        if (this.z8.equals(Default.LOGO_uri)) {
            this.I.setImageResource(R.drawable.new_watermark);
        } else {
            Executors.newSingleThreadExecutor().execute(new nq6(this, new Handler(), 3));
        }
        this.p0.setTypeface(HelperClass.getFontStyle(this, this.A8));
        this.q0.setTypeface(HelperClass.getFontStyle(this, this.A8));
        this.o0.setTypeface(HelperClass.getFontStyle(this, this.A8));
        this.m0.setTypeface(HelperClass.getFontStyle(this, this.A8));
        this.n0.setTypeface(HelperClass.getFontStyle(this, this.A8));
        this.r0.setTypeface(HelperClass.getFontStyle(this, this.A8));
        this.s0.setTypeface(HelperClass.getFontStyle(this, this.A8));
    }

    public final void H() {
        String strReplace;
        String string;
        String strTrim = this.T8.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.T8.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.T8.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.T8.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.T8.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strTrim6 = this.T8.getString(this, SP.PLUS_CODE, "").trim();
        if (!strTrim6.isEmpty() && this.o8.equals("concise")) {
            strTrim6 = strTrim6.substring(4);
        }
        String strConcat = (strTrim2 == null || strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (strTrim3 != null && !strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (strTrim4 != null && !strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        int i = 2;
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (this.z4 && (string = this.T8.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (this.r5) {
            strTrim = strTrim.trim().isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        boolean z = this.s5;
        boolean z2 = this.u5;
        if (z) {
            if (z2) {
                strTrim3 = strTrim.trim().isEmpty() ? eo7.j(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.trim().isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (z2) {
            strTrim3 = strTrim.trim().isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!this.t5) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.trim().isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.trim().isEmpty()) {
            strTrim4 = "Loading...";
        }
        if (strTrim4.trim().isEmpty()) {
            strReplace = "";
        } else {
            if (strTrim4.equalsIgnoreCase("null")) {
                strTrim4 = "Loading...";
            }
            strReplace = s(this.V5, strTrim4);
        }
        String strS = s(this.t6, this.U8.getLatLong(this, this.R8));
        Log.e("latLong111 : ", strS);
        int i2 = this.R8;
        if (i2 != 6 && i2 != 7 && strS.length() > 55 && this.v4 && !this.B4 && !this.F4 && !this.G4) {
            String[] strArrSplit = strS.split(" Long");
            strS = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        boolean z3 = this.y4;
        if (z3) {
            strReplace = this.w4 ? eo7.x(strReplace, "<br/>", strS) : strS;
        }
        if (this.A4) {
            String strS2 = s(this.x6, "Plus Code : ".concat(strTrim6));
            strReplace = (this.w4 || z3) ? eo7.x(strReplace, "<br/>", strS2) : strS2;
        }
        if (this.C4) {
            String strS3 = s(this.l6, HelperClass.setDateTimeFormat(this, this.T8.getString(this, SP.DATE_FORMAT_CLASSIC, Default.DEFAULT_DATE_FORMAT)));
            strReplace = (this.w4 || z3 || this.A4) ? eo7.x(strReplace, "<br/>", strS3) : strS3;
        }
        if (this.D4) {
            String strS4 = s(this.l6, t(this.T8.getInteger(this, SP.TIMEZONE_CLASSIC, 6)));
            if (this.C4) {
                strReplace = eo7.x(strReplace, " ", strS4);
            } else {
                strReplace = (this.w4 || z3 || this.A4) ? eo7.x(strReplace, "<br/>", strS4) : strS4;
            }
        }
        if (this.J4) {
            String strS5 = s(this.N6, this.T8.getString(this, SP.NOTES_HASHTAG_CLASSIC, Default.notes));
            strReplace = (this.w4 || z3 || this.C4 || this.D4 || this.A4) ? eo7.x(strReplace, "<br/>", strS5) : strS5;
        }
        if (this.E4) {
            String strS6 = s(this.l7, (this.x7 + " " + this.t7 + " " + this.B7).trim());
            strReplace = (this.w4 || z3 || this.C4 || this.D4 || this.J4 || this.A4) ? eo7.x(strReplace, "<br/>", strS6) : strS6;
        }
        if (this.N5) {
            String strS7 = s(this.Z5, (getString(R.string.person_name) + " : " + this.F7).trim());
            strReplace = (this.w4 || z3 || this.C4 || this.D4 || this.J4 || this.A4 || this.E4) ? eo7.x(strReplace, "<br/>", strS7) : strS7;
        }
        if (this.R5) {
            String strS8 = s(this.d6, this.J7.trim());
            strReplace = (this.w4 || z3 || this.C4 || this.D4 || this.J4 || this.A4 || this.E4 || this.N5) ? eo7.x(strReplace, "<br/>", strS8) : strS8;
        }
        if (this.H4) {
            this.z2.setText(HelperClass.getwindConvert(this, this.O7));
            this.z2.setTextColor(this.R6);
            this.Z.setImageResource(R.drawable.ic_wind);
        }
        if (this.G4) {
            this.A2.setText(this.T8.getString(this, SP.COMPASS_VALUE, ""));
            this.A2.setTextColor(this.J6);
        }
        if (this.B4) {
            boolean zEquals = this.H8.equals("Celsius");
            TextView textView = this.w2;
            float f = this.h8;
            if (zEquals) {
                textView.setText(HelperClass.getCelcius(f));
            } else {
                textView.setText(HelperClass.getFahrenheit(f));
            }
            this.w2.setTextColor(this.B6);
        }
        if (this.F4) {
            this.B2.setText(this.T8.getString(this, SP.MAGNETIC_FIELD_VALUE, ""));
            this.B2.setTextColor(this.F6);
        }
        if (this.K4) {
            this.y2.setText(eo7.o(new StringBuilder(), this.T8.getString(this, SP.HUMIDITY_VALUE, ""), "%"));
            this.y2.setTextColor(this.V6);
            this.b0.setImageResource(R.drawable.ic_humidity);
        }
        if (this.L4) {
            this.x2.setText(HelperClass.getpressureConvert(this, this.a8));
            this.x2.setTextColor(this.Z6);
            this.Y.setImageResource(R.drawable.ic_pressure);
        }
        if (strReplace.contains("null")) {
            strReplace = strReplace.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.v2.setText(Html.fromHtml(strReplace));
        } else {
            SpannableString spannableString = new SpannableString(strConcat);
            spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(this.h6), 0, strConcat.length(), 0);
            Html.fromHtml("<br/>" + strReplace);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strReplace));
            this.v2.setText(spannableStringBuilder);
        }
        if (this.J8.equals(Default.LOGO_uri)) {
            this.V.setImageResource(R.drawable.new_watermark);
        } else {
            Executors.newSingleThreadExecutor().execute(new nq6(this, new Handler(), i));
        }
        this.y2.setTypeface(HelperClass.getFontStyle(this, this.K8));
        this.z2.setTypeface(HelperClass.getFontStyle(this, this.K8));
        this.x2.setTypeface(HelperClass.getFontStyle(this, this.K8));
        this.v2.setTypeface(HelperClass.getFontStyle(this, this.K8));
        this.w2.setTypeface(HelperClass.getFontStyle(this, this.K8));
        this.A2.setTypeface(HelperClass.getFontStyle(this, this.K8));
        this.B2.setTypeface(HelperClass.getFontStyle(this, this.K8));
    }

    public final void I() {
        String string;
        String strTrim = this.T8.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.T8.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.T8.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.T8.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.T8.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strConcat = (strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (!strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (!strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        int i = 0;
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (this.W0 && (string = this.T8.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (this.f1) {
            strTrim = strTrim.isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        boolean z = this.g1;
        boolean z2 = this.i1;
        if (z) {
            if (z2) {
                strTrim3 = strTrim.isEmpty() ? eo7.x(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (z2) {
            strTrim3 = strTrim.isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!this.h1) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.isEmpty()) {
            strTrim4 = "Loading...";
        }
        String strS = s(this.k1, strTrim4);
        String strS2 = s(this.l1, this.U8.getLatLong(this, this.E1));
        int i2 = this.E1;
        if (i2 != 6 && i2 != 7 && strS2.length() > 55 && this.S0 && !this.Y0 && !this.a1) {
            String[] strArrSplit = strS2.split(" Long");
            strS2 = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        if (this.T0) {
            strS2 = eo7.x(strS, "<br/>", strS2);
        }
        if (this.Z0) {
            String strS3 = s(this.m1, HelperClass.getDateTimeDt(this, this.w1));
            String strS4 = s(this.m1, HelperClass.getDayDt(this));
            String strS5 = s(this.m1, HelperClass.getDateTimeDt(this, this.D1));
            this.x0.setText(Html.fromHtml(strS3));
            this.y0.setText(Html.fromHtml(strS5));
            this.z0.setText(Html.fromHtml(strS4));
        }
        if (this.c1) {
            String strS6 = s(this.n1, this.A1);
            strS2 = this.T0 ? eo7.x(strS2, "<br/>", strS6) : strS6;
        }
        if (this.e1) {
            String strS7 = s(this.p1, (getString(R.string.person_name) + " : " + this.u1).trim());
            strS2 = (this.T0 || this.c1) ? eo7.x(strS2, "<br/>", strS7) : strS7;
        }
        if (this.X0) {
            String strS8 = s(this.o1, this.v1.trim());
            strS2 = (this.T0 || this.c1 || this.e1) ? eo7.x(strS2, "<br/>", strS8) : strS8;
        }
        if (strS2.contains("null")) {
            strS2 = strS2.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.t0.setText(Html.fromHtml(strS2));
        } else {
            SpannableString spannableString = new SpannableString(strConcat);
            spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, strConcat.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(this.j1), 0, strConcat.length(), 0);
            SpannableString spannableString2 = new SpannableString(Html.fromHtml(strS2));
            spannableString2.setSpan(new StyleSpan(0), 0, spannableString2.length(), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) spannableString2);
            this.t0.setText(spannableStringBuilder);
        }
        if (this.a1) {
            this.v0.setText(this.T8.getString(this, SP.COMPASS_VALUE, ""));
            this.v0.setTextColor(this.r1);
        }
        if (this.Y0) {
            this.h8 = this.T8.getFloat(this, SP.TEMPRETURE_VALUE);
            boolean zEquals = this.x1.equals("Celsius");
            TextView textView = this.u0;
            float f = this.h8;
            if (zEquals) {
                textView.setText(HelperClass.getCelcius(f));
            } else {
                textView.setText(HelperClass.getFahrenheit(f));
            }
            this.u0.setTextColor(this.q1);
            this.D0.setImageResource(this.r8.getResourceId(this.F1, 0));
        }
        if (this.z1.equals(Default.LOGO_uri)) {
            this.B0.setImageResource(R.drawable.new_watermark);
        } else {
            Executors.newSingleThreadExecutor().execute(new nq6(this, new Handler(), i));
        }
        this.t0.setTypeface(HelperClass.getFontStyle(this, this.B1));
        this.x0.setTypeface(HelperClass.getFontStyle(this, this.B1));
        this.y0.setTypeface(HelperClass.getFontStyle(this, this.B1));
        this.z0.setTypeface(HelperClass.getFontStyle(this, this.B1));
        this.u0.setTypeface(HelperClass.getFontStyle(this, this.B1));
        this.v0.setTypeface(HelperClass.getFontStyle(this, this.B1));
        this.w0.setTypeface(HelperClass.getFontStyle(this, this.B1));
    }

    public final void J() {
        boolean z;
        String string;
        String strTrim = this.T8.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.T8.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.T8.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.T8.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.T8.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strConcat = (strTrim2 == null || strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (strTrim3 != null && !strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (strTrim4 != null && !strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (this.f4 && (string = this.T8.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (this.z5) {
            strTrim = strTrim.isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        boolean z2 = this.A5;
        boolean z3 = this.C5;
        if (z2) {
            if (z3) {
                strTrim3 = strTrim.isEmpty() ? eo7.j(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (z3) {
            strTrim3 = strTrim.isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!this.B5) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.isEmpty()) {
            strTrim4 = "Loading...";
        }
        String strS = !strTrim4.isEmpty() ? s(this.X5, strTrim4) : "";
        String strS2 = s(this.v6, this.U8.getLatLong(this, this.Q8));
        Log.e("latLong111 : ", strS2);
        int i = this.Q8;
        if (i != 6 && i != 7 && strS2.length() > 55 && this.b4) {
            String[] strArrSplit = strS2.split(" Long");
            strS2 = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        if (this.c4) {
            strS2 = eo7.x(strS, "<br/>", strS2);
        }
        boolean z4 = this.g4;
        boolean z5 = this.e4;
        if (z4) {
            String string2 = this.T8.getString(this, SP.PLUS_CODE, "");
            if (!string2.isEmpty() && this.q8.equals("concise")) {
                string2 = string2.substring(4);
            }
            String strS3 = s(this.z6, "Plus Code : ".concat(string2));
            strS2 = (this.c4 || z5) ? eo7.x(strS2, "<br/>", strS3) : strS3;
        }
        if (this.i4) {
            String strS4 = s(this.n6, HelperClass.setDateTimeFormat(this, this.B8));
            strS2 = (this.c4 || z5 || this.g4) ? eo7.x(strS2, "<br/>", strS4) : strS4;
        }
        if (this.j4) {
            String strS5 = s(this.n6, t(this.M7));
            if (this.i4) {
                strS2 = eo7.x(strS2, " ", strS5);
            } else {
                strS2 = (this.c4 || z5 || this.g4) ? eo7.x(strS2, "<br/>", strS5) : strS5;
            }
        }
        if (this.p4) {
            String strS6 = s(this.P6, this.F8);
            strS2 = (this.c4 || z5 || this.i4 || this.j4 || this.g4) ? eo7.x(strS2, "<br/>", strS6) : strS6;
        }
        if (this.k4) {
            String strS7 = s(this.n7, (this.z7 + " " + this.v7 + " " + this.D7).trim());
            strS2 = (this.c4 || z5 || this.i4 || this.j4 || (z = this.g4) || z) ? eo7.x(strS2, "<br/>", strS7) : strS7;
        }
        if (this.P5) {
            String strS8 = s(this.b6, (getString(R.string.person_name) + " : " + this.H7).trim());
            strS2 = (this.c4 || z5 || this.i4 || this.j4 || this.g4 || this.k4) ? eo7.x(strS2, "<br/>", strS8) : strS8;
        }
        if (this.T5) {
            String strS9 = s(this.f6, this.L7.trim());
            strS2 = (this.c4 || z5 || this.i4 || this.j4 || this.p4 || this.g4 || this.k4 || this.P5) ? eo7.x(strS2, "<br/>", strS9) : strS9;
        }
        if (this.s8) {
            String strS10 = s(this.o7, ("Azimuth/Bearing : " + String.format("%.2f", Float.valueOf(this.p9)) + "°").trim());
            strS2 = (this.c4 || z5 || this.i4 || this.j4 || this.p4 || this.g4 || this.k4 || this.P5 || this.T5) ? eo7.x(strS2, "<br/>", strS10) : strS10;
        }
        if (this.t8) {
            String strS11 = s(this.p7, HelperClass.getAqiValueText(this, this.v8).trim());
            strS2 = (this.c4 || z5 || this.i4 || this.j4 || this.p4 || this.g4 || this.k4 || this.P5 || this.T5 || this.s8) ? eo7.x(strS2, "<br/>", strS11) : strS11;
        }
        if (strS2.contains("null")) {
            strS2 = strS2.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.q2.setText(Html.fromHtml(strS2));
        } else {
            SpannableString spannableString = new SpannableString(strConcat);
            spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(this.j6), 0, strConcat.length(), 0);
            Html.fromHtml("<br/>" + strS2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strS2));
            this.q2.setText(spannableStringBuilder);
        }
        this.q2.setTypeface(HelperClass.getFontStyle(this, this.G8));
        this.r2.setTypeface(HelperClass.getFontStyle(this, this.G8));
        this.s2.setTypeface(HelperClass.getFontStyle(this, this.G8));
        this.t2.setTypeface(HelperClass.getFontStyle(this, this.G8));
        this.u2.setTypeface(HelperClass.getFontStyle(this, this.G8));
    }

    public final void K() {
        String strReplace;
        String string;
        String strTrim = this.T8.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.T8.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.T8.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.T8.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.T8.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strTrim6 = this.T8.getString(this, SP.PLUS_CODE, "").trim();
        if (!strTrim6.isEmpty() && this.p8.equals("concise")) {
            strTrim6 = strTrim6.substring(4);
        }
        String strConcat = (strTrim2 == null || strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (strTrim3 != null && !strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (strTrim4 != null && !strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        boolean z = false;
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (this.S4 && (string = this.T8.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (this.v5) {
            strTrim = strTrim.trim().isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        boolean z2 = this.w5;
        boolean z3 = this.y5;
        if (z2) {
            if (z3) {
                strTrim3 = strTrim.trim().isEmpty() ? eo7.j(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.trim().isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (z3) {
            strTrim3 = strTrim.trim().isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!this.x5) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.trim().isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.trim().isEmpty()) {
            strTrim4 = "Loading...";
        }
        if (strTrim4.trim().isEmpty()) {
            strReplace = "";
        } else {
            if (strTrim4.equalsIgnoreCase("null")) {
                strTrim4 = "Loading...";
            }
            strReplace = s(this.W5, strTrim4);
        }
        String strS = s(this.u6, this.U8.getLatLong(this, this.S8));
        int i = this.S8;
        if (i != 6 && i != 7 && strS.length() > 55 && this.O4 && !this.U4 && !this.Y4 && !this.Z4) {
            String[] strArrSplit = strS.split(" Long");
            strS = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        boolean z4 = this.R4;
        if (z4) {
            strReplace = this.P4 ? eo7.x(strReplace, "<br/>", strS) : strS;
        }
        if (this.T4) {
            String strS2 = s(this.y6, "Plus Code : ".concat(strTrim6));
            strReplace = (this.P4 || z4) ? eo7.x(strReplace, "<br/>", strS2) : strS2;
        }
        if (this.V4) {
            String strS3 = s(this.m6, HelperClass.setDateTimeFormat(this, this.T8.getString(this, SP.DATE_FORMAT_REPORTING, Default.DEFAULT_DATE_FORMAT)));
            strReplace = (this.P4 || z4 || this.T4) ? eo7.x(strReplace, "<br/>", strS3) : strS3;
        }
        if (this.W4) {
            String strS4 = s(this.m6, t(this.T8.getInteger(this, SP.TIMEZONE_REPORTING, 6)));
            if (this.V4) {
                strReplace = eo7.x(strReplace, " ", strS4);
            } else {
                strReplace = (this.P4 || z4 || this.T4) ? eo7.x(strReplace, "<br/>", strS4) : strS4;
            }
        }
        if (this.c5) {
            String strS5 = s(this.O6, this.T8.getString(this, SP.NOTES_HASHTAG_REPORTING, Default.notes));
            strReplace = (this.P4 || z4 || this.V4 || this.W4 || this.T4) ? eo7.x(strReplace, "<br/>", strS5) : strS5;
        }
        if (this.X4) {
            String strS6 = s(this.m7, (this.y7 + " " + this.u7 + " " + this.C7).trim());
            strReplace = (this.P4 || z4 || this.V4 || this.W4 || this.c5 || this.T4) ? eo7.x(strReplace, "<br/>", strS6) : strS6;
        }
        if (this.O5) {
            String strS7 = s(this.a6, (getString(R.string.person_name) + " : " + this.G7).trim());
            strReplace = (this.P4 || z4 || this.V4 || this.W4 || this.c5 || this.T4 || this.X4) ? eo7.x(strReplace, "<br/>", strS7) : strS7;
        }
        if (this.S5) {
            String strS8 = s(this.e6, this.K7.trim());
            strReplace = (this.P4 || z4 || this.V4 || this.W4 || this.c5 || this.T4 || this.X4 || this.O5) ? eo7.x(strReplace, "<br/>", strS8) : strS8;
        }
        if (this.a5) {
            this.G2.setText(HelperClass.getwindConvert(this, this.P7));
            this.G2.setTextColor(this.S6);
            this.i0.setImageResource(R.drawable.ic_wind);
        }
        if (this.Z4) {
            this.H2.setText(this.T8.getString(this, SP.COMPASS_VALUE, ""));
            this.H2.setTextColor(this.K6);
        }
        if (this.U4) {
            boolean zEquals = this.L8.equals("Celsius");
            TextView textView = this.D2;
            float f = this.h8;
            if (zEquals) {
                textView.setText(HelperClass.getCelcius(f));
            } else {
                textView.setText(HelperClass.getFahrenheit(f));
            }
            this.D2.setTextColor(this.C6);
        }
        if (this.Y4) {
            this.I2.setText(this.T8.getString(this, SP.MAGNETIC_FIELD_VALUE, ""));
            this.I2.setTextColor(this.G6);
        }
        if (this.d5) {
            this.F2.setText(eo7.o(new StringBuilder(), this.T8.getString(this, SP.HUMIDITY_VALUE, ""), "%"));
            this.F2.setTextColor(this.W6);
            this.k0.setImageResource(R.drawable.ic_humidity);
        }
        if (this.e5) {
            this.E2.setText(HelperClass.getpressureConvert(this, this.b8));
            this.E2.setTextColor(this.a7);
            this.h0.setImageResource(R.drawable.ic_pressure);
        }
        if (strReplace.contains("null")) {
            strReplace = strReplace.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.C2.setText(Html.fromHtml(strReplace));
        } else {
            SpannableString spannableString = new SpannableString(strConcat);
            spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(this.i6), 0, strConcat.length(), 0);
            Html.fromHtml("<br/>" + strReplace);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strReplace));
            this.C2.setText(spannableStringBuilder);
        }
        if (this.N8.equals(Default.LOGO_uri)) {
            this.e0.setImageResource(R.drawable.new_watermark);
        } else {
            Executors.newSingleThreadExecutor().execute(new xk2(this, new Handler(), 13, z));
        }
        this.F2.setTypeface(HelperClass.getFontStyle(this, this.O8));
        this.G2.setTypeface(HelperClass.getFontStyle(this, this.O8));
        this.E2.setTypeface(HelperClass.getFontStyle(this, this.O8));
        this.C2.setTypeface(HelperClass.getFontStyle(this, this.O8));
        this.D2.setTypeface(HelperClass.getFontStyle(this, this.O8));
        this.H2.setTypeface(HelperClass.getFontStyle(this, this.O8));
        this.I2.setTypeface(HelperClass.getFontStyle(this, this.O8));
        this.G5.setTypeface(HelperClass.getFontStyle(this, this.O8));
    }

    public final void L() {
        boolean z;
        boolean z2;
        this.r8 = getResources().obtainTypedArray(R.array.wI);
        this.h5 = this.T8.getInteger(this, SP.BACKGROUND_COLOR, Color.parseColor("#9c000000"));
        this.U5 = this.T8.getInteger(this, SP.ADDRESS_COLOR, -1);
        this.g6 = this.T8.getInteger(this, SP.SHORT_ADDRESS_COLOR, -1);
        this.k6 = this.T8.getInteger(this, SP.DATE_TIME_COLOR, -1);
        this.s6 = this.T8.getInteger(this, SP.LAT_LNG_COLOR, -1);
        this.w6 = this.T8.getInteger(this, SP.PLUS_CODE_COLOR, -1);
        this.A6 = this.T8.getInteger(this, SP.WEATHER_COLOR, -1);
        this.E6 = this.T8.getInteger(this, SP.MAGNETIC_FIELD_COLOR, -1);
        this.I6 = this.T8.getInteger(this, SP.COMPASS_COLOR, -1);
        this.M6 = this.T8.getInteger(this, SP.NOTES_HASHTAG_COLOR, -1);
        this.Q6 = this.T8.getInteger(this, SP.WIND_COLOR, -1);
        this.U6 = this.T8.getInteger(this, SP.HUMIDITY_COLOR, -1);
        this.Y6 = this.T8.getInteger(this, SP.PRESSURE_COLOR, -1);
        this.T8.getInteger(this, SP.ELEVATION_COLOR, -1);
        this.c7 = this.T8.getInteger(this, SP.ALTITUDE_COLOR, -1);
        this.g7 = this.T8.getInteger(this, SP.ACCURACY_COLOR, -1);
        this.k7 = this.T8.getInteger(this, SP.NUMBERING_COLOR, -1);
        this.Y5 = this.T8.getInteger(this, SP.PERSON_NAME_COLOR, -1);
        this.c6 = this.T8.getInteger(this, SP.CONTACT_NUMBER_COLOR, -1);
        this.o6 = this.T8.getInteger(this, SP.SOUNDLEVEL_COLOR, -1);
        this.T8.getInteger(this, SP.TIMEZONE, 6);
        this.s7 = this.T8.getInteger(this, SP.SEQUENCE, 1);
        this.A7 = this.T8.getString(this, SP.SUFFIX, "");
        this.w7 = this.T8.getString(this, SP.PREFIX, "");
        this.E7 = this.T8.getString(this, SP.PERSON_NAME, "-");
        this.I7 = this.T8.getString(this, SP.CONTACT_NUMBER, Default.contactNumber);
        this.H3 = this.T8.getBoolean(this, SP.IS_MAP, true);
        this.I3 = this.T8.getBoolean(this, SP.IS_ADDRESS, true);
        this.L3 = this.T8.getBoolean(this, SP.IS_COUNTRY_FLAG, true);
        this.n5 = this.T8.getBoolean(this, SP.IS_ADDRESS_CITY, true);
        this.o5 = this.T8.getBoolean(this, SP.IS_ADDRESS_STATE, true);
        this.q5 = this.T8.getBoolean(this, SP.IS_ADDRESS_PINCODE, true);
        this.p5 = this.T8.getBoolean(this, SP.IS_ADDRESS_COUNTRY, true);
        this.M3 = this.T8.getBoolean(this, SP.IS_PLUS_CODE, false);
        this.N3 = this.T8.getBoolean(this, SP.IS_WEATHER, false);
        this.O3 = this.T8.getBoolean(this, SP.IS_DATE_TIME, true);
        this.Q3 = this.T8.getBoolean(this, SP.IS_NUMBERING, false);
        this.M5 = this.T8.getBoolean(this, SP.IS_PERSON_NAME, false);
        this.Q5 = this.T8.getBoolean(this, SP.IS_CONTACT_NUMBER, false);
        this.I5 = this.T8.getBoolean(this, SP.IS_SOUNDLEVEL, false);
        this.P3 = this.T8.getBoolean(this, SP.IS_TIMEZONE, true);
        this.R3 = this.T8.getBoolean(this, SP.IS_MAGNETIC_FIELD, false);
        this.S3 = this.T8.getBoolean(this, SP.IS_COMPASS, false);
        this.U3 = this.T8.getBoolean(this, SP.IS_WIND, false);
        this.V3 = this.T8.getBoolean(this, SP.IS_LOGO, false);
        this.W3 = this.T8.getBoolean(this, SP.IS_NOTES, true);
        this.Y3 = this.T8.getBoolean(this, SP.IS_PRESSURE, false);
        this.X3 = this.T8.getBoolean(this, SP.IS_HUMIDITY, false);
        this.T8.getBoolean(this, SP.IS_ELEVATION, false);
        this.Z3 = this.T8.getBoolean(this, SP.IS_ALTITUDE, false);
        this.a4 = this.T8.getBoolean(this, SP.IS_ACCURACY, false);
        this.z8 = this.T8.getString(this, SP.LOGO_URI, Default.LOGO_uri);
        this.T8.getString(this, SP.NOTES_HASHTAG, Default.notes);
        this.A8 = this.T8.getString(this, SP.STAMP_FONT_STYLE, Default.DEFAULT_FONT_STYLE);
        this.T3 = this.T8.getBoolean(this, SP.COMPASS_FOUND, false);
        this.T8.getString(this, SP.DATE_FORMAT, Default.DEFAULT_DATE_FORMAT);
        this.P8 = this.T8.getInteger(this, SP.LAT_LNG_TYPE, 1);
        this.x8 = this.T8.getString(this, SP.TEMPRATURE_TYPE, "Celsius");
        this.h8 = this.T8.getFloat(this, SP.TEMPRETURE_VALUE);
        int integer = this.T8.getInteger(this, SP.WEATHER_ICON, 0);
        this.i8 = integer;
        this.K.setImageResource(this.r8.getResourceId(integer, 0));
        this.y8 = this.T8.getString(this, SP.MAP_TYPE_TEMPLATE, Default.SETELLITE_2);
        this.T8.getInteger(this, SP.MAP_POS, 1);
        this.T8.getInteger(this, SP.MAP_ZOOM_SCALE, 78);
        this.d8 = this.T8.getInteger(this, SP.MAP_POS_TYPE, 0);
        this.T8.getString(this, SP.STAMP_POS, "Bottom");
        this.j8 = this.T8.getString(this, SP.STAMP_SIZE, Default.TEMPLATE_SIZE);
        this.n8 = this.T8.getString(this, SP.PLUS_CODE_TYPE, Default.PLUSCODE_TYPE);
        this.N7 = this.T8.getInteger(this, SP.WIND_SELECT, 0);
        this.R7 = this.T8.getInteger(this, SP.ALTITUDE_SELECT, 0);
        this.V7 = this.T8.getInteger(this, SP.ACCURACY_SELECT, 0);
        this.Z7 = this.T8.getInteger(this, SP.PRESSURE_SELECT, 0);
        boolean zIsTablet = HelperClass.isTablet(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (this.H3) {
            int i = this.d8;
            ImageView imageView = this.H;
            if (i == 0) {
                imageView.setVisibility(0);
                this.P.setVisibility(8);
                layoutParams.setMargins(getResources().getDimensionPixelOffset(R.dimen._8dp), 0, 0, 0);
            } else {
                imageView.setVisibility(8);
                this.P.setVisibility(0);
                layoutParams.setMargins(0, 0, (int) getResources().getDimension(R.dimen._8dp), 0);
            }
        } else {
            this.H.setVisibility(8);
            this.P.setVisibility(8);
            layoutParams.setMargins(0, 0, 0, 0);
        }
        this.Q2.setLayoutParams(layoutParams);
        boolean z3 = this.N3;
        LinearLayout linearLayout = this.N2;
        if (z3) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        if (this.X3 || this.a4 || this.Z3 || this.U3 || this.Y3 || this.I5) {
            this.W2.setVisibility(0);
            if (zIsTablet) {
                ((LinearLayout.LayoutParams) this.W2.getLayoutParams()).height += 2;
            }
        } else {
            this.W2.setVisibility(8);
        }
        boolean z4 = this.U3;
        LinearLayout linearLayout2 = this.U2;
        if (z4) {
            linearLayout2.setVisibility(0);
        } else {
            linearLayout2.setVisibility(8);
        }
        boolean z5 = this.X3;
        LinearLayout linearLayout3 = this.V2;
        if (z5) {
            linearLayout3.setVisibility(0);
        } else {
            linearLayout3.setVisibility(8);
        }
        boolean z6 = this.Y3;
        LinearLayout linearLayout4 = this.T2;
        if (z6) {
            linearLayout4.setVisibility(0);
        } else {
            linearLayout4.setVisibility(8);
        }
        if (this.I5) {
            String soundLevel = HelperClass.getSoundLevel(this);
            if (this.T2.getVisibility() == 8) {
                this.T2.setVisibility(0);
                this.L.setImageResource(R.drawable.sound_wave);
                this.o0.setText(soundLevel);
                this.o0.setTextColor(this.o6);
            } else if (this.U2.getVisibility() == 8) {
                this.U2.setVisibility(0);
                this.M.setImageResource(R.drawable.sound_wave);
                this.q0.setText(soundLevel);
                this.q0.setTextColor(this.o6);
            } else if (this.V2.getVisibility() == 8) {
                this.V2.setVisibility(0);
                this.O.setImageResource(R.drawable.sound_wave);
                this.p0.setText(soundLevel);
                this.p0.setTextColor(this.o6);
            }
        }
        if (this.Z3) {
            String altitudeconvert = HelperClass.getAltitudeconvert(this, this.R7);
            if (this.T2.getVisibility() == 8) {
                this.T2.setVisibility(0);
                this.L.setImageResource(R.drawable.ic_altitiude);
                this.o0.setText(altitudeconvert);
                this.o0.setTextColor(this.c7);
            } else if (this.U2.getVisibility() == 8) {
                this.U2.setVisibility(0);
                this.M.setImageResource(R.drawable.ic_altitiude);
                this.q0.setText(altitudeconvert);
                this.q0.setTextColor(this.c7);
            } else if (this.V2.getVisibility() == 8) {
                this.V2.setVisibility(0);
                this.O.setImageResource(R.drawable.ic_altitiude);
                this.p0.setText(altitudeconvert);
                this.p0.setTextColor(this.c7);
            }
        }
        if (this.a4) {
            String accuracy = HelperClass.getAccuracy(this, this.V7);
            if (this.T2.getVisibility() == 8) {
                this.T2.setVisibility(0);
                this.L.setImageResource(R.drawable.ic_accuracy);
                this.o0.setText(accuracy);
                this.o0.setTextColor(this.g7);
            } else if (this.U2.getVisibility() == 8) {
                this.U2.setVisibility(0);
                this.M.setImageResource(R.drawable.ic_accuracy);
                this.q0.setText(accuracy);
                this.q0.setTextColor(this.g7);
            } else if (this.V2.getVisibility() == 8) {
                this.V2.setVisibility(0);
                this.O.setImageResource(R.drawable.ic_accuracy);
                this.p0.setText(accuracy);
                this.p0.setTextColor(this.g7);
            }
        }
        if (this.T3) {
            boolean z7 = this.R3;
            LinearLayout linearLayout5 = this.M2;
            if (z7) {
                linearLayout5.setVisibility(0);
            } else {
                linearLayout5.setVisibility(8);
            }
            boolean z8 = this.S3;
            LinearLayout linearLayout6 = this.J2;
            if (z8) {
                linearLayout6.setVisibility(0);
            } else {
                linearLayout6.setVisibility(8);
            }
        } else {
            this.M2.setVisibility(8);
            this.J2.setVisibility(8);
        }
        if (this.N3 || this.R3 || this.S3 || this.V3) {
            this.L2.setVisibility(0);
        } else {
            this.L2.setVisibility(8);
        }
        boolean z9 = this.V3;
        LinearLayout linearLayout7 = this.K2;
        if (z9) {
            linearLayout7.setVisibility(0);
        } else {
            linearLayout7.setVisibility(8);
        }
        if (this.j8.equals(Default.TEMPLATE_SIZE)) {
            this.I.getLayoutParams().height = HelperClass.dpToPx(this, 30);
            this.I.getLayoutParams().width = HelperClass.dpToPx(this, 58);
            this.K.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.K.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.J.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.J.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.O.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.O.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.L.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.L.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.M.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.M.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.N.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.N.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.q0.setTextSize(8.0f);
            this.o0.setTextSize(8.0f);
            this.p0.setTextSize(8.0f);
            this.n0.setTextSize(8.0f);
            this.r0.setTextSize(8.0f);
            this.s0.setTextSize(8.0f);
        } else if (this.j8.equals("Small")) {
            this.I.getLayoutParams().height = HelperClass.dpToPx(this, 28);
            this.I.getLayoutParams().width = HelperClass.dpToPx(this, 54);
            this.K.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.K.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.J.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.J.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.O.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.O.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.L.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.L.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.M.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.M.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.N.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.N.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.q0.setTextSize(7.0f);
            this.o0.setTextSize(7.0f);
            this.p0.setTextSize(7.0f);
            this.n0.setTextSize(7.0f);
            this.r0.setTextSize(7.0f);
            this.s0.setTextSize(7.0f);
        } else {
            boolean zEquals = this.j8.equals("Extra Small");
            ImageView imageView2 = this.I;
            if (zEquals) {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 26);
                this.I.getLayoutParams().width = HelperClass.dpToPx(this, 50);
                this.K.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.K.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.J.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.J.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.O.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.O.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.L.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.L.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.M.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.M.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.N.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.N.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.q0.setTextSize(6.0f);
                this.o0.setTextSize(6.0f);
                this.p0.setTextSize(6.0f);
                this.n0.setTextSize(6.0f);
                this.r0.setTextSize(6.0f);
                this.s0.setTextSize(6.0f);
            } else {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 32);
                this.I.getLayoutParams().width = HelperClass.dpToPx(this, 62);
                this.K.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.K.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.J.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.J.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.O.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.O.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.L.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.L.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.M.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.M.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.N.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.N.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.q0.setTextSize(10.0f);
                this.o0.setTextSize(10.0f);
                this.p0.setTextSize(10.0f);
                this.n0.setTextSize(10.0f);
                this.r0.setTextSize(10.0f);
                this.s0.setTextSize(10.0f);
            }
        }
        boolean z10 = this.H3;
        boolean z11 = this.I3;
        boolean z12 = this.J3;
        boolean z13 = this.K3;
        if (z10) {
            int i2 = z11 ? (z12 ? 1 : 0) + 1 : z12 ? 1 : 0;
            if (z13) {
                i2++;
            }
            if (this.M3) {
                i2++;
            }
            if (this.O3 || this.P3) {
                i2++;
            }
            if (this.Q3) {
                i2++;
            }
            if (this.W3) {
                i2++;
            }
            if (this.M5) {
                i2++;
            }
            int iDpToPx = HelperClass.dpToPx(this, 70);
            int iDpToPx2 = HelperClass.dpToPx(this, 75);
            int iDpToPx3 = HelperClass.dpToPx(this, 80);
            int iDpToPx4 = HelperClass.dpToPx(this, 85);
            int iDpToPx5 = HelperClass.dpToPx(this, 90);
            int iDpToPx6 = HelperClass.dpToPx(this, 95);
            int iDpToPx7 = HelperClass.dpToPx(this, 100);
            int iDpToPx8 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx9 = HelperClass.dpToPx(this, fh.k1);
            boolean z14 = z12 ? 1 : 0;
            int iDpToPx10 = HelperClass.dpToPx(this, 115);
            z = z13;
            int iDpToPx11 = HelperClass.dpToPx(this, 120);
            int iDpToPx12 = HelperClass.dpToPx(this, 125);
            int iDpToPx13 = HelperClass.dpToPx(this, 130);
            int iDpToPx14 = HelperClass.dpToPx(this, 135);
            int iDpToPx15 = HelperClass.dpToPx(this, 140);
            int iDpToPx16 = HelperClass.dpToPx(this, 145);
            int iDpToPx17 = HelperClass.dpToPx(this, 150);
            int iDpToPx18 = HelperClass.dpToPx(this, 155);
            int iDpToPx19 = HelperClass.dpToPx(this, 160);
            int iDpToPx20 = HelperClass.dpToPx(this, 165);
            HelperClass.dpToPx(this, 170);
            if (i2 == 2) {
                if (this.N3 || this.S3 || this.R3) {
                    if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = iDpToPx14;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx14;
                                this.H.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx14;
                                this.P.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            }
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = iDpToPx12;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx12;
                                this.H.getLayoutParams().height = iDpToPx12;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx12;
                                this.P.getLayoutParams().height = iDpToPx12;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals2 = this.j8.equals("Small");
                            LinearLayout linearLayout8 = this.Q2;
                            if (zEquals2) {
                                linearLayout8.getLayoutParams().height = iDpToPx10;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx10;
                                    this.H.getLayoutParams().height = iDpToPx10;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx10;
                                    this.P.getLayoutParams().height = iDpToPx10;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout8.getLayoutParams().height = iDpToPx8;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx8;
                                    this.H.getLayoutParams().height = iDpToPx8;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx8;
                                    this.P.getLayoutParams().height = iDpToPx8;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx12;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx12;
                            this.H.getLayoutParams().height = iDpToPx12;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx12;
                            this.P.getLayoutParams().height = iDpToPx12;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx10;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx10;
                            this.H.getLayoutParams().height = iDpToPx10;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx10;
                            this.P.getLayoutParams().height = iDpToPx10;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals3 = this.j8.equals("Small");
                        LinearLayout linearLayout9 = this.Q2;
                        if (zEquals3) {
                            linearLayout9.getLayoutParams().height = iDpToPx8;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx8;
                                this.H.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx8;
                                this.P.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            }
                        } else {
                            linearLayout9.getLayoutParams().height = iDpToPx6;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx6;
                                this.H.getLayoutParams().height = iDpToPx6;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx6;
                                this.P.getLayoutParams().height = iDpToPx6;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx8;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx8;
                            this.H.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx8;
                            this.P.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx6;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx6;
                            this.H.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx6;
                            this.P.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals4 = this.j8.equals("Small");
                        LinearLayout linearLayout10 = this.Q2;
                        if (zEquals4) {
                            linearLayout10.getLayoutParams().height = iDpToPx5;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx5;
                                this.H.getLayoutParams().height = iDpToPx5;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx5;
                                this.P.getLayoutParams().height = iDpToPx5;
                                z2 = z14;
                            }
                        } else {
                            linearLayout10.getLayoutParams().height = iDpToPx4;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx4;
                                this.H.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx4;
                                this.P.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = iDpToPx4;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx4;
                        this.H.getLayoutParams().height = iDpToPx4;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx4;
                        this.P.getLayoutParams().height = iDpToPx4;
                        z2 = z14;
                    }
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = iDpToPx3;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx3;
                        this.H.getLayoutParams().height = iDpToPx3;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx3;
                        this.P.getLayoutParams().height = iDpToPx3;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals5 = this.j8.equals("Small");
                    LinearLayout linearLayout11 = this.Q2;
                    if (zEquals5) {
                        linearLayout11.getLayoutParams().height = iDpToPx2;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx2;
                            this.H.getLayoutParams().height = iDpToPx2;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx2;
                            this.P.getLayoutParams().height = iDpToPx2;
                            z2 = z14;
                        }
                    } else {
                        linearLayout11.getLayoutParams().height = iDpToPx;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx;
                            this.H.getLayoutParams().height = iDpToPx;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx;
                            this.P.getLayoutParams().height = iDpToPx;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 == 3) {
                if (!this.N3 && !this.S3 && !this.R3) {
                    boolean z15 = this.I3;
                    boolean z16 = this.U3;
                    if (z15) {
                        if (z16 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                            if (this.j8.equals("Large")) {
                                this.Q2.getLayoutParams().height = iDpToPx11;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx11;
                                    this.H.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx11;
                                    this.P.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                }
                            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                                this.Q2.getLayoutParams().height = iDpToPx9;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx9;
                                    this.H.getLayoutParams().height = iDpToPx9;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx9;
                                    this.P.getLayoutParams().height = iDpToPx9;
                                    z2 = z14;
                                }
                            } else {
                                boolean zEquals6 = this.j8.equals("Small");
                                LinearLayout linearLayout12 = this.Q2;
                                if (zEquals6) {
                                    linearLayout12.getLayoutParams().height = iDpToPx7;
                                    if (this.d8 == 0) {
                                        this.H.getLayoutParams().width = iDpToPx7;
                                        this.H.getLayoutParams().height = iDpToPx7;
                                        z2 = z14;
                                    } else {
                                        this.P.getLayoutParams().width = iDpToPx7;
                                        this.P.getLayoutParams().height = iDpToPx7;
                                        z2 = z14;
                                    }
                                } else {
                                    linearLayout12.getLayoutParams().height = iDpToPx5;
                                    if (this.d8 == 0) {
                                        this.H.getLayoutParams().width = iDpToPx5;
                                        this.H.getLayoutParams().height = iDpToPx5;
                                        z2 = z14;
                                    } else {
                                        this.P.getLayoutParams().width = iDpToPx5;
                                        this.P.getLayoutParams().height = iDpToPx5;
                                        z2 = z14;
                                    }
                                }
                            }
                        } else if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = iDpToPx9;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx9;
                                this.H.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx9;
                                this.P.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = iDpToPx7;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx7;
                                this.H.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx7;
                                this.P.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals7 = this.j8.equals("Small");
                            LinearLayout linearLayout13 = this.Q2;
                            if (zEquals7) {
                                linearLayout13.getLayoutParams().height = iDpToPx5;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx5;
                                    this.H.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx5;
                                    this.P.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout13.getLayoutParams().height = iDpToPx3;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx3;
                                    this.H.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx3;
                                    this.P.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (z16 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = iDpToPx9;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx9;
                                this.H.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx9;
                                this.P.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = iDpToPx7;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx7;
                                this.H.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx7;
                                this.P.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals8 = this.j8.equals("Small");
                            LinearLayout linearLayout14 = this.Q2;
                            if (zEquals8) {
                                linearLayout14.getLayoutParams().height = iDpToPx5;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx5;
                                    this.H.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx5;
                                    this.P.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout14.getLayoutParams().height = iDpToPx3;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx3;
                                    this.H.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx3;
                                    this.P.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx7;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx7;
                            this.H.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx7;
                            this.P.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx5;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx5;
                            this.H.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx5;
                            this.P.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals9 = this.j8.equals("Small");
                        LinearLayout linearLayout15 = this.Q2;
                        if (zEquals9) {
                            linearLayout15.getLayoutParams().height = iDpToPx3;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx3;
                                this.H.getLayoutParams().height = iDpToPx3;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx3;
                                this.P.getLayoutParams().height = iDpToPx3;
                                z2 = z14;
                            }
                        } else {
                            linearLayout15.getLayoutParams().height = iDpToPx;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx;
                                this.H.getLayoutParams().height = iDpToPx;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx;
                                this.P.getLayoutParams().height = iDpToPx;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx13;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx13;
                            this.H.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx13;
                            this.P.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx11;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx11;
                            this.H.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx11;
                            this.P.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals10 = this.j8.equals("Small");
                        LinearLayout linearLayout16 = this.Q2;
                        if (zEquals10) {
                            linearLayout16.getLayoutParams().height = iDpToPx9;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx9;
                                this.H.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx9;
                                this.P.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else {
                            linearLayout16.getLayoutParams().height = iDpToPx7;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx7;
                                this.H.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx7;
                                this.P.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = iDpToPx11;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx11;
                        this.H.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx11;
                        this.P.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    }
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = iDpToPx9;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx9;
                        this.H.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx9;
                        this.P.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals11 = this.j8.equals("Small");
                    LinearLayout linearLayout17 = this.Q2;
                    if (zEquals11) {
                        linearLayout17.getLayoutParams().height = iDpToPx7;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx7;
                            this.H.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx7;
                            this.P.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else {
                        linearLayout17.getLayoutParams().height = iDpToPx5;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx5;
                            this.H.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx5;
                            this.P.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 == 4) {
                if (!this.N3 && !this.S3 && !this.R3) {
                    boolean z17 = this.I3;
                    boolean z18 = this.U3;
                    if (z17) {
                        if (z18 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                            if (this.j8.equals("Large")) {
                                this.Q2.getLayoutParams().height = iDpToPx12;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx12;
                                    this.H.getLayoutParams().height = iDpToPx12;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx12;
                                    this.P.getLayoutParams().height = iDpToPx12;
                                    z2 = z14;
                                }
                            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                                this.Q2.getLayoutParams().height = iDpToPx10;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx10;
                                    this.H.getLayoutParams().height = iDpToPx10;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx10;
                                    this.P.getLayoutParams().height = iDpToPx10;
                                    z2 = z14;
                                }
                            } else {
                                boolean zEquals12 = this.j8.equals("Small");
                                LinearLayout linearLayout18 = this.Q2;
                                if (zEquals12) {
                                    linearLayout18.getLayoutParams().height = iDpToPx8;
                                    if (this.d8 == 0) {
                                        this.H.getLayoutParams().width = iDpToPx8;
                                        this.H.getLayoutParams().height = iDpToPx8;
                                        z2 = z14;
                                    } else {
                                        this.P.getLayoutParams().width = iDpToPx8;
                                        this.P.getLayoutParams().height = iDpToPx8;
                                        z2 = z14;
                                    }
                                } else {
                                    linearLayout18.getLayoutParams().height = iDpToPx6;
                                    if (this.d8 == 0) {
                                        this.H.getLayoutParams().width = iDpToPx6;
                                        this.H.getLayoutParams().height = iDpToPx6;
                                        z2 = z14;
                                    } else {
                                        this.P.getLayoutParams().width = iDpToPx6;
                                        this.P.getLayoutParams().height = iDpToPx6;
                                        z2 = z14;
                                    }
                                }
                            }
                        } else if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = iDpToPx10;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx10;
                                this.H.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx10;
                                this.P.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            }
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = iDpToPx8;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx8;
                                this.H.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx8;
                                this.P.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals13 = this.j8.equals("Small");
                            LinearLayout linearLayout19 = this.Q2;
                            if (zEquals13) {
                                linearLayout19.getLayoutParams().height = iDpToPx6;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx6;
                                    this.H.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx6;
                                    this.P.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout19.getLayoutParams().height = iDpToPx4;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx4;
                                    this.H.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx4;
                                    this.P.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (z18 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = iDpToPx10;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx10;
                                this.H.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx10;
                                this.P.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            }
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = iDpToPx8;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx8;
                                this.H.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx8;
                                this.P.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals14 = this.j8.equals("Small");
                            LinearLayout linearLayout20 = this.Q2;
                            if (zEquals14) {
                                linearLayout20.getLayoutParams().height = iDpToPx6;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx6;
                                    this.H.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx6;
                                    this.P.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout20.getLayoutParams().height = iDpToPx4;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx4;
                                    this.H.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx4;
                                    this.P.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx8;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx8;
                            this.H.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx8;
                            this.P.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx6;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx6;
                            this.H.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx6;
                            this.P.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals15 = this.j8.equals("Small");
                        LinearLayout linearLayout21 = this.Q2;
                        if (zEquals15) {
                            linearLayout21.getLayoutParams().height = iDpToPx4;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx4;
                                this.H.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx4;
                                this.P.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            }
                        } else {
                            linearLayout21.getLayoutParams().height = iDpToPx2;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx2;
                                this.H.getLayoutParams().height = iDpToPx2;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx2;
                                this.P.getLayoutParams().height = iDpToPx2;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx13;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx13;
                            this.H.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx13;
                            this.P.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx11;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx11;
                            this.H.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx11;
                            this.P.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals16 = this.j8.equals("Small");
                        LinearLayout linearLayout22 = this.Q2;
                        if (zEquals16) {
                            linearLayout22.getLayoutParams().height = iDpToPx9;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx9;
                                this.H.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx9;
                                this.P.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else {
                            linearLayout22.getLayoutParams().height = iDpToPx7;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx7;
                                this.H.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx7;
                                this.P.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = iDpToPx11;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx11;
                        this.H.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx11;
                        this.P.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    }
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = iDpToPx9;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx9;
                        this.H.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx9;
                        this.P.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals17 = this.j8.equals("Small");
                    LinearLayout linearLayout23 = this.Q2;
                    if (zEquals17) {
                        linearLayout23.getLayoutParams().height = iDpToPx7;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx7;
                            this.H.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx7;
                            this.P.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else {
                        linearLayout23.getLayoutParams().height = iDpToPx5;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx5;
                            this.H.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx5;
                            this.P.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 == 5) {
                if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx13;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx13;
                            this.H.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx13;
                            this.P.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx11;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx11;
                            this.H.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx11;
                            this.P.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals18 = this.j8.equals("Small");
                        LinearLayout linearLayout24 = this.Q2;
                        if (zEquals18) {
                            linearLayout24.getLayoutParams().height = iDpToPx9;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx9;
                                this.H.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx9;
                                this.P.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else {
                            linearLayout24.getLayoutParams().height = iDpToPx7;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx7;
                                this.H.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx7;
                                this.P.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = iDpToPx11;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx11;
                        this.H.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx11;
                        this.P.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    }
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = iDpToPx9;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx9;
                        this.H.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx9;
                        this.P.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals19 = this.j8.equals("Small");
                    LinearLayout linearLayout25 = this.Q2;
                    if (zEquals19) {
                        linearLayout25.getLayoutParams().height = iDpToPx7;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx7;
                            this.H.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx7;
                            this.P.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else {
                        linearLayout25.getLayoutParams().height = iDpToPx5;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx5;
                            this.H.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx5;
                            this.P.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 != 6) {
                boolean z19 = this.U3;
                if (i2 == 7) {
                    if (z19 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = iDpToPx17;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx17;
                                this.H.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx17;
                                this.P.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            }
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = iDpToPx15;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx15;
                                this.H.getLayoutParams().height = iDpToPx15;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx15;
                                this.P.getLayoutParams().height = iDpToPx15;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals20 = this.j8.equals("Small");
                            LinearLayout linearLayout26 = this.Q2;
                            if (zEquals20) {
                                linearLayout26.getLayoutParams().height = iDpToPx13;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx13;
                                    this.H.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx13;
                                    this.P.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout26.getLayoutParams().height = iDpToPx11;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx11;
                                    this.H.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx11;
                                    this.P.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx15;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx15;
                            this.H.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx15;
                            this.P.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx13;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx13;
                            this.H.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx13;
                            this.P.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals21 = this.j8.equals("Small");
                        LinearLayout linearLayout27 = this.Q2;
                        if (zEquals21) {
                            linearLayout27.getLayoutParams().height = iDpToPx11;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx11;
                                this.H.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx11;
                                this.P.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            }
                        } else {
                            linearLayout27.getLayoutParams().height = iDpToPx9;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx9;
                                this.H.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx9;
                                this.P.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        }
                    }
                } else if (i2 == 8) {
                    if (z19 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = iDpToPx19;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx19;
                                this.H.getLayoutParams().height = iDpToPx19;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx19;
                                this.P.getLayoutParams().height = iDpToPx19;
                                z2 = z14;
                            }
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = iDpToPx17;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx17;
                                this.H.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx17;
                                this.P.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals22 = this.j8.equals("Small");
                            LinearLayout linearLayout28 = this.Q2;
                            if (zEquals22) {
                                linearLayout28.getLayoutParams().height = iDpToPx15;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx15;
                                    this.H.getLayoutParams().height = iDpToPx15;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx15;
                                    this.P.getLayoutParams().height = iDpToPx15;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout28.getLayoutParams().height = iDpToPx13;
                                if (this.d8 == 0) {
                                    this.H.getLayoutParams().width = iDpToPx13;
                                    this.H.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                } else {
                                    this.P.getLayoutParams().width = iDpToPx13;
                                    this.P.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx17;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx17;
                            this.H.getLayoutParams().height = iDpToPx17;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx17;
                            this.P.getLayoutParams().height = iDpToPx17;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx15;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx15;
                            this.H.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx15;
                            this.P.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals23 = this.j8.equals("Small");
                        LinearLayout linearLayout29 = this.Q2;
                        if (zEquals23) {
                            linearLayout29.getLayoutParams().height = iDpToPx13;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx13;
                                this.H.getLayoutParams().height = iDpToPx13;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx13;
                                this.P.getLayoutParams().height = iDpToPx13;
                                z2 = z14;
                            }
                        } else {
                            linearLayout29.getLayoutParams().height = iDpToPx11;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx11;
                                this.H.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx11;
                                this.P.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            }
                        }
                    }
                } else if (z19 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = iDpToPx20;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx20;
                            this.H.getLayoutParams().height = iDpToPx20;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx20;
                            this.P.getLayoutParams().height = iDpToPx20;
                            z2 = z14;
                        }
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = iDpToPx18;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx18;
                            this.H.getLayoutParams().height = iDpToPx18;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx18;
                            this.P.getLayoutParams().height = iDpToPx18;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals24 = this.j8.equals("Small");
                        LinearLayout linearLayout30 = this.Q2;
                        if (zEquals24) {
                            linearLayout30.getLayoutParams().height = iDpToPx16;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx16;
                                this.H.getLayoutParams().height = iDpToPx16;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx16;
                                this.P.getLayoutParams().height = iDpToPx16;
                                z2 = z14;
                            }
                        } else {
                            linearLayout30.getLayoutParams().height = iDpToPx14;
                            if (this.d8 == 0) {
                                this.H.getLayoutParams().width = iDpToPx14;
                                this.H.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            } else {
                                this.P.getLayoutParams().width = iDpToPx14;
                                this.P.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = iDpToPx18;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx18;
                        this.H.getLayoutParams().height = iDpToPx18;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx18;
                        this.P.getLayoutParams().height = iDpToPx18;
                        z2 = z14;
                    }
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = iDpToPx16;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx16;
                        this.H.getLayoutParams().height = iDpToPx16;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx16;
                        this.P.getLayoutParams().height = iDpToPx16;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals25 = this.j8.equals("Small");
                    LinearLayout linearLayout31 = this.Q2;
                    if (zEquals25) {
                        linearLayout31.getLayoutParams().height = iDpToPx14;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx14;
                            this.H.getLayoutParams().height = iDpToPx14;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx14;
                            this.P.getLayoutParams().height = iDpToPx14;
                            z2 = z14;
                        }
                    } else {
                        linearLayout31.getLayoutParams().height = iDpToPx12;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx12;
                            this.H.getLayoutParams().height = iDpToPx12;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx12;
                            this.P.getLayoutParams().height = iDpToPx12;
                            z2 = z14;
                        }
                    }
                }
            } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = iDpToPx15;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx15;
                        this.H.getLayoutParams().height = iDpToPx15;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx15;
                        this.P.getLayoutParams().height = iDpToPx15;
                        z2 = z14;
                    }
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = iDpToPx13;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx13;
                        this.H.getLayoutParams().height = iDpToPx13;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx13;
                        this.P.getLayoutParams().height = iDpToPx13;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals26 = this.j8.equals("Small");
                    LinearLayout linearLayout32 = this.Q2;
                    if (zEquals26) {
                        linearLayout32.getLayoutParams().height = iDpToPx11;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx11;
                            this.H.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx11;
                            this.P.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        linearLayout32.getLayoutParams().height = iDpToPx9;
                        if (this.d8 == 0) {
                            this.H.getLayoutParams().width = iDpToPx9;
                            this.H.getLayoutParams().height = iDpToPx9;
                            z2 = z14;
                        } else {
                            this.P.getLayoutParams().width = iDpToPx9;
                            this.P.getLayoutParams().height = iDpToPx9;
                            z2 = z14;
                        }
                    }
                }
            } else if (this.j8.equals("Large")) {
                this.Q2.getLayoutParams().height = iDpToPx13;
                if (this.d8 == 0) {
                    this.H.getLayoutParams().width = iDpToPx13;
                    this.H.getLayoutParams().height = iDpToPx13;
                    z2 = z14;
                } else {
                    this.P.getLayoutParams().width = iDpToPx13;
                    this.P.getLayoutParams().height = iDpToPx13;
                    z2 = z14;
                }
            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                this.Q2.getLayoutParams().height = iDpToPx11;
                if (this.d8 == 0) {
                    this.H.getLayoutParams().width = iDpToPx11;
                    this.H.getLayoutParams().height = iDpToPx11;
                    z2 = z14;
                } else {
                    this.P.getLayoutParams().width = iDpToPx11;
                    this.P.getLayoutParams().height = iDpToPx11;
                    z2 = z14;
                }
            } else {
                boolean zEquals27 = this.j8.equals("Small");
                LinearLayout linearLayout33 = this.Q2;
                if (zEquals27) {
                    linearLayout33.getLayoutParams().height = iDpToPx9;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx9;
                        this.H.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx9;
                        this.P.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    linearLayout33.getLayoutParams().height = iDpToPx7;
                    if (this.d8 == 0) {
                        this.H.getLayoutParams().width = iDpToPx7;
                        this.H.getLayoutParams().height = iDpToPx7;
                        z2 = z14;
                    } else {
                        this.P.getLayoutParams().width = iDpToPx7;
                        this.P.getLayoutParams().height = iDpToPx7;
                        z2 = z14;
                    }
                }
            }
        } else {
            boolean z20 = z12 ? 1 : 0;
            z = z13;
            int i3 = z11 ? (z20 ? 1 : 0) + 1 : z20 ? 1 : 0;
            if (z) {
                i3++;
            }
            if (this.M3) {
                i3++;
            }
            if (this.O3 || this.P3) {
                i3++;
            }
            if (this.Q3) {
                i3++;
            }
            if (this.W3) {
                i3++;
            }
            if (this.M5) {
                i3++;
            }
            if (i3 == 2) {
                if (this.N3 || this.S3 || this.R3) {
                    if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            z2 = z20;
                        } else {
                            boolean zEquals28 = this.j8.equals("Small");
                            LinearLayout linearLayout34 = this.Q2;
                            if (zEquals28) {
                                linearLayout34.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                z2 = z20;
                            } else {
                                linearLayout34.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                        z2 = z20;
                    } else {
                        boolean zEquals29 = this.j8.equals("Small");
                        LinearLayout linearLayout35 = this.Q2;
                        if (zEquals29) {
                            linearLayout35.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            z2 = z20;
                        } else {
                            linearLayout35.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            z2 = z20;
                        }
                    }
                } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                        z2 = z20;
                    } else {
                        boolean zEquals30 = this.j8.equals("Small");
                        LinearLayout linearLayout36 = this.Q2;
                        if (zEquals30) {
                            linearLayout36.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                            z2 = z20;
                        } else {
                            linearLayout36.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                    z2 = z20;
                } else {
                    boolean zEquals31 = this.j8.equals("Small");
                    LinearLayout linearLayout37 = this.Q2;
                    if (zEquals31) {
                        linearLayout37.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_45);
                        z2 = z20;
                    } else {
                        linearLayout37.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_40);
                        z2 = z20;
                    }
                }
            } else if (i3 == 3) {
                if (!this.N3 && !this.S3 && !this.R3) {
                    boolean z21 = this.U3;
                    if (z11) {
                        if (z21 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                            if (this.j8.equals("Large")) {
                                this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                z2 = z20;
                            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                                this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                z2 = z20;
                            } else {
                                boolean zEquals32 = this.j8.equals("Small");
                                LinearLayout linearLayout38 = this.Q2;
                                if (zEquals32) {
                                    linearLayout38.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                                    z2 = z20;
                                } else {
                                    linearLayout38.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                                    z2 = z20;
                                }
                            }
                        } else if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        } else {
                            boolean zEquals33 = this.j8.equals("Small");
                            LinearLayout linearLayout39 = this.Q2;
                            if (zEquals33) {
                                linearLayout39.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                                z2 = z20;
                            } else {
                                linearLayout39.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                                z2 = z20;
                            }
                        }
                    } else if (z21 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        } else {
                            boolean zEquals34 = this.j8.equals("Small");
                            LinearLayout linearLayout40 = this.Q2;
                            if (zEquals34) {
                                linearLayout40.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                                z2 = z20;
                            } else {
                                linearLayout40.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    } else {
                        boolean zEquals35 = this.j8.equals("Small");
                        LinearLayout linearLayout41 = this.Q2;
                        if (zEquals35) {
                            linearLayout41.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                            z2 = z20;
                        } else {
                            linearLayout41.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_40);
                            z2 = z20;
                        }
                    }
                } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        boolean zEquals36 = this.j8.equals("Small");
                        LinearLayout linearLayout42 = this.Q2;
                        if (zEquals36) {
                            linearLayout42.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else {
                            linearLayout42.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    boolean zEquals37 = this.j8.equals("Small");
                    LinearLayout linearLayout43 = this.Q2;
                    if (zEquals37) {
                        linearLayout43.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else {
                        linearLayout43.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    }
                }
            } else if (i3 == 4) {
                if (!this.N3 && !this.S3 && !this.R3) {
                    boolean z22 = this.U3;
                    if (z11) {
                        if (z22 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                            if (this.j8.equals("Large")) {
                                this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                z2 = z20;
                            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                                this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                z2 = z20;
                            } else {
                                boolean zEquals38 = this.j8.equals("Small");
                                LinearLayout linearLayout44 = this.Q2;
                                if (zEquals38) {
                                    linearLayout44.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                    z2 = z20;
                                } else {
                                    linearLayout44.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                    z2 = z20;
                                }
                            }
                        } else if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            z2 = z20;
                        } else {
                            boolean zEquals39 = this.j8.equals("Small");
                            LinearLayout linearLayout45 = this.Q2;
                            if (zEquals39) {
                                linearLayout45.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                z2 = z20;
                            } else {
                                linearLayout45.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                                z2 = z20;
                            }
                        }
                    } else if (z22 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            z2 = z20;
                        } else {
                            boolean zEquals40 = this.j8.equals("Small");
                            LinearLayout linearLayout46 = this.Q2;
                            if (zEquals40) {
                                linearLayout46.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                z2 = z20;
                            } else {
                                linearLayout46.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                        z2 = z20;
                    } else {
                        boolean zEquals41 = this.j8.equals("Small");
                        LinearLayout linearLayout47 = this.Q2;
                        if (zEquals41) {
                            linearLayout47.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                            z2 = z20;
                        } else {
                            linearLayout47.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_45);
                            z2 = z20;
                        }
                    }
                } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        boolean zEquals42 = this.j8.equals("Small");
                        LinearLayout linearLayout48 = this.Q2;
                        if (zEquals42) {
                            linearLayout48.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else {
                            linearLayout48.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    boolean zEquals43 = this.j8.equals("Small");
                    LinearLayout linearLayout49 = this.Q2;
                    if (zEquals43) {
                        linearLayout49.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else {
                        linearLayout49.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    }
                }
            } else if (i3 == 5) {
                if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        boolean zEquals44 = this.j8.equals("Small");
                        LinearLayout linearLayout50 = this.Q2;
                        if (zEquals44) {
                            linearLayout50.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else {
                            linearLayout50.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    boolean zEquals45 = this.j8.equals("Small");
                    LinearLayout linearLayout51 = this.Q2;
                    if (zEquals45) {
                        linearLayout51.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else {
                        linearLayout51.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    }
                }
            } else if (i3 != 6) {
                boolean z23 = this.U3;
                if (i3 == 7) {
                    if (z23 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                            z2 = z20;
                        } else {
                            boolean zEquals46 = this.j8.equals("Small");
                            LinearLayout linearLayout52 = this.Q2;
                            if (zEquals46) {
                                linearLayout52.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                z2 = z20;
                            } else {
                                linearLayout52.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else {
                        boolean zEquals47 = this.j8.equals("Small");
                        LinearLayout linearLayout53 = this.Q2;
                        if (zEquals47) {
                            linearLayout53.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            z2 = z20;
                        } else {
                            linearLayout53.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        }
                    }
                } else if (i3 == 8) {
                    if (z23 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                        if (this.j8.equals("Large")) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_130);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            z2 = z20;
                        } else {
                            boolean zEquals48 = this.j8.equals("Small");
                            LinearLayout linearLayout54 = this.Q2;
                            if (zEquals48) {
                                linearLayout54.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                                z2 = z20;
                            } else {
                                linearLayout54.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        z2 = z20;
                    } else {
                        boolean zEquals49 = this.j8.equals("Small");
                        LinearLayout linearLayout55 = this.Q2;
                        if (zEquals49) {
                            linearLayout55.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                            z2 = z20;
                        } else {
                            linearLayout55.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            z2 = z20;
                        }
                    }
                } else if (z23 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                    if (this.j8.equals("Large")) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_135);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_125);
                        z2 = z20;
                    } else {
                        boolean zEquals50 = this.j8.equals("Small");
                        LinearLayout linearLayout56 = this.Q2;
                        if (zEquals50) {
                            linearLayout56.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                            z2 = z20;
                        } else {
                            linearLayout56.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_125);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                    z2 = z20;
                } else {
                    boolean zEquals51 = this.j8.equals("Small");
                    LinearLayout linearLayout57 = this.Q2;
                    if (zEquals51) {
                        linearLayout57.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        z2 = z20;
                    } else {
                        linearLayout57.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        z2 = z20;
                    }
                }
            } else if (this.U3 || this.X3 || this.Y3 || this.Z3 || this.a4 || this.I5) {
                if (this.j8.equals("Large")) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                    z2 = z20;
                } else {
                    boolean zEquals52 = this.j8.equals("Small");
                    LinearLayout linearLayout58 = this.Q2;
                    if (zEquals52) {
                        linearLayout58.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        linearLayout58.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                        z2 = z20;
                    }
                }
            } else if (this.j8.equals("Large")) {
                this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                z2 = z20;
            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                this.Q2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                z2 = z20;
            } else {
                boolean zEquals53 = this.j8.equals("Small");
                LinearLayout linearLayout59 = this.Q2;
                if (zEquals53) {
                    linearLayout59.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    linearLayout59.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                    z2 = z20;
                }
            }
        }
        if (this.I3 || z2 || z || this.O3 || this.W3 || this.U3 || this.X3 || this.a4 || this.I5 || this.Y3 || this.Z3 || this.Q3 || this.P3 || this.M3 || this.M5) {
            this.P2.setVisibility(0);
            this.L2.setOrientation(1);
            this.L2.setGravity(19);
            this.L2.getLayoutParams().width = -2;
            this.L2.getLayoutParams().width = -2;
        } else {
            this.P2.setVisibility(8);
            this.L2.setOrientation(0);
            this.L2.setGravity(17);
            this.L2.getLayoutParams().width = -1;
            this.L2.getLayoutParams().width = -1;
            if (this.V3 && !this.H3) {
                boolean zEquals54 = this.j8.equals("Large");
                LinearLayout linearLayout60 = this.Q2;
                if (zEquals54) {
                    linearLayout60.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_80dp);
                } else {
                    linearLayout60.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_40);
                }
            }
        }
        if (!this.I3 && !z2 && !z && !this.O3 && !this.W3 && !this.Q3 && !this.P3 && !this.M3 && this.W2.getVisibility() == 0) {
            this.W2.setGravity(17);
            this.W2.getLayoutParams().width = -1;
        }
        if (z || this.I3 || z2 || this.R3 || this.N3 || this.S3 || this.O3 || this.Q3 || this.P3 || this.H3 || this.W3 || this.U3 || this.X3 || this.a4 || this.I5 || this.Y3 || this.Z3 || this.V3 || this.M3 || this.M5) {
            this.O2.setVisibility(0);
            G();
        } else {
            this.O2.setVisibility(8);
        }
        if (z || this.I3 || z2 || this.O3 || this.W3 || this.Q3 || this.P3 || this.M3 || this.M5) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setVisibility(8);
        }
        if (!this.H3 || this.I3 || z2 || this.S3 || this.O3 || z || this.R3 || this.N3 || this.W3 || this.U3 || this.X3 || this.a4 || this.I5 || this.Y3 || this.Z3 || this.V3 || this.Q3 || this.P3 || this.M3 || this.M5) {
            this.Q2.setVisibility(0);
        } else {
            this.Q2.setVisibility(4);
        }
        this.R2.setVisibility(8);
        this.S2.setVisibility(8);
        this.Q2.setBackground(getDrawable(R.drawable.rect_grey));
        ((GradientDrawable) this.Q2.getBackground().getCurrent()).setColor(this.h5);
        A();
    }

    public final void M() {
        boolean z;
        boolean z2;
        this.r8 = getResources().obtainTypedArray(R.array.wI);
        this.i5 = this.T8.getInteger(this, SP.BACKGROUND_COLOR_CLASSIC, Color.parseColor("#9c000000"));
        this.V5 = this.T8.getInteger(this, SP.ADDRESS_COLOR_CLASSIC, -1);
        this.h6 = this.T8.getInteger(this, SP.SHORT_ADDRESS_COLOR_CLASSIC, -1);
        this.l6 = this.T8.getInteger(this, SP.DATE_TIME_COLOR_CLASSIC, -1);
        this.t6 = this.T8.getInteger(this, VCKtvKCuFgEI.vKhmWANGWyILCam, -1);
        this.x6 = this.T8.getInteger(this, SP.PLUS_CODE_COLOR_CLASSIC, -1);
        this.B6 = this.T8.getInteger(this, SP.WEATHER_COLOR_CLASSIC, -1);
        this.F6 = this.T8.getInteger(this, SP.MAGNETIC_FIELD_COLOR_CLASSIC, -1);
        this.J6 = this.T8.getInteger(this, SP.COMPASS_COLOR_CLASSIC, -1);
        this.N6 = this.T8.getInteger(this, SP.NOTES_HASHTAG_COLOR_CLASSIC, -1);
        this.R6 = this.T8.getInteger(this, SP.WIND_COLOR_CLASSIC, -1);
        this.V6 = this.T8.getInteger(this, SP.HUMIDITY_COLOR_CLASSIC, -1);
        this.Z6 = this.T8.getInteger(this, SP.PRESSURE_COLOR_CLASSIC, -1);
        this.T8.getInteger(this, SP.ELEVATION_COLOR_CLASSIC, -1);
        this.Z5 = this.T8.getInteger(this, SP.PERSON_NAME_COLOR_CLASSIC, -1);
        this.d6 = this.T8.getInteger(this, SP.CONTACT_NUMBER_COLOR_CLASSIC, -1);
        this.p6 = this.T8.getInteger(this, SP.SOUNDLEVEL_COLOR_CLASSIC, -1);
        this.d7 = this.T8.getInteger(this, SP.ALTITUDE_COLOR_CLASSIC, -1);
        this.h7 = this.T8.getInteger(this, SP.ACCURACY_COLOR_CLASSIC, -1);
        this.l7 = this.T8.getInteger(this, SP.NUMBERING_COLOR_CLASSIC, -1);
        this.T8.getInteger(this, SP.TIMEZONE_CLASSIC, 6);
        this.t7 = this.T8.getInteger(this, SP.SEQUENCE_CLASSIC, 1);
        this.B7 = this.T8.getString(this, SP.SUFFIX_CLASSIC, "");
        this.x7 = this.T8.getString(this, SP.PREFIX_CLASSIC, "");
        this.F7 = this.T8.getString(this, SP.PERSON_NAME_CLASSIC, "-");
        this.J7 = this.T8.getString(this, SP.CONTACT_NUMBER_CLASSIC, Default.contactNumber);
        this.v4 = this.T8.getBoolean(this, SP.IS_MAP_CLASSIC, true);
        this.z4 = this.T8.getBoolean(this, SP.IS_COUNTRY_FLAG_CLASSIC, true);
        this.w4 = this.T8.getBoolean(this, SP.IS_ADDRESS_CLASSIC, true);
        this.r5 = this.T8.getBoolean(this, SP.IS_ADDRESS_CITY_CLASSIC, true);
        this.s5 = this.T8.getBoolean(this, SP.IS_ADDRESS_STATE_CLASSIC, true);
        this.u5 = this.T8.getBoolean(this, SP.IS_ADDRESS_PINCODE_CLASSIC, true);
        this.t5 = this.T8.getBoolean(this, SP.IS_ADDRESS_COUNTRY_CLASSIC, true);
        this.A4 = this.T8.getBoolean(this, SP.IS_PLUS_CODE_CLASSIC, false);
        this.C4 = this.T8.getBoolean(this, SP.IS_DATE_TIME_CLASSIC, true);
        this.B4 = this.T8.getBoolean(this, SP.IS_WEATHER_CLASSIC, false);
        this.D4 = this.T8.getBoolean(this, SP.IS_TIMEZONE_CLASSIC, true);
        this.E4 = this.T8.getBoolean(this, SP.IS_NUMBERING_CLASSIC, false);
        this.N5 = this.T8.getBoolean(this, SP.IS_PERSON_NAME_CLASSIC, false);
        this.R5 = this.T8.getBoolean(this, SP.IS_CONTACT_NUMBER_CLASSIC, false);
        this.J5 = this.T8.getBoolean(this, SP.IS_SOUNDLEVEL_CLASSIC, false);
        this.F4 = this.T8.getBoolean(this, SP.IS_MAGNETIC_FIELD_CLASSIC, false);
        this.G4 = this.T8.getBoolean(this, SP.IS_COMPASS_CLASSIC, false);
        this.H4 = this.T8.getBoolean(this, SP.IS_WIND_CLASSIC, false);
        this.I4 = this.T8.getBoolean(this, SP.IS_LOGO_CLASSIC, false);
        this.J4 = this.T8.getBoolean(this, SP.IS_NOTES_CLASSIC, true);
        this.L4 = this.T8.getBoolean(this, SP.IS_PRESSURE_CLASSIC, false);
        this.K4 = this.T8.getBoolean(this, SP.IS_HUMIDITY_CLASSIC, false);
        this.T8.getBoolean(this, SP.IS_ELEVATION_CLASSIC, false);
        this.M4 = this.T8.getBoolean(this, SP.IS_ALTITUDE_CLASSIC, false);
        this.N4 = this.T8.getBoolean(this, SP.IS_ACCURACY_CLASSIC, false);
        this.J8 = this.T8.getString(this, SP.LOGO_URI_CLASSIC, Default.LOGO_uri);
        this.T8.getString(this, SP.NOTES_HASHTAG_CLASSIC, Default.notes);
        this.K8 = this.T8.getString(this, SP.STAMP_FONT_STYLE_CLASSIC, Default.DEFAULT_FONT_STYLE);
        this.T8.getString(this, SP.DATE_FORMAT_CLASSIC, ZOCVirpIr.TtgCl);
        this.R8 = this.T8.getInteger(this, SP.LAT_LNG_TYPE_CLASSIC, 1);
        this.H8 = this.T8.getString(this, SP.TEMPRATURE_TYPE_CLASSIC, "Celsius");
        this.h8 = this.T8.getFloat(this, SP.TEMPRETURE_VALUE);
        this.T8.getInteger(this, SP.WEATHER_ICON, 0);
        this.X.setImageResource(this.r8.getResourceId(this.i8, 0));
        this.I8 = this.T8.getString(this, SP.MAP_TYPE_TEMPLATE_CLASSIC, Default.SETELLITE_2);
        this.T8.getInteger(this, SP.MAP_POS_CLASSIC, 1);
        this.T8.getInteger(this, SP.MAP_ZOOM_SCALE_CLASSIC, 78);
        this.e8 = this.T8.getInteger(this, SP.MAP_POS_TYPE_CLASSIC, 0);
        this.T8.getString(this, SP.STAMP_POS_CLASSIC, "Bottom");
        this.k8 = this.T8.getString(this, SP.STAMP_SIZE_CLASSIC, Default.TEMPLATE_SIZE);
        this.o8 = this.T8.getString(this, SP.PLUS_CODE_TYPE_CLASSIC, Default.PLUSCODE_TYPE);
        this.O7 = this.T8.getInteger(this, SP.WIND_SELECT_CLASSIC, 0);
        this.S7 = this.T8.getInteger(this, SP.ALTITUDE_SELECT_CLASSIC, 0);
        this.W7 = this.T8.getInteger(this, SP.ACCURACY_SELECT_CLASSIC, 0);
        this.a8 = this.T8.getInteger(this, SP.PRESSURE_SELECT_CLASSIC, 0);
        boolean zIsTablet = HelperClass.isTablet(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (this.v4) {
            int i = this.e8;
            ImageView imageView = this.U;
            if (i == 0) {
                imageView.setVisibility(0);
                this.c0.setVisibility(8);
            } else {
                imageView.setVisibility(8);
                this.c0.setVisibility(0);
            }
        } else {
            this.U.setVisibility(8);
            this.c0.setVisibility(8);
        }
        layoutParams.setMargins(0, 0, 0, 0);
        this.j3.setLayoutParams(layoutParams);
        boolean z3 = this.B4;
        LinearLayout linearLayout = this.g3;
        if (z3) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        if (this.K4 || this.N4 || this.M4 || this.H4 || this.L4 || this.J5) {
            this.p3.setVisibility(0);
            if (zIsTablet) {
                ((LinearLayout.LayoutParams) this.p3.getLayoutParams()).height += 2;
            }
        } else {
            this.p3.setVisibility(8);
        }
        boolean z4 = this.H4;
        LinearLayout linearLayout2 = this.n3;
        if (z4) {
            linearLayout2.setVisibility(0);
        } else {
            linearLayout2.setVisibility(8);
        }
        boolean z5 = this.K4;
        LinearLayout linearLayout3 = this.o3;
        if (z5) {
            linearLayout3.setVisibility(0);
        } else {
            linearLayout3.setVisibility(8);
        }
        boolean z6 = this.L4;
        LinearLayout linearLayout4 = this.m3;
        if (z6) {
            linearLayout4.setVisibility(0);
        } else {
            linearLayout4.setVisibility(8);
        }
        if (this.J5) {
            String soundLevel = HelperClass.getSoundLevel(this);
            if (this.m3.getVisibility() == 8) {
                this.m3.setVisibility(0);
                this.Y.setImageResource(R.drawable.sound_wave);
                this.x2.setText(soundLevel);
                this.x2.setTextColor(this.p6);
            } else if (this.n3.getVisibility() == 8) {
                this.n3.setVisibility(0);
                this.Z.setImageResource(R.drawable.sound_wave);
                this.z2.setText(soundLevel);
                this.z2.setTextColor(this.p6);
            } else if (this.o3.getVisibility() == 8) {
                this.o3.setVisibility(0);
                this.b0.setImageResource(R.drawable.sound_wave);
                this.y2.setText(soundLevel);
                this.y2.setTextColor(this.p6);
            }
        }
        if (this.M4) {
            String altitudeconvert = HelperClass.getAltitudeconvert(this, this.S7);
            if (this.m3.getVisibility() == 8) {
                this.m3.setVisibility(0);
                this.Y.setImageResource(R.drawable.ic_altitiude);
                this.x2.setText(altitudeconvert);
                this.x2.setTextColor(this.d7);
            } else if (this.n3.getVisibility() == 8) {
                this.n3.setVisibility(0);
                this.Z.setImageResource(R.drawable.ic_altitiude);
                this.z2.setText(altitudeconvert);
                this.z2.setTextColor(this.d7);
            } else if (this.o3.getVisibility() == 8) {
                this.o3.setVisibility(0);
                this.b0.setImageResource(R.drawable.ic_altitiude);
                this.y2.setText(altitudeconvert);
                this.y2.setTextColor(this.d7);
            }
        }
        if (this.N4) {
            String accuracy = HelperClass.getAccuracy(this, this.W7);
            if (this.m3.getVisibility() == 8) {
                this.m3.setVisibility(0);
                this.Y.setImageResource(R.drawable.ic_accuracy);
                this.x2.setText(accuracy);
                this.x2.setTextColor(this.h7);
            } else if (this.n3.getVisibility() == 8) {
                this.n3.setVisibility(0);
                this.Z.setImageResource(R.drawable.ic_accuracy);
                this.z2.setText(accuracy);
                this.z2.setTextColor(this.h7);
            } else if (this.o3.getVisibility() == 8) {
                this.o3.setVisibility(0);
                this.b0.setImageResource(R.drawable.ic_accuracy);
                this.y2.setText(accuracy);
                this.y2.setTextColor(this.h7);
            }
        }
        if (this.T3) {
            boolean z7 = this.F4;
            LinearLayout linearLayout5 = this.f3;
            if (z7) {
                linearLayout5.setVisibility(0);
            } else {
                linearLayout5.setVisibility(8);
            }
            boolean z8 = this.G4;
            LinearLayout linearLayout6 = this.c3;
            if (z8) {
                linearLayout6.setVisibility(0);
            } else {
                linearLayout6.setVisibility(8);
            }
        } else {
            this.f3.setVisibility(8);
            this.c3.setVisibility(8);
        }
        if (this.B4 || this.F4 || this.G4 || this.I4) {
            this.e3.setVisibility(0);
        } else {
            this.e3.setVisibility(8);
        }
        boolean z9 = this.I4;
        LinearLayout linearLayout7 = this.d3;
        if (z9) {
            linearLayout7.setVisibility(0);
        } else {
            linearLayout7.setVisibility(8);
        }
        if (this.k8.equals(Default.TEMPLATE_SIZE)) {
            this.V.getLayoutParams().height = HelperClass.dpToPx(this, 30);
            this.V.getLayoutParams().width = HelperClass.dpToPx(this, 58);
            this.X.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.X.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.W.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.W.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.b0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.b0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.Y.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.Y.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.Z.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.Z.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.a0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.a0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.z2.setTextSize(8.0f);
            this.x2.setTextSize(8.0f);
            this.y2.setTextSize(8.0f);
            this.w2.setTextSize(8.0f);
            this.A2.setTextSize(8.0f);
            this.B2.setTextSize(8.0f);
        } else if (this.k8.equals("Small")) {
            this.V.getLayoutParams().height = HelperClass.dpToPx(this, 28);
            this.V.getLayoutParams().width = HelperClass.dpToPx(this, 54);
            this.X.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.X.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.W.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.W.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.b0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.b0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.Y.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.Y.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.Z.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.Z.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.a0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.a0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.z2.setTextSize(7.0f);
            this.x2.setTextSize(7.0f);
            this.y2.setTextSize(7.0f);
            this.w2.setTextSize(7.0f);
            this.A2.setTextSize(7.0f);
            this.B2.setTextSize(7.0f);
        } else {
            boolean zEquals = this.k8.equals("Extra Small");
            ImageView imageView2 = this.V;
            if (zEquals) {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 26);
                this.V.getLayoutParams().width = HelperClass.dpToPx(this, 50);
                this.X.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.X.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.W.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.W.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.b0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.b0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.Y.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.Y.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.Z.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.Z.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.a0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.a0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.z2.setTextSize(6.0f);
                this.x2.setTextSize(6.0f);
                this.y2.setTextSize(6.0f);
                this.w2.setTextSize(6.0f);
                this.A2.setTextSize(6.0f);
                this.B2.setTextSize(6.0f);
            } else {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 32);
                this.V.getLayoutParams().width = HelperClass.dpToPx(this, 62);
                this.X.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.X.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.W.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.W.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.b0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.b0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.Y.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.Y.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.Z.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.Z.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.a0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.a0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.z2.setTextSize(10.0f);
                this.x2.setTextSize(10.0f);
                this.y2.setTextSize(10.0f);
                this.w2.setTextSize(10.0f);
                this.A2.setTextSize(10.0f);
                this.B2.setTextSize(10.0f);
            }
        }
        boolean z10 = this.v4;
        boolean z11 = this.w4;
        boolean z12 = this.x4;
        boolean z13 = this.y4;
        if (z10) {
            int i2 = z11 ? (z12 ? 1 : 0) + 1 : z12 ? 1 : 0;
            if (z13) {
                i2++;
            }
            if (this.A4) {
                i2++;
            }
            if (this.C4 || this.D4) {
                i2++;
            }
            if (this.E4) {
                i2++;
            }
            if (this.J4) {
                i2++;
            }
            if (this.N5) {
                i2++;
            }
            int iDpToPx = HelperClass.dpToPx(this, 70);
            int iDpToPx2 = HelperClass.dpToPx(this, 75);
            int iDpToPx3 = HelperClass.dpToPx(this, 80);
            int iDpToPx4 = HelperClass.dpToPx(this, 85);
            int iDpToPx5 = HelperClass.dpToPx(this, 90);
            int iDpToPx6 = HelperClass.dpToPx(this, 95);
            int iDpToPx7 = HelperClass.dpToPx(this, 100);
            int iDpToPx8 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx9 = HelperClass.dpToPx(this, fh.k1);
            boolean z14 = z12 ? 1 : 0;
            int iDpToPx10 = HelperClass.dpToPx(this, 115);
            z = z13;
            int iDpToPx11 = HelperClass.dpToPx(this, 120);
            int iDpToPx12 = HelperClass.dpToPx(this, 125);
            int iDpToPx13 = HelperClass.dpToPx(this, 130);
            int iDpToPx14 = HelperClass.dpToPx(this, 135);
            int iDpToPx15 = HelperClass.dpToPx(this, 140);
            int iDpToPx16 = HelperClass.dpToPx(this, 145);
            int iDpToPx17 = HelperClass.dpToPx(this, 150);
            int iDpToPx18 = HelperClass.dpToPx(this, 155);
            int iDpToPx19 = HelperClass.dpToPx(this, 160);
            int iDpToPx20 = HelperClass.dpToPx(this, 165);
            HelperClass.dpToPx(this, 170);
            System.out.println("jbfdjkbfjhvbfjhbdsfjhbdfjhdbfjh                    " + i2);
            if (i2 == 2) {
                if (this.B4 || this.G4 || this.F4) {
                    if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = iDpToPx14;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx14;
                                this.U.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx14;
                                this.c0.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            }
                        } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = iDpToPx12;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx12;
                                this.U.getLayoutParams().height = iDpToPx12;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx12;
                                this.c0.getLayoutParams().height = iDpToPx12;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals2 = this.k8.equals("Small");
                            LinearLayout linearLayout8 = this.j3;
                            if (zEquals2) {
                                linearLayout8.getLayoutParams().height = iDpToPx10;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().height = iDpToPx10;
                                    this.U.getLayoutParams().width = iDpToPx10;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().height = iDpToPx10;
                                    this.c0.getLayoutParams().width = iDpToPx10;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout8.getLayoutParams().height = iDpToPx8;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().height = iDpToPx8;
                                    this.U.getLayoutParams().width = iDpToPx8;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().height = iDpToPx8;
                                    this.c0.getLayoutParams().width = iDpToPx8;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx12;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().height = iDpToPx12;
                            this.U.getLayoutParams().width = iDpToPx12;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().height = iDpToPx12;
                            this.c0.getLayoutParams().width = iDpToPx12;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx10;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx10;
                            this.U.getLayoutParams().height = iDpToPx10;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx10;
                            this.c0.getLayoutParams().height = iDpToPx10;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals3 = this.k8.equals("Small");
                        LinearLayout linearLayout9 = this.j3;
                        if (zEquals3) {
                            linearLayout9.getLayoutParams().height = iDpToPx8;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx8;
                                this.U.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx8;
                                this.c0.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            }
                        } else {
                            linearLayout9.getLayoutParams().height = iDpToPx6;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx6;
                                this.U.getLayoutParams().height = iDpToPx6;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx6;
                                this.c0.getLayoutParams().height = iDpToPx6;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx8;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx8;
                            this.U.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx8;
                            this.c0.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx6;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx6;
                            this.U.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx6;
                            this.c0.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals4 = this.k8.equals("Small");
                        LinearLayout linearLayout10 = this.j3;
                        if (zEquals4) {
                            linearLayout10.getLayoutParams().height = iDpToPx5;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx5;
                                this.U.getLayoutParams().height = iDpToPx5;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx5;
                                this.c0.getLayoutParams().height = iDpToPx5;
                                z2 = z14;
                            }
                        } else {
                            linearLayout10.getLayoutParams().height = iDpToPx4;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx4;
                                this.U.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx4;
                                this.c0.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.k8.equals("Large")) {
                    this.j3.getLayoutParams().height = iDpToPx4;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx4;
                        this.U.getLayoutParams().height = iDpToPx4;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx4;
                        this.c0.getLayoutParams().height = iDpToPx4;
                        z2 = z14;
                    }
                } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = iDpToPx3;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx3;
                        this.U.getLayoutParams().height = iDpToPx3;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx3;
                        this.c0.getLayoutParams().height = iDpToPx3;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals5 = this.k8.equals("Small");
                    LinearLayout linearLayout11 = this.j3;
                    if (zEquals5) {
                        linearLayout11.getLayoutParams().height = iDpToPx2;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx2;
                            this.U.getLayoutParams().height = iDpToPx2;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx2;
                            this.c0.getLayoutParams().height = iDpToPx2;
                            z2 = z14;
                        }
                    } else {
                        linearLayout11.getLayoutParams().height = iDpToPx;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx;
                            this.U.getLayoutParams().height = iDpToPx;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx;
                            this.c0.getLayoutParams().height = iDpToPx;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 == 3) {
                if (!this.B4 && !this.G4 && !this.F4) {
                    boolean z15 = this.I3;
                    boolean z16 = this.H4;
                    if (z15) {
                        if (z16 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                            if (this.k8.equals("Large")) {
                                this.j3.getLayoutParams().height = iDpToPx11;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx11;
                                    this.U.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx11;
                                    this.c0.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                }
                            } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                                this.j3.getLayoutParams().height = iDpToPx9;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx9;
                                    this.U.getLayoutParams().height = iDpToPx9;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx9;
                                    this.c0.getLayoutParams().height = iDpToPx9;
                                    z2 = z14;
                                }
                            } else {
                                boolean zEquals6 = this.k8.equals("Small");
                                LinearLayout linearLayout12 = this.j3;
                                if (zEquals6) {
                                    linearLayout12.getLayoutParams().height = iDpToPx7;
                                    if (this.e8 == 0) {
                                        this.U.getLayoutParams().width = iDpToPx7;
                                        this.U.getLayoutParams().height = iDpToPx7;
                                        z2 = z14;
                                    } else {
                                        this.c0.getLayoutParams().width = iDpToPx7;
                                        this.c0.getLayoutParams().height = iDpToPx7;
                                        z2 = z14;
                                    }
                                } else {
                                    linearLayout12.getLayoutParams().height = iDpToPx5;
                                    if (this.e8 == 0) {
                                        this.U.getLayoutParams().width = iDpToPx5;
                                        this.U.getLayoutParams().height = iDpToPx5;
                                        z2 = z14;
                                    } else {
                                        this.c0.getLayoutParams().width = iDpToPx5;
                                        this.c0.getLayoutParams().height = iDpToPx5;
                                        z2 = z14;
                                    }
                                }
                            }
                        } else if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = iDpToPx9;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx9;
                                this.U.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx9;
                                this.c0.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = iDpToPx7;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx7;
                                this.U.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx7;
                                this.c0.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals7 = this.k8.equals("Small");
                            LinearLayout linearLayout13 = this.j3;
                            if (zEquals7) {
                                linearLayout13.getLayoutParams().height = iDpToPx5;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx5;
                                    this.U.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx5;
                                    this.c0.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout13.getLayoutParams().height = iDpToPx3;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx3;
                                    this.U.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx3;
                                    this.c0.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (z16 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = iDpToPx9;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx9;
                                this.U.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx9;
                                this.c0.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = iDpToPx7;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx7;
                                this.U.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx7;
                                this.c0.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals8 = this.k8.equals("Small");
                            LinearLayout linearLayout14 = this.j3;
                            if (zEquals8) {
                                linearLayout14.getLayoutParams().height = iDpToPx5;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx5;
                                    this.U.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx5;
                                    this.c0.getLayoutParams().height = iDpToPx5;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout14.getLayoutParams().height = iDpToPx3;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx3;
                                    this.U.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx3;
                                    this.c0.getLayoutParams().height = iDpToPx3;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx7;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx7;
                            this.U.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx7;
                            this.c0.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx5;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx5;
                            this.U.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx5;
                            this.c0.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals9 = this.k8.equals("Small");
                        LinearLayout linearLayout15 = this.j3;
                        if (zEquals9) {
                            linearLayout15.getLayoutParams().height = iDpToPx3;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().height = iDpToPx3;
                                this.U.getLayoutParams().width = iDpToPx3;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx3;
                                this.c0.getLayoutParams().height = iDpToPx3;
                                z2 = z14;
                            }
                        } else {
                            linearLayout15.getLayoutParams().height = iDpToPx;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx;
                                this.U.getLayoutParams().height = iDpToPx;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().height = iDpToPx;
                                this.c0.getLayoutParams().width = iDpToPx;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx13;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx13;
                            this.U.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx13;
                            this.c0.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx11;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx11;
                            this.U.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx11;
                            this.c0.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals10 = this.k8.equals("Small");
                        LinearLayout linearLayout16 = this.j3;
                        if (zEquals10) {
                            linearLayout16.getLayoutParams().height = iDpToPx9;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx9;
                                this.U.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx9;
                                this.c0.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else {
                            linearLayout16.getLayoutParams().height = iDpToPx7;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx7;
                                this.U.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx7;
                                this.c0.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.k8.equals("Large")) {
                    this.j3.getLayoutParams().height = iDpToPx11;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx11;
                        this.U.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx11;
                        this.c0.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    }
                } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = iDpToPx9;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx9;
                        this.U.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx9;
                        this.c0.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals11 = this.k8.equals("Small");
                    LinearLayout linearLayout17 = this.j3;
                    if (zEquals11) {
                        linearLayout17.getLayoutParams().height = iDpToPx7;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx7;
                            this.U.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx7;
                            this.c0.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else {
                        linearLayout17.getLayoutParams().height = iDpToPx5;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().height = iDpToPx5;
                            this.U.getLayoutParams().width = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx5;
                            this.c0.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 == 4) {
                if (!this.B4 && !this.G4 && !this.F4) {
                    boolean z17 = this.I3;
                    boolean z18 = this.H4;
                    if (z17) {
                        if (z18 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                            if (this.k8.equals("Large")) {
                                this.j3.getLayoutParams().height = iDpToPx12;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx12;
                                    this.U.getLayoutParams().height = iDpToPx12;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx12;
                                    this.c0.getLayoutParams().height = iDpToPx12;
                                    z2 = z14;
                                }
                            } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                                this.j3.getLayoutParams().height = iDpToPx10;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx10;
                                    this.U.getLayoutParams().height = iDpToPx10;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx10;
                                    this.c0.getLayoutParams().height = iDpToPx10;
                                    z2 = z14;
                                }
                            } else {
                                boolean zEquals12 = this.k8.equals("Small");
                                LinearLayout linearLayout18 = this.j3;
                                if (zEquals12) {
                                    linearLayout18.getLayoutParams().height = iDpToPx8;
                                    if (this.e8 == 0) {
                                        this.U.getLayoutParams().width = iDpToPx8;
                                        this.U.getLayoutParams().height = iDpToPx8;
                                        z2 = z14;
                                    } else {
                                        this.c0.getLayoutParams().width = iDpToPx8;
                                        this.c0.getLayoutParams().height = iDpToPx8;
                                        z2 = z14;
                                    }
                                } else {
                                    linearLayout18.getLayoutParams().height = iDpToPx6;
                                    if (this.e8 == 0) {
                                        this.U.getLayoutParams().width = iDpToPx6;
                                        this.U.getLayoutParams().height = iDpToPx6;
                                        z2 = z14;
                                    } else {
                                        this.c0.getLayoutParams().width = iDpToPx6;
                                        this.c0.getLayoutParams().height = iDpToPx6;
                                        z2 = z14;
                                    }
                                }
                            }
                        } else if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = iDpToPx10;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx10;
                                this.U.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx10;
                                this.c0.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            }
                        } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = iDpToPx8;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx8;
                                this.U.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx8;
                                this.c0.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals13 = this.k8.equals("Small");
                            LinearLayout linearLayout19 = this.j3;
                            if (zEquals13) {
                                linearLayout19.getLayoutParams().height = iDpToPx6;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx6;
                                    this.U.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx6;
                                    this.c0.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout19.getLayoutParams().height = iDpToPx4;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx4;
                                    this.U.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx4;
                                    this.c0.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (z18 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = iDpToPx10;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx10;
                                this.U.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx10;
                                this.c0.getLayoutParams().height = iDpToPx10;
                                z2 = z14;
                            }
                        } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = iDpToPx8;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().height = iDpToPx8;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals14 = this.k8.equals("Small");
                            LinearLayout linearLayout20 = this.j3;
                            if (zEquals14) {
                                linearLayout20.getLayoutParams().height = iDpToPx6;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx6;
                                    this.U.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx6;
                                    this.c0.getLayoutParams().height = iDpToPx6;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout20.getLayoutParams().height = iDpToPx4;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx4;
                                    this.U.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx4;
                                    this.c0.getLayoutParams().height = iDpToPx4;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx8;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx8;
                            this.U.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx8;
                            this.c0.getLayoutParams().height = iDpToPx8;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx6;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx6;
                            this.U.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx6;
                            this.c0.getLayoutParams().height = iDpToPx6;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals15 = this.k8.equals("Small");
                        LinearLayout linearLayout21 = this.j3;
                        if (zEquals15) {
                            linearLayout21.getLayoutParams().height = iDpToPx4;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx4;
                                this.U.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx4;
                                this.c0.getLayoutParams().height = iDpToPx4;
                                z2 = z14;
                            }
                        } else {
                            linearLayout21.getLayoutParams().height = iDpToPx2;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx2;
                                this.U.getLayoutParams().height = iDpToPx2;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx2;
                                this.c0.getLayoutParams().height = iDpToPx2;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx13;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx13;
                            this.U.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx13;
                            this.c0.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx11;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx11;
                            this.U.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx11;
                            this.c0.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals16 = this.k8.equals("Small");
                        LinearLayout linearLayout22 = this.j3;
                        if (zEquals16) {
                            linearLayout22.getLayoutParams().height = iDpToPx9;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx9;
                                this.U.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx9;
                                this.c0.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else {
                            linearLayout22.getLayoutParams().height = iDpToPx7;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx7;
                                this.U.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx7;
                                this.c0.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.k8.equals("Large")) {
                    this.j3.getLayoutParams().height = iDpToPx11;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx11;
                        this.U.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx11;
                        this.c0.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    }
                } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = iDpToPx9;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx9;
                        this.U.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx9;
                        this.c0.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals17 = this.k8.equals("Small");
                    LinearLayout linearLayout23 = this.j3;
                    if (zEquals17) {
                        linearLayout23.getLayoutParams().height = iDpToPx7;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx7;
                            this.U.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx7;
                            this.c0.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else {
                        linearLayout23.getLayoutParams().height = iDpToPx5;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx5;
                            this.U.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx5;
                            this.c0.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 == 5) {
                if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx13;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx13;
                            this.U.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx13;
                            this.c0.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx11;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx11;
                            this.U.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx11;
                            this.c0.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals18 = this.k8.equals("Small");
                        LinearLayout linearLayout24 = this.j3;
                        if (zEquals18) {
                            linearLayout24.getLayoutParams().height = iDpToPx9;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx9;
                                this.U.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx9;
                                this.c0.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        } else {
                            linearLayout24.getLayoutParams().height = iDpToPx7;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx7;
                                this.U.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx7;
                                this.c0.getLayoutParams().height = iDpToPx7;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.k8.equals("Large")) {
                    this.j3.getLayoutParams().height = iDpToPx11;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx11;
                        this.U.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx11;
                        this.c0.getLayoutParams().height = iDpToPx11;
                        z2 = z14;
                    }
                } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = iDpToPx9;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx9;
                        this.U.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx9;
                        this.c0.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals19 = this.k8.equals("Small");
                    LinearLayout linearLayout25 = this.j3;
                    if (zEquals19) {
                        linearLayout25.getLayoutParams().height = iDpToPx7;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx7;
                            this.U.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx7;
                            this.c0.getLayoutParams().height = iDpToPx7;
                            z2 = z14;
                        }
                    } else {
                        linearLayout25.getLayoutParams().height = iDpToPx5;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx5;
                            this.U.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx5;
                            this.c0.getLayoutParams().height = iDpToPx5;
                            z2 = z14;
                        }
                    }
                }
            } else if (i2 != 6) {
                boolean z19 = this.H4;
                if (i2 == 7) {
                    if (z19 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = iDpToPx17;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx17;
                                this.U.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx17;
                                this.c0.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            }
                        } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = iDpToPx15;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx15;
                                this.U.getLayoutParams().height = iDpToPx15;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx15;
                                this.c0.getLayoutParams().height = iDpToPx15;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals20 = this.k8.equals("Small");
                            LinearLayout linearLayout26 = this.j3;
                            if (zEquals20) {
                                linearLayout26.getLayoutParams().height = iDpToPx13;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx13;
                                    this.U.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx13;
                                    this.c0.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout26.getLayoutParams().height = iDpToPx11;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx11;
                                    this.U.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx11;
                                    this.c0.getLayoutParams().height = iDpToPx11;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx15;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx15;
                            this.U.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx15;
                            this.c0.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx13;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx13;
                            this.U.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx13;
                            this.c0.getLayoutParams().height = iDpToPx13;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals21 = this.k8.equals("Small");
                        LinearLayout linearLayout27 = this.j3;
                        if (zEquals21) {
                            linearLayout27.getLayoutParams().height = iDpToPx11;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx11;
                                this.U.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx11;
                                this.c0.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            }
                        } else {
                            linearLayout27.getLayoutParams().height = iDpToPx9;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx9;
                                this.U.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx9;
                                this.c0.getLayoutParams().height = iDpToPx9;
                                z2 = z14;
                            }
                        }
                    }
                } else if (i2 == 8) {
                    if (z19 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = iDpToPx19;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx19;
                                this.U.getLayoutParams().height = iDpToPx19;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx19;
                                this.c0.getLayoutParams().height = iDpToPx19;
                                z2 = z14;
                            }
                        } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = iDpToPx17;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx17;
                                this.U.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx17;
                                this.c0.getLayoutParams().height = iDpToPx17;
                                z2 = z14;
                            }
                        } else {
                            boolean zEquals22 = this.k8.equals("Small");
                            LinearLayout linearLayout28 = this.j3;
                            if (zEquals22) {
                                linearLayout28.getLayoutParams().height = iDpToPx15;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx15;
                                    this.U.getLayoutParams().height = iDpToPx15;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx15;
                                    this.c0.getLayoutParams().height = iDpToPx15;
                                    z2 = z14;
                                }
                            } else {
                                linearLayout28.getLayoutParams().height = iDpToPx13;
                                if (this.e8 == 0) {
                                    this.U.getLayoutParams().width = iDpToPx13;
                                    this.U.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                } else {
                                    this.c0.getLayoutParams().width = iDpToPx13;
                                    this.c0.getLayoutParams().height = iDpToPx13;
                                    z2 = z14;
                                }
                            }
                        }
                    } else if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx17;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx17;
                            this.U.getLayoutParams().height = iDpToPx17;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx17;
                            this.c0.getLayoutParams().height = iDpToPx17;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx15;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx15;
                            this.U.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx15;
                            this.c0.getLayoutParams().height = iDpToPx15;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals23 = this.k8.equals("Small");
                        LinearLayout linearLayout29 = this.j3;
                        if (zEquals23) {
                            linearLayout29.getLayoutParams().height = iDpToPx13;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx13;
                                this.U.getLayoutParams().height = iDpToPx13;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx13;
                                this.c0.getLayoutParams().height = iDpToPx13;
                                z2 = z14;
                            }
                        } else {
                            linearLayout29.getLayoutParams().height = iDpToPx11;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx11;
                                this.U.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx11;
                                this.c0.getLayoutParams().height = iDpToPx11;
                                z2 = z14;
                            }
                        }
                    }
                } else if (z19 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.k8.equals("Large")) {
                        this.j3.getLayoutParams().height = iDpToPx20;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx20;
                            this.U.getLayoutParams().height = iDpToPx20;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx20;
                            this.c0.getLayoutParams().height = iDpToPx20;
                            z2 = z14;
                        }
                    } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = iDpToPx18;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx18;
                            this.U.getLayoutParams().height = iDpToPx18;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx18;
                            this.c0.getLayoutParams().height = iDpToPx18;
                            z2 = z14;
                        }
                    } else {
                        boolean zEquals24 = this.k8.equals("Small");
                        LinearLayout linearLayout30 = this.j3;
                        if (zEquals24) {
                            linearLayout30.getLayoutParams().height = iDpToPx16;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx16;
                                this.U.getLayoutParams().height = iDpToPx16;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx16;
                                this.c0.getLayoutParams().height = iDpToPx16;
                                z2 = z14;
                            }
                        } else {
                            linearLayout30.getLayoutParams().height = iDpToPx14;
                            if (this.e8 == 0) {
                                this.U.getLayoutParams().width = iDpToPx14;
                                this.U.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            } else {
                                this.c0.getLayoutParams().width = iDpToPx14;
                                this.c0.getLayoutParams().height = iDpToPx14;
                                z2 = z14;
                            }
                        }
                    }
                } else if (this.k8.equals("Large")) {
                    this.j3.getLayoutParams().height = iDpToPx18;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx18;
                        this.U.getLayoutParams().height = iDpToPx18;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx18;
                        this.c0.getLayoutParams().height = iDpToPx18;
                        z2 = z14;
                    }
                } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = iDpToPx16;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx16;
                        this.U.getLayoutParams().height = iDpToPx16;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx16;
                        this.c0.getLayoutParams().height = iDpToPx16;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals25 = this.k8.equals("Small");
                    LinearLayout linearLayout31 = this.j3;
                    if (zEquals25) {
                        linearLayout31.getLayoutParams().height = iDpToPx14;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx14;
                            this.U.getLayoutParams().height = iDpToPx14;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx14;
                            this.c0.getLayoutParams().height = iDpToPx14;
                            z2 = z14;
                        }
                    } else {
                        linearLayout31.getLayoutParams().height = iDpToPx12;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx12;
                            this.U.getLayoutParams().height = iDpToPx12;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx12;
                            this.c0.getLayoutParams().height = iDpToPx12;
                            z2 = z14;
                        }
                    }
                }
            } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                if (this.k8.equals("Large")) {
                    this.j3.getLayoutParams().height = iDpToPx15;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx15;
                        this.U.getLayoutParams().height = iDpToPx15;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx15;
                        this.c0.getLayoutParams().height = iDpToPx15;
                        z2 = z14;
                    }
                } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = iDpToPx13;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx13;
                        this.U.getLayoutParams().height = iDpToPx13;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx13;
                        this.c0.getLayoutParams().height = iDpToPx13;
                        z2 = z14;
                    }
                } else {
                    boolean zEquals26 = this.k8.equals("Small");
                    LinearLayout linearLayout32 = this.j3;
                    if (zEquals26) {
                        linearLayout32.getLayoutParams().height = iDpToPx11;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx11;
                            this.U.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx11;
                            this.c0.getLayoutParams().height = iDpToPx11;
                            z2 = z14;
                        }
                    } else {
                        linearLayout32.getLayoutParams().height = iDpToPx9;
                        if (this.e8 == 0) {
                            this.U.getLayoutParams().width = iDpToPx9;
                            this.U.getLayoutParams().height = iDpToPx9;
                            z2 = z14;
                        } else {
                            this.c0.getLayoutParams().width = iDpToPx9;
                            this.c0.getLayoutParams().height = iDpToPx9;
                            z2 = z14;
                        }
                    }
                }
            } else if (this.k8.equals("Large")) {
                this.j3.getLayoutParams().height = iDpToPx13;
                if (this.e8 == 0) {
                    this.U.getLayoutParams().width = iDpToPx13;
                    this.U.getLayoutParams().height = iDpToPx13;
                    z2 = z14;
                } else {
                    this.c0.getLayoutParams().width = iDpToPx13;
                    this.c0.getLayoutParams().height = iDpToPx13;
                    z2 = z14;
                }
            } else if (this.k8.equals(Default.TEMPLATE_SIZE)) {
                this.j3.getLayoutParams().height = iDpToPx11;
                if (this.e8 == 0) {
                    this.U.getLayoutParams().width = iDpToPx11;
                    this.U.getLayoutParams().height = iDpToPx11;
                    z2 = z14;
                } else {
                    this.c0.getLayoutParams().width = iDpToPx11;
                    this.c0.getLayoutParams().height = iDpToPx11;
                    z2 = z14;
                }
            } else {
                boolean zEquals27 = this.k8.equals("Small");
                LinearLayout linearLayout33 = this.j3;
                if (zEquals27) {
                    linearLayout33.getLayoutParams().height = iDpToPx9;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx9;
                        this.U.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx9;
                        this.c0.getLayoutParams().height = iDpToPx9;
                        z2 = z14;
                    }
                } else {
                    linearLayout33.getLayoutParams().height = iDpToPx7;
                    if (this.e8 == 0) {
                        this.U.getLayoutParams().width = iDpToPx7;
                        this.U.getLayoutParams().height = iDpToPx7;
                        z2 = z14;
                    } else {
                        this.c0.getLayoutParams().width = iDpToPx7;
                        this.c0.getLayoutParams().height = iDpToPx7;
                        z2 = z14;
                    }
                }
            }
        } else {
            boolean z20 = z12 ? 1 : 0;
            z = z13;
            int i3 = z11 ? (z20 ? 1 : 0) + 1 : z20 ? 1 : 0;
            if (z) {
                i3++;
            }
            if (this.A4) {
                i3++;
            }
            if (this.C4 || this.D4) {
                i3++;
            }
            if (this.E4) {
                i3++;
            }
            if (this.J4) {
                i3++;
            }
            if (this.N5) {
                i3++;
            }
            if (i3 == 2) {
                if (this.B4 || this.G4 || this.F4) {
                    if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.k8.equals("Large")) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            z2 = z20;
                        } else {
                            boolean zEquals28 = this.j8.equals("Small");
                            LinearLayout linearLayout34 = this.j3;
                            if (zEquals28) {
                                linearLayout34.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                z2 = z20;
                            } else {
                                linearLayout34.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                        z2 = z20;
                    } else {
                        boolean zEquals29 = this.j8.equals("Small");
                        LinearLayout linearLayout35 = this.j3;
                        if (zEquals29) {
                            linearLayout35.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            z2 = z20;
                        } else {
                            linearLayout35.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            z2 = z20;
                        }
                    }
                } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                        z2 = z20;
                    } else {
                        boolean zEquals30 = this.j8.equals("Small");
                        LinearLayout linearLayout36 = this.j3;
                        if (zEquals30) {
                            linearLayout36.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                            z2 = z20;
                        } else {
                            linearLayout36.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                    z2 = z20;
                } else {
                    boolean zEquals31 = this.j8.equals("Small");
                    LinearLayout linearLayout37 = this.j3;
                    if (zEquals31) {
                        linearLayout37.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_45);
                        z2 = z20;
                    } else {
                        linearLayout37.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_40);
                        z2 = z20;
                    }
                }
            } else if (i3 == 3) {
                if (!this.B4 && !this.G4 && !this.F4) {
                    boolean z21 = this.I3;
                    boolean z22 = this.H4;
                    if (z21) {
                        if (z22 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                            if (this.j8.equals("Large")) {
                                this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                z2 = z20;
                            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                                this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                z2 = z20;
                            } else {
                                boolean zEquals32 = this.j8.equals("Small");
                                LinearLayout linearLayout38 = this.j3;
                                if (zEquals32) {
                                    linearLayout38.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                                    z2 = z20;
                                } else {
                                    linearLayout38.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                                    z2 = z20;
                                }
                            }
                        } else if (this.j8.equals("Large")) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        } else {
                            boolean zEquals33 = this.j8.equals("Small");
                            LinearLayout linearLayout39 = this.j3;
                            if (zEquals33) {
                                linearLayout39.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                                z2 = z20;
                            } else {
                                linearLayout39.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                                z2 = z20;
                            }
                        }
                    } else if (z22 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.j8.equals("Large")) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        } else {
                            boolean zEquals34 = this.j8.equals("Small");
                            LinearLayout linearLayout40 = this.j3;
                            if (zEquals34) {
                                linearLayout40.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                                z2 = z20;
                            } else {
                                linearLayout40.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    } else {
                        boolean zEquals35 = this.j8.equals("Small");
                        LinearLayout linearLayout41 = this.j3;
                        if (zEquals35) {
                            linearLayout41.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_50);
                            z2 = z20;
                        } else {
                            linearLayout41.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_40);
                            z2 = z20;
                        }
                    }
                } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        boolean zEquals36 = this.j8.equals("Small");
                        LinearLayout linearLayout42 = this.j3;
                        if (zEquals36) {
                            linearLayout42.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else {
                            linearLayout42.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    boolean zEquals37 = this.j8.equals("Small");
                    LinearLayout linearLayout43 = this.j3;
                    if (zEquals37) {
                        linearLayout43.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else {
                        linearLayout43.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    }
                }
            } else if (i3 == 4) {
                if (!this.B4 && !this.G4 && !this.F4) {
                    boolean z23 = this.I3;
                    boolean z24 = this.H4;
                    if (z23) {
                        if (z24 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                            if (this.j8.equals("Large")) {
                                this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                z2 = z20;
                            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                                this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                z2 = z20;
                            } else {
                                boolean zEquals38 = this.j8.equals("Small");
                                LinearLayout linearLayout44 = this.j3;
                                if (zEquals38) {
                                    linearLayout44.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                    z2 = z20;
                                } else {
                                    linearLayout44.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                    z2 = z20;
                                }
                            }
                        } else if (this.j8.equals("Large")) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            z2 = z20;
                        } else {
                            boolean zEquals39 = this.j8.equals("Small");
                            LinearLayout linearLayout45 = this.j3;
                            if (zEquals39) {
                                linearLayout45.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                z2 = z20;
                            } else {
                                linearLayout45.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                                z2 = z20;
                            }
                        }
                    } else if (z24 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.j8.equals("Large")) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            z2 = z20;
                        } else {
                            boolean zEquals40 = this.j8.equals("Small");
                            LinearLayout linearLayout46 = this.j3;
                            if (zEquals40) {
                                linearLayout46.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                z2 = z20;
                            } else {
                                linearLayout46.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                        z2 = z20;
                    } else {
                        boolean zEquals41 = this.j8.equals("Small");
                        LinearLayout linearLayout47 = this.j3;
                        if (zEquals41) {
                            linearLayout47.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                            z2 = z20;
                        } else {
                            linearLayout47.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_45);
                            z2 = z20;
                        }
                    }
                } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        boolean zEquals42 = this.j8.equals("Small");
                        LinearLayout linearLayout48 = this.j3;
                        if (zEquals42) {
                            linearLayout48.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else {
                            linearLayout48.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    boolean zEquals43 = this.j8.equals("Small");
                    LinearLayout linearLayout49 = this.j3;
                    if (zEquals43) {
                        linearLayout49.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else {
                        linearLayout49.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    }
                }
            } else if (i3 == 5) {
                if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        boolean zEquals44 = this.j8.equals("Small");
                        LinearLayout linearLayout50 = this.j3;
                        if (zEquals44) {
                            linearLayout50.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        } else {
                            linearLayout50.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    boolean zEquals45 = this.j8.equals("Small");
                    LinearLayout linearLayout51 = this.j3;
                    if (zEquals45) {
                        linearLayout51.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        z2 = z20;
                    } else {
                        linearLayout51.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_60);
                        z2 = z20;
                    }
                }
            } else if (i3 != 6) {
                boolean z25 = this.H4;
                if (i3 == 7) {
                    if (z25 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.j8.equals("Large")) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                            z2 = z20;
                        } else {
                            boolean zEquals46 = this.j8.equals("Small");
                            LinearLayout linearLayout52 = this.j3;
                            if (zEquals46) {
                                linearLayout52.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                z2 = z20;
                            } else {
                                linearLayout52.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        z2 = z20;
                    } else {
                        boolean zEquals47 = this.j8.equals("Small");
                        LinearLayout linearLayout53 = this.j3;
                        if (zEquals47) {
                            linearLayout53.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            z2 = z20;
                        } else {
                            linearLayout53.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            z2 = z20;
                        }
                    }
                } else if (i3 == 8) {
                    if (z25 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                        if (this.j8.equals("Large")) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_130);
                            z2 = z20;
                        } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                            this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            z2 = z20;
                        } else {
                            boolean zEquals48 = this.j8.equals("Small");
                            LinearLayout linearLayout54 = this.j3;
                            if (zEquals48) {
                                linearLayout54.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                                z2 = z20;
                            } else {
                                linearLayout54.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                z2 = z20;
                            }
                        }
                    } else if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        z2 = z20;
                    } else {
                        boolean zEquals49 = this.j8.equals("Small");
                        LinearLayout linearLayout55 = this.j3;
                        if (zEquals49) {
                            linearLayout55.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                            z2 = z20;
                        } else {
                            linearLayout55.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            z2 = z20;
                        }
                    }
                } else if (z25 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                    if (this.j8.equals("Large")) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_135);
                        z2 = z20;
                    } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                        this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_125);
                        z2 = z20;
                    } else {
                        boolean zEquals50 = this.j8.equals("Small");
                        LinearLayout linearLayout56 = this.j3;
                        if (zEquals50) {
                            linearLayout56.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                            z2 = z20;
                        } else {
                            linearLayout56.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            z2 = z20;
                        }
                    }
                } else if (this.j8.equals("Large")) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_125);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                    z2 = z20;
                } else {
                    boolean zEquals51 = this.j8.equals("Small");
                    LinearLayout linearLayout57 = this.j3;
                    if (zEquals51) {
                        linearLayout57.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        z2 = z20;
                    } else {
                        linearLayout57.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        z2 = z20;
                    }
                }
            } else if (this.H4 || this.K4 || this.L4 || this.M4 || this.N4 || this.J5) {
                if (this.j8.equals("Large")) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                    z2 = z20;
                } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                    this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                    z2 = z20;
                } else {
                    boolean zEquals52 = this.j8.equals("Small");
                    LinearLayout linearLayout58 = this.j3;
                    if (zEquals52) {
                        linearLayout58.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        z2 = z20;
                    } else {
                        linearLayout58.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                        z2 = z20;
                    }
                }
            } else if (this.j8.equals("Large")) {
                this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                z2 = z20;
            } else if (this.j8.equals(Default.TEMPLATE_SIZE)) {
                this.j3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                z2 = z20;
            } else {
                boolean zEquals53 = this.j8.equals("Small");
                LinearLayout linearLayout59 = this.j3;
                if (zEquals53) {
                    linearLayout59.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    z2 = z20;
                } else {
                    linearLayout59.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                    z2 = z20;
                }
            }
        }
        if (this.w4 || z2 || z || this.C4 || this.J4 || this.H4 || this.K4 || this.N4 || this.J5 || this.L4 || this.M4 || this.E4 || this.D4 || this.A4 || this.N5) {
            this.i3.setVisibility(0);
            this.e3.setOrientation(1);
            this.e3.setGravity(19);
            this.e3.getLayoutParams().width = -2;
            this.e3.getLayoutParams().width = -2;
        } else {
            this.i3.setVisibility(8);
            this.e3.setOrientation(0);
            this.e3.setGravity(17);
            this.e3.getLayoutParams().width = -1;
            this.e3.getLayoutParams().width = -1;
            if (this.I4 && !this.v4) {
                boolean zEquals54 = this.k8.equals("Large");
                LinearLayout linearLayout60 = this.j3;
                if (zEquals54) {
                    linearLayout60.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_80dp);
                } else {
                    linearLayout60.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_40);
                }
            }
        }
        if (z || this.w4 || z2 || this.F4 || this.B4 || this.G4 || this.C4 || this.E4 || this.D4 || this.v4 || this.J4 || this.H4 || this.K4 || this.N4 || this.J5 || this.L4 || this.M4 || this.I4 || this.A4 || this.N5) {
            this.h3.setVisibility(0);
            H();
        } else {
            this.h3.setVisibility(8);
        }
        if (z || this.w4 || z2 || this.C4 || this.J4 || this.E4 || this.D4 || this.A4 || this.N5) {
            this.v2.setVisibility(0);
        } else {
            this.v2.setVisibility(8);
        }
        if (!this.v4 || this.w4 || z2 || this.G4 || this.C4 || this.E4 || this.D4 || z || this.F4 || this.B4 || this.J4 || this.H4 || this.K4 || this.N4 || this.J5 || this.L4 || this.M4 || this.I4 || this.A4 || this.N5) {
            this.j3.setVisibility(0);
        } else {
            this.j3.setVisibility(4);
        }
        this.k3.setVisibility(8);
        this.l3.setVisibility(8);
        this.j3.setBackground(getDrawable(R.drawable.classic_back));
        ((GradientDrawable) this.j3.getBackground().getCurrent()).setColor(this.i5);
        E();
    }

    public final void N() {
        LinearLayout.LayoutParams layoutParams;
        boolean z;
        boolean z2;
        boolean z3;
        this.r8 = getResources().obtainTypedArray(R.array.wI);
        this.j5 = this.T8.getInteger(this, SP.BACKGROUND_COLOR_REPORTING, Color.parseColor("#9c000000"));
        this.m5 = this.T8.getInteger(this, SP.REPORT_BACKGROUND_COLOR_REPORTING, Default.RBG_COLOR);
        this.W5 = this.T8.getInteger(this, SP.ADDRESS_COLOR_REPORTING, -1);
        this.i6 = this.T8.getInteger(this, SP.SHORT_ADDRESS_COLOR_REPORTING, -1);
        this.m6 = this.T8.getInteger(this, SP.DATE_TIME_COLOR_REPORTING, -1);
        this.u6 = this.T8.getInteger(this, SP.LAT_LNG_COLOR_REPORTING, -1);
        this.y6 = this.T8.getInteger(this, SP.PLUS_CODE_COLOR_REPORTING, -1);
        this.C6 = this.T8.getInteger(this, SP.WEATHER_COLOR_REPORTING, -1);
        this.G6 = this.T8.getInteger(this, SP.MAGNETIC_FIELD_COLOR_REPORTING, -1);
        this.K6 = this.T8.getInteger(this, SP.COMPASS_COLOR_REPORTING, -1);
        this.O6 = this.T8.getInteger(this, SP.NOTES_HASHTAG_COLOR_REPORTING, -1);
        this.a6 = this.T8.getInteger(this, SP.PERSON_NAME_COLOR_REPORTING, -1);
        this.e6 = this.T8.getInteger(this, SP.CONTACT_NUMBER_COLOR_REPORTING, -1);
        this.q6 = this.T8.getInteger(this, SP.SOUNDLEVEL_COLOR_REPORTING, -1);
        this.S6 = this.T8.getInteger(this, SP.WIND_COLOR_REPORTING, -1);
        this.W6 = this.T8.getInteger(this, SP.HUMIDITY_COLOR_REPORTING, -1);
        this.a7 = this.T8.getInteger(this, SP.PRESSURE_COLOR_REPORTING, -1);
        this.T8.getInteger(this, SP.ELEVATION_COLOR_REPORTING, -1);
        this.e7 = this.T8.getInteger(this, SP.ALTITUDE_COLOR_REPORTING, -1);
        this.i7 = this.T8.getInteger(this, SP.ACCURACY_COLOR_REPORTING, -1);
        this.m7 = this.T8.getInteger(this, SP.NUMBERING_COLOR_REPORTING, -1);
        this.T8.getInteger(this, SP.TIMEZONE_REPORTING, 6);
        this.u7 = this.T8.getInteger(this, SP.SEQUENCE_REPORTING, 1);
        this.C7 = this.T8.getString(this, SP.SUFFIX_REPORTING, "");
        this.y7 = this.T8.getString(this, SP.PREFIX_REPORTING, "");
        this.D5 = this.T8.getString(this, SP.REPORT_TAG_REPORTING, Default.REPORT_TAG);
        System.out.println("ejfnjdfjkdnfjkdnjkfdnjkfndjkfnd                " + this.D5);
        this.l5 = this.T8.getInteger(this, SP.REPORT_COLOR_REPORTING, -1);
        this.G7 = this.T8.getString(this, SP.PERSON_NAME_REPORTING, "-");
        this.K7 = this.T8.getString(this, SP.CONTACT_NUMBER_REPORTING, Default.contactNumber);
        this.O4 = this.T8.getBoolean(this, SP.IS_MAP_REPORTING, true);
        this.S4 = this.T8.getBoolean(this, SP.IS_COUNTRY_FLAG_REPORTING, true);
        this.P4 = this.T8.getBoolean(this, SP.IS_ADDRESS_REPORTING, true);
        this.v5 = this.T8.getBoolean(this, SP.IS_ADDRESS_CITY_REPORTING, true);
        this.w5 = this.T8.getBoolean(this, SP.IS_ADDRESS_STATE_REPORTING, true);
        this.y5 = this.T8.getBoolean(this, SP.IS_ADDRESS_PINCODE_REPORTING, true);
        this.x5 = this.T8.getBoolean(this, SP.IS_ADDRESS_COUNTRY_REPORTING, true);
        this.T4 = this.T8.getBoolean(this, SP.IS_PLUS_CODE_REPORTING, false);
        this.U4 = this.T8.getBoolean(this, SP.IS_WEATHER_REPORTING, false);
        this.V4 = this.T8.getBoolean(this, SP.IS_DATE_TIME_REPORTING, true);
        this.W4 = this.T8.getBoolean(this, SP.IS_TIMEZONE_REPORTING, true);
        this.X4 = this.T8.getBoolean(this, SP.IS_NUMBERING_REPORTING, false);
        this.O5 = this.T8.getBoolean(this, SP.IS_PERSON_NAME_REPORTING, false);
        this.S5 = this.T8.getBoolean(this, SP.IS_CONTACT_NUMBER_REPORTING, false);
        this.K5 = this.T8.getBoolean(this, SP.IS_SOUNDLEVEL_REPORTING, false);
        this.Y4 = this.T8.getBoolean(this, SP.IS_MAGNETIC_FIELD_REPORTING, false);
        this.Z4 = this.T8.getBoolean(this, SP.IS_COMPASS_REPORTING, false);
        this.a5 = this.T8.getBoolean(this, SP.IS_WIND_REPORTING, false);
        this.b5 = this.T8.getBoolean(this, SP.IS_LOGO_REPORTING, false);
        this.c5 = this.T8.getBoolean(this, SP.IS_NOTES_REPORTING, true);
        this.e5 = this.T8.getBoolean(this, SP.IS_PRESSURE_REPORTING, false);
        this.d5 = this.T8.getBoolean(this, SP.IS_HUMIDITY_REPORTING, false);
        this.T8.getBoolean(this, SP.IS_ELEVATION_REPORTING, false);
        this.f5 = this.T8.getBoolean(this, SP.IS_ALTITUDE_REPORTING, false);
        this.g5 = this.T8.getBoolean(this, SP.IS_ACCURACY_REPORTING, false);
        this.N8 = this.T8.getString(this, SP.LOGO_URI_REPORTING, Default.LOGO_uri);
        this.T8.getString(this, SP.NOTES_HASHTAG_REPORTING, Default.notes);
        this.O8 = this.T8.getString(this, SP.STAMP_FONT_STYLE_REPORTING, Default.DEFAULT_FONT_STYLE);
        this.T8.getString(this, SP.DATE_FORMAT_REPORTING, Default.DEFAULT_DATE_FORMAT);
        this.S8 = this.T8.getInteger(this, SP.LAT_LNG_TYPE_REPORTING, 1);
        this.L8 = this.T8.getString(this, SP.TEMPRATURE_TYPE_REPORTING, "Celsius");
        this.h8 = this.T8.getFloat(this, SP.TEMPRETURE_VALUE);
        this.T8.getInteger(this, SP.WEATHER_ICON, 0);
        this.g0.setImageResource(this.r8.getResourceId(this.i8, 0));
        this.M8 = this.T8.getString(this, SP.MAP_TYPE_TEMPLATE_REPORTING, Default.SETELLITE_2);
        this.T8.getInteger(this, SP.MAP_POS_REPORTING, 1);
        this.T8.getInteger(this, SP.MAP_ZOOM_SCALE_REPORTING, 78);
        this.f8 = this.T8.getInteger(this, SP.MAP_POS_TYPE_REPORTING, 0);
        this.T8.getString(this, SP.STAMP_POS_REPORTING, "Bottom");
        this.l8 = this.T8.getString(this, SP.STAMP_SIZE_REPORTING, Default.TEMPLATE_SIZE);
        this.p8 = this.T8.getString(this, SP.PLUS_CODE_TYPE_REPORTING, Default.PLUSCODE_TYPE);
        this.P7 = this.T8.getInteger(this, SP.WIND_SELECT_REPORTING, 0);
        this.T7 = this.T8.getInteger(this, SP.ALTITUDE_SELECT_REPORTING, 0);
        this.X7 = this.T8.getInteger(this, SP.ACCURACY_SELECT_REPORTING, 0);
        this.b8 = this.T8.getInteger(this, SP.PRESSURE_SELECT_REPORTING, 0);
        boolean zIsTablet = HelperClass.isTablet(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (this.l8.equals("Large")) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_100), (int) getResources().getDimension(R.dimen.stamp_icon_size_130));
        } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_100), (int) getResources().getDimension(R.dimen.stamp_icon_size_110));
        } else {
            layoutParams = this.l8.equals("Small") ? new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_90), (int) getResources().getDimension(R.dimen.stamp_icon_size_85)) : new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_90), (int) getResources().getDimension(R.dimen.stamp_icon_size_65));
        }
        int i = this.f8;
        LinearLayout linearLayout = this.E5;
        if (i == 0) {
            linearLayout.setVisibility(0);
            this.F5.setVisibility(8);
            layoutParams2.setMargins((int) getResources().getDimension(R.dimen._4dp), 0, (int) getResources().getDimension(R.dimen._4dp), 0);
            layoutParams.setMargins((int) getResources().getDimension(R.dimen._4dp), 0, 0, 0);
            layoutParams.gravity = 80;
            this.E5.setLayoutParams(layoutParams);
        } else {
            linearLayout.setVisibility(8);
            this.F5.setVisibility(0);
            layoutParams2.setMargins((int) getResources().getDimension(R.dimen._4dp), 0, (int) getResources().getDimension(R.dimen._4dp), 0);
            layoutParams.setMargins(0, 0, (int) getResources().getDimension(R.dimen._4dp), 0);
            layoutParams.gravity = 80;
            this.F5.setLayoutParams(layoutParams);
        }
        this.v3.setLayoutParams(layoutParams2);
        boolean z4 = this.U4;
        LinearLayout linearLayout2 = this.u3;
        if (z4) {
            linearLayout2.setVisibility(0);
        } else {
            linearLayout2.setVisibility(8);
        }
        if (this.d5 || this.g5 || this.f5 || this.a5 || this.e5 || this.K5) {
            this.D3.setVisibility(0);
            if (zIsTablet) {
                ((LinearLayout.LayoutParams) this.D3.getLayoutParams()).height += 2;
            }
        } else {
            this.D3.setVisibility(8);
        }
        boolean z5 = this.a5;
        LinearLayout linearLayout3 = this.B3;
        if (z5) {
            linearLayout3.setVisibility(0);
        } else {
            linearLayout3.setVisibility(8);
        }
        boolean z6 = this.d5;
        LinearLayout linearLayout4 = this.C3;
        if (z6) {
            linearLayout4.setVisibility(0);
        } else {
            linearLayout4.setVisibility(8);
        }
        boolean z7 = this.e5;
        LinearLayout linearLayout5 = this.A3;
        if (z7) {
            linearLayout5.setVisibility(0);
        } else {
            linearLayout5.setVisibility(8);
        }
        this.G5.setText(this.D5);
        this.H5.setText(this.D5);
        this.G5.setTextColor(this.l5);
        this.H5.setTextColor(this.l5);
        GradientDrawable gradientDrawable = (GradientDrawable) this.G5.getBackground().getCurrent();
        gradientDrawable.setCornerRadius(12.0f);
        gradientDrawable.setColor(this.m5);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.H5.getBackground().getCurrent();
        gradientDrawable2.setCornerRadius(12.0f);
        gradientDrawable2.setColor(this.m5);
        if (this.K5) {
            String soundLevel = HelperClass.getSoundLevel(this);
            if (this.A3.getVisibility() == 8) {
                this.A3.setVisibility(0);
                this.h0.setImageResource(R.drawable.sound_wave);
                this.E2.setText(soundLevel);
                this.E2.setTextColor(this.q6);
            } else if (this.B3.getVisibility() == 8) {
                this.B3.setVisibility(0);
                this.i0.setImageResource(R.drawable.sound_wave);
                this.G2.setText(soundLevel);
                this.G2.setTextColor(this.q6);
            } else if (this.C3.getVisibility() == 8) {
                this.C3.setVisibility(0);
                this.k0.setImageResource(R.drawable.sound_wave);
                this.F2.setText(soundLevel);
                this.F2.setTextColor(this.q6);
            }
        }
        if (this.f5) {
            String altitudeconvert = HelperClass.getAltitudeconvert(this, this.T7);
            if (this.A3.getVisibility() == 8) {
                this.A3.setVisibility(0);
                this.h0.setImageResource(R.drawable.ic_altitiude);
                this.E2.setText(altitudeconvert);
                this.E2.setTextColor(this.e7);
            } else if (this.B3.getVisibility() == 8) {
                this.B3.setVisibility(0);
                this.i0.setImageResource(R.drawable.ic_altitiude);
                this.G2.setText(altitudeconvert);
                this.G2.setTextColor(this.e7);
            } else if (this.C3.getVisibility() == 8) {
                this.C3.setVisibility(0);
                this.k0.setImageResource(R.drawable.ic_altitiude);
                this.F2.setText(altitudeconvert);
                this.F2.setTextColor(this.e7);
            }
        }
        if (this.g5) {
            String accuracy = HelperClass.getAccuracy(this, this.X7);
            if (this.A3.getVisibility() == 8) {
                this.A3.setVisibility(0);
                this.h0.setImageResource(R.drawable.ic_accuracy);
                this.E2.setText(accuracy);
                this.E2.setTextColor(this.i7);
            } else if (this.B3.getVisibility() == 8) {
                this.B3.setVisibility(0);
                this.i0.setImageResource(R.drawable.ic_accuracy);
                this.G2.setText(accuracy);
                this.G2.setTextColor(this.i7);
            } else if (this.C3.getVisibility() == 8) {
                this.C3.setVisibility(0);
                this.k0.setImageResource(R.drawable.ic_accuracy);
                this.F2.setText(accuracy);
                this.F2.setTextColor(this.i7);
            }
        }
        if (this.T3) {
            boolean z8 = this.Y4;
            LinearLayout linearLayout6 = this.t3;
            if (z8) {
                linearLayout6.setVisibility(0);
            } else {
                linearLayout6.setVisibility(8);
            }
            boolean z9 = this.Z4;
            LinearLayout linearLayout7 = this.q3;
            if (z9) {
                linearLayout7.setVisibility(0);
            } else {
                linearLayout7.setVisibility(8);
            }
        } else {
            this.t3.setVisibility(8);
            this.q3.setVisibility(8);
        }
        if (this.U4 || this.Y4 || this.Z4 || this.b5) {
            this.s3.setVisibility(0);
        } else {
            this.s3.setVisibility(8);
        }
        boolean z10 = this.b5;
        LinearLayout linearLayout8 = this.r3;
        if (z10) {
            linearLayout8.setVisibility(0);
        } else {
            linearLayout8.setVisibility(8);
        }
        if (this.l8.equals(Default.TEMPLATE_SIZE)) {
            this.e0.getLayoutParams().height = HelperClass.dpToPx(this, 30);
            this.e0.getLayoutParams().width = HelperClass.dpToPx(this, 58);
            this.g0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.g0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.f0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.f0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.h0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.h0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.i0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.i0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.j0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.j0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.G2.setTextSize(8.0f);
            this.E2.setTextSize(8.0f);
            this.F2.setTextSize(8.0f);
            this.D2.setTextSize(8.0f);
            this.H2.setTextSize(8.0f);
            this.I2.setTextSize(8.0f);
            this.G5.setTextSize(8.0f);
            this.H5.setTextSize(8.0f);
        } else if (this.l8.equals("Small")) {
            this.e0.getLayoutParams().height = HelperClass.dpToPx(this, 28);
            this.e0.getLayoutParams().width = HelperClass.dpToPx(this, 54);
            this.g0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.g0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.f0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.f0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.h0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.h0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.i0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.i0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.j0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.j0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.G2.setTextSize(7.0f);
            this.E2.setTextSize(7.0f);
            this.F2.setTextSize(7.0f);
            this.D2.setTextSize(7.0f);
            this.H2.setTextSize(7.0f);
            this.I2.setTextSize(7.0f);
            this.G5.setTextSize(7.0f);
            this.H5.setTextSize(7.0f);
        } else {
            boolean zEquals = this.l8.equals("Extra Small");
            ImageView imageView = this.e0;
            if (zEquals) {
                imageView.getLayoutParams().height = HelperClass.dpToPx(this, 26);
                this.e0.getLayoutParams().width = HelperClass.dpToPx(this, 50);
                this.g0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.g0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.f0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.f0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.h0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.h0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.i0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.i0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.j0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.j0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.G2.setTextSize(6.0f);
                this.E2.setTextSize(6.0f);
                this.F2.setTextSize(6.0f);
                this.D2.setTextSize(6.0f);
                this.H2.setTextSize(6.0f);
                this.I2.setTextSize(6.0f);
                this.G5.setTextSize(6.0f);
                this.H5.setTextSize(6.0f);
            } else {
                imageView.getLayoutParams().height = HelperClass.dpToPx(this, 32);
                this.e0.getLayoutParams().width = HelperClass.dpToPx(this, 62);
                this.g0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.g0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.f0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.f0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.h0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.h0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.i0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.i0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.j0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.j0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.G2.setTextSize(10.0f);
                this.E2.setTextSize(10.0f);
                this.F2.setTextSize(10.0f);
                this.D2.setTextSize(10.0f);
                this.H2.setTextSize(10.0f);
                this.I2.setTextSize(10.0f);
                this.G5.setTextSize(10.0f);
                this.H5.setTextSize(10.0f);
            }
        }
        boolean z11 = this.O4;
        boolean z12 = this.R4;
        boolean z13 = this.Q4;
        if (z11) {
            int i2 = this.P4 ? (z13 ? 1 : 0) + 1 : z13 ? 1 : 0;
            if (z12) {
                i2++;
            }
            if (this.T4) {
                i2++;
            }
            if (this.V4 || this.W4) {
                i2++;
            }
            if (this.X4) {
                i2++;
            }
            if (this.c5) {
                i2++;
            }
            if (this.O5) {
                i2++;
            }
            if (this.S5) {
                i2++;
            }
            int iDpToPx = HelperClass.dpToPx(this, 70);
            int iDpToPx2 = HelperClass.dpToPx(this, 75);
            int iDpToPx3 = HelperClass.dpToPx(this, 80);
            int iDpToPx4 = HelperClass.dpToPx(this, 85);
            int iDpToPx5 = HelperClass.dpToPx(this, 90);
            int iDpToPx6 = HelperClass.dpToPx(this, 95);
            int iDpToPx7 = HelperClass.dpToPx(this, 100);
            int iDpToPx8 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx9 = HelperClass.dpToPx(this, fh.k1);
            z = z12;
            int iDpToPx10 = HelperClass.dpToPx(this, 115);
            z3 = z13 ? 1 : 0;
            int iDpToPx11 = HelperClass.dpToPx(this, 120);
            int iDpToPx12 = HelperClass.dpToPx(this, 125);
            int iDpToPx13 = HelperClass.dpToPx(this, 130);
            int iDpToPx14 = HelperClass.dpToPx(this, 135);
            int iDpToPx15 = HelperClass.dpToPx(this, 140);
            int iDpToPx16 = HelperClass.dpToPx(this, 145);
            int iDpToPx17 = HelperClass.dpToPx(this, 150);
            int iDpToPx18 = HelperClass.dpToPx(this, 155);
            int iDpToPx19 = HelperClass.dpToPx(this, 160);
            int iDpToPx20 = HelperClass.dpToPx(this, 165);
            int iDpToPx21 = HelperClass.dpToPx(this, 170);
            if (i2 == 2) {
                if (this.U4 || this.Z4 || this.Y4) {
                    if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                        if (this.l8.equals("Large")) {
                            this.x3.getLayoutParams().height = iDpToPx14;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx14;
                                this.E5.getLayoutParams().height = iDpToPx14;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx14;
                                this.F5.getLayoutParams().height = iDpToPx14;
                                z2 = z3;
                            }
                        } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                            this.x3.getLayoutParams().height = iDpToPx12;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx12;
                                this.E5.getLayoutParams().height = iDpToPx12;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx12;
                                this.F5.getLayoutParams().height = iDpToPx12;
                                z2 = z3;
                            }
                        } else {
                            boolean zEquals2 = this.l8.equals("Small");
                            LinearLayout linearLayout9 = this.x3;
                            if (zEquals2) {
                                linearLayout9.getLayoutParams().height = iDpToPx10;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx10;
                                    this.E5.getLayoutParams().height = iDpToPx10;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx10;
                                    this.F5.getLayoutParams().height = iDpToPx10;
                                    z2 = z3;
                                }
                            } else {
                                linearLayout9.getLayoutParams().height = iDpToPx8;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx8;
                                    this.E5.getLayoutParams().height = iDpToPx8;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx8;
                                    this.F5.getLayoutParams().height = iDpToPx8;
                                    z2 = z3;
                                }
                            }
                        }
                    } else if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx12;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx12;
                            this.E5.getLayoutParams().height = iDpToPx12;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx12;
                            this.F5.getLayoutParams().height = iDpToPx12;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx10;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx10;
                            this.E5.getLayoutParams().height = iDpToPx10;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx10;
                            this.F5.getLayoutParams().height = iDpToPx10;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals3 = this.l8.equals("Small");
                        LinearLayout linearLayout10 = this.x3;
                        if (zEquals3) {
                            linearLayout10.getLayoutParams().height = iDpToPx8;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx8;
                                this.E5.getLayoutParams().height = iDpToPx8;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx8;
                                this.F5.getLayoutParams().height = iDpToPx8;
                                z2 = z3;
                            }
                        } else {
                            linearLayout10.getLayoutParams().height = iDpToPx6;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx6;
                                this.E5.getLayoutParams().height = iDpToPx6;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx6;
                                this.F5.getLayoutParams().height = iDpToPx6;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx8;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx8;
                            this.E5.getLayoutParams().height = iDpToPx8;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx8;
                            this.F5.getLayoutParams().height = iDpToPx8;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx6;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx6;
                            this.E5.getLayoutParams().height = iDpToPx6;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx6;
                            this.F5.getLayoutParams().height = iDpToPx6;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals4 = this.l8.equals("Small");
                        LinearLayout linearLayout11 = this.x3;
                        if (zEquals4) {
                            linearLayout11.getLayoutParams().height = iDpToPx5;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx5;
                                this.E5.getLayoutParams().height = iDpToPx5;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx5;
                                this.F5.getLayoutParams().height = iDpToPx5;
                                z2 = z3;
                            }
                        } else {
                            linearLayout11.getLayoutParams().height = iDpToPx4;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx4;
                                this.E5.getLayoutParams().height = iDpToPx4;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx4;
                                this.F5.getLayoutParams().height = iDpToPx4;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx4;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx4;
                        this.E5.getLayoutParams().height = iDpToPx4;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx4;
                        this.F5.getLayoutParams().height = iDpToPx4;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx3;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx3;
                        this.E5.getLayoutParams().height = iDpToPx3;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx3;
                        this.F5.getLayoutParams().height = iDpToPx3;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals5 = this.l8.equals("Small");
                    LinearLayout linearLayout12 = this.x3;
                    if (zEquals5) {
                        linearLayout12.getLayoutParams().height = iDpToPx2;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx2;
                            this.E5.getLayoutParams().height = iDpToPx2;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx2;
                            this.F5.getLayoutParams().height = iDpToPx2;
                            z2 = z3;
                        }
                    } else {
                        linearLayout12.getLayoutParams().height = iDpToPx;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx;
                            this.E5.getLayoutParams().height = iDpToPx;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx;
                            this.F5.getLayoutParams().height = iDpToPx;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 3) {
                if (!this.U4 && !this.Z4 && !this.Y4) {
                    boolean z14 = this.I3;
                    boolean z15 = this.a5;
                    if (z14) {
                        if (z15 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                            if (this.l8.equals("Large")) {
                                this.x3.getLayoutParams().height = iDpToPx11;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx11;
                                    this.E5.getLayoutParams().height = iDpToPx11;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx11;
                                    this.F5.getLayoutParams().height = iDpToPx11;
                                    z2 = z3;
                                }
                            } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                                this.x3.getLayoutParams().height = iDpToPx9;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx9;
                                    this.E5.getLayoutParams().height = iDpToPx9;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx9;
                                    this.F5.getLayoutParams().height = iDpToPx9;
                                    z2 = z3;
                                }
                            } else {
                                boolean zEquals6 = this.l8.equals("Small");
                                LinearLayout linearLayout13 = this.x3;
                                if (zEquals6) {
                                    linearLayout13.getLayoutParams().height = iDpToPx7;
                                    if (this.f8 == 0) {
                                        this.E5.getLayoutParams().width = iDpToPx7;
                                        this.E5.getLayoutParams().height = iDpToPx7;
                                        z2 = z3;
                                    } else {
                                        this.F5.getLayoutParams().width = iDpToPx7;
                                        this.F5.getLayoutParams().height = iDpToPx7;
                                        z2 = z3;
                                    }
                                } else {
                                    linearLayout13.getLayoutParams().height = iDpToPx5;
                                    if (this.f8 == 0) {
                                        this.E5.getLayoutParams().width = iDpToPx5;
                                        this.E5.getLayoutParams().height = iDpToPx5;
                                        z2 = z3;
                                    } else {
                                        this.F5.getLayoutParams().width = iDpToPx5;
                                        this.F5.getLayoutParams().height = iDpToPx5;
                                        z2 = z3;
                                    }
                                }
                            }
                        } else if (this.l8.equals("Large")) {
                            this.x3.getLayoutParams().height = iDpToPx9;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx9;
                                this.E5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx9;
                                this.F5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            }
                        } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                            this.x3.getLayoutParams().height = iDpToPx7;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx7;
                                this.E5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx7;
                                this.F5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            }
                        } else {
                            boolean zEquals7 = this.l8.equals("Small");
                            LinearLayout linearLayout14 = this.x3;
                            if (zEquals7) {
                                linearLayout14.getLayoutParams().height = iDpToPx5;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx5;
                                    this.E5.getLayoutParams().height = iDpToPx5;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx5;
                                    this.F5.getLayoutParams().height = iDpToPx5;
                                    z2 = z3;
                                }
                            } else {
                                linearLayout14.getLayoutParams().height = iDpToPx3;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx3;
                                    this.E5.getLayoutParams().height = iDpToPx3;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx3;
                                    this.F5.getLayoutParams().height = iDpToPx3;
                                    z2 = z3;
                                }
                            }
                        }
                    } else if (z15 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                        if (this.l8.equals("Large")) {
                            this.x3.getLayoutParams().height = iDpToPx9;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx9;
                                this.E5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx9;
                                this.F5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            }
                        } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                            this.x3.getLayoutParams().height = iDpToPx7;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx7;
                                this.E5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx7;
                                this.F5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            }
                        } else {
                            boolean zEquals8 = this.l8.equals("Small");
                            LinearLayout linearLayout15 = this.x3;
                            if (zEquals8) {
                                linearLayout15.getLayoutParams().height = iDpToPx5;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx5;
                                    this.E5.getLayoutParams().height = iDpToPx5;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx5;
                                    this.F5.getLayoutParams().height = iDpToPx5;
                                    z2 = z3;
                                }
                            } else {
                                linearLayout15.getLayoutParams().height = iDpToPx3;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx3;
                                    this.E5.getLayoutParams().height = iDpToPx3;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx3;
                                    this.F5.getLayoutParams().height = iDpToPx3;
                                    z2 = z3;
                                }
                            }
                        }
                    } else if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx7;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx7;
                            this.E5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx7;
                            this.F5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx5;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx5;
                            this.E5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx5;
                            this.F5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals9 = this.l8.equals("Small");
                        LinearLayout linearLayout16 = this.x3;
                        if (zEquals9) {
                            linearLayout16.getLayoutParams().height = iDpToPx3;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx3;
                                this.E5.getLayoutParams().height = iDpToPx3;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx3;
                                this.F5.getLayoutParams().height = iDpToPx3;
                                z2 = z3;
                            }
                        } else {
                            linearLayout16.getLayoutParams().height = iDpToPx;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx;
                                this.E5.getLayoutParams().height = iDpToPx;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx;
                                this.F5.getLayoutParams().height = iDpToPx;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx13;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx13;
                            this.E5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx13;
                            this.F5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx11;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx11;
                            this.E5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx11;
                            this.F5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals10 = this.l8.equals("Small");
                        LinearLayout linearLayout17 = this.x3;
                        if (zEquals10) {
                            linearLayout17.getLayoutParams().height = iDpToPx9;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx9;
                                this.E5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx9;
                                this.F5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            }
                        } else {
                            linearLayout17.getLayoutParams().height = iDpToPx7;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx7;
                                this.E5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx7;
                                this.F5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx11;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx11;
                        this.E5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx11;
                        this.F5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx9;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx9;
                        this.E5.getLayoutParams().height = iDpToPx9;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx9;
                        this.F5.getLayoutParams().height = iDpToPx9;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals11 = this.l8.equals("Small");
                    LinearLayout linearLayout18 = this.x3;
                    if (zEquals11) {
                        linearLayout18.getLayoutParams().height = iDpToPx7;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx7;
                            this.E5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx7;
                            this.F5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        }
                    } else {
                        linearLayout18.getLayoutParams().height = iDpToPx5;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx5;
                            this.E5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx5;
                            this.F5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 4) {
                if (!this.U4 && !this.Z4 && !this.Y4) {
                    boolean z16 = this.I3;
                    boolean z17 = this.a5;
                    if (z16) {
                        if (z17 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                            if (this.l8.equals("Large")) {
                                this.x3.getLayoutParams().height = iDpToPx12;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx12;
                                    this.E5.getLayoutParams().height = iDpToPx12;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx12;
                                    this.F5.getLayoutParams().height = iDpToPx12;
                                    z2 = z3;
                                }
                            } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                                this.x3.getLayoutParams().height = iDpToPx10;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx10;
                                    this.E5.getLayoutParams().height = iDpToPx10;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx10;
                                    this.F5.getLayoutParams().height = iDpToPx10;
                                    z2 = z3;
                                }
                            } else {
                                boolean zEquals12 = this.l8.equals("Small");
                                LinearLayout linearLayout19 = this.x3;
                                if (zEquals12) {
                                    linearLayout19.getLayoutParams().height = iDpToPx8;
                                    if (this.f8 == 0) {
                                        this.E5.getLayoutParams().width = iDpToPx8;
                                        this.E5.getLayoutParams().height = iDpToPx8;
                                        z2 = z3;
                                    } else {
                                        this.F5.getLayoutParams().width = iDpToPx8;
                                        this.F5.getLayoutParams().height = iDpToPx8;
                                        z2 = z3;
                                    }
                                } else {
                                    linearLayout19.getLayoutParams().height = iDpToPx6;
                                    if (this.f8 == 0) {
                                        this.E5.getLayoutParams().width = iDpToPx6;
                                        this.E5.getLayoutParams().height = iDpToPx6;
                                        z2 = z3;
                                    } else {
                                        this.F5.getLayoutParams().width = iDpToPx6;
                                        this.F5.getLayoutParams().height = iDpToPx6;
                                        z2 = z3;
                                    }
                                }
                            }
                        } else if (this.l8.equals("Large")) {
                            this.x3.getLayoutParams().height = iDpToPx10;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx10;
                                this.E5.getLayoutParams().height = iDpToPx10;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx10;
                                this.F5.getLayoutParams().height = iDpToPx10;
                                z2 = z3;
                            }
                        } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                            this.x3.getLayoutParams().height = iDpToPx8;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx8;
                                this.E5.getLayoutParams().height = iDpToPx8;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx8;
                                this.F5.getLayoutParams().height = iDpToPx8;
                                z2 = z3;
                            }
                        } else {
                            boolean zEquals13 = this.l8.equals("Small");
                            LinearLayout linearLayout20 = this.x3;
                            if (zEquals13) {
                                linearLayout20.getLayoutParams().height = iDpToPx6;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx6;
                                    this.E5.getLayoutParams().height = iDpToPx6;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx6;
                                    this.F5.getLayoutParams().height = iDpToPx6;
                                    z2 = z3;
                                }
                            } else {
                                linearLayout20.getLayoutParams().height = iDpToPx4;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx4;
                                    this.E5.getLayoutParams().height = iDpToPx4;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx4;
                                    this.F5.getLayoutParams().height = iDpToPx4;
                                    z2 = z3;
                                }
                            }
                        }
                    } else if (z17 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                        if (this.l8.equals("Large")) {
                            this.x3.getLayoutParams().height = iDpToPx10;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx10;
                                this.E5.getLayoutParams().height = iDpToPx10;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx10;
                                this.F5.getLayoutParams().height = iDpToPx10;
                                z2 = z3;
                            }
                        } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                            this.x3.getLayoutParams().height = iDpToPx8;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx8;
                                this.E5.getLayoutParams().height = iDpToPx8;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx8;
                                this.F5.getLayoutParams().height = iDpToPx8;
                                z2 = z3;
                            }
                        } else {
                            boolean zEquals14 = this.l8.equals("Small");
                            LinearLayout linearLayout21 = this.x3;
                            if (zEquals14) {
                                linearLayout21.getLayoutParams().height = iDpToPx6;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx6;
                                    this.E5.getLayoutParams().height = iDpToPx6;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx6;
                                    this.F5.getLayoutParams().height = iDpToPx6;
                                    z2 = z3;
                                }
                            } else {
                                linearLayout21.getLayoutParams().height = iDpToPx4;
                                if (this.f8 == 0) {
                                    this.E5.getLayoutParams().width = iDpToPx4;
                                    this.E5.getLayoutParams().height = iDpToPx4;
                                    z2 = z3;
                                } else {
                                    this.F5.getLayoutParams().width = iDpToPx4;
                                    this.F5.getLayoutParams().height = iDpToPx4;
                                    z2 = z3;
                                }
                            }
                        }
                    } else if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx8;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx8;
                            this.E5.getLayoutParams().height = iDpToPx8;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx8;
                            this.F5.getLayoutParams().height = iDpToPx8;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx6;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx6;
                            this.E5.getLayoutParams().height = iDpToPx6;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx6;
                            this.F5.getLayoutParams().height = iDpToPx6;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals15 = this.l8.equals("Small");
                        LinearLayout linearLayout22 = this.x3;
                        if (zEquals15) {
                            linearLayout22.getLayoutParams().height = iDpToPx4;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx4;
                                this.E5.getLayoutParams().height = iDpToPx4;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx4;
                                this.F5.getLayoutParams().height = iDpToPx4;
                                z2 = z3;
                            }
                        } else {
                            linearLayout22.getLayoutParams().height = iDpToPx2;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx2;
                                this.E5.getLayoutParams().height = iDpToPx2;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx2;
                                this.F5.getLayoutParams().height = iDpToPx2;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx13;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx13;
                            this.E5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx13;
                            this.F5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx11;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx11;
                            this.E5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx11;
                            this.F5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals16 = this.l8.equals("Small");
                        LinearLayout linearLayout23 = this.x3;
                        if (zEquals16) {
                            linearLayout23.getLayoutParams().height = iDpToPx9;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx9;
                                this.E5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx9;
                                this.F5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            }
                        } else {
                            linearLayout23.getLayoutParams().height = iDpToPx7;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx7;
                                this.E5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx7;
                                this.F5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx11;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx11;
                        this.E5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx11;
                        this.F5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx9;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx9;
                        this.E5.getLayoutParams().height = iDpToPx9;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx9;
                        this.F5.getLayoutParams().height = iDpToPx9;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals17 = this.l8.equals("Small");
                    LinearLayout linearLayout24 = this.x3;
                    if (zEquals17) {
                        linearLayout24.getLayoutParams().height = iDpToPx7;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx7;
                            this.E5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx7;
                            this.F5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        }
                    } else {
                        linearLayout24.getLayoutParams().height = iDpToPx5;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx5;
                            this.E5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx5;
                            this.F5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 5) {
                if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx13;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx13;
                            this.E5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx13;
                            this.F5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx11;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx11;
                            this.E5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx11;
                            this.F5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals18 = this.l8.equals("Small");
                        LinearLayout linearLayout25 = this.x3;
                        if (zEquals18) {
                            linearLayout25.getLayoutParams().height = iDpToPx9;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx9;
                                this.E5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx9;
                                this.F5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            }
                        } else {
                            linearLayout25.getLayoutParams().height = iDpToPx7;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx7;
                                this.E5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx7;
                                this.F5.getLayoutParams().height = iDpToPx7;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx11;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx11;
                        this.E5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx11;
                        this.F5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx9;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx9;
                        this.E5.getLayoutParams().height = iDpToPx9;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx9;
                        this.F5.getLayoutParams().height = iDpToPx9;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals19 = this.l8.equals("Small");
                    LinearLayout linearLayout26 = this.x3;
                    if (zEquals19) {
                        linearLayout26.getLayoutParams().height = iDpToPx7;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx7;
                            this.E5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx7;
                            this.F5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        }
                    } else {
                        linearLayout26.getLayoutParams().height = iDpToPx5;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx5;
                            this.E5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx5;
                            this.F5.getLayoutParams().height = iDpToPx5;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 6) {
                if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx15;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx15;
                            this.E5.getLayoutParams().height = iDpToPx15;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx15;
                            this.F5.getLayoutParams().height = iDpToPx15;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx13;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx13;
                            this.E5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx13;
                            this.F5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals20 = this.l8.equals("Small");
                        LinearLayout linearLayout27 = this.x3;
                        if (zEquals20) {
                            linearLayout27.getLayoutParams().height = iDpToPx11;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx11;
                                this.E5.getLayoutParams().height = iDpToPx11;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx11;
                                this.F5.getLayoutParams().height = iDpToPx11;
                                z2 = z3;
                            }
                        } else {
                            linearLayout27.getLayoutParams().height = iDpToPx9;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx9;
                                this.E5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx9;
                                this.F5.getLayoutParams().height = iDpToPx9;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx13;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx13;
                        this.E5.getLayoutParams().height = iDpToPx13;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx13;
                        this.F5.getLayoutParams().height = iDpToPx13;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx11;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx11;
                        this.E5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx11;
                        this.F5.getLayoutParams().height = iDpToPx11;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals21 = this.l8.equals("Small");
                    LinearLayout linearLayout28 = this.x3;
                    if (zEquals21) {
                        linearLayout28.getLayoutParams().height = iDpToPx9;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx9;
                            this.E5.getLayoutParams().height = iDpToPx9;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx9;
                            this.F5.getLayoutParams().height = iDpToPx9;
                            z2 = z3;
                        }
                    } else {
                        linearLayout28.getLayoutParams().height = iDpToPx7;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx7;
                            this.E5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx7;
                            this.F5.getLayoutParams().height = iDpToPx7;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 7) {
                if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx17;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx17;
                            this.E5.getLayoutParams().height = iDpToPx17;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx17;
                            this.F5.getLayoutParams().height = iDpToPx17;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx15;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx15;
                            this.E5.getLayoutParams().height = iDpToPx15;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx15;
                            this.F5.getLayoutParams().height = iDpToPx15;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals22 = this.l8.equals("Small");
                        LinearLayout linearLayout29 = this.x3;
                        if (zEquals22) {
                            linearLayout29.getLayoutParams().height = iDpToPx13;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx13;
                                this.E5.getLayoutParams().height = iDpToPx13;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx13;
                                this.F5.getLayoutParams().height = iDpToPx13;
                                z2 = z3;
                            }
                        } else {
                            linearLayout29.getLayoutParams().height = iDpToPx11;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx11;
                                this.E5.getLayoutParams().height = iDpToPx11;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx11;
                                this.F5.getLayoutParams().height = iDpToPx11;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx15;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx15;
                        this.E5.getLayoutParams().height = iDpToPx15;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx15;
                        this.F5.getLayoutParams().height = iDpToPx15;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx13;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx13;
                        this.E5.getLayoutParams().height = iDpToPx13;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx13;
                        this.F5.getLayoutParams().height = iDpToPx13;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals23 = this.l8.equals("Small");
                    LinearLayout linearLayout30 = this.x3;
                    if (zEquals23) {
                        linearLayout30.getLayoutParams().height = iDpToPx11;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx11;
                            this.E5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx11;
                            this.F5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        }
                    } else {
                        linearLayout30.getLayoutParams().height = iDpToPx9;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx9;
                            this.E5.getLayoutParams().height = iDpToPx9;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx9;
                            this.F5.getLayoutParams().height = iDpToPx9;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 8) {
                if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx19;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx19;
                            this.E5.getLayoutParams().height = iDpToPx19;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx19;
                            this.F5.getLayoutParams().height = iDpToPx19;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx17;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx17;
                            this.E5.getLayoutParams().height = iDpToPx17;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx17;
                            this.F5.getLayoutParams().height = iDpToPx17;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals24 = this.l8.equals("Small");
                        LinearLayout linearLayout31 = this.x3;
                        if (zEquals24) {
                            linearLayout31.getLayoutParams().height = iDpToPx15;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx15;
                                this.E5.getLayoutParams().height = iDpToPx15;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx15;
                                this.F5.getLayoutParams().height = iDpToPx15;
                                z2 = z3;
                            }
                        } else {
                            linearLayout31.getLayoutParams().height = iDpToPx13;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx13;
                                this.E5.getLayoutParams().height = iDpToPx13;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx13;
                                this.F5.getLayoutParams().height = iDpToPx13;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx17;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx17;
                        this.E5.getLayoutParams().height = iDpToPx17;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx17;
                        this.F5.getLayoutParams().height = iDpToPx17;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx15;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx15;
                        this.E5.getLayoutParams().height = iDpToPx15;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx15;
                        this.F5.getLayoutParams().height = iDpToPx15;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals25 = this.l8.equals("Small");
                    LinearLayout linearLayout32 = this.x3;
                    if (zEquals25) {
                        linearLayout32.getLayoutParams().height = iDpToPx13;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx13;
                            this.E5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx13;
                            this.F5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        }
                    } else {
                        linearLayout32.getLayoutParams().height = iDpToPx11;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx11;
                            this.E5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx11;
                            this.F5.getLayoutParams().height = iDpToPx11;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 9) {
                if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx20;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx20;
                            this.E5.getLayoutParams().height = iDpToPx20;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx20;
                            this.F5.getLayoutParams().height = iDpToPx20;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx18;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx18;
                            this.E5.getLayoutParams().height = iDpToPx18;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx18;
                            this.F5.getLayoutParams().height = iDpToPx18;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals26 = this.l8.equals("Small");
                        LinearLayout linearLayout33 = this.x3;
                        if (zEquals26) {
                            linearLayout33.getLayoutParams().height = iDpToPx16;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx16;
                                this.E5.getLayoutParams().height = iDpToPx16;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx16;
                                this.F5.getLayoutParams().height = iDpToPx16;
                                z2 = z3;
                            }
                        } else {
                            linearLayout33.getLayoutParams().height = iDpToPx14;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx14;
                                this.E5.getLayoutParams().height = iDpToPx14;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx14;
                                this.F5.getLayoutParams().height = iDpToPx14;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx18;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx18;
                        this.E5.getLayoutParams().height = iDpToPx18;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx18;
                        this.F5.getLayoutParams().height = iDpToPx18;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx16;
                    if (this.f8 == 0) {
                        this.E5.getLayoutParams().width = iDpToPx16;
                        this.E5.getLayoutParams().height = iDpToPx16;
                        z2 = z3;
                    } else {
                        this.F5.getLayoutParams().width = iDpToPx16;
                        this.F5.getLayoutParams().height = iDpToPx16;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals27 = this.l8.equals("Small");
                    LinearLayout linearLayout34 = this.x3;
                    if (zEquals27) {
                        linearLayout34.getLayoutParams().height = iDpToPx14;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx14;
                            this.E5.getLayoutParams().height = iDpToPx14;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx14;
                            this.F5.getLayoutParams().height = iDpToPx14;
                            z2 = z3;
                        }
                    } else {
                        linearLayout34.getLayoutParams().height = iDpToPx12;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx12;
                            this.E5.getLayoutParams().height = iDpToPx12;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx12;
                            this.F5.getLayoutParams().height = iDpToPx12;
                            z2 = z3;
                        }
                    }
                }
            } else if (i2 == 10) {
                if (this.a5 || this.d5 || this.e5 || this.f5 || this.g5 || this.K5) {
                    z2 = z3;
                    z2 = z3;
                    z2 = z3;
                    z2 = z3;
                    z2 = z3;
                    z2 = z3;
                    if (this.l8.equals("Large")) {
                        this.x3.getLayoutParams().height = iDpToPx21;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx21;
                            this.E5.getLayoutParams().height = iDpToPx21;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx21;
                            this.F5.getLayoutParams().height = iDpToPx21;
                            z2 = z3;
                        }
                    } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                        this.x3.getLayoutParams().height = iDpToPx19;
                        if (this.f8 == 0) {
                            this.E5.getLayoutParams().width = iDpToPx19;
                            this.E5.getLayoutParams().height = iDpToPx19;
                            z2 = z3;
                        } else {
                            this.F5.getLayoutParams().width = iDpToPx19;
                            this.F5.getLayoutParams().height = iDpToPx19;
                            z2 = z3;
                        }
                    } else {
                        boolean zEquals28 = this.l8.equals("Small");
                        LinearLayout linearLayout35 = this.x3;
                        if (zEquals28) {
                            linearLayout35.getLayoutParams().height = iDpToPx17;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx17;
                                this.E5.getLayoutParams().height = iDpToPx17;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx17;
                                this.F5.getLayoutParams().height = iDpToPx17;
                                z2 = z3;
                            }
                        } else {
                            linearLayout35.getLayoutParams().height = iDpToPx15;
                            if (this.f8 == 0) {
                                this.E5.getLayoutParams().width = iDpToPx15;
                                this.E5.getLayoutParams().height = iDpToPx15;
                                z2 = z3;
                            } else {
                                this.F5.getLayoutParams().width = iDpToPx15;
                                this.F5.getLayoutParams().height = iDpToPx15;
                                z2 = z3;
                            }
                        }
                    }
                } else if (this.l8.equals("Large")) {
                    this.x3.getLayoutParams().height = iDpToPx19;
                    if (this.f8 == 0) {
                        z2 = z3;
                        this.E5.getLayoutParams().width = iDpToPx19;
                        this.E5.getLayoutParams().height = iDpToPx19;
                        z2 = z3;
                    } else {
                        z2 = z3;
                        this.F5.getLayoutParams().width = iDpToPx19;
                        this.F5.getLayoutParams().height = iDpToPx19;
                        z2 = z3;
                    }
                } else if (this.l8.equals(Default.TEMPLATE_SIZE)) {
                    this.x3.getLayoutParams().height = iDpToPx17;
                    if (this.f8 == 0) {
                        z2 = z3;
                        this.E5.getLayoutParams().width = iDpToPx17;
                        this.E5.getLayoutParams().height = iDpToPx17;
                        z2 = z3;
                    } else {
                        z2 = z3;
                        this.F5.getLayoutParams().width = iDpToPx17;
                        this.F5.getLayoutParams().height = iDpToPx17;
                        z2 = z3;
                    }
                } else {
                    boolean zEquals29 = this.l8.equals("Small");
                    LinearLayout linearLayout36 = this.x3;
                    if (zEquals29) {
                        linearLayout36.getLayoutParams().height = iDpToPx15;
                        if (this.f8 == 0) {
                            z2 = z3;
                            this.E5.getLayoutParams().width = iDpToPx15;
                            this.E5.getLayoutParams().height = iDpToPx15;
                            z2 = z3;
                        } else {
                            z2 = z3;
                            this.F5.getLayoutParams().width = iDpToPx15;
                            this.F5.getLayoutParams().height = iDpToPx15;
                            z2 = z3;
                        }
                    } else {
                        linearLayout36.getLayoutParams().height = iDpToPx13;
                        if (this.f8 == 0) {
                            z2 = z3;
                            this.E5.getLayoutParams().width = iDpToPx13;
                            this.E5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        } else {
                            z2 = z3;
                            this.F5.getLayoutParams().width = iDpToPx13;
                            this.F5.getLayoutParams().height = iDpToPx13;
                            z2 = z3;
                        }
                    }
                }
            }
        } else {
            z = z12;
            z2 = z13 ? 1 : 0;
        }
        z2 = z3;
        if (this.P4 || z2 || z || this.V4 || this.c5 || this.a5 || this.d5 || this.g5 || this.e5 || this.f5 || this.X4 || this.W4 || this.T4 || this.K5 || this.O5) {
            this.w3.setVisibility(0);
            this.s3.setOrientation(1);
            this.s3.setGravity(8388627);
            this.s3.getLayoutParams().width = -2;
            this.s3.getLayoutParams().width = -2;
        } else {
            this.w3.setVisibility(8);
            this.s3.setOrientation(0);
            this.s3.setGravity(17);
            this.s3.getLayoutParams().width = -1;
            this.s3.getLayoutParams().width = -1;
        }
        if (z || this.P4 || z2 || this.Y4 || this.U4 || this.Z4 || this.V4 || this.X4 || this.W4 || this.O4 || this.c5 || this.a5 || this.d5 || this.g5 || this.e5 || this.f5 || this.b5 || this.T4 || this.K5 || this.O5) {
            this.v3.setVisibility(0);
            K();
        } else {
            this.v3.setVisibility(8);
        }
        if (z || this.P4 || z2 || this.V4 || this.c5 || this.X4 || this.W4 || this.T4 || this.O5) {
            this.C2.setVisibility(0);
        } else {
            this.C2.setVisibility(8);
        }
        if (!this.O4 || this.P4 || z2 || this.Z4 || this.V4 || this.X4 || this.W4 || z || this.Y4 || this.U4 || this.c5 || this.a5 || this.d5 || this.g5 || this.e5 || this.f5 || this.b5 || this.T4 || this.K5 || this.O5) {
            this.x3.setVisibility(0);
        } else {
            this.x3.setVisibility(4);
        }
        this.y3.setVisibility(8);
        this.z3.setVisibility(8);
        this.x3.setBackground(getDrawable(R.drawable.rect_grey));
        ((GradientDrawable) this.x3.getBackground().getCurrent()).setColor(this.j5);
        D();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.toolbar_back) {
            k().c();
            return;
        }
        if (view.getId() == R.id.imf_advance_temlent || view.getId() == R.id.imf_classic_templet || view.getId() == R.id.imf_reporting_templet || view.getId() == R.id.imf_navCompass_template || view.getId() == R.id.imf_datetime_template || view.getId() == R.id.imf_qrCode_template) {
            Intent intent = new Intent(this, (Class<?>) TempletSettingActivity.class);
            intent.putExtra(CvmpVJvatR.YgLEvnvovWuy, this.w8);
            startActivity(intent);
            return;
        }
        if (view.getId() == R.id.relStampLay_claasic) {
            if (this.w8 != 1) {
                this.g9.setTextColor(Color.parseColor("#FF7700"));
                this.W8.setBackgroundColor(0);
                this.W8.setBackgroundResource(R.drawable.corner_radius_all_template);
                boolean z = this.l9;
                LinearLayout linearLayout = this.V8;
                if (z) {
                    linearLayout.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.k9.setTextColor(getColor(R.color.app_text_main_dark));
                } else {
                    linearLayout.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.f9.setTextColor(getColor(R.color.app_text_main_light));
                    this.h9.setTextColor(getColor(R.color.app_text_main_light));
                    this.i9.setTextColor(getColor(R.color.app_text_main_light));
                    this.j9.setTextColor(getColor(R.color.app_text_main_light));
                    this.k9.setTextColor(getColor(R.color.app_text_main_light));
                }
                this.W8.setPadding(HelperClass.dpToPx(this, 4), 0, 0, this.W8.getPaddingBottom());
                this.B.setVisibility(8);
                this.D.setVisibility(8);
                this.C.setVisibility(0);
                this.E.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.w8 = 1;
                this.T8.setInteger(this, SP.TEMPLATE_TYPE, 1);
                return;
            }
            return;
        }
        if (view.getId() == R.id.relStampLay) {
            if (this.w8 != 0) {
                this.f9.setTextColor(Color.parseColor("#FF7700"));
                this.V8.setBackgroundColor(0);
                this.V8.setBackgroundResource(R.drawable.corner_radius_all_template);
                boolean z2 = this.l9;
                LinearLayout linearLayout2 = this.W8;
                if (z2) {
                    linearLayout2.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.k9.setTextColor(getColor(R.color.app_text_main_dark));
                } else {
                    linearLayout2.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.g9.setTextColor(getColor(R.color.app_text_main_light));
                    this.h9.setTextColor(getColor(R.color.app_text_main_light));
                    this.i9.setTextColor(getColor(R.color.app_text_main_light));
                    this.j9.setTextColor(getColor(R.color.app_text_main_light));
                    this.k9.setTextColor(getColor(R.color.app_text_main_light));
                }
                LinearLayout linearLayout3 = this.W8;
                linearLayout3.setPadding(0, 0, 0, linearLayout3.getPaddingBottom());
                this.B.setVisibility(0);
                this.C.setVisibility(8);
                this.D.setVisibility(8);
                this.E.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.w8 = 0;
                this.T8.setInteger(this, SP.TEMPLATE_TYPE, 0);
                return;
            }
            return;
        }
        if (view.getId() == R.id.relStampLay_reporting) {
            if (this.w8 != 2) {
                this.h9.setTextColor(Color.parseColor("#FF7700"));
                this.X8.setBackgroundColor(0);
                this.X8.setBackgroundResource(R.drawable.corner_radius_all_template);
                boolean z3 = this.l9;
                LinearLayout linearLayout4 = this.W8;
                if (z3) {
                    linearLayout4.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.k9.setTextColor(getColor(R.color.app_text_main_dark));
                } else {
                    linearLayout4.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.f9.setTextColor(getColor(R.color.app_text_main_light));
                    this.g9.setTextColor(getColor(R.color.app_text_main_light));
                    this.i9.setTextColor(getColor(R.color.app_text_main_light));
                    this.j9.setTextColor(getColor(R.color.app_text_main_light));
                    this.k9.setTextColor(getColor(R.color.app_text_main_light));
                }
                LinearLayout linearLayout5 = this.W8;
                linearLayout5.setPadding(0, 0, 0, linearLayout5.getPaddingBottom());
                this.D.setVisibility(0);
                this.C.setVisibility(8);
                this.B.setVisibility(8);
                this.E.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.w8 = 2;
                this.T8.setInteger(this, SP.TEMPLATE_TYPE, 2);
                return;
            }
            return;
        }
        if (view.getId() == R.id.relStampLay_navigation) {
            if (this.w8 != 3) {
                this.i9.setTextColor(Color.parseColor("#FF7700"));
                this.Y8.setBackgroundColor(0);
                this.Y8.setBackgroundResource(R.drawable.corner_radius_all_template);
                boolean z4 = this.l9;
                LinearLayout linearLayout6 = this.W8;
                if (z4) {
                    linearLayout6.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.k9.setTextColor(getColor(R.color.app_text_main_dark));
                } else {
                    linearLayout6.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.f9.setTextColor(getColor(R.color.app_text_main_light));
                    this.g9.setTextColor(getColor(R.color.app_text_main_light));
                    this.h9.setTextColor(getColor(R.color.app_text_main_light));
                    this.j9.setTextColor(getColor(R.color.app_text_main_light));
                    this.k9.setTextColor(getColor(R.color.app_text_main_light));
                }
                LinearLayout linearLayout7 = this.W8;
                linearLayout7.setPadding(0, 0, 0, linearLayout7.getPaddingBottom());
                this.D.setVisibility(8);
                this.C.setVisibility(8);
                this.B.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.E.setVisibility(0);
                this.w8 = 3;
                this.T8.setInteger(this, SP.TEMPLATE_TYPE, 3);
                return;
            }
            return;
        }
        if (view.getId() == R.id.relStampLay_dateTime) {
            if (this.w8 != 4) {
                this.j9.setTextColor(Color.parseColor("#FF7700"));
                this.Z8.setBackgroundColor(0);
                this.Z8.setBackgroundResource(R.drawable.corner_radius_all_template);
                boolean z5 = this.l9;
                LinearLayout linearLayout8 = this.W8;
                if (z5) {
                    linearLayout8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.k9.setTextColor(getColor(R.color.app_text_main_dark));
                } else {
                    linearLayout8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.f9.setTextColor(getColor(R.color.app_text_main_light));
                    this.g9.setTextColor(getColor(R.color.app_text_main_light));
                    this.h9.setTextColor(getColor(R.color.app_text_main_light));
                    this.i9.setTextColor(getColor(R.color.app_text_main_light));
                    this.k9.setTextColor(getColor(R.color.app_text_main_light));
                }
                LinearLayout linearLayout9 = this.W8;
                linearLayout9.setPadding(0, 0, 0, linearLayout9.getPaddingBottom());
                this.D.setVisibility(8);
                this.C.setVisibility(8);
                this.B.setVisibility(8);
                this.E.setVisibility(8);
                this.G.setVisibility(8);
                this.F.setVisibility(0);
                this.w8 = 4;
                this.T8.setInteger(this, SP.TEMPLATE_TYPE, 4);
                return;
            }
            return;
        }
        if (view.getId() == R.id.relStampLay_QR) {
            this.T8.setBoolean(this, SP.IS_QRT_SELECT, true);
            if (this.w8 != 5) {
                this.k9.setTextColor(Color.parseColor("#FF7700"));
                this.a9.setBackgroundColor(0);
                this.a9.setBackgroundResource(R.drawable.corner_radius_all_template);
                boolean z6 = this.l9;
                LinearLayout linearLayout10 = this.W8;
                if (z6) {
                    linearLayout10.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                    this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                    this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                } else {
                    linearLayout10.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                    this.f9.setTextColor(getColor(R.color.app_text_main_light));
                    this.g9.setTextColor(getColor(R.color.app_text_main_light));
                    this.h9.setTextColor(getColor(R.color.app_text_main_light));
                    this.i9.setTextColor(getColor(R.color.app_text_main_light));
                    this.j9.setTextColor(getColor(R.color.app_text_main_light));
                }
                LinearLayout linearLayout11 = this.W8;
                linearLayout11.setPadding(0, 0, 0, linearLayout11.getPaddingBottom());
                this.D.setVisibility(8);
                this.C.setVisibility(8);
                this.B.setVisibility(8);
                this.E.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(0);
                this.w8 = 5;
                this.T8.setInteger(this, SP.TEMPLATE_TYPE, 5);
            }
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        HelperClass helperClass = new HelperClass();
        this.U8 = helperClass;
        helperClass.SetLanguage(this);
        SP sp = new SP(this);
        this.T8 = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        if (string.equals(Default.DARK)) {
            this.l9 = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.l9 = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.l9 = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_templet_selection);
        new SP(this).getString(this, SP.ADS_STATUS, "1");
        if (!new SP(this).getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false)) {
            new SP(this).getBoolean(this, HelperClass.IS_SUBSCRIBE, false);
        }
        PreferenceManager.getDefaultSharedPreferences(this);
        this.f9 = (TextView) findViewById(R.id.template_title_1);
        this.g9 = (TextView) findViewById(R.id.template_title_2);
        this.h9 = (TextView) findViewById(R.id.template_title_3);
        this.i9 = (TextView) findViewById(R.id.template_title_4);
        this.j9 = (TextView) findViewById(R.id.template_title_5);
        this.k9 = (TextView) findViewById(R.id.template_title_6);
        this.c9 = (TextView) findViewById(R.id.tv_toolbar_title);
        this.d9 = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.B = (ImageView) findViewById(R.id.imf_advance_temlent);
        this.C = (ImageView) findViewById(R.id.imf_classic_templet);
        this.D = (ImageView) findViewById(R.id.imf_reporting_templet);
        this.E = (ImageView) findViewById(R.id.imf_navCompass_template);
        this.F = (ImageView) findViewById(R.id.imf_datetime_template);
        this.G = (ImageView) findViewById(R.id.imf_qrCode_template);
        this.m9 = (ImageView) findViewById(R.id.ivDtNewBadge);
        this.U = (ImageView) findViewById(R.id.classic_imgMap);
        this.c0 = (ImageView) findViewById(R.id.classic_imgMap_right);
        this.V = (ImageView) findViewById(R.id.classic_imgLogo);
        this.W = (ImageView) findViewById(R.id.classic_mgCompass);
        this.X = (ImageView) findViewById(R.id.classic_imgWeather);
        this.Y = (ImageView) findViewById(R.id.classic_img_pressure_stamp);
        this.Z = (ImageView) findViewById(R.id.classic_img_wind_stamp);
        this.a0 = (ImageView) findViewById(R.id.classic_imgMagneticField);
        this.b0 = (ImageView) findViewById(R.id.classic_img_humidity_stamp);
        this.v2 = (TextView) findViewById(R.id.classic_tv_address_line_1);
        this.w2 = (TextView) findViewById(R.id.classic_tv_weather);
        this.x2 = (TextView) findViewById(R.id.classic_txt_pressure);
        this.y2 = (TextView) findViewById(R.id.classic_txt_humidity);
        this.z2 = (TextView) findViewById(R.id.classic_txt_wind);
        this.A2 = (TextView) findViewById(R.id.classic_tv_compass);
        this.B2 = (TextView) findViewById(R.id.classic_tv_magnetic_field);
        this.n3 = (LinearLayout) findViewById(R.id.classic_lin_wind_stamp);
        this.c3 = (LinearLayout) findViewById(R.id.classic_li_compass);
        this.d3 = (LinearLayout) findViewById(R.id.classic_li_logo);
        this.e3 = (LinearLayout) findViewById(R.id.classic_li_rightView);
        this.f3 = (LinearLayout) findViewById(R.id.classic_li_magnetic_field);
        this.g3 = (LinearLayout) findViewById(R.id.classic_li_weather);
        this.h3 = (LinearLayout) findViewById(R.id.classic_li_main_stamp_lay);
        this.i3 = (LinearLayout) findViewById(R.id.classic_li_address);
        this.j3 = (LinearLayout) findViewById(R.id.classic_li_stamp);
        this.k3 = (LinearLayout) findViewById(R.id.classic_lin_waterma);
        this.l3 = (LinearLayout) findViewById(R.id.classic_lin_waterma_2);
        this.m3 = (LinearLayout) findViewById(R.id.classic_lin_pressure_stamp);
        this.o3 = (LinearLayout) findViewById(R.id.classic_lin_humidity_stamp);
        this.p3 = (LinearLayout) findViewById(R.id.classic_lin_bottom_wather);
        this.d0 = (ImageView) findViewById(R.id.reporting_imgMap);
        this.l0 = (ImageView) findViewById(R.id.reporting_imgMap_2);
        this.e0 = (ImageView) findViewById(R.id.reporting_imgLogo);
        this.f0 = (ImageView) findViewById(R.id.reporting_imgCompass);
        this.g0 = (ImageView) findViewById(R.id.reporting_imgWeather);
        this.h0 = (ImageView) findViewById(R.id.reporting_img_pressure_stamp);
        this.i0 = (ImageView) findViewById(R.id.reporting_img_wind_stamp);
        this.j0 = (ImageView) findViewById(R.id.reporting_imgMagneticField);
        this.k0 = (ImageView) findViewById(R.id.reporting_img_humidity_stamp);
        this.C2 = (TextView) findViewById(R.id.reporting_tv_address_line_1);
        this.D2 = (TextView) findViewById(R.id.reporting_tv_weather);
        this.E2 = (TextView) findViewById(R.id.reporting_txt_pressure);
        this.F2 = (TextView) findViewById(R.id.reporting_txt_humidity);
        this.G2 = (TextView) findViewById(R.id.reporting_txt_wind);
        this.H2 = (TextView) findViewById(R.id.reporting_tv_compass);
        this.I2 = (TextView) findViewById(R.id.reporting_tv_magnetic_field);
        this.B3 = (LinearLayout) findViewById(R.id.reporting_lin_wind_stamp);
        this.q3 = (LinearLayout) findViewById(R.id.reporting_li_compass);
        this.r3 = (LinearLayout) findViewById(R.id.reporting_li_logo);
        this.s3 = (LinearLayout) findViewById(R.id.reporting_li_rightView);
        this.t3 = (LinearLayout) findViewById(R.id.reporting_li_magnetic_field);
        this.u3 = (LinearLayout) findViewById(R.id.reporting_li_weather);
        this.v3 = (LinearLayout) findViewById(R.id.reporting_li_main_stamp_lay);
        this.w3 = (LinearLayout) findViewById(R.id.reporting_li_address);
        this.x3 = (LinearLayout) findViewById(R.id.reporting_li_stamp);
        this.y3 = (LinearLayout) findViewById(R.id.reporting_lin_waterma);
        this.z3 = (LinearLayout) findViewById(R.id.reporting_lin_waterma_2);
        this.G5 = (TextView) findViewById(R.id.report_lay);
        this.E5 = (LinearLayout) findViewById(R.id.ll_maplay);
        this.H5 = (TextView) findViewById(R.id.report_lay_2);
        this.F5 = (LinearLayout) findViewById(R.id.ll_maplay_2);
        this.A3 = (LinearLayout) findViewById(R.id.reporting_lin_pressure_stamp);
        this.C3 = (LinearLayout) findViewById(R.id.reporting_lin_humidity_stamp);
        this.D3 = (LinearLayout) findViewById(R.id.reporting_lin_bottom_wather);
        this.S = (ImageView) findViewById(R.id.img_compassNC);
        this.T = (ImageView) findViewById(R.id.img_compassNC_right);
        this.r2 = (TextView) findViewById(R.id.tv_degree);
        this.s2 = (TextView) findViewById(R.id.tv_degree_right);
        this.t2 = (TextView) findViewById(R.id.tvDirection);
        this.u2 = (TextView) findViewById(R.id.tvDirection_right);
        this.Z2 = (RelativeLayout) findViewById(R.id.li_stamp_nc);
        this.Y2 = (LinearLayout) findViewById(R.id.li_address_nc);
        this.q2 = (TextView) findViewById(R.id.tv_address_line_1_nc);
        this.R = (ImageView) findViewById(R.id.imgLogoNC);
        this.Q = (ImageView) findViewById(R.id.imgMapNC);
        this.G3 = (GridLayout) findViewById(R.id.grBottomStamp);
        this.E3 = (RelativeLayout) findViewById(R.id.relCompassLay);
        this.F3 = (RelativeLayout) findViewById(R.id.relCompassLayRight);
        this.X2 = (LinearLayout) findViewById(R.id.li_main_stamp_layNC);
        this.a3 = (LinearLayout) findViewById(R.id.lin_watermaNC);
        this.b3 = (LinearLayout) findViewById(R.id.lin_waterma_2NC);
        this.W8 = (LinearLayout) findViewById(R.id.relStampLay_claasic);
        this.X8 = (LinearLayout) findViewById(R.id.relStampLay_reporting);
        this.Y8 = (LinearLayout) findViewById(R.id.relStampLay_navigation);
        this.Z8 = (LinearLayout) findViewById(R.id.relStampLay_dateTime);
        this.a9 = (LinearLayout) findViewById(R.id.relStampLay_QR);
        this.V8 = (LinearLayout) findViewById(R.id.relStampLay);
        this.H = (ImageView) findViewById(R.id.imgMap);
        this.P = (ImageView) findViewById(R.id.imgMap_right);
        this.I = (ImageView) findViewById(R.id.imgLogo);
        this.J = (ImageView) findViewById(R.id.imgCompass);
        this.K = (ImageView) findViewById(R.id.imgWeather);
        this.L = (ImageView) findViewById(R.id.img_pressure_stamp);
        this.M = (ImageView) findViewById(R.id.img_wind_stamp);
        this.N = (ImageView) findViewById(R.id.imgMagneticField);
        this.O = (ImageView) findViewById(R.id.img_humidity_stamp);
        this.m0 = (TextView) findViewById(R.id.tv_address_line_1);
        this.n0 = (TextView) findViewById(R.id.tv_weather);
        this.o0 = (TextView) findViewById(R.id.txt_pressure);
        this.p0 = (TextView) findViewById(R.id.txt_humidity);
        this.q0 = (TextView) findViewById(R.id.txt_wind);
        this.r0 = (TextView) findViewById(R.id.tv_compass);
        this.s0 = (TextView) findViewById(R.id.tv_magnetic_field);
        this.J2 = (LinearLayout) findViewById(R.id.li_compass);
        this.K2 = (LinearLayout) findViewById(R.id.li_logo);
        this.L2 = (LinearLayout) findViewById(R.id.li_rightView);
        this.M2 = (LinearLayout) findViewById(R.id.li_magnetic_field);
        this.N2 = (LinearLayout) findViewById(R.id.li_weather);
        this.O2 = (LinearLayout) findViewById(R.id.li_main_stamp_lay);
        this.P2 = (LinearLayout) findViewById(R.id.li_address);
        this.Q2 = (LinearLayout) findViewById(R.id.li_stamp);
        this.R2 = (LinearLayout) findViewById(R.id.lin_waterma);
        this.S2 = (LinearLayout) findViewById(R.id.lin_waterma_2);
        this.T2 = (LinearLayout) findViewById(R.id.lin_pressure_stamp);
        this.U2 = (LinearLayout) findViewById(R.id.lin_wind_stamp);
        this.V2 = (LinearLayout) findViewById(R.id.lin_humidity_stamp);
        this.W2 = (LinearLayout) findViewById(R.id.lin_bottom_wather);
        this.t0 = (TextView) findViewById(R.id.dt_tv_address_line_1);
        this.u0 = (TextView) findViewById(R.id.dt_tv_weather);
        this.v0 = (TextView) findViewById(R.id.dt_tv_compass);
        this.w0 = (TextView) findViewById(R.id.dt_tv_altitude);
        this.x0 = (TextView) findViewById(R.id.dt_tvDate);
        this.y0 = (TextView) findViewById(R.id.dt_tvTime);
        this.z0 = (TextView) findViewById(R.id.dt_tvDay);
        this.A0 = (ImageView) findViewById(R.id.dt_imgMap);
        this.B0 = (ImageView) findViewById(R.id.dt_imgLogo);
        this.C0 = (ImageView) findViewById(R.id.dt_imgCompass);
        this.D0 = (ImageView) findViewById(R.id.dt_imgWeather);
        this.E0 = (ImageView) findViewById(R.id.dt_imgAltitude);
        this.F0 = (LinearLayout) findViewById(R.id.dt_li_stamp);
        this.G0 = (LinearLayout) findViewById(R.id.dt_li_logo);
        this.I0 = (LinearLayout) findViewById(R.id.dt_li_rightView);
        this.H0 = (LinearLayout) findViewById(R.id.dt_li_main_stamp_lay);
        this.J0 = (LinearLayout) findViewById(R.id.dt_li_weather);
        this.K0 = (LinearLayout) findViewById(R.id.dt_li_compass);
        this.L0 = (LinearLayout) findViewById(R.id.dt_li_altitude);
        this.M0 = (LinearLayout) findViewById(R.id.dt_li_watermak);
        this.N0 = (LinearLayout) findViewById(R.id.dt_li_watermak_2);
        this.O0 = (TextView) findViewById(R.id.dt_txt_watermark);
        this.P0 = (TextView) findViewById(R.id.dt_txt_watermark_2);
        this.Q0 = (ImageView) findViewById(R.id.dt_img_stamp);
        this.R0 = (ImageView) findViewById(R.id.dt_img_stamp_2);
        this.H1 = (TextView) findViewById(R.id.tv_address_line_1_qr);
        this.I1 = (ImageView) findViewById(R.id.imgMapQR);
        this.J1 = (ImageView) findViewById(R.id.imgMap_rightQR);
        this.K1 = (ImageView) findViewById(R.id.imgQR);
        this.L1 = (ImageView) findViewById(R.id.imgQR2);
        this.M1 = (LinearLayout) findViewById(R.id.li_stampQR);
        this.N1 = (LinearLayout) findViewById(R.id.li_main_stamp_layQR);
        this.O1 = (RelativeLayout) findViewById(R.id.relQrLay);
        this.P1 = (RelativeLayout) findViewById(R.id.relQrLay2);
        this.Q1 = (RelativeLayout) findViewById(R.id.relMapLay);
        this.R1 = (RelativeLayout) findViewById(R.id.relMapLay2);
        this.S1 = (RelativeLayout) findViewById(R.id.mainWatermarkQR);
        this.T1 = (RelativeLayout) findViewById(R.id.mainWatermark_2QR);
        this.q9 = (MaterialCardView) findViewById(R.id.card_view_home_ads);
        this.r9 = (FrameLayout) findViewById(R.id.nativeadframe);
        this.c9.setText(getString(R.string.template));
        this.T8.setInteger(this, HelperClass.TEMPLT_OPEN_TIME, this.T8.getInteger(this, HelperClass.TEMPLT_OPEN_TIME, 0) + 1);
        int integer = this.T8.getInteger(this, SP.TEMPLATE_TYPE, 0);
        this.w8 = integer;
        if (integer == 1) {
            this.g9.setTextColor(Color.parseColor("#FF7700"));
            this.W8.setBackgroundResource(R.drawable.corner_radius_all_template);
            boolean z = this.l9;
            LinearLayout linearLayout = this.V8;
            if (z) {
                linearLayout.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                this.k9.setTextColor(getColor(R.color.app_text_main_dark));
            } else {
                linearLayout.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.f9.setTextColor(getColor(R.color.app_text_main_light));
                this.h9.setTextColor(getColor(R.color.app_text_main_light));
                this.i9.setTextColor(getColor(R.color.app_text_main_light));
                this.j9.setTextColor(getColor(R.color.app_text_main_light));
                this.k9.setTextColor(getColor(R.color.app_text_main_light));
            }
            this.W8.setPadding(HelperClass.dpToPx(this, 4), 0, 0, this.W8.getPaddingBottom());
            this.B.setVisibility(8);
            this.D.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.C.setVisibility(0);
        } else if (integer == 0) {
            this.f9.setTextColor(Color.parseColor("#FF7700"));
            this.V8.setBackgroundResource(R.drawable.corner_radius_all_template);
            boolean z2 = this.l9;
            LinearLayout linearLayout2 = this.W8;
            if (z2) {
                linearLayout2.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                this.k9.setTextColor(getColor(R.color.app_text_main_dark));
            } else {
                linearLayout2.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.g9.setTextColor(getColor(R.color.app_text_main_light));
                this.h9.setTextColor(getColor(R.color.app_text_main_light));
                this.i9.setTextColor(getColor(R.color.app_text_main_light));
                this.j9.setTextColor(getColor(R.color.app_text_main_light));
                this.k9.setTextColor(getColor(R.color.app_text_main_light));
            }
            LinearLayout linearLayout3 = this.W8;
            linearLayout3.setPadding(0, 0, 0, linearLayout3.getPaddingBottom());
            this.B.setVisibility(0);
            this.C.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.D.setVisibility(8);
            this.G.setVisibility(8);
        } else if (integer == 2) {
            this.h9.setTextColor(Color.parseColor("#FF7700"));
            this.X8.setBackgroundResource(R.drawable.corner_radius_all_template);
            boolean z3 = this.l9;
            LinearLayout linearLayout4 = this.W8;
            if (z3) {
                linearLayout4.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                this.k9.setTextColor(getColor(R.color.app_text_main_dark));
            } else {
                linearLayout4.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.f9.setTextColor(getColor(R.color.app_text_main_light));
                this.g9.setTextColor(getColor(R.color.app_text_main_light));
                this.i9.setTextColor(getColor(R.color.app_text_main_light));
                this.j9.setTextColor(getColor(R.color.app_text_main_light));
                this.k9.setTextColor(getColor(R.color.app_text_main_light));
            }
            LinearLayout linearLayout5 = this.W8;
            linearLayout5.setPadding(0, 0, 0, linearLayout5.getPaddingBottom());
            this.D.setVisibility(0);
            this.C.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.B.setVisibility(8);
            this.G.setVisibility(8);
        } else if (integer == 3) {
            this.i9.setTextColor(Color.parseColor("#FF7700"));
            this.Y8.setBackgroundResource(R.drawable.corner_radius_all_template);
            boolean z4 = this.l9;
            LinearLayout linearLayout6 = this.W8;
            if (z4) {
                linearLayout6.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                this.j9.setTextColor(getColor(R.color.app_text_main_dark));
                this.k9.setTextColor(getColor(R.color.app_text_main_dark));
            } else {
                linearLayout6.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.f9.setTextColor(getColor(R.color.app_text_main_light));
                this.g9.setTextColor(getColor(R.color.app_text_main_light));
                this.h9.setTextColor(getColor(R.color.app_text_main_light));
                this.j9.setTextColor(getColor(R.color.app_text_main_light));
                this.k9.setTextColor(getColor(R.color.app_text_main_light));
            }
            LinearLayout linearLayout7 = this.W8;
            linearLayout7.setPadding(0, 0, 0, linearLayout7.getPaddingBottom());
            this.D.setVisibility(8);
            this.E.setVisibility(0);
            this.C.setVisibility(8);
            this.F.setVisibility(8);
            this.B.setVisibility(8);
            this.G.setVisibility(8);
        } else if (integer == 4) {
            this.j9.setTextColor(Color.parseColor("#FF7700"));
            this.Z8.setBackgroundResource(R.drawable.corner_radius_all_template);
            boolean z5 = this.l9;
            LinearLayout linearLayout8 = this.W8;
            if (z5) {
                linearLayout8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                this.k9.setTextColor(getColor(R.color.app_text_main_dark));
            } else {
                linearLayout8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.a9.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.f9.setTextColor(getColor(R.color.app_text_main_light));
                this.g9.setTextColor(getColor(R.color.app_text_main_light));
                this.h9.setTextColor(getColor(R.color.app_text_main_light));
                this.i9.setTextColor(getColor(R.color.app_text_main_light));
                this.k9.setTextColor(getColor(R.color.app_text_main_light));
            }
            LinearLayout linearLayout9 = this.W8;
            linearLayout9.setPadding(0, 0, 0, linearLayout9.getPaddingBottom());
            this.D.setVisibility(8);
            this.E.setVisibility(8);
            this.C.setVisibility(8);
            this.F.setVisibility(0);
            this.B.setVisibility(8);
            this.G.setVisibility(8);
        } else {
            this.k9.setTextColor(Color.parseColor("#FF7700"));
            this.a9.setBackgroundResource(R.drawable.corner_radius_all_template);
            boolean z6 = this.l9;
            LinearLayout linearLayout10 = this.W8;
            if (z6) {
                linearLayout10.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_dark));
                this.f9.setTextColor(getColor(R.color.app_text_main_dark));
                this.g9.setTextColor(getColor(R.color.app_text_main_dark));
                this.h9.setTextColor(getColor(R.color.app_text_main_dark));
                this.i9.setTextColor(getColor(R.color.app_text_main_dark));
                this.j9.setTextColor(getColor(R.color.app_text_main_dark));
            } else {
                linearLayout10.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.V8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.X8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Y8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.Z8.setBackgroundColor(getColor(R.color.template_sel_bg_light));
                this.f9.setTextColor(getColor(R.color.app_text_main_light));
                this.g9.setTextColor(getColor(R.color.app_text_main_light));
                this.h9.setTextColor(getColor(R.color.app_text_main_light));
                this.i9.setTextColor(getColor(R.color.app_text_main_light));
                this.j9.setTextColor(getColor(R.color.app_text_main_light));
            }
            LinearLayout linearLayout11 = this.W8;
            linearLayout11.setPadding(0, 0, 0, linearLayout11.getPaddingBottom());
            this.D.setVisibility(8);
            this.E.setVisibility(8);
            this.C.setVisibility(8);
            this.G.setVisibility(0);
            this.B.setVisibility(8);
            this.F.setVisibility(8);
        }
        this.d9.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.D.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.F.setOnClickListener(this);
        this.G.setOnClickListener(this);
        this.V8.setOnClickListener(this);
        this.W8.setOnClickListener(this);
        this.X8.setOnClickListener(this);
        this.Y8.setOnClickListener(this);
        this.Z8.setOnClickListener(this);
        this.a9.setOnClickListener(this);
        k().a(this, new n8(this, 29));
        this.b9 = new Admob();
        View viewFindViewById = findViewById(R.id.homeLayout);
        z55 z55Var = new z55(20, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, z55Var);
        boolean z7 = this.l9;
        ImageView imageView = this.B;
        if (z7) {
            imageView.setImageResource(2131232040);
            this.C.setImageResource(2131232040);
            this.D.setImageResource(2131232040);
            this.E.setImageResource(2131232040);
            this.F.setImageResource(2131232040);
            this.G.setImageResource(2131232040);
            return;
        }
        imageView.setImageResource(2131232041);
        this.C.setImageResource(2131232041);
        this.D.setImageResource(2131232041);
        this.E.setImageResource(2131232041);
        this.F.setImageResource(2131232041);
        this.G.setImageResource(2131232041);
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.b9;
        if (admob != null) {
            admob.DestroyAd();
        }
        kx0 kx0Var = this.o9;
        if (kx0Var != null) {
            kx0Var.c();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        super.onPause();
        kx0 kx0Var = this.o9;
        if (kx0Var != null) {
            kx0Var.c();
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        LinearLayout.LayoutParams layoutParams;
        String string;
        super.onResume();
        if (AllAdsApproval.iSTemplateSelectionBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                int i2 = RemoteAdData.TEMPLATE_SELECTION_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    w();
                } else if (i2 == 2) {
                    x();
                }
            } else if (i == 1) {
                w();
            } else if (i == 2) {
                x();
            }
        }
        boolean z = this.T8.getBoolean(this, SP.IS_QRT_SELECT, false);
        ImageView imageView = this.m9;
        if (z) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        L();
        M();
        N();
        kx0 kx0Var = this.o9;
        if (kx0Var == null) {
            kx0Var = new kx0(this);
            this.o9 = kx0Var;
            kx0Var.a = new e65(10, this);
        }
        if (!kx0Var.a()) {
            ImageView imageView2 = (ImageView) findViewById(R.id.img_compassNC);
            ImageView imageView3 = (ImageView) findViewById(R.id.img_compassNC_right);
            ImageView imageView4 = (ImageView) findViewById(R.id.img_hands);
            ImageView imageView5 = (ImageView) findViewById(R.id.img_hands_right);
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                imageView2.setVisibility(8);
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
            }
            RelativeLayout relativeLayout = this.E3;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = this.F3;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        this.o9.b();
        F();
        z();
        this.i2 = this.T8.getInteger(this, SP.BACKGROUND_COLOR_QR, Color.parseColor("#9c000000"));
        this.e2 = this.T8.getInteger(this, SP.ADDRESS_COLOR_QR, -1);
        this.d2 = this.T8.getInteger(this, SP.SHORT_ADDRESS_COLOR_QR, -1);
        this.g2 = this.T8.getInteger(this, SP.DATE_TIME_COLOR_QR, -1);
        this.f2 = this.T8.getInteger(this, SP.LAT_LNG_COLOR_QR, -1);
        this.h2 = this.T8.getInteger(this, SP.NOTES_HASHTAG_COLOR_QR, -1);
        this.U1 = this.T8.getBoolean(this, SP.IS_MAP_QR, true);
        this.W1 = this.T8.getBoolean(this, SP.IS_COUNTRY_FLAG_QR, true);
        this.V1 = this.T8.getBoolean(this, SP.IS_ADDRESS_QR, true);
        this.Z1 = this.T8.getBoolean(this, SP.IS_ADDRESS_CITY_QR, true);
        this.a2 = this.T8.getBoolean(this, SP.IS_ADDRESS_STATE_QR, true);
        this.b2 = this.T8.getBoolean(this, SP.IS_ADDRESS_COUNTRY_QR, true);
        this.c2 = this.T8.getBoolean(this, SP.IS_ADDRESS_PINCODE_QR, true);
        this.X1 = this.T8.getBoolean(this, SP.IS_DATE_TIME_QR, true);
        this.Y1 = this.T8.getBoolean(this, SP.IS_NOTES_QR, true);
        this.l2 = this.T8.getString(this, SP.NOTES_HASHTAG_QR, Default.notes);
        this.m2 = this.T8.getString(this, SP.STAMP_FONT_STYLE_QR, Default.DEFAULT_FONT_STYLE);
        this.j2 = this.T8.getString(this, SP.DATE_FORMAT_QR, Default.DEFAULT_DATE_FORMAT);
        this.o2 = this.T8.getInteger(this, SP.LAT_LNG_TYPE_QR, 1);
        this.k2 = this.T8.getString(this, SP.MAP_TYPE_TEMPLATE_QR, Default.SETELLITE_2);
        this.p2 = this.T8.getInteger(this, SP.MAP_POS_TYPE_QR, 0);
        this.T8.getString(this, SP.STAMP_POS_QR, "Bottom");
        SP sp = this.T8;
        String str = jumTrYZsYnyZCd.xcCMhz;
        this.n2 = sp.getString(this, SP.STAMP_SIZE_QR, str);
        new LinearLayout.LayoutParams(-1, -2);
        if (this.n2.equals("Large")) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_110));
        } else if (this.n2.equals(str)) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_100), (int) getResources().getDimension(R.dimen.stamp_icon_size_100));
        } else {
            layoutParams = this.n2.equals("Small") ? new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_90), (int) getResources().getDimension(R.dimen.stamp_icon_size_90)) : new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_80), (int) getResources().getDimension(R.dimen.stamp_icon_size_80));
        }
        if (this.U1) {
            int i3 = this.p2;
            RelativeLayout relativeLayout3 = this.Q1;
            if (i3 == 0) {
                relativeLayout3.setVisibility(0);
                this.O1.setVisibility(0);
                this.R1.setVisibility(8);
                this.P1.setVisibility(8);
                this.O1.setLayoutParams(layoutParams);
                this.Q1.setLayoutParams(layoutParams);
            } else {
                relativeLayout3.setVisibility(8);
                this.O1.setVisibility(8);
                this.R1.setVisibility(0);
                this.P1.setVisibility(0);
                this.P1.setLayoutParams(layoutParams);
                this.R1.setLayoutParams(layoutParams);
            }
        } else {
            this.Q1.setVisibility(8);
            this.R1.setVisibility(8);
            int i4 = this.p2;
            RelativeLayout relativeLayout4 = this.O1;
            if (i4 == 0) {
                relativeLayout4.setVisibility(0);
                this.P1.setVisibility(8);
                this.O1.setLayoutParams(layoutParams);
            } else {
                relativeLayout4.setVisibility(8);
                this.P1.setVisibility(0);
                this.P1.setLayoutParams(layoutParams);
            }
        }
        this.M1.getLayoutParams().height = layoutParams.height;
        String string2 = this.T8.getString(this, SP.LATITUDE, "0.0");
        String string3 = this.T8.getString(this, SP.LONGITUDE, "0.0");
        if (!string2.isEmpty() && !string3.isEmpty()) {
            utils utilsVar = new utils();
            Bitmap bitmapGenerateMapQr = utilsVar.generateMapQr(utilsVar.getMapLink(Double.parseDouble(string2), Double.parseDouble(string3)));
            this.K1.setImageBitmap(bitmapGenerateMapQr);
            this.L1.setImageBitmap(bitmapGenerateMapQr);
        }
        this.N1.setVisibility(0);
        this.H1.setVisibility(0);
        this.M1.setVisibility(0);
        this.S1.setVisibility(8);
        this.T1.setVisibility(8);
        this.M1.setBackground(getDrawable(R.drawable.rect_grey));
        ((GradientDrawable) this.M1.getBackground().getCurrent()).setColor(this.i2);
        String str2 = this.k2;
        str2.getClass();
        switch (str2) {
            case "satellite":
                this.I1.setImageResource(R.drawable.maptype_satellite);
                this.J1.setImageResource(R.drawable.maptype_satellite);
                break;
            case "terrain":
                this.I1.setImageResource(R.drawable.maptype_terrain);
                this.J1.setImageResource(R.drawable.maptype_terrain);
                break;
            case "hybrid":
                this.I1.setImageResource(R.drawable.maptype_hybrid);
                this.J1.setImageResource(R.drawable.maptype_hybrid);
                break;
            case "roadmap":
                this.I1.setImageResource(R.drawable.maptype_normal);
                this.J1.setImageResource(R.drawable.maptype_normal);
                break;
        }
        String strTrim = this.T8.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.T8.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.T8.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.T8.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.T8.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strConcat = (strTrim2 == null || strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (strTrim3 != null && !strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (strTrim4 != null && !strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (this.W1 && (string = this.T8.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (this.Z1) {
            strTrim = strTrim.isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        boolean z2 = this.a2;
        boolean z3 = this.c2;
        if (z2) {
            if (z3) {
                strTrim3 = strTrim.isEmpty() ? eo7.j(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (z3) {
            strTrim3 = strTrim.isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!this.b2) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.isEmpty()) {
            strTrim4 = "Loading...";
        }
        String strS = strTrim4.isEmpty() ? "" : s(this.e2, eo7.x("<strong>", strTrim4, "</strong>"));
        String strS2 = s(this.f2, this.U8.getLatLong(this, this.o2));
        Log.e("latLong111 : ", strS2);
        int i5 = this.o2;
        if (i5 != 6 && i5 != 7 && strS2.length() > 55 && this.U1) {
            String[] strArrSplit = strS2.split(" Long");
            strS2 = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        if (this.V1) {
            strS2 = eo7.x(strS, "<br/>", strS2);
        }
        if (this.X1) {
            strS2 = eo7.x(strS2, "<br/>", s(this.g2, HelperClass.setDateTimeFormat(this, this.j2)));
        }
        if (this.Y1) {
            strS2 = eo7.x(strS2, "<br/>", s(this.h2, this.l2));
        }
        if (strS2.contains("null")) {
            strS2 = strS2.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.H1.setText(Html.fromHtml(strS2));
        } else {
            SpannableString spannableString = new SpannableString(strConcat);
            spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(this.d2), 0, strConcat.length(), 0);
            Html.fromHtml("<br/>" + strS2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strS2));
            this.H1.setText(spannableStringBuilder);
        }
        this.H1.setTypeface(HelperClass.getFontStyle(this, this.m2));
    }

    public final void u() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new h94(16, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ge4(16, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void w() {
        List listAsList = Arrays.asList(lm4.a);
        String str = RemoteAdData.TEMPLATE_SELECTION_SCREEN_NATIVE_ID;
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new j64(18, this));
    }

    public final void x() {
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
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new ws3(22, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    public final void z() {
        LinearLayout.LayoutParams layoutParams;
        int i;
        int i2;
        this.r8 = getResources().obtainTypedArray(R.array.wI);
        this.t1 = this.T8.getInteger(this, uBHp.NIZVeQoU, Color.parseColor("#9c000000"));
        this.k1 = this.T8.getInteger(this, SP.ADDRESS_COLOR_DT, -1);
        this.j1 = this.T8.getInteger(this, SP.SHORT_ADDRESS_COLOR_DT, -1);
        this.m1 = this.T8.getInteger(this, SP.DATE_TIME_COLOR_DT, -1);
        this.l1 = this.T8.getInteger(this, SP.LAT_LNG_COLOR_DT, -1);
        this.q1 = this.T8.getInteger(this, SP.WEATHER_COLOR_DT, -1);
        this.r1 = this.T8.getInteger(this, SP.COMPASS_COLOR_DT, -1);
        this.n1 = this.T8.getInteger(this, SP.NOTES_HASHTAG_COLOR_DT, -1);
        this.p1 = this.T8.getInteger(this, SP.PERSON_NAME_COLOR_DT, -1);
        this.o1 = this.T8.getInteger(this, SP.CONTACT_NUMBER_COLOR_DT, -1);
        this.s1 = this.T8.getInteger(this, SP.ALTITUDE_COLOR_DT, -1);
        this.u1 = this.T8.getString(this, SP.PERSON_NAME_DT, "-");
        this.v1 = this.T8.getString(this, SP.CONTACT_NUMBER_DT, Default.contactNumber);
        this.S0 = this.T8.getBoolean(this, SP.IS_MAP_DT, false);
        this.W0 = this.T8.getBoolean(this, SP.IS_COUNTRY_FLAG_DT, true);
        this.T0 = this.T8.getBoolean(this, SP.IS_ADDRESS_DT, true);
        this.f1 = this.T8.getBoolean(this, SP.IS_ADDRESS_CITY_DT, true);
        this.g1 = this.T8.getBoolean(this, SP.IS_ADDRESS_STATE_DT, true);
        this.i1 = this.T8.getBoolean(this, SP.IS_ADDRESS_PINCODE_DT, true);
        this.h1 = this.T8.getBoolean(this, SP.IS_ADDRESS_COUNTRY_DT, true);
        this.Y0 = this.T8.getBoolean(this, SP.IS_WEATHER_DT, false);
        this.e1 = this.T8.getBoolean(this, SP.IS_PERSON_NAME_DT, false);
        this.X0 = this.T8.getBoolean(this, SP.IS_CONTACT_NUMBER_DT, false);
        this.a1 = this.T8.getBoolean(this, SP.IS_COMPASS_DT, false);
        this.b1 = this.T8.getBoolean(this, SP.IS_LOGO_DT, false);
        this.c1 = this.T8.getBoolean(this, SP.IS_NOTES_DT, true);
        this.d1 = this.T8.getBoolean(this, SP.IS_ALTITUDE_DT, false);
        this.z1 = this.T8.getString(this, SP.LOGO_URI_DT, Default.LOGO_uri);
        this.A1 = this.T8.getString(this, SP.NOTES_HASHTAG_DT, Default.notes);
        this.B1 = this.T8.getString(this, SP.STAMP_FONT_STYLE_DT, Default.DEFAULT_FONT_STYLE_DT);
        this.w1 = this.T8.getString(this, SP.DATE_FORMAT_DT, Default.DEFAULT_DATE_FORMAT_DT);
        this.D1 = this.T8.getString(this, SP.TIME_FORMAT_DT, Default.DEFAULT_TIME_FORMAT_DT);
        this.E1 = this.T8.getInteger(this, SP.LAT_LNG_TYPE_DT, 1);
        this.x1 = this.T8.getString(this, SP.TEMPRATURE_TYPE_DT, vVvojdym.CQM);
        this.F1 = this.T8.getInteger(this, SP.WEATHER_ICON, 0);
        this.y1 = this.T8.getString(this, SP.MAP_TYPE_TEMPLATE_DT, Default.SETELLITE_2);
        this.T8.getInteger(this, SP.MAP_ZOOM_SCALE_DT, 78);
        this.T8.getInteger(this, SP.MAP_POS_DT, 1);
        this.T8.getString(this, SP.STAMP_POS_DT, "Bottom");
        this.C1 = this.T8.getString(this, SP.STAMP_SIZE_DT, Default.TEMPLATE_SIZE);
        this.G1 = this.T8.getInteger(this, SP.ALTITUDE_SELECT_DT, 0);
        HelperClass.isTablet(this);
        if (this.C1.equals("Small") || this.C1.equals(Default.TEMPLATE_SIZE)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.Q0.getLayoutParams();
            layoutParams2.height = HelperClass.dpToPx(this, 20);
            layoutParams2.width = HelperClass.dpToPx(this, 20);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.R0.getLayoutParams();
            layoutParams3.height = HelperClass.dpToPx(this, 20);
            layoutParams3.width = HelperClass.dpToPx(this, 20);
            this.O0.setTextSize(7.0f);
            this.P0.setTextSize(7.0f);
        } else {
            boolean zEquals = this.C1.equals("Extra Small");
            ImageView imageView = this.Q0;
            if (zEquals) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams4.height = HelperClass.dpToPx(this, 14);
                layoutParams4.width = HelperClass.dpToPx(this, 14);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.R0.getLayoutParams();
                layoutParams5.height = HelperClass.dpToPx(this, 14);
                layoutParams5.width = HelperClass.dpToPx(this, 14);
                this.O0.setTextSize(5.0f);
                this.P0.setTextSize(5.0f);
            } else {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams6.height = HelperClass.dpToPx(this, 24);
                layoutParams6.width = HelperClass.dpToPx(this, 24);
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) this.R0.getLayoutParams();
                layoutParams7.height = HelperClass.dpToPx(this, 24);
                layoutParams7.width = HelperClass.dpToPx(this, 24);
                this.O0.setTextSize(9.0f);
                this.P0.setTextSize(9.0f);
            }
        }
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (this.C1.equals("Large")) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_120), (int) getResources().getDimension(R.dimen.stamp_icon_size_110));
        } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_90));
        } else {
            layoutParams = this.C1.equals("Small") ? new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_100), (int) getResources().getDimension(R.dimen.stamp_icon_size_80)) : new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_90), (int) getResources().getDimension(R.dimen.stamp_icon_size_70));
        }
        boolean z = this.S0;
        ImageView imageView2 = this.A0;
        if (z) {
            imageView2.setVisibility(0);
            layoutParams8.setMargins(0, 0, 0, 0);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 80;
        } else {
            imageView2.setVisibility(8);
            layoutParams8.setMargins(0, 0, 0, 0);
        }
        this.F0.setLayoutParams(layoutParams8);
        if (this.Y0 || this.d1 || this.a1) {
            this.I0.setVisibility(0);
            boolean z2 = this.Y0;
            LinearLayout linearLayout = this.J0;
            if (z2) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
            boolean z3 = this.d1;
            LinearLayout linearLayout2 = this.L0;
            if (z3) {
                linearLayout2.setVisibility(0);
                this.w0.setText(HelperClass.getAltitudeconvert(this, this.G1));
                this.E0.setImageResource(R.drawable.ic_altitiude);
                this.w0.setTextColor(this.s1);
            } else {
                linearLayout2.setVisibility(8);
            }
            boolean z4 = this.a1;
            LinearLayout linearLayout3 = this.K0;
            if (z4) {
                linearLayout3.setVisibility(0);
            } else {
                linearLayout3.setVisibility(8);
            }
        } else {
            this.I0.setVisibility(8);
        }
        boolean z5 = this.b1;
        LinearLayout linearLayout4 = this.G0;
        if (z5) {
            linearLayout4.setVisibility(0);
        } else {
            linearLayout4.setVisibility(8);
        }
        if (this.C1.equals(Default.TEMPLATE_SIZE)) {
            this.B0.getLayoutParams().height = HelperClass.dpToPx(this, 40);
            this.B0.getLayoutParams().width = HelperClass.dpToPx(this, 58);
            this.D0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.D0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.C0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.C0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.E0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.E0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.u0.setTextSize(8.0f);
            this.v0.setTextSize(8.0f);
            this.w0.setTextSize(8.0f);
        } else if (this.C1.equals("Small")) {
            this.B0.getLayoutParams().height = HelperClass.dpToPx(this, 38);
            this.B0.getLayoutParams().width = HelperClass.dpToPx(this, 54);
            this.D0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.D0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.C0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.C0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.E0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.E0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.u0.setTextSize(7.0f);
            this.v0.setTextSize(7.0f);
            this.w0.setTextSize(7.0f);
        } else {
            boolean zEquals2 = this.C1.equals("Extra Small");
            ImageView imageView3 = this.B0;
            if (zEquals2) {
                imageView3.getLayoutParams().height = HelperClass.dpToPx(this, 36);
                this.B0.getLayoutParams().width = HelperClass.dpToPx(this, 50);
                this.D0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.D0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.C0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.C0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.E0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.E0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.u0.setTextSize(6.0f);
                this.v0.setTextSize(6.0f);
                this.w0.setTextSize(6.0f);
            } else {
                imageView3.getLayoutParams().height = HelperClass.dpToPx(this, 42);
                this.B0.getLayoutParams().width = HelperClass.dpToPx(this, 62);
                this.D0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.D0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.C0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.C0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.E0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.E0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.u0.setTextSize(10.0f);
                this.v0.setTextSize(10.0f);
                this.w0.setTextSize(10.0f);
            }
        }
        boolean z6 = this.S0;
        boolean z7 = this.T0;
        boolean z8 = this.V0;
        ?? r13 = this.U0;
        int i3 = r13;
        int i4 = r13;
        if (z6) {
            if (z7) {
                i2 = r13 + 1;
            }
            if (z8) {
                i3 = i2;
                i3++;
            }
            i3 = i2;
            int i5 = i3;
            if (this.c1) {
                i5 = i3 + 1;
            }
            int i6 = i5;
            if (this.e1) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (this.X0) {
                i7 = i6 + 1;
            }
            int iDpToPx = HelperClass.dpToPx(this, 60);
            int iDpToPx2 = HelperClass.dpToPx(this, 65);
            int iDpToPx3 = HelperClass.dpToPx(this, 70);
            int iDpToPx4 = HelperClass.dpToPx(this, 75);
            int iDpToPx5 = HelperClass.dpToPx(this, 80);
            int iDpToPx6 = HelperClass.dpToPx(this, 85);
            int iDpToPx7 = HelperClass.dpToPx(this, 90);
            int iDpToPx8 = HelperClass.dpToPx(this, 95);
            int iDpToPx9 = HelperClass.dpToPx(this, 100);
            int iDpToPx10 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx11 = HelperClass.dpToPx(this, fh.k1);
            int iDpToPx12 = HelperClass.dpToPx(this, 115);
            int iDpToPx13 = HelperClass.dpToPx(this, 120);
            int iDpToPx14 = HelperClass.dpToPx(this, 125);
            int iDpToPx15 = HelperClass.dpToPx(this, 130);
            int iDpToPx16 = HelperClass.dpToPx(this, 135);
            int iDpToPx17 = HelperClass.dpToPx(this, 140);
            int iDpToPx18 = HelperClass.dpToPx(this, 145);
            int iDpToPx19 = HelperClass.dpToPx(this, 150);
            int iDpToPx20 = HelperClass.dpToPx(this, 155);
            int iDpToPx21 = HelperClass.dpToPx(this, 160);
            int iDpToPx22 = HelperClass.dpToPx(this, 165);
            int iDpToPx23 = HelperClass.dpToPx(this, 170);
            int iDpToPx24 = HelperClass.dpToPx(this, 175);
            int iDpToPx25 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
            int iDpToPx26 = HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
            HelperClass.dpToPx(this, 190);
            if (i7 == 2) {
                if (this.Y0 || this.a1 || this.d1) {
                    System.out.println("DateTimeStampLayoutPosSize            1             " + this.C1);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx16;
                        this.A0.getLayoutParams().height = iDpToPx7;
                        this.A0.getLayoutParams().width = iDpToPx7;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx14;
                        this.A0.getLayoutParams().height = iDpToPx5;
                        this.A0.getLayoutParams().width = iDpToPx5;
                    } else {
                        boolean zEquals3 = this.C1.equals("Small");
                        LinearLayout linearLayout5 = this.F0;
                        if (zEquals3) {
                            linearLayout5.getLayoutParams().height = iDpToPx12;
                            this.A0.getLayoutParams().height = iDpToPx3;
                            this.A0.getLayoutParams().width = iDpToPx3;
                        } else {
                            linearLayout5.getLayoutParams().height = iDpToPx10;
                            this.A0.getLayoutParams().height = iDpToPx;
                            this.A0.getLayoutParams().width = iDpToPx;
                        }
                    }
                } else {
                    System.out.println(XIBrjfXRiD.RkfopC + this.C1);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx17;
                        this.A0.getLayoutParams().height = iDpToPx7;
                        this.A0.getLayoutParams().width = iDpToPx7;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx15;
                        this.A0.getLayoutParams().height = iDpToPx6;
                        this.A0.getLayoutParams().width = iDpToPx6;
                    } else {
                        boolean zEquals4 = this.C1.equals("Small");
                        LinearLayout linearLayout6 = this.F0;
                        if (zEquals4) {
                            linearLayout6.getLayoutParams().height = iDpToPx13;
                            this.A0.getLayoutParams().height = iDpToPx4;
                            this.A0.getLayoutParams().width = iDpToPx4;
                        } else {
                            linearLayout6.getLayoutParams().height = iDpToPx11;
                            this.A0.getLayoutParams().height = iDpToPx2;
                            this.A0.getLayoutParams().width = iDpToPx2;
                        }
                    }
                }
            } else if (i7 == 3) {
                if (this.Y0 || this.a1 || this.d1) {
                    System.out.println("DateTimeStampLayoutPosSize            3             " + this.C1);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx18;
                        this.A0.getLayoutParams().height = iDpToPx9;
                        this.A0.getLayoutParams().width = iDpToPx9;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx16;
                        this.A0.getLayoutParams().height = iDpToPx7;
                        this.A0.getLayoutParams().width = iDpToPx7;
                    } else {
                        boolean zEquals5 = this.C1.equals("Small");
                        LinearLayout linearLayout7 = this.F0;
                        if (zEquals5) {
                            linearLayout7.getLayoutParams().height = iDpToPx14;
                            this.A0.getLayoutParams().height = iDpToPx5;
                            this.A0.getLayoutParams().width = iDpToPx5;
                        } else {
                            linearLayout7.getLayoutParams().height = iDpToPx12;
                            this.A0.getLayoutParams().height = iDpToPx3;
                            this.A0.getLayoutParams().width = iDpToPx3;
                        }
                    }
                } else {
                    boolean z9 = this.T0;
                    String str = this.C1;
                    if (z9) {
                        System.out.println("DateTimeStampLayoutPosSize            4             " + str);
                        if (this.C1.equals("Large")) {
                            this.F0.getLayoutParams().height = iDpToPx19;
                            this.A0.getLayoutParams().height = iDpToPx9;
                            this.A0.getLayoutParams().width = iDpToPx9;
                        } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                            this.F0.getLayoutParams().height = iDpToPx17;
                            this.A0.getLayoutParams().height = iDpToPx7;
                            this.A0.getLayoutParams().width = iDpToPx7;
                        } else {
                            boolean zEquals6 = this.C1.equals("Small");
                            LinearLayout linearLayout8 = this.F0;
                            if (zEquals6) {
                                linearLayout8.getLayoutParams().height = iDpToPx15;
                                this.A0.getLayoutParams().height = iDpToPx5;
                                this.A0.getLayoutParams().width = iDpToPx5;
                            } else {
                                linearLayout8.getLayoutParams().height = iDpToPx13;
                                this.A0.getLayoutParams().height = iDpToPx3;
                                this.A0.getLayoutParams().width = iDpToPx3;
                            }
                        }
                    } else {
                        System.out.println("DateTimeStampLayoutPosSize            5             " + str);
                        if (this.C1.equals("Large")) {
                            this.F0.getLayoutParams().height = iDpToPx20;
                            this.A0.getLayoutParams().height = iDpToPx10;
                            this.A0.getLayoutParams().width = iDpToPx10;
                        } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                            this.F0.getLayoutParams().height = iDpToPx18;
                            this.A0.getLayoutParams().height = iDpToPx8;
                            this.A0.getLayoutParams().width = iDpToPx8;
                        } else {
                            boolean zEquals7 = this.C1.equals("Small");
                            LinearLayout linearLayout9 = this.F0;
                            if (zEquals7) {
                                linearLayout9.getLayoutParams().height = iDpToPx16;
                                this.A0.getLayoutParams().height = iDpToPx6;
                                this.A0.getLayoutParams().width = iDpToPx6;
                            } else {
                                linearLayout9.getLayoutParams().height = iDpToPx14;
                                this.A0.getLayoutParams().height = iDpToPx4;
                                this.A0.getLayoutParams().width = iDpToPx4;
                            }
                        }
                    }
                }
            } else if (i7 != 4) {
                String str2 = this.C1;
                if (i7 == 5) {
                    System.out.println("DateTimeStampLayoutPosSize            9             " + str2);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx24;
                        this.A0.getLayoutParams().height = iDpToPx14;
                        this.A0.getLayoutParams().width = iDpToPx14;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx22;
                        this.A0.getLayoutParams().height = iDpToPx12;
                        this.A0.getLayoutParams().width = iDpToPx12;
                    } else {
                        boolean zEquals8 = this.C1.equals("Small");
                        LinearLayout linearLayout10 = this.F0;
                        if (zEquals8) {
                            linearLayout10.getLayoutParams().height = iDpToPx20;
                            this.A0.getLayoutParams().height = iDpToPx10;
                            this.A0.getLayoutParams().width = iDpToPx10;
                        } else {
                            linearLayout10.getLayoutParams().height = iDpToPx18;
                            this.A0.getLayoutParams().height = iDpToPx8;
                            this.A0.getLayoutParams().width = iDpToPx8;
                        }
                    }
                } else if (i7 == 6) {
                    System.out.println("DateTimeStampLayoutPosSize            10            " + str2);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx25;
                        this.A0.getLayoutParams().height = iDpToPx15;
                        this.A0.getLayoutParams().width = iDpToPx15;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx23;
                        this.A0.getLayoutParams().height = iDpToPx13;
                        this.A0.getLayoutParams().width = iDpToPx13;
                    } else {
                        boolean zEquals9 = this.C1.equals("Small");
                        LinearLayout linearLayout11 = this.F0;
                        if (zEquals9) {
                            linearLayout11.getLayoutParams().height = iDpToPx21;
                            this.A0.getLayoutParams().height = iDpToPx11;
                            this.A0.getLayoutParams().width = iDpToPx11;
                        } else {
                            linearLayout11.getLayoutParams().height = iDpToPx19;
                            this.A0.getLayoutParams().height = iDpToPx9;
                            this.A0.getLayoutParams().width = iDpToPx9;
                        }
                    }
                } else if (str2.equals("Large")) {
                    this.F0.getLayoutParams().height = iDpToPx26;
                    this.A0.getLayoutParams().height = iDpToPx16;
                    this.A0.getLayoutParams().width = iDpToPx16;
                } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                    this.F0.getLayoutParams().height = iDpToPx24;
                    this.A0.getLayoutParams().height = iDpToPx14;
                    this.A0.getLayoutParams().width = iDpToPx14;
                } else {
                    boolean zEquals10 = this.C1.equals("Small");
                    LinearLayout linearLayout12 = this.F0;
                    if (zEquals10) {
                        linearLayout12.getLayoutParams().height = iDpToPx22;
                        this.A0.getLayoutParams().height = iDpToPx12;
                        this.A0.getLayoutParams().width = iDpToPx12;
                    } else {
                        linearLayout12.getLayoutParams().height = iDpToPx20;
                        this.A0.getLayoutParams().height = iDpToPx10;
                        this.A0.getLayoutParams().width = iDpToPx10;
                    }
                }
            } else if (this.Y0 || this.a1 || this.d1) {
                System.out.println("DateTimeStampLayoutPosSize            6             " + this.C1);
                if (this.C1.equals("Large")) {
                    this.F0.getLayoutParams().height = iDpToPx21;
                    this.A0.getLayoutParams().height = iDpToPx11;
                    this.A0.getLayoutParams().width = iDpToPx11;
                } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                    this.F0.getLayoutParams().height = iDpToPx19;
                    this.A0.getLayoutParams().height = iDpToPx9;
                    this.A0.getLayoutParams().width = iDpToPx9;
                } else {
                    boolean zEquals11 = this.C1.equals("Small");
                    LinearLayout linearLayout13 = this.F0;
                    if (zEquals11) {
                        linearLayout13.getLayoutParams().height = iDpToPx17;
                        this.A0.getLayoutParams().height = iDpToPx7;
                        this.A0.getLayoutParams().width = iDpToPx7;
                    } else {
                        linearLayout13.getLayoutParams().height = iDpToPx15;
                        this.A0.getLayoutParams().height = iDpToPx5;
                        this.A0.getLayoutParams().width = iDpToPx5;
                    }
                }
            } else {
                boolean z10 = this.T0;
                String str3 = this.C1;
                if (z10) {
                    System.out.println("DateTimeStampLayoutPosSize            7             " + str3);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx22;
                        this.A0.getLayoutParams().height = iDpToPx12;
                        this.A0.getLayoutParams().width = iDpToPx12;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx20;
                        this.A0.getLayoutParams().height = iDpToPx10;
                        this.A0.getLayoutParams().width = iDpToPx10;
                    } else {
                        boolean zEquals12 = this.C1.equals("Small");
                        LinearLayout linearLayout14 = this.F0;
                        if (zEquals12) {
                            linearLayout14.getLayoutParams().height = iDpToPx18;
                            this.A0.getLayoutParams().height = iDpToPx8;
                            this.A0.getLayoutParams().width = iDpToPx8;
                        } else {
                            linearLayout14.getLayoutParams().height = iDpToPx16;
                            this.A0.getLayoutParams().height = iDpToPx6;
                            this.A0.getLayoutParams().width = iDpToPx6;
                        }
                    }
                } else {
                    System.out.println("DateTimeStampLayoutPosSize            8             " + str3);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx23;
                        this.A0.getLayoutParams().height = iDpToPx13;
                        this.A0.getLayoutParams().width = iDpToPx13;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx21;
                        this.A0.getLayoutParams().height = iDpToPx11;
                        this.A0.getLayoutParams().width = iDpToPx11;
                    } else {
                        boolean zEquals13 = this.C1.equals("Small");
                        LinearLayout linearLayout15 = this.F0;
                        if (zEquals13) {
                            linearLayout15.getLayoutParams().height = iDpToPx19;
                            this.A0.getLayoutParams().height = iDpToPx9;
                            this.A0.getLayoutParams().width = iDpToPx9;
                        } else {
                            linearLayout15.getLayoutParams().height = iDpToPx17;
                            this.A0.getLayoutParams().height = iDpToPx7;
                            this.A0.getLayoutParams().width = iDpToPx7;
                        }
                    }
                }
            }
        } else {
            if (z7) {
                i = r13 + 1;
            }
            if (z8) {
                i4 = i;
                i4++;
            }
            i4 = i;
            int i8 = i4;
            if (this.c1) {
                i8 = i4 + 1;
            }
            int i9 = i8;
            if (this.e1) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (this.X0) {
                i10 = i9 + 1;
            }
            HelperClass.dpToPx(this, 60);
            HelperClass.dpToPx(this, 70);
            int iDpToPx27 = HelperClass.dpToPx(this, 75);
            int iDpToPx28 = HelperClass.dpToPx(this, 80);
            int iDpToPx29 = HelperClass.dpToPx(this, 85);
            int iDpToPx30 = HelperClass.dpToPx(this, 90);
            int iDpToPx31 = HelperClass.dpToPx(this, 95);
            int iDpToPx32 = HelperClass.dpToPx(this, 100);
            int iDpToPx33 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx34 = HelperClass.dpToPx(this, fh.k1);
            int iDpToPx35 = HelperClass.dpToPx(this, 115);
            int iDpToPx36 = HelperClass.dpToPx(this, 120);
            int iDpToPx37 = HelperClass.dpToPx(this, 125);
            int iDpToPx38 = HelperClass.dpToPx(this, 130);
            int iDpToPx39 = HelperClass.dpToPx(this, 135);
            int iDpToPx40 = HelperClass.dpToPx(this, 140);
            int iDpToPx41 = HelperClass.dpToPx(this, 145);
            int iDpToPx42 = HelperClass.dpToPx(this, 150);
            int iDpToPx43 = HelperClass.dpToPx(this, 155);
            HelperClass.dpToPx(this, 160);
            if (i10 == 2) {
                if (this.Y0 || this.a1 || this.d1) {
                    System.out.println("DateTimeStampLayoutPosSize            11             " + this.C1);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx33;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx31;
                    } else {
                        boolean zEquals14 = this.C1.equals("Small");
                        LinearLayout linearLayout16 = this.F0;
                        if (zEquals14) {
                            linearLayout16.getLayoutParams().height = iDpToPx29;
                        } else {
                            linearLayout16.getLayoutParams().height = iDpToPx27;
                        }
                    }
                } else {
                    System.out.println("DateTimeStampLayoutPosSize            12             " + this.C1);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx34;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx32;
                    } else {
                        boolean zEquals15 = this.C1.equals("Small");
                        LinearLayout linearLayout17 = this.F0;
                        if (zEquals15) {
                            linearLayout17.getLayoutParams().height = iDpToPx30;
                        } else {
                            linearLayout17.getLayoutParams().height = iDpToPx28;
                        }
                    }
                }
            } else if (i10 == 3) {
                if (this.Y0 || this.a1 || this.d1) {
                    System.out.println("DateTimeStampLayoutPosSize            13             " + this.C1);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx35;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx33;
                    } else {
                        boolean zEquals16 = this.C1.equals("Small");
                        LinearLayout linearLayout18 = this.F0;
                        if (zEquals16) {
                            linearLayout18.getLayoutParams().height = iDpToPx31;
                        } else {
                            linearLayout18.getLayoutParams().height = iDpToPx29;
                        }
                    }
                } else {
                    boolean z11 = this.T0;
                    String str4 = this.C1;
                    if (z11) {
                        System.out.println("DateTimeStampLayoutPosSize            14             " + str4);
                        if (this.C1.equals("Large")) {
                            this.F0.getLayoutParams().height = iDpToPx36;
                        } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                            this.F0.getLayoutParams().height = iDpToPx34;
                        } else {
                            boolean zEquals17 = this.C1.equals("Small");
                            LinearLayout linearLayout19 = this.F0;
                            if (zEquals17) {
                                linearLayout19.getLayoutParams().height = iDpToPx32;
                            } else {
                                linearLayout19.getLayoutParams().height = iDpToPx30;
                            }
                        }
                    } else {
                        System.out.println("DateTimeStampLayoutPosSize            15             " + str4);
                        if (this.C1.equals("Large")) {
                            this.F0.getLayoutParams().height = iDpToPx37;
                        } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                            this.F0.getLayoutParams().height = iDpToPx35;
                        } else {
                            boolean zEquals18 = this.C1.equals("Small");
                            LinearLayout linearLayout20 = this.F0;
                            if (zEquals18) {
                                linearLayout20.getLayoutParams().height = iDpToPx33;
                            } else {
                                linearLayout20.getLayoutParams().height = iDpToPx31;
                            }
                        }
                    }
                }
            } else if (i10 != 4) {
                String str5 = this.C1;
                if (i10 == 5) {
                    System.out.println("DateTimeStampLayoutPosSize            19             " + str5);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx41;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx39;
                    } else {
                        boolean zEquals19 = this.C1.equals("Small");
                        LinearLayout linearLayout21 = this.F0;
                        if (zEquals19) {
                            linearLayout21.getLayoutParams().height = iDpToPx37;
                        } else {
                            linearLayout21.getLayoutParams().height = iDpToPx35;
                        }
                    }
                } else if (i10 == 6) {
                    System.out.println("DateTimeStampLayoutPosSize            20             " + str5);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx42;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx40;
                    } else {
                        boolean zEquals20 = this.C1.equals("Small");
                        LinearLayout linearLayout22 = this.F0;
                        if (zEquals20) {
                            linearLayout22.getLayoutParams().height = iDpToPx38;
                        } else {
                            linearLayout22.getLayoutParams().height = iDpToPx36;
                        }
                    }
                } else if (str5.equals("Large")) {
                    this.F0.getLayoutParams().height = iDpToPx43;
                } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                    this.F0.getLayoutParams().height = iDpToPx41;
                } else {
                    boolean zEquals21 = this.C1.equals("Small");
                    LinearLayout linearLayout23 = this.F0;
                    if (zEquals21) {
                        linearLayout23.getLayoutParams().height = iDpToPx39;
                    } else {
                        linearLayout23.getLayoutParams().height = iDpToPx37;
                    }
                }
            } else if (this.Y0 || this.a1 || this.d1) {
                System.out.println("DateTimeStampLayoutPosSize            16             " + this.C1);
                if (this.C1.equals("Large")) {
                    this.F0.getLayoutParams().height = iDpToPx38;
                } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                    this.F0.getLayoutParams().height = iDpToPx36;
                } else {
                    boolean zEquals22 = this.C1.equals("Small");
                    LinearLayout linearLayout24 = this.F0;
                    if (zEquals22) {
                        linearLayout24.getLayoutParams().height = iDpToPx34;
                    } else {
                        linearLayout24.getLayoutParams().height = iDpToPx32;
                    }
                }
            } else {
                boolean z12 = this.T0;
                String str6 = this.C1;
                if (z12) {
                    System.out.println("DateTimeStampLayoutPosSize            17             " + str6);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx39;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx37;
                    } else {
                        boolean zEquals23 = this.C1.equals("Small");
                        LinearLayout linearLayout25 = this.F0;
                        if (zEquals23) {
                            linearLayout25.getLayoutParams().height = iDpToPx35;
                        } else {
                            linearLayout25.getLayoutParams().height = iDpToPx33;
                        }
                    }
                } else {
                    System.out.println("DateTimeStampLayoutPosSize            18             " + str6);
                    if (this.C1.equals("Large")) {
                        this.F0.getLayoutParams().height = iDpToPx40;
                    } else if (this.C1.equals(Default.TEMPLATE_SIZE)) {
                        this.F0.getLayoutParams().height = iDpToPx38;
                    } else {
                        boolean zEquals24 = this.C1.equals("Small");
                        LinearLayout linearLayout26 = this.F0;
                        if (zEquals24) {
                            linearLayout26.getLayoutParams().height = iDpToPx36;
                        } else {
                            linearLayout26.getLayoutParams().height = iDpToPx34;
                        }
                    }
                }
            }
        }
        this.H0.setVisibility(0);
        I();
        this.t0.setVisibility(0);
        this.F0.setVisibility(0);
        this.M0.setVisibility(8);
        this.N0.setVisibility(8);
        this.F0.setBackground(getDrawable(R.drawable.rect_grey));
        ((GradientDrawable) this.F0.getBackground().getCurrent()).setColor(this.t1);
        B();
    }
}