/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.aa$a$1
 *  com.google.b.aa$a$2
 *  com.google.b.aa$a$3
 *  com.google.b.aa$a$4
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.b;

import com.google.b.aa;
import com.google.b.e;

public final class aa {
    static final int a = aa.a(1, 3);
    static final int b = aa.a(1, 4);
    static final int c = aa.a(2, 0);
    static final int d = aa.a(3, 2);

    public static int a(int n2) {
        return n2 & 7;
    }

    static int a(int n2, int n3) {
        return n3 | n2 << 3;
    }

    public static int b(int n2) {
        return n2 >>> 3;
    }

    public static class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(b.d, 1);
        public static final /* enum */ a b = new a(b.c, 5);
        public static final /* enum */ a c = new a(b.b, 0);
        public static final /* enum */ a d = new a(b.b, 0);
        public static final /* enum */ a e = new a(b.a, 0);
        public static final /* enum */ a f = new a(b.b, 1);
        public static final /* enum */ a g = new a(b.a, 5);
        public static final /* enum */ a h = new a(b.e, 0);
        public static final /* enum */ a i = new 1("STRING", 8, b.f, 2);
        public static final /* enum */ a j = new 2("GROUP", 9, b.i, 3);
        public static final /* enum */ a k = new 3("MESSAGE", 10, b.i, 2);
        public static final /* enum */ a l = new 4("BYTES", 11, b.g, 2);
        public static final /* enum */ a m = new a(b.a, 0);
        public static final /* enum */ a n = new a(b.h, 0);
        public static final /* enum */ a o = new a(b.a, 5);
        public static final /* enum */ a p = new a(b.b, 1);
        public static final /* enum */ a q = new a(b.a, 0);
        public static final /* enum */ a r = new a(b.b, 0);
        private static final /* synthetic */ a[] u;
        private final b s;
        private final int t;

        static {
            a[] arra = new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
            u = arra;
        }

        private a(b b2, int n3) {
            this.s = b2;
            this.t = n3;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])u.clone();
        }

        public b a() {
            return this.s;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(0);
        public static final /* enum */ b b = new b(0L);
        public static final /* enum */ b c = new b((Object)Float.valueOf((float)0.0f));
        public static final /* enum */ b d = new b(0.0);
        public static final /* enum */ b e = new b(false);
        public static final /* enum */ b f = new b("");
        public static final /* enum */ b g = new b(e.a);
        public static final /* enum */ b h = new b(null);
        public static final /* enum */ b i = new b(null);
        private static final /* synthetic */ b[] k;
        private final Object j;

        static {
            b[] arrb = new b[]{a, b, c, d, e, f, g, h, i};
            k = arrb;
        }

        private b(Object object) {
            this.j = object;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])k.clone();
        }
    }

}

