/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.AbstractList
 */
package com.mulo.util;

import java.util.AbstractList;

public abstract class f {
    public void a(AbstractList abstractList, int n2, int n3) {
        Object object = abstractList.get(n2);
        abstractList.set(n2, abstractList.get(n3));
        abstractList.set(n3, object);
    }

    public void a(AbstractList abstractList, boolean bl) {
        int n2 = abstractList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            for (int i3 = 1; i3 < n2 - i2; ++i3) {
                int n3 = i3 - 1;
                try {
                    if (!(this.a(n3, i3, abstractList) ^ (bl ^ true))) continue;
                    this.a(abstractList, n3, i3);
                    continue;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public abstract boolean a(int var1, int var2, AbstractList var3);
}

