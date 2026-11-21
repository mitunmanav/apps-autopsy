package com.gpsmapcamera.geotagginglocationonphoto.helper;

import ads_mobile_sdk.l12;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.j7;
import defpackage.lm4;
import defpackage.mm4;
import defpackage.mv1;
import defpackage.om4;
import defpackage.q6;
import defpackage.tv5;
import defpackage.um4;
import defpackage.w49;
import defpackage.yd1;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AdsUtils {
    public static final Companion Companion = new Companion(null);
    private static boolean adLoaded;
    private static j7 adView;
    private static om4 mNativeAd;
    private static ExecutorService service;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public static /* synthetic */ void loadNative$default(Companion companion, Activity activity, String str, FrameLayout frameLayout, ProgressBar progressBar, int i, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                i = R.layout.admob_native_medium;
            }
            companion.loadNative(activity, str, frameLayout, progressBar, i);
        }

        public static /* synthetic */ void loadNativeAdax$default(Companion companion, Activity activity, String str, FrameLayout frameLayout, ProgressBar progressBar, int i, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                i = R.layout.admob_native_medium;
            }
            companion.loadNativeAdax(activity, str, frameLayout, progressBar, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void populateUnifiedNativeAdView(NativeAdView nativeAdView, om4 om4Var) {
            View headlineView = nativeAdView.getHeadlineView();
            TextView textView = headlineView instanceof TextView ? (TextView) headlineView : null;
            if (textView != null) {
                textView.setText(((l12) om4Var).d);
            }
            if (((l12) om4Var).f != null) {
                View bodyView = nativeAdView.getBodyView();
                TextView textView2 = bodyView instanceof TextView ? (TextView) bodyView : null;
                if (textView2 != null) {
                    textView2.setText(((l12) om4Var).f);
                }
                View bodyView2 = nativeAdView.getBodyView();
                if (bodyView2 != null) {
                    bodyView2.setVisibility(0);
                }
            } else {
                View bodyView3 = nativeAdView.getBodyView();
                if (bodyView3 != null) {
                    bodyView3.setVisibility(8);
                }
            }
            l12 l12Var = (l12) om4Var;
            String str = l12Var.h;
            String str2 = l12Var.g;
            if (str2 != null && str2.length() != 0) {
                View callToActionView = nativeAdView.getCallToActionView();
                TextView textView3 = callToActionView instanceof TextView ? (TextView) callToActionView : null;
                if (textView3 != null) {
                    textView3.setText(str2);
                }
            }
            tv5 tv5Var = l12Var.m;
            View viewFindViewById = nativeAdView.findViewById(R.id.cardIcon);
            if (tv5Var == null) {
                View iconView = nativeAdView.getIconView();
                if (iconView != null) {
                    iconView.setVisibility(8);
                }
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
            } else {
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                if (nativeAdView.getIconView() != null) {
                    View iconView2 = nativeAdView.getIconView();
                    iconView2.getClass();
                    ((ImageView) iconView2).setImageDrawable((Drawable) tv5Var.b);
                    View iconView3 = nativeAdView.getIconView();
                    if (iconView3 != null) {
                        iconView3.setVisibility(0);
                    }
                }
            }
            if (str == null) {
                View advertiserView = nativeAdView.getAdvertiserView();
                if (advertiserView != null) {
                    advertiserView.setVisibility(8);
                }
            } else {
                View advertiserView2 = nativeAdView.getAdvertiserView();
                TextView textView4 = advertiserView2 instanceof TextView ? (TextView) advertiserView2 : null;
                if (textView4 != null) {
                    textView4.setText(str);
                }
                View advertiserView3 = nativeAdView.getAdvertiserView();
                if (advertiserView3 != null) {
                    advertiserView3.setVisibility(0);
                }
            }
            MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.media_view);
            if (mediaView != null) {
                nativeAdView.b(om4Var, mediaView);
            }
        }

        public final boolean getAdLoaded() {
            return AdsUtils.adLoaded;
        }

        public final om4 getMNativeAd() {
            return AdsUtils.mNativeAd;
        }

        public final ExecutorService getService() {
            return AdsUtils.service;
        }

        public final void loadNative(Activity activity, String str, FrameLayout frameLayout, ProgressBar progressBar, int i) {
            activity.getClass();
            str.getClass();
            frameLayout.getClass();
            progressBar.getClass();
            List listF = iv0.f(lm4.a);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Bundle bundle = new Bundle();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List listU = hv0.U(listF);
            mv1 mv1Var = mv1.a;
            w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new AdsUtils$Companion$loadNative$adCallback$1(activity, i, frameLayout, progressBar));
        }

        public final void loadNativeAdax(Activity activity, String str, FrameLayout frameLayout, ProgressBar progressBar, int i) {
            activity.getClass();
            str.getClass();
            frameLayout.getClass();
            progressBar.getClass();
            List listF = iv0.f(lm4.a);
            String str2 = RemoteAdData.ADAX_NATIVE_ID;
            str2.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Bundle bundle = new Bundle();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List listU = hv0.U(listF);
            mv1 mv1Var = mv1.a;
            w49.s(new um4(str2, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new AdsUtils$Companion$loadNativeAdax$adCallback$1(activity, i, frameLayout, progressBar));
        }

        public final void setAdLoaded(boolean z) {
            AdsUtils.adLoaded = z;
        }

        public final void setMNativeAd(om4 om4Var) {
            AdsUtils.mNativeAd = om4Var;
        }

        public final void setService(ExecutorService executorService) {
            AdsUtils.service = executorService;
        }
    }
}