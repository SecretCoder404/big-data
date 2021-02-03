/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  com.amazon.device.ads.cy
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URISyntaxException
 *  java.net.URLEncoder
 *  java.nio.charset.IllegalCharsetNameException
 *  java.util.Locale
 */
package com.amazon.device.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.ez;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;

class fb {
    private static final String a = "fb";
    private static final cy b = new cz().a(a);

    fb() {
    }

    public static final String a(String string) {
        if (string == null) {
            return null;
        }
        try {
            String string2 = URLEncoder.encode((String)string, (String)"UTF-8").replace((CharSequence)"+", (CharSequence)"%20").replace((CharSequence)"*", (CharSequence)"%2A").replace((CharSequence)"%7E", (CharSequence)"~");
            return string2;
        }
        catch (IllegalCharsetNameException illegalCharsetNameException) {
            b.c("getURLEncodedString threw: %s", new Object[]{illegalCharsetNameException});
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            b.c("getURLEncodedString threw: %s", new Object[]{unsupportedEncodingException});
            return string;
        }
    }

    public static final void a(final String string, final boolean bl2) {
        ej.a(new Runnable(){

            public void run() {
                ez ez2 = new ez.d().a();
                ez2.d(true);
                ez2.d(string);
                ez2.f(bl2);
                try {
                    ez2.c();
                }
                catch (ez.c c2) {}
            }
        });
    }

    public static boolean a(String string, Context context) {
        if (string == null || string.equals((Object)"")) {
            string = "about:blank";
        }
        cy cy2 = b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Launch Intent: ");
        stringBuilder.append(string);
        cy2.d(stringBuilder.toString());
        Intent intent = new Intent();
        if (string.startsWith("intent:")) {
            try {
                intent = Intent.parseUri((String)string, (int)1);
            }
            catch (URISyntaxException uRISyntaxException) {
                return false;
            }
        } else {
            intent.setData(Uri.parse((String)string));
        }
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            String string2 = intent.getAction();
            cy cy3 = b;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not handle ");
            String string3 = string2.startsWith("market://") ? "market" : "intent";
            stringBuilder2.append(string3);
            stringBuilder2.append(" action: ");
            stringBuilder2.append(string2);
            cy3.e(stringBuilder2.toString());
            return false;
        }
    }

    public static final String b(String string) {
        String string2 = Uri.parse((String)string).getScheme();
        if (string2 != null) {
            string2 = string2.toLowerCase(Locale.US);
        }
        return string2;
    }

}

