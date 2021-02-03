/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.co;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.eh;
import java.io.InputStream;
import org.json.JSONObject;

class dr {
    private static final String a = "dr";
    private final cy b = new cz().a(a);
    private final InputStream c;
    private boolean d = false;

    dr(InputStream inputStream) {
        this.c = inputStream;
    }

    public void a(String string) {
        if (string == null) {
            this.b.a(a);
            return;
        }
        cy cy2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(" ");
        stringBuilder.append(string);
        cy2.a(stringBuilder.toString());
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    public InputStream b() {
        return this.c;
    }

    public String c() {
        String string = eh.a(this.c);
        if (this.d) {
            this.b.c("Response Body: %s", new Object[]{string});
        }
        return string;
    }

    public JSONObject d() {
        return co.a(this.c());
    }
}

