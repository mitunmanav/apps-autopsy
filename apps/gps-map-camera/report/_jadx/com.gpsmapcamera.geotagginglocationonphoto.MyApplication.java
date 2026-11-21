package com.gpsmapcamera.geotagginglocationonphoto;

import android.app.Application;
import androidx.media.LPcH.FSXa;
import com.pairip.StartupLauncher;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class MyApplication extends Application {
    public static MyApplication a;

    static {
        StartupLauncher.launch();
    }

    public static MyApplication a() {
        MyApplication myApplication = a;
        if (myApplication != null) {
            return myApplication;
        }
        MyApplication myApplication2 = new MyApplication();
        a = myApplication2;
        return myApplication2;
    }

    @Override // android.app.Application
    public final void onCreate() throws IllegalAccessException, InvocationTargetException {
        FSXa.AEAeUhkojY.invoke(null, this);
    }
}