/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.ae;
import com.amazon.device.ads.af;
import com.amazon.device.ads.ag;
import com.amazon.device.ads.ah;
import com.amazon.device.ads.bo;
import com.amazon.device.ads.ck;
import com.amazon.device.ads.cl;
import com.amazon.device.ads.cm;
import com.amazon.device.ads.cn;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dp;
import com.amazon.device.ads.e;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.i;
import com.amazon.device.ads.j;
import com.amazon.device.ads.k;
import com.amazon.device.ads.m;
import com.amazon.device.ads.n;
import com.amazon.device.ads.q;
import com.amazon.device.ads.r;
import com.amazon.device.ads.s;
import com.amazon.device.ads.t;
import com.amazon.device.ads.x;
import com.amazon.device.ads.y;
import com.amazon.device.ads.z;
import java.util.concurrent.atomic.AtomicBoolean;

public class cm
implements e {
    private static final String a = "cm";
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private boolean c = false;
    private final Context d;
    private int e = 20000;
    private final s f;
    private r g;
    private final k h;
    private j i;
    private boolean j = false;
    private final cz k;
    private final cy l;
    private final cl m;
    private final z n;
    private final t o;
    private final AtomicBoolean p = new AtomicBoolean(false);

    public cm(Context context) {
        this(context, new cz(), new k(), new cl(), y.a(), new t());
    }

    cm(Context context, cz cz2, k k2, cl cl2, z z2, t t2) {
        this(context, cz2, new s(cz2), k2, cl2, z2, t2);
    }

    cm(Context context, cz cz2, s s2, k k2, cl cl2, z z2, t t2) {
        if (context != null) {
            this.d = context;
            this.k = cz2;
            this.l = this.k.a(a);
            this.f = s2;
            this.h = k2;
            this.m = cl2;
            this.n = z2;
            this.o = t2;
            return;
        }
        throw new IllegalArgumentException("InterstitialAd requires a non-null Context");
    }

    static void a() {
        b.set(false);
    }

    static /* synthetic */ void a(cm cm2, x x2) {
        cm2.b(x2);
    }

    private void a(j j2) {
        this.i = j2;
        j2.a(this.k());
    }

    private void b(x x2) {
        this.g.a((e)this, x2);
    }

    private void s() {
        if (this.u()) {
            return;
        }
        this.j = true;
        this.n.a(this.d.getApplicationContext());
        if (this.g == null) {
            this.a((q)null);
        }
        this.t();
        this.y();
    }

    private void t() {
        this.a(this.a(this.d));
    }

    private boolean u() {
        return this.j;
    }

    private j v() {
        this.s();
        if (this.i == null) {
            this.t();
        }
        return this.i;
    }

    private cw w() {
        return this.v().e();
    }

    private void x() {
        k.c();
    }

    private void y() {
        this.w().a(x.a.d.a());
        this.w().a(cv.a.ac);
    }

    j a(Context context) {
        return this.h.a(context, ae.h);
    }

    void a(m m2) {
        this.g.a((e)this, m2);
    }

    public void a(q q2) {
        if (q2 == null) {
            q2 = new bo(a);
        }
        this.g = this.f.a(q2);
    }

    void a(x x2) {
        ej.c(new Runnable(this, x2){
            final /* synthetic */ x a;
            final /* synthetic */ cm b;
            {
                this.b = cm2;
                this.a = x2;
            }

            public void run() {
                cm.a(this.b, this.a);
            }
        });
    }

    public boolean a(ah ah2) {
        this.h();
        if (!this.e()) {
            switch (5.a[this.v().h().ordinal()]) {
                default: {
                    this.l.e("An interstitial ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad.");
                    return false;
                }
                case 4: {
                    this.l.f("An interstitial ad could not be loaded because the view has been destroyed.");
                    return false;
                }
                case 3: {
                    if (this.v().M()) {
                        this.v().I();
                        return this.a(ah2);
                    }
                    this.l.f("An interstitial ad could not be loaded because of an unknown issue with the web views.");
                    return false;
                }
                case 2: {
                    this.l.e("An interstitial ad is currently showing. Please wait for the user to dismiss the ad before loading an ad.");
                    return false;
                }
                case 1: 
            }
            this.l.e("An interstitial ad is ready to show. Please call showAd() to show the ad before loading another ad.");
            return false;
        }
        this.p.set(false);
        t t2 = this.o;
        int n2 = this.m();
        af[] arraf = new af[]{new af(this.v(), ah2)};
        t2.a(n2, ah2, arraf);
        return this.v().n();
    }

    void b(m m2) {
        ej.c(new Runnable(this, m2){
            final /* synthetic */ m a;
            final /* synthetic */ cm b;
            {
                this.b = cm2;
                this.a = m2;
            }

            public void run() {
                this.b.a(this.a);
            }
        });
    }

    public boolean b() {
        return this.a((ah)null);
    }

    public boolean c() {
        return this.v().h().equals((Object)ag.b) || this.v().h().equals((Object)ag.c) || this.v().h().equals((Object)ag.d);
        {
        }
    }

    public boolean d() {
        return this.v().h().equals((Object)ag.g);
    }

    boolean e() {
        return this.v().h().equals((Object)ag.a);
    }

    boolean f() {
        return this.v().h().equals((Object)ag.e);
    }

    public boolean g() {
        return this.f() && !this.v().M();
    }

    boolean h() {
        boolean bl2 = this.c && !b.get();
        if (bl2) {
            this.w().a(cv.a.ad);
            this.v().U();
        }
        return bl2;
    }

    public boolean i() {
        if (this.h()) {
            this.l.f("The ad could not be shown because it previously failed to show. Please load a new ad.");
            return false;
        }
        if (this.p.get()) {
            this.l.e("This interstitial ad has expired. Please load another ad.");
            return false;
        }
        long l2 = System.nanoTime();
        if (this.f()) {
            if (this.v().M()) {
                this.l.e("This interstitial ad has expired. Please load another ad.");
                return false;
            }
            if (b.getAndSet(true)) {
                this.l.e("Another interstitial ad is currently showing. Please wait for the InterstitialAdListener.onAdDismissed callback of the other ad.");
                return false;
            }
            if (this.v().O()) {
                this.c = true;
                this.w().c(cv.a.o, l2);
                this.w().b(cv.a.q, l2);
                k.a(this.v());
                this.w().b(cv.a.p);
                boolean bl2 = this.j();
                if (!bl2) {
                    this.x();
                    this.v().I();
                    b.set(false);
                    this.c = false;
                    this.w().c(cv.a.C);
                }
                return bl2;
            }
            this.l.e("Interstitial ad could not be shown.");
            return false;
        }
        if (this.e()) {
            this.l.e("The interstitial ad cannot be shown because it has not loaded successfully. Please call loadAd(AdTargetingOptions) to load an ad first.");
            return false;
        }
        if (this.c()) {
            this.l.e("The interstitial ad cannot be shown because it is still loading. Please wait for the AdListener.onAdLoaded() callback before showing the ad.");
            return false;
        }
        if (this.d()) {
            this.l.e("The interstitial ad cannot be shown because it is already displayed on the screen. Please wait for the InterstitialAdListener.onAdDismissed() callback and then load a new ad.");
            return false;
        }
        this.l.e("An interstitial ad is not ready to show.");
        return false;
    }

    boolean j() {
        boolean bl2 = this.m.a().a(AdActivity.class).a(this.d.getApplicationContext()).a("adapter", cn.class.getName()).a();
        if (!bl2) {
            this.l.f("Failed to show the interstitial ad because AdActivity could not be found.");
        }
        return bl2;
    }

    i k() {
        return new a();
    }

    void l() {
        this.w().c(cv.a.q);
        k.c();
        b.set(false);
        this.c = false;
        this.o();
    }

    public int m() {
        return this.e;
    }

    void n() {
        this.g.c(this);
    }

    void o() {
        ej.c(new Runnable(this){
            final /* synthetic */ cm a;
            {
                this.a = cm2;
            }

            public void run() {
                this.a.n();
                this.a.r();
            }
        });
    }

    void p() {
        ej.c(new Runnable(this){
            final /* synthetic */ cm a;
            {
                this.a = cm2;
            }

            public void run() {
                this.a.q();
            }
        });
    }

    void q() {
        this.g.d(this);
    }

    void r() {
        if (this.w() != null && !this.w().c()) {
            this.y();
            this.v().f(true);
        }
    }

    class a
    implements i {
        private x b;

        a() {
        }

        @Override
        public void a() {
            cm.this.a(this.b);
        }

        @Override
        public void a(m m2) {
            if (m.a.b.equals((Object)m2.a())) {
                cm.this.i = null;
            }
            cm.this.b(m2);
        }

        @Override
        public void a(n n2) {
        }

        @Override
        public void a(x x2) {
            this.b = x2;
            cm.this.y();
            cm.this.v().a(true, dp.b);
            cm.this.v().L();
        }

        @Override
        public boolean a(boolean bl2) {
            return cm.this.e();
        }

        @Override
        public void b() {
            cm.this.w().b(cv.a.o);
        }

        @Override
        public int c() {
            cm.this.l();
            return 1;
        }

        @Override
        public void d() {
            cm.this.w().a(cv.a.ai);
            cm.this.p.set(true);
            cm.this.i = null;
            cm.this.p();
        }
    }

}

