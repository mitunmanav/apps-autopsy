package com.gpsmapcamera.geotagginglocationonphoto.helper;

import defpackage.df5;
import defpackage.ji5;
import defpackage.l40;
import defpackage.pj5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ji5, df5 {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ c(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.ji5
    public void a(l40 l40Var, List list) {
        ((PurchaseHelper.AnonymousClass3) this.a).lambda$run$0(l40Var, list);
    }

    @Override // defpackage.df5
    public void onProductDetailsResponse(l40 l40Var, pj5 pj5Var) {
        ((PurchaseHelper.AnonymousClass4) this.a).lambda$run$0(l40Var, pj5Var);
    }
}