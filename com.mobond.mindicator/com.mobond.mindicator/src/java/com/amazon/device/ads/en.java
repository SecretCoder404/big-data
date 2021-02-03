/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.am;

class en
implements AdActivity.b {
    private RelativeLayout a;
    private am b;
    private Activity c;

    private void a(Bundle bundle) {
        this.b = new am((Context)this.c);
        this.b.a(bundle.getString("url"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.b.a((ViewGroup.LayoutParams)layoutParams);
        this.b.a((ViewGroup)this.a);
        this.a(this.b);
    }

    private void a(am am2) {
        am2.a(new am.a(){

            @Override
            public void a() {
                en.this.c.finish();
            }

            @Override
            public void b() {
                en.this.c.finish();
            }
        });
    }

    @Override
    public void a() {
        this.c.requestWindowFeature(1);
    }

    @Override
    public void a(Activity activity) {
        this.c = activity;
    }

    @Override
    public void a(Configuration configuration) {
    }

    @Override
    public void b() {
        Bundle bundle = this.c.getIntent().getExtras();
        this.a = new RelativeLayout((Context)this.c);
        this.a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.c.setContentView((View)this.a);
        this.a(bundle);
        this.b.a();
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
        am am2 = this.b;
        if (am2 != null) {
            am2.c();
            this.b = null;
        }
        this.c.finish();
    }

    @Override
    public void g() {
        am am2 = this.b;
        if (am2 != null) {
            am2.c();
            this.b = null;
        }
        this.c.finish();
    }

    @Override
    public boolean h() {
        return false;
    }

}

