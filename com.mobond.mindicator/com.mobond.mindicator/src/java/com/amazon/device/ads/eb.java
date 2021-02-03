/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bk;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.dr;
import com.amazon.device.ads.ea;
import com.amazon.device.ads.ec;
import com.amazon.device.ads.ez;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

class eb {
    private final ea[] a;
    private final ec b;
    private final ez.d c;
    private final bk d;

    public /* varargs */ eb(ec ec2, ea ... arrea) {
        this(new ez.d(), ec2, bk.a(), arrea);
    }

    /* varargs */ eb(ez.d d2, ec ec2, bk bk2, ea ... arrea) {
        this.c = d2;
        this.b = ec2;
        this.d = bk2;
        this.a = arrea;
    }

    private void a(ea ea2) {
        ez.g g2;
        ez ez2 = this.b(ea2);
        try {
            g2 = ez2.c();
        }
        catch (ez.c c2) {
            return;
        }
        JSONObject jSONObject = g2.a().d();
        if (jSONObject == null) {
            return;
        }
        int n2 = co.a(jSONObject, "rcode", 0);
        String string = co.a(jSONObject, "msg", "");
        if (n2 == 1) {
            cy cy2 = ea2.d();
            Object[] arrobject = new Object[]{n2, string};
            cy2.a("Result - code: %d, msg: %s", arrobject);
            ea2.a(jSONObject);
            return;
        }
        cy cy3 = ea2.d();
        Object[] arrobject = new Object[]{n2, string};
        cy3.d("Result - code: %d, msg: %s", arrobject);
    }

    private ez b(ea ea2) {
        ez ez2 = this.c.a();
        ez2.h(ea2.e());
        ez2.a(ez.a.b);
        ez2.b(this.b());
        ez2.c(this.c(ea2));
        ez2.d(true);
        HashMap<String, String> hashMap = ea2.c();
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ez2.b((String)entry.getKey(), (String)entry.getValue());
            }
        }
        ez2.a(ea2.a());
        ez2.a(cv.a().b());
        ez2.a(ea2.f());
        return ez2;
    }

    private String b() {
        int n2;
        String string = this.d.a(bk.a.c);
        if (string != null && (n2 = string.indexOf("/")) > -1) {
            string = string.substring(0, n2);
        }
        return string;
    }

    private ec c() {
        return this.b;
    }

    private String c(ea ea2) {
        String string = this.d.a(bk.a.c);
        if (string != null) {
            int n2 = string.indexOf("/");
            string = n2 > -1 ? string.substring(n2) : "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/api3");
        stringBuilder.append(ea2.g());
        return stringBuilder.toString();
    }

    public void a() {
        ea[] arrea = this.a;
        int n2 = arrea.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(arrea[i2]);
        }
        ec ec2 = this.c();
        if (ec2 != null) {
            ec2.a();
        }
    }

    static class a {
        a() {
        }

        public /* varargs */ eb a(ec ec2, ea ... arrea) {
            return new eb(ec2, arrea);
        }

        public /* varargs */ eb a(ea ... arrea) {
            return this.a((ec)null, arrea);
        }
    }

}

