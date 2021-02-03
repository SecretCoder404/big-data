/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.b.a.d;

import com.b.a.b.a;
import com.b.a.d.d;
import com.b.a.d.e;

public class c {
    private com.b.a.b.e a;

    public c(com.b.a.b.e e2) {
        this.a = e2;
    }

    public static e a(com.b.a.b.e e2, double d2) {
        return new c(e2).a(d2);
    }

    private e a(e e2) {
        if (!e2.d(this.a)) {
            return e2;
        }
        int n2 = e2.a();
        if (n2 >= -1 + this.a.b()) {
            return e2;
        }
        while (++n2 < -1 + this.a.b() && this.a.a(n2).h() == 0.0) {
        }
        return new e(n2, 0, 0.0);
    }

    private e b(double d2) {
        if (d2 <= 0.0) {
            return new e();
        }
        d d3 = new d(this.a);
        double d4 = 0.0;
        while (d3.a()) {
            if (d3.c()) {
                if (d4 == d2) {
                    return new e(d3.d(), d3.e(), 0.0);
                }
            } else {
                a a2 = d3.g();
                double d5 = d3.h().b(a2);
                double d6 = d4 + d5;
                if (d6 > d2) {
                    double d7 = (d2 - d4) / d5;
                    return new e(d3.d(), d3.e(), d7);
                }
                d4 = d6;
            }
            d3.b();
        }
        return e.a(this.a);
    }

    public e a(double d2) {
        return this.a(d2, true);
    }

    public e a(double d2, boolean bl2) {
        if (d2 < 0.0) {
            d2 += this.a.h();
        }
        e e2 = this.b(d2);
        if (bl2) {
            return e2;
        }
        return this.a(e2);
    }
}

