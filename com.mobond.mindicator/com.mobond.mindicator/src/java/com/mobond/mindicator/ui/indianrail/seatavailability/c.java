/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.AsyncTask
 *  android.util.Log
 *  android.widget.Button
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Void
 *  java.net.ConnectException
 *  java.net.UnknownHostException
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.HashMap
 *  java.util.Vector
 *  java.util.concurrent.Executor
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.seatavailability;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mobond.mindicator.ui.indianrail.a.d;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mulo.util.e;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {
    public HashMap<String, com.mobond.mindicator.ui.indianrail.seatavailability.a.c> a;
    String b = "";
    ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.a> c;
    ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> d;
    ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> e;
    boolean f = false;
    private a g;
    private b h;
    private ActivitySeatStatus i;

    c(ActivitySeatStatus activitySeatStatus) {
        this.i = activitySeatStatus;
    }

    /*
     * Exception decompiling
     */
    static f a(Context var0, JSONObject var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl42 : ALOAD_3 : trying to set 1 previously set to 0
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

    static com.mobond.mindicator.ui.indianrail.seatavailability.a.b a(f f2, int n2, int n3, int n4, int n5, int n6) {
        int n7 = Integer.parseInt((String)f2.m.substring(0, 2));
        int n8 = Integer.parseInt((String)f2.m.substring(3));
        int n9 = Integer.parseInt((String)f2.p.substring(0, f2.p.indexOf("h ")));
        int n10 = Integer.parseInt((String)f2.p.substring(2 + f2.p.indexOf("h "), f2.p.indexOf("m")));
        Calendar calendar = Calendar.getInstance();
        calendar.set(n3, n4, n5, n7 + n9, n8 + n10);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n5);
        stringBuilder.append(" ");
        stringBuilder.append(ActivitySeatStatus.e[n4]);
        stringBuilder.append(" ");
        stringBuilder.append(ActivitySeatStatus.f[n6 - 1]);
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("");
        stringBuilder2.append(calendar.get(5));
        stringBuilder2.append(" ");
        stringBuilder2.append(ActivitySeatStatus.e[calendar.get(2)]);
        stringBuilder2.append(" ");
        stringBuilder2.append(ActivitySeatStatus.f[-1 + calendar.get(7)]);
        String string2 = stringBuilder2.toString();
        com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = new com.mobond.mindicator.ui.indianrail.seatavailability.a.b(f2, n2, null, "", string, string2);
        return b2;
    }

    private static String a(String string, boolean bl) {
        if (bl) {
            string = string.replace((CharSequence)"DAILY", (CharSequence)"\u092a\u094d\u0930\u0924\u093f\u0926\u093f\u0928").replace((CharSequence)"MON", (CharSequence)"\u0938\u094b\u092e").replace((CharSequence)"TUE", (CharSequence)"\u092e\u0902\u0917\u0932").replace((CharSequence)"WED", (CharSequence)"\u092c\u0941\u0927").replace((CharSequence)"THU", (CharSequence)"\u0917\u0941\u0930\u0941").replace((CharSequence)"FRI", (CharSequence)"\u0936\u0941\u0915\u094d\u0930").replace((CharSequence)"SAT", (CharSequence)"\u0936\u0928\u093f").replace((CharSequence)"SUN", (CharSequence)"\u0930\u0935\u093f");
        }
        return string;
    }

    private void b() {
        c c2 = this;
        synchronized (c2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            int n2 = 1;
            int n3 = calendar.get(n2);
            int n4 = 2;
            calendar2.set(n3, 4 + calendar.get(n4), calendar.get(5));
            int n5 = 0;
            for (int i2 = 0; i2 < 120; ++i2) {
                int n6 = calendar.get(7);
                int n7 = calendar.get(n2);
                int n8 = calendar.get(n4);
                int n9 = calendar.get(5);
                ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.a> arrayList = this.c;
                com.mobond.mindicator.ui.indianrail.seatavailability.a.a a2 = new com.mobond.mindicator.ui.indianrail.seatavailability.a.a(n6 - 1, n9, n8, n7, -1, e.a(n7, n8, n9));
                arrayList.add(n5, (Object)a2);
                calendar.set(n7, n8, n9 + 1);
                ++n5;
                n2 = 1;
                n4 = 2;
            }
            return;
        }
    }

    public void a() {
        try {
            if (this.g != null) {
                this.g.b();
                this.g.cancel(true);
                if (this.g.b != null) {
                    this.g.b.disconnect();
                }
            }
            if (this.h != null) {
                this.h.d();
                this.h.cancel(true);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    void a(String string, String string2) {
        this.g = new a(string, string2);
        this.g.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void b(Context var1_1, JSONObject var2_2) {
        var29_3 = this;
        // MONITORENTER : var29_3
        var4_4 = var1_1.getSharedPreferences("class_types_sp", 0);
        var5_5 = var2_2.getString("trainNo");
        var6_6 = var2_2.getString("fromStnCode");
        var7_7 = var2_2.getString("toStnCode");
        var8_8 = com.mobond.mindicator.ui.indianrail.a.a.a(var5_5, var1_1);
        var9_9 = var8_8 != null && var8_8.u != null ? var8_8.u : (var2_2.has("class") != false ? var2_2.getString("class") : var4_4.getString(var5_5, null));
        var10_10 = new com.mobond.mindicator.ui.indianrail.seatavailability.a.c();
        if (var9_9 == null) ** GOTO lbl19
        var10_10.b = var9_9.split(",");
        var11_11 = 0;
        do {
            if (var11_11 < var10_10.c.length) {
                if (var9_9.contains((CharSequence)var10_10.c[var11_11][0])) {
                    var10_10.c[var11_11][1] = "";
                }
            } else {
                d.a(var5_5, var2_2.getString("trainName"), var2_2.getString("trainType"), var6_6, var7_7, var10_10.b, var10_10.a, var8_8, var1_1);
lbl19: // 2 sources:
                this.a.put((Object)var5_5, (Object)var10_10);
                var13_12 = new StringBuilder();
                var13_12.append(this.b);
                if (this.b.isEmpty()) {
                    var15_13 = new StringBuilder();
                    var15_13.append(var5_5);
                    var15_13.append("-");
                    var15_13.append(var6_6);
                    var15_13.append("-");
                    var15_13.append(var7_7);
                } else {
                    var15_13 = new StringBuilder();
                    var15_13.append(",");
                    var15_13.append(var5_5);
                    var15_13.append("-");
                    var15_13.append(var6_6);
                    var15_13.append("-");
                    var15_13.append(var7_7);
                }
                var21_14 = var15_13.toString();
                var13_12.append(var21_14);
                this.b = var13_12.toString();
                // MONITOREXIT : var29_3
                return;
            }
            ++var11_11;
        } while (true);
    }

    void b(String string, String string2) {
        this.h = new b(string, string2);
        this.h.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    }

    public class a
    extends AsyncTask<Void, Integer, String> {
        private IRParserProvider b;
        private String c;
        private String d;
        private ArrayList<f> e;
        private ArrayList<f> f;
        private ArrayList<f> g;
        private ArrayList<f> h;
        private ArrayList<f> i;
        private ArrayList<f> j;
        private ArrayList<f> k;
        private int l;

        public a(String string, String string2) {
            this.c = string;
            this.d = string2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void a() {
            a a2 = this;
            synchronized (a2) {
                int n2 = 0;
                this.l = 0;
                if (c.this.c == null) {
                    c.this.b();
                }
                int n3 = c.this.c.size();
                do {
                    if (n2 >= n3) {
                        this.b();
                        return;
                    }
                    com.mobond.mindicator.ui.indianrail.seatavailability.a.a a3 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.a)c.this.c.get(n2);
                    int n4 = this.l;
                    int n5 = 1 + a3.c;
                    switch (n5) {
                        case 7: {
                            ArrayList<f> arrayList = this.k;
                            int n6 = a3.d;
                            int n7 = a3.b;
                            int n8 = a3.a;
                            this.a(arrayList, n2, n6, n7, n8, n5);
                            break;
                        }
                        case 6: {
                            ArrayList<f> arrayList = this.j;
                            int n9 = a3.d;
                            int n10 = a3.b;
                            int n11 = a3.a;
                            this.a(arrayList, n2, n9, n10, n11, n5);
                            break;
                        }
                        case 5: {
                            ArrayList<f> arrayList = this.i;
                            int n12 = a3.d;
                            int n13 = a3.b;
                            int n14 = a3.a;
                            this.a(arrayList, n2, n12, n13, n14, n5);
                            break;
                        }
                        case 4: {
                            ArrayList<f> arrayList = this.h;
                            int n15 = a3.d;
                            int n16 = a3.b;
                            int n17 = a3.a;
                            this.a(arrayList, n2, n15, n16, n17, n5);
                            break;
                        }
                        case 3: {
                            ArrayList<f> arrayList = this.g;
                            int n18 = a3.d;
                            int n19 = a3.b;
                            int n20 = a3.a;
                            this.a(arrayList, n2, n18, n19, n20, n5);
                            break;
                        }
                        case 2: {
                            ArrayList<f> arrayList = this.f;
                            int n21 = a3.d;
                            int n22 = a3.b;
                            int n23 = a3.a;
                            this.a(arrayList, n2, n21, n22, n23, n5);
                            break;
                        }
                        case 1: {
                            ArrayList<f> arrayList = this.e;
                            int n24 = a3.d;
                            int n25 = a3.b;
                            int n26 = a3.a;
                            this.a(arrayList, n2, n24, n25, n26, n5);
                            break;
                        }
                    }
                    a3.e = n4;
                    ++n2;
                } while (true);
            }
        }

        private void a(Context context, JSONArray jSONArray) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.g = new ArrayList();
            this.h = new ArrayList();
            this.i = new ArrayList();
            this.j = new ArrayList();
            this.k = new ArrayList();
            c.this.d = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("runsFromStn");
                if (string.equalsIgnoreCase("DAILY")) {
                    this.e.add((Object)c.a(context, jSONObject));
                    this.f.add((Object)c.a(context, jSONObject));
                    this.g.add((Object)c.a(context, jSONObject));
                    this.h.add((Object)c.a(context, jSONObject));
                    this.i.add((Object)c.a(context, jSONObject));
                    this.j.add((Object)c.a(context, jSONObject));
                    this.k.add((Object)c.a(context, jSONObject));
                    continue;
                }
                block10 : for (String string2 : string.split(",")) {
                    switch (1.a[ActivitySeatStatus.b.valueOf(string2.toUpperCase()).ordinal()]) {
                        default: {
                            continue block10;
                        }
                        case 7: {
                            this.k.add((Object)c.a(context, jSONObject));
                            continue block10;
                        }
                        case 6: {
                            this.j.add((Object)c.a(context, jSONObject));
                            continue block10;
                        }
                        case 5: {
                            this.i.add((Object)c.a(context, jSONObject));
                            continue block10;
                        }
                        case 4: {
                            this.h.add((Object)c.a(context, jSONObject));
                            continue block10;
                        }
                        case 3: {
                            this.g.add((Object)c.a(context, jSONObject));
                            continue block10;
                        }
                        case 2: {
                            this.f.add((Object)c.a(context, jSONObject));
                            continue block10;
                        }
                        case 1: {
                            this.e.add((Object)c.a(context, jSONObject));
                        }
                    }
                }
            }
        }

        private void a(ArrayList<f> arrayList, int n2, int n3, int n4, int n5, int n6) {
            a a2 = this;
            synchronized (a2) {
                for (f f2 : arrayList) {
                    c.this.d.add(this.l, (Object)c.a(f2, n2, n3, n4, n5, n6));
                    this.l = 1 + this.l;
                }
                return;
            }
        }

        private void b() {
            ArrayList<f> arrayList;
            ArrayList<f> arrayList2;
            ArrayList<f> arrayList3;
            ArrayList<f> arrayList4;
            ArrayList<f> arrayList5;
            ArrayList<f> arrayList6;
            ArrayList<f> arrayList7 = this.e;
            if (arrayList7 != null) {
                arrayList7.clear();
                this.e = null;
            }
            if ((arrayList5 = this.f) != null) {
                arrayList5.clear();
                this.f = null;
            }
            if ((arrayList3 = this.g) != null) {
                arrayList3.clear();
                this.g = null;
            }
            if ((arrayList2 = this.h) != null) {
                arrayList2.clear();
                this.h = null;
            }
            if ((arrayList4 = this.i) != null) {
                arrayList4.clear();
                this.i = null;
            }
            if ((arrayList6 = this.j) != null) {
                arrayList6.clear();
                this.j = null;
            }
            if ((arrayList = this.k) != null) {
                arrayList.clear();
                this.k = null;
            }
            System.gc();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private void b(String string) {
            JSONArray jSONArray;
            int n2;
            c.this.a = new HashMap();
            c.this.b = "";
            try {
                jSONArray = new JSONArray(string);
                n2 = 0;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            do {
                if (n2 >= jSONArray.length()) return;
                JSONObject jSONObject = jSONArray.getJSONObject(n2);
                c.this.b((Context)c.this.i, jSONObject);
                ++n2;
            } while (true);
        }

        protected /* varargs */ String a(Void ... arrvoid) {
            void var2_11;
            String string;
            block11 : {
                block10 : {
                    block9 : {
                        block8 : {
                            string = this.b.getTrainsList(this.c, this.d);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("trainsListJsonStr: ");
                            stringBuilder.append(string);
                            Log.d((String)"irseat", (String)stringBuilder.toString());
                            if (!this.isCancelled()) break block8;
                            return null;
                        }
                        Object[] arrobject = new Integer[]{25};
                        this.publishProgress(arrobject);
                        this.b(string);
                        if (!this.isCancelled()) break block9;
                        return null;
                    }
                    Object[] arrobject = new Integer[]{50};
                    this.publishProgress(arrobject);
                    this.a((Context)c.this.i, new JSONArray(string));
                    if (!this.isCancelled()) break block10;
                    return null;
                }
                Object[] arrobject = new Integer[]{75};
                this.publishProgress(arrobject);
                this.a();
                if (!this.isCancelled()) break block11;
                return null;
            }
            try {
                Object[] arrobject = new Integer[]{99};
                this.publishProgress(arrobject);
                return string;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
            catch (UnknownHostException unknownHostException) {
            }
            catch (ConnectException connectException) {
                // empty catch block
            }
            var2_11.printStackTrace();
            return "internetException";
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public void a(String var1_1) {
            block10 : {
                block11 : {
                    if (this.isCancelled()) break block10;
                    var6_2 = true;
                    if (var1_1 != null) break block11;
                    c.a((c)c.this).p.setText(2131755352);
                    ** GOTO lbl9
                }
                if (var1_1.equals((Object)"internetException")) {
                    c.a((c)c.this).p.setText(2131755220);
lbl9: // 2 sources:
                    var6_2 = false;
                } else if (!c.this.d.isEmpty()) {
                    var8_3 = c.this;
                    var8_3.f = var6_2;
                    c.a(var8_3).b();
                } else {
                    var7_4 = c.this;
                    var7_4.f = var6_2;
                    if (c.a(var7_4) != null) {
                        c.a((c)c.this).p.setText(2131755372);
                    }
                }
                if (var6_2) {
                    c.a((c)c.this).n.setVisibility(8);
                    c.a((c)c.this).p.setVisibility(8);
                    c.a((c)c.this).o.setVisibility(8);
                    return;
                }
                c.a((c)c.this).n.setVisibility(0);
                c.a((c)c.this).p.setVisibility(0);
                c.a((c)c.this).o.setVisibility(0);
                return;
            }
            var2_5 = c.this;
            var2_5.b = "";
            if (var2_5.d != null) {
                c.this.d.clear();
            }
            var3_6 = c.this;
            var3_6.d = null;
            if (var3_6.e != null) {
                c.this.e.clear();
            }
            var4_7 = c.this;
            var4_7.e = null;
            if (var4_7.c != null) {
                c.this.c.clear();
            }
            var5_8 = c.this;
            var5_8.c = null;
            if (var5_8.a != null) {
                c.this.a.clear();
            }
            c.this.a = null;
        }

        protected /* varargs */ void a(Integer ... arrinteger) {
            super.onProgressUpdate((Object[])arrinteger);
            c.a((c)c.this).n.setProgress(arrinteger[0].intValue());
        }

        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
            return this.a((Void[])arrobject);
        }

        public /* synthetic */ void onPostExecute(Object object) {
            this.a((String)object);
        }

        public void onPreExecute() {
            c.a((c)c.this).n.setVisibility(0);
            c.a((c)c.this).p.setVisibility(0);
            c.a((c)c.this).o.setVisibility(8);
            c.a((c)c.this).p.setText(2131755344);
            c.a((c)c.this).n.setProgress(1);
            this.b = IRParserProvider.getIRParser();
        }

        protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
            this.a((Integer[])arrobject);
        }
    }

    public class b
    extends AsyncTask<Void, Integer, Boolean> {
        private int b;
        private String c;
        private String d;
        private ArrayList<f> e;
        private ArrayList<f> f;
        private ArrayList<f> g;
        private ArrayList<f> h;
        private ArrayList<f> i;
        private ArrayList<f> j;
        private ArrayList<f> k;

        public b(String string, String string2) {
            this.c = string;
            this.d = string2;
        }

        private int a(String string) {
            String[] arrstring = string.split(":");
            int n2 = Integer.parseInt((String)arrstring[0]);
            return Integer.parseInt((String)arrstring[1]) + n2 * 60;
        }

        private int a(ArrayList<com.mobond.mindicator.ui.indianrail.seatavailability.a.b> arrayList) {
            int n2 = e.c();
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                int n3 = this.a(((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)arrayList.get((int)i2)).a.m);
                if (((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)arrayList.get((int)i2)).b == 0 && n3 >= n2) {
                    return i2;
                }
                if (((com.mobond.mindicator.ui.indianrail.seatavailability.a.b)arrayList.get((int)i2)).b != 1) continue;
                return i2 - 1;
            }
            return 0;
        }

        private void a() {
            c.this.a = new HashMap();
            for (int i2 = 0; i2 < d.a.size(); ++i2) {
                com.mobond.mindicator.ui.indianrail.a.c c2 = (com.mobond.mindicator.ui.indianrail.a.c)d.a.get(i2);
                f f2 = c2.h;
                String string = f2.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c2.i);
                stringBuilder.append(" - ");
                stringBuilder.append(c2.k);
                f2.o = stringBuilder.toString().toUpperCase();
                f2.q = c2.j;
                f2.m = c2.b;
                f2.n = c2.d;
                f2.b = c2.n;
                f2.c = c2.m;
                f2.p = c2.l;
                com.mobond.mindicator.ui.indianrail.seatavailability.a.c c3 = new com.mobond.mindicator.ui.indianrail.seatavailability.a.c();
                c.this.a.put((Object)string, (Object)c3);
            }
        }

        private void a(ArrayList<f> arrayList, int n2, int n3, int n4, int n5, int n6, int n7) {
            b b2 = this;
            synchronized (b2) {
                for (f f2 : arrayList) {
                    if (!this.a(f2.h, f2.i, n3)) continue;
                    c.this.e.add(this.b, (Object)c.a(f2, n2, n4, n5, n6, n7));
                    this.b = 1 + this.b;
                }
                return;
            }
        }

        private boolean a(int n2, int n3, int n4) {
            if (n2 == 0 && n3 == 0) {
                return true;
            }
            if (n2 == 0 && n3 > 0) {
                return n4 <= n3 + 2;
            }
            if (n2 > 0 && n3 == 0) {
                return n2 <= n4;
            }
            return n4 <= n3 + 2 && n2 <= n4;
        }

        private void b() {
            b b2 = this;
            synchronized (b2) {
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                this.h = new ArrayList();
                this.i = new ArrayList();
                this.j = new ArrayList();
                this.k = new ArrayList();
                c.this.e = new ArrayList();
                int n2 = 0;
                do {
                    if (n2 >= d.a.size()) break;
                    f f2 = ((com.mobond.mindicator.ui.indianrail.a.c)d.a.get((int)n2)).h;
                    this.e.add((Object)f2);
                    this.f.add((Object)f2);
                    this.g.add((Object)f2);
                    this.h.add((Object)f2);
                    this.i.add((Object)f2);
                    this.j.add((Object)f2);
                    this.k.add((Object)f2);
                    ++n2;
                } while (true);
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void c() {
            b b2 = this;
            synchronized (b2) {
                int n2 = 0;
                this.b = 0;
                if (c.this.c == null) {
                    c.this.b();
                }
                int n3 = c.this.c.size();
                do {
                    if (n2 >= n3) {
                        d.b = this.a(c.this.e);
                        this.d();
                        return;
                    }
                    com.mobond.mindicator.ui.indianrail.seatavailability.a.a a2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.a)c.this.c.get(n2);
                    int n4 = this.b;
                    int n5 = 1 + a2.c;
                    switch (n5) {
                        case 7: {
                            ArrayList<f> arrayList = this.k;
                            int n6 = a2.f;
                            int n7 = a2.d;
                            int n8 = a2.b;
                            int n9 = a2.a;
                            this.a(arrayList, n2, n6, n7, n8, n9, n5);
                            break;
                        }
                        case 6: {
                            ArrayList<f> arrayList = this.j;
                            int n10 = a2.f;
                            int n11 = a2.d;
                            int n12 = a2.b;
                            int n13 = a2.a;
                            this.a(arrayList, n2, n10, n11, n12, n13, n5);
                            break;
                        }
                        case 5: {
                            ArrayList<f> arrayList = this.i;
                            int n14 = a2.f;
                            int n15 = a2.d;
                            int n16 = a2.b;
                            int n17 = a2.a;
                            this.a(arrayList, n2, n14, n15, n16, n17, n5);
                            break;
                        }
                        case 4: {
                            ArrayList<f> arrayList = this.h;
                            int n18 = a2.f;
                            int n19 = a2.d;
                            int n20 = a2.b;
                            int n21 = a2.a;
                            this.a(arrayList, n2, n18, n19, n20, n21, n5);
                            break;
                        }
                        case 3: {
                            ArrayList<f> arrayList = this.g;
                            int n22 = a2.f;
                            int n23 = a2.d;
                            int n24 = a2.b;
                            int n25 = a2.a;
                            this.a(arrayList, n2, n22, n23, n24, n25, n5);
                            break;
                        }
                        case 2: {
                            ArrayList<f> arrayList = this.f;
                            int n26 = a2.f;
                            int n27 = a2.d;
                            int n28 = a2.b;
                            int n29 = a2.a;
                            this.a(arrayList, n2, n26, n27, n28, n29, n5);
                            break;
                        }
                        case 1: {
                            ArrayList<f> arrayList = this.e;
                            int n30 = a2.f;
                            int n31 = a2.d;
                            int n32 = a2.b;
                            int n33 = a2.a;
                            this.a(arrayList, n2, n30, n31, n32, n33, n5);
                            break;
                        }
                    }
                    a2.e = n4;
                    ++n2;
                } while (true);
            }
        }

        private void d() {
            b b2 = this;
            synchronized (b2) {
                if (this.e != null) {
                    this.e.clear();
                    this.e = null;
                }
                if (this.f != null) {
                    this.f.clear();
                    this.f = null;
                }
                if (this.g != null) {
                    this.g.clear();
                    this.g = null;
                }
                if (this.h != null) {
                    this.h.clear();
                    this.h = null;
                }
                if (this.i != null) {
                    this.i.clear();
                    this.i = null;
                }
                if (this.j != null) {
                    this.j.clear();
                    this.j = null;
                }
                if (this.k != null) {
                    this.k.clear();
                    this.k = null;
                }
                System.gc();
                return;
            }
        }

        protected /* varargs */ Boolean a(Void ... arrvoid) {
            try {
                com.mobond.mindicator.ui.indianrail.a.a.b((Context)c.this.i);
                if (this.isCancelled()) {
                    return false;
                }
                Object[] arrobject = new Integer[]{12};
                this.publishProgress(arrobject);
                d.a((Context)c.this.i, com.mobond.mindicator.ui.indianrail.a.a.a(this.c), com.mobond.mindicator.ui.indianrail.a.a.a(this.d), null);
                if (this.isCancelled()) {
                    return false;
                }
                Object[] arrobject2 = new Integer[]{25};
                this.publishProgress(arrobject2);
                this.a();
                if (this.isCancelled()) {
                    return false;
                }
                Object[] arrobject3 = new Integer[]{50};
                this.publishProgress(arrobject3);
                this.b();
                if (this.isCancelled()) {
                    return false;
                }
                Object[] arrobject4 = new Integer[]{75};
                this.publishProgress(arrobject4);
                this.c();
                if (this.isCancelled()) {
                    return false;
                }
                Object[] arrobject5 = new Integer[]{99};
                this.publishProgress(arrobject5);
                Boolean bl = true;
                return bl;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
        }

        public void a(Boolean bl) {
            if (!this.isCancelled()) {
                if (bl.booleanValue()) {
                    if (!c.this.e.isEmpty()) {
                        c.a((c)c.this).n.setVisibility(8);
                        c.a((c)c.this).p.setVisibility(8);
                        c.a((c)c.this).o.setVisibility(8);
                        c.this.i.a();
                        return;
                    }
                    if (c.this.i != null) {
                        c.a((c)c.this).n.setVisibility(0);
                        c.a((c)c.this).p.setVisibility(0);
                        c.a((c)c.this).o.setVisibility(0);
                        c.a((c)c.this).p.setText(2131755372);
                        return;
                    }
                }
            } else {
                c c2 = c.this;
                c2.b = "";
                if (c2.d != null) {
                    c.this.d.clear();
                }
                c c3 = c.this;
                c3.d = null;
                if (c3.e != null) {
                    c.this.e.clear();
                }
                c c4 = c.this;
                c4.e = null;
                if (c4.c != null) {
                    c.this.c.clear();
                }
                c c5 = c.this;
                c5.c = null;
                if (c5.a != null) {
                    c.this.a.clear();
                }
                c.this.a = null;
            }
        }

        protected /* varargs */ void a(Integer ... arrinteger) {
            super.onProgressUpdate((Object[])arrinteger);
            c.a((c)c.this).n.setProgress(arrinteger[0].intValue());
        }

        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
            return this.a((Void[])arrobject);
        }

        public /* synthetic */ void onPostExecute(Object object) {
            this.a((Boolean)object);
        }

        public void onPreExecute() {
            c.a((c)c.this).n.setVisibility(0);
            c.a((c)c.this).p.setVisibility(0);
            c.a((c)c.this).o.setVisibility(8);
            c.a((c)c.this).n.setProgress(1);
            c.a((c)c.this).p.setText(2131755344);
        }

        protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
            this.a((Integer[])arrobject);
        }
    }

}

