package com.gpsmapcamera.geotagginglocationonphoto.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.ab2;
import defpackage.bj;
import defpackage.cc7;
import defpackage.da9;
import defpackage.eq6;
import defpackage.er3;
import defpackage.gb2;
import defpackage.gq5;
import defpackage.lda;
import defpackage.lt1;
import defpackage.nv0;
import defpackage.nz0;
import defpackage.oa2;
import defpackage.te9;
import defpackage.ub7;
import defpackage.x32;
import defpackage.yea;
import defpackage.za2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MoreAppsActivity extends bj implements View.OnClickListener {
    public static final /* synthetic */ int G = 0;
    public ProgressBar B;
    public RelativeLayout C;
    public RecyclerView D;
    public ArrayList E;
    public boolean F;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.toolbar_back) {
            finish();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        ArrayList arrayList;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        String string = new SP(this).getString(this, SP.APP_THEME, Default.LIGHT);
        boolean z = false;
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
        setContentView(R.layout.activity_our_apps);
        View viewFindViewById = findViewById(R.id.homeLayout);
        x32 x32Var = new x32(26, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, x32Var);
        this.C = (RelativeLayout) findViewById(R.id.toolbar_back);
        ((RelativeLayout) findViewById(R.id.toolbar_done)).setVisibility(8);
        ((TextView) findViewById(R.id.tv_toolbar_title)).setText(getString(R.string.nav_our_apps));
        this.D = (RecyclerView) findViewById(R.id.recycler_other_apps);
        this.B = (ProgressBar) findViewById(R.id.moreApp_pb);
        ArrayList arrayList2 = this.E;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.B.setVisibility(0);
            this.E = new ArrayList();
            synchronized (oa2.j) {
                arrayList = new ArrayList(oa2.k.values());
            }
            if (!arrayList.isEmpty()) {
                ab2 ab2VarC = ((gq5) oa2.c().b(gq5.class)).c();
                gb2 gb2Var = new gb2();
                gb2Var.a(3600L);
                te9.c(new nz0(2, ab2VarC, new gb2(gb2Var)), ab2VarC.c);
                ab2VarC.d();
                yea yeaVarO = ab2VarC.a().o(ab2VarC.c, new za2(ab2VarC));
                da9 da9Var = new da9(eq6.a, new er3(this, ab2VarC, 4, z));
                yeaVarO.b.u(da9Var);
                lda.j(this).k(da9Var);
                yeaVarO.u();
            }
        } else {
            s();
        }
        this.C.setOnClickListener(this);
    }

    public final void s() {
        this.D.setLayoutManager(new GridLayoutManager(this, 2));
        this.D.setNestedScrollingEnabled(false);
        ArrayList arrayList = this.E;
        nv0 nv0Var = new nv0(4);
        new HelperClass();
        nv0Var.e = this;
        nv0Var.d = arrayList;
        this.D.setAdapter(nv0Var);
        this.B.setVisibility(8);
    }
}