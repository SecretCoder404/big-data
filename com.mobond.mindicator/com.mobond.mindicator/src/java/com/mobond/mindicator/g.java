/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.widget.RemoteViews
 *  androidx.core.app.h
 *  androidx.core.app.h$d
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.mobond.mindicator;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.h;
import com.mobond.mindicator.InsideTrainService;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule;

public class g {
    static Notification a(Context context, NotificationManager notificationManager, String string, String string2, String string3) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("inside_train_no_vibrate_03", (CharSequence)"User Inside Train Information", 3);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[]{0L});
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        h.d d2 = new h.d(context, "inside_train_no_vibrate_03");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131493008);
        remoteViews.setTextViewText(2131297032, (CharSequence)string2.trim());
        if (string3 != null) {
            remoteViews.setTextViewText(2131296616, (CharSequence)string3.trim());
        } else {
            remoteViews.setViewVisibility(2131296616, 8);
        }
        remoteViews.setViewVisibility(2131297074, 8);
        Intent intent = new Intent(context, InsideTrainService.class);
        intent.putExtra("stop_foreground_service", true);
        remoteViews.setOnClickPendingIntent(2131296564, PendingIntent.getService((Context)context.getApplicationContext(), (int)1234, (Intent)intent, (int)134217728));
        Intent intent2 = new Intent(context, ActivityTrainSchedule.class);
        intent2.addFlags(536870912);
        intent2.putExtra("name", string);
        intent2.putExtra("num", string);
        intent2.putExtra("page_pos", 1);
        intent2.putExtra("started_from_notification", true);
        d2.a(PendingIntent.getActivity((Context)context, (int)123, (Intent)intent2, (int)134217728)).a(remoteViews).b(true).a(2131231078).c((CharSequence)string2.trim()).a(System.currentTimeMillis());
        return d2.b();
    }

    public static h.d a(Context context, NotificationManager notificationManager, long[] arrl, boolean bl2) {
        if (Build.VERSION.SDK_INT >= 26) {
            g.a(notificationManager, arrl, bl2);
            if (bl2) {
                return new h.d(context, "channel_vibrate_01");
            }
            return new h.d(context, "channel_no_vibrate_02");
        }
        h.d d2 = new h.d(context);
        if (bl2) {
            d2.a(arrl);
        }
        return d2;
    }

    private static void a(NotificationManager notificationManager, long[] arrl, boolean bl2) {
        NotificationChannel notificationChannel;
        if (bl2) {
            notificationChannel = new NotificationChannel("channel_vibrate_01", (CharSequence)"Notifications With Vibration", 4);
            notificationChannel.enableVibration(true);
            notificationChannel.enableLights(true);
            notificationChannel.setVibrationPattern(arrl);
            notificationChannel.setLightColor(-65536);
        } else {
            notificationChannel = new NotificationChannel("channel_no_vibrate_02", (CharSequence)"Notifications Without Vibration", 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }
}

