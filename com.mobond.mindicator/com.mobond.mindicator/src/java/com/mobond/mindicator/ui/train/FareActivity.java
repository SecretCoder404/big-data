/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TableLayout
 *  android.widget.TableRow
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.train.DestinationSelectUI
 *  com.mobond.mindicator.ui.train.SourceSelectUI
 *  com.mulo.a.d.g
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
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.train.DestinationSelectUI;
import com.mobond.mindicator.ui.train.SourceSelectUI;
import com.mulo.a.d.g;
import java.util.Vector;

public class FareActivity
extends Activity
implements View.OnClickListener {
    private static String f = "";
    private static String g = "";
    private static int h;
    private static int i;
    SharedPreferences a;
    String b;
    TextView c;
    TableLayout d;
    View e;
    private Button j;
    private Button k;
    private Button l;

    private TableRow a(Context context, String string, String string2, String string3, String string4) {
        TableRow tableRow = (TableRow)this.getLayoutInflater().inflate(2131492993, null);
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
        return tableRow;
    }

    private TableRow a(Context context, String string, boolean bl) {
        TableRow tableRow = (TableRow)this.getLayoutInflater().inflate(2131492994, null);
        ((TextView)tableRow.findViewById(2131297474)).setText((CharSequence)string);
        return tableRow;
    }

    private void a(Context context, g g2) {
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
        this.d.addView((View)this.a((Context)this, "", "II", "I", "AC"));
        TableLayout tableLayout = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(string);
        String string4 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("");
        stringBuilder2.append(string2);
        String string5 = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("");
        stringBuilder3.append(string3);
        tableLayout.addView((View)this.a((Context)this, "Regular Ticket", string4, string5, stringBuilder3.toString()));
        if (g2.c != 0 || g2.d != 0 || g2.e != 0 || g2.f != 0 || g2.h != 0 || g2.i != 0 || g2.j != 0 || g2.k != 0 || g2.m != 0 || g2.n != 0 || g2.o != 0 || g2.p != 0) {
            TableLayout tableLayout2 = this.d;
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("");
            stringBuilder4.append(g2.c);
            String string6 = stringBuilder4.toString();
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("");
            stringBuilder5.append(g2.h);
            String string7 = stringBuilder5.toString();
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("");
            stringBuilder6.append(g2.m);
            tableLayout2.addView((View)this.a((Context)this, "1 Month  Pass", string6, string7, stringBuilder6.toString()));
            TableLayout tableLayout3 = this.d;
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append("");
            stringBuilder7.append(g2.d);
            String string8 = stringBuilder7.toString();
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append("");
            stringBuilder8.append(g2.i);
            String string9 = stringBuilder8.toString();
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append("");
            stringBuilder9.append(g2.n);
            tableLayout3.addView((View)this.a((Context)this, "3 Months Pass", string8, string9, stringBuilder9.toString()));
            TableLayout tableLayout4 = this.d;
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append("");
            stringBuilder10.append(g2.e);
            String string10 = stringBuilder10.toString();
            StringBuilder stringBuilder11 = new StringBuilder();
            stringBuilder11.append("");
            stringBuilder11.append(g2.j);
            String string11 = stringBuilder11.toString();
            StringBuilder stringBuilder12 = new StringBuilder();
            stringBuilder12.append("");
            stringBuilder12.append(g2.o);
            tableLayout4.addView((View)this.a((Context)this, "6 Months Pass", string10, string11, stringBuilder12.toString()));
            TableLayout tableLayout5 = this.d;
            StringBuilder stringBuilder13 = new StringBuilder();
            stringBuilder13.append("");
            stringBuilder13.append(g2.f);
            String string12 = stringBuilder13.toString();
            StringBuilder stringBuilder14 = new StringBuilder();
            stringBuilder14.append("");
            stringBuilder14.append(g2.k);
            String string13 = stringBuilder14.toString();
            StringBuilder stringBuilder15 = new StringBuilder();
            stringBuilder15.append("");
            stringBuilder15.append(g2.p);
            tableLayout5.addView((View)this.a((Context)this, "1 Year Pass", string12, string13, stringBuilder15.toString()));
        }
        if (g2.q != 0 || g2.r != 0) {
            TableLayout tableLayout6 = this.d;
            StringBuilder stringBuilder16 = new StringBuilder();
            stringBuilder16.append("");
            stringBuilder16.append(g2.q);
            tableLayout6.addView((View)this.a((Context)this, "1 Week Pass", "--", "--", stringBuilder16.toString()));
            TableLayout tableLayout7 = this.d;
            StringBuilder stringBuilder17 = new StringBuilder();
            stringBuilder17.append("");
            stringBuilder17.append(g2.r);
            tableLayout7.addView((View)this.a((Context)this, "2 Weeks Pass", "--", "--", stringBuilder17.toString()));
        }
        this.d.addView((View)this.a());
    }

    private void b() {
        final View view = this.findViewById(2131296343);
        view.post(new Runnable(){

            public void run() {
                FareActivity fareActivity = FareActivity.this;
                View view2 = view;
                fareActivity.e = c.a((Activity)fareActivity, view2, null, null, "ca-app-pub-5449278086868932/2673933872", "167101606757479_1235757153225247", view2.getWidth(), -1, 5, null);
            }
        });
    }

    public TableRow a() {
        return (TableRow)this.getLayoutInflater().inflate(2131492991, null);
    }

    public void a(String string, String string2) {
        if (!(f.trim().equals((Object)"") || f.trim().equals((Object)"PICKUP") || g.trim().equals((Object)"DESTINATION") || g.trim().equals((Object)""))) {
            Vector vector = g.a((Object)((Object)this), (String)string, (String)string2, (boolean)false);
            if (this.d.getChildCount() > 0) {
                this.d.removeAllViews();
            }
            if (vector != null) {
                int n2 = vector.size();
                if (n2 == 0) {
                    TableRow tableRow = (TableRow)this.getLayoutInflater().inflate(2131492992, null);
                    TextView textView = (TextView)tableRow.findViewById(2131296746);
                    textView.setText(2131755518);
                    textView.setTextSize(2, 19.0f);
                    textView.setTextColor(-1);
                    this.d.addView((View)tableRow);
                    return;
                }
                for (int i2 = 0; i2 < vector.size(); ++i2) {
                    g g2 = (g)vector.elementAt(i2);
                    String string3 = g2.a;
                    if (!string3.trim().equals((Object)"-")) {
                        String string4;
                        if (string3.equals((Object)"GENERAL TICKET FARE")) {
                            string4 = "GENERAL TICKET FARE";
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("VIA: ");
                            stringBuilder.append(string3);
                            string4 = stringBuilder.toString();
                        }
                        this.d.addView((View)this.a((Context)this, string4, true));
                    }
                    this.a((Context)this, g2);
                }
            }
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
                g = intent.getExtras().getString("destination_stn");
                g = g.toUpperCase();
                this.k.setText((CharSequence)g);
                this.k.setTextColor(-16777216);
                this.d.removeAllViews();
                return;
            }
            case 1: {
                if (n3 != -1) break;
                f = intent.getExtras().getString("source_stn");
                f = f.toUpperCase();
                this.j.setText((CharSequence)f);
                this.j.setTextColor(-16777216);
                this.d.removeAllViews();
            }
        }
    }

    public void onClick(View view) {
        String string;
        String string2;
        if (view == this.j) {
            Intent intent = new Intent(view.getContext(), SourceSelectUI.class);
            intent.putExtra("source_stn", h);
            this.startActivityForResult(intent, 1);
            return;
        }
        if (view == this.k) {
            Intent intent = new Intent(view.getContext(), DestinationSelectUI.class);
            intent.putExtra("destination_stn", i);
            this.startActivityForResult(intent, 2);
            return;
        }
        if (view == this.l && (string2 = f) != null && (string = g) != null) {
            this.a(string2, string);
        }
    }

    /*
     * Exception decompiling
     */
    protected void onCreate(Bundle var1) {
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

}

