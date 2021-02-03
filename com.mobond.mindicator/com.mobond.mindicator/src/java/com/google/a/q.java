/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.math.BigInteger
 */
package com.google.a;

import com.google.a.b.a;
import com.google.a.b.g;
import com.google.a.l;
import java.math.BigInteger;

public final class q
extends l {
    private static final Class<?>[] a;
    private Object b;

    static {
        Class[] arrclass = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
        a = arrclass;
    }

    public q(Boolean bl2) {
        this.a((Object)bl2);
    }

    public q(Number number) {
        this.a((Object)number);
    }

    public q(String string) {
        this.a(string);
    }

    private static boolean a(q q2) {
        block2 : {
            boolean bl2;
            block4 : {
                block3 : {
                    Object object = q2.b;
                    if (!(object instanceof Number)) break block2;
                    Number number = (Number)object;
                    if (number instanceof BigInteger || number instanceof Long || number instanceof Integer || number instanceof Short) break block3;
                    boolean bl3 = number instanceof Byte;
                    bl2 = false;
                    if (!bl3) break block4;
                }
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    private static boolean b(Object object) {
        if (object instanceof String) {
            return true;
        }
        Class class_ = object.getClass();
        Class<?>[] arrclass = a;
        int n2 = arrclass.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!arrclass[i2].isAssignableFrom(class_)) continue;
            return true;
        }
        return false;
    }

    @Override
    public Number a() {
        Object object = this.b;
        if (object instanceof String) {
            return new g((String)object);
        }
        return (Number)object;
    }

    void a(Object object) {
        if (object instanceof Character) {
            this.b = String.valueOf((char)((Character)object).charValue());
            return;
        }
        boolean bl2 = object instanceof Number || q.b(object);
        a.a(bl2);
        this.b = object;
    }

    @Override
    public String b() {
        if (this.p()) {
            return this.a().toString();
        }
        if (this.o()) {
            return this.n().toString();
        }
        return (String)this.b;
    }

    @Override
    public double c() {
        if (this.p()) {
            return this.a().doubleValue();
        }
        return Double.parseDouble((String)this.b());
    }

    @Override
    public long d() {
        if (this.p()) {
            return this.a().longValue();
        }
        return Long.parseLong((String)this.b());
    }

    @Override
    public int e() {
        if (this.p()) {
            return this.a().intValue();
        }
        return Integer.parseInt((String)this.b());
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            q q2 = (q)object;
            if (this.b == null) {
                if (q2.b == null) {
                    return bl2;
                }
                return false;
            }
            if (q.a(this) && q.a(q2)) {
                if (this.a().longValue() == q2.a().longValue()) {
                    return bl2;
                }
                return false;
            }
            if (this.b instanceof Number && q2.b instanceof Number) {
                double d2;
                double d3 = this.a().doubleValue();
                if (d3 != (d2 = q2.a().doubleValue())) {
                    if (Double.isNaN((double)d3) && Double.isNaN((double)d2)) {
                        return bl2;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            return this.b.equals(q2.b);
        }
        return false;
    }

    @Override
    public boolean f() {
        if (this.o()) {
            return this.n();
        }
        return Boolean.parseBoolean((String)this.b());
    }

    public int hashCode() {
        if (this.b == null) {
            return 31;
        }
        if (q.a(this)) {
            long l2 = this.a().longValue();
            return (int)(l2 ^ l2 >>> 32);
        }
        Object object = this.b;
        if (object instanceof Number) {
            long l3 = Double.doubleToLongBits((double)this.a().doubleValue());
            return (int)(l3 ^ l3 >>> 32);
        }
        return object.hashCode();
    }

    @Override
    Boolean n() {
        return (Boolean)this.b;
    }

    public boolean o() {
        return this.b instanceof Boolean;
    }

    public boolean p() {
        return this.b instanceof Number;
    }

    public boolean q() {
        return this.b instanceof String;
    }
}

