/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package d.a.a.a.a.c.a;

import d.a.a.a.a.c.a.a;
import d.a.a.a.a.c.a.d;

public class e {
    private final int a;
    private final a b;
    private final d c;

    public e(int n2, a a2, d d2) {
        this.a = n2;
        this.b = a2;
        this.c = d2;
    }

    public e(a a2, d d2) {
        this(0, a2, d2);
    }

    public long a() {
        return this.b.getDelayMillis(this.a);
    }

    public e b() {
        return new e(1 + this.a, this.b, this.c);
    }

    public e c() {
        return new e(this.b, this.c);
    }
}

