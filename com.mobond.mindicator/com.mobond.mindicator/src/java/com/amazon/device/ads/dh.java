/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.amazon.device.ads;

import java.util.HashMap;

class dh {
    private final HashMap<String, Object> a = new HashMap();

    dh() {
    }

    public Object a(String string) {
        return this.a.get((Object)string);
    }

    public void a(String string, Object object) {
        this.a.put((Object)string, object);
    }
}

