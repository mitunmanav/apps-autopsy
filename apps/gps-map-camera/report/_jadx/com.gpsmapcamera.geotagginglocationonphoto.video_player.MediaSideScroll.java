package com.gpsmapcamera.geotagginglocationonphoto.video_player;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.internal.compat.quirk.Je.zXAusrmFrBIQHr;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.ui.activities.VideoPlayerActivity;
import com.gpsmapcamera.geotagginglocationonphoto.video_player.MediaSideScroll;
import com.itextpdf.text.pdf.ColumnText;
import defpackage.b9;
import defpackage.bi3;
import defpackage.dk2;
import defpackage.pl0;
import defpackage.x71;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSideScroll extends RelativeLayout {
    public static final /* synthetic */ int q = 0;
    public final long a;
    public float b;
    public float c;
    public int d;
    public int e;
    public float f;
    public int g;
    public boolean h;
    public final float i;
    public String j;
    public final Handler k;
    public VideoPlayerActivity l;
    public dk2 m;
    public TextView n;
    public dk2 o;
    public final GestureDetector p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSideScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.a = 1000L;
        this.d = -1;
        this.i = 8.0f * context.getResources().getDisplayMetrics().density;
        this.j = "";
        this.k = new Handler();
        this.p = new GestureDetector(context, new pl0(2, this));
    }

    private final int getCurrentBrightness() {
        try {
            VideoPlayerActivity videoPlayerActivity = this.l;
            videoPlayerActivity.getClass();
            return Settings.System.getInt(videoPlayerActivity.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            return 70;
        }
    }

    private final int getCurrentVolume() {
        VideoPlayerActivity videoPlayerActivity = this.l;
        if (videoPlayerActivity == null) {
            return 0;
        }
        Object systemService = videoPlayerActivity.getSystemService("audio");
        systemService.getClass();
        return ((AudioManager) systemService).getStreamVolume(3);
    }

    public final void a(VideoPlayerActivity videoPlayerActivity, TextView textView, boolean z, dk2 dk2Var, dk2 dk2Var2) {
        this.l = videoPlayerActivity;
        this.n = textView;
        this.o = dk2Var;
        this.m = dk2Var2;
        this.h = z;
        String string = videoPlayerActivity.getString(z ? R.string.brightness : R.string.volume);
        string.getClass();
        this.j = string;
        b9 b9Var = new b9(17, this);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new x71(this, b9Var));
        }
    }

    public final void b(int i) {
        TextView textView = this.n;
        if (textView == null) {
            bi3.g("slideInfoView");
            throw null;
        }
        textView.setText(this.j + ":\n" + i + "%");
        textView.setAlpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Window window;
        Window window2;
        motionEvent.getClass();
        this.p.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        final int i = 1;
        if (actionMasked == 0) {
            this.b = motionEvent.getRawX();
            this.c = motionEvent.getRawY();
            this.f = motionEvent.getRawY();
            System.currentTimeMillis();
            if (!this.h) {
                this.d = getCurrentVolume();
                return true;
            }
            if (this.d == -1) {
                this.d = getCurrentBrightness();
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                float rawX = this.b - motionEvent.getRawX();
                float rawY = this.c - motionEvent.getRawY();
                if (Math.abs(rawY) > this.i && Math.abs(rawY) > Math.abs(rawX)) {
                    int iMin = Math.min(100, Math.max(-100, ((int) ((rawY / this.g) * 100.0f)) * 3));
                    if ((iMin == 100 && motionEvent.getRawY() > this.f) || (iMin == -100 && motionEvent.getRawY() < this.f)) {
                        this.c = motionEvent.getRawY();
                        this.d = this.h ? this.e : getCurrentVolume();
                    }
                    boolean z = this.h;
                    final int i2 = 0;
                    long j = this.a;
                    Handler handler = this.k;
                    if (z) {
                        float fMin = Math.min(255.0f, Math.max(ColumnText.GLOBAL_SPACE_CHAR_RATIO, (float) ((((double) iMin) * 2.55d) + ((double) this.d))));
                        this.e = (int) fMin;
                        int i3 = (int) ((fMin / 255.0f) * 100.0f);
                        b(i3);
                        VideoPlayerActivity videoPlayerActivity = this.l;
                        WindowManager.LayoutParams attributes = (videoPlayerActivity == null || (window2 = videoPlayerActivity.getWindow()) == null) ? null : window2.getAttributes();
                        if (attributes != null) {
                            attributes.screenBrightness = i3 / 100.0f;
                        }
                        VideoPlayerActivity videoPlayerActivity2 = this.l;
                        if (videoPlayerActivity2 != null && (window = videoPlayerActivity2.getWindow()) != null) {
                            window.setAttributes(attributes);
                        }
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new Runnable(this) { // from class: lb4
                            public final /* synthetic */ MediaSideScroll b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = i2;
                                String str = zXAusrmFrBIQHr.dskUhpfA;
                                MediaSideScroll mediaSideScroll = this.b;
                                switch (i4) {
                                    case 0:
                                        TextView textView = mediaSideScroll.n;
                                        if (textView != null) {
                                            textView.animate().alpha(ColumnText.GLOBAL_SPACE_CHAR_RATIO);
                                            return;
                                        } else {
                                            bi3.g(str);
                                            throw null;
                                        }
                                    default:
                                        TextView textView2 = mediaSideScroll.n;
                                        if (textView2 != null) {
                                            textView2.animate().alpha(ColumnText.GLOBAL_SPACE_CHAR_RATIO);
                                            return;
                                        } else {
                                            bi3.g(str);
                                            throw null;
                                        }
                                }
                            }
                        }, j);
                    } else {
                        VideoPlayerActivity videoPlayerActivity3 = this.l;
                        if (videoPlayerActivity3 != null) {
                            Object systemService = videoPlayerActivity3.getSystemService("audio");
                            systemService.getClass();
                            numValueOf = Integer.valueOf(((AudioManager) systemService).getStreamMaxVolume(3));
                        } else {
                            numValueOf = null;
                        }
                        numValueOf.getClass();
                        int iIntValue = numValueOf.intValue();
                        int i4 = 100 / iIntValue;
                        if (i4 != 0) {
                            int iMin2 = Math.min(iIntValue, Math.max(0, this.d + (iMin / i4)));
                            VideoPlayerActivity videoPlayerActivity4 = this.l;
                            videoPlayerActivity4.getClass();
                            Object systemService2 = videoPlayerActivity4.getSystemService("audio");
                            systemService2.getClass();
                            ((AudioManager) systemService2).setStreamVolume(3, iMin2, 0);
                            b((int) ((iMin2 / iIntValue) * 100.0f));
                            handler.removeCallbacksAndMessages(null);
                            handler.postDelayed(new Runnable(this) { // from class: lb4
                                public final /* synthetic */ MediaSideScroll b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i5 = i;
                                    String str = zXAusrmFrBIQHr.dskUhpfA;
                                    MediaSideScroll mediaSideScroll = this.b;
                                    switch (i5) {
                                        case 0:
                                            TextView textView = mediaSideScroll.n;
                                            if (textView != null) {
                                                textView.animate().alpha(ColumnText.GLOBAL_SPACE_CHAR_RATIO);
                                                return;
                                            } else {
                                                bi3.g(str);
                                                throw null;
                                            }
                                        default:
                                            TextView textView2 = mediaSideScroll.n;
                                            if (textView2 != null) {
                                                textView2.animate().alpha(ColumnText.GLOBAL_SPACE_CHAR_RATIO);
                                                return;
                                            } else {
                                                bi3.g(str);
                                                throw null;
                                            }
                                    }
                                }
                            }, j);
                        }
                    }
                }
                this.f = motionEvent.getRawY();
                return true;
            }
        } else if (this.h) {
            this.d = this.e;
            return true;
        }
        return true;
    }
}