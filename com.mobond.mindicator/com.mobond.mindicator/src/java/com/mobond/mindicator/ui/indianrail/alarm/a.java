/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.indianrail.alarm.a$1
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.Locale
 */
package com.mobond.mindicator.ui.indianrail.alarm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.mobond.mindicator.ui.indianrail.alarm.a;
import com.mobond.mindicator.ui.indianrail.alarm.b;
import com.mobond.mindicator.ui.indianrail.alarm.c;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

class a
extends BaseAdapter {
    private ArrayList<c> a;
    private LayoutInflater b = null;
    private com.mobond.mindicator.ui.indianrail.pnrstatus.c c;
    private SimpleDateFormat d;
    private SimpleDateFormat e;
    private b f;
    private TextView g;
    private Activity h;

    a(Activity activity, TextView textView) {
        this.h = activity;
        this.a = new ArrayList();
        this.c = new com.mobond.mindicator.ui.indianrail.pnrstatus.c((Context)activity);
        this.d = new SimpleDateFormat("h:mm a", Locale.US);
        this.e = new SimpleDateFormat("d MMM", Locale.US);
        this.g = textView;
        this.a();
        this.b = (LayoutInflater)activity.getSystemService("layout_inflater");
        this.f = new b(activity, this.c);
        this.f.a((b.a)new 1(this));
    }

    private void a() {
        this.a.clear();
        ArrayList<c> arrayList = this.c.b();
        if (arrayList != null) {
            this.a.addAll(arrayList);
        }
        this.notifyDataSetChanged();
        boolean bl = com.mobond.mindicator.a.b(this.h).D();
        if (this.a.isEmpty()) {
            this.g.setVisibility(0);
            return;
        }
        if (bl) {
            this.g.setTextSize(17.0f);
        }
        this.g.setVisibility(8);
    }

    static /* synthetic */ void a(a a2) {
        a2.a();
    }

    public int getCount() {
        return this.a.size();
    }

    public Object getItem(int n2) {
        return n2;
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        a a2;
        if (view == null) {
            view = this.b.inflate(2131493010, viewGroup, false);
            a2 = new a();
            a2.b = (TextView)view.findViewById(2131296363);
            a2.c = (TextView)view.findViewById(2131297433);
            a2.d = (TextView)view.findViewById(2131296362);
            a2.e = (TextView)view.findViewById(2131296360);
            a2.f = (TextView)view.findViewById(2131296379);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        final c c2 = (c)this.a.get(n2);
        String string = c2.f;
        int n3 = -1;
        int n4 = string.hashCode();
        if (n4 != -304652726) {
            if (n4 == 1803709151 && string.equals((Object)"STATION_ALARM_MANUAL")) {
                n3 = 0;
            }
        } else if (string.equals((Object)"STATION_ALARM_VIA_PNR")) {
            n3 = 1;
        }
        switch (n3) {
            default: {
                break;
            }
            case 1: {
                a2.b.setText(2131755375);
                break;
            }
            case 0: {
                a2.b.setText((CharSequence)this.h.getString(2131755509));
            }
        }
        String string2 = c2.c.toUpperCase();
        TextView textView = a2.c;
        if (string2.contains((CharSequence)"[")) {
            string2 = string2.substring(0, string2.indexOf(91));
        }
        textView.setText((CharSequence)string2);
        a2.e.setText((CharSequence)ActivityCancelledRescheduledTrains.a((String)this.e.format(new Date(c2.b)).toUpperCase()));
        String string3 = this.d.format(new Date(c2.b));
        a2.d.setText((CharSequence)string3.substring(0, string3.lastIndexOf(32)));
        a2.f.setText((CharSequence)string3.substring(1 + string3.lastIndexOf(32)));
        view.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                a.this.f.a(c2.e, c2.c, c2.d, c2.a, true, c2.b, c2.f);
            }
        });
        return view;
    }

    private class a {
        private TextView b;
        private TextView c;
        private TextView d;
        private TextView e;
        private TextView f;

        private a() {
        }
    }

}

