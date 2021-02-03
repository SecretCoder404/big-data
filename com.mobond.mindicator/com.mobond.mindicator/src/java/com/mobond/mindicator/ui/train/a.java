/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.TableLayout
 *  android.widget.TableRow
 *  android.widget.TextView
 *  androidx.fragment.app.d
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.fragment.app.d;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.DestinationSelectUI;
import com.mobond.mindicator.ui.train.SourceSelectUI;
import com.mobond.mindicator.ui.train.a;
import com.mulo.a.d.g;
import java.util.Vector;

public class a
extends d
implements View.OnClickListener {
    private static String l = "";
    private static String m = "";
    private static int n;
    private static int o;
    SharedPreferences a;
    String b;
    TableLayout c;
    LinearLayout d;
    TextView e;
    TextView f;
    View g;
    View h;
    Activity i;
    boolean j = false;
    boolean k = false;
    private Button p;
    private Button q;
    private Button r;

    private TableRow a(Activity activity, String string) {
        TableRow tableRow = (TableRow)activity.getLayoutInflater().inflate(2131492994, null);
        ((TextView)tableRow.findViewById(2131297474)).setText((CharSequence)string);
        return tableRow;
    }

    private TableRow a(Activity activity, String string, String string2, String string3, String string4, boolean bl) {
        TableRow tableRow = (TableRow)activity.getLayoutInflater().inflate(2131492993, null);
        TextView textView = (TextView)tableRow.findViewById(2131297475);
        textView.setTextSize(2, 16.0f);
        textView.setSingleLine(false);
        textView.setText((CharSequence)string);
        TextView textView2 = (TextView)tableRow.findViewById(2131297477);
        textView2.setTextSize(2, 16.0f);
        textView2.setSingleLine(false);
        textView2.setText((CharSequence)string2);
        TextView textView3 = (TextView)tableRow.findViewById(2131297478);
        textView3.setTextSize(2, 16.0f);
        textView3.setSingleLine(false);
        textView3.setText((CharSequence)string3);
        TextView textView4 = (TextView)tableRow.findViewById(2131297479);
        textView4.setTextSize(2, 16.0f);
        textView4.setSingleLine(false);
        textView4.setText((CharSequence)string4);
        if (bl) {
            textView.setTypeface(null, 1);
            textView2.setTypeface(null, 1);
            textView3.setTypeface(null, 1);
            textView4.setTypeface(null, 1);
        }
        return tableRow;
    }

    private void a(Activity activity, g g2) {
        String string;
        String string2;
        String string3;
        if (g2.b == 0) {
            string = "--";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(g2.b);
            string = stringBuilder.toString();
        }
        if (g2.g == 0) {
            string2 = "--";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(g2.g);
            string2 = stringBuilder.toString();
        }
        if (g2.l == 0) {
            string3 = "--";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(g2.l);
            string3 = stringBuilder.toString();
        }
        if (ConfigurationManager.b((Context)activity).equals((Object)"delhi")) {
            this.e.setText((CharSequence)string);
        }
        this.c.addView((View)this.a(activity, "", "II", "I", "AC", true));
        TableLayout tableLayout = this.c;
        String string4 = com.mulo.a.d.c.a("Regular Ticket", com.mulo.a.d.c.a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(string);
        String string5 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("");
        stringBuilder2.append(string2);
        String string6 = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("");
        stringBuilder3.append(string3);
        tableLayout.addView((View)this.a(activity, string4, string5, string6, stringBuilder3.toString(), false));
        if (g2.c != 0 || g2.d != 0 || g2.e != 0 || g2.f != 0 || g2.h != 0 || g2.i != 0 || g2.j != 0 || g2.k != 0 || g2.m != 0 || g2.n != 0 || g2.o != 0 || g2.p != 0) {
            TableLayout tableLayout2 = this.c;
            String string7 = com.mulo.a.d.c.a("1 Month  Pass", com.mulo.a.d.c.a);
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("");
            stringBuilder4.append(g2.c);
            String string8 = stringBuilder4.toString();
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("");
            stringBuilder5.append(g2.h);
            String string9 = stringBuilder5.toString();
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("");
            stringBuilder6.append(g2.m);
            tableLayout2.addView((View)this.a(activity, string7, string8, string9, stringBuilder6.toString(), false));
            TableLayout tableLayout3 = this.c;
            String string10 = com.mulo.a.d.c.a("3 Months Pass", com.mulo.a.d.c.a);
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append("");
            stringBuilder7.append(g2.d);
            String string11 = stringBuilder7.toString();
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append("");
            stringBuilder8.append(g2.i);
            String string12 = stringBuilder8.toString();
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append("");
            stringBuilder9.append(g2.n);
            tableLayout3.addView((View)this.a(activity, string10, string11, string12, stringBuilder9.toString(), false));
            TableLayout tableLayout4 = this.c;
            String string13 = com.mulo.a.d.c.a("6 Months Pass", com.mulo.a.d.c.a);
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append("");
            stringBuilder10.append(g2.e);
            String string14 = stringBuilder10.toString();
            StringBuilder stringBuilder11 = new StringBuilder();
            stringBuilder11.append("");
            stringBuilder11.append(g2.j);
            String string15 = stringBuilder11.toString();
            StringBuilder stringBuilder12 = new StringBuilder();
            stringBuilder12.append("");
            stringBuilder12.append(g2.o);
            tableLayout4.addView((View)this.a(activity, string13, string14, string15, stringBuilder12.toString(), false));
            TableLayout tableLayout5 = this.c;
            String string16 = com.mulo.a.d.c.a("1 Year Pass", com.mulo.a.d.c.a);
            StringBuilder stringBuilder13 = new StringBuilder();
            stringBuilder13.append("");
            stringBuilder13.append(g2.f);
            String string17 = stringBuilder13.toString();
            StringBuilder stringBuilder14 = new StringBuilder();
            stringBuilder14.append("");
            stringBuilder14.append(g2.k);
            String string18 = stringBuilder14.toString();
            StringBuilder stringBuilder15 = new StringBuilder();
            stringBuilder15.append("");
            stringBuilder15.append(g2.p);
            tableLayout5.addView((View)this.a(activity, string16, string17, string18, stringBuilder15.toString(), false));
        }
        if (g2.q != 0 || g2.r != 0) {
            TableLayout tableLayout6 = this.c;
            String string19 = com.mulo.a.d.c.a("1 Week Pass", com.mulo.a.d.c.a);
            StringBuilder stringBuilder16 = new StringBuilder();
            stringBuilder16.append("");
            stringBuilder16.append(g2.q);
            tableLayout6.addView((View)this.a(activity, string19, "--", "--", stringBuilder16.toString(), false));
            TableLayout tableLayout7 = this.c;
            String string20 = com.mulo.a.d.c.a("2 Weeks Pass", com.mulo.a.d.c.a);
            StringBuilder stringBuilder17 = new StringBuilder();
            stringBuilder17.append("");
            stringBuilder17.append(g2.r);
            tableLayout7.addView((View)this.a(activity, string20, "--", "--", stringBuilder17.toString(), false));
        }
        this.c.addView((View)this.a());
    }

    private void b() {
        View view;
        if (this.j && (view = this.h) != null && !this.k) {
            this.k = true;
            View view2 = view.findViewById(2131296343);
            view2.post(new Runnable(this, view2){
                final /* synthetic */ View a;
                final /* synthetic */ a b;
                {
                    this.b = a2;
                    this.a = view;
                }

                public void run() {
                    this.a.getHeight();
                    a a2 = this.b;
                    Activity activity = a2.i;
                    View view = this.a;
                    a2.g = c.a(activity, view, null, null, "ca-app-pub-5449278086868932/2673933872", "167101606757479_1235757153225247", view.getWidth(), -1, 4, null);
                }
            });
        }
    }

    public TableRow a() {
        return (TableRow)this.i.getLayoutInflater().inflate(2131492991, null);
    }

    public void a(String string, String string2) {
        if (!(l.trim().equals((Object)"") || l.trim().equals((Object)"PICKUP") || m.trim().equals((Object)"DESTINATION") || m.trim().equals((Object)""))) {
            if (ConfigurationManager.b(this.getContext()).equals((Object)"delhi")) {
                this.d.setVisibility(0);
                this.c.setVisibility(8);
            }
            Vector<g> vector = g.a((Object)this.i, string, string2, false);
            if (this.c.getChildCount() > 0) {
                this.c.removeAllViews();
            }
            if (vector != null) {
                int n2 = vector.size();
                if (n2 == 0) {
                    TableRow tableRow = (TableRow)this.i.getLayoutInflater().inflate(2131492992, null);
                    TextView textView = (TextView)tableRow.findViewById(2131296746);
                    textView.setText(2131755518);
                    textView.setTextSize(2, 19.0f);
                    textView.setTextColor(-1);
                    this.c.addView((View)tableRow);
                    return;
                }
                for (int i2 = 0; i2 < vector.size(); ++i2) {
                    g g2 = (g)vector.elementAt(i2);
                    String string3 = g2.a;
                    if (!string3.trim().equals((Object)"-")) {
                        if (string3.equals((Object)"GENERAL TICKET FARE")) {
                            string3 = "GENERAL TICKET FARE";
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("VIA: ");
                            stringBuilder.append(string3);
                            string3 = stringBuilder.toString();
                        }
                        this.c.addView((View)this.a(this.i, string3));
                    }
                    this.a(this.i, g2);
                    if (!ConfigurationManager.b(this.getContext()).equals((Object)"delhi")) continue;
                    this.f.setText((CharSequence)string3);
                }
            }
        } else {
            if (l.trim().equals((Object)"")) {
                n.d((Context)this.i, "Please enter source");
                return;
            }
            n.d((Context)this.i, "Please enter destination");
        }
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        switch (n2) {
            default: {
                return;
            }
            case 2: {
                if (n3 != -1) break;
                m = intent.getExtras().getString("destination_stn");
                m = m.toUpperCase();
                this.q.setText((CharSequence)com.mulo.a.d.c.a(m, com.mulo.a.d.c.a));
                this.q.setTextColor(-16777216);
                this.c.removeAllViews();
                if (!ConfigurationManager.b(this.getContext()).equals((Object)"delhi")) break;
                this.d.setVisibility(8);
                this.c.setVisibility(8);
                return;
            }
            case 1: {
                if (n3 != -1) break;
                l = intent.getExtras().getString("source_stn");
                l = l.toUpperCase();
                this.p.setText((CharSequence)com.mulo.a.d.c.a(l, com.mulo.a.d.c.a));
                this.p.setTextColor(-16777216);
                this.c.removeAllViews();
                if (!ConfigurationManager.b(this.getContext()).equals((Object)"delhi")) break;
                this.d.setVisibility(8);
                this.c.setVisibility(8);
            }
        }
    }

    public void onClick(View view) {
        String string;
        String string2;
        if (view == this.p) {
            Intent intent = new Intent(view.getContext(), SourceSelectUI.class);
            intent.putExtra("source_stn", n);
            this.startActivityForResult(intent, 1);
            return;
        }
        if (view == this.q) {
            Intent intent = new Intent(view.getContext(), DestinationSelectUI.class);
            intent.putExtra("destination_stn", o);
            this.startActivityForResult(intent, 2);
            return;
        }
        if (view == this.r && (string2 = l) != null && (string = m) != null) {
            this.a(string2, string);
        }
    }

    /*
     * Exception decompiling
     */
    public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
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

    public void onDestroy() {
        c.c(this.g);
        super.onDestroy();
    }

    public void onPause() {
        c.b(this.g);
        super.onPause();
    }

    public void onResume() {
        c.a(this.g);
        super.onResume();
    }

    public void setUserVisibleHint(boolean bl) {
        super.setUserVisibleHint(bl);
        if (bl) {
            this.j = true;
            this.b();
        }
    }
}

