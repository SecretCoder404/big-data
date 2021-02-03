/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.FrameLayout
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.chat.ChatScreenHSV
 *  com.mobond.mindicator.ui.msrtc.BusList
 *  com.mobond.mindicator.ui.msrtc.MSRTCRouteDetailsUI
 *  com.mulo.a.c.b
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.msrtc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mobond.mindicator.ui.chat.ChatScreenHSV;
import com.mobond.mindicator.ui.msrtc.BusList;
import com.mobond.mindicator.ui.msrtc.MSRTCRouteDetailsUI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class b
extends BaseAdapter {
    private static LayoutInflater j;
    Vector<com.mulo.a.c.b> a;
    Activity b;
    short c;
    short d;
    com.mobond.mindicator.b e;
    String f;
    String g;
    String h;
    ArrayList i;

    public b(BusList busList, Vector<com.mulo.a.c.b> vector, short s2, short s3, ArrayList arrayList) {
        this.e = com.mobond.mindicator.a.a((Activity)busList);
        this.f = this.e.a("msrtc_language", "marathi");
        this.a = vector;
        this.b = busList;
        this.c = s2;
        this.d = s3;
        this.i = arrayList;
        j = (LayoutInflater)this.b.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.a.size();
    }

    public Object getItem(int n2) {
        return n2;
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(final int n2, View view, ViewGroup viewGroup) {
        a a2 = new a();
        View view2 = j.inflate(2131493069, null);
        a2.a = (TextView)view2.findViewById(2131296454);
        a2.b = (TextView)view2.findViewById(2131296463);
        a2.c = (TextView)view2.findViewById(2131296464);
        a2.d = view2.findViewById(2131296645);
        a2.e = (FrameLayout)view2.findViewById(2131296517);
        final com.mulo.a.c.b b2 = (com.mulo.a.c.b)this.a.get(n2);
        b2.h = this.c;
        b2.i = this.d;
        final String string = "";
        String[] arrstring = ((com.mulo.a.c.b)this.a.get((int)n2)).a.toLowerCase().split("to");
        String string2 = arrstring[0].toUpperCase().trim();
        String string3 = arrstring[1].toUpperCase().trim();
        if (((com.mulo.a.c.b)this.a.get((int)n2)).d != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((com.mulo.a.c.b)this.a.get((int)n2)).d);
            stringBuilder.append("   ");
            string = stringBuilder.toString();
        }
        TextView textView = a2.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        stringBuilder.append(" to ");
        stringBuilder.append(string3);
        textView.setText((CharSequence)stringBuilder.toString());
        if (b2.j != null) {
            TextView textView2 = a2.b;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(b2.j);
            stringBuilder2.append(" - ");
            stringBuilder2.append(b2.l);
            textView2.setText((CharSequence)stringBuilder2.toString());
        } else {
            a2.b.setVisibility(8);
            a2.d.setVisibility(4);
        }
        a2.c.setText((CharSequence)((com.mulo.a.c.b)this.a.get((int)n2)).b);
        this.g = ((com.mulo.a.c.b)this.a.get((int)n2)).a;
        String string4 = ((com.mulo.a.c.b)this.a.get((int)n2)).b;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(((com.mulo.a.c.b)this.a.get((int)n2)).a);
        stringBuilder3.append("-");
        stringBuilder3.append(string4);
        this.h = stringBuilder3.toString();
        if (string4.compareToIgnoreCase("DAY ORDINARY") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#ce394d"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("ORDINARY EXPRESS") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#e84359"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("SEMI LUXURY") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#4A148C"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("CITY BUS") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#0066ff"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("NIGHT EXPRESS") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#0D47A1"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("AC-SHIVNERI") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#79b3e0"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("MEDI") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#43C01E"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("JANATA") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#B05264"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("SEMI SLEEPER") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#66ABF4"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("AC-MAHABUS") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#AEC53B"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("MULTI AXLE SCANIA") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#42413F"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("MINI ORDINARY") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#ce394d"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        } else if (string4.compareToIgnoreCase("AC-SHEETAL") == 0) {
            a2.c.setBackgroundColor(Color.parseColor((String)"#522E3E"));
            a2.c.setTextColor(Color.parseColor((String)"#FFFFFF"));
        }
        a2.e.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String string3 = b.this.g;
                if (string != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append(" ");
                    stringBuilder.append(b.this.g);
                    string3 = stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MSRTC_");
                stringBuilder.append(b2.c);
                String string2 = stringBuilder.toString();
                Intent intent = new Intent((Context)b.this.b, ChatScreenHSV.class);
                intent.putExtra("CHATROOMKEY", string2);
                intent.putExtra("CHATROOMTITLE", string3);
                intent.putExtra("CHATROOMSUBTITLE", b2.b);
                intent.putExtra("CHATTYPE", "CHATTYPE_TITLE_SUBTITLE");
                intent.putExtra("HIDEAD", "false");
                b.this.b.startActivity(intent);
            }
        });
        view2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Position ");
                stringBuilder.append(n2);
                stringBuilder.append(" si ");
                stringBuilder.append((int)b.this.c);
                stringBuilder.append(" di ");
                stringBuilder.append((int)b.this.d);
                Log.d((String)"routevec", (String)stringBuilder.toString());
                Intent intent = new Intent((Context)b.this.b, MSRTCRouteDetailsUI.class);
                com.mulo.a.c.b b2 = (com.mulo.a.c.b)b.this.a.get(n2);
                b2.h = b.this.c;
                b2.i = b.this.d;
                intent.putExtra("lang", b.this.f);
                Bundle bundle = new Bundle();
                bundle.putSerializable("msrtc_route_code", (Serializable)b2);
                intent.putExtras(bundle);
                b.this.b.startActivity(intent);
            }
        });
        return view2;
    }

    public class a {
        TextView a;
        TextView b;
        TextView c;
        View d;
        FrameLayout e;
    }

}

