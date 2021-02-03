/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 */
package com.b.a.a;

import com.b.a.a.i;
import com.b.a.b.a;

public class h {
    private a a;
    private int b = 0;
    private boolean c = false;

    public h(a a2) {
        this.a = a2;
    }

    public static int a(a a2, a[] arra) {
        h h2 = new h(a2);
        int n2 = 1;
        while (n2 < arra.length) {
            h2.a(arra[n2], arra[n2 - 1]);
            if (h2.a()) {
                return h2.b();
            }
            ++n2;
        }
        return h2.b();
    }

    public void a(a a2, a a3) {
        if (a2.a < this.a.a && a3.a < this.a.a) {
            return;
        }
        if (this.a.a == a3.a && this.a.b == a3.b) {
            this.c = true;
            return;
        }
        if (a2.b == this.a.b && a3.b == this.a.b) {
            double d2 = a2.a;
            double d3 = a3.a;
            if (d2 > d3) {
                d2 = a3.a;
                d3 = a2.a;
            }
            if (this.a.a >= d2 && this.a.a <= d3) {
                this.c = true;
            }
            return;
        }
        if (a2.b > this.a.b && a3.b <= this.a.b || a3.b > this.a.b && a2.b <= this.a.b) {
            double d4 = a2.a - this.a.a;
            double d5 = a2.b - this.a.b;
            double d6 = a3.a - this.a.a;
            double d7 = a3.b - this.a.b;
            double d8 = i.a(d4, d5, d6, d7);
            if (d8 == 0.0) {
                this.c = true;
                return;
            }
            if (d7 < d5) {
                Double.isNaN((double)d8);
                d8 = -d8;
            }
            if (d8 > 0.0) {
                this.b = 1 + this.b;
            }
        }
    }

    public boolean a() {
        return this.c;
    }

    public int b() {
        if (this.c) {
            return 1;
        }
        if (this.b % 2 == 1) {
            return 0;
        }
        return 2;
    }
}

