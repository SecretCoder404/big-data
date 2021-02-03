/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.jobs;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.jobs.SubscribeToJobNotification;

public class SubscribeToJobNotification
extends e {
    public static LinearLayout a;
    static b b;
    String c = "SUBSCRIBED_JOB_NOTIFICATIONS";

    public void a(Context context) {
        String[] arrstring = new String[]{"GOVERNMENT##Government", "FINANCE##Accounting / Finance", "CUSTOMER_CARE##Customer Care / Telecaller", "OFFICE_ADMIN##Office Admin", "MARKETING/SALES##Marketing / Sales", "SOFTWARE##Software Engineer", "HARDWARE##Hardware Engineer", "TEACHING_TRAINING##Teaching / Training", "HOSPITAL##Hospital", "CIVIL/MECH/PROD##Civil / Mechanical / Production", "HOTEL##Hotel", "GRAPHICS##Graphics Designer", "IMPORT-EXPORT##Import - Export", "LEGAL##Legal", "MULTIPLE##Multiple", "SHIPPING##Shipping", "GARMENT##Garment"};
        String string = b.a(this.c, "#");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)context).inflate(2131493057, (ViewGroup)a, false);
            TextView textView = (TextView)viewGroup.findViewById(2131296898);
            ImageView imageView = (ImageView)viewGroup.findViewById(2131296520);
            String[] arrstring2 = arrstring[i2].split("##");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(arrstring2[1]);
            stringBuilder.append(" Jobs");
            textView.setText((CharSequence)stringBuilder.toString());
            textView.setTag((Object)arrstring2[0]);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("#");
            stringBuilder2.append(arrstring2[0]);
            stringBuilder2.append("#");
            if (string.indexOf(stringBuilder2.toString()) != -1) {
                imageView.setTag((Object)"check");
                imageView.setImageResource(2131230883);
                viewGroup.setBackgroundColor(Color.parseColor((String)"#2E7D32"));
            } else {
                imageView.setTag((Object)"uncheck");
                imageView.setImageResource(2131230898);
            }
            viewGroup.setOnClickListener(new View.OnClickListener(this, imageView, textView, viewGroup){
                final /* synthetic */ ImageView a;
                final /* synthetic */ TextView b;
                final /* synthetic */ ViewGroup c;
                final /* synthetic */ SubscribeToJobNotification d;
                {
                    this.d = subscribeToJobNotification;
                    this.a = imageView;
                    this.b = textView;
                    this.c = viewGroup;
                }

                public void onClick(View view) {
                    if (this.a.getTag().toString().equalsIgnoreCase("check")) {
                        this.a.setTag((Object)"uncheck");
                        this.a.setImageResource(2131230898);
                        this.d.a(this.b.getTag().toString(), this.d.c);
                        this.c.setBackgroundResource(2131230894);
                        return;
                    }
                    this.a.setTag((Object)"check");
                    this.a.setImageResource(2131230883);
                    this.d.a(this.b.getTag().toString(), this.d.c);
                    this.c.setBackgroundColor(Color.parseColor((String)"#2E7D32"));
                }
            });
            a.addView((View)viewGroup);
        }
    }

    public void a(String string, String string2) {
        String string3 = b.a(string2, "#");
        Log.d((String)"checked_items", (String)string3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ConfigurationManager.b((Context)this));
        stringBuilder.append("_");
        stringBuilder.append(string.replace((CharSequence)"/", (CharSequence)"_"));
        String string4 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("#");
        stringBuilder2.append(string);
        stringBuilder2.append("#");
        if (string3.indexOf(stringBuilder2.toString()) != -1) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string);
            stringBuilder3.append("#");
            String string5 = stringBuilder3.toString();
            b.b(string2, string3.replace((CharSequence)string5, (CharSequence)""));
            com.mobond.mindicator.fcm.b.b(string4);
        } else {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string3);
            stringBuilder4.append(string);
            stringBuilder4.append("#");
            String string6 = stringBuilder4.toString();
            b.b(string2, string6);
            com.mobond.mindicator.fcm.b.a(string4);
        }
        Log.d((String)"checked_items", (String)b.a(string2, "#"));
    }

    public void okClicked(View view) {
        this.finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493137);
        b = a.a((Activity)this);
        a = (LinearLayout)this.findViewById(2131297452);
        ImageView imageView = (ImageView)this.findViewById(2131296397);
        this.a(this.getApplicationContext());
        imageView.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ SubscribeToJobNotification a;
            {
                this.a = subscribeToJobNotification;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }
}

