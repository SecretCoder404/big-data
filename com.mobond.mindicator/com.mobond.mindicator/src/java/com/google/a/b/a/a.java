/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 */
package com.google.a.b.a;

import com.google.a.b.a.m;
import com.google.a.b.b;
import com.google.a.d.c;
import com.google.a.f;
import com.google.a.v;
import com.google.a.w;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E>
extends v<Object> {
    public static final w a = new w(){

        @Override
        public <T> v<T> a(f f2, com.google.a.c.a<T> a2) {
            Type type = a2.b();
            if (!(type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray())) {
                return null;
            }
            Type type2 = b.g(type);
            return new a(f2, f2.a(com.google.a.c.a.a(type2)), b.e(type2));
        }
    };
    private final Class<E> b;
    private final v<E> c;

    public a(f f2, v<E> v2, Class<E> class_) {
        this.c = new m<E>(f2, v2, (Type)class_);
        this.b = class_;
    }

    @Override
    public void a(c c2, Object object) {
        if (object == null) {
            c2.f();
            return;
        }
        c2.b();
        int n2 = Array.getLength((Object)object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get((Object)object, (int)i2);
            this.c.a(c2, object2);
        }
        c2.c();
    }

    @Override
    public Object b(com.google.a.d.a a2) {
        if (a2.f() == com.google.a.d.b.i) {
            a2.j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.e()) {
            arrayList.add(this.c.b(a2));
        }
        a2.b();
        int n2 = arrayList.size();
        Object object = Array.newInstance(this.b, (int)n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set((Object)object, (int)i2, (Object)arrayList.get(i2));
        }
        return object;
    }

}

