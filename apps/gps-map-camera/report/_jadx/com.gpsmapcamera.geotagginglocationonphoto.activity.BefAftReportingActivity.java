package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.content.ContentValues;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.a;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.BefAftReportingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.GeneratePDF;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SafeNestedScrollView;
import com.gpsmapcamera.geotagginglocationonphoto.model.ComparisonGroup;
import com.itextpdf.text.pdf.PdfContentParser;
import com.itextpdf.text.pdf.parser.HriA.jumTrYZsYnyZCd;
import defpackage.a30;
import defpackage.a7;
import defpackage.af1;
import defpackage.ap5;
import defpackage.b30;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c30;
import defpackage.c6;
import defpackage.c66;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.cx0;
import defpackage.d30;
import defpackage.dt3;
import defpackage.e30;
import defpackage.e8;
import defpackage.ej6;
import defpackage.eo7;
import defpackage.f30;
import defpackage.f5;
import defpackage.fw5;
import defpackage.h20;
import defpackage.h30;
import defpackage.hl9;
import defpackage.hv0;
import defpackage.hx0;
import defpackage.i6;
import defpackage.ik7;
import defpackage.ip9;
import defpackage.iv0;
import defpackage.j30;
import defpackage.j64;
import defpackage.jk7;
import defpackage.k30;
import defpackage.kea;
import defpackage.kg1;
import defpackage.kk7;
import defpackage.l30;
import defpackage.l76;
import defpackage.lk7;
import defpackage.ls5;
import defpackage.lt1;
import defpackage.m30;
import defpackage.m8;
import defpackage.mk9;
import defpackage.mq7;
import defpackage.n8;
import defpackage.o30;
import defpackage.pj2;
import defpackage.pk4;
import defpackage.pn9;
import defpackage.pp2;
import defpackage.pr5;
import defpackage.q30;
import defpackage.tv5;
import defpackage.u65;
import defpackage.ub7;
import defpackage.v60;
import defpackage.wl1;
import defpackage.x4;
import defpackage.yw0;
import defpackage.z2;
import defpackage.z20;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class BefAftReportingActivity extends bj {
    public static final /* synthetic */ int R = 0;
    public f5 B;
    public boolean C;
    public SP D;
    public yw0 E;
    public hx0 F;
    public cx0 G;
    public u65 I;
    public i6 J;
    public i6 K;
    public mo1 L;
    public boolean N;
    public e30 O;
    public ArrayList Q;
    public final ArrayList H = new ArrayList();
    public final Handler M = new Handler(Looper.getMainLooper());
    public final i6 P = (i6) n(new d30(this, 3), new c6(0));

    public static void v(View view) {
        if (view instanceof EditText) {
            view.clearFocus();
            ((EditText) view).setCursorVisible(false);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                v(childAt);
            }
        }
    }

    public final void A() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new tv5(6, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void B() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new pp2(8, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void C() {
        ArrayList arrayList = this.H;
        arrayList.clear();
        cx0 cx0Var = this.G;
        if (cx0Var == null) {
            bi3.g("dbHelper");
            throw null;
        }
        ArrayList arrayListA = cx0Var.a();
        if (arrayListA.isEmpty()) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            ComparisonGroup comparisonGroup = new ComparisonGroup(string, null, eo7.i(getString(R.string.comparison), " 1"), null, "", null, "", 0, false, 0L, 810, null);
            cx0 cx0Var2 = this.G;
            if (cx0Var2 == null) {
                bi3.g("dbHelper");
                throw null;
            }
            cx0Var2.f(comparisonGroup);
            arrayList.add(comparisonGroup);
        } else {
            arrayList.addAll(arrayListA);
        }
        yw0 yw0Var = this.E;
        if (yw0Var == null) {
            bi3.g("adapter");
            throw null;
        }
        yw0Var.c.b(hv0.U(arrayList), new z2(18, yw0Var));
        w().b.setVisibility(8);
    }

    public final void D() {
        ArrayList arrayList = this.Q;
        if (arrayList == null) {
            CPD.ShowDialog(this);
            dt3 dt3VarA = kea.a(this);
            kg1 kg1Var = wl1.a;
            mk9.g(dt3VarA, af1.c, null, new x4(this, null, 1), 2);
            return;
        }
        if (arrayList.isEmpty()) {
            HelperClass.showSnackBar(w().a, getString(R.string.no_photos_found));
            return;
        }
        ArrayList arrayList2 = this.Q;
        arrayList2.getClass();
        new l30(arrayList2, new z20(this, 6)).d0(o(), "ImagePicker");
    }

    public final void E() {
        String string = new SP(this).getString(this, SP.SAF_URI, "");
        if (Build.VERSION.SDK_INT < 30 || !(string == null || string.length() == 0)) {
            D();
            return;
        }
        View viewFindViewById = findViewById(android.R.id.content);
        int[] iArr = cc6.E;
        cc6 cc6VarI = cc6.i(viewFindViewById, viewFindViewById.getResources().getText(R.string.photo_access), 0);
        h20 h20Var = cc6VarI.i;
        cc6VarI.j(getString(R.string.allow), new a30(this, 6));
        if (this.C) {
            h20Var.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.black_dark)));
            ((SnackbarContentLayout) h20Var.getChildAt(0)).getMessageView().setTextColor(getColor(R.color.white_dark));
        } else {
            h20Var.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.black_light)));
            ((SnackbarContentLayout) h20Var.getChildAt(0)).getMessageView().setTextColor(getColor(R.color.white_light));
        }
        ((SnackbarContentLayout) h20Var.getChildAt(0)).getActionView().setTextColor(getColor(R.color.app_main_dark));
        cc6VarI.k();
    }

    public final void F() {
        String string = ej6.Y(w().h.getText().toString()).toString();
        String string2 = ej6.Y(w().i.getText().toString()).toString();
        String string3 = ej6.Y(w().j.getText().toString()).toString();
        String string4 = ej6.Y(w().k.getText().toString()).toString();
        x().setString(this, SP.BEF_AFT_PDF_COMPANY_NAME, string);
        x().setString(this, SP.BEF_AFT_PDF_PERSON_NAME, string2);
        x().setString(this, SP.BEF_AFT_PDF_REPORT_NAME, string3);
        x().setString(this, SP.BEF_AFT_PDF_SUMMARY, string4);
        int i = 0;
        int integer = x().getInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i2) {
            integer = i2;
        }
        if (!AllAdsApproval.iSBefAftReportingFS(this)) {
            finish();
            return;
        }
        if (integer < RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            x().setInteger(this, HelperClass.COUNTADS, integer + 1);
            finish();
            return;
        }
        CPD.ShowDialog(this, getString(R.string.cluster_loading));
        x().setInteger(this, HelperClass.COUNTADS, 0);
        int i3 = RemoteAdData.ADS_NETWORK_TYPE;
        if (i3 == 9) {
            int i4 = RemoteAdData.BEF_AFT_REPORTING_SCREEN_FS_TYPE;
            if (i4 == 1) {
                A();
            } else if (i4 == 2) {
                B();
            }
        } else if (i3 == 1) {
            A();
        } else if (i3 == 2) {
            B();
        }
        Handler handler = this.M;
        handler.getClass();
        handler.postDelayed(new j30(this, i), 7000L);
    }

    public final void G(Uri uri) {
        int i = 0;
        if (HelperClass.isActivityValid(this)) {
            ((pr5) a.b(this).d(this).n(uri).j(PdfContentParser.COMMAND_TYPE, PdfContentParser.COMMAND_TYPE)).a((ls5) new ls5().u(new pk4(new fw5(6)), true)).E(w().l);
        }
        w().l.setVisibility(0);
        CPD.ShowDialog(this);
        Executors.newSingleThreadExecutor().execute(new q30(i, new Handler(Looper.getMainLooper()), this, uri));
    }

    public final void H() {
        w().x.setText(HelperClass.setDateTimeFormatPDF(this, "EEEE, dd/MM/yyyy\nhh:mm a"));
        String string = x().getString(this, SP.BEF_AFT_PDF_COMPANY_NAME, "");
        String string2 = x().getString(this, SP.BEF_AFT_PDF_PERSON_NAME, "");
        String string3 = x().getString(this, SP.BEF_AFT_PDF_REPORT_NAME, getString(R.string.bef_aft_report_title));
        String string4 = x().getString(this, SP.BEF_AFT_PDF_SUMMARY, "");
        w().h.setText(string);
        w().i.setHint((string2 == null || string2.length() == 0) ? getString(R.string.john_parker) : null);
        w().i.setText(string2);
        w().j.setText(string3);
        w().k.setText(string4);
    }

    public final void I() {
        String string = x().getString(this, SP.BEF_AFT_PDF_LOGO, Default.LOGO_uri);
        if (bi3.b(string, Default.LOGO_uri)) {
            w().l.setVisibility(0);
            w().l.setImageResource(R.drawable.splash_icon);
        } else {
            w().l.setVisibility(0);
            Executors.newSingleThreadExecutor().execute(new m8(17, string, this));
        }
    }

    public final void J() {
        boolean z = x().getBoolean(this, SP.IS_BEF_AFT_LOGO, false);
        boolean z2 = x().getBoolean(this, SP.IS_BEF_AFT_COMPANY_NAME, false);
        boolean z3 = x().getBoolean(this, SP.IS_BEF_AFT_TITLE, true);
        boolean z4 = x().getBoolean(this, SP.IS_BEF_AFT_PREPARED_BY, false);
        w().g.setVisibility(z ? 0 : 8);
        w().h.setVisibility(z2 ? 0 : 8);
        w().n.setVisibility((z || z2) ? 0 : 8);
        w().u.setVisibility(z3 ? 0 : 8);
        w().o.setVisibility(z4 ? 0 : 8);
        H();
        I();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                EditText editText = (EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    editText.clearFocus();
                    editText.setCursorVisible(false);
                    Object systemService = getSystemService("input_method");
                    InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [e30] */
    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        new HelperClass().SetLanguage(this);
        this.D = new SP(this);
        String string = x().getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 1;
        int i3 = 0;
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
        lt1.a(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_bef_aft_reporting, (ViewGroup) null, false);
        int i4 = R.id.btnLayout;
        LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.btnLayout, viewInflate);
        if (linearLayout != null) {
            i4 = R.id.btnSavePDF;
            LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.btnSavePDF, viewInflate);
            if (linearLayout2 != null) {
                i4 = R.id.btnSavePhoto;
                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.btnSavePhoto, viewInflate);
                if (linearLayout3 != null) {
                    i4 = R.id.btnSharePDF;
                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.btnSharePDF, viewInflate);
                    if (linearLayout4 != null) {
                        i4 = R.id.btnShareWp;
                        LinearLayout linearLayout5 = (LinearLayout) pn9.a(R.id.btnShareWp, viewInflate);
                        if (linearLayout5 != null) {
                            i4 = R.id.cardImgLogo;
                            MaterialCardView materialCardView = (MaterialCardView) pn9.a(R.id.cardImgLogo, viewInflate);
                            if (materialCardView != null) {
                                i4 = R.id.etCompanyName;
                                EditText editText = (EditText) pn9.a(R.id.etCompanyName, viewInflate);
                                if (editText != null) {
                                    i4 = R.id.etPersonName;
                                    EditText editText2 = (EditText) pn9.a(R.id.etPersonName, viewInflate);
                                    if (editText2 != null) {
                                        i4 = R.id.etReportName;
                                        EditText editText3 = (EditText) pn9.a(R.id.etReportName, viewInflate);
                                        if (editText3 != null) {
                                            i4 = R.id.etReportSummary;
                                            EditText editText4 = (EditText) pn9.a(R.id.etReportSummary, viewInflate);
                                            if (editText4 != null) {
                                                i4 = R.id.img_gallery;
                                                if (((ImageView) pn9.a(R.id.img_gallery, viewInflate)) != null) {
                                                    i4 = R.id.imgLogo;
                                                    ImageView imageView = (ImageView) pn9.a(R.id.imgLogo, viewInflate);
                                                    if (imageView != null) {
                                                        i4 = R.id.layoutPdfPreview;
                                                        if (((RelativeLayout) pn9.a(R.id.layoutPdfPreview, viewInflate)) != null) {
                                                            i4 = R.id.layoutPdfPreview2;
                                                            LinearLayout linearLayout6 = (LinearLayout) pn9.a(R.id.layoutPdfPreview2, viewInflate);
                                                            if (linearLayout6 != null) {
                                                                i4 = R.id.llCompanyLay;
                                                                LinearLayout linearLayout7 = (LinearLayout) pn9.a(R.id.llCompanyLay, viewInflate);
                                                                if (linearLayout7 != null) {
                                                                    i4 = R.id.llPersonLay;
                                                                    LinearLayout linearLayout8 = (LinearLayout) pn9.a(R.id.llPersonLay, viewInflate);
                                                                    if (linearLayout8 != null) {
                                                                        i4 = R.id.llRightHeader;
                                                                        if (((LinearLayout) pn9.a(R.id.llRightHeader, viewInflate)) != null) {
                                                                            i4 = R.id.llTopHeader;
                                                                            if (((RelativeLayout) pn9.a(R.id.llTopHeader, viewInflate)) != null) {
                                                                                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                                                i4 = R.id.rel_adaptive_banner;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                                if (relativeLayout2 != null) {
                                                                                    i4 = R.id.rlAddGroup;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) pn9.a(R.id.rlAddGroup, viewInflate);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i4 = R.id.rlBtmAds;
                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate);
                                                                                        if (relativeLayout4 != null) {
                                                                                            i4 = R.id.rlMainFooterView;
                                                                                            if (((RelativeLayout) pn9.a(R.id.rlMainFooterView, viewInflate)) != null) {
                                                                                                i4 = R.id.rlMainImageLayout;
                                                                                                LinearLayout linearLayout9 = (LinearLayout) pn9.a(R.id.rlMainImageLayout, viewInflate);
                                                                                                if (linearLayout9 != null) {
                                                                                                    i4 = R.id.rlPDFHeader;
                                                                                                    if (((RelativeLayout) pn9.a(R.id.rlPDFHeader, viewInflate)) != null) {
                                                                                                        i4 = R.id.rlReportSummary;
                                                                                                        if (((RelativeLayout) pn9.a(R.id.rlReportSummary, viewInflate)) != null) {
                                                                                                            i4 = R.id.rlReportTitle;
                                                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) pn9.a(R.id.rlReportTitle, viewInflate);
                                                                                                            if (relativeLayout5 != null) {
                                                                                                                i4 = R.id.rlSingleImageLayout;
                                                                                                                if (((RelativeLayout) pn9.a(R.id.rlSingleImageLayout, viewInflate)) != null) {
                                                                                                                    i4 = R.id.rvImageData;
                                                                                                                    RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.rvImageData, viewInflate);
                                                                                                                    if (recyclerView != null) {
                                                                                                                        i4 = R.id.scrollView;
                                                                                                                        if (((SafeNestedScrollView) pn9.a(R.id.scrollView, viewInflate)) != null) {
                                                                                                                            i4 = R.id.singleLayItem;
                                                                                                                            View viewA = pn9.a(R.id.singleLayItem, viewInflate);
                                                                                                                            if (viewA != null) {
                                                                                                                                int i5 = R.id.btnDelete;
                                                                                                                                if (((ImageView) pn9.a(R.id.btnDelete, viewA)) != null) {
                                                                                                                                    i5 = R.id.btnReplaceAfter;
                                                                                                                                    if (((ImageView) pn9.a(R.id.btnReplaceAfter, viewA)) != null) {
                                                                                                                                        i5 = R.id.btnReplaceBefore;
                                                                                                                                        if (((ImageView) pn9.a(R.id.btnReplaceBefore, viewA)) != null) {
                                                                                                                                            i5 = R.id.divider;
                                                                                                                                            if (pn9.a(R.id.divider, viewA) != null) {
                                                                                                                                                i5 = R.id.etAfterComment;
                                                                                                                                                if (((EditText) pn9.a(R.id.etAfterComment, viewA)) != null) {
                                                                                                                                                    i5 = R.id.etBeforeComment;
                                                                                                                                                    if (((EditText) pn9.a(R.id.etBeforeComment, viewA)) != null) {
                                                                                                                                                        i5 = R.id.etGroupName;
                                                                                                                                                        if (((EditText) pn9.a(R.id.etGroupName, viewA)) != null) {
                                                                                                                                                            i5 = R.id.grDivider;
                                                                                                                                                            if (pn9.a(R.id.grDivider, viewA) != null) {
                                                                                                                                                                i5 = R.id.ivAfter;
                                                                                                                                                                if (((ImageView) pn9.a(R.id.ivAfter, viewA)) != null) {
                                                                                                                                                                    i5 = R.id.ivBefore;
                                                                                                                                                                    if (((ImageView) pn9.a(R.id.ivBefore, viewA)) != null) {
                                                                                                                                                                        i5 = R.id.rlAddAfterImage;
                                                                                                                                                                        if (((RelativeLayout) pn9.a(R.id.rlAddAfterImage, viewA)) != null) {
                                                                                                                                                                            i5 = R.id.rlAddBeforeImage;
                                                                                                                                                                            if (((RelativeLayout) pn9.a(R.id.rlAddBeforeImage, viewA)) != null) {
                                                                                                                                                                                i5 = R.id.rlMainImgAfter;
                                                                                                                                                                                if (((RelativeLayout) pn9.a(R.id.rlMainImgAfter, viewA)) != null) {
                                                                                                                                                                                    i5 = R.id.rlMainImgBefore;
                                                                                                                                                                                    if (((RelativeLayout) pn9.a(R.id.rlMainImgBefore, viewA)) != null) {
                                                                                                                                                                                        i4 = R.id.toolbar;
                                                                                                                                                                                        View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                                                                                                                                                        if (viewA2 != null) {
                                                                                                                                                                                            l76 l76VarA = l76.a(viewA2);
                                                                                                                                                                                            i4 = R.id.tvDate;
                                                                                                                                                                                            TextView textView = (TextView) pn9.a(R.id.tvDate, viewInflate);
                                                                                                                                                                                            if (textView != null) {
                                                                                                                                                                                                i4 = R.id.tvPersonDetail;
                                                                                                                                                                                                TextView textView2 = (TextView) pn9.a(R.id.tvPersonDetail, viewInflate);
                                                                                                                                                                                                if (textView2 != null) {
                                                                                                                                                                                                    i4 = R.id.vEmptyLine;
                                                                                                                                                                                                    View viewA3 = pn9.a(R.id.vEmptyLine, viewInflate);
                                                                                                                                                                                                    if (viewA3 != null) {
                                                                                                                                                                                                        this.B = new f5(relativeLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, materialCardView, editText, editText2, editText3, editText4, imageView, linearLayout6, linearLayout7, linearLayout8, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout9, relativeLayout5, recyclerView, l76VarA, textView, textView2, viewA3);
                                                                                                                                                                                                        setContentView(w().a);
                                                                                                                                                                                                        RelativeLayout relativeLayout6 = w().p;
                                                                                                                                                                                                        int i6 = 2;
                                                                                                                                                                                                        d30 d30Var = new d30(this, i6);
                                                                                                                                                                                                        WeakHashMap weakHashMap = cc7.a;
                                                                                                                                                                                                        ub7.c(relativeLayout6, d30Var);
                                                                                                                                                                                                        this.O = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: e30
                                                                                                                                                                                                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                                                                                                                                                                                            public final void onGlobalLayout() {
                                                                                                                                                                                                                int i7 = BefAftReportingActivity.R;
                                                                                                                                                                                                                Rect rect = new Rect();
                                                                                                                                                                                                                BefAftReportingActivity befAftReportingActivity = this.a;
                                                                                                                                                                                                                befAftReportingActivity.w().a.getWindowVisibleDisplayFrame(rect);
                                                                                                                                                                                                                int height = befAftReportingActivity.w().a.getRootView().getHeight();
                                                                                                                                                                                                                boolean z = ((double) (height - rect.bottom)) > ((double) height) * 0.15d;
                                                                                                                                                                                                                if (z != befAftReportingActivity.N) {
                                                                                                                                                                                                                    befAftReportingActivity.N = z;
                                                                                                                                                                                                                    if (z) {
                                                                                                                                                                                                                        befAftReportingActivity.w().b.setVisibility(8);
                                                                                                                                                                                                                        befAftReportingActivity.w().s.setVisibility(8);
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    befAftReportingActivity.w().s.setVisibility(0);
                                                                                                                                                                                                                    if (befAftReportingActivity.z()) {
                                                                                                                                                                                                                        befAftReportingActivity.w().b.setVisibility(0);
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        befAftReportingActivity.w().b.setVisibility(8);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        };
                                                                                                                                                                                                        w().a.getViewTreeObserver().addOnGlobalLayoutListener(this.O);
                                                                                                                                                                                                        this.G = new cx0(this, "ComparisonReports.db", null, 1);
                                                                                                                                                                                                        k().a(this, new n8(this, i2));
                                                                                                                                                                                                        ((RelativeLayout) w().w.c).setOnClickListener(new a30(this, i3));
                                                                                                                                                                                                        w().d.setOnClickListener(new a30(this, i2));
                                                                                                                                                                                                        w().c.setOnClickListener(new a30(this, i6));
                                                                                                                                                                                                        int i7 = 3;
                                                                                                                                                                                                        w().e.setOnClickListener(new a30(this, i7));
                                                                                                                                                                                                        int i8 = 4;
                                                                                                                                                                                                        w().f.setOnClickListener(new a30(this, i8));
                                                                                                                                                                                                        int i9 = 5;
                                                                                                                                                                                                        w().r.setOnClickListener(new a30(this, i9));
                                                                                                                                                                                                        ((TextView) w().w.l).setText(getString(R.string.before_after));
                                                                                                                                                                                                        ((RelativeLayout) w().w.f).setVisibility(0);
                                                                                                                                                                                                        ((RelativeLayout) w().w.f).setOnClickListener(new a30(this, 7));
                                                                                                                                                                                                        I();
                                                                                                                                                                                                        w().l.setOnClickListener(new o30(i3, this));
                                                                                                                                                                                                        this.J = (i6) n(new d30(this, i3), new c6(i7));
                                                                                                                                                                                                        this.K = (i6) n(new d30(this, i2), new c6(i7));
                                                                                                                                                                                                        cx0 cx0Var = this.G;
                                                                                                                                                                                                        if (cx0Var == null) {
                                                                                                                                                                                                            bi3.g("dbHelper");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        ArrayList arrayListA = cx0Var.a();
                                                                                                                                                                                                        if (!arrayListA.isEmpty()) {
                                                                                                                                                                                                            int size = arrayListA.size();
                                                                                                                                                                                                            int i10 = 0;
                                                                                                                                                                                                            while (i10 < size) {
                                                                                                                                                                                                                Object obj = arrayListA.get(i10);
                                                                                                                                                                                                                i10++;
                                                                                                                                                                                                                ComparisonGroup comparisonGroup = (ComparisonGroup) obj;
                                                                                                                                                                                                                if (comparisonGroup.getAfterImagePath() != null || comparisonGroup.getBeforeImagePath() != null) {
                                                                                                                                                                                                                    v60 v60Var = new v60(this);
                                                                                                                                                                                                                    View viewInflate2 = getLayoutInflater().inflate(R.layout.dialog_bef_aft_confirm, (ViewGroup) null, false);
                                                                                                                                                                                                                    int i11 = R.id.btnCancel;
                                                                                                                                                                                                                    LinearLayout linearLayout10 = (LinearLayout) pn9.a(R.id.btnCancel, viewInflate2);
                                                                                                                                                                                                                    if (linearLayout10 != null) {
                                                                                                                                                                                                                        i11 = R.id.cardViewContinue;
                                                                                                                                                                                                                        LinearLayout linearLayout11 = (LinearLayout) pn9.a(R.id.cardViewContinue, viewInflate2);
                                                                                                                                                                                                                        if (linearLayout11 != null) {
                                                                                                                                                                                                                            i11 = R.id.cardViewStartNew;
                                                                                                                                                                                                                            LinearLayout linearLayout12 = (LinearLayout) pn9.a(R.id.cardViewStartNew, viewInflate2);
                                                                                                                                                                                                                            if (linearLayout12 != null) {
                                                                                                                                                                                                                                i11 = R.id.txt_title;
                                                                                                                                                                                                                                if (((TextView) pn9.a(R.id.txt_title, viewInflate2)) != null) {
                                                                                                                                                                                                                                    v60Var.setContentView((CoordinatorLayout) viewInflate2);
                                                                                                                                                                                                                                    v60Var.create();
                                                                                                                                                                                                                                    v60Var.show();
                                                                                                                                                                                                                                    linearLayout11.setOnClickListener(new e8(v60Var, i6));
                                                                                                                                                                                                                                    linearLayout12.setOnClickListener(new b30(i3, v60Var, this));
                                                                                                                                                                                                                                    linearLayout10.setOnClickListener(new e8(v60Var, i7));
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    mq7.o("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i11)));
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        H();
                                                                                                                                                                                                        for (Object obj2 : iv0.g(w().h, w().i, w().j, w().k)) {
                                                                                                                                                                                                            obj2.getClass();
                                                                                                                                                                                                            EditText editText5 = (EditText) obj2;
                                                                                                                                                                                                            editText5.setCursorVisible(false);
                                                                                                                                                                                                            editText5.setOnFocusChangeListener(new k30(i3, editText5));
                                                                                                                                                                                                        }
                                                                                                                                                                                                        Typeface typeface = w().k.getTypeface();
                                                                                                                                                                                                        w().k.setInputType(671745);
                                                                                                                                                                                                        w().k.setTypeface(typeface);
                                                                                                                                                                                                        w().h.addTextChangedListener(new m30(i3, new z20(this, i6)));
                                                                                                                                                                                                        w().i.addTextChangedListener(new m30(i3, new z20(this, i7)));
                                                                                                                                                                                                        w().j.addTextChangedListener(new m30(i3, new z20(this, i8)));
                                                                                                                                                                                                        w().k.addTextChangedListener(new m30(i3, new z20(this, i9)));
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
                                                                                                                                mq7.o("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i5)));
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
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // defpackage.bj, defpackage.bh2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e30 e30Var = this.O;
        if (e30Var != null) {
            w().a.getViewTreeObserver().removeOnGlobalLayoutListener(e30Var);
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i = 0;
        this.E = new yw0(new z20(this, i), new z20(this, 1), new f30(this, i));
        this.F = new hx0(new z20(this, 9), new z20(this, 10), new f30(this, 2), null);
        w().v.setLayoutManager(new LinearLayoutManager(this));
        w().v.setNestedScrollingEnabled(false);
        RecyclerView recyclerView = w().v;
        yw0 yw0Var = this.E;
        if (yw0Var == null) {
            bi3.g("adapter");
            throw null;
        }
        recyclerView.setAdapter(yw0Var);
        C();
        J();
        CPD.DismissDialog();
        if (z()) {
            w().b.setVisibility(0);
        } else {
            w().b.setVisibility(8);
        }
        if (!AllAdsApproval.isBefAftReportingScreenBanner(this)) {
            w().q.setVisibility(8);
            return;
        }
        Admob admob = new Admob();
        int i2 = RemoteAdData.ADS_NETWORK_TYPE;
        if (i2 != 9) {
            if (i2 == 1) {
                admob.loadAdaptive_banner(this, w().q, RemoteAdData.SETTING_SCREEN_BANNER_ID);
                return;
            } else {
                if (i2 == 2) {
                    admob.loadAdaptive_bannerAdax(this, w().q, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i3 = RemoteAdData.BEF_AFT_REPORTING_SCREEN_BANNER_TYPE;
        if (i3 == 1) {
            admob.loadAdaptive_banner(this, w().q, RemoteAdData.SETTING_SCREEN_BANNER_ID);
        } else if (i3 == 2) {
            admob.loadAdaptive_bannerAdax(this, w().q, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final void s() {
        ip9 jk7Var;
        w().h.clearFocus();
        w().i.clearFocus();
        w().j.clearFocus();
        w().k.clearFocus();
        w().h.setCursorVisible(false);
        w().i.setCursorVisible(false);
        w().j.setCursorVisible(false);
        w().k.setCursorVisible(false);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        RelativeLayout relativeLayout = w().a;
        relativeLayout.getClass();
        v(relativeLayout);
        Object systemService = getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(w().a.getWindowToken(), 0);
        }
        Window window = getWindow();
        j64 j64Var = new j64(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            jk7Var = new lk7(window, j64Var);
        } else if (i >= 30) {
            jk7Var = new kk7(window, j64Var);
        } else {
            jk7Var = i >= 26 ? new jk7(window, j64Var) : new ik7(window, j64Var);
        }
        jk7Var.a(8);
    }

    public final void t(ComparisonGroup comparisonGroup) {
        String string;
        v60 v60Var = new v60(this, R.style.AppBottomSheetDialogTheme);
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_delete_comparison_confirm, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_delete_msg);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.cardCancel);
        viewFindViewById2.getClass();
        MaterialCardView materialCardView = (MaterialCardView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.btnCancel);
        viewFindViewById3.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.btnDelete);
        viewFindViewById4.getClass();
        AppCompatButton appCompatButton2 = (AppCompatButton) viewFindViewById4;
        if (ej6.B(comparisonGroup.getGroupName())) {
            string = getString(R.string.comparison);
            string.getClass();
        } else {
            string = comparisonGroup.getGroupName();
        }
        String string2 = getString(R.string.delete_comparison_confirm_msg, string);
        string2.getClass();
        int i = 0;
        textView.setText(Html.fromHtml(string2, 0));
        if (this.C) {
            materialCardView.setCardBackgroundColor(getColor(R.color.custom_date_bg_dark));
            appCompatButton.setTextColor(getColor(R.color.app_text_main_dark));
        } else {
            materialCardView.setCardBackgroundColor(getColor(R.color.custom_date_bg_light));
            appCompatButton.setTextColor(getColor(R.color.app_text_main_light));
        }
        appCompatButton.setOnClickListener(new e8(v60Var, 4));
        appCompatButton2.setOnClickListener(new c30(i, v60Var, this, comparisonGroup));
        v60Var.show();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u(final int i) {
        Bitmap bitmapDecodeBase64;
        final File file;
        File file2;
        Exception exc;
        String string;
        if (x().getBoolean(this, SP.IS_BEF_AFT_LOGO, false)) {
            String string2 = x().getString(this, SP.BEF_AFT_PDF_LOGO, Default.LOGO_uri);
            bitmapDecodeBase64 = !bi3.b(string2, Default.LOGO_uri) ? HelperClass.decodeBase64(string2) : BitmapFactory.decodeResource(getResources(), R.drawable.splash_icon);
        } else {
            bitmapDecodeBase64 = null;
        }
        String strX = eo7.x("GPS Map Camera_Report_", new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()), ".pdf");
        final ap5 ap5Var = new ap5();
        if (i == 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", strX);
            contentValues.put("mime_type", "application/pdf");
            contentValues.put("relative_path", Environment.DIRECTORY_DOCUMENTS + "/GPS Map Camera/Reports");
            file = new File(eo7.j(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).toString(), "/GPS Map Camera/Reports/", strX));
            Uri uriInsert = getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
            ap5Var.a = uriInsert;
            if (uriInsert != null) {
                try {
                    OutputStream outputStreamOpenOutputStream = getContentResolver().openOutputStream((Uri) ap5Var.a);
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            file = new File(getCacheDir(), strX);
            ap5Var.a = FileProvider.c(this, file, "com.gpsmapcamera.geotagginglocationonphoto.provider");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ComparisonGroup) arrayList2.get(i2)).getBeforeImagePath() != null && ((ComparisonGroup) arrayList2.get(i2)).getAfterImagePath() != null) {
                arrayList.add(arrayList2.get(i2));
            }
        }
        try {
            boolean z = x().getBoolean(this, SP.IS_BEF_AFT_LOGO, false);
            boolean z2 = x().getBoolean(this, SP.IS_BEF_AFT_COMPANY_NAME, false);
            boolean z3 = x().getBoolean(this, SP.IS_BEF_AFT_TITLE, true);
            boolean z4 = x().getBoolean(this, SP.IS_BEF_AFT_PREPARED_BY, false);
            GeneratePDF generatePDF = new GeneratePDF(this);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.splash_icon);
            bitmapDecodeResource.getClass();
            if (!z) {
                bitmapDecodeBase64 = null;
            }
            if (z2) {
                try {
                    string = ej6.Y(w().h.getText().toString()).toString();
                } catch (Exception e2) {
                    exc = e2;
                    ap5Var = ap5Var;
                    file2 = file;
                    if (file2.exists()) {
                        file2.delete();
                    }
                    if (i == 0) {
                        try {
                            getContentResolver().delete((Uri) ap5Var.a, null, null);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    CPD.DismissDialog();
                    exc.printStackTrace();
                    HelperClass.showSnackBar(w().p, getString(R.string.pdf_saving_failed));
                }
            } else {
                string = "";
            }
            Bitmap bitmap = bitmapDecodeBase64;
            String str = string;
            file2 = file;
            try {
                generatePDF.generateBefAftPdf(this, file2, bitmapDecodeResource, bitmap, str, ej6.Y(w().x.getText().toString()).toString(), z4 ? ej6.Y(w().i.getText().toString()).toString() : "", z3 ? ej6.Y(w().j.getText().toString()).toString() : "", ej6.Y(w().k.getText().toString()).toString(), w().m, arrayList, new h30(i, ap5Var, this, file), new pj2() { // from class: i30
                    @Override // defpackage.pj2
                    public final Object invoke(Object obj) {
                        Exception exc2 = (Exception) obj;
                        int i3 = BefAftReportingActivity.R;
                        exc2.getClass();
                        File file3 = file;
                        if (file3.exists()) {
                            file3.delete();
                        }
                        int i4 = i;
                        BefAftReportingActivity befAftReportingActivity = this;
                        if (i4 == 0) {
                            ap5 ap5Var2 = ap5Var;
                            if (ap5Var2.a != null) {
                                try {
                                    befAftReportingActivity.getContentResolver().delete((Uri) ap5Var2.a, null, null);
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                            }
                        }
                        CPD.DismissDialog();
                        exc2.printStackTrace();
                        HelperClass.showSnackBar(befAftReportingActivity.w().p, befAftReportingActivity.getString(R.string.pdf_saving_failed));
                        return t17.a;
                    }
                });
            } catch (Exception e4) {
                e = e4;
                exc = e;
                if (file2.exists()) {
                    file2.delete();
                }
                if (i == 0 && ap5Var.a != null) {
                    getContentResolver().delete((Uri) ap5Var.a, null, null);
                }
                CPD.DismissDialog();
                exc.printStackTrace();
                HelperClass.showSnackBar(w().p, getString(R.string.pdf_saving_failed));
            }
        } catch (Exception e5) {
            e = e5;
            file2 = file;
        }
    }

    public final f5 w() {
        f5 f5Var = this.B;
        if (f5Var != null) {
            return f5Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final SP x() {
        SP sp = this.D;
        if (sp != null) {
            return sp;
        }
        bi3.g("mSP");
        throw null;
    }

    public final void y(Uri uri) {
        String absolutePath;
        u65 u65Var = this.I;
        if (u65Var == null) {
            return;
        }
        String str = (String) u65Var.a;
        boolean zBooleanValue = ((Boolean) u65Var.b).booleanValue();
        try {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            File file = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), "IMG_" + System.currentTimeMillis() + jumTrYZsYnyZCd.TAhsild);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (inputStreamOpenInputStream != null) {
                hl9.a(inputStreamOpenInputStream, fileOutputStream);
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            fileOutputStream.close();
            absolutePath = file.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            absolutePath = null;
        }
        if (absolutePath == null) {
            return;
        }
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (bi3.b(((ComparisonGroup) obj).getLocalId(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            ComparisonGroup comparisonGroup = (ComparisonGroup) arrayList.get(i);
            String beforeImagePath = zBooleanValue ? comparisonGroup.getBeforeImagePath() : comparisonGroup.getAfterImagePath();
            if (beforeImagePath != null) {
                new File(beforeImagePath).delete();
            }
            if (zBooleanValue) {
                comparisonGroup.setBeforeImagePath(absolutePath);
            } else {
                comparisonGroup.setAfterImagePath(absolutePath);
            }
            cx0 cx0Var = this.G;
            if (cx0Var == null) {
                bi3.g("dbHelper");
                throw null;
            }
            cx0Var.f(comparisonGroup);
            yw0 yw0Var = this.E;
            if (yw0Var == null) {
                bi3.g("adapter");
                throw null;
            }
            yw0Var.f(i);
        }
        this.I = null;
        if (z()) {
            w().b.setVisibility(0);
        } else {
            w().b.setVisibility(8);
        }
    }

    public final boolean z() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ComparisonGroup comparisonGroup = (ComparisonGroup) obj;
            if (comparisonGroup.getAfterImagePath() != null && comparisonGroup.getBeforeImagePath() != null) {
                return true;
            }
        }
        return false;
    }
}