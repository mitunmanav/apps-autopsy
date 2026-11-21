package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class DynamicUnitUtils {
    public static int convertDpToPixels(float f) {
        return Math.round(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
    }

    public static int convertDpToSp(float f) {
        return Math.round(convertDpToPixels(f) / convertSpToPixels(f));
    }

    public static int convertPixelsToDp(int i) {
        return Math.round(i / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int convertPixelsToSp(int i) {
        return Math.round(i / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int convertSpToPixels(float f) {
        return Math.round(TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics()));
    }
}