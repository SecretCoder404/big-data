/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator;

import android.app.Activity;
import android.content.Context;
import com.mobond.mindicator.b;

public class a {
    public static b a(Activity activity) {
        return new b(activity.getApplicationContext());
    }

    public static b a(Context context) {
        return new b(context.getApplicationContext());
    }

    public static b b(Activity activity) {
        return new b(activity.getApplicationContext(), "irfile");
    }

    public static b b(Context context) {
        return new b(context.getApplicationContext(), "irfile");
    }
}

