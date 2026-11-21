package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.itextpdf.text.pdf.ColumnText;

/* JADX INFO: loaded from: classes.dex */
public final class GeneralUtils {
    private GeneralUtils() {
    }

    public static Bitmap generateCircularBitmap(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Path path = new Path();
        int i = height / 2;
        path.addCircle(width / 2, i, Math.min(width, i), Path.Direction.CCW);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, (Paint) null);
        return bitmapCreateBitmap;
    }
}