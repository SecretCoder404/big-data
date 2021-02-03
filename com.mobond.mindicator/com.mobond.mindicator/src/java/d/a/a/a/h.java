/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 */
package d.a.a.a;

import d.a.a.a.a.b.w;
import d.a.a.a.a.c.e;
import d.a.a.a.a.c.f;
import d.a.a.a.g;
import d.a.a.a.i;

class h<Result>
extends f<Void, Void, Result> {
    final i<Result> a;

    public h(i<Result> i2) {
        this.a = i2;
    }

    private w a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.getIdentifier());
        stringBuilder.append(".");
        stringBuilder.append(string);
        w w2 = new w(stringBuilder.toString(), "KitInitialization");
        w2.a();
        return w2;
    }

    protected /* varargs */ Result a(Void ... arrvoid) {
        w w2 = this.a("doInBackground");
        Result Result = !this.d() ? (Result)this.a.doInBackground() : null;
        w2.b();
        return Result;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    @Override
    protected void a(Result Result) {
        this.a.onPostExecute(Result);
        this.a.initializationCallback.a(Result);
    }

    @Override
    protected void b(Result Result) {
        this.a.onCancelled(Result);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.getIdentifier());
        stringBuilder.append(" Initialization was cancelled");
        g g2 = new g(stringBuilder.toString());
        this.a.initializationCallback.a((Exception)((Object)g2));
    }

    @Override
    public e getPriority() {
        return e.c;
    }
}

