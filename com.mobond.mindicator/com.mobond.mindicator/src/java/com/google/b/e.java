/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.e$1
 *  com.google.b.e$b
 *  com.google.b.e$g
 *  com.google.b.g
 *  java.io.Serializable
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Byte
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.util.Iterator
 */
package com.google.b;

import com.google.b.e;
import com.google.b.f;
import com.google.b.l;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/*
 * Exception performing whole class analysis.
 */
public abstract class e
implements Serializable,
Iterable<Byte> {
    public static final e a;
    static final /* synthetic */ boolean b;
    private static final c c;
    private int d;

    /*
     * Exception decompiling
     */
    static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl21 : ILOAD_1 : trying to set 1 previously set to 0
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

    e() {
        this.d = 0;
    }

    public static e a(String string) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static e a(byte[] arrby) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public static e a(byte[] arrby, int n2, int n3) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static int b(int n2, int n3, int n4) {
        int n5 = n3 - n2;
        if ((n5 | (n2 | n3) | n4 - n3) < 0) {
            if (n2 >= 0) {
                if (n3 < n2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Beginning index larger than ending index: ");
                    stringBuilder.append(n2);
                    stringBuilder.append(", ");
                    stringBuilder.append(n3);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("End index: ");
                stringBuilder.append(n3);
                stringBuilder.append(" >= ");
                stringBuilder.append(n4);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(n2);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n5;
    }

    static e b(int n2) {
        return new e(n2, null);
    }

    static e b(byte[] arrby, int n2, int n3) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static void b(int n2, int n3) {
        if ((n2 | n3 - (n2 + 1)) < 0) {
            if (n2 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Index < 0: ");
                stringBuilder.append(n2);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index > length: ");
            stringBuilder.append(n2);
            stringBuilder.append(", ");
            stringBuilder.append(n3);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public abstract byte a(int var1);

    protected abstract int a(int var1, int var2, int var3);

    public final d a() {
        return new 1(this);
    }

    public abstract e a(int var1, int var2);

    public final String a(Charset charset) {
        if (this.b() == 0) {
            return "";
        }
        return this.b(charset);
    }

    abstract void a(com.google.b.d var1);

    public abstract int b();

    protected abstract String b(Charset var1);

    public abstract f c();

    protected final int d() {
        return this.d;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n2 = this.d;
        if (n2 == 0) {
            int n3 = this.b();
            n2 = this.a(n3, 0, n3);
            if (n2 == 0) {
                n2 = 1;
            }
            this.d = n2;
        }
        return n2;
    }

    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    public final String toString() {
        Object[] arrobject = new Object[]{Integer.toHexString((int)System.identityHashCode((Object)this)), this.b()};
        return String.format((String)"<ByteString@%s size=%d>", (Object[])arrobject);
    }

    private static interface c {
        public byte[] a(byte[] var1, int var2, int var3);
    }

    public static interface d
    extends Iterator<Byte> {
    }

    /*
     * Exception performing whole class analysis.
     */
    static final class e {
        private final com.google.b.g a;
        private final byte[] b;

        private e(int n2) {
            this.b = new byte[n2];
            this.a = com.google.b.g.a((byte[])this.b);
        }

        /* synthetic */ e(int n2, 1 var2_2) {
            this(n2);
        }

        public e a() {
            this.a.b();
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public com.google.b.g b() {
            return this.a;
        }
    }

}

