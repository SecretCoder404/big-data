/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.core.app.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package com.mobond.mindicator.ui.safety;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.n;
import java.util.Arrays;

public class SendSafetyMessageActivity
extends Activity {
    Activity a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = this;
        n.c((Context)this.a, "Women safety is currently unavailable!\nWe're working to fix it");
        this.finish();
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 108) {
            int n3 = arrn.length;
            boolean bl = true;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4 = arrn[i2];
                bl = bl && n4 == 0;
            }
            if (bl) {
                n.c((Context)this, "Women safety is currently unavailable!\nWe're working to fix it");
                return;
            }
            int n5 = arrstring.length;
            boolean bl2 = true;
            for (int i3 = 0; i3 < n5; ++i3) {
                String string = arrstring[i3];
                bl2 = bl2 && androidx.core.app.a.a((Activity)this, (String)string);
            }
            if (!bl2) {
                a.a(this).b(Arrays.toString((Object[])arrstring), true);
            }
        }
    }
}

