/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.ev
 *  com.amazon.device.ads.t$1
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import com.amazon.device.ads.aa;
import com.amazon.device.ads.af;
import com.amazon.device.ads.ah;
import com.amazon.device.ads.aq;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dj;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.ei;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.ev;
import com.amazon.device.ads.m;
import com.amazon.device.ads.t;
import com.amazon.device.ads.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class t {
    private static final String a = "t";
    private final cy b;
    private final u.b c;
    private final aq d;
    private final cx e;
    private final ee f;
    private final bk g;
    private final ej.k h;
    private final ei i;
    private final aa.a j;
    private final dj k;
    private final ev l;

    public t() {
        this(new u.b(), new aq(), ej.a(), cx.a(), ee.a(), bk.a(), new cz(), new ei(), new aa.a(), new dj(), new ev());
    }

    t(u.b b2, aq aq2, ej.k k2, cx cx2, ee ee2, bk bk2, cz cz2, ei ei2, aa.a a2, dj dj2, ev ev2) {
        this.c = b2;
        this.b = cz2.a(a);
        this.d = aq2;
        this.e = cx2;
        this.f = ee2;
        this.g = bk2;
        this.h = k2;
        this.i = ei2;
        this.j = a2;
        this.k = dj2;
        this.l = ev2;
    }

    static /* synthetic */ cx a(t t2) {
        return t2.e;
    }

    @SuppressLint(value={"UseSparseArrays"})
    private void a(int n2, ah ah2, List<af> list) {
        aq.a a2 = this.d.b();
        if (!a2.a()) {
            this.a(new m(m.a.d, "An internal request was not made on a background thread."), list);
            return;
        }
        if (ah2 == null) {
            ah2 = new ah();
        }
        aa aa2 = this.j.a(ah2).a(a2).a();
        HashMap hashMap = new HashMap();
        Iterator iterator = list.iterator();
        int n3 = 1;
        while (iterator.hasNext()) {
            af af2 = (af)iterator.next();
            if (!af2.i()) continue;
            af2.a(n3);
            hashMap.put((Object)n3, (Object)af2);
            aa2.a(af2);
            ++n3;
        }
        if (hashMap.size() > 0) {
            u u2 = this.c.a(aa2, (Map<Integer, af>)hashMap);
            u2.a(n2);
            u2.a();
        }
    }

    private void a(m m2, List<af> list) {
        Iterator iterator = list.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            af af2 = (af)iterator.next();
            if (af2.c() == -1) continue;
            af2.b(m2);
            ++n2;
        }
        if (n2 > 0) {
            cy cy2 = this.b;
            Object[] arrobject = new Object[]{m2.b(), m2.a()};
            cy2.e("%s; code: %s", arrobject);
        }
    }

    static /* synthetic */ void a(t t2, int n2, ah ah2, List list) {
        t2.a(n2, ah2, (List<af>)list);
    }

    static /* synthetic */ void a(t t2, m m2, List list) {
        t2.a(m2, (List<af>)list);
    }

    private boolean a(af[] arraf) {
        int n2 = this.e.h();
        if (n2 > 0) {
            String string;
            m.a a2;
            int n3 = n2 / 1000;
            if (this.e.i()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SDK Message: ");
                stringBuilder.append("DISABLED_APP");
                string = stringBuilder.toString();
                a2 = m.a.d;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SDK Message: ");
                stringBuilder.append("no results. Try again in ");
                stringBuilder.append(n3);
                stringBuilder.append(" seconds.");
                string = stringBuilder.toString();
                a2 = m.a.c;
            }
            this.a(new m(a2, string), (List<af>)new ArrayList((Collection)Arrays.asList((Object[])arraf)));
            return true;
        }
        return false;
    }

    static /* synthetic */ ej.k b(t t2) {
        return t2.h;
    }

    public /* varargs */ void a(int n2, ah ah2, af ... arraf) {
        if (this.a(arraf)) {
            return;
        }
        if (ah2 != null && ah2.e() && !this.k.c(this.e.k())) {
            this.b.e("Geolocation for ad targeting has been disabled. To enable geolocation, add at least one of the following permissions to the app manifest: 1. ACCESS_FINE_LOCATION; 2. ACCESS_COARSE_LOCATION.");
        }
        long l2 = this.i.b();
        ArrayList arrayList = new ArrayList();
        for (af af2 : arraf) {
            if (!af2.a(l2)) continue;
            arrayList.add((Object)af2);
        }
        this.g.a((bk.b)this.l);
        1 var9_9 = new 1(this, this.f, this.g, n2, ah2, arrayList);
        var9_9.f();
    }
}

