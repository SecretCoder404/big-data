/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.f
 *  com.b.a.b.l
 *  com.b.a.b.n
 *  com.b.a.b.o
 *  com.b.a.b.q
 *  com.b.a.b.r
 *  com.b.a.b.s
 *  java.lang.Object
 */
package com.b.a.a;

import com.b.a.a.a;
import com.b.a.a.b;
import com.b.a.b.d;
import com.b.a.b.e;
import com.b.a.b.f;
import com.b.a.b.l;
import com.b.a.b.n;
import com.b.a.b.o;
import com.b.a.b.q;
import com.b.a.b.r;
import com.b.a.b.s;

public class g {
    private a a = a.e;
    private boolean b;
    private int c;

    private int a(com.b.a.b.a a2, l l2) {
        if (!l2.i().b(a2)) {
            return 2;
        }
        com.b.a.b.a[] arra = l2.e();
        if (!l2.n() && (a2.equals(arra[0]) || a2.equals(arra[arra.length - 1]))) {
            return 1;
        }
        if (b.b(a2, arra)) {
            return 0;
        }
        return 2;
    }

    private int a(com.b.a.b.a a2, n n2) {
        if (!n2.i().b(a2)) {
            return 2;
        }
        return b.a(a2, n2.e());
    }

    private int a(com.b.a.b.a a2, r r2) {
        if (r2.d().a(a2)) {
            return 0;
        }
        return 2;
    }

    private int a(com.b.a.b.a a2, s s2) {
        if (s2.g()) {
            return 2;
        }
        int n2 = this.a(a2, (n)s2.m());
        if (n2 == 2) {
            return 2;
        }
        if (n2 == 1) {
            return 1;
        }
        int n3 = 0;
        while (n3 < s2.n()) {
            int n4 = this.a(a2, (n)s2.b(n3));
            if (n4 == 0) {
                return 2;
            }
            if (n4 == 1) {
                return 1;
            }
            ++n3;
        }
        return 0;
    }

    private void a(int n2) {
        if (n2 == 0) {
            this.b = true;
        }
        if (n2 == 1) {
            this.c = 1 + this.c;
        }
    }

    private void b(com.b.a.b.a a2, e e2) {
        if (e2 instanceof r) {
            this.a(this.a(a2, (r)e2));
        }
        if (e2 instanceof l) {
            this.a(this.a(a2, (l)e2));
            return;
        }
        if (e2 instanceof s) {
            this.a(this.a(a2, (s)e2));
            return;
        }
        boolean bl2 = e2 instanceof o;
        int n2 = 0;
        if (bl2) {
            o o2 = (o)e2;
            do {
                if (n2 >= o2.b()) {
                    return;
                }
                this.a(this.a(a2, (l)o2.a(n2)));
                ++n2;
            } while (true);
        }
        if (e2 instanceof q) {
            q q2 = (q)e2;
            do {
                if (n2 >= q2.b()) {
                    return;
                }
                this.a(this.a(a2, (s)q2.a(n2)));
                ++n2;
            } while (true);
        }
        if (e2 instanceof f) {
            com.b.a.b.g g2 = new com.b.a.b.g((e)((f)e2));
            do {
                if (!g2.hasNext()) {
                    return;
                }
                e e3 = (e)g2.next();
                if (e3 == e2) continue;
                this.b(a2, e3);
            } while (true);
        }
    }

    public int a(com.b.a.b.a a2, e e2) {
        if (e2.g()) {
            return 2;
        }
        if (e2 instanceof l) {
            return this.a(a2, (l)e2);
        }
        if (e2 instanceof s) {
            return this.a(a2, (s)e2);
        }
        this.b = false;
        this.c = 0;
        this.b(a2, e2);
        if (this.a.a(this.c)) {
            return 1;
        }
        if (this.c <= 0) {
            if (this.b) {
                return 0;
            }
            return 2;
        }
        return 0;
    }
}

