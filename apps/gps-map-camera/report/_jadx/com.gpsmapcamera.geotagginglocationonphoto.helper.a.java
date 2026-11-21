package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.app.Activity;
import android.widget.RelativeLayout;
import defpackage.v6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ RelativeLayout c;
    public final /* synthetic */ v6 d;

    public /* synthetic */ a(v6 v6Var, Activity activity, RelativeLayout relativeLayout, int i) {
        this.a = i;
        this.d = v6Var;
        this.b = activity;
        this.c = relativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RelativeLayout relativeLayout = this.c;
        Activity activity = this.b;
        v6 v6Var = this.d;
        switch (i) {
            case 0:
                ((Admob.AnonymousClass1) v6Var).lambda$onAdFailedToLoad$1(activity, relativeLayout);
                break;
            default:
                ((Admob.AnonymousClass3) v6Var).lambda$onAdFailedToLoad$0(activity, relativeLayout);
                break;
        }
    }
}