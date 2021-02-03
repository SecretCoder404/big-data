/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.reflect.Type
 */
package com.google.a.b.a;

import com.google.a.b.a.l;
import com.google.a.d.c;
import com.google.a.f;
import com.google.a.j;
import com.google.a.k;
import com.google.a.r;
import com.google.a.s;
import com.google.a.v;
import com.google.a.w;
import java.lang.reflect.Type;

public final class l<T>
extends v<T> {
    final f a;
    private final s<T> b;
    private final k<T> c;
    private final com.google.a.c.a<T> d;
    private final w e;
    private final l<T> f = new a();
    private v<T> g;

    public l(s<T> s2, k<T> k2, f f2, com.google.a.c.a<T> a2, w w2) {
        this.b = s2;
        this.c = k2;
        this.a = f2;
        this.d = a2;
        this.e = w2;
    }

    private v<T> b() {
        v<T> v2 = this.g;
        if (v2 != null) {
            return v2;
        }
        v<T> v3 = this.a.a(this.e, this.d);
        this.g = v3;
        return v3;
    }

    @Override
    public void a(c c2, T t2) {
        s<T> s2 = this.b;
        if (s2 == null) {
            this.b().a(c2, t2);
            return;
        }
        if (t2 == null) {
            c2.f();
            return;
        }
        com.google.a.b.l.a(s2.a(t2, this.d.b(), (r)((Object)this.f)), c2);
    }

    @Override
    public T b(com.google.a.d.a a2) {
        if (this.c == null) {
            return this.b().b(a2);
        }
        com.google.a.l l2 = com.google.a.b.l.a(a2);
        if (l2.j()) {
            return null;
        }
        return this.c.a(l2, this.d.b(), (j)((Object)this.f));
    }

    private final class a
    implements j,
    r {
        private a() {
        }
    }

}

