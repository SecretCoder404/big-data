/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.webkit.CookieManager
 *  android.webkit.SslErrorHandler
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParser
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.mobond.mindicator.ui.indianrail.irplugin;

import android.app.Activity;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
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
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RunningStatusWeb {
    private Activity activity;
    private CommonCallbacks commonCallbacks;
    private String response = null;
    private String trainNO = "";
    public String url = "https://enquiry.indianrail.gov.in/ntes/i.html";
    private WebView wb;
    private WebViewClient webClient = new WebViewClient(){

        public void onPageFinished(WebView webView, String string) {
            RunningStatusWeb.this.inputTrainNumberusingJS();
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            RunningStatusWeb.this.reloadonUIthread();
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            RunningStatusWeb.this.reloadonUIthread();
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            RunningStatusWeb.this.reloadonUIthread();
        }

        /*
         * Exception decompiling
         */
        public WebResourceResponse shouldInterceptRequest(WebView var1, WebResourceRequest var2) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl79 : ACONST_NULL : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:919)
            throw new IllegalStateException("Decompilation failed");
        }
    };

    public RunningStatusWeb(Activity activity, String string, CommonCallbacks commonCallbacks, WebView webView) {
        this.activity = activity;
        this.trainNO = string.trim();
        this.commonCallbacks = commonCallbacks;
        this.wb = webView;
    }

    static /* synthetic */ WebResourceResponse access$000(RunningStatusWeb runningStatusWeb, WebResourceRequest webResourceRequest) {
        return runningStatusWeb.getWebResourceResponse(webResourceRequest);
    }

    private void androidKeyPressandRelease(final int n2, final long l2) {
        RunningStatusWeb runningStatusWeb = this;
        synchronized (runningStatusWeb) {
            if (n2 != 0) {
                new Thread(){

                    /*
                     * Exception decompiling
                     */
                    public void run() {
                        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl67.1 : RETURN : trying to set 1 previously set to 0
                        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                        // org.benf.cfr.reader.entities.g.p(Method.java:396)
                        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                        // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                        // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
                        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
                        // org.benf.cfr.reader.b.a(Driver.java:128)
                        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
                        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
                        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
                        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
                        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
                        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
                        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
                        // java.lang.Thread.run(Thread.java:919)
                        throw new IllegalStateException("Decompilation failed");
                    }
                }.start();
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private int getKeyEventFromNumber(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl109.1 : ICONST_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private WebResourceResponse getWebResourceResponse(WebResourceRequest var1_1) {
        if (Build.VERSION.SDK_INT >= 21) {
            var2_2 = var1_1.getUrl().toString();
            var3_3 = var1_1.getUrl().getHost();
            var4_4 = CookieManager.getInstance().getCookie(var1_1.getUrl().toString());
            var5_5 = var1_1.getRequestHeaders();
        } else {
            var2_2 = null;
            var3_3 = null;
            var4_4 = null;
            var5_5 = null;
        }
        var6_6 = IRParserProvider.getIRParser().getRunningStatusFromWeb(var2_2, var3_3, var4_4, var5_5);
        var7_7 = new ByteArrayInputStream((byte[])var6_6[1]);
        this.response = (String)var6_6[0];
        var8_8 = new IRParser().parseRunningStatus(this.response);
        try {
            var10_9 = new IRParser().uploadRunningStatustoMobond(var8_8, true, this.trainNO);
            ** GOTO lbl23
        }
        catch (Exception var9_10) {
            try {
                var9_10.printStackTrace();
                var10_9 = null;
lbl23: // 2 sources:
                this.commonCallbacks.onSuccess(var10_9);
                this.stopWebView();
                if (Build.VERSION.SDK_INT < 21) return null;
                var11_11 = (Map)var6_6[2];
                var12_12 = new HashMap();
                var13_13 = var11_11.entrySet().iterator();
                while (var13_13.hasNext() != false) {
                    var15_14 = (Map.Entry)var13_13.next();
                    var12_12.put(var15_14.getKey(), ((List)var15_14.getValue()).get(0));
                }
                return new WebResourceResponse("image/png", "deflate", 200, "OK", (Map)var12_12, (InputStream)var7_7);
            }
            catch (Exception v0) {
                this.reloadonUIthread();
                return null;
            }
        }
    }

    private void inputTrainNumberusingJS() {
        if (Build.VERSION.SDK_INT >= 19) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("javascript:document.getElementById('trainInput').value='");
            String string = this.trainNO;
            stringBuilder.append(string.substring(0, -1 + string.length()));
            stringBuilder.append("';");
            String string2 = stringBuilder.toString();
            this.wb.evaluateJavascript(string2, (ValueCallback)new ValueCallback<String>(){

                public void onReceiveValue(String string) {
                    RunningStatusWeb runningStatusWeb = RunningStatusWeb.this;
                    runningStatusWeb.androidKeyPressandRelease(runningStatusWeb.getKeyEventFromNumber(runningStatusWeb.trainNO.substring(-1 + RunningStatusWeb.this.trainNO.length())), 2000L);
                }
            });
        }
    }

    private void reloadonUIthread() {
        if (this.response == null) {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    RunningStatusWeb.this.wb.reload();
                }
            });
        }
    }

    private void stopWebView() {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                RunningStatusWeb.this.wb.setWebViewClient(null);
                RunningStatusWeb.this.wb.stopLoading();
            }
        });
    }

    public void start() {
        this.wb.getSettings().setJavaScriptEnabled(true);
        this.wb.getSettings().setSupportZoom(true);
        this.wb.getSettings().setBuiltInZoomControls(true);
        this.wb.setWebViewClient(this.webClient);
        this.wb.loadUrl(this.url);
    }

}

