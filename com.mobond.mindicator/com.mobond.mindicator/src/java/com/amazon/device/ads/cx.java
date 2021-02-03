/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.bf;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.br;
import com.amazon.device.ads.do;
import com.amazon.device.ads.dz;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.ek;
import java.io.File;

class cx {
    private static cx n = new cx(ee.a(), bn.a());
    protected Context a;
    private bf b;
    private br c;
    private do d;
    private dz e;
    private boolean f;
    private boolean g;
    private int h;
    private long i;
    private boolean j = false;
    private File k;
    private final ee l;
    private final bn m;

    protected cx(ee ee2, bn bn2) {
        this.l = ee2;
        this.m = bn2;
        this.d = new do();
    }

    public static cx a() {
        return n;
    }

    public void a(int n2) {
        int n3 = this.m.a("debug.noRetryTTLMax", 300000);
        if (n3 < n2) {
            n2 = n3;
        }
        if (n2 == 0) {
            this.h = 0;
            this.i = 0L;
            return;
        }
        this.h = n2 * 1000;
        this.i = System.currentTimeMillis() + (long)this.h;
    }

    public void a(Context context) {
        cx cx2 = this;
        synchronized (cx2) {
            if (!this.f) {
                this.f = true;
                this.e(context);
                this.b(context);
                this.l.a(context);
                this.c(context);
                this.c = this.d(context);
                this.f();
            }
            return;
        }
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }

    public bf b() {
        return this.b;
    }

    protected void b(Context context) {
        this.k = context.getFilesDir();
    }

    public br c() {
        return this.c;
    }

    protected void c(Context context) {
        this.b = new bf(context);
    }

    protected br d(Context context) {
        return new br(context, new ek());
    }

    public do d() {
        return this.d;
    }

    public void e() {
        this.g().b();
        this.g = true;
    }

    protected void e(Context context) {
        this.a = context.getApplicationContext();
    }

    protected void f() {
        this.e = new dz();
    }

    public dz g() {
        return this.e;
    }

    public int h() {
        if (this.h != 0) {
            long l2;
            if (this.i == 0L) {
                return 0;
            }
            long l3 = System.currentTimeMillis();
            if (l3 >= (l2 = this.i)) {
                this.h = 0;
                this.i = 0L;
                return 0;
            }
            return (int)(l2 - l3);
        }
        return 0;
    }

    public boolean i() {
        return this.j;
    }

    public File j() {
        return this.k;
    }

    public Context k() {
        return this.a;
    }
}

