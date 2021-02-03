/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  java.lang.Object
 */
package com.amazon.device.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.amazon.device.ads.ew;

class aw {
    aw() {
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener a(ew ew2) {
        return new a(ew2);
    }

    private class a
    implements ViewTreeObserver.OnGlobalFocusChangeListener {
        private final ew b;

        public a(ew ew2) {
            this.b = ew2;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            this.b.a(false);
        }
    }

}

