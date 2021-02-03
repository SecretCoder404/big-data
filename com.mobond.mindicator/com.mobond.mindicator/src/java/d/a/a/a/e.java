/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Properties
 *  java.util.concurrent.Callable
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 */
package d.a.a.a;

import android.os.SystemClock;
import android.text.TextUtils;
import d.a.a.a.a.b.i;
import d.a.a.a.c;
import d.a.a.a.k;
import d.a.a.a.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class e
implements Callable<Map<String, k>> {
    final String a;

    e(String string) {
        this.a = string;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private k a(ZipEntry zipEntry, ZipFile zipFile) {
        void var9_12;
        InputStream inputStream;
        block9 : {
            void var3_15;
            block10 : {
                block8 : {
                    inputStream = zipFile.getInputStream(zipEntry);
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    String string = properties.getProperty("fabric-identifier");
                    String string2 = properties.getProperty("fabric-version");
                    String string3 = properties.getProperty("fabric-build-type");
                    if (TextUtils.isEmpty((CharSequence)string) || TextUtils.isEmpty((CharSequence)string2)) break block8;
                    k k2 = new k(string, string2, string3);
                    i.a((Closeable)inputStream);
                    return k2;
                }
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid format of fabric file,");
                    stringBuilder.append(zipEntry.getName());
                    throw new IllegalStateException(stringBuilder.toString());
                }
                catch (Throwable throwable) {
                    break block9;
                }
                catch (IOException iOException) {
                    break block10;
                }
                catch (Throwable throwable) {
                    inputStream = null;
                    break block9;
                }
                catch (IOException iOException) {
                    inputStream = null;
                }
            }
            l l2 = c.g();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error when parsing fabric properties ");
            stringBuilder.append(zipEntry.getName());
            l2.e("Fabric", stringBuilder.toString(), (Throwable)var3_15);
            i.a((Closeable)inputStream);
            return null;
        }
        i.a((Closeable)inputStream);
        throw var9_12;
    }

    private Map<String, k> c() {
        HashMap hashMap;
        hashMap = new HashMap();
        try {
            Class.forName((String)"com.google.android.gms.ads.g");
            k k2 = new k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put((Object)k2.a(), (Object)k2);
            c.g().b("Fabric", "Found kit: com.google.firebase.firebase-ads");
        }
        catch (Exception exception) {}
        return hashMap;
    }

    /*
     * Exception decompiling
     */
    private Map<String, k> d() {
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

    public Map<String, k> a() {
        HashMap hashMap = new HashMap();
        long l2 = SystemClock.elapsedRealtime();
        hashMap.putAll(this.c());
        hashMap.putAll(this.d());
        l l3 = c.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("finish scanning in ");
        stringBuilder.append(SystemClock.elapsedRealtime() - l2);
        l3.b("Fabric", stringBuilder.toString());
        return hashMap;
    }

    protected ZipFile b() {
        return new ZipFile(this.a);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

