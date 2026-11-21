package com.gpsmapcamera.geotagginglocationonphoto.activity;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.widget.gIwi.GdCAWuElcaQTW;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.startup.fO.uBHp;
import com.google.firebase.analytics.Tb.VCKtvKCuFgEI;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.HorizontalCustomDate;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CommonFunction;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SharePref;
import com.gpsmapcamera.geotagginglocationonphoto.model.DateTime;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.html.HtmlTags;
import defpackage.b81;
import defpackage.bj;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.fq1;
import defpackage.gc1;
import defpackage.lc1;
import defpackage.lt1;
import defpackage.n8;
import defpackage.ub7;
import defpackage.v60;
import defpackage.w80;
import defpackage.x32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalCustomDate extends bj implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int m1 = 0;
    public Button A0;
    public String B;
    public Button B0;
    public String C;
    public Button C0;
    public String D;
    public Button D0;
    public String E;
    public Button E0;
    public String F;
    public Button F0;
    public String G;
    public Button G0;
    public String H;
    public Button H0;
    public String I;
    public Button I0;
    public String J;
    public Button J0;
    public String K;
    public Button K0;
    public String L;
    public Button L0;
    public String M;
    public Button M0;
    public String N;
    public Button N0;
    public String O;
    public Button O0;
    public String P;
    public Button P0;
    public String Q;
    public RelativeLayout Q0;
    public String R0;
    public String S0;
    public SharePref T;
    public String T0;
    public TextView U;
    public String U0;
    public RelativeLayout V;
    public String V0;
    public RelativeLayout W;
    public String W0;
    public RelativeLayout X;
    public String X0;
    public TextView Y;
    public String Y0;
    public DateTime Z;
    public String Z0;
    public String a1;
    public String b1;
    public String[] c0;
    public String c1;
    public String[] d0;
    public String d1;
    public String e1;
    public String f1;
    public CommonFunction g0;
    public String g1;
    public CommonFunction h0;
    public int h1;
    public ArrayList i0;
    public RelativeLayout i1;
    public ArrayList j0;
    public gc1 j1;
    public Spinner k0;
    public Spinner l0;
    public Spinner m0;
    public Spinner n0;
    public Spinner o0;
    public Spinner p0;
    public Spinner q0;
    public Spinner r0;
    public Spinner s0;
    public Spinner t0;
    public Spinner u0;
    public Spinner v0;
    public Spinner w0;
    public Spinner x0;
    public Spinner y0;
    public Spinner z0;
    public String R = "Not_Set";
    public String S = "Not_Set";
    public boolean a0 = false;
    public String b0 = "";
    public ArrayList e0 = null;
    public ArrayList f0 = null;
    public boolean k1 = false;
    public final Admob l1 = new Admob();

    public final void A(int i, String str) {
        this.j0.set(i, str);
    }

    public final void B(String str) {
        String[] strArrSplit = str.split("#");
        int length = strArrSplit.length;
        this.T.setH1(null);
        this.T.setH2(null);
        this.T.setH3(null);
        this.T.setH4(null);
        this.T.setH5(null);
        this.T.setH6(null);
        this.T.setH7(null);
        this.T.setH8(null);
        this.T.setH9(null);
        this.T.setH10(null);
        this.T.setH11(null);
        this.T.setH12(null);
        this.T.setH13(null);
        this.T.setH14(null);
        this.T.setH15(null);
        this.T.setH16(null);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (i == 0) {
                this.T.setH1(strArrSplit[0]);
            }
            if (i == 1) {
                this.T.setH2(strArrSplit[1]);
            }
            if (i == 2) {
                this.T.setH3(strArrSplit[2]);
            }
            if (i == 3) {
                this.T.setH4(strArrSplit[3]);
            }
            if (i == 4) {
                this.T.setH5(strArrSplit[4]);
            }
            if (i == 5) {
                this.T.setH6(strArrSplit[5]);
            }
            if (i == 6) {
                this.T.setH7(strArrSplit[6]);
            }
            if (i == 7) {
                this.T.setH8(strArrSplit[7]);
            }
            if (i == 8) {
                this.T.setH9(strArrSplit[8]);
            }
            if (i == 9) {
                this.T.setH10(strArrSplit[9]);
            }
            if (i == 10) {
                this.T.setH11(strArrSplit[10]);
            }
            if (i == 11) {
                this.T.setH12(strArrSplit[11]);
            }
            if (i == 12) {
                this.T.setH13(strArrSplit[12]);
            }
            if (i == 13) {
                this.T.setH14(strArrSplit[13]);
            }
            if (i == 14) {
                this.T.setH15(strArrSplit[14]);
            }
            if (i == 15) {
                this.T.setH16(strArrSplit[15]);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.toolbar_back) {
            u();
        } else if (view.getId() == R.id.toolbar_done) {
            w();
        } else if (view.getId() == R.id.toolbar_refresh) {
            t();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        String string = new SP(this).getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 16;
        final int i3 = 1;
        final int i4 = 0;
        if (string.equals(Default.DARK)) {
            this.k1 = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.k1 = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.k1 = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_horizontal_custom_date);
        View viewFindViewById = findViewById(R.id.mainrl_horizontal);
        final int i5 = 10;
        x32 x32Var = new x32(i5, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, x32Var);
        this.j1 = new gc1(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.a0 = extras.getBoolean("isEdit");
            int i6 = extras.getInt("id_of_date", 1);
            this.h1 = i6;
            gc1 gc1Var = this.j1;
            gc1Var.getClass();
            DateTime dateTime = null;
            Cursor cursorRawQuery = gc1Var.getReadableDatabase().rawQuery(GdCAWuElcaQTW.jOTKqNrzAh + i6, null);
            if (cursorRawQuery.moveToFirst()) {
                dateTime = new DateTime();
                dateTime.setDate_id(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("date_id")));
                dateTime.setDate_format(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(SP.DATE_FORMAT)));
                dateTime.setDate_format_(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("date_format_")));
                dateTime.setDate_type(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("type_date")));
                dateTime.setDate_custom(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("type_custom")));
                dateTime.setDate_pos(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("date_pos")));
                dateTime.setIsSelect(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("date_check")));
            }
            this.Z = dateTime;
        }
        k().a(this, new n8(this, 12));
        this.Y = (TextView) findViewById(R.id.tvDateString1);
        this.k0 = (Spinner) findViewById(R.id.Vspinner1);
        this.l0 = (Spinner) findViewById(R.id.Vspinner2);
        this.m0 = (Spinner) findViewById(R.id.Vspinner3);
        this.n0 = (Spinner) findViewById(R.id.Vspinner4);
        this.o0 = (Spinner) findViewById(R.id.Vspinner5);
        this.p0 = (Spinner) findViewById(R.id.Vspinner6);
        this.q0 = (Spinner) findViewById(R.id.Vspinner7);
        this.r0 = (Spinner) findViewById(R.id.Vspinner8);
        this.s0 = (Spinner) findViewById(R.id.Vspinner9);
        this.t0 = (Spinner) findViewById(R.id.Vspinner10);
        this.u0 = (Spinner) findViewById(R.id.Vspinner11);
        this.v0 = (Spinner) findViewById(R.id.Vspinner12);
        this.w0 = (Spinner) findViewById(R.id.Vspinner13);
        this.x0 = (Spinner) findViewById(R.id.Vspinner14);
        this.y0 = (Spinner) findViewById(R.id.Vspinner15);
        this.z0 = (Spinner) findViewById(R.id.Vspinner16);
        this.A0 = (Button) findViewById(R.id.ll_spinner_1);
        this.B0 = (Button) findViewById(R.id.ll_spinner_2);
        this.C0 = (Button) findViewById(R.id.ll_spinner_3);
        this.D0 = (Button) findViewById(R.id.ll_spinner_4);
        this.E0 = (Button) findViewById(R.id.ll_spinner_5);
        this.F0 = (Button) findViewById(R.id.ll_spinner_6);
        this.G0 = (Button) findViewById(R.id.ll_spinner_7);
        this.H0 = (Button) findViewById(R.id.ll_spinner_8);
        this.I0 = (Button) findViewById(R.id.ll_spinner_9);
        this.J0 = (Button) findViewById(R.id.ll_spinner_10);
        this.K0 = (Button) findViewById(R.id.ll_spinner_11);
        this.L0 = (Button) findViewById(R.id.ll_spinner_12);
        this.M0 = (Button) findViewById(R.id.ll_spinner_13);
        this.N0 = (Button) findViewById(R.id.ll_spinner_14);
        this.O0 = (Button) findViewById(R.id.ll_spinner_15);
        this.P0 = (Button) findViewById(R.id.ll_spinner_16);
        this.U = (TextView) findViewById(R.id.tv_toolbar_title);
        this.V = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.W = (RelativeLayout) findViewById(R.id.toolbar_refresh);
        this.X = (RelativeLayout) findViewById(R.id.toolbar_done);
        this.i1 = (RelativeLayout) findViewById(R.id.mainrl_horizontal);
        this.Q0 = (RelativeLayout) findViewById(R.id.rl_progresslayout);
        this.T = new SharePref(this);
        new SharePref(this);
        this.h0 = new CommonFunction();
        this.g0 = new CommonFunction();
        this.W.setVisibility(0);
        this.X.setVisibility(0);
        ImageView imageView = (ImageView) this.X.findViewById(R.id.iv_toolbar_done);
        if (imageView == null && this.X.getChildCount() > 0 && (this.X.getChildAt(0) instanceof ImageView)) {
            imageView = (ImageView) this.X.getChildAt(0);
        }
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_yellow_done);
        }
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        boolean z = this.a0;
        TextView textView = this.U;
        if (z) {
            textView.setText(getString(R.string.edit_date_time));
        } else {
            textView.setText(getString(R.string.create_date_time));
        }
        DateTime dateTime2 = this.Z;
        if (dateTime2 != null) {
            this.b0 = dateTime2.getDate_format();
            if (this.Z.getDate_format_().equals("null")) {
                this.S = "dd#/#MM#/#yyyy# #hh#:#mm# #a";
                this.R = "dd/MM/yyyy hh:mm  a";
                B("dd#/#MM#/#yyyy# #hh#:#mm# #a");
            } else {
                this.R = this.b0;
                this.S = this.Z.getDate_format_();
                B(this.Z.getDate_format_());
            }
        } else {
            this.S = "dd#/#MM#/#yyyy# #hh#:#mm# #a";
            this.R = "dd/MM/yyyy hh:mm  a";
            B("dd#/#MM#/#yyyy# #hh#:#mm# #a");
        }
        this.c0 = new String[]{"Days", VCKtvKCuFgEI.ktfPuslMXlwu + this.g0.getDate(HelperClass.date.getTime(), "E") + ")", "EEEE(" + this.g0.getDate(HelperClass.date.getTime(), "EEEE") + ")", "EEE(" + this.g0.getDate(HelperClass.date.getTime(), "EEE") + ")", "Date", "date(" + this.h0.getDate(HelperClass.date.getTime(), "dd") + ")", "date(" + this.h0.getDate(HelperClass.date.getTime(), "ddth") + ")", "Months", "MM(" + this.g0.getDate(HelperClass.date.getTime(), "MM") + ")", "MMM(" + this.g0.getDate(HelperClass.date.getTime(), "MMM") + ")", "MMMM(" + this.g0.getDate(HelperClass.date.getTime(), "MMMM") + ")", "Years", "yy(" + this.g0.getDate(HelperClass.date.getTime(), "yy") + ")", "yyyy(" + this.g0.getDate(HelperClass.date.getTime(), "yyyy") + ")", FontFactory.TIMES, " Hour(" + this.h0.getDate(HelperClass.date.getTime(), "HH") + ")", "hour(" + this.h0.getDate(HelperClass.date.getTime(), "hh") + ")", "Minute(" + this.h0.getDate(HelperClass.date.getTime(), "mm") + ")", "second(" + this.h0.getDate(HelperClass.date.getTime(), "ss") + ")", "a(AM/PM)", ":", "/", ",", ".", uBHp.UulEGjLHCre, "SPACE", "CLEAR", "CLEAR ALL", ""};
        this.d0 = new String[]{"Days", "E", "EEEE", "EEE", "Date", "dd", "ddth", "Months", "MM", "MMM", "MMMM", "Years", "yy", "yyyy", FontFactory.TIMES, "HH", "hh", "mm", "ss", HtmlTags.A, ":", "/", ",", ".", uBHp.UulEGjLHCre, "SPACE", "CLEAR", "CLEAR ALL", ""};
        this.e0 = new ArrayList(Arrays.asList(this.c0));
        this.f0 = new ArrayList(Arrays.asList(this.d0));
        this.Q0.setVisibility(0);
        this.k0.setOnItemSelectedListener(this);
        this.l0.setOnItemSelectedListener(this);
        this.m0.setOnItemSelectedListener(this);
        this.n0.setOnItemSelectedListener(this);
        this.o0.setOnItemSelectedListener(this);
        this.p0.setOnItemSelectedListener(this);
        this.q0.setOnItemSelectedListener(this);
        this.r0.setOnItemSelectedListener(this);
        this.s0.setOnItemSelectedListener(this);
        this.t0.setOnItemSelectedListener(this);
        this.u0.setOnItemSelectedListener(this);
        this.v0.setOnItemSelectedListener(this);
        this.w0.setOnItemSelectedListener(this);
        this.x0.setOnItemSelectedListener(this);
        this.y0.setOnItemSelectedListener(this);
        this.z0.setOnItemSelectedListener(this);
        this.i0.add(this.R0);
        this.i0.add(this.S0);
        this.i0.add(this.T0);
        this.i0.add(this.U0);
        this.i0.add(this.V0);
        this.i0.add(this.W0);
        this.i0.add(this.X0);
        this.i0.add(this.Y0);
        this.i0.add(this.Z0);
        this.i0.add(this.a1);
        this.i0.add(this.b1);
        this.i0.add(this.c1);
        this.i0.add(this.d1);
        this.i0.add(this.e1);
        this.i0.add(this.f1);
        this.i0.add(this.g1);
        this.j0.add(this.B);
        this.j0.add(this.C);
        this.j0.add(this.D);
        this.j0.add(this.E);
        this.j0.add(this.F);
        this.j0.add(this.G);
        this.j0.add(this.H);
        this.j0.add(this.I);
        this.j0.add(this.J);
        this.j0.add(this.K);
        this.j0.add(this.L);
        this.j0.add(this.M);
        this.j0.add(this.N);
        this.j0.add(this.O);
        this.j0.add(this.P);
        this.j0.add(this.Q);
        this.V.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.A0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i5;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i7) {
                    case 0:
                        int i8 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i9 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i10 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i11 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i12 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i13 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        this.B0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i3;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i7) {
                    case 0:
                        int i8 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i9 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i10 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i11 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i12 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i13 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i7 = 2;
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i7;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i8) {
                    case 0:
                        int i9 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i10 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i11 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i12 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i13 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i8 = 3;
        this.D0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = i8;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i9) {
                    case 0:
                        int i10 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i11 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i12 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i13 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i9 = 4;
        this.E0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i9;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i10) {
                    case 0:
                        int i11 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i12 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i13 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i10 = 5;
        this.F0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i11) {
                    case 0:
                        int i12 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i13 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i11 = 6;
        this.G0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i12) {
                    case 0:
                        int i13 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i12 = 7;
        this.H0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i13) {
                    case 0:
                        int i14 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i13 = 8;
        this.I0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i14) {
                    case 0:
                        int i15 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i14 = 9;
        this.J0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i15) {
                    case 0:
                        int i16 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i117 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i15 = 11;
        this.K0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i15;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i16) {
                    case 0:
                        int i17 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i117 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i118 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i16 = 12;
        this.L0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i17 = i16;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i17) {
                    case 0:
                        int i18 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i117 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i118 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i119 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i17 = 13;
        this.M0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = i17;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i18) {
                    case 0:
                        int i19 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i117 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i118 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i119 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i1110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i18 = 14;
        this.N0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i19 = i18;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i19) {
                    case 0:
                        int i110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i117 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i118 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i119 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i1110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i1111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        final int i19 = 15;
        this.O0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i110 = i19;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i110) {
                    case 0:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i117 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i118 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i119 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i1110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i1111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i1112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: jw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i110 = i4;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i110) {
                    case 0:
                        int i111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(16, horizontalCustomDate.z0.getSelectedItemPosition());
                        break;
                    case 1:
                        int i112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(2, horizontalCustomDate.l0.getSelectedItemPosition());
                        break;
                    case 2:
                        int i113 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(3, horizontalCustomDate.m0.getSelectedItemPosition());
                        break;
                    case 3:
                        int i114 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(4, horizontalCustomDate.n0.getSelectedItemPosition());
                        break;
                    case 4:
                        int i115 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(5, horizontalCustomDate.o0.getSelectedItemPosition());
                        break;
                    case 5:
                        int i116 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(6, horizontalCustomDate.p0.getSelectedItemPosition());
                        break;
                    case 6:
                        int i117 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(7, horizontalCustomDate.q0.getSelectedItemPosition());
                        break;
                    case 7:
                        int i118 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(8, horizontalCustomDate.r0.getSelectedItemPosition());
                        break;
                    case 8:
                        int i119 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(9, horizontalCustomDate.s0.getSelectedItemPosition());
                        break;
                    case 9:
                        int i1110 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(10, horizontalCustomDate.t0.getSelectedItemPosition());
                        break;
                    case 10:
                        int i1111 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(1, horizontalCustomDate.k0.getSelectedItemPosition());
                        break;
                    case 11:
                        int i1112 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(11, horizontalCustomDate.u0.getSelectedItemPosition());
                        break;
                    case 12:
                        int i20 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(12, horizontalCustomDate.v0.getSelectedItemPosition());
                        break;
                    case 13:
                        int i21 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(13, horizontalCustomDate.w0.getSelectedItemPosition());
                        break;
                    case 14:
                        int i22 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(14, horizontalCustomDate.x0.getSelectedItemPosition());
                        break;
                    default:
                        int i23 = HorizontalCustomDate.m1;
                        horizontalCustomDate.s(15, horizontalCustomDate.y0.getSelectedItemPosition());
                        break;
                }
            }
        });
        new Handler().postDelayed(new fq1(i2, this), 300L);
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.l1;
        if (admob != null) {
            admob.DestroyAd();
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Spinner spinner = (Spinner) adapterView;
        if (this.X.getVisibility() == 8) {
            this.X.setVisibility(0);
        }
        if (spinner.getId() == R.id.Vspinner1) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.R0 = this.g0.setdate((String) this.e0.get(i));
            this.B = this.g0.getFormat((String) this.e0.get(i));
            z(0, this.R0);
            A(0, this.B);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner2) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.S0 = this.g0.setdate((String) this.e0.get(i));
            this.C = this.g0.getFormat((String) this.e0.get(i));
            z(1, this.S0);
            A(1, this.C);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner3) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.T0 = this.g0.setdate((String) this.e0.get(i));
            this.D = this.g0.getFormat((String) this.e0.get(i));
            z(2, this.T0);
            A(2, this.D);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner4) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.U0 = this.g0.setdate((String) this.e0.get(i));
            this.E = this.g0.getFormat((String) this.e0.get(i));
            z(3, this.U0);
            A(3, this.E);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner5) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.V0 = this.g0.setdate((String) this.e0.get(i));
            this.F = this.g0.getFormat((String) this.e0.get(i));
            z(4, this.V0);
            A(4, this.F);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner6) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.W0 = this.g0.setdate((String) this.e0.get(i));
            this.G = this.g0.getFormat((String) this.e0.get(i));
            z(5, this.W0);
            A(5, this.G);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner7) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.X0 = this.g0.setdate((String) this.e0.get(i));
            this.H = this.g0.getFormat((String) this.e0.get(i));
            z(6, this.X0);
            A(6, this.H);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner8) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.Y0 = this.g0.setdate((String) this.e0.get(i));
            this.I = this.g0.getFormat((String) this.e0.get(i));
            z(7, this.Y0);
            A(7, this.I);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner9) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.Z0 = this.g0.setdate((String) this.e0.get(i));
            this.J = this.g0.getFormat((String) this.e0.get(i));
            z(8, this.Z0);
            A(8, this.J);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner10) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.a1 = this.g0.setdate((String) this.e0.get(i));
            this.K = this.g0.getFormat((String) this.e0.get(i));
            z(9, this.a1);
            A(9, this.K);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner11) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.b1 = this.g0.setdate((String) this.e0.get(i));
            this.L = this.g0.getFormat((String) this.e0.get(i));
            z(10, this.b1);
            A(10, this.L);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner12) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.c1 = this.g0.setdate((String) this.e0.get(i));
            this.M = this.g0.getFormat((String) this.e0.get(i));
            z(11, this.c1);
            A(11, this.M);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner13) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.d1 = this.g0.setdate((String) this.e0.get(i));
            this.N = this.g0.getFormat((String) this.e0.get(i));
            z(12, this.d1);
            A(12, this.N);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner14) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.e1 = this.g0.setdate((String) this.e0.get(i));
            this.O = this.g0.getFormat((String) this.e0.get(i));
            z(13, this.e1);
            A(13, this.O);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner15) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.f1 = this.g0.setdate((String) this.e0.get(i));
            this.P = this.g0.getFormat((String) this.e0.get(i));
            z(14, this.f1);
            A(14, this.P);
            v();
            this.R = x();
            this.S = y();
            return;
        }
        if (spinner.getId() == R.id.Vspinner16) {
            if (((String) this.e0.get(i)).equals("CLEAR ALL")) {
                t();
                return;
            }
            this.g1 = this.g0.setdate((String) this.e0.get(i));
            this.Q = this.g0.getFormat((String) this.e0.get(i));
            z(15, this.g1);
            A(15, this.Q);
            v();
            this.R = x();
            this.S = y();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!AllAdsApproval.iSCustomDateBanner(this)) {
            ((RelativeLayout) findViewById(R.id.rel_adaptive_banner)).setVisibility(8);
            return;
        }
        Admob admob = new Admob();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        if (i != 9) {
            if (i == 1) {
                admob.loadAdaptive_banner(this, relativeLayout, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                return;
            } else {
                if (i == 2) {
                    admob.loadAdaptive_bannerAdax(this, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i2 = RemoteAdData.CUSTOM_DATETIME_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            admob.loadAdaptive_banner(this, relativeLayout, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            admob.loadAdaptive_bannerAdax(this, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final void s(int i, int i2) {
        v60 v60Var = new v60(this);
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.main_datetime_layout, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        v60Var.create();
        v60Var.show();
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_datetimeFormat);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ArrayList arrayList = this.e0;
        boolean z = this.k1;
        w80 w80Var = new w80(this, v60Var, i);
        b81 b81Var = new b81();
        b81Var.e = false;
        b81Var.c = this;
        b81.g = arrayList;
        b81Var.f = i2;
        b81Var.d = w80Var;
        new SP(this);
        b81Var.e = z;
        recyclerView.setAdapter(b81Var);
    }

    public final void t() {
        this.R0 = "";
        this.S0 = "";
        this.T0 = "";
        this.U0 = "";
        this.V0 = "";
        this.W0 = "";
        this.X0 = "";
        this.Y0 = "";
        this.Z0 = "";
        this.a1 = "";
        this.b1 = "";
        this.c1 = "";
        this.d1 = "";
        this.e1 = "";
        this.f1 = "";
        this.g1 = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "";
        this.H = "";
        this.I = "";
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        this.P = "";
        this.Q = "";
        this.i0.add(0, "");
        this.i0.add(1, this.S0);
        this.i0.add(2, this.T0);
        this.i0.add(3, this.U0);
        this.i0.add(4, this.V0);
        this.i0.add(5, this.W0);
        this.i0.add(6, this.X0);
        this.i0.add(7, this.Y0);
        this.i0.add(8, this.Z0);
        this.i0.add(9, this.a1);
        this.i0.add(10, this.b1);
        this.i0.add(11, this.c1);
        this.i0.add(12, this.d1);
        this.i0.add(13, this.e1);
        this.i0.add(14, this.f1);
        this.i0.add(15, this.g1);
        this.j0.add(0, this.B);
        this.j0.add(1, this.C);
        this.j0.add(2, this.D);
        this.j0.add(3, this.E);
        this.j0.add(4, this.F);
        this.j0.add(5, this.G);
        this.j0.add(6, this.H);
        this.j0.add(7, this.I);
        this.j0.add(8, this.J);
        this.j0.add(9, this.K);
        this.j0.add(10, this.L);
        this.j0.add(11, this.M);
        this.j0.add(12, this.N);
        this.j0.add(13, this.O);
        this.j0.add(14, this.P);
        this.j0.add(15, this.Q);
        v();
        this.k0.setSelection(28);
        this.l0.setSelection(28);
        this.m0.setSelection(28);
        this.n0.setSelection(28);
        this.o0.setSelection(28);
        this.p0.setSelection(28);
        this.q0.setSelection(28);
        this.r0.setSelection(28);
        this.s0.setSelection(28);
        this.t0.setSelection(28);
        this.u0.setSelection(28);
        this.v0.setSelection(28);
        this.w0.setSelection(28);
        this.x0.setSelection(28);
        this.y0.setSelection(28);
        this.z0.setSelection(28);
    }

    public final void u() {
        if (!this.a0) {
            finish();
            return;
        }
        if (this.b0.equals(this.R)) {
            finish();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getResources().getString(R.string.discard_message));
        final int i = 0;
        builder.setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener(this) { // from class: kw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i3) {
                    case 0:
                        int i4 = HorizontalCustomDate.m1;
                        horizontalCustomDate.w();
                        dialogInterface.dismiss();
                        break;
                    default:
                        int i5 = HorizontalCustomDate.m1;
                        horizontalCustomDate.finish();
                        dialogInterface.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        builder.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener(this) { // from class: kw2
            public final /* synthetic */ HorizontalCustomDate b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i2;
                HorizontalCustomDate horizontalCustomDate = this.b;
                switch (i4) {
                    case 0:
                        int i5 = HorizontalCustomDate.m1;
                        horizontalCustomDate.w();
                        dialogInterface.dismiss();
                        break;
                    default:
                        int i6 = HorizontalCustomDate.m1;
                        horizontalCustomDate.finish();
                        dialogInterface.dismiss();
                        break;
                }
            }
        });
        builder.create().show();
    }

    public final void v() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 15; i++) {
            if (!TextUtils.isEmpty((CharSequence) this.i0.get(i))) {
                sb.append((String) this.i0.get(i));
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(sb.toString());
        TextView textView = this.Y;
        if (zIsEmpty) {
            textView.setText("");
        } else {
            textView.setText(sb.toString());
        }
    }

    public final void w() {
        if (!TextUtils.isEmpty(this.R) && !TextUtils.isEmpty(this.S)) {
            new SP(this).setString(this, "date_format_temp", this.R);
            ArrayList arrayList = lc1.K0;
        }
        boolean z = this.a0;
        String str = this.R;
        if (!z) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.S)) {
                cc6.i(this.i1, getResources().getString(R.string.error_null_dates), 0).k();
                return;
            }
            if (this.j1.a(this.R)) {
                finish();
                return;
            }
            this.j1.P(1, 1, -1, this.R, this.S);
            gc1 gc1Var = this.j1;
            String str2 = this.R;
            gc1Var.getClass();
            Cursor cursorRawQuery = gc1Var.getWritableDatabase().rawQuery("SELECT  * FROM DateAll WHERE date_format = '" + str2 + "'", null);
            int i = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("date_id")) : -1;
            DateTime dateTime = new DateTime();
            if (i != -1) {
                dateTime.setDate_id(i);
            }
            dateTime.setDate_format(this.R);
            dateTime.setDate_format_(this.S);
            dateTime.setDate_type(1);
            dateTime.setDate_custom(1);
            dateTime.setIsSelect(0);
            dateTime.setDate_pos(-1);
            lc1.K0.add(0, dateTime);
            finish();
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.S)) {
            cc6.i(this.i1, getResources().getString(R.string.error_null_dates), 0).k();
            return;
        }
        if (this.j1.a(this.R)) {
            finish();
            return;
        }
        gc1 gc1Var2 = this.j1;
        int i2 = this.h1;
        String str3 = this.R;
        String str4 = this.S;
        SQLiteDatabase writableDatabase = gc1Var2.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(SP.DATE_FORMAT, str3);
        contentValues.put("date_format_", str4);
        writableDatabase.update("DateAll", contentValues, "date_id = ?", new String[]{String.valueOf(i2)});
        for (int i3 = 0; i3 < lc1.K0.size(); i3++) {
            if (((DateTime) lc1.K0.get(i3)).getDate_id() == this.h1) {
                ((DateTime) lc1.K0.get(i3)).setDate_format(this.R);
                ((DateTime) lc1.K0.get(i3)).setDate_format_(this.S);
                ((DateTime) lc1.K0.get(i3)).setDate_type(1);
                ((DateTime) lc1.K0.get(i3)).setDate_custom(1);
                if (this.Z != null) {
                    ((DateTime) lc1.K0.get(i3)).setIsSelect(this.Z.getIsSelect());
                } else {
                    ((DateTime) lc1.K0.get(i3)).setIsSelect(0);
                }
                ((DateTime) lc1.K0.get(i3)).setDate_pos(-1);
            }
        }
        finish();
    }

    public final String x() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 15; i++) {
            if (!TextUtils.isEmpty((CharSequence) this.j0.get(i))) {
                sb.append((String) this.j0.get(i));
            }
        }
        return sb.toString();
    }

    public final String y() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 15; i++) {
            if (!TextUtils.isEmpty((CharSequence) this.j0.get(i))) {
                sb.append(((String) this.j0.get(i)) + "#");
            }
        }
        return sb.toString();
    }

    public final void z(int i, String str) {
        this.i0.set(i, str);
    }
}