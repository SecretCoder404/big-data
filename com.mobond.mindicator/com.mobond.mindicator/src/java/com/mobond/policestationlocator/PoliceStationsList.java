/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.ExpandableListAdapter
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnGroupClickListener
 *  android.widget.ExpandableListView$OnGroupExpandListener
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.policestationlocator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import com.mobond.policestationlocator.PoliceStationsList;
import com.mobond.policestationlocator.a.a;
import com.mobond.policestationlocator.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PoliceStationsList
extends e {
    int a = -1;
    private ExpandableListView b;
    private EditText c;
    private ArrayList<b> d;
    private HashMap<String, ArrayList<com.mobond.policestationlocator.b.a>> e;
    private a f;
    private RelativeLayout g;
    private RelativeLayout h;
    private Toolbar i;
    private TextWatcher j = new TextWatcher(this){
        final /* synthetic */ PoliceStationsList a;
        {
            this.a = policeStationsList;
        }

        public void afterTextChanged(android.text.Editable editable) {
            ((a)PoliceStationsList.a(this.a).getExpandableListAdapter()).getFilter().filter((java.lang.CharSequence)editable.toString());
            int n2 = PoliceStationsList.a(this.a).getExpandableListAdapter().getGroupCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                PoliceStationsList.a(this.a).collapseGroup(i2);
            }
        }

        public void beforeTextChanged(java.lang.CharSequence charSequence, int n2, int n3, int n4) {
        }

        public void onTextChanged(java.lang.CharSequence charSequence, int n2, int n3, int n4) {
        }
    };

    static /* synthetic */ ExpandableListView a(PoliceStationsList policeStationsList) {
        return policeStationsList.b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(String var1_1) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        try {
            var2_2 = new JSONArray(var1_1);
            var3_3 = 0;
lbl8: // 2 sources:
            do {
                if (var3_3 >= var2_2.length()) {
                    if (this.f == null) {
                        this.f = new a((Activity)this, this.d, this.e);
                    }
                    this.b.setAdapter((ExpandableListAdapter)this.f);
                    return;
                }
                var5_4 = var2_2.getJSONObject(var3_3).getJSONArray("l");
                var6_5 = 0;
                break;
            } while (true);
        }
        catch (JSONException var4_12) {
            var4_12.printStackTrace();
            return;
        }
        block4 : do {
            if (var6_5 >= var5_4.length()) {
                ++var3_3;
                ** continue;
            }
            this.d.add((Object)new b(var5_4.getJSONObject(var6_5).getString("n"), var5_4.getJSONObject(var6_5).getString("d")));
            var8_6 = new ArrayList();
            var9_7 = var5_4.getJSONObject(var6_5).getJSONArray("c");
            var10_8 = 0;
            do {
                if (var10_8 < var9_7.length()) {
                    var12_9 = var9_7.getJSONObject(var10_8).getString("t");
                    var13_10 = var9_7.getJSONObject(var10_8).getString("n");
                    var14_11 = var9_7.getJSONObject(var10_8).has("l") != false ? var9_7.getJSONObject(var10_8).getString("l") : "";
                    var8_6.add((Object)new com.mobond.policestationlocator.b.a(var12_9, var13_10, var14_11));
                    if (!var5_4.getJSONObject(var6_5).getString("p").equalsIgnoreCase("") && var10_8 == -1 + var9_7.length()) {
                        var8_6.add((Object)new com.mobond.policestationlocator.b.a("nav", "Open Map", var5_4.getJSONObject(var6_5).getString("p")));
                    }
                } else {
                    this.e.put((Object)var5_4.getJSONObject(var6_5).getString("n"), (Object)var8_6);
                    ++var6_5;
                    continue block4;
                }
                ++var10_8;
            } while (true);
            break;
        } while (true);
    }

    static /* synthetic */ EditText b(PoliceStationsList policeStationsList) {
        return policeStationsList.c;
    }

    private void b() {
        this.b = (ExpandableListView)this.findViewById(2131296730);
        this.c = (EditText)this.findViewById(2131297278);
        ((TextView)this.findViewById(2131297354)).setTextColor(Color.parseColor((String)"#ffffff"));
        this.g = (RelativeLayout)this.findViewById(2131296968);
        this.h = (RelativeLayout)this.findViewById(2131297275);
        ((ImageView)this.findViewById(2131297274)).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ PoliceStationsList a;
            {
                this.a = policeStationsList;
            }

            public void onClick(View view) {
                this.a.a();
                PoliceStationsList.b(this.a).requestFocus();
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)PoliceStationsList.b(this.a), 1);
            }
        });
        ((ImageView)this.findViewById(2131296396)).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ PoliceStationsList a;
            {
                this.a = policeStationsList;
            }

            public void onClick(View view) {
                PoliceStationsList.c(this.a).setVisibility(0);
                PoliceStationsList.d(this.a).setVisibility(8);
                PoliceStationsList.e(this.a).setBackgroundColor(-1095626);
                PoliceStationsList.b(this.a).setText((java.lang.CharSequence)"");
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(PoliceStationsList.b(this.a).getWindowToken(), 0);
            }
        });
        ((ImageView)this.findViewById(2131296865)).setColorFilter(-1);
    }

    static /* synthetic */ RelativeLayout c(PoliceStationsList policeStationsList) {
        return policeStationsList.g;
    }

    static /* synthetic */ RelativeLayout d(PoliceStationsList policeStationsList) {
        return policeStationsList.h;
    }

    static /* synthetic */ Toolbar e(PoliceStationsList policeStationsList) {
        return policeStationsList.i;
    }

    public void a() {
        this.g.setVisibility(8);
        this.h.setVisibility(0);
        this.c.setVisibility(0);
        this.i.setBackgroundColor(Color.parseColor((String)"#FFFFFF"));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493083);
        this.i = (Toolbar)this.findViewById(2131297523);
        this.i.setTitle(2131755070);
        this.i.setTitleTextColor(-1);
        this.setSupportActionBar(this.i);
        this.getSupportActionBar().a(false);
        this.b();
        this.a(this.getIntent().getStringExtra("mumbai_police_json"));
        this.c.addTextChangedListener(this.j);
        this.b.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener(this){
            final /* synthetic */ PoliceStationsList a;
            {
                this.a = policeStationsList;
            }

            public boolean onGroupClick(ExpandableListView expandableListView, View view, int n2, long l2) {
                if (this.a.a != -1 && this.a.a != n2) {
                    PoliceStationsList.a(this.a).collapseGroup(this.a.a);
                }
                if (PoliceStationsList.a(this.a).isGroupExpanded(n2)) {
                    PoliceStationsList.a(this.a).collapseGroup(n2);
                    return true;
                }
                if (android.os.Build$VERSION.SDK_INT >= 14) {
                    PoliceStationsList.a(this.a).expandGroup(n2, true);
                    return true;
                }
                PoliceStationsList.a(this.a).expandGroup(n2);
                return true;
            }
        });
        this.b.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener(this){
            final /* synthetic */ PoliceStationsList a;
            {
                this.a = policeStationsList;
            }

            public void onGroupExpand(int n2) {
                if (this.a.a != -1 && n2 != this.a.a) {
                    PoliceStationsList.a(this.a).collapseGroup(this.a.a);
                }
                PoliceStationsList.a(this.a).setSelection(n2);
                PoliceStationsList policeStationsList = this.a;
                policeStationsList.a = n2;
                ((android.view.inputmethod.InputMethodManager)policeStationsList.getSystemService("input_method")).hideSoftInputFromWindow(PoliceStationsList.b(this.a).getWindowToken(), 0);
            }
        });
    }

    protected void onStart() {
        super.onStart();
        this.findViewById(2131297274).performClick();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final /* synthetic */ PoliceStationsList a;
            {
                this.a = policeStationsList;
            }

            public void run() {
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)PoliceStationsList.b(this.a), 1);
            }
        }, 100L);
    }
}

