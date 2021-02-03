/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.co;
import org.json.JSONObject;

class bv {
    private final co.a a;
    private int b = -1;
    private int c = -1;
    private boolean d = false;
    private final boolean e = true;

    public bv() {
        this(new co.a());
    }

    bv(co.a a2) {
        this.a = a2;
    }

    public int a() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public void a(Boolean bl2) {
        this.d = bl2;
    }

    public void a(JSONObject jSONObject) {
        this.b = this.a.a(jSONObject, "width", this.b);
        this.c = this.a.a(jSONObject, "height", this.c);
        this.d = this.a.a(jSONObject, "useCustomClose", this.d);
    }

    public int b() {
        return this.c;
    }

    public void b(int n2) {
        this.c = n2;
    }

    public Boolean c() {
        return this.d;
    }

    public bv d() {
        bv bv2 = new bv();
        bv2.b = this.b;
        bv2.c = this.c;
        bv2.d = this.d;
        return bv2;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        this.a.b(jSONObject, "width", this.b);
        this.a.b(jSONObject, "height", this.c);
        this.a.b(jSONObject, "useCustomClose", this.d);
        co.a a2 = this.a;
        this.getClass();
        a2.b(jSONObject, "isModal", true);
        return jSONObject;
    }

    public String toString() {
        return this.e().toString();
    }
}

