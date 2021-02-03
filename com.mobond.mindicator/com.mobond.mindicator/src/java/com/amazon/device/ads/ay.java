/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  java.lang.Object
 */
package com.amazon.device.ads;

import android.view.ViewTreeObserver;
import com.amazon.device.ads.ew;

class ay {
    ay() {
    }

    public ViewTreeObserver.OnScrollChangedListener a(ew ew2) {
        return new a(ew2);
    }

    private class a
    implements ViewTreeObserver.OnScrollChangedListener {
        private final ew b;

        public a(ew ew2) {
            this.b = ew2;
        }

        public void onScrollChanged() {
            this.b.a(true);
        }
    }

}

