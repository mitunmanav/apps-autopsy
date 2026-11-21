package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.os.SystemClock;
import android.view.View;
import com.itextpdf.awt.PdfGraphics2D;

/* JADX INFO: loaded from: classes.dex */
public abstract class SingleClickListener implements View.OnClickListener {
    protected int defaultInterval;
    private long lastTimeClicked;

    public SingleClickListener() {
        this(PdfGraphics2D.AFM_DIVISOR);
    }

    public SingleClickListener(int i) {
        this.lastTimeClicked = 0L;
        this.defaultInterval = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.lastTimeClicked < this.defaultInterval) {
            return;
        }
        this.lastTimeClicked = SystemClock.elapsedRealtime();
        performClick(view);
    }

    public abstract void performClick(View view);
}