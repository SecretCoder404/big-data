/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package com.mobond.mindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.mobond.mindicator.b;
import java.util.Locale;

public class f {
    public static Context a(Context context) {
        String string = new b(context).c(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lang: ");
        stringBuilder.append(string);
        Log.d((String)"5555", (String)stringBuilder.toString());
        if (string == null) {
            string = "en";
        }
        return f.a(context, string);
    }

    private static Context a(Context context, String string) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f.b(context, string);
        }
        return f.c(context, string);
    }

    @TargetApi(value=24)
    private static Context b(Context context, String string) {
        Locale locale = new Locale(string);
        Locale.setDefault((Locale)locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android n locale: ");
        stringBuilder.append(string);
        Log.d((String)"base_context", (String)stringBuilder.toString());
        return context.createConfigurationContext(configuration);
    }

    private static Context c(Context context, String string) {
        Locale locale = new Locale(string);
        Locale.setDefault((Locale)locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLayoutDirection(locale);
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }
}

