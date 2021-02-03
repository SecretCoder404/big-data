/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.emergency;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.emergency.EmergencyHome;
import org.json.JSONArray;
import org.json.JSONObject;

public class EmergencyHome
extends e {
    public static LinearLayout a;
    View b;

    private String a() {
        return new String(com.mulo.util.e.a(com.mulo.util.e.a((Object)this, "emergency/emergency")));
    }

    public void a(Context context) {
        JSONArray jSONArray = new JSONArray(this.a());
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)context).inflate(2131492981, (ViewGroup)a, false);
            TextView textView = (TextView)viewGroup.findViewById(2131297004);
            ImageView imageView = (ImageView)viewGroup.findViewById(2131296710);
            String string = jSONArray.getJSONObject(i2).getString("title");
            String string2 = string.toLowerCase();
            if (string2.equals((Object)"hospitals")) {
                string2 = "Casualty Hospitals";
            } else if (string2.equals((Object)"mseb")) {
                string2 = "Electricity Issue";
            } else if (string2.equals((Object)"police")) {
                string2 = "Tourist Enquires";
            } else if (string2.equals((Object)"government")) {
                string2 = "Imp Medical Messages";
            }
            Resources resources = context.getResources();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("emergency_");
            stringBuilder.append(string2.toLowerCase().replace((CharSequence)" ", (CharSequence)"_"));
            int n2 = resources.getIdentifier(stringBuilder.toString(), "drawable", context.getPackageName());
            textView.setText((CharSequence)string);
            imageView.setImageResource(n2);
            viewGroup.setOnClickListener(new View.OnClickListener(this, context, string, i2){
                final /* synthetic */ Context a;
                final /* synthetic */ String b;
                final /* synthetic */ int c;
                final /* synthetic */ EmergencyHome d;
                {
                    this.d = emergencyHome;
                    this.a = context;
                    this.b = string;
                    this.c = n2;
                }

                public void onClick(View view) {
                    android.content.Intent intent = new android.content.Intent(this.a, com.mobond.mindicator.ui.emergency.EmergencyDetails.class);
                    intent.putExtra("title", this.b);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(this.c);
                    intent.putExtra("i", stringBuilder.toString());
                    this.d.startActivity(intent);
                }
            });
            a.addView((View)viewGroup);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492986);
        a = (LinearLayout)this.findViewById(2131296711);
        try {
            this.a(this.getApplicationContext());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.b = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/7815706041", "167101606757479_1239843416149954", "ca-app-pub-5449278086868932/6863394666", "167101606757479_1236077486526547", 3, null);
    }

    protected void onDestroy() {
        c.c(this.b);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.b);
    }

    public void onResume() {
        super.onResume();
        c.a(this.b);
    }
}

