/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.Button
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  java.io.ByteArrayInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.Vector
 *  java.util.zip.GZIPInputStream
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.seatavailability;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.a.a.a.g;
import com.a.a.m;
import com.a.a.o;
import com.a.a.p;
import com.a.a.r;
import com.mobond.mindicator.ui.indianrail.IRActivity;
import com.mobond.mindicator.ui.indianrail.a.d;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.indianrail.seatavailability.c;
import com.mobond.mindicator.ui.k;
import com.mobond.mindicator.ui.n;
import com.mulo.util.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class ActivitySeatStatus
extends androidx.appcompat.app.e {
    public static final String[] a = new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    public static final String[] b = new String[]{"\u091c\u0928\u0935\u0930\u0940", "\u092b\u093c\u0930\u0935\u0930\u0940", "\u092e\u093e\u0930\u094d\u091a", "\u0905\u092a\u094d\u0930\u0948\u0932", "\u092e\u0908", "\u091c\u0942\u0928", "\u091c\u0941\u0932\u093e\u0908", "\u0905\u0917\u0938\u094d\u0924", "\u0938\u093f\u0924\u0902\u092c\u0930", "\u0905\u0915\u094d\u091f\u0942\u092c\u0930", "\u0928\u0935\u0902\u092c\u0930", "\u0926\u093f\u0938\u0902\u092c\u0930"};
    public static final String[] c = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    public static final String[] d = new String[]{"\u0930\u0935\u093f", "\u0938\u094b\u092e", "\u092e\u0902\u0917\u0932", "\u092c\u0941\u0927", "\u0917\u0941\u0930\u0941", "\u0936\u0941\u0915\u094d\u0930", "\u0936\u0928\u093f"};
    public static String[] e = null;
    public static String[] f = null;
    public int g = 0;
    public boolean h = false;
    public com.mobond.mindicator.ui.indianrail.seatavailability.b i;
    public StickyListHeadersListView j;
    public ImageView k;
    public int l;
    public c m;
    public ProgressBar n;
    public Button o;
    public TextView p;
    ImageButton q;
    int r = 0;
    View s;
    private ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> t;
    private ViewGroup u;
    private boolean v;
    private String w;
    private String x;
    private View y;

    private void a(View view) {
        this.u.post(new Runnable(this, view){
            final /* synthetic */ View a;
            final /* synthetic */ ActivitySeatStatus b;
            {
                this.b = activitySeatStatus;
                this.a = view;
            }

            public void run() {
                ((android.widget.HorizontalScrollView)ActivitySeatStatus.a(this.b).getParent()).smoothScrollTo(this.a.getLeft(), 0);
                if (this.b.s != null && this.a != this.b.s) {
                    this.b.s.setBackgroundColor(-1);
                }
                this.a.setBackgroundColor(-3355444);
                this.b.s = this.a;
            }
        });
    }

    static /* synthetic */ void a(ActivitySeatStatus activitySeatStatus, String string) {
        activitySeatStatus.b(string);
    }

    public static void a(String string) {
        int n2 = 0;
        int n3 = 0;
        while (n2 < string.length()) {
            if ((n2 += 3000) > string.length()) {
                Log.d((String)"ActivitySeatStatus", (String)string);
            } else {
                Log.d((String)"ActivitySeatStatus", (String)string.substring(n3, n2));
            }
            n3 += 3000;
        }
    }

    public static void a(boolean bl) {
        if (bl) {
            e = b;
            f = d;
            return;
        }
        e = a;
        f = c;
    }

    static /* synthetic */ void b(ActivitySeatStatus activitySeatStatus) {
        activitySeatStatus.h();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void b(String var1_1) {
        block16 : {
            block14 : {
                var2_2 = new ArrayList(this.i.a);
                try {
                    var3_3 = new JSONObject(var1_1);
                    var5_4 = var3_3.getJSONArray("spltrains");
                    var6_5 = 0;
lbl6: // 2 sources:
                    do {
                        if (var6_5 < var5_4.length()) {
                            var16_6 = var5_4.getJSONObject(var6_5);
                            var17_7 = var16_6.getString("trainNo");
                            if (this.m.a.containsKey((Object)var17_7)) {
                                var18_8 = var5_4;
                                break block14;
                            }
                            var19_9 = var16_6.getString("runsFromStn");
                            var20_10 = var16_6.getInt("validityfrom");
                            var21_11 = var16_6.getInt("validityto");
                            var22_12 = c.a((Context)this, var16_6);
                            this.m.b(this.getApplicationContext(), var16_6);
                            var23_13 = 0;
                            var24_14 = 0;
                            break;
                        }
                        var7_26 = var3_3.getJSONArray("seatavl");
                        var8_27 = 0;
                        break block16;
                        break;
                    } while (true);
                }
                catch (Exception var4_35) {
                    var4_35.printStackTrace();
                    return;
                }
                do {
                    block21 : {
                        block20 : {
                            block17 : {
                                block18 : {
                                    block19 : {
                                        if (var23_13 >= var2_2.size()) break block17;
                                        var25_15 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)var2_2.get(var23_13);
                                        var26_16 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get(var25_15.b);
                                        var27_17 = var26_16.f;
                                        if (var27_17 == var24_14 || var27_17 < var20_10 || var27_17 > var21_11) break block18;
                                        if (!var19_9.equals((Object)"DAILY") && !var19_9.contains((CharSequence)ActivitySeatStatus.f[var26_16.c])) break block19;
                                        var29_19 = var25_15.b;
                                        var30_20 = var26_16.d;
                                        var31_21 = var26_16.b;
                                        var32_22 = var26_16.a;
                                        var33_23 = 1 + var26_16.c;
                                        var18_8 = var5_4;
                                        var28_18 = var27_17;
                                        var2_2.add(var23_13, (Object)c.a(var22_12, var29_19, var30_20, var31_21, var32_22, var33_23));
                                        break block20;
                                    }
                                    var18_8 = var5_4;
                                    var28_18 = var27_17;
                                    break block21;
                                }
                                var18_8 = var5_4;
                                var28_18 = var27_17;
                                break block21;
                            }
                            var18_8 = var5_4;
                            break;
                        }
                        for (var34_24 = 1 + var25_15.b; var34_24 < this.m.c.size(); var35_25.e = 1 + var35_25.e, ++var34_24) {
                            var35_25 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get(var34_24);
                        }
                        --var23_13;
                    }
                    if (var28_18 > var21_11) break;
                    ++var23_13;
                    var24_14 = var28_18;
                    var5_4 = var18_8;
                } while (true);
            }
            ++var6_5;
            var5_4 = var18_8;
            ** while (true)
        }
        block6 : do {
            if (var8_27 >= var7_26.length()) {
                this.runOnUiThread(new Runnable(this, var2_2){
                    final /* synthetic */ ArrayList a;
                    final /* synthetic */ ActivitySeatStatus b;
                    {
                        this.b = activitySeatStatus;
                        this.a = arrayList;
                    }

                    public void run() {
                        this.b.i.a((ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b>)this.a);
                    }
                });
                return;
            }
            var9_28 = var7_26.getString(var8_27).split("-");
            var10_29 = var9_28[0];
            var11_30 = var9_28[3].split("#");
            var12_31 = var11_30.length;
            var13_32 = 0;
            do {
                if (var13_32 < var12_31) {
                    var14_33 = var11_30[var13_32].split("=");
                } else {
                    ++var8_27;
                    continue block6;
                }
                for (var15_34 = 0; var15_34 < this.l; ++var15_34) {
                    if (!((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)var2_2.get((int)var15_34)).a.a.equals((Object)var10_29) || ((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)var2_2.get((int)var15_34)).b)).f != Integer.parseInt((String)var14_33[0])) continue;
                    ((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)var2_2.get((int)var15_34)).e = var14_33[1];
                    break;
                }
                ++var13_32;
            } while (true);
            break;
        } while (true);
    }

    private void g() {
        this.m = new c(this);
        this.m.a(this.w, this.x);
    }

    private void h() {
        this.m = new c(this);
        this.m.b(this.w, this.x);
    }

    private void i() {
        this.u = (ViewGroup)this.findViewById(2131296610);
        View.OnClickListener onClickListener = new View.OnClickListener(){

            public void onClick(View view) {
                for (int i2 = 0; i2 < ActivitySeatStatus.this.u.getChildCount(); ++i2) {
                    if (view != ActivitySeatStatus.this.u.getChildAt(i2)) continue;
                    int n2 = ActivitySeatStatus.this.u.getChildCount();
                    if (n2 != 0 && i2 >= 0) {
                        if (i2 >= n2) {
                            return;
                        }
                        View view2 = ActivitySeatStatus.this.u.getChildAt(i2);
                        if (view2 != null) {
                            ActivitySeatStatus.this.a(view2);
                        }
                        ActivitySeatStatus.this.a(i2);
                        return;
                    }
                    return;
                }
            }
        };
        for (int i2 = 0; i2 < this.m.c.size(); ++i2) {
            View view = LayoutInflater.from((Context)this.getApplicationContext()).inflate(2131493046, this.u, false);
            TextView textView = (TextView)view.findViewById(2131296612);
            TextView textView2 = (TextView)view.findViewById(2131296990);
            TextView textView3 = (TextView)view.findViewById(2131297678);
            if (com.mobond.mindicator.a.b((Activity)this).D()) {
                textView2.setTypeface(null, 1);
                textView2.setTextSize(16.0f);
                textView3.setTextSize(14.0f);
            }
            if (((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)i2)).c == 0) {
                textView.setTextColor(-3790808);
                textView2.setTextColor(-3790808);
                textView3.setTextColor(-3790808);
            }
            textView.setText((CharSequence)String.valueOf((int)((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)i2)).a));
            textView2.setText((CharSequence)e[((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)i2)).b]);
            textView3.setText((CharSequence)f[((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)i2)).c]);
            view.setOnClickListener(onClickListener);
            this.u.addView(view);
        }
    }

    private void j() {
        this.t = new ArrayList();
        for (int i2 = 0; i2 < this.m.e.size(); ++i2) {
            this.t.add((Object)new com.mobond.mindicator.ui.indianrail.seatavailability.a.b((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.m.e.get(i2)));
        }
        this.m.e.clear();
        this.m.e = null;
        this.i();
        this.l = this.t.size();
        com.mobond.mindicator.ui.indianrail.seatavailability.a a2 = new com.mobond.mindicator.ui.indianrail.seatavailability.a((Activity)this, this.t, this.y, d.b, d.a.size(), this.j, this.m.c);
        this.j.setAdapter(a2);
        this.a(this.u.getChildAt(0));
        this.j.post(new Runnable(this, a2){
            final /* synthetic */ com.mobond.mindicator.ui.indianrail.seatavailability.a a;
            final /* synthetic */ ActivitySeatStatus b;
            {
                this.b = activitySeatStatus;
                this.a = a2;
            }

            public void run() {
                this.a.notifyDataSetChanged();
                this.b.j.setSelection(d.b);
            }
        });
        this.q.setVisibility(0);
    }

    private void k() {
        com.mobond.mindicator.ui.indianrail.seatavailability.b b2;
        this.t = new ArrayList();
        for (int i2 = 0; i2 < this.m.d.size(); ++i2) {
            this.t.add((Object)new com.mobond.mindicator.ui.indianrail.seatavailability.a.b((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.m.d.get(i2)));
        }
        this.m.d.clear();
        this.m.d = null;
        this.i();
        this.l = this.t.size();
        this.r = this.c();
        this.i = b2 = new com.mobond.mindicator.ui.indianrail.seatavailability.b((Activity)this, this.t, this.y, this.r, 20, this.j, this.m.c, this.m.a);
        this.j.setAdapter(this.i);
        this.j.setOnScrollListener(new AbsListView.OnScrollListener(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void onScroll(AbsListView absListView, int n2, int n3, int n4) {
            }

            public void onScrollStateChanged(AbsListView absListView, int n2) {
                this.a.g = n2;
            }
        });
        this.a(this.u.getChildAt(0));
        this.d();
        this.q.setVisibility(0);
    }

    private void l() {
        if (this.g != 2) {
            this.j.post(new Runnable(this){
                final /* synthetic */ ActivitySeatStatus a;
                {
                    this.a = activitySeatStatus;
                }

                public void run() {
                    this.a.i.notifyDataSetChanged();
                }
            });
        }
    }

    private void m() {
        o o2 = com.a.a.a.r.a((Context)this);
        com.a.a.a.p p2 = new com.a.a.a.p(1, "http://m.mobond.com/irgetseatdata", new p.b<String>(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void a(String string) {
                new java.lang.Thread(new Runnable(this, string){
                    final /* synthetic */ String a;
                    final /* synthetic */ 4 b;
                    {
                        this.b = var1_1;
                        this.a = string;
                    }

                    public void run() {
                        ActivitySeatStatus.a(this.b.a, this.a);
                    }
                }).start();
            }

            public /* synthetic */ void onResponse(Object object) {
                this.a((String)object);
            }
        }, new p.a(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void onErrorResponse(com.a.a.u u2) {
                ActivitySeatStatus.a(u2.toString());
            }
        }){

            @Override
            public Map<String, String> getHeaders() {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"User-agent", (Object)"Mozilla/5.0");
                hashMap.put((Object)"Accept-Encoding", (Object)"gzip");
                return hashMap;
            }

            @Override
            protected Map<String, String> getParams() {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"data", (Object)ActivitySeatStatus.this.m.b);
                hashMap.put((Object)"src", (Object)ActivitySeatStatus.this.w);
                hashMap.put((Object)"dest", (Object)ActivitySeatStatus.this.x);
                return hashMap;
            }

            @Override
            protected p<String> parseNetworkResponse(com.a.a.k k2) {
                String string = (String)k2.c.get((Object)"Content-Encoding");
                if (string != null && string.equals((Object)"gzip")) {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream((InputStream)new ByteArrayInputStream(k2.b));
                        String string2 = new String(e.a((InputStream)gZIPInputStream));
                        gZIPInputStream.close();
                        p<String> p2 = p.a(string2, g.a(k2));
                        return p2;
                    }
                    catch (IOException iOException) {
                        return p.a(new m());
                    }
                }
                return p.a(new String(k2.b), g.a(k2));
            }
        };
        p2.setRetryPolicy(new com.a.a.e(30000, 1, 1.0f));
        o2.a(p2);
    }

    private void n() {
        if (this.v) {
            final String[] arrstring = new String[]{null};
            arrstring[0] = "[";
            for (String string : this.m.a.keySet()) {
                String string2 = ((com.mobond.mindicator.ui.indianrail.seatavailability.a.c)this.m.a.get((Object)string)).d;
                if (string2 == null) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(arrstring[0]);
                String string3 = arrstring[0].equals((Object)"[") ? "\"" : ",\"";
                stringBuilder.append(string3);
                stringBuilder.append(string2);
                stringBuilder.append("\"");
                arrstring[0] = stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(arrstring[0]);
            stringBuilder.append("]");
            arrstring[0] = stringBuilder.toString();
            if (!arrstring[0].equals((Object)"[]")) {
                o o2 = com.a.a.a.r.a((Context)this);
                com.a.a.a.p p2 = new com.a.a.a.p(1, "http://m.mobond.com/irputseatdata", new p.b<String>(this){
                    final /* synthetic */ ActivitySeatStatus a;
                    {
                        this.a = activitySeatStatus;
                    }

                    public void a(String string) {
                    }

                    public /* synthetic */ void onResponse(Object object) {
                        this.a((String)object);
                    }
                }, new p.a(this){
                    final /* synthetic */ ActivitySeatStatus a;
                    {
                        this.a = activitySeatStatus;
                    }

                    public void onErrorResponse(com.a.a.u u2) {
                    }
                }){

                    @Override
                    protected Map<String, String> getParams() {
                        HashMap hashMap = new HashMap();
                        hashMap.put((Object)"data", (Object)arrstring[0]);
                        return hashMap;
                    }
                };
                p2.setRetryPolicy(new com.a.a.e(30000, 1, 1.0f));
                o2.a(p2);
            }
        }
        Log.d((String)"handlePostResponse", (String)"seat data uploaded to server");
    }

    public void a() {
        this.j();
    }

    public void a(int n2) {
        this.j.setSelection(((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)n2)).e);
    }

    public void a(int n2, int n3, int n4, byte by) {
        com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.i.a.get(n4);
        byte by2 = b2.j;
        this.a(n4, b2.a.a, by2, 6);
    }

    public void a(int n2, String string, byte by, int n3) {
        int n4 = 0;
        while (n2 < this.l) {
            com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.i.a.get(n2);
            if (b2.a.a.equalsIgnoreCase(string)) {
                b2.j = by;
                ++n4;
            }
            if (n4 == n3) {
                return;
            }
            ++n2;
        }
    }

    public void a(int n2, String string, String string2, int n3) {
        int n4 = 0;
        while (n2 < this.l) {
            com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.i.a.get(n2);
            if (b2.a.a.equalsIgnoreCase(string)) {
                b2.c = string2;
                ++n4;
            }
            if (n4 == n3) {
                return;
            }
            ++n2;
        }
    }

    /*
     * Exception decompiling
     */
    public void a(int var1_1, String var2_2, String var3_3, String var4_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[WHILELOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    public void a(String string, int n2) {
        for (int i2 = n2; i2 < this.l; ++i2) {
            com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.i.a.get(i2);
            if (!b2.a.a.equalsIgnoreCase(string)) continue;
            b2.h = true;
        }
        this.b(n2);
    }

    public void a(String string, String string2) {
        com.mobond.mindicator.ui.indianrail.seatavailability.a.c c2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.c)this.m.a.get((Object)string);
        c2.b = string2.split(",");
        for (int i2 = 0; i2 < c2.c.length; ++i2) {
            if (!string2.contains((CharSequence)c2.c[i2][0])) continue;
            c2.c[i2][1] = "";
        }
        SharedPreferences.Editor editor = this.getSharedPreferences("class_types_sp", 0).edit();
        editor.putString(string, string2);
        editor.apply();
    }

    public void b() {
        this.k();
        this.m();
        this.q.setVisibility(8);
        this.j.post(new Runnable(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void run() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("1111 focusPosOnline: ");
                stringBuilder.append(this.a.r);
                Log.d((String)"1111", (String)stringBuilder.toString());
                this.a.j.clearFocus();
                this.a.i.notifyDataSetChanged();
                this.a.j.requestFocusFromTouch();
                this.a.j.setSelection(this.a.r);
            }
        });
    }

    public void b(int n2) {
        ActivitySeatStatus activitySeatStatus = this;
        synchronized (activitySeatStatus) {
            if (n2 >= this.j.getFirstVisiblePosition() && n2 <= this.j.getLastVisiblePosition()) {
                this.l();
            }
            return;
        }
    }

    public int c() {
        String string = e.e();
        int n2 = ((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.t.get((int)0)).b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1111 startBoardingDate:");
        stringBuilder.append(n2);
        Log.d((String)"1111", (String)stringBuilder.toString());
        for (int i2 = 0; i2 < this.t.size(); ++i2) {
            if (((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.t.get((int)i2)).b == n2) {
                if (((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.t.get((int)i2)).a.m.compareToIgnoreCase(string) < 0) continue;
                return i2;
            }
            return i2 - 1;
        }
        return 0;
    }

    public void d() {
        Iterator iterator = this.e().iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.i.a.get(n2);
            this.a(((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)b2.b)).a, ((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.m.c.get((int)b2.b)).b, n2, (byte)0);
        }
    }

    public ArrayList<Integer> e() {
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        for (int i2 = 0; i2 < this.l; ++i2) {
            com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.i.a.get(i2);
            if (b2.c == null) {
                arrayList.add((Object)i2);
                this.a(i2, b2.a.a, "LOADING", 6);
                ++n2;
            }
            if (n2 != 7) continue;
            return arrayList;
        }
        return arrayList;
    }

    public void f() {
        this.runOnUiThread(new Runnable(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void run() {
                for (int i2 = 0; i2 < this.a.l; ++i2) {
                    ((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.a.i.a.get((int)i2)).c = "EXCEPTION";
                }
                this.a.i.notifyDataSetChanged();
            }
        });
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.mobond.mindicator.ui.indianrail.seatavailability.b.a.a(this);
        Intent intent = this.getIntent();
        this.setContentView(2131493044);
        this.r = 0;
        this.q = (ImageButton)this.findViewById(2131297345);
        this.q.setVisibility(8);
        this.n = (ProgressBar)this.findViewById(2131297132);
        this.o = (Button)this.findViewById(2131297289);
        this.p = (TextView)this.findViewById(2131296985);
        this.k = (ImageView)this.findViewById(2131297367);
        this.k.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void onClick(View view) {
                ActivitySeatStatus activitySeatStatus = this.a;
                com.mobond.mindicator.ui.indianrail.util.b.a((Activity)activitySeatStatus, (View)activitySeatStatus.k);
            }
        });
        this.w = intent.getStringExtra("src");
        this.x = intent.getStringExtra("dest");
        this.j = (StickyListHeadersListView)this.findViewById(2131297438);
        ((TextView)this.findViewById(2131297513)).setText((CharSequence)intent.getStringExtra("title").toUpperCase());
        this.v = intent.getBooleanExtra("getSeats", false);
        View view = this.findViewById(2131296343);
        k k2 = new k();
        k2.e = "#2196F3";
        this.y = this.v ? com.mobond.mindicator.ui.c.a((Activity)this, view, "ca-app-pub-5449278086868932/9034789644", "167101606757479_1239841386150157", "ca-app-pub-5449278086868932/9585637215", "167101606757479_1235754049892224", 3, null, k2, true) : com.mobond.mindicator.ui.c.a((Activity)this, view, "ca-app-pub-5449278086868932/6081323245", "167101606757479_1239840526150243", "ca-app-pub-5449278086868932/5196155433", "167101606757479_1235753839892245", 3, null, k2, true);
        this.j.setOnStickyHeaderChangedListener(new StickyListHeadersListView.d(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void a(StickyListHeadersListView stickyListHeadersListView, View view, int n2, long l2) {
                ActivitySeatStatus activitySeatStatus = this.a;
                ActivitySeatStatus.a(activitySeatStatus, ActivitySeatStatus.a(activitySeatStatus).getChildAt((int)l2));
            }
        });
        this.q.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void onClick(View view) {
                this.a.finish();
                if (IRActivity.c != null) {
                    IRActivity.c.performClick();
                    IRActivity.a((Context)this.a, "SEAT AVL OFFLINE SEARCH");
                }
            }
        });
        this.o.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivitySeatStatus a;
            {
                this.a = activitySeatStatus;
            }

            public void onClick(View view) {
                ActivitySeatStatus.b(this.a);
            }
        });
        if (this.v) {
            this.g();
            return;
        }
        this.h();
    }

    public void onDestroy() {
        if (this.m.f) {
            this.n();
        }
        com.mobond.mindicator.ui.indianrail.seatavailability.b.a.a().b();
        this.h = true;
        com.mobond.mindicator.ui.c.c(this.y);
        this.m.a();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        com.mobond.mindicator.ui.c.b(this.y);
    }

    public void onResume() {
        super.onResume();
        com.mobond.mindicator.ui.c.a(this.y);
    }

    public void openIrctcBooking(View view) {
        IRActivity.a((Context)this, "BOOK_IRCTC_TICKET");
        n.a("https://www.irctc.co.in", (Context)this);
    }

    public void shareScreenShot(View view) {
        com.mobond.mindicator.ui.indianrail.util.b.a((Activity)this, view);
    }

}

