/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package d.a.a.a.a.b;

public final class l
extends Enum<l> {
    public static final /* enum */ l a = new l(1);
    public static final /* enum */ l b = new l(2);
    public static final /* enum */ l c = new l(3);
    public static final /* enum */ l d = new l(4);
    private static final /* synthetic */ l[] f;
    private final int e;

    static {
        l[] arrl = new l[]{a, b, c, d};
        f = arrl;
    }

    private l(int n3) {
        this.e = n3;
    }

    public static l a(String string) {
        if ("io.crash.air".equals((Object)string)) {
            return c;
        }
        if (string != null) {
            return d;
        }
        return a;
    }

    public static l valueOf(String string) {
        return (l)Enum.valueOf(l.class, (String)string);
    }

    public static l[] values() {
        return (l[])f.clone();
    }

    public int a() {
        return this.e;
    }

    public String toString() {
        return Integer.toString((int)this.e);
    }
}

