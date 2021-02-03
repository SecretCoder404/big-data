/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Iterator
 *  java.util.Set
 */
package com.amazon.device.ads;

import com.amazon.device.ads.a;
import com.amazon.device.ads.x;
import java.util.Iterator;
import java.util.Set;

class l
implements Iterable<a> {
    private String a;
    private String b;
    private String c;
    private x d;
    private Set<a> e;
    private int f;
    private int g;
    private boolean h;
    private long i = -1L;

    protected String a() {
        return this.c;
    }

    protected void a(int n2) {
        this.f = n2;
    }

    protected void a(long l2) {
        this.i = l2;
    }

    protected void a(x x2) {
        this.d = x2;
    }

    protected void a(String string) {
        this.c = string;
    }

    protected void a(Set<a> set) {
        this.e = set;
    }

    public void a(boolean bl2) {
        this.h = bl2;
    }

    protected x b() {
        return this.d;
    }

    protected void b(int n2) {
        this.g = n2;
    }

    protected void b(String string) {
        this.a = string;
    }

    protected Set<a> c() {
        return this.e;
    }

    protected void c(String string) {
        this.b = string;
    }

    protected String d() {
        return this.a;
    }

    protected String e() {
        return this.b;
    }

    public boolean f() {
        return this.h;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public boolean i() {
        if (this.i < 0L) {
            return false;
        }
        long l2 = System.currentTimeMillis() LCMP this.i;
        boolean bl2 = false;
        if (l2 > 0) {
            bl2 = true;
        }
        return bl2;
    }

    public Iterator<a> iterator() {
        return this.e.iterator();
    }

    public long j() {
        long l2 = System.currentTimeMillis();
        return this.i - l2;
    }
}

