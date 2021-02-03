/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  androidx.core.app.e
 *  java.lang.String
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus.servicesreceivers;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.e;

public class GetPnrStatusService
extends e {
    public static void a(Context context, Intent intent) {
        GetPnrStatusService.a((Context)context, GetPnrStatusService.class, (int)1000, (Intent)intent);
    }

    public static void a(Context context, String string) {
    }

    protected void a(Intent intent) {
        GetPnrStatusService.a((Context)this, intent.getStringExtra("pnr"));
    }
}

