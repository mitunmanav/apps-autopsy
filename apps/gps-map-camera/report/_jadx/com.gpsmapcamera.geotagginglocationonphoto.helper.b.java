package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RelativeLayout b;

    public /* synthetic */ b(RelativeLayout relativeLayout, int i) {
        this.a = i;
        this.b = relativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RelativeLayout relativeLayout = this.b;
        switch (i) {
            case 0:
                relativeLayout.setVisibility(0);
                break;
            case 1:
                relativeLayout.setVisibility(8);
                break;
            default:
                relativeLayout.setVisibility(0);
                break;
        }
    }
}