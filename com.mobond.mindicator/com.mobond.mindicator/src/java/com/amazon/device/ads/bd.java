/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.ActionBar
 *  android.app.Activity
 *  android.graphics.Paint
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.widget.ImageButton
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package com.amazon.device.ads;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.ej;
import java.util.concurrent.Executor;

class bd {
    public static final a a = new a(new bc());

    public static a a() {
        return a;
    }

    public static final void a(View view) {
        b.a(view);
    }

    public static void a(WebView webView, String string) {
        b.a(webView, string);
    }

    public static void a(ImageButton imageButton, int n2) {
        if (bd.a(16)) {
            d.a(imageButton, n2);
            return;
        }
        imageButton.setAlpha(n2);
    }

    public static void a(bc bc2, Activity activity) {
        if (bd.a(bc2, 11)) {
            b.a(activity);
        }
        if (bd.a(bc2, 16)) {
            d.a(activity);
        }
    }

    public static void a(bc bc2, Window window) {
        if (bd.a(bc2, 11)) {
            b.a(window);
        }
    }

    public static /* varargs */ <T> void a(ej.f<T, ?, ?> f2, T ... arrT) {
        if (bd.a(11)) {
            b.a(f2, arrT);
            return;
        }
        f2.execute((Object[])arrT);
    }

    public static void a(boolean bl2) {
        if (bd.a(19)) {
            e.a(bl2);
        }
    }

    public static boolean a(int n2) {
        return Build.VERSION.SDK_INT >= n2;
    }

    public static boolean a(bc bc2, int n2) {
        return bc2.a() >= n2;
    }

    public static boolean a(bc bc2, int n2, int n3) {
        return bd.a(bc2, n2) && bd.b(bc2, n3);
    }

    @TargetApi(value=11)
    public static boolean b(View view) {
        return bd.a(11) && view.getAlpha() == 0.0f;
    }

    public static boolean b(bc bc2, int n2) {
        return bc2.a() <= n2;
    }

    public static boolean c(bc bc2, int n2) {
        return bc2.a() == n2;
    }

    public static class com.amazon.device.ads.bd$a {
        private final bc a;

        public com.amazon.device.ads.bd$a(bc bc2) {
            this.a = bc2;
        }

        private boolean a(int n2) {
            return bd.a(this.a, n2);
        }

        public a a(WebSettings webSettings) {
            return new a(webSettings);
        }

        public class a {
            private final WebSettings b;

            public a(WebSettings webSettings) {
                this.b = webSettings;
            }

            public void a(boolean bl2) {
                if (a.this.a(17)) {
                    c.a(this.b, bl2);
                }
            }
        }

    }

    @TargetApi(value=11)
    private static class b {
        protected static void a(Activity activity) {
            ActionBar actionBar = activity.getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
        }

        public static final void a(View view) {
            view.setLayerType(1, null);
        }

        protected static void a(Window window) {
            window.setFlags(16777216, 16777216);
        }

        protected static void a(WebView webView, String string) {
            webView.removeJavascriptInterface(string);
        }

        protected static final /* varargs */ <T> void a(ej.f<T, ?, ?> f2, T ... arrT) {
            f2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])arrT);
        }
    }

    @TargetApi(value=17)
    private static class c {
        public static void a(WebSettings webSettings, boolean bl2) {
            webSettings.setMediaPlaybackRequiresUserGesture(bl2);
        }
    }

    @TargetApi(value=16)
    private static class d {
        public static void a(Activity activity) {
            activity.getWindow().getDecorView().setSystemUiVisibility(4);
        }

        protected static void a(ImageButton imageButton, int n2) {
            imageButton.setImageAlpha(n2);
        }
    }

    @TargetApi(value=19)
    private static class e {
        public static void a(final boolean bl2) {
            ej.c(new Runnable(){

                public void run() {
                    WebView.setWebContentsDebuggingEnabled((boolean)bl2);
                }
            });
        }

    }

}

