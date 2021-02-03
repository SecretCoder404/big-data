/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.lang.Exception
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.ProtocolException
 *  java.net.SocketTimeoutException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.HashMap
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cf;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.fb;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class cf
extends ez {
    private static final String n = "cf";
    private HttpURLConnection o;

    cf() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void c(HttpURLConnection var1_1) {
        block16 : {
            var2_2 = new StringBuilder();
            if (this.a != null) {
                var2_2.append(this.a);
            } else if (this.g != null && !this.g.isEmpty()) {
                for (Map.Entry var18_4 : this.g.entrySet()) {
                    var2_2.append((String)var18_4.getKey());
                    var2_2.append("=");
                    var2_2.append(fb.a((String)var18_4.getValue()));
                    var2_2.append("&");
                }
                var2_2.deleteCharAt(var2_2.lastIndexOf("&"));
            }
            if (this.h && this.j() != null) {
                var15_5 = this.k == false ? this.j().replaceAll(",\\s*\"\\s*sessionId\\s*\"\\s*:\\s*\".*?\"|\\s*\"\\s*sessionId\\s*\"\\s*:\\s*\".*?\"\\s*,*", "") : this.j();
                this.l().c("Request Body: %s", new Object[]{var15_5});
            }
            var3_6 = null;
            var4_7 = new OutputStreamWriter(var1_1.getOutputStream(), "UTF-8");
            var4_7.write(var2_2.toString());
            try {
                var4_7.close();
                return;
            }
            catch (IOException var12_8) {
                var13_9 = this.l();
                var14_10 = new Object[]{var12_8.getMessage()};
                var13_9.e("Problem while closing output stream writer for request body: %s", var14_10);
                throw new ez.c(this, ez.f.a, "Problem while closing output stream writer for request body", var12_8);
            }
            catch (Throwable var8_11) {
                var3_6 = var4_7;
                break block16;
            }
            catch (IOException var5_14) {
                var3_6 = var4_7;
                ** GOTO lbl-1000
            }
            catch (Throwable var8_12) {
                break block16;
            }
            catch (IOException var5_15) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                var6_17 = this.l();
                var7_18 = new Object[]{var5_16.getMessage()};
                var6_17.e("Problem while creating output steam for request body: %s", var7_18);
                throw new ez.c(this, ez.f.a, "Problem while creating output steam for request body", (Throwable)var5_16);
            }
        }
        if (var3_6 == null) throw var8_13;
        try {
            var3_6.close();
            throw var8_13;
        }
        catch (IOException var9_19) {
            var10_20 = this.l();
            var11_21 = new Object[]{var9_19.getMessage()};
            var10_20.e("Problem while closing output stream writer for request body: %s", var11_21);
            throw new ez.c(this, ez.f.a, "Problem while closing output stream writer for request body", var9_19);
        }
    }

    @Override
    protected ez.g a(URL uRL) {
        if (this.o != null) {
            this.a();
        }
        try {
            this.o = this.b(uRL);
        }
        catch (IOException iOException) {
            cy cy2 = this.l();
            Object[] arrobject = new Object[]{iOException.getMessage()};
            cy2.e("Problem while opening the URL connection: %s", arrobject);
            throw new ez.c(this, ez.f.a, "Problem while opening the URL connection", iOException);
        }
        this.a(this.o);
        try {
            this.o.connect();
        }
        catch (Exception exception) {
            cy cy3 = this.l();
            Object[] arrobject = new Object[]{exception.getMessage()};
            cy3.e("Problem while connecting to URL: %s", arrobject);
            throw new ez.c(this, ez.f.a, "Probem while connecting to URL", exception);
        }
        catch (SocketTimeoutException socketTimeoutException) {
            cy cy4 = this.l();
            Object[] arrobject = new Object[]{socketTimeoutException.getMessage()};
            cy4.e("Socket timed out while connecting to URL: %s", arrobject);
            throw new ez.c(this, ez.f.b, "Socket timed out while connecting to URL", socketTimeoutException);
        }
        return this.b(this.o);
    }

    @Override
    protected void a() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.o = null;
        }
    }

    protected void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.setRequestMethod(this.d().name());
        }
        catch (ProtocolException protocolException) {
            cy cy2 = this.l();
            Object[] arrobject = new Object[]{protocolException.getMessage()};
            cy2.e("Invalid client protocol: %s", arrobject);
            throw new ez.c(this, ez.f.d, "Invalid client protocol", protocolException);
        }
        for (Map.Entry entry : this.e.entrySet()) {
            if (entry.getValue() == null || ((String)entry.getValue()).equals((Object)"")) continue;
            httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
        httpURLConnection.setConnectTimeout(this.k());
        httpURLConnection.setReadTimeout(this.k());
        this.a(httpURLConnection.getURL().toString());
        switch (1.a[this.d().ordinal()]) {
            default: {
                return;
            }
            case 2: {
                httpURLConnection.setDoOutput(true);
                this.c(httpURLConnection);
                return;
            }
            case 1: 
        }
        httpURLConnection.setDoOutput(false);
        return;
    }

    protected ez.g b(HttpURLConnection httpURLConnection) {
        ez.g g2 = new ez.g(this);
        try {
            g2.a(httpURLConnection.getResponseCode());
            g2.a(httpURLConnection.getResponseMessage());
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            cy cy2 = this.l();
            Object[] arrobject = new Object[]{indexOutOfBoundsException.getMessage()};
            cy2.e("IndexOutOfBoundsException while getting the response status code: %s", arrobject);
            throw new ez.c(this, ez.f.c, "IndexOutOfBoundsException while getting the response status code", indexOutOfBoundsException);
        }
        catch (IOException iOException) {
            cy cy3 = this.l();
            Object[] arrobject = new Object[]{iOException.getMessage()};
            cy3.e("IOException while getting the response status code: %s", arrobject);
            throw new ez.c(this, ez.f.a, "IOException while getting the response status code", iOException);
        }
        catch (SocketTimeoutException socketTimeoutException) {
            cy cy4 = this.l();
            Object[] arrobject = new Object[]{socketTimeoutException.getMessage()};
            cy4.e("Socket Timeout while getting the response status code: %s", arrobject);
            throw new ez.c(this, ez.f.b, "Socket Timeout while getting the response status code", socketTimeoutException);
        }
        if (g2.b() == 200) {
            try {
                g2.a(httpURLConnection.getInputStream());
                return g2;
            }
            catch (IOException iOException) {
                cy cy5 = this.l();
                Object[] arrobject = new Object[]{iOException.getMessage()};
                cy5.e("IOException while reading the input stream from response: %s", arrobject);
                throw new ez.c(this, ez.f.a, "IOException while reading the input stream from response", iOException);
            }
        }
        return g2;
    }

    @Override
    protected String b() {
        return n;
    }

    protected HttpURLConnection b(URL uRL) {
        return (HttpURLConnection)uRL.openConnection();
    }
}

