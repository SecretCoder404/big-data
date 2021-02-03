/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.co;
import com.amazon.device.ads.ef;
import org.json.JSONObject;

class dk {
    private ef a;
    private int b;
    private int c;

    public dk() {
        this.a = new ef(0, 0);
        this.b = 0;
        this.c = 0;
    }

    public dk(ef ef2, int n2, int n3) {
        this.a = ef2;
        this.b = n2;
        this.c = n3;
    }

    public ef a() {
        return this.a;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public void a(ef ef2) {
        this.a = ef2;
    }

    public int b() {
        return this.b;
    }

    public void b(int n2) {
        this.c = n2;
    }

    public int c() {
        return this.c;
    }

    public JSONObject d() {
        JSONObject jSONObject = this.a.c();
        co.b(jSONObject, "x", this.b);
        co.b(jSONObject, "y", this.c);
        return jSONObject;
    }

    public boolean equals(Object object) {
        if (object instanceof dk) {
            dk dk2 = (dk)object;
            boolean bl2 = this.a.equals(dk2.a);
            boolean bl3 = false;
            if (bl2) {
                int n2 = this.b;
                int n3 = dk2.b;
                bl3 = false;
                if (n2 == n3) {
                    int n4 = this.c;
                    int n5 = dk2.c;
                    bl3 = false;
                    if (n4 == n5) {
                        bl3 = true;
                    }
                }
            }
            return bl3;
        }
        return false;
    }
}

