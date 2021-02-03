/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.b.a.a;

import com.b.a.a.b;
import com.b.a.a.d;
import com.b.a.a.e;
import com.b.a.a.f;
import com.b.a.b.a;
import com.b.a.b.t;

public class j
extends e {
    private void a(a a2, a a3, a a4, a a5, a a6) {
        double d2 = a2.a < a3.a ? a2.a : a3.a;
        double d3 = a2.b < a3.b ? a2.b : a3.b;
        double d4 = a2.a > a3.a ? a2.a : a3.a;
        double d5 = a2.b > a3.b ? a2.b : a3.b;
        double d6 = a4.a < a5.a ? a4.a : a5.a;
        double d7 = a4.b;
        double d8 = d5;
        double d9 = d7 < a5.b ? a4.b : a5.b;
        double d10 = a4.a;
        double d11 = d3;
        double d12 = d10 > a5.a ? a4.a : a5.a;
        double d13 = a4.b;
        double d14 = d9;
        double d15 = d13 > a5.b ? a4.b : a5.b;
        if (d2 > d6) {
            d6 = d2;
        }
        if (d4 < d12) {
            d12 = d4;
        }
        if (!(d11 > d14)) {
            d11 = d14;
        }
        if (d8 < d15) {
            d15 = d8;
        }
        double d16 = (d6 + d12) / 2.0;
        double d17 = (d11 + d15) / 2.0;
        a6.a = d16;
        a6.b = d17;
        a2.a -= a6.a;
        a2.b -= a6.b;
        a3.a -= a6.a;
        a3.b -= a6.b;
        a4.a -= a6.a;
        a4.b -= a6.b;
        a5.a -= a6.a;
        a5.b -= a6.b;
    }

    private boolean a(a a2) {
        com.b.a.b.d d2 = new com.b.a.b.d(this.b[0][0], this.b[0][1]);
        com.b.a.b.d d3 = new com.b.a.b.d(this.b[1][0], this.b[1][1]);
        return d2.c(a2) && d3.c(a2);
    }

    private int c(a a2, a a3, a a4, a a5) {
        boolean bl2 = com.b.a.b.d.a(a2, a3, a4);
        boolean bl3 = com.b.a.b.d.a(a2, a3, a5);
        boolean bl4 = com.b.a.b.d.a(a4, a5, a2);
        boolean bl5 = com.b.a.b.d.a(a4, a5, a3);
        int n2 = 2;
        if (bl2 && bl3) {
            this.c[0] = a4;
            this.c[1] = a5;
            return n2;
        }
        if (bl4 && bl5) {
            this.c[0] = a2;
            this.c[1] = a3;
            return n2;
        }
        if (bl2 && bl4) {
            this.c[0] = a4;
            this.c[1] = a2;
            if (a4.equals(a2) && !bl3 && !bl5) {
                n2 = 1;
            }
            return n2;
        }
        if (bl2 && bl5) {
            this.c[0] = a4;
            this.c[1] = a3;
            if (a4.equals(a3) && !bl3 && !bl4) {
                n2 = 1;
            }
            return n2;
        }
        if (bl3 && bl4) {
            this.c[0] = a5;
            this.c[1] = a2;
            if (a5.equals(a2) && !bl2 && !bl5) {
                n2 = 1;
            }
            return n2;
        }
        if (bl3 && bl5) {
            this.c[0] = a5;
            this.c[1] = a3;
            if (a5.equals(a3) && !bl2 && !bl4) {
                n2 = 1;
            }
            return n2;
        }
        return 0;
    }

    private a d(a a2, a a3, a a4, a a5) {
        a a6 = this.e(a2, a3, a4, a5);
        if (!this.a(a6)) {
            a6 = new a(j.g(a2, a3, a4, a5));
        }
        if (this.g != null) {
            this.g.a(a6);
        }
        return a6;
    }

    private a e(a a2, a a3, a a4, a a5) {
        a a6 = new a(a2);
        a a7 = new a(a3);
        a a8 = new a(a4);
        a a9 = new a(a5);
        a a10 = new a();
        this.a(a6, a7, a8, a9, a10);
        a a11 = this.f(a6, a7, a8, a9);
        a11.a += a10.a;
        a11.b += a10.b;
        return a11;
    }

    private a f(a a2, a a3, a a4, a a5) {
        try {
            a a6 = d.a(a2, a3, a4, a5);
            return a6;
        }
        catch (f f2) {
            return j.g(a2, a3, a4, a5);
        }
    }

    private static a g(a a2, a a3, a a4, a a5) {
        a a6;
        double d2 = b.b(a2, a4, a5);
        double d3 = b.b(a3, a4, a5);
        if (d3 < d2) {
            d2 = d3;
            a6 = a3;
        } else {
            a6 = a2;
        }
        double d4 = b.b(a4, a2, a3);
        if (d4 < d2) {
            d2 = d4;
        } else {
            a4 = a6;
        }
        if (b.b(a5, a2, a3) < d2) {
            a4 = a5;
        }
        return a4;
    }

    @Override
    public void a(a a2, a a3, a a4) {
        this.d = false;
        if (com.b.a.b.d.a(a3, a4, a2) && b.a(a3, a4, a2) == 0 && b.a(a4, a3, a2) == 0) {
            this.d = true;
            if (a2.equals(a3) || a2.equals(a4)) {
                this.d = false;
            }
            this.a = 1;
            return;
        }
        this.a = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int b(a a2, a a3, a a4, a a5) {
        this.d = false;
        if (!com.b.a.b.d.a(a2, a3, a4, a5)) {
            return 0;
        }
        int n2 = b.a(a2, a3, a4);
        int n3 = b.a(a2, a3, a5);
        if (n2 > 0 && n3 > 0 || n2 < 0 && n3 < 0) {
            return 0;
        }
        int n4 = b.a(a4, a5, a2);
        int n5 = b.a(a4, a5, a3);
        if (n4 > 0 && n5 > 0 || n4 < 0 && n5 < 0) {
            return 0;
        }
        boolean bl2 = n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0;
        if (bl2) {
            return this.c(a2, a3, a4, a5);
        }
        if (n2 != 0 && n3 != 0 && n4 != 0 && n5 != 0) {
            this.d = true;
            this.c[0] = this.d(a2, a3, a4, a5);
            return 1;
        }
        this.d = false;
        if (!a2.a(a4) && !a2.a(a5)) {
            if (!a3.a(a4) && !a3.a(a5)) {
                if (n2 == 0) {
                    this.c[0] = new a(a4);
                    return 1;
                }
                if (n3 == 0) {
                    this.c[0] = new a(a5);
                    return 1;
                }
                if (n4 == 0) {
                    this.c[0] = new a(a2);
                    return 1;
                }
                if (n5 != 0) return 1;
                this.c[0] = new a(a3);
                return 1;
            }
            this.c[0] = a3;
            return 1;
        }
        this.c[0] = a2;
        return 1;
    }
}

