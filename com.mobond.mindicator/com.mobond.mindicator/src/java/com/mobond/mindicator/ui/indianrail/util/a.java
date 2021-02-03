/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.os.Handler
 *  java.lang.String
 */
package com.mobond.mindicator.ui.indianrail.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ui.j;
import com.mulo.b.i;

public class a
extends BaseAppCompatActivity
implements j {
    private ProgressDialog a;
    Handler o = new Handler();

    @Override
    public void a(ProgressDialog progressDialog) {
        this.d();
        this.a = progressDialog;
    }

    public void a(String string, String string2) {
        i.a((Context)this, string2, string);
    }

    public void d() {
        ProgressDialog progressDialog = this.a;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.a.dismiss();
        }
    }

    @Override
    public ProgressDialog k() {
        return this.a;
    }

    @Override
    public Handler l() {
        return this.o;
    }

    @Override
    public Activity m() {
        return this;
    }
}

