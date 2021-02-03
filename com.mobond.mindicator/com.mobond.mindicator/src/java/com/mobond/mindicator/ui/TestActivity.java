/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  com.mobond.mindicator.ui.TestActivity$1
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mobond.mindicator.ui.TestActivity;

public class TestActivity
extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        1 var2_2 = new 1(this, (Context)this);
        var2_2.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2, 1.0f));
        var2_2.setInputType(524288);
        this.setContentView((View)var2_2);
    }
}

