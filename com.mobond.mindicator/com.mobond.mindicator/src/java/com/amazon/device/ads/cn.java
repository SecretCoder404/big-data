/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.res.Configuration
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.Window
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.cm;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.h;
import com.amazon.device.ads.j;
import com.amazon.device.ads.k;

@SuppressLint(value={"NewApi"})
class cn
implements AdActivity.b {
    private static final String a = "cn";
    private final cy b = new cz().a(a);
    private final bc c = new bc();
    private Activity d = null;
    private j e;

    cn() {
    }

    private void j() {
        if (!this.d.isFinishing()) {
            this.e = null;
            this.d.finish();
        }
    }

    @Override
    public void a() {
        this.d.requestWindowFeature(1);
        this.d.getWindow().setFlags(1024, 1024);
        bd.a(this.c, this.d);
    }

    @Override
    public void a(Activity activity) {
        this.d = activity;
    }

    @Override
    public void a(Configuration configuration) {
    }

    @Override
    public void b() {
        bd.a(this.c, this.d.getWindow());
        j j2 = this.e = this.i();
        if (j2 == null) {
            this.b.f("Failed to show interstitial ad due to an error in the Activity.");
            cm.a();
            this.d.finish();
            return;
        }
        j2.a(this.d);
        this.e.a(new a());
        ViewGroup viewGroup = (ViewGroup)this.e.z().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.e.z());
        }
        this.d.setContentView(this.e.z());
        this.e.P();
    }

    @Override
    public void c() {
        j j2 = this.e;
        if (j2 != null) {
            j2.T();
        }
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
        j j2 = this.e;
        if (j2 != null) {
            j2.T();
        }
    }

    @Override
    public void f() {
        j j2;
        if (this.d.isFinishing() && (j2 = this.e) != null) {
            j2.T();
            this.e.U();
        }
    }

    @Override
    public void g() {
        j j2 = this.e;
        if (j2 != null) {
            j2.T();
            this.e.U();
        }
    }

    @Override
    public boolean h() {
        j j2 = this.e;
        if (j2 != null) {
            return j2.Z();
        }
        return false;
    }

    j i() {
        return k.a();
    }

    class a
    implements dt {
        a() {
        }

        @Override
        public void a(ds ds2, h h2) {
            if (ds2.a().equals((Object)ds.a.f)) {
                cn.this.j();
            }
        }
    }

}

