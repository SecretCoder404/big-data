/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.BaseAdapter
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule$b
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Locale
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.trainschedule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule;
import com.mobond.mindicator.ui.indianrail.trainschedule.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class c
extends BaseAdapter {
    private int a = 0;
    private ActivityTrainSchedule.b.a b;
    private JSONArray c;
    private LayoutInflater d;
    private int e;
    private Animation f;
    private String g;
    private int h;
    private ActivityTrainSchedule i;
    private Vector<g> j;
    private a.b k;
    private String[] l;
    private String m;
    private double n;
    private double o;

    c(ActivityTrainSchedule activityTrainSchedule, ActivityTrainSchedule.b.a a2) {
        this.i = activityTrainSchedule;
        this.b = a2;
        this.c = a2.h;
        this.d = (LayoutInflater)activityTrainSchedule.getSystemService("layout_inflater");
        this.e = -1 + this.c.length();
        this.g = a2.g;
        this.f = AnimationUtils.loadAnimation((Context)activityTrainSchedule, (int)17432577);
        this.f.setRepeatMode(2);
        this.f.setRepeatCount(-1);
        this.h = a2.i;
        this.n = activityTrainSchedule.getResources().getDisplayMetrics().density;
        this.o = 100.0 * this.n;
    }

    c(ActivityTrainSchedule activityTrainSchedule, Vector<g> vector, a.b b2, String string, String[] arrstring) {
        this.i = activityTrainSchedule;
        this.j = vector;
        this.d = (LayoutInflater)activityTrainSchedule.getSystemService("layout_inflater");
        this.e = -1 + vector.size();
        this.f = AnimationUtils.loadAnimation((Context)activityTrainSchedule, (int)17432577);
        this.f.setRepeatMode(2);
        this.f.setRepeatCount(-1);
        this.k = b2;
        this.m = string;
        this.l = arrstring;
        this.n = activityTrainSchedule.getResources().getDisplayMetrics().density;
        this.o = 100.0 * this.n;
    }

    @SuppressLint(value={"SetTextI18n"})
    private View a(int n2, a a2, View view, JSONObject jSONObject) {
        int n3;
        if (this.b.e) {
            JSONObject jSONObject2 = this.b.f;
            String string = jSONObject2.getString("curstn");
            String string2 = jSONObject2.optString("nextstn");
            String string3 = jSONObject2.getString("nextstninfo");
            String string4 = jSONObject2.getString("note");
            double d2 = Double.parseDouble((String)jSONObject2.getString("pos"));
            if (jSONObject.getString("stnCode").equalsIgnoreCase(string) && string2.isEmpty()) {
                a2.l.setVisibility(8);
                a2.n.setVisibility(8);
                a2.k.setVisibility(8);
                a2.s.setVisibility(8);
                a2.i.setVisibility(8);
                a2.j.setVisibility(0);
                a2.j.startAnimation(this.f);
                if (n2 == this.e) {
                    ((ImageView)a2.j).setImageResource(2131231275);
                } else {
                    ((ImageView)a2.j).setImageResource(2131231274);
                }
                view.setBackgroundResource(2131099794);
            } else if (jSONObject.getString("stnCode").equalsIgnoreCase(string) && !string2.isEmpty()) {
                a2.i.setVisibility(0);
                a2.j.setVisibility(4);
                a2.j.setAnimation(null);
                if (jSONObject2.has("passed")) {
                    a2.l.setVisibility(0);
                    a2.m.setText((CharSequence)jSONObject2.getString("passed"));
                } else {
                    a2.l.setVisibility(8);
                }
                a2.n.setVisibility(0);
                a2.k.setVisibility(0);
                a2.s.setVisibility(0);
                a2.k.setLayoutParams((ViewGroup.LayoutParams)this.a(a2, d2));
                a2.s.setLayoutParams((ViewGroup.LayoutParams)this.b(a2, d2));
                a2.o.setVisibility(0);
                a2.o.setAnimation(this.f);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append("\n");
                stringBuilder.append(string4);
                String string5 = stringBuilder.toString();
                a2.p.setText((CharSequence)string5);
            } else {
                a2.n.setVisibility(8);
                a2.l.setVisibility(8);
                a2.k.setVisibility(8);
                a2.s.setVisibility(8);
                a2.j.setVisibility(4);
                a2.o.setVisibility(4);
                a2.j.setAnimation(null);
                a2.o.setAnimation(null);
            }
        } else {
            a2.n.setVisibility(8);
            a2.k.setVisibility(8);
            a2.s.setVisibility(8);
            a2.o.setVisibility(4);
            a2.o.setAnimation(null);
            a2.i.setVisibility(0);
            a2.j.setVisibility(4);
            a2.j.setAnimation(null);
            if (n2 == this.h) {
                a2.i.setVisibility(8);
                a2.j.setVisibility(0);
                a2.j.startAnimation(this.f);
                if (n2 == this.e) {
                    ((ImageView)a2.j).setImageResource(2131231275);
                } else {
                    ((ImageView)a2.j).setImageResource(2131231274);
                }
                view.setBackgroundResource(2131099794);
            } else {
                a2.i.setVisibility(0);
                a2.j.setVisibility(4);
                a2.j.setAnimation(null);
            }
        }
        String string = jSONObject.getString("actArr");
        String string6 = jSONObject.getString("stnCode");
        this.a(a2, jSONObject);
        int n4 = jSONObject.getInt("delayArr");
        int n5 = jSONObject.optInt("delayDep");
        String[] arrstring = this.a((Activity)this.i, n4);
        String string7 = arrstring[0];
        String string8 = arrstring[1];
        TextView textView = a2.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IRParserProvider.getIRParser().formatIntoAMPM(string, true));
        stringBuilder.append("  ");
        stringBuilder.append(com.mobond.mindicator.ui.indianrail.a.a.f(string6));
        textView.setText((CharSequence)stringBuilder.toString());
        TextView textView2 = a2.d;
        Object[] arrobject = new Object[2];
        if (n2 < 1 + this.h) {
            string8 = string7;
        }
        arrobject[0] = string8;
        arrobject[1] = IRParserProvider.getIRParser().getClearDelayTimeFromMinutes(n4);
        textView2.setText((CharSequence)String.format((String)"%s%s", (Object[])arrobject));
        a2.e.setVisibility(8);
        if (n2 == 0) {
            boolean bl = jSONObject.getBoolean("dep");
            if (!bl) {
                bl = this.c.getJSONObject(1).getBoolean("dep");
            }
            String[] arrstring2 = this.a((Activity)this.i, n4, n5);
            String string9 = arrstring2[0];
            String string10 = arrstring2[1];
            String string11 = jSONObject.getString("schDepTime");
            String string12 = jSONObject.getString("actDep");
            a2.b.setText((CharSequence)IRParserProvider.getIRParser().formatIntoAMPM(string11, true));
            TextView textView3 = a2.c;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(IRParserProvider.getIRParser().formatIntoAMPM(string12, true));
            stringBuilder2.append("  ");
            stringBuilder2.append(com.mobond.mindicator.ui.indianrail.a.a.f(string6));
            textView3.setText((CharSequence)stringBuilder2.toString());
            TextView textView4 = a2.d;
            Object[] arrobject2 = new Object[2];
            if (bl) {
                string10 = string9;
            }
            arrobject2[0] = string10;
            arrobject2[1] = IRParserProvider.getIRParser().getClearDelayTimeFromMinutes(jSONObject.getInt("delayDep"));
            textView4.setText((CharSequence)String.format((String)"%s%s", (Object[])arrobject2));
            a2.g.setVisibility(4);
            a2.h.setVisibility(0);
            a2.e.setText((CharSequence)this.g);
            a2.e.setVisibility(0);
            n3 = 2;
        } else if (n2 == this.e) {
            a2.g.setVisibility(0);
            a2.h.setVisibility(4);
            n3 = 2;
        } else {
            a2.g.setVisibility(0);
            a2.h.setVisibility(0);
            n3 = 2;
        }
        if (n2 % n3 == 0) {
            view.setBackgroundResource(2131099748);
            return view;
        }
        view.setBackgroundResource(2131099793);
        return view;
    }

    @SuppressLint(value={"SetTextI18n"})
    private View a(ActivityTrainSchedule activityTrainSchedule, int n2, View view, a a2, Vector<g> vector, a.b b2) {
        g g2 = (g)vector.get(n2);
        this.a(a2);
        a2.b.setText((CharSequence)g2.b);
        a2.c.setText((CharSequence)g2.a);
        this.a(n2, a2, g2, this.e);
        if (n2 == 0) {
            TextView textView = a2.d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activityTrainSchedule.getString(2131755363));
            stringBuilder.append(g2.g);
            textView.setText((CharSequence)stringBuilder.toString());
        } else if (n2 == this.e) {
            TextView textView = a2.d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activityTrainSchedule.getString(2131755234));
            stringBuilder.append("    ");
            stringBuilder.append(g2.f);
            stringBuilder.append(d.f);
            stringBuilder.append("   ");
            stringBuilder.append(activityTrainSchedule.getString(2131755228));
            stringBuilder.append(g2.g);
            textView.setText((CharSequence)stringBuilder.toString());
        } else {
            TextView textView = a2.d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activityTrainSchedule.getString(2131755249));
            stringBuilder.append(" ");
            stringBuilder.append(g2.e);
            stringBuilder.append(d.b);
            stringBuilder.append("   ");
            stringBuilder.append(g2.f);
            stringBuilder.append(d.f);
            stringBuilder.append("   ");
            stringBuilder.append(activityTrainSchedule.getString(2131755228));
            stringBuilder.append(g2.g);
            textView.setText((CharSequence)stringBuilder.toString());
        }
        if (n2 == b2.d()) {
            this.a(activityTrainSchedule, n2, a2, g2, b2);
            return view;
        }
        if (n2 % 2 == 0) {
            view.setBackgroundResource(2131099748);
            return view;
        }
        view.setBackgroundResource(2131099793);
        return view;
    }

    private LinearLayout.LayoutParams a(a a2, double d2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)a2.k.getLayoutParams();
        layoutParams.height = (int)(d2 * this.o);
        return layoutParams;
    }

    private LinearLayout.LayoutParams a(a a2, a.b b2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)a2.k.getLayoutParams();
        layoutParams.height = (int)this.c(b2);
        return layoutParams;
    }

    private static String a(Context context, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getString(2131755334));
        stringBuilder.append(" ");
        if (n2 > 0) {
            if (n2 == 1) {
                stringBuilder.append(n2);
                stringBuilder.append(d.d);
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(n2);
                stringBuilder.append(d.e);
                stringBuilder.append(" ");
            }
        }
        if (n3 > 0) {
            stringBuilder.append(n3);
            stringBuilder.append(d.b);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static String a(Context context, Vector<g> vector, int n2, String string) {
        Calendar calendar = Calendar.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(calendar.get(11));
        stringBuilder.append(":");
        stringBuilder.append(calendar.get(12));
        String string2 = stringBuilder.toString();
        int n3 = n2 == 0 ? 1 : Integer.parseInt((String)((g)vector.get((int)(n2 - 1))).g);
        int n4 = Integer.parseInt((String)((g)vector.get((int)n2)).g);
        if (string.contains((CharSequence)"AM") || string.contains((CharSequence)"PM")) {
            string = c.a(string);
        }
        String[] arrstring = string.split(":");
        String[] arrstring2 = string2.split(":");
        int n5 = Integer.parseInt((String)arrstring[0]);
        int n6 = Integer.parseInt((String)arrstring2[0]);
        int n7 = Integer.parseInt((String)arrstring[1]);
        int n8 = Integer.parseInt((String)arrstring2[1]);
        int n9 = n6 - n5;
        int n10 = n8 - n7;
        if (n10 < 0) {
            --n9;
            n10 = 60 - Math.abs((int)n10);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        if (n9 >= 0 && n3 == n4) {
            stringBuilder2.append(c.a(context, n9, n10));
            return stringBuilder2.toString();
        }
        if (n9 < 0 && n3 < n4) {
            stringBuilder2.append(c.a(context, 24 - Math.abs((int)n9), n10));
            return stringBuilder2.toString();
        }
        return "";
    }

    private static String a(a.b b2, int n2, int n3, String string) {
        int n4 = n3 * (n2 - b2.l()) / n2;
        String[] arrstring = string.split(":");
        int n5 = Integer.parseInt((String)arrstring[1]);
        int n6 = Integer.parseInt((String)arrstring[0]);
        int n7 = n5 + n4;
        if (n7 >= 60) {
            int n8 = n7 / 60;
            n7 %= 60;
            n6 += n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n6);
        stringBuilder.append(":");
        stringBuilder.append(n7);
        return stringBuilder.toString();
    }

    private static String a(String string) {
        return new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(new SimpleDateFormat("hh:mm a", Locale.ENGLISH).parse(string.trim()));
    }

    public static String a(Vector<g> vector, a.b b2) {
        int n2 = b2.d();
        g g2 = (g)vector.get(n2);
        g g3 = (g)vector.get(n2 + 1);
        int n3 = Integer.parseInt((String)g2.f.trim());
        int n4 = Integer.parseInt((String)g3.f.trim());
        int n5 = g2.d;
        int n6 = g3.d;
        String string = g2.c == null && (g2.b.contains((CharSequence)"PM") || g2.b.contains((CharSequence)"AM")) ? c.a(g2.b) : g2.c;
        return c.a(b2, Math.abs((int)(n4 - n3)), Math.abs((int)(n6 - n5)), string);
    }

    private void a(int n2, a a2, g g2, int n3) {
        if (n2 == 0) {
            a2.b.setText((CharSequence)g2.b);
            a2.c.setText((CharSequence)g2.a);
            a2.g.setVisibility(4);
            a2.h.setVisibility(0);
            return;
        }
        if (n2 == n3) {
            a2.g.setVisibility(0);
            a2.h.setVisibility(4);
            return;
        }
        a2.g.setVisibility(0);
        a2.h.setVisibility(0);
    }

    private void a(Activity activity, int n2, a a2, a.b b2) {
        a2.n.setVisibility(0);
        a2.k.setVisibility(0);
        a2.s.setVisibility(0);
        a2.k.setLayoutParams((ViewGroup.LayoutParams)this.a(a2, b2));
        a2.s.setLayoutParams((ViewGroup.LayoutParams)this.b(a2, b2));
        a2.o.setVisibility(0);
        a2.o.startAnimation(this.f);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b2.k());
        stringBuilder.append(" \u2192 ");
        stringBuilder.append(b2.l());
        stringBuilder.append(d.f);
        stringBuilder.append(" \u2192 ");
        stringBuilder.append(c.b(this.j, b2));
        stringBuilder.append("\n");
        Vector<g> vector = this.j;
        stringBuilder.append(c.a((Context)activity, vector, n2, c.a(vector, b2)));
        String string = stringBuilder.toString();
        a2.p.setText((CharSequence)string);
    }

    @SuppressLint(value={"SetTextI18n"})
    private void a(Activity activity, int n2, a a2, g g2) {
        a2.n.setVisibility(8);
        a2.k.setVisibility(8);
        a2.s.setVisibility(8);
        a2.j.setVisibility(0);
        a2.j.setAnimation(this.f);
        a2.i.setVisibility(4);
        Calendar calendar = Calendar.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(calendar.get(11));
        stringBuilder.append(":");
        stringBuilder.append(calendar.get(12));
        String string = stringBuilder.toString();
        String string2 = IRParserProvider.getIRParser().formatIntoAMPM(string, true);
        TextView textView = a2.c;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string2);
        stringBuilder2.append("  ");
        stringBuilder2.append(g2.a);
        textView.setText((CharSequence)stringBuilder2.toString());
        String string3 = c.a((Context)activity, this.j, n2, g2.b);
        if (!string3.isEmpty()) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string3);
            stringBuilder3.append("   ");
            string3 = stringBuilder3.toString();
        }
        if (n2 == this.e) {
            TextView textView2 = a2.d;
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(activity.getString(2131755234));
            stringBuilder4.append("    ");
            stringBuilder4.append(g2.f);
            stringBuilder4.append(d.f);
            stringBuilder4.append("   ");
            stringBuilder4.append(activity.getString(2131755228));
            stringBuilder4.append(g2.g);
            textView2.setText((CharSequence)stringBuilder4.toString());
        } else {
            TextView textView3 = a2.d;
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(string3);
            stringBuilder5.append(activity.getString(2131755249));
            stringBuilder5.append(" ");
            stringBuilder5.append(g2.e);
            stringBuilder5.append(d.b);
            textView3.setText((CharSequence)stringBuilder5.toString());
        }
        if (n2 == this.e) {
            a2.n.setVisibility(8);
            a2.k.setVisibility(8);
            a2.s.setVisibility(8);
            a2.j.setVisibility(0);
            ((ImageView)a2.j).setImageResource(2131231275);
            return;
        }
        ((ImageView)a2.j).setImageResource(2131231274);
    }

    private void a(ActivityTrainSchedule activityTrainSchedule, int n2, a a2, g g2, a.b b2) {
        String string = b2.h();
        if (c.b(b2)) {
            this.a((Activity)activityTrainSchedule, n2, a2, b2);
            return;
        }
        if (!string.isEmpty()) {
            this.a((Activity)activityTrainSchedule, n2, a2, g2);
        }
    }

    private void a(a a2) {
        a2.b.setVisibility(0);
        a2.n.setVisibility(8);
        a2.k.setVisibility(8);
        a2.s.setVisibility(8);
        a2.e.setVisibility(8);
        a2.f.setVisibility(8);
        a2.d.setVisibility(0);
        a2.i.setVisibility(0);
        a2.j.setVisibility(4);
        a2.j.setAnimation(null);
        a2.o.setVisibility(4);
        a2.o.setAnimation(null);
    }

    private void a(a a2, JSONObject jSONObject) {
        String string = jSONObject.getString("schArrTime");
        if (jSONObject.getBoolean("stoppingStn")) {
            a2.f.setVisibility(8);
            a2.f.setAnimation(null);
            a2.b.setText((CharSequence)IRParserProvider.getIRParser().formatIntoAMPM(string, true));
            a2.b.setVisibility(0);
            return;
        }
        a2.f.setVisibility(0);
        a2.f.setAnimation(this.f);
        a2.b.setVisibility(4);
    }

    private String[] a(Activity activity, int n2) {
        String string;
        String string2;
        if (n2 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.getResources().getString(2131755335));
            stringBuilder.append(" ");
            string2 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(activity.getResources().getString(2131755338));
            stringBuilder2.append(" ");
            string = stringBuilder2.toString();
        } else if (n2 == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.getResources().getString(2131755333));
            stringBuilder.append(" ");
            string2 = stringBuilder.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(activity.getResources().getString(2131755340));
            stringBuilder3.append(" ");
            string = stringBuilder3.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.getResources().getString(2131755332));
            stringBuilder.append(" ");
            string2 = stringBuilder.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(activity.getResources().getString(2131755339));
            stringBuilder4.append(" ");
            string = stringBuilder4.toString();
        }
        return new String[]{string2, string};
    }

    private String[] a(Activity activity, int n2, int n3) {
        String string;
        String string2;
        if (n2 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.getResources().getString(2131755335));
            stringBuilder.append(" ");
            string2 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(activity.getResources().getString(2131755338));
            stringBuilder2.append(" ");
            string = stringBuilder2.toString();
        } else if (n2 == 0) {
            if (n3 > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(activity.getResources().getString(2131755337));
                stringBuilder.append(" ");
                string2 = stringBuilder.toString();
            } else if (n3 == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(activity.getResources().getString(2131755336));
                stringBuilder.append(" ");
                string2 = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(activity.getResources().getString(2131755232));
                stringBuilder.append(" ");
                string2 = stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.getResources().getString(2131755341));
            stringBuilder.append(" ");
            string = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.getResources().getString(2131755330));
            stringBuilder.append(" ");
            string2 = stringBuilder.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(activity.getResources().getString(2131755232));
            stringBuilder3.append(" ");
            string = stringBuilder3.toString();
        }
        return new String[]{string2, string};
    }

    private LinearLayout.LayoutParams b(a a2, double d2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)a2.s.getLayoutParams();
        layoutParams.height = (int)(this.o * (1.0 - d2));
        return layoutParams;
    }

    private LinearLayout.LayoutParams b(a a2, a.b b2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)a2.s.getLayoutParams();
        layoutParams.height = (int)(this.o - this.c(b2));
        return layoutParams;
    }

    public static String b(Vector<g> vector, a.b b2) {
        int n2 = b2.d();
        g g2 = (g)vector.get(n2);
        g g3 = (g)vector.get(n2 + 1);
        int n3 = Math.abs((int)(Integer.parseInt((String)g3.f.trim()) - Integer.parseInt((String)g2.f.trim())));
        int n4 = b2.l();
        int n5 = g3.d < g2.d ? 1440 - g2.d + g3.d : g3.d - g2.d;
        int n6 = n4 * n5 / n3;
        StringBuilder stringBuilder = new StringBuilder();
        if (n6 > 60) {
            int n7 = n6 / 60;
            int n8 = n6 % 60;
            stringBuilder.append(n7);
            if (n7 > 1) {
                stringBuilder.append(d.e);
            } else {
                stringBuilder.append(d.d);
            }
            stringBuilder.append(" ");
            stringBuilder.append(n8);
            stringBuilder.append(d.b);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(n6);
        stringBuilder2.append(d.b);
        return stringBuilder2.toString();
    }

    private static boolean b(a.b b2) {
        return !b2.h().isEmpty() && !b2.k().isEmpty() && !b2.k().contains((CharSequence)"null");
    }

    private double c(a.b b2) {
        return 100.0 * Math.abs((double)(b2.g() - b2.e())) / Math.abs((double)(b2.f() - b2.e())) * this.n;
    }

    public void a(a.b b2) {
        this.k = b2;
        this.notifyDataSetChanged();
    }

    public void a(String[] arrstring) {
        this.l = arrstring;
    }

    public int getCount() {
        JSONArray jSONArray = this.c;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return this.j.size();
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
            view = this.d.inflate(2131493041, viewGroup, false);
            a a3 = new a();
            a3.b = (TextView)view.findViewById(2131296679);
            a3.n = (LinearLayout)view.findViewById(2131296818);
            a3.c = (TextView)view.findViewById(2131296680);
            a3.e = (TextView)view.findViewById(2131296681);
            a3.d = (TextView)view.findViewById(2131296682);
            a3.f = (TextView)view.findViewById(2131297038);
            a3.h = view.findViewById(2131296927);
            a3.g = view.findViewById(2131296929);
            a3.i = view.findViewById(2131296861);
            a3.j = view.findViewById(2131296388);
            a3.k = (LinearLayout)view.findViewById(2131296922);
            a3.o = view.findViewById(2131296389);
            a3.p = (TextView)view.findViewById(2131296651);
            a3.q = (TextView)view.findViewById(2131297031);
            a3.r = (FrameLayout)view.findViewById(2131296650);
            a3.l = (LinearLayout)view.findViewById(2131297043);
            a3.m = (TextView)view.findViewById(2131297075);
            a3.s = (LinearLayout)view.findViewById(2131296923);
            view.setTag((Object)a3);
            a2 = a3;
        } else {
            a2 = (a)view.getTag();
        }
        try {
            if (this.c != null) {
                return this.a(n2, a2, view, this.c.getJSONObject(n2));
            }
            ActivityTrainSchedule activityTrainSchedule = this.i;
            Vector<g> vector = this.j;
            a.b b2 = this.k;
            View view2 = this.a(activityTrainSchedule, n2, view, a2, vector, b2);
            return view2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return view;
        }
    }

    private class a {
        private TextView b;
        private TextView c;
        private TextView d;
        private TextView e;
        private TextView f;
        private View g;
        private View h;
        private View i;
        private View j;
        private LinearLayout k;
        private LinearLayout l;
        private TextView m;
        private LinearLayout n;
        private View o;
        private TextView p;
        private TextView q;
        private FrameLayout r;
        private LinearLayout s;

        private a() {
        }
    }

}

