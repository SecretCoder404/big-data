/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnWindowFocusChangeListener
 *  java.lang.Object
 */
package com.amazon.device.ads;

import android.view.ViewTreeObserver;
import com.amazon.device.ads.ew;

class az {
    az() {
    }

    public ViewTreeObserver.OnWindowFocusChangeListener a(ew ew2) {
        return new a(ew2);
    }

    private class a
    implements ViewTreeObserver.OnWindowFocusChangeListener {
        private final ew b;

        a(ew ew2) {
            this.b = ew2;
        }

        public void onWindowFocusChanged(boolean bl2) {
            this.b.a(false);
        }
    }

}

