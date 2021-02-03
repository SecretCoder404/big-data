/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Set
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ab;
import com.amazon.device.ads.ac;
import com.amazon.device.ads.ad;
import com.amazon.device.ads.al;
import com.amazon.device.ads.bi;
import com.amazon.device.ads.cp;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.h;
import java.util.Iterator;
import java.util.Set;

class o {
    private static final String a = "o";
    private final bi b;
    private final h c;
    private final cy d;
    private final al e;
    private final ad f;

    public o(bi bi2, ad ad2, h h2, cz cz2, al al2) {
        this.b = bi2;
        this.f = ad2;
        this.c = h2;
        this.d = cz2.a(a);
        this.e = al2;
    }

    private String a(String string) {
        String string2 = "";
        String string3 = "";
        if (!eh.a("\\A\\s*<![Dd][Oo][Cc][Tt][Yy][Pp][Ee]\\s+[Hh][Tt][Mm][Ll][\\s>]", string)) {
            string2 = "<!DOCTYPE html>";
        }
        if (!eh.a("<[Hh][Tt][Mm][Ll][\\s>]", string)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("<html>");
            string2 = stringBuilder.toString();
            string3 = "</html>";
        }
        if (!eh.a("<[Hh][Ee][Aa][Dd][\\s>]", string)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("<head></head>");
            string2 = stringBuilder.toString();
        }
        if (!eh.a("<[Bb][Oo][Dd][Yy][\\s>]", string)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("<body>");
            string2 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("</body>");
            stringBuilder2.append(string3);
            string3 = stringBuilder2.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    private String a(String string, String string2) {
        String string3 = eh.b("<[Hh][Ee][Aa][Dd](\\s*>|\\s[^>]*>)", string);
        String string4 = "";
        if (!eh.a("<[Mm][Ee][Tt][Aa](\\s[^>]*\\s|\\s)[Nn][Aa][Mm][Ee]\\s*=\\s*[\"'][Vv][Ii][Ee][Ww][Pp][Oo][Rr][Tt][\"']", string)) {
            if (this.c.r() >= 0.0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string4);
                stringBuilder.append("<meta name=\"viewport\" content=\"width=");
                stringBuilder.append(this.c.n());
                stringBuilder.append(", height=");
                stringBuilder.append(this.c.o());
                stringBuilder.append(", initial-scale=");
                stringBuilder.append(this.e.a(this.c.r()));
                stringBuilder.append(", minimum-scale=");
                stringBuilder.append(this.c.r());
                stringBuilder.append(", maximum-scale=");
                stringBuilder.append(this.c.r());
                stringBuilder.append("\"/>");
                string4 = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string4);
                stringBuilder.append("<meta name=\"viewport\" content=\"width=device-width, height=device-height, user-scalable=no, initial-scale=1.0\"/>");
                string4 = stringBuilder.toString();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string4);
        stringBuilder.append("<style>html,body{margin:0;padding:0;height:100%;border:none;}</style>");
        String string5 = stringBuilder.toString();
        if (string2.length() > 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string5);
            stringBuilder2.append("<script type='text/javascript'>");
            stringBuilder2.append(string2);
            stringBuilder2.append("</script>");
            string5 = stringBuilder2.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string3);
        stringBuilder3.append(string5);
        return string.replace((CharSequence)string3, (CharSequence)stringBuilder3.toString());
    }

    private void a(ab ab2) {
        this.f.a(ab2);
    }

    public String a(String string, boolean bl2) {
        Iterator iterator = this.b.a(string).iterator();
        while (iterator.hasNext()) {
            this.a(((ac)iterator.next()).a(this.c));
        }
        cy cy2 = this.d;
        Object[] arrobject = new Object[]{Float.valueOf((float)this.e.a()), this.c.n(), this.c.o(), (int)((float)this.c.p() * this.e.a()), (int)((float)this.c.q() * this.e.a()), this.c.r()};
        cy2.c("Scaling Params: scalingDensity: %f, windowWidth: %d, windowHeight: %d, adWidth: %d, adHeight: %d, scale: %f", arrobject);
        String string2 = "";
        for (ab ab2 : this.f) {
            if (ab2.e() != null) {
                this.c.a(ab2.e());
            }
            if (ab2.d() != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(ab2.d());
                string2 = stringBuilder.toString();
            }
            if (!ab2.a()) continue;
            this.c.a(ab2.b(), bl2, ab2.c());
        }
        return this.a(this.a(string), string2);
    }
}

