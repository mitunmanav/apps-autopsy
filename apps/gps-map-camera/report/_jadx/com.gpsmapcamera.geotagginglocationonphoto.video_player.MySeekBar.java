package com.gpsmapcamera.geotagginglocationonphoto.video_player;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class MySeekBar extends AppCompatSeekBar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MySeekBar(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MySeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MySeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
    }

    public final void setColors(int i, int i2, int i3) {
        Drawable progressDrawable = getProgressDrawable();
        progressDrawable.getClass();
        Drawable drawableMutate = progressDrawable.mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(i2, mode);
        Drawable thumb = getThumb();
        if (thumb != null) {
            thumb.mutate().setColorFilter(i2, mode);
        }
    }
}