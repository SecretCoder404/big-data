/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.widget.FrameLayout
 *  java.lang.Object
 */
package com.mobond.policestationlocator.util;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class a
extends FrameLayout {
    private a a;

    public a(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a a2 = this.a;
        if (a2 != null) {
            a2.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnTouchListener(a a2) {
        this.a = a2;
    }

    public static interface a {
        public void a(MotionEvent var1);
    }

}

