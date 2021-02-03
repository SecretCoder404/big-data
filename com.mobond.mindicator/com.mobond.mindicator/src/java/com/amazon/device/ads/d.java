/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.ar
 *  com.amazon.device.ads.bs
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.du
 *  com.amazon.device.ads.dv
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ar;
import com.amazon.device.ads.b;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.bs;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.du;
import com.amazon.device.ads.dv;
import org.json.JSONObject;

abstract class d {
    static final ar b = new ar();
    static final dv c = new dv();
    static final du d = new du();
    static final bs e = new bs();
    private static final String f = "d";
    protected final bn a;
    private final String g;
    private final String h;
    private final cy i;

    d(bn bn2, String string, String string2, cz cz2) {
        this.a = bn2;
        this.g = string;
        this.h = string2;
        this.i = cz2.a(f);
    }

    protected abstract String a(b.m var1);

    boolean a(b.m m2, JSONObject jSONObject) {
        String string = this.a.a(this.h, this.a(m2));
        return this.a(jSONObject, this.g, string);
    }

    /*
     * Exception decompiling
     */
    protected boolean a(JSONObject var1, String var2, String var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl25 : ICONST_0 : trying to set 0 previously set to 1
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

