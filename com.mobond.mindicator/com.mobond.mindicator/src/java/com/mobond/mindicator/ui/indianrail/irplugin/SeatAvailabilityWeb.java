/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParser
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.zip.GZIPInputStream
 */
package com.mobond.mindicator.ui.indianrail.irplugin;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.d;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.irplugin.SeatAvailabilityInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public class SeatAvailabilityWeb {
    private final String CAPTCHAID = "inputCaptcha";
    private final String CAPTCHASUBMITID = "test";
    private String CLASS = "";
    private final String CLASSACTION = "CLASSACTION";
    private final String CLASSID = "class";
    private final String DATEID = "dt";
    private String DEST = "";
    private final String DESTACTION = "DESTACTION";
    private final String DESTID = "destinationStation";
    private final String QUOTAID = "quota";
    private String SEATAVAILTAG = "SEATAVAILTAG";
    private String SOURCE = "";
    private final String SOURCEACTION = "SOURCEACTION";
    private final String SOURCEID = "sourceStation";
    private final String SUBMITID = "modal1";
    private final String TRAINNOID = "trainNo";
    private String TRAINNOWITHNAME = "";
    private Activity activity;
    private String classStr;
    private String classesStr;
    private String[] classesStrArray;
    private int count = 0;
    private int dayOfMonth;
    private String fromStation;
    private String imageResult = "";
    private int month;
    private String response = null;
    private SeatAvailabilityInterface seatAvailabilityInterface;
    private String toStation;
    private String trainNum;
    private final String url = "http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html";
    private ValueCallback valueCallback = new ValueCallback(){

        public void onReceiveValue(Object object) {
        }
    };
    WebView wb;
    private WebViewClient webClient = new WebViewClient(){

        public void onPageFinished(WebView webView, String string) {
            SeatAvailabilityWeb.this.focusNEnterTrainNumber();
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append((Object)webResourceError);
            Log.d((String)"Error", (String)stringBuilder.toString());
            SeatAvailabilityWeb.this.reloadonUIthread();
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (webResourceRequest.getUrl().toString().contains((CharSequence)"captchaDraw.png")) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(SeatAvailabilityWeb.this.SEATAVAILTAG);
                        stringBuilder.append(SeatAvailabilityWeb.lineOut());
                        Log.d((String)stringBuilder.toString(), (String)"captcha url called");
                        return SeatAvailabilityWeb.this.getWebResourceResponseForCaptcha(webResourceRequest);
                    }
                    if (webResourceRequest.getUrl().toString().contains((CharSequence)"CommonCaptcha?inputCaptcha")) {
                        return SeatAvailabilityWeb.this.getWebResourceResponseForSeatAvailability(webResourceRequest);
                    }
                    WebResourceResponse webResourceResponse = super.shouldInterceptRequest(webView, "http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html");
                    return webResourceResponse;
                }
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(SeatAvailabilityWeb.this.SEATAVAILTAG);
                stringBuilder.append(SeatAvailabilityWeb.lineOut());
                String string = stringBuilder.toString();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Exception");
                stringBuilder2.append(exception.getMessage());
                Log.d((String)string, (String)stringBuilder2.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SeatAvailabilityWeb.this.SEATAVAILTAG);
            stringBuilder.append(SeatAvailabilityWeb.lineOut());
            Log.d((String)stringBuilder.toString(), (String)"null");
            return null;
        }
    };

    public SeatAvailabilityWeb(Context context, SeatAvailabilityInterface seatAvailabilityInterface, String string, String string2, int n2, int n3, String string3, String string4, String string5) {
        this.activity = (Activity)context;
        this.seatAvailabilityInterface = seatAvailabilityInterface;
        this.trainNum = string2;
        this.classesStr = string;
        this.dayOfMonth = n2;
        this.month = n3;
        this.fromStation = string3;
        this.toStation = string4;
        this.classStr = string5;
        this.setRealData();
    }

    private void alertonUIthread() {
        try {
            this.activity.runOnUiThread(new Runnable(){

                public void run() {
                    new d.a((Context)SeatAvailabilityWeb.this.activity).a((CharSequence)"RESPONSE").b((CharSequence)SeatAvailabilityWeb.this.response).a(17039370, null).a(true).b().show();
                }
            });
            return;
        }
        catch (Exception exception) {
            this.alertonUIthread();
            return;
        }
    }

    private void androidKeyPressandRelease(final int n2) {
        SeatAvailabilityWeb seatAvailabilityWeb = this;
        synchronized (seatAvailabilityWeb) {
            this.wb.post(new Runnable(){

                public void run() {
                    SeatAvailabilityWeb.this.wb.dispatchKeyEvent(new KeyEvent(0, n2));
                    SeatAvailabilityWeb.this.wb.dispatchKeyEvent(new KeyEvent(1, n2));
                }
            });
            return;
        }
    }

    private boolean checkResponseIsSuccess(String string) {
        return true;
    }

    private void enterImageResultandPerformClick() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:document.getElementById('inputCaptcha').value='");
        stringBuilder.append(this.imageResult);
        stringBuilder.append("';document.getElementById('");
        stringBuilder.append("test");
        stringBuilder.append("').click()");
        final String string = stringBuilder.toString();
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                SeatAvailabilityWeb.this.wb.evaluateJavascript(string, SeatAvailabilityWeb.this.valueCallback);
            }
        });
    }

    private void focusNEnterDEST() {
        this.inputUsingKeyEventInWebview(this.DEST, "CLASSACTION", "destinationStation");
    }

    private void focusNEnterSource() {
        this.inputUsingKeyEventInWebview(this.SOURCE, "DESTACTION", "sourceStation");
    }

    private void focusNEnterTrainNumber() {
        this.inputUsingKeyEventInWebview(this.TRAINNOWITHNAME, "SOURCEACTION", "trainNo");
    }

    private void focusfield(String string, ValueCallback valueCallback) {
        if (Build.VERSION.SDK_INT >= 19) {
            String string2 = this.getJSforElement(string, "focus");
            this.wb.evaluateJavascript(string2, valueCallback);
        }
    }

    private WebResourceResponse function(WebResourceResponse webResourceResponse, WebResourceRequest webResourceRequest, Object[] arrobject) {
        this.getImageResults(arrobject);
        return webResourceResponse;
    }

    private void getImageResults(Object[] arrobject) {
        String string = IRParser.Base64.byteArrayToBase64((byte[])arrobject[1]);
        try {
            this.imageResult = IRParserProvider.getIRParser().getImageResultFromMobond(null, string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.enterImageResultandPerformClick();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.SEATAVAILTAG);
        stringBuilder.append(SeatAvailabilityWeb.lineOut());
        String string2 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("IMAGERESULT ");
        stringBuilder2.append(this.imageResult);
        Log.d((String)string2, (String)stringBuilder2.toString());
    }

    private String getJSforElement(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:document.getElementById('");
        stringBuilder.append(string);
        stringBuilder.append("').");
        stringBuilder.append(string2);
        stringBuilder.append("();");
        return stringBuilder.toString();
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
        double d3 = 20;
        Double.isNaN((double)d3);
        int n2 = 10 + (int)(d2 * d3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.SEATAVAILTAG);
        stringBuilder.append(SeatAvailabilityWeb.lineOut());
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Random ");
        stringBuilder2.append(n2);
        Log.d((String)string, (String)stringBuilder2.toString());
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
            string = "http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html";
            string2 = string7;
            map = map2;
        } else {
            string3 = null;
            string4 = null;
            string2 = null;
            string = null;
            map = null;
        }
        Object[] arrobject = new Object[]{};
        try {
            arrobject = IRParserProvider.getIRParser().getPNRorSeatAvailCaptchaResults(string3, string4, string2, string, map);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
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
        return this.function(webResourceResponse, webResourceRequest, arrobject);
    }

    private WebResourceResponse getWebResourceResponseForSeatAvailability(WebResourceRequest webResourceRequest) {
        ByteArrayInputStream byteArrayInputStream;
        Object[] arrobject;
        block12 : {
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
                string = "http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html";
                string2 = string7;
            } else {
                string3 = null;
                string4 = null;
                string2 = null;
                string = null;
                map = null;
            }
            arrobject = new Object[]{};
            try {
                arrobject = IRParserProvider.getIRParser().requestSeatAvailability(string3, string4, string2, string, map);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            byteArrayInputStream = new ByteArrayInputStream((byte[])arrobject[1]);
            String string8 = this.response = (String)arrobject[0];
            if (string8 != null) {
                if (!string8.contains((CharSequence)"Session out or Bot attack") && !this.response.contains((CharSequence)"Captcha not matched")) {
                    try {
                        this.response = new IRParser().reformatJson(this.response, this.CLASS);
                        if (this.response == null) {
                            this.activity.runOnUiThread(new Runnable(){

                                public void run() {
                                    SeatAvailabilityWeb.this.start();
                                }
                            });
                            break block12;
                        }
                        this.seatAvailabilityInterface.onSuccess(this.response);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                } else {
                    this.activity.runOnUiThread(new Runnable(){

                        public void run() {
                            SeatAvailabilityWeb.this.start();
                        }
                    });
                }
            }
        }
        this.count = 1 + this.count;
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                SeatAvailabilityWeb.this.start();
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.SEATAVAILTAG);
        stringBuilder.append(SeatAvailabilityWeb.lineOut());
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("response  ");
        stringBuilder2.append(this.response);
        Log.d((String)string, (String)stringBuilder2.toString());
        if (Build.VERSION.SDK_INT >= 21) {
            Map map = (Map)arrobject[2];
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), ((List)entry.getValue()).get(0));
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse("image/png", "deflate", 200, "OK", (Map)hashMap, (InputStream)byteArrayInputStream);
            return webResourceResponse;
        }
        return null;
    }

    private void inputUsingJS(final String string, final String string2) {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("javascript:document.getElementById('");
                stringBuilder.append(string);
                stringBuilder.append("').value='");
                stringBuilder.append(string2);
                stringBuilder.append("';");
                String string3 = stringBuilder.toString();
                if (string3 != null && Build.VERSION.SDK_INT >= 19) {
                    SeatAvailabilityWeb.this.wb.evaluateJavascript(string3, SeatAvailabilityWeb.this.valueCallback);
                }
            }
        });
    }

    private void inputUsingKeyEventInWebview(final String string, final String string2, final String string3) {
        new Thread(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                int n2;
                block15 : {
                    block14 : {
                        try {
                            SeatAvailabilityWeb.this.inputUsingJS(string3, string);
                            if (string2 == null) break block14;
                            9.sleep((long)SeatAvailabilityWeb.this.getRandomMillis());
                            String string4 = string2;
                            n2 = -1;
                            int n3 = string4.hashCode();
                            if (n3 != -264696303) {
                                if (n3 != 1447257944) {
                                    if (n3 == 1785840014 && string4.equals((Object)"CLASSACTION")) {
                                        n2 = 2;
                                    }
                                } else if (string4.equals((Object)"DESTACTION")) {
                                    n2 = 1;
                                }
                            } else if (string4.equals((Object)"SOURCEACTION")) {
                                n2 = 0;
                            }
                            break block15;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                    }
                    return;
                }
                switch (n2) {
                    case 2: {
                        SeatAvailabilityWeb.this.selectClassOption("class", SeatAvailabilityWeb.this.CLASS);
                        return;
                    }
                    case 1: {
                        SeatAvailabilityWeb.this.focusNEnterDEST();
                        return;
                    }
                    case 0: {
                        SeatAvailabilityWeb.this.focusNEnterSource();
                        return;
                    }
                }
            }
        }.start();
    }

    public static int lineOut() {
        return 0;
    }

    private void performJSonUIThread(final String string) {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                if (string != null && Build.VERSION.SDK_INT >= 19) {
                    SeatAvailabilityWeb.this.wb.evaluateJavascript(string, SeatAvailabilityWeb.this.valueCallback);
                }
            }
        });
    }

    private void reloadonUIthread() {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                SeatAvailabilityWeb.this.wb.reload();
            }
        });
    }

    private void resubmitPNRwithJS() {
        new Thread(){

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void run() {
                Throwable throwable2222;
                block4 : {
                    Activity activity;
                    Runnable runnable;
                    block5 : {
                        5.sleep((long)SeatAvailabilityWeb.this.getRandomMillis());
                        activity = SeatAvailabilityWeb.this.activity;
                        runnable = new Runnable(){

                            public void run() {
                                SeatAvailabilityWeb.this.performJSonUIThread(SeatAvailabilityWeb.this.getJSforElement("modal1", "click"));
                            }
                        };
                        break block5;
                        {
                            catch (Throwable throwable2222) {
                                break block4;
                            }
                            catch (InterruptedException interruptedException) {}
                            {
                                interruptedException.printStackTrace();
                            }
                            activity = SeatAvailabilityWeb.this.activity;
                            runnable = new /* invalid duplicate definition of identical inner class */;
                        }
                    }
                    activity.runOnUiThread(runnable);
                    return;
                }
                SeatAvailabilityWeb.this.activity.runOnUiThread(new /* invalid duplicate definition of identical inner class */);
                throw throwable2222;
            }

        }.start();
    }

    private void selectClassOption(final String string, final String string2) {
        this.activity.runOnUiThread(new Runnable(){

            public void run() {
                int n2 = SeatAvailabilityWeb.this.getPositionofClass(string2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("document.getElementById('");
                stringBuilder.append(string);
                stringBuilder.append("').options[");
                stringBuilder.append(n2);
                stringBuilder.append("].selected = 'selected';");
                String string3 = stringBuilder.toString();
                SeatAvailabilityWeb.this.wb.evaluateJavascript(string3, (ValueCallback)new ValueCallback<String>(){

                    public void onReceiveValue(String string) {
                        SeatAvailabilityWeb.this.submitForm();
                    }
                });
            }

        });
    }

    private void setRealData() {
        this.TRAINNOWITHNAME = this.trainNum.replaceAll("\\+", " ");
        this.SOURCE = this.fromStation.replaceAll("\\+", " ");
        this.DEST = this.toStation.replaceAll("\\+", " ");
        this.CLASS = this.classStr;
        String string = this.classesStr;
        if (string != null) {
            this.classesStrArray = string.split(",");
            Log.d((String)"CLASSES", (String)this.classesStr);
        }
    }

    private void submitForm() {
        this.performJSonUIThread(this.getJSforElement("modal1", "click"));
    }

    public Object[] getHttpGetRequestResult(String string, String string2, String string3, String string4, int n2, Map<String, String> map) {
        Object[] arrobject = new Object[3];
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
        httpURLConnection.setRequestMethod("GET");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
            }
        }
        if (string3 != null) {
            httpURLConnection.setRequestProperty("Cookie", string3);
        }
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.81 Safari/537.36");
        if (string2 != null) {
            httpURLConnection.setRequestProperty("Host", string2);
        }
        if (string4 != null) {
            httpURLConnection.setRequestProperty("Referer", string4);
        }
        httpURLConnection.setRequestProperty("X-Requested-With", "XMLHttpRequest");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setReadTimeout(n2);
        httpURLConnection.setConnectTimeout(n2);
        if (httpURLConnection.getResponseCode() == 200) {
            String string5;
            byte[] arrby;
            String string6 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string6 != null && string6.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                arrby = IRParser.readFully((InputStream)gZIPInputStream);
                string5 = new String(arrby);
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                arrby = IRParser.readFully((InputStream)inputStream);
                string5 = new String(arrby);
                inputStream.close();
            }
            arrobject[0] = new String(new StringBuffer(string5));
            arrobject[1] = arrby;
            arrobject[2] = httpURLConnection.getHeaderFields();
        }
        return arrobject;
    }

    int getPositionofClass(String string) {
        String[] arrstring = new String[]{"1A", "EC", "EA", "2A", "3A", "3E", "CC", "FC", "SL", "2S"};
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].equalsIgnoreCase(string)) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(i2);
            Log.d((String)"CLASS", (String)stringBuilder.toString());
            return i2;
        }
        return 0;
    }

    void selectQuotaOption(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" $('#quota option:contains(' + ");
        stringBuilder.append(string2);
        stringBuilder.append(" + ')').prop({selected: true});");
        String string3 = stringBuilder.toString();
        this.wb.evaluateJavascript(string3, this.valueCallback);
    }

    public void start() {
        int n2 = this.count;
        String[] arrstring = this.classesStrArray;
        if (n2 < arrstring.length) {
            this.CLASS = arrstring[n2];
            this.wb = new WebView((Context)this.activity);
            this.wb.getSettings().setJavaScriptEnabled(true);
            this.wb.getSettings().setSupportZoom(true);
            this.wb.getSettings().setBuiltInZoomControls(true);
            this.wb.setWebViewClient(this.webClient);
            this.wb.clearCache(false);
            this.wb.loadUrl("http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html");
            return;
        }
        this.seatAvailabilityInterface.removeThread();
    }

}

