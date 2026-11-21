package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public class SafeNestedScrollView extends NestedScrollView {
    public SafeNestedScrollView(Context context) {
        super(context);
    }

    public SafeNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SafeNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private boolean isViewDescendantOf(View view, View view2) {
        if (view != null && view2 != null) {
            if (view == view2) {
                return true;
            }
            Object parent = view.getParent();
            if ((parent instanceof View) && isViewDescendantOf((View) parent, view2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (isViewDescendantOf(view, this) && isViewDescendantOf(view2, this)) {
            try {
                super.requestChildFocus(view, view2);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (!isViewDescendantOf(view, this)) {
            return false;
        }
        try {
            return super.requestChildRectangleOnScreen(view, rect, z);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}