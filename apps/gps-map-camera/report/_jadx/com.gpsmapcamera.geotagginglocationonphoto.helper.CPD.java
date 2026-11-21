package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Ju.NKqVA;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import defpackage.i5;
import defpackage.m8;
import defpackage.pc;
import defpackage.qc;

/* JADX INFO: loaded from: classes.dex */
public class CPD {
    static qc alertDialog;
    static pc builder;

    public static void DismissDialog() {
        defpackage.c cVar = new defpackage.c(8);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lambda$DismissDialog$2();
        } else {
            new Handler(Looper.getMainLooper()).post(cVar);
        }
    }

    public static void ShowDialog(Activity activity) {
        i5 i5Var = new i5(1, activity);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            i5Var.run();
        } else {
            new Handler(Looper.getMainLooper()).post(i5Var);
        }
    }

    public static void ShowDialog(Activity activity, String str) {
        m8 m8Var = new m8(24, activity, str);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m8Var.run();
        } else {
            new Handler(Looper.getMainLooper()).post(m8Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$DismissDialog$2() {
        try {
            qc qcVar = alertDialog;
            if (qcVar != null && qcVar.isShowing()) {
                Context context = alertDialog.getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (!activity.isFinishing() && !activity.isDestroyed()) {
                        alertDialog.dismiss();
                    }
                } else {
                    alertDialog.dismiss();
                }
            }
        } catch (IllegalArgumentException e) {
            Log.e("CPD", "IllegalArgumentException dismissing dialog", e);
        } catch (Exception e2) {
            Log.e("CPD", "Error dismissing dialog", e2);
        } finally {
            alertDialog = null;
            builder = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ShowDialog$0(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        DismissDialog();
        builder = new pc(activity);
        builder.setView(LayoutInflater.from(activity).inflate(R.layout.custom_progress, (ViewGroup) activity.findViewById(android.R.id.content), false));
        builder.a(false);
        qc qcVarCreate = builder.create();
        alertDialog = qcVarCreate;
        if (qcVarCreate.isShowing()) {
            return;
        }
        try {
            alertDialog.show();
        } catch (Exception e) {
            Log.e("CPD", "Error showing dialog", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ShowDialog$1(Activity activity, String str) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        DismissDialog();
        builder = new pc(activity);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.custom_progress, (ViewGroup) activity.findViewById(android.R.id.content), false);
        ((TextView) viewInflate.findViewById(R.id.loading_msg)).setText(str);
        builder.setView(viewInflate);
        builder.a(false);
        qc qcVarCreate = builder.create();
        alertDialog = qcVarCreate;
        if (qcVarCreate.isShowing()) {
            return;
        }
        try {
            alertDialog.show();
        } catch (Exception e) {
            Log.e(NKqVA.cnBiXekpdLR, "Error showing dialog", e);
        }
    }
}