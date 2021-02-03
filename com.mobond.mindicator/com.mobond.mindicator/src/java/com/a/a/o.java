/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.a.a.f
 *  com.a.a.o$1
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.PriorityBlockingQueue
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.a.a;

import android.os.Handler;
import android.os.Looper;
import com.a.a.c;
import com.a.a.f;
import com.a.a.h;
import com.a.a.i;
import com.a.a.n;
import com.a.a.o;
import com.a.a.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class o {
    private final AtomicInteger a = new AtomicInteger();
    private final Set<n<?>> b = new HashSet();
    private final PriorityBlockingQueue<n<?>> c = new PriorityBlockingQueue();
    private final PriorityBlockingQueue<n<?>> d = new PriorityBlockingQueue();
    private final com.a.a.b e;
    private final h f;
    private final q g;
    private final i[] h;
    private c i;
    private final List<b> j = new ArrayList();

    public o(com.a.a.b b2, h h2) {
        this(b2, h2, 4);
    }

    public o(com.a.a.b b2, h h2, int n2) {
        this(b2, h2, n2, (q)new f(new Handler(Looper.getMainLooper())));
    }

    public o(com.a.a.b b2, h h2, int n2, q q2) {
        this.e = b2;
        this.f = h2;
        this.h = new i[n2];
        this.g = q2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> n<T> a(n<T> n2) {
        Set<n<?>> set;
        n2.setRequestQueue(this);
        Set<n<?>> set2 = set = this.b;
        synchronized (set2) {
            this.b.add(n2);
        }
        n2.setSequence(this.c());
        n2.addMarker("add-to-queue");
        if (!n2.shouldCache()) {
            this.d.add(n2);
            return n2;
        }
        this.c.add(n2);
        return n2;
    }

    public void a() {
        this.b();
        this.i = new c((BlockingQueue<n<?>>)this.c, (BlockingQueue<n<?>>)this.d, this.e, this.g);
        this.i.start();
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            i i3;
            this.h[i2] = i3 = new i((BlockingQueue<n<?>>)this.d, this.f, this.e, this.g);
            i3.start();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a a2) {
        Set<n<?>> set;
        Set<n<?>> set2 = set = this.b;
        synchronized (set2) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                n n2 = (n)iterator.next();
                if (!a2.a(n2)) continue;
                n2.cancel();
            }
            return;
        }
    }

    public void a(Object object) {
        if (object != null) {
            this.a((a)new 1(this, object));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public void b() {
        c c2 = this.i;
        if (c2 != null) {
            c2.a();
        }
        for (i i2 : this.h) {
            if (i2 == null) continue;
            i2.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    <T> void b(n<T> n2) {
        List<b> list;
        Set<n<?>> set;
        Set<n<?>> set2 = set = this.b;
        synchronized (set2) {
            this.b.remove(n2);
        }
        List<b> list2 = list = this.j;
        synchronized (list2) {
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                ((b)iterator.next()).a(n2);
            }
            return;
        }
    }

    public int c() {
        return this.a.incrementAndGet();
    }

    public static interface a {
        public boolean a(n<?> var1);
    }

    public static interface b<T> {
        public void a(n<T> var1);
    }

}

