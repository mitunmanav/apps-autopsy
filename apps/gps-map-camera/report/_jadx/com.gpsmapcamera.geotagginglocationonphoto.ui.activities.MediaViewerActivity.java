package com.gpsmapcamera.geotagginglocationonphoto.ui.activities;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.ui.activities.MediaViewerActivity;
import com.itextpdf.text.html.HtmlTags;
import com.itextpdf.text.pdf.parser.HriA.jumTrYZsYnyZCd;
import defpackage.af1;
import defpackage.ap5;
import defpackage.bi3;
import defpackage.bv0;
import defpackage.c54;
import defpackage.c6;
import defpackage.ca4;
import defpackage.ca6;
import defpackage.cc7;
import defpackage.cd;
import defpackage.cr3;
import defpackage.d63;
import defpackage.d68;
import defpackage.df2;
import defpackage.dm2;
import defpackage.dq9;
import defpackage.dt3;
import defpackage.ed;
import defpackage.ej6;
import defpackage.eo7;
import defpackage.et3;
import defpackage.f02;
import defpackage.fd4;
import defpackage.gb0;
import defpackage.hd4;
import defpackage.hv0;
import defpackage.i41;
import defpackage.i6;
import defpackage.i73;
import defpackage.ih3;
import defpackage.iv0;
import defpackage.jj2;
import defpackage.jv4;
import defpackage.k5;
import defpackage.kea;
import defpackage.kf8;
import defpackage.kg1;
import defpackage.kj2;
import defpackage.lj6;
import defpackage.lt1;
import defpackage.mk9;
import defpackage.mm1;
import defpackage.mq7;
import defpackage.mz8;
import defpackage.o82;
import defpackage.oc4;
import defpackage.on5;
import defpackage.p4a;
import defpackage.pm;
import defpackage.pm2;
import defpackage.pn9;
import defpackage.qc4;
import defpackage.qd3;
import defpackage.rc4;
import defpackage.ro6;
import defpackage.rp9;
import defpackage.s7a;
import defpackage.ub7;
import defpackage.ue0;
import defpackage.ul1;
import defpackage.v60;
import defpackage.w91;
import defpackage.we2;
import defpackage.wl1;
import defpackage.wm2;
import defpackage.x92;
import defpackage.xc4;
import defpackage.xe2;
import defpackage.xx4;
import defpackage.ya4;
import defpackage.zc;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MediaViewerActivity extends kj2 implements xe2 {
    public static final /* synthetic */ int c0 = 0;
    public final ro6 C;
    public boolean D;
    public jj2 F;
    public int I;
    public final ro6 J;
    public df2 K;
    public final i6 N;
    public final i6 O;
    public final i6 P;
    public final i6 Q;
    public MapView R;
    public boolean T;
    public qd3 U;
    public v60 V;
    public PopupWindow W;
    public v60 X;
    public pm Y;
    public v60 Z;
    public bv0 a0;
    public v60 b0;
    public final ro6 B = new ro6(new oc4(this, 0));
    public boolean E = true;
    public ArrayList G = new ArrayList();
    public ca4 H = new ca4();
    public jv4 L = jv4.a;
    public final ul1 M = new ul1(this);
    public final Admob S = new Admob();

    public MediaViewerActivity() {
        int i = 1;
        this.C = new ro6(new oc4(this, i));
        int i2 = 2;
        this.J = new ro6(new oc4(this, i2));
        this.N = (i6) n(new qc4(this, i), new c6(i));
        int i3 = 4;
        this.O = (i6) n(new qc4(this, i2), new c6(i3));
        this.P = (i6) n(new qc4(this, 3), new c6(i3));
        this.Q = (i6) n(new qc4(this, i3), new c6(i3));
    }

    public static final void z(bv0 bv0Var, MediaViewerActivity mediaViewerActivity) {
        Uri contentUri;
        Cursor cursorQuery;
        i41 i41Var = null;
        if (!s7a.j()) {
            dt3 dt3VarA = kea.a(mediaViewerActivity);
            kg1 kg1Var = wl1.a;
            mk9.g(dt3VarA, c54.a, null, new fd4(bv0Var, mediaViewerActivity, i41Var, 1), 2);
            return;
        }
        EditText editText = (EditText) bv0Var.f;
        String string = ej6.Y(s7a.e(editText.getText().toString())).toString();
        if (string.length() == 0) {
            editText.setError(mediaViewerActivity.getString(R.string.file_name_should_not_be_empty));
            editText.requestFocus();
            return;
        }
        s7a.i(mediaViewerActivity, editText);
        Uri uriWithAppendedId = mediaViewerActivity.H.h;
        if (!bi3.b(uriWithAppendedId != null ? uriWithAppendedId.getAuthority() : null, "media") && (cursorQuery = mediaViewerActivity.getContentResolver().query((contentUri = MediaStore.Files.getContentUri("external")), new String[]{"_id"}, "_data = ?", new String[]{mediaViewerActivity.H.d}, null)) != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    uriWithAppendedId = ContentUris.withAppendedId(contentUri, cursorQuery.getLong(0));
                }
                cursorQuery.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dq9.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
        uriWithAppendedId.getClass();
        try {
            IntentSender intentSender = MediaStore.createWriteRequest(mediaViewerActivity.getContentResolver(), iv0.b(uriWithAppendedId)).getIntentSender();
            intentSender.getClass();
            mediaViewerActivity.Q.a(new ih3(intentSender, null, 0, 2), null);
        } catch (Exception unused) {
            dt3 dt3VarA2 = kea.a(mediaViewerActivity);
            kg1 kg1Var2 = wl1.a;
            mk9.g(dt3VarA2, c54.a, null, new ed(mediaViewerActivity, string, i41Var, 20), 2);
        }
    }

    public final void A() {
        k5 k5VarS = s();
        String strA = s7a.a(this.H.e, this);
        String strSubstring = new SimpleDateFormat(Default.DEFAULT_TIME_FORMAT_DT, Locale.ENGLISH).format(Long.valueOf(this.H.e));
        strSubstring.getClass();
        if (lj6.q(strSubstring, "0", false)) {
            strSubstring = strSubstring.substring(1, strSubstring.length());
        }
        k5VarS.k.setText(strA);
        k5VarS.l.setText(strSubstring);
    }

    @Override // defpackage.xe2
    public final void c(df2 df2Var, jv4 jv4Var) {
        MediaViewerActivity mediaViewerActivity;
        jv4Var.getClass();
        this.L = jv4Var;
        v60 v60Var = this.Z;
        if (v60Var != null) {
            v60Var.dismiss();
        }
        int iOrdinal = jv4Var.ordinal();
        int i = 0;
        i41 i41Var = null;
        if (iOrdinal == 0) {
            try {
                if (!s7a.j()) {
                    dt3 dt3VarA = kea.a(this);
                    kg1 kg1Var = wl1.a;
                    mk9.g(dt3VarA, c54.a, null, new cd(this, df2Var, i41Var, 21), 2);
                    return;
                }
                this.K = df2Var;
                o82 o82Var = new o82((Context) this, df2Var.b);
                LinkedHashMap linkedHashMapJ = mm1.j(this);
                ArrayList arrayList = new ArrayList(linkedHashMapJ.size());
                Iterator it = linkedHashMapJ.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((List) ((Map.Entry) it.next()).getValue());
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                ArrayList arrayList3 = new ArrayList();
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        List list = (List) obj;
                        list.getClass();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((Uri) it2.next());
                        }
                    }
                }
                if (!hv0.q(arrayList3, o82Var.c())) {
                    ul1.k(this.M, o82Var);
                    return;
                }
                dt3 dt3VarA2 = kea.a(this);
                kg1 kg1Var2 = wl1.a;
                mk9.g(dt3VarA2, c54.a, null, new xc4(this, i41Var, i), 2);
                return;
            } catch (Exception unused) {
                HelperClass.showSnackBar(s().a, getString(R.string.copy_failed));
                return;
            }
        }
        int i3 = 1;
        if (iOrdinal != 1) {
            mq7.d();
            return;
        }
        v60 v60Var2 = this.Z;
        if (v60Var2 != null) {
            v60Var2.dismiss();
        }
        try {
            if (s7a.j()) {
                this.K = df2Var;
                MediaScannerConnection.scanFile(this, new String[]{this.H.d}, null, new pm2(new ArrayList(), this, i3));
                return;
            }
            File file = new File(this.H.d);
            File file2 = new File(df2Var.b);
            dt3 dt3VarA3 = kea.a(this);
            kg1 kg1Var3 = wl1.a;
            mediaViewerActivity = this;
            try {
                mk9.g(dt3VarA3, c54.a, null, new ue0(mediaViewerActivity, file, file2, i41Var, 1), 2);
            } catch (Exception unused2) {
                HelperClass.showSnackBar(mediaViewerActivity.s().a, mediaViewerActivity.getString(R.string.move_failed));
            }
        } catch (Exception unused3) {
            mediaViewerActivity = this;
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            String string = getString(R.string.wallpaper_set);
            string.getClass();
            x92.l(this, string);
        }
    }

    @Override // defpackage.kj2, defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        String string = u().getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 16;
        int i3 = 0;
        int i4 = 1;
        if (bi3.b(string, Default.DARK)) {
            this.T = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.T = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.T = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        RelativeLayout relativeLayout = s().a;
        qc4 qc4Var = new qc4(this, i3);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, qc4Var);
        p4a.g(this);
        this.G = new ArrayList(ya4.a);
        this.I = ya4.b;
        dm2 dm2Var = new dm2(i4, this);
        ul1 ul1Var = this.M;
        ((ca6) ul1Var.d).c = new d63(i2, ul1Var, dm2Var);
        dt3 dt3VarA = kea.a(this);
        kg1 kg1Var = wl1.a;
        mk9.g(dt3VarA, c54.a, null, new xc4(this, null, 4), 2);
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        MapView mapView = this.R;
        if (mapView != null) {
            kf8 kf8Var = mapView.a;
            et3 et3Var = kf8Var.a;
            if (et3Var != null) {
                et3Var.onDestroy();
            } else {
                kf8Var.c(1);
            }
        }
        this.R = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        et3 et3Var;
        super.onLowMemory();
        MapView mapView = this.R;
        if (mapView == null || (et3Var = mapView.a.a) == null) {
            return;
        }
        et3Var.onLowMemory();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onPause() {
        MapView mapView = this.R;
        if (mapView != null) {
            kf8 kf8Var = mapView.a;
            et3 et3Var = kf8Var.a;
            if (et3Var != null) {
                et3Var.onPause();
            } else {
                kf8Var.c(5);
            }
        }
        super.onPause();
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        MapView mapView = this.R;
        if (mapView != null) {
            kf8 kf8Var = mapView.a;
            kf8Var.getClass();
            kf8Var.d(null, new d68(kf8Var, 1));
        }
        if (this.H.d.length() == 0) {
            if (this.G.isEmpty()) {
                finish();
            } else {
                Object obj = this.G.get(this.I);
                obj.getClass();
                this.H = (ca4) obj;
            }
        }
        if (AllAdsApproval.isCollectionMediaViewerBanner(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            Admob admob = this.S;
            if (i == 9) {
                int i2 = RemoteAdData.COLLECTION_MEDIA_VIEWER_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    admob.loadAdaptive_banner(this, s().b, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
                } else if (i2 == 2) {
                    admob.loadAdaptive_bannerAdax(this, s().b, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                admob.loadAdaptive_banner(this, s().b, RemoteAdData.GALLERY_SCREEN_BANNER_ID);
            } else if (i == 2) {
                admob.loadAdaptive_bannerAdax(this, s().b, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            s().b.setVisibility(8);
        }
        if (!new File(this.H.d).exists()) {
            if (this.G.isEmpty() || ya4.a.isEmpty()) {
                finish();
            } else {
                this.G.remove(this.H);
                ArrayList arrayListV = hv0.V(ya4.a);
                ya4.a = arrayListV;
                arrayListV.remove(this.H);
                jj2 jj2Var = this.F;
                if (jj2Var != null) {
                    jj2Var.k(this.I);
                }
                if (this.G.isEmpty()) {
                    finish();
                } else {
                    if (this.I >= this.G.size()) {
                        this.I = this.G.size() - 1;
                    }
                    int i3 = this.I;
                    if (i3 >= 0) {
                        Object obj2 = this.G.get(i3);
                        obj2.getClass();
                        this.H = (ca4) obj2;
                    } else {
                        finish();
                    }
                }
            }
        }
        if (!getIntent().hasExtra("viewType")) {
            s().f.setVisibility(8);
        } else if (getIntent().getIntExtra("viewType", 0) == 2) {
            s().f.setVisibility(0);
        } else {
            s().f.setVisibility(8);
        }
    }

    @Override // defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        MapView mapView = this.R;
        if (mapView != null) {
            kf8 kf8Var = mapView.a;
            et3 et3Var = kf8Var.a;
            if (et3Var != null) {
                et3Var.d(bundle);
                return;
            }
            Bundle bundle2 = kf8Var.b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onStart() {
        super.onStart();
        MapView mapView = this.R;
        if (mapView != null) {
            kf8 kf8Var = mapView.a;
            kf8Var.getClass();
            kf8Var.d(null, new d68(kf8Var, 0));
        }
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onStop() {
        MapView mapView = this.R;
        if (mapView != null) {
            kf8 kf8Var = mapView.a;
            et3 et3Var = kf8Var.a;
            if (et3Var != null) {
                et3Var.onStop();
            } else {
                kf8Var.c(4);
            }
        }
        super.onStop();
    }

    public final k5 s() {
        return (k5) this.B.getValue();
    }

    public final df2 t() {
        df2 df2Var = this.K;
        if (df2Var != null) {
            return df2Var;
        }
        bi3.g("foldersModel");
        throw null;
    }

    public final SP u() {
        return (SP) this.C.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int v() {
        String string;
        int integer = u().getInteger(this, SP.TEMPLATE_TYPE, 0);
        if (integer == 0) {
            string = u().getString(this, SP.MAP_TYPE_TEMPLATE, Default.SETELLITE_2);
        } else if (integer == 1) {
            string = u().getString(this, SP.MAP_TYPE_TEMPLATE_CLASSIC, Default.SETELLITE_2);
        } else if (integer == 2) {
            string = u().getString(this, SP.MAP_TYPE_TEMPLATE_REPORTING, Default.SETELLITE_2);
        } else if (integer != 3) {
            string = integer != 4 ? u().getString(this, SP.MAP_TYPE_TEMPLATE_QR, Default.SETELLITE_2) : u().getString(this, SP.MAP_TYPE_TEMPLATE_DT, Default.SETELLITE_2);
        } else {
            string = u().getString(this, SP.MAP_TYPE_TEMPLATE_NC, Default.SETELLITE_2);
        }
        if (string != null) {
            switch (string.hashCode()) {
                case -1579103941:
                    if (string.equals(Default.SETELLITE_2)) {
                        return 2;
                    }
                    break;
                case -1423437003:
                    if (string.equals(Default.TERRAIN_3)) {
                        return 3;
                    }
                    break;
                case -1202757124:
                    if (string.equals(Default.HYBRID_4)) {
                        return 4;
                    }
                    break;
                case 1366708796:
                    string.equals(Default.NORMAL_1);
                    return 1;
            }
        }
        return 1;
    }

    public final void w(File file) {
        ArrayList arrayList;
        String name;
        s7a.b = true;
        s7a.a = true;
        ro6 ro6Var = this.J;
        if (((Number) ro6Var.getValue()).intValue() == 1 || ((Number) ro6Var.getValue()).intValue() == 2) {
            int size = this.G.size();
            int i = this.I;
            ca4 ca4Var = (i < 0 || i >= size) ? null : (ca4) this.G.get(i);
            jj2 jj2Var = this.F;
            if (jj2Var != null) {
                jj2Var.k(this.I);
            }
            jj2 jj2Var2 = this.F;
            if (jj2Var2 == null || (arrayList = jj2Var2.d) == null) {
                arrayList = new ArrayList();
            }
            this.G = arrayList;
            if (ca4Var != null) {
                ya4.a.remove(ca4Var);
            }
            if (this.G.isEmpty()) {
                finish();
            } else {
                int iB = mz8.b(s().m.getCurrentItem(), 0, this.G.size() - 1);
                this.I = iB;
                Object obj = this.G.get(iB);
                obj.getClass();
                this.H = (ca4) obj;
                A();
            }
        } else {
            ca4 ca4Var2 = this.H;
            String path = file.getPath();
            path.getClass();
            ca4Var2.getClass();
            ca4Var2.d = path;
            ca4 ca4Var3 = this.H;
            String parent = file.getParent();
            parent.getClass();
            ca4Var3.getClass();
            ca4Var3.b = parent;
            ca4 ca4Var4 = this.H;
            File parentFile = file.getParentFile();
            if (parentFile == null || (name = parentFile.getName()) == null) {
                name = "";
            }
            ca4Var4.getClass();
            ca4Var4.a = name;
            ca4 ca4Var5 = this.H;
            String name2 = file.getName();
            name2.getClass();
            ca4Var5.getClass();
            ca4Var5.k = name2;
            int size2 = this.G.size();
            int i2 = this.I;
            if (i2 >= 0 && i2 < size2) {
                this.G.set(i2, this.H);
            }
            A();
        }
        String string = getString(R.string.moveto);
        string.getClass();
        String strX = eo7.x(string, " ", t().a);
        RelativeLayout relativeLayout = s().a;
        relativeLayout.getClass();
        x92.k(relativeLayout, strX, s().c);
    }

    public final void x(jv4 jv4Var) {
        this.Y = pm.w(getLayoutInflater());
        v60 v60Var = new v60(this, R.style.BottomSheetDialog);
        this.Z = v60Var;
        pm pmVar = this.Y;
        pmVar.getClass();
        v60Var.setContentView((RelativeLayout) pmVar.b);
        v60 v60Var2 = this.Z;
        v60Var2.getClass();
        int i = 1;
        v60Var2.setCancelable(true);
        v60 v60Var3 = this.Z;
        v60Var3.getClass();
        v60Var3.create();
        v60 v60Var4 = this.Z;
        v60Var4.getClass();
        v60Var4.show();
        pm pmVar2 = this.Y;
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
            recyclerView.setItemAnimator(new wm2(i));
            recyclerView.setAdapter((on5) ap5Var2.a);
            recyclerView.setNestedScrollingEnabled(true);
            dt3 dt3VarA = kea.a(this);
            kg1 kg1Var = wl1.a;
            mk9.g(dt3VarA, c54.a, null, new gb0(this, ap5Var, ap5Var2, (i41) null, 20), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:159:0x0336  */
    /* JADX WARN: Code duplicated, block: B:178:0x037c  */
    /* JADX WARN: Code duplicated, block: B:238:0x047c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0490  */
    /* JADX WARN: Code duplicated, block: B:256:0x04bd  */
    public final void y() {
        int iE;
        int iE2;
        Integer numR;
        Integer numR2;
        Integer numR3;
        String strX;
        double d;
        String str;
        f02 f02Var;
        String string;
        String string2;
        String strX2;
        String strValueOf;
        String strValueOf2;
        String str2;
        String strD;
        int i;
        int i2;
        int i3;
        int i4;
        f02 f02Var2;
        Uri uriG;
        Uri uriD;
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_file_details, (ViewGroup) null, false);
        int i5 = R.id.btnOk;
        TextView textView = (TextView) pn9.a(R.id.btnOk, viewInflate);
        if (textView != null) {
            i5 = R.id.btnOpenInMaps;
            FrameLayout frameLayout = (FrameLayout) pn9.a(R.id.btnOpenInMaps, viewInflate);
            if (frameLayout != null) {
                i5 = R.id.cardLocation;
                LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.cardLocation, viewInflate);
                if (linearLayout != null) {
                    i5 = R.id.cardMap;
                    if (((CardView) pn9.a(R.id.cardMap, viewInflate)) != null) {
                        i5 = R.id.clMetadata;
                        if (((ConstraintLayout) pn9.a(R.id.clMetadata, viewInflate)) != null) {
                            i5 = R.id.dividerInfo;
                            View viewA = pn9.a(R.id.dividerInfo, viewInflate);
                            if (viewA != null) {
                                i5 = R.id.emptyView;
                                View viewA2 = pn9.a(R.id.emptyView, viewInflate);
                                if (viewA2 != null) {
                                    i5 = R.id.guideLabels;
                                    if (((Guideline) pn9.a(R.id.guideLabels, viewInflate)) != null) {
                                        i5 = R.id.imgLocationPin;
                                        if (((ImageView) pn9.a(R.id.imgLocationPin, viewInflate)) != null) {
                                            i5 = R.id.lblCamera;
                                            if (((TextView) pn9.a(R.id.lblCamera, viewInflate)) != null) {
                                                i5 = R.id.lblDate;
                                                if (((TextView) pn9.a(R.id.lblDate, viewInflate)) != null) {
                                                    i5 = R.id.lblName;
                                                    if (((TextView) pn9.a(R.id.lblName, viewInflate)) != null) {
                                                        i5 = R.id.lblPath;
                                                        if (((TextView) pn9.a(R.id.lblPath, viewInflate)) != null) {
                                                            i5 = R.id.lblResolution;
                                                            if (((TextView) pn9.a(R.id.lblResolution, viewInflate)) != null) {
                                                                i5 = R.id.lblSize;
                                                                if (((TextView) pn9.a(R.id.lblSize, viewInflate)) != null) {
                                                                    i5 = R.id.llLocationContainer;
                                                                    LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.llLocationContainer, viewInflate);
                                                                    if (linearLayout2 != null) {
                                                                        i5 = R.id.mapClickOverlay;
                                                                        View viewA3 = pn9.a(R.id.mapClickOverlay, viewInflate);
                                                                        if (viewA3 != null) {
                                                                            i5 = R.id.map_view;
                                                                            MapView mapView = (MapView) pn9.a(R.id.map_view, viewInflate);
                                                                            if (mapView != null) {
                                                                                kf8 kf8Var = mapView.a;
                                                                                i5 = R.id.txtCamera;
                                                                                TextView textView2 = (TextView) pn9.a(R.id.txtCamera, viewInflate);
                                                                                if (textView2 != null) {
                                                                                    i5 = R.id.txtCoordinates;
                                                                                    TextView textView3 = (TextView) pn9.a(R.id.txtCoordinates, viewInflate);
                                                                                    if (textView3 != null) {
                                                                                        TextView textView4 = (TextView) pn9.a(R.id.txtDate, viewInflate);
                                                                                        if (textView4 == null) {
                                                                                            i5 = R.id.txtDate;
                                                                                        } else if (((TextView) pn9.a(R.id.txtDetails, viewInflate)) != null) {
                                                                                            TextView textView5 = (TextView) pn9.a(R.id.txtLocationTitle, viewInflate);
                                                                                            if (textView5 != null) {
                                                                                                TextView textView6 = (TextView) pn9.a(R.id.txtName, viewInflate);
                                                                                                if (textView6 != null) {
                                                                                                    TextView textView7 = (TextView) pn9.a(R.id.txtPath, viewInflate);
                                                                                                    if (textView7 == null) {
                                                                                                        i5 = R.id.txtPath;
                                                                                                    } else if (((TextView) pn9.a(R.id.txtPhotoLocationHeader, viewInflate)) != null) {
                                                                                                        TextView textView8 = (TextView) pn9.a(R.id.txtResolution, viewInflate);
                                                                                                        if (textView8 != null) {
                                                                                                            TextView textView9 = (TextView) pn9.a(R.id.txtSize, viewInflate);
                                                                                                            if (textView9 != null) {
                                                                                                                LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                                                                                                                final w91 w91Var = new w91();
                                                                                                                w91Var.a = linearLayout3;
                                                                                                                w91Var.b = frameLayout;
                                                                                                                w91Var.c = linearLayout;
                                                                                                                w91Var.d = viewA;
                                                                                                                w91Var.e = viewA2;
                                                                                                                w91Var.f = viewA3;
                                                                                                                w91Var.g = textView2;
                                                                                                                w91Var.h = textView3;
                                                                                                                w91Var.i = textView4;
                                                                                                                w91Var.j = textView5;
                                                                                                                w91Var.k = textView9;
                                                                                                                v60 v60Var = new v60(this, R.style.BottomSheetDialog);
                                                                                                                this.X = v60Var;
                                                                                                                v60Var.setContentView(linearLayout3);
                                                                                                                v60 v60Var2 = this.X;
                                                                                                                v60Var2.getClass();
                                                                                                                v60Var2.setCancelable(true);
                                                                                                                v60 v60Var3 = this.X;
                                                                                                                v60Var3.getClass();
                                                                                                                if (v60Var3.g == null) {
                                                                                                                    v60Var3.g();
                                                                                                                }
                                                                                                                v60Var3.g.L(3);
                                                                                                                v60 v60Var4 = this.X;
                                                                                                                v60Var4.getClass();
                                                                                                                if (v60Var4.g == null) {
                                                                                                                    v60Var4.g();
                                                                                                                }
                                                                                                                v60Var4.g.K = true;
                                                                                                                v60 v60Var5 = this.X;
                                                                                                                v60Var5.getClass();
                                                                                                                v60Var5.create();
                                                                                                                v60 v60Var6 = this.X;
                                                                                                                v60Var6.getClass();
                                                                                                                v60Var6.show();
                                                                                                                textView.setOnClickListener(new rc4(this, 11));
                                                                                                                long j = this.H.e;
                                                                                                                Locale locale = Locale.ENGLISH;
                                                                                                                String str3 = new SimpleDateFormat(Default.DEFAULT_TIME_FORMAT_DT, locale).format(Long.valueOf(j));
                                                                                                                str3.getClass();
                                                                                                                locale.getClass();
                                                                                                                String lowerCase = str3.toLowerCase(locale);
                                                                                                                lowerCase.getClass();
                                                                                                                String str4 = new SimpleDateFormat("dd/MM/yyyy").format(Long.valueOf(this.H.e));
                                                                                                                str4.getClass();
                                                                                                                if (this.H.k.length() == 0) {
                                                                                                                    textView6.setText(new File(this.H.d).getName());
                                                                                                                } else {
                                                                                                                    textView6.setText(this.H.k);
                                                                                                                }
                                                                                                                textView7.setText(this.H.d);
                                                                                                                ca4 ca4Var = this.H;
                                                                                                                Uri uriG2 = ca4Var.h;
                                                                                                                if (uriG2 == null && (uriG2 = x92.g(this, ca4Var.d)) == null) {
                                                                                                                    String str5 = this.H.d;
                                                                                                                    str5.getClass();
                                                                                                                    try {
                                                                                                                        uriD = x92.d(this, str5);
                                                                                                                    } catch (Exception unused) {
                                                                                                                        uriD = null;
                                                                                                                    }
                                                                                                                    uriG2 = uriD;
                                                                                                                }
                                                                                                                ca4 ca4Var2 = this.H;
                                                                                                                String str6 = ca4Var2.d;
                                                                                                                int i6 = ca4Var2.j;
                                                                                                                str6.getClass();
                                                                                                                if (i6 == 2) {
                                                                                                                    try {
                                                                                                                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                                                                                                        if (uriG2 != null) {
                                                                                                                            try {
                                                                                                                                mediaMetadataRetriever.setDataSource(this, uriG2);
                                                                                                                            } catch (Exception unused2) {
                                                                                                                                mediaMetadataRetriever.setDataSource(str6);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            mediaMetadataRetriever.setDataSource(str6);
                                                                                                                        }
                                                                                                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                                                                                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                                                                                                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                                                                                                                        try {
                                                                                                                            mediaMetadataRetriever.release();
                                                                                                                        } catch (Exception unused3) {
                                                                                                                        }
                                                                                                                        int iIntValue = (strExtractMetadata == null || (numR3 = lj6.r(strExtractMetadata)) == null) ? 0 : numR3.intValue();
                                                                                                                        int iIntValue2 = (strExtractMetadata2 == null || (numR2 = lj6.r(strExtractMetadata2)) == null) ? 0 : numR2.intValue();
                                                                                                                        int iIntValue3 = (strExtractMetadata3 == null || (numR = lj6.r(strExtractMetadata3)) == null) ? 0 : numR.intValue();
                                                                                                                        if (iIntValue3 == 90 || iIntValue3 == 270) {
                                                                                                                            int i7 = iIntValue2;
                                                                                                                            iIntValue2 = iIntValue;
                                                                                                                            iIntValue = i7;
                                                                                                                        }
                                                                                                                        iE = iIntValue;
                                                                                                                        iE2 = iIntValue2;
                                                                                                                    } catch (Exception e) {
                                                                                                                        e.printStackTrace();
                                                                                                                        iE = 0;
                                                                                                                        iE2 = 0;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (uriG2 != null) {
                                                                                                                        try {
                                                                                                                            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uriG2);
                                                                                                                            if (inputStreamOpenInputStream != null) {
                                                                                                                                try {
                                                                                                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                                                                    options.inJustDecodeBounds = true;
                                                                                                                                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                                                                                                                                    i = options.outWidth;
                                                                                                                                    if (i <= 0 || (i3 = options.outHeight) <= 0) {
                                                                                                                                        i = 0;
                                                                                                                                        i2 = 0;
                                                                                                                                    } else {
                                                                                                                                        i2 = i3;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        inputStreamOpenInputStream.close();
                                                                                                                                    } catch (Exception e2) {
                                                                                                                                        e = e2;
                                                                                                                                        e.printStackTrace();
                                                                                                                                    }
                                                                                                                                } catch (Throwable th) {
                                                                                                                                    try {
                                                                                                                                        throw th;
                                                                                                                                    } catch (Throwable th2) {
                                                                                                                                        dq9.a(inputStreamOpenInputStream, th);
                                                                                                                                        throw th2;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = 0;
                                                                                                                                i2 = 0;
                                                                                                                            }
                                                                                                                        } catch (Exception e3) {
                                                                                                                            e = e3;
                                                                                                                            i = 0;
                                                                                                                            i2 = 0;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = 0;
                                                                                                                        i2 = 0;
                                                                                                                    }
                                                                                                                    if (i <= 0 || i2 <= 0) {
                                                                                                                        try {
                                                                                                                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                                                                                                                            options2.inJustDecodeBounds = true;
                                                                                                                            BitmapFactory.decodeFile(str6, options2);
                                                                                                                            int i8 = options2.outWidth;
                                                                                                                            if (i8 > 0 && (i4 = options2.outHeight) > 0) {
                                                                                                                                i2 = i4;
                                                                                                                                i = i8;
                                                                                                                            }
                                                                                                                        } catch (Exception e4) {
                                                                                                                            e4.printStackTrace();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (i <= 0 || i2 <= 0) {
                                                                                                                        if (uriG2 != null) {
                                                                                                                            try {
                                                                                                                                InputStream inputStreamOpenInputStream2 = getContentResolver().openInputStream(uriG2);
                                                                                                                                if (inputStreamOpenInputStream2 != null) {
                                                                                                                                    try {
                                                                                                                                        f02Var2 = new f02(inputStreamOpenInputStream2);
                                                                                                                                        try {
                                                                                                                                            inputStreamOpenInputStream2.close();
                                                                                                                                        } catch (Exception unused4) {
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th3) {
                                                                                                                                        try {
                                                                                                                                            throw th3;
                                                                                                                                        } catch (Throwable th4) {
                                                                                                                                            dq9.a(inputStreamOpenInputStream2, th3);
                                                                                                                                            throw th4;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    f02Var2 = null;
                                                                                                                                }
                                                                                                                            } catch (Exception unused5) {
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            f02Var2 = null;
                                                                                                                        }
                                                                                                                        if (f02Var2 == null) {
                                                                                                                            try {
                                                                                                                                File file = new File(str6);
                                                                                                                                if (file.exists() && file.canRead()) {
                                                                                                                                    f02Var2 = new f02(file.getAbsolutePath());
                                                                                                                                }
                                                                                                                            } catch (Exception unused6) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (f02Var2 != null) {
                                                                                                                            try {
                                                                                                                                iE2 = f02Var2.e(0, "ImageWidth");
                                                                                                                                iE = f02Var2.e(0, "ImageLength");
                                                                                                                                if (iE2 <= 0 || iE <= 0) {
                                                                                                                                    iE = i;
                                                                                                                                    iE2 = i2;
                                                                                                                                } else {
                                                                                                                                    int iE3 = f02Var2.e(1, "Orientation");
                                                                                                                                    if (iE3 != 6 && iE3 != 8) {
                                                                                                                                        iE2 = iE;
                                                                                                                                        iE = iE2;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Exception e5) {
                                                                                                                                e5.printStackTrace();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            iE = i;
                                                                                                                            iE2 = i2;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        iE = i;
                                                                                                                        iE2 = i2;
                                                                                                                    }
                                                                                                                    if (iE <= 0 || iE2 <= 0) {
                                                                                                                        if (uriG2 == null) {
                                                                                                                            try {
                                                                                                                                uriG = x92.g(this, str6);
                                                                                                                            } catch (Exception e6) {
                                                                                                                                e6.printStackTrace();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            uriG = uriG2;
                                                                                                                        }
                                                                                                                        if (uriG != null) {
                                                                                                                            Cursor cursorQuery = getContentResolver().query(uriG, new String[]{HtmlTags.WIDTH, HtmlTags.HEIGHT}, null, null, null);
                                                                                                                            if (cursorQuery != null) {
                                                                                                                                try {
                                                                                                                                    if (cursorQuery.moveToFirst()) {
                                                                                                                                        int columnIndex = cursorQuery.getColumnIndex(HtmlTags.WIDTH);
                                                                                                                                        int columnIndex2 = cursorQuery.getColumnIndex(HtmlTags.HEIGHT);
                                                                                                                                        if (columnIndex != -1 && columnIndex2 != -1) {
                                                                                                                                            iE = cursorQuery.getInt(columnIndex);
                                                                                                                                            iE2 = cursorQuery.getInt(columnIndex2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    cursorQuery.close();
                                                                                                                                } catch (Throwable th5) {
                                                                                                                                    try {
                                                                                                                                        throw th5;
                                                                                                                                    } catch (Throwable th6) {
                                                                                                                                        dq9.a(cursorQuery, th5);
                                                                                                                                        throw th6;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                if (iE <= 0 || iE2 <= 0) {
                                                                                                                    strX = "0 x 0";
                                                                                                                } else {
                                                                                                                    strX = iE + " x " + iE2;
                                                                                                                }
                                                                                                                if (iE <= 0 || iE2 <= 0) {
                                                                                                                    d = 1.0d;
                                                                                                                    str = "";
                                                                                                                } else {
                                                                                                                    d = 1.0d;
                                                                                                                    double d2 = (((long) iE) * ((long) iE2)) / 1000000.0d;
                                                                                                                    if (d2 >= 1.0d) {
                                                                                                                        str = Math.round(d2) + "MP";
                                                                                                                    } else {
                                                                                                                        str = String.format(Locale.US, "%.1fMP", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
                                                                                                                    }
                                                                                                                }
                                                                                                                if (str.length() > 0) {
                                                                                                                    strX = eo7.x(strX, " ", str);
                                                                                                                }
                                                                                                                textView8.setText(strX);
                                                                                                                try {
                                                                                                                    if (uriG2 != null) {
                                                                                                                        InputStream inputStreamOpenInputStream3 = getContentResolver().openInputStream(uriG2);
                                                                                                                        if (inputStreamOpenInputStream3 != null) {
                                                                                                                            try {
                                                                                                                                f02Var = new f02(inputStreamOpenInputStream3);
                                                                                                                                inputStreamOpenInputStream3.close();
                                                                                                                            } catch (Throwable th7) {
                                                                                                                                try {
                                                                                                                                    throw th7;
                                                                                                                                } catch (Throwable th8) {
                                                                                                                                    dq9.a(inputStreamOpenInputStream3, th7);
                                                                                                                                    throw th8;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            f02Var = null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        f02Var = new f02(this.H.d);
                                                                                                                    }
                                                                                                                } catch (Exception unused7) {
                                                                                                                }
                                                                                                                if (f02Var != null) {
                                                                                                                    try {
                                                                                                                        String strD2 = f02Var.d("Make");
                                                                                                                        if (strD2 != null) {
                                                                                                                            string = ej6.Y(strD2).toString();
                                                                                                                        } else {
                                                                                                                            string = null;
                                                                                                                        }
                                                                                                                        if (f02Var != null || (strD = f02Var.d("Model")) == null) {
                                                                                                                            string2 = null;
                                                                                                                        } else {
                                                                                                                            string2 = ej6.Y(strD).toString();
                                                                                                                        }
                                                                                                                        if (string2 != null || ej6.B(string2)) {
                                                                                                                            string2 = null;
                                                                                                                        } else if (string != null && !ej6.B(string) && !lj6.q(string2, string, true)) {
                                                                                                                            string2 = string + " " + string2;
                                                                                                                        }
                                                                                                                    } catch (Exception unused8) {
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    string = null;
                                                                                                                    if (f02Var != null) {
                                                                                                                        string2 = null;
                                                                                                                    } else {
                                                                                                                        string2 = null;
                                                                                                                    }
                                                                                                                    if (string2 != null) {
                                                                                                                        string2 = null;
                                                                                                                    } else {
                                                                                                                        string2 = null;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (string2 == null || ej6.B(string2)) {
                                                                                                                    String string3 = Build.MANUFACTURER;
                                                                                                                    String str7 = Build.MODEL;
                                                                                                                    str7.getClass();
                                                                                                                    string3.getClass();
                                                                                                                    if (!lj6.q(str7, string3, true)) {
                                                                                                                        if (string3.length() > 0) {
                                                                                                                            StringBuilder sb = new StringBuilder();
                                                                                                                            char cCharAt = string3.charAt(0);
                                                                                                                            if (Character.isLowerCase(cCharAt)) {
                                                                                                                                Locale.ROOT.getClass();
                                                                                                                                strValueOf = rp9.e(cCharAt);
                                                                                                                            } else {
                                                                                                                                strValueOf = String.valueOf(cCharAt);
                                                                                                                            }
                                                                                                                            sb.append((Object) strValueOf);
                                                                                                                            sb.append(string3.substring(1));
                                                                                                                            string3 = sb.toString();
                                                                                                                        }
                                                                                                                        strX2 = eo7.x(string3, " ", str7);
                                                                                                                    } else if (str7.length() > 0) {
                                                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                                                        char cCharAt2 = str7.charAt(0);
                                                                                                                        if (Character.isLowerCase(cCharAt2)) {
                                                                                                                            Locale.ROOT.getClass();
                                                                                                                            strValueOf2 = rp9.e(cCharAt2);
                                                                                                                        } else {
                                                                                                                            strValueOf2 = String.valueOf(cCharAt2);
                                                                                                                        }
                                                                                                                        sb2.append((Object) strValueOf2);
                                                                                                                        sb2.append(str7.substring(1));
                                                                                                                        strX2 = sb2.toString();
                                                                                                                    } else {
                                                                                                                        string2 = str7;
                                                                                                                    }
                                                                                                                    string2 = strX2;
                                                                                                                }
                                                                                                                ((TextView) w91Var.i).setText(str4 + " " + lowerCase);
                                                                                                                ((TextView) w91Var.g).setText(string2);
                                                                                                                long j2 = this.H.l;
                                                                                                                if (j2 <= 0) {
                                                                                                                    str2 = jumTrYZsYnyZCd.FSBwVgkZJHbMdv;
                                                                                                                } else {
                                                                                                                    double d3 = j2 / 1024.0d;
                                                                                                                    double d4 = d3 / 1024.0d;
                                                                                                                    double d5 = d4 / 1024.0d;
                                                                                                                    if (d5 >= d) {
                                                                                                                        str2 = String.format(Locale.US, "%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(d5)}, 1));
                                                                                                                    } else {
                                                                                                                        str2 = d4 >= d ? String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1)) : String.format(Locale.US, "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
                                                                                                                    }
                                                                                                                }
                                                                                                                ((TextView) w91Var.k).setText(str2);
                                                                                                                ca4 ca4Var3 = this.H;
                                                                                                                ConcurrentHashMap concurrentHashMap = i73.a;
                                                                                                                cr3 cr3VarE = i73.e(this, ca4Var3.d, uriG2, new File(ca4Var3.d));
                                                                                                                if (cr3VarE == null || (cr3VarE.a == 0.0d && cr3VarE.b == 0.0d)) {
                                                                                                                    linearLayout2.setVisibility(8);
                                                                                                                    return;
                                                                                                                }
                                                                                                                linearLayout2.setVisibility(0);
                                                                                                                final double d6 = cr3VarE.a;
                                                                                                                final double d7 = cr3VarE.b;
                                                                                                                int i9 = 4;
                                                                                                                String str8 = String.format(Locale.US, "%.4f° %s, %.4f° %s", Arrays.copyOf(new Object[]{Double.valueOf(Math.abs(d6)), d6 >= 0.0d ? "N" : "S", Double.valueOf(Math.abs(d7)), d7 >= 0.0d ? "E" : "W"}, 4));
                                                                                                                ((TextView) w91Var.j).setText(str8);
                                                                                                                ((TextView) w91Var.h).setText(str8);
                                                                                                                dt3 dt3VarA = kea.a(this);
                                                                                                                kg1 kg1Var = wl1.a;
                                                                                                                mk9.g(dt3VarA, af1.c, null, new hd4(this, d6, d7, w91Var, str8, null), 2);
                                                                                                                try {
                                                                                                                    this.R = mapView;
                                                                                                                    mapView.b(null);
                                                                                                                    kf8Var.getClass();
                                                                                                                    kf8Var.d(null, new d68(kf8Var, 0));
                                                                                                                    kf8Var.getClass();
                                                                                                                    kf8Var.d(null, new d68(kf8Var, 1));
                                                                                                                    mapView.a(new xx4() { // from class: wc4
                                                                                                                        @Override // defpackage.xx4
                                                                                                                        public final void g(s78 s78Var) {
                                                                                                                            w40 w40VarC;
                                                                                                                            MediaViewerActivity mediaViewerActivity = this.a;
                                                                                                                            double d8 = d6;
                                                                                                                            double d9 = d7;
                                                                                                                            int i10 = MediaViewerActivity.c0;
                                                                                                                            try {
                                                                                                                                p64.g(mediaViewerActivity);
                                                                                                                                s78Var.z(mediaViewerActivity.v());
                                                                                                                                int i11 = 8;
                                                                                                                                try {
                                                                                                                                    t49 t49Var = (t49) s78Var.b;
                                                                                                                                    Parcel parcelK = t49Var.K();
                                                                                                                                    parcelK.writeInt(0);
                                                                                                                                    parcelK.writeInt(0);
                                                                                                                                    parcelK.writeInt(0);
                                                                                                                                    parcelK.writeInt(0);
                                                                                                                                    t49Var.N(parcelK, 39);
                                                                                                                                    e65 e65VarR = s78Var.r();
                                                                                                                                    e65VarR.e();
                                                                                                                                    try {
                                                                                                                                        lo8 lo8Var = (lo8) e65VarR.b;
                                                                                                                                        Parcel parcelK2 = lo8Var.K();
                                                                                                                                        int i12 = pn8.a;
                                                                                                                                        parcelK2.writeInt(0);
                                                                                                                                        lo8Var.N(parcelK2, 1);
                                                                                                                                        try {
                                                                                                                                            Parcel parcelK3 = lo8Var.K();
                                                                                                                                            parcelK3.writeInt(0);
                                                                                                                                            lo8Var.N(parcelK3, 4);
                                                                                                                                            try {
                                                                                                                                                Parcel parcelK4 = lo8Var.K();
                                                                                                                                                parcelK4.writeInt(0);
                                                                                                                                                lo8Var.N(parcelK4, 5);
                                                                                                                                                try {
                                                                                                                                                    Parcel parcelK5 = lo8Var.K();
                                                                                                                                                    parcelK5.writeInt(0);
                                                                                                                                                    lo8Var.N(parcelK5, 6);
                                                                                                                                                    try {
                                                                                                                                                        Parcel parcelK6 = lo8Var.K();
                                                                                                                                                        parcelK6.writeInt(0);
                                                                                                                                                        lo8Var.N(parcelK6, 7);
                                                                                                                                                        LatLng latLng = new LatLng(d8, d9);
                                                                                                                                                        s78Var.m();
                                                                                                                                                        int iB = s7a.b(14);
                                                                                                                                                        int iB2 = s7a.b(22);
                                                                                                                                                        try {
                                                                                                                                                            Drawable drawable = mediaViewerActivity.getDrawable(R.drawable.google_map_pin);
                                                                                                                                                            if (drawable != null) {
                                                                                                                                                                drawable.setBounds(0, 0, iB, iB2);
                                                                                                                                                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB, iB2, Bitmap.Config.ARGB_8888);
                                                                                                                                                                bitmapCreateBitmap.getClass();
                                                                                                                                                                drawable.draw(new Canvas(bitmapCreateBitmap));
                                                                                                                                                                w40VarC = oj9.d(bitmapCreateBitmap);
                                                                                                                                                            } else {
                                                                                                                                                                w40VarC = oj9.c();
                                                                                                                                                            }
                                                                                                                                                        } catch (Exception unused9) {
                                                                                                                                                            w40VarC = oj9.c();
                                                                                                                                                        }
                                                                                                                                                        t64 t64Var = new t64();
                                                                                                                                                        t64Var.d = latLng;
                                                                                                                                                        t64Var.h = 0.5f;
                                                                                                                                                        t64Var.i = 1.0f;
                                                                                                                                                        t64Var.l = true;
                                                                                                                                                        t64Var.j = false;
                                                                                                                                                        t64Var.g = w40VarC;
                                                                                                                                                        s78Var.d(t64Var);
                                                                                                                                                        s78Var.u(do9.b(latLng, 15.0f));
                                                                                                                                                    } catch (RemoteException e7) {
                                                                                                                                                        throw new rx0(e7, i11);
                                                                                                                                                    }
                                                                                                                                                } catch (RemoteException e8) {
                                                                                                                                                    throw new rx0(e8, i11);
                                                                                                                                                }
                                                                                                                                            } catch (RemoteException e9) {
                                                                                                                                                throw new rx0(e9, i11);
                                                                                                                                            }
                                                                                                                                        } catch (RemoteException e10) {
                                                                                                                                            throw new rx0(e10, i11);
                                                                                                                                        }
                                                                                                                                    } catch (RemoteException e11) {
                                                                                                                                        throw new rx0(e11, i11);
                                                                                                                                    }
                                                                                                                                } catch (RemoteException e12) {
                                                                                                                                    throw new rx0(e12, i11);
                                                                                                                                }
                                                                                                                            } catch (Exception e13) {
                                                                                                                                e13.printStackTrace();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                } catch (Exception e7) {
                                                                                                                    e7.printStackTrace();
                                                                                                                }
                                                                                                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: pc4
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        MediaViewerActivity mediaViewerActivity = this.a;
                                                                                                                        int i10 = MediaViewerActivity.c0;
                                                                                                                        String string4 = ((TextView) w91Var.j).getText().toString();
                                                                                                                        if (string4 == null) {
                                                                                                                            string4 = "Photo Location";
                                                                                                                        }
                                                                                                                        String strEncode = Uri.encode(string4);
                                                                                                                        StringBuilder sb3 = new StringBuilder("geo:");
                                                                                                                        double d8 = d6;
                                                                                                                        sb3.append(d8);
                                                                                                                        sb3.append(",");
                                                                                                                        double d9 = d7;
                                                                                                                        sb3.append(d9);
                                                                                                                        sb3.append("?q=");
                                                                                                                        sb3.append(d8);
                                                                                                                        sb3.append(",");
                                                                                                                        sb3.append(d9);
                                                                                                                        sb3.append("(");
                                                                                                                        sb3.append(strEncode);
                                                                                                                        sb3.append(")");
                                                                                                                        Uri uri = Uri.parse(sb3.toString());
                                                                                                                        Intent intent = new Intent("android.intent.action.VIEW", uri);
                                                                                                                        intent.setPackage("com.google.android.apps.maps");
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                mediaViewerActivity.startActivity(intent);
                                                                                                                            } catch (Exception unused9) {
                                                                                                                                try {
                                                                                                                                    mediaViewerActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://maps.google.com/?q=" + d8 + "," + d9)));
                                                                                                                                } catch (Exception e8) {
                                                                                                                                    e8.printStackTrace();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (Exception unused10) {
                                                                                                                            mediaViewerActivity.startActivity(new Intent("android.intent.action.VIEW", uri));
                                                                                                                        }
                                                                                                                    }
                                                                                                                };
                                                                                                                ((FrameLayout) w91Var.b).setOnClickListener(onClickListener);
                                                                                                                ((LinearLayout) w91Var.c).setOnClickListener(onClickListener);
                                                                                                                ((View) w91Var.f).setOnClickListener(onClickListener);
                                                                                                                v60 v60Var7 = this.X;
                                                                                                                if (v60Var7 != null) {
                                                                                                                    v60Var7.setOnDismissListener(new zc(i9, this));
                                                                                                                    return;
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            i5 = R.id.txtSize;
                                                                                                        } else {
                                                                                                            i5 = R.id.txtResolution;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i5 = R.id.txtPhotoLocationHeader;
                                                                                                    }
                                                                                                } else {
                                                                                                    i5 = R.id.txtName;
                                                                                                }
                                                                                            } else {
                                                                                                i5 = R.id.txtLocationTitle;
                                                                                            }
                                                                                        } else {
                                                                                            i5 = R.id.txtDetails;
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
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
    }
}