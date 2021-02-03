/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 */
package com.google.b;

import com.google.b.aa;
import com.google.b.e;
import com.google.b.f;
import com.google.b.g;
import com.google.b.m;
import com.google.b.r;
import java.util.Arrays;

public final class x {
    private static final x a = new x(0, new int[0], new Object[0], false);
    private int b;
    private int[] c;
    private Object[] d;
    private int e = -1;
    private boolean f;

    private x() {
        this(0, new int[8], new Object[8], true);
    }

    private x(int n2, int[] arrn, Object[] arrobject, boolean bl2) {
        this.b = n2;
        this.c = arrn;
        this.d = arrobject;
        this.f = bl2;
    }

    public static x a() {
        return a;
    }

    private x a(f f2) {
        int n2;
        while ((n2 = f2.a()) != 0 && this.a(n2, f2)) {
        }
        return this;
    }

    static x a(x x2, x x3) {
        int n2 = x2.b + x3.b;
        int[] arrn = Arrays.copyOf((int[])x2.c, (int)n2);
        System.arraycopy((Object)x3.c, (int)0, (Object)arrn, (int)x2.b, (int)x3.b);
        Object[] arrobject = Arrays.copyOf((Object[])x2.d, (int)n2);
        System.arraycopy((Object)x3.d, (int)0, (Object)arrobject, (int)x2.b, (int)x3.b);
        return new x(n2, arrn, arrobject, true);
    }

    private void a(int n2, Object object) {
        this.f();
        int[] arrn = this.c;
        int n3 = this.b;
        arrn[n3] = n2;
        this.d[n3] = object;
        this.b = n3 + 1;
    }

    static x b() {
        return new x();
    }

    private void f() {
        int n2 = this.b;
        if (n2 == this.c.length) {
            int n3 = n2 < 4 ? 8 : n2 >> 1;
            int n4 = n3 + this.b;
            this.c = Arrays.copyOf((int[])this.c, (int)n4);
            this.d = Arrays.copyOf((Object[])this.d, (int)n4);
        }
    }

    public void a(g g2) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            int n2 = this.c[i2];
            int n3 = aa.b(n2);
            int n4 = aa.a(n2);
            if (n4 != 5) {
                switch (n4) {
                    default: {
                        throw m.f();
                    }
                    case 3: {
                        g2.a(n3, 3);
                        ((x)this.d[i2]).a(g2);
                        g2.a(n3, 4);
                        break;
                    }
                    case 2: {
                        g2.a(n3, (e)this.d[i2]);
                        break;
                    }
                    case 1: {
                        g2.c(n3, (Long)this.d[i2]);
                        break;
                    }
                    case 0: {
                        g2.b(n3, (Long)this.d[i2]);
                        break;
                    }
                }
                continue;
            }
            g2.c(n3, (Integer)this.d[i2]);
        }
    }

    final void a(StringBuilder stringBuilder, int n2) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            r.a(stringBuilder, n2, String.valueOf((int)aa.b(this.c[i2])), this.d[i2]);
        }
    }

    boolean a(int n2, f f2) {
        this.d();
        int n3 = aa.b(n2);
        switch (aa.a(n2)) {
            default: {
                throw m.f();
            }
            case 5: {
                this.a(n2, (Object)f2.f());
                return true;
            }
            case 4: {
                return false;
            }
            case 3: {
                x x2 = new x();
                x2.a(f2);
                f2.a(aa.a(n3, 4));
                this.a(n2, x2);
                return true;
            }
            case 2: {
                this.a(n2, f2.j());
                return true;
            }
            case 1: {
                this.a(n2, f2.e());
                return true;
            }
            case 0: 
        }
        this.a(n2, f2.c());
        return true;
    }

    public void c() {
        this.f = false;
    }

    void d() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public int e() {
        int n2 = this.e;
        if (n2 != -1) {
            return n2;
        }
        int n3 = 0;
        for (int i2 = 0; i2 < this.b; ++i2) {
            int n4 = this.c[i2];
            int n5 = aa.b(n4);
            int n6 = aa.a(n4);
            if (n6 != 5) {
                switch (n6) {
                    default: {
                        throw new IllegalStateException((Throwable)m.f());
                    }
                    case 3: {
                        n3 += 2 * g.b(n5) + ((x)this.d[i2]).e();
                        break;
                    }
                    case 2: {
                        n3 += g.b(n5, (e)this.d[i2]);
                        break;
                    }
                    case 1: {
                        n3 += g.f(n5, (Long)this.d[i2]);
                        break;
                    }
                    case 0: {
                        n3 += g.e(n5, (Long)this.d[i2]);
                        break;
                    }
                }
                continue;
            }
            n3 += g.f(n5, (Integer)this.d[i2]);
        }
        this.e = n3;
        return n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof x)) {
            return false;
        }
        x x2 = (x)object;
        if (this.b == x2.b && Arrays.equals((int[])this.c, (int[])x2.c)) {
            return Arrays.deepEquals((Object[])this.d, (Object[])x2.d);
        }
        return false;
    }

    public int hashCode() {
        return 31 * (31 * (527 + this.b) + Arrays.hashCode((int[])this.c)) + Arrays.deepHashCode((Object[])this.d);
    }
}

