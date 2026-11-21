package com.gpsmapcamera.geotagginglocationonphoto.ui.activities;

import android.content.Context;
import android.content.IntentSender;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.ui.activities.SingleFolderActivity;
import com.gpsmapcamera.geotagginglocationonphoto.widgets.MyRecyclerView;
import com.qtalk.recyclerviewfastscroller.RecyclerViewFastScroller;
import defpackage.ao1;
import defpackage.ap5;
import defpackage.b30;
import defpackage.bi3;
import defpackage.bv0;
import defpackage.c54;
import defpackage.c6;
import defpackage.ca4;
import defpackage.ca6;
import defpackage.cc7;
import defpackage.cd;
import defpackage.d00;
import defpackage.d63;
import defpackage.df2;
import defpackage.dm2;
import defpackage.dt3;
import defpackage.e5;
import defpackage.e65;
import defpackage.fq8;
import defpackage.gb0;
import defpackage.hv0;
import defpackage.i41;
import defpackage.i6;
import defpackage.ih3;
import defpackage.is0;
import defpackage.iv0;
import defpackage.ja6;
import defpackage.jv4;
import defpackage.kea;
import defpackage.kg1;
import defpackage.la9;
import defpackage.lt1;
import defpackage.ma6;
import defpackage.mk9;
import defpackage.mm1;
import defpackage.mq7;
import defpackage.n8;
import defpackage.nj2;
import defpackage.o82;
import defpackage.oa6;
import defpackage.on5;
import defpackage.pa6;
import defpackage.pc;
import defpackage.pm;
import defpackage.pm2;
import defpackage.qc;
import defpackage.qd3;
import defpackage.qq5;
import defpackage.ra6;
import defpackage.ro6;
import defpackage.s7a;
import defpackage.sa6;
import defpackage.tl2;
import defpackage.u;
import defpackage.ua6;
import defpackage.ub7;
import defpackage.ul1;
import defpackage.ut5;
import defpackage.v60;
import defpackage.we2;
import defpackage.wl1;
import defpackage.wm2;
import defpackage.x92;
import defpackage.xe2;
import defpackage.xe6;
import defpackage.xn5;
import defpackage.xy3;
import defpackage.yo5;
import defpackage.zm0;
import defpackage.zm2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class SingleFolderActivity extends d00 implements xe2 {
    public static final /* synthetic */ int o0 = 0;
    public final ro6 G;
    public final ro6 H;
    public ao1 J;
    public fq8 K;
    public GridLayoutManager N;
    public Bundle P;
    public Parcelable Q;
    public xe6 S;
    public xe6 T;
    public ua6 V;
    public final ro6 W;
    public final ro6 X;
    public final ro6 Y;
    public df2 Z;
    public final ro6 b0;
    public final i6 d0;
    public final i6 e0;
    public boolean f0;
    public pm g0;
    public v60 h0;
    public qd3 i0;
    public v60 j0;
    public xe6 l0;
    public bv0 m0;
    public qc n0;
    public List I = new ArrayList();
    public int L = 4;
    public tl2 M = tl2.GRID_4X4;
    public final String O = "recycler_state";
    public final ArrayList R = new ArrayList();
    public jv4 U = jv4.a;
    public final ul1 a0 = new ul1(this);
    public ArrayList c0 = new ArrayList();
    public final Admob k0 = new Admob();

    public SingleFolderActivity() {
        final int i = 0;
        this.G = new ro6(new nj2(this) { // from class: ia6
            public final /* synthetic */ SingleFolderActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i2 = i;
                SingleFolderActivity singleFolderActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = SingleFolderActivity.o0;
                        View viewInflate = singleFolderActivity.getLayoutInflater().inflate(R.layout.activity_album_details, (ViewGroup) null, false);
                        int i4 = R.id.btnGrantPermission;
                        if (((Button) pn9.a(R.id.btnGrantPermission, viewInflate)) != null) {
                            i4 = R.id.cardPermission;
                            if (((CardView) pn9.a(R.id.cardPermission, viewInflate)) != null) {
                                i4 = R.id.clBottom;
                                ConstraintLayout constraintLayout = (ConstraintLayout) pn9.a(R.id.clBottom, viewInflate);
                                if (constraintLayout != null) {
                                    i4 = R.id.clBottomTools;
                                    if (((ConstraintLayout) pn9.a(R.id.clBottomTools, viewInflate)) != null) {
                                        i4 = R.id.imgBack;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) pn9.a(R.id.imgBack, viewInflate);
                                        if (appCompatImageView != null) {
                                            i4 = R.id.imgDelete;
                                            LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.imgDelete, viewInflate);
                                            if (linearLayout != null) {
                                                i4 = R.id.imgGrids;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) pn9.a(R.id.imgGrids, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i4 = R.id.imgSelectAll;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) pn9.a(R.id.imgSelectAll, viewInflate);
                                                    if (appCompatImageView3 != null) {
                                                        i4 = R.id.imgShare;
                                                        LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.imgShare, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i4 = R.id.llActions;
                                                            if (((LinearLayout) pn9.a(R.id.llActions, viewInflate)) != null) {
                                                                i4 = R.id.llCopy;
                                                                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.llCopy, viewInflate);
                                                                if (linearLayout3 != null) {
                                                                    i4 = R.id.llMove;
                                                                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.llMove, viewInflate);
                                                                    if (linearLayout4 != null) {
                                                                        i4 = R.id.mediaFastscroller;
                                                                        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) pn9.a(R.id.mediaFastscroller, viewInflate);
                                                                        if (recyclerViewFastScroller != null) {
                                                                            i4 = R.id.rel_adaptive_banner;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                            if (relativeLayout != null) {
                                                                                i4 = R.id.rlBtmAds;
                                                                                if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                                                                    i4 = R.id.rvMoments;
                                                                                    MyRecyclerView myRecyclerView = (MyRecyclerView) pn9.a(R.id.rvMoments, viewInflate);
                                                                                    if (myRecyclerView != null) {
                                                                                        i4 = R.id.toolbar;
                                                                                        if (((RelativeLayout) pn9.a(R.id.toolbar, viewInflate)) != null) {
                                                                                            i4 = R.id.txtTitle;
                                                                                            TextView textView = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                                            if (textView != null) {
                                                                                                return new e5((RelativeLayout) viewInflate, constraintLayout, appCompatImageView, linearLayout, appCompatImageView2, appCompatImageView3, linearLayout2, linearLayout3, linearLayout4, recyclerViewFastScroller, relativeLayout, myRecyclerView, textView);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
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
                        return null;
                    case 1:
                        int i5 = SingleFolderActivity.o0;
                        return new SP(singleFolderActivity);
                    case 2:
                        int i6 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_path") ? singleFolderActivity.getIntent().getStringExtra("album_path") : "";
                    case 3:
                        int i7 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_name") ? singleFolderActivity.getIntent().getStringExtra("album_name") : "";
                    case 4:
                        int i8 = SingleFolderActivity.o0;
                        return Boolean.valueOf(singleFolderActivity.getIntent().hasExtra("is_root") ? singleFolderActivity.getIntent().getBooleanExtra("is_root", false) : false);
                    default:
                        int i9 = SingleFolderActivity.o0;
                        return new is0(singleFolderActivity);
                }
            }
        });
        final int i2 = 1;
        this.H = new ro6(new nj2(this) { // from class: ia6
            public final /* synthetic */ SingleFolderActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i3 = i2;
                SingleFolderActivity singleFolderActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = SingleFolderActivity.o0;
                        View viewInflate = singleFolderActivity.getLayoutInflater().inflate(R.layout.activity_album_details, (ViewGroup) null, false);
                        int i5 = R.id.btnGrantPermission;
                        if (((Button) pn9.a(R.id.btnGrantPermission, viewInflate)) != null) {
                            i5 = R.id.cardPermission;
                            if (((CardView) pn9.a(R.id.cardPermission, viewInflate)) != null) {
                                i5 = R.id.clBottom;
                                ConstraintLayout constraintLayout = (ConstraintLayout) pn9.a(R.id.clBottom, viewInflate);
                                if (constraintLayout != null) {
                                    i5 = R.id.clBottomTools;
                                    if (((ConstraintLayout) pn9.a(R.id.clBottomTools, viewInflate)) != null) {
                                        i5 = R.id.imgBack;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) pn9.a(R.id.imgBack, viewInflate);
                                        if (appCompatImageView != null) {
                                            i5 = R.id.imgDelete;
                                            LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.imgDelete, viewInflate);
                                            if (linearLayout != null) {
                                                i5 = R.id.imgGrids;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) pn9.a(R.id.imgGrids, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i5 = R.id.imgSelectAll;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) pn9.a(R.id.imgSelectAll, viewInflate);
                                                    if (appCompatImageView3 != null) {
                                                        i5 = R.id.imgShare;
                                                        LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.imgShare, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i5 = R.id.llActions;
                                                            if (((LinearLayout) pn9.a(R.id.llActions, viewInflate)) != null) {
                                                                i5 = R.id.llCopy;
                                                                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.llCopy, viewInflate);
                                                                if (linearLayout3 != null) {
                                                                    i5 = R.id.llMove;
                                                                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.llMove, viewInflate);
                                                                    if (linearLayout4 != null) {
                                                                        i5 = R.id.mediaFastscroller;
                                                                        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) pn9.a(R.id.mediaFastscroller, viewInflate);
                                                                        if (recyclerViewFastScroller != null) {
                                                                            i5 = R.id.rel_adaptive_banner;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                            if (relativeLayout != null) {
                                                                                i5 = R.id.rlBtmAds;
                                                                                if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                                                                    i5 = R.id.rvMoments;
                                                                                    MyRecyclerView myRecyclerView = (MyRecyclerView) pn9.a(R.id.rvMoments, viewInflate);
                                                                                    if (myRecyclerView != null) {
                                                                                        i5 = R.id.toolbar;
                                                                                        if (((RelativeLayout) pn9.a(R.id.toolbar, viewInflate)) != null) {
                                                                                            i5 = R.id.txtTitle;
                                                                                            TextView textView = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                                            if (textView != null) {
                                                                                                return new e5((RelativeLayout) viewInflate, constraintLayout, appCompatImageView, linearLayout, appCompatImageView2, appCompatImageView3, linearLayout2, linearLayout3, linearLayout4, recyclerViewFastScroller, relativeLayout, myRecyclerView, textView);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
                        return null;
                    case 1:
                        int i6 = SingleFolderActivity.o0;
                        return new SP(singleFolderActivity);
                    case 2:
                        int i7 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_path") ? singleFolderActivity.getIntent().getStringExtra("album_path") : "";
                    case 3:
                        int i8 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_name") ? singleFolderActivity.getIntent().getStringExtra("album_name") : "";
                    case 4:
                        int i9 = SingleFolderActivity.o0;
                        return Boolean.valueOf(singleFolderActivity.getIntent().hasExtra("is_root") ? singleFolderActivity.getIntent().getBooleanExtra("is_root", false) : false);
                    default:
                        int i10 = SingleFolderActivity.o0;
                        return new is0(singleFolderActivity);
                }
            }
        });
        final int i3 = 4;
        final int i4 = 2;
        this.W = new ro6(new nj2(this) { // from class: ia6
            public final /* synthetic */ SingleFolderActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i5 = i4;
                SingleFolderActivity singleFolderActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = SingleFolderActivity.o0;
                        View viewInflate = singleFolderActivity.getLayoutInflater().inflate(R.layout.activity_album_details, (ViewGroup) null, false);
                        int i7 = R.id.btnGrantPermission;
                        if (((Button) pn9.a(R.id.btnGrantPermission, viewInflate)) != null) {
                            i7 = R.id.cardPermission;
                            if (((CardView) pn9.a(R.id.cardPermission, viewInflate)) != null) {
                                i7 = R.id.clBottom;
                                ConstraintLayout constraintLayout = (ConstraintLayout) pn9.a(R.id.clBottom, viewInflate);
                                if (constraintLayout != null) {
                                    i7 = R.id.clBottomTools;
                                    if (((ConstraintLayout) pn9.a(R.id.clBottomTools, viewInflate)) != null) {
                                        i7 = R.id.imgBack;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) pn9.a(R.id.imgBack, viewInflate);
                                        if (appCompatImageView != null) {
                                            i7 = R.id.imgDelete;
                                            LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.imgDelete, viewInflate);
                                            if (linearLayout != null) {
                                                i7 = R.id.imgGrids;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) pn9.a(R.id.imgGrids, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i7 = R.id.imgSelectAll;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) pn9.a(R.id.imgSelectAll, viewInflate);
                                                    if (appCompatImageView3 != null) {
                                                        i7 = R.id.imgShare;
                                                        LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.imgShare, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i7 = R.id.llActions;
                                                            if (((LinearLayout) pn9.a(R.id.llActions, viewInflate)) != null) {
                                                                i7 = R.id.llCopy;
                                                                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.llCopy, viewInflate);
                                                                if (linearLayout3 != null) {
                                                                    i7 = R.id.llMove;
                                                                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.llMove, viewInflate);
                                                                    if (linearLayout4 != null) {
                                                                        i7 = R.id.mediaFastscroller;
                                                                        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) pn9.a(R.id.mediaFastscroller, viewInflate);
                                                                        if (recyclerViewFastScroller != null) {
                                                                            i7 = R.id.rel_adaptive_banner;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                            if (relativeLayout != null) {
                                                                                i7 = R.id.rlBtmAds;
                                                                                if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                                                                    i7 = R.id.rvMoments;
                                                                                    MyRecyclerView myRecyclerView = (MyRecyclerView) pn9.a(R.id.rvMoments, viewInflate);
                                                                                    if (myRecyclerView != null) {
                                                                                        i7 = R.id.toolbar;
                                                                                        if (((RelativeLayout) pn9.a(R.id.toolbar, viewInflate)) != null) {
                                                                                            i7 = R.id.txtTitle;
                                                                                            TextView textView = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                                            if (textView != null) {
                                                                                                return new e5((RelativeLayout) viewInflate, constraintLayout, appCompatImageView, linearLayout, appCompatImageView2, appCompatImageView3, linearLayout2, linearLayout3, linearLayout4, recyclerViewFastScroller, relativeLayout, myRecyclerView, textView);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
                        return null;
                    case 1:
                        int i8 = SingleFolderActivity.o0;
                        return new SP(singleFolderActivity);
                    case 2:
                        int i9 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_path") ? singleFolderActivity.getIntent().getStringExtra("album_path") : "";
                    case 3:
                        int i10 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_name") ? singleFolderActivity.getIntent().getStringExtra("album_name") : "";
                    case 4:
                        int i11 = SingleFolderActivity.o0;
                        return Boolean.valueOf(singleFolderActivity.getIntent().hasExtra("is_root") ? singleFolderActivity.getIntent().getBooleanExtra("is_root", false) : false);
                    default:
                        int i12 = SingleFolderActivity.o0;
                        return new is0(singleFolderActivity);
                }
            }
        });
        final int i5 = 3;
        this.X = new ro6(new nj2(this) { // from class: ia6
            public final /* synthetic */ SingleFolderActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i6 = i5;
                SingleFolderActivity singleFolderActivity = this.b;
                switch (i6) {
                    case 0:
                        int i7 = SingleFolderActivity.o0;
                        View viewInflate = singleFolderActivity.getLayoutInflater().inflate(R.layout.activity_album_details, (ViewGroup) null, false);
                        int i8 = R.id.btnGrantPermission;
                        if (((Button) pn9.a(R.id.btnGrantPermission, viewInflate)) != null) {
                            i8 = R.id.cardPermission;
                            if (((CardView) pn9.a(R.id.cardPermission, viewInflate)) != null) {
                                i8 = R.id.clBottom;
                                ConstraintLayout constraintLayout = (ConstraintLayout) pn9.a(R.id.clBottom, viewInflate);
                                if (constraintLayout != null) {
                                    i8 = R.id.clBottomTools;
                                    if (((ConstraintLayout) pn9.a(R.id.clBottomTools, viewInflate)) != null) {
                                        i8 = R.id.imgBack;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) pn9.a(R.id.imgBack, viewInflate);
                                        if (appCompatImageView != null) {
                                            i8 = R.id.imgDelete;
                                            LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.imgDelete, viewInflate);
                                            if (linearLayout != null) {
                                                i8 = R.id.imgGrids;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) pn9.a(R.id.imgGrids, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i8 = R.id.imgSelectAll;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) pn9.a(R.id.imgSelectAll, viewInflate);
                                                    if (appCompatImageView3 != null) {
                                                        i8 = R.id.imgShare;
                                                        LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.imgShare, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i8 = R.id.llActions;
                                                            if (((LinearLayout) pn9.a(R.id.llActions, viewInflate)) != null) {
                                                                i8 = R.id.llCopy;
                                                                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.llCopy, viewInflate);
                                                                if (linearLayout3 != null) {
                                                                    i8 = R.id.llMove;
                                                                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.llMove, viewInflate);
                                                                    if (linearLayout4 != null) {
                                                                        i8 = R.id.mediaFastscroller;
                                                                        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) pn9.a(R.id.mediaFastscroller, viewInflate);
                                                                        if (recyclerViewFastScroller != null) {
                                                                            i8 = R.id.rel_adaptive_banner;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                            if (relativeLayout != null) {
                                                                                i8 = R.id.rlBtmAds;
                                                                                if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                                                                    i8 = R.id.rvMoments;
                                                                                    MyRecyclerView myRecyclerView = (MyRecyclerView) pn9.a(R.id.rvMoments, viewInflate);
                                                                                    if (myRecyclerView != null) {
                                                                                        i8 = R.id.toolbar;
                                                                                        if (((RelativeLayout) pn9.a(R.id.toolbar, viewInflate)) != null) {
                                                                                            i8 = R.id.txtTitle;
                                                                                            TextView textView = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                                            if (textView != null) {
                                                                                                return new e5((RelativeLayout) viewInflate, constraintLayout, appCompatImageView, linearLayout, appCompatImageView2, appCompatImageView3, linearLayout2, linearLayout3, linearLayout4, recyclerViewFastScroller, relativeLayout, myRecyclerView, textView);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i8)));
                        return null;
                    case 1:
                        int i9 = SingleFolderActivity.o0;
                        return new SP(singleFolderActivity);
                    case 2:
                        int i10 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_path") ? singleFolderActivity.getIntent().getStringExtra("album_path") : "";
                    case 3:
                        int i11 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_name") ? singleFolderActivity.getIntent().getStringExtra("album_name") : "";
                    case 4:
                        int i12 = SingleFolderActivity.o0;
                        return Boolean.valueOf(singleFolderActivity.getIntent().hasExtra("is_root") ? singleFolderActivity.getIntent().getBooleanExtra("is_root", false) : false);
                    default:
                        int i13 = SingleFolderActivity.o0;
                        return new is0(singleFolderActivity);
                }
            }
        });
        this.Y = new ro6(new nj2(this) { // from class: ia6
            public final /* synthetic */ SingleFolderActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i6 = i3;
                SingleFolderActivity singleFolderActivity = this.b;
                switch (i6) {
                    case 0:
                        int i7 = SingleFolderActivity.o0;
                        View viewInflate = singleFolderActivity.getLayoutInflater().inflate(R.layout.activity_album_details, (ViewGroup) null, false);
                        int i8 = R.id.btnGrantPermission;
                        if (((Button) pn9.a(R.id.btnGrantPermission, viewInflate)) != null) {
                            i8 = R.id.cardPermission;
                            if (((CardView) pn9.a(R.id.cardPermission, viewInflate)) != null) {
                                i8 = R.id.clBottom;
                                ConstraintLayout constraintLayout = (ConstraintLayout) pn9.a(R.id.clBottom, viewInflate);
                                if (constraintLayout != null) {
                                    i8 = R.id.clBottomTools;
                                    if (((ConstraintLayout) pn9.a(R.id.clBottomTools, viewInflate)) != null) {
                                        i8 = R.id.imgBack;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) pn9.a(R.id.imgBack, viewInflate);
                                        if (appCompatImageView != null) {
                                            i8 = R.id.imgDelete;
                                            LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.imgDelete, viewInflate);
                                            if (linearLayout != null) {
                                                i8 = R.id.imgGrids;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) pn9.a(R.id.imgGrids, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i8 = R.id.imgSelectAll;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) pn9.a(R.id.imgSelectAll, viewInflate);
                                                    if (appCompatImageView3 != null) {
                                                        i8 = R.id.imgShare;
                                                        LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.imgShare, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i8 = R.id.llActions;
                                                            if (((LinearLayout) pn9.a(R.id.llActions, viewInflate)) != null) {
                                                                i8 = R.id.llCopy;
                                                                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.llCopy, viewInflate);
                                                                if (linearLayout3 != null) {
                                                                    i8 = R.id.llMove;
                                                                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.llMove, viewInflate);
                                                                    if (linearLayout4 != null) {
                                                                        i8 = R.id.mediaFastscroller;
                                                                        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) pn9.a(R.id.mediaFastscroller, viewInflate);
                                                                        if (recyclerViewFastScroller != null) {
                                                                            i8 = R.id.rel_adaptive_banner;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                            if (relativeLayout != null) {
                                                                                i8 = R.id.rlBtmAds;
                                                                                if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                                                                    i8 = R.id.rvMoments;
                                                                                    MyRecyclerView myRecyclerView = (MyRecyclerView) pn9.a(R.id.rvMoments, viewInflate);
                                                                                    if (myRecyclerView != null) {
                                                                                        i8 = R.id.toolbar;
                                                                                        if (((RelativeLayout) pn9.a(R.id.toolbar, viewInflate)) != null) {
                                                                                            i8 = R.id.txtTitle;
                                                                                            TextView textView = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                                            if (textView != null) {
                                                                                                return new e5((RelativeLayout) viewInflate, constraintLayout, appCompatImageView, linearLayout, appCompatImageView2, appCompatImageView3, linearLayout2, linearLayout3, linearLayout4, recyclerViewFastScroller, relativeLayout, myRecyclerView, textView);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i8)));
                        return null;
                    case 1:
                        int i9 = SingleFolderActivity.o0;
                        return new SP(singleFolderActivity);
                    case 2:
                        int i10 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_path") ? singleFolderActivity.getIntent().getStringExtra("album_path") : "";
                    case 3:
                        int i11 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_name") ? singleFolderActivity.getIntent().getStringExtra("album_name") : "";
                    case 4:
                        int i12 = SingleFolderActivity.o0;
                        return Boolean.valueOf(singleFolderActivity.getIntent().hasExtra("is_root") ? singleFolderActivity.getIntent().getBooleanExtra("is_root", false) : false);
                    default:
                        int i13 = SingleFolderActivity.o0;
                        return new is0(singleFolderActivity);
                }
            }
        });
        final int i6 = 5;
        this.b0 = new ro6(new nj2(this) { // from class: ia6
            public final /* synthetic */ SingleFolderActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i7 = i6;
                SingleFolderActivity singleFolderActivity = this.b;
                switch (i7) {
                    case 0:
                        int i8 = SingleFolderActivity.o0;
                        View viewInflate = singleFolderActivity.getLayoutInflater().inflate(R.layout.activity_album_details, (ViewGroup) null, false);
                        int i9 = R.id.btnGrantPermission;
                        if (((Button) pn9.a(R.id.btnGrantPermission, viewInflate)) != null) {
                            i9 = R.id.cardPermission;
                            if (((CardView) pn9.a(R.id.cardPermission, viewInflate)) != null) {
                                i9 = R.id.clBottom;
                                ConstraintLayout constraintLayout = (ConstraintLayout) pn9.a(R.id.clBottom, viewInflate);
                                if (constraintLayout != null) {
                                    i9 = R.id.clBottomTools;
                                    if (((ConstraintLayout) pn9.a(R.id.clBottomTools, viewInflate)) != null) {
                                        i9 = R.id.imgBack;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) pn9.a(R.id.imgBack, viewInflate);
                                        if (appCompatImageView != null) {
                                            i9 = R.id.imgDelete;
                                            LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.imgDelete, viewInflate);
                                            if (linearLayout != null) {
                                                i9 = R.id.imgGrids;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) pn9.a(R.id.imgGrids, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i9 = R.id.imgSelectAll;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) pn9.a(R.id.imgSelectAll, viewInflate);
                                                    if (appCompatImageView3 != null) {
                                                        i9 = R.id.imgShare;
                                                        LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.imgShare, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i9 = R.id.llActions;
                                                            if (((LinearLayout) pn9.a(R.id.llActions, viewInflate)) != null) {
                                                                i9 = R.id.llCopy;
                                                                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.llCopy, viewInflate);
                                                                if (linearLayout3 != null) {
                                                                    i9 = R.id.llMove;
                                                                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.llMove, viewInflate);
                                                                    if (linearLayout4 != null) {
                                                                        i9 = R.id.mediaFastscroller;
                                                                        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) pn9.a(R.id.mediaFastscroller, viewInflate);
                                                                        if (recyclerViewFastScroller != null) {
                                                                            i9 = R.id.rel_adaptive_banner;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                            if (relativeLayout != null) {
                                                                                i9 = R.id.rlBtmAds;
                                                                                if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                                                                    i9 = R.id.rvMoments;
                                                                                    MyRecyclerView myRecyclerView = (MyRecyclerView) pn9.a(R.id.rvMoments, viewInflate);
                                                                                    if (myRecyclerView != null) {
                                                                                        i9 = R.id.toolbar;
                                                                                        if (((RelativeLayout) pn9.a(R.id.toolbar, viewInflate)) != null) {
                                                                                            i9 = R.id.txtTitle;
                                                                                            TextView textView = (TextView) pn9.a(R.id.txtTitle, viewInflate);
                                                                                            if (textView != null) {
                                                                                                return new e5((RelativeLayout) viewInflate, constraintLayout, appCompatImageView, linearLayout, appCompatImageView2, appCompatImageView3, linearLayout2, linearLayout3, linearLayout4, recyclerViewFastScroller, relativeLayout, myRecyclerView, textView);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i9)));
                        return null;
                    case 1:
                        int i10 = SingleFolderActivity.o0;
                        return new SP(singleFolderActivity);
                    case 2:
                        int i11 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_path") ? singleFolderActivity.getIntent().getStringExtra("album_path") : "";
                    case 3:
                        int i12 = SingleFolderActivity.o0;
                        return singleFolderActivity.getIntent().hasExtra("album_name") ? singleFolderActivity.getIntent().getStringExtra("album_name") : "";
                    case 4:
                        int i13 = SingleFolderActivity.o0;
                        return Boolean.valueOf(singleFolderActivity.getIntent().hasExtra("is_root") ? singleFolderActivity.getIntent().getBooleanExtra("is_root", false) : false);
                    default:
                        int i14 = SingleFolderActivity.o0;
                        return new is0(singleFolderActivity);
                }
            }
        });
        this.d0 = (i6) n(new ma6(this, i2), new c6(i3));
        this.e0 = (i6) n(new ma6(this, i4), new c6(i3));
    }

    public static final void G(SingleFolderActivity singleFolderActivity) {
        v60 v60Var = singleFolderActivity.j0;
        if (v60Var != null) {
            v60Var.dismiss();
        }
        ArrayList arrayList = singleFolderActivity.R;
        if (arrayList.isEmpty()) {
            return;
        }
        singleFolderActivity.c0 = new ArrayList(arrayList);
        i41 i41Var = null;
        if (!s7a.j()) {
            ArrayList arrayList2 = singleFolderActivity.c0;
            ArrayList arrayList3 = new ArrayList(iv0.d(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList3.add(new File(((ca4) obj).d));
            }
            singleFolderActivity.x();
            singleFolderActivity.J(false);
            dt3 dt3VarA = kea.a(singleFolderActivity);
            kg1 kg1Var = wl1.a;
            mk9.g(dt3VarA, c54.a, null, new cd(singleFolderActivity, arrayList3, i41Var, 26), 2);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = singleFolderActivity.c0;
        int size2 = arrayList5.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList5.get(i2);
            i2++;
            Uri uri = ((ca4) obj2).h;
            if (uri != null && bi3.b(uri.getAuthority(), "media")) {
                arrayList4.add(uri);
            }
        }
        if (arrayList4.size() == singleFolderActivity.c0.size()) {
            try {
                IntentSender intentSender = MediaStore.createDeleteRequest(singleFolderActivity.getContentResolver(), arrayList4).getIntentSender();
                intentSender.getClass();
                singleFolderActivity.d0.a(new ih3(intentSender, null, 0, 0), null);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                String string = singleFolderActivity.getString(R.string.delete_failed);
                string.getClass();
                x92.l(singleFolderActivity, string);
                return;
            }
        }
        zm2 zm2Var = new zm2(new yo5(), new ArrayList(), singleFolderActivity.c0.size(), singleFolderActivity, 1);
        ArrayList arrayList6 = singleFolderActivity.c0;
        ArrayList arrayList7 = new ArrayList(iv0.d(arrayList6, 10));
        int size3 = arrayList6.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList6.get(i3);
            i3++;
            arrayList7.add(((ca4) obj3).d);
        }
        MediaScannerConnection.scanFile(singleFolderActivity, (String[]) arrayList7.toArray(new String[0]), null, zm2Var);
        singleFolderActivity.B().b();
    }

    @Override // defpackage.d00
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final e5 t() {
        return (e5) this.G.getValue();
    }

    public final is0 B() {
        return (is0) this.b0.getValue();
    }

    public final df2 C() {
        df2 df2Var = this.Z;
        if (df2Var != null) {
            return df2Var;
        }
        bi3.g("foldersModel");
        throw null;
    }

    public final void D(int i, ca4 ca4Var, List list) {
        ao1 ao1Var = this.J;
        if (ao1Var != null) {
            ao1Var.e(i);
        }
        ua6 ua6Var = this.V;
        E(ua6Var != null ? ua6Var.p() : new ArrayList());
    }

    public final void E(ArrayList arrayList) {
        ArrayList arrayList2 = this.R;
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add((ca4) obj);
        }
        J(!arrayList2.isEmpty());
        e5 e5VarT = t();
        if (arrayList2.isEmpty()) {
            F();
            AppCompatImageView appCompatImageView = e5VarT.c;
            TextView textView = e5VarT.m;
            appCompatImageView.setImageDrawable(getDrawable(R.drawable.duv2_ic_back));
            textView.setTextSize(2, 22.0f);
            textView.setTypeface(ut5.a(this, R.font.rubik_semibold));
            e5VarT.c.setPadding(s7a.b(12), s7a.b(12), s7a.b(12), s7a.b(12));
            return;
        }
        TextView textView2 = e5VarT.m;
        AppCompatImageView appCompatImageView2 = e5VarT.f;
        AppCompatImageView appCompatImageView3 = e5VarT.c;
        textView2.setText(arrayList2.size() + " " + getString(R.string.item_selected));
        appCompatImageView3.setImageDrawable(getDrawable(R.drawable.ic_selected_close));
        textView2.setTextSize(2, 18.0f);
        textView2.setTypeface(ut5.a(this, R.font.rubik_medium));
        appCompatImageView3.setPadding(s7a.b(12), s7a.b(12), s7a.b(12), s7a.b(12));
        if (arrayList2.size() != this.I.size() || this.I.isEmpty()) {
            appCompatImageView2.setImageResource(R.drawable.duv1_ic_unselect_btn);
        } else {
            appCompatImageView2.setImageResource(R.drawable.duv1_ic_select_btn);
        }
    }

    public final void F() {
        String strValueOf;
        String strZ = z();
        strZ.getClass();
        int length = strZ.length();
        ro6 ro6Var = this.W;
        if (length > 0) {
            strValueOf = z();
            strValueOf.getClass();
        } else {
            strValueOf = String.valueOf((String) ro6Var.getValue());
        }
        this.Z = new df2(strValueOf);
        e5 e5VarT = t();
        if (((Boolean) this.Y.getValue()).booleanValue()) {
            e5VarT.m.setText(Build.MODEL);
            return;
        }
        TextView textView = e5VarT.m;
        String strZ2 = z();
        strZ2.getClass();
        textView.setText(strZ2.length() > 0 ? z() : new File(String.valueOf((String) ro6Var.getValue())).getName());
    }

    public final void H(jv4 jv4Var) {
        this.g0 = pm.w(getLayoutInflater());
        v60 v60Var = new v60(this, R.style.BottomSheetDialog);
        this.h0 = v60Var;
        pm pmVar = this.g0;
        pmVar.getClass();
        v60Var.setContentView((RelativeLayout) pmVar.b);
        v60 v60Var2 = this.h0;
        v60Var2.getClass();
        v60Var2.setCancelable(true);
        v60 v60Var3 = this.h0;
        v60Var3.getClass();
        v60Var3.create();
        v60 v60Var4 = this.h0;
        v60Var4.getClass();
        v60Var4.show();
        pm pmVar2 = this.g0;
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
            recyclerView.setItemAnimator(new wm2(2));
            recyclerView.setAdapter((on5) ap5Var2.a);
            recyclerView.setNestedScrollingEnabled(true);
            dt3 dt3VarA = kea.a(this);
            kg1 kg1Var = wl1.a;
            mk9.g(dt3VarA, c54.a, null, new gb0(this, ap5Var, ap5Var2, (i41) null, 27), 2);
        }
    }

    public final void I(jv4 jv4Var) {
        jv4Var.getClass();
        this.m0 = bv0.s(getLayoutInflater());
        pc pcVar = new pc(this, R.style.RoundedCornersDialog70);
        bv0 bv0Var = this.m0;
        pcVar.setView(bv0Var != null ? (LinearLayout) bv0Var.b : null);
        pcVar.a.m = false;
        qc qcVarCreate = pcVar.create();
        this.n0 = qcVarCreate;
        if (qcVarCreate != null) {
            qcVarCreate.show();
        }
        bv0 bv0Var2 = this.m0;
        if (bv0Var2 != null) {
            ((TextView) bv0Var2.f).setText(getString(jv4Var == jv4.a ? R.string.copying : R.string.moving));
            ((MaterialButton) bv0Var2.c).setOnClickListener(new b30(15, this, jv4Var));
        }
    }

    public final void J(boolean z) {
        e5 e5VarT = t();
        if (z) {
            e5VarT.e.setVisibility(8);
            e5VarT.b.setVisibility(0);
            e5VarT.d.setVisibility(0);
            e5VarT.g.setVisibility(0);
            e5VarT.f.setVisibility(0);
            return;
        }
        e5VarT.e.setVisibility(0);
        e5VarT.b.setVisibility(8);
        e5VarT.d.setVisibility(8);
        e5VarT.g.setVisibility(8);
        e5VarT.f.setVisibility(8);
    }

    @Override // defpackage.xe2
    public final void c(df2 df2Var, jv4 jv4Var) {
        jv4Var.getClass();
        this.U = jv4Var;
        v60 v60Var = this.h0;
        if (v60Var != null) {
            v60Var.dismiss();
        }
        y();
        if (jv4Var == jv4.b && bi3.b(df2Var.b, (String) this.W.getValue())) {
            String string = getString(R.string.you_can_t_move_to_the_same_folder);
            string.getClass();
            x92.l(this, string);
            B().a();
            return;
        }
        y();
        int iOrdinal = jv4Var.ordinal();
        int i = 2;
        ArrayList arrayList = this.R;
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                mq7.d();
                return;
            }
            try {
                if (s7a.j()) {
                    this.Z = df2Var;
                    pm2 pm2Var = new pm2(new ArrayList(), this, i);
                    ArrayList arrayList2 = new ArrayList(iv0.d(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        arrayList2.add(((ca4) obj).d);
                    }
                    MediaScannerConnection.scanFile(this, (String[]) arrayList2.toArray(new String[0]), null, pm2Var);
                    B().b();
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        arrayList3.add(new File(((ca4) obj2).d));
                    }
                    x();
                    dt3 dt3VarA = kea.a(this);
                    kg1 kg1Var = wl1.a;
                    this.T = mk9.g(dt3VarA, c54.a, null, new ra6(this, jv4Var, df2Var, arrayList3, null, 1), 2);
                }
            } catch (Exception unused) {
                HelperClass.showSnackBar(t().a, getString(R.string.move_failed));
            }
            xe6 xe6Var = this.T;
            if (xe6Var != null) {
                xe6Var.H(new u(26, this));
                return;
            }
            return;
        }
        try {
            if (!s7a.j()) {
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList.size();
                while (i2 < size3) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    arrayList4.add(new File(((ca4) obj3).d));
                }
                dt3 dt3VarA2 = kea.a(this);
                kg1 kg1Var2 = wl1.a;
                this.S = mk9.g(dt3VarA2, c54.a, null, new ra6(this, jv4Var, df2Var, arrayList4, null, 0), 2);
                return;
            }
            this.Z = df2Var;
            o82 o82Var = new o82((Context) this, df2Var.b);
            LinkedHashMap linkedHashMapJ = mm1.j(this);
            ArrayList arrayList5 = new ArrayList(linkedHashMapJ.size());
            Iterator it = linkedHashMapJ.entrySet().iterator();
            while (it.hasNext()) {
                arrayList5.add((List) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList6 = new ArrayList(arrayList5);
            ArrayList arrayList7 = new ArrayList();
            if (arrayList6.size() > 0) {
                int size4 = arrayList6.size();
                while (i2 < size4) {
                    Object obj4 = arrayList6.get(i2);
                    i2++;
                    List list = (List) obj4;
                    list.getClass();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add((Uri) it2.next());
                    }
                }
            }
            if (!hv0.q(arrayList7, o82Var.c())) {
                ul1.k(this.a0, o82Var);
                return;
            }
            dt3 dt3VarA3 = kea.a(this);
            kg1 kg1Var3 = wl1.a;
            this.S = mk9.g(dt3VarA3, c54.a, null, new oa6(this, null), 2);
        } catch (Exception unused2) {
            HelperClass.showSnackBar(t().a, getString(R.string.copy_failed));
        }
    }

    @Override // defpackage.d00, defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        ro6 ro6Var = this.H;
        String string = ((SP) ro6Var.getValue()).getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 16;
        int i3 = 0;
        int i4 = 1;
        if (bi3.b(string, Default.DARK)) {
            this.f0 = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.f0 = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.f0 = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(t().a);
        RelativeLayout relativeLayout = t().a;
        ma6 ma6Var = new ma6(this, i3);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, ma6Var);
        k().a(this, new n8(this, 26));
        this.V = new ua6(this);
        e5 e5VarT = t();
        int integer = ((SP) ro6Var.getValue()).getInteger(this, "gridCount", 1);
        tl2.b.getClass();
        tl2 tl2VarC = qq5.c(integer);
        this.M = tl2VarC;
        if (tl2VarC == tl2.GRID_5X5) {
            t().e.setImageResource(R.drawable.ic_grid_5_5);
        } else if (tl2VarC == tl2.GRID_4X4) {
            t().e.setImageResource(R.drawable.ic_grid_4_4);
        } else {
            t().e.setImageResource(R.drawable.ic_grid_3_3);
        }
        this.N = new GridLayoutManager(this, this.L);
        w(this.M);
        ua6 ua6Var = this.V;
        if (ua6Var != null) {
            ua6Var.e = this;
        }
        MyRecyclerView myRecyclerView = e5VarT.l;
        RecyclerViewFastScroller recyclerViewFastScroller = e5VarT.j;
        GridLayoutManager gridLayoutManager = this.N;
        if (gridLayoutManager == null) {
            bi3.g("gridLayoutManager");
            throw null;
        }
        myRecyclerView.setLayoutManager(gridLayoutManager);
        recyclerViewFastScroller.j(getColor(R.color.app_main_light));
        recyclerViewFastScroller.setScrollVertically(true);
        myRecyclerView.setMotionEventSplittingEnabled(false);
        u();
        myRecyclerView.setAdapter(this.V);
        if (this.K == null) {
            this.K = new fq8(new e65(8, this));
            ao1 ao1Var = new ao1();
            ao1Var.k = this.K;
            this.J = ao1Var;
            t().l.i(ao1Var);
        }
        J(!this.R.isEmpty());
        int i5 = 3;
        dm2 dm2Var = new dm2(i5, this);
        ul1 ul1Var = this.a0;
        ((ca6) ul1Var.d).c = new d63(i2, ul1Var, dm2Var);
        e5 e5VarT2 = t();
        F();
        e5VarT2.c.setOnClickListener(new sa6(this, i3));
        e5VarT2.g.setOnClickListener(new sa6(this, i4));
        e5VarT2.h.setOnClickListener(new ja6(this, i5));
        e5VarT2.i.setOnClickListener(new ja6(this, i3));
        int i6 = 2;
        e5VarT2.e.setOnClickListener(new sa6(this, i6));
        e5VarT2.f.setOnClickListener(new xy3(this, e5VarT2, i6));
        e5VarT2.d.setOnClickListener(new sa6(this, i5));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.P = new Bundle();
        xn5 layoutManager = t().l.getLayoutManager();
        Parcelable parcelableG0 = layoutManager != null ? layoutManager.g0() : null;
        this.Q = parcelableG0;
        Bundle bundle = this.P;
        if (bundle != null) {
            bundle.putParcelable(this.O, parcelableG0);
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        qc qcVar;
        super.onResume();
        if (AllAdsApproval.isCollectionSingleFolderBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            Admob admob = this.k0;
            if (i == 9) {
                int i2 = RemoteAdData.COLLECTION_SINGLE_FOLDER_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    admob.loadAdaptive_banner(this, t().k, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
                } else if (i2 == 2) {
                    admob.loadAdaptive_bannerAdax(this, t().k, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                admob.loadAdaptive_banner(this, t().k, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
            } else if (i == 2) {
                admob.loadAdaptive_bannerAdax(this, t().k, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            t().k.setVisibility(8);
        }
        qc qcVar2 = this.F;
        if (qcVar2 != null && qcVar2.isShowing() && (qcVar = this.F) != null) {
            qcVar.dismiss();
        }
        if (Build.VERSION.SDK_INT < 30) {
            String[] strArr = this.C;
            if (strArr == null) {
                bi3.g("permissionsStrList");
                throw null;
            }
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                String[] strArr2 = this.C;
                if (strArr2 == null) {
                    bi3.g("permissionsStrList");
                    throw null;
                }
                if (la9.a(this, strArr2[i3]) != 0) {
                    s(this.B);
                    return;
                }
            }
        }
        u();
    }

    @Override // defpackage.d00
    public final void u() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        xe6 xe6Var = this.l0;
        i41 i41Var = null;
        if (xe6Var != null) {
            xe6Var.f(null);
        }
        int i = 1;
        s7a.a = true;
        s7a.b = true;
        if (this.I.isEmpty()) {
            CPD.ShowDialog(this);
        }
        xe6 xe6VarG = mk9.g(kea.a(this), null, null, new pa6(this, i41Var, i), 3);
        this.l0 = xe6VarG;
        xe6VarG.H(new zm0(18));
    }

    public final void w(tl2 tl2Var) {
        int i;
        tl2Var.getClass();
        this.M = tl2Var;
        int iOrdinal = tl2Var.ordinal();
        if (iOrdinal == 0) {
            t().e.setImageResource(R.drawable.ic_grid_3_3);
            i = 3;
        } else if (iOrdinal == 1) {
            t().e.setImageResource(R.drawable.ic_grid_4_4);
            i = 4;
        } else if (iOrdinal != 2) {
            mq7.d();
            return;
        } else {
            t().e.setImageResource(R.drawable.ic_grid_5_5);
            i = 5;
        }
        this.L = i;
        GridLayoutManager gridLayoutManager = this.N;
        if (gridLayoutManager != null) {
            if (gridLayoutManager == null) {
                bi3.g("gridLayoutManager");
                throw null;
            }
            gridLayoutManager.u1(i);
            MyRecyclerView myRecyclerView = t().l;
            GridLayoutManager gridLayoutManager2 = this.N;
            if (gridLayoutManager2 != null) {
                myRecyclerView.setLayoutManager(gridLayoutManager2);
            } else {
                bi3.g("gridLayoutManager");
                throw null;
            }
        }
    }

    public final void x() {
        ua6 ua6Var = this.V;
        if (ua6Var != null) {
            ua6Var.j.clear();
            ua6Var.k = false;
            ua6Var.e();
        }
        ua6 ua6Var2 = this.V;
        E(ua6Var2 != null ? ua6Var2.p() : new ArrayList());
    }

    public final void y() {
        qc qcVar = this.n0;
        if (qcVar != null) {
            qcVar.dismiss();
        }
        v60 v60Var = this.h0;
        if (v60Var != null) {
            v60Var.dismiss();
        }
    }

    public final String z() {
        return (String) this.X.getValue();
    }
}