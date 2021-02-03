/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 */
package com.b.a.a;

import com.b.a.a.f;
import com.b.a.b.a;

public class d {
    public static a a(a a2, a a3, a a4, a a5) {
        double d2 = a2.b - a3.b;
        double d3 = a3.a - a2.a;
        double d4 = a2.a * a3.b - a3.a * a2.b;
        double d5 = a4.b - a5.b;
        double d6 = a5.a - a4.a;
        double d7 = a4.a * a5.b - a5.a * a4.b;
        double d8 = d3 * d7 - d6 * d4;
        double d9 = d4 * d5 - d7 * d2;
        double d10 = d2 * d6 - d5 * d3;
        double d11 = d8 / d10;
        double d12 = d9 / d10;
        if (!(Double.isNaN((double)d11) || Double.isInfinite((double)d11) || Double.isNaN((double)d12) || Double.isInfinite((double)d12))) {
            return new a(d11, d12);
        }
        throw new f();
    }
}

