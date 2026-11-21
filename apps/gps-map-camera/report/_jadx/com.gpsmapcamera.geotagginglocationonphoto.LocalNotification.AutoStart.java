package com.gpsmapcamera.geotagginglocationonphoto.LocalNotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.gpsmapcamera.geotagginglocationonphoto.activity.Splash_Screen;
import defpackage.ub9;

/* JADX INFO: loaded from: classes.dex */
public class AutoStart extends BroadcastReceiver {
    public final AlarmReceiver a = new AlarmReceiver();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Intent intent2 = new Intent(context, (Class<?>) Splash_Screen.class);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent2);
            } else {
                context.startService(intent2);
            }
            long jA = ub9.a(context);
            this.a.getClass();
            AlarmReceiver.a(context, jA, 51);
        }
    }
}