/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.OutputStream
 *  java.lang.String
 *  java.util.zip.GZIPOutputStream
 */
package d.a.a.a.a.d;

import android.content.Context;
import d.a.a.a.a.d.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class g
extends h {
    public g(Context context, File file, String string, String string2) {
        super(context, file, string, string2);
    }

    @Override
    public OutputStream a(File file) {
        return new GZIPOutputStream((OutputStream)new FileOutputStream(file));
    }
}

