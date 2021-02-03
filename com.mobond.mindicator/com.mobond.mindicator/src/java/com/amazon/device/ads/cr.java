/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.util.Log;
import com.amazon.device.ads.cs;

class cr
implements cs {
    private String a;

    cr() {
    }

    public cr a(String string) {
        this.a = string;
        return this;
    }

    @Override
    public void b(String string) {
        Log.i((String)this.a, (String)string);
    }

    @Override
    public void c(String string) {
        Log.v((String)this.a, (String)string);
    }

    @Override
    public void d(String string) {
        Log.d((String)this.a, (String)string);
    }

    @Override
    public void e(String string) {
        Log.w((String)this.a, (String)string);
    }

    @Override
    public void f(String string) {
        Log.e((String)this.a, (String)string);
    }

    @Override
    public /* synthetic */ cs g(String string) {
        return this.a(string);
    }
}

