/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.mobond.mindicator.ui.lt;

import android.content.Context;
import android.content.SharedPreferences;

public class a {
    public static void a(String string, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences("removed_trains_from_ui", 0).edit();
        editor.putLong(string, System.currentTimeMillis());
        editor.apply();
    }

    public static boolean b(String string, Context context) {
        long l2 = context.getSharedPreferences("removed_trains_from_ui", 0).getLong(string, 0L);
        if (l2 != 0L) {
            return System.currentTimeMillis() - l2 <= 1800000L;
        }
        return false;
    }
}

