/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.b;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.d;

class du
extends d {
    private cx f;

    du() {
        this(bn.a(), new cz(), cx.a());
    }

    du(bn bn2, cz cz2, cx cx2) {
        super(bn2, "sha1_udid", "debug.sha1udid", cz2);
        this.f = cx2;
    }

    @Override
    protected String a(b.m m2) {
        return this.f.c().k();
    }
}

