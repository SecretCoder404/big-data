/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
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
 *  androidx.appcompat.widget.Toolbar
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.HashMap
 */
package com.mobond.mindicator.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AbsListView;
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
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.f;
import com.mobond.mindicator.ui.j;
import com.mobond.mindicator.ui.k;
import com.mobond.mindicator.ui.train.TrainActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;

public class f
extends BaseAppCompatActivity
implements com.mobond.mindicator.ui.b,
j {
    private static Toolbar E;
    public HashMap<String, String> A = new HashMap();
    public boolean B = false;
    public String C;
    com.mobond.mindicator.util.f D = new com.mobond.mindicator.util.f();
    private View F;
    private a G;
    private EditText H = null;
    private ProgressDialog I;
    private int J;
    private int K;
    private boolean L;
    private TextWatcher M = new TextWatcher(this){
        final /* synthetic */ f a;
        {
            this.a = f2;
        }

        public void afterTextChanged(android.text.Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }

        public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            this.a.b(charSequence.toString());
        }
    };
    public ArrayList<d> a = new ArrayList();
    public int b;
    public boolean c = false;
    public RelativeLayout d;
    public RelativeLayout e;
    public ImageView f;
    public ImageView g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public boolean k;
    Handler l = new Handler();
    public ListView m;
    String n;
    TextView o;
    TextView p;
    boolean q = false;
    boolean r = false;
    ImageView s;
    int t = Color.rgb((int)0, (int)175, (int)0);
    String u = "ca-app-pub-5449278086868932/8862800847";
    String v = "167101606757479_853949841405982";
    String w = "ca-app-pub-5449278086868932/2495764777";
    String x = "167101606757479_1230371800430449";
    View y;
    public FloatingActionButton z;

    static /* synthetic */ EditText a(f f2) {
        return f2.H;
    }

    static /* synthetic */ void b(f f2) {
        f2.j();
    }

    static /* synthetic */ Toolbar i() {
        return E;
    }

    private void j() {
        if (!this.B || !com.mobond.mindicator.b.h()) {
            if (this.F == null) {
                this.F = c.a((Activity)this, this.findViewById(2131296343), this.u, this.v, this.w, this.x, this.K, this, "/79488325/dfpnativeadunit_trainsatstn");
            }
            this.y = TrainActivity.b;
            if (this.y == null) {
                this.y = c.a((Activity)this, null, null, null, "ca-app-pub-5449278086868932/3752145001", "167101606757479_1246233218844307", 3, null, new k(), true, "/79488325/dfpnativeadunit_trainsatstn");
            }
        }
    }

    @Override
    public void a() {
    }

    public void a(int n2) {
        this.m.setSelection(n2);
        this.J = n2 + 1;
    }

    @Override
    public void a(ProgressDialog progressDialog) {
        this.h();
        this.I = progressDialog;
    }

    public void a(ListView listView, View view, int n2, long l2) {
    }

    public void a(ListView listView, View view, int n2, long l2, d d2) {
    }

    public void a(String string) {
        this.j.removeAllViews();
        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.m()).inflate(2131492954, (ViewGroup)this.j, false);
        ((TextView)viewGroup.findViewById(2131296789)).setText((CharSequence)string);
        viewGroup.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void onClick(View view) {
                this.a.findViewById(2131296712).setVisibility(4);
                this.a.j.removeAllViews();
                this.a.b("");
            }
        });
        this.j.addView((View)viewGroup);
    }

    public void a(String string, String string2, String string3, String string4, int n2) {
        this.u = string;
        this.v = string2;
        this.w = string3;
        this.x = string4;
        this.K = n2;
    }

    public void a(boolean bl, boolean bl2) {
        this.H = (EditText)this.findViewById(2131297278);
        this.H.addTextChangedListener(this.M);
        this.G = new ArrayAdapter<d>(this.a, this.y, bl2){
            public Filter a;
            public View b;
            boolean c;
            {
                this.c = true;
                this.b = view;
                this.c = bl;
                this.addAll(arrayList);
            }

            public Filter getFilter() {
                Log.d((String)"getFilter", (String)"called");
                if (this.a == null) {
                    this.a = new Filter(){

                        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
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
                            int n2 = f.this.a.size();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                d d2 = (d)f.this.a.get(i2);
                                String string6 = d2.b.toUpperCase();
                                String string7 = d2.c.toUpperCase();
                                if (!string6.startsWith(string) && !string6.contains((CharSequence)string2) && !string6.contains((CharSequence)string3) && !string6.contains((CharSequence)string4) && !string6.contains((CharSequence)string5) && !string7.startsWith(string) && !string7.contains((CharSequence)string2) && !string7.contains((CharSequence)string3) && !string7.contains((CharSequence)string4) && !string7.contains((CharSequence)string5)) continue;
                                arrayList.add((Object)d2);
                            }
                            filterResults.count = arrayList.size();
                            filterResults.values = arrayList;
                            return filterResults;
                        }

                        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                            a.this.clear();
                            ArrayList arrayList = (ArrayList)filterResults.values;
                            a.this.addAll((Collection)arrayList);
                            a.this.notifyDataSetChanged();
                            int n2 = a.this.getCount();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                d d2 = (d)a.this.getItem(i2);
                                if (f.this.a.indexOf((Object)d2) < f.this.b) continue;
                                int n3 = i2 - 1;
                                if (n3 >= 0) {
                                    f.this.a(n3);
                                    break;
                                }
                                f.this.a(i2);
                                break;
                            }
                            TextView textView = (TextView)f.this.findViewById(2131296712);
                            if (arrayList.isEmpty()) {
                                textView.setText((CharSequence)"No trains are available.");
                                textView.setVisibility(0);
                                return;
                            }
                            textView.setVisibility(4);
                        }
                    };
                }
                return this.a;
            }

            public View getView(int n2, View view, ViewGroup viewGroup) {
                b b2;
                if (view == null) {
                    view = f.this.getLayoutInflater().inflate(2131493146, viewGroup, false);
                    b2 = new Object(){
                        protected TextView a;
                        protected TextView b;
                        protected TextView c;
                        protected RelativeLayout d;
                        protected View e;
                        protected TextView f;
                        protected TextView g;
                        protected LinearLayout h;
                        protected LinearLayout i;
                        protected LinearLayout j;
                    };
                    b2.b = (TextView)view.findViewById(2131297504);
                    b2.a = (TextView)view.findViewById(2131296949);
                    b2.c = (TextView)view.findViewById(2131296810);
                    b2.d = (RelativeLayout)view.findViewById(2131297355);
                    b2.e = view.findViewById(2131297574);
                    b2.g = (TextView)view.findViewById(2131297080);
                    b2.f = (TextView)view.findViewById(2131297079);
                    b2.h = (LinearLayout)view.findViewById(2131297116);
                    b2.i = (LinearLayout)view.findViewById(2131297013);
                    b2.j = (LinearLayout)view.findViewById(2131296991);
                    view.setTag((Object)b2);
                } else {
                    b2 = view.getTag();
                }
                d d2 = (d)this.getItem(n2);
                b2.j.setVisibility(8);
                b2.b.setText((CharSequence)d2.b);
                b2.b.setTextColor(-1);
                if (d2.s.isEmpty()) {
                    b2.c.setText((CharSequence)d2.c);
                } else {
                    TextView textView = b2.c;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(d2.s);
                    stringBuilder.append(" : ");
                    stringBuilder.append(d2.c);
                    textView.setText((CharSequence)stringBuilder.toString());
                }
                b2.c.setTextColor(-5395027);
                if (d2.o == 1) {
                    b2.e.setBackgroundColor(f.this.t);
                } else if (d2.o == 2) {
                    b2.e.setBackgroundColor(-65536);
                }
                if (d2.c.contains((CharSequence)"Ladies")) {
                    b2.e.setBackgroundColor(-38476);
                }
                if (d2.c.contains((CharSequence)"HARBOUR")) {
                    b2.e.setBackgroundColor(-10855846);
                    b2.b.setTextColor(-10855846);
                    b2.c.setTextColor(-10855846);
                }
                if (d2.c.contains((CharSequence)"AC ") || d2.c.startsWith("AC")) {
                    b2.e.setBackgroundColor(-16725249);
                }
                if (f.this.q) {
                    if (d2.c.contains((CharSequence)"Not on Sunday")) {
                        b2.b.setPaintFlags(16 | b2.b.getPaintFlags());
                        d2.y = true;
                    } else {
                        b2.b.setPaintFlags(-17 & b2.b.getPaintFlags());
                    }
                } else if (f.this.r) {
                    if (d2.c.contains((CharSequence)"Saturday")) {
                        b2.b.setPaintFlags(16 | b2.b.getPaintFlags());
                        d2.y = true;
                    } else {
                        b2.b.setPaintFlags(-17 & b2.b.getPaintFlags());
                    }
                }
                if (d2.q.equals((Object)"")) {
                    b2.f.setText((CharSequence)"");
                } else {
                    b2.f.setText((CharSequence)d2.q);
                }
                b2.h.setVisibility(0);
                b2.g.setVisibility(0);
                if (n2 == this.getCount() - 1) {
                    if (this.c) {
                        b2.j.setVisibility(0);
                    } else {
                        b2.j.setVisibility(8);
                    }
                }
                if (n2 % 2 == 0) {
                    b2.d.setBackgroundResource(2131230838);
                } else {
                    b2.d.setBackgroundResource(2131231006);
                }
                if (d2.c.contains((CharSequence)"Ladies")) {
                    b2.d.setBackgroundResource(2131231237);
                }
                if (d2.c.contains((CharSequence)"AC ") || d2.c.startsWith("AC")) {
                    b2.d.setBackgroundResource(2131230847);
                }
                if (n2 == f.this.J && f.this.c) {
                    b2.d.setBackgroundResource(2131231000);
                    View view2 = this.b;
                    if (view2 != null) {
                        if (view2.getParent() != null) {
                            ((ViewGroup)this.b.getParent()).removeAllViews();
                        }
                        b2.i.addView(this.b);
                        b2.i.setVisibility(0);
                    } else {
                        b2.i.setVisibility(8);
                    }
                } else {
                    b2.i.setVisibility(8);
                }
                if (f.this.k) {
                    b2.h.setVisibility(0);
                } else {
                    b2.h.setVisibility(4);
                }
                if (f.this.A.containsKey((Object)d2.s)) {
                    String string = (String)f.this.A.get((Object)d2.s);
                    if (string.contains((CharSequence)"Cancelled")) {
                        b2.b.setPaintFlags(16 | b2.b.getPaintFlags());
                    } else {
                        b2.b.setPaintFlags(-17 & b2.b.getPaintFlags());
                    }
                    b2.a.setText((CharSequence)string);
                    b2.a.setVisibility(0);
                    return view;
                }
                b2.a.setVisibility(8);
                return view;
            }

        };
        this.m.setAdapter((ListAdapter)this.G);
        this.m.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                f f2 = this.a;
                f2.a(f2.m, view, n2, l2);
                d d2 = this.a.c(n2);
                f f3 = this.a;
                f3.a(f3.m, view, n2, l2, d2);
            }
        });
        if (bl) {
            this.m.setOnScrollListener(new AbsListView.OnScrollListener(this){
                final /* synthetic */ f a;
                {
                    this.a = f2;
                }

                public void onScroll(AbsListView absListView, int n2, int n3, int n4) {
                }

                public void onScrollStateChanged(AbsListView absListView, int n2) {
                    if (n2 != 1 && n2 != 2) {
                        this.a.z.b();
                        return;
                    }
                    this.a.z.c();
                }
            });
        }
        if (this.B && this.C != null) {
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                if (!((d)this.a.get((int)i2)).s.equals((Object)this.C)) continue;
                ListView listView = this.m;
                View view = listView.getAdapter().getView(i2, null, null);
                int n2 = i2;
                this.a(listView, view, n2, 0L);
                d d2 = this.c(i2);
                ListView listView2 = this.m;
                this.a(listView2, listView2.getAdapter().getView(i2, null, null), n2, 0L, d2);
                break;
            }
        }
        ((TextView)this.findViewById(2131297354)).setTextColor(Color.parseColor((String)"#ffffff"));
        this.d = (RelativeLayout)this.findViewById(2131296968);
        this.e = (RelativeLayout)this.findViewById(2131297275);
        this.f = (ImageView)this.findViewById(2131297274);
        this.f.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void onClick(View view) {
                this.a.d.setVisibility(8);
                this.a.e.setVisibility(0);
                f.i().setBackgroundColor(Color.parseColor((String)"#FFFFFF"));
                f.a(this.a).requestFocus();
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)f.a(this.a), 1);
            }
        });
        this.g = (ImageView)this.findViewById(2131296787);
        this.g.setVisibility(8);
        this.j = (LinearLayout)this.findViewById(2131296788);
        this.i = (ImageView)this.findViewById(2131296977);
        this.i.setVisibility(8);
        this.h = (ImageView)this.findViewById(2131296396);
        this.h = (ImageView)this.findViewById(2131296396);
        this.h.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void onClick(View view) {
                this.a.d.setVisibility(0);
                this.a.e.setVisibility(8);
                f.i().setBackgroundColor(this.a.getResources().getColor(2131099681));
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(f.a(this.a).getWindowToken(), 0);
            }
        });
        this.s = (ImageView)this.findViewById(2131296754);
    }

    public void b() {
        this.f.setVisibility(8);
    }

    @Override
    public void b(int n2) {
        this.L = true;
        this.K = n2;
    }

    public void b(String string) {
        ((ArrayAdapter)this.m.getAdapter()).getFilter().filter((CharSequence)string);
    }

    public d c(int n2) {
        return (d)this.G.getItem(n2);
    }

    public void c() {
        this.j.removeAllViews();
    }

    public void c(String string) {
        ((TextView)this.findViewById(2131297354)).setText((CharSequence)string);
    }

    public void d() {
        this.g.setVisibility(0);
    }

    public void e() {
        this.i.setVisibility(0);
    }

    public void f() {
        View view = this.F;
        if (view != null && this.L) {
            view.setVisibility(0);
        }
    }

    public void g() {
        View view = this.F;
        if (view != null && this.K == 3) {
            view.setVisibility(8);
        }
    }

    public void h() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.I.dismiss();
        }
    }

    @Override
    public ProgressDialog k() {
        return this.I;
    }

    @Override
    public Handler l() {
        return this.l;
    }

    @Override
    public Activity m() {
        return this;
    }

    public void onClickMorningTrains(View view) {
        this.m.setSelection(0);
    }

    @SuppressLint(value={"NewApi"})
    @Override
    protected void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        this.setContentView(2131492978);
        this.B = this.getIntent().getBooleanExtra("isTrainAlert", false);
        this.getWindow().setSoftInputMode(3);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        E = (Toolbar)this.findViewById(2131297523);
        E.setTitle(2131755070);
        E.setTitleTextColor(-1);
        this.setSupportActionBar(E);
        this.getSupportActionBar().a(false);
        this.n = ConfigurationManager.b(this.getApplicationContext());
        this.p = (TextView)this.findViewById(2131296533);
        this.o = (TextView)this.findViewById(2131296425);
        this.o.setText((CharSequence)"m-Indicator");
        this.p.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        if (Calendar.getInstance().get(7) == 1) {
            if (Calendar.getInstance().get(11) > 3) {
                this.q = true;
            }
        } else if (Calendar.getInstance().get(7) == 2 && Calendar.getInstance().get(11) < 3) {
            this.q = true;
        }
        if (Calendar.getInstance().get(7) == 7) {
            if (Calendar.getInstance().get(11) > 3) {
                this.r = true;
            }
        } else if (Calendar.getInstance().get(7) == 1 && Calendar.getInstance().get(11) < 3) {
            this.r = true;
        }
        if ((view = this.findViewById(16908290)) != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, view){
                final /* synthetic */ View a;
                final /* synthetic */ f b;
                {
                    this.b = f2;
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
                        this.b.g();
                        return;
                    }
                    this.b.f();
                }
            });
        }
        this.j();
    }

    protected void onDestroy() {
        TextWatcher textWatcher;
        c.c(this.F);
        super.onDestroy();
        EditText editText = this.H;
        if (editText != null && (textWatcher = this.M) != null) {
            editText.removeTextChangedListener(textWatcher);
        }
    }

    protected void onPause() {
        this.h();
        c.b(this.F);
        this.D.a((Activity)this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.D.a((Activity)this, new com.mobond.mindicator.util.d(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void a() {
            }

            public void a(boolean bl) {
                f.b(this.a);
            }
        });
        c.a(this.F);
    }

}

