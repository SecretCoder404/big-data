/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.webkit.CookieManager
 *  android.webkit.SslErrorHandler
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package com.mobond.mindicator.ui.indianrail.irplugin;

import android.app.Activity;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mobond.mindicator.ui.indianrail.irplugin.CommonCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

public class CancelNReschuduledTrains {
    private static final String CANCTAG = "CANCTAG";
    private String CANCELLEDTRAINTYPE = "CANCELLEDTRAINTYPE";
    private String DIVERTEDTRAINTYPE = "DIVERTEDTRAINTYPE";
    private String RESCHEDULEDTRAINTYPE = "RESCHEDULEDTRAINTYPE";
    private Activity activity;
    private String cancelTrainResponse = null;
    private CommonCallbacks commonCallbacks;
    private String divertedTrainResponse = null;
    private String reScheduledTrainResponse = null;
    private String url = "https://enquiry.indianrail.gov.in/ntes/i.html";
    private WebView wb;
    private WebViewClient webViewClient = new WebViewClient(){

        public void onPageFinished(WebView webView, String string) {
            super.onPageFinished(webView, string);
            if (CancelNReschuduledTrains.this.cancelTrainResponse == null) {
                CancelNReschuduledTrains.this.clickOnCancelledTrainTab();
                return;
            }
            if (CancelNReschuduledTrains.this.reScheduledTrainResponse == null) {
                CancelNReschuduledTrains.this.clickOnRescheduleTrainTab();
                return;
            }
            if (CancelNReschuduledTrains.this.divertedTrainResponse == null) {
                CancelNReschuduledTrains.this.clickOnDivertedTrainTab();
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceivedError ");
            stringBuilder.append((Object)webResourceError);
            Log.d((String)CancelNReschuduledTrains.CANCTAG, (String)stringBuilder.toString());
            CancelNReschuduledTrains.this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    CancelNReschuduledTrains.this.wb.reload();
                }
            });
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceivedError ");
            stringBuilder.append((Object)webResourceResponse);
            Log.d((String)CancelNReschuduledTrains.CANCTAG, (String)stringBuilder.toString());
            CancelNReschuduledTrains.this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    CancelNReschuduledTrains.this.wb.reload();
                }
            });
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceivedSslError ");
            stringBuilder.append((Object)sslError);
            Log.d((String)CancelNReschuduledTrains.CANCTAG, (String)stringBuilder.toString());
            CancelNReschuduledTrains.this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    CancelNReschuduledTrains.this.wb.reload();
                }
            });
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT >= 21) {
                Log.d((String)"URLS", (String)webResourceRequest.getUrl().toString());
                WebResourceResponse webResourceResponse = super.shouldInterceptRequest(webView, webResourceRequest);
                if (!(webResourceRequest.getUrl().toString().contains((CharSequence)".jpg") || webResourceRequest.getUrl().toString().contains((CharSequence)".gif") || webResourceRequest.getUrl().toString().contains((CharSequence)".png") || webResourceRequest.getUrl().toString().contains((CharSequence)".jpeg") || webResourceRequest.getUrl().toString().contains((CharSequence)".svg"))) {
                    if (webResourceRequest.getUrl().toString().contains((CharSequence)"action=showAllCancelledTrain")) {
                        try {
                            WebResourceResponse webResourceResponse2 = CancelNReschuduledTrains.this.getWebResourceResponse(webResourceRequest, CancelNReschuduledTrains.this.CANCELLEDTRAINTYPE, webResourceResponse);
                            return webResourceResponse2;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("EXCEPTION ");
                            stringBuilder.append(exception.getMessage());
                            Log.d((String)CancelNReschuduledTrains.CANCTAG, (String)stringBuilder.toString());
                        }
                    } else if (webResourceRequest.getUrl().toString().contains((CharSequence)"action=showAllRescheduledTrains")) {
                        try {
                            WebResourceResponse webResourceResponse3 = CancelNReschuduledTrains.this.getWebResourceResponse(webResourceRequest, CancelNReschuduledTrains.this.RESCHEDULEDTRAINTYPE, webResourceResponse);
                            return webResourceResponse3;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("EXCEPTION ");
                            stringBuilder.append(exception.getMessage());
                            Log.d((String)CancelNReschuduledTrains.CANCTAG, (String)stringBuilder.toString());
                        }
                    } else if (webResourceRequest.getUrl().toString().contains((CharSequence)"action=showAllDivertedTrains")) {
                        try {
                            WebResourceResponse webResourceResponse4 = CancelNReschuduledTrains.this.getWebResourceResponse(webResourceRequest, CancelNReschuduledTrains.this.DIVERTEDTRAINTYPE, webResourceResponse);
                            return webResourceResponse4;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("EXCEPTION ");
                            stringBuilder.append(exception.getMessage());
                            Log.d((String)CancelNReschuduledTrains.CANCTAG, (String)stringBuilder.toString());
                        }
                    }
                } else {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                    WebResourceResponse webResourceResponse5 = new WebResourceResponse("image/png", "deflate", 200, "OK", webResourceRequest.getRequestHeaders(), (InputStream)byteArrayInputStream);
                    return webResourceResponse5;
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

    };

    public CancelNReschuduledTrains(Activity activity, CommonCallbacks commonCallbacks, WebView webView) {
        this.activity = activity;
        this.commonCallbacks = commonCallbacks;
        this.wb = webView;
    }

    private void clickOnCancelledTrainTab() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.wb.evaluateJavascript("document.getElementById('tabs').getElementsByTagName('ul')[0].getElementsByTagName('li')[4].getElementsByTagName('a')[0].click()", (ValueCallback)new ValueCallback<String>(){

                public void onReceiveValue(String string) {
                }
            });
        }
    }

    private void clickOnDivertedTrainTab() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.wb.evaluateJavascript("document.getElementById('tabs').getElementsByTagName('ul')[0].getElementsByTagName('li')[6].getElementsByTagName('a')[0].click()", (ValueCallback)new ValueCallback<String>(){

                public void onReceiveValue(String string) {
                }
            });
        }
    }

    private void clickOnRescheduleTrainTab() {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                if (Build.VERSION.SDK_INT >= 19) {
                    CancelNReschuduledTrains.this.wb.evaluateJavascript("document.getElementById('tabs').getElementsByTagName('ul')[0].getElementsByTagName('li')[5].getElementsByTagName('a')[0].click()", (ValueCallback)new ValueCallback<String>(){

                        public void onReceiveValue(String string) {
                        }
                    });
                }
            }

        });
    }

    private WebResourceResponse getWebResourceResponse(WebResourceRequest webResourceRequest, String string, WebResourceResponse webResourceResponse) {
        String string2;
        String string3;
        Map map;
        String string4;
        String string5;
        if (Build.VERSION.SDK_INT >= 21) {
            String string6 = webResourceRequest.getUrl().toString();
            String string7 = webResourceRequest.getUrl().getHost();
            String string8 = CookieManager.getInstance().getCookie(webResourceRequest.getUrl().toString());
            map = webResourceRequest.getRequestHeaders();
            string3 = string7;
            string2 = string6;
            string5 = "https://enquiry.indianrail.gov.in/ntes/i.html";
            string4 = string8;
        } else {
            string2 = null;
            string3 = null;
            string4 = null;
            string5 = null;
            map = null;
        }
        Object[] arrobject = IRParserProvider.getIRParser().requestCancelledNRescheduleTrains(string2, string3, string4, string5, map);
        String string9 = (String)arrobject[0];
        if (string.equals((Object)this.CANCELLEDTRAINTYPE)) {
            if (this.isResponseSuccess(string9)) {
                this.cancelTrainResponse = string9;
            }
        } else if (string.equals((Object)this.RESCHEDULEDTRAINTYPE)) {
            if (this.isResponseSuccess(string9)) {
                this.reScheduledTrainResponse = string9;
            }
        } else if (string.equals((Object)this.DIVERTEDTRAINTYPE) && this.isResponseSuccess(string9)) {
            this.divertedTrainResponse = string9;
        }
        if (this.cancelTrainResponse == null) {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    CancelNReschuduledTrains.this.wb.reload();
                }
            });
        } else if (this.reScheduledTrainResponse == null) {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    CancelNReschuduledTrains.this.clickOnRescheduleTrainTab();
                }
            });
        } else if (this.divertedTrainResponse == null) {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    CancelNReschuduledTrains.this.clickOnDivertedTrainTab();
                }
            });
        } else {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    CancelNReschuduledTrains.this.wb.setWebViewClient(null);
                    CancelNReschuduledTrains.this.wb.stopLoading();
                }
            });
            String string10 = IRParserProvider.getIRParser().getCancelledRescheduledTrains(this.cancelTrainResponse, this.reScheduledTrainResponse, this.divertedTrainResponse);
            this.commonCallbacks.onSuccess(string10);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response  ");
        stringBuilder.append((String)arrobject[0]);
        Log.d((String)CANCTAG, (String)stringBuilder.toString());
        return webResourceResponse;
    }

    private boolean isResponseSuccess(String string) {
        return !string.contains((CharSequence)"location.reload") && !string.contains((CharSequence)"Error 404 Page Not Found");
        {
        }
    }

    public void start() {
        this.wb.getSettings().setJavaScriptEnabled(true);
        this.wb.getSettings().setSupportZoom(true);
        this.wb.getSettings().setBuiltInZoomControls(true);
        this.wb.setWebViewClient(this.webViewClient);
        this.wb.loadUrl(this.url);
    }

}

