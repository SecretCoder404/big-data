/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Iterator
 */
package a.a.a.a;

import a.a.a.a.a;
import a.a.a.a.b;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class c
implements Closeable,
Iterable<String[]> {
    b a;
    int b;
    private BufferedReader c;
    private boolean d;
    private boolean e;

    public c(Reader reader) {
        this(reader, ',', '\"', '\\');
    }

    public c(Reader reader, char c2, char c3, char c4) {
        this(reader, c2, c3, c4, 0, false);
    }

    public c(Reader reader, char c2, char c3, char c4, int n2, boolean bl2) {
        this(reader, c2, c3, c4, n2, bl2, true);
    }

    public c(Reader reader, char c2, char c3, char c4, int n2, boolean bl2, boolean bl3) {
        b b2 = new b(c2, c3, c4, bl2, bl3);
        this(reader, n2, b2);
    }

    public c(Reader reader, int n2, b b2) {
        this.d = true;
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
        this.c = bufferedReader;
        this.b = n2;
        this.a = b2;
    }

    private String b() {
        String string;
        if (!this.e) {
            for (int i2 = 0; i2 < this.b; ++i2) {
                this.c.readLine();
            }
            this.e = true;
        }
        if ((string = this.c.readLine()) == null) {
            this.d = false;
        }
        if (this.d) {
            return string;
        }
        return null;
    }

    public String[] a() {
        String[] arrstring = null;
        do {
            String string = this.b();
            if (!this.d) {
                return arrstring;
            }
            String[] arrstring2 = this.a.a(string);
            if (arrstring2.length <= 0) continue;
            if (arrstring == null) {
                arrstring = arrstring2;
                continue;
            }
            String[] arrstring3 = new String[arrstring.length + arrstring2.length];
            System.arraycopy((Object)arrstring, (int)0, (Object)arrstring3, (int)0, (int)arrstring.length);
            System.arraycopy((Object)arrstring2, (int)0, (Object)arrstring3, (int)arrstring.length, (int)arrstring2.length);
            arrstring = arrstring3;
        } while (this.a.a());
        return arrstring;
    }

    public void close() {
        this.c.close();
    }

    public Iterator<String[]> iterator() {
        try {
            a a2 = new a(this);
            return a2;
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }
}

