/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  com.a.a.e
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.a.a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.a.a.b;
import com.a.a.e;
import com.a.a.k;
import com.a.a.o;
import com.a.a.p;
import com.a.a.r;
import com.a.a.u;
import com.a.a.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public abstract class n<T>
implements Comparable<n<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private b.a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private p.a mErrorListener;
    private final v.a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private a mRequestCompleteListener;
    private o mRequestQueue;
    private boolean mResponseDelivered;
    private r mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public n(int n2, String string, p.a a2) {
        v.a a3 = v.a.a ? new v.a() : null;
        this.mEventLog = a3;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mCacheEntry = null;
        this.mMethod = n2;
        this.mUrl = string;
        this.mErrorListener = a2;
        this.setRetryPolicy((r)new e());
        this.mDefaultTrafficStatsTag = n.findDefaultTrafficStatsTag(string);
    }

    @Deprecated
    public n(String string, p.a a2) {
        this(-1, string, a2);
    }

    private byte[] encodeParameters(Map<String, String> map, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    stringBuilder.append(URLEncoder.encode((String)((String)entry.getKey()), (String)string));
                    stringBuilder.append('=');
                    stringBuilder.append(URLEncoder.encode((String)((String)entry.getValue()), (String)string));
                    stringBuilder.append('&');
                    continue;
                }
                Object[] arrobject = new Object[]{entry.getKey(), entry.getValue()};
                throw new IllegalArgumentException(String.format((String)"Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", (Object[])arrobject));
            }
            byte[] arrby = stringBuilder.toString().getBytes(string);
            return arrby;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Encoding not supported: ");
            stringBuilder2.append(string);
            throw new RuntimeException(stringBuilder2.toString(), (Throwable)unsupportedEncodingException);
        }
    }

    private static int findDefaultTrafficStatsTag(String string) {
        String string2;
        Uri uri;
        if (!TextUtils.isEmpty((CharSequence)string) && (uri = Uri.parse((String)string)) != null && (string2 = uri.getHost()) != null) {
            return string2.hashCode();
        }
        return 0;
    }

    public void addMarker(String string) {
        if (v.a.a) {
            this.mEventLog.a(string, Thread.currentThread().getId());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cancel() {
        Object object;
        Object object2 = object = this.mLock;
        synchronized (object2) {
            this.mCanceled = true;
            this.mErrorListener = null;
            return;
        }
    }

    public int compareTo(n<T> n2) {
        b b2;
        b b3 = this.getPriority();
        if (b3 == (b2 = n2.getPriority())) {
            return this.mSequence - n2.mSequence;
        }
        return b2.ordinal() - b3.ordinal();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void deliverError(u u2) {
        Object object;
        Object object2 = object = this.mLock;
        // MONITORENTER : object2
        p.a a2 = this.mErrorListener;
        // MONITOREXIT : object2
        if (a2 == null) return;
        a2.onErrorResponse(u2);
    }

    protected abstract void deliverResponse(T var1);

    void finish(final String string) {
        o o2 = this.mRequestQueue;
        if (o2 != null) {
            o2.b(this);
        }
        if (v.a.a) {
            final long l2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(){

                    public void run() {
                        n.this.mEventLog.a(string, l2);
                        n.this.mEventLog.a(n.this.toString());
                    }
                });
                return;
            }
            this.mEventLog.a(string, l2);
            this.mEventLog.a(this.toString());
        }
    }

    public byte[] getBody() {
        Map<String, String> map = this.getParams();
        if (map != null && map.size() > 0) {
            return this.encodeParameters(map, this.getParamsEncoding());
        }
        return null;
    }

    public String getBodyContentType() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("application/x-www-form-urlencoded; charset=");
        stringBuilder.append(this.getParamsEncoding());
        return stringBuilder.toString();
    }

    public b.a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String string = this.getUrl();
        int n2 = this.getMethod();
        if (n2 != 0) {
            if (n2 == -1) {
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Integer.toString((int)n2));
            stringBuilder.append('-');
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public p.a getErrorListener() {
        Object object;
        Object object2 = object = this.mLock;
        synchronized (object2) {
            return this.mErrorListener;
        }
    }

    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    protected Map<String, String> getParams() {
        return null;
    }

    protected String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> map = this.getPostParams();
        if (map != null && map.size() > 0) {
            return this.encodeParameters(map, this.getPostParamsEncoding());
        }
        return null;
    }

    @Deprecated
    public String getPostBodyContentType() {
        return this.getBodyContentType();
    }

    @Deprecated
    protected Map<String, String> getPostParams() {
        return this.getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return this.getParamsEncoding();
    }

    public b getPriority() {
        return b.b;
    }

    public r getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer n2 = this.mSequence;
        if (n2 != null) {
            return n2;
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return this.getRetryPolicy().a();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean hasHadResponseDelivered() {
        Object object;
        Object object2 = object = this.mLock;
        synchronized (object2) {
            return this.mResponseDelivered;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isCanceled() {
        Object object;
        Object object2 = object = this.mLock;
        synchronized (object2) {
            return this.mCanceled;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void markDelivered() {
        Object object;
        Object object2 = object = this.mLock;
        synchronized (object2) {
            this.mResponseDelivered = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void notifyListenerResponseNotUsable() {
        Object object;
        Object object2 = object = this.mLock;
        // MONITORENTER : object2
        a a2 = this.mRequestCompleteListener;
        // MONITOREXIT : object2
        if (a2 == null) return;
        a2.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void notifyListenerResponseReceived(p<?> p2) {
        Object object;
        Object object2 = object = this.mLock;
        // MONITORENTER : object2
        a a2 = this.mRequestCompleteListener;
        // MONITOREXIT : object2
        if (a2 == null) return;
        a2.a(this, p2);
    }

    protected u parseNetworkError(u u2) {
        return u2;
    }

    protected abstract p<T> parseNetworkResponse(k var1);

    public n<?> setCacheEntry(b.a a2) {
        this.mCacheEntry = a2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void setNetworkRequestCompleteListener(a a2) {
        Object object;
        Object object2 = object = this.mLock;
        synchronized (object2) {
            this.mRequestCompleteListener = a2;
            return;
        }
    }

    public n<?> setRequestQueue(o o2) {
        this.mRequestQueue = o2;
        return this;
    }

    public n<?> setRetryPolicy(r r2) {
        this.mRetryPolicy = r2;
        return this;
    }

    public final n<?> setSequence(int n2) {
        this.mSequence = n2;
        return this;
    }

    public final n<?> setShouldCache(boolean bl2) {
        this.mShouldCache = bl2;
        return this;
    }

    public final n<?> setShouldRetryServerErrors(boolean bl2) {
        this.mShouldRetryServerErrors = bl2;
        return this;
    }

    public n<?> setTag(Object object) {
        this.mTag = object;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x");
        stringBuilder.append(Integer.toHexString((int)this.getTrafficStatsTag()));
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        String string2 = this.isCanceled() ? "[X] " : "[ ] ";
        stringBuilder2.append(string2);
        stringBuilder2.append(this.getUrl());
        stringBuilder2.append(" ");
        stringBuilder2.append(string);
        stringBuilder2.append(" ");
        stringBuilder2.append((Object)((Object)this.getPriority()));
        stringBuilder2.append(" ");
        stringBuilder2.append((Object)this.mSequence);
        return stringBuilder2.toString();
    }

    static interface a {
        public void a(n<?> var1);

        public void a(n<?> var1, p<?> var2);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        public static final /* enum */ b d = new b();
        private static final /* synthetic */ b[] e;

        static {
            b[] arrb = new b[]{a, b, c, d};
            e = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])e.clone();
        }
    }

}

