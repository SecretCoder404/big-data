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
import com.mobond.mindicator.ui.bus.DestinationSearchUI;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mulo.a.a.a;
import java.util.ArrayList;

public class DestinationSearchUI
extends e {
    String N = null;
    String O = null;
    private String P;
    private String Q;

    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        String string = this.a((int)n2).i;
        Intent intent = new Intent();
        intent.putExtra("bus_stop2", string);
        String string2 = this.N;
        if (string2 != null && !string2.equals((Object)"")) {
            intent.putExtra("bus_stop1", this.N);
        }
        this.setResult(-1, intent);
        this.finish();
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
        this.a("ca-app-pub-5449278086868932/9453592041", "167101606757479_1239839279483701", "ca-app-pub-5449278086868932/3131909501", "167101606757479_1235752933225669", 2);
        super.onCreate(bundle);
        this.P = this.getIntent().getStringExtra("bus_route_id_key");
        this.Q = this.getIntent().getStringExtra("bus_route_text_key");
        Bundle bundle2 = this.getIntent().getExtras();
        if (bundle2 != null && bundle2.containsKey("bus_stop1")) {
            this.N = bundle2.getString("bus_stop1");
        }
        if (bundle2 != null && bundle2.containsKey("bus_stop2")) {
            this.O = bundle2.getString("bus_stop2");
        }
        String[] arrstring = a.a((Context)this, ConfigurationManager.b(this.getApplicationContext()), this.P, ConfigurationManager.a((Context)this), "A:T:20210102").c();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            d d2 = new d();
            int n2 = arrstring[i2].indexOf(58);
            if (n2 != -1) {
                d2.b = arrstring[i2].substring(0, n2);
                d2.c = arrstring[i2].substring(n2 + 1, arrstring[i2].length()).trim();
                d2.i = arrstring[i2];
            } else {
                d2.b = arrstring[i2];
                d2.c = this.P.compareToIgnoreCase("BEST") == 0 ? arrstring[i2] : "";
                d2.i = arrstring[i2];
            }
            this.e.add((Object)d2);
        }
        this.e();
        this.b("Select Destination Stop");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  (");
        stringBuilder.append(this.Q);
        stringBuilder.append(")");
        this.c(stringBuilder.toString());
        this.h(18);
        this.e(2131230852);
        this.f(2131230908);
        this.a("Search destination stop");
    }

    protected void onStart() {
        super.onStart();
        this.findViewById(2131297274).performClick();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final /* synthetic */ DestinationSearchUI a;
            {
                this.a = destinationSearchUI;
            }

            public void run() {
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)this.a.b, 1);
            }
        }, 100L);
    }
}

