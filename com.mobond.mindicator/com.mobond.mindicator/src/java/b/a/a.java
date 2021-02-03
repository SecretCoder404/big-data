/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  javax.a.a
 */
package b.a;

import b.a.d;
import b.a.e;

public final class a<T>
implements javax.a.a<T> {
    static final /* synthetic */ boolean a;
    private static final Object b;
    private volatile javax.a.a<T> c;
    private volatile Object d = b;

    static {
        a = true ^ a.class.desiredAssertionStatus();
        b = new Object();
    }

    private a(javax.a.a<T> a2) {
        if (!a && a2 == null) {
            throw new AssertionError();
        }
        this.c = a2;
    }

    public static Object a(Object object, Object object2) {
        boolean bl = object != b && !(object instanceof d);
        if (bl) {
            if (object == object2) {
                return object2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
            stringBuilder.append(object);
            stringBuilder.append(" & ");
            stringBuilder.append(object2);
            stringBuilder.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        return object2;
    }

    public static <P extends javax.a.a<T>, T> javax.a.a<T> a(P p2) {
        e.a(p2);
        if (p2 instanceof a) {
            return p2;
        }
        return new a<T>(p2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public T d() {
        Object object = this.d;
        if (object != b) {
            return (T)object;
        }
        a a2 = this;
        synchronized (a2) {
            Object object2 = this.d;
            if (object2 == b) {
                object2 = this.c.d();
                this.d = a.a(this.d, object2);
                this.c = null;
            }
            return (T)object2;
        }
    }
}

