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

public class BusStopBusNumbersUI
extends e {
    String N = null;
    String O = null;
    String P;
    private String Q;
    private String R;
    private String S = null;

    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        Intent intent = new Intent(view.getContext(), BusRouteUI.class);
        intent.putExtra("bus_route_id_key", this.Q);
        intent.putExtra("bus_route_text_key", this.R);
        intent.putExtra("bus_number", this.a((int)n2).b);
        String string = this.S;
        if (string != null) {
            intent.putExtra("busstopuserstanding", string);
        }
        this.startActivityForResult(intent, 0);
    }

    public void onBackPressed() {
        String string;
        Intent intent = new Intent();
        String string2 = this.N;
        if (string2 != null && !string2.equals((Object)"")) {
            intent.putExtra("bus_stop1", this.N);
        }
        if ((string = this.O) != null && !string.equals((Object)"")) {
            intent.putExtra("bus_stop2", this.O);
        }
        this.setResult(-1, intent);
        this.finish();
        super.onBackPressed();
    }

    @Override
    public void onCreate(Bundle bundle) {
        String string;
        String string2;
        this.a("ca-app-pub-5449278086868932/3407058446", "167101606757479_1239839569483672", "ca-app-pub-5449278086868932/5730152689", "167101606757479_1235752523225710", 3);
        super.onCreate(bundle);
        Bundle bundle2 = this.getIntent().getExtras();
        this.Q = this.getIntent().getStringExtra("bus_route_id_key");
        this.R = this.getIntent().getStringExtra("bus_route_text_key");
        if (bundle2 != null && bundle2.containsKey("bus_stop1")) {
            this.N = bundle2.getString("bus_stop1");
        }
        if (bundle2 != null && bundle2.containsKey("bus_stop2")) {
            this.O = bundle2.getString("bus_stop2");
        }
        if (bundle2 != null && (string = this.N) != null && (string2 = this.O) != null && string.equals((Object)string2)) {
            this.S = this.N;
        }
        String[] arrstring = a.a((Context)this, this.P, this.Q, ConfigurationManager.a((Context)this), "A:T:20210102").a(this.N, this.O);
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            d d2 = new d();
            int n2 = arrstring[i2].indexOf(35);
            d2.b = arrstring[i2].substring(0, n2);
            d2.c = arrstring[i2].substring(n2 + 1, arrstring[i2].length());
            d2.i = arrstring[i2];
            this.e.add((Object)d2);
        }
        this.e();
        this.j();
        int n3 = this.N.indexOf(58);
        String string3 = this.N;
        if (n3 != -1) {
            string3 = string3.substring(0, n3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.R);
        stringBuilder.append(" - Select Bus Number\nAt Stop: ");
        stringBuilder.append(string3);
        this.b(stringBuilder.toString());
        this.b("Buses on stop");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("  (");
        stringBuilder2.append(this.R);
        stringBuilder2.append(")");
        this.c(stringBuilder2.toString());
        this.e(2131230858);
        this.h();
    }
}

