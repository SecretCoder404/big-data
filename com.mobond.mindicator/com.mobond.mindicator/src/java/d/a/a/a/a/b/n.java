/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicLong
 */
package d.a.a.a.a.b;

import d.a.a.a.a.b.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class n {
    public static ExecutorService a(String string) {
        ExecutorService executorService = Executors.newSingleThreadExecutor((ThreadFactory)n.c(string));
        n.a(string, executorService);
        return executorService;
    }

    private static final void a(String string, ExecutorService executorService) {
        n.a(string, executorService, 2L, TimeUnit.SECONDS);
    }

    public static final void a(final String string, final ExecutorService executorService, final long l2, final TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        h h2 = new h(){

            /*
             * Exception decompiling
             */
            @Override
            public void onRun() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl80 : RETURN : trying to set 1 previously set to 0
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
        };
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics Shutdown Hook for ");
        stringBuilder.append(string);
        runtime.addShutdownHook(new Thread((Runnable)h2, stringBuilder.toString()));
    }

    public static ScheduledExecutorService b(String string) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor((ThreadFactory)n.c(string));
        n.a(string, (ExecutorService)scheduledExecutorService);
        return scheduledExecutorService;
    }

    public static final ThreadFactory c(final String string) {
        return new ThreadFactory(new AtomicLong(1L)){
            final /* synthetic */ AtomicLong b;
            {
                this.b = atomicLong;
            }

            public Thread newThread(final Runnable runnable) {
                Thread thread = Executors.defaultThreadFactory().newThread((Runnable)new h(){

                    @Override
                    public void onRun() {
                        runnable.run();
                    }
                });
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(this.b.getAndIncrement());
                thread.setName(stringBuilder.toString());
                return thread;
            }

        };
    }

}

