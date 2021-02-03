/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui.indianrail.seatavailability.a;

import com.mobond.mindicator.ui.indianrail.a.f;
import java.io.Serializable;

public class b
implements Serializable {
    public f a;
    public int b;
    public String c;
    public String d = "";
    public String e = "";
    public String f;
    public String g;
    public boolean h = false;
    public boolean i = false;
    public byte j = 0;

    public b(f f2, int n2, String string, String string2, String string3, String string4) {
        this.a = f2;
        this.b = n2;
        this.c = string;
        this.d = string2;
        this.f = string3;
        this.g = string4;
        String string5 = string3.split(" ")[2];
        if (f2.c.equals((Object)"Daily")) {
            this.i = false;
            return;
        }
        if (!f2.c.contains((CharSequence)string5)) {
            this.i = true;
        }
    }

    public b(b b2) {
        this.a = b2.a;
        this.b = b2.b;
        this.c = b2.c;
        this.d = b2.d;
        this.f = b2.f;
        this.g = b2.g;
        this.i = b2.i;
    }
}

