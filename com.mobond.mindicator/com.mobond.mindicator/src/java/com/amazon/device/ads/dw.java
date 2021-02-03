/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.util.HashMap
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aq;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.br;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.do;
import com.amazon.device.ads.ea;
import com.amazon.device.ads.ez;
import java.util.HashMap;
import org.json.JSONObject;

abstract class dw
extends ea {
    private aq c;
    private aq.a d;

    dw(cz cz2, String string, cv.a a2, String string2, aq aq2, cx cx2, bk bk2) {
        super(cz2, string, a2, string2, cx2, bk2);
        this.c = aq2;
        this.d = this.c.b();
    }

    private static String a(boolean bl2) {
        if (bl2) {
            return "1";
        }
        return "0";
    }

    @Override
    public ez.b a() {
        ez.b b2 = super.a();
        br br2 = this.a.c();
        b2.b("ua", br2.r());
        b2.b("dinfo", br2.t().toString());
        if (this.d.c()) {
            b2.a("idfa", this.d.b());
            b2.a("oo", dw.a(this.d.d()));
        } else {
            b2.a("sha1_mac", br2.g());
            b2.a("sha1_serial", br2.i());
            b2.a("sha1_udid", br2.k());
            b2.a("badMac", "true", br2.h());
            b2.a("badSerial", "true", br2.j());
            b2.a("badUdid", "true", br2.l());
        }
        String string = this.c.a();
        boolean bl2 = string != null;
        b2.a("aidts", string, bl2);
        return b2;
    }

    @Override
    public void a(JSONObject jSONObject) {
        String string = co.a(jSONObject, "adId", "");
        if (string.length() > 0) {
            this.a.d().a(string, this.b());
        }
    }

    protected aq.a b() {
        return this.d;
    }

    @Override
    public HashMap<String, String> c() {
        return null;
    }
}

