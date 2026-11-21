package com.gpsmapcamera.geotagginglocationonphoto.Gallery.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.gt0;
import defpackage.ht0;
import defpackage.it0;

/* JADX INFO: loaded from: classes.dex */
public class ClickableViewPager extends ViewPager {
    public static final /* synthetic */ int g0 = 0;

    public ClickableViewPager(Context context) {
        super(context);
        setOnTouchListener(new gt0(0, new GestureDetector(getContext(), new it0(this))));
    }

    public ClickableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(new gt0(0, new GestureDetector(getContext(), new it0(this))));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void setOnItemClickListener(ht0 ht0Var) {
    }
}