/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.WindowManager
 *  android.webkit.WebView
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.TimerTask
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.WebView;
import com.amazon.device.ads.ab;
import com.amazon.device.ads.ac;
import com.amazon.device.ads.ad;
import com.amazon.device.ads.ae;
import com.amazon.device.ads.ag;
import com.amazon.device.ads.ai;
import com.amazon.device.ads.aj;
import com.amazon.device.ads.al;
import com.amazon.device.ads.an;
import com.amazon.device.ads.ao;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bi;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.bl;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.bq;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dj;
import com.amazon.device.ads.dk;
import com.amazon.device.ads.dm;
import com.amazon.device.ads.do;
import com.amazon.device.ads.dp;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.ef;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.eq;
import com.amazon.device.ads.ew;
import com.amazon.device.ads.ex;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.f;
import com.amazon.device.ads.fc;
import com.amazon.device.ads.g;
import com.amazon.device.ads.h;
import com.amazon.device.ads.i;
import com.amazon.device.ads.j;
import com.amazon.device.ads.l;
import com.amazon.device.ads.m;
import com.amazon.device.ads.n;
import com.amazon.device.ads.o;
import com.amazon.device.ads.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

class j
implements cv.b {
    private static final String b = "j";
    private h A;
    private int B;
    private int C;
    private boolean D;
    private ag E;
    private double F;
    private boolean G;
    private bl H;
    private ViewGroup I;
    private final AtomicBoolean J;
    private final AtomicBoolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private final ew Q;
    private final bk R;
    protected final fc a;
    private final Context c;
    private final ae d;
    private final cy e;
    private final al f;
    private cw g;
    private final cx h;
    private final dj i;
    private final bc j;
    private final aj k;
    private final o l;
    private final f m;
    private final bi n;
    private final ad o;
    private final ai p;
    private final g.a q;
    private final bn r;
    private final eq s;
    private l t;
    private String u;
    private Activity v;
    private int w;
    private i x;
    private final ArrayList<dt> y;
    private g z;

    public j(Context context, ae ae2) {
        this(context, ae2, new fc(), new cw(), new cz(), new al(), new Object(){

            public g a(Context context, f f2) {
                return new g(context, f2);
            }
        }, cx.a(), new dj(), new bc(), bi.a(), new ad(), ej.a(), new ez.d(), null, null, null, new ai(), bn.a(), new ex(), new eq(), bk.a());
    }

    j(Context context, ae ae2, fc fc2, cw cw2, cz cz2, al al2, g.a a2, cx cx2, dj dj2, bc bc2, bi bi2, ad ad2, ej.k k2, ao ao2, ez.d d2, o o2, aj aj2, f f2, ai ai2, bn bn2, ex ex2, eq eq2, bk bk2) {
        o o3;
        ex ex3;
        this.w = 20000;
        this.y = new ArrayList();
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = ag.a;
        this.F = 1.0;
        this.G = false;
        this.I = null;
        this.J = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.c = context;
        this.d = ae2;
        this.a = fc2;
        this.g = cw2;
        this.e = cz2.a(b);
        this.f = al2;
        this.q = a2;
        this.h = cx2;
        this.i = dj2;
        this.j = bc2;
        this.n = bi2;
        this.p = ai2;
        this.r = bn2;
        this.o = ad2;
        this.s = eq2;
        this.l = o2 != null ? o2 : (o3 = new o(bi2, this.o, this.d(), cz2, al2));
        if (aj2 != null) {
            this.k = aj2;
        } else {
            aj aj3;
            an an2 = ao2.a(context, this.o, this.d());
            this.k = aj3 = new aj(k2, an2, d2, this.d(), fc2, cz2, cx2.c());
        }
        this.k.a(new a());
        if (f2 != null) {
            this.m = f2;
            ex3 = ex2;
        } else {
            this.m = new f(this);
            ex3 = ex2;
        }
        this.Q = ex3.a(this);
        this.R = bk2;
    }

    j(Context context, ae ae2, fc fc2, cw cw2, cz cz2, al al2, g.a a2, cx cx2, dj dj2, bc bc2, bi bi2, ad ad2, ej.k k2, ez.d d2, o o2, aj aj2, f f2, ai ai2, bn bn2, ex ex2, eq eq2, bk bk2) {
        ao ao2 = new ao(fc2, cz2, bc2);
        this(context, ae2, fc2, cw2, cz2, al2, a2, cx2, dj2, bc2, bi2, ad2, k2, ao2, d2, o2, aj2, f2, ai2, bn2, ex2, eq2, bk2);
    }

    private void a(ab ab2) {
        this.o.a(ab2);
    }

    static /* synthetic */ void a(j j2) {
        j2.as();
    }

    private boolean an() {
        return this.M || this.L;
        {
        }
    }

    private void ao() {
        if (!this.N()) {
            return;
        }
        this.G = false;
        this.p.a();
        this.f();
        this.P = false;
        g g2 = this.z;
        if (g2 != null) {
            g2.b();
            this.o.a();
            this.z = null;
        }
        this.t = null;
    }

    private void ap() {
        if (!this.ae()) {
            float f2 = this.h.c().q();
            int n2 = (int)(f2 * (float)this.t.h());
            int n3 = (int)(f2 * (float)this.t.g());
            this.F = this.f.a(n2, n3, this.t(), this.s());
            int n4 = this.r().f();
            if (n4 > 0) {
                double d2 = this.t.h();
                double d3 = this.F;
                Double.isNaN((double)d2);
                double d4 = d2 * d3;
                double d5 = n4;
                if (d4 > d5) {
                    double d6 = this.t.h();
                    Double.isNaN((double)d5);
                    Double.isNaN((double)d6);
                    this.F = d5 / d6;
                }
            }
            if (!this.r().e() && this.F > 1.0) {
                this.F = 1.0;
            }
            this.u();
            return;
        }
        this.F = -1.0;
    }

    private void aq() {
        if ((bd.c(this.j, 14) || bd.c(this.j, 15)) && this.t.c().contains((Object)com.amazon.device.ads.a.k)) {
            this.M = true;
            return;
        }
        this.M = false;
    }

    private boolean ar() {
        return true ^ this.h().equals((Object)ag.i);
    }

    private void as() {
        if (ag.e.compareTo((Enum)this.h()) >= 0 && this.b(ag.j)) {
            this.e.d("Ad Has Expired");
            this.at();
        }
    }

    private void at() {
        ej.b(new Runnable(this){
            final /* synthetic */ j a;
            {
                this.a = j2;
            }

            public void run() {
                this.a.c().d();
                this.a.f(true);
            }
        });
    }

    private void au() {
        if (!this.N()) {
            return;
        }
        this.a(ag.c);
        this.a(this.t.b());
    }

    private void av() {
        long l2 = this.p().j();
        if (l2 > 0L) {
            this.p.b();
            this.p.a(new TimerTask(this){
                final /* synthetic */ j a;
                {
                    this.a = j2;
                }

                public void run() {
                    j.a(this.a);
                }
            }, l2);
        }
    }

    private boolean b(ag ag2) {
        j j2 = this;
        synchronized (j2) {
            if (ag.e.compareTo((Enum)this.h()) >= 0) {
                this.a(ag2);
                return true;
            }
            return false;
        }
    }

    private void e(m m2) {
        if (this.e() != null && !this.e().c()) {
            this.c(m2);
            return;
        }
        this.b(m2);
    }

    private boolean h(boolean bl2) {
        return this.c().a(bl2);
    }

    public bq A() {
        return this.a();
    }

    public void B() {
        this.a().i();
    }

    public boolean C() {
        return this.a().j();
    }

    public int D() {
        return this.a().c();
    }

    public int E() {
        return this.a().d();
    }

    public String F() {
        if (!this.r().b()) {
            return null;
        }
        return ae.a(this.t(), this.s());
    }

    public String G() {
        if (this.x() > 1.0) {
            return "u";
        }
        if (this.x() < 1.0 && this.x() > 0.0) {
            return "d";
        }
        return "n";
    }

    public void H() {
        this.y.clear();
    }

    public void I() {
        if (!this.N()) {
            return;
        }
        this.v = null;
        this.G = false;
        this.p.a();
        this.f();
        this.P = false;
        this.a().b();
        this.o.a();
        this.t = null;
        this.a(ag.a);
    }

    public boolean J() {
        return this.a().e();
    }

    boolean K() {
        try {
            this.a().a();
            return true;
        }
        catch (IllegalStateException illegalStateException) {
            this.a(new m(m.a.d, "An unknown error occurred when attempting to create the web view."));
            this.a(ag.j);
            this.e.f("An unknown error occurred when attempting to create the web view.");
            return false;
        }
    }

    public void L() {
        if (!this.N()) {
            return;
        }
        this.a(ag.d);
        long l2 = System.nanoTime();
        this.e().c(cv.a.i, l2);
        this.e().b(cv.a.B, l2);
        this.J.set(true);
        String string = this.t.a();
        this.a(this.R.a(bk.a.p, "http://mads.amazon-adsystem.com/"), string);
    }

    public boolean M() {
        l l2 = this.t;
        return l2 != null && l2.i();
    }

    public boolean N() {
        return !ag.k.equals((Object)this.h()) && !ag.j.equals((Object)this.h());
    }

    public boolean O() {
        this.p.a();
        return ag.e.equals((Object)this.h()) && this.b(ag.f);
    }

    public void P() {
        if (!this.N()) {
            return;
        }
        this.e().c(cv.a.p);
        this.p.a();
        if (this.ar()) {
            this.a.a(this.p().e(), false);
        }
        this.a(ag.g);
        if (!this.w()) {
            this.a(this.z().getWidth(), this.z().getHeight());
        }
        this.a(new ds(ds.a.c));
        this.Q.a(false);
    }

    void Q() {
        if (this.r.a("debug.canTimeout", true).booleanValue() && !this.d(true)) {
            this.e(new m(m.a.b, "Ad Load Timed Out"));
            this.a(ag.j);
        }
    }

    void R() {
        ej.b(new Runnable(this){
            final /* synthetic */ j a;
            {
                this.a = j2;
            }

            public void run() {
                if (!this.a.N()) {
                    return;
                }
                this.a.c().a();
            }
        });
    }

    void S() {
        ej.b(new Runnable(this){
            final /* synthetic */ j a;
            {
                this.a = j2;
            }

            public void run() {
                if (!this.a.N()) {
                    return;
                }
                this.a.c().b();
            }
        });
    }

    public void T() {
        this.Q.a(false);
    }

    public boolean U() {
        return this.m.a();
    }

    public void V() {
        this.a().k();
    }

    protected void W() {
        this.f.a(this.y(), this.e());
        if (this.s() == 0) {
            this.e().a(cv.a.H);
        }
        this.e().a(cv.a.I, this.G());
    }

    public void X() {
        cv.a().a(this);
    }

    public void Y() {
        this.a().a(new View.OnKeyListener(this){
            final /* synthetic */ j a;
            {
                this.a = j2;
            }

            public boolean onKey(View view, int n2, android.view.KeyEvent keyEvent) {
                if (n2 == 4 && keyEvent.getRepeatCount() == 0) {
                    this.a.Z();
                    return true;
                }
                return false;
            }
        });
    }

    boolean Z() {
        if (this.N) {
            this.a(new ds(ds.a.j));
            return true;
        }
        this.U();
        return false;
    }

    g a() {
        if (this.z == null) {
            this.z = this.b();
            this.z.a(this.an());
            this.z.a(this.k.a());
        }
        return this.z;
    }

    public void a(int n2) {
        this.w = n2;
    }

    public void a(int n2, int n3) {
        this.C = n2;
        this.B = n3;
        this.D = true;
    }

    void a(Activity activity) {
        this.v = activity;
    }

    void a(DisplayMetrics displayMetrics) {
        ((WindowManager)this.c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public void a(ViewGroup.LayoutParams layoutParams) {
        ViewGroup viewGroup = (ViewGroup)this.z().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.z());
        }
        this.u();
        ViewGroup viewGroup2 = this.I;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.z(), layoutParams);
        }
        this.a().a((View.OnKeyListener)null);
        this.b(false);
    }

    public void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, boolean bl2) {
        ViewGroup viewGroup2 = this.aa();
        if (this.I == null) {
            this.I = viewGroup2;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.z());
        }
        this.v();
        viewGroup.addView(this.z(), layoutParams);
        this.O = bl2;
        this.b(true);
        if (this.O) {
            this.Y();
        }
    }

    public void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.z.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public void a(ag ag2) {
        cy cy2 = this.e;
        Object[] arrobject = new Object[]{this.E, ag2};
        cy2.c("Changing AdState from %s to %s", arrobject);
        this.E = ag2;
    }

    public void a(bl bl2) {
        this.H = bl2;
    }

    public void a(ds ds2) {
        cy cy2 = this.e;
        Object[] arrobject = new Object[]{ds2.a()};
        cy2.c("Firing SDK Event of type %s", arrobject);
        Iterator iterator = this.y.iterator();
        while (iterator.hasNext()) {
            ((dt)iterator.next()).a(ds2, this.d());
        }
    }

    public void a(dt dt2) {
        this.e.c("Add SDKEventListener %s", dt2);
        this.y.add((Object)dt2);
    }

    public void a(i i2) {
        this.x = i2;
    }

    public void a(l l2) {
        this.t = l2;
    }

    public void a(m m2) {
        if (!this.N()) {
            return;
        }
        if (!this.d(true)) {
            this.p.a();
            this.e(m2);
            this.a(ag.a);
        }
    }

    void a(m m2, boolean bl2) {
        ej.b(new Runnable(this, m2, bl2){
            final /* synthetic */ m a;
            final /* synthetic */ boolean b;
            final /* synthetic */ j c;
            {
                this.c = j2;
                this.a = m2;
                this.b = bl2;
            }

            public void run() {
                this.c.c().a(this.a);
                this.c.f(this.b);
            }
        });
    }

    void a(n n2) {
        ej.b(new Runnable(this, n2){
            final /* synthetic */ n a;
            final /* synthetic */ j b;
            {
                this.b = j2;
                this.a = n2;
            }

            public void run() {
                if (!this.b.N()) {
                    return;
                }
                this.b.c().a(this.a);
            }
        });
    }

    void a(x x2) {
        ej.b(new Runnable(this, x2){
            final /* synthetic */ x a;
            final /* synthetic */ j b;
            {
                this.b = j2;
                this.a = x2;
            }

            public void run() {
                if (!this.b.N()) {
                    return;
                }
                this.b.c().a(this.a);
            }
        });
    }

    void a(Object object, boolean bl2, String string) {
        this.a().a(object, bl2, string);
    }

    public void a(String string) {
        if (!this.N()) {
            return;
        }
        this.aq();
        if (!this.K()) {
            return;
        }
        this.ap();
        for (com.amazon.device.ads.a a2 : this.t) {
            Set<ac> set = this.n.a(a2);
            if (set == null) continue;
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                this.a(((ac)iterator.next()).a(this.d()));
            }
        }
        this.u = string;
        this.au();
    }

    public void a(String string, dm dm2) {
        this.k.a(string, true, dm2);
    }

    public void a(String string, String string2) {
        this.a(string, string2, false, null);
    }

    public void a(String string, String string2, boolean bl2, dm dm2) {
        this.a().g();
        this.H();
        String string3 = this.l.a(string2, bl2);
        this.a().a(string, string3, bl2, dm2);
    }

    public void a(String string, boolean bl2) {
        ej.c(new Runnable(this, string, bl2){
            final /* synthetic */ String a;
            final /* synthetic */ boolean b;
            final /* synthetic */ j c;
            {
                this.c = j2;
                this.a = string;
                this.b = bl2;
            }

            public void run() {
                this.c.a().a(this.a, this.b);
            }
        });
    }

    public void a(boolean bl2) {
        this.L = bl2;
        g g2 = this.z;
        if (g2 != null) {
            g2.a(this.an());
        }
    }

    public void a(boolean bl2, dp dp2) {
        this.a().a(bl2, dp2);
    }

    public boolean a(long l2, boolean bl2) {
        block8 : {
            boolean bl3;
            block11 : {
                block12 : {
                    block9 : {
                        block10 : {
                            if (!this.N()) {
                                this.d("An ad could not be loaded because the view has been destroyed or was not created properly.");
                                return false;
                            }
                            if (!this.ab()) {
                                this.d("Ads cannot load unless \"com.amazon.device.ads.AdActivity\" is correctly declared as an activity in AndroidManifest.xml. Consult the online documentation for more info.");
                                return false;
                            }
                            if (!this.a(this.c)) {
                                this.d("Ads cannot load because the INTERNET permission is missing from the app's manifest.");
                                return false;
                            }
                            if (!this.ac()) {
                                this.d("Can't load an ad because Application Key has not been set. Did you forget to call AdRegistration.setAppKey( ... )?");
                                return false;
                            }
                            if (!this.a().e()) {
                                cv.a().b().a(cv.a.K);
                                this.d("We will be unable to create a WebView for rendering an ad due to an unknown issue with the WebView.");
                                return false;
                            }
                            if (this.h(bl2)) break block8;
                            if (!this.h().equals((Object)ag.e)) break block9;
                            if (!this.M()) break block10;
                            bl3 = false;
                            break block11;
                        }
                        this.e.f("An ad is ready to show. Please call showAd() to show the ad before loading another ad.");
                        break block12;
                    }
                    if (this.h().equals((Object)ag.h)) {
                        this.e.f("An ad could not be loaded because another ad is currently expanded.");
                    } else {
                        this.e.f("An ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad.");
                    }
                }
                bl3 = true;
            }
            if (bl3) {
                return false;
            }
        }
        this.ao();
        this.e().b(cv.a.a, l2);
        this.e().b(cv.a.c, l2);
        this.e().b(cv.a.b, l2);
        this.e().b(cv.a.d, l2);
        this.a(ag.b);
        this.J.set(false);
        this.c(false);
        this.p.b();
        this.p.a(new TimerTask(this){
            final /* synthetic */ j a;
            {
                this.a = j2;
            }

            public void run() {
                this.a.Q();
            }
        }, this.q());
        this.h.c().a(this.c);
        this.G = true;
        return true;
    }

    protected boolean a(Context context) {
        return this.i.a(context);
    }

    ViewGroup aa() {
        return (ViewGroup)this.z().getParent();
    }

    boolean ab() {
        return this.f.a(this.l().getApplicationContext());
    }

    boolean ac() {
        return this.h.d().e() != null;
    }

    dk ad() {
        int n2 = this.D();
        int n3 = this.E();
        if (n2 == 0 && n3 == 0) {
            n2 = this.t();
            n3 = this.s();
        }
        int n4 = this.f.a(n2);
        int n5 = this.f.a(n3);
        int[] arrn = new int[2];
        this.a().a(arrn);
        View view = this.al();
        if (view == null) {
            this.e.e("Could not find the activity's root view while determining ad position.");
            return null;
        }
        int[] arrn2 = new int[2];
        view.getLocationOnScreen(arrn2);
        int n6 = this.f.a(arrn[0]);
        int n7 = this.f.a(arrn[1] - arrn2[1]);
        return new dk(new ef(n4, n5), n6, n7);
    }

    boolean ae() {
        return ae.c.c.equals((Object)this.d.d());
    }

    public ef af() {
        View view = this.al();
        if (view == null) {
            this.e.e("Could not find the activity's root view while determining max expandable size.");
            return null;
        }
        int n2 = view.getWidth();
        int n3 = view.getHeight();
        return new ef(this.f.a(n2), this.f.a(n3));
    }

    ef ag() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.a(displayMetrics);
        int n2 = displayMetrics.widthPixels;
        int n3 = displayMetrics.heightPixels;
        return new ef(this.f.a(n2), this.f.a(n3));
    }

    void ah() {
        this.a().h();
    }

    public void ai() {
        this.Q.a();
    }

    public void aj() {
        this.Q.c();
    }

    public boolean ak() {
        return this.Q.d();
    }

    public View al() {
        return this.a().getRootView().findViewById(16908290);
    }

    public String am() {
        return this.u;
    }

    g b() {
        return this.q.a(this.c, this.m);
    }

    public void b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        g g2 = this.z;
        if (g2 == null) {
            return;
        }
        this.s.a(g2.getViewTreeObserver(), onGlobalLayoutListener);
    }

    void b(m m2) {
        this.a(m2, false);
    }

    public void b(n n2) {
        cy cy2 = this.e;
        Object[] arrobject = new Object[]{n2.a()};
        cy2.c("Firing AdEvent of type %s", arrobject);
        this.a(n2);
    }

    public void b(String string) {
        this.k.a(string, false, null);
    }

    public void b(boolean bl2) {
        if (bl2) {
            this.a(ag.h);
            return;
        }
        this.a(ag.g);
    }

    i c() {
        if (this.x == null) {
            this.x = new b();
        }
        return this.x;
    }

    void c(m m2) {
        this.d(m2);
        this.a(m2, true);
    }

    public void c(String string) {
        this.k.a(string);
    }

    void c(boolean bl2) {
        this.K.set(bl2);
    }

    public h d() {
        if (this.A == null) {
            this.A = new h(this);
        }
        return this.A;
    }

    void d(m m2) {
        long l2 = System.nanoTime();
        this.e().c(cv.a.a, l2);
        this.e().c(cv.a.j, l2);
        this.e().c(cv.a.c, l2);
        if (m2 != null) {
            this.e().a(cv.a.t);
            switch (3.a[m2.a().ordinal()]) {
                default: {
                    break;
                }
                case 3: {
                    this.e().a(cv.a.y);
                    break;
                }
                case 2: {
                    this.e().a(cv.a.x);
                    if (this.J.get()) {
                        this.e().a(cv.a.v);
                        break;
                    }
                    this.e().a(cv.a.u);
                    break;
                }
                case 1: {
                    this.e().a(cv.a.w);
                }
            }
        }
        this.e().c(cv.a.C, l2);
        if (this.h().equals((Object)ag.d)) {
            this.e().a(cv.a.A);
        }
        this.W();
    }

    public void d(String string) {
        this.e.f(string);
        this.a(new m(m.a.e, string));
    }

    boolean d(boolean bl2) {
        return this.K.getAndSet(bl2);
    }

    @Override
    public cw e() {
        return this.g;
    }

    public void e(String string) {
        if (!this.N()) {
            return;
        }
        this.e.d("Ad Rendered");
        if (this.h().equals((Object)ag.d)) {
            if (!this.d(true)) {
                this.J.set(false);
                this.p.a();
                this.av();
                this.a(ag.e);
                this.R();
                long l2 = System.nanoTime();
                if (this.e() != null) {
                    this.e().c(cv.a.B, l2);
                    this.e().c(cv.a.a, l2);
                    this.e().c(cv.a.b, l2);
                    this.W();
                    this.f(true);
                }
                this.S();
            }
        } else {
            cy cy2 = this.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ad State was not Rendering. It was ");
            stringBuilder.append((Object)this.h());
            cy2.d(stringBuilder.toString());
        }
        this.a(new ds(ds.a.a).a("url", string));
    }

    public void e(boolean bl2) {
        this.a().b(bl2);
    }

    @Override
    public void f() {
        this.g = new cw();
    }

    public void f(boolean bl2) {
        if (bl2) {
            this.X();
        }
    }

    @Override
    public String g() {
        l l2 = this.t;
        if (l2 != null) {
            return l2.d();
        }
        return null;
    }

    public void g(boolean bl2) {
        this.N = bl2;
    }

    public ag h() {
        return this.E;
    }

    public boolean i() {
        return ag.g.equals((Object)this.h()) || ag.h.equals((Object)this.h());
        {
        }
    }

    public boolean j() {
        return this.r().c() || ag.h.equals((Object)this.h()) && this.O;
        {
        }
    }

    public void k() {
        if (!this.P) {
            this.P = true;
            this.e().a(cv.a.ah);
        }
    }

    protected Context l() {
        Activity activity = this.v;
        if (activity == null) {
            return this.c;
        }
        return activity;
    }

    protected Activity m() {
        return this.v;
    }

    public boolean n() {
        boolean bl2 = this.G;
        this.G = false;
        return bl2;
    }

    public boolean o() {
        return true ^ this.h().equals((Object)ag.j);
    }

    public l p() {
        return this.t;
    }

    public int q() {
        return this.w;
    }

    public ae r() {
        return this.d;
    }

    public int s() {
        return this.B;
    }

    public int t() {
        return this.C;
    }

    void u() {
        l l2 = this.t;
        if (l2 != null) {
            double d2 = l2.g();
            double d3 = this.x();
            Double.isNaN((double)d2);
            double d4 = d2 * d3;
            double d5 = this.f.a();
            Double.isNaN((double)d5);
            int n2 = (int)(d4 * d5);
            if (n2 <= 0) {
                n2 = -1;
            }
            if (this.r().e()) {
                this.a().a(n2);
                return;
            }
            double d6 = this.t.h();
            double d7 = this.x();
            Double.isNaN((double)d6);
            double d8 = d6 * d7;
            double d9 = this.f.a();
            Double.isNaN((double)d9);
            int n3 = (int)(d8 * d9);
            this.a().a(n3, n2, this.r().a());
        }
    }

    public void v() {
        this.a().a(-1, -1, 17);
    }

    public boolean w() {
        return this.D;
    }

    public double x() {
        return this.F;
    }

    public bl y() {
        return this.H;
    }

    public View z() {
        return this.a();
    }

    private class a
    implements an.a {
        private a() {
        }

        @Override
        public void a(WebView webView, int n2, String string, String string2) {
        }

        @Override
        public void a(WebView webView, String string) {
            if (j.this.a().a((View)webView)) {
                j.this.e(string);
            }
        }

        @Override
        public void b(WebView webView, String string) {
        }

        @Override
        public void c(WebView webView, String string) {
        }
    }

    class b
    implements i {
        b() {
        }

        @Override
        public void a() {
            j.this.e.d("DefaultAdControlCallback onAdRendered called");
        }

        @Override
        public void a(m m2) {
            j.this.e.d("DefaultAdControlCallback onAdFailed called");
        }

        @Override
        public void a(n n2) {
            j.this.e.d("DefaultAdControlCallback onAdEvent called");
        }

        @Override
        public void a(x x2) {
            j.this.e.d("DefaultAdControlCallback onAdLoaded called");
        }

        @Override
        public boolean a(boolean bl2) {
            j.this.e.d("DefaultAdControlCallback isAdReady called");
            return j.this.h().equals((Object)ag.a) || j.this.h().equals((Object)ag.g);
            {
            }
        }

        @Override
        public void b() {
            j.this.e.d("DefaultAdControlCallback postAdRendered called");
        }

        @Override
        public int c() {
            j.this.e.d("DefaultAdControlCallback adClosing called");
            return 1;
        }

        @Override
        public void d() {
            j.this.e.d("DefaultAdControlCallback onAdExpired called");
        }
    }

}

