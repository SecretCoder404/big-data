/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Throwable
 */
package com.a.a;

import com.a.a.k;

public class u
extends Exception {
    public final k a;
    private long b;

    public u() {
        this.a = null;
    }

    public u(k k2) {
        this.a = k2;
    }

    public u(Throwable throwable) {
        super(throwable);
        this.a = null;
    }

    void a(long l2) {
        this.b = l2;
    }
}

