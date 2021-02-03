/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.TimePickerDialog
 *  android.app.TimePickerDialog$OnTimeSetListener
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  androidx.fragment.app.d
 *  androidx.fragment.app.e
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Hashtable
 *  java.util.concurrent.Executor
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.d;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.DestinationSelectUI;
import com.mobond.mindicator.ui.train.SourceSelectUI;
import com.mobond.mindicator.ui.train.b;
import com.mobond.mindicator.ui.train.f;
import com.mulo.util.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.concurrent.Executor;

public class b
extends d
implements View.OnClickListener {
    static boolean a = true;
    static boolean b = false;
    static Hashtable<Integer, b> c;
    private static String p = "";
    private static String q = "";
    String d;
    int e = -1;
    int f = -1;
    int g = -1;
    int h = -1;
    boolean i = false;
    BroadcastReceiver j;
    com.mobond.mindicator.b k;
    boolean l = false;
    Activity m;
    boolean n = false;
    boolean o = false;
    private Button r;
    private Button s;
    private Button t;
    private Button u;
    private Button v;
    private View w;
    private View x;

    static /* synthetic */ View a(b b2, View view) {
        b2.w = view;
        return view;
    }

    static /* synthetic */ Button a(b b2) {
        return b2.t;
    }

    public static b a(int n2, boolean bl) {
        b b2;
        if (c == null) {
            c = new Hashtable();
        }
        if (bl) {
            c.clear();
        }
        if ((b2 = (b)((Object)c.get((Object)n2))) == null) {
            b2 = new b();
            Bundle bundle = new Bundle();
            bundle.putInt("section_number", n2);
            b2.setArguments(bundle);
            c.put((Object)n2, (Object)b2);
        }
        return b2;
    }

    private static String a(String string) {
        String[] arrstring = string.split("-");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].equals((Object)"Share Suggestion")) {
                stringBuffer.append(g.a(arrstring[i2], g.a));
                if (i2 >= -1 + arrstring.length) continue;
                stringBuffer.append("-");
                continue;
            }
            stringBuffer.append(arrstring[i2]);
        }
        return stringBuffer.toString();
    }

    public static void a(Activity activity, int n2, boolean bl) {
        if (!p.equalsIgnoreCase(q)) {
            ArrayList<String> arrayList = com.mulo.a.d.b.a(p, q, (Object)activity, "local/sdr");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("viaroutesArrayList : ");
            stringBuilder.append(arrayList);
            Log.d((String)"ooooo", (String)stringBuilder.toString());
            if (arrayList != null) {
                if (!arrayList.contains((Object)"Share Suggestion")) {
                    arrayList.add((Object)"Share Suggestion");
                }
                CharSequence[] arrcharSequence = new String[arrayList.size()];
                int n3 = 0;
                do {
                    int n4 = arrayList.size();
                    if (n3 >= n4) break;
                    arrcharSequence[n3] = b.a((String)arrayList.get(n3));
                    ++n3;
                } while (true);
                for (int i2 = 0; i2 < arrcharSequence.length; ++i2) {
                    if (arrcharSequence[i2].equals((Object)"Share Suggestion")) {
                        arrcharSequence[i2] = g.a(arrcharSequence[i2], g.a);
                    } else if (!arrcharSequence[i2].equals((Object)"Direct Train")) {
                        arrcharSequence[i2] = arrcharSequence[i2].replace((CharSequence)"-", (CharSequence)" - ");
                        arrcharSequence[i2] = arrcharSequence[i2].replace((CharSequence)" ROAD", (CharSequence)"");
                        arrcharSequence[i2] = arrcharSequence[i2].replace((CharSequence)" JN", (CharSequence)"");
                        arrcharSequence[i2] = e.a((String)arrcharSequence[i2], null);
                        arrcharSequence[i2] = arrcharSequence[i2].replace((CharSequence)" - ", (CharSequence)"\u2192");
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(e.a(g.a(p, g.a), null));
                        stringBuilder2.append("\u2192");
                        stringBuilder2.append(g.a((String)arrcharSequence[i2], g.a));
                        stringBuilder2.append("\u2192");
                        stringBuilder2.append(e.a(g.a(q, g.a), null));
                        arrcharSequence[i2] = stringBuilder2.toString();
                    } else {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(e.a(g.a(p, g.a), null));
                        stringBuilder3.append("\u2192");
                        stringBuilder3.append(e.a(g.a(q, g.a), null));
                        arrcharSequence[i2] = stringBuilder3.toString();
                    }
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("3333 va[i] ");
                    stringBuilder4.append((String)arrcharSequence[i2]);
                    Log.d((String)"3333", (String)stringBuilder4.toString());
                }
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)activity);
                builder.setTitle((CharSequence)activity.getString(2131755500));
                builder.setItems(arrcharSequence, new DialogInterface.OnClickListener(arrayList, activity, n2, bl){
                    final /* synthetic */ ArrayList a;
                    final /* synthetic */ Activity b;
                    final /* synthetic */ int c;
                    final /* synthetic */ boolean d;
                    {
                        this.a = arrayList;
                        this.b = activity;
                        this.c = n2;
                        this.d = bl;
                    }

                    public void onClick(DialogInterface dialogInterface, int n2) {
                        if (((String)this.a.get(n2)).equals((Object)"Share Suggestion")) {
                            String string = "";
                            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                                String string2 = (String)this.a.get(i2);
                                if (string2.equals((Object)"Share Suggestion")) continue;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(string);
                                stringBuilder.append(string2);
                                stringBuilder.append(",");
                                string = stringBuilder.toString();
                            }
                            Intent intent = new Intent((Context)this.b, com.mobond.mindicator.ui.FeedbackUI.class);
                            intent.putExtra("feedbacktype", com.mobond.mindicator.ui.FeedbackUI.c);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("App Build: A:T:20210102\nSource: ");
                            stringBuilder.append(b.b());
                            stringBuilder.append("\n\nDestination: ");
                            stringBuilder.append(b.c());
                            stringBuilder.append("\nRoutes: ");
                            stringBuilder.append(string);
                            intent.putExtra("info", stringBuilder.toString());
                            this.b.startActivityForResult(intent, 0);
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("");
                        stringBuilder.append(b.b());
                        stringBuilder.append(" ");
                        stringBuilder.append(b.c());
                        Log.d((String)"ooooo", (String)stringBuilder.toString());
                        Activity activity = this.b;
                        ArrayList arrayList = this.a;
                        f f2 = new f(activity, (ArrayList<String>)arrayList, (String)arrayList.get(n2), this.c, this.d, b.a, b.b, b.b(), b.c(), false, 0);
                        f2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[]{null, null, null});
                    }
                });
                builder.show();
                return;
            }
            n.d((Context)activity, "Sorry, Information not available!");
            return;
        }
        n.d((Context)activity, "Source & Destination should not be same");
    }

    public static void a(Activity activity, ArrayList<String> arrayList, String string, int n2, boolean bl, boolean bl2, boolean bl3, String string2, String string3, int n3) {
        f f2 = new f(activity, arrayList, string, n2, bl, bl2, bl3, string2, string3, true, n3);
        f2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[]{null, null, null});
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(Intent var1_1) {
        var2_2 = ConfigurationManager.b(this.getContext());
        var3_3 = new StringBuilder();
        var3_3.append(var2_2);
        var3_3.append("_");
        var3_3.append("fastestroutelaststation");
        var7_4 = var3_3.toString();
        var8_5 = this.k.b(var7_4);
        var9_6 = null;
        if (var8_5 == null) ** GOTO lbl-1000
        var17_7 = var8_5.split(",");
        if (var17_7.length == 4) {
            var9_6 = var17_7[0];
            var21_8 = var17_7[1];
            var12_9 = var17_7[2];
            var11_10 = var17_7[3];
            var10_11 = var21_8;
        } else if (var17_7.length == 3) {
            var19_12 = var17_7[0];
            var20_13 = var17_7[1];
            var12_9 = var17_7[2];
            var10_11 = var20_13;
            var9_6 = var19_12;
            var11_10 = null;
        } else if (var17_7.length == 2) {
            var18_14 = var17_7[0];
            var10_11 = var17_7[1];
            var9_6 = var18_14;
            var11_10 = null;
            var12_9 = null;
        } else if (var17_7.length == 1) {
            var9_6 = var17_7[0];
            var10_11 = null;
            var11_10 = null;
            var12_9 = null;
        } else lbl-1000: // 2 sources:
        {
            var10_11 = null;
            var11_10 = null;
            var12_9 = null;
        }
        if (var9_6 != null) {
            var1_1.putExtra("last_station_1", var9_6);
        }
        if (var10_11 != null) {
            var1_1.putExtra("last_station_2", var10_11);
        }
        if (var12_9 != null) {
            var1_1.putExtra("last_station_3", var12_9);
        }
        if (var11_10 == null) return;
        var1_1.putExtra("last_station_4", var11_10);
    }

    private static void a(String string, Activity activity) {
        com.mobond.mindicator.b b2 = a.a(activity);
        String string2 = ConfigurationManager.b((Context)activity);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append("fastestroutelaststation");
        String string3 = stringBuilder.toString();
        String string4 = b2.b(string3);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("ddd saveHistory s:");
        stringBuilder2.append(string4);
        stringBuilder2.append(" ");
        stringBuilder2.append(string2);
        Log.d((String)"ddd", (String)stringBuilder2.toString());
        if (string4 == null) {
            b2.b(string3, string);
            return;
        }
        if (!string4.contains((CharSequence)string)) {
            String[] arrstring = string4.split(",");
            if (arrstring.length == 4) {
                String string5 = arrstring[0];
                String string6 = arrstring[1];
                String string7 = arrstring[2];
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(string);
                stringBuilder3.append(",");
                stringBuilder3.append(string5);
                stringBuilder3.append(",");
                stringBuilder3.append(string6);
                stringBuilder3.append(",");
                stringBuilder3.append(string7);
                b2.b(string3, stringBuilder3.toString());
                return;
            }
            if (arrstring.length == 3) {
                String string8 = arrstring[0];
                String string9 = arrstring[1];
                String string10 = arrstring[2];
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(string);
                stringBuilder4.append(",");
                stringBuilder4.append(string8);
                stringBuilder4.append(",");
                stringBuilder4.append(string9);
                stringBuilder4.append(",");
                stringBuilder4.append(string10);
                b2.b(string3, stringBuilder4.toString());
                return;
            }
            if (arrstring.length == 2) {
                String string11 = arrstring[0];
                String string12 = arrstring[1];
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(string);
                stringBuilder5.append(",");
                stringBuilder5.append(string11);
                stringBuilder5.append(",");
                stringBuilder5.append(string12);
                b2.b(string3, stringBuilder5.toString());
                return;
            }
            if (arrstring.length == 1) {
                String string13 = arrstring[0];
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(string);
                stringBuilder6.append(",");
                stringBuilder6.append(string13);
                b2.b(string3, stringBuilder6.toString());
                return;
            }
            if (arrstring.length == 0) {
                b2.b(string3, string);
            }
        }
    }

    public static void a(String string, String string2, Activity activity) {
        p = string;
        q = string2;
        b.a(p, activity);
        b.a(q, activity);
    }

    static /* synthetic */ Button b(b b2) {
        return b2.u;
    }

    static /* synthetic */ String b() {
        return p;
    }

    static /* synthetic */ String c() {
        return q;
    }

    private void d() {
        View view;
        if (this.n && (view = this.x) != null && !this.o) {
            this.o = true;
            View view2 = view.findViewById(2131296343);
            view2.post(new Runnable(this, view2){
                final /* synthetic */ View a;
                final /* synthetic */ b b;
                {
                    this.b = b2;
                    this.a = view;
                }

                public void run() {
                    this.a.getHeight();
                    b b2 = this.b;
                    androidx.fragment.app.e e2 = b2.getActivity();
                    View view = this.a;
                    b.a(b2, c.a((Activity)e2, view, null, null, "ca-app-pub-5449278086868932/1803705332", "167101606757479_1235756673225295", view.getWidth(), -1, 5, null));
                }
            });
        }
    }

    public void a() {
        String string = e.f();
        this.t.setText((CharSequence)string);
        Calendar calendar = Calendar.getInstance();
        this.e = calendar.get(11);
        this.f = calendar.get(12);
        this.g = calendar.get(11);
        this.h = calendar.get(12);
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        switch (n2) {
            default: {
                return;
            }
            case 2: {
                if (n3 != -1) break;
                q = intent.getExtras().getString("destination_stn");
                q = q.toUpperCase();
                Button button = this.s;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("B:  ");
                stringBuilder.append(g.a(q, g.a));
                button.setText((CharSequence)stringBuilder.toString());
                this.s.setTextColor(-16777216);
                b.a(q, (Activity)this.getActivity());
                return;
            }
            case 1: {
                if (n3 != -1) break;
                p = intent.getExtras().getString("source_stn");
                p = p.toUpperCase();
                Button button = this.r;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("A:  ");
                stringBuilder.append(g.a(p, g.a));
                button.setText((CharSequence)stringBuilder.toString());
                this.r.setTextColor(-16777216);
                b.a(p, (Activity)this.getActivity());
            }
        }
    }

    public void onClick(View view) {
        if (view == this.r) {
            Intent intent = new Intent(view.getContext(), SourceSelectUI.class);
            intent.putExtra("type_fastest_route", true);
            String string = p;
            if (string != null) {
                intent.putExtra("source_stn", string);
                this.a(intent);
            }
            this.startActivityForResult(intent, 1);
            return;
        }
        if (view == this.s) {
            Intent intent = new Intent(view.getContext(), DestinationSelectUI.class);
            intent.putExtra("type_fastest_route", true);
            String string = q;
            if (string != null) {
                intent.putExtra("destination_stn", string);
                this.a(intent);
            }
            this.startActivityForResult(intent, 2);
            return;
        }
        if (view == this.v) {
            String string = p;
            if (string != null && !string.equals((Object)"") && p.compareToIgnoreCase("SOURCE") != 0) {
                String string2 = q;
                if (string2 != null && string2.compareToIgnoreCase("DESTINATION") != 0 && !q.equals((Object)"")) {
                    if (p.equals((Object)q)) {
                        n.d((Context)this.getActivity(), "A & B are same");
                        return;
                    }
                    int n2 = a ? 60 * this.e + this.f : (b ? 60 * this.g + this.h : 0);
                    b.a((Activity)this.getActivity(), n2, false);
                    return;
                }
                n.d((Context)this.getActivity(), "Please enter destination.");
                return;
            }
            n.d((Context)this.getActivity(), "Please enter source");
            return;
        }
        if (view == this.t) {
            TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onTimeSet(android.widget.TimePicker timePicker, int n2, int n3) {
                    String string = e.b(n2, n3);
                    b b2 = this.a;
                    b2.i = true;
                    b.a(b2).setText((CharSequence)string);
                    b.b(this.a).setText((CharSequence)"REACH AT ?");
                    b.b(this.a).setTextSize(12.0f);
                    b.b(this.a).setTypeface(Typeface.DEFAULT_BOLD);
                    b.a(this.a).setTextSize(17.0f);
                    b.a(this.a).setTypeface(Typeface.DEFAULT_BOLD);
                    b.a = true;
                    b.b = false;
                    b b3 = this.a;
                    b3.e = n2;
                    b3.f = n3;
                }
            };
            TimePickerDialog timePickerDialog = new TimePickerDialog(view.getContext(), onTimeSetListener, this.e, this.f, false);
            timePickerDialog.show();
            return;
        }
        if (view == this.u) {
            TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onTimeSet(android.widget.TimePicker timePicker, int n2, int n3) {
                    String string = e.b(n2, n3);
                    b b2 = this.a;
                    b2.i = true;
                    b.b(b2).setText((CharSequence)string);
                    b.a(this.a).setText((CharSequence)"START AT ?");
                    b.a(this.a).setTextSize(12.0f);
                    b.a(this.a).setTypeface(Typeface.DEFAULT_BOLD);
                    b.b(this.a).setTextSize(17.0f);
                    b.b(this.a).setTypeface(Typeface.DEFAULT_BOLD);
                    b.a = false;
                    b.b = true;
                    b b3 = this.a;
                    b3.g = n2;
                    b3.h = n3;
                }
            };
            if (this.g == -1 && this.h == -1) {
                Calendar calendar = Calendar.getInstance();
                this.g = calendar.get(11);
                this.h = calendar.get(12);
            }
            TimePickerDialog timePickerDialog = new TimePickerDialog(view.getContext(), onTimeSetListener, this.g, this.h, false);
            timePickerDialog.show();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        this.m = this.getActivity();
        this.k = a.a((Activity)this.getActivity());
        this.x = layoutInflater.inflate(2131493115, viewGroup, false);
        this.o = false;
        this.d = ConfigurationManager.b(this.getContext());
        this.r = (Button)this.x.findViewById(2131297388);
        this.r.setTextColor(Color.parseColor((String)"#E5E4E2"));
        this.s = (Button)this.x.findViewById(2131296633);
        this.s.setTextColor(Color.parseColor((String)"#E5E4E2"));
        this.t = (Button)this.x.findViewById(2131297415);
        this.u = (Button)this.x.findViewById(2131296637);
        this.v = (Button)this.x.findViewById(2131297273);
        Log.d((String)"removeAtoBshortCut", (String)this.k.a("removeAtoBshortCut", "no"));
        if (this.k.a("removeAtoBshortCut", "no").equals((Object)"yes")) {
            p = null;
            q = null;
            this.k.b("removeAtoBshortCut", "no");
        }
        if ((string2 = p) != null && !string2.equals((Object)"")) {
            Button button = this.r;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("A:  ");
            stringBuilder.append(g.a(p, g.a));
            button.setText((CharSequence)stringBuilder.toString());
            this.r.setTextColor(-16777216);
        }
        if ((string = q) != null && !string.equals((Object)"")) {
            Button button = this.s;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("B:  ");
            stringBuilder.append(g.a(q, g.a));
            button.setText((CharSequence)stringBuilder.toString());
            this.s.setTextColor(-16777216);
        }
        this.r.setOnClickListener((View.OnClickListener)this);
        this.s.setOnClickListener((View.OnClickListener)this);
        this.v.setOnClickListener((View.OnClickListener)this);
        this.t.setOnClickListener((View.OnClickListener)this);
        this.u.setOnClickListener((View.OnClickListener)this);
        this.u.setText((CharSequence)"REACH AT ?");
        this.u.setTextSize(12.0f);
        this.u.setTypeface(Typeface.DEFAULT_BOLD);
        this.t.setTextSize(17.0f);
        this.t.setTypeface(Typeface.DEFAULT_BOLD);
        this.a();
        this.i = false;
        a = true;
        b = false;
        this.j = new BroadcastReceiver(this){
            final /* synthetic */ b a;
            {
                this.a = b2;
            }

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().compareTo("android.intent.action.TIME_TICK") == 0) {
                    if (!this.a.i) {
                        this.a.a();
                        return;
                    }
                    try {
                        this.a.getActivity().unregisterReceiver(this.a.j);
                    }
                    catch (java.lang.Exception exception) {
                        Log.d((String)"1111", (String)"1111", (java.lang.Throwable)exception);
                    }
                    this.a.j = null;
                }
            }
        };
        this.getActivity().registerReceiver(this.j, new IntentFilter("android.intent.action.TIME_TICK"));
        this.x.findViewById(2131296343);
        this.d();
        return this.x;
    }

    /*
     * Exception decompiling
     */
    public void onDestroy() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public void onPause() {
        c.b(this.w);
        super.onPause();
    }

    public void onResume() {
        c.a(this.w);
        super.onResume();
    }

    public void setUserVisibleHint(boolean bl) {
        super.setUserVisibleHint(bl);
        if (bl) {
            this.n = true;
            this.d();
        }
    }
}

