/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Date
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.TreeMap
 */
package com.a.a.a;

import com.a.a.b;
import com.a.a.k;
import com.a.a.v;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

public class g {
    public static long a(String string) {
        try {
            long l2 = g.a().parse(string).getTime();
            return l2;
        }
        catch (ParseException parseException) {
            v.a(parseException, "Unable to parse dateStr: %s, falling back to 0", string);
            return 0L;
        }
    }

    /*
     * Exception decompiling
     */
    public static b.a a(k var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    static String a(long l2) {
        return g.a().format(new Date(l2));
    }

    public static String a(Map<String, String> map) {
        return g.a(map, "ISO-8859-1");
    }

    public static String a(Map<String, String> map, String string) {
        String string2 = (String)map.get((Object)"Content-Type");
        if (string2 != null) {
            String[] arrstring = string2.split(";", 0);
            for (int i2 = 1; i2 < arrstring.length; ++i2) {
                String[] arrstring2 = arrstring[i2].trim().split("=", 0);
                if (arrstring2.length != 2 || !arrstring2[0].equals((Object)"charset")) continue;
                return arrstring2[1];
            }
        }
        return string;
    }

    private static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String)"GMT"));
        return simpleDateFormat;
    }

    static Map<String, String> a(List<com.a.a.g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.a.a.g g2 : list) {
            treeMap.put((Object)g2.a(), (Object)g2.b());
        }
        return treeMap;
    }

    static List<com.a.a.g> b(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add((Object)new com.a.a.g((String)entry.getKey(), (String)entry.getValue()));
        }
        return arrayList;
    }
}

