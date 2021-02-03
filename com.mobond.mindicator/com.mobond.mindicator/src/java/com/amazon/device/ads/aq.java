/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bn;
import com.amazon.device.ads.cc;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.do;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ej;

class aq {
    private static final String a = "aq";
    private cc.a b;
    private boolean c = true;
    private final cy d;
    private final ee e;
    private final cx f;
    private final bn g;

    public aq() {
        this(ee.a(), cx.a(), new cz(), bn.a());
    }

    aq(ee ee2, cx cx2, cz cz2, bn bn2) {
        this.e = ee2;
        this.f = cx2;
        this.d = cz2.a(a);
        this.g = bn2;
    }

    private void a(String string) {
        this.d.c("Transition: %s", new Object[]{string});
        this.e.b("adIdTransistion", string);
    }

    private void b(String string) {
        this.e.b("gpsAdId", string);
    }

    private void e() {
        String string = this.f() ? "migrate" : (this.g() ? "reset" : (this.h() ? "revert" : null));
        if (string != null) {
            this.a(string);
            return;
        }
        this.d.d("No transition detected.");
    }

    private boolean f() {
        return this.f.d().c() && do.d() && !this.j() && this.d().d();
    }

    private boolean g() {
        return this.j() && this.d().d() && !this.i().equals((Object)this.d().c());
    }

    private boolean h() {
        return this.j() && !this.d().d();
    }

    private String i() {
        return this.e.a("gpsAdId", "");
    }

    private boolean j() {
        return true ^ eh.a(this.i());
    }

    aq a(boolean bl2) {
        this.c = bl2;
        return this;
    }

    String a() {
        String string = this.e.a("adIdTransistion", (String)null);
        this.e.b("adIdTransistion");
        return string;
    }

    a b() {
        do do_;
        if (ej.b()) {
            this.d.f("You must obtain the advertising indentifier information on a background thread.");
            return new a(this.g).a(false);
        }
        this.c();
        if (this.c) {
            this.e();
        }
        a a2 = new a(this.g);
        if (this.d().d()) {
            a2.b(this.d().c());
            a2.b(this.d().e());
            if (this.c) {
                this.b(this.d().c());
            }
        }
        if ((do_ = this.f.d()).a(a2)) {
            a2.a(do_.b());
            return a2;
        }
        do_.f();
        return a2;
    }

    protected void c() {
        this.b = new cc().a();
    }

    protected cc.a d() {
        return this.b;
    }

    static class a {
        private boolean a;
        private String b;
        private boolean c;
        private String d;
        private final bn e;

        private a(bn bn2) {
            this.e = bn2;
            this.a = true;
        }

        private a a(boolean bl2) {
            this.a = bl2;
            return this;
        }

        private a b(String string) {
            this.b = string;
            return this;
        }

        private a b(boolean bl2) {
            this.c = bl2;
            return this;
        }

        a a(String string) {
            this.d = string;
            return this;
        }

        boolean a() {
            return this.a;
        }

        String b() {
            return this.e.a("debug.idfa", this.b);
        }

        boolean c() {
            return true ^ eh.a(this.b());
        }

        boolean d() {
            return this.e.a("debug.optOut", this.c);
        }

        String e() {
            return this.e.a("debug.adid", this.d);
        }

        boolean f() {
            return this.e() != null;
        }
    }

}

