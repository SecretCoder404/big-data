/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedOutputStream
 *  java.io.BufferedWriter
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.io.Writer
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

class ca
extends bx {
    private static final String b = "ca";
    private final cy c = new cz().a(b);
    private OutputStream d;
    private BufferedWriter e;
    private a f;

    ca() {
    }

    private void g() {
        if (this.e != null) {
            return;
        }
        throw new IllegalStateException("Could not write to the file because no file has been opened yet. Please set the file, then call open() before attempting to write.");
    }

    public void a(byte[] arrby) {
        this.g();
        this.d.write(arrby);
    }

    public boolean a(a a2) {
        FileOutputStream fileOutputStream;
        if (this.a == null) {
            this.c.f("A file must be set before it can be opened.");
            return false;
        }
        if (this.d != null) {
            this.c.f("The file is already open.");
            return false;
        }
        try {
            fileOutputStream = new FileOutputStream(this.a, a.a.equals((Object)a2));
        }
        catch (Exception exception) {
            return false;
        }
        this.f = a2;
        this.d = new BufferedOutputStream((OutputStream)fileOutputStream);
        this.e = new BufferedWriter((Writer)new OutputStreamWriter(this.d));
        return true;
    }

    public void b(String string) {
        this.g();
        this.e.write(string);
    }

    public void close() {
        this.f();
        this.c();
        this.e = null;
        this.d = null;
    }

    @Override
    protected Closeable d() {
        return this.d;
    }

    @Override
    protected Closeable e() {
        return this.e;
    }

    public void f() {
        BufferedWriter bufferedWriter;
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            try {
                outputStream.flush();
            }
            catch (IOException iOException) {
                cy cy2 = this.c;
                Object[] arrobject = new Object[]{iOException.getMessage()};
                cy2.e("Could not flush the OutputStream. %s", arrobject);
            }
        }
        if ((bufferedWriter = this.e) != null) {
            try {
                bufferedWriter.flush();
                return;
            }
            catch (IOException iOException) {
                cy cy3 = this.c;
                Object[] arrobject = new Object[]{iOException.getMessage()};
                cy3.e("Could not flush the BufferedWriter. %s", arrobject);
            }
        }
    }

}

