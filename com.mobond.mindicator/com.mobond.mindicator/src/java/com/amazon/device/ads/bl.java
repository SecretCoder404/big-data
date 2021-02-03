/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  com.amazon.device.ads.cy
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;

class bl {
    private static final String a = "bl";
    private ConnectivityManager b;
    private String c;
    private final cy d = new cz().a(a);

    public bl(cx cx2) {
        this.a((ConnectivityManager)cx2.k().getSystemService("connectivity"));
    }

    private void a(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        NetworkInfo networkInfo = null;
        try {
            ConnectivityManager connectivityManager = this.b;
            networkInfo = null;
            if (connectivityManager != null) {
                networkInfo = this.b.getActiveNetworkInfo();
            }
        }
        catch (SecurityException securityException) {
            this.d.c("Unable to get active network information: %s", new Object[]{securityException});
        }
        if (networkInfo == null) {
            this.c = Integer.toString((int)0);
            return;
        }
        if (networkInfo.getType() == 1) {
            this.c = "Wifi";
            return;
        }
        this.c = Integer.toString((int)networkInfo.getSubtype());
    }

    public void a() {
        this.d();
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return "Wifi".equals((Object)this.b());
    }
}

