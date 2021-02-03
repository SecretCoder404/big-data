/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 */
package d.a.a.a.a.c;

import java.util.Collection;

public interface b<T> {
    public void addDependency(T var1);

    public boolean areDependenciesMet();

    public Collection<T> getDependencies();
}

