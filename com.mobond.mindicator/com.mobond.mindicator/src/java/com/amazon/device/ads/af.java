/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.j
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ae;
import com.amazon.device.ads.ah;
import com.amazon.device.ads.bl;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.j;
import com.amazon.device.ads.l;
import com.amazon.device.ads.m;

class af {
    private int a;
    private final j b;
    private final ah c;
    private boolean d = false;
    private m e;
    private final String f;
    private final String g = "slotId";

    af(j j2, ah ah2) {
        this.b = j2;
        if (ah2 == null) {
            this.c = new ah();
            this.f = null;
            return;
        }
        this.c = ah2;
        this.f = this.c.a("slotId");
    }

    public af a(boolean bl2) {
        this.d = bl2;
        return this;
    }

    public ah a() {
        return this.c;
    }

    void a(int n2) {
        this.a = n2;
    }

    void a(bl bl2) {
        this.b.a(bl2);
    }

    void a(l l2) {
        this.b.a(l2);
    }

    void a(m m2) {
        this.e = m2;
    }

    boolean a(long l2) {
        return this.b.a(l2, this.d);
    }

    public ae b() {
        return this.b.r();
    }

    void b(m m2) {
        this.b.a(m2);
    }

    int c() {
        return this.a;
    }

    m d() {
        return this.e;
    }

    String e() {
        return this.b.F();
    }

    cw f() {
        return this.b.e();
    }

    boolean g() {
        return this.b.p() != null && this.b.p().f();
    }

    void h() {
        this.b.a(this.f);
    }

    boolean i() {
        return this.b.o();
    }

    boolean j() {
        return this.b.N();
    }
}

