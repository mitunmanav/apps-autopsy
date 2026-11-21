package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.FolderActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.model.FileGetSet;
import defpackage.a7;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc7;
import defpackage.fo4;
import defpackage.k54;
import defpackage.lt1;
import defpackage.n8;
import defpackage.re2;
import defpackage.rm;
import defpackage.se2;
import defpackage.te2;
import defpackage.ub7;
import defpackage.v60;
import defpackage.vm8;
import defpackage.w7;
import defpackage.x32;
import defpackage.ze2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FolderActivity extends bj {
    public static final /* synthetic */ int Q = 0;
    public w7 C;
    public String D;
    public boolean E;
    public ze2 G;
    public RelativeLayout I;
    public ImageView J;
    public ImageView K;
    public TextView L;
    public RecyclerView M;
    public SP N;
    public final ArrayList B = new ArrayList();
    public boolean F = false;
    public mo1 H = null;
    public final Admob O = new Admob();
    public final Handler P = new Handler();

    public static void t(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
                t(file2);
            }
        }
        file.delete();
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        SP sp = new SP(this);
        this.N = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 0;
        int i3 = 1;
        if (string.equals(Default.DARK)) {
            this.F = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.F = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.F = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_folder);
        View viewFindViewById = findViewById(R.id.homeLayout);
        x32 x32Var = new x32(5, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, x32Var);
        this.N.setInteger(this, HelperClass.FOLDER_OPEN_TIME, this.N.getInteger(this, HelperClass.FOLDER_OPEN_TIME, 0) + 1);
        new CameraActivity();
        this.I = (RelativeLayout) findViewById(R.id.toolbar_back);
        this.J = (ImageView) findViewById(R.id.toolbar_add_img);
        this.L = (TextView) findViewById(R.id.tv_toolbar_title);
        this.K = (ImageView) findViewById(R.id.imgPro_img);
        this.L.setText(getString(R.string.select_folder));
        this.J.setVisibility(0);
        this.M = (RecyclerView) findViewById(R.id.add_folder_recyclerview);
        boolean z = this.N.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) || this.N.getBoolean(this, HelperClass.IS_SUBSCRIBE, false) || this.N.getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false);
        this.E = z;
        ImageView imageView = this.K;
        if (z) {
            imageView.setVisibility(8);
            this.J.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            this.J.setVisibility(0);
        }
        SP sp2 = this.N;
        String str = Default.DEFAULT_FOLDER_PATH;
        this.D = sp2.getString(this, SP.FOLDER_PATH, str);
        ze2 ze2Var = new ze2();
        this.G = ze2Var;
        ze2Var.n0 = new k54(18, this);
        x();
        this.M.setLayoutManager(new LinearLayoutManager(this, 1, false));
        vm8 vm8Var = new vm8(24, this);
        w7 w7Var = new w7(i2);
        w7Var.e = this.B;
        w7Var.f = vm8Var;
        w7Var.d = new SP(this).getString(this, SP.FOLDER_PATH, str);
        this.C = w7Var;
        this.M.setAdapter(w7Var);
        this.I.setOnClickListener(new te2(this, i2));
        this.J.setOnClickListener(new te2(this, i3));
        this.K.setOnClickListener(new te2(this, 2));
        k().a(this, new n8(this, 7));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        Admob admob = this.O;
        if (admob != null) {
            admob.DestroyAd();
        }
        super.onDestroy();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        x();
        if (!AllAdsApproval.iSFolderBanner(this)) {
            ((RelativeLayout) findViewById(R.id.rel_adaptive_banner)).setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        Admob admob = this.O;
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
        int i2 = RemoteAdData.FOLDER_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            admob.loadAdaptive_banner(this, relativeLayout, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            admob.loadAdaptive_bannerAdax(this, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final void s() {
        if (isFinishing()) {
            return;
        }
        v60 v60Var = new v60(this, R.style.AppBottomSheetDialogTheme);
        View viewInflate = getLayoutInflater().inflate(R.layout.bottomsheet_pro_custom_folder, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate.findViewById(R.id.card_upgrade_pro);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_not_now);
        int i = 0;
        materialCardView.setOnClickListener(new re2(this, v60Var, i));
        textView.setOnClickListener(new se2(v60Var, i));
        v60Var.show();
    }

    public final void u() {
        final int i = 0;
        int integer = this.N.getInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSFolderFS(this)) {
            finish();
            return;
        }
        final int i3 = 1;
        if (integer >= RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            CPD.ShowDialog(this, getString(R.string.cluster_loading));
            new Handler().postDelayed(new Runnable(this) { // from class: qe2
                public final /* synthetic */ FolderActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    FolderActivity folderActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = FolderActivity.Q;
                            folderActivity.N.setInteger(folderActivity, HelperClass.COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                int i7 = RemoteAdData.FOLDER_SCREEN_FS_TYPE;
                                if (i7 == 1) {
                                    folderActivity.v();
                                } else if (i7 == 2) {
                                    folderActivity.w();
                                }
                            } else if (i6 == 1) {
                                folderActivity.v();
                            } else if (i6 == 2) {
                                folderActivity.w();
                            }
                            break;
                        default:
                            int i8 = FolderActivity.Q;
                            CPD.DismissDialog();
                            if (RemoteAdData.ADS_NETWORK_TYPE != 9) {
                                mo1 mo1Var = folderActivity.H;
                                if (mo1Var == null) {
                                    folderActivity.finish();
                                } else {
                                    mo1Var.b.a(folderActivity);
                                }
                            } else if (RemoteAdData.FOLDER_SCREEN_FS_TYPE == 1) {
                                mo1 mo1Var2 = folderActivity.H;
                                if (mo1Var2 == null) {
                                    folderActivity.finish();
                                } else {
                                    mo1Var2.b.a(folderActivity);
                                }
                            }
                            break;
                    }
                }
            }, 200L);
            this.P.postDelayed(new Runnable(this) { // from class: qe2
                public final /* synthetic */ FolderActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    FolderActivity folderActivity = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = FolderActivity.Q;
                            folderActivity.N.setInteger(folderActivity, HelperClass.COUNTADS, 0);
                            int i6 = RemoteAdData.ADS_NETWORK_TYPE;
                            if (i6 == 9) {
                                int i7 = RemoteAdData.FOLDER_SCREEN_FS_TYPE;
                                if (i7 == 1) {
                                    folderActivity.v();
                                } else if (i7 == 2) {
                                    folderActivity.w();
                                }
                            } else if (i6 == 1) {
                                folderActivity.v();
                            } else if (i6 == 2) {
                                folderActivity.w();
                            }
                            break;
                        default:
                            int i8 = FolderActivity.Q;
                            CPD.DismissDialog();
                            if (RemoteAdData.ADS_NETWORK_TYPE != 9) {
                                mo1 mo1Var = folderActivity.H;
                                if (mo1Var == null) {
                                    folderActivity.finish();
                                } else {
                                    mo1Var.b.a(folderActivity);
                                }
                            } else if (RemoteAdData.FOLDER_SCREEN_FS_TYPE == 1) {
                                mo1 mo1Var2 = folderActivity.H;
                                if (mo1Var2 == null) {
                                    folderActivity.finish();
                                } else {
                                    mo1Var2.b.a(folderActivity);
                                }
                            }
                            break;
                    }
                }
            }, 7000L);
            return;
        }
        this.N.setInteger(this, HelperClass.COUNTADS, integer + 1);
        finish();
    }

    public final void v() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new rm(24, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void w() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new fo4(19, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void x() {
        ArrayList arrayList = this.B;
        arrayList.clear();
        FileGetSet fileGetSet = new FileGetSet();
        fileGetSet.setFileName(Default.DEFAULT_FOLDER_NAME);
        fileGetSet.setFilePath(Default.DEFAULT_FOLDER_PATH);
        arrayList.add(fileGetSet);
        File[] fileArrListFiles = new File(Default.PARENT_FOLDER_PATH).listFiles();
        int i = 0;
        if (this.E) {
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (!file.getName().equals("TempImage") && !file.getName().equals(Default.DEFAULT_FOLDER_NAME) && !file.getName().endsWith(".jpg")) {
                        FileGetSet fileGetSet2 = new FileGetSet();
                        fileGetSet2.setFileName(file.getName());
                        fileGetSet2.setFilePath(file.getAbsolutePath());
                        arrayList.add(fileGetSet2);
                    }
                }
            }
        } else if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().equals(Default.SITE_1) || file2.getName().equals(Default.SITE_2)) {
                    FileGetSet fileGetSet3 = new FileGetSet();
                    fileGetSet3.setFileName(file2.getName());
                    fileGetSet3.setFilePath(file2.getAbsolutePath());
                    arrayList.add(fileGetSet3);
                }
            }
        }
        if (this.D == null) {
            String str = Default.DEFAULT_FOLDER_PATH;
            this.D = str;
            this.N.setString(this, SP.FOLDER_PATH, str);
            break;
        }
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                String str2 = Default.DEFAULT_FOLDER_PATH;
                this.D = str2;
                this.N.setString(this, SP.FOLDER_PATH, str2);
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            FileGetSet fileGetSet4 = (FileGetSet) obj;
            if (fileGetSet4 != null && fileGetSet4.getFilePath() != null && fileGetSet4.getFilePath().equals(this.D) && (fileGetSet4.getFilePath().equals(Default.DEFAULT_FOLDER_PATH) || new File(fileGetSet4.getFilePath()).exists())) {
                break;
            }
        }
        w7 w7Var = this.C;
        if (w7Var != null) {
            w7Var.o(arrayList, this.D);
        }
    }

    public final void y() {
        SP sp = this.N;
        String str = Default.DEFAULT_FOLDER_PATH;
        String string = sp.getString(this, SP.FOLDER_PATH, str);
        this.N.setString(this, SP.FOLDER_PATH, this.D);
        if (this.D.equals(string)) {
            u();
            return;
        }
        if (isFinishing()) {
            return;
        }
        v60 v60Var = new v60(this, R.style.AppBottomSheetDialogTheme);
        View viewInflate = getLayoutInflater().inflate(R.layout.bottomsheet_folder_path, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_folder_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_folder_path);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate.findViewById(R.id.card_done);
        textView.setText(this.D.equals(str) ? Default.DEFAULT_FOLDER_NAME : new File(this.D).getName());
        textView2.setText(this.D);
        materialCardView.setOnClickListener(new re2(this, v60Var, 1));
        v60Var.show();
    }
}