/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.RunnableFuture
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package d.a.a.a.a.c;

import android.annotation.TargetApi;
import d.a.a.a.a.c.b;
import d.a.a.a.a.c.c;
import d.a.a.a.a.c.h;
import d.a.a.a.a.c.i;
import d.a.a.a.a.c.j;
import d.a.a.a.a.c.l;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class k
extends ThreadPoolExecutor {
    private static final int a;
    private static final int b;
    private static final int c;

    static {
        int n2 = a = Runtime.getRuntime().availableProcessors();
        b = n2 + 1;
        c = 1 + n2 * 2;
    }

    <T extends Runnable & b & i> k(int n2, int n3, long l2, TimeUnit timeUnit, c<T> c2, ThreadFactory threadFactory) {
        super(n2, n3, l2, timeUnit, c2, threadFactory);
        this.prestartAllCoreThreads();
    }

    public static k a() {
        return k.a(b, c);
    }

    public static <T extends Runnable & b & i> k a(int n2, int n3) {
        k k2 = new k(n2, n3, 1L, TimeUnit.SECONDS, new c(), new a(10));
        return k2;
    }

    protected void afterExecute(Runnable runnable, Throwable throwable) {
        l l2 = (l)runnable;
        l2.setFinished(true);
        l2.setError(throwable);
        this.b().d();
        super.afterExecute(runnable, throwable);
    }

    public c b() {
        return (c)super.getQueue();
    }

    @TargetApi(value=9)
    public void execute(Runnable runnable) {
        if (j.isProperDelegate((Object)runnable)) {
            super.execute(runnable);
            return;
        }
        super.execute(this.newTaskFor(runnable, null));
    }

    public /* synthetic */ BlockingQueue getQueue() {
        return this.b();
    }

    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t2) {
        return new h<T>(runnable, t2);
    }

    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new h<T>(callable);
    }

    protected static final class a
    implements ThreadFactory {
        private final int a;

        public a(int n2) {
            this.a = n2;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.a);
            thread.setName("Queue");
            return thread;
        }
    }

}

