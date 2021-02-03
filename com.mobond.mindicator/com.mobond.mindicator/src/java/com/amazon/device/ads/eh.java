/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class eh {
    private static final String a = "eh";
    private static final cy b = new cz().a(a);

    private eh() {
    }

    /*
     * Exception decompiling
     */
    public static String a(InputStream var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl42 : ALOAD_1 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static final boolean a(String string) {
        return string == null || string.equals((Object)"");
        {
        }
    }

    public static boolean a(String string, String string2) {
        return Pattern.compile((String)string).matcher((CharSequence)string2).find();
    }

    public static String b(String string, String string2) {
        Matcher matcher = Pattern.compile((String)string).matcher((CharSequence)string2);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static final boolean b(String string) {
        return eh.a(string) || string.trim().equals((Object)"");
        {
        }
    }

    public static String c(String string) {
        MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA-1");
        messageDigest.update(string.getBytes());
        byte[] arrby = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        do {
            if (n2 >= arrby.length) break;
            stringBuilder.append(Integer.toHexString((int)(256 | 255 & arrby[n2])).substring(1));
            ++n2;
        } while (true);
        try {
            String string2 = stringBuilder.toString();
            return string2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "";
        }
    }
}

