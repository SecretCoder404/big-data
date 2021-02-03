/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package b.a;

import b.a.b;
import b.a.e;

public final class c<T>
implements b<T> {
    private static final c<Object> a = new c<Object>(null);
    private final T b;

    private c(T t2) {
        this.b = t2;
    }

    public static <T> b<T> a(T t2) {
        return new c<T>(e.a(t2, "instance cannot be null"));
    }

    public T d() {
        return this.b;
    }
}

