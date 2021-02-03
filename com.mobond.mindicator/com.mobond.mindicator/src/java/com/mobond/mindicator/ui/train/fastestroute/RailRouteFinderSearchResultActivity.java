/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.Window
 *  android.widget.ExpandableListAdapter
 *  android.widget.ExpandableListView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.widget.Toolbar
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.train.fastestroute;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.FareActivity;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mobond.mindicator.ui.train.b;
import com.mulo.a.d.i;
import com.mulo.a.d.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class RailRouteFinderSearchResultActivity
extends BaseAppCompatActivity {
    l a;
    ArrayList<String> b;
    Toolbar c;
    ExpandableListView d;
    com.mobond.mindicator.ui.train.fastestroute.b e;
    com.mobond.mindicator.b f;
    TextView g;
    String h;
    Vector<Integer> i = new Vector();
    TextView j;
    String k = "#8F8F8F";
    int l;
    View m;

    private ArrayList<com.mobond.mindicator.ui.train.fastestroute.a> a(Vector<i> vector) {
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        while (n2 < vector.size()) {
            String string;
            int n3;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            ArrayList arrayList2;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            String string12;
            String string13;
            String string14;
            String string15;
            i i2;
            ArrayList arrayList3;
            String string16;
            String string17;
            String string18;
            String string19;
            String string20;
            String string21;
            block14 : {
                block13 : {
                    String string22;
                    block12 : {
                        String string23;
                        block11 : {
                            block10 : {
                                String string24;
                                block9 : {
                                    i2 = (i)vector.get(n2);
                                    string13 = i2.a;
                                    string4 = i2.b;
                                    string7 = i2.c;
                                    string11 = i2.d;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("");
                                    stringBuilder.append(i2.e);
                                    stringBuilder.toString();
                                    string16 = i2.f;
                                    string15 = i2.h;
                                    string3 = i2.p;
                                    string22 = i2.j;
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("");
                                    stringBuilder2.append(i2.k);
                                    string24 = stringBuilder2.toString();
                                    String string25 = i2.l;
                                    String string26 = string25 == null ? "" : string25;
                                    String string27 = i2.m;
                                    string14 = string27 == null ? "" : (string27.equalsIgnoreCase("s") ? "(Slow)" : (string27.equalsIgnoreCase("f") ? "(Fast)" : string27));
                                    ArrayList arrayList4 = i2.r;
                                    arrayList3 = i2.r == null ? new ArrayList() : arrayList4;
                                    ArrayList arrayList5 = i2.s;
                                    arrayList2 = i2.s == null ? new ArrayList() : arrayList5;
                                    string23 = i2.v;
                                    string6 = string26;
                                    string9 = i2.w;
                                    if (string23 == null) break block9;
                                    string19 = string24;
                                    if (!string23.equalsIgnoreCase("L") && !string23.equalsIgnoreCase("B")) break block10;
                                    string8 = i2.t;
                                    break block11;
                                }
                                string19 = string24;
                            }
                            string8 = null;
                        }
                        if (string23 == null) break block12;
                        string2 = string22;
                        if (!string23.equalsIgnoreCase("R") && !string23.equalsIgnoreCase("B")) break block13;
                        string21 = i2.t;
                        break block14;
                    }
                    string2 = string22;
                }
                string21 = null;
            }
            String string28 = string9 != null && (string9.equalsIgnoreCase("L") || string9.equalsIgnoreCase("B")) ? i2.u : null;
            String string29 = string9 != null && (string9.equalsIgnoreCase("R") || string9.equalsIgnoreCase("B")) ? i2.u : null;
            if (n2 == 0) {
                com.mobond.mindicator.ui.train.fastestroute.c c2 = com.mobond.mindicator.ui.train.fastestroute.c.a;
                int n4 = i2.n;
                string18 = string6;
                string17 = string19;
                string10 = string2;
                string20 = string3;
                string12 = string11;
                string = string7;
                String string30 = string20;
                string5 = string4;
                com.mobond.mindicator.ui.train.fastestroute.a a2 = new com.mobond.mindicator.ui.train.fastestroute.a(c2, string13, string15, string16, string8, string21, null, null, string30, n4);
                arrayList.add((Object)a2);
                n3 = n2;
            } else {
                string20 = string3;
                string12 = string11;
                string = string7;
                string5 = string4;
                string18 = string6;
                string17 = string19;
                string10 = string2;
                com.mobond.mindicator.ui.train.fastestroute.c c3 = com.mobond.mindicator.ui.train.fastestroute.c.h;
                int n5 = i2.n;
                String string31 = string20;
                n3 = n2;
                com.mobond.mindicator.ui.train.fastestroute.a a3 = new com.mobond.mindicator.ui.train.fastestroute.a(c3, string13, string15, string16, string8, string21, null, null, string31, n5);
                arrayList.add((Object)a3);
            }
            com.mobond.mindicator.ui.train.fastestroute.c c4 = com.mobond.mindicator.ui.train.fastestroute.c.d;
            StringBuilder stringBuilder = new StringBuilder();
            int n6 = g.a;
            String string32 = string12;
            stringBuilder.append(g.a(string32, n6));
            stringBuilder.append(" ");
            stringBuilder.append(g.a(string14, g.a));
            String string33 = stringBuilder.toString();
            int n7 = i2.n;
            com.mobond.mindicator.ui.train.fastestroute.a a4 = new com.mobond.mindicator.ui.train.fastestroute.a(c4, string33, null, null, null, null, null, null, string20, n7);
            arrayList.add((Object)a4);
            String string34 = string18;
            if (string34 != null && !string34.equals((Object)"")) {
                if (!string34.contains((CharSequence)"SHTL") && !string34.contains((CharSequence)"MEMU")) {
                    com.mobond.mindicator.ui.train.fastestroute.c c5 = com.mobond.mindicator.ui.train.fastestroute.c.d;
                    int n8 = i2.n;
                    com.mobond.mindicator.ui.train.fastestroute.a a5 = new com.mobond.mindicator.ui.train.fastestroute.a(c5, string34, null, null, null, null, null, null, string20, n8);
                    arrayList.add((Object)a5);
                } else {
                    String[] arrstring = string34.split(" ");
                    for (int i3 = 0; i3 < arrstring.length; ++i3) {
                        com.mobond.mindicator.ui.train.fastestroute.c c6 = com.mobond.mindicator.ui.train.fastestroute.c.d;
                        String string35 = arrstring[i3];
                        int n9 = i2.n;
                        com.mobond.mindicator.ui.train.fastestroute.a a6 = new com.mobond.mindicator.ui.train.fastestroute.a(c6, string35, null, null, null, null, null, null, string20, n9);
                        arrayList.add((Object)a6);
                    }
                }
            }
            com.mobond.mindicator.ui.train.fastestroute.c c7 = com.mobond.mindicator.ui.train.fastestroute.c.d;
            StringBuilder stringBuilder3 = new StringBuilder();
            int n10 = g.a;
            String string36 = string;
            stringBuilder3.append(g.a(string36, n10));
            stringBuilder3.append(" - ");
            stringBuilder3.append(g.a(string32, g.a));
            String string37 = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(g.a(string36, g.a));
            stringBuilder4.append(" - ");
            stringBuilder4.append(g.a(string32, g.a));
            String string38 = stringBuilder4.toString();
            int n11 = i2.n;
            com.mobond.mindicator.ui.train.fastestroute.a a7 = new com.mobond.mindicator.ui.train.fastestroute.a(c7, string37, null, string38, null, null, null, null, string20, n11);
            arrayList.add((Object)a7);
            String string39 = i2.b();
            int n12 = 1 + arrayList3.size();
            com.mobond.mindicator.ui.train.fastestroute.c c8 = com.mobond.mindicator.ui.train.fastestroute.c.e;
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(string39);
            stringBuilder5.append(" (");
            stringBuilder5.append(n12);
            String string40 = n12 > 1 ? " Stops" : " Stop";
            stringBuilder5.append(string40);
            stringBuilder5.append(")");
            String string41 = stringBuilder5.toString();
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(string39);
            stringBuilder6.append(" (");
            stringBuilder6.append(n12);
            String string42 = n12 > 1 ? "Stops" : "Stop";
            stringBuilder6.append(string42);
            stringBuilder6.append(")");
            String string43 = stringBuilder6.toString();
            int n13 = i2.n;
            com.mobond.mindicator.ui.train.fastestroute.a a8 = new com.mobond.mindicator.ui.train.fastestroute.a(c8, string41, null, string43, null, null, (ArrayList<String>)arrayList3, (ArrayList<String>)arrayList2, string20, n13);
            arrayList.add((Object)a8);
            int n14 = vector.size() - 1;
            int n15 = n3;
            if (n15 == n14) {
                com.mobond.mindicator.ui.train.fastestroute.c c9 = com.mobond.mindicator.ui.train.fastestroute.c.b;
                int n16 = i2.n;
                com.mobond.mindicator.ui.train.fastestroute.a a9 = new com.mobond.mindicator.ui.train.fastestroute.a(c9, string5, string10, string5, string28, string29, null, null, string20, n16);
                arrayList.add((Object)a9);
            } else {
                com.mobond.mindicator.ui.train.fastestroute.c c10 = com.mobond.mindicator.ui.train.fastestroute.c.g;
                int n17 = i2.n;
                com.mobond.mindicator.ui.train.fastestroute.a a10 = new com.mobond.mindicator.ui.train.fastestroute.a(c10, string5, string10, string5, string28, string29, null, null, string20, n17);
                arrayList.add((Object)a10);
                com.mobond.mindicator.ui.train.fastestroute.c c11 = com.mobond.mindicator.ui.train.fastestroute.c.f;
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append("Change Platform\nAbout ");
                String string44 = string17;
                stringBuilder7.append(string44);
                stringBuilder7.append(" min");
                String string45 = Integer.parseInt((String)string44) > 1 ? "s" : "";
                stringBuilder7.append(string45);
                String string46 = stringBuilder7.toString();
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append("Change Platform\nAbout ");
                stringBuilder8.append(string44);
                stringBuilder8.append(" min");
                String string47 = Integer.parseInt((String)string44) > 1 ? "s" : "";
                stringBuilder8.append(string47);
                String string48 = stringBuilder8.toString();
                int n18 = i2.n;
                com.mobond.mindicator.ui.train.fastestroute.a a11 = new com.mobond.mindicator.ui.train.fastestroute.a(c11, string46, null, string48, null, null, null, null, string20, n18);
                arrayList.add((Object)a11);
            }
            n2 = n15 + 1;
        }
        return arrayList;
    }

    private void a(ArrayList<com.mobond.mindicator.ui.train.fastestroute.a> arrayList) {
        if (arrayList == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout)this.findViewById(2131296358);
        this.m = c.a((Activity)this, (View)linearLayout, "ca-app-pub-5449278086868932/1588077097", "167101606757479_1239839199483709", "ca-app-pub-5449278086868932/5164365847", "167101606757479_1235756383225324", 3, null);
        this.e = new com.mobond.mindicator.ui.train.fastestroute.b((Context)this, arrayList, (View)linearLayout);
        this.d.setAdapter((ExpandableListAdapter)this.e);
    }

    @SuppressLint(value={"NewApi"})
    public void a(l l2, ArrayList<String> arrayList) {
        if (l2 != null && arrayList != null) {
            this.a = l2;
            this.b = arrayList;
        }
        this.f = a.a((Activity)this);
        this.h = ConfigurationManager.b(this.getApplicationContext());
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        this.c = (Toolbar)this.findViewById(2131297523);
        this.c.setTitle((CharSequence)"Mumbai");
        this.c.setSubtitle(2131755070);
        this.c.setTitleTextColor(-1);
        this.g = (TextView)this.findViewById(2131296533);
        this.g.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.j = (TextView)this.findViewById(2131297124);
        this.d = (ExpandableListView)this.findViewById(2131296733);
        this.d.setGroupIndicator(null);
        this.d.setSelector(this.getResources().getDrawable(2131100272));
        this.d.setIndicatorBounds(0, 100);
        this.d.setDividerHeight(0);
        this.d.setVerticalScrollBarEnabled(false);
        this.registerForContextMenu((View)this.d);
        TextView textView = (TextView)this.findViewById(2131297515);
        TextView textView2 = (TextView)this.findViewById(2131296904);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(g.a(((i)this.a.d.firstElement()).a, g.a));
        stringBuilder.append("-");
        stringBuilder.append(g.a(((i)this.a.d.lastElement()).b, g.a));
        textView.setText((CharSequence)stringBuilder.toString());
        textView2.setText((CharSequence)this.a.c());
        if (this.a.a() > 300) {
            n.d((Context)this, "Too much journey time\nAlso check other via routes");
        }
        this.a(this.a(this.a.d));
    }

    public void onChangeRouteClicked(View view) {
        this.i.removeAllElements();
        b.a((Activity)this, this.l, true);
    }

    @SuppressLint(value={"NewApi"})
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493116);
        if (TrainsAtStationUI.j() && !TrainsAtStationUI.a((Context)this)) {
            TrainsAtStationUI.a((Activity)this);
        }
        Bundle bundle2 = this.getIntent().getExtras();
        this.a = (l)bundle2.getSerializable("tr");
        this.b = (ArrayList)bundle2.getSerializable("viaroutesArrayList");
        this.a(this.a, this.b);
        this.j.setTextColor(Color.parseColor((String)this.k));
        this.j.setClickable(false);
        boolean bl = this.getIntent().getExtras().getBoolean("isdestsearch", false);
        this.l = this.getIntent().getExtras().getInt("tm", 0);
        if (bl) {
            ((TextView)this.findViewById(2131297243)).setVisibility(8);
            ((LinearLayout)this.findViewById(2131297453)).setWeightSum(3.0f);
        }
    }

    public void onNextClicked(View view) {
        int n2 = 1 + this.a.e;
        l l2 = com.mulo.a.d.b.b(this.a.a, this.a.b, this.a.g, n2, false, (Object)this);
        if (l2 != null) {
            this.i.add((Object)this.a.e);
            this.j.setTextColor(-1);
            this.j.setClickable(true);
            this.a = l2;
            this.a(this.a, this.b);
        }
    }

    public void onPreviousClicked(View view) {
        if (this.i.size() > 0) {
            int n2 = (Integer)this.i.lastElement();
            Vector<Integer> vector = this.i;
            vector.removeElementAt(-1 + vector.size());
            l l2 = com.mulo.a.d.b.b(this.a.a, this.a.b, this.a.g, n2, false, (Object)this);
            if (l2 != null) {
                this.a = l2;
                this.a(this.a, this.b);
                return;
            }
        } else {
            this.j.setTextColor(Color.parseColor((String)this.k));
            this.j.setClickable(false);
        }
    }

    public void onSpeeditClicked(View view) {
        b.a((Activity)this, this.b, this.a.g, this.a.e, true, true, false, this.a.a, this.a.b, this.a.b());
    }

    public void onTicketFareClicked(View view) {
        Intent intent = new Intent((Context)this, FareActivity.class);
        String string = this.getIntent().hasExtra("source_stn") ? this.getIntent().getStringExtra("source_stn") : null;
        boolean bl = this.getIntent().hasExtra("destination_stn");
        String string2 = null;
        if (bl) {
            string2 = this.getIntent().getStringExtra("destination_stn");
        }
        if (string != null && string2 != null) {
            intent.putExtra("source_stn", string);
            intent.putExtra("destination_stn", string2);
        }
        this.startActivity(intent);
    }
}

