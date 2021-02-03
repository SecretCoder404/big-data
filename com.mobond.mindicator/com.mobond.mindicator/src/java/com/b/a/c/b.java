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
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.StreamTokenizer
 *  java.io.StringReader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.b.a.c;

import com.b.a.b.e;
import com.b.a.b.f;
import com.b.a.b.i;
import com.b.a.b.l;
import com.b.a.b.n;
import com.b.a.b.o;
import com.b.a.b.p;
import com.b.a.b.q;
import com.b.a.b.r;
import com.b.a.b.s;
import com.b.a.b.t;
import com.b.a.c.a;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;

public class b {
    private i a;
    private t b;
    private StreamTokenizer c;

    public b() {
        this(new i());
    }

    public b(i i2) {
        this.a = i2;
        this.b = i2.a();
    }

    private com.b.a.b.a[] a() {
        if (this.f().equals((Object)"EMPTY")) {
            return new com.b.a.b.a[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.c());
        String string = this.g();
        while (string.equals((Object)",")) {
            arrayList.add((Object)this.c());
            string = this.g();
        }
        return (com.b.a.b.a[])arrayList.toArray((Object[])new com.b.a.b.a[arrayList.size()]);
    }

    private r[] a(com.b.a.b.a[] arra) {
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        while (n2 < arra.length) {
            arrayList.add((Object)this.a.a(arra[n2]));
            ++n2;
        }
        return (r[])arrayList.toArray((Object[])new r[0]);
    }

    private void b(String string) {
        if (this.c.ttype == -2) {
            com.b.a.g.a.a("Unexpected NUMBER token");
        }
        if (this.c.ttype == 10) {
            com.b.a.g.a.a("Unexpected EOL token");
        }
        String string2 = this.k();
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(string);
        stringBuilder.append(" but found ");
        stringBuilder.append(string2);
        this.c(stringBuilder.toString());
    }

    private com.b.a.b.a[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.c());
        String string = this.g();
        while (string.equals((Object)",")) {
            arrayList.add((Object)this.c());
            string = this.g();
        }
        return (com.b.a.b.a[])arrayList.toArray((Object[])new com.b.a.b.a[arrayList.size()]);
    }

    private com.b.a.b.a c() {
        com.b.a.b.a a2 = new com.b.a.b.a();
        a2.a = this.e();
        a2.b = this.e();
        if (this.d()) {
            a2.c = this.e();
        }
        this.b.a(a2);
        return a2;
    }

    private void c(String string) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)string));
        stringBuilder.append(" (line ");
        stringBuilder.append(this.c.lineno());
        stringBuilder.append(")");
        throw new a(stringBuilder.toString());
    }

    private boolean d() {
        int n2 = this.c.nextToken();
        this.c.pushBack();
        return n2 == -3;
    }

    /*
     * Exception decompiling
     */
    private double e() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl37 : ALOAD_0 : trying to set 1 previously set to 0
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

    private String f() {
        String string = this.i();
        if (!string.equals((Object)"EMPTY")) {
            if (string.equals((Object)"(")) {
                return string;
            }
            this.b("EMPTY or (");
            return null;
        }
        return string;
    }

    private String g() {
        String string = this.i();
        if (!string.equals((Object)",")) {
            if (string.equals((Object)")")) {
                return string;
            }
            this.b(", or )");
            return null;
        }
        return string;
    }

    private String h() {
        String string = this.i();
        if (string.equals((Object)")")) {
            return string;
        }
        this.b(")");
        return null;
    }

    private String i() {
        int n2 = this.c.nextToken();
        if (n2 != -3) {
            if (n2 != 44) {
                switch (n2) {
                    default: {
                        this.b("word");
                        return null;
                    }
                    case 41: {
                        return ")";
                    }
                    case 40: 
                }
                return "(";
            }
            return ",";
        }
        String string = this.c.sval;
        if (string.equalsIgnoreCase("EMPTY")) {
            return "EMPTY";
        }
        return string;
    }

    private String j() {
        String string = this.i();
        this.c.pushBack();
        return string;
    }

    private String k() {
        int n2 = this.c.ttype;
        if (n2 != 10) {
            switch (n2) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder("'");
                    stringBuilder.append((char)this.c.ttype);
                    stringBuilder.append("'");
                    return stringBuilder.toString();
                }
                case -1: {
                    return "End-of-Stream";
                }
                case -2: {
                    return "<NUMBER>";
                }
                case -3: 
            }
            StringBuilder stringBuilder = new StringBuilder("'");
            stringBuilder.append(this.c.sval);
            stringBuilder.append("'");
            return stringBuilder.toString();
        }
        return "End-of-Line";
    }

    private e l() {
        String string;
        try {
            string = this.i();
        }
        catch (a a2) {
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
        if (string.equalsIgnoreCase("POINT")) {
            return this.m();
        }
        if (string.equalsIgnoreCase("LINESTRING")) {
            return this.n();
        }
        if (string.equalsIgnoreCase("LINEARRING")) {
            return this.o();
        }
        if (string.equalsIgnoreCase("POLYGON")) {
            return this.q();
        }
        if (string.equalsIgnoreCase("MULTIPOINT")) {
            return this.p();
        }
        if (string.equalsIgnoreCase("MULTILINESTRING")) {
            return this.r();
        }
        if (string.equalsIgnoreCase("MULTIPOLYGON")) {
            return this.s();
        }
        if (string.equalsIgnoreCase("GEOMETRYCOLLECTION")) {
            return this.t();
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown geometry type: ");
        stringBuilder.append(string);
        this.c(stringBuilder.toString());
        return null;
    }

    private r m() {
        if (this.f().equals((Object)"EMPTY")) {
            return this.a.a((com.b.a.b.a)null);
        }
        r r2 = this.a.a(this.c());
        this.h();
        return r2;
    }

    private l n() {
        return this.a.b(this.a());
    }

    private n o() {
        return this.a.a(this.a());
    }

    private p p() {
        if (this.f().equals((Object)"EMPTY")) {
            return this.a.a(new r[0]);
        }
        if (this.j() != "(") {
            return this.a.a(this.a(this.b()));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.m());
        String string = this.g();
        do {
            if (!string.equals((Object)",")) {
                Object[] arrobject = new r[arrayList.size()];
                return this.a.a((r[])arrayList.toArray(arrobject));
            }
            arrayList.add((Object)this.m());
            string = this.g();
        } while (true);
    }

    private s q() {
        if (this.f().equals((Object)"EMPTY")) {
            i i2 = this.a;
            return i2.a(i2.a(new com.b.a.b.a[0]), new n[0]);
        }
        ArrayList arrayList = new ArrayList();
        n n2 = this.o();
        String string = this.g();
        do {
            if (!string.equals((Object)",")) {
                Object[] arrobject = new n[arrayList.size()];
                return this.a.a(n2, (n[])arrayList.toArray(arrobject));
            }
            arrayList.add((Object)this.o());
            string = this.g();
        } while (true);
    }

    private o r() {
        if (this.f().equals((Object)"EMPTY")) {
            return this.a.a(new l[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.n());
        String string = this.g();
        do {
            if (!string.equals((Object)",")) {
                Object[] arrobject = new l[arrayList.size()];
                return this.a.a((l[])arrayList.toArray(arrobject));
            }
            arrayList.add((Object)this.n());
            string = this.g();
        } while (true);
    }

    private q s() {
        if (this.f().equals((Object)"EMPTY")) {
            return this.a.a(new s[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.q());
        String string = this.g();
        do {
            if (!string.equals((Object)",")) {
                Object[] arrobject = new s[arrayList.size()];
                return this.a.a((s[])arrayList.toArray(arrobject));
            }
            arrayList.add((Object)this.q());
            string = this.g();
        } while (true);
    }

    private f t() {
        if (this.f().equals((Object)"EMPTY")) {
            return this.a.a(new e[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.l());
        String string = this.g();
        do {
            if (!string.equals((Object)",")) {
                Object[] arrobject = new e[arrayList.size()];
                return this.a.a((e[])arrayList.toArray(arrobject));
            }
            arrayList.add((Object)this.l());
            string = this.g();
        } while (true);
    }

    public e a(Reader reader) {
        this.c = new StreamTokenizer(reader);
        this.c.resetSyntax();
        this.c.wordChars(97, 122);
        this.c.wordChars(65, 90);
        this.c.wordChars(160, 255);
        this.c.wordChars(48, 57);
        this.c.wordChars(45, 45);
        this.c.wordChars(43, 43);
        this.c.wordChars(46, 46);
        this.c.whitespaceChars(0, 32);
        this.c.commentChar(35);
        try {
            e e2 = this.l();
            return e2;
        }
        catch (IOException iOException) {
            throw new a(iOException.toString());
        }
    }

    public e a(String string) {
        StringReader stringReader = new StringReader(string);
        try {
            e e2 = this.a((Reader)stringReader);
            return e2;
        }
        finally {
            stringReader.close();
        }
    }
}

