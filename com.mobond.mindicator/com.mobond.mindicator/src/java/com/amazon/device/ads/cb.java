/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.amazon.device.ads;

import java.util.Locale;

final class cb
extends Enum<cb> {
    public static final /* enum */ cb a = new cb();
    public static final /* enum */ cb b = new cb();
    public static final /* enum */ cb c = new cb();
    private static final /* synthetic */ cb[] d;

    static {
        cb[] arrcb = new cb[]{a, b, c};
        d = arrcb;
    }

    public static cb valueOf(String string) {
        return (cb)Enum.valueOf(cb.class, (String)string);
    }

    public static cb[] values() {
        return (cb[])d.clone();
    }

    public String toString() {
        return this.name().toLowerCase(Locale.US);
    }
}

