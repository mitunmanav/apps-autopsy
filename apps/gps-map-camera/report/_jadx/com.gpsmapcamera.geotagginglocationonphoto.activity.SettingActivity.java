package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.firebase.concurrent.cf.OTysxApt;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.PreferenceKeys;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.onesignal.core.services.xoOP.QRjU;
import defpackage.a7;
import defpackage.a76;
import defpackage.bj;
import defpackage.c6;
import defpackage.c66;
import defpackage.c76;
import defpackage.cc7;
import defpackage.er3;
import defpackage.i6;
import defpackage.j64;
import defpackage.k6;
import defpackage.l36;
import defpackage.l76;
import defpackage.lt1;
import defpackage.mq7;
import defpackage.n8;
import defpackage.pn9;
import defpackage.ub7;
import defpackage.vc4;
import defpackage.ws3;
import defpackage.z55;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SettingActivity extends bj {
    public static final /* synthetic */ int R = 0;
    public k6 B;
    public SP G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean N;
    public final i6 O;
    public mo1 P;
    public final Handler Q;
    public boolean C = true;
    public boolean D = true;
    public boolean E = true;
    public final long F = 1000;
    public AlertDialog K = null;
    public AlertDialog L = null;
    public AlertDialog M = null;

    public SettingActivity() {
        new HelperClass();
        this.N = false;
        this.O = (i6) n(new l36(1), new c6(3));
        this.P = null;
        this.Q = new Handler();
    }

    @Override // defpackage.bh2, defpackage.gy0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 42) {
            return;
        }
        Log.d(":::sd_card:::", "returned_treeUri: " + intent);
        String str = QRjU.EOLSOWpb;
        if (i2 != -1 || intent == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            if (defaultSharedPreferences.getString(str, "").isEmpty()) {
                SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
                editorEdit.putBoolean(PreferenceKeys.IS_SDCARD_PERMISSION_TAKEN, false);
                editorEdit.apply();
                v(false);
                Log.e(":::TyTyTy:::", "onActivityResult: ");
                return;
            }
            return;
        }
        Uri data = intent.getData();
        try {
            getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
            SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(this).edit();
            editorEdit2.putString(str, data.toString());
            editorEdit2.apply();
            v(true);
            Log.e(":::sd_card:::", "update folder history for saf");
            data.toString();
        } catch (SecurityException e) {
            e.printStackTrace();
            SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this);
            if (defaultSharedPreferences2.getString(str, "").isEmpty()) {
                SharedPreferences.Editor editorEdit3 = defaultSharedPreferences2.edit();
                editorEdit3.putBoolean(PreferenceKeys.IS_SDCARD_PERMISSION_TAKEN, false);
                editorEdit3.apply();
            }
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.G = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 0;
        int i3 = 1;
        if (string.equals(Default.DARK)) {
            this.N = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.N = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.N = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_setting, (ViewGroup) null, false);
        int i4 = R.id.adLayout;
        View viewA = pn9.a(R.id.adLayout, viewInflate);
        if (viewA != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewA;
            er3 er3Var = new er3(i2, relativeLayout, relativeLayout);
            i4 = R.id.camTrackingSwitch;
            SwitchMaterial switchMaterial = (SwitchMaterial) pn9.a(R.id.camTrackingSwitch, viewInflate);
            if (switchMaterial != null) {
                i4 = R.id.img_watermarkpro;
                ImageView imageView = (ImageView) pn9.a(R.id.img_watermarkpro, viewInflate);
                if (imageView != null) {
                    i4 = R.id.iv_probanner_1;
                    if (((ImageView) pn9.a(R.id.iv_probanner_1, viewInflate)) != null) {
                        i4 = R.id.iv_probanner_2;
                        if (((ImageView) pn9.a(R.id.iv_probanner_2, viewInflate)) != null) {
                            i4 = R.id.lay_toolbar;
                            View viewA2 = pn9.a(R.id.lay_toolbar, viewInflate);
                            if (viewA2 != null) {
                                l76 l76VarA = l76.a(viewA2);
                                i4 = R.id.lin_reporting_setting_badge;
                                LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.lin_reporting_setting_badge, viewInflate);
                                if (linearLayout != null) {
                                    i4 = R.id.llAppTheme;
                                    LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.llAppTheme, viewInflate);
                                    if (linearLayout2 != null) {
                                        i4 = R.id.ll_cam_tracking;
                                        LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.ll_cam_tracking, viewInflate);
                                        if (linearLayout3 != null) {
                                            i4 = R.id.ll_email_setting;
                                            LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.ll_email_setting, viewInflate);
                                            if (linearLayout4 != null) {
                                                i4 = R.id.ll_faq;
                                                LinearLayout linearLayout5 = (LinearLayout) pn9.a(R.id.ll_faq, viewInflate);
                                                if (linearLayout5 != null) {
                                                    i4 = R.id.ll_img_quality;
                                                    LinearLayout linearLayout6 = (LinearLayout) pn9.a(R.id.ll_img_quality, viewInflate);
                                                    if (linearLayout6 != null) {
                                                        i4 = R.id.ll_language;
                                                        LinearLayout linearLayout7 = (LinearLayout) pn9.a(R.id.ll_language, viewInflate);
                                                        if (linearLayout7 != null) {
                                                            i4 = R.id.ll_ourApps;
                                                            LinearLayout linearLayout8 = (LinearLayout) pn9.a(R.id.ll_ourApps, viewInflate);
                                                            if (linearLayout8 != null) {
                                                                i4 = R.id.llPDFReportsSetting;
                                                                LinearLayout linearLayout9 = (LinearLayout) pn9.a(R.id.llPDFReportsSetting, viewInflate);
                                                                if (linearLayout9 != null) {
                                                                    i4 = R.id.llPDFSetting;
                                                                    LinearLayout linearLayout10 = (LinearLayout) pn9.a(R.id.llPDFSetting, viewInflate);
                                                                    if (linearLayout10 != null) {
                                                                        i4 = R.id.ll_privacypolicy;
                                                                        LinearLayout linearLayout11 = (LinearLayout) pn9.a(R.id.ll_privacypolicy, viewInflate);
                                                                        if (linearLayout11 != null) {
                                                                            i4 = R.id.ll_probanner_text;
                                                                            if (((LinearLayout) pn9.a(R.id.ll_probanner_text, viewInflate)) != null) {
                                                                                i4 = R.id.ll_qrcode_scanning;
                                                                                LinearLayout linearLayout12 = (LinearLayout) pn9.a(R.id.ll_qrcode_scanning, viewInflate);
                                                                                if (linearLayout12 != null) {
                                                                                    i4 = R.id.llQuickShare;
                                                                                    LinearLayout linearLayout13 = (LinearLayout) pn9.a(R.id.llQuickShare, viewInflate);
                                                                                    if (linearLayout13 != null) {
                                                                                        i4 = R.id.ll_rateApp;
                                                                                        LinearLayout linearLayout14 = (LinearLayout) pn9.a(R.id.ll_rateApp, viewInflate);
                                                                                        if (linearLayout14 != null) {
                                                                                            i4 = R.id.ll_saveOriginalphoto;
                                                                                            LinearLayout linearLayout15 = (LinearLayout) pn9.a(R.id.ll_saveOriginalphoto, viewInflate);
                                                                                            if (linearLayout15 != null) {
                                                                                                i4 = R.id.ll_sdcard;
                                                                                                LinearLayout linearLayout16 = (LinearLayout) pn9.a(R.id.ll_sdcard, viewInflate);
                                                                                                if (linearLayout16 != null) {
                                                                                                    i4 = R.id.ll_sendanerror;
                                                                                                    LinearLayout linearLayout17 = (LinearLayout) pn9.a(R.id.ll_sendanerror, viewInflate);
                                                                                                    if (linearLayout17 != null) {
                                                                                                        i4 = R.id.ll_shareApp;
                                                                                                        LinearLayout linearLayout18 = (LinearLayout) pn9.a(R.id.ll_shareApp, viewInflate);
                                                                                                        if (linearLayout18 != null) {
                                                                                                            i4 = R.id.llTemplateOrientation;
                                                                                                            LinearLayout linearLayout19 = (LinearLayout) pn9.a(R.id.llTemplateOrientation, viewInflate);
                                                                                                            if (linearLayout19 != null) {
                                                                                                                i4 = R.id.ll_touch_setting;
                                                                                                                LinearLayout linearLayout20 = (LinearLayout) pn9.a(R.id.ll_touch_setting, viewInflate);
                                                                                                                if (linearLayout20 != null) {
                                                                                                                    i4 = R.id.ll_user_guide;
                                                                                                                    LinearLayout linearLayout21 = (LinearLayout) pn9.a(R.id.ll_user_guide, viewInflate);
                                                                                                                    if (linearLayout21 != null) {
                                                                                                                        i4 = R.id.ll_vid_quality;
                                                                                                                        LinearLayout linearLayout22 = (LinearLayout) pn9.a(R.id.ll_vid_quality, viewInflate);
                                                                                                                        if (linearLayout22 != null) {
                                                                                                                            i4 = R.id.ll_videoTutorial;
                                                                                                                            LinearLayout linearLayout23 = (LinearLayout) pn9.a(R.id.ll_videoTutorial, viewInflate);
                                                                                                                            if (linearLayout23 != null) {
                                                                                                                                i4 = R.id.ll_vol_btn_setting;
                                                                                                                                LinearLayout linearLayout24 = (LinearLayout) pn9.a(R.id.ll_vol_btn_setting, viewInflate);
                                                                                                                                if (linearLayout24 != null) {
                                                                                                                                    i4 = R.id.ll_watermark;
                                                                                                                                    LinearLayout linearLayout25 = (LinearLayout) pn9.a(R.id.ll_watermark, viewInflate);
                                                                                                                                    if (linearLayout25 != null) {
                                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                                                                                                                        i4 = R.id.pdfReportsSwitch;
                                                                                                                                        SwitchMaterial switchMaterial2 = (SwitchMaterial) pn9.a(R.id.pdfReportsSwitch, viewInflate);
                                                                                                                                        if (switchMaterial2 != null) {
                                                                                                                                            i4 = R.id.qrCodeScanSwitch;
                                                                                                                                            SwitchMaterial switchMaterial3 = (SwitchMaterial) pn9.a(R.id.qrCodeScanSwitch, viewInflate);
                                                                                                                                            if (switchMaterial3 != null) {
                                                                                                                                                i4 = R.id.quickShareSwitch;
                                                                                                                                                SwitchMaterial switchMaterial4 = (SwitchMaterial) pn9.a(R.id.quickShareSwitch, viewInflate);
                                                                                                                                                if (switchMaterial4 != null) {
                                                                                                                                                    i4 = R.id.rl_pro;
                                                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) pn9.a(R.id.rl_pro, viewInflate);
                                                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                                                        i4 = R.id.saveOriginalphotoSwitch;
                                                                                                                                                        SwitchMaterial switchMaterial5 = (SwitchMaterial) pn9.a(R.id.saveOriginalphotoSwitch, viewInflate);
                                                                                                                                                        if (switchMaterial5 != null) {
                                                                                                                                                            i4 = R.id.sdCardSwitch;
                                                                                                                                                            SwitchMaterial switchMaterial6 = (SwitchMaterial) pn9.a(R.id.sdCardSwitch, viewInflate);
                                                                                                                                                            if (switchMaterial6 != null) {
                                                                                                                                                                i4 = R.id.tvAppTheme;
                                                                                                                                                                TextView textView = (TextView) pn9.a(R.id.tvAppTheme, viewInflate);
                                                                                                                                                                if (textView != null) {
                                                                                                                                                                    i4 = R.id.tv_email_setting;
                                                                                                                                                                    TextView textView2 = (TextView) pn9.a(R.id.tv_email_setting, viewInflate);
                                                                                                                                                                    if (textView2 != null) {
                                                                                                                                                                        i4 = R.id.tv_img_quality;
                                                                                                                                                                        TextView textView3 = (TextView) pn9.a(R.id.tv_img_quality, viewInflate);
                                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                                            i4 = R.id.tv_language;
                                                                                                                                                                            TextView textView4 = (TextView) pn9.a(R.id.tv_language, viewInflate);
                                                                                                                                                                            if (textView4 != null) {
                                                                                                                                                                                i4 = R.id.tvTemplateOrientation;
                                                                                                                                                                                TextView textView5 = (TextView) pn9.a(R.id.tvTemplateOrientation, viewInflate);
                                                                                                                                                                                if (textView5 != null) {
                                                                                                                                                                                    i4 = R.id.tv_touch_setting;
                                                                                                                                                                                    TextView textView6 = (TextView) pn9.a(R.id.tv_touch_setting, viewInflate);
                                                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                                                        i4 = R.id.tv_vid_quality;
                                                                                                                                                                                        TextView textView7 = (TextView) pn9.a(R.id.tv_vid_quality, viewInflate);
                                                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                                                            i4 = R.id.tv_vol_btn_setting;
                                                                                                                                                                                            TextView textView8 = (TextView) pn9.a(R.id.tv_vol_btn_setting, viewInflate);
                                                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                                                i4 = R.id.txt_version;
                                                                                                                                                                                                TextView textView9 = (TextView) pn9.a(R.id.txt_version, viewInflate);
                                                                                                                                                                                                if (textView9 != null) {
                                                                                                                                                                                                    i4 = R.id.viewsndanerr;
                                                                                                                                                                                                    View viewA3 = pn9.a(R.id.viewsndanerr, viewInflate);
                                                                                                                                                                                                    if (viewA3 != null) {
                                                                                                                                                                                                        i4 = R.id.watermarkSwitch;
                                                                                                                                                                                                        SwitchMaterial switchMaterial7 = (SwitchMaterial) pn9.a(R.id.watermarkSwitch, viewInflate);
                                                                                                                                                                                                        if (switchMaterial7 != null) {
                                                                                                                                                                                                            this.B = new k6(relativeLayout2, er3Var, switchMaterial, imageView, l76VarA, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, linearLayout14, linearLayout15, linearLayout16, linearLayout17, linearLayout18, linearLayout19, linearLayout20, linearLayout21, linearLayout22, linearLayout23, linearLayout24, linearLayout25, relativeLayout2, switchMaterial2, switchMaterial3, switchMaterial4, relativeLayout3, switchMaterial5, switchMaterial6, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewA3, switchMaterial7);
                                                                                                                                                                                                            setContentView(relativeLayout2);
                                                                                                                                                                                                            this.B.T.setText(OTysxApt.ychBtzzMJRb);
                                                                                                                                                                                                            boolean z = this.G.getBoolean(this, SP.IS_WATER_MARK, true);
                                                                                                                                                                                                            this.I = z;
                                                                                                                                                                                                            this.B.V.setChecked(z);
                                                                                                                                                                                                            int i5 = 8;
                                                                                                                                                                                                            ((RelativeLayout) this.B.e.g).setVisibility(8);
                                                                                                                                                                                                            ((TextView) this.B.e.l).setText(getString(R.string.action_settings));
                                                                                                                                                                                                            View viewFindViewById = findViewById(R.id.mainlay);
                                                                                                                                                                                                            int i6 = 10;
                                                                                                                                                                                                            z55 z55Var = new z55(i6, this);
                                                                                                                                                                                                            WeakHashMap weakHashMap = cc7.a;
                                                                                                                                                                                                            ub7.c(viewFindViewById, z55Var);
                                                                                                                                                                                                            this.B.I.setOnClickListener(new a76(this, i5));
                                                                                                                                                                                                            ((RelativeLayout) this.B.e.c).setOnClickListener(new c76(this, 7));
                                                                                                                                                                                                            int i7 = 14;
                                                                                                                                                                                                            this.B.z.setOnClickListener(new a76(this, i7));
                                                                                                                                                                                                            int i8 = 15;
                                                                                                                                                                                                            this.B.j.setOnClickListener(new a76(this, i8));
                                                                                                                                                                                                            this.B.B.setOnClickListener(new a76(this, i2));
                                                                                                                                                                                                            this.B.D.setOnClickListener(new c76(this, i5));
                                                                                                                                                                                                            this.B.u.setOnClickListener(new a76(this, i3));
                                                                                                                                                                                                            int i9 = 2;
                                                                                                                                                                                                            this.B.h.setOnClickListener(new a76(this, i9));
                                                                                                                                                                                                            int i10 = 3;
                                                                                                                                                                                                            this.B.c.setOnClickListener(new a76(this, i10));
                                                                                                                                                                                                            int i11 = 4;
                                                                                                                                                                                                            this.B.r.setOnClickListener(new a76(this, i11));
                                                                                                                                                                                                            int i12 = 5;
                                                                                                                                                                                                            this.B.H.setOnClickListener(new a76(this, i12));
                                                                                                                                                                                                            this.B.n.setOnClickListener(new a76(this, 6));
                                                                                                                                                                                                            int i13 = 9;
                                                                                                                                                                                                            this.B.F.setOnClickListener(new a76(this, i13));
                                                                                                                                                                                                            this.B.t.setOnClickListener(new a76(this, i6));
                                                                                                                                                                                                            int i14 = 11;
                                                                                                                                                                                                            this.B.J.setOnClickListener(new a76(this, i14));
                                                                                                                                                                                                            int i15 = 12;
                                                                                                                                                                                                            this.B.q.setOnClickListener(new a76(this, i15));
                                                                                                                                                                                                            int i16 = 13;
                                                                                                                                                                                                            this.B.G.setOnClickListener(new a76(this, i16));
                                                                                                                                                                                                            this.B.l.setOnClickListener(new c76(this, i13));
                                                                                                                                                                                                            this.B.s.setOnClickListener(new c76(this, i6));
                                                                                                                                                                                                            this.B.w.setOnClickListener(new c76(this, i14));
                                                                                                                                                                                                            this.B.v.setOnClickListener(new c76(this, i15));
                                                                                                                                                                                                            this.B.p.setOnClickListener(new c76(this, i16));
                                                                                                                                                                                                            this.B.C.setOnClickListener(new c76(this, i7));
                                                                                                                                                                                                            this.B.o.setOnClickListener(new c76(this, i8));
                                                                                                                                                                                                            this.B.g.setOnClickListener(new c76(this, i2));
                                                                                                                                                                                                            this.B.y.setOnClickListener(new c76(this, i3));
                                                                                                                                                                                                            this.B.i.setOnClickListener(new c76(this, i9));
                                                                                                                                                                                                            this.B.k.setOnClickListener(new c76(this, i10));
                                                                                                                                                                                                            this.B.A.setOnClickListener(new c76(this, i11));
                                                                                                                                                                                                            this.B.x.setOnClickListener(new c76(this, i12));
                                                                                                                                                                                                            this.B.m.setOnClickListener(new c76(this, 6));
                                                                                                                                                                                                            k().a(this, new n8(this, 25));
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
                    }
                }
            }
        }
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.iSSettingSelectionBanner(this)) {
            Admob admob = new Admob();
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                int i2 = RemoteAdData.SETTING_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    admob.loadAdaptive_banner(this, (RelativeLayout) this.B.b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
                } else if (i2 == 2) {
                    admob.loadAdaptive_bannerAdax(this, (RelativeLayout) this.B.b.c, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                admob.loadAdaptive_banner(this, (RelativeLayout) this.B.b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
            } else if (i == 2) {
                admob.loadAdaptive_bannerAdax(this, (RelativeLayout) this.B.b.c, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            ((RelativeLayout) this.B.b.c).setVisibility(8);
        }
        this.B.O.setText(this.G.getString(this, SP.SELECTED_LANGUAGE, Default.LANGUAGE));
        int integer = this.G.getInteger(this, SP.CAM_TRACKING, 1);
        k6 k6Var = this.B;
        if (integer == 0) {
            k6Var.c.setChecked(true);
        } else {
            k6Var.c.setChecked(false);
        }
        int integer2 = this.G.getInteger(this, SP.IS_QUCK_SHARE_MODE, 0);
        k6 k6Var2 = this.B;
        if (integer2 == 0) {
            k6Var2.H.setChecked(true);
        } else {
            k6Var2.H.setChecked(false);
        }
        int integer3 = this.G.getInteger(this, SP.IS_PDF_REPORTING, 0);
        k6 k6Var3 = this.B;
        if (integer3 == 0) {
            k6Var3.F.setChecked(true);
        } else {
            k6Var3.F.setChecked(false);
        }
        boolean z = this.G.getBoolean(this, SP.IS_ORIGINAL_IMAGE, false);
        k6 k6Var4 = this.B;
        if (z) {
            k6Var4.J.setChecked(true);
        } else {
            k6Var4.J.setChecked(false);
        }
        int integer4 = this.G.getInteger(this, SP.QR_SCANNING, 1);
        k6 k6Var5 = this.B;
        if (integer4 == 0) {
            k6Var5.G.setChecked(true);
        } else {
            k6Var5.G.setChecked(false);
        }
        int integer5 = this.G.getInteger(this, SP.IS_PDF_REPORT_SETTING_BADGE, 1);
        k6 k6Var6 = this.B;
        if (integer5 == 0) {
            k6Var6.f.setVisibility(8);
        } else {
            k6Var6.f.setVisibility(0);
        }
        if (this.G.getString(this, SP.APP_THEME, Default.LIGHT).equals(Default.DEFAULT)) {
            this.B.L.setText(getString(R.string.defaultmode));
        } else {
            boolean zEquals = this.G.getString(this, SP.APP_THEME, Default.LIGHT).equals(Default.DARK);
            k6 k6Var7 = this.B;
            if (zEquals) {
                k6Var7.L.setText(getString(R.string.darkmode));
            } else {
                k6Var7.L.setText(getString(R.string.lightmode));
            }
        }
        if (this.G.getString(this, SP.VB_Setting, Default.CAPTURE).equals(Default.CAPTURE)) {
            this.B.S.setText(getText(R.string.capture));
        } else {
            boolean zEquals2 = this.G.getString(this, SP.VB_Setting, Default.CAPTURE).equals(Default.VOLUME);
            k6 k6Var8 = this.B;
            if (zEquals2) {
                k6Var8.S.setText(getText(R.string.volume));
            } else {
                k6Var8.S.setText(getText(R.string.zoom));
            }
        }
        if (this.G.getInteger(this, SP.ORIENTATION_TYPE, 0) == 0) {
            this.B.P.setText(getText(R.string.or_automatic));
        } else {
            int integer6 = this.G.getInteger(this, SP.ORIENTATION_TYPE, 0);
            k6 k6Var9 = this.B;
            if (integer6 == 1) {
                k6Var9.P.setText(getText(R.string.or_portrait));
            } else {
                k6Var9.P.setText(getText(R.string.or_landscape));
            }
        }
        boolean z2 = this.G.getBoolean(this, SP.IS_SEND_EMAIL_PHOTOS, false);
        k6 k6Var10 = this.B;
        if (z2) {
            k6Var10.M.setText(getText(R.string.on));
        } else {
            k6Var10.M.setText(getText(R.string.off));
        }
        boolean zEquals3 = this.G.getString(this, SP.T_Setting, Default.FOCUS).equals(Default.CAPTURE);
        k6 k6Var11 = this.B;
        if (zEquals3) {
            k6Var11.Q.setText(getText(R.string.capture));
        } else {
            k6Var11.Q.setText(getText(R.string.focus));
        }
        if (this.G.getInteger(this, SP.IMAGE_QUALITY, 1) == 1) {
            this.B.N.setText(getText(R.string.high));
        } else {
            int integer7 = this.G.getInteger(this, SP.IMAGE_QUALITY, 1);
            k6 k6Var12 = this.B;
            if (integer7 == 2) {
                k6Var12.N.setText(getText(R.string.medium));
            } else {
                k6Var12.N.setText(getText(R.string.low));
            }
        }
        if (this.G.getInteger(this, SP.VIDEO_QUALITY, 2) == 0) {
            this.B.R.setText(getText(R.string.quality_uhd));
            return;
        }
        if (this.G.getInteger(this, SP.VIDEO_QUALITY, 2) == 1) {
            this.B.R.setText(getText(R.string.quality_fhd));
            return;
        }
        int integer8 = this.G.getInteger(this, SP.VIDEO_QUALITY, 2);
        k6 k6Var13 = this.B;
        if (integer8 == 2) {
            k6Var13.R.setText(getText(R.string.quality_hd));
        } else {
            k6Var13.R.setText(getText(R.string.quality_sd));
        }
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.G.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) || this.G.getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false) || this.G.getBoolean(this, HelperClass.IS_SUBSCRIBE, false)) {
            this.B.d.setVisibility(8);
            this.B.I.setVisibility(8);
            this.B.v.setVisibility(0);
            this.B.U.setVisibility(0);
            if (this.G.getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false) && !this.G.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) && !this.G.getBoolean(this, HelperClass.IS_SUBSCRIBE, false)) {
                this.B.I.setVisibility(0);
            }
        } else {
            this.B.d.setVisibility(0);
            this.B.I.setVisibility(0);
            this.B.v.setVisibility(8);
            this.B.U.setVisibility(8);
        }
        File[] externalFilesDirs = getExternalFilesDirs(null);
        boolean z = (externalFilesDirs.length <= 1 || externalFilesDirs[0] == null || externalFilesDirs[1] == null) ? false : true;
        k6 k6Var = this.B;
        if (!z) {
            k6Var.u.setVisibility(8);
            this.G.setBoolean(this, PreferenceKeys.UsingSAFPreferenceKey, false);
            this.G.setBoolean(this, PreferenceKeys.IS_SDCARD_PERMISSION, false);
        } else {
            k6Var.u.setVisibility(0);
            this.H = this.G.getBoolean(this, PreferenceKeys.UsingSAFPreferenceKey);
            this.J = this.G.getBoolean(this, PreferenceKeys.IS_SDCARD_PERMISSION);
            this.B.K.setChecked(this.H);
        }
    }

    public final void s() {
        int integer = this.G.getInteger(this, HelperClass.COUNTADS, 0);
        int i = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i) {
            integer = i;
        }
        if (!AllAdsApproval.iSSettingScreenFS(this)) {
            finish();
            return;
        }
        if (integer < RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            this.G.setInteger(this, HelperClass.COUNTADS, integer + 1);
            finish();
            return;
        }
        CPD.ShowDialog(this, getString(R.string.cluster_loading));
        this.G.setInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.ADS_NETWORK_TYPE;
        if (i2 == 9) {
            int i3 = RemoteAdData.SETTING_SCREEN_FS_TYPE;
            if (i3 == 1) {
                t();
            } else if (i3 == 2) {
                u();
            }
        } else if (i2 == 1) {
            t();
        } else if (i2 == 2) {
            u();
        }
        this.Q.postDelayed(new vc4(17, this), 7000L);
    }

    public final void t() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new j64(14, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void u() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ws3(19, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v(boolean z) {
        this.J = z;
        this.H = z;
        this.B.K.setChecked(z);
        this.G.setBoolean(this, PreferenceKeys.UsingSAFPreferenceKey, this.H);
        this.G.setBoolean(this, PreferenceKeys.IS_SDCARD_PERMISSION, this.J);
    }
}