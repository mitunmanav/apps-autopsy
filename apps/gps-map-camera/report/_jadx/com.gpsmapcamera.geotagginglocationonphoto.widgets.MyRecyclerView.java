package com.gpsmapcamera.geotagginglocationonphoto.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.itextpdf.text.pdf.ColumnText;
import defpackage.b5;
import defpackage.dm4;
import defpackage.em4;
import defpackage.fm4;
import defpackage.fn5;
import defpackage.k54;
import defpackage.no5;
import defpackage.qj;
import defpackage.ul0;
import defpackage.xn5;

/* JADX INFO: loaded from: classes.dex */
public class MyRecyclerView extends RecyclerView {
    public static final /* synthetic */ int f1 = 0;
    public final long L0;
    public boolean M0;
    public boolean N0;
    public final Handler O0;
    public final ScaleGestureDetector P0;
    public boolean Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public final int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public boolean a1;
    public boolean b1;
    public float c1;
    public long d1;
    public final b5 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyRecyclerView(Context context) {
        super(context);
        context.getClass();
        this.L0 = 25L;
        this.O0 = new Handler(Looper.getMainLooper());
        this.R0 = -1;
        this.c1 = 1.0f;
        this.V0 = 16;
        if (getLayoutManager() instanceof LinearLayoutManager) {
            xn5 layoutManager = getLayoutManager();
            layoutManager.getClass();
        }
        this.P0 = new ScaleGestureDetector(getContext(), new ul0(new k54(27, this)));
        this.e1 = new b5(29, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.L0 = 25L;
        this.O0 = new Handler(Looper.getMainLooper());
        this.R0 = -1;
        this.c1 = 1.0f;
        this.V0 = 16;
        if (getLayoutManager() instanceof LinearLayoutManager) {
            xn5 layoutManager = getLayoutManager();
            layoutManager.getClass();
        }
        this.P0 = new ScaleGestureDetector(getContext(), new ul0(new k54(27, this)));
        this.e1 = new b5(29, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r0 != 3) goto L64;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iB;
        motionEvent.getClass();
        if (!this.Q0) {
            try {
                super.dispatchTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        int action = motionEvent.getAction();
        b5 b5Var = this.e1;
        Handler handler = this.O0;
        if (action != 1) {
            if (action == 2) {
                if (this.Q0) {
                    View viewE = E(motionEvent.getX(), motionEvent.getY());
                    if (viewE == null) {
                        iB = -1;
                    } else {
                        if (viewE.getTag() == null || !(viewE.getTag() instanceof no5)) {
                            qj.l("Make sure your adapter makes a call to super.onBindViewHolder(), and doesn't override itemView tags.");
                            return false;
                        }
                        Object tag = viewE.getTag();
                        tag.getClass();
                        iB = ((no5) tag).b();
                    }
                    if (this.V0 > -1) {
                        float f = this.W0;
                        float y = motionEvent.getY();
                        long j = this.L0;
                        if (ColumnText.GLOBAL_SPACE_CHAR_RATIO > y || y > f) {
                            float f2 = this.X0;
                            float f3 = this.Y0;
                            float y2 = motionEvent.getY();
                            if (f2 <= y2 && y2 <= f3) {
                                this.a1 = false;
                                if (!this.b1) {
                                    this.b1 = true;
                                    handler.removeCallbacks(b5Var);
                                    handler.postDelayed(b5Var, j);
                                }
                                float y3 = motionEvent.getY();
                                int i = this.Y0;
                                this.Z0 = ((int) ((y3 + i) - (this.X0 + i))) / 2;
                            } else if (this.a1 || this.b1) {
                                handler.removeCallbacks(b5Var);
                                this.a1 = false;
                                this.b1 = false;
                            }
                        } else {
                            this.b1 = false;
                            if (!this.a1) {
                                this.a1 = true;
                                handler.removeCallbacks(b5Var);
                                handler.postDelayed(b5Var, j);
                            }
                            this.Z0 = ((int) (this.W0 - (motionEvent.getY() - ColumnText.GLOBAL_SPACE_CHAR_RATIO))) / 2;
                        }
                    }
                    if (iB != -1 && this.R0 != iB) {
                        this.R0 = iB;
                        int i2 = this.S0;
                        if (i2 == -1) {
                            this.S0 = iB;
                            i2 = iB;
                        }
                        int i3 = this.T0;
                        if (i3 == -1) {
                            this.T0 = iB;
                            i3 = iB;
                        }
                        if (iB > i3) {
                            this.T0 = iB;
                        }
                        if (iB < i2) {
                            this.S0 = iB;
                        }
                        if (this.U0 == iB) {
                            this.S0 = iB;
                            this.T0 = iB;
                        }
                    }
                    return true;
                }
            }
            if (this.M0) {
                return this.P0.onTouchEvent(motionEvent);
            }
            return true;
        }
        this.Q0 = false;
        this.a1 = false;
        this.b1 = false;
        handler.removeCallbacks(b5Var);
        this.c1 = 1.0f;
        this.d1 = System.currentTimeMillis();
        return true;
    }

    public final dm4 getEndlessScrollListener() {
        return null;
    }

    public final fn5 getRecyclerScrollCallback() {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.V0;
        if (i3 > -1) {
            this.W0 = i3;
            this.X0 = getMeasuredHeight() - i3;
            this.Y0 = getMeasuredHeight();
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void setDragSelectActive(int i) {
        if (this.Q0 || !this.N0) {
            return;
        }
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.U0 = i;
        this.Q0 = true;
    }

    public final void setEndlessScrollListener(dm4 dm4Var) {
    }

    public final void setRecyclerScrollCallback(fn5 fn5Var) {
    }

    public final void setupDragListener(em4 em4Var) {
        this.N0 = em4Var != null;
    }

    public final void setupZoomListener(fm4 fm4Var) {
        this.M0 = fm4Var != null;
    }
}