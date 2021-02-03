/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.an;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dm;
import com.amazon.device.ads.dr;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.fc;
import com.amazon.device.ads.h;

class aj {
    private static final String a = "aj";
    private final ej.k b;
    private final an c;
    private final ez.d d;
    private final h e;
    private final fc f;
    private final cy g;
    private final br h;

    public aj(ej.k k2, an an2, ez.d d2, h h2, fc fc2, cz cz2, br br2) {
        this.b = k2;
        this.c = an2;
        this.d = d2;
        this.e = h2;
        this.f = fc2;
        this.g = cz2.a(a);
        this.h = br2;
    }

    private void b(final String string, final boolean bl2, final dm dm2) {
        ez.g g2;
        ez ez2 = this.d.a();
        ez2.h(a);
        ez2.a(true);
        ez2.d(string);
        ez2.c("User-Agent", this.h.r());
        try {
            g2 = ez2.c();
        }
        catch (ez.c c2) {
            cy cy2 = this.g;
            Object[] arrobject = new Object[]{string, c2.getMessage()};
            cy2.e("Could not load URL (%s) into AdContainer: %s", arrobject);
            g2 = null;
        }
        if (g2 != null) {
            final String string2 = g2.a().c();
            if (string2 != null) {
                ej.k k2 = this.b;
                Runnable runnable = new Runnable(){

                    public void run() {
                        aj.this.e.a(string, string2, bl2, dm2);
                    }
                };
                k2.a(runnable, ej.b.a, ej.c.a);
                return;
            }
            this.g.e("Could not load URL (%s) into AdContainer.", new Object[]{string});
        }
    }

    public an a() {
        return this.c;
    }

    public void a(an.a a2) {
        this.c.a(a2);
    }

    public void a(String string) {
        this.c.a(string);
    }

    public void a(final String string, final boolean bl2, final dm dm2) {
        String string2 = this.f.c(string);
        if (!string2.equals((Object)"http") && !string2.equals((Object)"https")) {
            this.a(string);
            return;
        }
        this.b.a(new Runnable(){

            public void run() {
                aj.this.b(string, bl2, dm2);
            }
        }, ej.b.a, ej.c.b);
    }

}

