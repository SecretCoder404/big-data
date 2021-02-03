/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.dl$a
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dd;
import com.amazon.device.ads.dj;
import com.amazon.device.ads.dl;
import com.amazon.device.ads.do;
import com.amazon.device.ads.dr;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ei;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.em;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.fa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class bk {
    private static final String a = "bk";
    private static bk b = new bk();
    private String c = null;
    private boolean d = false;
    private final List<b> e = new ArrayList(5);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private Boolean g = null;
    private boolean h = false;
    private dl i = new dl.a();
    private final cy j;
    private final dj k;
    private final ez.d l;
    private final bn m;
    private final ee n;
    private final cx o;
    private final ei p;
    private final cv q;
    private final ej.k r;
    private final fa s;

    protected bk() {
        this(new cz(), new dj(), new ez.d(), bn.a(), ee.a(), cx.a(), new ei(), cv.a(), ej.a(), new fa());
    }

    bk(cz cz2, dj dj2, ez.d d2, bn bn2, ee ee2, cx cx2, ei ei2, cv cv2, ej.k k2, fa fa2) {
        this.j = cz2.a(a);
        this.k = dj2;
        this.l = d2;
        this.m = bn2;
        this.n = ee2;
        this.o = cx2;
        this.p = ei2;
        this.q = cv2;
        this.r = k2;
        this.s = fa2;
    }

    public static final bk a() {
        return b;
    }

    private void a(a a2, JSONObject jSONObject) {
        if (a2.b().equals(String.class)) {
            String string = jSONObject.getString(a2.a());
            if (!a2.c() && eh.b(string)) {
                throw new IllegalArgumentException("The configuration value must not be empty or contain only white spaces.");
            }
            this.n.c(a2.d(), string);
            return;
        }
        if (a2.b().equals(Boolean.class)) {
            boolean bl2 = jSONObject.getBoolean(a2.a());
            this.n.c(a2.d(), bl2);
            return;
        }
        if (a2.b().equals(Integer.class)) {
            int n2 = jSONObject.getInt(a2.a());
            this.n.c(a2.d(), n2);
            return;
        }
        if (a2.b().equals(Long.class)) {
            long l2 = jSONObject.getLong(a2.a());
            this.n.c(a2.d(), l2);
            return;
        }
        if (a2.b().equals(JSONObject.class)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(a2.a());
            this.n.a(a2.d(), jSONObject2);
            return;
        }
        throw new IllegalArgumentException("Undefined configuration option type.");
    }

    private boolean k() {
        String string = this.n.a("config-appDefinedMarketplace", (String)null);
        if (this.d) {
            this.d = false;
            String string2 = this.c;
            if (string2 != null && !string2.equals((Object)string)) {
                this.n.c("config-lastFetchTime", 0L);
                this.n.c("config-appDefinedMarketplace", this.c);
                this.n.c();
                this.o.d().f();
                this.j.d("New application-defined marketplace set. A new configuration will be retrieved.");
                return true;
            }
            if (string != null && this.c == null) {
                this.n.b("config-appDefinedMarketplace");
                this.o.d().f();
                this.j.d("Application-defined marketplace removed. A new configuration will be retrieved.");
                return true;
            }
        }
        return false;
    }

    private String l() {
        return this.i.a(cx.a().k());
    }

    public int a(a a2, int n2) {
        return this.n.a(a2.d(), n2);
    }

    public long a(a a2, long l2) {
        return this.n.a(a2.d(), l2);
    }

    public String a(a a2) {
        return this.n.a(a2.d(), (String)null);
    }

    public String a(a a2, String string) {
        return this.n.a(a2.d(), string);
    }

    public void a(b b2) {
        bk bk2 = this;
        synchronized (bk2) {
            this.a(b2, true);
            return;
        }
    }

    public void a(b b2, boolean bl2) {
        bk bk2 = this;
        synchronized (bk2) {
            if (this.c()) {
                this.e.add((Object)b2);
            } else if (this.b()) {
                this.e.add((Object)b2);
                if (bl2) {
                    this.j.d("Starting configuration fetching...");
                    this.a(true);
                    this.d();
                }
            } else {
                b2.c();
            }
            return;
        }
    }

    protected void a(boolean bl2) {
        this.f.set(bl2);
    }

    public boolean a(a a2, boolean bl2) {
        return this.n.a(a2.d(), bl2);
    }

    protected void b(boolean bl2) {
        this.g = bl2;
    }

    protected boolean b() {
        long l2;
        if (this.k()) {
            return true;
        }
        if (this.n.a("configVersion", 0) != 4) {
            return true;
        }
        long l3 = this.n.a("config-lastFetchTime", 0L);
        if (l3 == 0L) {
            this.j.d("No configuration found. A new configuration will be retrieved.");
            return true;
        }
        long l4 = this.p.a();
        if (l4 - l3 > (l2 = this.n.a("config-ttl", 172800000L))) {
            this.j.d("The configuration has expired. A new configuration will be retrieved.");
            return true;
        }
        if (this.n.d("amzn-ad-iu-last-checkin", 0L) - l3 > 0L) {
            this.j.d("A new user has been identified. A new configuration will be retrieved.");
            return true;
        }
        Boolean bl2 = this.g;
        if (bl2 != null && bl2.booleanValue() != this.n.a("testingEnabled", false)) {
            this.j.d("The testing mode has changed. A new configuration will be retrieved.");
            return true;
        }
        return this.m.a("debug.shouldFetchConfig", false) != false;
    }

    public boolean b(a a2) {
        return this.a(a2, false);
    }

    public int c(a a2) {
        return this.a(a2, 0);
    }

    protected boolean c() {
        return this.f.get();
    }

    protected void d() {
        this.r.a(new Runnable(){

            public void run() {
                bk.this.i();
            }
        }, ej.b.b, ej.c.b);
    }

    protected void e() {
        bk bk2 = this;
        synchronized (bk2) {
            this.a(false);
            b[] arrb = this.g();
            int n2 = arrb.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                arrb[i2].c();
            }
            return;
        }
    }

    protected void f() {
        bk bk2 = this;
        synchronized (bk2) {
            this.q.b().a(cv.a.W);
            this.a(false);
            b[] arrb = this.g();
            int n2 = arrb.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                arrb[i2].d();
            }
            return;
        }
    }

    protected b[] g() {
        bk bk2 = this;
        synchronized (bk2) {
            Object[] arrobject = new b[this.e.size()];
            b[] arrb = (b[])this.e.toArray(arrobject);
            this.e.clear();
            return arrb;
        }
    }

    protected a[] h() {
        return a.q;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void i() {
        block14 : {
            this.j.d("In configuration fetcher background thread.");
            if (!this.k.a(this.o.k())) {
                this.j.f("Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
                this.f();
                return;
            }
            var1_1 = this.j();
            if (var1_1 == null) {
                this.f();
                return;
            }
            var2_2 = var1_1.c();
            var3_3 = var2_2.a().d();
            var10_4 = this.h();
            var11_5 = var10_4.length;
            var12_6 = 0;
lbl17: // 2 sources:
            do {
                block15 : {
                    block16 : {
                        if (var12_6 >= var11_5) ** GOTO lbl32
                        var13_7 = var10_4[var12_6];
                        if (!var3_3.isNull(var13_7.a())) ** GOTO lbl30
                        if (var13_7.c()) {
                            this.n.c(a.a(var13_7));
                        } else {
                            var14_8 = new StringBuilder();
                            var14_8.append("The configuration value for ");
                            var14_8.append(var13_7.a());
                            var14_8.append(" must be present and not null.");
                            throw new Exception(var14_8.toString());
lbl30: // 1 sources:
                            this.a(var13_7, var3_3);
                        }
                        break block14;
lbl32: // 1 sources:
                        if (!var3_3.isNull(a.o.a())) {
                            this.m.a(var3_3.getJSONObject(a.o.a()));
                        } else {
                            this.n.c(a.a(a.o));
                            this.m.b();
                        }
                        if (var3_3.isNull("ttl")) break block15;
                        var18_9 = dd.b(var3_3.getInt("ttl"));
                        if (var18_9 <= 172800000L) break block16;
                        var18_9 = 172800000L;
                    }
                    this.n.c("config-ttl", var18_9);
                    this.n.c("config-lastFetchTime", this.p.a());
                    this.n.c("configVersion", 4);
                    this.n.c();
                    this.j.d("Configuration fetched and saved.");
                    this.e();
                    return;
                }
                try {
                    throw new Exception("The configuration value must be present and not null.");
                }
                catch (Exception var7_10) {
                    var8_11 = this.j;
                    var9_12 = new Object[]{var7_10.getMessage()};
                    var8_11.e("Unexpected error during parsing: %s", var9_12);
                    this.f();
                    return;
                }
                catch (JSONException var4_13) {
                    var5_14 = this.j;
                    var6_15 = new Object[]{var4_13.getMessage()};
                    var5_14.e("Unable to parse JSON response: %s", var6_15);
                    this.f();
                    return;
                }
                break;
            } while (true);
            catch (ez.c v0) {
                this.f();
                return;
            }
        }
        ++var12_6;
        ** while (true)
    }

    protected ez j() {
        ez ez2 = this.l.b();
        ez2.h(a);
        ez2.d(true);
        ez2.b(this.m.a("debug.aaxConfigHostname", "mads.amazon-adsystem.com"));
        ez2.c("/msdk/getConfig");
        ez2.a(this.q.b());
        ez2.a(cv.a.V);
        ez2.e(this.m.a("debug.aaxConfigUseSecure", true));
        do do_ = this.o.d();
        br br2 = this.o.c();
        ez2.a("appId", do_.e());
        ez2.a("dinfo", br2.t().toString());
        ez2.a("sdkVer", em.b());
        ez2.a("fp", Boolean.toString((boolean)this.h));
        ez2.a("mkt", this.n.a("config-appDefinedMarketplace", (String)null));
        ez2.a("pfm", this.l());
        boolean bl2 = this.n.a("testingEnabled", false);
        this.b(bl2);
        if (bl2) {
            ez2.a("testMode", "true");
        }
        ez2.g(this.m.a("debug.aaxConfigParams", (String)null));
        if (!this.s.a(ez2)) {
            return null;
        }
        return ez2;
    }

    public static class a {
        public static final a a = new a("config-aaxHostname", String.class, "aaxHostname");
        public static final a b = new a("config-adResourcePath", String.class, "adResourcePath");
        public static final a c = new a("config-sisURL", String.class, "sisURL");
        public static final a d = new a("config-adPrefURL", String.class, "adPrefURL");
        public static final a e = new a("config-madsHostname", String.class, "madsHostname", true);
        public static final a f = new a("config-sisDomain", String.class, "sisDomain");
        public static final a g = new a("config-sendGeo", Boolean.class, "sendGeo");
        public static final a h = new a("config-truncateLatLon", Boolean.class, "truncateLatLon");
        public static final a i = new a("config-whitelistedCustomer", Boolean.class, "whitelistedCustomer");
        public static final a j = new a("config-identifyUserInterval", Long.class, "identifyUserInterval");
        public static final a k = new a("config-identifyUserSessionIdInterval", Long.class, "identifyUserSessionIdInterval", true);
        public static final a l = new a("config-viewableJavascriptCDNURL", String.class, "viewableJavascriptCDNURL");
        public static final a m = new a("config-viewableJSVersionConfig", Integer.class, "viewableJSVersion");
        public static final a n = new a("config-viewableInterval", Long.class, "viewableInterval", true);
        public static final a o = new a("config-debugProperties", JSONObject.class, "debugProperties", true);
        public static final a p = new a("config-baseURL", String.class, "baseURL", true);
        public static final a[] q;
        private final String r;
        private final String s;
        private final Class<?> t;
        private final boolean u;

        static {
            a[] arra = new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, o, n, p};
            q = arra;
        }

        protected a(String string, Class<?> class_, String string2) {
            this(string, class_, string2, false);
        }

        protected a(String string, Class<?> class_, String string2, boolean bl2) {
            this.r = string;
            this.s = string2;
            this.t = class_;
            this.u = bl2;
        }

        private String d() {
            return this.r;
        }

        String a() {
            return this.s;
        }

        Class<?> b() {
            return this.t;
        }

        boolean c() {
            return this.u;
        }
    }

    static interface b {
        public void c();

        public void d();
    }

}

