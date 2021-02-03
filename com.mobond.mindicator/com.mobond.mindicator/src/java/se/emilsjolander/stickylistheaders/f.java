/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  java.lang.NullPointerException
 *  java.lang.String
 */
package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class f
extends ViewGroup {
    View a;
    Drawable b;
    int c;
    View d;
    int e;

    f(Context context) {
        super(context);
    }

    void a(View view, View view2, Drawable drawable, int n2) {
        if (view != null) {
            View view3;
            View view4 = this.a;
            if (view4 != view) {
                this.removeView(view4);
                this.a = view;
                ViewParent viewParent = view.getParent();
                if (viewParent != null && viewParent != this && viewParent instanceof ViewGroup) {
                    ((ViewGroup)viewParent).removeView(view);
                }
                this.addView(view);
            }
            if ((view3 = this.d) != view2) {
                if (view3 != null) {
                    this.removeView(view3);
                }
                this.d = view2;
                if (view2 != null) {
                    this.addView(view2);
                }
            }
            if (this.b != drawable) {
                this.b = drawable;
                this.c = n2;
                this.invalidate();
            }
            return;
        }
        throw new NullPointerException("List view item must not be null.");
    }

    public boolean a() {
        return this.d != null;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d == null && this.b != null && this.a.getVisibility() != 8) {
            if (Build.VERSION.SDK_INT < 11) {
                canvas.clipRect(0, 0, this.getWidth(), this.c);
            }
            this.b.draw(canvas);
        }
    }

    public View getHeader() {
        return this.d;
    }

    public View getItem() {
        return this.a;
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        int n6 = this.getWidth();
        int n7 = this.getHeight();
        View view = this.d;
        if (view != null) {
            int n8 = view.getMeasuredHeight();
            this.d.layout(0, 0, n6, n8);
            this.e = n8;
            this.a.layout(0, n8, n6, n7);
            return;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            int n9;
            drawable.setBounds(0, 0, n6, this.c);
            this.e = n9 = this.c;
            this.a.layout(0, n9, n6, n7);
            return;
        }
        this.e = 0;
        this.a.layout(0, 0, n6, n7);
    }

    protected void onMeasure(int n2, int n3) {
        int n4;
        int n5 = View.MeasureSpec.getSize((int)n2);
        int n6 = View.MeasureSpec.makeMeasureSpec((int)n5, (int)1073741824);
        View view = this.d;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height > 0) {
                this.d.measure(n6, View.MeasureSpec.makeMeasureSpec((int)layoutParams.height, (int)1073741824));
            } else {
                this.d.measure(n6, View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
            }
            n4 = 0 + this.d.getMeasuredHeight();
        } else {
            n4 = this.b != null && this.a.getVisibility() != 8 ? 0 + this.c : 0;
        }
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (this.a.getVisibility() == 8) {
            this.a.measure(n6, View.MeasureSpec.makeMeasureSpec((int)0, (int)1073741824));
        } else if (layoutParams != null && layoutParams.height >= 0) {
            this.a.measure(n6, View.MeasureSpec.makeMeasureSpec((int)layoutParams.height, (int)1073741824));
            n4 += this.a.getMeasuredHeight();
        } else {
            this.a.measure(n6, View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
            n4 += this.a.getMeasuredHeight();
        }
        this.setMeasuredDimension(n5, n4);
    }
}

