/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.e$1
 *  com.b.a.b.f
 *  com.b.a.b.l
 *  com.b.a.b.n
 *  com.b.a.b.o
 *  com.b.a.b.p
 *  com.b.a.b.q
 *  com.b.a.b.r
 *  com.b.a.b.s
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Iterator
 */
package com.b.a.b;

import com.b.a.b.a;
import com.b.a.b.d;
import com.b.a.b.e;
import com.b.a.b.f;
import com.b.a.b.h;
import com.b.a.b.i;
import com.b.a.b.j;
import com.b.a.b.l;
import com.b.a.b.n;
import com.b.a.b.o;
import com.b.a.b.p;
import com.b.a.b.q;
import com.b.a.b.r;
import com.b.a.b.s;
import com.b.a.b.t;
import com.b.a.c.c;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public abstract class e
implements Serializable,
Cloneable,
Comparable {
    private static final Class[] d = new Class[]{r.class, p.class, l.class, n.class, o.class, s.class, q.class, f.class};
    private static final h e = new 1();
    protected d a;
    protected final i b;
    protected int c;
    private Object f = null;

    public e(i i2) {
        this.b = i2;
        this.c = i2.b();
    }

    protected static boolean a(e[] arre) {
        int n2 = 0;
        while (n2 < arre.length) {
            if (!arre[n2].g()) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    protected static boolean a(Object[] arrobject) {
        int n2 = 0;
        while (n2 < arrobject.length) {
            if (arrobject[n2] == null) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private int m() {
        int n2 = 0;
        do {
            Class[] arrclass;
            if (n2 >= (arrclass = d).length) {
                StringBuilder stringBuilder = new StringBuilder("Class not supported: ");
                stringBuilder.append((Object)this.getClass());
                com.b.a.g.a.a(stringBuilder.toString());
                return -1;
            }
            if (arrclass[n2].isInstance((Object)this)) {
                return n2;
            }
            ++n2;
        } while (true);
    }

    protected abstract int a(Object var1);

    protected int a(Collection collection, Collection collection2) {
        Iterator iterator = collection.iterator();
        Iterator iterator2 = collection2.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            int n2 = ((Comparable)iterator.next()).compareTo((Object)((Comparable)iterator2.next()));
            if (n2 == 0) continue;
            return n2;
        }
        if (iterator.hasNext()) {
            return 1;
        }
        if (iterator2.hasNext()) {
            return -1;
        }
        return 0;
    }

    public e a(int n2) {
        return this;
    }

    public i a() {
        return this.b;
    }

    public abstract void a(h var1);

    public abstract void a(j var1);

    protected boolean a(a a2, a a3, double d2) {
        if (d2 == 0.0) {
            return a2.equals(a3);
        }
        return a2.b(a3) <= d2;
    }

    public boolean a(e e2) {
        return this == e2 || this.a(e2, 0.0);
    }

    public abstract boolean a(e var1, double var2);

    public int b() {
        return 1;
    }

    protected boolean b(e e2) {
        return this.getClass().getName().equals((Object)e2.getClass().getName());
    }

    public t c() {
        return this.b.a();
    }

    public Object clone() {
        try {
            e e2 = (e)super.clone();
            if (e2.a != null) {
                e2.a = new d(e2.a);
            }
            return e2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            com.b.a.g.a.a();
            return null;
        }
    }

    public int compareTo(Object object) {
        e e2 = (e)object;
        if (this.m() != e2.m()) {
            return this.m() - e2.m();
        }
        if (this.g() && e2.g()) {
            return 0;
        }
        if (this.g()) {
            return -1;
        }
        if (e2.g()) {
            return 1;
        }
        return this.a(object);
    }

    public abstract a d();

    public abstract a[] e();

    public boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        return this.a((e)object);
    }

    public abstract int f();

    public abstract boolean g();

    public double h() {
        return 0.0;
    }

    public int hashCode() {
        return this.i().hashCode();
    }

    public d i() {
        if (this.a == null) {
            this.a = this.l();
        }
        return new d(this.a);
    }

    protected void j() {
        this.a = null;
    }

    public String k() {
        return new c().a(this);
    }

    protected abstract d l();

    public String toString() {
        return this.k();
    }
}

