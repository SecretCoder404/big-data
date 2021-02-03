/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  java.lang.Boolean
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
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.msrtc.BusList;
import com.mobond.mindicator.ui.msrtc.MsrtcBusDepotNumber;
import com.mobond.mindicator.ui.n;
import java.util.ArrayList;
import java.util.Vector;

public class BusList
extends e {
    public static Vector<com.mulo.a.c.b> a = new Vector();
    public static ListView b;
    short c;
    short d;
    String e = null;
    String f;
    TextView g;
    TextView h;
    int i;
    b j;
    ImageView k;
    ImageView l;
    ArrayList<String> m = new ArrayList();
    Vector<com.mulo.a.c.b> n;
    Vector<String> o;
    TextView p;
    TextView q;
    LinearLayout r;
    private View s;

    public void a(String string) {
        this.n.clear();
        if (string.equals((Object)"AC")) {
            for (int i2 = 0; i2 < a.size(); ++i2) {
                if (!((com.mulo.a.c.b)BusList.a.get((int)i2)).b.contains((CharSequence)"AC")) continue;
                this.n.add(a.get(i2));
            }
            ListView listView = b;
            com.mobond.mindicator.ui.msrtc.b b2 = new com.mobond.mindicator.ui.msrtc.b(this, this.n, this.c, this.d, this.m);
            listView.setAdapter((ListAdapter)b2);
            if (this.n.size() == 0) {
                n.d((Context)this, "No Buses Found");
                return;
            }
        } else {
            ListView listView = b;
            com.mobond.mindicator.ui.msrtc.b b3 = new com.mobond.mindicator.ui.msrtc.b(this, a, this.c, this.d, this.m);
            listView.setAdapter((ListAdapter)b3);
            if (a.size() == 0) {
                n.d((Context)this, "No Buses Found");
            }
        }
    }

    public void actaxi(View view) {
        this.p.setBackgroundResource(2131231103);
        this.q.setBackgroundResource(2131231265);
        this.p.setTextColor(this.getResources().getColor(2131099748));
        this.q.setTextColor(this.getResources().getColor(2131099684));
        this.a("AC");
    }

    public void noactaxi(View view) {
        this.p.setBackgroundResource(2131231102);
        this.q.setBackgroundResource(2131231266);
        this.p.setTextColor(this.getResources().getColor(2131099684));
        this.q.setTextColor(this.getResources().getColor(2131099748));
        this.a("NONAC");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493068);
        this.j = a.a((Activity)this);
        this.j.a("msrtc_language", "marathi");
        this.n = new Vector();
        this.s = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/8836313246", "167101606757479_1239842059483423", "ca-app-pub-5449278086868932/4809142623", "167101606757479_1235754759892153", 3, null);
        b = (ListView)this.findViewById(2131297444);
        this.g = (TextView)this.findViewById(2131297354);
        this.h = (TextView)this.findViewById(2131297047);
        this.k = (ImageView)this.findViewById(2131296382);
        this.l = (ImageView)this.findViewById(2131297509);
        this.h.setSelected(true);
        this.p = (TextView)this.findViewById(2131296278);
        this.q = (TextView)this.findViewById(2131297044);
        this.r = (LinearLayout)this.findViewById(2131296316);
        Bundle bundle2 = this.getIntent().getExtras();
        int n2 = 0;
        if (bundle2 == null) {
            this.c = (short)-1;
            this.d = (short)-1;
            this.e = "";
            this.f = "";
            this.i = 0;
        } else {
            this.c = bundle2.getShort("source_index");
            this.d = bundle2.getShort("destination_index");
            this.e = bundle2.getString("stop_name");
            this.f = bundle2.getString("search_type");
            this.i = bundle2.getInt("bus_type");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("source i ");
        stringBuilder.append((int)this.c);
        Log.d((String)"msrtcatob", (String)stringBuilder.toString());
        this.g.setText((CharSequence)this.e);
        if (this.c != this.d) {
            this.k.setImageResource(2131231145);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("msrtc_72x72_white ");
            stringBuilder2.append(this.f);
            Log.d((String)"bustype", (String)stringBuilder2.toString());
        } else {
            this.k.setImageResource(2131230852);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("bus_btn_img ");
            stringBuilder3.append(this.f);
            Log.d((String)"bustype", (String)stringBuilder3.toString());
        }
        Boolean bl = false;
        while (n2 < a.size()) {
            if (((com.mulo.a.c.b)BusList.a.get((int)n2)).b.contains((CharSequence)"AC")) {
                bl = true;
                break;
            }
            ++n2;
        }
        if (!bl.booleanValue()) {
            this.r.setVisibility(8);
        }
        ListView listView = b;
        com.mobond.mindicator.ui.msrtc.b b2 = new com.mobond.mindicator.ui.msrtc.b(this, a, this.c, this.d, this.m);
        listView.setAdapter((ListAdapter)b2);
        this.l.setImageResource(2131230991);
        this.l.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ BusList a;
            {
                this.a = busList;
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void onClick(View var1_1) {
                try {
                    var2_2 = new android.app.Dialog((Context)this.a);
                    var2_2.requestWindowFeature(1);
                    var2_2.setContentView(2131493067);
                    var5_3 = (LinearLayout)var2_2.findViewById(2131297061);
                    var6_4 = (android.widget.Button)var2_2.findViewById(2131296790);
                    var7_5 = 0;
lbl8: // 2 sources:
                    do {
                        if (var7_5 >= this.a.o.size()) {
                            var6_4.setOnClickListener(new View.OnClickListener(this, var2_2){
                                final /* synthetic */ android.app.Dialog a;
                                final /* synthetic */ 1 b;
                                {
                                    this.b = var1_1;
                                    this.a = dialog;
                                }

                                public void onClick(View view) {
                                    this.b.a.n.clear();
                                    for (int i2 = 0; i2 < BusList.a.size(); ++i2) {
                                        for (int i3 = 0; i3 < this.b.a.m.size(); ++i3) {
                                            if (!((com.mulo.a.c.b)BusList.a.get((int)i2)).b.equalsIgnoreCase((String)this.b.a.m.get(i3))) continue;
                                            this.b.a.n.add(BusList.a.get(i2));
                                        }
                                    }
                                    ListView listView = BusList.b;
                                    com.mobond.mindicator.ui.msrtc.b b2 = new com.mobond.mindicator.ui.msrtc.b(this.b.a, this.b.a.n, this.b.a.c, this.b.a.d, this.b.a.m);
                                    listView.setAdapter((ListAdapter)b2);
                                    if (this.b.a.n.size() == 0) {
                                        n.d((Context)this.b.a, "No Buses Found");
                                    }
                                    n.a(this.a);
                                }
                            });
                            var2_2.show();
                            return;
                        }
                        var8_6 = new android.widget.CheckBox((Context)this.a);
                        var8_6.setText((CharSequence)this.a.o.get(var7_5));
                        var8_6.setId(var7_5);
                        var9_7 = 0;
                        break;
                    } while (true);
                }
                catch (java.lang.Exception var3_8) {
                    var3_8.printStackTrace();
                    return;
                }
                do {
                    if (var9_7 < this.a.m.size()) {
                        if (((String)this.a.m.get(var9_7)).equalsIgnoreCase((String)this.a.o.get(var7_5))) {
                            var8_6.setChecked(true);
                        }
                    } else {
                        var8_6.setOnCheckedChangeListener(new android.widget.CompoundButton$OnCheckedChangeListener(this, var7_5){
                            final /* synthetic */ int a;
                            final /* synthetic */ 1 b;
                            {
                                this.b = var1_1;
                                this.a = n2;
                            }

                            public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean bl) {
                                if (bl) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(" check ");
                                    stringBuilder.append(this.a);
                                    Log.d((String)"check", (String)stringBuilder.toString());
                                    this.b.a.m.add(this.b.a.o.get(this.a));
                                    return;
                                }
                                this.b.a.m.remove(this.b.a.o.get(this.a));
                            }
                        });
                        var5_3.addView((View)var8_6);
                        ++var7_5;
                        ** continue;
                    }
                    ++var9_7;
                } while (true);
            }
        });
        if (this.getIntent().hasExtra("ac") && this.getIntent().getStringExtra("ac").equalsIgnoreCase("true")) {
            this.p.setBackgroundResource(2131231103);
            this.q.setBackgroundResource(2131231265);
            this.p.setTextColor(this.getResources().getColor(2131099748));
            this.q.setTextColor(this.getResources().getColor(2131099684));
            this.a("AC");
        }
    }

    protected void onDestroy() {
        c.c(this.s);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.s);
    }

    public void onResume() {
        super.onResume();
        c.a(this.s);
    }

    public void openCallDepot(View view) {
        this.startActivity(new Intent((Context)this, MsrtcBusDepotNumber.class));
    }
}

