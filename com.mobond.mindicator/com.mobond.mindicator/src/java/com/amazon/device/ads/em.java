/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.amazon.device.ads;

class em {
    private static String a = "5.8.1.1";
    private static String b = "amznAdSDK-android-";
    private static String c;
    private static String d = "AmazonAdSDK-Android/";
    private static String e;
    private static String f = "(DEV)";

    public static String a() {
        String string = a;
        if (string != null && !string.equals((Object)"")) {
            if (string.endsWith("x")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(f);
                return stringBuilder.toString();
            }
        } else {
            string = f;
        }
        return string;
    }

    public static String b() {
        if (c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b);
            stringBuilder.append(em.a());
            c = stringBuilder.toString();
        }
        return c;
    }

    public static String c() {
        if (e == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d);
            stringBuilder.append(em.a());
            e = stringBuilder.toString();
        }
        return e;
    }
}

