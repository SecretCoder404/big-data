/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.reflect.Array
 */
package com.b.a.a;

import com.b.a.b.a;
import com.b.a.b.t;
import com.b.a.c.c;
import java.lang.reflect.Array;

public abstract class e {
    protected int a;
    protected a[][] b = (a[][])Array.newInstance(a.class, (int[])new int[]{2, 2});
    protected a[] c = new a[2];
    protected boolean d;
    protected a e;
    protected a f;
    protected t g = null;

    public e() {
        this.c[0] = new a();
        this.c[1] = new a();
        a[] arra = this.c;
        this.e = arra[0];
        this.f = arra[1];
        this.a = 0;
    }

    private String d() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.b()) {
            stringBuffer.append(" endpoint");
        }
        if (this.d) {
            stringBuffer.append(" proper");
        }
        if (this.a()) {
            stringBuffer.append(" collinear");
        }
        return stringBuffer.toString();
    }

    public a a(int n2) {
        return this.c[n2];
    }

    public abstract void a(a var1, a var2, a var3);

    public void a(a a2, a a3, a a4, a a5) {
        a[][] arra = this.b;
        arra[0][0] = a2;
        arra[0][1] = a3;
        arra[1][0] = a4;
        arra[1][1] = a5;
        this.a = this.b(a2, a3, a4, a5);
    }

    protected boolean a() {
        return this.a == 2;
    }

    protected abstract int b(a var1, a var2, a var3, a var4);

    protected boolean b() {
        return this.c() && !this.d;
    }

    public boolean c() {
        return this.a != 0;
    }

    public String toString() {
        a[][] arra = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)c.a(arra[0][0], arra[0][1])));
        stringBuilder.append(" - ");
        a[][] arra2 = this.b;
        stringBuilder.append(c.a(arra2[1][0], arra2[1][1]));
        stringBuilder.append(this.d());
        return stringBuilder.toString();
    }
}

