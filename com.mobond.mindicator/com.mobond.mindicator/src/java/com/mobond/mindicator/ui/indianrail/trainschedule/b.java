/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.BaseAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Date
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.trainschedule;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b
extends BaseAdapter {
    private LayoutInflater a;
    private a[] b;
    private ArrayList<a> c;
    private boolean d;
    private Activity e;

    b(final Activity activity, ListView listView, JSONArray jSONArray) {
        int n2;
        boolean bl;
        block7 : {
            this.e = activity;
            n2 = jSONArray.length();
            this.b = new a[n2];
            SimpleDateFormat simpleDateFormat = IRParserProvider.getIRParser().getCancelledRescheduledDateFormat();
            if (simpleDateFormat != null) {
                for (int i2 = 0; i2 < n2; ++i2) {
                    try {
                        a a2;
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        a[] arra = this.b;
                        arra[i2] = a2 = new a(jSONObject, jSONObject.getString("trainNo"), jSONObject.getString("trainName"), jSONObject.getString("type"), simpleDateFormat.parse(jSONObject.getString("startDate")).getTime());
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        bl = false;
                        break block7;
                    }
                }
                bl = true;
            } else {
                bl = false;
            }
        }
        if (!bl) {
            for (int i3 = 0; i3 < n2; ++i3) {
                a a3;
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                a[] arra = this.b;
                arra[i3] = a3 = new a(jSONObject, jSONObject.getString("trainNo"), jSONObject.getString("trainName"), jSONObject.getString("type"), 0L);
            }
        }
        Arrays.sort((Object[])this.b, (Comparator)new Comparator<a>(){

            public int a(a a2, a a3) {
                return Long.valueOf((long)a2.f()).compareTo(Long.valueOf((long)a3.f()));
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((a)object, (a)object2);
            }
        });
        Arrays.sort((Object[])this.b, (Comparator)new Comparator<a>(){

            public int a(a a2, a a3) {
                return Integer.valueOf((String)a2.b()).compareTo(Integer.valueOf((String)a3.b()));
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((a)object, (a)object2);
            }
        });
        this.c = new ArrayList((Collection)Arrays.asList((Object[])this.b));
        this.a = (LayoutInflater)activity.getSystemService("layout_inflater");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                try {
                    JSONObject jSONObject = ((a)b.this.c.get(n2)).a();
                    Activity activity2 = activity;
                    String string = ((a)b.this.c.get(n2)).c();
                    String string2 = ((a)b.this.c.get(n2)).b();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(f.a((Context)activity, com.mobond.mindicator.ui.indianrail.a.a.f(jSONObject.getString("trainSrc"))));
                    stringBuilder.append(" - ");
                    stringBuilder.append(f.a((Context)activity, com.mobond.mindicator.ui.indianrail.a.a.f(jSONObject.getString("trainDstn"))));
                    com.mobond.mindicator.ui.indianrail.trainschedule.a.a((Context)activity2, string, string2, stringBuilder.toString(), 1);
                    return;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                    return;
                }
            }
        });
        this.d = com.mobond.mindicator.a.b(activity).D();
    }

    private void a() {
        this.c.addAll((Collection)Arrays.asList((Object[])this.b));
    }

    public void a(String string) {
        this.c.clear();
        if (string.length() == 0) {
            this.a();
        } else {
            String string2 = string.toLowerCase();
            for (a a2 : this.b) {
                if (!a2.d().contains((CharSequence)string2)) continue;
                this.c.add((Object)a2);
            }
        }
        this.notifyDataSetChanged();
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int n2) {
        return n2;
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        b b2;
        block12 : {
            a a2;
            JSONObject jSONObject;
            block11 : {
                block10 : {
                    if (view == null) {
                        view = this.a.inflate(2131493055, viewGroup, false);
                        b2 = new b();
                        b2.b = (TextView)view.findViewById(2131297510);
                        b2.b.setTextColor(-328966);
                        b2.c = (TextView)view.findViewById(2131297551);
                        b2.c.setTextColor(-5395027);
                        b2.d = (TextView)view.findViewById(2131297054);
                        b2.d.setVisibility(0);
                        b2.d.setTextColor(-256);
                        b2.e = (TextView)view.findViewById(2131297246);
                        if (this.d) {
                            b2.e.setTextSize(14.0f);
                        }
                        b2.e.setVisibility(0);
                        view.setTag((Object)b2);
                    } else {
                        b2 = (b)view.getTag();
                    }
                    if (n2 % 2 == 0) {
                        view.setBackgroundResource(2131230838);
                    } else {
                        view.setBackgroundResource(2131231006);
                    }
                    a2 = (a)this.c.get(n2);
                    try {
                        jSONObject = a2.a();
                        TextView textView = b2.b;
                        Object[] arrobject = new Object[]{a2.b(), a2.c()};
                        textView.setText((CharSequence)String.format((String)"%s  %s", (Object[])arrobject));
                        TextView textView2 = b2.c;
                        Object[] arrobject2 = new Object[]{f.a((Context)this.e, com.mobond.mindicator.ui.indianrail.a.a.f(jSONObject.getString("trainSrc"))), f.a((Context)this.e, com.mobond.mindicator.ui.indianrail.a.a.f(jSONObject.getString("trainDstn")))};
                        textView2.setText((CharSequence)String.format((String)"%s - %s", (Object[])arrobject2));
                        b2.d.setText((CharSequence)ActivityCancelledRescheduledTrains.a((String)jSONObject.getString("startDate")));
                        b2.e.setText((CharSequence)a2.e());
                        if (!a2.e().equals((Object)ActivityCancelledRescheduledTrains.b)) break block10;
                        TextView textView3 = b2.d;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.e.getString(2131755223));
                        stringBuilder.append(" ");
                        stringBuilder.append(f.a((Context)this.e, com.mobond.mindicator.ui.indianrail.a.a.f(jSONObject.getString("fromStn"))));
                        stringBuilder.append(" ");
                        stringBuilder.append(this.e.getString(2131755368));
                        stringBuilder.append(" ");
                        stringBuilder.append(f.a((Context)this.e, com.mobond.mindicator.ui.indianrail.a.a.f(jSONObject.getString("toStn"))));
                        textView3.append((CharSequence)stringBuilder.toString());
                        return view;
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                        return view;
                    }
                }
                if (!a2.e().equals((Object)ActivityCancelledRescheduledTrains.c)) break block11;
                TextView textView = b2.d;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.e.getString(2131755328));
                stringBuilder.append(" ");
                stringBuilder.append(ActivityCancelledRescheduledTrains.a((String)jSONObject.getString("newStartDate")));
                stringBuilder.append(" ");
                stringBuilder.append(this.e.getString(2131755218));
                stringBuilder.append(" ");
                stringBuilder.append(jSONObject.getString("actDep"));
                textView.append((CharSequence)stringBuilder.toString());
                return view;
            }
            if (!a2.e().equals((Object)ActivityCancelledRescheduledTrains.d)) break block12;
            TextView textView = b2.d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.e.getString(2131755153));
            stringBuilder.append(" ");
            stringBuilder.append(jSONObject.getString("divertedFrom"));
            stringBuilder.append(" - ");
            stringBuilder.append(jSONObject.getString("divertedTo"));
            textView.append((CharSequence)stringBuilder.toString());
            return view;
        }
        b2.d.append((CharSequence)"");
        return view;
    }

    class a {
        private JSONObject b;
        private String c;
        private String d;
        private String e;
        private String f;
        private long g;

        a(JSONObject jSONObject, String string, String string2, String string3, long l2) {
            this.b = jSONObject;
            this.c = string;
            this.d = string2;
            this.f = string3;
            this.g = l2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("  ");
            stringBuilder.append(string2);
            this.e = stringBuilder.toString().toLowerCase();
        }

        public JSONObject a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.f;
        }

        public long f() {
            return this.g;
        }
    }

    private class b {
        private TextView b;
        private TextView c;
        private TextView d;
        private TextView e;

        private b() {
        }
    }

}

