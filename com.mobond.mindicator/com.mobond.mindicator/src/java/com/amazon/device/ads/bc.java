/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.os.Build;

class bc {
    private String a = Build.MANUFACTURER;
    private String b = Build.MODEL;
    private String c = Build.VERSION.RELEASE;
    private int d = Build.VERSION.SDK_INT;

    bc() {
    }

    public int a() {
        return this.d;
    }
}

