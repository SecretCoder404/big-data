/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.a.b.a;

import com.google.a.b.a.h;
import com.google.a.c.a;
import com.google.a.d.b;
import com.google.a.d.c;
import com.google.a.f;
import com.google.a.v;
import com.google.a.w;
import java.util.ArrayList;

public final class h
extends v<Object> {
    public static final w a = new w(){

        @Override
        public <T> v<T> a(f f2, a<T> a2) {
            if (a2.a() == Object.class) {
                return new h(f2);
            }
            return null;
        }
    };
    private final f b;

    h(f f2) {
        this.b = f2;
    }

    @Override
    public void a(c c2, Object object) {
        if (object == null) {
            c2.f();
            return;
        }
        v<Object> v2 = this.b.a(object.getClass());
        if (v2 instanceof h) {
            c2.d();
            c2.e();
            return;
        }
        v2.a(c2, object);
    }

    @Override
    public Object b(com.google.a.d.a a2) {
        b b2 = a2.f();
        switch (2.a[b2.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 6: {
                a2.j();
                return null;
            }
            case 5: {
                return a2.i();
            }
            case 4: {
                return a2.k();
            }
            case 3: {
                return a2.h();
            }
            case 2: {
                com.google.a.b.h h2 = new com.google.a.b.h();
                a2.c();
                while (a2.e()) {
                    h2.put((Object)a2.g(), this.b(a2));
                }
                a2.d();
                return h2;
            }
            case 1: 
        }
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.e()) {
            arrayList.add(this.b(a2));
        }
        a2.b();
        return arrayList;
    }

}

