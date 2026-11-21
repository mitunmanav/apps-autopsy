package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.fh;
import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
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
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.core.RWg.fuEBEyZ;
import androidx.camera.core.internal.compat.quirk.Je.zXAusrmFrBIQHr;
import androidx.core.content.kG.ctcdTNpUjlfYHm;
import androidx.viewpager2.widget.oTG.RZmOSvivbLdu;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.facebook.core.RYr.BsqQtlfRBQqL;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.Tb.VCKtvKCuFgEI;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.TempletSettingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.helper.utils;
import com.gpsmapcamera.geotagginglocationonphoto.model.DateTime;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentParser;
import com.itextpdf.text.pdf.events.le.bqcsmGRRmsYO;
import com.itextpdf.text.pdf.parser.HriA.jumTrYZsYnyZCd;
import com.karumi.dexter.Dexter;
import com.tiktok.appevents.base.AVQ.idmhT;
import defpackage.a7;
import defpackage.ad3;
import defpackage.bj;
import defpackage.c31;
import defpackage.c6;
import defpackage.c66;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.dr5;
import defpackage.dt7;
import defpackage.ef0;
import defpackage.eo7;
import defpackage.fz7;
import defpackage.gc1;
import defpackage.i6;
import defpackage.iv4;
import defpackage.j64;
import defpackage.jb5;
import defpackage.k64;
import defpackage.kx0;
import defpackage.l24;
import defpackage.l76;
import defpackage.la9;
import defpackage.lc;
import defpackage.lc1;
import defpackage.lf3;
import defpackage.lt1;
import defpackage.m76;
import defpackage.o30;
import defpackage.ot6;
import defpackage.pc;
import defpackage.qc;
import defpackage.r41;
import defpackage.sq6;
import defpackage.tq6;
import defpackage.ub7;
import defpackage.ws3;
import defpackage.yc;
import defpackage.yn6;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class TempletSettingActivity extends bj implements View.OnClickListener {
    public static boolean E4;
    public ImageView A0;
    public RelativeLayout A1;
    public int A2;
    public boolean A3;
    public TextView B;
    public ImageView B0;
    public ShapeableImageView B1;
    public int B2;
    public boolean B3;
    public TextView C;
    public ImageView C0;
    public ShapeableImageView C1;
    public int C2;
    public boolean C3;
    public TextView D;
    public ImageView D0;
    public LinearLayout D1;
    public int D2;
    public boolean D3;
    public qc D4;
    public TextView E;
    public ImageView E0;
    public LinearLayout E1;
    public int E2;
    public boolean E3;
    public TextView F;
    public ImageView F0;
    public GridLayout F1;
    public int F2;
    public boolean F3;
    public TextView G;
    public ImageView G0;
    public boolean G1;
    public int G2;
    public boolean G3;
    public TextView H;
    public ImageView H0;
    public LinearLayout H1;
    public int H2;
    public boolean H3;
    public TextView I;
    public ImageView I0;
    public LinearLayout I1;
    public int I2;
    public boolean I3;
    public TextView J;
    public ImageView J0;
    public LinearLayout J1;
    public int J2;
    public boolean J3;
    public TextView K;
    public ImageView K0;
    public LinearLayout K1;
    public int K2;
    public boolean K3;
    public TextView L;
    public ImageView L0;
    public LinearLayout L1;
    public String L2;
    public String L3;
    public TextView M;
    public ImageView M0;
    public LinearLayout M1;
    public int M2;
    public String M3;
    public TextView N;
    public ImageView N0;
    public LinearLayout N1;
    public int N2;
    public String N3;
    public TextView O;
    public ImageView O0;
    public LinearLayout O1;
    public int O2;
    public String O3;
    public TextView P;
    public ImageView P0;
    public LinearLayout P1;
    public int P2;
    public int P3;
    public TextView Q;
    public ImageView Q0;
    public LinearLayout Q1;
    public int Q2;
    public int Q3;
    public TextView R;
    public ImageView R0;
    public LinearLayout R1;
    public int R2;
    public int R3;
    public TextView S;
    public ImageView S0;
    public LinearLayout S1;
    public int S2;
    public int S3;
    public TextView T;
    public ImageView T0;
    public LinearLayout T1;
    public int T2;
    public HelperClass T3;
    public TextView U;
    public ShapeableImageView U0;
    public LinearLayout U1;
    public int U2;
    public String U3;
    public TextView V;
    public ShapeableImageView V0;
    public LinearLayout V1;
    public int V2;
    public String V3;
    public TextView W;
    public LinearLayout W0;
    public LinearLayout W1;
    public int W2;
    public String W3;
    public TextView X;
    public LinearLayout X0;
    public LinearLayout X1;
    public int X2;
    public TypedArray X3;
    public TextView Y;
    public LinearLayout Y0;
    public LinearLayout Y1;
    public String Y2;
    public k64 Y3;
    public TextView Z;
    public LinearLayout Z0;
    public LinearLayout Z1;
    public String Z2;
    public dr5 Z3;
    public TextView a0;
    public LinearLayout a1;
    public LinearLayout a2;
    public String a3;
    public l24 a4;
    public TextView b0;
    public LinearLayout b1;
    public LinearLayout b2;
    public String b3;
    public lc1 b4;
    public TextView c0;
    public LinearLayout c1;
    public LinearLayout c2;
    public String c3;
    public ot6 c4;
    public TextView d0;
    public LinearLayout d1;
    public LinearLayout d2;
    public String d3;
    public iv4 d4;
    public TextView e0;
    public LinearLayout e1;
    public LinearLayout e2;
    public String e3;
    public c31 e4;
    public TextView f0;
    public LinearLayout f1;
    public LinearLayout f2;
    public String[] f4;
    public TextView g0;
    public LinearLayout g1;
    public LinearLayout g2;
    public float g3;
    public gc1 g4;
    public TextView h0;
    public LinearLayout h1;
    public LinearLayout h2;
    public boolean h3;
    public Admob h4;
    public TextView i0;
    public LinearLayout i1;
    public LinearLayout i2;
    public boolean i3;
    public RelativeLayout i4;
    public TextView j0;
    public LinearLayout j1;
    public ImageView j2;
    public boolean j3;
    public TextView j4;
    public ImageView k0;
    public LinearLayout k1;
    public ImageView k2;
    public boolean k3;
    public RelativeLayout k4;
    public ImageView l0;
    public LinearLayout l1;
    public TextView l2;
    public boolean l3;
    public SP l4;
    public ImageView m0;
    public LinearLayout m1;
    public TextView m2;
    public boolean m3;
    public LinearLayout m4;
    public ImageView n0;
    public LinearLayout n1;
    public TextView n2;
    public boolean n3;
    public LinearLayout n4;
    public ImageView o0;
    public LinearLayout o1;
    public TextView o2;
    public boolean o3;
    public LinearLayout o4;
    public ImageView p0;
    public LinearLayout p1;
    public TextView p2;
    public boolean p3;
    public LinearLayout p4;
    public ImageView q0;
    public RelativeLayout q1;
    public TextView q2;
    public boolean q3;
    public LinearLayout q4;
    public ImageView r0;
    public RelativeLayout r1;
    public int r2;
    public boolean r3;
    public TextView r4;
    public ImageView s0;
    public RelativeLayout s1;
    public int s2;
    public boolean s3;
    public TextView s4;
    public ImageView t0;
    public LinearLayout t1;
    public int t2;
    public boolean t3;
    public TextView t4;
    public ImageView u0;
    public LinearLayout u1;
    public int u2;
    public boolean u3;
    public TextView u4;
    public ImageView v0;
    public LinearLayout v1;
    public int v2;
    public boolean v3;
    public TextView v4;
    public ImageView w0;
    public LinearLayout w1;
    public int w2;
    public boolean w3;
    public TextView w4;
    public ImageView x0;
    public RelativeLayout x1;
    public int x2;
    public boolean x3;
    public TextView x4;
    public ImageView y0;
    public RelativeLayout y1;
    public int y2;
    public boolean y3;
    public ImageView z0;
    public RelativeLayout z1;
    public int z2;
    public boolean z3;
    public kx0 z4;
    public int f3 = 0;
    public final i6 y4 = (i6) n(new sq6(this, 7), new c6(3));
    public float A4 = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
    public mo1 B4 = null;
    public final Handler C4 = new Handler();

    public static String d0(int i) {
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
                return "";
        }
    }

    public static String x(int i, String str) {
        return "<font color=" + i + ">" + str + "</font>";
    }

    public final int A() {
        return jb5.j(this, this, "Contact_Number_Color", -1);
    }

    public final boolean A0() {
        return this.l4.getBoolean(this, "date_and_time", true);
    }

    public final String B() {
        return this.f3 == 4 ? this.l4.getString(this, "date_format_temp", Default.DEFAULT_DATE_FORMAT_DT) : this.l4.getString(this, "date_format_temp", Default.DEFAULT_DATE_FORMAT);
    }

    public final boolean B0() {
        return this.l4.getBoolean(this, "humidity", false);
    }

    public final int C() {
        return jb5.j(this, this, "Date & Time Color", -1);
    }

    public final boolean C0() {
        return this.l4.getBoolean(this, "logo", false);
    }

    public final void D() {
        final int i = 0;
        int integer = this.l4.getInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSTemplateSettingScreenFS(this)) {
            finish();
            return;
        }
        final int i3 = 1;
        if (integer >= RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler().postDelayed(new Runnable(this) { // from class: rq6
                public final /* synthetic */ TempletSettingActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    TempletSettingActivity templetSettingActivity = this.b;
                    switch (i4) {
                        case 0:
                            boolean z = TempletSettingActivity.E4;
                            templetSettingActivity.l4.setInteger(templetSettingActivity, HelperClass.COUNTADS, 0);
                            int i5 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i5 == 9) {
                                int i6 = RemoteAdData.TEMPLATE_EDIT_SCREEN_FS_TYPE;
                                if (i6 == 1) {
                                    templetSettingActivity.o0();
                                } else if (i6 == 2) {
                                    templetSettingActivity.p0();
                                }
                            } else if (i5 == 1) {
                                templetSettingActivity.o0();
                            } else if (i5 == 2) {
                                templetSettingActivity.p0();
                            }
                            break;
                        default:
                            boolean z2 = TempletSettingActivity.E4;
                            int i7 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i7 != 9) {
                                if (i7 == 1) {
                                    mo1 mo1Var = templetSettingActivity.B4;
                                    if (mo1Var == null) {
                                        CPD.DismissDialog();
                                        templetSettingActivity.finish();
                                    } else {
                                        mo1Var.b.a(templetSettingActivity);
                                    }
                                }
                            } else if (RemoteAdData.TEMPLATE_EDIT_SCREEN_FS_TYPE == 1) {
                                mo1 mo1Var2 = templetSettingActivity.B4;
                                if (mo1Var2 == null) {
                                    CPD.DismissDialog();
                                    templetSettingActivity.finish();
                                } else {
                                    mo1Var2.b.a(templetSettingActivity);
                                }
                            }
                            break;
                    }
                }
            }, 200L);
            this.C4.postDelayed(new Runnable(this) { // from class: rq6
                public final /* synthetic */ TempletSettingActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    TempletSettingActivity templetSettingActivity = this.b;
                    switch (i4) {
                        case 0:
                            boolean z = TempletSettingActivity.E4;
                            templetSettingActivity.l4.setInteger(templetSettingActivity, HelperClass.COUNTADS, 0);
                            int i5 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i5 == 9) {
                                int i6 = RemoteAdData.TEMPLATE_EDIT_SCREEN_FS_TYPE;
                                if (i6 == 1) {
                                    templetSettingActivity.o0();
                                } else if (i6 == 2) {
                                    templetSettingActivity.p0();
                                }
                            } else if (i5 == 1) {
                                templetSettingActivity.o0();
                            } else if (i5 == 2) {
                                templetSettingActivity.p0();
                            }
                            break;
                        default:
                            boolean z2 = TempletSettingActivity.E4;
                            int i7 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i7 != 9) {
                                if (i7 == 1) {
                                    mo1 mo1Var = templetSettingActivity.B4;
                                    if (mo1Var == null) {
                                        CPD.DismissDialog();
                                        templetSettingActivity.finish();
                                    } else {
                                        mo1Var.b.a(templetSettingActivity);
                                    }
                                }
                            } else if (RemoteAdData.TEMPLATE_EDIT_SCREEN_FS_TYPE == 1) {
                                mo1 mo1Var2 = templetSettingActivity.B4;
                                if (mo1Var2 == null) {
                                    CPD.DismissDialog();
                                    templetSettingActivity.finish();
                                } else {
                                    mo1Var2.b.a(templetSettingActivity);
                                }
                            }
                            break;
                    }
                }
            }, 7000L);
            return;
        }
        this.l4.setInteger(this, HelperClass.COUNTADS, integer + 1);
        finish();
    }

    public final boolean D0() {
        return this.l4.getBoolean(this, "Magnetic Field", false);
    }

    public final int E() {
        return jb5.j(this, this, "Humidity Color", -1);
    }

    public final boolean E0() {
        return this.l4.getBoolean(this, "Map", true);
    }

    public final int F() {
        return this.l4.getInteger(this, "lat_lng_type_temp_1", 1);
    }

    public final boolean F0() {
        return this.l4.getBoolean(this, "notes_hastag", true);
    }

    public final int G() {
        return jb5.j(this, this, "Lat/Long Color", -1);
    }

    public final boolean G0() {
        return this.l4.getBoolean(this, "isnumbering", false);
    }

    public final String H() {
        return this.l4.getString(this, "imge_logo", Default.LOGO_uri);
    }

    public final boolean H0() {
        return this.l4.getBoolean(this, "is_Person_Name", false);
    }

    public final int I() {
        return jb5.j(this, this, "Magnetic Field Color", -1);
    }

    public final boolean I0() {
        return this.l4.getBoolean(this, Default.PLUSCODE, false);
    }

    public final int J() {
        return this.l4.getInteger(this, "map_Scale", 78);
    }

    public final boolean J0() {
        return this.l4.getBoolean(this, "soundlevel", false);
    }

    public final int K() {
        return this.l4.getInteger(this, "map_position_type", 0);
    }

    public final boolean K0() {
        return this.l4.getBoolean(this, Default.TIMEZONE, true);
    }

    public final String L() {
        return this.l4.getString(this, "map_type_temp", Default.SETELLITE_2);
    }

    public final boolean L0() {
        return this.l4.getBoolean(this, "Weather", false);
    }

    public final int M() {
        return jb5.j(this, this, "Note & Hashtage Color", -1);
    }

    public final boolean M0() {
        return this.l4.getBoolean(this, "wind", false);
    }

    public final int N() {
        return jb5.j(this, this, "Numbering Color", -1);
    }

    public final boolean N0() {
        return this.l4.getBoolean(this, "elevation", false);
    }

    public final String O() {
        return new SP(this).getString(this, "mPerson_name", "-");
    }

    public final boolean O0() {
        return this.l4.getBoolean(this, "pressure", false);
    }

    public final int P() {
        return jb5.j(this, this, "Person_Name_Color", -1);
    }

    public final void P0() {
        SP sp = this.l4;
        if (sp != null) {
            if (this.f3 != 4) {
                sp.setInteger(this, "map_position_type", this.R3);
                if (this.f3 != 5) {
                    this.l4.setBoolean(this, Default.TIMEZONE, this.p3);
                    this.l4.setInteger(this, "timezone value", this.R2);
                    this.l4.setBoolean(this, Default.PLUSCODE, this.j3);
                    this.l4.setBoolean(this, "isnumbering", this.q3);
                    this.l4.setBoolean(this, "isincrement", this.r3);
                    this.l4.setBoolean(this, "Magnetic Field", this.s3);
                    this.l4.setBoolean(this, "wind", this.v3);
                    this.l4.setBoolean(this, "humidity", this.y3);
                    this.l4.setBoolean(this, "pressure", this.z3);
                    this.l4.setBoolean(this, "elevation", this.A3);
                    this.l4.setBoolean(this, "accuracy", this.C3);
                    this.l4.setBoolean(this, "soundlevel", this.D3);
                    this.l4.setInteger(this, "PlusCode Color", this.z2);
                    this.l4.setInteger(this, "Magnetic Field Color", this.B2);
                    this.l4.setInteger(this, "Wind Color", this.E2);
                    this.l4.setInteger(this, "Humidity Color", this.F2);
                    this.l4.setInteger(this, "Pressure Color", this.G2);
                    this.l4.setInteger(this, "Elevation Color", this.H2);
                    this.l4.setInteger(this, "Accuracy Color", this.J2);
                    this.l4.setInteger(this, "SoundLevel Color", this.P2);
                    this.l4.setInteger(this, "Numbering Color", this.T2);
                    this.l4.setInteger(this, "wind_postion", this.M2);
                    this.l4.setInteger(this, "accuracy_position", this.O2);
                    this.l4.setInteger(this, "sequence value", this.S2);
                    this.l4.setString(this, "prefix", this.Z2);
                    this.l4.setString(this, "suffix", this.Y2);
                    this.l4.setString(this, "plus_code_type", this.W3);
                    this.l4.setInteger(this, "pressure_postion", this.Q2);
                }
            }
            if (this.f3 != 5) {
                this.l4.setBoolean(this, "Weather", this.k3);
                this.l4.setBoolean(this, "is_Person_Name", this.E3);
                this.l4.setBoolean(this, "is_Contact_Number", this.F3);
                this.l4.setBoolean(this, "Compass", this.t3);
                this.l4.setBoolean(this, "altitude", this.B3);
            }
            this.l4.setInteger(this, "map_type_temp_pos", this.P3);
            this.l4.setBoolean(this, "Map", this.h3);
            this.l4.setInteger(this, "map_Scale", this.S3);
            this.l4.setBoolean(this, "Address", this.i3);
            this.l4.setBoolean(this, "logo", this.w3);
            this.l4.setBoolean(this, "is_country_flag_temp", this.G3);
            this.l4.setBoolean(this, "Address_City", this.H3);
            this.l4.setBoolean(this, "Address_State", this.I3);
            this.l4.setBoolean(this, "Address_Country", this.J3);
            this.l4.setBoolean(this, "Address_Pincode", this.K3);
            this.l4.setBoolean(this, "date_and_time", this.o3);
            this.l4.setBoolean(this, "notes_hastag", this.x3);
            this.l4.setBoolean(this, "isNoteDialogVisible", this.G1);
            this.l4.setString(this, "date_format_temp", this.L3);
            if (this.f3 == 4) {
                this.l4.setString(this, "time_format_temp", this.O3);
            }
            this.l4.setInteger(this, "Background Color", this.r2);
            this.l4.setInteger(this, "Address Color", this.t2);
            this.l4.setInteger(this, "Short Address Color", this.w2);
            this.l4.setInteger(this, "Date & Time Color", this.x2);
            this.l4.setInteger(this, "Lat/Long Color", this.y2);
            this.l4.setInteger(this, "Note & Hashtage Color", this.D2);
            this.l4.setString(this, "pos_type_temp", this.U3);
            this.l4.setString(this, "size_type_temp", this.V3);
            this.l4.setString(this, "notes", this.d3);
            this.l4.setString(this, "map_type_temp", this.N3);
            if (this.f3 != 5) {
                this.l4.setInteger(this, "Weather Color", this.A2);
                this.l4.setInteger(this, "Compass Color", this.C2);
                this.l4.setInteger(this, "Altitude Color", this.I2);
                this.l4.setInteger(this, "Person_Name_Color", this.u2);
                this.l4.setInteger(this, "Contact_Number_Color", this.v2);
                this.l4.setInteger(this, "altitude_position", this.N2);
                this.l4.setString(this, "mPerson_name", this.a3);
                this.l4.setString(this, "contactNumber", this.b3);
                this.l4.setString(this, "temprature_type_temp", this.M3);
                this.l4.setString(this, "imge_logo", this.c3);
            }
            this.l4.setInteger(this, "lat_lng_type_temp_1", this.Q3);
            int i = this.f3;
            if (i == 0) {
                this.l4.setString(this, SP.STAMP_FONT_STYLE, this.e3);
                return;
            }
            if (i == 1) {
                this.l4.setString(this, SP.STAMP_FONT_STYLE_CLASSIC, this.e3);
                return;
            }
            if (i == 3) {
                this.l4.setString(this, SP.STAMP_FONT_STYLE_NC, this.e3);
                this.l4.setBoolean(this, "orientationlabel", this.n3);
                this.l4.setBoolean(this, "aqiLevelTemp", this.l3);
                this.l4.setBoolean(this, "azimuthTemp", this.m3);
                this.l4.setInteger(this, "ORLabel_Text_Color", this.W2);
                this.l4.setInteger(this, "AQILevel_Color", this.V2);
                this.l4.setInteger(this, "Azimuth_Color", this.U2);
                this.l4.setInteger(this, "ORLabel_BG_Color", this.X2);
                return;
            }
            if (i == 2) {
                this.l4.setString(this, SP.STAMP_FONT_STYLE_REPORTING, this.e3);
                this.l4.setInteger(this, "report_bg_color", this.s2);
                this.l4.setInteger(this, "report_tag_color", this.K2);
                this.l4.setString(this, "report_tag_name", this.L2);
                return;
            }
            SP sp2 = this.l4;
            if (i == 4) {
                sp2.setString(this, SP.STAMP_FONT_STYLE_DT, this.e3);
            } else {
                sp2.setString(this, SP.STAMP_FONT_STYLE_QR, this.e3);
            }
        }
    }

    public final String Q() {
        return this.l4.getString(this, "plus_code_type", Default.PLUSCODE_TYPE);
    }

    public final void Q0() {
        this.D.setTextColor(f0());
        this.H.setTextColor(y());
        if (this.f3 == 4) {
            this.I.setTextColor(v());
        } else {
            this.J.setTextColor(I());
            this.C.setTextColor(g0());
            this.d0.setTextColor(U());
            this.W.setTextColor(E());
        }
        String strZ = Z();
        int i = this.f3;
        if (i == 0) {
            if (K() == 0 || K() == 5) {
                boolean zEquals = strZ.equals("Bottom");
                LinearLayout linearLayout = this.f1;
                if (zEquals) {
                    linearLayout.setBackground(getDrawable(R.drawable.rect_grey_1));
                } else {
                    linearLayout.setBackground(getDrawable(R.drawable.rect_grey_3));
                }
                this.j1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.k1.setBackground(getDrawable(R.drawable.rect_grey_4));
            } else {
                boolean zEquals2 = strZ.equals("Bottom");
                LinearLayout linearLayout2 = this.f1;
                if (zEquals2) {
                    linearLayout2.setBackground(getDrawable(R.drawable.rect_grey_5));
                } else {
                    linearLayout2.setBackground(getDrawable(R.drawable.rect_grey_7));
                }
                this.j1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.k1.setBackground(getDrawable(R.drawable.rect_grey_4));
            }
            this.j1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setBackground(getDrawable(R.drawable.rect_grey));
        } else if (i == 1) {
            this.f1.setBackground(getDrawable(R.drawable.classic_back));
            this.j1.setBackground(getDrawable(R.drawable.classic_back));
            this.k1.setBackground(getDrawable(R.drawable.classic_back));
            this.j1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setBackground(getDrawable(R.drawable.classic_back));
        } else if (i == 3) {
            if (K() == 0) {
                boolean zEquals3 = strZ.equals("Bottom");
                RelativeLayout relativeLayout = this.q1;
                if (zEquals3) {
                    relativeLayout.setBackground(getDrawable(R.drawable.rect_grey_1));
                } else {
                    relativeLayout.setBackground(getDrawable(R.drawable.rect_grey_3));
                }
                this.D1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.E1.setBackground(getDrawable(R.drawable.rect_grey_4));
                this.r1.setBackground(getDrawable(R.drawable.rect_grey_6));
                this.s1.setBackground(getDrawable(R.drawable.rect_grey_6));
                this.p2.setBackground(getDrawable(R.drawable.rect_grey_8));
                this.q2.setBackground(getDrawable(R.drawable.rect_grey_8));
            } else {
                boolean zEquals4 = strZ.equals("Bottom");
                RelativeLayout relativeLayout2 = this.q1;
                if (zEquals4) {
                    relativeLayout2.setBackground(getDrawable(R.drawable.rect_grey_5));
                } else {
                    relativeLayout2.setBackground(getDrawable(R.drawable.rect_grey_7));
                }
                this.D1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.E1.setBackground(getDrawable(R.drawable.rect_grey_4));
                this.r1.setBackground(getDrawable(R.drawable.rect_grey_6));
                this.s1.setBackground(getDrawable(R.drawable.rect_grey_6));
                this.p2.setBackground(getDrawable(R.drawable.rect_grey_8));
                this.q2.setBackground(getDrawable(R.drawable.rect_grey_8));
            }
            this.D1.setVisibility(8);
            this.E1.setVisibility(8);
            this.q1.setBackground(getDrawable(R.drawable.rect_grey));
        } else if (i == 2) {
            if (K() == 0) {
                boolean zEquals5 = strZ.equals("Bottom");
                LinearLayout linearLayout3 = this.f1;
                if (zEquals5) {
                    linearLayout3.setBackground(getDrawable(R.drawable.rect_grey_1));
                } else {
                    linearLayout3.setBackground(getDrawable(R.drawable.rect_grey_3));
                }
                this.j1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.k1.setBackground(getDrawable(R.drawable.rect_grey_4));
            } else {
                boolean zEquals6 = strZ.equals("Bottom");
                LinearLayout linearLayout4 = this.f1;
                if (zEquals6) {
                    linearLayout4.setBackground(getDrawable(R.drawable.rect_grey_5));
                } else {
                    linearLayout4.setBackground(getDrawable(R.drawable.rect_grey_7));
                }
                this.j1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.k1.setBackground(getDrawable(R.drawable.rect_grey_4));
            }
            this.j1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setBackground(getDrawable(R.drawable.rect_grey));
        } else {
            if (K() == 0) {
                boolean zEquals7 = strZ.equals("Bottom");
                LinearLayout linearLayout5 = this.f1;
                if (zEquals7) {
                    linearLayout5.setBackground(getDrawable(R.drawable.rect_grey_1));
                } else {
                    linearLayout5.setBackground(getDrawable(R.drawable.rect_grey_3));
                }
                this.j1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.k1.setBackground(getDrawable(R.drawable.rect_grey_4));
            } else {
                boolean zEquals8 = strZ.equals("Bottom");
                LinearLayout linearLayout6 = this.f1;
                if (zEquals8) {
                    linearLayout6.setBackground(getDrawable(R.drawable.rect_grey_5));
                } else {
                    linearLayout6.setBackground(getDrawable(R.drawable.rect_grey_7));
                }
                this.j1.setBackground(getDrawable(R.drawable.rect_grey_2));
                this.k1.setBackground(getDrawable(R.drawable.rect_grey_4));
            }
            this.j1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setBackground(getDrawable(R.drawable.rect_grey));
        }
        ((GradientDrawable) this.f1.getBackground().getCurrent()).setColor(w());
        if (this.f3 == 3) {
            ((GradientDrawable) this.q1.getBackground().getCurrent()).setColor(w());
            ((GradientDrawable) this.r1.getBackground().getCurrent()).setColor(w());
            ((GradientDrawable) this.s1.getBackground().getCurrent()).setColor(w());
            ((GradientDrawable) this.q2.getBackground().getCurrent()).setColor(new SP(this).getInteger(this, "ORLabel_BG_Color", Color.parseColor("#747474")));
            ((GradientDrawable) this.p2.getBackground().getCurrent()).setColor(new SP(this).getInteger(this, "ORLabel_BG_Color", Color.parseColor("#747474")));
            this.p2.setTextColor(new SP(this).getInteger(this, "ORLabel_Text_Color", -1));
            this.q2.setTextColor(new SP(this).getInteger(this, "ORLabel_Text_Color", -1));
            this.n2.setTextColor(y());
            this.o2.setTextColor(y());
        }
        boolean zEquals9 = strZ.equals("Bottom");
        LinearLayout linearLayout7 = this.j1;
        if (zEquals9) {
            linearLayout7.setVisibility(8);
            this.k1.setVisibility(8);
            ((GradientDrawable) this.j1.getBackground().getCurrent()).setColor(w());
        } else {
            linearLayout7.setVisibility(8);
            this.k1.setVisibility(8);
            ((GradientDrawable) this.k1.getBackground().getCurrent()).setColor(w());
        }
        int i2 = this.f3;
        if (i2 == 2) {
            b1();
            return;
        }
        if (i2 == 3) {
            V0();
            return;
        }
        if (i2 == 4) {
            R0();
        } else if (i2 == 5) {
            Z0();
        } else {
            d1();
        }
    }

    public final int R() {
        return jb5.j(this, this, "PlusCode Color", -1);
    }

    public final void R0() {
        boolean z;
        boolean z2;
        LinearLayout.LayoutParams layoutParams;
        int i;
        int i2;
        int i3;
        boolean zE0 = E0();
        boolean zV0 = v0();
        boolean zX0 = x0();
        boolean zL0 = L0();
        boolean zH0 = H0();
        boolean zC0 = C0();
        boolean zF0 = F0();
        boolean zW0 = w0();
        String strA0 = a0();
        HelperClass.isTablet(this);
        if (strA0.equals("Small") || strA0.equals(Default.TEMPLATE_SIZE)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.j2.getLayoutParams();
            layoutParams2.height = HelperClass.dpToPx(this, 20);
            layoutParams2.width = HelperClass.dpToPx(this, 20);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
            layoutParams3.height = HelperClass.dpToPx(this, 20);
            layoutParams3.width = HelperClass.dpToPx(this, 20);
            this.l2.setTextSize(7.0f);
            this.m2.setTextSize(7.0f);
        } else {
            boolean zEquals = strA0.equals("Extra Small");
            ImageView imageView = this.j2;
            if (zEquals) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams4.height = HelperClass.dpToPx(this, 14);
                layoutParams4.width = HelperClass.dpToPx(this, 14);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams5.height = HelperClass.dpToPx(this, 14);
                layoutParams5.width = HelperClass.dpToPx(this, 14);
                this.l2.setTextSize(5.0f);
                this.m2.setTextSize(5.0f);
            } else {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams6.height = HelperClass.dpToPx(this, 24);
                layoutParams6.width = HelperClass.dpToPx(this, 24);
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams7.height = HelperClass.dpToPx(this, 24);
                layoutParams7.width = HelperClass.dpToPx(this, 24);
                this.l2.setTextSize(9.0f);
                this.m2.setTextSize(9.0f);
            }
        }
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (strA0.equals("Large")) {
            z = zV0;
            z2 = zX0;
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_120), (int) getResources().getDimension(R.dimen.stamp_icon_size_110));
        } else {
            z = zV0;
            z2 = zX0;
            if (strA0.equals(Default.TEMPLATE_SIZE)) {
                layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_90));
            } else {
                layoutParams = strA0.equals("Small") ? new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_100), (int) getResources().getDimension(R.dimen.stamp_icon_size_80)) : new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_90), (int) getResources().getDimension(R.dimen.stamp_icon_size_70));
            }
        }
        ImageView imageView2 = this.R0;
        if (zE0) {
            imageView2.setVisibility(0);
            layoutParams8.setMargins(0, 0, 0, 0);
            layoutParams.setMargins(0, 0, 0, 0);
            this.d1.setPadding((int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp));
            layoutParams.gravity = 80;
            i = 8;
        } else {
            i = 8;
            imageView2.setVisibility(8);
            layoutParams8.setMargins(0, 0, 0, 0);
        }
        this.f1.setLayoutParams(layoutParams8);
        if (zL0 != 0 || zW0 || z2) {
            this.w1.setVisibility(0);
            LinearLayout linearLayout = this.t1;
            if (zL0 != 0) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(i);
            }
            LinearLayout linearLayout2 = this.v1;
            if (zW0) {
                linearLayout2.setVisibility(0);
                this.I.setText(HelperClass.getAltitudeconvert(this, i0()));
                this.n0.setImageResource(R.drawable.ic_altitiude);
                this.I.setTextColor(v());
                i = 8;
            } else {
                i = 8;
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.u1;
            if (z2) {
                i2 = 0;
                linearLayout3.setVisibility(0);
            } else {
                i2 = 0;
                linearLayout3.setVisibility(i);
            }
        } else {
            this.w1.setVisibility(i);
            i2 = 0;
        }
        LinearLayout linearLayout4 = this.Z0;
        if (zC0) {
            linearLayout4.setVisibility(i2);
        } else {
            linearLayout4.setVisibility(i);
        }
        if (strA0.equals(Default.TEMPLATE_SIZE)) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 40);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 58);
            this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.n0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.n0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.D.setTextSize(8.0f);
            this.H.setTextSize(8.0f);
            this.I.setTextSize(8.0f);
        } else if (strA0.equals("Small")) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 38);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 54);
            this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.n0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.n0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.D.setTextSize(7.0f);
            this.H.setTextSize(7.0f);
            this.I.setTextSize(7.0f);
        } else {
            boolean zEquals2 = strA0.equals("Extra Small");
            ImageView imageView3 = this.S0;
            if (zEquals2) {
                imageView3.getLayoutParams().height = HelperClass.dpToPx(this, 36);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 50);
                this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.n0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.n0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.D.setTextSize(6.0f);
                this.H.setTextSize(6.0f);
                this.I.setTextSize(6.0f);
            } else {
                imageView3.getLayoutParams().height = HelperClass.dpToPx(this, 42);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 62);
                this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.n0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.n0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.D.setTextSize(10.0f);
                this.H.setTextSize(10.0f);
                this.I.setTextSize(10.0f);
            }
        }
        if (zE0) {
            i3 = z ? 2 : 1;
            int i4 = i3 + 1;
            if (zF0) {
                i4 = i3 + 2;
            }
            if (zH0) {
                i4++;
            }
            if (y0()) {
                i4++;
            }
            int i5 = i4;
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
            if (i5 == 2) {
                if (zL0 || z2 || zW0) {
                    if (jb5.w("DateTimeStampLayoutPosSize            1             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx16;
                        this.R0.getLayoutParams().height = iDpToPx7;
                        this.R0.getLayoutParams().width = iDpToPx7;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx14;
                        this.R0.getLayoutParams().height = iDpToPx5;
                        this.R0.getLayoutParams().width = iDpToPx5;
                    } else {
                        boolean zEquals3 = strA0.equals("Small");
                        LinearLayout linearLayout5 = this.f1;
                        if (zEquals3) {
                            linearLayout5.getLayoutParams().height = iDpToPx12;
                            this.R0.getLayoutParams().height = iDpToPx3;
                            this.R0.getLayoutParams().width = iDpToPx3;
                        } else {
                            linearLayout5.getLayoutParams().height = iDpToPx10;
                            this.R0.getLayoutParams().height = iDpToPx;
                            this.R0.getLayoutParams().width = iDpToPx;
                        }
                    }
                } else if (jb5.w("DateTimeStampLayoutPosSize            2             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx17;
                    this.R0.getLayoutParams().height = iDpToPx7;
                    this.R0.getLayoutParams().width = iDpToPx7;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx15;
                    this.R0.getLayoutParams().height = iDpToPx6;
                    this.R0.getLayoutParams().width = iDpToPx6;
                } else {
                    boolean zEquals4 = strA0.equals("Small");
                    LinearLayout linearLayout6 = this.f1;
                    if (zEquals4) {
                        linearLayout6.getLayoutParams().height = iDpToPx13;
                        this.R0.getLayoutParams().height = iDpToPx4;
                        this.R0.getLayoutParams().width = iDpToPx4;
                    } else {
                        linearLayout6.getLayoutParams().height = iDpToPx11;
                        this.R0.getLayoutParams().height = iDpToPx2;
                        this.R0.getLayoutParams().width = iDpToPx2;
                    }
                }
            } else if (i5 == 3) {
                if (zL0 != 0 || z2 || zW0) {
                    if (jb5.w("DateTimeStampLayoutPosSize            3             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx18;
                        this.R0.getLayoutParams().height = iDpToPx9;
                        this.R0.getLayoutParams().width = iDpToPx9;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx16;
                        this.R0.getLayoutParams().height = iDpToPx7;
                        this.R0.getLayoutParams().width = iDpToPx7;
                    } else {
                        boolean zEquals5 = strA0.equals("Small");
                        LinearLayout linearLayout7 = this.f1;
                        if (zEquals5) {
                            linearLayout7.getLayoutParams().height = iDpToPx14;
                            this.R0.getLayoutParams().height = iDpToPx5;
                            this.R0.getLayoutParams().width = iDpToPx5;
                        } else {
                            linearLayout7.getLayoutParams().height = iDpToPx12;
                            this.R0.getLayoutParams().height = iDpToPx3;
                            this.R0.getLayoutParams().width = iDpToPx3;
                        }
                    }
                } else if (z) {
                    if (jb5.w("DateTimeStampLayoutPosSize            4             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx19;
                        this.R0.getLayoutParams().height = iDpToPx9;
                        this.R0.getLayoutParams().width = iDpToPx9;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx17;
                        this.R0.getLayoutParams().height = iDpToPx7;
                        this.R0.getLayoutParams().width = iDpToPx7;
                    } else {
                        boolean zEquals6 = strA0.equals("Small");
                        LinearLayout linearLayout8 = this.f1;
                        if (zEquals6) {
                            linearLayout8.getLayoutParams().height = iDpToPx15;
                            this.R0.getLayoutParams().height = iDpToPx5;
                            this.R0.getLayoutParams().width = iDpToPx5;
                        } else {
                            linearLayout8.getLayoutParams().height = iDpToPx13;
                            this.R0.getLayoutParams().height = iDpToPx3;
                            this.R0.getLayoutParams().width = iDpToPx3;
                        }
                    }
                } else if (jb5.w("DateTimeStampLayoutPosSize            5             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx20;
                    this.R0.getLayoutParams().height = iDpToPx10;
                    this.R0.getLayoutParams().width = iDpToPx10;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx18;
                    this.R0.getLayoutParams().height = iDpToPx8;
                    this.R0.getLayoutParams().width = iDpToPx8;
                } else {
                    boolean zEquals7 = strA0.equals("Small");
                    LinearLayout linearLayout9 = this.f1;
                    if (zEquals7) {
                        linearLayout9.getLayoutParams().height = iDpToPx16;
                        this.R0.getLayoutParams().height = iDpToPx6;
                        this.R0.getLayoutParams().width = iDpToPx6;
                    } else {
                        linearLayout9.getLayoutParams().height = iDpToPx14;
                        this.R0.getLayoutParams().height = iDpToPx4;
                        this.R0.getLayoutParams().width = iDpToPx4;
                    }
                }
            } else if (i5 == 4) {
                if (zL0 != 0 || z2 || zW0) {
                    if (jb5.w("DateTimeStampLayoutPosSize            6             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx21;
                        this.R0.getLayoutParams().height = iDpToPx11;
                        this.R0.getLayoutParams().width = iDpToPx11;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx19;
                        this.R0.getLayoutParams().height = iDpToPx9;
                        this.R0.getLayoutParams().width = iDpToPx9;
                    } else {
                        boolean zEquals8 = strA0.equals("Small");
                        LinearLayout linearLayout10 = this.f1;
                        if (zEquals8) {
                            linearLayout10.getLayoutParams().height = iDpToPx17;
                            this.R0.getLayoutParams().height = iDpToPx7;
                            this.R0.getLayoutParams().width = iDpToPx7;
                        } else {
                            linearLayout10.getLayoutParams().height = iDpToPx15;
                            this.R0.getLayoutParams().height = iDpToPx5;
                            this.R0.getLayoutParams().width = iDpToPx5;
                        }
                    }
                } else if (z) {
                    if (jb5.w("DateTimeStampLayoutPosSize            7             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx22;
                        this.R0.getLayoutParams().height = iDpToPx12;
                        this.R0.getLayoutParams().width = iDpToPx12;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx20;
                        this.R0.getLayoutParams().height = iDpToPx10;
                        this.R0.getLayoutParams().width = iDpToPx10;
                    } else {
                        boolean zEquals9 = strA0.equals("Small");
                        LinearLayout linearLayout11 = this.f1;
                        if (zEquals9) {
                            linearLayout11.getLayoutParams().height = iDpToPx18;
                            this.R0.getLayoutParams().height = iDpToPx8;
                            this.R0.getLayoutParams().width = iDpToPx8;
                        } else {
                            linearLayout11.getLayoutParams().height = iDpToPx16;
                            this.R0.getLayoutParams().height = iDpToPx6;
                            this.R0.getLayoutParams().width = iDpToPx6;
                        }
                    }
                } else if (jb5.w("DateTimeStampLayoutPosSize            8             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx23;
                    this.R0.getLayoutParams().height = iDpToPx13;
                    this.R0.getLayoutParams().width = iDpToPx13;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx21;
                    this.R0.getLayoutParams().height = iDpToPx11;
                    this.R0.getLayoutParams().width = iDpToPx11;
                } else {
                    boolean zEquals10 = strA0.equals("Small");
                    LinearLayout linearLayout12 = this.f1;
                    if (zEquals10) {
                        linearLayout12.getLayoutParams().height = iDpToPx19;
                        this.R0.getLayoutParams().height = iDpToPx9;
                        this.R0.getLayoutParams().width = iDpToPx9;
                    } else {
                        linearLayout12.getLayoutParams().height = iDpToPx17;
                        this.R0.getLayoutParams().height = iDpToPx7;
                        this.R0.getLayoutParams().width = iDpToPx7;
                    }
                }
            } else if (i5 == 5) {
                if (jb5.w("DateTimeStampLayoutPosSize            9             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx24;
                    this.R0.getLayoutParams().height = iDpToPx14;
                    this.R0.getLayoutParams().width = iDpToPx14;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx22;
                    this.R0.getLayoutParams().height = iDpToPx12;
                    this.R0.getLayoutParams().width = iDpToPx12;
                } else {
                    boolean zEquals11 = strA0.equals("Small");
                    LinearLayout linearLayout13 = this.f1;
                    if (zEquals11) {
                        linearLayout13.getLayoutParams().height = iDpToPx20;
                        this.R0.getLayoutParams().height = iDpToPx10;
                        this.R0.getLayoutParams().width = iDpToPx10;
                    } else {
                        linearLayout13.getLayoutParams().height = iDpToPx18;
                        this.R0.getLayoutParams().height = iDpToPx8;
                        this.R0.getLayoutParams().width = iDpToPx8;
                    }
                }
            } else if (i5 == 6) {
                if (jb5.w("DateTimeStampLayoutPosSize            10            ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx25;
                    this.R0.getLayoutParams().height = iDpToPx15;
                    this.R0.getLayoutParams().width = iDpToPx15;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx23;
                    this.R0.getLayoutParams().height = iDpToPx13;
                    this.R0.getLayoutParams().width = iDpToPx13;
                } else {
                    boolean zEquals12 = strA0.equals("Small");
                    LinearLayout linearLayout14 = this.f1;
                    if (zEquals12) {
                        linearLayout14.getLayoutParams().height = iDpToPx21;
                        this.R0.getLayoutParams().height = iDpToPx11;
                        this.R0.getLayoutParams().width = iDpToPx11;
                    } else {
                        linearLayout14.getLayoutParams().height = iDpToPx19;
                        this.R0.getLayoutParams().height = iDpToPx9;
                        this.R0.getLayoutParams().width = iDpToPx9;
                    }
                }
            } else if (strA0.equals("Large")) {
                this.f1.getLayoutParams().height = iDpToPx26;
                this.R0.getLayoutParams().height = iDpToPx16;
                this.R0.getLayoutParams().width = iDpToPx16;
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.f1.getLayoutParams().height = iDpToPx24;
                this.R0.getLayoutParams().height = iDpToPx14;
                this.R0.getLayoutParams().width = iDpToPx14;
            } else {
                boolean zEquals13 = strA0.equals("Small");
                LinearLayout linearLayout15 = this.f1;
                if (zEquals13) {
                    linearLayout15.getLayoutParams().height = iDpToPx22;
                    this.R0.getLayoutParams().height = iDpToPx12;
                    this.R0.getLayoutParams().width = iDpToPx12;
                } else {
                    linearLayout15.getLayoutParams().height = iDpToPx20;
                    this.R0.getLayoutParams().height = iDpToPx10;
                    this.R0.getLayoutParams().width = iDpToPx10;
                }
            }
        } else {
            i3 = z ? 2 : 1;
            int i6 = i3 + 1;
            if (zF0) {
                i6 = i3 + 2;
            }
            if (zH0 != 0) {
                i6++;
            }
            if (y0()) {
                i6++;
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
            if (i6 == 2) {
                if (zL0 != 0 || z2 || zW0) {
                    if (jb5.w("DateTimeStampLayoutPosSize            11             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx33;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx31;
                    } else {
                        boolean zEquals14 = strA0.equals("Small");
                        LinearLayout linearLayout16 = this.f1;
                        if (zEquals14) {
                            linearLayout16.getLayoutParams().height = iDpToPx29;
                        } else {
                            linearLayout16.getLayoutParams().height = iDpToPx27;
                        }
                    }
                } else if (jb5.w("DateTimeStampLayoutPosSize            12             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx34;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx32;
                } else {
                    boolean zEquals15 = strA0.equals("Small");
                    LinearLayout linearLayout17 = this.f1;
                    if (zEquals15) {
                        linearLayout17.getLayoutParams().height = iDpToPx30;
                    } else {
                        linearLayout17.getLayoutParams().height = iDpToPx28;
                    }
                }
            } else if (i6 == 3) {
                if (zL0 != 0 || z2 || zW0) {
                    if (jb5.w("DateTimeStampLayoutPosSize            13             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx35;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx33;
                    } else {
                        boolean zEquals16 = strA0.equals("Small");
                        LinearLayout linearLayout18 = this.f1;
                        if (zEquals16) {
                            linearLayout18.getLayoutParams().height = iDpToPx31;
                        } else {
                            linearLayout18.getLayoutParams().height = iDpToPx29;
                        }
                    }
                } else if (z) {
                    if (jb5.w("DateTimeStampLayoutPosSize            14             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx36;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx34;
                    } else {
                        boolean zEquals17 = strA0.equals("Small");
                        LinearLayout linearLayout19 = this.f1;
                        if (zEquals17) {
                            linearLayout19.getLayoutParams().height = iDpToPx32;
                        } else {
                            linearLayout19.getLayoutParams().height = iDpToPx30;
                        }
                    }
                } else if (jb5.w("DateTimeStampLayoutPosSize            15             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx37;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx35;
                } else {
                    boolean zEquals18 = strA0.equals("Small");
                    LinearLayout linearLayout20 = this.f1;
                    if (zEquals18) {
                        linearLayout20.getLayoutParams().height = iDpToPx33;
                    } else {
                        linearLayout20.getLayoutParams().height = iDpToPx31;
                    }
                }
            } else if (i6 == 4) {
                if (zL0 != 0 || z2 || zW0) {
                    if (jb5.w("DateTimeStampLayoutPosSize            16             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx38;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx36;
                    } else {
                        boolean zEquals19 = strA0.equals("Small");
                        LinearLayout linearLayout21 = this.f1;
                        if (zEquals19) {
                            linearLayout21.getLayoutParams().height = iDpToPx34;
                        } else {
                            linearLayout21.getLayoutParams().height = iDpToPx32;
                        }
                    }
                } else if (z) {
                    if (jb5.w("DateTimeStampLayoutPosSize            17             ", strA0, System.out, "Large")) {
                        this.f1.getLayoutParams().height = iDpToPx39;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx37;
                    } else {
                        boolean zEquals20 = strA0.equals("Small");
                        LinearLayout linearLayout22 = this.f1;
                        if (zEquals20) {
                            linearLayout22.getLayoutParams().height = iDpToPx35;
                        } else {
                            linearLayout22.getLayoutParams().height = iDpToPx33;
                        }
                    }
                } else if (jb5.w("DateTimeStampLayoutPosSize            18             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx40;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx38;
                } else {
                    boolean zEquals21 = strA0.equals("Small");
                    LinearLayout linearLayout23 = this.f1;
                    if (zEquals21) {
                        linearLayout23.getLayoutParams().height = iDpToPx36;
                    } else {
                        linearLayout23.getLayoutParams().height = iDpToPx34;
                    }
                }
            } else if (i6 == 5) {
                if (jb5.w("DateTimeStampLayoutPosSize            19             ", strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx41;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx39;
                } else {
                    boolean zEquals22 = strA0.equals("Small");
                    LinearLayout linearLayout24 = this.f1;
                    if (zEquals22) {
                        linearLayout24.getLayoutParams().height = iDpToPx37;
                    } else {
                        linearLayout24.getLayoutParams().height = iDpToPx35;
                    }
                }
            } else if (i6 == 6) {
                if (jb5.w(bqcsmGRRmsYO.eQFFOBAGtjaq, strA0, System.out, "Large")) {
                    this.f1.getLayoutParams().height = iDpToPx42;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx40;
                } else {
                    boolean zEquals23 = strA0.equals("Small");
                    LinearLayout linearLayout25 = this.f1;
                    if (zEquals23) {
                        linearLayout25.getLayoutParams().height = iDpToPx38;
                    } else {
                        linearLayout25.getLayoutParams().height = iDpToPx36;
                    }
                }
            } else if (strA0.equals("Large")) {
                this.f1.getLayoutParams().height = iDpToPx43;
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.f1.getLayoutParams().height = iDpToPx41;
            } else {
                boolean zEquals24 = strA0.equals("Small");
                LinearLayout linearLayout26 = this.f1;
                if (zEquals24) {
                    linearLayout26.getLayoutParams().height = iDpToPx39;
                } else {
                    linearLayout26.getLayoutParams().height = iDpToPx37;
                }
            }
        }
        this.e1.setVisibility(0);
        this.d1.setVisibility(0);
        g1();
        this.B.setVisibility(0);
        this.f1.setVisibility(0);
    }

    public final int S() {
        return this.l4.getInteger(this, "map_type_temp_pos", 0);
    }

    public final void S0() {
        String strH = H();
        if (!strH.equals(Default.LOGO_uri)) {
            Executors.newSingleThreadExecutor().execute(new yn6(7, this, strH));
        } else {
            this.Q0.setImageResource(R.drawable.new_watermark);
            this.S0.setImageResource(R.drawable.new_watermark);
        }
    }

    public final String T() {
        return new SP(this).getString(this, "prefix", "");
    }

    public final void T0() {
        int i = this.f3;
        if (i != 4) {
            if (i == 3) {
                int iK = K();
                TextView textView = this.K;
                if (iK == 0) {
                    textView.setText(getString(R.string.type_left));
                } else {
                    textView.setText(getString(R.string.type_right));
                }
            } else if (i == 0 || i == 1) {
                int iK2 = K();
                ShapeableImageView shapeableImageView = this.U0;
                if (iK2 == 0) {
                    shapeableImageView.setVisibility(0);
                    this.V0.setVisibility(8);
                    this.K.setText(getString(R.string.type_left));
                } else {
                    shapeableImageView.setVisibility(8);
                    this.V0.setVisibility(0);
                    this.K.setText(getString(R.string.type_right));
                }
            } else {
                int iK3 = K();
                ImageView imageView = this.R0;
                if (iK3 == 0) {
                    imageView.setVisibility(0);
                    this.T0.setVisibility(8);
                    this.K.setText(getString(R.string.type_left));
                } else {
                    imageView.setVisibility(8);
                    this.T0.setVisibility(0);
                    this.K.setText(getString(R.string.type_right));
                }
            }
            Q0();
        }
    }

    public final int U() {
        return jb5.j(this, this, "Pressure Color", -1);
    }

    public final void U0() {
        String strL = L();
        byte b = 0;
        int integer = this.l4.getInteger(this, SP.TEMPLATE_TYPE, 0);
        strL.getClass();
        switch (strL.hashCode()) {
            case -1579103941:
                if (!strL.equals(Default.SETELLITE_2)) {
                    b = -1;
                }
                break;
            case -1423437003:
                b = !strL.equals(Default.TERRAIN_3) ? (byte) -1 : (byte) 1;
                break;
            case -1202757124:
                b = !strL.equals(Default.HYBRID_4) ? (byte) -1 : (byte) 2;
                break;
            case 1366708796:
                b = !strL.equals(Default.NORMAL_1) ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (integer == 4) {
                    this.R0.setImageResource(R.drawable.maptype_satellite);
                } else if (integer == 0 || integer == 1) {
                    this.U0.setImageResource(R.drawable.maptype_satellite);
                    this.V0.setImageResource(R.drawable.maptype_satellite);
                } else {
                    this.R0.setImageResource(R.drawable.maptype_satellite);
                    this.T0.setImageResource(R.drawable.maptype_satellite);
                }
                this.M.setText(R.string.satellite);
                break;
            case 1:
                if (integer == 4) {
                    this.R0.setImageResource(R.drawable.maptype_terrain);
                } else if (integer == 0 || integer == 1) {
                    this.U0.setImageResource(R.drawable.maptype_terrain);
                    this.V0.setImageResource(R.drawable.maptype_terrain);
                } else {
                    this.R0.setImageResource(R.drawable.maptype_terrain);
                    this.T0.setImageResource(R.drawable.maptype_terrain);
                }
                this.M.setText(R.string.terrain);
                break;
            case 2:
                if (integer == 4) {
                    this.R0.setImageResource(R.drawable.maptype_hybrid);
                } else if (integer == 0 || integer == 1) {
                    this.U0.setImageResource(R.drawable.maptype_hybrid);
                    this.V0.setImageResource(R.drawable.maptype_hybrid);
                } else {
                    this.R0.setImageResource(R.drawable.maptype_hybrid);
                    this.T0.setImageResource(R.drawable.maptype_hybrid);
                }
                this.M.setText(R.string.hybrid);
                break;
            case 3:
                if (integer == 4) {
                    this.R0.setImageResource(R.drawable.maptype_normal);
                } else if (integer == 0 || integer == 1) {
                    this.U0.setImageResource(R.drawable.maptype_normal);
                    this.V0.setImageResource(R.drawable.maptype_normal);
                } else {
                    this.R0.setImageResource(R.drawable.maptype_normal);
                    this.T0.setImageResource(R.drawable.maptype_normal);
                }
                this.M.setText(R.string.normal);
                break;
        }
    }

    public final String V() {
        return new SP(this).getString(this, "report_tag_name", "");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x02e4  */
    public final void V0() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        float f;
        E0();
        int iK = K();
        boolean zV0 = v0();
        boolean zI0 = I0();
        boolean zD0 = D0();
        boolean zX0 = x0();
        boolean zL0 = L0();
        boolean zA0 = A0();
        boolean zK0 = K0();
        boolean zG0 = G0();
        boolean zH0 = H0();
        boolean zC0 = C0();
        boolean zF0 = F0();
        boolean zM0 = M0();
        boolean zB0 = B0();
        boolean zO0 = O0();
        boolean zN0 = N0();
        boolean zW0 = w0();
        boolean zQ0 = q0();
        boolean zJ0 = J0();
        boolean z5 = this.l4.getBoolean(this, "aqiLevelTemp", false);
        this.l4.getBoolean(this, "orientationlabel", true);
        boolean z6 = this.l4.getBoolean(this, "azimuthTemp", true);
        String strA0 = a0();
        boolean zIsTablet = HelperClass.isTablet(this);
        LinearLayout linearLayout = this.D1;
        if (iK == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            z = z6;
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.E1.getLayoutParams();
            z2 = zD0;
            layoutParams.removeRule(20);
            z3 = zX0;
            z4 = zL0;
            layoutParams.addRule(21, -1);
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21, -1);
            this.D1.setLayoutParams(layoutParams);
            this.E1.setLayoutParams(layoutParams2);
            boolean z7 = this.u3;
            RelativeLayout relativeLayout = this.r1;
            if (z7) {
                relativeLayout.setVisibility(0);
                this.s1.setVisibility(8);
            } else {
                relativeLayout.setVisibility(8);
                this.s1.setVisibility(8);
            }
        } else {
            z = z6;
            z2 = zD0;
            z3 = zX0;
            z4 = zL0;
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.E1.getLayoutParams();
            layoutParams3.removeRule(21);
            layoutParams3.addRule(20, -1);
            layoutParams4.removeRule(21);
            layoutParams4.addRule(20, -1);
            this.D1.setLayoutParams(layoutParams3);
            this.E1.setLayoutParams(layoutParams4);
            boolean z8 = this.u3;
            RelativeLayout relativeLayout2 = this.r1;
            if (z8) {
                relativeLayout2.setVisibility(8);
                this.s1.setVisibility(0);
            } else {
                relativeLayout2.setVisibility(8);
                this.s1.setVisibility(8);
            }
        }
        if (strA0.equals("Small") || strA0.equals(Default.TEMPLATE_SIZE)) {
            zA0 = zA0;
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.j2.getLayoutParams();
            layoutParams5.height = HelperClass.dpToPx(this, 20);
            layoutParams5.width = HelperClass.dpToPx(this, 20);
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
            layoutParams6.height = HelperClass.dpToPx(this, 20);
            layoutParams6.width = HelperClass.dpToPx(this, 20);
            this.l2.setTextSize(7.0f);
            this.m2.setTextSize(7.0f);
        } else {
            boolean zEquals = strA0.equals("Extra Small");
            ImageView imageView = this.j2;
            if (zEquals) {
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams7.height = HelperClass.dpToPx(this, 14);
                layoutParams7.width = HelperClass.dpToPx(this, 14);
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams8.height = HelperClass.dpToPx(this, 14);
                layoutParams8.width = HelperClass.dpToPx(this, 14);
                this.l2.setTextSize(5.0f);
                this.m2.setTextSize(5.0f);
            } else {
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams9.height = HelperClass.dpToPx(this, 24);
                layoutParams9.width = HelperClass.dpToPx(this, 24);
                LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams10.height = HelperClass.dpToPx(this, 24);
                layoutParams10.width = HelperClass.dpToPx(this, 24);
                this.l2.setTextSize(9.0f);
                this.m2.setTextSize(9.0f);
            }
        }
        this.q1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView2 = this.S0;
        if (zC0) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        if (strA0.equals(Default.TEMPLATE_SIZE)) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 44);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 44);
        } else if (strA0.equals("Small")) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 40);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 40);
        } else {
            boolean zEquals2 = strA0.equals("Extra Small");
            ImageView imageView3 = this.S0;
            if (zEquals2) {
                imageView3.getLayoutParams().height = HelperClass.dpToPx(this, 36);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 36);
            } else {
                imageView3.getLayoutParams().height = HelperClass.dpToPx(this, 48);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 48);
            }
        }
        if (strA0.equals(Default.TEMPLATE_SIZE)) {
            this.p2.setTextSize(10.0f);
            this.q2.setTextSize(10.0f);
        } else if (strA0.equals("Small")) {
            this.p2.setTextSize(9.0f);
            this.q2.setTextSize(9.0f);
        } else {
            boolean zEquals3 = strA0.equals("Extra Small");
            TextView textView = this.p2;
            if (zEquals3) {
                textView.setTextSize(8.0f);
                this.q2.setTextSize(8.0f);
            } else {
                textView.setTextSize(11.0f);
                this.q2.setTextSize(11.0f);
            }
        }
        this.F1.removeAllViews();
        if (zIsTablet) {
            if (strA0.equals("Large")) {
                i = 2;
                f = 10.0f;
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                i = 2;
                f = 9.0f;
            } else if (strA0.equals("Small")) {
                i = 2;
                f = 8.0f;
            } else {
                i = 2;
                f = 7.0f;
            }
        } else if (strA0.equals("Large")) {
            i = 8;
            f = 10.0f;
        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
            i = 6;
            f = 9.0f;
        } else if (strA0.equals("Small")) {
            i = 4;
            f = 8.0f;
        } else {
            i = 2;
            f = 7.0f;
        }
        if (w0()) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            GridLayout.LayoutParams layoutParams11 = new GridLayout.LayoutParams();
            layoutParams11.width = 0;
            layoutParams11.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams11.setMargins(0, 0, 0, i);
            linearLayout2.setLayoutParams(layoutParams11);
            linearLayout2.setGravity(8388611);
            ImageView imageView4 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams12.setMarginEnd(6);
            imageView4.setLayoutParams(layoutParams12);
            imageView4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView4.setImageResource(R.drawable.ic_altitiude);
            TextView textView2 = new TextView(this);
            textView2.setText(HelperClass.getAltitudeconvert(this, i0()));
            textView2.setTextSize(f);
            textView2.setTextColor(I());
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setTypeface(HelperClass.getFontStyle(this, j0()));
            linearLayout2.addView(imageView4);
            linearLayout2.addView(textView2);
            this.F1.addView(linearLayout2);
        }
        if (L0()) {
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(0);
            GridLayout.LayoutParams layoutParams13 = new GridLayout.LayoutParams();
            layoutParams13.width = 0;
            layoutParams13.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams13.setMargins(0, 0, 0, i);
            linearLayout3.setLayoutParams(layoutParams13);
            linearLayout3.setGravity(8388611);
            ImageView imageView5 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams14.setMarginEnd(6);
            imageView5.setLayoutParams(layoutParams14);
            imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView5.setImageResource(this.X3.getResourceId(this.l4.getInteger(this, SP.WEATHER_ICON, 0), 0));
            TextView textView3 = new TextView(this);
            boolean zEquals4 = c0().equals("Celsius");
            float f2 = this.g3;
            if (zEquals4) {
                textView3.setText(HelperClass.getCelcius(f2));
            } else {
                textView3.setText(HelperClass.getFahrenheit(f2));
            }
            textView3.setTextSize(f);
            textView3.setTextColor(f0());
            textView3.setSingleLine(true);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setTypeface(HelperClass.getFontStyle(this, j0()));
            linearLayout3.addView(imageView5);
            linearLayout3.addView(textView3);
            this.F1.addView(linearLayout3);
        }
        if (D0() && this.u3) {
            LinearLayout linearLayout4 = new LinearLayout(this);
            linearLayout4.setOrientation(0);
            GridLayout.LayoutParams layoutParams15 = new GridLayout.LayoutParams();
            layoutParams15.width = 0;
            layoutParams15.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams15.setMargins(0, 0, 0, i);
            linearLayout4.setLayoutParams(layoutParams15);
            linearLayout4.setGravity(8388611);
            ImageView imageView6 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams16.setMarginEnd(6);
            imageView6.setLayoutParams(layoutParams16);
            imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView6.setImageResource(R.drawable.ic_magnetic_field);
            TextView textView4 = new TextView(this);
            textView4.setText(this.l4.getString(this, SP.MAGNETIC_FIELD_VALUE, "-"));
            textView4.setTextSize(f);
            textView4.setTextColor(I());
            textView4.setSingleLine(true);
            textView4.setEllipsize(TextUtils.TruncateAt.END);
            textView4.setTypeface(HelperClass.getFontStyle(this, j0()));
            linearLayout4.addView(imageView6);
            linearLayout4.addView(textView4);
            this.F1.addView(linearLayout4);
        }
        if (M0()) {
            LinearLayout linearLayout5 = new LinearLayout(this);
            linearLayout5.setOrientation(0);
            GridLayout.LayoutParams layoutParams17 = new GridLayout.LayoutParams();
            layoutParams17.width = 0;
            layoutParams17.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams17.setMargins(0, 0, 0, i);
            linearLayout5.setLayoutParams(layoutParams17);
            linearLayout5.setGravity(8388611);
            ImageView imageView7 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams18.setMarginEnd(6);
            imageView7.setLayoutParams(layoutParams18);
            imageView7.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView7.setImageResource(R.drawable.ic_wind);
            TextView textView5 = new TextView(this);
            textView5.setText(HelperClass.getwindConvert(this, m0()));
            textView5.setTextSize(f);
            textView5.setTextColor(g0());
            textView5.setSingleLine(true);
            textView5.setEllipsize(TextUtils.TruncateAt.END);
            textView5.setTypeface(HelperClass.getFontStyle(this, j0()));
            linearLayout5.addView(imageView7);
            linearLayout5.addView(textView5);
            this.F1.addView(linearLayout5);
        }
        if (B0()) {
            LinearLayout linearLayout6 = new LinearLayout(this);
            linearLayout6.setOrientation(0);
            GridLayout.LayoutParams layoutParams19 = new GridLayout.LayoutParams();
            layoutParams19.width = 0;
            layoutParams19.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams19.setMargins(0, 0, 0, i);
            linearLayout6.setLayoutParams(layoutParams19);
            linearLayout6.setGravity(8388611);
            ImageView imageView8 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams20.setMarginEnd(6);
            imageView8.setLayoutParams(layoutParams20);
            imageView8.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView8.setImageResource(R.drawable.ic_humidity);
            TextView textView6 = new TextView(this);
            textView6.setText(this.l4.getString(this, SP.HUMIDITY_VALUE, "") + "%");
            textView6.setTextSize(f);
            textView6.setTextColor(E());
            String strJ0 = j0();
            textView6.setSingleLine(true);
            textView6.setEllipsize(TextUtils.TruncateAt.END);
            textView6.setTypeface(HelperClass.getFontStyle(this, strJ0));
            linearLayout6.addView(imageView8);
            linearLayout6.addView(textView6);
            this.F1.addView(linearLayout6);
        }
        if (O0()) {
            LinearLayout linearLayout7 = new LinearLayout(this);
            linearLayout7.setOrientation(0);
            GridLayout.LayoutParams layoutParams21 = new GridLayout.LayoutParams();
            layoutParams21.width = 0;
            layoutParams21.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams21.setMargins(0, 0, 0, i);
            linearLayout7.setLayoutParams(layoutParams21);
            linearLayout7.setGravity(8388611);
            ImageView imageView9 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams22.setMarginEnd(6);
            imageView9.setLayoutParams(layoutParams22);
            imageView9.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView9.setImageResource(R.drawable.ic_pressure);
            TextView textView7 = new TextView(this);
            textView7.setText(HelperClass.getpressureConvert(this, l0()));
            textView7.setTextSize(f);
            textView7.setTextColor(E());
            textView7.setSingleLine(true);
            textView7.setEllipsize(TextUtils.TruncateAt.END);
            textView7.setTypeface(HelperClass.getFontStyle(this, j0()));
            linearLayout7.addView(imageView9);
            linearLayout7.addView(textView7);
            this.F1.addView(linearLayout7);
        }
        if (q0()) {
            LinearLayout linearLayout8 = new LinearLayout(this);
            linearLayout8.setOrientation(0);
            GridLayout.LayoutParams layoutParams23 = new GridLayout.LayoutParams();
            layoutParams23.width = 0;
            layoutParams23.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams23.setMargins(0, 0, 0, i);
            linearLayout8.setLayoutParams(layoutParams23);
            linearLayout8.setGravity(8388611);
            ImageView imageView10 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams24.setMarginEnd(6);
            imageView10.setLayoutParams(layoutParams24);
            imageView10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView10.setImageResource(R.drawable.ic_accuracy);
            TextView textView8 = new TextView(this);
            textView8.setText(HelperClass.getAccuracy(this, h0()));
            textView8.setTextSize(f);
            textView8.setTextColor(t());
            textView8.setSingleLine(true);
            textView8.setEllipsize(TextUtils.TruncateAt.END);
            textView8.setTypeface(HelperClass.getFontStyle(this, j0()));
            linearLayout8.addView(imageView10);
            linearLayout8.addView(textView8);
            this.F1.addView(linearLayout8);
        }
        if (J0()) {
            LinearLayout linearLayout9 = new LinearLayout(this);
            linearLayout9.setOrientation(0);
            GridLayout.LayoutParams layoutParams25 = new GridLayout.LayoutParams();
            layoutParams25.width = 0;
            layoutParams25.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams25.setMargins(0, 0, 0, i);
            linearLayout9.setLayoutParams(layoutParams25);
            linearLayout9.setGravity(8388611);
            ImageView imageView11 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams26.setMarginEnd(6);
            imageView11.setLayoutParams(layoutParams26);
            imageView11.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView11.setImageResource(R.drawable.sound_wave);
            TextView textView9 = new TextView(this);
            textView9.setText(HelperClass.getSoundLevel(this));
            textView9.setTextSize(f);
            textView9.setTextColor(Y());
            textView9.setSingleLine(true);
            textView9.setEllipsize(TextUtils.TruncateAt.END);
            textView9.setTypeface(HelperClass.getFontStyle(this, j0()));
            linearLayout9.addView(imageView11);
            linearLayout9.addView(textView9);
            this.F1.addView(linearLayout9);
        }
        boolean zE0 = E0();
        ImageView imageView12 = this.R0;
        if (zE0) {
            imageView12.setVisibility(0);
            this.T0.setVisibility(0);
            int i2 = zV0 ? 2 : 1;
            int i3 = i2 + 1;
            if (zI0) {
                i3 = i2 + 2;
            }
            if (zA0 || zK0) {
                i3++;
            }
            if (zG0) {
                i3++;
            }
            if (zF0) {
                i3++;
            }
            if (zH0) {
                i3++;
            }
            if (z) {
                i3++;
            }
            if (z5) {
                i3++;
            }
            if (i3 < 6) {
                if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.n2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else if (strA0.equals("Small")) {
                    this.n2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 7));
                } else {
                    boolean zEquals5 = strA0.equals("Extra Small");
                    TextView textView10 = this.n2;
                    if (zEquals5) {
                        textView10.setTextSize(0, HelperClass.dpToPx(this, 6));
                        this.o2.setTextSize(0, HelperClass.dpToPx(this, 6));
                    } else {
                        textView10.setTextSize(0, HelperClass.dpToPx(this, 9));
                        this.o2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    }
                }
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.n2.setTextSize(0, HelperClass.dpToPx(this, 10));
                this.o2.setTextSize(0, HelperClass.dpToPx(this, 10));
            } else if (strA0.equals("Small")) {
                this.n2.setTextSize(0, HelperClass.dpToPx(this, 9));
                this.o2.setTextSize(0, HelperClass.dpToPx(this, 9));
            } else {
                boolean zEquals6 = strA0.equals("Extra Small");
                TextView textView11 = this.n2;
                if (zEquals6) {
                    textView11.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else {
                    textView11.setTextSize(0, HelperClass.dpToPx(this, 11));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 11));
                }
            }
            HelperClass.dpToPx(this, 70);
            HelperClass.dpToPx(this, 75);
            HelperClass.dpToPx(this, 80);
            HelperClass.dpToPx(this, 85);
            int iDpToPx = HelperClass.dpToPx(this, 90);
            int iDpToPx2 = HelperClass.dpToPx(this, 95);
            int iDpToPx3 = HelperClass.dpToPx(this, 100);
            int iDpToPx4 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx5 = HelperClass.dpToPx(this, fh.k1);
            int iDpToPx6 = HelperClass.dpToPx(this, 115);
            int iDpToPx7 = HelperClass.dpToPx(this, 120);
            int iDpToPx8 = HelperClass.dpToPx(this, 125);
            int iDpToPx9 = HelperClass.dpToPx(this, 130);
            int iDpToPx10 = HelperClass.dpToPx(this, 135);
            int iDpToPx11 = HelperClass.dpToPx(this, 140);
            int iDpToPx12 = HelperClass.dpToPx(this, 145);
            int iDpToPx13 = HelperClass.dpToPx(this, 150);
            int iDpToPx14 = HelperClass.dpToPx(this, 155);
            int iDpToPx15 = HelperClass.dpToPx(this, 160);
            int iDpToPx16 = HelperClass.dpToPx(this, 165);
            int iDpToPx17 = HelperClass.dpToPx(this, 170);
            int iDpToPx18 = HelperClass.dpToPx(this, 175);
            int iDpToPx19 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
            HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
            int iDpToPx20 = HelperClass.dpToPx(this, 190);
            HelperClass.dpToPx(this, 195);
            int iDpToPx21 = HelperClass.dpToPx(this, PdfContentParser.COMMAND_TYPE);
            HelperClass.dpToPx(this, 205);
            HelperClass.dpToPx(this, 210);
            HelperClass.dpToPx(this, 215);
            HelperClass.dpToPx(this, 220);
            HelperClass.dpToPx(this, 225);
            HelperClass.dpToPx(this, 230);
            boolean z9 = zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0 || z4 || z3 || z2 || zN0;
            if (C0()) {
                if (z9) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx21;
                        this.r1.getLayoutParams().height = iDpToPx21;
                        this.s1.getLayoutParams().height = iDpToPx21;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx20;
                        this.r1.getLayoutParams().height = iDpToPx20;
                        this.s1.getLayoutParams().height = iDpToPx20;
                    } else {
                        boolean zEquals7 = strA0.equals("Small");
                        RelativeLayout relativeLayout3 = this.q1;
                        if (zEquals7) {
                            relativeLayout3.getLayoutParams().height = iDpToPx19;
                            this.r1.getLayoutParams().height = iDpToPx19;
                            this.s1.getLayoutParams().height = iDpToPx19;
                        } else {
                            relativeLayout3.getLayoutParams().height = iDpToPx17;
                            this.r1.getLayoutParams().height = iDpToPx17;
                            this.s1.getLayoutParams().height = iDpToPx17;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx20;
                    this.r1.getLayoutParams().height = iDpToPx20;
                    this.s1.getLayoutParams().height = iDpToPx20;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx19;
                    this.r1.getLayoutParams().height = iDpToPx19;
                    this.s1.getLayoutParams().height = iDpToPx19;
                } else {
                    boolean zEquals8 = strA0.equals("Small");
                    RelativeLayout relativeLayout4 = this.q1;
                    if (zEquals8) {
                        relativeLayout4.getLayoutParams().height = iDpToPx17;
                        this.r1.getLayoutParams().height = iDpToPx17;
                        this.s1.getLayoutParams().height = iDpToPx17;
                    } else {
                        relativeLayout4.getLayoutParams().height = iDpToPx15;
                        this.r1.getLayoutParams().height = iDpToPx15;
                        this.s1.getLayoutParams().height = iDpToPx15;
                    }
                }
            } else if (i3 == 2) {
                if (z9) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx10;
                        this.r1.getLayoutParams().height = iDpToPx10;
                        this.s1.getLayoutParams().height = iDpToPx10;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx8;
                        this.r1.getLayoutParams().height = iDpToPx8;
                        this.s1.getLayoutParams().height = iDpToPx8;
                    } else {
                        boolean zEquals9 = strA0.equals("Small");
                        RelativeLayout relativeLayout5 = this.q1;
                        if (zEquals9) {
                            relativeLayout5.getLayoutParams().height = iDpToPx6;
                            this.r1.getLayoutParams().height = iDpToPx6;
                            this.s1.getLayoutParams().height = iDpToPx6;
                        } else {
                            relativeLayout5.getLayoutParams().height = iDpToPx4;
                            this.r1.getLayoutParams().height = iDpToPx4;
                            this.s1.getLayoutParams().height = iDpToPx4;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx8;
                    this.r1.getLayoutParams().height = iDpToPx8;
                    this.s1.getLayoutParams().height = iDpToPx8;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx6;
                    this.r1.getLayoutParams().height = iDpToPx6;
                    this.s1.getLayoutParams().height = iDpToPx6;
                } else {
                    boolean zEquals10 = strA0.equals("Small");
                    RelativeLayout relativeLayout6 = this.q1;
                    if (zEquals10) {
                        relativeLayout6.getLayoutParams().height = iDpToPx4;
                        this.r1.getLayoutParams().height = iDpToPx4;
                        this.s1.getLayoutParams().height = iDpToPx4;
                    } else {
                        relativeLayout6.getLayoutParams().height = iDpToPx2;
                        this.r1.getLayoutParams().height = iDpToPx2;
                        this.s1.getLayoutParams().height = iDpToPx2;
                    }
                }
            } else if (i3 != 3) {
                boolean z10 = z9;
                if (i3 == 4) {
                    if (z10) {
                        if (strA0.equals("Large")) {
                            this.q1.getLayoutParams().height = iDpToPx9;
                            this.r1.getLayoutParams().height = iDpToPx9;
                            this.s1.getLayoutParams().height = iDpToPx9;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.q1.getLayoutParams().height = iDpToPx7;
                            this.r1.getLayoutParams().height = iDpToPx7;
                            this.s1.getLayoutParams().height = iDpToPx7;
                        } else {
                            boolean zEquals11 = strA0.equals("Small");
                            RelativeLayout relativeLayout7 = this.q1;
                            if (zEquals11) {
                                relativeLayout7.getLayoutParams().height = iDpToPx5;
                                this.r1.getLayoutParams().height = iDpToPx5;
                                this.s1.getLayoutParams().height = iDpToPx5;
                            } else {
                                relativeLayout7.getLayoutParams().height = iDpToPx3;
                                this.r1.getLayoutParams().height = iDpToPx3;
                                this.s1.getLayoutParams().height = iDpToPx3;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx7;
                        this.r1.getLayoutParams().height = iDpToPx7;
                        this.s1.getLayoutParams().height = iDpToPx7;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx5;
                        this.r1.getLayoutParams().height = iDpToPx5;
                        this.s1.getLayoutParams().height = iDpToPx5;
                    } else {
                        boolean zEquals12 = strA0.equals("Small");
                        RelativeLayout relativeLayout8 = this.q1;
                        if (zEquals12) {
                            relativeLayout8.getLayoutParams().height = iDpToPx3;
                            this.r1.getLayoutParams().height = iDpToPx3;
                            this.s1.getLayoutParams().height = iDpToPx3;
                        } else {
                            relativeLayout8.getLayoutParams().height = iDpToPx;
                            this.r1.getLayoutParams().height = iDpToPx;
                            this.s1.getLayoutParams().height = iDpToPx;
                        }
                    }
                } else if (i3 == 5) {
                    if (z10) {
                        if (strA0.equals("Large")) {
                            this.q1.getLayoutParams().height = iDpToPx9;
                            this.r1.getLayoutParams().height = iDpToPx9;
                            this.s1.getLayoutParams().height = iDpToPx9;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.q1.getLayoutParams().height = iDpToPx7;
                            this.r1.getLayoutParams().height = iDpToPx7;
                            this.s1.getLayoutParams().height = iDpToPx7;
                        } else {
                            boolean zEquals13 = strA0.equals("Small");
                            RelativeLayout relativeLayout9 = this.q1;
                            if (zEquals13) {
                                relativeLayout9.getLayoutParams().height = iDpToPx5;
                                this.r1.getLayoutParams().height = iDpToPx5;
                                this.s1.getLayoutParams().height = iDpToPx5;
                            } else {
                                relativeLayout9.getLayoutParams().height = iDpToPx3;
                                this.r1.getLayoutParams().height = iDpToPx3;
                                this.s1.getLayoutParams().height = iDpToPx3;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx7;
                        this.r1.getLayoutParams().height = iDpToPx7;
                        this.s1.getLayoutParams().height = iDpToPx7;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx5;
                        this.r1.getLayoutParams().height = iDpToPx5;
                        this.s1.getLayoutParams().height = iDpToPx5;
                    } else {
                        boolean zEquals14 = strA0.equals("Small");
                        RelativeLayout relativeLayout10 = this.q1;
                        if (zEquals14) {
                            relativeLayout10.getLayoutParams().height = iDpToPx3;
                            this.r1.getLayoutParams().height = iDpToPx3;
                            this.s1.getLayoutParams().height = iDpToPx3;
                        } else {
                            relativeLayout10.getLayoutParams().height = iDpToPx;
                            this.r1.getLayoutParams().height = iDpToPx;
                            this.s1.getLayoutParams().height = iDpToPx;
                        }
                    }
                } else if (i3 == 6) {
                    if (z10) {
                        if (strA0.equals("Large")) {
                            this.q1.getLayoutParams().height = iDpToPx11;
                            this.r1.getLayoutParams().height = iDpToPx11;
                            this.s1.getLayoutParams().height = iDpToPx11;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.q1.getLayoutParams().height = iDpToPx9;
                            this.r1.getLayoutParams().height = iDpToPx9;
                            this.s1.getLayoutParams().height = iDpToPx9;
                        } else {
                            boolean zEquals15 = strA0.equals("Small");
                            RelativeLayout relativeLayout11 = this.q1;
                            if (zEquals15) {
                                relativeLayout11.getLayoutParams().height = iDpToPx7;
                                this.r1.getLayoutParams().height = iDpToPx7;
                                this.s1.getLayoutParams().height = iDpToPx7;
                            } else {
                                relativeLayout11.getLayoutParams().height = iDpToPx5;
                                this.r1.getLayoutParams().height = iDpToPx5;
                                this.s1.getLayoutParams().height = iDpToPx5;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx9;
                        this.r1.getLayoutParams().height = iDpToPx9;
                        this.s1.getLayoutParams().height = iDpToPx9;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx7;
                        this.r1.getLayoutParams().height = iDpToPx7;
                        this.s1.getLayoutParams().height = iDpToPx7;
                    } else {
                        boolean zEquals16 = strA0.equals("Small");
                        RelativeLayout relativeLayout12 = this.q1;
                        if (zEquals16) {
                            relativeLayout12.getLayoutParams().height = iDpToPx5;
                            this.r1.getLayoutParams().height = iDpToPx5;
                            this.s1.getLayoutParams().height = iDpToPx5;
                        } else {
                            relativeLayout12.getLayoutParams().height = iDpToPx3;
                            this.r1.getLayoutParams().height = iDpToPx3;
                            this.s1.getLayoutParams().height = iDpToPx3;
                        }
                    }
                } else if (i3 == 7) {
                    if (z10) {
                        if (strA0.equals("Large")) {
                            this.q1.getLayoutParams().height = iDpToPx13;
                            this.r1.getLayoutParams().height = iDpToPx13;
                            this.s1.getLayoutParams().height = iDpToPx13;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.q1.getLayoutParams().height = iDpToPx11;
                            this.r1.getLayoutParams().height = iDpToPx11;
                            this.s1.getLayoutParams().height = iDpToPx11;
                        } else {
                            boolean zEquals17 = strA0.equals("Small");
                            RelativeLayout relativeLayout13 = this.q1;
                            if (zEquals17) {
                                relativeLayout13.getLayoutParams().height = iDpToPx9;
                                this.r1.getLayoutParams().height = iDpToPx9;
                                this.s1.getLayoutParams().height = iDpToPx9;
                            } else {
                                relativeLayout13.getLayoutParams().height = iDpToPx7;
                                this.r1.getLayoutParams().height = iDpToPx7;
                                this.s1.getLayoutParams().height = iDpToPx7;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx11;
                        this.r1.getLayoutParams().height = iDpToPx11;
                        this.s1.getLayoutParams().height = iDpToPx11;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx9;
                        this.r1.getLayoutParams().height = iDpToPx9;
                        this.s1.getLayoutParams().height = iDpToPx9;
                    } else {
                        boolean zEquals18 = strA0.equals("Small");
                        RelativeLayout relativeLayout14 = this.q1;
                        if (zEquals18) {
                            relativeLayout14.getLayoutParams().height = iDpToPx7;
                            this.r1.getLayoutParams().height = iDpToPx7;
                            this.s1.getLayoutParams().height = iDpToPx7;
                        } else {
                            relativeLayout14.getLayoutParams().height = iDpToPx5;
                            this.r1.getLayoutParams().height = iDpToPx5;
                            this.s1.getLayoutParams().height = iDpToPx5;
                        }
                    }
                } else if (i3 == 8) {
                    if (z10) {
                        if (strA0.equals("Large")) {
                            this.q1.getLayoutParams().height = iDpToPx15;
                            this.r1.getLayoutParams().height = iDpToPx15;
                            this.s1.getLayoutParams().height = iDpToPx15;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.q1.getLayoutParams().height = iDpToPx13;
                            this.r1.getLayoutParams().height = iDpToPx13;
                            this.s1.getLayoutParams().height = iDpToPx13;
                        } else {
                            boolean zEquals19 = strA0.equals("Small");
                            RelativeLayout relativeLayout15 = this.q1;
                            if (zEquals19) {
                                relativeLayout15.getLayoutParams().height = iDpToPx11;
                                this.r1.getLayoutParams().height = iDpToPx11;
                                this.s1.getLayoutParams().height = iDpToPx11;
                            } else {
                                relativeLayout15.getLayoutParams().height = iDpToPx9;
                                this.r1.getLayoutParams().height = iDpToPx9;
                                this.s1.getLayoutParams().height = iDpToPx9;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx13;
                        this.r1.getLayoutParams().height = iDpToPx13;
                        this.s1.getLayoutParams().height = iDpToPx13;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx11;
                        this.r1.getLayoutParams().height = iDpToPx11;
                        this.s1.getLayoutParams().height = iDpToPx11;
                    } else {
                        boolean zEquals20 = strA0.equals("Small");
                        RelativeLayout relativeLayout16 = this.q1;
                        if (zEquals20) {
                            relativeLayout16.getLayoutParams().height = iDpToPx9;
                            this.r1.getLayoutParams().height = iDpToPx9;
                            this.s1.getLayoutParams().height = iDpToPx9;
                        } else {
                            relativeLayout16.getLayoutParams().height = iDpToPx7;
                            this.r1.getLayoutParams().height = iDpToPx7;
                            this.s1.getLayoutParams().height = iDpToPx7;
                        }
                    }
                } else if (i3 == 9) {
                    if (z10) {
                        if (strA0.equals("Large")) {
                            this.q1.getLayoutParams().height = iDpToPx16;
                            this.r1.getLayoutParams().height = iDpToPx16;
                            this.s1.getLayoutParams().height = iDpToPx16;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.q1.getLayoutParams().height = iDpToPx14;
                            this.r1.getLayoutParams().height = iDpToPx14;
                            this.s1.getLayoutParams().height = iDpToPx14;
                        } else {
                            boolean zEquals21 = strA0.equals("Small");
                            RelativeLayout relativeLayout17 = this.q1;
                            if (zEquals21) {
                                relativeLayout17.getLayoutParams().height = iDpToPx12;
                                this.r1.getLayoutParams().height = iDpToPx12;
                                this.s1.getLayoutParams().height = iDpToPx12;
                            } else {
                                relativeLayout17.getLayoutParams().height = iDpToPx10;
                                this.r1.getLayoutParams().height = iDpToPx10;
                                this.s1.getLayoutParams().height = iDpToPx10;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx14;
                        this.r1.getLayoutParams().height = iDpToPx14;
                        this.s1.getLayoutParams().height = iDpToPx14;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx12;
                        this.r1.getLayoutParams().height = iDpToPx12;
                        this.s1.getLayoutParams().height = iDpToPx12;
                    } else {
                        boolean zEquals22 = strA0.equals("Small");
                        RelativeLayout relativeLayout18 = this.q1;
                        if (zEquals22) {
                            relativeLayout18.getLayoutParams().height = iDpToPx10;
                            this.r1.getLayoutParams().height = iDpToPx10;
                            this.s1.getLayoutParams().height = iDpToPx10;
                        } else {
                            relativeLayout18.getLayoutParams().height = iDpToPx8;
                            this.r1.getLayoutParams().height = iDpToPx8;
                            this.s1.getLayoutParams().height = iDpToPx8;
                        }
                    }
                } else if (i3 == 10) {
                    if (z10) {
                        if (strA0.equals("Large")) {
                            this.q1.getLayoutParams().height = iDpToPx17;
                            this.r1.getLayoutParams().height = iDpToPx17;
                            this.s1.getLayoutParams().height = iDpToPx17;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.q1.getLayoutParams().height = iDpToPx15;
                            this.r1.getLayoutParams().height = iDpToPx15;
                            this.s1.getLayoutParams().height = iDpToPx15;
                        } else {
                            boolean zEquals23 = strA0.equals("Small");
                            RelativeLayout relativeLayout19 = this.q1;
                            if (zEquals23) {
                                relativeLayout19.getLayoutParams().height = iDpToPx13;
                                this.r1.getLayoutParams().height = iDpToPx13;
                                this.s1.getLayoutParams().height = iDpToPx13;
                            } else {
                                relativeLayout19.getLayoutParams().height = iDpToPx11;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx15;
                        this.r1.getLayoutParams().height = iDpToPx15;
                        this.s1.getLayoutParams().height = iDpToPx15;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx13;
                        this.r1.getLayoutParams().height = iDpToPx13;
                        this.s1.getLayoutParams().height = iDpToPx13;
                    } else {
                        boolean zEquals24 = strA0.equals("Small");
                        RelativeLayout relativeLayout20 = this.q1;
                        if (zEquals24) {
                            relativeLayout20.getLayoutParams().height = iDpToPx11;
                            this.r1.getLayoutParams().height = iDpToPx11;
                            this.s1.getLayoutParams().height = iDpToPx11;
                        } else {
                            relativeLayout20.getLayoutParams().height = iDpToPx9;
                            this.r1.getLayoutParams().height = iDpToPx9;
                            this.s1.getLayoutParams().height = iDpToPx9;
                        }
                    }
                } else if (z10) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx18;
                        this.r1.getLayoutParams().height = iDpToPx18;
                        this.s1.getLayoutParams().height = iDpToPx18;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx16;
                        this.r1.getLayoutParams().height = iDpToPx16;
                        this.s1.getLayoutParams().height = iDpToPx16;
                    } else {
                        boolean zEquals25 = strA0.equals("Small");
                        RelativeLayout relativeLayout21 = this.q1;
                        if (zEquals25) {
                            relativeLayout21.getLayoutParams().height = iDpToPx14;
                            this.r1.getLayoutParams().height = iDpToPx14;
                            this.s1.getLayoutParams().height = iDpToPx14;
                        } else {
                            relativeLayout21.getLayoutParams().height = iDpToPx12;
                            this.r1.getLayoutParams().height = iDpToPx12;
                            this.s1.getLayoutParams().height = iDpToPx12;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx16;
                    this.r1.getLayoutParams().height = iDpToPx16;
                    this.s1.getLayoutParams().height = iDpToPx16;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx14;
                    this.r1.getLayoutParams().height = iDpToPx14;
                    this.s1.getLayoutParams().height = iDpToPx14;
                } else {
                    boolean zEquals26 = strA0.equals("Small");
                    RelativeLayout relativeLayout22 = this.q1;
                    if (zEquals26) {
                        relativeLayout22.getLayoutParams().height = iDpToPx12;
                        this.r1.getLayoutParams().height = iDpToPx12;
                        this.s1.getLayoutParams().height = iDpToPx12;
                    } else {
                        relativeLayout22.getLayoutParams().height = iDpToPx10;
                        this.r1.getLayoutParams().height = iDpToPx10;
                        this.s1.getLayoutParams().height = iDpToPx10;
                    }
                }
            } else if (z9) {
                if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx9;
                    this.r1.getLayoutParams().height = iDpToPx9;
                    this.s1.getLayoutParams().height = iDpToPx9;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx7;
                    this.r1.getLayoutParams().height = iDpToPx7;
                    this.s1.getLayoutParams().height = iDpToPx7;
                } else {
                    boolean zEquals27 = strA0.equals("Small");
                    RelativeLayout relativeLayout23 = this.q1;
                    if (zEquals27) {
                        relativeLayout23.getLayoutParams().height = iDpToPx5;
                        this.r1.getLayoutParams().height = iDpToPx5;
                        this.s1.getLayoutParams().height = iDpToPx5;
                    } else {
                        relativeLayout23.getLayoutParams().height = iDpToPx3;
                        this.r1.getLayoutParams().height = iDpToPx3;
                        this.s1.getLayoutParams().height = iDpToPx3;
                    }
                }
            } else if (strA0.equals("Large")) {
                this.q1.getLayoutParams().height = iDpToPx7;
                this.r1.getLayoutParams().height = iDpToPx7;
                this.s1.getLayoutParams().height = iDpToPx7;
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.q1.getLayoutParams().height = iDpToPx5;
                this.r1.getLayoutParams().height = iDpToPx5;
                this.s1.getLayoutParams().height = iDpToPx5;
            } else {
                boolean zEquals28 = strA0.equals("Small");
                RelativeLayout relativeLayout24 = this.q1;
                if (zEquals28) {
                    relativeLayout24.getLayoutParams().height = iDpToPx3;
                    this.r1.getLayoutParams().height = iDpToPx3;
                    this.s1.getLayoutParams().height = iDpToPx3;
                } else {
                    relativeLayout24.getLayoutParams().height = iDpToPx;
                    this.r1.getLayoutParams().height = iDpToPx;
                    this.s1.getLayoutParams().height = iDpToPx;
                }
            }
        } else {
            imageView12.setVisibility(8);
            this.T0.setVisibility(8);
            int i4 = zV0 ? 2 : 1;
            int i5 = i4 + 1;
            if (zI0) {
                i5 = i4 + 2;
            }
            if (zA0 || zK0 != 0) {
                i5++;
            }
            if (zG0 != 0) {
                i5++;
            }
            if (zF0 != 0) {
                i5++;
            }
            if (zH0 != 0) {
                i5++;
            }
            if (z) {
                i5++;
            }
            if (z5) {
                i5++;
            }
            if (i5 < 6) {
                if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.n2.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else if (strA0.equals("Small")) {
                    this.n2.setTextSize(0, HelperClass.dpToPx(this, 7));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 7));
                } else {
                    boolean zEquals29 = strA0.equals("Extra Small");
                    TextView textView12 = this.n2;
                    if (zEquals29) {
                        textView12.setTextSize(0, HelperClass.dpToPx(this, 6));
                        this.o2.setTextSize(0, HelperClass.dpToPx(this, 6));
                    } else {
                        textView12.setTextSize(0, HelperClass.dpToPx(this, 9));
                        this.o2.setTextSize(0, HelperClass.dpToPx(this, 9));
                    }
                }
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.n2.setTextSize(0, HelperClass.dpToPx(this, 10));
                this.o2.setTextSize(0, HelperClass.dpToPx(this, 10));
            } else if (strA0.equals("Small")) {
                this.n2.setTextSize(0, HelperClass.dpToPx(this, 9));
                this.o2.setTextSize(0, HelperClass.dpToPx(this, 9));
            } else {
                boolean zEquals30 = strA0.equals("Extra Small");
                TextView textView13 = this.n2;
                if (zEquals30) {
                    textView13.setTextSize(0, HelperClass.dpToPx(this, 8));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 8));
                } else {
                    textView13.setTextSize(0, HelperClass.dpToPx(this, 11));
                    this.o2.setTextSize(0, HelperClass.dpToPx(this, 11));
                }
            }
            HelperClass.dpToPx(this, 70);
            HelperClass.dpToPx(this, 75);
            HelperClass.dpToPx(this, 80);
            HelperClass.dpToPx(this, 85);
            int iDpToPx22 = HelperClass.dpToPx(this, 90);
            int iDpToPx23 = HelperClass.dpToPx(this, 95);
            int iDpToPx24 = HelperClass.dpToPx(this, 100);
            int iDpToPx25 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx26 = HelperClass.dpToPx(this, fh.k1);
            int iDpToPx27 = HelperClass.dpToPx(this, 115);
            int iDpToPx28 = HelperClass.dpToPx(this, 120);
            int iDpToPx29 = HelperClass.dpToPx(this, 125);
            int iDpToPx30 = HelperClass.dpToPx(this, 130);
            int iDpToPx31 = HelperClass.dpToPx(this, 135);
            int iDpToPx32 = HelperClass.dpToPx(this, 140);
            int iDpToPx33 = HelperClass.dpToPx(this, 145);
            int iDpToPx34 = HelperClass.dpToPx(this, 150);
            int iDpToPx35 = HelperClass.dpToPx(this, 155);
            int iDpToPx36 = HelperClass.dpToPx(this, 160);
            int iDpToPx37 = HelperClass.dpToPx(this, 165);
            int iDpToPx38 = HelperClass.dpToPx(this, 170);
            int iDpToPx39 = HelperClass.dpToPx(this, 175);
            int iDpToPx40 = HelperClass.dpToPx(this, SubsamplingScaleImageView.ORIENTATION_180);
            HelperClass.dpToPx(this, ModuleDescriptor.MODULE_VERSION);
            int iDpToPx41 = HelperClass.dpToPx(this, 190);
            boolean z11 = zM0 != 0 || zB0 != 0 || zO0 || zW0 || zQ0 || zJ0 || z4 || z3 || z2;
            if (C0()) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx41;
                        this.r1.getLayoutParams().height = iDpToPx41;
                        this.s1.getLayoutParams().height = iDpToPx41;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx40;
                        this.r1.getLayoutParams().height = iDpToPx40;
                        this.s1.getLayoutParams().height = iDpToPx40;
                    } else {
                        boolean zEquals31 = strA0.equals("Small");
                        RelativeLayout relativeLayout25 = this.q1;
                        if (zEquals31) {
                            relativeLayout25.getLayoutParams().height = iDpToPx38;
                            this.r1.getLayoutParams().height = iDpToPx38;
                            this.s1.getLayoutParams().height = iDpToPx38;
                        } else {
                            relativeLayout25.getLayoutParams().height = iDpToPx36;
                            this.r1.getLayoutParams().height = iDpToPx36;
                            this.s1.getLayoutParams().height = iDpToPx36;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx40;
                    this.r1.getLayoutParams().height = iDpToPx40;
                    this.s1.getLayoutParams().height = iDpToPx40;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx38;
                    this.r1.getLayoutParams().height = iDpToPx38;
                    this.s1.getLayoutParams().height = iDpToPx38;
                } else {
                    boolean zEquals32 = strA0.equals("Small");
                    RelativeLayout relativeLayout26 = this.q1;
                    if (zEquals32) {
                        relativeLayout26.getLayoutParams().height = iDpToPx36;
                        this.r1.getLayoutParams().height = iDpToPx36;
                        this.s1.getLayoutParams().height = iDpToPx36;
                    } else {
                        relativeLayout26.getLayoutParams().height = iDpToPx34;
                        this.r1.getLayoutParams().height = iDpToPx34;
                        this.s1.getLayoutParams().height = iDpToPx34;
                    }
                }
            } else if (i5 == 2) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx31;
                        this.r1.getLayoutParams().height = iDpToPx31;
                        this.s1.getLayoutParams().height = iDpToPx31;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx29;
                        this.r1.getLayoutParams().height = iDpToPx29;
                        this.s1.getLayoutParams().height = iDpToPx29;
                    } else {
                        boolean zEquals33 = strA0.equals("Small");
                        RelativeLayout relativeLayout27 = this.q1;
                        if (zEquals33) {
                            relativeLayout27.getLayoutParams().height = iDpToPx27;
                            this.r1.getLayoutParams().height = iDpToPx27;
                            this.s1.getLayoutParams().height = iDpToPx27;
                        } else {
                            relativeLayout27.getLayoutParams().height = iDpToPx25;
                            this.r1.getLayoutParams().height = iDpToPx25;
                            this.s1.getLayoutParams().height = iDpToPx25;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx29;
                    this.r1.getLayoutParams().height = iDpToPx29;
                    this.s1.getLayoutParams().height = iDpToPx29;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx27;
                    this.r1.getLayoutParams().height = iDpToPx27;
                    this.s1.getLayoutParams().height = iDpToPx27;
                } else {
                    boolean zEquals34 = strA0.equals("Small");
                    RelativeLayout relativeLayout28 = this.q1;
                    if (zEquals34) {
                        relativeLayout28.getLayoutParams().height = iDpToPx25;
                        this.r1.getLayoutParams().height = iDpToPx25;
                        this.s1.getLayoutParams().height = iDpToPx25;
                    } else {
                        relativeLayout28.getLayoutParams().height = iDpToPx23;
                        this.r1.getLayoutParams().height = iDpToPx23;
                        this.s1.getLayoutParams().height = iDpToPx23;
                    }
                }
            } else if (i5 == 3) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx30;
                        this.r1.getLayoutParams().height = iDpToPx30;
                        this.s1.getLayoutParams().height = iDpToPx30;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx28;
                        this.r1.getLayoutParams().height = iDpToPx28;
                        this.s1.getLayoutParams().height = iDpToPx28;
                    } else {
                        boolean zEquals35 = strA0.equals("Small");
                        RelativeLayout relativeLayout29 = this.q1;
                        if (zEquals35) {
                            relativeLayout29.getLayoutParams().height = iDpToPx26;
                            this.r1.getLayoutParams().height = iDpToPx26;
                            this.s1.getLayoutParams().height = iDpToPx26;
                        } else {
                            relativeLayout29.getLayoutParams().height = iDpToPx24;
                            this.r1.getLayoutParams().height = iDpToPx24;
                            this.s1.getLayoutParams().height = iDpToPx24;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx28;
                    this.r1.getLayoutParams().height = iDpToPx28;
                    this.s1.getLayoutParams().height = iDpToPx28;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx26;
                    this.r1.getLayoutParams().height = iDpToPx26;
                    this.s1.getLayoutParams().height = iDpToPx26;
                } else {
                    boolean zEquals36 = strA0.equals("Small");
                    RelativeLayout relativeLayout30 = this.q1;
                    if (zEquals36) {
                        relativeLayout30.getLayoutParams().height = iDpToPx24;
                        this.r1.getLayoutParams().height = iDpToPx24;
                        this.s1.getLayoutParams().height = iDpToPx24;
                    } else {
                        relativeLayout30.getLayoutParams().height = iDpToPx22;
                        this.r1.getLayoutParams().height = iDpToPx22;
                        this.s1.getLayoutParams().height = iDpToPx22;
                    }
                }
            } else if (i5 == 4) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx30;
                        this.r1.getLayoutParams().height = iDpToPx30;
                        this.s1.getLayoutParams().height = iDpToPx30;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx28;
                        this.r1.getLayoutParams().height = iDpToPx28;
                        this.s1.getLayoutParams().height = iDpToPx28;
                    } else {
                        boolean zEquals37 = strA0.equals("Small");
                        RelativeLayout relativeLayout31 = this.q1;
                        if (zEquals37) {
                            relativeLayout31.getLayoutParams().height = iDpToPx26;
                            this.r1.getLayoutParams().height = iDpToPx26;
                            this.s1.getLayoutParams().height = iDpToPx26;
                        } else {
                            relativeLayout31.getLayoutParams().height = iDpToPx24;
                            this.r1.getLayoutParams().height = iDpToPx24;
                            this.s1.getLayoutParams().height = iDpToPx24;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx28;
                    this.r1.getLayoutParams().height = iDpToPx28;
                    this.s1.getLayoutParams().height = iDpToPx28;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx26;
                    this.r1.getLayoutParams().height = iDpToPx26;
                    this.s1.getLayoutParams().height = iDpToPx26;
                } else {
                    boolean zEquals38 = strA0.equals("Small");
                    RelativeLayout relativeLayout32 = this.q1;
                    if (zEquals38) {
                        relativeLayout32.getLayoutParams().height = iDpToPx24;
                        this.r1.getLayoutParams().height = iDpToPx24;
                        this.s1.getLayoutParams().height = iDpToPx24;
                    } else {
                        relativeLayout32.getLayoutParams().height = iDpToPx22;
                        this.r1.getLayoutParams().height = iDpToPx22;
                        this.s1.getLayoutParams().height = iDpToPx22;
                    }
                }
            } else if (i5 == 5) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx30;
                        this.r1.getLayoutParams().height = iDpToPx30;
                        this.s1.getLayoutParams().height = iDpToPx30;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx28;
                        this.r1.getLayoutParams().height = iDpToPx28;
                        this.s1.getLayoutParams().height = iDpToPx28;
                    } else {
                        boolean zEquals39 = strA0.equals("Small");
                        RelativeLayout relativeLayout33 = this.q1;
                        if (zEquals39) {
                            relativeLayout33.getLayoutParams().height = iDpToPx26;
                            this.r1.getLayoutParams().height = iDpToPx26;
                            this.s1.getLayoutParams().height = iDpToPx26;
                        } else {
                            relativeLayout33.getLayoutParams().height = iDpToPx24;
                            this.r1.getLayoutParams().height = iDpToPx24;
                            this.s1.getLayoutParams().height = iDpToPx24;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx28;
                    this.r1.getLayoutParams().height = iDpToPx28;
                    this.s1.getLayoutParams().height = iDpToPx28;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx26;
                    this.r1.getLayoutParams().height = iDpToPx26;
                    this.s1.getLayoutParams().height = iDpToPx26;
                } else {
                    boolean zEquals40 = strA0.equals("Small");
                    RelativeLayout relativeLayout34 = this.q1;
                    if (zEquals40) {
                        relativeLayout34.getLayoutParams().height = iDpToPx24;
                        this.r1.getLayoutParams().height = iDpToPx24;
                        this.s1.getLayoutParams().height = iDpToPx24;
                    } else {
                        relativeLayout34.getLayoutParams().height = iDpToPx22;
                        this.r1.getLayoutParams().height = iDpToPx22;
                        this.s1.getLayoutParams().height = iDpToPx22;
                    }
                }
            } else if (i5 == 6) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx32;
                        this.r1.getLayoutParams().height = iDpToPx32;
                        this.s1.getLayoutParams().height = iDpToPx32;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx30;
                        this.r1.getLayoutParams().height = iDpToPx30;
                        this.s1.getLayoutParams().height = iDpToPx30;
                    } else {
                        boolean zEquals41 = strA0.equals("Small");
                        RelativeLayout relativeLayout35 = this.q1;
                        if (zEquals41) {
                            relativeLayout35.getLayoutParams().height = iDpToPx28;
                            this.r1.getLayoutParams().height = iDpToPx28;
                            this.s1.getLayoutParams().height = iDpToPx28;
                        } else {
                            relativeLayout35.getLayoutParams().height = iDpToPx26;
                            this.r1.getLayoutParams().height = iDpToPx26;
                            this.s1.getLayoutParams().height = iDpToPx26;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx30;
                    this.r1.getLayoutParams().height = iDpToPx30;
                    this.s1.getLayoutParams().height = iDpToPx30;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx28;
                    this.r1.getLayoutParams().height = iDpToPx28;
                    this.s1.getLayoutParams().height = iDpToPx28;
                } else {
                    boolean zEquals42 = strA0.equals("Small");
                    RelativeLayout relativeLayout36 = this.q1;
                    if (zEquals42) {
                        relativeLayout36.getLayoutParams().height = iDpToPx26;
                        this.r1.getLayoutParams().height = iDpToPx26;
                        this.s1.getLayoutParams().height = iDpToPx26;
                    } else {
                        relativeLayout36.getLayoutParams().height = iDpToPx24;
                        this.r1.getLayoutParams().height = iDpToPx24;
                        this.s1.getLayoutParams().height = iDpToPx24;
                    }
                }
            } else if (i5 == 7) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx34;
                        this.r1.getLayoutParams().height = iDpToPx34;
                        this.s1.getLayoutParams().height = iDpToPx34;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx32;
                        this.r1.getLayoutParams().height = iDpToPx32;
                        this.s1.getLayoutParams().height = iDpToPx32;
                    } else {
                        boolean zEquals43 = strA0.equals("Small");
                        RelativeLayout relativeLayout37 = this.q1;
                        if (zEquals43) {
                            relativeLayout37.getLayoutParams().height = iDpToPx30;
                            this.r1.getLayoutParams().height = iDpToPx30;
                            this.s1.getLayoutParams().height = iDpToPx30;
                        } else {
                            relativeLayout37.getLayoutParams().height = iDpToPx28;
                            this.r1.getLayoutParams().height = iDpToPx28;
                            this.s1.getLayoutParams().height = iDpToPx28;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx32;
                    this.r1.getLayoutParams().height = iDpToPx32;
                    this.s1.getLayoutParams().height = iDpToPx32;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx30;
                    this.r1.getLayoutParams().height = iDpToPx30;
                    this.s1.getLayoutParams().height = iDpToPx30;
                } else {
                    boolean zEquals44 = strA0.equals("Small");
                    RelativeLayout relativeLayout38 = this.q1;
                    if (zEquals44) {
                        relativeLayout38.getLayoutParams().height = iDpToPx28;
                        this.r1.getLayoutParams().height = iDpToPx28;
                        this.s1.getLayoutParams().height = iDpToPx28;
                    } else {
                        relativeLayout38.getLayoutParams().height = iDpToPx26;
                        this.r1.getLayoutParams().height = iDpToPx26;
                        this.s1.getLayoutParams().height = iDpToPx26;
                    }
                }
            } else if (i5 == 8) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx36;
                        this.r1.getLayoutParams().height = iDpToPx36;
                        this.s1.getLayoutParams().height = iDpToPx36;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx34;
                        this.r1.getLayoutParams().height = iDpToPx34;
                        this.s1.getLayoutParams().height = iDpToPx34;
                    } else {
                        boolean zEquals45 = strA0.equals("Small");
                        RelativeLayout relativeLayout39 = this.q1;
                        if (zEquals45) {
                            relativeLayout39.getLayoutParams().height = iDpToPx32;
                            this.r1.getLayoutParams().height = iDpToPx32;
                            this.s1.getLayoutParams().height = iDpToPx32;
                        } else {
                            relativeLayout39.getLayoutParams().height = iDpToPx30;
                            this.r1.getLayoutParams().height = iDpToPx30;
                            this.s1.getLayoutParams().height = iDpToPx30;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx34;
                    this.r1.getLayoutParams().height = iDpToPx34;
                    this.s1.getLayoutParams().height = iDpToPx34;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx32;
                    this.r1.getLayoutParams().height = iDpToPx32;
                    this.s1.getLayoutParams().height = iDpToPx32;
                } else {
                    boolean zEquals46 = strA0.equals("Small");
                    RelativeLayout relativeLayout40 = this.q1;
                    if (zEquals46) {
                        relativeLayout40.getLayoutParams().height = iDpToPx30;
                        this.r1.getLayoutParams().height = iDpToPx30;
                        this.s1.getLayoutParams().height = iDpToPx30;
                    } else {
                        relativeLayout40.getLayoutParams().height = iDpToPx28;
                        this.r1.getLayoutParams().height = iDpToPx28;
                        this.s1.getLayoutParams().height = iDpToPx28;
                    }
                }
            } else if (i5 == 9) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx37;
                        this.r1.getLayoutParams().height = iDpToPx37;
                        this.s1.getLayoutParams().height = iDpToPx37;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx35;
                        this.r1.getLayoutParams().height = iDpToPx35;
                        this.s1.getLayoutParams().height = iDpToPx35;
                    } else {
                        boolean zEquals47 = strA0.equals("Small");
                        RelativeLayout relativeLayout41 = this.q1;
                        if (zEquals47) {
                            relativeLayout41.getLayoutParams().height = iDpToPx33;
                            this.r1.getLayoutParams().height = iDpToPx33;
                            this.s1.getLayoutParams().height = iDpToPx33;
                        } else {
                            relativeLayout41.getLayoutParams().height = iDpToPx31;
                            this.r1.getLayoutParams().height = iDpToPx31;
                            this.s1.getLayoutParams().height = iDpToPx31;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx35;
                    this.r1.getLayoutParams().height = iDpToPx35;
                    this.s1.getLayoutParams().height = iDpToPx35;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx33;
                    this.r1.getLayoutParams().height = iDpToPx33;
                    this.s1.getLayoutParams().height = iDpToPx33;
                } else {
                    boolean zEquals48 = strA0.equals("Small");
                    RelativeLayout relativeLayout42 = this.q1;
                    if (zEquals48) {
                        relativeLayout42.getLayoutParams().height = iDpToPx31;
                        this.r1.getLayoutParams().height = iDpToPx31;
                        this.s1.getLayoutParams().height = iDpToPx31;
                    } else {
                        relativeLayout42.getLayoutParams().height = iDpToPx29;
                        this.r1.getLayoutParams().height = iDpToPx29;
                        this.s1.getLayoutParams().height = iDpToPx29;
                    }
                }
            } else if (i5 == 10) {
                if (z11) {
                    if (strA0.equals("Large")) {
                        this.q1.getLayoutParams().height = iDpToPx38;
                        this.r1.getLayoutParams().height = iDpToPx38;
                        this.s1.getLayoutParams().height = iDpToPx38;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.q1.getLayoutParams().height = iDpToPx36;
                        this.r1.getLayoutParams().height = iDpToPx36;
                        this.s1.getLayoutParams().height = iDpToPx36;
                    } else {
                        boolean zEquals49 = strA0.equals("Small");
                        RelativeLayout relativeLayout43 = this.q1;
                        if (zEquals49) {
                            relativeLayout43.getLayoutParams().height = iDpToPx34;
                            this.r1.getLayoutParams().height = iDpToPx34;
                            this.s1.getLayoutParams().height = iDpToPx34;
                        } else {
                            relativeLayout43.getLayoutParams().height = iDpToPx32;
                            this.r1.getLayoutParams().height = iDpToPx32;
                            this.s1.getLayoutParams().height = iDpToPx32;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx36;
                    this.r1.getLayoutParams().height = iDpToPx36;
                    this.s1.getLayoutParams().height = iDpToPx36;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx34;
                    this.r1.getLayoutParams().height = iDpToPx34;
                    this.s1.getLayoutParams().height = iDpToPx34;
                } else {
                    boolean zEquals50 = strA0.equals("Small");
                    RelativeLayout relativeLayout44 = this.q1;
                    if (zEquals50) {
                        relativeLayout44.getLayoutParams().height = iDpToPx32;
                        this.r1.getLayoutParams().height = iDpToPx32;
                        this.s1.getLayoutParams().height = iDpToPx32;
                    } else {
                        relativeLayout44.getLayoutParams().height = iDpToPx30;
                        this.r1.getLayoutParams().height = iDpToPx30;
                        this.s1.getLayoutParams().height = iDpToPx30;
                    }
                }
            } else if (z11) {
                if (strA0.equals("Large")) {
                    this.q1.getLayoutParams().height = iDpToPx39;
                    this.r1.getLayoutParams().height = iDpToPx39;
                    this.s1.getLayoutParams().height = iDpToPx39;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.q1.getLayoutParams().height = iDpToPx37;
                    this.r1.getLayoutParams().height = iDpToPx37;
                    this.s1.getLayoutParams().height = iDpToPx37;
                } else {
                    boolean zEquals51 = strA0.equals("Small");
                    RelativeLayout relativeLayout45 = this.q1;
                    if (zEquals51) {
                        relativeLayout45.getLayoutParams().height = iDpToPx35;
                        this.r1.getLayoutParams().height = iDpToPx35;
                        this.s1.getLayoutParams().height = iDpToPx35;
                    } else {
                        relativeLayout45.getLayoutParams().height = iDpToPx33;
                        this.r1.getLayoutParams().height = iDpToPx33;
                        this.s1.getLayoutParams().height = iDpToPx33;
                    }
                }
            } else if (strA0.equals("Large")) {
                this.q1.getLayoutParams().height = iDpToPx37;
                this.r1.getLayoutParams().height = iDpToPx37;
                this.s1.getLayoutParams().height = iDpToPx37;
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.q1.getLayoutParams().height = iDpToPx35;
                this.r1.getLayoutParams().height = iDpToPx35;
                this.s1.getLayoutParams().height = iDpToPx35;
            } else {
                boolean zEquals52 = strA0.equals("Small");
                RelativeLayout relativeLayout46 = this.q1;
                if (zEquals52) {
                    relativeLayout46.getLayoutParams().height = iDpToPx33;
                    this.r1.getLayoutParams().height = iDpToPx33;
                    this.s1.getLayoutParams().height = iDpToPx33;
                } else {
                    relativeLayout46.getLayoutParams().height = iDpToPx31;
                    this.r1.getLayoutParams().height = iDpToPx31;
                    this.s1.getLayoutParams().height = iDpToPx31;
                }
            }
        }
        this.e1.setVisibility(0);
        this.a1.setOrientation(1);
        this.a1.setGravity(19);
        this.a1.getLayoutParams().width = -2;
        this.a1.getLayoutParams().width = -2;
        this.d1.setVisibility(0);
        h1();
        this.B.setVisibility(0);
        this.q1.setVisibility(0);
    }

    public final int W() {
        return jb5.j(this, this, "sequence value", 1);
    }

    public final void W0() {
        this.b0.setText((T() + " " + W() + " " + b0()).trim());
    }

    public final int X() {
        return jb5.j(this, this, "Short Address Color", -1);
    }

    public final void X0() {
        if (O().isEmpty() || O().equals(zXAusrmFrBIQHr.vhm)) {
            this.l4.setBoolean(this, "is_Person_Name", false);
            this.y0.setImageResource(R.drawable.ic_uncheck_box_tple);
            this.c0.setText("ex. John Doe");
        } else {
            this.c0.setText(O());
        }
        int i = this.f3;
        if (i == 2) {
            b1();
            return;
        }
        if (i == 3) {
            V0();
        } else if (i == 4) {
            R0();
        } else {
            d1();
        }
    }

    public final int Y() {
        return jb5.j(this, this, "SoundLevel Color", -1);
    }

    public final void Y0() {
        String string = this.l4.getString(this, SP.PLUS_CODE, "");
        if (string.isEmpty()) {
            this.Y.setText("-");
        } else {
            boolean zEquals = Q().equals(Default.PLUSCODE_TYPE);
            TextView textView = this.Y;
            if (zEquals) {
                textView.setText(string);
            } else {
                textView.setText(string.substring(4));
            }
        }
        int i = this.f3;
        if (i == 2) {
            b1();
            return;
        }
        if (i == 3) {
            V0();
        } else if (i == 4) {
            R0();
        } else {
            d1();
        }
    }

    public final String Z() {
        return this.l4.getString(this, "pos_type_temp", "Bottom");
    }

    public final void Z0() {
        LinearLayout.LayoutParams layoutParams;
        String string;
        int iK = K();
        String strA0 = a0();
        HelperClass.isTablet(this);
        new LinearLayout.LayoutParams(-1, -2);
        if (strA0.equals("Large")) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_110));
        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_100), (int) getResources().getDimension(R.dimen.stamp_icon_size_100));
        } else {
            layoutParams = strA0.equals("Small") ? new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_90), (int) getResources().getDimension(R.dimen.stamp_icon_size_90)) : new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_80), (int) getResources().getDimension(R.dimen.stamp_icon_size_80));
        }
        boolean zE0 = E0();
        RelativeLayout relativeLayout = this.z1;
        if (!zE0) {
            relativeLayout.setVisibility(8);
            this.A1.setVisibility(8);
            RelativeLayout relativeLayout2 = this.x1;
            if (iK == 0) {
                relativeLayout2.setVisibility(0);
                this.y1.setVisibility(8);
                this.x1.setLayoutParams(layoutParams);
            } else {
                relativeLayout2.setVisibility(8);
                this.y1.setVisibility(0);
                this.y1.setLayoutParams(layoutParams);
            }
        } else if (iK == 0) {
            relativeLayout.setVisibility(0);
            this.x1.setVisibility(0);
            this.A1.setVisibility(8);
            this.y1.setVisibility(8);
            this.x1.setLayoutParams(layoutParams);
            this.z1.setLayoutParams(layoutParams);
        } else {
            relativeLayout.setVisibility(8);
            this.x1.setVisibility(8);
            this.A1.setVisibility(0);
            this.y1.setVisibility(0);
            this.y1.setLayoutParams(layoutParams);
            this.A1.setLayoutParams(layoutParams);
        }
        this.f1.getLayoutParams().height = layoutParams.height;
        String string2 = this.l4.getString(this, SP.LATITUDE, "0.0");
        String string3 = this.l4.getString(this, SP.LONGITUDE, "0.0");
        if (!string2.isEmpty() && !string3.isEmpty()) {
            utils utilsVar = new utils();
            Bitmap bitmapGenerateMapQr = utilsVar.generateMapQr(utilsVar.getMapLink(Double.parseDouble(string2), Double.parseDouble(string3)));
            this.B1.setImageBitmap(bitmapGenerateMapQr);
            this.C1.setImageBitmap(bitmapGenerateMapQr);
        }
        this.d1.setVisibility(0);
        this.B.setVisibility(0);
        this.f1.setVisibility(0);
        String strTrim = this.l4.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.l4.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.l4.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.l4.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.l4.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
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
        if (z0() && (string = this.l4.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (r0()) {
            strTrim = strTrim.isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        if (u0()) {
            if (t0()) {
                strTrim3 = strTrim.isEmpty() ? eo7.j(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (t0()) {
            strTrim3 = strTrim.isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!s0()) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.isEmpty()) {
            strTrim4 = "Loading...";
        }
        String strX = strTrim4.isEmpty() ? "" : x(u(), eo7.x("<strong>", strTrim4, "</strong>"));
        String strX2 = x(G(), this.T3.getLatLong(this, F()));
        Log.e("latLong111 : ", strX2);
        if (F() != 6 && F() != 7 && strX2.length() > 55 && E0()) {
            String[] strArrSplit = strX2.split(" Long");
            strX2 = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        if (v0()) {
            strX2 = eo7.x(strX, "<br/>", strX2);
        }
        if (A0()) {
            strX2 = eo7.x(strX2, "<br/>", x(C(), HelperClass.setDateTimeFormat(this, B())));
        }
        if (F0()) {
            strX2 = eo7.x(strX2, "<br/>", x(M(), k0()));
        }
        if (strX2.contains("null")) {
            strX2 = strX2.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.B.setText(Html.fromHtml(strX2));
            return;
        }
        SpannableString spannableString = new SpannableString(strConcat);
        spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(X()), 0, strConcat.length(), 0);
        Html.fromHtml("<br/>" + strX2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strX2));
        this.B.setText(spannableStringBuilder);
    }

    public final String a0() {
        return this.l4.getString(this, "size_type_temp", Default.TEMPLATE_SIZE);
    }

    public final void a1() {
        if (K() == 0) {
            this.r4.setText(V());
        } else {
            this.s4.setText(V());
        }
        this.V.setText(V());
    }

    public final String b0() {
        return new SP(this).getString(this, "suffix", "");
    }

    public final void b1() {
        boolean z;
        boolean z2;
        boolean z3;
        LinearLayout.LayoutParams layoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        v0();
        int iK = K();
        boolean zI0 = I0();
        boolean zD0 = D0();
        H0();
        boolean zX0 = x0();
        boolean zL0 = L0();
        A0();
        K0();
        boolean zG0 = G0();
        boolean zC0 = C0();
        boolean zF0 = F0();
        boolean zM0 = M0();
        boolean zB0 = B0();
        boolean zO0 = O0();
        N0();
        boolean zW0 = w0();
        boolean zQ0 = q0();
        boolean zJ0 = J0();
        String strV = V();
        String strA0 = a0();
        boolean zIsTablet = HelperClass.isTablet(this);
        LinearLayout linearLayout = this.j1;
        if (iK == 0) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.k1.getLayoutParams();
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21, -1);
            layoutParams3.removeRule(20);
            layoutParams3.addRule(21, -1);
            this.j1.setLayoutParams(layoutParams2);
            this.k1.setLayoutParams(layoutParams3);
        } else {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.k1.getLayoutParams();
            layoutParams4.removeRule(21);
            layoutParams4.addRule(20, -1);
            layoutParams5.removeRule(21);
            layoutParams5.addRule(20, -1);
            this.j1.setLayoutParams(layoutParams4);
            this.k1.setLayoutParams(layoutParams5);
        }
        if (strA0.equals("Small") || strA0.equals(Default.TEMPLATE_SIZE)) {
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.j2.getLayoutParams();
            layoutParams6.height = HelperClass.dpToPx(this, 20);
            layoutParams6.width = HelperClass.dpToPx(this, 20);
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
            layoutParams7.height = HelperClass.dpToPx(this, 20);
            layoutParams7.width = HelperClass.dpToPx(this, 20);
            this.l2.setTextSize(7.0f);
            this.m2.setTextSize(7.0f);
        } else {
            boolean zEquals = strA0.equals("Extra Small");
            ImageView imageView = this.j2;
            if (zEquals) {
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams8.height = HelperClass.dpToPx(this, 14);
                layoutParams8.width = HelperClass.dpToPx(this, 14);
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams9.height = HelperClass.dpToPx(this, 14);
                layoutParams9.width = HelperClass.dpToPx(this, 14);
                this.l2.setTextSize(5.0f);
                this.m2.setTextSize(5.0f);
            } else {
                LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams10.height = HelperClass.dpToPx(this, 24);
                layoutParams10.width = HelperClass.dpToPx(this, 24);
                LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams11.height = HelperClass.dpToPx(this, 24);
                layoutParams11.width = HelperClass.dpToPx(this, 24);
                this.l2.setTextSize(9.0f);
                this.m2.setTextSize(9.0f);
            }
        }
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
        if (strA0.equals("Large")) {
            z = zF0;
            z2 = zM0;
            z3 = zB0;
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_130));
        } else {
            z = zF0;
            z2 = zM0;
            z3 = zB0;
            if (strA0.equals(Default.TEMPLATE_SIZE)) {
                layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_100));
            } else {
                layoutParams = strA0.equals("Small") ? new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_80)) : new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_90), (int) getResources().getDimension(R.dimen.stamp_60dp));
            }
        }
        if (this.h3) {
            LinearLayout linearLayout2 = this.g1;
            if (iK == 0) {
                linearLayout2.setVisibility(0);
                this.h1.setVisibility(8);
                layoutParams12.setMargins(0, 0, 0, 0);
                layoutParams.setMargins((int) getResources().getDimension(R.dimen._4dp), 0, 0, 0);
                layoutParams.gravity = 80;
                boolean zEquals2 = strA0.equals("Large");
                LinearLayout linearLayout3 = this.d1;
                if (zEquals2) {
                    i = 0;
                    linearLayout3.setPadding(0, (int) getResources().getDimension(R.dimen._8dp), 0, (int) getResources().getDimension(R.dimen._8dp));
                } else {
                    i = 0;
                    linearLayout3.setPadding(0, (int) getResources().getDimension(R.dimen._16dp), 0, (int) getResources().getDimension(R.dimen._16dp));
                }
                this.g1.setLayoutParams(layoutParams);
            } else {
                zO0 = zO0;
                linearLayout2.setVisibility(8);
                this.h1.setVisibility(0);
                layoutParams12.setMargins(0, 0, 0, 0);
                layoutParams.setMargins(0, 0, (int) getResources().getDimension(R.dimen._4dp), 0);
                layoutParams.gravity = 80;
                boolean zEquals3 = strA0.equals("Large");
                LinearLayout linearLayout4 = this.d1;
                if (zEquals3) {
                    i = 0;
                    linearLayout4.setPadding(0, (int) getResources().getDimension(R.dimen._8dp), 0, (int) getResources().getDimension(R.dimen._8dp));
                } else {
                    i = 0;
                    linearLayout4.setPadding(0, (int) getResources().getDimension(R.dimen._16dp), 0, (int) getResources().getDimension(R.dimen._16dp));
                }
                this.h1.setLayoutParams(layoutParams);
            }
        } else {
            zO0 = zO0;
            i = 0;
        }
        this.f1.setLayoutParams(layoutParams12);
        LinearLayout linearLayout5 = this.c1;
        if (zL0 != 0) {
            linearLayout5.setVisibility(i);
            i2 = 8;
        } else {
            i2 = 8;
            linearLayout5.setVisibility(8);
        }
        if (z3 || zQ0 || zW0 || z2 || zO0 || zJ0) {
            this.o1.setVisibility(0);
            if (zIsTablet) {
                ((LinearLayout.LayoutParams) this.o1.getLayoutParams()).height++;
            }
        } else {
            this.o1.setVisibility(i2);
        }
        LinearLayout linearLayout6 = this.n1;
        if (z3) {
            i4 = 0;
            linearLayout6.setVisibility(0);
            i3 = 8;
        } else {
            i3 = 8;
            i4 = 0;
            linearLayout6.setVisibility(8);
        }
        LinearLayout linearLayout7 = this.m1;
        if (z2) {
            linearLayout7.setVisibility(i4);
        } else {
            linearLayout7.setVisibility(i3);
        }
        LinearLayout linearLayout8 = this.l1;
        if (zO0) {
            linearLayout8.setVisibility(i4);
        } else {
            linearLayout8.setVisibility(i3);
        }
        this.r4.setText(strV);
        this.s4.setText(strV);
        this.r4.setTextColor(new SP(this).getInteger(this, "report_tag_color", -1));
        this.s4.setTextColor(new SP(this).getInteger(this, "report_tag_color", -1));
        GradientDrawable gradientDrawable = (GradientDrawable) this.r4.getBackground().getCurrent();
        gradientDrawable.setCornerRadius(12.0f);
        SP sp = new SP(this);
        int i8 = Default.RBG_COLOR;
        gradientDrawable.setColor(sp.getInteger(this, "report_bg_color", i8));
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.s4.getBackground().getCurrent();
        gradientDrawable2.setCornerRadius(12.0f);
        gradientDrawable2.setColor(new SP(this).getInteger(this, "report_bg_color", i8));
        if (zJ0) {
            String soundLevel = HelperClass.getSoundLevel(this);
            if (this.l1.getVisibility() == 8) {
                this.l1.setVisibility(0);
                this.o0.setImageResource(R.drawable.sound_wave);
                this.d0.setText(soundLevel);
                this.d0.setTextColor(Y());
            } else if (this.m1.getVisibility() == 8) {
                this.m1.setVisibility(0);
                this.q0.setImageResource(R.drawable.sound_wave);
                this.C.setText(soundLevel);
                this.C.setTextColor(Y());
            } else if (this.n1.getVisibility() == 8) {
                this.n1.setVisibility(0);
                this.r0.setImageResource(R.drawable.sound_wave);
                this.W.setText(soundLevel);
                this.W.setTextColor(Y());
            }
        }
        if (zW0) {
            String altitudeconvert = HelperClass.getAltitudeconvert(this, i0());
            if (this.l1.getVisibility() == 8) {
                this.l1.setVisibility(0);
                this.o0.setImageResource(R.drawable.ic_altitiude);
                this.d0.setText(altitudeconvert);
                this.d0.setTextColor(v());
            } else if (this.m1.getVisibility() == 8) {
                this.m1.setVisibility(0);
                this.q0.setImageResource(R.drawable.ic_altitiude);
                this.C.setText(altitudeconvert);
                this.C.setTextColor(v());
            } else if (this.n1.getVisibility() == 8) {
                this.n1.setVisibility(0);
                this.r0.setImageResource(R.drawable.ic_altitiude);
                this.W.setText(altitudeconvert);
                this.W.setTextColor(v());
            }
        }
        if (zQ0) {
            String accuracy = HelperClass.getAccuracy(this, h0());
            if (this.l1.getVisibility() == 8) {
                this.l1.setVisibility(0);
                this.o0.setImageResource(R.drawable.ic_accuracy);
                this.d0.setText(accuracy);
                this.d0.setTextColor(t());
            } else if (this.m1.getVisibility() == 8) {
                this.m1.setVisibility(0);
                this.q0.setImageResource(R.drawable.ic_accuracy);
                this.C.setText(accuracy);
                this.C.setTextColor(t());
            } else if (this.n1.getVisibility() == 8) {
                this.n1.setVisibility(0);
                this.r0.setImageResource(R.drawable.ic_accuracy);
                this.W.setText(accuracy);
                this.W.setTextColor(t());
            }
        }
        if (z3) {
            this.W.setTextColor(E());
        }
        if (z2) {
            this.C.setTextColor(g0());
        }
        if (zO0) {
            this.d0.setTextColor(U());
        }
        boolean z4 = this.u3;
        LinearLayout linearLayout9 = this.b1;
        if (z4) {
            if (zD0) {
                i7 = 0;
                linearLayout9.setVisibility(0);
                i5 = 8;
            } else {
                i5 = 8;
                i7 = 0;
                linearLayout9.setVisibility(8);
            }
            LinearLayout linearLayout10 = this.Y0;
            if (zX0) {
                linearLayout10.setVisibility(i7);
            } else {
                linearLayout10.setVisibility(i5);
            }
        } else {
            i5 = 8;
            linearLayout9.setVisibility(8);
            this.Y0.setVisibility(8);
            this.g2.setVisibility(8);
            this.h2.setVisibility(8);
        }
        if (zL0 || zD0 != 0 || zX0 != 0 || zC0) {
            i6 = 0;
            this.a1.setVisibility(0);
        } else {
            this.a1.setVisibility(i5);
            i6 = 0;
        }
        LinearLayout linearLayout11 = this.Z0;
        if (zC0 != 0) {
            linearLayout11.setVisibility(i6);
        } else {
            linearLayout11.setVisibility(8);
        }
        if (strA0.equals(Default.TEMPLATE_SIZE)) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 30);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 58);
            this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.C.setTextSize(8.0f);
            this.d0.setTextSize(8.0f);
            this.r4.setTextSize(8.0f);
            this.s4.setTextSize(8.0f);
            this.W.setTextSize(8.0f);
            this.D.setTextSize(8.0f);
            this.H.setTextSize(8.0f);
            this.J.setTextSize(8.0f);
        } else if (strA0.equals("Small")) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 28);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 54);
            this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.C.setTextSize(7.0f);
            this.d0.setTextSize(7.0f);
            this.r4.setTextSize(7.0f);
            this.s4.setTextSize(7.0f);
            this.W.setTextSize(7.0f);
            this.D.setTextSize(7.0f);
            this.H.setTextSize(7.0f);
            this.J.setTextSize(7.0f);
        } else {
            boolean zEquals4 = strA0.equals("Extra Small");
            ImageView imageView2 = this.S0;
            if (zEquals4) {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 26);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 50);
                this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.C.setTextSize(6.0f);
                this.d0.setTextSize(6.0f);
                this.r4.setTextSize(6.0f);
                this.s4.setTextSize(6.0f);
                this.W.setTextSize(6.0f);
                this.D.setTextSize(6.0f);
                this.H.setTextSize(6.0f);
                this.J.setTextSize(6.0f);
            } else {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 32);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 62);
                this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.C.setTextSize(10.0f);
                this.d0.setTextSize(10.0f);
                this.r4.setTextSize(10.0f);
                this.s4.setTextSize(10.0f);
                this.W.setTextSize(10.0f);
                this.D.setTextSize(10.0f);
                this.H.setTextSize(10.0f);
                this.J.setTextSize(10.0f);
            }
        }
        String str = T() + " " + W() + " " + b0();
        if (zC0 != 0) {
            if (zG0 || zI0) {
                if (zQ0 || zW0 || zO0 || z3 || z2 || zJ0) {
                    if (!z || k0().length() <= 35) {
                        if (str.length() > 35) {
                            if (strA0.equals("Large")) {
                                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                                }
                            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                                System.out.println(fuEBEyZ.tct);
                                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                }
                            } else {
                                boolean zEquals5 = strA0.equals("Small");
                                LinearLayout linearLayout12 = this.f1;
                                if (zEquals5) {
                                    linearLayout12.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                                    if (iK == 0) {
                                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                                    } else {
                                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                                    }
                                } else {
                                    linearLayout12.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                    if (iK == 0) {
                                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                    } else {
                                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                    }
                                }
                            }
                        } else if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            System.out.println("Tem[plateCalled    ======>    3");
                            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_115);
                            }
                        } else {
                            boolean zEquals6 = strA0.equals("Small");
                            LinearLayout linearLayout13 = this.f1;
                            if (zEquals6) {
                                linearLayout13.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                                }
                            } else {
                                linearLayout13.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                                }
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_146);
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        System.out.println("Tem[plateCalled    ======>    1");
                        this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        }
                    } else {
                        boolean zEquals7 = strA0.equals("Small");
                        LinearLayout linearLayout14 = this.f1;
                        if (zEquals7) {
                            linearLayout14.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            }
                        } else {
                            linearLayout14.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            }
                        }
                    }
                } else if (!z || k0().length() <= 35) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        System.out.println("Tem[plateCalled    ======>    5");
                        this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        }
                    } else {
                        boolean zEquals8 = strA0.equals("Small");
                        LinearLayout linearLayout15 = this.f1;
                        if (zEquals8) {
                            linearLayout15.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                            }
                        } else {
                            linearLayout15.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    System.out.println("Tem[plateCalled    ======>    4");
                    this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    }
                } else {
                    boolean zEquals9 = strA0.equals("Small");
                    LinearLayout linearLayout16 = this.f1;
                    if (zEquals9) {
                        linearLayout16.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        }
                    } else {
                        linearLayout16.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        }
                    }
                }
            } else if (!z || k0().length() <= 35) {
                if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                    }
                } else {
                    boolean zEquals10 = strA0.equals("Small");
                    LinearLayout linearLayout17 = this.f1;
                    if (zEquals10) {
                        linearLayout17.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                        }
                    } else {
                        linearLayout17.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        }
                    }
                }
            } else if (strA0.equals("Large")) {
                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                if (iK == 0) {
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_136);
                }
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                System.out.println("Tem[plateCalled    ======>    6");
                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                if (iK == 0) {
                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                }
            } else {
                boolean zEquals11 = strA0.equals("Small");
                LinearLayout linearLayout18 = this.f1;
                if (zEquals11) {
                    linearLayout18.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                    }
                } else {
                    linearLayout18.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                    }
                }
            }
        } else if (zG0 != 0 || zI0) {
            if (zQ0 || zW0 || zO0 || z3 || z2 || zJ0) {
                if (!z || k0().length() <= 35) {
                    if (str.length() > 35) {
                        if (z) {
                            if (strA0.equals("Large")) {
                                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                                }
                            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                                }
                            } else {
                                boolean zEquals12 = strA0.equals("Small");
                                LinearLayout linearLayout19 = this.f1;
                                if (zEquals12) {
                                    linearLayout19.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                    if (iK == 0) {
                                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                    } else {
                                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                                    }
                                } else {
                                    linearLayout19.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                    if (iK == 0) {
                                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                    } else {
                                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                    }
                                }
                            }
                        } else if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            }
                        } else {
                            boolean zEquals13 = strA0.equals("Small");
                            LinearLayout linearLayout20 = this.f1;
                            if (zEquals13) {
                                linearLayout20.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                }
                            } else {
                                linearLayout20.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                }
                            }
                        }
                    } else if (z) {
                        if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_120);
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_105);
                            }
                        } else {
                            boolean zEquals14 = strA0.equals("Small");
                            LinearLayout linearLayout21 = this.f1;
                            if (zEquals14) {
                                linearLayout21.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_90);
                                }
                            } else {
                                linearLayout21.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                if (iK == 0) {
                                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                } else {
                                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_75);
                                }
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        }
                    } else {
                        boolean zEquals15 = strA0.equals("Small");
                        LinearLayout linearLayout22 = this.f1;
                        if (zEquals15) {
                            linearLayout22.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            }
                        } else {
                            linearLayout22.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            if (iK == 0) {
                                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            } else {
                                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_126);
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                    }
                } else {
                    boolean zEquals16 = strA0.equals("Small");
                    LinearLayout linearLayout23 = this.f1;
                    if (zEquals16) {
                        linearLayout23.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                        }
                    } else {
                        linearLayout23.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                        if (iK == 0) {
                            this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                        } else {
                            this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                            this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                        }
                    }
                }
            } else if (strA0.equals("Large")) {
                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                if (iK == 0) {
                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                }
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                if (iK == 0) {
                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                }
            } else {
                boolean zEquals17 = strA0.equals("Small");
                LinearLayout linearLayout24 = this.f1;
                if (zEquals17) {
                    linearLayout24.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    }
                } else {
                    linearLayout24.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_65);
                    }
                }
            }
        } else if (!z || k0().length() <= 35) {
            if (strA0.equals("Large")) {
                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                if (iK == 0) {
                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_100);
                }
            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                if (iK == 0) {
                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_85);
                }
            } else {
                boolean zEquals18 = strA0.equals("Small");
                LinearLayout linearLayout25 = this.f1;
                if (zEquals18) {
                    linearLayout25.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                    }
                } else {
                    linearLayout25.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                    if (iK == 0) {
                        this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                        this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                    } else {
                        this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                        this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_55);
                    }
                }
            }
        } else if (strA0.equals("Large")) {
            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
            if (iK == 0) {
                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
            } else {
                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_110);
            }
        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
            this.f1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
            if (iK == 0) {
                this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
            } else {
                this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
                this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_95);
            }
        } else {
            boolean zEquals19 = strA0.equals("Small");
            LinearLayout linearLayout26 = this.f1;
            if (zEquals19) {
                linearLayout26.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                if (iK == 0) {
                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_80);
                }
            } else {
                linearLayout26.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                if (iK == 0) {
                    this.g1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                    this.g1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                } else {
                    this.h1.getLayoutParams().width = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                    this.h1.getLayoutParams().height = (int) getResources().getDimension(R.dimen.stamp_icon_size_70);
                }
            }
        }
        this.e1.setVisibility(0);
        this.a1.setOrientation(1);
        this.a1.setGravity(19);
        this.a1.getLayoutParams().width = -2;
        this.a1.getLayoutParams().width = -2;
        this.d1.setVisibility(0);
        f1();
        this.B.setVisibility(0);
        this.f1.setVisibility(0);
    }

    public final String c0() {
        return this.l4.getString(this, "temprature_type_temp", "Celsius");
    }

    public final void c1() {
        this.R.setText(HelperClass.getSoundLevel(this));
        int i = this.f3;
        if (i == 2) {
            b1();
            return;
        }
        if (i == 3) {
            V0();
        } else if (i == 4) {
            R0();
        } else {
            d1();
        }
    }

    public final void d1() {
        boolean z;
        boolean z2;
        boolean z3;
        LinearLayout.LayoutParams layoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean zE0 = E0();
        int iK = K();
        boolean zV0 = v0();
        boolean zI0 = I0();
        boolean zD0 = D0();
        boolean zX0 = x0();
        boolean zL0 = L0();
        boolean zA0 = A0();
        boolean zK0 = K0();
        boolean zG0 = G0();
        boolean zH0 = H0();
        boolean zC0 = C0();
        boolean zF0 = F0();
        boolean zM0 = M0();
        boolean zB0 = B0();
        boolean zO0 = O0();
        N0();
        boolean zW0 = w0();
        boolean zQ0 = q0();
        boolean zJ0 = J0();
        String strA0 = a0();
        boolean zIsTablet = HelperClass.isTablet(this);
        if (iK == 0) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.j1.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.k1.getLayoutParams();
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21, -1);
            layoutParams3.removeRule(20);
            layoutParams3.addRule(21, -1);
            this.j1.setLayoutParams(layoutParams2);
            this.k1.setLayoutParams(layoutParams3);
        } else {
            if (this.f3 == 1) {
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.mainWatermark);
                RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.mainWatermark_2);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, 0, 0, 0);
                relativeLayout.setLayoutParams(layoutParams4);
                relativeLayout2.setLayoutParams(layoutParams4);
            }
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.j1.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.k1.getLayoutParams();
            layoutParams5.removeRule(21);
            layoutParams5.addRule(20, -1);
            layoutParams6.removeRule(21);
            layoutParams6.addRule(20, -1);
            this.j1.setLayoutParams(layoutParams5);
            this.k1.setLayoutParams(layoutParams6);
        }
        String str = jumTrYZsYnyZCd.NmX;
        if (strA0.equals(str) || strA0.equals(Default.TEMPLATE_SIZE)) {
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) this.j2.getLayoutParams();
            layoutParams7.height = HelperClass.dpToPx(this, 20);
            layoutParams7.width = HelperClass.dpToPx(this, 20);
            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
            layoutParams8.height = HelperClass.dpToPx(this, 20);
            layoutParams8.width = HelperClass.dpToPx(this, 20);
            this.l2.setTextSize(7.0f);
            this.m2.setTextSize(7.0f);
        } else {
            boolean zEquals = strA0.equals("Extra Small");
            ImageView imageView = this.j2;
            if (zEquals) {
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams9.height = HelperClass.dpToPx(this, 14);
                layoutParams9.width = HelperClass.dpToPx(this, 14);
                LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams10.height = HelperClass.dpToPx(this, 14);
                layoutParams10.width = HelperClass.dpToPx(this, 14);
                this.l2.setTextSize(5.0f);
                this.m2.setTextSize(5.0f);
            } else {
                LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams11.height = HelperClass.dpToPx(this, 24);
                layoutParams11.width = HelperClass.dpToPx(this, 24);
                LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) this.k2.getLayoutParams();
                layoutParams12.height = HelperClass.dpToPx(this, 24);
                layoutParams12.width = HelperClass.dpToPx(this, 24);
                this.l2.setTextSize(9.0f);
                this.m2.setTextSize(9.0f);
            }
        }
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        if (strA0.equals("Large")) {
            z = zA0;
            z2 = zK0;
            z3 = zG0;
            layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_140), (int) getResources().getDimension(R.dimen.stamp_icon_size_110));
        } else {
            z = zA0;
            z2 = zK0;
            z3 = zG0;
            if (strA0.equals(Default.TEMPLATE_SIZE)) {
                layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_130), (int) getResources().getDimension(R.dimen.stamp_icon_size_90));
            } else {
                layoutParams = strA0.equals(str) ? new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_120), (int) getResources().getDimension(R.dimen.stamp_icon_size_80)) : new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.stamp_icon_size_110), (int) getResources().getDimension(R.dimen.stamp_icon_size_70));
            }
        }
        ShapeableImageView shapeableImageView = this.U0;
        if (!zE0) {
            zH0 = zH0;
            zC0 = zC0;
            zF0 = zF0;
            i = 0;
            shapeableImageView.setVisibility(8);
            this.V0.setVisibility(8);
            if (this.f3 == 0) {
                layoutParams13.setMargins(0, 0, 0, 0);
            } else {
                layoutParams13.setMargins(0, 0, 0, 0);
            }
        } else if (iK == 0) {
            i = 0;
            shapeableImageView.setVisibility(0);
            this.V0.setVisibility(8);
            if (this.f3 == 0) {
                layoutParams13.setMargins((int) getResources().getDimension(R.dimen._8dp), 0, 0, 0);
                layoutParams.setMargins((int) getResources().getDimension(R.dimen._8dp), 0, 0, 0);
                boolean zEquals2 = strA0.equals("Large");
                LinearLayout linearLayout = this.d1;
                if (zEquals2) {
                    linearLayout.setPadding((int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp));
                } else {
                    linearLayout.setPadding((int) getResources().getDimension(R.dimen._16dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._16dp), (int) getResources().getDimension(R.dimen._8dp));
                }
                layoutParams.gravity = 80;
                i = 0;
            } else {
                zH0 = zH0;
                zC0 = zC0;
                zF0 = zF0;
                layoutParams13.setMargins(0, 0, 0, 0);
                layoutParams.setMargins(0, 0, 0, 0);
                layoutParams.gravity = 80;
                boolean zEquals3 = strA0.equals("Large");
                LinearLayout linearLayout2 = this.d1;
                if (zEquals3) {
                    linearLayout2.setPadding(0, (int) getResources().getDimension(R.dimen._8dp), 0, (int) getResources().getDimension(R.dimen._8dp));
                } else {
                    linearLayout2.setPadding(0, (int) getResources().getDimension(R.dimen._16dp), 0, (int) getResources().getDimension(R.dimen._16dp));
                }
                this.U0.setLayoutParams(layoutParams);
            }
        } else {
            zH0 = zH0;
            zC0 = zC0;
            zF0 = zF0;
            i = 0;
            shapeableImageView.setVisibility(8);
            this.V0.setVisibility(0);
            if (this.f3 == 0) {
                layoutParams13.setMargins(0, 0, 0, 0);
                layoutParams.setMargins((int) getResources().getDimension(R.dimen._8dp), 0, 0, 0);
                boolean zEquals4 = strA0.equals("Large");
                LinearLayout linearLayout3 = this.d1;
                if (zEquals4) {
                    linearLayout3.setPadding((int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp));
                } else {
                    linearLayout3.setPadding((int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._8dp), (int) getResources().getDimension(R.dimen._16dp), (int) getResources().getDimension(R.dimen._16dp));
                }
                layoutParams.gravity = 80;
                i = 0;
            } else {
                layoutParams13.setMargins(0, 0, 0, 0);
                layoutParams.setMargins(0, 0, 0, 0);
                layoutParams.gravity = 80;
                boolean zEquals5 = strA0.equals("Large");
                LinearLayout linearLayout4 = this.d1;
                if (zEquals5) {
                    linearLayout4.setPadding(0, (int) getResources().getDimension(R.dimen._8dp), 0, (int) getResources().getDimension(R.dimen._8dp));
                } else {
                    linearLayout4.setPadding(0, (int) getResources().getDimension(R.dimen._16dp), 0, (int) getResources().getDimension(R.dimen._16dp));
                }
            }
            this.V0.setLayoutParams(layoutParams);
        }
        this.f1.setLayoutParams(layoutParams13);
        if (this.f3 == 1) {
            float fDpToPx = HelperClass.dpToPx(this, i);
            l76 l76VarF = m76.f();
            l76VarF.c(fDpToPx);
            m76 m76VarB = l76VarF.b();
            this.U0.setShapeAppearanceModel(m76VarB);
            this.V0.setShapeAppearanceModel(m76VarB);
        }
        LinearLayout linearLayout5 = this.c1;
        if (zL0 != 0) {
            linearLayout5.setVisibility(0);
            i2 = 8;
        } else {
            i2 = 8;
            linearLayout5.setVisibility(8);
        }
        if (zB0 || zQ0 || zW0 || zM0 || zO0 || zJ0) {
            this.o1.setVisibility(0);
            if (zIsTablet) {
                ((LinearLayout.LayoutParams) this.o1.getLayoutParams()).height++;
            }
        } else {
            this.o1.setVisibility(i2);
        }
        LinearLayout linearLayout6 = this.n1;
        if (zB0) {
            i3 = 0;
            linearLayout6.setVisibility(0);
            i4 = 8;
        } else {
            i3 = 0;
            i4 = 8;
            linearLayout6.setVisibility(8);
        }
        LinearLayout linearLayout7 = this.m1;
        if (zM0) {
            linearLayout7.setVisibility(i3);
        } else {
            linearLayout7.setVisibility(i4);
        }
        LinearLayout linearLayout8 = this.l1;
        if (zO0) {
            linearLayout8.setVisibility(i3);
        } else {
            linearLayout8.setVisibility(i4);
        }
        if (zJ0) {
            String soundLevel = HelperClass.getSoundLevel(this);
            if (this.l1.getVisibility() == i4) {
                this.l1.setVisibility(i3);
                this.o0.setImageResource(R.drawable.sound_wave);
                this.d0.setText(soundLevel);
                this.d0.setTextColor(Y());
            } else if (this.m1.getVisibility() == 8) {
                this.m1.setVisibility(0);
                this.q0.setImageResource(R.drawable.sound_wave);
                this.C.setText(soundLevel);
                this.C.setTextColor(Y());
            } else if (this.n1.getVisibility() == 8) {
                this.n1.setVisibility(0);
                this.r0.setImageResource(R.drawable.sound_wave);
                this.W.setText(soundLevel);
                this.W.setTextColor(Y());
            }
        }
        if (zW0) {
            String altitudeconvert = HelperClass.getAltitudeconvert(this, i0());
            if (this.l1.getVisibility() == 8) {
                this.l1.setVisibility(0);
                this.o0.setImageResource(R.drawable.ic_altitiude);
                this.d0.setText(altitudeconvert);
                this.d0.setTextColor(v());
            } else if (this.m1.getVisibility() == 8) {
                this.m1.setVisibility(0);
                this.q0.setImageResource(R.drawable.ic_altitiude);
                this.C.setText(altitudeconvert);
                this.C.setTextColor(v());
            } else if (this.n1.getVisibility() == 8) {
                this.n1.setVisibility(0);
                this.r0.setImageResource(R.drawable.ic_altitiude);
                this.W.setText(altitudeconvert);
                this.W.setTextColor(v());
            }
        }
        if (zQ0) {
            String accuracy = HelperClass.getAccuracy(this, h0());
            if (this.l1.getVisibility() == 8) {
                this.l1.setVisibility(0);
                this.o0.setImageResource(R.drawable.ic_accuracy);
                this.d0.setText(accuracy);
                this.d0.setTextColor(t());
            } else if (this.m1.getVisibility() == 8) {
                this.m1.setVisibility(0);
                this.q0.setImageResource(R.drawable.ic_accuracy);
                this.C.setText(accuracy);
                this.C.setTextColor(t());
            } else if (this.n1.getVisibility() == 8) {
                this.n1.setVisibility(0);
                this.r0.setImageResource(R.drawable.ic_accuracy);
                this.W.setText(accuracy);
                this.W.setTextColor(t());
            }
        }
        if (zB0) {
            this.W.setTextColor(E());
        }
        if (zM0) {
            this.C.setTextColor(g0());
        }
        if (zO0) {
            this.d0.setTextColor(U());
        }
        boolean z4 = this.u3;
        LinearLayout linearLayout9 = this.b1;
        if (z4) {
            if (zD0) {
                i7 = 0;
                linearLayout9.setVisibility(0);
                i5 = 8;
            } else {
                i7 = 0;
                i5 = 8;
                linearLayout9.setVisibility(8);
            }
            LinearLayout linearLayout10 = this.Y0;
            if (zX0) {
                linearLayout10.setVisibility(i7);
            } else {
                linearLayout10.setVisibility(i5);
            }
        } else {
            i5 = 8;
            linearLayout9.setVisibility(8);
            this.Y0.setVisibility(8);
            this.g2.setVisibility(8);
            this.h2.setVisibility(8);
        }
        if (zL0 == 0 && zD0 == 0 && zX0 == 0 && !zC0) {
            this.a1.setVisibility(i5);
            i6 = 0;
        } else {
            i6 = 0;
            this.a1.setVisibility(0);
        }
        LinearLayout linearLayout11 = this.Z0;
        if (zC0) {
            linearLayout11.setVisibility(i6);
        } else {
            linearLayout11.setVisibility(8);
        }
        if (strA0.equals(Default.TEMPLATE_SIZE)) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 30);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 58);
            this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 14);
            this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 14);
            this.C.setTextSize(8.0f);
            this.d0.setTextSize(8.0f);
            this.W.setTextSize(8.0f);
            this.D.setTextSize(8.0f);
            this.H.setTextSize(8.0f);
            this.J.setTextSize(8.0f);
        } else if (strA0.equals(str)) {
            this.S0.getLayoutParams().height = HelperClass.dpToPx(this, 28);
            this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 54);
            this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 12);
            this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 12);
            this.C.setTextSize(7.0f);
            this.d0.setTextSize(7.0f);
            this.W.setTextSize(7.0f);
            this.D.setTextSize(7.0f);
            this.H.setTextSize(7.0f);
            this.J.setTextSize(7.0f);
        } else {
            boolean zEquals6 = strA0.equals("Extra Small");
            ImageView imageView2 = this.S0;
            if (zEquals6) {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 26);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 50);
                this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 10);
                this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 10);
                this.C.setTextSize(6.0f);
                this.d0.setTextSize(6.0f);
                this.W.setTextSize(6.0f);
                this.D.setTextSize(6.0f);
                this.H.setTextSize(6.0f);
                this.J.setTextSize(6.0f);
            } else {
                imageView2.getLayoutParams().height = HelperClass.dpToPx(this, 32);
                this.S0.getLayoutParams().width = HelperClass.dpToPx(this, 62);
                this.m0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.m0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.k0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.r0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.r0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.o0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.o0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.q0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.q0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.p0.getLayoutParams().height = HelperClass.dpToPx(this, 16);
                this.p0.getLayoutParams().width = HelperClass.dpToPx(this, 16);
                this.C.setTextSize(10.0f);
                this.d0.setTextSize(10.0f);
                this.W.setTextSize(10.0f);
                this.D.setTextSize(10.0f);
                this.H.setTextSize(10.0f);
                this.J.setTextSize(10.0f);
            }
        }
        if (zE0) {
            int i8 = zV0 != 0 ? 2 : 1;
            int i9 = i8 + 1;
            if (zI0) {
                i9 = i8 + 2;
            }
            if (z || z2) {
                i9++;
            }
            if (z3) {
                i9++;
            }
            if (zF0) {
                i9++;
            }
            if (zH0) {
                i9++;
            }
            int i10 = i9;
            int iDpToPx = HelperClass.dpToPx(this, 70);
            int iDpToPx2 = HelperClass.dpToPx(this, 75);
            int iDpToPx3 = HelperClass.dpToPx(this, 80);
            int iDpToPx4 = HelperClass.dpToPx(this, 85);
            int iDpToPx5 = HelperClass.dpToPx(this, 90);
            int iDpToPx6 = HelperClass.dpToPx(this, 95);
            int iDpToPx7 = HelperClass.dpToPx(this, 100);
            int iDpToPx8 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx9 = HelperClass.dpToPx(this, fh.k1);
            int iDpToPx10 = HelperClass.dpToPx(this, 115);
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
            if (i10 == 2) {
                if (!zL0 && zX0 == 0 && zD0 == 0) {
                    if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                        if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx8;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx8;
                                this.U0.getLayoutParams().height = iDpToPx8;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx8;
                                this.V0.getLayoutParams().height = iDpToPx8;
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx6;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx6;
                                this.U0.getLayoutParams().height = iDpToPx6;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx6;
                                this.V0.getLayoutParams().height = iDpToPx6;
                            }
                        } else {
                            boolean zEquals7 = strA0.equals(str);
                            LinearLayout linearLayout12 = this.f1;
                            if (zEquals7) {
                                linearLayout12.getLayoutParams().height = iDpToPx5;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx5;
                                    this.U0.getLayoutParams().height = iDpToPx5;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx5;
                                    this.V0.getLayoutParams().height = iDpToPx5;
                                }
                            } else {
                                linearLayout12.getLayoutParams().height = iDpToPx4;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx4;
                                    this.U0.getLayoutParams().height = iDpToPx4;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx4;
                                    this.V0.getLayoutParams().height = iDpToPx4;
                                }
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx4;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx4;
                            this.U0.getLayoutParams().height = iDpToPx4;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx4;
                            this.V0.getLayoutParams().height = iDpToPx4;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx3;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx3;
                            this.U0.getLayoutParams().height = iDpToPx3;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx3;
                            this.V0.getLayoutParams().height = iDpToPx3;
                        }
                    } else {
                        boolean zEquals8 = strA0.equals(str);
                        LinearLayout linearLayout13 = this.f1;
                        if (zEquals8) {
                            linearLayout13.getLayoutParams().height = iDpToPx2;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx2;
                                this.U0.getLayoutParams().height = iDpToPx2;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx2;
                                this.V0.getLayoutParams().height = iDpToPx2;
                            }
                        } else {
                            linearLayout13.getLayoutParams().height = iDpToPx;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx;
                                this.U0.getLayoutParams().height = iDpToPx;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx;
                                this.V0.getLayoutParams().height = iDpToPx;
                            }
                        }
                    }
                } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx14;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx14;
                            this.U0.getLayoutParams().height = iDpToPx14;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx14;
                            this.V0.getLayoutParams().height = iDpToPx14;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx12;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx12;
                            this.U0.getLayoutParams().height = iDpToPx12;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx12;
                            this.V0.getLayoutParams().height = iDpToPx12;
                        }
                    } else {
                        boolean zEquals9 = strA0.equals(str);
                        LinearLayout linearLayout14 = this.f1;
                        if (zEquals9) {
                            linearLayout14.getLayoutParams().height = iDpToPx10;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx10;
                                this.U0.getLayoutParams().height = iDpToPx10;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx10;
                                this.V0.getLayoutParams().height = iDpToPx10;
                            }
                        } else {
                            linearLayout14.getLayoutParams().height = iDpToPx8;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx8;
                                this.U0.getLayoutParams().height = iDpToPx8;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx8;
                                this.V0.getLayoutParams().height = iDpToPx8;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx12;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx12;
                        this.U0.getLayoutParams().height = iDpToPx12;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx12;
                        this.V0.getLayoutParams().height = iDpToPx12;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx10;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx10;
                        this.U0.getLayoutParams().height = iDpToPx10;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx10;
                        this.V0.getLayoutParams().height = iDpToPx10;
                    }
                } else {
                    boolean zEquals10 = strA0.equals(str);
                    LinearLayout linearLayout15 = this.f1;
                    if (zEquals10) {
                        linearLayout15.getLayoutParams().height = iDpToPx8;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx8;
                            this.U0.getLayoutParams().height = iDpToPx8;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx8;
                            this.V0.getLayoutParams().height = iDpToPx8;
                        }
                    } else {
                        linearLayout15.getLayoutParams().height = iDpToPx6;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx6;
                            this.U0.getLayoutParams().height = iDpToPx6;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx6;
                            this.V0.getLayoutParams().height = iDpToPx6;
                        }
                    }
                }
            } else if (i10 == 3) {
                if (zL0 == 0 && zX0 == 0 && zD0 == 0) {
                    if (zV0) {
                        if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                            if (strA0.equals("Large")) {
                                this.f1.getLayoutParams().height = iDpToPx11;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx11;
                                    this.U0.getLayoutParams().height = iDpToPx11;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx11;
                                    this.V0.getLayoutParams().height = iDpToPx11;
                                }
                            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                                this.f1.getLayoutParams().height = iDpToPx9;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx9;
                                    this.U0.getLayoutParams().height = iDpToPx9;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx9;
                                    this.V0.getLayoutParams().height = iDpToPx9;
                                }
                            } else {
                                boolean zEquals11 = strA0.equals(str);
                                LinearLayout linearLayout16 = this.f1;
                                if (zEquals11) {
                                    linearLayout16.getLayoutParams().height = iDpToPx7;
                                    if (iK == 0) {
                                        this.U0.getLayoutParams().width = iDpToPx7;
                                        this.U0.getLayoutParams().height = iDpToPx7;
                                    } else {
                                        this.V0.getLayoutParams().width = iDpToPx7;
                                        this.V0.getLayoutParams().height = iDpToPx7;
                                    }
                                } else {
                                    linearLayout16.getLayoutParams().height = iDpToPx5;
                                    if (iK == 0) {
                                        this.U0.getLayoutParams().width = iDpToPx5;
                                        this.U0.getLayoutParams().height = iDpToPx5;
                                    } else {
                                        this.V0.getLayoutParams().width = iDpToPx5;
                                        this.V0.getLayoutParams().height = iDpToPx5;
                                    }
                                }
                            }
                        } else if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx9;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx9;
                                this.U0.getLayoutParams().height = iDpToPx9;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx9;
                                this.V0.getLayoutParams().height = iDpToPx9;
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx7;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx7;
                                this.U0.getLayoutParams().height = iDpToPx7;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx7;
                                this.V0.getLayoutParams().height = iDpToPx7;
                            }
                        } else {
                            boolean zEquals12 = strA0.equals(str);
                            LinearLayout linearLayout17 = this.f1;
                            if (zEquals12) {
                                linearLayout17.getLayoutParams().height = iDpToPx5;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx5;
                                    this.U0.getLayoutParams().height = iDpToPx5;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx5;
                                    this.V0.getLayoutParams().height = iDpToPx5;
                                }
                            } else {
                                linearLayout17.getLayoutParams().height = iDpToPx3;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx3;
                                    this.U0.getLayoutParams().height = iDpToPx3;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx3;
                                    this.V0.getLayoutParams().height = iDpToPx3;
                                }
                            }
                        }
                    } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                        if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx9;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx9;
                                this.U0.getLayoutParams().height = iDpToPx9;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx9;
                                this.V0.getLayoutParams().height = iDpToPx9;
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx7;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx7;
                                this.U0.getLayoutParams().height = iDpToPx7;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx7;
                                this.V0.getLayoutParams().height = iDpToPx7;
                            }
                        } else {
                            boolean zEquals13 = strA0.equals(str);
                            LinearLayout linearLayout18 = this.f1;
                            if (zEquals13) {
                                linearLayout18.getLayoutParams().height = iDpToPx5;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx5;
                                    this.U0.getLayoutParams().height = iDpToPx5;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx5;
                                    this.V0.getLayoutParams().height = iDpToPx5;
                                }
                            } else {
                                linearLayout18.getLayoutParams().height = iDpToPx3;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx3;
                                    this.U0.getLayoutParams().height = iDpToPx3;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx3;
                                    this.V0.getLayoutParams().height = iDpToPx3;
                                }
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx7;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx7;
                            this.U0.getLayoutParams().height = iDpToPx7;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx7;
                            this.V0.getLayoutParams().height = iDpToPx7;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx5;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx5;
                            this.U0.getLayoutParams().height = iDpToPx5;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx5;
                            this.V0.getLayoutParams().height = iDpToPx5;
                        }
                    } else {
                        boolean zEquals14 = strA0.equals(str);
                        LinearLayout linearLayout19 = this.f1;
                        if (zEquals14) {
                            linearLayout19.getLayoutParams().height = iDpToPx3;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx3;
                                this.U0.getLayoutParams().height = iDpToPx3;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx3;
                                this.V0.getLayoutParams().height = iDpToPx3;
                            }
                        } else {
                            linearLayout19.getLayoutParams().height = iDpToPx;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx;
                                this.U0.getLayoutParams().height = iDpToPx;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx;
                                this.V0.getLayoutParams().height = iDpToPx;
                            }
                        }
                    }
                } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx13;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx13;
                            this.U0.getLayoutParams().height = iDpToPx13;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx13;
                            this.V0.getLayoutParams().height = iDpToPx13;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx11;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx11;
                            this.U0.getLayoutParams().height = iDpToPx11;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx11;
                            this.V0.getLayoutParams().height = iDpToPx11;
                        }
                    } else {
                        boolean zEquals15 = strA0.equals(str);
                        LinearLayout linearLayout20 = this.f1;
                        if (zEquals15) {
                            linearLayout20.getLayoutParams().height = iDpToPx9;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx9;
                                this.U0.getLayoutParams().height = iDpToPx9;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx9;
                                this.V0.getLayoutParams().height = iDpToPx9;
                            }
                        } else {
                            linearLayout20.getLayoutParams().height = iDpToPx7;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx7;
                                this.U0.getLayoutParams().height = iDpToPx7;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx7;
                                this.V0.getLayoutParams().height = iDpToPx7;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx11;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx11;
                        this.U0.getLayoutParams().height = iDpToPx11;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx11;
                        this.V0.getLayoutParams().height = iDpToPx11;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx9;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx9;
                        this.U0.getLayoutParams().height = iDpToPx9;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx9;
                        this.V0.getLayoutParams().height = iDpToPx9;
                    }
                } else {
                    boolean zEquals16 = strA0.equals(str);
                    LinearLayout linearLayout21 = this.f1;
                    if (zEquals16) {
                        linearLayout21.getLayoutParams().height = iDpToPx7;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx7;
                            this.U0.getLayoutParams().height = iDpToPx7;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx7;
                            this.V0.getLayoutParams().height = iDpToPx7;
                        }
                    } else {
                        linearLayout21.getLayoutParams().height = iDpToPx5;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx5;
                            this.U0.getLayoutParams().height = iDpToPx5;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx5;
                            this.V0.getLayoutParams().height = iDpToPx5;
                        }
                    }
                }
            } else if (i10 == 4) {
                if (zL0 == 0 && zX0 == 0 && zD0 == 0) {
                    if (zV0 != 0) {
                        if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                            if (strA0.equals("Large")) {
                                this.f1.getLayoutParams().height = iDpToPx12;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx12;
                                    this.U0.getLayoutParams().height = iDpToPx12;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx12;
                                    this.V0.getLayoutParams().height = iDpToPx12;
                                }
                            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                                this.f1.getLayoutParams().height = iDpToPx10;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx10;
                                    this.U0.getLayoutParams().height = iDpToPx10;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx10;
                                    this.V0.getLayoutParams().height = iDpToPx10;
                                }
                            } else {
                                boolean zEquals17 = strA0.equals(str);
                                LinearLayout linearLayout22 = this.f1;
                                if (zEquals17) {
                                    linearLayout22.getLayoutParams().height = iDpToPx8;
                                    if (iK == 0) {
                                        this.U0.getLayoutParams().width = iDpToPx8;
                                        this.U0.getLayoutParams().height = iDpToPx8;
                                    } else {
                                        this.V0.getLayoutParams().width = iDpToPx8;
                                        this.V0.getLayoutParams().height = iDpToPx8;
                                    }
                                } else {
                                    linearLayout22.getLayoutParams().height = iDpToPx6;
                                    if (iK == 0) {
                                        this.U0.getLayoutParams().width = iDpToPx6;
                                        this.U0.getLayoutParams().height = iDpToPx6;
                                    } else {
                                        this.V0.getLayoutParams().width = iDpToPx6;
                                        this.V0.getLayoutParams().height = iDpToPx6;
                                    }
                                }
                            }
                        } else if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx10;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx10;
                                this.U0.getLayoutParams().height = iDpToPx10;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx10;
                                this.V0.getLayoutParams().height = iDpToPx10;
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx8;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx8;
                                this.U0.getLayoutParams().height = iDpToPx8;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx8;
                                this.V0.getLayoutParams().height = iDpToPx8;
                            }
                        } else {
                            boolean zEquals18 = strA0.equals(str);
                            LinearLayout linearLayout23 = this.f1;
                            if (zEquals18) {
                                linearLayout23.getLayoutParams().height = iDpToPx6;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx6;
                                    this.U0.getLayoutParams().height = iDpToPx6;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx6;
                                    this.V0.getLayoutParams().height = iDpToPx6;
                                }
                            } else {
                                linearLayout23.getLayoutParams().height = iDpToPx4;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx4;
                                    this.U0.getLayoutParams().height = iDpToPx4;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx4;
                                    this.V0.getLayoutParams().height = iDpToPx4;
                                }
                            }
                        }
                    } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                        if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx10;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx10;
                                this.U0.getLayoutParams().height = iDpToPx10;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx10;
                                this.V0.getLayoutParams().height = iDpToPx10;
                            }
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx8;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx8;
                                this.U0.getLayoutParams().height = iDpToPx8;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx8;
                                this.V0.getLayoutParams().height = iDpToPx8;
                            }
                        } else {
                            boolean zEquals19 = strA0.equals(str);
                            LinearLayout linearLayout24 = this.f1;
                            if (zEquals19) {
                                linearLayout24.getLayoutParams().height = iDpToPx6;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx6;
                                    this.U0.getLayoutParams().height = iDpToPx6;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx6;
                                    this.V0.getLayoutParams().height = iDpToPx6;
                                }
                            } else {
                                linearLayout24.getLayoutParams().height = iDpToPx4;
                                if (iK == 0) {
                                    this.U0.getLayoutParams().width = iDpToPx4;
                                    this.U0.getLayoutParams().height = iDpToPx4;
                                } else {
                                    this.V0.getLayoutParams().width = iDpToPx4;
                                    this.V0.getLayoutParams().height = iDpToPx4;
                                }
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx8;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx8;
                            this.U0.getLayoutParams().height = iDpToPx8;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx8;
                            this.V0.getLayoutParams().height = iDpToPx8;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx6;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx6;
                            this.U0.getLayoutParams().height = iDpToPx6;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx6;
                            this.V0.getLayoutParams().height = iDpToPx6;
                        }
                    } else {
                        boolean zEquals20 = strA0.equals(str);
                        LinearLayout linearLayout25 = this.f1;
                        if (zEquals20) {
                            linearLayout25.getLayoutParams().height = iDpToPx4;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx4;
                                this.U0.getLayoutParams().height = iDpToPx4;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx4;
                                this.V0.getLayoutParams().height = iDpToPx4;
                            }
                        } else {
                            linearLayout25.getLayoutParams().height = iDpToPx2;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx2;
                                this.U0.getLayoutParams().height = iDpToPx2;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx2;
                                this.V0.getLayoutParams().height = iDpToPx2;
                            }
                        }
                    }
                } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx13;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx13;
                            this.U0.getLayoutParams().height = iDpToPx13;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx13;
                            this.V0.getLayoutParams().height = iDpToPx13;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx11;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx11;
                            this.U0.getLayoutParams().height = iDpToPx11;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx11;
                            this.V0.getLayoutParams().height = iDpToPx11;
                        }
                    } else {
                        boolean zEquals21 = strA0.equals(str);
                        LinearLayout linearLayout26 = this.f1;
                        if (zEquals21) {
                            linearLayout26.getLayoutParams().height = iDpToPx9;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx9;
                                this.U0.getLayoutParams().height = iDpToPx9;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx9;
                                this.V0.getLayoutParams().height = iDpToPx9;
                            }
                        } else {
                            linearLayout26.getLayoutParams().height = iDpToPx7;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx7;
                                this.U0.getLayoutParams().height = iDpToPx7;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx7;
                                this.V0.getLayoutParams().height = iDpToPx7;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx11;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx11;
                        this.U0.getLayoutParams().height = iDpToPx11;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx11;
                        this.V0.getLayoutParams().height = iDpToPx11;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx9;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx9;
                        this.U0.getLayoutParams().height = iDpToPx9;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx9;
                        this.V0.getLayoutParams().height = iDpToPx9;
                    }
                } else {
                    boolean zEquals22 = strA0.equals(str);
                    LinearLayout linearLayout27 = this.f1;
                    if (zEquals22) {
                        linearLayout27.getLayoutParams().height = iDpToPx7;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx7;
                            this.U0.getLayoutParams().height = iDpToPx7;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx7;
                            this.V0.getLayoutParams().height = iDpToPx7;
                        }
                    } else {
                        linearLayout27.getLayoutParams().height = iDpToPx5;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx5;
                            this.U0.getLayoutParams().height = iDpToPx5;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx5;
                            this.V0.getLayoutParams().height = iDpToPx5;
                        }
                    }
                }
            } else if (i10 == 5) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx13;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx13;
                            this.U0.getLayoutParams().height = iDpToPx13;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx13;
                            this.V0.getLayoutParams().height = iDpToPx13;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx11;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx11;
                            this.U0.getLayoutParams().height = iDpToPx11;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx11;
                            this.V0.getLayoutParams().height = iDpToPx11;
                        }
                    } else {
                        boolean zEquals23 = strA0.equals(str);
                        LinearLayout linearLayout28 = this.f1;
                        if (zEquals23) {
                            linearLayout28.getLayoutParams().height = iDpToPx9;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx9;
                                this.U0.getLayoutParams().height = iDpToPx9;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx9;
                                this.V0.getLayoutParams().height = iDpToPx9;
                            }
                        } else {
                            linearLayout28.getLayoutParams().height = iDpToPx7;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx7;
                                this.U0.getLayoutParams().height = iDpToPx7;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx7;
                                this.V0.getLayoutParams().height = iDpToPx7;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx11;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx11;
                        this.U0.getLayoutParams().height = iDpToPx11;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx11;
                        this.V0.getLayoutParams().height = iDpToPx11;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx9;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx9;
                        this.U0.getLayoutParams().height = iDpToPx9;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx9;
                        this.V0.getLayoutParams().height = iDpToPx9;
                    }
                } else {
                    boolean zEquals24 = strA0.equals(str);
                    LinearLayout linearLayout29 = this.f1;
                    if (zEquals24) {
                        linearLayout29.getLayoutParams().height = iDpToPx7;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx7;
                            this.U0.getLayoutParams().height = iDpToPx7;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx7;
                            this.V0.getLayoutParams().height = iDpToPx7;
                        }
                    } else {
                        linearLayout29.getLayoutParams().height = iDpToPx5;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx5;
                            this.U0.getLayoutParams().height = iDpToPx5;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx5;
                            this.V0.getLayoutParams().height = iDpToPx5;
                        }
                    }
                }
            } else if (i10 == 6) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx15;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx15;
                            this.U0.getLayoutParams().height = iDpToPx15;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx15;
                            this.V0.getLayoutParams().height = iDpToPx15;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx13;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx13;
                            this.U0.getLayoutParams().height = iDpToPx13;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx13;
                            this.V0.getLayoutParams().height = iDpToPx13;
                        }
                    } else {
                        boolean zEquals25 = strA0.equals(str);
                        LinearLayout linearLayout30 = this.f1;
                        if (zEquals25) {
                            linearLayout30.getLayoutParams().height = iDpToPx11;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx11;
                                this.U0.getLayoutParams().height = iDpToPx11;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx11;
                                this.V0.getLayoutParams().height = iDpToPx11;
                            }
                        } else {
                            linearLayout30.getLayoutParams().height = iDpToPx9;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx9;
                                this.U0.getLayoutParams().height = iDpToPx9;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx9;
                                this.V0.getLayoutParams().height = iDpToPx9;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx13;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx13;
                        this.U0.getLayoutParams().height = iDpToPx13;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx13;
                        this.V0.getLayoutParams().height = iDpToPx13;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx11;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx11;
                        this.U0.getLayoutParams().height = iDpToPx11;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx11;
                        this.V0.getLayoutParams().height = iDpToPx11;
                    }
                } else {
                    boolean zEquals26 = strA0.equals(str);
                    LinearLayout linearLayout31 = this.f1;
                    if (zEquals26) {
                        linearLayout31.getLayoutParams().height = iDpToPx9;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx9;
                            this.U0.getLayoutParams().height = iDpToPx9;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx9;
                            this.V0.getLayoutParams().height = iDpToPx9;
                        }
                    } else {
                        linearLayout31.getLayoutParams().height = iDpToPx7;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx7;
                            this.U0.getLayoutParams().height = iDpToPx7;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx7;
                            this.V0.getLayoutParams().height = iDpToPx7;
                        }
                    }
                }
            } else if (i10 == 7) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx17;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx17;
                            this.U0.getLayoutParams().height = iDpToPx17;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx17;
                            this.V0.getLayoutParams().height = iDpToPx17;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx15;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx15;
                            this.U0.getLayoutParams().height = iDpToPx15;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx15;
                            this.V0.getLayoutParams().height = iDpToPx15;
                        }
                    } else {
                        boolean zEquals27 = strA0.equals(str);
                        LinearLayout linearLayout32 = this.f1;
                        if (zEquals27) {
                            linearLayout32.getLayoutParams().height = iDpToPx13;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx13;
                                this.U0.getLayoutParams().height = iDpToPx13;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx13;
                                this.V0.getLayoutParams().height = iDpToPx13;
                            }
                        } else {
                            linearLayout32.getLayoutParams().height = iDpToPx11;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx11;
                                this.U0.getLayoutParams().height = iDpToPx11;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx11;
                                this.V0.getLayoutParams().height = iDpToPx11;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx15;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx15;
                        this.U0.getLayoutParams().height = iDpToPx15;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx15;
                        this.V0.getLayoutParams().height = iDpToPx15;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx13;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx13;
                        this.U0.getLayoutParams().height = iDpToPx13;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx13;
                        this.V0.getLayoutParams().height = iDpToPx13;
                    }
                } else {
                    boolean zEquals28 = strA0.equals(str);
                    LinearLayout linearLayout33 = this.f1;
                    if (zEquals28) {
                        linearLayout33.getLayoutParams().height = iDpToPx11;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx11;
                            this.U0.getLayoutParams().height = iDpToPx11;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx11;
                            this.V0.getLayoutParams().height = iDpToPx11;
                        }
                    } else {
                        linearLayout33.getLayoutParams().height = iDpToPx9;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx9;
                            this.U0.getLayoutParams().height = iDpToPx9;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx9;
                            this.V0.getLayoutParams().height = iDpToPx9;
                        }
                    }
                }
            } else if (i10 == 8) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx19;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx19;
                            this.U0.getLayoutParams().height = iDpToPx19;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx19;
                            this.V0.getLayoutParams().height = iDpToPx19;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx17;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx17;
                            this.U0.getLayoutParams().height = iDpToPx17;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx17;
                            this.V0.getLayoutParams().height = iDpToPx17;
                        }
                    } else {
                        boolean zEquals29 = strA0.equals(str);
                        LinearLayout linearLayout34 = this.f1;
                        if (zEquals29) {
                            linearLayout34.getLayoutParams().height = iDpToPx15;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx15;
                                this.U0.getLayoutParams().height = iDpToPx15;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx15;
                                this.V0.getLayoutParams().height = iDpToPx15;
                            }
                        } else {
                            linearLayout34.getLayoutParams().height = iDpToPx13;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx13;
                                this.U0.getLayoutParams().height = iDpToPx13;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx13;
                                this.V0.getLayoutParams().height = iDpToPx13;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx17;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx17;
                        this.U0.getLayoutParams().height = iDpToPx17;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx17;
                        this.V0.getLayoutParams().height = iDpToPx17;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx15;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx15;
                        this.U0.getLayoutParams().height = iDpToPx15;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx15;
                        this.V0.getLayoutParams().height = iDpToPx15;
                    }
                } else {
                    boolean zEquals30 = strA0.equals(str);
                    LinearLayout linearLayout35 = this.f1;
                    if (zEquals30) {
                        linearLayout35.getLayoutParams().height = iDpToPx13;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx13;
                            this.U0.getLayoutParams().height = iDpToPx13;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx13;
                            this.V0.getLayoutParams().height = iDpToPx13;
                        }
                    } else {
                        linearLayout35.getLayoutParams().height = iDpToPx11;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx11;
                            this.U0.getLayoutParams().height = iDpToPx11;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx11;
                            this.V0.getLayoutParams().height = iDpToPx11;
                        }
                    }
                }
            } else if (i10 == 9) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx20;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx20;
                            this.U0.getLayoutParams().height = iDpToPx20;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx20;
                            this.V0.getLayoutParams().height = iDpToPx20;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx18;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx18;
                            this.U0.getLayoutParams().height = iDpToPx18;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx18;
                            this.V0.getLayoutParams().height = iDpToPx18;
                        }
                    } else {
                        boolean zEquals31 = strA0.equals(str);
                        LinearLayout linearLayout36 = this.f1;
                        if (zEquals31) {
                            linearLayout36.getLayoutParams().height = iDpToPx16;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx16;
                                this.U0.getLayoutParams().height = iDpToPx16;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx16;
                                this.V0.getLayoutParams().height = iDpToPx16;
                            }
                        } else {
                            linearLayout36.getLayoutParams().height = iDpToPx14;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx14;
                                this.U0.getLayoutParams().height = iDpToPx14;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx14;
                                this.V0.getLayoutParams().height = iDpToPx14;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx18;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx18;
                        this.U0.getLayoutParams().height = iDpToPx18;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx18;
                        this.V0.getLayoutParams().height = iDpToPx18;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx16;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx16;
                        this.U0.getLayoutParams().height = iDpToPx16;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx16;
                        this.V0.getLayoutParams().height = iDpToPx16;
                    }
                } else {
                    boolean zEquals32 = strA0.equals(str);
                    LinearLayout linearLayout37 = this.f1;
                    if (zEquals32) {
                        linearLayout37.getLayoutParams().height = iDpToPx14;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx14;
                            this.U0.getLayoutParams().height = iDpToPx14;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx14;
                            this.V0.getLayoutParams().height = iDpToPx14;
                        }
                    } else {
                        linearLayout37.getLayoutParams().height = iDpToPx12;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx12;
                            this.U0.getLayoutParams().height = iDpToPx12;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx12;
                            this.V0.getLayoutParams().height = iDpToPx12;
                        }
                    }
                }
            } else if (i10 == 10) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx21;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx21;
                            this.U0.getLayoutParams().height = iDpToPx21;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx21;
                            this.V0.getLayoutParams().height = iDpToPx21;
                        }
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx19;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx19;
                            this.U0.getLayoutParams().height = iDpToPx19;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx19;
                            this.V0.getLayoutParams().height = iDpToPx19;
                        }
                    } else {
                        boolean zEquals33 = strA0.equals(str);
                        LinearLayout linearLayout38 = this.f1;
                        if (zEquals33) {
                            linearLayout38.getLayoutParams().height = iDpToPx17;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx17;
                                this.U0.getLayoutParams().height = iDpToPx17;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx17;
                                this.V0.getLayoutParams().height = iDpToPx17;
                            }
                        } else {
                            linearLayout38.getLayoutParams().height = iDpToPx15;
                            if (iK == 0) {
                                this.U0.getLayoutParams().width = iDpToPx15;
                                this.U0.getLayoutParams().height = iDpToPx15;
                            } else {
                                this.V0.getLayoutParams().width = iDpToPx15;
                                this.V0.getLayoutParams().height = iDpToPx15;
                            }
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx19;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx19;
                        this.U0.getLayoutParams().height = iDpToPx19;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx19;
                        this.V0.getLayoutParams().height = iDpToPx19;
                    }
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx17;
                    if (iK == 0) {
                        this.U0.getLayoutParams().width = iDpToPx17;
                        this.U0.getLayoutParams().height = iDpToPx17;
                    } else {
                        this.V0.getLayoutParams().width = iDpToPx17;
                        this.V0.getLayoutParams().height = iDpToPx17;
                    }
                } else {
                    boolean zEquals34 = strA0.equals(str);
                    LinearLayout linearLayout39 = this.f1;
                    if (zEquals34) {
                        linearLayout39.getLayoutParams().height = iDpToPx15;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx15;
                            this.U0.getLayoutParams().height = iDpToPx15;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx15;
                            this.V0.getLayoutParams().height = iDpToPx15;
                        }
                    } else {
                        linearLayout39.getLayoutParams().height = iDpToPx13;
                        if (iK == 0) {
                            this.U0.getLayoutParams().width = iDpToPx13;
                            this.U0.getLayoutParams().height = iDpToPx13;
                        } else {
                            this.V0.getLayoutParams().width = iDpToPx13;
                            this.V0.getLayoutParams().height = iDpToPx13;
                        }
                    }
                }
            }
        } else {
            int i11 = zV0 != 0 ? 2 : 1;
            int i12 = i11 + 1;
            if (zI0 != 0) {
                i12 = i11 + 2;
            }
            if (z || z2) {
                i12++;
            }
            if (z3) {
                i12++;
            }
            if (zF0) {
                i12++;
            }
            if (zH0) {
                i12++;
            }
            int iDpToPx22 = HelperClass.dpToPx(this, 45);
            int iDpToPx23 = HelperClass.dpToPx(this, 50);
            int iDpToPx24 = HelperClass.dpToPx(this, 55);
            int iDpToPx25 = HelperClass.dpToPx(this, 60);
            int iDpToPx26 = HelperClass.dpToPx(this, 65);
            int iDpToPx27 = HelperClass.dpToPx(this, 70);
            int iDpToPx28 = HelperClass.dpToPx(this, 75);
            int iDpToPx29 = HelperClass.dpToPx(this, 80);
            int iDpToPx30 = HelperClass.dpToPx(this, 85);
            int iDpToPx31 = HelperClass.dpToPx(this, 90);
            int iDpToPx32 = HelperClass.dpToPx(this, 95);
            int iDpToPx33 = HelperClass.dpToPx(this, 100);
            int iDpToPx34 = HelperClass.dpToPx(this, fh.W0);
            int iDpToPx35 = HelperClass.dpToPx(this, fh.k1);
            int iDpToPx36 = HelperClass.dpToPx(this, 115);
            int iDpToPx37 = HelperClass.dpToPx(this, 120);
            int iDpToPx38 = HelperClass.dpToPx(this, 125);
            int iDpToPx39 = HelperClass.dpToPx(this, 130);
            int iDpToPx40 = HelperClass.dpToPx(this, 135);
            int iDpToPx41 = HelperClass.dpToPx(this, 140);
            int iDpToPx42 = HelperClass.dpToPx(this, 145);
            if (i12 == 2) {
                if (zL0 == 0 && zX0 == 0 && zD0 == 0) {
                    if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                        if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx29;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx27;
                        } else {
                            boolean zEquals35 = strA0.equals(str);
                            LinearLayout linearLayout40 = this.f1;
                            if (zEquals35) {
                                linearLayout40.getLayoutParams().height = iDpToPx26;
                            } else {
                                linearLayout40.getLayoutParams().height = iDpToPx25;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx25;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx24;
                    } else {
                        boolean zEquals36 = strA0.equals(str);
                        LinearLayout linearLayout41 = this.f1;
                        if (zEquals36) {
                            linearLayout41.getLayoutParams().height = iDpToPx23;
                        } else {
                            linearLayout41.getLayoutParams().height = iDpToPx22;
                        }
                    }
                } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx35;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx33;
                    } else {
                        boolean zEquals37 = strA0.equals(str);
                        LinearLayout linearLayout42 = this.f1;
                        if (zEquals37) {
                            linearLayout42.getLayoutParams().height = iDpToPx31;
                        } else {
                            linearLayout42.getLayoutParams().height = iDpToPx29;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx33;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx31;
                } else {
                    boolean zEquals38 = strA0.equals(str);
                    LinearLayout linearLayout43 = this.f1;
                    if (zEquals38) {
                        linearLayout43.getLayoutParams().height = iDpToPx29;
                    } else {
                        linearLayout43.getLayoutParams().height = iDpToPx27;
                    }
                }
            } else if (i12 == 3) {
                if (zL0 == 0 && zX0 == 0 && zD0 == 0) {
                    if (zV0 != 0) {
                        if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                            if (strA0.equals("Large")) {
                                this.f1.getLayoutParams().height = iDpToPx32;
                            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                                this.f1.getLayoutParams().height = iDpToPx30;
                            } else {
                                boolean zEquals39 = strA0.equals(str);
                                LinearLayout linearLayout44 = this.f1;
                                if (zEquals39) {
                                    linearLayout44.getLayoutParams().height = iDpToPx28;
                                } else {
                                    linearLayout44.getLayoutParams().height = iDpToPx26;
                                }
                            }
                        } else if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx30;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx28;
                        } else {
                            boolean zEquals40 = strA0.equals(str);
                            LinearLayout linearLayout45 = this.f1;
                            if (zEquals40) {
                                linearLayout45.getLayoutParams().height = iDpToPx26;
                            } else {
                                linearLayout45.getLayoutParams().height = iDpToPx24;
                            }
                        }
                    } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                        if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx30;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx28;
                        } else {
                            boolean zEquals41 = strA0.equals(str);
                            LinearLayout linearLayout46 = this.f1;
                            if (zEquals41) {
                                linearLayout46.getLayoutParams().height = iDpToPx26;
                            } else {
                                linearLayout46.getLayoutParams().height = iDpToPx24;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx28;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx26;
                    } else {
                        boolean zEquals42 = strA0.equals(str);
                        LinearLayout linearLayout47 = this.f1;
                        if (zEquals42) {
                            linearLayout47.getLayoutParams().height = iDpToPx24;
                        } else {
                            linearLayout47.getLayoutParams().height = iDpToPx22;
                        }
                    }
                } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx34;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx32;
                    } else {
                        boolean zEquals43 = strA0.equals(str);
                        LinearLayout linearLayout48 = this.f1;
                        if (zEquals43) {
                            linearLayout48.getLayoutParams().height = iDpToPx30;
                        } else {
                            linearLayout48.getLayoutParams().height = iDpToPx28;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx32;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx30;
                } else {
                    boolean zEquals44 = strA0.equals(str);
                    LinearLayout linearLayout49 = this.f1;
                    if (zEquals44) {
                        linearLayout49.getLayoutParams().height = iDpToPx28;
                    } else {
                        linearLayout49.getLayoutParams().height = iDpToPx26;
                    }
                }
            } else if (i12 == 4) {
                if (zL0 == 0 && zX0 == 0 && zD0 == 0) {
                    if (zV0 != 0) {
                        if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                            if (strA0.equals("Large")) {
                                this.f1.getLayoutParams().height = iDpToPx33;
                            } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                                this.f1.getLayoutParams().height = iDpToPx31;
                            } else {
                                boolean zEquals45 = strA0.equals(str);
                                LinearLayout linearLayout50 = this.f1;
                                if (zEquals45) {
                                    linearLayout50.getLayoutParams().height = iDpToPx29;
                                } else {
                                    linearLayout50.getLayoutParams().height = iDpToPx27;
                                }
                            }
                        } else if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx31;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx29;
                        } else {
                            boolean zEquals46 = strA0.equals(str);
                            LinearLayout linearLayout51 = this.f1;
                            if (zEquals46) {
                                linearLayout51.getLayoutParams().height = iDpToPx27;
                            } else {
                                linearLayout51.getLayoutParams().height = iDpToPx25;
                            }
                        }
                    } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                        if (strA0.equals("Large")) {
                            this.f1.getLayoutParams().height = iDpToPx31;
                        } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                            this.f1.getLayoutParams().height = iDpToPx29;
                        } else {
                            boolean zEquals47 = strA0.equals(str);
                            LinearLayout linearLayout52 = this.f1;
                            if (zEquals47) {
                                linearLayout52.getLayoutParams().height = iDpToPx27;
                            } else {
                                linearLayout52.getLayoutParams().height = iDpToPx25;
                            }
                        }
                    } else if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx29;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx27;
                    } else {
                        boolean zEquals48 = strA0.equals(str);
                        LinearLayout linearLayout53 = this.f1;
                        if (zEquals48) {
                            linearLayout53.getLayoutParams().height = iDpToPx25;
                        } else {
                            linearLayout53.getLayoutParams().height = iDpToPx23;
                        }
                    }
                } else if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx34;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx32;
                    } else {
                        boolean zEquals49 = strA0.equals(str);
                        LinearLayout linearLayout54 = this.f1;
                        if (zEquals49) {
                            linearLayout54.getLayoutParams().height = iDpToPx30;
                        } else {
                            linearLayout54.getLayoutParams().height = iDpToPx28;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx32;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx30;
                } else {
                    boolean zEquals50 = strA0.equals(str);
                    LinearLayout linearLayout55 = this.f1;
                    if (zEquals50) {
                        linearLayout55.getLayoutParams().height = iDpToPx28;
                    } else {
                        linearLayout55.getLayoutParams().height = iDpToPx26;
                    }
                }
            } else if (i12 == 5) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx34;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx32;
                    } else {
                        boolean zEquals51 = strA0.equals(str);
                        LinearLayout linearLayout56 = this.f1;
                        if (zEquals51) {
                            linearLayout56.getLayoutParams().height = iDpToPx30;
                        } else {
                            linearLayout56.getLayoutParams().height = iDpToPx28;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx32;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx30;
                } else {
                    boolean zEquals52 = strA0.equals(str);
                    LinearLayout linearLayout57 = this.f1;
                    if (zEquals52) {
                        linearLayout57.getLayoutParams().height = iDpToPx28;
                    } else {
                        linearLayout57.getLayoutParams().height = iDpToPx26;
                    }
                }
            } else if (i12 == 6) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx36;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx34;
                    } else {
                        boolean zEquals53 = strA0.equals(str);
                        LinearLayout linearLayout58 = this.f1;
                        if (zEquals53) {
                            linearLayout58.getLayoutParams().height = iDpToPx32;
                        } else {
                            linearLayout58.getLayoutParams().height = iDpToPx30;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx34;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx32;
                } else {
                    boolean zEquals54 = strA0.equals(str);
                    LinearLayout linearLayout59 = this.f1;
                    if (zEquals54) {
                        linearLayout59.getLayoutParams().height = iDpToPx30;
                    } else {
                        linearLayout59.getLayoutParams().height = iDpToPx28;
                    }
                }
            } else if (i12 == 7) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx38;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx36;
                    } else {
                        boolean zEquals55 = strA0.equals(str);
                        LinearLayout linearLayout60 = this.f1;
                        if (zEquals55) {
                            linearLayout60.getLayoutParams().height = iDpToPx34;
                        } else {
                            linearLayout60.getLayoutParams().height = iDpToPx32;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx36;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx34;
                } else {
                    boolean zEquals56 = strA0.equals(str);
                    LinearLayout linearLayout61 = this.f1;
                    if (zEquals56) {
                        linearLayout61.getLayoutParams().height = iDpToPx32;
                    } else {
                        linearLayout61.getLayoutParams().height = iDpToPx30;
                    }
                }
            } else if (i12 == 8) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx40;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx38;
                    } else {
                        boolean zEquals57 = strA0.equals(str);
                        LinearLayout linearLayout62 = this.f1;
                        if (zEquals57) {
                            linearLayout62.getLayoutParams().height = iDpToPx36;
                        } else {
                            linearLayout62.getLayoutParams().height = iDpToPx34;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx38;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx36;
                } else {
                    boolean zEquals58 = strA0.equals(str);
                    LinearLayout linearLayout63 = this.f1;
                    if (zEquals58) {
                        linearLayout63.getLayoutParams().height = iDpToPx34;
                    } else {
                        linearLayout63.getLayoutParams().height = iDpToPx32;
                    }
                }
            } else if (i12 == 9) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx41;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx39;
                    } else {
                        boolean zEquals59 = strA0.equals(str);
                        LinearLayout linearLayout64 = this.f1;
                        if (zEquals59) {
                            linearLayout64.getLayoutParams().height = iDpToPx37;
                        } else {
                            linearLayout64.getLayoutParams().height = iDpToPx35;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx39;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx37;
                } else {
                    boolean zEquals60 = strA0.equals(str);
                    LinearLayout linearLayout65 = this.f1;
                    if (zEquals60) {
                        linearLayout65.getLayoutParams().height = iDpToPx35;
                    } else {
                        linearLayout65.getLayoutParams().height = iDpToPx33;
                    }
                }
            } else if (i12 == 10) {
                if (zM0 || zB0 || zO0 || zW0 || zQ0 || zJ0) {
                    if (strA0.equals("Large")) {
                        this.f1.getLayoutParams().height = iDpToPx42;
                    } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                        this.f1.getLayoutParams().height = iDpToPx40;
                    } else {
                        boolean zEquals61 = strA0.equals(str);
                        LinearLayout linearLayout66 = this.f1;
                        if (zEquals61) {
                            linearLayout66.getLayoutParams().height = iDpToPx38;
                        } else {
                            linearLayout66.getLayoutParams().height = iDpToPx36;
                        }
                    }
                } else if (strA0.equals("Large")) {
                    this.f1.getLayoutParams().height = iDpToPx40;
                } else if (strA0.equals(Default.TEMPLATE_SIZE)) {
                    this.f1.getLayoutParams().height = iDpToPx38;
                } else {
                    boolean zEquals62 = strA0.equals(str);
                    LinearLayout linearLayout67 = this.f1;
                    if (zEquals62) {
                        linearLayout67.getLayoutParams().height = iDpToPx36;
                    } else {
                        linearLayout67.getLayoutParams().height = iDpToPx34;
                    }
                }
            }
        }
        this.e1.setVisibility(0);
        this.a1.setOrientation(1);
        this.a1.setGravity(19);
        this.a1.getLayoutParams().width = -2;
        this.a1.getLayoutParams().width = -2;
        this.d1.setVisibility(0);
        f1();
        this.B.setVisibility(0);
        this.f1.setVisibility(0);
    }

    public final int e0() {
        return jb5.j(this, this, "timezone value", 6);
    }

    public final void e1() {
        boolean zEquals = c0().equals("Celsius");
        TextView textView = this.D;
        if (zEquals) {
            textView.setText(HelperClass.getCelcius(this.g3));
            this.N.setText(HelperClass.getCelcius(this.g3));
        } else {
            textView.setText(HelperClass.getFahrenheit(this.g3));
            this.N.setText(HelperClass.getFahrenheit(this.g3));
        }
    }

    public final int f0() {
        return jb5.j(this, this, "Weather Color", -1);
    }

    public final void f1() {
        String string;
        String strTrim = this.l4.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.l4.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.l4.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.l4.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.l4.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
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
        if (z0() && (string = this.l4.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (r0()) {
            strTrim = strTrim.isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        if (u0()) {
            if (t0()) {
                strTrim3 = strTrim.isEmpty() ? eo7.j(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (t0()) {
            strTrim3 = strTrim.isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!s0()) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.isEmpty()) {
            strTrim4 = "Loading...";
        }
        String strX = !strTrim4.isEmpty() ? x(u(), strTrim4) : "";
        String strX2 = x(G(), this.T3.getLatLong(this, F()));
        Log.e("latLong111 : ", strX2);
        if (F() != 6 && F() != 7 && strX2.length() > 55 && E0() && !L0() && !D0() && !x0()) {
            String[] strArrSplit = strX2.split(" Long");
            strX2 = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        if (v0()) {
            strX2 = eo7.x(strX, "<br/>", strX2);
        }
        if (I0()) {
            String string2 = this.l4.getString(this, SP.PLUS_CODE, "");
            if (!string2.isEmpty() && Q().equals("concise")) {
                string2 = string2.substring(4);
            }
            String strX3 = x(R(), "Plus Code : ".concat(string2));
            strX2 = v0() ? eo7.x(strX2, "<br/>", strX3) : strX3;
        }
        if (A0()) {
            String strX4 = x(C(), HelperClass.setDateTimeFormat(this, B()));
            strX2 = (v0() || I0()) ? eo7.x(strX2, "<br/>", strX4) : strX4;
        }
        if (K0()) {
            String strX5 = x(C(), d0(e0()));
            if (A0()) {
                strX2 = eo7.x(strX2, " ", strX5);
            } else {
                strX2 = (v0() || I0()) ? eo7.x(strX2, "<br/>", strX5) : strX5;
            }
        }
        if (F0()) {
            String strX6 = x(M(), k0());
            strX2 = (v0() || A0() || K0() || I0()) ? eo7.x(strX2, "<br/>", strX6) : strX6;
        }
        if (G0()) {
            String strX7 = x(N(), (T() + " " + W() + " " + b0()).trim());
            strX2 = (v0() || A0() || K0() || F0() || I0()) ? eo7.x(strX2, "<br/>", strX7) : strX7;
        }
        if (H0()) {
            String strX8 = x(P(), (getString(R.string.person_name) + " : " + O()).trim());
            strX2 = (v0() || A0() || K0() || F0() || I0() || G0()) ? eo7.x(strX2, "<br/>", strX8) : strX8;
        }
        if (y0()) {
            String strX9 = x(A(), z().trim());
            strX2 = (v0() || A0() || K0() || F0() || I0() || G0() || H0()) ? eo7.x(strX2, "<br/>", strX9) : strX9;
        }
        if (strX2.contains("null")) {
            strX2 = strX2.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.B.setText(Html.fromHtml(strX2));
            return;
        }
        SpannableString spannableString = new SpannableString(strConcat);
        spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(X()), 0, strConcat.length(), 0);
        Html.fromHtml("<br/>" + strX2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strX2));
        this.B.setText(spannableStringBuilder);
    }

    public final int g0() {
        return jb5.j(this, this, "Wind Color", -1);
    }

    public final void g1() {
        String string;
        String strTrim = this.l4.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.l4.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.l4.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.l4.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.l4.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strConcat = (strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (!strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (!strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (z0() && (string = this.l4.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (r0()) {
            strTrim = strTrim.isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        if (u0()) {
            if (t0()) {
                strTrim3 = strTrim.isEmpty() ? eo7.x(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (t0()) {
            strTrim3 = strTrim.isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!s0()) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.isEmpty()) {
            strTrim4 = "Loading...";
        }
        String strX = x(u(), strTrim4);
        String strX2 = x(G(), this.T3.getLatLong(this, F()));
        if (F() != 6 && F() != 7 && strX2.length() > 55 && E0() && !L0() && !x0()) {
            String[] strArrSplit = strX2.split(" Long");
            strX2 = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        if (v0()) {
            strX2 = eo7.x(strX, "<br/>", strX2);
        }
        String strX3 = x(C(), HelperClass.getDateTimeDt(this, B()));
        String strX4 = x(C(), HelperClass.getDayDt(this));
        String strX5 = x(C(), HelperClass.getDateTimeDt(this, this.l4.getString(this, "time_format_temp", Default.DEFAULT_TIME_FORMAT_DT)));
        this.v4.setText(Html.fromHtml(strX3));
        this.w4.setText(Html.fromHtml(strX5));
        this.x4.setText(Html.fromHtml(strX4));
        if (F0()) {
            String strX6 = x(M(), k0());
            strX2 = v0() ? eo7.x(strX2, "<br/>", strX6) : strX6;
        }
        if (H0()) {
            String strX7 = x(P(), (getString(R.string.person_name) + " : " + O()).trim());
            strX2 = (v0() || F0()) ? eo7.x(strX2, "<br/>", strX7) : strX7;
        }
        if (y0()) {
            String strX8 = x(A(), z().trim());
            strX2 = (v0() || F0() || H0()) ? eo7.x(strX2, "<br/>", strX8) : strX8;
        }
        if (strX2.contains("null")) {
            strX2 = strX2.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.B.setText(Html.fromHtml(strX2));
            return;
        }
        SpannableString spannableString = new SpannableString(strConcat);
        spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, strConcat.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(X()), 0, strConcat.length(), 0);
        SpannableString spannableString2 = new SpannableString(Html.fromHtml(strX2));
        spannableString2.setSpan(new StyleSpan(0), 0, spannableString2.length(), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) spannableString2);
        this.B.setText(spannableStringBuilder);
    }

    public final int h0() {
        return this.l4.getInteger(this, "accuracy_position", 0);
    }

    public final void h1() {
        String string;
        String strTrim = this.l4.getString(this, SP.LOC_LINE_1_ADDRESS, "").trim();
        String strTrim2 = this.l4.getString(this, SP.LOC_LINE_2_CITY, "").trim();
        String strTrim3 = this.l4.getString(this, SP.LOC_LINE_3_STATE, "").trim();
        String strTrim4 = this.l4.getString(this, SP.LOC_LINE_4_COUNTRY, "").trim();
        String strTrim5 = this.l4.getString(this, SP.LOC_LINE_5_PINCODE, "").trim();
        String strConcat = (strTrim2.isEmpty() || strTrim2.equalsIgnoreCase("null")) ? "" : strTrim2.concat(", ");
        if (!strTrim3.isEmpty() && !strTrim3.equalsIgnoreCase("null")) {
            strConcat = eo7.k(strConcat, "", strTrim3, ", ");
        }
        if (!strTrim4.isEmpty() && !strTrim4.equalsIgnoreCase("null")) {
            strConcat = strConcat.concat(strTrim4);
        }
        if (strConcat.endsWith(", ")) {
            strConcat = fz7.g(2, 0, strConcat);
        }
        if (z0() && (string = this.l4.getString(this, SP.LOC_COUNTRY_CODE, "")) != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            StringBuilder sbM = dt7.m(strConcat, " ");
            sbM.append(new utils().getFlagEmojiFromLatLong(string));
            strConcat = sbM.toString();
        }
        if (r0()) {
            strTrim = strTrim.isEmpty() ? strTrim2 : eo7.x(strTrim, ", ", strTrim2);
        }
        if (u0()) {
            if (t0()) {
                strTrim3 = strTrim.isEmpty() ? eo7.x(strTrim3, " ", strTrim5) : eo7.l(strTrim, ", ", strTrim3, " ", strTrim5);
            } else if (!strTrim.isEmpty()) {
                strTrim3 = eo7.x(strTrim, ", ", strTrim3);
            }
        } else if (t0()) {
            strTrim3 = strTrim.isEmpty() ? strTrim5 : eo7.x(strTrim, ", ", strTrim5);
        } else {
            strTrim3 = strTrim;
        }
        if (!s0()) {
            strTrim4 = strTrim3;
        } else if (!strTrim3.isEmpty()) {
            strTrim4 = eo7.x(strTrim3, ", ", strTrim4);
        }
        if (strTrim4.isEmpty()) {
            strTrim4 = "Loading...";
        }
        String strX = x(u(), strTrim4);
        String strX2 = x(G(), this.T3.getLatLong(this, F()));
        Log.e("latLong111 : ", strX2);
        if (F() != 6 && F() != 7 && strX2.length() > 55 && E0() && !L0() && !D0() && !x0()) {
            String[] strArrSplit = strX2.split(" Long");
            strX2 = strArrSplit[0] + "<br/>Long " + strArrSplit[1];
        }
        if (v0()) {
            strX2 = eo7.x(strX, "<br/>", strX2);
        }
        if (I0()) {
            String string2 = this.l4.getString(this, SP.PLUS_CODE, "");
            if (!string2.isEmpty() && Q().equals("concise")) {
                string2 = string2.substring(4);
            }
            String strX3 = x(R(), "Plus Code : ".concat(string2));
            strX2 = v0() ? eo7.x(strX2, "<br/>", strX3) : strX3;
        }
        if (A0()) {
            String strX4 = x(C(), HelperClass.setDateTimeFormat(this, B()));
            strX2 = (v0() || I0()) ? eo7.x(strX2, "<br/>", strX4) : strX4;
        }
        if (K0()) {
            String strX5 = x(C(), d0(e0()));
            if (A0()) {
                strX2 = eo7.x(strX2, " ", strX5);
            } else {
                strX2 = (v0() || I0()) ? eo7.x(strX2, "<br/>", strX5) : strX5;
            }
        }
        if (F0()) {
            String strX6 = x(M(), k0());
            strX2 = (v0() || A0() || K0() || I0()) ? eo7.x(strX2, "<br/>", strX6) : strX6;
        }
        if (G0()) {
            String strX7 = x(N(), (T() + " " + W() + " " + b0()).trim());
            strX2 = (v0() || A0() || K0() || F0() || I0()) ? eo7.x(strX2, "<br/>", strX7) : strX7;
        }
        if (H0()) {
            String strX8 = x(P(), (getString(R.string.person_name) + " : " + O()).trim());
            strX2 = (v0() || A0() || K0() || F0() || I0() || G0()) ? eo7.x(strX2, "<br/>", strX8) : strX8;
        }
        if (y0()) {
            String strX9 = x(A(), z().trim());
            strX2 = (v0() || A0() || K0() || F0() || I0() || G0() || H0()) ? eo7.x(strX2, "<br/>", strX9) : strX9;
        }
        if (this.l4.getBoolean(this, "azimuthTemp", true)) {
            String strX10 = x(new SP(this).getInteger(this, "Azimuth_Color", -1), ("Azimuth/Bearing : " + String.format("%.2f", Float.valueOf(this.A4)) + "°").trim());
            strX2 = (v0() || A0() || K0() || F0() || I0() || G0() || H0() || y0()) ? eo7.x(strX2, "<br/>", strX10) : strX10;
        }
        if (this.l4.getBoolean(this, "aqiLevelTemp", false)) {
            String strX11 = x(new SP(this).getInteger(this, BsqQtlfRBQqL.XYsov, -1), HelperClass.getAqiValueText(this, this.l4.getString(this, SP.AQI_LEVEL_VALUE, "-")).trim());
            strX2 = (v0() || A0() || K0() || F0() || I0() || G0() || H0() || y0() || this.l4.getBoolean(this, "azimuthTemp", true)) ? eo7.x(strX2, "<br/>", strX11) : strX11;
        }
        if (strX2.contains("null")) {
            strX2 = strX2.replace("null", "Loading...");
        }
        if (strConcat.isEmpty()) {
            this.B.setText(Html.fromHtml(strX2));
            return;
        }
        SpannableString spannableString = new SpannableString(strConcat);
        spannableString.setSpan(new RelativeSizeSpan(1.6f), 0, strConcat.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(X()), 0, strConcat.length(), 0);
        Html.fromHtml("<br/>" + strX2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) Html.fromHtml(strX2));
        this.B.setText(spannableStringBuilder);
    }

    public final int i0() {
        return this.l4.getInteger(this, "altitude_position", 0);
    }

    public final void i1() {
        this.Q.setText(HelperClass.getAccuracy(this, h0()));
        int i = this.f3;
        if (i == 2) {
            b1();
            return;
        }
        if (i == 3) {
            V0();
        } else if (i == 4) {
            R0();
        } else {
            d1();
        }
    }

    public final String j0() {
        int i = this.f3;
        if (i == 0) {
            return this.l4.getString(this, SP.STAMP_FONT_STYLE, Default.DEFAULT_FONT_STYLE);
        }
        if (i == 1) {
            return this.l4.getString(this, SP.STAMP_FONT_STYLE_CLASSIC, Default.DEFAULT_FONT_STYLE);
        }
        if (i == 2) {
            return this.l4.getString(this, SP.STAMP_FONT_STYLE_REPORTING, Default.DEFAULT_FONT_STYLE);
        }
        if (i == 3) {
            return this.l4.getString(this, SP.STAMP_FONT_STYLE_NC, Default.DEFAULT_FONT_STYLE);
        }
        SP sp = this.l4;
        return i == 4 ? sp.getString(this, SP.STAMP_FONT_STYLE_DT, Default.DEFAULT_FONT_STYLE_DT) : sp.getString(this, SP.STAMP_FONT_STYLE_QR, Default.DEFAULT_FONT_STYLE);
    }

    public final void j1() {
        this.P.setText(HelperClass.getAltitudeconvert(this, i0()));
        int i = this.f3;
        if (i == 2) {
            b1();
            return;
        }
        if (i == 3) {
            V0();
        } else if (i == 4) {
            R0();
        } else {
            d1();
        }
    }

    public final String k0() {
        return this.l4.getString(this, "notes", Default.notes);
    }

    public final void k1() {
        this.H.setText(this.l4.getString(this, SP.COMPASS_VALUE, "-"));
        this.i0.setText(this.l4.getString(this, SP.COMPASS_VALUE, "-"));
    }

    public final int l0() {
        return this.l4.getInteger(this, "pressure_postion", 0);
    }

    public final void l1() {
        String string;
        String strJ0 = j0();
        Typeface fontStyle = HelperClass.getFontStyle(this, strJ0);
        this.B.setTypeface(fontStyle);
        this.D.setTypeface(fontStyle);
        this.H.setTypeface(fontStyle);
        if (this.f3 == 2) {
            if (K() == 0) {
                this.r4.setTypeface(fontStyle);
            } else {
                this.s4.setTypeface(fontStyle);
            }
        }
        if (this.f3 == 4) {
            this.v4.setTypeface(fontStyle);
            this.w4.setTypeface(fontStyle);
            this.x4.setTypeface(fontStyle);
            this.I.setTypeface(fontStyle);
        } else {
            this.W.setTypeface(fontStyle);
            this.C.setTypeface(fontStyle);
            this.d0.setTypeface(fontStyle);
            this.J.setTypeface(fontStyle);
        }
        TextView textView = this.O;
        int i = this.f3;
        if (i == 0) {
            string = this.l4.getString(this, SP.STAMP_FONT_NAME, Default.DEFAULT_FONT_NAME);
        } else if (i == 1) {
            string = this.l4.getString(this, SP.STAMP_FONT_NAME_CLASSIC, Default.DEFAULT_FONT_NAME);
        } else {
            SP sp = this.l4;
            if (i == 2) {
                string = sp.getString(this, SP.STAMP_FONT_NAME_REPORTING, Default.DEFAULT_FONT_NAME);
            } else if (i == 3) {
                string = sp.getString(this, SP.STAMP_FONT_NAME_NC, Default.DEFAULT_FONT_NAME);
            } else {
                string = i == 4 ? sp.getString(this, SP.STAMP_FONT_NAME_DT, Default.DEFAULT_FONT_NAME_DT) : sp.getString(this, SP.STAMP_FONT_NAME_QR, Default.DEFAULT_FONT_NAME);
            }
        }
        textView.setText(string);
        this.O.setTypeface(Typeface.createFromAsset(getResources().getAssets(), strJ0));
    }

    public final int m0() {
        return this.l4.getInteger(this, "wind_postion", 0);
    }

    public final void m1() {
        String strO = eo7.o(new StringBuilder(), this.l4.getString(this, SP.HUMIDITY_VALUE, ""), "%");
        this.F.setText(strO);
        if (B0()) {
            this.W.setText(strO);
            this.r0.setImageResource(R.drawable.ic_humidity);
        }
    }

    public final void n0() {
        FirebaseAnalytics.getInstance(this);
        if (this.g4.t().isEmpty()) {
            for (String str : this.f4) {
                this.g4.P(0, 0, 0, str, "");
            }
        } else {
            ArrayList arrayListT = this.g4.t();
            for (int i = 0; i < arrayListT.size() && !((DateTime) arrayListT.get(i)).getDate_format().equals(Default.DEFAULT_DATE_FORMAT); i++) {
                if (i == arrayListT.size() - 1) {
                    this.g4.P(0, 0, 0, Default.DEFAULT_DATE_FORMAT, "");
                    this.g4.P(0, 0, 0, "EEEE, MM/dd/yyyy hh:mm a", "");
                }
            }
        }
        String string = this.l4.getString(this, SP.LOC_COUNTRY_CODE, "");
        if (string != null && !string.isEmpty() && !string.equalsIgnoreCase("null")) {
            this.t4.setText("" + new utils().getFlagEmojiFromLatLong(string));
        }
        int i2 = this.f3;
        if (i2 == 0) {
            this.j4.setText(getString(R.string.advance_template));
        } else if (i2 == 1) {
            this.j4.setText(getString(R.string.classic_template));
        } else if (i2 == 2) {
            this.j4.setText(getString(R.string.reporting_template));
        } else {
            TextView textView = this.j4;
            if (i2 == 3) {
                textView.setText(getString(R.string.navigation_compass_template));
            } else if (i2 == 4) {
                textView.setText(getString(R.string.datetime_template));
            } else {
                textView.setText(getString(R.string.qr_code_template));
            }
        }
        int color = Color.parseColor("#9c000000");
        int i3 = this.f3;
        String str2 = ctcdTNpUjlfYHm.JKBTaKaz;
        if (i3 == 0) {
            this.r2 = this.l4.getInteger(this, SP.BACKGROUND_COLOR, color);
            this.t2 = this.l4.getInteger(this, SP.ADDRESS_COLOR, -1);
            this.w2 = this.l4.getInteger(this, SP.SHORT_ADDRESS_COLOR, -1);
            this.x2 = this.l4.getInteger(this, SP.DATE_TIME_COLOR, -1);
            this.y2 = this.l4.getInteger(this, SP.LAT_LNG_COLOR, -1);
            this.z2 = this.l4.getInteger(this, SP.PLUS_CODE_COLOR, -1);
            this.A2 = this.l4.getInteger(this, SP.WEATHER_COLOR, -1);
            this.B2 = this.l4.getInteger(this, SP.MAGNETIC_FIELD_COLOR, -1);
            this.C2 = this.l4.getInteger(this, SP.COMPASS_COLOR, -1);
            this.D2 = this.l4.getInteger(this, SP.NOTES_HASHTAG_COLOR, -1);
            this.E2 = this.l4.getInteger(this, SP.WIND_COLOR, -1);
            this.F2 = this.l4.getInteger(this, SP.HUMIDITY_COLOR, -1);
            this.G2 = this.l4.getInteger(this, SP.PRESSURE_COLOR, -1);
            this.H2 = this.l4.getInteger(this, SP.ELEVATION_COLOR, -1);
            this.I2 = this.l4.getInteger(this, SP.ALTITUDE_COLOR, -1);
            this.J2 = this.l4.getInteger(this, SP.ACCURACY_COLOR, -1);
            this.P2 = this.l4.getInteger(this, SP.SOUNDLEVEL_COLOR, -1);
            this.T2 = this.l4.getInteger(this, SP.NUMBERING_COLOR, -1);
            this.u2 = this.l4.getInteger(this, SP.PERSON_NAME_COLOR, -1);
            this.v2 = this.l4.getInteger(this, SP.CONTACT_NUMBER_COLOR, -1);
            this.R2 = this.l4.getInteger(this, SP.TIMEZONE, 6);
            this.S2 = this.l4.getInteger(this, SP.SEQUENCE, 1);
            this.Y2 = this.l4.getString(this, SP.SUFFIX, "");
            this.Z2 = this.l4.getString(this, SP.PREFIX, "");
            this.a3 = this.l4.getString(this, SP.PERSON_NAME, "-");
            this.b3 = this.l4.getString(this, SP.CONTACT_NUMBER, Default.contactNumber);
            this.S3 = this.l4.getInteger(this, SP.MAP_ZOOM_SCALE, 78);
            this.h3 = this.l4.getBoolean(this, SP.IS_MAP, true);
            this.G3 = this.l4.getBoolean(this, SP.IS_COUNTRY_FLAG, true);
            this.R3 = this.l4.getInteger(this, SP.MAP_POS_TYPE, 0);
            this.i3 = this.l4.getBoolean(this, SP.IS_ADDRESS, true);
            this.H3 = this.l4.getBoolean(this, SP.IS_ADDRESS_CITY, true);
            this.I3 = this.l4.getBoolean(this, SP.IS_ADDRESS_STATE, true);
            this.J3 = this.l4.getBoolean(this, SP.IS_ADDRESS_COUNTRY, true);
            this.K3 = this.l4.getBoolean(this, SP.IS_ADDRESS_PINCODE, true);
            this.j3 = this.l4.getBoolean(this, SP.IS_PLUS_CODE, false);
            this.k3 = this.l4.getBoolean(this, SP.IS_WEATHER, false);
            this.o3 = this.l4.getBoolean(this, SP.IS_DATE_TIME, true);
            this.p3 = this.l4.getBoolean(this, SP.IS_TIMEZONE, true);
            this.q3 = this.l4.getBoolean(this, SP.IS_NUMBERING, false);
            this.E3 = this.l4.getBoolean(this, SP.IS_PERSON_NAME, false);
            this.F3 = this.l4.getBoolean(this, SP.IS_CONTACT_NUMBER, false);
            this.r3 = this.l4.getBoolean(this, SP.IS_INCREMENT, true);
            this.s3 = this.l4.getBoolean(this, SP.IS_MAGNETIC_FIELD, false);
            this.t3 = this.l4.getBoolean(this, SP.IS_COMPASS, false);
            this.v3 = this.l4.getBoolean(this, SP.IS_WIND, false);
            this.w3 = this.l4.getBoolean(this, SP.IS_LOGO, false);
            this.x3 = this.l4.getBoolean(this, SP.IS_NOTES, true);
            this.z3 = this.l4.getBoolean(this, SP.IS_PRESSURE, false);
            this.y3 = this.l4.getBoolean(this, SP.IS_HUMIDITY, false);
            this.A3 = this.l4.getBoolean(this, SP.IS_ELEVATION, false);
            this.B3 = this.l4.getBoolean(this, SP.IS_ALTITUDE, false);
            this.C3 = this.l4.getBoolean(this, SP.IS_ACCURACY, false);
            this.D3 = this.l4.getBoolean(this, SP.IS_SOUNDLEVEL, false);
            this.c3 = this.l4.getString(this, SP.LOGO_URI, Default.LOGO_uri);
            this.d3 = this.l4.getString(this, SP.NOTES_HASHTAG, Default.notes);
            this.e3 = this.l4.getString(this, SP.STAMP_FONT_STYLE, Default.DEFAULT_FONT_STYLE);
            this.u3 = this.l4.getBoolean(this, SP.COMPASS_FOUND, false);
            this.L3 = this.l4.getString(this, SP.DATE_FORMAT, Default.DEFAULT_DATE_FORMAT);
            this.Q3 = this.l4.getInteger(this, SP.LAT_LNG_TYPE, 1);
            this.M3 = this.l4.getString(this, SP.TEMPRATURE_TYPE, "Celsius");
            this.g3 = this.l4.getFloat(this, SP.TEMPRETURE_VALUE);
            this.m0.setImageResource(this.X3.getResourceId(this.l4.getInteger(this, SP.WEATHER_ICON, 0), 0));
            this.N3 = this.l4.getString(this, SP.MAP_TYPE_TEMPLATE, Default.SETELLITE_2);
            this.P3 = this.l4.getInteger(this, SP.MAP_POS, 1);
            this.G1 = this.l4.getBoolean(this, SP.ASK_NOTE_EVERY_TIME, false);
            this.U3 = this.l4.getString(this, SP.STAMP_POS, str2);
            this.V3 = this.l4.getString(this, SP.STAMP_SIZE, Default.TEMPLATE_SIZE);
            this.W3 = this.l4.getString(this, SP.PLUS_CODE_TYPE, Default.PLUSCODE_TYPE);
            this.M2 = this.l4.getInteger(this, SP.WIND_SELECT, 0);
            this.N2 = this.l4.getInteger(this, SP.ALTITUDE_SELECT, 0);
            this.O2 = this.l4.getInteger(this, SP.ACCURACY_SELECT, 0);
            this.Q2 = this.l4.getInteger(this, SP.PRESSURE_SELECT, 0);
        } else if (i3 == 1) {
            this.r2 = this.l4.getInteger(this, SP.BACKGROUND_COLOR_CLASSIC, color);
            this.t2 = this.l4.getInteger(this, SP.ADDRESS_COLOR_CLASSIC, -1);
            this.w2 = this.l4.getInteger(this, SP.SHORT_ADDRESS_COLOR_CLASSIC, -1);
            this.x2 = this.l4.getInteger(this, SP.DATE_TIME_COLOR_CLASSIC, -1);
            this.y2 = this.l4.getInteger(this, SP.LAT_LNG_COLOR_CLASSIC, -1);
            this.z2 = this.l4.getInteger(this, SP.PLUS_CODE_COLOR_CLASSIC, -1);
            this.A2 = this.l4.getInteger(this, SP.WEATHER_COLOR_CLASSIC, -1);
            this.B2 = this.l4.getInteger(this, SP.MAGNETIC_FIELD_COLOR_CLASSIC, -1);
            this.C2 = this.l4.getInteger(this, zXAusrmFrBIQHr.XxRnb, -1);
            this.D2 = this.l4.getInteger(this, SP.NOTES_HASHTAG_COLOR_CLASSIC, -1);
            this.E2 = this.l4.getInteger(this, SP.WIND_COLOR_CLASSIC, -1);
            this.F2 = this.l4.getInteger(this, SP.HUMIDITY_COLOR_CLASSIC, -1);
            this.G2 = this.l4.getInteger(this, SP.PRESSURE_COLOR_CLASSIC, -1);
            this.H2 = this.l4.getInteger(this, SP.ELEVATION_COLOR_CLASSIC, -1);
            this.I2 = this.l4.getInteger(this, SP.ALTITUDE_COLOR_CLASSIC, -1);
            this.J2 = this.l4.getInteger(this, SP.ACCURACY_COLOR_CLASSIC, -1);
            this.P2 = this.l4.getInteger(this, SP.SOUNDLEVEL_COLOR_CLASSIC, -1);
            this.T2 = this.l4.getInteger(this, SP.NUMBERING_COLOR_CLASSIC, -1);
            this.u2 = this.l4.getInteger(this, SP.PERSON_NAME_COLOR_CLASSIC, -1);
            this.v2 = this.l4.getInteger(this, SP.CONTACT_NUMBER_COLOR_CLASSIC, -1);
            this.R2 = this.l4.getInteger(this, SP.TIMEZONE_CLASSIC, 6);
            this.S2 = this.l4.getInteger(this, SP.SEQUENCE_CLASSIC, 1);
            this.Y2 = this.l4.getString(this, SP.SUFFIX_CLASSIC, "");
            this.Z2 = this.l4.getString(this, SP.PREFIX_CLASSIC, "");
            this.a3 = this.l4.getString(this, SP.PERSON_NAME_CLASSIC, "-");
            this.b3 = this.l4.getString(this, SP.CONTACT_NUMBER_CLASSIC, Default.contactNumber);
            this.h3 = this.l4.getBoolean(this, SP.IS_MAP_CLASSIC, true);
            this.G3 = this.l4.getBoolean(this, SP.IS_COUNTRY_FLAG_CLASSIC, true);
            this.R3 = this.l4.getInteger(this, SP.MAP_POS_TYPE_CLASSIC, 0);
            this.i3 = this.l4.getBoolean(this, SP.IS_ADDRESS_CLASSIC, true);
            this.H3 = this.l4.getBoolean(this, SP.IS_ADDRESS_CITY_CLASSIC, true);
            this.I3 = this.l4.getBoolean(this, SP.IS_ADDRESS_STATE_CLASSIC, true);
            this.J3 = this.l4.getBoolean(this, SP.IS_ADDRESS_COUNTRY_CLASSIC, true);
            this.K3 = this.l4.getBoolean(this, SP.IS_ADDRESS_PINCODE_CLASSIC, true);
            this.j3 = this.l4.getBoolean(this, SP.IS_PLUS_CODE_CLASSIC, false);
            this.k3 = this.l4.getBoolean(this, SP.IS_WEATHER_CLASSIC, false);
            this.o3 = this.l4.getBoolean(this, SP.IS_DATE_TIME_CLASSIC, true);
            this.p3 = this.l4.getBoolean(this, SP.IS_TIMEZONE_CLASSIC, true);
            this.q3 = this.l4.getBoolean(this, SP.IS_NUMBERING_CLASSIC, false);
            this.E3 = this.l4.getBoolean(this, SP.IS_PERSON_NAME_CLASSIC, false);
            this.F3 = this.l4.getBoolean(this, SP.IS_CONTACT_NUMBER_CLASSIC, false);
            this.r3 = this.l4.getBoolean(this, SP.IS_INCREMENT_CLASSIC, true);
            this.s3 = this.l4.getBoolean(this, SP.IS_MAGNETIC_FIELD_CLASSIC, false);
            this.t3 = this.l4.getBoolean(this, SP.IS_COMPASS_CLASSIC, false);
            this.v3 = this.l4.getBoolean(this, SP.IS_WIND_CLASSIC, false);
            this.w3 = this.l4.getBoolean(this, SP.IS_LOGO_CLASSIC, false);
            this.x3 = this.l4.getBoolean(this, SP.IS_NOTES_CLASSIC, true);
            this.z3 = this.l4.getBoolean(this, SP.IS_PRESSURE_CLASSIC, false);
            this.y3 = this.l4.getBoolean(this, SP.IS_HUMIDITY_CLASSIC, false);
            this.A3 = this.l4.getBoolean(this, SP.IS_ELEVATION_CLASSIC, false);
            this.B3 = this.l4.getBoolean(this, SP.IS_ALTITUDE_CLASSIC, false);
            this.C3 = this.l4.getBoolean(this, SP.IS_ACCURACY_CLASSIC, false);
            this.D3 = this.l4.getBoolean(this, SP.IS_SOUNDLEVEL_CLASSIC, false);
            this.c3 = this.l4.getString(this, SP.LOGO_URI_CLASSIC, Default.LOGO_uri);
            this.d3 = this.l4.getString(this, SP.NOTES_HASHTAG_CLASSIC, Default.notes);
            this.S3 = this.l4.getInteger(this, SP.MAP_ZOOM_SCALE_CLASSIC, 78);
            this.e3 = this.l4.getString(this, SP.STAMP_FONT_STYLE_CLASSIC, Default.DEFAULT_FONT_STYLE);
            this.u3 = this.l4.getBoolean(this, SP.COMPASS_FOUND, false);
            this.L3 = this.l4.getString(this, SP.DATE_FORMAT_CLASSIC, Default.DEFAULT_DATE_FORMAT);
            this.Q3 = this.l4.getInteger(this, SP.LAT_LNG_TYPE_CLASSIC, 1);
            this.M3 = this.l4.getString(this, SP.TEMPRATURE_TYPE_CLASSIC, "Celsius");
            this.g3 = this.l4.getFloat(this, SP.TEMPRETURE_VALUE);
            this.m0.setImageResource(this.X3.getResourceId(this.l4.getInteger(this, SP.WEATHER_ICON, 0), 0));
            this.N3 = this.l4.getString(this, SP.MAP_TYPE_TEMPLATE_CLASSIC, Default.SETELLITE_2);
            this.P3 = this.l4.getInteger(this, SP.MAP_POS_CLASSIC, 1);
            this.G1 = this.l4.getBoolean(this, SP.ASK_NOTE_EVERY_TIME_CLASSIC, false);
            this.U3 = this.l4.getString(this, SP.STAMP_POS_CLASSIC, str2);
            this.V3 = this.l4.getString(this, SP.STAMP_SIZE_CLASSIC, Default.TEMPLATE_SIZE);
            this.W3 = this.l4.getString(this, SP.PLUS_CODE_TYPE_CLASSIC, Default.PLUSCODE_TYPE);
            this.M2 = this.l4.getInteger(this, SP.WIND_SELECT_CLASSIC, 0);
            this.N2 = this.l4.getInteger(this, SP.ALTITUDE_SELECT_CLASSIC, 0);
            this.O2 = this.l4.getInteger(this, SP.ACCURACY_SELECT_CLASSIC, 0);
            this.Q2 = this.l4.getInteger(this, SP.PRESSURE_SELECT_CLASSIC, 0);
        } else if (i3 == 2) {
            this.r2 = this.l4.getInteger(this, SP.BACKGROUND_COLOR_REPORTING, color);
            this.s2 = this.l4.getInteger(this, SP.REPORT_BACKGROUND_COLOR_REPORTING, Default.RBG_COLOR);
            this.t2 = this.l4.getInteger(this, SP.ADDRESS_COLOR_REPORTING, -1);
            this.w2 = this.l4.getInteger(this, SP.SHORT_ADDRESS_COLOR_REPORTING, -1);
            this.x2 = this.l4.getInteger(this, SP.DATE_TIME_COLOR_REPORTING, -1);
            this.y2 = this.l4.getInteger(this, SP.LAT_LNG_COLOR_REPORTING, -1);
            this.z2 = this.l4.getInteger(this, SP.PLUS_CODE_COLOR_REPORTING, -1);
            this.A2 = this.l4.getInteger(this, SP.WEATHER_COLOR_REPORTING, -1);
            this.B2 = this.l4.getInteger(this, SP.MAGNETIC_FIELD_COLOR_REPORTING, -1);
            this.C2 = this.l4.getInteger(this, SP.COMPASS_COLOR_REPORTING, -1);
            this.D2 = this.l4.getInteger(this, SP.NOTES_HASHTAG_COLOR_REPORTING, -1);
            this.E2 = this.l4.getInteger(this, SP.WIND_COLOR_REPORTING, -1);
            this.F2 = this.l4.getInteger(this, SP.HUMIDITY_COLOR_REPORTING, -1);
            this.G2 = this.l4.getInteger(this, SP.PRESSURE_COLOR_REPORTING, -1);
            this.H2 = this.l4.getInteger(this, SP.ELEVATION_COLOR_REPORTING, -1);
            this.I2 = this.l4.getInteger(this, SP.ALTITUDE_COLOR_REPORTING, -1);
            this.J2 = this.l4.getInteger(this, SP.ACCURACY_COLOR_REPORTING, -1);
            this.P2 = this.l4.getInteger(this, SP.SOUNDLEVEL_COLOR_REPORTING, -1);
            this.K2 = this.l4.getInteger(this, SP.REPORT_COLOR_REPORTING, -1);
            this.T2 = this.l4.getInteger(this, SP.NUMBERING_COLOR_REPORTING, -1);
            this.u2 = this.l4.getInteger(this, SP.PERSON_NAME_COLOR_REPORTING, -1);
            this.v2 = this.l4.getInteger(this, SP.CONTACT_NUMBER_COLOR_REPORTING, -1);
            this.R2 = this.l4.getInteger(this, SP.TIMEZONE_REPORTING, 6);
            this.S2 = this.l4.getInteger(this, SP.SEQUENCE_REPORTING, 1);
            this.Y2 = this.l4.getString(this, SP.SUFFIX_REPORTING, "");
            this.Z2 = this.l4.getString(this, SP.PREFIX_REPORTING, "");
            this.L2 = this.l4.getString(this, SP.REPORT_TAG_REPORTING, Default.REPORT_TAG);
            this.a3 = this.l4.getString(this, VCKtvKCuFgEI.EGZpABlyZpXY, "-");
            this.b3 = this.l4.getString(this, SP.CONTACT_NUMBER_REPORTING, Default.contactNumber);
            this.h3 = this.l4.getBoolean(this, SP.IS_MAP_REPORTING, true);
            this.G3 = this.l4.getBoolean(this, SP.IS_COUNTRY_FLAG_REPORTING, true);
            this.R3 = this.l4.getInteger(this, SP.MAP_POS_TYPE_REPORTING, 0);
            this.i3 = this.l4.getBoolean(this, jumTrYZsYnyZCd.tBv, true);
            this.H3 = this.l4.getBoolean(this, SP.IS_ADDRESS_CITY_REPORTING, true);
            this.I3 = this.l4.getBoolean(this, SP.IS_ADDRESS_STATE_REPORTING, true);
            this.J3 = this.l4.getBoolean(this, SP.IS_ADDRESS_COUNTRY_REPORTING, true);
            this.K3 = this.l4.getBoolean(this, SP.IS_ADDRESS_PINCODE_REPORTING, true);
            this.j3 = this.l4.getBoolean(this, SP.IS_PLUS_CODE_REPORTING, false);
            this.k3 = this.l4.getBoolean(this, SP.IS_WEATHER_REPORTING, false);
            this.o3 = this.l4.getBoolean(this, SP.IS_DATE_TIME_REPORTING, true);
            this.p3 = this.l4.getBoolean(this, SP.IS_TIMEZONE_REPORTING, true);
            this.q3 = this.l4.getBoolean(this, SP.IS_NUMBERING_REPORTING, false);
            this.r3 = this.l4.getBoolean(this, SP.IS_INCREMENT_REPORTING, true);
            this.s3 = this.l4.getBoolean(this, SP.IS_MAGNETIC_FIELD_REPORTING, false);
            this.t3 = this.l4.getBoolean(this, SP.IS_COMPASS_REPORTING, false);
            this.v3 = this.l4.getBoolean(this, SP.IS_WIND_REPORTING, false);
            this.w3 = this.l4.getBoolean(this, SP.IS_LOGO_REPORTING, false);
            this.x3 = this.l4.getBoolean(this, SP.IS_NOTES_REPORTING, true);
            this.E3 = this.l4.getBoolean(this, SP.IS_PERSON_NAME_REPORTING, false);
            this.F3 = this.l4.getBoolean(this, SP.IS_CONTACT_NUMBER_REPORTING, false);
            this.z3 = this.l4.getBoolean(this, SP.IS_PRESSURE_REPORTING, false);
            this.y3 = this.l4.getBoolean(this, SP.IS_HUMIDITY_REPORTING, false);
            this.A3 = this.l4.getBoolean(this, SP.IS_ELEVATION_REPORTING, false);
            this.B3 = this.l4.getBoolean(this, RZmOSvivbLdu.bGgJtWweXHHkN, false);
            this.C3 = this.l4.getBoolean(this, SP.IS_ACCURACY_REPORTING, false);
            this.D3 = this.l4.getBoolean(this, SP.IS_SOUNDLEVEL_REPORTING, false);
            this.c3 = this.l4.getString(this, SP.LOGO_URI_REPORTING, Default.LOGO_uri);
            this.d3 = this.l4.getString(this, SP.NOTES_HASHTAG_REPORTING, Default.notes);
            this.e3 = this.l4.getString(this, SP.STAMP_FONT_STYLE_REPORTING, Default.DEFAULT_FONT_STYLE);
            this.u3 = this.l4.getBoolean(this, SP.COMPASS_FOUND, false);
            this.L3 = this.l4.getString(this, SP.DATE_FORMAT_REPORTING, Default.DEFAULT_DATE_FORMAT);
            this.Q3 = this.l4.getInteger(this, SP.LAT_LNG_TYPE_REPORTING, 1);
            this.M3 = this.l4.getString(this, SP.TEMPRATURE_TYPE_REPORTING, "Celsius");
            this.g3 = this.l4.getFloat(this, SP.TEMPRETURE_VALUE);
            this.m0.setImageResource(this.X3.getResourceId(this.l4.getInteger(this, SP.WEATHER_ICON, 0), 0));
            this.S3 = this.l4.getInteger(this, SP.MAP_ZOOM_SCALE_REPORTING, 78);
            this.N3 = this.l4.getString(this, SP.MAP_TYPE_TEMPLATE_REPORTING, Default.SETELLITE_2);
            this.P3 = this.l4.getInteger(this, SP.MAP_POS_REPORTING, 1);
            this.G1 = this.l4.getBoolean(this, SP.ASK_NOTE_EVERY_TIME_REPORTING, false);
            this.U3 = this.l4.getString(this, SP.STAMP_POS_REPORTING, str2);
            this.V3 = this.l4.getString(this, SP.STAMP_SIZE_REPORTING, Default.TEMPLATE_SIZE);
            this.W3 = this.l4.getString(this, SP.PLUS_CODE_TYPE_REPORTING, Default.PLUSCODE_TYPE);
            this.M2 = this.l4.getInteger(this, SP.WIND_SELECT_REPORTING, 0);
            this.N2 = this.l4.getInteger(this, SP.ALTITUDE_SELECT_REPORTING, 0);
            this.O2 = this.l4.getInteger(this, SP.ACCURACY_SELECT_REPORTING, 0);
            this.Q2 = this.l4.getInteger(this, SP.PRESSURE_SELECT_REPORTING, 0);
        } else {
            SP sp = this.l4;
            if (i3 == 3) {
                this.r2 = sp.getInteger(this, SP.BACKGROUND_COLOR_NC, color);
                this.t2 = this.l4.getInteger(this, SP.ADDRESS_COLOR_NC, -1);
                this.w2 = this.l4.getInteger(this, SP.SHORT_ADDRESS_COLOR_NC, -1);
                this.x2 = this.l4.getInteger(this, SP.DATE_TIME_COLOR_NC, -1);
                this.y2 = this.l4.getInteger(this, SP.LAT_LNG_COLOR_NC, -1);
                this.z2 = this.l4.getInteger(this, SP.PLUS_CODE_COLOR_NC, -1);
                this.A2 = this.l4.getInteger(this, SP.WEATHER_COLOR_NC, -1);
                this.B2 = this.l4.getInteger(this, SP.MAGNETIC_FIELD_COLOR_NC, -1);
                this.C2 = this.l4.getInteger(this, SP.COMPASS_COLOR_NC, -1);
                this.D2 = this.l4.getInteger(this, SP.NOTES_HASHTAG_COLOR_NC, -1);
                this.E2 = this.l4.getInteger(this, SP.WIND_COLOR_NC, -1);
                this.F2 = this.l4.getInteger(this, SP.HUMIDITY_COLOR_NC, -1);
                this.G2 = this.l4.getInteger(this, SP.PRESSURE_COLOR_NC, -1);
                this.H2 = this.l4.getInteger(this, SP.ELEVATION_COLOR_NC, -1);
                this.I2 = this.l4.getInteger(this, SP.ALTITUDE_COLOR_NC, -1);
                this.J2 = this.l4.getInteger(this, SP.ACCURACY_COLOR_NC, -1);
                this.P2 = this.l4.getInteger(this, SP.SOUNDLEVEL_COLOR_NC, -1);
                this.T2 = this.l4.getInteger(this, SP.NUMBERING_COLOR_NC, -1);
                this.U2 = this.l4.getInteger(this, idmhT.efDGD, -1);
                this.V2 = this.l4.getInteger(this, SP.AQILEVEL_COLOR_NC, -1);
                this.W2 = this.l4.getInteger(this, SP.ORLABEL_TEXT_COLOR_NC, -1);
                this.X2 = this.l4.getInteger(this, SP.ORLABEL_BG_COLOR_NC, Color.parseColor("#747474"));
                this.u2 = this.l4.getInteger(this, SP.PERSON_NAME_COLOR_NC, -1);
                this.v2 = this.l4.getInteger(this, SP.CONTACT_NUMBER_COLOR_NC, -1);
                this.R2 = this.l4.getInteger(this, SP.TIMEZONE_NC, 6);
                this.S2 = this.l4.getInteger(this, SP.SEQUENCE_NC, 1);
                this.Y2 = this.l4.getString(this, SP.SUFFIX_NC, "");
                this.Z2 = this.l4.getString(this, SP.PREFIX_NC, "");
                this.a3 = this.l4.getString(this, SP.PERSON_NAME_NC, "-");
                this.b3 = this.l4.getString(this, SP.CONTACT_NUMBER_NC, Default.contactNumber);
                this.h3 = this.l4.getBoolean(this, SP.IS_MAP_NC, true);
                this.G3 = this.l4.getBoolean(this, SP.IS_COUNTRY_FLAG_NC, true);
                this.R3 = this.l4.getInteger(this, SP.MAP_POS_TYPE_NC, 0);
                this.i3 = this.l4.getBoolean(this, SP.IS_ADDRESS_NC, true);
                this.H3 = this.l4.getBoolean(this, SP.IS_ADDRESS_CITY_NC, true);
                this.I3 = this.l4.getBoolean(this, SP.IS_ADDRESS_STATE_NC, true);
                this.J3 = this.l4.getBoolean(this, SP.IS_ADDRESS_COUNTRY_NC, true);
                this.K3 = this.l4.getBoolean(this, SP.IS_ADDRESS_PINCODE_NC, true);
                this.j3 = this.l4.getBoolean(this, SP.IS_PLUS_CODE_NC, false);
                this.l3 = this.l4.getBoolean(this, SP.IS_AQI_LEVEL_NC, false);
                this.n3 = this.l4.getBoolean(this, SP.IS_ORIENTATION_LABEL_NC, true);
                this.m3 = this.l4.getBoolean(this, SP.IS_AZIMUTH_NC, true);
                this.k3 = this.l4.getBoolean(this, SP.IS_WEATHER_NC, false);
                this.o3 = this.l4.getBoolean(this, SP.IS_DATE_TIME_NC, true);
                this.p3 = this.l4.getBoolean(this, SP.IS_TIMEZONE_NC, true);
                this.q3 = this.l4.getBoolean(this, SP.IS_NUMBERING_NC, false);
                this.r3 = this.l4.getBoolean(this, SP.IS_INCREMENT_NC, true);
                this.s3 = this.l4.getBoolean(this, SP.IS_MAGNETIC_FIELD_NC, true);
                this.t3 = this.l4.getBoolean(this, SP.IS_COMPASS_NC, true);
                this.v3 = this.l4.getBoolean(this, SP.IS_WIND_NC, false);
                this.w3 = this.l4.getBoolean(this, SP.IS_LOGO_NC, false);
                this.x3 = this.l4.getBoolean(this, SP.IS_NOTES_NC, true);
                this.E3 = this.l4.getBoolean(this, SP.IS_PERSON_NAME_NC, false);
                this.F3 = this.l4.getBoolean(this, SP.IS_CONTACT_NUMBER_NC, false);
                this.z3 = this.l4.getBoolean(this, SP.IS_PRESSURE_NC, false);
                this.y3 = this.l4.getBoolean(this, SP.IS_HUMIDITY_NC, false);
                this.A3 = this.l4.getBoolean(this, SP.IS_ELEVATION_NC, false);
                this.B3 = this.l4.getBoolean(this, SP.IS_ALTITUDE_NC, true);
                this.C3 = this.l4.getBoolean(this, SP.IS_ACCURACY_NC, false);
                this.D3 = this.l4.getBoolean(this, SP.IS_SOUNDLEVEL_NC, false);
                this.c3 = this.l4.getString(this, SP.LOGO_URI_NC, Default.LOGO_uri);
                this.d3 = this.l4.getString(this, SP.NOTES_HASHTAG_NC, Default.notes);
                this.e3 = this.l4.getString(this, SP.STAMP_FONT_STYLE_NC, Default.DEFAULT_FONT_STYLE);
                this.u3 = this.l4.getBoolean(this, SP.COMPASS_FOUND, false);
                this.L3 = this.l4.getString(this, SP.DATE_FORMAT_NC, Default.DEFAULT_DATE_FORMAT);
                this.Q3 = this.l4.getInteger(this, SP.LAT_LNG_TYPE_NC, 1);
                this.M3 = this.l4.getString(this, SP.TEMPRATURE_TYPE_NC, "Celsius");
                this.g3 = this.l4.getFloat(this, SP.TEMPRETURE_VALUE);
                this.m0.setImageResource(this.X3.getResourceId(this.l4.getInteger(this, SP.WEATHER_ICON, 0), 0));
                this.S3 = this.l4.getInteger(this, SP.MAP_ZOOM_SCALE_NC, 78);
                this.N3 = this.l4.getString(this, SP.MAP_TYPE_TEMPLATE_NC, Default.SETELLITE_2);
                this.P3 = this.l4.getInteger(this, SP.MAP_POS_NC, 1);
                this.G1 = this.l4.getBoolean(this, SP.ASK_NOTE_EVERY_TIME_NC, false);
                this.U3 = this.l4.getString(this, SP.STAMP_POS_NC, str2);
                this.V3 = this.l4.getString(this, SP.STAMP_SIZE_NC, Default.TEMPLATE_SIZE);
                this.W3 = this.l4.getString(this, SP.PLUS_CODE_TYPE_NC, Default.PLUSCODE_TYPE);
                this.M2 = this.l4.getInteger(this, SP.WIND_SELECT_NC, 0);
                this.N2 = this.l4.getInteger(this, SP.ALTITUDE_SELECT_NC, 0);
                this.O2 = this.l4.getInteger(this, SP.ACCURACY_SELECT_NC, 0);
                this.Q2 = this.l4.getInteger(this, SP.PRESSURE_SELECT_NC, 0);
                this.T.setText(HelperClass.getAqiValueText(this, this.l4.getString(this, SP.AQI_LEVEL_VALUE, "-")));
            } else if (i3 == 4) {
                this.r2 = sp.getInteger(this, SP.BACKGROUND_COLOR_DT, color);
                this.t2 = this.l4.getInteger(this, SP.ADDRESS_COLOR_DT, -1);
                this.w2 = this.l4.getInteger(this, SP.SHORT_ADDRESS_COLOR_DT, -1);
                this.x2 = this.l4.getInteger(this, SP.DATE_TIME_COLOR_DT, -1);
                this.y2 = this.l4.getInteger(this, SP.LAT_LNG_COLOR_DT, -1);
                this.A2 = this.l4.getInteger(this, SP.WEATHER_COLOR_DT, -1);
                this.C2 = this.l4.getInteger(this, SP.COMPASS_COLOR_DT, -1);
                this.D2 = this.l4.getInteger(this, SP.NOTES_HASHTAG_COLOR_DT, -1);
                this.I2 = this.l4.getInteger(this, SP.ALTITUDE_COLOR_DT, -1);
                this.u2 = this.l4.getInteger(this, SP.PERSON_NAME_COLOR_DT, -1);
                this.v2 = this.l4.getInteger(this, SP.CONTACT_NUMBER_COLOR_DT, -1);
                this.a3 = this.l4.getString(this, SP.PERSON_NAME_DT, "-");
                this.b3 = this.l4.getString(this, SP.CONTACT_NUMBER_DT, Default.contactNumber);
                this.h3 = this.l4.getBoolean(this, SP.IS_MAP_DT, false);
                this.G3 = this.l4.getBoolean(this, SP.IS_COUNTRY_FLAG_DT, true);
                this.i3 = this.l4.getBoolean(this, SP.IS_ADDRESS_DT, true);
                this.H3 = this.l4.getBoolean(this, SP.IS_ADDRESS_CITY_DT, true);
                this.I3 = this.l4.getBoolean(this, SP.IS_ADDRESS_STATE_DT, true);
                this.J3 = this.l4.getBoolean(this, SP.IS_ADDRESS_COUNTRY_DT, true);
                this.K3 = this.l4.getBoolean(this, SP.IS_ADDRESS_PINCODE_DT, true);
                this.k3 = this.l4.getBoolean(this, SP.IS_WEATHER_DT, false);
                this.o3 = this.l4.getBoolean(this, SP.IS_DATE_TIME_DT, true);
                this.t3 = this.l4.getBoolean(this, SP.IS_COMPASS_DT, false);
                this.w3 = this.l4.getBoolean(this, SP.IS_LOGO_DT, false);
                this.x3 = this.l4.getBoolean(this, SP.IS_NOTES_DT, true);
                this.E3 = this.l4.getBoolean(this, SP.IS_PERSON_NAME_DT, false);
                this.F3 = this.l4.getBoolean(this, SP.IS_CONTACT_NUMBER_DT, false);
                this.B3 = this.l4.getBoolean(this, SP.IS_ALTITUDE_DT, false);
                this.c3 = this.l4.getString(this, SP.LOGO_URI_DT, Default.LOGO_uri);
                this.d3 = this.l4.getString(this, SP.NOTES_HASHTAG_DT, Default.notes);
                this.e3 = this.l4.getString(this, SP.STAMP_FONT_STYLE_DT, Default.DEFAULT_FONT_STYLE_DT);
                this.u3 = this.l4.getBoolean(this, SP.COMPASS_FOUND, false);
                this.L3 = this.l4.getString(this, SP.DATE_FORMAT_DT, Default.DEFAULT_DATE_FORMAT_DT);
                this.O3 = this.l4.getString(this, SP.TIME_FORMAT_DT, Default.DEFAULT_TIME_FORMAT_DT);
                this.Q3 = this.l4.getInteger(this, SP.LAT_LNG_TYPE_DT, 1);
                this.M3 = this.l4.getString(this, SP.TEMPRATURE_TYPE_DT, "Celsius");
                this.g3 = this.l4.getFloat(this, SP.TEMPRETURE_VALUE);
                this.m0.setImageResource(this.X3.getResourceId(this.l4.getInteger(this, SP.WEATHER_ICON, 0), 0));
                this.S3 = this.l4.getInteger(this, SP.MAP_ZOOM_SCALE_DT, 78);
                this.N3 = this.l4.getString(this, SP.MAP_TYPE_TEMPLATE_DT, Default.SETELLITE_2);
                this.P3 = this.l4.getInteger(this, SP.MAP_POS_DT, 1);
                this.G1 = this.l4.getBoolean(this, SP.ASK_NOTE_EVERY_TIME_DT, false);
                this.U3 = this.l4.getString(this, SP.STAMP_POS_DT, str2);
                this.V3 = this.l4.getString(this, SP.STAMP_SIZE_DT, Default.TEMPLATE_SIZE);
                this.N2 = this.l4.getInteger(this, SP.ALTITUDE_SELECT_DT, 0);
            } else {
                this.r2 = sp.getInteger(this, SP.BACKGROUND_COLOR_QR, color);
                this.t2 = this.l4.getInteger(this, SP.ADDRESS_COLOR_QR, -1);
                this.w2 = this.l4.getInteger(this, SP.SHORT_ADDRESS_COLOR_QR, -1);
                this.x2 = this.l4.getInteger(this, SP.DATE_TIME_COLOR_QR, -1);
                this.y2 = this.l4.getInteger(this, SP.LAT_LNG_COLOR_QR, -1);
                this.D2 = this.l4.getInteger(this, SP.NOTES_HASHTAG_COLOR_QR, -1);
                this.h3 = this.l4.getBoolean(this, SP.IS_MAP_QR, true);
                this.G3 = this.l4.getBoolean(this, SP.IS_COUNTRY_FLAG_QR, true);
                this.i3 = this.l4.getBoolean(this, SP.IS_ADDRESS_QR, true);
                this.H3 = this.l4.getBoolean(this, SP.IS_ADDRESS_CITY_QR, true);
                this.I3 = this.l4.getBoolean(this, SP.IS_ADDRESS_STATE_QR, true);
                this.J3 = this.l4.getBoolean(this, SP.IS_ADDRESS_COUNTRY_QR, true);
                this.K3 = this.l4.getBoolean(this, SP.IS_ADDRESS_PINCODE_QR, true);
                this.o3 = this.l4.getBoolean(this, SP.IS_DATE_TIME_QR, true);
                this.x3 = this.l4.getBoolean(this, SP.IS_NOTES_QR, true);
                this.d3 = this.l4.getString(this, SP.NOTES_HASHTAG_QR, Default.notes);
                this.e3 = this.l4.getString(this, SP.STAMP_FONT_STYLE_QR, Default.DEFAULT_FONT_STYLE);
                this.L3 = this.l4.getString(this, SP.DATE_FORMAT_QR, Default.DEFAULT_DATE_FORMAT);
                this.Q3 = this.l4.getInteger(this, SP.LAT_LNG_TYPE_QR, 1);
                this.S3 = this.l4.getInteger(this, SP.MAP_ZOOM_SCALE_QR, 78);
                this.N3 = this.l4.getString(this, SP.MAP_TYPE_TEMPLATE_QR, Default.SETELLITE_2);
                this.P3 = this.l4.getInteger(this, SP.MAP_POS_QR, 1);
                this.G1 = this.l4.getBoolean(this, SP.ASK_NOTE_EVERY_TIME_QR, false);
                this.U3 = this.l4.getString(this, SP.STAMP_POS_QR, str2);
                this.V3 = this.l4.getString(this, SP.STAMP_SIZE_QR, Default.TEMPLATE_SIZE);
                this.R3 = this.l4.getInteger(this, SP.MAP_POS_TYPE_QR, 0);
            }
        }
        P0();
        U0();
        this.L.setText(J() + "%");
        Q0();
        p1();
        q1();
        this.g0.setText(k0());
        String dateTimeFormat = HelperClass.setDateTimeFormat(this, B());
        if (this.f3 == 4) {
            dateTimeFormat = HelperClass.getDateTimeDt(this, B());
        }
        this.Z.setText(dateTimeFormat);
        this.X.setText(this.T3.getLatLong(this, F()));
        l1();
        int i4 = 5;
        if (this.f3 != 5) {
            e1();
            S0();
            this.h0.setText(z());
            j1();
            k1();
            X0();
        }
        if (this.f3 != 4) {
            T0();
            if (this.f3 != 5) {
                m1();
                s1();
                o1();
                i1();
                c1();
                n1();
                W0();
                Y0();
                r1(this.R2);
            }
        }
        int i5 = this.f3;
        if (i5 == 2) {
            a1();
            b1();
        } else if (i5 == 3) {
            V0();
        } else if (i5 == 4) {
            R0();
        } else if (i5 == 5) {
            Z0();
        } else {
            d1();
        }
        boolean z = this.h3;
        ImageView imageView = this.s0;
        if (z) {
            imageView.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z2 = this.G3;
        ImageView imageView2 = this.M0;
        if (z2) {
            imageView2.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView2.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z3 = this.n3;
        ImageView imageView3 = this.N0;
        if (z3) {
            imageView3.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView3.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z4 = this.l3;
        ImageView imageView4 = this.O0;
        if (z4) {
            imageView4.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView4.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z5 = this.m3;
        ImageView imageView5 = this.P0;
        if (z5) {
            imageView5.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView5.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z6 = this.i3;
        ImageView imageView6 = this.t0;
        if (z6) {
            imageView6.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView6.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z7 = this.t3;
        ImageView imageView7 = this.D0;
        if (z7) {
            imageView7.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView7.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z8 = this.o3;
        ImageView imageView8 = this.v0;
        if (z8) {
            imageView8.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView8.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z9 = this.p3;
        ImageView imageView9 = this.w0;
        if (z9) {
            imageView9.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView9.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z10 = this.q3;
        ImageView imageView10 = this.x0;
        if (z10) {
            imageView10.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView10.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z11 = this.j3;
        ImageView imageView11 = this.u0;
        if (z11) {
            imageView11.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView11.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z12 = this.s3;
        ImageView imageView12 = this.E0;
        if (z12) {
            imageView12.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView12.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z13 = this.k3;
        ImageView imageView13 = this.C0;
        if (z13) {
            imageView13.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView13.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z14 = this.v3;
        ImageView imageView14 = this.F0;
        if (z14) {
            imageView14.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView14.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z15 = this.y3;
        ImageView imageView15 = this.G0;
        if (z15) {
            imageView15.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView15.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z16 = this.z3;
        ImageView imageView16 = this.H0;
        if (z16) {
            imageView16.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView16.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z17 = this.A3;
        ImageView imageView17 = this.I0;
        if (z17) {
            imageView17.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView17.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z18 = this.B3;
        ImageView imageView18 = this.J0;
        if (z18) {
            imageView18.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView18.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z19 = this.C3;
        ImageView imageView19 = this.K0;
        if (z19) {
            imageView19.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView19.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z20 = this.w3;
        ImageView imageView20 = this.A0;
        if (z20) {
            imageView20.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView20.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z21 = this.x3;
        ImageView imageView21 = this.B0;
        if (z21) {
            imageView21.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView21.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        if (!this.D3) {
            this.L0.setImageResource(R.drawable.ic_uncheck_box_tple);
        } else if (la9.a(this, "android.permission.RECORD_AUDIO") == 0) {
            this.L0.setImageResource(R.drawable.ic_select_btn);
        } else {
            this.D3 = false;
            this.l4.setBoolean(this, "soundlevel", false);
        }
        boolean z22 = this.E3;
        ImageView imageView22 = this.y0;
        if (z22) {
            imageView22.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView22.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        boolean z23 = this.F3;
        ImageView imageView23 = this.z0;
        if (z23) {
            imageView23.setImageResource(R.drawable.ic_select_btn);
        } else {
            imageView23.setImageResource(R.drawable.ic_uncheck_box_tple);
        }
        k64 k64Var = new k64();
        this.Y3 = k64Var;
        k64Var.B0 = new ad3(23, this);
        lc1 lc1Var = new lc1();
        this.b4 = lc1Var;
        lc1Var.H0 = new sq6(this, 0);
        ot6 ot6Var = new ot6();
        this.c4 = ot6Var;
        ot6Var.J0 = new sq6(this, 1);
        dr5 dr5Var = new dr5();
        this.Z3 = dr5Var;
        dr5Var.u0 = new sq6(this, 2);
        iv4 iv4Var = new iv4();
        this.d4 = iv4Var;
        iv4Var.v0 = new sq6(this, 3);
        l24 l24Var = new l24();
        this.a4 = l24Var;
        l24Var.u0 = new sq6(this, 4);
        c31 c31Var = new c31();
        this.e4 = c31Var;
        c31Var.z0 = new sq6(this, i4);
    }

    public final void n1() {
        this.J.setText(this.l4.getString(this, SP.MAGNETIC_FIELD_VALUE, "-"));
        this.j0.setText(this.l4.getString(this, SP.MAGNETIC_FIELD_VALUE, "-"));
    }

    public final void o0() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new j64(19, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void o1() {
        int iL0 = l0();
        this.E.setText(HelperClass.getpressureConvert(this, iL0));
        if (O0()) {
            this.d0.setText(HelperClass.getpressureConvert(this, iL0));
            this.o0.setImageResource(R.drawable.ic_pressure);
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 69) {
            this.a4.z(i, i2, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        l24 l24Var;
        ot6 ot6Var;
        lc1 lc1Var;
        dr5 dr5Var;
        c31 c31Var;
        int i = 1;
        if (view.getId() == R.id.img_country_flag) {
            boolean zZ0 = z0();
            SP sp = this.l4;
            if (zZ0) {
                sp.setBoolean(this, "is_country_flag_temp", false);
                this.M0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp.setBoolean(this, "is_country_flag_temp", true);
                this.M0.setImageResource(R.drawable.ic_select_btn);
            }
            int i2 = this.f3;
            if (i2 == 2) {
                b1();
                return;
            }
            if (i2 == 3) {
                V0();
                return;
            }
            if (i2 == 4) {
                R0();
                return;
            } else if (i2 == 5) {
                Z0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_maptype) {
            if (this.f3 == 2) {
                this.l4.setBoolean(this, "Map", true);
                this.s0.setImageResource(R.drawable.ic_select_btn);
                int i3 = this.f3;
                if (i3 == 2) {
                    b1();
                    return;
                }
                if (i3 == 3) {
                    V0();
                    return;
                }
                if (i3 == 4) {
                    R0();
                    return;
                } else if (i3 == 5) {
                    Z0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            boolean zE0 = E0();
            SP sp2 = this.l4;
            if (zE0) {
                sp2.setBoolean(this, "Map", false);
                this.s0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp2.setBoolean(this, "Map", true);
                this.s0.setImageResource(R.drawable.ic_select_btn);
            }
            int i4 = this.f3;
            if (i4 == 2) {
                b1();
                return;
            }
            if (i4 == 3) {
                V0();
                return;
            }
            if (i4 == 4) {
                R0();
                return;
            } else if (i4 == 5) {
                Z0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.lin_address) {
            if (this.Y3.u()) {
                return;
            }
            this.Y3.X(r41.i(17, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_personName) {
            if (this.Y3.u()) {
                return;
            }
            this.Y3.X(r41.i(16, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_contactNumber) {
            if (this.e4.u() || (c31Var = this.e4) == null) {
                return;
            }
            c31Var.d0(o(), "ContactNumber_bottom_sheetfragment");
            return;
        }
        if (view.getId() == R.id.img_personName) {
            if (H0()) {
                this.l4.setBoolean(this, "is_Person_Name", false);
                this.y0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else if (O().equals("-") || O().isEmpty()) {
                Toast.makeText(this, R.string.add_person_name_first, 0).show();
            } else {
                this.l4.setBoolean(this, "is_Person_Name", true);
                this.y0.setImageResource(R.drawable.ic_select_btn);
            }
            int i5 = this.f3;
            if (i5 == 2) {
                b1();
                return;
            }
            if (i5 == 3) {
                V0();
                return;
            } else if (i5 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_contactNumber) {
            if (y0()) {
                this.l4.setBoolean(this, "is_Contact_Number", false);
                this.z0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else if (z().equals(Default.contactNumber)) {
                Toast.makeText(this, R.string.add_contact_number_first, 0).show();
            } else {
                this.l4.setBoolean(this, "is_Contact_Number", true);
                this.z0.setImageResource(R.drawable.ic_select_btn);
            }
            int i6 = this.f3;
            if (i6 == 2) {
                b1();
                return;
            }
            if (i6 == 3) {
                V0();
                return;
            } else if (i6 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_address) {
            boolean zV0 = v0();
            SP sp3 = this.l4;
            if (zV0) {
                sp3.setBoolean(this, "Address", false);
                this.t0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp3.setBoolean(this, "Address", true);
                this.t0.setImageResource(R.drawable.ic_select_btn);
            }
            int i7 = this.f3;
            if (i7 == 2) {
                b1();
                return;
            }
            if (i7 == 3) {
                V0();
                return;
            }
            if (i7 == 4) {
                R0();
                return;
            } else if (i7 == 5) {
                Z0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_pluscode) {
            boolean zI0 = I0();
            SP sp4 = this.l4;
            if (zI0) {
                sp4.setBoolean(this, Default.PLUSCODE, false);
                this.u0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp4.setBoolean(this, Default.PLUSCODE, true);
                this.u0.setImageResource(R.drawable.ic_select_btn);
            }
            int i8 = this.f3;
            if (i8 == 2) {
                b1();
                return;
            }
            if (i8 == 3) {
                V0();
                return;
            } else if (i8 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_datetime) {
            boolean zA0 = A0();
            SP sp5 = this.l4;
            if (zA0) {
                sp5.setBoolean(this, "date_and_time", false);
                this.v0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp5.setBoolean(this, "date_and_time", true);
                this.v0.setImageResource(R.drawable.ic_select_btn);
            }
            int i9 = this.f3;
            if (i9 == 2) {
                b1();
                return;
            }
            if (i9 == 3) {
                V0();
                return;
            }
            if (i9 == 4) {
                R0();
                return;
            } else if (i9 == 5) {
                Z0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_timezone) {
            boolean zK0 = K0();
            SP sp6 = this.l4;
            if (zK0) {
                sp6.setBoolean(this, Default.TIMEZONE, false);
                this.w0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp6.setBoolean(this, Default.TIMEZONE, true);
                this.w0.setImageResource(R.drawable.ic_select_btn);
            }
            int i10 = this.f3;
            if (i10 == 2) {
                b1();
                return;
            }
            if (i10 == 3) {
                V0();
                return;
            }
            if (i10 == 4) {
                R0();
                return;
            } else if (i10 == 5) {
                Z0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_numbering) {
            boolean zG0 = G0();
            SP sp7 = this.l4;
            if (zG0) {
                sp7.setBoolean(this, "isnumbering", false);
                this.x0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp7.setBoolean(this, "isnumbering", true);
                this.x0.setImageResource(R.drawable.ic_select_btn);
            }
            int i11 = this.f3;
            if (i11 == 2) {
                b1();
                return;
            }
            if (i11 == 3) {
                V0();
                return;
            } else if (i11 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_logo) {
            boolean zC0 = C0();
            SP sp8 = this.l4;
            if (zC0) {
                sp8.setBoolean(this, "logo", false);
                this.A0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp8.setBoolean(this, "logo", true);
                this.A0.setImageResource(R.drawable.ic_select_btn);
            }
            int i12 = this.f3;
            if (i12 == 2) {
                b1();
                return;
            }
            if (i12 == 3) {
                V0();
                return;
            } else if (i12 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_notes) {
            boolean zF0 = F0();
            SP sp9 = this.l4;
            if (zF0) {
                sp9.setBoolean(this, "notes_hastag", false);
                this.B0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp9.setBoolean(this, "notes_hastag", true);
                this.B0.setImageResource(R.drawable.ic_select_btn);
            }
            int i13 = this.f3;
            if (i13 == 2) {
                b1();
                return;
            }
            if (i13 == 3) {
                V0();
                return;
            }
            if (i13 == 4) {
                R0();
                return;
            } else if (i13 == 5) {
                Z0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_wether) {
            boolean zL0 = L0();
            SP sp10 = this.l4;
            if (zL0) {
                sp10.setBoolean(this, "Weather", false);
                this.C0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp10.setBoolean(this, "Weather", true);
                this.C0.setImageResource(R.drawable.ic_select_btn);
            }
            int i14 = this.f3;
            if (i14 == 2) {
                b1();
                return;
            }
            if (i14 == 3) {
                V0();
                return;
            } else if (i14 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_compass) {
            boolean zX0 = x0();
            SP sp11 = this.l4;
            if (zX0) {
                sp11.setBoolean(this, "Compass", false);
                this.D0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp11.setBoolean(this, "Compass", true);
                this.D0.setImageResource(R.drawable.ic_select_btn);
            }
            int i15 = this.f3;
            if (i15 == 2) {
                b1();
                return;
            }
            if (i15 == 3) {
                V0();
                return;
            } else if (i15 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_magnetic) {
            boolean zD0 = D0();
            SP sp12 = this.l4;
            if (zD0) {
                sp12.setBoolean(this, "Magnetic Field", false);
                this.E0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp12.setBoolean(this, "Magnetic Field", true);
                this.E0.setImageResource(R.drawable.ic_select_btn);
            }
            int i16 = this.f3;
            if (i16 == 2) {
                b1();
                return;
            }
            if (i16 == 3) {
                V0();
                return;
            } else if (i16 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_wind) {
            if (M0()) {
                this.l4.setBoolean(this, "wind", false);
                this.F0.setImageResource(R.drawable.ic_uncheck_box_tple);
                s1();
                int i17 = this.f3;
                if (i17 == 2) {
                    b1();
                    return;
                }
                if (i17 == 3) {
                    V0();
                    return;
                } else if (i17 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (s() >= 3) {
                cc6.i(view, getString(R.string.space_in_stamp), 0).k();
                return;
            }
            this.l4.setBoolean(this, "wind", true);
            this.F0.setImageResource(R.drawable.ic_select_btn);
            s1();
            int i18 = this.f3;
            if (i18 == 2) {
                b1();
                return;
            }
            if (i18 == 3) {
                V0();
                return;
            } else if (i18 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_humidity) {
            if (B0()) {
                this.l4.setBoolean(this, "humidity", false);
                this.G0.setImageResource(R.drawable.ic_uncheck_box_tple);
                m1();
                int i19 = this.f3;
                if (i19 == 2) {
                    b1();
                    return;
                }
                if (i19 == 3) {
                    V0();
                    return;
                } else if (i19 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (s() >= 3) {
                cc6.i(view, getString(R.string.space_in_stamp), 0).k();
                return;
            }
            this.l4.setBoolean(this, "humidity", true);
            this.G0.setImageResource(R.drawable.ic_select_btn);
            m1();
            int i20 = this.f3;
            if (i20 == 2) {
                b1();
                return;
            }
            if (i20 == 3) {
                V0();
                return;
            } else if (i20 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_pressure) {
            if (O0()) {
                this.l4.setBoolean(this, "pressure", false);
                this.H0.setImageResource(R.drawable.ic_uncheck_box_tple);
                o1();
                int i21 = this.f3;
                if (i21 == 2) {
                    b1();
                    return;
                }
                if (i21 == 3) {
                    V0();
                    return;
                } else if (i21 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (s() >= 3) {
                cc6.i(view, getString(R.string.space_in_stamp), 0).k();
                return;
            }
            this.l4.setBoolean(this, "pressure", true);
            this.H0.setImageResource(R.drawable.ic_select_btn);
            o1();
            int i22 = this.f3;
            if (i22 == 2) {
                b1();
                return;
            }
            if (i22 == 3) {
                V0();
                return;
            } else if (i22 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_elevation) {
            boolean zN0 = N0();
            SP sp13 = this.l4;
            if (zN0) {
                sp13.setBoolean(this, "elevation", false);
                this.I0.setImageResource(R.drawable.ic_uncheck_box_tple);
            } else {
                sp13.setBoolean(this, "elevation", true);
                this.I0.setImageResource(R.drawable.ic_select_btn);
            }
            int i23 = this.f3;
            if (i23 == 2) {
                b1();
                return;
            }
            if (i23 == 3) {
                V0();
                return;
            } else if (i23 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_altitude) {
            if (w0()) {
                this.l4.setBoolean(this, "altitude", false);
                this.J0.setImageResource(R.drawable.ic_uncheck_box_tple);
                int i24 = this.f3;
                if (i24 == 2) {
                    b1();
                    return;
                }
                if (i24 == 3) {
                    V0();
                    return;
                } else if (i24 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (this.f3 == 4) {
                this.l4.setBoolean(this, "altitude", true);
                this.J0.setImageResource(R.drawable.ic_select_btn);
                int i25 = this.f3;
                if (i25 == 2) {
                    b1();
                    return;
                }
                if (i25 == 3) {
                    V0();
                    return;
                } else if (i25 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (s() >= 3) {
                cc6.i(view, getString(R.string.space_in_stamp), 0).k();
                return;
            }
            this.l4.setBoolean(this, "altitude", true);
            this.J0.setImageResource(R.drawable.ic_select_btn);
            int i26 = this.f3;
            if (i26 == 2) {
                b1();
                return;
            }
            if (i26 == 3) {
                V0();
                return;
            } else if (i26 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_accuracy) {
            if (q0()) {
                this.l4.setBoolean(this, "accuracy", false);
                this.K0.setImageResource(R.drawable.ic_uncheck_box_tple);
                int i27 = this.f3;
                if (i27 == 2) {
                    b1();
                    return;
                }
                if (i27 == 3) {
                    V0();
                    return;
                } else if (i27 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (s() >= 3) {
                cc6.i(view, getString(R.string.space_in_stamp), 0).k();
                return;
            }
            this.l4.setBoolean(this, "accuracy", true);
            this.K0.setImageResource(R.drawable.ic_select_btn);
            int i28 = this.f3;
            if (i28 == 2) {
                b1();
                return;
            }
            if (i28 == 3) {
                V0();
                return;
            } else if (i28 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_sound_level) {
            if (la9.a(this, "android.permission.RECORD_AUDIO") != 0) {
                Dexter.withContext(this).withPermissions("android.permission.RECORD_AUDIO").withListener(new ef0(this, i)).check();
                return;
            }
            if (J0()) {
                this.l4.setBoolean(this, "soundlevel", false);
                this.L0.setImageResource(R.drawable.ic_uncheck_box_tple);
                int i29 = this.f3;
                if (i29 == 2) {
                    b1();
                    return;
                }
                if (i29 == 3) {
                    V0();
                    return;
                } else if (i29 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (s() >= 3) {
                cc6.i(view, getString(R.string.space_in_stamp), 0).k();
                return;
            }
            this.l4.setBoolean(this, "soundlevel", true);
            this.L0.setImageResource(R.drawable.ic_select_btn);
            int i30 = this.f3;
            if (i30 == 2) {
                b1();
                return;
            }
            if (i30 == 3) {
                V0();
                return;
            } else if (i30 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_orientation_label) {
            boolean z = this.l4.getBoolean(this, "orientationlabel", true);
            SP sp14 = this.l4;
            if (z) {
                sp14.setBoolean(this, "orientationlabel", false);
                this.N0.setImageResource(R.drawable.ic_uncheck_box_tple);
                int i31 = this.f3;
                if (i31 == 2) {
                    b1();
                    return;
                }
                if (i31 == 3) {
                    V0();
                    return;
                } else if (i31 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            sp14.setBoolean(this, "orientationlabel", true);
            this.N0.setImageResource(R.drawable.ic_select_btn);
            int i32 = this.f3;
            if (i32 == 2) {
                b1();
                return;
            }
            if (i32 == 3) {
                V0();
                return;
            } else if (i32 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_aqi_level) {
            boolean z2 = this.l4.getBoolean(this, "aqiLevelTemp", false);
            SP sp15 = this.l4;
            if (z2) {
                sp15.setBoolean(this, "aqiLevelTemp", false);
                this.O0.setImageResource(R.drawable.ic_uncheck_box_tple);
                int i33 = this.f3;
                if (i33 == 2) {
                    b1();
                    return;
                }
                if (i33 == 3) {
                    V0();
                    return;
                } else if (i33 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            sp15.setBoolean(this, "aqiLevelTemp", true);
            this.O0.setImageResource(R.drawable.ic_select_btn);
            int i34 = this.f3;
            if (i34 == 2) {
                b1();
                return;
            }
            if (i34 == 3) {
                V0();
                return;
            } else if (i34 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.img_azimuth) {
            boolean z3 = this.l4.getBoolean(this, "azimuthTemp", true);
            SP sp16 = this.l4;
            if (z3) {
                sp16.setBoolean(this, "azimuthTemp", false);
                this.P0.setImageResource(R.drawable.ic_uncheck_box_tple);
                int i35 = this.f3;
                if (i35 == 2) {
                    b1();
                    return;
                }
                if (i35 == 3) {
                    V0();
                    return;
                } else if (i35 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            sp16.setBoolean(this, "azimuthTemp", true);
            this.P0.setImageResource(R.drawable.ic_select_btn);
            int i36 = this.f3;
            if (i36 == 2) {
                b1();
                return;
            }
            if (i36 == 3) {
                V0();
                return;
            } else if (i36 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.lin_sound_level) {
            if (la9.a(this, "android.permission.RECORD_AUDIO") != 0) {
                Dexter.withContext(this).withPermissions("android.permission.RECORD_AUDIO").withListener(new ef0(this, i)).check();
                return;
            }
            if (J0()) {
                this.l4.setBoolean(this, "soundlevel", false);
                this.L0.setImageResource(R.drawable.ic_uncheck_box_tple);
                int i37 = this.f3;
                if (i37 == 2) {
                    b1();
                    return;
                }
                if (i37 == 3) {
                    V0();
                    return;
                } else if (i37 == 4) {
                    R0();
                    return;
                } else {
                    d1();
                    return;
                }
            }
            if (s() >= 3) {
                cc6.i(view, getString(R.string.space_in_stamp), 0).k();
                return;
            }
            this.l4.setBoolean(this, "soundlevel", true);
            this.L0.setImageResource(R.drawable.ic_select_btn);
            int i38 = this.f3;
            if (i38 == 2) {
                b1();
                return;
            }
            if (i38 == 3) {
                V0();
                return;
            } else if (i38 == 4) {
                R0();
                return;
            } else {
                d1();
                return;
            }
        }
        if (view.getId() == R.id.lin_map) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(1, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_mapposition) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(12, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_mapscale) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(13, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_latlog) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(2, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_reporting) {
            if (this.Z3.u() || (dr5Var = this.Z3) == null) {
                return;
            }
            dr5Var.d0(o(), "ReportTag BottomSheet");
            return;
        }
        if (view.getId() == R.id.lin_datetime) {
            if (this.b4.u() || (lc1Var = this.b4) == null) {
                return;
            }
            lc1Var.d0(o(), "DateTime_BottomSheet");
            return;
        }
        if (view.getId() == R.id.lin_timezone) {
            if (this.c4.u() || (ot6Var = this.c4) == null) {
                return;
            }
            ot6Var.d0(o(), "TimeZone_BottomSheet");
            return;
        }
        if (view.getId() == R.id.lin_numbering) {
            if (this.d4.u() || this.d4 == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("type", this.f3);
            this.d4.X(bundle);
            this.d4.d0(o(), "Numbering_BottomSheet");
            return;
        }
        if (view.getId() == R.id.lin_wether) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(3, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_stampposition) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(4, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_stampsize) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(10, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_pluscode) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(11, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_logo) {
            if (this.a4.u() || (l24Var = this.a4) == null) {
                return;
            }
            l24Var.d0(o(), "Logo_BottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_notes) {
            this.y4.a(new Intent(this, (Class<?>) NoteActivity.class), null);
            return;
        }
        if (view.getId() == R.id.lin_wind) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(5, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_pressure) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(6, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_altitude) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(7, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_accuracy) {
            if (this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(8, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
            return;
        }
        if (view.getId() == R.id.lin_stampcolor) {
            startActivity(new Intent(this, (Class<?>) StampColorActivity.class));
        } else {
            if (view.getId() != R.id.lin_fontstyle || this.Y3.u() || this.Y3 == null) {
                return;
            }
            this.Y3.X(r41.i(9, "type"));
            this.Y3.d0(o(), "MapTypeBottomSheetfragment");
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        HelperClass helperClass = new HelperClass();
        this.T3 = helperClass;
        helperClass.SetLanguage(this);
        SP sp = new SP(this);
        this.l4 = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 0;
        if (string.equals(Default.DARK)) {
            E4 = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            E4 = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            E4 = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_templet_setting);
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("temp_type", 0);
            this.f3 = intExtra;
            if (intExtra == 3) {
                kx0 kx0Var = this.z4;
                if (kx0Var == null) {
                    kx0Var = new kx0(this);
                    this.z4 = kx0Var;
                    kx0Var.a = new lf3(21, this);
                }
                if (!kx0Var.a()) {
                    ImageView imageView = (ImageView) findViewById(R.id.img_compassNC);
                    ImageView imageView2 = (ImageView) findViewById(R.id.img_compassNC_right);
                    ImageView imageView3 = (ImageView) findViewById(R.id.img_hands);
                    ImageView imageView4 = (ImageView) findViewById(R.id.img_hands_right);
                    if (imageView != null && imageView.getVisibility() == 0) {
                        imageView.setVisibility(8);
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        if (imageView4 != null) {
                            imageView4.setVisibility(8);
                        }
                    }
                }
                this.z4.b();
            }
        }
        View viewFindViewById = findViewById(R.id.mainlay);
        sq6 sq6Var = new sq6(this, 6);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, sq6Var);
        this.f4 = getResources().getStringArray(R.array.datetime_format_arry);
        this.g4 = new gc1(this);
        PreferenceManager.getDefaultSharedPreferences(this);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            this.f3 = intent2.getIntExtra("temp_type", 0);
        }
        this.j4 = (TextView) findViewById(R.id.tv_toolbar_title);
        this.k4 = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.X3 = getResources().obtainTypedArray(R.array.wI);
        this.m4 = (LinearLayout) findViewById(R.id.relStampLay);
        this.n4 = (LinearLayout) findViewById(R.id.relStampLay_report);
        this.o4 = (LinearLayout) findViewById(R.id.relStampLay_nc);
        this.p4 = (LinearLayout) findViewById(R.id.relStampLay_dt);
        this.q4 = (LinearLayout) findViewById(R.id.relStampLay_qr);
        this.p1 = (LinearLayout) findViewById(R.id.lin_address);
        this.u4 = (TextView) findViewById(R.id.tvMapPosTitle);
        this.B = (TextView) findViewById(R.id.tv_address_line_1);
        this.t4 = (TextView) findViewById(R.id.txt_country_flag);
        this.D = (TextView) findViewById(R.id.tv_weather);
        this.E = (TextView) findViewById(R.id.tv_pressure);
        this.d0 = (TextView) findViewById(R.id.txt_pressure);
        this.G = (TextView) findViewById(R.id.tv_wind);
        this.H = (TextView) findViewById(R.id.tv_compass);
        this.J = (TextView) findViewById(R.id.tv_magnetic_field);
        this.K = (TextView) findViewById(R.id.txt_mapposition);
        this.L = (TextView) findViewById(R.id.txt_mapscale);
        this.N = (TextView) findViewById(R.id.txt_wether);
        this.O = (TextView) findViewById(R.id.txt_fontstyle);
        this.P = (TextView) findViewById(R.id.txt_altitude);
        this.Q = (TextView) findViewById(R.id.txt_accuracy);
        this.R = (TextView) findViewById(R.id.txt_soundlevel);
        this.S = (TextView) findViewById(R.id.txt_orientation_label);
        this.T = (TextView) findViewById(R.id.txt_aqi_level);
        this.U = (TextView) findViewById(R.id.txt_azimuth);
        this.V = (TextView) findViewById(R.id.txt_reporting);
        this.e0 = (TextView) findViewById(R.id.txt_stampposition);
        this.f0 = (TextView) findViewById(R.id.txt_stampsize);
        this.g0 = (TextView) findViewById(R.id.txt_notes);
        this.h0 = (TextView) findViewById(R.id.txt_contactNumber);
        this.i0 = (TextView) findViewById(R.id.txt_compass);
        this.j0 = (TextView) findViewById(R.id.txt_magnetic);
        this.X = (TextView) findViewById(R.id.txt_latlog);
        this.Y = (TextView) findViewById(R.id.txt_pluscode);
        this.W = (TextView) findViewById(R.id.txt_humidity);
        this.F = (TextView) findViewById(R.id.tv_humidity);
        this.Z = (TextView) findViewById(R.id.txt_datetime);
        this.a0 = (TextView) findViewById(R.id.txt_timezone);
        this.b0 = (TextView) findViewById(R.id.txt_numbering);
        this.c0 = (TextView) findViewById(R.id.txt_personName);
        this.R0 = (ImageView) findViewById(R.id.imgMap);
        this.T0 = (ImageView) findViewById(R.id.imgMap_right);
        this.Q0 = (ImageView) findViewById(R.id.imageview_logo);
        this.S0 = (ImageView) findViewById(R.id.imgLogo);
        this.f1 = (LinearLayout) findViewById(R.id.li_stamp);
        this.j1 = (LinearLayout) findViewById(R.id.lin_waterma);
        this.k1 = (LinearLayout) findViewById(R.id.lin_waterma_2);
        this.l1 = (LinearLayout) findViewById(R.id.lin_pressure_stamp);
        this.i1 = (LinearLayout) findViewById(R.id.lin_pressure);
        this.m1 = (LinearLayout) findViewById(R.id.lin_wind_stamp);
        this.n1 = (LinearLayout) findViewById(R.id.lin_humidity_stamp);
        this.o1 = (LinearLayout) findViewById(R.id.lin_bottom_wather);
        this.Y0 = (LinearLayout) findViewById(R.id.li_compass);
        this.W0 = (LinearLayout) findViewById(R.id.lin_wind);
        this.X0 = (LinearLayout) findViewById(R.id.lin_humidity);
        this.Z0 = (LinearLayout) findViewById(R.id.li_logo);
        this.C = (TextView) findViewById(R.id.txt_wind);
        this.k0 = (ImageView) findViewById(R.id.imgCompass);
        this.m0 = (ImageView) findViewById(R.id.imgWeather);
        this.o0 = (ImageView) findViewById(R.id.img_pressure_stamp);
        this.p0 = (ImageView) findViewById(R.id.imgMagneticField);
        this.q0 = (ImageView) findViewById(R.id.img_wind_stamp);
        this.r0 = (ImageView) findViewById(R.id.img_humidity_stamp);
        this.a1 = (LinearLayout) findViewById(R.id.li_rightView);
        this.b1 = (LinearLayout) findViewById(R.id.li_magnetic_field);
        this.c1 = (LinearLayout) findViewById(R.id.li_weather);
        this.d1 = (LinearLayout) findViewById(R.id.li_main_stamp_lay);
        this.e1 = (LinearLayout) findViewById(R.id.li_address);
        this.H1 = (LinearLayout) findViewById(R.id.lin_map);
        this.i2 = (LinearLayout) findViewById(R.id.lin_country_flag);
        this.M0 = (ImageView) findViewById(R.id.img_country_flag);
        this.N0 = (ImageView) findViewById(R.id.img_orientation_label);
        this.O0 = (ImageView) findViewById(R.id.img_aqi_level);
        this.P0 = (ImageView) findViewById(R.id.img_azimuth);
        this.M1 = (LinearLayout) findViewById(R.id.lin_latlog);
        this.N1 = (LinearLayout) findViewById(R.id.lin_pluscode);
        this.L1 = (LinearLayout) findViewById(R.id.lin_fontstyle);
        this.I1 = (LinearLayout) findViewById(R.id.lin_mapposition);
        this.J1 = (LinearLayout) findViewById(R.id.lin_mapscale);
        this.K1 = (LinearLayout) findViewById(R.id.lin_stampcolor);
        this.O1 = (LinearLayout) findViewById(R.id.lin_datetime);
        this.P1 = (LinearLayout) findViewById(R.id.lin_timezone);
        this.Q1 = (LinearLayout) findViewById(R.id.lin_numbering);
        this.R1 = (LinearLayout) findViewById(R.id.lin_personName);
        this.S1 = (LinearLayout) findViewById(R.id.lin_contactNumber);
        this.b2 = (LinearLayout) findViewById(R.id.lin_wether);
        this.a2 = (LinearLayout) findViewById(R.id.lin_altitude);
        this.T1 = (LinearLayout) findViewById(R.id.lin_accuracy);
        this.V1 = (LinearLayout) findViewById(R.id.lin_sound_level);
        this.W1 = (LinearLayout) findViewById(R.id.lin_orientation_label);
        this.X1 = (LinearLayout) findViewById(R.id.lin_aqi_level);
        this.Y1 = (LinearLayout) findViewById(R.id.lin_azimuth);
        this.Z1 = (LinearLayout) findViewById(R.id.lin_qrCode);
        this.U1 = (LinearLayout) findViewById(R.id.lin_reporting);
        this.c2 = (LinearLayout) findViewById(R.id.lin_stampposition);
        this.d2 = (LinearLayout) findViewById(R.id.lin_stampsize);
        this.e2 = (LinearLayout) findViewById(R.id.lin_logo);
        this.f2 = (LinearLayout) findViewById(R.id.lin_notes);
        this.h2 = (LinearLayout) findViewById(R.id.lin_magnetic);
        this.g2 = (LinearLayout) findViewById(R.id.lin_compass);
        int i3 = this.f3;
        if (i3 == 3) {
            this.u4.setText(getString(R.string.compass_pos));
        } else if (i3 == 4) {
            this.I1.setVisibility(8);
        }
        int i4 = this.f3;
        LinearLayout linearLayout = this.Z1;
        if (i4 == 5) {
            linearLayout.setVisibility(0);
            this.N1.setVisibility(8);
            this.P1.setVisibility(8);
            this.Q1.setVisibility(8);
            this.e2.setVisibility(8);
            this.R1.setVisibility(8);
            this.S1.setVisibility(8);
            this.b2.setVisibility(8);
            this.g2.setVisibility(8);
            this.h2.setVisibility(8);
            this.W0.setVisibility(8);
            this.X0.setVisibility(8);
            this.i1.setVisibility(8);
            this.a2.setVisibility(8);
            this.T1.setVisibility(8);
            this.V1.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
        }
        this.j2 = (ImageView) findViewById(R.id.img_stamp);
        this.k2 = (ImageView) findViewById(R.id.img_stamp_2);
        this.l2 = (TextView) findViewById(R.id.txt_watermark);
        this.m2 = (TextView) findViewById(R.id.txt_watermark_2);
        this.s0 = (ImageView) findViewById(R.id.img_maptype);
        this.t0 = (ImageView) findViewById(R.id.img_address);
        this.u0 = (ImageView) findViewById(R.id.img_pluscode);
        this.M = (TextView) findViewById(R.id.txt_maptype);
        this.v0 = (ImageView) findViewById(R.id.img_datetime);
        this.w0 = (ImageView) findViewById(R.id.img_timezone);
        this.x0 = (ImageView) findViewById(R.id.img_numbering);
        this.y0 = (ImageView) findViewById(R.id.img_personName);
        this.z0 = (ImageView) findViewById(R.id.img_contactNumber);
        this.A0 = (ImageView) findViewById(R.id.img_logo);
        this.B0 = (ImageView) findViewById(R.id.img_notes);
        this.C0 = (ImageView) findViewById(R.id.img_wether);
        this.D0 = (ImageView) findViewById(R.id.img_compass);
        this.E0 = (ImageView) findViewById(R.id.img_magnetic);
        this.F0 = (ImageView) findViewById(R.id.img_wind);
        this.G0 = (ImageView) findViewById(R.id.img_humidity);
        this.H0 = (ImageView) findViewById(R.id.img_pressure);
        this.I0 = (ImageView) findViewById(R.id.img_elevation);
        this.J0 = (ImageView) findViewById(R.id.img_altitude);
        this.K0 = (ImageView) findViewById(R.id.img_accuracy);
        this.L0 = (ImageView) findViewById(R.id.img_sound_level);
        int i5 = this.f3;
        if (i5 == 0 || i5 == 1) {
            this.U1.setVisibility(8);
            this.m4.setVisibility(0);
            this.n4.setVisibility(8);
            this.o4.setVisibility(8);
            this.p4.setVisibility(8);
            this.q4.setVisibility(8);
            this.B = (TextView) findViewById(R.id.tv_address_line_1);
            this.D = (TextView) findViewById(R.id.tv_weather);
            this.d0 = (TextView) findViewById(R.id.txt_pressure);
            this.H = (TextView) findViewById(R.id.tv_compass);
            this.J = (TextView) findViewById(R.id.tv_magnetic_field);
            this.W = (TextView) findViewById(R.id.txt_humidity);
            this.U0 = (ShapeableImageView) findViewById(R.id.imgMap);
            this.V0 = (ShapeableImageView) findViewById(R.id.imgMap_right);
            this.S0 = (ImageView) findViewById(R.id.imgLogo);
            this.f1 = (LinearLayout) findViewById(R.id.li_stamp);
            this.j1 = (LinearLayout) findViewById(R.id.lin_waterma);
            this.k1 = (LinearLayout) findViewById(R.id.lin_waterma_2);
            this.l1 = (LinearLayout) findViewById(R.id.lin_pressure_stamp);
            this.m1 = (LinearLayout) findViewById(R.id.lin_wind_stamp);
            this.n1 = (LinearLayout) findViewById(R.id.lin_humidity_stamp);
            this.o1 = (LinearLayout) findViewById(R.id.lin_bottom_wather);
            this.Y0 = (LinearLayout) findViewById(R.id.li_compass);
            this.Z0 = (LinearLayout) findViewById(R.id.li_logo);
            this.C = (TextView) findViewById(R.id.txt_wind);
            this.k0 = (ImageView) findViewById(R.id.imgCompass);
            this.m0 = (ImageView) findViewById(R.id.imgWeather);
            this.o0 = (ImageView) findViewById(R.id.img_pressure_stamp);
            this.p0 = (ImageView) findViewById(R.id.imgMagneticField);
            this.q0 = (ImageView) findViewById(R.id.img_wind_stamp);
            this.r0 = (ImageView) findViewById(R.id.img_humidity_stamp);
            this.a1 = (LinearLayout) findViewById(R.id.li_rightView);
            this.b1 = (LinearLayout) findViewById(R.id.li_magnetic_field);
            this.c1 = (LinearLayout) findViewById(R.id.li_weather);
            this.d1 = (LinearLayout) findViewById(R.id.li_main_stamp_lay);
            this.e1 = (LinearLayout) findViewById(R.id.li_address);
            this.j2 = (ImageView) findViewById(R.id.img_stamp);
            this.k2 = (ImageView) findViewById(R.id.img_stamp_2);
            this.l2 = (TextView) findViewById(R.id.txt_watermark);
            this.m2 = (TextView) findViewById(R.id.txt_watermark_2);
            this.d1.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = this.U1;
            if (i5 == 3) {
                linearLayout2.setVisibility(8);
                this.m4.setVisibility(8);
                this.n4.setVisibility(8);
                this.p4.setVisibility(8);
                this.q4.setVisibility(8);
                this.o4.setVisibility(0);
                this.X1.setVisibility(0);
                this.Y1.setVisibility(0);
                this.W1.setVisibility(0);
                this.k0 = (ImageView) findViewById(R.id.img_compassNC);
                this.l0 = (ImageView) findViewById(R.id.img_compassNC_right);
                this.n2 = (TextView) findViewById(R.id.tv_degree);
                this.o2 = (TextView) findViewById(R.id.tv_degree_right);
                this.p2 = (TextView) findViewById(R.id.tvDirection);
                this.q2 = (TextView) findViewById(R.id.tvDirection_right);
                this.D1 = (LinearLayout) findViewById(R.id.lin_watermaNC);
                this.E1 = (LinearLayout) findViewById(R.id.lin_waterma_2NC);
                this.j2 = (ImageView) findViewById(R.id.img_stampNC);
                this.k2 = (ImageView) findViewById(R.id.img_stamp_2NC);
                this.l2 = (TextView) findViewById(R.id.txt_watermarkNC);
                this.m2 = (TextView) findViewById(R.id.txt_watermark_2NC);
                this.q1 = (RelativeLayout) findViewById(R.id.li_stamp_nc);
                this.e1 = (LinearLayout) findViewById(R.id.li_address_nc);
                this.B = (TextView) findViewById(R.id.tv_address_line_1_nc);
                this.S0 = (ImageView) findViewById(R.id.imgLogoNC);
                this.R0 = (ImageView) findViewById(R.id.imgMapNC);
                this.o1 = (LinearLayout) findViewById(R.id.lin_bottom_watherNC);
                this.F1 = (GridLayout) findViewById(R.id.grBottomStamp);
                this.r1 = (RelativeLayout) findViewById(R.id.relCompassLay);
                this.s1 = (RelativeLayout) findViewById(R.id.relCompassLayRight);
                this.d1 = (LinearLayout) findViewById(R.id.li_main_stamp_layNC);
                this.t0.setEnabled(false);
                this.D0.setEnabled(false);
                this.v0.setEnabled(false);
                this.D0.setAlpha(0.4f);
                this.v0.setAlpha(0.4f);
                this.t0.setAlpha(0.4f);
            } else if (i5 == 4) {
                linearLayout2.setVisibility(8);
                this.m4.setVisibility(8);
                this.n4.setVisibility(8);
                this.o4.setVisibility(8);
                this.q4.setVisibility(8);
                this.p4.setVisibility(0);
                this.N1.setVisibility(8);
                this.P1.setVisibility(8);
                this.Q1.setVisibility(8);
                this.h2.setVisibility(8);
                this.W0.setVisibility(8);
                this.X0.setVisibility(8);
                this.i1.setVisibility(8);
                this.T1.setVisibility(8);
                this.V1.setVisibility(8);
                this.B = (TextView) findViewById(R.id.dt_tv_address_line_1);
                this.D = (TextView) findViewById(R.id.dt_tv_weather);
                this.H = (TextView) findViewById(R.id.dt_tv_compass);
                this.I = (TextView) findViewById(R.id.dt_tv_altitude);
                this.R0 = (ImageView) findViewById(R.id.dt_imgMap);
                this.S0 = (ImageView) findViewById(R.id.dt_imgLogo);
                this.f1 = (LinearLayout) findViewById(R.id.dt_li_stamp);
                this.j1 = (LinearLayout) findViewById(R.id.dt_li_watermak);
                this.k1 = (LinearLayout) findViewById(R.id.dt_li_watermak_2);
                this.u1 = (LinearLayout) findViewById(R.id.dt_li_compass);
                this.v1 = (LinearLayout) findViewById(R.id.dt_li_altitude);
                this.Z0 = (LinearLayout) findViewById(R.id.dt_li_logo);
                this.k0 = (ImageView) findViewById(R.id.dt_imgCompass);
                this.m0 = (ImageView) findViewById(R.id.dt_imgWeather);
                this.n0 = (ImageView) findViewById(R.id.dt_imgAltitude);
                this.w1 = (LinearLayout) findViewById(R.id.dt_li_rightView);
                this.t1 = (LinearLayout) findViewById(R.id.dt_li_weather);
                this.v4 = (TextView) findViewById(R.id.dt_tvDate);
                this.w4 = (TextView) findViewById(R.id.dt_tvTime);
                this.x4 = (TextView) findViewById(R.id.dt_tvDay);
                this.d1 = (LinearLayout) findViewById(R.id.dt_li_main_stamp_lay);
                this.e1 = (LinearLayout) findViewById(R.id.dt_li_address);
                this.j2 = (ImageView) findViewById(R.id.dt_img_stamp);
                this.k2 = (ImageView) findViewById(R.id.dt_img_stamp_2);
                this.l2 = (TextView) findViewById(R.id.dt_txt_watermark);
                this.m2 = (TextView) findViewById(R.id.dt_txt_watermark_2);
                this.d1.setVisibility(0);
                this.v0.setEnabled(false);
                this.v0.setAlpha(0.4f);
            } else if (i5 == 5) {
                linearLayout2.setVisibility(8);
                this.m4.setVisibility(8);
                this.n4.setVisibility(8);
                this.o4.setVisibility(8);
                this.q4.setVisibility(0);
                this.p4.setVisibility(8);
                this.B = (TextView) findViewById(R.id.tv_address_line_1_qr);
                this.R0 = (ImageView) findViewById(R.id.imgMapQR);
                this.T0 = (ImageView) findViewById(R.id.imgMap_rightQR);
                this.f1 = (LinearLayout) findViewById(R.id.li_stampQR);
                this.j1 = (LinearLayout) findViewById(R.id.lin_watermaQR);
                this.k1 = (LinearLayout) findViewById(R.id.lin_waterma_2QR);
                this.d1 = (LinearLayout) findViewById(R.id.li_main_stamp_layQR);
                this.x1 = (RelativeLayout) findViewById(R.id.relQrLay);
                this.y1 = (RelativeLayout) findViewById(R.id.relQrLay2);
                this.z1 = (RelativeLayout) findViewById(R.id.relMapLay);
                this.A1 = (RelativeLayout) findViewById(R.id.relMapLay2);
                this.B1 = (ShapeableImageView) findViewById(R.id.imgQR);
                this.C1 = (ShapeableImageView) findViewById(R.id.imgQR2);
                this.e1 = (LinearLayout) findViewById(R.id.li_addressQR);
            } else {
                linearLayout2.setVisibility(0);
                this.m4.setVisibility(8);
                this.n4.setVisibility(0);
                this.o4.setVisibility(8);
                this.p4.setVisibility(8);
                this.B = (TextView) findViewById(R.id.reporting_tv_address_line_1);
                this.D = (TextView) findViewById(R.id.reporting_tv_weather);
                this.d0 = (TextView) findViewById(R.id.reporting_txt_pressure);
                this.H = (TextView) findViewById(R.id.reporting_tv_compass);
                this.J = (TextView) findViewById(R.id.reporting_tv_magnetic_field);
                this.W = (TextView) findViewById(R.id.reporting_txt_humidity);
                this.R0 = (ImageView) findViewById(R.id.reporting_imgMap);
                this.T0 = (ImageView) findViewById(R.id.reporting_imgMap_2);
                this.S0 = (ImageView) findViewById(R.id.reporting_imgLogo);
                this.f1 = (LinearLayout) findViewById(R.id.reporting_li_stamp);
                this.g1 = (LinearLayout) findViewById(R.id.ll_maplay);
                this.h1 = (LinearLayout) findViewById(R.id.ll_maplay_2);
                this.j1 = (LinearLayout) findViewById(R.id.reporting_lin_waterma);
                this.k1 = (LinearLayout) findViewById(R.id.reporting_lin_waterma_2);
                this.l1 = (LinearLayout) findViewById(R.id.reporting_lin_pressure_stamp);
                this.m1 = (LinearLayout) findViewById(R.id.reporting_lin_wind_stamp);
                this.n1 = (LinearLayout) findViewById(R.id.reporting_lin_humidity_stamp);
                this.o1 = (LinearLayout) findViewById(R.id.reporting_lin_bottom_wather);
                this.Y0 = (LinearLayout) findViewById(R.id.reporting_li_compass);
                this.Z0 = (LinearLayout) findViewById(R.id.reporting_li_logo);
                this.C = (TextView) findViewById(R.id.reporting_txt_wind);
                this.k0 = (ImageView) findViewById(R.id.reporting_imgCompass);
                this.m0 = (ImageView) findViewById(R.id.reporting_imgWeather);
                this.o0 = (ImageView) findViewById(R.id.reporting_img_pressure_stamp);
                this.p0 = (ImageView) findViewById(R.id.reporting_imgMagneticField);
                this.q0 = (ImageView) findViewById(R.id.reporting_img_wind_stamp);
                this.r0 = (ImageView) findViewById(R.id.reporting_img_humidity_stamp);
                this.a1 = (LinearLayout) findViewById(R.id.reporting_li_rightView);
                this.b1 = (LinearLayout) findViewById(R.id.reporting_li_magnetic_field);
                this.c1 = (LinearLayout) findViewById(R.id.reporting_li_weather);
                this.d1 = (LinearLayout) findViewById(R.id.reporting_li_main_stamp_lay);
                this.e1 = (LinearLayout) findViewById(R.id.reporting_li_address);
                this.j2 = (ImageView) findViewById(R.id.ireporting_mg_stamp);
                this.k2 = (ImageView) findViewById(R.id.ireporting_mg_stamp_2);
                this.l2 = (TextView) findViewById(R.id.reporting_txt_watermark);
                this.m2 = (TextView) findViewById(R.id.reporting_txt_watermark_2);
                this.r4 = (TextView) findViewById(R.id.report_lay);
                this.s4 = (TextView) findViewById(R.id.report_lay_2);
                this.d1.setVisibility(0);
                this.s0.setEnabled(false);
                this.s0.setAlpha(0.4f);
            }
        }
        n0();
        this.k4.setOnClickListener(new o30(7, this));
        this.s0.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.p1.setOnClickListener(this);
        this.t0.setOnClickListener(this);
        this.u0.setOnClickListener(this);
        this.v0.setOnClickListener(this);
        this.w0.setOnClickListener(this);
        this.x0.setOnClickListener(this);
        this.y0.setOnClickListener(this);
        this.z0.setOnClickListener(this);
        this.A0.setOnClickListener(this);
        this.B0.setOnClickListener(this);
        this.C0.setOnClickListener(this);
        this.D0.setOnClickListener(this);
        this.E0.setOnClickListener(this);
        this.F0.setOnClickListener(this);
        this.G0.setOnClickListener(this);
        this.H0.setOnClickListener(this);
        this.I0.setOnClickListener(this);
        this.J0.setOnClickListener(this);
        this.K0.setOnClickListener(this);
        this.L0.setOnClickListener(this);
        this.H1.setOnClickListener(this);
        this.i2.setOnClickListener(this);
        this.M0.setOnClickListener(this);
        this.N0.setOnClickListener(this);
        this.O0.setOnClickListener(this);
        this.P0.setOnClickListener(this);
        this.M1.setOnClickListener(this);
        this.O1.setOnClickListener(this);
        this.P1.setOnClickListener(this);
        this.N1.setOnClickListener(this);
        this.Q1.setOnClickListener(this);
        this.R1.setOnClickListener(this);
        this.S1.setOnClickListener(this);
        this.b2.setOnClickListener(this);
        this.c2.setOnClickListener(this);
        this.d2.setOnClickListener(this);
        this.e2.setOnClickListener(this);
        this.f2.setOnClickListener(this);
        this.W0.setOnClickListener(this);
        this.i1.setOnClickListener(this);
        this.a2.setOnClickListener(this);
        this.T1.setOnClickListener(this);
        this.V1.setOnClickListener(this);
        this.W1.setOnClickListener(this);
        this.X1.setOnClickListener(this);
        this.Y1.setOnClickListener(this);
        this.U1.setOnClickListener(this);
        this.K1.setOnClickListener(this);
        this.L1.setOnClickListener(this);
        this.I1.setOnClickListener(this);
        this.J1.setOnClickListener(this);
        this.h4 = new Admob();
        this.i4 = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
        k().a(this, new tq6(this, i2));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.h4;
        if (admob != null) {
            admob.DestroyAd();
        }
        kx0 kx0Var = this.z4;
        if (kx0Var != null) {
            kx0Var.c();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        super.onPause();
        kx0 kx0Var = this.z4;
        if (kx0Var != null) {
            kx0Var.c();
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.iSTemplateSettingBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                int i2 = RemoteAdData.TEMPLATE_SETTING_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    this.h4.loadAdaptive_banner(this, this.i4, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                } else if (i2 == 2) {
                    this.h4.loadAdaptive_bannerAdax(this, this.i4, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                this.h4.loadAdaptive_banner(this, this.i4, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
            } else if (i == 2) {
                this.h4.loadAdaptive_bannerAdax(this, this.i4, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            this.i4.setVisibility(8);
        }
        if (this.b4.u()) {
            this.b4.f0();
            Log.e("datetime76", "refrese");
        }
        Q0();
        kx0 kx0Var = this.z4;
        if (kx0Var == null || this.f3 != 3) {
            return;
        }
        kx0Var.b();
    }

    public final void p0() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ws3(23, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void p1() {
        boolean zEquals = Z().equals("Bottom");
        TextView textView = this.e0;
        if (zEquals) {
            textView.setText(getString(R.string.pos_bottom));
        } else {
            textView.setText(getString(R.string.pos_top));
        }
        Q0();
    }

    public final boolean q0() {
        return this.l4.getBoolean(this, "accuracy", false);
    }

    public final void q1() {
        if (a0().equals("Large")) {
            this.f0.setText(getResources().getString(R.string.size_large));
        } else if (a0().equals(Default.TEMPLATE_SIZE)) {
            this.f0.setText(getResources().getString(R.string.size_medium));
        } else {
            boolean zEquals = a0().equals("Small");
            TextView textView = this.f0;
            if (zEquals) {
                textView.setText(getResources().getString(R.string.size_small));
            } else {
                textView.setText(getResources().getString(R.string.size_xtrasmall));
            }
        }
        int i = this.f3;
        if (i == 2) {
            b1();
            return;
        }
        if (i == 3) {
            V0();
            return;
        }
        if (i == 4) {
            R0();
        } else if (i == 5) {
            Z0();
        } else {
            d1();
        }
    }

    public final boolean r0() {
        return this.l4.getBoolean(this, "Address_City", true);
    }

    public final void r1(int i) {
        String displayName = Calendar.getInstance().getTimeZone().getDisplayName(false, 1);
        Date time = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime();
        String str = new SimpleDateFormat("Z").format(time);
        String str2 = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(time);
        switch (i) {
            case 1:
                this.a0.setText(str);
                break;
            case 2:
                this.a0.setText("UTC " + str);
                break;
            case 3:
                this.a0.setText("GMT " + str);
                break;
            case 4:
                this.a0.setText(str2);
                break;
            case 5:
                this.a0.setText("UTC " + str2);
                break;
            case 6:
                this.a0.setText("GMT " + str2);
                break;
            case 7:
                this.a0.setText(displayName);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0021  */
    public final int s() {
        if (this.f3 == 3) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5 && J0()) {
                                    i++;
                                }
                            } else if (q0()) {
                                i++;
                            }
                        } else if (w0()) {
                            i++;
                        }
                    } else if (O0()) {
                        i++;
                    }
                } else if (B0()) {
                    i++;
                }
            } else if (M0()) {
                i++;
            }
        }
        return i;
    }

    public final boolean s0() {
        return this.l4.getBoolean(this, "Address_Country", true);
    }

    public final void s1() {
        String str = HelperClass.getwindConvert(this, m0());
        this.G.setText(str);
        if (M0()) {
            this.C.setText(str);
            this.q0.setImageResource(R.drawable.ic_wind);
        }
    }

    public final int t() {
        return jb5.j(this, this, "Accuracy Color", -1);
    }

    public final boolean t0() {
        return this.l4.getBoolean(this, "Address_Pincode", true);
    }

    public final void t1() {
        try {
            qc qcVar = this.D4;
            if (qcVar != null) {
                if (qcVar.isShowing()) {
                    return;
                }
                this.D4.show();
                return;
            }
            pc pcVar = new pc(this);
            pcVar.setTitle(getResources().getString(R.string.permission_denied_title));
            String string = getResources().getString(R.string.allow_for_smooth);
            lc lcVar = pcVar.a;
            lcVar.f = string;
            lcVar.m = false;
            pcVar.d(getResources().getString(R.string.action_settings), new yc(14, this));
            qc qcVarCreate = pcVar.create();
            this.D4 = qcVarCreate;
            qcVarCreate.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int u() {
        return jb5.j(this, this, "Address Color", -1);
    }

    public final boolean u0() {
        return this.l4.getBoolean(this, "Address_State", true);
    }

    public final int v() {
        return jb5.j(this, this, "Altitude Color", -1);
    }

    public final boolean v0() {
        return this.l4.getBoolean(this, "Address", true);
    }

    public final int w() {
        return new SP(this).getInteger(this, "Background Color", Color.parseColor("#9c000000"));
    }

    public final boolean w0() {
        return this.l4.getBoolean(this, "altitude", false);
    }

    public final boolean x0() {
        return this.l4.getBoolean(this, "Compass", false);
    }

    public final int y() {
        return jb5.j(this, this, "Compass Color", -1);
    }

    public final boolean y0() {
        return this.l4.getBoolean(this, "is_Contact_Number", false);
    }

    public final String z() {
        return this.l4.getString(this, "contactNumber", Default.contactNumber);
    }

    public final boolean z0() {
        return this.l4.getBoolean(this, "is_country_flag_temp", true);
    }
}