/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.core.app.h
 *  androidx.core.app.h$c
 *  androidx.core.app.h$d
 *  androidx.core.app.h$e
 *  com.mobond.mindicator.ui.WebUI
 *  com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.e$1$1
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.e$2
 *  com.mobond.mindicator.ui.indianrail.util.a
 *  com.mulo.b.a
 *  com.mulo.b.c
 *  com.mulo.b.d
 *  com.mulo.b.h
 *  com.mulo.b.i
 *  com.mulo.util.g
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Calendar
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.app.h;
import com.mobond.mindicator.SampleAlarmReceiver;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.irplugin.PNRCallbacks;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.pnrstatus.e;
import com.mobond.mindicator.ui.indianrail.pnrstatus.g;
import com.mobond.mindicator.ui.indianrail.util.a;
import com.mulo.b.d;
import com.mulo.b.h;
import com.mulo.b.i;
import java.util.Calendar;
import org.json.JSONObject;

public class e {
    private String a;
    private a b;
    private Activity c;
    private Context d;
    private boolean e = false;
    private ProgressDialog f;
    private c g;

    public e(Activity activity, String string, a a2, Context context, boolean bl) {
        try {
            this.c = activity;
            this.b = a2;
            this.a = string;
            this.d = context;
            this.e = bl;
            this.g = new c(context);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private JSONObject a(String string) {
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.getBoolean("success")) {
                    return new g(jSONObject.getJSONObject("data")).a();
                }
                throw new Exception("null Railofy ");
            }
            catch (Exception exception) {
                throw new Exception("null Railofy ");
            }
        }
        throw new Exception("null Railofy ");
    }

    static void a(Context context, String string, String string2) {
        String[] arrstring = new c(context).b(string);
        if (arrstring != null) {
            int n2 = (int)Long.parseLong((String)string);
            NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            Intent intent = new Intent(context, ActivityPnrStatus.class);
            intent.setFlags(268435456);
            intent.putExtra("json", arrstring[0]);
            intent.putExtra("s_date", arrstring[1]);
            intent.putExtra("pnr", string);
            PendingIntent pendingIntent = PendingIntent.getActivity((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
            Bitmap bitmap = BitmapFactory.decodeResource((Resources)context.getResources(), (int)2131231213);
            h.d d2 = com.mobond.mindicator.g.a(context, notificationManager, null, false).a(ActivityAlarmRing.a());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getString(2131755322));
            stringBuilder.append(" ");
            stringBuilder.append(string);
            h.d d3 = d2.a((CharSequence)stringBuilder.toString()).b((CharSequence)string2).a(bitmap).e(context.getResources().getColor(2131099880)).d(true).a(pendingIntent);
            if (Build.VERSION.SDK_INT >= 16) {
                d3.d(2);
                d3.a((h.e)new h.c().a((CharSequence)string2));
            }
            if (notificationManager != null) {
                notificationManager.notify(n2, d3.b());
            }
        }
    }

    private void a(Context context, JSONObject jSONObject) {
        int n2 = jSONObject.getInt("days_diff");
        long l2 = jSONObject.getLong("next_alarm_time");
        if (l2 != -1L) {
            SampleAlarmReceiver.a(context, this.a, l2, "PNR_ALARM_ROUTINE_CHECK");
        }
        this.g.a(this.a, jSONObject.toString(), (Activity)this.b, jSONObject.getString("title_text"), jSONObject.getBoolean("is_all_confirmed"), jSONObject.getBoolean("schedule_1_hr_prior_dep_query"), jSONObject.getLong("date_in_millis"), n2);
        if (jSONObject.getBoolean("is_all_canmod") || jSONObject.getBoolean("chart_prepared") && !jSONObject.getBoolean("is_anyone_confirmed")) {
            SampleAlarmReceiver.a(context, this.a, this.g);
        }
        long l3 = 86400000L + System.currentTimeMillis();
        boolean bl = jSONObject.getLong("date_in_millis") < l3;
        if (bl) {
            SampleAlarmReceiver.b(context, this.a, this.g);
        }
    }

    static /* synthetic */ void a(e e2, String string) {
        e2.c(string);
    }

    private void a(String string, String string2, String string3) {
        SharedPreferences.Editor editor = this.d.getSharedPreferences("", 0).edit();
        editor.putString("pnr_url", string);
        editor.putString("pnr_param_1", string2);
        editor.putString("pnr_param_2", string3);
        editor.apply();
    }

    private void b() {
        this.c.runOnUiThread(new Runnable(){

            public void run() {
                IRParserProvider.getIRParser().getPNRResults(e.this.c, e.this.a, (PNRCallbacks)new 1(this));
            }
        });
    }

    static /* synthetic */ void b(e e2, String string) {
        e2.e(string);
    }

    private void b(String string) {
        ProgressDialog progressDialog = new ProgressDialog((Context)this.c);
        progressDialog.setMessage((CharSequence)"Loading..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        h h2 = new h();
        h2.a("utm_source", "mindicator");
        h2.a("utm_medium", "display");
        h2.a("utm_campaign", "pnrpartner");
        h2.a("pnr", string);
        h2.a("utm_content", "flightattrainprice");
        d d2 = new d();
        d2.a("x-api-key", "d893R7eLvt9i8ZF1MRRC52voJQLuUJ5da5REE70K");
        com.mulo.b.c.b((String)"https://odinsword.railofy.com/v1/getRailofyTravelGuarantee/?", (h)h2, (d)d2, (com.mulo.b.a)new 2(this, progressDialog));
    }

    static /* synthetic */ JSONObject c(e e2, String string) {
        return e2.a(string);
    }

    private void c() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = this.g.g(this.a);
        long l2 = calendar2 != null ? (calendar.compareTo(calendar2) <= 0 ? 7200000L + System.currentTimeMillis() : -1L) : 7200000L + System.currentTimeMillis();
        if (l2 != -1L) {
            SampleAlarmReceiver.a(this.d, this.a, l2, "PNR_ALARM_ROUTINE_CHECK");
        }
    }

    static /* synthetic */ void c(e e2) {
        e2.b();
    }

    /*
     * Exception decompiling
     */
    private void c(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CASE]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    private void d(String string) {
        Intent intent = new Intent((Context)this.b, WebUI.class);
        com.mulo.util.g g2 = new com.mulo.util.g();
        com.mulo.util.e.a(g2.a(), g2);
        g2.a = "http://www.indianrail.gov.in/enquiry/PnrEnquiry.html";
        g2.g = false;
        intent.putExtra("webuidatakey", g2.a());
        intent.putExtra("webuiurlkey", "http://www.indianrail.gov.in/enquiry/PnrEnquiry.html");
        this.b.startActivity(intent);
    }

    private void e(String string) {
        a a2 = this.b;
        if (a2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PNR ");
            stringBuilder.append(string.trim());
            i.a((Context)a2, (String)"139", (String)stringBuilder.toString());
        }
    }

    public void a() {
        if (com.mulo.b.c.a((Activity)this.c)) {
            if (b.a()) {
                try {
                    this.b(this.a);
                    return;
                }
                catch (Exception exception) {
                    this.b();
                    return;
                }
            }
            this.b();
        }
    }

}

