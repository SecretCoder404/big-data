/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.ad;
import com.amazon.device.ads.an;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.fc;
import com.amazon.device.ads.h;

class ao {
    private final cz a;
    private final fc b;
    private final bc c;

    public ao(fc fc2, cz cz2, bc bc2) {
        this.b = fc2;
        this.a = cz2;
        this.c = bc2;
    }

    public an a(Context context, ad ad2, h h2) {
        an an2 = new an(context, ad2, h2, this.b, this.a, this.c);
        return an2;
    }
}

