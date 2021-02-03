/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.telephony.TelephonyManager
 *  com.mobond.mindicator.ui.lt.DialogActivity
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Calendar
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.lt.DialogActivity;
import com.mobond.mindicator.ui.lt.trainutils.b;
import com.mobond.mindicator.ui.lt.trainutils.f;
import java.util.Calendar;

public class AlarmReceiver
extends BroadcastReceiver {
    private void a(Context context, String string, String string2) {
        String string3 = string2.substring(0, -2 + string2.length());
        String string4 = string2.substring(-2 + string2.length());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(" ");
        stringBuilder.append(string4);
        stringBuilder.append(" Arriving ");
        stringBuilder.append(string);
        String string5 = stringBuilder.toString();
        Intent intent = new Intent(context, DialogActivity.class);
        intent.putExtra("message", string5);
        intent.putExtra("title", "Station Alarm!");
        intent.setFlags(268435456);
        intent.setAction("staion_alarm");
        context.startActivity(intent);
    }

    public static boolean a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        if (telephonyManager.getCallState() == 0) {
            return false;
        }
        if (telephonyManager.getCallState() != 2) {
            return telephonyManager.getCallState() == 1;
        }
        return true;
    }

    public static boolean a(d d2, Context context) {
        d d3 = f.a(d2.s, d2.v.split("-")[0].trim(), d2.v.split("-")[1].trim(), context);
        if (d3 == null) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d3.b.split(" ")[0]);
        stringBuilder.append(d3.b.split(" ")[1]);
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(d2.b.split(" ")[0]);
        stringBuilder2.append(d2.b.split(" ")[1]);
        return string.equals((Object)stringBuilder2.toString());
    }

    public boolean a(Context context, String string) {
        String string2 = new b(context).d(string);
        int n2 = Calendar.getInstance().get(7);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append("");
        return string2.contains((CharSequence)stringBuilder.toString());
    }

    /*
     * Exception decompiling
     */
    public void onReceive(Context var1, Intent var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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
}

