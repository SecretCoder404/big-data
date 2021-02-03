/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.b$a
 *  com.amazon.device.ads.b$c
 *  com.amazon.device.ads.b$d
 *  com.amazon.device.ads.b$e
 *  com.amazon.device.ads.b$g
 *  com.amazon.device.ads.b$j
 *  com.amazon.device.ads.b$k
 *  com.amazon.device.ads.b$l
 *  com.amazon.device.ads.b$n
 *  com.amazon.device.ads.b$o
 *  com.amazon.device.ads.b$p
 *  com.amazon.device.ads.b$q
 *  com.amazon.device.ads.b$r
 *  com.amazon.device.ads.b$s
 *  com.amazon.device.ads.b$t
 *  com.amazon.device.ads.b$u
 *  com.amazon.device.ads.b$v
 *  com.amazon.device.ads.b$x
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aa;
import com.amazon.device.ads.ah;
import com.amazon.device.ads.b;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.eh;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis.
 */
abstract class b<T> {
    static final b<String> a;
    static final b<String> b;
    static final n c;
    static final b<JSONArray> d;
    static final b<String> e;
    static final b<String> f;
    static final b<String> g;
    static final b<JSONObject> h;
    static final b<JSONObject> i;
    static final b<Boolean> j;
    static final b<JSONArray> k;
    static final b<Boolean> l;
    static final b<String> m;
    static final b<String> n;
    static final b<String> o;
    static final b<String> p;
    static final b<String> q;
    static final b<Integer> r;
    static final b<Long> s;
    static final b<JSONArray> t;
    static final b<JSONObject> u;
    private static final String v = "b";
    private final String w;
    private final String x;

    static {
        a = new /* Unavailable Anonymous Inner Class!! */;
        b = new /* Unavailable Anonymous Inner Class!! */;
        c = new /* Unavailable Anonymous Inner Class!! */;
        d = new /* Unavailable Anonymous Inner Class!! */;
        e = new /* Unavailable Anonymous Inner Class!! */;
        f = new /* Unavailable Anonymous Inner Class!! */;
        g = new /* Unavailable Anonymous Inner Class!! */;
        h = new /* Unavailable Anonymous Inner Class!! */;
        i = new /* Unavailable Anonymous Inner Class!! */;
        j = new /* Unavailable Anonymous Inner Class!! */;
        k = new /* Unavailable Anonymous Inner Class!! */;
        l = new /* Unavailable Anonymous Inner Class!! */;
        m = new /* Unavailable Anonymous Inner Class!! */;
        n = new /* Unavailable Anonymous Inner Class!! */;
        o = new /* Unavailable Anonymous Inner Class!! */;
        p = new /* Unavailable Anonymous Inner Class!! */;
        q = new /* Unavailable Anonymous Inner Class!! */;
        r = new /* Unavailable Anonymous Inner Class!! */;
        s = new /* Unavailable Anonymous Inner Class!! */;
        t = new /* Unavailable Anonymous Inner Class!! */;
        u = new /* Unavailable Anonymous Inner Class!! */;
    }

    b(String string, String string2) {
        this.w = string;
        this.x = string2;
    }

    private T a(m m2, boolean bl2) {
        Object var4_5;
        T t2 = this.c() ? (T)this.d() : null;
        if (m2.b != null) {
            String string = bl2 ? (String)m2.b.remove((Object)this.w) : (String)m2.b.get((Object)this.w);
            if (t2 == null && !eh.a(string)) {
                t2 = this.a(string);
            }
        }
        if (t2 == null) {
            t2 = this.c(m2);
        }
        if ((var4_5 = this.a(t2, m2)) instanceof String && eh.b(var4_5)) {
            var4_5 = null;
        }
        return var4_5;
    }

    static /* synthetic */ String e() {
        return v;
    }

    T a(m m2) {
        return this.a(m2, false);
    }

    protected T a(T t2, m m2) {
        return t2;
    }

    protected abstract T a(String var1);

    String a() {
        return this.w;
    }

    T b(m m2) {
        return this.a(m2, true);
    }

    protected String b() {
        return this.x;
    }

    protected T c(m m2) {
        return null;
    }

    protected boolean c() {
        return bn.a().a(this.x);
    }

    protected abstract T d();

    static class m {
        private aa a;
        private Map<String, String> b;
        private aa.c c;
        private ah d;
        private Map<String, String> e = new HashMap();

        static /* synthetic */ ah b(m m2) {
            return m2.d;
        }

        static /* synthetic */ aa c(m m2) {
            return m2.a;
        }

        m a(aa.c c2) {
            this.c = c2;
            return this;
        }

        m a(aa aa2) {
            this.a = aa2;
            return this;
        }

        m a(ah ah2) {
            this.d = ah2;
            return this;
        }

        m a(Map<String, String> map) {
            this.b = map;
            return this;
        }

        Map<String, String> a() {
            return this.b;
        }

        aa b() {
            return this.a;
        }
    }

    private static class w {
        private final m a;

        public w(m m2) {
            this.a = m2;
        }

        public boolean a() {
            if (!this.a.c.a().h()) {
                return false;
            }
            if (this.a.b.containsKey((Object)"enableVideoAds")) {
                String string = (String)this.a.b.remove((Object)"enableVideoAds");
                this.a.e.put((Object)"enableVideoAds", (Object)string);
                return Boolean.parseBoolean((String)string);
            }
            if (this.a.e.containsKey((Object)"enableVideoAds")) {
                return Boolean.parseBoolean((String)((String)this.a.e.get((Object)"enableVideoAds")));
            }
            return this.a.c.a().g();
        }
    }

}

