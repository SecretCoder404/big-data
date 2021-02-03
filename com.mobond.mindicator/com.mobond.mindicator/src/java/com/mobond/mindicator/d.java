/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator;

import android.content.Context;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {
    b a;
    int b;
    private String c;

    /*
     * Exception decompiling
     */
    public d(Context var1, String var2, int var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl77 : RETURN : trying to set 0 previously set to 1
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

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                if (jSONObject2.has(string)) {
                    String string2 = jSONObject2.getString(string);
                    boolean bl2 = jSONObject.getString(string).equals((Object)string2);
                    if (bl2) continue;
                    return false;
                }
                return false;
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Exception decompiling
     */
    public JSONArray a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl25 : NEW : trying to set 0 previously set to 1
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Context context, int n2) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int n3;
        this.a = a.a(context);
        try {
            jSONArray = this.a();
            jSONArray2 = new JSONArray();
            n3 = 0;
        }
        catch (Exception exception) {
            this.a.d(this.c);
            return;
        }
        do {
            if (n3 >= jSONArray.length()) {
                this.a.b(this.c, jSONArray2.toString());
                return;
            }
            if (n3 != n2) {
                jSONArray2.put(jSONArray.get(n3));
            }
            ++n3;
        } while (true);
    }

    public void a(JSONObject jSONObject) {
        JSONArray jSONArray = this.a();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put((Object)jSONObject);
        for (int i2 = 0; i2 < jSONArray.length() && jSONArray2.length() < this.b; ++i2) {
            if (this.a((JSONObject)jSONArray.get(i2), jSONObject)) continue;
            jSONArray2.put(jSONArray.get(i2));
        }
        this.a.b(this.c, jSONArray2.toString());
    }

    public void b() {
        this.a.d(this.c);
    }
}

