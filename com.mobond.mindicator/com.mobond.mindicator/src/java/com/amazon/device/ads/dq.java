/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.co;
import org.json.JSONObject;

class dq {
    private final co.a a;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = -1;
    private String f = "top-right";
    private boolean g = true;

    public dq() {
        this(new co.a());
    }

    dq(co.a a2) {
        this.a = a2;
    }

    private void a(JSONObject jSONObject, String string, int n2) {
        if (n2 != -1) {
            this.a.b(jSONObject, string, n2);
        }
    }

    public void a() {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = "top-right";
        this.g = true;
    }

    public boolean a(JSONObject jSONObject) {
        this.b = this.a.a(jSONObject, "width", this.b);
        this.c = this.a.a(jSONObject, "height", this.c);
        this.d = this.a.a(jSONObject, "offsetX", this.d);
        this.e = this.a.a(jSONObject, "offsetY", this.e);
        this.f = this.a.a(jSONObject, "customClosePosition", this.f);
        this.g = this.a.a(jSONObject, "allowOffscreen", this.g);
        if (this.b()) {
            return true;
        }
        this.a();
        return false;
    }

    public boolean b() {
        return this.b != -1 && this.c != -1 && this.d != -1 && this.e != -1;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        this.a(jSONObject, "width", this.b);
        this.a(jSONObject, "height", this.c);
        this.a(jSONObject, "offsetX", this.d);
        this.a(jSONObject, "offsetY", this.e);
        this.a.b(jSONObject, "customClosePosition", this.f);
        this.a.b(jSONObject, "allowOffscreen", this.g);
        return jSONObject;
    }
}

