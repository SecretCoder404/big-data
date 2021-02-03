/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.animation.Animation
 *  android.view.animation.RotateAnimation
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.Vector
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.chat.ChatScreenHSV;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.f;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.TraceTrainUI2;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mulo.a.d.h;
import com.mulo.a.d.k;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public class TrainsAtStationUI
extends f {
    public final int E = 0;
    public final int F = 1;
    public final int G = 2;
    public final int H = 3;
    com.mulo.a.d.a I = null;
    String J = null;
    boolean K = true;
    String L;
    String M;
    boolean N = false;
    b O;
    TextView P;
    TextView Q;
    TextView R;
    TextView S;
    TextView T;
    String U;
    ImageView V;
    ImageView W;
    Vector<d> X = new Vector();
    String Y;
    boolean Z = true;
    int aa;
    String ab = "#FFFFFF";
    String ac = "#8F8F8F";
    String ad;
    Activity ae;
    HashMap<String, Vector> af = new HashMap();
    boolean ag = false;
    Thread ah;
    public final int ai = 1000;
    boolean aj = false;
    RotateAnimation ak;

    public TrainsAtStationUI() {
        RotateAnimation rotateAnimation;
        this.ak = rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
    }

    public static void a(Activity activity) {
        d.a a2 = new d.a((Context)activity);
        a2.a(2131755526);
        a2.b(2131755515);
        a2.a(2131755397, new DialogInterface.OnClickListener(activity){
            final /* synthetic */ Activity a;
            {
                this.a = activity;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(ConfigurationManager.b((Context)this.a));
                stringBuilder.append("_");
                stringBuilder.append("alerts_content");
                String string = stringBuilder.toString();
                Intent intent = new Intent((Context)this.a, com.mobond.mindicator.ui.alert.News.class);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("type=");
                stringBuilder2.append(ConfigurationManager.b((Context)this.a));
                intent.putExtra("urlParameter", stringBuilder2.toString());
                intent.putExtra("alerttype", string);
                this.a.startActivity(intent);
            }
        });
        a2.b(2131755222, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        });
        a2.b().show();
    }

    public static void a(Activity activity, String string, String string2, String string3) {
        TrainsAtStationUI.a(activity, string, string2, string3, null);
    }

    public static void a(Activity activity, String string, String string2, String string3, String string4) {
        if (com.mulo.b.c.a(activity)) {
            Intent intent = new Intent((Context)activity, ChatScreenHSV.class);
            intent.putExtra("CHATROOMKEY", string);
            intent.putExtra("TRAINTITLE", string2);
            intent.putExtra("CHATTYPE", "CT");
            intent.putExtra("alerttype", string3);
            if (string4 != null) {
                intent.putExtra("FIRE_DB_URL_KEY", string4);
            }
            activity.startActivity(intent);
        }
    }

    static /* synthetic */ void a(TrainsAtStationUI trainsAtStationUI) {
        trainsAtStationUI.w();
    }

    static /* synthetic */ void a(TrainsAtStationUI trainsAtStationUI, String string) {
        trainsAtStationUI.f(string);
    }

    static /* synthetic */ void a(TrainsAtStationUI trainsAtStationUI, String string, String string2, boolean bl) {
        trainsAtStationUI.a(string, string2, bl);
    }

    private void a(String string, String string2, boolean bl) {
        this.o();
        com.mobond.mindicator.ui.lt.trainutils.a.b(string, string2, new com.mulo.b.a(this, bl){
            final /* synthetic */ boolean a;
            final /* synthetic */ TrainsAtStationUI b;
            {
                this.b = trainsAtStationUI;
                this.a = bl;
            }

            public void a() {
                this.b.n();
                if (this.a) {
                    n.d((Context)this.b, "No Internet");
                }
            }

            public void a(byte[] arrby, byte[] arrby2, Object object) {
                String string = new String(arrby);
                this.b.n();
                TrainsAtStationUI.a(this.b, string);
            }
        }, this.m());
    }

    public static boolean a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("dialogpref", 0);
        String string = sharedPreferences.getString("date", null);
        Calendar calendar = Calendar.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(calendar.get(5));
        stringBuilder.append("/");
        stringBuilder.append(calendar.get(2));
        stringBuilder.append("/");
        stringBuilder.append(calendar.get(1));
        String string2 = stringBuilder.toString();
        if (string != null && string.equals((Object)string2)) {
            return true;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("date", string2);
        editor.apply();
        return false;
    }

    static /* synthetic */ void b(TrainsAtStationUI trainsAtStationUI) {
        trainsAtStationUI.u();
    }

    static /* synthetic */ void c(TrainsAtStationUI trainsAtStationUI) {
        trainsAtStationUI.r();
    }

    public static String d(String string) {
        return new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(new SimpleDateFormat("hh:mma", Locale.ENGLISH).parse(string.trim()));
    }

    private void f(String string) {
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator iterator = jSONObject.keys();
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    String string3 = jSONObject.getString(string2);
                    this.A.put((Object)string2, (Object)string3);
                }
                if (this.m.getAdapter() != null) {
                    ((ArrayAdapter)this.m.getAdapter()).notifyDataSetChanged();
                }
                if (this.aj) {
                    this.setNextArrivingList(null);
                    return;
                }
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
    }

    public static boolean j() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(7) == 1 && calendar.get(11) < 17;
    }

    private void o() {
        this.ak.setDuration(1000L);
        this.ak.setRepeatCount(-1);
        this.z.startAnimation((Animation)this.ak);
    }

    private void p() {
        if (this.Z) {
            this.r();
            if (this.ag) {
                this.ag = false;
                this.q();
            } else {
                this.a(this.U, this.Y, false);
            }
            this.z.b();
            this.z.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ TrainsAtStationUI a;
                {
                    this.a = trainsAtStationUI;
                }

                public void onClick(View view) {
                    TrainsAtStationUI.c(this.a);
                    TrainsAtStationUI trainsAtStationUI = this.a;
                    TrainsAtStationUI.a(trainsAtStationUI, trainsAtStationUI.U, this.a.Y, true);
                }
            });
            return;
        }
        this.z.c();
        this.t();
    }

    private void q() {
        this.ah = new Thread(this){
            final /* synthetic */ TrainsAtStationUI a;
            {
                this.a = trainsAtStationUI;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void run() {
                Throwable throwable2222;
                9.sleep((long)1000L);
                this.a.runOnUiThread(new java.lang.Runnable(this){
                    final /* synthetic */ 9 a;
                    {
                        this.a = var1_1;
                    }

                    public void run() {
                        TrainsAtStationUI.a(this.a.a, this.a.a.U, this.a.a.Y, false);
                    }
                });
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (java.lang.InterruptedException interruptedException) {}
                    {
                        interruptedException.printStackTrace();
                        return;
                    }
                }
                this.a.runOnUiThread(new /* invalid duplicate definition of identical inner class */);
                throw throwable2222;
            }
        };
        this.ah.start();
    }

    private void r() {
        if (!com.mulo.b.c.a((Context)this) && this.Z) {
            this.s();
            return;
        }
        this.t();
    }

    private void s() {
        if (this.Z) {
            ((TextView)this.findViewById(2131296890)).setVisibility(0);
            return;
        }
        ((TextView)this.findViewById(2131296890)).setVisibility(8);
    }

    private void t() {
        ((TextView)this.findViewById(2131296890)).setVisibility(8);
    }

    private void u() {
        String string = this.v();
        StringBuffer stringBuffer = new StringBuffer(this.O.n(this.L));
        int n2 = stringBuffer.indexOf(string);
        int n3 = n2 + string.length();
        if (n2 != -1 && n3 != -1) {
            stringBuffer.delete(n2, n3);
            String string2 = stringBuffer.toString();
            this.O.d(this.L, string2);
        }
    }

    private String v() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.U);
        stringBuilder.append(":");
        stringBuilder.append(this.M);
        stringBuilder.append(":");
        stringBuilder.append(this.Y);
        stringBuilder.append(":");
        stringBuilder.append(this.aa);
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    private void w() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl94 : RETURN : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void x() {
        if (this.M == null) return;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.U);
        stringBuilder.append(";");
        String string = stringBuilder.toString();
        String string2 = this.O.l(this.L);
        if (string2.contains((CharSequence)string)) return;
        String[] arrstring = string2.split(";");
        if (arrstring.length < 2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append(string2);
            String string3 = stringBuilder2.toString();
            this.O.c(this.L, string3);
            return;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string);
        int n2 = 0;
        do {
            if (n2 >= -1 + arrstring.length) break;
            stringBuilder3.append(arrstring[n2]);
            stringBuilder3.append(";");
            ++n2;
        } while (true);
        try {
            String string4 = stringBuilder3.toString();
            this.O.c(this.L, string4);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"TrainHistory", (String)"TrainHistory 888:", (Throwable)exception);
            this.O.m(this.L);
        }
    }

    private void y() {
        String string = this.M;
        if (string != null) {
            String[] arrstring = string.split("/");
            this.af.clear();
            String string2 = this.U;
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string3 = k.b(arrstring[i2].split("-")[0]);
                if (arrstring[i2].equalsIgnoreCase("CSMT-Harbour")) {
                    string2 = "TILAKNAGAR";
                } else if (arrstring[i2].equalsIgnoreCase("CSMT-Central")) {
                    string2 = "VIDYAVIHAR";
                }
                Vector vector = new Vector();
                ArrayList<String> arrayList = com.mobond.mindicator.util.c.b(string2, string3);
                if (arrayList.size() > 0) {
                    vector.addAll(arrayList);
                }
                this.af.put((Object)string3, (Object)vector);
            }
        }
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        this.ag = true;
        d d2 = this.c(n2);
        Intent intent = new Intent(view.getContext(), TraceTrainUI2.class);
        intent.putExtra("selected_route", this.getIntent().getExtras().getString("selected_route"));
        intent.putExtra("you_are_at", this.getIntent().getExtras().getString("you_are_at"));
        intent.putExtra("selected_train_string", d2.p);
        intent.putExtra("tabular_timing_ui", "false");
        intent.putExtra("tn", d2.s);
        intent.putExtra("selected_direction", this.aa);
        intent.putExtra("extra_dr", (Parcelable)d2);
        intent.putExtra("isTrainAlert", this.B);
        intent.putExtra("extra_rsp", this.getIntent().getStringExtra("extra_rsp"));
        if (d2.y) {
            intent.putExtra("IS_BLOCK_ARE_YOU_INSIDE", true);
        }
        this.startActivityForResult(intent, 0);
        this.B = false;
    }

    public void d(int n2) {
        this.a.clear();
        int n3 = 0;
        for (int i2 = 0; i2 < this.X.size(); ++i2) {
            d d2 = (d)this.X.elementAt(i2);
            boolean bl = n2 == 0 ? d2.o == 1 : (n2 == 1 ? d2.o == 2 : (n2 == 3 ? d2.c.contains((CharSequence)"AC ") || d2.c.startsWith("AC") : n2 == 2));
            if (bl) {
                this.a.add((Object)d2);
            }
            if (i2 != this.I.b) continue;
            n3 = this.a.size() - 1 >= 0 ? this.a.size() - 1 : 0;
        }
        this.a(this.Z, true);
        this.b = n3;
        this.a(this.b);
        if (this.e.getVisibility() == 0) {
            this.h.performClick();
        }
        this.d();
        this.e();
        this.c();
        TextView textView = (TextView)this.findViewById(2131296712);
        if (this.a.isEmpty()) {
            if (n2 == 0) {
                textView.setText((CharSequence)"No slow trains are available.");
            } else if (n2 == 1) {
                textView.setText((CharSequence)"No fast trains are available.");
            } else {
                textView.setText((CharSequence)"No trains are available.");
            }
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(4);
    }

    public void e(String string) {
        String string2 = string.equalsIgnoreCase("T") ? "TRANSHARBOUR" : (string.equalsIgnoreCase("U") ? "URAN" : (string.equalsIgnoreCase("H") ? "HARBOUR" : (string.equalsIgnoreCase("W") ? "WESTERN" : (string.equalsIgnoreCase("C") ? "CENTRAL" : "-"))));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LINE_");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        int n2 = this.O.a(string3, 0);
        if (!string2.equals((Object)"-")) {
            if (n2 <= 5) {
                int n3 = n2 + 1;
                this.O.b(string3, n3);
                return;
            }
            com.mobond.mindicator.fcm.b.a(string2);
        }
    }

    public void n() {
        this.z.clearAnimation();
    }

    public void onBackPressed() {
        boolean bl = this.getIntent().getBooleanExtra("from_notif", false);
        boolean bl2 = this.getIntent().getBooleanExtra("isTrainAlert", false);
        if (!bl && !bl2 && b.c()) {
            c.b();
        }
        super.onBackPressed();
    }

    public void onClickAcTrains(View view) {
        this.aj = false;
        this.P.setTextColor(Color.parseColor((String)this.ac));
        this.P.setTypeface(Typeface.DEFAULT);
        this.Q.setTextColor(Color.parseColor((String)this.ac));
        this.Q.setTypeface(Typeface.DEFAULT);
        this.R.setTextColor(Color.parseColor((String)this.ab));
        this.R.setTypeface(Typeface.DEFAULT_BOLD);
        this.S.setTextColor(Color.parseColor((String)this.ac));
        this.S.setTypeface(Typeface.DEFAULT);
        this.T.setTextColor(Color.parseColor((String)this.ac));
        this.T.setTypeface(Typeface.DEFAULT);
        n.a((Activity)this, "AC trains");
        this.d(3);
    }

    public void onClickAllTrains(View view) {
        this.aj = false;
        this.P.setTextColor(Color.parseColor((String)this.ac));
        this.P.setTypeface(Typeface.DEFAULT);
        this.Q.setTextColor(Color.parseColor((String)this.ac));
        this.Q.setTypeface(Typeface.DEFAULT);
        this.R.setTextColor(Color.parseColor((String)this.ac));
        this.R.setTypeface(Typeface.DEFAULT);
        this.T.setTextColor(Color.parseColor((String)this.ac));
        this.T.setTypeface(Typeface.DEFAULT);
        this.S.setTextColor(Color.parseColor((String)this.ab));
        this.S.setTypeface(Typeface.DEFAULT_BOLD);
        if (view != null) {
            n.a((Activity)this, "All trains");
        }
        this.d(2);
    }

    public void onClickFastTrains(View view) {
        this.aj = false;
        this.P.setTextColor(Color.parseColor((String)this.ac));
        this.P.setTypeface(Typeface.DEFAULT);
        this.Q.setTextColor(Color.parseColor((String)this.ab));
        this.Q.setTypeface(Typeface.DEFAULT_BOLD);
        this.R.setTextColor(Color.parseColor((String)this.ac));
        this.R.setTypeface(Typeface.DEFAULT);
        this.S.setTextColor(Color.parseColor((String)this.ac));
        this.S.setTypeface(Typeface.DEFAULT);
        this.T.setTextColor(Color.parseColor((String)this.ac));
        this.T.setTypeface(Typeface.DEFAULT);
        n.a((Activity)this, "Fast trains");
        this.d(1);
    }

    public void onClickSlowTrains(View view) {
        this.aj = false;
        this.P.setTextColor(Color.parseColor((String)this.ab));
        this.P.setTypeface(Typeface.DEFAULT_BOLD);
        this.Q.setTextColor(Color.parseColor((String)this.ac));
        this.Q.setTypeface(Typeface.DEFAULT);
        this.R.setTextColor(Color.parseColor((String)this.ac));
        this.R.setTypeface(Typeface.DEFAULT);
        this.S.setTextColor(Color.parseColor((String)this.ac));
        this.S.setTypeface(Typeface.DEFAULT);
        this.T.setTextColor(Color.parseColor((String)this.ac));
        this.T.setTypeface(Typeface.DEFAULT);
        n.a((Activity)this, "Slow trains");
        this.d(0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void onCreate(Bundle var1_1) {
        block32 : {
            block35 : {
                block34 : {
                    this.U = this.getIntent().getExtras().getString("you_are_at");
                    a.a((Activity)this).b("selected_station", this.U);
                    this.a("ca-app-pub-5449278086868932/5581795649", "167101606757479_1239838539483775", "ca-app-pub-5449278086868932/5808553047", "167101606757479_1235757986558497", 3);
                    super.onCreate(var1_1);
                    this.ae = this;
                    var2_2 = new StringBuilder();
                    var2_2.append(ConfigurationManager.b((Context)this));
                    var2_2.append("_");
                    var2_2.append("alerts_content");
                    this.ad = var2_2.toString();
                    if (TrainsAtStationUI.j() && !TrainsAtStationUI.a((Context)this)) {
                        TrainsAtStationUI.a((Activity)this);
                    }
                    this.P = (TextView)this.findViewById(2131297381);
                    this.T = (TextView)this.findViewById(2131297033);
                    this.Q = (TextView)this.findViewById(2131296753);
                    this.R = (TextView)this.findViewById(2131296320);
                    this.S = (TextView)this.findViewById(2131296377);
                    this.O = a.a((Activity)this);
                    this.m = (ListView)this.findViewById(2131296933);
                    this.z = (FloatingActionButton)this.findViewById(2131296759);
                    try {
                        this.L = ConfigurationManager.b(this.getApplicationContext());
                        this.C = this.getIntent().getStringExtra("tn");
                        this.Y = this.getIntent().getExtras().getString("selected_route");
                        this.z = (FloatingActionButton)this.findViewById(2131296759);
                        if (this.Y == null || this.Y.equals((Object)"MONO1") || this.Y.equals((Object)"MM1WD") || this.L.equals((Object)"delhi")) {
                            this.Z = false;
                            this.z.c();
                        }
                        if (this.Y != null) {
                            if (!this.Y.equals((Object)"W") && !this.Y.equals((Object)"T")) {
                                this.R.setVisibility(8);
                            } else {
                                this.R.setVisibility(0);
                            }
                        }
                        var8_3 = this.Y;
                        var9_4 = 1;
                        if (var8_3 != null && (this.Y.equals((Object)"W") || this.Y.equals((Object)"C") || this.Y.equals((Object)"H") || this.Y.equals((Object)"T") || this.Y.equals((Object)"U"))) {
                            ((LinearLayout)this.findViewById(2131297379)).setVisibility(0);
                            this.findViewById(2131297380).setVisibility(0);
                            this.k = var9_4;
                        }
                        if (this.Y.equals((Object)"MM1WD")) {
                            n.c((Context)this, "Metro timings are tentative. Frequency is 4 min in peak hrs & 8 min in non peak hrs.");
                        }
                        this.M = this.getIntent().getExtras().getString("selected_direction_end_stations");
                        this.aa = this.getIntent().getExtras().getInt("selected_direction");
                        this.N = this.getIntent().getBooleanExtra("iscallfromfav", false);
                        this.J = this.U;
                        var10_5 = this.getIntent().getStringExtra("selected_time");
                        var11_6 = Calendar.getInstance();
                        if (var10_5 != null) {
                            var12_7 = TrainsAtStationUI.d(var10_5).split(":");
                            var11_6.set(11, Integer.parseInt((String)var12_7[0].trim()));
                            var11_6.set(12, Integer.parseInt((String)var12_7[var9_4].trim()));
                        }
                        this.I = h.a(this.Y, this.aa, this.U, var11_6, false, this.M, this);
                        if (!this.K) ** GOTO lbl100
                        for (var13_8 = 0; var13_8 < this.I.a.length; ++var13_8) {
                            var14_9 = new d();
                            var14_9.b = this.I.a[var13_8].substring(0, this.I.a[var13_8].indexOf(35));
                            var15_10 = (String)this.I.e.get(var13_8);
                            (String)this.I.f.get(var13_8);
                            var14_9.s = (String)this.I.h.get(var13_8);
                            var14_9.q = var15_10;
                            var14_9.c = h.b(this.Y, this.I.a[var13_8], this.U, this);
                            if (var14_9.c.contains((CharSequence)"#E#")) {
                                var14_9.r = var9_4;
                                var14_9.c = var14_9.c.replace((CharSequence)"#E#", (CharSequence)"").trim();
                            } else if (var14_9.c.contains((CharSequence)"#E-BO#")) {
                                if (this.U.equals((Object)"BORIVALI")) {
                                    var14_9.r = var9_4;
                                }
                                var14_9.c = var14_9.c.replace((CharSequence)"#E-BO#", (CharSequence)"").trim();
                            }
                            var14_9.a();
                            var14_9.p = this.I.a[var13_8];
                            this.a.add((Object)var14_9);
                            this.X.add((Object)var14_9);
                        }
                        var19_11 = (TextView)this.findViewById(2131296712);
                        if (!this.a.isEmpty()) {
                            var19_11.setVisibility(8);
                        } else {
                            var19_11.setVisibility(0);
                            var19_11.setText((CharSequence)"No trains are available.");
                        }
                        this.a(this.Z, (boolean)var9_4);
                        this.g.setOnClickListener(new View.OnClickListener(this){
                            final /* synthetic */ TrainsAtStationUI a;
                            {
                                this.a = trainsAtStationUI;
                            }

                            public void onClick(View view) {
                                androidx.appcompat.widget.ak ak2 = new androidx.appcompat.widget.ak((Context)this.a.ae, view, 8388613);
                                ak2.b().inflate(2131558401, ak2.a());
                                ak2.a().add((CharSequence)com.mulo.a.d.c.a(this.a.U.toUpperCase(), com.mulo.a.d.c.a));
                                for (int i2 = 0; i2 < this.a.I.g.size(); ++i2) {
                                    ak2.a().add((CharSequence)this.a.I.g.get(i2));
                                }
                                ak2.a(new androidx.appcompat.widget.ak$b(this){
                                    final /* synthetic */ 4 a;
                                    {
                                        this.a = var1_1;
                                    }

                                    public boolean a(android.view.MenuItem menuItem) {
                                        this.a.a.onClickAllTrains(null);
                                        this.a.a.b(menuItem.getTitle().toString());
                                        this.a.a.a(menuItem.getTitle().toString());
                                        return true;
                                    }
                                });
                                ak2.c();
                            }
                        });
                        this.i.setOnClickListener(new View.OnClickListener(this){
                            final /* synthetic */ TrainsAtStationUI a;
                            {
                                this.a = trainsAtStationUI;
                            }

                            public void onClick(View view) {
                                Intent intent = new Intent(view.getContext(), com.mobond.mindicator.ui.train.StationMap.class);
                                intent.putExtra("Station Map", this.a.U);
                                this.a.startActivity(intent);
                            }
                        });
                        if (!this.Y.equals((Object)"MM1WD") && !this.Y.equals((Object)"MONO1")) {
                            this.b();
                            this.d();
                            this.e();
                        }
                        this.c = var9_4;
                        var20_12 = this.getIntent().getExtras().getString("selected_train_time");
                        if (var20_12 != null) {
                            var21_13 = 0;
                            break block32;
                        }
                        if (this.I.b != 0) {
                            this.a(this.I.b - var9_4);
                        } else {
                            this.a(this.I.b);
                        }
                        this.b = this.I.b;
lbl98: // 3 sources:
                        do {
                            this.c(com.mulo.a.d.c.a(this.U, com.mulo.a.d.c.a));
lbl100: // 2 sources:
                            this.P.setTextColor(Color.parseColor((String)this.ac));
                            this.P.setTypeface(Typeface.DEFAULT);
                            this.Q.setTextColor(Color.parseColor((String)this.ac));
                            this.Q.setTypeface(Typeface.DEFAULT);
                            this.R.setTextColor(Color.parseColor((String)this.ac));
                            this.R.setTypeface(Typeface.DEFAULT);
                            this.T.setTextColor(Color.parseColor((String)this.ac));
                            this.T.setTypeface(Typeface.DEFAULT);
                            this.S.setTextColor(Color.parseColor((String)this.ab));
                            this.S.setTypeface(Typeface.DEFAULT_BOLD);
                            this.x();
                            if (!this.N && !this.O.n(this.L).contains((CharSequence)this.v())) break;
                            break block34;
                            break;
                        } while (true);
                    }
                    catch (Exception var6_14) {
                        Log.d((String)"TrainHistory", (String)"TrainHistory 999:", (Throwable)var6_14);
                        if (this.N) {
                            this.O.m(this.L);
                            this.O.o(this.L);
                        }
                        break block35;
                    }
                    var9_4 = 0;
                }
                this.V = (ImageView)this.findViewById(2131296754);
                this.V.setVisibility(0);
                this.V.setTag((Object)"off");
                if (var9_4 != 0) {
                    this.V.setTag((Object)"on");
                    this.V.setImageResource(2131230986);
                } else {
                    this.V.setTag((Object)"off");
                    this.V.setImageResource(2131230985);
                }
                this.V.setOnClickListener(new View.OnClickListener(this){
                    final /* synthetic */ TrainsAtStationUI a;
                    {
                        this.a = trainsAtStationUI;
                    }

                    public void onClick(View view) {
                        if (this.a.V.getTag().equals((Object)"off")) {
                            this.a.V.setTag((Object)"on");
                            this.a.V.setImageResource(2131230986);
                            n.c((Context)this.a.ae, "Added in favorite routes");
                            TrainsAtStationUI.a(this.a);
                            return;
                        }
                        if (this.a.V.getTag().equals((Object)"on")) {
                            this.a.V.setTag((Object)"off");
                            this.a.V.setImageResource(2131230985);
                            TrainsAtStationUI.b(this.a);
                            n.d((Context)this.a.ae, "Removed from favorites");
                        }
                    }
                });
                this.W = (ImageView)this.findViewById(2131297509);
                if (this.Y != null && (this.Y.equals((Object)"W") || this.Y.equals((Object)"C") || this.Y.equals((Object)"H") || this.Y.equals((Object)"T") || this.Y.equals((Object)"U") || this.Y.equals((Object)"P"))) {
                    this.W.setImageResource(2131230874);
                    this.W.setVisibility(0);
                    this.W.setOnClickListener(new View.OnClickListener(this){
                        final /* synthetic */ TrainsAtStationUI a;
                        {
                            this.a = trainsAtStationUI;
                        }

                        /*
                         * Unable to fully structure code
                         * Enabled aggressive block sorting
                         * Lifted jumps to return sites
                         */
                        public void onClick(View var1_1) {
                            block20 : {
                                block16 : {
                                    block17 : {
                                        block18 : {
                                            block19 : {
                                                var2_2 = this.a.Y;
                                                var3_3 = var2_2.hashCode();
                                                if (var3_3 == 67) break block16;
                                                if (var3_3 == 72) break block17;
                                                if (var3_3 == 80) break block18;
                                                if (var3_3 == 87) break block19;
                                                switch (var3_3) {
                                                    default: {
                                                        ** GOTO lbl-1000
                                                    }
                                                    case 85: {
                                                        if (var2_2.equals((Object)"U")) {
                                                            var4_4 = 4;
                                                            ** break;
                                                        }
                                                        ** GOTO lbl-1000
                                                    }
                                                    case 84: {
                                                        if (var2_2.equals((Object)"T")) {
                                                            var4_4 = 3;
                                                            ** break;
                                                        }
                                                        ** GOTO lbl-1000
lbl20: // 2 sources:
                                                        break;
                                                    }
                                                }
                                                break block20;
                                            }
                                            if (!var2_2.equals((Object)"W")) ** GOTO lbl-1000
                                            var4_4 = 0;
                                            break block20;
                                        }
                                        if (!var2_2.equals((Object)"P")) ** GOTO lbl-1000
                                        var4_4 = 5;
                                        break block20;
                                    }
                                    if (!var2_2.equals((Object)"H")) ** GOTO lbl-1000
                                    var4_4 = 2;
                                    break block20;
                                }
                                if (var2_2.equals((Object)"C")) {
                                    var4_4 = 1;
                                } else lbl-1000: // 7 sources:
                                {
                                    var4_4 = -1;
                                }
                            }
                            switch (var4_4) {
                                default: {
                                    return;
                                }
                                case 5: {
                                    TrainsAtStationUI.a(this.a.ae, "LONAVALA-PUNE LINE", "", this.a.ad);
                                    return;
                                }
                                case 4: {
                                    TrainsAtStationUI.a(this.a.ae, com.mobond.mindicator.ui.multicity.a.a[4], "", this.a.ad);
                                    return;
                                }
                                case 3: {
                                    TrainsAtStationUI.a(this.a.ae, com.mobond.mindicator.ui.multicity.a.a[3], "", this.a.ad);
                                    return;
                                }
                                case 2: {
                                    TrainsAtStationUI.a(this.a.ae, com.mobond.mindicator.ui.multicity.a.a[2], "", this.a.ad);
                                    return;
                                }
                                case 1: {
                                    TrainsAtStationUI.a(this.a.ae, com.mobond.mindicator.ui.multicity.a.a[1], "", this.a.ad);
                                    return;
                                }
                                case 0: 
                            }
                            TrainsAtStationUI.a(this.a.ae, com.mobond.mindicator.ui.multicity.a.a[0], "", this.a.ad);
                        }
                    });
                } else {
                    this.W.setVisibility(8);
                }
                this.e(this.Y);
            }
            this.y();
            return;
        }
        do {
            if (var21_13 >= this.I.a.length) ** GOTO lbl98
            if (this.I.a[var21_13].startsWith(var20_12)) {
                if (var21_13 != 0) {
                    this.a(var21_13 - 1);
                } else {
                    this.a(var21_13);
                }
                this.b = var21_13;
                ** continue;
            }
            ++var21_13;
        } while (true);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void onPause() {
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

    @Override
    public void onResume() {
        super.onResume();
        this.p();
    }

    protected void onStart() {
        super.onStart();
        if (!this.K) {
            this.finish();
        }
        boolean bl = this.getIntent().getBooleanExtra("from_notif", false);
        boolean bl2 = this.getIntent().getBooleanExtra("isTrainAlert", false);
        if (bl || bl2) {
            c.c((Context)this);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void setNextArrivingList(View var1_1) {
        if (var1_1 != null) {
            TraceTrainUI2.a((Context)this.ae, "NEXTARRIVING");
        }
        var2_2 = 1;
        this.aj = var2_2;
        this.P.setTextColor(Color.parseColor((String)this.ac));
        this.P.setTypeface(Typeface.DEFAULT);
        this.Q.setTextColor(Color.parseColor((String)this.ac));
        this.Q.setTypeface(Typeface.DEFAULT);
        this.R.setTextColor(Color.parseColor((String)this.ac));
        this.R.setTypeface(Typeface.DEFAULT);
        this.S.setTextColor(Color.parseColor((String)this.ac));
        this.S.setTypeface(Typeface.DEFAULT);
        this.T.setTextColor(Color.parseColor((String)this.ab));
        this.T.setTypeface(Typeface.DEFAULT_BOLD);
        n.a((Activity)this, "Next Arriving trains");
        try {
            this.a.clear();
            var4_3 = this.U.split(" ")[0];
            var5_4 = 0;
        }
        catch (Exception v0) {
            var3_33 = (TextView)this.findViewById(2131296712);
            var3_33.setText((CharSequence)"Something went wrong!");
            var3_33.setVisibility(0);
            return;
        }
        block2 : do {
            block23 : {
                block24 : {
                    block22 : {
                        block21 : {
                            block20 : {
                                if (var5_4 >= this.X.size()) break block20;
                                var9_5 = (d)this.X.elementAt(var5_4);
                                var10_6 = var9_5.s;
                                if (!this.A.containsKey((Object)var10_6)) ** GOTO lbl116
                                var11_7 = (String)this.A.get((Object)var10_6);
                                var12_8 = var11_7.substring(var2_2 + var11_7.indexOf("["), var11_7.indexOf("]")).trim();
                                var13_9 = var12_8.equals((Object)"Just Now") ? 0 : Integer.parseInt((String)var12_8.split(" ")[0]);
                                break block21;
                            }
                            var6_31 = new Comparator<d>(this){
                                final /* synthetic */ TrainsAtStationUI a;
                                {
                                    this.a = trainsAtStationUI;
                                }

                                public int a(d d2, d d3) {
                                    if (d2.A == d3.A) {
                                        if (d2.B >= d3.B) {
                                            return 1;
                                        }
                                        return -1;
                                    }
                                    if (d2.A >= d3.A) {
                                        return 1;
                                    }
                                    return -1;
                                }

                                public /* synthetic */ int compare(Object object, Object object2) {
                                    return this.a((d)object, (d)object2);
                                }
                            };
                            Collections.sort((List)this.a, (Comparator)var6_31);
                            this.a(this.Z, false);
                            this.b = 0;
                            this.a(this.b);
                            if (this.e.getVisibility() == 0) {
                                this.h.performClick();
                            }
                            this.d();
                            this.e();
                            this.c();
                            var7_32 = (TextView)this.findViewById(2131296712);
                            if (this.a.isEmpty()) {
                                var7_32.setText((CharSequence)"Can't find next arriving trains.");
                                var7_32.setVisibility(0);
                                return;
                            }
                            var7_32.setVisibility(4);
                            return;
                        }
                        var14_10 = 2;
                        if (var13_9 > var14_10) ** GOTO lbl116
                        var15_11 = var11_7.substring(var2_2 + var11_7.indexOf("]")).trim().split(" ")[0];
                        var16_12 = var11_7.substring(var2_2 + var11_7.indexOf("]")).trim();
                        if (!var15_11.equals((Object)"Between")) break block22;
                        var16_12 = var16_12.split("-")[var2_2].trim().split(",")[0].split(" ")[0];
                        break block23;
                    }
                    if (var15_11.equals((Object)"Crossed")) break block24;
                    if (var15_11.equals((Object)"Arriving")) {
                        var16_12 = var16_12.split(" ")[var2_2].replace((CharSequence)",", (CharSequence)"");
                        var14_10 = 1;
                    } else if (var15_11.equals((Object)"At")) {
                        var16_12 = var16_12.split(" ")[var2_2].replace((CharSequence)",", (CharSequence)"");
                        var14_10 = 0;
                    } else {
                        var14_10 = 0;
                    }
                    break block23;
                }
                var28_23 = var16_12.split(" ")[var2_2];
                var29_24 = this.af.entrySet().iterator();
                var30_25 = null;
                var31_26 = false;
                do {
                    block26 : {
                        block25 : {
                            if (!var29_24.hasNext()) break block25;
                            var32_27 = (Vector)((Map.Entry)var29_24.next()).getValue();
                            var33_28 = var31_26;
                            break block26;
                        }
                        if (var31_26 && var30_25 != null) {
                            var16_12 = var30_25;
                            var14_10 = 3;
                            break;
                        }
                        ** GOTO lbl116
                    }
                    for (var34_29 = 0; var34_29 < var32_27.size(); ++var34_29) {
                        var35_30 = ((String)var32_27.get(var34_29)).split(" ")[0];
                        if (var28_23.equals((Object)var35_30) && var34_29 < var32_27.size() - var2_2) {
                            var30_25 = ((String)var32_27.get(var34_29 + 1)).split(" ")[0];
                        }
                        if (!var4_3.equals((Object)var35_30)) continue;
                        var33_28 = true;
                    }
                    var31_26 = var33_28;
                } while (true);
            }
            var17_13 = var16_12.trim();
            var18_14 = this.af.entrySet().iterator();
            var19_15 = -1;
            var20_16 = -1;
            do {
                if (!var18_14.hasNext()) ** GOTO lbl-1000
                var22_17 = (Map.Entry)var18_14.next();
                if (var19_15 == -1 || var20_16 == -1) {
                    var23_18 = (Vector)var22_17.getValue();
                    var25_20 = -1;
                    var26_21 = -1;
                } else lbl-1000: // 2 sources:
                {
                    if (var19_15 != -1 && var20_16 != -1 && var20_16 <= var19_15) {
                        var9_5.A = var19_15 - var20_16;
                        var9_5.B = var14_10;
                        this.a.add((Object)var9_5);
                    }
lbl116: // 6 sources:
                    ++var5_4;
                    var2_2 = 1;
                    continue block2;
                }
                for (var24_19 = 0; var24_19 < var23_18.size() && (var25_20 == -1 || var26_21 == -1); ++var24_19) {
                    var27_22 = ((String)var23_18.get(var24_19)).split(" ")[0];
                    if (var27_22.equals((Object)var4_3)) {
                        var25_20 = var24_19;
                    }
                    if (!var27_22.equals((Object)var17_13)) continue;
                    var26_21 = var24_19;
                }
                var19_15 = var25_20;
                var20_16 = var26_21;
            } while (true);
            break;
        } while (true);
    }
}

