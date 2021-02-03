/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  androidx.appcompat.app.e
 *  java.lang.Runnable
 */
package com.mobond.mindicator.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.e;
import com.mobond.mindicator.ui.ThankyouActivity;
import com.mobond.mindicator.ui.multicity.Multicity_home;

public class ThankyouActivity
extends e {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492904);
        Multicity_home.c((Context)this);
        new Handler().postDelayed(new Runnable(this){
            final /* synthetic */ ThankyouActivity a;
            {
                this.a = thankyouActivity;
            }

            public void run() {
                this.a.finish();
            }
        }, 1000L);
    }
}

