/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package com.a.a;

import android.os.Handler;
import com.a.a.f;
import com.a.a.n;
import com.a.a.p;
import com.a.a.q;
import com.a.a.u;
import java.util.concurrent.Executor;

public class f
implements q {
    private final Executor a;

    public f(Handler handler) {
        this.a = new Executor(this, handler){
            final /* synthetic */ Handler a;
            final /* synthetic */ f b;
            {
                this.b = f2;
                this.a = handler;
            }

            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        };
    }

    @Override
    public void a(n<?> n2, p<?> p2) {
        this.a(n2, p2, null);
    }

    @Override
    public void a(n<?> n2, p<?> p2, Runnable runnable) {
        n2.markDelivered();
        n2.addMarker("post-response");
        this.a.execute(new Runnable(n2, p2, runnable){
            private final n a;
            private final p b;
            private final Runnable c;
            {
                this.a = n2;
                this.b = p2;
                this.c = runnable;
            }

            public void run() {
                if (this.a.isCanceled()) {
                    this.a.finish("canceled-at-delivery");
                    return;
                }
                if (this.b.a()) {
                    this.a.deliverResponse(this.b.a);
                } else {
                    this.a.deliverError(this.b.c);
                }
                if (this.b.d) {
                    this.a.addMarker("intermediate-response");
                } else {
                    this.a.finish("done");
                }
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    @Override
    public void a(n<?> n2, u u2) {
        n2.addMarker("post-error");
        p p2 = p.a(u2);
        this.a.execute(new /* invalid duplicate definition of identical inner class */);
    }

}

