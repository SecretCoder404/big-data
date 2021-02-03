/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.multicity.a
 *  com.mobond.mindicator.ui.train.TrainsAtStationUI
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.train;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mobond.mindicator.ui.train.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class j
extends ArrayAdapter<i> {
    Context a;
    LayoutInflater b;
    SharedPreferences c;
    String d;
    b e;
    boolean f = false;

    public j(Context context, boolean bl, ArrayList<i> arrayList) {
        super(context, 2131493147, arrayList);
        this.f = bl;
        this.e = com.mobond.mindicator.a.a(context);
        this.a = context;
        this.b = (LayoutInflater)context.getSystemService("layout_inflater");
        this.c = context.getSharedPreferences("m-indicator", 0);
        this.d = ConfigurationManager.b(context);
        this.a();
    }

    public static Vector<String> a(Context context, Vector<String> vector) {
        b b2 = new b(context);
        context.getSharedPreferences("m-indicator", 0);
        String string = b2.l(ConfigurationManager.b(context));
        Vector vector2 = new Vector();
        if (!string.trim().equals((Object)"")) {
            String[] arrstring = string.split(";");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                if (vector2.size() >= 2) {
                    return vector2;
                }
                String string2 = arrstring[i2];
                if (vector != null) {
                    if (vector.contains((Object)string2)) continue;
                    vector2.add((Object)string2);
                    continue;
                }
                vector2.add((Object)string2);
            }
        }
        return vector2;
    }

    public void a() {
        String string = this.e.n(this.d);
        this.clear();
        if (!string.trim().equals((Object)"")) {
            String[] arrstring = string.split(";");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string2 = arrstring[i2];
                if (string2.trim().equals((Object)"")) continue;
                String[] arrstring2 = string2.split(":");
                this.a(new i(arrstring2[0], arrstring2[1], arrstring2[2], Integer.parseInt((String)arrstring2[3])));
            }
        }
    }

    public void a(int n2) {
        if (n2 < this.getCount()) {
            this.remove(this.getItem(n2));
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < this.getCount(); ++i2) {
                stringBuffer.append(((i)this.getItem(i2)).a());
            }
            this.e.d(this.d, stringBuffer.toString());
            this.b();
        }
    }

    public void a(View view, final int n2) {
        view.startAnimation(AnimationUtils.loadAnimation((Context)this.a, (int)2130771973));
        new Handler().postDelayed(new Runnable(){

            public void run() {
                j.this.a(n2);
            }
        }, 200L);
    }

    public void a(i i2) {
        super.add((Object)i2);
    }

    public void a(String string, String string2, int n2, String string3) {
        Intent intent = new Intent(this.getContext(), TrainsAtStationUI.class);
        intent.putExtra("selected_route", string);
        intent.putExtra("you_are_at", string2);
        intent.putExtra("iscallfromfav", true);
        intent.putExtra("selected_direction", n2);
        intent.putExtra("selected_direction_end_stations", string3);
        com.mobond.mindicator.ui.multicity.a.a((Context)this.a, (String)"TRAIN", (String)"FAV_TRAIN_CLICKED", (String)"FAV_TRAIN");
        this.getContext().startActivity(intent);
    }

    public /* synthetic */ void add(Object object) {
        this.a((i)object);
    }

    public void b() {
        try {
            this.a();
            return;
        }
        catch (Exception exception) {
            this.e.o(this.d);
            return;
        }
    }

    public int getCount() {
        return super.getCount();
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(final int n2, final View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(2131493147, null, true);
            a a2 = new a();
            a2.a = (LinearLayout)view.findViewById(2131297499);
            a2.b = (TextView)view.findViewById(2131297560);
            a2.c = (Button)view.findViewById(2131296864);
            if (n2 == 0 && this.f) {
                view.findViewById(2131297663).setVisibility(8);
            } else {
                view.findViewById(2131297663).setVisibility(0);
            }
            view.setTag((Object)a2);
        }
        a a3 = (a)view.getTag();
        i i2 = (i)this.getItem(n2);
        TextView textView = a3.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i2.a);
        stringBuilder.append(" \u21e8 ");
        stringBuilder.append(i2.b);
        textView.setText((CharSequence)stringBuilder.toString());
        TextView textView2 = a3.b;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(i2.a);
        stringBuilder2.append(" \u21e8 ");
        stringBuilder2.append(i2.b);
        textView2.setText((CharSequence)stringBuilder2.toString());
        final String string = i2.c;
        final String string2 = i2.a;
        final int n3 = i2.d;
        final String string3 = i2.b;
        LinearLayout linearLayout = a3.a;
        View.OnClickListener onClickListener = new View.OnClickListener(){

            public void onClick(View view) {
                try {
                    j.this.a(string, string2, n3, string3);
                }
                catch (Exception exception) {}
            }
        };
        linearLayout.setOnClickListener(onClickListener);
        a3.c.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view2) {
                j.this.a(view, n2);
            }
        });
        return view;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    class a {
        protected LinearLayout a;
        protected TextView b;
        protected Button c;

        a() {
        }
    }

}

