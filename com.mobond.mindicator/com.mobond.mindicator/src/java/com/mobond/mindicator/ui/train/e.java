/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.BaseExpandableListAdapter
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  androidx.core.content.a
 *  com.mobond.mindicator.ui.multicity.a
 *  com.mobond.mindicator.ui.train.DestinationSelectUI
 *  com.mobond.mindicator.ui.train.StationMap
 *  com.mobond.mindicator.ui.train.TraceTrainUI2
 *  com.mobond.mindicator.ui.train.TrainsAtStationUI
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.DestinationSelectUI;
import com.mobond.mindicator.ui.train.StationMap;
import com.mobond.mindicator.ui.train.TraceTrainUI2;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mobond.mindicator.ui.train.c;
import com.mulo.a.d.h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class e
extends BaseExpandableListAdapter {
    public static float a;
    public static float b;
    private final SparseArray<c> c;
    private final ArrayList<String> d;
    private final com.mobond.mindicator.ui.lt.a.a e;
    private int f;
    private int g;
    private LayoutInflater h;
    private Activity i;
    private Animation j;
    private Animation k;
    private int l = 0;
    private String m;
    private d n;

    e(Activity activity, ArrayList<String> arrayList, com.mobond.mindicator.ui.lt.a.a a2, SparseArray<c> sparseArray, int n2, int n3, boolean bl) {
        this.i = activity;
        this.d = arrayList;
        this.e = a2;
        this.c = sparseArray;
        this.h = activity.getLayoutInflater();
        this.f = n2;
        this.g = n3;
        this.j = AnimationUtils.loadAnimation((Context)activity, (int)2130771998);
        this.k = AnimationUtils.loadAnimation((Context)activity, (int)2130771988);
        a = activity.getResources().getDimension(2131165464);
        b = activity.getResources().getDimension(2131165461);
        if (activity instanceof TraceTrainUI2) {
            TraceTrainUI2 traceTrainUI2 = (TraceTrainUI2)activity;
            this.m = traceTrainUI2.L;
            this.n = traceTrainUI2.aF;
        }
    }

    public static String a(int n2) {
        if (n2 == 0) {
            return "On Time";
        }
        if (n2 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append(" min Late");
            return stringBuilder.toString();
        }
        if (n2 < 0) {
            int n3 = Math.abs((int)n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append(" min Early");
            return stringBuilder.toString();
        }
        return null;
    }

    public static String a(long l2) {
        long l3 = (System.currentTimeMillis() - l2) / 60000L;
        if (l3 <= 0L) {
            return "(Just Now)";
        }
        if (l3 < 60L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(l3);
            stringBuilder.append(" min ago)");
            return stringBuilder.toString();
        }
        Date date = new Date(l2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a", Locale.ENGLISH);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@ ");
        stringBuilder.append(simpleDateFormat.format(date));
        return stringBuilder.toString();
    }

    private void a(final String string, final String string2) {
        String string3 = TrainsAtStationUI.d((String)string2);
        int n2 = Integer.parseInt((String)string3.split(":")[0]);
        int n3 = Integer.parseInt((String)string3.split(":")[1]);
        final Calendar calendar = Calendar.getInstance();
        calendar.set(11, n2);
        calendar.set(12, n3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(12, -5);
        String string4 = new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(calendar.getTime());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Alarm will remind at ");
        stringBuilder.append(string4);
        stringBuilder.append(" for ");
        stringBuilder.append(string);
        stringBuilder.append(" station.");
        String string5 = stringBuilder.toString();
        d.a a2 = new d.a((Context)this.i);
        a2.a((CharSequence)"Station Alarm!");
        a2.b((CharSequence)string5).a(true).c(2131230816).a((CharSequence)"SET ALARM", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                if (System.currentTimeMillis() < calendar.getTimeInMillis()) {
                    com.mobond.mindicator.ui.lt.trainutils.d.a(string, string2, calendar.getTimeInMillis(), e.this.n, (Context)e.this.i);
                    e.this.notifyDataSetChanged();
                    return;
                }
                n.d((Context)e.this.i, "Cannot set alarm for past time.");
            }
        }).b((CharSequence)"CANCEL", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        a2.b().show();
    }

    private boolean a(String string) {
        boolean bl = true;
        char[] arrc = new char[bl];
        arrc[0] = 32;
        String string2 = com.mulo.util.e.a(string, arrc);
        if (!(string2.contains((CharSequence)"Churchgate") || string2.contains((CharSequence)"Mumbai Central") || string2.contains((CharSequence)"Dadar") || string2.contains((CharSequence)"Bandra") || string2.contains((CharSequence)"Andheri") || string2.contains((CharSequence)"Borivali") || string2.contains((CharSequence)"Bhayander") || string2.contains((CharSequence)"Vasai Road") || string2.contains((CharSequence)"Virar") || string2.contains((CharSequence)"Dahanu Road") || string2.contains((CharSequence)"CSMT") || string2.contains((CharSequence)"Byculla") || string2.contains((CharSequence)"Kurla") || string2.contains((CharSequence)"Ghatkopar") || string2.contains((CharSequence)"Thane") || string2.contains((CharSequence)"Dombivli") || string2.contains((CharSequence)"Kalyan") || string2.contains((CharSequence)"Ambernath") || string2.contains((CharSequence)"Badlapur") || string2.contains((CharSequence)"Karjat") || string2.contains((CharSequence)"Khopoli") || string2.contains((CharSequence)"Titwala") || string2.contains((CharSequence)"Asangaon") || string2.contains((CharSequence)"Kasara") || string2.contains((CharSequence)"Vadala Road") || string2.contains((CharSequence)"Mankhurd") || string2.contains((CharSequence)"Vashi") || string2.contains((CharSequence)"Nerul") || string2.contains((CharSequence)"Belapur CBD") || string2.contains((CharSequence)"Kharghar") || string2.contains((CharSequence)"Panvel") || string2.contains((CharSequence)"Koparkhairne"))) {
            if (string2.contains((CharSequence)"Roha")) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }

    private void b(final String string, final String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Remove alarm for ");
        stringBuilder.append(string);
        stringBuilder.append(" station.");
        String string3 = stringBuilder.toString();
        d.a a2 = new d.a((Context)this.i);
        a2.a((CharSequence)"Station Alarm!");
        a2.b((CharSequence)string3).a(true).a((CharSequence)"REMOVE ALARM", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                try {
                    com.mobond.mindicator.ui.lt.trainutils.d.a(string, string2, e.this.n, (Context)e.this.i);
                    e.this.notifyDataSetChanged();
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
        }).b((CharSequence)"CANCEL", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        a2.b().show();
    }

    public void a(b b2, String string) {
        if (this.e.b() && string.equals((Object)this.e.b)) {
            b2.s.setText((CharSequence)this.e.d);
            b2.t.setText((CharSequence)e.a(this.e.a));
            if (this.e.g) {
                b2.r.setText((CharSequence)e.a(this.e.e));
            } else {
                TextView textView = b2.r;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(e.a(this.e.e));
                stringBuilder.append(", Not Moving");
                textView.setText((CharSequence)stringBuilder.toString());
            }
            b2.m.setVisibility(0);
            b2.n.setVisibility(0);
            b2.m.startAnimation(this.j);
            b2.o.setVisibility(0);
            if (this.e.c.equals((Object)"0")) {
                b2.o.startAnimation(this.k);
            }
        }
    }

    public void a(String[] arrstring, b b2, int n2, boolean bl) {
        String string = arrstring[0];
        arrstring[1];
        String string2 = arrstring[2];
        String string3 = arrstring[3];
        String string4 = arrstring[4];
        b2.b.setText((CharSequence)string);
        String string5 = com.mobond.mindicator.b.a(string2);
        if (string5 != null) {
            TextView textView = b2.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(g.a(string2, g.a));
            stringBuilder.append("   ");
            stringBuilder.append(string5);
            textView.setText((CharSequence)stringBuilder.toString());
        } else {
            b2.a.setText((CharSequence)g.a(string2, g.a));
        }
        b2.l.setVisibility(0);
        if (string4.isEmpty() && string3.isEmpty()) {
            b2.l.setVisibility(8);
        } else if (string4.equals((Object)"L")) {
            TextView textView = b2.l;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(" LEFT");
            textView.setText((CharSequence)stringBuilder.toString());
        } else if (string4.equals((Object)"R")) {
            TextView textView = b2.l;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(" RIGHT");
            textView.setText((CharSequence)stringBuilder.toString());
        } else if (string4.equals((Object)"B")) {
            TextView textView = b2.l;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(" BOTH");
            textView.setText((CharSequence)stringBuilder.toString());
        } else {
            b2.l.setText((CharSequence)string3);
        }
        if (n2 == 0) {
            b2.g.setVisibility(4);
            b2.h.setVisibility(0);
            b2.i.setVisibility(4);
            b2.j.setVisibility(0);
            b2.f.setImageResource(2131230903);
            return;
        }
        if (n2 == this.d.size() - 1) {
            b2.g.setVisibility(0);
            b2.h.setVisibility(4);
            b2.i.setVisibility(0);
            b2.j.setVisibility(4);
            b2.f.setImageResource(2131230905);
            return;
        }
        b2.g.setVisibility(0);
        b2.h.setVisibility(0);
        b2.i.setVisibility(0);
        b2.j.setVisibility(0);
        b2.f.setImageResource(2131230908);
    }

    public void b(int n2) {
        this.f = n2;
        this.notifyDataSetChanged();
    }

    public Object getChild(int n2, int n3) {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!((String)this.d.get(n2)).contains((CharSequence)((c)this.c.get((int)i2)).b.toUpperCase())) continue;
            return ((c)this.c.get((int)i2)).a.get(n3);
        }
        return null;
    }

    public long getChildId(int n2, int n3) {
        return 0L;
    }

    public View getChildView(int n2, int n3, boolean bl, View view, ViewGroup viewGroup) {
        a a2;
        String[] arrstring = ((String)this.d.get(n2)).split("#", -1);
        final String[] arrstring2 = ((String)this.getChild(n2, n3)).split(":");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arrstring[0]);
        stringBuilder.append(arrstring[1]);
        final String string = stringBuilder.toString();
        final String string2 = arrstring[2];
        arrstring[3];
        if (view == null) {
            view = this.h.inflate(2131493145, null);
            a2 = new a();
            a2.a = (TextView)view.findViewById(2131297485);
            a2.b = view.findViewById(2131296928);
            a2.c = (ImageView)view.findViewById(2131296365);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        if (arrstring2[0].equals((Object)"Station Map")) {
            if (com.mobond.mindicator.a.a(this.i).x() < 3) {
                Animation animation = AnimationUtils.loadAnimation((Context)this.i, (int)2130771982);
                a2.a.startAnimation(animation);
            }
            TextView textView = a2.a;
            Object[] arrobject = new Object[]{g.a("Station Map", g.a)};
            textView.setText((CharSequence)String.format((String)"\u21e8  %s", (Object[])arrobject));
        } else {
            a2.a.clearAnimation();
            TextView textView = a2.a;
            Object[] arrobject = new Object[]{g.a(arrstring2[0], g.a)};
            textView.setText((CharSequence)String.format((String)"\u21e8  %s", (Object[])arrobject));
        }
        a2.a.setTextColor(a2.a.getResources().getColorStateList(2131100271));
        if (n3 == 0) {
            a2.c.setVisibility(0);
            if (!com.mobond.mindicator.ui.lt.trainutils.d.b((Context)this.i, this.m, string2)) {
                a2.c.setImageResource(2131230816);
                a2.c.setColorFilter(null);
                a2.c.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View view) {
                        TraceTrainUI2.a((Context)e.this.i, (String)"STATIONALARM");
                        try {
                            e.this.a(string2, string);
                            return;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return;
                        }
                    }
                });
            } else {
                a2.c.setImageResource(2131230817);
                a2.c.setColorFilter(androidx.core.content.a.c((Context)this.i, (int)2131099753), PorterDuff.Mode.MULTIPLY);
                a2.c.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View view) {
                        e.this.b(string2, string);
                    }
                });
            }
        } else {
            a2.c.setVisibility(4);
        }
        view.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                for (int i2 = 0; i2 < e.this.c.size(); ++i2) {
                    String string6;
                    String string22;
                    int n2;
                    String string3;
                    block12 : {
                        String string4;
                        if (!string2.contains((CharSequence)((c)e.b((e)e.this).get((int)i2)).b.toUpperCase())) continue;
                        string6 = ((c)e.b((e)e.this).get((int)i2)).b.toUpperCase();
                        String string5 = arrstring2[0];
                        int n3 = -1;
                        int n4 = string5.hashCode();
                        if (n4 != -1386633168) {
                            if (n4 == 238021614 && string5.equals((Object)"Destination")) {
                                n3 = 0;
                            }
                        } else if (string5.equals((Object)"Station Map")) {
                            n3 = 1;
                        }
                        switch (n3) {
                            default: {
                                string22 = arrstring2[0].toUpperCase();
                                String[] arrstring = arrstring2;
                                string4 = arrstring[1];
                                string3 = arrstring[2];
                                n2 = h.f;
                                if (!string4.equals((Object)"UP")) break;
                                n2 = h.d;
                                break block12;
                            }
                            case 1: {
                                int n5 = com.mobond.mindicator.a.a(e.this.i).x();
                                com.mobond.mindicator.a.a(e.this.i).b(n5 + 1);
                                Intent intent = new Intent(view.getContext(), StationMap.class);
                                intent.putExtra("Station Map", string6);
                                Activity activity = e.this.i;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(string6.toUpperCase());
                                stringBuilder.append("_STATION_MAP");
                                com.mobond.mindicator.ui.multicity.a.a((Context)activity, (String)"TRAIN", (String)stringBuilder.toString(), (String)"STATION_MAP");
                                e.this.i.startActivity(intent);
                                return;
                            }
                            case 0: {
                                Intent intent = new Intent((Context)e.this.i, DestinationSelectUI.class);
                                intent.putExtra("type_fastest_route", true);
                                intent.putExtra("selected_time", string);
                                intent.putExtra("source_stn", string6);
                                e.this.i.startActivityForResult(intent, 3);
                                return;
                            }
                        }
                        if (string4.equals((Object)"DOWN")) {
                            n2 = h.e;
                        } else if (string4.equals((Object)"NEUTRAL")) {
                            n2 = h.f;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("selected_route: ");
                    stringBuilder.append(string3);
                    stringBuilder.append("\nyou_are_at: ");
                    stringBuilder.append(string6);
                    stringBuilder.append("\nselected_direction: ");
                    stringBuilder.append(n2);
                    stringBuilder.append("\nselectde_direction_end_stations: ");
                    stringBuilder.append(string22);
                    Log.d((String)"111111", (String)stringBuilder.toString());
                    Intent intent = new Intent((Context)e.this.i, TrainsAtStationUI.class);
                    intent.putExtra("selected_time", string);
                    intent.putExtra("selected_route", string3);
                    intent.putExtra("you_are_at", string6);
                    intent.putExtra("iscallfromfav", false);
                    intent.putExtra("selected_direction", n2);
                    intent.putExtra("selected_direction_end_stations", string22);
                    e.this.i.startActivity(intent);
                    return;
                }
            }
        });
        if (n2 == this.d.size() - 1) {
            a2.b.setVisibility(4);
        } else {
            a2.b.setVisibility(0);
        }
        view.setBackgroundColor(-855310);
        return view;
    }

    public int getChildrenCount(int n2) {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!((String)this.d.get(n2)).contains((CharSequence)((c)this.c.get((int)i2)).b.toUpperCase())) continue;
            return ((c)this.c.get((int)i2)).a.size();
        }
        return 0;
    }

    public Object getGroup(int n2) {
        return this.c.get(n2);
    }

    public int getGroupCount() {
        return this.d.size();
    }

    public long getGroupId(int n2) {
        return 0L;
    }

    public View getGroupView(int n2, boolean bl, View view, ViewGroup viewGroup) {
        b b2;
        int n3 = 1;
        if (view == null) {
            view = this.h.inflate(2131493150, null);
            b2 = new b();
            b2.k = (RelativeLayout)view.findViewById(2131297540);
            b2.g = view.findViewById(2131296929);
            b2.f = (ImageView)view.findViewById(2131296673);
            b2.u = (ImageView)view.findViewById(2131296672);
            b2.v = (ImageView)view.findViewById(2131296593);
            b2.d = (RelativeLayout)view.findViewById(2131297353);
            b2.h = view.findViewById(2131296927);
            b2.c = (ImageView)view.findViewById(2131296408);
            b2.i = view.findViewById(2131296411);
            b2.j = view.findViewById(2131296410);
            b2.e = (RelativeLayout)view.findViewById(2131296732);
            b2.a = (TextView)view.findViewById(2131297431);
            b2.a.setLines(n3);
            b2.a.setEllipsize(TextUtils.TruncateAt.END);
            b2.b = (TextView)view.findViewById(2131297504);
            b2.l = (TextView)view.findViewById(2131297078);
            b2.m = view.findViewById(2131297207);
            b2.n = view.findViewById(2131297208);
            b2.q = (TextView)view.findViewById(2131296948);
            b2.r = (TextView)view.findViewById(2131297613);
            b2.s = (TextView)view.findViewById(2131296594);
            b2.t = (TextView)view.findViewById(2131296595);
            b2.o = (RelativeLayout)view.findViewById(2131297197);
            b2.p = (ViewGroup)view.findViewById(2131297206);
            view.setTag((Object)b2);
        } else {
            b2 = (b)view.getTag();
        }
        b2.o.clearAnimation();
        b2.u.setVisibility(0);
        b2.f.setVisibility(0);
        b2.g.setVisibility(0);
        b2.h.setVisibility(0);
        b2.o.setVisibility(4);
        b2.m.clearAnimation();
        b2.m.setVisibility(4);
        b2.n.setVisibility(4);
        b2.q.setText((CharSequence)"");
        b2.b.setText((CharSequence)"");
        b2.a.setText((CharSequence)"");
        b2.l.setText((CharSequence)"");
        b2.a.setTextSize(0, a);
        b2.v.setVisibility(4);
        String string = (String)this.d.get(n2);
        String[] arrstring = new String[6];
        arrstring[0] = "";
        arrstring[n3] = "";
        arrstring[2] = "";
        arrstring[3] = "";
        arrstring[4] = "";
        if (!string.contains((CharSequence)"#LIVEPOS#") && !string.contains((CharSequence)"#NOSTOP#")) {
            arrstring = string.split("#", -1);
            n3 = 0;
        } else if (!string.equals((Object)"#LIVEPOS#")) {
            if (string.contains((CharSequence)"#NOSTOP#")) {
                arrstring[2] = string.split("#")[0];
                b2.a.setTextSize(0, b);
                b2.v.setVisibility(0);
                string.contains((CharSequence)"#LIVEPOS#");
                n3 = 0;
            } else {
                arrstring = string.split("#", -1);
                n3 = 0;
            }
        }
        if (n3 != 0) {
            b2.u.setVisibility(4);
            b2.f.setVisibility(4);
            b2.d.setVisibility(0);
            b2.e.setVisibility(8);
            b2.k.setBackgroundResource(2131099748);
            this.a(b2, this.e.b);
            return view;
        }
        String string2 = arrstring[2];
        if (this.e.b()) {
            if (this.e.c.equals((Object)"0")) {
                this.a(b2, string2);
            }
            if (this.e.i.containsKey((Object)string2)) {
                b2.q.setText((CharSequence)this.e.i.get((Object)string2));
            }
        }
        this.a(arrstring, b2, n2, bl);
        if (bl) {
            b2.b.setTextColor(-12629648);
            b2.a.setTextColor(-12629648);
            b2.l.setTextColor(-12629648);
            b2.d.setVisibility(4);
            b2.e.setVisibility(0);
        } else {
            if (this.a(string2)) {
                b2.a.setTextColor(-16711936);
                b2.b.setTextColor(-16711936);
            } else {
                b2.a.setTextColor(-1);
                b2.b.setTextColor(-1);
            }
            b2.l.setTextColor(-1);
            b2.d.setVisibility(0);
            b2.e.setVisibility(8);
        }
        if (bl) {
            b2.k.setBackgroundResource(2131231323);
            return view;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("focused_index : ");
        stringBuilder.append(this.f);
        Log.d((String)"111", (String)stringBuilder.toString());
        int n4 = this.f;
        if (n4 != -1 && n2 == n4) {
            b2.k.setBackgroundResource(2131230948);
            return view;
        }
        b2.k.setBackgroundResource(2131230838);
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int n2, int n3) {
        return false;
    }

    class a {
        TextView a;
        View b;
        ImageView c;

        a() {
        }
    }

    class b {
        TextView a;
        TextView b;
        ImageView c;
        RelativeLayout d;
        RelativeLayout e;
        ImageView f;
        View g;
        View h;
        View i;
        View j;
        RelativeLayout k;
        TextView l;
        View m;
        View n;
        RelativeLayout o;
        ViewGroup p;
        TextView q;
        TextView r;
        TextView s;
        TextView t;
        ImageView u;
        ImageView v;

        b() {
        }
    }

}

