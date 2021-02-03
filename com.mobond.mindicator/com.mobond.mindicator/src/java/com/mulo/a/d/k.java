/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.mulo.a.d;

public class k {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public byte f;

    public k(String string, String string2, String string3, String string4, byte by) {
        this.a = string;
        this.b = string2;
        this.c = k.a(string2);
        this.d = string3;
        this.e = string4;
        this.f = by;
    }

    public static String a(String string) {
        if (string.equalsIgnoreCase("CHURCHGATE")) {
            return "CHG";
        }
        if (string.equalsIgnoreCase("BORIVALI")) {
            return "BO";
        }
        if (string.equalsIgnoreCase("VASAI ROAD")) {
            return "VASAI";
        }
        if (string.equalsIgnoreCase("DAHANU ROAD")) {
            return "DAHANU";
        }
        return string.toUpperCase();
    }

    public static String b(String string) {
        if (string.equalsIgnoreCase("CHG")) {
            return "CHURCHGATE";
        }
        if (string.equalsIgnoreCase("BO")) {
            return "BORIVALI";
        }
        if (string.equalsIgnoreCase("VASAI")) {
            return "VASAI ROAD";
        }
        if (string.equalsIgnoreCase("DAHANU")) {
            return "DAHANU ROAD";
        }
        return string.toUpperCase();
    }
}

