/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.TreeSet
 */
package com.b.a.b;

import com.b.a.b.a;
import com.b.a.b.d;
import com.b.a.b.e;
import com.b.a.b.h;
import com.b.a.b.i;
import com.b.a.b.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class f
extends e {
    protected e[] d;

    public f(e[] arre, i i2) {
        super(i2);
        if (arre == null) {
            arre = new e[]{};
        }
        if (!f.a((Object[])arre)) {
            this.d = arre;
            return;
        }
        throw new IllegalArgumentException("geometries must not contain null elements");
    }

    @Override
    protected int a(Object object) {
        return this.a((Collection)new TreeSet((Collection)Arrays.asList((Object[])this.d)), (Collection)new TreeSet((Collection)Arrays.asList((Object[])((f)object).d)));
    }

    @Override
    public e a(int n2) {
        return this.d[n2];
    }

    @Override
    public void a(h h2) {
        h2.a(this);
        int n2 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            arre[n2].a(h2);
            ++n2;
        }
        return;
    }

    @Override
    public void a(j j2) {
        j2.a(this);
        int n2 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            arre[n2].a(j2);
            ++n2;
        }
        return;
    }

    @Override
    public boolean a(e e2, double d2) {
        if (!this.b(e2)) {
            return false;
        }
        f f2 = (f)e2;
        if (this.d.length != f2.d.length) {
            return false;
        }
        int n2 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            if (!arre[n2].a(f2.d[n2], d2)) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    @Override
    public int b() {
        return this.d.length;
    }

    @Override
    public Object clone() {
        f f2 = (f)super.clone();
        f2.d = new e[this.d.length];
        int n2 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            f2.d[n2] = (e)arre[n2].clone();
            ++n2;
        }
        return f2;
    }

    @Override
    public a d() {
        if (this.g()) {
            return null;
        }
        return this.d[0].d();
    }

    @Override
    public a[] e() {
        a[] arra = new a[this.f()];
        int n2 = 0;
        int n3 = -1;
        e[] arre;
        block0 : while (n2 < (arre = this.d).length) {
            a[] arra2 = arre[n2].e();
            int n4 = n3;
            int n5 = 0;
            do {
                if (n5 >= arra2.length) {
                    ++n2;
                    n3 = n4;
                    continue block0;
                }
                arra[++n4] = arra2[n5];
                ++n5;
            } while (true);
            break;
        }
        return arra;
    }

    @Override
    public int f() {
        int n2 = 0;
        int n3 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            n3 += arre[n2].f();
            ++n2;
        }
        return n3;
    }

    @Override
    public boolean g() {
        int n2 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            if (!arre[n2].g()) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    @Override
    public double h() {
        double d2 = 0.0;
        int n2 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            d2 += arre[n2].h();
            ++n2;
        }
        return d2;
    }

    @Override
    protected d l() {
        d d2 = new d();
        int n2 = 0;
        e[] arre;
        while (n2 < (arre = this.d).length) {
            d2.b(arre[n2].i());
            ++n2;
        }
        return d2;
    }
}

