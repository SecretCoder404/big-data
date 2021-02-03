/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.ads.j
 *  java.lang.IllegalStateException
 *  java.lang.Object
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.ae;
import com.amazon.device.ads.h;
import com.amazon.device.ads.j;

class k {
    private static j a;
    private static h b;

    k() {
    }

    public static j a() {
        return a;
    }

    public static void a(h h2) {
        b = h2;
    }

    public static void a(j j2) {
        a = j2;
    }

    public static h b() {
        return b;
    }

    public static j c() {
        j j2 = a;
        a = null;
        return j2;
    }

    public j a(Context context, ae ae2) {
        try {
            j j2 = new j(context, ae2);
            return j2;
        }
        catch (IllegalStateException illegalStateException) {
            return null;
        }
    }
}

