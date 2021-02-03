/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.b.a.b.f
 *  com.b.a.b.l
 *  com.b.a.b.n
 *  com.b.a.b.o
 *  com.b.a.b.p
 *  com.b.a.b.q
 *  com.b.a.b.r
 *  com.b.a.b.s
 *  java.io.Writer
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.text.DecimalFormat
 *  java.text.DecimalFormatSymbols
 */
package com.b.a.c;

import com.b.a.b.e;
import com.b.a.b.f;
import com.b.a.b.l;
import com.b.a.b.n;
import com.b.a.b.o;
import com.b.a.b.p;
import com.b.a.b.q;
import com.b.a.b.r;
import com.b.a.b.s;
import com.b.a.b.t;
import com.b.a.g.a;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class c {
    private int a = 2;
    private DecimalFormat b;
    private boolean c = false;
    private boolean d = false;
    private int e = 0;
    private int f = -1;
    private String g = "  ";

    public static String a(char c2, int n2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = 0;
        while (n3 < n2) {
            stringBuffer.append(c2);
            ++n3;
        }
        return stringBuffer.toString();
    }

    private String a(double d2) {
        return this.b.format(d2);
    }

    public static String a(com.b.a.b.a a2, com.b.a.b.a a3) {
        StringBuilder stringBuilder = new StringBuilder("LINESTRING ( ");
        stringBuilder.append(a2.a);
        stringBuilder.append(" ");
        stringBuilder.append(a2.b);
        stringBuilder.append(", ");
        stringBuilder.append(a3.a);
        stringBuilder.append(" ");
        stringBuilder.append(a3.b);
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }

    private static DecimalFormat a(t t2) {
        int n2 = t2.a();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        StringBuilder stringBuilder = new StringBuilder("0");
        String string = n2 > 0 ? "." : "";
        stringBuilder.append(string);
        stringBuilder.append(c.a('#', n2));
        return new DecimalFormat(stringBuilder.toString(), decimalFormatSymbols);
    }

    private void a(int n2, int n3, Writer writer) {
        int n4 = this.f;
        if (n4 > 0) {
            if (n2 % n4 != 0) {
                return;
            }
            this.a(n3, writer);
            return;
        }
    }

    private void a(int n2, Writer writer) {
        if (this.d) {
            if (n2 <= 0) {
                return;
            }
            writer.write("\n");
            int n3 = 0;
            do {
                if (n3 >= n2) {
                    return;
                }
                writer.write(this.g);
                ++n3;
            } while (true);
        }
    }

    private void a(com.b.a.b.a a2, int n2, Writer writer, t t2) {
        writer.write("POINT ");
        this.b(a2, n2, writer, t2);
    }

    private void a(com.b.a.b.a a2, Writer writer) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)this.a(a2.a)));
        stringBuilder.append(" ");
        stringBuilder.append(this.a(a2.b));
        writer.write(stringBuilder.toString());
        if (this.a >= 3 && !Double.isNaN((double)a2.c)) {
            writer.write(" ");
            writer.write(this.a(a2.c));
        }
    }

    private void a(e e2, int n2, Writer writer) {
        this.a(n2, writer);
        if (e2 instanceof r) {
            r r2 = (r)e2;
            this.a(r2.d(), n2, writer, r2.c());
            return;
        }
        if (e2 instanceof n) {
            this.a((n)e2, n2, writer);
            return;
        }
        if (e2 instanceof l) {
            this.a((l)e2, n2, writer);
            return;
        }
        if (e2 instanceof s) {
            this.a((s)e2, n2, writer);
            return;
        }
        if (e2 instanceof p) {
            this.a((p)e2, n2, writer);
            return;
        }
        if (e2 instanceof o) {
            this.a((o)e2, n2, writer);
            return;
        }
        if (e2 instanceof q) {
            this.a((q)e2, n2, writer);
            return;
        }
        if (e2 instanceof f) {
            this.a((f)e2, n2, writer);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Unsupported Geometry implementation:");
        stringBuilder.append((Object)e2.getClass());
        a.a(stringBuilder.toString());
    }

    private void a(e e2, boolean bl2, Writer writer) {
        this.d = bl2;
        this.b = c.a(e2.c());
        this.a(e2, 0, writer);
    }

    private void a(f f2, int n2, Writer writer) {
        writer.write("GEOMETRYCOLLECTION ");
        this.b(f2, n2, writer);
    }

    private void a(l l2, int n2, Writer writer) {
        writer.write("LINESTRING ");
        this.a(l2, n2, false, writer);
    }

    private void a(l l2, int n2, boolean bl2, Writer writer) {
        if (l2.g()) {
            writer.write("EMPTY");
            return;
        }
        if (bl2) {
            this.a(n2, writer);
        }
        writer.write("(");
        int n3 = 0;
        do {
            if (n3 >= l2.f()) {
                writer.write(")");
                return;
            }
            if (n3 > 0) {
                writer.write(", ");
                int n4 = this.f;
                if (n4 > 0 && n3 % n4 == 0) {
                    this.a(n2 + 1, writer);
                }
            }
            this.a(l2.b(n3), writer);
            ++n3;
        } while (true);
    }

    private void a(n n2, int n3, Writer writer) {
        writer.write("LINEARRING ");
        this.a((l)n2, n3, false, writer);
    }

    private void a(o o2, int n2, Writer writer) {
        writer.write("MULTILINESTRING ");
        this.a(o2, n2, false, writer);
    }

    private void a(o o2, int n2, boolean bl2, Writer writer) {
        if (o2.g()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int n3 = 0;
        boolean bl3 = bl2;
        int n4 = n2;
        do {
            if (n3 >= o2.b()) {
                writer.write(")");
                return;
            }
            if (n3 > 0) {
                writer.write(", ");
                n4 = n2 + 1;
                bl3 = true;
            }
            this.a((l)o2.a(n3), n4, bl3, writer);
            ++n3;
        } while (true);
    }

    private void a(p p2, int n2, Writer writer) {
        writer.write("MULTIPOINT ");
        this.b(p2, n2, writer);
    }

    private void a(q q2, int n2, Writer writer) {
        writer.write("MULTIPOLYGON ");
        this.b(q2, n2, writer);
    }

    private void a(s s2, int n2, Writer writer) {
        writer.write("POLYGON ");
        this.a(s2, n2, false, writer);
    }

    private void a(s s2, int n2, boolean bl2, Writer writer) {
        if (s2.g()) {
            writer.write("EMPTY");
            return;
        }
        if (bl2) {
            this.a(n2, writer);
        }
        writer.write("(");
        l l2 = s2.m();
        int n3 = 0;
        this.a(l2, n2, false, writer);
        do {
            if (n3 >= s2.n()) {
                writer.write(")");
                return;
            }
            writer.write(", ");
            this.a(s2.b(n3), n2 + 1, true, writer);
            ++n3;
        } while (true);
    }

    private void b(com.b.a.b.a a2, int n2, Writer writer, t t2) {
        if (a2 == null) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        this.a(a2, writer);
        writer.write(")");
    }

    private void b(f f2, int n2, Writer writer) {
        if (f2.g()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int n3 = 0;
        int n4 = n2;
        do {
            if (n3 >= f2.b()) {
                writer.write(")");
                return;
            }
            if (n3 > 0) {
                writer.write(", ");
                n4 = n2 + 1;
            }
            this.a(f2.a(n3), n4, writer);
            ++n3;
        } while (true);
    }

    private void b(p p2, int n2, Writer writer) {
        if (p2.g()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int n3 = 0;
        do {
            if (n3 >= p2.b()) {
                writer.write(")");
                return;
            }
            if (n3 > 0) {
                writer.write(", ");
                this.a(n3, n2 + 1, writer);
            }
            writer.write("(");
            this.a(((r)p2.a(n3)).d(), writer);
            writer.write(")");
            ++n3;
        } while (true);
    }

    private void b(q q2, int n2, Writer writer) {
        if (q2.g()) {
            writer.write("EMPTY");
            return;
        }
        writer.write("(");
        int n3 = 0;
        int n4 = n2;
        boolean bl2 = false;
        do {
            if (n3 >= q2.b()) {
                writer.write(")");
                return;
            }
            if (n3 > 0) {
                writer.write(", ");
                n4 = n2 + 1;
                bl2 = true;
            }
            this.a((s)q2.a(n3), n4, bl2, writer);
            ++n3;
        } while (true);
    }

    /*
     * Exception decompiling
     */
    public String a(e var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl13 : ALOAD_2 : trying to set 1 previously set to 0
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
}

