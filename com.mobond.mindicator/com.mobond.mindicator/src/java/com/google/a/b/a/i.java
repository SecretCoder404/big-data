/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.AccessibleObject
 *  java.lang.reflect.Field
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package com.google.a.b.a;

import com.google.a.b.a.m;
import com.google.a.b.c;
import com.google.a.b.d;
import com.google.a.b.k;
import com.google.a.e;
import com.google.a.f;
import com.google.a.t;
import com.google.a.v;
import com.google.a.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i
implements w {
    private final c a;
    private final e b;
    private final d c;
    private final com.google.a.b.a.d d;
    private final com.google.a.b.b.b e = com.google.a.b.b.b.a();

    public i(c c2, e e2, d d2, com.google.a.b.a.d d3) {
        this.a = c2;
        this.b = e2;
        this.c = d2;
        this.d = d3;
    }

    private b a(final f f2, final Field field, String string, final com.google.a.c.a<?> a2, boolean bl2, boolean bl3) {
        final boolean bl4 = k.a(a2.a());
        com.google.a.a.b b2 = (com.google.a.a.b)field.getAnnotation(com.google.a.a.b.class);
        v<?> v2 = b2 != null ? this.d.a(this.a, f2, a2, b2) : null;
        final boolean bl5 = v2 != null;
        if (v2 == null) {
            v2 = f2.a(a2);
        }
        final v<?> v3 = v2;
        b b3 = new b(string, bl2, bl3){

            @Override
            void a(com.google.a.d.a a22, Object object) {
                Object t2 = v3.b(a22);
                if (t2 != null || !bl4) {
                    field.set(object, t2);
                }
            }

            @Override
            void a(com.google.a.d.c c2, Object object) {
                Object object2 = field.get(object);
                m<Object> m2 = bl5 ? v3 : new m<Object>(f2, v3, a2.b());
                ((v)m2).a(c2, object2);
            }

            @Override
            public boolean a(Object object) {
                if (!this.i) {
                    return false;
                }
                Object object2 = field.get(object);
                boolean bl2 = false;
                if (object2 != object) {
                    bl2 = true;
                }
                return bl2;
            }
        };
        return b3;
    }

    private List<String> a(Field field) {
        com.google.a.a.c c2 = (com.google.a.a.c)field.getAnnotation(com.google.a.a.c.class);
        if (c2 == null) {
            return Collections.singletonList((Object)this.b.a(field));
        }
        String string = c2.a();
        String[] arrstring = c2.b();
        if (arrstring.length == 0) {
            return Collections.singletonList((Object)string);
        }
        ArrayList arrayList = new ArrayList(1 + arrstring.length);
        arrayList.add((Object)string);
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)arrstring[i2]);
        }
        return arrayList;
    }

    private Map<String, b> a(f f2, com.google.a.c.a<?> a2, Class<?> class_) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (class_.isInterface()) {
            return linkedHashMap;
        }
        Type type = a2.b();
        com.google.a.c.a<?> a3 = a2;
        Class<?> class_2 = class_;
        while (class_2 != Object.class) {
            for (Field field : class_2.getDeclaredFields()) {
                boolean bl2 = this.a(field, true);
                boolean bl3 = this.a(field, false);
                if (!bl2 && !bl3) continue;
                this.e.a((AccessibleObject)field);
                Type type2 = com.google.a.b.b.a(a3.b(), class_2, field.getGenericType());
                List<String> list = this.a(field);
                int n2 = list.size();
                b b2 = null;
                int n3 = 0;
                while (n3 < n2) {
                    String string = (String)list.get(n3);
                    boolean bl4 = n3 != 0 ? false : bl2;
                    com.google.a.c.a<?> a4 = com.google.a.c.a.a(type2);
                    b b3 = b2;
                    Field field2 = field;
                    int n4 = n3;
                    int n5 = n2;
                    List<String> list2 = list;
                    boolean bl5 = bl4;
                    Field field3 = field;
                    b b4 = linkedHashMap.put((Object)string, (Object)this.a(f2, field2, string, a4, bl5, bl3));
                    b2 = b3 == null ? b4 : b3;
                    n3 = n4 + 1;
                    bl2 = bl4;
                    list = list2;
                    n2 = n5;
                    field = field3;
                }
                b b5 = b2;
                if (b5 == null) {
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)type);
                stringBuilder.append(" declares multiple JSON fields named ");
                stringBuilder.append(b5.h);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            a3 = com.google.a.c.a.a(com.google.a.b.b.a(a3.b(), class_2, class_2.getGenericSuperclass()));
            class_2 = a3.a();
        }
        return linkedHashMap;
    }

    static boolean a(Field field, boolean bl2, d d2) {
        return !d2.a(field.getType(), bl2) && !d2.a(field, bl2);
    }

    @Override
    public <T> v<T> a(f f2, com.google.a.c.a<T> a2) {
        Class<T> class_ = a2.a();
        if (!Object.class.isAssignableFrom(class_)) {
            return null;
        }
        return new a<T>(this.a.a(a2), this.a(f2, a2, class_));
    }

    public boolean a(Field field, boolean bl2) {
        return i.a(field, bl2, this.c);
    }

    public static final class a<T>
    extends v<T> {
        private final com.google.a.b.i<T> a;
        private final Map<String, b> b;

        a(com.google.a.b.i<T> i2, Map<String, b> map) {
            this.a = i2;
            this.b = map;
        }

        @Override
        public void a(com.google.a.d.c c2, T t2) {
            if (t2 == null) {
                c2.f();
                return;
            }
            c2.d();
            try {
                for (b b2 : this.b.values()) {
                    if (!b2.a(t2)) continue;
                    c2.a(b2.h);
                    b2.a(c2, t2);
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
            c2.e();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public T b(com.google.a.d.a a2) {
            if (a2.f() == com.google.a.d.b.i) {
                a2.j();
                return null;
            }
            T t2 = this.a.a();
            try {
                a2.c();
                while (a2.e()) {
                    String string = a2.g();
                    b b2 = this.b.get((Object)string);
                    if (b2 != null && b2.j) {
                        b2.a(a2, t2);
                        continue;
                    }
                    a2.n();
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
            catch (IllegalStateException illegalStateException) {
                throw new t(illegalStateException);
            }
            a2.d();
            return t2;
        }
    }

}

