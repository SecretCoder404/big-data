/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URLEncoder
 */
package com.mulo.b;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class j {
    public static String a(String string) {
        try {
            String string2 = URLEncoder.encode((String)string, (String)"UTF-8");
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }
}

