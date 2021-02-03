/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.CookieManager
 *  android.webkit.SslErrorHandler
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ProgressBar
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParser
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.irplugin;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.irplugin.PNRCallbacks;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class PNRWebResult {
    private String PNRTag = "PNRTAG";
    private long TIMEOUT = 15000L;
    private Activity activity;
    private Dialog dialog;
    private String imageResult = "";
    private boolean iscalled;
    private String pnr;
    private PNRCallbacks pnrCallbacks;
    private int progress = 0;
    private ProgressBar progressBar;
    private String response = null;
    private Thread thread;
    public final String url = "http://www.indianrail.gov.in";
    private WebView wb;
    private WebViewClient webClient = new WebViewClient(){

        public void onPageFinished(WebView webView, String string) {
            if (!PNRWebResult.this.iscalled) {
                PNRWebResult.this.iscalled = true;
                PNRWebResult.this.focusPNRfield();
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT >= 23) {
                String string = PNRWebResult.this.PNRTag;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onReceivedError CODE : ");
                stringBuilder.append(webResourceError.getErrorCode());
                stringBuilder.append(" DESCRIPTION : ");
                stringBuilder.append((Object)webResourceError.getDescription());
                Log.d((String)string, (String)stringBuilder.toString());
            }
            PNRWebResult.this.reloadonUIthread();
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (Build.VERSION.SDK_INT >= 21) {
                String string = PNRWebResult.this.PNRTag;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onReceivedHttpError Code");
                stringBuilder.append(webResourceResponse.getStatusCode());
                stringBuilder.append(" Data :");
                stringBuilder.append((Object)webResourceResponse.getData());
                Log.d((String)string, (String)stringBuilder.toString());
            }
            PNRWebResult.this.reloadonUIthread();
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            String string = PNRWebResult.this.PNRTag;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceivedError getPrimaryError : ");
            stringBuilder.append(sslError.getPrimaryError());
            Log.d((String)string, (String)stringBuilder.toString());
            PNRWebResult.this.reloadonUIthread();
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String string;
            if (Build.VERSION.SDK_INT >= 21) {
                block13 : {
                    block12 : {
                        block11 : {
                            block10 : {
                                string = webResourceRequest.getUrl().toString();
                                Log.d((String)PNRWebResult.this.PNRTag, (String)string);
                                PNRWebResult.this.setNewTimeOut();
                                if (!webResourceRequest.getUrl().toString().contains((CharSequence)"refresh.jpg")) break block10;
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                                WebResourceResponse webResourceResponse = new WebResourceResponse("image/png", "deflate", 200, "OK", webResourceRequest.getRequestHeaders(), (InputStream)byteArrayInputStream);
                                return webResourceResponse;
                            }
                            if (!webResourceRequest.getUrl().toString().contains((CharSequence)"www.google-analytics.com")) break block11;
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                            WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "deflate", 200, "OK", webResourceRequest.getRequestHeaders(), (InputStream)byteArrayInputStream);
                            return webResourceResponse;
                        }
                        if (!webResourceRequest.getUrl().toString().contains((CharSequence)"favicon.ico")) break block12;
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                        WebResourceResponse webResourceResponse = new WebResourceResponse("image/png", "deflate", 200, "OK", webResourceRequest.getRequestHeaders(), (InputStream)byteArrayInputStream);
                        return webResourceResponse;
                    }
                    if (!webResourceRequest.getUrl().toString().contains((CharSequence)"CaptchaConfig")) break block13;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{1});
                    WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "deflate", 200, "OK", webResourceRequest.getRequestHeaders(), (InputStream)byteArrayInputStream);
                    return webResourceResponse;
                }
                try {
                    if (webResourceRequest.getUrl().toString().contains((CharSequence)"captchaDraw.png")) {
                        Log.d((String)PNRWebResult.this.PNRTag, (String)"captcha url called");
                        PNRWebResult.this.incrementProgress(10);
                        return PNRWebResult.this.getWebResourceResponseForCaptcha(webResourceRequest);
                    }
                    if (webResourceRequest.getUrl().toString().contains((CharSequence)"CommonCaptcha?inputCaptcha")) {
                        Log.d((String)PNRWebResult.this.PNRTag, (String)"CommonCaptcha?inputCaptcha url called");
                        PNRWebResult.this.incrementProgress(10);
                        return PNRWebResult.this.getWebResourceResponseForPNRResult(webResourceRequest);
                    }
                    WebResourceResponse webResourceResponse = super.shouldInterceptRequest(webView, string);
                    return webResourceResponse;
                }
                catch (Exception exception) {
                    String string2 = PNRWebResult.this.PNRTag;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("EXCEPTION 1 ");
                    stringBuilder.append(exception.getMessage());
                    Log.d((String)string2, (String)stringBuilder.toString());
                    PNRWebResult.this.reloadonUIthread();
                }
            } else {
                string = null;
            }
            return super.shouldInterceptRequest(webView, string);
        }
    };

    public PNRWebResult(String string, Activity activity, PNRCallbacks pNRCallbacks) {
        this.activity = activity;
        this.pnr = string;
        this.pnrCallbacks = pNRCallbacks;
    }

    private void androidKeyPressandRelease(final int n2) {
        PNRWebResult pNRWebResult = this;
        synchronized (pNRWebResult) {
            this.wb.post(new Runnable(){

                public void run() {
                    PNRWebResult.this.wb.dispatchKeyEvent(new KeyEvent(0, n2));
                    PNRWebResult.this.wb.dispatchKeyEvent(new KeyEvent(1, n2));
                }
            });
            return;
        }
    }

    private boolean checkResponseIsSuccess(String string) {
        block3 : {
            block4 : {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (!jSONObject.has("errorMessage")) break block3;
                    if (!jSONObject.getString("errorMessage").toLowerCase().contains((CharSequence)"invalid")) break block4;
                    return false;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                    return false;
                }
            }
            String string2 = this.PNRTag;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error Response ");
            stringBuilder.append(string);
            Log.d((String)string2, (String)stringBuilder.toString());
        }
        return true;
    }

    private void focusPNRfield() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.wb.evaluateJavascript("javascript:document.getElementById('inputPnrNo').focus()", (ValueCallback)new ValueCallback<String>(){

                public void onReceiveValue(String string) {
                    PNRWebResult pNRWebResult = PNRWebResult.this;
                    pNRWebResult.inputUsingKeyEventInWebview(pNRWebResult.pnr, "javascript:document.getElementById('modal1').click()");
                }
            });
        }
    }

    private WebResourceResponse function(WebResourceResponse webResourceResponse, WebResourceRequest webResourceRequest, Object[] arrobject) {
        this.onUIThread(arrobject);
        return webResourceResponse;
    }

    private int getKeyEventFromNumber(String string) {
        int[] arrn = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrn2 = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            if (Integer.parseInt((String)string) != arrn[i2]) continue;
            return arrn2[i2];
        }
        return 0;
    }

    private long getRandomMillis() {
        double d2 = Math.random();
        double d3 = 500;
        Double.isNaN((double)d3);
        int n2 = 500 + (int)(d2 * d3);
        String string = this.PNRTag;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Random ");
        stringBuilder.append(n2);
        Log.d((String)string, (String)stringBuilder.toString());
        return n2;
    }

    private WebResourceResponse getWebResourceResponseForCaptcha(WebResourceRequest webResourceRequest) {
        String string;
        String string2;
        WebResourceResponse webResourceResponse;
        String string3;
        String string4;
        Map map;
        if (Build.VERSION.SDK_INT >= 21) {
            String string5 = webResourceRequest.getUrl().toString();
            String string6 = webResourceRequest.getUrl().getHost();
            String string7 = CookieManager.getInstance().getCookie(webResourceRequest.getUrl().toString());
            Map map2 = webResourceRequest.getRequestHeaders();
            string3 = string5;
            string4 = string6;
            string = "http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en";
            string2 = string7;
            map = map2;
        } else {
            string3 = null;
            string4 = null;
            string2 = null;
            string = null;
            map = null;
        }
        Object[] arrobject = IRParserProvider.getIRParser().getPNRorSeatAvailCaptchaResults(string3, string4, string2, string, map);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])arrobject[1]);
        if (Build.VERSION.SDK_INT >= 21) {
            Map map3 = (Map)arrobject[2];
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map3.entrySet()) {
                hashMap.put(entry.getKey(), ((List)entry.getValue()).get(0));
            }
            webResourceResponse = new WebResourceResponse("image/png", "deflate", 200, "OK", (Map)hashMap, (InputStream)byteArrayInputStream);
        } else {
            webResourceResponse = null;
        }
        this.incrementProgress(10);
        return this.function(webResourceResponse, webResourceRequest, arrobject);
    }

    private WebResourceResponse getWebResourceResponseForPNRResult(WebResourceRequest webResourceRequest) {
        String string;
        Map map;
        String string2;
        String string3;
        String string4;
        if (Build.VERSION.SDK_INT >= 21) {
            String string5 = webResourceRequest.getUrl().toString();
            String string6 = webResourceRequest.getUrl().getHost();
            String string7 = CookieManager.getInstance().getCookie(webResourceRequest.getUrl().toString());
            map = webResourceRequest.getRequestHeaders();
            string3 = string5;
            string4 = string6;
            string = "http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en";
            string2 = string7;
        } else {
            string3 = null;
            string4 = null;
            string2 = null;
            string = null;
            map = null;
        }
        Object[] arrobject = IRParserProvider.getIRParser().requestPNR(string3, string4, string2, string, map);
        this.progressBar.setProgress(100);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])arrobject[1]);
        this.response = (String)arrobject[0];
        this.dialog.dismiss();
        String string8 = this.PNRTag;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("response  ");
        stringBuilder.append(this.response);
        Log.d((String)string8, (String)stringBuilder.toString());
        this.pnrCallbacks.onSuccess(new IRParser().getMobondFormatPnrResult(this.response));
        if (!this.checkResponseIsSuccess(this.response)) {
            this.redirectToChrome();
        }
        this.destroyWebView();
        if (Build.VERSION.SDK_INT >= 21) {
            Map map2 = (Map)arrobject[2];
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map2.entrySet()) {
                hashMap.put(entry.getKey(), ((List)entry.getValue()).get(0));
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse("image/png", "deflate", 200, "OK", (Map)hashMap, (InputStream)byteArrayInputStream);
            return webResourceResponse;
        }
        return null;
    }

    private void incrementProgress(int n2) {
        this.progress = n2 + this.progress;
        this.progressBar.setProgress(this.progress);
    }

    private void inputUsingKeyEventInWebview(final String string, final String string2) {
        this.thread = new Thread(){

            public void run() {
                int n2 = 0;
                do {
                    if (n2 >= string.length()) break;
                    10.sleep((long)PNRWebResult.this.getRandomMillis());
                    PNRWebResult.this.setNewTimeOut();
                    int n3 = n2 + 1;
                    String string3 = n3 != string.length() ? string.substring(n2, n3) : string.substring(n2);
                    int n4 = PNRWebResult.this.getKeyEventFromNumber(string3);
                    PNRWebResult.this.androidKeyPressandRelease(n4);
                    PNRWebResult.this.incrementProgress(3);
                    n2 = n3;
                    continue;
                    break;
                } while (true);
                try {
                    if (string2 != null) {
                        10.sleep((long)PNRWebResult.this.getRandomMillis());
                        PNRWebResult.this.performJSonUIThread(string2);
                        return;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        };
        this.thread.start();
    }

    private void onUIThread(Object[] arrobject) {
        String string = IRParser.Base64.byteArrayToBase64((byte[])arrobject[1]);
        try {
            this.imageResult = IRParserProvider.getIRParser().getImageResultFromMobond(this.pnr, string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.performJSClickandGetPNRStatus(this.imageResult);
    }

    private void performJSClickandGetPNRStatus(final String string) {
        try {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    if (Build.VERSION.SDK_INT >= 19) {
                        PNRWebResult.this.wb.evaluateJavascript("javascript:document.getElementById('inputCaptcha').value='';document.getElementById('inputCaptcha').focus()", (ValueCallback)new ValueCallback<String>(){

                            public void onReceiveValue(String string) {
                                PNRWebResult.this.inputUsingKeyEventInWebview(string, "javascript:document.getElementById('submitPnrNo').click()");
                            }
                        });
                    }
                }

            });
            return;
        }
        catch (Exception exception) {
            exception.getMessage();
            Log.d((String)this.PNRTag, (String)exception.getMessage());
            return;
        }
    }

    private void performJSonUIThread(final String string) {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                if (string != null && Build.VERSION.SDK_INT >= 19) {
                    PNRWebResult.this.wb.evaluateJavascript(string, (ValueCallback)new ValueCallback<String>(){

                        public void onReceiveValue(String string) {
                        }
                    });
                }
            }

        });
        this.setNewTimeOut();
    }

    private void redirectToChrome() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)"googlechrome://navigate?url=http://www.indianrail.gov.in"));
        if (intent.resolveActivity(this.activity.getPackageManager()) == null) {
            intent.setData(Uri.parse((String)"http://www.indianrail.gov.in"));
        }
        this.activity.startActivity(intent);
    }

    private void reloadonUIthread() {
        if (this.response == null) {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    if (PNRWebResult.this.wb != null) {
                        PNRWebResult.this.progress = 0;
                        PNRWebResult.this.incrementProgress(10);
                        PNRWebResult.this.wb.reload();
                        Log.d((String)PNRWebResult.this.PNRTag, (String)"Reloaded");
                    }
                }
            });
        }
    }

    private void setNewTimeOut() {
    }

    public void destroyWebView() {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                PNRWebResult.this.wb.setWebViewClient(null);
                PNRWebResult.this.wb.stopLoading();
                PNRWebResult.this.wb.destroy();
                PNRWebResult.this.dialog.dismiss();
            }
        });
    }

    public void start() {
        this.iscalled = false;
        this.dialog = new Dialog((Context)this.activity);
        this.dialog.setContentView(2131493156);
        this.dialog.show();
        this.wb = (WebView)this.dialog.findViewById(2131297677);
        this.progressBar = (ProgressBar)this.dialog.findViewById(2131297127);
        this.incrementProgress(10);
        this.dialog.findViewById(2131296488).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PNRWebResult.this.destroyWebView();
            }
        });
        this.dialog.findViewById(2131296522).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PNRWebResult.this.pnrCallbacks.onPNRviaSMSRequest();
            }
        });
        this.wb.getSettings().setJavaScriptEnabled(true);
        this.wb.getSettings().setSupportZoom(true);
        this.wb.getSettings().setBuiltInZoomControls(true);
        this.wb.setWebViewClient(new WebViewClient(){

            public void onPageFinished(WebView webView, String string) {
                super.onPageFinished(webView, string);
                Log.d((String)PNRWebResult.this.PNRTag, (String)"1st PAGE FINISHED");
                PNRWebResult.this.incrementProgress(10);
                if (Build.VERSION.SDK_INT >= 19) {
                    PNRWebResult.this.wb.evaluateJavascript("$('#bs-example-navbar-collapse-1').collapse('toggle');", (ValueCallback)new ValueCallback<String>(){

                        public void onReceiveValue(String string) {
                            PNRWebResult.this.wb.evaluateJavascript("document.getElementById('bs-example-navbar-collapse-1').getElementsByTagName('ul')[0].getElementsByTagName('li')[0].getElementsByTagName('a')[0].click()", (ValueCallback)new ValueCallback<String>(){

                                public void onReceiveValue(String string) {
                                    PNRWebResult.this.wb.setWebViewClient(PNRWebResult.this.webClient);
                                    PNRWebResult.this.incrementProgress(10);
                                }
                            });
                        }

                    });
                }
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (Build.VERSION.SDK_INT >= 23) {
                    String string = PNRWebResult.this.PNRTag;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onReceivedError Code : ");
                    stringBuilder.append(webResourceError.getErrorCode());
                    stringBuilder.append(" Description : ");
                    stringBuilder.append((Object)webResourceError.getDescription());
                    Log.d((String)string, (String)stringBuilder.toString());
                }
                PNRWebResult.this.reloadonUIthread();
            }

            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (Build.VERSION.SDK_INT >= 21) {
                    String string = PNRWebResult.this.PNRTag;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onReceivedHttpError Code");
                    stringBuilder.append(webResourceResponse.getStatusCode());
                    stringBuilder.append(" Data :");
                    stringBuilder.append((Object)webResourceResponse.getData());
                    Log.d((String)string, (String)stringBuilder.toString());
                }
                PNRWebResult.this.reloadonUIthread();
            }

            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                String string = PNRWebResult.this.PNRTag;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onReceivedError getPrimaryError : ");
                stringBuilder.append(sslError.getPrimaryError());
                Log.d((String)string, (String)stringBuilder.toString());
                PNRWebResult.this.reloadonUIthread();
            }

            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                String string;
                PNRWebResult.this.setNewTimeOut();
                if (Build.VERSION.SDK_INT >= 21) {
                    string = webResourceRequest.getUrl().toString();
                    Log.d((String)PNRWebResult.this.PNRTag, (String)string);
                    if (string.contains((CharSequence)".gif") || string.contains((CharSequence)".jpg") || string.contains((CharSequence)".ico") || string.contains((CharSequence)"google-analytics") || string.contains((CharSequence)".css")) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                        WebResourceResponse webResourceResponse = new WebResourceResponse("image/png", "deflate", 200, "OK", webResourceRequest.getRequestHeaders(), (InputStream)byteArrayInputStream);
                        return webResourceResponse;
                    }
                } else {
                    string = null;
                }
                return super.shouldInterceptRequest(webView, string);
            }

        });
        this.dialog.setOnDismissListener(new DialogInterface.OnDismissListener(){

            public void onDismiss(DialogInterface dialogInterface) {
            }
        });
        this.wb.loadUrl("http://www.indianrail.gov.in");
        this.setNewTimeOut();
    }

}

