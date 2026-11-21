package com.gpsmapcamera.geotagginglocationonphoto.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.bj;
import defpackage.cc7;
import defpackage.lt1;
import defpackage.n8;
import defpackage.o30;
import defpackage.ub7;
import defpackage.y30;
import defpackage.z55;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Send_An_Error extends bj implements View.OnClickListener {
    public static final /* synthetic */ int I = 0;
    public RelativeLayout B;
    public RelativeLayout C;
    public Button D;
    public TextView E;
    public TextView F;
    public EditText G;
    public boolean H = false;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.toolbar_back) {
            finish();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        String string = new SP(this).getString(this, SP.APP_THEME, Default.LIGHT);
        if (string.equals(Default.DARK)) {
            this.H = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.H = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.H = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_send_an_error);
        this.B = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.C = (RelativeLayout) findViewById(R.id.toolbar_done);
        this.D = (Button) findViewById(R.id.btnSent);
        this.C.setVisibility(8);
        this.E = (TextView) findViewById(R.id.tv_toolbar_title);
        this.G = (EditText) findViewById(R.id.ed_errormsg);
        this.F = (TextView) findViewById(R.id.tv_char_count);
        this.E.setText(getString(R.string.send_an_error));
        this.D.setEnabled(false);
        this.F.setText("0/500");
        this.G.addTextChangedListener(new y30(14, this));
        this.B.setOnClickListener(this);
        this.D.setOnClickListener(new o30(6, this));
        k().a(this, new n8(this, 24));
        View viewFindViewById = findViewById(R.id.mainView);
        z55 z55Var = new z55(9, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, z55Var);
    }
}