/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  androidx.fragment.app.d
 *  androidx.fragment.app.j
 *  com.google.android.gms.maps.a
 *  com.google.android.gms.maps.b
 *  com.google.android.gms.maps.c
 *  com.google.android.gms.maps.e
 *  com.google.android.gms.maps.model.LatLng
 *  com.google.android.gms.maps.model.LatLngBounds
 *  com.google.android.gms.maps.model.a
 *  com.google.android.gms.maps.model.b
 *  com.google.android.gms.maps.model.e
 *  com.google.android.gms.maps.model.f
 *  com.google.android.gms.maps.model.j
 *  com.google.android.gms.maps.model.k
 *  com.google.android.libraries.places.api.Places
 *  com.google.android.libraries.places.api.model.Place
 *  com.google.android.libraries.places.api.model.Place$Field
 *  com.google.android.libraries.places.widget.Autocomplete
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Calendar
 *  java.util.HashMap
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.autotaxi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.k;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.autotaxi.NewFareCalculator;
import com.mobond.mindicator.ui.n;
import com.mobond.policestationlocator.util.CustomMapFragment;
import com.mulo.util.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class NewFareCalculator
extends androidx.appcompat.app.e
implements com.google.android.gms.maps.e {
    ArrayList<String> A = new ArrayList();
    ArrayList<String> B = new ArrayList();
    ArrayList<String> C = new ArrayList();
    ArrayList<String> D = new ArrayList();
    ArrayList<String> E = new ArrayList();
    ArrayList<String> F = new ArrayList();
    ArrayList<String> G = new ArrayList();
    ArrayList<String> H = new ArrayList();
    LatLng I;
    int J = 101;
    int K = 102;
    List<Place.Field> L;
    private com.google.android.gms.maps.c M;
    private CustomMapFragment N;
    private LatLngBounds O = new LatLngBounds(new LatLng(18.8886596, 72.7801523), new LatLng(19.3405388, 73.1076822));
    private LatLngBounds P = new LatLngBounds(new LatLng(28.4767591, 77.1581083), new LatLng(28.7877403, 77.1883207));
    private LatLngBounds Q = new LatLngBounds(new LatLng(18.4982917, 73.8715069), new LatLng(18.5321491, 73.8412945));
    private LatLngBounds R;
    public double a;
    public double b;
    public double c;
    public double d;
    ProgressDialog e;
    String f = null;
    String g = null;
    TextView h;
    TextView i;
    TextView j;
    Boolean k;
    String l;
    String m;
    String n;
    TextView o;
    TextView p;
    TextView q;
    TextView r;
    TextView s;
    LinearLayout t;
    LinearLayout u;
    LinearLayout v;
    LinearLayout w;
    ArrayList<String> x = new ArrayList();
    ArrayList<String> y = new ArrayList();
    ArrayList<String> z = new ArrayList();

    public NewFareCalculator() {
        Object[] arrobject = new Place.Field[]{Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG};
        this.L = Arrays.asList((Object[])arrobject);
    }

    static /* synthetic */ LatLngBounds a(NewFareCalculator newFareCalculator) {
        return newFareCalculator.R;
    }

    private void b() {
        String string;
        String string2;
        String string3;
        this.x.clear();
        this.C.clear();
        this.D.clear();
        this.A.clear();
        this.B.clear();
        this.E.clear();
        this.F.clear();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AUTO".toLowerCase());
        stringBuilder.append(File.separator);
        stringBuilder.append("AUTO".toLowerCase());
        InputStream inputStream = e.a((Object)this, stringBuilder.toString());
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream));
        while ((string3 = bufferedReader.readLine()) != null) {
            String[] arrstring = string3.split(",");
            this.x.add((Object)arrstring[0]);
            this.C.add((Object)arrstring[1]);
            this.D.add((Object)arrstring[2]);
        }
        inputStream.close();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("TAXI".toLowerCase());
        stringBuilder2.append(File.separator);
        stringBuilder2.append("TAXI".toLowerCase());
        InputStream inputStream2 = e.a((Object)this, stringBuilder2.toString());
        BufferedReader bufferedReader2 = new BufferedReader((Reader)new InputStreamReader(inputStream2));
        while ((string = bufferedReader2.readLine()) != null) {
            String[] arrstring = string.split(",");
            this.y.add((Object)arrstring[0]);
            this.A.add((Object)arrstring[1]);
            this.B.add((Object)arrstring[2]);
        }
        inputStream2.close();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("TAXI".toLowerCase());
        stringBuilder3.append(File.separator);
        stringBuilder3.append("COOLCAB".toLowerCase());
        InputStream inputStream3 = e.a((Object)this, stringBuilder3.toString());
        BufferedReader bufferedReader3 = new BufferedReader((Reader)new InputStreamReader(inputStream3));
        while ((string2 = bufferedReader3.readLine()) != null) {
            String[] arrstring = string2.split(",");
            this.z.add((Object)arrstring[0]);
            this.E.add((Object)arrstring[1]);
            this.F.add((Object)arrstring[2]);
        }
        inputStream3.close();
    }

    private void c() {
        int n2 = Calendar.getInstance().get(11);
        boolean bl = n2 < 24 && n2 > 5;
        this.k = bl;
    }

    public void a() {
        this.M.b();
        Log.d((String)"anim", (String)"slidedown");
        Animation animation = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771995);
        this.t.startAnimation(animation);
        this.t.setVisibility(8);
        this.v.setAlpha(1.0f);
        this.w.setAlpha(1.0f);
        this.u.setAlpha(1.0f);
        this.l = null;
        this.m = null;
        this.n = null;
        this.f = this.h.getText().toString();
        this.g = this.i.getText().toString();
        new AsyncTask<String, String, String>(){
            Double a = 0.0;
            String b;
            boolean c = false;

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            protected /* varargs */ String a(String ... arrstring) {
                int n2;
                int n3;
                block20 : {
                    int n4;
                    block19 : {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("https://maps.googleapis.com/maps/api/directions/json?origin=");
                        stringBuilder.append(NewFareCalculator.this.b);
                        stringBuilder.append(",");
                        stringBuilder.append(NewFareCalculator.this.a);
                        stringBuilder.append("&destination=");
                        stringBuilder.append(NewFareCalculator.this.c);
                        stringBuilder.append(",");
                        stringBuilder.append(NewFareCalculator.this.d);
                        stringBuilder.append("&key=");
                        stringBuilder.append("AIzaSyCz6QgtQ7mSG9NtfjOTyfrTY8pM9lSfTZA");
                        String string = stringBuilder.toString();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
                            if (httpURLConnection.getResponseCode() == 200) {
                                String string2;
                                BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(httpURLConnection.getInputStream()), 8192);
                                while ((string2 = bufferedReader.readLine()) != null) {
                                    stringBuilder2.append(string2);
                                }
                                bufferedReader.close();
                            }
                            this.b = stringBuilder2.toString();
                            JSONObject jSONObject = new JSONObject(this.b);
                            if (!jSONObject.getString("status").equals((Object)"OK")) return null;
                            this.c = true;
                            JSONArray jSONArray = jSONObject.getJSONArray("routes");
                            n3 = 0;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(0).getJSONArray("legs").getJSONObject(0);
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("distance");
                            JSONObject jSONObject4 = jSONObject2.getJSONObject("start_location");
                            NewFareCalculator.this.b = Double.parseDouble((String)jSONObject4.getString("lat"));
                            NewFareCalculator.this.a = Double.parseDouble((String)jSONObject4.getString("lng"));
                            JSONObject jSONObject5 = jSONObject2.getJSONObject("end_location");
                            NewFareCalculator.this.c = Double.parseDouble((String)jSONObject5.getString("lat"));
                            NewFareCalculator.this.d = Double.parseDouble((String)jSONObject5.getString("lng"));
                            this.a = Double.parseDouble((String)jSONObject3.getString("text").replaceAll("[^\\.0123456789]", ""));
                            NewFareCalculator.this.c();
                            if (NewFareCalculator.this.k.booleanValue()) {
                                break block19;
                            }
                            Log.d((String)"456789", (String)"444444");
                            n2 = 0;
                            break block20;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                        return null;
                    }
                    for (int i2 = 0; i2 < NewFareCalculator.this.A.size(); ++i2) {
                        if (!(Double.parseDouble((String)((String)NewFareCalculator.this.y.get(i2))) >= this.a)) continue;
                        NewFareCalculator.this.l = (String)NewFareCalculator.this.A.get(i2);
                        break;
                    }
                    int n5 = 0;
                    do {
                        int n6 = NewFareCalculator.this.C.size();
                        n4 = 0;
                        if (n5 >= n6) break;
                        if (Double.parseDouble((String)((String)NewFareCalculator.this.x.get(n5))) >= this.a) {
                            NewFareCalculator.this.m = (String)NewFareCalculator.this.C.get(n5);
                            n4 = 0;
                            break;
                        }
                        ++n5;
                    } while (true);
                    do {
                        block22 : {
                            block21 : {
                                if (n4 >= NewFareCalculator.this.E.size()) break block21;
                                if (!(Double.parseDouble((String)((String)NewFareCalculator.this.x.get(n4))) >= this.a)) break block22;
                                NewFareCalculator.this.n = (String)NewFareCalculator.this.E.get(n4);
                            }
                            Log.d((String)"456789", (String)"333333");
                            return null;
                        }
                        ++n4;
                    } while (true);
                }
                do {
                    if (n2 >= NewFareCalculator.this.B.size()) break;
                    if (Double.parseDouble((String)((String)NewFareCalculator.this.y.get(n2))) >= this.a) {
                        NewFareCalculator.this.l = (String)NewFareCalculator.this.B.get(n2);
                        break;
                    }
                    ++n2;
                } while (true);
                Log.d((String)"456789", (String)"555555");
                int n7 = 0;
                do {
                    if (n7 >= NewFareCalculator.this.D.size()) break;
                    if (Double.parseDouble((String)((String)NewFareCalculator.this.x.get(n7))) >= this.a) {
                        NewFareCalculator.this.m = (String)NewFareCalculator.this.D.get(n7);
                        break;
                    }
                    ++n7;
                } while (true);
                Log.d((String)"456789", (String)"666666");
                while (n3 < NewFareCalculator.this.F.size()) {
                    if (Double.parseDouble((String)((String)NewFareCalculator.this.x.get(n3))) >= this.a) {
                        NewFareCalculator.this.n = (String)NewFareCalculator.this.F.get(n3);
                        return null;
                    }
                    ++n3;
                }
                return null;
            }

            protected void a(String string) {
                NewFareCalculator.this.e.dismiss();
                if (this.c) {
                    if (NewFareCalculator.this.l == null) {
                        NewFareCalculator newFareCalculator = NewFareCalculator.this;
                        newFareCalculator.l = "__";
                        newFareCalculator.v.setAlpha(0.2f);
                    }
                    if (NewFareCalculator.this.n == null) {
                        NewFareCalculator newFareCalculator = NewFareCalculator.this;
                        newFareCalculator.n = "__";
                        newFareCalculator.w.setAlpha(0.2f);
                    }
                    if (NewFareCalculator.this.m == null) {
                        NewFareCalculator newFareCalculator = NewFareCalculator.this;
                        newFareCalculator.m = "__";
                        newFareCalculator.u.setAlpha(0.2f);
                    }
                    if (NewFareCalculator.this.l.equals((Object)"__") && NewFareCalculator.this.n.equals((Object)"__") && NewFareCalculator.this.m.equals((Object)"__")) {
                        n.d((Context)NewFareCalculator.this, "Distance out of taxi/auto service limit");
                        return;
                    }
                    NewFareCalculator.this.t.setVisibility(0);
                    Log.d((String)"anim", (String)"slideup");
                    Animation animation = AnimationUtils.loadAnimation((Context)NewFareCalculator.this.getApplicationContext(), (int)2130771996);
                    NewFareCalculator.this.t.startAnimation(animation);
                    String string2 = "Day Fare";
                    if (!NewFareCalculator.this.k.booleanValue()) {
                        string2 = "Mid-Night Fare";
                    }
                    NewFareCalculator.this.s.setText((CharSequence)string2);
                    TextView textView = NewFareCalculator.this.r;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Distance : ");
                    stringBuilder.append(this.a.toString());
                    stringBuilder.append(" km");
                    textView.setText((CharSequence)stringBuilder.toString());
                    TextView textView2 = NewFareCalculator.this.o;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("\u20b9 ");
                    stringBuilder2.append(NewFareCalculator.this.l);
                    textView2.setText((CharSequence)stringBuilder2.toString());
                    TextView textView3 = NewFareCalculator.this.q;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("\u20b9 ");
                    stringBuilder3.append(NewFareCalculator.this.n);
                    textView3.setText((CharSequence)stringBuilder3.toString());
                    TextView textView4 = NewFareCalculator.this.p;
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("\u20b9 ");
                    stringBuilder4.append(NewFareCalculator.this.m);
                    textView4.setText((CharSequence)stringBuilder4.toString());
                    AsyncTask<String, Integer, List<List<HashMap<String, String>>>> asyncTask = new AsyncTask<String, Integer, List<List<HashMap<String, String>>>>(){

                        protected /* varargs */ List<List<HashMap<String, String>>> a(String ... arrstring) {
                            try {
                                JSONObject jSONObject = new JSONObject(arrstring[0]);
                                List<List<HashMap<String, String>>> list = new Object(){

                                    private List<LatLng> a(String string) {
                                        ArrayList arrayList = new ArrayList();
                                        int n2 = string.length();
                                        int n3 = 0;
                                        int n4 = 0;
                                        int n5 = 0;
                                        block0 : while (n3 < n2) {
                                            int n6 = 0;
                                            int n7 = 0;
                                            do {
                                                int n8 = n3 + 1;
                                                int n9 = -63 + string.charAt(n3);
                                                n6 |= (n9 & 31) << n7;
                                                n7 += 5;
                                                if (n9 < 32) {
                                                    int n10 = (n6 & 1) != 0 ? -1 ^ n6 >> 1 : n6 >> 1;
                                                    int n11 = n10 + n4;
                                                    int n12 = 0;
                                                    int n13 = 0;
                                                    do {
                                                        int n14 = n8 + 1;
                                                        int n15 = -63 + string.charAt(n8);
                                                        n12 |= (n15 & 31) << n13;
                                                        n13 += 5;
                                                        if (n15 < 32) {
                                                            int n16 = (n12 & 1) != 0 ? -1 ^ n12 >> 1 : n12 >> 1;
                                                            double d2 = n11;
                                                            Double.isNaN((double)d2);
                                                            double d3 = d2 / 100000.0;
                                                            double d4 = n5 += n16;
                                                            Double.isNaN((double)d4);
                                                            arrayList.add((Object)new LatLng(d3, d4 / 100000.0));
                                                            n4 = n11;
                                                            n3 = n14;
                                                            continue block0;
                                                        }
                                                        n8 = n14;
                                                    } while (true);
                                                }
                                                n3 = n8;
                                            } while (true);
                                        }
                                        return arrayList;
                                    }

                                    /*
                                     * Exception decompiling
                                     */
                                    public List<List<HashMap<String, String>>> a(JSONObject var1) {
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
                                        // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                                        // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
                                }.a(jSONObject);
                                return list;
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                return null;
                            }
                        }

                        protected void a(List<List<HashMap<String, String>>> list) {
                            new f();
                            k k2 = null;
                            for (int i2 = 0; i2 < list.size(); ++i2) {
                                ArrayList arrayList = new ArrayList();
                                k k3 = new k();
                                List list2 = (List)list.get(i2);
                                for (int i3 = 0; i3 < list2.size(); ++i3) {
                                    HashMap hashMap = (HashMap)list2.get(i3);
                                    arrayList.add((Object)new LatLng(Double.parseDouble((String)((String)hashMap.get((Object)"lat"))), Double.parseDouble((String)((String)hashMap.get((Object)"lng")))));
                                }
                                k3.a((Iterable)arrayList);
                                k3.a(5.0f);
                                k3.a(-16776961);
                                k2 = k3;
                            }
                            NewFareCalculator.this.M.a(k2);
                            LatLng latLng = new LatLng(NewFareCalculator.this.b, NewFareCalculator.this.a);
                            LatLng latLng2 = new LatLng(NewFareCalculator.this.c, NewFareCalculator.this.d);
                            NewFareCalculator.this.M.b(com.google.android.gms.maps.b.a((LatLng)latLng, (float)12.0f));
                            f f2 = new f();
                            f f3 = new f();
                            f2.a(latLng);
                            f3.a(latLng2);
                            f2.a(com.google.android.gms.maps.model.b.a((float)0.0f));
                            f3.a(com.google.android.gms.maps.model.b.a((float)120.0f));
                            NewFareCalculator.this.M.a(f2);
                            NewFareCalculator.this.M.a(f3);
                        }

                        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                            return this.a((String[])arrobject);
                        }

                        protected /* synthetic */ void onPostExecute(Object object) {
                            this.a((List<List<HashMap<String, String>>>)((List)object));
                        }
                    };
                    Object[] arrobject = new String[]{this.b};
                    asyncTask.execute(arrobject);
                    return;
                }
                n.d((Context)NewFareCalculator.this, "Route not found");
                NewFareCalculator.this.t.setVisibility(8);
            }

            protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                return this.a((String[])arrobject);
            }

            protected /* synthetic */ void onPostExecute(Object object) {
                this.a((String)object);
            }

            protected void onPreExecute() {
                super.onPreExecute();
                NewFareCalculator newFareCalculator = NewFareCalculator.this;
                newFareCalculator.e = new ProgressDialog((Context)newFareCalculator);
                NewFareCalculator.this.e.setMessage((CharSequence)"Calculating Fare..");
                NewFareCalculator.this.e.setCancelable(false);
                NewFareCalculator.this.e.show();
            }
        }.execute((Object[])new String[0]);
    }

    public void a(com.google.android.gms.maps.c c2) {
        c2.a(com.google.android.gms.maps.b.a((LatLng)this.I, (float)13.0f));
        this.M = c2;
    }

    public void calculatefare(View view) {
        this.M.b();
        Log.d((String)"anim", (String)"slidedown");
        Animation animation = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771995);
        this.t.startAnimation(animation);
        this.t.setVisibility(8);
        this.v.setAlpha(1.0f);
        this.w.setAlpha(1.0f);
        this.u.setAlpha(1.0f);
        this.l = null;
        this.m = null;
        this.n = null;
        this.f = this.h.getText().toString();
        this.g = this.i.getText().toString();
        new /* invalid duplicate definition of identical inner class */.execute((Object[])new String[0]);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n3 == -1) {
            Place place;
            if (n2 == this.J && intent != null) {
                Place place2 = Autocomplete.getPlaceFromIntent((Intent)intent);
                if (place2 != null) {
                    this.h.setText((CharSequence)place2.getName());
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(place2.getName());
                    this.f = stringBuilder.toString();
                    this.b = place2.getLatLng().a;
                    this.a = place2.getLatLng().b;
                    if (this.g != null) {
                        this.a();
                        return;
                    }
                }
            } else if (n2 == this.K && intent != null && (place = Autocomplete.getPlaceFromIntent((Intent)intent)) != null) {
                this.i.setText((CharSequence)place.getName());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(place.getName());
                this.g = stringBuilder.toString();
                this.c = place.getLatLng().a;
                this.d = place.getLatLng().b;
                if (this.f != null) {
                    this.a();
                }
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493088);
        if (!Places.isInitialized()) {
            Places.initialize((Context)this.getApplicationContext(), (String)"AIzaSyCz6QgtQ7mSG9NtfjOTyfrTY8pM9lSfTZA");
        }
        this.h = (TextView)this.findViewById(2131297409);
        this.i = (TextView)this.findViewById(2131296630);
        this.o = (TextView)this.findViewById(2131297587);
        this.p = (TextView)this.findViewById(2131297583);
        this.q = (TextView)this.findViewById(2131297584);
        this.r = (TextView)this.findViewById(2131297585);
        this.s = (TextView)this.findViewById(2131296751);
        this.t = (LinearLayout)this.findViewById(2131296750);
        this.u = (LinearLayout)this.findViewById(2131296394);
        this.v = (LinearLayout)this.findViewById(2131297470);
        this.w = (LinearLayout)this.findViewById(2131296587);
        this.j = (TextView)this.findViewById(2131296533);
        this.j.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        String string = ConfigurationManager.b(this.getApplicationContext());
        if (string.equalsIgnoreCase("mumbai")) {
            this.R = this.O;
            this.I = new LatLng(19.075984, 72.877656);
        } else if (string.equalsIgnoreCase("delhi")) {
            this.R = this.P;
            this.I = new LatLng(28.614283, 77.2130399);
        } else if (string.equalsIgnoreCase("pune")) {
            this.R = this.Q;
            this.I = new LatLng(18.52043, 73.8564007);
        } else {
            this.R = this.O;
            this.I = new LatLng(19.0759841, 72.8776561);
        }
        this.N = (CustomMapFragment)this.getSupportFragmentManager().a(2131296976);
        this.N.a((com.google.android.gms.maps.e)this);
        try {
            this.b();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.h.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ NewFareCalculator a;
            {
                this.a = newFareCalculator;
            }

            public void onClick(View view) {
                try {
                    Intent intent = new com.google.android.libraries.places.widget.Autocomplete$IntentBuilder(com.google.android.libraries.places.widget.model.AutocompleteActivityMode.FULLSCREEN, this.a.L).setLocationBias((com.google.android.libraries.places.api.model.LocationBias)com.google.android.libraries.places.api.model.RectangularBounds.newInstance((LatLngBounds)NewFareCalculator.a(this.a))).build((Context)this.a);
                    this.a.startActivityForResult(intent, this.a.J);
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
        });
        this.i.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ NewFareCalculator a;
            {
                this.a = newFareCalculator;
            }

            public void onClick(View view) {
                try {
                    Intent intent = new com.google.android.libraries.places.widget.Autocomplete$IntentBuilder(com.google.android.libraries.places.widget.model.AutocompleteActivityMode.FULLSCREEN, this.a.L).setLocationBias((com.google.android.libraries.places.api.model.LocationBias)com.google.android.libraries.places.api.model.RectangularBounds.newInstance((LatLngBounds)NewFareCalculator.a(this.a))).build((Context)this.a);
                    this.a.startActivityForResult(intent, this.a.K);
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
        });
    }

}

