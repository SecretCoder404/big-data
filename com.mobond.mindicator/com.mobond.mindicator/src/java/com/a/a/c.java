/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.a.a.c$a
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.Map
 *  java.util.concurrent.BlockingQueue
 */
package com.a.a;

import com.a.a.b;
import com.a.a.c;
import com.a.a.k;
import com.a.a.n;
import com.a.a.p;
import com.a.a.q;
import com.a.a.v;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class c
extends Thread {
    private static final boolean a;
    private final BlockingQueue<n<?>> b;
    private final BlockingQueue<n<?>> c;
    private final b d;
    private final q e;
    private volatile boolean f;
    private final a g;

    static {
        a = v.b;
    }

    public c(BlockingQueue<n<?>> blockingQueue, BlockingQueue<n<?>> blockingQueue2, b b2, q q2) {
        this.f = false;
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = b2;
        this.e = q2;
        this.g = new /* Unavailable Anonymous Inner Class!! */;
    }

    static /* synthetic */ q b(c c2) {
        return c2.e;
    }

    private void b() {
        this.a((n)this.b.take());
    }

    public void a() {
        this.f = true;
        this.interrupt();
    }

    void a(final n<?> n2) {
        n2.addMarker("cache-queue-take");
        if (n2.isCanceled()) {
            n2.finish("cache-discard-canceled");
            return;
        }
        b.a a2 = this.d.a(n2.getCacheKey());
        if (a2 == null) {
            n2.addMarker("cache-miss");
            if (!a.a(this.g, n2)) {
                this.c.put(n2);
            }
            return;
        }
        if (a2.a()) {
            n2.addMarker("cache-hit-expired");
            n2.setCacheEntry(a2);
            if (!a.a(this.g, n2)) {
                this.c.put(n2);
            }
            return;
        }
        n2.addMarker("cache-hit");
        p<?> p2 = n2.parseNetworkResponse(new k(a2.a, a2.g));
        n2.addMarker("cache-hit-parsed");
        if (!a2.b()) {
            this.e.a(n2, p2);
            return;
        }
        n2.addMarker("cache-hit-refresh-needed");
        n2.setCacheEntry(a2);
        p2.d = true;
        if (!a.a(this.g, n2)) {
            this.e.a(n2, p2, new Runnable(){

                public void run() {
                    try {
                        c.this.c.put((Object)n2);
                        return;
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            });
            return;
        }
        this.e.a(n2, p2);
    }

    /*
     * Exception decompiling
     */
    public void run() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl12 : FAKE_TRY : trying to set 1 previously set to 0
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

