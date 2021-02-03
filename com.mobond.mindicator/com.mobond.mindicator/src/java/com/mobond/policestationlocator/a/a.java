/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.text.Html
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseExpandableListAdapter
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  android.widget.Filterable
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.mobond.policestationlocator.LocatePoliceStationOnMapActivity
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 */
package com.mobond.policestationlocator.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.mobond.mindicator.ui.n;
import com.mobond.policestationlocator.LocatePoliceStationOnMapActivity;
import com.mobond.policestationlocator.b.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class a
extends BaseExpandableListAdapter
implements Filterable {
    private ArrayList<b> a;
    private ArrayList<b> b;
    private HashMap<String, ArrayList<com.mobond.policestationlocator.b.a>> c;
    private Activity d;
    private LayoutInflater e;

    public a(Activity activity, ArrayList<b> arrayList, HashMap<String, ArrayList<com.mobond.policestationlocator.b.a>> hashMap) {
        this.d = activity;
        this.a = new ArrayList();
        this.a.addAll(arrayList);
        this.b = new ArrayList();
        this.b.addAll(arrayList);
        this.c = hashMap;
        this.e = activity.getLayoutInflater();
    }

    public Object getChild(int n2, int n3) {
        return ((ArrayList)this.c.get((Object)((b)this.a.get((int)n2)).a)).get(n3);
    }

    public long getChildId(int n2, int n3) {
        return n3;
    }

    public View getChildView(final int n2, final int n3, boolean bl, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(2131493060, null);
        }
        view.setBackgroundColor(-2083804);
        TextView textView = (TextView)view.findViewById(2131297485);
        ImageView imageView = (ImageView)view.findViewById(2131297571);
        imageView.setVisibility(0);
        imageView.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        final String string = ((com.mobond.policestationlocator.b.a)this.getChild((int)n2, (int)n3)).b;
        String string2 = ((com.mobond.policestationlocator.b.a)this.getChild((int)n2, (int)n3)).a;
        textView.setText((CharSequence)string);
        if (!string2.equalsIgnoreCase("mob") && !string2.equalsIgnoreCase("tel")) {
            if (string2.equalsIgnoreCase("url")) {
                imageView.setImageResource(2131231200);
                view.setOnClickListener(new View.OnClickListener(((com.mobond.policestationlocator.b.a)this.getChild((int)n2, (int)n3)).c){
                    final /* synthetic */ String a;
                    {
                        this.a = string;
                    }

                    public void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse((String)this.a));
                        a.this.d.startActivity(intent);
                    }
                });
                return view;
            }
            if (string2.equalsIgnoreCase("nav")) {
                imageView.setImageResource(2131231197);
                view.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View view) {
                        Intent intent = new Intent(a.this.d.getApplicationContext(), LocatePoliceStationOnMapActivity.class);
                        intent.putExtra("latLon", ((com.mobond.policestationlocator.b.a)a.this.getChild((int)n2, (int)n3)).c);
                        intent.putExtra("name", ((b)a.this.getGroup((int)n2)).a);
                        a.this.d.startActivity(intent);
                    }
                });
                return view;
            }
        } else {
            imageView.setImageResource(2131231198);
            view.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
                    n.b(a.this.d, string);
                }
            });
        }
        return view;
    }

    public int getChildrenCount(int n2) {
        return ((ArrayList)this.c.get((Object)((b)this.a.get((int)n2)).a)).size();
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
                    ArrayList arrayList = new ArrayList();
                    int n2 = a.this.b.size();
                    for (int i2 = 0; i2 < n2; ++i2) {
                        String string5 = ((b)a.b((a)a.this).get((int)i2)).a.toUpperCase();
                        if (!string5.startsWith(string) && !string5.contains((CharSequence)string2) && !string5.contains((CharSequence)string3) && !string5.contains((CharSequence)string4)) continue;
                        arrayList.add(a.this.b.get(i2));
                    }
                    filterResults.count = arrayList.size();
                    filterResults.values = arrayList;
                    return filterResults;
                }
                filterResults.count = a.this.b.size();
                filterResults.values = a.this.b;
                return filterResults;
            }

            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                a.this.a = (ArrayList)filterResults.values;
                a.this.notifyDataSetChanged();
            }
        };
    }

    public Object getGroup(int n2) {
        return this.a.get(n2);
    }

    public int getGroupCount() {
        return this.a.size();
    }

    public long getGroupId(int n2) {
        return n2;
    }

    public View getGroupView(int n2, boolean bl, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(2131493082, null);
        }
        TextView textView = (TextView)view.findViewById(2131297245);
        textView.setText((CharSequence)((b)this.getGroup((int)n2)).a);
        TextView textView2 = (TextView)view.findViewById(2131296681);
        textView2.setText((CharSequence)Html.fromHtml((String)((b)this.getGroup((int)n2)).b));
        if (bl) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView2.setTextColor(-1);
            view.setBackgroundColor(-2083804);
            return view;
        }
        textView.setTypeface(Typeface.DEFAULT);
        textView2.setTextColor(-5395027);
        if (n2 % 2 == 0) {
            view.setBackgroundResource(2131230838);
            return view;
        }
        view.setBackgroundResource(2131231006);
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int n2, int n3) {
        return false;
    }

}

