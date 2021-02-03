/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;

class dj {
    dj() {
    }

    public boolean a(Context context) {
        return this.a(context, "android.permission.INTERNET");
    }

    public boolean a(Context context, String string) {
        return context.checkCallingOrSelfPermission(string) == 0;
    }

    public boolean b(Context context) {
        return this.a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public boolean c(Context context) {
        return this.a(context, "android.permission.ACCESS_FINE_LOCATION") || this.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        {
        }
    }
}

