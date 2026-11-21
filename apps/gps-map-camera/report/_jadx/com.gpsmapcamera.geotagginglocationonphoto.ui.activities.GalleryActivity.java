package com.gpsmapcamera.geotagginglocationonphoto.ui.activities;

import android.content.Context;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.ui.activities.GalleryActivity;
import defpackage.am2;
import defpackage.ap5;
import defpackage.b30;
import defpackage.bi3;
import defpackage.bj;
import defpackage.bm2;
import defpackage.bv0;
import defpackage.c54;
import defpackage.c6;
import defpackage.ca4;
import defpackage.ca6;
import defpackage.cc7;
import defpackage.cf2;
import defpackage.d63;
import defpackage.df2;
import defpackage.dm2;
import defpackage.dt3;
import defpackage.em2;
import defpackage.fd;
import defpackage.gb0;
import defpackage.hv0;
import defpackage.i41;
import defpackage.i6;
import defpackage.im2;
import defpackage.is0;
import defpackage.iv0;
import defpackage.jv4;
import defpackage.jw1;
import defpackage.k30;
import defpackage.kea;
import defpackage.kg1;
import defpackage.lt1;
import defpackage.m5;
import defpackage.mk9;
import defpackage.mm1;
import defpackage.mq7;
import defpackage.n8;
import defpackage.nj2;
import defpackage.nm2;
import defpackage.o82;
import defpackage.on5;
import defpackage.pc;
import defpackage.pm;
import defpackage.pm2;
import defpackage.qc;
import defpackage.qd3;
import defpackage.qm2;
import defpackage.qq5;
import defpackage.rm2;
import defpackage.ro6;
import defpackage.s78;
import defpackage.s7a;
import defpackage.sm2;
import defpackage.tl2;
import defpackage.ub7;
import defpackage.ul1;
import defpackage.um2;
import defpackage.ut5;
import defpackage.v60;
import defpackage.we2;
import defpackage.wl1;
import defpackage.wm2;
import defpackage.wn0;
import defpackage.xe2;
import defpackage.xe6;
import defpackage.xl2;
import defpackage.yl2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class GalleryActivity extends bj implements xe2 {
    public static boolean b0;
    public static boolean c0;
    public m5 B;
    public final ro6 C;
    public fd D;
    public cf2 E;
    public xe6 G;
    public xe6 H;
    public xe6 I;
    public int K;
    public final ro6 N;
    public final i6 O;
    public final i6 P;
    public boolean S;
    public pm T;
    public v60 U;
    public qd3 W;
    public v60 X;
    public v60 Y;
    public bv0 Z;
    public qc a0;
    public final ArrayList F = new ArrayList();
    public df2 J = new df2("");
    public int L = 1;
    public tl2 M = tl2.GRID_4X4;
    public jv4 Q = jv4.a;
    public final ul1 R = new ul1(this);
    public final Admob V = new Admob();

    public GalleryActivity() {
        final int i = 0;
        this.C = new ro6(new nj2(this) { // from class: vl2
            public final /* synthetic */ GalleryActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i2 = i;
                GalleryActivity galleryActivity = this.b;
                switch (i2) {
                    case 0:
                        boolean z = GalleryActivity.b0;
                        return new SP(galleryActivity);
                    default:
                        boolean z2 = GalleryActivity.b0;
                        return new is0(galleryActivity);
                }
            }
        });
        final int i2 = 1;
        this.N = new ro6(new nj2(this) { // from class: vl2
            public final /* synthetic */ GalleryActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i3 = i2;
                GalleryActivity galleryActivity = this.b;
                switch (i3) {
                    case 0:
                        boolean z = GalleryActivity.b0;
                        return new SP(galleryActivity);
                    default:
                        boolean z2 = GalleryActivity.b0;
                        return new is0(galleryActivity);
                }
            }
        });
        int i3 = 4;
        this.O = (i6) n(new bm2(this, i), new c6(i3));
        this.P = (i6) n(new bm2(this, 2), new c6(i3));
    }

    public static void B(qd3 qd3Var, int i) {
        ImageView imageView = (ImageView) qd3Var.f;
        ImageView imageView2 = (ImageView) qd3Var.g;
        ImageView imageView3 = (ImageView) qd3Var.d;
        if (i == 0) {
            imageView3.setVisibility(0);
            imageView3.setImageResource(R.drawable.duv1_ic_select_btn);
            imageView.setVisibility(4);
            imageView2.setVisibility(4);
            return;
        }
        if (i == 1) {
            imageView3.setVisibility(4);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.duv1_ic_select_btn);
            imageView2.setVisibility(4);
            return;
        }
        if (i != 2) {
            return;
        }
        imageView3.setVisibility(4);
        imageView.setVisibility(4);
        imageView2.setVisibility(0);
        imageView2.setImageResource(R.drawable.duv1_ic_select_btn);
    }

    public static void C(qd3 qd3Var, int i) {
        ImageView imageView = (ImageView) qd3Var.e;
        ImageView imageView2 = (ImageView) qd3Var.c;
        if (i == 0) {
            imageView2.setVisibility(0);
            imageView2.setImageResource(R.drawable.duv1_ic_select_btn);
            imageView.setVisibility(4);
        } else {
            if (i != 1) {
                return;
            }
            imageView2.setVisibility(4);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.duv1_ic_select_btn);
        }
    }

    public final void A() {
        ArrayList arrayListV = hv0.V(this.F);
        dt3 dt3VarA = kea.a(this);
        kg1 kg1Var = wl1.a;
        this.H = mk9.g(dt3VarA, c54.a, null, new nm2(this, arrayListV, null, 0), 2);
    }

    public final void D(jv4 jv4Var) {
        this.T = pm.w(getLayoutInflater());
        v60 v60Var = new v60(this, R.style.BottomSheetDialog);
        this.U = v60Var;
        pm pmVar = this.T;
        pmVar.getClass();
        v60Var.setContentView((RelativeLayout) pmVar.b);
        v60 v60Var2 = this.U;
        v60Var2.getClass();
        v60Var2.setCancelable(true);
        v60 v60Var3 = this.U;
        v60Var3.getClass();
        v60Var3.create();
        v60 v60Var4 = this.U;
        v60Var4.getClass();
        v60Var4.show();
        pm pmVar2 = this.T;
        if (pmVar2 != null) {
            RecyclerView recyclerView = (RecyclerView) pmVar2.c;
            TextView textView = (TextView) pmVar2.d;
            if (jv4Var == jv4.a) {
                textView.setText(getString(R.string.copy_to));
            } else {
                textView.setText(getString(R.string.move_to));
            }
            ap5 ap5Var = new ap5();
            ap5Var.a = new ArrayList();
            ap5 ap5Var2 = new ap5();
            we2 we2Var = new we2(this);
            ap5Var2.a = we2Var;
            we2Var.e = this;
            we2Var.f = jv4Var;
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setItemAnimator(new wm2(0));
            recyclerView.setAdapter((on5) ap5Var2.a);
            recyclerView.setNestedScrollingEnabled(true);
            dt3 dt3VarA = kea.a(this);
            kg1 kg1Var = wl1.a;
            mk9.g(dt3VarA, c54.a, null, new gb0(this, ap5Var, ap5Var2, (i41) null, 15), 2);
        }
    }

    public final void E(jv4 jv4Var) {
        this.Z = bv0.s(getLayoutInflater());
        pc pcVar = new pc(this, R.style.RoundedCornersDialog70);
        bv0 bv0Var = this.Z;
        pcVar.setView(bv0Var != null ? (LinearLayout) bv0Var.b : null);
        pcVar.a.m = false;
        qc qcVarCreate = pcVar.create();
        this.a0 = qcVarCreate;
        if (qcVarCreate != null) {
            qcVarCreate.show();
        }
        bv0 bv0Var2 = this.Z;
        if (bv0Var2 != null) {
            ((TextView) bv0Var2.f).setText(getString(jv4Var == jv4.a ? R.string.copying : R.string.moving));
            ((MaterialButton) bv0Var2.c).setOnClickListener(new b30(7, this, jv4Var));
        }
    }

    public final void F(View view) {
        if (view == null && (view = (EditText) ((SearchView) w().i).findViewById(R.id.search_src_text)) == null) {
            view = (SearchView) w().i;
        }
        view.post(new jw1(11, view, this));
    }

    public final void G() {
        m5 m5VarW = w();
        EditText editText = (EditText) ((SearchView) w().i).findViewById(R.id.search_src_text);
        ImageView imageView = (ImageView) ((SearchView) w().i).findViewById(R.id.search_mag_icon);
        ImageView imageView2 = (ImageView) ((SearchView) w().i).findViewById(R.id.search_close_btn);
        int color = getColor(this.S ? R.color.app_text_main_dark : R.color.app_text_main_light);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.duv2_ic_back);
            imageView.setColorFilter(color);
            imageView.setClickable(true);
            imageView.setFocusable(true);
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
            imageView.setBackgroundResource(typedValue.resourceId);
            imageView.setOnClickListener(new am2(this, 3));
        }
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.ic_selected_close);
            imageView2.setColorFilter(color);
            imageView2.setOnClickListener(new xl2(m5VarW, this));
        }
        if (this.S) {
            editText.setHintTextColor(getColor(R.color.hint_color_dark));
            editText.setTextColor(getColor(R.color.app_text_main_dark));
        } else {
            editText.setHintTextColor(getColor(R.color.hint_color_light));
            editText.setTextColor(getColor(R.color.app_text_main_light));
        }
        editText.setTextSize(20.0f);
        ((AppCompatImageView) m5VarW.s).setVisibility(0);
        m5VarW.f.setVisibility(8);
        ((SearchView) m5VarW.i).setVisibility(0);
        ((AppCompatImageView) m5VarW.r).setVisibility(8);
        ((AppCompatImageView) m5VarW.p).setVisibility(8);
    }

    @Override // defpackage.xe2
    public final void c(df2 df2Var, jv4 jv4Var) {
        GalleryActivity galleryActivity;
        jv4Var.getClass();
        this.Q = jv4Var;
        int iOrdinal = jv4Var.ordinal();
        i41 i41Var = null;
        int i = 0;
        if (iOrdinal == 0) {
            try {
                if (!s7a.j()) {
                    v().d0();
                    dt3 dt3VarA = kea.a(this);
                    kg1 kg1Var = wl1.a;
                    this.G = mk9.g(dt3VarA, c54.a, null, new gb0(this, jv4Var, df2Var, i41Var, 14), 2);
                    return;
                }
                this.J = df2Var;
                o82 o82Var = new o82((Context) this, df2Var.b);
                LinkedHashMap linkedHashMapJ = mm1.j(this);
                ArrayList arrayList = new ArrayList(linkedHashMapJ.size());
                Iterator it = linkedHashMapJ.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((List) ((Map.Entry) it.next()).getValue());
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                ArrayList arrayList3 = new ArrayList();
                if (arrayList2.size() > 0) {
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        List list = (List) obj;
                        list.getClass();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((Uri) it2.next());
                        }
                    }
                }
                if (!hv0.q(arrayList3, o82Var.c())) {
                    ul1.k(this.R, o82Var);
                    return;
                }
                dt3 dt3VarA2 = kea.a(this);
                kg1 kg1Var2 = wl1.a;
                this.G = mk9.g(dt3VarA2, c54.a, null, new im2(this, null), 2);
                return;
            } catch (Exception unused) {
                HelperClass.showSnackBar(w().b, getString(R.string.copy_failed));
                return;
            }
        }
        if (iOrdinal != 1) {
            mq7.d();
            return;
        }
        try {
            boolean zJ = s7a.j();
            ArrayList arrayList4 = this.F;
            if (zJ) {
                this.J = df2Var;
                pm2 pm2Var = new pm2(new ArrayList(), this, i);
                ArrayList arrayList5 = new ArrayList(iv0.d(arrayList4, 10));
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    arrayList5.add(((ca4) obj2).d);
                }
                MediaScannerConnection.scanFile(this, (String[]) arrayList5.toArray(new String[0]), null, pm2Var);
                ((is0) this.N.getValue()).b();
                return;
            }
            ArrayList arrayList6 = new ArrayList(iv0.d(arrayList4, 10));
            int size3 = arrayList4.size();
            while (i < size3) {
                Object obj3 = arrayList4.get(i);
                i++;
                arrayList6.add(new File(((ca4) obj3).d));
            }
            dt3 dt3VarA3 = kea.a(this);
            kg1 kg1Var3 = wl1.a;
            try {
                galleryActivity = this;
                try {
                    galleryActivity.H = mk9.g(dt3VarA3, c54.a, null, new wn0(this, jv4Var, df2Var, arrayList6, (i41) null), 2);
                } catch (Exception unused2) {
                    HelperClass.showSnackBar(galleryActivity.w().b, galleryActivity.getString(R.string.move_failed));
                }
            } catch (Exception unused3) {
                galleryActivity = this;
            }
        } catch (Exception unused4) {
            galleryActivity = this;
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        String string = y().getString(this, SP.APP_THEME, Default.LIGHT);
        int i3 = 16;
        int i4 = 1;
        int i5 = 0;
        if (bi3.b(string, Default.DARK)) {
            this.S = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.S = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.S = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        this.B = m5.a(getLayoutInflater());
        setContentView(w().b);
        RelativeLayout relativeLayout = w().b;
        bm2 bm2Var = new bm2(this, i4);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, bm2Var);
        s7a.a = false;
        s7a.b = false;
        dm2 dm2Var = new dm2(i5, this);
        ul1 ul1Var = this.R;
        ((ca6) ul1Var.d).c = new d63(i3, ul1Var, dm2Var);
        k().a(this, new n8(this, 10));
        this.K = y().getInteger(this, "sortBy", 0);
        this.L = y().getInteger(this, "sortType", 1);
        int integer = y().getInteger(this, "gridCount", 1);
        tl2.b.getClass();
        this.M = qq5.c(integer);
        m5 m5VarW = w();
        SearchView searchView = (SearchView) m5VarW.i;
        RelativeLayout relativeLayout2 = m5VarW.b;
        relativeLayout2.getClass();
        if (!relativeLayout2.isLaidOut() || relativeLayout2.isLayoutRequested()) {
            relativeLayout2.addOnLayoutChangeListener(new sm2(relativeLayout2));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Rect(0, 0, relativeLayout2.getWidth(), (int) (250.0f * relativeLayout2.getResources().getDisplayMetrics().density)));
            if (Build.VERSION.SDK_INT >= 29) {
                relativeLayout2.getSystemGestureExclusionRects().clear();
                relativeLayout2.setSystemGestureExclusionRects(arrayList);
            }
        }
        ((AppCompatImageView) m5VarW.p).setOnClickListener(new qm2(m5VarW, this));
        ((LinearLayout) m5VarW.j).setOnClickListener(new rm2(this, i5));
        ((AppCompatImageView) m5VarW.r).setOnClickListener(new rm2(this, i4));
        int i6 = 2;
        m5VarW.e.setOnClickListener(new rm2(this, i6));
        ((LinearLayout) m5VarW.m).setOnClickListener(new am2(this, 4));
        int i7 = 5;
        ((LinearLayout) m5VarW.n).setOnClickListener(new am2(this, i7));
        ((AppCompatImageView) m5VarW.t).setOnClickListener(new qm2(this, m5VarW));
        searchView.setOnQueryTextListener(new s78(26, m5VarW, this));
        searchView.setOnQueryTextFocusChangeListener(new k30(i7, this));
        int i8 = 3;
        searchView.setOnCloseListener(new bm2(this, i8));
        ((AppCompatImageView) m5VarW.s).setOnClickListener(new xl2(this, m5VarW, i5));
        fd fdVar = new fd();
        fdVar.f0 = this;
        this.D = fdVar;
        v().c0(this.M);
        this.E = new cf2();
        x().g0(this.M);
        v().b0 = this.K;
        v().c0 = this.L;
        m5 m5VarW2 = w();
        ViewPager2 viewPager2 = (ViewPager2) m5VarW2.u;
        viewPager2.setOrientation(0);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(new em2(this, iv0.b(x(), v())));
        ((ArrayList) viewPager2.c.b).add(new um2(this, m5VarW2));
        AppCompatImageView appCompatImageView = (AppCompatImageView) m5VarW2.q;
        int iOrdinal = this.M.ordinal();
        if (iOrdinal != 0) {
            i2 = iOrdinal != 1 ? R.drawable.ic_grid_5_5 : R.drawable.ic_grid_4_4;
        } else {
            i2 = R.drawable.ic_grid_3_3;
        }
        appCompatImageView.setImageResource(i2);
        appCompatImageView.setOnClickListener(new xl2(this, m5VarW2, i4));
        s(bundle != null ? bundle.getInt("selection", 0) : 0);
        ((LinearLayout) m5VarW2.l).setOnClickListener(new xl2(this, m5VarW2, i6));
        ((LinearLayout) m5VarW2.k).setOnClickListener(new xl2(this, m5VarW2, i8));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        xe6 xe6Var = this.G;
        if (xe6Var != null) {
            xe6Var.f(null);
        }
        xe6 xe6Var2 = this.I;
        if (xe6Var2 != null) {
            xe6Var2.f(null);
        }
        xe6 xe6Var3 = this.H;
        if (xe6Var3 != null) {
            xe6Var3.f(null);
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i = 1;
        int integer = y().getInteger(this, "gridCount", 1);
        tl2.b.getClass();
        tl2 tl2VarC = qq5.c(integer);
        this.M = tl2VarC;
        if (tl2VarC == tl2.GRID_5X5) {
            ((AppCompatImageView) w().q).setImageResource(R.drawable.ic_grid_5_5);
        } else if (tl2VarC == tl2.GRID_4X4) {
            ((AppCompatImageView) w().q).setImageResource(R.drawable.ic_grid_4_4);
        } else {
            ((AppCompatImageView) w().q).setImageResource(R.drawable.ic_grid_3_3);
        }
        v().c0(this.M);
        x().g0(this.M);
        if (AllAdsApproval.isCollectionGalleryBanner(this)) {
            int i2 = RemoteAdData.ADS_NETWORK_TYPE;
            Admob admob = this.V;
            if (i2 == 9) {
                int i3 = RemoteAdData.COLLECTION_GALLERY_SCREEN_BANNER_TYPE;
                if (i3 == 1) {
                    admob.loadAdaptive_banner(this, w().d, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
                } else if (i3 == 2) {
                    admob.loadAdaptive_bannerAdax(this, w().d, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i2 == 1) {
                admob.loadAdaptive_banner(this, w().d, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
            } else if (i2 == 2) {
                admob.loadAdaptive_bannerAdax(this, w().d, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            w().d.setVisibility(8);
        }
        if (c0) {
            ((SearchView) w().i).post(new yl2(this, i));
            c0 = false;
        }
    }

    @Override // defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("selection", ((ViewPager2) w().u).getCurrentItem());
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onStop() {
        super.onStop();
        s7a.i(this, (SearchView) w().i);
        ((SearchView) w().i).clearFocus();
    }

    public final void s(int i) {
        m5 m5VarW = w();
        LinearLayout linearLayout = (LinearLayout) m5VarW.k;
        LinearLayout linearLayout2 = (LinearLayout) m5VarW.l;
        TextView textView = m5VarW.h;
        TextView textView2 = m5VarW.g;
        if (i == 0) {
            linearLayout2.setSelected(false);
            linearLayout.setSelected(true);
            linearLayout.setBackground(getDrawable(R.drawable.bg_tab));
            linearLayout2.setBackground(null);
            if (this.S) {
                textView.setTextColor(getColor(R.color.app_text_main_dark));
                textView2.setTextColor(getColor(R.color.app_text_sub_main_dark));
            } else {
                textView.setTextColor(getColor(R.color.app_text_main_light));
                textView2.setTextColor(getColor(R.color.app_text_sub_main_light));
            }
            textView.setTypeface(ut5.a(this, R.font.rubik_medium));
            textView2.setTypeface(ut5.a(this, R.font.rubik_regular));
            return;
        }
        if (i != 1) {
            return;
        }
        linearLayout2.setSelected(true);
        linearLayout.setSelected(false);
        linearLayout2.setBackground(getDrawable(R.drawable.bg_tab));
        linearLayout.setBackground(null);
        if (this.S) {
            textView2.setTextColor(getColor(R.color.app_text_main_dark));
            textView.setTextColor(getColor(R.color.app_text_sub_main_dark));
        } else {
            textView2.setTextColor(getColor(R.color.app_text_main_light));
            textView.setTextColor(getColor(R.color.app_text_sub_main_light));
        }
        textView2.setTypeface(ut5.a(this, R.font.rubik_medium));
        textView.setTypeface(ut5.a(this, R.font.rubik_regular));
    }

    public final void t() {
        m5 m5VarW = w();
        SearchView searchView = (SearchView) m5VarW.i;
        s7a.i(this, searchView);
        searchView.clearFocus();
        searchView.setQuery("", true);
        searchView.setVisibility(8);
        ((AppCompatImageView) m5VarW.r).setVisibility(0);
        m5VarW.f.setVisibility(0);
        ((AppCompatImageView) m5VarW.s).setVisibility(0);
        ((AppCompatImageView) m5VarW.q).setVisibility(0);
        ((AppCompatImageView) m5VarW.p).setVisibility(0);
        b0 = false;
    }

    public final void u() {
        qc qcVar = this.a0;
        if (qcVar != null) {
            qcVar.dismiss();
        }
    }

    public final fd v() {
        fd fdVar = this.D;
        if (fdVar != null) {
            return fdVar;
        }
        bi3.g("allImagesFragment");
        throw null;
    }

    public final m5 w() {
        m5 m5Var = this.B;
        return m5Var == null ? m5.a(getLayoutInflater()) : m5Var;
    }

    public final cf2 x() {
        cf2 cf2Var = this.E;
        if (cf2Var != null) {
            return cf2Var;
        }
        bi3.g("foldersFragment");
        throw null;
    }

    public final SP y() {
        return (SP) this.C.getValue();
    }

    public final void z() {
        m5 m5VarW = w();
        ((AppCompatImageView) m5VarW.s).setVisibility(8);
        m5VarW.f.setVisibility(0);
        SearchView searchView = (SearchView) m5VarW.i;
        searchView.setVisibility(8);
        ((AppCompatImageView) m5VarW.r).setVisibility(0);
        ((AppCompatImageView) m5VarW.p).setVisibility(0);
        ((AppCompatImageView) m5VarW.q).setVisibility(0);
        searchView.setQuery("", true);
    }
}