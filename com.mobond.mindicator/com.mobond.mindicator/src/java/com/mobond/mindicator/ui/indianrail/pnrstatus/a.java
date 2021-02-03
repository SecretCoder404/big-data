/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.Toast
 *  com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus
 *  com.mobond.mindicator.ui.indianrail.util.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.mobond.mindicator.SampleAlarmReceiver;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.pnrstatus.e;
import java.util.ArrayList;

class a
extends BaseAdapter {
    private ArrayList<String> a;
    private ArrayList<String> b;
    private com.mobond.mindicator.ui.indianrail.util.a c;
    private LayoutInflater d;
    private c e;

    a(ArrayList<String> arrayList, ArrayList<String> arrayList2, com.mobond.mindicator.ui.indianrail.util.a a2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = a2;
        this.e = new c(a2.getApplicationContext());
        this.d = (LayoutInflater)this.c.getSystemService("layout_inflater");
    }

    private void a() {
        String string = null;
        for (int i2 = this.a.size() - 1; i2 >= 0; --i2) {
            if (i2 == this.a.size() - 1) {
                string = (String)this.a.get(i2);
                continue;
            }
            Object[] arrobject = new Object[]{string, this.a.get(i2)};
            string = String.format((String)"%s,%s", (Object[])arrobject);
        }
        com.mobond.mindicator.a.b((Activity)this.c).b("pnr_all", string);
    }

    private void a(String string) {
        SampleAlarmReceiver.a((Context)this.c, string, this.e);
        this.e.d(string);
    }

    void a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.notifyDataSetChanged();
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

    public View getView(final int n2, View view, ViewGroup viewGroup) {
        a a2;
        if (view == null) {
            view = this.d.inflate(2131493038, viewGroup, false);
            a2 = new a();
            a2.b = (TextView)view.findViewById(2131297510);
            a2.c = (TextView)view.findViewById(2131296639);
            a2.d = (ImageView)view.findViewById(2131296618);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        a2.b.setText((CharSequence)this.a.get(n2));
        String string = ActivityAlarmRing.a((Context)this.c, (String)((String)this.b.get(n2)));
        if (!string.equals((Object)"")) {
            a2.c.setText((CharSequence)string);
        } else {
            a2.c.setText((CharSequence)" -- ");
        }
        a2.d.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                try {
                    a.this.a((String)a.this.a.get(n2));
                    a.this.a.remove(n2);
                    a.this.b.remove(n2);
                    a.this.a();
                    a.this.notifyDataSetChanged();
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
        });
        view.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String[] arrstring = a.this.e.b((String)a.this.a.get(n2));
                if (arrstring == null) {
                    e e2 = new e((Activity)a.this.c, (String)a.this.a.get(n2), a.this.c, a.this.c.getApplicationContext(), false);
                    e2.a();
                    return;
                }
                if (!arrstring[0].equals((Object)"flushed")) {
                    Intent intent = new Intent((Context)a.this.c, ActivityPnrStatus.class);
                    intent.putExtra("json", arrstring[0]);
                    intent.putExtra("s_date", arrstring[1]);
                    intent.putExtra("pnr", (String)a.this.a.get(n2));
                    intent.putExtra("doReload", true);
                    a.this.c.startActivity(intent);
                    return;
                }
                Toast.makeText((Context)a.this.c, (int)2131755239, (int)0).show();
            }
        });
        return view;
    }

    private class a {
        private TextView b;
        private TextView c;
        private ImageView d;

        private a() {
        }
    }

}

