/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.d.e
 *  com.google.android.gms.d.k
 *  com.google.firebase.remoteconfig.a
 *  com.google.firebase.remoteconfig.i
 *  com.google.firebase.remoteconfig.i$a
 *  com.mobond.mindicator.fcm.a$1
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.mobond.mindicator.fcm;

import com.google.android.gms.d.e;
import com.google.android.gms.d.k;
import com.google.firebase.remoteconfig.i;
import com.mobond.mindicator.fcm.a;

public class a {
    static a a;
    com.google.firebase.remoteconfig.a b = com.google.firebase.remoteconfig.a.a();
    boolean c = false;

    private a() {
        this.b.a(2131951618);
        i i2 = new i.a().a(21600L).a();
        this.b.a(i2);
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public static String a(String string) {
        return a.a().b.a(string);
    }

    public void a(Runnable runnable) {
        if (!this.c) {
            this.c = true;
            this.b.a(0L).a((e)new 1(this, runnable));
        }
    }
}

