/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.dw
 *  com.amazon.device.ads.dy
 *  com.amazon.device.ads.dz$2
 *  com.amazon.device.ads.dz$a
 *  com.amazon.device.ads.ej$h
 *  java.lang.Boolean
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aq;
import com.amazon.device.ads.be;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.do;
import com.amazon.device.ads.dw;
import com.amazon.device.ads.dy;
import com.amazon.device.ads.dz;
import com.amazon.device.ads.ea;
import com.amazon.device.ads.eb;
import com.amazon.device.ads.ec;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.ei;
import com.amazon.device.ads.ej;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/*
 * Exception performing whole class analysis.
 */
class dz {
    private static final String a = "dz";
    private static final ej.h b;
    private final ej.g c;
    private final ej.l d;
    private final cy e;
    private final aq f;
    private final ea.b g;
    private final eb.a h;
    private final cx i;
    private final bk j;
    private final ee k;
    private final be l;
    private final ei m;
    private final bn n;

    static {
        b = new /* Unavailable Anonymous Inner Class!! */;
    }

    public dz() {
        this(new ea.b(), new eb.a(), new aq(), cx.a(), bk.a(), ee.a(), be.a(), new ei(), (ej.g)b, new ej.l(), new cz(), bn.a());
    }

    dz(ea.b b2, eb.a a2, aq aq2, cx cx2, bk bk2, ee ee2, be be2, ei ei2, ej.g g2, ej.l l2, cz cz2, bn bn2) {
        this.g = b2;
        this.h = a2;
        this.f = aq2;
        this.i = cx2;
        this.j = bk2;
        this.k = ee2;
        this.l = be2;
        this.m = ei2;
        this.c = g2;
        this.d = l2;
        this.e = cz2.a(a);
        this.n = bn2;
    }

    static /* synthetic */ cy a(dz dz2) {
        return dz2.g();
    }

    private void c(long l2) {
        this.k.b("amzn-ad-sis-last-checkin", l2);
    }

    private cy g() {
        return this.e;
    }

    protected void a(aq aq2) {
        dw dw2 = this.g.a(ea.a.a, aq2);
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        this.h.a((ec)a2, new ea[]{dw2}).a();
    }

    protected boolean a() {
        return this.i.d().h();
    }

    protected boolean a(long l2) {
        boolean bl2;
        block3 : {
            block2 : {
                do do_ = this.i.d();
                if (this.b(l2) || do_.g() || do_.i()) break block2;
                boolean bl3 = this.n.a("debug.shouldRegisterSIS", false);
                bl2 = false;
                if (!bl3) break block3;
            }
            bl2 = true;
        }
        return bl2;
    }

    public void b() {
        Runnable runnable = new Runnable(){

            public void run() {
                dz.this.c();
            }
        };
        this.c.a(runnable);
    }

    protected void b(aq aq2) {
        dw dw2 = this.g.a(ea.a.b, aq2);
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        this.h.a((ec)a2, new ea[]{dw2}).a();
    }

    protected boolean b(long l2) {
        return l2 - this.e() > this.n.a("debug.sisCheckinInterval", 86400000L);
    }

    void c() {
        AtomicBoolean atomicBoolean;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        atomicBoolean = new AtomicBoolean(false);
        this.j.a((bk.b)new 2(this, atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        }
        catch (InterruptedException interruptedException) {}
        if (atomicBoolean.get()) {
            this.d();
        }
    }

    void d() {
        long l2 = this.m.a();
        if (this.f.b().a() && this.a(l2)) {
            this.c(l2);
            if (this.a()) {
                this.b(this.f);
                return;
            }
            this.a(this.f);
        }
    }

    protected long e() {
        return this.k.a("amzn-ad-sis-last-checkin", 0L);
    }

    protected void f() {
        JSONArray jSONArray;
        if (this.d.b()) {
            this.g().f("Registering events must be done on a background thread.");
            return;
        }
        aq.a a2 = this.f.b();
        if (a2.f() && (jSONArray = this.l.b()) != null) {
            dy dy2 = this.g.a(a2, jSONArray);
            this.h.a(new ea[]{dy2}).a();
        }
    }

}

