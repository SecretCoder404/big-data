/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.a.i
 *  com.google.a.n
 *  com.google.a.o
 *  com.google.a.q
 *  java.io.IOException
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 */
package com.google.a;

import com.google.a.d.c;
import com.google.a.i;
import com.google.a.n;
import com.google.a.o;
import com.google.a.q;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class l {
    public Number a() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public long d() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean g() {
        return this instanceof i;
    }

    public boolean h() {
        return this instanceof o;
    }

    public boolean i() {
        return this instanceof q;
    }

    public boolean j() {
        return this instanceof n;
    }

    public o k() {
        if (this.h()) {
            return (o)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Object: ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public i l() {
        if (this.g()) {
            return (i)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Array: ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public q m() {
        if (this.i()) {
            return (q)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Primitive: ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    Boolean n() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c c2 = new c((Writer)stringWriter);
            c2.b(true);
            com.google.a.b.l.a(this, c2);
            String string = stringWriter.toString();
            return string;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }
}

