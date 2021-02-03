/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aq;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.fb;

class do {
    private String a;
    private String b = "app";

    protected static void b(aq.a a2) {
        if (a2.c()) {
            ee.a().c("amzn-ad-id-origin", a2.b());
            return;
        }
        ee.a().c("amzn-ad-id-origin", "non-advertising-identifier");
    }

    public static boolean d() {
        String string = ee.a().a("amzn-ad-id-origin", (String)null);
        return string == null || "non-advertising-identifier".equals((Object)string);
        {
        }
    }

    public String a() {
        return this.b;
    }

    public void a(String string) {
        if (string != null && string.length() != 0) {
            this.a = fb.a(string);
            return;
        }
        throw new IllegalArgumentException("Application Key must not be null or empty.");
    }

    public void a(String string, aq.a a2) {
        ee ee2 = ee.a();
        ee2.c("amzn-ad-id", string);
        do.b(a2);
        ee2.c("newSISDIDRequested", false);
        ee2.c();
    }

    public boolean a(aq.a a2) {
        boolean bl2 = do.d();
        if (a2.c()) {
            if (bl2) {
                return false;
            }
            String string = ee.a().a("amzn-ad-id-origin", (String)null);
            return a2.b().equals((Object)string);
        }
        return bl2;
    }

    public String b() {
        return bn.a().a("debug.adid", ee.a().a("amzn-ad-id", (String)null));
    }

    public boolean c() {
        return true ^ eh.a(this.b());
    }

    public String e() {
        return bn.a().a("debug.appid", this.a);
    }

    public void f() {
        ee.a().b("newSISDIDRequested", true);
    }

    public boolean g() {
        return ee.a().a("newSISDIDRequested", false);
    }

    public boolean h() {
        return this.c();
    }

    public boolean i() {
        return true ^ this.h();
    }
}

