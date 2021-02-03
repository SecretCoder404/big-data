/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Locale
 */
package com.google.a.b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class j {
    private static String a(int n2) {
        switch (n2) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 3: {
                return "M/d/yy";
            }
            case 2: {
                return "MMM d, yyyy";
            }
            case 1: {
                return "MMMM d, yyyy";
            }
            case 0: 
        }
        return "EEEE, MMMM d, yyyy";
    }

    public static DateFormat a(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(j.a(n2));
        stringBuilder.append(" ");
        stringBuilder.append(j.b(n3));
        return new SimpleDateFormat(stringBuilder.toString(), Locale.US);
    }

    private static String b(int n2) {
        switch (n2) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 3: {
                return "h:mm a";
            }
            case 2: {
                return "h:mm:ss a";
            }
            case 0: 
            case 1: 
        }
        return "h:mm:ss a z";
    }
}

