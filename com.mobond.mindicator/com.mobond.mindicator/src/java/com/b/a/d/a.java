/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.b.a.d;

import com.b.a.b.e;
import com.b.a.b.k;
import com.b.a.d.d;

class a {
    private e a;

    public a(e e2) {
        this.a = e2;
    }

    private double a(com.b.a.b.a a2, double d2) {
        k k2 = new k();
        d d3 = new d(this.a);
        double d4 = 0.0;
        double d5 = Double.MAX_VALUE;
        double d6 = d2;
        while (d3.a()) {
            if (!d3.c()) {
                k2.a = d3.g();
                k2.b = d3.h();
                double d7 = k2.a(a2);
                double d8 = this.a(k2, a2, d4);
                if (d7 < d5 && d8 > d2) {
                    d5 = d7;
                } else {
                    d8 = d6;
                }
                d4 += k2.a();
                d6 = d8;
            }
            d3.b();
        }
        return d6;
    }

    public static double a(e e2, com.b.a.b.a a2) {
        return new a(e2).a(a2);
    }

    private double a(k k2, com.b.a.b.a a2, double d2) {
        double d3 = k2.b(a2);
        if (d3 <= 0.0) {
            return d2;
        }
        if (d3 <= 1.0) {
            return d2 + d3 * k2.a();
        }
        return d2 + k2.a();
    }

    public double a(com.b.a.b.a a2) {
        return this.a(a2, -1.0);
    }
}

