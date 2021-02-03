/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Enumeration
 *  java.util.Hashtable
 *  java.util.zip.GZIPOutputStream
 */
package com.mulo.b;

import com.mulo.b.j;
import com.mulo.util.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.zip.GZIPOutputStream;

public class h {
    private Hashtable<String, String> a = new Hashtable();

    Hashtable<String, String> a() {
        return this.a;
    }

    public void a(String string, String string2) {
        if (string != null && string2 != null && string.indexOf(32) == -1 && string.indexOf(38) == -1) {
            this.a.put((Object)string, (Object)string2);
            return;
        }
        throw new IllegalArgumentException("Parameter key contains space or '&'  OR  Key or Value is null.");
    }

    String b() {
        StringBuilder stringBuilder = new StringBuilder();
        Enumeration enumeration = this.a.keys();
        boolean bl = true;
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            String string2 = j.a((String)this.a.get((Object)string));
            if (!bl) {
                stringBuilder.append('&');
            }
            stringBuilder.append(string);
            stringBuilder.append("=");
            stringBuilder.append(string2);
            bl = false;
        }
        return stringBuilder.toString();
    }

    public String c() {
        try {
            String string = this.b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)byteArrayOutputStream);
            gZIPOutputStream.write(string.getBytes());
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            String string2 = a.a(byteArrayOutputStream.toByteArray());
            return string2;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

