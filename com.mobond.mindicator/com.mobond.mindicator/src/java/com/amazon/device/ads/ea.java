/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.dw
 *  com.amazon.device.ads.dx
 *  com.amazon.device.ads.dy
 *  com.amazon.device.ads.ed
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aq;
import com.amazon.device.ads.bf;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.do;
import com.amazon.device.ads.dw;
import com.amazon.device.ads.dx;
import com.amazon.device.ads.dy;
import com.amazon.device.ads.ed;
import com.amazon.device.ads.em;
import com.amazon.device.ads.ez;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

abstract class ea {
    protected cx a;
    protected final cy b;
    private final String c;
    private final cv.a d;
    private final String e;
    private final bk f;

    ea(cz cz2, String string, cv.a a2, String string2, cx cx2, bk bk2) {
        this.c = string;
        this.b = cz2.a(this.c);
        this.d = a2;
        this.e = string2;
        this.a = cx2;
        this.f = bk2;
    }

    ez.b a() {
        ez.b b2 = new ez.b();
        b2.a("dt", this.a.c().b());
        b2.a("app", this.a.d().a());
        b2.a("appId", this.a.d().e());
        b2.a("sdkVer", em.b());
        b2.a("aud", this.f.a(bk.a.f));
        b2.b("pkg", this.a.b().b());
        return b2;
    }

    abstract void a(JSONObject var1);

    abstract HashMap<String, String> c();

    cy d() {
        return this.b;
    }

    String e() {
        return this.c;
    }

    cv.a f() {
        return this.d;
    }

    String g() {
        return this.e;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        static {
            a[] arra = new a[]{a, b};
            c = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])c.clone();
        }
    }

    static class b {
        b() {
        }

        public dw a(a a2, aq aq2) {
            switch (1.a[a2.ordinal()]) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("SISRequestType ");
                    stringBuilder.append((Object)a2);
                    stringBuilder.append(" is not a SISDeviceRequest");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                case 2: {
                    return new ed(aq2);
                }
                case 1: 
            }
            return new dx(aq2);
        }

        public dy a(aq.a a2, JSONArray jSONArray) {
            return new dy(a2, jSONArray);
        }
    }

}

