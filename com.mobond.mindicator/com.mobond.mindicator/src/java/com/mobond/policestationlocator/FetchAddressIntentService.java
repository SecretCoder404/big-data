/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Address
 *  android.location.Geocoder
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 *  android.text.TextUtils
 *  com.google.android.gms.maps.model.LatLng
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 */
package com.mobond.policestationlocator;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FetchAddressIntentService
extends IntentService {
    protected ResultReceiver a;
    private double b;
    private double c;

    public FetchAddressIntentService() {
        super("FetchAddressIS");
    }

    private void a(int n2, String string) {
        Bundle bundle = new Bundle();
        bundle.putString("com.mobond.mindicator.RESULT_DATA_KEY", string);
        bundle.putDouble("lat", this.b);
        bundle.putDouble("lng", this.c);
        this.a.send(n2, bundle);
    }

    protected void onHandleIntent(Intent intent) {
        List list;
        this.a = (ResultReceiver)intent.getParcelableExtra("com.mobond.mindicator.RECEIVER");
        if (this.a == null) {
            return;
        }
        LatLng latLng = (LatLng)intent.getParcelableExtra("com.mobond.mindicator.LOCATION_DATA_EXTRA");
        if (latLng == null) {
            this.a(1, "Enter Incidence Location");
            return;
        }
        Geocoder geocoder = new Geocoder((Context)this, Locale.getDefault());
        list = null;
        try {
            this.b = latLng.a;
            this.c = latLng.b;
            list = geocoder.getFromLocation(this.b, this.c, 1);
        }
        catch (IOException | IllegalArgumentException throwable) {}
        if (list != null && list.size() != 0) {
            Address address = (Address)list.get(0);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 <= address.getMaxAddressLineIndex(); ++i2) {
                arrayList.add((Object)address.getAddressLine(i2));
            }
            this.a(0, TextUtils.join((CharSequence)", ", (Iterable)arrayList));
            return;
        }
        this.a(1, "Enter Incidence Location");
    }
}

