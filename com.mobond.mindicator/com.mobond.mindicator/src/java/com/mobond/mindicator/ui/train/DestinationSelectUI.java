/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.l;
import com.mulo.a.d.b;
import com.mulo.a.d.g;
import com.mulo.util.e;
import java.util.Vector;

public class DestinationSelectUI
extends l {
    String[] A;
    SharedPreferences B;
    String C;

    @Override
    public void a() {
    }

    @Override
    public void a(View view, String string, int n2) {
        Intent intent = new Intent();
        if (this.getIntent().hasExtra("source_stn")) {
            intent.putExtra("source_stn", this.getIntent().getStringExtra("source_stn"));
        }
        if (this.getIntent().hasExtra("selected_time")) {
            intent.putExtra("selected_time", this.getIntent().getStringExtra("selected_time"));
        }
        intent.putExtra("destination_stn", string.toUpperCase());
        this.setResult(-1, intent);
        this.finish();
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/4212480449", "167101606757479_1239839152817047", "ca-app-pub-5449278086868932/7915841632", "167101606757479_1235756893225273", 0);
        super.onCreate(bundle);
        this.B = this.getSharedPreferences("m-indicator", 0);
        this.C = this.B.getString("city", "mumbai");
        g.a((Activity)this, this.C, ConfigurationManager.a((Context)this));
        Vector<String> vector = this.getIntent().getExtras().getBoolean("type_fastest_route", false) ? b.a(this, "local/sdr") : g.a((Activity)this, this.C, ConfigurationManager.a((Context)this));
        String string = this.getIntent().getExtras().getString("last_station_1");
        String string2 = this.getIntent().getExtras().getString("last_station_2");
        String string3 = this.getIntent().getExtras().getString("last_station_3");
        String string4 = this.getIntent().getExtras().getString("last_station_4");
        Vector vector2 = (Vector)vector.clone();
        if (string4 != null) {
            vector2.add(0, (Object)string4);
            this.j = 1 + this.j;
        }
        if (string3 != null) {
            vector2.add(0, (Object)string3);
            this.j = 1 + this.j;
        }
        if (string2 != null) {
            vector2.add(0, (Object)string2);
            this.j = 1 + this.j;
        }
        int n2 = 0;
        if (string != null) {
            vector2.add(0, (Object)string);
            this.j = 1 + this.j;
        }
        while (n2 < vector2.size()) {
            String string5 = (String)vector2.elementAt(n2);
            vector2.removeElementAt(n2);
            vector2.add(n2, (Object)e.a(string5, null));
            ++n2;
        }
        this.A = new String[vector2.size()];
        vector2.toArray((Object[])this.A);
        this.a(this.A);
    }
}

