/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  androidx.b.e
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 */
package com.mobond.mindicator.ui;

import android.graphics.Bitmap;
import androidx.b.e;
import com.a.a.a.k;

public class h
extends e<String, Bitmap>
implements k.b {
    public h() {
        this(h.a());
    }

    public h(int n2) {
        super(n2);
    }

    public static int a() {
        return (int)(Runtime.getRuntime().maxMemory() / 1024L) / 8;
    }

    @Override
    public Bitmap a(String string) {
        return (Bitmap)this.a((Object)string);
    }

    @Override
    public void a(String string, Bitmap bitmap) {
        this.a((Object)string, (Object)bitmap);
    }

    protected int b(String string, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
    }
}

