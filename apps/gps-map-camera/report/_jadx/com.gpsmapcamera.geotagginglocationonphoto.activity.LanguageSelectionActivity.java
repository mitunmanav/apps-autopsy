package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.androidmodule.camerax.views.BA.GBTljJJcQz;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.CameraActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.LanguageSelectionActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.model.LanguageItem;
import com.itextpdf.text.html.HtmlTags;
import com.itextpdf.text.pdf.BidiOrder;
import defpackage.a7;
import defpackage.ad3;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc7;
import defpackage.hv0;
import defpackage.lf3;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mv1;
import defpackage.n8;
import defpackage.q6;
import defpackage.tq3;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.v30;
import defpackage.w49;
import defpackage.xq3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LanguageSelectionActivity extends bj implements View.OnClickListener {
    public static final /* synthetic */ int V = 0;
    public AppBarLayout B;
    public RelativeLayout C;
    public RelativeLayout D;
    public TextView E;
    public TextView F;
    public RecyclerView G;
    public ArrayList H;
    public ArrayList I;
    public int J;
    public int K;
    public String L;
    public Intent M;
    public SP N;
    public MaterialCardView O;
    public FrameLayout P;
    public AppCompatButton Q;
    public boolean R = false;
    public final Admob S = new Admob();
    public mo1 T = null;
    public final Handler U = new Handler();

    public static void w(l12 l12Var, NativeAdView nativeAdView) {
        tv5 tv5Var = l12Var.m;
        String str = l12Var.g;
        String str2 = l12Var.f;
        String str3 = l12Var.d;
        if (nativeAdView != null) {
            nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.appinstall_headline));
            nativeAdView.setBodyView(nativeAdView.findViewById(R.id.appinstall_body));
            nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.appinstall_call_to_action));
            nativeAdView.setIconView(nativeAdView.findViewById(R.id.appinstall_app_icon));
            nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.appinstall_advertiser));
            if (str3 != null) {
                try {
                    ((TextView) nativeAdView.getHeadlineView()).setText(str3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (str2 != null) {
                try {
                    ((TextView) nativeAdView.getBodyView()).setText(str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (str != null) {
                try {
                    ((Button) nativeAdView.getCallToActionView()).setText(str);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            try {
                if (((Drawable) tv5Var.b) != null) {
                    ((ImageView) nativeAdView.getIconView()).setImageDrawable((Drawable) tv5Var.b);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            nativeAdView.b(l12Var, (MediaView) nativeAdView.findViewById(R.id.appinstall_media));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        if (view.getId() == R.id.toolbar_back || view.getId() == R.id.toolbar_done) {
            if (this.N.getBoolean(this, SP.ALL_PERMISSION_ACCESS, false)) {
                intent = new Intent(this, (Class<?>) CameraActivity.class);
                this.M = intent;
            } else if (this.N.getBoolean(this, SP.IS_SHOW_ONBOARDING, false)) {
                intent = new Intent(this, (Class<?>) Permission_Activity.class);
                this.M = intent;
            } else {
                intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                this.M = intent;
            }
            intent.setFlags(268435456);
            x();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        LanguageItem languageItem;
        byte b;
        ArrayList arrayList;
        int size;
        int i2;
        LanguageItem languageItem2;
        lt1.a(this);
        SP sp = new SP(this);
        this.N = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        int i3 = 0;
        int i4 = 1;
        if (string.equals(Default.DARK)) {
            this.R = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.R = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.R = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_language_selection);
        View viewFindViewById = findViewById(R.id.mainlay);
        xq3 xq3Var = new xq3(this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, xq3Var);
        this.J = this.N.getInteger(this, SP.LANGUAGE_COUNT, 0);
        this.B = (AppBarLayout) findViewById(R.id.toolbar);
        this.C = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.D = (RelativeLayout) findViewById(R.id.toolbar_done);
        this.O = (MaterialCardView) findViewById(R.id.card_view_home_ads);
        this.P = (FrameLayout) findViewById(R.id.nativeadframe);
        ((TextView) findViewById(R.id.tv_toolbar_title)).setText(getString(R.string.select_language));
        this.G = (RecyclerView) findViewById(R.id.select_lan_recyclerview);
        this.Q = (AppCompatButton) findViewById(R.id.btnSave);
        this.F = (TextView) findViewById(R.id.tv_home_subTitle);
        this.E = (TextView) findViewById(R.id.tv_home_title);
        if (this.J == 0) {
            this.B.setVisibility(8);
            this.Q.setVisibility(0);
        } else {
            this.F.setVisibility(8);
            this.E.setVisibility(8);
            this.Q.setVisibility(8);
            this.B.setVisibility(0);
        }
        this.L = this.N.getString(this, SP.SELECTED_LANGUAGE, Default.LANGUAGE);
        this.K = this.N.getInteger(this, SP.LANGUAGE_POS, 0);
        this.Q.setOnClickListener(new zq3(this, i3));
        this.C.setOnClickListener(new zq3(this, i4));
        this.D.setOnClickListener(this);
        this.G.setLayoutManager(new LinearLayoutManager(this));
        this.H = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.I = arrayList2;
        arrayList2.add(new LanguageItem(2, "हिन्दी (Hindi)", "हिन्दी", "Hindi", "ह"));
        this.I.add(new LanguageItem(2, "ಕನ್ನಡ (Kannada)", "ಕನ್ನಡ", "Kannada", "ಕ"));
        this.I.add(new LanguageItem(2, "தமிழ் (Tamil)", "தமிழ்", "Tamil", "த"));
        this.I.add(new LanguageItem(2, "मराठी (Marathi)", "मराठी", "Marathi", "म"));
        this.I.add(new LanguageItem(2, "ગુજરાતી (Gujarati)", "ગુજરાતી", "Gujarati", "ગ"));
        this.I.add(new LanguageItem(2, "বাংলা (Bengali)", "বাংলা", "Bengali", "ব"));
        LanguageItem languageItem3 = new LanguageItem(0, Default.LANGUAGE, Default.LANGUAGE, Default.LANGUAGE, R.drawable.ic_english);
        LanguageItem languageItem4 = new LanguageItem(0, "bahasa Indonesia (Indonesian)", "bahasa Indonesia", "Indonesian", R.drawable.ic_indonesian);
        LanguageItem languageItem5 = new LanguageItem(0, "Tiếng Việt (Vietnamese)", "Tiếng Việt", "Vietnamese", R.drawable.ic_vietnamese);
        LanguageItem languageItem6 = new LanguageItem(0, "ไทย (Thai)", "ไทย", "Thai", R.drawable.ic_thai);
        LanguageItem languageItem7 = new LanguageItem(0, "Português (Portuguese)", "Português", "Portuguese", R.drawable.ic_portuguese);
        LanguageItem languageItem8 = new LanguageItem(0, "Русский (Russian)", "Русский", "Russian", R.drawable.ic_russian);
        LanguageItem languageItem9 = new LanguageItem(0, "Français (French)", "Français", "French", R.drawable.ic_french);
        LanguageItem languageItem10 = new LanguageItem(0, "한국인 (Korean)", "한국인", "Korean", R.drawable.ic_korean);
        LanguageItem languageItem11 = new LanguageItem(0, "Deutsch (German)", "Deutsch", "German", R.drawable.ic_germany);
        LanguageItem languageItem12 = new LanguageItem(0, "漢語 (Chinese)", "漢語", "Chinese", R.drawable.ic_china);
        LanguageItem languageItem13 = new LanguageItem(0, "Italiano (Italian)", "Italiano", "Italian", R.drawable.ic_itali);
        LanguageItem languageItem14 = new LanguageItem(0, "Española (Spanish)", "Española", GBTljJJcQz.VfPkEbFJTmbcAkI, R.drawable.ic_spanish);
        LanguageItem languageItem15 = new LanguageItem(0, "Bahasa Melayu (Malay)", "Bahasa Melayu", "Malay", R.drawable.ic_malaysia);
        LanguageItem languageItemCreateIndiaHeader = LanguageItem.createIndiaHeader(R.drawable.ic_hindi);
        String lowerCase = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso == null || networkCountryIso.isEmpty()) {
                networkCountryIso = telephonyManager.getSimCountryIso();
            }
            if (networkCountryIso == null || networkCountryIso.isEmpty()) {
                LocaleList locales = getResources().getConfiguration().getLocales();
                str = SP.SELECTED_LANGUAGE;
                try {
                    networkCountryIso = locales.get(0).getCountry();
                } catch (Exception unused) {
                }
            } else {
                str = SP.SELECTED_LANGUAGE;
            }
            if (networkCountryIso != null) {
                lowerCase = networkCountryIso.toLowerCase();
            }
            while (true) {
                if (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    LanguageItem languageItem16 = (LanguageItem) obj;
                    if (languageItem16.getKeyName().equals(this.L)) {
                        languageItem16.setSelected(true);
                        languageItemCreateIndiaHeader.setSelectedSubLanguage(languageItem16.getKeyName());
                        languageItem2 = languageItem16;
                    }
                } else {
                    languageItem2 = null;
                }
            }
        } catch (Exception unused2) {
            str = SP.SELECTED_LANGUAGE;
        }
        String lowerCase2 = lowerCase.toLowerCase();
        this.H.add(languageItem3);
        if (lowerCase2.equals("in")) {
            languageItemCreateIndiaHeader.setExpanded(true);
            this.H.add(languageItemCreateIndiaHeader);
            this.H.addAll(this.I);
            this.H.add(languageItem4);
            this.H.add(languageItem14);
            this.H.add(languageItem5);
            this.H.add(languageItem6);
            this.H.add(languageItem7);
            this.H.add(languageItem8);
            this.H.add(languageItem9);
            this.H.add(languageItem10);
            this.H.add(languageItem11);
            this.H.add(languageItem13);
            this.H.add(languageItem12);
            this.H.add(languageItem15);
        } else {
            languageItemCreateIndiaHeader.setExpanded(false);
            byte b2 = -1;
            switch (lowerCase2.hashCode()) {
                case 3179:
                    if (lowerCase2.equals("cn")) {
                        b2 = 0;
                    }
                    break;
                case 3201:
                    if (lowerCase2.equals("de")) {
                        b2 = 1;
                    }
                    break;
                case 3246:
                    if (lowerCase2.equals("es")) {
                        b = 2;
                        b2 = b;
                    }
                    break;
                case 3276:
                    if (lowerCase2.equals("fr")) {
                        b = 3;
                        b2 = b;
                    }
                    break;
                case 3355:
                    if (lowerCase2.equals("id")) {
                        b = 4;
                        b2 = b;
                    }
                    break;
                case 3371:
                    if (lowerCase2.equals("it")) {
                        b = 5;
                        b2 = b;
                    }
                    break;
                case 3428:
                    if (lowerCase2.equals("ko")) {
                        b = 6;
                        b2 = b;
                    }
                    break;
                case 3494:
                    if (lowerCase2.equals("ms")) {
                        b = 7;
                        b2 = b;
                    }
                    break;
                case 3500:
                    if (lowerCase2.equals("my")) {
                        b2 = 8;
                    }
                    break;
                case 3588:
                    if (lowerCase2.equals("pt")) {
                        b = 9;
                        b2 = b;
                    }
                    break;
                case 3651:
                    if (lowerCase2.equals("ru")) {
                        b = 10;
                        b2 = b;
                    }
                    break;
                case 3700:
                    if (lowerCase2.equals(HtmlTags.TH)) {
                        b = BidiOrder.AN;
                        b2 = b;
                    }
                    break;
                case 3768:
                    if (lowerCase2.equals("vn")) {
                        b2 = 12;
                    }
                    break;
                case 3886:
                    if (lowerCase2.equals("zh")) {
                        b = BidiOrder.NSM;
                        b2 = b;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                case 13:
                    languageItem = languageItem12;
                    break;
                case 1:
                    languageItem = languageItem11;
                    break;
                case 2:
                    languageItem = languageItem14;
                    break;
                case 3:
                    languageItem = languageItem9;
                    break;
                case 4:
                    languageItem = languageItem4;
                    break;
                case 5:
                    languageItem = languageItem13;
                    break;
                case 6:
                    languageItem = languageItem10;
                    break;
                case 7:
                case 8:
                    languageItem = languageItem15;
                    break;
                case 9:
                    languageItem = languageItem7;
                    break;
                case 10:
                    languageItem = languageItem8;
                    break;
                case 11:
                    languageItem = languageItem6;
                    break;
                case 12:
                    languageItem = languageItem5;
                    break;
                default:
                    languageItem = null;
                    break;
            }
            if (languageItem != null) {
                this.H.add(languageItem);
            }
            LanguageItem[] languageItemArr = {languageItem4, languageItem14, languageItem5, languageItem6, languageItem7, languageItem8, languageItem9, languageItem10, languageItem11, languageItem13, languageItem12, languageItem15};
            for (int i5 = 0; i5 < 12; i5++) {
                LanguageItem languageItem17 = languageItemArr[i5];
                if (languageItem17 != languageItem && !this.H.contains(languageItem17)) {
                    this.H.add(languageItem17);
                }
            }
            this.H.add(languageItemCreateIndiaHeader);
        }
        this.L = this.N.getString(this, str, Default.LANGUAGE);
        arrayList = this.I;
        size = arrayList.size();
        i2 = 0;
        if (languageItem2 == null) {
            ArrayList arrayList3 = this.H;
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                LanguageItem languageItem18 = (LanguageItem) obj2;
                if (languageItem18.getKeyName().equals(this.L)) {
                    languageItem18.setSelected(true);
                    languageItem2 = languageItem18;
                }
            }
        }
        if (languageItem2 == null && !this.H.isEmpty()) {
            languageItem2 = (LanguageItem) this.H.get(0);
            languageItem2.setSelected(true);
            this.L = languageItem2.getKeyName();
        }
        if (languageItem2 != null) {
            String englishName = languageItem2.getEnglishName();
            if (this.Q != null && englishName != null && !englishName.isEmpty()) {
                this.Q.setText(getString(R.string.continue_in_language, englishName));
            }
        }
        this.G.setAdapter(new tq3(this, this.H, this.I, new xq3(this)));
        this.Q.setTextColor(getColor(R.color.black_light));
        k().a(this, new n8(this, 14));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.S;
        if (admob != null) {
            admob.DestroyAd();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.iSLanguageBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i != 9) {
                if (i == 1) {
                    u();
                    return;
                } else {
                    if (i == 2) {
                        v();
                        return;
                    }
                    return;
                }
            }
            int i2 = RemoteAdData.LANGUAGE_SCREEN_BANNER_TYPE;
            if (i2 == 1) {
                u();
            } else if (i2 == 2) {
                v();
            }
        }
    }

    public final void s() {
        final int i = 0;
        int integer = this.N.getInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i2 = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSLanguageScreenFS(this)) {
            if (t()) {
                this.M = new Intent(this, (Class<?>) CameraActivity.class);
                x();
                return;
            } else {
                setResult(0, this.M);
                finish();
                return;
            }
        }
        final int i3 = 1;
        if (integer >= RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler().postDelayed(new Runnable(this) { // from class: yq3
                public final /* synthetic */ LanguageSelectionActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    LanguageSelectionActivity languageSelectionActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = LanguageSelectionActivity.V;
                            languageSelectionActivity.N.setInteger(languageSelectionActivity, HelperClass.SETTING_COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                int i7 = RemoteAdData.LANGUAGE_BACK_SCREEN_FS_TYPE;
                                if (i7 == 1) {
                                    languageSelectionActivity.y();
                                } else if (i7 == 2) {
                                    languageSelectionActivity.z();
                                }
                            } else if (i6 == 1) {
                                languageSelectionActivity.y();
                            } else if (i6 == 2) {
                                languageSelectionActivity.z();
                            }
                            break;
                        default:
                            int i8 = LanguageSelectionActivity.V;
                            mo1 mo1Var = languageSelectionActivity.T;
                            if (mo1Var != null) {
                                mo1Var.b.a(languageSelectionActivity);
                            } else if (!languageSelectionActivity.t()) {
                                languageSelectionActivity.setResult(0, languageSelectionActivity.M);
                                languageSelectionActivity.finish();
                            } else {
                                languageSelectionActivity.M = new Intent(languageSelectionActivity, (Class<?>) CameraActivity.class);
                                languageSelectionActivity.x();
                            }
                            break;
                    }
                }
            }, 200L);
            this.U.postDelayed(new Runnable(this) { // from class: yq3
                public final /* synthetic */ LanguageSelectionActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    LanguageSelectionActivity languageSelectionActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = LanguageSelectionActivity.V;
                            languageSelectionActivity.N.setInteger(languageSelectionActivity, HelperClass.SETTING_COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                int i7 = RemoteAdData.LANGUAGE_BACK_SCREEN_FS_TYPE;
                                if (i7 == 1) {
                                    languageSelectionActivity.y();
                                } else if (i7 == 2) {
                                    languageSelectionActivity.z();
                                }
                            } else if (i6 == 1) {
                                languageSelectionActivity.y();
                            } else if (i6 == 2) {
                                languageSelectionActivity.z();
                            }
                            break;
                        default:
                            int i8 = LanguageSelectionActivity.V;
                            mo1 mo1Var = languageSelectionActivity.T;
                            if (mo1Var != null) {
                                mo1Var.b.a(languageSelectionActivity);
                            } else if (!languageSelectionActivity.t()) {
                                languageSelectionActivity.setResult(0, languageSelectionActivity.M);
                                languageSelectionActivity.finish();
                            } else {
                                languageSelectionActivity.M = new Intent(languageSelectionActivity, (Class<?>) CameraActivity.class);
                                languageSelectionActivity.x();
                            }
                            break;
                    }
                }
            }, 7000L);
            return;
        }
        this.N.setInteger(this, HelperClass.SETTING_COUNTADS, integer + 1);
        if (t()) {
            this.M = new Intent(this, (Class<?>) CameraActivity.class);
            x();
        } else {
            setResult(0, this.M);
            finish();
        }
    }

    public final boolean t() {
        String string = this.N.getString(this, SP.SELECTED_LANGUAGE, Default.LANGUAGE);
        String str = this.L;
        return (str == null || str.equals(string)) ? false : true;
    }

    public final void u() {
        List listAsList = Arrays.asList(lm4.a);
        String str = RemoteAdData.LANGUGAE_SCREEN_NATIVE_ID;
        str.getClass();
        listAsList.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listAsList);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new tv5(27, this));
    }

    public final void v() {
        List listAsList = Arrays.asList(lm4.a);
        String str = RemoteAdData.ADAX_NATIVE_ID;
        str.getClass();
        listAsList.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listAsList);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 1));
    }

    public final void x() {
        this.N.setString(this, SP.SELECTED_LANGUAGE, this.L);
        this.N.setInteger(this, SP.LANGUAGE_POS, this.K);
        new HelperClass().SetLanguage(this);
        Intent intent = this.M;
        if (intent == null) {
            intent = new Intent();
            this.M = intent;
        }
        intent.setFlags(268435456);
        setResult(-1, this.M);
        startActivity(this.M);
    }

    public final void y() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ad3(2, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void z() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new lf3(2, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}