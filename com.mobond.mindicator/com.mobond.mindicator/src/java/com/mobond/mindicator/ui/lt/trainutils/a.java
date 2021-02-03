/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParser
 *  com.mulo.b.a
 *  com.mulo.b.c
 *  com.mulo.b.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.app.Activity;
import android.content.Context;
import com.a.a.o;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mulo.b.c;
import com.mulo.b.h;
import java.util.Map;

public class a {
    public static final String a;
    public static final String b;
    public static final String c;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://mobondhrd.appspot.com/mtracker/");
        stringBuilder.append(new String(IRParser.Base64.decode("cHVzaGxpdmU=")));
        a = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("https://mobondhrd.appspot.com/mtracker/");
        stringBuilder2.append(new String(IRParser.Base64.decode("Z2V0bGl2ZXRyYWluaW5mbw==")));
        b = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("https://mobondhrd.appspot.com/mtracker/");
        stringBuilder3.append(new String(IRParser.Base64.decode("Z2V0YWxsbGl2ZXRyYWlucw==")));
        c = stringBuilder3.toString();
    }

    public static void a(h h2, com.mulo.b.a a2, Activity activity) {
        c.a((String)"https://mobondhrd.appspot.com/mtracker/managetrain", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
    }

    public static void a(String string, com.mulo.b.a a2, Activity activity) {
        h h2 = new h();
        h2.a("tn", string);
        c.a((String)b, (h)h2, (com.mulo.b.a)a2, (Activity)activity);
    }

    public static void a(String string, com.mulo.b.a a2, Context context) {
        String string2 = com.mobond.mindicator.a.a(context).p();
        if (string2 == null) {
            string2 = "";
        }
        h h2 = new h();
        h2.a("action", "register_md5");
        h2.a("fcmid", string2);
        h2.a("u", string);
        c.a((String)"https://mobondhrd.appspot.com/mtracker/register", (h)h2, (com.mulo.b.a)a2, null);
    }

    public static void a(String string, String string2, com.mulo.b.a a2, Activity activity) {
        h h2 = new h();
        h2.a("action", "isuserregistered");
        h2.a("email", string);
        if (string2 != null) {
            h2.a("md5hash", string2);
        }
        if (c.a((Activity)activity)) {
            c.a((String)"https://mobondhrd.appspot.com/mtracker/register", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
            return;
        }
        a2.a();
    }

    public static void a(String string, String string2, String string3, com.mulo.b.a a2, Activity activity) {
        h h2 = new h();
        h2.a("tn", string);
        h2.a("from", string2);
        h2.a("time", string3);
        h2.a("version", "20210102");
        c.a((String)"https://mobondhrd.appspot.com/mtracker/gettrainalert", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
    }

    public static void a(String string, String string2, String string3, String string4, boolean bl, com.mulo.b.a a2, Activity activity) {
        h h2 = new h();
        h2.a("action", "profileupdate");
        h2.a("email", string);
        h2.a("mobile", string2);
        h2.a("displayname", string3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bl);
        stringBuilder.append("");
        h2.a("isverified", stringBuilder.toString());
        h2.a("access", string4);
        if (c.a((Activity)activity)) {
            c.a((String)"https://mobondhrd.appspot.com/mtracker/register", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
            return;
        }
        a2.a();
    }

    public static void a(String string, String string2, String string3, String string4, boolean bl, String string5, com.mulo.b.a a2, Activity activity) {
        String string6 = com.mobond.mindicator.a.a(activity).p();
        if (string6 == null) {
            string6 = "";
        }
        h h2 = new h();
        h2.a("action", "register");
        h2.a("fcmid", string6);
        h2.a("email", string);
        h2.a("mobile", string2);
        h2.a("displayname", string3);
        h2.a("googlename", string4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bl);
        stringBuilder.append("");
        h2.a("isverified", stringBuilder.toString());
        if (string5 != null) {
            h2.a("md5hash", string5);
        }
        if (c.a((Activity)activity)) {
            c.a((String)"https://mobondhrd.appspot.com/mtracker/register", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
            return;
        }
        a2.a();
    }

    public static void a(String string, String string2, String string3, boolean bl, com.mulo.b.a a2, Activity activity) {
        h h2 = new h();
        h2.a("tn", string);
        h2.a("u", string2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bl);
        stringBuilder.append("");
        h2.a("dec", stringBuilder.toString());
        h2.a("status", string3);
        c.a((String)"https://mobondhrd.appspot.com/mtracker/like", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
    }

    public static void a(Map<String, String> map, com.mulo.b.a a2, o o2, boolean bl) {
        c.a((String)a, map, (com.mulo.b.a)a2, (o)o2, (String)"PL", (boolean)bl);
    }

    public static void b(h h2, com.mulo.b.a a2, Activity activity) {
        if (c.a((Activity)activity)) {
            c.a((String)a, (h)h2, (com.mulo.b.a)a2, (Activity)activity);
            return;
        }
        a2.a();
    }

    public static void b(String string, com.mulo.b.a a2, Activity activity) {
        if (c.a((Activity)activity)) {
            h h2 = new h();
            h2.a("tn", string);
            c.a((String)"https://mobondhrd.appspot.com/mtracker/getvolunteers", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
            return;
        }
        a2.a();
    }

    public static void b(String string, String string2, com.mulo.b.a a2, Activity activity) {
        h h2 = new h();
        h2.a("s", string);
        h2.a("l", string2);
        c.a((String)c, (h)h2, (com.mulo.b.a)a2, (Activity)activity);
    }

    public static void c(String string, String string2, com.mulo.b.a a2, Activity activity) {
        h h2 = new h();
        h2.a("tn", string);
        h2.a("u", string2);
        h2.a("a", "remove");
        c.a((String)"https://mobondhrd.appspot.com/mtracker/managetrain", (h)h2, (com.mulo.b.a)a2, (Activity)activity);
    }
}

