package com.gpsmapcamera.geotagginglocationonphoto.dragView;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.FileName_Activity;
import com.itextpdf.text.pdf.ColumnText;
import defpackage.e4;
import defpackage.n60;
import defpackage.qj;
import defpackage.tn1;
import defpackage.un1;
import defpackage.vn1;
import defpackage.wn1;
import defpackage.xn1;
import defpackage.y82;
import defpackage.yn1;
import defpackage.zj5;
import defpackage.zn1;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class DragLinearLayout extends LinearLayout {
    public static final /* synthetic */ int n = 0;
    public final float a;
    public zn1 b;
    public final SparseArray c;
    public final xn1 d;
    public final int e;
    public int f;
    public int g;
    public final Drawable h;
    public final Drawable i;
    public final int j;
    public ScrollView k;
    public int l;
    public vn1 m;

    public DragLinearLayout(Context context) {
        this(context, null);
    }

    public DragLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.g = -1;
        setOrientation(1);
        this.c = new SparseArray();
        this.d = new xn1(this);
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        Resources resources = getResources();
        this.h = context.getDrawable(R.drawable.ab_solid_shadow_holo_flipped);
        this.i = context.getDrawable(R.drawable.ab_solid_shadow_holo);
        this.j = resources.getDimensionPixelSize(R.dimen._16dp);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zj5.a, 0, 0);
        try {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f));
            typedArrayObtainStyledAttributes.recycle();
            this.a = (int) ((resources.getDisplayMetrics().density * 20.0f) + 0.5f);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static float c(float f, float f2, float f3) {
        float fMax = Math.max(ColumnText.GLOBAL_SPACE_CHAR_RATIO, Math.min((f3 - f) / (f2 - f), 1.0f));
        return ((((6.0f * fMax) - 15.0f) * fMax) + 10.0f) * fMax * fMax * fMax;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    public final void a(int i) {
        boolean z;
        int i2;
        float fC;
        float f;
        xn1 xn1Var = this.d;
        xn1Var.g = i;
        xn1Var.h = (xn1Var.e - xn1Var.a.getTop()) + xn1Var.g;
        invalidate();
        int i3 = xn1Var.e + xn1Var.g;
        int i4 = (xn1Var.f / 2) + i3;
        ScrollView scrollView = this.k;
        boolean z2 = false;
        if (scrollView != null) {
            int scrollY = scrollView.getScrollY();
            int top = (getTop() - scrollY) + i3;
            int height = this.k.getHeight();
            int i5 = this.l;
            if (top < i5) {
                fC = c(i5, ColumnText.GLOBAL_SPACE_CHAR_RATIO, top);
                f = -16.0f;
            } else {
                int i6 = height - i5;
                if (top > i6) {
                    fC = c(i6, height, top);
                    f = 16.0f;
                } else {
                    i2 = 0;
                }
                this.k.removeCallbacks(this.m);
                this.k.smoothScrollBy(0, i2);
                vn1 vn1Var = new vn1(this, scrollY, i2);
                this.m = vn1Var;
                this.k.post(vn1Var);
            }
            i2 = (int) (fC * f);
            this.k.removeCallbacks(this.m);
            this.k.smoothScrollBy(0, i2);
            vn1 vn1Var2 = new vn1(this, scrollY, i2);
            this.m = vn1Var2;
            this.k.post(vn1Var2);
        }
        int i7 = xn1Var.d;
        SparseArray sparseArray = this.c;
        int iIndexOfKey = sparseArray.indexOfKey(i7);
        int iKeyAt = -1;
        int iKeyAt2 = (iIndexOfKey < -1 || iIndexOfKey > sparseArray.size() + (-2)) ? -1 : sparseArray.keyAt(iIndexOfKey + 1);
        int iIndexOfKey2 = sparseArray.indexOfKey(xn1Var.d);
        if (iIndexOfKey2 >= 1 && iIndexOfKey2 <= sparseArray.size()) {
            iKeyAt = sparseArray.keyAt(iIndexOfKey2 - 1);
        }
        View childAt = getChildAt(iKeyAt2);
        View childAt2 = getChildAt(iKeyAt);
        if (childAt != null) {
            if (i4 > (childAt.getHeight() / 2) + childAt.getTop()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (childAt2 != null) {
            if (i4 < (childAt2.getHeight() / 2) + childAt2.getTop()) {
                z2 = true;
            }
        }
        if (z || z2) {
            View view = z ? childAt : childAt2;
            int i8 = iKeyAt;
            int i9 = xn1Var.d;
            if (!z) {
                iKeyAt2 = i8;
            }
            ObjectAnimator objectAnimator = ((yn1) sparseArray.get(iKeyAt2)).a;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float y = view.getY();
            zn1 zn1Var = this.b;
            if (zn1Var != null) {
                View view2 = xn1Var.a;
                int i10 = xn1Var.d;
                FileName_Activity fileName_Activity = ((y82) zn1Var).a;
                int i11 = FileName_Activity.D0;
                view2.setTag(Integer.valueOf(iKeyAt2));
                view.setTag(Integer.valueOf(i10));
                Collections.swap(fileName_Activity.G, iKeyAt2, i10);
                fileName_Activity.N();
            }
            if (z) {
                removeViewAt(i9);
                removeViewAt(iKeyAt2 - 1);
                addView(childAt, i9);
                addView(xn1Var.a, iKeyAt2);
            } else {
                removeViewAt(iKeyAt2);
                removeViewAt(i9 - 1);
                addView(xn1Var.a, iKeyAt2);
                addView(childAt2, i9);
            }
            xn1Var.d = iKeyAt2;
            View view3 = view;
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new tn1(this, viewTreeObserver, view3, y, i9));
            ViewTreeObserver viewTreeObserver2 = xn1Var.a.getViewTreeObserver();
            viewTreeObserver2.addOnPreDrawListener(new un1(this, viewTreeObserver2));
        }
    }

    public final void b() {
        xn1 xn1Var = this.d;
        int i = xn1Var.g;
        ValueAnimator duration = ValueAnimator.ofFloat(i, i - xn1Var.h).setDuration(Math.min(300L, Math.max(150L, (long) ((Math.abs(xn1Var.h) * 150.0f) / this.a))));
        xn1Var.i = duration;
        duration.addUpdateListener(new n60(1, this));
        xn1Var.i.addListener(new e4(4, this));
        xn1Var.i.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xn1 xn1Var = this.d;
        if (xn1Var.j) {
            if (xn1Var.k || xn1Var.i != null) {
                canvas.save();
                canvas.translate(ColumnText.GLOBAL_SPACE_CHAR_RATIO, xn1Var.g);
                xn1Var.c.draw(canvas);
                int i = xn1Var.c.getBounds().left;
                int i2 = xn1Var.c.getBounds().right;
                int i3 = xn1Var.c.getBounds().top;
                int i4 = xn1Var.c.getBounds().bottom;
                int i5 = this.j;
                Drawable drawable = this.i;
                drawable.setBounds(i, i4, i2, i4 + i5);
                drawable.draw(canvas);
                Drawable drawable2 = this.h;
                if (drawable2 != null) {
                    drawable2.setBounds(i, i3 - i5, i2, i3);
                    drawable2.draw(canvas);
                }
                canvas.restore();
            }
        }
    }

    public int getScrollSensitiveHeight() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        xn1 xn1Var = this.d;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f = -1;
                this.g = -1;
                if (xn1Var.j) {
                    xn1Var.a();
                    return false;
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3 || (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.g)) {
                    this.f = -1;
                    this.g = -1;
                    if (xn1Var.j) {
                        xn1Var.a();
                        return false;
                    }
                }
            } else if (xn1Var.j && -1 != (i = this.g) && Math.abs(motionEvent.getY(motionEvent.findPointerIndex(i)) - this.f) > this.e) {
                xn1Var.a.setVisibility(4);
                xn1Var.k = true;
                requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (!xn1Var.j) {
            this.f = (int) motionEvent.getY(0);
            this.g = motionEvent.getPointerId(0);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r7.getPointerId(r7.getActionIndex()) != r6.g) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        xn1 xn1Var = this.d;
        if (actionMasked == 0) {
            if (!xn1Var.j || xn1Var.i != null) {
                return false;
            }
            xn1Var.a.setVisibility(4);
            xn1Var.k = true;
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                    }
                }
            } else if (xn1Var.k && -1 != (i = this.g)) {
                a(((int) motionEvent.getY(motionEvent.findPointerIndex(i))) - this.f);
                return true;
            }
        }
        this.f = -1;
        this.g = -1;
        if (xn1Var.k) {
            b();
            return true;
        }
        if (xn1Var.j) {
            xn1Var.a();
        }
        return true;
        return false;
    }

    public void setContainerScrollView(ScrollView scrollView) {
        this.k = scrollView;
    }

    public void setOnViewSwapListener(zn1 zn1Var) {
        this.b = zn1Var;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 0) {
            super.setOrientation(i);
        } else {
            qj.h("DragLinearLayout must be VERTICAL.");
        }
    }

    public void setScrollSensitiveHeight(int i) {
        this.l = i;
    }

    public void setViewDraggable(View view, View view2) {
        if (this == view.getParent()) {
            view2.setOnTouchListener(new wn1(this, view, 0));
            this.c.put(indexOfChild(view), new yn1());
            return;
        }
        Log.e("DragLinearLayout", view + " is not a child, cannot make draggable.");
    }
}