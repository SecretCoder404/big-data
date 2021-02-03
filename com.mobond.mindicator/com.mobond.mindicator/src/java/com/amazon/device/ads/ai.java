/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Timer
 *  java.util.TimerTask
 */
package com.amazon.device.ads;

import java.util.Timer;
import java.util.TimerTask;

class ai {
    private Timer a;

    ai() {
    }

    public void a() {
        Timer timer = this.a;
        if (timer != null) {
            timer.cancel();
        }
    }

    public void a(TimerTask timerTask, long l2) {
        this.a.schedule(timerTask, l2);
    }

    public void b() {
        this.a();
        this.a = new Timer();
    }
}

