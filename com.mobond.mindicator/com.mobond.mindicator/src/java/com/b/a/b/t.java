/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.b.a.b;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class t
implements Serializable,
Comparable {
    public static final a a = new a("FIXED");
    public static final a b = new a("FLOATING");
    public static final a c = new a("FLOATING SINGLE");
    private a d = b;
    private double e;

    public double a(double d2) {
        if (Double.isNaN((double)d2)) {
            return d2;
        }
        a a2 = this.d;
        if (a2 == c) {
            return (float)d2;
        }
        if (a2 == a) {
            double d3 = Math.round((double)(d2 * this.e));
            double d4 = this.e;
            Double.isNaN((double)d3);
            return d3 / d4;
        }
        return d2;
    }

    public int a() {
        a a2 = this.d;
        a a3 = b;
        int n2 = 16;
        if (a2 == a3) {
            return n2;
        }
        if (a2 == c) {
            return 6;
        }
        if (a2 == a) {
            n2 = 1 + (int)Math.ceil((double)(Math.log((double)this.b()) / Math.log((double)10.0)));
        }
        return n2;
    }

    public void a(com.b.a.b.a a2) {
        if (this.d == b) {
            return;
        }
        a2.a = this.a(a2.a);
        a2.b = this.a(a2.b);
    }

    public double b() {
        return this.e;
    }

    public int compareTo(Object object) {
        t t2 = (t)object;
        int n2 = this.a();
        int n3 = t2.a();
        return new Integer(n2).compareTo(new Integer(n3));
    }

    public boolean equals(Object object) {
        if (!(object instanceof t)) {
            return false;
        }
        t t2 = (t)object;
        return this.d == t2.d && this.e == t2.e;
    }

    public String toString() {
        String string = "UNKNOWN";
        a a2 = this.d;
        if (a2 == b) {
            return "Floating";
        }
        if (a2 == c) {
            return "Floating-Single";
        }
        if (a2 == a) {
            StringBuilder stringBuilder = new StringBuilder("Fixed (Scale=");
            stringBuilder.append(this.b());
            stringBuilder.append(")");
            string = stringBuilder.toString();
        }
        return string;
    }

    public static class a
    implements Serializable {
        private static Map a = new HashMap();
        private String b;

        public a(String string) {
            this.b = string;
            a.put((Object)string, (Object)this);
        }

        public String toString() {
            return this.b;
        }
    }

}

