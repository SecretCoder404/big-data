/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  android.view.Window
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.widget.Toolbar
 *  androidx.fragment.app.d
 *  androidx.fragment.app.j
 *  androidx.fragment.app.n
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$f
 *  androidx.viewpager.widget.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Calendar
 *  java.util.Hashtable
 */
package com.mobond.mindicator.ui.train;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import androidx.viewpager.widget.ViewPager;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.k;
import com.mobond.mindicator.ui.multicity.CityMap;
import com.mobond.mindicator.ui.train.SelectLineUI;
import com.mobond.mindicator.ui.train.SlidingTabLayoutLocal;
import com.mobond.mindicator.ui.train.TrainActivity;
import java.util.Calendar;
import java.util.Hashtable;

public class TrainActivity
extends BaseAppCompatActivity
implements b {
    public static SlidingTabLayoutLocal a;
    public static View b;
    private static final String[] o;
    public Toolbar c;
    TextView d;
    TextView e;
    TextView f;
    SharedPreferences g;
    String h;
    boolean i = true;
    Activity j;
    boolean k = false;
    int l = 3;
    View m;
    LinearLayout n;
    private a p;
    private ViewPager q;
    private int r;

    static {
        o = new String[]{"STATION", "A to B", "FARE"};
    }

    @Override
    public void a() {
    }

    public void b() {
        View view = this.m;
        if (view != null && this.k) {
            view.setVisibility(0);
        }
    }

    @Override
    public void b(int n2) {
        this.k = true;
        this.r = n2;
    }

    public void c() {
        View view = this.m;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void d() {
        this.c.setVisibility(0);
        a.setVisibility(8);
        this.l = 1;
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        if (n2 != 2) {
            return;
        }
        if (n3 == -1) {
            Calendar calendar = Calendar.getInstance();
            int n4 = calendar.get(11);
            int n5 = calendar.get(12) + n4 * 60;
            String string = intent.getStringExtra("source_stn");
            com.mobond.mindicator.ui.train.b.a(string, intent.getStringExtra("destination_stn"), (Activity)this);
            com.mobond.mindicator.ui.train.b.a((Activity)this, n5, false);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ddd ddd ddd ddd ");
            stringBuilder.append(string);
            Log.d((String)"ddd", (String)stringBuilder.toString());
        }
    }

    @SuppressLint(value={"NewApi"})
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493149);
        this.n = (LinearLayout)this.findViewById(2131296359);
        this.j = this;
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        com.mobond.mindicator.ui.train.g.b = null;
        com.mobond.mindicator.ui.train.b.c = null;
        this.g = this.getSharedPreferences("m-indicator", 0);
        this.h = ConfigurationManager.b(this.getApplicationContext());
        this.c = (Toolbar)this.findViewById(2131297523);
        this.f = (TextView)this.findViewById(2131297354);
        this.d = (TextView)this.findViewById(2131296425);
        this.e = (TextView)this.findViewById(2131296533);
        this.d.setText((CharSequence)"m-Indicator");
        this.e.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        if (this.getIntent().getBooleanExtra("from_notif", false)) {
            String string = this.getIntent().getStringExtra("s");
            this.p = new a(this.getSupportFragmentManager(), true, string);
        } else {
            this.p = new a(this.getSupportFragmentManager(), false, null);
        }
        this.q = (ViewPager)this.findViewById(2131297069);
        this.q.setAdapter((androidx.viewpager.widget.a)this.p);
        a = (SlidingTabLayoutLocal)this.findViewById(2131297458);
        a.setViewPager(this.q);
        a.setOnPageChangeListener(new ViewPager.f(this){
            final /* synthetic */ TrainActivity a;
            {
                this.a = trainActivity;
            }

            public void a(int n2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("555 position: ");
                stringBuilder.append(n2);
                Log.d((String)"555", (String)stringBuilder.toString());
                if (n2 == 0) {
                    if (this.a.m != null && this.a.k) {
                        this.a.n.setVisibility(0);
                        return;
                    }
                } else if (this.a.m != null) {
                    this.a.n.setVisibility(8);
                }
            }

            public void a(int n2, float f2, int n3) {
            }

            public void b(int n2) {
            }
        });
        this.q.setCurrentItem(0);
        this.m = c.a((Activity)this, this.findViewById(2131297567), "ca-app-pub-5449278086868932/8814463646", "167101606757479_853950171405949", "ca-app-pub-5449278086868932/2827166481", "167101606757479_1235757756558520", 3, this);
        try {
            if (com.mobond.mindicator.a.a((Activity)this).n() == null) {
                com.mobond.mindicator.a.a((Activity)this).o();
            }
        }
        catch (Exception exception) {
            Log.d((String)"m-Indicator safety", (String)"safety Exception 111", (Throwable)exception);
        }
        if (this.h.equalsIgnoreCase("pune")) {
            this.f.setText((CharSequence)"Pune Local");
            this.d();
        }
        k k2 = new k();
        k2.a = "#FFFFFF";
        k2.b = "#707070";
        k2.f = "#303030";
        Log.d((String)"1111", (String)"nativeMergedTrainsAtUiAd adViewHomeScreen starting to load");
        b = c.a((Activity)this, null, null, null, "ca-app-pub-5449278086868932/3752145001", "167101606757479_1246233218844307", 3, null, k2, true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131558402, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        c.c(this.m);
        com.mulo.a.d.d.a();
        super.onDestroy();
    }

    public void onMapClick(View view) {
        this.startActivity(new Intent(view.getContext(), CityMap.class));
    }

    public void onPause() {
        c.a(this.m);
        super.onPause();
    }

    public void onResume() {
        c.a(this.m);
        super.onResume();
    }

    public void onSelectLine(View view) {
        Intent intent = new Intent(view.getContext(), SelectLineUI.class);
        com.mobond.mindicator.ui.multicity.a.a(view.getContext(), "TRAIN", "SELECT_LINE", "SELECT_TRAIN_LINE");
        this.startActivity(intent);
    }

    protected void onStart() {
        super.onStart();
        if (this.getIntent().getBooleanExtra("from_notif", false)) {
            c.c((Context)this);
        }
        new Thread(this){
            final /* synthetic */ TrainActivity a;
            {
                this.a = trainActivity;
            }

            public void run() {
                try {
                    2.sleep((long)500L);
                }
                catch (Exception exception) {}
                com.mulo.a.d.b.a((java.lang.Object)this.a.j, "local/sdr");
            }
        }.start();
    }

    protected void onStop() {
        super.onStop();
    }

    public class a
    extends n {
        boolean a;
        String b;

        public a(j j2, boolean bl, String string) {
            super(j2);
            this.a = bl;
            if (string != null) {
                this.b = string;
                return;
            }
            this.b = null;
        }

        public d a(int n2) {
            switch (n2) {
                default: {
                    if (!TrainActivity.this.i) break;
                    TrainActivity.this.i = false;
                    return com.mobond.mindicator.ui.train.g.a(n2 + 1, true, this.a, this.b);
                }
                case 2: {
                    return new com.mobond.mindicator.ui.train.a();
                }
                case 1: {
                    if (TrainActivity.this.i) {
                        TrainActivity.this.i = false;
                        return com.mobond.mindicator.ui.train.b.a(n2 + 1, true);
                    }
                    return com.mobond.mindicator.ui.train.b.a(n2 + 1, false);
                }
                case 0: {
                    if (TrainActivity.this.i) {
                        TrainActivity.this.i = false;
                        return com.mobond.mindicator.ui.train.g.a(n2 + 1, true, this.a, this.b);
                    }
                    return com.mobond.mindicator.ui.train.g.a(n2 + 1, false, this.a, this.b);
                }
            }
            return com.mobond.mindicator.ui.train.g.a(n2 + 1, false, this.a, this.b);
        }

        public int b() {
            if (TrainActivity.this.h.equalsIgnoreCase("pune")) {
                return 1;
            }
            return 3;
        }

        public CharSequence c(int n2) {
            return g.a(o[n2], g.a);
        }
    }

}

