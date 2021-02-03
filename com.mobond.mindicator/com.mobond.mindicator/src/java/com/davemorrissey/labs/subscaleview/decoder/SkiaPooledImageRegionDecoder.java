/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
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
 *  android.util.Log
 *  androidx.annotation.Keep
 *  java.io.File
 *  java.io.FileFilter
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Semaphore
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.locks.Lock
 *  java.util.concurrent.locks.ReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaPooledImageRegionDecoder
implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private static final String TAG = "SkiaPooledImageRegionDecoder";
    private static boolean debug;
    private final Bitmap.Config bitmapConfig;
    private Context context;
    private final ReadWriteLock decoderLock = new ReentrantReadWriteLock(true);
    private DecoderPool decoderPool = new Object(){
        private final Semaphore available = new Semaphore(0, true);
        private final Map<BitmapRegionDecoder, Boolean> decoders = new ConcurrentHashMap();

        static /* synthetic */ int access$200(DecoderPool decoderPool) {
            return decoderPool.size();
        }

        static /* synthetic */ void access$600(DecoderPool decoderPool, BitmapRegionDecoder bitmapRegionDecoder) {
            decoderPool.add(bitmapRegionDecoder);
        }

        private BitmapRegionDecoder acquire() {
            this.available.acquireUninterruptibly();
            return this.getNextAvailable();
        }

        private void add(BitmapRegionDecoder bitmapRegionDecoder) {
            DecoderPool decoderPool = this;
            synchronized (decoderPool) {
                this.decoders.put((Object)bitmapRegionDecoder, (Object)false);
                this.available.release();
                return;
            }
        }

        private BitmapRegionDecoder getNextAvailable() {
            DecoderPool decoderPool = this;
            synchronized (decoderPool) {
                for (Map.Entry entry : this.decoders.entrySet()) {
                    if (((Boolean)entry.getValue()).booleanValue()) continue;
                    entry.setValue((Object)true);
                    BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder)entry.getKey();
                    return bitmapRegionDecoder;
                }
                return null;
            }
        }

        private boolean isEmpty() {
            DecoderPool decoderPool = this;
            synchronized (decoderPool) {
                boolean bl2 = this.decoders.isEmpty();
                return bl2;
            }
        }

        private boolean markAsUnused(BitmapRegionDecoder bitmapRegionDecoder) {
            DecoderPool decoderPool = this;
            synchronized (decoderPool) {
                for (Map.Entry entry : this.decoders.entrySet()) {
                    if (bitmapRegionDecoder != entry.getKey()) continue;
                    if (((Boolean)entry.getValue()).booleanValue()) {
                        entry.setValue((Object)false);
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }

        private void recycle() {
            DecoderPool decoderPool = this;
            synchronized (decoderPool) {
                while (!this.decoders.isEmpty()) {
                    BitmapRegionDecoder bitmapRegionDecoder = this.acquire();
                    bitmapRegionDecoder.recycle();
                    this.decoders.remove((Object)bitmapRegionDecoder);
                }
                return;
            }
        }

        private void release(BitmapRegionDecoder bitmapRegionDecoder) {
            if (this.markAsUnused(bitmapRegionDecoder)) {
                this.available.release();
            }
        }

        private int size() {
            DecoderPool decoderPool = this;
            synchronized (decoderPool) {
                int n2 = this.decoders.size();
                return n2;
            }
        }
    };
    private long fileLength = Long.MAX_VALUE;
    private final Point imageDimensions = new Point(0, 0);
    private final AtomicBoolean lazyInited = new AtomicBoolean(false);
    private Uri uri;

    @Keep
    public SkiaPooledImageRegionDecoder() {
        this(null);
    }

    public SkiaPooledImageRegionDecoder(Bitmap.Config config) {
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

    static /* synthetic */ DecoderPool access$100(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        return skiaPooledImageRegionDecoder.decoderPool;
    }

    static /* synthetic */ long access$300(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        return skiaPooledImageRegionDecoder.fileLength;
    }

    static /* synthetic */ void access$400(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder, String string) {
        skiaPooledImageRegionDecoder.debug(string);
    }

    static /* synthetic */ void access$500(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        skiaPooledImageRegionDecoder.initialiseDecoder();
    }

    private void debug(String string) {
        if (debug) {
            Log.d((String)TAG, (String)string);
        }
    }

    private int getNumCoresOldPhones() {
        try {
            int n2 = new File("/sys/devices/system/cpu/").listFiles((FileFilter)new 1CpuFilter(this)).length;
            return n2;
        }
        catch (Exception exception) {
            return 1;
        }
    }

    private int getNumberOfCores() {
        if (Build.VERSION.SDK_INT >= 17) {
            return Runtime.getRuntime().availableProcessors();
        }
        return this.getNumCoresOldPhones();
    }

    /*
     * Exception decompiling
     */
    private void initialiseDecoder() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl79 : FAKE_TRY : trying to set 1 previously set to 0
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

    private boolean isLowMemory() {
        ActivityManager activityManager = (ActivityManager)this.context.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.lowMemory;
        }
        return true;
    }

    private void lazyInit() {
        if (this.lazyInited.compareAndSet(false, true) && this.fileLength < Long.MAX_VALUE) {
            this.debug("Starting lazy init of additional decoders");
            new Thread(this){
                final /* synthetic */ SkiaPooledImageRegionDecoder this$0;
                {
                    this.this$0 = skiaPooledImageRegionDecoder;
                }

                public void run() {
                    SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder;
                    while (SkiaPooledImageRegionDecoder.access$100(this.this$0) != null && (skiaPooledImageRegionDecoder = this.this$0).allowAdditionalDecoder(DecoderPool.access$200(SkiaPooledImageRegionDecoder.access$100(skiaPooledImageRegionDecoder)), SkiaPooledImageRegionDecoder.access$300(this.this$0))) {
                        try {
                            if (SkiaPooledImageRegionDecoder.access$100(this.this$0) == null) continue;
                            long l2 = java.lang.System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder.access$400(this.this$0, "Starting decoder");
                            SkiaPooledImageRegionDecoder.access$500(this.this$0);
                            long l3 = java.lang.System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder2 = this.this$0;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Started decoder, took ");
                            stringBuilder.append(l3 - l2);
                            stringBuilder.append("ms");
                            SkiaPooledImageRegionDecoder.access$400(skiaPooledImageRegionDecoder2, stringBuilder.toString());
                        }
                        catch (Exception exception) {
                            SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder3 = this.this$0;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Failed to start decoder: ");
                            stringBuilder.append(exception.getMessage());
                            SkiaPooledImageRegionDecoder.access$400(skiaPooledImageRegionDecoder3, stringBuilder.toString());
                        }
                    }
                }
            }.start();
        }
    }

    @Keep
    public static void setDebug(boolean bl2) {
        debug = bl2;
    }

    protected boolean allowAdditionalDecoder(int n2, long l2) {
        if (n2 >= 4) {
            this.debug("No additional decoders allowed, reached hard limit (4)");
            return false;
        }
        long l3 = l2 * (long)n2;
        if (l3 > 20971520L) {
            this.debug("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        }
        if (n2 >= this.getNumberOfCores()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No additional encoders allowed, limited by CPU cores (");
            stringBuilder.append(this.getNumberOfCores());
            stringBuilder.append(")");
            this.debug(stringBuilder.toString());
            return false;
        }
        if (this.isLowMemory()) {
            this.debug("No additional encoders allowed, memory is low");
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Additional decoder allowed, current count is ");
        stringBuilder.append(n2);
        stringBuilder.append(", estimated native memory ");
        stringBuilder.append(l3 / 0x100000L);
        stringBuilder.append("Mb");
        this.debug(stringBuilder.toString());
        return true;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Bitmap decodeRegion(Rect rect, int n2) {
        BitmapRegionDecoder bitmapRegionDecoder;
        block10 : {
            block11 : {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Decode region ");
                stringBuilder.append((Object)rect);
                stringBuilder.append(" on thread ");
                stringBuilder.append(Thread.currentThread().getName());
                this.debug(stringBuilder.toString());
                if (rect.width() < this.imageDimensions.x || rect.height() < this.imageDimensions.y) {
                    this.lazyInit();
                }
                this.decoderLock.readLock().lock();
                if (this.decoderPool == null) throw new IllegalStateException("Cannot decode region after decoder has been recycled");
                bitmapRegionDecoder = this.decoderPool.acquire();
                if (bitmapRegionDecoder == null) break block10;
                {
                    catch (Throwable throwable) {
                        throw throwable;
                    }
                }
                if (bitmapRegionDecoder.isRecycled()) break block10;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = n2;
                options.inPreferredConfig = this.bitmapConfig;
                Bitmap bitmap = bitmapRegionDecoder.decodeRegion(rect, options);
                if (bitmap == null) break block11;
                if (bitmapRegionDecoder == null) return bitmap;
                this.decoderPool.release(bitmapRegionDecoder);
                return bitmap;
            }
            try {
                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
            }
            catch (Throwable throwable) {
                if (bitmapRegionDecoder == null) throw throwable;
                this.decoderPool.release(bitmapRegionDecoder);
                throw throwable;
            }
        }
        if (bitmapRegionDecoder == null) throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        try {
            this.decoderPool.release(bitmapRegionDecoder);
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        }
        finally {
            this.decoderLock.readLock().unlock();
        }
    }

    @Override
    public Point init(Context context, Uri uri) {
        this.context = context;
        this.uri = uri;
        this.initialiseDecoder();
        return this.imageDimensions;
    }

    @Override
    public boolean isReady() {
        SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = this;
        synchronized (skiaPooledImageRegionDecoder) {
            boolean bl2;
            boolean bl3 = this.decoderPool != null && !(bl2 = this.decoderPool.isEmpty());
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
        SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = this;
        synchronized (skiaPooledImageRegionDecoder) {
            this.decoderLock.writeLock().lock();
            try {
                if (this.decoderPool != null) {
                    this.decoderPool.recycle();
                    this.decoderPool = null;
                    this.context = null;
                    this.uri = null;
                }
                return;
            }
            finally {
                this.decoderLock.writeLock().unlock();
            }
        }
    }

}

