package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import defpackage.g00;
import defpackage.m8;
import defpackage.m81;
import defpackage.mw3;
import defpackage.om4;
import defpackage.oz;
import defpackage.p6;
import defpackage.sm4;
import defpackage.v8;

/* JADX INFO: loaded from: classes.dex */
public final class AdsUtils$Companion$loadNativeAdax$adCallback$1 implements sm4 {
    final /* synthetic */ Activity $context;
    final /* synthetic */ FrameLayout $frameLayout;
    final /* synthetic */ int $layoutResId;
    final /* synthetic */ ProgressBar $pbNative;

    public AdsUtils$Companion$loadNativeAdax$adCallback$1(Activity activity, int i, FrameLayout frameLayout, ProgressBar progressBar) {
        this.$context = activity;
        this.$layoutResId = i;
        this.$frameLayout = frameLayout;
        this.$pbNative = progressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdFailedToLoad$lambda$1(FrameLayout frameLayout, ProgressBar progressBar) {
        frameLayout.setVisibility(8);
        progressBar.setVisibility(0);
        AdsUtils.Companion.setAdLoaded(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNativeAdLoaded$lambda$0(Activity activity, int i, om4 om4Var, FrameLayout frameLayout, ProgressBar progressBar) {
        p6 mNativeAd;
        Object systemService = activity.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(i, (ViewGroup) null);
        viewInflate.getClass();
        NativeAdView nativeAdView = (NativeAdView) viewInflate;
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.primary));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.secondary));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.call_to_action));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.tertiary));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.icon));
        AdsUtils.Companion companion = AdsUtils.Companion;
        if (companion.getMNativeAd() != null && (mNativeAd = companion.getMNativeAd()) != null) {
            ((g00) mNativeAd).destroy();
        }
        companion.setMNativeAd(om4Var);
        om4 mNativeAd2 = companion.getMNativeAd();
        if (mNativeAd2 != null) {
            companion.populateUnifiedNativeAdView(nativeAdView, mNativeAd2);
        }
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
        companion.setAdLoaded(true);
        progressBar.setVisibility(8);
    }

    @Override // defpackage.sm4
    public void onAdFailedToLoad(mw3 mw3Var) {
        mw3Var.getClass();
        this.$context.runOnUiThread(new m8(1, this.$frameLayout, this.$pbNative));
    }

    @Override // defpackage.sm4
    public /* bridge */ void onAdLoadingCompleted() {
    }

    @Override // defpackage.sm4
    public void onBannerAdLoaded(oz ozVar) {
        ozVar.getClass();
    }

    @Override // defpackage.sm4
    public void onCustomNativeAdLoaded(m81 m81Var) {
        m81Var.getClass();
    }

    @Override // defpackage.sm4
    public void onNativeAdLoaded(om4 om4Var) {
        om4Var.getClass();
        Activity activity = this.$context;
        activity.runOnUiThread(new v8(activity, this.$layoutResId, om4Var, this.$frameLayout, this.$pbNative, 1));
    }
}