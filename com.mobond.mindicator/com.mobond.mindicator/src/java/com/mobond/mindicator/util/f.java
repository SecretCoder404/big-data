/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  androidx.h.a.a
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.h.a.a;
import com.mobond.mindicator.util.d;
import com.mobond.mindicator.util.g;

public class f {
    private d a;
    private BroadcastReceiver b = new BroadcastReceiver(){

        public void onReceive(Context context, Intent intent) {
            if (f.this.a != null) {
                boolean bl = g.b(context);
                String string = intent.getAction();
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals((Object)string) || "android.net.wifi.WIFI_STATE_CHANGED".equals((Object)string)) {
                    if (!bl) {
                        f.this.a.a();
                        return;
                    }
                    d d2 = f.this.a;
                    boolean bl2 = true;
                    if (bl != bl2) {
                        bl2 = false;
                    }
                    d2.a(bl2);
                }
            }
        }
    };

    public void a(Activity activity) {
        this.a = null;
        a.a((Context)activity).a(this.b);
    }

    public void a(Activity activity, d d2) {
        this.a = d2;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        a.a((Context)activity).a(this.b, intentFilter);
    }

}

