/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package com.google.b;

import com.google.b.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class i {
    static final i a;
    private static volatile boolean b;
    private static final Class<?> c;
    private final Map<Object, Object<?, ?>> d;

    static {
        c = i.a();
        a = new i(true);
    }

    i() {
        this.d = new HashMap();
    }

    i(boolean bl2) {
        this.d = Collections.emptyMap();
    }

    static Class<?> a() {
        try {
            Class class_ = Class.forName((String)"com.google.protobuf.Extension");
            return class_;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public static i b() {
        return h.b();
    }
}

