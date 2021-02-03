/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Hashtable
 *  java.util.Vector
 */
package com.mulo.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.mulo.a.d.a;
import com.mulo.a.d.h;
import com.mulo.a.d.i;
import com.mulo.a.d.k;
import com.mulo.a.d.l;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

public class b {
    public static Hashtable<String, ArrayList<String>> a;
    public static int b = 0;
    public static int c = 5;
    public static int d = 4;
    public static int e = 3;
    public static int f = 5;
    private static Vector<String> g;
    private static Vector<String> h;

    public static int a(int n2) {
        if (n2 < 170) {
            return n2 + 1440;
        }
        return n2;
    }

    private static int a(int n2, String string) {
        if (n2 >= 480 && n2 <= 660 || n2 >= 1050 && n2 <= 1320) {
            if (!(string.equals((Object)"KURLA") || string.equals((Object)"DADAR") || string.equals((Object)"THANE"))) {
                return d;
            }
            return c;
        }
        if (!string.equals((Object)"DADAR") && !string.equals((Object)"THANE")) {
            return e;
        }
        return f;
    }

    public static i a(String string, String string2, int n2, String string3, Object object) {
        String string4 = b.a(string, string2, "", object);
        if (string4 != null) {
            int n3;
            a a2 = h.a(string4, h.f, string, Calendar.getInstance(), true, object);
            a a3 = h.a(string4, h.f, string2, Calendar.getInstance(), true, object);
            int n4 = a2.c.size();
            int n5 = a3.c.size();
            i i2 = new i();
            i2.o = n2;
            boolean bl = false;
            int n6 = -1;
            int n7 = 0;
            boolean bl2 = false;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                int n8;
                a a4;
                int n9;
                block15 : {
                    int n10 = (Integer)a2.d.get(i3);
                    if (n10 < n2 && !bl) {
                        a4 = a3;
                        n9 = n5;
                        n8 = n7;
                    } else {
                        int n11 = (Integer)a2.c.elementAt(i3);
                        int n12 = n6;
                        for (int i4 = 0; i4 < n5; ++i4) {
                            n9 = n5;
                            if (n11 == (Integer)a3.c.elementAt(i4)) {
                                int n13 = (Integer)a3.d.get(i4);
                                if (b.b(n10, n13)) {
                                    a4 = a3;
                                    if (n12 != -1 && !b.a(n13, n12)) {
                                        n13 = n12;
                                    } else {
                                        i2.e = n11;
                                        i2.f = string4;
                                        i2.a = string;
                                        i2.b = string2;
                                        i2.g = n10;
                                        i2.h = b.b(n10);
                                        i2.i = n13;
                                        i2.j = b.b(n13);
                                        k[] arrk = h.b(string4, object).d();
                                        int n14 = n11 - 1;
                                        i2.c = arrk[n14].a;
                                        i2.d = arrk[n14].b;
                                        i2.l = arrk[n14].e;
                                        i2.m = arrk[n14].d;
                                        i2.n = arrk[n14].f;
                                        bl2 = true;
                                    }
                                    n8 = n7 + 1;
                                    if (n8 > b) {
                                        n6 = n13;
                                        break block15;
                                    }
                                    n7 = n8;
                                    n12 = n13;
                                } else {
                                    a4 = a3;
                                }
                            } else {
                                a4 = a3;
                            }
                            n5 = n9;
                            a3 = a4;
                        }
                        a4 = a3;
                        n9 = n5;
                        n6 = n12;
                        n8 = n7;
                    }
                }
                int n15 = b;
                if (n8 > n15) break;
                int n16 = n4 - 1;
                if (i3 == n16 && n8 < n15 && !bl) {
                    n3 = 1;
                    i3 = -1;
                    bl = true;
                } else {
                    if (i3 == n16 && n8 < b && bl) break;
                    n3 = 1;
                }
                n7 = n8;
                n5 = n9;
                a3 = a4;
            }
            if (bl2) {
                return i2;
            }
            return null;
        }
        return null;
    }

    public static l a(String string, String string2, String string3, int n2, boolean bl, Object object) {
        int n3 = b.a(n2);
        int n4 = n3 - 360;
        if (n4 < 170) {
            n4 = 170;
        }
        int n5 = 0;
        while (n4 < 1610) {
            l l2 = b.c(string, string2, string3, n4, bl, object);
            if (b.a(l2.f) <= n3 && b.a(l2.f) >= n5) {
                n5 = b.a(l2.f);
                n4 += 60;
                continue;
            }
            int n6 = n4 - 60;
            int n7 = n5;
            for (int i2 = n6; i2 <= n6 + 60; i2 += 15) {
                int n8;
                l l3 = b.c(string, string2, string3, i2, bl, object);
                if (b.a(l3.f) <= n3 && b.a(l3.f) >= n7) {
                    n7 = b.a(l3.f);
                    continue;
                }
                for (int i3 = n8 = i2 - 15; i3 <= n8 + 15; ++i3) {
                    l l4 = b.c(string, string2, string3, i3, bl, object);
                    if (b.a(l4.f) <= n3 && b.a(l4.f) >= n7) {
                        n7 = b.a(l4.f);
                        continue;
                    }
                    return b.c(string, string2, string3, i3 - 1, bl, object);
                }
            }
        }
        return null;
    }

    private static String a(String string) {
        String[] arrstring = string.split("-");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = -1 + arrstring.length; i2 >= 0; --i2) {
            stringBuilder.append(arrstring[i2]);
            if (i2 == 0) continue;
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public static String a(String string, String string2, String string3, Object object) {
        Vector vector = new Vector();
        String[] arrstring = h.a(object);
        block0 : for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string4 = arrstring[i2];
            String[] arrstring2 = h.b(string4, object).a();
            boolean bl = false;
            boolean bl2 = false;
            for (int i3 = 0; i3 < arrstring2.length; ++i3) {
                if (arrstring2[i3].equals((Object)string)) {
                    bl = true;
                }
                if (arrstring2[i3].equals((Object)string2)) {
                    bl2 = true;
                }
                if (!bl || !bl2) continue;
                vector.add((Object)string4);
                continue block0;
            }
        }
        if (vector.size() > 1) {
            if (string3 != null && !string3.equals((Object)"")) {
                String[] arrstring3 = string3.split("#");
                if (arrstring3.length > 0) {
                    String string5 = b.a(string, arrstring3[0], null, object);
                    if (vector.contains((Object)string5)) {
                        return string5;
                    }
                    return null;
                }
            } else {
                String string6 = b.b(string);
                if (string6 != null) {
                    for (int i4 = 0; i4 < vector.size(); ++i4) {
                        if (!((String)vector.elementAt(i4)).contains((CharSequence)string6)) continue;
                        return string6;
                    }
                }
            }
        }
        if (vector.size() > 0) {
            return (String)vector.firstElement();
        }
        return null;
    }

    public static ArrayList<String> a(String string, String string2, Object object, String string3) {
        if (a == null) {
            b.b(object, string3);
        }
        Hashtable<String, ArrayList<String>> hashtable = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("-");
        stringBuilder.append(string2);
        ArrayList arrayList = (ArrayList)hashtable.get((Object)stringBuilder.toString());
        if (arrayList == null) {
            Hashtable<String, ArrayList<String>> hashtable2 = a;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append("-");
            stringBuilder2.append(string);
            arrayList = new ArrayList((Collection)hashtable2.get((Object)stringBuilder2.toString()));
            if (!arrayList.isEmpty()) {
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    arrayList.set(i2, (Object)b.a((String)arrayList.get(i2)));
                }
            }
        }
        return arrayList;
    }

    public static Vector<String> a(Object object, String string) {
        Context context = (Context)object;
        if (context.getSharedPreferences("m-indicator", 0).getString("isCityChange", "no").equals((Object)"yes")) {
            h = null;
            g = null;
            SharedPreferences.Editor editor = context.getSharedPreferences("m-indicator", 0).edit();
            editor.putString("isCityChange", "no");
            editor.putString("removeAtoBshortCut", "yes");
            editor.commit();
        }
        if (h == null) {
            if (g == null) {
                b.b(object, string);
            }
            h = (Vector)g.clone();
            Collections.sort(h);
        }
        return h;
    }

    public static Vector<i> a(String string, String string2, String string3, int n2, Object object) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        vector2.add((Object)string);
        String[] arrstring = string3.split("-");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (arrstring[i2].equals((Object)"") || arrstring[i2].equals((Object)"d") || arrstring[i2].equals((Object)"Direct Train")) continue;
            vector2.add((Object)arrstring[i2]);
        }
        vector2.add((Object)string2);
        int n3 = n2;
        int n4 = 0;
        i i3 = null;
        while (n4 < -1 + vector2.size()) {
            String string4 = (String)vector2.elementAt(n4);
            int n5 = n4 + 1;
            String string5 = (String)vector2.elementAt(n5);
            if (i3 != null && i3.a(string5, object)) {
                vector.remove((Object)i3);
                i3 = b.a(i3.a, string5, i3.o, "", object);
            } else {
                i3 = b.a(string4, string5, n3, "", object);
                if (i3 == null) {
                    i3 = b.a(string4, string5, 0, "", object);
                }
            }
            if (i3 != null) {
                int n6 = i3.i;
                int n7 = n4 < -2 + vector2.size() ? b.a(n6, i3.b) : 0;
                n3 = n6 + n7;
                if (n3 > 1439) {
                    n3 %= 1440;
                }
                i3.k = n7;
                i3.a(object);
                vector.add((Object)i3);
                n4 = n5;
                continue;
            }
            return null;
        }
        if (vector.size() > 0) {
            return vector;
        }
        return null;
    }

    public static boolean a(int n2, int n3) {
        return b.c(n2, n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static l b(String var0, String var1_1, String var2_2, int var3_3, boolean var4_4, Object var5_5) {
        if (!var4_4) ** GOTO lbl5
        try {
            block2 : {
                b.b = 2;
                break block2;
lbl5: // 1 sources:
                b.b = 0;
            }
            var7_6 = b.a(var0, var1_1, var2_2, var3_3, var5_5);
            var8_7 = new l();
            var8_7.a = var0;
            var8_7.b = var1_1;
            var8_7.c = var3_3;
            var8_7.d = var7_6;
            var8_7.e = ((i)var7_6.firstElement()).g;
            var8_7.f = ((i)var7_6.lastElement()).i;
            var8_7.g = var2_2;
            return var8_7;
        }
        catch (Exception var6_8) {
            var6_8.printStackTrace();
            return null;
        }
    }

    private static String b(int n2) {
        String string;
        String string2;
        int n3 = n2 / 60;
        if (n3 >= 12) {
            if (n3 > 12) {
                n3 -= 12;
            }
            string = " PM";
        } else {
            string = " AM";
        }
        int n4 = n2 % 60;
        if (n4 < 10) {
            if (n3 < 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0");
                stringBuilder.append(n3);
                stringBuilder.append(":0");
                stringBuilder.append(n4);
                string2 = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n3);
                stringBuilder.append(":0");
                stringBuilder.append(n4);
                string2 = stringBuilder.toString();
            }
        } else if (n3 < 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0");
            stringBuilder.append(n3);
            stringBuilder.append(":");
            stringBuilder.append(n4);
            string2 = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append(":");
            stringBuilder.append(n4);
            string2 = stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private static String b(String string) {
        if (string.equals((Object)"CSMT")) {
            return "C";
        }
        if (string.equals((Object)"MASJID")) {
            return "C";
        }
        if (string.equals((Object)"SANDHURST ROAD")) {
            return "C";
        }
        if (string.equals((Object)"ANDHERI")) {
            return "W";
        }
        if (string.equals((Object)"VILE PARLE")) {
            return "W";
        }
        if (string.equals((Object)"SANTA CRUZ")) {
            return "W";
        }
        if (string.equals((Object)"KHAR ROAD")) {
            return "W";
        }
        if (string.equals((Object)"BANDRA")) {
            return "W";
        }
        if (string.equals((Object)"MAHIM JN")) {
            return "W";
        }
        if (string.equals((Object)"DADAR")) {
            return "W";
        }
        if (string.equals((Object)"KURLA")) {
            return "C";
        }
        if (string.equals((Object)"VASHI")) {
            return "H";
        }
        if (string.equals((Object)"SANPADA")) {
            return "H";
        }
        if (string.equals((Object)"JUINAGAR")) {
            return "H";
        }
        if (string.equals((Object)"NERUL")) {
            return "H";
        }
        if (string.equals((Object)"SEAWOOD DARAVE")) {
            return "H";
        }
        if (string.equals((Object)"BELAPUR CBD")) {
            return "H";
        }
        if (string.equals((Object)"KHARGHAR")) {
            return "H";
        }
        if (string.equals((Object)"MANASAROVAR")) {
            return "H";
        }
        if (string.equals((Object)"KHANDESHWAR")) {
            return "H";
        }
        if (string.equals((Object)"PANVEL")) {
            return "H";
        }
        if (string.equals((Object)"THANE")) {
            return "C";
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private static void b(Object var0, String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 8[WHILELOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    private static boolean b(int n2, int n3) {
        return b.c(n2, n3);
    }

    public static l c(String string, String string2, String string3, int n2, boolean bl, Object object) {
        int n3 = n2 >= 1440 ? n2 - 1440 : n2;
        return b.b(string, string2, string3, n3, bl, object);
    }

    private static boolean c(int n2, int n3) {
        int n4 = n3 - n2;
        if (n4 == 0) {
            return false;
        }
        if (n4 <= -780) {
            return true;
        }
        if (n4 >= 780) {
            return false;
        }
        if (n4 > 0) {
            return true;
        }
        if (n4 < 0) {
            return false;
        }
        return false;
    }
}

