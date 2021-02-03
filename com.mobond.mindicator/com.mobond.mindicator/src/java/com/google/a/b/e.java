/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.google.a.b;

public final class e {
    private static final int a = e.c();

    public static int a() {
        return a;
    }

    static int a(String string) {
        int n2 = e.b(string);
        if (n2 == -1) {
            n2 = e.c(string);
        }
        if (n2 == -1) {
            return 6;
        }
        return n2;
    }

    private static int b(String string) {
        int n2;
        block3 : {
            String[] arrstring;
            try {
                arrstring = string.split("[._]");
                n2 = Integer.parseInt((String)arrstring[0]);
                if (n2 != 1) break block3;
            }
            catch (NumberFormatException numberFormatException) {
                return -1;
            }
            if (arrstring.length <= 1) break block3;
            int n3 = Integer.parseInt((String)arrstring[1]);
            return n3;
        }
        return n2;
    }

    public static boolean b() {
        return a >= 9;
    }

    private static int c() {
        return e.a(System.getProperty((String)"java.version"));
    }

    private static int c(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        do {
            char c2;
            if (n2 >= string.length() || !Character.isDigit((char)(c2 = string.charAt(n2)))) break;
            stringBuilder.append(c2);
            ++n2;
        } while (true);
        try {
            int n3 = Integer.parseInt((String)stringBuilder.toString());
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }
}

