/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class g {
    public static int a(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkInfo != null) {
            if (networkInfo.getType() == 1) {
                return 1;
            }
            if (networkInfo.getType() == 0) {
                return 2;
            }
        }
        return 0;
    }

    public static int b(Context context) {
        int n2 = g.a(context);
        if (n2 == 1) {
            return 1;
        }
        int n3 = 0;
        if (n2 == 2) {
            n3 = 2;
        }
        return n3;
    }
}

