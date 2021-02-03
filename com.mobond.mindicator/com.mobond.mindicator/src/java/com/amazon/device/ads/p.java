/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.graphics.Rect
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.WindowManager
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.ae;
import com.amazon.device.ads.af;
import com.amazon.device.ads.ag;
import com.amazon.device.ads.ah;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bm;
import com.amazon.device.ads.bo;
import com.amazon.device.ads.bq;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dh;
import com.amazon.device.ads.e;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.i;
import com.amazon.device.ads.j;
import com.amazon.device.ads.k;
import com.amazon.device.ads.l;
import com.amazon.device.ads.m;
import com.amazon.device.ads.n;
import com.amazon.device.ads.p;
import com.amazon.device.ads.q;
import com.amazon.device.ads.r;
import com.amazon.device.ads.s;
import com.amazon.device.ads.t;
import com.amazon.device.ads.x;
import com.amazon.device.ads.y;
import com.amazon.device.ads.z;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint(value={"InlinedApi"})
public class p
extends FrameLayout
implements e {
    private static final String a = "p";
    private static ScheduledThreadPoolExecutor v = new ScheduledThreadPoolExecutor(1);
    private final z A;
    private final t B;
    private final AtomicBoolean C = new AtomicBoolean(false);
    private BroadcastReceiver b;
    private boolean c;
    private final Context d;
    private ae e;
    private final k f;
    private j g;
    private boolean h = false;
    private boolean i = false;
    private int j = 8;
    private AtomicBoolean k = new AtomicBoolean(false);
    private boolean l = false;
    private View m = null;
    private ah n = null;
    private boolean o = false;
    private boolean p = false;
    private boolean q = true;
    private View r;
    private bq s;
    private x t;
    private boolean u;
    private final s w;
    private r x;
    private final cz y;
    private final cy z;

    static {
        v.setKeepAliveTime(60L, TimeUnit.SECONDS);
    }

    public p(Context context) {
        this(context, ae.f);
    }

    public p(Context context, ae ae2) {
        this(context, ae2, new cz(), new k(), y.a(), new t());
    }

    p(Context context, ae ae2, cz cz2, k k2, z z2, t t2) {
        this(context, ae2, cz2, new s(cz2), k2, z2, t2);
    }

    p(Context context, ae ae2, cz cz2, s s2, k k2, z z2, t t2) {
        super(context);
        this.d = context;
        this.e = ae2;
        this.y = cz2;
        this.z = this.y.a(a);
        this.w = s2;
        this.f = k2;
        this.A = z2;
        this.B = t2;
    }

    private boolean A() {
        return ag.a.equals((Object)this.getAdController().h()) || ag.g.equals((Object)this.getAdController().h());
        {
        }
    }

    private boolean B() {
        return this.getAdController().h().equals((Object)ag.e);
    }

    private boolean C() {
        if (this.getLayoutParams() == null) {
            cv.a().b().a(cv.a.L);
            this.a("Can't load an ad because layout parameters are blank. Use setLayoutParams() to specify dimensions for this AdLayout.");
            return false;
        }
        if (bd.a(11)) {
            this.o();
            if (this.q()) {
                this.a("Ad load failed because root view could not be obtained from the activity.");
                return false;
            }
            if (this.p()) {
                this.z.d("Activity root view layout is requested.");
                this.j();
                this.h();
                return false;
            }
            this.i();
            return true;
        }
        this.i();
        return true;
    }

    private void D() {
        int n2 = this.b(true);
        int n3 = this.b(false);
        if (n2 > 0 || n3 > 0) {
            this.getAdController().a(n2, n3);
        }
    }

    private j a(ae ae2, Context context) {
        return this.f.a(context, ae2);
    }

    private void a(String string) {
        this.getAdController().d(string);
    }

    static /* synthetic */ boolean a(p p2) {
        return p2.c;
    }

    private j getAdController() {
        this.a();
        if (this.g == null) {
            this.v();
        }
        return this.g;
    }

    private void setAdController(j j2) {
        this.g = j2;
        this.g.a(this.b());
    }

    private void u() {
        j j2 = this.g;
        if (j2 != null) {
            j2.T();
        }
    }

    private void v() {
        if (this.g == null) {
            ae ae2 = this.e;
            if (ae2 == null) {
                ae2 = ae.f;
            }
            this.setAdController(this.a(ae2, this.d));
            this.g.a(this.u);
        }
    }

    private void w() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.b = new BroadcastReceiver(this){
            final /* synthetic */ p a;
            {
                this.a = p2;
            }

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals((Object)"android.intent.action.SCREEN_OFF") && p.a(this.a)) {
                    p.b(this.a).U();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.d.getApplicationContext().registerReceiver(this.b, intentFilter);
    }

    private void x() {
        if (this.h) {
            this.h = false;
            this.d.getApplicationContext().unregisterReceiver(this.b);
        }
    }

    private void y() {
        if (this.getAdController().h().equals((Object)ag.h)) {
            ej.b(new Runnable(this){
                final /* synthetic */ p a;
                {
                    this.a = p2;
                }

                public void run() {
                    if (p.b(this.a).h().equals((Object)((Object)ag.h))) {
                        p.b(this.a).U();
                    }
                }
            });
        }
    }

    private void z() {
        ah ah2 = this.n;
        af af2 = new af(this.getAdController(), ah2).a(true);
        this.B.a(this.getAdController().q(), ah2, af2);
        if (!this.getAndResetIsPrepared()) {
            this.a("Could not load ad on layout.");
        }
    }

    void a() {
        if (this.d()) {
            return;
        }
        long l2 = System.nanoTime();
        this.z.d("Initializing AdLayout.");
        this.A.a(this.d);
        this.setContentDescription((CharSequence)"adLayoutObject");
        if (this.isInEditMode()) {
            TextView textView = new TextView(this.d);
            textView.setText((CharSequence)"AdLayout");
            textView.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
            textView.setGravity(17);
            this.addView((View)textView);
            this.p = true;
            return;
        }
        boolean bl2 = this.getVisibility() == 0;
        this.c = bl2;
        this.setHorizontalScrollBarEnabled(false);
        this.setVerticalScrollBarEnabled(false);
        this.p = true;
        if (this.x == null) {
            this.setListener(null);
        }
        this.v();
        if (this.c()) {
            this.z.b(cy.a.b, "Disabling ads. Local cache file is inaccessible so ads will fail if we try to create a WebView. Details of this Android bug found at: http://code.google.com/p/android/issues/detail?id=10789", new Object[0]);
            this.p = false;
            return;
        }
        this.g.e().b(cv.a.r, l2);
        this.g.e().c(cv.a.r);
    }

    public boolean a(ah ah2) {
        if (ah2 == null) {
            ah2 = new ah();
        }
        this.n = ah2;
        if (this.getNeedsToLoadAdOnLayout()) {
            this.z.f("Can't load an ad because an ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad.");
            return false;
        }
        this.a();
        if (!this.d()) {
            this.z.f("The ad could not be initialized properly.");
            return false;
        }
        if (!this.A()) {
            switch (4.a[this.getAdController().h().ordinal()]) {
                default: {
                    this.z.f("Can't load an ad because an ad is currently loading or already loaded. Please wait for the ad to finish loading or showing before loading another ad.");
                    return false;
                }
                case 3: {
                    this.z.f("An ad could not be loaded because another ad is currently expanded.");
                    return false;
                }
                case 2: {
                    this.z.f("An ad could not be loaded because the AdLayout has been destroyed.");
                    return false;
                }
                case 1: 
            }
            if (this.getAdController().M()) {
                this.getAdController().a(ag.a);
                this.getAdController().I();
                return this.a(ah2);
            }
            this.z.f("An ad could not be loaded because of an unknown issue with the web views.");
            return false;
        }
        if (this.getAdController().h().equals((Object)ag.g)) {
            this.getAdController().e().c(cv.a.q);
        }
        this.C.set(false);
        t t2 = this.B;
        int n2 = this.getAdController().q();
        af[] arraf = new af[]{new af(this.getAdController(), ah2)};
        t2.a(n2, ah2, arraf);
        if (this.getNeedsToLoadAdOnLayout()) {
            return true;
        }
        return this.getAndResetIsPrepared();
    }

    boolean a(boolean bl2) {
        if (bl2) {
            this.z.d("Skipping ad layout preparation steps because the layout is already prepared.");
            return true;
        }
        if (!this.A()) {
            return false;
        }
        if (this.getNeedsToLoadAdOnLayout()) {
            this.z.f("Can't load an ad because an ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad.");
            return false;
        }
        if (this.getAdSize().b()) {
            this.z.d("Ad size to be determined automatically.");
        }
        this.n();
        if (this.getAdSize().b() && this.getAdController().w()) {
            return true;
        }
        if (this.isLayoutRequested() && this.getAdSize().b() && !this.m()) {
            this.j();
            return false;
        }
        if (this.m()) {
            this.z.d("The ad's parent view is missing at load time.");
            return this.C();
        }
        this.D();
        return true;
    }

    int b(boolean bl2) {
        int n2 = bl2 ? this.getLayoutParams().width : this.getLayoutParams().height;
        if (n2 == -1) {
            if (this.q()) {
                return this.c(bl2);
            }
            return this.e(bl2);
        }
        if (n2 == -2) {
            return 0;
        }
        return n2;
    }

    i b() {
        return new a();
    }

    int c(boolean bl2) {
        WindowManager windowManager = (WindowManager)this.d.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        if (bl2) {
            return displayMetrics.widthPixels;
        }
        return displayMetrics.heightPixels;
    }

    boolean c() {
        return true ^ this.getAdController().J();
    }

    boolean d() {
        return this.p;
    }

    boolean d(boolean bl2) {
        return this.k.getAndSet(bl2);
    }

    int e(boolean bl2) {
        if (bl2) {
            return this.m.getWidth();
        }
        return this.m.getHeight();
    }

    public boolean e() {
        return this.a(new ah());
    }

    public boolean f() {
        return this.getAdController().h().equals((Object)ag.g);
    }

    void g() {
        this.getAdController().P();
    }

    l getAdData() {
        return this.getAdController().p();
    }

    r getAdListenerExecutor() {
        return this.x;
    }

    public ae getAdSize() {
        j j2 = this.getAdController();
        if (j2 == null) {
            return null;
        }
        return j2.r();
    }

    boolean getAndResetIsPrepared() {
        return this.getAdController().n();
    }

    cy getLogger() {
        return this.z;
    }

    boolean getNeedsToLoadAdOnLayout() {
        return this.k.get();
    }

    public int getTimeout() {
        if (this.getAdController() == null) {
            return -1;
        }
        return this.getAdController().q();
    }

    void h() {
        b.a(this);
    }

    void i() {
        if (this.getLayoutParams().width == -1 || this.getLayoutParams().height == -1) {
            this.z.d("The requested ad will scale based on the screen's dimensions because at least one AdLayout dimension is set to MATCH_PARENT but the AdLayout is currently missing a fixed-size parent view.");
        }
        this.D();
    }

    void j() {
        this.setNeedsToLoadAdOnLayout(true);
        this.k();
    }

    void k() {
        Runnable runnable = new Runnable(this){
            final /* synthetic */ p a;
            {
                this.a = p2;
            }

            public void run() {
                this.a.l();
            }
        };
        v.schedule(runnable, (long)this.getTimeout(), TimeUnit.MILLISECONDS);
    }

    void l() {
        if (this.d(false)) {
            cv.a().b().a(cv.a.M);
            this.a("Can't load an ad because the view size cannot be determined.");
        }
    }

    boolean m() {
        return this.l;
    }

    void n() {
        boolean bl2 = this.getParent() == null;
        this.l = bl2;
    }

    void o() {
        Activity activity = bm.a(this.d);
        if (activity == null) {
            this.z.f("unable to set activity root view because the context did not contain an activity");
            return;
        }
        this.m = activity.getWindow().getDecorView().findViewById(16908290).getRootView();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isInEditMode()) {
            return;
        }
        this.i = true;
        this.w();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
        this.x();
    }

    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        if (this.o) {
            return;
        }
        int n6 = n4 - n2;
        int n7 = n5 - n3;
        super.onLayout(bl2, n2, n3, n4, n5);
        if (this.isInEditMode()) {
            return;
        }
        this.getAdController().a(n6, n7);
        if (this.d(false)) {
            this.z();
        }
    }

    protected void onWindowVisibilityChanged(int n2) {
        if (this.i && this.j != n2) {
            if (n2 != 0) {
                this.c = false;
                this.y();
                this.x();
                return;
            }
            if (n2 == 0) {
                this.c = true;
            }
        }
    }

    boolean p() {
        return this.m.isLayoutRequested();
    }

    boolean q() {
        return this.m == null;
    }

    public boolean r() {
        if (this.getAdController() == null) {
            return false;
        }
        return this.getAdController().h().equals((Object)ag.b);
    }

    public boolean s() {
        if (this.C.get()) {
            this.z.e("This banner ad has expired. Please load another ad.");
            return false;
        }
        if (this.B()) {
            if (this.getAdController().M()) {
                this.z.e("This banner ad has expired. Please load another ad.");
                return false;
            }
            if (this.getAdController().O()) {
                bq bq2;
                if (!this.q) {
                    this.getAdController().e().c(cv.a.o);
                }
                this.getAdController().e().b(cv.a.p);
                View view = this.r;
                if (view != null) {
                    this.removeView(view);
                }
                if ((bq2 = this.s) != null) {
                    bq2.b();
                }
                this.r = this.getAdController().z();
                this.s = this.getAdController().A();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
                this.addView(this.r, (ViewGroup.LayoutParams)layoutParams);
                this.getAdController().e().b(cv.a.q);
                this.g();
                return true;
            }
            this.z.e("Banner ad could not be shown.");
            return false;
        }
        if (this.r()) {
            this.z.e("The banner ad cannot be shown because it is still loading.");
            return false;
        }
        if (this.f()) {
            this.z.e("The banner ad cannot be shown because it is already showing.");
            return false;
        }
        if (this.A()) {
            this.z.e("The banner ad cannot be shown because it has not loaded successfully.");
            return false;
        }
        this.z.e("A banner ad is not ready to show.");
        return false;
    }

    void setIsParentViewMissingAtLoadTime(boolean bl2) {
        this.l = bl2;
    }

    public void setListener(q q2) {
        if (q2 == null) {
            q2 = new bo(a);
        }
        this.x = this.w.a(q2);
    }

    void setMaxWidth(int n2) {
        if (this.g != null) {
            this.z.e("The maximum width cannot be changed because this ad has already been initialized. Max width should be set immediately after construction of the Ad object.");
            return;
        }
        this.e = this.e.a(n2);
    }

    void setNeedsToLoadAdOnLayout(boolean bl2) {
        this.k.set(bl2);
    }

    void setShouldDisableWebViewHardwareAcceleration(boolean bl2) {
        this.u = bl2;
        j j2 = this.g;
        if (j2 != null) {
            j2.a(this.u);
        }
    }

    public void setTimeout(int n2) {
        j j2 = this.getAdController();
        if (j2 != null) {
            j2.a(n2);
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        this.u();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        this.u();
    }

    public void setX(float f2) {
        super.setX(f2);
        this.u();
    }

    public void setY(float f2) {
        super.setY(f2);
        this.u();
    }

    public void t() {
        this.q = true;
    }

    class a
    implements i {
        a() {
        }

        @SuppressLint(value={"InlinedApi"})
        @Override
        public void a() {
            if (p.this.q) {
                if (p.this.s()) {
                    r r2 = p.this.getAdListenerExecutor();
                    p p2 = p.this;
                    r2.a((e)p2, p2.t);
                    return;
                }
            } else {
                p.this.getAdController().e().b(cv.a.o);
                p.this.z.d("Ad is ready to show. Please call showAd to display it.");
                r r3 = p.this.getAdListenerExecutor();
                p p3 = p.this;
                r3.a((e)p3, p3.t);
            }
        }

        @Override
        public void a(m m2) {
            if (m.a.b.equals((Object)m2.a())) {
                p.this.g = null;
            }
            p.this.getAdListenerExecutor().a((e)p.this, m2);
        }

        @Override
        public void a(n n2) {
            this.b(n2);
        }

        @Override
        public void a(x x2) {
            p.this.t = x2;
            p.this.getAdController().L();
        }

        @Override
        public boolean a(boolean bl2) {
            return p.this.a(bl2);
        }

        @Override
        public void b() {
        }

        boolean b(n n2) {
            switch (4.b[n2.a().ordinal()]) {
                default: {
                    return false;
                }
                case 3: {
                    Rect rect = (Rect)n2.b().a("positionOnScreen");
                    p.this.getAdListenerExecutor().a((e)p.this, rect);
                    return true;
                }
                case 2: {
                    p.this.getAdListenerExecutor().b(p.this);
                    return true;
                }
                case 1: 
            }
            p.this.getAdListenerExecutor().a(p.this);
            return true;
        }

        @Override
        public int c() {
            if (p.this.getAdController().h().equals((Object)ag.h)) {
                return 0;
            }
            return 2;
        }

        @Override
        public void d() {
            p.this.getAdController().e().a(cv.a.ai);
            p.this.C.set(true);
            p.this.g = null;
            p.this.getAdListenerExecutor().d(p.this);
        }
    }

}

