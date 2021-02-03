/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.amazon.device.ads;

import com.amazon.device.ads.au;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.h;

class au
implements dt {
    private static final String a = "au";
    private final cy b;

    public au() {
        this(new cz());
    }

    au(cz cz2) {
        this.b = cz2.a(a);
    }

    @Override
    public void a(ds ds2, h h2) {
        this.b.d(ds2.a().toString());
        if (1.a[ds2.a().ordinal()] != 1) {
            return;
        }
        this.a(h2, ds2);
    }

    public void a(h h2, ds ds2) {
        String string = ds2.a("VIEWABLE_PARAMS");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("viewableBridge.viewabilityChange('");
        stringBuilder.append(string);
        stringBuilder.append("');");
        h2.a(stringBuilder.toString());
    }
}

