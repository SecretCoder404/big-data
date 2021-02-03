/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.ListView
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.j
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package com.amazon.device.ads;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ey {
    private static final String a = "ey";
    private View b;
    private final cy c;
    private final j d;
    private Rect e;

    public ey(j j2) {
        this(j2, new cz());
    }

    ey(j j2, cz cz2) {
        this.d = j2;
        this.c = cz2.a(a);
    }

    private b a(View view) {
        int[] arrn = new int[2];
        view.getLocationOnScreen(arrn);
        b b2 = new b(arrn[0], arrn[1], view.getWidth() + arrn[0], view.getHeight() + arrn[1]);
        return b2;
    }

    @TargetApi(value=11)
    private void a(b b2, int n2, ViewGroup viewGroup, List<b> list, boolean bl2) {
        if (viewGroup != null && bl2 && bd.b((View)viewGroup)) {
            list.add((Object)new b(this.e));
            return;
        }
        for (int i2 = n2; i2 < viewGroup.getChildCount(); ++i2) {
            b b3;
            View view = viewGroup.getChildAt(i2);
            boolean bl3 = view != null && view instanceof ListView;
            if (!view.isShown() || bd.a(11) && view.getAlpha() == 0.0f || !(b3 = this.a(view)).a(b2)) continue;
            if (!bl3 && view instanceof ViewGroup) {
                this.a(b2, 0, (ViewGroup)view, list, false);
                continue;
            }
            this.c.c("Overlap found with View: %s", new Object[]{view});
            list.add((Object)b3);
        }
        if (!bl2) {
            return;
        }
        if (this.b.equals((Object)viewGroup)) {
            return;
        }
        ViewParent viewParent = viewGroup.getParent();
        if (viewParent != null) {
            if (!(viewParent instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup)viewParent;
            this.a(b2, 1 + viewGroup2.indexOfChild((View)viewGroup), viewGroup2, list, true);
            return;
        }
    }

    private int b(a a2, List<a> list) {
        int n2 = a2.b - a2.a;
        int n3 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            a a3 = (a)list.get(i2);
            n3 += n2 * (a3.b - a3.a);
        }
        return n3;
    }

    public float a(View view, Rect rect) {
        int n2 = view.getWidth() * view.getHeight();
        float f2 = n2;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        this.e = rect;
        if (this.b == null) {
            this.b = this.d.al();
        }
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup == null) {
            this.c.d("AdContainer is null");
            return 0.0f;
        }
        int n3 = viewGroup.indexOfChild(view);
        this.a(new b(rect), n3 + 1, viewGroup, (List<b>)arrayList, true);
        int n4 = this.a((List<b>)arrayList);
        int n5 = rect.width() * rect.height() - n4;
        cy cy2 = this.c;
        Object[] arrobject = new Object[]{n5, n2};
        cy2.c("Visible area: %s , Total area: %s", arrobject);
        return 100.0f * ((float)n5 / f2);
    }

    protected int a(List<b> list) {
        int[] arrn = new int[2 * list.size()];
        int n2 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            b b2 = (b)list.get(i2);
            int n3 = i2 * 2;
            arrn[n3] = b2.a();
            arrn[n3 + 1] = b2.c();
        }
        Arrays.sort((int[])arrn);
        Collections.sort(list);
        int n4 = 0;
        while (n2 < -1 + arrn.length) {
            int n5;
            int n6 = arrn[n2];
            if (n6 == (n5 = arrn[++n2])) continue;
            a a2 = new a(n6, n5);
            n4 += this.b(a2, this.a(a2, list));
        }
        return n4;
    }

    protected List<a> a(a a2, List<b> list) {
        ArrayList arrayList = new ArrayList();
        a a3 = null;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            b b2 = (b)list.get(i2);
            if (a2.a >= b2.c() || a2.b <= b2.a()) continue;
            a a4 = new a(b2.b(), b2.d());
            if (a3 == null) {
                arrayList.add((Object)a4);
            } else {
                if (a4.a(a3)) {
                    a3.b(a4);
                    continue;
                }
                arrayList.add((Object)a4);
            }
            a3 = a4;
        }
        return arrayList;
    }

    class a {
        int a;
        int b;

        public a(int n2, int n3) {
            this.a = n2;
            this.b = n3;
        }

        public boolean a(a a2) {
            return this.a <= a2.b && this.b >= a2.a;
        }

        public void b(a a2) {
            int n2 = this.a;
            int n3 = a2.a;
            if (n2 > n3) {
                n2 = n3;
            }
            this.a = n2;
            int n4 = this.b;
            int n5 = a2.b;
            if (n4 >= n5) {
                n5 = n4;
            }
            this.b = n5;
        }
    }

    class b
    implements Comparable<b> {
        private final Rect b;

        public b(int n2, int n3, int n4, int n5) {
            Rect rect = this.b = new Rect();
            rect.left = n2;
            rect.top = n3;
            rect.right = n4;
            rect.bottom = n5;
        }

        public b(Rect rect) {
            this.b = rect;
        }

        public int a() {
            return this.b.left;
        }

        public boolean a(b b2) {
            if (this.b.width() != 0 && this.b.height() != 0) {
                return this.b.intersect(b2.b);
            }
            return false;
        }

        public int b() {
            return this.b.top;
        }

        public int b(b b2) {
            if (this.b.top < b2.b.top) {
                return 1;
            }
            if (this.b.top == b2.b.top) {
                return 0;
            }
            return -1;
        }

        public int c() {
            return this.b.right;
        }

        public /* synthetic */ int compareTo(Object object) {
            return this.b((b)object);
        }

        public int d() {
            return this.b.bottom;
        }
    }

}

