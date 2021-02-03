/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.webkit.WebView
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.g
 *  com.amazon.device.ads.j
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.et;
import com.amazon.device.ads.ey;
import com.amazon.device.ads.g;
import com.amazon.device.ads.j;
import org.json.JSONException;
import org.json.JSONObject;

class er {
    private static final String a = "er";
    private float b;
    private final j c;
    private final cy d;
    private View e;
    private ey f;

    public er(j j2) {
        this(j2, new cz(), new ey(j2));
    }

    er(j j2, cz cz2, ey ey2) {
        this.c = j2;
        this.d = cz2.a(a);
        if (this.c != null) {
            this.f = ey2;
            return;
        }
        throw new IllegalArgumentException("AdController is null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject a(float f2, boolean bl2, View view) {
        JSONObject jSONObject = new JSONObject();
        int[] arrn = new int[2];
        try {
            jSONObject.put("viewablePercentage", (double)f2);
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            if (bl2) {
                this.e.getLocationOnScreen(arrn);
            }
            jSONObject.put("x", arrn[0]);
            jSONObject.put("y", arrn[1]);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            cy cy2 = this.d;
            Object[] arrobject = new Object[]{jSONException.getMessage()};
            cy2.d("JSON Error occured %s", arrobject);
            return null;
        }
    }

    private boolean b() {
        View view = this.c.al();
        if (view == null) {
            return false;
        }
        return view.hasWindowFocus();
    }

    public et a() {
        float f2;
        Rect rect = new Rect();
        this.e = this.c.a().f();
        View view = this.e;
        this.b = view == null ? 0.0f : (float)(view.getWidth() * this.e.getHeight());
        if ((double)this.b == 0.0) {
            this.d.e("AdView width and height not set");
            return null;
        }
        boolean bl2 = this.e.getGlobalVisibleRect(rect);
        boolean bl3 = this.e.isShown();
        boolean bl4 = this.b();
        boolean bl5 = bd.b((View)this.c.a());
        if (bl5) {
            this.d.b(cy.a.e, "This ad view is transparent therefore it will not be considered viewable. Please ensure the ad view is completely opaque.", new Object[0]);
        }
        cy cy2 = this.d;
        Object[] arrobject = new Object[]{bl2, bl3, bl4, bl5};
        cy2.c("IsAdVisible: %s, IsAdShown: %s, windowHasFocus: %s, IsAdTransparent: %s", arrobject);
        boolean bl6 = bl2 && bl3 && bl4 && !bl5;
        if (bl6) {
            if (this.c.j()) {
                f2 = 100.0f;
            } else {
                long l2 = System.currentTimeMillis();
                f2 = this.f.a(this.e, rect);
                long l3 = System.currentTimeMillis();
                cy cy3 = this.d;
                Object[] arrobject2 = new Object[]{l3 - l2};
                cy3.c("Total computation time: %d", arrobject2);
            }
        } else {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            bl6 = false;
        }
        return new et(bl6, this.a(f2, bl6, this.e));
    }
}

