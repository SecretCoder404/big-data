/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.a.b.a;

import com.google.a.b.a.e;
import com.google.a.d.a;
import com.google.a.d.b;
import com.google.a.i;
import com.google.a.l;
import com.google.a.n;
import com.google.a.o;
import com.google.a.q;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
extends a {
    private static final Reader b = new Reader(){

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] arrc, int n2, int n3) {
            throw new AssertionError();
        }
    };
    private static final Object c = new Object();
    private Object[] d;
    private int e;
    private String[] f;
    private int[] g;

    private void a(b b2) {
        if (this.f() == b2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append((Object)b2);
        stringBuilder.append(" but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.v());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void a(Object object) {
        int n2 = this.e;
        Object[] arrobject = this.d;
        if (n2 == arrobject.length) {
            Object[] arrobject2 = new Object[n2 * 2];
            int[] arrn = new int[n2 * 2];
            String[] arrstring = new String[n2 * 2];
            System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n2);
            System.arraycopy((Object)this.g, (int)0, (Object)arrn, (int)0, (int)this.e);
            System.arraycopy((Object)this.f, (int)0, (Object)arrstring, (int)0, (int)this.e);
            this.d = arrobject2;
            this.g = arrn;
            this.f = arrstring;
        }
        Object[] arrobject3 = this.d;
        int n3 = this.e;
        this.e = n3 + 1;
        arrobject3[n3] = object;
    }

    private Object t() {
        return this.d[-1 + this.e];
    }

    private Object u() {
        int n2;
        Object[] arrobject = this.d;
        this.e = n2 = -1 + this.e;
        Object object = arrobject[n2];
        arrobject[this.e] = null;
        return object;
    }

    private String v() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(this.p());
        return stringBuilder.toString();
    }

    @Override
    public void a() {
        this.a(b.a);
        this.a(((i)this.t()).iterator());
        this.g[-1 + this.e] = 0;
    }

    @Override
    public void b() {
        this.a(b.b);
        this.u();
        this.u();
        int n2 = this.e;
        if (n2 > 0) {
            int[] arrn = this.g;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    @Override
    public void c() {
        this.a(b.c);
        this.a((Object)((o)this.t()).o().iterator());
    }

    @Override
    public void close() {
        Object[] arrobject = new Object[]{c};
        this.d = arrobject;
        this.e = 1;
    }

    @Override
    public void d() {
        this.a(b.d);
        this.u();
        this.u();
        int n2 = this.e;
        if (n2 > 0) {
            int[] arrn = this.g;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    @Override
    public boolean e() {
        b b2 = this.f();
        return b2 != b.d && b2 != b.b;
    }

    @Override
    public b f() {
        if (this.e == 0) {
            return b.j;
        }
        Object object = this.t();
        if (object instanceof Iterator) {
            boolean bl2 = this.d[-2 + this.e] instanceof o;
            Iterator iterator = (Iterator)object;
            if (iterator.hasNext()) {
                if (bl2) {
                    return b.e;
                }
                this.a(iterator.next());
                return this.f();
            }
            if (bl2) {
                return b.d;
            }
            return b.b;
        }
        if (object instanceof o) {
            return b.c;
        }
        if (object instanceof i) {
            return b.a;
        }
        if (object instanceof q) {
            q q2 = (q)object;
            if (q2.q()) {
                return b.f;
            }
            if (q2.o()) {
                return b.h;
            }
            if (q2.p()) {
                return b.g;
            }
            throw new AssertionError();
        }
        if (object instanceof n) {
            return b.i;
        }
        if (object == c) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    @Override
    public String g() {
        String string;
        this.a(b.e);
        Map.Entry entry = (Map.Entry)((Iterator)this.t()).next();
        this.f[-1 + this.e] = string = (String)entry.getKey();
        this.a(entry.getValue());
        return string;
    }

    @Override
    public String h() {
        b b2 = this.f();
        if (b2 != b.f && b2 != b.g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.f);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.v());
            throw new IllegalStateException(stringBuilder.toString());
        }
        String string = ((q)this.u()).b();
        int n2 = this.e;
        if (n2 > 0) {
            int[] arrn = this.g;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return string;
    }

    @Override
    public boolean i() {
        this.a(b.h);
        boolean bl2 = ((q)this.u()).f();
        int n2 = this.e;
        if (n2 > 0) {
            int[] arrn = this.g;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return bl2;
    }

    @Override
    public void j() {
        this.a(b.i);
        this.u();
        int n2 = this.e;
        if (n2 > 0) {
            int[] arrn = this.g;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    @Override
    public double k() {
        b b2 = this.f();
        if (b2 != b.g && b2 != b.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.g);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.v());
            throw new IllegalStateException(stringBuilder.toString());
        }
        double d2 = ((q)this.t()).c();
        if (!this.q() && (Double.isNaN((double)d2) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            throw new NumberFormatException(stringBuilder.toString());
        }
        this.u();
        int n2 = this.e;
        if (n2 > 0) {
            int[] arrn = this.g;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return d2;
    }

    @Override
    public long l() {
        b b2 = this.f();
        if (b2 != b.g && b2 != b.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.g);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.v());
            throw new IllegalStateException(stringBuilder.toString());
        }
        long l2 = ((q)this.t()).d();
        this.u();
        int n2 = this.e;
        if (n2 > 0) {
            int[] arrn = this.g;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return l2;
    }

    @Override
    public int m() {
        b b2 = this.f();
        if (b2 != b.g && b2 != b.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b.g);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(this.v());
            throw new IllegalStateException(stringBuilder.toString());
        }
        int n2 = ((q)this.t()).e();
        this.u();
        int n3 = this.e;
        if (n3 > 0) {
            int[] arrn = this.g;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
        return n2;
    }

    @Override
    public void n() {
        if (this.f() == b.e) {
            this.g();
            this.f[-2 + this.e] = "null";
        } else {
            this.u();
            int n2 = this.e;
            if (n2 > 0) {
                this.f[n2 - 1] = "null";
            }
        }
        int n3 = this.e;
        if (n3 > 0) {
            int[] arrn = this.g;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
    }

    public void o() {
        this.a(b.e);
        Map.Entry entry = (Map.Entry)((Iterator)this.t()).next();
        this.a(entry.getValue());
        this.a(new q((String)entry.getKey()));
    }

    @Override
    public String p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        for (int i2 = 0; i2 < this.e; ++i2) {
            Object[] arrobject = this.d;
            if (arrobject[i2] instanceof i) {
                if (!(arrobject[++i2] instanceof Iterator)) continue;
                stringBuilder.append('[');
                stringBuilder.append(this.g[i2]);
                stringBuilder.append(']');
                continue;
            }
            if (!(arrobject[i2] instanceof o) || !(arrobject[++i2] instanceof Iterator)) continue;
            stringBuilder.append('.');
            String[] arrstring = this.f;
            if (arrstring[i2] == null) continue;
            stringBuilder.append(arrstring[i2]);
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

