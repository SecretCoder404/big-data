/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bn;
import com.amazon.device.ads.cs;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.ee;
import java.util.ArrayList;

class cy
implements cs {
    private int a = 1000;
    private final cs b;
    private final bn c;
    private final ee d;

    public cy(cs cs2) {
        this(cs2, bn.a(), ee.a());
    }

    cy(cs cs2, bn bn2, ee ee2) {
        this.b = cs2.g("AmazonMobileAds");
        this.c = bn2;
        this.d = ee2;
    }

    private Iterable<String> a(String string, int n2) {
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            if (string.length() == 0) {
                return arrayList;
            }
            int n3 = 0;
            while (n3 < string.length()) {
                int n4 = string.length();
                int n5 = n3 + n2;
                arrayList.add((Object)string.substring(n3, Math.min((int)n4, (int)n5)));
                n3 = n5;
            }
            return arrayList;
        }
        return arrayList;
    }

    private /* varargs */ void a(boolean bl2, a a2, String string, Object ... arrobject) {
        if (this.a() || bl2) {
            block7 : for (String string2 : this.f(string, arrobject)) {
                switch (1.a[a2.ordinal()]) {
                    default: {
                        continue block7;
                    }
                    case 5: {
                        this.b.e(string2);
                        continue block7;
                    }
                    case 4: {
                        this.b.c(string2);
                        continue block7;
                    }
                    case 3: {
                        this.b.b(string2);
                        continue block7;
                    }
                    case 2: {
                        this.b.f(string2);
                        continue block7;
                    }
                    case 1: 
                }
                this.b.d(string2);
            }
        }
    }

    private /* varargs */ Iterable<String> f(String string, Object ... arrobject) {
        if (arrobject != null && arrobject.length > 0) {
            string = String.format((String)string, (Object[])arrobject);
        }
        return this.a(string, this.a);
    }

    public cy a(String string) {
        cs cs2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AmazonMobileAds ");
        stringBuilder.append(string);
        cs2.g(stringBuilder.toString());
        return this;
    }

    public /* varargs */ void a(a a2, String string, Object ... arrobject) {
        this.a(false, a2, string, arrobject);
    }

    public /* varargs */ void a(String string, Object ... arrobject) {
        this.a(a.c, string, arrobject);
    }

    public boolean a() {
        if (this.b != null) {
            bn bn2 = this.c;
            if (bn2 == null) {
                return false;
            }
            return bn2.a("debug.logging", this.d.a("loggingEnabled", false));
        }
        return false;
    }

    public /* varargs */ void b(a a2, String string, Object ... arrobject) {
        this.a(true, a2, string, arrobject);
    }

    @Override
    public void b(String string) {
        this.a(string, (Object[])null);
    }

    public /* varargs */ void b(String string, Object ... arrobject) {
        this.a(a.d, string, arrobject);
    }

    @Override
    public void c(String string) {
        this.b(string, (Object[])null);
    }

    public /* varargs */ void c(String string, Object ... arrobject) {
        this.a(a.a, string, arrobject);
    }

    @Override
    public void d(String string) {
        this.c(string, null);
    }

    public /* varargs */ void d(String string, Object ... arrobject) {
        this.a(a.e, string, arrobject);
    }

    @Override
    public void e(String string) {
        this.d(string, null);
    }

    public /* varargs */ void e(String string, Object ... arrobject) {
        this.a(a.b, string, arrobject);
    }

    @Override
    public void f(String string) {
        this.e(string, null);
    }

    @Override
    public /* synthetic */ cs g(String string) {
        return this.a(string);
    }

}

