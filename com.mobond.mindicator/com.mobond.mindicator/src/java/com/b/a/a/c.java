/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.b.a.a;

import com.b.a.e.a;

public class c {
    private static int a(double d2) {
        if (d2 > 0.0) {
            return 1;
        }
        if (d2 < 0.0) {
            return -1;
        }
        return 0;
    }

    public static int a(com.b.a.b.a a2, com.b.a.b.a a3, com.b.a.b.a a4) {
        int n2 = c.b(a2, a3, a4);
        if (n2 <= 1) {
            return n2;
        }
        a a5 = a.a(a3.a).b(-a2.a);
        a a6 = a.a(a3.b).b(-a2.b);
        a a7 = a.a(a4.a).b(-a3.a);
        return a5.g(a.a(a4.b).b(-a3.b)).e(a6.g(a7)).c();
    }

    private static int b(com.b.a.b.a a2, com.b.a.b.a a3, com.b.a.b.a a4) {
        double d2;
        block8 : {
            double d3;
            block7 : {
                double d4;
                double d5;
                block6 : {
                    d5 = (a2.a - a4.a) * (a3.b - a4.b);
                    d4 = (a2.b - a4.b) * (a3.a - a4.a);
                    d2 = d5 - d4;
                    if (!(d5 > 0.0)) break block6;
                    if (d4 <= 0.0) {
                        return c.a(d2);
                    }
                    d3 = d5 + d4;
                    break block7;
                }
                if (!(d5 < 0.0)) break block8;
                if (d4 >= 0.0) {
                    return c.a(d2);
                }
                d3 = -d5 - d4;
            }
            double d6 = d3 * 1.0E-15;
            if (!(d2 >= d6) && !(-d2 >= d6)) {
                return 2;
            }
            return c.a(d2);
        }
        return c.a(d2);
    }
}

