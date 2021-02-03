/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.database.DataSetObserver
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseBooleanArray
 *  android.view.AbsSavedState
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.animation.Animation
 *  android.widget.AbsListView
 *  android.widget.AbsListView$MultiChoiceModeListener
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemLongClickListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.SectionIndexer
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  se.emilsjolander.stickylistheaders.StickyListHeadersListView$b
 *  se.emilsjolander.stickylistheaders.StickyListHeadersListView$g
 *  se.emilsjolander.stickylistheaders.a
 *  se.emilsjolander.stickylistheaders.d
 */
package se.emilsjolander.stickylistheaders;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SectionIndexer;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import se.emilsjolander.stickylistheaders.a;
import se.emilsjolander.stickylistheaders.c;
import se.emilsjolander.stickylistheaders.g;

/*
 * Exception performing whole class analysis.
 */
public class StickyListHeadersListView
extends FrameLayout {
    private se.emilsjolander.stickylistheaders.g a;
    private View b;
    private Long c;
    private Integer d;
    private Integer e;
    private AbsListView.OnScrollListener f;
    private se.emilsjolander.stickylistheaders.a g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private float r;
    private c s;
    private e t;
    private d u;
    private a v;
    private Drawable w;
    private int x;

    public StickyListHeadersListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.stickyListHeadersListViewStyle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @TargetApi(value=11)
    public StickyListHeadersListView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.h = true;
        this.i = true;
        this.j = true;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.r = ViewConfiguration.get((Context)this.getContext()).getScaledTouchSlop();
        this.a = new se.emilsjolander.stickylistheaders.g(context);
        this.w = this.a.getDivider();
        this.x = this.a.getDividerHeight();
        this.a.setDivider(null);
        this.a.setDividerHeight(0);
        if (attributeSet != null) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, c.b.StickyListHeadersListView, n2, 0);
            try {
                int n3 = typedArray.getDimensionPixelSize(c.b.StickyListHeadersListView_android_padding, 0);
                this.l = typedArray.getDimensionPixelSize(c.b.StickyListHeadersListView_android_paddingLeft, n3);
                this.m = typedArray.getDimensionPixelSize(c.b.StickyListHeadersListView_android_paddingTop, n3);
                this.n = typedArray.getDimensionPixelSize(c.b.StickyListHeadersListView_android_paddingRight, n3);
                this.o = typedArray.getDimensionPixelSize(c.b.StickyListHeadersListView_android_paddingBottom, n3);
                this.setPadding(this.l, this.m, this.n, this.o);
                this.i = typedArray.getBoolean(c.b.StickyListHeadersListView_android_clipToPadding, true);
                super.setClipToPadding(true);
                this.a.setClipToPadding(this.i);
                int n4 = typedArray.getInt(c.b.StickyListHeadersListView_android_scrollbars, 512);
                se.emilsjolander.stickylistheaders.g g2 = this.a;
                boolean bl = (n4 & 512) != 0;
                g2.setVerticalScrollBarEnabled(bl);
                se.emilsjolander.stickylistheaders.g g3 = this.a;
                boolean bl2 = (n4 & 256) != 0;
                g3.setHorizontalScrollBarEnabled(bl2);
                if (Build.VERSION.SDK_INT >= 9) {
                    this.a.setOverScrollMode(typedArray.getInt(c.b.StickyListHeadersListView_android_overScrollMode, 0));
                }
                this.a.setFadingEdgeLength(typedArray.getDimensionPixelSize(c.b.StickyListHeadersListView_android_fadingEdgeLength, this.a.getVerticalFadingEdgeLength()));
                int n5 = typedArray.getInt(c.b.StickyListHeadersListView_android_requiresFadingEdge, 0);
                if (n5 == 4096) {
                    this.a.setVerticalFadingEdgeEnabled(false);
                    this.a.setHorizontalFadingEdgeEnabled(true);
                } else if (n5 == 8192) {
                    this.a.setVerticalFadingEdgeEnabled(true);
                    this.a.setHorizontalFadingEdgeEnabled(false);
                } else {
                    this.a.setVerticalFadingEdgeEnabled(false);
                    this.a.setHorizontalFadingEdgeEnabled(false);
                }
                this.a.setCacheColorHint(typedArray.getColor(c.b.StickyListHeadersListView_android_cacheColorHint, this.a.getCacheColorHint()));
                if (Build.VERSION.SDK_INT >= 11) {
                    this.a.setChoiceMode(typedArray.getInt(c.b.StickyListHeadersListView_android_choiceMode, this.a.getChoiceMode()));
                }
                this.a.setDrawSelectorOnTop(typedArray.getBoolean(c.b.StickyListHeadersListView_android_drawSelectorOnTop, false));
                this.a.setFastScrollEnabled(typedArray.getBoolean(c.b.StickyListHeadersListView_android_fastScrollEnabled, this.a.isFastScrollEnabled()));
                if (Build.VERSION.SDK_INT >= 11) {
                    this.a.setFastScrollAlwaysVisible(typedArray.getBoolean(c.b.StickyListHeadersListView_android_fastScrollAlwaysVisible, this.a.isFastScrollAlwaysVisible()));
                }
                this.a.setScrollBarStyle(typedArray.getInt(c.b.StickyListHeadersListView_android_scrollbarStyle, 0));
                if (typedArray.hasValue(c.b.StickyListHeadersListView_android_listSelector)) {
                    this.a.setSelector(typedArray.getDrawable(c.b.StickyListHeadersListView_android_listSelector));
                }
                this.a.setScrollingCacheEnabled(typedArray.getBoolean(c.b.StickyListHeadersListView_android_scrollingCache, this.a.isScrollingCacheEnabled()));
                if (typedArray.hasValue(c.b.StickyListHeadersListView_android_divider)) {
                    this.w = typedArray.getDrawable(c.b.StickyListHeadersListView_android_divider);
                }
                this.a.setStackFromBottom(typedArray.getBoolean(c.b.StickyListHeadersListView_android_stackFromBottom, false));
                this.x = typedArray.getDimensionPixelSize(c.b.StickyListHeadersListView_android_dividerHeight, this.x);
                this.a.setTranscriptMode(typedArray.getInt(c.b.StickyListHeadersListView_android_transcriptMode, 0));
                this.h = typedArray.getBoolean(c.b.StickyListHeadersListView_hasStickyHeaders, true);
                this.j = typedArray.getBoolean(c.b.StickyListHeadersListView_isDrawingListUnderStickyHeader, true);
            }
            finally {
                typedArray.recycle();
            }
        }
        this.a.a((g.a)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setOnScrollListener((AbsListView.OnScrollListener)new f());
        this.addView((View)this.a);
    }

    private void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
            return;
        }
        if (layoutParams.height == -1 || layoutParams.width == -2) {
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    static /* synthetic */ boolean a(StickyListHeadersListView stickyListHeadersListView, Canvas canvas, View view, long l2) {
        return stickyListHeadersListView.drawChild(canvas, view, l2);
    }

    private void b() {
        View view = this.b;
        if (view != null) {
            this.removeView(view);
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.a.a(0);
            this.c();
        }
    }

    private void b(int n2) {
        block6 : {
            int n3;
            boolean bl;
            boolean bl2;
            boolean bl3;
            block8 : {
                block7 : {
                    se.emilsjolander.stickylistheaders.a a2 = this.g;
                    int n4 = a2 == null ? 0 : a2.getCount();
                    if (n4 == 0) break block6;
                    if (!this.h) {
                        return;
                    }
                    n3 = n2 - this.a.getHeaderViewsCount();
                    if (this.a.getChildCount() > 0 && this.a.getChildAt(0).getBottom() < this.d()) {
                        ++n3;
                    }
                    bl = this.a.getChildCount() != 0;
                    bl2 = bl && this.a.getFirstVisiblePosition() == 0 && this.a.getChildAt(0).getTop() >= this.d();
                    if (n3 > n4 - 1) break block7;
                    bl3 = false;
                    if (n3 >= 0) break block8;
                }
                bl3 = true;
            }
            if (bl && !bl3 && !bl2) {
                this.c(n3);
                return;
            }
            this.b();
            return;
        }
    }

    private void b(View view) {
        if (view != null) {
            this.measureChild(view, View.MeasureSpec.makeMeasureSpec((int)(this.getMeasuredWidth() - this.l - this.n), (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
        }
    }

    static /* synthetic */ boolean b(StickyListHeadersListView stickyListHeadersListView, Canvas canvas, View view, long l2) {
        return stickyListHeadersListView.drawChild(canvas, view, l2);
    }

    private void c() {
        int n2 = this.d();
        int n3 = this.a.getChildCount();
        for (int i2 = 0; i2 < n3; ++i2) {
            se.emilsjolander.stickylistheaders.f f2;
            View view = this.a.getChildAt(i2);
            if (!(view instanceof se.emilsjolander.stickylistheaders.f) || !(f2 = (se.emilsjolander.stickylistheaders.f)view).a()) continue;
            View view2 = f2.d;
            if (f2.getTop() < n2) {
                if (view2.getVisibility() == 4) continue;
                view2.setVisibility(4);
                continue;
            }
            if (view2.getVisibility() == 0) continue;
            view2.setVisibility(0);
        }
    }

    private void c(int n2) {
        Integer n3 = this.d;
        if (n3 == null || n3 != n2) {
            this.d = n2;
            long l2 = this.g.b(n2);
            Long l3 = this.c;
            if (l3 == null || l3 != l2) {
                this.c = l2;
                View view = this.g.a(this.d.intValue(), this.b, (ViewGroup)this);
                if (this.b != view) {
                    if (view != null) {
                        this.c(view);
                    } else {
                        throw new NullPointerException("header may not be null");
                    }
                }
                this.a(this.b);
                this.b(this.b);
                d d2 = this.u;
                if (d2 != null) {
                    d2.a(this, this.b, n2, this.c);
                }
                this.e = null;
            }
        }
        int n4 = this.d();
        for (int i2 = 0; i2 < this.a.getChildCount(); ++i2) {
            View view = this.a.getChildAt(i2);
            boolean bl = view instanceof se.emilsjolander.stickylistheaders.f && ((se.emilsjolander.stickylistheaders.f)view).a();
            boolean bl2 = this.a.a(view);
            if (view.getTop() < this.d() || !bl && !bl2) continue;
            n4 = Math.min((int)(view.getTop() - this.b.getMeasuredHeight()), (int)n4);
            break;
        }
        this.setHeaderOffet(n4);
        if (!this.j) {
            this.a.a(this.b.getMeasuredHeight() + this.e);
        }
        this.c();
    }

    private void c(View view) {
        View view2 = this.b;
        if (view2 != null) {
            this.removeView(view2);
        }
        this.b = view;
        this.addView(this.b);
        if (this.s != null) {
            this.b.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
                    c c2 = StickyListHeadersListView.this.s;
                    StickyListHeadersListView stickyListHeadersListView = StickyListHeadersListView.this;
                    c2.a(stickyListHeadersListView, stickyListHeadersListView.b, StickyListHeadersListView.this.d, StickyListHeadersListView.this.c, true);
                }
            });
        }
        this.b.setClickable(true);
    }

    private int d() {
        int n2 = this.k;
        int n3 = this.i ? this.m : 0;
        return n2 + n3;
    }

    private boolean d(int n2) {
        boolean bl = true;
        if (n2 != 0) {
            if (this.g.b(n2) != this.g.b(n2 - bl)) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }

    private boolean e(int n2) {
        if (Build.VERSION.SDK_INT < n2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Api lvl must be at least ");
            stringBuilder.append(n2);
            stringBuilder.append(" to call this method");
            Log.e((String)"StickyListHeaders", (String)stringBuilder.toString());
            return false;
        }
        return true;
    }

    static /* synthetic */ boolean h(StickyListHeadersListView stickyListHeadersListView) {
        return stickyListHeadersListView.i;
    }

    static /* synthetic */ int i(StickyListHeadersListView stickyListHeadersListView) {
        return stickyListHeadersListView.m;
    }

    @SuppressLint(value={"NewApi"})
    private void setHeaderOffet(int n2) {
        Integer n3 = this.e;
        if (n3 == null || n3 != n2) {
            this.e = n2;
            if (Build.VERSION.SDK_INT >= 11) {
                this.b.setTranslationY((float)this.e.intValue());
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.b.getLayoutParams();
                marginLayoutParams.topMargin = this.e;
                this.b.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
            }
            e e2 = this.t;
            if (e2 != null) {
                e2.a(this, this.b, -this.e.intValue());
            }
        }
    }

    public int a(int n2) {
        if (!this.d(Math.max((int)0, (int)(n2 - this.getHeaderViewsCount())))) {
            View view = this.g.a(n2, null, (ViewGroup)this.a);
            if (view != null) {
                this.a(view);
                this.b(view);
                return view.getMeasuredHeight();
            }
            throw new NullPointerException("header may not be null");
        }
        return 0;
    }

    public void a(int n2, int n3) {
        int n4 = this.g == null ? 0 : this.a(n2);
        int n5 = n3 + n4;
        int n6 = this.i ? 0 : this.m;
        int n7 = n5 - n6;
        this.a.setSelectionFromTop(n2, n7);
    }

    public boolean a() {
        return this.h;
    }

    @TargetApi(value=14)
    public boolean canScrollVertically(int n2) {
        return this.a.canScrollVertically(n2);
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.a.getVisibility() == 0 || this.a.getAnimation() != null) {
            this.drawChild(canvas, (View)this.a, 0L);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((255 & motionEvent.getAction()) == 0) {
            this.p = motionEvent.getY();
            View view = this.b;
            boolean bl = view != null && this.p <= (float)(view.getHeight() + this.e);
            this.q = bl;
        }
        if (this.q) {
            if (this.b != null && Math.abs((float)(this.p - motionEvent.getY())) <= this.r) {
                return this.b.dispatchTouchEvent(motionEvent);
            }
            if (this.b != null) {
                MotionEvent motionEvent2 = MotionEvent.obtain((MotionEvent)motionEvent);
                motionEvent2.setAction(3);
                this.b.dispatchTouchEvent(motionEvent2);
                motionEvent2.recycle();
            }
            MotionEvent motionEvent3 = MotionEvent.obtain((long)motionEvent.getDownTime(), (long)motionEvent.getEventTime(), (int)motionEvent.getAction(), (float)motionEvent.getX(), (float)this.p, (int)motionEvent.getMetaState());
            motionEvent3.setAction(0);
            boolean bl = this.a.dispatchTouchEvent(motionEvent3);
            motionEvent3.recycle();
            this.q = false;
            return bl;
        }
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public se.emilsjolander.stickylistheaders.e getAdapter() {
        se.emilsjolander.stickylistheaders.a a2 = this.g;
        if (a2 == null) {
            return null;
        }
        return a2.a;
    }

    @Deprecated
    public boolean getAreHeadersSticky() {
        return this.a();
    }

    @TargetApi(value=11)
    public int getCheckedItemCount() {
        if (this.e(11)) {
            return this.a.getCheckedItemCount();
        }
        return 0;
    }

    @TargetApi(value=8)
    public long[] getCheckedItemIds() {
        if (this.e(8)) {
            return this.a.getCheckedItemIds();
        }
        return null;
    }

    @TargetApi(value=11)
    public int getCheckedItemPosition() {
        return this.a.getCheckedItemPosition();
    }

    @TargetApi(value=11)
    public SparseBooleanArray getCheckedItemPositions() {
        return this.a.getCheckedItemPositions();
    }

    public int getCount() {
        return this.a.getCount();
    }

    public Drawable getDivider() {
        return this.w;
    }

    public int getDividerHeight() {
        return this.x;
    }

    public View getEmptyView() {
        return this.a.getEmptyView();
    }

    public int getFirstVisiblePosition() {
        return this.a.getFirstVisiblePosition();
    }

    public int getFooterViewsCount() {
        return this.a.getFooterViewsCount();
    }

    public int getHeaderViewsCount() {
        return this.a.getHeaderViewsCount();
    }

    public int getLastVisiblePosition() {
        return this.a.getLastVisiblePosition();
    }

    public int getListChildCount() {
        return this.a.getChildCount();
    }

    @TargetApi(value=9)
    public int getOverScrollMode() {
        if (this.e(9)) {
            return this.a.getOverScrollMode();
        }
        return 0;
    }

    public int getPaddingBottom() {
        return this.o;
    }

    public int getPaddingLeft() {
        return this.l;
    }

    public int getPaddingRight() {
        return this.n;
    }

    public int getPaddingTop() {
        return this.m;
    }

    public int getScrollBarStyle() {
        return this.a.getScrollBarStyle();
    }

    public int getStickyHeaderTopOffset() {
        return this.k;
    }

    public ListView getWrappedList() {
        return this.a;
    }

    public boolean isHorizontalScrollBarEnabled() {
        return this.a.isHorizontalScrollBarEnabled();
    }

    public boolean isVerticalScrollBarEnabled() {
        return this.a.isVerticalScrollBarEnabled();
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        se.emilsjolander.stickylistheaders.g g2 = this.a;
        g2.layout(0, 0, g2.getMeasuredWidth(), this.getHeight());
        View view = this.b;
        if (view != null) {
            int n6 = ((ViewGroup.MarginLayoutParams)view.getLayoutParams()).topMargin;
            View view2 = this.b;
            view2.layout(this.l, n6, view2.getMeasuredWidth() + this.l, n6 + this.b.getMeasuredHeight());
        }
    }

    protected void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        this.b(this.b);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable)View.BaseSavedState.EMPTY_STATE);
        this.a.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == View.BaseSavedState.EMPTY_STATE) {
            return this.a.onSaveInstanceState();
        }
        throw new IllegalStateException("Handling non empty state of parent class is not implemented");
    }

    public void setAdapter(se.emilsjolander.stickylistheaders.e e2) {
        if (e2 == null) {
            se.emilsjolander.stickylistheaders.a a2;
            se.emilsjolander.stickylistheaders.a a3 = this.g;
            if (a3 instanceof se.emilsjolander.stickylistheaders.d) {
                ((se.emilsjolander.stickylistheaders.d)a3).b = null;
            }
            if ((a2 = this.g) != null) {
                a2.a = null;
            }
            this.a.setAdapter(null);
            this.b();
            return;
        }
        se.emilsjolander.stickylistheaders.a a4 = this.g;
        if (a4 != null) {
            a4.unregisterDataSetObserver((DataSetObserver)this.v);
        }
        this.g = e2 instanceof SectionIndexer ? new se.emilsjolander.stickylistheaders.d(this.getContext(), e2) : new se.emilsjolander.stickylistheaders.a(this.getContext(), e2);
        this.v = new a();
        this.g.registerDataSetObserver((DataSetObserver)this.v);
        if (this.s != null) {
            this.g.a((a.a)new /* Unavailable Anonymous Inner Class!! */);
        } else {
            this.g.a(null);
        }
        this.g.a(this.w, this.x);
        this.a.setAdapter((ListAdapter)this.g);
        this.b();
    }

    public void setAreHeadersSticky(boolean bl) {
        this.h = bl;
        if (!bl) {
            this.b();
        } else {
            this.b(this.a.a());
        }
        this.a.invalidate();
    }

    public void setBlockLayoutChildren(boolean bl) {
        this.a.a(bl);
    }

    @TargetApi(value=11)
    public void setChoiceMode(int n2) {
        this.a.setChoiceMode(n2);
    }

    public void setClipToPadding(boolean bl) {
        se.emilsjolander.stickylistheaders.g g2 = this.a;
        if (g2 != null) {
            g2.setClipToPadding(bl);
        }
        this.i = bl;
    }

    public void setDivider(Drawable drawable) {
        this.w = drawable;
        se.emilsjolander.stickylistheaders.a a2 = this.g;
        if (a2 != null) {
            a2.a(this.w, this.x);
        }
    }

    public void setDividerHeight(int n2) {
        this.x = n2;
        se.emilsjolander.stickylistheaders.a a2 = this.g;
        if (a2 != null) {
            a2.a(this.w, this.x);
        }
    }

    public void setDrawingListUnderStickyHeader(boolean bl) {
        this.j = bl;
        this.a.a(0);
    }

    public void setEmptyView(View view) {
        this.a.setEmptyView(view);
    }

    @TargetApi(value=11)
    public void setFastScrollAlwaysVisible(boolean bl) {
        if (this.e(11)) {
            this.a.setFastScrollAlwaysVisible(bl);
        }
    }

    public void setFastScrollEnabled(boolean bl) {
        this.a.setFastScrollEnabled(bl);
    }

    public void setHorizontalScrollBarEnabled(boolean bl) {
        this.a.setHorizontalScrollBarEnabled(bl);
    }

    @TargetApi(value=11)
    public void setMultiChoiceModeListener(AbsListView.MultiChoiceModeListener multiChoiceModeListener) {
        if (this.e(11)) {
            this.a.setMultiChoiceModeListener(multiChoiceModeListener);
        }
    }

    public void setOnCreateContextMenuListener(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.a.setOnCreateContextMenuListener(onCreateContextMenuListener);
    }

    public void setOnHeaderClickListener(c c2) {
        this.s = c2;
        se.emilsjolander.stickylistheaders.a a2 = this.g;
        if (a2 != null) {
            if (this.s != null) {
                a2.a((a.a)new /* Unavailable Anonymous Inner Class!! */);
                View view = this.b;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener(){

                        public void onClick(View view) {
                            c c2 = StickyListHeadersListView.this.s;
                            StickyListHeadersListView stickyListHeadersListView = StickyListHeadersListView.this;
                            c2.a(stickyListHeadersListView, stickyListHeadersListView.b, StickyListHeadersListView.this.d, StickyListHeadersListView.this.c, true);
                        }
                    });
                    return;
                }
            } else {
                a2.a(null);
            }
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.a.setOnItemClickListener(onItemClickListener);
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.a.setOnItemLongClickListener(onItemLongClickListener);
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f = onScrollListener;
    }

    public void setOnStickyHeaderChangedListener(d d2) {
        this.u = d2;
    }

    public void setOnStickyHeaderOffsetChangedListener(e e2) {
        this.t = e2;
    }

    public void setOnTouchListener(final View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.a.setOnTouchListener(new View.OnTouchListener(){

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return onTouchListener.onTouch((View)StickyListHeadersListView.this, motionEvent);
                }
            });
            return;
        }
        this.a.setOnTouchListener(null);
    }

    @TargetApi(value=9)
    public void setOverScrollMode(int n2) {
        se.emilsjolander.stickylistheaders.g g2;
        if (this.e(9) && (g2 = this.a) != null) {
            g2.setOverScrollMode(n2);
        }
    }

    public void setPadding(int n2, int n3, int n4, int n5) {
        this.l = n2;
        this.m = n3;
        this.n = n4;
        this.o = n5;
        se.emilsjolander.stickylistheaders.g g2 = this.a;
        if (g2 != null) {
            g2.setPadding(n2, n3, n4, n5);
        }
        super.setPadding(0, 0, 0, 0);
        this.requestLayout();
    }

    public void setScrollBarStyle(int n2) {
        this.a.setScrollBarStyle(n2);
    }

    public void setSelection(int n2) {
        this.a(n2, 0);
    }

    public void setSelector(int n2) {
        this.a.setSelector(n2);
    }

    public void setSelector(Drawable drawable) {
        this.a.setSelector(drawable);
    }

    public void setStackFromBottom(boolean bl) {
        this.a.setStackFromBottom(bl);
    }

    public void setStickyHeaderTopOffset(int n2) {
        this.k = n2;
        this.b(this.a.a());
    }

    public void setTranscriptMode(int n2) {
        this.a.setTranscriptMode(n2);
    }

    public void setVerticalScrollBarEnabled(boolean bl) {
        this.a.setVerticalScrollBarEnabled(bl);
    }

    public boolean showContextMenu() {
        return this.a.showContextMenu();
    }

    private class a
    extends DataSetObserver {
        private a() {
        }

        public void onChanged() {
            StickyListHeadersListView.this.b();
        }

        public void onInvalidated() {
            StickyListHeadersListView.this.b();
        }
    }

    public static interface c {
        public void a(StickyListHeadersListView var1, View var2, int var3, long var4, boolean var6);
    }

    public static interface d {
        public void a(StickyListHeadersListView var1, View var2, int var3, long var4);
    }

    public static interface e {
        public void a(StickyListHeadersListView var1, View var2, int var3);
    }

    private class f
    implements AbsListView.OnScrollListener {
        private f() {
        }

        public void onScroll(AbsListView absListView, int n2, int n3, int n4) {
            if (StickyListHeadersListView.this.f != null) {
                StickyListHeadersListView.this.f.onScroll(absListView, n2, n3, n4);
            }
            StickyListHeadersListView stickyListHeadersListView = StickyListHeadersListView.this;
            stickyListHeadersListView.b(stickyListHeadersListView.a.a());
        }

        public void onScrollStateChanged(AbsListView absListView, int n2) {
            if (StickyListHeadersListView.this.f != null) {
                StickyListHeadersListView.this.f.onScrollStateChanged(absListView, n2);
            }
        }
    }

}

