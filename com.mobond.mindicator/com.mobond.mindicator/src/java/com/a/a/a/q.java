/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.a.a.a;

import android.os.Looper;

final class q {
    static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}

