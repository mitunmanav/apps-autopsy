package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.l12;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.NoteActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.helper.utils;
import com.gpsmapcamera.geotagginglocationonphoto.model.NotesModal;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c6;
import defpackage.cc7;
import defpackage.g64;
import defpackage.gc1;
import defpackage.hv0;
import defpackage.i6;
import defpackage.ie8;
import defpackage.iv0;
import defpackage.j64;
import defpackage.ju1;
import defpackage.l76;
import defpackage.lf3;
import defpackage.lm4;
import defpackage.lt1;
import defpackage.mm4;
import defpackage.mq7;
import defpackage.mv1;
import defpackage.n8;
import defpackage.pn9;
import defpackage.pp4;
import defpackage.q6;
import defpackage.tv5;
import defpackage.ub7;
import defpackage.um4;
import defpackage.v30;
import defpackage.w49;
import defpackage.wp4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NoteActivity extends bj {
    public static final /* synthetic */ int J = 0;
    public ie8 B;
    public boolean C;
    public SP D;
    public ArrayList E = new ArrayList();
    public g64 F;
    public gc1 G;
    public wp4 H;
    public i6 I;

    public static void x(l12 l12Var, NativeAdView nativeAdView) {
        tv5 tv5Var = l12Var.m;
        String str = l12Var.g;
        String str2 = l12Var.f;
        String str3 = l12Var.d;
        if (nativeAdView != null) {
            nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.primary));
            nativeAdView.setBodyView(nativeAdView.findViewById(R.id.secondary));
            nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.call_to_action));
            nativeAdView.setIconView(nativeAdView.findViewById(R.id.icon));
        }
        if (str3 != null) {
            try {
                nativeAdView.getClass();
                View headlineView = nativeAdView.getHeadlineView();
                headlineView.getClass();
                ((TextView) headlineView).setText(str3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (str2 != null) {
            try {
                nativeAdView.getClass();
                View bodyView = nativeAdView.getBodyView();
                bodyView.getClass();
                ((TextView) bodyView).setText(str2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (str != null) {
            try {
                nativeAdView.getClass();
                View callToActionView = nativeAdView.getCallToActionView();
                callToActionView.getClass();
                ((Button) callToActionView).setText(str);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            tv5Var.getClass();
            if (((Drawable) tv5Var.b) != null) {
                nativeAdView.getClass();
                View iconView = nativeAdView.getIconView();
                iconView.getClass();
                tv5Var.getClass();
                ((ImageView) iconView).setImageDrawable((Drawable) tv5Var.b);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        nativeAdView.getClass();
        nativeAdView.b(l12Var, null);
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        this.D = new SP(this);
        String string = u().getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 1;
        final int i3 = 0;
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
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_note, (ViewGroup) null, false);
        int i4 = R.id.card_view_home_ads;
        MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.card_view_home_ads, viewInflate);
        if (materialCardView != null) {
            i4 = R.id.imgAddNote;
            ImageView imageView = (ImageView) pn9.a(R.id.imgAddNote, viewInflate);
            if (imageView != null) {
                i4 = R.id.mSwitchNoteVisibleOnCapture;
                SwitchMaterial switchMaterial = (SwitchMaterial) pn9.a(R.id.mSwitchNoteVisibleOnCapture, viewInflate);
                if (switchMaterial != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                    i4 = R.id.nativeadframe;
                    FrameLayout frameLayout = (FrameLayout) pn9.a(R.id.nativeadframe, viewInflate);
                    if (frameLayout != null) {
                        i4 = R.id.noteVisibleOnCapture;
                        MaterialCardView materialCardView2 = (MaterialCardView) pn9.a(R.id.noteVisibleOnCapture, viewInflate);
                        if (materialCardView2 != null) {
                            i4 = R.id.rv_notes;
                            RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.rv_notes, viewInflate);
                            if (recyclerView != null) {
                                i4 = R.id.toolbar;
                                View viewA = pn9.a(R.id.toolbar, viewInflate);
                                if (viewA != null) {
                                    l76 l76VarA = l76.a(viewA);
                                    i4 = R.id.tvRecentText;
                                    if (((TextView) pn9.a(R.id.tvRecentText, viewInflate)) != null) {
                                        this.B = new ie8(relativeLayout, materialCardView, imageView, switchMaterial, relativeLayout, frameLayout, materialCardView2, recyclerView, l76VarA, 1);
                                        setContentView((RelativeLayout) s().b);
                                        RelativeLayout relativeLayout2 = (RelativeLayout) s().f;
                                        final int i5 = 2;
                                        pp4 pp4Var = new pp4(this, i5);
                                        WeakHashMap weakHashMap = cc7.a;
                                        ub7.c(relativeLayout2, pp4Var);
                                        ((TextView) ((l76) s().j).l).setText(getString(R.string.notes_hastag));
                                        ((RelativeLayout) ((l76) s().j).e).setVisibility(0);
                                        this.G = new gc1(this);
                                        ((RelativeLayout) ((l76) s().j).c).setOnClickListener(new View.OnClickListener(this) { // from class: rp4
                                            public final /* synthetic */ NoteActivity b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i6 = i3;
                                                final int i7 = 0;
                                                final int i8 = 1;
                                                final NoteActivity noteActivity = this.b;
                                                switch (i6) {
                                                    case 0:
                                                        int i9 = NoteActivity.J;
                                                        noteActivity.setResult(-1, new Intent());
                                                        noteActivity.finish();
                                                        break;
                                                    case 1:
                                                        int i10 = NoteActivity.J;
                                                        yg2 yg2VarC = noteActivity.o().C("Note_bottom_sheetfragment");
                                                        if (yg2VarC == null || !yg2VarC.u()) {
                                                            wp4 wp4Var = new wp4();
                                                            wp4Var.w0 = new pp4(noteActivity, 3);
                                                            noteActivity.H = wp4Var;
                                                            wp4Var.d0(noteActivity.o(), "Note_bottom_sheetfragment");
                                                        }
                                                        break;
                                                    case 2:
                                                        int i11 = NoteActivity.J;
                                                        ((SwitchMaterial) noteActivity.s().e).setChecked(!noteActivity.u().getBoolean(noteActivity, "isNoteDialogVisible", false));
                                                        break;
                                                    default:
                                                        int i12 = NoteActivity.J;
                                                        bv0 bv0VarV = bv0.v(noteActivity.getLayoutInflater());
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) bv0VarV.b;
                                                        relativeLayout3.measure(-2, -2);
                                                        final PopupWindow popupWindow = new PopupWindow((View) relativeLayout3, relativeLayout3.getMeasuredWidth() + 32, relativeLayout3.getMeasuredHeight(), true);
                                                        popupWindow.setOutsideTouchable(true);
                                                        ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i13 = i7;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i13 = i8;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        popupWindow.showAsDropDown(view);
                                                        break;
                                                }
                                            }
                                        });
                                        ((ImageView) s().d).setOnClickListener(new View.OnClickListener(this) { // from class: rp4
                                            public final /* synthetic */ NoteActivity b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i6 = i2;
                                                final int i7 = 0;
                                                final int i8 = 1;
                                                final NoteActivity noteActivity = this.b;
                                                switch (i6) {
                                                    case 0:
                                                        int i9 = NoteActivity.J;
                                                        noteActivity.setResult(-1, new Intent());
                                                        noteActivity.finish();
                                                        break;
                                                    case 1:
                                                        int i10 = NoteActivity.J;
                                                        yg2 yg2VarC = noteActivity.o().C("Note_bottom_sheetfragment");
                                                        if (yg2VarC == null || !yg2VarC.u()) {
                                                            wp4 wp4Var = new wp4();
                                                            wp4Var.w0 = new pp4(noteActivity, 3);
                                                            noteActivity.H = wp4Var;
                                                            wp4Var.d0(noteActivity.o(), "Note_bottom_sheetfragment");
                                                        }
                                                        break;
                                                    case 2:
                                                        int i11 = NoteActivity.J;
                                                        ((SwitchMaterial) noteActivity.s().e).setChecked(!noteActivity.u().getBoolean(noteActivity, "isNoteDialogVisible", false));
                                                        break;
                                                    default:
                                                        int i12 = NoteActivity.J;
                                                        bv0 bv0VarV = bv0.v(noteActivity.getLayoutInflater());
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) bv0VarV.b;
                                                        relativeLayout3.measure(-2, -2);
                                                        final PopupWindow popupWindow = new PopupWindow((View) relativeLayout3, relativeLayout3.getMeasuredWidth() + 32, relativeLayout3.getMeasuredHeight(), true);
                                                        popupWindow.setOutsideTouchable(true);
                                                        ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i13 = i7;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i13 = i8;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        popupWindow.showAsDropDown(view);
                                                        break;
                                                }
                                            }
                                        });
                                        ((MaterialCardView) s().h).setOnClickListener(new View.OnClickListener(this) { // from class: rp4
                                            public final /* synthetic */ NoteActivity b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i6 = i5;
                                                final int i7 = 0;
                                                final int i8 = 1;
                                                final NoteActivity noteActivity = this.b;
                                                switch (i6) {
                                                    case 0:
                                                        int i9 = NoteActivity.J;
                                                        noteActivity.setResult(-1, new Intent());
                                                        noteActivity.finish();
                                                        break;
                                                    case 1:
                                                        int i10 = NoteActivity.J;
                                                        yg2 yg2VarC = noteActivity.o().C("Note_bottom_sheetfragment");
                                                        if (yg2VarC == null || !yg2VarC.u()) {
                                                            wp4 wp4Var = new wp4();
                                                            wp4Var.w0 = new pp4(noteActivity, 3);
                                                            noteActivity.H = wp4Var;
                                                            wp4Var.d0(noteActivity.o(), "Note_bottom_sheetfragment");
                                                        }
                                                        break;
                                                    case 2:
                                                        int i11 = NoteActivity.J;
                                                        ((SwitchMaterial) noteActivity.s().e).setChecked(!noteActivity.u().getBoolean(noteActivity, "isNoteDialogVisible", false));
                                                        break;
                                                    default:
                                                        int i12 = NoteActivity.J;
                                                        bv0 bv0VarV = bv0.v(noteActivity.getLayoutInflater());
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) bv0VarV.b;
                                                        relativeLayout3.measure(-2, -2);
                                                        final PopupWindow popupWindow = new PopupWindow((View) relativeLayout3, relativeLayout3.getMeasuredWidth() + 32, relativeLayout3.getMeasuredHeight(), true);
                                                        popupWindow.setOutsideTouchable(true);
                                                        ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i13 = i7;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i13 = i8;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        popupWindow.showAsDropDown(view);
                                                        break;
                                                }
                                            }
                                        });
                                        ((SwitchMaterial) s().e).setOnCheckedChangeListener(new ju1(this, i5));
                                        final int i6 = 3;
                                        ((RelativeLayout) ((l76) s().j).e).setOnClickListener(new View.OnClickListener(this) { // from class: rp4
                                            public final /* synthetic */ NoteActivity b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i7 = i6;
                                                final int i8 = 0;
                                                final int i9 = 1;
                                                final NoteActivity noteActivity = this.b;
                                                switch (i7) {
                                                    case 0:
                                                        int i10 = NoteActivity.J;
                                                        noteActivity.setResult(-1, new Intent());
                                                        noteActivity.finish();
                                                        break;
                                                    case 1:
                                                        int i11 = NoteActivity.J;
                                                        yg2 yg2VarC = noteActivity.o().C("Note_bottom_sheetfragment");
                                                        if (yg2VarC == null || !yg2VarC.u()) {
                                                            wp4 wp4Var = new wp4();
                                                            wp4Var.w0 = new pp4(noteActivity, 3);
                                                            noteActivity.H = wp4Var;
                                                            wp4Var.d0(noteActivity.o(), "Note_bottom_sheetfragment");
                                                        }
                                                        break;
                                                    case 2:
                                                        int i12 = NoteActivity.J;
                                                        ((SwitchMaterial) noteActivity.s().e).setChecked(!noteActivity.u().getBoolean(noteActivity, "isNoteDialogVisible", false));
                                                        break;
                                                    default:
                                                        int i13 = NoteActivity.J;
                                                        bv0 bv0VarV = bv0.v(noteActivity.getLayoutInflater());
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) bv0VarV.b;
                                                        relativeLayout3.measure(-2, -2);
                                                        final PopupWindow popupWindow = new PopupWindow((View) relativeLayout3, relativeLayout3.getMeasuredWidth() + 32, relativeLayout3.getMeasuredHeight(), true);
                                                        popupWindow.setOutsideTouchable(true);
                                                        ((LinearLayout) bv0VarV.c).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i8;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case 0:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i16 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        ((LinearLayout) bv0VarV.d).setOnClickListener(new View.OnClickListener() { // from class: qp4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i9;
                                                                NoteActivity noteActivity2 = noteActivity;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case 0:
                                                                        int i15 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        CPD.ShowDialog(noteActivity2);
                                                                        new utils().exportNotesToCSV(noteActivity2, noteActivity2.t());
                                                                        return;
                                                                    default:
                                                                        int i16 = NoteActivity.J;
                                                                        popupWindow2.dismiss();
                                                                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                        intent.setType("application/csv");
                                                                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/csv", "application/csv", "text/comma-separated-values", "application/vnd.ms-excel", "application/octet-stream"});
                                                                        i6 i6Var = noteActivity2.I;
                                                                        if (i6Var != null) {
                                                                            i6Var.a(intent, null);
                                                                            return;
                                                                        } else {
                                                                            bi3.g("filePickerLauncher");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        popupWindow.showAsDropDown(view);
                                                        break;
                                                }
                                            }
                                        });
                                        k().a(this, new n8(this, 17));
                                        this.I = (i6) n(new pp4(this, i2), new c6(i6));
                                        return;
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
        this.H = new wp4();
        this.E = t().B();
        ((RecyclerView) s().i).setLayoutManager(new LinearLayoutManager(this, 1, true));
        this.F = new g64(this, this.E, new j64(3, this));
        ((RecyclerView) s().i).setAdapter(this.F);
        y();
        wp4 wp4Var = this.H;
        wp4Var.getClass();
        wp4Var.w0 = new pp4(this, 0);
        if (AllAdsApproval.isNoteScreenNative(this)) {
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                int i2 = RemoteAdData.NOTE_SCREEN_NATIVE_TYPE;
                if (i2 == 1) {
                    v();
                } else if (i2 == 2) {
                    w();
                }
            } else if (i == 1) {
                v();
            } else if (i == 2) {
                w();
            }
        }
        ((SwitchMaterial) s().e).setChecked(u().getBoolean(this, "isNoteDialogVisible", false));
    }

    public final ie8 s() {
        ie8 ie8Var = this.B;
        if (ie8Var != null) {
            return ie8Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final gc1 t() {
        gc1 gc1Var = this.G;
        if (gc1Var != null) {
            return gc1Var;
        }
        bi3.g("dateTimeDB");
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
        List listF = iv0.f(lm4.a);
        String str = RemoteAdData.DETAIL_NATIVE_ID;
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listF);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new lf3(8, this));
    }

    public final void w() {
        List listF = iv0.f(lm4.a);
        String str = RemoteAdData.ADAX_NATIVE_ID;
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = hv0.U(listF);
        mv1 mv1Var = mv1.a;
        w49.s(new um4(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, listU, mv1Var, false, mm4.a, q6.TOP_RIGHT, null, null, false, false, null, mv1Var, false, false), new v30(this, 3));
    }

    public final void y() {
        this.E.clear();
        this.E = t().B();
        String string = u().getString(this, "notes", Default.notes);
        int size = this.E.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            Object obj = this.E.get(i);
            obj.getClass();
            NotesModal notesModal = (NotesModal) obj;
            if (bi3.b(string, notesModal.getTiitle() + " " + notesModal.getNotes())) {
                notesModal.setSelected(1);
                z = false;
            } else {
                notesModal.setSelected(0);
            }
        }
        if (z && !this.E.isEmpty()) {
            ((NotesModal) this.E.get(0)).setSelected(1);
        }
        g64 g64Var = this.F;
        g64Var.getClass();
        g64Var.g = this.E;
        g64Var.e();
    }
}