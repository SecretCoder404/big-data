/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  com.amazon.device.ads.b$n
 *  com.amazon.device.ads.c$a
 *  com.amazon.device.ads.c$b
 *  com.amazon.device.ads.cy
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import com.amazon.device.ads.af;
import com.amazon.device.ads.ah;
import com.amazon.device.ads.aq;
import com.amazon.device.ads.b;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.bl;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.br;
import com.amazon.device.ads.c;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ez;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

class aa {
    private static final String b = "aa";
    private static final com.amazon.device.ads.b<?>[] c;
    private static final com.amazon.device.ads.c[] d;
    protected final Map<Integer, c> a;
    private final b e;
    private final ah f;
    private final String g;
    private final bl h;
    private String i;
    private aq.a j;
    private final ez.d k;
    private final bk l;
    private final bn m;
    private final cy n;
    private final co.a o;

    static {
        com.amazon.device.ads.b[] arrb = new com.amazon.device.ads.b[]{com.amazon.device.ads.b.a, com.amazon.device.ads.b.b, com.amazon.device.ads.b.c, com.amazon.device.ads.b.d, com.amazon.device.ads.b.e, com.amazon.device.ads.b.f, com.amazon.device.ads.b.g, com.amazon.device.ads.b.h, com.amazon.device.ads.b.i, com.amazon.device.ads.b.j, com.amazon.device.ads.b.l};
        c = arrb;
        com.amazon.device.ads.c[] arrc = new com.amazon.device.ads.c[]{com.amazon.device.ads.c.a, com.amazon.device.ads.c.b};
        d = arrc;
    }

    public aa(ah ah2) {
        this(ah2, new ez.d(), cx.a(), bk.a(), bn.a(), new cz(), new co.a());
    }

    @SuppressLint(value={"UseSparseArrays"})
    aa(ah ah2, ez.d d2, cx cx2, bk bk2, bn bn2, cz cz2, co.a a2) {
        JSONObject jSONObject;
        this.f = ah2;
        this.k = d2;
        this.o = a2;
        this.a = new HashMap();
        this.g = cx2.c().s();
        this.h = new bl(cx2);
        this.l = bk2;
        this.m = bn2;
        this.n = cz2.a(b);
        HashMap<String, String> hashMap = this.f.a();
        if (this.m.a("debug.advTargeting") && (jSONObject = this.m.a("debug.advTargeting", (JSONObject)null)) != null) {
            hashMap.putAll(this.o.a(jSONObject));
        }
        b.m m2 = new b.m().a(this.f).a((Map<String, String>)hashMap).a(this);
        this.e = new b(this.n).a(c).a(d).a((Map<String, String>)hashMap).a(m2);
    }

    private boolean g() {
        boolean bl2 = bk.a().b(bk.a.g);
        return !bk.a().b(bk.a.h) && bl2 && this.b().e();
    }

    aa a(aq.a a2) {
        this.j = a2;
        return this;
    }

    public String a() {
        return this.i;
    }

    public void a(af af2) {
        if (this.d().f()) {
            af2.f().a(cv.a.z);
        }
        af2.a(this.h);
        c c2 = new c(af2, this, this.n);
        this.a.put((Object)af2.c(), (Object)c2);
    }

    protected void a(ez ez2) {
        this.e.c();
        JSONArray jSONArray = com.amazon.device.ads.b.k.b(this.e.a());
        if (jSONArray == null) {
            jSONArray = this.e();
        }
        this.e.a(com.amazon.device.ads.b.k, (Object)jSONArray);
        JSONObject jSONObject = this.e.b();
        String string = this.m.a("debug.aaxAdParams", (String)null);
        if (!eh.a(string)) {
            ez2.g(string);
        }
        this.a(ez2, jSONObject);
    }

    protected void a(ez ez2, JSONObject jSONObject) {
        ez2.e(jSONObject.toString());
    }

    public void a(String string) {
        this.i = string;
    }

    ah b() {
        return this.f;
    }

    String c() {
        return this.g;
    }

    aq.a d() {
        return this.j;
    }

    protected JSONArray e() {
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            jSONArray.put((Object)((c)iterator.next()).b());
        }
        return jSONArray;
    }

    public ez f() {
        ez ez2 = this.k.a();
        boolean bl2 = this.g() || ez2.h();
        ez2.e(bl2);
        ez2.h(b);
        ez2.a(ez.a.b);
        ez2.b(this.l.a(bk.a.a));
        ez2.c(this.l.a(bk.a.b));
        ez2.d(true);
        ez2.f("application/json");
        ez2.f(false);
        this.a(ez2);
        return ez2;
    }

    static class a {
        private ah a;
        private aq.a b;

        a() {
        }

        public a a(ah ah2) {
            this.a = ah2;
            return this;
        }

        public a a(aq.a a2) {
            this.b = a2;
            return this;
        }

        public aa a() {
            return new aa(this.a).a(this.b);
        }
    }

    static class b {
        private final cy a;
        private final JSONObject b;
        private com.amazon.device.ads.b<?>[] c;
        private com.amazon.device.ads.c[] d;
        private Map<String, String> e;
        private b.m f;

        b(cy cy2) {
            this(cy2, new JSONObject());
        }

        b(cy cy2, JSONObject jSONObject) {
            this.a = cy2;
            this.b = jSONObject;
        }

        b a(b.m m2) {
            this.f = m2;
            return this;
        }

        b a(Map<String, String> map) {
            this.e = map;
            return this;
        }

        b a(com.amazon.device.ads.b<?>[] arrb) {
            this.c = arrb;
            return this;
        }

        b a(com.amazon.device.ads.c[] arrc) {
            this.d = arrc;
            return this;
        }

        b.m a() {
            return this.f;
        }

        void a(com.amazon.device.ads.b<?> b2, Object object) {
            this.a(b2.a(), object);
        }

        /*
         * Exception decompiling
         */
        void a(String var1, Object var2) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl24 : RETURN : trying to set 0 previously set to 1
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:919)
            throw new IllegalStateException("Decompilation failed");
        }

        JSONObject b() {
            return this.b;
        }

        void c() {
            com.amazon.device.ads.c[] arrc = this.d;
            int n2 = 0;
            if (arrc != null) {
                int n3 = arrc.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    arrc[i2].a(this.f, this.b);
                }
            }
            com.amazon.device.ads.b<?>[] arrb = this.c;
            int n4 = arrb.length;
            while (n2 < n4) {
                com.amazon.device.ads.b<?> b2 = arrb[n2];
                this.a(b2, b2.b(this.f));
                ++n2;
            }
            Map<String, String> map = this.e;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (eh.b((String)entry.getValue())) continue;
                    this.a((String)entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static class c {
        static final com.amazon.device.ads.b<?>[] a;
        private final ah b;
        private final b c;
        private final af d;
        private final bn e;
        private final co.a f;

        static {
            com.amazon.device.ads.b[] arrb = new com.amazon.device.ads.b[]{com.amazon.device.ads.b.m, com.amazon.device.ads.b.n, com.amazon.device.ads.b.o, com.amazon.device.ads.b.p, com.amazon.device.ads.b.q, com.amazon.device.ads.b.r, com.amazon.device.ads.b.s, com.amazon.device.ads.b.t, com.amazon.device.ads.b.u};
            a = arrb;
        }

        c(af af2, aa aa2, cy cy2) {
            this(af2, aa2, cy2, new b(cy2), bn.a(), new co.a());
        }

        c(af af2, aa aa2, cy cy2, b b2, bn bn2, co.a a2) {
            JSONObject jSONObject;
            this.b = af2.a();
            this.d = af2;
            this.e = bn2;
            this.f = a2;
            HashMap<String, String> hashMap = this.b.a();
            if (this.e.a("debug.advTargeting") && (jSONObject = this.e.a("debug.advTargeting", (JSONObject)null)) != null) {
                hashMap.putAll(this.f.a(jSONObject));
            }
            b.m m2 = new b.m().a(this.b).a((Map<String, String>)hashMap).a(this).a(aa2);
            this.c = b2.a(a).a((Map<String, String>)hashMap).a(m2);
        }

        ah a() {
            return this.b;
        }

        JSONObject b() {
            this.c.c();
            return this.c.b();
        }

        af c() {
            return this.d;
        }
    }

}

