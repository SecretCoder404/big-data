/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 */
package com.a.a.a;

import com.a.a.a.d;
import java.io.ByteArrayOutputStream;

public class o
extends ByteArrayOutputStream {
    private final d a;

    public o(d d2, int n2) {
        this.a = d2;
        this.buf = this.a.a(Math.max((int)n2, (int)256));
    }

    private void a(int n2) {
        if (n2 + this.count <= this.buf.length) {
            return;
        }
        byte[] arrby = this.a.a(2 * (n2 + this.count));
        System.arraycopy((Object)this.buf, (int)0, (Object)arrby, (int)0, (int)this.count);
        this.a.a(this.buf);
        this.buf = arrby;
    }

    public void close() {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.a.a(this.buf);
    }

    public void write(int n2) {
        o o2 = this;
        synchronized (o2) {
            this.a(1);
            super.write(n2);
            return;
        }
    }

    public void write(byte[] arrby, int n2, int n3) {
        o o2 = this;
        synchronized (o2) {
            this.a(n3);
            super.write(arrby, n2, n3);
            return;
        }
    }
}

