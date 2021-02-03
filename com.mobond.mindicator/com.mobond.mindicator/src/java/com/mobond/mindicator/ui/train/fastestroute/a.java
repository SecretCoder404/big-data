/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.train.fastestroute;

import com.mobond.mindicator.ui.train.fastestroute.c;
import java.util.ArrayList;

public class a {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private c h;
    private ArrayList<a> i;

    public a(c c2, String string, String string2, String string3, String string4, String string5, ArrayList<String> arrayList, ArrayList<String> arrayList2, String string6, int n2) {
        String string7;
        this.h = c2;
        this.a = string;
        this.b = string2;
        this.f = string3;
        this.e = string6;
        this.g = n2;
        if (arrayList != null && arrayList.size() > 0) {
            this.i = new ArrayList();
            int n3 = 0;
            while (n3 < arrayList.size()) {
                ArrayList<a> arrayList3 = this.i;
                c c3 = c.c;
                String string8 = (String)arrayList.get(n3);
                String string9 = (String)arrayList2.get(n3);
                int n4 = n3;
                a a2 = new a(c3, string8, string9, string3, null, null, null, null, string6, n2);
                arrayList3.add((Object)a2);
                n3 = n4 + 1;
            }
            string7 = string4;
        } else {
            string7 = string4;
        }
        this.c = string7;
        this.d = string5;
    }

    public c a() {
        return this.h;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.b;
    }

    public ArrayList<a> g() {
        return this.i;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.d;
    }
}

