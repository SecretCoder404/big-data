/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  androidx.appcompat.app.e
 *  androidx.core.app.a
 *  androidx.fragment.app.d
 *  androidx.fragment.app.j
 *  com.google.android.gms.maps.a
 *  com.google.android.gms.maps.b
 *  com.google.android.gms.maps.c
 *  com.google.android.gms.maps.c$a
 *  com.google.android.gms.maps.e
 *  com.google.android.gms.maps.g
 *  com.google.android.gms.maps.model.CameraPosition
 *  com.google.android.gms.maps.model.LatLng
 *  com.google.android.gms.maps.model.a
 *  com.google.android.gms.maps.model.b
 *  com.google.android.gms.maps.model.e
 *  com.google.android.gms.maps.model.f
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package com.mobond.policestationlocator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.e;
import androidx.core.app.a;
import androidx.fragment.app.d;
import androidx.fragment.app.j;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.f;
import com.mobond.mindicator.h;
import com.mobond.policestationlocator.util.CustomMapFragment;
import java.util.Arrays;

public class LocatePoliceStationOnMapActivity
extends e
implements com.google.android.gms.maps.e {
    private c a;
    private CustomMapFragment b;
    private com.google.android.gms.maps.model.e c = null;
    private String d = null;
    private String e;

    private void a(double d2, double d3) {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(d2, d3), 15.0f, this.a.a().c, this.a.a().d);
        this.a.a(b.a((CameraPosition)cameraPosition), 1000, null);
        com.google.android.gms.maps.model.e e2 = this.c;
        if (e2 != null) {
            e2.a();
        }
        this.c = this.a.a(new f().a(new LatLng(d2, d3)).a(this.e).a(com.google.android.gms.maps.model.b.a((int)2131231243)));
        this.c.b();
    }

    public void a(c c2) {
        this.a = c2;
        if (h.a((Context)this, "android.permission.ACCESS_FINE_LOCATION")) {
            this.a.a(true);
        } else {
            h.a((Activity)this, "LOCATION", new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 105);
        }
        this.a.c().d(true);
        this.a.c().a(true);
        this.a.c().c(true);
        this.a.c().b(true);
        String string = this.d;
        double d2 = Double.parseDouble((String)string.substring(0, string.indexOf(44)));
        String string2 = this.d;
        this.a(d2, Double.parseDouble((String)string2.substring(1 + string2.indexOf(44))));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493085);
        this.findViewById(2131297534).setVisibility(8);
        this.findViewById(2131297472).setVisibility(8);
        this.findViewById(2131296577).setVisibility(8);
        this.findViewById(2131296372).setVisibility(8);
        this.findViewById(2131297347).setVisibility(8);
        this.findViewById(2131296863).setVisibility(8);
        this.findViewById(2131296418).setVisibility(8);
        this.b = (CustomMapFragment)this.getSupportFragmentManager().a(2131296976);
        this.b.a((com.google.android.gms.maps.e)this);
        Intent intent = this.getIntent();
        if (intent != null) {
            this.d = intent.getStringExtra("latLon");
            this.e = intent.getStringExtra("name");
        }
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 105 && arrn.length > 0 && arrn[0] == 0) {
            this.a.a(true);
            return;
        }
        if (!a.a((Activity)this, (String)arrstring[0])) {
            com.mobond.mindicator.a.a((Activity)this).b(Arrays.toString((Object[])arrstring), true);
        }
    }
}

