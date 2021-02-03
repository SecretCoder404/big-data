/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.text.Html
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.cardview.widget.CardView
 *  com.mobond.mindicator.ui.FullScreenImageView
 *  com.mobond.mindicator.ui.alert.a$1
 *  com.mobond.mindicator.ui.h
 *  com.mobond.mindicator.util.EllipsizingTextView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.alert;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.a.a.a.k;
import com.a.a.a.r;
import com.a.a.o;
import com.mobond.mindicator.ui.FullScreenImageView;
import com.mobond.mindicator.ui.alert.a;
import com.mobond.mindicator.ui.alert.c;
import com.mobond.mindicator.ui.h;
import com.mobond.mindicator.util.EllipsizingTextView;
import java.util.ArrayList;
import java.util.Vector;

public class a
extends BaseAdapter {
    Vector<View> a;
    private ArrayList<c> b;
    private LayoutInflater c;
    private k d;
    private int e = 0;

    a(Context context, ArrayList<c> arrayList, Vector<View> vector) {
        this.b = arrayList;
        this.c = (LayoutInflater)context.getSystemService("layout_inflater");
        this.d = new k(r.a(context), (k.b)new h());
        this.a = vector;
    }

    private View a(int n2) {
        if (this.a.size() == 0) {
            return null;
        }
        if (this.a.size() == 1) {
            return (View)this.a.get(0);
        }
        int n3 = this.a.size();
        View view = null;
        if (n3 == 2) {
            if (n2 % 10 == 0) {
                return (View)this.a.get(1);
            }
            view = (View)this.a.get(0);
        }
        return view;
    }

    public int getCount() {
        return this.b.size();
    }

    public Object getItem(int n2) {
        return this.b.get(n2);
    }

    public long getItemId(int n2) {
        return 0L;
    }

    public int getItemViewType(int n2) {
        return n2;
    }

    public View getView(int n2, View view, final ViewGroup viewGroup) {
        a a2;
        if (view == null) {
            view = this.c.inflate(2131492934, viewGroup, false);
            a2 = new a();
            a2.a = (ImageView)view.findViewById(2131296861);
            a2.b = (TextView)view.findViewById(2131297510);
            a2.c = (EllipsizingTextView)view.findViewById(2131296581);
            a2.h = (LinearLayout)view.findViewById(2131297013);
            a2.i = (CardView)view.findViewById(2131296491);
            a2.c.setMovementMethod(LinkMovementMethod.getInstance());
            a2.d = (TextView)view.findViewById(2131296607);
            a2.e = (LinearLayout)view.findViewById(2131296422);
            a2.f = (LinearLayout)view.findViewById(2131297366);
            a2.g = (LinearLayout)view.findViewById(2131297248);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        final c c2 = (c)this.b.get(n2);
        a2.a.setVisibility(8);
        if (c2.a != null && !c2.a.equals((Object)"")) {
            new k(r.a(viewGroup.getContext()), (k.b)new h()).a(c2.a, new 1(this, viewGroup, a2));
            a2.a.setVisibility(0);
        }
        a2.a.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent(viewGroup.getContext(), FullScreenImageView.class);
                intent.putExtra("url", c2.a);
                viewGroup.getContext().startActivity(intent);
            }
        });
        a2.b.setText((CharSequence)c2.b);
        if (c2.c != null) {
            a2.c.setText((CharSequence)Html.fromHtml((String)c2.c));
        }
        a2.c.setMaxLines(4);
        a2.c.setEllipsize(TextUtils.TruncateAt.END);
        a2.c.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Object object = view.getTag();
                if (object != null && !object.equals((Object)"collapsed")) {
                    view.setTag((Object)"collapsed");
                    TextView textView = (TextView)view;
                    textView.setMaxLines(4);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    return;
                }
                view.setTag((Object)"expanded");
                TextView textView = (TextView)view;
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.setEllipsize(null);
            }
        });
        a2.d.setText((CharSequence)c2.d);
        a2.b.setVisibility(0);
        a2.c.setVisibility(0);
        a2.d.setVisibility(0);
        a2.e.setVisibility(0);
        LinearLayout linearLayout = a2.f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2.b);
        stringBuilder.append("<br/><br/>");
        stringBuilder.append(c2.c);
        linearLayout.setTag((Object)stringBuilder.toString());
        if (n2 % 5 == 0) {
            View view2 = this.a(n2);
            if (view2 != null) {
                if (view2.getParent() != null) {
                    ((LinearLayout)view2.getParent()).removeAllViews();
                }
                a2.h.removeAllViews();
                a2.h.addView(view2);
                a2.h.setVisibility(0);
                a2.i.setVisibility(0);
            }
            Log.d((String)"Poss", (String)"Poss: admadevisible 0");
        } else {
            a2.h.setVisibility(8);
            a2.i.setVisibility(8);
        }
        this.e = 1 + this.e;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("my i ");
        stringBuilder2.append(this.e);
        Log.d((String)"adcalledadapter", (String)stringBuilder2.toString());
        return view;
    }

    public int getViewTypeCount() {
        if (this.getCount() < 1) {
            return 1;
        }
        return this.getCount();
    }

    static class a {
        ImageView a;
        TextView b;
        EllipsizingTextView c;
        TextView d;
        LinearLayout e;
        LinearLayout f;
        LinearLayout g;
        LinearLayout h;
        CardView i;

        a() {
        }
    }

}

