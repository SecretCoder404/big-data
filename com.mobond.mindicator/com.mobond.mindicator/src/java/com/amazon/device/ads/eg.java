/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.amazon.device.ads;

import android.util.SparseArray;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.eg;
import com.amazon.device.ads.ej;

abstract class eg
implements bk.b,
ee.a {
    private static final SparseArray<ej.g> a = new SparseArray();
    private int b = 1;
    private final ee c;
    private final bk d;

    static {
        eg.a(0, new ej.g(){

            public void a(Runnable runnable) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
            }
        });
        eg.a(1, new ej.g(){
            private final java.util.concurrent.ExecutorService a;
            {
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 3, 30L, java.util.concurrent.TimeUnit.SECONDS, (java.util.concurrent.BlockingQueue)new java.util.concurrent.LinkedBlockingQueue());
                this.a = threadPoolExecutor;
            }

            public void a(Runnable runnable) {
                this.a.submit(runnable);
            }
        });
    }

    public eg(ee ee2, bk bk2) {
        this.c = ee2;
        this.d = bk2;
    }

    static ej.g a(int n2) {
        SparseArray<ej.g> sparseArray = a;
        return (ej.g)sparseArray.get(n2, sparseArray.get(1));
    }

    static void a(int n2, ej.g g2) {
        if (g2 == null) {
            a.remove(n2);
            return;
        }
        a.put(n2, (Object)g2);
    }

    private void a(Runnable runnable) {
        eg.a(this.b).a(runnable);
    }

    protected abstract void a();

    protected abstract void b();

    @Override
    public void c() {
        this.a(new Runnable(this){
            final /* synthetic */ eg a;
            {
                this.a = eg2;
            }

            public void run() {
                this.a.a();
            }
        });
    }

    @Override
    public void d() {
        this.a(new Runnable(this){
            final /* synthetic */ eg a;
            {
                this.a = eg2;
            }

            public void run() {
                this.a.b();
            }
        });
    }

    @Override
    public void e() {
        this.d.a(this);
    }

    public void f() {
        this.c.a(this);
    }
}

