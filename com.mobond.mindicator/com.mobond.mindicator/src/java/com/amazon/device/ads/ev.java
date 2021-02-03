/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bk;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.eu;

class ev
implements bk.b {
    private static final String a = "ev";
    private eu b;
    private final cy c;

    ev() {
        this(new eu(), new cz());
    }

    ev(eu eu2, cz cz2) {
        this.b = eu2;
        this.c = cz2.a(a);
    }

    @Override
    public void c() {
        this.b.a();
    }

    @Override
    public void d() {
        this.c.e("Configuration fetching failed so Viewability Javascript fetch will not proceed.");
    }
}

