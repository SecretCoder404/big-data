/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$a
 *  androidx.recyclerview.widget.RecyclerView$i
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.cabs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mobond.mindicator.d;
import com.mobond.mindicator.ui.cabs.RecentLocationActivity;
import com.mobond.mindicator.ui.cabs.SelectLocationActivity;
import com.mobond.mindicator.ui.cabs.a.a;
import com.mobond.mindicator.ui.cabs.b.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RecentLocationActivity
extends e
implements com.mobond.mindicator.ui.cabs.c.a {
    d a;
    d b;
    d c;
    RecyclerView d;
    TextView e;
    RelativeLayout f;
    RelativeLayout g;
    TextView h;
    TextView i;
    ImageView j;
    ImageView k;
    int l;
    ArrayList<b> m = new ArrayList();
    a n;

    public void a() {
        this.b = new d((Context)this, "cab_star_one_location", 1);
        this.c = new d((Context)this, "cab_star_two_location", 1);
        JSONArray jSONArray = this.b.a();
        JSONArray jSONArray2 = this.c.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1111 history \nStar 1: ");
        stringBuilder.append((Object)jSONArray);
        stringBuilder.append("\nStar 2: ");
        stringBuilder.append((Object)jSONArray2);
        Log.d((String)"1111", (String)stringBuilder.toString());
        if (jSONArray.length() > 0) {
            this.f.setVisibility(0);
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                b b2 = new b();
                b2.a = jSONObject.getString("address");
                b2.b = jSONObject.getString("lat");
                b2.c = jSONObject.getString("lng");
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("1111 Star 1 Address:");
                stringBuilder2.append(b2.a);
                Log.d((String)"1111", (String)stringBuilder2.toString());
                this.h.setText((CharSequence)b2.a);
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        } else {
            this.f.setVisibility(8);
        }
        if (jSONArray2.length() > 0) {
            this.g.setVisibility(0);
            try {
                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                b b3 = new b();
                b3.a = jSONObject.getString("address");
                b3.b = jSONObject.getString("lat");
                b3.c = jSONObject.getString("lng");
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("1111 Star 1 Address:\nStar 2 Address:");
                stringBuilder3.append(b3.a);
                Log.d((String)"1111", (String)stringBuilder3.toString());
                this.i.setText((CharSequence)b3.a);
                return;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                return;
            }
        }
        this.g.setVisibility(8);
    }

    @Override
    public void a(int n2) {
        this.m.remove(n2);
        this.a.a(this.getApplicationContext(), n2);
        this.n.a(this.m);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493118);
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        this.setSupportActionBar(toolbar);
        this.l = this.getIntent().getIntExtra("type", -1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1111 value of type: ");
        stringBuilder.append(this.l);
        Log.d((String)"1111", (String)stringBuilder.toString());
        int n2 = this.l;
        if (n2 == 1) {
            toolbar.setTitle(2131755463);
        } else if (n2 == 2) {
            toolbar.setTitle(2131755461);
        }
        this.a = new d((Context)this, "cab_recent_location", 10);
        JSONArray jSONArray = this.a.a();
        int n3 = jSONArray.length();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("1111 history JSONArray");
        stringBuilder2.append((Object)jSONArray);
        Log.d((String)"1111", (String)stringBuilder2.toString());
        for (int i2 = 0; i2 < n3; ++i2) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                b b2 = new b();
                b2.a = jSONObject.getString("address");
                b2.b = jSONObject.getString("lat");
                b2.c = jSONObject.getString("lng");
                this.m.add((Object)b2);
                continue;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        this.e = (TextView)this.findViewById(2131297039);
        this.f = (RelativeLayout)this.findViewById(2131297417);
        this.g = (RelativeLayout)this.findViewById(2131297420);
        this.h = (TextView)this.findViewById(2131297418);
        this.i = (TextView)this.findViewById(2131297421);
        this.j = (ImageView)this.findViewById(2131296622);
        this.k = (ImageView)this.findViewById(2131296623);
        this.a();
        this.j.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ RecentLocationActivity a;
            {
                this.a = recentLocationActivity;
            }

            public void onClick(View view) {
                this.a.b.b();
                this.a.a();
                com.mobond.mindicator.ui.n.b((Context)this.a, "Star 1 deleted successfully");
            }
        });
        this.k.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ RecentLocationActivity a;
            {
                this.a = recentLocationActivity;
            }

            public void onClick(View view) {
                this.a.c.b();
                this.a.a();
                com.mobond.mindicator.ui.n.b((Context)this.a, "Star 2 deleted successfully");
            }
        });
        this.d = (RecyclerView)this.findViewById(2131297179);
        this.d.setLayoutManager((RecyclerView.i)new LinearLayoutManager((Context)this));
        if (n3 > 0) {
            a a2;
            this.e.setVisibility(8);
            this.n = a2 = new a(this.a, this, this.l, this.m, this);
            this.n.notifyDataSetChanged();
            this.d.setAdapter((RecyclerView.a)this.n);
            return;
        }
        this.d.setVisibility(8);
        this.e.setVisibility(0);
    }

    public void starOneClicked(View view) {
        try {
            JSONObject jSONObject = this.b.a().getJSONObject(0);
            Intent intent = new Intent((Context)this, SelectLocationActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("type", this.l);
            intent.putExtra("address", jSONObject.getString("address"));
            intent.putExtra("lat", jSONObject.getDouble("lat"));
            intent.putExtra("lng", jSONObject.getDouble("lng"));
            this.startActivity(intent);
            this.finish();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void starTwoClicked(View view) {
        try {
            JSONObject jSONObject = this.c.a().getJSONObject(0);
            Intent intent = new Intent((Context)this, SelectLocationActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("type", this.l);
            intent.putExtra("address", jSONObject.getString("address"));
            intent.putExtra("lat", jSONObject.getDouble("lat"));
            intent.putExtra("lng", jSONObject.getDouble("lng"));
            this.startActivity(intent);
            this.finish();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

