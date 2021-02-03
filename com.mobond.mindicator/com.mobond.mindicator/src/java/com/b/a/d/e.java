/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.l
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.b.a.d;

import com.b.a.b.a;
import com.b.a.b.l;

public class e
implements Comparable {
    private int a = 0;
    private int b = 0;
    private double c = 0.0;

    public e() {
    }

    public e(int n2, int n3, double d2) {
        this.a = n2;
        this.b = n3;
        this.c = d2;
        this.b();
    }

    public static a a(a a2, a a3, double d2) {
        if (d2 <= 0.0) {
            return a2;
        }
        if (d2 >= 1.0) {
            return a3;
        }
        double d3 = d2 * (a3.a - a2.a) + a2.a;
        double d4 = d2 * (a3.b - a2.b) + a2.b;
        double d5 = d2 * (a3.c - a2.c) + a2.c;
        a a4 = new a(d3, d4, d5);
        return a4;
    }

    public static e a(com.b.a.b.e e2) {
        e e3 = new e();
        e3.b(e2);
        return e3;
    }

    private void b() {
        if (this.c < 0.0) {
            this.c = 0.0;
        }
        if (this.c > 1.0) {
            this.c = 1.0;
        }
        if (this.a < 0) {
            this.a = 0;
            this.b = 0;
            this.c = 0.0;
        }
        if (this.b < 0) {
            this.b = 0;
            this.c = 0.0;
        }
        if (this.c == 1.0) {
            this.c = 0.0;
            this.b = 1 + this.b;
        }
    }

    public int a() {
        return this.a;
    }

    public void b(com.b.a.b.e e2) {
        this.a = -1 + e2.b();
        this.b = -1 + ((l)e2.a(this.a)).f();
        this.c = 1.0;
    }

    public a c(com.b.a.b.e e2) {
        l l2 = (l)e2.a(this.a);
        a a2 = l2.b(this.b);
        if (this.b >= -1 + l2.f()) {
            return a2;
        }
        return e.a(a2, l2.b(1 + this.b), this.c);
    }

    public Object clone() {
        return new e(this.a, this.b, this.c);
    }

    public int compareTo(Object object) {
        e e2 = (e)object;
        int n2 = this.a;
        int n3 = e2.a;
        if (n2 < n3) {
            return -1;
        }
        if (n2 > n3) {
            return 1;
        }
        int n4 = this.b;
        int n5 = e2.b;
        if (n4 < n5) {
            return -1;
        }
        if (n4 > n5) {
            return 1;
        }
        double d2 = this.c;
        double d3 = e2.c;
        if (d2 < d3) {
            return -1;
        }
        return d2 > d3;
    }

    public boolean d(com.b.a.b.e e2) {
        int n2 = this.b;
        int n3 = ((l)e2.a(this.a)).f() - 1;
        return n2 >= n3 || n2 == n3 && this.c >= 1.0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinearLoc[");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

