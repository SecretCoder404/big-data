/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Picture
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.HorizontalScrollView
 *  com.mobond.mindicator.ui.PictureUI$1
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Picture;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.mobond.mindicator.ui.PictureUI;

public class PictureUI
extends Activity {
    public static Picture a;
    public static String b;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493155);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView)this.findViewById(2131296261);
        1 var3_3 = new 1(this, (Context)this);
        var3_3.setScrollContainer(true);
        var3_3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        var3_3.setAdjustViewBounds(true);
        horizontalScrollView.addView((View)var3_3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Saved Page: ");
        stringBuilder.append(b);
        this.setTitle((CharSequence)stringBuilder.toString());
    }
}

