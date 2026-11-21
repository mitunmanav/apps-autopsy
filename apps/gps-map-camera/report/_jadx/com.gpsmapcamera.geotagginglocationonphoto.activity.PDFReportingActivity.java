package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bumptech.glide.a;
import com.google.android.material.card.MaterialCardView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.GeneratePDF;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SafeNestedScrollView;
import com.gpsmapcamera.geotagginglocationonphoto.model.PDFImageModule;
import com.itextpdf.text.Annotation;
import com.onesignal.core.services.xoOP.QRjU;
import defpackage.a7;
import defpackage.ad3;
import defpackage.af0;
import defpackage.af1;
import defpackage.ap5;
import defpackage.b30;
import defpackage.bi3;
import defpackage.bj;
import defpackage.bv0;
import defpackage.c6;
import defpackage.c66;
import defpackage.ca4;
import defpackage.cc7;
import defpackage.dt3;
import defpackage.e8;
import defpackage.ei1;
import defpackage.eo7;
import defpackage.f02;
import defpackage.f31;
import defpackage.fw5;
import defpackage.h94;
import defpackage.i6;
import defpackage.i9a;
import defpackage.j64;
import defpackage.kea;
import defpackage.kg1;
import defpackage.l76;
import defpackage.la9;
import defpackage.lf3;
import defpackage.lt1;
import defpackage.mk9;
import defpackage.mq7;
import defpackage.n8;
import defpackage.o30;
import defpackage.p30;
import defpackage.pn9;
import defpackage.pr5;
import defpackage.r55;
import defpackage.s55;
import defpackage.t55;
import defpackage.u5;
import defpackage.u55;
import defpackage.ub7;
import defpackage.uw1;
import defpackage.v55;
import defpackage.v60;
import defpackage.vc4;
import defpackage.w7;
import defpackage.wl1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class PDFReportingActivity extends bj {
    public static final /* synthetic */ int M = 0;
    public u5 B;
    public boolean C;
    public SP D;
    public w7 F;
    public f31 G;
    public mo1 H;
    public final i6 J;
    public final i6 K;
    public ArrayList L;
    public final ArrayList E = new ArrayList();
    public final Handler I = new Handler(Looper.getMainLooper());

    public PDFReportingActivity() {
        int i = 0;
        this.J = (i6) n(new r55(this, i), new c6(2));
        this.K = (i6) n(new r55(this, 1), new c6(i));
    }

    public final void A() {
        long j;
        ArrayList arrayList = this.E;
        if (arrayList.size() <= 1) {
            t().s.setVisibility(8);
            C(arrayList);
            return;
        }
        t().r.setVisibility(8);
        t().j.setVisibility(8);
        t().s.setVisibility(0);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager();
        if (staggeredGridLayoutManager.i) {
            staggeredGridLayoutManager.i = false;
            staggeredGridLayoutManager.j = 0;
            RecyclerView recyclerView = staggeredGridLayoutManager.b;
            if (recyclerView != null) {
                recyclerView.c.n();
            }
        }
        t().s.setLayoutManager(staggeredGridLayoutManager);
        int i = 4;
        h94 h94Var = new h94(i, this);
        w7 w7Var = new w7(i);
        new ArrayList();
        w7Var.f = this;
        w7Var.e = arrayList;
        w7Var.d = h94Var;
        this.F = w7Var;
        t().s.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = t().s;
        w7 w7Var2 = this.F;
        if (w7Var2 == null) {
            bi3.g("adapter");
            throw null;
        }
        recyclerView2.setAdapter(w7Var2);
        if (arrayList.size() < 5) {
            j = 2500;
        } else if (arrayList.size() < 10) {
            j = 3500;
        } else if (arrayList.size() < 15) {
            j = 7000;
        } else {
            j = arrayList.size() < 20 ? 10000L : 15000L;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new vc4(7, staggeredGridLayoutManager), j);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0368 A[Catch: all -> 0x0394, TRY_LEAVE, TryCatch #1 {all -> 0x0394, blocks: (B:101:0x0362, B:103:0x0368), top: B:182:0x0362 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0390  */
    /* JADX WARN: Code duplicated, block: B:109:0x0398  */
    /* JADX WARN: Code duplicated, block: B:112:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:127:0x0400  */
    /* JADX WARN: Code duplicated, block: B:129:0x0414  */
    /* JADX WARN: Code duplicated, block: B:131:0x0419  */
    /* JADX WARN: Code duplicated, block: B:133:0x0421  */
    /* JADX WARN: Code duplicated, block: B:134:0x0424  */
    /* JADX WARN: Code duplicated, block: B:136:0x042a  */
    /* JADX WARN: Code duplicated, block: B:137:0x042d  */
    /* JADX WARN: Code duplicated, block: B:139:0x043b  */
    /* JADX WARN: Code duplicated, block: B:165:0x04be  */
    /* JADX WARN: Code duplicated, block: B:169:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0509  */
    /* JADX WARN: Code duplicated, block: B:175:0x051a  */
    /* JADX WARN: Code duplicated, block: B:176:0x051e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0524  */
    /* JADX WARN: Code duplicated, block: B:182:0x0362 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0295  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:93:0x030c  */
    /* JADX WARN: Code duplicated, block: B:95:0x032c A[PHI: r2
      0x032c: PHI (r2v48 java.lang.String) = (r2v22 java.lang.String), (r2v55 java.lang.String) binds: [B:105:0x0390, B:94:0x032a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x032f A[PHI: r8
      0x032f: PHI (r8v10 java.lang.String) = (r8v8 java.lang.String), (r8v5 java.lang.String) binds: [B:163:0x04b7, B:94:0x032a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0332  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0368, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x02a8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x02ca, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x02eb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x030c, please report this as an issue */
    public final void B(f02 f02Var, Uri uri, int i, int i2) throws Throwable {
        String dateTimeFormatforPDF;
        String strD;
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String path;
        ArrayList arrayList;
        ad3 ad3Var;
        String str6;
        Cursor cursorQuery;
        String str7;
        String str8;
        String str9;
        String str10;
        String documentId;
        String strReplaceFirst;
        String str11;
        Uri uri2;
        String str12;
        String str13;
        Uri uri3;
        String strD2 = f02Var.d("DateTimeOriginal");
        if (strD2 == null || strD2.length() == 0) {
            dateTimeFormatforPDF = "";
        } else {
            Date date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US).parse(strD2);
            v().getInteger(this, SP.TEMPLATE_TYPE, 0);
            dateTimeFormatforPDF = HelperClass.setDateTimeFormatforPDF(this, Default.DEFAULT_DATE_FORMAT, date);
            dateTimeFormatforPDF.getClass();
        }
        PDFImageModule pDFImageModule = new PDFImageModule();
        double[] dArrI = f02Var.i();
        String str14 = QRjU.qCbmCoVwzclOcYb;
        if (dArrI == null || dArrI.length != 2) {
            strD = f02Var.d("GPSLatitude");
            String strD3 = f02Var.d("GPSLatitudeRef");
            String strD4 = f02Var.d("GPSLongitude");
            String strD5 = f02Var.d("GPSLongitudeRef");
            if (strD != null || strD4 == null) {
                i3 = 1;
                pDFImageModule.setLink("");
            } else {
                double dConvertToDecimal = HelperClass.convertToDecimal(strD, strD3);
                i3 = 1;
                double dConvertToDecimal2 = HelperClass.convertToDecimal(strD4, strD5);
                if (dConvertToDecimal == 0.0d && dConvertToDecimal2 == 0.0d) {
                    pDFImageModule.setLink("");
                } else {
                    pDFImageModule.setLink(str14 + dConvertToDecimal + "," + dConvertToDecimal2);
                }
            }
        } else {
            double d = dArrI[0];
            if (d == 0.0d && dArrI[1] == 0.0d) {
                strD = f02Var.d("GPSLatitude");
                String strD6 = f02Var.d("GPSLatitudeRef");
                String strD7 = f02Var.d("GPSLongitude");
                String strD8 = f02Var.d("GPSLongitudeRef");
                if (strD != null) {
                    i3 = 1;
                    pDFImageModule.setLink("");
                } else {
                    i3 = 1;
                    pDFImageModule.setLink("");
                }
            } else {
                pDFImageModule.setLink(str14 + d + "," + dArrI[1]);
                i3 = 1;
            }
        }
        pDFImageModule.setUri(uri);
        pDFImageModule.setDateTime(dateTimeFormatforPDF);
        Log.d("FileUtils File -", "Authority: " + uri.getAuthority() + ", Fragment: " + uri.getFragment() + ", Port: " + uri.getPort() + ", Query: " + uri.getQuery() + ", Scheme: " + uri.getScheme() + ", Host: " + uri.getHost() + ", Segments: " + uri.getPathSegments().toString());
        if (DocumentsContract.isDocumentUri(this, uri)) {
            str2 = "";
            str3 = Annotation.FILE;
            if ("com.ianhanniballake.localstorage.documents".equals(uri.getAuthority())) {
                path = DocumentsContract.getDocumentId(uri);
            } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str15 = strArrSplit[0];
                path = Environment.getExternalStorageDirectory() + "/" + strArrSplit[i3];
            } else {
                if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    try {
                        String documentId2 = DocumentsContract.getDocumentId(uri);
                        str = "com.android.providers.downloads.documents";
                        try {
                            Log.d("FileUtils", "getPath: id= " + documentId2);
                            path = i9a.a(this, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId2)), null, null);
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            List<String> pathSegments = uri.getPathSegments();
                            int i4 = i3;
                            if (pathSegments.size() > i4) {
                                path = pathSegments.get(i4);
                                if (!path.startsWith("/")) {
                                    try {
                                        path = path.substring(path.indexOf("/"));
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        str5 = str3;
                                        str4 = null;
                                    }
                                }
                            }
                            str5 = str3;
                            str4 = null;
                            if (path == null) {
                                ad3Var = new ad3(8);
                                ad3Var.b = this;
                                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                                    str12 = strArrSplit2[0];
                                    str13 = "/" + strArrSplit2[1];
                                    if ("primary".equalsIgnoreCase(str12)) {
                                        str10 = Environment.getExternalStorageDirectory() + str13;
                                        if (!new File(str10).exists()) {
                                            str10 = System.getenv("SECONDARY_STORAGE") + str13;
                                            if (!new File(str10).exists()) {
                                                str10 = System.getenv("EXTERNAL_STORAGE") + str13;
                                                new File(str10).exists();
                                            }
                                        }
                                    } else {
                                        str10 = System.getenv("SECONDARY_STORAGE") + str13;
                                        if (!new File(str10).exists()) {
                                            str10 = System.getenv("EXTERNAL_STORAGE") + str13;
                                            new File(str10).exists();
                                        }
                                    }
                                    if (str10 != str2) {
                                        strReplaceFirst = str10;
                                    } else {
                                        strReplaceFirst = str4;
                                    }
                                } else {
                                    str6 = str2;
                                    if (str.equals(uri.getAuthority())) {
                                        try {
                                            str7 = "com.android.providers.media.documents";
                                            str8 = "video";
                                            str9 = "image";
                                            cursorQuery = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                            if (cursorQuery != null) {
                                                try {
                                                    if (cursorQuery.moveToFirst()) {
                                                        str10 = Environment.getExternalStorageDirectory().toString() + "/Download/" + cursorQuery.getString(0);
                                                        if (!TextUtils.isEmpty(str10)) {
                                                            cursorQuery.close();
                                                            strReplaceFirst = str10;
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            documentId = DocumentsContract.getDocumentId(uri);
                                            if (!TextUtils.isEmpty(documentId)) {
                                                if (documentId.startsWith("raw:")) {
                                                    strReplaceFirst = documentId.replaceFirst("raw:", str6);
                                                } else {
                                                    try {
                                                        strReplaceFirst = ad3.w(this, ContentUris.withAppendedId(Uri.parse(new String[]{"content://downloads/public_downloads", "content://downloads/my_downloads"}[0]), Long.valueOf(documentId).longValue()), null, null);
                                                    } catch (NumberFormatException unused) {
                                                        strReplaceFirst = uri.getPath().replaceFirst("^/document/raw:", str6).replaceFirst("^raw:", str6);
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursorQuery = null;
                                        }
                                    } else {
                                        str8 = "video";
                                        str9 = "image";
                                        str7 = "com.android.providers.media.documents";
                                    }
                                    if (str7.equals(uri.getAuthority())) {
                                        String[] strArrSplit3 = DocumentsContract.getDocumentId(uri).split(":");
                                        str11 = strArrSplit3[0];
                                        if (str9.equals(str11)) {
                                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                        } else if (str8.equals(str11)) {
                                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                        } else if ("audio".equals(str11)) {
                                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                        } else {
                                            uri2 = null;
                                        }
                                        strReplaceFirst = ad3.w(this, uri2, "_id=?", new String[]{strArrSplit3[1]});
                                    } else if ("com.google.android.apps.docs.storage".equals(uri.getAuthority())) {
                                        strReplaceFirst = ad3Var.x(uri);
                                    } else {
                                        strReplaceFirst = ad3Var.x(uri);
                                    }
                                }
                                path = strReplaceFirst;
                            }
                            pDFImageModule.setFilename(path);
                            ((pr5) a.b(this).d(this).k().j(720, 720)).G(uri).F(new p30(5, pDFImageModule)).J();
                            arrayList = this.E;
                            if (arrayList.size() < 25) {
                                arrayList.add(pDFImageModule);
                                if (t().b.getVisibility() != 0) {
                                    t().b.setVisibility(0);
                                }
                                if (i == i2 - 1) {
                                    A();
                                } else if (arrayList.size() == 25) {
                                    A();
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str = "com.android.providers.downloads.documents";
                    }
                } else {
                    str = "com.android.providers.downloads.documents";
                    if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                        String[] strArrSplit4 = DocumentsContract.getDocumentId(uri).split(":");
                        String str16 = strArrSplit4[0];
                        if ("image".equals(str16)) {
                            uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if ("video".equals(str16)) {
                            uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else {
                            uri3 = "audio".equals(str16) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : Uri.parse(new File(String.valueOf(uri)).getParent());
                        }
                        path = i9a.a(this, uri3, "_id=?", new String[]{strArrSplit4[1]});
                    }
                    str5 = str3;
                    str4 = null;
                }
                str5 = str3;
                str4 = null;
            }
            str5 = str3;
            str = "com.android.providers.downloads.documents";
            str4 = null;
        } else {
            str = "com.android.providers.downloads.documents";
            str2 = "";
            str3 = Annotation.FILE;
            if (!Annotation.CONTENT.equalsIgnoreCase(uri.getScheme())) {
                str4 = null;
                str5 = str3;
                path = str5.equalsIgnoreCase(uri.getScheme()) ? uri.getPath() : str4;
            } else if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                path = uri.getLastPathSegment();
                str5 = str3;
                str4 = null;
            } else {
                str4 = null;
                path = i9a.a(this, uri, null, null);
                str5 = str3;
            }
        }
        if (path == null) {
            ad3Var = new ad3(8);
            ad3Var.b = this;
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] strArrSplit5 = DocumentsContract.getDocumentId(uri).split(":");
                str12 = strArrSplit5[0];
                str13 = "/" + strArrSplit5[1];
                if ("primary".equalsIgnoreCase(str12)) {
                    str10 = Environment.getExternalStorageDirectory() + str13;
                    if (!new File(str10).exists()) {
                        str10 = System.getenv("SECONDARY_STORAGE") + str13;
                        if (!new File(str10).exists()) {
                            str10 = System.getenv("EXTERNAL_STORAGE") + str13;
                            new File(str10).exists();
                        }
                    }
                } else {
                    str10 = System.getenv("SECONDARY_STORAGE") + str13;
                    if (!new File(str10).exists()) {
                        str10 = System.getenv("EXTERNAL_STORAGE") + str13;
                        new File(str10).exists();
                    }
                }
                if (str10 != str2) {
                    strReplaceFirst = str10;
                } else {
                    strReplaceFirst = str4;
                }
            } else {
                str6 = str2;
                if (str.equals(uri.getAuthority())) {
                    str7 = "com.android.providers.media.documents";
                    str8 = "video";
                    str9 = "image";
                    cursorQuery = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery != null) {
                        if (cursorQuery.moveToFirst()) {
                            str10 = Environment.getExternalStorageDirectory().toString() + "/Download/" + cursorQuery.getString(0);
                            if (!TextUtils.isEmpty(str10)) {
                                cursorQuery.close();
                                strReplaceFirst = str10;
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    documentId = DocumentsContract.getDocumentId(uri);
                    if (!TextUtils.isEmpty(documentId)) {
                        if (documentId.startsWith("raw:")) {
                            strReplaceFirst = documentId.replaceFirst("raw:", str6);
                        } else {
                            strReplaceFirst = ad3.w(this, ContentUris.withAppendedId(Uri.parse(new String[]{"content://downloads/public_downloads", "content://downloads/my_downloads"}[0]), Long.valueOf(documentId).longValue()), null, null);
                        }
                    }
                } else {
                    str8 = "video";
                    str9 = "image";
                    str7 = "com.android.providers.media.documents";
                }
                if (str7.equals(uri.getAuthority())) {
                    String[] strArrSplit6 = DocumentsContract.getDocumentId(uri).split(":");
                    str11 = strArrSplit6[0];
                    if (str9.equals(str11)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (str8.equals(str11)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str11)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else {
                        uri2 = null;
                    }
                    strReplaceFirst = ad3.w(this, uri2, "_id=?", new String[]{strArrSplit6[1]});
                } else if ("com.google.android.apps.docs.storage".equals(uri.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri.getAuthority())) {
                    strReplaceFirst = ad3Var.x(uri);
                } else if ("com.whatsapp.provider.media".equals(uri.getAuthority())) {
                    strReplaceFirst = ad3Var.u(uri, "whatsapp");
                } else if (!Annotation.CONTENT.equalsIgnoreCase(uri.getScheme())) {
                    str4 = null;
                    if (str5.equalsIgnoreCase(uri.getScheme())) {
                        strReplaceFirst = uri.getPath();
                    } else {
                        strReplaceFirst = str4;
                    }
                } else if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                    strReplaceFirst = uri.getLastPathSegment();
                } else if ("com.google.android.apps.docs.storage".equals(uri.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri.getAuthority())) {
                    strReplaceFirst = ad3Var.x(uri);
                } else {
                    strReplaceFirst = Build.VERSION.SDK_INT >= 29 ? ad3Var.u(uri, "userfiles") : ad3.w(this, uri, null, null);
                }
            }
            path = strReplaceFirst;
        }
        pDFImageModule.setFilename(path);
        ((pr5) a.b(this).d(this).k().j(720, 720)).G(uri).F(new p30(5, pDFImageModule)).J();
        arrayList = this.E;
        if (arrayList.size() < 25) {
            arrayList.add(pDFImageModule);
            if (t().b.getVisibility() != 0) {
                t().b.setVisibility(0);
            }
            if (i == i2 - 1) {
                A();
            } else if (arrayList.size() == 25) {
                A();
            }
        }
    }

    public final void C(ArrayList arrayList) {
        t().r.setVisibility(0);
        t().j.setVisibility(8);
        Object obj = arrayList.get(0);
        obj.getClass();
        PDFImageModule pDFImageModule = (PDFImageModule) obj;
        ((pr5) ((pr5) a.b(this).d(this).n(pDFImageModule.getUri()).j(1080, 1080)).u(new fw5(HelperClass.dpToPx(this, 20)), true)).E((ImageView) t().u.c);
        ((TextView) t().u.f).setText(pDFImageModule.getDateTime());
        ((ImageView) t().u.d).setOnClickListener(new o30(5, this));
        String link = pDFImageModule.getLink();
        if (link == null || link.length() == 0) {
            ((ImageView) t().u.e).setVisibility(8);
        } else {
            ((ImageView) t().u.e).setVisibility(0);
        }
        ((ImageView) t().u.e).setOnClickListener(new b30(13, this, pDFImageModule));
    }

    public final void D() {
        v60 v60Var = new v60(this, R.style.AppBottomSheetDialogTheme);
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_discard_report, (ViewGroup) null);
        v60Var.setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_message);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.cardKeepEditing);
        viewFindViewById3.getClass();
        MaterialCardView materialCardView = (MaterialCardView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.btnKeepEditing);
        viewFindViewById4.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.cardDiscard);
        viewFindViewById5.getClass();
        MaterialCardView materialCardView2 = (MaterialCardView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.btnDiscard);
        viewFindViewById6.getClass();
        AppCompatButton appCompatButton2 = (AppCompatButton) viewFindViewById6;
        if (this.C) {
            textView.setTextColor(getColor(R.color.app_text_main_dark));
            textView2.setTextColor(getColor(R.color.app_text_sub_main_dark));
            materialCardView.setCardBackgroundColor(getColor(R.color.app_main_dark));
            appCompatButton.setTextColor(getColor(R.color.black_light));
            materialCardView2.setCardBackgroundColor(Color.parseColor("#2D1517"));
            materialCardView2.setStrokeColor(Color.parseColor("#7F1D1D"));
            appCompatButton2.setTextColor(Color.parseColor("#F87171"));
        } else {
            textView.setTextColor(getColor(R.color.app_text_main_light));
            textView2.setTextColor(getColor(R.color.app_text_sub_main_light));
            materialCardView.setCardBackgroundColor(getColor(R.color.app_main_light));
            appCompatButton.setTextColor(getColor(R.color.black_light));
            materialCardView2.setCardBackgroundColor(Color.parseColor("#FFF1F2"));
            materialCardView2.setStrokeColor(Color.parseColor("#FCA5A5"));
            appCompatButton2.setTextColor(Color.parseColor("#EF4444"));
        }
        appCompatButton.setOnClickListener(new e8(v60Var, 7));
        appCompatButton2.setOnClickListener(new b30(12, v60Var, this));
        v60Var.show();
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        new HelperClass().SetLanguage(this);
        this.D = new SP(this);
        String string = v().getString(this, SP.APP_THEME, Default.LIGHT);
        int i2 = 1;
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
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_pdfreporting2, (ViewGroup) null, false);
        int i3 = R.id.btnLayout;
        LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.btnLayout, viewInflate);
        if (linearLayout != null) {
            i3 = R.id.btnSavePDF;
            LinearLayout linearLayout2 = (LinearLayout) pn9.a(R.id.btnSavePDF, viewInflate);
            if (linearLayout2 != null) {
                i3 = R.id.btnSavePhoto;
                LinearLayout linearLayout3 = (LinearLayout) pn9.a(R.id.btnSavePhoto, viewInflate);
                if (linearLayout3 != null) {
                    i3 = R.id.btnSharePDF;
                    LinearLayout linearLayout4 = (LinearLayout) pn9.a(R.id.btnSharePDF, viewInflate);
                    if (linearLayout4 != null) {
                        i3 = R.id.btnShareWp;
                        LinearLayout linearLayout5 = (LinearLayout) pn9.a(R.id.btnShareWp, viewInflate);
                        if (linearLayout5 != null) {
                            i3 = R.id.flow;
                            if (((Flow) pn9.a(R.id.flow, viewInflate)) != null) {
                                i3 = R.id.ivAddImages;
                                ImageView imageView = (ImageView) pn9.a(R.id.ivAddImages, viewInflate);
                                if (imageView != null) {
                                    i3 = R.id.ivCompanyLogo;
                                    ImageView imageView2 = (ImageView) pn9.a(R.id.ivCompanyLogo, viewInflate);
                                    if (imageView2 != null) {
                                        i3 = R.id.layoutPdfPreview;
                                        if (((RelativeLayout) pn9.a(R.id.layoutPdfPreview, viewInflate)) != null) {
                                            i3 = R.id.layoutPdfPreview2;
                                            LinearLayout linearLayout6 = (LinearLayout) pn9.a(R.id.layoutPdfPreview2, viewInflate);
                                            if (linearLayout6 != null) {
                                                i3 = R.id.llCompanyLay;
                                                if (((LinearLayout) pn9.a(R.id.llCompanyLay, viewInflate)) != null) {
                                                    i3 = R.id.llEmptyView;
                                                    LinearLayout linearLayout7 = (LinearLayout) pn9.a(R.id.llEmptyView, viewInflate);
                                                    if (linearLayout7 != null) {
                                                        i3 = R.id.llHeaderTextLay;
                                                        if (((LinearLayout) pn9.a(R.id.llHeaderTextLay, viewInflate)) != null) {
                                                            i3 = R.id.llProjectName;
                                                            LinearLayout linearLayout8 = (LinearLayout) pn9.a(R.id.llProjectName, viewInflate);
                                                            if (linearLayout8 != null) {
                                                                i3 = R.id.llRemark;
                                                                LinearLayout linearLayout9 = (LinearLayout) pn9.a(R.id.llRemark, viewInflate);
                                                                if (linearLayout9 != null) {
                                                                    i3 = R.id.llReportBy;
                                                                    LinearLayout linearLayout10 = (LinearLayout) pn9.a(R.id.llReportBy, viewInflate);
                                                                    if (linearLayout10 != null) {
                                                                        i3 = R.id.llSupervisor;
                                                                        LinearLayout linearLayout11 = (LinearLayout) pn9.a(R.id.llSupervisor, viewInflate);
                                                                        if (linearLayout11 != null) {
                                                                            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                                            i3 = R.id.rel_adaptive_banner;
                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) pn9.a(R.id.rel_adaptive_banner, viewInflate);
                                                                            if (relativeLayout2 != null) {
                                                                                i3 = R.id.rlBtmAds;
                                                                                if (((RelativeLayout) pn9.a(R.id.rlBtmAds, viewInflate)) != null) {
                                                                                    i3 = R.id.rlBtmBtn;
                                                                                    if (((RelativeLayout) pn9.a(R.id.rlBtmBtn, viewInflate)) != null) {
                                                                                        i3 = R.id.rlMainFooterView;
                                                                                        if (((RelativeLayout) pn9.a(R.id.rlMainFooterView, viewInflate)) != null) {
                                                                                            i3 = R.id.rlMainImageLayout;
                                                                                            LinearLayout linearLayout12 = (LinearLayout) pn9.a(R.id.rlMainImageLayout, viewInflate);
                                                                                            if (linearLayout12 != null) {
                                                                                                i3 = R.id.rlPDFHeader;
                                                                                                if (((RelativeLayout) pn9.a(R.id.rlPDFHeader, viewInflate)) != null) {
                                                                                                    i3 = R.id.rlReportTitle;
                                                                                                    if (((RelativeLayout) pn9.a(R.id.rlReportTitle, viewInflate)) != null) {
                                                                                                        i3 = R.id.rlSingleImageLayout;
                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) pn9.a(R.id.rlSingleImageLayout, viewInflate);
                                                                                                        if (relativeLayout3 != null) {
                                                                                                            i3 = R.id.rvImageData;
                                                                                                            RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.rvImageData, viewInflate);
                                                                                                            if (recyclerView != null) {
                                                                                                                i3 = R.id.rvImageDataPhoto;
                                                                                                                RecyclerView recyclerView2 = (RecyclerView) pn9.a(R.id.rvImageDataPhoto, viewInflate);
                                                                                                                if (recyclerView2 != null) {
                                                                                                                    i3 = R.id.scrollView;
                                                                                                                    if (((SafeNestedScrollView) pn9.a(R.id.scrollView, viewInflate)) != null) {
                                                                                                                        i3 = R.id.singleLayItem;
                                                                                                                        View viewA = pn9.a(R.id.singleLayItem, viewInflate);
                                                                                                                        if (viewA != null) {
                                                                                                                            int i4 = R.id.ivImage;
                                                                                                                            ImageView imageView3 = (ImageView) pn9.a(R.id.ivImage, viewA);
                                                                                                                            if (imageView3 != null) {
                                                                                                                                i4 = R.id.ivImageClose;
                                                                                                                                ImageView imageView4 = (ImageView) pn9.a(R.id.ivImageClose, viewA);
                                                                                                                                if (imageView4 != null) {
                                                                                                                                    i4 = R.id.ivLink;
                                                                                                                                    ImageView imageView5 = (ImageView) pn9.a(R.id.ivLink, viewA);
                                                                                                                                    if (imageView5 != null) {
                                                                                                                                        i4 = R.id.tvDateTime;
                                                                                                                                        TextView textView = (TextView) pn9.a(R.id.tvDateTime, viewA);
                                                                                                                                        if (textView != null) {
                                                                                                                                            bv0 bv0Var = new bv0((RelativeLayout) viewA, imageView3, imageView4, imageView5, textView, 19);
                                                                                                                                            i3 = R.id.toolbar;
                                                                                                                                            View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                                                                                                            if (viewA2 != null) {
                                                                                                                                                l76 l76VarA = l76.a(viewA2);
                                                                                                                                                i3 = R.id.tvCompanyName;
                                                                                                                                                TextView textView2 = (TextView) pn9.a(R.id.tvCompanyName, viewInflate);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    i3 = R.id.tvDate;
                                                                                                                                                    TextView textView3 = (TextView) pn9.a(R.id.tvDate, viewInflate);
                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                        i3 = R.id.tvProjectName;
                                                                                                                                                        TextView textView4 = (TextView) pn9.a(R.id.tvProjectName, viewInflate);
                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                            i3 = R.id.tvRemark;
                                                                                                                                                            TextView textView5 = (TextView) pn9.a(R.id.tvRemark, viewInflate);
                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                i3 = R.id.tvReportBy;
                                                                                                                                                                TextView textView6 = (TextView) pn9.a(R.id.tvReportBy, viewInflate);
                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                    i3 = R.id.tvSupervisor;
                                                                                                                                                                    TextView textView7 = (TextView) pn9.a(R.id.tvSupervisor, viewInflate);
                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                        i3 = R.id.tvTitle;
                                                                                                                                                                        TextView textView8 = (TextView) pn9.a(R.id.tvTitle, viewInflate);
                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                            this.B = new u5(relativeLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, imageView, imageView2, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, relativeLayout, relativeLayout2, linearLayout12, relativeLayout3, recyclerView, recyclerView2, bv0Var, l76VarA, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
                                                                                                                                                                            setContentView(t().a);
                                                                                                                                                                            RelativeLayout relativeLayout4 = t().o;
                                                                                                                                                                            int i5 = 2;
                                                                                                                                                                            r55 r55Var = new r55(this, i5);
                                                                                                                                                                            WeakHashMap weakHashMap = cc7.a;
                                                                                                                                                                            ub7.c(relativeLayout4, r55Var);
                                                                                                                                                                            k().a(this, new n8(this, 18));
                                                                                                                                                                            ((RelativeLayout) t().v.f).setVisibility(0);
                                                                                                                                                                            ((RelativeLayout) t().v.c).setOnClickListener(new t55(this, i2));
                                                                                                                                                                            t().g.setOnClickListener(new t55(this, i5));
                                                                                                                                                                            t().c.setOnClickListener(new t55(this, 3));
                                                                                                                                                                            t().f.setOnClickListener(new t55(this, 4));
                                                                                                                                                                            t().e.setOnClickListener(new t55(this, 5));
                                                                                                                                                                            t().d.setOnClickListener(new t55(this, 6));
                                                                                                                                                                            ((RelativeLayout) t().v.f).setOnClickListener(new t55(this, 7));
                                                                                                                                                                            ((TextView) t().v.l).setText(R.string.photo_report);
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
                                                                                                                            mq7.o("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i4)));
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
        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        int i;
        super.onResume();
        String string = v().getString(this, SP.PDF_COMPANY_NAME, "-");
        String string2 = v().getString(this, SP.PDF_TITLE, la9.e(this, R.string.work_report));
        String string3 = v().getString(this, SP.PDF_SUPERVISOR, "-");
        String string4 = v().getString(this, SP.PDF_REPORT_BY, "-");
        String string5 = v().getString(this, SP.PDF_PROJECT_NAME, "-");
        String string6 = v().getString(this, SP.PDF_REMARK, "-");
        boolean z = v().getBoolean(this, SP.IS_PDF_COMPANY_NAME, false);
        boolean z2 = v().getBoolean(this, SP.IS_PDF_LOGO, false);
        boolean z3 = v().getBoolean(this, SP.IS_PDF_TITLE, true);
        boolean z4 = v().getBoolean(this, SP.IS_PDF_SUPERVISOR, false);
        boolean z5 = v().getBoolean(this, SP.IS_PDF_REPORT_BY, false);
        boolean z6 = v().getBoolean(this, SP.IS_PDF_PROJECT_NAME, false);
        boolean z7 = v().getBoolean(this, SP.IS_PDF_REMARK, false);
        t().x.setText(HelperClass.setDateTimeFormatPDF(this, "EEEE, dd/MM/yyyy\nhh:mm a"));
        if (z) {
            t().w.setText(string);
            i = 0;
            t().w.setVisibility(0);
        } else {
            i = 0;
            t().w.setVisibility(8);
        }
        if (z2) {
            t().h.setVisibility(i);
            if (v().getString(this, SP.PDF_LOGO, Default.LOGO_uri).equals(Default.LOGO_uri)) {
                t().h.setImageResource(R.drawable.splash_icon);
            } else {
                t().h.setImageBitmap(HelperClass.decodeBase64(v().getString(this, SP.PDF_LOGO, Default.LOGO_uri)));
            }
        } else {
            t().h.setVisibility(8);
        }
        if (z4) {
            t().B.setText(string3);
            t().n.setVisibility(0);
        } else {
            t().n.setVisibility(8);
        }
        if (z7) {
            t().z.setText(string6);
            t().l.setVisibility(0);
        } else {
            t().l.setVisibility(8);
        }
        if (z6) {
            t().y.setText(string5);
            t().k.setVisibility(0);
        } else {
            t().k.setVisibility(8);
        }
        if (z5) {
            t().A.setText(string4);
            t().m.setVisibility(0);
        } else {
            t().m.setVisibility(8);
        }
        if (z3) {
            t().C.setText(string2);
        } else {
            t().C.setText("");
        }
        CPD.DismissDialog();
        if (this.E.isEmpty()) {
            t().j.setVisibility(0);
        } else {
            t().j.setVisibility(8);
        }
        if (!AllAdsApproval.isPDFReportingScreenBanner(this)) {
            t().p.setVisibility(8);
            return;
        }
        Admob admob = new Admob();
        int i2 = RemoteAdData.ADS_NETWORK_TYPE;
        if (i2 != 9) {
            if (i2 == 1) {
                admob.loadAdaptive_banner(this, t().p, RemoteAdData.SETTING_SCREEN_BANNER_ID);
                return;
            } else {
                if (i2 == 2) {
                    admob.loadAdaptive_bannerAdax(this, t().p, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i3 = RemoteAdData.PDF_REPORTING_SCREEN_BANNER_TYPE;
        if (i3 == 1) {
            admob.loadAdaptive_banner(this, t().p, RemoteAdData.SETTING_SCREEN_BANNER_ID);
        } else if (i3 == 2) {
            admob.loadAdaptive_bannerAdax(this, t().p, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final void s(int i) {
        File file;
        File file2;
        String strX = eo7.x("GPS Map Camera_Report_", new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()), ".pdf");
        ap5 ap5Var = new ap5();
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
        String string = v().getString(this, SP.PDF_COMPANY_NAME, "-");
        boolean z = v().getBoolean(this, SP.IS_PDF_COMPANY_NAME, false);
        String string2 = v().getString(this, SP.PDF_TITLE, getString(R.string.work_report));
        boolean z2 = v().getBoolean(this, SP.IS_PDF_TITLE, true);
        String string3 = v().getString(this, SP.PDF_SUPERVISOR, "-");
        boolean z3 = v().getBoolean(this, SP.IS_PDF_SUPERVISOR, false);
        String string4 = v().getString(this, SP.PDF_REPORT_BY, "-");
        boolean z4 = v().getBoolean(this, SP.IS_PDF_REPORT_BY, false);
        String string5 = v().getString(this, SP.PDF_PROJECT_NAME, "-");
        boolean z5 = v().getBoolean(this, SP.IS_PDF_PROJECT_NAME, false);
        String string6 = v().getString(this, SP.PDF_REMARK, "-");
        boolean z6 = v().getBoolean(this, SP.IS_PDF_REMARK, false);
        boolean z7 = v().getBoolean(this, SP.IS_PDF_LOGO, false);
        v().getInteger(this, SP.TEMPLATE_TYPE, 0);
        String dateTimeFormatPDF = HelperClass.setDateTimeFormatPDF(this, "EEEE, dd/MM/yyyy\nhh:mm a");
        BitmapFactory.decodeResource(getResources(), R.drawable.splash_icon);
        Bitmap bitmapDecodeResource = v().getString(this, SP.PDF_LOGO, Default.LOGO_uri).equals(Default.LOGO_uri) ? BitmapFactory.decodeResource(getResources(), R.drawable.splash_icon) : HelperClass.decodeBase64(v().getString(this, SP.PDF_LOGO, Default.LOGO_uri));
        try {
            ContentResolver contentResolver = getContentResolver();
            Object obj = ap5Var.a;
            obj.getClass();
            contentResolver.openOutputStream((Uri) obj);
            GeneratePDF generatePDF = new GeneratePDF(this);
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.splash_icon);
            bitmapDecodeResource2.getClass();
            bitmapDecodeResource.getClass();
            string.getClass();
            dateTimeFormatPDF.getClass();
            string3.getClass();
            string4.getClass();
            string6.getClass();
            string5.getClass();
            string2.getClass();
            file2 = file;
            try {
                generatePDF.generateCompletePdf(this, file2, bitmapDecodeResource2, bitmapDecodeResource, string, dateTimeFormatPDF, string3, string4, string6, string5, string2, t().i, this.E, z3, z4, z6, z5, z7, z, z2, new uw1(i, this, ap5Var), new af0(8, file, this));
            } catch (Exception e2) {
                e = e2;
                if (file2.exists()) {
                    file2.delete();
                }
                CPD.DismissDialog();
                e.printStackTrace();
                HelperClass.showSnackBar(t().o, getString(R.string.pdf_saving_failed));
            }
        } catch (Exception e3) {
            e = e3;
            file2 = file;
        }
    }

    public final u5 t() {
        u5 u5Var = this.B;
        if (u5Var != null) {
            return u5Var;
        }
        bi3.g("binding");
        throw null;
    }

    public final void u() {
        int integer = v().getInteger(this, HelperClass.COUNTADS, 0);
        int i = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i) {
            integer = i;
        }
        if (!AllAdsApproval.iSPDFReportingFS(this)) {
            finish();
            return;
        }
        if (integer < RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            v().setInteger(this, HelperClass.COUNTADS, integer + 1);
            finish();
            return;
        }
        CPD.ShowDialog(this, getString(R.string.cluster_loading));
        new Handler(Looper.getMainLooper()).postDelayed(new s55(this, 2), 200L);
        Handler handler = this.I;
        handler.getClass();
        handler.postDelayed(new s55(this, 3), 7000L);
    }

    public final SP v() {
        SP sp = this.D;
        if (sp != null) {
            return sp;
        }
        bi3.g("mSP");
        throw null;
    }

    public final void w(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            byte[] bArrUriToByteArray = HelperClass.uriToByteArray(this, ((ca4) list.get(i)).i);
            bArrUriToByteArray.getClass();
            Uri uri = ((ca4) list.get(i)).i;
            int size2 = list.size();
            ByteArrayInputStream byteArrayInputStream = null;
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrUriToByteArray);
                    try {
                        f02 f02Var = new f02(byteArrayInputStream2);
                        uri.getClass();
                        B(f02Var, uri, i, size2);
                        byteArrayInputStream2.close();
                    } catch (Exception e) {
                        e = e;
                        byteArrayInputStream = byteArrayInputStream2;
                        e.printStackTrace();
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream = byteArrayInputStream2;
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    public final void x() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new lf3(9, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void y() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new j64(4, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void z() {
        int size = 25 - this.E.size();
        if (size <= 0) {
            HelperClass.showSnackBar(t().a, getString(R.string.maximum_25_images_allowed));
            return;
        }
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            CPD.ShowDialog(this);
            dt3 dt3VarA = kea.a(this);
            kg1 kg1Var = wl1.a;
            mk9.g(dt3VarA, af1.c, null, new ei1(this, size, null, 3), 2);
            return;
        }
        if (arrayList.isEmpty()) {
            HelperClass.showSnackBar(t().a, getString(R.string.no_photos_found));
            return;
        }
        ArrayList arrayList2 = this.L;
        arrayList2.getClass();
        new v55(arrayList2, size, new u55(this, 0)).d0(o(), "PDFImagePicker");
    }
}