/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Comparable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.b.a.b;

import com.b.a.b.a;
import java.io.Serializable;

public class d
implements Serializable,
Comparable {
    private double a;
    private double b;
    private double c;
    private double d;

    public d() {
        this.a();
    }

    public d(a a2, a a3) {
        this.a(a2.a, a3.a, a2.b, a3.b);
    }

    public d(d d2) {
        this.a(d2);
    }

    public static boolean a(a a2, a a3, a a4) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8 = a4.a;
        double d9 = a2.a < a3.a ? a2.a : a3.a;
        return d8 >= d9 && (d6 = a4.a) <= (d4 = a2.a > a3.a ? a2.a : a3.a) && (d7 = a4.b) >= (d5 = a2.b < a3.b ? a2.b : a3.b) && (d2 = a4.b) <= (d3 = a2.b > a3.b ? a2.b : a3.b);
    }

    public static boolean a(a a2, a a3, a a4, a a5) {
        double d2 = Math.min((double)a4.a, (double)a5.a);
        double d3 = Math.max((double)a4.a, (double)a5.a);
        double d4 = Math.min((double)a2.a, (double)a3.a);
        double d5 = Math.max((double)a2.a, (double)a3.a);
        if (d4 > d3) {
            return false;
        }
        if (d5 < d2) {
            return false;
        }
        double d6 = Math.min((double)a4.b, (double)a5.b);
        double d7 = Math.max((double)a4.b, (double)a5.b);
        double d8 = Math.min((double)a2.b, (double)a3.b);
        double d9 = Math.max((double)a2.b, (double)a3.b);
        if (d8 > d7) {
            return false;
        }
        return !(d9 < d6);
    }

    public void a() {
        this.b();
    }

    public void a(double d2, double d3) {
        if (this.c()) {
            this.a = d2;
            this.b = d2;
            this.c = d3;
            this.d = d3;
            return;
        }
        if (d2 < this.a) {
            this.a = d2;
        }
        if (d2 > this.b) {
            this.b = d2;
        }
        if (d3 < this.c) {
            this.c = d3;
        }
        if (d3 > this.d) {
            this.d = d3;
        }
    }

    public void a(double d2, double d3, double d4, double d5) {
        if (d2 < d3) {
            this.a = d2;
            this.b = d3;
        } else {
            this.a = d3;
            this.b = d2;
        }
        if (d4 < d5) {
            this.c = d4;
            this.d = d5;
            return;
        }
        this.c = d5;
        this.d = d4;
    }

    public void a(a a2) {
        this.a(a2.a, a2.b);
    }

    public void a(d d2) {
        this.a = d2.a;
        this.b = d2.b;
        this.c = d2.c;
        this.d = d2.d;
    }

    public void b() {
        this.a = 0.0;
        this.b = -1.0;
        this.c = 0.0;
        this.d = -1.0;
    }

    public void b(d d2) {
        double d3;
        double d4;
        double d5;
        if (d2.c()) {
            return;
        }
        if (this.c()) {
            this.a = d2.d();
            this.b = d2.e();
            this.c = d2.f();
            this.d = d2.g();
            return;
        }
        double d6 = d2.a;
        if (d6 < this.a) {
            this.a = d6;
        }
        if ((d3 = d2.b) > this.b) {
            this.b = d3;
        }
        if ((d4 = d2.c) < this.c) {
            this.c = d4;
        }
        if ((d5 = d2.d) > this.d) {
            this.d = d5;
        }
    }

    public boolean b(double d2, double d3) {
        if (this.c()) {
            return false;
        }
        double d4 = d2 DCMPL this.b;
        boolean bl2 = false;
        if (d4 <= 0) {
            double d5 = d2 DCMPG this.a;
            bl2 = false;
            if (d5 >= 0) {
                double d6 = d3 DCMPL this.d;
                bl2 = false;
                if (d6 <= 0) {
                    if (d3 < this.c) {
                        return false;
                    }
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public boolean b(a a2) {
        return this.b(a2.a, a2.b);
    }

    public boolean c() {
        return this.b < this.a;
    }

    public boolean c(double d2, double d3) {
        if (this.c()) {
            return false;
        }
        return d2 >= this.a && d2 <= this.b && d3 >= this.c && d3 <= this.d;
    }

    public boolean c(a a2) {
        return this.d(a2);
    }

    public boolean c(d d2) {
        if (!this.c()) {
            if (d2.c()) {
                return false;
            }
            double d3 = d2.a DCMPL this.b;
            boolean bl2 = false;
            if (d3 <= 0) {
                double d4 = d2.b DCMPG this.a;
                bl2 = false;
                if (d4 >= 0) {
                    double d5 = d2.c DCMPL this.d;
                    bl2 = false;
                    if (d5 <= 0) {
                        if (d2.d < this.c) {
                            return false;
                        }
                        bl2 = true;
                    }
                }
            }
            return bl2;
        }
        return false;
    }

    public int compareTo(Object object) {
        d d2 = (d)object;
        if (this.c()) {
            if (d2.c()) {
                return 0;
            }
            return -1;
        }
        if (d2.c()) {
            return 1;
        }
        double d3 = this.a;
        double d4 = d2.a;
        if (d3 < d4) {
            return -1;
        }
        if (d3 > d4) {
            return 1;
        }
        double d5 = this.c;
        double d6 = d2.c;
        if (d5 < d6) {
            return -1;
        }
        if (d5 > d6) {
            return 1;
        }
        double d7 = this.b;
        double d8 = d2.b;
        if (d7 < d8) {
            return -1;
        }
        if (d7 > d8) {
            return 1;
        }
        double d9 = this.d;
        double d10 = d2.d;
        if (d9 < d10) {
            return -1;
        }
        return d9 > d10;
    }

    public double d() {
        return this.a;
    }

    public double d(d d2) {
        double d3;
        double d4;
        double d5;
        double d6;
        if (this.c(d2)) {
            return 0.0;
        }
        double d7 = this.b;
        double d8 = d2.a;
        double d9 = d7 < d8 ? d8 - d7 : ((d4 = this.a) > (d3 = d2.b) ? d4 - d3 : 0.0);
        double d10 = this.d;
        double d11 = d2.c;
        double d12 = d10 < d11 ? d11 - d10 : ((d6 = this.c) > (d5 = d2.d) ? d6 - d5 : 0.0);
        if (d9 == 0.0) {
            return d12;
        }
        if (d12 == 0.0) {
            return d9;
        }
        return Math.sqrt((double)(d9 * d9 + d12 * d12));
    }

    public boolean d(a a2) {
        return this.c(a2.a, a2.b);
    }

    public double e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        if (this.c()) {
            return d2.c();
        }
        return this.b == d2.e() && this.d == d2.g() && this.a == d2.d() && this.c == d2.f();
    }

    public double f() {
        return this.c;
    }

    public double g() {
        return this.d;
    }

    public int hashCode() {
        return 37 * (37 * (37 * (629 + a.a(this.a)) + a.a(this.b)) + a.a(this.c)) + a.a(this.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Env[");
        stringBuilder.append(this.a);
        stringBuilder.append(" : ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(" : ");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

