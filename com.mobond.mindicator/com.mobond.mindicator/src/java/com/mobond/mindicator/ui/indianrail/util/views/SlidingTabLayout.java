/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.HorizontalScrollView
 *  android.widget.TextView
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$f
 *  androidx.viewpager.widget.a
 *  com.mobond.mindicator.ui.indianrail.util.views.SlidingTabLayout$a
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package com.mobond.mindicator.ui.indianrail.util.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.mobond.mindicator.ui.indianrail.util.views.SlidingTabLayout;

/*
 * Exception performing whole class analysis.
 */
public class SlidingTabLayout
extends HorizontalScrollView {
    public ViewPager.f a;
    private final com.mobond.mindicator.ui.indianrail.util.views.a b;
    private int c;
    private int d;
    private int e;
    private ViewPager f;

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.setHorizontalScrollBarEnabled(false);
        this.setFillViewport(true);
        this.c = (int)(24.0f * this.getResources().getDisplayMetrics().density);
        this.b = new com.mobond.mindicator.ui.indianrail.util.views.a(context);
        this.addView((View)this.b, -1, -2);
    }

    private void a() {
        androidx.viewpager.widget.a a2 = this.f.getAdapter();
        b b2 = new b();
        for (int i2 = 0; i2 < a2.b(); ++i2) {
            TextView textView;
            View view;
            if (this.d != 0) {
                view = LayoutInflater.from((Context)this.getContext()).inflate(this.d, (ViewGroup)this.b, false);
                textView = (TextView)view.findViewById(this.e);
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
            this.b.addView(view);
        }
    }

    private void a(int n2, int n3) {
        int n4 = this.b.getChildCount();
        if (n4 != 0 && n2 >= 0) {
            if (n2 >= n4) {
                return;
            }
            View view = this.b.getChildAt(n2);
            if (view != null) {
                int n5 = n3 + view.getLeft();
                if (n2 > 0 || n3 > 0) {
                    n5 -= this.c;
                }
                this.scrollTo(n5, 0);
            }
            return;
        }
    }

    static /* synthetic */ void a(SlidingTabLayout slidingTabLayout, int n2, int n3) {
        slidingTabLayout.a(n2, n3);
    }

    protected TextView a(Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setGravity(17);
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        if (Build.VERSION.SDK_INT >= 11) {
            TypedValue typedValue = new TypedValue();
            this.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            textView.setBackgroundResource(typedValue.resourceId);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            textView.setAllCaps(true);
        }
        int n2 = (int)(16.0f * this.getResources().getDisplayMetrics().density);
        textView.setPadding(n2, n2, n2, n2);
        return textView;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            this.a(viewPager.getCurrentItem(), 0);
        }
    }

    public void setCustomTabColorizer(c c2) {
        this.b.a(c2);
    }

    public /* varargs */ void setDividerColors(int ... arrn) {
        this.b.b(arrn);
    }

    public void setOnPageChangeListener(ViewPager.f f2) {
        this.a = f2;
    }

    public /* varargs */ void setSelectedIndicatorColors(int ... arrn) {
        this.b.a(arrn);
    }

    public void setViewPager(ViewPager viewPager) {
        this.b.removeAllViews();
        this.f = viewPager;
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
            for (int i2 = 0; i2 < SlidingTabLayout.this.b.getChildCount(); ++i2) {
                if (view != SlidingTabLayout.this.b.getChildAt(i2)) continue;
                SlidingTabLayout.this.f.setCurrentItem(i2);
                return;
            }
        }
    }

    public static interface c {
        public int a(int var1);

        public int b(int var1);
    }

}

