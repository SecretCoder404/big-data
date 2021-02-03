/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.a.u$1
 *  com.google.a.u$2
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.a;

import com.google.a.u;

public abstract class u
extends Enum<u> {
    public static final /* enum */ u a = new 1("DEFAULT", 0);
    public static final /* enum */ u b = new 2("STRING", 1);
    private static final /* synthetic */ u[] c;

    static {
        u[] arru = new u[]{a, b};
        c = arru;
    }

    private u() {
    }

    public static u valueOf(String string) {
        return (u)Enum.valueOf(u.class, (String)string);
    }

    public static u[] values() {
        return (u[])c.clone();
    }
}

