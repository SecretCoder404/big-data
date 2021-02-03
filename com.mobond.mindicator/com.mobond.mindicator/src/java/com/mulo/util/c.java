/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Environment
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mulo.util;

import android.os.Environment;
import java.io.File;

public class c {
    public static String a(String string) {
        File file = Environment.getExternalStorageDirectory();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getAbsolutePath());
        stringBuilder.append("/");
        stringBuilder.append("indicator");
        stringBuilder.append("/");
        stringBuilder.append(string);
        stringBuilder.append("/");
        String string2 = stringBuilder.toString();
        File file2 = new File(string2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return string2;
    }
}

