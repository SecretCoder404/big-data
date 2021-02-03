/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  I
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Array
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.train;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.SelectDirectionUI;
import com.mobond.mindicator.ui.train.SelectYouAreAtUI;
import com.mulo.a.d.d;
import com.mulo.a.d.h;
import com.mulo.util.e;
import java.lang.reflect.Array;
import org.json.JSONArray;
import org.json.JSONObject;

public class SelectDirectionUI
extends BaseAppCompatActivity
implements com.mulo.b.a {
    private static String p;
    private static String q;
    private static String r;
    private static Toolbar s;
    String a;
    boolean b = false;
    boolean c = false;
    View d;
    String e = "METROFARE";
    String f;
    TextView g;
    TextView h;
    ImageButton i;
    ImageButton j;
    String k;
    TextView l;
    TextView m;
    b n;
    LinearLayout o;

    private String a(String string) {
        String[] arrstring = string.split(",");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            string = string.replace((CharSequence)arrstring[i2].trim(), (CharSequence)g.a(arrstring[i2].trim(), g.a));
        }
        return string;
    }

    private void b() {
    }

    @Override
    public void a() {
        n.d((Context)this, "Please Check Internet");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(byte[] var1_1, byte[] var2_2, Object var3_3) {
        if (var3_3 == null) ** GOTO lbl31
        try {
            if (!var3_3.equals((Object)this.e)) ** GOTO lbl31
            var5_4 = new JSONObject(new String(var1_1));
            var6_5 = (int[][])Array.newInstance(I.class, (int[])new int[]{12, 12});
            var7_6 = var5_4.getJSONArray("metrotokenfare");
            var8_7 = var7_6.length();
            var9_8 = 0;
            do {
                if (var9_8 < var8_7) {
                    var10_9 = var7_6.getJSONArray(var9_8);
                    var11_10 = var10_9.length();
                } else {
                    d.b = var6_5;
                    var13_12 = (int[][])Array.newInstance(I.class, (int[])new int[]{12, 12});
                    var14_13 = var5_4.getJSONArray("metrosmartcardfare");
                    var15_14 = var14_13.length();
                    var16_15 = 0;
                    break;
                }
                for (var12_11 = 0; var12_11 < var11_10; ++var12_11) {
                    var6_5[var9_8][var12_11] = var10_9.getInt(var12_11);
                }
                ++var9_8;
            } while (true);
lbl25: // 2 sources:
            do {
                if (var16_15 < var15_14) {
                    var17_16 = var14_13.getJSONArray(var16_15);
                    var18_17 = var17_16.length();
                    break;
                }
                d.a = var13_12;
lbl31: // 3 sources:
                this.b();
                return;
                break;
            } while (true);
        }
        catch (Exception var4_19) {
            var4_19.printStackTrace();
            return;
        }
        for (var19_18 = 0; var19_18 < var18_17; ++var19_18) {
            var13_12[var16_15][var19_18] = var17_16.getInt(var19_18);
        }
        ++var16_15;
        ** while (true)
    }

    public void myClickHandler(View view) {
        if (view.getId() == 2131297647 || view.getId() == 2131296689 || view.getId() == 2131296911 || view.getId() == 2131296910) {
            int n2;
            if (view.getId() != 2131297647 && view.getId() != 2131296911) {
                if (view.getId() != 2131296689 && view.getId() != 2131296910) {
                    n2 = 0;
                } else {
                    n2 = h.e;
                    this.k = this.m.getText().toString();
                }
            } else {
                n2 = h.d;
                this.k = this.l.getText().toString();
            }
            Intent intent = new Intent(view.getContext(), SelectYouAreAtUI.class);
            intent.putExtra("selected_route", this.a);
            intent.putExtra("selected_direction", n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TrainHistory in SelectDirection selected_direction_end_stations:");
            stringBuilder.append(this.k);
            Log.d((String)"TrainHistory", (String)stringBuilder.toString());
            intent.putExtra("selected_direction_end_stations", this.k);
            intent.putExtra("skip_trains_at_station_ui", "yes");
            this.startActivityForResult(intent, 0);
        }
    }

    @SuppressLint(value={"NewApi"})
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = false;
        this.n = a.a((Activity)this);
        this.f = this.n.a("city", "mumbai");
        this.setContentView(2131493127);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        s = (Toolbar)this.findViewById(2131297523);
        s.setTitle((CharSequence)"Mumbai");
        s.setSubtitle(2131755070);
        s.setTitleTextColor(-1);
        this.setSupportActionBar(s);
        ((TextView)this.findViewById(2131296536)).setTextColor(Color.parseColor((String)"#ffffff"));
        this.a = this.getIntent().getExtras().getString("selected_route");
        String[] arrstring = h.a(this.a, this);
        this.l = (TextView)this.findViewById(2131297648);
        this.m = (TextView)this.findViewById(2131296690);
        this.l.setText((CharSequence)this.a(arrstring[0]));
        this.m.setText((CharSequence)this.a(arrstring[1]));
        this.setTitle(2131755070);
        this.d = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/8535262043", "167101606757479_1239838852817077", "ca-app-pub-5449278086868932/8654208238", "167101606757479_1235757266558569", 3, null);
        this.g = (TextView)this.findViewById(2131296425);
        this.h = (TextView)this.findViewById(2131296533);
        this.h.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.i = (ImageButton)this.findViewById(2131297647);
        this.j = (ImageButton)this.findViewById(2131296689);
        ((LinearLayout)this.findViewById(2131296911)).setOnTouchListener(new View.OnTouchListener(this){
            final /* synthetic */ SelectDirectionUI a;
            {
                this.a = selectDirectionUI;
            }

            public boolean onTouch(View view, android.view.MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.a.i.setPressed(true);
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    this.a.i.setPressed(false);
                }
                return false;
            }
        });
        ((LinearLayout)this.findViewById(2131296910)).setOnTouchListener(new View.OnTouchListener(this){
            final /* synthetic */ SelectDirectionUI a;
            {
                this.a = selectDirectionUI;
            }

            public boolean onTouch(View view, android.view.MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.a.j.setPressed(true);
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    this.a.j.setPressed(false);
                }
                return false;
            }
        });
        this.o = (LinearLayout)this.findViewById(2131296986);
        View view = this.findViewById(2131296923);
        if (!this.a.equals((Object)"MM1WD")) {
            this.o.getLayoutParams().height = 0;
            view.getLayoutParams().height = 0;
        }
    }

    protected void onDestroy() {
        c.c(this.d);
        super.onDestroy();
        this.c = true;
    }

    public void onMetroRechargeClick(View view) {
        Intent intent = new Intent((Context)this, WebUI.class);
        com.mulo.util.g g2 = new com.mulo.util.g();
        e.a(g2.a(), g2);
        g2.a = "http://mobondhrd.appspot.com/mumbaimetrorecharge?";
        intent.putExtra("webuidatakey", g2.a());
        this.startActivity(intent);
    }

    public void onPause() {
        super.onPause();
        c.b(this.d);
    }

    public void onResume() {
        super.onResume();
        c.a(this.d);
    }
}

