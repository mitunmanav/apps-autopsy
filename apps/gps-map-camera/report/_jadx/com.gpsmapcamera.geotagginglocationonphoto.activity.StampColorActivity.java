package com.gpsmapcamera.geotagginglocationonphoto.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.model.ColorModel;
import defpackage.ad3;
import defpackage.bj;
import defpackage.cc7;
import defpackage.jb5;
import defpackage.lt1;
import defpackage.n8;
import defpackage.nv0;
import defpackage.ub7;
import defpackage.z55;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StampColorActivity extends bj implements View.OnClickListener {
    public static final /* synthetic */ int M = 0;
    public RecyclerView B;
    public TextView C;
    public RelativeLayout D;
    public SP F;
    public nv0 G;
    public boolean H;
    public boolean I;
    public Admob J;
    public RelativeLayout K;
    public final ArrayList E = new ArrayList();
    public boolean L = false;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.toolbar_back) {
            k().c();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.F = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 0;
        if (string.equals(Default.DARK)) {
            this.L = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.L = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.L = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_stamp_color);
        this.B = (RecyclerView) findViewById(R.id.rv_stamp_color);
        this.C = (TextView) findViewById(R.id.tv_toolbar_title);
        this.D = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.C.setText(getString(R.string.stamp_color));
        new TempletSettingActivity();
        SP sp2 = new SP(this);
        this.F = sp2;
        this.I = (sp2.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) || this.F.getBoolean(this, HelperClass.IS_SUBSCRIBE, false)) || this.F.getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false);
        this.H = this.F.getBoolean(this, SP.COMPASS_FOUND, false);
        int integer = this.F.getInteger(this, SP.TEMPLATE_TYPE, 0);
        ArrayList arrayList = this.E;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                arrayList.clear();
            }
            ColorModel colorModel = new ColorModel();
            jb5.s(this, R.string.background_color, colorModel, "Background Color");
            colorModel.setColor(this.F.getInteger(this, colorModel.getSpKey(), Color.parseColor("#9c000000")));
            arrayList.add(colorModel);
            if (integer == 2) {
                ColorModel colorModel2 = new ColorModel();
                jb5.s(this, R.string.re_background_color, colorModel2, "report_bg_color");
                colorModel2.setColor(this.F.getInteger(this, colorModel2.getSpKey(), Default.RBG_COLOR));
                arrayList.add(colorModel2);
            }
            if (integer == 3) {
                ColorModel colorModel3 = new ColorModel();
                jb5.s(this, R.string.orlabel_bgcolor, colorModel3, "ORLabel_BG_Color");
                colorModel3.setColor(this.F.getInteger(this, colorModel3.getSpKey(), Color.parseColor("#747474")));
                arrayList.add(colorModel3);
            }
            ColorModel colorModel4 = new ColorModel();
            jb5.s(this, R.string.short_address, colorModel4, "Short Address Color");
            jb5.t(colorModel4, this.F, this, -1);
            arrayList.add(colorModel4);
            ColorModel colorModel5 = new ColorModel();
            jb5.s(this, R.string.address, colorModel5, "Address Color");
            jb5.t(colorModel5, this.F, this, -1);
            arrayList.add(colorModel5);
            ColorModel colorModel6 = new ColorModel();
            jb5.s(this, R.string.lat_lng, colorModel6, "Lat/Long Color");
            jb5.t(colorModel6, this.F, this, -1);
            arrayList.add(colorModel6);
            if (integer != 4 && integer != 5) {
                ColorModel colorModel7 = new ColorModel();
                jb5.s(this, R.string.plus_code, colorModel7, "PlusCode Color");
                jb5.t(colorModel7, this.F, this, -1);
                arrayList.add(colorModel7);
            }
            ColorModel colorModel8 = new ColorModel();
            jb5.s(this, R.string.date_and_time, colorModel8, "Date & Time Color");
            jb5.t(colorModel8, this.F, this, -1);
            arrayList.add(colorModel8);
            if (integer != 4 && integer != 5) {
                ColorModel colorModel9 = new ColorModel();
                jb5.s(this, R.string.numbering, colorModel9, "Numbering Color");
                jb5.t(colorModel9, this.F, this, -1);
                arrayList.add(colorModel9);
            }
            ColorModel colorModel10 = new ColorModel();
            jb5.s(this, R.string.notes_hastag, colorModel10, "Note & Hashtage Color");
            jb5.t(colorModel10, this.F, this, -1);
            arrayList.add(colorModel10);
            if (integer != 5) {
                ColorModel colorModel11 = new ColorModel();
                jb5.s(this, R.string.person_name, colorModel11, "Person_Name_Color");
                jb5.t(colorModel11, this.F, this, -1);
                arrayList.add(colorModel11);
                ColorModel colorModel12 = new ColorModel();
                jb5.s(this, R.string.contact_number, colorModel12, "Contact_Number_Color");
                jb5.t(colorModel12, this.F, this, -1);
                arrayList.add(colorModel12);
                ColorModel colorModel13 = new ColorModel();
                jb5.s(this, R.string.weather, colorModel13, "Weather Color");
                jb5.t(colorModel13, this.F, this, -1);
                arrayList.add(colorModel13);
                if (this.H) {
                    ColorModel colorModel14 = new ColorModel();
                    jb5.s(this, R.string.compass, colorModel14, "Compass Color");
                    jb5.t(colorModel14, this.F, this, -1);
                    arrayList.add(colorModel14);
                    if (integer != 4) {
                        ColorModel colorModel15 = new ColorModel();
                        jb5.s(this, R.string.magnetic_field, colorModel15, "Magnetic Field Color");
                        jb5.t(colorModel15, this.F, this, -1);
                        arrayList.add(colorModel15);
                    }
                }
                if (integer != 4) {
                    ColorModel colorModel16 = new ColorModel();
                    jb5.s(this, R.string.wind, colorModel16, "Wind Color");
                    jb5.t(colorModel16, this.F, this, -1);
                    arrayList.add(colorModel16);
                    ColorModel colorModel17 = new ColorModel();
                    jb5.s(this, R.string.humidity, colorModel17, "Humidity Color");
                    jb5.t(colorModel17, this.F, this, -1);
                    arrayList.add(colorModel17);
                    ColorModel colorModel18 = new ColorModel();
                    jb5.s(this, R.string.pressure, colorModel18, "Pressure Color");
                    jb5.t(colorModel18, this.F, this, -1);
                    arrayList.add(colorModel18);
                }
                ColorModel colorModel19 = new ColorModel();
                jb5.s(this, R.string.altitude, colorModel19, "Altitude Color");
                jb5.t(colorModel19, this.F, this, -1);
                arrayList.add(colorModel19);
                if (integer != 4) {
                    ColorModel colorModel20 = new ColorModel();
                    jb5.s(this, R.string.accuracy, colorModel20, "Accuracy Color");
                    jb5.t(colorModel20, this.F, this, -1);
                    arrayList.add(colorModel20);
                }
                if (integer == 2) {
                    ColorModel colorModel21 = new ColorModel();
                    jb5.s(this, R.string.reporting_tag, colorModel21, "report_tag_color");
                    jb5.t(colorModel21, this.F, this, -1);
                    arrayList.add(colorModel21);
                }
                if (integer != 4) {
                    ColorModel colorModel22 = new ColorModel();
                    jb5.s(this, R.string.sound_level, colorModel22, "SoundLevel Color");
                    jb5.t(colorModel22, this.F, this, -1);
                    arrayList.add(colorModel22);
                }
                if (integer == 3) {
                    ColorModel colorModel23 = new ColorModel();
                    jb5.s(this, R.string.azimuth, colorModel23, "Azimuth_Color");
                    jb5.t(colorModel23, this.F, this, -1);
                    arrayList.add(colorModel23);
                    ColorModel colorModel24 = new ColorModel();
                    jb5.s(this, R.string.aqilevel, colorModel24, "AQILevel_Color");
                    jb5.t(colorModel24, this.F, this, -1);
                    arrayList.add(colorModel24);
                    ColorModel colorModel25 = new ColorModel();
                    jb5.s(this, R.string.orlabel, colorModel25, "ORLabel_Text_Color");
                    jb5.t(colorModel25, this.F, this, -1);
                    arrayList.add(colorModel25);
                }
            }
        }
        this.B.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ad3 ad3Var = new ad3(20, this);
        nv0 nv0Var = new nv0(i2);
        nv0Var.d = arrayList;
        nv0Var.e = ad3Var;
        SP sp3 = new SP(this);
        if (!sp3.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) && !sp3.getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false)) {
            sp3.getBoolean(this, HelperClass.IS_SUBSCRIBE, false);
        }
        this.G = nv0Var;
        this.B.setAdapter(nv0Var);
        this.D.setOnClickListener(this);
        k().a(this, new n8(this, 27));
        this.J = new Admob();
        this.K = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
        View viewFindViewById = findViewById(R.id.homeLayout);
        z55 z55Var = new z55(14, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, z55Var);
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.J;
        if (admob != null) {
            admob.DestroyAd();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!AllAdsApproval.iSStampColorBanner(this)) {
            this.K.setVisibility(8);
            return;
        }
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        if (i != 9) {
            if (i == 1) {
                this.J.loadAdaptive_banner(this, this.K, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                return;
            } else {
                if (i == 2) {
                    this.J.loadAdaptive_bannerAdax(this, this.K, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i2 = RemoteAdData.STAMP_COLOR_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            this.J.loadAdaptive_banner(this, this.K, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            this.J.loadAdaptive_bannerAdax(this, this.K, RemoteAdData.ADAX_BANNER_ID);
        }
    }
}