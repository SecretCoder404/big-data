/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.a.b.a.f
 *  com.google.a.m
 *  com.google.a.v$1
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.google.a;

import com.google.a.b.a.f;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.l;
import com.google.a.m;
import com.google.a.v;
import java.io.IOException;

public abstract class v<T> {
    public final l a(T t2) {
        try {
            f f2 = new f();
            this.a((c)f2, t2);
            l l2 = f2.a();
            return l2;
        }
        catch (IOException iOException) {
            throw new m((Throwable)iOException);
        }
    }

    public final v<T> a() {
        return new 1(this);
    }

    public abstract void a(c var1, T var2);

    public abstract T b(a var1);
}

