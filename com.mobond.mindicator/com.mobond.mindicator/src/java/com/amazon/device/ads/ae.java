/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;

public class ae {
    public static final ae a = new ae(320, 50);
    public static final ae b = new ae(300, 250);
    public static final ae c = new ae(600, 90);
    public static final ae d = new ae(728, 90);
    public static final ae e = new ae(1024, 50);
    public static final ae f = new ae(c.b);
    public static final ae g = new ae(c.b, b.b);
    static final ae h = new ae(c.c, a.a);
    static final ae i = new ae(c.c);
    private static final String j = "ae";
    private int k;
    private int l;
    private int m = 17;
    private c n = c.a;
    private a o = a.b;
    private b p = b.a;
    private int q;
    private final cy r = new cz().a(j);

    public ae(int n2, int n3) {
        this.b(n2, n3);
    }

    ae(c c2) {
        this.n = c2;
    }

    ae(c c2, a a2) {
        this(c2);
        this.o = a2;
    }

    ae(c c2, b b2) {
        this(c2);
        this.p = b2;
    }

    static String a(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString((int)n2));
        stringBuilder.append("x");
        stringBuilder.append(Integer.toString((int)n3));
        return stringBuilder.toString();
    }

    private void b(int n2, int n3) {
        if (n2 > 0 && n3 > 0) {
            this.k = n2;
            this.l = n3;
            this.n = c.a;
            return;
        }
        this.r.f("The width and height must be positive integers.");
        throw new IllegalArgumentException("The width and height must be positive integers.");
    }

    private ae g() {
        ae ae2 = new ae(this.n);
        ae2.k = this.k;
        ae2.l = this.l;
        ae2.m = this.m;
        ae2.o = this.o;
        ae2.p = this.p;
        ae2.q = this.q;
        return ae2;
    }

    public int a() {
        return this.m;
    }

    ae a(int n2) {
        ae ae2 = this.g();
        ae2.q = n2;
        return ae2;
    }

    public boolean b() {
        return this.n == c.b;
    }

    boolean c() {
        return a.a.equals((Object)this.o);
    }

    c d() {
        return this.n;
    }

    public boolean e() {
        return b.a.equals((Object)this.p);
    }

    public boolean equals(Object object) {
        if (object instanceof ae) {
            ae ae2 = (ae)object;
            if (this.n.equals((Object)ae2.n)) {
                if (this.n.equals((Object)c.a) && (this.k != ae2.k || this.l != ae2.l)) {
                    return false;
                }
                int n2 = this.m;
                int n3 = ae2.m;
                boolean bl2 = false;
                if (n2 == n3) {
                    int n4 = this.q;
                    int n5 = ae2.q;
                    bl2 = false;
                    if (n4 == n5) {
                        b b2 = this.p;
                        b b3 = ae2.p;
                        bl2 = false;
                        if (b2 == b3) {
                            a a2 = this.o;
                            a a3 = ae2.o;
                            bl2 = false;
                            if (a2 == a3) {
                                bl2 = true;
                            }
                        }
                    }
                }
                return bl2;
            }
        }
        return false;
    }

    int f() {
        return this.q;
    }

    public String toString() {
        switch (1.a[this.n.ordinal()]) {
            default: {
                return null;
            }
            case 3: {
                return "interstitial";
            }
            case 2: {
                return "auto";
            }
            case 1: 
        }
        return ae.a(this.k, this.l);
    }

    private static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        static {
            a[] arra = new a[]{a, b};
            c = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])c.clone();
        }
    }

    private static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        static {
            b[] arrb = new b[]{a, b};
            c = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])c.clone();
        }
    }

    static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        static {
            c[] arrc = new c[]{a, b, c};
            d = arrc;
        }

        public static c valueOf(String string) {
            return (c)Enum.valueOf(c.class, (String)string);
        }

        public static c[] values() {
            return (c[])d.clone();
        }
    }

}

