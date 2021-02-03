/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.View
 *  android.widget.ListView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.msrtc;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mobond.mindicator.ui.msrtc.MsrtcBusDepotNumber;
import com.mobond.mindicator.ui.n;
import java.util.ArrayList;

public class MsrtcBusDepotNumber
extends e {
    b N;

    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        n.b((Activity)this, this.a((int)n2).i);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/8121404277", "167101606757479_1239842599483369", "ca-app-pub-5449278086868932/5000714311", "167101606757479_1235754479892181", 3);
        super.onCreate(bundle);
        this.N = a.a((Activity)this);
        String string = this.N.a("msrtc_language", "english");
        this.o();
        if (com.mobond.mindicator.fcm.a.a("msrtc_show_bottom_ads").equalsIgnoreCase("false")) {
            this.p();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-------------- ");
        stringBuilder.append(com.mulo.a.c.a.a((Activity)this).c.length);
        Log.d((String)"calldepo", (String)stringBuilder.toString());
        int n2 = 0;
        int n3 = 1;
        while (n2 < -2 + com.mulo.a.c.a.a((Activity)this).c.length) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(n2);
            stringBuilder2.append(" -- ");
            int n4 = n2 + 1;
            stringBuilder2.append(n4);
            stringBuilder2.append(" -- ");
            int n5 = n2 + 2;
            stringBuilder2.append(n5);
            Log.d((String)"calldepo", (String)stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("-------------- ");
            stringBuilder3.append(n3);
            Log.d((String)"calldepo", (String)stringBuilder3.toString());
            ++n3;
            d d2 = new d();
            String[] arrstring = com.mulo.a.c.a.a((Activity)this).c[n5].split("#");
            if (string.equalsIgnoreCase("Marathi")) {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(com.mulo.a.c.a.a((Activity)this).c[n4]);
                stringBuilder4.append(" - ");
                stringBuilder4.append(com.mulo.a.c.a.a((Activity)this).c[n2]);
                d2.b = stringBuilder4.toString();
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(arrstring[0]);
                stringBuilder5.append(" - ");
                stringBuilder5.append(arrstring[1]);
                d2.c = stringBuilder5.toString();
            } else {
                d2.b = com.mulo.a.c.a.a((Activity)this).c[n2];
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(arrstring[0]);
                stringBuilder6.append(" - ");
                stringBuilder6.append(arrstring[1]);
                d2.c = stringBuilder6.toString();
            }
            d2.i = arrstring[1];
            this.e.add((Object)d2);
            n2 = n5 + 1;
        }
        this.e();
        String string2 = this.getString(2131755405);
        this.b(string2);
        this.h(18);
        this.e(2131231145);
        this.f(2131230908);
        this.a(string2);
    }

    protected void onStart() {
        super.onStart();
        this.findViewById(2131297274).performClick();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final /* synthetic */ MsrtcBusDepotNumber a;
            {
                this.a = msrtcBusDepotNumber;
            }

            public void run() {
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)this.a.b, 1);
            }
        }, 100L);
    }
}

