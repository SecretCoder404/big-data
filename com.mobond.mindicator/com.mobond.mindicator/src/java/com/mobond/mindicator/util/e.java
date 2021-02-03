/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package com.mobond.mindicator.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class e {
    public static String a(String string) {
        byte[] arrby = MessageDigest.getInstance((String)"MD5").digest(string.getBytes("UTF-8"));
        StringBuilder stringBuilder = new StringBuilder(2 * arrby.length);
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = arrby[i2];
            Object[] arrobject = new Object[]{by & 255};
            stringBuilder.append(String.format((String)"%02x", (Object[])arrobject));
        }
        try {
            String string2 = stringBuilder.toString();
            return string2;
        }
        catch (UnsupportedEncodingException | NoSuchAlgorithmException throwable) {
            return null;
        }
    }
}

