/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.BaseAdapter
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.core.content.a
 *  com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Locale
 */
package com.mobond.mindicator.ui.indianrail.seatavailability;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.indianrail.seatavailability.a.c;
import com.mobond.mindicator.ui.indianrail.seatavailability.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import se.emilsjolander.stickylistheaders.e;

public class b
extends BaseAdapter
implements e {
    public ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> a;
    private final int b;
    private final int c;
    private HashMap<String, c> d;
    private StickyListHeadersListView e;
    private ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.a> f;
    private LayoutInflater g;
    private ActivitySeatStatus h;
    private Toast i;
    private View.OnTouchListener j;
    private View.OnClickListener k;
    private View l;
    private int m;
    private int n = -1;
    private boolean o;

    b(Activity activity, ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> arrayList, View view, int n2, int n3, StickyListHeadersListView stickyListHeadersListView, ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.a> arrayList2, HashMap<String, c> hashMap) {
        this.h = (ActivitySeatStatus)activity;
        this.a = arrayList;
        this.g = (LayoutInflater)activity.getSystemService("layout_inflater");
        this.i = Toast.makeText((Context)activity.getApplicationContext(), (CharSequence)"", (int)0);
        this.b = androidx.core.content.a.c((Context)activity, (int)2131100251);
        this.c = androidx.core.content.a.c((Context)activity, (int)2131100252);
        this.e = stickyListHeadersListView;
        this.f = arrayList2;
        this.d = hashMap;
        this.j = new View.OnTouchListener(this){
            final /* synthetic */ b a;
            {
                this.a = b2;
            }

            public boolean onTouch(View view, android.view.MotionEvent motionEvent) {
                switch (255 & motionEvent.getAction()) {
                    default: {
                        return false;
                    }
                    case 1: 
                    case 3: 
                    case 4: {
                        view.setPressed(false);
                        view.findViewById(2131297554).setBackgroundColor(b.b(this.a));
                        return false;
                    }
                    case 0: 
                }
                view.setPressed(true);
                view.findViewById(2131297554).setBackgroundColor(b.a(this.a));
                return false;
            }
        };
        this.k = new View.OnClickListener(this, hashMap, arrayList2){
            final /* synthetic */ HashMap a;
            final /* synthetic */ ArrayList b;
            final /* synthetic */ b c;
            {
                this.c = b2;
                this.a = hashMap;
                this.b = arrayList;
            }

            public void onClick(View view) {
                try {
                    int n2 = java.lang.Integer.parseInt((String)((TextView)view.findViewById(2131297123)).getText().toString());
                    com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.c.a.get(n2);
                    f f2 = b2.a;
                    if (((c)this.a.get((Object)f2.a)).b == null && com.mobond.mindicator.ui.indianrail.seatavailability.b.a.a().a.size() == 0) {
                        b.a(this.c, b2, ((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.b.get((int)b2.b)).a, ((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.b.get((int)b2.b)).b, n2, null);
                    }
                    com.mobond.mindicator.ui.indianrail.trainschedule.a.a((Context)b.c(this.c), f2.e, f2.a, f2.q, f2.j);
                    return;
                }
                catch (java.lang.Exception exception) {
                    exception.printStackTrace();
                    b.d(this.c).setText(2131755238);
                    b.d(this.c).show();
                    return;
                }
            }
        };
        this.l = view;
        this.m = n2;
        this.o = com.mobond.mindicator.a.b(activity).D();
    }

    static /* synthetic */ int a(b b2) {
        return b2.b;
    }

    private void a(com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2, int n2, int n3, int n4, String string) {
        Log.d((String)"irseatsingle", (String)"init getSeatStatusSingle");
        this.h.a(n4, b2.a.a, "LOADING", 6);
        com.mobond.mindicator.ui.indianrail.seatavailability.b.a.a().a(b2, string, n2, n3, n4, (byte)0, this.i);
    }

    private void a(b b2, String[] arrstring, String string) {
        if (arrstring != null) {
            for (String string2 : arrstring) {
                if (string2.isEmpty() || string.contains((CharSequence)string2)) continue;
                if (string2.equals((Object)"EA")) {
                    b2.x[9].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"EC")) {
                    b2.x[8].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"2S")) {
                    b2.x[7].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"SL")) {
                    b2.x[6].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"FC")) {
                    b2.x[5].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"CC")) {
                    b2.x[4].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"3E")) {
                    b2.x[3].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"3A")) {
                    b2.x[2].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (string2.equals((Object)"2A")) {
                    b2.x[1].findViewById(2131297437).setBackgroundColor(-13487566);
                    continue;
                }
                if (!string2.equals((Object)"1A")) continue;
                b2.x[0].findViewById(2131297437).setBackgroundColor(-13487566);
            }
        }
    }

    static /* synthetic */ void a(b b2, com.mobond.mindicator.ui.indianrail.seatavailability.a.b b3, int n2, int n3, int n4, String string) {
        b2.a(b3, n2, n3, n4, string);
    }

    static /* synthetic */ void a(b b2, b b3, String[] arrstring, String string) {
        b2.a(b3, arrstring, string);
    }

    static /* synthetic */ void a(b b2, String string, ViewGroup[] arrviewGroup, com.mobond.mindicator.ui.indianrail.seatavailability.a.b b3, byte by) {
        b2.a(string, arrviewGroup, b3, by);
    }

    private void a(String string, ViewGroup[] arrviewGroup, com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2, byte by) {
        c c2 = (c)this.d.get((Object)string);
        String[][] arrstring = c2.c;
        HashMap<String, String> hashMap = c2.a;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (arrstring[i2][1] != null) {
                String string2 = arrstring[i2][0];
                arrviewGroup[i2].setVisibility(0);
                View view = arrviewGroup[i2].findViewById(2131297437);
                view.setBackgroundColor(-10066330);
                ((TextView)arrviewGroup[i2].findViewById(2131296547)).setText((CharSequence)hashMap.get((Object)string2));
                if (string2.equals((Object)"GN")) {
                    view.setBackgroundColor(-14575885);
                    return;
                }
                ((TextView)arrviewGroup[i2].findViewById(2131296549)).setText((CharSequence)string2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b2.d);
                stringBuilder.append("~");
                String string3 = stringBuilder.toString();
                TextView textView = (TextView)arrviewGroup[i2].findViewById(2131296551);
                TextView textView2 = (TextView)arrviewGroup[i2].findViewById(2131296552);
                View view2 = arrviewGroup[i2].findViewById(2131296677);
                View view3 = arrviewGroup[i2].findViewById(2131297221);
                View view4 = arrviewGroup[i2].findViewById(2131297059);
                view3.setVisibility(4);
                int n2 = string3.indexOf(string2);
                if (n2 != -1) {
                    String[] arrstring2 = string3.substring(n2, string3.indexOf("~", n2)).split(",");
                    textView.setText((CharSequence)arrstring2[1]);
                    textView2.setText((CharSequence)arrstring2[2]);
                    view4.setVisibility(8);
                    view2.setVisibility(4);
                    if (arrstring2[1].contains((CharSequence)"WL")) {
                        view.setBackgroundColor(-2937041);
                        continue;
                    }
                    if (arrstring2[1].equals((Object)"AVL")) {
                        view.setBackgroundColor(-14380503);
                        continue;
                    }
                    if (arrstring2[1].equals((Object)"RAC")) {
                        view.setBackgroundColor(-13615201);
                        continue;
                    }
                    view.setBackgroundColor(-7928571);
                    continue;
                }
                int n3 = b2.e.indexOf(string2);
                if (n3 != -1) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(b2.e);
                    stringBuilder2.append("~");
                    String string4 = stringBuilder2.toString();
                    String[] arrstring3 = string4.substring(n3, string4.indexOf("~", n3)).split(",");
                    textView.setText((CharSequence)arrstring3[1]);
                    textView2.setText((CharSequence)arrstring3[2]);
                    if (by == 0) {
                        if (b2.c != null) {
                            view3.setVisibility(0);
                        }
                        view4.setVisibility(0);
                        view2.setVisibility(4);
                        if (!arrstring3[1].equals((Object)"AVL")) continue;
                        view.setBackgroundColor(-9859982);
                        continue;
                    }
                    view4.setVisibility(8);
                    view2.setVisibility(0);
                    continue;
                }
                textView.setText((CharSequence)"");
                textView2.setText((CharSequence)"");
                view4.setVisibility(8);
                if (by == 0) {
                    int n4;
                    if (b2.c != null) {
                        view3.setVisibility(0);
                        n4 = 4;
                    } else {
                        n4 = 4;
                    }
                    view2.setVisibility(n4);
                    continue;
                }
                view2.setVisibility(0);
                continue;
            }
            arrviewGroup[i2].setVisibility(8);
            ((TextView)arrviewGroup[i2].findViewById(2131296547)).setText((CharSequence)"");
        }
    }

    static /* synthetic */ int b(b b2) {
        return b2.c;
    }

    static /* synthetic */ ActivitySeatStatus c(b b2) {
        return b2.h;
    }

    private String c(int n2) {
        com.mobond.mindicator.ui.indianrail.seatavailability.a.a a2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.f.get(n2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a2.a);
        stringBuilder.append(" ");
        stringBuilder.append(ActivitySeatStatus.e[a2.b]);
        stringBuilder.append(" ");
        stringBuilder.append(a2.d);
        stringBuilder.append(", ");
        stringBuilder.append(ActivitySeatStatus.f[a2.c]);
        return stringBuilder.toString();
    }

    static /* synthetic */ Toast d(b b2) {
        return b2.i;
    }

    static /* synthetic */ HashMap e(b b2) {
        return b2.d;
    }

    static /* synthetic */ ArrayList f(b b2) {
        return b2.f;
    }

    @Override
    public View a(int n2, View view, ViewGroup viewGroup) {
        Object object;
        View view2;
        if (view == null) {
            object = new Object(){
                TextView a;
            };
            view2 = this.g.inflate(2131493034, viewGroup, false);
            object.a = (TextView)view2.findViewById(2131296827);
            view2.setTag(object);
        } else {
            a a2 = view.getTag();
            view2 = view;
            object = a2;
        }
        int n3 = (int)this.b(n2);
        object.a.setText((CharSequence)this.c(n3));
        return view2;
    }

    public com.mobond.mindicator.ui.indianrail.seatavailability.a.b a(int n2) {
        return (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.a.get(n2);
    }

    void a(ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> arrayList) {
        this.a = arrayList;
        this.h.l = arrayList.size();
        this.notifyDataSetChanged();
    }

    @Override
    public long b(int n2) {
        return ((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.a.get((int)n2)).b;
    }

    public int getCount() {
        return this.a.size();
    }

    public /* synthetic */ Object getItem(int n2) {
        return this.a(n2);
    }

    public long getItemId(int n2) {
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public View getView(int var1_1, View var2_2, ViewGroup var3_3) {
        block10 : {
            var4_4 = 1;
            if (var2_2 == null) {
                var2_2 = this.g.inflate(2131493045, var3_3, false);
                var5_5 = new Object(){
                    TextView a;
                    TextView b;
                    TextView c;
                    TextView d;
                    TextView e;
                    TextView f;
                    TextView g;
                    TextView h;
                    TextView i;
                    TextView j;
                    TextView k;
                    TextView l;
                    ViewGroup m;
                    ViewGroup n;
                    ViewGroup o;
                    ViewGroup p;
                    ViewGroup q;
                    ViewGroup r;
                    ViewGroup s;
                    ViewGroup t;
                    ViewGroup u;
                    ViewGroup v;
                    ViewGroup w;
                    ViewGroup[] x;
                    View y;
                    LinearLayout z;
                    {
                        ViewGroup[] arrviewGroup = new ViewGroup[]{this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w};
                        this.x = arrviewGroup;
                    }
                };
                var5_5.a = (TextView)var2_2.findViewById(2131297552);
                var5_5.b = (TextView)var2_2.findViewById(2131297550);
                var5_5.c = (TextView)var2_2.findViewById(2131296809);
                var5_5.d = (TextView)var2_2.findViewById(2131296807);
                var5_5.e = (TextView)var2_2.findViewById(2131297521);
                var5_5.f = (TextView)var2_2.findViewById(2131297537);
                var5_5.g = (TextView)var2_2.findViewById(2131296808);
                var5_5.h = (TextView)var2_2.findViewById(2131296805);
                var5_5.i = (TextView)var2_2.findViewById(2131297519);
                var5_5.j = (TextView)var2_2.findViewById(2131297253);
                var5_5.x[0] = (ViewGroup)var2_2.findViewById(2131296538);
                var5_5.x[var4_4] = (ViewGroup)var2_2.findViewById(2131296539);
                var5_5.x[2] = (ViewGroup)var2_2.findViewById(2131296541);
                var5_5.x[3] = (ViewGroup)var2_2.findViewById(2131296542);
                var5_5.x[4] = (ViewGroup)var2_2.findViewById(2131296543);
                var5_5.x[5] = (ViewGroup)var2_2.findViewById(2131296546);
                var5_5.x[6] = (ViewGroup)var2_2.findViewById(2131296550);
                var5_5.x[7] = (ViewGroup)var2_2.findViewById(2131296540);
                var5_5.x[8] = (ViewGroup)var2_2.findViewById(2131296545);
                var5_5.x[9] = (ViewGroup)var2_2.findViewById(2131296544);
                var5_5.x[10] = (ViewGroup)var2_2.findViewById(2131296548);
                var5_5.y = var2_2.findViewById(2131297346);
                var5_5.k = (TextView)var2_2.findViewById(2131297123);
                var5_5.l = (TextView)var2_2.findViewById(2131297394);
                var5_5.z = (LinearLayout)var2_2.findViewById(2131296343);
                if (this.o) {
                    var5_5.l.setTextSize(18.0f);
                    var5_5.j.setTextSize(14.0f);
                    var5_5.a.setTextSize(18.0f);
                    var5_5.b.setTextSize(18.0f);
                    var5_5.c.setTextSize(14.0f);
                    var5_5.h.setTextSize(14.0f);
                    var5_5.i.setTextSize(14.0f);
                    var5_5.g.setTextSize(14.0f);
                }
                var2_2.setTag((Object)var5_5);
            } else {
                var5_5 = var2_2.getTag();
            }
            var6_6 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.a.get(var1_1);
            if (var6_6.h) {
                var2_2.setVisibility(8);
                return var2_2;
            }
            var2_2.setVisibility(0);
            var7_7 = var6_6.a;
            var5_5.a.setText((CharSequence)var7_7.a);
            var5_5.b.setText((CharSequence)var7_7.e);
            var5_5.c.setText((CharSequence)var7_7.j);
            var5_5.d.setText((CharSequence)var7_7.m);
            var5_5.e.setText((CharSequence)var7_7.n);
            var5_5.f.setText((CharSequence)var7_7.p);
            var5_5.g.setText((CharSequence)var7_7.o);
            var5_5.h.setText((CharSequence)var6_6.f);
            var5_5.i.setText((CharSequence)var6_6.g);
            var5_5.j.setText((CharSequence)var7_7.s);
            var8_8 = var5_5.k;
            var9_9 = Locale.ENGLISH;
            var10_10 = new Object[var4_4];
            var10_10[0] = var1_1;
            var8_8.setText((CharSequence)String.format((Locale)var9_9, (String)"%d", (Object[])var10_10));
            var11_11 = var5_5.l;
            var12_12 = new Object[2];
            var12_12[0] = var7_7.m;
            var12_12[var4_4] = var7_7.o.split("-")[0];
            var11_11.setText((CharSequence)String.format((String)"%s %s", (Object[])var12_12));
            this.a(var7_7.a, var5_5.x, var6_6, var6_6.j);
            var2_2.setOnTouchListener(this.j);
            var2_2.setOnClickListener(this.k);
            var5_5.y.setOnTouchListener(new View.OnTouchListener(this, var6_6, var5_5, var7_7){
                final /* synthetic */ com.mobond.mindicator.ui.indianrail.seatavailability.a.b a;
                final /* synthetic */ b b;
                final /* synthetic */ f c;
                final /* synthetic */ b d;
                {
                    this.d = b2;
                    this.a = b3;
                    this.b = b4;
                    this.c = f2;
                }

                public boolean onTouch(View view, android.view.MotionEvent motionEvent) {
                    if (this.a.j > 0) {
                        return true;
                    }
                    switch (255 & motionEvent.getAction()) {
                        default: {
                            return false;
                        }
                        case 1: 
                        case 3: 
                        case 4: {
                            view.setPressed(false);
                            b b2 = this.d;
                            String string = this.c.a;
                            ViewGroup[] arrviewGroup = this.b.x;
                            com.mobond.mindicator.ui.indianrail.seatavailability.a.b b3 = this.a;
                            b.a(b2, string, arrviewGroup, b3, b3.j);
                            return false;
                        }
                        case 0: 
                    }
                    view.setPressed(true);
                    b b4 = this.d;
                    b.a(b4, this.b, ((c)b.e((b)b4).get((Object)this.c.a)).b, this.a.d);
                    return false;
                }
            });
            var5_5.y.setOnClickListener(new View.OnClickListener(this, var7_7, var6_6, var1_1){
                final /* synthetic */ f a;
                final /* synthetic */ com.mobond.mindicator.ui.indianrail.seatavailability.a.b b;
                final /* synthetic */ int c;
                final /* synthetic */ b d;
                {
                    this.d = b2;
                    this.a = f2;
                    this.b = b3;
                    this.c = n2;
                }

                public void onClick(View view) {
                    String[] arrstring = ((c)b.e((b)this.d).get((Object)this.a.a)).b;
                    String string = this.b.d;
                    StringBuilder stringBuilder = new StringBuilder();
                    if (arrstring != null && string != null) {
                        int n2 = arrstring.length;
                        for (int i2 = 0; i2 < n2; ++i2) {
                            String string2 = arrstring[i2];
                            if (string2.equals((Object)"GN") || string.contains((CharSequence)string2)) continue;
                            String string3 = stringBuilder.length() == 0 ? "" : ",";
                            stringBuilder.append(string3);
                            stringBuilder.append(string2);
                        }
                    }
                    if (com.mobond.mindicator.ui.indianrail.seatavailability.b.a.a().a.size() > 0) {
                        if (stringBuilder.length() > 0 || arrstring == null) {
                            b.d(this.d).setText((CharSequence)"Loading previous st\nPlease wait..");
                            b.d(this.d).show();
                        }
                        return;
                    }
                    if (stringBuilder.length() > 0) {
                        b b2 = this.d;
                        b.a(b2, this.b, ((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)b.f((b)b2).get((int)this.b.b)).a, ((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)b.f((b)this.d).get((int)this.b.b)).b, this.c, stringBuilder.toString());
                    }
                }
            });
            if (var1_1 == 0) ** GOTO lbl-1000
            var19_13 = var6_6.b;
            for (var20_14 = var1_1 - 1; var20_14 >= 0; --var20_14) {
                var22_15 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.a.get(var20_14);
                if (var22_15.h) continue;
                var21_16 = var22_15.b;
                break block10;
            }
            var21_16 = 0;
        }
        if (var19_13 != var21_16) {
            var13_17 = true;
        } else lbl-1000: // 2 sources:
        {
            var13_17 = false;
        }
        if (var1_1 != this.m && !var13_17) {
            var5_5.z.setVisibility(8);
            return var2_2;
        }
        var14_18 = this.e.getFirstVisiblePosition();
        var15_19 = this.e.getLastVisiblePosition();
        var16_20 = this.n;
        if (var16_20 < var14_18 || var16_20 > var15_19) {
            var4_4 = 0;
        }
        var17_21 = this.l;
        if (var17_21 == null) return var2_2;
        if (var4_4 != 0) return var2_2;
        if (var17_21.getParent() != null) {
            var18_22 = (LinearLayout)this.l.getParent();
            var18_22.removeAllViews();
            var18_22.setVisibility(8);
        }
        var5_5.z.addView(this.l);
        var5_5.z.setVisibility(0);
        this.n = var1_1;
        return var2_2;
    }

}

