/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.b.a
 *  com.b.a.b.b.b
 *  com.b.a.b.b.c
 *  com.b.a.b.l
 *  com.b.a.b.r
 *  com.b.a.b.s
 *  com.b.a.f.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.b.a.f.a;

import com.b.a.a.g;
import com.b.a.b.d;
import com.b.a.b.e;
import com.b.a.b.k;
import com.b.a.b.l;
import com.b.a.b.r;
import com.b.a.b.s;
import com.b.a.f.a.a;
import com.b.a.f.a.c;
import java.util.List;

public class b {
    private e[] a;
    private double b = 0.0;
    private g c = new g();
    private c[] d;
    private double e = Double.MAX_VALUE;

    public b(e e2, e e3) {
        this(e2, e3, 0.0);
    }

    public b(e e2, e e3, double d2) {
        e[] arre = this.a = new e[2];
        arre[0] = e2;
        arre[1] = e3;
        this.b = d2;
    }

    public static double a(e e2, e e3) {
        return new b(e2, e3).a();
    }

    private void a(int n2, c[] arrc) {
        int n3 = 1 - n2;
        List list = com.b.a.b.b.c.b((e)this.a[n2]);
        if (list.size() > 0) {
            this.a(a.b((e)this.a[n3]), list, arrc);
            if (this.e <= this.b) {
                c[] arrc2 = this.d;
                arrc2[n3] = arrc[0];
                arrc2[n2] = arrc[1];
                return;
            }
        }
    }

    private void a(l l2, l l3, c[] arrc) {
        if (l2.i().d(l3.i()) > this.e) {
            return;
        }
        com.b.a.b.a[] arra = l2.e();
        com.b.a.b.a[] arra2 = l3.e();
        int n2 = 0;
        block0 : while (n2 < arra.length - 1) {
            int n3 = 0;
            do {
                if (n3 >= arra2.length - 1) {
                    ++n2;
                    continue block0;
                }
                com.b.a.b.a a2 = arra[n2];
                int n4 = n2 + 1;
                com.b.a.b.a a3 = arra[n4];
                com.b.a.b.a a4 = arra2[n3];
                int n5 = n3 + 1;
                double d2 = com.b.a.a.b.a(a2, a3, a4, arra2[n5]);
                if (d2 < this.e) {
                    this.e = d2;
                    com.b.a.b.a[] arra3 = new k(arra[n2], arra[n4]).a(new k(arra2[n3], arra2[n5]));
                    arrc[0] = new c((e)l2, n2, arra3[0]);
                    arrc[1] = new c((e)l3, n3, arra3[1]);
                }
                if (this.e <= this.b) {
                    return;
                }
                n3 = n5;
            } while (true);
            break;
        }
        return;
    }

    private void a(l l2, r r2, c[] arrc) {
        if (l2.i().d(r2.i()) > this.e) {
            return;
        }
        com.b.a.b.a[] arra = l2.e();
        com.b.a.b.a a2 = r2.d();
        int n2 = 0;
        while (n2 < arra.length - 1) {
            com.b.a.b.a a3 = arra[n2];
            int n3 = n2 + 1;
            double d2 = com.b.a.a.b.b(a2, a3, arra[n3]);
            if (d2 < this.e) {
                this.e = d2;
                arrc[0] = new c((e)l2, n2, new k(arra[n2], arra[n3]).d(a2));
                arrc[1] = new c((e)r2, 0, a2);
            }
            if (this.e <= this.b) {
                return;
            }
            n2 = n3;
        }
        return;
    }

    private void a(c c2, s s2, c[] arrc) {
        com.b.a.b.a a2 = c2.a();
        if (2 != this.c.a(a2, (e)s2)) {
            this.e = 0.0;
            arrc[0] = c2;
            arrc[1] = new c((e)s2, a2);
            return;
        }
    }

    private void a(List list, List list2, c[] arrc) {
        int n2 = 0;
        block0 : while (n2 < list.size()) {
            c c2 = (c)list.get(n2);
            int n3 = 0;
            do {
                if (n3 >= list2.size()) {
                    ++n2;
                    continue block0;
                }
                this.a(c2, (s)list2.get(n3), arrc);
                if (this.e <= this.b) {
                    return;
                }
                ++n3;
            } while (true);
            break;
        }
        return;
    }

    private void a(c[] arrc, boolean bl2) {
        if (arrc[0] == null) {
            return;
        }
        if (bl2) {
            c[] arrc2 = this.d;
            arrc2[0] = arrc[1];
            arrc2[1] = arrc[0];
            return;
        }
        c[] arrc3 = this.d;
        arrc3[0] = arrc[0];
        arrc3[1] = arrc[1];
    }

    private void b() {
        if (this.d != null) {
            return;
        }
        this.d = new c[2];
        this.c();
        if (this.e <= this.b) {
            return;
        }
        this.d();
    }

    private void b(List list, List list2, c[] arrc) {
        int n2 = 0;
        block0 : while (n2 < list.size()) {
            l l2 = (l)list.get(n2);
            int n3 = 0;
            do {
                if (n3 >= list2.size()) {
                    ++n2;
                    continue block0;
                }
                this.a(l2, (l)list2.get(n3), arrc);
                if (this.e <= this.b) {
                    return;
                }
                ++n3;
            } while (true);
            break;
        }
        return;
    }

    private void c() {
        c[] arrc = new c[2];
        this.a(0, arrc);
        if (this.e <= this.b) {
            return;
        }
        this.a(1, arrc);
    }

    private void c(List list, List list2, c[] arrc) {
        int n2 = 0;
        block0 : while (n2 < list.size()) {
            r r2 = (r)list.get(n2);
            int n3 = 0;
            do {
                if (n3 >= list2.size()) {
                    ++n2;
                    continue block0;
                }
                r r3 = (r)list2.get(n3);
                double d2 = r2.d().b(r3.d());
                if (d2 < this.e) {
                    this.e = d2;
                    arrc[0] = new c((e)r2, 0, r2.d());
                    arrc[1] = new c((e)r3, 0, r3.d());
                }
                if (this.e <= this.b) {
                    return;
                }
                ++n3;
            } while (true);
            break;
        }
        return;
    }

    private void d() {
        c[] arrc = new c[2];
        List list = com.b.a.b.b.a.b((e)this.a[0]);
        List list2 = com.b.a.b.b.a.b((e)this.a[1]);
        List list3 = com.b.a.b.b.b.b((e)this.a[0]);
        List list4 = com.b.a.b.b.b.b((e)this.a[1]);
        this.b(list, list2, arrc);
        this.a(arrc, false);
        if (this.e <= this.b) {
            return;
        }
        arrc[0] = null;
        arrc[1] = null;
        this.d(list, list4, arrc);
        this.a(arrc, false);
        if (this.e <= this.b) {
            return;
        }
        arrc[0] = null;
        arrc[1] = null;
        this.d(list2, list3, arrc);
        this.a(arrc, true);
        if (this.e <= this.b) {
            return;
        }
        arrc[0] = null;
        arrc[1] = null;
        this.c(list3, list4, arrc);
        this.a(arrc, false);
    }

    private void d(List list, List list2, c[] arrc) {
        int n2 = 0;
        block0 : while (n2 < list.size()) {
            l l2 = (l)list.get(n2);
            int n3 = 0;
            do {
                if (n3 >= list2.size()) {
                    ++n2;
                    continue block0;
                }
                this.a(l2, (r)list2.get(n3), arrc);
                if (this.e <= this.b) {
                    return;
                }
                ++n3;
            } while (true);
            break;
        }
        return;
    }

    public double a() {
        e[] arre = this.a;
        if (arre[0] != null && arre[1] != null) {
            if (!arre[0].g() && !this.a[1].g()) {
                this.b();
                return this.e;
            }
            return 0.0;
        }
        throw new IllegalArgumentException("null geometries are not supported");
    }
}

