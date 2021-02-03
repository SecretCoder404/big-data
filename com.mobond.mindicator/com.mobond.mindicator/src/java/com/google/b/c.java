/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractList
 *  java.util.Collection
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.b;

import com.google.b.l;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class c<E>
extends AbstractList<E>
implements l.c<E> {
    private boolean a = true;

    c() {
    }

    @Override
    public boolean a() {
        return this.a;
    }

    public void add(int n2, E e2) {
        this.c();
        super.add(n2, e2);
    }

    public boolean add(E e2) {
        this.c();
        return super.add(e2);
    }

    public boolean addAll(int n2, Collection<? extends E> collection) {
        this.c();
        return super.addAll(n2, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        this.c();
        return super.addAll(collection);
    }

    @Override
    public final void b() {
        this.a = false;
    }

    protected void c() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.c();
        super.clear();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        if (!(object instanceof RandomAccess)) {
            return super.equals(object);
        }
        List list = (List)object;
        int n2 = this.size();
        if (n2 != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.get(i2).equals(list.get(i2))) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = this.size();
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = n3 * 31 + this.get(i2).hashCode();
        }
        return n3;
    }

    public E remove(int n2) {
        this.c();
        return (E)super.remove(n2);
    }

    public boolean remove(Object object) {
        this.c();
        return super.remove(object);
    }

    public boolean removeAll(Collection<?> collection) {
        this.c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        this.c();
        return super.retainAll(collection);
    }

    public E set(int n2, E e2) {
        this.c();
        return (E)super.set(n2, e2);
    }
}

