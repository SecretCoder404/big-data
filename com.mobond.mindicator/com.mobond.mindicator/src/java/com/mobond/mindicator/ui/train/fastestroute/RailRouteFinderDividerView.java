/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.DashPathEffect
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PathEffect
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.mobond.mindicator.ui.train.fastestroute;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.view.View;
import com.mobond.mindicator.i;

public class RailRouteFinderDividerView
extends View {
    public static int a = 0;
    public static int b = 1;
    private Paint c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public RailRouteFinderDividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, i.a.RailRouteFinderDividerView, 0, 0);
        this.e = typedArray.getDimensionPixelSize(1, 5);
        this.f = typedArray.getDimensionPixelSize(2, 10);
        this.g = typedArray.getDimensionPixelSize(3, 3);
        this.h = typedArray.getColor(0, -16777216);
        this.d = typedArray.getInt(4, a);
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setColor(this.h);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth((float)this.g);
        Paint paint = this.c;
        float[] arrf = new float[]{this.f, this.e};
        paint.setPathEffect((PathEffect)new DashPathEffect(arrf, 0.0f));
        return;
        finally {
            typedArray.recycle();
        }
    }

    public int getDashGap() {
        return this.e;
    }

    protected void onDraw(Canvas canvas) {
        if (this.d == a) {
            this.getHeight();
            canvas.drawPaint(this.c);
            return;
        }
        this.getWidth();
        canvas.drawPaint(this.c);
    }

    public void setDashGap(float f2) {
        this.e = (int)f2;
        this.refreshDrawableState();
    }

    public void setViewColor(int n2) {
        this.h = n2;
        this.c.setColor(n2);
    }
}

