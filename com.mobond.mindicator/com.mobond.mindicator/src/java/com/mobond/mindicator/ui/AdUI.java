/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.LinearLayout
 *  androidx.appcompat.app.e
 *  androidx.core.app.a
 *  com.facebook.ads.InterstitialAd
 *  com.google.android.gms.ads.j
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.String
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import com.amazon.device.ads.cm;
import com.facebook.ads.InterstitialAd;
import com.google.android.gms.ads.j;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.AdUI;
import com.mobond.mindicator.ui.ThankyouActivity;
import com.mobond.mindicator.ui.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.k;
import com.mobond.mindicator.ui.multicity.Multicity_home;

public class AdUI
extends e {
    LinearLayout a;
    WebView b;
    public View c;
    com.mobond.mindicator.b d;
    boolean e = false;

    static /* synthetic */ void a(AdUI adUI) {
        adUI.c();
    }

    private void b() {
        this.a.removeAllViews();
        this.a.addView(this.c);
        this.a.setVisibility(0);
        a.a((Activity)this).b("webadloaded_key_", true);
    }

    private void b(Activity activity) {
        Log.d((String)"xxxx", (String)"Exit loadExitAd called");
        k k2 = new k();
        this.c = c.a(activity, 5, new b(this, activity){
            final /* synthetic */ Activity a;
            final /* synthetic */ AdUI b;
            {
                this.b = adUI;
                this.a = activity;
            }

            public void a() {
                Log.d((String)"xxxx", (String)"Exit dfp exit ad loading failed");
                this.b.c = null;
                if (com.mobond.mindicator.b.e()) {
                    this.b.a(this.a, new b(this){
                        final /* synthetic */ 4 a;
                        {
                            this.a = var1_1;
                        }

                        public void a() {
                            this.a.b.c = null;
                            if (com.mobond.mindicator.b.f()) {
                                this.a.b.a(this.a.a);
                            }
                        }

                        public void b(int n2) {
                            AdUI.b(this.a.b);
                        }
                    });
                    return;
                }
                this.b.c = null;
                if (com.mobond.mindicator.b.f()) {
                    this.b.a(this.a);
                }
            }

            public void b(int n2) {
                AdUI.b(this.b);
            }
        }, k2);
    }

    static /* synthetic */ void b(AdUI adUI) {
        adUI.b();
    }

    private void c() {
        this.e = true;
        if (Build.VERSION.SDK_INT >= 16) {
            this.finishAffinity();
        } else {
            androidx.core.app.a.a((Activity)this);
        }
        this.startActivity(new Intent((Context)this, ThankyouActivity.class));
    }

    public void a() {
        if (this.getIntent().hasExtra("activityname")) {
            String string = this.getIntent().getExtras().getString("activityname");
            try {
                Intent intent = new Intent((Context)this, Class.forName((String)string));
                if (string.equalsIgnoreCase("com.mobond.mindicator.ui.chat.ChatScreenHSV")) {
                    intent.putExtra("CHATROOMKEY", this.getIntent().getExtras().getString("openchatroom"));
                    intent.putExtra("focusmessageTime", this.getIntent().getExtras().getString("focusmessageTime"));
                    intent.putExtra("FIRE_DB_URL_KEY", this.getIntent().getExtras().getString("FIRE_DB_URL_KEY"));
                    intent.putExtra("TRAINTITLE", "");
                    intent.putExtra("CHATTYPE", "CT");
                    intent.addFlags(67108864);
                }
                this.startActivityForResult(intent, 0);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.finish();
                Log.d((String)"1010101", (String)"finish 44");
                return;
            }
        }
        Intent intent = new Intent((Context)this, Multicity_home.class);
        if (this.getIntent().hasExtra("isalert")) {
            intent.putExtra("isalert", this.getIntent().getExtras().getString("isalert"));
        }
        if (this.getIntent().hasExtra("alert_type")) {
            intent.putExtra("alert_type", this.getIntent().getExtras().getString("alert_type"));
        }
        if (this.getIntent().hasExtra("openchatroom")) {
            intent.putExtra("openchatroom", this.getIntent().getExtras().getString("openchatroom"));
        }
        if (this.getIntent().hasExtra("openmsrtc")) {
            intent.putExtra("openmsrtc", this.getIntent().getExtras().getString("openmsrtc"));
        }
        if (this.getIntent().hasExtra("openir")) {
            intent.putExtra("openir", true);
        }
        this.startActivityForResult(intent, 0);
    }

    public void a(Activity activity) {
        Log.d((String)"xxxx", (String)"Exit loadJobsIndicatorWebView called");
        try {
            this.b = (WebView)this.findViewById(2131296357);
            this.b.setScrollBarStyle(33554432);
            this.b.getSettings().setJavaScriptEnabled(true);
            String string = com.mulo.b.e.a("http://mobondhrd.appspot.com/getads?", (Context)activity);
            this.b.setWebViewClient(new WebViewClient(this, activity){
                final /* synthetic */ Activity a;
                final /* synthetic */ AdUI b;
                {
                    this.b = adUI;
                    this.a = activity;
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String string) {
                    com.mobond.mindicator.ui.n.a((Context)this.a, webView, string);
                    return true;
                }
            });
            this.b.setWebChromeClient(new WebChromeClient(this, activity){
                final /* synthetic */ Activity a;
                final /* synthetic */ AdUI b;
                {
                    this.b = adUI;
                    this.a = activity;
                }

                public void onReceivedTitle(WebView webView, String string) {
                    super.onReceivedTitle(webView, string);
                    a.a(this.a).b("webadloaded_key_", true);
                }
            });
            this.b.loadUrl(string);
            this.b.setVisibility(0);
        }
        catch (Exception exception) {}
    }

    public void a(Activity activity, b b2) {
        Log.d((String)"xxxx", (String)"trying native exit");
        k k2 = new k();
        k2.a = "#000000";
        k2.b = "#707070";
        k2.c = "#e3e3e3";
        k2.e = "#2E7D32";
        k2.g = 3;
        this.c = c.a(activity, null, "ca-app-pub-5449278086868932/3245905640", "167101606757479_1239903979477231", "ca-app-pub-5449278086868932/1716653926", "167101606757479_1936928156441473", 6, b2, k2, true);
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        if (this.getIntent().hasExtra("activityname")) {
            this.finish();
            return;
        }
        if (n3 == -1) {
            if (!a.a((Activity)this).a("webadloaded_key_", false)) {
                this.e = true;
                this.finish();
                this.startActivity(new Intent((Context)this, ThankyouActivity.class));
                return;
            }
        } else {
            this.e = true;
            this.finish();
        }
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        try {
            this.e = false;
            c.f = false;
            c.c = null;
            c.d = null;
            c.e = null;
            super.onCreate(bundle);
            this.getWindow().requestFeature(2);
            this.getWindow().setFeatureInt(2, -1);
            this.setContentView(2131492920);
            this.a = (LinearLayout)this.findViewById(2131296356);
            this.d = a.a((Activity)this);
            a.a((Activity)this).b("webadloaded_key_", false);
            this.b((Activity)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.findViewById(2131297688).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ AdUI a;
            {
                this.a = adUI;
            }

            public void onClick(View view) {
                Multicity_home.c((Context)this.a);
                AdUI.a(this.a);
            }
        });
        this.findViewById(2131297037).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ AdUI a;
            {
                this.a = adUI;
            }

            public void onClick(View view) {
                this.a.a();
            }
        });
        this.findViewById(2131297168).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ AdUI a;
            {
                this.a = adUI;
            }

            public void onClick(View view) {
                try {
                    Multicity_home.e((Context)this.a);
                }
                catch (Exception exception) {}
            }
        });
    }

    public void onDestroy() {
        Log.d((String)"xxxx", (String)"onDestroy called in AdUI");
        ((ViewGroup)this.getWindow().getDecorView()).removeAllViews();
        WebView webView = this.b;
        if (webView != null) {
            webView.getSettings().setBuiltInZoomControls(true);
            this.b.destroy();
            this.b = null;
        }
        if (this.e) {
            c.c();
        }
        Multicity_home.c((Context)this);
        super.onDestroy();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        WebView webView;
        if (n2 == 4 && (webView = this.b) != null && webView.canGoBack()) {
            this.b.goBack();
            return true;
        }
        WebView webView2 = this.b;
        if (webView2 != null && !webView2.canGoBack()) {
            return true;
        }
        return super.onKeyDown(n2, keyEvent);
    }

    public void onPause() {
        Log.d((String)"xxxx", (String)"onPause AdUI");
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        Log.d((String)"xxxx", (String)"999 onResume called in AdUI");
        if (!com.mulo.a.b.b) {
            this.a();
        }
    }

    protected void onStart() {
        super.onStart();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }
}

