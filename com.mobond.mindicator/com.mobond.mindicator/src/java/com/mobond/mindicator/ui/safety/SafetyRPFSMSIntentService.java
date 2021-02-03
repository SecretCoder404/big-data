/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Intent
 *  android.util.Log
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.mobond.mindicator.ui.safety;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class SafetyRPFSMSIntentService
extends IntentService {
    IntentService a = this;

    public SafetyRPFSMSIntentService() {
        super("SafetyRPFSMSIntentService");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d((String)"SafetyRPFSMSIntentService", (String)"SafetyRPFSMSIntentService onDestroy called: ");
    }

    protected void onHandleIntent(Intent intent) {
        Log.d((String)"SafetyRPFSMSIntentService", (String)"SafetyRPFSMSIntentService onHandleIntent called 11");
        intent.getStringExtra("key_phonenumber");
        intent.getStringExtra("key_custommessage");
        try {
            this.a.stopSelf();
            return;
        }
        catch (Throwable throwable) {
            Log.d((String)"SafetyRPFSMSIntentService", (String)"SafetyRPFSMSIntentService Exception", (Throwable)throwable);
            return;
        }
    }
}

