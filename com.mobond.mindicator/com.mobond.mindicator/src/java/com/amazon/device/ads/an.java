/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.amazon.device.ads.an$b
 *  com.amazon.device.ads.an$c
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package com.amazon.device.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.device.ads.ab;
import com.amazon.device.ads.ac;
import com.amazon.device.ads.ad;
import com.amazon.device.ads.an;
import com.amazon.device.ads.av;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bi;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.fc;
import com.amazon.device.ads.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Exception performing whole class analysis.
 */
class an
extends WebViewClient {
    protected static final HashSet<String> a;
    protected static Set<String> b;
    private static final String c = "an";
    private final fc d;
    private final cz e;
    private final cy f;
    private final Context g;
    private final HashMap<String, d> h;
    private a i;
    private final ad j;
    private final h k;
    private final bc l;
    private CopyOnWriteArrayList<String> m;

    static {
        a = new HashSet();
        a.add((Object)"tel");
        a.add((Object)"voicemail");
        a.add((Object)"sms");
        a.add((Object)"mailto");
        a.add((Object)"geo");
        a.add((Object)"google.streetview");
        b = new HashSet();
        b.add((Object)"aax-us-east.amazon-adsystem.com");
        b.add((Object)"aax-us-east.amazon-adsystem.com");
        b.add((Object)"aax-beta.integ.amazon.com");
        b.add((Object)"pda-bes.amazon.com");
        b.add((Object)"d16g-cornerstone-bes.integ.amazon.com");
    }

    public an(Context context, ad ad2, h h2, fc fc2, cz cz2, bc bc2) {
        this.m = new CopyOnWriteArrayList();
        this.g = context;
        this.h = new HashMap();
        this.j = ad2;
        this.k = h2;
        this.d = fc2;
        this.e = cz2;
        this.f = this.e.a(c);
        this.l = bc2;
        this.c();
    }

    static /* synthetic */ String b() {
        return c;
    }

    private void c() {
        this.h.put((Object)"amazonmobile", (Object)new /* Unavailable Anonymous Inner Class!! */);
        c c2 = new /* Unavailable Anonymous Inner Class!! */;
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            this.a((String)iterator.next(), (d)c2);
        }
    }

    private boolean d() {
        Iterator iterator = this.m.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Set<ac> set = bi.a().b(string);
            if (set.size() <= 0) continue;
            Iterator iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                ab ab2 = ((ac)iterator2.next()).a(this.k);
                if (this.j.b(ab2)) continue;
                bl2 = true;
                this.j.a(ab2);
            }
        }
        if (bl2) {
            ej.c(new Runnable(){

                public void run() {
                    an.this.k.k();
                }
            });
        }
        return bl2;
    }

    public void a(a a2) {
        this.i = a2;
    }

    public void a(String string, d d2) {
        this.h.put((Object)string, (Object)d2);
    }

    boolean a() {
        return bd.a(this.l, 11, 13);
    }

    public boolean a(String string) {
        Uri uri = Uri.parse((String)string);
        boolean bl2 = !b.contains((Object)uri.getHost()) || this.a();
        if (this.a(string, this.b(string))) {
            return true;
        }
        return bl2;
    }

    protected boolean a(String string, String string2) {
        if (string2 != null) {
            if (string2.equals((Object)"about") && string.equalsIgnoreCase("about:blank")) {
                return false;
            }
            if (this.h.containsKey((Object)string2)) {
                return ((d)this.h.get((Object)string2)).a(string);
            }
            this.f.c("Scheme %s unrecognized. Launching as intent.", new Object[]{string2});
            return this.d.a(string, this.g);
        }
        return false;
    }

    protected String b(String string) {
        return this.d.c(string);
    }

    public void onLoadResource(WebView webView, String string) {
        this.m.add((Object)string);
        this.f.c("Loading resource: %s", new Object[]{string});
        this.i.c(webView, string);
    }

    public void onPageFinished(WebView webView, String string) {
        this.f.c("Page Finished %s", new Object[]{string});
        if (this.d()) {
            return;
        }
        a a2 = this.i;
        if (a2 == null) {
            this.f.e("Call to onPageFinished() ignored because listener is null.");
            return;
        }
        a2.a(webView, string);
    }

    public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
        super.onPageStarted(webView, string, bitmap);
        this.i.b(webView, string);
    }

    public void onReceivedError(WebView webView, int n2, String string, String string2) {
        this.f.e("Error: %s", new Object[]{string});
        super.onReceivedError(webView, n2, string, string2);
        this.i.a(webView, n2, string, string2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String string) {
        return this.a(string);
    }

    static interface a {
        public void a(WebView var1, int var2, String var3, String var4);

        public void a(WebView var1, String var2);

        public void b(WebView var1, String var2);

        public void c(WebView var1, String var2);
    }

    static interface d {
        public boolean a(String var1);
    }

}

