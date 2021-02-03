/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class co {
    public static int a(JSONArray jSONArray, int n2, int n3) {
        if (jSONArray.isNull(n2)) {
            return n3;
        }
        return jSONArray.optInt(n2, n3);
    }

    public static int a(JSONObject jSONObject, String string, int n2) {
        if (jSONObject.isNull(string)) {
            return n2;
        }
        return jSONObject.optInt(string, n2);
    }

    public static long a(JSONObject jSONObject, String string, long l2) {
        if (jSONObject.isNull(string)) {
            return l2;
        }
        return jSONObject.optLong(string, l2);
    }

    public static String a(JSONObject jSONObject, String string, String string2) {
        if (jSONObject.isNull(string)) {
            return string2;
        }
        return jSONObject.optString(string, string2);
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            String string2 = co.a(jSONObject, string, null);
            if (string2 == null) continue;
            hashMap.put((Object)string, (Object)string2);
        }
        return hashMap;
    }

    public static JSONArray a(JSONObject jSONObject, String string) {
        if (jSONObject.isNull(string)) {
            return null;
        }
        return jSONObject.optJSONArray(string);
    }

    public static JSONObject a(String string) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public static JSONObject a(JSONArray jSONArray, int n2) {
        if (jSONArray.isNull(n2)) {
            return null;
        }
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(n2);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public static boolean a(JSONObject jSONObject, String string, boolean bl2) {
        if (jSONObject.isNull(string)) {
            return bl2;
        }
        return jSONObject.optBoolean(string, bl2);
    }

    public static void b(JSONObject jSONObject, String string, int n2) {
        try {
            jSONObject.put(string, n2);
        }
        catch (JSONException jSONException) {}
    }

    public static void b(JSONObject jSONObject, String string, long l2) {
        try {
            jSONObject.put(string, l2);
        }
        catch (JSONException jSONException) {}
    }

    /*
     * Exception decompiling
     */
    public static void b(JSONObject var0, String var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public static void b(JSONObject jSONObject, String string, boolean bl2) {
        try {
            jSONObject.put(string, bl2);
        }
        catch (JSONException jSONException) {}
    }

    public static class a {
        public int a(JSONObject jSONObject, String string, int n2) {
            return co.a(jSONObject, string, n2);
        }

        public String a(JSONObject jSONObject, String string, String string2) {
            return co.a(jSONObject, string, string2);
        }

        public Map<String, String> a(JSONObject jSONObject) {
            return co.a(jSONObject);
        }

        public JSONObject a(String string) {
            return co.a(string);
        }

        public boolean a(JSONObject jSONObject, String string, boolean bl2) {
            return co.a(jSONObject, string, bl2);
        }

        public void b(JSONObject jSONObject, String string, int n2) {
            co.b(jSONObject, string, n2);
        }

        public void b(JSONObject jSONObject, String string, String string2) {
            co.b(jSONObject, string, string2);
        }

        public void b(JSONObject jSONObject, String string, boolean bl2) {
            co.b(jSONObject, string, bl2);
        }
    }

}

