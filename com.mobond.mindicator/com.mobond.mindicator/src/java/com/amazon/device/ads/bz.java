/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedInputStream
 *  java.io.BufferedReader
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class bz
extends bx {
    private static final String b = "bz";
    private final cy c = new cz().a(b);
    private InputStream d;
    private BufferedReader e;

    bz() {
    }

    private void h() {
        if (this.e != null) {
            return;
        }
        throw new IllegalStateException("Could not read from the file because no file has been opened yet. Please set the file, then call open() before attempting to read.");
    }

    public void close() {
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

    public boolean f() {
        FileInputStream fileInputStream;
        if (this.a == null) {
            this.c.f("A file must be set before it can be opened.");
            return false;
        }
        if (this.d != null) {
            this.c.f("The file is already open.");
            return false;
        }
        try {
            fileInputStream = new FileInputStream(this.a);
        }
        catch (Exception exception) {
            return false;
        }
        this.d = new BufferedInputStream((InputStream)fileInputStream);
        this.e = new BufferedReader((Reader)new InputStreamReader(this.d));
        return true;
    }

    public String g() {
        this.h();
        try {
            String string = this.e.readLine();
            return string;
        }
        catch (IOException iOException) {
            this.c.f("Error reading line from file.");
            return null;
        }
    }
}

