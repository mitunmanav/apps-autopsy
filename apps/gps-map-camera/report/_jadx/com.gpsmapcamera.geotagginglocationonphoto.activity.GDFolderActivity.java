package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.a7;
import defpackage.af1;
import defpackage.al2;
import defpackage.b82;
import defpackage.bi3;
import defpackage.bj;
import defpackage.bl2;
import defpackage.c54;
import defpackage.c66;
import defpackage.cc7;
import defpackage.cd;
import defpackage.cl2;
import defpackage.dl2;
import defpackage.el2;
import defpackage.fl2;
import defpackage.hl2;
import defpackage.i41;
import defpackage.i49;
import defpackage.iu2;
import defpackage.jl2;
import defpackage.k41;
import defpackage.kea;
import defpackage.kg1;
import defpackage.l76;
import defpackage.lba;
import defpackage.lt1;
import defpackage.mk9;
import defpackage.mq7;
import defpackage.n8;
import defpackage.pn9;
import defpackage.pp2;
import defpackage.qj;
import defpackage.rm;
import defpackage.se2;
import defpackage.t17;
import defpackage.t51;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.uz0;
import defpackage.v60;
import defpackage.vm8;
import defpackage.w7;
import defpackage.wl1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class GDFolderActivity extends bj {
    public static final /* synthetic */ int N = 0;
    public uz0 B;
    public boolean C;
    public SP D;
    public GoogleSignInAccount F;
    public w7 G;
    public String H;
    public boolean I;
    public jl2 J;
    public Handler K;
    public mo1 L;
    public ArrayList E = new ArrayList();
    public final Admob M = new Admob();

    public final void A() {
        String string = x().getString(this, SP.GD_FOLDER_PATH, Default.DEFAULT_FOLDER_NAME);
        string.getClass();
        x().setString(this, SP.GD_FOLDER_PATH, this.H);
        if (bi3.b(this.H, string)) {
            v();
            return;
        }
        if (isFinishing()) {
            return;
        }
        v60 v60Var = new v60(this, R.style.AppBottomSheetDialogTheme);
        View viewInflate = getLayoutInflater().inflate(R.layout.bottomsheet_folder_path, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_folder_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_folder_path);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate.findViewById(R.id.card_done);
        textView.setText(this.H);
        textView2.setText(getString(R.string.google_drive) + "/GPS Map Camera/" + this.H);
        materialCardView.setOnClickListener(new cl2(v60Var, this));
        v60Var.show();
    }

    public final void B() {
        ArrayList arrayList = this.E;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (bi3.b(((b82) obj).i(), this.H)) {
                }
            }
            this.H = Default.DEFAULT_FOLDER_NAME;
            x().setString(this, SP.GD_FOLDER_PATH, Default.DEFAULT_FOLDER_NAME);
        } else {
            this.H = Default.DEFAULT_FOLDER_NAME;
            x().setString(this, SP.GD_FOLDER_PATH, Default.DEFAULT_FOLDER_NAME);
        }
        ((RecyclerView) u().c).setLayoutManager(new LinearLayoutManager(this, 1, false));
        ArrayList arrayList2 = this.E;
        tv5 tv5Var = new tv5(22, this);
        w7 w7Var = new w7(1);
        w7Var.e = arrayList2;
        w7Var.f = tv5Var;
        w7Var.d = new SP(this).getString(this, SP.GD_FOLDER_PATH, Default.DEFAULT_FOLDER_NAME);
        this.G = w7Var;
        ((RecyclerView) u().c).setAdapter(this.G);
        CPD.DismissDialog();
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        new HelperClass().SetLanguage(this);
        this.D = new SP(this);
        String string = x().getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 1;
        int i3 = 0;
        if (bi3.b(string, Default.DARK)) {
            this.C = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.C = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.C = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        lt1.a(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_gdfolder, (ViewGroup) null, false);
        int i4 = R.id.add_folder_recyclerview;
        RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.add_folder_recyclerview, viewInflate);
        if (recyclerView != null) {
            i4 = R.id.imgPro_img;
            ImageView imageView = (ImageView) pn9.a(R.id.imgPro_img, viewInflate);
            if (imageView != null) {
                i4 = R.id.line;
                View viewA = pn9.a(R.id.line, viewInflate);
                if (viewA != null) {
                    i4 = R.id.llPathShower;
                    if (((LinearLayout) pn9.a(R.id.llPathShower, viewInflate)) != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                        i4 = R.id.rel_adaptive_banner;
                        RelativeLayout relativeLayout2 = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                        if (relativeLayout2 != null) {
                            i4 = R.id.rlBtmAds;
                            if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                i4 = R.id.toolbar;
                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                if (viewA2 != null) {
                                    l76 l76VarA = l76.a(viewA2);
                                    i4 = R.id.toolbar_add_img;
                                    ImageView imageView2 = (ImageView) pn9.a(R.id.toolbar_add_img, viewInflate);
                                    if (imageView2 != null) {
                                        i4 = R.id.tvFolderPath;
                                        if (((TextView) pn9.a(R.id.tvFolderPath, viewInflate)) != null) {
                                            this.B = new uz0(relativeLayout, recyclerView, imageView, viewA, relativeLayout, relativeLayout2, l76VarA, imageView2, 1);
                                            setContentView((RelativeLayout) u().b);
                                            RelativeLayout relativeLayout3 = (RelativeLayout) u().f;
                                            al2 al2Var = new al2(this);
                                            WeakHashMap weakHashMap = cc7.a;
                                            ub7.c(relativeLayout3, al2Var);
                                            k().a(this, new n8(this, 9));
                                            ((TextView) ((l76) u().h).l).setText(getString(R.string.google_drive));
                                            ((RelativeLayout) ((l76) u().h).k).setVisibility(0);
                                            boolean z = x().getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) || x().getBoolean(this, HelperClass.IS_SUBSCRIBE, false) || x().getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false);
                                            this.I = z;
                                            if (z) {
                                                ((ImageView) u().d).setVisibility(8);
                                                ((ImageView) u().i).setVisibility(0);
                                            } else {
                                                ((ImageView) u().d).setVisibility(8);
                                                ((ImageView) u().i).setVisibility(0);
                                            }
                                            this.H = x().getString(this, SP.GD_FOLDER_PATH, Default.DEFAULT_FOLDER_NAME);
                                            jl2 jl2Var = new jl2();
                                            this.J = jl2Var;
                                            jl2Var.n0 = new pp2(25, this);
                                            ((ImageView) u().i).setOnClickListener(new fl2(this, i3));
                                            ((ImageView) u().d).setOnClickListener(new fl2(this, i2));
                                            ((RelativeLayout) ((l76) u().h).c).setOnClickListener(new fl2(this, 2));
                                            ((RelativeLayout) ((l76) u().h).k).setOnClickListener(new fl2(this, 3));
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
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.M;
        if (admob != null) {
            admob.DestroyAd();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.F = lba.b(this);
        if (AllAdsApproval.iSGDFolderBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            Admob admob = this.M;
            if (i == 9) {
                int i2 = RemoteAdData.GD_FOLDER_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    if (admob != null) {
                        admob.loadAdaptive_banner(this, (RelativeLayout) u().g, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                    }
                } else if (i2 == 2 && admob != null) {
                    admob.loadAdaptive_bannerAdax(this, (RelativeLayout) u().g, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                if (admob != null) {
                    admob.loadAdaptive_banner(this, (RelativeLayout) u().g, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                }
            } else if (i == 2 && admob != null) {
                admob.loadAdaptive_bannerAdax(this, (RelativeLayout) u().g, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            ((RelativeLayout) u().g).setVisibility(8);
        }
        if (this.F != null) {
            CPD.ShowDialog(this);
            mk9.g(kea.a(this), null, null, new hl2(this, null, 0), 3);
        }
    }

    public final void s() {
        if (isFinishing()) {
            return;
        }
        v60 v60Var = new v60(this, R.style.AppBottomSheetDialogTheme);
        View viewInflate = getLayoutInflater().inflate(R.layout.bottomsheet_pro_custom_folder, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate.findViewById(R.id.card_upgrade_pro);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_not_now);
        materialCardView.setOnClickListener(new cl2(this, v60Var));
        textView.setOnClickListener(new se2(v60Var, 1));
        v60Var.show();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (defpackage.mk9.i(r9, r10, r0) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (defpackage.mk9.i(r9, r10, r0) == r8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(b82 b82Var, int i, k41 k41Var) throws Throwable {
        dl2 dl2Var;
        if (k41Var instanceof dl2) {
            dl2Var = (dl2) k41Var;
            int i2 = dl2Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dl2Var.x = i2 - Integer.MIN_VALUE;
            } else {
                dl2Var = new dl2(this, k41Var);
            }
        } else {
            dl2Var = new dl2(this, k41Var);
        }
        Object obj = dl2Var.v;
        int i3 = dl2Var.x;
        int i4 = 0;
        int i5 = 2;
        i41 i41Var = null;
        t51 t51Var = t51.a;
        try {
            try {
                if (i3 == 0) {
                    i49.b(obj);
                    kg1 kg1Var = wl1.a;
                    af1 af1Var = af1.c;
                    cd cdVar = new cd(this, b82Var, i, (i41) null);
                    dl2Var.u = i;
                    dl2Var.x = 1;
                    if (mk9.i(af1Var, cdVar, dl2Var) != t51Var) {
                    }
                    return t51Var;
                }
                if (i3 == 1) {
                    i = dl2Var.u;
                    i49.b(obj);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        if (i3 != 4) {
                            qj.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = dl2Var.t;
                        i49.b(obj);
                        throw th;
                    }
                    i49.b(obj);
                }
                return t17.a;
                kg1 kg1Var2 = wl1.a;
                iu2 iu2Var = c54.a;
                el2 el2Var = new el2(i5, i41Var, i4);
                dl2Var.u = i;
                dl2Var.x = 2;
            } catch (Exception e) {
                e.printStackTrace();
                kg1 kg1Var3 = wl1.a;
                iu2 iu2Var2 = c54.a;
                el2 el2Var2 = new el2(i5, i41Var, i4);
                dl2Var.u = i;
                dl2Var.x = 3;
            }
        } catch (Throwable th2) {
            kg1 kg1Var4 = wl1.a;
            iu2 iu2Var3 = c54.a;
            el2 el2Var3 = new el2(i5, i41Var, i4);
            dl2Var.t = th2;
            dl2Var.u = i;
            dl2Var.x = 4;
            if (mk9.i(iu2Var3, el2Var3, dl2Var) != t51Var) {
                throw th2;
            }
        }
    }

    public final uz0 u() {
        uz0 uz0Var = this.B;
        if (uz0Var != null) {
            return uz0Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final void v() {
        int integer = x().getInteger(this, HelperClass.COUNTADS, 0);
        int i = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i) {
            integer = i;
        }
        if (!AllAdsApproval.iSGDFolderFS(this)) {
            finish();
            return;
        }
        int i2 = 1;
        if (integer >= RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler(Looper.getMainLooper()).postDelayed(new bl2(this, i2), 200L);
            this.K = new Handler(Looper.getMainLooper());
            w().postDelayed(new bl2(this, 2), 7000L);
            return;
        }
        x().setInteger(this, HelperClass.COUNTADS, integer + 1);
        finish();
    }

    public final Handler w() {
        Handler handler = this.K;
        if (handler != null) {
            return handler;
        }
        bi3.g("handler");
        throw null;
    }

    public final SP x() {
        SP sp = this.D;
        if (sp != null) {
            return sp;
        }
        bi3.g("mSP");
        throw null;
    }

    public final void y() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new vm8(26, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void z() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new rm(26, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}