/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.exhibition;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.alert.News;
import com.mobond.mindicator.ui.multicity.Multicity_home;
import com.mobond.mindicator.ui.multicity.a;

public class ExhibitionActivity
extends News {
    public Activity s;

    @Override
    protected void onCreate(Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://mobondhrd.appspot.com/getexhibitionlist?city=");
        stringBuilder.append(ConfigurationManager.b((Context)this));
        this.a(stringBuilder.toString());
        this.b("Loading Exhibitions...");
        super.onCreate(bundle);
        this.c("Exhibitions");
        this.b();
        this.s = this;
        this.c(2131230834);
    }

    @Override
    public void onShareAlertNewsClicked(View view) {
        a.a((Context)this.s, "MULTICITY_EXHIBITION", "EXHIBITION_WHATSAPP_SHARE", "EXHIBITION");
        Multicity_home.onShareAlertNewsClickedStatic(view);
    }
}

