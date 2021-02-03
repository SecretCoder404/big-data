/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package d.a.a.a.a.g;

import d.a.a.a.a.b.a;
import d.a.a.a.a.e.d;
import d.a.a.a.a.e.e;
import d.a.a.a.a.g.w;
import d.a.a.a.a.g.x;
import d.a.a.a.c;
import d.a.a.a.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class l
extends a
implements x {
    public l(i i2, String string, String string2, e e2) {
        this(i2, string, string2, e2, d.a.a.a.a.e.c.a);
    }

    l(i i2, String string, String string2, e e2, d.a.a.a.a.e.c c2) {
        super(i2, string, string2, e2, c2);
    }

    private d a(d d2, w w2) {
        this.a(d2, "X-CRASHLYTICS-API-KEY", w2.a);
        this.a(d2, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.a(d2, "X-CRASHLYTICS-API-CLIENT-VERSION", this.kit.getVersion());
        this.a(d2, "Accept", "application/json");
        this.a(d2, "X-CRASHLYTICS-DEVICE-MODEL", w2.b);
        this.a(d2, "X-CRASHLYTICS-OS-BUILD-VERSION", w2.c);
        this.a(d2, "X-CRASHLYTICS-OS-DISPLAY-VERSION", w2.d);
        this.a(d2, "X-CRASHLYTICS-INSTALLATION-ID", w2.e);
        return d2;
    }

    private JSONObject a(String string) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            return jSONObject;
        }
        catch (Exception exception) {
            d.a.a.a.l l2 = c.g();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse settings JSON from ");
            stringBuilder.append(this.getUrl());
            l2.a("Fabric", stringBuilder.toString(), exception);
            d.a.a.a.l l3 = c.g();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Settings response ");
            stringBuilder2.append(string);
            l3.a("Fabric", stringBuilder2.toString());
            return null;
        }
    }

    private void a(d d2, String string, String string2) {
        if (string2 != null) {
            d2.a(string, string2);
        }
    }

    private Map<String, String> b(w w2) {
        String string;
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"build_version", (Object)w2.h);
        hashMap.put((Object)"display_version", (Object)w2.g);
        hashMap.put((Object)"source", (Object)Integer.toString((int)w2.i));
        if (w2.j != null) {
            hashMap.put((Object)"icon_hash", (Object)w2.j);
        }
        if (!d.a.a.a.a.b.i.d(string = w2.f)) {
            hashMap.put((Object)"instance", (Object)string);
        }
        return hashMap;
    }

    JSONObject a(d d2) {
        int n2 = d2.b();
        d.a.a.a.l l2 = c.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings result was: ");
        stringBuilder.append(n2);
        l2.a("Fabric", stringBuilder.toString());
        if (this.a(n2)) {
            return this.a(d2.d());
        }
        d.a.a.a.l l3 = c.g();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Failed to retrieve settings from ");
        stringBuilder2.append(this.getUrl());
        l3.e("Fabric", stringBuilder2.toString());
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public JSONObject a(w w2) {
        Throwable throwable;
        d d2;
        block11 : {
            d.a.a.a.l l2;
            String string;
            StringBuilder stringBuilder;
            JSONObject jSONObject;
            block12 : {
                block10 : {
                    Map<String, String> map = this.b(w2);
                    d d3 = this.getHttpRequest(map);
                    d2 = this.a(d3, w2);
                    try {
                        d.a.a.a.l l3 = c.g();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Requesting settings from ");
                        stringBuilder2.append(this.getUrl());
                        l3.a("Fabric", stringBuilder2.toString());
                        d.a.a.a.l l4 = c.g();
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Settings query params were: ");
                        stringBuilder3.append(map);
                        l4.a("Fabric", stringBuilder3.toString());
                        jSONObject = this.a(d2);
                        if (d2 == null) return jSONObject;
                    }
                    catch (d.c c2) {
                        break block10;
                    }
                    l2 = c.g();
                    string = "Fabric";
                    stringBuilder = new StringBuilder();
                    break block12;
                    catch (Throwable throwable2) {
                        d2 = d3;
                        break block11;
                    }
                    catch (d.c c3) {
                        d2 = d3;
                        break block10;
                    }
                    catch (Throwable throwable3) {
                        throwable = throwable3;
                        d2 = null;
                        break block11;
                    }
                    catch (d.c c4) {
                        d2 = null;
                    }
                }
                try {
                    void var2_16;
                    c.g().e("Fabric", "Settings request failed.", (Throwable)var2_16);
                    jSONObject = null;
                    if (d2 == null) return jSONObject;
                }
                catch (Throwable throwable4) {
                    // empty catch block
                }
                l2 = c.g();
                string = "Fabric";
                stringBuilder = new StringBuilder();
                jSONObject = null;
            }
            stringBuilder.append("Settings request ID: ");
            stringBuilder.append(d2.b("X-REQUEST-ID"));
            l2.a(string, stringBuilder.toString());
            return jSONObject;
        }
        if (d2 == null) throw throwable;
        d.a.a.a.l l5 = c.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings request ID: ");
        stringBuilder.append(d2.b("X-REQUEST-ID"));
        l5.a("Fabric", stringBuilder.toString());
        throw throwable;
    }

    boolean a(int n2) {
        return n2 == 200 || n2 == 201 || n2 == 202 || n2 == 203;
        {
        }
    }
}

