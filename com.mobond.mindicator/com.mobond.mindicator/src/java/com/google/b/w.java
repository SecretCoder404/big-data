/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.p
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package com.google.b;

import com.google.b.m;
import com.google.b.p;
import java.util.List;

public class w
extends RuntimeException {
    private final List<String> a = null;

    public w(p p2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public m a() {
        return new m(this.getMessage());
    }
}

