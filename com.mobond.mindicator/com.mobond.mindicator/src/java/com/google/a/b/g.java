/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 */
package com.google.a.b;

import java.math.BigDecimal;

public final class g
extends Number {
    private final String a;

    public g(String string) {
        this.a = string;
    }

    public double doubleValue() {
        return Double.parseDouble((String)this.a);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object instanceof g) {
            g g2 = (g)((Object)object);
            String string = this.a;
            String string2 = g2.a;
            if (string != string2) {
                if (string.equals((Object)string2)) {
                    return bl2;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat((String)this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int intValue() {
        try {
            int n2 = Integer.parseInt((String)this.a);
            return n2;
        }
        catch (NumberFormatException numberFormatException) {
            long l2;
            try {
                l2 = Long.parseLong((String)this.a);
            }
            catch (NumberFormatException numberFormatException2) {
                return new BigDecimal(this.a).intValue();
            }
            return (int)l2;
        }
    }

    public long longValue() {
        try {
            long l2 = Long.parseLong((String)this.a);
            return l2;
        }
        catch (NumberFormatException numberFormatException) {
            return new BigDecimal(this.a).longValue();
        }
    }

    public String toString() {
        return this.a;
    }
}

