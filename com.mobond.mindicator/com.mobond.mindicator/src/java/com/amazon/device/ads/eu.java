/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.ads.cy
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dj;
import com.amazon.device.ads.dr;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.ez;

class eu {
    private static final String a = "eu";
    private static eu l = new eu();
    private final cy b;
    private final dj c;
    private final ez.d d;
    private final cv e;
    private final ej.k f;
    private final ee g;
    private final cx h;
    private final bn i;
    private final bk j;
    private int k;

    protected eu() {
        this(new cz(), new dj(), bn.a(), ee.a(), new ez.d(), cv.a(), ej.a(), cx.a(), bk.a());
    }

    eu(cz cz2, dj dj2, bn bn2, ee ee2, ez.d d2, cv cv2, ej.k k2, cx cx2, bk bk2) {
        this.b = cz2.a(a);
        this.c = dj2;
        this.i = bn2;
        this.g = ee2;
        this.d = d2;
        this.e = cv2;
        this.f = k2;
        this.h = cx2;
        this.j = bk2;
    }

    private boolean e() {
        this.k = this.j.c(bk.a.m);
        if (this.g.a("viewableJSVersionStored", -1) < this.k) {
            return true;
        }
        return eh.a(this.g.a("viewableJSSettingsNameAmazonAdSDK", (String)null));
    }

    private void f() {
        this.e.b().a(cv.a.ak);
        this.b.e("Viewability Javascript fetch failed");
    }

    public void a() {
        if (this.e()) {
            this.b();
        }
    }

    protected void b() {
        this.f.a(new Runnable(){

            public void run() {
                eu.this.c();
            }
        }, ej.b.b, ej.c.b);
    }

    public void c() {
        ez.g g2;
        this.b.d("In ViewabilityJavascriptFetcher background thread");
        if (!this.c.a(this.h.k())) {
            this.b.f("Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
            this.f();
            return;
        }
        ez ez2 = this.d();
        if (ez2 == null) {
            this.f();
            return;
        }
        try {
            g2 = ez2.c();
        }
        catch (ez.c c2) {
            this.f();
            return;
        }
        String string = g2.a().c();
        this.g.b("viewableJSSettingsNameAmazonAdSDK", string);
        this.g.b("viewableJSVersionStored", this.k);
        this.b.d("Viewability Javascript fetched and saved");
    }

    protected ez d() {
        ez ez2 = this.d.a();
        ez2.h(a);
        ez2.d(true);
        ez2.d(this.j.a(bk.a.l, "https://dwxjayoxbnyrr.cloudfront.net/amazon-ads.viewablejs"));
        ez2.a(this.e.b());
        ez2.a(cv.a.aj);
        ez2.e(this.i.a("debug.aaxConfigUseSecure", true));
        return ez2;
    }

}

