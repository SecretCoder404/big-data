/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.concurrent.Callable
 *  java.util.concurrent.FutureTask
 */
package d.a.a.a.a.c;

import d.a.a.a.a.c.b;
import d.a.a.a.a.c.e;
import d.a.a.a.a.c.i;
import d.a.a.a.a.c.j;
import d.a.a.a.a.c.l;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class h<V>
extends FutureTask<V>
implements b<l>,
i,
l {
    final Object b;

    public h(Runnable runnable, V v2) {
        super(runnable, v2);
        this.b = this.a((Object)runnable);
    }

    public h(Callable<V> callable) {
        super(callable);
        this.b = this.a(callable);
    }

    public <T extends b<l> & i> T a() {
        return (T)((b)this.b);
    }

    protected <T extends b<l> & i> T a(Object object) {
        if (j.isProperDelegate(object)) {
            return (T)((b)object);
        }
        return (T)new j();
    }

    public void a(l l2) {
        ((b)((Object)((i)this.a()))).addDependency(l2);
    }

    @Override
    public /* synthetic */ void addDependency(Object object) {
        this.a((l)object);
    }

    @Override
    public boolean areDependenciesMet() {
        return ((b)((Object)((i)this.a()))).areDependenciesMet();
    }

    public int compareTo(Object object) {
        return ((i)this.a()).compareTo(object);
    }

    @Override
    public Collection<l> getDependencies() {
        return ((b)((Object)((i)this.a()))).getDependencies();
    }

    @Override
    public e getPriority() {
        return ((i)this.a()).getPriority();
    }

    @Override
    public boolean isFinished() {
        return ((l)((Object)((i)this.a()))).isFinished();
    }

    @Override
    public void setError(Throwable throwable) {
        ((l)((Object)((i)this.a()))).setError(throwable);
    }

    @Override
    public void setFinished(boolean bl) {
        ((l)((Object)((i)this.a()))).setFinished(bl);
    }
}

