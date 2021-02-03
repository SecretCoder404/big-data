/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aq;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.el;
import com.amazon.device.ads.ez;

class ap
implements el {
    private final bn a;
    private final ee b;
    private final aq c;
    private aq.a d;
    private br e;

    public ap() {
        this(new aq(), ee.a(), bn.a(), cx.a().c());
    }

    ap(aq aq2, ee ee2, bn bn2, br br2) {
        this.c = aq2;
        this.b = ee2;
        this.a = bn2;
        this.e = br2;
    }

    private boolean a() {
        if (this.d == null) {
            aq aq2 = this.c;
            int n2 = this.b.a("configVersion", 0);
            boolean bl = false;
            if (n2 != 0) {
                bl = true;
            }
            aq2.a(bl);
            this.d = this.c.b();
        }
        if (this.e == null) {
            this.e = cx.a().c();
        }
        return this.d.a();
    }

    @Override
    public boolean a(ez ez2) {
        String string;
        if (this.a() && (string = this.a.a("debug.idfa", this.d.b())) != null) {
            ez2.a("idfa", string);
            return true;
        }
        String string2 = this.b.a("deviceId", this.e.k());
        ez2.a("deviceId", this.a.a("debug.sha1udid", string2));
        return true;
    }
}

