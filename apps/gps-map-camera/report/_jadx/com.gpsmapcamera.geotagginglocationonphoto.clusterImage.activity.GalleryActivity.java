package com.gpsmapcamera.geotagginglocationonphoto.clusterImage.activity;

import android.content.Intent;
import android.content.IntentFilter;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.kG.GXMEboNuu;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.clusterImage.activity.GalleryActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.af1;
import defpackage.bi3;
import defpackage.bj;
import defpackage.bv0;
import defpackage.cc7;
import defpackage.dt3;
import defpackage.g63;
import defpackage.hv0;
import defpackage.ja1;
import defpackage.kea;
import defpackage.kg1;
import defpackage.l5;
import defpackage.lt1;
import defpackage.mk9;
import defpackage.n8;
import defpackage.nj2;
import defpackage.pa1;
import defpackage.ro6;
import defpackage.t73;
import defpackage.tm2;
import defpackage.ub7;
import defpackage.v50;
import defpackage.wl1;
import defpackage.x32;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class GalleryActivity extends bj {
    public static final /* synthetic */ int J = 0;
    public final ro6 B;
    public final ro6 C;
    public g63 E;
    public bv0 F;
    public boolean I;
    public final ArrayList D = new ArrayList();
    public final v50 G = new v50(6, this);
    public Admob H = new Admob();

    public GalleryActivity() {
        final int i = 0;
        this.B = new ro6(new nj2(this) { // from class: wl2
            public final /* synthetic */ GalleryActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i2 = i;
                GalleryActivity galleryActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = GalleryActivity.J;
                        return new SP(galleryActivity);
                    default:
                        int i4 = GalleryActivity.J;
                        View viewInflate = galleryActivity.getLayoutInflater().inflate(R.layout.activity_gallery, (ViewGroup) null, false);
                        int i5 = R.id.lay_toolbar;
                        View viewA = pn9.a(R.id.lay_toolbar, viewInflate);
                        if (viewA != null) {
                            l76 l76VarA = l76.a(viewA);
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i5 = R.id.recyclerImage;
                            RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.recyclerImage, viewInflate);
                            if (recyclerView != null) {
                                i5 = R.id.rel_adaptive_banner;
                                if (((RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate)) != null) {
                                    i5 = R.id.tvAddress;
                                    TextView textView = (TextView) pn9.a(R.id.tvAddress, viewInflate);
                                    if (textView != null) {
                                        return new l5(constraintLayout, l76VarA, constraintLayout, recyclerView, textView);
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.C = new ro6(new nj2(this) { // from class: wl2
            public final /* synthetic */ GalleryActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i3 = i2;
                GalleryActivity galleryActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = GalleryActivity.J;
                        return new SP(galleryActivity);
                    default:
                        int i5 = GalleryActivity.J;
                        View viewInflate = galleryActivity.getLayoutInflater().inflate(R.layout.activity_gallery, (ViewGroup) null, false);
                        int i6 = R.id.lay_toolbar;
                        View viewA = pn9.a(R.id.lay_toolbar, viewInflate);
                        if (viewA != null) {
                            l76 l76VarA = l76.a(viewA);
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i6 = R.id.recyclerImage;
                            RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.recyclerImage, viewInflate);
                            if (recyclerView != null) {
                                i6 = R.id.rel_adaptive_banner;
                                if (((RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate)) != null) {
                                    i6 = R.id.tvAddress;
                                    TextView textView = (TextView) pn9.a(R.id.tvAddress, viewInflate);
                                    if (textView != null) {
                                        return new l5(constraintLayout, l76VarA, constraintLayout, recyclerView, textView);
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
                        return null;
                }
            }
        });
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String addressLine;
        lt1.a(this);
        ro6 ro6Var = this.B;
        String string = ((SP) ro6Var.getValue()).getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 1;
        final int i3 = 0;
        if (bi3.b(string, Default.DARK)) {
            this.I = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, GXMEboNuu.IsEylNga) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.I = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.I = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        new HelperClass().SetLanguage(this);
        setContentView(s().a);
        ConstraintLayout constraintLayout = s().c;
        x32 x32Var = new x32(8, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(constraintLayout, x32Var);
        ((TextView) s().b.l).setText(getString(R.string.images));
        this.F = bv0.p(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("SELECTION_ACTIVE");
        intentFilter.addAction("SELECTION_DEACTIVATE");
        intentFilter.addAction("IMAGES_SELECTED");
        bv0 bv0Var = this.F;
        bv0Var.getClass();
        bv0Var.B(this.G, intentFilter);
        k().a(this, new n8(this, 11));
        ((RelativeLayout) s().b.c).setOnClickListener(new View.OnClickListener(this) { // from class: cm2
            public final /* synthetic */ GalleryActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                GalleryActivity galleryActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = GalleryActivity.J;
                        galleryActivity.k().c();
                        break;
                    case 1:
                        g63 g63Var = galleryActivity.E;
                        if (g63Var != null) {
                            int i6 = g63Var.f;
                            ArrayList arrayList = g63Var.d;
                            if (i6 == arrayList.size()) {
                                g63Var.o();
                            } else {
                                g63Var.e = true;
                                Iterator it = arrayList.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    t73 t73Var = (t73) next;
                                    t73Var.d = true;
                                    g63Var.f(arrayList.indexOf(t73Var));
                                }
                                g63Var.f = arrayList.size();
                                g63Var.h.E(new Intent("IMAGES_SELECTED"));
                            }
                        }
                        break;
                    default:
                        g63 g63Var2 = galleryActivity.E;
                        if (g63Var2 != null) {
                            GalleryActivity galleryActivity2 = g63Var2.c;
                            if (g63Var2.e && g63Var2.f > 0) {
                                an.c = false;
                                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                Iterator it2 = g63Var2.d.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    t73 t73Var2 = (t73) next2;
                                    if (t73Var2.d && new File(t73Var2.b).exists()) {
                                        arrayList2.add(t73Var2.a);
                                    }
                                }
                                String string2 = g63Var2.p().getString(galleryActivity2, SP.SELECTED_LATITUDE, "00");
                                string2.getClass();
                                double d = Double.parseDouble(string2);
                                String string3 = g63Var2.p().getString(galleryActivity2, SP.SELECTED_LONGITUDE, "00");
                                string3.getClass();
                                double d2 = Double.parseDouble(string3);
                                String str = galleryActivity2.s().e.getText().toString() + "\n\nhttp://maps.google.com/maps?q=" + d + "," + d2;
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND_MULTIPLE");
                                intent.putExtra("android.intent.extra.TEXT", str);
                                intent.setType("image/*");
                                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
                                galleryActivity2.startActivity(intent);
                                g63Var2.o();
                            } else {
                                Toast.makeText(galleryActivity2, "Please select images", 0).show();
                            }
                        }
                        break;
                }
            }
        });
        String string2 = ((SP) ro6Var.getValue()).getString(this, SP.SELECTED_LATITUDE, "00");
        string2.getClass();
        double d = Double.parseDouble(string2);
        String string3 = ((SP) ro6Var.getValue()).getString(this, SP.SELECTED_LONGITUDE, "00");
        string3.getClass();
        try {
            List<Address> fromLocation = new Geocoder(this).getFromLocation(d, Double.parseDouble(string3), 1);
            List<Address> list = fromLocation;
            if (list == null || list.isEmpty()) {
                addressLine = "-";
            } else {
                addressLine = fromLocation.get(0).getAddressLine(0);
                addressLine.getClass();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        s().e.setText(addressLine);
        String string4 = ((SP) ro6Var.getValue()).getString(this, SP.SELECTED_LATITUDE, "00");
        string4.getClass();
        double d2 = Double.parseDouble(string4);
        String string5 = ((SP) ro6Var.getValue()).getString(this, SP.SELECTED_LONGITUDE, "00");
        string5.getClass();
        LatLng latLng = new LatLng(d2, Double.parseDouble(string5));
        Iterator it = ja1.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            pa1 pa1Var = (pa1) next;
            ArrayList arrayList = pa1Var.b;
            LatLng latLng2 = pa1Var.a;
            if (latLng2.equals(latLng) || (Math.abs(latLng2.d - latLng.d) < 1.0E-5d && Math.abs(latLng2.e - latLng.e) < 1.0E-5d)) {
                int size = arrayList.size();
                while (i3 < size) {
                    String str = (String) arrayList.get(i3);
                    Uri uri = (Uri) hv0.x(i3, pa1Var.c);
                    if (uri != null) {
                        this.D.add(new t73(uri, str, latLng2));
                    }
                    i3++;
                }
                break;
            }
        }
        dt3 dt3VarA = kea.a(this);
        kg1 kg1Var = wl1.a;
        final int i4 = 2;
        mk9.g(dt3VarA, af1.c, null, new tm2(this, null, i2), 2);
        ((RelativeLayout) s().b.i).setOnClickListener(new View.OnClickListener(this) { // from class: cm2
            public final /* synthetic */ GalleryActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                GalleryActivity galleryActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = GalleryActivity.J;
                        galleryActivity.k().c();
                        break;
                    case 1:
                        g63 g63Var = galleryActivity.E;
                        if (g63Var != null) {
                            int i7 = g63Var.f;
                            ArrayList arrayList2 = g63Var.d;
                            if (i7 == arrayList2.size()) {
                                g63Var.o();
                            } else {
                                g63Var.e = true;
                                Iterator it2 = arrayList2.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    t73 t73Var = (t73) next2;
                                    t73Var.d = true;
                                    g63Var.f(arrayList2.indexOf(t73Var));
                                }
                                g63Var.f = arrayList2.size();
                                g63Var.h.E(new Intent("IMAGES_SELECTED"));
                            }
                        }
                        break;
                    default:
                        g63 g63Var2 = galleryActivity.E;
                        if (g63Var2 != null) {
                            GalleryActivity galleryActivity2 = g63Var2.c;
                            if (g63Var2.e && g63Var2.f > 0) {
                                an.c = false;
                                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                                Iterator it3 = g63Var2.d.iterator();
                                it3.getClass();
                                while (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    next3.getClass();
                                    t73 t73Var2 = (t73) next3;
                                    if (t73Var2.d && new File(t73Var2.b).exists()) {
                                        arrayList3.add(t73Var2.a);
                                    }
                                }
                                String string6 = g63Var2.p().getString(galleryActivity2, SP.SELECTED_LATITUDE, "00");
                                string6.getClass();
                                double d3 = Double.parseDouble(string6);
                                String string7 = g63Var2.p().getString(galleryActivity2, SP.SELECTED_LONGITUDE, "00");
                                string7.getClass();
                                double d4 = Double.parseDouble(string7);
                                String str2 = galleryActivity2.s().e.getText().toString() + "\n\nhttp://maps.google.com/maps?q=" + d3 + "," + d4;
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND_MULTIPLE");
                                intent.putExtra("android.intent.extra.TEXT", str2);
                                intent.setType("image/*");
                                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                                galleryActivity2.startActivity(intent);
                                g63Var2.o();
                            } else {
                                Toast.makeText(galleryActivity2, "Please select images", 0).show();
                            }
                        }
                        break;
                }
            }
        });
        ((RelativeLayout) s().b.j).setOnClickListener(new View.OnClickListener(this) { // from class: cm2
            public final /* synthetic */ GalleryActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                GalleryActivity galleryActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = GalleryActivity.J;
                        galleryActivity.k().c();
                        break;
                    case 1:
                        g63 g63Var = galleryActivity.E;
                        if (g63Var != null) {
                            int i7 = g63Var.f;
                            ArrayList arrayList2 = g63Var.d;
                            if (i7 == arrayList2.size()) {
                                g63Var.o();
                            } else {
                                g63Var.e = true;
                                Iterator it2 = arrayList2.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    t73 t73Var = (t73) next2;
                                    t73Var.d = true;
                                    g63Var.f(arrayList2.indexOf(t73Var));
                                }
                                g63Var.f = arrayList2.size();
                                g63Var.h.E(new Intent("IMAGES_SELECTED"));
                            }
                        }
                        break;
                    default:
                        g63 g63Var2 = galleryActivity.E;
                        if (g63Var2 != null) {
                            GalleryActivity galleryActivity2 = g63Var2.c;
                            if (g63Var2.e && g63Var2.f > 0) {
                                an.c = false;
                                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                                Iterator it3 = g63Var2.d.iterator();
                                it3.getClass();
                                while (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    next3.getClass();
                                    t73 t73Var2 = (t73) next3;
                                    if (t73Var2.d && new File(t73Var2.b).exists()) {
                                        arrayList3.add(t73Var2.a);
                                    }
                                }
                                String string6 = g63Var2.p().getString(galleryActivity2, SP.SELECTED_LATITUDE, "00");
                                string6.getClass();
                                double d3 = Double.parseDouble(string6);
                                String string7 = g63Var2.p().getString(galleryActivity2, SP.SELECTED_LONGITUDE, "00");
                                string7.getClass();
                                double d4 = Double.parseDouble(string7);
                                String str2 = galleryActivity2.s().e.getText().toString() + "\n\nhttp://maps.google.com/maps?q=" + d3 + "," + d4;
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND_MULTIPLE");
                                intent.putExtra("android.intent.extra.TEXT", str2);
                                intent.setType("image/*");
                                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                                galleryActivity2.startActivity(intent);
                                g63Var2.o();
                            } else {
                                Toast.makeText(galleryActivity2, "Please select images", 0).show();
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!AllAdsApproval.iSGalleryBanner(this)) {
            ((RelativeLayout) findViewById(R.id.rel_adaptive_banner)).setVisibility(8);
            return;
        }
        this.H = new Admob();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        if (i != 9) {
            if (i == 1) {
                this.H.loadAdaptive_banner(this, relativeLayout, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                return;
            } else {
                if (i == 2) {
                    this.H.loadAdaptive_bannerAdax(this, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i2 = RemoteAdData.GALLERY_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            this.H.loadAdaptive_banner(this, relativeLayout, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            this.H.loadAdaptive_bannerAdax(this, relativeLayout, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final l5 s() {
        return (l5) this.C.getValue();
    }
}