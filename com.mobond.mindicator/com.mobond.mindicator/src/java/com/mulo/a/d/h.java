/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.crashlytics.android.Crashlytics
 *  java.io.ByteArrayOutputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.AbstractList
 *  java.util.Calendar
 *  java.util.Collections
 *  java.util.Hashtable
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mulo.a.d;

import com.crashlytics.android.Crashlytics;
import com.mulo.a.d.a;
import com.mulo.a.d.c;
import com.mulo.a.d.e;
import com.mulo.a.d.f;
import com.mulo.a.d.j;
import com.mulo.a.d.k;
import com.mulo.util.b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.AbstractList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class h {
    public static final String[] a = new String[]{"VADALA ROAD", "KINGS CIRCLE", "MAHIM JN", "BANDRA", "KHAR ROAD", "SANTA CRUZ", "VILE PARLE", "ANDHERI", "JOGESHWARI", "RAM MANDIR", "GOREGAON"};
    public static final String[] b = new String[]{"GTB NAGAR", "CHUNABHATTI", "KURLA", "TILAKNAGAR", "CHEMBUR", "GOVANDI", "MANKHURD", "VASHI", "SANPADA", "JUINAGAR", "NERUL", "SEAWOOD DARAVE", "BELAPUR CBD", "KHARGHAR", "MANASAROVAR", "KHANDESHWAR", "PANVEL"};
    public static String c = "LAST SEARCH";
    public static int d = 1;
    public static int e = 2;
    public static int f = 3;
    public static int g = 4;
    public static Hashtable<String, f> h = null;
    public static Hashtable<String, Vector<String>> i = null;
    public static Hashtable<String, String> j = null;
    public static String k;
    static Vector<String> l;
    static String[] m;

    private static int a(String string) {
        String[] arrstring;
        if (string.equals((Object)"VADALA ROAD")) {
            return 4;
        }
        int n2 = 0;
        do {
            String[] arrstring2 = a;
            int n3 = arrstring2.length;
            if (n2 >= n3) break;
            if (string.equals((Object)arrstring2[n2])) {
                return 1;
            }
            ++n2;
        } while (true);
        for (int i2 = 0; i2 < (arrstring = b).length; ++i2) {
            if (!string.equals((Object)arrstring[i2])) continue;
            return 2;
        }
        return 3;
    }

    private static a a(String string, int n2, String string2, Calendar calendar, InputStream inputStream, f f2, boolean bl) {
        a a2 = new a();
        byte[] arrby = new byte[4];
        while (inputStream.available() != 0) {
            inputStream.read(arrby, 0, arrby.length);
            int n3 = (255 & arrby[2]) + ((15 & arrby[1]) << 8);
            a2.c.add((Object)n3);
            int n4 = ((255 & arrby[0]) << 4) + ((240 & arrby[1]) >>> 4);
            a2.d.add((Object)n4);
            String string3 = (String)f2.k.get((Object)n3);
            if (string3 == null) {
                string3 = "";
            }
            a2.h.add((Object)string3);
        }
        inputStream.close();
        return a2;
    }

    private static a a(String string, int n2, String string2, Calendar calendar, InputStream inputStream, f f2, boolean bl, String string3) {
        String string4 = string2;
        a a2 = new a();
        k[] arrk = f2.d();
        byte[] arrby = new byte[4];
        Vector vector = new Vector();
        int n3 = 60 * calendar.get(11) + calendar.get(12);
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        boolean bl2 = false;
        int n7 = 0;
        int n8 = 0;
        while (inputStream.available() != 0) {
            int n9;
            boolean bl3;
            int n10;
            int n11;
            inputStream.read(arrby, 0, arrby.length);
            int n12 = (255 & arrby[2]) + ((15 & arrby[1]) << 8);
            int n13 = n12 - 1;
            if (string.equals((Object)"H")) {
                String string5 = arrk[n13].b;
                n11 = n12;
                n9 = n4;
                n10 = n5;
                bl3 = h.a(string, string2, string3, string5, arrk, n13, n2);
            } else {
                n11 = n12;
                n9 = n4;
                n10 = n5;
                bl3 = h.a(arrk, n13, n2, string4);
            }
            if (!bl && !bl3) {
                n4 = n9;
                n5 = n10;
            } else {
                String string6;
                int n14;
                int n15;
                String string7;
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                int n21 = ((255 & arrby[0]) << 4) + ((240 & arrby[1]) >>> 4);
                a2.d.add((Object)n21);
                a2.c.add((Object)n11);
                String string8 = (String)f2.k.get((Object)n11);
                if (string8 == null) {
                    string8 = "";
                }
                a2.h.add((Object)string8);
                if (!bl2 && n3 - n21 <= 0) {
                    n6 = vector.size();
                    bl2 = true;
                }
                if ((n18 = n21 / 60) == 0) {
                    string7 = " AM";
                    n18 = 12;
                } else if (n18 >= 12) {
                    if (n18 > 12) {
                        n18 -= 12;
                    }
                    string7 = " PM";
                } else {
                    string7 = " AM";
                }
                int n22 = n21 % 60;
                StringBuffer stringBuffer = new StringBuffer(61);
                if (n21 < 360) {
                    int n23 = n21 - n7;
                    n17 = n9;
                    if (n23 > n17) {
                        n17 = n23;
                        n10 = n8;
                    }
                    ++n8;
                } else {
                    n17 = n9;
                    n21 = n7;
                }
                String string9 = arrk[n13].e;
                if (string9.startsWith("(BO ")) {
                    if (!string4.equals((Object)"BO") && !string4.equals((Object)"BORIVALI")) {
                        int n24;
                        String string10 = arrk[n13].b;
                        n7 = n21;
                        if (!string10.equals((Object)"BO") && !arrk[n13].b.equals((Object)"BORIVALI") && (n24 = 1 + string9.indexOf(")", 0)) < string9.length()) {
                            string9 = string9.substring(n24, string9.length()).trim();
                        }
                    } else {
                        n7 = n21;
                    }
                } else {
                    n7 = n21;
                }
                if (string9.startsWith("(VR ") && !string4.equals((Object)"VIRAR") && !arrk[n13].b.equals((Object)"VIRAR") && (n16 = 1 + string9.indexOf(")", 0)) < string9.length()) {
                    string9 = string9.substring(n16, string9.length()).trim();
                }
                if (string9.startsWith("(KYN ") && !string4.equals((Object)"KALYAN") && !arrk[n13].b.equals((Object)"KALYAN") && (n14 = 1 + string9.indexOf(")", 0)) < string9.length()) {
                    string9 = string9.substring(n14, string9.length()).trim();
                }
                byte by = arrby[3];
                int n25 = 31 & by >> 3;
                String string11 = "";
                String string12 = "";
                if (n25 > 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    n20 = n17;
                    stringBuilder.append("");
                    stringBuilder.append(n25);
                    string11 = stringBuilder.toString();
                } else {
                    n20 = n17;
                }
                boolean bl4 = (by & 4) == 4;
                if (bl4) {
                    byte[] arrby2 = new byte[]{arrby[0], arrby[1], arrby[2]};
                    String string13 = com.mulo.util.e.a(arrby2);
                    e e2 = (e)f2.j.get((Object)string13);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(e2.a);
                    String string14 = stringBuilder.toString();
                    string12 = e2.b;
                    string6 = string14;
                } else {
                    string6 = string11;
                }
                int n26 = by & 3;
                if (n26 == 1) {
                    string12 = "L";
                    n19 = 2;
                } else {
                    n19 = 2;
                }
                if (n26 == n19) {
                    string12 = "R";
                    n15 = 3;
                } else {
                    n15 = 3;
                }
                String string15 = n26 == n15 ? "B" : string12;
                arrk[n13].e = string9;
                String string16 = arrk[n13].d;
                if (!string16.equals((Object)"")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(arrk[n13].d);
                    stringBuilder.append("  ");
                    string16 = stringBuilder.toString();
                }
                if (n22 < 10) {
                    if (n18 < 10) {
                        stringBuffer.append("0");
                        stringBuffer.append(n18);
                        stringBuffer.append(":0");
                        stringBuffer.append(n22);
                        stringBuffer.append(string7);
                        if (!string.equals((Object)"MM1WD")) {
                            stringBuffer.append("  ");
                            stringBuffer.append(c.a(arrk[n13].c, c.a));
                            stringBuffer.append("   ");
                            stringBuffer.append(string16);
                            stringBuffer.append("                              #");
                            stringBuffer.append(n11);
                        } else {
                            int n27 = n11;
                            stringBuffer.append("                              #");
                            stringBuffer.append(n27);
                        }
                    } else {
                        int n28 = n11;
                        stringBuffer.append(n18);
                        stringBuffer.append(":0");
                        stringBuffer.append(n22);
                        stringBuffer.append(string7);
                        if (!string.equals((Object)"MM1WD")) {
                            stringBuffer.append("  ");
                            stringBuffer.append(c.a(arrk[n13].c, c.a));
                            stringBuffer.append("   ");
                            stringBuffer.append(string16);
                            stringBuffer.append("                              #");
                            stringBuffer.append(n28);
                        } else {
                            stringBuffer.append("                              #");
                            stringBuffer.append(n28);
                        }
                    }
                } else {
                    int n29 = n11;
                    if (n18 < 10) {
                        stringBuffer.append("0");
                        stringBuffer.append(n18);
                        stringBuffer.append(":");
                        stringBuffer.append(n22);
                        stringBuffer.append(string7);
                        if (!string.equals((Object)"MM1WD")) {
                            stringBuffer.append("  ");
                            stringBuffer.append(c.a(arrk[n13].c, c.a));
                            stringBuffer.append("   ");
                            stringBuffer.append(string16);
                            stringBuffer.append("                              #");
                            stringBuffer.append(n29);
                        } else {
                            stringBuffer.append("                              #");
                            stringBuffer.append(n29);
                        }
                    } else {
                        stringBuffer.append(n18);
                        stringBuffer.append(":");
                        stringBuffer.append(n22);
                        stringBuffer.append(string7);
                        if (!string.equals((Object)"MM1WD")) {
                            stringBuffer.append("  ");
                            stringBuffer.append(c.a(arrk[n13].c, c.a));
                            stringBuffer.append("   ");
                            stringBuffer.append(string16);
                            stringBuffer.append("                              #");
                            stringBuffer.append(n29);
                        } else {
                            stringBuffer.append("                              #");
                            stringBuffer.append(n29);
                        }
                    }
                }
                vector.addElement((Object)stringBuffer.toString());
                if (!a2.g.contains((Object)c.a(arrk[n13].c, c.a))) {
                    a2.g.add((Object)c.a(arrk[n13].c, c.a));
                }
                a2.e.add((Object)string6);
                a2.f.add((Object)string15);
                n5 = n10;
                n4 = n20;
            }
            string4 = string2;
        }
        int n30 = n6;
        for (int i2 = 0; i2 < n5; ++i2) {
            Object object = vector.elementAt(0);
            vector.removeElementAt(0);
            vector.addElement(object);
            Integer n31 = (Integer)a2.d.elementAt(0);
            a2.d.removeElementAt(0);
            a2.d.addElement((Object)n31);
            String string17 = (String)a2.e.elementAt(0);
            a2.e.removeElementAt(0);
            a2.e.addElement((Object)string17);
            String string18 = (String)a2.f.elementAt(0);
            a2.f.removeElementAt(0);
            a2.f.addElement((Object)string18);
            Integer n32 = (Integer)a2.c.elementAt(0);
            a2.c.removeElementAt(0);
            a2.c.addElement((Object)n32);
            String string19 = (String)a2.h.elementAt(0);
            a2.h.removeElementAt(0);
            a2.h.addElement((Object)string19);
            if (--n30 >= 0) continue;
            n30 = vector.size() - 1;
        }
        Object[] arrobject = new String[vector.size()];
        vector.copyInto(arrobject);
        inputStream.close();
        a2.a = arrobject;
        a2.b = n30;
        Collections.sort(a2.g);
        return a2;
    }

    public static a a(String string, int n2, String string2, Calendar calendar, Boolean bl, Object object) {
        f f2 = h.b(string, object);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("local/");
            stringBuilder.append(f2.d);
            stringBuilder.append("/");
            stringBuilder.append(string2);
            a a2 = h.a(string, n2, string2, calendar, com.mulo.util.e.a(object, stringBuilder.toString()), f2, bl);
            return a2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static a a(String string, int n2, String string2, Calendar calendar, Boolean bl, String string3, Object object) {
        f f2 = h.b(string, object);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("local/");
            stringBuilder.append(f2.d);
            stringBuilder.append("/");
            stringBuilder.append(string2);
            a a2 = h.a(string, n2, string2, calendar, com.mulo.util.e.a(object, stringBuilder.toString()), f2, bl, string3);
            return a2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static f a(String string, InputStream inputStream) {
        int n2;
        f f2 = new f();
        f2.d = string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[4096];
        while (-1 != (n2 = inputStream.read(arrby))) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        b b2 = new b(byteArrayOutputStream.toByteArray());
        int n3 = b2.d(0);
        String string2 = b2.c(4, n3);
        int n4 = n3 + 4;
        f2.f = string2.split(",");
        byte by = b2.a(n4);
        int n5 = n4 + 1;
        f2.g = b2.c(n5, by);
        int n6 = n5 + by;
        byte by2 = b2.a(n6);
        int n7 = n6 + 1;
        f2.h = b2.c(n7, by2);
        int n8 = n7 + by2;
        int n9 = b2.d(n8);
        int n10 = n8 + 4;
        int n11 = n9 + n10;
        Vector vector = new Vector();
        while (n10 < n11) {
            short s2 = b2.b(n10);
            int n12 = n10 + 2;
            String string3 = f2.f[s2];
            short s3 = b2.b(n12);
            int n13 = n12 + 2;
            String string4 = f2.f[s3];
            byte by3 = b2.a(n13);
            int n14 = n13 + 1;
            byte by4 = b2.a(n14);
            int n15 = n14 + 1;
            String string5 = b2.c(n15, by4);
            int n16 = n15 + by4;
            byte by5 = b2.a(n16);
            int n17 = n16 + 1;
            String string6 = b2.c(n17, by5);
            n10 = n17 + by5;
            k k2 = new k(string3, string4, string5, string6, by3);
            vector.add((Object)k2);
        }
        f2.i = new k[vector.size()];
        vector.copyInto((Object[])f2.i);
        int n18 = b2.d(n11);
        int n19 = n11 + 4;
        String string7 = b2.c(n19, n18);
        int n20 = n19 + n18;
        String[] arrstring = string7.split(",", -1);
        int n21 = 0;
        while (n21 < arrstring.length - 1) {
            String string8 = arrstring[n21];
            int n22 = n21 + 1;
            String string9 = arrstring[n22];
            int n23 = n22 + 1;
            String string10 = arrstring[n23];
            n21 = n23 + 1;
            f2.j.put((Object)string8, (Object)new e(string9, string10));
        }
        int n24 = b2.d(n20);
        String[] arrstring2 = b2.c(n20 + 4, n24).trim().split("\n", -1);
        for (int i2 = 0; i2 < arrstring2.length; ++i2) {
            String[] arrstring3 = arrstring2[i2].split(",");
            if (arrstring3[0].equals((Object)"")) continue;
            int n25 = Integer.parseInt((String)arrstring3[0]);
            String string11 = arrstring3[1];
            f2.k.put((Object)n25, (Object)string11);
        }
        return f2;
    }

    public static String a(String string, String string2, String string3, Object object) {
        String[] arrstring = h.a(string, string2, object);
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].split("#")[2].equals((Object)string3)) continue;
            return arrstring[i2];
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Vector a(int var0, String[] var1_1, String var2_2, f var3_3, Object var4_4) {
        block14 : {
            block15 : {
                var5_5 = new Vector();
                var6_6 = var1_1.length;
                var7_7 = 0;
                for (var8_8 = 0; var8_8 < var6_6; ++var8_8) {
                    h.a(var0, var8_8, var5_5, true, var1_1, var2_2, var3_3, var4_4);
                }
                new com.mulo.util.f(){

                    @Override
                    public boolean a(int n2, int n3, AbstractList abstractList) {
                        return ((j)abstractList.get((int)n2)).b > ((j)abstractList.get((int)n3)).b;
                    }
                }.a((AbstractList)var5_5, true);
                var9_9 = -1;
                var10_10 = 0;
lbl13: // 2 sources:
                do {
                    if (var10_10 >= var5_5.size() - 1) break block14;
                    var19_11 = ((j)var5_5.elementAt((int)var10_10)).b;
                    var20_12 = var10_10 + 1;
                    var21_13 = ((j)var5_5.elementAt((int)var20_12)).b;
                    if (var2_2.equals((Object)"NM") || var21_13 - var19_11 <= 60) break block15;
                    var9_9 = var10_10;
                    break block14;
                    break;
                } while (true);
lbl23: // 1 sources:
                do {
                    if (var11_14 <= var9_9) {
                        var12_15 = var5_5.elementAt(0);
                        var5_5.removeElementAt(0);
                        var5_5.addElement(var12_15);
                        ++var11_14;
                        continue;
                    }
lbl31: // 3 sources:
                    do {
                        try {
                            var13_16 = new Vector(var5_5.size());
                            while (var7_7 < var5_5.size()) {
                                var14_17 = (j)var5_5.elementAt(var7_7);
                                var15_18 = new StringBuilder();
                                var15_18.append(var14_17.c);
                                var15_18.append("#");
                                var15_18.append(var14_17.b);
                                var13_16.addElement((Object)var15_18.toString());
                            }
                        }
                        catch (Exception v0) {
                            return null;
                        }
                        {
                            ++var7_7;
                            continue;
                        }
                        return var13_16;
                        break;
                    } while (true);
                    break;
                } while (true);
            }
            var10_10 = var20_12;
            ** while (true)
        }
        ** while (var9_9 < 0)
lbl51: // 1 sources:
        var11_14 = 0;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void a(int var0, int var1, Vector var2, boolean var3, String[] var4, String var5, f var6, Object var7) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl329.3 : FAKE_TRY : trying to set 1 previously set to 0
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
    private static boolean a(String string, String string2, String string3, String string4, k[] arrk, int n2, int n3) {
        if (string4.contains((CharSequence)string2)) {
            return false;
        }
        int n4 = 1;
        if (string3 == null) return (boolean)n4;
        int n5 = h.a(string2);
        if (n5 == n4) {
            if (string3.contains((CharSequence)"PANVEL") && string3.contains((CharSequence)"ANDHERI") && string3.contains((CharSequence)"GOREGAON")) {
                if (string4.equals((Object)"ANDHERI")) return (boolean)n4;
                if (string4.equals((Object)"BANDRA")) return (boolean)n4;
                if (string4.equals((Object)"GOREGAON")) return (boolean)n4;
                if (!string4.equals((Object)"PANVEL")) return (boolean)0;
                return (boolean)n4;
            }
            if (string3.equals((Object)"PANVEL")) {
                return string4.equals((Object)"PANVEL");
            }
            if (!string3.contains((CharSequence)"ANDHERI") && !string3.contains((CharSequence)"GOREGAON")) {
                if (!string3.equals((Object)"CSMT")) return (boolean)n4;
                if (string4.equals((Object)"ANDHERI")) return false;
                if (string4.equals((Object)"GOREGAON")) return false;
                if (string4.equals((Object)"BANDRA")) return false;
                return (boolean)n4;
            }
            if (string4.equals((Object)"ANDHERI")) return (boolean)n4;
            if (string4.equals((Object)"BANDRA")) return (boolean)n4;
            if (!string4.equals((Object)"GOREGAON")) return (boolean)0;
            return (boolean)n4;
        }
        if (n5 == 2) {
            if (!string3.contains((CharSequence)"ANDHERI") && !string3.contains((CharSequence)"GOREGAON")) {
                if (string3.equals((Object)"PANVEL")) {
                    if (string4.equals((Object)"ANDHERI")) return false;
                    if (string4.equals((Object)"GOREGAON")) return false;
                    if (string4.equals((Object)"CSMT")) return false;
                    if (string4.equals((Object)"VADALA ROAD")) return false;
                    if (!string4.equals((Object)"JUINAGAR")) return h.a(arrk, n2, n3, string2);
                    return false;
                }
                if (!string3.contains((CharSequence)"CSMT")) return (boolean)n4;
                return h.a(arrk, n2, n3, string2);
            }
            if (string3.contains((CharSequence)"PANVEL")) {
                if (string4.equals((Object)"ANDHERI")) return (boolean)n4;
                if (string4.equals((Object)"BANDRA")) return (boolean)n4;
                if (string4.equals((Object)"GOREGAON")) return (boolean)n4;
                if (string4.equals((Object)"PANVEL")) return (boolean)n4;
                if (string4.equals((Object)"VASHI")) return (boolean)n4;
                if (string4.equals((Object)"MANKHURD")) return (boolean)n4;
                if (string4.equals((Object)"BELAPUR CBD")) return (boolean)n4;
                if (!string4.equals((Object)"CHEMBUR")) return (boolean)0;
                return (boolean)n4;
            }
            if (string4.equals((Object)"ANDHERI")) return (boolean)n4;
            if (string4.equals((Object)"BANDRA")) return (boolean)n4;
            if (!string4.equals((Object)"GOREGAON")) return (boolean)0;
            return (boolean)n4;
        }
        if (n5 == 3) {
            if (!string3.contains((CharSequence)"CSMT")) return (boolean)(n4 ^ string4.equals((Object)"CSMT"));
            return string4.equals((Object)"CSMT");
        }
        if (n5 != 4) return (boolean)n4;
        if (!(string3.contains((CharSequence)"PANVEL") || string3.contains((CharSequence)"ANDHERI") || string3.contains((CharSequence)"GOREGAON"))) {
            if (!string3.equals((Object)"CSMT")) return (boolean)n4;
            return string4.equals((Object)"CSMT");
        }
        if (string4.equals((Object)"ANDHERI")) return (boolean)n4;
        if (string4.equals((Object)"BANDRA")) return (boolean)n4;
        if (string4.equals((Object)"GOREGAON")) return (boolean)n4;
        if (string4.equals((Object)"PANVEL")) return (boolean)n4;
        if (string4.equals((Object)"VASHI")) return (boolean)n4;
        if (string4.equals((Object)"MANKHURD")) return (boolean)n4;
        if (string4.equals((Object)"BELAPUR CBD")) return (boolean)n4;
        if (!string4.equals((Object)"CHEMBUR")) return (boolean)0;
        return (boolean)n4;
    }

    private static boolean a(k[] arrk, int n2, int n3, String string) {
        boolean bl;
        block5 : {
            block4 : {
                if (arrk[n2].b.contains((CharSequence)string)) {
                    return false;
                }
                if (arrk[n2].f == n3 || arrk[n2].f == f) break block4;
                byte by = arrk[n2].f;
                int n4 = g;
                bl = false;
                if (by != n4) break block5;
            }
            bl = true;
        }
        return bl;
    }

    public static String[] a(Object object) {
        int n2;
        String[] arrstring;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(new String(com.mulo.util.e.a(com.mulo.util.e.a(object, "../config.json"))));
            n2 = jSONObject.getJSONArray("local").length();
            arrstring = new String[n2];
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String[0];
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            arrstring[i2] = jSONObject.getJSONArray("local").get(i2).toString();
        }
        return arrstring;
    }

    public static String[] a(String string, int n2, Object object) {
        String[] arrstring = h.b(string, object).a();
        if (n2 == d) {
            arrstring = com.mulo.util.e.a(arrstring);
        }
        return arrstring;
    }

    public static String[] a(String string, Object object) {
        f f2 = h.b(string, object);
        String[] arrstring = new String[]{f2.b(), f2.c()};
        return arrstring;
    }

    public static String[] a(String string, String string2, Object object) {
        f f2 = h.b(string, object);
        String[] arrstring = f2.a();
        String string3 = f2.d;
        Vector vector = h.a(Integer.parseInt((String)string2.substring(1 + string2.indexOf("#"))), arrstring, string3, f2, object);
        Object[] arrobject = new String[vector.size()];
        vector.copyInto(arrobject);
        return arrobject;
    }

    public static f b(String string, Object object) {
        if (h == null) {
            h = new Hashtable();
        }
        if (h.containsKey((Object)string)) {
            return (f)h.get((Object)string);
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("local/");
            stringBuilder.append(string);
            stringBuilder.append("/index");
            f f2 = h.a(string, com.mulo.util.e.a(object, stringBuilder.toString()));
            h.put((Object)string, (Object)f2);
            return f2;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception : ");
            stringBuilder.append(exception.getMessage());
            stringBuilder.append(" | selectedRoute : ");
            stringBuilder.append(string);
            stringBuilder.append(" | filereaderObj : ");
            stringBuilder.append(object);
            Crashlytics.logException((Throwable)new Throwable(stringBuilder.toString()));
            exception.printStackTrace();
            return null;
        }
    }

    public static String b(String string, String string2, String string3, Object object) {
        f f2 = h.b(string, object);
        k[] arrk = f2.d();
        int n2 = Integer.parseInt((String)string2.substring(1 + string2.indexOf("#")));
        String[] arrstring = f2.a();
        for (int i2 = 0; i2 < arrstring.length && !arrstring[i2].equals((Object)string3); ++i2) {
        }
        if (f2.e) {
            int n3 = n2 - 1;
            String string4 = arrk[n3].a;
            String string5 = arrk[n3].b;
            String string6 = arrk[n3].e;
            if (string6 != null && !string6.equals((Object)"")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string6);
                stringBuilder.append("\n");
                stringBuilder.append(c.a(string4, c.a));
                stringBuilder.append(" - ");
                stringBuilder.append(c.a(string5, c.a));
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c.a(string4, c.a));
            stringBuilder.append(" - ");
            stringBuilder.append(c.a(string5, c.a));
            return stringBuilder.toString();
        }
        return arrk[n2 - 1].e;
    }

    public static Vector<String> b(Object object) {
        if (l == null) {
            String[] arrstring = h.a(object);
            l = new Vector();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                if (arrstring[i2].equals((Object)"MM1WD") || arrstring[i2].equals((Object)"MONO1")) continue;
                String[] arrstring2 = h.b(arrstring[i2], object).a();
                for (int i3 = 0; i3 < arrstring2.length; ++i3) {
                    if (l.contains((Object)arrstring2[i3])) continue;
                    l.addElement((Object)arrstring2[i3]);
                }
            }
        }
        return l;
    }

    public static j[] b(String string, String string2, Object object) {
        f f2 = h.b(string, object);
        String[] arrstring = f2.a();
        String string3 = f2.d;
        Vector vector = h.a(Integer.parseInt((String)string2.substring(1 + string2.indexOf("#"))), arrstring, string3, f2, object);
        Object[] arrobject = new String[vector.size()];
        vector.copyInto(arrobject);
        j[] arrj = new j[arrobject.length];
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            String string4 = arrobject[i2].split("#")[2];
            String string5 = arrobject[i2].split("#")[5];
            j j2 = new j();
            j2.a = string4;
            j2.b = Integer.parseInt((String)string5);
            arrj[i2] = j2;
        }
        return arrj;
    }

    public static String[] c(Object object) {
        if (m == null) {
            if (l == null) {
                l = h.b(object);
            }
            Collections.sort(l);
            m = new String[l.size()];
            l.copyInto((Object[])m);
        }
        return m;
    }

}

