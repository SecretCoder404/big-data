/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URI
 *  java.net.URISyntaxException
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.fb;
import java.net.URI;
import java.net.URISyntaxException;

class fc {
    private final a a = new a();

    fc() {
    }

    public void a(String string, boolean bl2) {
        this.a.a(string, bl2);
    }

    public boolean a(String string) {
        try {
            new URI(string);
            return true;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (URISyntaxException uRISyntaxException) {
            return false;
        }
    }

    public boolean a(String string, Context context) {
        return this.a.a(string, context);
    }

    public String b(String string) {
        return this.a.a(string);
    }

    public String c(String string) {
        return this.a.b(string);
    }

    private static class a {
        private a() {
        }

        String a(String string) {
            return fb.a(string);
        }

        void a(String string, boolean bl2) {
            fb.a(string, bl2);
        }

        boolean a(String string, Context context) {
            return fb.a(string, context);
        }

        String b(String string) {
            return fb.b(string);
        }
    }

}

