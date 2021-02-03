/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 */
package com.b.a.b.a;

import com.b.a.b.b;
import com.b.a.b.d;
import java.io.Serializable;

public class a
implements b,
Serializable {
    private int a = 3;
    private com.b.a.b.a[] b;

    public a(com.b.a.b.a[] arra) {
        this(arra, 3);
    }

    public a(com.b.a.b.a[] arra, int n2) {
        this.b = arra;
        this.a = n2;
        if (arra == null) {
            this.b = new com.b.a.b.a[0];
        }
    }

    @Override
    public int a() {
        return this.b.length;
    }

    @Override
    public com.b.a.b.a a(int n2) {
        return this.b[n2];
    }

    @Override
    public d a(d d2) {
        int n2 = 0;
        com.b.a.b.a[] arra;
        while (n2 < (arra = this.b).length) {
            d2.a(arra[n2]);
            ++n2;
        }
        return d2;
    }

    @Override
    public void a(int n2, com.b.a.b.a a2) {
        a2.a = this.b[n2].a;
        a2.b = this.b[n2].b;
        a2.c = this.b[n2].c;
    }

    @Override
    public double b(int n2) {
        return this.b[n2].a;
    }

    @Override
    public com.b.a.b.a[] b() {
        return this.b;
    }

    @Override
    public double c(int n2) {
        return this.b[n2].b;
    }

    @Override
    public Object clone() {
        com.b.a.b.a[] arra = new com.b.a.b.a[this.a()];
        int n2 = 0;
        com.b.a.b.a[] arra2;
        while (n2 < (arra2 = this.b).length) {
            arra[n2] = (com.b.a.b.a)arra2[n2].clone();
            ++n2;
        }
        return new a(arra, this.a);
    }

    public String toString() {
        com.b.a.b.a[] arra = this.b;
        if (arra.length > 0) {
            StringBuffer stringBuffer = new StringBuffer(17 * arra.length);
            stringBuffer.append('(');
            stringBuffer.append((Object)this.b[0]);
            int n2 = 1;
            do {
                if (n2 >= this.b.length) {
                    stringBuffer.append(')');
                    return stringBuffer.toString();
                }
                stringBuffer.append(", ");
                stringBuffer.append((Object)this.b[n2]);
                ++n2;
            } while (true);
        }
        return "()";
    }
}

