/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.amazon.device.ads;

import java.util.HashMap;

class ds {
    private final a a;
    private final HashMap<String, String> b = new HashMap();

    public ds(a a2) {
        this.a = a2;
    }

    public a a() {
        return this.a;
    }

    public ds a(String string, String string2) {
        this.b.put((Object)string, (Object)string2);
        return this;
    }

    public String a(String string) {
        return (String)this.b.get((Object)string);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        public static final /* enum */ a i = new a();
        public static final /* enum */ a j = new a();
        public static final /* enum */ a k = new a();
        private static final /* synthetic */ a[] l;

        static {
            a[] arra = new a[]{a, b, c, d, e, f, g, h, i, j, k};
            l = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])l.clone();
        }
    }

}

