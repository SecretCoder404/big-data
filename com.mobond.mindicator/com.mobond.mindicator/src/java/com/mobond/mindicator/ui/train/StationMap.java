/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.hardware.Sensor
 *  android.hardware.SensorManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.widget.ImageView
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.train;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.mobond.mindicator.ui.FeedbackUI;
import com.mobond.mindicator.ui.i;
import com.mobond.mindicator.ui.train.PinchImageView;
import com.mobond.mindicator.ui.train.StationMap;
import com.mobond.mindicator.ui.train.a.a;
import com.mulo.b.c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StationMap
extends i
implements com.mulo.b.a {
    PinchImageView a;
    boolean b = false;
    boolean c = false;
    private String d;
    private a e;
    private ImageView f;

    public static int a(BitmapFactory.Options options, int n2, int n3) {
        int n4 = options.outHeight;
        int n5 = options.outWidth;
        int n6 = 1;
        if (n4 > n3 || n5 > n2) {
            int n7 = n4 / 2;
            int n8 = n5 / 2;
            while (n7 / n6 >= n3 && n8 / n6 >= n2) {
                n6 *= 2;
            }
        }
        return n6;
    }

    static /* synthetic */ ImageView a(StationMap stationMap) {
        return stationMap.f;
    }

    private void b() {
        Animation animation = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771990);
        this.b = true;
        this.c = true;
        animation.setAnimationListener(new Animation.AnimationListener(this){
            final /* synthetic */ StationMap a;
            {
                this.a = stationMap;
            }

            public void onAnimationEnd(Animation animation) {
                this.a.c = false;
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.f.startAnimation(animation);
    }

    static /* synthetic */ void b(StationMap stationMap) {
        stationMap.b();
    }

    private void c() {
        this.e = new a((Context)this);
        a.a a2 = new a.a(this){
            final /* synthetic */ StationMap a;
            private float b;
            {
                this.a = stationMap;
            }

            public void a(float f2) {
                android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(-this.b, -f2, 1, 0.5f, 1, 0.5f);
                this.b = f2;
                rotateAnimation.setDuration(500L);
                rotateAnimation.setRepeatCount(0);
                rotateAnimation.setFillAfter(true);
                if (!this.a.c) {
                    StationMap.a(this.a).startAnimation((Animation)rotateAnimation);
                }
                if (!this.a.b) {
                    StationMap.b(this.a);
                }
            }
        };
        this.e.a(a2);
    }

    public Bitmap a(byte[] arrby, int n2, int n3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream((InputStream)new ByteArrayInputStream(arrby), null, (BitmapFactory.Options)options);
            options.inSampleSize = StationMap.a(options, n2, n3);
            options.inJustDecodeBounds = false;
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new ByteArrayInputStream(arrby), null, (BitmapFactory.Options)options);
            return bitmap;
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final /* synthetic */ StationMap a;
            {
                this.a = stationMap;
            }

            public void run() {
                com.google.android.material.snackbar.Snackbar snackbar = com.google.android.material.snackbar.Snackbar.a((View)this.a.findViewById(2131296554), (CharSequence)android.text.Html.fromHtml((String)"<font color=\"#ffffff\">Coming Soon...</font>"), (int)-1);
                snackbar.b().setBackgroundColor(androidx.core.content.a.c((Context)this.a, (int)2131100243));
                snackbar.c();
            }
        }, 500L);
    }

    @Override
    public void a(byte[] arrby, byte[] arrby2, Object object) {
        Bitmap bitmap;
        try {
            bitmap = com.mobond.mindicator.a.a(this).y() ? this.a(arrby, 420, 420) : BitmapFactory.decodeStream((InputStream)new ByteArrayInputStream(arrby));
        }
        catch (OutOfMemoryError outOfMemoryError) {
            outOfMemoryError.printStackTrace();
            com.mobond.mindicator.a.a(this).b(true);
            bitmap = this.a(arrby, 420, 420);
        }
        this.a.setImageBitmap(bitmap);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493081);
        this.d = this.getIntent().getStringExtra("Station Map");
        this.a = (PinchImageView)this.findViewById(2131297434);
        this.f = (ImageView)this.findViewById(2131296975);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("map_");
        stringBuilder.append(this.d.replace((CharSequence)" ", (CharSequence)"_").toLowerCase());
        String string = stringBuilder.toString();
        Resources resources = this.getResources();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("com.mobond.mindicator:drawable/");
        stringBuilder2.append(string);
        int n2 = resources.getIdentifier(stringBuilder2.toString(), null, null);
        if (Build.VERSION.SDK_INT >= 21 && n2 != 0) {
            Animation animation = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771990);
            this.f.startAnimation(animation);
            this.a.setImageResource(n2);
        } else if (c.a((Context)this)) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("http://cdn.mobond.com/map/");
            stringBuilder3.append(string);
            stringBuilder3.append(".png");
            c.a(stringBuilder3.toString(), null, null, this, null, this, (Context)this, "Loading Map...");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
                final /* synthetic */ StationMap a;
                {
                    this.a = stationMap;
                }

                public void run() {
                    com.google.android.material.snackbar.Snackbar snackbar = com.google.android.material.snackbar.Snackbar.a((View)this.a.findViewById(2131296554), (CharSequence)android.text.Html.fromHtml((String)"<font color=\"#ffffff\">Connect to the Internet and try again...</font>"), (int)-1);
                    snackbar.b().setBackgroundColor(androidx.core.content.a.c((Context)this.a, (int)2131100243));
                    snackbar.c();
                }
            }, 500L);
        }
        SensorManager sensorManager = (SensorManager)this.getSystemService("sensor");
        if (sensorManager != null) {
            if (sensorManager.getDefaultSensor(2) != null) {
                this.c();
                return;
            }
            this.f.setVisibility(8);
        }
    }

    public void onFeedbackClicked(View view) {
        Intent intent = new Intent(view.getContext(), FeedbackUI.class);
        intent.putExtra("feedbacktype", FeedbackUI.e);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("App Version: v17.0.186 Eagle\nApp Build: A:T:20210102\nPhone Model: ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append("\nSDK: ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append("\nManufacturer: ");
        stringBuilder.append(Build.MANUFACTURER);
        stringBuilder.append("\nStation: ");
        stringBuilder.append(this.d);
        intent.putExtra("info", stringBuilder.toString());
        this.startActivityForResult(intent, 0);
    }

    protected void onPause() {
        super.onPause();
        a a2 = this.e;
        if (a2 != null) {
            a2.b();
        }
    }

    protected void onResume() {
        super.onResume();
        a a2 = this.e;
        if (a2 != null) {
            a2.a();
        }
    }

    protected void onStart() {
        super.onStart();
        if (this.e != null) {
            Log.d((String)"CompassActivity", (String)"start compass");
            this.e.a();
        }
    }

    protected void onStop() {
        super.onStop();
        if (this.e != null) {
            Log.d((String)"CompassActivity", (String)"stop compass");
            this.e.b();
        }
    }
}

