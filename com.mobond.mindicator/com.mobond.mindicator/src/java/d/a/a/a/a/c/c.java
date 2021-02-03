/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.Queue
 *  java.util.concurrent.PriorityBlockingQueue
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.locks.ReentrantLock
 */
package d.a.a.a.a.c;

import d.a.a.a.a.c.b;
import d.a.a.a.a.c.l;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class c<E extends b & l>
extends PriorityBlockingQueue<E> {
    final Queue<E> a = new LinkedList();
    private final ReentrantLock b = new ReentrantLock();

    public E a() {
        return this.b(0, null, null);
    }

    E a(int n2, Long l2, TimeUnit timeUnit) {
        switch (n2) {
            default: {
                return null;
            }
            case 3: {
                return (E)((b)super.poll(l2.longValue(), timeUnit));
            }
            case 2: {
                return (E)((b)super.poll());
            }
            case 1: {
                return (E)((b)super.peek());
            }
            case 0: 
        }
        return (E)((b)super.take());
    }

    public E a(long l2, TimeUnit timeUnit) {
        return this.b(3, l2, timeUnit);
    }

    boolean a(int n2, E e2) {
        try {
            this.b.lock();
            if (n2 == 1) {
                super.remove(e2);
            }
            boolean bl = this.a.offer(e2);
            return bl;
        }
        finally {
            this.b.unlock();
        }
    }

    boolean a(E e2) {
        return e2.areDependenciesMet();
    }

    <T> T[] a(T[] arrT, T[] arrT2) {
        int n2 = arrT.length;
        int n3 = arrT2.length;
        Object[] arrobject = (Object[])Array.newInstance((Class)arrT.getClass().getComponentType(), (int)(n2 + n3));
        System.arraycopy(arrT, (int)0, (Object)arrobject, (int)0, (int)n2);
        System.arraycopy(arrT2, (int)0, (Object)arrobject, (int)n2, (int)n3);
        return arrobject;
    }

    public E b() {
        E e2;
        try {
            e2 = this.b(1, null, null);
        }
        catch (InterruptedException interruptedException) {
            return null;
        }
        return e2;
    }

    E b(int n2, Long l2, TimeUnit timeUnit) {
        E e2;
        while ((e2 = this.a(n2, l2, timeUnit)) != null) {
            if (this.a(e2)) {
                return e2;
            }
            this.a(n2, e2);
        }
        return e2;
    }

    public E c() {
        E e2;
        try {
            e2 = this.b(2, null, null);
        }
        catch (InterruptedException interruptedException) {
            return null;
        }
        return e2;
    }

    public void clear() {
        try {
            this.b.lock();
            this.a.clear();
            super.clear();
            return;
        }
        finally {
            this.b.unlock();
        }
    }

    public boolean contains(Object object) {
        boolean bl;
        block3 : {
            try {
                boolean bl2;
                this.b.lock();
                if (!super.contains(object) && !(bl2 = this.a.contains(object))) {
                    bl = false;
                    break block3;
                }
                bl = true;
            }
            catch (Throwable throwable) {
                this.b.unlock();
                throw throwable;
            }
        }
        this.b.unlock();
        return bl;
    }

    public void d() {
        try {
            this.b.lock();
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                b b2 = (b)iterator.next();
                if (!this.a(b2)) continue;
                super.offer((Object)b2);
                iterator.remove();
            }
            return;
        }
        finally {
            this.b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.b.lock();
            int n2 = super.drainTo(collection) + this.a.size();
            while (!this.a.isEmpty()) {
                collection.add(this.a.poll());
            }
            return n2;
        }
        finally {
            this.b.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int drainTo(Collection<? super E> collection, int n2) {
        int n3;
        try {
            this.b.lock();
        }
        catch (Throwable throwable) {
            this.b.unlock();
            throw throwable;
        }
        for (n3 = super.drainTo(collection, (int)n2); !this.a.isEmpty() && n3 <= n2; ++n3) {
            collection.add(this.a.poll());
        }
        this.b.unlock();
        return n3;
    }

    public /* synthetic */ Object peek() {
        return this.b();
    }

    public /* synthetic */ Object poll() {
        return this.c();
    }

    public /* synthetic */ Object poll(long l2, TimeUnit timeUnit) {
        return this.a(l2, timeUnit);
    }

    public boolean remove(Object object) {
        boolean bl;
        block3 : {
            try {
                boolean bl2;
                this.b.lock();
                if (!super.remove(object) && !(bl2 = this.a.remove(object))) {
                    bl = false;
                    break block3;
                }
                bl = true;
            }
            catch (Throwable throwable) {
                this.b.unlock();
                throw throwable;
            }
        }
        this.b.unlock();
        return bl;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean bl;
        boolean bl2;
        try {
            this.b.lock();
            bl2 = super.removeAll(collection);
            bl = this.a.removeAll(collection);
        }
        catch (Throwable throwable) {
            this.b.unlock();
            throw throwable;
        }
        boolean bl3 = bl | bl2;
        this.b.unlock();
        return bl3;
    }

    public int size() {
        int n2;
        int n3;
        try {
            this.b.lock();
            n3 = this.a.size();
            n2 = super.size();
        }
        catch (Throwable throwable) {
            this.b.unlock();
            throw throwable;
        }
        int n4 = n3 + n2;
        this.b.unlock();
        return n4;
    }

    public /* synthetic */ Object take() {
        return this.a();
    }

    public Object[] toArray() {
        try {
            this.b.lock();
            Object[] arrobject = this.a(super.toArray(), this.a.toArray());
            return arrobject;
        }
        finally {
            this.b.unlock();
        }
    }

    public <T> T[] toArray(T[] arrT) {
        try {
            this.b.lock();
            Object[] arrobject = this.a(super.toArray((Object[])arrT), this.a.toArray((Object[])arrT));
            return arrobject;
        }
        finally {
            this.b.unlock();
        }
    }
}

