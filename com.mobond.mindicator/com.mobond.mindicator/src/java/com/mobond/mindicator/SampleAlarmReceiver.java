/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.PnrNotification2HoursBeforeActionReceiver
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.c
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.servicesreceivers.GetPnrStatusService
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Calendar
 *  java.util.Random
 */
package com.mobond.mindicator;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.mobond.mindicator.GetPeriodicLocationReceiver;
import com.mobond.mindicator.SampleBootReceiver;
import com.mobond.mindicator.SmsReceiver;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing;
import com.mobond.mindicator.ui.indianrail.pnrstatus.PnrNotification2HoursBeforeActionReceiver;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.pnrstatus.servicesreceivers.GetPnrStatusService;
import java.util.Calendar;
import java.util.Random;

public class SampleAlarmReceiver
extends BroadcastReceiver {
    public static int a(int n2, int n3) {
        return n2 + new Random().nextInt(1 + (n3 - n2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a(String var0, String var1_1) {
        try {
            switch (var1_1.hashCode()) {
                case 225105687: {
                    if (!var1_1.equals((Object)"PNR_ALARM_2_HOURS_BEFORE_STICKY_NOTIFICATION")) break;
                    var2_2 = 1;
                    ** break;
                }
                case -126785593: {
                    if (!var1_1.equals((Object)"END_PERIODIC_LOCATION_ALARM")) break;
                    var2_2 = 4;
                    ** break;
                }
                case -904497617: {
                    if (!var1_1.equals((Object)"PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY")) break;
                    var2_2 = 2;
                    ** break;
                }
                case -954940850: {
                    if (!var1_1.equals((Object)"START_PERIODIC_LOCATION_ALARM")) break;
                    var2_2 = 3;
                    ** break;
                }
                case -2047652524: {
                    if (!var1_1.equals((Object)"PNR_ALARM_ROUTINE_CHECK")) break;
                    var2_2 = 0;
                    ** break;
                }
            }
            var2_2 = -1;
lbl24: // 6 sources:
            switch (var2_2) {
                default: {
                    var3_3 = 300;
                    break;
                }
                case 4: {
                    var3_3 = 600;
                    break;
                }
                case 3: {
                    var3_3 = 500;
                    break;
                }
                case 2: {
                    var3_3 = 400;
                    break;
                }
                case 1: {
                    var3_3 = 200;
                    break;
                }
                case 0: {
                    var3_3 = 100;
                }
            }
            var4_4 = Long.parseLong((String)var0.replaceAll("[^0-9]", "")) / (long)var3_3;
        }
        catch (Exception v0) {
            return -1;
        }
        return (int)var4_4;
    }

    public static PendingIntent a(Context context, String string, int n2, String string2) {
        Intent intent = new Intent(context, SampleAlarmReceiver.class);
        intent.putExtra("id", n2);
        intent.putExtra("pnr", string);
        intent.putExtra("PNR_ALARM", string2);
        return PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
    }

    public static String a(long l2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(calendar.get(5));
        stringBuilder.append("-");
        stringBuilder.append(1 + calendar.get(2));
        stringBuilder.append("-");
        stringBuilder.append(calendar.get(1));
        stringBuilder.append(" ");
        stringBuilder.append(calendar.get(11));
        stringBuilder.append(":");
        stringBuilder.append(calendar.get(12));
        return stringBuilder.toString();
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, SampleAlarmReceiver.class);
        int n2 = (int)System.currentTimeMillis();
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int n3 = SampleAlarmReceiver.a(22, 23);
        int n4 = n3 == 22 ? SampleAlarmReceiver.a(30, 59) : (n3 == 23 ? SampleAlarmReceiver.a(0, 30) : 0);
        calendar.set(11, n3);
        calendar.set(12, n4);
        if (alarmManager != null) {
            alarmManager.setInexactRepeating(0, calendar.getTimeInMillis(), 86400000L, pendingIntent);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("111 night alarm : ");
            stringBuilder.append(n3);
            stringBuilder.append(":");
            stringBuilder.append(n4);
            Log.d((String)"111", (String)stringBuilder.toString());
        }
        AlarmManager alarmManager2 = (AlarmManager)context.getSystemService("alarm");
        Intent intent2 = new Intent(context, SampleAlarmReceiver.class);
        int n5 = (int)System.currentTimeMillis();
        PendingIntent pendingIntent2 = PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n5, (Intent)intent2, (int)134217728);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        int n6 = SampleAlarmReceiver.a(0, 59);
        calendar2.set(11, 11);
        calendar2.set(12, n6);
        if (alarmManager2 != null) {
            alarmManager2.setInexactRepeating(0, calendar2.getTimeInMillis(), 86400000L, pendingIntent2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("111 morning alarm : ");
            stringBuilder.append(11);
            stringBuilder.append(":");
            stringBuilder.append(n6);
            Log.d((String)"111", (String)stringBuilder.toString());
        }
        ComponentName componentName = new ComponentName(context, SampleBootReceiver.class);
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
    }

    public static void a(Context context, int n2, String string) {
        ((AlarmManager)context.getSystemService("alarm")).cancel(SampleAlarmReceiver.b(context, n2, string));
    }

    private static void a(Context context, long l2, int n2, String string) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (alarmManager != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("set stn alarm ");
            stringBuilder.append(l2);
            stringBuilder.append(" -- ");
            stringBuilder.append(n2);
            stringBuilder.append(" -- ");
            stringBuilder.append(string);
            SampleAlarmReceiver.a(stringBuilder.toString());
            if (Build.VERSION.SDK_INT >= 23) {
                SampleAlarmReceiver.a("1234");
                alarmManager.setExactAndAllowWhileIdle(0, l2, SampleAlarmReceiver.b(context, n2, string));
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                SampleAlarmReceiver.a("2345");
                alarmManager.setExact(0, l2, SampleAlarmReceiver.b(context, n2, string));
                return;
            }
            SampleAlarmReceiver.a("3456");
            alarmManager.set(0, l2, SampleAlarmReceiver.b(context, n2, string));
        }
    }

    private static void a(Context context, long l2, String string, int n2, String string2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (alarmManager != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("1111 PNR ALARM SET PNR_ALARM_TYPE: ");
            stringBuilder.append(string2);
            stringBuilder.append(" triggerAtMillis:");
            stringBuilder.append(l2);
            Log.d((String)"1111", (String)stringBuilder.toString());
            if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, l2, SampleAlarmReceiver.a(context, string, n2, string2));
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, l2, SampleAlarmReceiver.a(context, string, n2, string2));
                return;
            }
            alarmManager.set(0, l2, SampleAlarmReceiver.a(context, string, n2, string2));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(Context var1_1, Intent var2_2) {
        block9 : {
            block7 : {
                block8 : {
                    var3_3 = new c(var1_1);
                    var4_4 = var2_2.getStringExtra("PNR_ALARM");
                    var5_5 = var4_4.hashCode();
                    if (var5_5 == -2047652524) break block7;
                    if (var5_5 == -904497617) break block8;
                    if (var5_5 != 225105687 || !var4_4.equals((Object)"PNR_ALARM_2_HOURS_BEFORE_STICKY_NOTIFICATION")) ** GOTO lbl-1000
                    var6_6 = 2;
                    break block9;
                }
                if (!var4_4.equals((Object)"PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY")) ** GOTO lbl-1000
                var6_6 = 0;
                break block9;
            }
            if (var4_4.equals((Object)"PNR_ALARM_ROUTINE_CHECK")) {
                var6_6 = 1;
            } else lbl-1000: // 3 sources:
            {
                var6_6 = -1;
            }
        }
        switch (var6_6) {
            default: {
                return;
            }
            case 2: {
                var13_7 = new StringBuilder();
                var13_7.append("PNR_ALARM_2_HOURS_BEFORE_STICKY_NOTIFICATION ALARM RECEIVED for pnr: ");
                var13_7.append(var2_2.getStringExtra("pnr"));
                SampleAlarmReceiver.a(var13_7.toString());
                var16_8 = var2_2.getIntExtra("id", -1);
                var3_3.b(var16_8);
                PnrNotification2HoursBeforeActionReceiver.a((Context)var1_1, (String)var2_2.getStringExtra("pnr"), (int)var16_8);
                return;
            }
            case 1: {
                var8_9 = new StringBuilder();
                var8_9.append("ROUTINE ALARM RECEIVED for pnr: ");
                var8_9.append(var2_2.getStringExtra("pnr"));
                SampleAlarmReceiver.a(var8_9.toString());
                var11_10 = new Intent(var1_1, GetPnrStatusService.class);
                var11_10.putExtra("pnr", var2_2.getStringExtra("pnr"));
                GetPnrStatusService.a((Context)var1_1, (Intent)var11_10);
                return;
            }
            case 0: 
        }
        SampleAlarmReceiver.a("SHOW SHOWNOTIFICATION");
        var7_11 = var2_2.getIntExtra("id", -1);
        ActivityAlarmRing.b((Context)var1_1, (int)var7_11, (String)var2_2.getStringExtra("pnr"));
        var3_3.b(var7_11);
    }

    public static void a(Context context, String string, long l2, String string2) {
        int n2 = SampleAlarmReceiver.a(string, string2);
        if (n2 != -1) {
            new c(context).a(string, null, n2, "PNR", l2, string2);
            SampleAlarmReceiver.a(context, l2, string, n2, string2);
        }
    }

    public static void a(Context context, String string, c c2) {
        int n2;
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n3 = SampleAlarmReceiver.a(string, "PNR_ALARM_ROUTINE_CHECK");
        int n4 = SampleAlarmReceiver.a(string, "PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY");
        if (alarmManager != null) {
            alarmManager.cancel(SampleAlarmReceiver.a(context, string, n3, "PNR_ALARM_ROUTINE_CHECK"));
            alarmManager.cancel(SampleAlarmReceiver.a(context, string, n4, "PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY"));
        }
        if ((n2 = c2.a(string)) != -1) {
            SampleAlarmReceiver.a(context, n2, "STATION_ALARM_VIA_PNR");
        }
        GetPeriodicLocationReceiver.a(context, string);
        c2.e(string);
    }

    public static void a(Context context, String string, String string2, int n2, String string3, long l2, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("add stn alarm ");
        stringBuilder.append(string);
        stringBuilder.append(" -- ");
        stringBuilder.append(string2);
        stringBuilder.append(" -- ");
        stringBuilder.append(n2);
        stringBuilder.append(" -- ");
        stringBuilder.append(string3);
        stringBuilder.append(" -- ");
        stringBuilder.append(SampleAlarmReceiver.a(l2));
        stringBuilder.append(" -- ");
        stringBuilder.append(string4);
        SampleAlarmReceiver.a(stringBuilder.toString());
        new c(context).a(string, string2, n2, string3, l2, string4);
        SampleAlarmReceiver.a(context, l2, n2, string4);
    }

    private static void a(String string) {
        Log.d((String)"AlarmReceiver", (String)string);
    }

    private static PendingIntent b(Context context, int n2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("get pending intent  -- ");
        stringBuilder.append(n2);
        stringBuilder.append(" -- ");
        stringBuilder.append(string);
        SampleAlarmReceiver.a(stringBuilder.toString());
        Intent intent = new Intent(context, ActivityAlarmRing.class);
        intent.addFlags(805306368);
        intent.putExtra("id", n2);
        return PendingIntent.getActivity((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
    }

    public static void b(Context context, String string, c c2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n2 = SampleAlarmReceiver.a(string, "PNR_ALARM_ROUTINE_CHECK");
        int n3 = SampleAlarmReceiver.a(string, "PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY");
        if (alarmManager != null) {
            alarmManager.cancel(SampleAlarmReceiver.a(context, string, n2, "PNR_ALARM_ROUTINE_CHECK"));
            alarmManager.cancel(SampleAlarmReceiver.a(context, string, n3, "PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY"));
            c2.f(string);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onReceive(Context context, Intent intent) {
        SampleAlarmReceiver.a("SampleAlarmReceiver");
        if (intent == null) return;
        try {
            SampleAlarmReceiver.a("SampleAlarmReceiver2");
            if (!intent.hasExtra("PNR_ALARM") || SmsReceiver.a(context)) return;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("local alarm received for pnr: ");
            stringBuilder.append(intent.getStringExtra("pnr"));
            stringBuilder.append(" id: ");
            stringBuilder.append(intent.getIntExtra("id", -1));
            SampleAlarmReceiver.a(stringBuilder.toString());
            this.a(context, intent);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("1111 Exception in SampleAlarmReceiver ");
            stringBuilder.append(exception.getMessage());
            Log.d((String)"1111", (String)stringBuilder.toString(), (Throwable)exception);
        }
    }
}

