/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.util;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.mobond.mindicator.fcm.a;

public class h {
    static String a = "mindicator";

    public static int a(String string, Activity activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_apk_version");
        String string2 = a.a(stringBuilder.toString());
        String string3 = h.b(string, activity);
        if (!string2.trim().equalsIgnoreCase("")) {
            if (string3 == "0") {
                string3 = "1";
            }
            int n2 = h.a(string2, string3);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("versionCompare return ");
            stringBuilder2.append(n2);
            Log.d((String)"checkupdate", (String)stringBuilder2.toString());
            return n2 == 1;
        }
        return 0;
    }

    public static int a(String string, String string2) {
        try {
            int n2 = Integer.parseInt((String)string);
            int n3 = Integer.parseInt((String)string2);
            return n2 > n3;
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static String a(Activity activity) {
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo("com.mobond.mindicator", 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(packageInfo.versionCode);
            String string = stringBuilder.toString();
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "0";
        }
    }

    /*
     * Exception decompiling
     */
    public static void a(String var0) {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String b(String string, Activity activity) {
        if (string.equalsIgnoreCase("mumbai")) {
            int n2;
            int n3;
            block7 : {
                try {
                    n2 = activity.getPackageManager().getPackageInfo((String)"com.mobond.mindicator", (int)0).versionCode;
                    boolean bl2 = h.c("com.mobond.mindicator.mumbai", activity);
                    n3 = 0;
                    if (!bl2) break block7;
                }
                catch (Exception exception) {
                    return "0";
                }
                n3 = activity.getPackageManager().getPackageInfo((String)"com.mobond.mindicator.mumbai", (int)0).versionCode;
            }
            if (n2 <= n3) return String.valueOf((int)n3);
            return String.valueOf((int)n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.mobond.mindicator.");
        stringBuilder.append(string.toLowerCase());
        String string2 = stringBuilder.toString();
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(string2, 0);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(packageInfo.versionCode);
            return stringBuilder2.toString();
        }
        catch (Exception exception) {
            return "0";
        }
    }

    public static boolean c(String string, Activity activity) {
        try {
            activity.getPackageManager().getPackageInfo(string, 1);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

