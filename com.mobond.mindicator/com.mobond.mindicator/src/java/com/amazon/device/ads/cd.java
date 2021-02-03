/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.ads.cy
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient$Info
 *  com.google.android.gms.common.g
 *  com.google.android.gms.common.h
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.cc;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import java.io.IOException;

class cd {
    private static final String a = "cd";
    private final cy b = new cz().a(a);

    cd() {
    }

    public cc.a a() {
        AdvertisingIdClient.Info info;
        Context context = cx.a().k();
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo((Context)context);
        }
        catch (h h2) {
            this.b.c("Retrieving the Google Play Services Advertising Identifier caused a GooglePlayServicesRepairableException.");
            return new cc.a();
        }
        catch (g g2) {
            this.b.c("Retrieving the Google Play Services Advertising Identifier caused a GooglePlayServicesNotAvailableException.");
            return cc.a.a();
        }
        catch (IOException iOException) {
            this.b.f("Retrieving the Google Play Services Advertising Identifier caused an IOException.");
            return new cc.a();
        }
        catch (IllegalStateException illegalStateException) {
            cy cy2 = this.b;
            Object[] arrobject = new Object[]{illegalStateException.getMessage()};
            cy2.e("The Google Play Services Advertising Identifier could not be retrieved: %s", arrobject);
            return new cc.a();
        }
        this.b.c("The Google Play Services Advertising Identifier was successfully retrieved.");
        String string = info.getId();
        boolean bl2 = info.isLimitAdTrackingEnabled();
        return new cc.a().a(string).a(bl2);
    }
}

