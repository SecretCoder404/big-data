/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Constructor
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import java.lang.reflect.Constructor;

public class CompatDecoderFactory<T>
implements DecoderFactory<T> {
    private final Bitmap.Config bitmapConfig;
    private final Class<? extends T> clazz;

    public CompatDecoderFactory(Class<? extends T> class_) {
        this(class_, null);
    }

    public CompatDecoderFactory(Class<? extends T> class_, Bitmap.Config config) {
        this.clazz = class_;
        this.bitmapConfig = config;
    }

    @Override
    public T make() {
        if (this.bitmapConfig == null) {
            return (T)this.clazz.newInstance();
        }
        Constructor constructor = this.clazz.getConstructor(new Class[]{Bitmap.Config.class});
        Object[] arrobject = new Object[]{this.bitmapConfig};
        return (T)constructor.newInstance(arrobject);
    }
}

