/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class ad
implements Iterable<ab> {
    private final HashMap<String, ab> a = new HashMap();

    public void a() {
        this.a.clear();
    }

    public void a(ab ab2) {
        this.a.put((Object)ab2.c(), (Object)ab2);
    }

    public boolean b(ab ab2) {
        return this.a.containsKey((Object)ab2.c());
    }

    public Iterator<ab> iterator() {
        return this.a.values().iterator();
    }
}

