/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.FrameLayout
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.amazon.device.ads.an;
import com.amazon.device.ads.bq;
import com.amazon.device.ads.dc;
import com.amazon.device.ads.dm;
import com.amazon.device.ads.dp;
import com.amazon.device.ads.eo;
import com.amazon.device.ads.ep;
import com.amazon.device.ads.f;

@SuppressLint(value={"ViewConstructor"})
class g
extends FrameLayout
implements bq {
    private eo a;
    private final dc b;
    private boolean c = false;
    private String d;
    private String e;
    private boolean f;
    private dm g;
    private boolean h = true;

    public g(Context context, f f2) {
        this(context, f2, new ep(), null);
    }

    g(Context context, f f2, ep ep2, dc dc2) {
        super(context);
        this.a = ep2.a((ViewGroup)this).a();
        this.setContentDescription((CharSequence)"adContainerObject");
        if (dc2 == null) {
            this.b = new dc((ViewGroup)this, f2);
            return;
        }
        this.b = dc2;
    }

    public void a() {
        this.a.a(this.c);
        this.a.b();
    }

    public void a(int n2) {
        this.a.a(n2);
    }

    public void a(int n2, int n3, int n4) {
        this.a.a(n2, n3, n4);
    }

    public void a(View.OnKeyListener onKeyListener) {
        this.a.a(onKeyListener);
    }

    public void a(an an2) {
        this.a.a(an2);
    }

    public void a(Object object, boolean bl2, String string) {
        this.a.a(object, bl2, string);
    }

    public void a(String string, String string2, boolean bl2, dm dm2) {
        this.d = string;
        this.e = string2;
        this.f = bl2;
        this.g = dm2;
        this.a.a(string, string2, "text/html", "UTF-8", null, bl2, dm2);
    }

    public void a(String string, boolean bl2) {
        eo eo2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:");
        stringBuilder.append(string);
        eo2.a(stringBuilder.toString(), bl2, null);
    }

    public void a(boolean bl2) {
        this.c = bl2;
        eo eo2 = this.a;
        if (eo2 != null) {
            eo2.a(this.c);
        }
    }

    public void a(boolean bl2, dp dp2) {
        this.b.a(bl2, dp2);
    }

    public void a(int[] arrn) {
        this.a.a(arrn);
    }

    public boolean a(View view) {
        return this.a.b(view);
    }

    @Override
    public void b() {
        this.a.c();
    }

    public void b(boolean bl2) {
        this.b.a(bl2);
    }

    public int c() {
        return this.a.e();
    }

    public int d() {
        return this.a.f();
    }

    public boolean e() {
        return this.a.a();
    }

    public WebView f() {
        return this.a.d();
    }

    public void g() {
        this.a.i();
    }

    public void h() {
        this.a(this.d, this.e, this.f, this.g);
    }

    public void i() {
        this.a.g();
    }

    public boolean j() {
        return this.a.h();
    }

    public void k() {
        this.b.a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true ^ this.h;
    }

}

