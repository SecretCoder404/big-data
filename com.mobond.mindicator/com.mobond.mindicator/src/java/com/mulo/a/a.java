/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Calendar
 *  org.json.JSONObject
 */
package com.mulo.a;

import android.app.Activity;
import com.mulo.util.e;
import java.util.Calendar;
import org.json.JSONObject;

public class a {
    private static String a = "MUMBAI";
    private static String b = "NAVI MUMBAI";
    private static String c = "THANE";

    public static String a(String string, Activity activity) {
        JSONObject jSONObject = new JSONObject(new String(e.a(e.a((Object)activity, "../config.json"))).toString()).getJSONObject(string.toLowerCase());
        if (jSONObject.has("info")) {
            return jSONObject.getString("info");
        }
        return null;
    }

    public static boolean a() {
        Calendar calendar = Calendar.getInstance();
        int n2 = calendar.get(11);
        int n3 = calendar.get(9);
        boolean bl = true;
        boolean bl2 = n3 == 0;
        if (bl2) {
            if (n2 != 12 && n2 >= 5) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }
}

