/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.a.a;

import com.a.a.r;
import com.a.a.u;

public class e
implements r {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public e() {
        this(2500, 1, 1.0f);
    }

    public e(int n2, int n3, float f2) {
        this.a = n2;
        this.c = n3;
        this.d = f2;
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public void a(u u2) {
        this.b = 1 + this.b;
        int n2 = this.a;
        this.a = n2 + (int)((float)n2 * this.d);
        if (this.c()) {
            return;
        }
        throw u2;
    }

    @Override
    public int b() {
        return this.b;
    }

    protected boolean c() {
        return this.b <= this.c;
    }
}

