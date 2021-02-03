/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.a.b.a;

import com.google.a.b.a.f;
import com.google.a.d.c;
import com.google.a.i;
import com.google.a.l;
import com.google.a.n;
import com.google.a.o;
import com.google.a.q;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f
extends c {
    private static final Writer a = new Writer(){

        public void close() {
            throw new java.lang.AssertionError();
        }

        public void flush() {
            throw new java.lang.AssertionError();
        }

        public void write(char[] arrc, int n2, int n3) {
            throw new java.lang.AssertionError();
        }
    };
    private static final q b = new q("closed");
    private final List<l> c = new ArrayList();
    private String d;
    private l e = n.a;

    public f() {
        super(a);
    }

    private void a(l l2) {
        if (this.d != null) {
            if (!l2.j() || this.i()) {
                ((o)this.j()).a(this.d, l2);
            }
            this.d = null;
            return;
        }
        if (this.c.isEmpty()) {
            this.e = l2;
            return;
        }
        l l3 = this.j();
        if (l3 instanceof i) {
            ((i)l3).a(l2);
            return;
        }
        throw new IllegalStateException();
    }

    private l j() {
        List<l> list = this.c;
        return (l)list.get(-1 + list.size());
    }

    @Override
    public c a(long l2) {
        this.a(new q(l2));
        return this;
    }

    @Override
    public c a(Boolean bl2) {
        if (bl2 == null) {
            return this.f();
        }
        this.a(new q(bl2));
        return this;
    }

    @Override
    public c a(Number number) {
        double d2;
        if (number == null) {
            return this.f();
        }
        if (!this.g() && (Double.isNaN((double)(d2 = number.doubleValue())) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append((Object)number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.a(new q(number));
        return this;
    }

    @Override
    public c a(String string) {
        if (!this.c.isEmpty() && this.d == null) {
            if (this.j() instanceof o) {
                this.d = string;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public c a(boolean bl2) {
        this.a(new q(bl2));
        return this;
    }

    public l a() {
        if (this.c.isEmpty()) {
            return this.e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected one JSON element but was ");
        stringBuilder.append(this.c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public c b() {
        i i2 = new i();
        this.a(i2);
        this.c.add((Object)i2);
        return this;
    }

    @Override
    public c b(String string) {
        if (string == null) {
            return this.f();
        }
        this.a(new q(string));
        return this;
    }

    @Override
    public c c() {
        if (!this.c.isEmpty() && this.d == null) {
            if (this.j() instanceof i) {
                List<l> list = this.c;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        if (this.c.isEmpty()) {
            this.c.add((Object)b);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override
    public c d() {
        o o2 = new o();
        this.a(o2);
        this.c.add((Object)o2);
        return this;
    }

    @Override
    public c e() {
        if (!this.c.isEmpty() && this.d == null) {
            if (this.j() instanceof o) {
                List<l> list = this.c;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public c f() {
        this.a(n.a);
        return this;
    }

    @Override
    public void flush() {
    }
}

