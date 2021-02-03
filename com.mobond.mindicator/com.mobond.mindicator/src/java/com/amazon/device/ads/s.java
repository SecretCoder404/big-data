/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.bw
 *  com.amazon.device.ads.s$1
 *  com.amazon.device.ads.s$2
 *  java.lang.Object
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bw;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.de;
import com.amazon.device.ads.df;
import com.amazon.device.ads.q;
import com.amazon.device.ads.r;
import com.amazon.device.ads.s;

class s {
    private final cz a;
    private final a b;

    public s(cz cz2) {
        this(cz2, new a());
    }

    public s(cz cz2, a a2) {
        this.a = cz2;
        this.b = a2;
    }

    private void a(r r2) {
        r2.a((df)new 1(this, r2));
    }

    private void b(r r2) {
        r2.a((de)new 2(this, r2));
    }

    public r a(q q2) {
        return this.a(q2, this.a);
    }

    public r a(q q2, cz cz2) {
        r r2 = this.b.a(q2, cz2);
        if (q2 instanceof bw) {
            this.a(r2);
            this.b(r2);
        }
        return r2;
    }

    static class a {
        a() {
        }

        public r a(q q2, cz cz2) {
            return new r(q2, cz2);
        }
    }

}

