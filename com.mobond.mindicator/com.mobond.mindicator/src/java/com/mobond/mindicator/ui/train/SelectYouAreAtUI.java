/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.l;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mulo.a.d.h;
import com.mulo.b.e;

public class SelectYouAreAtUI
extends l {
    String A;
    String B;
    b C;

    @Override
    public void a() {
    }

    @Override
    public void a(View view, String string, int n2) {
        Intent intent = new Intent(view.getContext(), TrainsAtStationUI.class);
        intent.putExtra("selected_route", this.getIntent().getExtras().getString("selected_route"));
        intent.putExtra("selected_direction", this.getIntent().getExtras().getInt("selected_direction"));
        intent.putExtra("you_are_at", string);
        intent.putExtra("selected_direction_end_stations", this.B);
        String string2 = e.a(view.getContext());
        if (string2 != null) {
            b b2 = a.a((Activity)this);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("locid_");
            stringBuilder.append(string2);
            b2.b(stringBuilder.toString(), string);
        }
        this.startActivityForResult(intent, 0);
    }

    @Override
    public void onCreate(Bundle bundle) {
        int n2;
        String string;
        super.onCreate(bundle);
        this.C = a.a((Activity)this);
        this.A = this.C.a("city", "mumbai");
        this.i = true;
        String string2 = this.getIntent().getExtras().getString("selected_route");
        this.a("ca-app-pub-5449278086868932/1011995242", "167101606757479_1239838986150397", "ca-app-pub-5449278086868932/4134355207", "167101606757479_1235758116558484", 3);
        int n3 = this.getIntent().getExtras().getInt("selected_direction");
        this.B = this.getIntent().getExtras().getString("selected_direction_end_stations");
        String[] arrstring = h.a(string2, n3, (Object)this);
        if (e.a() != null) {
            for (n2 = 0; n2 < arrstring.length; ++n2) {
                if (!e.a().equals((Object)arrstring[n2])) {
                    continue;
                }
                break;
            }
        } else {
            n2 = -1;
        }
        if (e.a != null) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                if (!e.a.equals((Object)arrstring[i2])) continue;
                n2 = i2;
                break;
            }
        }
        if (e.a() == null && e.a == null && (string = e.a((Context)this)) != null) {
            b b2 = a.a((Activity)this);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("locid_");
            stringBuilder.append(string);
            String string3 = b2.b(stringBuilder.toString());
            if (string3 != null) {
                for (int i3 = 0; i3 < arrstring.length; ++i3) {
                    if (!string3.equals((Object)arrstring[i3])) continue;
                    n2 = i3;
                    break;
                }
            }
        }
        this.a(arrstring);
        if (n2 != -1) {
            this.h = true;
            int n4 = n2 - 2;
            if (n4 < 0) {
                n4 = 0;
            }
            this.c(n4);
            this.g = n2;
        }
        this.a(this.getString(2131755558));
    }
}

