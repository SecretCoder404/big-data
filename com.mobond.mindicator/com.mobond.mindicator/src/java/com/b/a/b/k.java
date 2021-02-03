/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.a.j
 *  java.io.Serializable
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.b.a.b;

import com.b.a.a.b;
import com.b.a.a.j;
import com.b.a.b.a;
import java.io.Serializable;

public class k
implements Serializable,
Comparable {
    public a a;
    public a b;

    public k() {
        this(new a(), new a());
    }

    public k(a a2, a a3) {
        this.a = a2;
        this.b = a3;
    }

    public double a() {
        return this.a.b(this.b);
    }

    public double a(a a2) {
        return b.b(a2, this.a, this.b);
    }

    public a[] a(k k2) {
        a a2;
        double d2;
        a a3;
        a a4 = this.b(k2);
        if (a4 != null) {
            return new a[]{a4, a4};
        }
        a[] arra = new a[2];
        a a5 = this.d(k2.a);
        double d3 = a5.b(k2.a);
        arra[0] = a5;
        arra[1] = k2.a;
        a a6 = this.d(k2.b);
        double d4 = a6.b(k2.b);
        if (d4 < d3) {
            arra[0] = a6;
            arra[1] = k2.b;
            d3 = d4;
        }
        if ((d2 = (a3 = k2.d(this.a)).b(this.a)) < d3) {
            arra[0] = this.a;
            arra[1] = a3;
            d3 = d2;
        }
        if ((a2 = k2.d(this.b)).b(this.b) < d3) {
            arra[0] = this.b;
            arra[1] = a2;
        }
        return arra;
    }

    public double b(a a2) {
        if (a2.equals(this.a)) {
            return 0.0;
        }
        if (a2.equals(this.b)) {
            return 1.0;
        }
        double d2 = this.b.a - this.a.a;
        double d3 = this.b.b - this.a.b;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 <= 0.0) {
            return Double.NaN;
        }
        return (d2 * (a2.a - this.a.a) + d3 * (a2.b - this.a.b)) / d4;
    }

    public a b(k k2) {
        j j2 = new j();
        j2.a(this.a, this.b, k2.a, k2.b);
        if (j2.c()) {
            return j2.a(0);
        }
        return null;
    }

    public a c(a a2) {
        if (!a2.equals(this.a) && !a2.equals(this.b)) {
            double d2 = this.b(a2);
            a a3 = new a();
            a3.a = this.a.a + d2 * (this.b.a - this.a.a);
            a3.b = this.a.b + d2 * (this.b.b - this.a.b);
            return a3;
        }
        return new a(a2);
    }

    public int compareTo(Object object) {
        k k2 = (k)object;
        int n2 = this.a.compareTo(k2.a);
        if (n2 != 0) {
            return n2;
        }
        return this.b.compareTo(k2.b);
    }

    public a d(a a2) {
        double d2 = this.b(a2);
        if (d2 > 0.0 && d2 < 1.0) {
            return this.c(a2);
        }
        if (this.a.b(a2) < this.b.b(a2)) {
            return this.a;
        }
        return this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        k k2 = (k)object;
        return this.a.equals(k2.a) && this.b.equals(k2.b);
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits((double)this.a.a) ^ 31L * Double.doubleToLongBits((double)this.a.b);
        int n2 = (int)l2 ^ (int)(l2 >> 32);
        long l3 = Double.doubleToLongBits((double)this.b.a) ^ 31L * Double.doubleToLongBits((double)this.b.b);
        return n2 ^ ((int)l3 ^ (int)(l3 >> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LINESTRING( ");
        stringBuilder.append(this.a.a);
        stringBuilder.append(" ");
        stringBuilder.append(this.a.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.b.a);
        stringBuilder.append(" ");
        stringBuilder.append(this.b.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

