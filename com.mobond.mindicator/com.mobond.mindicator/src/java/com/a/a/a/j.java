/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.DataOutputStream
 *  java.io.FilterInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.net.ssl.HttpsURLConnection
 *  javax.net.ssl.SSLSocketFactory
 */
package com.a.a.a;

import com.a.a.a.h;
import com.a.a.g;
import com.a.a.n;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class j
extends com.a.a.a.b {
    private final b a;
    private final SSLSocketFactory b;

    public j() {
        this(null);
    }

    public j(b b2) {
        this(b2, null);
    }

    public j(b b2, SSLSocketFactory sSLSocketFactory) {
        this.a = b2;
        this.b = sSLSocketFactory;
    }

    static /* synthetic */ InputStream a(HttpURLConnection httpURLConnection) {
        return j.b(httpURLConnection);
    }

    private HttpURLConnection a(URL uRL, n<?> n2) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnection = this.a(uRL);
        int n3 = n2.getTimeoutMs();
        httpURLConnection.setConnectTimeout(n3);
        httpURLConnection.setReadTimeout(n3);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals((Object)uRL.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            ((HttpsURLConnection)httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }

    static List<g> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null) continue;
            for (String string : (List)entry.getValue()) {
                arrayList.add((Object)new g((String)entry.getKey(), string));
            }
        }
        return arrayList;
    }

    static void a(HttpURLConnection httpURLConnection, n<?> n2) {
        switch (n2.getMethod()) {
            default: {
                throw new IllegalStateException("Unknown method type.");
            }
            case 7: {
                httpURLConnection.setRequestMethod("PATCH");
                j.b(httpURLConnection, n2);
                return;
            }
            case 6: {
                httpURLConnection.setRequestMethod("TRACE");
                return;
            }
            case 5: {
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            }
            case 4: {
                httpURLConnection.setRequestMethod("HEAD");
                return;
            }
            case 3: {
                httpURLConnection.setRequestMethod("DELETE");
                return;
            }
            case 2: {
                httpURLConnection.setRequestMethod("PUT");
                j.b(httpURLConnection, n2);
                return;
            }
            case 1: {
                httpURLConnection.setRequestMethod("POST");
                j.b(httpURLConnection, n2);
                return;
            }
            case 0: {
                httpURLConnection.setRequestMethod("GET");
                return;
            }
            case -1: 
        }
        byte[] arrby = n2.getPostBody();
        if (arrby != null) {
            httpURLConnection.setRequestMethod("POST");
            j.a(httpURLConnection, n2, arrby);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, n<?> n2, byte[] arrby) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey((Object)"Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", n2.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(arrby);
        dataOutputStream.close();
    }

    private static boolean a(int n2, int n3) {
        return n2 != 4 && (100 > n3 || n3 >= 200) && n3 != 204 && n3 != 304;
    }

    private static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream;
        }
        catch (IOException iOException) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static void b(HttpURLConnection httpURLConnection, n<?> n2) {
        byte[] arrby = n2.getBody();
        if (arrby != null) {
            j.a(httpURLConnection, n2, arrby);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public h a(n<?> n2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        boolean bl;
        int n3;
        block7 : {
            String string;
            h h2;
            String string2 = n2.getUrl();
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.putAll(n2.getHeaders());
            b b2 = this.a;
            if (b2 != null) {
                string = b2.a(string2);
                if (string == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("URL blocked by rewriter: ");
                    stringBuilder.append(string2);
                    throw new IOException(stringBuilder.toString());
                }
            } else {
                string = string2;
            }
            httpURLConnection = this.a(new URL(string), n2);
            bl = false;
            try {
                Iterator iterator = hashMap.keySet().iterator();
                do {
                    boolean bl2 = iterator.hasNext();
                    bl = false;
                    if (!bl2) break;
                    String string3 = (String)iterator.next();
                    httpURLConnection.setRequestProperty(string3, (String)hashMap.get((Object)string3));
                } while (true);
                j.a(httpURLConnection, n2);
                n3 = httpURLConnection.getResponseCode();
                bl = false;
                if (n3 == -1) throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                boolean bl3 = j.a(n2.getMethod(), n3);
                bl = false;
                if (bl3) break block7;
                h2 = new h(n3, j.a((Map<String, List<String>>)httpURLConnection.getHeaderFields()));
            }
            catch (Throwable throwable) {
                if (bl) throw throwable;
                httpURLConnection.disconnect();
                throw throwable;
            }
            httpURLConnection.disconnect();
            return h2;
        }
        bl = true;
        return new h(n3, j.a((Map<String, List<String>>)httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), (InputStream)new FilterInputStream(httpURLConnection){
            private final HttpURLConnection a;
            {
                this.a = httpURLConnection;
            }

            public void close() {
                super.close();
                this.a.disconnect();
            }
        });
    }

    protected HttpURLConnection a(URL uRL) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

}

