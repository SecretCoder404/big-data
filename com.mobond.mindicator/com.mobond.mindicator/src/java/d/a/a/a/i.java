/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.a.a.a.h
 *  java.io.File
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.lang.annotation.Annotation
 *  java.util.Collection
 *  java.util.concurrent.ExecutorService
 */
package d.a.a.a;

import android.content.Context;
import d.a.a.a.a.b.r;
import d.a.a.a.a.c.l;
import d.a.a.a.c;
import d.a.a.a.d;
import d.a.a.a.f;
import d.a.a.a.h;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.concurrent.ExecutorService;

public abstract class i<Result>
implements Comparable<i> {
    Context context;
    final d.a.a.a.a.c.d dependsOnAnnotation = (d.a.a.a.a.c.d)this.getClass().getAnnotation(d.a.a.a.a.c.d.class);
    c fabric;
    r idManager;
    f<Result> initializationCallback;
    h<Result> initializationTask = new h(this);

    public int compareTo(i i2) {
        if (this.containsAnnotatedDependency(i2)) {
            return 1;
        }
        if (i2.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (this.hasAnnotatedDependency() && !i2.hasAnnotatedDependency()) {
            return 1;
        }
        if (!this.hasAnnotatedDependency() && i2.hasAnnotatedDependency()) {
            return -1;
        }
        return 0;
    }

    boolean containsAnnotatedDependency(i i2) {
        if (this.hasAnnotatedDependency()) {
            Class<?>[] arrclass = this.dependsOnAnnotation.a();
            int n2 = arrclass.length;
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!arrclass[i3].isAssignableFrom(i2.getClass())) continue;
                return true;
            }
        }
        return false;
    }

    protected abstract Result doInBackground();

    public Context getContext() {
        return this.context;
    }

    protected Collection<l> getDependencies() {
        return this.initializationTask.getDependencies();
    }

    public c getFabric() {
        return this.fabric;
    }

    protected r getIdManager() {
        return this.idManager;
    }

    public abstract String getIdentifier();

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".Fabric");
        stringBuilder.append(File.separator);
        stringBuilder.append(this.getIdentifier());
        return stringBuilder.toString();
    }

    public abstract String getVersion();

    boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    final void initialize() {
        h<Result> h2 = this.initializationTask;
        ExecutorService executorService = this.fabric.e();
        Object[] arrobject = new Void[]{null};
        h2.a(executorService, arrobject);
    }

    void injectParameters(Context context, c c2, f<Result> f2, r r2) {
        this.fabric = c2;
        this.context = new d(context, this.getIdentifier(), this.getPath());
        this.initializationCallback = f2;
        this.idManager = r2;
    }

    protected void onCancelled(Result Result) {
    }

    protected void onPostExecute(Result Result) {
    }

    protected boolean onPreExecute() {
        return true;
    }
}

