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
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
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
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.mobond.mindicator.ui;

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
import android.view.ViewTreeObserver;
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
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mobond.mindicator.ui.j;
import java.util.ArrayList;
import java.util.Collection;

public abstract class e
extends androidx.appcompat.app.e
implements com.mobond.mindicator.ui.b,
j {
    public static int a;
    ListView A;
    boolean B = false;
    boolean C = false;
    boolean D = false;
    boolean E = false;
    String F = "Search";
    int G = -1;
    Activity H;
    boolean I = false;
    boolean J;
    int K;
    int L;
    com.mobond.mindicator.b M;
    private boolean N;
    private ProgressDialog O;
    private int P;
    private boolean Q;
    private boolean R = false;
    private boolean S = false;
    private int T = -1;
    private boolean U = true;
    private boolean V = false;
    private a W;
    private TextWatcher X = new TextWatcher(this){
        final /* synthetic */ e a;
        {
            this.a = e2;
        }

        public void afterTextChanged(android.text.Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }

        public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            ((ArrayAdapter)this.a.A.getAdapter()).getFilter().filter(charSequence);
        }
    };
    public EditText b = null;
    public boolean c = false;
    public boolean d = true;
    public ArrayList<d> e = new ArrayList();
    public int f;
    public Toolbar g;
    public LinearLayout h;
    public LinearLayout i;
    public TextView j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public ImageView n;
    View o;
    Handler p = new Handler();
    String q = "ca-app-pub-5449278086868932/8862800847";
    String r = "167101606757479_853949841405982";
    String s = "ca-app-pub-5449278086868932/2495764777";
    String t = "167101606757479_1230371800430449";
    boolean u = true;
    RelativeLayout v;
    RelativeLayout w;
    ImageView x;
    ImageView y;
    ImageView z;

    static /* synthetic */ a a(e e2) {
        return e2.W;
    }

    public d a(int n2) {
        return (d)this.W.getItem(n2);
    }

    public void a(int n2, int n3) {
        this.m.setVisibility(n2);
        this.m.setImageResource(n3);
    }

    @Override
    public void a(ProgressDialog progressDialog) {
        this.n();
        this.O = progressDialog;
    }

    public void a(ListView listView, View view, int n2, long l2) {
        c.a();
    }

    public void a(ListView listView, View view, int n2, long l2, d d2) {
    }

    public void a(String string) {
        ((EditText)this.findViewById(2131297278)).setHint((CharSequence)string);
    }

    public void a(String string, String string2, String string3, String string4, int n2) {
        this.q = string;
        this.r = string2;
        this.s = string3;
        this.t = string4;
        this.P = n2;
    }

    public void a(boolean bl) {
        this.C = bl;
    }

    public int b() {
        return this.W.getCount();
    }

    @Override
    public void b(int n2) {
        this.Q = true;
        this.P = n2;
    }

    public void b(int n2, int n3) {
        this.n.setVisibility(n2);
        this.n.setImageResource(n3);
    }

    public void b(String string) {
        ((TextView)this.findViewById(2131297354)).setText((CharSequence)string);
    }

    public void b(boolean bl) {
        this.E = bl;
    }

    public void c() {
        View view = this.o;
        if (view != null && this.Q) {
            view.setVisibility(0);
        }
    }

    public void c(int n2) {
        this.g.setBackgroundColor(n2);
    }

    public void c(String string) {
        ((TextView)this.findViewById(2131297516)).setText((CharSequence)string);
    }

    public void c(boolean bl) {
        this.B = bl;
    }

    public void d() {
        View view = this.o;
        if (view != null && this.P == 3) {
            view.setVisibility(8);
        }
    }

    public void d(int n2) {
        this.h.setBackgroundColor(n2);
    }

    public void e() {
        if (!this.c && this.d) {
            this.c = true;
            this.o = c.a((Activity)this, this.findViewById(2131296343), this.q, this.r, this.s, this.t, this.P, this);
        }
        this.b = (EditText)this.findViewById(2131297278);
        this.b.addTextChangedListener(this.X);
        this.A = (ListView)this.findViewById(2131296933);
        this.W = new ArrayAdapter<d>(this.e){
            public Filter a;
            {
                this.addAll(arrayList);
            }

            public Filter getFilter() {
                Log.d((String)"getFilter", (String)"called");
                if (this.a == null) {
                    this.a = new Filter(){

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
                            int n2 = e.this.e.size();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                d d2 = (d)e.this.e.get(i2);
                                String string6 = d2.b.toUpperCase();
                                String string7 = d2.c.toUpperCase();
                                if (e.this.U) {
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
                            String string = charSequence.toString().toUpperCase();
                            Filter.FilterResults filterResults = new Filter.FilterResults();
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(" ");
                            stringBuilder.append(string);
                            String string2 = stringBuilder.toString();
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("- ");
                            stringBuilder2.append(string);
                            String string3 = stringBuilder2.toString();
                            int n2 = e.this.e.size();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                d d2 = (d)e.this.e.get(i2);
                                String string4 = d2.b.toUpperCase();
                                String string5 = d2.c.toUpperCase();
                                if (e.this.U) {
                                    if (!string4.startsWith(string) && !string4.contains((CharSequence)string2) && !string5.contains((CharSequence)string3) && !string5.startsWith(string) && !string5.contains((CharSequence)string2)) continue;
                                    if (string4.startsWith(string)) {
                                        arrayList2.add((Object)d2);
                                        continue;
                                    }
                                    arrayList.add((Object)d2);
                                    continue;
                                }
                                if (!string4.startsWith(string) && !string4.contains((CharSequence)string2)) continue;
                                if (string4.startsWith(string)) {
                                    arrayList2.add((Object)d2);
                                    continue;
                                }
                                arrayList.add((Object)d2);
                            }
                            for (int i3 = 0; i3 < arrayList2.size(); ++i3) {
                                arrayList.add(0, arrayList2.get(i3));
                            }
                            filterResults.count = arrayList.size();
                            filterResults.values = arrayList;
                            return filterResults;
                        }

                        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                            if (e.a == 1) {
                                return this.b(charSequence);
                            }
                            return this.a(charSequence);
                        }

                        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                            a.this.clear();
                            a.this.addAll((Collection)((ArrayList)filterResults.values));
                            a.this.notifyDataSetChanged();
                            int n2 = a.this.getCount();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                d d2 = (d)a.this.getItem(i2);
                                if (e.this.e.indexOf((Object)d2) < e.this.f) continue;
                                e.this.A.setSelection(i2);
                                return;
                            }
                        }
                    };
                }
                return this.a;
            }

            public View getView(int n2, View view, ViewGroup viewGroup) {
                b b2;
                d d2 = (d)this.getItem(n2);
                if (view == null) {
                    view = e.this.getLayoutInflater().inflate(2131492977, viewGroup, false);
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
                    if (e.this.S) {
                        b2.f.setVisibility(0);
                        if (e.this.T != -1) {
                            b2.f.getLayoutParams().width = e.this.T;
                            b2.f.getLayoutParams().height = e.this.T;
                        }
                    }
                    if (e.this.B) {
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
                if (e.this.G != -1) {
                    b2.a.setTextSize(2, (float)e.this.G);
                }
                if (e.this.D) {
                    b2.a.setLines(1);
                    b2.a.setEllipsize(TextUtils.TruncateAt.END);
                }
                if (e.this.C) {
                    b2.b.setLines(1);
                    b2.b.setEllipsize(TextUtils.TruncateAt.END);
                }
                if (e.this.E) {
                    b2.c.setText((CharSequence)d2.d);
                    if (e.this.C) {
                        b2.c.setVisibility(0);
                        b2.c.setLines(1);
                        b2.c.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
                b2.a.setTextColor(d2.e);
                b2.b.setTextColor(d2.f);
                b2.c.setTextColor(d2.g);
                if (e.this.S) {
                    b2.f.setImageResource(d2.h);
                }
                if (n2 % 2 == 0) {
                    b2.d.setBackgroundResource(2131230838);
                } else {
                    b2.d.setBackgroundResource(2131231006);
                }
                if (n2 == e.this.f && e.this.N) {
                    b2.d.setBackgroundResource(2131231000);
                }
                if (e.this.B) {
                    b2.e.setVisibility(0);
                    if (n2 == 0) {
                        b2.g.setVisibility(4);
                        b2.h.setVisibility(0);
                    } else if (n2 == this.getCount() - 1) {
                        b2.g.setVisibility(0);
                        b2.h.setVisibility(4);
                    } else {
                        b2.g.setVisibility(0);
                        b2.h.setVisibility(0);
                    }
                }
                if (e.this.J) {
                    b2.f.setImageResource(e.this.K);
                    b2.f.setVisibility(0);
                }
                if (e.this.R) {
                    b2.i.setVisibility(0);
                }
                return view;
            }

        };
        this.A.setAdapter((ListAdapter)this.W);
        this.A.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final /* synthetic */ e a;
            {
                this.a = e2;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                e e2 = this.a;
                e2.a(e2.A, view, n2, l2);
                d d2 = (d)e.a(this.a).getItem(n2);
                e e3 = this.a;
                e3.a(e3.A, view, n2, l2, d2);
            }
        });
        ((TextView)this.findViewById(2131297354)).setTextColor(Color.parseColor((String)"#ffffff"));
        this.v = (RelativeLayout)this.findViewById(2131296968);
        this.w = (RelativeLayout)this.findViewById(2131297275);
        this.b = (EditText)this.findViewById(2131297278);
        this.x = (ImageView)this.findViewById(2131297274);
        this.x.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ e a;
            {
                this.a = e2;
            }

            public void onClick(View view) {
                this.a.f();
                this.a.b.requestFocus();
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)this.a.b, 1);
            }
        });
        this.z = (ImageView)this.findViewById(2131297509);
        this.y = (ImageView)this.findViewById(2131296396);
        this.y.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ e a;
            {
                this.a = e2;
            }

            public void onClick(View view) {
                this.a.v.setVisibility(0);
                this.a.w.setVisibility(8);
                this.a.g.setBackgroundColor(this.a.L);
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(this.a.b.getWindowToken(), 0);
            }
        });
        this.h = (LinearLayout)this.findViewById(2131296424);
        this.j = (TextView)this.findViewById(2131296425);
        this.k = (TextView)this.findViewById(2131296533);
        this.j.setText((CharSequence)"m-Indicator");
        this.k.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.l = (ImageView)this.findViewById(2131296865);
        this.m = (ImageView)this.findViewById(2131296471);
        this.n = (ImageView)this.findViewById(2131296472);
        this.i = (LinearLayout)this.findViewById(2131296420);
        if (this.V) {
            this.i.setVisibility(0);
        }
    }

    public void e(int n2) {
        this.l = (ImageView)this.findViewById(2131296865);
        this.l.setImageResource(n2);
        if (n2 == 2131230834) {
            this.l.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ e a;
                {
                    this.a = e2;
                }

                public void onClick(View view) {
                    this.a.finish();
                }
            });
        }
    }

    public void f() {
        this.v.setVisibility(8);
        this.w.setVisibility(0);
        this.b.setVisibility(0);
        this.g.setBackgroundColor(Color.parseColor((String)"#FFFFFF"));
    }

    public void f(int n2) {
        this.J = true;
        this.K = n2;
    }

    public void g() {
        this.z.setVisibility(0);
        this.x.setVisibility(8);
    }

    public void g(int n2) {
        ((ImageView)this.findViewById(2131296396)).setImageResource(n2);
    }

    public void h() {
        this.x.setVisibility(8);
    }

    public void h(int n2) {
        this.G = n2;
    }

    public void i() {
        ArrayAdapter<d> arrayAdapter = new /* invalid duplicate definition of identical inner class */;
        this.A.setAdapter((ListAdapter)arrayAdapter);
    }

    public void i(int n2) {
        this.A.setSelection(n2);
    }

    public void j() {
        this.b.setVisibility(8);
    }

    public void j(int n2) {
        int n3 = n2 - 1;
        if (n3 >= 0) {
            this.A.setSelection(n3);
        } else {
            this.A.setSelection(n2);
        }
        this.N = true;
    }

    @Override
    public ProgressDialog k() {
        return this.O;
    }

    @Override
    public Handler l() {
        return this.p;
    }

    @Override
    public Activity m() {
        return this;
    }

    public void n() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.O.dismiss();
        }
    }

    public void o() {
        this.U = false;
    }

    @SuppressLint(value={"NewApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492978);
        ((FloatingActionButton)this.findViewById(2131296759)).c();
        this.findViewById(2131296890).setVisibility(8);
        this.M = com.mobond.mindicator.a.a((Activity)this);
        this.H = this;
        this.L = this.getResources().getColor(2131099681);
        this.getWindow().setSoftInputMode(3);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        this.g = (Toolbar)this.findViewById(2131297523);
        this.g.setTitle(2131755070);
        this.g.setTitleTextColor(-1);
        this.setSupportActionBar(this.g);
        this.getSupportActionBar().a(false);
        View view = this.findViewById(16908290);
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, view){
                final /* synthetic */ View a;
                final /* synthetic */ e b;
                {
                    this.b = e2;
                    this.a = view;
                }

                public void onGlobalLayout() {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    this.a.getWindowVisibleDisplayFrame(rect);
                    int n2 = this.a.getRootView().getHeight();
                    double d2 = n2 - rect.bottom;
                    double d3 = n2;
                    java.lang.Double.isNaN((double)d3);
                    if (d2 > d3 * 0.15) {
                        this.b.d();
                        return;
                    }
                    this.b.c();
                }
            });
        }
    }

    protected void onDestroy() {
        TextWatcher textWatcher;
        c.c(this.o);
        super.onDestroy();
        EditText editText = this.b;
        if (editText != null && (textWatcher = this.X) != null) {
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
        this.n();
        c.b(this.o);
        super.onPause();
    }

    public void onResume() {
        c.a(this.o);
        super.onResume();
    }

    public void p() {
        this.d = false;
    }

    public void q() {
        this.V = true;
    }

}

