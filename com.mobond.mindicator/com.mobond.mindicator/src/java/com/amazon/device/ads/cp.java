/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.webkit.JavascriptInterface
 *  com.amazon.device.ads.cy
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.webkit.JavascriptInterface;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

class cp {
    private static final String a = "cp";
    private static String b;
    private static final cy e;
    private final Map<String, b> c = new ConcurrentHashMap();
    private final a d = new a(this);

    static {
        e = new cz().a(a);
    }

    public static String a() {
        if (b == null) {
            Method[] arrmethod = a.class.getDeclaredMethods();
            if (arrmethod != null && arrmethod.length == 1) {
                b = arrmethod[0].getName();
            } else {
                e.f("Could not obtain the method name for javascript interfacing.");
            }
        }
        return b;
    }

    private JSONObject a(String string, String string2) {
        JSONObject jSONObject = null;
        if (string2 != null) {
            int n2 = string2.length();
            jSONObject = null;
            if (n2 > 2) {
                JSONObject jSONObject2 = co.a(string2);
                if (jSONObject2 == null) {
                    e.d("The javascript object \"%s\" could not be parsed for method \"%s\".", new Object[]{string2, string});
                    return null;
                }
                jSONObject = jSONObject2;
            }
        }
        return this.a(string, jSONObject);
    }

    private JSONObject a(String string, JSONObject jSONObject) {
        if (this.c.containsKey((Object)string)) {
            return ((b)this.c.get((Object)string)).a(jSONObject);
        }
        e.d("The method %s was not recongized by this javascript interface.", new Object[]{string});
        return null;
    }

    public void a(b b2) {
        if (!this.c.containsKey((Object)b2.a())) {
            this.c.put((Object)b2.a(), (Object)b2);
            return;
        }
        throw new IllegalArgumentException("There is another executor with that method name already added.");
    }

    public a b() {
        return this.d;
    }

    public static class a {
        private final cp a;
        private boolean b = false;

        public a(cp cp2) {
            this.a = cp2;
            if (this.b) {
                this.execute(null, null);
            }
        }

        @JavascriptInterface
        public String execute(String string, String string2) {
            JSONObject jSONObject = this.a.a(string, string2);
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.toString();
        }
    }

    public static abstract class b {
        private final String a;

        protected b(String string) {
            this.a = string;
        }

        public String a() {
            return this.a;
        }

        protected abstract JSONObject a(JSONObject var1);
    }

}

