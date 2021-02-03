/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.b.a.b.b;

import com.b.a.b.e;
import com.b.a.b.f;
import com.b.a.b.j;
import com.b.a.b.s;
import java.util.ArrayList;
import java.util.List;

public class c
implements j {
    private List a;

    public c(List list) {
        this.a = list;
    }

    public static List a(e e2, List list) {
        if (e2 instanceof s) {
            list.add((Object)e2);
            return list;
        }
        if (e2 instanceof f) {
            e2.a(new c(list));
        }
        return list;
    }

    public static List b(e e2) {
        return c.a(e2, (List)new ArrayList());
    }

    @Override
    public void a(e e2) {
        if (e2 instanceof s) {
            this.a.add((Object)e2);
        }
    }
}

