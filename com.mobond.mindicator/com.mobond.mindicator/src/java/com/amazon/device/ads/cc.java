/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cd;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dn;
import com.amazon.device.ads.ee;

class cc {
    private static final String a = "cc";
    private final cy b;
    private final dn c;

    public cc() {
        this(new cz(), new dn());
    }

    cc(cz cz2, dn dn2) {
        this.b = cz2.a(a);
        this.c = dn2;
    }

    private void a(boolean bl2) {
        ee.a().d("gps-available", bl2);
    }

    private boolean c() {
        return ee.a().a("gps-available", true);
    }

    private boolean d() {
        return ee.a().a("gps-available");
    }

    public a a() {
        if (!this.c()) {
            this.b.c("The Google Play Services Advertising Identifier feature is not available.");
            return a.a();
        }
        if (!this.d() && !this.c.a("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            this.b.c("The Google Play Services Advertising Identifier feature is not available.");
            this.a(false);
            return a.a();
        }
        a a2 = this.b().a();
        this.a(a2.b());
        return a2;
    }

    protected cd b() {
        return new cd();
    }

    static class a {
        private boolean a = true;
        private String b;
        private boolean c;

        protected a() {
        }

        static a a() {
            return new a().b(false);
        }

        private a b(boolean bl2) {
            this.a = bl2;
            return this;
        }

        a a(String string) {
            this.b = string;
            return this;
        }

        a a(boolean bl2) {
            this.c = bl2;
            return this;
        }

        boolean b() {
            return this.a;
        }

        String c() {
            return this.b;
        }

        boolean d() {
            return this.c() != null;
        }

        boolean e() {
            return this.c;
        }
    }

}

