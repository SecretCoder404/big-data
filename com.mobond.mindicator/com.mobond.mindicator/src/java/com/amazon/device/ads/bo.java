/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.graphics.Rect;
import com.amazon.device.ads.bw;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.e;
import com.amazon.device.ads.m;
import com.amazon.device.ads.x;

public class bo
implements bw {
    private static final String a = "bo";
    private final cy b;

    public bo() {
        this(a);
    }

    bo(cz cz2, String string) {
        this.b = cz2.a(string);
    }

    bo(String string) {
        this(new cz(), string);
    }

    @Override
    public void a(e e2) {
        this.b.d("Default ad listener called - Ad Will Expand.");
    }

    @Override
    public void a(e e2, Rect rect) {
        this.b.d("Default ad listener called - Ad Resized.");
    }

    @Override
    public void a(e e2, m m2) {
        cy cy2 = this.b;
        Object[] arrobject = new Object[]{m2.a(), m2.b()};
        cy2.c("Default ad listener called - Ad Failed to Load. Error code: %s, Error Message: %s", arrobject);
    }

    @Override
    public void a(e e2, x x2) {
        this.b.d("Default ad listener called - AdLoaded.");
    }

    @Override
    public void b(e e2) {
        this.b.d("Default ad listener called - Ad Collapsed.");
    }

    @Override
    public void c(e e2) {
        this.b.d("Default ad listener called - Ad Dismissed.");
    }

    @Override
    public void d(e e2) {
        this.b.d("Default ad listener called - Ad Expired.");
    }
}

