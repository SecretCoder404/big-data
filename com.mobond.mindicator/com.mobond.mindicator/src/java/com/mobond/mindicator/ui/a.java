/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  com.mobond.mindicator.ui.m
 *  java.lang.Math
 *  java.lang.Object
 */
package com.mobond.mindicator.ui;

import android.view.MotionEvent;
import android.view.View;
import com.mobond.mindicator.ui.m;

public class a
implements View.OnTouchListener {
    private m a;
    private float b;
    private float c;
    private float d;
    private float e;

    public a(m m2) {
        this.a = m2;
    }

    public void a(View view) {
        this.a.c(view);
    }

    public void b(View view) {
        this.a.b(view);
    }

    public void c(View view) {
        this.a.d(view);
    }

    public void d(View view) {
        this.a.a(view);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            default: {
                break;
            }
            case 1: {
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                float f2 = this.b - this.d;
                float f3 = this.c - this.e;
                if (Math.abs((float)f2) > 100.0f) {
                    if (f2 < 0.0f) {
                        this.b(view);
                        return true;
                    }
                    if (f2 > 0.0f) {
                        this.a(view);
                        return true;
                    }
                }
                if (Math.abs((float)f3) > 100.0f) {
                    if (f3 < 0.0f) {
                        this.c(view);
                        return true;
                    }
                    if (!(f3 > 0.0f)) break;
                    this.d(view);
                    return true;
                }
                view.performClick();
                break;
            }
            case 0: {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                return true;
            }
        }
        return false;
    }
}

