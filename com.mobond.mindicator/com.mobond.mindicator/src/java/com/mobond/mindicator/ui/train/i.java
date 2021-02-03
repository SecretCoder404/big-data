/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.train;

import android.util.Log;

public class i {
    public String a;
    public String b;
    public String c;
    public int d;

    public i(String string, String string2, String string3, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrainHistory s:");
        stringBuilder.append(string);
        stringBuilder.append("\nselected_direction_end_stations:");
        stringBuilder.append(string2);
        stringBuilder.append("\nselectedRoute:");
        stringBuilder.append(string3);
        stringBuilder.append("\nup_down:");
        stringBuilder.append(n2);
        Log.d((String)"TrainHistory", (String)stringBuilder.toString());
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = n2;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(":");
        stringBuilder.append(this.b);
        stringBuilder.append(":");
        stringBuilder.append(this.c);
        stringBuilder.append(":");
        stringBuilder.append(this.d);
        stringBuilder.append(";");
        return stringBuilder.toString();
    }
}

