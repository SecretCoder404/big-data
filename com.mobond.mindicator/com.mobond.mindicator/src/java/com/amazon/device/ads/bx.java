/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

abstract class bx
implements Closeable {
    private static final String b = "bx";
    File a;
    private final cy c = new cz().a(b);

    bx() {
    }

    private void f() {
        Closeable closeable = this.d();
        if (closeable != null) {
            try {
                closeable.close();
                return;
            }
            catch (IOException iOException) {
                cy cy2 = this.c;
                Object[] arrobject = new Object[]{iOException.getMessage()};
                cy2.e("Could not close the stream. %s", arrobject);
            }
        }
    }

    public boolean a() {
        return this.a != null;
    }

    public boolean a(File file) {
        if (this.a()) {
            if (file.getAbsolutePath().equals((Object)this.a.getAbsolutePath())) {
                return true;
            }
            this.c.f("Another file is already set in this FileOutputHandler. Close the other file before opening a new one.");
            return false;
        }
        this.a = file;
        return true;
    }

    public boolean a(File file, String string) {
        return this.a(new File(file, string));
    }

    public boolean a(String string) {
        return this.a(new File(string));
    }

    public boolean b() {
        if (this.a()) {
            return this.a.exists();
        }
        throw new IllegalStateException("A file has not been set, yet.");
    }

    protected void c() {
        Closeable closeable = this.e();
        if (closeable != null) {
            try {
                closeable.close();
                return;
            }
            catch (IOException iOException) {
                cy cy2 = this.c;
                Object[] arrobject = new Object[]{closeable.getClass().getSimpleName(), iOException.getMessage()};
                cy2.e("Could not close the %s. %s", arrobject);
                this.f();
                return;
            }
        }
        this.f();
    }

    protected abstract Closeable d();

    protected abstract Closeable e();
}

