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

final class dp
extends Enum<dp> {
    public static final /* enum */ dp a = new dp();
    public static final /* enum */ dp b = new dp();
    public static final /* enum */ dp c = new dp();
    public static final /* enum */ dp d = new dp();
    public static final /* enum */ dp e = new dp();
    public static final /* enum */ dp f = new dp();
    public static final /* enum */ dp g = new dp();
    private static final HashMap<String, dp> h;
    private static final /* synthetic */ dp[] i;

    static {
        dp[] arrdp = new dp[]{a, b, c, d, e, f, g};
        i = arrdp;
        h = new HashMap();
        h.put((Object)"top-left", (Object)a);
        h.put((Object)"top-right", (Object)b);
        h.put((Object)"top-center", (Object)f);
        h.put((Object)"bottom-left", (Object)d);
        h.put((Object)"bottom-right", (Object)e);
        h.put((Object)"bottom-center", (Object)g);
        h.put((Object)"center", (Object)c);
    }

    public static dp a(String string) {
        return (dp)((Object)h.get((Object)string));
    }

    public static dp valueOf(String string) {
        return (dp)Enum.valueOf(dp.class, (String)string);
    }

    public static dp[] values() {
        return (dp[])i.clone();
    }
}

