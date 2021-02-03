/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

public class m {
    private final a a;
    private final String b;

    m(a a2, String string) {
        this.a = a2;
        this.b = string;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        static {
            a[] arra = new a[]{a, b, c, d, e};
            f = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }

}

