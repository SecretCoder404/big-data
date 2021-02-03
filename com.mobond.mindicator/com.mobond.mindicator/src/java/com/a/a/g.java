/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.a.a;

import android.text.TextUtils;

public final class g {
    private final String a;
    private final String b;

    public g(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            g g2 = (g)object;
            return TextUtils.equals((CharSequence)this.a, (CharSequence)g2.a) && TextUtils.equals((CharSequence)this.b, (CharSequence)g2.b);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Header[name=");
        stringBuilder.append(this.a);
        stringBuilder.append(",value=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

