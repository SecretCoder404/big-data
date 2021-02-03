/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.content.Intent
 *  android.database.Cursor
 *  android.graphics.Bitmap
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Environment
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Media
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$FileChooserParams
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.core.app.a
 *  com.mobond.mindicator.ui.multicity.a
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Enumeration
 *  java.util.Hashtable
 */
package com.mobond.mindicator.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.n;
import com.mulo.util.e;
import com.mulo.util.g;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

public class WebUI
extends Activity
implements b {
    WebView a;
    g b;
    Activity c;
    int d = 100;
    String e = null;
    boolean f = false;
    boolean g = false;
    TextView h;
    RelativeLayout i;
    com.mobond.mindicator.b j;
    public ValueCallback<Uri[]> k;
    private ProgressBar l;
    private ValueCallback<Uri> m;
    private View n;
    private TextView o;
    private ImageView p;
    private com.mobond.mindicator.a.a q;
    private boolean r;
    private int s;
    private RelativeLayout t;

    static /* synthetic */ View a(WebUI webUI, View view) {
        webUI.n = view;
        return view;
    }

    static /* synthetic */ ValueCallback a(WebUI webUI, ValueCallback valueCallback) {
        webUI.m = valueCallback;
        return valueCallback;
    }

    static /* synthetic */ com.mobond.mindicator.a.a a(WebUI webUI) {
        return webUI.q;
    }

    static /* synthetic */ com.mobond.mindicator.a.a a(WebUI webUI, com.mobond.mindicator.a.a a2) {
        webUI.q = a2;
        return a2;
    }

    public static String a(Context context, Uri uri) {
        boolean bl = Build.VERSION.SDK_INT >= 19;
        if (bl && DocumentsContract.isDocumentUri((Context)context, (Uri)uri)) {
            if ("com.android.externalstorage.documents".equals((Object)uri.getAuthority())) {
                String[] arrstring = DocumentsContract.getDocumentId((Uri)uri).split(":");
                if ("primary".equalsIgnoreCase(arrstring[0])) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((Object)Environment.getExternalStorageDirectory());
                    stringBuilder.append("/");
                    stringBuilder.append(arrstring[1]);
                    return stringBuilder.toString();
                }
            } else {
                if ("com.android.providers.downloads.documents".equals((Object)uri.getAuthority())) {
                    String string = DocumentsContract.getDocumentId((Uri)uri);
                    return WebUI.a(context, ContentUris.withAppendedId((Uri)Uri.parse((String)"content://downloads/public_downloads"), (long)Long.valueOf((String)string)), null, null);
                }
                if ("com.android.providers.media.documents".equals((Object)uri.getAuthority())) {
                    String[] arrstring = DocumentsContract.getDocumentId((Uri)uri).split(":");
                    boolean bl2 = "image".equals((Object)arrstring[0]);
                    Uri uri2 = null;
                    if (bl2) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    }
                    String[] arrstring2 = new String[]{arrstring[1]};
                    return WebUI.a(context, uri2, "_id=?", arrstring2);
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if ("com.google.android.apps.photos.content".equals((Object)uri.getAuthority())) {
                    return uri.getLastPathSegment();
                }
                return WebUI.a(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public static String a(Context context, Uri uri, String string, String[] arrstring) {
        void var5_9;
        Cursor cursor;
        block8 : {
            block6 : {
                String string2;
                block7 : {
                    String[] arrstring2 = new String[]{"_data"};
                    cursor = context.getContentResolver().query(uri, arrstring2, string, arrstring, null);
                    if (cursor == null) break block6;
                    try {
                        if (!cursor.moveToFirst()) break block6;
                        string2 = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        if (cursor == null) break block7;
                    }
                    catch (Throwable throwable) {
                        break block8;
                    }
                    cursor.close();
                }
                return string2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
            catch (Throwable throwable) {
                cursor = null;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw var5_9;
    }

    static /* synthetic */ void b(WebUI webUI) {
        webUI.f();
    }

    static /* synthetic */ View c(WebUI webUI) {
        return webUI.n;
    }

    static /* synthetic */ ProgressBar d(WebUI webUI) {
        return webUI.l;
    }

    static /* synthetic */ RelativeLayout e(WebUI webUI) {
        return webUI.t;
    }

    static /* synthetic */ ValueCallback f(WebUI webUI) {
        return webUI.m;
    }

    private void f() {
        this.l.setVisibility(0);
        this.a.setVisibility(8);
    }

    @Override
    public void a() {
    }

    @Override
    public void b(int n2) {
        this.r = true;
        this.s = n2;
    }

    public boolean b() {
        NetworkInfo networkInfo = ((ConnectivityManager)this.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    public void button1Action(View view) {
        this.finish();
    }

    public void c() {
        View view = this.n;
        if (view != null && this.r) {
            view.setVisibility(0);
        }
    }

    public void d() {
        View view = this.n;
        if (view != null && this.s == 3) {
            view.setVisibility(8);
        }
    }

    public void e() {
        com.mobond.mindicator.b b2 = com.mobond.mindicator.a.a(this);
        String string = ConfigurationManager.b(this.getApplicationContext());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_natak");
        String string2 = stringBuilder.toString();
        int n2 = b2.a(string2, 0);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Subscribe request for ");
        stringBuilder2.append(string2);
        stringBuilder2.append(" old count ");
        stringBuilder2.append(n2);
        Log.d((String)"subscribelog", (String)stringBuilder2.toString());
        if (n2 <= 5) {
            int n3 = n2 + 1;
            b2.b(string2, n3);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("less than 5 new count ");
            stringBuilder3.append(n3);
            Log.d((String)"subscribelog", (String)stringBuilder3.toString());
            return;
        }
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("subscribed to ");
        stringBuilder4.append(string2);
        Log.d((String)"subscribelog", (String)stringBuilder4.toString());
        com.mobond.mindicator.fcm.b.a(string2);
    }

    public void finish() {
        ((ViewGroup)this.getWindow().getDecorView()).removeAllViews();
        super.finish();
        Log.d((String)"1111", (String)"1111 finish:");
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n2 == 1) {
            if (Build.VERSION.SDK_INT >= 21) {
                ValueCallback<Uri[]> valueCallback = this.k;
                if (valueCallback == null) {
                    return;
                }
                valueCallback.onReceiveValue((Object)WebChromeClient.FileChooserParams.parseResult((int)n3, (Intent)intent));
                this.k = null;
                return;
            }
            if (this.m == null) {
                return;
            }
            Uri uri = intent != null && n3 == -1 ? intent.getData() : null;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("file://");
            stringBuilder.append(WebUI.a((Context)this, uri));
            Uri uri2 = Uri.parse((String)stringBuilder.toString());
            this.m.onReceiveValue((Object)uri2);
            this.m = null;
            return;
        }
        if (n2 == 199) {
            switch (n3) {
                default: {
                    return;
                }
                case 0: {
                    n.d((Context)this, this.getString(2131755213));
                    return;
                }
                case -1: 
            }
            this.f();
            this.q.b(this.getApplicationContext());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"NewApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.c = this;
            this.getWindow().requestFeature(2);
            this.setContentView(2131493154);
            this.t = (RelativeLayout)this.findViewById(2131297679);
            if (this.getIntent().getBooleanExtra("IS_FIRST_TIME_OPENED", false)) {
                this.t.setVisibility(0);
            } else {
                this.t.setVisibility(8);
            }
            this.getWindow().setFeatureInt(2, -1);
            this.j = com.mobond.mindicator.a.a(this);
            TextView textView = (TextView)this.findViewById(2131296425);
            TextView textView2 = (TextView)this.findViewById(2131296533);
            this.i = (RelativeLayout)this.findViewById(2131297523);
            this.p = (ImageView)this.findViewById(2131296965);
            textView.setText((CharSequence)"m-Indicator");
            textView2.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
            String string = this.getIntent().getStringExtra("webuidatakey");
            String string2 = this.getIntent().getStringExtra("webuititle");
            this.b = e.a(string);
            if (this.b == null) {
                this.b = new g();
                if (this.getIntent().hasExtra("webuiurlkey")) {
                    String string3;
                    this.b.a = string3 = this.getIntent().getStringExtra("webuiurlkey");
                }
            } else if (this.b.a == null && this.getIntent().hasExtra("webuiurlkey")) {
                String string4;
                this.b.a = string4 = this.getIntent().getStringExtra("webuiurlkey");
            }
            if (this.b != null && this.b.a != null) {
                if (this.b.f != null) {
                    this.g = true;
                } else if (this.b.a.startsWith("file")) {
                    this.f = true;
                } else {
                    this.findViewById(2131297471).setVisibility(8);
                }
                this.o = (TextView)this.findViewById(2131296395);
                ImageView imageView = (ImageView)this.findViewById(2131296397);
                this.h = (TextView)this.findViewById(2131297528);
                if (string2 != null) {
                    this.i.setVisibility(0);
                    this.h.setText((CharSequence)string2);
                    this.o.setVisibility(8);
                }
                if (string2 != null && string2.equalsIgnoreCase("Hotels")) {
                    this.p.setVisibility(0);
                }
                this.o.setOnClickListener(new View.OnClickListener(this){
                    final /* synthetic */ WebUI a;
                    {
                        this.a = webUI;
                    }

                    public void onClick(View view) {
                        this.a.finish();
                    }
                });
                imageView.setOnClickListener(new View.OnClickListener(this){
                    final /* synthetic */ WebUI a;
                    {
                        this.a = webUI;
                    }

                    public void onClick(View view) {
                        this.a.finish();
                    }
                });
                this.p.setOnClickListener(new View.OnClickListener(this){
                    final /* synthetic */ WebUI a;
                    {
                        this.a = webUI;
                    }

                    public void onClick(View view) {
                        if (com.mobond.mindicator.h.a((Context)this.a.c, "android.permission.ACCESS_FINE_LOCATION")) {
                            if (WebUI.a(this.a) == null) {
                                WebUI.a(this.a, (com.mobond.mindicator.a.a)new com.mobond.mindicator.ui.WebUI$3$1(this));
                                WebUI.a(this.a).a(100);
                                WebUI.b(this.a);
                                WebUI.a(this.a).a(this.a.c);
                                return;
                            }
                            WebUI.b(this.a);
                            WebUI.a(this.a).a(this.a.c);
                            return;
                        }
                        com.mobond.mindicator.h.a(this.a.c, "LOCATION", new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 107);
                    }
                });
                this.a = (WebView)this.findViewById(2131297676);
                this.a.setScrollBarStyle(33554432);
                this.a.getSettings().setJavaScriptEnabled(true);
                this.a.setWebViewClient(new WebViewClient(){
                    int a;

                    private void a() {
                        Enumeration enumeration = WebUI.this.b.d.keys();
                        while (enumeration.hasMoreElements()) {
                            String string = (String)enumeration.nextElement();
                            String string2 = (String)WebUI.this.b.d.get((Object)string);
                            WebView webView = WebUI.this.a;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("javascript:document.getElementsByName('");
                            stringBuilder.append(string);
                            stringBuilder.append("')[0].value='");
                            stringBuilder.append(string2);
                            stringBuilder.append("';");
                            webView.loadUrl(stringBuilder.toString());
                        }
                        if (WebUI.this.b.c != null && WebUI.this.b.c.contains((CharSequence)"true")) {
                            WebUI.this.a.getSettings().setJavaScriptEnabled(false);
                        }
                    }

                    public void onLoadResource(WebView webView, String string) {
                        WebUI webUI = WebUI.this;
                        webUI.a = webView;
                        this.a = 1 + this.a;
                        if (this.a == webUI.b.b) {
                            this.a();
                        }
                    }

                    public void onPageFinished(WebView webView, String string) {
                        WebUI.this.a = webView;
                        this.a();
                    }

                    public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
                        WebUI webUI = WebUI.this;
                        webUI.a = webView;
                        if (string.equals((Object)webUI.b.a)) {
                            this.a = 0;
                        }
                        super.onPageStarted(webView, WebUI.this.b.a, bitmap);
                    }

                    public boolean shouldOverrideUrlLoading(WebView webView, String string) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("WebUI shouldOverrideUrlLoading: ");
                        stringBuilder.append(string);
                        Log.d((String)"WebUI", (String)stringBuilder.toString());
                        this.a = 1 + this.a;
                        if (string.startsWith("tel:")) {
                            com.mobond.mindicator.ui.multicity.a.a((Context)WebUI.this.c, (String)"EMERGENCY_SMALL", (String)"CALL", (String)string);
                        }
                        return n.a((Context)WebUI.this.c, webView, string);
                    }
                });
                this.a.getSettings().setDomStorageEnabled(true);
                this.a.getSettings().setBuiltInZoomControls(true);
                this.a.getSettings().setDisplayZoomControls(false);
                this.a.getSettings().setSupportZoom(true);
                this.a.getSettings().setAllowContentAccess(true);
                this.a.getSettings().setAllowFileAccess(true);
                this.l = (ProgressBar)this.findViewById(2131297128);
                this.l.setVisibility(8);
                this.a.setVisibility(0);
                if (this.b.e) {
                    this.a.getSettings().setLoadWithOverviewMode(true);
                    this.a.setInitialScale(75);
                    this.a.getSettings().setSupportZoom(true);
                    this.a.getSettings().setBuiltInZoomControls(true);
                    this.a.getSettings().setUseWideViewPort(true);
                }
                this.a.setWebChromeClient(new WebChromeClient(this){
                    final /* synthetic */ WebUI a;
                    {
                        this.a = webUI;
                    }

                    public void onProgressChanged(WebView webView, int n2) {
                        this.a.c.setTitle((CharSequence)"Loading...");
                        this.a.c.setProgress(n2 * 100);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("WebUI percentprogress: ");
                        stringBuilder.append(n2);
                        Log.d((String)"WebUI", (String)stringBuilder.toString());
                        if (this.a.b.f != null) {
                            this.a.findViewById(2131297471).setVisibility(8);
                            WebUI.d(this.a).setVisibility(8);
                            this.a.a.setVisibility(0);
                        } else if (!this.a.f) {
                            if (n2 >= 50) {
                                WebUI.d(this.a).setVisibility(8);
                                this.a.a.setVisibility(0);
                            } else {
                                WebUI.b(this.a);
                            }
                        } else if (n2 >= 100) {
                            WebUI.d(this.a).setVisibility(8);
                            try {
                                this.a.findViewById(2131297471).setVisibility(8);
                            }
                            catch (Exception exception) {}
                            this.a.a.setVisibility(0);
                        } else {
                            WebUI.b(this.a);
                        }
                        if (n2 == 100) {
                            this.a.c.setTitle(2131755070);
                            try {
                                if (this.a.getIntent().getBooleanExtra("IS_FIRST_TIME_OPENED", false)) {
                                    WebUI.e(this.a).setVisibility(8);
                                    return;
                                }
                            }
                            catch (Exception exception) {
                                com.crashlytics.android.Crashlytics.logException((Throwable)exception);
                            }
                        }
                    }

                    public void onReceivedTitle(WebView webView, String string) {
                        super.onReceivedTitle(webView, string);
                        if (string != null && string.length() > 0 && !this.a.f && WebUI.c(this.a) == null) {
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            boolean bl = this.a.b.g;
                            if (this.a.b.a.startsWith("http://mobondhrd.appspot.com/jobs?")) {
                                string3 = "ca-app-pub-5449278086868932/4722638841";
                                string5 = "167101606757479_1239843222816640";
                                string2 = "ca-app-pub-5449278086868932/4424933586";
                                string4 = "167101606757479_1236075226526773";
                            } else if (this.a.b.a.startsWith("http://mobondhrd.appspot.com/manoranjan?")) {
                                string3 = "ca-app-pub-5449278086868932/9292439244";
                                string5 = "167101606757479_1239843842816578";
                                string2 = "ca-app-pub-5449278086868932/9678325929";
                                string4 = "167101606757479_1235755476558748";
                            } else if (this.a.b.a.startsWith("http://mobondhrd.appspot.com/picnicspots?")) {
                                string3 = "ca-app-pub-5449278086868932/6338972840";
                                string5 = "167101606757479_1239843309483298";
                                string2 = "ca-app-pub-5449278086868932/4425999245";
                                string4 = "167101606757479_1235755879892041";
                            } else if (this.a.b.a.startsWith("http://mobondhrd.appspot.com/property?")) {
                                string3 = "ca-app-pub-5449278086868932/4618660044";
                                string5 = "167101606757479_1239843696149926";
                                string2 = "ca-app-pub-5449278086868932/7982100875";
                                string4 = "167101606757479_1235756133225349";
                            } else if (this.a.b.a.startsWith("http://mobondhrd.appspot.com/acbustimings.jsp?")) {
                                string3 = "ca-app-pub-5449278086868932/6360524847";
                                string5 = "167101606757479_1239840312816931";
                                string2 = "ca-app-pub-5449278086868932/2884497495";
                                string4 = "167101606757479_1235753279892301";
                            } else if (this.a.b.a.startsWith("http://mobondhrd.appspot.com/mumbaimetrorecharge?")) {
                                string3 = "ca-app-pub-5449278086868932/5875733127";
                                string5 = "167101606757479_1251066408360988";
                                string2 = "ca-app-pub-5449278086868932/7851638700";
                                string4 = "167101606757479_1251067698360859";
                                bl = false;
                            } else if (this.a.b.a.startsWith("http://mobondhrd.appspot.com/hotels/i.jsp?city=")) {
                                string3 = "ca-app-pub-5449278086868932/5875733127";
                                string5 = "167101606757479_1251066408360988";
                                string2 = "ca-app-pub-5449278086868932/7851638700";
                                string4 = "167101606757479_1251067698360859";
                                bl = false;
                            } else {
                                string3 = "ca-app-pub-5449278086868932/5875733127";
                                string5 = "167101606757479_1251066408360988";
                                string2 = "ca-app-pub-5449278086868932/7851638700";
                                string4 = "167101606757479_1251067698360859";
                            }
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout)this.a.findViewById(2131296343);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("isshowad : ");
                            stringBuilder.append(bl);
                            Log.d((String)"City_tab", (String)stringBuilder.toString());
                            if (bl) {
                                WebUI webUI = this.a;
                                WebUI.a(webUI, c.a(webUI.c, (View)linearLayout, string3, string5, string2, string4, 3, this.a));
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("adViewHomeScreen : ");
                            stringBuilder2.append((Object)WebUI.c(this.a));
                            Log.d((String)"City_tab", (String)stringBuilder2.toString());
                        }
                    }

                    @android.annotation.TargetApi(value=21)
                    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                        if (WebUI.f(this.a) != null) {
                            WebUI.f(this.a).onReceiveValue(null);
                            WebUI.a(this.a, null);
                        }
                        this.a.k = valueCallback;
                        Intent intent = Build.VERSION.SDK_INT >= 21 ? fileChooserParams.createIntent() : null;
                        try {
                            this.a.startActivityForResult(intent, 1);
                            return true;
                        }
                        catch (android.content.ActivityNotFoundException activityNotFoundException) {
                            WebUI.a(this.a, null);
                            android.widget.Toast.makeText((Context)this.a.getApplicationContext(), (CharSequence)"Cannot Open File Chooser", (int)1).show();
                            return false;
                        }
                    }
                });
                if (this.g) {
                    Log.d((String)"1122", (String)"1122  ishtmldataavailable ");
                    this.a.setVisibility(0);
                    this.a.loadData(this.b.f, "text/html", "UTF-8");
                } else if (!this.f && !this.b()) {
                    n.d((Context)this, "Check Internet");
                    this.finish();
                } else if (this.b != null && this.b.a != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("load.. webUIData.url : ");
                    stringBuilder.append(this.b.a);
                    Log.d((String)"WebUI", (String)stringBuilder.toString());
                    this.a.loadUrl(this.b.a);
                }
            }
            if (this.getIntent().hasExtra("BIG_CLOSE_BUTTON")) {
                this.findViewById(2131297030).setVisibility(0);
                this.findViewById(2131296395).setVisibility(8);
                textView2.setVisibility(8);
            }
            if (this.b.a != null && this.b.a.contains((CharSequence)"manoranjan")) {
                Log.d((String)"subscribelog", (String)"natak screen");
                this.e();
            }
            View view = this.findViewById(16908290);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("1111 rootView: ");
            stringBuilder.append((Object)view);
            Log.d((String)"1111", (String)stringBuilder.toString());
            if (view == null) return;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, view){
                final /* synthetic */ View a;
                final /* synthetic */ WebUI b;
                {
                    this.b = webUI;
                    this.a = view;
                }

                public void onGlobalLayout() {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    this.a.getWindowVisibleDisplayFrame(rect);
                    int n2 = this.a.getRootView().getHeight();
                    double d2 = n2 - rect.bottom;
                    double d3 = n2;
                    java.lang.Double.isNaN((double)d3);
                    if (d2 > d3 * 0.15) {
                        this.b.d();
                        return;
                    }
                    this.b.c();
                }
            });
            return;
        }
        catch (Exception exception) {
            this.finish();
            exception.printStackTrace();
        }
    }

    protected void onDestroy() {
        com.mobond.mindicator.a.a a2;
        c.c(this.n);
        WebView webView = this.a;
        if (webView != null) {
            webView.getSettings().setBuiltInZoomControls(true);
            this.a.clearCache(true);
            this.a.destroy();
        }
        if ((a2 = this.q) != null) {
            a2.a();
        }
        ((ViewGroup)this.getWindow().getDecorView()).removeAllViews();
        super.onDestroy();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        WebView webView = this.a;
        if (webView != null && n2 == 4 && webView.canGoBack()) {
            this.a.goBack();
            return true;
        }
        return super.onKeyDown(n2, keyEvent);
    }

    public void onNextClicked(View view) {
        this.finish();
    }

    public void onPause() {
        super.onPause();
        c.b(this.n);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 107 && arrn.length > 0 && arrn[0] == 0) {
            this.p.performClick();
            return;
        }
        if (!androidx.core.app.a.a((Activity)this, (String)arrstring[0])) {
            com.mobond.mindicator.a.a(this.c).b(Arrays.toString((Object[])arrstring), true);
        }
    }

    public void onResume() {
        super.onResume();
        c.a(this.n);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

}

