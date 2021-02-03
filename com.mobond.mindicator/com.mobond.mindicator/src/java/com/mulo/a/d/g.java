/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.util.Log
 *  java.io.InputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.AbstractList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Vector
 */
package com.mulo.a.d;

import android.app.Activity;
import android.util.Log;
import com.mulo.util.b;
import com.mulo.util.e;
import com.mulo.util.f;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class g {
    public String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    public g(String string, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18) {
        this.a = string;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.g = n7;
        this.h = n8;
        this.i = n9;
        this.j = n10;
        this.k = n11;
        this.l = n12;
        this.m = n13;
        this.n = n14;
        this.o = n15;
        this.p = n16;
        this.q = n17;
        this.r = n18;
    }

    private static g a(g g2) {
        String string;
        String string2 = g2.a;
        if (string2.startsWith("1RT>>")) {
            String[] arrstring = string2.substring(5, string2.length()).split("-");
            String string3 = "1RT>>";
            for (int i2 = -1 + arrstring.length; i2 >= 0; --i2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(arrstring[i2]);
                string3 = stringBuilder.toString();
                if (i2 == 0) continue;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string3);
                stringBuilder2.append("-");
                string3 = stringBuilder2.toString();
            }
            string = !string3.equals((Object)"1RT>>SNCR-TNA-KYN") && !string3.equals((Object)"1RT>>SNCR-TNA-DIVA-KYN") ? (!string3.equals((Object)"1RT>>JNJ-TUH-TNA-DIVA-KYN") && !string3.equals((Object)"1RT>>JNJ-TUH-TNA-KYN") ? (!string3.equals((Object)"1RT>>SNCR-CLA-TNA-KYN") && !string3.equals((Object)"1RT>>CLA-TNA-DIVA-KYN") ? string3 : "1RT>>JNJ-SNCR-CLA-TNA-DIVA-KYN") : "1RT>>JNJ-TUH-TNA-KYN") : "1RT>>JNJ-SNCR-TNA-KYN";
        } else {
            string = "";
        }
        g g3 = new g(string, g2.b, g2.c, g2.d, g2.e, g2.f, g2.g, g2.h, g2.i, g2.j, g2.k, g2.l, g2.m, g2.n, g2.o, g2.p, g2.q, g2.r);
        return g3;
    }

    private static g a(Vector<g> vector, String string) {
        if (string.startsWith("1RT>>")) {
            String[] arrstring = string.substring(5, string.length()).split("-");
            String string2 = "1RT>>";
            for (int i2 = -1 + arrstring.length; i2 >= 0; --i2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(arrstring[i2]);
                string2 = stringBuilder.toString();
                if (i2 == 0) continue;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string2);
                stringBuilder2.append("-");
                string2 = stringBuilder2.toString();
            }
            if (!string2.equals((Object)"1RT>>SNCR-TNA-KYN") && !string2.equals((Object)"1RT>>SNCR-TNA-DIVA-KYN")) {
                if (!string2.equals((Object)"1RT>>JNJ-TUH-TNA-DIVA-KYN") && !string2.equals((Object)"1RT>>JNJ-TUH-TNA-KYN")) {
                    if (string2.equals((Object)"1RT>>SNCR-CLA-TNA-KYN") || string2.equals((Object)"1RT>>CLA-TNA-DIVA-KYN")) {
                        string2 = "1RT>>JNJ-SNCR-CLA-TNA-DIVA-KYN";
                    }
                } else {
                    string2 = "1RT>>JNJ-TUH-TNA-KYN";
                }
            } else {
                string2 = "1RT>>JNJ-SNCR-TNA-KYN";
            }
            for (int i3 = 0; i3 < vector.size(); ++i3) {
                g g2 = (g)vector.elementAt(i3);
                if (!g2.a.equals((Object)string2)) continue;
                return g2;
            }
        }
        return null;
    }

    public static Vector<String> a(Activity activity, String string, String string2) {
        try {
            InputStream inputStream = e.a((Object)activity, "local/tf.dat");
            b b2 = new b(e.a(inputStream));
            Vector vector = new Vector((Collection)Arrays.asList((Object[])new String(b2.a(4, b2.d(0))).split(",")));
            inputStream.close();
            return vector;
        }
        catch (Exception exception) {
            Log.d((String)"TicketFare", (String)"TicketFare Exception in getStationNames", (Throwable)exception);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Vector<g> a(Object object, String string, String string2, boolean bl) {
        b b2;
        int n2;
        Vector vector;
        int n3;
        int n4;
        Vector vector2;
        int n5;
        int n6;
        InputStream inputStream;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TicketFare src:");
            stringBuilder.append(string);
            stringBuilder.append("  dest:");
            stringBuilder.append(string2);
            Log.d((String)"TicketFare", (String)stringBuilder.toString());
            System.out.println("============= DECODING ================");
            inputStream = e.a(object, "local/tf.dat");
            b2 = new b(e.a(inputStream));
            n5 = 0;
            int n7 = b2.d(0);
            Vector vector3 = new Vector((Collection)Arrays.asList((Object[])new String(b2.a(4, n7)).split(",")));
            int n8 = n7 + 4;
            n4 = vector3.indexOf((Object)string);
            n2 = vector3.indexOf((Object)string2);
            int n9 = b2.d(n8);
            int n10 = n8 + 4;
            vector2 = new Vector((Collection)Arrays.asList((Object[])new String(b2.a(n10, n9)).split(",")));
            int n11 = n10 + n9;
            n3 = b2.d(n11);
            n6 = n11 + 4;
            vector = new Vector();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        do {
            if (n5 < n3) {
                short s2 = b2.b(n6);
                short s3 = b2.b(n6 + 2);
                if (n4 == s2 && n2 == s3) {
                    short s4 = b2.b(n6 + 4);
                    short s5 = b2.b(n6 + 6);
                    short s6 = b2.b(n6 + 8);
                    short s7 = b2.b(n6 + 10);
                    short s8 = b2.b(n6 + 12);
                    short s9 = b2.b(n6 + 14);
                    short s10 = b2.b(n6 + 16);
                    short s11 = b2.b(n6 + 18);
                    short s12 = b2.b(n6 + 20);
                    short s13 = b2.b(n6 + 22);
                    short s14 = b2.b(n6 + 24);
                    short s15 = b2.b(n6 + 26);
                    short s16 = b2.b(n6 + 28);
                    short s17 = b2.b(n6 + 30);
                    short s18 = b2.b(n6 + 32);
                    short s19 = b2.b(n6 + 34);
                    short s20 = b2.b(n6 + 36);
                    short s21 = b2.b(n6 + 38);
                    String string3 = (String)vector2.get((int)s4);
                    g g2 = new g(string3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
                    if (!g.a((Vector<g>)vector, g2)) {
                        vector.add((Object)g2);
                    }
                }
            } else {
                new f(){

                    @Override
                    public boolean a(int n2, int n3, AbstractList abstractList) {
                        int n4 = ((g)abstractList.get((int)n2)).b;
                        int n5 = ((g)abstractList.get((int)n3)).b;
                        if (n4 != n5) {
                            if (n4 == 0) {
                                return true;
                            }
                            if (n5 == 0) {
                                return false;
                            }
                            return n4 > n5;
                        }
                        return ((g)abstractList.get((int)n2)).i > ((g)abstractList.get((int)n3)).i;
                    }
                }.a((AbstractList)vector, true);
                inputStream.close();
                if (!bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ticketfareVector.size(): ");
                    stringBuilder.append(vector.size());
                    g.a("TicketFare", stringBuilder.toString());
                    g.a(object, string, string2, (Vector<g>)vector, true);
                }
                return vector;
            }
            n6 += 40;
            n5 += 40;
        } while (true);
    }

    private static void a(Object object, String string, String string2, Vector<g> vector, boolean bl) {
        block19 : {
            block18 : {
                int n2 = vector.size();
                if (n2 != 0) break block18;
                Vector<g> vector2 = g.a(object, string2, string, true);
                if (vector2 == null) break block19;
                for (int i2 = 0; i2 < vector2.size(); ++i2) {
                    vector.add((Object)g.a((g)vector2.get(i2)));
                }
                break block19;
            }
            Vector<g> vector3 = g.a(object, string2, string, true);
            for (int i3 = 0; i3 < vector.size(); ++i3) {
                g g2;
                g g3;
                g g4;
                g g5;
                g g6;
                g g7;
                g g8;
                g g9;
                g g10;
                g g11;
                g g12;
                g g13;
                g g14;
                g g15;
                g g16;
                g g17;
                g g18;
                g g19 = (g)vector.get(i3);
                if (g19.h == 0 && (g6 = g.a(vector3, g19.a)) != null) {
                    g19.h = g6.h;
                }
                if (g19.i == 0 && (g10 = g.a(vector3, g19.a)) != null) {
                    g19.i = g10.i;
                }
                if (g19.g == 0 && (g7 = g.a(vector3, g19.a)) != null) {
                    g19.g = g7.g;
                }
                if (g19.j == 0 && (g12 = g.a(vector3, g19.a)) != null) {
                    g19.j = g12.j;
                }
                if (g19.k == 0 && (g18 = g.a(vector3, g19.a)) != null) {
                    g19.k = g18.k;
                }
                if (g19.c == 0 && (g2 = g.a(vector3, g19.a)) != null) {
                    g19.c = g2.c;
                }
                if (g19.d == 0 && (g5 = g.a(vector3, g19.a)) != null) {
                    g19.d = g5.d;
                }
                if (g19.b == 0 && (g14 = g.a(vector3, g19.a)) != null) {
                    g19.b = g14.b;
                }
                if (g19.e == 0 && (g17 = g.a(vector3, g19.a)) != null) {
                    g19.e = g17.e;
                }
                if (g19.f == 0 && (g13 = g.a(vector3, g19.a)) != null) {
                    g19.f = g13.f;
                }
                if (g19.m == 0 && (g9 = g.a(vector3, g19.a)) != null) {
                    g19.m = g9.m;
                }
                if (g19.n == 0 && (g8 = g.a(vector3, g19.a)) != null) {
                    g19.n = g8.n;
                }
                if (g19.l == 0 && (g3 = g.a(vector3, g19.a)) != null) {
                    g19.l = g3.l;
                }
                if (g19.o == 0 && (g15 = g.a(vector3, g19.a)) != null) {
                    g19.o = g15.o;
                }
                if (g19.p == 0 && (g11 = g.a(vector3, g19.a)) != null) {
                    g19.p = g11.p;
                }
                if (g19.q == 0 && (g4 = g.a(vector3, g19.a)) != null) {
                    g19.q = g4.q;
                }
                if (g19.r != 0 || (g16 = g.a(vector3, g19.a)) == null) continue;
                g19.r = g16.r;
            }
        }
    }

    private static void a(String string, String string2) {
        int n2 = 0;
        int n3 = 0;
        while (n2 < string2.length()) {
            if ((n2 += 3000) > string2.length()) {
                Log.d((String)string, (String)string2);
            } else {
                Log.d((String)string, (String)string2.substring(n3, n2));
            }
            n3 += 3000;
        }
    }

    private static boolean a(Vector<g> vector, g g2) {
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            g g3 = (g)vector.get(i2);
            if (!g3.a.equals((Object)g2.a) || g3.h != g2.h || g3.i != g2.i || g3.g != g2.g || g3.j != g2.j || g3.k != g2.k || g3.c != g2.c || g3.d != g2.d || g3.b != g2.b || g3.e != g2.e || g3.f != g2.f || g3.m != g2.m || g3.n != g2.n || g3.l != g2.l || g3.o != g2.o || g3.p != g2.p || g3.q != g2.q || g3.r != g2.r) continue;
            return true;
        }
        return false;
    }

}

