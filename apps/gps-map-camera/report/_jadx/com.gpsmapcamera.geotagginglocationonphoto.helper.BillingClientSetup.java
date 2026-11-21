package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import com.android.billingclient.api.BillingClient$Builder;
import defpackage.g40;
import defpackage.ki5;
import defpackage.tt1;

/* JADX INFO: loaded from: classes.dex */
public class BillingClientSetup {
    private static g40 instance;

    public static g40 getInstance(Context context, ki5 ki5Var) {
        g40 g40Var = instance;
        return g40Var == null ? setupBillingClient(context, ki5Var) : g40Var;
    }

    private static g40 setupBillingClient(Context context, ki5 ki5Var) {
        BillingClient$Builder billingClient$Builder = new BillingClient$Builder(context);
        billingClient$Builder.a = new tt1(14);
        billingClient$Builder.c = ki5Var;
        return billingClient$Builder.a();
    }
}