/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.os.AsyncTask
 *  android.util.Log
 *  androidx.core.app.e
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URL
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 */
package com.mobond.mindicator.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mobond.mindicator.util.a;
import com.mulo.b.c;
import com.mulo.util.b;
import com.mulo.util.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class OnlineDbUpdateService
extends androidx.core.app.e {
    public static final String j = new String(IRParser.Base64.decode("bXR3Mg=="));
    public InputStream k;
    public InputStream l;
    public InputStream m;
    public int n;

    public static void a(Context context, Intent intent) {
        OnlineDbUpdateService.a((Context)context, OnlineDbUpdateService.class, (int)1001, (Intent)intent);
    }

    public static void a(String string) {
        Log.d((String)"OnlineDbUpdateService", (String)string);
    }

    public static void b(String string) {
        com.mobond.mindicator.a.a(ConfigurationManager.b().getApplicationContext()).b("irparserdb", string);
    }

    private void f() {
        String string = com.mobond.mindicator.a.a(ConfigurationManager.b().getApplicationContext()).a("irparserdb", null);
        if (string == null) {
            this.n = 2019041601;
            return;
        }
        int n2 = Integer.parseInt((String)string);
        if (2019041601 > n2) {
            this.n = 2019041601;
            return;
        }
        this.n = n2;
    }

    public int a(Context context, String string) {
        if (!string.equals((Object)"mumbaidb") && !string.equals((Object)"punedb")) {
            this.l = context != null ? context.getResources().getAssets().open(string) : this.getApplicationContext().getResources().getAssets().open(string);
            byte[] arrby = new byte[4];
            this.l.read(arrby, 0, 4);
            return b.c(arrby, 0);
        }
        return Integer.parseInt((String)"20210102");
    }

    /*
     * Exception decompiling
     */
    public InputStream a(Context var1, String var2, String var3) {
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

    protected void a(Intent intent) {
        this.e();
        this.stopSelf();
    }

    public int b(Context context, String string) {
        if (!string.equals((Object)"mumbaidb") && !string.equals((Object)"punedb")) {
            File file = new File(context.getFilesDir(), string);
            if (file.exists()) {
                this.m = new FileInputStream(file);
                byte[] arrby = new byte[4];
                this.m.read(arrby, 0, 4);
                return b.c(arrby, 0);
            }
            return 0;
        }
        File file = context.getFilesDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(".zip");
        File file2 = new File(file, stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("file path ");
        stringBuilder2.append(file2.getPath());
        Log.d((String)"444444", (String)stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("file.getTotalSpace() ");
        stringBuilder3.append(file2.length());
        Log.d((String)"444444", (String)stringBuilder3.toString());
        if (file2.exists()) {
            try {
                ZipFile zipFile = new ZipFile(file2.getPath());
                String string2 = e.b(zipFile.getInputStream(zipFile.getEntry("version.txt")));
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("version : ");
                stringBuilder4.append(string2.trim());
                Log.d((String)"444444", (String)stringBuilder4.toString());
                int n2 = Integer.parseInt((String)string2.trim());
                return n2;
            }
            catch (Exception exception) {
                file2.delete();
                throw exception;
            }
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"StaticFieldLeak"})
    public void e() {
        block11 : {
            if (!c.a((Context)this)) break block11;
            ** for (var5_6 : new String[]{"policedb", "irparserdb", OnlineDbUpdateService.j, "mumbaidb", "punedb"})
lbl-1000: // 1 sources:
            {
                var6_7 = new StringBuilder();
                var6_7.append(var5_6);
                var6_7.append("_version");
                var10_10 = var6_7.toString();
                var11_11 = new StringBuilder();
                var11_11.append(var5_6);
                var11_11.append("_url");
                var14_12 = com.mobond.mindicator.fcm.a.a(var11_11.toString());
                var15_13 = new StringBuilder();
                var15_13.append("xxxx initiate db called ");
                var15_13.append(var10_10);
                var15_13.append(" ");
                var15_13.append(var14_12);
                var15_13.append(" ");
                var15_13.append(var5_6);
                var15_13.append(" ");
                var15_13.append(this.n);
                OnlineDbUpdateService.a(var15_13.toString());
                if (var5_6.equals((Object)"irparserdb")) {
                    this.f();
                } else {
                    this.a((Context)this, var5_6, var5_6);
                }
                var25_14 = this.k;
                if (var25_14 == null) ** GOTO lbl36
                try {
                    this.k.close();
                }
                catch (Exception v0) {}
                try {
                    this.k = null;
lbl36: // 2 sources:
                    if ((var26_15 = com.mobond.mindicator.fcm.a.a(var10_10)) == null || var26_15.isEmpty()) continue;
                    var27_16 = Integer.parseInt((String)var26_15);
                    var28_17 = new StringBuilder();
                    var28_17.append("xxxx firebase_db_version");
                    var28_17.append(var27_16);
                    var28_17.append(" dbPath ");
                    var28_17.append(var5_6);
                    OnlineDbUpdateService.a(var28_17.toString());
                    if (var27_16 <= this.n) continue;
                    var33_4 = new StringBuilder();
                    var33_4.append("xxxx starting download firebase_db_download_url: ");
                    var33_4.append(var14_12);
                    OnlineDbUpdateService.a(var33_4.toString());
                    var36_5 = new a();
                    var36_5.getClass();
                    var38_8 = new a.a(var36_5, null, var14_12, var5_6, false){
                        {
                            a2.getClass();
                            super(a2, activity, string, string2, bl);
                        }

                        /*
                         * Exception decompiling
                         */
                        @Override
                        public void a() {
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
                    };
                    var38_8.execute((Object[])new URL[0]);
                }
                catch (Exception var7_9) {
                    var7_9.printStackTrace();
                }
                continue;
                {
                    catch (Exception var1_18) {
                        var1_18.printStackTrace();
                        break;
                    }
                }
            }
        }
    }

}

