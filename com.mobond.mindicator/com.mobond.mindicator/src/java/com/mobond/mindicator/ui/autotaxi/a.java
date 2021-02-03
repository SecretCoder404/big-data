/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui.autotaxi;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

class a
extends ArrayAdapter<String> {
    private final Context a;
    private final String[] b;

    a(Context context, String[] arrstring) {
        super(context, 2131492939, (Object[])arrstring);
        this.a = context;
        this.b = arrstring;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater)this.a.getSystemService("layout_inflater");
            if (layoutInflater != null) {
                view = layoutInflater.inflate(2131492939, viewGroup, false);
                a a2 = new a();
                a2.a = (TextView)view.findViewById(2131296905);
                a2.b = (TextView)view.findViewById(2131296613);
                a2.c = (TextView)view.findViewById(2131297034);
                a2.d = (LinearLayout)view.findViewById(2131297442);
                view.setTag((Object)a2);
            } else {
                view = null;
            }
        }
        a a3 = (a)view.getTag();
        String[] arrstring = this.b[n2].split("#");
        a3.a.setText((CharSequence)arrstring[0].trim());
        a3.b.setText((CharSequence)arrstring[1].trim());
        a3.c.setText((CharSequence)arrstring[2].trim());
        if (n2 % 2 == 0) {
            a3.d.setBackgroundColor(this.a.getResources().getColor(2131099793));
            return view;
        }
        a3.d.setBackgroundColor(this.a.getResources().getColor(2131099748));
        return view;
    }

    static class a {
        TextView a;
        TextView b;
        TextView c;
        LinearLayout d;

        a() {
        }
    }

}

