/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.Toast
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule
 *  com.mobond.mindicator.ui.indianrail.trainschedule.d$2
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.indianrail.trainschedule;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mobond.mindicator.ui.indianrail.alarm.b;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule;
import com.mobond.mindicator.ui.indianrail.trainschedule.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class d
extends BaseAdapter {
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    private Vector<g> g;
    private String h = null;
    private String i = null;
    private LayoutInflater j = null;
    private int k;
    private View.OnLongClickListener l;
    private ActivityTrainSchedule m;
    private ArrayList<long[]> n;
    private c o;
    private int p;
    private b q;

    d(Vector<g> vector, final ActivityTrainSchedule activityTrainSchedule, int n2) {
        this.m = activityTrainSchedule;
        this.g = vector;
        this.j = (LayoutInflater)activityTrainSchedule.getSystemService("layout_inflater");
        this.k = -1 + vector.size();
        this.o = new c((Context)activityTrainSchedule);
        this.p = n2;
        this.a();
        if (activityTrainSchedule.e != null) {
            this.h = activityTrainSchedule.e.c;
            this.i = activityTrainSchedule.e.b;
        }
        this.l = new View.OnLongClickListener(){

            public boolean onLongClick(View view) {
                Toast.makeText((Context)activityTrainSchedule, (int)2131755365, (int)0).show();
                return false;
            }
        };
        this.q = new b((Activity)activityTrainSchedule, this.o);
        this.q.a((b.a)new 2(this));
    }

    private void a() {
        if (this.o.a() != null) {
            ArrayList<long[]> arrayList = this.n;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.n = new ArrayList(this.o.a());
        } else {
            this.n = new ArrayList();
        }
        this.notifyDataSetChanged();
    }

    static /* synthetic */ void a(d d2) {
        d2.a();
    }

    static /* synthetic */ Vector c(d d2) {
        return d2.g;
    }

    static /* synthetic */ ActivityTrainSchedule e(d d2) {
        return d2.m;
    }

    public int getCount() {
        return this.g.size();
    }

    public Object getItem(int n2) {
        return n2;
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(final int n2, View view, ViewGroup viewGroup) {
        a a2;
        if (view == null) {
            view = this.j.inflate(2131493052, viewGroup, false);
            a2 = new a();
            a2.b = (TextView)view.findViewById(2131296680);
            a2.c = (TextView)view.findViewById(2131296681);
            a2.d = (TextView)view.findViewById(2131296682);
            a2.g = view.findViewById(2131296927);
            a2.f = view.findViewById(2131296929);
            a2.h = view.findViewById(2131297541);
            a2.h.setVisibility(0);
            a2.e = (ImageView)view.findViewById(2131297440);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        a2.d.setVisibility(8);
        final g g2 = (g)this.g.get(n2);
        TextView textView = a2.b;
        Object[] arrobject = new Object[]{g2.b, g2.a};
        textView.setText((CharSequence)String.format((String)"%s %s", (Object[])arrobject));
        if (n2 == 0) {
            if (this.h != null) {
                a2.d.setVisibility(0);
                a2.c.setText((CharSequence)this.i);
                TextView textView2 = a2.d;
                Object[] arrobject2 = new Object[]{g2.g};
                textView2.setText((CharSequence)String.format((String)"START   Day:%s", (Object[])arrobject2));
            } else {
                TextView textView3 = a2.c;
                Object[] arrobject3 = new Object[]{g2.g};
                textView3.setText((CharSequence)String.format((String)"START   Day:%s", (Object[])arrobject3));
            }
            a2.f.setVisibility(4);
            a2.g.setVisibility(0);
        } else if (n2 == this.k) {
            a2.f.setVisibility(0);
            a2.g.setVisibility(4);
            TextView textView4 = a2.c;
            Object[] arrobject4 = new Object[]{g2.f, f, g2.g};
            textView4.setText((CharSequence)String.format((String)"END    %s%s   Day:%s", (Object[])arrobject4));
        } else {
            a2.f.setVisibility(0);
            a2.g.setVisibility(0);
            TextView textView5 = a2.c;
            Object[] arrobject5 = new Object[]{g2.e, b, g2.f, f, g2.g};
            textView5.setText((CharSequence)String.format((String)"Halt: %s%s   %s%s   Day:%s", (Object[])arrobject5));
        }
        a2.e.setOnLongClickListener(this.l);
        final boolean[] arrbl = new boolean[]{false};
        Iterator iterator = this.n.iterator();
        while (iterator.hasNext()) {
            if (((long[])iterator.next())[0] != (long)((g)this.g.get((int)n2)).d) continue;
            arrbl[0] = true;
            break;
        }
        if (arrbl[0]) {
            a2.e.setImageResource(2131230817);
        } else {
            a2.e.setImageResource(2131231015);
        }
        a2.e.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                if (arrbl[0]) {
                    long l2;
                    block4 : {
                        for (long[] arrl : d.this.n) {
                            if (arrl[0] != (long)((g)d.c((d)d.this).get((int)n2)).d) continue;
                            l2 = arrl[1];
                            break block4;
                        }
                        l2 = -1L;
                    }
                    String[] arrstring = d.this.o.a(((g)d.c((d)d.this).get((int)n2)).d);
                    if (arrstring != null) {
                        String string = arrstring[4];
                        d.this.q.a(d.e((d)d.this).c, g2.a, g2.b, g2.d, true, l2, string);
                        return;
                    }
                } else {
                    d.this.q.a(d.e((d)d.this).c, g2.a, g2.b, g2.d, false, -1L, "STATION_ALARM_MANUAL");
                }
            }
        });
        if (n2 == this.p) {
            view.setBackgroundResource(2131099794);
            return view;
        }
        if (n2 % 2 == 0) {
            view.setBackgroundResource(2131099748);
            return view;
        }
        view.setBackgroundResource(2131099793);
        return view;
    }

    private class a {
        private TextView b;
        private TextView c;
        private TextView d;
        private ImageView e;
        private View f;
        private View g;
        private View h;

        private a() {
        }
    }

}

