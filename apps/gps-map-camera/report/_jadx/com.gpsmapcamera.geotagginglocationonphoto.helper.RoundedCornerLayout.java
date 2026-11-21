package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.itextpdf.text.pdf.ColumnText;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornerLayout extends FrameLayout {
    private static final float CORNER_RADIUS = 16.0f;
    private float cornerRadius;

    public RoundedCornerLayout(Context context) {
        super(context);
        init(context, null, 0);
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        this.cornerRadius = TypedValue.applyDimension(1, CORNER_RADIUS, context.getResources().getDisplayMetrics());
        setLayerType(1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        Path path = new Path();
        RectF rectF = new RectF(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, canvas.getWidth(), canvas.getHeight());
        float f = this.cornerRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.REPLACE);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }
}