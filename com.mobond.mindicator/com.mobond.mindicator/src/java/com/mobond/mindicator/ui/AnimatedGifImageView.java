/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Movie
 *  android.graphics.Paint
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  androidx.appcompat.widget.p
 *  java.io.InputStream
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.p;
import com.mobond.mindicator.ui.AnimatedGifImageView;
import java.io.InputStream;

public class AnimatedGifImageView
extends p {
    boolean a = false;
    Paint b;
    private InputStream c = null;
    private Movie d = null;
    private long e = 0L;
    private a f = a.a;
    private float g = 1.0f;
    private float h = 1.0f;
    private int i;
    private int j;
    private float k;
    private float l;

    public AnimatedGifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(byte[] arrby, a a2) {
        this.setImageBitmap(null);
        if (Build.VERSION.SDK_INT >= 11) {
            this.setLayerType(1, null);
        }
        this.f = a2;
        this.a = true;
        try {
            this.d = Movie.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.b = new Paint();
    }

    @SuppressLint(value={"WrongConstant"})
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a) {
            long l2 = SystemClock.uptimeMillis();
            if (this.e == 0L) {
                this.e = l2;
            }
            if (this.d != null) {
                this.b.setAntiAlias(true);
                int n2 = this.d.duration();
                if (n2 == 0) {
                    n2 = 1000;
                }
                int n3 = (int)((l2 - this.e) % (long)n2);
                this.d.setTime(n3);
                canvas.save();
                canvas.scale(this.h, this.g);
                this.d.draw(canvas, this.k / this.h, this.l / this.g);
                canvas.restore();
                this.invalidate();
            }
        }
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        this.k = (float)(this.getWidth() - this.i) / 2.0f;
        this.l = (float)(this.getHeight() - this.j) / 2.0f;
    }

    protected void onMeasure(int n2, int n3) {
        Movie movie = this.d;
        if (movie != null) {
            int n4;
            int n5;
            int n6 = movie.width();
            int n7 = this.d.height();
            float f2 = View.MeasureSpec.getMode((int)n2) != 0 ? (n6 > (n5 = View.MeasureSpec.getSize((int)n2)) ? (float)n6 / (float)n5 : (float)n5 / (float)n6) : 1.0f;
            float f3 = View.MeasureSpec.getMode((int)n3) != 0 ? (n7 > (n4 = View.MeasureSpec.getSize((int)n3)) ? (float)n7 / (float)n4 : (float)n4 / (float)n7) : 1.0f;
            switch (1.a[this.f.ordinal()]) {
                default: {
                    break;
                }
                case 3: {
                    this.g = f3;
                    this.h = f2;
                    break;
                }
                case 2: {
                    this.h = 1.0f;
                    this.g = 1.0f;
                    break;
                }
                case 1: {
                    float f4;
                    this.h = f4 = Math.min((float)f3, (float)f2);
                    this.g = f4;
                }
            }
            float f5 = n6;
            float f6 = this.h;
            this.i = (int)(f5 * f6);
            this.j = (int)(f6 * (float)n7);
            this.g = f6;
            this.setMeasuredDimension(this.i, this.j);
            return;
        }
        this.setMeasuredDimension(this.getSuggestedMinimumWidth(), this.getSuggestedMinimumHeight());
    }

    public void setImageDrawable(Drawable drawable) {
        this.setMeasuredDimension(drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.a = false;
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int n2) {
        this.a = false;
        super.setImageResource(n2);
    }

    public void setImageURI(Uri uri) {
        this.a = false;
        super.setImageURI(uri);
    }

}

