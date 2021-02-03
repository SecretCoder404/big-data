/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aq;
import com.amazon.device.ads.be;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ea;
import com.amazon.device.ads.ez;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

class dy
extends ea {
    private static final cv.a c = cv.a.R;
    private final aq.a d;
    private final be e;
    private final JSONArray f;

    public dy(aq.a a2, JSONArray jSONArray) {
        this(a2, jSONArray, be.a(), new cz(), cx.a(), bk.a());
    }

    dy(aq.a a2, JSONArray jSONArray, be be2, cz cz2, cx cx2, bk bk2) {
        super(cz2, "SISRegisterEventRequest", c, "/register_event", cx2, bk2);
        this.d = a2;
        this.f = jSONArray;
        this.e = be2;
    }

    @Override
    public ez.b a() {
        ez.b b2 = super.a();
        b2.a("adId", this.d.e());
        return b2;
    }

    @Override
    public void a(JSONObject jSONObject) {
        int n2 = co.a(jSONObject, "rcode", 0);
        if (n2 == 1) {
            this.b.d("Application events registered successfully.");
            this.e.c();
            return;
        }
        cy cy2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application events not registered. rcode:");
        stringBuilder.append(n2);
        cy2.d(stringBuilder.toString());
    }

    @Override
    public HashMap<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"events", (Object)this.f.toString());
        return hashMap;
    }
}

