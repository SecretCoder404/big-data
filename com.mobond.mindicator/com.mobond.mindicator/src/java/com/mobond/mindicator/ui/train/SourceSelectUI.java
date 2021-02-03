/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.l;
import com.mulo.a.d.b;
import com.mulo.a.d.g;
import com.mulo.util.e;
import java.util.Vector;

public class SourceSelectUI
extends l {
    String[] A;
    SharedPreferences B;
    String C;

    @Override
    public void a() {
    }

    @Override
    public void a(View view, String string, int n2) {
        String[] arrstring;
        for (int i2 = 0; i2 < (arrstring = this.A).length && !arrstring[i2].equals((Object)string); ++i2) {
        }
        Intent intent = new Intent();
        intent.putExtra("source_stn", string);
        this.setResult(-1, intent);
        this.finish();
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/1618940842", "167101606757479_1239839079483721", "ca-app-pub-5449278086868932/4916953830", "167101606757479_1235757683225194", 0);
        super.onCreate(bundle);
        this.B = this.getSharedPreferences("m-indicator", 0);
        this.C = this.B.getString("city", "mumbai");
        Vector<String> vector = this.getIntent().getExtras().getBoolean("type_fastest_route", false) ? b.a(this, "local/sdr") : g.a((Activity)this, this.C, ConfigurationManager.a((Context)this));
        String string = this.getIntent().getExtras().getString("last_station_1");
        String string2 = this.getIntent().getExtras().getString("last_station_2");
        String string3 = this.getIntent().getExtras().getString("last_station_3");
        String string4 = this.getIntent().getExtras().getString("last_station_4");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ddd laststation1:");
        stringBuilder.append(string);
        Log.d((String)"ddd", (String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("ddd laststation2:");
        stringBuilder2.append(string2);
        Log.d((String)"ddd", (String)stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("ddd laststation2:");
        stringBuilder3.append(string3);
        Log.d((String)"ddd", (String)stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("ddd laststation2:");
        stringBuilder4.append(string4);
        Log.d((String)"ddd", (String)stringBuilder4.toString());
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

