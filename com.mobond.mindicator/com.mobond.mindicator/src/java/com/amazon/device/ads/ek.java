/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.amazon.device.ads;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.em;
import com.amazon.device.ads.fd;

class ek {
    private final ej.k a;
    private final fd b;
    private String c;
    private String d;

    public ek() {
        this(new ej.k(), fd.a());
    }

    ek(ej.k k2, fd fd2) {
        this.a = k2;
        this.b = fd2;
    }

    public String a() {
        return this.c;
    }

    public void a(final Context context) {
        this.a.a(new Runnable(){

            public void run() {
                ek ek2 = ek.this;
                ek2.a(ek2.b.a(context).getSettings().getUserAgentString());
            }
        }, ej.b.a, ej.c.a);
    }

    public void a(String string) {
        if (string != null && !string.equals((Object)this.d) && !string.equals((Object)this.c)) {
            this.d = string;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(em.c());
            this.c = stringBuilder.toString();
        }
    }

}

