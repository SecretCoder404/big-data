/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.a.j
 *  java.lang.Math
 *  java.lang.Object
 */
package com.b.a.a;

import com.b.a.a.c;
import com.b.a.a.h;
import com.b.a.a.j;
import com.b.a.b.a;
import com.b.a.b.d;

public class b {
    public static double a(a a2, a a3, a a4, a a5) {
        boolean bl2;
        if (a2.equals(a3)) {
            return b.b(a2, a4, a5);
        }
        if (a4.equals(a5)) {
            return b.b(a5, a2, a3);
        }
        if (!d.a(a2, a3, a4, a5)) {
            bl2 = true;
        } else {
            double d2 = (a3.a - a2.a) * (a5.b - a4.b) - (a3.b - a2.b) * (a5.a - a4.a);
            if (d2 == 0.0) {
                bl2 = true;
            } else {
                double d3 = (a2.b - a4.b) * (a5.a - a4.a) - (a2.a - a4.a) * (a5.b - a4.b);
                double d4 = ((a2.b - a4.b) * (a3.a - a2.a) - (a2.a - a4.a) * (a3.b - a2.b)) / d2;
                double d5 = d3 / d2;
                bl2 = d5 < 0.0 || d5 > 1.0 || d4 < 0.0 || d4 > 1.0;
            }
        }
        if (bl2) {
            return com.b.a.e.b.a(b.b(a2, a4, a5), b.b(a3, a4, a5), b.b(a4, a2, a3), b.b(a5, a2, a3));
        }
        return 0.0;
    }

    public static double a(com.b.a.b.b b2) {
        int n2 = b2.a();
        double d2 = 0.0;
        int n3 = 1;
        if (n2 <= n3) {
            return d2;
        }
        a a2 = new a();
        b2.a(0, a2);
        double d3 = a2.a;
        double d4 = a2.b;
        while (n3 < n2) {
            b2.a(n3, a2);
            double d5 = a2.a;
            double d6 = a2.b;
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            d2 += Math.sqrt((double)(d7 * d7 + d8 * d8));
            ++n3;
            d3 = d5;
            d4 = d6;
        }
        return d2;
    }

    public static int a(a a2, a a3, a a4) {
        return c.a(a2, a3, a4);
    }

    public static int a(a a2, a[] arra) {
        return h.a(a2, arra);
    }

    public static double b(a a2, a a3, a a4) {
        if (a3.a == a4.a && a3.b == a4.b) {
            return a2.b(a3);
        }
        double d2 = (a4.a - a3.a) * (a4.a - a3.a) + (a4.b - a3.b) * (a4.b - a3.b);
        double d3 = ((a2.a - a3.a) * (a4.a - a3.a) + (a2.b - a3.b) * (a4.b - a3.b)) / d2;
        if (d3 <= 0.0) {
            return a2.b(a3);
        }
        if (d3 >= 1.0) {
            return a2.b(a4);
        }
        return Math.abs((double)(((a3.b - a2.b) * (a4.a - a3.a) - (a3.a - a2.a) * (a4.b - a3.b)) / d2)) * Math.sqrt((double)d2);
    }

    public static boolean b(a a2, a[] arra) {
        j j2 = new j();
        int n2 = 1;
        while (n2 < arra.length) {
            j2.a(a2, arra[n2 - 1], arra[n2]);
            if (j2.c()) {
                return true;
            }
            ++n2;
        }
        return false;
    }
}

