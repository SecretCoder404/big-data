/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.io.InputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Enumeration
 *  java.util.HashMap
 *  java.util.Hashtable
 *  java.util.List
 *  java.util.StringTokenizer
 *  java.util.Vector
 */
package com.mulo.a.a;

import android.content.Context;
import android.util.Log;
import com.mulo.util.e;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class a {
    public static String a = "/";
    static a b;
    private static String c;
    private static HashMap d;
    private Hashtable<String, String> e;
    private Hashtable<String, int[]> f;
    private Vector<String> g;
    private String[] h;
    private int[] i;
    private String[] j;

    static {
        d = new HashMap();
    }

    private a(Context context, String string, String string2) {
        this.a(context, string, string2);
    }

    public static a a(Context context, String string, String string2, String string3, String string4) {
        a = string3;
        c = string;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("_");
            stringBuilder.append(string2);
            String string5 = stringBuilder.toString();
            PrintStream printStream = System.out;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("### Route id ");
            stringBuilder2.append(string2);
            printStream.println(stringBuilder2.toString());
            if (d.containsKey((Object)string5) && d.size() != 0) {
                System.out.println("### item found in HashMap ");
                return (a)d.get((Object)string5);
            }
            System.out.println("### No item found in HashMap ");
            b = new a(context, string2, string4);
            d.put((Object)string5, (Object)b);
            a a2 = b;
            return a2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private com.mulo.a.a.b a(Vector<com.mulo.a.a.b> vector) {
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            com.mulo.a.a.b b2 = (com.mulo.a.a.b)vector.get(i2);
            int n2 = b2.d;
            if (this.i[n2] <= 0) continue;
            return b2;
        }
        return (com.mulo.a.a.b)vector.firstElement();
    }

    public static void a() {
        d.clear();
    }

    private static int[] b(String string) {
        String[] arrstring = string.split(",");
        int[] arrn = new int[arrstring.length];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = Integer.parseInt((String)arrstring[i2]);
        }
        return arrn;
    }

    public Vector<b> a(int n2, int n3, int n4) {
        Vector vector = new Vector();
        for (String string : this.j) {
            string.equals((Object)"138");
            int[] arrn = (int[])this.f.get((Object)string);
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            int n5 = -1;
            int n6 = -1;
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                if (!bl && arrn[i2] == n2) {
                    n5 = i2;
                    bl = true;
                }
                if (!bl2 && arrn[i2] == n3) {
                    n6 = i2;
                    bl2 = true;
                }
                if (bl3 || arrn[i2] != n4) continue;
                bl3 = true;
            }
            string.equals((Object)"138");
            if (n4 == -1) {
                if (!bl || !bl2) continue;
                String[] arrstring = this.h;
                String string2 = arrstring[arrn[0]];
                String string3 = arrstring[arrn[-1 + arrn.length]];
                b b2 = new b(string, Math.abs((int)(n5 - n6)), string2, string3);
                vector.add((Object)b2);
                continue;
            }
            if (bl && bl2 && bl3 || !bl || !bl2) continue;
            String[] arrstring = this.h;
            String string4 = arrstring[arrn[0]];
            String string5 = arrstring[arrn[-1 + arrn.length]];
            b b3 = new b(string, Math.abs((int)(n5 - n6)), string4, string5);
            vector.add((Object)b3);
        }
        Collections.sort((List)vector, (Comparator)new Comparator<b>(){

            public int a(b b2, b b3) {
                return Integer.valueOf((int)b2.d).compareTo(Integer.valueOf((int)b3.d));
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((b)object, (b)object2);
            }
        });
        return vector;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(Context var1_1, String var2_2, String var3_3) {
        var4_4 = new StringBuilder();
        var4_4.append("bus/");
        var4_4.append(var2_2);
        var4_4.append("/EN_b1");
        var8_5 = e.a((Object)var1_1, var4_4.toString());
        var9_6 = new StringBuilder();
        var9_6.append("bus/");
        var9_6.append(var2_2);
        var9_6.append("/EN_b2");
        var13_7 = e.a((Object)var1_1, var9_6.toString());
        try {
            var14_8 = new com.mulo.util.b();
            this.g = new Vector();
            do {
                if ((var16_9 = var13_7.read()) == -1) break;
                var49_10 = (byte)(~var16_9);
                if ((char)var49_10 != '\n') ** GOTO lbl25
                var50_11 = new String(var14_8.a(), "UTF-8");
                var14_8.b();
                if (var50_11.trim().length() <= 0) continue;
                this.g.addElement((Object)var50_11);
                var14_8 = new com.mulo.util.b();
                continue;
lbl25: // 1 sources:
                var14_8.a(var49_10);
                continue;
                break;
            } while (true);
            this.h = new String[this.g.size()];
            this.i = new int[this.g.size()];
            this.g.copyInto((Object[])this.h);
            var13_7.close();
            var17_12 = new StringBuffer();
            this.e = new Hashtable();
            this.f = new Hashtable();
            var18_13 = new Vector();
            do {
                block9 : {
                    var19_14 = var8_5.read();
                    if (var19_14 == -1) break;
                    var21_16 = (char)(~var19_14);
                    if (var21_16 != '\n') ** GOTO lbl68
                    var22_17 = var17_12.toString();
                    var23_18 = new StringBuffer();
                    if (var22_17.trim().length() > 0) {
                        var24_19 = var22_17.indexOf(",");
                        var25_20 = var22_17.substring(0, var24_19);
                        var26_21 = var24_19 + 1;
                        var27_22 = var22_17.indexOf(",", var26_21);
                        var28_23 = (String)this.g.elementAt(Integer.parseInt((String)var22_17.substring(var26_21, var27_22)));
                        var29_24 = Integer.parseInt((String)var22_17.substring(1 + var22_17.lastIndexOf(","), var22_17.length()));
                        var30_25 = (String)this.g.elementAt(var29_24);
                        var31_26 = new StringBuilder();
                        var31_26.append(var25_20);
                        var31_26.append("#A: ");
                        var31_26.append(var28_23);
                        var31_26.append("\nB: ");
                        var31_26.append(var30_25);
                        var37_27 = var31_26.toString();
                        var18_13.addElement((Object)var37_27);
                        var38_28 = var22_17.substring(var26_21, var22_17.length());
                        this.e.put((Object)var25_20, (Object)var38_28);
                        var40_29 = a.b(var38_28);
                        this.f.put((Object)var37_27, (Object)var40_29);
                        var42_30 = var40_29[0];
                        var43_31 = var40_29[-1 + var40_29.length];
                        this.i[var42_30] = 1 + this.i[var42_30];
                        this.i[var43_31] = 1 + this.i[var43_31];
                    }
                    break block9;
lbl68: // 1 sources:
                    var17_12.append(var21_16);
                    continue;
                }
                var17_12 = var23_18;
                continue;
                break;
            } while (true);
            for (var20_15 = 0; var20_15 < this.i.length; ++var20_15) {
                var45_32 = new StringBuilder();
                var45_32.append("busStopsWeightArray ");
                var45_32.append(this.i[var20_15]);
                Log.d((String)"busStopsWeightArray", (String)var45_32.toString());
            }
        }
        catch (Exception var15_33) {
            var15_33.printStackTrace();
            return;
        }
        this.j = new String[var18_13.size()];
        var18_13.copyInto((Object[])this.j);
        var8_5.close();
    }

    public String[] a(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer((String)this.e.get((Object)string), ",");
        Vector vector = new Vector();
        while (stringTokenizer.hasMoreElements()) {
            int n2 = Integer.parseInt((String)((String)stringTokenizer.nextElement()));
            vector.addElement(this.g.elementAt(n2));
        }
        Object[] arrobject = new String[vector.size()];
        vector.copyInto(arrobject);
        return arrobject;
    }

    public String[] a(String string, String string2) {
        int n2 = this.g.indexOf((Object)string);
        int n3 = this.g.indexOf((Object)string2);
        Enumeration enumeration = this.e.keys();
        Vector vector = new Vector();
        while (enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            String string3 = (String)this.e.get(object);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append(",");
            if (!string3.startsWith(stringBuilder.toString())) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(",");
                stringBuilder2.append(n2);
                stringBuilder2.append(",");
                if (string3.indexOf(stringBuilder2.toString()) == -1) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(",");
                    stringBuilder3.append(n2);
                    if (!string3.endsWith(stringBuilder3.toString())) continue;
                }
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(n3);
            stringBuilder4.append(",");
            if (!string3.startsWith(stringBuilder4.toString())) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(",");
                stringBuilder5.append(n3);
                stringBuilder5.append(",");
                if (string3.indexOf(stringBuilder5.toString()) == -1) {
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append(",");
                    stringBuilder6.append(n3);
                    if (!string3.endsWith(stringBuilder6.toString())) continue;
                }
            }
            int n4 = string3.indexOf(",");
            String string4 = (String)this.g.elementAt(Integer.parseInt((String)string3.substring(0, n4)));
            int n5 = Integer.parseInt((String)string3.substring(1 + string3.lastIndexOf(","), string3.length()));
            String string5 = (String)this.g.elementAt(n5);
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append(object);
            stringBuilder7.append("#A: ");
            stringBuilder7.append(string4);
            stringBuilder7.append(" \nB: ");
            stringBuilder7.append(string5);
            vector.addElement((Object)stringBuilder7.toString());
        }
        Collections.sort((List)vector);
        Object[] arrobject = new String[vector.size()];
        vector.copyInto(arrobject);
        return arrobject;
    }

    public Vector<com.mulo.a.a.b> b(String string, String string2) {
        int n2 = this.g.size();
        int n3 = this.g.indexOf((Object)string);
        int n4 = this.g.indexOf((Object)string2);
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector<b> vector3 = this.a(n3, n4, -1);
        if (vector3.size() < 4) {
            for (int i2 = 0; i2 < n2; ++i2) {
                Vector<b> vector4;
                Vector<b> vector5;
                if (i2 == n3 || i2 == n4 || (vector4 = this.a(i2, n3, n4)).size() <= 0 || (vector5 = this.a(i2, n4, n3)).size() <= 0) continue;
                vector.add((Object)new a(vector4, i2, vector5));
            }
            for (int i3 = 0; i3 < vector.size(); ++i3) {
                a a2 = (a)vector.get(i3);
                for (int i4 = 0; i4 < a2.a.size(); ++i4) {
                    b b2 = (b)a2.a.get(i4);
                    for (int i5 = 0; i5 < a2.c.size(); ++i5) {
                        b b3 = (b)a2.c.get(i5);
                        if (b2.a.equals((Object)b3.a)) continue;
                        com.mulo.a.a.b b4 = new com.mulo.a.a.b(b2.a, b2.d, this.h[a2.b], a2.b, b3.d, b3.a);
                        vector2.add((Object)b4);
                    }
                }
            }
            Collections.sort((List)vector2, (Comparator)new Comparator<com.mulo.a.a.b>(){

                public int a(com.mulo.a.a.b b2, com.mulo.a.a.b b3) {
                    return Integer.valueOf((int)b2.g).compareTo(Integer.valueOf((int)b3.g));
                }

                public /* synthetic */ int compare(Object object, Object object2) {
                    return this.a((com.mulo.a.a.b)object, (com.mulo.a.a.b)object2);
                }
            });
            int n5 = 0;
            for (int i6 = 0; i6 < vector2.size(); ++i6) {
                com.mulo.a.a.b b5 = (com.mulo.a.a.b)vector2.get(i6);
                if (i6 == 0) {
                    n5 = b5.g;
                    continue;
                }
                if (b5.g <= n5 + 25) continue;
                while (vector2.size() > i6) {
                    vector2.remove(vector2.size() - 1);
                }
                break;
            }
            int n6 = 0;
            while (n6 < vector2.size() - 1) {
                int n7;
                com.mulo.a.a.b b6 = (com.mulo.a.a.b)vector2.get(n6);
                String string3 = b6.a;
                String string4 = b6.f;
                Vector vector6 = new Vector();
                for (int i7 = n7 = n6 + 1; i7 < vector2.size(); ++i7) {
                    com.mulo.a.a.b b7 = (com.mulo.a.a.b)vector2.get(i7);
                    if (!string3.equals((Object)b7.a) || !string4.equals((Object)b7.f)) continue;
                    if (vector6.size() == 0) {
                        vector6.add((Object)b6);
                    }
                    vector2.remove((Object)b7);
                    --i7;
                    vector6.add((Object)b7);
                }
                if (vector6.size() > 0) {
                    vector2.setElementAt((Object)this.a((Vector<com.mulo.a.a.b>)vector6), n6);
                }
                n6 = n7;
            }
        }
        Collections.sort((List)vector2, (Comparator)new Comparator<com.mulo.a.a.b>(){

            public int a(com.mulo.a.a.b b2, com.mulo.a.a.b b3) {
                if (b2.a.equals((Object)b3.a)) {
                    return Integer.valueOf((int)b2.g).compareTo(Integer.valueOf((int)b3.g));
                }
                return b2.a.compareTo(b3.a);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((com.mulo.a.a.b)object, (com.mulo.a.a.b)object2);
            }
        });
        Collections.sort((List)vector2, (Comparator)new Comparator<com.mulo.a.a.b>(){

            public int a(com.mulo.a.a.b b2, com.mulo.a.a.b b3) {
                return Integer.valueOf((int)b2.g).compareTo(Integer.valueOf((int)b3.g));
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((com.mulo.a.a.b)object, (com.mulo.a.a.b)object2);
            }
        });
        for (int i8 = 0; i8 < vector3.size(); ++i8) {
            b b8 = (b)vector3.get(i8);
            String string5 = b8.a;
            int n8 = b8.d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("From: ");
            stringBuilder.append(b8.b);
            stringBuilder.append(" To: ");
            stringBuilder.append(b8.c);
            com.mulo.a.a.b b9 = new com.mulo.a.a.b(string5, n8, stringBuilder.toString(), 0, 0, "");
            b9.h = true;
            vector2.insertElementAt((Object)b9, i8);
        }
        return vector2;
    }

    public String[] b() {
        return this.j;
    }

    public String[] c() {
        return this.h;
    }

    class a {
        public Vector<b> a;
        public int b;
        public Vector<b> c;

        public a(Vector<b> vector, int n2, Vector<b> vector2) {
            this.a = vector;
            this.b = n2;
            this.c = vector2;
        }
    }

    class b {
        String a;
        String b;
        String c;
        int d;

        public b(String string, int n2, String string2, String string3) {
            this.a = string;
            this.d = n2;
            this.b = string2;
            this.c = string3;
        }
    }

}

