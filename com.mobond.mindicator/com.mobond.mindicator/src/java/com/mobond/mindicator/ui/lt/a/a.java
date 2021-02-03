/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.mobond.mindicator.ui.lt.a;

import java.io.Serializable;
import java.util.HashMap;

public class a
implements Serializable {
    public long a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f = -1;
    public boolean g = true;
    public boolean h = true;
    public HashMap<String, String> i = new HashMap();

    public void a() {
        this.c = null;
    }

    public void a(a a2) {
        this.a = a2.a;
        this.b = a2.b;
        this.c = a2.c;
        this.d = a2.d;
        this.e = a2.e;
        this.h = a2.h;
        this.g = a2.g;
        this.i = a2.i;
    }

    public boolean b() {
        return this.c != null;
    }
}

