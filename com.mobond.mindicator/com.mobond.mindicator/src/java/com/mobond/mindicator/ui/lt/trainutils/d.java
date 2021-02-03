/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.mobond.mindicator.ui.lt.trainutils.AlarmReceiver;

public class d {
    private static SharedPreferences a;

    /*
     * Exception decompiling
     */
    private static int a(String var0, com.mobond.mindicator.ui.d var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl25 : NEW : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static void a(Context context, String string, String string2) {
        if (a == null) {
            a = context.getSharedPreferences("station_alarm_pref", 0);
        }
        SharedPreferences.Editor editor = a.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        editor.remove(stringBuilder.toString());
        editor.apply();
    }

    public static void a(String string, String string2, long l2, com.mobond.mindicator.ui.d d2, Context context) {
        int n2 = d.a(string2, d2);
        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.setAction("station_alarm");
        intent.putExtra("station", string);
        intent.putExtra("tn", d2.s);
        intent.putExtra("time", string2);
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (alarmManager != null) {
            int n3 = Build.VERSION.SDK_INT;
            if (n3 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, l2, pendingIntent);
            } else if (n3 >= 19) {
                alarmManager.setExact(0, l2, pendingIntent);
            } else {
                alarmManager.set(0, l2, pendingIntent);
            }
        }
        d.c(context, d2.s, string);
    }

    public static void a(String string, String string2, com.mobond.mindicator.ui.d d2, Context context) {
        int n2 = d.a(string2, d2);
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra("station", string);
        intent.putExtra("tn", d2.s);
        intent.setAction("station_alarm");
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)268435456);
        if (alarmManager != null) {
            alarmManager.cancel(pendingIntent);
        }
        d.a(context, d2.s, string);
    }

    public static boolean b(Context context, String string, String string2) {
        if (a == null) {
            a = context.getSharedPreferences("station_alarm_pref", 0);
        }
        SharedPreferences sharedPreferences = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        return sharedPreferences.getBoolean(stringBuilder.toString(), false);
    }

    private static void c(Context context, String string, String string2) {
        if (a == null) {
            a = context.getSharedPreferences("station_alarm_pref", 0);
        }
        SharedPreferences.Editor editor = a.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        editor.putBoolean(stringBuilder.toString(), true);
        editor.apply();
    }
}

