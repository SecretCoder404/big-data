/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cw$a
 *  com.amazon.device.ads.cy
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aa;
import com.amazon.device.ads.af;
import com.amazon.device.ads.bg;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dr;
import com.amazon.device.ads.ei;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis.
 */
class u {
    private static final String a = "u";
    private final aa b;
    private final Map<Integer, af> c;
    private int d;
    private m e;
    private cw.a f;
    private final cy g;
    private final cx h;
    private final bg i;
    private final bn j;
    private final ej.k k;
    private final ei l;

    public u(aa aa2, Map<Integer, af> map) {
        this(aa2, map, ej.a(), new ei(), bg.a(), cx.a(), new cz(), bn.a());
    }

    u(aa aa2, Map<Integer, af> map, ej.k k2, ei ei2, bg bg2, cx cx2, cz cz2, bn bn2) {
        this.d = 20000;
        this.e = null;
        this.f = null;
        this.b = aa2;
        this.c = map;
        this.k = k2;
        this.l = ei2;
        this.i = bg2;
        this.h = cx2;
        this.g = cz2.a(a);
        this.j = bn2;
    }

    private void a(m m2) {
        Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((af)iterator.next()).a(m2);
        }
    }

    /*
     * Exception decompiling
     */
    private void c(JSONObject var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl276 : ICONST_1 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    private void f() {
        this.k.a(new Runnable(){

            public void run() {
                u.this.d();
            }
        }, ej.b.b, ej.c.a);
    }

    private ez g() {
        this.h().b(cv.a.k);
        ez ez2 = this.b.f();
        this.h().c(cv.a.k);
        return ez2;
    }

    private cw h() {
        if (this.f == null) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = this.c.entrySet().iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)((af)((Map.Entry)iterator.next()).getValue()).f());
            }
            this.f = new /* Unavailable Anonymous Inner Class!! */;
        }
        return this.f;
    }

    protected m a(JSONObject jSONObject) {
        int n2 = this.b(jSONObject);
        this.h.a(n2);
        String string = co.a(jSONObject, "errorMessage", "No Ad Received");
        this.h.a(string.equalsIgnoreCase("DISABLED_APP"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Server Message: ");
        stringBuilder.append(string);
        String string2 = stringBuilder.toString();
        if (n2 > 0) {
            this.h().a(cv.a.E, n2 * 1000);
        }
        if (n2 > 0 && !this.h.i()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append(". Try again in ");
            stringBuilder2.append(n2);
            stringBuilder2.append(" seconds");
            String string3 = stringBuilder2.toString();
            return new m(m.a.c, string3);
        }
        if (string.equals((Object)"no results")) {
            return new m(m.a.c, string2);
        }
        return new m(m.a.d, string2);
    }

    public void a() {
        this.h().c(cv.a.d);
        this.h().b(cv.a.e);
        this.b();
    }

    public void a(int n2) {
        this.d = n2;
    }

    protected int b(JSONObject jSONObject) {
        int n2 = co.a(jSONObject, "noretryTTL", 0);
        return this.j.a("debug.noRetryTTL", n2);
    }

    protected void b() {
        this.k.a(new Runnable(){

            public void run() {
                u.this.c();
                u.this.f();
            }
        }, ej.b.b, ej.c.b);
    }

    protected void c() {
        ez.g g2;
        this.h().c(cv.a.e);
        this.h().b(cv.a.f);
        if (!this.i.c()) {
            this.e = new m(m.a.e, "Unable to create the assets needed to display ads");
            this.g.f("Unable to create the assets needed to display ads");
            this.a(this.e);
            return;
        }
        try {
            g2 = this.e();
        }
        catch (a a2) {
            this.e = a2.a();
            this.g.f(a2.a().b());
            this.a(this.e);
            return;
        }
        if (!g2.c()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(g2.b());
            stringBuilder.append(" - ");
            stringBuilder.append(g2.d());
            String string = stringBuilder.toString();
            this.e = new m(m.a.a, string);
            this.g.f(string);
            this.a(this.e);
            return;
        }
        JSONObject jSONObject = g2.a().d();
        if (jSONObject == null) {
            this.e = new m(m.a.d, "Unable to parse response");
            this.g.f("Unable to parse response");
            this.a(this.e);
            return;
        }
        this.c(jSONObject);
        this.h().c(cv.a.g);
        this.h().b(cv.a.h);
    }

    protected void d() {
        Iterator iterator = this.c.entrySet().iterator();
        while (iterator.hasNext()) {
            af af2 = (af)((Map.Entry)iterator.next()).getValue();
            if (!af2.j()) {
                this.g.e("Ad object was destroyed before ad fetching could be finalized. Ad fetching has been aborted.");
                continue;
            }
            af2.f().c(cv.a.h);
            if (!af2.g()) {
                af2.f().b(cv.a.j);
                if (af2.d() != null) {
                    af2.b(af2.d());
                    continue;
                }
                af2.b(new m(m.a.d, "Unknown error occurred."));
                continue;
            }
            af2.f().b(cv.a.i);
            af2.h();
        }
    }

    protected ez.g e() {
        ez.g g2;
        ez ez2 = this.g();
        ez2.a(this.h());
        ez2.a(cv.a.s);
        ez2.a(this.d);
        ez2.f(false);
        this.h().c(cv.a.f);
        this.h().a(cv.a.Y);
        try {
            g2 = ez2.c();
        }
        catch (ez.c c2) {
            m m2 = c2.a() != ez.f.a ? (c2.a() == ez.f.b ? new m(m.a.b, "Connection to Ad Server timed out") : new m(m.a.d, c2.getMessage())) : new m(m.a.a, "Could not contact Ad Server");
            throw new a(m2);
        }
        this.h().b(cv.a.g);
        return g2;
    }

    protected class a
    extends Exception {
        private final m b;

        public a(m m2) {
            this.b = m2;
        }

        public m a() {
            return this.b;
        }
    }

    protected static class b {
        protected b() {
        }

        public u a(aa aa2, Map<Integer, af> map) {
            return new u(aa2, map);
        }
    }

}

