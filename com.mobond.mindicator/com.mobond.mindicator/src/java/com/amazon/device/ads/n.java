/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.dh;

class n {
    private final a a;
    private final dh b = new dh();

    public n(a a2) {
        this.a = a2;
    }

    a a() {
        return this.a;
    }

    n a(String string, Object object) {
        this.b.a(string, object);
        return this;
    }

    public dh b() {
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

