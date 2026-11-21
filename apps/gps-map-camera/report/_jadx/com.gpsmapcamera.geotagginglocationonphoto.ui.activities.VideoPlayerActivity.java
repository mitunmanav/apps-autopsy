package com.gpsmapcamera.geotagginglocationonphoto.ui.activities;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alexvasilkov.gestures.GestureFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.ui.activities.VideoPlayerActivity;
import com.gpsmapcamera.geotagginglocationonphoto.video_player.MediaSideScroll;
import com.gpsmapcamera.geotagginglocationonphoto.video_player.MySeekBar;
import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.Annotation;
import com.itextpdf.text.pdf.ColumnText;
import defpackage.bb4;
import defpackage.bi3;
import defpackage.bp6;
import defpackage.c12;
import defpackage.c54;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.cu0;
import defpackage.d00;
import defpackage.d12;
import defpackage.d65;
import defpackage.dk2;
import defpackage.dq9;
import defpackage.dt3;
import defpackage.el2;
import defpackage.f12;
import defpackage.f36;
import defpackage.gh1;
import defpackage.ha5;
import defpackage.hh1;
import defpackage.i77;
import defpackage.ig1;
import defpackage.j12;
import defpackage.ja4;
import defpackage.k10;
import defpackage.k12;
import defpackage.kd1;
import defpackage.kea;
import defpackage.kg1;
import defpackage.kh1;
import defpackage.l96;
import defpackage.la4;
import defpackage.lf1;
import defpackage.lt1;
import defpackage.ma4;
import defpackage.mk9;
import defpackage.mz;
import defpackage.n71;
import defpackage.na4;
import defpackage.o6;
import defpackage.oa7;
import defpackage.oq5;
import defpackage.p4a;
import defpackage.pa4;
import defpackage.ph1;
import defpackage.pl0;
import defpackage.pq6;
import defpackage.q02;
import defpackage.qa4;
import defpackage.ra4;
import defpackage.rf1;
import defpackage.ro6;
import defpackage.s7a;
import defpackage.sa7;
import defpackage.tp5;
import defpackage.u02;
import defpackage.u83;
import defpackage.ua7;
import defpackage.ub7;
import defpackage.uz0;
import defpackage.v95;
import defpackage.va4;
import defpackage.wa7;
import defpackage.wd1;
import defpackage.wh3;
import defpackage.wl1;
import defpackage.wr;
import defpackage.x71;
import defpackage.x92;
import defpackage.yb4;
import defpackage.z2;
import defpackage.z83;
import defpackage.zf9;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class VideoPlayerActivity extends d00 implements SeekBar.OnSeekBarChangeListener, TextureView.SurfaceTextureListener {
    public static final /* synthetic */ int b0 = 0;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public long T;
    public ph1 U;
    public d12 V;
    public final ro6 G = new ro6(new oa7(this, 1));
    public final ro6 H = new ro6(new oa7(this, 2));
    public final long I = 100;
    public final Point W = new Point(0, 0);
    public final Handler X = new Handler();
    public final Handler Y = new Handler(Looper.getMainLooper());
    public final ro6 Z = new ro6(new oa7(this, 3));
    public final Admob a0 = new Admob();

    public final void A() {
        d12 d12Var;
        ((ImageView) t().g.i).setImageResource(R.drawable.ic_play_outline_vector);
        if (this.V == null) {
            return;
        }
        this.K = false;
        if (!w() && (d12Var = this.V) != null) {
            d12Var.F(false);
        }
        getWindow().clearFlags(128);
    }

    public final void B() {
        ((ImageView) t().g.i).setImageResource(R.drawable.ic_pause_outline_vector);
        if (this.V == null) {
            return;
        }
        if (w()) {
            C(0);
        }
        this.L = true;
        this.K = true;
        d12 d12Var = this.V;
        if (d12Var != null) {
            d12Var.F(true);
        }
        getWindow().addFlags(128);
    }

    public final void C(int i) {
        d12 d12Var = this.V;
        if (d12Var != null) {
            d12Var.A(d12Var.g(), ((long) i) * 1000, false);
        }
        ((MySeekBar) t().g.g).setProgress(i);
        ((TextView) t().g.c).setText(s7a.f(i));
    }

    public final void D() {
        boolean z = this.K;
        this.K = !z;
        if (z) {
            A();
        } else {
            B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    @Override // defpackage.d00, defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String lastPathSegment;
        int i2;
        int iC;
        Drawable icon;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        String string = ((SP) this.H.getValue()).getString(this, SP.APP_THEME, Default.LIGHT);
        int i3 = 16;
        if (bi3.b(string, Default.DARK)) {
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        RelativeLayout relativeLayout = t().a;
        ua7 ua7Var = new ua7(this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, ua7Var);
        GestureFrameLayout gestureFrameLayout = t().j;
        final int i4 = 0;
        oa7 oa7Var = new oa7(this, i4);
        ViewTreeObserver viewTreeObserver = gestureFrameLayout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new x71(gestureFrameLayout, oa7Var));
        }
        final int i5 = 1;
        if (getResources().getConfiguration().orientation == 1 || !p4a.d(this)) {
            t().k.setPadding(0, 0, 0, 0);
        } else if ((p4a.d(this) ? p4a.e(this).x : 0) > 0) {
            t().k.setPadding(0, 0, p4a.d(this) ? p4a.e(this).x : 0, 0);
        } else {
            t().k.setPadding(0, 0, 0, 0);
        }
        ((MySeekBar) t().g.g).setColors(-1, getColor(R.color.white_light), getColor(R.color.black_light));
        o6 o6VarT = t();
        MaterialToolbar materialToolbar = o6VarT.k;
        materialToolbar.setTitleTextColor(-1);
        Resources resources = materialToolbar.getResources();
        resources.getClass();
        materialToolbar.setOverflowIcon(p4a.b(resources, R.drawable.ic_more));
        Resources resources2 = materialToolbar.getResources();
        resources2.getClass();
        materialToolbar.setNavigationIcon(p4a.b(resources2, R.drawable.ic_back_arrow));
        MaterialToolbar materialToolbar2 = o6VarT.k;
        Menu menu = materialToolbar2.getMenu();
        if (menu != null) {
            Color.red(R.color.statusbar_color_light);
            Color.green(R.color.statusbar_color_light);
            Color.blue(R.color.statusbar_color_light);
            int size = menu.size();
            for (int i6 = 0; i6 < size; i6++) {
                try {
                    MenuItem item = menu.getItem(i6);
                    if (item != null && (icon = item.getIcon()) != null) {
                        icon.setTint(-1);
                    }
                } catch (Exception unused) {
                }
            }
        }
        materialToolbar2.setOnMenuItemClickListener(new ua7(this));
        final int i7 = 4;
        materialToolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: pa7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i7;
                VideoPlayerActivity videoPlayerActivity = this.b;
                switch (i8) {
                    case 0:
                        int i9 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(false);
                        break;
                    case 1:
                        int i10 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(true);
                        break;
                    case 2:
                        int i11 = VideoPlayerActivity.b0;
                        videoPlayerActivity.D();
                        break;
                    case 3:
                        int i12 = VideoPlayerActivity.b0;
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        int i13 = VideoPlayerActivity.b0;
                        videoPlayerActivity.finish();
                        break;
                }
            }
        });
        MaterialToolbar materialToolbar3 = t().k;
        ro6 ro6Var = this.Z;
        Uri uri = (Uri) ro6Var.getValue();
        File file = x92.a;
        uri.getClass();
        if (bi3.b(uri.getScheme(), Annotation.FILE)) {
            lastPathSegment = new File(uri.toString()).getName();
            lastPathSegment.getClass();
        } else {
            try {
                Cursor cursorQuery = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            lastPathSegment = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            lastPathSegment = null;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            dq9.a(cursorQuery, th);
                            throw th2;
                        }
                    }
                } else {
                    lastPathSegment = null;
                }
            } catch (Exception unused2) {
            }
            if (lastPathSegment == null && (lastPathSegment = uri.getLastPathSegment()) == null) {
                lastPathSegment = "";
            }
        }
        materialToolbar3.setTitle(lastPathSegment);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        if (displayMetrics.widthPixels - displayMetrics2.widthPixels <= 0 && displayMetrics.heightPixels - displayMetrics2.heightPixels <= 0) {
            i2 = 0;
            iC = 0;
        } else if (getResources().getConfiguration().orientation == 1) {
            iC = p4a.c(this);
            i2 = 0;
        } else {
            i2 = p4a.d(this) ? p4a.e(this).x : 0;
            iC = p4a.c(this);
        }
        uz0 uz0Var = t().g;
        RelativeLayout relativeLayout2 = (RelativeLayout) uz0Var.h;
        MySeekBar mySeekBar = (MySeekBar) uz0Var.g;
        relativeLayout2.setPadding(0, 0, i2, iC);
        mySeekBar.setOnSeekBarChangeListener(this);
        mySeekBar.setMax(this.P);
        ((TextView) uz0Var.d).setText(s7a.f(this.P));
        ((TextView) uz0Var.c).setText(s7a.f(this.O));
        runOnUiThread(new d65(i3, this));
        p4a.g(this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: va7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i8) {
                int i9 = VideoPlayerActivity.b0;
                this.a.y((i8 & 4) != 0);
            }
        });
        o6 o6VarT2 = t();
        uz0 uz0Var2 = o6VarT2.g;
        GestureFrameLayout gestureFrameLayout2 = o6VarT2.j;
        ((TextView) uz0Var2.c).setOnClickListener(new View.OnClickListener(this) { // from class: pa7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i4;
                VideoPlayerActivity videoPlayerActivity = this.b;
                switch (i8) {
                    case 0:
                        int i9 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(false);
                        break;
                    case 1:
                        int i10 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(true);
                        break;
                    case 2:
                        int i11 = VideoPlayerActivity.b0;
                        videoPlayerActivity.D();
                        break;
                    case 3:
                        int i12 = VideoPlayerActivity.b0;
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        int i13 = VideoPlayerActivity.b0;
                        videoPlayerActivity.finish();
                        break;
                }
            }
        });
        ((TextView) uz0Var2.d).setOnClickListener(new View.OnClickListener(this) { // from class: pa7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i5;
                VideoPlayerActivity videoPlayerActivity = this.b;
                switch (i8) {
                    case 0:
                        int i9 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(false);
                        break;
                    case 1:
                        int i10 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(true);
                        break;
                    case 2:
                        int i11 = VideoPlayerActivity.b0;
                        videoPlayerActivity.D();
                        break;
                    case 3:
                        int i12 = VideoPlayerActivity.b0;
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        int i13 = VideoPlayerActivity.b0;
                        videoPlayerActivity.finish();
                        break;
                }
            }
        });
        final int i8 = 2;
        ((ImageView) uz0Var2.i).setOnClickListener(new View.OnClickListener(this) { // from class: pa7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = i8;
                VideoPlayerActivity videoPlayerActivity = this.b;
                switch (i9) {
                    case 0:
                        int i10 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(false);
                        break;
                    case 1:
                        int i11 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(true);
                        break;
                    case 2:
                        int i12 = VideoPlayerActivity.b0;
                        videoPlayerActivity.D();
                        break;
                    case 3:
                        int i13 = VideoPlayerActivity.b0;
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        int i14 = VideoPlayerActivity.b0;
                        videoPlayerActivity.finish();
                        break;
                }
            }
        });
        final int i9 = 3;
        gestureFrameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: pa7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i9;
                VideoPlayerActivity videoPlayerActivity = this.b;
                switch (i10) {
                    case 0:
                        int i11 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(false);
                        break;
                    case 1:
                        int i12 = VideoPlayerActivity.b0;
                        videoPlayerActivity.x(true);
                        break;
                    case 2:
                        int i13 = VideoPlayerActivity.b0;
                        videoPlayerActivity.D();
                        break;
                    case 3:
                        int i14 = VideoPlayerActivity.b0;
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        int i15 = VideoPlayerActivity.b0;
                        videoPlayerActivity.finish();
                        break;
                }
            }
        });
        gestureFrameLayout2.getController().B.e = true;
        final GestureDetector gestureDetector = new GestureDetector(this, new pl0(i7, this));
        t().j.setOnTouchListener(new View.OnTouchListener() { // from class: qa7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i10 = VideoPlayerActivity.b0;
                motionEvent.getClass();
                int actionMasked = motionEvent.getActionMasked();
                VideoPlayerActivity videoPlayerActivity = this.a;
                int i11 = 0;
                if (actionMasked == 0) {
                    videoPlayerActivity.R = motionEvent.getRawX();
                    videoPlayerActivity.S = motionEvent.getRawY();
                    System.currentTimeMillis();
                    d12 d12Var = videoPlayerActivity.V;
                    videoPlayerActivity.T = d12Var != null ? d12Var.h() : 0L;
                } else if (actionMasked == 1) {
                    if (videoPlayerActivity.M) {
                        if (videoPlayerActivity.J) {
                            View[] viewArr = {(TextView) videoPlayerActivity.t().g.c, (MySeekBar) videoPlayerActivity.t().g.g, (TextView) videoPlayerActivity.t().g.d};
                            for (int i12 = 0; i12 < 3; i12++) {
                                viewArr[i12].animate().alpha(ColumnText.GLOBAL_SPACE_CHAR_RATIO).start();
                            }
                        }
                        if (!videoPlayerActivity.K) {
                            videoPlayerActivity.D();
                        }
                    }
                    videoPlayerActivity.M = false;
                } else if (actionMasked == 2) {
                    float rawX = motionEvent.getRawX() - videoPlayerActivity.R;
                    float rawY = motionEvent.getRawY() - videoPlayerActivity.S;
                    if (videoPlayerActivity.M || (Math.abs(rawX) > videoPlayerActivity.Q && Math.abs(rawX) > Math.abs(rawY) && videoPlayerActivity.t().j.getController().C.e == 1.0f)) {
                        if (!videoPlayerActivity.M) {
                            View[] viewArr2 = {(TextView) videoPlayerActivity.t().g.c, (MySeekBar) videoPlayerActivity.t().g.g, (TextView) videoPlayerActivity.t().g.d};
                            for (int i13 = 0; i13 < 3; i13++) {
                                viewArr2[i13].animate().alpha(1.0f).start();
                            }
                        }
                        videoPlayerActivity.M = true;
                        float fMin = videoPlayerActivity.T + ((Math.min(100, Math.max(-100, (int) ((rawX / videoPlayerActivity.N) * 100.0f))) / 100.0f) * videoPlayerActivity.P * 1000.0f);
                        d12 d12Var2 = videoPlayerActivity.V;
                        videoPlayerActivity.C((int) (Math.max(Math.min(d12Var2 != null ? d12Var2.m() : 0L, fMin), ColumnText.GLOBAL_SPACE_CHAR_RATIO) / 1000.0f));
                        Handler handler = videoPlayerActivity.Y;
                        d12 d12Var3 = videoPlayerActivity.V;
                        if (d12Var3 != null) {
                            d12Var3.F(false);
                        }
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new sa7(videoPlayerActivity, i11), videoPlayerActivity.I);
                    }
                }
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            }
        });
        Uri uri2 = (Uri) ro6Var.getValue();
        va4 va4Var = va4.g;
        ja4 ja4Var = new ja4();
        ma4 ma4Var = new ma4();
        List list = Collections.EMPTY_LIST;
        u83 u83Var = z83.b;
        tp5 tp5Var = tp5.e;
        ra4 ra4Var = ra4.c;
        zf9.d(((Uri) ma4Var.e) == null || ((UUID) ma4Var.d) != null);
        va4 va4Var2 = new va4("", new la4(ja4Var), uri2 != null ? new qa4(uri2, null, ((UUID) ma4Var.d) != null ? new na4(ma4Var) : null, null, list, null, tp5Var, null) : null, new pa4(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), bb4.I, ra4Var);
        gh1 gh1Var = new gh1(this);
        SparseBooleanArray sparseBooleanArray = gh1Var.P;
        if (sparseBooleanArray.get(1)) {
            sparseBooleanArray.delete(1);
        }
        this.U = new ph1(new hh1(gh1Var), new oq5(7), this);
        ig1 ig1Var = new ig1(this);
        ig1Var.d = true;
        ig1Var.c = 2;
        q02 q02Var = new q02(this);
        zf9.d(!q02Var.a);
        q02Var.c = new rf1(i9, ig1Var);
        lf1 lf1Var = new lf1(new cs0(), true);
        zf9.d(!q02Var.a);
        q02Var.e = new rf1(i5, lf1Var);
        ph1 ph1Var = this.U;
        if (ph1Var == null) {
            bi3.g("trackSelector");
            throw null;
        }
        zf9.d(!q02Var.a);
        q02Var.d = new rf1(i8, ph1Var);
        zf9.d(!q02Var.a);
        q02Var.a = true;
        d12 d12Var = new d12(q02Var);
        tp5 tp5VarV = z83.v(va4Var2);
        d12Var.N();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < tp5VarV.d; i10++) {
            arrayList.add(d12Var.q.a((va4) tp5VarV.get(i10)));
        }
        d12Var.N();
        d12Var.l(d12Var.f0);
        d12Var.h();
        d12Var.G++;
        ArrayList arrayList2 = d12Var.o;
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            for (int i11 = size2 - 1; i11 >= 0; i11--) {
                arrayList2.remove(i11);
            }
            l96 l96Var = d12Var.L;
            int[] iArr = l96Var.b;
            int[] iArr2 = new int[iArr.length - size2];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 < 0 || i14 >= size2) {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= size2;
                    }
                    iArr2[i15] = i14;
                } else {
                    i12++;
                }
            }
            d12Var.L = new l96(iArr2, new Random(l96Var.a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            yb4 yb4Var = new yb4((k10) arrayList.get(i16), d12Var.p);
            arrayList3.add(yb4Var);
            arrayList2.add(i16, new c12(yb4Var.b, yb4Var.a.o));
        }
        d12Var.L = d12Var.L.a(arrayList3.size());
        ha5 ha5Var = new ha5(arrayList2, d12Var.L);
        boolean zP = ha5Var.p();
        int i17 = ha5Var.d;
        if (!zP && -1 >= i17) {
            throw new cu0();
        }
        int iA = ha5Var.a(d12Var.F);
        v95 v95VarU = d12Var.u(d12Var.f0, ha5Var, d12Var.v(ha5Var, iA, -9223372036854775807L));
        int i18 = v95VarU.e;
        v95 v95VarG = v95VarU.g((iA == -1 || i18 == 1) ? i18 : (ha5Var.p() || iA >= i17) ? 4 : 2);
        long jB = i77.B(-9223372036854775807L);
        l96 l96Var2 = d12Var.L;
        j12 j12Var = d12Var.k;
        j12Var.h.a(17, new f12(arrayList3, l96Var2, iA, jB)).b();
        d12Var.L(v95VarG, 0, 1, (d12Var.f0.b.a.equals(v95VarG.b.a) || d12Var.f0.a.p()) ? false : true, 4, d12Var.i(v95VarG), -1, false);
        f36 f36Var = f36.c;
        d12Var.N();
        if (f36Var == null) {
            f36Var = f36.d;
        }
        if (!d12Var.K.equals(f36Var)) {
            d12Var.K = f36Var;
            j12Var.h.a(5, f36Var).b();
        }
        d12Var.x();
        this.V = d12Var;
        d12Var.F(true);
        t().i.setPlayer(this.V);
        t().i.setResizeMode(0);
        d12 d12Var2 = this.V;
        if (d12Var2 != null) {
            d12Var2.l.a(new wa7(this));
        }
        MediaSideScroll mediaSideScroll = t().f;
        TextView textView = t().c;
        RelativeLayout relativeLayout3 = t().h;
        mediaSideScroll.a(this, textView, true, new dk2(this) { // from class: ra7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.dk2
            public final Object invoke(Object obj, Object obj2) {
                int i19 = i4;
                t17 t17Var = t17.a;
                VideoPlayerActivity videoPlayerActivity = this.b;
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                int i20 = VideoPlayerActivity.b0;
                switch (i19) {
                    case 0:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    case 1:
                        videoPlayerActivity.x(false);
                        break;
                    case 2:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        videoPlayerActivity.x(true);
                        break;
                }
                return t17Var;
            }
        }, new dk2(this) { // from class: ra7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.dk2
            public final Object invoke(Object obj, Object obj2) {
                int i19 = i5;
                t17 t17Var = t17.a;
                VideoPlayerActivity videoPlayerActivity = this.b;
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                int i20 = VideoPlayerActivity.b0;
                switch (i19) {
                    case 0:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    case 1:
                        videoPlayerActivity.x(false);
                        break;
                    case 2:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        videoPlayerActivity.x(true);
                        break;
                }
                return t17Var;
            }
        });
        MediaSideScroll mediaSideScroll2 = t().l;
        TextView textView2 = t().c;
        RelativeLayout relativeLayout4 = t().h;
        mediaSideScroll2.a(this, textView2, false, new dk2(this) { // from class: ra7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.dk2
            public final Object invoke(Object obj, Object obj2) {
                int i19 = i8;
                t17 t17Var = t17.a;
                VideoPlayerActivity videoPlayerActivity = this.b;
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                int i20 = VideoPlayerActivity.b0;
                switch (i19) {
                    case 0:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    case 1:
                        videoPlayerActivity.x(false);
                        break;
                    case 2:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        videoPlayerActivity.x(true);
                        break;
                }
                return t17Var;
            }
        }, new dk2(this) { // from class: ra7
            public final /* synthetic */ VideoPlayerActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.dk2
            public final Object invoke(Object obj, Object obj2) {
                int i19 = i9;
                t17 t17Var = t17.a;
                VideoPlayerActivity videoPlayerActivity = this.b;
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                int i20 = VideoPlayerActivity.b0;
                switch (i19) {
                    case 0:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    case 1:
                        videoPlayerActivity.x(false);
                        break;
                    case 2:
                        videoPlayerActivity.y(!videoPlayerActivity.J);
                        break;
                    default:
                        videoPlayerActivity.x(true);
                        break;
                }
                return t17Var;
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new sa7(this, i5), 500L);
        this.Q = 8.0f * getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        String str;
        boolean z;
        AudioTrack audioTrack;
        super.onDestroy();
        d12 d12Var = this.V;
        if (d12Var != null) {
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(d12Var)));
            sb.append(" [ExoPlayerLib/2.19.1] [");
            sb.append(i77.e);
            sb.append("] [");
            HashSet hashSet = k12.a;
            synchronized (k12.class) {
                str = k12.b;
            }
            sb.append(str);
            sb.append("]");
            wh3.g("ExoPlayerImpl", sb.toString());
            d12Var.N();
            int i = i77.a;
            if (i < 21 && (audioTrack = d12Var.O) != null) {
                audioTrack.release();
                d12Var.O = null;
            }
            d12Var.z.q();
            d12Var.B.getClass();
            d12Var.C.getClass();
            wr wrVar = d12Var.A;
            wrVar.c = null;
            wrVar.a();
            j12 j12Var = d12Var.k;
            synchronized (j12Var) {
                if (j12Var.x || !j12Var.j.getThread().isAlive()) {
                    z = true;
                } else {
                    j12Var.h.d(7);
                    j12Var.f0(new rf1(4, j12Var));
                    z = j12Var.x;
                }
            }
            if (!z) {
                d12Var.l.e(10, new u02(0));
            }
            d12Var.l.d();
            d12Var.i.a.removeCallbacksAndMessages(null);
            wd1 wd1Var = d12Var.t;
            kd1 kd1Var = d12Var.r;
            CopyOnWriteArrayList<mz> copyOnWriteArrayList = (CopyOnWriteArrayList) wd1Var.b.b;
            for (mz mzVar : copyOnWriteArrayList) {
                if (mzVar.b == kd1Var) {
                    mzVar.c = true;
                    copyOnWriteArrayList.remove(mzVar);
                }
            }
            v95 v95VarA = d12Var.f0;
            if (v95VarA.o) {
                v95VarA = v95VarA.a();
                d12Var.f0 = v95VarA;
            }
            v95 v95VarG = v95VarA.g(1);
            d12Var.f0 = v95VarG;
            v95 v95VarB = v95VarG.b(v95VarG.b);
            d12Var.f0 = v95VarB;
            v95VarB.p = v95VarB.r;
            d12Var.f0.q = 0L;
            kd1 kd1Var2 = d12Var.r;
            bp6 bp6Var = kd1Var2.h;
            zf9.e(bp6Var);
            bp6Var.c(new z2(22, kd1Var2));
            ph1 ph1Var = d12Var.h;
            synchronized (ph1Var.c) {
                if (i >= 32) {
                    try {
                        kh1 kh1Var = ph1Var.h;
                        if (kh1Var != null) {
                            kh1Var.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ph1Var.a = null;
            ph1Var.b = null;
            d12Var.z();
            Surface surface = d12Var.Q;
            if (surface != null) {
                surface.release();
                d12Var.Q = null;
            }
            d12Var.a0 = n71.b;
        }
        this.V = null;
        System.gc();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        super.onPause();
        A();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.V == null || !z) {
            return;
        }
        C(i);
        d12 d12Var = this.V;
        int i2 = 0;
        if (d12Var != null) {
            d12Var.F(false);
        }
        Handler handler = this.Y;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new sa7(this, i2), this.I);
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.isCollectionVideoPlayerBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            Admob admob = this.a0;
            if (i == 9) {
                int i2 = RemoteAdData.COLLECTION_VIDEO_PLAYER_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    admob.loadAdaptive_banner(this, (RelativeLayout) t().b.c, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
                } else if (i2 == 2) {
                    admob.loadAdaptive_bannerAdax(this, (RelativeLayout) t().b.c, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                admob.loadAdaptive_banner(this, (RelativeLayout) t().b.c, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
            } else if (i == 2) {
                admob.loadAdaptive_bannerAdax(this, (RelativeLayout) t().b.c, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            ((RelativeLayout) t().b.c).setVisibility(8);
        }
        if (Build.VERSION.SDK_INT < 35) {
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
        }
        t().h.setBackground(new ColorDrawable(-16777216));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 0.5f;
        getWindow().setAttributes(attributes);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.M = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        d12 d12Var = this.V;
        if (d12Var == null) {
            return;
        }
        if (!this.K) {
            D();
        } else if (d12Var != null) {
            d12Var.F(true);
        }
        this.M = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        dt3 dt3VarA = kea.a(this);
        kg1 kg1Var = wl1.a;
        mk9.g(dt3VarA, c54.a, null, new el2(2, null, 3), 2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    @Override // defpackage.d00
    public final void u() {
    }

    public final boolean w() {
        d12 d12Var = this.V;
        long jH = d12Var != null ? d12Var.h() : 0L;
        d12 d12Var2 = this.V;
        return jH != 0 && jH >= (d12Var2 != null ? d12Var2.m() : 0L);
    }

    public final void x(boolean z) {
        d12 d12Var = this.V;
        if (d12Var == null) {
            return;
        }
        long jH = d12Var.h();
        int iRound = Math.round((z ? jH + 10000 : jH - 10000) / 1000.0f);
        d12 d12Var2 = this.V;
        C(Math.max(Math.min((d12Var2 != null ? (int) d12Var2.m() : 0) / PdfGraphics2D.AFM_DIVISOR, iRound), 0));
        if (this.K) {
            return;
        }
        D();
    }

    public final void y(boolean z) {
        this.J = z;
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(3847);
        } else {
            p4a.g(this);
        }
        final float f = z ? 0.0f : 1.0f;
        int i = 0;
        ((ImageView) t().g.i).setEnabled(!(f == ColumnText.GLOBAL_SPACE_CHAR_RATIO));
        final o6 o6VarT = t();
        uz0 uz0Var = o6VarT.g;
        TextView textView = (TextView) uz0Var.d;
        MySeekBar mySeekBar = (MySeekBar) uz0Var.g;
        TextView textView2 = (TextView) uz0Var.c;
        ImageView imageView = (ImageView) uz0Var.e;
        View[] viewArr = {(ImageView) uz0Var.f, (ImageView) uz0Var.i, imageView, textView2, mySeekBar, textView, o6VarT.e};
        int i2 = 0;
        while (i2 < 7) {
            viewArr[i2].animate().alpha(f).start();
            i2++;
            i = i;
        }
        int i3 = i;
        mySeekBar.setOnSeekBarChangeListener(this.J ? null : this);
        View[] viewArr2 = new View[4];
        viewArr2[i3] = (ImageView) uz0Var.f;
        viewArr2[1] = imageView;
        viewArr2[2] = textView2;
        viewArr2[3] = textView;
        for (int i4 = i3; i4 < 4; i4++) {
            viewArr2[i4].setClickable(!this.J);
        }
        o6VarT.d.animate().alpha(f).withStartAction(new pq6(9, o6VarT)).withEndAction(new Runnable() { // from class: ta7
            @Override // java.lang.Runnable
            public final void run() {
                int i5 = VideoPlayerActivity.b0;
                AppBarLayout appBarLayout = o6VarT.d;
                if (f == 1.0f) {
                    appBarLayout.setVisibility(0);
                } else {
                    appBarLayout.setVisibility(8);
                }
            }
        }).start();
    }

    @Override // defpackage.d00
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final o6 t() {
        return (o6) this.G.getValue();
    }
}