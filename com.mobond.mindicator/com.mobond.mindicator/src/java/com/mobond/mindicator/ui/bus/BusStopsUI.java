/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.widget.ListView
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.bus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ListView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.bus.BusStopBusNumbersUI;
import com.mobond.mindicator.ui.bus.BusStopsUI;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mulo.a.a.a;
import java.util.ArrayList;

public class BusStopsUI
extends e {
    String[] N = null;
    boolean O = false;
    private String P;
    private String Q;

    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        String string = this.a((int)n2).i;
        Intent intent = new Intent(view.getContext(), BusStopBusNumbersUI.class);
        intent.putExtra("bus_route_id_key", this.P);
        intent.putExtra("bus_route_text_key", this.Q);
        intent.putExtra("bus_stop1", string);
        intent.putExtra("bus_stop2", string);
        this.startActivityForResult(intent, 0);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/4317363979", "167101606757479_1239840156150280", "ca-app-pub-5449278086868932/2789483946", "167101606757479_1235753059892323", 2);
        super.onCreate(bundle);
        this.P = this.getIntent().getStringExtra("bus_route_id_key");
        this.Q = this.getIntent().getStringExtra("bus_route_text_key");
        this.N = a.a((Context)this, ConfigurationManager.b(this.getApplicationContext()), this.P, ConfigurationManager.a((Context)this), "A:T:20210102").c();
        for (int i2 = 0; i2 < this.N.length; ++i2) {
            d d2 = new d();
            int n2 = this.N[i2].indexOf(58);
            if (n2 != -1) {
                d2.b = this.N[i2].substring(0, n2);
                String[] arrstring = this.N;
                d2.c = arrstring[i2].substring(n2 + 1, arrstring[i2].length()).trim();
                d2.i = this.N[i2];
            } else {
                d2.b = this.N[i2];
                d2.c = this.P.compareToIgnoreCase("BEST") == 0 ? this.N[i2] : "";
                d2.i = this.N[i2];
            }
            this.e.add((Object)d2);
        }
        this.e();
        this.b("Select Bus Stop");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  (");
        stringBuilder.append(this.Q);
        stringBuilder.append(")");
        this.c(stringBuilder.toString());
        this.h(18);
        this.e(2131230852);
        this.f(2131230908);
        this.g(2131230853);
        this.a("Search Bus Stop");
    }

    protected void onStart() {
        super.onStart();
        if (!this.O) {
            this.O = true;
            this.findViewById(2131297274).performClick();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
                final /* synthetic */ BusStopsUI a;
                {
                    this.a = busStopsUI;
                }

                public void run() {
                    ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)this.a.b, 1);
                }
            }, 100L);
        }
    }
}

