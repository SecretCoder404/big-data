/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.bp
 *  com.amazon.device.ads.bz
 *  com.amazon.device.ads.ca
 *  com.amazon.device.ads.cy
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bp;
import com.amazon.device.ads.by;
import com.amazon.device.ads.bz;
import com.amazon.device.ads.ca;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

class be {
    protected static be d = new be(cx.a(), (by)new bp());
    private static final String e = "be";
    protected final Object a;
    protected final Set<String> b;
    protected final Set<String> c;
    private final by f;
    private ca g;
    private bz h;
    private final cx i;
    private final cy j = new cz().a(e);

    protected be(cx cx2, by by2) {
        this.i = cx2;
        this.f = by2;
        this.a = new Object();
        this.b = Collections.synchronizedSet((Set)new HashSet());
        this.c = Collections.synchronizedSet((Set)new HashSet());
    }

    public static be a() {
        return d;
    }

    private boolean d() {
        if (this.g == null) {
            File file = this.i.j();
            if (file == null) {
                this.j.f("No files directory has been set.");
                return false;
            }
            this.g = this.f.b(file, "AppEventsJsonFile");
        }
        ca ca2 = this.g;
        boolean bl2 = false;
        if (ca2 != null) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean e() {
        if (this.h == null) {
            File file = this.i.j();
            if (file == null) {
                this.j.f("No files directory has been set.");
                return false;
            }
            this.h = this.f.a(file, "AppEventsJsonFile");
        }
        bz bz2 = this.h;
        boolean bl2 = false;
        if (bz2 != null) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONArray b() {
        Object object;
        if (!this.e()) {
            this.j.f("Error creating file input handler.");
            return null;
        }
        Object object2 = object = this.a;
        synchronized (object2) {
            String string;
            if (!this.h.b()) {
                return null;
            }
            if (!this.h.f()) {
                this.j.f("App Events File could not be opened.");
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            while ((string = this.h.g()) != null) {
                JSONObject jSONObject = co.a(string);
                if (jSONObject == null) {
                    this.c();
                    this.h.close();
                    return null;
                }
                jSONArray.put((Object)jSONObject);
                this.c.add((Object)jSONObject.toString());
            }
            this.h.close();
            if (jSONArray.length() > 0) {
                return jSONArray;
            }
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    public void c() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl80 : ALOAD_0 : trying to set 1 previously set to 0
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
}

