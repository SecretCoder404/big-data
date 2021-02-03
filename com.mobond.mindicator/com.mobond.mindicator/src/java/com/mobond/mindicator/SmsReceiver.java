/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  android.telephony.SmsMessage
 *  android.util.Log
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrInput
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.mobond.mindicator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrInput;

public class SmsReceiver
extends BroadcastReceiver {
    public static boolean a(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage("com.mobond.mindicator.ui.indianrail") != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onReceive(Context context, Intent intent) {
        Object[] arrobject;
        Log.d((String)"SmsReceiver", (String)"onReceive: 0000");
        if (intent.getAction() == null || !intent.getAction().equals((Object)"android.provider.Telephony.SMS_RECEIVED") || intent.getExtras() == null || (arrobject = (Object[])intent.getExtras().get("pdus")) == null) return;
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string;
            try {
                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[])((byte[])arrobject[i2]));
                String string2 = smsMessage.getDisplayOriginatingAddress();
                String string3 = smsMessage.getDisplayMessageBody();
                string = IRParserProvider.getIRParser().extractPnrFromSMS(string2, string3);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("1111 pnrStr:");
                stringBuilder.append(string);
                Log.d((String)"SmsReceiver", (String)stringBuilder.toString());
                if (string == null) continue;
            }
            catch (Exception exception) {
                Log.d((String)"SmsReceiver", (String)"SmsReceiver Exception", (Throwable)exception);
                return;
            }
            if (ActivityPnrInput.b((Context)context, (String)string)) continue;
            SmsReceiver.a(context);
        }
    }
}

