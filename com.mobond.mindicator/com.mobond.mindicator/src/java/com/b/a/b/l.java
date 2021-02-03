/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
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
import com.b.a.b.m;

public class l
extends e
implements m {
    protected b d;

    public l(b b2, i i2) {
        super(i2);
        this.a(b2);
    }

    private void a(b b2) {
        if (b2 == null) {
            b2 = this.a().c().a(new a[0]);
        }
        if (b2.a() != 1) {
            this.d = b2;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid number of points in LineString (found ");
        stringBuilder.append(b2.a());
        stringBuilder.append(" - must be 0 or >= 2)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    protected int a(Object object) {
        int n2;
        l l2 = (l)object;
        int n3 = 0;
        for (n2 = 0; n3 < this.d.a() && n2 < l2.d.a(); ++n3, ++n2) {
            int n4 = this.d.a(n3).compareTo(l2.d.a(n2));
            if (n4 == 0) continue;
            return n4;
        }
        if (n3 < this.d.a()) {
            return 1;
        }
        if (n2 < l2.d.a()) {
            return -1;
        }
        return 0;
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
        l l2 = (l)e2;
        if (this.d.a() != l2.d.a()) {
            return false;
        }
        int n2 = 0;
        while (n2 < this.d.a()) {
            if (!this.a(this.d.a(n2), l2.d.a(n2), d2)) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public a b(int n2) {
        return this.d.a(n2);
    }

    @Override
    protected boolean b(e e2) {
        return e2 instanceof l;
    }

    @Override
    public Object clone() {
        l l2 = (l)super.clone();
        l2.d = (b)this.d.clone();
        return l2;
    }

    @Override
    public a d() {
        if (this.g()) {
            return null;
        }
        return this.d.a(0);
    }

    @Override
    public a[] e() {
        return this.d.b();
    }

    @Override
    public int f() {
        return this.d.a();
    }

    @Override
    public boolean g() {
        return this.d.a() == 0;
    }

    @Override
    public double h() {
        return com.b.a.a.b.a(this.d);
    }

    @Override
    protected d l() {
        if (this.g()) {
            return new d();
        }
        return this.d.a(new d());
    }

    public b m() {
        return this.d;
    }

    public boolean n() {
        if (this.g()) {
            return false;
        }
        return this.b(0).a(this.b(-1 + this.f()));
    }
}

