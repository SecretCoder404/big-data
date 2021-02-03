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
 *  androidx.core.content.a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Hashtable
 *  org.json.JSONException
 */
package com.mobond.mindicator.ui.indianrail.checklist;

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
import com.mobond.mindicator.ui.indianrail.checklist.CheckLists;
import com.mobond.mindicator.ui.indianrail.checklist.CheckListsDetails;
import java.util.Hashtable;
import org.json.JSONException;

public class CheckListsDetails
extends e {
    public static LinearLayout a;
    public static LinearLayout b;
    public static TextView c;
    static b d;
    static String e;
    private View f;

    public static ViewGroup a(Context context, String string, String string2, String string3) {
        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)context).inflate(2131493018, (ViewGroup)a, false);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("checklist_checked_");
        stringBuilder.append(string3.replace((CharSequence)" ", (CharSequence)""));
        String string4 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("checklist_removed_");
        stringBuilder2.append(string3.replace((CharSequence)" ", (CharSequence)""));
        String string5 = stringBuilder2.toString();
        String string6 = d.a(string4, "#");
        d.a(string5, "#");
        TextView textView = (TextView)viewGroup.findViewById(2131296898);
        textView.setText((CharSequence)string);
        ImageView imageView = (ImageView)viewGroup.findViewById(2131296520);
        imageView.setTag((Object)"uncheck");
        ImageView imageView2 = (ImageView)viewGroup.findViewById(2131296618);
        imageView2.setTag((Object)"delete");
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("#");
        stringBuilder3.append(string2);
        stringBuilder3.append("#");
        if (string6.contains((CharSequence)stringBuilder3.toString())) {
            imageView.setTag((Object)"checked");
            imageView.setImageResource(2131230883);
            textView.setPaintFlags(16 | textView.getPaintFlags());
            viewGroup.setBackgroundColor(androidx.core.content.a.c((Context)context, (int)2131099880));
        }
        View.OnClickListener onClickListener = new View.OnClickListener(imageView, imageView2, textView, viewGroup, context, string2, string4, string5, string, string3){
            final /* synthetic */ ImageView a;
            final /* synthetic */ ImageView b;
            final /* synthetic */ TextView c;
            final /* synthetic */ ViewGroup d;
            final /* synthetic */ Context e;
            final /* synthetic */ String f;
            final /* synthetic */ String g;
            final /* synthetic */ String h;
            final /* synthetic */ String i;
            final /* synthetic */ String j;
            {
                this.a = imageView;
                this.b = imageView2;
                this.c = textView;
                this.d = viewGroup;
                this.e = context;
                this.f = string;
                this.g = string2;
                this.h = string3;
                this.i = string4;
                this.j = string5;
            }

            public void onClick(View view) {
                String string = String.valueOf((Object)this.a.getTag());
                if (!this.b.getTag().toString().equals((Object)"undo")) {
                    if (string.equalsIgnoreCase("uncheck")) {
                        this.a.setTag((Object)"checked");
                        this.a.setImageResource(2131230883);
                        TextView textView = this.c;
                        textView.setPaintFlags(16 | textView.getPaintFlags());
                        this.d.setBackgroundColor(androidx.core.content.a.c((Context)this.e, (int)2131099880));
                        CheckListsDetails.a(this.f, this.g, this.e);
                        return;
                    }
                    this.a.setTag((Object)"uncheck");
                    this.a.setImageResource(2131230898);
                    this.c.setPaintFlags(0);
                    this.d.setBackgroundResource(2131230894);
                    CheckListsDetails.a(this.f, this.g, this.e);
                    return;
                }
                CheckListsDetails.a(this.f, this.h, this.e);
                this.d.setAlpha(1.0f);
                this.c.setAlpha(1.0f);
                this.b.setAlpha(1.0f);
                this.b.setTag((Object)"delete");
                CheckListsDetails.b.removeView((View)this.d);
                ViewGroup viewGroup = CheckListsDetails.a(this.e, this.i, this.f, this.j);
                viewGroup.setBackgroundResource(2131230894);
                CheckListsDetails.a.addView((View)viewGroup);
            }
        };
        viewGroup.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener(imageView2, string2, string5, context, viewGroup, textView, string, string3, string4){
            final /* synthetic */ ImageView a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ Context d;
            final /* synthetic */ ViewGroup e;
            final /* synthetic */ TextView f;
            final /* synthetic */ String g;
            final /* synthetic */ String h;
            final /* synthetic */ String i;
            {
                this.a = imageView;
                this.b = string;
                this.c = string2;
                this.d = context;
                this.e = viewGroup;
                this.f = textView;
                this.g = string3;
                this.h = string4;
                this.i = string5;
            }

            public void onClick(View view) {
                String string = this.a.getTag().toString();
                CheckListsDetails.a(this.b, this.c, this.d);
                if (string.equals((Object)"undo")) {
                    this.e.setAlpha(1.0f);
                    this.f.setAlpha(1.0f);
                    this.a.setAlpha(1.0f);
                    this.a.setTag((Object)"delete");
                    CheckListsDetails.b.removeView((View)this.e);
                    ViewGroup viewGroup = CheckListsDetails.a(this.d, this.g, this.b, this.h);
                    viewGroup.setBackgroundResource(2131230894);
                    CheckListsDetails.a.addView((View)viewGroup);
                } else {
                    ViewGroup viewGroup = CheckListsDetails.a(this.d, this.g, this.b, this.h);
                    CheckListsDetails.c.setVisibility(0);
                    ImageView imageView = (ImageView)viewGroup.findViewById(2131296618);
                    TextView textView = (TextView)viewGroup.findViewById(2131296898);
                    ImageView imageView2 = (ImageView)viewGroup.findViewById(2131296520);
                    TextView textView2 = (TextView)viewGroup.findViewById(2131296655);
                    imageView2.setVisibility(8);
                    imageView.setImageResource(2131230881);
                    textView.setAlpha(0.2f);
                    imageView2.setAlpha(0.5f);
                    imageView.setAlpha(0.7f);
                    imageView.setTag((Object)"undo");
                    textView2.setAlpha(0.2f);
                    textView.setPaintFlags(0);
                    viewGroup.setBackgroundResource(2131230894);
                    CheckListsDetails.b.addView((View)viewGroup);
                    CheckListsDetails.a.removeView((View)this.e);
                }
                String string2 = CheckListsDetails.d.a(this.i, "#");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("#");
                stringBuilder.append(this.b);
                stringBuilder.append("#");
                if (string2.contains((CharSequence)stringBuilder.toString())) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(this.b);
                    stringBuilder2.append("#");
                    String string3 = stringBuilder2.toString();
                    CheckListsDetails.d.b(this.i, string2.replace((CharSequence)string3, (CharSequence)""));
                }
                if (CheckListsDetails.b.getChildCount() == 0) {
                    CheckListsDetails.c.setVisibility(8);
                }
            }
        };
        imageView2.setOnClickListener(onClickListener2);
        return viewGroup;
    }

    public static void a(Context context) {
        String[] arrstring = ((String)CheckLists.a.get((Object)e)).split("#");
        int n2 = 0;
        while (n2 < arrstring.length) {
            String string = arrstring[n2];
            ViewGroup viewGroup = CheckListsDetails.a(context, string, String.valueOf((int)(++n2)), e);
            String string2 = String.valueOf((int)n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("checklist_checked_");
            stringBuilder.append(e.replace((CharSequence)" ", (CharSequence)""));
            String string3 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("checklist_removed_");
            stringBuilder2.append(e.replace((CharSequence)" ", (CharSequence)""));
            String string4 = stringBuilder2.toString();
            d.a(string3, "#");
            String string5 = d.a(string4, "#");
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("#");
            stringBuilder3.append(string2);
            stringBuilder3.append("#");
            if (!string5.contains((CharSequence)stringBuilder3.toString())) {
                a.addView((View)viewGroup);
            } else {
                c.setVisibility(0);
                ImageView imageView = (ImageView)viewGroup.findViewById(2131296618);
                TextView textView = (TextView)viewGroup.findViewById(2131296898);
                TextView textView2 = (TextView)viewGroup.findViewById(2131296655);
                viewGroup.findViewById(2131296520).setVisibility(8);
                imageView.setImageResource(2131230881);
                imageView.setAlpha(0.7f);
                imageView.setTag((Object)"undo");
                textView.setAlpha(0.2f);
                textView.setPaintFlags(0);
                textView2.setAlpha(0.2f);
                b.addView((View)viewGroup);
            }
            if (b.getChildCount() != 0) continue;
            c.setVisibility(8);
        }
    }

    public static void a(String string, String string2, Context context) {
        String string3 = d.a(string2, "#");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        stringBuilder.append(string);
        stringBuilder.append("#");
        if (string3.contains((CharSequence)stringBuilder.toString())) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append("#");
            String string4 = stringBuilder2.toString();
            d.b(string2, string3.replace((CharSequence)string4, (CharSequence)""));
            return;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string3);
        stringBuilder3.append(string);
        stringBuilder3.append("#");
        String string5 = stringBuilder3.toString();
        d.b(string2, string5);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493016);
        this.f = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/5724672771", "167101606757479_1239841612816801", "ca-app-pub-5449278086868932/5099597292", "167101606757479_1235753696558926", 3, null);
        d = a.b((Activity)this);
        a = (LinearLayout)this.findViewById(2131296527);
        b = (LinearLayout)this.findViewById(2131297226);
        c = (TextView)this.findViewById(2131297225);
        ImageView imageView = (ImageView)this.findViewById(2131296397);
        TextView textView = (TextView)this.findViewById(2131297528);
        String string = this.getIntent().getStringExtra("title");
        textView.setText((CharSequence)string);
        e = string.replace((CharSequence)" ", (CharSequence)"").toLowerCase();
        try {
            CheckListsDetails.a(this.getApplicationContext());
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        imageView.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ CheckListsDetails a;
            {
                this.a = checkListsDetails;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    protected void onDestroy() {
        c.c(this.f);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.f);
    }

    public void onResume() {
        super.onResume();
        c.a(this.f);
    }
}

