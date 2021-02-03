/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.b.a.f.a;

import com.b.a.b.e;
import com.b.a.b.j;
import com.b.a.b.l;
import com.b.a.b.r;
import com.b.a.b.s;
import com.b.a.f.a.c;
import java.util.ArrayList;
import java.util.List;

public class a
implements j {
    private List a;

    a(List list) {
        this.a = list;
    }

    public static List b(e e2) {
        ArrayList arrayList = new ArrayList();
        e2.a(new a((List)arrayList));
        return arrayList;
    }

    @Override
    public void a(e e2) {
        if (e2 instanceof r || e2 instanceof l || e2 instanceof s) {
            this.a.add((Object)new c(e2, 0, e2.d()));
        }
    }
}

