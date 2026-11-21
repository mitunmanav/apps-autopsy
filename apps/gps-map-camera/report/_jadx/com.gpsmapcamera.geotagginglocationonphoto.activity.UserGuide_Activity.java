package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.UserGuide_Activity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.UserGuide_Answer_Activity;
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
import defpackage.c66;
import defpackage.cc7;
import defpackage.j64;
import defpackage.lt1;
import defpackage.n6;
import defpackage.ro6;
import defpackage.tq6;
import defpackage.ub7;
import defpackage.w57;
import defpackage.ws3;
import defpackage.z55;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class UserGuide_Activity extends bj {
    public static final /* synthetic */ int G = 0;
    public SP C;
    public boolean D;
    public mo1 E;
    public final ro6 B = new ro6(new w57(1, this));
    public final Handler F = new Handler(Looper.getMainLooper());

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.C = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 0;
        final int i3 = 1;
        if (bi3.b(string, Default.DARK)) {
            this.D = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.D = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.D = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(s().a);
        RelativeLayout relativeLayout = s().i;
        z55 z55Var = new z55(24, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, z55Var);
        k().a(this, new tq6(this, i3));
        ((TextView) s().j.l).setText(getString(R.string.user_guide_));
        ((RelativeLayout) s().j.c).setOnClickListener(new View.OnClickListener(this) { // from class: h67
            public final /* synthetic */ UserGuide_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                UserGuide_Activity userGuide_Activity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = UserGuide_Activity.G;
                        userGuide_Activity.t();
                        break;
                    case 1:
                        int i6 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                        break;
                    case 2:
                        int i7 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "2"));
                        break;
                    case 3:
                        int i8 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "3"));
                        break;
                    case 4:
                        int i9 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "4"));
                        break;
                    case 5:
                        int i10 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "5"));
                        break;
                    default:
                        int i11 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "6"));
                        break;
                }
            }
        });
        s().c.setOnClickListener(new View.OnClickListener(this) { // from class: h67
            public final /* synthetic */ UserGuide_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                UserGuide_Activity userGuide_Activity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = UserGuide_Activity.G;
                        userGuide_Activity.t();
                        break;
                    case 1:
                        int i6 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                        break;
                    case 2:
                        int i7 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "2"));
                        break;
                    case 3:
                        int i8 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "3"));
                        break;
                    case 4:
                        int i9 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "4"));
                        break;
                    case 5:
                        int i10 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "5"));
                        break;
                    default:
                        int i11 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "6"));
                        break;
                }
            }
        });
        final int i4 = 2;
        s().d.setOnClickListener(new View.OnClickListener(this) { // from class: h67
            public final /* synthetic */ UserGuide_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                UserGuide_Activity userGuide_Activity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = UserGuide_Activity.G;
                        userGuide_Activity.t();
                        break;
                    case 1:
                        int i7 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                        break;
                    case 2:
                        int i8 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "2"));
                        break;
                    case 3:
                        int i9 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "3"));
                        break;
                    case 4:
                        int i10 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "4"));
                        break;
                    case 5:
                        int i11 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "5"));
                        break;
                    default:
                        int i12 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "6"));
                        break;
                }
            }
        });
        final int i5 = 3;
        s().e.setOnClickListener(new View.OnClickListener(this) { // from class: h67
            public final /* synthetic */ UserGuide_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                UserGuide_Activity userGuide_Activity = this.b;
                switch (i6) {
                    case 0:
                        int i7 = UserGuide_Activity.G;
                        userGuide_Activity.t();
                        break;
                    case 1:
                        int i8 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                        break;
                    case 2:
                        int i9 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "2"));
                        break;
                    case 3:
                        int i10 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "3"));
                        break;
                    case 4:
                        int i11 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "4"));
                        break;
                    case 5:
                        int i12 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "5"));
                        break;
                    default:
                        int i13 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "6"));
                        break;
                }
            }
        });
        final int i6 = 4;
        s().f.setOnClickListener(new View.OnClickListener(this) { // from class: h67
            public final /* synthetic */ UserGuide_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                UserGuide_Activity userGuide_Activity = this.b;
                switch (i7) {
                    case 0:
                        int i8 = UserGuide_Activity.G;
                        userGuide_Activity.t();
                        break;
                    case 1:
                        int i9 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                        break;
                    case 2:
                        int i10 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "2"));
                        break;
                    case 3:
                        int i11 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "3"));
                        break;
                    case 4:
                        int i12 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "4"));
                        break;
                    case 5:
                        int i13 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "5"));
                        break;
                    default:
                        int i14 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "6"));
                        break;
                }
            }
        });
        final int i7 = 5;
        s().g.setOnClickListener(new View.OnClickListener(this) { // from class: h67
            public final /* synthetic */ UserGuide_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i7;
                UserGuide_Activity userGuide_Activity = this.b;
                switch (i8) {
                    case 0:
                        int i9 = UserGuide_Activity.G;
                        userGuide_Activity.t();
                        break;
                    case 1:
                        int i10 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                        break;
                    case 2:
                        int i11 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "2"));
                        break;
                    case 3:
                        int i12 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "3"));
                        break;
                    case 4:
                        int i13 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "4"));
                        break;
                    case 5:
                        int i14 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "5"));
                        break;
                    default:
                        int i15 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "6"));
                        break;
                }
            }
        });
        final int i8 = 6;
        s().h.setOnClickListener(new View.OnClickListener(this) { // from class: h67
            public final /* synthetic */ UserGuide_Activity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = i8;
                UserGuide_Activity userGuide_Activity = this.b;
                switch (i9) {
                    case 0:
                        int i10 = UserGuide_Activity.G;
                        userGuide_Activity.t();
                        break;
                    case 1:
                        int i11 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "1"));
                        break;
                    case 2:
                        int i12 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "2"));
                        break;
                    case 3:
                        int i13 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "3"));
                        break;
                    case 4:
                        int i14 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "4"));
                        break;
                    case 5:
                        int i15 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "5"));
                        break;
                    default:
                        int i16 = UserGuide_Activity.G;
                        Default.mSelectedLanguage = "";
                        userGuide_Activity.startActivity(new Intent(userGuide_Activity, (Class<?>) UserGuide_Answer_Activity.class).putExtra("queNo", "6"));
                        break;
                }
            }
        });
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.iSUserManualScreenBanner(this)) {
            Admob admob = new Admob();
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i != 9) {
                if (i == 1) {
                    admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
                    return;
                } else {
                    if (i == 2) {
                        admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
                        return;
                    }
                    return;
                }
            }
            int i2 = RemoteAdData.USER_MANUAL_SCREEN_BANNER_TYPE;
            if (i2 == 1) {
                admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
            } else if (i2 == 2) {
                admob.loadCollaps_banner(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
            }
        }
    }

    public final n6 s() {
        return (n6) this.B.getValue();
    }

    public final void t() {
        SP sp = this.C;
        if (sp == null) {
            bi3.g("mSP");
            throw null;
        }
        final int i = 0;
        int integer = sp.getInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i2 = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSUserManualScreenFS(this)) {
            finish();
            return;
        }
        final int i3 = 1;
        if (integer >= RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: g67
                public final /* synthetic */ UserGuide_Activity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    UserGuide_Activity userGuide_Activity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = UserGuide_Activity.G;
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                if (RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE == 1) {
                                    mo1 mo1Var = userGuide_Activity.E;
                                    if (mo1Var != null) {
                                        mo1Var.b.a(userGuide_Activity);
                                        return;
                                    } else {
                                        userGuide_Activity.finish();
                                        return;
                                    }
                                }
                                return;
                            }
                            if (i6 == 1) {
                                mo1 mo1Var2 = userGuide_Activity.E;
                                if (mo1Var2 != null) {
                                    mo1Var2.b.a(userGuide_Activity);
                                    return;
                                } else {
                                    userGuide_Activity.finish();
                                    return;
                                }
                            }
                            return;
                        default:
                            int i7 = UserGuide_Activity.G;
                            SP sp2 = userGuide_Activity.C;
                            if (sp2 == null) {
                                bi3.g("mSP");
                                throw null;
                            }
                            sp2.setInteger(userGuide_Activity, HelperClass.SETTING_COUNTADS, 0);
                            int i8 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i8 != 9) {
                                if (i8 == 1) {
                                    userGuide_Activity.u();
                                    return;
                                } else {
                                    if (i8 == 2) {
                                        userGuide_Activity.v();
                                        return;
                                    }
                                    return;
                                }
                            }
                            int i9 = RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE;
                            if (i9 == 1) {
                                userGuide_Activity.u();
                                return;
                            } else {
                                if (i9 == 2) {
                                    userGuide_Activity.v();
                                    return;
                                }
                                return;
                            }
                    }
                }
            }, 200L);
            Handler handler = this.F;
            handler.getClass();
            handler.postDelayed(new Runnable(this) { // from class: g67
                public final /* synthetic */ UserGuide_Activity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    UserGuide_Activity userGuide_Activity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = UserGuide_Activity.G;
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                if (RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE == 1) {
                                    mo1 mo1Var = userGuide_Activity.E;
                                    if (mo1Var != null) {
                                        mo1Var.b.a(userGuide_Activity);
                                        return;
                                    } else {
                                        userGuide_Activity.finish();
                                        return;
                                    }
                                }
                                return;
                            }
                            if (i6 == 1) {
                                mo1 mo1Var2 = userGuide_Activity.E;
                                if (mo1Var2 != null) {
                                    mo1Var2.b.a(userGuide_Activity);
                                    return;
                                } else {
                                    userGuide_Activity.finish();
                                    return;
                                }
                            }
                            return;
                        default:
                            int i7 = UserGuide_Activity.G;
                            SP sp2 = userGuide_Activity.C;
                            if (sp2 == null) {
                                bi3.g("mSP");
                                throw null;
                            }
                            sp2.setInteger(userGuide_Activity, HelperClass.SETTING_COUNTADS, 0);
                            int i8 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i8 != 9) {
                                if (i8 == 1) {
                                    userGuide_Activity.u();
                                    return;
                                } else {
                                    if (i8 == 2) {
                                        userGuide_Activity.v();
                                        return;
                                    }
                                    return;
                                }
                            }
                            int i9 = RemoteAdData.USER_MANUAL_SCREEN_BACK_FS_TYPE;
                            if (i9 == 1) {
                                userGuide_Activity.u();
                                return;
                            } else {
                                if (i9 == 2) {
                                    userGuide_Activity.v();
                                    return;
                                }
                                return;
                            }
                    }
                }
            }, 7000L);
            return;
        }
        int i4 = integer + 1;
        SP sp2 = this.C;
        if (sp2 == null) {
            bi3.g("mSP");
            throw null;
        }
        sp2.setInteger(this, HelperClass.SETTING_COUNTADS, i4);
        finish();
    }

    public final void u() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new j64(22, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ws3(26, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}