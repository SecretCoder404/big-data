/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.b;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.bt;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.d;
import com.amazon.device.ads.ee;

class bs
extends d {
    private final bk f;
    private final bt g;

    bs() {
        this(bn.a(), new cz(), bk.a(), ee.a().a("directedIdRetriever", null, bt.class));
    }

    bs(bn bn2, cz cz2, bk bk2, bt bt2) {
        super(bn2, "directedId", "debug.directedId", cz2);
        this.f = bk2;
        this.g = bt2;
    }

    @Override
    protected String a(b.m m2) {
        bt bt2;
        if (this.f.b(bk.a.i) && (bt2 = this.g) != null) {
            return bt2.a();
        }
        return null;
    }
}

