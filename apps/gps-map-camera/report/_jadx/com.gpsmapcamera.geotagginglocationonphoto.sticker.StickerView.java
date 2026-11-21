package com.gpsmapcamera.geotagginglocationonphoto.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentParser;
import defpackage.ci4;
import defpackage.h50;
import defpackage.ig4;
import defpackage.le0;
import defpackage.mg4;
import defpackage.od3;
import defpackage.ur6;
import defpackage.vg6;
import defpackage.xg6;
import defpackage.zj5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StickerView extends FrameLayout {
    public final Context A;
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final RectF e;
    public final Matrix f;
    public final Matrix g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final PointF k;
    public final float[] l;
    public final int m;
    public boolean n;
    public boolean o;
    public PointF p;
    public h50 q;
    public float r;
    public float s;
    public float t;
    public float u;
    public int v;
    public vg6 w;
    public le0 x;
    public long y;
    public final int z;

    public StickerView(Context context) {
        this(context, null);
    }

    public StickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        this.c = new ArrayList(4);
        Paint paint = new Paint();
        this.d = paint;
        this.e = new RectF();
        new Matrix();
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = new float[8];
        this.i = new float[8];
        this.j = new float[2];
        this.k = new PointF();
        this.l = new float[2];
        this.p = new PointF();
        this.t = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        this.u = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        this.v = 0;
        this.y = 0L;
        this.z = PdfContentParser.COMMAND_TYPE;
        this.A = context;
        this.m = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zj5.d);
            this.n = typedArrayObtainStyledAttributes.getBoolean(4, false);
            this.o = typedArrayObtainStyledAttributes.getBoolean(3, false);
            this.a = typedArrayObtainStyledAttributes.getBoolean(2, false);
            paint.setAntiAlias(true);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#ffffff")));
            e();
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    public static float b(float f, float f2, float f3, float f4) {
        double d = f - f3;
        double d2 = f2 - f4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static float c(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() < 2 ? ColumnText.GLOBAL_SPACE_CHAR_RATIO : b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
    }

    public static float d(float f, float f2, float f3, float f4) {
        return (float) Math.toDegrees(Math.atan2(f2 - f4, f - f3));
    }

    public static void f(h50 h50Var, float f, float f2, float f3) {
        h50Var.m = f;
        h50Var.n = f2;
        Matrix matrix = h50Var.g;
        matrix.reset();
        Drawable drawable = h50Var.j;
        matrix.postRotate(f3, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
        matrix.postTranslate(f - (drawable.getIntrinsicWidth() / 2), f2 - (drawable.getIntrinsicHeight() / 2));
    }

    public final void a(ur6 ur6Var) {
        float width = getWidth();
        float height = getHeight();
        int iD = ur6Var.d();
        Matrix matrix = ur6Var.g;
        matrix.postTranslate((width - iD) / 2.0f, (height - ur6Var.c()) / 2.0f);
        float width2 = getWidth();
        Drawable drawable = ur6Var.m;
        float intrinsicWidth = width2 / drawable.getIntrinsicWidth();
        float height2 = getHeight() / drawable.getIntrinsicHeight();
        if (intrinsicWidth > height2) {
            intrinsicWidth = height2;
        }
        float f = intrinsicWidth / 2.0f;
        matrix.postScale(f, f, getWidth() / 2, getHeight() / 2);
        this.w = ur6Var;
        this.b.add(ur6Var);
        le0 le0Var = this.x;
        if (le0Var != null) {
            le0Var.a.G0();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        StickerView stickerView = this;
        super.dispatchDraw(canvas);
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = stickerView.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            vg6 vg6Var = (vg6) arrayList.get(i2);
            if (vg6Var != null) {
                vg6Var.a(canvas);
            }
            i2++;
        }
        vg6 vg6Var2 = stickerView.w;
        if (vg6Var2 == null) {
            return;
        }
        if (!stickerView.o && !stickerView.n) {
            return;
        }
        float[] fArr = stickerView.i;
        vg6Var2.b(fArr);
        Matrix matrix = vg6Var2.g;
        float[] fArr2 = stickerView.h;
        matrix.mapPoints(fArr2, fArr);
        float f7 = fArr2[0];
        int i3 = 1;
        float f8 = fArr2[1];
        float f9 = fArr2[2];
        float f10 = fArr2[3];
        float f11 = fArr2[4];
        float f12 = fArr2[5];
        float f13 = fArr2[6];
        float f14 = fArr2[7];
        boolean z = stickerView.o;
        Paint paint = stickerView.d;
        if (z) {
            canvas.drawLine(f7, f8, f9, f10, paint);
            canvas.drawLine(f7, f8, f11, f12, paint);
            canvas.drawLine(f9, f10, f13, f14, paint);
            f2 = f9;
            f = f13;
            f3 = f11;
            f5 = f10;
            f4 = f14;
            f6 = f12;
            canvas.drawLine(f, f4, f3, f6, paint);
        } else {
            f = f13;
            f2 = f9;
            f3 = f11;
            f4 = f14;
            f5 = f10;
            f6 = f12;
        }
        if (!stickerView.n) {
            return;
        }
        float fD = d(f, f4, f3, f6);
        while (true) {
            ArrayList arrayList2 = stickerView.c;
            if (i >= arrayList2.size()) {
                return;
            }
            h50 h50Var = (h50) arrayList2.get(i);
            int i4 = h50Var.o;
            if (i4 == 0) {
                f(h50Var, f7, f8, fD);
            } else if (i4 == i3) {
                f(h50Var, f2, f5, fD);
            } else if (i4 == 2) {
                f(h50Var, f3, f6, fD);
            } else if (i4 == 3) {
                f(h50Var, f, f4, fD);
            }
            float fDpToPx = HelperClass.dpToPx(h50Var.q, 14);
            h50Var.l = fDpToPx;
            canvas.drawCircle(h50Var.m, h50Var.n, fDpToPx, paint);
            canvas.save();
            canvas.concat(h50Var.g);
            Drawable drawable = h50Var.j;
            drawable.setBounds(h50Var.k);
            drawable.draw(canvas);
            canvas.restore();
            i++;
            stickerView = this;
            i3 = 1;
        }
    }

    public final void e() {
        Drawable drawable = getContext().getDrawable(R.drawable.duv2_ic_delete_sticker);
        Context context = this.A;
        h50 h50Var = new h50(drawable, 0, context);
        StringBuilder sb = new StringBuilder("check//.....  delete 2  : ");
        int i = 10;
        sb.append(new ig4(i));
        Log.i("TAG", sb.toString());
        h50Var.p = new ig4(i);
        h50 h50Var2 = new h50(getContext().getDrawable(R.drawable.duv2_ic_stretch_sticker), 3, context);
        StringBuilder sb2 = new StringBuilder("check//.....  zoomIcon 2  : ");
        int i2 = 18;
        sb2.append(new mg4(i2));
        Log.i("TAG", sb2.toString());
        h50Var2.p = new mg4(i2);
        h50 h50Var3 = new h50(getContext().getDrawable(R.drawable.duv2_ic_flip_sticker), 1, context);
        StringBuilder sb3 = new StringBuilder("check//.....  flipIcon 2  : ");
        int i3 = 12;
        sb3.append(new od3(i3));
        Log.i("TAG", sb3.toString());
        h50Var3.p = new od3(i3);
        h50 h50Var4 = new h50(getContext().getDrawable(R.drawable.ic_edit_sticker), 2, context);
        Log.i("TAG", "check//.....  flipIcon 2  : " + new ci4(i));
        h50Var4.p = new ci4(i);
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(h50Var);
        arrayList.add(h50Var2);
        arrayList.add(h50Var3);
        arrayList.add(h50Var4);
    }

    public final Bitmap g() {
        this.w = null;
        if (getWidth() <= 0 || getHeight() <= 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(bitmapCreateBitmap2));
        return bitmapCreateBitmap2;
    }

    public vg6 getCurrentSticker() {
        return this.w;
    }

    public List<h50> getIcons() {
        return this.c;
    }

    public int getMinClickDelayTime() {
        return this.z;
    }

    public xg6 getOnStickerOperationListener() {
        return this.x;
    }

    public int getStickerCount() {
        return this.b.size();
    }

    public final h50 h() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h50 h50Var = (h50) obj;
            float f = h50Var.m - this.r;
            float f2 = h50Var.n - this.s;
            double d = (f2 * f2) + (f * f);
            float f3 = h50Var.l;
            if (d <= Math.pow(f3 + f3, 2.0d)) {
                return h50Var;
            }
        }
        return null;
    }

    public final vg6 i() {
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j((vg6) arrayList.get(size), this.r, this.s)) {
                return (vg6) arrayList.get(size);
            }
        }
        return null;
    }

    public final boolean j(vg6 vg6Var, float f, float f2) {
        float[] fArr = this.l;
        fArr[0] = f;
        fArr[1] = f2;
        vg6Var.getClass();
        Matrix matrix = new Matrix();
        Matrix matrix2 = vg6Var.g;
        float[] fArr2 = vg6Var.a;
        matrix2.getValues(fArr2);
        double d = fArr2[1];
        matrix2.getValues(fArr2);
        matrix.setRotate(-((float) Math.toDegrees(-Math.atan2(d, fArr2[0]))));
        float[] fArr3 = vg6Var.d;
        vg6Var.b(fArr3);
        float[] fArr4 = vg6Var.e;
        matrix2.mapPoints(fArr4, fArr3);
        float[] fArr5 = vg6Var.b;
        matrix.mapPoints(fArr5, fArr4);
        float[] fArr6 = vg6Var.c;
        matrix.mapPoints(fArr6, fArr);
        RectF rectF = vg6Var.f;
        rectF.set(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr5.length; i += 2) {
            float fRound = Math.round(fArr5[i - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr5[i] * 10.0f) / 10.0f;
            float f3 = rectF.left;
            if (fRound < f3) {
                f3 = fRound;
            }
            rectF.left = f3;
            float f4 = rectF.top;
            if (fRound2 < f4) {
                f4 = fRound2;
            }
            rectF.top = f4;
            float f5 = rectF.right;
            if (fRound <= f5) {
                fRound = f5;
            }
            rectF.right = fRound;
            float f6 = rectF.bottom;
            if (fRound2 <= f6) {
                fRound2 = f6;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF.contains(fArr6[0], fArr6[1]);
    }

    public final void k(MotionEvent motionEvent) {
        if (this.w != null) {
            PointF pointF = this.p;
            float fB = b(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
            PointF pointF2 = this.p;
            float fD = d(pointF2.x, pointF2.y, motionEvent.getX(), motionEvent.getY());
            Matrix matrix = this.f;
            Matrix matrix2 = this.g;
            matrix2.set(matrix);
            float f = fB / this.t;
            PointF pointF3 = this.p;
            matrix2.postScale(f, f, pointF3.x, pointF3.y);
            float f2 = fD - this.u;
            PointF pointF4 = this.p;
            matrix2.postRotate(f2, pointF4.x, pointF4.y);
            this.w.g.set(matrix2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.r = motionEvent.getX();
        this.s = motionEvent.getY();
        return (h() == null && i() == null) ? false : true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            RectF rectF = this.e;
            rectF.left = i;
            rectF.top = i2;
            rectF.right = i3;
            rectF.bottom = i4;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.i("StickerView", "onSizeChanged: .....................");
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i5 >= arrayList.size()) {
                return;
            }
            i5++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PointF pointF;
        le0 le0Var;
        vg6 vg6Var;
        h50 h50Var;
        h50 h50Var2;
        PointF pointF2;
        le0 le0Var2;
        int actionMasked = motionEvent.getActionMasked();
        this.o = true;
        this.n = true;
        float[] fArr = this.l;
        float[] fArr2 = this.j;
        Matrix matrix = this.f;
        float f = ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.v;
                    Matrix matrix2 = this.g;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 && this.w != null && (h50Var2 = this.q) != null) {
                                h50Var2.f(this, motionEvent);
                            }
                        } else if (this.w != null) {
                            float fC = c(motionEvent) / this.t;
                            new RectF();
                            vg6 vg6Var2 = this.w;
                            vg6Var2.getClass();
                            RectF rectF = new RectF();
                            RectF rectF2 = new RectF();
                            rectF2.set(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, vg6Var2.d(), vg6Var2.c());
                            vg6Var2.g.mapRect(rectF, rectF2);
                            float fWidth = rectF.width();
                            float fHeight = rectF.height();
                            matrix.getValues(new float[9]);
                            if (fWidth * fC < 150.0f || fHeight * fC < 100.0f) {
                                fC = Math.max(150.0f / fWidth, 100.0f / fHeight);
                            }
                            matrix2.set(matrix);
                            PointF pointF3 = this.p;
                            matrix2.postScale(fC, fC, pointF3.x, pointF3.y);
                            this.w.g.set(matrix2);
                        }
                    } else if (this.w != null) {
                        matrix2.set(matrix);
                        matrix2.postTranslate(motionEvent.getX() - this.r, motionEvent.getY() - this.s);
                        this.w.g.set(matrix2);
                        vg6 vg6Var3 = this.w;
                        int width = getWidth();
                        int height = getHeight();
                        int iD = vg6Var3.d();
                        Matrix matrix3 = vg6Var3.g;
                        float fC2 = (vg6Var3.c() * 1.0f) / 2.0f;
                        PointF pointF4 = this.k;
                        pointF4.set((iD * 1.0f) / 2.0f, fC2);
                        fArr[0] = pointF4.x;
                        fArr[1] = pointF4.y;
                        matrix3.mapPoints(fArr2, fArr);
                        pointF4.set(fArr2[0], fArr2[1]);
                        float f2 = pointF4.x;
                        float f3 = f2 < ColumnText.GLOBAL_SPACE_CHAR_RATIO ? -f2 : 0.0f;
                        float f4 = width;
                        if (f2 > f4) {
                            f3 = f4 - f2;
                        }
                        float f5 = pointF4.y;
                        if (f5 < ColumnText.GLOBAL_SPACE_CHAR_RATIO) {
                            f = -f5;
                        }
                        float f6 = height;
                        if (f5 > f6) {
                            f = f6 - f5;
                        }
                        matrix3.postTranslate(f3, f);
                    }
                    invalidate();
                    return true;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            if (this.v == 2 && this.w != null && (le0Var2 = this.x) != null) {
                                le0Var2.a.G0();
                            }
                            this.v = 0;
                            return true;
                        }
                    } else if (motionEvent.getPointerCount() >= 2) {
                        this.t = c(motionEvent);
                        this.u = motionEvent.getPointerCount() < 2 ? 0.0f : d(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                        if (motionEvent.getPointerCount() < 2) {
                            this.p.set(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
                            pointF2 = this.p;
                        } else {
                            this.p.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
                            pointF2 = this.p;
                        }
                        this.p = pointF2;
                        if (this.w != null && h() == null && j(this.w, motionEvent.getX(1), motionEvent.getY(1))) {
                            this.v = 2;
                            return true;
                        }
                    }
                }
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.v == 3 && (h50Var = this.q) != null && this.w != null) {
                h50Var.g(this, motionEvent);
            }
            if (this.v == 1) {
                float fAbs = Math.abs(motionEvent.getX() - this.r);
                float f7 = this.m;
                if (fAbs < f7 && Math.abs(motionEvent.getY() - this.s) < f7 && (vg6Var = this.w) != null) {
                    this.v = 4;
                    le0 le0Var3 = this.x;
                    if (jUptimeMillis - this.y < this.z && le0Var3 != null) {
                        le0Var3.c(vg6Var);
                    }
                }
            }
            if (this.v == 1 && this.w != null && (le0Var = this.x) != null) {
                le0Var.a.G0();
            }
            this.y = jUptimeMillis;
            this.v = 0;
            return true;
        }
        ArrayList arrayList = this.b;
        try {
            this.v = 1;
            this.r = motionEvent.getX();
            this.s = motionEvent.getY();
            vg6 vg6Var4 = this.w;
            PointF pointF5 = this.p;
            if (vg6Var4 == null) {
                pointF5.set(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
                pointF = this.p;
            } else {
                pointF5.set((vg6Var4.d() * 1.0f) / 2.0f, (vg6Var4.c() * 1.0f) / 2.0f);
                fArr[0] = pointF5.x;
                fArr[1] = pointF5.y;
                vg6Var4.g.mapPoints(fArr2, fArr);
                pointF5.set(fArr2[0], fArr2[1]);
                pointF = this.p;
            }
            this.p = pointF;
            this.t = b(pointF.x, pointF.y, this.r, this.s);
            PointF pointF6 = this.p;
            this.u = d(pointF6.x, pointF6.y, this.r, this.s);
            h50 h50VarH = h();
            this.q = h50VarH;
            if (h50VarH != null) {
                this.v = 3;
                h50VarH.m(this, motionEvent);
            } else {
                this.w = i();
            }
            vg6 vg6Var5 = this.w;
            if (vg6Var5 != null) {
                matrix.set(vg6Var5.g);
                if (this.a) {
                    arrayList.remove(this.w);
                    arrayList.add(this.w);
                }
                if (this.x != null) {
                    this.w.getClass();
                }
            }
            if (this.q == null && this.w == null) {
                return false;
            }
            invalidate();
        } catch (NullPointerException e) {
            Log.e("TAG", "ERROR>>>>    898965 : " + e.getMessage());
        }
        return true;
    }

    public void setIcons(List<h50> list) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.addAll(list);
        invalidate();
    }

    public void setShowBorder(boolean z) {
        this.o = z;
        this.n = z;
        invalidate();
    }
}