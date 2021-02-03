/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package com.b.a.b.b;

import com.b.a.b.b;
import com.b.a.b.e;
import com.b.a.b.h;
import com.b.a.b.i;
import com.b.a.b.l;
import com.b.a.b.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class a
implements h {
    private Collection a;
    private boolean b = false;

    public a(Collection collection, boolean bl2) {
        this.a = collection;
        this.b = bl2;
    }

    public static List a(e e2, boolean bl2) {
        ArrayList arrayList = new ArrayList();
        e2.a(new a((Collection)arrayList, bl2));
        return arrayList;
    }

    public static List b(e e2) {
        return a.a(e2, false);
    }

    @Override
    public void a(e e2) {
        if (this.b && e2 instanceof n) {
            l l2 = e2.a().c(((n)e2).m());
            this.a.add((Object)l2);
            return;
        }
        if (e2 instanceof l) {
            this.a.add((Object)e2);
        }
    }
}

