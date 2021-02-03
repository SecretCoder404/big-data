/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.location.Location
 *  android.location.LocationManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  com.mobond.mindicator.GetPeriodicLocationReceiver$1
 *  com.mobond.mindicator.GetPeriodicLocationReceiver$2
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.c
 *  com.mulo.b.a
 *  com.mulo.b.c
 *  com.mulo.b.h
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.mobond.mindicator;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import com.mobond.mindicator.GetPeriodicLocationReceiver;
import com.mobond.mindicator.SampleAlarmReceiver;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mulo.b.a;

public class GetPeriodicLocationReceiver
extends BroadcastReceiver {
    static /* synthetic */ void a(Context context, Location location, String string, int n2) {
        GetPeriodicLocationReceiver.b(context, location, string, n2);
    }

    public static void a(Context context, String string) {
        int n2 = SampleAlarmReceiver.a(string, "START_PERIODIC_LOCATION_ALARM");
        int n3 = SampleAlarmReceiver.a(string, "END_PERIODIC_LOCATION_ALARM");
        GetPeriodicLocationReceiver.d(context, string, n2);
        GetPeriodicLocationReceiver.f(context, string, n3);
    }

    public static void a(Context context, String string, int n2) {
        1 var3_3 = new 1(context, string, n2);
        var3_3.a(8000L);
        var3_3.b(8000L);
        var3_3.a(100);
        var3_3.b(context);
    }

    public static void a(Context context, String string, int n2, long l2) {
        AlarmManager alarmManager;
        GetPeriodicLocationReceiver.d(context, string, n2);
        if (l2 == -1L) {
            l2 = 15000L + System.currentTimeMillis();
        }
        if ((alarmManager = (AlarmManager)context.getSystemService("alarm")) != null) {
            int n3 = Build.VERSION.SDK_INT;
            if (n3 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, l2, GetPeriodicLocationReceiver.c(context, string, n2));
                return;
            }
            if (n3 >= 19) {
                alarmManager.setExact(0, l2, GetPeriodicLocationReceiver.c(context, string, n2));
                return;
            }
            alarmManager.set(0, l2, GetPeriodicLocationReceiver.c(context, string, n2));
        }
    }

    public static void a(Context context, String string, String string2, long l2) {
        if (l2 == -1L) {
            l2 = 15000L + System.currentTimeMillis();
        }
        int n2 = SampleAlarmReceiver.a(string, "START_PERIODIC_LOCATION_ALARM");
        c c2 = new c(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JOURNEY_START ");
        stringBuilder.append(string);
        c2.a(string, string2, n2, stringBuilder.toString(), l2, "START_PERIODIC_LOCATION_ALARM");
        GetPeriodicLocationReceiver.a(context, string, n2, l2);
    }

    public static boolean a(Context context) {
        return GetPeriodicLocationReceiver.e(context) > 15;
    }

    private static void b(Context context, Location location, String string, int n2) {
        com.mulo.b.h h2 = new com.mulo.b.h();
        h2.a("is_auto", "true");
        h2.a("pnr", string);
        if (location != null) {
            h2.a("lat", String.valueOf((double)location.getLatitude()));
            h2.a("lon", String.valueOf((double)location.getLongitude()));
        }
        com.mulo.b.c.a((String)"http://mobondhrd.appspot.com/irputrunningstatus", (com.mulo.b.h)h2, null, (a)new 2(context, string, n2), null, null, (Context)context, null);
    }

    public static void b(Context context, String string) {
        GetPeriodicLocationReceiver.a(context, string);
        new c(context).c(string);
    }

    static /* synthetic */ void b(Context context, String string, int n2) {
        GetPeriodicLocationReceiver.d(context, string, n2);
    }

    public static void b(Context context, String string, String string2, long l2) {
        int n2 = SampleAlarmReceiver.a(string, "END_PERIODIC_LOCATION_ALARM");
        c c2 = new c(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JOURNEY_END ");
        stringBuilder.append(string);
        c2.a(string, string2, n2, stringBuilder.toString(), l2, "END_PERIODIC_LOCATION_ALARM");
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (alarmManager != null) {
            int n3 = Build.VERSION.SDK_INT;
            if (n3 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, l2, GetPeriodicLocationReceiver.e(context, string, n2));
                return;
            }
            if (n3 >= 19) {
                alarmManager.setExact(0, l2, GetPeriodicLocationReceiver.e(context, string, n2));
                return;
            }
            alarmManager.set(0, l2, GetPeriodicLocationReceiver.e(context, string, n2));
        }
    }

    public static boolean b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            boolean bl2 = false;
            if (networkInfo != null) {
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    private static PendingIntent c(Context context, String string, int n2) {
        Intent intent = new Intent(context, GetPeriodicLocationReceiver.class);
        intent.putExtra("id", n2);
        intent.putExtra("pnr", string);
        intent.setAction("com.mobond.mindicator.intent.action.START_ALARM");
        return PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)268435456);
    }

    public static boolean c(Context context) {
        LocationManager locationManager = (LocationManager)context.getSystemService("location");
        return locationManager != null && locationManager.isProviderEnabled("gps");
    }

    private static void d(Context context, String string, int n2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (alarmManager != null) {
            alarmManager.cancel(GetPeriodicLocationReceiver.c(context, string, n2));
        }
    }

    public static boolean d(Context context) {
        return true ^ Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"mock_location").equals((Object)"0");
    }

    public static int e(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent = context.getApplicationContext().registerReceiver(null, intentFilter);
        int n2 = -1;
        int n3 = intent != null ? intent.getIntExtra("level", n2) : -1;
        if (intent != null) {
            n2 = intent.getIntExtra("scale", n2);
        }
        return (int)(100.0f * ((float)n3 / (float)n2));
    }

    private static PendingIntent e(Context context, String string, int n2) {
        Intent intent = new Intent(context, GetPeriodicLocationReceiver.class);
        intent.putExtra("id", n2);
        intent.putExtra("pnr", string);
        intent.setAction("com.mobond.mindicator.intent.action.CANCEL_ALARM");
        return PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)268435456);
    }

    private static void f(Context context, String string, int n2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (alarmManager != null) {
            alarmManager.cancel(GetPeriodicLocationReceiver.e(context, string, n2));
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null) {
            int n2 = intent.getIntExtra("id", -1);
            String string = intent.getStringExtra("pnr");
            if (intent.getAction().equals((Object)"com.mobond.mindicator.intent.action.START_ALARM")) {
                if (GetPeriodicLocationReceiver.a(context) && GetPeriodicLocationReceiver.b(context)) {
                    GetPeriodicLocationReceiver.b(context, null, string, n2);
                    if (h.a(context, "android.permission.ACCESS_FINE_LOCATION") && GetPeriodicLocationReceiver.c(context) && !GetPeriodicLocationReceiver.d(context)) {
                        GetPeriodicLocationReceiver.a(context, string, n2);
                    }
                }
                GetPeriodicLocationReceiver.a(context, string, n2, -1L);
                return;
            }
            if (intent.getAction().equals((Object)"com.mobond.mindicator.intent.action.CANCEL_ALARM")) {
                GetPeriodicLocationReceiver.b(context, string);
            }
        }
    }
}

