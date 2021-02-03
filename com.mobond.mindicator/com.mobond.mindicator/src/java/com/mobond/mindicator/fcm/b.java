/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.d.e
 *  com.google.android.gms.d.k
 *  com.google.firebase.messaging.FirebaseMessaging
 *  com.mobond.mindicator.fcm.b$1
 *  com.mobond.mindicator.fcm.b$2
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.fcm;

import android.content.Context;
import com.google.android.gms.d.e;
import com.google.android.gms.d.k;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.fcm.b;

public class b {
    public static void a(String string) {
        if (string.equals((Object)"global")) {
            FirebaseMessaging.a().a(string);
            return;
        }
        com.mobond.mindicator.b b2 = new com.mobond.mindicator.b(ConfigurationManager.b().getApplicationContext());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("topic_");
        stringBuilder.append(string);
        String string2 = stringBuilder.toString();
        if (!b2.a(string2, false)) {
            FirebaseMessaging.a().a(string).a((e)new 1(b2, string2));
        }
    }

    public static void b(String string) {
        FirebaseMessaging.a().b(string).a((e)new 2(string));
    }
}

