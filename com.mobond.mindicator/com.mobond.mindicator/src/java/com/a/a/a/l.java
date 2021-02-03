/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.a.a.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.a.a.a.g;
import com.a.a.e;
import com.a.a.k;
import com.a.a.m;
import com.a.a.n;
import com.a.a.p;
import com.a.a.r;
import com.a.a.v;

public class l
extends n<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private p.b<Bitmap> mListener;
    private final Object mLock = new Object();
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    @Deprecated
    public l(String string, p.b<Bitmap> b2, int n2, int n3, Bitmap.Config config, p.a a2) {
        this(string, b2, n2, n3, ImageView.ScaleType.CENTER_INSIDE, config, a2);
    }

    public l(String string, p.b<Bitmap> b2, int n2, int n3, ImageView.ScaleType scaleType, Bitmap.Config config, p.a a2) {
        super(0, string, a2);
        this.setRetryPolicy(new e(1000, 2, 2.0f));
        this.mListener = b2;
        this.mDecodeConfig = config;
        this.mMaxWidth = n2;
        this.mMaxHeight = n3;
        this.mScaleType = scaleType;
    }

    private p<Bitmap> doParse(k k2) {
        Bitmap bitmap;
        byte[] arrby = k2.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            bitmap = BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length, (BitmapFactory.Options)options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length, (BitmapFactory.Options)options);
            int n2 = options.outWidth;
            int n3 = options.outHeight;
            int n4 = l.getResizedDimension(this.mMaxWidth, this.mMaxHeight, n2, n3, this.mScaleType);
            int n5 = l.getResizedDimension(this.mMaxHeight, this.mMaxWidth, n3, n2, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = l.findBestSampleSize(n2, n3, n4, n5);
            bitmap = BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length, (BitmapFactory.Options)options);
            if (bitmap != null && (bitmap.getWidth() > n4 || bitmap.getHeight() > n5)) {
                Bitmap bitmap2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n4, (int)n5, (boolean)true);
                bitmap.recycle();
                bitmap = bitmap2;
            }
        }
        if (bitmap == null) {
            return p.a(new m(k2));
        }
        return p.a(bitmap, g.a(k2));
    }

    static int findBestSampleSize(int n2, int n3, int n4, int n5) {
        float f2;
        double d2 = n2;
        double d3 = n4;
        Double.isNaN((double)d2);
        Double.isNaN((double)d3);
        double d4 = d2 / d3;
        double d5 = n3;
        double d6 = n5;
        Double.isNaN((double)d5);
        Double.isNaN((double)d6);
        double d7 = Math.min((double)d4, (double)(d5 / d6));
        float f3 = 1.0f;
        while ((double)(f2 = 2.0f * f3) <= d7) {
            f3 = f2;
        }
        return (int)f3;
    }

    private static int getResizedDimension(int n2, int n3, int n4, int n5, ImageView.ScaleType scaleType) {
        if (n2 == 0 && n3 == 0) {
            return n4;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (n2 == 0) {
                return n4;
            }
            return n2;
        }
        if (n2 == 0) {
            double d2 = n3;
            double d3 = n5;
            Double.isNaN((double)d2);
            Double.isNaN((double)d3);
            double d4 = d2 / d3;
            double d5 = n4;
            Double.isNaN((double)d5);
            return (int)(d5 * d4);
        }
        if (n3 == 0) {
            return n2;
        }
        double d6 = n5;
        double d7 = n4;
        Double.isNaN((double)d6);
        Double.isNaN((double)d7);
        double d8 = d6 / d7;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d9 = n2;
            Double.isNaN((double)d9);
            double d10 = d9 * d8;
            double d11 = n3;
            if (d10 < d11) {
                Double.isNaN((double)d11);
                n2 = (int)(d11 / d8);
            }
            return n2;
        }
        double d12 = n2;
        Double.isNaN((double)d12);
        double d13 = d12 * d8;
        double d14 = n3;
        if (d13 > d14) {
            Double.isNaN((double)d14);
            n2 = (int)(d14 / d8);
        }
        return n2;
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
    protected void deliverResponse(Bitmap bitmap) {
        Object object;
        Object object2 = object = this.mLock;
        // MONITORENTER : object2
        p.b<Bitmap> b2 = this.mListener;
        // MONITOREXIT : object2
        if (b2 == null) return;
        b2.onResponse(bitmap);
    }

    @Override
    public n.b getPriority() {
        return n.b.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected p<Bitmap> parseNetworkResponse(k k2) {
        Object object;
        Object object2 = object = sDecodeLock;
        synchronized (object2) {
            try {
                try {
                    return this.doParse(k2);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    Object[] arrobject = new Object[]{k2.b.length, this.getUrl()};
                    v.c("Caught OOM for %d byte image, url=%s", arrobject);
                    return p.a(new m(outOfMemoryError));
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

