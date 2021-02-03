/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 */
package com.mulo.util;

public final class a {
    private static final char[] a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] b = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public static String a(byte[] arrby) {
        int n2 = arrby.length;
        int n3 = n2 / 3;
        int n4 = n2 - n3 * 3;
        StringBuffer stringBuffer = new StringBuffer(4 * ((n2 + 2) / 3));
        int n5 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n6 = n5 + 1;
            int n7 = 255 & arrby[n5];
            int n8 = n6 + 1;
            int n9 = 255 & arrby[n6];
            int n10 = n8 + 1;
            int n11 = 255 & arrby[n8];
            stringBuffer.append(a[n7 >> 2]);
            stringBuffer.append(a[63 & n7 << 4 | n9 >> 4]);
            stringBuffer.append(a[63 & n9 << 2 | n11 >> 6]);
            stringBuffer.append(a[n11 & 63]);
            n5 = n10;
        }
        if (n4 != 0) {
            int n12 = n5 + 1;
            int n13 = 255 & arrby[n5];
            stringBuffer.append(a[n13 >> 2]);
            if (n4 == 1) {
                stringBuffer.append(a[63 & n13 << 4]);
                stringBuffer.append("==");
            } else {
                int n14 = 255 & arrby[n12];
                stringBuffer.append(a[63 & n13 << 4 | n14 >> 4]);
                stringBuffer.append(a[63 & n14 << 2]);
                stringBuffer.append('=');
            }
        }
        return stringBuffer.toString();
    }
}

