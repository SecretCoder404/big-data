/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 */
package com.google.a.b.a;

import com.google.a.a.b;
import com.google.a.b.a.l;
import com.google.a.b.c;
import com.google.a.b.i;
import com.google.a.c.a;
import com.google.a.f;
import com.google.a.k;
import com.google.a.s;
import com.google.a.v;
import com.google.a.w;
import java.lang.annotation.Annotation;

public final class d
implements w {
    private final c a;

    public d(c c2) {
        this.a = c2;
    }

    v<?> a(c c2, f f2, a<?> a2, b b2) {
        v<?> v2;
        Object obj = c2.a(a.b(b2.a())).a();
        if (obj instanceof v) {
            v2 = (v<?>)obj;
        } else if (obj instanceof w) {
            v2 = ((w)obj).a(f2, a2);
        } else {
            boolean bl2 = obj instanceof s;
            if (!bl2 && !(obj instanceof k)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid attempt to bind an instance of ");
                stringBuilder.append(obj.getClass().getName());
                stringBuilder.append(" as a @JsonAdapter for ");
                stringBuilder.append(a2.toString());
                stringBuilder.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            s s2 = bl2 ? (s)obj : null;
            boolean bl3 = obj instanceof k;
            k k2 = null;
            if (bl3) {
                k2 = (k)obj;
            }
            k k3 = k2;
            v2 = new l(s2, k3, f2, a2, null);
        }
        if (v2 != null && b2.b()) {
            v2 = v2.a();
        }
        return v2;
    }

    @Override
    public <T> v<T> a(f f2, a<T> a2) {
        b b2 = (b)a2.a().getAnnotation(b.class);
        if (b2 == null) {
            return null;
        }
        return this.a(this.a, f2, a2, b2);
    }
}

