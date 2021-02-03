/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.util.Log
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.AbstractList
 *  java.util.ArrayList
 *  java.util.Hashtable
 *  java.util.Vector
 *  java.util.zip.GZIPInputStream
 */
package com.mulo.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import com.mulo.a.c.b;
import com.mulo.a.c.c;
import com.mulo.a.c.d;
import com.mulo.util.e;
import com.mulo.util.f;
import java.io.InputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import java.util.zip.GZIPInputStream;

public class a {
    protected static final char[] a = "0123456789ABCDEF".toCharArray();
    private static a g = null;
    public Vector<c> b;
    public String[] c;
    public InputStream d;
    public InputStream e;
    public InputStream f;
    private Vector<String> h;
    private Vector<b> i;
    private Hashtable<String, String> j;

    private a(Activity activity) {
        this.b(activity);
    }

    public static a a(Activity activity) {
        if (g == null) {
            try {
                g = new a(activity);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return g;
    }

    public static String a(int n2) {
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

    public static void a() {
        g = null;
    }

    private void b() {
        if (this.j == null) {
            this.j = new Hashtable();
            this.j.put((Object)"AC-SHIVNERI", (Object)"AC - \u0936\u093f\u0935\u0928\u0947\u0930\u0940");
        }
    }

    public int a(short s2) {
        if (s2 < 0) {
            s2 = (short)(s2 + 65536);
        }
        return s2;
    }

    public InputStream a(Activity activity, String string) {
        String string2 = this.d(activity);
        String string3 = this.a((Context)activity);
        if (string3 != null && string3.compareTo(string2) > 0) {
            this.e.close();
            this.e = null;
            return this.f;
        }
        InputStream inputStream = this.f;
        if (inputStream != null) {
            inputStream.close();
            this.f = null;
        }
        return this.e;
    }

    public String a(Context context) {
        try {
            InputStream inputStream = context.createPackageContext("com.mobond.mindicator.msrtc", 0).getAssets().open("msrtcdb");
            byte[] arrby = new byte[4];
            inputStream.read(arrby, 0, 4);
            int n2 = com.mulo.util.b.c(arrby, 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(n2);
            String string = stringBuilder.toString();
            this.f = inputStream;
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "1";
        }
    }

    public Vector<d> a(b b2) {
        Vector vector = new Vector();
        com.mulo.util.b b3 = new com.mulo.util.b(b2.g);
        int n2 = b3.c();
        int n3 = 0;
        while (n3 < n2) {
            d d2 = new d();
            int n4 = b3.b(n3);
            int n5 = n3 + 2;
            if (n4 < 0) {
                n4 += 65536;
            }
            d2.a = (c)this.b.get(n4);
            byte by = b3.a(n5);
            n3 = n5 + 1;
            if (by % 2 == 1) {
                short s2 = b3.b(n3);
                n3 += 2;
                if (s2 != -1) {
                    d2.d = a.a(s2);
                    d2.e = s2;
                }
            }
            if (by != 0 && by != 1) {
                if (by != 2 && by != 3) {
                    if (by != 4 && by != 5) {
                        if (by != 6 && by != 7) {
                            d2.b = "-";
                            d2.c = "-";
                        } else {
                            d2.b = "No";
                            d2.c = "No";
                        }
                    } else {
                        d2.b = "No";
                        d2.c = "Yes";
                    }
                } else {
                    d2.b = "Yes";
                    d2.c = "No";
                }
            } else {
                d2.b = "Yes";
                d2.c = "Yes";
            }
            vector.add((Object)d2);
        }
        return vector;
    }

    public Vector<b> a(short s2, int n2) {
        return this.a(s2, (short)-1, n2);
    }

    public Vector<b> a(short s2, short s3, int n2) {
        Vector vector = new Vector();
        block0 : for (int i2 = 0; i2 < this.i.size(); ++i2) {
            b b2 = (b)this.i.elementAt(i2);
            for (int i3 = 0; i3 < b2.f.size(); ++i3) {
                int n3 = b2.f.indexOf((Object)s2);
                if (s3 != -1) {
                    int n4 = b2.f.indexOf((Object)s3);
                    if (n3 == -1 || n4 == -1 || n3 >= n4) continue;
                    if (n2 == 1 && (b2.b.equalsIgnoreCase("AC-ASHWAMEDH") || b2.b.equalsIgnoreCase("AC-SHEETAL") || b2.b.equalsIgnoreCase("AC-SHIVNERI"))) {
                        vector.add((Object)b2);
                    } else {
                        vector.add((Object)b2);
                    }
                    Vector<d> vector2 = this.a(b2);
                    b2.j = ((d)vector2.get((int)n3)).d;
                    b2.k = ((d)vector2.get((int)n3)).e;
                    b2.m = n3;
                    b2.n = n4;
                    b2.l = ((d)vector2.get((int)n3)).a.a;
                    continue block0;
                }
                if (n3 == -1) continue;
                vector.add((Object)b2);
                Vector<d> vector3 = this.a(b2);
                b2.j = ((d)vector3.get((int)n3)).d;
                b2.k = ((d)vector3.get((int)n3)).e;
                b2.m = n3;
                b2.l = ((d)vector3.get((int)n3)).a.a;
                continue block0;
            }
        }
        new f(){

            @Override
            public boolean a(int n2, int n3, AbstractList abstractList) {
                return ((b)abstractList.get((int)n2)).e > ((b)abstractList.get((int)n3)).e;
            }
        }.a((AbstractList)vector, true);
        new f(){

            @Override
            public boolean a(int n2, int n3, AbstractList abstractList) {
                int n4 = ((b)abstractList.get((int)n2)).k;
                int n5 = ((b)abstractList.get((int)n3)).k;
                if (n4 == 0 && n5 != 0) {
                    return true;
                }
                if (n4 != 0 && n5 == 0) {
                    return false;
                }
                return n4 > n5;
            }
        }.a((AbstractList)vector, true);
        return vector;
    }

    public Vector<c> b(Activity activity) {
        if (this.b == null) {
            this.d = this.a(activity, "msrtcdb");
            GZIPInputStream gZIPInputStream = new GZIPInputStream(this.d);
            com.mulo.util.b b2 = new com.mulo.util.b(e.a((InputStream)gZIPInputStream));
            int n2 = b2.d(0);
            String string = new String(b2.a(4, n2));
            int n3 = n2 + 4;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("1111: ");
            stringBuilder.append(string);
            Log.d((String)"1111", (String)stringBuilder.toString());
            String[] arrstring = string.split("~");
            this.b = new Vector();
            this.b();
            int n4 = b2.d(n3);
            int n5 = n3 + 4;
            String string2 = new String(b2.a(n5, n4));
            int n6 = n5 + n4;
            String[] arrstring2 = string2.split(",");
            for (int i2 = 0; i2 < arrstring2.length; ++i2) {
                String[] arrstring3 = arrstring2[i2].split("#");
                String string3 = arrstring3[0];
                String string4 = arrstring3[1];
                this.j.put((Object)string3, (Object)string4);
            }
            int n7 = b2.d(n6);
            int n8 = n6 + 4;
            String string5 = new String(b2.a(n8, n7));
            int n9 = n8 + n7;
            this.c = string5.split(",");
            for (int i3 = 0; i3 < arrstring.length; ++i3) {
                String[] arrstring4 = arrstring[i3].split(":");
                c c2 = new c();
                c2.a = arrstring4[0];
                c2.b = arrstring4[1];
                c2.c = arrstring4[2];
                c2.d = (String)this.j.get((Object)c2.a);
                c2.e = (String)this.j.get((Object)c2.b);
                c2.f = (String)this.j.get((Object)c2.c);
                if (c2.d == null) {
                    c2.d = c2.a;
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(c2.a);
                    stringBuilder2.append(" - ");
                    stringBuilder2.append(c2.d);
                    c2.d = stringBuilder2.toString();
                }
                if (c2.e == null) {
                    c2.e = c2.b;
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(c2.b);
                    stringBuilder3.append(" - ");
                    stringBuilder3.append(c2.e);
                    c2.e = stringBuilder3.toString();
                }
                if (c2.f == null) {
                    c2.f = c2.c;
                } else {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(c2.c);
                    stringBuilder4.append(" - ");
                    stringBuilder4.append(c2.f);
                    c2.f = stringBuilder4.toString();
                }
                this.b.add((Object)c2);
            }
            int n10 = b2.d(n9);
            int n11 = n9 + 4;
            String string6 = new String(b2.a(n11, n10));
            int n12 = n11 + n10;
            String[] arrstring5 = string6.split(",");
            this.h = new Vector();
            for (int i4 = 0; i4 < arrstring5.length; ++i4) {
                this.h.add((Object)arrstring5[i4]);
            }
            int n13 = b2.d(n12);
            int n14 = n12 + 4;
            this.i = new Vector();
            int n15 = n13 + n14;
            while (n14 < n15) {
                b b3 = new b();
                int n16 = b2.d(n14);
                int n17 = n14 + 4;
                int n18 = n17 + n16;
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("");
                stringBuilder5.append(b2.d(n17));
                b3.c = stringBuilder5.toString();
                int n19 = n17 + 4;
                byte by = b2.a(n19);
                b3.b = (String)this.h.get((int)by);
                int n20 = n19 + 1;
                short s2 = b2.b(n20);
                int n21 = n20 + 2;
                b3.a = b2.c(n21, s2);
                int n22 = n21 + s2;
                b3.g = b2.a(n22, n16 - (n22 - n17));
                b3.f = new ArrayList();
                n14 = n22;
                boolean bl = false;
                boolean bl2 = false;
                while (n14 < n18) {
                    short s3 = b2.b(n14);
                    int n23 = n14 + 2;
                    b3.f.add((Object)s3);
                    byte by2 = b2.a(n23);
                    n14 = n23 + 1;
                    if (by2 % 2 == 1) {
                        if (!bl && !bl2) {
                            short s4;
                            b3.e = s4 = b2.b(n14);
                            b3.d = a.a(s4);
                            bl2 = true;
                        }
                        n14 += 2;
                    }
                    if (bl) continue;
                    bl = true;
                }
                this.i.add((Object)b3);
            }
            gZIPInputStream.close();
        }
        return this.b;
    }

    /*
     * Exception decompiling
     */
    public Vector<b> b(short var1_1, short var2_2, int var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
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

    public Vector<c> c(Activity activity) {
        if (this.b == null) {
            this.b(activity);
        }
        return this.b;
    }

    public String d(Activity activity) {
        this.e = activity.getResources().getAssets().open("msrtc/msrtcdb");
        byte[] arrby = new byte[4];
        this.e.read(arrby, 0, 4);
        int n2 = com.mulo.util.b.c(arrby, 0);
        this.d = this.e;
        return String.valueOf((int)n2);
    }

}

