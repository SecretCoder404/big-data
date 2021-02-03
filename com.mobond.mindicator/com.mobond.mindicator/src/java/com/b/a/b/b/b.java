/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.b.a.b.b;

import com.b.a.b.e;
import com.b.a.b.f;
import com.b.a.b.j;
import com.b.a.b.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b
implements j {
    private List a;

    public b(List list) {
        this.a = list;
    }

    public static List a(e e2, List list) {
        if (e2 instanceof r) {
            list.add((Object)e2);
            return list;
        }
        if (e2 instanceof f) {
            e2.a(new b(list));
        }
        return list;
    }

    public static List b(e e2) {
        if (e2 instanceof r) {
            return Collections.singletonList((Object)e2);
        }
        return b.a(e2, (List)new ArrayList());
    }

    @Override
    public void a(e e2) {
        if (e2 instanceof r) {
            this.a.add((Object)e2);
        }
    }
}

