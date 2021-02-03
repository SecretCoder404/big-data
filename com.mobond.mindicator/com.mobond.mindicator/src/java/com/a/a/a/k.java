/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Handler
 *  android.os.Looper
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  com.a.a.a.k$1
 *  com.a.a.a.k$2
 *  com.a.a.a.k$d
 *  com.a.a.a.l
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 */
package com.a.a.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.a.a.a.k;
import com.a.a.a.l;
import com.a.a.a.q;
import com.a.a.n;
import com.a.a.o;
import com.a.a.p;
import com.a.a.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class k {
    private final o a;
    private int b = 100;
    private final b c;
    private final HashMap<String, a> d = new HashMap();
    private final HashMap<String, a> e = new HashMap();
    private final Handler f = new Handler(Looper.getMainLooper());
    private Runnable g;

    public k(o o2, b b2) {
        this.a = o2;
        this.c = b2;
    }

    private static String a(String string, int n2, int n3, ImageView.ScaleType scaleType) {
        StringBuilder stringBuilder = new StringBuilder(12 + string.length());
        stringBuilder.append("#W");
        stringBuilder.append(n2);
        stringBuilder.append("#H");
        stringBuilder.append(n3);
        stringBuilder.append("#S");
        stringBuilder.append(scaleType.ordinal());
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private void a(String string, a a2) {
        this.e.put((Object)string, (Object)a2);
        if (this.g == null) {
            this.g = new Runnable(){

                public void run() {
                    for (a a2 : k.this.e.values()) {
                        for (c c2 : a2.d) {
                            if (c2.c == null) continue;
                            if (a2.a() == null) {
                                c2.b = a2.b;
                                c2.c.a(c2, false);
                                continue;
                            }
                            c2.c.onErrorResponse(a2.a());
                        }
                    }
                    k.this.e.clear();
                    k.this.g = null;
                }
            };
            this.f.postDelayed(this.g, (long)this.b);
        }
    }

    public c a(String string, d d2) {
        return this.a(string, d2, 0, 0);
    }

    public c a(String string, d d2, int n2, int n3) {
        return this.a(string, d2, n2, n3, ImageView.ScaleType.CENTER_INSIDE);
    }

    public c a(String string, d d2, int n2, int n3, ImageView.ScaleType scaleType) {
        q.a();
        String string2 = k.a(string, n2, n3, scaleType);
        Bitmap bitmap = this.c.a(string2);
        if (bitmap != null) {
            c c2 = new c(bitmap, string, null, null);
            d2.a(c2, true);
            return c2;
        }
        c c3 = new c(null, string, string2, d2);
        d2.a(c3, true);
        a a2 = (a)this.d.get((Object)string2);
        if (a2 != null) {
            a2.a(c3);
            return c3;
        }
        n<Bitmap> n4 = this.a(string, n2, n3, scaleType, string2);
        this.a.a(n4);
        this.d.put((Object)string2, (Object)new a(n4, c3));
        return c3;
    }

    protected n<Bitmap> a(String string, int n2, int n3, ImageView.ScaleType scaleType, String string2) {
        l l2 = new l(string, (p.b)new 1(this, string2), n2, n3, scaleType, Bitmap.Config.RGB_565, (p.a)new 2(this, string2));
        return l2;
    }

    protected void a(String string, Bitmap bitmap) {
        this.c.a(string, bitmap);
        a a2 = (a)this.d.remove((Object)string);
        if (a2 != null) {
            a2.b = bitmap;
            this.a(string, a2);
        }
    }

    protected void a(String string, u u2) {
        a a2 = (a)this.d.remove((Object)string);
        if (a2 != null) {
            a2.a(u2);
            this.a(string, a2);
        }
    }

    private static class a {
        private final n<?> a;
        private Bitmap b;
        private u c;
        private final List<c> d = new ArrayList();

        public a(n<?> n2, c c2) {
            this.a = n2;
            this.d.add((Object)c2);
        }

        public u a() {
            return this.c;
        }

        public void a(c c2) {
            this.d.add((Object)c2);
        }

        public void a(u u2) {
            this.c = u2;
        }
    }

    public static interface b {
        public Bitmap a(String var1);

        public void a(String var1, Bitmap var2);
    }

    public class c {
        private Bitmap b;
        private final d c;
        private final String d;
        private final String e;

        public c(Bitmap bitmap, String string, String string2, d d2) {
            this.b = bitmap;
            this.e = string;
            this.d = string2;
            this.c = d2;
        }

        public Bitmap a() {
            return this.b;
        }
    }

}

