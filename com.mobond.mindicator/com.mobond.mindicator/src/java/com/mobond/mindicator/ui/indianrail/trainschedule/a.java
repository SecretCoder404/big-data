/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.core.content.a
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivitySelectTrain
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.trainschedule;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivitySelectTrain;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
extends ArrayAdapter<f> {
    public Filter a;
    private ActivitySelectTrain b;
    private Vector<f> c;
    private Vector<f> d;
    private boolean e;

    a(Vector<f> vector, ActivitySelectTrain activitySelectTrain) {
        super((Context)activitySelectTrain, 2131493055);
        this.b = activitySelectTrain;
        this.c = vector;
        this.a();
        this.addAll(vector);
        this.e = com.mobond.mindicator.a.b((Activity)this.b).D();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Vector<f> a(Context context) {
        int n2;
        JSONArray jSONArray;
        Vector vector = new Vector();
        String string = com.mobond.mindicator.a.b(context).a("trains_history2", null);
        if (string == null) return vector;
        try {
            jSONArray = new JSONArray(string);
            n2 = 0;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        do {
            if (n2 >= jSONArray.length()) return vector;
            JSONObject jSONObject = jSONArray.getJSONObject(n2);
            f f2 = new f();
            f2.w = true;
            f2.a = jSONObject.getString("num");
            f2.e = jSONObject.getString("name");
            f2.j = jSONObject.getString("srcdest");
            vector.add((Object)f2);
            ++n2;
        } while (true);
        return vector;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static Vector<f> a(Context var0, String var1_1, String var2_2, String var3_3, boolean var4_4) {
        block13 : {
            var5_5 = a.a(var0);
            if (!var4_4) ** GOTO lbl9
            try {
                for (f var20_7 : var5_5) {
                    if (!var20_7.a.equals((Object)var1_1)) continue;
                    var5_5.remove((Object)var20_7);
                    ** GOTO lbl30
                }
                ** GOTO lbl30
lbl9: // 1 sources:
                if (var5_5 == null) {
                    var5_5 = new Vector();
                }
                break block13;
            }
            catch (JSONException var10_14) {}
            var10_14.printStackTrace();
            return var5_5;
        }
        var6_8 = 0;
        do {
            block15 : {
                block14 : {
                    if (var6_8 >= var5_5.size()) break block14;
                    if (!((f)var5_5.get((int)var6_8)).a.equals((Object)var1_1)) break block15;
                    var5_5.remove(var6_8);
                }
                var7_9 = new f();
                var7_9.e = var2_2;
                var7_9.a = var1_1;
                var7_9.j = var3_3;
                var7_9.w = true;
                var5_5.add(0, (Object)var7_9);
                if (var5_5.size() > 1) {
                    var5_5.remove(1);
                }
lbl30: // 5 sources:
                var8_10 = new JSONArray();
                var9_11 = var5_5.iterator();
                do {
                    if (!var9_11.hasNext()) {
                        com.mobond.mindicator.a.b(var0).b("trains_history2", var8_10.toString());
                        return var5_5;
                    }
                    var11_12 = (f)var9_11.next();
                    var12_13 = new JSONObject();
                    var12_13.put("num", (Object)var11_12.a);
                    var12_13.put("name", (Object)var11_12.e);
                    var12_13.put("srcdest", (Object)var11_12.j);
                    var8_10.put((Object)var12_13);
                } while (true);
            }
            ++var6_8;
        } while (true);
    }

    private void a() {
        this.d = a.a(this.b.getApplicationContext());
        this.addAll(this.d);
    }

    public static void a(Context context, String string, String string2, int n2) {
        Intent intent = new Intent(context.getApplicationContext(), ActivityTrainSchedule.class);
        intent.putExtra("name", string);
        intent.putExtra("num", string2);
        intent.putExtra("page_pos", n2);
        context.startActivity(intent);
    }

    public static void a(Context context, String string, String string2, String string3, int n2) {
        a.a(context, string2, string.toUpperCase(), string3.toUpperCase(), false);
        Intent intent = new Intent(context.getApplicationContext(), ActivityTrainSchedule.class);
        intent.putExtra("name", string);
        intent.putExtra("num", string2);
        intent.putExtra("page_pos", n2);
        context.startActivity(intent);
    }

    public static void a(Context context, String string, String string2, String string3, String string4) {
        a.a(context, string2, string, string4, false);
        Intent intent = new Intent(context, ActivityTrainSchedule.class);
        intent.putExtra("name", string);
        intent.putExtra("num", string2);
        intent.putExtra("boardingStnCode", string3);
        context.startActivity(intent);
    }

    public Filter getFilter() {
        Log.d((String)"getFilter", (String)"called");
        if (this.a == null) {
            this.a = new Filter(){

                protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                    String string = charSequence.toString().toUpperCase();
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < a.this.c.size(); ++i2) {
                        boolean bl;
                        f f2 = (f)a.this.c.elementAt(i2);
                        if (!(f2.a.startsWith(string) || f2.e.contains((CharSequence)string) || f2.j.startsWith(string))) {
                            bl = false;
                        } else {
                            arrayList.add((Object)f2);
                            bl = true;
                        }
                        if (bl || f2.f == null || !f2.g.contains((CharSequence)string) && !f2.l.startsWith(string)) continue;
                        arrayList.add((Object)f2);
                    }
                    filterResults.count = arrayList.size();
                    filterResults.values = arrayList;
                    return filterResults;
                }

                protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    a.this.clear();
                    a.this.addAll((Collection)((ArrayList)filterResults.values));
                    a.this.notifyDataSetChanged();
                }
            };
        }
        return this.a;
    }

    public View getView(final int n2, View view, ViewGroup viewGroup) {
        f f2;
        a a2;
        if (view == null) {
            view = this.b.getLayoutInflater().inflate(2131493055, viewGroup, false);
            a2 = new a();
            a2.b = (TextView)view.findViewById(2131297510);
            a2.c = (TextView)view.findViewById(2131297551);
            a2.d = (ImageView)view.findViewById(2131296618);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        if (this.e) {
            a2.c.setTextSize(18.0f);
        }
        if ((f2 = (f)this.getItem(n2)) != null) {
            TextView textView = a2.b;
            Object[] arrobject = new Object[]{f2.a, f2.e};
            textView.setText((CharSequence)String.format((String)"%s   %s", (Object[])arrobject));
            a2.c.setText((CharSequence)f2.j);
            if (f2.w) {
                a2.b.setTextColor(androidx.core.content.a.c((Context)this.b, (int)2131099792));
                a2.c.setTextColor(androidx.core.content.a.c((Context)this.b, (int)2131099792));
                a2.d.setVisibility(0);
            } else {
                a2.b.setTextColor(androidx.core.content.a.c((Context)this.b, (int)2131099745));
                a2.c.setTextColor(androidx.core.content.a.c((Context)this.b, (int)2131099745));
                a2.d.setVisibility(8);
            }
        }
        a2.d.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                f f2 = (f)a.this.getItem(n2);
                if (f2 != null) {
                    a a2 = a.this;
                    a2.d = a.a((Context)a2.b, f2.a, f2.e, f2.j, true);
                }
                a.this.clear();
                a.this.a();
                a a3 = a.this;
                a3.addAll((Collection)a3.c);
            }
        });
        view.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                f f2 = (f)a.this.getItem(n2);
                if (f2 != null) {
                    a.a((Context)a.this.b, f2.a, f2.e, f2.j, false);
                    a.a((Context)a.this.b, f2.e, f2.a, 0);
                }
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

