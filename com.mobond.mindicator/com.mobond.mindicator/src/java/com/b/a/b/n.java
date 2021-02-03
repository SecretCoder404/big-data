/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.b.a.b;

import com.b.a.b.b;
import com.b.a.b.i;
import com.b.a.b.l;

public class n
extends l {
    public n(b b2, i i2) {
        super(b2, i2);
        this.o();
    }

    private void o() {
        if (!this.g() && !super.n()) {
            throw new IllegalArgumentException("Points of LinearRing do not form a closed linestring");
        }
        if (this.m().a() >= 1) {
            if (this.m().a() >= 4) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Invalid number of points in LinearRing (found ");
            stringBuilder.append(this.m().a());
            stringBuilder.append(" - must be 0 or >= 4)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    @Override
    public boolean n() {
        if (this.g()) {
            return true;
        }
        return super.n();
    }
}

