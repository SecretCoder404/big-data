/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.LinearLayout
 *  com.mobond.mindicator.ui.indianrail.util.views.a$a
 *  java.lang.Math
 *  java.lang.Object
 */
package com.mobond.mindicator.ui.indianrail.util.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.mobond.mindicator.ui.indianrail.util.views.SlidingTabLayout;
import com.mobond.mindicator.ui.indianrail.util.views.a;

/*
 * Exception performing whole class analysis.
 */
class a
extends LinearLayout {
    private final int a;
    private final Paint b;
    private final int c;
    private final Paint d;
    private final int e;
    private final Paint f;
    private final float g;
    private final a h;
    private int i;
    private float j;
    private SlidingTabLayout.c k;

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setWillNotDraw(false);
        int n2 = context.getResources().getColor(2131099879);
        float f2 = this.getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int n3 = typedValue.data;
        this.e = a.a(n3, (byte)38);
        this.h = new /* Unavailable Anonymous Inner Class!! */;
        this.h.a(new int[]{n2});
        a a2 = this.h;
        int[] arrn = new int[]{a.a(n3, (byte)32)};
        a2.b(arrn);
        this.a = (int)(2.0f * f2);
        this.b = new Paint();
        this.b.setColor(this.e);
        this.c = (int)(4.0f * f2);
        this.d = new Paint();
        this.g = 0.5f;
        this.f = new Paint();
        this.f.setStrokeWidth((float)((int)(f2 * 1.0f)));
    }

    private static int a(int n2, byte by) {
        return Color.argb((int)by, (int)Color.red((int)n2), (int)Color.green((int)n2), (int)Color.blue((int)n2));
    }

    private static int a(int n2, int n3, float f2) {
        float f3 = 1.0f - f2;
        float f4 = f2 * (float)Color.red((int)n2) + f3 * (float)Color.red((int)n3);
        float f5 = f2 * (float)Color.green((int)n2) + f3 * (float)Color.green((int)n3);
        float f6 = f2 * (float)Color.blue((int)n2) + f3 * (float)Color.blue((int)n3);
        return Color.rgb((int)((int)f4), (int)((int)f5), (int)((int)f6));
    }

    void a(int n2, float f2) {
        this.i = n2;
        this.j = f2;
        this.invalidate();
    }

    void a(SlidingTabLayout.c c2) {
        this.k = c2;
        this.invalidate();
    }

    /* varargs */ void a(int ... arrn) {
        this.k = null;
        this.h.a(arrn);
        this.invalidate();
    }

    /* varargs */ void b(int ... arrn) {
        this.k = null;
        this.h.b(arrn);
        this.invalidate();
    }

    protected void onDraw(Canvas canvas) {
        int n2 = this.getHeight();
        int n3 = this.getChildCount();
        float f2 = Math.min((float)Math.max((float)0.0f, (float)this.g), (float)1.0f);
        float f3 = n2;
        int n4 = (int)(f2 * f3);
        SlidingTabLayout.c c2 = this.k;
        if (c2 == null) {
            c2 = this.h;
        }
        SlidingTabLayout.c c3 = c2;
        if (n3 > 0) {
            View view = this.getChildAt(this.i);
            int n5 = view.getLeft();
            int n6 = view.getRight();
            int n7 = c3.a(this.i);
            if (this.j > 0.0f && this.i < -1 + this.getChildCount()) {
                int n8 = c3.a(1 + this.i);
                if (n7 != n8) {
                    n7 = a.a(n8, n7, this.j);
                }
                View view2 = this.getChildAt(1 + this.i);
                float f4 = this.j * (float)view2.getLeft();
                float f5 = this.j;
                n5 = (int)(f4 + (1.0f - f5) * (float)n5);
                n6 = (int)(f5 * (float)view2.getRight() + (1.0f - this.j) * (float)n6);
            }
            this.d.setColor(n7);
            canvas.drawRect((float)n5, (float)(n2 - this.c), (float)n6, f3, this.d);
        }
        canvas.drawRect(0.0f, (float)(n2 - this.a), (float)this.getWidth(), f3, this.b);
        int n9 = (n2 - n4) / 2;
        for (int i2 = 0; i2 < n3 - 1; ++i2) {
            View view = this.getChildAt(i2);
            this.f.setColor(c3.b(i2));
            canvas.drawLine((float)view.getRight(), (float)n9, (float)view.getRight(), (float)(n9 + n4), this.f);
        }
    }

}

