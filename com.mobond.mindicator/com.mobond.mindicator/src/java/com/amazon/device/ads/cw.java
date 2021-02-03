/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cw$c
 *  com.amazon.device.ads.cw$d
 *  com.amazon.device.ads.cw$e
 *  com.amazon.device.ads.cw$f
 *  com.amazon.device.ads.cw$g
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Vector
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dd;
import java.util.Vector;

/*
 * Exception performing whole class analysis.
 */
class cw {
    private static final String b = "cw";
    protected Vector<b> a;
    private final cy c;
    private String d;

    public cw() {
        this.c = new cz().a(b);
        this.a = new Vector(60);
    }

    public Vector<b> a() {
        return this.a;
    }

    public void a(cv.a a2) {
        cy cy2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("METRIC Increment ");
        stringBuilder.append(a2.toString());
        cy2.d(stringBuilder.toString());
        this.a.add((Object)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void a(cv.a a2, long l2) {
        cy cy2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("METRIC Publish ");
        stringBuilder.append(a2.toString());
        cy2.d(stringBuilder.toString());
        this.a.add((Object)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void a(cv.a a2, String string) {
        cy cy2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("METRIC Set ");
        stringBuilder.append(a2.toString());
        stringBuilder.append(": ");
        stringBuilder.append(string);
        cy2.d(stringBuilder.toString());
        this.a.add((Object)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void a(String string) {
        this.d = string;
    }

    public String b() {
        return this.d;
    }

    public void b(cv.a a2) {
        this.b(a2, System.nanoTime());
    }

    public void b(cv.a a2, long l2) {
        cy cy2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("METRIC Start ");
        stringBuilder.append(a2.toString());
        cy2.d(stringBuilder.toString());
        long l3 = dd.a(l2);
        this.a.add((Object)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void c(cv.a a2) {
        this.c(a2, System.nanoTime());
    }

    public void c(cv.a a2, long l2) {
        cy cy2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("METRIC Stop ");
        stringBuilder.append(a2.toString());
        cy2.d(stringBuilder.toString());
        long l3 = dd.a(l2);
        this.a.add((Object)new /* Unavailable Anonymous Inner Class!! */);
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    static class b {
        public final cv.a a;

        public b(cv.a a2) {
            this.a = a2;
        }
    }

}

