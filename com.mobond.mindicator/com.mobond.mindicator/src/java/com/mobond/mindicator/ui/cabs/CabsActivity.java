/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.HorizontalScrollView
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.appcompat.app.e
 *  androidx.core.content.a
 *  androidx.fragment.app.d
 *  androidx.fragment.app.j
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$i
 *  com.google.android.gms.common.e
 *  com.google.android.gms.maps.a
 *  com.google.android.gms.maps.b
 *  com.google.android.gms.maps.c
 *  com.google.android.gms.maps.c$c
 *  com.google.android.gms.maps.e
 *  com.google.android.gms.maps.g
 *  com.google.android.gms.maps.model.CameraPosition
 *  com.google.android.gms.maps.model.LatLng
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Hashtable
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.cabs;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.e;
import com.google.android.gms.maps.g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.mobond.mindicator.d;
import com.mobond.mindicator.ui.cabs.CabsActivity;
import com.mobond.mindicator.ui.cabs.RecentLocationActivity;
import com.mobond.mindicator.ui.cabs.SelectLocationActivity;
import com.mobond.mindicator.ui.cabs.a.b;
import com.mobond.mindicator.ui.cabs.util.CustomMapFragment;
import com.mobond.mindicator.ui.j;
import com.mobond.mindicator.ui.n;
import com.mulo.b.c;
import com.mulo.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class CabsActivity
extends androidx.appcompat.app.e
implements e,
j {
    Hashtable<String, List<com.mobond.mindicator.ui.cabs.b.a>> A = new Hashtable();
    String B = null;
    boolean C = false;
    Handler D;
    private int E;
    private ProgressDialog F;
    private Dialog G;
    private TextView H;
    private TextView I;
    private TextView J;
    private TextView K;
    private RelativeLayout L;
    private RecyclerView M;
    private TextView N;
    private FrameLayout O;
    private HorizontalScrollView P;
    public double a;
    public double b;
    public double c;
    public double d;
    public String e = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public com.mobond.mindicator.a.a i;
    public b j;
    com.google.android.gms.maps.c k;
    LatLng l;
    String m;
    d n;
    d o;
    d p;
    d q;
    d r;
    CustomMapFragment s;
    TextView t;
    ArrayList<TextView> u;
    ArrayList<ImageView> v;
    ArrayList<View> w;
    LatLng x;
    LatLng y;
    String[] z;

    private void a(double d2, double d3) {
        com.google.android.gms.maps.a a2 = com.google.android.gms.maps.b.a((LatLng)new LatLng(d2, d3));
        com.google.android.gms.maps.a a3 = com.google.android.gms.maps.b.a((float)15.0f);
        this.k.a(a2);
        this.k.b(a3);
    }

    static /* synthetic */ void a(CabsActivity cabsActivity, String string) {
        cabsActivity.a(string);
    }

    static /* synthetic */ void a(CabsActivity cabsActivity, JSONObject jSONObject) {
        cabsActivity.a(jSONObject);
    }

    private void a(String string) {
        this.B = string;
        int n2 = 0;
        boolean bl = false;
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            TextView textView = (TextView)this.u.get(i2);
            View view = (View)this.w.get(i2);
            if (textView.getText().toString().equals((Object)string.toUpperCase())) {
                view.setVisibility(0);
                bl = true;
            } else {
                view.setVisibility(8);
            }
            if (bl) continue;
            n2 += textView.getWidth();
        }
        this.P.smoothScrollTo(n2, 0);
        this.m = string;
        this.a();
    }

    private void a(String string, String string2, String string3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("address", (Object)string);
            jSONObject.put("lat", (Object)string2);
            jSONObject.put("lng", (Object)string3);
            this.n.a(jSONObject);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"7777", (String)"7777 Exception in addInHistory", (Throwable)exception);
            return;
        }
    }

    private void a(JSONObject jSONObject) {
        int n2;
        JSONArray jSONArray = jSONObject.getJSONArray("services");
        this.E = jSONArray.length();
        this.z = new String[this.E];
        for (int i2 = 0; i2 < (n2 = this.E); ++i2) {
            this.z[i2] = jSONArray.getString(i2);
        }
        String[] arrstring = new String[n2];
        for (int i3 = 0; i3 < this.E; ++i3) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(jSONArray.getString(i3));
            int n3 = jSONArray2.length();
            arrstring[i3] = jSONArray.getString(i3);
            ArrayList arrayList = new ArrayList();
            this.A.put((Object)arrstring[i3], (Object)arrayList);
            for (int i4 = 0; i4 < n3; ++i4) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
                com.mobond.mindicator.ui.cabs.b.a a2 = new com.mobond.mindicator.ui.cabs.b.a();
                a2.a = jSONObject2.getString("service_name");
                a2.b = jSONObject2.getString("display_name");
                a2.e = jSONObject2.getString("deeplink_url");
                a2.g = jSONObject2.getString("app_url_andr");
                if (jSONObject2.has("web_url")) {
                    a2.f = jSONObject2.getString("web_url");
                }
                if (jSONObject2.has("eta")) {
                    a2.d = jSONObject2.getString("eta");
                }
                if (jSONObject2.has("fare")) {
                    a2.c = jSONObject2.getString("fare");
                }
                arrayList.add((Object)a2);
            }
        }
    }

    private void b() {
        this.i = new com.mobond.mindicator.a.a(){

            @Override
            public void a(Location location) {
                super.a(location);
                Log.d((String)"1212", (String)"1212 onLocationChanged() called");
                if (CabsActivity.this.k != null) {
                    CabsActivity.this.i.a();
                    CabsActivity.this.b = location.getLatitude();
                    CabsActivity.this.a = location.getLongitude();
                    CabsActivity.this.d();
                    if (CabsActivity.this.G.isShowing()) {
                        CabsActivity.this.G.dismiss();
                        Intent intent = new Intent((Context)CabsActivity.this, SelectLocationActivity.class);
                        intent.putExtra("type", 1);
                        intent.putExtra("lat", CabsActivity.this.b);
                        intent.putExtra("lng", CabsActivity.this.a);
                        CabsActivity.this.startActivityForResult(intent, 12);
                    }
                }
            }
        };
        this.i.a(100);
        this.D.postDelayed(new Runnable(this){
            final /* synthetic */ CabsActivity a;
            {
                this.a = cabsActivity;
            }

            public void run() {
                this.a.i.a((Activity)this.a);
            }
        }, 1800L);
    }

    static /* synthetic */ void b(CabsActivity cabsActivity) {
        cabsActivity.g();
    }

    static /* synthetic */ void b(CabsActivity cabsActivity, String string) {
        cabsActivity.b(string);
    }

    private void b(String string) {
        this.D.post(new Runnable(this, string){
            final /* synthetic */ String a;
            final /* synthetic */ CabsActivity b;
            {
                this.b = cabsActivity;
                this.a = string;
            }

            public void run() {
                n.c((Context)this.b, this.a);
                if (CabsActivity.a(this.b).isShowing()) {
                    CabsActivity.a(this.b).dismiss();
                }
                CabsActivity.c(this.b).setText((CharSequence)this.a);
                CabsActivity.d(this.b).setText((CharSequence)this.a);
                CabsActivity.m(this.b).setVisibility(8);
                CabsActivity.i(this.b).setVisibility(8);
            }
        });
    }

    static /* synthetic */ TextView c(CabsActivity cabsActivity) {
        return cabsActivity.H;
    }

    private void c() {
        com.google.android.gms.common.e e2 = com.google.android.gms.common.e.a();
        int n2 = e2.a((Context)this);
        if (n2 != 0) {
            if (e2.a(n2)) {
                this.G.dismiss();
                Dialog dialog = e2.a((Activity)this, n2, 1012);
                dialog.setCancelable(false);
                dialog.show();
                return;
            }
            Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"This device doesn't support Play services, App will not work normally", (int)1).show();
            this.finish();
        }
    }

    static /* synthetic */ TextView d(CabsActivity cabsActivity) {
        return cabsActivity.I;
    }

    private void d() {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(this.b, this.a), 13.0f, this.k.a().c, this.k.a().d);
        this.k.a(com.google.android.gms.maps.b.a((CameraPosition)cameraPosition));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e() {
        this.G.dismiss();
        this.O.setVisibility(0);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        LinearLayout linearLayout = (LinearLayout)this.findViewById(2131296478);
        linearLayout.removeAllViews();
        this.u = new ArrayList();
        this.w = new ArrayList();
        this.v = new ArrayList();
        for (int i2 = 0; i2 < this.E; ++i2) {
            String string = this.z[i2];
            RelativeLayout relativeLayout = (RelativeLayout)layoutInflater.inflate(2131492947, null);
            TextView textView = (TextView)relativeLayout.findViewById(2131296477);
            View view = relativeLayout.findViewById(2131297357);
            textView.setText((CharSequence)string.toUpperCase());
            this.u.add((Object)textView);
            this.w.add((Object)view);
            linearLayout.addView((View)relativeLayout);
            textView.setOnClickListener(new View.OnClickListener(this, string){
                final /* synthetic */ String a;
                final /* synthetic */ CabsActivity b;
                {
                    this.b = cabsActivity;
                    this.a = string;
                }

                public void onClick(View view) {
                    CabsActivity.a(this.b, this.a);
                }
            });
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1111 last_selected_service is: ");
        stringBuilder.append(this.m);
        Log.d((String)"1111", (String)stringBuilder.toString());
        if (this.E > 0) {
            if (this.m != null) {
                for (int i3 = 0; i3 < this.E; ++i3) {
                    if (!this.z[i3].equals((Object)this.m)) continue;
                    this.a(this.m);
                    return;
                }
                boolean bl = false;
                if (bl) return;
                this.a(this.z[0]);
                return;
            }
            this.a(this.z[0]);
            return;
        }
        Log.d((String)"1231", (String)"1231 services not came");
        this.L.setVisibility(8);
        this.N.setText((CharSequence)this.getResources().getString(2131755427));
        this.N.setVisibility(0);
    }

    static /* synthetic */ TextView f(CabsActivity cabsActivity) {
        return cabsActivity.J;
    }

    private void f() {
        Log.d((String)"1111", (String)"1111 getAddressDirections() called");
        this.x = new LatLng(this.b, this.a);
        this.y = new LatLng(this.c, this.d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://maps.googleapis.com/maps/api/directions/json?origin=");
        stringBuilder.append(this.b);
        stringBuilder.append(",");
        stringBuilder.append(this.a);
        stringBuilder.append("&destination=");
        stringBuilder.append(this.c);
        stringBuilder.append(",");
        stringBuilder.append(this.d);
        stringBuilder.append("&key=");
        stringBuilder.append("AIzaSyCz6QgtQ7mSG9NtfjOTyfrTY8pM9lSfTZA");
        c.a(stringBuilder.toString(), null, null, new com.mulo.b.a(this){
            final /* synthetic */ CabsActivity a;
            {
                this.a = cabsActivity;
            }

            public void a() {
                CabsActivity.b(this.a, "Please Check Internet");
            }

            /*
             * Exception decompiling
             */
            public void a(}
        java.lang.IllegalStateException: Parameters not created
        
        