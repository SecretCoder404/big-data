/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 */
package com.b.a.e;

import java.io.Serializable;

public strictfp final class a
implements Serializable,
Cloneable,
Comparable {
    public static final a a = new a(3.141592653589793, 1.2246467991473532E-16);
    public static final a b = new a(6.283185307179586, 2.4492935982947064E-16);
    public static final a c = new a(1.5707963267948966, 6.123233995736766E-17);
    public static final a d = new a(2.718281828459045, 1.4456468917292502E-16);
    public static final a e = new a(Double.NaN, Double.NaN);
    private static final a h = a.a(10.0);
    private static final a i = a.a(1.0);
    private double f = 0.0;
    private double g = 0.0;

    public a() {
        this.c(0.0);
    }

    public a(double d2) {
        this.c(d2);
    }

    public a(double d2, double d3) {
        this.a(d2, d3);
    }

    public a(a a2) {
        this.k(a2);
    }

    public static a a(double d2) {
        return new a(d2);
    }

    public static a a(a a2) {
        return new a(a2);
    }

    private static String a(char c2, int n2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = 0;
        while (n3 < n2) {
            stringBuffer.append(c2);
            ++n3;
        }
        return stringBuffer.toString();
    }

    private String a(boolean bl2, int[] arrn) {
        int n2;
        a a2 = this.d();
        a a3 = a2.h(h.a(n2 = a.d(a2.f)));
        if (a3.i(h)) {
            a3 = a3.h(h);
            ++n2;
        } else if (a3.j(i)) {
            a3 = a3.f(h);
            --n2;
        }
        int n3 = n2 + 1;
        StringBuffer stringBuffer = new StringBuffer();
        a a4 = a3;
        int n4 = 0;
        do {
            block13 : {
                block12 : {
                    int n5;
                    boolean bl3;
                    char c2;
                    int n6;
                    if (n4 > 31) break block12;
                    if (bl2 && n4 == n3) {
                        stringBuffer.append('.');
                    }
                    if ((n5 = (int)a4.f) < 0) break block12;
                    boolean bl4 = true;
                    if (n5 > 9) {
                        c2 = '9';
                        bl3 = true;
                    } else {
                        c2 = (char)(n5 + 48);
                        bl3 = false;
                    }
                    stringBuffer.append(c2);
                    a4 = a4.d(a.a(n5)).f(h);
                    if (bl3) {
                        a4.c(h);
                    }
                    if ((n6 = a.d(a4.f)) < 0 && Math.abs((int)n6) >= 31 - n4) {
                        bl4 = false;
                    }
                    if (bl4) break block13;
                }
                arrn[0] = n2;
                return stringBuffer.toString();
            }
            ++n4;
        } while (true);
    }

    private final void a(double d2, double d3) {
        this.f = d2;
        this.g = d3;
    }

    private final a b(double d2, double d3) {
        double d4 = this.f;
        double d5 = d4 + d2;
        double d6 = this.g;
        double d7 = d6 + d3;
        double d8 = d5 - d4;
        double d9 = d7 - d6;
        double d10 = d5 - d8;
        double d11 = d7 - d9;
        double d12 = d2 - d8 + (d4 - d10);
        double d13 = d3 - d9 + (d6 - d11);
        double d14 = d12 + d7;
        double d15 = d5 + d14;
        double d16 = d13 + (d14 + (d5 - d15));
        double d17 = d15 + d16;
        double d18 = d16 + (d15 - d17);
        this.f = d17;
        this.g = d18;
        return this;
    }

    private final a c(double d2, double d3) {
        double d4 = this.f;
        double d5 = d4 * 1.34217729E8;
        double d6 = d5 - d4;
        double d7 = 1.34217729E8 * d2;
        double d8 = d5 - d6;
        double d9 = d4 - d8;
        double d10 = d7 - d2;
        double d11 = d4 * d2;
        double d12 = d7 - d10;
        double d13 = d2 - d12;
        double d14 = d8 * d12 - d11 + d8 * d13 + d12 * d9 + d9 * d13 + (d4 * d3 + d2 * this.g);
        double d15 = d11 + d14;
        double d16 = d14 + (d11 - d15);
        this.f = d15;
        this.g = d16;
        return this;
    }

    private final void c(double d2) {
        this.f = d2;
        this.g = 0.0;
    }

    private static int d(double d2) {
        double d3 = Math.abs((double)d2);
        int n2 = (int)Math.floor((double)(Math.log((double)d3) / Math.log((double)10.0)));
        if (10.0 * Math.pow((double)10.0, (double)n2) <= d3) {
            ++n2;
        }
        return n2;
    }

    private static a k() {
        return new a(Double.NaN, Double.NaN);
    }

    private final void k(a a2) {
        this.f = a2.f;
        this.g = a2.g;
    }

    private String l() {
        if (this.f()) {
            return "0.0";
        }
        if (this.h()) {
            return "NaN ";
        }
        return null;
    }

    public final a a() {
        if (this.h()) {
            return this;
        }
        return new a(-this.f, -this.g);
    }

    public a a(int n2) {
        if ((double)n2 == 0.0) {
            return a.a(1.0);
        }
        a a2 = new a(this);
        a a3 = a.a(1.0);
        int n3 = Math.abs((int)n2);
        if (n3 > 1) {
            do {
                if (n3 <= 0) {
                    a2 = a3;
                    break;
                }
                if (n3 % 2 == 1) {
                    a3.g(a2);
                }
                if ((n3 /= 2) <= 0) continue;
                a2 = a2.e();
            } while (true);
        }
        if (n2 < 0) {
            return a2.b();
        }
        return a2;
    }

    public final a b() {
        double d2 = this.f;
        double d3 = 1.0 / d2;
        double d4 = d3 * 1.34217729E8;
        double d5 = d4 - d3;
        double d6 = 1.34217729E8 * d2;
        double d7 = d4 - d5;
        double d8 = d3 - d7;
        double d9 = d6 - d2;
        double d10 = d3 * d2;
        double d11 = d6 - d9;
        double d12 = d2 - d11;
        double d13 = d7 * d11 - d10 + d7 * d12 + d11 * d8 + d8 * d12;
        double d14 = (1.0 - d10 - d13 - d3 * this.g) / d2;
        double d15 = d3 + d14;
        return new a(d15, d14 + (d3 - d15));
    }

    public final a b(double d2) {
        double d3 = this.f;
        double d4 = d3 + d2;
        double d5 = d4 - d3;
        double d6 = d4 - d5;
        double d7 = d2 - d5 + (d3 - d6) + this.g;
        double d8 = d4 + d7;
        double d9 = d7 + (d4 - d8);
        this.f = d8 + d9;
        this.g = d9 + (d8 - this.f);
        return this;
    }

    public final a b(a a2) {
        return a.a(this).c(a2);
    }

    public int c() {
        double d2 = this.f;
        if (d2 > 0.0) {
            return 1;
        }
        if (d2 < 0.0) {
            return -1;
        }
        double d3 = this.g;
        if (d3 > 0.0) {
            return 1;
        }
        if (d3 < 0.0) {
            return -1;
        }
        return 0;
    }

    public final a c(a a2) {
        return this.b(a2.f, a2.g);
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public int compareTo(Object object) {
        a a2 = (a)object;
        double d2 = this.f;
        double d3 = a2.f;
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        double d4 = this.g;
        double d5 = a2.g;
        if (d4 < d5) {
            return -1;
        }
        return d4 > d5;
    }

    public a d() {
        if (this.h()) {
            return e;
        }
        if (this.g()) {
            return this.a();
        }
        return new a(this);
    }

    public final a d(a a2) {
        return this.b(a2.a());
    }

    public a e() {
        return this.f(this);
    }

    public final a e(a a2) {
        if (this.h()) {
            return this;
        }
        return this.b(-a2.f, -a2.g);
    }

    public final a f(a a2) {
        if (a2.h()) {
            return a.k();
        }
        return a.a(this).g(a2);
    }

    public boolean f() {
        return this.f == 0.0 && this.g == 0.0;
    }

    public final a g(a a2) {
        return this.c(a2.f, a2.g);
    }

    public boolean g() {
        double d2 = this.f;
        return d2 < 0.0 || d2 == 0.0 && this.g < 0.0;
    }

    public final a h(a a2) {
        double d2 = this.f;
        double d3 = a2.f;
        double d4 = d2 / d3;
        double d5 = d4 * 1.34217729E8;
        double d6 = d5 - d4;
        double d7 = 1.34217729E8 * d3;
        double d8 = d5 - d6;
        double d9 = d4 - d8;
        double d10 = d7 - d3;
        double d11 = d4 * d3;
        double d12 = d7 - d10;
        double d13 = d3 - d12;
        double d14 = d8 * d12 - d11 + d8 * d13 + d12 * d9 + d9 * d13;
        double d15 = (d2 - d11 - d14 + this.g - d4 * a2.g) / d3;
        double d16 = d4 + d15;
        return new a(d16, d15 + (d4 - d16));
    }

    public boolean h() {
        return Double.isNaN((double)this.f);
    }

    public String i() {
        String string = this.l();
        if (string != null) {
            return string;
        }
        int[] arrn = new int[1];
        String string2 = this.a(true, arrn);
        int n2 = 1 + arrn[0];
        if (string2.charAt(0) == '.') {
            StringBuilder stringBuilder = new StringBuilder("0");
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        } else if (n2 < 0) {
            StringBuilder stringBuilder = new StringBuilder("0.");
            stringBuilder.append(a.a('0', -n2));
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        } else if (string2.indexOf(46) == -1) {
            String string3 = a.a('0', n2 - string2.length());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)string2));
            stringBuilder.append(string3);
            stringBuilder.append(".0");
            string2 = stringBuilder.toString();
        }
        if (this.g()) {
            StringBuilder stringBuilder = new StringBuilder("-");
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        return string2;
    }

    public boolean i(a a2) {
        double d2 = this.f;
        double d3 = a2.f;
        return d2 > d3 || d2 == d3 && this.g > a2.g;
    }

    public String j() {
        if (this.f()) {
            return "0.0E0";
        }
        String string = this.l();
        if (string != null) {
            return string;
        }
        int[] arrn = new int[1];
        String string2 = this.a(false, arrn);
        StringBuilder stringBuilder = new StringBuilder("E");
        stringBuilder.append(arrn[0]);
        String string3 = stringBuilder.toString();
        if (string2.charAt(0) != '0') {
            String string4 = "";
            if (string2.length() > 1) {
                string4 = string2.substring(1);
            }
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf((char)string2.charAt(0)));
            stringBuilder2.append(".");
            stringBuilder2.append(string4);
            String string5 = stringBuilder2.toString();
            if (this.g()) {
                StringBuilder stringBuilder3 = new StringBuilder("-");
                stringBuilder3.append(string5);
                stringBuilder3.append(string3);
                return stringBuilder3.toString();
            }
            StringBuilder stringBuilder4 = new StringBuilder(String.valueOf((Object)string5));
            stringBuilder4.append(string3);
            return stringBuilder4.toString();
        }
        StringBuilder stringBuilder5 = new StringBuilder("Found leading zero: ");
        stringBuilder5.append(string2);
        throw new IllegalStateException(stringBuilder5.toString());
    }

    public boolean j(a a2) {
        double d2 = this.f;
        double d3 = a2.f;
        return d2 < d3 || d2 == d3 && this.g < a2.g;
    }

    public String toString() {
        int n2 = a.d(this.f);
        if (n2 >= -3 && n2 <= 20) {
            return this.i();
        }
        return this.j();
    }
}

