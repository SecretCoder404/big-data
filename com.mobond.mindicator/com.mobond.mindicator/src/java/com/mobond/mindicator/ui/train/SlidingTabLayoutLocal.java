/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.Display
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.WindowManager
 *  android.widget.HorizontalScrollView
 *  android.widget.TextView
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$f
 *  androidx.viewpager.widget.a
 *  com.mobond.mindicator.ui.train.SlidingTabLayoutLocal$a
 *  com.mobond.mindicator.ui.train.h
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui.train;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.mobond.mindicator.ui.train.SlidingTabLayoutLocal;
import com.mobond.mindicator.ui.train.h;

/*
 * Exception performing whole class analysis.
 */
public class SlidingTabLayoutLocal
extends HorizontalScrollView {
    private final h a;
    private int b;
    private int c;
    private int d;
    private ViewPager e;
    private ViewPager.f f;

    public SlidingTabLayoutLocal(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayoutLocal(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.setHorizontalScrollBarEnabled(false);
        this.setFillViewport(true);
        this.b = (int)(24.0f * this.getResources().getDisplayMetrics().density);
        this.a = new h(context);
        this.addView((View)this.a, -1, -2);
    }

    private void a() {
        androidx.viewpager.widget.a a2 = this.e.getAdapter();
        b b2 = new b();
        for (int i2 = 0; i2 < a2.b(); ++i2) {
            TextView textView;
            View view;
            if (this.c != 0) {
                view = LayoutInflater.from((Context)this.getContext()).inflate(this.c, (ViewGroup)this.a, false);
                textView = (TextView)view.findViewById(this.d);
            } else {
                view = null;
                textView = null;
            }
            if (view == null) {
                view = this.a(this.getContext());
            }
            if (textView == null && TextView.class.isInstance((Object)view)) {
                textView = (TextView)view;
            }
            textView.setText(a2.c(i2));
            view.setOnClickListener((View.OnClickListener)b2);
            this.a.addView(view);
        }
    }

    private void a(int n2, int n3) {
        int n4 = this.a.getChildCount();
        if (n4 != 0 && n2 >= 0) {
            if (n2 >= n4) {
                return;
            }
            View view = this.a.getChildAt(n2);
            if (view != null) {
                int n5 = n3 + view.getLeft();
                if (n2 > 0 || n3 > 0) {
                    n5 -= this.b;
                }
                this.scrollTo(n5, 0);
            }
            return;
        }
    }

    static /* synthetic */ void a(SlidingTabLayoutLocal slidingTabLayoutLocal, int n2, int n3) {
        slidingTabLayoutLocal.a(n2, n3);
    }

    static /* synthetic */ ViewPager.f b(SlidingTabLayoutLocal slidingTabLayoutLocal) {
        return slidingTabLayoutLocal.f;
    }

    protected TextView a(Context context) {
        int n2 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth() / 3;
        TextView textView = new TextView(context);
        textView.setWidth(n2);
        textView.setGravity(17);
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(Color.parseColor((String)"#ffffff"));
        if (Build.VERSION.SDK_INT >= 11) {
            TypedValue typedValue = new TypedValue();
            this.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            textView.setBackgroundResource(typedValue.resourceId);
        }
        int n3 = (int)(15.0f * this.getResources().getDisplayMetrics().density);
        textView.setPadding(n3, n3, n3, n3);
        return textView;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.e;
        if (viewPager != null) {
            this.a(viewPager.getCurrentItem(), 0);
        }
    }

    public void setCustomTabColorizer(c c2) {
        this.a.a(c2);
    }

    public /* varargs */ void setDividerColors(int ... arrn) {
        this.a.b(arrn);
    }

    public void setOnPageChangeListener(ViewPager.f f2) {
        this.f = f2;
    }

    public /* varargs */ void setSelectedIndicatorColors(int ... arrn) {
        this.a.a(arrn);
    }

    public void setViewPager(ViewPager viewPager) {
        this.a.removeAllViews();
        this.e = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener((ViewPager.f)new /* Unavailable Anonymous Inner Class!! */);
            this.a();
        }
    }

    private class b
    implements View.OnClickListener {
        private b() {
        }

        public void onClick(View view) {
            for (int i2 = 0; i2 < SlidingTabLayoutLocal.this.a.getChildCount(); ++i2) {
                if (view != SlidingTabLayoutLocal.this.a.getChildAt(i2)) continue;
                SlidingTabLayoutLocal.this.e.setCurrentItem(i2);
                return;
            }
        }
    }

    public static interface c {
        public int a(int var1);

        public int b(int var1);
    }

}

