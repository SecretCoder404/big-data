/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.a.b
 *  com.b.a.b.f
 *  com.b.a.b.l
 *  com.b.a.b.n
 *  com.b.a.b.o
 *  com.b.a.b.p
 *  com.b.a.b.q
 *  com.b.a.b.r
 *  com.b.a.b.s
 *  java.io.Serializable
 *  java.lang.Object
 */
package com.b.a.b;

import com.b.a.b.a;
import com.b.a.b.a.b;
import com.b.a.b.c;
import com.b.a.b.e;
import com.b.a.b.f;
import com.b.a.b.l;
import com.b.a.b.n;
import com.b.a.b.o;
import com.b.a.b.p;
import com.b.a.b.q;
import com.b.a.b.r;
import com.b.a.b.s;
import com.b.a.b.t;
import java.io.Serializable;

public class i
implements Serializable {
    private t a;
    private c b;
    private int c;

    public i() {
        this(new t(), 0);
    }

    public i(t t2, int n2) {
        this(t2, n2, i.d());
    }

    public i(t t2, int n2, c c2) {
        this.a = t2;
        this.b = c2;
        this.c = n2;
    }

    private static c d() {
        return b.a();
    }

    public f a(e[] arre) {
        return new f(arre, this);
    }

    public n a(a[] arra) {
        com.b.a.b.b b2 = arra != null ? this.c().a(arra) : null;
        return this.b(b2);
    }

    public o a(l[] arrl) {
        return new o(arrl, this);
    }

    public p a(r[] arrr) {
        return new p(arrr, this);
    }

    public q a(s[] arrs) {
        return new q(arrs, this);
    }

    public r a(a a2) {
        com.b.a.b.b b2 = a2 != null ? this.c().a(new a[]{a2}) : null;
        return this.a(b2);
    }

    public r a(com.b.a.b.b b2) {
        return new r(b2, this);
    }

    public s a(n n2, n[] arrn) {
        return new s(n2, arrn, this);
    }

    public t a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public l b(a[] arra) {
        com.b.a.b.b b2 = arra != null ? this.c().a(arra) : null;
        return this.c(b2);
    }

    public n b(com.b.a.b.b b2) {
        return new n(b2, this);
    }

    public c c() {
        return this.b;
    }

    public l c(com.b.a.b.b b2) {
        return new l(b2, this);
    }
}

