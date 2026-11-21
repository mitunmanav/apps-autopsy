package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.af1;
import defpackage.dk2;
import defpackage.i41;
import defpackage.i49;
import defpackage.io6;
import defpackage.jl1;
import defpackage.k41;
import defpackage.kg1;
import defpackage.mk9;
import defpackage.pc1;
import defpackage.pr5;
import defpackage.qj;
import defpackage.s51;
import defpackage.t17;
import defpackage.t51;
import defpackage.wl1;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapRefectore {

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.BitmapRefectore$getBitmapAndBytes$1, reason: invalid class name */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.BitmapRefectore", f = "BitmapRefectore.kt", l = {14}, m = "getBitmapAndBytes", v = 2)
    public static final class AnonymousClass1 extends k41 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(i41<? super AnonymousClass1> i41Var) {
            super(i41Var);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BitmapRefectore.this.getBitmapAndBytes(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.BitmapRefectore$getBitmapAndBytes$2, reason: invalid class name */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.BitmapRefectore$getBitmapAndBytes$2", f = "BitmapRefectore.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends io6 implements dk2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $imageUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Uri uri, i41<? super AnonymousClass2> i41Var) {
            super(2, i41Var);
            this.$context = context;
            this.$imageUri = uri;
        }

        @Override // defpackage.k00
        public final i41<t17> create(Object obj, i41<?> i41Var) {
            return new AnonymousClass2(this.$context, this.$imageUri, i41Var);
        }

        @Override // defpackage.dk2
        public final Object invoke(s51 s51Var, i41<? super Bitmap> i41Var) {
            return ((AnonymousClass2) create(s51Var, i41Var)).invokeSuspend(t17.a);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                i49.b(obj);
                return ((pr5) ((pr5) com.bumptech.glide.a.e(this.$context.getApplicationContext()).k().G(this.$imageUri).e(jl1.b)).j(Integer.MIN_VALUE, Integer.MIN_VALUE)).J().get();
            }
            qj.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getBitmapAndBytes(Context context, Uri uri, i41<? super Bitmap> i41Var) throws Throwable {
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
        Object objI = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            i49.b(objI);
            kg1 kg1Var = wl1.a;
            af1 af1Var = af1.c;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, uri, null);
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 1;
            objI = mk9.i(af1Var, anonymousClass2, anonymousClass1);
            t51 t51Var = t51.a;
            if (objI == t51Var) {
                return t51Var;
            }
        } else {
            if (i2 != 1) {
                qj.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i49.b(objI);
        }
        objI.getClass();
        return objI;
    }
}