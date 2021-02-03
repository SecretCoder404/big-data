/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.AsyncTask
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URL
 */
package com.mobond.mindicator.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import com.mobond.mindicator.ConfigurationManager;
import com.mulo.b.b;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class a {

    public class a
    extends AsyncTask<URL, Integer, Integer> {
        private ProgressDialog a;
        final int b = 1;
        final int c = 2;
        final int d = 3;
        final int e = 4;
        final int f = 5;
        final int g = 6;
        final int h = 7;
        final int i = 8;
        final int j = 9;
        int k = 0;
        String l = null;
        boolean m = false;
        String n;
        String o;
        Boolean p;
        private Activity r;

        public a(Activity activity, String string, String string2, Boolean bl) {
            this.r = activity;
            if (activity == null) {
                this.p = false;
            }
            this.o = string2;
            this.n = string;
            this.p = bl;
            if (activity == null) {
                this.p = false;
            }
        }

        /*
         * Exception decompiling
         */
        protected /* varargs */ Integer a(URL ... var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl91 : ICONST_0 : trying to set 1 previously set to 0
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

        public void a() {
        }

        public void a(ProgressDialog progressDialog) {
            if (this.p.booleanValue()) {
                this.b();
                this.a = progressDialog;
            }
        }

        /*
         * Exception decompiling
         */
        protected void a(Integer var1) {
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

        public void a(String string) {
            ProgressDialog progressDialog = this.a;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.a.setMessage((CharSequence)string);
                return;
            }
            if (this.p.booleanValue()) {
                this.b(string);
            }
        }

        public void a(byte[] arrby) {
            String string = this.o;
            if (string.equals((Object)"mumbaidb") || string.equals((Object)"punedb")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(".zip");
                string = stringBuilder.toString();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(ConfigurationManager.b().getFilesDir(), string));
            fileOutputStream.write(arrby);
            fileOutputStream.close();
            this.k = 4;
        }

        protected /* varargs */ void a(Integer ... arrinteger) {
            if (!this.m) {
                if (arrinteger[0] == 5) {
                    this.a("Downloading database..");
                    return;
                }
                if (arrinteger[0] == 6) {
                    this.b();
                    this.b("Processing database..");
                    return;
                }
                if (arrinteger[0] == 9) {
                    int n2 = arrinteger[1];
                    int n3 = arrinteger[2] / 1024;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Downloading.. ");
                    stringBuilder.append(n2);
                    stringBuilder.append("% of ");
                    stringBuilder.append(n3);
                    stringBuilder.append("KB");
                    this.a(stringBuilder.toString());
                    return;
                }
                if (arrinteger[0] == 7) {
                    this.b();
                    this.b("Downloaded database is corrupted. Please download latter.");
                }
            }
        }

        public void b() {
            ProgressDialog progressDialog;
            if (this.p.booleanValue() && (progressDialog = this.a) != null && progressDialog.isShowing()) {
                this.a.dismiss();
            }
        }

        public void b(String string) {
            if (this.p.booleanValue()) {
                this.b();
                this.a = ProgressDialog.show((Context)this.r, null, (CharSequence)string, (boolean)true, (boolean)false);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
            return this.a((URL[])arrobject);
        }

        protected /* synthetic */ void onPostExecute(Object object) {
            this.a((Integer)object);
        }

        protected void onPreExecute() {
            if (this.p.booleanValue()) {
                ProgressDialog progressDialog = new ProgressDialog((Context)this.r);
                progressDialog.setMessage((CharSequence)"Checking update..");
                progressDialog.setButton(-2, (CharSequence)"Cancel", new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialogInterface, int n2) {
                        a.this.m = true;
                        dialogInterface.dismiss();
                        dialogInterface.cancel();
                    }
                });
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                this.a(progressDialog);
                progressDialog.show();
            }
        }

        protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
            this.a((Integer[])arrobject);
        }

    }

}

