/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.webkit.ConsoleMessage
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  com.amazon.device.ads.cy
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.Set
 */
package com.amazon.device.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dm;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.fd;
import java.util.HashSet;
import java.util.Set;

class eo {
    private static final String a = "eo";
    private final ViewGroup b;
    private final fd c;
    private final bd.a d;
    private WebViewClient e;
    private WebView f;
    private WebView g;
    private WebView h;
    private int i = -1;
    private int j = -1;
    private int k = 17;
    private View.OnKeyListener l;
    private boolean m = false;
    private final Set<String> n = new HashSet();
    private final cy o = new cz().a(a);

    public eo(ViewGroup viewGroup) {
        this(viewGroup, fd.a(), bd.a());
    }

    eo(ViewGroup viewGroup, fd fd2, bd.a a2) {
        this.b = viewGroup;
        this.c = fd2;
        this.d = a2;
    }

    private /* varargs */ void a(final WebView ... arrwebView) {
        ej.c(new Runnable(){

            public void run() {
                for (WebView webView : arrwebView) {
                    if (webView == null) continue;
                    if (webView.getParent() != null) {
                        ((ViewGroup)webView.getParent()).removeView((View)webView);
                    }
                    try {
                        webView.destroy();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        cy cy2 = eo.this.o;
                        Object[] arrobject = new Object[]{illegalArgumentException.getMessage()};
                        cy2.d("Caught an IllegalArgumentException while destroying a WebView: %s", arrobject);
                    }
                }
            }
        });
    }

    private boolean j() {
        return this.f != null;
    }

    private WebView k() {
        if (this.f == null) {
            WebView webView = this.a(this.a((View)this.b));
            if (this.b(webView)) {
                webView.setContentDescription((CharSequence)"originalWebView");
                this.a(webView, false);
            } else {
                throw new IllegalStateException("Could not create WebView");
            }
        }
        return this.f;
    }

    private void l() {
        if (this.j()) {
            this.a(this.k(), this.j, this.i, this.k);
        }
    }

    private WebView m() {
        if (this.h == null) {
            this.h = this.a(this.b.getContext());
            this.h.setContentDescription((CharSequence)"preloadedWebView");
        }
        return this.h;
    }

    Context a(View view) {
        return view.getContext();
    }

    WebView a(Context context) {
        WebView webView = this.c.a(context);
        if (!this.c.a(true, webView, a)) {
            return null;
        }
        WebSettings webSettings = webView.getSettings();
        this.d.a(webSettings).a(false);
        webView.setScrollContainer(false);
        webView.setBackgroundColor(0);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebChromeClient((WebChromeClient)new a());
        webSettings.setDomStorageEnabled(true);
        if (this.m) {
            bd.a((View)webView);
        }
        return webView;
    }

    public void a(int n2) {
        this.i = n2;
        this.l();
    }

    public void a(int n2, int n3, int n4) {
        this.j = n2;
        this.i = n3;
        this.k = n4;
        this.l();
    }

    public void a(View.OnKeyListener onKeyListener) {
        this.l = onKeyListener;
        this.k().requestFocus();
        this.k().setOnKeyListener(this.l);
    }

    void a(WebView webView) {
        this.b.addView((View)webView);
    }

    protected void a(WebView webView, int n2, int n3, int n4) {
        if (webView.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n2, n3);
            layoutParams.gravity = n4;
            webView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            return;
        }
        webView.getLayoutParams().width = n2;
        webView.getLayoutParams().height = n3;
        if (webView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams)webView.getLayoutParams()).gravity = n4;
        }
    }

    void a(WebView webView, boolean bl2) {
        WebView webView2 = this.f;
        if (webView2 != null) {
            webView2.setOnKeyListener(null);
            webView2.setWebViewClient(new WebViewClient());
            this.b.removeView((View)webView2);
            if (bl2) {
                this.a(new WebView[]{webView2});
            }
        }
        webView.setWebViewClient(this.e);
        this.f = webView;
        this.l();
        this.a(this.f);
        View.OnKeyListener onKeyListener = this.l;
        if (onKeyListener != null) {
            this.a(onKeyListener);
        }
    }

    public void a(WebViewClient webViewClient) {
        this.e = webViewClient;
        if (this.j()) {
            this.k().setWebViewClient(this.e);
        }
    }

    public void a(Object object, boolean bl2, String string) {
        this.o.c("Add JavaScript Interface %s", new Object[]{string});
        this.n.add((Object)string);
        if (bl2) {
            this.m().addJavascriptInterface(object, string);
            return;
        }
        this.k().addJavascriptInterface(object, string);
    }

    public void a(String string, String string2, String string3, String string4, String string5, boolean bl2, dm dm2) {
        if (bl2) {
            if (dm2 != null) {
                this.m().setWebViewClient((WebViewClient)new b(dm2));
            }
            this.m().loadDataWithBaseURL(string, string2, string3, string4, string5);
            return;
        }
        this.k().loadDataWithBaseURL(string, string2, string3, string4, string5);
    }

    public void a(String string, boolean bl2, dm dm2) {
        if (bl2) {
            if (dm2 != null) {
                this.m().setWebViewClient((WebViewClient)new b(dm2));
            }
            this.m().loadUrl(string);
            return;
        }
        cy cy2 = this.o;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Loading URL: ");
        stringBuilder.append(string);
        cy2.d(stringBuilder.toString());
        this.k().loadUrl(string);
    }

    public void a(boolean bl2) {
        this.m = bl2;
    }

    public void a(int[] arrn) {
        if (this.j()) {
            this.k().getLocationOnScreen(arrn);
        }
    }

    public boolean a() {
        Context context = this.a((View)this.b);
        return this.c.b(context);
    }

    public void b() {
        this.k();
    }

    public boolean b(View view) {
        return view.equals((Object)this.f);
    }

    boolean b(WebView webView) {
        return webView != null;
    }

    public void c() {
        WebView[] arrwebView = new WebView[]{this.f, this.g, this.h};
        this.a(arrwebView);
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public WebView d() {
        return this.f;
    }

    public int e() {
        if (this.j()) {
            return this.k().getWidth();
        }
        return 0;
    }

    public int f() {
        if (this.j()) {
            return this.k().getHeight();
        }
        return 0;
    }

    public void g() {
        WebView webView = this.g;
        if (webView != null) {
            this.a(new WebView[]{webView});
        }
        this.g = this.f;
        WebView webView2 = this.h;
        if (webView2 == null) {
            webView2 = this.a(this.b.getContext());
            webView2.setContentDescription((CharSequence)"newWebView");
        } else {
            this.h = this.a(this.b.getContext());
        }
        this.a(webView2, false);
    }

    public boolean h() {
        WebView webView = this.g;
        if (webView != null) {
            this.g = null;
            this.a(webView, true);
            return true;
        }
        return false;
    }

    public void i() {
        if (this.f != null) {
            if (bd.a(11)) {
                for (String string : this.n) {
                    bd.a(this.f, string);
                }
            } else {
                this.a(this.a(this.b.getContext()), true);
                this.f.setContentDescription((CharSequence)"originalWebView");
            }
        }
        this.n.clear();
    }

    private class a
    extends WebChromeClient {
        private a() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            cy cy2 = eo.this.o;
            Object[] arrobject = new Object[]{consoleMessage.lineNumber(), consoleMessage.message()};
            cy2.c("JS Console Message Line number %d : %s", arrobject);
            return false;
        }
    }

    private class b
    extends WebViewClient {
        private final dm b;

        public b(dm dm2) {
            this.b = dm2;
        }

        public void onPageFinished(WebView webView, String string) {
            dm dm2 = this.b;
            if (dm2 != null) {
                dm2.a(string);
            }
        }
    }

}

