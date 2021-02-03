/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.telephony.SmsManager
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.mulo.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.safety.SafetyUI2;
import java.util.ArrayList;

public class i {
    public static void a(Context context, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("smsto:");
        stringBuilder.append(string);
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse((String)stringBuilder.toString()));
        intent.putExtra("sms_body", string2);
        context.startActivity(intent);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void b(Context context, String string, String string2) {
        if (h.a(context, SafetyUI2.a)) {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendMultipartTextMessage(string, null, smsManager.divideMessage(string2), null, null);
            return;
        }
        if (context instanceof Activity) {
            h.a((Activity)context, "SMS", SafetyUI2.a, 108);
            return;
        }
        n.d(context, context.getString(2131755359));
        i.a(context, string, string2);
        return;
        catch (Exception exception) {}
    }
}

