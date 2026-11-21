package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.itextpdf.text.pdf.PdfContentParser;
import defpackage.zj5;

/* JADX INFO: loaded from: classes.dex */
public class MaxHeightScrollView extends SafeNestedScrollView {
    private final int defaultHeight;
    private int maxHeight;

    public MaxHeightScrollView(Context context) {
        super(context);
        this.defaultHeight = PdfContentParser.COMMAND_TYPE;
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.defaultHeight = PdfContentParser.COMMAND_TYPE;
        if (isInEditMode()) {
            return;
        }
        init(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defaultHeight = PdfContentParser.COMMAND_TYPE;
        if (isInEditMode()) {
            return;
        }
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zj5.b);
            this.maxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, PdfContentParser.COMMAND_TYPE);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.maxHeight, Integer.MIN_VALUE));
    }
}