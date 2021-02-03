/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.b.a.e;

public class b {
    private static final double a = Math.log((double)10.0);

    public static double a(double d2, double d3, double d4, double d5) {
        if (d3 < d2) {
            d2 = d3;
        }
        if (d4 < d2) {
            d2 = d4;
        }
        if (d5 < d2) {
            d2 = d5;
        }
        return d2;
    }
}

