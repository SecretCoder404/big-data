/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  com.mobond.mindicator.ui.indianrail.alarm.c
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package com.mobond.mindicator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.mobond.mindicator.GetPeriodicLocationReceiver;
import com.mobond.mindicator.SampleAlarmReceiver;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import java.util.ArrayList;
import java.util.Iterator;

public class SampleBootReceiver
extends BroadcastReceiver {
    private void a(Context context) {
        ArrayList arrayList = new c(context).c();
        if (arrayList != null) {
            Iterator iterator = arrayList.iterator();
            String string = null;
            while (iterator.hasNext()) {
                com.mobond.mindicator.ui.indianrail.alarm.c c2 = (com.mobond.mindicator.ui.indianrail.alarm.c)iterator.next();
                if (!c2.f.equals((Object)"STATION_ALARM_MANUAL") && !c2.f.equals((Object)"STATION_ALARM_VIA_PNR")) {
                    if (!(c2.f.equals((Object)"PNR_ALARM_ROUTINE_CHECK") || c2.f.equals((Object)"PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY") || c2.f.equals((Object)"PNR_ALARM_2_HOURS_BEFORE_STICKY_NOTIFICATION"))) {
                        if (c2.f.equals((Object)"START_PERIODIC_LOCATION_ALARM")) {
                            if (System.currentTimeMillis() < c2.b) {
                                GetPeriodicLocationReceiver.a(context, c2.c, c2.d, c2.b);
                                continue;
                            }
                            string = c2.c;
                            continue;
                        }
                        if (!c2.f.equals((Object)"END_PERIODIC_LOCATION_ALARM") || System.currentTimeMillis() >= c2.b) continue;
                        GetPeriodicLocationReceiver.b(context, c2.c, c2.d, c2.b);
                        if (string == null || !string.equals((Object)c2.c)) continue;
                        GetPeriodicLocationReceiver.a(context, c2.c, c2.d, -1L);
                        continue;
                    }
                    SampleAlarmReceiver.a(context, c2.c, c2.b, c2.f);
                    continue;
                }
                SampleAlarmReceiver.a(context, c2.c, c2.d, c2.a, c2.e, c2.b, c2.f);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals((Object)"android.intent.action.BOOT_COMPLETED")) {
            SampleAlarmReceiver.a(context);
            this.a(context);
        }
    }
}

