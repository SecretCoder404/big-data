/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package com.mobond.mindicator.ui.bus;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.FeedbackUI;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.bus.BusRouteUI;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mobond.mindicator.ui.n;
import com.mulo.a.a.a;
import com.mulo.b.j;
import com.mulo.util.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BusRouteUI
extends e {
    String N;
    String O;
    String P;
    String Q;
    int R;
    int S;
    int T;
    String[] U;
    private String V;
    private String W;

    @Override
    public void a() {
    }

    public void a(String[] arrstring) {
        List list = Arrays.asList((Object[])arrstring);
        Collections.reverse((List)list);
        (String[])list.toArray();
    }

    public void button1Action(View view) {
        Collections.reverse((List)this.e);
        this.e();
        n.e((Context)this, "Route reversed ");
    }

    public void button2Action(View view) {
        Log.d((String)"BusRouteUI", (String)"buton1Action called");
        Intent intent = new Intent(view.getContext(), FeedbackUI.class);
        intent.putExtra("feedbacktype", FeedbackUI.d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("App Version: v17.0.186 Eagle\nApp Build: A:T:20210102\nPhone Model: ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append("\nSDK: ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append("\nManufacturer: ");
        stringBuilder.append(Build.MANUFACTURER);
        stringBuilder.append("\n");
        stringBuilder.append(this.V);
        stringBuilder.append(" ");
        stringBuilder.append(this.N);
        intent.putExtra("info", stringBuilder.toString());
        this.startActivityForResult(intent, 0);
    }

    public void d(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://mobondhrd.appspot.com/acbustimings.jsp?&busnumber=");
        stringBuilder.append(j.a(string));
        stringBuilder.append("&isusingapi=false&time=");
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append("&city=");
        stringBuilder.append(ConfigurationManager.b(this.getApplicationContext()));
        stringBuilder.append("&authority=");
        stringBuilder.append(this.V);
        String string2 = com.mulo.b.e.a(stringBuilder.toString(), (Context)this);
        Intent intent = new Intent((Context)this, WebUI.class);
        g g2 = new g();
        com.mulo.util.e.a(g2.a(), g2);
        g2.a = string2;
        intent.putExtra("webuidatakey", g2.a());
        this.startActivity(intent);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/4883791647", "167101606757479_1239839862816976", "ca-app-pub-5449278086868932/4294137300", "167101606757479_1235752673225695", 3);
        super.onCreate(bundle);
        this.N = this.getIntent().getExtras().getString("bus_number");
        this.V = this.getIntent().getStringExtra("bus_route_id_key");
        this.W = this.getIntent().getStringExtra("bus_route_text_key");
        this.c(true);
        this.h(18);
        try {
            this.O = this.getIntent().getExtras().getString("bus_number_mark1");
            this.P = this.getIntent().getExtras().getString("bus_number_mark2");
        }
        catch (Exception exception) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mark1 ");
        stringBuilder.append(this.O);
        stringBuilder.append(" mark2 ");
        stringBuilder.append(this.P);
        Log.d((String)"marker", (String)stringBuilder.toString());
        this.V = this.getIntent().getStringExtra("bus_route_id_key");
        this.W = this.getIntent().getStringExtra("bus_route_text_key");
        this.U = a.a((Context)this, ConfigurationManager.b(this.getApplicationContext()), this.V, ConfigurationManager.a((Context)this), "A:T:20210102").a(this.N);
        if (this.O != null) {
            String[] arrstring;
            for (int i2 = 0; i2 < (arrstring = this.U).length; ++i2) {
                String string;
                String string2 = this.O;
                if (string2 != null && string2.equals((Object)arrstring[i2])) {
                    this.R = i2;
                }
                if ((string = this.P) == null || !string.equals((Object)this.U[i2])) continue;
                this.S = i2;
            }
            if (this.N.indexOf("RING") == -1 && this.S - this.R < 0) {
                this.a(this.U);
            }
        }
        for (int i3 = 0; i3 < this.U.length; ++i3) {
            String string;
            String string3;
            d d2 = new d();
            int n2 = this.U[i3].indexOf(58);
            if (n2 != -1) {
                d2.b = this.U[i3].substring(0, n2);
                String[] arrstring = this.U;
                d2.c = arrstring[i3].substring(n2 + 1, arrstring[i3].length());
                d2.i = this.U[i3];
            } else {
                d2.b = this.U[i3];
                d2.c = this.V.compareToIgnoreCase("BEST") == 0 ? this.U[i3] : "";
                d2.i = this.U[i3];
            }
            String string4 = this.O;
            if (string4 != null && string4.equals((Object)this.U[i3])) {
                d2.e = -256;
                this.R = i3;
            }
            if ((string = this.P) != null && string.equals((Object)this.U[i3])) {
                d2.e = -256;
                this.S = i3;
            }
            if ((string3 = this.Q) != null && string3.equals((Object)this.U[i3])) {
                d2.e = -256;
                this.T = i3;
            }
            this.e.add((Object)d2);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mark1pos ");
        stringBuilder2.append(this.R);
        stringBuilder2.append(" mark2pos ");
        stringBuilder2.append(this.S);
        stringBuilder2.append(" mark3pos ");
        stringBuilder2.append(this.T);
        Log.d((String)"marker", (String)stringBuilder2.toString());
        this.e();
        this.i(this.R);
        this.f = this.R;
        this.b(this.N);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("  (");
        stringBuilder3.append(this.W);
        stringBuilder3.append(")");
        this.c(stringBuilder3.toString());
        this.e(2131230858);
        this.a(0, 2131231263);
        this.b(0, 2131230980);
        this.c(true);
        this.g();
        this.getIntent().getExtras().containsKey("busstopuserstanding");
        this.findViewById(2131297509).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ BusRouteUI a;
            {
                this.a = busRouteUI;
            }

            public void onClick(View view) {
                BusRouteUI busRouteUI = this.a;
                busRouteUI.d(busRouteUI.N);
            }
        });
    }
}

