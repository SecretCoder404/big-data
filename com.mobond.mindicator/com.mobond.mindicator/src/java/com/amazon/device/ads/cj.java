/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bg;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cj;
import com.amazon.device.ads.cq;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.fc;
import com.amazon.device.ads.fd;
import java.util.concurrent.atomic.AtomicBoolean;

class cj
implements AdActivity.b {
    protected static final String a = "cj";
    private final fc b;
    private final fd c;
    private WebView d;
    private ImageButton e;
    private ImageButton f;
    private ImageButton g;
    private ImageButton h;
    private ImageButton i;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private Activity k;
    private boolean l;
    private final cy m;
    private final cx n;
    private final ee o;
    private final bg p;
    private final cq q;
    private final fd.a r;
    private final ej.k s;

    cj() {
        this(new fc(), fd.a(), new cz(), cx.a(), ee.a(), bg.a(), new cq(), new fd.a(), ej.a());
    }

    cj(fc fc2, fd fd2, cz cz2, cx cx2, ee ee2, bg bg2, cq cq2, fd.a a2, ej.k k2) {
        this.b = fc2;
        this.c = fd2;
        this.m = cz2.a(a);
        this.n = cx2;
        this.o = ee2;
        this.p = bg2;
        this.q = cq2;
        this.r = a2;
        this.s = k2;
    }

    private ImageButton a(String string, int n2, int n3, int n4, int n5) {
        ImageButton imageButton = new ImageButton((Context)this.k);
        imageButton.setImageBitmap(BitmapFactory.decodeFile((String)string));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n4, n5);
        layoutParams.addRule(n2, n3);
        layoutParams.addRule(12);
        imageButton.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        imageButton.setBackgroundColor(0);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageButton;
    }

    static /* synthetic */ cy a(cj cj2) {
        return cj2.m;
    }

    @SuppressLint(value={"InlinedApi"})
    private void a(Intent intent) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.a(displayMetrics);
        float f2 = displayMetrics.density;
        int n2 = (int)(0.5f + 50.0f * f2);
        int n3 = (int)(0.5f + f2 * 3.0f);
        int n4 = this.l ? 5 : 4;
        int n5 = Math.min((int)(displayMetrics.widthPixels / n4), (int)(n2 * 2));
        ViewGroup viewGroup = this.q.a((Context)this.k, cq.a.a, "inAppBrowserButtonLayout");
        viewGroup.setId(10280);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, n2 + n3);
        layoutParams.addRule(12);
        viewGroup.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        viewGroup.setBackgroundColor(-986896);
        ej.k k2 = this.s;
        b b2 = new b(intent, viewGroup, n5, n2);
        k2.a(b2, (T[])new Void[0]);
        View view = new View((Context)this.k);
        view.setContentDescription((CharSequence)"inAppBrowserHorizontalRule");
        view.setBackgroundColor(-3355444);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, n3);
        layoutParams2.addRule(10);
        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        viewGroup.addView(view);
        this.d = this.c.a((Context)this.k);
        WebSettings webSettings = this.d.getSettings();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.n.c().r());
        stringBuilder.append("-inAppBrowser");
        webSettings.setUserAgentString(stringBuilder.toString());
        this.d.setContentDescription((CharSequence)"inAppBrowserWebView");
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(2, viewGroup.getId());
        this.d.setLayoutParams((ViewGroup.LayoutParams)layoutParams3);
        ViewGroup viewGroup2 = this.q.a((Context)this.k, cq.a.a, "inAppBrowserRelativeLayout");
        viewGroup2.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        viewGroup2.addView((View)this.d);
        viewGroup2.addView((View)viewGroup);
        LinearLayout linearLayout = (LinearLayout)this.q.a((Context)this.k, cq.a.b, "inAppBrowserMainLayout");
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView((View)viewGroup2);
        this.k.setContentView((View)linearLayout);
    }

    private void a(WebView webView) {
        if (this.e != null && this.f != null) {
            if (webView.canGoBack()) {
                bd.a(this.e, 255);
            } else {
                bd.a(this.e, 102);
            }
            if (webView.canGoForward()) {
                bd.a(this.f, 255);
                return;
            }
            bd.a(this.f, 102);
        }
    }

    static /* synthetic */ void a(cj cj2, WebView webView) {
        cj2.a(webView);
    }

    static /* synthetic */ fc b(cj cj2) {
        return cj2.b;
    }

    private void b(Intent intent) {
        this.c.a(true, this.d, a);
        this.d.loadUrl(intent.getStringExtra("extra_url"));
        this.d.setWebViewClient(new WebViewClient(this){
            final /* synthetic */ cj a;
            {
                this.a = cj2;
            }

            public void onReceivedError(WebView webView, int n2, String string, String string2) {
                cj.a(this.a).d("InApp Browser error: %s", string);
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String string) {
                if (eh.b(string)) {
                    return false;
                }
                String string2 = cj.b(this.a).c(string);
                if (!string2.equals((Object)"http")) {
                    if (string2.equals((Object)"https")) {
                        return false;
                    }
                    return cj.b(this.a).a(string, (Context)cj.c(this.a));
                }
                return false;
            }
        });
        this.d.setWebChromeClient(new WebChromeClient(this){
            final /* synthetic */ cj a;
            {
                this.a = cj2;
            }

            public void onProgressChanged(WebView webView, int n2) {
                cj.c(this.a).setTitle((CharSequence)"Loading...");
                cj.c(this.a).setProgress(n2 * 100);
                if (n2 == 100) {
                    cj.c(this.a).setTitle((CharSequence)webView.getUrl());
                }
                cj.a(this.a, webView);
            }
        });
    }

    static /* synthetic */ Activity c(cj cj2) {
        return cj2.k;
    }

    private void c(Intent intent) {
        this.e.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ cj a;
            {
                this.a = cj2;
            }

            public void onClick(View view) {
                if (cj.d(this.a).canGoBack()) {
                    cj.d(this.a).goBack();
                }
            }
        });
        this.f.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ cj a;
            {
                this.a = cj2;
            }

            public void onClick(View view) {
                if (cj.d(this.a).canGoForward()) {
                    cj.d(this.a).goForward();
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ cj a;
            {
                this.a = cj2;
            }

            public void onClick(View view) {
                cj.d(this.a).reload();
            }
        });
        this.h.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ cj a;
            {
                this.a = cj2;
            }

            public void onClick(View view) {
                cj.c(this.a).finish();
            }
        });
        if (this.l) {
            String string = intent.getStringExtra("extra_url");
            this.i.setOnClickListener(new View.OnClickListener(this, string){
                final /* synthetic */ String a;
                final /* synthetic */ cj b;
                {
                    this.b = cj2;
                    this.a = string;
                }

                public void onClick(View view) {
                    String string = cj.d(this.b).getUrl();
                    if (string == null) {
                        cj.a(this.b).e("The current URL is null. Reverting to the original URL for external browser.");
                        string = this.a;
                    }
                    cj.b(this.b).a(string, cj.d(this.b).getContext());
                }
            });
        }
    }

    static /* synthetic */ WebView d(cj cj2) {
        return cj2.d;
    }

    private void i() {
        this.r.a((Context)this.k);
        this.r.b();
    }

    @Override
    public void a() {
    }

    @Override
    public void a(Activity activity) {
        this.k = activity;
    }

    @Override
    public void a(Configuration configuration) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.a(displayMetrics);
        int n2 = (int)(0.5f + 50.0f * displayMetrics.density);
        int n3 = this.l ? 5 : 4;
        int n4 = Math.min((int)(displayMetrics.widthPixels / n3), (int)(n2 * 2));
        cy cy2 = this.m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Width: ");
        stringBuilder.append(displayMetrics.widthPixels);
        stringBuilder.append(" ButtonWidth: ");
        stringBuilder.append(n4);
        cy2.d(stringBuilder.toString());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n4, n2);
        if (this.e != null) {
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            this.e.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        if (this.f != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(n4, n2);
            layoutParams2.addRule(1, this.e.getId());
            layoutParams2.addRule(12);
            this.f.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        }
        if (this.h != null) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(n4, n2);
            layoutParams3.addRule(11);
            layoutParams3.addRule(12);
            this.h.setLayoutParams((ViewGroup.LayoutParams)layoutParams3);
        }
        if (this.i != null) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(n4, n2);
            layoutParams4.addRule(1, this.f.getId());
            layoutParams4.addRule(12);
            this.i.setLayoutParams((ViewGroup.LayoutParams)layoutParams4);
            if (this.g != null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(n4, n2);
                layoutParams5.addRule(1, this.i.getId());
                layoutParams5.addRule(12);
                this.g.setLayoutParams((ViewGroup.LayoutParams)layoutParams5);
                return;
            }
        } else if (this.g != null) {
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(n4, n2);
            layoutParams6.addRule(1, this.f.getId());
            layoutParams6.addRule(12);
            this.g.setLayoutParams((ViewGroup.LayoutParams)layoutParams6);
        }
    }

    void a(DisplayMetrics displayMetrics) {
        ((WindowManager)this.k.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
    }

    @Override
    public void b() {
        this.k.getWindow().requestFeature(2);
        this.k.getWindow().setFeatureInt(2, -1);
        Intent intent = this.k.getIntent();
        this.l = intent.getBooleanExtra("extra_open_btn", false);
        this.a(intent);
        this.b(intent);
        this.i();
    }

    @Override
    public void c() {
        this.m.d("onPause");
        this.d.onPause();
        if (this.o.a("shouldPauseWebViewTimersInWebViewRelatedActivities", false)) {
            this.d.pauseTimers();
        }
        this.r.c();
    }

    @Override
    public void d() {
        this.m.d("onResume");
        this.d.onResume();
        if (this.o.a("shouldPauseWebViewTimersInWebViewRelatedActivities", false)) {
            this.d.resumeTimers();
        }
        this.r.b();
    }

    @Override
    public void e() {
    }

    @Override
    public void f() {
    }

    @Override
    public void g() {
        this.d.destroy();
        this.k.finish();
    }

    @Override
    public boolean h() {
        return false;
    }

    class b
    extends ej.f<Void, Void, Void> {
        private final ViewGroup b;
        private final int c;
        private final int d;
        private final Intent e;

        public b(Intent intent, ViewGroup viewGroup, int n2, int n3) {
            this.e = intent;
            this.b = viewGroup;
            this.c = n2;
            this.d = n3;
        }

        protected /* varargs */ Void a(Void ... arrvoid) {
            cj cj2 = cj.this;
            cj2.e = cj2.a(cj2.p.a("amazon_ads_leftarrow.png"), 9, -1, this.c, this.d);
            cj.this.e.setContentDescription((CharSequence)"inAppBrowserBackButton");
            cj.this.e.setId(10537);
            cj cj3 = cj.this;
            cj3.f = cj3.a(cj3.p.a("amazon_ads_rightarrow.png"), 1, cj.this.e.getId(), this.c, this.d);
            cj.this.f.setContentDescription((CharSequence)"inAppBrowserForwardButton");
            cj.this.f.setId(10794);
            cj cj4 = cj.this;
            cj4.h = cj4.a(cj4.p.a("amazon_ads_close.png"), 11, -1, this.c, this.d);
            cj.this.h.setContentDescription((CharSequence)"inAppBrowserCloseButton");
            if (cj.this.l) {
                cj cj5 = cj.this;
                cj5.i = cj5.a(cj5.p.a("amazon_ads_open_external_browser.png"), 1, cj.this.f.getId(), this.c, this.d);
                cj.this.i.setContentDescription((CharSequence)"inAppBrowserOpenExternalBrowserButton");
                cj.this.i.setId(10795);
                cj cj6 = cj.this;
                cj6.g = cj6.a(cj6.p.a("amazon_ads_refresh.png"), 1, cj.this.i.getId(), this.c, this.d);
            } else {
                cj cj7 = cj.this;
                cj7.g = cj7.a(cj7.p.a("amazon_ads_refresh.png"), 1, cj.this.f.getId(), this.c, this.d);
            }
            cj.this.g.setContentDescription((CharSequence)"inAppBrowserRefreshButton");
            return null;
        }

        protected void a(Void void_) {
            this.b.addView((View)cj.this.e);
            this.b.addView((View)cj.this.f);
            this.b.addView((View)cj.this.g);
            this.b.addView((View)cj.this.h);
            if (cj.this.l) {
                this.b.addView((View)cj.this.i);
            }
            cj.this.c(this.e);
            cj.this.j.set(true);
        }

        @Override
        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
            return this.a((Void[])arrobject);
        }

        @Override
        protected /* synthetic */ void onPostExecute(Object object) {
            this.a((Void)object);
        }
    }

}

