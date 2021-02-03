/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicReference
 */
package d.a.a.a.a.c;

import d.a.a.a.a.c.b;
import d.a.a.a.a.c.e;
import d.a.a.a.a.c.i;
import d.a.a.a.a.c.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class j
implements b<l>,
i,
l {
    private final List<l> dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference<Throwable> throwable = new AtomicReference(null);

    public static boolean isProperDelegate(Object object) {
        try {
            b b2 = (b)object;
            l l2 = (l)object;
            i i2 = (i)object;
            boolean bl = false;
            if (b2 != null) {
                bl = false;
                if (l2 != null) {
                    bl = false;
                    if (i2 != null) {
                        bl = true;
                    }
                }
            }
            return bl;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    @Override
    public void addDependency(l l2) {
        j j2 = this;
        synchronized (j2) {
            this.dependencies.add((Object)l2);
            return;
        }
    }

    @Override
    public boolean areDependenciesMet() {
        Iterator iterator = this.getDependencies().iterator();
        while (iterator.hasNext()) {
            if (((l)iterator.next()).isFinished()) continue;
            return false;
        }
        return true;
    }

    public int compareTo(Object object) {
        return e.a(this, object);
    }

    @Override
    public Collection<l> getDependencies() {
        j j2 = this;
        synchronized (j2) {
            Collection collection = Collections.unmodifiableCollection(this.dependencies);
            return collection;
        }
    }

    public Throwable getError() {
        return (Throwable)((Object)this.throwable.get());
    }

    @Override
    public e getPriority() {
        return e.b;
    }

    @Override
    public boolean isFinished() {
        return this.hasRun.get();
    }

    @Override
    public void setError(Throwable throwable) {
        this.throwable.set((Object)throwable);
    }

    @Override
    public void setFinished(boolean bl) {
        j j2 = this;
        synchronized (j2) {
            this.hasRun.set(bl);
            return;
        }
    }
}

