/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.BitmapRegionDecoder
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.annotation.Keep
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.locks.Lock
 *  java.util.concurrent.locks.ReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Keep;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaImageRegionDecoder
implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock = new ReentrantReadWriteLock(true);

    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }

    public SkiaImageRegionDecoder(Bitmap.Config config) {
        Bitmap.Config config2 = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
            return;
        }
        if (config2 != null) {
            this.bitmapConfig = config2;
            return;
        }
        this.bitmapConfig = Bitmap.Config.RGB_565;
    }

    private Lock getDecodeLock() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.decoderLock.writeLock();
        }
        return this.decoderLock.readLock();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Bitmap decodeRegion(Rect rect, int n2) {
        block3 : {
            Bitmap bitmap;
            this.getDecodeLock().lock();
            try {
                if (this.decoder == null || this.decoder.isRecycled()) throw new IllegalStateException("Cannot decode region after decoder has been recycled");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = n2;
                options.inPreferredConfig = this.bitmapConfig;
                bitmap = this.decoder.decodeRegion(rect, options);
                if (bitmap == null) break block3;
            }
            catch (Throwable throwable) {
                this.getDecodeLock().unlock();
                throw throwable;
            }
            this.getDecodeLock().unlock();
            return bitmap;
        }
        throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
    }

    /*
     * Exception decompiling
     */
    @Override
    public Point init(Context var1, Uri var2) {
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
    public boolean isReady() {
        SkiaImageRegionDecoder skiaImageRegionDecoder = this;
        synchronized (skiaImageRegionDecoder) {
            boolean bl2;
            boolean bl3 = this.decoder != null && !(bl2 = this.decoder.isRecycled());
            return bl3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void recycle() {
        SkiaImageRegionDecoder skiaImageRegionDecoder = this;
        synchronized (skiaImageRegionDecoder) {
            this.decoderLock.writeLock().lock();
            try {
                this.decoder.recycle();
                this.decoder = null;
                return;
            }
            finally {
                this.decoderLock.writeLock().unlock();
            }
        }
    }
}

