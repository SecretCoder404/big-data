/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Hashtable
 */
package com.mulo.b;

import java.util.Hashtable;

public class d {
    Hashtable a = new Hashtable();

    public Hashtable a() {
        return this.a;
    }

    public void a(String string, String string2) {
        if (string != null && string2 != null) {
            if (this.a.contains((Object)string)) {
                String string3 = (String)this.a.get((Object)string);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(",");
                stringBuilder.append(string2);
                String string4 = stringBuilder.toString();
                this.a.put((Object)string, (Object)string4);
                return;
            }
            this.a.put((Object)string, (Object)string2);
            return;
        }
        throw new IllegalArgumentException("Key or Value is null in HeaderSet");
    }
}

