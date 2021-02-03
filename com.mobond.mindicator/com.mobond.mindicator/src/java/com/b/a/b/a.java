/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.b.a.b;

import java.io.Serializable;

public class a
implements Serializable,
Cloneable,
Comparable {
    public double a;
    public double b;
    public double c;

    public a() {
        this(0.0, 0.0);
    }

    public a(double d2, double d3) {
        this(d2, d3, Double.NaN);
    }

    public a(double d2, double d3, double d4) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }

    public a(a a2) {
        this(a2.a, a2.b, a2.c);
    }

    public static int a(double d2) {
        long l2 = Double.doubleToLongBits((double)d2);
        return (int)(l2 ^ l2 >>> 32);
    }

    public boolean a(a a2) {
        if (this.a != a2.a) {
            return false;
        }
        return this.b == a2.b;
    }

    public double b(a a2) {
        double d2 = this.a - a2.a;
        double d3 = this.b - a2.b;
        return Math.sqrt((double)(d2 * d2 + d3 * d3));
    }

    public Object clone() {
        try {
            a a2 = (a)super.clone();
            return a2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            com.b.a.g.a.a("this shouldn't happen because this class is Cloneable");
            return null;
        }
    }

    public int compareTo(Object object) {
        a a2 = (a)object;
        double d2 = this.a;
        double d3 = a2.a;
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        double d4 = this.b;
        double d5 = a2.b;
        if (d4 < d5) {
            return -1;
        }
        return d4 > d5;
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        return this.a((a)object);
    }

    public int hashCode() {
        return 37 * (629 + a.a(this.a)) + a.a(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

