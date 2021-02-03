/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.a.m
 *  com.google.a.n
 *  com.google.a.t
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.a.b;

import com.google.a.b.a.n;
import com.google.a.d.b;
import com.google.a.d.c;
import com.google.a.d.d;
import com.google.a.m;
import com.google.a.t;
import com.google.a.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class l {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static com.google.a.l a(com.google.a.d.a a2) {
        boolean bl2;
        try {
            try {
                a2.f();
            }
            catch (EOFException eOFException) {
                bl2 = true;
            }
            try {
                return n.X.b(a2);
            }
            catch (EOFException eOFException) {
                bl2 = false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new t((Throwable)numberFormatException);
        }
        catch (IOException iOException) {
            throw new m((Throwable)iOException);
        }
        catch (d d2) {
            throw new t((Throwable)((Object)d2));
        }
        if (!bl2) void var1_4;
        throw new t((Throwable)var1_4);
        return com.google.a.n.a;
    }

    public static Writer a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer)appendable;
        }
        return new a(appendable);
    }

    public static void a(com.google.a.l l2, c c2) {
        n.X.a(c2, l2);
    }

    private static final class com.google.a.b.l$a
    extends Writer {
        private final Appendable a;
        private final a b = new a();

        com.google.a.b.l$a(Appendable appendable) {
            this.a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int n2) {
            this.a.append((char)n2);
        }

        public void write(char[] arrc, int n2, int n3) {
            a a2 = this.b;
            a2.a = arrc;
            this.a.append((CharSequence)a2, n2, n3 + n2);
        }

        static class a
        implements CharSequence {
            char[] a;

            a() {
            }

            public char charAt(int n2) {
                return this.a[n2];
            }

            public int length() {
                return this.a.length;
            }

            public CharSequence subSequence(int n2, int n3) {
                return new String(this.a, n2, n3 - n2);
            }
        }

    }

}

