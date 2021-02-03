/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewDatabase
 *  com.amazon.device.ads.cy
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.do;

class fd {
    private static fd a = new fd();
    private final cx b;
    private final cz c;
    private final bn d;
    private final a e;
    private final b f;
    private boolean g = false;

    protected fd() {
        this(cx.a(), new cz(), bn.a(), new a(), new b());
    }

    fd(cx cx2, cz cz2, bn bn2, a a2, b b2) {
        this.b = cx2;
        this.c = cz2;
        this.d = bn2;
        this.e = a2;
        this.f = b2;
    }

    public static final fd a() {
        return a;
    }

    private void b() {
        if (this.e.a()) {
            String string = this.b.d().b();
            if (string == null) {
                string = "";
            }
            a a2 = this.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ad-id=");
            stringBuilder.append(string);
            stringBuilder.append("; Domain=.amazon-adsystem.com");
            a2.a("http://amazon-adsystem.com", stringBuilder.toString());
        }
    }

    private void c() {
        boolean bl2 = this.d.a("debug.webViews", this.g);
        if (bl2 != this.g) {
            this.g = bl2;
            bd.a(this.g);
        }
    }

    public WebView a(Context context) {
        fd fd2 = this;
        synchronized (fd2) {
            this.c();
            Context context2 = context.getApplicationContext();
            WebView webView = this.f.a(context2);
            this.b.c().a(webView.getSettings().getUserAgentString());
            webView.getSettings().setUserAgentString(this.b.c().r());
            this.e.a(context);
            this.b();
            return webView;
        }
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    public boolean a(boolean bl2, WebView webView, String string) {
        try {
            webView.getSettings().setJavaScriptEnabled(bl2);
            return true;
        }
        catch (NullPointerException nullPointerException) {
            this.c.a(string).e("Could not set JavaScriptEnabled because a NullPointerException was encountered.");
            return false;
        }
    }

    public boolean b(Context context) {
        try {
            WebViewDatabase webViewDatabase = WebViewDatabase.getInstance((Context)context);
            boolean bl2 = false;
            if (webViewDatabase != null) {
                bl2 = true;
            }
            return bl2;
        }
        catch (Exception exception) {
            return false;
        }
    }

    static class a {
        private boolean a = false;

        a() {
        }

        public void a(Context context) {
            if (!this.a) {
                CookieSyncManager.createInstance((Context)context);
                this.a = true;
            }
        }

        public void a(String string, String string2) {
            CookieManager.getInstance().setCookie(string, string2);
        }

        public boolean a() {
            return this.a;
        }

        public void b() {
            CookieSyncManager.getInstance().startSync();
        }

        public void c() {
            CookieSyncManager.getInstance().stopSync();
        }
    }

    static class b {
        b() {
        }

        public WebView a(Context context) {
            return new WebView(context);
        }
    }

}

