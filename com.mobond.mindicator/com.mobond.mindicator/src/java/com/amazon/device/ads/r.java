/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.graphics.Rect;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.de;
import com.amazon.device.ads.df;
import com.amazon.device.ads.e;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.m;
import com.amazon.device.ads.q;
import com.amazon.device.ads.x;

class r {
    private static final String a = "r";
    private final q b;
    private final ej.k c;
    private final cy d;
    private df e;
    private de f;

    public r(q q2, cz cz2) {
        this(q2, ej.a(), cz2);
    }

    r(q q2, ej.k k2, cz cz2) {
        this.b = q2;
        this.c = k2;
        this.d = cz2.a(a);
    }

    q a() {
        return this.b;
    }

    public void a(de de2) {
        this.f = de2;
    }

    public void a(df df2) {
        this.e = df2;
    }

    public void a(final e e2) {
        this.a(new Runnable(){

            public void run() {
                r.this.a().a(e2);
            }
        });
    }

    public void a(e e2, Rect rect) {
        df df2 = this.e;
        if (df2 == null) {
            this.d.d("Ad listener called - Ad Resized.");
            return;
        }
        df2.a(e2, rect);
    }

    public void a(final e e2, final m m2) {
        this.a(new Runnable(){

            public void run() {
                r.this.a().a(e2, m2);
            }
        });
    }

    public void a(final e e2, final x x2) {
        this.a(new Runnable(){

            public void run() {
                r.this.a().a(e2, x2);
            }
        });
    }

    protected void a(Runnable runnable) {
        this.c.a(runnable, ej.b.b, ej.c.a);
    }

    public void b(final e e2) {
        this.a(new Runnable(){

            public void run() {
                r.this.a().b(e2);
            }
        });
    }

    public void c(final e e2) {
        this.a(new Runnable(){

            public void run() {
                r.this.a().c(e2);
            }
        });
    }

    public void d(e e2) {
        de de2 = this.f;
        if (de2 == null) {
            this.d.d("Ad listener called - Ad Expired.");
            return;
        }
        de2.a(e2);
    }

}

