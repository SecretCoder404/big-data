/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
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
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Vector
 */
package com.mobond.mindicator.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
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
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public abstract class l
extends BaseAppCompatActivity
implements com.mobond.mindicator.ui.b {
    private int A;
    private boolean B = false;
    private TextWatcher C = new TextWatcher(this){
        final /* synthetic */ l a;
        {
            this.a = l2;
        }

        public void afterTextChanged(android.text.Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }

        public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            ((ArrayAdapter)this.a.r.getAdapter()).getFilter().filter(charSequence);
        }
    };
    public Toolbar a;
    public LinearLayout b;
    public EditText c = null;
    public boolean d = true;
    public ArrayList<String> e = new ArrayList();
    public ArrayList<String> f = null;
    public int g = -1;
    public boolean h = true;
    public boolean i = false;
    public int j = 0;
    View k;
    String l = "ca-app-pub-5449278086868932/8862800847";
    String m = "167101606757479_853949841405982";
    String n = "ca-app-pub-5449278086868932/2495764777";
    String o = "167101606757479_1230371800430449";
    String p = "";
    TextView q;
    ListView r;
    RelativeLayout s;
    RelativeLayout t;
    ImageView u;
    ImageView v;
    TextView w;
    TextView x;
    int y;
    com.mobond.mindicator.b z;

    public void a(int n2) {
        this.y = n2;
        this.a.setBackgroundColor(n2);
    }

    public abstract void a(View var1, String var2, int var3);

    public void a(String string) {
        this.p = string;
        ((TextView)this.findViewById(2131297354)).setText((CharSequence)string);
    }

    public void a(String string, String string2, String string3, String string4, int n2) {
        this.l = string;
        this.m = string2;
        this.n = string3;
        this.o = string4;
        this.A = n2;
    }

    public void a(String[] arrstring) {
        Vector vector = new Vector();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            vector.add((Object)arrstring[i2]);
        }
        this.e = new ArrayList((Collection)vector);
        this.b();
    }

    public void a(String[] arrstring, String[] arrstring2) {
        this.e = new ArrayList((Collection)Arrays.asList((Object[])arrstring));
        if (arrstring2 != null) {
            this.f = new ArrayList((Collection)Arrays.asList((Object[])arrstring2));
        }
        this.b();
    }

    public void b() {
        if (this.d) {
            this.k = c.a((Activity)this, this.findViewById(2131296343), this.l, this.m, this.n, this.o, this.A, this);
        }
        this.c = (EditText)this.findViewById(2131297278);
        this.c.addTextChangedListener(this.C);
        this.r = (ListView)this.findViewById(2131296935);
        this.r.setAdapter((ListAdapter)new ArrayAdapter<String>(){
            private Filter b;
            {
                this.addAll(l.this.e);
            }

            public Filter getFilter() {
                Log.d((String)"getFilter", (String)"called");
                if (this.b == null) {
                    this.b = new Filter(){

                        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                            String string = charSequence.toString().toUpperCase();
                            Filter.FilterResults filterResults = new Filter.FilterResults();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(" ");
                            stringBuilder.append(string);
                            String string2 = stringBuilder.toString();
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("-");
                            stringBuilder2.append(string);
                            String string3 = stringBuilder2.toString();
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(",");
                            stringBuilder3.append(string);
                            String string4 = stringBuilder3.toString();
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("[");
                            stringBuilder4.append(string);
                            String string5 = stringBuilder4.toString();
                            boolean bl = l.this.f != null;
                            int n2 = l.this.e.size();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                String string6;
                                boolean bl2;
                                String string7 = (String)l.this.e.get(i2);
                                String string8 = string7.toUpperCase();
                                if (!(string8.startsWith(string) || string8.contains((CharSequence)string2) || string8.contains((CharSequence)string3) || string8.contains((CharSequence)string4) || string8.contains((CharSequence)string5))) {
                                    bl2 = false;
                                } else {
                                    arrayList.add((Object)string7);
                                    bl2 = true;
                                }
                                if (!bl || bl2 || !(string6 = ((String)l.this.f.get(i2)).toUpperCase()).startsWith(string) && !string6.contains((CharSequence)string2) && !string6.contains((CharSequence)string3) && !string6.contains((CharSequence)string4) && !string6.contains((CharSequence)string5)) continue;
                                arrayList.add(l.this.e.get(i2));
                            }
                            filterResults.count = arrayList.size();
                            filterResults.values = arrayList;
                            return filterResults;
                        }

                        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                            a.this.clear();
                            a.this.addAll((Collection)((ArrayList)filterResults.values));
                            a.this.notifyDataSetChanged();
                            int n2 = a.this.getCount();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                String string = (String)a.this.getItem(i2);
                                if (l.this.e.indexOf((Object)string) < l.this.g) continue;
                                l.this.r.setSelection(i2);
                                return;
                            }
                        }
                    };
                }
                return this.b;
            }

            public View getView(int n2, View view, ViewGroup viewGroup) {
                b b2;
                if (view == null) {
                    view = l.this.getLayoutInflater().inflate(2131493132, viewGroup, false);
                    b2 = new Object(){
                        protected LinearLayout a;
                        protected ImageView b;
                        protected TextView c;
                    };
                    b2.a = (LinearLayout)view.findViewById(2131297442);
                    b2.b = (ImageView)view.findViewById(2131296865);
                    b2.c = (TextView)view.findViewById(2131297245);
                    view.setTag((Object)b2);
                } else {
                    b2 = view.getTag();
                }
                if (n2 < l.this.j) {
                    b2.b.setImageResource(2131230902);
                    b2.c.setTextColor(-7829368);
                } else {
                    b2.b.setImageResource(2131230908);
                    b2.c.setTextColor(-1);
                }
                String string = (String)this.getItem(n2);
                b2.c.setText((CharSequence)g.a(string, g.a));
                if (l.this.i) {
                    if (!(string.contains((CharSequence)"CHURCHGATE") || string.contains((CharSequence)"MUMBAI CENTRAL") || string.contains((CharSequence)"DADAR") || string.contains((CharSequence)"BANDRA") || string.contains((CharSequence)"ANDHERI") || string.contains((CharSequence)"BORIVALI") || string.contains((CharSequence)"BHAYANDER") || string.contains((CharSequence)"VASAI ROAD") || string.contains((CharSequence)"VIRAR") || string.contains((CharSequence)"DAHANU ROAD") || string.contains((CharSequence)"CSMT") || string.contains((CharSequence)"BYCULLA") || string.contains((CharSequence)"KURLA") || string.contains((CharSequence)"GHATKOPAR") || string.contains((CharSequence)"THANE") || string.contains((CharSequence)"DOMBIVLI") || string.contains((CharSequence)"KALYAN") || string.contains((CharSequence)"AMBERNATH") || string.contains((CharSequence)"BADLAPUR") || string.contains((CharSequence)"KARJAT") || string.contains((CharSequence)"KHOPOLI") || string.contains((CharSequence)"TITWALA") || string.contains((CharSequence)"ASANGAON") || string.contains((CharSequence)"KASARA") || string.contains((CharSequence)"VADALA ROAD") || string.contains((CharSequence)"MANKHURD") || string.contains((CharSequence)"VASHI") || string.contains((CharSequence)"NERUL") || string.contains((CharSequence)"BELAPUR CBD") || string.contains((CharSequence)"KHARGHAR") || string.contains((CharSequence)"PANVEL") || string.contains((CharSequence)"KOPARKHAIRNE") || string.contains((CharSequence)"ROHA"))) {
                        b2.c.setTextColor(-1);
                    } else {
                        b2.c.setTextColor(-16711936);
                    }
                }
                if (l.this.h && l.this.g != -1 && l.this.r.getCount() == l.this.e.size() && n2 == l.this.g) {
                    b2.a.setBackgroundResource(2131230947);
                    return view;
                }
                if (n2 % 2 == 0) {
                    b2.a.setBackgroundResource(2131230838);
                    return view;
                }
                b2.a.setBackgroundResource(2131231006);
                return view;
            }

        });
        this.r.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final /* synthetic */ l a;
            {
                this.a = l2;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                Object object = this.a.r.getItemAtPosition(n2);
                l l3 = this.a;
                l3.a((View)l3.r, object.toString(), n2);
            }
        });
        this.q = (TextView)this.findViewById(2131297354);
        this.q.setTextColor(Color.parseColor((String)"#ffffff"));
        this.s = (RelativeLayout)this.findViewById(2131296968);
        this.t = (RelativeLayout)this.findViewById(2131297275);
        this.u = (ImageView)this.findViewById(2131297274);
        this.u.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ l a;
            {
                this.a = l2;
            }

            public void onClick(View view) {
                this.a.s.setVisibility(8);
                this.a.t.setVisibility(0);
                this.a.a.setBackgroundColor(-1);
                this.a.c.requestFocus();
                android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((View)this.a.c, 1);
                }
            }
        });
        this.v = (ImageView)this.findViewById(2131296396);
        this.v.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ l a;
            {
                this.a = l2;
            }

            public void onClick(View view) {
                this.a.s.setVisibility(0);
                this.a.t.setVisibility(8);
                this.a.a.setBackgroundColor(this.a.y);
                android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(this.a.c.getWindowToken(), 0);
                }
            }
        });
        this.b = (LinearLayout)this.findViewById(2131296424);
        this.w = (TextView)this.findViewById(2131296425);
        this.w.setText((CharSequence)"m-Indicator");
        this.x = (TextView)this.findViewById(2131296533);
        this.x.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
    }

    @Override
    public void b(int n2) {
        this.B = true;
        this.A = n2;
    }

    public void b(String string) {
        this.c.setHint((CharSequence)string);
    }

    public void c() {
        this.u.performClick();
    }

    public void c(int n2) {
        this.r.setSelection(n2);
    }

    public void d() {
        View view = this.k;
        if (view != null && this.B) {
            view.setVisibility(0);
        }
    }

    public void e() {
        View view = this.k;
        if (view != null && this.A == 3) {
            view.setVisibility(8);
        }
    }

    @SuppressLint(value={"NewApi"})
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493000);
        this.z = com.mobond.mindicator.a.a((Activity)this);
        this.y = this.getResources().getColor(2131099681);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        this.getWindow().setSoftInputMode(3);
        this.a = (Toolbar)this.findViewById(2131297523);
        this.a.setTitle(2131755070);
        this.a.setTitleTextColor(-1);
        this.setSupportActionBar(this.a);
        this.getSupportActionBar().a(false);
        View view = this.findViewById(16908290);
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, view){
                final /* synthetic */ View a;
                final /* synthetic */ l b;
                {
                    this.b = l2;
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
                        this.b.e();
                        return;
                    }
                    this.b.d();
                }
            });
        }
    }

    protected void onDestroy() {
        this.c.removeTextChangedListener(this.C);
        c.c(this.k);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.k);
    }

    public void onResume() {
        super.onResume();
        c.a(this.k);
    }

}

