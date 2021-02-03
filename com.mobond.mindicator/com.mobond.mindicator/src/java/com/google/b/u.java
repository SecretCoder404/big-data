/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.u$1
 *  java.lang.Comparable
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.AbstractSet
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.TreeMap
 */
package com.google.b;

import com.google.b.j;
import com.google.b.u;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class u<K extends Comparable<K>, V>
extends AbstractMap<K, V> {
    private final int a;
    private List<u<K, V>> b;
    private Map<K, V> c;
    private boolean d;
    private volatile u<K, V> e;

    private u(int n2) {
        this.a = n2;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    private int a(K k2) {
        int n2 = -1 + this.b.size();
        if (n2 >= 0) {
            int n3 = k2.compareTo(((b)this.b.get(n2)).a());
            if (n3 > 0) {
                return -(n2 + 2);
            }
            if (n3 == 0) {
                return n2;
            }
        }
        int n4 = 0;
        while (n4 <= n2) {
            int n5 = (n4 + n2) / 2;
            int n6 = k2.compareTo(((b)this.b.get(n5)).a());
            if (n6 < 0) {
                n2 = n5 - 1;
                continue;
            }
            if (n6 > 0) {
                n4 = n5 + 1;
                continue;
            }
            return n5;
        }
        return -(n4 + 1);
    }

    static <FieldDescriptorType extends j.a<FieldDescriptorType>> u<FieldDescriptorType, Object> a(int n2) {
        return new 1(n2);
    }

    private V c(int n2) {
        this.f();
        Object v2 = ((b)this.b.remove(n2)).getValue();
        if (!this.c.isEmpty()) {
            Iterator iterator = this.g().entrySet().iterator();
            this.b.add((Object)new b((Map.Entry)iterator.next()));
            iterator.remove();
        }
        return v2;
    }

    private void f() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private SortedMap<K, V> g() {
        this.f();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap)this.c;
    }

    private void h() {
        this.f();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
    }

    public V a(K k2, V v2) {
        int n2;
        this.f();
        int n3 = this.a(k2);
        if (n3 >= 0) {
            return ((b)this.b.get(n3)).setValue(v2);
        }
        this.h();
        int n4 = -(n3 + 1);
        if (n4 >= this.a) {
            return (V)this.g().put(k2, v2);
        }
        int n5 = this.b.size();
        if (n5 == (n2 = this.a)) {
            b b2 = (b)this.b.remove(n2 - 1);
            this.g().put(b2.a(), b2.getValue());
        }
        this.b.add(n4, (Object)new b(this, k2, v2));
        return null;
    }

    public void a() {
        if (!this.d) {
            Map map = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.c = map;
            this.d = true;
        }
    }

    public Map.Entry<K, V> b(int n2) {
        return (Map.Entry)this.b.get(n2);
    }

    public boolean b() {
        return this.d;
    }

    public int c() {
        return this.b.size();
    }

    public void clear() {
        this.f();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public boolean containsKey(Object object) {
        Comparable comparable = (Comparable)object;
        return this.a((K)comparable) >= 0 || this.c.containsKey((Object)comparable);
        {
        }
    }

    public int d() {
        return this.c.size();
    }

    public Iterable<Map.Entry<K, V>> e() {
        if (this.c.isEmpty()) {
            return a.a();
        }
        return this.c.entrySet();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d();
        }
        return this.e;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof u)) {
            return super.equals(object);
        }
        u u2 = (u)((Object)object);
        int n2 = this.size();
        if (n2 != u2.size()) {
            return false;
        }
        int n3 = this.c();
        if (n3 != u2.c()) {
            return this.entrySet().equals(u2.entrySet());
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            if (this.b(i2).equals(u2.b(i2))) continue;
            return false;
        }
        if (n3 != n2) {
            return this.c.equals(u2.c);
        }
        return true;
    }

    public V get(Object object) {
        Comparable comparable = (Comparable)object;
        int n2 = this.a((K)comparable);
        if (n2 >= 0) {
            return ((b)this.b.get(n2)).getValue();
        }
        return (V)this.c.get((Object)comparable);
    }

    public int hashCode() {
        int n2 = this.c();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += ((b)this.b.get(i2)).hashCode();
        }
        if (this.d() > 0) {
            n3 += this.c.hashCode();
        }
        return n3;
    }

    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((K)((Comparable)object), (V)object2);
    }

    public V remove(Object object) {
        this.f();
        Comparable comparable = (Comparable)object;
        int n2 = this.a((K)comparable);
        if (n2 >= 0) {
            return this.c(n2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return (V)this.c.remove((Object)comparable);
    }

    public int size() {
        return this.b.size() + this.c.size();
    }

    private static class a {
        private static final Iterator<Object> a = new Iterator<Object>(){

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> b = new Iterable<Object>(){

            public Iterator<Object> iterator() {
                return a;
            }
        };

        static <T> Iterable<T> a() {
            return b;
        }

    }

    private class b
    implements Comparable<u<K, V>>,
    Map.Entry<K, V> {
        private final K b;
        private V c;

        b(K k2, V v2) {
            this.b = k2;
            this.c = v2;
        }

        b(Map.Entry<K, V> entry) {
            this(u2, (Comparable)entry.getKey(), entry.getValue());
        }

        private boolean a(Object object, Object object2) {
            if (object == null) {
                return object2 == null;
            }
            return object.equals(object2);
        }

        public int a(u<K, V> u2) {
            return this.a().compareTo(((b)((Object)u2)).a());
        }

        public K a() {
            return this.b;
        }

        public /* synthetic */ int compareTo(Object object) {
            return this.a((b)object);
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry)object;
            return this.a(this.b, entry.getKey()) && this.a(this.c, entry.getValue());
        }

        public /* synthetic */ Object getKey() {
            return this.a();
        }

        public V getValue() {
            return this.c;
        }

        public int hashCode() {
            K k2 = this.b;
            int n2 = k2 == null ? 0 : k2.hashCode();
            V v2 = this.c;
            int n3 = v2 == null ? 0 : v2.hashCode();
            return n2 ^ n3;
        }

        public V setValue(V v2) {
            a.f();
            V v3 = this.c;
            this.c = v2;
            return v3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append("=");
            stringBuilder.append(this.c);
            return stringBuilder.toString();
        }
    }

    private class c
    implements Iterator<Map.Entry<K, V>> {
        private int b = -1;
        private boolean c;
        private Iterator<Map.Entry<K, V>> d;

        private c() {
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.d == null) {
                this.d = u.this.c.entrySet().iterator();
            }
            return this.d;
        }

        public Map.Entry<K, V> a() {
            int n2;
            this.c = true;
            this.b = n2 = 1 + this.b;
            if (n2 < u.this.b.size()) {
                return (Map.Entry)u.this.b.get(this.b);
            }
            return (Map.Entry)this.b().next();
        }

        public boolean hasNext() {
            int n2 = this.b;
            boolean bl2 = true;
            if (n2 + bl2 >= u.this.b.size()) {
                if (this.b().hasNext()) {
                    return bl2;
                }
                bl2 = false;
            }
            return bl2;
        }

        public /* synthetic */ Object next() {
            return this.a();
        }

        public void remove() {
            if (this.c) {
                this.c = false;
                u.this.f();
                if (this.b < u.this.b.size()) {
                    u u2 = u.this;
                    int n2 = this.b;
                    this.b = n2 - 1;
                    u2.c(n2);
                    return;
                }
                this.b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    private class d
    extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            if (!this.contains(entry)) {
                u.this.a((Comparable)entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        public /* synthetic */ boolean add(Object object) {
            return this.a((Map.Entry)object);
        }

        public void clear() {
            u.this.clear();
        }

        public boolean contains(Object object) {
            Object object2;
            Map.Entry entry = (Map.Entry)object;
            Object v2 = u.this.get(entry.getKey());
            return v2 == (object2 = entry.getValue()) || v2 != null && v2.equals(object2);
            {
            }
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        public boolean remove(Object object) {
            Map.Entry entry = (Map.Entry)object;
            if (this.contains((Object)entry)) {
                u.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        public int size() {
            return u.this.size();
        }
    }

}

