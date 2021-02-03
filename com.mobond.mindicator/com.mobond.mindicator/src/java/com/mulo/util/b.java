/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.System
 *  java.nio.ByteBuffer
 */
package com.mulo.util;

import java.nio.ByteBuffer;

public class b {
    private byte[] a = new byte[0];
    private int b;
    private boolean c;

    public b() {
    }

    public b(byte[] arrby) {
        this.a = arrby;
        this.b = arrby.length;
    }

    public static byte a(String string) {
        if (string.length() <= 8) {
            short s2 = Short.parseShort((String)string, (int)2);
            return ByteBuffer.allocate((int)2).putShort(s2).array()[1];
        }
        throw new IllegalArgumentException("Length of string is more than 8");
    }

    public static short a(byte[] arrby, int n2) {
        return (short)((255 & arrby[n2 + 1]) + ((255 & arrby[n2]) << 8));
    }

    public static boolean a(byte by, int n2) {
        return (1 & (by & 255) >> 7 - n2 % 8) == 1;
    }

    public static float b(byte[] arrby, int n2) {
        byte[] arrby2 = new byte[4];
        System.arraycopy((Object)arrby, (int)n2, (Object)arrby2, (int)0, (int)4);
        return ByteBuffer.wrap((byte[])arrby2).getFloat();
    }

    public static int c(byte[] arrby, int n2) {
        return (255 & arrby[n2 + 3]) + ((255 & arrby[n2 + 2]) << 8) + ((255 & arrby[n2 + 1]) << 16) + ((255 & arrby[n2]) << 24);
    }

    public byte a(int n2) {
        return this.d(this.a, n2);
    }

    public void a(byte by) {
        if (!this.c) {
            byte[] arrby = this.a;
            byte[] arrby2 = new byte[1 + arrby.length];
            System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)arrby.length);
            this.a = arrby2;
        }
        this.a(this.a, this.b, by);
        this.b = 1 + this.b;
    }

    void a(byte[] arrby, int n2, byte by) {
        arrby[n2] = by;
    }

    public byte[] a() {
        return this.a;
    }

    public byte[] a(int n2, int n3) {
        byte[] arrby = new byte[n3];
        System.arraycopy((Object)this.a, (int)n2, (Object)arrby, (int)0, (int)n3);
        return arrby;
    }

    public b b(int n2, int n3) {
        return new b(this.a(n2, n3));
    }

    public short b(int n2) {
        return b.a(this.a, n2);
    }

    public void b() {
        this.a = new byte[0];
        this.b = 0;
        this.c = false;
    }

    public float c(int n2) {
        return b.b(this.a, n2);
    }

    public int c() {
        return this.a.length;
    }

    public String c(int n2, int n3) {
        return new String(this.a, n2, n3);
    }

    byte d(byte[] arrby, int n2) {
        return arrby[n2];
    }

    public int d(int n2) {
        return b.c(this.a, n2);
    }

    public String d(int n2, int n3) {
        try {
            String string = new String(this.a, n2, n3, "UTF-8");
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String(this.a, n2, n3);
        }
    }
}

