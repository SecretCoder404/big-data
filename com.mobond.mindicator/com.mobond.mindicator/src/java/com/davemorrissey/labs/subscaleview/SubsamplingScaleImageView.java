/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Point
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnLongClickListener
 *  android.view.ViewParent
 *  com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory
 *  com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder
 *  com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.locks.Lock
 *  java.util.concurrent.locks.ReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 */
package com.davemorrissey.labs.subscaleview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.R;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SubsamplingScaleImageView
extends View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    private static final String TAG = "SubsamplingScaleImageView";
    public static final int TILE_SIZE_AUTO = Integer.MAX_VALUE;
    private static final List<Integer> VALID_EASING_STYLES;
    private static final List<Integer> VALID_ORIENTATIONS;
    private static final List<Integer> VALID_PAN_LIMITS;
    private static final List<Integer> VALID_SCALE_TYPES;
    private static final List<Integer> VALID_ZOOM_STYLES;
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private static Bitmap.Config preferredBitmapConfig;
    private Anim anim;
    private Bitmap bitmap;
    private DecoderFactory<? extends ImageDecoder> bitmapDecoderFactory = new CompatDecoderFactory(SkiaImageDecoder.class);
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    private final ReadWriteLock decoderLock = new ReentrantReadWriteLock(true);
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration = 500;
    private float doubleTapZoomScale = 1.0f;
    private int doubleTapZoomStyle = 1;
    private final float[] dstArray = new float[8];
    private boolean eagerLoadingEnabled = true;
    private Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean imageLoadedSent;
    private boolean isPanning;
    private boolean isQuickScaling;
    private boolean isZooming;
    private Matrix matrix;
    private float maxScale = 2.0f;
    private int maxTileHeight = Integer.MAX_VALUE;
    private int maxTileWidth = Integer.MAX_VALUE;
    private int maxTouchCount;
    private float minScale = this.minScale();
    private int minimumScaleType = 1;
    private int minimumTileDpi = -1;
    private OnImageEventListener onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private int orientation = 0;
    private Rect pRegion;
    private boolean panEnabled = true;
    private int panLimit = 1;
    private Float pendingScale;
    private boolean quickScaleEnabled = true;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private PointF quickScaleVLastPoint;
    private PointF quickScaleVStart;
    private boolean readySent;
    private DecoderFactory<? extends ImageRegionDecoder> regionDecoderFactory = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    private float scale;
    private float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray = new float[8];
    private Paint tileBgPaint;
    private Map<Integer, List<Tile>> tileMap;
    private Uri uri;
    private PointF vCenterStart;
    private float vDistStart;
    private PointF vTranslate;
    private PointF vTranslateBefore;
    private PointF vTranslateStart;
    private boolean zoomEnabled = true;

    static {
        Object[] arrobject = new Integer[]{0, 90, 180, 270, -1};
        VALID_ORIENTATIONS = Arrays.asList((Object[])arrobject);
        Object[] arrobject2 = new Integer[]{1, 2, 3};
        VALID_ZOOM_STYLES = Arrays.asList((Object[])arrobject2);
        Object[] arrobject3 = new Integer[]{2, 1};
        VALID_EASING_STYLES = Arrays.asList((Object[])arrobject3);
        Object[] arrobject4 = new Integer[]{1, 2, 3};
        VALID_PAN_LIMITS = Arrays.asList((Object[])arrobject4);
        Object[] arrobject5 = new Integer[]{2, 1, 3, 4};
        VALID_SCALE_TYPES = Arrays.asList((Object[])arrobject5);
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.density = this.getResources().getDisplayMetrics().density;
        this.setMinimumDpi(160);
        this.setDoubleTapZoomDpi(160);
        this.setMinimumTileDpi(320);
        this.setGestureDetector(context);
        this.handler = new Handler(new Handler.Callback(){

            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.onLongClickListener != null) {
                    SubsamplingScaleImageView.this.maxTouchCount = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.onLongClickListener);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            int n2;
            String string;
            TypedArray typedArray = this.getContext().obtainStyledAttributes(attributeSet, R.styleable.SubsamplingScaleImageView);
            if (typedArray.hasValue(R.styleable.SubsamplingScaleImageView_assetName) && (string = typedArray.getString(R.styleable.SubsamplingScaleImageView_assetName)) != null && string.length() > 0) {
                this.setImage(ImageSource.asset(string).tilingEnabled());
            }
            if (typedArray.hasValue(R.styleable.SubsamplingScaleImageView_src) && (n2 = typedArray.getResourceId(R.styleable.SubsamplingScaleImageView_src, 0)) > 0) {
                this.setImage(ImageSource.resource(n2).tilingEnabled());
            }
            if (typedArray.hasValue(R.styleable.SubsamplingScaleImageView_panEnabled)) {
                this.setPanEnabled(typedArray.getBoolean(R.styleable.SubsamplingScaleImageView_panEnabled, true));
            }
            if (typedArray.hasValue(R.styleable.SubsamplingScaleImageView_zoomEnabled)) {
                this.setZoomEnabled(typedArray.getBoolean(R.styleable.SubsamplingScaleImageView_zoomEnabled, true));
            }
            if (typedArray.hasValue(R.styleable.SubsamplingScaleImageView_quickScaleEnabled)) {
                this.setQuickScaleEnabled(typedArray.getBoolean(R.styleable.SubsamplingScaleImageView_quickScaleEnabled, true));
            }
            if (typedArray.hasValue(R.styleable.SubsamplingScaleImageView_tileBackgroundColor)) {
                this.setTileBackgroundColor(typedArray.getColor(R.styleable.SubsamplingScaleImageView_tileBackgroundColor, Color.argb((int)0, (int)0, (int)0, (int)0)));
            }
            typedArray.recycle();
        }
        this.quickScaleThreshold = TypedValue.applyDimension((int)1, (float)20.0f, (DisplayMetrics)context.getResources().getDisplayMetrics());
    }

    static /* synthetic */ PointF access$2200(SubsamplingScaleImageView subsamplingScaleImageView) {
        return subsamplingScaleImageView.quickScaleSCenter;
    }

    static /* synthetic */ ReadWriteLock access$5600(SubsamplingScaleImageView subsamplingScaleImageView) {
        return subsamplingScaleImageView.decoderLock;
    }

    static /* synthetic */ void access$5700(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
        subsamplingScaleImageView.fileSRect(rect, rect2);
    }

    private int calculateInSampleSize(float f2) {
        if (this.minimumTileDpi > 0) {
            DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
            float f3 = (displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f;
            f2 *= (float)this.minimumTileDpi / f3;
        }
        int n2 = (int)(f2 * (float)this.sWidth());
        int n3 = (int)(f2 * (float)this.sHeight());
        if (n2 != 0 && n3 != 0) {
            int n4;
            int n5;
            int n6 = this.sHeight();
            int n7 = 1;
            if (n6 <= n3 && this.sWidth() <= n2) {
                n4 = 1;
            } else {
                int n8;
                n4 = Math.round((float)((float)this.sHeight() / (float)n3));
                if (n4 >= (n8 = Math.round((float)((float)this.sWidth() / (float)n2)))) {
                    n4 = n8;
                }
            }
            while ((n5 = n7 * 2) < n4) {
                n7 = n5;
            }
            return n7;
        }
        return 32;
    }

    private boolean checkImageLoaded() {
        boolean bl2 = this.isBaseLayerReady();
        if (!this.imageLoadedSent && bl2) {
            this.preDraw();
            this.imageLoadedSent = true;
            this.onImageLoaded();
            OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null) {
                onImageEventListener.onImageLoaded();
            }
        }
        return bl2;
    }

    private boolean checkReady() {
        boolean bl2 = this.getWidth() > 0 && this.getHeight() > 0 && this.sWidth > 0 && this.sHeight > 0 && (this.bitmap != null || this.isBaseLayerReady());
        if (!this.readySent && bl2) {
            this.preDraw();
            this.readySent = true;
            this.onReady();
            OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null) {
                onImageEventListener.onReady();
            }
        }
        return bl2;
    }

    private void createPaints() {
        if (this.bitmapPaint == null) {
            this.bitmapPaint = new Paint();
            this.bitmapPaint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if ((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            this.debugTextPaint = new Paint();
            this.debugTextPaint.setTextSize((float)this.px(12));
            this.debugTextPaint.setColor(-65281);
            this.debugTextPaint.setStyle(Paint.Style.FILL);
            this.debugLinePaint = new Paint();
            this.debugLinePaint.setColor(-65281);
            this.debugLinePaint.setStyle(Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth((float)this.px(1));
        }
    }

    private /* varargs */ void debug(String string, Object ... arrobject) {
        if (this.debug) {
            Log.d((String)TAG, (String)String.format((String)string, (Object[])arrobject));
        }
    }

    private float distance(float f2, float f3, float f4, float f5) {
        float f6 = f2 - f3;
        float f7 = f4 - f5;
        return (float)Math.sqrt((double)(f6 * f6 + f7 * f7));
    }

    private void doubleTapZoom(PointF pointF, PointF pointF2) {
        if (!this.panEnabled) {
            PointF pointF3 = this.sRequestedCenter;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = this.sRequestedCenter.y;
            } else {
                pointF.x = this.sWidth() / 2;
                pointF.y = this.sHeight() / 2;
            }
        }
        float f2 = Math.min((float)this.maxScale, (float)this.doubleTapZoomScale);
        float f3 = this.scale;
        double d2 = f3;
        double d3 = f2;
        Double.isNaN((double)d3);
        boolean bl2 = d2 <= d3 * 0.9 || f3 == this.minScale;
        if (!bl2) {
            f2 = this.minScale();
        }
        float f4 = f2;
        int n2 = this.doubleTapZoomStyle;
        if (n2 == 3) {
            this.setScaleAndCenter(f4, pointF);
        } else if (n2 != 2 && bl2 && this.panEnabled) {
            if (n2 == 1) {
                AnimationBuilder animationBuilder = new AnimationBuilder(f4, pointF, pointF2);
                animationBuilder.withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
            }
        } else {
            new AnimationBuilder(f4, pointF).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
        }
        this.invalidate();
    }

    private float ease(int n2, long l2, float f2, float f3, long l3) {
        switch (n2) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected easing type: ");
                stringBuilder.append(n2);
                throw new IllegalStateException(stringBuilder.toString());
            }
            case 2: {
                return this.easeInOutQuad(l2, f2, f3, l3);
            }
            case 1: 
        }
        return this.easeOutQuad(l2, f2, f3, l3);
    }

    private float easeInOutQuad(long l2, float f2, float f3, long l3) {
        float f4 = (float)l2 / ((float)l3 / 2.0f);
        if (f4 < 1.0f) {
            return f2 + f4 * (f4 * (f3 / 2.0f));
        }
        float f5 = f4 - 1.0f;
        return f2 + -f3 / 2.0f * (f5 * (f5 - 2.0f) - 1.0f);
    }

    private float easeOutQuad(long l2, float f2, float f3, long l3) {
        float f4 = (float)l2 / (float)l3;
        return f2 + f4 * -f3 * (f4 - 2.0f);
    }

    private void fileSRect(Rect rect, Rect rect2) {
        if (this.getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (this.getRequiredRotation() == 90) {
            rect2.set(rect.top, this.sHeight - rect.right, rect.bottom, this.sHeight - rect.left);
            return;
        }
        if (this.getRequiredRotation() == 180) {
            rect2.set(this.sWidth - rect.right, this.sHeight - rect.bottom, this.sWidth - rect.left, this.sHeight - rect.top);
            return;
        }
        rect2.set(this.sWidth - rect.bottom, rect.left, this.sWidth - rect.top, rect.right);
    }

    private void fitToBounds(boolean bl2) {
        boolean bl3;
        if (this.vTranslate == null) {
            bl3 = true;
            this.vTranslate = new PointF(0.0f, 0.0f);
        } else {
            bl3 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        }
        this.satTemp.scale = this.scale;
        this.satTemp.vTranslate.set(this.vTranslate);
        this.fitToBounds(bl2, this.satTemp);
        this.scale = this.satTemp.scale;
        this.vTranslate.set(this.satTemp.vTranslate);
        if (bl3 && this.minimumScaleType != 4) {
            this.vTranslate.set(this.vTranslateForSCenter(this.sWidth() / 2, this.sHeight() / 2, this.scale));
        }
    }

    private void fitToBounds(boolean bl2, ScaleAndTranslate scaleAndTranslate) {
        float f2;
        float f3;
        if (this.panLimit == 2 && this.isReady()) {
            bl2 = false;
        }
        PointF pointF = scaleAndTranslate.vTranslate;
        float f4 = this.limitedScale(scaleAndTranslate.scale);
        float f5 = f4 * (float)this.sWidth();
        float f6 = f4 * (float)this.sHeight();
        if (this.panLimit == 3 && this.isReady()) {
            pointF.x = Math.max((float)pointF.x, (float)((float)(this.getWidth() / 2) - f5));
            pointF.y = Math.max((float)pointF.y, (float)((float)(this.getHeight() / 2) - f6));
        } else if (bl2) {
            pointF.x = Math.max((float)pointF.x, (float)((float)this.getWidth() - f5));
            pointF.y = Math.max((float)pointF.y, (float)((float)this.getHeight() - f6));
        } else {
            pointF.x = Math.max((float)pointF.x, (float)(-f5));
            pointF.y = Math.max((float)pointF.y, (float)(-f6));
        }
        int n2 = this.getPaddingLeft();
        float f7 = 0.5f;
        float f8 = n2 <= 0 && this.getPaddingRight() <= 0 ? 0.5f : (float)this.getPaddingLeft() / (float)(this.getPaddingLeft() + this.getPaddingRight());
        if (this.getPaddingTop() > 0 || this.getPaddingBottom() > 0) {
            f7 = (float)this.getPaddingTop() / (float)(this.getPaddingTop() + this.getPaddingBottom());
        }
        if (this.panLimit == 3 && this.isReady()) {
            f3 = Math.max((int)0, (int)(this.getWidth() / 2));
            f2 = Math.max((int)0, (int)(this.getHeight() / 2));
        } else if (bl2) {
            f3 = Math.max((float)0.0f, (float)(f8 * ((float)this.getWidth() - f5)));
            f2 = Math.max((float)0.0f, (float)(f7 * ((float)this.getHeight() - f6)));
        } else {
            f3 = Math.max((int)0, (int)this.getWidth());
            f2 = Math.max((int)0, (int)this.getHeight());
        }
        pointF.x = Math.min((float)pointF.x, (float)f3);
        pointF.y = Math.min((float)pointF.y, (float)f2);
        scaleAndTranslate.scale = f4;
    }

    /*
     * Exception decompiling
     */
    private int getExifOrientation(Context var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl137 : ICONST_0 : trying to set 0 previously set to 1
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

    private Point getMaxBitmapDimensions(Canvas canvas) {
        return new Point(Math.min((int)canvas.getMaximumBitmapWidth(), (int)this.maxTileWidth), Math.min((int)canvas.getMaximumBitmapHeight(), (int)this.maxTileHeight));
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return preferredBitmapConfig;
    }

    private int getRequiredRotation() {
        int n2 = this.orientation;
        if (n2 == -1) {
            return this.sOrientation;
        }
        return n2;
    }

    private void initialiseBaseLayer(Point point) {
        SubsamplingScaleImageView subsamplingScaleImageView = this;
        synchronized (subsamplingScaleImageView) {
            Object[] arrobject = new Object[]{point.x, point.y};
            this.debug("initialiseBaseLayer maxTileDimensions=%dx%d", arrobject);
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
            this.fitToBounds(true, this.satTemp);
            this.fullImageSampleSize = this.calculateInSampleSize(this.satTemp.scale);
            if (this.fullImageSampleSize > 1) {
                this.fullImageSampleSize /= 2;
            }
            if (this.fullImageSampleSize == 1 && this.sRegion == null && this.sWidth() < point.x && this.sHeight() < point.y) {
                this.decoder.recycle();
                this.decoder = null;
                BitmapLoadTask bitmapLoadTask = new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, this.uri, false);
                bitmapLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[]{null, null, null});
            } else {
                this.initialiseTileMap(point);
                for (Tile tile : (List)this.tileMap.get((Object)this.fullImageSampleSize)) {
                    new TileLoadTask(this, this.decoder, tile).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[]{null, null, null});
                }
                this.refreshRequiredTiles(true);
            }
            return;
        }
    }

    private void initialiseTileMap(Point point) {
        Object[] arrobject = new Object[2];
        arrobject[0] = point.x;
        Integer n2 = point.y;
        int n3 = 1;
        arrobject[n3] = n2;
        this.debug("initialiseTileMap maxTileDimensions=%dx%d", arrobject);
        this.tileMap = new LinkedHashMap();
        int n4 = this.fullImageSampleSize;
        int n5 = 1;
        int n6 = 1;
        block0 : do {
            int n7 = this.sWidth() / n5;
            int n8 = this.sHeight() / n6;
            int n9 = n7 / n4;
            int n10 = n8 / n4;
            do {
                if (n3 + (n9 + n5) <= point.x) {
                    double d2 = n9;
                    double d3 = this.getWidth();
                    Double.isNaN((double)d3);
                    if (!(d2 > d3 * 1.25) || n4 >= this.fullImageSampleSize) {
                        do {
                            if (n3 + (n10 + n6) <= point.y) {
                                double d4 = n10;
                                double d5 = this.getHeight();
                                Double.isNaN((double)d5);
                                if (!(d4 > d5 * 1.25) || n4 >= this.fullImageSampleSize) {
                                    ArrayList arrayList = new ArrayList(n5 * n6);
                                    for (int i2 = 0; i2 < n5; ++i2) {
                                        for (int i3 = 0; i3 < n6; ++i3) {
                                            Tile tile = new Tile();
                                            tile.sampleSize = n4;
                                            boolean bl2 = n4 == this.fullImageSampleSize;
                                            tile.visible = bl2;
                                            int n11 = i2 * n7;
                                            int n12 = i3 * n8;
                                            int n13 = i2 == n5 - 1 ? this.sWidth() : n7 * (i2 + 1);
                                            int n14 = i3 == n6 - 1 ? this.sHeight() : n8 * (i3 + 1);
                                            tile.sRect = new Rect(n11, n12, n13, n14);
                                            tile.vRect = new Rect(0, 0, 0, 0);
                                            tile.fileSRect = new Rect(tile.sRect);
                                            arrayList.add((Object)tile);
                                        }
                                    }
                                    this.tileMap.put((Object)n4, (Object)arrayList);
                                    if (n4 == 1) {
                                        return;
                                    }
                                    n4 /= 2;
                                    n3 = 1;
                                    continue block0;
                                }
                            }
                            n8 = this.sHeight() / ++n6;
                            n10 = n8 / n4;
                            n3 = 1;
                        } while (true);
                    }
                }
                n7 = this.sWidth() / ++n5;
                n9 = n7 / n4;
                n3 = 1;
            } while (true);
            break;
        } while (true);
    }

    private boolean isBaseLayerReady() {
        Bitmap bitmap = this.bitmap;
        boolean bl2 = true;
        if (bitmap != null && !this.bitmapIsPreview) {
            return bl2;
        }
        Map<Integer, List<Tile>> map = this.tileMap;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if ((Integer)entry.getKey() != this.fullImageSampleSize) continue;
                for (Tile tile : (List)entry.getValue()) {
                    if (!tile.loading && tile.bitmap != null) continue;
                    bl2 = false;
                }
            }
            return bl2;
        }
        return false;
    }

    private PointF limitedSCenter(float f2, float f3, float f4, PointF pointF) {
        PointF pointF2 = this.vTranslateForSCenter(f2, f3, f4);
        int n2 = this.getPaddingLeft() + (this.getWidth() - this.getPaddingRight() - this.getPaddingLeft()) / 2;
        int n3 = this.getPaddingTop() + (this.getHeight() - this.getPaddingBottom() - this.getPaddingTop()) / 2;
        pointF.set(((float)n2 - pointF2.x) / f4, ((float)n3 - pointF2.y) / f4);
        return pointF;
    }

    private float limitedScale(float f2) {
        float f3 = Math.max((float)this.minScale(), (float)f2);
        return Math.min((float)this.maxScale, (float)f3);
    }

    private float minScale() {
        int n2 = this.getPaddingBottom() + this.getPaddingTop();
        int n3 = this.getPaddingLeft() + this.getPaddingRight();
        int n4 = this.minimumScaleType;
        if (n4 != 2 && n4 != 4) {
            float f2;
            if (n4 == 3 && (f2 = this.minScale) > 0.0f) {
                return f2;
            }
            return Math.min((float)((float)(this.getWidth() - n3) / (float)this.sWidth()), (float)((float)(this.getHeight() - n2) / (float)this.sHeight()));
        }
        return Math.max((float)((float)(this.getWidth() - n3) / (float)this.sWidth()), (float)((float)(this.getHeight() - n2) / (float)this.sHeight()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onImageLoaded(Bitmap bitmap, int n2, boolean bl2) {
        SubsamplingScaleImageView subsamplingScaleImageView = this;
        synchronized (subsamplingScaleImageView) {
            this.debug("onImageLoaded", new Object[0]);
            if (this.sWidth > 0 && this.sHeight > 0 && (this.sWidth != bitmap.getWidth() || this.sHeight != bitmap.getHeight())) {
                this.reset(false);
            }
            if (this.bitmap != null && !this.bitmapIsCached) {
                this.bitmap.recycle();
            }
            if (this.bitmap != null && this.bitmapIsCached && this.onImageEventListener != null) {
                this.onImageEventListener.onPreviewReleased();
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = bl2;
            this.bitmap = bitmap;
            this.sWidth = bitmap.getWidth();
            this.sHeight = bitmap.getHeight();
            this.sOrientation = n2;
            boolean bl3 = this.checkReady();
            boolean bl4 = this.checkImageLoaded();
            if (bl3 || bl4) {
                this.invalidate();
                this.requestLayout();
            }
            return;
        }
    }

    private void onPreviewLoaded(Bitmap bitmap) {
        SubsamplingScaleImageView subsamplingScaleImageView = this;
        synchronized (subsamplingScaleImageView) {
            this.debug("onPreviewLoaded", new Object[0]);
            if (this.bitmap == null && !this.imageLoadedSent) {
                this.bitmap = this.pRegion != null ? Bitmap.createBitmap((Bitmap)bitmap, (int)this.pRegion.left, (int)this.pRegion.top, (int)this.pRegion.width(), (int)this.pRegion.height()) : bitmap;
                this.bitmapIsPreview = true;
                if (this.checkReady()) {
                    this.invalidate();
                    this.requestLayout();
                }
                return;
            }
            bitmap.recycle();
            return;
        }
    }

    private void onTileLoaded() {
        SubsamplingScaleImageView subsamplingScaleImageView = this;
        synchronized (subsamplingScaleImageView) {
            this.debug("onTileLoaded", new Object[0]);
            this.checkReady();
            this.checkImageLoaded();
            if (this.isBaseLayerReady() && this.bitmap != null) {
                if (!this.bitmapIsCached) {
                    this.bitmap.recycle();
                }
                this.bitmap = null;
                if (this.onImageEventListener != null && this.bitmapIsCached) {
                    this.onImageEventListener.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            }
            this.invalidate();
            return;
        }
    }

    private void onTilesInited(ImageRegionDecoder imageRegionDecoder, int n2, int n3, int n4) {
        SubsamplingScaleImageView subsamplingScaleImageView = this;
        synchronized (subsamplingScaleImageView) {
            Object[] arrobject = new Object[]{n2, n3, this.orientation};
            this.debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", arrobject);
            if (this.sWidth > 0 && this.sHeight > 0 && (this.sWidth != n2 || this.sHeight != n3)) {
                this.reset(false);
                if (this.bitmap != null) {
                    if (!this.bitmapIsCached) {
                        this.bitmap.recycle();
                    }
                    this.bitmap = null;
                    if (this.onImageEventListener != null && this.bitmapIsCached) {
                        this.onImageEventListener.onPreviewReleased();
                    }
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                }
            }
            this.decoder = imageRegionDecoder;
            this.sWidth = n2;
            this.sHeight = n3;
            this.sOrientation = n4;
            this.checkReady();
            if (!this.checkImageLoaded() && this.maxTileWidth > 0 && this.maxTileWidth != Integer.MAX_VALUE && this.maxTileHeight > 0 && this.maxTileHeight != Integer.MAX_VALUE && this.getWidth() > 0 && this.getHeight() > 0) {
                this.initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
            }
            this.invalidate();
            this.requestLayout();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean onTouchEventInternal(MotionEvent var1_1) {
        var2_2 = var1_1.getPointerCount();
        switch (var1_1.getAction()) {
            default: {
                return false;
            }
            case 2: {
                if (this.maxTouchCount <= 0) ** GOTO lbl-1000
                if (var2_2 < 2) ** GOTO lbl59
                var37_3 = this.distance(var1_1.getX(0), var1_1.getX(1), var1_1.getY(0), var1_1.getY(1));
                var38_4 = (var1_1.getX(0) + var1_1.getX(1)) / 2.0f;
                var39_5 = (var1_1.getY(0) + var1_1.getY(1)) / 2.0f;
                if (!this.zoomEnabled || !(this.distance(this.vCenterStart.x, var38_4, this.vCenterStart.y, var39_5) > 5.0f) && !(Math.abs((float)(var37_3 - this.vDistStart)) > 5.0f) && !this.isPanning) ** GOTO lbl57
                this.isZooming = true;
                this.isPanning = true;
                var40_6 = this.scale;
                this.scale = Math.min((float)this.maxScale, (float)(var37_3 / this.vDistStart * this.scaleStart));
                if (!(this.scale <= this.minScale())) ** GOTO lbl22
                this.vDistStart = var37_3;
                this.scaleStart = this.minScale();
                this.vCenterStart.set(var38_4, var39_5);
                this.vTranslateStart.set(this.vTranslate);
                ** GOTO lbl53
lbl22: // 1 sources:
                if (!this.panEnabled) ** GOTO lbl47
                var42_7 = this.vCenterStart.x - this.vTranslateStart.x;
                var43_8 = this.vCenterStart.y - this.vTranslateStart.y;
                var44_9 = this.scale;
                var45_10 = this.scaleStart;
                var46_11 = var42_7 * (var44_9 / var45_10);
                var47_12 = var43_8 * (var44_9 / var45_10);
                var48_13 = this.vTranslate;
                var48_13.x = var38_4 - var46_11;
                var48_13.y = var39_5 - var47_12;
                var49_14 = this.sHeight();
                Double.isNaN((double)var40_6);
                Double.isNaN((double)var49_14);
                if (var49_14 * var40_6 < (double)this.getHeight() && this.scale * (float)this.sHeight() >= (float)this.getHeight()) ** GOTO lbl40
                var53_15 = this.sWidth();
                Double.isNaN((double)var40_6);
                Double.isNaN((double)var53_15);
                if (!(var40_6 * var53_15 < (double)this.getWidth()) || !(this.scale * (float)this.sWidth() >= (float)this.getWidth())) ** GOTO lbl53
lbl40: // 2 sources:
                this.fitToBounds(true);
                this.vCenterStart.set(var38_4, var39_5);
                this.vTranslateStart.set(this.vTranslate);
                this.scaleStart = this.scale;
                this.vDistStart = var37_3;
                ** GOTO lbl53
lbl47: // 1 sources:
                if (this.sRequestedCenter != null) {
                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * this.sRequestedCenter.x;
                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * this.sRequestedCenter.y;
                } else {
                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * (float)(this.sWidth() / 2);
                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * (float)(this.sHeight() / 2);
                }
lbl53: // 5 sources:
                this.fitToBounds(true);
                this.refreshRequiredTiles(this.eagerLoadingEnabled);
                var5_16 = true;
                ** GOTO lbl139
lbl57: // 1 sources:
                var5_16 = false;
                ** GOTO lbl139
lbl59: // 1 sources:
                if (!this.isQuickScaling) ** GOTO lbl109
                var16_17 = 2.0f * Math.abs((float)(this.quickScaleVStart.y - var1_1.getY())) + this.quickScaleThreshold;
                if (this.quickScaleLastDistance == -1.0f) {
                    this.quickScaleLastDistance = var16_17;
                }
                var17_18 = var1_1.getY() > this.quickScaleVLastPoint.y;
                this.quickScaleVLastPoint.set(0.0f, var1_1.getY());
                var18_19 = var16_17 / this.quickScaleLastDistance;
                var19_20 = 1.0f;
                var20_21 = 0.5f * Math.abs((float)(var19_20 - var18_19));
                if (!(var20_21 > 0.03f) && !this.quickScaleMoved) ** GOTO lbl104
                this.quickScaleMoved = true;
                if (this.quickScaleLastDistance > 0.0f) {
                    var19_20 = var17_18 ? var20_21 + var19_20 : (var19_20 -= var20_21);
                }
                var21_22 = this.scale;
                this.scale = Math.max((float)this.minScale(), (float)Math.min((float)this.maxScale, (float)(var19_20 * this.scale)));
                if (!this.panEnabled) ** GOTO lbl98
                var23_23 = this.vCenterStart.x - this.vTranslateStart.x;
                var24_24 = this.vCenterStart.y - this.vTranslateStart.y;
                var25_25 = this.scale;
                var26_26 = this.scaleStart;
                var27_27 = var23_23 * (var25_25 / var26_26);
                var28_28 = var24_24 * (var25_25 / var26_26);
                this.vTranslate.x = this.vCenterStart.x - var27_27;
                this.vTranslate.y = this.vCenterStart.y - var28_28;
                var29_29 = this.sHeight();
                Double.isNaN((double)var21_22);
                Double.isNaN((double)var29_29);
                if (var29_29 * var21_22 < (double)this.getHeight() && this.scale * (float)this.sHeight() >= (float)this.getHeight()) ** GOTO lbl91
                var33_30 = this.sWidth();
                Double.isNaN((double)var21_22);
                Double.isNaN((double)var33_30);
                if (!(var21_22 * var33_30 < (double)this.getWidth()) || !(this.scale * (float)this.sWidth() >= (float)this.getWidth())) ** GOTO lbl104
lbl91: // 2 sources:
                this.fitToBounds(true);
                this.vCenterStart.set(this.sourceToViewCoord(this.quickScaleSCenter));
                this.vTranslateStart.set(this.vTranslate);
                this.scaleStart = this.scale;
                var16_17 = 0.0f;
                ** GOTO lbl104
lbl98: // 1 sources:
                if (this.sRequestedCenter != null) {
                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * this.sRequestedCenter.x;
                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * this.sRequestedCenter.y;
                } else {
                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * (float)(this.sWidth() / 2);
                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * (float)(this.sHeight() / 2);
                }
lbl104: // 5 sources:
                this.quickScaleLastDistance = var16_17;
                this.fitToBounds(true);
                this.refreshRequiredTiles(this.eagerLoadingEnabled);
                var5_16 = true;
                ** GOTO lbl139
lbl109: // 1 sources:
                if (this.isZooming) ** GOTO lbl-1000
                var6_31 = Math.abs((float)(var1_1.getX() - this.vCenterStart.x));
                var7_32 = Math.abs((float)(var1_1.getY() - this.vCenterStart.y));
                var8_33 = 5.0f * this.density;
                if (var6_31 > var8_33 || var7_32 > var8_33 || this.isPanning) {
                    this.vTranslate.x = this.vTranslateStart.x + (var1_1.getX() - this.vCenterStart.x);
                    this.vTranslate.y = this.vTranslateStart.y + (var1_1.getY() - this.vCenterStart.y);
                    var9_34 = this.vTranslate.x;
                    var10_35 = this.vTranslate.y;
                    this.fitToBounds(true);
                    var11_36 = var9_34 != this.vTranslate.x;
                    var12_37 = var10_35 != this.vTranslate.y;
                    var13_38 = var11_36 != false && var6_31 > var7_32 && this.isPanning == false;
                    var14_39 = var12_37 != false && var7_32 > var6_31 && this.isPanning == false;
                    var15_40 = var10_35 == this.vTranslate.y && var7_32 > 3.0f * var8_33;
                    if (!(var13_38 || var14_39 || var11_36 && var12_37 && !var15_40 && !this.isPanning)) {
                        this.isPanning = true;
                    } else if (var6_31 > var8_33 || var7_32 > var8_33) {
                        this.maxTouchCount = 0;
                        this.handler.removeMessages(1);
                        this.requestDisallowInterceptTouchEvent(false);
                    }
                    if (!this.panEnabled) {
                        this.vTranslate.x = this.vTranslateStart.x;
                        this.vTranslate.y = this.vTranslateStart.y;
                        this.requestDisallowInterceptTouchEvent(false);
                    }
                    this.refreshRequiredTiles(this.eagerLoadingEnabled);
                    var5_16 = true;
                } else lbl-1000: // 3 sources:
                {
                    var5_16 = false;
                }
lbl139: // 5 sources:
                if (var5_16 == false) return false;
                this.handler.removeMessages(1);
                this.invalidate();
                return true;
            }
            case 1: 
            case 6: 
            case 262: {
                this.handler.removeMessages(1);
                if (this.isQuickScaling) {
                    this.isQuickScaling = false;
                    if (!this.quickScaleMoved) {
                        this.doubleTapZoom(this.quickScaleSCenter, this.vCenterStart);
                    }
                }
                if (this.maxTouchCount > 0 && (this.isZooming || this.isPanning)) {
                    if (this.isZooming && var2_2 == 2) {
                        this.isPanning = true;
                        this.vTranslateStart.set(this.vTranslate.x, this.vTranslate.y);
                        if (var1_1.getActionIndex() == 1) {
                            this.vCenterStart.set(var1_1.getX(0), var1_1.getY(0));
                        } else {
                            this.vCenterStart.set(var1_1.getX(1), var1_1.getY(1));
                        }
                    }
                    if (var2_2 < 3) {
                        this.isZooming = false;
                    }
                    if (var2_2 < 2) {
                        this.isPanning = false;
                        this.maxTouchCount = 0;
                    }
                    this.refreshRequiredTiles(true);
                    return true;
                }
                if (var2_2 != 1) return true;
                this.isZooming = false;
                this.isPanning = false;
                this.maxTouchCount = 0;
                return true;
            }
            case 0: 
            case 5: 
            case 261: 
        }
        this.anim = null;
        this.requestDisallowInterceptTouchEvent(true);
        this.maxTouchCount = Math.max((int)this.maxTouchCount, (int)var2_2);
        if (var2_2 < 2) {
            if (this.isQuickScaling != false) return true;
            this.vTranslateStart.set(this.vTranslate.x, this.vTranslate.y);
            this.vCenterStart.set(var1_1.getX(), var1_1.getY());
            this.handler.sendEmptyMessageDelayed(1, 600L);
            return true;
        }
        if (this.zoomEnabled) {
            var4_41 = this.distance(var1_1.getX(0), var1_1.getX(1), var1_1.getY(0), var1_1.getY(1));
            this.scaleStart = this.scale;
            this.vDistStart = var4_41;
            this.vTranslateStart.set(this.vTranslate.x, this.vTranslate.y);
            this.vCenterStart.set((var1_1.getX(0) + var1_1.getX(1)) / 2.0f, (var1_1.getY(0) + var1_1.getY(1)) / 2.0f);
        } else {
            this.maxTouchCount = 0;
        }
        this.handler.removeMessages(1);
        return true;
    }

    private void preDraw() {
        if (this.getWidth() != 0 && this.getHeight() != 0 && this.sWidth > 0) {
            Float f2;
            if (this.sHeight <= 0) {
                return;
            }
            if (this.sPendingCenter != null && (f2 = this.pendingScale) != null) {
                this.scale = f2.floatValue();
                if (this.vTranslate == null) {
                    this.vTranslate = new PointF();
                }
                this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * this.sPendingCenter.x;
                this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * this.sPendingCenter.y;
                this.sPendingCenter = null;
                this.pendingScale = null;
                this.fitToBounds(true);
                this.refreshRequiredTiles(true);
            }
            this.fitToBounds(false);
            return;
        }
    }

    private int px(int n2) {
        return (int)(this.density * (float)n2);
    }

    private void refreshRequiredTiles(boolean bl2) {
        if (this.decoder != null) {
            if (this.tileMap == null) {
                return;
            }
            int n2 = Math.min((int)this.fullImageSampleSize, (int)this.calculateInSampleSize(this.scale));
            Iterator iterator = this.tileMap.entrySet().iterator();
            while (iterator.hasNext()) {
                for (Tile tile : (List)((Map.Entry)iterator.next()).getValue()) {
                    if (tile.sampleSize < n2 || tile.sampleSize > n2 && tile.sampleSize != this.fullImageSampleSize) {
                        tile.visible = false;
                        if (tile.bitmap != null) {
                            tile.bitmap.recycle();
                            tile.bitmap = null;
                        }
                    }
                    if (tile.sampleSize == n2) {
                        if (this.tileVisible(tile)) {
                            tile.visible = true;
                            if (tile.loading || tile.bitmap != null || !bl2) continue;
                            new TileLoadTask(this, this.decoder, tile).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[]{null, null, null});
                            continue;
                        }
                        if (tile.sampleSize == this.fullImageSampleSize) continue;
                        tile.visible = false;
                        if (tile.bitmap == null) continue;
                        tile.bitmap.recycle();
                        tile.bitmap = null;
                        continue;
                    }
                    if (tile.sampleSize != this.fullImageSampleSize) continue;
                    tile.visible = true;
                }
            }
            return;
        }
    }

    private void requestDisallowInterceptTouchEvent(boolean bl2) {
        ViewParent viewParent = this.getParent();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(bl2);
        }
    }

    private void reset(boolean bl2) {
        Map<Integer, List<Tile>> map;
        block10 : {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("reset newImage=");
            stringBuilder.append(bl2);
            this.debug(stringBuilder.toString(), new Object[0]);
            this.scale = 0.0f;
            this.scaleStart = 0.0f;
            this.vTranslate = null;
            this.vTranslateStart = null;
            this.vTranslateBefore = null;
            this.pendingScale = Float.valueOf((float)0.0f);
            this.sPendingCenter = null;
            this.sRequestedCenter = null;
            this.isZooming = false;
            this.isPanning = false;
            this.isQuickScaling = false;
            this.maxTouchCount = 0;
            this.fullImageSampleSize = 0;
            this.vCenterStart = null;
            this.vDistStart = 0.0f;
            this.quickScaleLastDistance = 0.0f;
            this.quickScaleMoved = false;
            this.quickScaleSCenter = null;
            this.quickScaleVLastPoint = null;
            this.quickScaleVStart = null;
            this.anim = null;
            this.satTemp = null;
            this.matrix = null;
            this.sRect = null;
            if (bl2) {
                OnImageEventListener onImageEventListener;
                block9 : {
                    Bitmap bitmap;
                    this.uri = null;
                    this.decoderLock.writeLock().lock();
                    if (this.decoder != null) {
                        this.decoder.recycle();
                        this.decoder = null;
                    }
                    if ((bitmap = this.bitmap) == null || this.bitmapIsCached) break block9;
                    bitmap.recycle();
                }
                if (this.bitmap != null && this.bitmapIsCached && (onImageEventListener = this.onImageEventListener) != null) {
                    onImageEventListener.onPreviewReleased();
                }
                this.sWidth = 0;
                this.sHeight = 0;
                this.sOrientation = 0;
                this.sRegion = null;
                this.pRegion = null;
                this.readySent = false;
                this.imageLoadedSent = false;
                this.bitmap = null;
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
                break block10;
                finally {
                    this.decoderLock.writeLock().unlock();
                }
            }
        }
        if ((map = this.tileMap) != null) {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                for (Tile tile : (List)((Map.Entry)iterator.next()).getValue()) {
                    tile.visible = false;
                    if (tile.bitmap == null) continue;
                    tile.bitmap.recycle();
                    tile.bitmap = null;
                }
            }
            this.tileMap = null;
        }
        this.setGestureDetector(this.getContext());
    }

    private void restoreState(ImageViewState imageViewState) {
        if (imageViewState != null && imageViewState.getCenter() != null && VALID_ORIENTATIONS.contains((Object)imageViewState.getOrientation())) {
            this.orientation = imageViewState.getOrientation();
            this.pendingScale = Float.valueOf((float)imageViewState.getScale());
            this.sPendingCenter = imageViewState.getCenter();
            this.invalidate();
        }
    }

    private int sHeight() {
        int n2 = this.getRequiredRotation();
        if (n2 != 90 && n2 != 270) {
            return this.sHeight;
        }
        return this.sWidth;
    }

    private int sWidth() {
        int n2 = this.getRequiredRotation();
        if (n2 != 90 && n2 != 270) {
            return this.sWidth;
        }
        return this.sHeight;
    }

    private void sendStateChanged(float f2, PointF pointF, int n2) {
        float f3;
        OnStateChangedListener onStateChangedListener = this.onStateChangedListener;
        if (onStateChangedListener != null && (f3 = this.scale) != f2) {
            onStateChangedListener.onScaleChanged(f3, n2);
        }
        if (this.onStateChangedListener != null && !this.vTranslate.equals((Object)pointF)) {
            this.onStateChangedListener.onCenterChanged(this.getCenter(), n2);
        }
    }

    private void setGestureDetector(final Context context) {
        this.detector = new GestureDetector(context, (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(){

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (SubsamplingScaleImageView.this.zoomEnabled && SubsamplingScaleImageView.this.readySent && SubsamplingScaleImageView.this.vTranslate != null) {
                    SubsamplingScaleImageView.this.setGestureDetector(context);
                    if (SubsamplingScaleImageView.this.quickScaleEnabled) {
                        SubsamplingScaleImageView.this.vCenterStart = new PointF(motionEvent.getX(), motionEvent.getY());
                        SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                        subsamplingScaleImageView.vTranslateStart = new PointF(SubsamplingScaleImageView.access$800((SubsamplingScaleImageView)subsamplingScaleImageView).x, SubsamplingScaleImageView.access$800((SubsamplingScaleImageView)SubsamplingScaleImageView.this).y);
                        SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                        subsamplingScaleImageView2.scaleStart = subsamplingScaleImageView2.scale;
                        SubsamplingScaleImageView.this.isQuickScaling = true;
                        SubsamplingScaleImageView.this.isZooming = true;
                        SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                        SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                        subsamplingScaleImageView3.quickScaleSCenter = subsamplingScaleImageView3.viewToSourceCoord(subsamplingScaleImageView3.vCenterStart);
                        SubsamplingScaleImageView.this.quickScaleVStart = new PointF(motionEvent.getX(), motionEvent.getY());
                        SubsamplingScaleImageView subsamplingScaleImageView4 = SubsamplingScaleImageView.this;
                        subsamplingScaleImageView4.quickScaleVLastPoint = new PointF(SubsamplingScaleImageView.access$2200((SubsamplingScaleImageView)subsamplingScaleImageView4).x, SubsamplingScaleImageView.access$2200((SubsamplingScaleImageView)SubsamplingScaleImageView.this).y);
                        SubsamplingScaleImageView.this.quickScaleMoved = false;
                        return false;
                    }
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.doubleTapZoom(subsamplingScaleImageView.viewToSourceCoord(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                    return true;
                }
                return super.onDoubleTapEvent(motionEvent);
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (SubsamplingScaleImageView.this.panEnabled && SubsamplingScaleImageView.this.readySent && SubsamplingScaleImageView.this.vTranslate != null && motionEvent != null && motionEvent2 != null && (Math.abs((float)(motionEvent.getX() - motionEvent2.getX())) > 50.0f || Math.abs((float)(motionEvent.getY() - motionEvent2.getY())) > 50.0f) && (Math.abs((float)f2) > 500.0f || Math.abs((float)f3) > 500.0f) && !SubsamplingScaleImageView.this.isZooming) {
                    PointF pointF = new PointF(SubsamplingScaleImageView.access$800((SubsamplingScaleImageView)SubsamplingScaleImageView.this).x + f2 * 0.25f, SubsamplingScaleImageView.access$800((SubsamplingScaleImageView)SubsamplingScaleImageView.this).y + f3 * 0.25f);
                    float f4 = ((float)(SubsamplingScaleImageView.this.getWidth() / 2) - pointF.x) / SubsamplingScaleImageView.this.scale;
                    float f5 = ((float)(SubsamplingScaleImageView.this.getHeight() / 2) - pointF.y) / SubsamplingScaleImageView.this.scale;
                    new AnimationBuilder(new PointF(f4, f5)).withEasing(1).withPanLimited(false).withOrigin(3).start();
                    return true;
                }
                return super.onFling(motionEvent, motionEvent2, f2, f3);
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
        this.singleDetector = new GestureDetector(context, (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(){

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    private void setMatrixArray(float[] arrf, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        arrf[0] = f2;
        arrf[1] = f3;
        arrf[2] = f4;
        arrf[3] = f5;
        arrf[4] = f6;
        arrf[5] = f7;
        arrf[6] = f8;
        arrf[7] = f9;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        preferredBitmapConfig = config;
    }

    private void sourceToViewRect(Rect rect, Rect rect2) {
        rect2.set((int)this.sourceToViewX(rect.left), (int)this.sourceToViewY(rect.top), (int)this.sourceToViewX(rect.right), (int)this.sourceToViewY(rect.bottom));
    }

    private float sourceToViewX(float f2) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return f2 * this.scale + pointF.x;
    }

    private float sourceToViewY(float f2) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return f2 * this.scale + pointF.y;
    }

    private boolean tileVisible(Tile tile) {
        float f2 = this.viewToSourceX(0.0f);
        float f3 = this.viewToSourceX(this.getWidth());
        float f4 = this.viewToSourceY(0.0f);
        float f5 = this.viewToSourceY(this.getHeight());
        return !(f2 > (float)Tile.access$4100((Tile)tile).right || (float)Tile.access$4100((Tile)tile).left > f3 || f4 > (float)Tile.access$4100((Tile)tile).bottom || (float)Tile.access$4100((Tile)tile).top > f5);
    }

    private PointF vTranslateForSCenter(float f2, float f3, float f4) {
        int n2 = this.getPaddingLeft() + (this.getWidth() - this.getPaddingRight() - this.getPaddingLeft()) / 2;
        int n3 = this.getPaddingTop() + (this.getHeight() - this.getPaddingBottom() - this.getPaddingTop()) / 2;
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        }
        this.satTemp.scale = f4;
        this.satTemp.vTranslate.set((float)n2 - f2 * f4, (float)n3 - f3 * f4);
        this.fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    private float viewToSourceX(float f2) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f2) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 - pointF.y) / this.scale;
    }

    public AnimationBuilder animateCenter(PointF pointF) {
        if (!this.isReady()) {
            return null;
        }
        return new AnimationBuilder(pointF);
    }

    public AnimationBuilder animateScale(float f2) {
        if (!this.isReady()) {
            return null;
        }
        return new AnimationBuilder(f2);
    }

    public AnimationBuilder animateScaleAndCenter(float f2, PointF pointF) {
        if (!this.isReady()) {
            return null;
        }
        return new AnimationBuilder(f2, pointF);
    }

    public final int getAppliedOrientation() {
        return this.getRequiredRotation();
    }

    public final PointF getCenter() {
        int n2 = this.getWidth() / 2;
        int n3 = this.getHeight() / 2;
        return this.viewToSourceCoord(n2, n3);
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return this.minScale();
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void getPanRemaining(RectF rectF) {
        if (!this.isReady()) {
            return;
        }
        float f2 = this.scale * (float)this.sWidth();
        float f3 = this.scale * (float)this.sHeight();
        int n2 = this.panLimit;
        if (n2 == 3) {
            rectF.top = Math.max((float)0.0f, (float)(-(this.vTranslate.y - (float)(this.getHeight() / 2))));
            rectF.left = Math.max((float)0.0f, (float)(-(this.vTranslate.x - (float)(this.getWidth() / 2))));
            rectF.bottom = Math.max((float)0.0f, (float)(this.vTranslate.y - ((float)(this.getHeight() / 2) - f3)));
            rectF.right = Math.max((float)0.0f, (float)(this.vTranslate.x - ((float)(this.getWidth() / 2) - f2)));
            return;
        }
        if (n2 == 2) {
            rectF.top = Math.max((float)0.0f, (float)(-(this.vTranslate.y - (float)this.getHeight())));
            rectF.left = Math.max((float)0.0f, (float)(-(this.vTranslate.x - (float)this.getWidth())));
            rectF.bottom = Math.max((float)0.0f, (float)(f3 + this.vTranslate.y));
            rectF.right = Math.max((float)0.0f, (float)(f2 + this.vTranslate.x));
            return;
        }
        rectF.top = Math.max((float)0.0f, (float)(-this.vTranslate.y));
        rectF.left = Math.max((float)0.0f, (float)(-this.vTranslate.x));
        rectF.bottom = Math.max((float)0.0f, (float)(f3 + this.vTranslate.y - (float)this.getHeight()));
        rectF.right = Math.max((float)0.0f, (float)(f2 + this.vTranslate.x - (float)this.getWidth()));
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final ImageViewState getState() {
        if (this.vTranslate != null && this.sWidth > 0 && this.sHeight > 0) {
            return new ImageViewState(this.getScale(), this.getCenter(), this.getOrientation());
        }
        return null;
    }

    public boolean hasImage() {
        return this.uri != null || this.bitmap != null;
        {
        }
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.createPaints();
        if (this.sWidth != 0 && this.sHeight != 0 && this.getWidth() != 0) {
            int n2;
            int n3;
            if (this.getHeight() == 0) {
                return;
            }
            if (this.tileMap == null && this.decoder != null) {
                this.initialiseBaseLayer(this.getMaxBitmapDimensions(canvas));
            }
            if (!this.checkReady()) {
                return;
            }
            this.preDraw();
            Anim anim = this.anim;
            if (anim != null && anim.vFocusStart != null) {
                float f2 = this.scale;
                if (this.vTranslateBefore == null) {
                    this.vTranslateBefore = new PointF(0.0f, 0.0f);
                }
                this.vTranslateBefore.set(this.vTranslate);
                long l2 = System.currentTimeMillis() - this.anim.time;
                boolean bl2 = l2 > this.anim.duration;
                long l3 = Math.min((long)l2, (long)this.anim.duration);
                this.scale = this.ease(this.anim.easing, l3, this.anim.scaleStart, this.anim.scaleEnd - this.anim.scaleStart, this.anim.duration);
                float f3 = this.ease(this.anim.easing, l3, Anim.access$3100((Anim)this.anim).x, Anim.access$3700((Anim)this.anim).x - Anim.access$3100((Anim)this.anim).x, this.anim.duration);
                float f4 = this.ease(this.anim.easing, l3, Anim.access$3100((Anim)this.anim).y, Anim.access$3700((Anim)this.anim).y - Anim.access$3100((Anim)this.anim).y, this.anim.duration);
                PointF pointF = this.vTranslate;
                pointF.x -= this.sourceToViewX(Anim.access$3800((Anim)this.anim).x) - f3;
                PointF pointF2 = this.vTranslate;
                pointF2.y -= this.sourceToViewY(Anim.access$3800((Anim)this.anim).y) - f4;
                boolean bl3 = bl2 || this.anim.scaleStart == this.anim.scaleEnd;
                this.fitToBounds(bl3);
                this.sendStateChanged(f2, this.vTranslateBefore, this.anim.origin);
                this.refreshRequiredTiles(bl2);
                if (bl2) {
                    if (this.anim.listener != null) {
                        try {
                            this.anim.listener.onComplete();
                        }
                        catch (Exception exception) {
                            Log.w((String)TAG, (String)"Error thrown by animation listener", (Throwable)exception);
                        }
                    }
                    this.anim = null;
                }
                this.invalidate();
            }
            if (this.tileMap != null && this.isBaseLayerReady()) {
                int n4 = Math.min((int)this.fullImageSampleSize, (int)this.calculateInSampleSize(this.scale));
                Iterator iterator = this.tileMap.entrySet().iterator();
                boolean bl4 = false;
                while (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry)iterator.next();
                    if ((Integer)entry.getKey() != n4) continue;
                    for (Tile tile : (List)entry.getValue()) {
                        if (!tile.visible || !tile.loading && tile.bitmap != null) continue;
                        bl4 = true;
                    }
                }
                for (Map.Entry entry : this.tileMap.entrySet()) {
                    if ((Integer)entry.getKey() != n4 && !bl4) continue;
                    for (Tile tile : (List)entry.getValue()) {
                        this.sourceToViewRect(tile.sRect, tile.vRect);
                        if (!tile.loading && tile.bitmap != null) {
                            if (this.tileBgPaint != null) {
                                canvas.drawRect(tile.vRect, this.tileBgPaint);
                            }
                            if (this.matrix == null) {
                                this.matrix = new Matrix();
                            }
                            this.matrix.reset();
                            this.setMatrixArray(this.srcArray, 0.0f, 0.0f, tile.bitmap.getWidth(), 0.0f, tile.bitmap.getWidth(), tile.bitmap.getHeight(), 0.0f, tile.bitmap.getHeight());
                            if (this.getRequiredRotation() == 0) {
                                this.setMatrixArray(this.dstArray, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).top, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).top, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).bottom, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).bottom);
                            } else if (this.getRequiredRotation() == 90) {
                                this.setMatrixArray(this.dstArray, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).top, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).bottom, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).bottom, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).top);
                            } else if (this.getRequiredRotation() == 180) {
                                this.setMatrixArray(this.dstArray, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).bottom, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).bottom, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).top, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).top);
                            } else if (this.getRequiredRotation() == 270) {
                                this.setMatrixArray(this.dstArray, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).bottom, Tile.access$4200((Tile)tile).left, Tile.access$4200((Tile)tile).top, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).top, Tile.access$4200((Tile)tile).right, Tile.access$4200((Tile)tile).bottom);
                            }
                            this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                            canvas.drawBitmap(tile.bitmap, this.matrix, this.bitmapPaint);
                            if (this.debug) {
                                canvas.drawRect(tile.vRect, this.debugLinePaint);
                            }
                        } else if (tile.loading && this.debug) {
                            canvas.drawText("LOADING", (float)(Tile.access$4200((Tile)tile).left + this.px(5)), (float)(Tile.access$4200((Tile)tile).top + this.px(35)), this.debugTextPaint);
                        }
                        if (!tile.visible || !this.debug) continue;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ISS ");
                        stringBuilder.append(tile.sampleSize);
                        stringBuilder.append(" RECT ");
                        stringBuilder.append(Tile.access$4100((Tile)tile).top);
                        stringBuilder.append(",");
                        stringBuilder.append(Tile.access$4100((Tile)tile).left);
                        stringBuilder.append(",");
                        stringBuilder.append(Tile.access$4100((Tile)tile).bottom);
                        stringBuilder.append(",");
                        stringBuilder.append(Tile.access$4100((Tile)tile).right);
                        canvas.drawText(stringBuilder.toString(), (float)(Tile.access$4200((Tile)tile).left + this.px(5)), (float)(Tile.access$4200((Tile)tile).top + this.px(15)), this.debugTextPaint);
                    }
                }
                n2 = 35;
                n3 = 15;
            } else {
                n2 = 35;
                n3 = 15;
                Bitmap bitmap = this.bitmap;
                if (bitmap != null) {
                    float f5;
                    float f6 = this.scale;
                    if (this.bitmapIsPreview) {
                        f6 *= (float)this.sWidth / (float)bitmap.getWidth();
                        f5 = this.scale * ((float)this.sHeight / (float)this.bitmap.getHeight());
                    } else {
                        f5 = f6;
                    }
                    if (this.matrix == null) {
                        this.matrix = new Matrix();
                    }
                    this.matrix.reset();
                    this.matrix.postScale(f6, f5);
                    this.matrix.postRotate((float)this.getRequiredRotation());
                    this.matrix.postTranslate(this.vTranslate.x, this.vTranslate.y);
                    if (this.getRequiredRotation() == 180) {
                        Matrix matrix = this.matrix;
                        float f7 = this.scale;
                        matrix.postTranslate(f7 * (float)this.sWidth, f7 * (float)this.sHeight);
                    } else if (this.getRequiredRotation() == 90) {
                        this.matrix.postTranslate(this.scale * (float)this.sHeight, 0.0f);
                    } else if (this.getRequiredRotation() == 270) {
                        this.matrix.postTranslate(0.0f, this.scale * (float)this.sWidth);
                    }
                    if (this.tileBgPaint != null) {
                        if (this.sRect == null) {
                            this.sRect = new RectF();
                        }
                        RectF rectF = this.sRect;
                        int n5 = this.bitmapIsPreview ? this.bitmap.getWidth() : this.sWidth;
                        float f8 = n5;
                        int n6 = this.bitmapIsPreview ? this.bitmap.getHeight() : this.sHeight;
                        rectF.set(0.0f, 0.0f, f8, (float)n6);
                        this.matrix.mapRect(this.sRect);
                        canvas.drawRect(this.sRect, this.tileBgPaint);
                    }
                    canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
                }
            }
            if (this.debug) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Scale: ");
                Locale locale = Locale.ENGLISH;
                Object[] arrobject = new Object[]{Float.valueOf((float)this.scale)};
                stringBuilder.append(String.format((Locale)locale, (String)"%.2f", (Object[])arrobject));
                stringBuilder.append(" (");
                Locale locale2 = Locale.ENGLISH;
                Object[] arrobject2 = new Object[]{Float.valueOf((float)this.minScale())};
                stringBuilder.append(String.format((Locale)locale2, (String)"%.2f", (Object[])arrobject2));
                stringBuilder.append(" - ");
                Locale locale3 = Locale.ENGLISH;
                Object[] arrobject3 = new Object[]{Float.valueOf((float)this.maxScale)};
                stringBuilder.append(String.format((Locale)locale3, (String)"%.2f", (Object[])arrobject3));
                stringBuilder.append(")");
                canvas.drawText(stringBuilder.toString(), (float)this.px(5), (float)this.px(n3), this.debugTextPaint);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Translate: ");
                Locale locale4 = Locale.ENGLISH;
                Object[] arrobject4 = new Object[]{Float.valueOf((float)this.vTranslate.x)};
                stringBuilder2.append(String.format((Locale)locale4, (String)"%.2f", (Object[])arrobject4));
                stringBuilder2.append(":");
                Locale locale5 = Locale.ENGLISH;
                Object[] arrobject5 = new Object[]{Float.valueOf((float)this.vTranslate.y)};
                stringBuilder2.append(String.format((Locale)locale5, (String)"%.2f", (Object[])arrobject5));
                canvas.drawText(stringBuilder2.toString(), (float)this.px(5), (float)this.px(30), this.debugTextPaint);
                PointF pointF = this.getCenter();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Source center: ");
                Locale locale6 = Locale.ENGLISH;
                Object[] arrobject6 = new Object[]{Float.valueOf((float)pointF.x)};
                stringBuilder3.append(String.format((Locale)locale6, (String)"%.2f", (Object[])arrobject6));
                stringBuilder3.append(":");
                Locale locale7 = Locale.ENGLISH;
                Object[] arrobject7 = new Object[]{Float.valueOf((float)pointF.y)};
                stringBuilder3.append(String.format((Locale)locale7, (String)"%.2f", (Object[])arrobject7));
                canvas.drawText(stringBuilder3.toString(), (float)this.px(5), (float)this.px(45), this.debugTextPaint);
                Anim anim2 = this.anim;
                if (anim2 != null) {
                    PointF pointF3 = this.sourceToViewCoord(anim2.sCenterStart);
                    PointF pointF4 = this.sourceToViewCoord(this.anim.sCenterEndRequested);
                    PointF pointF5 = this.sourceToViewCoord(this.anim.sCenterEnd);
                    canvas.drawCircle(pointF3.x, pointF3.y, (float)this.px(10), this.debugLinePaint);
                    this.debugLinePaint.setColor(-65536);
                    canvas.drawCircle(pointF4.x, pointF4.y, (float)this.px(20), this.debugLinePaint);
                    this.debugLinePaint.setColor(-16776961);
                    canvas.drawCircle(pointF5.x, pointF5.y, (float)this.px(25), this.debugLinePaint);
                    this.debugLinePaint.setColor(-16711681);
                    canvas.drawCircle((float)(this.getWidth() / 2), (float)(this.getHeight() / 2), (float)this.px(30), this.debugLinePaint);
                }
                if (this.vCenterStart != null) {
                    this.debugLinePaint.setColor(-65536);
                    canvas.drawCircle(this.vCenterStart.x, this.vCenterStart.y, (float)this.px(20), this.debugLinePaint);
                }
                if (this.quickScaleSCenter != null) {
                    this.debugLinePaint.setColor(-16776961);
                    canvas.drawCircle(this.sourceToViewX(this.quickScaleSCenter.x), this.sourceToViewY(this.quickScaleSCenter.y), (float)this.px(n2), this.debugLinePaint);
                }
                if (this.quickScaleVStart != null && this.isQuickScaling) {
                    this.debugLinePaint.setColor(-16711681);
                    canvas.drawCircle(this.quickScaleVStart.x, this.quickScaleVStart.y, (float)this.px(30), this.debugLinePaint);
                }
                this.debugLinePaint.setColor(-65281);
            }
            return;
        }
    }

    protected void onImageLoaded() {
    }

    protected void onMeasure(int n2, int n3) {
        int n4 = View.MeasureSpec.getMode((int)n2);
        int n5 = View.MeasureSpec.getMode((int)n3);
        int n6 = View.MeasureSpec.getSize((int)n2);
        int n7 = View.MeasureSpec.getSize((int)n3);
        boolean bl2 = true;
        boolean bl3 = n4 != 1073741824;
        if (n5 == 1073741824) {
            bl2 = false;
        }
        if (this.sWidth > 0 && this.sHeight > 0) {
            if (bl3 && bl2) {
                n6 = this.sWidth();
                n7 = this.sHeight();
            } else if (bl2) {
                double d2 = this.sHeight();
                double d3 = this.sWidth();
                Double.isNaN((double)d2);
                Double.isNaN((double)d3);
                double d4 = d2 / d3;
                double d5 = n6;
                Double.isNaN((double)d5);
                n7 = (int)(d4 * d5);
            } else if (bl3) {
                double d6 = this.sWidth();
                double d7 = this.sHeight();
                Double.isNaN((double)d6);
                Double.isNaN((double)d7);
                double d8 = d6 / d7;
                double d9 = n7;
                Double.isNaN((double)d9);
                n6 = (int)(d8 * d9);
            }
        }
        this.setMeasuredDimension(Math.max((int)n6, (int)this.getSuggestedMinimumWidth()), Math.max((int)n7, (int)this.getSuggestedMinimumHeight()));
    }

    protected void onReady() {
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        Object[] arrobject = new Object[]{n4, n5, n2, n3};
        this.debug("onSizeChanged %dx%d -> %dx%d", arrobject);
        PointF pointF = this.getCenter();
        if (this.readySent && pointF != null) {
            this.anim = null;
            this.pendingScale = Float.valueOf((float)this.scale);
            this.sPendingCenter = pointF;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        Anim anim = this.anim;
        boolean bl2 = true;
        if (anim != null && !anim.interruptible) {
            this.requestDisallowInterceptTouchEvent(bl2);
            return bl2;
        }
        Anim anim2 = this.anim;
        if (anim2 != null && anim2.listener != null) {
            try {
                this.anim.listener.onInterruptedByUser();
            }
            catch (Exception exception) {
                Log.w((String)TAG, (String)"Error thrown by animation listener", (Throwable)exception);
            }
        }
        this.anim = null;
        if (this.vTranslate == null) {
            GestureDetector gestureDetector2 = this.singleDetector;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
            return bl2;
        }
        if (!this.isQuickScaling && ((gestureDetector = this.detector) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.isZooming = false;
            this.isPanning = false;
            this.maxTouchCount = 0;
            return bl2;
        }
        if (this.vTranslateStart == null) {
            this.vTranslateStart = new PointF(0.0f, 0.0f);
        }
        if (this.vTranslateBefore == null) {
            this.vTranslateBefore = new PointF(0.0f, 0.0f);
        }
        if (this.vCenterStart == null) {
            this.vCenterStart = new PointF(0.0f, 0.0f);
        }
        float f2 = this.scale;
        this.vTranslateBefore.set(this.vTranslate);
        boolean bl3 = this.onTouchEventInternal(motionEvent);
        this.sendStateChanged(f2, this.vTranslateBefore, 2);
        if (!bl3) {
            if (super.onTouchEvent(motionEvent)) {
                return bl2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void recycle() {
        this.reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = Float.valueOf((float)this.limitedScale(0.0f));
        this.sPendingCenter = this.isReady() ? new PointF((float)(this.sWidth() / 2), (float)(this.sHeight() / 2)) : new PointF(0.0f, 0.0f);
        this.invalidate();
    }

    public final void setBitmapDecoderClass(Class<? extends ImageDecoder> class_) {
        if (class_ != null) {
            this.bitmapDecoderFactory = new CompatDecoderFactory(class_);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(DecoderFactory<? extends ImageDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.bitmapDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setDebug(boolean bl2) {
        this.debug = bl2;
    }

    public final void setDoubleTapZoomDpi(int n2) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.setDoubleTapZoomScale((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f / (float)n2);
    }

    public final void setDoubleTapZoomDuration(int n2) {
        this.doubleTapZoomDuration = Math.max((int)0, (int)n2);
    }

    public final void setDoubleTapZoomScale(float f2) {
        this.doubleTapZoomScale = f2;
    }

    public final void setDoubleTapZoomStyle(int n2) {
        if (VALID_ZOOM_STYLES.contains((Object)n2)) {
            this.doubleTapZoomStyle = n2;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid zoom style: ");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setEagerLoadingEnabled(boolean bl2) {
        this.eagerLoadingEnabled = bl2;
    }

    public void setExecutor(Executor executor) {
        if (executor != null) {
            this.executor = executor;
            return;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public final void setImage(ImageSource imageSource) {
        this.setImage(imageSource, null, null);
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2) {
        this.setImage(imageSource, imageSource2, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void setImage(ImageSource imageSource, ImageSource imageSource2, ImageViewState imageViewState) {
        if (imageSource == null) throw new NullPointerException("imageSource must not be null");
        this.reset(true);
        if (imageViewState != null) {
            this.restoreState(imageViewState);
        }
        if (imageSource2 != null) {
            if (imageSource.getBitmap() != null) throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            if (imageSource.getSWidth() <= 0 || imageSource.getSHeight() <= 0) throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            this.sWidth = imageSource.getSWidth();
            this.sHeight = imageSource.getSHeight();
            this.pRegion = imageSource2.getSRegion();
            if (imageSource2.getBitmap() != null) {
                this.bitmapIsCached = imageSource2.isCached();
                this.onPreviewLoaded(imageSource2.getBitmap());
            } else {
                Uri uri;
                Uri uri2 = imageSource2.getUri();
                if (uri2 == null && imageSource2.getResource() != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("android.resource://");
                    stringBuilder.append(this.getContext().getPackageName());
                    stringBuilder.append("/");
                    stringBuilder.append((Object)imageSource2.getResource());
                    uri = Uri.parse((String)stringBuilder.toString());
                } else {
                    uri = uri2;
                }
                BitmapLoadTask bitmapLoadTask = new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, uri, true);
                bitmapLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[]{null, null, null});
            }
        }
        if (imageSource.getBitmap() != null && imageSource.getSRegion() != null) {
            this.onImageLoaded(Bitmap.createBitmap((Bitmap)imageSource.getBitmap(), (int)imageSource.getSRegion().left, (int)imageSource.getSRegion().top, (int)imageSource.getSRegion().width(), (int)imageSource.getSRegion().height()), 0, false);
            return;
        }
        if (imageSource.getBitmap() != null) {
            this.onImageLoaded(imageSource.getBitmap(), 0, imageSource.isCached());
            return;
        }
        this.sRegion = imageSource.getSRegion();
        this.uri = imageSource.getUri();
        if (this.uri == null && imageSource.getResource() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.resource://");
            stringBuilder.append(this.getContext().getPackageName());
            stringBuilder.append("/");
            stringBuilder.append((Object)imageSource.getResource());
            this.uri = Uri.parse((String)stringBuilder.toString());
        }
        if (!imageSource.getTile() && this.sRegion == null) {
            BitmapLoadTask bitmapLoadTask = new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, this.uri, false);
            bitmapLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[]{null, null, null});
            return;
        }
        new TilesInitTask(this, this.getContext(), this.regionDecoderFactory, this.uri).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[]{null, null, null});
    }

    public final void setImage(ImageSource imageSource, ImageViewState imageViewState) {
        this.setImage(imageSource, null, imageViewState);
    }

    public final void setMaxScale(float f2) {
        this.maxScale = f2;
    }

    public void setMaxTileSize(int n2) {
        this.maxTileWidth = n2;
        this.maxTileHeight = n2;
    }

    public void setMaxTileSize(int n2, int n3) {
        this.maxTileWidth = n2;
        this.maxTileHeight = n3;
    }

    public final void setMaximumDpi(int n2) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.setMinScale((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f / (float)n2);
    }

    public final void setMinScale(float f2) {
        this.minScale = f2;
    }

    public final void setMinimumDpi(int n2) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.setMaxScale((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f / (float)n2);
    }

    public final void setMinimumScaleType(int n2) {
        if (VALID_SCALE_TYPES.contains((Object)n2)) {
            this.minimumScaleType = n2;
            if (this.isReady()) {
                this.fitToBounds(true);
                this.invalidate();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid scale type: ");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setMinimumTileDpi(int n2) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.minimumTileDpi = (int)Math.min((float)((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f), (float)n2);
        if (this.isReady()) {
            this.reset(false);
            this.invalidate();
        }
    }

    public void setOnImageEventListener(OnImageEventListener onImageEventListener) {
        this.onImageEventListener = onImageEventListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onLongClickListener = onLongClickListener;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.onStateChangedListener = onStateChangedListener;
    }

    public final void setOrientation(int n2) {
        if (VALID_ORIENTATIONS.contains((Object)n2)) {
            this.orientation = n2;
            this.reset(false);
            this.invalidate();
            this.requestLayout();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid orientation: ");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void setPanEnabled(boolean bl2) {
        PointF pointF;
        this.panEnabled = bl2;
        if (!bl2 && (pointF = this.vTranslate) != null) {
            pointF.x = (float)(this.getWidth() / 2) - this.scale * (float)(this.sWidth() / 2);
            this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * (float)(this.sHeight() / 2);
            if (this.isReady()) {
                this.refreshRequiredTiles(true);
                this.invalidate();
            }
        }
    }

    public final void setPanLimit(int n2) {
        if (VALID_PAN_LIMITS.contains((Object)n2)) {
            this.panLimit = n2;
            if (this.isReady()) {
                this.fitToBounds(true);
                this.invalidate();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid pan limit: ");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void setQuickScaleEnabled(boolean bl2) {
        this.quickScaleEnabled = bl2;
    }

    public final void setRegionDecoderClass(Class<? extends ImageRegionDecoder> class_) {
        if (class_ != null) {
            this.regionDecoderFactory = new CompatDecoderFactory(class_);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.regionDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setScaleAndCenter(float f2, PointF pointF) {
        this.anim = null;
        this.pendingScale = Float.valueOf((float)f2);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        this.invalidate();
    }

    public final void setTileBackgroundColor(int n2) {
        if (Color.alpha((int)n2) == 0) {
            this.tileBgPaint = null;
        } else {
            this.tileBgPaint = new Paint();
            this.tileBgPaint.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(n2);
        }
        this.invalidate();
    }

    public final void setZoomEnabled(boolean bl2) {
        this.zoomEnabled = bl2;
    }

    public final PointF sourceToViewCoord(float f2, float f3) {
        return this.sourceToViewCoord(f2, f3, new PointF());
    }

    public final PointF sourceToViewCoord(float f2, float f3, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(this.sourceToViewX(f2), this.sourceToViewY(f3));
        return pointF;
    }

    public final PointF sourceToViewCoord(PointF pointF) {
        return this.sourceToViewCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF sourceToViewCoord(PointF pointF, PointF pointF2) {
        return this.sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public void viewToFileRect(Rect rect, Rect rect2) {
        if (this.vTranslate != null) {
            if (!this.readySent) {
                return;
            }
            rect2.set((int)this.viewToSourceX(rect.left), (int)this.viewToSourceY(rect.top), (int)this.viewToSourceX(rect.right), (int)this.viewToSourceY(rect.bottom));
            this.fileSRect(rect2, rect2);
            rect2.set(Math.max((int)0, (int)rect2.left), Math.max((int)0, (int)rect2.top), Math.min((int)this.sWidth, (int)rect2.right), Math.min((int)this.sHeight, (int)rect2.bottom));
            Rect rect3 = this.sRegion;
            if (rect3 != null) {
                rect2.offset(rect3.left, this.sRegion.top);
            }
            return;
        }
    }

    public final PointF viewToSourceCoord(float f2, float f3) {
        return this.viewToSourceCoord(f2, f3, new PointF());
    }

    public final PointF viewToSourceCoord(float f2, float f3, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(this.viewToSourceX(f2), this.viewToSourceY(f3));
        return pointF;
    }

    public final PointF viewToSourceCoord(PointF pointF) {
        return this.viewToSourceCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF viewToSourceCoord(PointF pointF, PointF pointF2) {
        return this.viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    public void visibleFileRect(Rect rect) {
        if (this.vTranslate != null) {
            if (!this.readySent) {
                return;
            }
            rect.set(0, 0, this.getWidth(), this.getHeight());
            this.viewToFileRect(rect, rect);
            return;
        }
    }

    private static class Anim {
        private long duration = 500L;
        private int easing = 2;
        private boolean interruptible = true;
        private OnAnimationEventListener listener;
        private int origin = 1;
        private PointF sCenterEnd;
        private PointF sCenterEndRequested;
        private PointF sCenterStart;
        private float scaleEnd;
        private float scaleStart;
        private long time = System.currentTimeMillis();
        private PointF vFocusEnd;
        private PointF vFocusStart;

        private Anim() {
        }

        static /* synthetic */ PointF access$3700(Anim anim) {
            return anim.vFocusEnd;
        }
    }

    public final class AnimationBuilder {
        private long duration = 500L;
        private int easing = 2;
        private boolean interruptible = true;
        private OnAnimationEventListener listener;
        private int origin = 1;
        private boolean panLimited = true;
        private final PointF targetSCenter;
        private final float targetScale;
        private final PointF vFocus;

        private AnimationBuilder(float f2) {
            this.targetScale = f2;
            this.targetSCenter = SubsamplingScaleImageView.this.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(float f2, PointF pointF) {
            this.targetScale = f2;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f2, PointF pointF, PointF pointF2) {
            this.targetScale = f2;
            this.targetSCenter = pointF;
            this.vFocus = pointF2;
        }

        private AnimationBuilder(PointF pointF) {
            this.targetScale = SubsamplingScaleImageView.this.scale;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder withOrigin(int n2) {
            this.origin = n2;
            return this;
        }

        private AnimationBuilder withPanLimited(boolean bl2) {
            this.panLimited = bl2;
            return this;
        }

        public void start() {
            if (SubsamplingScaleImageView.this.anim != null && SubsamplingScaleImageView.this.anim.listener != null) {
                try {
                    SubsamplingScaleImageView.this.anim.listener.onInterruptedByNewAnim();
                }
                catch (Exception exception) {
                    Log.w((String)TAG, (String)"Error thrown by animation listener", (Throwable)exception);
                }
            }
            int n2 = SubsamplingScaleImageView.this.getPaddingLeft() + (SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight() - SubsamplingScaleImageView.this.getPaddingLeft()) / 2;
            int n3 = SubsamplingScaleImageView.this.getPaddingTop() + (SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom() - SubsamplingScaleImageView.this.getPaddingTop()) / 2;
            float f2 = SubsamplingScaleImageView.this.limitedScale(this.targetScale);
            PointF pointF = this.panLimited ? SubsamplingScaleImageView.this.limitedSCenter(this.targetSCenter.x, this.targetSCenter.y, f2, new PointF()) : this.targetSCenter;
            SubsamplingScaleImageView.this.anim = new Anim();
            SubsamplingScaleImageView.this.anim.scaleStart = SubsamplingScaleImageView.this.scale;
            SubsamplingScaleImageView.this.anim.scaleEnd = f2;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.sCenterEndRequested = pointF;
            SubsamplingScaleImageView.this.anim.sCenterStart = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.anim.sCenterEnd = pointF;
            SubsamplingScaleImageView.this.anim.vFocusStart = SubsamplingScaleImageView.this.sourceToViewCoord(pointF);
            SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF((float)n2, (float)n3);
            SubsamplingScaleImageView.this.anim.duration = this.duration;
            SubsamplingScaleImageView.this.anim.interruptible = this.interruptible;
            SubsamplingScaleImageView.this.anim.easing = this.easing;
            SubsamplingScaleImageView.this.anim.origin = this.origin;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.listener = this.listener;
            PointF pointF2 = this.vFocus;
            if (pointF2 != null) {
                float f3 = pointF2.x - f2 * Anim.access$4400((Anim)SubsamplingScaleImageView.access$6300((SubsamplingScaleImageView)SubsamplingScaleImageView.this)).x;
                float f4 = this.vFocus.y - f2 * Anim.access$4400((Anim)SubsamplingScaleImageView.access$6300((SubsamplingScaleImageView)SubsamplingScaleImageView.this)).y;
                ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(f2, new PointF(f3, f4));
                SubsamplingScaleImageView.this.fitToBounds(true, scaleAndTranslate);
                SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF(this.vFocus.x + (ScaleAndTranslate.access$4800((ScaleAndTranslate)scaleAndTranslate).x - f3), this.vFocus.y + (ScaleAndTranslate.access$4800((ScaleAndTranslate)scaleAndTranslate).y - f4));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public AnimationBuilder withDuration(long l2) {
            this.duration = l2;
            return this;
        }

        public AnimationBuilder withEasing(int n2) {
            if (VALID_EASING_STYLES.contains((Object)n2)) {
                this.easing = n2;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown easing type: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public AnimationBuilder withInterruptible(boolean bl2) {
            this.interruptible = bl2;
            return this;
        }

        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener onAnimationEventListener) {
            this.listener = onAnimationEventListener;
            return this;
        }
    }

    private static class BitmapLoadTask
    extends AsyncTask<Void, Void, Integer> {
        private Bitmap bitmap;
        private final WeakReference<Context> contextRef;
        private final WeakReference<DecoderFactory<? extends ImageDecoder>> decoderFactoryRef;
        private Exception exception;
        private final boolean preview;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        BitmapLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageDecoder> decoderFactory, Uri uri, boolean bl2) {
            this.viewRef = new WeakReference((Object)subsamplingScaleImageView);
            this.contextRef = new WeakReference((Object)context);
            this.decoderFactoryRef = new WeakReference(decoderFactory);
            this.source = uri;
            this.preview = bl2;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        protected /* varargs */ Integer doInBackground(Void ... arrvoid) {
            String string = this.source.toString();
            Context context = (Context)this.contextRef.get();
            DecoderFactory decoderFactory = (DecoderFactory)this.decoderFactoryRef.get();
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            if (context == null) return null;
            if (decoderFactory == null) return null;
            if (subsamplingScaleImageView == null) return null;
            try {
                subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new Object[0]);
                this.bitmap = ((ImageDecoder)decoderFactory.make()).decode(context, this.source);
                return subsamplingScaleImageView.getExifOrientation(context, string);
            }
            catch (OutOfMemoryError outOfMemoryError) {
                this.exception = new RuntimeException((Throwable)outOfMemoryError);
                return null;
            }
            catch (Exception exception) {
                this.exception = exception;
            }
            return null;
        }

        protected void onPostExecute(Integer n2) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.bitmap;
                if (bitmap != null && n2 != null) {
                    if (this.preview) {
                        subsamplingScaleImageView.onPreviewLoaded(bitmap);
                        return;
                    }
                    subsamplingScaleImageView.onImageLoaded(bitmap, n2, false);
                    return;
                }
                if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    if (this.preview) {
                        subsamplingScaleImageView.onImageEventListener.onPreviewLoadError(this.exception);
                        return;
                    }
                    subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }
    }

    public static interface OnAnimationEventListener {
        public void onComplete();

        public void onInterruptedByNewAnim();

        public void onInterruptedByUser();
    }

    public static interface OnImageEventListener {
        public void onImageLoadError(Exception var1);

        public void onImageLoaded();

        public void onPreviewLoadError(Exception var1);

        public void onPreviewReleased();

        public void onReady();

        public void onTileLoadError(Exception var1);
    }

    public static interface OnStateChangedListener {
        public void onCenterChanged(PointF var1, int var2);

        public void onScaleChanged(float var1, int var2);
    }

    private static class ScaleAndTranslate {
        private float scale;
        private final PointF vTranslate;

        private ScaleAndTranslate(float f2, PointF pointF) {
            this.scale = f2;
            this.vTranslate = pointF;
        }
    }

    private static class Tile {
        private Bitmap bitmap;
        private Rect fileSRect;
        private boolean loading;
        private Rect sRect;
        private int sampleSize;
        private Rect vRect;
        private boolean visible;

        private Tile() {
        }

        static /* synthetic */ Rect access$5000(Tile tile) {
            return tile.fileSRect;
        }
    }

    private static class TileLoadTask
    extends AsyncTask<Void, Void, Bitmap> {
        private final WeakReference<ImageRegionDecoder> decoderRef;
        private Exception exception;
        private final WeakReference<Tile> tileRef;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        TileLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile) {
            this.viewRef = new WeakReference((Object)subsamplingScaleImageView);
            this.decoderRef = new WeakReference((Object)imageRegionDecoder);
            this.tileRef = new WeakReference((Object)tile);
            tile.loading = true;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        protected /* varargs */ Bitmap doInBackground(Void ... arrvoid) {
            block9 : {
                subsamplingScaleImageView = (SubsamplingScaleImageView)this.viewRef.get();
                imageRegionDecoder = (ImageRegionDecoder)this.decoderRef.get();
                tile = (Tile)this.tileRef.get();
                if (imageRegionDecoder == null || tile == null || subsamplingScaleImageView == null || !imageRegionDecoder.isReady() || !Tile.access$400(tile)) ** GOTO lbl27
                arrobject = new Object[]{Tile.access$4100(tile), Tile.access$4300(tile)};
                SubsamplingScaleImageView.access$5100(subsamplingScaleImageView, "TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", arrobject);
                SubsamplingScaleImageView.access$5600(subsamplingScaleImageView).readLock().lock();
                if (!imageRegionDecoder.isReady()) break block9;
                SubsamplingScaleImageView.access$5700(subsamplingScaleImageView, Tile.access$4100(tile), Tile.access$5000(tile));
                if (SubsamplingScaleImageView.access$5300(subsamplingScaleImageView) != null) {
                    Tile.access$5000(tile).offset(SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).left, SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).top);
                }
                bitmap = imageRegionDecoder.decodeRegion(Tile.access$5000(tile), Tile.access$4300(tile));
                {
                    catch (Throwable throwable) {
                        SubsamplingScaleImageView.access$5600(subsamplingScaleImageView).readLock().unlock();
                        throw throwable;
                    }
                }
                SubsamplingScaleImageView.access$5600(subsamplingScaleImageView).readLock().unlock();
                return bitmap;
            }
            Tile.access$4002(tile, false);
            try {
                SubsamplingScaleImageView.access$5600(subsamplingScaleImageView).readLock().unlock();
                return null;
lbl27: // 1 sources:
                if (tile == null) return null;
                Tile.access$4002(tile, false);
                return null;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                this.exception = new RuntimeException((Throwable)outOfMemoryError);
                return null;
            }
            catch (Exception exception) {
                this.exception = exception;
            }
            return null;
        }

        protected void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            Tile tile = (Tile)this.tileRef.get();
            if (subsamplingScaleImageView != null && tile != null) {
                if (bitmap != null) {
                    tile.bitmap = bitmap;
                    tile.loading = false;
                    subsamplingScaleImageView.onTileLoaded();
                    return;
                }
                if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onTileLoadError(this.exception);
                }
            }
        }
    }

    private static class TilesInitTask
    extends AsyncTask<Void, Void, int[]> {
        private final WeakReference<Context> contextRef;
        private ImageRegionDecoder decoder;
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> decoderFactoryRef;
        private Exception exception;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        TilesInitTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
            this.viewRef = new WeakReference((Object)subsamplingScaleImageView);
            this.contextRef = new WeakReference((Object)context);
            this.decoderFactoryRef = new WeakReference(decoderFactory);
            this.source = uri;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        protected /* varargs */ int[] doInBackground(Void ... arrvoid) {
            String string = this.source.toString();
            Context context = (Context)this.contextRef.get();
            DecoderFactory decoderFactory = (DecoderFactory)this.decoderFactoryRef.get();
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            if (context == null) return null;
            if (decoderFactory == null) return null;
            if (subsamplingScaleImageView == null) return null;
            try {
                subsamplingScaleImageView.debug("TilesInitTask.doInBackground", new Object[0]);
                this.decoder = (ImageRegionDecoder)decoderFactory.make();
                Point point = this.decoder.init(context, this.source);
                int n2 = point.x;
                int n3 = point.y;
                int n4 = subsamplingScaleImageView.getExifOrientation(context, string);
                if (subsamplingScaleImageView.sRegion == null) return new int[]{n2, n3, n4};
                SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).left = Math.max((int)0, (int)SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).left);
                SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).top = Math.max((int)0, (int)SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).top);
                SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).right = Math.min((int)n2, (int)SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).right);
                SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).bottom = Math.min((int)n3, (int)SubsamplingScaleImageView.access$5300((SubsamplingScaleImageView)subsamplingScaleImageView).bottom);
                n2 = subsamplingScaleImageView.sRegion.width();
                n3 = subsamplingScaleImageView.sRegion.height();
                return new int[]{n2, n3, n4};
            }
            catch (Exception exception) {
                this.exception = exception;
            }
            return null;
        }

        protected void onPostExecute(int[] arrn) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            if (subsamplingScaleImageView != null) {
                ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null && arrn != null && arrn.length == 3) {
                    subsamplingScaleImageView.onTilesInited(imageRegionDecoder, arrn[0], arrn[1], arrn[2]);
                    return;
                }
                if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }
    }

}

