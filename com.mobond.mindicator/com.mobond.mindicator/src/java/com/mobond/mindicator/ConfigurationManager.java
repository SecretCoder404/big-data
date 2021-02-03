/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Environment
 *  android.util.Log
 *  androidx.i.b
 *  com.facebook.ads.AudienceNetworkAds
 *  com.google.android.gms.ads.l
 *  com.google.firebase.FirebaseApp
 *  com.google.firebase.analytics.FirebaseAnalytics
 *  java.io.File
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.mobond.mindicator;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import androidx.i.b;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.l;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.util.h;
import com.mulo.util.e;
import java.io.File;

public class ConfigurationManager
extends b {
    public static final String[] a = new String[]{"mumbai", "pune"};
    private static FirebaseAnalytics c;
    private static String d;
    private static String e;
    private static ConfigurationManager f;
    public boolean b = false;

    public static String a() {
        return "http://mobondhrd.appspot.com/getnewsalerts?";
    }

    public static String a(Context context) {
        if (ConfigurationManager.a(true, context)) {
            return context.getExternalFilesDir(null).getAbsolutePath();
        }
        return context.getFilesDir().getAbsolutePath();
    }

    public static void a(Context context, String string) {
        a.a(context).b("city", string.toLowerCase());
        e = null;
        d = null;
        ConfigurationManager.b(context);
        ConfigurationManager.c(context);
    }

    public static void a(Context context, String string, String string2, String string3) {
        ConfigurationManager.a(context, string, string2, string3, null);
    }

    public static void a(Context context, String string, String string2, String string3, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("action", string2.toUpperCase());
        bundle.putString("label", string3.toUpperCase());
        if (c == null) {
            c = FirebaseAnalytics.getInstance((Context)context);
        }
        c.a(string, bundle);
    }

    private static boolean a(String string) {
        File file = new File(string);
        if (!file.isDirectory() && !file.mkdirs()) {
            return false;
        }
        return file.canWrite();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(boolean bl2, Context context) {
        String string;
        block4 : {
            string = Environment.getExternalStorageState();
            if (!"mounted".equals((Object)string)) break block4;
            if (!bl2) return true;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("2222 mContext: 11 ");
            stringBuilder.append((Object)context);
            Log.d((String)"2222", (String)stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("2222 mContext 22: ");
            stringBuilder2.append(context.getExternalFilesDir(null).getAbsolutePath());
            Log.d((String)"2222", (String)stringBuilder2.toString());
            return ConfigurationManager.a(context.getExternalFilesDir(null).getAbsolutePath());
        }
        if (bl2) return false;
        try {
            boolean bl3 = "mounted_ro".equals((Object)string);
            if (!bl3) return false;
            return true;
        }
        catch (Exception exception) {
            Log.d((String)"1111", (String)"1111 Exception in hasExternalStorage", (Throwable)exception);
        }
        return false;
    }

    public static ConfigurationManager b() {
        Class<ConfigurationManager> class_ = ConfigurationManager.class;
        synchronized (ConfigurationManager.class) {
            ConfigurationManager configurationManager = f;
            // ** MonitorExit[var2] (shouldn't be in output)
            return configurationManager;
        }
    }

    public static String b(Context context) {
        if (e == null) {
            e = a.a(context).A();
        }
        return e;
    }

    public static String c(Context context) {
        if (d == null) {
            e = a.a(context).A();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" - ");
            stringBuilder.append(g.a(e.a(e, new char[]{' '}), g.a));
            d = stringBuilder.toString();
        }
        return d;
    }

    public static void d(Context context) {
        a.a(context).b("city", "mumbai");
        e = null;
        d = null;
        ConfigurationManager.b(context);
        ConfigurationManager.c(context);
    }

    public void onCreate() {
        super.onCreate();
        FirebaseApp.a((Context)this);
        h.a("mobond");
        AudienceNetworkAds.initialize((Context)this);
        f = this;
        c = FirebaseAnalytics.getInstance((Context)this);
        l.a((Context)this.getApplicationContext(), (String)"ca-app-pub-5449278086868932~6478573643");
    }
}

