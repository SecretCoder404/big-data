/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  com.google.android.gms.ads.g
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URL
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.bus;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.ads.g;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.bus.DestinationSearchUI;
import com.mobond.mindicator.ui.bus.SourceDestinationUI;
import com.mobond.mindicator.ui.bus.SourceSearchUI;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.n;
import com.mulo.a.a.b;
import com.mulo.util.e;
import java.net.URL;
import java.util.ArrayList;
import java.util.Vector;

public class SourceDestinationUI
extends androidx.appcompat.app.e
implements View.OnClickListener {
    public g a;
    String[] b = new String[]{"bus-service"};
    TextView c;
    TextView d;
    ArrayList<String> e = new ArrayList();
    LinearLayout f;
    LinearLayout g;
    float h;
    Handler i = new Handler();
    Activity j;
    private Toolbar k;
    private Button l;
    private Button m;
    private TextView n;
    private String o = "";
    private String p = "";
    private Vector<b> q;
    private String r;
    private String s;
    private ProgressDialog t;

    private ViewGroup a(Context context, b b2) {
        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this).inflate(2131492945, (ViewGroup)this.f, false);
        TextView textView = (TextView)viewGroup.findViewById(2131296454);
        TextView textView2 = (TextView)viewGroup.findViewById(2131297538);
        textView.setText((CharSequence)b2.a.substring(0, b2.a.indexOf(35)));
        this.a(context, b2.a.substring(0, b2.a.indexOf(35)), b2, false, textView);
        if (b2.h) {
            viewGroup.findViewById(2131296646).setVisibility(8);
            viewGroup.findViewById(2131296455).setVisibility(8);
            TextView textView3 = (TextView)viewGroup.findViewById(2131296506);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Stops: ");
            stringBuilder.append(b2.g);
            textView2.setText((CharSequence)stringBuilder.toString());
            textView3.setVisibility(8);
            return viewGroup;
        }
        viewGroup.findViewById(2131296646).setVisibility(0);
        TextView textView4 = (TextView)viewGroup.findViewById(2131296455);
        textView4.setVisibility(0);
        textView4.setText((CharSequence)b2.f.substring(0, b2.f.indexOf(35)));
        this.a(context, b2.f.substring(0, b2.f.indexOf(35)), b2, true, textView4);
        TextView textView5 = (TextView)viewGroup.findViewById(2131296506);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CHANGE AT: ");
        stringBuilder.append(e.d(b2.c).toUpperCase());
        textView5.setText((CharSequence)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Stops: ");
        stringBuilder2.append(b2.g);
        textView2.setText((CharSequence)stringBuilder2.toString());
        return viewGroup;
    }

    private void a(Context context, String string, b b2, boolean bl, TextView textView) {
        textView.setTag((Object)b2);
        textView.setText((CharSequence)string);
        textView.setSingleLine(true);
        textView.setOnClickListener(new View.OnClickListener(this, textView, bl){
            final /* synthetic */ TextView a;
            final /* synthetic */ boolean b;
            final /* synthetic */ SourceDestinationUI c;
            {
                this.c = sourceDestinationUI;
                this.a = textView;
                this.b = bl;
            }

            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), com.mobond.mindicator.ui.bus.BusRouteUI.class);
                intent.putExtra("bus_route_id_key", SourceDestinationUI.a(this.c));
                intent.putExtra("bus_route_text_key", SourceDestinationUI.b(this.c));
                String string = this.a.getText().toString().trim();
                if (!string.equals((Object)"")) {
                    if (string.startsWith(">")) {
                        string = string.substring(1, string.length()).trim();
                    }
                    b b2 = (b)this.a.getTag();
                    intent.putExtra("bus_number", string);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("source ");
                    stringBuilder.append(SourceDestinationUI.c(this.c));
                    stringBuilder.append(" midpointstopname ");
                    stringBuilder.append(b2.c);
                    stringBuilder.append(" dest ");
                    stringBuilder.append(SourceDestinationUI.d(this.c));
                    Log.d((String)"marker", (String)stringBuilder.toString());
                    if (!this.b) {
                        intent.putExtra("bus_number_mark1", SourceDestinationUI.c(this.c));
                        if (b2.c.startsWith("From")) {
                            intent.putExtra("bus_number_mark2", SourceDestinationUI.d(this.c));
                        } else {
                            intent.putExtra("bus_number_mark2", b2.c);
                        }
                    } else {
                        intent.putExtra("bus_number_mark1", b2.c);
                        intent.putExtra("bus_number_mark2", SourceDestinationUI.d(this.c));
                    }
                    this.c.startActivityForResult(intent, 0);
                    new java.lang.Thread(this){
                        final /* synthetic */ 1 a;
                        {
                            this.a = var1_1;
                        }

                        public void run() {
                            try {
                                java.lang.Thread.sleep((long)500L);
                            }
                            catch (Exception exception) {}
                        }
                    }.start();
                }
            }
        });
    }

    static /* synthetic */ String b(SourceDestinationUI sourceDestinationUI) {
        return sourceDestinationUI.s;
    }

    private void c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.r);
        stringBuilder.append("SRC_SEARCH");
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.r);
        stringBuilder2.append("DEST_SEARCH");
        String string2 = stringBuilder2.toString();
        com.mobond.mindicator.a.a((Activity)this).b(string, this.o);
        com.mobond.mindicator.a.a((Activity)this).b(string2, this.p);
    }

    private void d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.r);
        stringBuilder.append("SRC_SEARCH");
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.r);
        stringBuilder2.append("DEST_SEARCH");
        String string2 = stringBuilder2.toString();
        com.mobond.mindicator.a.a(this.j).d(string);
        com.mobond.mindicator.a.a(this.j).d(string2);
    }

    @SuppressLint(value={"NewApi"})
    private void e() {
        this.e.add((Object)"BEST");
        if (this.e.size() != 0) {
            String string;
            ArrayList<String> arrayList = this.e;
            Object[] arrobject = (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = this.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(67108864);
            }
            this.k = (Toolbar)this.findViewById(2131297523);
            this.k.setTitle((CharSequence)"Mumbai");
            this.k.setSubtitle(2131755070);
            this.k.setTitleTextColor(-1);
            this.setSupportActionBar(this.k);
            new ArrayAdapter((Context)this, 2131493152, arrobject).setDropDownViewResource(2131492979);
            this.c = (TextView)this.findViewById(2131296425);
            this.d = (TextView)this.findViewById(2131296533);
            this.c.setText((CharSequence)"m-Indicator");
            this.d.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
            this.l = (Button)this.findViewById(2131296460);
            this.m = (Button)this.findViewById(2131296450);
            this.n = (TextView)this.findViewById(2131296459);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append((Object)this.n);
            Log.d((String)"findBusButton", (String)stringBuilder.toString());
            this.g = (LinearLayout)this.findViewById(2131297229);
            String string2 = this.o;
            if (string2 != null && !string2.equals((Object)"")) {
                this.l.setText((CharSequence)this.o);
            }
            if ((string = this.p) != null && !string.equals((Object)"")) {
                this.m.setText((CharSequence)this.p);
            }
            this.l.setOnClickListener((View.OnClickListener)this);
            this.m.setOnClickListener((View.OnClickListener)this);
            this.n.setOnClickListener((View.OnClickListener)this);
        }
    }

    public void a() {
        ProgressDialog progressDialog = this.t;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.t.dismiss();
        }
    }

    public void a(String string) {
        this.a();
        this.t = ProgressDialog.show((Context)this, null, (CharSequence)string, (boolean)true, (boolean)false);
    }

    public void b() {
        LinearLayout linearLayout = (LinearLayout)this.findViewById(2131297229);
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        this.f = new LinearLayout((Context)this.j);
        this.f.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 15);
        this.f.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        linearLayout.addView((View)this.f);
        Vector<b> vector = this.q;
        if (vector != null && vector.size() != 0) {
            for (int i2 = 0; i2 < this.q.size(); ++i2) {
                b b2 = (b)this.q.elementAt(i2);
                (ViewGroup)LayoutInflater.from((Context)this).inflate(2131492945, (ViewGroup)this.f, false);
                this.f.addView((View)this.a((Context)this.j, b2));
            }
        } else {
            ((TextView)this.findViewById(2131296453)).setText((CharSequence)"Sorry. No buses available. Select different Source bus stop.");
        }
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
                this.o = bundle.getString("bus_stop1");
                this.p = bundle.getString("bus_stop2");
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("SourceDestinationUI source: ");
                stringBuilder3.append(this.o);
                Log.d((String)"SourceDestinationUI", (String)stringBuilder3.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("SourceDestinationUI destination: ");
                stringBuilder4.append(this.p);
                Log.d((String)"SourceDestinationUI", (String)stringBuilder4.toString());
            }
        }
        if ((string = this.o) != null) {
            this.l.setText((CharSequence)string);
        }
        if ((string2 = this.p) != null) {
            this.m.setText((CharSequence)string2);
        }
    }

    public void onClick(View view) {
        if (view == this.l) {
            this.g.removeAllViews();
            Intent intent = new Intent(view.getContext(), SourceSearchUI.class);
            intent.putExtra("bus_route_id_key", this.r);
            intent.putExtra("bus_route_text_key", this.s);
            String string = this.l.getText().toString();
            String string2 = this.m.getText().toString();
            if (string != null && !string.equals((Object)"")) {
                intent.putExtra("bus_stop1", string);
            }
            if (string2 != null && !string2.equals((Object)"")) {
                intent.putExtra("bus_stop2", string2);
            }
            this.startActivityForResult(intent, 1);
        } else if (view == this.m) {
            this.g.removeAllViews();
            Intent intent = new Intent(view.getContext(), DestinationSearchUI.class);
            intent.putExtra("bus_route_id_key", this.r);
            intent.putExtra("bus_route_text_key", this.s);
            String string = this.l.getText().toString();
            String string3 = this.m.getText().toString();
            if (string != null && !string.equals((Object)"")) {
                intent.putExtra("bus_stop1", string);
            }
            if (string3 != null && !string3.equals((Object)"")) {
                intent.putExtra("bus_stop2", string3);
            }
            this.startActivityForResult(intent, 2);
        } else if (view == this.n) {
            this.onClickFindButton(view);
        }
        Vector<b> vector = this.q;
        if (vector != null) {
            vector.removeAllElements();
            this.q = null;
        }
    }

    public void onClickFindButton(View view) {
        String string;
        this.o = this.l.getText().toString();
        this.p = this.m.getText().toString();
        String string2 = this.o;
        if (string2 != null && !string2.equals((Object)"") && !this.o.equals((Object)"PICKUP") || (string = this.p) != null && !string.equals((Object)"") && !this.p.equals((Object)"DESTINATION")) {
            String string3 = this.o;
            if (string3 != null && !string3.equals((Object)"") && !this.o.equals((Object)"PICKUP")) {
                String string4 = this.p;
                if (string4 != null && !string4.equals((Object)"") && !this.p.equals((Object)"DESTINATION")) {
                    if (!(this.o.trim().equals((Object)"") || this.o.trim().equals((Object)"PICKUP") || this.o.trim().equals((Object)"DESTINATION") || this.o.trim().equals((Object)""))) {
                        Vector<b> vector = this.q;
                        if (vector != null) {
                            vector.removeAllElements();
                        }
                        if (this.g.getChildCount() > 0) {
                            this.g.removeAllViews();
                        }
                        new AsyncTask<URL, Integer, Integer>(){

                            protected /* varargs */ Integer a(URL ... arruRL) {
                                try {
                                    SourceDestinationUI.this.q = com.mulo.a.a.a.a((Context)SourceDestinationUI.this.j, ConfigurationManager.b(SourceDestinationUI.this.getApplicationContext()), SourceDestinationUI.this.r, ConfigurationManager.a((Context)SourceDestinationUI.this), "A:T:20210102").b(SourceDestinationUI.this.o, SourceDestinationUI.this.p);
                                }
                                catch (Exception exception) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("GetBusRouteLoaderAsyncTask");
                                    stringBuilder.append((Object)exception);
                                    Log.d((String)"GetBusRouteLoacTask", (String)stringBuilder.toString());
                                    SourceDestinationUI.this.d();
                                }
                                return 0;
                            }

                            protected void a(Integer n2) {
                                SourceDestinationUI.this.a();
                                SourceDestinationUI.this.b();
                            }

                            protected /* varargs */ void a(Integer ... arrinteger) {
                            }

                            protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                                return this.a((URL[])arrobject);
                            }

                            protected /* synthetic */ void onPostExecute(Object object) {
                                this.a((Integer)object);
                            }

                            protected void onPreExecute() {
                                SourceDestinationUI.this.a("Searching buses..");
                            }

                            protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
                                this.a((Integer[])arrobject);
                            }
                        }.execute((Object[])new URL[]{null, null, null});
                    }
                    ((TextView)this.findViewById(2131296453)).setText((CharSequence)"Search Results");
                    return;
                }
                n.d((Context)this, "Please enter destination.");
                return;
            }
            n.d((Context)this, "Please enter source.");
            return;
        }
        n.d((Context)this, "Please enter source and destination.");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d((String)"bbb", (String)"bbb SourceDestinationUI onCreate");
        this.j = this;
        this.setContentView(2131493133);
        this.a = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/3106304848", null);
        this.h = this.getResources().getDisplayMetrics().density;
        Intent intent = this.getIntent();
        this.r = this.getIntent().getStringExtra("bus_route_id_key");
        this.s = this.getIntent().getStringExtra("bus_route_text_key");
        ((TextView)this.findViewById(2131297354)).setText((CharSequence)this.r);
        TextView textView = (TextView)this.findViewById(2131297516);
        Object[] arrobject = new Object[]{this.s};
        textView.setText((CharSequence)String.format((String)"  (%s)", (Object[])arrobject));
        this.o = intent.getExtras().getString("source_stn");
        this.p = intent.getExtras().getString("destination_stn");
        this.e();
        if (!(this.o.trim().equals((Object)"") || this.o.trim().equals((Object)"PICKUP") || this.o.trim().equals((Object)"DESTINATION") || this.o.trim().equals((Object)""))) {
            Vector<b> vector = this.q;
            if (vector != null) {
                vector.removeAllElements();
            }
            if (this.g.getChildCount() > 0) {
                this.g.removeAllViews();
            }
            this.c();
            new /* invalid duplicate definition of identical inner class */.execute((Object[])new URL[]{null, null, null});
        }
    }

    protected void onDestroy() {
        g g2 = this.a;
        if (g2 != null) {
            g2.c();
        }
        super.onDestroy();
    }

    public void onPause() {
        this.a();
        g g2 = this.a;
        if (g2 != null) {
            g2.b();
            c.b((ViewGroup)this.a);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        g g2 = this.a;
        if (g2 != null) {
            g2.a();
            c.a((ViewGroup)this.a);
        }
    }

    protected void onStart() {
        super.onStart();
        ((TextView)this.findViewById(2131296453)).setText((CharSequence)"Search Results");
    }

    protected void onStop() {
        super.onStop();
    }

}

