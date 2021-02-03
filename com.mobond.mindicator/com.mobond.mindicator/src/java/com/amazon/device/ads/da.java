/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.RelativeLayout;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.al;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bu;
import com.amazon.device.ads.bv;
import com.amazon.device.ads.cb;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cq;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.da;
import com.amazon.device.ads.dg;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.ef;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.eq;
import com.amazon.device.ads.h;
import com.amazon.device.ads.k;
import com.amazon.device.ads.n;
import org.json.JSONObject;

class da
implements AdActivity.b {
    private static final String a = "da";
    private final cy b;
    private final al c;
    private final co.a d;
    private final bc e;
    private final cq f;
    private final eq g;
    private Activity h;
    private h i;
    private ViewGroup j;
    private ViewGroup k;
    private String l;
    private final bv m;
    private final dg n;
    private ef o;

    public da() {
        this(new cz(), new al(), new co.a(), new bv(), new dg(), new bc(), new cq(), new eq());
    }

    da(cz cz2, al al2, co.a a2, bv bv2, dg dg2, bc bc2, cq cq2, eq eq2) {
        this.b = cz2.a(a);
        this.c = al2;
        this.d = a2;
        this.m = bv2;
        this.n = dg2;
        this.e = bc2;
        this.f = cq2;
        this.g = eq2;
    }

    static /* synthetic */ ViewGroup a(da da2) {
        return da2.j;
    }

    private ef a(bv bv2) {
        cy cy2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expanding Ad to ");
        stringBuilder.append(bv2.a());
        stringBuilder.append("x");
        stringBuilder.append(bv2.b());
        cy2.d(stringBuilder.toString());
        return new ef(this.c.b(bv2.a()), this.c.b(bv2.b()));
    }

    static /* synthetic */ ef a(da da2, ef ef2) {
        da2.o = ef2;
        return ef2;
    }

    static /* synthetic */ eq b(da da2) {
        return da2.g;
    }

    static /* synthetic */ h c(da da2) {
        return da2.i;
    }

    static /* synthetic */ ef d(da da2) {
        return da2.o;
    }

    private void i() {
        this.j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this){
            final /* synthetic */ da a;
            {
                this.a = da2;
            }

            public void onGlobalLayout() {
                da.b(this.a).a(da.a(this.a).getViewTreeObserver(), this);
                com.amazon.device.ads.dk dk2 = da.c(this.a).g();
                if (dk2 == null) {
                    return;
                }
                ef ef2 = dk2.a();
                if (ef2 != null && !ef2.equals(da.d(this.a))) {
                    da.a(this.a, ef2);
                    h h2 = da.c(this.a);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("mraidBridge.sizeChange(");
                    stringBuilder.append(ef2.a());
                    stringBuilder.append(",");
                    stringBuilder.append(ef2.b());
                    stringBuilder.append(");");
                    h2.a(stringBuilder.toString());
                }
            }
        });
    }

    private void j() {
        if (this.i.l()) {
            if (!this.i.m()) {
                return;
            }
            Activity activity = this.h;
            if (activity == null) {
                this.b.f("unable to handle orientation property change because the context did not contain an activity");
                return;
            }
            int n2 = activity.getRequestedOrientation();
            cy cy2 = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Current Orientation: ");
            stringBuilder.append(n2);
            cy2.d(stringBuilder.toString());
            switch (2.a[this.n.b().ordinal()]) {
                default: {
                    break;
                }
                case 2: {
                    this.h.setRequestedOrientation(6);
                    break;
                }
                case 1: {
                    this.h.setRequestedOrientation(7);
                }
            }
            if (cb.c.equals((Object)this.n.b())) {
                if (this.n.a().booleanValue()) {
                    this.h.setRequestedOrientation(-1);
                } else {
                    Activity activity2 = this.h;
                    activity2.setRequestedOrientation(bu.a((Context)activity2, this.e));
                }
            }
            int n3 = this.h.getRequestedOrientation();
            cy cy3 = this.b;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("New Orientation: ");
            stringBuilder2.append(n3);
            cy3.d(stringBuilder2.toString());
            if (n3 != n2) {
                this.i();
            }
            return;
        }
    }

    private void k() {
        if (this.l != null) {
            this.i.a();
        }
        ef ef2 = this.a(this.m);
        this.l();
        this.i.a(this.k, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1), true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ef2.a(), ef2.b());
        layoutParams.addRule(13);
        this.j.addView((View)this.k, (ViewGroup.LayoutParams)layoutParams);
        this.h.setContentView((View)this.j, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1));
        this.i.a(true ^ this.m.c());
    }

    private void l() {
        this.j = this.f.a((Context)this.h, cq.a.a, "expansionView");
        this.k = this.f.a((Context)this.h, cq.a.c, "adContainerView");
    }

    private void m() {
        if (!this.h.isFinishing()) {
            this.i = null;
            this.h.finish();
        }
    }

    @Override
    public void a() {
        this.h.requestWindowFeature(1);
        this.h.getWindow().setFlags(1024, 1024);
        bd.a(this.e, this.h);
    }

    @Override
    public void a(Activity activity) {
        this.h = activity;
    }

    @Override
    public void a(Configuration configuration) {
        this.i();
    }

    @Override
    public void b() {
        Intent intent = this.h.getIntent();
        String string = intent.getStringExtra("url");
        if (!eh.b(string)) {
            this.l = string;
        }
        JSONObject jSONObject = this.d.a(intent.getStringExtra("expandProperties"));
        this.m.a(jSONObject);
        if (this.l != null) {
            this.m.a(-1);
            this.m.b(-1);
        }
        JSONObject jSONObject2 = this.d.a(intent.getStringExtra("orientationProperties"));
        this.n.a(jSONObject2);
        bd.a(this.e, this.h.getWindow());
        h h2 = this.i = k.b();
        if (h2 == null) {
            this.b.f("Failed to show expanded ad due to an error in the Activity.");
            this.h.finish();
            return;
        }
        h2.a(this.h);
        this.i.a(new a());
        this.k();
        this.j();
        this.i.a(new n(n.a.a));
        this.i.a("mraidBridge.stateChange('expanded');");
        this.i();
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }

    @Override
    public void f() {
        h h2;
        if (this.h.isFinishing() && (h2 = this.i) != null) {
            h2.c();
        }
    }

    @Override
    public void g() {
        h h2 = this.i;
        if (h2 != null) {
            h2.c();
        }
    }

    @Override
    public boolean h() {
        h h2 = this.i;
        if (h2 != null) {
            return h2.x();
        }
        return false;
    }

    private class a
    implements dt {
        private a() {
        }

        @Override
        public void a(ds ds2, h h2) {
            if (ds2.a().equals((Object)ds.a.f)) {
                da.this.m();
            }
        }
    }

}

