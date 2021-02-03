/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dj;
import com.amazon.device.ads.do;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.ek;

class z {
    private final cx a;
    private final ee b;
    private final dj c;
    private final cy d;
    private final cz e;
    private volatile boolean f = false;

    public z(String string) {
        this(string, cx.a(), ee.a(), new cz(), new dj());
    }

    z(String string, cx cx2, ee ee2, cz cz2, dj dj2) {
        this.a = cx2;
        this.b = ee2;
        this.e = cz2;
        this.d = this.e.a(string);
        this.c = dj2;
    }

    public void a(Context context) {
        if (!this.f) {
            this.a.a(context);
            this.a.c().a(new ek());
            this.f = true;
        }
    }

    public void a(String string) {
        this.a.d().a(string);
    }
}

