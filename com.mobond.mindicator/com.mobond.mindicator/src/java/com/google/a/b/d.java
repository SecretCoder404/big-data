/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Field
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.a.b;

import com.google.a.a.e;
import com.google.a.b;
import com.google.a.c;
import com.google.a.c.a;
import com.google.a.f;
import com.google.a.v;
import com.google.a.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d
implements w,
Cloneable {
    public static final d a = new d();
    private double b = -1.0;
    private int c = 136;
    private boolean d = true;
    private boolean e;
    private List<b> f = Collections.emptyList();
    private List<b> g = Collections.emptyList();

    private boolean a(com.google.a.a.d d2) {
        return d2 == null || !(d2.a() > this.b);
    }

    private boolean a(com.google.a.a.d d2, e e2) {
        return this.a(d2) && this.a(e2);
    }

    private boolean a(e e2) {
        return e2 == null || !(e2.a() <= this.b);
    }

    private boolean a(Class<?> class_) {
        if (this.b != -1.0 && !this.a((com.google.a.a.d)class_.getAnnotation(com.google.a.a.d.class), (e)class_.getAnnotation(e.class))) {
            return true;
        }
        if (!this.d && this.c(class_)) {
            return true;
        }
        return this.b(class_);
    }

    private boolean b(Class<?> class_) {
        return !Enum.class.isAssignableFrom(class_) && (class_.isAnonymousClass() || class_.isLocalClass());
    }

    private boolean b(Class<?> class_, boolean bl2) {
        List<b> list = bl2 ? this.f : this.g;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((b)iterator.next()).a(class_)) continue;
            return true;
        }
        return false;
    }

    private boolean c(Class<?> class_) {
        return class_.isMemberClass() && !this.d(class_);
    }

    private boolean d(Class<?> class_) {
        return (8 & class_.getModifiers()) != 0;
    }

    protected d a() {
        try {
            d d2 = (d)super.clone();
            return d2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    @Override
    public <T> v<T> a(final f f2, final a<T> a2) {
        Class<T> class_ = a2.a();
        boolean bl2 = this.a(class_);
        final boolean bl3 = bl2 || this.b(class_, true);
        final boolean bl4 = bl2 || this.b(class_, false);
        if (!bl3 && !bl4) {
            return null;
        }
        v v2 = new v<T>(){
            private v<T> f;

            private v<T> b() {
                v<T> v2 = this.f;
                if (v2 != null) {
                    return v2;
                }
                v v3 = f2.a(d.this, a2);
                this.f = v3;
                return v3;
            }

            @Override
            public void a(com.google.a.d.c c2, T t2) {
                if (bl3) {
                    c2.f();
                    return;
                }
                this.b().a(c2, t2);
            }

            @Override
            public T b(com.google.a.d.a a22) {
                if (bl4) {
                    a22.n();
                    return null;
                }
                return this.b().b(a22);
            }
        };
        return v2;
    }

    public boolean a(Class<?> class_, boolean bl2) {
        return this.a(class_) || this.b(class_, bl2);
        {
        }
    }

    public boolean a(Field field, boolean bl2) {
        if ((this.c & field.getModifiers()) != 0) {
            return true;
        }
        if (this.b != -1.0 && !this.a((com.google.a.a.d)field.getAnnotation(com.google.a.a.d.class), (e)field.getAnnotation(e.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (this.e) {
            com.google.a.a.a a2 = (com.google.a.a.a)field.getAnnotation(com.google.a.a.a.class);
            if (a2 != null) {
                if (bl2 ? !a2.a() : !a2.b()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (!this.d && this.c(field.getType())) {
            return true;
        }
        if (this.b(field.getType())) {
            return true;
        }
        List<b> list = bl2 ? this.f : this.g;
        if (!list.isEmpty()) {
            c c2 = new c(field);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((b)iterator.next()).a(c2)) continue;
                return true;
            }
        }
        return false;
    }

    protected /* synthetic */ Object clone() {
        return this.a();
    }

}

