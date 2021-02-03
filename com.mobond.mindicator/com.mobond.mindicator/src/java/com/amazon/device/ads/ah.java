/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bc;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ah {
    private static final String a = "ah";
    private final Map<String, String> b;
    private final boolean c;
    private final HashSet<String> d;
    private long e = 0L;
    private boolean f = false;
    private boolean g = true;
    private boolean h;
    private final cy i;

    public ah() {
        this(new bc(), new cz());
    }

    ah(bc bc2, cz cz2) {
        this.i = cz2.a(a);
        this.b = new HashMap();
        this.h = this.c = ah.a(bc2);
        this.d = new HashSet();
    }

    private static boolean a(bc bc2) {
        return bd.a(bc2, 14);
    }

    public String a(String string) {
        return (String)this.b.get((Object)string);
    }

    HashMap<String, String> a() {
        return new HashMap(this.b);
    }

    public long b() {
        return this.e;
    }

    boolean c() {
        return this.e > 0L;
    }

    HashSet<String> d() {
        return this.d;
    }

    public boolean e() {
        return this.f;
    }

    boolean f() {
        return this.g;
    }

    boolean g() {
        return this.h;
    }

    boolean h() {
        return this.c;
    }
}

