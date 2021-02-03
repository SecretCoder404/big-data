/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.os.Bundle
 *  android.os.Handler
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import com.mobond.mindicator.ui.j;

public class i
extends Activity
implements j {
    public Handler r;
    public ProgressDialog s;

    @Override
    public void a(ProgressDialog progressDialog) {
        this.s = progressDialog;
    }

    @Override
    public ProgressDialog k() {
        return this.s;
    }

    @Override
    public Handler l() {
        return this.r;
    }

    @Override
    public Activity m() {
        return this;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r = new Handler();
    }
}

