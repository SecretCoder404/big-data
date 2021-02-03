/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.BaseAdapter
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.indianrail.seatavailability;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.indianrail.seatavailability.a;
import java.util.ArrayList;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import se.emilsjolander.stickylistheaders.e;

class a
extends BaseAdapter
implements e {
    private final int a;
    private final int b;
    private final int c;
    private StickyListHeadersListView d;
    private LayoutInflater e;
    private ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> f;
    private Activity g;
    private View h;
    private int i;
    private int j;
    private int k = -1;
    private ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.a> l;
    private boolean m;

    a(Activity activity, ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> arrayList, View view, int n2, int n3, StickyListHeadersListView stickyListHeadersListView, ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.a> arrayList2) {
        this.g = activity;
        this.f = arrayList;
        this.e = (LayoutInflater)activity.getSystemService("layout_inflater");
        this.a = activity.getResources().getColor(2131100251);
        this.b = activity.getResources().getColor(2131100252);
        this.c = activity.getResources().getColor(2131100253);
        this.h = view;
        this.i = n2;
        this.j = n3;
        this.d = stickyListHeadersListView;
        this.l = arrayList2;
        this.m = com.mobond.mindicator.a.b(activity).D();
    }

    static /* synthetic */ int a(a a2) {
        return a2.a;
    }

    static /* synthetic */ int b(a a2) {
        return a2.c;
    }

    static /* synthetic */ int c(a a2) {
        return a2.b;
    }

    private String c(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.l.get((int)n2)).a);
        stringBuilder.append(" ");
        stringBuilder.append(ActivitySeatStatus.e[((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.l.get((int)n2)).b]);
        stringBuilder.append(" ");
        stringBuilder.append(((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.l.get((int)n2)).d);
        stringBuilder.append(", ");
        stringBuilder.append(ActivitySeatStatus.f[((com.mobond.mindicator.ui.indianrail.seatavailability.a.a)this.l.get((int)n2)).c]);
        return stringBuilder.toString();
    }

    static /* synthetic */ Activity d(a a2) {
        return a2.g;
    }

    @Override
    public View a(int n2, View view, ViewGroup viewGroup) {
        Object object;
        View view2;
        if (view == null) {
            object = new Object(){
                TextView a;
            };
            view2 = this.e.inflate(2131493034, viewGroup, false);
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
        return (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.f.get(n2);
    }

    @Override
    public long b(int n2) {
        return ((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.f.get((int)n2)).b;
    }

    public int getCount() {
        return this.f.size();
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
        block13 : {
            if (var2_2 == null) {
                var2_2 = this.e.inflate(2131493045, var3_3, false);
                var4_4 = new Object(){
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
                    View m;
                    LinearLayout n;
                };
                var4_4.a = (TextView)var2_2.findViewById(2131297552);
                var4_4.b = (TextView)var2_2.findViewById(2131297550);
                var4_4.c = (TextView)var2_2.findViewById(2131296809);
                var4_4.d = (TextView)var2_2.findViewById(2131296807);
                var4_4.f = (TextView)var2_2.findViewById(2131297521);
                var4_4.e = (TextView)var2_2.findViewById(2131296606);
                var4_4.g = (TextView)var2_2.findViewById(2131297537);
                var4_4.h = (TextView)var2_2.findViewById(2131296808);
                var4_4.i = (TextView)var2_2.findViewById(2131296805);
                var4_4.j = (TextView)var2_2.findViewById(2131297519);
                var4_4.k = (TextView)var2_2.findViewById(2131297253);
                var4_4.l = (TextView)var2_2.findViewById(2131297394);
                var4_4.m = var2_2.findViewById(2131297554);
                var4_4.n = (LinearLayout)var2_2.findViewById(2131296343);
                if (this.m) {
                    var4_4.l.setTextSize(18.0f);
                    var4_4.k.setTextSize(14.0f);
                    var4_4.a.setTextSize(18.0f);
                    var4_4.b.setTextSize(18.0f);
                    var4_4.c.setTextSize(14.0f);
                    var4_4.i.setTextSize(14.0f);
                    var4_4.j.setTextSize(14.0f);
                    var4_4.h.setTextSize(14.0f);
                }
                var2_2.setTag((Object)var4_4);
            } else {
                var4_4 = var2_2.getTag();
            }
            var5_5 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.f.get(var1_1);
            var6_6 = var5_5.a;
            var4_4.a.setText((CharSequence)var6_6.a);
            var4_4.b.setText((CharSequence)var6_6.e);
            var4_4.c.setText((CharSequence)var6_6.k);
            var4_4.d.setText((CharSequence)var6_6.m);
            var4_4.f.setText((CharSequence)var6_6.n);
            var4_4.g.setText((CharSequence)var6_6.p);
            var4_4.h.setText((CharSequence)var6_6.o);
            var4_4.i.setText((CharSequence)var5_5.f);
            var4_4.j.setText((CharSequence)var5_5.g);
            var4_4.k.setText((CharSequence)var6_6.c);
            var7_7 = var4_4.l;
            var8_8 = new Object[2];
            var8_8[0] = var6_6.m;
            var9_9 = var6_6.o.split("-")[0];
            var10_10 = 1;
            var8_8[var10_10] = var9_9;
            var7_7.setText((CharSequence)String.format((String)"%s %s", (Object[])var8_8));
            if (var5_5.i) {
                var4_4.a.setPaintFlags(16 | var4_4.a.getPaintFlags());
                var4_4.b.setPaintFlags(16 | var4_4.b.getPaintFlags());
                var4_4.l.setPaintFlags(16 | var4_4.b.getPaintFlags());
                var4_4.i.setPaintFlags(16 | var4_4.b.getPaintFlags());
                var4_4.j.setPaintFlags(16 | var4_4.b.getPaintFlags());
                var4_4.k.setTextColor(-65536);
                var4_4.m.setBackgroundColor(this.c);
                var2_2.setOnTouchListener(new View.OnTouchListener(this, var4_4){
                    final /* synthetic */ b a;
                    final /* synthetic */ a b;
                    {
                        this.b = a2;
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
                                this.a.m.setBackgroundColor(a.b(this.b));
                                return false;
                            }
                            case 0: 
                        }
                        view.setPressed(true);
                        this.a.m.setBackgroundColor(a.a(this.b));
                        return false;
                    }
                });
            } else {
                var4_4.a.setPaintFlags(-17 & var4_4.a.getPaintFlags());
                var4_4.b.setPaintFlags(-17 & var4_4.b.getPaintFlags());
                var4_4.l.setPaintFlags(-17 & var4_4.b.getPaintFlags());
                var4_4.i.setPaintFlags(-17 & var4_4.b.getPaintFlags());
                var4_4.j.setPaintFlags(-17 & var4_4.b.getPaintFlags());
                var4_4.k.setTextColor(this.g.getResources().getColor(2131099789));
                var4_4.m.setBackgroundColor(this.b);
                var2_2.setOnTouchListener(new View.OnTouchListener(this, var4_4){
                    final /* synthetic */ b a;
                    final /* synthetic */ a b;
                    {
                        this.b = a2;
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
                                this.a.m.setBackgroundColor(a.c(this.b));
                                return false;
                            }
                            case 0: 
                        }
                        view.setPressed(true);
                        this.a.m.setBackgroundColor(a.a(this.b));
                        return false;
                    }
                });
            }
            if (var1_1 == 0) ** GOTO lbl-1000
            var17_11 = var5_5.b;
            for (var18_12 = var1_1 - 1; var18_12 >= 0; --var18_12) {
                var20_13 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.f.get(var18_12);
                if (var20_13.h) continue;
                var19_14 = var20_13.b;
                break block13;
            }
            var19_14 = 0;
        }
        if (var17_11 != var19_14) {
            var11_15 = true;
        } else lbl-1000: // 2 sources:
        {
            var11_15 = false;
        }
        if (var1_1 != this.i && !var11_15) {
            var4_4.n.setVisibility(8);
        } else {
            var12_16 = this.d.getFirstVisiblePosition();
            var13_17 = this.d.getLastVisiblePosition();
            var14_18 = this.k;
            if (var14_18 < var12_16 || var14_18 > var13_17) {
                var10_10 = 0;
            }
            var15_19 = this.h;
            if (var15_19 != null && var10_10 == 0) {
                if (var15_19.getParent() != null) {
                    var16_20 = (LinearLayout)this.h.getParent();
                    var16_20.removeAllViews();
                    var16_20.setBackgroundColor(-256);
                    var16_20.setVisibility(8);
                }
                var4_4.n.addView(this.h);
                var4_4.n.setVisibility(0);
                this.k = var1_1;
            }
        }
        var2_2.setOnClickListener(new View.OnClickListener(this, var6_6){
            final /* synthetic */ f a;
            final /* synthetic */ a b;
            {
                this.b = a2;
                this.a = f2;
            }

            public void onClick(View view) {
                com.mobond.mindicator.ui.indianrail.trainschedule.a.a((android.content.Context)a.d(this.b), this.a.e, this.a.a, this.a.q, this.a.j);
            }
        });
        return var2_2;
    }

}

