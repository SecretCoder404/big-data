/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.a.b.a;

import com.google.a.b.a.m;
import com.google.a.b.a.n;
import com.google.a.b.b;
import com.google.a.b.c;
import com.google.a.b.f;
import com.google.a.b.i;
import com.google.a.b.l;
import com.google.a.q;
import com.google.a.t;
import com.google.a.v;
import com.google.a.w;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g
implements w {
    final boolean a;
    private final c b;

    public g(c c2, boolean bl2) {
        this.b = c2;
        this.a = bl2;
    }

    private v<?> a(com.google.a.f f2, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return f2.a(com.google.a.c.a.a(type));
        }
        return n.f;
    }

    @Override
    public <T> v<T> a(com.google.a.f f2, com.google.a.c.a<T> a2) {
        Type type = a2.b();
        if (!Map.class.isAssignableFrom(a2.a())) {
            return null;
        }
        Type[] arrtype = b.b(type, b.e(type));
        v<?> v2 = this.a(f2, arrtype[0]);
        v<?> v3 = f2.a(com.google.a.c.a.a(arrtype[1]));
        i<T> i2 = this.b.a(a2);
        a a3 = new a(f2, arrtype[0], v2, arrtype[1], v3, i2);
        return a3;
    }

    private final class a<K, V>
    extends v<Map<K, V>> {
        private final v<K> b;
        private final v<V> c;
        private final i<? extends Map<K, V>> d;

        public a(com.google.a.f f2, Type type, v<K> v2, Type type2, v<V> v3, i<? extends Map<K, V>> i2) {
            this.b = new m<K>(f2, v2, type);
            this.c = new m<V>(f2, v3, type2);
            this.d = i2;
        }

        private String a(com.google.a.l l2) {
            if (l2.i()) {
                q q2 = l2.m();
                if (q2.p()) {
                    return String.valueOf((Object)q2.a());
                }
                if (q2.o()) {
                    return Boolean.toString((boolean)q2.f());
                }
                if (q2.q()) {
                    return q2.b();
                }
                throw new AssertionError();
            }
            if (l2.j()) {
                return "null";
            }
            throw new AssertionError();
        }

        public Map<K, V> a(com.google.a.d.a a2) {
            com.google.a.d.b b2 = a2.f();
            if (b2 == com.google.a.d.b.i) {
                a2.j();
                return null;
            }
            Map<K, V> map = this.d.a();
            if (b2 == com.google.a.d.b.a) {
                a2.a();
                while (a2.e()) {
                    a2.a();
                    K k2 = this.b.b(a2);
                    if (map.put(k2, this.c.b(a2)) == null) {
                        a2.b();
                        continue;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("duplicate key: ");
                    stringBuilder.append(k2);
                    throw new t(stringBuilder.toString());
                }
                a2.b();
                return map;
            }
            a2.c();
            while (a2.e()) {
                f.a.a(a2);
                K k3 = this.b.b(a2);
                if (map.put(k3, this.c.b(a2)) == null) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("duplicate key: ");
                stringBuilder.append(k3);
                throw new t(stringBuilder.toString());
            }
            a2.d();
            return map;
        }

        @Override
        public void a(com.google.a.d.c c2, Map<K, V> map) {
            if (map == null) {
                c2.f();
                return;
            }
            if (!g.this.a) {
                c2.d();
                for (Map.Entry entry : map.entrySet()) {
                    c2.a(String.valueOf((Object)entry.getKey()));
                    this.c.a(c2, entry.getValue());
                }
                c2.e();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator iterator = map.entrySet().iterator();
            int n2 = 0;
            boolean bl2 = false;
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                com.google.a.l l2 = this.b.a(entry.getKey());
                arrayList.add((Object)l2);
                arrayList2.add(entry.getValue());
                boolean bl3 = l2.g() || l2.h();
                bl2 |= bl3;
            }
            if (bl2) {
                c2.b();
                int n3 = arrayList.size();
                while (n2 < n3) {
                    c2.b();
                    l.a((com.google.a.l)arrayList.get(n2), c2);
                    this.c.a(c2, arrayList2.get(n2));
                    c2.c();
                    ++n2;
                }
                c2.c();
                return;
            }
            c2.d();
            int n4 = arrayList.size();
            while (n2 < n4) {
                c2.a(this.a((com.google.a.l)arrayList.get(n2)));
                this.c.a(c2, arrayList2.get(n2));
                ++n2;
            }
            c2.e();
        }

        @Override
        public /* synthetic */ Object b(com.google.a.d.a a2) {
            return this.a(a2);
        }
    }

}

