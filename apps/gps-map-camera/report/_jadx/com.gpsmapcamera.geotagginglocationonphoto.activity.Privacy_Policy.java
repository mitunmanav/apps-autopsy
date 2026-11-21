package com.gpsmapcamera.geotagginglocationonphoto.activity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.bj;
import defpackage.cc7;
import defpackage.ke5;
import defpackage.le5;
import defpackage.lt1;
import defpackage.ub7;
import defpackage.z55;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Privacy_Policy extends bj implements View.OnClickListener {
    public static final /* synthetic */ int G = 0;
    public RelativeLayout B;
    public TextView C;
    public ProgressBar D;
    public WebView E;
    public boolean F = false;

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
            this.F = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.F = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.F = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_privacy_policy);
        View viewFindViewById = findViewById(R.id.homeLayout);
        z55 z55Var = new z55(3, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, z55Var);
        this.B = (RelativeLayout) findViewById(R.id.toolbar_back);
        ((RelativeLayout) findViewById(R.id.toolbar_done)).setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_title);
        this.C = textView;
        textView.setText(getString(R.string.nav_privacy_policy));
        if (getIntent().hasExtra("type") && Objects.equals(getIntent().getStringExtra("type"), "1")) {
            this.C.setText(getString(R.string.nav_term_of_use));
        }
        this.E = (WebView) findViewById(R.id.browser);
        this.D = (ProgressBar) findViewById(R.id.progress_bar);
        this.E.setWebChromeClient(new ke5(this));
        this.E.setWebViewClient(new le5());
        String string2 = getString(R.string.about_privacy_policy);
        if (Objects.equals(getIntent().getStringExtra("type"), "1")) {
            string2 = getString(R.string.about_term_of_use);
        }
        this.E.loadUrl(string2);
        this.B.setOnClickListener(this);
    }
}