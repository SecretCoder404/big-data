/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.ap
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ap;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.el;
import com.amazon.device.ads.ez;

class fa {
    private final ee a;
    private el b;
    private final ap c;

    public fa() {
        this(ee.a(), new ap());
    }

    fa(ee ee2, ap ap2) {
        this.a = ee2;
        this.c = ap2;
    }

    private void a() {
        if (this.b == null) {
            this.b = this.a.a("userIdParam", this.c, el.class);
        }
    }

    public boolean a(ez ez2) {
        el el2;
        ap ap2;
        this.a();
        boolean bl2 = this.b.a(ez2);
        if (!bl2 && (el2 = this.b) != (ap2 = this.c)) {
            bl2 = ap2.a(ez2);
        }
        return bl2;
    }
}

