/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ListView
 */
package com.mobond.mindicator.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ExpandableHeightListView
extends ListView {
    boolean a = false;

    public ExpandableHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a() {
        return this.a;
    }

    public void onMeasure(int n2, int n3) {
        if (this.a()) {
            super.onMeasure(n2, View.MeasureSpec.makeMeasureSpec((int)16777215, (int)Integer.MIN_VALUE));
            this.getLayoutParams().height = this.getMeasuredHeight();
            return;
        }
        super.onMeasure(n2, n3);
    }

    public void setExpanded(boolean bl2) {
        this.a = bl2;
    }
}

