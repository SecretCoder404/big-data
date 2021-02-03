/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.util.Locale
 */
package com.google.a;

import com.google.a.e;
import java.lang.reflect.Field;
import java.util.Locale;

public abstract class d
extends Enum<d>
implements e {
    public static final /* enum */ d a = new d(){

        @Override
        public String a(Field field) {
            return field.getName();
        }
    };
    public static final /* enum */ d b = new d(){

        @Override
        public String a(Field field) {
            return 2.a(field.getName());
        }
    };
    public static final /* enum */ d c = new d(){

        @Override
        public String a(Field field) {
            return 3.a(3.a(field.getName(), " "));
        }
    };
    public static final /* enum */ d d = new d(){

        @Override
        public String a(Field field) {
            return 4.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };
    public static final /* enum */ d e = new d(){

        @Override
        public String a(Field field) {
            return 5.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };
    public static final /* enum */ d f = new d(){

        @Override
        public String a(Field field) {
            return 6.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };
    private static final /* synthetic */ d[] g;

    static {
        d[] arrd = new d[]{a, b, c, d, e, f};
        g = arrd;
    }

    private d() {
    }

    private static String a(char c2, String string, int n2) {
        if (n2 < string.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2);
            stringBuilder.append(string.substring(n2));
            return stringBuilder.toString();
        }
        return String.valueOf((char)c2);
    }

    static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        char c2 = string.charAt(0);
        int n3 = string.length();
        while (n2 < n3 - 1 && !Character.isLetter((char)c2)) {
            stringBuilder.append(c2);
            c2 = string.charAt(++n2);
        }
        if (!Character.isUpperCase((char)c2)) {
            stringBuilder.append(d.a(Character.toUpperCase((char)c2), string, n2 + 1));
            return stringBuilder.toString();
        }
        return string;
    }

    static String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase((char)c2) && stringBuilder.length() != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static d valueOf(String string) {
        return (d)Enum.valueOf(d.class, (String)string);
    }

    public static d[] values() {
        return (d[])g.clone();
    }

}

