/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 */
package d.a.a.a.a.c.a;

import d.a.a.a.a.c.a.a;

public class c
implements a {
    private final long a;
    private final int b;

    public c(long l2, int n2) {
        this.a = l2;
        this.b = n2;
    }

    @Override
    public long getDelayMillis(int n2) {
        double d2 = this.a;
        double d3 = Math.pow((double)this.b, (double)n2);
        Double.isNaN((double)d2);
        return (long)(d2 * d3);
    }
}

