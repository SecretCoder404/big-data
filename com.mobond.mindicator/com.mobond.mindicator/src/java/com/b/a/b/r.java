/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.b.a.b;

import com.b.a.b.a;
import com.b.a.b.b;
import com.b.a.b.c;
import com.b.a.b.d;
import com.b.a.b.e;
import com.b.a.b.h;
import com.b.a.b.i;
import com.b.a.b.j;

public class r
extends e {
    private b d;

    public r(b b2, i i2) {
        super(i2);
        this.a(b2);
    }

    private void a(b b2) {
        if (b2 == null) {
            b2 = this.a().c().a(new a[0]);
        }
        int n2 = b2.a();
        boolean bl2 = false;
        if (n2 <= 1) {
            bl2 = true;
        }
        com.b.a.g.a.a(bl2);
        this.d = b2;
    }

    @Override
    protected int a(Object object) {
        r r2 = (r)object;
        return this.d().compareTo(r2.d());
    }

    @Override
    public void a(h h2) {
        h2.a(this);
    }

    @Override
    public void a(j j2) {
        j2.a(this);
    }

    @Override
    public boolean a(e e2, double d2) {
        if (!this.b(e2)) {
            return false;
        }
        if (this.g() && e2.g()) {
            return true;
        }
        if (this.g() != e2.g()) {
            return false;
        }
        return this.a(((r)e2).d(), this.d(), d2);
    }

    @Override
    public Object clone() {
        r r2 = (r)super.clone();
        r2.d = (b)this.d.clone();
        return r2;
    }

    @Override
    public a d() {
        if (this.d.a() != 0) {
            return this.d.a(0);
        }
        return null;
    }

    @Override
    public a[] e() {
        if (this.g()) {
            return new a[0];
        }
        a[] arra = new a[]{this.d()};
        return arra;
    }

    @Override
    public int f() {
        return true ^ this.g();
    }

    @Override
    public boolean g() {
        return this.d.a() == 0;
    }

    @Override
    protected d l() {
        if (this.g()) {
            return new d();
        }
        d d2 = new d();
        d2.a(this.d.b(0), this.d.c(0));
        return d2;
    }
}

