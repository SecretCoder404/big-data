/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 */
package com.amazon.device.ads;

import android.view.ViewTreeObserver;
import com.amazon.device.ads.ew;

class ax {
    ax() {
    }

    public ViewTreeObserver.OnGlobalLayoutListener a(ew ew2) {
        return new a(ew2);
    }

    private class a
    implements ViewTreeObserver.OnGlobalLayoutListener {
        private final ew b;

        public a(ew ew2) {
            this.b = ew2;
        }

        public void onGlobalLayout() {
            this.b.b();
            this.b.a(false);
        }
    }

}

