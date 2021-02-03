/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.PersistableBundle
 *  androidx.appcompat.app.e
 */
package com.mobond.mindicator;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.appcompat.app.e;
import com.mobond.mindicator.f;

public abstract class BaseAppCompatActivity
extends e {
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(f.a(context));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }
}

