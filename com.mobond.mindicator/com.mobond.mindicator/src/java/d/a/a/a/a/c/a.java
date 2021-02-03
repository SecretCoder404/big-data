/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Process
 *  android.util.Log
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.LinkedList
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicInteger
 */
package d.a.a.a.a.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<Params, Progress, Result> {
    private static final int a;
    public static final Executor b;
    public static final Executor c;
    private static final int d;
    private static final int e;
    private static final ThreadFactory f;
    private static final BlockingQueue<Runnable> g;
    private static final b h;
    private static volatile Executor i;
    private final e<Params, Result> j = new e<Params, Result>(){

        public Result call() {
            a.this.n.set(true);
            Process.setThreadPriority((int)10);
            a a2 = a.this;
            return (Result)a2.d(a2.a((Params[])this.b));
        }
    };
    private final FutureTask<Result> k = new FutureTask<Result>(this.j){

        protected void done() {
            try {
                a.this.c(this.get());
                return;
            }
            catch (CancellationException cancellationException) {
                a.this.c(null);
                return;
            }
            catch (ExecutionException executionException) {
                throw new RuntimeException("An error occured while executing doInBackground()", executionException.getCause());
            }
            catch (InterruptedException interruptedException) {
                Log.w((String)"AsyncTask", (Throwable)interruptedException);
                return;
            }
        }
    };
    private volatile d l = d.a;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    static {
        int n2 = a = Runtime.getRuntime().availableProcessors();
        d = n2 + 1;
        e = 1 + n2 * 2;
        f = new ThreadFactory(){
            private final AtomicInteger a = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTask #");
                stringBuilder.append(this.a.getAndIncrement());
                return new Thread(runnable, stringBuilder.toString());
            }
        };
        g = new LinkedBlockingQueue(128);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, g, f);
        b = threadPoolExecutor;
        c = new c();
        h = new b();
        i = c;
    }

    private void c(Result Result) {
        if (!this.n.get()) {
            this.d(Result);
        }
    }

    private Result d(Result Result) {
        h.obtainMessage(1, new a<Object>(this, Result)).sendToTarget();
        return Result;
    }

    private void e(Result Result) {
        if (this.d()) {
            this.b(Result);
        } else {
            this.a(Result);
        }
        this.l = d.c;
    }

    public final /* varargs */ a<Params, Progress, Result> a(Executor executor, Params ... arrParams) {
        if (this.l != d.a) {
            switch (4.a[this.l.ordinal()]) {
                default: {
                    break;
                }
                case 2: {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                case 1: {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
            }
        }
        this.l = d.b;
        this.a();
        this.j.b = arrParams;
        executor.execute(this.k);
        return this;
    }

    protected /* varargs */ abstract Result a(Params ... var1);

    protected void a() {
    }

    protected void a(Result Result) {
    }

    public final boolean a(boolean bl) {
        this.m.set(true);
        return this.k.cancel(bl);
    }

    public final d b() {
        return this.l;
    }

    protected void b(Result Result) {
        this.c();
    }

    protected /* varargs */ void b(Progress ... arrProgress) {
    }

    protected void c() {
    }

    public final boolean d() {
        return this.m.get();
    }

    private static class a<Data> {
        final a a;
        final Data[] b;

        /* varargs */ a(a a2, Data ... arrData) {
            this.a = a2;
            this.b = arrData;
        }
    }

    private static class b
    extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            a a2 = (a)message.obj;
            switch (message.what) {
                default: {
                    return;
                }
                case 2: {
                    a2.a.b((Progress[])a2.b);
                    return;
                }
                case 1: 
            }
            a2.a.e(a2.b[0]);
        }
    }

    private static class c
    implements Executor {
        final LinkedList<Runnable> a = new LinkedList();
        Runnable b;

        private c() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void a() {
            c c2 = this;
            synchronized (c2) {
                Runnable runnable;
                this.b = runnable = (Runnable)this.a.poll();
                if (runnable != null) {
                    a.b.execute(this.b);
                }
                return;
            }
        }

        public void execute(final Runnable runnable) {
            c c2 = this;
            synchronized (c2) {
                this.a.offer((Object)new Runnable(){

                    public void run() {
                        try {
                            runnable.run();
                            return;
                        }
                        finally {
                            c.this.a();
                        }
                    }
                });
                if (this.b == null) {
                    this.a();
                }
                return;
            }
        }

    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d();
        public static final /* enum */ d b = new d();
        public static final /* enum */ d c = new d();
        private static final /* synthetic */ d[] d;

        static {
            d[] arrd = new d[]{a, b, c};
            d = arrd;
        }

        public static d valueOf(String string) {
            return (d)Enum.valueOf(d.class, (String)string);
        }

        public static d[] values() {
            return (d[])d.clone();
        }
    }

    private static abstract class e<Params, Result>
    implements Callable<Result> {
        Params[] b;

        private e() {
        }
    }

}

