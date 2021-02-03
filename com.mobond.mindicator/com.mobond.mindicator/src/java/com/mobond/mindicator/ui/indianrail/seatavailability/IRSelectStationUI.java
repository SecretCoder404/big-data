/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.view.View
 *  android.view.Window
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.LinearLayout
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.indianrail.seatavailability;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.indianrail.seatavailability.IRSelectStationUI;
import com.mobond.mindicator.ui.l;
import java.util.Vector;

public class IRSelectStationUI
extends l {
    String[] A;
    SharedPreferences B;
    String C;

    @Override
    public void a() {
    }

    @Override
    public void a(View view, String string, int n2) {
        Intent intent = new Intent();
        intent.putExtra("source_stn", this.getIntent().getStringExtra("source_stn"));
        if (this.getIntent().getStringExtra("selected_stn").equals((Object)"source_stn")) {
            intent.putExtra("source_stn", string);
            intent.putExtra("destination_stn", this.getIntent().getStringExtra("destination_stn"));
        } else {
            intent.putExtra("source_stn", this.getIntent().getStringExtra("source_stn"));
            intent.putExtra("destination_stn", string);
        }
        this.setResult(-1, intent);
        View view2 = this.getCurrentFocus();
        if (view2 != null) {
            ((InputMethodManager)this.getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        }
        this.finish();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void onCreate(Bundle var1_1) {
        block7 : {
            this.a("ca-app-pub-5449278086868932/4604590046", "167101606757479_1239840526150243", null, null, 2);
            this.d = true;
            super.onCreate(var1_1);
            this.B = this.getSharedPreferences("m-indicator", 0);
            this.C = this.B.getString("city", "mumbai");
            if (!a.b((Activity)this).D()) ** GOTO lbl39
            try {
                block8 : {
                    var3_2 = (Vector)com.mobond.mindicator.ui.indianrail.a.a.b((Context)this).clone();
                    var3_2.remove(0);
                    var3_2.add(0, (Object)"\u092a\u093e\u0902\u0921\u093f\u091a\u0947\u0930\u0940 [PDY]");
                    var3_2.add(0, (Object)"\u0928\u093e\u0938\u093f\u0915 [NK]");
                    var3_2.add(0, (Object)"\u092a\u091f\u0928\u093e, \u092c\u093f\u0939\u093e\u0930 [PNBE]");
                    var3_2.add(0, (Object)"\u0907\u0932\u093e\u0939\u093e\u092c\u093e\u0926 \u091c\u0902\u0915\u094d\u0936\u0928 [ALD]");
                    var3_2.add(0, (Object)"\u0932\u0916\u0928\u090a \u091c\u0902\u0915\u094d\u0936\u0928 [LJN]");
                    var3_2.add(0, (Object)"\u0928\u0908 \u0926\u093f\u0932\u094d\u0932\u0940 [NDLS]");
                    var3_2.add(0, (Object)"\u092c\u0902\u0917\u0932\u094c\u0930 \u0915\u0948\u0928\u094d\u091f [BNC]");
                    var3_2.add(0, (Object)"\u091a\u0947\u0928\u094d\u0928\u0908 \u0938\u0947\u0902\u091f\u094d\u0930\u0932 [MAS]");
                    var3_2.add(0, (Object)"\u0905\u0939\u092e\u0926\u093e\u092c\u093e\u0926 \u091c\u0902\u0915\u094d\u0936\u0928 [ADI]");
                    var3_2.add(0, (Object)"\u0938\u0942\u0930\u0924 [ST]");
                    var3_2.add(0, (Object)"\u092a\u0941\u0923\u0947 \u091c\u0902\u0915\u094d\u0936\u0928 [PUNE]");
                    var3_2.add(0, (Object)"\u0917\u094b\u0935\u093e, \u092e\u0921\u0917\u093e\u0902\u0935 [MAO]");
                    var3_2.add(0, (Object)"\u092e\u0941\u0902\u092c\u0908 [CSMT]");
                    var5_3 = (Vector)com.mobond.mindicator.ui.indianrail.a.a.c((Context)this).clone();
                    var5_3.remove(0);
                    var5_3.add(0, (Object)"Pondicherry [PDY]");
                    var5_3.add(0, (Object)"Nashik [NK]");
                    var5_3.add(0, (Object)"Patna, Bihar [PNBE]");
                    var5_3.add(0, (Object)"Allahabad Junction [ALD]");
                    var5_3.add(0, (Object)"Lucknow Junction [LJN]");
                    var5_3.add(0, (Object)"New Delhi [NDLS]");
                    var5_3.add(0, (Object)"Banglore Cantt. [BNC]");
                    var5_3.add(0, (Object)"Chennai Central [MAS]");
                    var5_3.add(0, (Object)"Ahmedabad [ADI]");
                    var5_3.add(0, (Object)"Surat [ST]");
                    var5_3.add(0, (Object)"Pune Jn [PUNE]");
                    var5_3.add(0, (Object)"Goa, Madgaon [MAO]");
                    var5_3.add(0, (Object)"Mumbai [CSMT]");
                    break block8;
lbl39: // 1 sources:
                    var3_2 = (Vector)com.mobond.mindicator.ui.indianrail.a.a.b((Context)this).clone();
                    var3_2.remove(0);
                    var3_2.add(0, (Object)"Pondicherry [PDY]");
                    var3_2.add(0, (Object)"Nashik [NK]");
                    var3_2.add(0, (Object)"Patna, Bihar [PNBE]");
                    var3_2.add(0, (Object)"Allahabad Junction [ALD]");
                    var3_2.add(0, (Object)"Lucknow Junction [LJN]");
                    var3_2.add(0, (Object)"New Delhi [NDLS]");
                    var3_2.add(0, (Object)"Banglore Cantt. [BNC]");
                    var3_2.add(0, (Object)"Chennai Central [MAS]");
                    var3_2.add(0, (Object)"Ahmedabad [ADI]");
                    var3_2.add(0, (Object)"Surat [ST]");
                    var3_2.add(0, (Object)"Pune Jn [PUNE]");
                    var3_2.add(0, (Object)"Goa, Madgaon [MAO]");
                    var3_2.add(0, (Object)"Mumbai [CSMT]");
                    var5_3 = null;
                }
                if (!this.getIntent().hasExtra("history")) break block7;
                var11_4 = this.getIntent().getExtras().getString("history").split("#");
            }
            catch (Exception var2_10) {
                var2_10.printStackTrace();
                return;
            }
            for (var12_5 = var11_4.length - 1; var12_5 >= 0; --var12_5) {
                var13_6 = var11_4[var12_5];
                if (var13_6.contains((CharSequence)"[CSMT]") || var13_6.contains((CharSequence)"[PUNE]") || var13_6.contains((CharSequence)"[MAO]")) continue;
                var3_2.add(0, (Object)var13_6);
            }
        }
        this.A = new String[var3_2.size()];
        var3_2.toArray((Object[])this.A);
        var7_7 = null;
        if (var5_3 != null) {
            var7_7 = new String[var5_3.size()];
            var5_3.toArray(var7_7);
        }
        if (b.d((Context)this)) {
            this.a(this.A);
        } else {
            this.a(this.A, (String[])var7_7);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            var10_8 = this.getWindow();
            var10_8.addFlags(Integer.MIN_VALUE);
            var10_8.clearFlags(67108864);
        }
        this.b.setBackgroundColor(this.getResources().getColor(2131099880));
        this.a(this.getResources().getColor(2131099879));
        var9_9 = this.getIntent().getExtras().getString("title");
        this.a(var9_9);
        this.b(var9_9);
        this.c();
    }

    protected void onStart() {
        super.onStart();
        this.findViewById(2131297274).performClick();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final /* synthetic */ IRSelectStationUI a;
            {
                this.a = iRSelectStationUI;
            }

            public void run() {
                ((InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)this.a.c, 1);
            }
        }, 100L);
    }
}

