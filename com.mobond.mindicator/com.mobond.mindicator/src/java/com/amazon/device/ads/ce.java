/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Media
 *  com.amazon.device.ads.cy
 *  java.io.BufferedInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

class ce {
    private static final String a = "ce";
    private final cy b = new cz().a(a);

    ce() {
    }

    public Bitmap a(InputStream inputStream) {
        if (inputStream != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 32768);
            bufferedInputStream.mark(32768);
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)bufferedInputStream);
            try {
                bufferedInputStream.close();
                return bitmap;
            }
            catch (IOException iOException) {
                this.b.f("IOException while trying to close the input stream.");
                return bitmap;
            }
        }
        return null;
    }

    public String a(Context context, Bitmap bitmap, String string, String string2) {
        return MediaStore.Images.Media.insertImage((ContentResolver)context.getContentResolver(), (Bitmap)bitmap, (String)string, (String)string2);
    }
}

