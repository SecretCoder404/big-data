/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.a.b.a.a
 *  com.google.a.b.a.b
 *  com.google.a.b.a.c
 *  com.google.a.b.a.d
 *  com.google.a.b.a.g
 *  com.google.a.b.a.h
 *  com.google.a.b.a.i
 *  com.google.a.b.a.j
 *  com.google.a.b.a.k
 *  com.google.a.b.d
 *  com.google.a.d
 *  com.google.a.f$1
 *  com.google.a.f$2
 *  com.google.a.f$3
 *  com.google.a.f$4
 *  com.google.a.f$5
 *  com.google.a.f$a
 *  com.google.a.m
 *  com.google.a.n
 *  com.google.a.t
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.StringReader
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Appendable
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.lang.reflect.Type
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicLongArray
 */
package com.google.a;

import com.google.a.b.a.g;
import com.google.a.b.a.i;
import com.google.a.b.a.j;
import com.google.a.b.d;
import com.google.a.b.k;
import com.google.a.b.l;
import com.google.a.d.b;
import com.google.a.d.c;
import com.google.a.e;
import com.google.a.f;
import com.google.a.h;
import com.google.a.m;
import com.google.a.n;
import com.google.a.t;
import com.google.a.u;
import com.google.a.v;
import com.google.a.w;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/*
 * Exception performing whole class analysis.
 */
public final class f {
    private static final com.google.a.c.a<?> r;
    final List<w> a;
    final d b;
    final e c;
    final Map<Type, h<?>> d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;
    final boolean j;
    final boolean k;
    final String l;
    final int m;
    final int n;
    final u o;
    final List<w> p;
    final List<w> q;
    private final ThreadLocal<Map<com.google.a.c.a<?>, a<?>>> s;
    private final Map<com.google.a.c.a<?>, v<?>> t;
    private final com.google.a.b.c u;
    private final com.google.a.b.a.d v;

    static {
        r = com.google.a.c.a.b(Object.class);
    }

    public f() {
        this(d.a, (e)com.google.a.d.a, Collections.emptyMap(), false, false, false, true, false, false, false, u.a, null, 2, 2, (List<w>)Collections.emptyList(), (List<w>)Collections.emptyList(), (List<w>)Collections.emptyList());
    }

    f(d d2, e e2, Map<Type, h<?>> map, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, u u2, String string, int n2, int n3, List<w> list, List<w> list2, List<w> list3) {
        this.s = new ThreadLocal();
        this.t = new ConcurrentHashMap();
        this.b = d2;
        this.c = e2;
        this.d = map;
        this.u = new com.google.a.b.c(map);
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
        this.h = bl5;
        this.i = bl6;
        this.j = bl7;
        this.k = bl8;
        this.o = u2;
        this.l = string;
        this.m = n2;
        this.n = n3;
        this.p = list;
        this.q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)com.google.a.b.a.n.Y);
        arrayList.add((Object)com.google.a.b.a.h.a);
        arrayList.add((Object)d2);
        arrayList.addAll(list3);
        arrayList.add((Object)com.google.a.b.a.n.D);
        arrayList.add((Object)com.google.a.b.a.n.m);
        arrayList.add((Object)com.google.a.b.a.n.g);
        arrayList.add((Object)com.google.a.b.a.n.i);
        arrayList.add((Object)com.google.a.b.a.n.k);
        v<Number> v2 = f.a(u2);
        arrayList.add((Object)com.google.a.b.a.n.a(Long.TYPE, Long.class, v2));
        arrayList.add((Object)com.google.a.b.a.n.a(Double.TYPE, Double.class, this.a(bl8)));
        arrayList.add((Object)com.google.a.b.a.n.a(Float.TYPE, Float.class, this.b(bl8)));
        arrayList.add((Object)com.google.a.b.a.n.x);
        arrayList.add((Object)com.google.a.b.a.n.o);
        arrayList.add((Object)com.google.a.b.a.n.q);
        arrayList.add((Object)com.google.a.b.a.n.a(AtomicLong.class, f.a(v2)));
        arrayList.add((Object)com.google.a.b.a.n.a(AtomicLongArray.class, f.b(v2)));
        arrayList.add((Object)com.google.a.b.a.n.s);
        arrayList.add((Object)com.google.a.b.a.n.z);
        arrayList.add((Object)com.google.a.b.a.n.F);
        arrayList.add((Object)com.google.a.b.a.n.H);
        arrayList.add((Object)com.google.a.b.a.n.a(BigDecimal.class, com.google.a.b.a.n.B));
        arrayList.add((Object)com.google.a.b.a.n.a(BigInteger.class, com.google.a.b.a.n.C));
        arrayList.add((Object)com.google.a.b.a.n.J);
        arrayList.add((Object)com.google.a.b.a.n.L);
        arrayList.add((Object)com.google.a.b.a.n.P);
        arrayList.add((Object)com.google.a.b.a.n.R);
        arrayList.add((Object)com.google.a.b.a.n.W);
        arrayList.add((Object)com.google.a.b.a.n.N);
        arrayList.add((Object)com.google.a.b.a.n.d);
        arrayList.add((Object)com.google.a.b.a.c.a);
        arrayList.add((Object)com.google.a.b.a.n.U);
        arrayList.add((Object)com.google.a.b.a.k.a);
        arrayList.add((Object)j.a);
        arrayList.add((Object)com.google.a.b.a.n.S);
        arrayList.add((Object)com.google.a.b.a.a.a);
        arrayList.add((Object)com.google.a.b.a.n.b);
        arrayList.add((Object)new com.google.a.b.a.b(this.u));
        arrayList.add((Object)new g(this.u, bl3));
        this.v = new com.google.a.b.a.d(this.u);
        arrayList.add((Object)this.v);
        arrayList.add((Object)com.google.a.b.a.n.Z);
        arrayList.add((Object)new i(this.u, e2, d2, this.v));
        this.a = Collections.unmodifiableList((List)arrayList);
    }

    private static v<Number> a(u u2) {
        if (u2 == u.a) {
            return com.google.a.b.a.n.t;
        }
        return new 3();
    }

    private static v<AtomicLong> a(v<Number> v2) {
        return new 4(v2).a();
    }

    private v<Number> a(boolean bl2) {
        if (bl2) {
            return com.google.a.b.a.n.v;
        }
        return new 1(this);
    }

    static void a(double d2) {
        if (!Double.isNaN((double)d2) && !Double.isInfinite((double)d2)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d2);
        stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static void a(Object object, com.google.a.d.a a2) {
        if (object != null) {
            try {
                if (a2.f() == b.j) {
                    return;
                }
                throw new m("JSON document was not fully consumed.");
            }
            catch (IOException iOException) {
                throw new m((Throwable)iOException);
            }
            catch (com.google.a.d.d d2) {
                throw new t((Throwable)((Object)d2));
            }
        }
    }

    private static v<AtomicLongArray> b(v<Number> v2) {
        return new 5(v2).a();
    }

    private v<Number> b(boolean bl2) {
        if (bl2) {
            return com.google.a.b.a.n.u;
        }
        return new 2(this);
    }

    public com.google.a.d.a a(Reader reader) {
        com.google.a.d.a a2 = new com.google.a.d.a(reader);
        a2.a(this.j);
        return a2;
    }

    public c a(Writer writer) {
        if (this.g) {
            writer.write(")]}'\n");
        }
        c c2 = new c(writer);
        if (this.i) {
            c2.c("  ");
        }
        c2.d(this.e);
        return c2;
    }

    public <T> v<T> a(com.google.a.c.a<T> a2) {
        a a3;
        Map<com.google.a.c.a<?>, v<?>> map = this.t;
        com.google.a.c.a<Object> a4 = a2 == null ? r : a2;
        v v2 = (v)map.get(a4);
        if (v2 != null) {
            return v2;
        }
        Map map2 = (Map)this.s.get();
        boolean bl2 = false;
        if (map2 == null) {
            map2 = new HashMap();
            this.s.set((Object)map2);
            bl2 = true;
        }
        if ((a3 = map2.get(a2)) != null) {
            return a3;
        }
        try {
            a a5 = new /* Unavailable Anonymous Inner Class!! */;
            map2.put(a2, (Object)a5);
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                v<T> v3 = ((w)iterator.next()).a(this, a2);
                if (v3 == null) continue;
                a5.a(v3);
                this.t.put(a2, v3);
                return v3;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GSON (2.8.5) cannot handle ");
            stringBuilder.append(a2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        finally {
            map2.remove(a2);
            if (bl2) {
                this.s.remove();
            }
        }
    }

    public <T> v<T> a(w w2, com.google.a.c.a<T> a2) {
        if (!this.a.contains((Object)w2)) {
            w2 = this.v;
        }
        boolean bl2 = false;
        for (w w3 : this.a) {
            if (!bl2) {
                if (w3 != w2) continue;
                bl2 = true;
                continue;
            }
            v<T> v2 = w3.a(this, a2);
            if (v2 == null) continue;
            return v2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GSON cannot serialize ");
        stringBuilder.append(a2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public <T> v<T> a(Class<T> class_) {
        return this.a(com.google.a.c.a.b(class_));
    }

    /*
     * Exception decompiling
     */
    public <T> T a(com.google.a.d.a var1_1, Type var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public <T> T a(Reader reader, Type type) {
        com.google.a.d.a a2 = this.a(reader);
        T t2 = this.a(a2, type);
        f.a(t2, a2);
        return t2;
    }

    public <T> T a(String string, Class<T> class_) {
        T t2 = this.a(string, (Type)class_);
        return (T)k.a(class_).cast(t2);
    }

    public <T> T a(String string, Type type) {
        if (string == null) {
            return null;
        }
        return this.a((Reader)new StringReader(string), type);
    }

    public String a(com.google.a.l l2) {
        StringWriter stringWriter = new StringWriter();
        this.a(l2, (Appendable)stringWriter);
        return stringWriter.toString();
    }

    public String a(Object object) {
        if (object == null) {
            return this.a((com.google.a.l)n.a);
        }
        return this.a(object, (Type)object.getClass());
    }

    public String a(Object object, Type type) {
        StringWriter stringWriter = new StringWriter();
        this.a(object, type, (Appendable)stringWriter);
        return stringWriter.toString();
    }

    /*
     * Exception decompiling
     */
    public void a(com.google.a.l var1_1, c var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CATCHBLOCK]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public void a(com.google.a.l l2, Appendable appendable) {
        try {
            this.a(l2, this.a(l.a(appendable)));
            return;
        }
        catch (IOException iOException) {
            throw new m((Throwable)iOException);
        }
    }

    /*
     * Exception decompiling
     */
    public void a(Object var1_1, Type var2_2, c var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CATCHBLOCK]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public void a(Object object, Type type, Appendable appendable) {
        try {
            this.a(object, type, this.a(l.a(appendable)));
            return;
        }
        catch (IOException iOException) {
            throw new m((Throwable)iOException);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.e);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.a);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append((Object)this.u);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

