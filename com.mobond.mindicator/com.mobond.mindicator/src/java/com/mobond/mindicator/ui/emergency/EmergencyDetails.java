/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
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
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.emergency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.emergency.EmergencyDetails;
import org.json.JSONArray;
import org.json.JSONObject;

public class EmergencyDetails
extends e {
    public static LinearLayout a;
    static b b;
    static String c;
    View d;

    private String a() {
        return new String(com.mulo.util.e.a(com.mulo.util.e.a((Object)this, "emergency/emergency")));
    }

    public void a(Context context, String string) {
        JSONArray jSONArray = new JSONArray(this.a());
        int n2 = Integer.parseInt((String)string);
        for (int i2 = 0; i2 < jSONArray.getJSONObject(n2).getJSONArray("data").length(); ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)context).inflate(2131492982, (ViewGroup)a, false);
            TextView textView = (TextView)viewGroup.findViewById(2131297510);
            TextView textView2 = (TextView)viewGroup.findViewById(2131297084);
            String string2 = jSONArray.getJSONObject(n2).getJSONArray("data").getJSONObject(i2).getString("title");
            String string3 = jSONArray.getJSONObject(n2).getJSONArray("data").getJSONObject(i2).getString("pno");
            textView.setText((CharSequence)string2);
            if (string3.isEmpty()) {
                textView2.setVisibility(8);
            } else {
                textView2.setText((CharSequence)string3);
            }
            viewGroup.setOnClickListener(new View.OnClickListener(this, string3.split(","), string3, context){
                final /* synthetic */ String[] a;
                final /* synthetic */ String b;
                final /* synthetic */ Context c;
                final /* synthetic */ EmergencyDetails d;
                {
                    this.d = emergencyDetails;
                    this.a = arrstring;
                    this.b = string;
                    this.c = context;
                }

                public void onClick(View view) {
                    if (this.a.length == 1) {
                        if (!this.b.equals((Object)"")) {
                            com.mobond.mindicator.ui.n.b((Activity)this.d, this.b);
                            return;
                        }
                    } else {
                        android.app.Dialog dialog = new android.app.Dialog((Context)this.d);
                        dialog.requestWindowFeature(1);
                        dialog.setContentView(2131492984);
                        LinearLayout linearLayout = (LinearLayout)dialog.findViewById(2131296998);
                        for (int i2 = 0; i2 < this.a.length; ++i2) {
                            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.c).inflate(2131492985, (ViewGroup)linearLayout, false);
                            TextView textView = (TextView)viewGroup.findViewById(2131297117);
                            textView.setText((CharSequence)this.a[i2]);
                            textView.setOnClickListener(new View.OnClickListener(this, i2){
                                final /* synthetic */ int a;
                                final /* synthetic */ 2 b;
                                {
                                    this.b = var1_1;
                                    this.a = n2;
                                }

                                public void onClick(View view) {
                                    com.mobond.mindicator.ui.n.b((Activity)this.b.d, this.b.a[this.a]);
                                }
                            });
                            linearLayout.addView((View)viewGroup);
                        }
                        dialog.show();
                    }
                }
            });
            a.addView((View)viewGroup);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492983);
        b = a.a((Activity)this);
        a = (LinearLayout)this.findViewById(2131296638);
        ImageView imageView = (ImageView)this.findViewById(2131296397);
        TextView textView = (TextView)this.findViewById(2131297528);
        Intent intent = this.getIntent();
        String string = intent.getStringExtra("title");
        String string2 = intent.getStringExtra("i");
        textView.setText((CharSequence)string);
        c = string.replace((CharSequence)" ", (CharSequence)"").toLowerCase();
        try {
            this.a(this.getApplicationContext(), string2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        imageView.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ EmergencyDetails a;
            {
                this.a = emergencyDetails;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
        this.d = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/7815706041", "167101606757479_1239843416149954", "ca-app-pub-5449278086868932/6863394666", "167101606757479_1236077486526547", 3, null);
    }

    protected void onDestroy() {
        c.c(this.d);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.d);
    }

    public void onResume() {
        super.onResume();
        c.a(this.d);
    }
}

