/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.location.Location
 *  android.telephony.CellLocation
 *  android.telephony.TelephonyManager
 *  android.util.Log
 *  androidx.core.app.a
 *  com.google.android.gms.maps.model.LatLng
 *  com.mobond.mindicator.ui.lt.trainutils.a.a$1
 *  com.mobond.mindicator.util.c
 *  com.mulo.a.d.j
 *  com.mulo.a.d.k
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.text.SimpleDateFormat
 *  java.util.AbstractList
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Hashtable
 *  java.util.Locale
 *  java.util.StringTokenizer
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.lt.trainutils.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.location.Location;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.b.a.b.e;
import com.b.a.b.i;
import com.b.a.b.l;
import com.b.a.b.r;
import com.google.android.gms.maps.model.LatLng;
import com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService;
import com.mobond.mindicator.ui.lt.trainutils.a.a;
import com.mobond.mindicator.ui.lt.trainutils.a.b;
import com.mobond.mindicator.ui.lt.trainutils.a.c;
import com.mulo.a.d.j;
import com.mulo.a.d.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    public static String a;
    com.b.a.b.a[] b = null;
    int c;
    private String d;
    private j[] e;
    private l f;
    private com.b.a.d.b g;
    private Hashtable<String, String> h;
    private boolean i;

    public a(j[] arrj, int n2, Context context) {
        j[] arrj2;
        this.c = n2;
        this.c(context);
        this.f = a.a(this.b(arrj), this.h, context);
        this.g = new com.b.a.d.b(this.f);
        this.i = a.a(arrj);
        j[] arrj3 = this.e = this.a(arrj, this.g);
        this.d = arrj3[arrj3.length - 1].a;
        this.b = new com.b.a.b.a[this.e.length];
        for (int i2 = 0; i2 < (arrj2 = this.e).length; ++i2) {
            String[] arrstring = ((String)this.h.get((Object)arrj2[i2].a)).split(",");
            String string = arrstring[0];
            String string2 = arrstring[1];
            this.b[i2] = new com.b.a.b.a();
            this.b[i2].a = Double.parseDouble((String)string);
            this.b[i2].b = Double.parseDouble((String)string2);
        }
    }

    private double a(String string, String string2, com.b.a.d.b b2) {
        com.b.a.b.a a2 = this.c(string);
        com.b.a.b.a a3 = this.c(string2);
        double d2 = b2.a(a2);
        return Math.abs((double)(b2.a(a3) - d2));
    }

    public static int a() {
        Calendar calendar = Calendar.getInstance();
        return 60 * calendar.get(11) + calendar.get(12);
    }

    private static long a(int n2, int n3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, n2);
        calendar.set(12, n3);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    private static long a(long l2) {
        return l2 + 86400000L;
    }

    static l a(String string) {
        String string2 = a.b(string);
        com.b.a.c.b b2 = new com.b.a.c.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LINESTRING (");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        e e2 = b2.a(stringBuilder.toString());
        return new i().b(e2.e());
    }

    public static l a(j[] arrj, Hashtable<String, String> hashtable, Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < arrj.length; ++i2) {
            String string = (String)hashtable.get((Object)arrj[i2].a);
            if (string != null) {
                stringBuffer.append(string);
                if (i2 >= -1 + arrj.length) continue;
                stringBuffer.append(a.a(arrj[i2].a, arrj[i2 + 1].a, context));
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception at ");
            stringBuilder.append(arrj[i2].a);
            throw new Exception(stringBuilder.toString());
        }
        return a.a(stringBuffer.toString());
    }

    public static String a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        if (androidx.core.app.a.b((Context)context, (String)"android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.app.a.b((Context)context, (String)"android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return null;
        }
        return a.a(telephonyManager.getCellLocation(), telephonyManager);
    }

    /*
     * Exception decompiling
     */
    private static String a(CellLocation var0, TelephonyManager var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl82.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    private static String a(String string, String string2, Context context) {
        boolean bl;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject(new String(com.mobond.mindicator.ui.indianrail.a.a.b(com.mulo.util.e.a(com.mulo.util.e.a((Object)context, "../ibt")))));
        Log.d((String)"inbetweenjson", (String)jSONObject.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("-");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        boolean bl2 = jSONObject.has(string3);
        int n2 = 0;
        if (bl2) {
            jSONArray = jSONObject.getJSONArray(string3);
            bl = false;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append("-");
            stringBuilder2.append(string);
            String string4 = stringBuilder2.toString();
            if (jSONObject.has(string4)) {
                jSONArray = jSONObject.getJSONArray(string4);
                bl = true;
            } else {
                jSONArray = null;
                bl = false;
            }
        }
        if (jSONArray != null) {
            if (bl) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = jSONArray.length() - 1; i2 >= 0; --i2) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(jSONArray.getString(i2));
                    stringBuilder3.append(",0 ");
                    stringBuffer.append(stringBuilder3.toString());
                }
                return stringBuffer.toString();
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (n2 < jSONArray.length()) {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(jSONArray.getString(n2));
                stringBuilder4.append(",0 ");
                stringBuffer.append(stringBuilder4.toString());
                ++n2;
            }
            return stringBuffer.toString();
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(String[] arrstring) {
        int n2;
        int n3;
        String string;
        long l2;
        long l3;
        String string2;
        block8 : {
            long l4;
            long l5;
            long l6;
            long l7;
            long l8;
            block7 : {
                try {
                    String string3 = arrstring[0].split("#")[0];
                    String string4 = arrstring[0].split("#")[1];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append(" ");
                    stringBuilder.append(string4);
                    string2 = stringBuilder.toString();
                    String string5 = arrstring[arrstring.length - 1].split("#")[0];
                    String string6 = arrstring[arrstring.length - 1].split("#")[1];
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string5);
                    stringBuilder2.append(" ");
                    stringBuilder2.append(string6);
                    string = stringBuilder2.toString();
                    l2 = System.currentTimeMillis();
                    l3 = a.a(a.d(string2), a.e(string2));
                    l7 = a.a(l3);
                    l6 = a.b(l3);
                    l5 = Math.abs((long)(l3 - l2));
                    l4 = Math.abs((long)(l7 - l2));
                    l8 = Math.abs((long)(l6 - l2));
                    if (l5 >= l4 || l5 >= l8) break block7;
                    break block8;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            if (l4 < l5 && l4 < l8) {
                l3 = l7;
            } else {
                if (l8 >= l5) return null;
                if (l8 >= l4) {
                    return null;
                }
                l3 = l6;
            }
        }
        long l9 = (n2 = 60 * (1000 * (60 * a.d(string2) + a.e(string2)))) < (n3 = 60 * (1000 * (60 * a.d(string) + a.e(string)))) ? (long)(n3 - n2) : (long)(n3 + 86400000 - n2);
        long l10 = l9 + l3;
        long l11 = l3 - 1200000L;
        long l12 = l10 + 3600000L;
        boolean bl = l11 <= l2;
        long l13 = l12 LCMP l2;
        boolean bl2 = false;
        if (l13 >= 0) {
            bl2 = true;
        }
        if (!bl) {
            return "Looks like train has not yet started.\nPlease select correct train.";
        }
        String string7 = null;
        if (bl2) return string7;
        return "Looks like train is reached Destination.\nPlease select correct train.";
    }

    public static boolean a(j[] arrj) {
        boolean bl = false;
        int n2 = 0;
        for (int i2 = 0; i2 < arrj.length; ++i2) {
            int n3 = arrj[i2].b;
            if (i2 != 0 && (n3 - n2 < 0 || bl)) {
                arrj[i2].b = 1440 + arrj[i2].b;
                bl = true;
            }
            n2 = n3;
        }
        return bl;
    }

    private j[] a(j[] arrj, com.b.a.d.b b2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < arrj.length; ++i2) {
            arrayList.add((Object)arrj[i2]);
            if (i2 >= -1 + arrj.length) continue;
            String string = arrj[i2].a;
            int n2 = i2 + 1;
            String string2 = arrj[n2].a;
            int n3 = arrj[n2].b - arrj[i2].b;
            double d2 = this.a(string, string2, b2);
            double d3 = n3;
            Double.isNaN((double)d3);
            double d4 = d2 / d3;
            ArrayList arrayList2 = com.mobond.mindicator.util.c.a((String)string, (String)string2);
            for (int i3 = 0; i3 < arrayList2.size(); ++i3) {
                String string3 = (String)arrayList2.get(i3);
                j j2 = new j();
                j2.a = string3;
                j2.b = (int)(this.a(string, string3, b2) / d4) + arrj[i2].b;
                arrayList.add((Object)j2);
            }
        }
        return (j[])arrayList.toArray((Object[])new j[arrayList.size()]);
    }

    private static long b(long l2) {
        return l2 - 86400000L;
    }

    public static String b(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        StringBuffer stringBuffer = new StringBuffer();
        while (stringTokenizer.hasMoreElements()) {
            String[] arrstring = stringTokenizer.nextToken().split(",");
            String string2 = arrstring[0];
            String string3 = arrstring[1];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            stringBuilder.append(",");
            stringBuffer.append(stringBuilder.toString());
        }
        String string4 = stringBuffer.toString();
        return string4.substring(0, string4.length() - 1);
    }

    public static Vector<String> b(Context context) {
        Vector vector = new Vector();
        String string = a.a(context);
        LatLng latLng = string != null && !string.isEmpty() ? InsideLocalTrainService.b(string, true) : null;
        Log.d((String)"55555", (String)"------------------");
        if (latLng != null) {
            Location location = new Location("B");
            location.setLatitude(latLng.a);
            location.setLongitude(latLng.b);
            a.a.a.a.c c2 = new a.a.a.a.c((Reader)new BufferedReader((Reader)new InputStreamReader(context.getAssets().open("mumbai/local/all_stations_lat_lon.csv"))));
            Vector vector2 = new Vector();
            do {
                String[] arrstring = c2.a();
                if (arrstring == null) break;
                String string2 = arrstring[0].trim();
                String string3 = arrstring[1].trim();
                String string4 = arrstring[2].trim();
                LatLng latLng2 = new LatLng(Double.parseDouble((String)string3), Double.parseDouble((String)string4));
                Location location2 = new Location("A");
                location2.setLatitude(latLng2.a);
                location2.setLongitude(latLng2.b);
                float f2 = location2.distanceTo(location);
                if (!(f2 < (float)5000)) continue;
                vector2.add((Object)new b(string2, f2));
            } while (true);
            new 1().a((AbstractList)vector2, true);
            for (int i2 = 0; i2 < vector2.size() && i2 < 2; ++i2) {
                vector.add((Object)((b)vector2.get((int)i2)).a);
                if (i2 != 0 || !(((b)vector2.get((int)i2)).b < (float)200)) continue;
                a = k.b((String)((b)vector2.get((int)i2)).a).toUpperCase();
            }
        }
        return vector;
    }

    private j[] b(j[] arrj) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < arrj.length; ++i2) {
            arrayList.add((Object)arrj[i2]);
            if (i2 >= -1 + arrj.length) continue;
            ArrayList arrayList2 = com.mobond.mindicator.util.c.a((String)arrj[i2].a, (String)arrj[i2 + 1].a);
            for (int i3 = 0; i3 < arrayList2.size(); ++i3) {
                String string = (String)arrayList2.get(i3);
                j j2 = new j();
                j2.a = string;
                arrayList.add((Object)j2);
            }
        }
        return (j[])arrayList.toArray((Object[])new j[arrayList.size()]);
    }

    private com.b.a.b.a c(String string) {
        String[] arrstring = ((String)this.h.get((Object)string)).split(",");
        com.b.a.b.a a2 = new com.b.a.b.a();
        a2.a = Double.valueOf((String)arrstring[0]);
        a2.b = Double.valueOf((String)arrstring[1]);
        return a2;
    }

    private void c(Context context) {
        String[] arrstring;
        this.h = new Hashtable();
        a.a.a.a.c c2 = new a.a.a.a.c((Reader)new BufferedReader((Reader)new InputStreamReader(context.getAssets().open("mumbai/local/all_stations_lat_lon.csv"))));
        while ((arrstring = c2.a()) != null) {
            String string = arrstring[0].trim();
            String string2 = arrstring[1].trim();
            String string3 = arrstring[2].trim();
            Hashtable<String, String> hashtable = this.h;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(",");
            stringBuilder.append(string2);
            stringBuilder.append(",0 ");
            hashtable.put((Object)string, (Object)stringBuilder.toString());
        }
    }

    private static int d(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        try {
            int n2 = Integer.parseInt((String)simpleDateFormat2.format(simpleDateFormat.parse(string)).split(":")[0]);
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    private static int e(String string) {
        return Integer.parseInt((String)string.split(" ")[0].split(":")[1]);
    }

    private static int f(String string) {
        if ("VAITARANA,SAPHALE,KELVA ROAD,PALGHAR,UMROLI ROAD,BOISAR,VANGAON,DAHANU ROAD,VADGAON,KANHE,KAMSHET,MALAVLI,LONAVLA,VASAI ROAD,JUCHANDRA ROAD,KAMAN ROAD,KHARBAO,BHIWANDI ROAD,KOPAR,DATIVALI,NILJE,TALOJA PANCHANAND,NAVADE ROAD,KALAMBOLI,AMBIVLI,TITWALA,KHADAVLI,VASIND,ULHAS NAGAR,AMBERNATH,BADLAPUR,VANGANI,SHELU,NERAL,BHIVPURI ROAD,KARJAT,PALASDHARI,KELAVLI,DOLAVLI,LOWJEE,KHOPOLI,ASANGAON,ATGAON,KHARDI,KASARA,NERAL,JUMAPATTI,WATERPIPE,AMAN LODGE,MATHERAN,SOMTANE,RASAYANI,APTA,JITE,HAMARAPUR,PEN,KASU,NAGOTHANE,NIDI,ROHA".contains((CharSequence)string)) {
            return 3000;
        }
        return 1000;
    }

    public c a(LatLng latLng) {
        double d2 = latLng.a;
        double d3 = latLng.b;
        c c2 = new c();
        int n2 = a.a();
        if (this.i && n2 < 360) {
            n2 += 1440;
        }
        int n3 = this.e[0].b;
        j[] arrj = this.e;
        int n4 = arrj[arrj.length - 1].b;
        if (n3 - n2 > 60) {
            c2.j = false;
            c2.k = "Please check proper train is selected or not.";
        } else if (n2 - n4 > 60) {
            c2.j = false;
            c2.k = "Please check proper train is selected or not.";
        }
        if (c2.j) {
            double d4;
            com.b.a.b.a a2;
            double d5;
            int n5;
            double d6;
            double d7;
            int n6;
            block26 : {
                com.b.a.b.a[] arra;
                a2 = new com.b.a.b.a(d3, d2);
                d4 = this.g.b(a2);
                n6 = 0;
                while (n6 < (arra = this.b).length - 1) {
                    com.b.a.b.a a3 = arra[n6];
                    n5 = n6 + 1;
                    com.b.a.b.a a4 = arra[n5];
                    d7 = this.g.a(a3);
                    d6 = this.g.a(a4);
                    if (!(d7 <= d4) || !(d4 <= d6)) {
                        n6 = n5;
                        continue;
                    }
                    break block26;
                }
                d6 = d7 = 0.0;
                n6 = 0;
                n5 = 0;
            }
            r r2 = new i().a(a2);
            c2.i = d5 = 100.0 * com.b.a.f.a.b.a(this.f, r2) / 9.0E-4;
            int n7 = a.f(this.e[n6].a);
            int n8 = n2;
            if (d5 > (double)n7) {
                c2.j = false;
            }
            if (c2.j) {
                boolean bl;
                int n9;
                double d8 = d6 - d7;
                if (d8 == 0.0) {
                    n9 = this.e[n5].b;
                } else {
                    double d9 = this.e[n5].b - this.e[n6].b;
                    Double.isNaN((double)d9);
                    double d10 = d8 / d9;
                    n9 = (int)((d4 - d7) / d10) + this.e[n6].b;
                }
                int n10 = 10;
                if (d4 < 0.0045) {
                    n10 = 60;
                    bl = true;
                } else {
                    bl = false;
                }
                if (n9 - n8 > n10) {
                    c2.j = false;
                    c2.k = "Please check proper train is selected or not.";
                }
                if (c2.j) {
                    String string;
                    String string2;
                    double d11;
                    String string3 = this.e[n6].a;
                    String string4 = this.e[n5].a;
                    boolean bl2 = this.c == 2 && this.d.equals((Object)"BORIVALI") && string4.equals((Object)"BORIVALI") && d6 - d4 <= 0.00765;
                    if (this.c == 2 && this.d.equals((Object)"VIRAR") && string4.equals((Object)"VIRAR") && d6 - d4 <= 0.00675) {
                        bl2 = true;
                    }
                    if ((d11 = d4 - d7) <= 0.00225) {
                        string = "0";
                        string2 = string3;
                    } else {
                        double d12 = d6 - d4;
                        if (!(d12 <= 0.0045) && !bl2) {
                            if (d11 <= 0.0063) {
                                string = "1";
                                string2 = null;
                            } else if (d12 <= 0.009) {
                                string = "3";
                                string2 = null;
                            } else {
                                string = "2";
                                string2 = null;
                            }
                        } else {
                            string = "0";
                            string2 = string4;
                        }
                    }
                    int n11 = n8 - n9;
                    c2.a = d4;
                    c2.b = string2;
                    c2.c = string3;
                    c2.d = string4;
                    c2.e = string;
                    if (bl) {
                        if (n11 < 0) {
                            c2.f = 0;
                            return c2;
                        }
                        c2.f = n11;
                        return c2;
                    }
                    c2.f = n11;
                }
            }
        }
        return c2;
    }
}

