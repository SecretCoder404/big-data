/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.widget.RemoteViews
 *  androidx.core.app.h
 *  androidx.core.app.h$d
 *  com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.h;
import com.mobond.mindicator.g;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule;
import org.json.JSONArray;
import org.json.JSONObject;

public class PnrNotification2HoursBeforeActionReceiver
extends BroadcastReceiver {
    public static void a(Context context, String string, int n2) {
        NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        Intent intent = new Intent(context, ActivityPnrStatus.class);
        intent.setFlags(268435456);
        intent.putExtra("pnr", string);
        String[] arrstring = new c(context).b(string);
        if (arrstring != null) {
            int n3;
            intent.putExtra("json", arrstring[0]);
            intent.putExtra("s_date", arrstring[1]);
            intent.putExtra("pnr", string);
            intent.putExtra("doReload", false);
            PendingIntent pendingIntent = PendingIntent.getActivity((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
            JSONObject jSONObject = new JSONObject(arrstring[0]);
            String string2 = jSONObject.getString("train_number");
            String string3 = jSONObject.getString("from").replaceAll("\\s+", "");
            String string4 = jSONObject.getString("to").replaceAll("\\s+", "");
            JSONArray jSONArray = jSONObject.getJSONArray("passengers");
            String string5 = jSONArray.length() > 0 ? jSONArray.getJSONObject(0).optString("coach_position") : null;
            String string6 = arrstring[2];
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131493111);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getString(2131755322));
            stringBuilder.append("- ");
            stringBuilder.append(string);
            remoteViews.setTextViewText(2131297121, (CharSequence)stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string6);
            stringBuilder2.append(" ");
            stringBuilder2.append(string3);
            stringBuilder2.append("-");
            stringBuilder2.append(string4);
            stringBuilder2.append(" ");
            stringBuilder2.append(context.getString(2131755371));
            stringBuilder2.append(" ");
            stringBuilder2.append(string2);
            remoteViews.setTextViewText(2131297120, (CharSequence)stringBuilder2.toString());
            remoteViews.setTextViewText(2131297262, (CharSequence)context.getString(2131755373));
            Intent intent2 = new Intent(context, ActivityTrainSchedule.class);
            intent2.setFlags(268435456);
            intent2.putExtra("num", string2);
            intent2.putExtra("boardingStnCode", string3);
            if (string5 != null) {
                intent2.putExtra("coach_pos", string5);
            }
            intent2.putExtra("page_pos", 0);
            remoteViews.setOnClickPendingIntent(2131296521, PendingIntent.getActivity((Context)context.getApplicationContext(), (int)12345, (Intent)intent2, (int)134217728));
            Intent intent3 = new Intent(context, PnrNotification2HoursBeforeActionReceiver.class);
            intent3.putExtra("notification_id_key", n2);
            intent3.setAction("DISMISS_ACTION");
            remoteViews.setOnClickPendingIntent(2131296565, PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)12345, (Intent)intent3, (int)134217728));
            h.d d2 = g.a(context, notificationManager, null, false).a(pendingIntent).c((CharSequence)context.getString(2131755070)).a(ActivityAlarmRing.a()).a(remoteViews).d(true);
            if (Build.VERSION.SDK_INT >= 16) {
                n3 = 2;
                d2.d(n3);
            } else {
                n3 = 2;
            }
            Notification notification = d2.b();
            notification.flags = n3;
            if (notificationManager != null) {
                notificationManager.notify(n2, notification);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void onReceive(Context var1, Intent var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl26 : RETURN : trying to set 1 previously set to 0
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
}

