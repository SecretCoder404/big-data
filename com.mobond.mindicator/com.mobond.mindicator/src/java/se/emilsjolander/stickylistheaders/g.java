/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.ListView
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.util.ArrayList
 *  java.util.List
 */
package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import se.emilsjolander.stickylistheaders.f;

class g
extends ListView {
    private a a;
    private List<View> b;
    private int c;
    private Rect d = new Rect();
    private Field e;
    private boolean f = true;
    private boolean g = false;

    public g(Context context) {
        super(context);
        try {
            Field field = AbsListView.class.getDeclaredField("mSelectorRect");
            field.setAccessible(true);
            this.d = (Rect)field.get((Object)this);
            if (Build.VERSION.SDK_INT >= 14) {
                this.e = AbsListView.class.getDeclaredField("mSelectorPosition");
                this.e.setAccessible(true);
                return;
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            noSuchFieldException.printStackTrace();
        }
    }

    private void b() {
        View view;
        int n2;
        if (!this.d.isEmpty() && (n2 = this.c()) >= 0 && (view = this.getChildAt(n2 - this.a())) instanceof f) {
            f f2 = (f)view;
            this.d.top = f2.getTop() + f2.e;
        }
    }

    private void b(View view) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add((Object)view);
    }

    private int c() {
        Field field = this.e;
        if (field == null) {
            for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
                if (this.getChildAt(i2).getBottom() != this.d.bottom) continue;
                return i2 + this.a();
            }
        } else {
            try {
                int n2 = field.getInt((Object)this);
                return n2;
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
            }
        }
        return -1;
    }

    int a() {
        int n2 = this.getFirstVisiblePosition();
        if (Build.VERSION.SDK_INT >= 11) {
            return n2;
        }
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            if (this.getChildAt(i2).getBottom() < 0) continue;
            n2 += i2;
            break;
        }
        if (!this.f && this.getPaddingTop() > 0 && n2 > 0 && this.getChildAt(0).getTop() > 0) {
            --n2;
        }
        return n2;
    }

    void a(int n2) {
        this.c = n2;
    }

    void a(a a2) {
        this.a = a2;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    boolean a(View view) {
        List<View> list = this.b;
        if (list == null) {
            return false;
        }
        return list.contains((Object)view);
    }

    public void addFooterView(View view) {
        super.addFooterView(view);
        this.b(view);
    }

    public void addFooterView(View view, Object object, boolean bl) {
        super.addFooterView(view, object, bl);
        this.b(view);
    }

    protected void dispatchDraw(Canvas canvas) {
        this.b();
        if (this.c != 0) {
            canvas.save();
            Rect rect = canvas.getClipBounds();
            rect.top = this.c;
            canvas.clipRect(rect);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
        this.a.a(canvas);
    }

    protected void layoutChildren() {
        if (!this.g) {
            super.layoutChildren();
        }
    }

    public boolean performItemClick(View view, int n2, long l2) {
        if (view instanceof f) {
            view = ((f)view).a;
        }
        return super.performItemClick(view, n2, l2);
    }

    public boolean removeFooterView(View view) {
        if (super.removeFooterView(view)) {
            this.b.remove((Object)view);
            return true;
        }
        return false;
    }

    public void setClipToPadding(boolean bl) {
        this.f = bl;
        super.setClipToPadding(bl);
    }

    static interface a {
        public void a(Canvas var1);
    }

}

