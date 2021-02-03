/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.WindowManager
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.alert;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.alert.News;
import com.mobond.mindicator.ui.alert.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.k;
import com.mobond.mindicator.ui.multicity.Multicity_home;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mulo.b.e;
import java.util.ArrayList;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class News
extends BaseAppCompatActivity
implements SwipeRefreshLayout.b {
    public static String a = "BEST";
    public String b = "Loading..";
    public String c;
    ListView d;
    TextView e;
    ImageView f;
    LinearLayout g;
    Activity h;
    com.mobond.mindicator.b i;
    ProgressBar j;
    boolean k = false;
    SwipeRefreshLayout l;
    ImageView m;
    String n = "";
    Vector<View> o = new Vector();
    boolean p = false;
    boolean q = false;
    String r = ConfigurationManager.a();

    static /* synthetic */ void a(News news, String string) {
        news.e(string);
    }

    private View c() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager)this.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f2 = this.getResources().getDisplayMetrics().density;
        int n2 = (int)c.a(-16 + Math.round((float)((float)displayMetrics.widthPixels / f2)));
        k k2 = new k();
        k2.g = 2;
        if (this.p) {
            k2.e = "#2196F3";
        }
        return c.a((Activity)this, null, null, null, "ca-app-pub-5449278086868932/4334020976", "167101606757479_1235755749892054", n2, -1, 5, null, k2, true, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e(String string) {
        b b2 = this.d(string);
        if (b2 == null) return;
        try {
            com.mobond.mindicator.ui.alert.a a2 = new com.mobond.mindicator.ui.alert.a((Context)this, b2.a, this.o);
            this.d.setAdapter((ListAdapter)a2);
            this.d.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
                final /* synthetic */ News a;
                {
                    this.a = news;
                }

                public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                }
            });
            this.k = true;
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.i.b(this.c, "");
        }
    }

    public void a() {
        this.d.setVisibility(0);
        AsyncTask<String, String, String> asyncTask = new AsyncTask<String, String, String>(true){
            boolean a = false;
            boolean b = false;
            {
                this.b = bl;
            }

            protected /* varargs */ String a(String ... arrstring) {
                String string = "";
                try {
                    string = e.a(e.a(arrstring[0], (Context)News.this));
                    News.this.i.b(News.this.c, string);
                    return string;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    this.a = true;
                    return string;
                }
            }

            /*
             * Exception decompiling
             */
            protected void a(String var1) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
                // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
                // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
                // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
                // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
                // org.benf.cfr.reader.b.a(Driver.java:128)
                // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
                // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
                // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
                // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
                // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
                // java.lang.Thread.run(Thread.java:919)
                throw new IllegalStateException("Decompilation failed");
            }

            protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                return this.a((String[])arrobject);
            }

            protected /* synthetic */ void onPostExecute(Object object) {
                this.a((String)object);
            }

            protected void onPreExecute() {
                super.onPreExecute();
                if (!this.b) {
                    News.this.j.setVisibility(0);
                }
            }
        };
        Object[] arrobject = new String[1];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.r);
        stringBuilder.append(this.n);
        arrobject[0] = stringBuilder.toString();
        asyncTask.execute(arrobject);
    }

    public void a(int n2) {
        this.findViewById(2131297523).setBackgroundColor(n2);
    }

    public void a(String string) {
        this.q = true;
        this.r = string;
    }

    public void b() {
        this.g.setVisibility(8);
    }

    public void b(int n2) {
        this.findViewById(2131296424).setBackgroundColor(n2);
    }

    public void b(String string) {
        this.b = string;
    }

    public void c(int n2) {
        this.f.setImageResource(n2);
        this.f.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ News a;
            {
                this.a = news;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    public void c(String string) {
        this.e.setText((CharSequence)string);
    }

    b d(String string) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(string).getJSONArray("alerts");
        int n2 = 0;
        do {
            if (n2 >= jSONArray.length()) break;
            JSONObject jSONObject = jSONArray.getJSONObject(n2);
            com.mobond.mindicator.ui.alert.c c2 = new com.mobond.mindicator.ui.alert.c();
            if (jSONObject.has("imgurl")) {
                c2.a = jSONObject.getString("imgurl");
            }
            c2.b = jSONObject.getString("title");
            c2.d = jSONObject.getString("date");
            c2.c = jSONObject.getString("content");
            arrayList.add((Object)c2);
            ++n2;
        } while (true);
        try {
            this.k = true;
            b b2 = new b((ArrayList<com.mobond.mindicator.ui.alert.c>)arrayList);
            return b2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void onClickCentral(View view) {
        TrainsAtStationUI.a((Activity)this, com.mobond.mindicator.ui.multicity.a.a[1], "", this.c);
    }

    public void onClickHarbour(View view) {
        TrainsAtStationUI.a((Activity)this, com.mobond.mindicator.ui.multicity.a.a[2], "", this.c);
    }

    public void onClickReload(View view) {
    }

    public void onClickTransharbour(View view) {
        TrainsAtStationUI.a((Activity)this, com.mobond.mindicator.ui.multicity.a.a[3], "", this.c);
    }

    public void onClickUran(View view) {
        TrainsAtStationUI.a((Activity)this, com.mobond.mindicator.ui.multicity.a.a[4], "", this.c);
    }

    public void onClickWestern(View view) {
        TrainsAtStationUI.a((Activity)this, com.mobond.mindicator.ui.multicity.a.a[0], "", this.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493078);
        this.e = (TextView)this.findViewById(2131297354);
        this.f = (ImageView)this.findViewById(2131296382);
        this.g = (LinearLayout)this.findViewById(2131296514);
        if (!this.getIntent().getBooleanExtra("chatroom", true)) {
            this.b();
        }
        this.i = com.mobond.mindicator.a.a((Activity)this);
        if (!this.i.A().equals((Object)"mumbai")) {
            this.b();
        }
        try {
            String string;
            this.l = (SwipeRefreshLayout)this.findViewById(2131297454);
            this.l.setOnRefreshListener((SwipeRefreshLayout.b)this);
            this.d = (ListView)this.findViewById(2131296366);
            this.j = (ProgressBar)this.findViewById(2131296963);
            this.m = (ImageView)this.findViewById(2131297183);
            Intent intent = this.getIntent();
            String string2 = intent.getStringExtra("urlParameter");
            String string3 = intent.getStringExtra("alerttype");
            if (string2 != null) {
                if (string2.contains((CharSequence)"indianrail")) {
                    this.p = true;
                    this.b(this.getResources().getColor(2131099880));
                    this.a(this.getResources().getColor(2131099879));
                }
                this.n = this.q ? "" : string2;
            }
            if (string3 != null) {
                this.c = string3;
            }
            if ((string = this.i.a(this.c, "")) != null && !string.equals((Object)"")) {
                this.e(string);
            }
            this.m.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ News a;
                {
                    this.a = news;
                }

                public void onClick(View view) {
                    this.a.d.setVisibility(0);
                    AsyncTask<String, String, String> asyncTask = new /* invalid duplicate definition of identical inner class */;
                    Object[] arrobject = new String[1];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.a.r);
                    stringBuilder.append(this.a.n);
                    arrobject[0] = stringBuilder.toString();
                    asyncTask.execute(arrobject);
                }
            });
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.i.b(this.c, "");
        }
        View view = this.c();
        View view2 = this.c();
        this.o.add((Object)view);
        this.o.add((Object)view2);
        this.d.setVisibility(0);
        AsyncTask<String, String, String> asyncTask = new /* invalid duplicate definition of identical inner class */;
        Object[] arrobject = new String[1];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.r);
        stringBuilder.append(this.n);
        arrobject[0] = stringBuilder.toString();
        asyncTask.execute(arrobject);
    }

    public void onShareAlertNewsClicked(View view) {
        com.mobond.mindicator.ui.multicity.a.a((Context)this.h, "MULTICITY_NEWS", "NEWS_WHATSAPP_SHARE", "NEWS");
        Multicity_home.onShareAlertNewsClickedStatic(view);
    }

}

