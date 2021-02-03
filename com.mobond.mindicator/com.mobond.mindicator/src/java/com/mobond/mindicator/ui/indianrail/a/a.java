/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.location.Location
 *  com.mobond.mindicator.ui.indianrail.checklist.CheckLists
 *  com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus
 *  com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains
 *  com.mulo.util.D
 *  com.mulo.util.b
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.StringTokenizer
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.indianrail.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.location.Location;
import com.b.a.b.e;
import com.b.a.b.i;
import com.b.a.b.l;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mobond.mindicator.ui.indianrail.checklist.CheckLists;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains;
import com.mobond.mindicator.ui.indianrail.trainschedule.d;
import com.mulo.util.D;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class a {
    public static Vector<String> a;
    private static String b;
    private static Vector<String> c;
    private static Vector<String> d;
    private static InputStream e;
    private static InputStream f;
    private static double g = 10.0;
    private static Vector<f> h;
    private static HashMap<String, String> i;
    private static HashMap<String, String> j;
    private static HashMap<String, String> k;
    private static LinkedHashMap<String, a> l;
    private static LinkedHashMap<String, a> m;

    private static double a(double d2) {
        return d2 * 111.111111;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long l2 = a.b(inputStream, outputStream);
        if (l2 > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l2;
    }

    public static a a(Context context, String string) {
        a.e(context);
        return (a)l.get((Object)string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static b a(Context context, List<g> list, Location location, boolean bl, l l2) {
        String string;
        double d2;
        boolean bl2;
        String string2;
        double d3;
        boolean bl3;
        int n2;
        double d4;
        block10 : {
            String string3;
            double d5;
            int n3;
            String string4;
            double d6;
            block9 : {
                String string5;
                int n4;
                List<g> list2 = list;
                try {
                    com.b.a.d.b b2 = new com.b.a.d.b(l2);
                    double d7 = location.getLatitude();
                    double d8 = location.getLongitude();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("current_lat: ");
                    stringBuilder.append(d7);
                    stringBuilder.append(" current_lon: ");
                    stringBuilder.append(d8);
                    a.a(context, stringBuilder.toString(), null);
                    d4 = b2.b(new com.b.a.b.a(d8, d7));
                    com.b.a.b.a a2 = b2.a(d4);
                    Location location2 = new Location("line");
                    location2.setLatitude(a2.b);
                    location2.setLongitude(a2.a);
                    double d9 = location.distanceTo(location2) / 1000.0f;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("pos_index: = ");
                    stringBuilder2.append(d4);
                    stringBuilder2.append(" dist: ");
                    stringBuilder2.append(d9);
                    a.a(context, stringBuilder2.toString(), null);
                    bl3 = d9 < g;
                    bl2 = !bl && bl3;
                    d6 = d5 = -1.0;
                    n3 = 0;
                    string4 = null;
                    string5 = null;
                    while (n3 < -1 + list.size()) {
                        string4 = ((g)list2.get((int)n3)).i;
                        n4 = n3 + 1;
                        string3 = ((g)list2.get((int)n4)).i;
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("stn: ");
                        stringBuilder3.append(string4);
                        stringBuilder3.append(" next_stn: ");
                        stringBuilder3.append(string3);
                        a.a(context, stringBuilder3.toString(), null);
                        com.b.a.b.a a3 = a.c(context, string4);
                        com.b.a.b.a a4 = a.c(context, string3);
                        if (a3 == null || a4 == null) break block8;
                        d6 = b2.b(a3);
                        d5 = b2.b(a4);
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append("stnIndex: ");
                        stringBuilder4.append(d6);
                        stringBuilder4.append(" nextStnIndex: ");
                        stringBuilder4.append(d5);
                        a.a(context, stringBuilder4.toString(), null);
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    a.a(context, exception.getMessage(), exception);
                    return null;
                }
                {
                    block8 : {
                        if (d6 <= d4 && d4 <= d5) break block9;
                    }
                    n3 = n4;
                    string5 = string3;
                    list2 = list;
                    continue;
                }
                d2 = d5;
                string2 = string5;
                string = string4;
                d3 = d6;
                return null;
            }
            boolean bl4 = true;
            double d10 = d6;
            n2 = n3;
            double d11 = d5;
            string = string4;
            d3 = d10;
            string2 = string3;
            d2 = d11;
            if (!bl4) {
                return null;
            }
            if (!(a.a(Math.abs((double)(d3 - d4))) <= 0.5)) break block10;
            a.a(context, "stn-pos", null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("***stn: ");
            stringBuilder.append(string);
            a.a(context, stringBuilder.toString(), null);
            return new b(n2, d3, 0.0, d4, string, "", bl2, bl3, 0, l2);
        }
        double d12 = d2 - d4;
        if (a.a(Math.abs((double)d12)) <= 0.5) {
            a.a(context, "next_stn-pos", null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("***stn: ");
            stringBuilder.append(string2);
            a.a(context, stringBuilder.toString(), null);
            return new b(n2 + 1, d2, 0.0, d4, string2, "", bl2, bl3, 0, l2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("***stn1: ");
        stringBuilder.append(string);
        a.a(context, stringBuilder.toString(), null);
        int n5 = (int)a.a(d12);
        return new b(n2, d3, d2, d4, string, string2, bl2, bl3, n5, l2);
    }

    public static b a(Context context, List<g> list, boolean bl, Location location, b b2) {
        l l2;
        StringBuilder stringBuilder = new StringBuilder();
        if (b2 != null && b2.a() != null) {
            l2 = b2.a();
        } else {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                a a2 = a.a(context, ((g)iterator.next()).i);
                if (a2 == null) continue;
                double d2 = Double.parseDouble((String)a2.c);
                stringBuilder.append(Double.parseDouble((String)a2.d));
                stringBuilder.append(",");
                stringBuilder.append(d2);
                stringBuilder.append(",0 ");
            }
            l2 = a.d(context, stringBuilder.toString());
        }
        return a.a(context, list, location, bl, l2);
    }

    public static f a(String string, Context context) {
        String string2 = string.replaceAll("/\\D+/g", "");
        if (h == null) {
            h = a.a(context);
        }
        for (int i2 = 0; i2 < h.size(); ++i2) {
            if (!((f)a.h.get((int)i2)).a.equals((Object)string2)) continue;
            return (f)h.get(i2);
        }
        return null;
    }

    private static String a(byte by) {
        String string = "";
        if (by == 127) {
            return b;
        }
        if (com.mulo.util.b.a((byte)by, (int)1)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(ActivitySeatStatus.f[1]);
            stringBuilder.append("  ");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)by, (int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(ActivitySeatStatus.f[2]);
            stringBuilder.append("  ");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)by, (int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(ActivitySeatStatus.f[3]);
            stringBuilder.append("  ");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)by, (int)4)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(ActivitySeatStatus.f[4]);
            stringBuilder.append("  ");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)by, (int)5)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(ActivitySeatStatus.f[5]);
            stringBuilder.append("  ");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)by, (int)6)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(ActivitySeatStatus.f[6]);
            stringBuilder.append("  ");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)by, (int)7)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(ActivitySeatStatus.f[0]);
            stringBuilder.append("  ");
            string = stringBuilder.toString();
        }
        return string.trim();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static String a(byte var0, int var1_1) {
        block85 : {
            block84 : {
                if (var0 != 127) break block84;
                var3_2 = 1111111;
                break block85;
            }
            if (!com.mulo.util.b.a((byte)var0, (int)1)) ** GOTO lbl-1000
            if (var1_1 == 1) {
                var2_3 = 1000000;
            } else if (var1_1 == 2) {
                var2_3 = 100000;
            } else if (var1_1 == 3) {
                var2_3 = 10000;
            } else if (var1_1 == 4) {
                var2_3 = 1000;
            } else if (var1_1 == 5) {
                var2_3 = 100;
            } else if (var1_1 == 6) {
                var2_3 = 10;
            } else lbl-1000: // 2 sources:
            {
                var2_3 = 0;
            }
            if (com.mulo.util.b.a((byte)var0, (int)2)) {
                if (var1_1 == 1) {
                    var2_3 += 100000;
                } else if (var1_1 == 2) {
                    var2_3 += 10000;
                } else if (var1_1 == 3) {
                    var2_3 += 1000;
                } else if (var1_1 == 4) {
                    var2_3 += 100;
                } else if (var1_1 == 5) {
                    var2_3 += 10;
                } else if (var1_1 == 6) {
                    ++var2_3;
                }
            }
            if (com.mulo.util.b.a((byte)var0, (int)3)) {
                if (var1_1 == 1) {
                    var2_3 += 10000;
                } else if (var1_1 == 2) {
                    var2_3 += 1000;
                } else if (var1_1 == 3) {
                    var2_3 += 100;
                } else if (var1_1 == 4) {
                    var2_3 += 10;
                } else if (var1_1 == 5) {
                    ++var2_3;
                } else if (var1_1 == 6) {
                    var2_3 += 1000000;
                }
            }
            if (com.mulo.util.b.a((byte)var0, (int)4)) {
                if (var1_1 == 1) {
                    var2_3 += 1000;
                } else if (var1_1 == 2) {
                    var2_3 += 100;
                } else if (var1_1 == 3) {
                    var2_3 += 10;
                } else if (var1_1 == 4) {
                    ++var2_3;
                } else if (var1_1 == 5) {
                    var2_3 += 1000000;
                } else if (var1_1 == 6) {
                    var2_3 += 100000;
                }
            }
            if (com.mulo.util.b.a((byte)var0, (int)5)) {
                if (var1_1 == 1) {
                    var2_3 += 100;
                } else if (var1_1 == 2) {
                    var2_3 += 10;
                } else if (var1_1 == 3) {
                    ++var2_3;
                } else if (var1_1 == 4) {
                    var2_3 += 1000000;
                } else if (var1_1 == 5) {
                    var2_3 += 100000;
                } else if (var1_1 == 6) {
                    var2_3 += 10000;
                }
            }
            if (com.mulo.util.b.a((byte)var0, (int)6)) {
                if (var1_1 == 1) {
                    var2_3 += 10;
                } else if (var1_1 == 2) {
                    ++var2_3;
                } else if (var1_1 == 3) {
                    var2_3 += 1000000;
                } else if (var1_1 == 4) {
                    var2_3 += 100000;
                } else if (var1_1 == 5) {
                    var2_3 += 10000;
                } else if (var1_1 == 6) {
                    var2_3 += 1000;
                }
            }
            if (!com.mulo.util.b.a((byte)var0, (int)7)) ** GOTO lbl-1000
            if (var1_1 == 1) {
                var3_2 = var2_3 + 1;
            } else if (var1_1 == 2) {
                var3_2 = var2_3 + 1000000;
            } else if (var1_1 == 3) {
                var3_2 = var2_3 + 100000;
            } else if (var1_1 == 4) {
                var3_2 = var2_3 + 10000;
            } else if (var1_1 == 5) {
                var3_2 = var2_3 + 1000;
            } else if (var1_1 == 6) {
                var3_2 = var2_3 + 100;
            } else lbl-1000: // 2 sources:
            {
                var3_2 = var2_3;
            }
        }
        var4_4 = new StringBuilder();
        var4_4.append("0");
        var4_4.append(var3_2);
        return a.a(com.mulo.util.b.a((String)var4_4.toString()));
    }

    public static String a(int n2) {
        return (String)a.get(n2);
    }

    public static String a(String string) {
        String string2 = (String)i.get((Object)string);
        if (string2 == null) {
            return string;
        }
        return string2;
    }

    public static String a(byte[] arrby) {
        String string = "";
        if (com.mulo.util.b.a((byte)arrby[0], (int)1)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("1A,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[0], (int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("2A,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[0], (int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("3A,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[0], (int)4)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("CC,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[0], (int)5)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("FC,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[0], (int)6)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("SL,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[0], (int)7)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("2S,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[1], (int)0)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("3E,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[1], (int)1)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("GN,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[1], (int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("EC,");
            string = stringBuilder.toString();
        }
        if (com.mulo.util.b.a((byte)arrby[1], (int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("EA");
            string = stringBuilder.toString();
        }
        if (string.length() > 0 && string.charAt(string.length() - 1) == ',') {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    public static Vector<f> a(Context context) {
        if (h == null) {
            boolean bl = com.mobond.mindicator.a.a(context).D();
            h = new Vector();
            byte[] arrby = a.a(context, bl);
            com.mulo.util.b b2 = new com.mulo.util.b(arrby);
            int n2 = 0;
            while (n2 < arrby.length - 1) {
                boolean bl2;
                boolean bl3;
                f f2 = new f();
                int n3 = b2.d(n2);
                if (n3 < 0) {
                    n3 = Math.abs((int)n3);
                    bl3 = true;
                } else {
                    bl3 = false;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(n3);
                f2.a = stringBuilder.toString();
                if (f2.a.length() == 4) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("0");
                    stringBuilder2.append(f2.a);
                    f2.a = stringBuilder2.toString();
                } else if (f2.a.length() == 3) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("00");
                    stringBuilder3.append(f2.a);
                    f2.a = stringBuilder3.toString();
                } else if (f2.a.length() == 2) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("000");
                    stringBuilder4.append(f2.a);
                    f2.a = stringBuilder4.toString();
                }
                if (bl3) {
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append(f2.a);
                    stringBuilder5.append(" - Slip");
                    f2.a = stringBuilder5.toString();
                }
                int n4 = n2 + 4;
                short s = b2.b(n4);
                int n5 = n4 + 2;
                short s2 = b2.b(n5);
                int n6 = n5 + 2;
                byte by = b2.a(n6);
                int n7 = n6 + 1;
                f2.d = by;
                f2.c = a.a(by);
                byte by2 = b2.a(n7);
                int n8 = n7 + 1;
                f2.g = b2.c(n8, (int)by2);
                int n9 = n8 + by2;
                byte by3 = b2.a(n9);
                int n10 = n9 + 1;
                if (bl) {
                    f2.f = b2.d(n10, (int)by3);
                    f2.e = f2.f.isEmpty() ? f2.g : f2.f;
                } else {
                    f2.e = f2.g;
                }
                int n11 = n10 + by3;
                int n12 = f2.g.indexOf("#valid#");
                if (n12 > -1) {
                    String string = f2.g;
                    int n13 = n12 + 7;
                    String string2 = string.substring(n13, n13 + 16);
                    String string3 = string2.substring(0, 8);
                    String string4 = string2.substring(8, 16);
                    int n14 = Integer.parseInt((String)string3);
                    int n15 = Integer.parseInt((String)string4);
                    f2.h = n14;
                    f2.i = n15;
                    bl2 = a.b(n15);
                    if (!bl) {
                        f2.e = f2.e.substring(0, n12);
                    }
                } else {
                    f2.h = 0;
                    f2.i = 0;
                    bl2 = false;
                }
                int n16 = b2.d(n11);
                int n17 = n11 + 4;
                f2.x = b2.a(n17, n16);
                int n18 = n17 + n16;
                String string = a.a(s).toUpperCase();
                String string5 = a.a(s2).toUpperCase();
                String string6 = a.c(s).toUpperCase();
                String string7 = a.c(s2).toUpperCase();
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(a.h(string6));
                stringBuilder6.append(" - ");
                stringBuilder6.append(a.h(string7));
                f2.l = stringBuilder6.toString();
                if (bl) {
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append(a.h(string));
                    stringBuilder7.append(" - ");
                    stringBuilder7.append(a.h(string5));
                    f2.j = stringBuilder7.toString();
                } else {
                    f2.j = f2.l;
                }
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append(a.d(string));
                stringBuilder8.append(" - ");
                stringBuilder8.append(a.d(string5));
                f2.k = stringBuilder8.toString();
                if (!bl2) {
                    h.add((Object)f2);
                }
                byte[] arrby2 = new byte[2];
                arrby2[0] = b2.a(n18);
                int n19 = n18 + 1;
                arrby2[1] = b2.a(n19);
                int n20 = n19 + 1;
                f2.u = a.a(arrby2);
                short s3 = b2.b(n20);
                int n21 = n20 + 2;
                f2.v = b2.c(n21, (int)s3);
                n2 = n21 + s3;
            }
            g = Double.parseDouble((String)com.mobond.mindicator.fcm.a.a("MIN_DIST_FOR_VALID_LOC_FROM_TRACK"));
        }
        return h;
    }

    public static void a(Context context, String string, Exception exception) {
    }

    private static void a(byte[] arrby, boolean bl) {
        if (a == null) {
            c = new Vector();
            if (bl) {
                d = new Vector();
                a = d;
            } else {
                a = c;
            }
            String[] arrstring = new String(arrby, "UTF-8").split(",", -1);
            j = new HashMap();
            if (bl) {
                k = new HashMap();
                i = k;
            } else {
                i = j;
            }
            for (int i2 = 1; i2 < arrstring.length; i2 += 3) {
                String string;
                String string2 = arrstring[i2];
                String string3 = arrstring[i2 + 1];
                String string4 = arrstring[i2 + 2];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(" [");
                stringBuilder.append(string2);
                stringBuilder.append("]");
                String string5 = stringBuilder.toString();
                c.add((Object)string5);
                j.put((Object)string2, (Object)string5);
                if (!bl) continue;
                if (string4.isEmpty()) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string3);
                    stringBuilder2.append(" [");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("]");
                    string = stringBuilder2.toString();
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string4);
                    stringBuilder3.append(" [");
                    stringBuilder3.append(string2);
                    stringBuilder3.append("]");
                    string = stringBuilder3.toString();
                }
                d.add((Object)string);
                k.put((Object)string2, (Object)string);
            }
            if (bl) {
                b = "\u092a\u094d\u0930\u0924\u093f\u0926\u093f\u0928";
                d.a = "\u0938\u092e\u092f \u092a\u0930";
                d.b = " \u092e\u093f.";
                d.c = " \u092e\u093f\u0928\u091f";
                d.d = " \u0918\u0902\u091f\u093e";
                d.e = " \u0918\u0902\u091f\u0947";
                d.f = " \u0915\u093f.\u092e\u0940.";
                ActivityCancelledRescheduledTrains.a = "\u0930\u0926\u094d\u0926 \u091f\u094d\u0930\u0948\u0928";
                ActivityCancelledRescheduledTrains.c = "\u092a\u0941\u0928\u0930\u094d\u0928\u093f\u092f\u094b\u091c\u093f\u0924";
                ActivityCancelledRescheduledTrains.b = "\u0905\u0902\u0936\u0924\u0903 \u0930\u0926\u094d\u0926";
                ActivityCancelledRescheduledTrains.d = "\u092e\u093e\u0930\u094d\u0917 \u092c\u0926\u0932 \u0926\u093f\u092f\u093e \u0917\u092f\u093e";
                CheckLists.b = "[[\"\u0926\u0938\u094d\u0924\u093e\u0935\u0947\u091c\u093c\",\"\u091f\u093f\u0915\u091f\",\"\u0921\u0947\u092c\u093f\u091f \u0914\u0930 \u0915\u094d\u0930\u0947\u0921\u093f\u091f \u0915\u093e\u0930\u094d\u0921\",\"\u0928\u0958\u0926 \u092a\u0948\u0938\u0947 / \u092c\u091f\u0941\u0906\",\"\u0939\u094b\u091f\u0932 \u0915\u093e \u092a\u0924\u093e\",\"\u0939\u094b\u091f\u0932 \u092e\u0947\u0902 \u0930\u0939\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u092a\u0939\u091a\u093e\u0928 \u092a\u094d\u0930\u092e\u093e\u0923 (ID Card) - \u092a\u0948\u0928 \u092f\u093e \u092a\u093e\u0938\u092a\u094b\u0930\u094d\u091f\",\"\u0921\u094d\u0930\u093e\u0907\u0935\u093f\u0902\u0917 \u0932\u093e\u0907\u0938\u0947\u0902\u0938\",\"\u092e\u0939\u0924\u094d\u0935\u092a\u0942\u0930\u094d\u0923 \u0928\u093e\u092e \u0914\u0930 \u0938\u0902\u092a\u0930\u094d\u0915 \u0935\u093e\u0932\u0940 \u0921\u093e\u092f\u0930\u0940\",\"\u0935\u093f\u0926\u0947\u0936\u0940 \u092f\u093e\u0924\u094d\u0930\u093e \u0915\u0947 \u0932\u093f\u090f \u092a\u093e\u0938\u092a\u094b\u0930\u094d\u091f / \u0935\u0940\u091c\u093e\",\"\u0938\u093e\u092e\u093e\u0928 \u0915\u0947 \u0932\u093f\u090f \u091f\u0948\u0917\"],[\"\u0932\u095c\u0915\u094b\u0902 \u0915\u0947 \u0915\u092a\u0921\u093c\u0947\",\"\u0924\u094c\u0932\u093f\u092f\u093e\",\"\u0905\u0902\u0924\u0930\u094d\u0935\u0938\u094d\u0924\u094d\u0930\",\"\u091f\u0940-\u0936\u0930\u094d\u091f / \u0936\u0930\u094d\u091f\",\"\u091c\u0940\u0928\u094d\u0938\",\"\u0936\u0949\u0930\u094d\u091f\u094d\u0938\",\"\u0930\u0942\u092e\u093e\u0932\",\"\u091c\u0942\u0924\u0947 \u0914\u0930 \u092e\u094b\u091c\u0947\",\"\u0938\u094b\u0928\u0947 \u0915\u0947 \u0915\u092a\u095c\u0947\",\"\u092c\u0947\u0932\u094d\u091f\",\"\u091c\u0948\u0915\u0947\u091f\",\"\u0938\u094d\u0935\u0947\u091f\u0930\",\"\u0938\u094d\u0935\u093f\u092e\u0938\u0942\u091f\",\"\u091f\u094b\u092a\u0940 ( \u0939\u0948\u091f )\"],[\"\u0932\u095c\u0915\u093f\u092f\u094b\u0902 \u0915\u0947 \u0915\u092a\u095c\u0947\",\"\u0924\u094c\u0932\u093f\u092f\u093e\",\"\u0905\u0902\u0924\u0930\u094d\u0935\u0938\u094d\u0924\u094d\u0930\",\"\u0932\u0921\u093c\u0915\u093f\u092f\u094b\u0902 \u0915\u0940 \u091f\u0949\u092a\",\"\u091f\u0940-\u0936\u0930\u094d\u091f\",\"\u091c\u0940\u0928\u094d\u0938\",\"\u0936\u0949\u0930\u094d\u091f\u094d\u0938\",\"\u0907\u0924\u0930 \u0915\u092a\u095c\u0947\",\"\u0930\u0942\u092e\u093e\u0932\",\"\u0938\u094d\u0915\u093e\u0930\u094d\u092b \",\"\u0938\u0948\u0902\u0921\u0932\",\"\u091c\u0942\u0924\u0947 \u0914\u0930 \u092e\u094b\u091c\u0947\",\"\u0938\u094b\u0928\u0947 \u0915\u0947 \u0915\u092a\u095c\u0947\",\"\u0938\u0948\u0928\u093f\u091f\u0930\u0940 \u0928\u0948\u092a\u0915\u093f\u0928\",\"\u091c\u0948\u0915\u0947\u091f\",\"\u0938\u094d\u0935\u0947\u091f\u0930\",\"\u0938\u094d\u0935\u093f\u092e\u0938\u0942\u091f\",\"\u091f\u094b\u092a\u0940 ( \u0939\u0948\u091f )\"],[\"\u092c\u091a\u094d\u091a\u0947\u0902\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u0947 \u0915\u092a\u0921\u0947\u0902\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u093e \u0916\u093e\u0928\u093e\",\"\u0917\u0940\u0932\u093e  \u092a\u094b\u0902\u091b\u093e / \u0932\u0902\u0917\u094b\u091f\",\"\u0916\u093f\u0932\u094c\u0928\u0947\",\"\u0906\u092a\u093e\u0924\u0915\u093e\u0932\u0940\u0928 \u0926\u0935\u093e\u090f\u0902\",\"\u0928\u093e\u0936\u094d\u0924\u093e\",\"\u092c\u0947\u092c\u0940 \u0932\u094b\u0936\u0928\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u093e \u0907\u0924\u0930 \u0916\u093e\u0928\u093e\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u0940 \u0917\u093e\u0921\u093c\u0940\"],[\"\u0905\u0924\u094d\u092f\u093e\u0935\u0936\u094d\u092f\u0915 \u0935\u0938\u094d\u0924\u0941\u090f\u0902\",\"\u092a\u093e\u0928\u0940 \u0915\u0940 \u092c\u094b\u0924\u0932\",\"\u091f\u0942\u0925\u092a\u0947\u0938\u094d\u091f \u0914\u0930 \u091f\u0942\u0925\u092c\u094d\u0930\u0936\",\"\u0915\u0902\u0918\u0940 \u0914\u0930 \u0936\u0947\u0935\u093f\u0902\u0917 \u0915\u093f\u091f\",\"\u0938\u093e\u092c\u0941\u0928 \u0914\u0930 \u092b\u0947\u0938 \u0935\u0949\u0936\",\"\u0921\u093f\u0913\u0921\u094b\u0930\u0947\u0902\u091f\u094d\u0938\",\"\u0924\u0947\u0932 \u0914\u0930 \u0936\u0948\u0902\u092a\u0942\",\"\u0938\u0928\u0938\u094d\u0915\u094d\u0930\u0940\u0928 \u0914\u0930 \u092e\u0949\u0907\u0938\u094d\u091a\u0930\u093e\u0907\u091c\u0930\u094d\u0938\",\"\u0938\u093e\u092e\u093e\u0928\u094d\u092f \u092e\u0947\u0915\u0905\u092a \u0914\u0930 \u0906\u092d\u0942\u0937\u0923 \u0938\u093e\u092e\u0917\u094d\u0930\u0940\",\"\u092c\u091f\u0941\u0906, \u092a\u0930\u094d\u0938\",\"\u0938\u0947\u092b\u093c\u094d\u091f\u0940 \u092a\u093f\u0928\",\"\u091f\u094d\u0930\u0947\u0928 \u092f\u093e\u0924\u094d\u0930\u093f\u092f\u094b\u0902 \u0915\u0947 \u0932\u093f\u090f \u0924\u093e\u0932\u093e \u0914\u0930 \u091c\u093c\u0902\u091c\u0940\u0930\",\"\u0938\u0947\u0928\u093f\u091f\u093e\u0907\u091c\u0930\u094d\u0938 \u0914\u0930 \u091f\u093f\u0936\u094d\u092f\u0942 \u092a\u0947\u092a\u0930\"],[\"\u0938\u0939\u093e\u092f\u0915 \u0938\u093e\u092e\u0917\u094d\u0930\u0940\",\"\u092a\u095d\u093e\u0908 \u0915\u093e \u0914\u0930 \u0927\u0942\u092a \u0915\u093e \u091a\u0936\u094d\u092e\u093e\",\"\u0907\u092f\u0930\u092b\u093c\u094b\u0928\",\"\u092a\u093e\u0935\u0930 \u092c\u0948\u0902\u0915\",\"\u092e\u094b\u092c\u093e\u0907\u0932 \u092b\u094b\u0928\",\"\u092e\u094b\u092c\u093e\u0907\u0932 \u091a\u093e\u0930\u094d\u091c\u0930\",\"\u0915\u0948\u092e\u0930\u093e, SD \u0915\u093e\u0930\u094d\u0921, \u0915\u0948\u092e\u0930\u093e \u091a\u093e\u0930\u094d\u091c\u0930\",\"\u091f\u0949\u0930\u094d\u091a\",\"\u092a\u0947\u0928 + \u0928\u094b\u091f\u092c\u0941\u0915\",\"\u092a\u0922\u093c\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u092a\u0941\u0938\u094d\u0924\u0915\u0947\u0902 / \u092e\u0948\u0917\u095b\u0940\u0928\",\"\u0932\u0948\u092a\u091f\u0949\u092a, \u091f\u0948\u092c \u0914\u0930 \u0915\u093f\u0902\u0921\u0932\",\"\u092e\u091a\u094d\u091b\u0930 \u0928\u093f\u0930\u094b\u0927\u0915 \u2013 \u0913\u0921\u094b\u092e\u0949\u0938, \u0915\u0949\u0907\u0932 + \u092e\u0948\u091a \u092c\u0949\u0915\u094d\u0938, \u0917\u0941\u0921 \u0928\u093e\u0907\u091f\",\"\u0909\u0932\u094d\u091f\u0940 \u0915\u0947 \u0932\u093f\u090f \u0906\u092a\u093e\u0924\u0915\u093e\u0932\u0940\u0928 \u092c\u0948\u0917\",\"\u0936\u0949\u092a\u093f\u0902\u0917 \u0915\u0947 \u0932\u093f\u090f \u0905\u0924\u093f\u0930\u093f\u0915\u094d\u0924 \u0915\u0948\u0930\u0940 \u092c\u0948\u0917\"],[\"\u0916\u0947\u0932\",\"\u0924\u093e\u0936 \u0915\u093e \u092a\u0924\u094d\u0924\u093e - \u0909\u0928\u094b / \u0930\u092e\u094d\u092e\u0940\",\"\u092b\u0941\u091f\u092c\u0949\u0932 / \u092c\u093e\u0938\u094d\u0915\u0947\u091f \u092c\u0949\u0932\",\"\u0938\u093e\u0902\u092a \u0914\u0930 \u0938\u0940\u0922\u093c\u0940\",\"\u0915\u094d\u0930\u093f\u0915\u0947\u091f\",\"\u092b\u094d\u0930\u093f\u0938\u094d\u092c\u0940\",\"\u0924\u0940\u0930\u0902\u0926\u093e\u091c\u093c\u0940\",\"\u092c\u0948\u0921\u092e\u093f\u0902\u091f\u0928\",\"\u092a\u094d\u0930\u0924\u093f\u092f\u094b\u0917\u093f\u0924\u093e - \u092c\u093f\u0928\u093e \u0939\u093e\u0925\u094b\u0902 \u0938\u0947 \u092e\u0942\u0902\u0917\u092b\u0932\u0940 \u0959\u093e\u0913 - \u092a\u0939\u0932\u0947 \u0916\u0924\u094d\u092e \u0915\u0930\u0928\u0947 \u0935\u093e\u0932\u093e \u0935\u093f\u091c\u0947\u0924\u093e\",\"\u091a\u094b\u0930 \u2013 \u092a\u0941\u0932\u093f\u0938 \u0915\u093e \u0916\u0947\u0932\",\"\u092c\u094b\u0930\u093e \u0926\u094c\u0921\u093c (\u0938\u0948\u0915 \u0930\u0947\u0938)\",\"\u0905\u0902\u0924\u093e\u0915\u094d\u0937\u0930\u0940\"],[\"\u0926\u0935\u093e\u0908\u092f\u093e\u0901\",\"Hyoscine - \u092f\u093e\u0924\u094d\u0930\u093e \u0915\u0947 \u0926\u094c\u0930\u093e\u0928 \u0909\u0932\u091f\u0940 \u0928 \u0906\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f\",\"ENO \u2013 \u0905\u092e\u094d\u0932\u0924\u093e\",\"\u092a\u0941\u0926\u093f\u0928 \u0939\u0930\u093e -  \u092a\u0947\u091f \u0926\u0930\u094d\u0926, \u0917\u0948\u0938 \u0905\u0925\u0935\u093e \u0905\u092a\u091a\u0928\",\"\u0935\u0949\u0932\u093f\u0928\u0940 \u0938\u094d\u092a\u094d\u0930\u0947 - \u092e\u093e\u0902\u0938\u092a\u0947\u0936\u093f\u092f\u094b\u0902 \u0915\u0940 \u0926\u0930\u094d\u0926 \u0938\u0947 \u0930\u093e\u0939\u0924\",\"\u092a\u091f\u094d\u091f\u0940 (\u092c\u0948\u0902\u0921\u0947\u091c)\",\"\u0915\u094d\u0930\u094b\u0938\u093f\u0928 - \u092c\u0941\u0916\u093e\u0930\",\"\u0935\u093f\u0915\u094d\u0938 \u090f\u0915\u094d\u0936\u0928 500 - \u0938\u093f\u0930\u0926\u0930\u094d\u0926, \u0928\u093e\u0915 \u092c\u0902\u0926 \u0939\u094b\u0928\u093e, \u0917\u0932\u0947 \u092e\u0947\u0902 \u0926\u0930\u094d\u0926, \u0936\u093e\u0930\u0940\u0930\u093f\u0915 \u0926\u0930\u094d\u0926\",\"\u0938\u0949\u092b\u094d\u0930\u092e\u093e\u0907\u0938\u093f\u0928 -  \u091a\u094b\u091f \u0915\u0947 \u0932\u093f\u090f\",\"\u0921\u0947\u091f\u0949\u0932\"],[\"\u0916\u093e\u0926\u094d\u092f \u0935\u0938\u094d\u0924\u0941\u090f\u0902\",\"\u0928\u093e\u0936\u094d\u0924\u093e\",\"\u0938\u0942\u0916\u0940 \u092d\u0947\u0932\",\"\u0916\u093e\u0916\u0930\u093e\",\"\u092e\u0947\u0925\u0940 \u0925\u0947\u092a\u094d\u0932\u093e\",\"\u091a\u0915\u0932\u0940\",\"\u091a\u093f\u092a\u094d\u0938\",\"\u0938\u0941\u0915\u093e \u092e\u0947\u0935\u093e\",\"\u092e\u093f\u0920\u093e\u0907\u092f\u093e\u0901\",\"\u0915\u0949\u092b\u0940 \u092a\u093e\u0909\u0921\u0930\",\"\u0928\u0942\u0921\u0932\u094d\u0938\",\"\u092b\u0932\"],[\"\u092f\u0939 \u092f\u093e\u0926 \u0930\u0916\u093f\u090f\",\"\u0917\u0948\u0938 \u0935\u093e\u0932\u094d\u0935 \u092c\u0902\u0926 \u0915\u0930\u0947\u0902\",\"\u092c\u0924\u094d\u0924\u0940 / \u0917\u0940\u095b\u0930 / \u092e\u0947\u0928 \u0938\u094d\u0935\u093f\u091a \u092c\u0902\u0926 \u0915\u0930\u0947\u0902\",\"\u0938\u092d\u0940 \u092a\u093e\u0928\u0940 \u0915\u0947 \u0928\u0932 \u092c\u0902\u0926 \u0915\u0930\u0947\u0902\",\"\u092a\u094c\u0927\u094b\u0902 \u0915\u094b \u092a\u093e\u0928\u0940 \u0926\u0947\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0935\u094d\u092f\u0935\u0938\u094d\u0925\u093e \u0915\u0930\u0947\u0902\",\"\u092a\u093e\u0932\u0924\u0942 \u092a\u0936\u0941 \u0915\u0940 \u0926\u0947\u0916\u092d\u093e\u0932 \u0915\u0947 \u0932\u093f\u090f \u092a\u0930\u094d\u092f\u093e\u092f\",\"\u0926\u0942\u0927\u0935\u093e\u0932\u0947 \u0915\u094b \u092a\u0942\u0930\u094d\u0935\u0938\u0942\u091a\u0928\u093e \u0926\u0947\u0902\",\" \u0905\u0916\u093c\u092c\u093e\u0930 \u092a\u0939\u0941\u0901\u091a\u093e\u0928\u0947 \u0935\u093e\u0932\u0947 \u0915\u094b \u092a\u0942\u0930\u094d\u0935\u0938\u0942\u091a\u0928\u093e \u0926\u0947\u0902\",\"\u091b\u0941\u091f\u094d\u091f\u0940 \u0938\u094d\u0925\u093e\u0928, \u092a\u0924\u093e \u0914\u0930 \u0938\u0902\u092a\u0930\u094d\u0915 \u0915\u0947 \u092c\u093e\u0930\u0947 \u092e\u0947\u0902 \u0915\u0930\u0940\u092c\u0940 \u0930\u093f\u0936\u094d\u0924\u0947\u0926\u093e\u0930 \u0915\u094b \u0938\u0942\u091a\u093f\u0924 \u0915\u0930\u0947\u0902\",\"\u0938\u0941\u0930\u0915\u094d\u0937\u093e \u0918\u0902\u091f\u0940 \u091a\u093e\u0932\u0942 \u0915\u0930\u0947\u0902\",\" \u0905\u0932\u092e\u093e\u0930\u0940 \u092c\u0902\u0926 \u0915\u0930\u0915\u0947 \u091c\u093e\u090f\u0902\"]]";
            } else {
                b = "Daily";
                d.a = "On Time";
                d.b = " min";
                d.c = " min";
                d.d = " hr";
                d.e = " hrs";
                d.f = " km";
                ActivityCancelledRescheduledTrains.a = "CANCELLED";
                ActivityCancelledRescheduledTrains.c = "RESCHEDULED";
                ActivityCancelledRescheduledTrains.b = "PARTIALLY CANCELLED";
                ActivityCancelledRescheduledTrains.d = "DIVERTED";
                CheckLists.b = "[[\"Documents\",\"Tickets\",\"Debit & Credit Cards\",\"Cash Money/Wallet\",\"Hotel Address\",\"ID Card for Hotel Stay - PAN or Passport\",\"Driving License\",\"Diary with important contact number and names\",\"Passport / Visa for Foreign Tour\",\"Name Tags for Luggage\"],[\"Boys Clothes\",\"Towel\",\"Inners\",\"T-Shirts/Shirts\",\"Jeans\",\"Shorts\",\"Handkerchief \",\"Shoes & Socks\",\"Sleepwear\",\"Belt\",\"Jacket\",\"Sweaters\",\"Swimsuits\",\"Hats\"],[\"Girls Clothes\",\"Towel\",\"Inners\",\"Tops\",\"T-Shirt\",\"Jeans\",\"Shorts\",\"Dresses\",\"Handkerchief\",\"Scarves \",\"Sandals\",\"Shoes & Socks\",\"Sleepwear\",\"Sanitary Napkin\",\"Jacket\",\"Sweaters\",\"Swimsuits\",\"Hats\"],[\"Kids\",\"Baby Clothes\",\"Baby Food\",\"Wet Wipes/ Nappies\",\"Toys\",\"Emergency Medicines\",\"Snacks\",\"Baby Lotions\",\"Baby Feeding Essentials\",\"Baby Carrier\"],[\"Essentials\",\"Water Bottle\",\"Toothpaste & Toothbrush\",\"Comb & Shaving Kit\",\"Soap & Face Wash\",\"Deodorants\",\"Oils & Shampoos\",\"Sunscreens & Moisturisers\",\"Basic Makeup & Jewellery Accessories \",\"Wallet, Purse\",\"Safety Pins\",\"Lock & Chain for train travellers\",\"Hand Sanitizers &Tissue Papers\"],[\"Accessories\",\"Reading Glass & Sunglasses\",\"Ear Phones\",\"Powerbank\",\"Mobile Phone\",\"Mobile Charger\",\"Camera, SD Card, Camera Charger\",\"Torch\",\"Pen + Notebook\",\"Books / Magazines for Reading\",\"Laptops, Tabs & Kindle\",\"Mosquito Repellents - Odomos -Coil + Match box -Good Knight \",\"Emergency Bags for Vomitting \",\"Extra Carry Bag for shopping\"],[\"Games\",\"Playing Cards - UNO / Rummy / Cheat\",\"Football / Basketball\",\"Snakes & Ladder\",\"Cricket bat & ball\",\" Frisbee \",\"Archery\",\"Badminton \",\"Competition - Peanuts eating in dish without touching hands - First one to finish becomes winner \",\"Chor-Police on Paper\",\"Sack Race\",\"Antakshari \"],[\"Medicines\",\"Hyoscine-Vomiting Tablet for Travel Sickness\",\"ENO - Acidity\",\"Pudin Hara -Stomach Ache, Gas and Indigestion\",\"Volini Spray - Muscle pain relief\",\"Bandage\",\"Crocin - Fever\",\"Vicks Action 500 - Headache, Blocked nose, Sore throat, Body ache\",\"Soframycin - for wounds\",\"Dettol\"],[\"Food Items\",\"Snacks\",\"Dry Bhel\",\"Khakra\",\"Methi Thepla\",\"Chakli\",\"Chips\",\"Dry Fruits\",\"Sweets\",\"Coffee Powder\",\"Instant Noodles\",\"Fruits\"],[\"Do Remember\",\"Turn Off Gas Valve\",\"Switch Off Lights/Gysure/Main Switch\",\"Close all water taps\",\"Make provision for watering the plants\",\"Make alternatives for Pet Care\",\"Inform Milk Man\",\"Inform News Paper Delivery boy\",\"Inform close relative about Holiday Location, Address & Contact Number\",\"Switch On the Safety Alarms\",\"Lock Cupboards\"]]";
            }
            ActivitySeatStatus.a((boolean)bl);
        }
    }

    private static byte[] a(Context context, boolean bl) {
        a.f(context);
        com.mulo.util.b b2 = new com.mulo.util.b(a.b(a.a(e)));
        int n2 = b2.d(0);
        byte[] arrby = b2.a(4, n2);
        int n3 = n2 + 4;
        int n4 = b2.d(n3);
        byte[] arrby2 = b2.a(n3 + 4, n4);
        a.a(arrby, bl);
        a.g(context);
        e.close();
        return arrby2;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a.a(inputStream, (OutputStream)byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static long b(InputStream inputStream, OutputStream outputStream) {
        int n2;
        byte[] arrby = new byte[4096];
        long l2 = 0L;
        while (-1 != (n2 = inputStream.read(arrby))) {
            outputStream.write(arrby, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    private static InputStream b(Context context, String string) {
        return context.getResources().getAssets().open(string.trim());
    }

    public static Vector<String> b(Context context) {
        a.a(context);
        return a;
    }

    private static void b(Context context, boolean bl) {
        if (bl ? l != null : m != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ir");
        stringBuilder.append(File.separator);
        stringBuilder.append("stationnamecodelatlon");
        InputStream inputStream = a.b(context, stringBuilder.toString());
        int n2 = inputStream.read();
        StringBuilder stringBuilder2 = new StringBuilder();
        while (n2 != -1) {
            stringBuilder2.append((char)n2);
            n2 = inputStream.read();
        }
        String[] arrstring = stringBuilder2.toString().split("\n");
        if (bl) {
            l = new LinkedHashMap();
            int n3 = arrstring.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                String[] arrstring2 = arrstring[i2].split(",");
                if (arrstring2[2].equals((Object)"0")) continue;
                LinkedHashMap<String, a> linkedHashMap = l;
                String string = arrstring2[1].trim();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(arrstring2[0].trim());
                stringBuilder3.append(" [");
                stringBuilder3.append(arrstring2[1].trim());
                stringBuilder3.append("]");
                linkedHashMap.put((Object)string, (Object)new a(stringBuilder3.toString(), arrstring2[2].trim(), arrstring2[3].trim(), arrstring2[1].trim()));
            }
        } else {
            m = new LinkedHashMap();
            int n4 = arrstring.length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String[] arrstring3 = arrstring[i3].split(",");
                m.put((Object)arrstring3[1], (Object)new a(arrstring3[0], arrstring3[1]));
            }
        }
        e.close();
    }

    private static boolean b(int n2) {
        int n3 = com.mulo.util.e.a();
        return n2 > 0 && n2 + 2 < n3;
    }

    public static boolean b(String string) {
        return string != null && i.containsKey((Object)string);
    }

    public static byte[] b(byte[] arrby) {
        if (arrby != null && arrby.length != 0) {
            D d2 = new D();
            d2.dc(arrby, 0, arrby.length);
            byte[] arrby2 = d2.toByteArray();
            d2.finish();
            return arrby2;
        }
        return null;
    }

    public static int c(String string) {
        return a.e(a.a(string));
    }

    private static com.b.a.b.a c(Context context, String string) {
        a a2 = a.a(context, string);
        if (a2 != null) {
            double d2 = Double.parseDouble((String)a2.c);
            return new com.b.a.b.a(Double.parseDouble((String)a2.d), d2);
        }
        return null;
    }

    private static String c(int n2) {
        return (String)c.get(n2);
    }

    public static Vector<String> c(Context context) {
        a.a(context);
        return c;
    }

    public static int d(Context context) {
        InputStream inputStream = a.b(context, "ir/iroutmindicator");
        byte[] arrby = new byte[4];
        inputStream.read(arrby, 0, 4);
        return com.mulo.util.b.c((byte[])arrby, (int)0);
    }

    private static l d(Context context, String string) {
        a.a(context, "getLineString", null);
        return a.i(string);
    }

    public static String d(String string) {
        int n2 = 1 + string.lastIndexOf(91);
        int n3 = string.lastIndexOf(93);
        if (n2 != -1) {
            if (n3 == -1) {
                return string;
            }
            return string.substring(n2, n3).trim();
        }
        return string;
    }

    public static int e(String string) {
        return a.indexOf((Object)string);
    }

    public static LinkedHashMap<String, a> e(Context context) {
        a.b(context, true);
        return l;
    }

    public static String f(String string) {
        String string2 = (String)i.get((Object)string);
        if (string2 == null) {
            a a2 = (a)m.get((Object)string);
            if (a2 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.a);
                stringBuilder.append(" [");
                stringBuilder.append(string);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" [");
            stringBuilder.append(string);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        return string2;
    }

    private static void f(Context context) {
        f = context.getResources().getAssets().open("ir/iroutmindicator");
        byte[] arrby = new byte[4];
        f.read(arrby, 0, 4);
        int n2 = com.mulo.util.b.c((byte[])arrby, (int)0);
        byte[] arrby2 = new byte[4];
        f.read(arrby2, 0, 4);
        int n3 = com.mulo.util.b.c((byte[])arrby2, (int)0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n2);
        stringBuilder.append("");
        stringBuilder.append(n3);
        stringBuilder.toString();
        e = f;
    }

    private static void g(Context context) {
        if (m == null) {
            a.b(context, false);
        }
    }

    private static String h(String string) {
        int n2 = string.lastIndexOf(91);
        int n3 = string.lastIndexOf(93);
        if (n2 != -1) {
            if (n3 == -1) {
                return string;
            }
            return string.substring(0, n2).trim();
        }
        return string;
    }

    private static l i(String string) {
        String string2 = a.j(string);
        com.b.a.c.b b2 = new com.b.a.c.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LINESTRING (");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        e e2 = b2.a(stringBuilder.toString());
        return new i().b(e2.e());
    }

    private static String j(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreElements()) {
            String[] arrstring = stringTokenizer.nextToken().split(",");
            String string2 = arrstring[0];
            String string3 = arrstring[1];
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            stringBuilder.append(",");
        }
        String string4 = stringBuilder.toString();
        return string4.substring(0, string4.length() - 1);
    }

    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public boolean f = false;

        private a(String string, String string2) {
            this.a = string;
            this.b = string2;
        }

        public a(String string, String string2, String string3, String string4) {
            this.a = string;
            this.c = string2;
            this.d = string3;
            this.e = string.toLowerCase();
        }

        public String a() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("&latitude=");
            stringBuilder.append(this.c);
            stringBuilder.append("&longitude=");
            stringBuilder.append(this.d);
            return stringBuilder.toString();
        }
    }

    public static class b {
        int a;
        double b;
        double c;
        double d;
        String e;
        String f;
        boolean g;
        boolean h;
        int i;
        l j;

        public b(int n2, double d2, double d3, double d4, String string, String string2, boolean bl, boolean bl2, int n3, l l2) {
            this.a = n2;
            this.b = d2;
            this.c = d3;
            this.d = d4;
            this.e = string;
            this.f = string2;
            this.g = bl;
            this.h = bl2;
            this.i = n3;
            this.j = l2;
        }

        public l a() {
            return this.j;
        }

        public boolean b() {
            return this.h;
        }

        public boolean c() {
            return this.g;
        }

        public int d() {
            return this.a;
        }

        public double e() {
            return this.b;
        }

        public double f() {
            return this.c;
        }

        public double g() {
            return this.d;
        }

        public String h() {
            return a.h(a.a(this.e));
        }

        public String i() {
            return this.e;
        }

        public String j() {
            return this.f;
        }

        public String k() {
            return a.h(a.a(this.f));
        }

        public int l() {
            return this.i;
        }
    }

}

