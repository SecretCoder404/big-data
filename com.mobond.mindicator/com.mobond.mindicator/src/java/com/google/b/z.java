/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.b;

import com.google.b.y;

final class z {
    private static final a a;

    static {
        a a2 = d.a() ? new d() : new b();
        a = a2;
    }

    static int a(CharSequence charSequence) {
        int n2;
        int n3 = charSequence.length();
        for (n2 = 0; n2 < n3 && charSequence.charAt(n2) < ''; ++n2) {
        }
        int n4 = n3;
        while (n2 < n3) {
            char c2 = charSequence.charAt(n2);
            if (c2 < '\u0800') {
                n4 += 127 - c2 >>> 31;
                ++n2;
                continue;
            }
            n4 += z.a(charSequence, n2);
            break;
        }
        if (n4 >= n3) {
            return n4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(0x100000000L + (long)n4);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        int n4 = 0;
        while (n2 < n3) {
            char c2 = charSequence.charAt(n2);
            if (c2 < '\u0800') {
                n4 += 127 - c2 >>> 31;
            } else {
                n4 += 2;
                if ('\ud800' <= c2 && c2 <= '\udfff') {
                    if (Character.codePointAt((CharSequence)charSequence, (int)n2) >= 65536) {
                        ++n2;
                    } else {
                        throw new c(n2, n3);
                    }
                }
            }
            ++n2;
        }
        return n4;
    }

    static int a(CharSequence charSequence, byte[] arrby, int n2, int n3) {
        return a.a(charSequence, arrby, n2, n3);
    }

    public static boolean a(byte[] arrby, int n2, int n3) {
        return a.a(arrby, n2, n3);
    }

    private static int b(int n2) {
        if (n2 > -12) {
            n2 = -1;
        }
        return n2;
    }

    private static int b(int n2, int n3) {
        if (n2 <= -12 && n3 <= -65) {
            return n2 ^ n3 << 8;
        }
        return -1;
    }

    private static int b(int n2, int n3, int n4) {
        if (n2 <= -12 && n3 <= -65 && n4 <= -65) {
            return n2 ^ n3 << 8 ^ n4 << 16;
        }
        return -1;
    }

    private static int c(byte[] arrby, int n2, int n3) {
        byte by2 = arrby[n2 - 1];
        switch (n3 - n2) {
            default: {
                throw new AssertionError();
            }
            case 2: {
                return z.b(by2, (int)arrby[n2], (int)arrby[n2 + 1]);
            }
            case 1: {
                return z.b(by2, arrby[n2]);
            }
            case 0: 
        }
        return z.b(by2);
    }

    static abstract class a {
        a() {
        }

        abstract int a(int var1, byte[] var2, int var3, int var4);

        abstract int a(CharSequence var1, byte[] var2, int var3, int var4);

        final boolean a(byte[] arrby, int n2, int n3) {
            int n4 = this.a(0, arrby, n2, n3);
            boolean bl2 = false;
            if (n4 == 0) {
                bl2 = true;
            }
            return bl2;
        }
    }

    static final class b
    extends a {
        b() {
        }

        private static int b(byte[] arrby, int n2, int n3) {
            while (n2 < n3 && arrby[n2] >= 0) {
                ++n2;
            }
            if (n2 >= n3) {
                return 0;
            }
            return b.c(arrby, n2, n3);
        }

        private static int c(byte[] arrby, int n2, int n3) {
            while (n2 < n3) {
                int n4 = n2 + 1;
                byte by2 = arrby[n2];
                if (by2 < 0) {
                    if (by2 < -32) {
                        if (n4 >= n3) {
                            return by2;
                        }
                        if (by2 >= -62) {
                            n2 = n4 + 1;
                            if (arrby[n4] <= -65) continue;
                        }
                        return -1;
                    }
                    if (by2 < -16) {
                        if (n4 >= n3 - 1) {
                            return z.c(arrby, n4, n3);
                        }
                        int n5 = n4 + 1;
                        byte by3 = arrby[n4];
                        if (!(by3 > -65 || by2 == -32 && by3 < -96 || by2 == -19 && by3 >= -96)) {
                            n2 = n5 + 1;
                            if (arrby[n5] <= -65) continue;
                        }
                        return -1;
                    }
                    if (n4 >= n3 - 2) {
                        return z.c(arrby, n4, n3);
                    }
                    int n6 = n4 + 1;
                    byte by4 = arrby[n4];
                    if (by4 <= -65 && (by2 << 28) + (by4 + 112) >> 30 == 0) {
                        int n7 = n6 + 1;
                        if (arrby[n6] <= -65) {
                            int n8 = n7 + 1;
                            if (arrby[n7] > -65) {
                                return -1;
                            }
                            n2 = n8;
                            continue;
                        }
                    }
                    return -1;
                }
                n2 = n4;
            }
            return 0;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        int a(int n2, byte[] arrby, int n3, int n4) {
            int n5;
            if (n2 != 0) {
                byte by2;
                int n6;
                if (n3 >= n4) {
                    return n2;
                }
                byte by3 = (byte)n2;
                if (by3 < -32) {
                    if (by3 < -62) return -1;
                    n5 = n3 + 1;
                    if (arrby[n3] <= -65) return b.b(arrby, n5, n4);
                    return -1;
                }
                if (by3 < -16) {
                    byte by4 = (byte)(-1 ^ n2 >> 8);
                    if (by4 == 0) {
                        int n7 = n3 + 1;
                        byte by5 = arrby[n3];
                        if (n7 >= n4) {
                            return z.b(by3, (int)by5);
                        }
                        n3 = n7;
                        by4 = by5;
                    }
                    if (by4 > -65 || by3 == -32 && by4 < -96 || by3 == -19 && by4 >= -96) return -1;
                    n5 = n3 + 1;
                    if (arrby[n3] <= -65) return b.b(arrby, n5, n4);
                    return -1;
                }
                byte by6 = (byte)(-1 ^ n2 >> 8);
                if (by6 == 0) {
                    n6 = n3 + 1;
                    by6 = arrby[n3];
                    by2 = 0;
                    if (n6 >= n4) {
                        return z.b(by3, (int)by6);
                    }
                } else {
                    by2 = (byte)(n2 >> 16);
                    n6 = n3;
                }
                if (by2 == 0) {
                    int n8 = n6 + 1;
                    by2 = arrby[n6];
                    if (n8 >= n4) {
                        return z.b(by3, (int)by6, (int)by2);
                    }
                    n6 = n8;
                }
                if (by6 > -65 || (by3 << 28) + (by6 + 112) >> 30 != 0 || by2 > -65) return -1;
                int n9 = n6 + 1;
                if (arrby[n6] > -65) {
                    return -1;
                }
                n5 = n9;
                return b.b(arrby, n5, n4);
            } else {
                n5 = n3;
            }
            return b.b(arrby, n5, n4);
        }

        @Override
        int a(CharSequence charSequence, byte[] arrby, int n2, int n3) {
            int n4;
            int n5;
            char c2;
            int n6 = charSequence.length();
            int n7 = n3 + n2;
            for (n4 = 0; n4 < n6 && (n5 = n4 + n2) < n7 && (c2 = charSequence.charAt(n4)) < ''; ++n4) {
                arrby[n5] = (byte)c2;
            }
            if (n4 == n6) {
                return n2 + n6;
            }
            int n8 = n2 + n4;
            while (n4 < n6) {
                char c3;
                int n9;
                block11 : {
                    block12 : {
                        int n10;
                        block13 : {
                            block8 : {
                                block10 : {
                                    block9 : {
                                        block7 : {
                                            c3 = charSequence.charAt(n4);
                                            if (c3 >= '' || n8 >= n7) break block7;
                                            int n11 = n8 + 1;
                                            arrby[n8] = (byte)c3;
                                            n8 = n11;
                                            break block8;
                                        }
                                        if (c3 >= '\u0800' || n8 > n7 - 2) break block9;
                                        int n12 = n8 + 1;
                                        arrby[n8] = (byte)(960 | c3 >>> 6);
                                        n8 = n12 + 1;
                                        arrby[n12] = (byte)(128 | c3 & 63);
                                        break block8;
                                    }
                                    if (c3 >= '\ud800' && '\udfff' >= c3 || n8 > n7 - 3) break block10;
                                    int n13 = n8 + 1;
                                    arrby[n8] = (byte)(480 | c3 >>> 12);
                                    int n14 = n13 + 1;
                                    arrby[n13] = (byte)(128 | 63 & c3 >>> 6);
                                    int n15 = n14 + 1;
                                    arrby[n14] = (byte)(128 | c3 & 63);
                                    n8 = n15;
                                    break block8;
                                }
                                if (n8 > n7 - 4) break block11;
                                n10 = n4 + 1;
                                if (n10 == charSequence.length()) break block12;
                                char c4 = charSequence.charAt(n10);
                                if (!Character.isSurrogatePair((char)c3, (char)c4)) break block13;
                                int n16 = Character.toCodePoint((char)c3, (char)c4);
                                int n17 = n8 + 1;
                                arrby[n8] = (byte)(240 | n16 >>> 18);
                                int n18 = n17 + 1;
                                arrby[n17] = (byte)(128 | 63 & n16 >>> 12);
                                int n19 = n18 + 1;
                                arrby[n18] = (byte)(128 | 63 & n16 >>> 6);
                                n8 = n19 + 1;
                                arrby[n19] = (byte)(128 | n16 & 63);
                                n4 = n10;
                            }
                            ++n4;
                            continue;
                        }
                        n4 = n10;
                    }
                    throw new c(n4 - 1, n6);
                }
                if (!('\ud800' > c3 || c3 > '\udfff' || (n9 = n4 + 1) != charSequence.length() && Character.isSurrogatePair((char)c3, (char)charSequence.charAt(n9)))) {
                    throw new c(n4, n6);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed writing ");
                stringBuilder.append(c3);
                stringBuilder.append(" at index ");
                stringBuilder.append(n8);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            return n8;
        }
    }

    static class c
    extends IllegalArgumentException {
        c(int n2, int n3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unpaired surrogate at index ");
            stringBuilder.append(n2);
            stringBuilder.append(" of ");
            stringBuilder.append(n3);
            super(stringBuilder.toString());
        }
    }

    static final class d
    extends a {
        d() {
        }

        private static int a(byte[] arrby, int n2, long l2, int n3) {
            switch (n3) {
                default: {
                    throw new AssertionError();
                }
                case 2: {
                    return z.b(n2, (int)y.a(arrby, l2), (int)y.a(arrby, l2 + 1L));
                }
                case 1: {
                    return z.b(n2, (int)y.a(arrby, l2));
                }
                case 0: 
            }
            return z.b(n2);
        }

        private static int a(byte[] arrby, long l2, int n2) {
            int n3;
            if (n2 < 16) {
                return 0;
            }
            int n4 = 7 & (int)l2;
            long l3 = l2;
            for (int i2 = n4; i2 > 0; --i2) {
                long l4 = 1L + l3;
                if (y.a(arrby, l3) < 0) {
                    return n4 - i2;
                }
                l3 = l4;
            }
            for (n3 = n2 - n4; n3 >= 8 && (-9187201950435737472L & y.b(arrby, l3)) == 0L; n3 -= 8) {
                l3 += 8L;
            }
            return n2 - n3;
        }

        static boolean a() {
            return y.a() && y.b();
        }

        private static int b(byte[] arrby, long l2, int n2) {
            int n3 = d.a(arrby, l2, n2);
            int n4 = n2 - n3;
            long l3 = l2 + (long)n3;
            do {
                byte by2 = 0;
                while (n4 > 0) {
                    long l4 = l3 + 1L;
                    by2 = y.a(arrby, l3);
                    if (by2 >= 0) {
                        --n4;
                        l3 = l4;
                        continue;
                    }
                    l3 = l4;
                    break;
                }
                if (n4 == 0) {
                    return 0;
                }
                int n5 = n4 - 1;
                if (by2 < -32) {
                    if (n5 == 0) {
                        return by2;
                    }
                    n4 = n5 - 1;
                    if (by2 >= -62) {
                        long l5 = 1L + l3;
                        if (y.a(arrby, l3) > -65) {
                            return -1;
                        }
                        l3 = l5;
                        continue;
                    }
                    return -1;
                }
                if (by2 < -16) {
                    if (n5 < 2) {
                        return d.a(arrby, by2, l3, n5);
                    }
                    n4 = n5 - 2;
                    long l6 = l3 + 1L;
                    byte by3 = y.a(arrby, l3);
                    if (!(by3 > -65 || by2 == -32 && by3 < -96 || by2 == -19 && by3 >= -96)) {
                        long l7 = 1L + l6;
                        if (y.a(arrby, l6) > -65) {
                            return -1;
                        }
                        l3 = l7;
                        continue;
                    }
                    return -1;
                }
                if (n5 < 3) {
                    return d.a(arrby, by2, l3, n5);
                }
                n4 = n5 - 3;
                long l8 = l3 + 1L;
                byte by4 = y.a(arrby, l3);
                if (by4 > -65 || (by2 << 28) + (by4 + 112) >> 30 != 0) break;
                long l9 = l8 + 1L;
                if (y.a(arrby, l8) > -65) break;
                long l10 = 1L + l9;
                if (y.a(arrby, l9) > -65) {
                    return -1;
                }
                l3 = l10;
            } while (true);
            return -1;
        }

        @Override
        int a(int n2, byte[] arrby, int n3, int n4) {
            block14 : {
                long l2;
                long l3;
                block18 : {
                    long l4;
                    block15 : {
                        block21 : {
                            byte by2;
                            byte by3;
                            block19 : {
                                block20 : {
                                    block16 : {
                                        block17 : {
                                            if ((n3 | n4 | arrby.length - n4) < 0) break block14;
                                            l4 = y.c() + (long)n3;
                                            l3 = y.c() + (long)n4;
                                            if (n2 == 0) break block15;
                                            if (l4 >= l3) {
                                                return n2;
                                            }
                                            by3 = (byte)n2;
                                            if (by3 >= -32) break block16;
                                            if (by3 < -62) break block17;
                                            l2 = l4 + 1L;
                                            if (y.a(arrby, l4) <= -65) break block18;
                                        }
                                        return -1;
                                    }
                                    if (by3 >= -16) break block19;
                                    byte by4 = (byte)(-1 ^ n2 >> 8);
                                    if (by4 == 0) {
                                        long l5 = l4 + 1L;
                                        by4 = y.a(arrby, l4);
                                        if (l5 >= l3) {
                                            return z.b(by3, (int)by4);
                                        }
                                        l4 = l5;
                                    }
                                    if (by4 > -65 || by3 == -32 && by4 < -96 || by3 == -19 && by4 >= -96) break block20;
                                    l2 = l4 + 1L;
                                    if (y.a(arrby, l4) <= -65) break block18;
                                }
                                return -1;
                            }
                            byte by5 = (byte)(-1 ^ n2 >> 8);
                            if (by5 == 0) {
                                long l6 = l4 + 1L;
                                by5 = y.a(arrby, l4);
                                if (l6 >= l3) {
                                    return z.b(by3, (int)by5);
                                }
                                l4 = l6;
                                by2 = 0;
                            } else {
                                by2 = (byte)(n2 >> 16);
                            }
                            if (by2 == 0) {
                                long l7 = l4 + 1L;
                                by2 = y.a(arrby, l4);
                                if (l7 >= l3) {
                                    return z.b(by3, (int)by5, (int)by2);
                                }
                                l4 = l7;
                            }
                            if (by5 > -65 || (by3 << 28) + (by5 + 112) >> 30 != 0 || by2 > -65) break block21;
                            l2 = l4 + 1L;
                            if (y.a(arrby, l4) <= -65) break block18;
                        }
                        return -1;
                    }
                    l2 = l4;
                }
                return d.b(arrby, l2, (int)(l3 - l2));
            }
            Object[] arrobject = new Object[]{arrby.length, n3, n4};
            throw new ArrayIndexOutOfBoundsException(String.format((String)"Array length=%d, index=%d, limit=%d", (Object[])arrobject));
        }

        @Override
        int a(CharSequence charSequence, byte[] arrby, int n2, int n3) {
            int n4;
            block6 : {
                int n5;
                char c2;
                long l2 = y.c() + (long)n2;
                long l3 = l2 + (long)n3;
                n4 = charSequence.length();
                if (n4 > n3 || arrby.length - n3 < n2) break block6;
                for (n5 = 0; n5 < n4 && (c2 = charSequence.charAt(n5)) < ''; ++n5) {
                    long l4 = 1L + l2;
                    y.a(arrby, l2, (byte)c2);
                    l2 = l4;
                }
                if (n5 == n4) {
                    return (int)(l2 - y.c());
                }
                while (n5 < n4) {
                    int n6;
                    char c3;
                    block11 : {
                        int n7;
                        block13 : {
                            block12 : {
                                block8 : {
                                    block10 : {
                                        block9 : {
                                            block7 : {
                                                c3 = charSequence.charAt(n5);
                                                if (c3 >= '' || l2 >= l3) break block7;
                                                long l5 = l2 + 1L;
                                                y.a(arrby, l2, (byte)c3);
                                                l2 = l5;
                                                break block8;
                                            }
                                            if (c3 >= '\u0800' || l2 > l3 - 2L) break block9;
                                            long l6 = l2 + 1L;
                                            y.a(arrby, l2, (byte)(960 | c3 >>> 6));
                                            l2 = l6 + 1L;
                                            y.a(arrby, l6, (byte)(128 | c3 & 63));
                                            break block8;
                                        }
                                        if (c3 >= '\ud800' && '\udfff' >= c3 || l2 > l3 - 3L) break block10;
                                        long l7 = l2 + 1L;
                                        y.a(arrby, l2, (byte)(480 | c3 >>> 12));
                                        long l8 = l7 + 1L;
                                        y.a(arrby, l7, (byte)(128 | 63 & c3 >>> 6));
                                        long l9 = l8 + 1L;
                                        y.a(arrby, l8, (byte)(128 | c3 & 63));
                                        l2 = l9;
                                        break block8;
                                    }
                                    if (l2 > l3 - 4L) break block11;
                                    n7 = n5 + 1;
                                    if (n7 == n4) break block12;
                                    char c4 = charSequence.charAt(n7);
                                    if (!Character.isSurrogatePair((char)c3, (char)c4)) break block13;
                                    int n8 = Character.toCodePoint((char)c3, (char)c4);
                                    long l10 = l2 + 1L;
                                    y.a(arrby, l2, (byte)(240 | n8 >>> 18));
                                    long l11 = l10 + 1L;
                                    y.a(arrby, l10, (byte)(128 | 63 & n8 >>> 12));
                                    long l12 = l11 + 1L;
                                    y.a(arrby, l11, (byte)(128 | 63 & n8 >>> 6));
                                    l2 = l12 + 1L;
                                    y.a(arrby, l12, (byte)(128 | n8 & 63));
                                    n5 = n7;
                                }
                                ++n5;
                                continue;
                            }
                            n7 = n5;
                        }
                        throw new c(n7 - 1, n4);
                    }
                    if (!('\ud800' > c3 || c3 > '\udfff' || (n6 = n5 + 1) != n4 && Character.isSurrogatePair((char)c3, (char)charSequence.charAt(n6)))) {
                        throw new c(n5, n4);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed writing ");
                    stringBuilder.append(c3);
                    stringBuilder.append(" at index ");
                    stringBuilder.append(l2);
                    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                }
                return (int)(l2 - y.c());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed writing ");
            stringBuilder.append(charSequence.charAt(n4 - 1));
            stringBuilder.append(" at index ");
            stringBuilder.append(n2 + n3);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
    }

}

