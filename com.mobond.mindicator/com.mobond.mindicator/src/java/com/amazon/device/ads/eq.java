/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.bd;

class eq {
    private final bc a;

    public eq() {
        this(new bc());
    }

    eq(bc bc2) {
        this.a = bc2;
    }

    @SuppressLint(value={"NewApi"})
    public boolean a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (viewTreeObserver.isAlive()) {
            if (bd.a(this.a, 16)) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
            return true;
        }
        return false;
    }
}

