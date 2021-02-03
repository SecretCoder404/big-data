/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.b.a.b;

import com.b.a.b.a;
import com.b.a.b.b;
import com.b.a.b.d;
import com.b.a.b.e;
import com.b.a.b.h;
import com.b.a.b.i;
import com.b.a.b.j;
import com.b.a.b.l;
import com.b.a.b.n;

public class s
extends e {
    protected n d = null;
    protected n[] e;

    public s(n n2, n[] arrn, i i2) {
        super(i2);
        if (n2 == null) {
            n2 = this.a().b((b)null);
        }
        if (arrn == null) {
            arrn = new n[]{};
        }
        if (!s.a((Object[])arrn)) {
            if (n2.g() && s.a(arrn)) {
                throw new IllegalArgumentException("shell is empty but holes are not");
            }
            this.d = n2;
            this.e = arrn;
            return;
        }
        throw new IllegalArgumentException("holes must not contain null elements");
    }

    @Override
    protected int a(Object object) {
        return this.d.a(((s)object).d);
    }

    @Override
    public void a(h h2) {
        h2.a(this);
        this.d.a(h2);
        int n2 = 0;
        n[] arrn;
        while (n2 < (arrn = this.e).length) {
            arrn[n2].a(h2);
            ++n2;
        }
        return;
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
        s s2 = (s)e2;
        if (!((e)this.d).a(s2.d, d2)) {
            return false;
        }
        if (this.e.length != s2.e.length) {
            return false;
        }
        int n2 = 0;
        n[] arrn;
        while (n2 < (arrn = this.e).length) {
            if (!((e)arrn[n2]).a(s2.e[n2], d2)) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public l b(int n2) {
        return this.e[n2];
    }

    @Override
    public Object clone() {
        s s2 = (s)super.clone();
        s2.d = (n)this.d.clone();
        s2.e = new n[this.e.length];
        int n2 = 0;
        n[] arrn;
        while (n2 < (arrn = this.e).length) {
            s2.e[n2] = (n)arrn[n2].clone();
            ++n2;
        }
        return s2;
    }

    @Override
    public a d() {
        return this.d.d();
    }

    @Override
    public a[] e() {
        if (this.g()) {
            return new a[0];
        }
        a[] arra = new a[this.f()];
        a[] arra2 = this.d.e();
        int n2 = 0;
        int n3 = -1;
        do {
            if (n2 >= arra2.length) {
                int n4 = 0;
                block1 : do {
                    n[] arrn;
                    if (n4 >= (arrn = this.e).length) {
                        return arra;
                    }
                    a[] arra3 = arrn[n4].e();
                    int n5 = 0;
                    do {
                        if (n5 >= arra3.length) {
                            ++n4;
                            continue block1;
                        }
                        arra[++n3] = arra3[n5];
                        ++n5;
                    } while (true);
                    break;
                } while (true);
            }
            arra[++n3] = arra2[n2];
            ++n2;
        } while (true);
    }

    @Override
    public int f() {
        int n2 = this.d.f();
        int n3 = 0;
        n[] arrn;
        while (n3 < (arrn = this.e).length) {
            n2 += arrn[n3].f();
            ++n3;
        }
        return n2;
    }

    @Override
    public boolean g() {
        return this.d.g();
    }

    @Override
    public double h() {
        double d2 = 0.0 + this.d.h();
        int n2 = 0;
        n[] arrn;
        while (n2 < (arrn = this.e).length) {
            d2 += arrn[n2].h();
            ++n2;
        }
        return d2;
    }

    @Override
    protected d l() {
        return this.d.i();
    }

    public l m() {
        return this.d;
    }

    public int n() {
        return this.e.length;
    }
}

