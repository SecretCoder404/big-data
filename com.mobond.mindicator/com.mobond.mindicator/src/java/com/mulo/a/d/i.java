/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mulo.a.d;

import com.mulo.a.d.h;
import com.mulo.util.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class i
implements Serializable {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public int g;
    public String h;
    public int i;
    public String j;
    public int k;
    public String l;
    public String m;
    public int n;
    public int o;
    public String p;
    public Vector<String> q = null;
    public ArrayList<String> r = new ArrayList();
    public ArrayList<String> s = new ArrayList();
    public String t;
    public String u;
    public String v;
    public String w;

    public int a() {
        int n2 = this.i;
        int n3 = this.g;
        if (n2 < n3) {
            return n2 + (1440 - n3);
        }
        return n2 - n3;
    }

    public void a(Object object) {
        String string;
        if (this.f.startsWith("C")) {
            this.p = "Central Line";
            string = "C";
        } else if (this.f.startsWith("W")) {
            this.p = "Western Line";
            string = "W";
        } else if (this.f.startsWith("H")) {
            this.p = "Harbour Line";
            string = "H";
        } else if (this.f.startsWith("T")) {
            this.p = "Transharbour Line";
            string = "T";
        } else if (this.f.startsWith("U")) {
            this.p = "Uran Line";
            string = "U";
        } else if (this.f.startsWith("DVP")) {
            this.p = "Shuttle";
            string = "DVP";
        } else if (this.f.startsWith("DPR")) {
            this.p = "Shuttle";
            string = "DPR";
        } else if (this.f.startsWith("DL_BLUE")) {
            this.p = "Blue Line";
            string = "DL_BLUE";
        } else if (this.f.startsWith("DL_GREEN")) {
            this.p = "Green Line";
            string = "DL_GREEN";
        } else if (this.f.startsWith("DL_ORANGE")) {
            this.p = "Orange Line";
            string = "DL_ORANGE";
        } else if (this.f.startsWith("DL_RAPID")) {
            this.p = "Rapid Line";
            string = "DL_RAPID";
        } else if (this.f.startsWith("DL_RED")) {
            this.p = "Red Line";
            string = "DL_RED";
        } else if (this.f.startsWith("DL_VIOLET")) {
            this.p = "Violet Line";
            string = "DL_VIOLET";
        } else if (this.f.startsWith("DL_YELLOW")) {
            this.p = "Yellow Line";
            string = "DL_YELLOW";
        } else {
            this.p = string = this.f;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        stringBuilder.append(this.e);
        String[] arrstring = h.a(string, stringBuilder.toString(), object);
        this.q = new Vector();
        boolean bl = false;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (arrstring[i2].contains((CharSequence)this.a)) {
                String[] arrstring2 = arrstring[i2].split("#", -1);
                String string2 = arrstring2[3];
                String string3 = arrstring2[4];
                if (string2 != null && !string2.equals((Object)"")) {
                    this.t = string2;
                }
                if (string3 != null && !string3.equals((Object)"")) {
                    this.v = string3;
                }
                bl = true;
                continue;
            }
            if (arrstring[i2].contains((CharSequence)this.b)) {
                String[] arrstring3 = arrstring[i2].split("#", -1);
                String string4 = arrstring3[3];
                String string5 = arrstring3[4];
                if (string4 != null && !string4.equals((Object)"")) {
                    this.u = string4;
                }
                if (string5 == null || string5.equals((Object)"")) break;
                this.w = string5;
                return;
            }
            if (!bl) continue;
            this.q.add((Object)arrstring[i2]);
            String[] arrstring4 = arrstring[i2].split("#", -1);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(arrstring4[0]);
            stringBuilder2.append(" ");
            stringBuilder2.append(arrstring4[1]);
            String string6 = stringBuilder2.toString();
            String string7 = e.a(arrstring4[2], null);
            this.s.add((Object)string6);
            this.r.add((Object)string7);
        }
    }

    public boolean a(String string, Object object) {
        String string2 = this.f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        stringBuilder.append(this.e);
        String[] arrstring = h.a(string2, stringBuilder.toString(), object);
        this.q = new Vector();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].contains((CharSequence)string)) continue;
            return true;
        }
        return false;
    }

    public String b() {
        int n2 = this.a();
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

