/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package com.a.a.a;

import com.a.a.k;
import com.a.a.p;
import com.a.a.v;
import java.io.UnsupportedEncodingException;

public abstract class n<T>
extends com.a.a.n<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format((String)"application/json; charset=%s", (Object[])new Object[]{"utf-8"});
    private p.b<T> mListener;
    private final Object mLock = new Object();
    private final String mRequestBody;

    public n(int n2, String string, String string2, p.b<T> b2, p.a a2) {
        super(n2, string, a2);
        this.mListener = b2;
        this.mRequestBody = string2;
    }

    @Deprecated
    public n(String string, String string2, p.b<T> b2, p.a a2) {
        this(-1, string, string2, b2, a2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cancel() {
        Object object;
        super.cancel();
        Object object2 = object = this.mLock;
        synchronized (object2) {
            this.mListener = null;
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
    @Override
    protected void deliverResponse(T t2) {
        Object object;
        Object object2 = object = this.mLock;
        // MONITORENTER : object2
        p.b<T> b2 = this.mListener;
        // MONITOREXIT : object2
        if (b2 == null) return;
        b2.onResponse(t2);
    }

    @Override
    public byte[] getBody() {
        block3 : {
            try {
                if (this.mRequestBody != null) break block3;
                return null;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                Object[] arrobject = new Object[]{this.mRequestBody, PROTOCOL_CHARSET};
                v.d("Unsupported Encoding while trying to get the bytes of %s using %s", arrobject);
                return null;
            }
        }
        byte[] arrby = this.mRequestBody.getBytes(PROTOCOL_CHARSET);
        return arrby;
    }

    @Override
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Deprecated
    @Override
    public byte[] getPostBody() {
        return this.getBody();
    }

    @Deprecated
    @Override
    public String getPostBodyContentType() {
        return this.getBodyContentType();
    }

    @Override
    protected abstract p<T> parseNetworkResponse(k var1);
}

