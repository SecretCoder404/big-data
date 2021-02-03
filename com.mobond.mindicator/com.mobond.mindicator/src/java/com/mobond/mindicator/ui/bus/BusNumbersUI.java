/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ListView
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.bus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.bus.BusRouteUI;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mulo.a.a.a;
import java.util.ArrayList;

public class BusNumbersUI
extends e {
    boolean N = false;
    private String O;
    private String P;

    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        Intent intent = new Intent(view.getContext(), BusRouteUI.class);
        intent.putExtra("bus_route_id_key", this.O);
        intent.putExtra("bus_route_text_key", this.P);
        intent.putExtra("bus_number", this.a((int)n2).b);
        this.startActivityForResult(intent, 0);
    }

    public void button1Action(View view) {
        for (int i2 = 0; i2 < this.b(); ++i2) {
            if (!this.a((int)i2).b.startsWith("A")) continue;
            this.i(i2);
            return;
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/3407058446", "167101606757479_1239839569483672", "ca-app-pub-5449278086868932/5730152689", "167101606757479_1235752523225710", 3);
        super.onCreate(bundle);
        this.O = this.getIntent().getStringExtra("bus_route_id_key");
        this.P = this.getIntent().getStringExtra("bus_route_text_key");
        String[] arrstring = a.a((Context)this, ConfigurationManager.b(this.getApplicationContext()), this.O, ConfigurationManager.a((Context)this), "A:T:20210102").b();
        this.a(true);
        this.b(true);
        this.a("Search Bus Number");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            d d2 = new d();
            int n2 = arrstring[i2].indexOf(35);
            d2.b = arrstring[i2].substring(0, n2);
            String[] arrstring2 = arrstring[i2].substring(n2 + 1, arrstring[i2].length()).split("\n");
            d2.c = arrstring2[0];
            d2.d = arrstring2[1];
            d2.i = arrstring[i2];
            this.e.add((Object)d2);
        }
        this.e();
        this.b("Select Bus Number");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  (");
        stringBuilder.append(this.P);
        stringBuilder.append(")");
        this.c(stringBuilder.toString());
        this.e(2131230858);
        this.g(2131230854);
        this.f();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}

