/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.os.Looper
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.ej$a
 *  com.amazon.device.ads.ej$d
 *  com.amazon.device.ads.ej$e
 *  com.amazon.device.ads.ej$j
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.HashMap
 */
package com.amazon.device.ads;

import android.os.AsyncTask;
import android.os.Looper;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ej;
import java.util.HashMap;

class ej {
    private static k a = new k();

    public static k a() {
        return a;
    }

    public static void a(Runnable runnable) {
        ej.a(runnable, a);
    }

    public static void a(Runnable runnable, k k2) {
        k2.a(runnable, b.b, c.b);
    }

    public static void b(Runnable runnable) {
        ej.b(runnable, a);
    }

    public static void b(Runnable runnable, k k2) {
        k2.a(runnable, b.b, c.a);
    }

    public static boolean b() {
        return l.a().b();
    }

    public static void c(Runnable runnable) {
        ej.c(runnable, a);
    }

    public static void c(Runnable runnable, k k2) {
        k2.a(runnable, b.a, c.a);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        static {
            b[] arrb = new b[]{a, b};
            c = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])c.clone();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        private static final /* synthetic */ c[] c;

        static {
            c[] arrc = new c[]{a, b};
            c = arrc;
        }

        public static c valueOf(String string) {
            return (c)Enum.valueOf(c.class, (String)string);
        }

        public static c[] values() {
            return (c[])c.clone();
        }
    }

    static abstract class f<Params, Progress, Result>
    extends AsyncTask<Params, Progress, Result> {
        f() {
        }

        protected /* varargs */ abstract Result doInBackground(Params ... var1);

        protected void onPostExecute(Result Result) {
            super.onPostExecute(Result);
        }

        protected void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static abstract class g {
        private final b a;
        private final c b;

        public g(b b2, c c2) {
            this.a = b2;
            this.b = c2;
        }

        static /* synthetic */ c a(g g2) {
            return g2.b;
        }

        public b a() {
            return this.a;
        }

        public abstract void a(Runnable var1);

        public c b() {
            return this.b;
        }
    }

    /*
     * Exception performing whole class analysis.
     */
    public static class k {
        private static final String a = "ej$k";
        private final cy b;
        private final HashMap<b, HashMap<c, g>> c;

        k() {
            this(new cz());
            l l2 = new l();
            this.a((g)new /* Unavailable Anonymous Inner Class!! */);
            this.a((g)new /* Unavailable Anonymous Inner Class!! */);
            this.a((g)new /* Unavailable Anonymous Inner Class!! */);
            this.a((g)new /* Unavailable Anonymous Inner Class!! */);
        }

        k(cz cz2) {
            this.c = new HashMap();
            this.b = cz2.a(a);
        }

        public k a(g g2) {
            HashMap hashMap = (HashMap)this.c.get((Object)g2.a());
            if (hashMap == null) {
                hashMap = new HashMap();
                this.c.put((Object)g2.a(), (Object)hashMap);
            }
            hashMap.put((Object)g2.b(), (Object)g2);
            return this;
        }

        public /* varargs */ <T> void a(b b2, c c2, final f<T, ?, ?> f2, final T ... arrT) {
            a.a(new Runnable(){

                public void run() {
                    bd.a(f2, arrT);
                }
            }, b2, c2);
        }

        public /* varargs */ <T> void a(f<T, ?, ?> f2, T ... arrT) {
            this.a(b.a, c.a, f2, arrT);
        }

        public void a(Runnable runnable, b b2, c c2) {
            HashMap hashMap = (HashMap)this.c.get((Object)b2);
            if (hashMap == null) {
                this.b.e("No executor available for %s execution style.", new Object[]{b2});
                return;
            }
            g g2 = (g)hashMap.get((Object)c2);
            if (g2 == null) {
                this.b.e("No executor available for %s execution style on % execution thread.", new Object[]{b2, c2});
            }
            g2.a(runnable);
        }

    }

    static class l {
        private static l a = new l();

        l() {
        }

        static l a() {
            return a;
        }

        boolean b() {
            return Looper.getMainLooper().getThread() == Thread.currentThread();
        }
    }

}

