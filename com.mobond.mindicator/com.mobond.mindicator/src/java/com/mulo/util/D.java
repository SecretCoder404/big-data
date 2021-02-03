/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.mulo.util;

import java.io.ByteArrayOutputStream;

public class D {
    private static final int DATA_IN_BUFFER_SIZE = 16384;
    private long mdi = this.ncdi();
    private byte[] mdib;
    private ByteArrayOutputStream mobao = new ByteArrayOutputStream();

    static {
        System.loadLibrary((String)"d");
    }

    private void checkState() {
        if (this.mobao != null) {
            return;
        }
        throw new IllegalStateException("");
    }

    private native long ncdi();

    private native void ndbdci(long var1);

    private native int ndc(long var1, byte[] var3, int var4, int var5);

    private void wcd(byte[] arrby, int n2, int n3) {
        this.mobao.write(arrby, n2, n3);
    }

    public void dc(byte[] arrby, int n2, int n3) {
        this.checkState();
        int n4 = n3 + n2;
        if (this.mdib == null) {
            this.mdib = new byte[16384];
        }
        byte[] arrby2 = this.mdib;
        while (n2 + arrby2.length < n4) {
            System.arraycopy((Object)arrby, (int)n2, (Object)arrby2, (int)0, (int)arrby2.length);
            this.ndc(this.mdi, arrby2, 0, arrby2.length);
            n2 += arrby2.length;
        }
        int n5 = n4 - n2;
        System.arraycopy((Object)arrby, (int)n2, (Object)arrby2, (int)0, (int)n5);
        this.ndc(this.mdi, arrby2, 0, n5);
    }

    public void finish() {
        this.checkState();
        this.ndbdci(this.mdi);
        this.mobao = null;
    }

    public byte[] toByteArray() {
        this.checkState();
        return this.mobao.toByteArray();
    }
}

