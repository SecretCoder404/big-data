/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.text.Layout
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  androidx.appcompat.widget.y
 */
package com.mobond.mindicator.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.y;

public class VerticalTextView
extends y {
    final boolean a;

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n2 = this.getGravity();
        if (Gravity.isVertical((int)n2) && (n2 & 112) == 80) {
            this.setGravity(48 | n2 & 7);
            this.a = false;
            return;
        }
        this.a = true;
    }

    protected void onDraw(Canvas canvas) {
        TextPaint textPaint = this.getPaint();
        textPaint.setColor(this.getCurrentTextColor());
        textPaint.drawableState = this.getDrawableState();
        canvas.save();
        if (this.a) {
            canvas.translate((float)this.getWidth(), 0.0f);
            canvas.rotate(90.0f);
        } else {
            canvas.translate(0.0f, (float)this.getHeight());
            canvas.rotate(-90.0f);
        }
        canvas.translate((float)this.getCompoundPaddingLeft(), (float)this.getExtendedPaddingTop());
        this.getLayout().draw(canvas);
        canvas.restore();
    }

    protected void onMeasure(int n2, int n3) {
        super.onMeasure(n3, n2);
        this.setMeasuredDimension(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
}

