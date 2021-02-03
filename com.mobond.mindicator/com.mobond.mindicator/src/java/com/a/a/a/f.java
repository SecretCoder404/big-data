/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URI
 *  java.util.Map
 *  java.util.Set
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.HttpClient
 *  org.apache.http.client.methods.HttpDelete
 *  org.apache.http.client.methods.HttpEntityEnclosingRequestBase
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpHead
 *  org.apache.http.client.methods.HttpOptions
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpPut
 *  org.apache.http.client.methods.HttpTrace
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.ByteArrayEntity
 *  org.apache.http.params.HttpConnectionParams
 *  org.apache.http.params.HttpParams
 */
package com.a.a.a;

import com.a.a.a.i;
import com.a.a.n;
import java.net.URI;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
public class f
implements i {
    protected final HttpClient a;

    public f(HttpClient httpClient) {
        this.a = httpClient;
    }

    static HttpUriRequest a(n<?> n2, Map<String, String> map) {
        switch (n2.getMethod()) {
            default: {
                throw new IllegalStateException("Unknown request method.");
            }
            case 7: {
                HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase = new HttpEntityEnclosingRequestBase(n2.getUrl()){
                    {
                        this.setURI(URI.create((String)string));
                    }

                    public String getMethod() {
                        return "PATCH";
                    }
                };
                httpEntityEnclosingRequestBase.addHeader("Content-Type", n2.getBodyContentType());
                f.a(httpEntityEnclosingRequestBase, n2);
                return httpEntityEnclosingRequestBase;
            }
            case 6: {
                return new HttpTrace(n2.getUrl());
            }
            case 5: {
                return new HttpOptions(n2.getUrl());
            }
            case 4: {
                return new HttpHead(n2.getUrl());
            }
            case 3: {
                return new HttpDelete(n2.getUrl());
            }
            case 2: {
                HttpPut httpPut = new HttpPut(n2.getUrl());
                httpPut.addHeader("Content-Type", n2.getBodyContentType());
                f.a((HttpEntityEnclosingRequestBase)httpPut, n2);
                return httpPut;
            }
            case 1: {
                HttpPost httpPost = new HttpPost(n2.getUrl());
                httpPost.addHeader("Content-Type", n2.getBodyContentType());
                f.a((HttpEntityEnclosingRequestBase)httpPost, n2);
                return httpPost;
            }
            case 0: {
                return new HttpGet(n2.getUrl());
            }
            case -1: 
        }
        byte[] arrby = n2.getPostBody();
        if (arrby != null) {
            HttpPost httpPost = new HttpPost(n2.getUrl());
            httpPost.addHeader("Content-Type", n2.getPostBodyContentType());
            httpPost.setEntity((HttpEntity)new ByteArrayEntity(arrby));
            return httpPost;
        }
        return new HttpGet(n2.getUrl());
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, n<?> n2) {
        byte[] arrby = n2.getBody();
        if (arrby != null) {
            httpEntityEnclosingRequestBase.setEntity((HttpEntity)new ByteArrayEntity(arrby));
        }
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String string : map.keySet()) {
            httpUriRequest.setHeader(string, (String)map.get((Object)string));
        }
    }

    protected void a(HttpUriRequest httpUriRequest) {
    }

    @Override
    public HttpResponse b(n<?> n2, Map<String, String> map) {
        HttpUriRequest httpUriRequest = f.a(n2, map);
        f.a(httpUriRequest, map);
        f.a(httpUriRequest, n2.getHeaders());
        this.a(httpUriRequest);
        HttpParams httpParams = httpUriRequest.getParams();
        int n3 = n2.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout((HttpParams)httpParams, (int)5000);
        HttpConnectionParams.setSoTimeout((HttpParams)httpParams, (int)n3);
        return this.a.execute(httpUriRequest);
    }

}

