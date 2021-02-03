/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Hashtable
 */
package com.mulo.util;

import java.util.Hashtable;

public class g {
    public String a;
    public int b = -1;
    public String c = "false";
    public Hashtable<String, String> d = new Hashtable();
    public boolean e = false;
    public String f = null;
    public boolean g = true;
    private String h;

    public g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(System.currentTimeMillis());
        this.h = stringBuilder.toString();
    }

    public String a() {
        return this.h;
    }
}

