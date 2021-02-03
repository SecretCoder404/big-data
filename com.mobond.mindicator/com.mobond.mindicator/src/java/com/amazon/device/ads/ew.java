/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.ViewTreeObserver$OnWindowFocusChangeListener
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.g
 *  com.amazon.device.ads.j
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicInteger
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.annotation.TargetApi;
import android.view.ViewTreeObserver;
import com.amazon.device.ads.aw;
import com.amazon.device.ads.ax;
import com.amazon.device.ads.ay;
import com.amazon.device.ads.az;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.eq;
import com.amazon.device.ads.er;
import com.amazon.device.ads.es;
import com.amazon.device.ads.et;
import com.amazon.device.ads.g;
import com.amazon.device.ads.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

class ew {
    private static final String a = "ew";
    private static long b = 200L;
    private final j c;
    private final cy d;
    private final eq e;
    private ViewTreeObserver f;
    private final er g;
    private final ViewTreeObserver.OnGlobalFocusChangeListener h;
    private final ViewTreeObserver.OnGlobalLayoutListener i;
    private final ViewTreeObserver.OnScrollChangedListener j;
    private ViewTreeObserver.OnWindowFocusChangeListener k;
    private boolean l = false;
    private boolean m = false;
    private final AtomicInteger n;
    private final AtomicBoolean o;
    private long p = 0L;
    private final bn q;
    private final bk r;

    public ew(j j2) {
        this(j2, new es(), new cz(), new aw(), new ax(), new ay(), new az(), new AtomicInteger(0), new AtomicBoolean(false), new eq(), bn.a(), bk.a());
    }

    ew(j j2, es es2, cz cz2, aw aw2, ax ax2, ay ay2, az az2, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, eq eq2, bn bn2, bk bk2) {
        this.c = j2;
        this.d = cz2.a(a);
        this.g = es2.a(this.c);
        this.h = aw2.a(this);
        this.i = ax2.a(this);
        this.j = ay2.a(this);
        if (bd.a(18)) {
            this.k = az2.a(this);
        }
        this.n = atomicInteger;
        this.o = atomicBoolean;
        this.e = eq2;
        this.q = bn2;
        this.r = bk2;
        b = this.q.a("debug.viewableInterval", this.r.a(bk.a.n, 200L));
        cy cy2 = this.d;
        Object[] arrobject = new Object[]{b};
        cy2.c("Viewable Interval is: %d", arrobject);
    }

    @TargetApi(value=18)
    private void e() {
        if (this.f == null || !this.g() || this.h()) {
            this.f = this.c.a().getViewTreeObserver();
            this.m = false;
            this.o.set(false);
            this.l = false;
            this.p = 0L;
        }
        if (this.f != null && this.g()) {
            if (this.m) {
                return;
            }
            this.f.addOnGlobalLayoutListener(this.i);
            this.f.addOnGlobalFocusChangeListener(this.h);
            if (bd.a(18)) {
                this.f.addOnWindowFocusChangeListener(this.k);
            }
            this.m = true;
            this.a(false);
            return;
        }
    }

    @TargetApi(value=18)
    private void f() {
        ViewTreeObserver viewTreeObserver = this.f;
        if (viewTreeObserver == null) {
            this.d.e("Root view tree observer is null");
            return;
        }
        if (!this.e.a(viewTreeObserver, this.i)) {
            this.d.e("Root view tree observer is not alive");
            return;
        }
        this.f.removeOnScrollChangedListener(this.j);
        this.f.removeOnGlobalFocusChangeListener(this.h);
        if (bd.a(18)) {
            this.f.removeOnWindowFocusChangeListener(this.k);
        }
        this.m = false;
        this.o.set(false);
    }

    private boolean g() {
        if (!this.f.isAlive()) {
            this.d.e("Root view tree observer is not alive");
            return false;
        }
        return true;
    }

    private boolean h() {
        ViewTreeObserver viewTreeObserver = this.c.a().getViewTreeObserver();
        return this.f != viewTreeObserver;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        int n2 = this.n.incrementAndGet();
        cy cy2 = this.d;
        Object[] arrobject = new Object[]{n2};
        cy2.c("Viewability Interest Registered. Current number of objects interested in viewability: %d", arrobject);
        ew ew2 = this;
        synchronized (ew2) {
            this.e();
            return;
        }
    }

    public void a(boolean bl2) {
        long l2 = System.currentTimeMillis();
        if (bl2 && l2 - this.p < b) {
            return;
        }
        this.p = l2;
        et et2 = this.g.a();
        if (et2 == null) {
            this.d.e("Viewable info is null");
            return;
        }
        JSONObject jSONObject = et2.b();
        boolean bl3 = et2.a();
        ds ds2 = new ds(ds.a.k);
        ds2.a("VIEWABLE_PARAMS", jSONObject.toString());
        String string = bl3 ? "true" : " false";
        ds2.a("IS_VIEWABLE", string);
        if (!bl3) {
            if (!this.l) {
                this.c.a(ds2);
                this.l = true;
                return;
            }
        } else {
            this.c.a(ds2);
            this.l = false;
        }
    }

    protected void b() {
        if (!this.o.get()) {
            ViewTreeObserver viewTreeObserver = this.f;
            if (viewTreeObserver == null || !viewTreeObserver.isAlive() || this.h()) {
                this.f = this.c.a().getViewTreeObserver();
            }
            this.f.addOnScrollChangedListener(this.j);
            this.o.set(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        ew ew2 = this;
        synchronized (ew2) {
            int n2 = this.n.decrementAndGet();
            if (n2 < 0) {
                this.d.e("No Viewability Interest was previously registered. Ignoring request to deregister.");
                this.n.incrementAndGet();
                return;
            }
            cy cy2 = this.d;
            Object[] arrobject = new Object[]{n2};
            cy2.c("Viewability Interest Deregistered. Current number of objects interested in viewability: %d", arrobject);
            if (n2 == 0) {
                this.f();
            }
            return;
        }
    }

    public boolean d() {
        et et2 = this.g.a();
        if (et2 == null) {
            this.d.e("Viewable info is null");
            return false;
        }
        return et2.a();
    }
}

