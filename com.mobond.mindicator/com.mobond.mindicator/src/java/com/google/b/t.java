/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package com.google.b;

import com.google.b.c;
import com.google.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class t<E>
extends c<E> {
    private static final t<Object> a = new t<E>();
    private final List<E> b;

    static {
        a.b();
    }

    t() {
        this((List<E>)new ArrayList(10));
    }

    private t(List<E> list) {
        this.b = list;
    }

    public static <E> t<E> d() {
        return a;
    }

    @Override
    public /* synthetic */ l.c a(int n2) {
        return this.b(n2);
    }

    @Override
    public void add(int n2, E e2) {
        this.c();
        this.b.add(n2, e2);
        this.modCount = 1 + this.modCount;
    }

    public t<E> b(int n2) {
        if (n2 >= this.size()) {
            ArrayList arrayList = new ArrayList(n2);
            arrayList.addAll(this.b);
            return new t<E>((List<E>)arrayList);
        }
        throw new IllegalArgumentException();
    }

    public E get(int n2) {
        return (E)this.b.get(n2);
    }

    @Override
    public E remove(int n2) {
        this.c();
        Object object = this.b.remove(n2);
        this.modCount = 1 + this.modCount;
        return (E)object;
    }

    @Override
    public E set(int n2, E e2) {
        this.c();
        Object object = this.b.set(n2, e2);
        this.modCount = 1 + this.modCount;
        return (E)object;
    }

    public int size() {
        return this.b.size();
    }
}

