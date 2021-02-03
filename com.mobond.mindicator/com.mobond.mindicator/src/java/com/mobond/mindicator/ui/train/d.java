/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.BaseExpandableListAdapter
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  android.widget.Filterable
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.multicity.a
 *  com.mobond.mindicator.ui.train.DestinationSelectUI
 *  com.mobond.mindicator.ui.train.StationMap
 *  com.mobond.mindicator.ui.train.TrainsAtStationUI
 *  com.mobond.mindicator.ui.train.g
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseExpandableListAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.train.DestinationSelectUI;
import com.mobond.mindicator.ui.train.StationMap;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mobond.mindicator.ui.train.c;
import com.mobond.mindicator.ui.train.g;
import com.mulo.a.d.h;
import com.mulo.a.d.k;
import java.util.List;

public class d
extends BaseExpandableListAdapter
implements Filterable {
    public static final String a;
    public SparseArray<c> b;
    public LayoutInflater c;
    public Activity d;
    public int e = -1;
    public boolean f = true;
    boolean g;
    boolean h = false;
    private final SparseArray<c> i;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(com.mobond.mindicator.ui.g.a("Go", com.mobond.mindicator.ui.g.a));
        stringBuilder.append("\u21e8  ");
        stringBuilder.append(com.mobond.mindicator.ui.g.a("Station Map", com.mobond.mindicator.ui.g.a));
        a = stringBuilder.toString();
    }

    public d(Activity activity, SparseArray<c> sparseArray, boolean bl, boolean bl2) {
        this.d = activity;
        this.i = sparseArray;
        this.b = sparseArray;
        this.c = activity.getLayoutInflater();
        this.g = bl;
        this.h = bl2;
    }

    private boolean a(String string) {
        return string.contains((CharSequence)"Churchgate") || string.contains((CharSequence)"Mumbai Central") || string.contains((CharSequence)"Dadar") || string.contains((CharSequence)"Bandra") || string.contains((CharSequence)"Andheri") || string.contains((CharSequence)"Borivali") || string.contains((CharSequence)"Bhayander") || string.contains((CharSequence)"Vasai Road") || string.contains((CharSequence)"Virar") || string.contains((CharSequence)"Dahanu Road") || string.contains((CharSequence)"CSMT") || string.contains((CharSequence)"Byculla") || string.contains((CharSequence)"Kurla") || string.contains((CharSequence)"Ghatkopar") || string.contains((CharSequence)"Thane") || string.contains((CharSequence)"Dombivli") || string.contains((CharSequence)"Kalyan") || string.contains((CharSequence)"Ambernath") || string.contains((CharSequence)"Badlapur") || string.contains((CharSequence)"Karjat") || string.contains((CharSequence)"Khopoli") || string.contains((CharSequence)"Titwala") || string.contains((CharSequence)"Asangaon") || string.contains((CharSequence)"Kasara") || string.contains((CharSequence)"Vadala Road") || string.contains((CharSequence)"Mankhurd") || string.contains((CharSequence)"Vashi") || string.contains((CharSequence)"Nerul") || string.contains((CharSequence)"Belapur CBD") || string.contains((CharSequence)"Kharghar") || string.contains((CharSequence)"Panvel") || string.contains((CharSequence)"Koparkhairne") || string.contains((CharSequence)"Roha");
        {
        }
    }

    public Object getChild(int n2, int n3) {
        return ((c)this.b.get((int)n2)).a.get(n3);
    }

    public long getChildId(int n2, int n3) {
        return 0L;
    }

    public View getChildView(int n2, int n3, boolean bl, View view, ViewGroup viewGroup) {
        final String[] arrstring = ((String)this.getChild(n2, n3)).split(":");
        final c c2 = (c)this.getGroup(n2);
        if (view == null) {
            view = this.c.inflate(2131493060, null);
        }
        if (n2 % 2 == 0) {
            view.findViewById(2131297247).setBackgroundResource(2131230838);
        } else {
            view.findViewById(2131297247).setBackgroundResource(2131231006);
        }
        TextView textView = (TextView)view.findViewById(2131297485);
        if (arrstring[0].equals((Object)"Station Map")) {
            if (a.a(this.d).x() < 3) {
                textView.startAnimation(AnimationUtils.loadAnimation((Context)this.d, (int)2130771982));
            }
            textView.setText((CharSequence)a);
        } else {
            textView.clearAnimation();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" ");
            stringBuilder.append(com.mobond.mindicator.ui.g.a("To", com.mobond.mindicator.ui.g.a));
            stringBuilder.append("\u21e8  %s");
            String string = stringBuilder.toString();
            Object[] arrobject = new Object[]{com.mobond.mindicator.ui.g.a(arrstring[0], com.mobond.mindicator.ui.g.a)};
            textView.setText((CharSequence)String.format((String)string, (Object[])arrobject));
        }
        textView.setTextColor(textView.getResources().getColorStateList(2131100271));
        view.setOnClickListener(new View.OnClickListener(){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public void onClick(View var1_1) {
                block11 : {
                    block10 : {
                        block9 : {
                            var2_2 = c2.b.toUpperCase();
                            var3_3 = arrstring[0];
                            var4_4 = var3_3.hashCode();
                            if (var4_4 == -1386633168) break block9;
                            if (var4_4 != 238021614 || !var3_3.equals((Object)"Destination")) ** GOTO lbl-1000
                            var5_5 = 0;
                            break block10;
                        }
                        if (var3_3.equals((Object)"Station Map")) {
                            var5_5 = 1;
                        } else lbl-1000: // 2 sources:
                        {
                            var5_5 = -1;
                        }
                    }
                    switch (var5_5) {
                        default: {
                            var16_6 = arrstring[0].toUpperCase();
                            var17_7 = arrstring;
                            var18_8 = var17_7[1];
                            var19_9 = var17_7[2];
                            var20_10 = h.f;
                            if (!var18_8.equals((Object)"UP")) break;
                            var20_10 = h.d;
                            break block11;
                        }
                        case 1: {
                            var9_11 = a.a(d.this.d).x();
                            a.a(d.this.d).b(var9_11 + 1);
                            var10_12 = new Intent(var1_1.getContext(), StationMap.class);
                            var10_12.putExtra("Station Map", var2_2);
                            var12_13 = d.this.d;
                            var13_14 = new StringBuilder();
                            var13_14.append(var2_2.toUpperCase());
                            var13_14.append("_STATION_MAP");
                            com.mobond.mindicator.ui.multicity.a.a((Context)var12_13, (String)"TRAIN", (String)var13_14.toString(), (String)"STATION_MAP");
                            d.this.d.startActivity(var10_12);
                            return;
                        }
                        case 0: {
                            var6_15 = new Intent(var1_1.getContext(), DestinationSelectUI.class);
                            var6_15.putExtra("type_fastest_route", true);
                            var6_15.putExtra("source_stn", var2_2);
                            d.this.d.startActivityForResult(var6_15, 2);
                            return;
                        }
                    }
                    if (var18_8.equals((Object)"DOWN")) {
                        var20_10 = h.e;
                    } else if (var18_8.equals((Object)"NEUTRAL")) {
                        var20_10 = h.f;
                    }
                }
                var21_16 = new Intent((Context)d.this.d, TrainsAtStationUI.class);
                var21_16.putExtra("selected_route", var19_9);
                var21_16.putExtra("you_are_at", var2_2);
                var21_16.putExtra("iscallfromfav", false);
                var21_16.putExtra("selected_direction", var20_10);
                var21_16.putExtra("selected_direction_end_stations", var16_6);
                d.this.d.startActivity(var21_16);
            }
        });
        view.setBackgroundColor(-855310);
        return view;
    }

    public int getChildrenCount(int n2) {
        return ((c)this.b.get((int)n2)).a.size();
    }

    public Filter getFilter() {
        return new Filter(){

            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (charSequence != null && charSequence.length() != 0) {
                    String string = charSequence.toString().toUpperCase();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(" ");
                    stringBuilder.append(string);
                    String string2 = stringBuilder.toString();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("-");
                    stringBuilder2.append(string);
                    String string3 = stringBuilder2.toString();
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(",");
                    stringBuilder3.append(string);
                    String string4 = stringBuilder3.toString();
                    SparseArray sparseArray = new SparseArray();
                    int n2 = d.this.i.size();
                    int n3 = 0;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        String string5 = ((c)d.a((d)d.this).get((int)i2)).b.toUpperCase();
                        if (!string5.startsWith(string) && !string5.contains((CharSequence)string2) && !string5.contains((CharSequence)string3) && !string5.contains((CharSequence)string4)) continue;
                        sparseArray.append(n3, d.this.i.get(i2));
                        ++n3;
                    }
                    filterResults.count = sparseArray.size();
                    filterResults.values = sparseArray;
                    return filterResults;
                }
                filterResults.count = d.this.i.size();
                filterResults.values = d.this.i;
                return filterResults;
            }

            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                d.this.b = (SparseArray)filterResults.values;
                d.this.notifyDataSetChanged();
            }
        };
    }

    public Object getGroup(int n2) {
        return this.b.get(n2);
    }

    public int getGroupCount() {
        return this.b.size();
    }

    public long getGroupId(int n2) {
        return 0L;
    }

    public View getGroupView(int n2, boolean bl, View view, ViewGroup viewGroup) {
        g.a a2;
        int n3;
        if (view == null) {
            view = this.c.inflate(2131493132, null);
            a2 = new g.a();
            a2.a = (LinearLayout)view.findViewById(2131297442);
            a2.b = (ImageView)view.findViewById(2131296865);
            a2.c = (TextView)view.findViewById(2131297245);
            view.setTag((Object)a2);
        } else {
            a2 = (g.a)view.getTag();
        }
        c c2 = (c)this.b.get(n2);
        String string = c2.b;
        String string2 = b.a(k.b(string));
        if (string2 != null) {
            TextView textView = a2.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(com.mobond.mindicator.ui.g.a(string, com.mobond.mindicator.ui.g.a));
            stringBuilder.append("   ");
            stringBuilder.append(string2);
            textView.setText((CharSequence)stringBuilder.toString());
        } else {
            a2.c.setText((CharSequence)com.mobond.mindicator.ui.g.a(string, com.mobond.mindicator.ui.g.a));
        }
        a2.d = c2.c;
        a2.e = c2.d;
        if (this.f && (n3 = this.e) != -1 && n2 == n3) {
            a2.a.setBackgroundResource(2131230947);
        } else if (n2 % 2 == 0) {
            a2.a.setBackgroundResource(2131230838);
        } else {
            a2.a.setBackgroundResource(2131231006);
        }
        if (bl) {
            if (a2.d) {
                a2.b.setImageResource(2131230902);
                a2.c.setTextColor(-7829368);
            } else if (this.h) {
                a2.b.setImageResource(2131230899);
                a2.c.setTextColor(-12629648);
            } else {
                if (!this.a(string)) {
                    a2.b.setImageResource(2131230902);
                    a2.c.setTextColor(-7829368);
                } else {
                    a2.b.setImageResource(2131230908);
                    a2.c.setTextColor(-16711936);
                }
                a2.b.setImageResource(2131230899);
                a2.c.setTextColor(-12629648);
            }
            view.setBackgroundResource(2131231323);
            return view;
        }
        if (a2.d) {
            a2.b.setImageResource(2131230902);
            a2.c.setTextColor(-7829368);
            return view;
        }
        if (a2.e) {
            a2.c.setTextColor(-256);
            return view;
        }
        if (this.g) {
            if (this.a(string)) {
                a2.c.setTextColor(-16711936);
            } else {
                a2.c.setTextColor(-1);
            }
        } else {
            a2.c.setTextColor(-1);
        }
        a2.b.setImageResource(2131230908);
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int n2, int n3) {
        return false;
    }

    public void onGroupCollapsed(int n2) {
        super.onGroupCollapsed(n2);
    }

    public void onGroupExpanded(int n2) {
        super.onGroupExpanded(n2);
    }

}

