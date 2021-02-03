/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.amazon.device.ads.cg
 *  com.amazon.device.ads.dc$1
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Void
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.amazon.device.ads.bg;
import com.amazon.device.ads.cg;
import com.amazon.device.ads.ci;
import com.amazon.device.ads.cq;
import com.amazon.device.ads.dc;
import com.amazon.device.ads.dp;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.f;

class dc {
    private ImageView a;
    private ViewGroup b;
    private ViewGroup c;
    private final ViewGroup d;
    private final f e;
    private final ej.k f;
    private final cq g;
    private final ci h;
    private boolean i = false;

    public dc(ViewGroup viewGroup, f f2) {
        this(viewGroup, f2, ej.a(), new cq(), (ci)new cg());
    }

    dc(ViewGroup viewGroup, f f2, ej.k k2, cq cq2, ci ci2) {
        this.d = viewGroup;
        this.e = f2;
        this.f = k2;
        this.g = cq2;
        this.h = ci2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n2) {
        boolean bl2;
        dc dc2 = this;
        synchronized (dc2) {
            if (this.b != null) return;
            this.b = this.g.a(this.b(), cq.a.a, "nativeCloseButton");
            this.a = this.h.b(this.b(), "nativeCloseButtonImage");
            bl2 = true;
        }
        if (!bl2) return;
        final BitmapDrawable bitmapDrawable = this.h.a(this.b().getResources(), bg.a().a("amazon_ads_close_normal.png"));
        final BitmapDrawable bitmapDrawable2 = this.h.a(this.b().getResources(), bg.a().a("amazon_ads_close_pressed.png"));
        this.a.setImageDrawable((Drawable)bitmapDrawable);
        this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.a.setBackgroundDrawable(null);
        View.OnClickListener onClickListener = new View.OnClickListener(){

            public void onClick(View view) {
                dc.this.c();
            }
        };
        this.a.setOnClickListener(onClickListener);
        this.b.setOnClickListener(onClickListener);
        View.OnTouchListener onTouchListener = new View.OnTouchListener(){

            @SuppressLint(value={"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                dc.this.a(motionEvent, bitmapDrawable, bitmapDrawable2);
                return false;
            }
        };
        this.b.setOnTouchListener(onTouchListener);
        this.a.setOnTouchListener(onTouchListener);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n2, n2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.c = this.g.a(this.b(), cq.a.a, "nativeCloseButtonContainer");
        this.c.addView((View)this.b, (ViewGroup.LayoutParams)layoutParams);
    }

    private void a(MotionEvent motionEvent, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        switch (motionEvent.getAction()) {
            default: {
                return;
            }
            case 1: {
                this.a.setImageDrawable((Drawable)bitmapDrawable);
                return;
            }
            case 0: 
        }
        this.a.setImageDrawable((Drawable)bitmapDrawable2);
    }

    static /* synthetic */ void a(dc dc2, int n2) {
        dc2.a(n2);
    }

    static /* synthetic */ void a(dc dc2, boolean bl2, dp dp2, int n2, int n3) {
        dc2.a(bl2, dp2, n2, n3);
    }

    @SuppressLint(value={"InlinedApi"})
    private void a(boolean bl2, dp dp2, int n2, int n3) {
        if (bl2 && !this.b.equals((Object)this.a.getParent())) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n2, n2);
            layoutParams.addRule(13);
            this.b.addView((View)this.a, (ViewGroup.LayoutParams)layoutParams);
        } else if (!bl2 && this.b.equals((Object)this.a.getParent())) {
            this.b.removeView((View)this.a);
        }
        if (!this.d.equals((Object)this.c.getParent())) {
            this.d.addView((View)this.c, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n3, n3);
        if (dp2 == null) {
            dp2 = dp.b;
        }
        switch (6.a[dp2.ordinal()]) {
            default: {
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                break;
            }
            case 7: {
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                break;
            }
            case 6: {
                layoutParams.addRule(10);
                layoutParams.addRule(9);
                break;
            }
            case 5: {
                layoutParams.addRule(10);
                layoutParams.addRule(14);
                break;
            }
            case 4: {
                layoutParams.addRule(13);
                break;
            }
            case 3: {
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                break;
            }
            case 2: {
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                break;
            }
            case 1: {
                layoutParams.addRule(12);
                layoutParams.addRule(14);
            }
        }
        this.b.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        this.c.bringToFront();
    }

    private Context b() {
        return this.d.getContext();
    }

    private void c() {
        this.e.a();
    }

    private void d() {
        this.d.removeView((View)this.c);
    }

    private void e() {
        this.f.a(new Runnable(){

            public void run() {
                dc.this.f();
            }
        }, ej.b.a, ej.c.a);
    }

    private void f() {
        this.b.removeAllViews();
    }

    public void a() {
        this.i = false;
        this.f.a(new Runnable(){

            public void run() {
                dc.this.d();
            }
        }, ej.b.a, ej.c.a);
    }

    public void a(boolean bl2) {
        if (this.i && this.b != null) {
            if (bl2) {
                this.a(true, null);
                return;
            }
            this.e();
        }
    }

    public void a(boolean bl2, dp dp2) {
        this.i = true;
        ViewGroup viewGroup = this.b;
        if (viewGroup != null && this.a != null && this.d.equals((Object)viewGroup.getParent()) && (this.b.equals((Object)this.a.getParent()) || !bl2)) {
            if (!bl2) {
                this.e();
            }
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager)this.b().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int n2 = (int)(0.5f + 60.0f * displayMetrics.density);
        int n3 = (int)(0.5f + 80.0f * displayMetrics.density);
        1 var7_7 = new 1(this, n3, bl2, dp2, n2);
        this.f.a(var7_7, (T[])new Void[0]);
    }

}

