/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cw$c
 *  com.amazon.device.ads.cw$d
 *  com.amazon.device.ads.cw$e
 *  com.amazon.device.ads.cw$f
 *  com.amazon.device.ads.cw$g
 *  com.amazon.device.ads.cy
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.Vector
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.co;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.do;
import com.amazon.device.ads.em;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.fb;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.json.JSONObject;

class w {
    public static final String a = "w";
    private final cv.b b;
    private cw c;
    private final cy d = new cz().a(a);
    private final ez.d e = new ez.d();
    private final cx f;

    public w(cv.b b2) {
        this(b2, cx.a());
    }

    w(cv.b b2, cx cx2) {
        this.b = b2;
        this.f = cx2;
    }

    protected static void a(JSONObject jSONObject, cw cw2) {
        if (cw2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String string = cw2.b();
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("_");
            string = stringBuilder.toString();
        }
        for (cw.b b2 : (cw.b[])cw2.a().toArray((Object[])new cw.b[cw2.a().size()])) {
            String string2 = b2.a.a();
            if (string != null && b2.a.b()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
            if (b2 instanceof cw.d) {
                cw.d d2 = b2;
                hashMap.put((Object)b2.a, (Object)d2.b);
                continue;
            }
            if (b2 instanceof cw.e) {
                cw.e e2 = b2;
                Long l2 = (Long)hashMap.remove((Object)b2.a);
                if (l2 == null) continue;
                co.b(jSONObject, string2, co.a(jSONObject, string2, 0L) + e2.b - l2);
                continue;
            }
            if (b2 instanceof cw.g) {
                co.b(jSONObject, string2, (b2).b);
                continue;
            }
            if (b2 instanceof cw.c) {
                cw.c c2 = b2;
                Integer n2 = (Integer)hashMap2.get((Object)b2.a);
                int n3 = n2 == null ? c2.b : n2 + c2.b;
                Integer n4 = n3;
                hashMap2.put((Object)b2.a, (Object)n4);
                continue;
            }
            if (!(b2 instanceof cw.f)) continue;
            co.b(jSONObject, string2, (b2).b);
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            String string3 = ((cv.a)((Object)entry.getKey())).a();
            if (string != null && ((cv.a)((Object)entry.getKey())).b()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(string3);
                string3 = stringBuilder.toString();
            }
            co.b(jSONObject, string3, (Integer)entry.getValue());
        }
    }

    private String d() {
        String string = fb.a(this.c());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.g());
        stringBuilder.append(string);
        String string2 = stringBuilder.toString();
        this.b.f();
        return string2;
    }

    public ez a() {
        ez ez2 = this.e.a();
        ez2.d(this.d());
        return ez2;
    }

    public void a(cw cw2) {
        this.c = cw2;
    }

    public boolean b() {
        String string = this.b.g();
        if (string != null) {
            if (string.equals((Object)"")) {
                return false;
            }
            if (this.f.d().e() == null) {
                this.d.d("Not submitting metrics because the AppKey is not set.");
                return false;
            }
            return true;
        }
        return false;
    }

    protected String c() {
        JSONObject jSONObject = new JSONObject();
        co.b(jSONObject, "c", "msdk");
        co.b(jSONObject, "v", em.a());
        w.a(jSONObject, this.b.e());
        w.a(jSONObject, this.c);
        String string = jSONObject.toString();
        return string.substring(1, string.length() - 1);
    }
}

