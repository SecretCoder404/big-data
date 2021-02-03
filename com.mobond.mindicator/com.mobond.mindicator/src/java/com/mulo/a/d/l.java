/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Vector
 */
package com.mulo.a.d;

import com.mulo.a.d.i;
import java.io.Serializable;
import java.util.Vector;

public class l
implements Serializable {
    public String a;
    public String b;
    public int c;
    public Vector<i> d;
    public int e;
    public int f;
    public String g;

    public int a() {
        int n2 = this.f;
        int n3 = this.c;
        if (n2 < n3) {
            return n2 + (1440 - n3);
        }
        return n2 - n3;
    }

    public int b() {
        int n2 = this.f;
        int n3 = this.e;
        if (n2 < n3) {
            return n2 + (1440 - n3);
        }
        return n2 - n3;
    }

    public String c() {
        int n2 = this.b();
        int n3 = n2 / 60;
        int n4 = n2 % 60;
        String string = "";
        if (n3 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(n3);
            stringBuilder.append("hr ");
            string = stringBuilder.toString();
        }
        if (n4 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(n4);
            stringBuilder.append("min");
            string = stringBuilder.toString();
        }
        return string.trim();
    }
}

