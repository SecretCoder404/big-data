/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  androidx.appcompat.app.e
 *  androidx.core.app.a
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.e;
import androidx.core.app.a;

public class OpenPlayStoreActivity
extends e {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492980);
        if (this.getIntent().hasExtra("package_name")) {
            String string = this.getIntent().getExtras().getString("package_name");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("market://details?id=");
            stringBuilder.append(string);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString()));
            intent.addFlags(67108864);
            this.startActivity(intent);
            if (Build.VERSION.SDK_INT >= 16) {
                this.finishAffinity();
                return;
            }
            a.a((Activity)this);
        }
    }
}

