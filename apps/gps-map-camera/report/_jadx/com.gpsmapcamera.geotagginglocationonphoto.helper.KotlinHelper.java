package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.itextpdf.text.pdf.ColumnText;
import defpackage.af1;
import defpackage.dk2;
import defpackage.eo7;
import defpackage.fm0;
import defpackage.fp;
import defpackage.gb0;
import defpackage.gm0;
import defpackage.h56;
import defpackage.hda;
import defpackage.i41;
import defpackage.i49;
import defpackage.io6;
import defpackage.k41;
import defpackage.kg1;
import defpackage.mk9;
import defpackage.od3;
import defpackage.pc1;
import defpackage.pj2;
import defpackage.qj;
import defpackage.s51;
import defpackage.st2;
import defpackage.t17;
import defpackage.t51;
import defpackage.wl1;
import defpackage.wt9;
import j$.time.Clock;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class KotlinHelper {
    private Context mcontext;
    private Handler handlerDate = new Handler(Looper.getMainLooper());
    private boolean isInternetConnection = true;
    private final h56 time = new h56();
    private Runnable runnableDate = new Runnable() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper$runnableDate$1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.this$0.getMcontext() == null) {
                    HelperClass.calendar = Calendar.getInstance();
                    HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                    this.this$0.getHandlerDate().postDelayed(this, 1000L);
                    return;
                }
                Context mcontext = this.this$0.getMcontext();
                mcontext.getClass();
                if (od3.u(mcontext) && !this.this$0.isInternetConnection()) {
                    this.this$0.setInternetConnection(true);
                    KotlinHelper kotlinHelper = this.this$0;
                    kotlinHelper.getDatefromCalender(kotlinHelper.getMcontext());
                    if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    }
                    if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                        HelperClass.calendar = null;
                        KotlinHelper kotlinHelper2 = this.this$0;
                        kotlinHelper2.getDatefromCalender(kotlinHelper2.getMcontext());
                        return;
                    }
                    if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                        HelperClass.calendar.add(13, 1);
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    } else if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    } else {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    }
                }
                Context mcontext2 = this.this$0.getMcontext();
                mcontext2.getClass();
                if (od3.u(mcontext2) && this.this$0.isInternetConnection()) {
                    if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    }
                    if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                        HelperClass.calendar = null;
                        KotlinHelper kotlinHelper3 = this.this$0;
                        kotlinHelper3.getDatefromCalender(kotlinHelper3.getMcontext());
                        return;
                    }
                    if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                        HelperClass.calendar.add(13, 1);
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    } else if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    } else {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    }
                }
                Context mcontext3 = this.this$0.getMcontext();
                mcontext3.getClass();
                if (od3.u(mcontext3) || !this.this$0.isInternetConnection()) {
                    if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    }
                    if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                        HelperClass.calendar = null;
                        KotlinHelper kotlinHelper4 = this.this$0;
                        kotlinHelper4.getDatefromCalender(kotlinHelper4.getMcontext());
                        return;
                    }
                    if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                        HelperClass.calendar.add(13, 1);
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    } else if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    } else {
                        HelperClass.calendar = Calendar.getInstance();
                        HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                        this.this$0.getHandlerDate().postDelayed(this, 1000L);
                        return;
                    }
                }
                this.this$0.setInternetConnection(false);
                if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                    HelperClass.calendar = Calendar.getInstance();
                    HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                    this.this$0.getHandlerDate().postDelayed(this, 1000L);
                    return;
                }
                if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                    HelperClass.calendar = null;
                    KotlinHelper kotlinHelper5 = this.this$0;
                    kotlinHelper5.getDatefromCalender(kotlinHelper5.getMcontext());
                    return;
                }
                if (!HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && !HelperClass.isAutomatic) {
                    HelperClass.calendar.add(13, 1);
                    HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                    this.this$0.getHandlerDate().postDelayed(this, 1000L);
                } else if (HelperClass.isTimeAutomatic(this.this$0.getMcontext()) && HelperClass.isAutomatic) {
                    HelperClass.calendar = Calendar.getInstance();
                    HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                    this.this$0.getHandlerDate().postDelayed(this, 1000L);
                } else {
                    HelperClass.calendar = Calendar.getInstance();
                    HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                    this.this$0.getHandlerDate().postDelayed(this, 1000L);
                }
            } catch (Exception e) {
                e.printStackTrace();
                HelperClass.calendar = Calendar.getInstance();
                HelperClass.date = new Date(HelperClass.calendar.getTimeInMillis());
                this.this$0.getHandlerDate().postDelayed(this, 1000L);
            }
        }
    };
    private final Set<Integer> retentionDays = fp.x(new Integer[]{1, 2, 3, 4, 5, 6, 7, 14, 21, 30, 45});

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper$getDatefromCalender$1, reason: invalid class name */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper$getDatefromCalender$1", f = "KotlinHelper.kt", l = {167}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends io6 implements dk2 {
        final /* synthetic */ Context $context;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, i41<? super AnonymousClass1> i41Var) {
            super(2, i41Var);
            this.$context = context;
        }

        @Override // defpackage.k00
        public final i41<t17> create(Object obj, i41<?> i41Var) {
            return KotlinHelper.this.new AnonymousClass1(this.$context, i41Var);
        }

        @Override // defpackage.dk2
        public final Object invoke(s51 s51Var, i41<? super t17> i41Var) {
            return ((AnonymousClass1) create(s51Var, i41Var)).invokeSuspend(t17.a);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) {
            Calendar calendar;
            int i = this.label;
            if (i == 0) {
                i49.b(obj);
                if (HelperClass.calendar == null) {
                    calendar = Calendar.getInstance();
                    HelperClass.calendar = calendar;
                    KotlinHelper kotlinHelper = KotlinHelper.this;
                    Context context = this.$context;
                    this.L$0 = calendar;
                    this.label = 1;
                    obj = kotlinHelper.getUpdatedTime(context, this);
                    t51 t51Var = t51.a;
                    if (obj == t51Var) {
                        return t51Var;
                    }
                }
                return t17.a;
            }
            if (i != 1) {
                qj.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            calendar = (Calendar) this.L$0;
            i49.b(obj);
            calendar.setTime((Date) obj);
            KotlinHelper kotlinHelper2 = new KotlinHelper();
            Context context2 = this.$context;
            context2.getClass();
            kotlinHelper2.startUpdatTime(context2);
            return t17.a;
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper$getTime$2, reason: invalid class name */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper$getTime$2", f = "KotlinHelper.kt", l = {159}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends io6 implements dk2 {
        int label;

        public AnonymousClass2(i41<? super AnonymousClass2> i41Var) {
            super(2, i41Var);
        }

        @Override // defpackage.k00
        public final i41<t17> create(Object obj, i41<?> i41Var) {
            return KotlinHelper.this.new AnonymousClass2(i41Var);
        }

        @Override // defpackage.dk2
        public final Object invoke(s51 s51Var, i41<? super Date> i41Var) {
            return ((AnonymousClass2) create(s51Var, i41Var)).invokeSuspend(t17.a);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                i49.b(obj);
                KotlinHelper kotlinHelper = KotlinHelper.this;
                this.label = 1;
                obj = kotlinHelper.gettimestamp(this);
                t51 t51Var = t51.a;
                if (obj == t51Var) {
                    return t51Var;
                }
            } else {
                if (i != 1) {
                    qj.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i49.b(obj);
            }
            return (Date) obj;
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper$getUpdatedTime$1, reason: invalid class name and case insensitive filesystem */
    @pc1(c = "com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper", f = "KotlinHelper.kt", l = {ModuleDescriptor.MODULE_VERSION, 196}, m = "getUpdatedTime", v = 2)
    public static final class C00101 extends k41 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00101(i41<? super C00101> i41Var) {
            super(i41Var);
        }

        @Override // defpackage.k00
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinHelper.this.getUpdatedTime(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r11 == r8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUpdatedTime(Context context, i41<? super Date> i41Var) {
        C00101 c00101;
        Date time;
        NetworkCapabilities networkCapabilities;
        NetworkCapabilities networkCapabilities2;
        if (i41Var instanceof C00101) {
            c00101 = (C00101) i41Var;
            int i = c00101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00101.label = i - Integer.MIN_VALUE;
            } else {
                c00101 = new C00101(i41Var);
            }
        } else {
            c00101 = new C00101(i41Var);
        }
        Object time2 = c00101.result;
        int i2 = c00101.label;
        if (i2 == 0) {
            i49.b(time2);
            if (HelperClass.isTimeAutomatic(context)) {
                Date time3 = Calendar.getInstance().getTime();
                time3.getClass();
                return time3;
            }
            boolean zHasCapability = false;
            HelperClass.isAutomatic = false;
            int i3 = Build.VERSION.SDK_INT;
            Object obj = t51.a;
            if (i3 >= 29) {
                try {
                    return new Date(Clock.VivifiedWrapper.convert(SystemClock.currentGnssTimeClock()).millis());
                } catch (Exception unused) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                        zHasCapability = networkCapabilities.hasCapability(12);
                    }
                    if (zHasCapability) {
                        c00101.L$0 = null;
                        c00101.L$1 = null;
                        c00101.label = 1;
                        time2 = getTime(c00101);
                    } else {
                        time = Calendar.getInstance().getTime();
                    }
                }
            } else {
                ConnectivityManager connectivityManager2 = (ConnectivityManager) st2.i(context, "connectivity");
                Network activeNetwork2 = connectivityManager2.getActiveNetwork();
                if (activeNetwork2 != null && (networkCapabilities2 = connectivityManager2.getNetworkCapabilities(activeNetwork2)) != null) {
                    zHasCapability = networkCapabilities2.hasCapability(12);
                }
                if (!zHasCapability) {
                    Date time4 = Calendar.getInstance().getTime();
                    time4.getClass();
                    return time4;
                }
                c00101.L$0 = null;
                c00101.label = 2;
                Object time5 = getTime(c00101);
                if (time5 != obj) {
                    return time5;
                }
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qj.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i49.b(time2);
            return time2;
        }
        i49.b(time2);
        time = (Date) time2;
        time.getClass();
        return time;
    }

    private final void sendOnce(Context context, String str) {
        if (new SP(context).getBoolean(context, str, false)) {
            return;
        }
        HelperClass.sendFBEvent(context, str);
        new SP(context).setBoolean(context, str, true);
    }

    public final int countDays(Context context) {
        context.getClass();
        return (int) ((System.currentTimeMillis() - new SP(context).getLong(context, HelperClass.FIRST_TIME_OPEN_DATE, 0L)) / 86400000);
    }

    public final void getDatefromCalender(Context context) {
        kg1 kg1Var = wl1.a;
        mk9.g(wt9.a(af1.c), null, null, new AnonymousClass1(context, null), 3);
    }

    public final Handler getHandlerDate() {
        return this.handlerDate;
    }

    public final Context getMcontext() {
        return this.mcontext;
    }

    public final Bitmap getRoundedImageBitmap(File file) {
        Bitmap bitmapDecodeFile;
        file.getClass();
        try {
            if (file.exists()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options);
            } else {
                bitmapDecodeFile = null;
            }
            if (bitmapDecodeFile == null) {
                return null;
            }
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            float fMin = Math.min(width, height) * 0.05f;
            canvas.drawRoundRect(new RectF(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, width, height), fMin, fMin, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDecodeFile, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, paint);
            if (!bitmapDecodeFile.equals(bitmapCreateBitmap)) {
                bitmapDecodeFile.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Runnable getRunnableDate() {
        return this.runnableDate;
    }

    public final Object getTime(i41<? super Date> i41Var) {
        return mk9.i(wl1.a, new AnonymousClass2(null), i41Var);
    }

    public final Object gettimestamp(i41<? super Date> i41Var) {
        final gm0 gm0Var = new gm0(1, hda.a(i41Var));
        gm0Var.u();
        h56 h56Var = this.time;
        pj2 pj2Var = new pj2() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.KotlinHelper$gettimestamp$2$1
            @Override // defpackage.pj2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return t17.a;
            }

            public final void invoke(long j) {
                Date time = (j == -1 || j == -2) ? Calendar.getInstance().getTime() : new Date(j);
                fm0 fm0Var = gm0Var;
                time.getClass();
                fm0Var.e(null, time);
            }
        };
        h56Var.getClass();
        mk9.g(h56Var.a, null, null, new gb0(pj2Var, h56Var, null, 26), 3);
        return gm0Var.s();
    }

    public final boolean isInternetConnection() {
        return this.isInternetConnection;
    }

    public final void sendRetentionEventIfNeeded(Context context) {
        context.getClass();
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - new SP(context).getLong(context, HelperClass.FIRST_TIME_OPEN_DATE, 0L)) / 86400000);
        if (this.retentionDays.contains(Integer.valueOf(iCurrentTimeMillis))) {
            String strH = eo7.h("day", iCurrentTimeMillis, "_photo_capture");
            if (new SP(context).getBoolean(context, strH, false)) {
                return;
            }
            HelperClass.sendFBEvent(context, strH);
            new SP(context).setBoolean(context, strH, true);
        }
    }

    public final void sendValuableUserEvents(Context context, int i, int i2) {
        context.getClass();
        if (i2 >= 60 && i >= 45) {
            sendOnce(context, FBEventUtils.VALUABLE_USER_5);
            return;
        }
        if (i2 >= 45 && i >= 25) {
            sendOnce(context, FBEventUtils.VALUABLE_USER_4);
            return;
        }
        if (i2 >= 25 && i >= 12) {
            sendOnce(context, FBEventUtils.VALUABLE_USER_3);
        } else {
            if (i2 < 12 || i < 5) {
                return;
            }
            sendOnce(context, FBEventUtils.VALUABLE_USER_2);
        }
    }

    public final void setCaptureDays(Context context) {
        context.getClass();
        int iCountDays = countDays(context);
        if (new SP(context).getInteger(context, SP.LAST_COUNT_DAY, -1) != iCountDays) {
            new SP(context).setInteger(context, SP.LAST_COUNT_DAY, iCountDays);
            int integer = new SP(context).getInteger(context, SP.COUNT_DAYS, 0) + 1;
            new SP(context).setInteger(context, SP.COUNT_DAYS, integer);
            sendValuableUserEvents(context, integer, iCountDays + 1);
        }
    }

    public final void setHandlerDate(Handler handler) {
        handler.getClass();
        this.handlerDate = handler;
    }

    public final void setInternetConnection(boolean z) {
        this.isInternetConnection = z;
    }

    public final void setMcontext(Context context) {
        this.mcontext = context;
    }

    public final void setRunnableDate(Runnable runnable) {
        runnable.getClass();
        this.runnableDate = runnable;
    }

    public final void startUpdatTime(Context context) {
        context.getClass();
        this.mcontext = context;
        Handler handler = this.handlerDate;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.handlerDate.post(this.runnableDate);
    }
}