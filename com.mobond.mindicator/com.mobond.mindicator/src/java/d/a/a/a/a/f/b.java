/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.a.a.a.a.f;

import android.content.Context;
import d.a.a.a.a.f.a;
import d.a.a.a.c;
import d.a.a.a.i;
import java.io.File;

public class b
implements a {
    private final Context a;
    private final String b;
    private final String c;

    public b(i i2) {
        if (i2.getContext() != null) {
            this.a = i2.getContext();
            this.b = i2.getPath();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Android/");
            stringBuilder.append(this.a.getPackageName());
            this.c = stringBuilder.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Override
    public File a() {
        return this.a(this.a.getFilesDir());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    File a(File file) {
        if (file != null) {
            if (file.exists()) return file;
            if (file.mkdirs()) {
                return file;
            }
            c.g().d("Fabric", "Couldn't create file");
            return null;
        } else {
            c.g().a("Fabric", "Null File");
        }
        return null;
    }
}

