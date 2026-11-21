package com.gpsmapcamera.geotagginglocationonphoto;

import defpackage.an;
import defpackage.nq5;
import defpackage.ss3;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppOpenManager_LifecycleAdapter {
    public final an a;

    public AppOpenManager_LifecycleAdapter(an anVar) {
        this.a = anVar;
    }

    public final void a(ss3 ss3Var, boolean z, nq5 nq5Var) {
        boolean z2 = nq5Var != null;
        if (!z && ss3Var == ss3.ON_START) {
            if (z2) {
                nq5Var.getClass();
                HashMap map = nq5Var.a;
                Integer num = (Integer) map.get("onStart");
                int iIntValue = num != null ? num.intValue() : 0;
                boolean z3 = (iIntValue & 1) != 0;
                map.put("onStart", Integer.valueOf(iIntValue | 1));
                if (z3) {
                    return;
                }
            }
            this.a.onStart();
        }
    }
}