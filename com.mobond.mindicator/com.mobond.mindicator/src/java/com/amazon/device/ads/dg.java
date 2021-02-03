/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cb;
import com.amazon.device.ads.co;
import java.util.Locale;
import org.json.JSONObject;

class dg {
    private final co.a a;
    private Boolean b = true;
    private cb c = cb.c;

    public dg() {
        this(new co.a());
    }

    dg(co.a a2) {
        this.a = a2;
    }

    public Boolean a() {
        return this.b;
    }

    public void a(JSONObject jSONObject) {
        this.b = this.a.a(jSONObject, "allowOrientationChange", this.b);
        this.c = cb.valueOf(this.a.a(jSONObject, "forceOrientation", this.c.toString()).toUpperCase(Locale.US));
    }

    public cb b() {
        return this.c;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        this.a.b(jSONObject, "forceOrientation", this.c.toString());
        this.a.b(jSONObject, "allowOrientationChange", this.b);
        return jSONObject;
    }

    public String toString() {
        return this.c().toString();
    }
}

