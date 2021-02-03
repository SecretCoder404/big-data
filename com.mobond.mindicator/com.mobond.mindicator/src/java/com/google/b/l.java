/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.b;

import com.google.b.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public final class l {
    static final Charset a = Charset.forName((String)"UTF-8");
    static final Charset b = Charset.forName((String)"ISO-8859-1");
    public static final byte[] c = new byte[0];
    public static final ByteBuffer d = ByteBuffer.wrap((byte[])c);
    public static final f e = f.a(c);

    static int a(int n2, byte[] arrby, int n3, int n4) {
        int n5 = n2;
        for (int i2 = n3; i2 < n3 + n4; ++i2) {
            n5 = n5 * 31 + arrby[i2];
        }
        return n5;
    }

    public static int a(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static int a(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static interface a {
    }

    public static interface b<T extends a> {
    }

    public static interface c<E>
    extends List<E>,
    RandomAccess {
        public c<E> a(int var1);

        public boolean a();

        public void b();
    }

}

