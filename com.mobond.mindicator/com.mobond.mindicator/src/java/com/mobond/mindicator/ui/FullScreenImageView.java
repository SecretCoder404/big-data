/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.PointF
 *  android.os.Bundle
 *  android.view.View
 *  androidx.appcompat.app.e
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.e;
import com.a.a.a.k;
import com.a.a.a.r;
import com.a.a.o;
import com.a.a.u;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.mobond.mindicator.ui.h;
import com.mobond.mindicator.ui.n;

public class FullScreenImageView
extends e {
    SubsamplingScaleImageView a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492895);
        this.a = (SubsamplingScaleImageView)this.findViewById(2131296862);
        new k(r.a((Context)this), new h()).a(this.getIntent().getStringExtra("url"), new k.d(){

            @Override
            public void a(k.c c2, boolean bl) {
                Bitmap bitmap = c2.a();
                if (bitmap != null) {
                    FullScreenImageView.this.a.setImage(ImageSource.bitmap(bitmap));
                    FullScreenImageView.this.a.setScaleAndCenter(0.0f, new PointF(1.0f, 1.0f));
                }
            }

            @Override
            public void onErrorResponse(u u2) {
                n.d((Context)FullScreenImageView.this, "Something went wrong");
                FullScreenImageView.this.finish();
            }
        });
    }

}

