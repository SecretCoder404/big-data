/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package com.google.b;

import com.google.b.aa;
import com.google.b.d;
import com.google.b.e;
import com.google.b.g;
import com.google.b.l;
import com.google.b.p;
import com.google.b.y;
import com.google.b.z;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class g
extends d {
    private static final Logger a = Logger.getLogger((String)g.class.getName());
    private static final boolean b = y.a();
    private static final long c = y.c();

    private g() {
    }

    public static int a(long l2) {
        return g.b(l2);
    }

    public static int a(e e2) {
        return g.g(e2.b());
    }

    public static int a(p p2) {
        return g.g(p2.e());
    }

    /*
     * Exception decompiling
     */
    public static int a(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl10 : ILOAD_1 : trying to set 1 previously set to 0
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

    public static int a(boolean bl2) {
        return 1;
    }

    public static g a(byte[] arrby) {
        return g.b(arrby, 0, arrby.length);
    }

    public static int b(int n2) {
        return g.d(aa.a(n2, 0));
    }

    public static int b(int n2, e e2) {
        return g.b(n2) + g.a(e2);
    }

    public static int b(int n2, p p2) {
        return g.b(n2) + g.a(p2);
    }

    public static int b(int n2, String string) {
        return g.b(n2) + g.a(string);
    }

    public static int b(int n2, boolean bl2) {
        return g.b(n2) + g.a(bl2);
    }

    public static int b(long l2) {
        int n2;
        if ((-128L & l2) == 0L) {
            return 1;
        }
        if (l2 < 0L) {
            return 10;
        }
        if ((-34359738368L & l2) != 0L) {
            n2 = 6;
            l2 >>>= 28;
        } else {
            n2 = 2;
        }
        if ((-2097152L & l2) != 0L) {
            n2 += 2;
            l2 >>>= 14;
        }
        if ((l2 & -16384L) != 0L) {
            ++n2;
        }
        return n2;
    }

    public static g b(byte[] arrby, int n2, int n3) {
        return new a(arrby, n2, n3);
    }

    public static int c(int n2) {
        if (n2 >= 0) {
            return g.d(n2);
        }
        return 10;
    }

    public static int c(long l2) {
        return 8;
    }

    static /* synthetic */ boolean c() {
        return b;
    }

    public static int d(int n2) {
        if ((n2 & -128) == 0) {
            return 1;
        }
        if ((n2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & n2) == 0) {
            return 3;
        }
        if ((n2 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int d(int n2, long l2) {
        return g.b(n2) + g.a(l2);
    }

    static /* synthetic */ long d() {
        return c;
    }

    public static int e(int n2) {
        return 4;
    }

    public static int e(int n2, int n3) {
        return g.b(n2) + g.c(n3);
    }

    public static int e(int n2, long l2) {
        return g.b(n2) + g.b(l2);
    }

    public static int f(int n2) {
        return g.c(n2);
    }

    public static int f(int n2, int n3) {
        return g.b(n2) + g.e(n3);
    }

    public static int f(int n2, long l2) {
        return g.b(n2) + g.c(l2);
    }

    static int g(int n2) {
        return n2 + g.d(n2);
    }

    public static int g(int n2, int n3) {
        return g.b(n2) + g.f(n3);
    }

    public abstract int a();

    public abstract void a(int var1);

    public abstract void a(int var1, int var2);

    public final void a(int n2, long l2) {
        this.b(n2, l2);
    }

    public abstract void a(int var1, e var2);

    public abstract void a(int var1, p var2);

    public abstract void a(int var1, String var2);

    public abstract void a(int var1, boolean var2);

    final void a(String string, z.c c2) {
        a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)c2);
        byte[] arrby = string.getBytes(l.a);
        try {
            this.a(arrby.length);
            this.a(arrby, 0, arrby.length);
            return;
        }
        catch (b b2) {
            throw b2;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new IOException(indexOutOfBoundsException){
                {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
                    stringBuilder.append(string);
                    super(stringBuilder.toString(), throwable);
                }
            };
        }
    }

    @Override
    public abstract void a(byte[] var1, int var2, int var3);

    public final void b() {
        if (this.a() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract void b(int var1, int var2);

    public abstract void b(int var1, long var2);

    public abstract void c(int var1, int var2);

    public abstract void c(int var1, long var2);

    public final void d(int n2, int n3) {
        this.b(n2, n3);
    }

    private static class a
    extends g {
        private final byte[] a;
        private final int b;
        private final int c;
        private int d;

        a(byte[] arrby, int n2, int n3) {
            super();
            if (arrby != null) {
                int n4 = n2 | n3;
                int n5 = arrby.length;
                int n6 = n2 + n3;
                if ((n4 | n5 - n6) >= 0) {
                    this.a = arrby;
                    this.b = n2;
                    this.d = n2;
                    this.c = n6;
                    return;
                }
                Object[] arrobject = new Object[]{arrby.length, n2, n3};
                throw new IllegalArgumentException(String.format((String)"Array range is invalid. Buffer.length=%d, offset=%d, length=%d", (Object[])arrobject));
            }
            throw new NullPointerException("buffer");
        }

        @Override
        public final int a() {
            return this.c - this.d;
        }

        public final void a(byte by2) {
            try {
                byte[] arrby = this.a;
                int n2 = this.d;
                this.d = n2 + 1;
                arrby[n2] = by2;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                Object[] arrobject = new Object[]{this.d, this.c, 1};
                throw new /* invalid duplicate definition of identical inner class */;
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public final void a(int var1_1) {
            if (g.c() && this.a() >= 10) {
                var8_2 = g.d() + (long)this.d;
                do {
                    if ((var1_1 & -128) == 0) {
                        y.a(this.a, var8_2, (byte)var1_1);
                        this.d = 1 + this.d;
                        return;
                    }
                    var10_3 = this.a;
                    var11_4 = 1L + var8_2;
                    y.a(var10_3, var8_2, (byte)(128 | var1_1 & 127));
                    this.d = 1 + this.d;
                    var1_1 >>>= 7;
                    var8_2 = var11_4;
                } while (true);
            }
            do {
                if ((var1_1 & -128) != 0) ** GOTO lbl23
                try {
                    var6_7 = this.a;
                    var7_8 = this.d;
                    this.d = var7_8 + 1;
                    var6_7[var7_8] = (byte)var1_1;
                    return;
lbl23: // 1 sources:
                    var4_5 = this.a;
                    var5_6 = this.d;
                    this.d = var5_6 + 1;
                    var4_5[var5_6] = (byte)(128 | var1_1 & 127);
                    var1_1 >>>= 7;
                }
                catch (IndexOutOfBoundsException var2_9) {
                    var3_10 = new Object[]{this.d, this.c, 1};
                    throw new /* invalid duplicate definition of identical inner class */;
                }
            } while (true);
        }

        @Override
        public final void a(int n2, int n3) {
            this.a(aa.a(n2, n3));
        }

        @Override
        public final void a(int n2, e e2) {
            this.a(n2, 2);
            this.b(e2);
        }

        @Override
        public final void a(int n2, p p2) {
            this.a(n2, 2);
            this.b(p2);
        }

        @Override
        public final void a(int n2, String string) {
            this.a(n2, 2);
            this.b(string);
        }

        @Override
        public final void a(int n2, boolean bl2) {
            this.a(n2, 0);
            this.a((byte)(bl2 ? 1 : 0));
        }

        @Override
        public final void a(byte[] arrby, int n2, int n3) {
            this.c(arrby, n2, n3);
        }

        @Override
        public final void b(int n2, int n3) {
            this.a(n2, 0);
            this.h(n3);
        }

        @Override
        public final void b(int n2, long l2) {
            this.a(n2, 0);
            this.d(l2);
        }

        public final void b(e e2) {
            this.a(e2.b());
            e2.a(this);
        }

        public final void b(p p2) {
            this.a(p2.e());
            p2.a(this);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void b(String string) {
            int n2 = this.d;
            try {
                int n3 = a.d(3 * string.length());
                int n4 = a.d(string.length());
                if (n4 == n3) {
                    this.d = n2 + n4;
                    int n5 = z.a(string, this.a, this.d, this.a());
                    this.d = n2;
                    this.a(n5 - n2 - n4);
                    this.d = n5;
                    return;
                }
                this.a(z.a(string));
                this.d = z.a(string, this.a, this.d, this.a());
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new /* invalid duplicate definition of identical inner class */;
            }
            catch (z.c c2) {
                this.d = n2;
                this.a(string, c2);
                return;
            }
        }

        @Override
        public final void c(int n2, int n3) {
            this.a(n2, 5);
            this.i(n3);
        }

        @Override
        public final void c(int n2, long l2) {
            this.a(n2, 1);
            this.e(l2);
        }

        public final void c(byte[] arrby, int n2, int n3) {
            try {
                System.arraycopy((Object)arrby, (int)n2, (Object)this.a, (int)this.d, (int)n3);
                this.d = n3 + this.d;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                Object[] arrobject = new Object[]{this.d, this.c, n3};
                throw new /* invalid duplicate definition of identical inner class */;
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final void d(long var1_1) {
            if (g.c() && this.a() >= 10) {
                var9_2 = g.d() + (long)this.d;
                do {
                    if ((var1_1 & -128L) == 0L) {
                        y.a(this.a, var9_2, (byte)var1_1);
                        this.d = 1 + this.d;
                        return;
                    }
                    var11_3 = this.a;
                    var12_4 = 1L + var9_2;
                    y.a(var11_3, var9_2, (byte)(128 | 127 & (int)var1_1));
                    this.d = 1 + this.d;
                    var1_1 >>>= 7;
                    var9_2 = var12_4;
                } while (true);
            }
            do {
                if ((var1_1 & -128L) != 0L) ** GOTO lbl23
                try {
                    var7_7 = this.a;
                    var8_8 = this.d;
                    this.d = var8_8 + 1;
                    var7_7[var8_8] = (byte)var1_1;
                    return;
lbl23: // 1 sources:
                    var5_5 = this.a;
                    var6_6 = this.d;
                    this.d = var6_6 + 1;
                    var5_5[var6_6] = (byte)(128 | 127 & (int)var1_1);
                    var1_1 >>>= 7;
                }
                catch (IndexOutOfBoundsException var3_9) {
                    var4_10 = new Object[]{this.d, this.c, 1};
                    throw new /* invalid duplicate definition of identical inner class */;
                }
            } while (true);
        }

        public final void e(long l2) {
            try {
                byte[] arrby = this.a;
                int n2 = this.d;
                this.d = n2 + 1;
                arrby[n2] = (byte)(255 & (int)l2);
                byte[] arrby2 = this.a;
                int n3 = this.d;
                this.d = n3 + 1;
                arrby2[n3] = (byte)(255 & (int)(l2 >> 8));
                byte[] arrby3 = this.a;
                int n4 = this.d;
                this.d = n4 + 1;
                arrby3[n4] = (byte)(255 & (int)(l2 >> 16));
                byte[] arrby4 = this.a;
                int n5 = this.d;
                this.d = n5 + 1;
                arrby4[n5] = (byte)(255 & (int)(l2 >> 24));
                byte[] arrby5 = this.a;
                int n6 = this.d;
                this.d = n6 + 1;
                arrby5[n6] = (byte)(255 & (int)(l2 >> 32));
                byte[] arrby6 = this.a;
                int n7 = this.d;
                this.d = n7 + 1;
                arrby6[n7] = (byte)(255 & (int)(l2 >> 40));
                byte[] arrby7 = this.a;
                int n8 = this.d;
                this.d = n8 + 1;
                arrby7[n8] = (byte)(255 & (int)(l2 >> 48));
                byte[] arrby8 = this.a;
                int n9 = this.d;
                this.d = n9 + 1;
                arrby8[n9] = (byte)(255 & (int)(l2 >> 56));
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                Object[] arrobject = new Object[]{this.d, this.c, 1};
                throw new /* invalid duplicate definition of identical inner class */;
            }
        }

        public final void h(int n2) {
            if (n2 >= 0) {
                this.a(n2);
                return;
            }
            this.d(n2);
        }

        public final void i(int n2) {
            try {
                byte[] arrby = this.a;
                int n3 = this.d;
                this.d = n3 + 1;
                arrby[n3] = (byte)(n2 & 255);
                byte[] arrby2 = this.a;
                int n4 = this.d;
                this.d = n4 + 1;
                arrby2[n4] = (byte)(255 & n2 >> 8);
                byte[] arrby3 = this.a;
                int n5 = this.d;
                this.d = n5 + 1;
                arrby3[n5] = (byte)(255 & n2 >> 16);
                byte[] arrby4 = this.a;
                int n6 = this.d;
                this.d = n6 + 1;
                arrby4[n6] = (byte)(255 & n2 >> 24);
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                Object[] arrobject = new Object[]{this.d, this.c, 1};
                throw new /* invalid duplicate definition of identical inner class */;
            }
        }
    }

}

