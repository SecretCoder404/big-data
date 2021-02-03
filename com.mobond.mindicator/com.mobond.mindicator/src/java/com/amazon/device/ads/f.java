/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.j
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ag;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.i;
import com.amazon.device.ads.j;
import java.util.concurrent.atomic.AtomicBoolean;

class f {
    private static final String a = "f";
    private final cy b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final j d;

    public f(j j2) {
        this(j2, new cz());
    }

    f(j j2, cz cz2) {
        this.d = j2;
        this.b = cz2.a(a);
    }

    public boolean a() {
        this.b.d("Ad is attempting to close.");
        boolean bl2 = this.d.h().equals((Object)ag.a);
        boolean bl3 = false;
        if (!bl2) {
            AtomicBoolean atomicBoolean = this.c;
            boolean bl4 = true;
            boolean bl5 = atomicBoolean.getAndSet(bl4);
            bl3 = false;
            if (!bl5) {
                boolean bl6;
                boolean bl7;
                switch (this.d.c().c()) {
                    default: {
                        bl6 = false;
                        bl7 = false;
                        break;
                    }
                    case 1: {
                        bl6 = true;
                        bl7 = true;
                        break;
                    }
                    case 0: {
                        bl6 = true;
                        bl7 = false;
                    }
                }
                if (bl6) {
                    this.d.a(new ds(ds.a.f));
                } else {
                    bl4 = false;
                }
                if (bl7) {
                    this.d.I();
                }
                this.c.set(false);
                bl3 = bl4;
            }
        }
        return bl3;
    }
}

