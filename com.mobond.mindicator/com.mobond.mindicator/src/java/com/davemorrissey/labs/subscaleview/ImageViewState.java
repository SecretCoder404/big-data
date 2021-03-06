/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  java.io.Serializable
 *  java.lang.Object
 */
package com.davemorrissey.labs.subscaleview;

import android.graphics.PointF;
import java.io.Serializable;

public class ImageViewState
implements Serializable {
    private final float centerX;
    private final float centerY;
    private final int orientation;
    private final float scale;

    public ImageViewState(float f2, PointF pointF, int n2) {
        this.scale = f2;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = n2;
    }

    public PointF getCenter() {
        return new PointF(this.centerX, this.centerY);
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getScale() {
        return this.scale;
    }
}

