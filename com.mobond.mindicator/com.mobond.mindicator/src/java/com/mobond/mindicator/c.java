/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package com.mobond.mindicator;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.mobond.mindicator.e;
import com.mobond.mindicator.ui.g;
import java.util.ArrayList;
import java.util.List;

public class c
extends ArrayAdapter<e> {
    Context a;
    int b;
    ArrayList<e> c = new ArrayList();

    public c(Context context, int n2, ArrayList<e> arrayList) {
        super(context, n2, arrayList);
        this.b = n2;
        this.a = context;
        this.c = arrayList;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        a a2;
        if (view == null) {
            view = ((Activity)this.a).getLayoutInflater().inflate(this.b, viewGroup, false);
            a2 = new a();
            a2.a = (TextView)view.findViewById(2131296900);
            a2.b = (ImageView)view.findViewById(2131296897);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        e e2 = (e)this.c.get(n2);
        String string = e2.b();
        if (string.contains((CharSequence)"_")) {
            string = string.replace((CharSequence)"_", (CharSequence)" ");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toUpperCase((char)string.charAt(0)));
        stringBuilder.append(string.substring(1));
        String string2 = com.mulo.util.e.a(stringBuilder.toString(), new char[]{' '});
        if (string2.equalsIgnoreCase("msrtc")) {
            string2 = "MSRTC";
        }
        a2.a.setText((CharSequence)g.a(string2, g.a));
        a2.b.setImageBitmap(e2.a());
        return view;
    }

    static class a {
        TextView a;
        ImageView b;

        a() {
        }
    }

}

