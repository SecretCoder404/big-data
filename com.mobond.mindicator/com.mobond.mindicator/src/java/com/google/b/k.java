/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Collection
 */
package com.google.b;

import com.google.b.a;
import com.google.b.aa;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.m;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import com.google.b.t;
import com.google.b.w;
import com.google.b.x;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

public abstract class k<MessageType extends k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
extends com.google.b.a<MessageType, BuilderType> {
    protected x b = x.a();
    protected int c = -1;

    private static <T extends k<T, ?>> T a(T t2) {
        if (t2 != null) {
            if (((k)t2).o()) {
                return t2;
            }
            throw ((com.google.b.a)t2).j().a().a(t2);
        }
        return t2;
    }

    static <T extends k<T, ?>> T a(T t2, com.google.b.f f2, com.google.b.i i2) {
        k k2 = (k)((k)t2).a(i.e);
        try {
            k2.a(i.c, f2, i2);
            k2.n();
        }
        catch (RuntimeException runtimeException) {
            if (runtimeException.getCause() instanceof m) {
                throw (m)runtimeException.getCause();
            }
            throw runtimeException;
        }
        return (T)k2;
    }

    protected static <T extends k<T, ?>> T a(T t2, InputStream inputStream) {
        return k.a(k.a(t2, com.google.b.f.a(inputStream), com.google.b.i.b()));
    }

    protected static <T extends k<T, ?>> T a(T t2, byte[] arrby) {
        return k.a(k.a(t2, arrby, com.google.b.i.b()));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static <T extends k<T, ?>> T a(T t2, byte[] arrby, com.google.b.i i2) {
        com.google.b.f f2 = com.google.b.f.a(arrby);
        T t3 = k.a(t2, f2, i2);
        {
            catch (m m2) {
                throw m2;
            }
        }
        try {
            f2.a(0);
        }
        catch (m m3) {
            throw m3.a(t3);
        }
        return t3;
    }

    protected static <E> l.c<E> a(l.c<E> c2) {
        int n2 = c2.size();
        int n3 = n2 == 0 ? 10 : n2 * 2;
        return c2.a(n3);
    }

    static /* varargs */ Object a(Method method, Object object, Object ... arrobject) {
        try {
            Object object2 = method.invoke(object, arrobject);
            return object2;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", (Throwable)illegalAccessException);
        }
    }

    private final void a() {
        if (this.b == x.a()) {
            this.b = x.b();
        }
    }

    protected static final <T extends k<T, ?>> boolean a(T t2, boolean bl) {
        return ((k)t2).a(i.a, (Object)bl) != null;
    }

    protected static <E> l.c<E> q() {
        return t.d();
    }

    int a(g g2) {
        if (this.a == 0) {
            int n2 = g2.a;
            g2.a = 0;
            this.a(g2, this);
            this.a = g2.a;
            g2.a = n2;
        }
        return this.a;
    }

    protected Object a(i i2) {
        return this.a(i2, null, null);
    }

    protected Object a(i i2, Object object) {
        return this.a(i2, object, null);
    }

    protected abstract Object a(i var1, Object var2, Object var3);

    void a(j j2, MessageType MessageType) {
        this.a(i.b, j2, MessageType);
        this.b = j2.a(this.b, ((k)MessageType).b);
    }

    protected boolean a(int n2, com.google.b.f f2) {
        if (aa.a(n2) == 4) {
            return false;
        }
        this.a();
        return this.b.a(n2, f2);
    }

    boolean a(c c2, p p2) {
        if (this == p2) {
            return true;
        }
        if (!this.l().getClass().isInstance((Object)p2)) {
            return false;
        }
        this.a(c2, (k)p2);
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!this.l().getClass().isInstance(object)) {
            return false;
        }
        try {
            this.a(c.a, (k)object);
            return true;
        }
        catch (c.a a2) {
            return false;
        }
    }

    public int hashCode() {
        if (this.a == 0) {
            g g2 = new g();
            this.a(g2, this);
            this.a = g2.a;
        }
        return this.a;
    }

    public final s<MessageType> k() {
        return (s)this.a(i.h);
    }

    public final MessageType l() {
        return (MessageType)((k)this.a(i.g));
    }

    public final BuilderType m() {
        return (BuilderType)((a)this.a(i.f));
    }

    protected void n() {
        this.a(i.d);
        this.b.c();
    }

    @Override
    public final boolean o() {
        return this.a(i.a, (Object)Boolean.TRUE) != null;
    }

    public final BuilderType p() {
        a a2 = (a)this.a(i.f);
        a2.b(this);
        return (BuilderType)a2;
    }

    @Override
    public /* synthetic */ p.a r() {
        return this.p();
    }

    @Override
    public /* synthetic */ p s() {
        return this.l();
    }

    public String toString() {
        return r.a(this, Object.super.toString());
    }

    public static abstract class a<MessageType extends k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    extends a.a<MessageType, BuilderType> {
        protected MessageType a;
        protected boolean b;
        private final MessageType c;

        protected a(MessageType MessageType) {
            this.c = MessageType;
            this.a = (k)((k)MessageType).a(i.e);
            this.b = false;
        }

        @Override
        public /* synthetic */ a.a a() {
            return this.c();
        }

        @Override
        protected BuilderType a(MessageType MessageType) {
            return this.b(MessageType);
        }

        public BuilderType b(MessageType MessageType) {
            this.b();
            ((k)this.a).a(h.a, MessageType);
            return (BuilderType)this;
        }

        protected void b() {
            if (this.b) {
                k k2 = (k)((k)this.a).a(i.e);
                k2.a(h.a, this.a);
                this.a = k2;
                this.b = false;
            }
        }

        public BuilderType c() {
            Object BuilderType = ((k)this.f()).m();
            ((a)BuilderType).b(this.d());
            return BuilderType;
        }

        @Override
        public /* synthetic */ Object clone() {
            return this.c();
        }

        public MessageType d() {
            if (this.b) {
                return this.a;
            }
            ((k)this.a).n();
            this.b = true;
            return this.a;
        }

        public final MessageType e() {
            MessageType MessageType = this.d();
            if (((k)MessageType).o()) {
                return MessageType;
            }
            throw a.b(MessageType);
        }

        public MessageType f() {
            return this.c;
        }

        @Override
        public /* synthetic */ p g() {
            return this.e();
        }

        @Override
        public final boolean o() {
            return k.a(this.a, false);
        }

        @Override
        public /* synthetic */ p s() {
            return this.f();
        }
    }

    protected static class b<T extends k<T, ?>>
    extends com.google.b.b<T> {
        private T a;

        public b(T t2) {
            this.a = t2;
        }

        public T a(com.google.b.f f2, com.google.b.i i2) {
            return k.a(this.a, f2, i2);
        }

        @Override
        public /* synthetic */ Object b(com.google.b.f f2, com.google.b.i i2) {
            return this.a(f2, i2);
        }
    }

    static class c
    implements j {
        static final c a = new c();
        static final a b = new RuntimeException(){};

        private c() {
        }

        @Override
        public int a(boolean bl, int n2, boolean bl2, int n3) {
            if (bl == bl2 && n2 == n3) {
                return n2;
            }
            throw b;
        }

        @Override
        public long a(boolean bl, long l2, boolean bl2, long l3) {
            if (bl == bl2 && l2 == l3) {
                return l2;
            }
            throw b;
        }

        @Override
        public com.google.b.e a(boolean bl, com.google.b.e e2, boolean bl2, com.google.b.e e3) {
            if (bl == bl2 && e2.equals(e3)) {
                return e2;
            }
            throw b;
        }

        @Override
        public <T> l.c<T> a(l.c<T> c2, l.c<T> c3) {
            if (c2.equals(c3)) {
                return c2;
            }
            throw b;
        }

        @Override
        public <T extends p> T a(T t2, T t3) {
            if (t2 == null && t3 == null) {
                return null;
            }
            if (t2 != null && t3 != null) {
                ((k)t2).a(this, t3);
                return t2;
            }
            throw b;
        }

        @Override
        public x a(x x2, x x3) {
            if (x2.equals(x3)) {
                return x2;
            }
            throw b;
        }

        @Override
        public String a(boolean bl, String string, boolean bl2, String string2) {
            if (bl == bl2 && string.equals((Object)string2)) {
                return string;
            }
            throw b;
        }

        @Override
        public boolean a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
            if (bl == bl3 && bl2 == bl4) {
                return bl2;
            }
            throw b;
        }

    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>>
    extends k<MessageType, BuilderType>
    implements e<MessageType, BuilderType> {
        protected com.google.b.j<f> d = com.google.b.j.a();
    }

    public static interface e
    extends q {
    }

    static final class f
    implements j.a<f> {
        final int a;
        final aa.a b;
        final boolean c;

        public int a(f f2) {
            return this.a - f2.a;
        }

        @Override
        public aa.a a() {
            return this.b;
        }

        @Override
        public boolean b() {
            return this.c;
        }

        public int c() {
            return this.a;
        }

        public /* synthetic */ int compareTo(Object object) {
            return this.a((f)object);
        }
    }

    private static class g
    implements j {
        private int a = 0;

        private g() {
        }

        @Override
        public int a(boolean bl, int n2, boolean bl2, int n3) {
            this.a = n2 + 53 * this.a;
            return n2;
        }

        @Override
        public long a(boolean bl, long l2, boolean bl2, long l3) {
            this.a = 53 * this.a + l.a(l2);
            return l2;
        }

        @Override
        public com.google.b.e a(boolean bl, com.google.b.e e2, boolean bl2, com.google.b.e e3) {
            this.a = 53 * this.a + e2.hashCode();
            return e2;
        }

        @Override
        public <T> l.c<T> a(l.c<T> c2, l.c<T> c3) {
            this.a = 53 * this.a + c2.hashCode();
            return c2;
        }

        @Override
        public <T extends p> T a(T t2, T t3) {
            int n2 = t2 != null ? (t2 instanceof k ? ((k)t2).a(this) : t2.hashCode()) : 37;
            this.a = n2 + 53 * this.a;
            return t2;
        }

        @Override
        public x a(x x2, x x3) {
            this.a = 53 * this.a + x2.hashCode();
            return x2;
        }

        @Override
        public String a(boolean bl, String string, boolean bl2, String string2) {
            this.a = 53 * this.a + string.hashCode();
            return string;
        }

        @Override
        public boolean a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
            this.a = 53 * this.a + l.a(bl2);
            return bl2;
        }
    }

    protected static class h
    implements j {
        public static final h a = new h();

        private h() {
        }

        @Override
        public int a(boolean bl, int n2, boolean bl2, int n3) {
            if (bl2) {
                n2 = n3;
            }
            return n2;
        }

        @Override
        public long a(boolean bl, long l2, boolean bl2, long l3) {
            if (bl2) {
                l2 = l3;
            }
            return l2;
        }

        @Override
        public com.google.b.e a(boolean bl, com.google.b.e e2, boolean bl2, com.google.b.e e3) {
            if (bl2) {
                e2 = e3;
            }
            return e2;
        }

        @Override
        public <T> l.c<T> a(l.c<T> c2, l.c<T> c3) {
            int n2 = c2.size();
            int n3 = c3.size();
            if (n2 > 0 && n3 > 0) {
                if (!c2.a()) {
                    c2 = c2.a(n3 + n2);
                }
                c2.addAll(c3);
            }
            if (n2 > 0) {
                return c2;
            }
            return c3;
        }

        @Override
        public <T extends p> T a(T t2, T t3) {
            if (t2 != null && t3 != null) {
                return (T)t2.r().c(t3).g();
            }
            if (t2 != null) {
                return t2;
            }
            return t3;
        }

        @Override
        public x a(x x2, x x3) {
            if (x3 == x.a()) {
                return x2;
            }
            return x.a(x2, x3);
        }

        @Override
        public String a(boolean bl, String string, boolean bl2, String string2) {
            if (bl2) {
                string = string2;
            }
            return string;
        }

        @Override
        public boolean a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
            if (bl3) {
                bl2 = bl4;
            }
            return bl2;
        }
    }

}

