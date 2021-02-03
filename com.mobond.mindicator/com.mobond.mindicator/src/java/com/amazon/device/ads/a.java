/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package com.amazon.device.ads;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class a
extends Enum<a> {
    public static final /* enum */ a a = new a(1007);
    public static final /* enum */ a b = new a(1016);
    public static final /* enum */ a c = new a(1017);
    public static final /* enum */ a d = new a(1008);
    public static final /* enum */ a e = new a(1001);
    public static final /* enum */ a f = new a(1002);
    public static final /* enum */ a g = new a(1003);
    public static final /* enum */ a h = new a(1004);
    public static final /* enum */ a i = new a(1014);
    public static final /* enum */ a j = new a(1030);
    public static final /* enum */ a k = new a(1031);
    private static final HashSet<a> m;
    private static final /* synthetic */ a[] n;
    private final int l;

    static {
        a[] arra = new a[]{a, b, c, d, e, f, g, h, i, j, k};
        n = arra;
        m = new HashSet();
        m.add((Object)a);
        m.add((Object)b);
        m.add((Object)c);
        m.add((Object)d);
        m.add((Object)j);
    }

    private a(int n3) {
        this.l = n3;
    }

    public static a a(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 1031: {
                return k;
            }
            case 1030: {
                return j;
            }
            case 1017: {
                return c;
            }
            case 1016: {
                return b;
            }
            case 1014: {
                return i;
            }
            case 1008: {
                return d;
            }
            case 1007: {
                return a;
            }
            case 1004: {
                return h;
            }
            case 1003: {
                return g;
            }
            case 1002: {
                return f;
            }
            case 1001: 
        }
        return e;
    }

    public static boolean a(Set<a> set) {
        Iterator iterator = m.iterator();
        while (iterator.hasNext()) {
            if (!set.contains((Object)((a)((Object)iterator.next())))) continue;
            return true;
        }
        return false;
    }

    public static a valueOf(String string) {
        return (a)Enum.valueOf(a.class, (String)string);
    }

    public static a[] values() {
        return (a[])n.clone();
    }
}

