/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.b.a.g;

import com.b.a.g.b;

public class a {
    public static void a() {
        a.a(null);
    }

    public static void a(String string) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder("Should never reach here");
        if (string != null) {
            StringBuilder stringBuilder2 = new StringBuilder(": ");
            stringBuilder2.append(string);
            string2 = stringBuilder2.toString();
        } else {
            string2 = "";
        }
        stringBuilder.append(string2);
        throw new b(stringBuilder.toString());
    }

    public static void a(boolean bl2) {
        a.a(bl2, null);
    }

    public static void a(boolean bl2, String string) {
        if (!bl2) {
            if (string == null) {
                throw new b();
            }
            throw new b(string);
        }
    }
}

