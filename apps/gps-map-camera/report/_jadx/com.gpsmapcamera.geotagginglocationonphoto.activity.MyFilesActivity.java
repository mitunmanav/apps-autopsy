package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.FolderActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.GDFolderActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.MyFilesActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.a7;
import defpackage.bi3;
import defpackage.bj;
import defpackage.bl8;
import defpackage.c66;
import defpackage.cc7;
import defpackage.di;
import defpackage.er3;
import defpackage.gb0;
import defpackage.ge4;
import defpackage.h94;
import defpackage.i41;
import defpackage.ju1;
import defpackage.kea;
import defpackage.l76;
import defpackage.lba;
import defpackage.lt1;
import defpackage.mk9;
import defpackage.mq7;
import defpackage.n5;
import defpackage.n8;
import defpackage.pn9;
import defpackage.r78;
import defpackage.ub7;
import defpackage.v68;
import defpackage.x32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MyFilesActivity extends bj {
    public static final /* synthetic */ int J = 0;
    public n5 B;
    public boolean C;
    public SP D;
    public GoogleSignInAccount E;
    public final int F = 1001;
    public final Admob G = new Admob();
    public Handler H;
    public mo1 I;

    @Override // defpackage.bh2, defpackage.gy0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.F) {
            i41 i41Var = null;
            if (i2 == -1) {
                mk9.g(kea.a(this), null, null, new gb0(intent, this, i41Var, 21), 3);
                return;
            }
            n5 n5Var = this.B;
            if (n5Var != null) {
                ((SwitchMaterial) n5Var.i).setChecked(false);
            } else {
                bi3.g("binding");
                throw null;
            }
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        this.D = new SP(this);
        String string = u().getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 16;
        final int i3 = 1;
        final int i4 = 0;
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
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_my_files, (ViewGroup) null, false);
        int i5 = R.id.adlayout;
        View viewA = pn9.a(R.id.adlayout, viewInflate);
        if (viewA != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewA;
            er3 er3Var = new er3(i4, relativeLayout, relativeLayout);
            i5 = R.id.cardView_device_storage;
            MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.cardView_device_storage, viewInflate);
            if (materialCardView != null) {
                i5 = R.id.cardView_google_drive;
                MaterialCardView materialCardView2 = (MaterialCardView) pn9.a(R.id.cardView_google_drive, viewInflate);
                if (materialCardView2 != null) {
                    i5 = R.id.llTitleText;
                    if (((LinearLayout) pn9.a(R.id.llTitleText, viewInflate)) != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                        i5 = R.id.switch_on_off_device_storage;
                        SwitchMaterial switchMaterial = (SwitchMaterial) pn9.a(R.id.switch_on_off_device_storage, viewInflate);
                        if (switchMaterial != null) {
                            i5 = R.id.switch_on_off_google_drive;
                            SwitchMaterial switchMaterial2 = (SwitchMaterial) pn9.a(R.id.switch_on_off_google_drive, viewInflate);
                            if (switchMaterial2 != null) {
                                i5 = R.id.toolbar;
                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                if (viewA2 != null) {
                                    l76 l76VarA = l76.a(viewA2);
                                    i5 = R.id.tvConnected;
                                    TextView textView = (TextView) pn9.a(R.id.tvConnected, viewInflate);
                                    if (textView != null) {
                                        i5 = R.id.tvGDFolderPath;
                                        TextView textView2 = (TextView) pn9.a(R.id.tvGDFolderPath, viewInflate);
                                        if (textView2 != null) {
                                            this.B = new n5(relativeLayout2, er3Var, materialCardView, materialCardView2, relativeLayout2, switchMaterial, switchMaterial2, l76VarA, textView, textView2);
                                            setContentView(relativeLayout2);
                                            n5 n5Var = this.B;
                                            if (n5Var == null) {
                                                bi3.g("binding");
                                                throw null;
                                            }
                                            ((TextView) ((l76) n5Var.e).l).setText(getString(R.string.my_files));
                                            k().a(this, new n8(this, i2));
                                            n5 n5Var2 = this.B;
                                            if (n5Var2 == null) {
                                                bi3.g("binding");
                                                throw null;
                                            }
                                            RelativeLayout relativeLayout3 = (RelativeLayout) n5Var2.g;
                                            x32 x32Var = new x32(27, this);
                                            WeakHashMap weakHashMap = cc7.a;
                                            ub7.c(relativeLayout3, x32Var);
                                            n5 n5Var3 = this.B;
                                            if (n5Var3 == null) {
                                                bi3.g("binding");
                                                throw null;
                                            }
                                            ((MaterialCardView) n5Var3.c).setOnClickListener(new View.OnClickListener(this) { // from class: am4
                                                public final /* synthetic */ MyFilesActivity b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    NetworkCapabilities networkCapabilities;
                                                    int i6 = i4;
                                                    boolean zHasCapability = false;
                                                    MyFilesActivity myFilesActivity = this.b;
                                                    switch (i6) {
                                                        case 0:
                                                            int i7 = MyFilesActivity.J;
                                                            myFilesActivity.startActivity(new Intent(myFilesActivity, (Class<?>) FolderActivity.class).putExtra("type", 0));
                                                            return;
                                                        case 1:
                                                            if (myFilesActivity.E == null) {
                                                                myFilesActivity.x();
                                                                return;
                                                            }
                                                            Object systemService = myFilesActivity.getSystemService("connectivity");
                                                            systemService.getClass();
                                                            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                                                            Network activeNetwork = connectivityManager.getActiveNetwork();
                                                            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                                                                zHasCapability = networkCapabilities.hasCapability(12);
                                                            }
                                                            if (zHasCapability) {
                                                                myFilesActivity.startActivity(new Intent(myFilesActivity, (Class<?>) GDFolderActivity.class).putExtra("type", 1));
                                                                return;
                                                            }
                                                            n5 n5Var4 = myFilesActivity.B;
                                                            if (n5Var4 != null) {
                                                                HelperClass.showSnackBar((RelativeLayout) n5Var4.g, myFilesActivity.getString(R.string.no_internet_msg));
                                                                return;
                                                            } else {
                                                                bi3.g("binding");
                                                                throw null;
                                                            }
                                                        default:
                                                            int i8 = MyFilesActivity.J;
                                                            myFilesActivity.s();
                                                            return;
                                                    }
                                                }
                                            });
                                            n5 n5Var4 = this.B;
                                            if (n5Var4 == null) {
                                                bi3.g("binding");
                                                throw null;
                                            }
                                            ((MaterialCardView) n5Var4.d).setOnClickListener(new View.OnClickListener(this) { // from class: am4
                                                public final /* synthetic */ MyFilesActivity b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    NetworkCapabilities networkCapabilities;
                                                    int i6 = i3;
                                                    boolean zHasCapability = false;
                                                    MyFilesActivity myFilesActivity = this.b;
                                                    switch (i6) {
                                                        case 0:
                                                            int i7 = MyFilesActivity.J;
                                                            myFilesActivity.startActivity(new Intent(myFilesActivity, (Class<?>) FolderActivity.class).putExtra("type", 0));
                                                            return;
                                                        case 1:
                                                            if (myFilesActivity.E == null) {
                                                                myFilesActivity.x();
                                                                return;
                                                            }
                                                            Object systemService = myFilesActivity.getSystemService("connectivity");
                                                            systemService.getClass();
                                                            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                                                            Network activeNetwork = connectivityManager.getActiveNetwork();
                                                            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                                                                zHasCapability = networkCapabilities.hasCapability(12);
                                                            }
                                                            if (zHasCapability) {
                                                                myFilesActivity.startActivity(new Intent(myFilesActivity, (Class<?>) GDFolderActivity.class).putExtra("type", 1));
                                                                return;
                                                            }
                                                            n5 n5Var5 = myFilesActivity.B;
                                                            if (n5Var5 != null) {
                                                                HelperClass.showSnackBar((RelativeLayout) n5Var5.g, myFilesActivity.getString(R.string.no_internet_msg));
                                                                return;
                                                            } else {
                                                                bi3.g("binding");
                                                                throw null;
                                                            }
                                                        default:
                                                            int i8 = MyFilesActivity.J;
                                                            myFilesActivity.s();
                                                            return;
                                                    }
                                                }
                                            });
                                            n5 n5Var5 = this.B;
                                            if (n5Var5 == null) {
                                                bi3.g("binding");
                                                throw null;
                                            }
                                            ((SwitchMaterial) n5Var5.i).setOnCheckedChangeListener(new ju1(this, i3));
                                            n5 n5Var6 = this.B;
                                            if (n5Var6 == null) {
                                                bi3.g("binding");
                                                throw null;
                                            }
                                            final int i6 = 2;
                                            ((RelativeLayout) ((l76) n5Var6.e).c).setOnClickListener(new View.OnClickListener(this) { // from class: am4
                                                public final /* synthetic */ MyFilesActivity b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    NetworkCapabilities networkCapabilities;
                                                    int i7 = i6;
                                                    boolean zHasCapability = false;
                                                    MyFilesActivity myFilesActivity = this.b;
                                                    switch (i7) {
                                                        case 0:
                                                            int i8 = MyFilesActivity.J;
                                                            myFilesActivity.startActivity(new Intent(myFilesActivity, (Class<?>) FolderActivity.class).putExtra("type", 0));
                                                            return;
                                                        case 1:
                                                            if (myFilesActivity.E == null) {
                                                                myFilesActivity.x();
                                                                return;
                                                            }
                                                            Object systemService = myFilesActivity.getSystemService("connectivity");
                                                            systemService.getClass();
                                                            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                                                            Network activeNetwork = connectivityManager.getActiveNetwork();
                                                            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                                                                zHasCapability = networkCapabilities.hasCapability(12);
                                                            }
                                                            if (zHasCapability) {
                                                                myFilesActivity.startActivity(new Intent(myFilesActivity, (Class<?>) GDFolderActivity.class).putExtra("type", 1));
                                                                return;
                                                            }
                                                            n5 n5Var7 = myFilesActivity.B;
                                                            if (n5Var7 != null) {
                                                                HelperClass.showSnackBar((RelativeLayout) n5Var7.g, myFilesActivity.getString(R.string.no_internet_msg));
                                                                return;
                                                            } else {
                                                                bi3.g("binding");
                                                                throw null;
                                                            }
                                                        default:
                                                            int i9 = MyFilesActivity.J;
                                                            myFilesActivity.s();
                                                            return;
                                                    }
                                                }
                                            });
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
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.G;
        if (admob != null) {
            admob.DestroyAd();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        NetworkCapabilities networkCapabilities;
        super.onResume();
        this.E = lba.b(this);
        if (AllAdsApproval.iSMyFilesBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            Admob admob = this.G;
            if (i == 9) {
                int i2 = RemoteAdData.MY_FILES_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    if (admob != null) {
                        n5 n5Var = this.B;
                        if (n5Var == null) {
                            bi3.g("binding");
                            throw null;
                        }
                        admob.loadAdaptive_banner(this, (RelativeLayout) ((er3) n5Var.f).c, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                    }
                } else if (i2 == 2 && admob != null) {
                    n5 n5Var2 = this.B;
                    if (n5Var2 == null) {
                        bi3.g("binding");
                        throw null;
                    }
                    admob.loadAdaptive_bannerAdax(this, (RelativeLayout) ((er3) n5Var2.f).c, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                if (admob != null) {
                    n5 n5Var3 = this.B;
                    if (n5Var3 == null) {
                        bi3.g("binding");
                        throw null;
                    }
                    admob.loadAdaptive_banner(this, (RelativeLayout) ((er3) n5Var3.f).c, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                }
            } else if (i == 2 && admob != null) {
                n5 n5Var4 = this.B;
                if (n5Var4 == null) {
                    bi3.g("binding");
                    throw null;
                }
                admob.loadAdaptive_bannerAdax(this, (RelativeLayout) ((er3) n5Var4.f).c, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            n5 n5Var5 = this.B;
            if (n5Var5 == null) {
                bi3.g("binding");
                throw null;
            }
            ((RelativeLayout) ((er3) n5Var5.f).c).setVisibility(8);
        }
        Object systemService = getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if ((activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12)) {
            GoogleSignInAccount googleSignInAccount = this.E;
            n5 n5Var6 = this.B;
            if (googleSignInAccount != null) {
                if (n5Var6 == null) {
                    bi3.g("binding");
                    throw null;
                }
                ((TextView) n5Var6.j).setVisibility(0);
                n5 n5Var7 = this.B;
                if (n5Var7 == null) {
                    bi3.g("binding");
                    throw null;
                }
                ((TextView) n5Var7.k).setText(getString(R.string.google_drive) + " -> GPS Map Camera -> " + u().getString(this, SP.GD_FOLDER_PATH, Default.DEFAULT_FOLDER_NAME));
            } else {
                if (n5Var6 == null) {
                    bi3.g("binding");
                    throw null;
                }
                ((TextView) n5Var6.j).setVisibility(8);
                n5 n5Var8 = this.B;
                if (n5Var8 == null) {
                    bi3.g("binding");
                    throw null;
                }
                ((TextView) n5Var8.k).setText(getString(R.string.not_connected));
            }
        }
        n5 n5Var9 = this.B;
        if (n5Var9 == null) {
            bi3.g("binding");
            throw null;
        }
        ((SwitchMaterial) n5Var9.h).setChecked(true);
        n5 n5Var10 = this.B;
        if (n5Var10 == null) {
            bi3.g("binding");
            throw null;
        }
        ((SwitchMaterial) n5Var10.h).setEnabled(false);
        n5 n5Var11 = this.B;
        if (n5Var11 == null) {
            bi3.g("binding");
            throw null;
        }
        ((SwitchMaterial) n5Var11.i).setChecked(u().getBoolean(this, SP.IS_UPLOAD_ON_GOOGLE_DRIVE, false));
        if (getIntent().getBooleanExtra("auto_connect_drive", false)) {
            getIntent().removeExtra("auto_connect_drive");
            if (this.E == null) {
                x();
            }
        }
    }

    public final void s() {
        final int i = 0;
        int integer = u().getInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSMyFilesFS(this)) {
            finish();
            return;
        }
        final int i3 = 1;
        if (integer >= RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler().postDelayed(new Runnable(this) { // from class: bm4
                public final /* synthetic */ MyFilesActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    MyFilesActivity myFilesActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = MyFilesActivity.J;
                            myFilesActivity.u().setInteger(myFilesActivity, HelperClass.COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                int i7 = RemoteAdData.MY_FILES_SCREEN_FS_TYPE;
                                if (i7 == 1) {
                                    myFilesActivity.v();
                                } else if (i7 == 2) {
                                    myFilesActivity.w();
                                }
                            } else if (i6 == 1) {
                                myFilesActivity.v();
                            } else if (i6 == 2) {
                                myFilesActivity.w();
                            }
                            break;
                        default:
                            int i8 = MyFilesActivity.J;
                            CPD.DismissDialog();
                            if (RemoteAdData.ADS_NETWORK_TYPE != 9) {
                                mo1 mo1Var = myFilesActivity.I;
                                if (mo1Var == null) {
                                    myFilesActivity.finish();
                                } else {
                                    mo1Var.b.a(myFilesActivity);
                                }
                            } else {
                                int i9 = RemoteAdData.MY_FILES_SCREEN_FS_TYPE;
                                if (i9 == 1) {
                                    mo1 mo1Var2 = myFilesActivity.I;
                                    if (mo1Var2 == null) {
                                        myFilesActivity.finish();
                                    } else {
                                        mo1Var2.b.a(myFilesActivity);
                                    }
                                } else if (i9 == 2) {
                                    mo1 mo1Var3 = myFilesActivity.I;
                                    if (mo1Var3 == null) {
                                        myFilesActivity.finish();
                                    } else {
                                        mo1Var3.b.a(myFilesActivity);
                                    }
                                }
                            }
                            break;
                    }
                }
            }, 200L);
            this.H = new Handler();
            t().postDelayed(new Runnable(this) { // from class: bm4
                public final /* synthetic */ MyFilesActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    MyFilesActivity myFilesActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = MyFilesActivity.J;
                            myFilesActivity.u().setInteger(myFilesActivity, HelperClass.COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                int i7 = RemoteAdData.MY_FILES_SCREEN_FS_TYPE;
                                if (i7 == 1) {
                                    myFilesActivity.v();
                                } else if (i7 == 2) {
                                    myFilesActivity.w();
                                }
                            } else if (i6 == 1) {
                                myFilesActivity.v();
                            } else if (i6 == 2) {
                                myFilesActivity.w();
                            }
                            break;
                        default:
                            int i8 = MyFilesActivity.J;
                            CPD.DismissDialog();
                            if (RemoteAdData.ADS_NETWORK_TYPE != 9) {
                                mo1 mo1Var = myFilesActivity.I;
                                if (mo1Var == null) {
                                    myFilesActivity.finish();
                                } else {
                                    mo1Var.b.a(myFilesActivity);
                                }
                            } else {
                                int i9 = RemoteAdData.MY_FILES_SCREEN_FS_TYPE;
                                if (i9 == 1) {
                                    mo1 mo1Var2 = myFilesActivity.I;
                                    if (mo1Var2 == null) {
                                        myFilesActivity.finish();
                                    } else {
                                        mo1Var2.b.a(myFilesActivity);
                                    }
                                } else if (i9 == 2) {
                                    mo1 mo1Var3 = myFilesActivity.I;
                                    if (mo1Var3 == null) {
                                        myFilesActivity.finish();
                                    } else {
                                        mo1Var3.b.a(myFilesActivity);
                                    }
                                }
                            }
                            break;
                    }
                }
            }, 7000L);
            return;
        }
        u().setInteger(this, HelperClass.COUNTADS, integer + 1);
        finish();
    }

    public final Handler t() {
        Handler handler = this.H;
        if (handler != null) {
            return handler;
        }
        bi3.g("handler");
        throw null;
    }

    public final SP u() {
        SP sp = this.D;
        if (sp != null) {
            return sp;
        }
        bi3.g("mSP");
        throw null;
    }

    public final void v() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new h94(2, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void w() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ge4(1, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void x() {
        NetworkCapabilities networkCapabilities;
        Intent intentA;
        Object systemService = getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!((activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12))) {
            n5 n5Var = this.B;
            if (n5Var != null) {
                HelperClass.showSnackBar((RelativeLayout) n5Var.g, getString(R.string.no_internet_msg));
                return;
            } else {
                bi3.g("binding");
                throw null;
            }
        }
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.n;
        new HashSet();
        new HashMap();
        bl8.h(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.e);
        boolean z = googleSignInOptions.h;
        boolean z2 = googleSignInOptions.i;
        boolean z3 = googleSignInOptions.g;
        String str = googleSignInOptions.j;
        Account account = googleSignInOptions.f;
        String str2 = googleSignInOptions.k;
        HashMap mapG = GoogleSignInOptions.g(googleSignInOptions.l);
        String str3 = googleSignInOptions.m;
        hashSet.add(GoogleSignInOptions.o);
        hashSet.add(new Scope(1, "https://www.googleapis.com/auth/drive.file"));
        hashSet.addAll(Arrays.asList(new Scope[0]));
        if (hashSet.contains(GoogleSignInOptions.r)) {
            Scope scope = GoogleSignInOptions.q;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (z3 && (account == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.p);
        }
        v68 v68VarA = lba.a(this, new GoogleSignInOptions(3, new ArrayList(hashSet), account, z3, z, z2, str, str2, mapG, str3));
        di diVar = v68VarA.e;
        Context context = v68VarA.a;
        int iK = v68VarA.k();
        int i = iK - 1;
        if (iK == 0) {
            throw null;
        }
        if (i == 2) {
            r78.a.o("getFallbackSignInIntent()", new Object[0]);
            intentA = r78.a(context, (GoogleSignInOptions) diVar);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        } else if (i != 3) {
            r78.a.o("getNoImplementationSignInIntent()", new Object[0]);
            intentA = r78.a(context, (GoogleSignInOptions) diVar);
            intentA.setAction("com.google.android.gms.auth.NO_IMPL");
        } else {
            intentA = r78.a(context, (GoogleSignInOptions) diVar);
        }
        startActivityForResult(intentA, this.F);
    }
}