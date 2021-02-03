/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  java.io.Closeable
 *  java.io.InputStream
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Locale
 */
package d.a.a.a.a.g;

import android.content.Context;
import android.content.res.Resources;
import d.a.a.a.a.b.u;
import d.a.a.a.a.e.e;
import d.a.a.a.a.g.d;
import d.a.a.a.a.g.n;
import d.a.a.a.c;
import d.a.a.a.i;
import d.a.a.a.k;
import d.a.a.a.l;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

abstract class a
extends d.a.a.a.a.b.a {
    public a(i i2, String string, String string2, e e2, d.a.a.a.a.e.c c2) {
        super(i2, string, string2, e2, c2);
    }

    private d.a.a.a.a.e.d a(d.a.a.a.a.e.d d2, d d3) {
        return d2.a("X-CRASHLYTICS-API-KEY", d3.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.kit.getVersion());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private d.a.a.a.a.e.d b(d.a.a.a.a.e.d d2, d d3) {
        d.a.a.a.a.e.d d4;
        block9 : {
            d4 = d2.e("app[identifier]", d3.b).e("app[name]", d3.f).e("app[display_version]", d3.c).e("app[build_version]", d3.d).a("app[source]", (Number)d3.g).e("app[minimum_sdk_version]", d3.h).e("app[built_sdk_version]", d3.i);
            if (!d.a.a.a.a.b.i.d(d3.e)) {
                d4.e("app[instance_identifier]", d3.e);
            }
            if (d3.j != null) {
                Throwable throwable2222;
                InputStream inputStream;
                block8 : {
                    block7 : {
                        inputStream = null;
                        try {
                            inputStream = this.kit.getContext().getResources().openRawResource(d3.j.b);
                            d4.e("app[icon][hash]", d3.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", inputStream).a("app[icon][width]", (Number)d3.j.c).a("app[icon][height]", (Number)d3.j.d);
                            break block7;
                        }
                        catch (Throwable throwable2222) {
                            break block8;
                        }
                        catch (Resources.NotFoundException notFoundException) {
                            l l2 = c.g();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Failed to find app icon with resource ID: ");
                            stringBuilder.append(d3.j.b);
                            l2.e("Fabric", stringBuilder.toString(), notFoundException);
                        }
                    }
                    d.a.a.a.a.b.i.a((Closeable)inputStream, "Failed to close app icon InputStream.");
                    break block9;
                }
                d.a.a.a.a.b.i.a(inputStream, "Failed to close app icon InputStream.");
                throw throwable2222;
            }
        }
        if (d3.k == null) return d4;
        Iterator iterator = d3.k.iterator();
        while (iterator.hasNext()) {
            k k2 = (k)iterator.next();
            d4.e(this.a(k2), k2.b());
            d4.e(this.b(k2), k2.c());
        }
        return d4;
    }

    String a(k k2) {
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{k2.a()};
        return String.format((Locale)locale, (String)"app[build][libraries][%s][version]", (Object[])arrobject);
    }

    public boolean a(d d2) {
        d.a.a.a.a.e.d d3 = this.b(this.a(this.getHttpRequest(), d2), d2);
        l l2 = c.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending app info to ");
        stringBuilder.append(this.getUrl());
        l2.a("Fabric", stringBuilder.toString());
        if (d2.j != null) {
            l l3 = c.g();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("App icon hash is ");
            stringBuilder2.append(d2.j.a);
            l3.a("Fabric", stringBuilder2.toString());
            l l4 = c.g();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("App icon size is ");
            stringBuilder3.append(d2.j.c);
            stringBuilder3.append("x");
            stringBuilder3.append(d2.j.d);
            l4.a("Fabric", stringBuilder3.toString());
        }
        int n2 = d3.b();
        String string = "POST".equals((Object)d3.o()) ? "Create" : "Update";
        l l5 = c.g();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(string);
        stringBuilder4.append(" app request ID: ");
        stringBuilder4.append(d3.b("X-REQUEST-ID"));
        l5.a("Fabric", stringBuilder4.toString());
        l l6 = c.g();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append("Result was ");
        stringBuilder5.append(n2);
        l6.a("Fabric", stringBuilder5.toString());
        return u.a(n2) == 0;
    }

    String b(k k2) {
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{k2.a()};
        return String.format((Locale)locale, (String)"app[build][libraries][%s][type]", (Object[])arrobject);
    }
}

