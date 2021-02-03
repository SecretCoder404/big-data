/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  java.util.Collection
 */
package com.google.a.b.a;

import com.google.a.b.a.m;
import com.google.a.b.c;
import com.google.a.b.i;
import com.google.a.f;
import com.google.a.v;
import com.google.a.w;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b
implements w {
    private final c a;

    public b(c c2) {
        this.a = c2;
    }

    @Override
    public <T> v<T> a(f f2, com.google.a.c.a<T> a2) {
        Type type = a2.b();
        Class<T> class_ = a2.a();
        if (!Collection.class.isAssignableFrom(class_)) {
            return null;
        }
        Type type2 = com.google.a.b.b.a(type, class_);
        return new a(f2, type2, f2.a(com.google.a.c.a.a(type2)), this.a.a(a2));
    }

    private static final class a<E>
    extends v<Collection<E>> {
        private final v<E> a;
        private final i<? extends Collection<E>> b;

        public a(f f2, Type type, v<E> v2, i<? extends Collection<E>> i2) {
            this.a = new m<E>(f2, v2, type);
            this.b = i2;
        }

        public Collection<E> a(com.google.a.d.a a2) {
            if (a2.f() == com.google.a.d.b.i) {
                a2.j();
                return null;
            }
            Collection<E> collection = this.b.a();
            a2.a();
            while (a2.e()) {
                collection.add(this.a.b(a2));
            }
            a2.b();
            return collection;
        }

        @Override
        public void a(com.google.a.d.c c2, Collection<E> collection) {
            if (collection == null) {
                c2.f();
                return;
            }
            c2.b();
            for (Object object : collection) {
                this.a.a(c2, object);
            }
            c2.c();
        }

        @Override
        public /* synthetic */ Object b(com.google.a.d.a a2) {
            return this.a(a2);
        }
    }

}

