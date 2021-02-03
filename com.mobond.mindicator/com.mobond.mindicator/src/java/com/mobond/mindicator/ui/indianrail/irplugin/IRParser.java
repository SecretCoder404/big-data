/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.webkit.WebView
 *  java.io.BufferedReader
 *  java.io.ByteArrayOutputStream
 *  java.io.Closeable
 *  java.io.DataOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Field
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.net.URLEncoder
 *  java.security.Key
 *  java.security.MessageDigest
 *  java.security.spec.AlgorithmParameterSpec
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.zip.GZIPInputStream
 *  java.util.zip.GZIPOutputStream
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 *  javax.net.ssl.HttpsURLConnection
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.irplugin;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.mobond.mindicator.ui.indianrail.irplugin.CancelNReschuduledTrains;
import com.mobond.mindicator.ui.indianrail.irplugin.CommonCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserInterface;
import com.mobond.mindicator.ui.indianrail.irplugin.PNRCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.PNRWebResult;
import com.mobond.mindicator.ui.indianrail.irplugin.RunningStatusWeb;
import com.mobond.mindicator.ui.indianrail.irplugin.SeatAvailabilityInterface;
import com.mulo.b.c;
import com.mulo.b.h;
import com.mulo.util.a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.Key;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IRParser
implements IRParserInterface {
    private static final String KEY_1 = "645fbc1e56e23365f2f3c204ae0899f6";
    private static final String KEY_2 = "8EA4DB2CC1EB3DC5";
    private static final String KEY_3 = "7DC5EB3BB4DB6EA8";
    private static final String KEY_4 = "EA3541BC74345DDA";
    private static final String SERVER_ERROR = "SERVER_ERROR";
    private static final String TRAIN_CANCELLED_RETURN = "CANCELLED";
    private static final String TRAIN_CANCELLED_TEXT = "The Train Is Cancelled";
    public static final int VERSION = 2019041601;
    public static boolean isCalled;
    private String cookie;
    private String[] cookieAndParam;
    private HttpURLConnection current_httpUrlConnection;
    private String getClassesURLEnglish;
    private String getClassesURLHindi;
    private String getKeyValueFromNTESURL;
    private String getPnrDepartureTimeFromMNTESURL;
    private String getSeatStatusURLEnglish;
    private String getSeatStatusURLHindi;
    private String getTrainTimeTableURL;
    private String getTrainsListURL;
    private String imageResult;
    private boolean isEnglish = true;
    private Random random;
    private SimpleDateFormat sdf_in = null;
    private SimpleDateFormat sdf_out = null;
    private HashMap<String, String> stationCodes;
    private HashMap<String, String> trainsMap;
    private String urlsForCancelledRescheduledTrains1URL;
    private String urlsForCancelledRescheduledTrains2URL;
    private String[] urlsForRunningStatus;
    private String urlsForRunningStatus1URL;
    private String urlsForRunningStatus2URL;

    public IRParser() {
        try {
            this.getKeyValueFromNTESURL = "https://enquiry.indianrail.gov.in/ntes/";
            this.getTrainsListURL = "https://enquiry.indianrail.gov.in/ntes/NTES?action=getTrnBwStns&stn1=";
            this.getSeatStatusURLEnglish = "http://www.indianrail.gov.in/cgi_bin/inet_accavl_cgi_10251.cgi";
            this.getClassesURLEnglish = "http://www.indianrail.gov.in/cgi_bin/inet_frenq_cgi.cgi";
            this.getSeatStatusURLHindi = "http://www.indianrail.gov.in/cgi_bin/inet_accavl_cgi_hindi.cgi";
            this.getClassesURLHindi = "http://www.indianrail.gov.in/cgi_bin/inet_frenq_cgi_hindi.cgi";
            this.getPnrDepartureTimeFromMNTESURL = "https://enquiry.indianrail.gov.in/mntes/q?opt=TrainServiceSchedule&subOpt=show&trainNo=";
            this.getTrainTimeTableURL = "https://enquiry.indianrail.gov.in/ntes/FutureTrain?action=getTrainData&trainNo=";
            this.urlsForRunningStatus1URL = "https://enquiry.indianrail.gov.in/ntes/SearchTrain?trainNo=";
            this.urlsForRunningStatus2URL = "https://enquiry.indianrail.gov.in/ntes/NTES?action=getTrainData&trainNo=";
            this.urlsForCancelledRescheduledTrains1URL = "https://mobondhrd.appspot.com/irgetcancelledtrains";
            String[] arrstring = new String[]{this.urlsForRunningStatus1URL, this.urlsForRunningStatus2URL};
            this.urlsForRunningStatus = arrstring;
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private String firstGetTrainDataThenRunningStatus(int n2, String string) {
        HttpURLConnection httpURLConnection;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.urlsForRunningStatus[n2]);
        stringBuilder.append(string);
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(stringBuilder.toString()).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Cookie", this.cookieAndParam[0]);
        httpURLConnection.setRequestProperty("User-Agent", "Dalvik/1.6.0 (Linux; U; Android 4.4.2; SM-G900F Build/KOT49H)");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Host", "enquiry.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        if (httpURLConnection.getResponseCode() == 200) {
            String string2;
            String string3 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string3 != null && string3.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                string2 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                String string4 = new String(IRParser.readFully(inputStream));
                inputStream.close();
                string2 = string4;
            }
            if (n2 == 1) {
                return this.parseRunningStatus(string2);
            }
            return string2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int formatIntoMinutesForAlarm(String string, boolean bl) {
        int n2;
        int n3;
        String string2 = bl ? ":" : ".";
        try {
            String[] arrstring = string.split(string2);
            n3 = 60 * Integer.parseInt((String)arrstring[0]);
            n2 = Integer.parseInt((String)arrstring[1]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return -1;
        }
        return n3 + n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Integer getApkBuildDate() {
        Field field = this.getClass().getClassLoader().loadClass("com.mobond.mindicator.RegInfo2").getField("BUILD_RELEASED_DATE");
        if (field == null) return null;
        try {
            return Integer.parseInt((String)((String)field.get(null)));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static String getClassInEnglishSeatAvl(String string) {
        if (string.contains((CharSequence)"&#2342;&#2381;&#2357;&#2367;&#2340;&#2368;&#2351; &#2357;&#2366;&#2340;&#2366;&#2344;&#2369;&#2325;&#2370;&#2354;&#2367;&#2340;")) {
            return "2A";
        }
        if (string.contains((CharSequence)"&#2346;&#2381;&#2352;&#2341;&#2350; &#2357;&#2366;&#2340;&#2366;&#2344;&#2369;&#2325;&#2370;&#2354;&#2367;&#2340;")) {
            return "1A";
        }
        if (string.contains((CharSequence)"&#2340;&#2371;&#2340;&#2368;&#2351; &#2357;&#2366;&#2340;&#2366;&#2344;&#2369;&#2325;&#2370;&#2354;&#2367;&#2340;")) {
            return "3A";
        }
        if (string.contains((CharSequence)"&#2357;&#2366;&#2340;&#2366;&#2344;&#2369;&#2325;&#2370;&#2354;&#2367;&#2340; &#2325;&#2369;&#2352;&#2381;&#2360;&#2368;&#2351;&#2366;&#2344;")) {
            return "CC";
        }
        if (string.contains((CharSequence)"&#x92A;&#x94D;&#x930;&#x925;&#x92E; &#x936;&#x94D;&#x930;&#x947;&#x923;&#x940;")) {
            return "FC";
        }
        if (string.contains((CharSequence)"&#2358;&#2351;&#2344;&#2351;&#2366;&#2344;")) {
            return "SL";
        }
        if (string.contains((CharSequence)"&#2342;&#2381;&#2357;&#2367;&#2340;&#2368;&#2351; &#2358;&#2381;&#2352;&#2375;&#2339;&#2368;")) {
            return "2S";
        }
        return string;
    }

    private String getClassShort(String string) {
        if (string.contains((CharSequence)"2S")) {
            return "2S";
        }
        if (string.contains((CharSequence)"SL")) {
            return "SL";
        }
        if (string.contains((CharSequence)"FC")) {
            return "FC";
        }
        if (string.contains((CharSequence)"CC")) {
            return "CC";
        }
        if (string.contains((CharSequence)"3E")) {
            return "3E";
        }
        if (string.contains((CharSequence)"3A")) {
            return "3A";
        }
        if (string.contains((CharSequence)"2A")) {
            return "2A";
        }
        if (string.contains((CharSequence)"1A")) {
            return "1A";
        }
        if (string.contains((CharSequence)"EC")) {
            return "EC";
        }
        if (string.contains((CharSequence)"EA")) {
            return "EA";
        }
        return string.replaceAll("Class -", "");
    }

    private String getCoachBerth(String string) {
        String[] arrstring;
        if (string.startsWith("CNF") && (arrstring = string.split("/")).length >= 4) {
            String string2 = arrstring[1];
            String string3 = arrstring[2];
            String string4 = arrstring[3];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Coach: ");
            stringBuilder.append(string2);
            stringBuilder.append("\nSeat: ");
            stringBuilder.append(string3);
            stringBuilder.append("\nBerth: ");
            stringBuilder.append(string4);
            return stringBuilder.toString();
        }
        return null;
    }

    private String getCoachBerthFromRAC(String string) {
        String[] arrstring = string.split("/");
        if (arrstring.length >= 3) {
            String string2 = arrstring[1];
            String string3 = arrstring[2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Coach: ");
            stringBuilder.append(string2);
            stringBuilder.append("\nSeat: ");
            stringBuilder.append(string3);
            return stringBuilder.toString();
        }
        return null;
    }

    private int getDifferenceInDays(String string) {
        double d2;
        String string2 = string.trim().replaceAll(" ", "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d-M-y", Locale.US);
        try {
            Date date = simpleDateFormat.parse(string2);
            Date date2 = new Date(System.currentTimeMillis());
            date2.setHours(0);
            date2.setMinutes(0);
            date2.setSeconds(0);
            d2 = Math.ceil((double)((float)(date.getTime() - date2.getTime()) / 3600000.0f / 24.0f));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            return -200;
        }
        int n2 = (int)d2;
        if (n2 >= 0) {
            return n2;
        }
        return -200;
    }

    private static int getDifferenceInDays(Date date) {
        Date date2 = new Date(System.currentTimeMillis());
        date2.setHours(0);
        date2.setMinutes(0);
        date2.setSeconds(0);
        int n2 = Math.round((float)((float)(date.getTime() - date2.getTime()) / 3600000.0f / 24.0f));
        if (n2 >= 0) {
            return n2;
        }
        return -200;
    }

    private String getHalt(String string) {
        int n2 = string.indexOf(58);
        if (n2 != -1) {
            return string.substring(0, n2);
        }
        return "";
    }

    private String getImageResultFromMobondCall(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://irailpnrcheck.appspot.com/rcv_img?");
        if (string != null) {
            stringBuilder.append("pnr=");
            stringBuilder.append(string);
            stringBuilder.append("&");
        }
        stringBuilder.append("buildid=");
        stringBuilder.append((Object)this.getApkBuildDate());
        stringBuilder.append("&img=");
        stringBuilder.append(URLEncoder.encode((String)string2, (String)"UTF-8"));
        this.imageResult = new JSONObject((String)this.getHttpGetRequestResult(stringBuilder.toString())[0]).getString("result");
        return this.imageResult;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void getImageResultFromServer(int n2, boolean bl, String string) {
        IRParser iRParser = this;
        synchronized (iRParser) {
            if (this.imageResult == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("http://www.indianrail.gov.in/enquiry/captchaDraw.png?");
                stringBuilder.append(System.currentTimeMillis());
                Object[] arrobject = this.getHttpGetRequestResult(stringBuilder.toString(), null, null, null, n2);
                String string2 = Base64.byteArrayToBase64((byte[])arrobject[1]);
                Map map = (Map)arrobject[2];
                StringBuilder stringBuilder2 = new StringBuilder();
                if (map.containsKey((Object)"Set-Cookie")) {
                    List list = (List)map.get((Object)"Set-Cookie");
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        if (i2 != 0) {
                            stringBuilder2.append("; ");
                            stringBuilder2.append((String)list.get(i2));
                            continue;
                        }
                        stringBuilder2.append((String)list.get(i2));
                    }
                }
                this.cookie = stringBuilder2.toString();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("https://irailpnrcheck.appspot.com/rcv_img?");
                if (string != null) {
                    stringBuilder3.append("pnr=");
                    stringBuilder3.append(string);
                    stringBuilder3.append("&");
                }
                stringBuilder3.append("buildid=");
                stringBuilder3.append((Object)this.getApkBuildDate());
                stringBuilder3.append("&img=");
                stringBuilder3.append(URLEncoder.encode((String)string2, (String)"UTF-8"));
                this.imageResult = new JSONObject((String)this.getHttpGetRequestResult(stringBuilder3.toString())[0]).getString("result");
            }
            if (bl) {
                this.trains();
                this.stationCodes();
            }
            return;
        }
    }

    private String[] getKeyValueFromNTES() {
        HttpURLConnection httpURLConnection;
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(this.getKeyValueFromNTESURL).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Host", "enquiry.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setConnectTimeout(60000);
        String string = "";
        int n2 = httpURLConnection.getResponseCode();
        Map map = httpURLConnection.getHeaderFields();
        for (String string2 : map.keySet()) {
            if (string2 == null || !string2.equalsIgnoreCase("Set-Cookie")) continue;
            for (String string3 : (List)map.get((Object)string2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(string3);
                stringBuilder.append(";");
                string = stringBuilder.toString();
            }
        }
        if (n2 == 200) {
            String[] arrstring = new String[2];
            arrstring[0] = string;
            return arrstring;
        }
        return null;
    }

    private static long getNextAlarmTimeForPnr(int n2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (n2 >= 0) {
            if (n2 > 10) {
                int n3 = n2 - 10;
                calendar.set(11, 10);
                calendar.set(12, 0);
                if (n3 >= 7) {
                    calendar.add(5, 7);
                } else {
                    calendar.add(5, n3);
                }
            } else if (n2 >= 2 && n2 <= 10) {
                calendar.set(11, 10);
                calendar.set(12, 0);
                calendar.add(5, 1);
            } else if (n2 == 1) {
                calendar.add(11, 4);
            } else if (n2 == 0) {
                calendar.add(11, 1);
            }
            return calendar.getTimeInMillis();
        }
        return -1L;
    }

    private String getNtesAppUrl() {
        return "https://enquiry.indianrail.gov.in/crisntes/AppServAnd";
    }

    private String getParsedTrainsList(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trainNo", (Object)jSONObject.getString("TrainNumber"));
            jSONObject2.put("trainName", (Object)jSONObject.getString("TrainName"));
            jSONObject2.put("trnName", (Object)jSONObject.getString("TrainName"));
            jSONObject2.put("srcCode", (Object)jSONObject.getString("Source"));
            jSONObject2.put("dstnCode", (Object)jSONObject.getString("Destination"));
            jSONObject2.put("fromStnCode", (Object)jSONObject.getString("FromStation"));
            jSONObject2.put("toStnCode", (Object)jSONObject.getString("toStation"));
            jSONObject2.put("runsFromStn", (Object)jSONObject.getString("DayOfRun"));
            jSONObject2.put("trainType", (Object)jSONObject.getString("TrainType"));
            jSONObject2.put("travelTime", (Object)jSONObject.getString("TravelTime"));
            jSONObject2.put("arrAtToStn", (Object)jSONObject.getString("ArrTimeTo"));
            jSONObject2.put("depAtFromStn", (Object)jSONObject.getString("DepTimeFrom"));
            jSONArray2.put((Object)jSONObject2);
        }
        return jSONArray2.toString();
    }

    private String getPnrStatusMobond(String string) {
        HttpURLConnection httpURLConnection;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://m.mobond.com/pnrcheck?pnr=");
        stringBuilder.append(string);
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(stringBuilder.toString()).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Accept", "text/plain");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setDoOutput(true);
        if (httpURLConnection.getResponseCode() == 200) {
            String string2 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string2 != null && string2.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                String string3 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
                return string3;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            String string4 = new String(IRParser.readFully(inputStream));
            inputStream.close();
            return string4;
        }
        return null;
    }

    private String getRunningStatusFromMobondServer(String string) {
        HttpURLConnection httpURLConnection;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://mobondhrd.appspot.com/irgetrunningstatus?trainno=");
        stringBuilder.append(string);
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(stringBuilder.toString()).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-agent", "Mozilla/5.0");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setConnectTimeout(60000);
        if (httpURLConnection.getResponseCode() == 200) {
            String string2 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string2 != null && string2.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                String string3 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
                return string3;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            String string4 = new String(IRParser.readFully(inputStream));
            inputStream.close();
            return string4;
        }
        return null;
    }

    private String getSeatResult(String string, int n2, int n3, String string2, String string3, String string4, String string5, String string6) {
        int n4 = Calendar.getInstance().get(1);
        int n5 = 1 + Calendar.getInstance().get(2);
        int n6 = n4 + 1;
        if (n3 < n5) {
            n4 = n6;
        }
        String string7 = String.valueOf((int)n2);
        if (n2 < 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0");
            stringBuilder.append(n2);
            string7 = stringBuilder.toString();
        }
        String string8 = String.valueOf((int)n3);
        if (n3 < 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0");
            stringBuilder.append(n3);
            string8 = stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://www.indianrail.gov.in/enquiry/CommonCaptcha?inputCaptcha=");
        stringBuilder.append(string4);
        stringBuilder.append("&trainNo=");
        stringBuilder.append(string);
        stringBuilder.append("&dt=");
        stringBuilder.append(string7);
        stringBuilder.append("-");
        stringBuilder.append(string8);
        stringBuilder.append("-");
        stringBuilder.append(n4);
        stringBuilder.append("&sourceStation=");
        stringBuilder.append(string2);
        stringBuilder.append("&destinationStation=");
        stringBuilder.append(string3);
        stringBuilder.append("&classc=");
        stringBuilder.append(string5);
        stringBuilder.append("&quota=GN&inputPage=SEAT&language=en");
        String string9 = stringBuilder.toString();
        try {
            String string10 = (String)this.getHttpGetRequestResult(string9, null, string6, "http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html", 60000)[0];
            return string10;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private String getSeatsStatusJSONEnglish(String string) {
        ArrayList arrayList = new ArrayList();
        int n2 = string.indexOf("<TH ALIGN = Center width=");
        while (n2 > 0) {
            int n3 = string.indexOf("</TH>", n2);
            String string2 = string.substring(n2, n3);
            arrayList.add((Object)string2.substring(1 + string2.indexOf(">")));
            n2 = string.indexOf("<TH ALIGN = Center width=", n3);
        }
        int n4 = string.indexOf("\"table_border_both\"");
        String string3 = "[";
        int n5 = 0;
        boolean bl = false;
        while (n4 > 0) {
            int n6 = string.indexOf("</TD>", n4);
            String string4 = string.substring(n4, n6);
            if (!string4.contains((CharSequence)"width")) {
                if (n5 == 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append("{\"dt\":\"");
                    stringBuilder.append(string4.substring(1 + string4.indexOf(">")));
                    stringBuilder.append("\",\"info\":\"");
                    string3 = stringBuilder.toString();
                    bl = false;
                } else if (n5 > 1) {
                    if (bl) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string3);
                        stringBuilder.append("~");
                        string3 = stringBuilder.toString();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append(this.getClassShort((String)arrayList.get(n5)));
                    stringBuilder.append(",");
                    stringBuilder.append(this.getStatusLabelShort(string4));
                    stringBuilder.append(",");
                    stringBuilder.append(this.getStatusDigits(string4));
                    string3 = stringBuilder.toString();
                    bl = true;
                }
                if (n5 == arrayList.size() - 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append("\"}");
                    string3 = stringBuilder.toString();
                    n5 = 0;
                } else {
                    ++n5;
                }
            }
            n4 = string.indexOf("\"table_border_both\"", n6);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("]");
        String string5 = stringBuilder.toString();
        arrayList.clear();
        System.gc();
        String string6 = string5.replaceAll("\\}\\{", "\\},\\{");
        if (string6.equals((Object)"[]")) {
            if (string.contains((CharSequence)TRAIN_CANCELLED_TEXT)) {
                return TRAIN_CANCELLED_RETURN;
            }
            string6 = null;
        }
        return string6;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private String getSeatsStatusJSONHindi(String var1_1) {
        var2_2 = new ArrayList();
        var3_3 = var1_1.indexOf("<TH ALIGN = Center width=");
        var4_4 = -1;
        while (var3_3 > 0) {
            block13 : {
                block12 : {
                    var36_5 = var1_1.indexOf("</TH>", var3_3);
                    var37_6 = var1_1.substring(var3_3, var36_5);
                    var2_2.add((Object)IRParser.getClassInEnglishSeatAvl(var37_6.substring(1 + var37_6.indexOf(">"))));
                    var39_7 = var1_1.indexOf("<TH ALIGN = Center width=", var36_5);
                    var40_8 = var1_1.indexOf("<TH ALIGN =Center width=", var36_5);
                    if (var39_7 == -1 || var40_8 == -1) break block12;
                    if (var39_7 >= var40_8) break block13;
                    ** GOTO lbl-1000
                }
                if (var39_7 != -1) lbl-1000: // 2 sources:
                {
                    var40_8 = var39_7;
                } else if (var40_8 == -1) {
                    var40_8 = -1;
                }
            }
            var41_9 = var40_8;
            var4_4 = var3_3;
            var3_3 = var41_9;
        }
        var5_10 = var1_1.indexOf("\"table_border_both\"", var4_4);
        var6_11 = var1_1.substring(var5_10, var1_1.indexOf("</TABLE>", var5_10));
        var7_12 = "[";
        var8_13 = 1;
        var9_14 = 0;
        var10_15 = false;
        while (var8_13 > 0 && var9_14 <= var2_2.size()) {
            var16_16 = var6_11.indexOf("</TD>", var8_13);
            var17_17 = var6_11.substring(var8_13, var16_16);
            if (!var17_17.contains((CharSequence)"width")) {
                if (var9_14 == 1) {
                    var18_18 = new StringBuilder();
                    var18_18.append(var7_12);
                    var18_18.append("{\"dt\":\"");
                    var18_18.append(var17_17.substring(1 + var17_17.indexOf(">")).replace((CharSequence)" ", (CharSequence)""));
                    var18_18.append("\",\"info\":\"");
                    var7_12 = var18_18.toString();
                    var10_15 = false;
                } else if (var9_14 > 1) {
                    if (var10_15) {
                        var26_20 = new StringBuilder();
                        var26_20.append(var7_12);
                        var26_20.append("~");
                        var7_12 = var26_20.toString();
                    }
                    var29_21 = new StringBuilder();
                    var29_21.append(var7_12);
                    var29_21.append(this.getClassShort((String)var2_2.get(var9_14)));
                    var29_21.append(",");
                    var29_21.append(this.getStatusLabelShort(var17_17));
                    var29_21.append(",");
                    var29_21.append(this.getStatusDigits(var17_17));
                    var7_12 = var29_21.toString();
                    var10_15 = true;
                }
                if (var9_14 == var2_2.size() - 1) {
                    var23_19 = new StringBuilder();
                    var23_19.append(var7_12);
                    var23_19.append("\"}");
                    var7_12 = var23_19.toString();
                    var9_14 = 0;
                } else {
                    ++var9_14;
                }
            }
            var8_13 = var6_11.indexOf("\"table_border_both\"", var16_16);
        }
        var11_22 = new StringBuilder();
        var11_22.append(var7_12);
        var11_22.append("]");
        var14_23 = var11_22.toString();
        var2_2.clear();
        System.gc();
        var15_24 = var14_23.replaceAll("\\}\\{", "\\},\\{");
        if (var15_24.equals((Object)"[]") == false) return var15_24;
        if (var1_1.contains((CharSequence)"The Train Is Cancelled") == false) return null;
        return "CANCELLED";
    }

    private String getStationCode(String string) {
        HashMap<String, String> hashMap = this.stationCodes();
        if (hashMap.containsKey((Object)string)) {
            return ((String)hashMap.get((Object)string)).replaceAll(" ", "+");
        }
        return null;
    }

    private String getStatusDigits(String string) {
        String string2;
        if (string.contains((CharSequence)"NOT AVAILABLE")) {
            return "NA";
        }
        if (string.contains((CharSequence)"DEPARTED")) {
            return "DEP";
        }
        if (string.contains((CharSequence)"CLASS NOT EXIST")) {
            return "CLS";
        }
        if (string.contains((CharSequence)"Charting")) {
            return "NA";
        }
        if (string.contains((CharSequence)"deleted")) {
            return "NA";
        }
        String string3 = string.contains((CharSequence)"AVAILABLE") ? string.substring(9 + string.indexOf("AVAILABLE")) : string;
        if (string.contains((CharSequence)"CURR_AVBL")) {
            string3 = string3.substring(5 + string3.indexOf("CURR_AVBL"));
        }
        if (string.contains((CharSequence)"/")) {
            string3 = string3.substring(1 + string3.indexOf("/"));
        }
        if ((string2 = string3.replaceAll("\\D+", "").replaceAll("^0+", "")).length() > 5) {
            return "NA";
        }
        if (!string2.trim().isEmpty()) {
            return string2;
        }
        return this.getStatusLabelShort(string);
    }

    private String getStatusLabelShort(String string) {
        if (string.contains((CharSequence)"NOT AVAILABLE")) {
            return "NA";
        }
        if (string.contains((CharSequence)"AVAILABLE")) {
            return "AVL";
        }
        if (string.contains((CharSequence)"/")) {
            return string.substring(1 + string.indexOf("/")).replaceAll("[^A-Za-z]", "");
        }
        if (string.contains((CharSequence)"DEPARTED")) {
            return "NA";
        }
        if (string.contains((CharSequence)"CURR_AVBL")) {
            return "AVL";
        }
        if (string.contains((CharSequence)"CLASS NOT EXIST")) {
            return "NO";
        }
        if (string.length() > 5) {
            return "NA";
        }
        return "NA";
    }

    private String getTimetableResponseFromNTES(String string) {
        HttpURLConnection httpURLConnection;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getTrainTimeTableURL);
        stringBuilder.append(string);
        stringBuilder.append("&validOnDate=");
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(stringBuilder.toString()).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        httpURLConnection.setRequestProperty("Cache-Control", "max-age=0");
        httpURLConnection.setRequestProperty("Cookie", this.cookieAndParam[0]);
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Host", "www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Origin", "http://www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Referer", "http://www.indianrail.gov.in/train_Schedule.html");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setDoOutput(true);
        if (httpURLConnection.getResponseCode() == 200) {
            String string2;
            String string3 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string3 != null && string3.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                string2 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                String string4 = new String(IRParser.readFully(inputStream));
                inputStream.close();
                string2 = string4;
            }
            StringBuilder stringBuilder2 = new StringBuilder(string2);
            stringBuilder2.delete(0, stringBuilder2.indexOf("<TD>1</TD>"));
            stringBuilder2.delete(stringBuilder2.indexOf("</TABLE>"), stringBuilder2.length());
            int n2 = stringBuilder2.indexOf("<TD>");
            int n3 = stringBuilder2.indexOf("</TD>");
            String[] arrstring = new String[9];
            arrstring[0] = null;
            arrstring[1] = "\"station_short\":";
            int n4 = 2;
            arrstring[n4] = ",\"station_full\":";
            arrstring[3] = null;
            int n5 = 4;
            arrstring[n5] = ",\"arrival\":";
            arrstring[5] = ",\"departure\":";
            arrstring[6] = ",\"halt\":";
            arrstring[7] = ",\"distance\":";
            arrstring[8] = ",\"day\":";
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("[");
            int n6 = n3;
            String string5 = "";
            int n7 = 0;
            boolean bl = false;
            while (n2 >= 0) {
                if (n7 == 0) {
                    if (!bl) {
                        stringBuilder3.append("{");
                    } else {
                        stringBuilder3.append(",{");
                    }
                }
                if (arrstring[n7] != null) {
                    String string6 = stringBuilder2.substring(n2 + 4, n6);
                    if (n7 == 1) {
                        string5 = string6;
                    } else if (n7 == n4) {
                        String[] arrstring2 = string6.split(" ");
                        int n8 = arrstring2.length;
                        String string7 = "";
                        for (int i2 = 0; i2 < n8; ++i2) {
                            String string8;
                            String string9 = arrstring2[i2];
                            if (!string7.isEmpty()) {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append(string7);
                                stringBuilder4.append(" ");
                                string8 = stringBuilder4.toString();
                            } else {
                                string8 = string7;
                            }
                            if (string9.length() != 1 && !string9.startsWith("CSMT")) {
                                StringBuilder stringBuilder5 = new StringBuilder();
                                stringBuilder5.append(string8);
                                stringBuilder5.append(string9.charAt(0));
                                stringBuilder5.append(string9.substring(1).toLowerCase());
                                string7 = stringBuilder5.toString();
                                continue;
                            }
                            StringBuilder stringBuilder6 = new StringBuilder();
                            stringBuilder6.append(string8);
                            stringBuilder6.append(string9);
                            string7 = stringBuilder6.toString();
                        }
                        String string10 = string7;
                        StringBuilder stringBuilder7 = new StringBuilder();
                        stringBuilder7.append(string10);
                        stringBuilder7.append(" [");
                        stringBuilder7.append(string5.trim());
                        stringBuilder7.append("]");
                        string6 = stringBuilder7.toString();
                        n5 = 4;
                    } else if (n7 == n5) {
                        if (string6.contains((CharSequence)"Source")) {
                            string6 = "";
                        } else {
                            StringBuilder stringBuilder8 = new StringBuilder();
                            stringBuilder8.append(",\"arr_min\":");
                            stringBuilder8.append(this.formatIntoMinutesForAlarm(string6, true));
                            stringBuilder3.append(stringBuilder8.toString());
                            string6 = this.formatIntoAMPM(string6, true);
                        }
                    } else if (n7 == 5) {
                        if (string6.contains((CharSequence)"Destination")) {
                            string6 = "";
                        } else {
                            StringBuilder stringBuilder9 = new StringBuilder();
                            stringBuilder9.append(",\"dep_min\":");
                            stringBuilder9.append(this.formatIntoMinutesForAlarm(string6, true));
                            stringBuilder3.append(stringBuilder9.toString());
                            string6 = this.formatIntoAMPM(string6, true);
                        }
                    } else if (n7 == 6 && !string6.isEmpty()) {
                        string6 = this.getHalt(string6);
                    }
                    stringBuilder3.append(arrstring[n7]);
                    stringBuilder3.append("\"");
                    stringBuilder3.append(string6.trim());
                    stringBuilder3.append("\"");
                    bl = true;
                }
                if (++n7 == arrstring.length) {
                    stringBuilder3.append("}");
                    n7 = 0;
                }
                n2 = stringBuilder2.indexOf("<TD>", n6);
                n6 = stringBuilder2.indexOf("</TD>", n2);
                n4 = 2;
            }
            stringBuilder3.append("]");
            return stringBuilder3.toString();
        }
        return null;
    }

    private String getTrainNumber(String string) {
        HashMap<String, String> hashMap = this.trains();
        if (hashMap.containsKey((Object)string)) {
            return ((String)hashMap.get((Object)string)).replaceAll(" ", "+");
        }
        return null;
    }

    private static void logger(String string) {
    }

    private String m12050a(String string) {
        MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
        messageDigest.update(string.getBytes());
        byte[] arrby = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(Integer.toString((int)(256 + (255 & arrby[i2])), (int)16).substring(1));
        }
        try {
            String string2 = stringBuilder.toString();
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    private String m12051b() {
        this.random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() < 16) {
            stringBuilder.append(Integer.toHexString((int)this.random.nextInt()));
        }
        return stringBuilder.toString().toUpperCase().substring(0, 16);
    }

    private String m12053c(String string) {
        String string2;
        string2 = "";
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.trim());
            stringBuilder.append(KEY_4);
            string2 = this.m12050a(stringBuilder.toString()).toUpperCase();
        }
        catch (Exception exception) {}
        return string2;
    }

    private String m12089a(String string) {
        return this.m12091a(string.getBytes());
    }

    private String m12090a(String string, String string2, String string3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(string2.getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(string.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance((String)"AES/CBC/PKCS5PADDING");
            cipher.init(1, (Key)secretKeySpec, (AlgorithmParameterSpec)ivParameterSpec);
            String string4 = new String(Base64.byteArrayToBase64(cipher.doFinal(string3.getBytes("UTF-8"))));
            return string4;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private String m12091a(byte[] arrby) {
        if (arrby == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(2 * arrby.length);
        for (byte by : arrby) {
            stringBuilder.append("0123456789ABCDEF".charAt(15 & by >> 4));
            stringBuilder.append("0123456789ABCDEF".charAt(by & 15));
        }
        return stringBuilder.toString();
    }

    private String m12093b(String string) {
        return new String(this.m12095c(string));
    }

    private String m12094b(String string) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(KEY_3.getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(KEY_2.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance((String)"AES/CBC/PKCS5PADDING");
            cipher.init(2, (Key)secretKeySpec, (AlgorithmParameterSpec)ivParameterSpec);
            String string2 = new String(cipher.doFinal(Base64.decode(string)));
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private byte[] m12095c(String string) {
        int n2 = string.length() / 2;
        byte[] arrby = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = i2 * 2;
            arrby[i2] = Integer.valueOf((String)string.substring(n3, n3 + 2), (int)16).byteValue();
        }
        return arrby;
    }

    public static void main(String[] arrstring) {
        try {
            String string = new IRParser().getPnrStatus("8314103666", null, null, null);
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("s:");
            stringBuilder.append(string);
            printStream.println(stringBuilder.toString());
        }
        catch (Exception exception) {}
    }

    public static byte[] readFully(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[1024];
        while ((n2 = inputStream.read(arrby, 0, arrby.length)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private JSONArray rebuildTimeTableJsonArrayFromRunningStatus(JSONArray jSONArray) {
        JSONArray jSONArray2;
        block8 : {
            int n2;
            try {
                jSONArray2 = new JSONArray();
                n2 = 0;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                return jSONArray;
            }
            do {
                String string;
                int n3;
                int n4;
                String string2;
                if (n2 >= jSONArray.length()) break block8;
                JSONObject jSONObject = jSONArray.getJSONObject(n2);
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject.has("arrTime")) {
                    string = jSONObject.getString("arrTime");
                    string2 = jSONObject.getString("depTime");
                } else {
                    if (!jSONObject.has("arrival")) break;
                    string = jSONObject.getString("arrival");
                    string2 = jSONObject.getString("departure");
                }
                if (jSONObject.has("arr_min")) {
                    n4 = jSONObject.getInt("arr_min");
                    n3 = jSONObject.getInt("dep_min");
                } else {
                    n4 = this.formatIntoMinutesForAlarm(string, true);
                    n3 = this.formatIntoMinutesForAlarm(string2, true);
                }
                int n5 = jSONObject.has("dayCnt") ? 1 + jSONObject.getInt("dayCnt") : jSONObject.getInt("day");
                jSONObject2.put("station_full", (Object)"");
                jSONObject2.put("station_short", (Object)jSONObject.getString("stnCode"));
                jSONObject2.put("arr_min", n4);
                jSONObject2.put("arrival", (Object)string);
                jSONObject2.put("dep_min", n3);
                jSONObject2.put("departure", (Object)string2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(1 + jSONObject.getInt("distance"));
                jSONObject2.put("distance", (Object)stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("");
                stringBuilder2.append(n5);
                jSONObject2.put("day", (Object)stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("");
                stringBuilder3.append(n3 - n4);
                jSONObject2.put("halt", (Object)stringBuilder3.toString());
                jSONArray2.put((Object)jSONObject2);
                ++n2;
            } while (true);
            return jSONArray;
        }
        return jSONArray2;
    }

    private HashMap<String, String> stationCodes() {
        if (this.stationCodes == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("http://www.indianrail.gov.in/enquiry/FetchAutoComplete?_=");
            stringBuilder.append(System.currentTimeMillis());
            Object[] arrobject = this.getHttpGetRequestResult(stringBuilder.toString());
            String[] arrstring = new Closeable(this, (Reader)new StringReader(((String)arrobject[0]).replace((CharSequence)"[", (CharSequence)"").replace((CharSequence)"]", (CharSequence)""))){
                public static final int DEFAULT_SKIP_LINES;
                private BufferedReader br;
                private boolean hasNext;
                private boolean linesSkiped;
                CSVParser parser;
                int skipLines;
                final /* synthetic */ IRParser this$0;
                {
                    this(iRParser, reader, ',', '\"', '\\');
                }
                {
                    this(iRParser, reader, c2, c3, c4, 0, false);
                }
                {
                    this(iRParser, reader, c2, c3, c4, n2, bl, true);
                }
                {
                    Object object = new Object(c2, c3, c4, bl, bl2){
                        public static final char DEFAULT_ESCAPE_CHARACTER = '\\';
                        public static final boolean DEFAULT_IGNORE_LEADING_WHITESPACE = true;
                        public static final boolean DEFAULT_IGNORE_QUOTATIONS = false;
                        public static final char DEFAULT_QUOTE_CHARACTER = '\"';
                        public static final char DEFAULT_SEPARATOR = ',';
                        public static final boolean DEFAULT_STRICT_QUOTES = false;
                        public static final int INITIAL_READ_SIZE = 128;
                        static final char NULL_CHARACTER;
                        final char escape;
                        final boolean ignoreLeadingWhiteSpace;
                        final boolean ignoreQuotations;
                        private boolean inField = false;
                        private String pending;
                        final char quotechar;
                        final char separator;
                        final boolean strictQuotes;
                        {
                            this(c2, c3, c4, bl, bl2, false);
                        }
                        {
                            if (!this.anyCharactersAreTheSame(c2, c3, c4)) {
                                if (c2 != '\u0000') {
                                    this.separator = c2;
                                    this.quotechar = c3;
                                    this.escape = c4;
                                    this.strictQuotes = bl;
                                    this.ignoreLeadingWhiteSpace = bl2;
                                    this.ignoreQuotations = bl3;
                                    return;
                                }
                                throw new UnsupportedOperationException("The separator character must be defined!");
                            }
                            throw new UnsupportedOperationException("The separator, quote, and escape characters must be different!");
                        }

                        private boolean anyCharactersAreTheSame(char c2, char c3, char c4) {
                            return this.isSameCharacter(c2, c3) || this.isSameCharacter(c2, c4) || this.isSameCharacter(c3, c4);
                            {
                            }
                        }

                        private boolean isNextCharacterEscapedQuote(String string, boolean bl, int n2) {
                            int n3;
                            int n4;
                            return bl && (n3 = string.length()) > (n4 = n2 + 1) && string.charAt(n4) == this.quotechar;
                        }

                        private boolean isSameCharacter(char c2, char c3) {
                            return c2 != '\u0000' && c2 == c3;
                        }

                        /*
                         * Enabled force condition propagation
                         * Lifted jumps to return sites
                         */
                        private String[] parseLine(String string, boolean bl) {
                            boolean bl2;
                            StringBuilder stringBuilder;
                            if (!bl && this.pending != null) {
                                this.pending = null;
                            }
                            if (string == null) {
                                String string2 = this.pending;
                                if (string2 == null) return null;
                                this.pending = null;
                                return new String[]{string2};
                            }
                            ArrayList arrayList = new ArrayList();
                            StringBuilder stringBuilder2 = new StringBuilder(128);
                            String string3 = this.pending;
                            if (string3 != null) {
                                stringBuilder2.append(string3);
                                this.pending = null;
                                bl2 = true ^ this.ignoreQuotations;
                            } else {
                                bl2 = false;
                            }
                            StringBuilder stringBuilder3 = stringBuilder2;
                            for (int i2 = 0; i2 < string.length(); ++i2) {
                                char c2 = string.charAt(i2);
                                if (c2 == this.escape) {
                                    boolean bl3 = bl2 && !this.ignoreQuotations || this.inField;
                                    if (!this.isNextCharacterEscapable(string, bl3, i2)) continue;
                                    stringBuilder3.append(string.charAt(++i2));
                                    continue;
                                }
                                if (c2 == this.quotechar) {
                                    boolean bl4 = bl2 && !this.ignoreQuotations || this.inField;
                                    if (this.isNextCharacterEscapedQuote(string, bl4, i2)) {
                                        stringBuilder3.append(string.charAt(++i2));
                                    } else {
                                        int n2;
                                        int n3;
                                        bl2 = !bl2;
                                        if (!this.strictQuotes && i2 > 2 && string.charAt(i2 - 1) != this.separator && (n3 = string.length()) > (n2 = i2 + 1) && string.charAt(n2) != this.separator) {
                                            if (this.ignoreLeadingWhiteSpace && stringBuilder3.length() > 0 && this.isAllWhiteSpace((CharSequence)stringBuilder3)) {
                                                stringBuilder3 = new StringBuilder(128);
                                            } else {
                                                stringBuilder3.append(c2);
                                            }
                                        }
                                    }
                                    this.inField = true ^ this.inField;
                                    continue;
                                }
                                if (c2 == this.separator && (!bl2 || this.ignoreQuotations)) {
                                    arrayList.add((Object)stringBuilder3.toString());
                                    stringBuilder3 = new StringBuilder(128);
                                    this.inField = false;
                                    continue;
                                }
                                if (this.strictQuotes && (!bl2 || this.ignoreQuotations)) continue;
                                stringBuilder3.append(c2);
                                this.inField = true;
                            }
                            if (bl2 && !this.ignoreQuotations) {
                                if (!bl) throw new IOException("Un-terminated quoted field at end of CSV line");
                                stringBuilder3.append("\n");
                                this.pending = stringBuilder3.toString();
                                stringBuilder = null;
                            } else {
                                stringBuilder = stringBuilder3;
                            }
                            if (stringBuilder == null) return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
                            arrayList.add((Object)stringBuilder.toString());
                            return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
                        }

                        boolean isAllWhiteSpace(CharSequence charSequence) {
                            for (int i2 = 0; i2 < charSequence.length(); ++i2) {
                                if (Character.isWhitespace((char)charSequence.charAt(i2))) continue;
                                return false;
                            }
                            return true;
                        }

                        /*
                         * Enabled force condition propagation
                         * Lifted jumps to return sites
                         */
                        boolean isNextCharacterEscapable(String string, boolean bl, int n2) {
                            int n3;
                            boolean bl2 = true;
                            if (!bl) return false;
                            int n4 = string.length();
                            if (n4 <= (n3 = n2 + bl2)) return false;
                            if (string.charAt(n3) == this.quotechar) return bl2;
                            if (string.charAt(n3) != this.escape) return false;
                            return bl2;
                        }

                        boolean isPending() {
                            return this.pending != null;
                        }

                        String[] parseLineMulti(String string) {
                            return this.parseLine(string, true);
                        }
                    };
                    this(iRParser, reader, n2, object);
                }
                {
                    this.this$0 = iRParser;
                    this.hasNext = true;
                    BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
                    this.br = bufferedReader;
                    this.skipLines = n2;
                    this.parser = cSVParser;
                }

                private String getNextLine() {
                    String string;
                    if (!this.linesSkiped) {
                        for (int i2 = 0; i2 < this.skipLines; ++i2) {
                            this.br.readLine();
                        }
                        this.linesSkiped = true;
                    }
                    if ((string = this.br.readLine()) == null) {
                        this.hasNext = false;
                    }
                    if (this.hasNext) {
                        return string;
                    }
                    return null;
                }

                public void close() {
                    this.br.close();
                }

                public Iterator<String[]> iterator() {
                    try {
                        Iterator<String[]> iterator = new Iterator<String[]>(this){
                            private String[] nextLine;
                            private CSVReader reader;
                            {
                                this.reader = cSVReader;
                                this.nextLine = cSVReader.readNext();
                            }

                            public boolean hasNext() {
                                return this.nextLine != null;
                            }

                            public String[] next() {
                                String[] arrstring = this.nextLine;
                                try {
                                    this.nextLine = this.reader.readNext();
                                    return arrstring;
                                }
                                catch (IOException iOException) {
                                    throw new RuntimeException((Throwable)iOException);
                                }
                            }

                            public void remove() {
                                throw new UnsupportedOperationException("This is a read only iterator.");
                            }
                        };
                        return iterator;
                    }
                    catch (IOException iOException) {
                        throw new RuntimeException((Throwable)iOException);
                    }
                }

                public String[] readNext() {
                    String[] arrstring = null;
                    do {
                        String string = this.getNextLine();
                        if (!this.hasNext) {
                            return arrstring;
                        }
                        String[] arrstring2 = this.parser.parseLineMulti(string);
                        if (arrstring2.length <= 0) continue;
                        if (arrstring == null) {
                            arrstring = arrstring2;
                            continue;
                        }
                        String[] arrstring3 = new String[arrstring.length + arrstring2.length];
                        System.arraycopy((Object)arrstring, (int)0, (Object)arrstring3, (int)0, (int)arrstring.length);
                        System.arraycopy((Object)arrstring2, (int)0, (Object)arrstring3, (int)arrstring.length, (int)arrstring2.length);
                        arrstring = arrstring3;
                    } while (this.parser.isPending());
                    return arrstring;
                }
            }.readNext();
            this.stationCodes = new HashMap();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String[] arrstring2 = arrstring[i2].split("-");
                this.stationCodes.put((Object)arrstring2[1].trim(), (Object)arrstring[i2].trim());
            }
        }
        return this.stationCodes;
    }

    private HashMap<String, String> trains() {
        if (this.trainsMap == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("http://www.indianrail.gov.in/enquiry/FetchTrainData?_=");
            stringBuilder.append(System.currentTimeMillis());
            String[] arrstring = new /* invalid duplicate definition of identical inner class */.readNext();
            this.trainsMap = new HashMap();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String[] arrstring2 = arrstring[i2].split("-");
                this.trainsMap.put((Object)arrstring2[0].trim(), (Object)arrstring[i2].trim());
            }
        }
        return this.trainsMap;
    }

    private String uploadRunningStatusToServer(String string, String string2) {
        block4 : {
            HttpURLConnection httpURLConnection;
            block5 : {
                String string3;
                try {
                    this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL("http://mobondhrd.appspot.com/irputrunningstatus").openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
                    httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
                    httpURLConnection.setRequestProperty("Cache-Control", "max-age=0");
                    httpURLConnection.setRequestProperty("Connection", "keep-alive");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("trainno=");
                    stringBuilder.append(string);
                    stringBuilder.append("&data=");
                    stringBuilder.append(URLEncoder.encode((String)string2, (String)"UTF-8"));
                    outputStream.write(stringBuilder.toString().getBytes());
                    outputStream.flush();
                    outputStream.close();
                    if (httpURLConnection.getResponseCode() != 200) break block4;
                    string3 = httpURLConnection.getHeaderField("Content-Encoding");
                    if (string3 == null) break block5;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return null;
                }
                if (!string3.equals((Object)"gzip")) break block5;
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                String string4 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
                return string4;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            String string5 = new String(IRParser.readFully(inputStream));
            inputStream.close();
            return string5;
        }
        return null;
    }

    @Override
    public void disconnect() {
        try {
            if (this.current_httpUrlConnection != null) {
                this.current_httpUrlConnection.disconnect();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String extractPnrFromSMS(String string, String string2) {
        try {
            Pattern pattern = Pattern.compile((String)"(^PNR)");
            Pattern pattern2 = Pattern.compile((String)"\\d{10}");
            Matcher matcher = pattern.matcher((CharSequence)string2);
            Matcher matcher2 = pattern2.matcher((CharSequence)string2);
            if (matcher.find() && matcher2.find()) {
                String string3 = matcher2.group(0);
                return string3;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public String formatIntoAMPM(String string, boolean bl) {
        if (this.sdf_in == null && this.sdf_out == null) {
            this.sdf_in = bl ? new SimpleDateFormat("HH:mm", Locale.US) : new SimpleDateFormat("HH.mm", Locale.US);
        }
        if (this.sdf_out == null) {
            this.sdf_out = new SimpleDateFormat("hh:mm a", Locale.US);
        }
        try {
            String string2 = this.sdf_out.format(this.sdf_in.parse(string));
            return string2;
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            return string;
        }
    }

    @Override
    public long get1HourPriorDepartureTime(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        try {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String)"GMT"));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(string));
            calendar.add(11, -1);
            long l2 = calendar.getTimeInMillis();
            return l2;
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            return -1L;
        }
    }

    @Override
    public long get2DaysPriorTime(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM,yyyy", Locale.US);
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(string));
            calendar.add(5, -2);
            calendar.set(11, 10);
            long l2 = calendar.getTimeInMillis();
            return l2;
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            return -1L;
        }
    }

    @Override
    public SimpleDateFormat getCancelledRescheduledDateFormat() {
        return new SimpleDateFormat("d MMM yyyy", Locale.US);
    }

    @Override
    public String getCancelledRescheduledTrains(String string, String string2, String string3) {
        HttpURLConnection httpURLConnection;
        if (string != null && string2 != null && string3 != null) {
            h h2 = new h();
            String string4 = string2.replaceFirst("trains", "allRescheduledTrains");
            String string5 = string3.replaceFirst("trains", "allDivertedTrains");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(string4);
            stringBuilder.append(string5);
            String string6 = stringBuilder.toString();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)byteArrayOutputStream);
            gZIPOutputStream.write(string6.getBytes("UTF-8"));
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            h2.a("datastringbase64", a.a(byteArrayOutputStream.toByteArray()));
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.urlsForCancelledRescheduledTrains1URL);
            stringBuilder2.append("?action=putdata");
            return c.c(stringBuilder2.toString(), h2, null);
        }
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(this.urlsForCancelledRescheduledTrains1URL).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-agent", "Mozilla/5.0");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setConnectTimeout(60000);
        int n2 = httpURLConnection.getResponseCode();
        String string7 = null;
        if (n2 == 200) {
            String string8 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string8 != null && string8.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                String string9 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
                return string9;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            string7 = new String(IRParser.readFully(inputStream));
            inputStream.close();
        }
        return string7;
    }

    @Override
    public void getCancelledRescheduledTrainsNew(Activity activity, CommonCallbacks commonCallbacks, WebView webView) {
        new CancelNReschuduledTrains(activity, commonCallbacks, webView).start();
    }

    @Override
    public String getClasses(String string, int n2, int n3, String string2, String string3, int n4, SeatAvailabilityInterface seatAvailabilityInterface) {
        return null;
    }

    public String getClassesEnglish(String string, int n2, int n3, String string2, String string3, int n4) {
        HttpURLConnection httpURLConnection;
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(this.getClassesURLEnglish).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        httpURLConnection.setRequestProperty("Cache-Control", "max-age=0");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Host", "www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Origin", "http://www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Referer", "http://www.indianrail.gov.in/fare_Enq.html");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setReadTimeout(n4);
        httpURLConnection.setConnectTimeout(n4);
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getIt=Please Wait...&lccp_trnno=");
        stringBuilder.append(string);
        stringBuilder.append("&lccp_srccode=");
        stringBuilder.append(string2);
        stringBuilder.append("&lccp_dstncode=");
        stringBuilder.append(string3);
        stringBuilder.append("&lccp_month=");
        stringBuilder.append(n3 + 1);
        stringBuilder.append("&lccp_day=");
        stringBuilder.append(n2);
        stringBuilder.append("&lccp_age=30&lccp_conc=ZZZZZZ&lccp_classopt=ZZ&lccp_frclass1=GN&lccp_frclass2=ZZ&lccp_frclass3=ZZ&lccp_frclass4=ZZ&lccp_frclass5=ZZ&lccp_frclass6=ZZ&lccp_frclass7=ZZ&lccp_disp_avl_flg=1&lccp_enrtcode=NONE&lccp_viacode=NONE");
        outputStream.write(stringBuilder.toString().getBytes());
        outputStream.flush();
        outputStream.close();
        if (httpURLConnection.getResponseCode() == 200) {
            String string4;
            String string5 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string5 != null && string5.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                string4 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                string4 = new String(IRParser.readFully(inputStream));
                inputStream.close();
            }
            int n5 = string4.indexOf("Class");
            String string6 = "";
            while (n5 > 0) {
                if (!string6.isEmpty()) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string6);
                    stringBuilder2.append(",");
                    string6 = stringBuilder2.toString();
                }
                int n6 = string4.indexOf("<", n5);
                String string7 = string4.substring(n5, n6);
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(string6);
                stringBuilder3.append(string7.replaceAll("Class", "").replaceAll("-", "").replaceAll(" ", ""));
                string6 = stringBuilder3.toString();
                n5 = string4.indexOf("Class", n6);
            }
            System.gc();
            if (string6.isEmpty()) {
                return null;
            }
            return string6;
        }
        System.gc();
        return null;
    }

    public String getClassesHindi(String string, int n2, int n3, String string2, String string3, int n4) {
        HttpURLConnection httpURLConnection;
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(this.getClassesURLHindi).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        httpURLConnection.setRequestProperty("Cache-Control", "max-age=0");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Host", "www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Origin", "http://www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Referer", "http://www.indianrail.gov.in/hfare_Enq.html");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setReadTimeout(n4);
        httpURLConnection.setConnectTimeout(n4);
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lccp_trnno=");
        stringBuilder.append(string);
        stringBuilder.append("&lccp_day=");
        stringBuilder.append(n2);
        stringBuilder.append("&lccp_month=");
        stringBuilder.append(n3 + 1);
        stringBuilder.append("&lccp_srccode=");
        stringBuilder.append(string2);
        stringBuilder.append("&lccp_dstncode=");
        stringBuilder.append(string3);
        stringBuilder.append("&lccp_classopt=FC&lccp_age=30&lccp_frclass1=GN&lccp_conc=ZZZZZZ&getIt=%E0%A4%A6%E0%A5%87%E0%A4%96%E0%A4%BF%E0%A4%8F&lccp_enrtcode=NONE&lccp_viacode=NONE&lccp_frclass2=ZZ&lccp_frclass3=ZZ&lccp_frclass4=ZZ&lccp_frclass5=ZZ&lccp_frclass6=ZZ&lccp_frclass7=ZZ&lccp_disp_avl_flg=1");
        outputStream.write(stringBuilder.toString().getBytes());
        outputStream.flush();
        outputStream.close();
        if (httpURLConnection.getResponseCode() == 200) {
            String string4;
            String string5 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string5 != null && string5.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                string4 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                string4 = new String(IRParser.readFully(inputStream));
                inputStream.close();
            }
            int n5 = string4.indexOf("&#2357;&#2376;&#2343;  &#2358;&#2381;&#2352;&#2375;&#2339;&#2367;&#2351;&#2366;&#2306; &#2361;&#2376;&#2306;  :");
            String string6 = null;
            if (n5 != -1) {
                int n6 = n5 + 111;
                String[] arrstring = string4.substring(n6, string4.indexOf("</td>", n6)).split("\n");
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = 0; i2 < arrstring.length; ++i2) {
                    arrstring[i2] = arrstring[i2].trim();
                    if (arrstring[i2].equals((Object)"")) continue;
                    stringBuffer.append(arrstring[i2]);
                    stringBuffer.append(",");
                }
                if (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == ',') {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                }
                string6 = stringBuffer.toString();
            }
            System.gc();
            return string6;
        }
        System.gc();
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public String getClearDelayTimeFromMinutes(int var1_1) {
        try {
            var1_1 = Math.abs((int)var1_1);
            if (var1_1 == 0) {
                return "On Time";
            }
            if (var1_1 <= 60) ** GOTO lbl21
            var6_2 = var1_1 / 60;
        }
        catch (Exception var2_7) {
            var2_7.printStackTrace();
            var3_8 = new StringBuilder();
            var3_8.append("");
            var3_8.append(var1_1);
            return var3_8.toString();
        }
        var7_3 = var1_1 % (var6_2 * 60);
        var8_4 = new StringBuilder();
        var8_4.append(var6_2);
        var8_4.append("hr ");
        var8_4.append(var7_3);
        var8_4.append("min");
        return var8_4.toString();
lbl21: // 1 sources:
        var13_5 = new StringBuilder();
        var13_5.append(var1_1);
        var13_5.append("min");
        return var13_5.toString();
    }

    @Override
    public String[][] getCoachComment(String string) {
        String string2 = string.trim();
        if (string2.startsWith("GEN")) {
            return new String[][]{{"Non Air Conditioned Non Reserved General Coach", "\nUNRESERVED\n"}};
        }
        if (string2.startsWith("SLR")) {
            return new String[][]{{"Parcel Coach", "\nPARCEL  COACH\n"}};
        }
        if (string2.startsWith("GD")) {
            return new String[][]{{"Guard Coach", "\nGUARD  COACH\n"}};
        }
        if (string2.startsWith("EN")) {
            return new String[][]{{"Locomotive or Engine", "\nENGINE\n"}};
        }
        if (string2.startsWith("HA")) {
            return new String[][]{{"Half Air Conditioned First Class & Half Air Conditioned 2 Tier Sleeper Coach (1A & 2A)", "ha"}};
        }
        if (string2.startsWith("HB")) {
            return new String[][]{{"Half Air Conditioned First Class & Half Air Conditioned 3 Tier Sleeper Coach (1A & 3A)", "hb"}};
        }
        if (string2.startsWith("PC")) {
            return new String[][]{{"Pantry Car", "\nPANTRY CAR\n"}};
        }
        if (string2.startsWith("GS")) {
            return new String[][]{{"Non Air Conditioned Unreserved Sitting Coach", "\nUNRESERVED\n"}};
        }
        if (string2.startsWith("UR")) {
            return new String[][]{{"Non Air Conditioned Unreserved Coach", "\nUNRESERVED\n"}};
        }
        if (string2.startsWith("AB")) {
            return new String[][]{{"Half Air Conditioned 2 Tier & Half Air Conditioned 3 Tier Sleeper Coach (2A & 3A)", "ab"}};
        }
        if (string2.startsWith("H")) {
            return new String[][]{{"Air Conditioned First Class Coach (1A)", "h"}};
        }
        if (string2.startsWith("A")) {
            return new String[][]{{"Air Conditioned 2 Tier Sleeper Coach (2A)", "a"}};
        }
        if (string2.startsWith("B")) {
            return new String[][]{{"Air Conditioned 3 Tier Sleeper Coach (3A)", "b"}};
        }
        if (string2.startsWith("BE")) {
            return new String[][]{{"Air Conditioned 3 Tier Sleeper Coach (3A) Extra", "b"}};
        }
        if (string2.startsWith("C")) {
            return new String[][]{{"Air Conditioned Chair Car Coach (CC)", "c"}};
        }
        if (string2.startsWith("E")) {
            return new String[][]{{"Air Conditioned Executive Class Coach (Shatabdi) (3E)", "e"}};
        }
        if (string2.startsWith("J")) {
            return new String[][]{{"Air Conditioned Chair Car Coach (Garib Rath) (CC)", "c"}};
        }
        if (string2.startsWith("G")) {
            return new String[][]{{"Air Conditioned 3 Tier Sleeper Coach (Garib Rath) (3A)", "g"}};
        }
        if (string2.startsWith("F")) {
            return new String[][]{{"Non Air Conditioned First class (FC)", null}};
        }
        if (string2.startsWith("S")) {
            return new String[][]{{"Non Air Conditioned Sleeper Class Coach (SL)", "s"}};
        }
        if (string2.startsWith("D")) {
            return new String[][]{{"Non Air Conditioned Chair Car Coach (2S)", "d"}};
        }
        if (string2.startsWith("LUG")) {
            return new String[][]{{"Luggage Coach", "\nLUGGAGE\n"}};
        }
        if (string2.startsWith("EOG")) {
            return new String[][]{{"Generator Car", "\nGENERATOR CAR\n"}};
        }
        if (string2.startsWith("K")) {
            return new String[][]{{"Anubhuti Coach (EA)", "\nANUBHUTI COACH (EA)\n"}};
        }
        if (string2.startsWith("EE")) {
            return new String[][]{{"Air Conditioned Executive Chair Coach (Shatabdi) (EC) Extra", "e"}};
        }
        if (string2.startsWith("CE")) {
            return new String[][]{{"Air Conditioned Chair Car Coach (CC) Extra", "c"}};
        }
        return new String[][]{{null, null}};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String[] getCurrentStatusAndComment(String string, String string2, String string3) {
        String[] arrstring = new String[3];
        String string4 = string2.trim().replace((CharSequence)" ", (CharSequence)"").toLowerCase();
        String string5 = string.trim().replace((CharSequence)" ", (CharSequence)"").toLowerCase();
        if (!(string4.contains((CharSequence)"wl") || string4.contains((CharSequence)"w/l") || string4.contains((CharSequence)"regret"))) {
            if (string4.contains((CharSequence)"nr")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<b>");
                stringBuilder.append(string2);
                stringBuilder.append("</b>");
                arrstring[0] = stringBuilder.toString();
                arrstring[2] = "<b><font color=#CC0000>NOT CONFIRMED, CHECK VIA SMS</font></b>";
                return arrstring;
            }
            if (!string4.contains((CharSequence)"can") && !string4.contains((CharSequence)"mod")) {
                arrstring[2] = string4.contains((CharSequence)"release") ? "<b><font color=#388E3C>RELEASED</font></b>" : (string4.contains((CharSequence)"nosb") ? "<b><font color=#01579B>CHILD. NO SEAT BERTH</font></b>" : "<b><font color=#388E3C>CONFIRMED</font></b>");
                if (!string3.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("<b>");
                    stringBuilder.append(string2);
                    stringBuilder.append("</b><font color=#757575><br><small>Coach Position: ");
                    stringBuilder.append(string3);
                    stringBuilder.append("</small></font>");
                    arrstring[0] = stringBuilder.toString();
                    if (string4.startsWith("r") && !string4.startsWith("rac")) {
                        arrstring[1] = this.getCoachBerthFromRAC(string2);
                        arrstring[2] = "<b><font color=#388E3C>CONFIRMED<br>RAC</font></b>";
                    } else {
                        arrstring[1] = this.getCoachBerth(string2);
                        if (!string4.contains((CharSequence)"nosb")) {
                            arrstring[2] = "<b><font color=#388E3C>CONFIRMED</font></b>";
                        }
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("<b>");
                    stringBuilder.append(string2);
                    stringBuilder.append("</b>");
                    arrstring[0] = stringBuilder.toString();
                    String string6 = this.getCoachBerth(string2);
                    if (string6 != null) {
                        arrstring[1] = string6;
                    } else if (string4.startsWith("rac")) {
                        arrstring[1] = string6 = this.getCoachBerthFromRAC(string2);
                    }
                    if (string6 != null) {
                        if (!string4.contains((CharSequence)"nosb")) {
                            arrstring[2] = "<b><font color=#388E3C>CONFIRMED</font></b>";
                        }
                    } else if (!string4.contains((CharSequence)"nosb")) {
                        arrstring[2] = "<b><font color=#388E3C>CONFIRMED</font></b>";
                    }
                }
                if (arrstring[1] == null) {
                    arrstring[1] = this.getCoachBerth(string5);
                }
                if (arrstring[1] != null || string4.contains((CharSequence)"nosb")) return arrstring;
                if (string4.startsWith("rac")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(arrstring[2]);
                    stringBuilder.append("<b><br><small><font color=#757575>Only Seating. Two people on Single berth. Seat No. will be allocated when chart is prepared. </small></font></b>");
                    arrstring[2] = stringBuilder.toString();
                    return arrstring;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(arrstring[2]);
                stringBuilder.append("<b><br><small><font color=#757575>Seat No. will be allocated when chart is prepared.</small></font></b>");
                arrstring[2] = stringBuilder.toString();
                return arrstring;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<b>");
            stringBuilder.append(string2);
            stringBuilder.append("</b>");
            arrstring[0] = stringBuilder.toString();
            arrstring[2] = "<b><font color=#01579B>CANCELLED / MODIFIED</font></b>";
            return arrstring;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<b>");
        stringBuilder.append(string2);
        stringBuilder.append("</b>");
        arrstring[0] = stringBuilder.toString();
        arrstring[2] = "<b><font color=#CC0000>NOT CONFIRMED</font></b>";
        return arrstring;
    }

    public Object[] getHttpGetRequestResult(String string) {
        return this.getHttpGetRequestResult(string, null, null, null, 60000);
    }

    public Object[] getHttpGetRequestResult(String string, String string2, String string3, String string4, int n2) {
        return this.getHttpGetRequestResult(string, string2, string3, string4, n2, null);
    }

    public Object[] getHttpGetRequestResult(String string, String string2, String string3, String string4, int n2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        Object[] arrobject = new Object[3];
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
        httpURLConnection.setRequestMethod("GET");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
            }
        }
        if (string3 != null) {
            httpURLConnection.setRequestProperty("Cookie", string3);
        }
        httpURLConnection.setRequestProperty("User-Agent", "Dalvik/1.6.0 (Linux; U; Android 4.4.2; SM-G900F Build/KOT49H)");
        if (string2 != null) {
            httpURLConnection.setRequestProperty("Host", string2);
        }
        if (string4 != null) {
            httpURLConnection.setRequestProperty("Referer", string4);
        }
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
                arrby = IRParser.readFully(inputStream);
                string5 = new String(arrby);
                inputStream.close();
            }
            StringBuffer stringBuffer = new StringBuffer(string5);
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("url:");
            stringBuilder.append(string);
            printStream.println(stringBuilder.toString());
            PrintStream printStream2 = System.out;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("htmlResponseBuffer:");
            stringBuilder2.append((Object)stringBuffer);
            printStream2.println(stringBuilder2.toString());
            arrobject[0] = new String(stringBuffer);
            arrobject[1] = arrby;
            arrobject[2] = httpURLConnection.getHeaderFields();
        }
        return arrobject;
    }

    @Override
    public int getIRParserVersion() {
        return 2019041601;
    }

    @Override
    public String getImageResultFromMobond(String string, String string2) {
        return this.getImageResultFromMobondCall(string, string2);
    }

    public String getMobondFormatPnrResult(String string) {
        JSONObject jSONObject = new JSONObject(string);
        if (jSONObject.has("errorMessage")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", (Object)jSONObject.getString("errorMessage"));
            if (jSONObject2.toString().toLowerCase().contains((CharSequence)"flush")) {
                return "flushed";
            }
            if (jSONObject2.toString().toLowerCase().contains((CharSequence)"valid")) {
                return "00";
            }
            throw new IllegalArgumentException(SERVER_ERROR);
        }
        String string2 = jSONObject.getString("trainNumber");
        String string3 = jSONObject.getString("trainName");
        String string4 = jSONObject.getString("dateOfJourney");
        Date date = new SimpleDateFormat("MMM d, yyyy H:m:s a", new Locale("en", "IN")).parse(string4);
        String string5 = new SimpleDateFormat("d MMM,yyyy", Locale.ENGLISH).format(date);
        String string6 = jSONObject.getString("boardingPoint");
        String string7 = jSONObject.getString("destinationStation");
        String string8 = jSONObject.getString("reservationUpto");
        String string9 = jSONObject.getString("boardingPoint");
        String string10 = jSONObject.getString("journeyClass");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = jSONObject.getJSONArray("passengerList");
        String string11 = "";
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = false;
        for (int i2 = 0; i2 < jSONArray2.length(); ++i2) {
            JSONObject jSONObject3 = new JSONObject();
            String string12 = string9;
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
            JSONArray jSONArray3 = jSONArray2;
            String string13 = string8;
            String string14 = string7;
            jSONObject3.put("passenger", jSONObject4.getLong("passengerSerialNumber"));
            String string15 = jSONObject4.getString("bookingStatusDetails");
            jSONObject3.put("old_status", (Object)string15);
            String string16 = jSONObject4.getString("currentStatusDetails");
            if (string16.equals((Object)"CNF") && string15.contains((CharSequence)"CNF")) {
                jSONObject3.put("current_status", (Object)string15);
                bl3 = true;
            } else {
                jSONObject3.put("current_status", (Object)string16);
            }
            jSONArray.put((Object)jSONObject3);
            if (bl && !string16.contains((CharSequence)"CAN") && !string16.contains((CharSequence)"MOD")) {
                bl = false;
            }
            if (bl2 && (string16.contains((CharSequence)"WL") || string16.contains((CharSequence)"W/L") || string16.toLowerCase().contains((CharSequence)"CAN"))) {
                bl2 = false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string11);
            String string17 = string11.isEmpty() ? "" : "\t";
            stringBuilder.append(string17);
            stringBuilder.append(string16);
            stringBuilder.append(" -");
            String string18 = stringBuilder.toString();
            if (!(string16.contains((CharSequence)"WL") || string16.contains((CharSequence)"W/L") || string16.contains((CharSequence)"REGRET"))) {
                if (string16.contains((CharSequence)"CAN")) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string18);
                    stringBuilder2.append(" Cancelled");
                    string11 = stringBuilder2.toString();
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string18);
                    stringBuilder3.append(" Confirmed");
                    string11 = stringBuilder3.toString();
                    bl3 = true;
                }
            } else {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(string18);
                stringBuilder4.append(" Not Confirmed");
                string11 = stringBuilder4.toString();
                bl2 = false;
            }
            string9 = string12;
            jSONArray2 = jSONArray3;
            string8 = string13;
            string7 = string14;
        }
        String string19 = string7;
        String string20 = string8;
        String string21 = string9;
        int n2 = IRParser.getDifferenceInDays(date);
        long l2 = IRParser.getNextAlarmTimeForPnr(n2);
        boolean bl4 = jSONObject.getString("chartStatus").equalsIgnoreCase("Chart Prepared");
        long l3 = date.getTime();
        boolean bl5 = n2 == 0 && bl2 && !bl4;
        JSONObject jSONObject5 = new JSONObject();
        boolean bl6 = bl5;
        jSONObject5.put("train_number", (Object)string2);
        jSONObject5.put("train_name", (Object)string3);
        jSONObject5.put("date", (Object)string5);
        jSONObject5.put("from", (Object)string6);
        jSONObject5.put("to", (Object)string19);
        jSONObject5.put("reserved_upto", (Object)string20);
        jSONObject5.put("boarding_point", (Object)string21);
        jSONObject5.put("class", (Object)string10);
        jSONObject5.put("passengers", (Object)jSONArray);
        jSONObject5.put("next_alarm_time", l2);
        jSONObject5.put("chart_prepared", bl4);
        jSONObject5.put("days_diff", n2);
        jSONObject5.put("is_all_confirmed", bl2);
        jSONObject5.put("is_anyone_confirmed", bl3);
        jSONObject5.put("is_all_canmod", bl);
        jSONObject5.put("date_in_millis", l3);
        jSONObject5.put("title_text", (Object)string11);
        jSONObject5.put("schedule_1_hr_prior_dep_query", bl6);
        return jSONObject5.toString();
    }

    @Override
    public void getPNRResults(Activity activity, String string, PNRCallbacks pNRCallbacks) {
        new PNRWebResult(string, activity, pNRCallbacks).start();
    }

    @Override
    public Object[] getPNRorSeatAvailCaptchaResults(String string, String string2, String string3, String string4, Map<String, String> map) {
        return this.getHttpGetRequestResult(string, string2, string3, string4, 60000, map);
    }

    @Override
    public String getPnrDepartureTimeFromMNTES(String string, String string2, String string3) {
        HttpURLConnection httpURLConnection;
        String string4;
        String string5 = string.replaceAll("[^0-9]", "");
        String string6 = string3.replaceAll("\\s+", "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM,yyyy", Locale.US);
        try {
            Date date = simpleDateFormat.parse(string2);
            string4 = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(date);
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            return "parseE";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getPnrDepartureTimeFromMNTESURL);
        stringBuilder.append(string5);
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(stringBuilder.toString()).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        httpURLConnection.setRequestProperty("Cache-Control", "max-age=0");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Host", "enquiry.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Origin", "http://enquiry.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Referer", "http://enquiry.indianrail.gov.in/mntes/enquiry?opt=TrainServiceSchedule&subOpt=show&trainNo=12215");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("trainNo=");
        stringBuilder2.append(string5);
        stringBuilder2.append("&trainStartDate=");
        stringBuilder2.append(string4);
        outputStream.write(stringBuilder2.toString().getBytes());
        outputStream.flush();
        outputStream.close();
        if (httpURLConnection.getResponseCode() == 200) {
            String string7;
            String string8 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string8 != null && string8.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                string7 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                string7 = new String(IRParser.readFully(inputStream));
                inputStream.close();
            }
            int n2 = string7.indexOf("<td><font size=\"1\">");
            int n3 = string7.indexOf("</font></td>", n2);
            int n4 = 0;
            while (n2 != -1) {
                String string9 = string7.substring(n2 + 19, n3);
                if (n4 > 0) {
                    n4 = (byte)(n4 + 1);
                }
                if (n4 == 3) {
                    return string9;
                }
                if (n4 == 0 && string9.equalsIgnoreCase(string6)) {
                    n4 = (byte)(n4 + 1);
                }
                n2 = string7.indexOf("<td><font size=\"1\">", n3);
                n3 = string7.indexOf("</font></td>", n2);
            }
            return "000";
        }
        return "000";
    }

    /*
     * Exception decompiling
     */
    @Override
    public String getPnrStatus(String var1, String var2, String var3, String var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    @Override
    public String getRunningStatus(String string) {
        block2 : {
            String string2;
            this.cookieAndParam = this.getKeyValueFromNTES();
            boolean bl = false;
            try {
                String string3;
                this.firstGetTrainDataThenRunningStatus(0, string);
                string2 = string3 = this.firstGetTrainDataThenRunningStatus(1, string);
                bl = true;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                Integer n2 = this.getApkBuildDate();
                if (n2 == null || n2 >= 20180724) break block2;
                string2 = this.getRunningStatusFromMobondServer(string);
            }
            return this.uploadRunningStatustoMobond(string2, bl, string);
        }
        return null;
    }

    @Override
    public Object[] getRunningStatusFromWeb(String string, String string2, String string3, Map<String, String> map) {
        return this.getHttpGetRequestResult(string, string2, string3, null, 60000, map);
    }

    @Override
    public void getRunningStatusViaWeb(Activity activity, String string, CommonCallbacks commonCallbacks, WebView webView) {
        new RunningStatusWeb(activity, string, commonCallbacks, webView).start();
    }

    public String getSeatStatus(Context context, SeatAvailabilityInterface seatAvailabilityInterface, String string, String string2, int n2, int n3, String string3, String string4, String string5) {
        Activity activity = (Activity)context;
        Runnable runnable = new Runnable(this, context, seatAvailabilityInterface, string, string2, n2, n3, string3, string4, string5){
            final /* synthetic */ IRParser this$0;
            final /* synthetic */ String val$classStr;
            final /* synthetic */ String val$classesStr;
            final /* synthetic */ Context val$context;
            final /* synthetic */ int val$dayOfMonth;
            final /* synthetic */ String val$fromStation;
            final /* synthetic */ int val$month;
            final /* synthetic */ SeatAvailabilityInterface val$seatAvailabilityInterface;
            final /* synthetic */ String val$toStation;
            final /* synthetic */ String val$trainNum;
            {
                this.this$0 = iRParser;
                this.val$context = context;
                this.val$seatAvailabilityInterface = seatAvailabilityInterface;
                this.val$classesStr = string;
                this.val$trainNum = string2;
                this.val$dayOfMonth = n2;
                this.val$month = n3;
                this.val$fromStation = string3;
                this.val$toStation = string4;
                this.val$classStr = string5;
            }

            public void run() {
                com.mobond.mindicator.ui.indianrail.irplugin.SeatAvailabilityWeb seatAvailabilityWeb = new com.mobond.mindicator.ui.indianrail.irplugin.SeatAvailabilityWeb(this.val$context, this.val$seatAvailabilityInterface, this.val$classesStr, this.val$trainNum, this.val$dayOfMonth, this.val$month, this.val$fromStation, this.val$toStation, this.val$classStr);
                seatAvailabilityWeb.start();
            }
        };
        activity.runOnUiThread(runnable);
        return null;
    }

    @Override
    public String getSeatStatus(String string, String string2, int n2, int n3, String string3, String string4, String string5, int n4, Context context, SeatAvailabilityInterface seatAvailabilityInterface) {
        block3 : {
            String string6;
            String string7;
            int n5;
            String string8;
            block4 : {
                n5 = n3 + 1;
                try {
                    string7 = this.getTrainNumber(string2);
                    string8 = this.getStationCode(string3);
                    string6 = this.getStationCode(string4);
                    if (string7 == null || string8 == null) break block3;
                    if (string6 != null) break block4;
                    return null;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return null;
                }
            }
            this.getSeatStatus(context, seatAvailabilityInterface, string, string7, n2, n5, string8, string6, string5);
            return null;
        }
        return null;
    }

    public String getSeatStatusEnglish(String string, int n2, int n3, String string2, String string3, String string4, int n4) {
        HttpURLConnection httpURLConnection;
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(this.getSeatStatusURLEnglish).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        httpURLConnection.setRequestProperty("Cache-Control", "max-age=0");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Host", "www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Origin", "http://www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Referer", "http://www.indianrail.gov.in/hseat_Avail.html");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setReadTimeout(n4);
        httpURLConnection.setConnectTimeout(n4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("&lccp_day=");
        stringBuilder.append(n2);
        stringBuilder.append("&lccp_month=");
        stringBuilder.append(n3 + 1);
        String string5 = stringBuilder.toString();
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("lccp_trnno=");
        stringBuilder2.append(string);
        stringBuilder2.append("&lccp_srccode=");
        stringBuilder2.append(string2);
        stringBuilder2.append("&lccp_dstncode=");
        stringBuilder2.append(string3);
        stringBuilder2.append("&lccp_class1=");
        stringBuilder2.append(string4);
        stringBuilder2.append("&lccp_quota=GN&submit=Please Wait...&lccp_classopt=ZZ&lccp_class2=ZZ&lccp_class3=ZZ&lccp_class4=ZZ&lccp_class5=ZZ&lccp_class6=ZZ&lccp_class7=ZZ&lccp_class6=ZZ&lccp_class7=ZZ");
        stringBuilder2.append(string5);
        outputStream.write(stringBuilder2.toString().getBytes());
        outputStream.flush();
        outputStream.close();
        if (httpURLConnection.getResponseCode() == 200) {
            String string6;
            String string7 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string7 != null && string7.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                string6 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                string6 = new String(IRParser.readFully(inputStream));
                inputStream.close();
            }
            return this.getSeatsStatusJSONEnglish(string6);
        }
        System.gc();
        return null;
    }

    public String getSeatStatusHindi(String string, int n2, int n3, String string2, String string3, String string4, int n4) {
        HttpURLConnection httpURLConnection;
        this.current_httpUrlConnection = httpURLConnection = (HttpURLConnection)new URL(this.getSeatStatusURLHindi).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        httpURLConnection.setRequestProperty("Cache-Control", "max-age=0");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Host", "www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Origin", "http://www.indianrail.gov.in");
        httpURLConnection.setRequestProperty("Referer", "http://www.indianrail.gov.in/hseat_Avail.html");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setReadTimeout(n4);
        httpURLConnection.setConnectTimeout(n4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("&lccp_day=");
        stringBuilder.append(n2);
        stringBuilder.append("&lccp_month=");
        stringBuilder.append(n3 + 1);
        String string5 = stringBuilder.toString();
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("lccp_trnno=");
        stringBuilder2.append(string);
        stringBuilder2.append("&lccp_srccode=");
        stringBuilder2.append(string2);
        stringBuilder2.append("&lccp_dstncode=");
        stringBuilder2.append(string3);
        stringBuilder2.append("&lccp_class1=");
        stringBuilder2.append(string4);
        stringBuilder2.append("&lccp_quota=GN&submit=Please Wait...&lccp_classopt=ZZ&lccp_class2=ZZ&lccp_class3=ZZ&lccp_class4=ZZ&lccp_class5=ZZ&lccp_class6=ZZ&lccp_class7=ZZ&lccp_class6=ZZ&lccp_class7=ZZ");
        stringBuilder2.append(string5);
        outputStream.write(stringBuilder2.toString().getBytes());
        outputStream.flush();
        outputStream.close();
        if (httpURLConnection.getResponseCode() == 200) {
            String string6;
            String string7 = httpURLConnection.getHeaderField("Content-Encoding");
            if (string7 != null && string7.equals((Object)"gzip")) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                string6 = new String(IRParser.readFully((InputStream)gZIPInputStream));
                gZIPInputStream.close();
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                string6 = new String(IRParser.readFully(inputStream));
                inputStream.close();
            }
            return this.getSeatsStatusJSONHindi(string6);
        }
        System.gc();
        return null;
    }

    @Override
    public String getStartDateClean(String string) {
        int n2 = string.lastIndexOf(" ");
        try {
            String string2 = string.substring(0, n2).toUpperCase();
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string.toUpperCase();
        }
    }

    @Override
    public String getTrainTimeTable(String string) {
        this.cookieAndParam = this.getKeyValueFromNTES();
        return this.getTimetableResponseFromNTES(string);
    }

    @Override
    public String getTrainsList(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("service=TrainRunningMob&subService=TrainBtwStnJson&stnFrom=");
        stringBuilder.append(string);
        stringBuilder.append("&stnTo=");
        stringBuilder.append(string2);
        stringBuilder.append("&trainType=ALL");
        String string3 = stringBuilder.toString();
        JSONObject jSONObject = new JSONObject();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string3.trim());
        stringBuilder3.append(KEY_1);
        stringBuilder2.append(this.m12050a(stringBuilder3.toString()).toUpperCase());
        stringBuilder2.append("#");
        stringBuilder2.append(this.m12089a(this.m12090a(KEY_2, KEY_3, string3.trim()).trim()));
        jSONObject.put("jsonIn", (Object)stringBuilder2.toString());
        String string4 = "";
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(this.getNtesAppUrl()).openConnection();
        httpsURLConnection.setReadTimeout(15000);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection.setRequestProperty("charset", "utf-8");
        String string5 = this.m12051b();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("meta");
        stringBuilder4.append(string5);
        httpsURLConnection.setRequestProperty(stringBuilder4.toString(), this.m12053c(string5));
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject.toString());
        dataOutputStream.flush();
        dataOutputStream.close();
        if (httpsURLConnection.getResponseCode() == 200) {
            String string6;
            BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(httpsURLConnection.getInputStream()));
            while ((string6 = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(string4);
                stringBuilder5.append(string6);
                string4 = stringBuilder5.toString();
            }
        } else {
            string4 = "";
        }
        if (!string4.equals((Object)"") && !(string4 = (String)new JSONObject(string4).get("jsonIn")).equals((Object)"")) {
            return this.getParsedTrainsList((JSONArray)new JSONObject(this.m12094b(this.m12093b(string4))).get("Trains"));
        }
        return string4;
    }

    @Override
    public String getdMMMyyyyDate() {
        return new SimpleDateFormat("d-MMM-yyyy", Locale.US).format(new Date(System.currentTimeMillis()));
    }

    public String parseRunningStatus(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        String[][] arrarrstring = new String[2][];
        String[] arrstring = new String[2];
        int n2 = 0;
        arrstring[0] = "runsOnDays";
        arrstring[1] = ",";
        arrarrstring[0] = arrstring;
        arrarrstring[1] = new String[]{"trnName", ","};
        for (String[] arrstring2 : arrarrstring) {
            int n3 = stringBuilder.indexOf(arrstring2[0]);
            int n4 = stringBuilder.indexOf(arrstring2[1], n3);
            while (n3 > 0 && n4 > 0) {
                stringBuilder.delete(n3, n4 + 1);
                n3 = stringBuilder.indexOf(arrstring2[0], n4);
                n4 = stringBuilder.indexOf(arrstring2[1], n3);
            }
        }
        String string2 = stringBuilder.substring(stringBuilder.indexOf("["));
        String[] arrstring3 = new String[]{"isRunningDataAvailable", "trainDataFound", "totalLateMins", "trainSchedule", "updWaitngArr", "totalJourney", "updWaitngDep", "startDayDiff", "lastUpdated", "stoppingStn", "cncldFrmStn", "journeyDate", "actDepDate", "cncldToStn", "schArrTime", "schDepTime", "actArrDate", "terminated", "startDate", "travelled", "trainType", "schDayCnt", "trainName", "departed", "dvrtdStn", "delayDep", "distance", "stations", "delayArr", "dayDiff", "stnCode", "depTime", "arrTime", "prfFlag", "trainNo", "runsOn", "actDep", "vldFrm", "dayCnt", "curStn", "actArr", "idMsg", "rakes", "vldTo", "from", "pfNo", "arr", "dep", "to"};
        for (int i2 = 0; i2 < 15; ++i2) {
            for (int i3 = 0; i3 < arrstring3.length; ++i3) {
                String string3;
                String string4;
                block7 : {
                    int n5;
                    string4 = arrstring3[i3];
                    string3 = null;
                    for (n5 = 0; n5 < arrstring3.length; ++n5) {
                        string3 = arrstring3[n5];
                        if (string3.length() >= string4.length()) {
                            continue;
                        }
                        break block7;
                    }
                    n5 = i3;
                }
                arrstring3[i3] = string3;
                arrstring3[n5] = string4;
            }
        }
        int n6 = arrstring3.length;
        while (n2 < n6) {
            String string5 = arrstring3[n2];
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string5);
            stringBuilder2.append(":");
            String string6 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("\"");
            stringBuilder3.append(string5);
            stringBuilder3.append("\":");
            string2 = string2.replaceAll(string6, stringBuilder3.toString());
            ++n2;
        }
        return string2;
    }

    public String reformatJson(String string, String string2) {
        JSONObject jSONObject = new JSONObject(string);
        if (jSONObject.has("avlDayList")) {
            JSONArray jSONArray = jSONObject.getJSONArray("avlDayList");
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string3 = jSONObject2.getString("availablityDate");
                String string4 = jSONObject2.getString("availablityStatus");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dt", (Object)string3);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getClassShort(string2));
                stringBuilder.append(",");
                stringBuilder.append(this.getStatusLabelShort(string4));
                stringBuilder.append(",");
                stringBuilder.append(this.getStatusDigits(string4));
                jSONObject3.put("info", (Object)stringBuilder.toString());
                jSONArray2.put((Object)jSONObject3);
            }
            return jSONArray2.toString();
        }
        return null;
    }

    @Override
    public String replaceAllKeepNumbersTrain(String string) {
        return string.replaceAll("[^0-9]", "");
    }

    @Override
    public Object[] requestCancelledNRescheduleTrains(String string, String string2, String string3, String string4, Map<String, String> map) {
        return this.getHttpGetRequestResult(string, string2, string3, string4, 60000, map);
    }

    @Override
    public Object[] requestPNR(String string, String string2, String string3, String string4, Map<String, String> map) {
        return this.getHttpGetRequestResult(string, string2, string3, string4, 60000, map);
    }

    @Override
    public Object[] requestSeatAvailability(String string, String string2, String string3, String string4, Map<String, String> map) {
        return this.getHttpGetRequestResult(string, string2, string3, string4, 60000, map);
    }

    public String uploadRunningStatustoMobond(String string, boolean bl, String string2) {
        JSONArray jSONArray = new JSONArray(string);
        JSONObject jSONObject = jSONArray.getJSONObject(0).getJSONObject("trainSchedule");
        jSONObject.put("stations", (Object)this.rebuildTimeTableJsonArrayFromRunningStatus(jSONObject.getJSONArray("stations")));
        if (bl) {
            String string3 = this.uploadRunningStatusToServer(string2, jSONArray.toString());
            if (string3 != null && !string3.isEmpty()) {
                return string3;
            }
            return null;
        }
        return jSONArray.toString();
    }

}

