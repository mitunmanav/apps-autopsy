package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.itextpdf.text.html.HtmlTags;
import defpackage.ab9;
import defpackage.d7;
import defpackage.iv0;
import defpackage.j7;
import defpackage.mw3;
import defpackage.oz;
import defpackage.pz;
import defpackage.qz;
import defpackage.v6;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class Admob {
    j7 adView;

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.Admob$1, reason: invalid class name */
    public class AnonymousClass1 implements v6 {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ RelativeLayout val$banner_native_layout;

        public AnonymousClass1(Activity activity, RelativeLayout relativeLayout) {
            this.val$activity = activity;
            this.val$banner_native_layout = relativeLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$1(Activity activity, RelativeLayout relativeLayout) {
            if (RemoteAdData.SHOW_ADAX != 1 || RemoteAdData.ADAX_BANNER_ID.isEmpty()) {
                relativeLayout.setVisibility(8);
            } else {
                Admob.this.loadAdaptive_bannerAdax(activity, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
            }
        }

        @Override // defpackage.v6, defpackage.sm4
        public void onAdFailedToLoad(mw3 mw3Var) {
            Activity activity = this.val$activity;
            activity.runOnUiThread(new a(this, activity, this.val$banner_native_layout, 0));
        }

        @Override // defpackage.v6
        public void onAdLoaded(oz ozVar) {
            this.val$activity.runOnUiThread(new b(this.val$banner_native_layout, 0));
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.Admob$2, reason: invalid class name */
    public class AnonymousClass2 implements v6 {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ RelativeLayout val$banner_native_layout;

        public AnonymousClass2(Activity activity, RelativeLayout relativeLayout) {
            this.val$activity = activity;
            this.val$banner_native_layout = relativeLayout;
        }

        @Override // defpackage.v6, defpackage.sm4
        public void onAdFailedToLoad(mw3 mw3Var) {
            this.val$activity.runOnUiThread(new b(this.val$banner_native_layout, 1));
        }

        @Override // defpackage.v6
        public void onAdLoaded(oz ozVar) {
            this.val$activity.runOnUiThread(new b(this.val$banner_native_layout, 2));
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.Admob$3, reason: invalid class name */
    public class AnonymousClass3 implements v6 {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ RelativeLayout val$banner_native_layout;

        public AnonymousClass3(Activity activity, RelativeLayout relativeLayout) {
            this.val$activity = activity;
            this.val$banner_native_layout = relativeLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(Activity activity, RelativeLayout relativeLayout) {
            if (RemoteAdData.SHOW_ADAX != 1 || RemoteAdData.ADAX_BANNER_ID.isEmpty()) {
                return;
            }
            Admob.this.loadCollaps_bannerAdax(activity, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
        }

        @Override // defpackage.v6, defpackage.sm4
        public void onAdFailedToLoad(mw3 mw3Var) {
            Activity activity = this.val$activity;
            activity.runOnUiThread(new a(this, activity, this.val$banner_native_layout, 1));
        }

        @Override // defpackage.v6
        public void onAdLoaded(oz ozVar) {
        }
    }

    public void DestroyAd() {
        j7 j7Var = this.adView;
        if (j7Var != null) {
            if (j7Var.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.adView.getParent()).removeView(this.adView);
            }
            this.adView.c();
            this.adView = null;
        }
    }

    public int getAdWidth(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public void loadAdaptive_banner(Activity activity, RelativeLayout relativeLayout, String str) {
        try {
            j7 j7Var = this.adView;
            if (j7Var != null) {
                j7Var.c();
            }
            if (activity != null) {
                j7 j7Var2 = new j7(activity);
                this.adView = j7Var2;
                relativeLayout.addView(j7Var2);
                int adWidth = getAdWidth(activity);
                d7 d7Var = d7.g;
                d7 d7VarB = ab9.b(activity, adWidth, 0);
                str.getClass();
                this.adView.d(new qz(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null, d7VarB, iv0.f(d7VarB), null, false), new AnonymousClass1(activity, relativeLayout));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadAdaptive_bannerAdax(Activity activity, RelativeLayout relativeLayout, String str) {
        try {
            j7 j7Var = this.adView;
            if (j7Var != null) {
                j7Var.c();
            }
            if (activity != null) {
                j7 j7Var2 = new j7(activity);
                this.adView = j7Var2;
                relativeLayout.addView(j7Var2);
                d7 d7Var = d7.g;
                d7 d7VarB = ab9.b(activity, 360, 0);
                str.getClass();
                this.adView.d(new qz(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null, d7VarB, iv0.f(d7VarB), null, false), new AnonymousClass2(activity, relativeLayout));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadCollaps_banner(Activity activity, RelativeLayout relativeLayout, String str) {
        try {
            j7 j7Var = this.adView;
            if (j7Var != null) {
                j7Var.c();
            }
            if (activity != null) {
                j7 j7Var2 = new j7(activity);
                this.adView = j7Var2;
                relativeLayout.addView(j7Var2);
                Bundle bundle = new Bundle();
                bundle.putString("collapsible", HtmlTags.ALIGN_BOTTOM);
                d7 d7Var = d7.g;
                this.adView.d(((pz) new pz(str, ab9.b(activity, 360, 0)).b(bundle)).d(), new AnonymousClass3(activity, relativeLayout));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadCollaps_bannerAdax(Activity activity, RelativeLayout relativeLayout, String str) {
        try {
            j7 j7Var = this.adView;
            if (j7Var != null) {
                j7Var.c();
            }
            if (activity != null) {
                j7 j7Var2 = new j7(activity);
                this.adView = j7Var2;
                relativeLayout.addView(j7Var2);
                Bundle bundle = new Bundle();
                bundle.putString("collapsible", HtmlTags.ALIGN_BOTTOM);
                d7 d7Var = d7.g;
                this.adView.d(((pz) new pz(str, ab9.b(activity, 360, 0)).b(bundle)).d(), new v6() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.Admob.4
                    @Override // defpackage.v6, defpackage.sm4
                    public void onAdFailedToLoad(mw3 mw3Var) {
                    }

                    @Override // defpackage.v6
                    public void onAdLoaded(oz ozVar) {
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}