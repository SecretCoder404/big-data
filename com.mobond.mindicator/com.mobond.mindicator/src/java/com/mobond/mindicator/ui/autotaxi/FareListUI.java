/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  androidx.appcompat.widget.Toolbar
 *  com.mobond.mindicator.ui.WebUI
 *  com.mobond.mindicator.ui.autotaxi.ComplaintNumberList
 *  com.mobond.mindicator.ui.autotaxi.NewFareCalculator
 *  com.mobond.mindicator.ui.multicity.a
 *  com.mulo.a.a
 *  com.mulo.a.b
 *  com.mulo.b.e
 *  com.mulo.util.g
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.autotaxi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.autotaxi.ComplaintNumberList;
import com.mobond.mindicator.ui.autotaxi.NewFareCalculator;
import com.mobond.mindicator.ui.autotaxi.a;
import com.mobond.mindicator.ui.c;
import com.mulo.b.e;
import com.mulo.util.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class FareListUI
extends Activity {
    private static Toolbar q;
    public boolean a = true;
    Activity b;
    String c;
    ListView d;
    ArrayList<String> e = new ArrayList();
    ArrayList<String> f = new ArrayList();
    ArrayList<String> g = new ArrayList();
    TextView h;
    TextView i;
    TextView j;
    TextView k;
    b l;
    ImageView m;
    TextView n;
    TextView o;
    LinearLayout p;
    private View r;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a() {
        block11 : {
            block9 : {
                block10 : {
                    this.e.clear();
                    this.f.clear();
                    this.g.clear();
                    var1_1 = this.c;
                    var2_2 = var1_1.hashCode();
                    if (var2_2 == 2020783) break block9;
                    if (var2_2 == 2567710) break block10;
                    if (var2_2 != 1670196155 || !var1_1.equals((Object)"COOLCAB")) ** GOTO lbl-1000
                    var3_3 = 2;
                    break block11;
                }
                if (!var1_1.equals((Object)"TAXI")) ** GOTO lbl-1000
                var3_3 = 1;
                break block11;
            }
            if (var1_1.equals((Object)"AUTO")) {
                var3_3 = 0;
            } else lbl-1000: // 3 sources:
            {
                var3_3 = -1;
            }
        }
        switch (var3_3) {
            default: {
                var8_4 = null;
                ** break;
            }
            case 2: {
                var19_5 = new StringBuilder();
                var19_5.append("TAXI".toLowerCase());
                var19_5.append(File.separator);
                var19_5.append("COOLCAB".toLowerCase());
                var8_4 = com.mulo.util.e.a((Object)this, var19_5.toString());
                ** break;
            }
            case 1: {
                var15_6 = new StringBuilder();
                var15_6.append("TAXI".toLowerCase());
                var15_6.append(File.separator);
                var15_6.append("TAXI".toLowerCase());
                var8_4 = com.mulo.util.e.a((Object)this, var15_6.toString());
                ** break;
            }
            case 0: 
        }
        var4_7 = new StringBuilder();
        var4_7.append("AUTO".toLowerCase());
        var4_7.append(File.separator);
        var4_7.append("AUTO".toLowerCase());
        var8_4 = com.mulo.util.e.a((Object)this, var4_7.toString());
lbl45: // 4 sources:
        if (var8_4 == null) return;
        var9_8 = new BufferedReader((Reader)new InputStreamReader(var8_4));
        do {
            if ((var10_9 = var9_8.readLine()) == null) {
                var8_4.close();
                return;
            }
            var11_10 = var10_9.split(",");
            this.e.add((Object)var11_10[0].trim());
            this.f.add((Object)var11_10[1].trim());
            this.g.add((Object)var11_10[2].trim());
        } while (true);
    }

    private void a(String string, boolean bl2) {
        String[] arrstring = this.a(bl2);
        this.d = (ListView)this.findViewById(16908298);
        int n2 = this.d.getSelectedItemPosition();
        a a2 = new a((Context)this, arrstring);
        this.d.setAdapter((ListAdapter)a2);
        this.d.setSelection(n2);
        this.d.setClickable(true);
        this.d.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                c.a();
            }
        });
    }

    private String[] a(boolean bl2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)this.e.get(i2));
            stringBuilder.append("#");
            stringBuilder.append((String)this.f.get(i2));
            stringBuilder.append("#");
            stringBuilder.append((String)this.g.get(i2));
            arrayList.add((Object)stringBuilder.toString());
        }
        return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
    }

    public void actaxi(View view) {
        this.n.setBackgroundResource(2131231103);
        this.o.setBackgroundResource(2131231265);
        this.n.setTextColor(this.getResources().getColor(2131099748));
        this.o.setTextColor(this.getResources().getColor(2131099684));
        this.a = Boolean.FALSE;
        this.c = "COOLCAB";
        this.a();
        boolean bl2 = com.mulo.a.a.a();
        try {
            this.a(this.c, bl2);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"fareListUI", (String)"fareListUI", (Throwable)exception);
            return;
        }
    }

    public void callComplainButtonHandler(View view) {
        com.mobond.mindicator.ui.multicity.a.a((Context)this.b, (String)"AUTO_SMALL TAXI_SMALL", (String)"AUTO_TAXI_COMPLAINT", (String)"button_press");
        this.startActivityForResult(new Intent(view.getContext(), ComplaintNumberList.class), 0);
    }

    public void moreInfoButtonHandler(View view) {
        AlertDialog.Builder builder;
        String string;
        block6 : {
            block5 : {
                try {
                    String string2 = com.mulo.a.a.a((String)this.c, (Activity)this);
                    builder = new AlertDialog.Builder((Context)this);
                    builder.setMessage((CharSequence)string2).setCancelable(false).setPositiveButton((CharSequence)"OK", new DialogInterface.OnClickListener(){

                        public void onClick(DialogInterface dialogInterface, int n2) {
                        }
                    });
                    string = "";
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
                if (!this.c.equals((Object)"AUTO")) break block5;
                string = "AUTO_SMALL FARE";
                break block6;
            }
            if (!this.c.equals((Object)"TAXI")) break block6;
            string = "TAXI_SMALL FARE";
        }
        builder.setTitle((CharSequence)string);
        builder.create().show();
    }

    public void noactaxi(View view) {
        this.n.setBackgroundResource(2131231102);
        this.o.setBackgroundResource(2131231266);
        this.n.setTextColor(this.getResources().getColor(2131099684));
        this.o.setTextColor(this.getResources().getColor(2131099748));
        this.a = Boolean.TRUE;
        this.c = "TAXI";
        this.a();
        boolean bl2 = com.mulo.a.a.a();
        try {
            this.a(this.c, bl2);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"fareListUI", (String)"fareListUI", (Throwable)exception);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"NewApi"})
    protected void onCreate(Bundle var1_1) {
        this.requestWindowFeature(1);
        this.setContentView(2131492938);
        this.l = com.mobond.mindicator.a.a(this);
        super.onCreate(var1_1);
        this.b = this;
        this.n = (TextView)this.findViewById(2131296278);
        this.o = (TextView)this.findViewById(2131297044);
        this.j = (TextView)this.findViewById(2131296613);
        this.k = (TextView)this.findViewById(2131297034);
        this.p = (LinearLayout)this.findViewById(2131296316);
        if (Build.VERSION.SDK_INT >= 21) {
            var13_2 = this.getWindow();
            var13_2.addFlags(Integer.MIN_VALUE);
            var13_2.clearFlags(67108864);
        }
        FareListUI.q = (Toolbar)this.findViewById(2131297523);
        FareListUI.q.setTitle(2131755070);
        FareListUI.q.setTitleTextColor(-1);
        var4_3 = (TextView)this.findViewById(2131297354);
        this.m = (ImageView)this.findViewById(2131296397);
        this.c = this.getIntent().getExtras().getString(com.mulo.a.b.d);
        if (this.c.equals((Object)"AUTO")) {
            var4_3.setText((CharSequence)"AUTO");
        } else {
            var4_3.setText((CharSequence)"TAXI");
        }
        var5_4 = com.mulo.a.a.a();
        var6_5 = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771982);
        if (var5_4) {
            this.j.startAnimation(var6_5);
        } else {
            this.k.startAnimation(var6_5);
        }
        this.a();
        {
            catch (Exception v0) {}
        }
        try {
            this.a(this.c, var5_4);
            ** GOTO lbl40
        }
        catch (Exception var7_6) {
            Log.d((String)"FareListUI", (String)"fareListUI", (Throwable)var7_6);
lbl40: // 2 sources:
            this.h = (TextView)this.findViewById(2131296425);
            this.h.setText((CharSequence)"m-Indicator");
            this.i = (TextView)this.findViewById(2131296533);
            this.i.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
            if (this.c.equals((Object)"AUTO")) {
                this.p.setVisibility(8);
                com.mobond.mindicator.ui.multicity.a.a((Context)this.b, (String)"AUTO_SMALL TAXI_SMALL", (String)"AUTO_SMALL_BUTTON_PRESS", (String)"AUTO_SMALL");
                var9_7 = "167101606757479_1239842692816693";
                var10_8 = "ca-app-pub-5449278086868932/6710571171";
                var11_9 = "167101606757479_1235749733225989";
                var12_10 = "ca-app-pub-5449278086868932/6199372042";
            } else {
                ((LinearLayout)this.findViewById(2131297469)).setVisibility(0);
                com.mobond.mindicator.ui.multicity.a.a((Context)this.b, (String)"AUTO_SMALL TAXI_SMALL", (String)"TAXI_SMALL_BUTTON_PRESS", (String)"TAXI_SMALL");
                var9_7 = "167101606757479_1239842902816672";
                var10_8 = "ca-app-pub-5449278086868932/1496583576";
                var11_9 = "167101606757479_1235758213225141";
                var12_10 = "ca-app-pub-5449278086868932/4583038044";
            }
            this.r = c.a(this, this.findViewById(2131296343), var12_10, var9_7, var10_8, var11_9, 3, null);
        }
        this.m.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                FareListUI.this.finish();
            }
        });
    }

    protected void onDestroy() {
        c.c(this.r);
        super.onDestroy();
    }

    public void onFareCalculator(View view) {
        this.startActivity(new Intent((Context)this, NewFareCalculator.class));
    }

    public void onPause() {
        super.onPause();
        c.b(this.r);
    }

    public void onResume() {
        super.onResume();
        c.a(this.r);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

    public void submitComplaint(View view) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://mobondhrd.appspot.com/autotaxidriverrating?city=");
        stringBuilder.append(ConfigurationManager.b(this.getApplicationContext()));
        stringBuilder.append("&vehicle=");
        stringBuilder.append(this.c.toLowerCase());
        String string = e.a((String)stringBuilder.toString(), (Context)this);
        Intent intent = new Intent((Context)this, WebUI.class);
        g g2 = new g();
        com.mulo.util.e.a(g2.a(), g2);
        g2.a = string;
        intent.putExtra("webuidatakey", g2.a());
        this.startActivity(intent);
    }

}

