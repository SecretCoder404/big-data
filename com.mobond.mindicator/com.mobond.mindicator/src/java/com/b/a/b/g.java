/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.f
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package com.b.a.b;

import com.b.a.b.e;
import com.b.a.b.f;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class g
implements Iterator {
    private e a;
    private boolean b;
    private int c;
    private int d;
    private g e;

    public g(e e2) {
        this.a = e2;
        this.b = true;
        this.d = 0;
        this.c = e2.b();
    }

    private static boolean a(e e2) {
        return !(e2 instanceof f);
    }

    public boolean hasNext() {
        if (this.b) {
            return true;
        }
        g g2 = this.e;
        if (g2 != null) {
            if (g2.hasNext()) {
                return true;
            }
            this.e = null;
        }
        return this.d < this.c;
    }

    public Object next() {
        int n2;
        if (this.b) {
            this.b = false;
            if (g.a(this.a)) {
                this.d = 1 + this.d;
            }
            return this.a;
        }
        g g2 = this.e;
        if (g2 != null) {
            if (g2.hasNext()) {
                return this.e.next();
            }
            this.e = null;
        }
        if ((n2 = this.d) < this.c) {
            e e2 = this.a;
            this.d = n2 + 1;
            e e3 = e2.a(n2);
            if (e3 instanceof f) {
                this.e = new g((e)((f)e3));
                return this.e.next();
            }
            return e3;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException(this.getClass().getName());
    }
}

