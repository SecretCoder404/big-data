/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.Button
 *  android.widget.HorizontalScrollView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.bus;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.a;
import com.mobond.mindicator.ui.bus.BusActivity;
import com.mobond.mindicator.ui.bus.BusNumbersUI;
import com.mobond.mindicator.ui.bus.BusStopsUI;
import com.mobond.mindicator.ui.bus.DestinationSearchUI;
import com.mobond.mindicator.ui.bus.SourceDestinationUI;
import com.mobond.mindicator.ui.bus.SourceSearchUI;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.m;
import com.mobond.mindicator.ui.n;
import com.mulo.b.e;
import com.mulo.util.g;
import java.util.ArrayList;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class BusActivity
extends androidx.appcompat.app.e
implements View.OnClickListener {
    static ArrayList<String> a = new ArrayList();
    static Vector<String> b = null;
    static Vector<String> c = null;
    public int d = 0;
    public String e = "BEST";
    public String f = null;
    TextView g;
    TextView h;
    TextView i;
    ScrollView j;
    HorizontalScrollView k;
    String[] l = new String[]{"bus-service"};
    ArrayList<TextView> m;
    ArrayList<View> n;
    RelativeLayout o;
    RelativeLayout p;
    b q;
    View r;
    private Button s;
    private Button t;
    private TextView u;
    private String v = "";
    private String w = "";

    private void a() {
        View view = this.findViewById(2131296343);
        view.post(new Runnable(this, view){
            final /* synthetic */ View a;
            final /* synthetic */ BusActivity b;
            {
                this.b = busActivity;
                this.a = view;
            }

            public void run() {
                BusActivity busActivity = this.b;
                View view = this.a;
                busActivity.r = c.a((Activity)busActivity, view, null, null, "ca-app-pub-5449278086868932/4472911333", "167101606757479_1235752246559071", view.getWidth(), -1, 5, null);
            }
        });
    }

    private void b() {
        boolean bl;
        JSONObject jSONObject = new JSONObject(new String(com.mulo.util.e.a(com.mulo.util.e.a((Object)this, "../config.json"))).toString());
        int n2 = 0;
        for (int i2 = 0; i2 < jSONObject.getJSONArray("bus").length(); ++i2) {
            b.add((Object)jSONObject.getJSONArray("bus").getJSONObject(i2).getString("name"));
            c.add((Object)jSONObject.getJSONArray("bus").getJSONObject(i2).getString("fullname"));
            if (!jSONObject.getJSONArray("bus").getJSONObject(i2).getString("selected").equalsIgnoreCase("1")) continue;
            n2 = i2;
        }
        a.clear();
        for (int i3 = 0; i3 < b.size(); ++i3) {
            a.add(b.get(i3));
        }
        this.d = 0;
        this.e = (String)b.get(0);
        this.f = (String)c.get(0);
        this.setTitle((CharSequence)c.get(0));
        LayoutInflater layoutInflater = this.getLayoutInflater();
        LinearLayout linearLayout = (LinearLayout)this.findViewById(2131296466);
        this.m = new ArrayList();
        this.n = new ArrayList();
        for (int i4 = 0; i4 < b.size(); ++i4) {
            String string = (String)b.get(i4);
            RelativeLayout relativeLayout = (RelativeLayout)layoutInflater.inflate(2131492946, null);
            TextView textView = (TextView)relativeLayout.findViewById(2131296465);
            View view = relativeLayout.findViewById(2131297357);
            this.m.add((Object)textView);
            this.n.add((Object)view);
            textView.setOnClickListener(new View.OnClickListener(this, textView){
                final /* synthetic */ TextView a;
                final /* synthetic */ BusActivity b;
                {
                    this.b = busActivity;
                    this.a = textView;
                }

                public void onClick(View view) {
                    String string = this.a.getText().toString();
                    this.b.a(string);
                }
            });
            linearLayout.addView((View)relativeLayout);
            textView.setText((CharSequence)string);
        }
        String string = com.mobond.mindicator.a.a((Activity)this).b("last_selected_bus_service");
        int n3 = 0;
        do {
            int n4 = b.size();
            bl = false;
            if (n3 >= n4) break;
            if (((String)b.get(n3)).equals((Object)string)) {
                bl = true;
                break;
            }
            ++n3;
        } while (true);
        if (bl) {
            this.a(string);
            return;
        }
        this.a((String)b.get(n2));
    }

    public void a(String string) {
        this.getLayoutInflater();
        this.h.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        int n2 = 0;
        boolean bl = false;
        for (int i2 = 0; i2 < this.m.size(); ++i2) {
            TextView textView = (TextView)this.m.get(i2);
            View view = (View)this.n.get(i2);
            if (textView.getText().toString().equals((Object)string)) {
                this.d = i2;
                this.e = (String)b.get(i2);
                this.f = (String)c.get(i2);
                view.setVisibility(0);
                TextView textView2 = this.i;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  (");
                stringBuilder.append(this.f);
                stringBuilder.append(")");
                textView2.setText((CharSequence)stringBuilder.toString());
                textView.startAnimation(AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771997));
                bl = true;
            } else {
                view.setVisibility(8);
            }
            if (bl) continue;
            n2 += textView.getWidth();
        }
        this.k.smoothScrollTo(n2, 0);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.e);
            stringBuilder.append("SRC_SEARCH");
            String string2 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.e);
            stringBuilder2.append("DEST_SEARCH");
            String string3 = stringBuilder2.toString();
            this.v = com.mobond.mindicator.a.a((Activity)this).b(string2);
            this.w = com.mobond.mindicator.a.a((Activity)this).b(string3);
            if (this.v != null) {
                this.s.setText((CharSequence)this.v);
            } else {
                this.s.setText((CharSequence)"");
            }
            if (this.w != null) {
                this.t.setText((CharSequence)this.w);
            } else {
                this.t.setText((CharSequence)"");
            }
        }
        catch (Exception exception) {
            Log.d((String)"kkk", (String)"kkk Exception in onCreateView", (Throwable)exception);
        }
        com.mobond.mindicator.a.a((Activity)this).b("last_selected_bus_service", string);
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        String string;
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SourceDestinationUI onActivityResult called requestCode:");
        stringBuilder.append(n2);
        Log.d((String)"SourceDestinationUI", (String)stringBuilder.toString());
        super.onActivityResult(n2, n3, intent);
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("SourceDestinationUI b: ");
            stringBuilder2.append((Object)bundle);
            Log.d((String)"SourceDestinationUI", (String)stringBuilder2.toString());
            if (bundle != null) {
                this.v = bundle.getString("bus_stop1");
                this.w = bundle.getString("bus_stop2");
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("SourceDestinationUI source: ");
                stringBuilder3.append(this.v);
                Log.d((String)"SourceDestinationUI", (String)stringBuilder3.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("SourceDestinationUI destination: ");
                stringBuilder4.append(this.w);
                Log.d((String)"SourceDestinationUI", (String)stringBuilder4.toString());
            }
        }
        if ((string = this.v) != null) {
            this.s.setText((CharSequence)string);
        }
        if ((string2 = this.w) != null) {
            this.t.setText((CharSequence)string2);
        }
    }

    public void onBackPressed() {
        com.mulo.a.a.a.a();
        this.finish();
    }

    public void onClick(View view) {
        if (view == this.s) {
            Intent intent = new Intent(view.getContext(), SourceSearchUI.class);
            intent.putExtra("bus_route_id_key", this.e);
            intent.putExtra("bus_route_text_key", this.f);
            String string = this.s.getText().toString();
            String string2 = this.t.getText().toString();
            if (string != null && !string.equals((Object)"")) {
                intent.putExtra("bus_stop1", string);
            }
            if (string2 != null && !string2.equals((Object)"")) {
                intent.putExtra("bus_stop2", string2);
            }
            this.startActivityForResult(intent, 1);
            return;
        }
        if (view == this.t) {
            Intent intent = new Intent(view.getContext(), DestinationSearchUI.class);
            intent.putExtra("bus_route_id_key", this.e);
            intent.putExtra("bus_route_text_key", this.f);
            String string = this.s.getText().toString();
            String string3 = this.t.getText().toString();
            if (string != null && !string.equals((Object)"")) {
                intent.putExtra("bus_stop1", string);
            }
            if (string3 != null && !string3.equals((Object)"")) {
                intent.putExtra("bus_stop2", string3);
            }
            this.startActivityForResult(intent, 2);
            return;
        }
        if (view == this.u) {
            String string = this.v;
            if (string != null && !string.equals((Object)"") && this.v.compareToIgnoreCase("PICKUP") != 0) {
                String string4 = this.w;
                if (string4 != null && string4.compareToIgnoreCase("DESTINATION") != 0 && !this.w.equals((Object)"")) {
                    Intent intent = new Intent(view.getContext(), SourceDestinationUI.class);
                    intent.putExtra("bus_route_id_key", this.e);
                    intent.putExtra("bus_route_text_key", this.f);
                    intent.putExtra("source_stn", this.v);
                    intent.putExtra("destination_stn", this.w);
                    this.startActivity(intent);
                    return;
                }
                n.d((Context)this, "Please enter destination");
                return;
            }
            n.d((Context)this, "Please enter source");
            return;
        }
    }

    public void onClickAcBusTime(View view) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://mobondhrd.appspot.com/acbustimings.jsp?&routeid=");
        stringBuilder.append(this.e);
        stringBuilder.append("&isusingapi=false&time=");
        stringBuilder.append(System.currentTimeMillis());
        String string = e.a(stringBuilder.toString(), this.getApplicationContext());
        Intent intent = new Intent((Context)this, WebUI.class);
        g g2 = new g();
        com.mulo.util.e.a(g2.a(), g2);
        g2.a = string;
        intent.putExtra("webuidatakey", g2.a());
        this.startActivity(intent);
        com.mobond.mindicator.ui.multicity.a.a(view.getContext(), "BUS", this.f, "onClickAcBusTime");
    }

    public void onClickBusNumber(View view) {
        Intent intent = new Intent(view.getContext(), BusNumbersUI.class);
        intent.putExtra("bus_route_id_key", this.e);
        intent.putExtra("bus_route_text_key", this.f);
        this.startActivityForResult(intent, 0);
        com.mobond.mindicator.ui.multicity.a.a(view.getContext(), "BUS", this.f, "onClickBusNumber");
    }

    public void onClickBusStop(View view) {
        Intent intent = new Intent(view.getContext(), BusStopsUI.class);
        intent.putExtra("bus_route_id_key", this.e);
        intent.putExtra("bus_route_text_key", this.f);
        this.startActivityForResult(intent, 0);
        com.mobond.mindicator.ui.multicity.a.a(view.getContext(), "BUS", this.f, "onClickBusStop");
    }

    @SuppressLint(value={"NewApi"})
    protected void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.setContentView(2131492944);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        b = new Vector();
        c = new Vector();
        this.g = (TextView)this.findViewById(2131296425);
        this.g.setText((CharSequence)"m-Indicator");
        this.h = (TextView)this.findViewById(2131296533);
        this.h.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.i = (TextView)this.findViewById(2131297516);
        this.j = (ScrollView)this.findViewById(2131296457);
        this.k = (HorizontalScrollView)this.findViewById(2131296467);
        this.a();
        this.q = com.mobond.mindicator.a.a((Activity)this);
        this.s = (Button)this.findViewById(2131296460);
        this.t = (Button)this.findViewById(2131296450);
        this.u = (TextView)this.findViewById(2131296459);
        this.o = (RelativeLayout)this.findViewById(2131296456);
        this.p = (RelativeLayout)this.findViewById(2131296461);
        this.o.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ BusActivity a;
            {
                this.a = busActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BusNumbersUI.class);
                intent.putExtra("bus_route_id_key", this.a.e);
                intent.putExtra("bus_route_text_key", this.a.f);
                this.a.startActivityForResult(intent, 0);
                com.mobond.mindicator.ui.multicity.a.a(this.a.getApplicationContext(), "BUS", this.a.f, "onClickBusNumber");
            }
        });
        this.p.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ BusActivity a;
            {
                this.a = busActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BusStopsUI.class);
                intent.putExtra("bus_route_id_key", this.a.e);
                intent.putExtra("bus_route_text_key", this.a.f);
                this.a.startActivityForResult(intent, 0);
                BusActivity busActivity = this.a;
                com.mobond.mindicator.ui.multicity.a.a((Context)busActivity, "BUS", busActivity.f, "onClickBusStop");
            }
        });
        String string2 = this.v;
        if (string2 != null && !string2.equals((Object)"")) {
            this.s.setText((CharSequence)this.v);
        }
        if ((string = this.w) != null && !string.equals((Object)"")) {
            this.t.setText((CharSequence)this.w);
        }
        this.s.setOnClickListener((View.OnClickListener)this);
        this.t.setOnClickListener((View.OnClickListener)this);
        this.u.setOnClickListener((View.OnClickListener)this);
        try {
            this.b();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        a a2 = new a(new m(this){
            final /* synthetic */ BusActivity a;
            {
                this.a = busActivity;
            }

            public void a(View view) {
            }

            public void b(View view) {
                if (this.a.d > 0) {
                    BusActivity busActivity = this.a;
                    busActivity.d = -1 + busActivity.d;
                    this.a.a((String)BusActivity.b.get(this.a.d));
                }
            }

            public void c(View view) {
                if (this.a.d < -1 + BusActivity.b.size()) {
                    BusActivity busActivity = this.a;
                    busActivity.d = 1 + busActivity.d;
                    this.a.a((String)BusActivity.b.get(this.a.d));
                }
            }

            public void d(View view) {
            }
        });
        this.j.setOnTouchListener((View.OnTouchListener)a2);
    }

    protected void onDestroy() {
        c.c(this.r);
        this.m.clear();
        this.n.clear();
        super.onDestroy();
    }

    public void onPause() {
        c.b(this.r);
        super.onPause();
    }

    public void onResume() {
        c.a(this.r);
        super.onResume();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}

