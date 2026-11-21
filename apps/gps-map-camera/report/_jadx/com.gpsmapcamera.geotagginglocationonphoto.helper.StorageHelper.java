package com.gpsmapcamera.geotagginglocationonphoto.helper;

import ads_mobile_sdk.fh;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import com.gpsmapcamera.geotagginglocationonphoto.ui.activities.hP.IocDDCWAufvgdf;
import defpackage.af1;
import defpackage.ap5;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c54;
import defpackage.ca4;
import defpackage.dk2;
import defpackage.dq9;
import defpackage.dt3;
import defpackage.fs7;
import defpackage.hv0;
import defpackage.i41;
import defpackage.i49;
import defpackage.io6;
import defpackage.iv0;
import defpackage.k41;
import defpackage.kea;
import defpackage.kg1;
import defpackage.kv0;
import defpackage.lj6;
import defpackage.mk9;
import defpackage.mv1;
import defpackage.nh6;
import defpackage.np5;
import defpackage.pc1;
import defpackage.pj2;
import defpackage.qj;
import defpackage.s51;
import defpackage.t17;
import defpackage.t51;
import defpackage.wca;
import defpackage.wl1;
import defpackage.xr9;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class StorageHelper {

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAPPMediaDir$1, reason: invalid class name */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper", f = "StorageHelper.kt", l = {fh.H0}, m = "getAPPMediaDir", v = 2)
    public static final class AnonymousClass1 extends k41 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(i41<? super AnonymousClass1> i41Var) {
            super(i41Var);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageHelper.this.getAPPMediaDir(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAPPMediaDir$2, reason: invalid class name */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAPPMediaDir$2", f = "StorageHelper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends io6 implements dk2 {
        final /* synthetic */ List<ca4> $allMedia;
        final /* synthetic */ Uri $contentUri;
        final /* synthetic */ Context $this_getAPPMediaDir;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Uri uri, List<ca4> list, i41<? super AnonymousClass2> i41Var) {
            super(2, i41Var);
            this.$this_getAPPMediaDir = context;
            this.$contentUri = uri;
            this.$allMedia = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$0(String str) {
            return "_data LIKE ?";
        }

        @Override // defpackage.k00
        public final i41<t17> create(Object obj, i41<?> i41Var) {
            return new AnonymousClass2(this.$this_getAPPMediaDir, this.$contentUri, this.$allMedia, i41Var);
        }

        @Override // defpackage.dk2
        public final Object invoke(s51 s51Var, i41<? super t17> i41Var) {
            return ((AnonymousClass2) create(s51Var, i41Var)).invokeSuspend(t17.a);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) throws IOException {
            boolean zH;
            boolean zE;
            boolean zH2;
            Uri uriWithAppendedId;
            int i;
            if (this.label != 0) {
                qj.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i49.b(obj);
            String str = IocDDCWAufvgdf.ZPbOCNYqKnE;
            String[] strArr = {str, "_data", "_display_name", "date_modified", "_size"};
            List listF = iv0.f("/storage/emulated/0/DCIM/GPS Map Camera/");
            String strB = hv0.B(listF, " OR ", null, null, 0, new d(), 30);
            ArrayList arrayList = new ArrayList(iv0.d(listF, 10));
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()) + "%");
            }
            boolean z = false;
            Cursor cursorQuery = this.$this_getAPPMediaDir.getContentResolver().query(this.$contentUri, strArr, strB, (String[]) arrayList.toArray(new String[0]), "date_added DESC");
            if (cursorQuery == null) {
                return null;
            }
            List<ca4> list = this.$allMedia;
            while (cursorQuery.moveToNext()) {
                try {
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(str));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified")) * 1000;
                    long j3 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    string.getClass();
                    boolean zD = wca.d(string);
                    boolean zF = zD ? z : wca.f(string);
                    if (zD || zF) {
                        zH = false;
                    } else {
                        string2.getClass();
                        zH = lj6.h(string2, ".gif", true);
                    }
                    if (zD || zF || zH) {
                        zE = false;
                    } else {
                        string2.getClass();
                        zE = wca.e(string2);
                    }
                    if (zD || zF || zH || zE) {
                        zH2 = false;
                    } else {
                        string2.getClass();
                        zH2 = lj6.h(string2, ".svg", true);
                    }
                    boolean z2 = zH2;
                    if (Build.VERSION.SDK_INT >= 29) {
                        uriWithAppendedId = ContentUris.withAppendedId(zF ? MediaStore.Video.Media.getContentUri("external") : MediaStore.Images.Media.getContentUri("external"), j);
                        uriWithAppendedId.getClass();
                    } else {
                        uriWithAppendedId = ContentUris.withAppendedId(zF ? MediaStore.Video.Media.getContentUri("external") : MediaStore.Images.Media.getContentUri("external"), j);
                        uriWithAppendedId.getClass();
                    }
                    try {
                        ca4 ca4Var = new ca4();
                        ca4Var.d = string;
                        ca4Var.g = j;
                        ca4Var.h = uriWithAppendedId;
                        ca4Var.c = cursorQuery.getPosition();
                        ca4Var.e = j2;
                        ca4Var.i = uriWithAppendedId;
                        ca4Var.l = j3;
                        if (zF) {
                            i = 2;
                        } else if (zH) {
                            i = 4;
                        } else if (zE) {
                            i = 8;
                        } else {
                            i = z2 ? 16 : 1;
                        }
                        ca4Var.j = i;
                        String parent = new File(string).getParent();
                        parent.getClass();
                        ca4Var.a = parent;
                        String parent2 = new File(string).getParent();
                        parent2.getClass();
                        ca4Var.b = parent2;
                        string2.getClass();
                        ca4Var.k = string2;
                        if (new File(string).length() > 0 && !lj6.h(string, ".nomedia", true)) {
                            list.add(ca4Var);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    str = str;
                    z = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dq9.a(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
            return t17.a;
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAppDirImages$1, reason: invalid class name and case insensitive filesystem */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper", f = "StorageHelper.kt", l = {86}, m = "getAppDirImages", v = 2)
    public static final class C00111 extends k41 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00111(i41<? super C00111> i41Var) {
            super(i41Var);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageHelper.this.getAppDirImages(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAppDirImages$2, reason: invalid class name and case insensitive filesystem */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAppDirImages$2", f = "StorageHelper.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class C00122 extends io6 implements dk2 {
        final /* synthetic */ String $dirPath;
        final /* synthetic */ bj $this_getAppDirImages;
        final /* synthetic */ ap5 $trashList;
        Object L$0;
        int label;
        final /* synthetic */ StorageHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00122(ap5 ap5Var, StorageHelper storageHelper, bj bjVar, String str, i41<? super C00122> i41Var) {
            super(2, i41Var);
            this.$trashList = ap5Var;
            this.this$0 = storageHelper;
            this.$this_getAppDirImages = bjVar;
            this.$dirPath = str;
        }

        @Override // defpackage.k00
        public final i41<t17> create(Object obj, i41<?> i41Var) {
            return new C00122(this.$trashList, this.this$0, this.$this_getAppDirImages, this.$dirPath, i41Var);
        }

        @Override // defpackage.dk2
        public final Object invoke(s51 s51Var, i41<? super t17> i41Var) {
            return ((C00122) create(s51Var, i41Var)).invokeSuspend(t17.a);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            int i = this.label;
            if (i == 0) {
                i49.b(obj);
                this.$trashList.a = new ArrayList();
                list = (List) this.$trashList.a;
                StorageHelper storageHelper = this.this$0;
                bj bjVar = this.$this_getAppDirImages;
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                uri.getClass();
                String str = this.$dirPath;
                this.L$0 = list;
                this.label = 1;
                obj = storageHelper.getAPPMediaDir(bjVar, uri, str, this);
                t51 t51Var = t51.a;
                if (obj == t51Var) {
                    return t51Var;
                }
            } else {
                if (i != 1) {
                    qj.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.L$0;
                i49.b(obj);
            }
            list.addAll((Collection) obj);
            List list2 = (List) this.$trashList.a;
            if (list2.size() > 1) {
                kv0.n(list2, new Comparator() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAppDirImages$2$invokeSuspend$$inlined$sortByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return xr9.a(Long.valueOf(((ca4) t2).e), Long.valueOf(((ca4) t).e));
                    }
                });
            }
            return t17.a;
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAppFolderImages$1, reason: invalid class name and case insensitive filesystem */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.StorageHelper$getAppFolderImages$1", f = "StorageHelper.kt", l = {79}, m = "invokeSuspend", v = 2)
    public static final class C00131 extends io6 implements dk2 {
        final /* synthetic */ String $dirPath;
        final /* synthetic */ pj2 $mediaCallback;
        final /* synthetic */ ap5 $mediaList;
        final /* synthetic */ bj $this_getAppFolderImages;
        Object L$0;
        int label;
        final /* synthetic */ StorageHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00131(ap5 ap5Var, StorageHelper storageHelper, bj bjVar, String str, pj2 pj2Var, i41<? super C00131> i41Var) {
            super(2, i41Var);
            this.$mediaList = ap5Var;
            this.this$0 = storageHelper;
            this.$this_getAppFolderImages = bjVar;
            this.$dirPath = str;
            this.$mediaCallback = pj2Var;
        }

        @Override // defpackage.k00
        public final i41<t17> create(Object obj, i41<?> i41Var) {
            return new C00131(this.$mediaList, this.this$0, this.$this_getAppFolderImages, this.$dirPath, this.$mediaCallback, i41Var);
        }

        @Override // defpackage.dk2
        public final Object invoke(s51 s51Var, i41<? super t17> i41Var) {
            return ((C00131) create(s51Var, i41Var)).invokeSuspend(t17.a);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) throws Throwable {
            ap5 ap5Var;
            int i = this.label;
            if (i == 0) {
                i49.b(obj);
                ap5Var = this.$mediaList;
                StorageHelper storageHelper = this.this$0;
                bj bjVar = this.$this_getAppFolderImages;
                String str = this.$dirPath;
                this.L$0 = ap5Var;
                this.label = 1;
                obj = storageHelper.getAppDirImages(bjVar, str, this);
                t51 t51Var = t51.a;
                if (obj == t51Var) {
                    return t51Var;
                }
            } else {
                if (i != 1) {
                    qj.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ap5Var = (ap5) this.L$0;
                i49.b(obj);
            }
            ap5Var.a = new ArrayList((Collection) obj);
            this.$mediaCallback.invoke(this.$mediaList.a);
            return t17.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getAPPMediaDir(Context context, Uri uri, String str, i41<? super List<ca4>> i41Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (i41Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) i41Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(i41Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(i41Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qj.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = (List) anonymousClass1.L$3;
            i49.b(obj);
            return list;
        }
        i49.b(obj);
        ArrayList arrayList = new ArrayList();
        kg1 kg1Var = wl1.a;
        af1 af1Var = af1.c;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, uri, arrayList, null);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = arrayList;
        anonymousClass1.label = 1;
        Object objI = mk9.i(af1Var, anonymousClass2, anonymousClass1);
        t51 t51Var = t51.a;
        return objI == t51Var ? t51Var : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getAppDirImages(bj bjVar, String str, i41<? super List<ca4>> i41Var) throws Throwable {
        C00111 c00111;
        ap5 ap5Var;
        if (i41Var instanceof C00111) {
            c00111 = (C00111) i41Var;
            int i = c00111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00111.label = i - Integer.MIN_VALUE;
            } else {
                c00111 = new C00111(i41Var);
            }
        } else {
            c00111 = new C00111(i41Var);
        }
        Object obj = c00111.result;
        int i2 = c00111.label;
        if (i2 == 0) {
            ap5 ap5VarG = fs7.g(obj);
            kg1 kg1Var = wl1.a;
            af1 af1Var = af1.c;
            C00122 c00122 = new C00122(ap5VarG, this, bjVar, str, null);
            c00111.L$0 = null;
            c00111.L$1 = null;
            c00111.L$2 = ap5VarG;
            c00111.label = 1;
            Object objI = mk9.i(af1Var, c00122, c00111);
            t51 t51Var = t51.a;
            if (objI == t51Var) {
                return t51Var;
            }
            ap5Var = ap5VarG;
        } else {
            if (i2 != 1) {
                qj.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ap5Var = (ap5) c00111.L$2;
            i49.b(obj);
        }
        return ap5Var.a;
    }

    public final void getAppFolderImages(bj bjVar, String str, pj2 pj2Var) {
        bjVar.getClass();
        str.getClass();
        pj2Var.getClass();
        ap5 ap5Var = new ap5();
        dt3 dt3VarA = kea.a(bjVar);
        kg1 kg1Var = wl1.a;
        mk9.g(dt3VarA, c54.a, null, new C00131(ap5Var, this, bjVar, str, pj2Var, null), 2);
    }

    public final String getStoragePath(Context context) {
        Collection collectionR;
        context.getClass();
        if (!new nh6(context).a()) {
            return new SP(context).getString(context, SP.FOLDER_PATH, Default.DEFAULT_FOLDER_PATH);
        }
        ContentResolver contentResolver = context.getContentResolver();
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(PreferenceKeys.SaveLocationSAFPreferenceKey, "");
        string.getClass();
        Uri uri = Uri.parse(string);
        try {
            contentResolver.takePersistableUriPermission(uri, 3);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        String absolutePath = new File(uri.getPath()).getAbsolutePath();
        absolutePath.getClass();
        List listD = new np5("/").d(absolutePath, 0);
        if (listD.isEmpty()) {
            collectionR = mv1.a;
            break;
        }
        ListIterator listIterator = listD.listIterator(listD.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                collectionR = mv1.a;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                collectionR = hv0.R(listD, listIterator.nextIndex() + 1);
                break;
            }
        }
        String[] strArr = (String[]) collectionR.toArray(new String[0]);
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (bi3.b(str, "tree")) {
                sb.append("storage/");
            } else {
                sb.append(lj6.n(str, ":", "/"));
                sb.append("/");
            }
        }
        String string2 = sb.toString();
        File file = new File(string2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return string2;
    }
}