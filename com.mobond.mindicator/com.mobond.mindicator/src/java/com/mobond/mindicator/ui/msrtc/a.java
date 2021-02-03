/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.EditText
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  com.google.android.gms.ads.g
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.mobond.mindicator.ui.msrtc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.ads.g;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.j;
import com.mobond.mindicator.ui.msrtc.a;
import java.util.ArrayList;
import java.util.Collection;

public abstract class a
extends e
implements j {
    public static int a;
    ImageView A;
    ImageView B;
    ImageView C;
    ListView D;
    boolean E = false;
    boolean F = false;
    boolean G = false;
    boolean H = false;
    String I = "Search";
    int J = -1;
    Activity K;
    boolean L = false;
    boolean M;
    int N;
    boolean O = false;
    int P;
    a Q;
    private boolean R;
    private ProgressDialog S;
    private boolean T = false;
    private boolean U = false;
    private int V = -1;
    private boolean W = true;
    private boolean X = false;
    private boolean Y = false;
    private TextWatcher Z = new TextWatcher(this){
        final /* synthetic */ a a;
        {
            this.a = a2;
        }

        public void afterTextChanged(android.text.Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }

        public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            ((ArrayAdapter)this.a.D.getAdapter()).getFilter().filter(charSequence);
        }
    };
    public EditText b = null;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Filter f;
    public ArrayList<d> g = new ArrayList();
    public ArrayList<d> h = new ArrayList();
    public ArrayList<d> i = new ArrayList();
    public int j;
    public Toolbar k;
    public LinearLayout l;
    public LinearLayout m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public ImageView q;
    public ImageView r;
    public ImageView s;
    g t;
    ArrayList<d> u = new ArrayList();
    Handler v = new Handler();
    String w = "ca-app-pub-5449278086868932/8862800847";
    boolean x = true;
    RelativeLayout y;
    RelativeLayout z;

    public void a() {
        if (!this.c && this.d) {
            this.c = true;
            View view = this.findViewById(2131297670);
            this.t = c.a((Activity)this, this.findViewById(2131296343), this.w, view);
        }
        this.b = (EditText)this.findViewById(2131297278);
        this.b.addTextChangedListener(this.Z);
        this.h = new ArrayList(this.g);
        this.i = new ArrayList(this.g);
        this.D = (ListView)this.findViewById(2131296933);
        this.Q = new ArrayAdapter<d>(){
            {
                if (a.this.f == null) {
                    a.this.f = new Filter(){

                        protected Filter.FilterResults a(CharSequence charSequence) {
                            String string = charSequence.toString().toUpperCase();
                            Filter.FilterResults filterResults = new Filter.FilterResults();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(" ");
                            stringBuilder.append(string);
                            String string2 = stringBuilder.toString();
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("\n");
                            stringBuilder2.append(string);
                            String string3 = stringBuilder2.toString();
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("(");
                            stringBuilder3.append(string);
                            String string4 = stringBuilder3.toString();
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("/");
                            stringBuilder4.append(string);
                            String string5 = stringBuilder4.toString();
                            int n2 = a.this.g.size();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                d d2 = (d)a.this.g.get(i2);
                                String string6 = d2.b.toUpperCase();
                                String string7 = d2.c.toUpperCase();
                                if (a.this.W) {
                                    if (!string6.startsWith(string) && !string6.contains((CharSequence)string2) && !string6.contains((CharSequence)string3) && !string6.contains((CharSequence)string4) && !string6.contains((CharSequence)string5) && !string7.startsWith(string) && !string7.contains((CharSequence)string2) && !string7.contains((CharSequence)string3) && !string7.contains((CharSequence)string4) && !string7.contains((CharSequence)string5)) continue;
                                    arrayList.add((Object)d2);
                                    continue;
                                }
                                if (!string6.startsWith(string) && !string6.contains((CharSequence)string2) && !string6.contains((CharSequence)string3) && !string6.contains((CharSequence)string4) && !string6.contains((CharSequence)string5)) continue;
                                arrayList.add((Object)d2);
                            }
                            filterResults.count = arrayList.size();
                            filterResults.values = arrayList;
                            return filterResults;
                        }

                        protected Filter.FilterResults b(CharSequence charSequence) {
                            Log.d((String)"msrtcsearch", (String)"FilterResults msrtcFilter");
                            String string = charSequence.toString().toUpperCase();
                            Filter.FilterResults filterResults = new Filter.FilterResults();
                            if (string.length() >= 3) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                int n2 = a.this.i.size();
                                for (int i2 = 0; i2 < n2; ++i2) {
                                    d d2 = (d)a.this.i.get(i2);
                                    String string2 = ((com.mulo.a.c.c)d2.j).a;
                                    String string3 = ((com.mulo.a.c.c)d2.j).b;
                                    String string4 = ((com.mulo.a.c.c)d2.j).c;
                                    if (!string2.startsWith(string) && !string4.startsWith(string) && !string3.startsWith(string)) continue;
                                    if (string2.startsWith(string)) {
                                        if (string2.equals((Object)string) && string3.equals((Object)string)) {
                                            arrayList2.add((Object)d2);
                                            continue;
                                        }
                                        if (string2.equals((Object)string)) {
                                            arrayList3.add((Object)d2);
                                            continue;
                                        }
                                        if (string2.startsWith(string) && string3.startsWith(string)) {
                                            arrayList4.add((Object)d2);
                                            continue;
                                        }
                                        arrayList5.add((Object)d2);
                                        continue;
                                    }
                                    arrayList.add((Object)d2);
                                }
                                for (int i3 = -1 + arrayList5.size(); i3 >= 0; --i3) {
                                    arrayList.add(0, arrayList5.get(i3));
                                }
                                for (int i4 = -1 + arrayList4.size(); i4 >= 0; --i4) {
                                    arrayList.add(0, arrayList4.get(i4));
                                }
                                for (int i5 = -1 + arrayList3.size(); i5 >= 0; --i5) {
                                    arrayList.add(0, arrayList3.get(i5));
                                }
                                for (int i6 = -1 + arrayList2.size(); i6 >= 0; --i6) {
                                    arrayList.add(0, arrayList2.get(i6));
                                }
                                filterResults.count = arrayList.size();
                                filterResults.values = arrayList;
                                return filterResults;
                            }
                            filterResults.count = a.this.i.size();
                            filterResults.values = a.this.i;
                            return filterResults;
                        }

                        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                            if (a.a == 1) {
                                return this.b(charSequence);
                            }
                            return this.a(charSequence);
                        }

                        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                            int n2 = a.this.h.size();
                            a.this.h = (ArrayList)filterResults.values;
                            int n3 = a.this.g.size();
                            if (a.this.h.size() != n3 || n3 != n2) {
                                a.this.notifyDataSetChanged();
                                a.this.clear();
                                int n4 = a.this.h.size();
                                int n5 = 0;
                                for (int i2 = 0; i2 < n4; ++i2) {
                                    a a2 = a.this;
                                    a2.add(a2.a.this.h.get(i2));
                                }
                                a.this.notifyDataSetInvalidated();
                                int n6 = a.this.h.size();
                                while (n5 < n6) {
                                    d d2 = (d)a.this.h.get(n5);
                                    if (a.this.g.indexOf((Object)d2) >= a.this.j) {
                                        a.this.D.setSelection(n5);
                                        return;
                                    }
                                    ++n5;
                                }
                            }
                        }
                    };
                }
            }

            public Filter getFilter() {
                Log.d((String)"getFilter", (String)"called");
                return a.this.f;
            }

            public View getView(int n2, View view, ViewGroup viewGroup) {
                b b2;
                if (n2 > a.this.h.size() - 1) {
                    return view;
                }
                d d2 = (d)a.this.h.get(n2);
                if (view == null) {
                    view = a.this.getLayoutInflater().inflate(2131492977, viewGroup, false);
                    b2 = new Object(){
                        protected TextView a;
                        protected TextView b;
                        protected TextView c;
                        protected RelativeLayout d;
                        protected RelativeLayout e;
                        protected ImageView f;
                        protected View g;
                        protected View h;
                        protected View i;
                    };
                    b2.a = (TextView)view.findViewById(2131296680);
                    b2.b = (TextView)view.findViewById(2131296681);
                    b2.c = (TextView)view.findViewById(2131296682);
                    b2.f = (ImageView)view.findViewById(2131296683);
                    b2.d = (RelativeLayout)view.findViewById(2131296693);
                    b2.i = view.findViewById(2131296655);
                    if (a.this.U) {
                        b2.f.setVisibility(0);
                        if (a.this.V != -1) {
                            b2.f.getLayoutParams().width = a.this.V;
                            b2.f.getLayoutParams().height = a.this.V;
                        }
                    }
                    if (a.this.E) {
                        b2.e = (RelativeLayout)view.findViewById(2131297541);
                        b2.g = view.findViewById(2131296929);
                        b2.h = view.findViewById(2131296927);
                    }
                    view.setTag((Object)b2);
                } else {
                    b2 = view.getTag();
                }
                b2.a.setText((CharSequence)d2.b);
                if (d2.c != null && !d2.c.equals((Object)"")) {
                    b2.b.setText((CharSequence)d2.c);
                    b2.b.setVisibility(0);
                } else {
                    b2.b.setVisibility(8);
                }
                if (a.this.J != -1) {
                    b2.a.setTextSize(2, (float)a.this.J);
                }
                if (a.this.G) {
                    b2.a.setLines(1);
                    b2.a.setEllipsize(TextUtils.TruncateAt.END);
                }
                if (a.this.F) {
                    b2.b.setLines(1);
                    b2.b.setEllipsize(TextUtils.TruncateAt.END);
                }
                if (a.this.H) {
                    b2.c.setText((CharSequence)d2.d);
                    if (a.this.F) {
                        b2.c.setVisibility(0);
                        b2.c.setLines(1);
                        b2.c.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
                b2.a.setTextColor(d2.e);
                b2.b.setTextColor(d2.f);
                b2.c.setTextColor(d2.g);
                if (a.this.U) {
                    b2.f.setImageResource(d2.h);
                }
                if (n2 % 2 == 0) {
                    b2.d.setBackgroundResource(2131230838);
                } else {
                    b2.d.setBackgroundResource(2131231006);
                }
                if (n2 == a.this.j && a.this.R) {
                    b2.d.setBackgroundResource(2131231000);
                }
                if (a.this.E) {
                    b2.e.setVisibility(0);
                    if (n2 == 0) {
                        b2.g.setVisibility(4);
                        b2.h.setVisibility(0);
                    } else if (n2 == a.this.h.size() - 1) {
                        b2.g.setVisibility(0);
                        b2.h.setVisibility(4);
                    } else {
                        b2.g.setVisibility(0);
                        b2.h.setVisibility(0);
                    }
                }
                if (a.this.M) {
                    b2.f.setImageResource(a.this.N);
                    b2.f.setVisibility(0);
                }
                if (a.this.T) {
                    b2.i.setVisibility(0);
                }
                return view;
            }

        };
        this.D.setAdapter((ListAdapter)this.Q);
        this.D.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final /* synthetic */ a a;
            {
                this.a = a2;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                a a2 = this.a;
                a2.a(a2.D, view, n2, l2);
                d d2 = (d)this.a.h.get(n2);
                a a3 = this.a;
                a3.a(a3.D, view, n2, l2, d2);
            }
        });
        ((TextView)this.findViewById(2131297354)).setTextColor(Color.parseColor((String)"#ffffff"));
        this.y = (RelativeLayout)this.findViewById(2131296968);
        this.z = (RelativeLayout)this.findViewById(2131297275);
        this.b = (EditText)this.findViewById(2131297278);
        this.A = (ImageView)this.findViewById(2131297274);
        this.A.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ a a;
            {
                this.a = a2;
            }

            public void onClick(View view) {
                this.a.b();
                this.a.b.requestFocus();
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)this.a.b, 1);
            }
        });
        this.C = (ImageView)this.findViewById(2131297509);
        this.B = (ImageView)this.findViewById(2131296396);
        this.B.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ a a;
            {
                this.a = a2;
            }

            public void onClick(View view) {
                this.a.y.setVisibility(0);
                this.a.z.setVisibility(8);
                this.a.k.setBackgroundColor(this.a.P);
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(this.a.b.getWindowToken(), 0);
            }
        });
        this.l = (LinearLayout)this.findViewById(2131296424);
        this.o = (TextView)this.findViewById(2131296425);
        this.p = (TextView)this.findViewById(2131296533);
        this.o.setText((CharSequence)"m-Indicator");
        this.p.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.q = (ImageView)this.findViewById(2131296865);
        this.r = (ImageView)this.findViewById(2131296471);
        this.s = (ImageView)this.findViewById(2131296472);
        this.m = (LinearLayout)this.findViewById(2131296420);
        this.n = (LinearLayout)this.findViewById(2131296654);
        if (this.Y) {
            this.m.setVisibility(0);
        }
        if (this.e) {
            this.n.setVisibility(0);
        }
    }

    public void a(int n2) {
        this.q = (ImageView)this.findViewById(2131296865);
        this.q.setImageResource(n2);
    }

    @Override
    public void a(ProgressDialog progressDialog) {
        this.c();
        this.S = progressDialog;
    }

    public void a(ListView listView, View view, int n2, long l2) {
    }

    public void a(ListView listView, View view, int n2, long l2, d d2) {
    }

    public void a(String string) {
        ((EditText)this.findViewById(2131297278)).setHint((CharSequence)string);
    }

    public void a(boolean bl) {
        this.G = bl;
    }

    public void b() {
        this.y.setVisibility(8);
        this.z.setVisibility(0);
        this.b.setVisibility(0);
        this.k.setBackgroundColor(Color.parseColor((String)"#FFFFFF"));
    }

    public void b(int n2) {
        this.M = true;
        this.N = n2;
    }

    public void b(String string) {
        ((TextView)this.findViewById(2131297354)).setText((CharSequence)string);
    }

    public void c() {
        ProgressDialog progressDialog = this.S;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.S.dismiss();
        }
    }

    public void c(int n2) {
        this.J = n2;
    }

    public void d() {
        this.X = true;
    }

    public void d(int n2) {
        a = n2;
    }

    public void e() {
        this.X = false;
    }

    public void f() {
        this.d = false;
    }

    public void g() {
        if (this.i.size() < this.g.size()) {
            Toast.makeText((Context)this.K, (CharSequence)"All stops", (int)0).show();
            this.i.clear();
            new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size is ");
            stringBuilder.append(this.g.size());
            Log.d((String)"reseting", (String)stringBuilder.toString());
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                d d2 = (d)this.g.get(i2);
                this.i.add(0, (Object)d2);
            }
            this.Q.notifyDataSetChanged();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("district_filtered_list ");
            stringBuilder2.append(this.i.size());
            Log.d((String)"reseting", (String)stringBuilder2.toString());
            ((ArrayAdapter)this.D.getAdapter()).getFilter().filter((CharSequence)"");
        }
    }

    @Override
    public ProgressDialog k() {
        return this.S;
    }

    @Override
    public Handler l() {
        return this.v;
    }

    @Override
    public Activity m() {
        return this;
    }

    @SuppressLint(value={"NewApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492978);
        ((FloatingActionButton)this.findViewById(2131296759)).c();
        this.findViewById(2131296890).setVisibility(8);
        this.K = this;
        this.P = this.getResources().getColor(2131099681);
        this.getWindow().setSoftInputMode(3);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        this.k = (Toolbar)this.findViewById(2131297523);
        this.k.setTitle(2131755070);
        this.k.setTitleTextColor(-1);
        this.setSupportActionBar(this.k);
        this.getSupportActionBar().a(false);
    }

    protected void onDestroy() {
        TextWatcher textWatcher;
        g g2 = this.t;
        if (g2 != null) {
            g2.c();
        }
        super.onDestroy();
        EditText editText = this.b;
        if (editText != null && (textWatcher = this.Z) != null) {
            editText.removeTextChangedListener(textWatcher);
        }
    }

    public void onKeyboardClick(View view) {
        if (this.b.getInputType() == 2) {
            this.b.setInputType(524432);
            return;
        }
        this.b.setInputType(2);
    }

    protected void onPause() {
        this.c();
        g g2 = this.t;
        if (g2 != null) {
            g2.b();
            c.b((ViewGroup)this.t);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        g g2 = this.t;
        if (g2 != null) {
            g2.a();
            c.a((ViewGroup)this.t);
        }
    }

}

