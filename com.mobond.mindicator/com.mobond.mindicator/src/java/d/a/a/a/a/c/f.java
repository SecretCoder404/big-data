/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.a.a.a.c.f$a$1
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 */
package d.a.a.a.a.c;

import d.a.a.a.a.c.a;
import d.a.a.a.a.c.b;
import d.a.a.a.a.c.e;
import d.a.a.a.a.c.f;
import d.a.a.a.a.c.i;
import d.a.a.a.a.c.j;
import d.a.a.a.a.c.l;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public abstract class f<Params, Progress, Result>
extends d.a.a.a.a.c.a<Params, Progress, Result>
implements b<l>,
i,
l {
    private final j a = new j();

    @Override
    public void a(l l2) {
        if (this.b() == a.d.a) {
            ((b)((Object)((i)this.e()))).addDependency(l2);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public final /* varargs */ void a(ExecutorService executorService, Params ... arrParams) {
        super.a(new a((Executor)executorService, this), arrParams);
    }

    @Override
    public /* synthetic */ void addDependency(Object object) {
        this.a((l)object);
    }

    @Override
    public boolean areDependenciesMet() {
        return ((b)((Object)((i)this.e()))).areDependenciesMet();
    }

    public int compareTo(Object object) {
        return e.a(this, object);
    }

    public <T extends b<l> & i> T e() {
        return (T)this.a;
    }

    @Override
    public Collection<l> getDependencies() {
        return ((b)((Object)((i)this.e()))).getDependencies();
    }

    @Override
    public e getPriority() {
        return ((i)this.e()).getPriority();
    }

    @Override
    public boolean isFinished() {
        return ((l)((Object)((i)this.e()))).isFinished();
    }

    @Override
    public void setError(Throwable throwable) {
        ((l)((Object)((i)this.e()))).setError(throwable);
    }

    @Override
    public void setFinished(boolean bl) {
        ((l)((Object)((i)this.e()))).setFinished(bl);
    }

    private static class a<Result>
    implements Executor {
        private final Executor a;
        private final f b;

        public a(Executor executor, f f2) {
            this.a = executor;
            this.b = f2;
        }

        static /* synthetic */ f a(a a2) {
            return a2.b;
        }

        public void execute(Runnable runnable) {
            this.a.execute((Runnable)new 1(this, runnable, null));
        }
    }

}

