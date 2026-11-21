package com.gpsmapcamera.geotagginglocationonphoto.clusterImage.activity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.a;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.clusterImage.activity.PreviewActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.bi3;
import defpackage.bj;
import defpackage.cc7;
import defpackage.lt1;
import defpackage.nj2;
import defpackage.pr5;
import defpackage.ro6;
import defpackage.ub7;
import defpackage.w5;
import defpackage.x7;
import defpackage.xy3;
import defpackage.z55;
import java.io.File;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends bj {
    public static final /* synthetic */ int F = 0;
    public final ro6 B;
    public final ro6 C;
    public final Admob D = new Admob();
    public boolean E;

    public PreviewActivity() {
        final int i = 0;
        this.B = new ro6(new nj2(this) { // from class: xc5
            public final /* synthetic */ PreviewActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i2 = i;
                PreviewActivity previewActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = PreviewActivity.F;
                        View viewInflate = previewActivity.getLayoutInflater().inflate(R.layout.activity_preview, (ViewGroup) null, false);
                        int i4 = R.id.ivImage;
                        ImageView imageView = (ImageView) pn9.a(R.id.ivImage, viewInflate);
                        if (imageView != null) {
                            i4 = R.id.lay_toolbar;
                            View viewA = pn9.a(R.id.lay_toolbar, viewInflate);
                            if (viewA != null) {
                                l76 l76VarA = l76.a(viewA);
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                if (((RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate)) != null) {
                                    return new w5(constraintLayout, imageView, l76VarA, constraintLayout);
                                }
                                i4 = R.id.rel_adaptive_banner;
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = PreviewActivity.F;
                        return new SP(previewActivity);
                }
            }
        });
        final int i2 = 1;
        this.C = new ro6(new nj2(this) { // from class: xc5
            public final /* synthetic */ PreviewActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i3 = i2;
                PreviewActivity previewActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = PreviewActivity.F;
                        View viewInflate = previewActivity.getLayoutInflater().inflate(R.layout.activity_preview, (ViewGroup) null, false);
                        int i5 = R.id.ivImage;
                        ImageView imageView = (ImageView) pn9.a(R.id.ivImage, viewInflate);
                        if (imageView != null) {
                            i5 = R.id.lay_toolbar;
                            View viewA = pn9.a(R.id.lay_toolbar, viewInflate);
                            if (viewA != null) {
                                l76 l76VarA = l76.a(viewA);
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                if (((RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate)) != null) {
                                    return new w5(constraintLayout, imageView, l76VarA, constraintLayout);
                                }
                                i5 = R.id.rel_adaptive_banner;
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
                        return null;
                    default:
                        int i6 = PreviewActivity.F;
                        return new SP(previewActivity);
                }
            }
        });
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        super.onCreate(bundle);
        new HelperClass().SetLanguage(this);
        ro6 ro6Var = this.C;
        String string = ((SP) ro6Var.getValue()).getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 1;
        if (bi3.b(string, Default.DARK)) {
            this.E = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.E = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.E = true;
            setTheme(R.style.DarkAppTheme);
        }
        setContentView(s().a);
        ConstraintLayout constraintLayout = s().d;
        z55 z55Var = new z55(i2, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(constraintLayout, z55Var);
        Uri uri = Uri.parse(((SP) ro6Var.getValue()).getString(this, SP.IMAGE_URI_PREVIEW, " "));
        ((pr5) ((pr5) a.b(this).d(this).n(uri).j(1920, 1920)).f(R.drawable.null_image)).E(s().b);
        String stringExtra = getIntent().getStringExtra("ImgPath");
        ((RelativeLayout) s().c.j).setVisibility(0);
        ((TextView) s().c.l).setText(new File(stringExtra).getName());
        ((RelativeLayout) s().c.c).setOnClickListener(new x7(15, this));
        ((RelativeLayout) s().c.j).setOnClickListener(new xy3(this, uri, i2));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!AllAdsApproval.iSPreviewBanner(this)) {
            ((RelativeLayout) findViewById(R.id.rel_adaptive_banner)).setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        Admob admob = this.D;
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
        int i2 = RemoteAdData.PREVIEW_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            admob.loadAdaptive_banner(this, relativeLayout, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            admob.loadAdaptive_bannerAdax(this, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final w5 s() {
        return (w5) this.B.getValue();
    }
}