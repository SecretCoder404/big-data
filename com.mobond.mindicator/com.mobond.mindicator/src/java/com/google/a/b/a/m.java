/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 */
package com.google.a.b.a;

import com.google.a.b.a.i;
import com.google.a.c.a;
import com.google.a.d.c;
import com.google.a.f;
import com.google.a.v;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class m<T>
extends v<T> {
    private final f a;
    private final v<T> b;
    private final Type c;

    m(f f2, v<T> v2, Type type) {
        this.a = f2;
        this.b = v2;
        this.c = type;
    }

    private Type a(Type type, Object object) {
        if (object != null && (type == Object.class || type instanceof TypeVariable || type instanceof Class)) {
            type = object.getClass();
        }
        return type;
    }

    @Override
    public void a(c c2, T t2) {
        v<T> v2;
        v<Object> v3 = this.b;
        Type type = this.a(this.c, t2);
        if (type != this.c && (v3 = this.a.a(a.a(type))) instanceof i.a && !((v2 = this.b) instanceof i.a)) {
            v3 = v2;
        }
        v3.a(c2, t2);
    }

    @Override
    public T b(com.google.a.d.a a2) {
        return this.b.b(a2);
    }
}

