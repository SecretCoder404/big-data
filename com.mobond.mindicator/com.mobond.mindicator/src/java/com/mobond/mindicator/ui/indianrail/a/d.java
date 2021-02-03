/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.mobond.mindicator.ui.indianrail.a.d$1
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.AbstractList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.indianrail.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.a.b;
import com.mobond.mindicator.ui.indianrail.a.c;
import com.mobond.mindicator.ui.indianrail.a.d;
import com.mobond.mindicator.ui.indianrail.a.e;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.a.g;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class d {
    public static Vector<c> a;
    public static int b;
    private static String[] c;
    private static HashMap<Integer, Integer> d;

    static {
        c = new String[]{"ANDI,ANVR,ANVT,DEC,DEE,DLI,DSA,DSJ,NDLS,NZM,SZM", "JBP,MML", "BRC,PRTN", "ADI,MANI,SBI", "CCT,COA", "HWH,KOAA,SDAH,SHM,SRC", "SCM,VSKP", "AVD,MAS,MBM,MMC,MS,MSB,STM,TBM", "BMT,HYB,KCG,SC", "CHTS,ERN,ERS", "KNKD,MAJN,MAQ", "MDU,TENI", "SRGM,TP,TPJ,TRB", "BNC,MWM,SBC,WFD,YNK,YPR", "KPD,VLR", "PGT,PGTN", "CBE,CBF", "SCT,TSI", "NCR,NGT", "BPL,HBJ", "SA,SXT", "KCVL,TVC", "DNR,PNBE,RJPB", "BGKT,JU", "BLKN,BLNK", "BSP,USL", "KMZ,KTE,KTES", "BCY,BSB,MUV", "JNU,JOP", "GD,GNAN", "LJN,LKO,LC,LKO", "ALD,PRG", "ABH,ADH,BB,BCT,MMCT,BDTS,BSR,BVI,BYR,CCG,CSMT,DDR,DR,GC,KYN,LTT,MDD,MLND,PNVL,TNA,VR,VSH", "CCH,KK,PUNE", "DVL,NK", "AJNI,NGP,WR"};
    }

    public static int a(int n2) {
        Integer n3 = (Integer)d.a().get((Object)n2);
        if (n3 == null) {
            return -1;
        }
        return n3;
    }

    private static String a(int n2, int n3, int n4, int n5) {
        int n6 = n5 - n4;
        int n7 = n6 == 0 ? n3 - n2 : (n6 == 1 ? n3 + (1440 - n2) : (n6 > 1 ? n3 + (1440 - n2 + 1440 * (n6 - 1)) : 0));
        return d.c(n7);
    }

    @SuppressLint(value={"UseSparseArrays"})
    private static HashMap<Integer, Integer> a() {
        if (d == null) {
            d = new HashMap();
            String[] arrstring = c;
            int n2 = arrstring.length;
            int n3 = 9999;
            for (int i2 = 0; i2 < n2; ++i2) {
                String[] arrstring2 = arrstring[i2].split(",");
                ++n3;
                int n4 = arrstring2.length;
                for (int i3 = 0; i3 < n4; ++i3) {
                    int n5 = a.c(arrstring2[i3]);
                    d.put((Object)n5, (Object)n3);
                }
            }
        }
        return d;
    }

    public static void a(Context context, String string, String string2, String string3) {
        a = new Vector();
        int n2 = a.e(string);
        int n3 = a.e(string2);
        Vector<f> vector = a.a(context);
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            f f2 = (f)vector.elementAt(i2);
            e e2 = f2.a(n2, n3);
            if (e2 == null) continue;
            int n4 = e2.a;
            int n5 = e2.b;
            Vector<g> vector2 = f2.a();
            c c2 = new c();
            g g2 = (g)vector2.get(n4);
            g g3 = (g)vector2.get(n5);
            c2.c = g2.d;
            c2.b = d.b(g2.d);
            c2.e = g3.d;
            c2.d = d.b(g3.d);
            c2.a = f.a(context, g2.a);
            c2.f = Integer.parseInt((String)g2.g);
            c2.g = Integer.parseInt((String)g3.g);
            c2.h = f2;
            c2.i = f.a(context, g2.a);
            c2.j = a.d(g2.a);
            c2.k = f.a(context, g3.a);
            c2.l = d.a(c2.c, c2.e, c2.f, c2.g);
            c2.m = a.a(c2.h.d, c2.f);
            c2.n = a.a(c2.h.d, 1);
            a.add((Object)c2);
        }
        new 1().a(a, true);
    }

    public static void a(String string, String string2, String string3, String string4, String string5, String[] arrstring, HashMap<String, String> hashMap, f f2, Context context) {
        f f3;
        Object object = f2 != null ? f2.a() : ((f3 = a.a(string, context)) != null ? f3.a() : null);
        if (object != null) {
            Iterator iterator = object.iterator();
            int n2 = -1;
            while (iterator.hasNext()) {
                g g2 = (g)iterator.next();
                String string6 = g2.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                stringBuilder.append(string4);
                stringBuilder.append("]");
                if (!string6.contains((CharSequence)stringBuilder.toString())) continue;
                n2 = Integer.parseInt((String)g2.f);
            }
            Iterator iterator2 = object.iterator();
            int n3 = -1;
            while (iterator2.hasNext()) {
                g g3 = (g)iterator2.next();
                String string7 = g3.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                stringBuilder.append(string5);
                stringBuilder.append("]");
                if (!string7.contains((CharSequence)stringBuilder.toString())) continue;
                n3 = Integer.parseInt((String)g3.f);
            }
            if (n2 != -1 && n3 != -1) {
                int n4 = Math.abs((int)(n3 - n2));
                for (String string8 : arrstring) {
                    Integer n5 = b.a(string2, string3, string8, n4);
                    if (n5 != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("\u20b9");
                        stringBuilder.append((Object)n5);
                        hashMap.put((Object)string8, (Object)stringBuilder.toString());
                        continue;
                    }
                    hashMap.put((Object)string8, (Object)"");
                }
            }
        }
    }

    private static String b(int n2) {
        Object object;
        Object object2;
        int n3 = n2 / 60;
        int n4 = n2 % 60;
        StringBuilder stringBuilder = new StringBuilder();
        if (n3 < 10) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("0");
            stringBuilder2.append(n3);
            object = stringBuilder2.toString();
        } else {
            object = n3;
        }
        stringBuilder.append(object);
        stringBuilder.append(":");
        if (n4 < 10) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("0");
            stringBuilder3.append(n4);
            object2 = stringBuilder3.toString();
        } else {
            object2 = n4;
        }
        stringBuilder.append(object2);
        return stringBuilder.toString();
    }

    private static String c(int n2) {
        int n3 = n2 / 60;
        int n4 = n2 % 60;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("h ");
        stringBuilder.append(n4);
        stringBuilder.append("m");
        return stringBuilder.toString();
    }
}

