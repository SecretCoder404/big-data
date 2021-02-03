/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.co;
import org.json.JSONObject;

class ef {
    private int a;
    private int b;

    public ef(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public ef(String string) {
        String[] arrstring;
        int n2;
        int n3 = 0;
        if (string != null && (arrstring = string.split("x")) != null && arrstring.length == 2) {
            int n4 = Math.max((int)ef.a(arrstring[0], 0), (int)0);
            n2 = Math.max((int)ef.a(arrstring[1], 0), (int)0);
            n3 = n4;
        } else {
            n2 = 0;
        }
        this.a = n3;
        this.b = n2;
    }

    private static int a(String string, int n2) {
        try {
            int n3 = Integer.parseInt((String)string);
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public int a() {
        return this.a;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public int b() {
        return this.b;
    }

    public void b(int n2) {
        this.b = n2;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        co.b(jSONObject, "width", this.a);
        co.b(jSONObject, "height", this.b);
        return jSONObject;
    }

    public boolean equals(Object object) {
        if (object instanceof ef) {
            ef ef2 = (ef)object;
            int n2 = this.a;
            int n3 = ef2.a;
            boolean bl2 = false;
            if (n2 == n3) {
                int n4 = this.b;
                int n5 = ef2.b;
                bl2 = false;
                if (n4 == n5) {
                    bl2 = true;
                }
            }
            return bl2;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("x");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

