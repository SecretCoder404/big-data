/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import org.json.JSONArray;
import org.json.JSONException;

public class x {
    private static final String a = "x";
    private a b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private final cy f;

    x(JSONArray jSONArray) {
        this(jSONArray, new cz());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    x(JSONArray var1_1, cz var2_2) {
        super();
        this.f = var2_2.a(x.a);
        if (var1_1 != null) {
            for (var3_3 = 0; var3_3 < var1_1.length(); ++var3_3) {
                try {
                    switch (var1_1.getInt(var3_3)) {
                        case 1017: {
                            this.b = a.c;
                            ** break;
                        }
                        case 1016: {
                            this.b = a.b;
                            ** break;
                        }
                        case 1014: {
                            this.e = true;
                            ** break;
                        }
                        case 1008: {
                            this.b = a.d;
                            ** break;
                        }
                        case 1007: {
                            this.b = a.a;
                            ** break;
                        }
                        case 1003: 
                        case 1004: {
                            this.c = true;
                            ** break;
                        }
                        case 1001: 
                        case 1002: {
                            this.d = true;
                            ** break;
                        }
                    }
                    ** break;
lbl32: // 8 sources:
                    continue;
                }
                catch (JSONException var4_4) {
                    var5_5 = this.f;
                    var6_6 = new Object[]{var4_4.getMessage()};
                    var5_5.d("Unable to parse creative type: %s", var6_6);
                }
            }
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("Image Banner");
        public static final /* enum */ a b = new a("MRAID 1.0");
        public static final /* enum */ a c = new a("MRAID 2.0");
        public static final /* enum */ a d = new a("Interstitial", "i");
        public static final /* enum */ a e = new a("Modeless Interstitial", "mi");
        private static final /* synthetic */ a[] h;
        private final String f;
        private final String g;

        static {
            a[] arra = new a[]{a, b, c, d, e};
            h = arra;
        }

        private a(String string2) {
            this(string2, null);
        }

        private a(String string2, String string3) {
            this.f = string2;
            this.g = string3;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])h.clone();
        }

        String a() {
            return this.g;
        }

        public String toString() {
            return this.f;
        }
    }

}

