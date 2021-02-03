/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.http.AndroidHttpClient
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.a.a.a.b
 *  com.a.a.a.c
 *  com.a.a.a.e
 *  com.a.a.a.f
 *  com.a.a.a.j
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.apache.http.client.HttpClient
 */
package com.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.a.a.a.b;
import com.a.a.a.c;
import com.a.a.a.e;
import com.a.a.a.f;
import com.a.a.a.i;
import com.a.a.a.j;
import com.a.a.h;
import com.a.a.o;
import java.io.File;
import org.apache.http.client.HttpClient;

public class r {
    public static o a(Context context) {
        return r.a(context, (b)null);
    }

    public static o a(Context context, b b2) {
        c c2;
        if (b2 == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                c2 = new c((b)new j());
            } else {
                String string;
                string = "volley/0";
                try {
                    String string2 = context.getPackageName();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(string2, 0);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("/");
                    stringBuilder.append(packageInfo.versionCode);
                    string = stringBuilder.toString();
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                c2 = new c((i)new f((HttpClient)AndroidHttpClient.newInstance((String)string)));
            }
        } else {
            c2 = new c(b2);
        }
        return r.a(context, (h)c2);
    }

    private static o a(Context context, h h2) {
        o o2 = new o((com.a.a.b)new e(new File(context.getCacheDir(), "volley")), h2);
        o2.a();
        return o2;
    }
}

