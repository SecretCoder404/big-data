/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Matrix$ScaleToFit
 *  android.graphics.PointF
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  androidx.appcompat.widget.p
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Queue
 */
package com.mobond.mindicator.ui.train;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.p;
import com.mobond.mindicator.ui.train.PinchImageView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PinchImageView
extends p {
    private View.OnClickListener a;
    private View.OnLongClickListener b;
    private Matrix c = new Matrix();
    private RectF d;
    private int e = 0;
    private List<e> f;
    private List<e> g;
    private int h;
    private PointF i = new PointF();
    private PointF j = new PointF();
    private float k = 0.0f;
    private g l;
    private a m;
    private GestureDetector n = new GestureDetector(this.getContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this){
        final /* synthetic */ PinchImageView a;
        {
            this.a = pinchImageView;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!(PinchImageView.a(this.a) != 1 || PinchImageView.b(this.a) != null && PinchImageView.b(this.a).isRunning())) {
                PinchImageView.b(this.a, motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!(PinchImageView.a(this.a) != 0 || PinchImageView.b(this.a) != null && PinchImageView.b(this.a).isRunning())) {
                PinchImageView.a(this.a, f2, f3);
            }
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (PinchImageView.c(this.a) != null) {
                PinchImageView.c(this.a).onLongClick((View)this.a);
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PinchImageView.d(this.a) != null) {
                PinchImageView.d(this.a).onClick((View)this.a);
            }
            return true;
        }
    });

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b();
    }

    static /* synthetic */ int a(PinchImageView pinchImageView) {
        return pinchImageView.e;
    }

    private void a() {
        List<e> list;
        List<e> list2 = this.f;
        if (list2 == null) {
            return;
        }
        this.h = 1 + this.h;
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            (iterator.next()).a(this);
        }
        this.h = -1 + this.h;
        if (this.h == 0 && (list = this.g) != null) {
            this.f = list;
            this.g = null;
        }
    }

    private void a(float f2, float f3, float f4, float f5) {
        this.k = b.c(this.c)[0] / b.b(f2, f3, f4, f5);
        float[] arrf = b.a(b.c(f2, f3, f4, f5), this.c);
        this.j.set(arrf[0], arrf[1]);
    }

    private void a(PointF pointF, float f2, float f3, PointF pointF2) {
        if (!this.c()) {
            return;
        }
        float f4 = f2 * f3;
        Matrix matrix = b.a();
        matrix.postScale(f4, f4, pointF.x, pointF.y);
        matrix.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
        this.c.set(matrix);
        b.b(matrix);
        this.a();
        this.invalidate();
    }

    static /* synthetic */ void a(PinchImageView pinchImageView, float f2, float f3) {
        pinchImageView.d(f2, f3);
    }

    static /* synthetic */ g b(PinchImageView pinchImageView) {
        return pinchImageView.l;
    }

    private void b() {
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    static /* synthetic */ void b(PinchImageView pinchImageView, float f2, float f3) {
        pinchImageView.c(f2, f3);
    }

    private boolean b(float f2, float f3) {
        if (!this.c()) {
            return false;
        }
        RectF rectF = b.b();
        this.a(rectF);
        float f4 = this.getWidth();
        float f5 = this.getHeight();
        if (rectF.right - rectF.left < f4) {
            f2 = 0.0f;
        } else if (f2 + rectF.left > 0.0f) {
            f2 = rectF.left < 0.0f ? -rectF.left : 0.0f;
        } else if (f2 + rectF.right < f4) {
            f2 = rectF.right > f4 ? f4 - rectF.right : 0.0f;
        }
        if (rectF.bottom - rectF.top < f5) {
            f3 = 0.0f;
        } else if (f3 + rectF.top > 0.0f) {
            f3 = rectF.top < 0.0f ? -rectF.top : 0.0f;
        } else if (f3 + rectF.bottom < f5) {
            f3 = rectF.bottom > f5 ? f5 - rectF.bottom : 0.0f;
        }
        b.a(rectF);
        this.c.postTranslate(f2, f3);
        this.a();
        this.invalidate();
        return f2 != 0.0f || f3 != 0.0f;
        {
        }
    }

    static /* synthetic */ View.OnLongClickListener c(PinchImageView pinchImageView) {
        return pinchImageView.b;
    }

    private void c(float f2, float f3) {
        float f4;
        if (!this.c()) {
            return;
        }
        Matrix matrix = b.a();
        this.a(matrix);
        float f5 = b.c(matrix)[0];
        float f6 = b.c(this.c)[0];
        float f7 = f5 * f6;
        float f8 = this.getWidth();
        float f9 = this.getHeight();
        float f10 = this.getMaxScale();
        float f11 = this.a(f5, f6);
        if (f11 > f10) {
            f11 = f10;
        }
        if (!(f11 < f5)) {
            f5 = f11;
        }
        Matrix matrix2 = b.a(this.c);
        float f12 = f5 / f7;
        matrix2.postScale(f12, f12, f2, f3);
        float f13 = f8 / 2.0f;
        float f14 = f13 - f2;
        float f15 = f9 / 2.0f;
        matrix2.postTranslate(f14, f15 - f3);
        Matrix matrix3 = b.a(matrix);
        matrix3.postConcat(matrix2);
        RectF rectF = b.a(0.0f, 0.0f, this.getDrawable().getIntrinsicWidth(), this.getDrawable().getIntrinsicHeight());
        matrix3.mapRect(rectF);
        float f16 = rectF.right - rectF.left < f8 ? f13 - (rectF.right + rectF.left) / 2.0f : (rectF.left > 0.0f ? -rectF.left : (rectF.right < f8 ? f8 - rectF.right : 0.0f));
        if (rectF.bottom - rectF.top < f9) {
            f4 = f15 - (rectF.bottom + rectF.top) / 2.0f;
        } else if (rectF.top > 0.0f) {
            f4 = -rectF.top;
        } else {
            float f17 = rectF.bottom FCMPG f9;
            f4 = 0.0f;
            if (f17 < 0) {
                f4 = f9 - rectF.bottom;
            }
        }
        matrix2.postTranslate(f16, f4);
        this.e();
        this.l = new ValueAnimator.AnimatorUpdateListener(this.c, matrix2){
            private float[] b = new float[9];
            private float[] c = new float[9];
            private float[] d = new float[9];
            {
                this(matrix, matrix2, 200L);
            }
            {
                this.setFloatValues(new float[]{0.0f, 1.0f});
                this.setDuration(l2);
                this.addUpdateListener((ValueAnimator.AnimatorUpdateListener)this);
                matrix.getValues(this.b);
                matrix2.getValues(this.c);
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f2 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                for (int i2 = 0; i2 < 9; ++i2) {
                    float[] arrf = this.d;
                    float[] arrf2 = this.b;
                    arrf[i2] = arrf2[i2] + f2 * (this.c[i2] - arrf2[i2]);
                }
                PinchImageView.this.c.setValues(this.d);
                PinchImageView.this.a();
                PinchImageView.this.invalidate();
            }
        };
        this.l.start();
        b.a(rectF);
        b.b(matrix3);
        b.b(matrix2);
        b.b(matrix);
    }

    private boolean c() {
        return this.getDrawable() != null && this.getDrawable().getIntrinsicWidth() > 0 && this.getDrawable().getIntrinsicHeight() > 0 && this.getWidth() > 0 && this.getHeight() > 0;
    }

    static /* synthetic */ View.OnClickListener d(PinchImageView pinchImageView) {
        return pinchImageView.a;
    }

    private void d() {
        if (!this.c()) {
            return;
        }
        Matrix matrix = b.a();
        this.b(matrix);
        float f2 = b.c(matrix)[0];
        float f3 = b.c(this.c)[0];
        float f4 = this.getWidth();
        float f5 = this.getHeight();
        float f6 = this.getMaxScale();
        float f7 = f2 > f6 ? f6 / f2 : 1.0f;
        if (f3 * f7 < 1.0f) {
            f7 = 1.0f / f3;
        }
        float f8 = f7 FCMPL 1.0f;
        boolean bl = false;
        if (f8 != false) {
            bl = true;
        }
        Matrix matrix2 = b.a(matrix);
        matrix2.postScale(f7, f7, this.i.x, this.i.y);
        RectF rectF = b.a(0.0f, 0.0f, this.getDrawable().getIntrinsicWidth(), this.getDrawable().getIntrinsicHeight());
        matrix2.mapRect(rectF);
        float f9 = rectF.right - rectF.left < f4 ? f4 / 2.0f - (rectF.right + rectF.left) / 2.0f : (rectF.left > 0.0f ? -rectF.left : (rectF.right < f4 ? f4 - rectF.right : 0.0f));
        float f10 = rectF.bottom - rectF.top < f5 ? f5 / 2.0f - (rectF.bottom + rectF.top) / 2.0f : (rectF.top > 0.0f ? -rectF.top : (rectF.bottom < f5 ? f5 - rectF.bottom : 0.0f));
        if (f9 != 0.0f || f10 != 0.0f) {
            bl = true;
        }
        if (bl) {
            Matrix matrix3 = b.a(this.c);
            matrix3.postScale(f7, f7, this.i.x, this.i.y);
            matrix3.postTranslate(f9, f10);
            this.e();
            this.l = new /* invalid duplicate definition of identical inner class */;
            this.l.start();
            b.b(matrix3);
        }
        b.a(rectF);
        b.b(matrix2);
        b.b(matrix);
    }

    private void d(float f2, float f3) {
        if (!this.c()) {
            return;
        }
        this.e();
        this.m = new ValueAnimator.AnimatorUpdateListener(f2 / 60.0f, f3 / 60.0f){
            private float[] b;
            {
                this.setFloatValues(new float[]{0.0f, 1.0f});
                this.setDuration(1000000L);
                this.addUpdateListener((ValueAnimator.AnimatorUpdateListener)this);
                this.b = new float[]{f2, f3};
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinchImageView pinchImageView = PinchImageView.this;
                float[] arrf = this.b;
                boolean bl = pinchImageView.b(arrf[0], arrf[1]);
                float[] arrf2 = this.b;
                arrf2[0] = 0.9f * arrf2[0];
                arrf2[1] = 0.9f * arrf2[1];
                if (!bl || b.b(0.0f, 0.0f, arrf2[0], arrf2[1]) < 1.0f) {
                    valueAnimator.cancel();
                }
            }
        };
        this.m.start();
    }

    private void e() {
        a a2;
        g g2 = this.l;
        if (g2 != null) {
            g2.cancel();
            this.l = null;
        }
        if ((a2 = this.m) != null) {
            a2.cancel();
            this.m = null;
        }
    }

    protected float a(float f2, float f3) {
        if (f3 * f2 < 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    public Matrix a(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (this.c()) {
            RectF rectF = b.a(0.0f, 0.0f, this.getDrawable().getIntrinsicWidth(), this.getDrawable().getIntrinsicHeight());
            RectF rectF2 = b.a(0.0f, 0.0f, this.getWidth(), this.getHeight());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            b.a(rectF2);
            b.a(rectF);
        }
        return matrix;
    }

    public RectF a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!this.c()) {
            return rectF;
        }
        Matrix matrix = b.a();
        this.b(matrix);
        rectF.set(0.0f, 0.0f, (float)this.getDrawable().getIntrinsicWidth(), (float)this.getDrawable().getIntrinsicHeight());
        matrix.mapRect(rectF);
        b.b(matrix);
        return rectF;
    }

    public Matrix b(Matrix matrix) {
        Matrix matrix2 = this.a(matrix);
        matrix2.postConcat(this.c);
        return matrix2;
    }

    public boolean canScrollHorizontally(int n2) {
        if (this.e == 2) {
            return true;
        }
        RectF rectF = this.a((RectF)null);
        if (rectF == null) {
            return false;
        }
        if (rectF.isEmpty()) {
            return false;
        }
        if (n2 > 0) {
            return rectF.right > (float)this.getWidth();
        }
        return rectF.left < 0.0f;
    }

    public boolean canScrollVertically(int n2) {
        if (this.e == 2) {
            return true;
        }
        RectF rectF = this.a((RectF)null);
        if (rectF == null) {
            return false;
        }
        if (rectF.isEmpty()) {
            return false;
        }
        if (n2 > 0) {
            return rectF.bottom > (float)this.getHeight();
        }
        return rectF.top < 0.0f;
    }

    public RectF getMask() {
        RectF rectF = this.d;
        if (rectF != null) {
            return new RectF(rectF);
        }
        return null;
    }

    protected float getMaxScale() {
        return 1.0f;
    }

    public int getPinchMode() {
        return this.e;
    }

    protected void onDraw(Canvas canvas) {
        if (this.c()) {
            Matrix matrix = b.a();
            this.setImageMatrix(this.b(matrix));
            b.b(matrix);
        }
        if (this.d != null) {
            canvas.save();
            canvas.clipRect(this.d);
            super.onDraw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        int n2 = 255 & motionEvent.getAction();
        if (n2 != 1 && n2 != 3) {
            g g2;
            if (n2 == 6) {
                if (this.e == 2 && motionEvent.getPointerCount() > 2) {
                    if (motionEvent.getAction() >> 8 == 0) {
                        this.a(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                    } else if (motionEvent.getAction() >> 8 == 1) {
                        this.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                    }
                }
            } else if (n2 == 0) {
                g g3 = this.l;
                if (g3 == null || !g3.isRunning()) {
                    this.e();
                    this.e = 1;
                    this.i.set(motionEvent.getX(), motionEvent.getY());
                }
            } else if (n2 == 5) {
                this.e();
                this.e = 2;
                this.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            } else if (!(n2 != 2 || (g2 = this.l) != null && g2.isRunning())) {
                int n3 = this.e;
                if (n3 == 1) {
                    this.b(motionEvent.getX() - this.i.x, motionEvent.getY() - this.i.y);
                    this.i.set(motionEvent.getX(), motionEvent.getY());
                } else if (n3 == 2 && motionEvent.getPointerCount() > 1) {
                    float f2 = b.b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                    float[] arrf = b.c(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                    this.i.set(arrf[0], arrf[1]);
                    this.a(this.j, this.k, f2, this.i);
                }
            }
        } else {
            if (this.e == 2) {
                this.d();
            }
            this.e = 0;
        }
        this.n.onTouchEvent(motionEvent);
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b = onLongClickListener;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

}

