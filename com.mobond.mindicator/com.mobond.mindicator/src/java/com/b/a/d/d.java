/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.l
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.b.a.d;

import com.b.a.b.a;
import com.b.a.b.e;
import com.b.a.b.l;
import com.b.a.b.m;

public class d {
    private e a;
    private final int b;
    private l c;
    private int d = 0;
    private int e = 0;

    public d(e e2) {
        this(e2, 0, 0);
    }

    public d(e e2, int n2, int n3) {
        if (e2 instanceof m) {
            this.a = e2;
            this.b = e2.b();
            this.d = n2;
            this.e = n3;
            this.i();
            return;
        }
        throw new IllegalArgumentException("Lineal geometry is required");
    }

    private void i() {
        int n2 = this.d;
        if (n2 >= this.b) {
            this.c = null;
            return;
        }
        this.c = (l)this.a.a(n2);
    }

    public boolean a() {
        int n2 = this.d;
        int n3 = this.b;
        if (n2 >= n3) {
            return false;
        }
        return n2 != n3 - 1 || this.e < this.c.f();
    }

    public void b() {
        if (!this.a()) {
            return;
        }
        this.e = 1 + this.e;
        if (this.e >= this.c.f()) {
            this.d = 1 + this.d;
            this.i();
            this.e = 0;
        }
    }

    public boolean c() {
        if (this.d >= this.b) {
            return false;
        }
        return this.e >= this.c.f() - 1;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public l f() {
        return this.c;
    }

    public a g() {
        return this.c.b(this.e);
    }

    public a h() {
        if (this.e < -1 + this.f().f()) {
            return this.c.b(1 + this.e);
        }
        return null;
    }
}

