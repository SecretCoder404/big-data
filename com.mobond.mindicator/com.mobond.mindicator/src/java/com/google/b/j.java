/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.n
 *  com.google.b.p
 *  java.lang.Boolean
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.b;

import com.google.b.aa;
import com.google.b.e;
import com.google.b.l;
import com.google.b.n;
import com.google.b.p;
import com.google.b.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class j<FieldDescriptorType extends a<FieldDescriptorType>> {
    private static final j d = new j<FieldDescriptorType>(true);
    private final u<FieldDescriptorType, Object> a;
    private boolean b;
    private boolean c = false;

    private j() {
        this.a = u.a(16);
    }

    private j(boolean bl2) {
        this.a = u.a(0);
        this.b();
    }

    public static <T extends a<T>> j<T> a() {
        return new j<FieldDescriptorType>();
    }

    private static void a(aa.a a2, Object object) {
        if (object != null) {
            boolean bl2;
            switch (1.a[a2.a().ordinal()]) {
                default: {
                    bl2 = false;
                    break;
                }
                case 9: {
                    if (!(object instanceof p)) {
                        boolean bl3 = object instanceof n;
                        bl2 = false;
                        if (!bl3) break;
                    }
                    bl2 = true;
                    break;
                }
                case 8: {
                    if (!(object instanceof Integer)) {
                        boolean bl4 = object instanceof l.a;
                        bl2 = false;
                        if (!bl4) break;
                    }
                    bl2 = true;
                    break;
                }
                case 7: {
                    if (!(object instanceof e)) {
                        boolean bl5 = object instanceof byte[];
                        bl2 = false;
                        if (!bl5) break;
                    }
                    bl2 = true;
                    break;
                }
                case 6: {
                    bl2 = object instanceof String;
                    break;
                }
                case 5: {
                    bl2 = object instanceof Boolean;
                    break;
                }
                case 4: {
                    bl2 = object instanceof Double;
                    break;
                }
                case 3: {
                    bl2 = object instanceof Float;
                    break;
                }
                case 2: {
                    bl2 = object instanceof Long;
                    break;
                }
                case 1: {
                    bl2 = object instanceof Integer;
                }
            }
            if (bl2) {
                return;
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        throw new NullPointerException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(FieldDescriptorType FieldDescriptorType, Object object) {
        if (FieldDescriptorType.b()) {
            if (!(object instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)((List)object));
            for (Object object2 : arrayList) {
                j.a(FieldDescriptorType.a(), object2);
            }
            object = arrayList;
        } else {
            j.a(FieldDescriptorType.a(), object);
        }
        if (object instanceof n) {
            this.c = true;
        }
        this.a.a(FieldDescriptorType, object);
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.a.a();
        this.b = true;
    }

    public j<FieldDescriptorType> c() {
        j<T> j2 = j.a();
        for (int i2 = 0; i2 < this.a.c(); ++i2) {
            Map.Entry<FieldDescriptorType, Object> entry = this.a.b(i2);
            j2.a((a)entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry : this.a.e()) {
            j2.a((a)entry.getKey(), entry.getValue());
        }
        j2.c = this.c;
        return j2;
    }

    public /* synthetic */ Object clone() {
        return this.c();
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> d() {
        if (this.c) {
            return new n.b(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        j j2 = (j)object;
        return this.a.equals(j2.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public static interface a<T extends a<T>>
    extends Comparable<T> {
        public aa.a a();

        public boolean b();
    }

}

