/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package com.a.a.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class d {
    protected static final Comparator<byte[]> a = new Comparator<byte[]>(){

        public int a(byte[] arrby, byte[] arrby2) {
            return arrby.length - arrby2.length;
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((byte[])object, (byte[])object2);
        }
    };
    private final List<byte[]> b = new ArrayList();
    private final List<byte[]> c = new ArrayList(64);
    private int d = 0;
    private final int e;

    public d(int n2) {
        this.e = n2;
    }

    private void a() {
        d d2 = this;
        synchronized (d2) {
            while (this.d > this.e) {
                byte[] arrby = (byte[])this.b.remove(0);
                this.c.remove((Object)arrby);
                this.d -= arrby.length;
            }
            return;
        }
    }

    public void a(byte[] arrby) {
        d d2 = this;
        synchronized (d2) {
            block5 : {
                if (arrby != null) {
                    int n2;
                    block6 : {
                        if (arrby.length > this.e) break block5;
                        this.b.add((Object)arrby);
                        n2 = Collections.binarySearch(this.c, (Object)arrby, a);
                        if (n2 >= 0) break block6;
                        n2 = -1 + -n2;
                    }
                    this.c.add(n2, (Object)arrby);
                    this.d += arrby.length;
                    this.a();
                    return;
                }
            }
            return;
        }
    }

    public byte[] a(int n2) {
        d d2 = this;
        synchronized (d2) {
            int n3 = 0;
            do {
                block5 : {
                    if (n3 >= this.c.size()) break;
                    byte[] arrby = (byte[])this.c.get(n3);
                    if (arrby.length < n2) break block5;
                    this.d -= arrby.length;
                    this.c.remove(n3);
                    this.b.remove((Object)arrby);
                    return arrby;
                }
                ++n3;
            } while (true);
            byte[] arrby = new byte[n2];
            return arrby;
        }
    }

}

