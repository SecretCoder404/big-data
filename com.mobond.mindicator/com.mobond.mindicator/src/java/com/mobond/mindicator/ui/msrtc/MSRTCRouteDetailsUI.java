/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  java.io.PrintStream
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.msrtc;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.mobond.mindicator.fcm.a;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mobond.mindicator.ui.msrtc.MSRTCRouteDetailsUI;
import com.mulo.a.c.b;
import com.mulo.a.c.c;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class MSRTCRouteDetailsUI
extends e {
    SharedPreferences N;
    String O;
    String P;
    String Q;
    Vector<com.mulo.a.c.d> R;
    b S;
    int T;
    int U;
    LinearLayout V;
    String W;
    String X;

    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        super.a(listView, view, n2, l2);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/9843348351", "167101606757479_1239842449483384", "ca-app-pub-5449278086868932/1033549143", "167101606757479_1235754863225476", 3);
        super.onCreate(bundle);
        this.c(true);
        this.h(18);
        int n2 = 0;
        this.N = this.getSharedPreferences("m-indicator", 0);
        this.O = this.N.getString("city", "mumbai");
        this.S = (b)this.getIntent().getExtras().getSerializable("msrtc_route_code");
        this.W = this.getIntent().getExtras().getString("lang");
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("## assgn.busServiceNumber : ");
        stringBuilder.append(this.S.c);
        printStream.println(stringBuilder.toString());
        if (a.a("msrtc_show_bottom_ads").equalsIgnoreCase("false")) {
            this.p();
        }
        this.q();
        ((ImageButton)this.findViewById(2131296471)).setVisibility(8);
        ((ImageButton)this.findViewById(2131296472)).setVisibility(8);
        this.R = com.mulo.a.c.a.a((Activity)this).a(this.S);
        this.V = (LinearLayout)this.findViewById(2131296419);
        this.T = this.S.m;
        this.U = this.S.n;
        while (n2 < this.R.size()) {
            d d2 = new d();
            if (n2 == 0) {
                this.X = ((com.mulo.a.c.d)this.R.get((int)n2)).d;
            }
            if (((com.mulo.a.c.d)this.R.get((int)n2)).d != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(((com.mulo.a.c.d)this.R.get((int)n2)).d);
                stringBuilder2.append(", ");
                stringBuilder2.append(((com.mulo.a.c.d)this.R.get((int)n2)).a.a);
                d2.b = stringBuilder2.toString();
            } else {
                d2.b = ((com.mulo.a.c.d)this.R.get((int)n2)).a.a;
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Boarding:");
            stringBuilder3.append(((com.mulo.a.c.d)this.R.get((int)n2)).b);
            String string = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Alighting:");
            stringBuilder4.append(((com.mulo.a.c.d)this.R.get((int)n2)).c);
            String string2 = stringBuilder4.toString();
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(((com.mulo.a.c.d)this.R.get((int)n2)).a.b);
            stringBuilder5.append(", ");
            stringBuilder5.append(((com.mulo.a.c.d)this.R.get((int)n2)).a.c);
            stringBuilder5.append("\n");
            stringBuilder5.append(string);
            stringBuilder5.append(", ");
            stringBuilder5.append(string2);
            d2.c = stringBuilder5.toString();
            if (n2 == this.T) {
                d2.e = -16711936;
            }
            if (n2 == this.U) {
                d2.e = Color.parseColor((String)"#FF9800");
            }
            this.e.add((Object)d2);
            ++n2;
        }
        this.e();
        this.P = this.S.a;
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(this.X);
        stringBuilder6.append("-");
        stringBuilder6.append(this.S.a);
        stringBuilder6.append("-");
        stringBuilder6.append(this.S.b);
        this.Q = stringBuilder6.toString();
        this.b(this.P);
        this.e(2131231145);
        this.V.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MSRTCRouteDetailsUI a;
            {
                this.a = mSRTCRouteDetailsUI;
            }

            public void onClick(View view) {
                String string = this.a.P;
                if (this.a.X != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.a.X);
                    stringBuilder.append(" ");
                    stringBuilder.append(this.a.P);
                    string = stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MSRTC_");
                stringBuilder.append(this.a.S.c);
                String string2 = stringBuilder.toString();
                Intent intent = new Intent((android.content.Context)this.a, com.mobond.mindicator.ui.chat.ChatScreenHSV.class);
                intent.putExtra("CHATROOMKEY", string2);
                intent.putExtra("CHATROOMTITLE", string);
                intent.putExtra("CHATROOMSUBTITLE", this.a.S.b);
                intent.putExtra("CHATTYPE", "CHATTYPE_TITLE_SUBTITLE");
                intent.putExtra("HIDEAD", "false");
                this.a.startActivity(intent);
                MSRTCRouteDetailsUI mSRTCRouteDetailsUI = this.a;
                com.mobond.mindicator.ui.n.d((android.content.Context)mSRTCRouteDetailsUI, mSRTCRouteDetailsUI.getString(2131755406));
            }
        });
        this.j(this.T);
    }
}

