/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.telephony.TelephonyManager
 *  android.util.Log
 *  com.mulo.b.e
 *  com.mulo.b.i
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Calendar
 *  java.util.GregorianCalendar
 */
package com.mobond.mindicator.ui.safety;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.safety.DialogLauncherActivity;
import com.mulo.b.e;
import com.mulo.b.i;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MissedCallReceiver
extends BroadcastReceiver {
    static String a;
    Context b;

    private int a(Context context, String string, String string2) {
        String string3 = a.a(context).b(string2);
        String string4 = this.c();
        if (string3 != null && !string3.split(":")[0].equals((Object)string4.split(":")[0])) {
            a.a(context).b(string, "0");
        }
        a.a(context).b(string2, string4);
        String string5 = a.a(context).b(string);
        int n2 = 0;
        if (string5 != null) {
            n2 = Integer.parseInt((String)string5);
        }
        int n3 = n2 + 1;
        b b2 = a.a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n3);
        b2.b(string, stringBuilder.toString());
        return n3;
    }

    public static void a(Context context, String string) {
        if (string != null) {
            String string2;
            if (string.length() >= 10) {
                string.substring(string.length() - 10, string.length());
            }
            if ((string2 = a.a(context).b("sr_relatives_mobile_number_key")) != null && string2.length() >= 10) {
                string2 = string2.substring(string2.length() - 10, string2.length());
            }
            if (string2 != null && string2.contains((CharSequence)string2)) {
                a.a(context).b("safetycontact1numbercallcount_key", "0");
            }
        }
    }

    private void a(Context context, String string, String string2, String string3, String string4) {
        String string5;
        if (string != null && a != null && a.contains((CharSequence)(string5 = string.length() >= 10 ? string.substring(string.length() - 10, string.length()) : string)) && this.a(context, string2, string3) >= 2) {
            if (h.a(context, "android.permission.SEND_SMS")) {
                this.b(context, string, string4);
                return;
            }
            n.d(context, context.getString(2131755233));
        }
    }

    private void b(Context context, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Automated SMS by m-Indicator: My Approx location is http://m.mobond.com/safe?loid=");
        stringBuilder.append(e.b((Context)context));
        stringBuilder.append(" . ");
        stringBuilder.append(com.mulo.util.e.b());
        i.b((Context)context, (String)string, (String)stringBuilder.toString());
        Intent intent = new Intent(context, DialogLauncherActivity.class);
        intent.putExtra("contactnumber", string);
        intent.putExtra("contactname", string2);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private String c() {
        Calendar calendar = GregorianCalendar.getInstance();
        int n2 = calendar.get(11);
        int n3 = calendar.get(12);
        if (n2 <= 8) {
            calendar.add(5, -1);
        }
        int n4 = calendar.get(1);
        int n5 = calendar.get(2);
        int n6 = calendar.get(5);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n4);
        stringBuilder.append("");
        stringBuilder.append(n5);
        stringBuilder.append("");
        stringBuilder.append(n6);
        stringBuilder.append(":");
        stringBuilder.append(n2);
        stringBuilder.append(":");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public void a(boolean bl) {
        a.a(this.b).b("safety_isringing_key", bl);
    }

    public boolean a() {
        return a.a(this.b).c("safety_isringing_key");
    }

    public void b(boolean bl) {
        a.a(this.b).b("safety_isreceived_key", bl);
    }

    public boolean b() {
        return a.a(this.b).c("safety_isreceived_key");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceive(Context context, Intent intent) {
        try {
            String string;
            if (intent.getAction() == null) return;
            if (!intent.getAction().equals((Object)"android.intent.action.PHONE_STATE")) return;
            this.b = context;
            int n2 = GregorianCalendar.getInstance().get(11);
            if (n2 < 21) {
                if (n2 >= 8) return;
            }
            if ((string = intent.getStringExtra("state")) == null) {
                return;
            }
            if (string.equals((Object)TelephonyManager.EXTRA_STATE_RINGING)) {
                this.a(true);
                this.b(false);
                Bundle bundle = intent.getExtras();
                if (bundle != null && (a = bundle.getString("incoming_number")) != null) {
                    a = a.replaceAll("[^+0-9]", "");
                }
            }
            if (string.equals((Object)TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                this.b(true);
                this.a(false);
                MissedCallReceiver.a(context, a);
            }
            if (!string.equals((Object)TelephonyManager.EXTRA_STATE_IDLE)) return;
            if (this.a() && !this.b()) {
                this.a(false);
                String string2 = a.a(context).b("sr_relatives_mobile_number_key");
                if (string2 != null) {
                    this.a(context, string2, "safetycontact1numbercallcount_key", "safetycontact1numberlastcalltime_key", string2);
                }
            }
            if (!this.b()) return;
            this.b(false);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"MissedCallReceiver", (String)"MissedCallReceiver Exception", (Throwable)exception);
        }
    }
}

