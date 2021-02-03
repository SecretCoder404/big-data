/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.net.TrafficStats
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 */
package com.a.a;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.SystemClock;
import com.a.a.b;
import com.a.a.h;
import com.a.a.k;
import com.a.a.n;
import com.a.a.p;
import com.a.a.q;
import com.a.a.u;
import com.a.a.v;
import java.util.concurrent.BlockingQueue;

public class i
extends Thread {
    private final BlockingQueue<n<?>> a;
    private final h b;
    private final b c;
    private final q d;
    private volatile boolean e = false;

    public i(BlockingQueue<n<?>> blockingQueue, h h2, b b2, q q2) {
        this.a = blockingQueue;
        this.b = h2;
        this.c = b2;
        this.d = q2;
    }

    private void a(n<?> n2, u u2) {
        u u3 = n2.parseNetworkError(u2);
        this.d.a(n2, u3);
    }

    private void b() {
        this.a((n)this.a.take());
    }

    @TargetApi(value=14)
    private void b(n<?> n2) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag((int)n2.getTrafficStatsTag());
        }
    }

    public void a() {
        this.e = true;
        this.interrupt();
    }

    void a(n<?> n2) {
        long l2 = SystemClock.elapsedRealtime();
        try {
            n2.addMarker("network-queue-take");
            if (n2.isCanceled()) {
                n2.finish("network-discard-cancelled");
                n2.notifyListenerResponseNotUsable();
                return;
            }
            this.b(n2);
            k k2 = this.b.a(n2);
            n2.addMarker("network-http-complete");
            if (k2.e && n2.hasHadResponseDelivered()) {
                n2.finish("not-modified");
                n2.notifyListenerResponseNotUsable();
                return;
            }
            p<?> p2 = n2.parseNetworkResponse(k2);
            n2.addMarker("network-parse-complete");
            if (n2.shouldCache() && p2.b != null) {
                this.c.a(n2.getCacheKey(), p2.b);
                n2.addMarker("network-cache-written");
            }
            n2.markDelivered();
            this.d.a(n2, p2);
            n2.notifyListenerResponseReceived(p2);
            return;
        }
        catch (Exception exception) {
            Object[] arrobject = new Object[]{exception.toString()};
            v.a(exception, "Unhandled exception %s", arrobject);
            u u2 = new u(exception);
            u2.a(SystemClock.elapsedRealtime() - l2);
            this.d.a(n2, u2);
            n2.notifyListenerResponseNotUsable();
            return;
        }
        catch (u u3) {
            u3.a(SystemClock.elapsedRealtime() - l2);
            this.a(n2, u3);
            n2.notifyListenerResponseNotUsable();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public void run() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl3 : FAKE_TRY : trying to set 1 previously set to 0
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

