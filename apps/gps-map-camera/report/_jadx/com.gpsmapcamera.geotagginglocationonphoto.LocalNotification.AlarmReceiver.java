package com.gpsmapcamera.geotagginglocationonphoto.LocalNotification;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.PowerManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.ui.ra.ZOCVirpIr;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.Splash_Screen;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import defpackage.a8a;
import defpackage.es4;
import defpackage.fs7;
import defpackage.ic;
import defpackage.la9;
import defpackage.qj;
import defpackage.ub9;
import defpackage.w6;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AlarmReceiver extends BroadcastReceiver {
    public es4 a;
    public boolean b = false;

    public static void a(Context context, long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 21);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        SP sp = new SP(context);
        if (i == 51) {
            sp.setLong(context, SP.ALARM_TIME_15_DAYS, j);
        } else if (i == 52) {
            sp.setLong(context, SP.ALARM_TIME_10_TIMES_OPEN, calendar.getTimeInMillis());
        } else if (i == 53) {
            sp.setLong(context, SP.ALARM_TIME_45_PHOTOS, calendar.getTimeInMillis());
        } else if (i == 54) {
            sp.setLong(context, SP.ALARM_TIME_50_PHOTOS_PRO, calendar.getTimeInMillis());
        } else if (i == 55) {
            sp.setLong(context, SP.ALARM_TIME_100_PHOTOS, calendar.getTimeInMillis());
        } else if (i == 56) {
            sp.setLong(context, SP.ALARM_TIME_500_PHOTOS, calendar.getTimeInMillis());
        } else if (i == 57) {
            sp.setLong(context, SP.ALARM_TIME_2ND_DAY, calendar.getTimeInMillis());
        } else if (i == 58) {
            sp.setLong(context, SP.ALARM_TIME_MAP_OPEN_TIME, calendar.getTimeInMillis());
        } else if (i == 59) {
            sp.setLong(context, SP.ALARM_TIME_CAMSET_OPEN_TIME, calendar.getTimeInMillis());
        } else if (i == 60) {
            sp.setLong(context, SP.ALARM_TIME_FOLD_OPEN_TIME, calendar.getTimeInMillis());
        } else if (i == 61) {
            sp.setLong(context, SP.ALARM_TIME_FILE_OPEN_TIME, calendar.getTimeInMillis());
        } else if (i == 62) {
            sp.setLong(context, SP.ALARM_TIME_TEMP_OPEN_TIME, calendar.getTimeInMillis());
        } else if (i == 63) {
            sp.setLong(context, SP.ALARM_TIME_FONT_OPEN_TIME, calendar.getTimeInMillis());
        } else if (i == 64) {
            sp.setLong(context, SP.ALARM_TIME_STAMPPOS_OPEN_TIME, calendar.getTimeInMillis());
        } else if (i == 65) {
            sp.setLong(context, SP.ALARM_TIME_3_TIME_NO_BUY, calendar.getTimeInMillis());
        } else if (i == 66) {
            sp.setLong(context, SP.ALARM_TIME_3_TIME_NO_BUY_STAN, calendar.getTimeInMillis());
        }
        try {
            b(context, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(Context context, int i) {
        AlarmManager.AlarmClockInfo alarmClockInfo;
        Intent intent = new Intent(context, (Class<?>) AlarmReceiver.class);
        intent.addFlags(268435456);
        intent.putExtra("alarmId", i);
        PendingIntent broadcast = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(context, i, intent, 201326592) : PendingIntent.getBroadcast(context, i, intent, 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        switch (i) {
            case 51:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_15_DAYS, System.currentTimeMillis()), broadcast);
                break;
            case 52:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_10_TIMES_OPEN, System.currentTimeMillis()), broadcast);
                break;
            case 53:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_45_PHOTOS, System.currentTimeMillis()), broadcast);
                break;
            case 54:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_50_PHOTOS_PRO, System.currentTimeMillis()), broadcast);
                break;
            case 55:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_100_PHOTOS, System.currentTimeMillis()), broadcast);
                break;
            case 56:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_500_PHOTOS, System.currentTimeMillis()), broadcast);
                break;
            case 57:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_2ND_DAY, System.currentTimeMillis()), broadcast);
                break;
            case 58:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_MAP_OPEN_TIME, System.currentTimeMillis()), broadcast);
                break;
            case 59:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_CAMSET_OPEN_TIME, System.currentTimeMillis()), broadcast);
                break;
            case 60:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_FOLD_OPEN_TIME, System.currentTimeMillis()), broadcast);
                break;
            case 61:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_FILE_OPEN_TIME, System.currentTimeMillis()), broadcast);
                break;
            case 62:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_TEMP_OPEN_TIME, System.currentTimeMillis()), broadcast);
                break;
            case 63:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_FONT_OPEN_TIME, System.currentTimeMillis()), broadcast);
                break;
            case 64:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_STAMPPOS_OPEN_TIME, System.currentTimeMillis()), broadcast);
                break;
            case 65:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_3_TIME_NO_BUY, System.currentTimeMillis()), broadcast);
                break;
            case 66:
                alarmClockInfo = new AlarmManager.AlarmClockInfo(new SP(context).getLong(context, SP.ALARM_TIME_3_TIME_NO_BUY_STAN, System.currentTimeMillis()), broadcast);
                break;
            default:
                qj.l(fs7.j(i, "Unexpected value: "));
                return;
        }
        alarmManager.set(0, alarmClockInfo.getTriggerTime(), broadcast);
    }

    public static void c(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("alarmId", 0);
        Calendar calendar = Calendar.getInstance();
        if (intExtra == 51) {
            calendar.set(11, 21);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(5, 15);
        } else {
            calendar.set(11, 21);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(5, 1);
        }
        a(context, calendar.getTimeInMillis(), intExtra);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, ":AlarmService");
        wakeLockNewWakeLock.acquire(600000L);
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) Splash_Screen.class), 1, 1);
        this.a = new es4(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String string = context.getString(R.string.app_name);
            String string2 = context.getString(R.string.app_name);
            ic.d();
            NotificationChannel notificationChannel = new NotificationChannel(context.getString(R.string.app_name), string, 3);
            notificationChannel.setDescription(string2);
            es4 es4Var = this.a;
            if (i >= 26) {
                es4Var.b.createNotificationChannel(notificationChannel);
            } else {
                es4Var.getClass();
            }
        }
        Locale locale = HelperClass.getLocale(context);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ZOCVirpIr.frdNce);
        Objects.requireNonNull(activityManager);
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(SubsamplingScaleImageView.TILE_SIZE_AUTO);
        for (int i2 = 0; i2 < runningTasks.size(); i2++) {
            if (runningTasks.get(i2).baseActivity.toShortString().contains("com.gpsmapcamera.geotagginglocationonphoto")) {
                this.b = true;
            }
        }
        int intExtra = intent.getIntExtra("alarmId", 0);
        SP sp = new SP(context);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ub9.a(context));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        if (Integer.parseInt(Long.toString(Math.abs(calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000)) > 14 && intExtra == 51) {
            if (!this.b) {
                Intent intent2 = new Intent(context, (Class<?>) AlarmReceiver.class);
                ((AlarmManager) context.getSystemService("alarm")).cancel(Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(context, intExtra, intent2, 201326592) : PendingIntent.getBroadcast(context, intExtra, intent2, 134217728));
                if (la9.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                    return;
                }
                this.a.a(1, w6.e(context, 51));
                a8a.a(context, context.getString(R.string.show_15th_day_app_open), context.getString(R.string.show_15th_day_app_open));
            }
            c(context, intent);
        }
        if (intExtra == 52) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(2, w6.e(context, 52));
                a8a.a(context, context.getString(R.string.show_10_time_open_45_pics), context.getString(R.string.show_10_time_open_45_pics));
            }
        }
        if (intExtra == 53) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(3, w6.e(context, 53));
                a8a.a(context, context.getString(R.string.show_10_time_open_45_pics), context.getString(R.string.show_10_time_open_45_pics));
            }
        }
        if (intExtra == 54) {
            if (this.b || sp.getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT) || sp.getBoolean(context, HelperClass.IS_SUBSCRIBE)) {
                c(context, intent);
            } else {
                this.a.a(4, w6.e(context, 54));
                a8a.a(context, context.getString(R.string.show_50_times_photo_click_pro_screen), context.getString(R.string.show_50_times_photo_click_pro_screen));
            }
        }
        if (intExtra == 55) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(5, w6.e(context, 55));
                a8a.a(context, context.getString(R.string.show_100_times_photo_click), context.getString(R.string.show_100_times_photo_click));
            }
        }
        if (intExtra == 56) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(6, w6.e(context, 56));
                a8a.a(context, context.getString(R.string.show_100_times_photo_click), context.getString(R.string.show_100_times_photo_click));
            }
        }
        if (intExtra == 57) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(7, w6.e(context, 57));
                a8a.a(context, context.getString(R.string.show_2nd_day_app_open), context.getString(R.string.show_2nd_day_app_open));
            }
        }
        if (intExtra == 58) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(8, w6.e(context, 58));
                a8a.a(context, context.getString(R.string.show_map_open_time), context.getString(R.string.show_map_open_time));
            }
        }
        if (intExtra == 59) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(9, w6.e(context, 59));
                a8a.a(context, context.getString(R.string.show_camset_open_time), context.getString(R.string.show_camset_open_time));
            }
        }
        if (intExtra == 60) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(10, w6.e(context, 60));
                a8a.a(context, context.getString(R.string.show_fold_open_time), context.getString(R.string.show_fold_open_time));
            }
        }
        if (intExtra == 61) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(11, w6.e(context, 61));
                a8a.a(context, context.getString(R.string.show_file_open_time), context.getString(R.string.show_file_open_time));
            }
        }
        if (intExtra == 62) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(12, w6.e(context, 62));
                a8a.a(context, context.getString(R.string.show_temp_open_time), context.getString(R.string.show_temp_open_time));
            }
        }
        if (intExtra == 63) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(13, w6.e(context, 63));
                a8a.a(context, context.getString(R.string.show_font_open_time), context.getString(R.string.show_font_open_time));
            }
        }
        if (intExtra == 64) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(14, w6.e(context, 64));
                a8a.a(context, context.getString(R.string.show_stamppos_open_time), context.getString(R.string.show_stamppos_open_time));
            }
        }
        if (intExtra == 65) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(15, w6.e(context, 65));
                a8a.a(context, context.getString(R.string.show_3_time_no_buy), context.getString(R.string.show_3_time_no_buy));
            }
        }
        if (intExtra == 66) {
            if (this.b) {
                c(context, intent);
            } else {
                this.a.a(16, w6.e(context, 66));
                a8a.a(context, context.getString(R.string.show_3_time_no_buy_stan), context.getString(R.string.show_3_time_no_buy_stan));
            }
        }
        wakeLockNewWakeLock.release();
    }
}