/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.Flushable
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.google.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class c
implements Closeable,
Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    static {
        for (int i2 = 0; i2 <= 31; ++i2) {
            String[] arrstring = a;
            Object[] arrobject = new Object[]{i2};
            arrstring[i2] = String.format((String)"\\u%04x", (Object[])arrobject);
        }
        String[] arrstring = a;
        arrstring[34] = "\\\"";
        arrstring[92] = "\\\\";
        arrstring[9] = "\\t";
        arrstring[8] = "\\b";
        arrstring[10] = "\\n";
        arrstring[13] = "\\r";
        arrstring[12] = "\\f";
        String[] arrstring2 = b = (String[])arrstring.clone();
        arrstring2[60] = "\\u003c";
        arrstring2[62] = "\\u003e";
        arrstring2[38] = "\\u0026";
        arrstring2[61] = "\\u003d";
        arrstring2[39] = "\\u0027";
    }

    public c(Writer writer) {
        this.a(6);
        this.g = ":";
        this.k = true;
        if (writer != null) {
            this.c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private int a() {
        int n2 = this.e;
        if (n2 != 0) {
            return this.d[n2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private c a(int n2, int n3, String string) {
        int n4 = this.a();
        if (n4 != n3 && n4 != n2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j == null) {
            this.e = -1 + this.e;
            if (n4 == n3) {
                this.k();
            }
            this.c.write(string);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dangling name: ");
        stringBuilder.append(this.j);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private c a(int n2, String string) {
        this.m();
        this.a(n2);
        this.c.write(string);
        return this;
    }

    private void a(int n2) {
        int n3 = this.e;
        int[] arrn = this.d;
        if (n3 == arrn.length) {
            int[] arrn2 = new int[n3 * 2];
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n3);
            this.d = arrn2;
        }
        int[] arrn3 = this.d;
        int n4 = this.e;
        this.e = n4 + 1;
        arrn3[n4] = n2;
    }

    private void b(int n2) {
        this.d[-1 + this.e] = n2;
    }

    private void d(String string) {
        String[] arrstring = this.i ? b : a;
        this.c.write("\"");
        int n2 = string.length();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2;
            char c2 = string.charAt(i2);
            if (c2 < '') {
                string2 = arrstring[c2];
                if (string2 == null) {
                    continue;
                }
            } else if (c2 == '\u2028') {
                string2 = "\\u2028";
            } else {
                if (c2 != '\u2029') continue;
                string2 = "\\u2029";
            }
            if (n3 < i2) {
                this.c.write(string, n3, i2 - n3);
            }
            this.c.write(string2);
            n3 = i2 + 1;
        }
        if (n3 < n2) {
            this.c.write(string, n3, n2 - n3);
        }
        this.c.write("\"");
    }

    private void j() {
        if (this.j != null) {
            this.l();
            this.d(this.j);
            this.j = null;
        }
    }

    private void k() {
        if (this.f == null) {
            return;
        }
        this.c.write("\n");
        int n2 = this.e;
        for (int i2 = 1; i2 < n2; ++i2) {
            this.c.write(this.f);
        }
    }

    private void l() {
        block4 : {
            block3 : {
                int n2;
                block2 : {
                    n2 = this.a();
                    if (n2 != 5) break block2;
                    this.c.write(44);
                    break block3;
                }
                if (n2 != 3) break block4;
            }
            this.k();
            this.b(4);
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private void m() {
        switch (this.a()) {
            default: {
                throw new IllegalStateException("Nesting problem.");
            }
            case 7: {
                if (!this.h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            case 6: {
                this.b(7);
                return;
            }
            case 4: {
                this.c.append((CharSequence)this.g);
                this.b(5);
                return;
            }
            case 2: {
                this.c.append(',');
                this.k();
                return;
            }
            case 1: 
        }
        this.b(2);
        this.k();
    }

    public c a(long l2) {
        this.j();
        this.m();
        this.c.write(Long.toString((long)l2));
        return this;
    }

    public c a(Boolean bl2) {
        if (bl2 == null) {
            return this.f();
        }
        this.j();
        this.m();
        Writer writer = this.c;
        String string = bl2 != false ? "true" : "false";
        writer.write(string);
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            return this.f();
        }
        this.j();
        String string = number.toString();
        if (!this.h && (string.equals((Object)"-Infinity") || string.equals((Object)"Infinity") || string.equals((Object)"NaN"))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append((Object)number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.m();
        this.c.append((CharSequence)string);
        return this;
    }

    public c a(String string) {
        if (string != null) {
            if (this.j == null) {
                if (this.e != 0) {
                    this.j = string;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c a(boolean bl2) {
        this.j();
        this.m();
        Writer writer = this.c;
        String string = bl2 ? "true" : "false";
        writer.write(string);
        return this;
    }

    public c b() {
        this.j();
        return this.a(1, "[");
    }

    public c b(String string) {
        if (string == null) {
            return this.f();
        }
        this.j();
        this.m();
        this.d(string);
        return this;
    }

    public final void b(boolean bl2) {
        this.h = bl2;
    }

    public c c() {
        return this.a(1, 2, "]");
    }

    public final void c(String string) {
        if (string.length() == 0) {
            this.f = null;
            this.g = ":";
            return;
        }
        this.f = string;
        this.g = ": ";
    }

    public final void c(boolean bl2) {
        this.i = bl2;
    }

    public void close() {
        this.c.close();
        int n2 = this.e;
        if (n2 <= 1 && (n2 != 1 || this.d[n2 - 1] == 7)) {
            this.e = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() {
        this.j();
        return this.a(3, "{");
    }

    public final void d(boolean bl2) {
        this.k = bl2;
    }

    public c e() {
        return this.a(3, 5, "}");
    }

    public c f() {
        if (this.j != null) {
            if (this.k) {
                this.j();
            } else {
                this.j = null;
                return this;
            }
        }
        this.m();
        this.c.write("null");
        return this;
    }

    public void flush() {
        if (this.e != 0) {
            this.c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.k;
    }
}

