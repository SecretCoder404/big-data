/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TableLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.ferry;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.ferry.FerryUI;
import com.mobond.mindicator.ui.ferry.a;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class FerryUI
extends e {
    public Toolbar a;
    public LinearLayout b;
    public LinearLayout c;
    Vector<a> d = new Vector();
    float e;
    String f;
    TextView g;
    TextView h;
    ImageView i;
    private View j;

    @SuppressLint(value={"NewApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492996);
        int n2 = 0;
        this.f = this.getSharedPreferences("m-indicator", 0).getString("city", "mumbai");
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        this.a = (Toolbar)this.findViewById(2131297523);
        this.a.setTitle(2131755070);
        this.a.setTitleTextColor(-1);
        this.setSupportActionBar(this.a);
        this.getSupportActionBar().a(false);
        this.a.setBackgroundColor(this.getResources().getColor(2131099775));
        this.b = (LinearLayout)this.findViewById(2131296424);
        this.b.setBackgroundColor(this.getResources().getColor(2131099776));
        this.g = (TextView)this.findViewById(2131296425);
        this.i = (ImageView)this.findViewById(2131296397);
        this.c = (LinearLayout)this.findViewById(2131296415);
        this.h = (TextView)this.findViewById(2131296533);
        this.h.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.e = this.getResources().getDisplayMetrics().density;
        JSONArray jSONArray = new JSONArray(new String(com.mulo.util.e.a(com.mulo.util.e.a((Object)this, "ferry/ferry.json"))).toString());
        int n3 = 0;
        do {
            if (n3 >= jSONArray.length()) break;
            Vector<a> vector = this.d;
            a a2 = new a(jSONArray.getJSONObject(n3).getString("from"), jSONArray.getJSONObject(n3).getString("to"), jSONArray.getJSONObject(n3).getString("fromfirst"), jSONArray.getJSONObject(n3).getString("fromlst"), jSONArray.getJSONObject(n3).getString("tofirst"), jSONArray.getJSONObject(n3).getString("tolst"), jSONArray.getJSONObject(n3).getString("frequency"), jSONArray.getJSONObject(n3).getString("jtime"), jSONArray.getJSONObject(n3).getString("fare"), jSONArray.getJSONObject(n3).getString("bike"), jSONArray.getJSONObject(n3).getString("avail"));
            vector.add((Object)a2);
            ++n3;
        } while (true);
        try {
            LinearLayout linearLayout = (LinearLayout)this.findViewById(2131296777);
            while (n2 < this.d.size()) {
                a a3 = (a)this.d.get(n2);
                TableLayout tableLayout = (TableLayout)this.getLayoutInflater().inflate(2131493139, null);
                ((TextView)tableLayout.findViewById(2131296774)).setText((CharSequence)a3.a);
                ((TextView)tableLayout.findViewById(2131296771)).setText((CharSequence)a3.b);
                TextView textView = (TextView)tableLayout.findViewById(2131296775);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("First\t: ");
                stringBuilder.append(a3.c);
                stringBuilder.append("\nLast : ");
                stringBuilder.append(a3.d);
                textView.setText((CharSequence)stringBuilder.toString());
                TextView textView2 = (TextView)tableLayout.findViewById(2131296776);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("First\t: ");
                stringBuilder2.append(a3.e);
                stringBuilder2.append("\nLast : ");
                stringBuilder2.append(a3.f);
                textView2.setText((CharSequence)stringBuilder2.toString());
                ((TextView)tableLayout.findViewById(2131296770)).setText((CharSequence)a3.g);
                ((TextView)tableLayout.findViewById(2131296772)).setText((CharSequence)a3.h);
                ((TextView)tableLayout.findViewById(2131296769)).setText((CharSequence)a3.i);
                ((TextView)tableLayout.findViewById(2131296768)).setText((CharSequence)a3.j);
                ((TextView)tableLayout.findViewById(2131296767)).setText((CharSequence)a3.k);
                linearLayout.addView((View)tableLayout);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        {
            ++n2;
            continue;
            break;
        }
        this.i.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ FerryUI a;
            {
                this.a = ferryUI;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
        this.c.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ FerryUI a;
            {
                this.a = ferryUI;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.setData(android.net.Uri.parse((String)"http://mobondhrd.appspot.com/ferrybookingmumbai"));
                this.a.startActivity(intent);
            }
        });
        this.j = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/7536504447", "167101606757479_1239843022816660", "ca-app-pub-5449278086868932/3814435789", "167101606757479_1235753336558962", 3, null);
    }

    protected void onDestroy() {
        c.c(this.j);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.j);
    }

    public void onResume() {
        super.onResume();
        c.a(this.j);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}

