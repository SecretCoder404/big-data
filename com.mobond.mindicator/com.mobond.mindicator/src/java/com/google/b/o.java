/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.p
 *  java.lang.Object
 */
package com.google.b;

import com.google.b.e;
import com.google.b.i;
import com.google.b.p;

public class o {
    private static final i b = i.b();
    protected volatile p a;
    private e c;
    private i d;
    private volatile e e;

    public p a(p p2) {
        this.c(p2);
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e b() {
        if (this.e != null) {
            return this.e;
        }
        e e2 = this.c;
        if (e2 != null) {
            return e2;
        }
        o o2 = this;
        synchronized (o2) {
            if (this.e != null) {
                return this.e;
            }
            this.e = this.a == null ? e.a : this.a.i();
            return this.e;
        }
    }

    public p b(p p2) {
        p p3 = this.a;
        this.c = null;
        this.e = null;
        this.a = p2;
        return p3;
    }

    /*
     * Exception decompiling
     */
    protected void c(p var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl46 : ALOAD_3 : trying to set 1 previously set to 0
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof o)) {
            return false;
        }
        o o2 = (o)object;
        p p2 = this.a;
        p p3 = o2.a;
        if (p2 == null && p3 == null) {
            return this.b().equals(o2.b());
        }
        if (p2 != null && p3 != null) {
            return p2.equals((Object)p3);
        }
        if (p2 != null) {
            return p2.equals((Object)o2.a(p2.s()));
        }
        return this.a(p3.s()).equals((Object)p3);
    }

    public int hashCode() {
        return 1;
    }
}

