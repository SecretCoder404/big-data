/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  androidx.appcompat.app.e
 *  java.io.IOException
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Hashtable
 *  java.util.Locale
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.msrtc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.FeedbackUI;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.msrtc.BusList;
import com.mobond.mindicator.ui.msrtc.MsrtcAcServices;
import com.mobond.mindicator.ui.msrtc.MsrtcMainActivity;
import com.mobond.mindicator.ui.msrtc.MsrtcSourceSearchUI;
import com.mobond.mindicator.util.h;
import com.mulo.b.e;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class MsrtcMainActivity
extends androidx.appcompat.app.e
implements View.OnClickListener {
    private static short W = 0;
    public static com.mobond.mindicator.d a;
    public static String b = "marathi";
    public static ArrayList<d> c;
    public static Hashtable<String, Short> d;
    static Dialog e;
    LinearLayout A;
    LinearLayout B;
    LinearLayout C;
    LinearLayout D;
    boolean E = false;
    boolean F = false;
    com.mobond.mindicator.b G;
    String H;
    int I = 0;
    TextView J;
    TextView K;
    RelativeLayout L;
    Locale M;
    CheckBox N;
    RelativeLayout O;
    RelativeLayout P;
    RelativeLayout Q;
    TextView R;
    int S;
    String T;
    TextView U;
    Activity V;
    private View X;
    TextView f;
    TextView g;
    TextView h;
    Button i;
    Vector<com.mulo.a.c.c> j;
    String k;
    String l;
    String m;
    String n;
    int o = -1;
    int p;
    int q = 1;
    int r = 2;
    short s;
    short t;
    short u = (short)-1;
    ImageView v;
    ImageView w;
    ImageView x;
    int y = 0;
    ScrollView z;

    static {
        c = new ArrayList();
        d = new Hashtable();
        W = 0;
    }

    public static void a(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll((Collection)Arrays.asList((Object[])new String[]{"AHMEDNAGAR#AHMEDNAGAR#AHMEDNAGAR", "AKOLA#AKOLA#AKOLA", "AMRAVATI#AMRAVATI#AMRAVATI", "AURANGABAD#AURANGABAD#AURANGABAD", "BEED#BEED#BEED", "BHANDARA#BHANDARA#BHANDARA", "BULDHANA#BULDHANA#BULDHANA", "CHANDRAPUR#CHANDRAPUR#CHANDRAPUR", "DHULE#DHULE#DHULE", "GADCHIROLI#GADCHIROLI#GADCHIROLI", "JALGAON#JALGAON#JALGAON", "JALNA#JALNA#JALNA", "KOLHAPUR#KARVIR#KOLHAPUR", "LATUR#LATUR#LATUR", "MUMBAI#MUMBAI#MUMBAI", "NAGPUR#NAGPUR#NAGPUR", "NANDED#NANDED#NANDED", "NASHIK#NASHIK#NASHIK", "OSMANABAD#OSMANABAD#OSMANABAD", "PALGHAR#PALGHAR#THANE", "PARBHANI#PARBHANI#PARBHANI", "PUNE#PUNE#PUNE", "RAIGAD FATA#MAHAD#RAIGAD", "RATNAGIRI#RATNAGIRI#RATNAGIRI", "SANGLI#MIRAJ#SANGLI", "SATARA#SATARA#SATARA", "SINDHUDURG NAGARI FATA#KUDAL#SINDHUDURG", "SOLAPUR#SOLAPUR#SOLAPUR", "THANE#THANE#THANE", "WARDHA#WARDHA#WARDHA", "YAVATMAL#YAVATMAL#YAVATMAL"}));
        com.mobond.mindicator.a.a(activity).a("msrtc_language", "english");
        if (c.size() == 0) {
            Vector<com.mulo.a.c.c> vector = com.mulo.a.c.a.a(activity).c(activity);
            for (int i2 = 0; i2 < vector.size(); ++i2) {
                short s2 = (short)i2;
                d d2 = new d();
                com.mulo.a.c.c c2 = (com.mulo.a.c.c)vector.get(i2);
                d2.b = c2.a;
                if (c2.b.equalsIgnoreCase(c2.c)) {
                    d2.c = c2.b;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(c2.b);
                    stringBuilder.append(", ");
                    stringBuilder.append(c2.c);
                    d2.c = stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c2.a);
                stringBuilder.append("#");
                stringBuilder.append(c2.b);
                stringBuilder.append("#");
                stringBuilder.append(c2.c);
                stringBuilder.append("#");
                stringBuilder.append((int)s2);
                d2.i = stringBuilder.toString();
                d2.j = c2;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(c2.a);
                stringBuilder2.append("#");
                stringBuilder2.append(c2.b);
                stringBuilder2.append("#");
                stringBuilder2.append(c2.c);
                if (arrayList2.contains((Object)stringBuilder2.toString())) {
                    arrayList.add((Object)d2);
                } else {
                    c.add((Object)d2);
                }
                if (c2.a.equals((Object)"DADAR EAST")) {
                    d.put((Object)"DADAR", (Object)s2);
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("DADAR ");
                    stringBuilder3.append((int)s2);
                    Log.d((String)"acBusStopIndexHt", (String)stringBuilder3.toString());
                    continue;
                }
                if (c2.a.equals((Object)"PUNE")) {
                    d.put((Object)"PUNE", (Object)s2);
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("PUNE ");
                    stringBuilder4.append((int)s2);
                    Log.d((String)"acBusStopIndexHt", (String)stringBuilder4.toString());
                    continue;
                }
                if (c2.a.equals((Object)"BORIVALI NANCY COLONY")) {
                    d.put((Object)"BORIVALI", (Object)s2);
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("BORIVALI ");
                    stringBuilder5.append((int)s2);
                    Log.d((String)"acBusStopIndexHt", (String)stringBuilder5.toString());
                    continue;
                }
                if (c2.a.equals((Object)"NASHIK MELA STAND")) {
                    d.put((Object)"NASHIK", (Object)s2);
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append("NASHIK ");
                    stringBuilder6.append((int)s2);
                    Log.d((String)"acBusStopIndexHt", (String)stringBuilder6.toString());
                    continue;
                }
                if (c2.a.equals((Object)"AURANGABAD")) {
                    d.put((Object)"AURANGABAD", (Object)s2);
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append("AURANGABAD ");
                    stringBuilder7.append((int)s2);
                    Log.d((String)"acBusStopIndexHt", (String)stringBuilder7.toString());
                    continue;
                }
                if (c2.a.equals((Object)"THANE VANDANA")) {
                    d.put((Object)"THANE", (Object)s2);
                    StringBuilder stringBuilder8 = new StringBuilder();
                    stringBuilder8.append("THANE ");
                    stringBuilder8.append((int)s2);
                    Log.d((String)"acBusStopIndexHt", (String)stringBuilder8.toString());
                    continue;
                }
                if (c2.a.equals((Object)"KOLHAPUR") && c2.c.equals((Object)"KOLHAPUR")) {
                    d.put((Object)"KOLHAPUR", (Object)s2);
                    continue;
                }
                if (!c2.a.equals((Object)"SANGLI")) continue;
                d.put((Object)"SANGLI", (Object)s2);
            }
            c.addAll(0, (Collection)arrayList);
        }
    }

    @SuppressLint(value={"StaticFieldLeak"})
    public static void a(Activity activity, Boolean bl) {
        if (bl.booleanValue()) {
            c.clear();
            new AsyncTask<Void, Void, Void>(activity){
                final /* synthetic */ Activity a;
                {
                    this.a = activity;
                }

                protected /* varargs */ Void a(Void ... arrvoid) {
                    Log.d((String)"createDoubleRow", (String)"doInBackground start");
                    try {
                        MsrtcMainActivity.a(this.a);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    Log.d((String)"createDoubleRow", (String)"doInBackground end");
                    return null;
                }

                protected void a(Void void_) {
                    super.onPostExecute((Object)void_);
                    Log.d((String)"createDoubleRow", (String)"onPostExecute start");
                    try {
                        MsrtcMainActivity.e.dismiss();
                    }
                    catch (Exception exception) {}
                    this.a.finish();
                    Intent intent = new Intent((Context)this.a, MsrtcMainActivity.class);
                    this.a.startActivity(intent);
                    Log.d((String)"createDoubleRow", (String)"onPostExecute end");
                }

                protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                    return this.a((Void[])arrobject);
                }

                protected /* synthetic */ void onPostExecute(Object object) {
                    this.a((Void)object);
                }

                protected void onPreExecute() {
                    super.onPreExecute();
                    Log.d((String)"createDoubleRow", (String)"onPreExecute start");
                    MsrtcMainActivity.e = new Dialog((Context)this.a);
                    MsrtcMainActivity.e.requestWindowFeature(1);
                    MsrtcMainActivity.e.setContentView(2131492976);
                    MsrtcMainActivity.e.setCancelable(false);
                    MsrtcMainActivity.e.show();
                    Log.d((String)"createDoubleRow", (String)"onPreExecute end");
                }
            }.execute((Object[])new Void[0]);
            return;
        }
        MsrtcMainActivity.a(activity);
    }

    static /* synthetic */ void a(MsrtcMainActivity msrtcMainActivity) {
        msrtcMainActivity.c();
    }

    private final void c() {
        new Handler().post(new Runnable(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void run() {
                this.a.A.getParent().requestChildFocus((View)this.a.A, (View)this.a.A);
            }
        });
    }

    public void a() {
        String string = com.mulo.a.c.a.a((Activity)this).d((Activity)this);
        String string2 = com.mulo.a.c.a.a((Activity)this).a((Context)this);
        String string3 = com.mobond.mindicator.fcm.a.a("msrtc_apk_version");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        stringBuilder.append(string3);
        Log.d((String)"msrtc", (String)stringBuilder.toString());
        if (h.a(string, string2) == 1) {
            if (h.a(string3, string) == 1) {
                this.P.setVisibility(0);
                return;
            }
            this.P.setVisibility(8);
            return;
        }
        if (h.a(string3, string2) == 1) {
            this.P.setVisibility(0);
            return;
        }
        this.P.setVisibility(8);
    }

    public void a(String string) {
        try {
            this.G.b("msrtc_language", string);
            if (string.equalsIgnoreCase("marathi")) {
                this.b("assgn");
            } else {
                this.b("en");
            }
            MsrtcMainActivity.a(this.V, true);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void acServices(View view) {
        this.startActivity(new Intent((Context)this, MsrtcAcServices.class));
    }

    public void b() {
        Log.d((String)"newshead", (String)"loading");
        String string = this.G.a(this.H, "");
        if (string != null && !string.equals((Object)"")) {
            this.c(string);
        }
        if (!this.F) {
            AsyncTask<String, String, String> asyncTask = new AsyncTask<String, String, String>(){
                boolean a = false;

                protected /* varargs */ String a(String ... arrstring) {
                    String string = "";
                    try {
                        string = e.a(e.a(arrstring[0], (Context)MsrtcMainActivity.this));
                        MsrtcMainActivity.this.G.b(MsrtcMainActivity.this.H, string);
                        return string;
                    }
                    catch (IOException iOException) {
                        this.a = true;
                        return string;
                    }
                }

                protected void a(String string) {
                    if (string != null) {
                        try {
                            if (!string.equals((Object)"")) {
                                MsrtcMainActivity.this.c(string);
                                MsrtcMainActivity.this.F = true;
                                return;
                            }
                        }
                        catch (Exception exception) {
                            Log.d((String)"3333", (String)"3333 onPostExecute Exception", (Throwable)exception);
                        }
                    }
                }

                protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                    return this.a((String[])arrobject);
                }

                protected /* synthetic */ void onPostExecute(Object object) {
                    this.a((String)object);
                }

                protected void onPreExecute() {
                    super.onPreExecute();
                }
            };
            Object[] arrobject = new String[1];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ConfigurationManager.a());
            stringBuilder.append("type=msrtc");
            arrobject[0] = stringBuilder.toString();
            asyncTask.execute(arrobject);
        }
    }

    public void b(String string) {
        this.M = new Locale(string);
        Resources resources = this.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = this.M;
        resources.updateConfiguration(configuration, displayMetrics);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(String string) {
        String string2 = "";
        try {
            JSONObject jSONObject = new JSONObject(string);
            jSONObject.getJSONArray("transport_mode");
            JSONArray jSONArray = jSONObject.getJSONArray("alerts");
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("    ");
                stringBuilder.append(i2);
                stringBuilder.append(". ");
                stringBuilder.append(jSONObject2.getString("title"));
                string2 = stringBuilder.toString();
            }
            this.U.setText((CharSequence)string2);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"AlertFragment", (String)"kkkAlertFragment", (Throwable)exception);
            return;
        }
    }

    public void feedBack(View view) {
        Intent intent = new Intent((Context)this, FeedbackUI.class);
        intent.putExtra("feedbacktype", FeedbackUI.f);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("App Version: v17.0.186 Eagle\nApp Build: A:T:20210102\nPhone Model: ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append("\nSDK: ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append("\nManufacturer: ");
        stringBuilder.append(Build.MANUFACTURER);
        stringBuilder.append("\nCity: ");
        stringBuilder.append(ConfigurationManager.b(this.getApplicationContext()));
        intent.putExtra("info", stringBuilder.toString());
        this.startActivity(intent);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        if (n2 == 1) {
            if (intent != null) {
                String string = intent.getStringExtra("stopName");
                String string2 = intent.getStringExtra("district");
                intent.getStringExtra("taluka");
                String string3 = intent.getStringExtra("stop_index");
                if (string != null && string3 != null) {
                    short s2 = Short.parseShort((String)string3);
                    this.f.setText((CharSequence)string);
                    W = s2;
                    this.m = string2;
                    this.f.setTag((Object)W);
                    this.T = string;
                    AsyncTask<Object, Integer, Boolean> asyncTask = new AsyncTask<Object, Integer, Boolean>(string){
                        Dialog a;
                        String b = "A";
                        Short c;
                        Short d;
                        String e;
                        {
                            this.e = string;
                        }

                        protected /* varargs */ Boolean a(Object ... arrobject) {
                            try {
                                this.c = (short)((Short)arrobject[0]);
                                this.d = (short)((Short)arrobject[1]);
                                Integer n2 = (Integer)arrobject[2];
                                this.b = (String)arrobject[3];
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("src ");
                                stringBuilder.append((Object)this.c);
                                stringBuilder.append("dest");
                                stringBuilder.append((Object)this.d);
                                stringBuilder.append(" bus_type ");
                                stringBuilder.append((Object)n2);
                                Log.d((String)"msrtcatob", (String)stringBuilder.toString());
                                com.mulo.a.c.a.a((Activity)MsrtcMainActivity.this).b((Activity)MsrtcMainActivity.this);
                                if (this.b.equals((Object)"A")) {
                                    BusList.a = com.mulo.a.c.a.a((Activity)MsrtcMainActivity.this).a(this.c, n2);
                                } else if (this.b.equals((Object)"AB")) {
                                    BusList.a = com.mulo.a.c.a.a((Activity)MsrtcMainActivity.this).b(this.c, this.d, n2);
                                }
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                            }
                            return true;
                        }

                        protected void a(Boolean bl) {
                            this.a.dismiss();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("src ");
                            stringBuilder.append((int)MsrtcMainActivity.this.s);
                            stringBuilder.append("dest");
                            stringBuilder.append((int)MsrtcMainActivity.this.t);
                            stringBuilder.append(" bus_type ");
                            stringBuilder.append(2131296464);
                            Log.d((String)"postexcute", (String)stringBuilder.toString());
                            if (BusList.a != null && BusList.a.size() > 0) {
                                MsrtcMainActivity msrtcMainActivity = MsrtcMainActivity.this;
                                msrtcMainActivity.u = (short)-1;
                                Intent intent = new Intent((Context)msrtcMainActivity, BusList.class);
                                intent.putExtra("source_index", (Serializable)this.c);
                                intent.putExtra("destination_index", (Serializable)this.d);
                                intent.putExtra("stop_name", MsrtcMainActivity.this.T);
                                intent.putExtra("search_type", "AB");
                                intent.putExtra("bus_type", 0);
                                MsrtcMainActivity.this.startActivity(intent);
                                return;
                            }
                            if (this.b.equalsIgnoreCase("AB")) {
                                d.a a2 = new d.a((Context)MsrtcMainActivity.this);
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("No buses found. Do you want to search buses passing through ");
                                stringBuilder2.append(this.e);
                                stringBuilder2.append("?");
                                a2.b((CharSequence)stringBuilder2.toString());
                                a2.a(true);
                                a2.a((CharSequence)"Yes", new DialogInterface.OnClickListener(){

                                    public void onClick(DialogInterface dialogInterface, int n2) {
                                        MsrtcMainActivity.this.T = b.this.e;
                                        AsyncTask<Object, Integer, Boolean> asyncTask = new /* invalid duplicate definition of identical inner class */;
                                        Object[] arrobject = new Object[]{b.this.c, b.this.c, 0, "A"};
                                        asyncTask.execute(arrobject);
                                        dialogInterface.cancel();
                                    }
                                });
                                a2.b((CharSequence)"No", new DialogInterface.OnClickListener(){

                                    public void onClick(DialogInterface dialogInterface, int n2) {
                                        dialogInterface.cancel();
                                    }
                                });
                                a2.b().show();
                            }
                        }

                        protected /* varargs */ void a(Integer ... arrinteger) {
                            super.onProgressUpdate((Object[])arrinteger);
                        }

                        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                            return this.a(arrobject);
                        }

                        protected /* synthetic */ void onPostExecute(Object object) {
                            this.a((Boolean)object);
                        }

                        protected void onPreExecute() {
                            super.onPreExecute();
                            this.a = new Dialog((Context)MsrtcMainActivity.this);
                            this.a.requestWindowFeature(1);
                            this.a.setContentView(2131492976);
                            this.a.setCancelable(false);
                            this.a.show();
                        }

                        protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
                            this.a((Integer[])arrobject);
                        }

                    };
                    Object[] arrobject = new Object[]{W, W, 0, "A"};
                    asyncTask.execute(arrobject);
                    return;
                }
            }
        } else if (n2 == 2 && intent != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.p);
            Log.d((String)"msrtc_index", (String)stringBuilder.toString());
            int n4 = this.p;
            if (n4 == this.q) {
                Log.d((String)"msrtc_index", (String)"source");
                String string = this.k = intent.getStringExtra("stopName");
                if (string != null) {
                    this.g.setText((CharSequence)string);
                    String string4 = intent.getStringExtra("district");
                    short s3 = Short.parseShort((String)intent.getStringExtra("stop_index"));
                    this.m = string4;
                    this.s = s3;
                    this.t = intent.getShortExtra("dest_index", (short)0);
                    this.n = intent.getStringExtra("DESTINATION_DISTRICT");
                    String string5 = this.l = this.getIntent().getStringExtra("DESTINATION_NAME");
                    if (string5 != null) {
                        this.h.setText((CharSequence)string5);
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("sid= ");
                    stringBuilder2.append((int)this.s);
                    Log.d((String)"msrtc_index", (String)stringBuilder2.toString());
                    return;
                }
            } else if (n4 == this.r) {
                Log.d((String)"msrtc_index", (String)"destination");
                String string = this.l = intent.getStringExtra("stopName");
                if (string != null) {
                    this.h.setText((CharSequence)string);
                    String string6 = intent.getStringExtra("district");
                    short s4 = Short.parseShort((String)intent.getStringExtra("stop_index"));
                    this.n = string6;
                    this.t = s4;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("did= ");
                    stringBuilder3.append((int)this.t);
                    Log.d((String)"msrtc_index", (String)stringBuilder3.toString());
                    this.v.setVisibility(0);
                    this.s = intent.getShortExtra("source_index", (short)0);
                    this.m = intent.getStringExtra("SOURCE_DISTRICT");
                    String string7 = this.k = this.getIntent().getStringExtra("SOURCE_NAME");
                    if (string7 != null) {
                        this.g.setText((CharSequence)string7);
                    }
                }
            }
        }
    }

    public void onClick(View view) {
        short s2;
        if (view == this.f) {
            Intent intent = new Intent((Context)this, MsrtcSourceSearchUI.class);
            intent.putExtra("hint", this.getString(2131755495));
            this.startActivityForResult(intent, 1);
            return;
        }
        if (view == this.g) {
            this.p = this.q;
            Intent intent = new Intent((Context)this, MsrtcSourceSearchUI.class);
            intent.putExtra("hint", this.getString(2131755501));
            intent.putExtra("selected_stn", "source_stn");
            intent.putExtra("source_index", this.s);
            intent.putExtra("dest_index", this.t);
            intent.putExtra("SOURCE_NAME", this.k);
            intent.putExtra("DESTINATION_NAME", this.l);
            intent.putExtra("SOURCE_DISTRICT", this.m);
            intent.putExtra("DESTINATION_DISTRICT", this.n);
            this.startActivityForResult(intent, 2);
            return;
        }
        if (view == this.h) {
            this.p = this.r;
            Intent intent = new Intent((Context)this, MsrtcSourceSearchUI.class);
            intent.putExtra("hint", this.getString(2131755496));
            intent.putExtra("selected_stn", "destination_stn");
            intent.putExtra("source_index", this.s);
            intent.putExtra("dest_index", this.t);
            intent.putExtra("SOURCE_NAME", this.k);
            intent.putExtra("DESTINATION_NAME", this.l);
            intent.putExtra("SOURCE_DISTRICT", this.m);
            intent.putExtra("DESTINATION_DISTRICT", this.n);
            this.startActivityForResult(intent, 2);
            return;
        }
        String string = ((TextView)view).getText().toString();
        int n2 = view.getId();
        int n3 = Integer.parseInt((String)((String)view.getTag()));
        this.u = s2 = (short)n2;
        short s3 = (short)n3;
        String string2 = "A";
        if (s2 != s3) {
            string2 = "AB";
        }
        this.T = string;
        AsyncTask<Object, Integer, Boolean> asyncTask = new /* invalid duplicate definition of identical inner class */;
        Object[] arrobject = new Object[]{s2, s3, this.y, string2};
        asyncTask.execute(arrobject);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.V = this;
        this.G = com.mobond.mindicator.a.a((Activity)this);
        b = this.G.a("msrtc_language", "english");
        if (b.equalsIgnoreCase("english")) {
            this.b("en");
            this.G.b("msrtc_language", "english");
        } else {
            this.b("assgn");
            this.G.b("msrtc_language", "marathi");
        }
        this.setContentView(2131493071);
        try {
            this.j = com.mulo.a.c.a.a((Activity)this).c((Activity)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.f = (TextView)this.findViewById(2131297349);
        this.g = (TextView)this.findViewById(2131297390);
        this.h = (TextView)this.findViewById(2131296634);
        this.i = (Button)this.findViewById(2131297279);
        this.v = (ImageView)this.findViewById(2131297375);
        this.w = (ImageView)this.findViewById(2131296992);
        this.x = (ImageView)this.findViewById(2131297281);
        this.z = (ScrollView)this.findViewById(2131297270);
        this.A = (LinearLayout)this.findViewById(2131296369);
        this.B = (LinearLayout)this.findViewById(2131296274);
        this.C = (LinearLayout)this.findViewById(2131297280);
        this.J = (TextView)this.findViewById(2131296978);
        this.K = (TextView)this.findViewById(2131296715);
        this.N = (CheckBox)this.findViewById(2131297451);
        this.U = (TextView)this.findViewById(2131297025);
        this.U.setSelected(true);
        this.v.setVisibility(8);
        this.D = (LinearLayout)this.findViewById(2131296370);
        this.P = (RelativeLayout)this.findViewById(2131297020);
        this.R = (TextView)this.findViewById(2131297653);
        this.O = (RelativeLayout)this.findViewById(2131296484);
        this.Q = (RelativeLayout)this.findViewById(2131296414);
        this.L = (RelativeLayout)this.findViewById(2131297029);
        this.X = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/5882846849", "167101606757479_1239841812816781", "ca-app-pub-5449278086868932/5519589065", "167101606757479_1235755086558787", 3, null);
        if (b.equalsIgnoreCase("english")) {
            this.K.setBackgroundResource(2131231151);
            this.J.setBackgroundResource(2131099681);
        } else {
            this.J.setBackgroundResource(2131231151);
            this.K.setBackgroundResource(2131099681);
        }
        this.H = "msrtc_alerts_content";
        this.S = this.G.a("msrtc_activity_open_count", 0);
        if (this.S >= 3) {
            com.mobond.mindicator.fcm.b.a("msrtc");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" subscribed to topic MSRTC ");
            stringBuilder.append(this.S);
            Log.d((String)"mdopen", (String)stringBuilder.toString());
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" more or less ");
            stringBuilder.append(this.S);
            Log.d((String)"mdopen", (String)stringBuilder.toString());
        }
        this.G.b("msrtc_activity_open_count", 1 + this.S);
        a = new com.mobond.mindicator.d((Context)this, "MSRTC_HISTORY", 5);
        this.G.a(this.H, "");
        this.b();
        this.f.setOnClickListener((View.OnClickListener)this);
        this.g.setOnClickListener((View.OnClickListener)this);
        this.h.setOnClickListener((View.OnClickListener)this);
        this.v.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                String string = this.a.g.getText().toString();
                String string2 = this.a.h.getText().toString();
                short s2 = this.a.s;
                MsrtcMainActivity msrtcMainActivity = this.a;
                msrtcMainActivity.s = msrtcMainActivity.t;
                MsrtcMainActivity msrtcMainActivity2 = this.a;
                msrtcMainActivity2.t = s2;
                msrtcMainActivity2.g.setText((CharSequence)string2);
                this.a.h.setText((CharSequence)string);
                android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation((Context)this.a, (int)2130771991);
                this.a.v.startAnimation(animation);
            }
        });
        this.w.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                MsrtcMainActivity.a(this.a);
            }
        });
        this.x.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                String string = this.a.f.getText().toString();
                if (string.compareToIgnoreCase(this.a.getString(2131755494)) == 0) {
                    MsrtcMainActivity msrtcMainActivity = this.a;
                    com.mobond.mindicator.ui.n.d((Context)msrtcMainActivity, msrtcMainActivity.getString(2131755413));
                    return;
                }
                short s2 = this.a.f.getTag() != null ? (Short)this.a.f.getTag() : (short)0;
                MsrtcMainActivity msrtcMainActivity = this.a;
                msrtcMainActivity.T = string;
                AsyncTask<Object, Integer, Boolean> asyncTask = new /* invalid duplicate definition of identical inner class */;
                Object[] arrobject = new Object[]{s2, s2, 0, "A"};
                asyncTask.execute(arrobject);
            }
        });
        this.i.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                String string = this.a.g.getText().toString();
                String string2 = this.a.h.getText().toString();
                String string3 = this.a.G.a("msrtc_language", "english");
                if (string.compareToIgnoreCase("PICKUP") != 0 && string.compareToIgnoreCase("\u0938\u0941\u0930\u0941\u0935\u093e\u0924") != 0) {
                    if (string2.compareToIgnoreCase("DESTINATION") != 0 && string2.compareToIgnoreCase("\u0936\u0947\u0935\u091f") != 0) {
                        if (string.compareToIgnoreCase(string2) == 0) {
                            MsrtcMainActivity msrtcMainActivity = this.a;
                            com.mobond.mindicator.ui.n.d((Context)msrtcMainActivity, msrtcMainActivity.getString(2131755414));
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string);
                        stringBuilder.append(" # ");
                        stringBuilder.append(string2);
                        String string4 = stringBuilder.toString();
                        MsrtcMainActivity msrtcMainActivity = this.a;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(string);
                        stringBuilder2.append(" - ");
                        stringBuilder2.append(string2);
                        msrtcMainActivity.T = stringBuilder2.toString();
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("toolbar_title ");
                        stringBuilder3.append(this.a.T);
                        stringBuilder3.append(" ~~~ ");
                        stringBuilder3.append(string4);
                        Log.d((String)"toolbar_title", (String)stringBuilder3.toString());
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append("call src ");
                        stringBuilder4.append((int)this.a.s);
                        stringBuilder4.append("dest");
                        stringBuilder4.append((int)this.a.t);
                        stringBuilder4.append("BUS_TYPE");
                        stringBuilder4.append(this.a.y);
                        Log.d((String)"msrtcatob", (String)stringBuilder4.toString());
                        AsyncTask<Object, Integer, Boolean> asyncTask = new /* invalid duplicate definition of identical inner class */;
                        Object[] arrobject = new Object[]{this.a.s, this.a.t, this.a.y, "AB"};
                        asyncTask.execute(arrobject);
                        return;
                    }
                    if (string3.equalsIgnoreCase("marathi")) {
                        com.mobond.mindicator.ui.n.d((Context)this.a, "\u0915\u0943\u092a\u092f\u093e \u0936\u0947\u0935\u091f\u091a\u0947 \u0920\u093f\u0915\u093e\u0923 \u0928\u093f\u0935\u0921\u093e");
                        return;
                    }
                    com.mobond.mindicator.ui.n.d((Context)this.a, "Please Select Destination");
                    return;
                }
                if (string3.equalsIgnoreCase("marathi")) {
                    com.mobond.mindicator.ui.n.d((Context)this.a, "\u0915\u0943\u092a\u092f\u093e \u0938\u0941\u0930\u0941\u0935\u093e\u0924\u0940\u091a\u0947 \u0920\u093f\u0915\u093e\u0923 \u0928\u093f\u0935\u0921\u093e");
                    return;
                }
                com.mobond.mindicator.ui.n.d((Context)this.a, "Please Select Source");
            }
        });
        this.J.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                if (this.a.G.b("msrtc_language") == null) {
                    this.a.J.setBackgroundResource(2131231151);
                    this.a.K.setBackgroundResource(2131099681);
                    this.a.a("marathi");
                    return;
                }
                if (!this.a.G.b("msrtc_language").equals((Object)"marathi")) {
                    this.a.J.setBackgroundResource(2131231151);
                    this.a.K.setBackgroundResource(2131099681);
                    this.a.a("marathi");
                }
            }
        });
        this.K.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                if (this.a.G.b("msrtc_language") == null) {
                    this.a.K.setBackgroundResource(2131231151);
                    this.a.J.setBackgroundResource(2131099681);
                    this.a.a("english");
                    return;
                }
                if (!this.a.G.b("msrtc_language").equals((Object)"english")) {
                    this.a.K.setBackgroundResource(2131231151);
                    this.a.J.setBackgroundResource(2131099681);
                    this.a.a("english");
                }
            }
        });
        if (this.G.a("is_subscribe_to_msrtc_news", "yes").equalsIgnoreCase("yes")) {
            this.N.setChecked(true);
        } else {
            this.N.setChecked(false);
        }
        this.N.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                if (this.a.N.isChecked()) {
                    com.mobond.mindicator.fcm.b.a("msrtc");
                    this.a.G.b("is_subscribe_to_msrtc_news", "yes");
                    MsrtcMainActivity msrtcMainActivity = this.a;
                    com.mobond.mindicator.ui.n.c((Context)msrtcMainActivity, msrtcMainActivity.getResources().getString(2131755410));
                    return;
                }
                Log.d((String)"mdopen", (String)" unsubscribed to topic MSRTC ");
                com.mobond.mindicator.fcm.b.b("msrtc");
                this.a.G.b("is_subscribe_to_msrtc_news", "no");
                MsrtcMainActivity msrtcMainActivity = this.a;
                com.mobond.mindicator.ui.n.c((Context)msrtcMainActivity, msrtcMainActivity.getResources().getString(2131755415));
            }
        });
        this.L.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.a, com.mobond.mindicator.ui.alert.News.class);
                intent.putExtra("urlParameter", "type=msrtc");
                intent.putExtra("chatroom", false);
                intent.putExtra("alerttype", this.a.H);
                this.a.startActivity(intent);
            }
        });
        try {
            this.a();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.R.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                MsrtcMainActivity.a.b();
                MsrtcMainActivity.c.clear();
                com.mulo.a.c.a.a((Activity)this.a).b = null;
                com.mulo.a.c.a.a();
                this.a.finish();
                this.a.startActivity(new Intent("android.intent.action.VIEW", android.net.Uri.parse((String)"https://play.google.com/store/apps/details?id=com.mobond.mindicator.msrtc")));
            }
        });
        this.O.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.a, com.mobond.mindicator.ui.msrtc.MsrtcBusDepotNumber.class);
                this.a.startActivity(intent);
            }
        });
        this.Q.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MsrtcMainActivity a;
            {
                this.a = msrtcMainActivity;
            }

            public void onClick(View view) {
                com.mobond.mindicator.ui.n.a((Context)this.a, null, "http://mobondhrd.appspot.com/msrtcbooking?&mobondhandle=http");
            }
        });
    }

    /*
     * Exception decompiling
     */
    protected void onDestroy() {
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
        super.onPause();
        c.b(this.X);
    }

    public void onResume() {
        c.a(this.X);
        super.onResume();
    }

}

