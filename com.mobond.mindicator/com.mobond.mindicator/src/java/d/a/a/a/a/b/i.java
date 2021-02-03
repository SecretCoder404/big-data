/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.SharedPreferences
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  android.hardware.Sensor
 *  android.hardware.SensorManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Debug
 *  android.os.StatFs
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 *  java.io.BufferedReader
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileReader
 *  java.io.Flushable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Scanner
 *  java.util.regex.Pattern
 */
package d.a.a.a.a.b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import d.a.a.a.c;
import d.a.a.a.l;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class i {
    public static final Comparator<File> a;
    private static Boolean b;
    private static final char[] c;
    private static long d;

    static {
        c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        d = -1L;
        a = new Comparator<File>(){

            public int a(File file, File file2) {
                return (int)(file.lastModified() - file2.lastModified());
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((File)object, (File)object2);
            }
        };
    }

    public static int a() {
        return a.a().ordinal();
    }

    public static int a(Context context, String string, String string2) {
        return context.getResources().getIdentifier(string, string2, i.j(context));
    }

    public static int a(Context context, boolean bl) {
        Float f2 = i.c(context);
        if (bl && f2 != null) {
            if ((double)f2.floatValue() >= 99.0) {
                return 3;
            }
            if ((double)f2.floatValue() < 99.0) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    static long a(String string, String string2, int n2) {
        return Long.parseLong((String)string.split(string2)[0].trim()) * (long)n2;
    }

    public static ActivityManager.RunningAppProcessInfo a(String string, Context context) {
        List list = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (list != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (!runningAppProcessInfo.processName.equals((Object)string)) continue;
                return runningAppProcessInfo;
            }
        }
        return null;
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String a(int n2) {
        if (n2 >= 0) {
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{n2};
            return String.format((Locale)locale, (String)"%1$10s", (Object[])arrobject).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static String a(File var0, String var1_1) {
        if (var0.exists()) {
            block12 : {
                block11 : {
                    block10 : {
                        var2_2 = new BufferedReader((Reader)new FileReader(var0), 1024);
                        try {
                            do {
                                var10_4 = var2_2.readLine();
                                var9_3 = null;
                                if (var10_4 == null) break block10;
                            } while ((var11_5 = Pattern.compile((String)"\\s*:\\s*").split((CharSequence)var10_4, 2)).length <= 1 || !var11_5[0].equals((Object)var1_1));
                            var9_3 = var12_6 = var11_5[1];
                        }
                        catch (Exception var4_7) {
                            break block11;
                        }
                    }
lbl12: // 2 sources:
                    do {
                        i.a((Closeable)var2_2, "Failed to close system file reader.");
                        return var9_3;
                        break;
                    } while (true);
                    catch (Throwable var3_10) {
                        var2_2 = null;
                        break block12;
                    }
                    catch (Exception var4_8) {
                        var2_2 = null;
                    }
                }
                try {
                    var5_13 = c.g();
                    var6_14 = new StringBuilder();
                    var6_14.append("Error parsing ");
                    var6_14.append((Object)var0);
                    var5_13.e("Fabric", var6_14.toString(), (Throwable)var4_9);
                    var9_3 = null;
                    ** continue;
                }
                catch (Throwable var3_11) {
                    // empty catch block
                }
            }
            i.a(var2_2, "Failed to close system file reader.");
            throw var3_12;
        }
        return null;
    }

    public static String a(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        if (scanner.hasNext()) {
            return scanner.next();
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String a(InputStream inputStream, String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance((String)string);
            byte[] arrby = new byte[1024];
            do {
                int n2;
                if ((n2 = inputStream.read(arrby)) == -1) {
                    return i.a(messageDigest.digest());
                }
                messageDigest.update(arrby, 0, n2);
            } while (true);
        }
        catch (Exception exception) {
            c.g().e("Fabric", "Could not calculate hash for app icon.", exception);
            return "";
        }
    }

    public static String a(String string) {
        return i.a(string, "SHA-1");
    }

    private static String a(String string, String string2) {
        return i.a(string.getBytes(), string2);
    }

    public static String a(byte[] arrby) {
        char[] arrc = new char[2 * arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n2 = 255 & arrby[i2];
            int n3 = i2 * 2;
            char[] arrc2 = c;
            arrc[n3] = arrc2[n2 >>> 4];
            arrc[n3 + 1] = arrc2[n2 & 15];
        }
        return new String(arrc);
    }

    private static String a(byte[] arrby, String string) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance((String)string);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            l l2 = c.g();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create hashing algorithm: ");
            stringBuilder.append(string);
            stringBuilder.append(", returning empty string.");
            l2.e("Fabric", stringBuilder.toString(), noSuchAlgorithmException);
            return "";
        }
        messageDigest.update(arrby);
        return i.a(messageDigest.digest());
    }

    public static /* varargs */ String a(String ... arrstring) {
        if (arrstring != null) {
            if (arrstring.length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String string : arrstring) {
                if (string == null) continue;
                arrayList.add((Object)string.replace((CharSequence)"-", (CharSequence)"").toLowerCase(Locale.US));
            }
            Collections.sort((List)arrayList);
            StringBuilder stringBuilder = new StringBuilder();
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append((String)iterator.next());
            }
            String string = stringBuilder.toString();
            int n2 = string.length();
            String string2 = null;
            if (n2 > 0) {
                string2 = i.a(string);
            }
            return string2;
        }
        return null;
    }

    public static void a(Context context, int n2, String string, String string2) {
        if (i.e(context)) {
            c.g().a(n2, "Fabric", string2);
        }
    }

    public static void a(Context context, String string) {
        if (i.e(context)) {
            c.g().a("Fabric", string);
        }
    }

    public static void a(Context context, String string, Throwable throwable) {
        if (i.e(context)) {
            c.g().e("Fabric", string);
        }
    }

    /*
     * Exception decompiling
     */
    public static void a(Closeable var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl9.1 : RETURN : trying to set 0 previously set to 1
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

    public static void a(Closeable closeable, String string) {
        if (closeable != null) {
            try {
                closeable.close();
                return;
            }
            catch (IOException iOException) {
                c.g().e("Fabric", string, iOException);
            }
        }
    }

    public static void a(Flushable flushable, String string) {
        if (flushable != null) {
            try {
                flushable.flush();
                return;
            }
            catch (IOException iOException) {
                c.g().e("Fabric", string, iOException);
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] arrby) {
        int n2;
        while ((n2 = inputStream.read(arrby)) != -1) {
            outputStream.write(arrby, 0, n2);
        }
    }

    public static boolean a(Context context, String string, boolean bl) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int n2 = i.a(context, string, "bool");
            if (n2 > 0) {
                return resources.getBoolean(n2);
            }
            int n3 = i.a(context, string, "string");
            if (n3 > 0) {
                return Boolean.parseBoolean((String)context.getString(n3));
            }
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long b() {
        Class<i> class_ = i.class;
        synchronized (i.class) {
            if (d != -1L) return d;
            long l2 = 0L;
            String string = i.a(new File("/proc/meminfo"), "MemTotal");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                String string2 = string.toUpperCase(Locale.US);
                try {
                    if (string2.endsWith("KB")) {
                        l2 = i.a(string2, "KB", 1024);
                    } else if (string2.endsWith("MB")) {
                        l2 = i.a(string2, "MB", 1048576);
                    } else if (string2.endsWith("GB")) {
                        l2 = i.a(string2, "GB", 1073741824);
                    } else {
                        l l3 = c.g();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected meminfo format while computing RAM: ");
                        stringBuilder.append(string2);
                        l3.a("Fabric", stringBuilder.toString());
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    l l4 = c.g();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected meminfo format while computing RAM: ");
                    stringBuilder.append(string2);
                    l4.e("Fabric", stringBuilder.toString(), numberFormatException);
                }
            }
            d = l2;
            return d;
        }
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static String b(int n2) {
        switch (n2) {
            default: {
                return "?";
            }
            case 7: {
                return "A";
            }
            case 6: {
                return "E";
            }
            case 5: {
                return "W";
            }
            case 4: {
                return "I";
            }
            case 3: {
                return "D";
            }
            case 2: 
        }
        return "V";
    }

    public static String b(Context context, String string) {
        int n2 = i.a(context, string, "string");
        if (n2 > 0) {
            return context.getString(n2);
        }
        return "";
    }

    public static String b(InputStream inputStream) {
        return i.a(inputStream, "SHA-1");
    }

    public static String b(String string) {
        return i.a(string, "SHA-256");
    }

    public static long c(String string) {
        StatFs statFs = new StatFs(string);
        long l2 = statFs.getBlockSize();
        return l2 * (long)statFs.getBlockCount() - l2 * (long)statFs.getAvailableBlocks();
    }

    public static Float c(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intent == null) {
            return null;
        }
        int n2 = intent.getIntExtra("level", -1);
        int n3 = intent.getIntExtra("scale", -1);
        return Float.valueOf((float)((float)n2 / (float)n3));
    }

    public static boolean c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
        {
        }
    }

    public static boolean c(Context context, String string) {
        return context.checkCallingOrSelfPermission(string) == 0;
    }

    public static boolean d(Context context) {
        if (i.f(context)) {
            return false;
        }
        Sensor sensor = ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8);
        boolean bl = false;
        if (sensor != null) {
            bl = true;
        }
        return bl;
    }

    public static boolean d(String string) {
        return string == null || string.length() == 0;
        {
        }
    }

    public static boolean e(Context context) {
        if (b == null) {
            b = i.a(context, "com.crashlytics.Trace", false);
        }
        return b;
    }

    public static boolean f(Context context) {
        String string = Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"android_id");
        return "sdk".equals((Object)Build.PRODUCT) || "google_sdk".equals((Object)Build.PRODUCT) || string == null;
        {
        }
    }

    public static boolean g(Context context) {
        boolean bl = i.f(context);
        String string = Build.TAGS;
        if (!bl && string != null && string.contains((CharSequence)"test-keys")) {
            return true;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        return !bl && file.exists();
    }

    public static int h(Context context) {
        int n2 = i.f(context) ? 1 : 0;
        if (i.g(context)) {
            n2 |= 2;
        }
        if (i.c()) {
            n2 |= 4;
        }
        return n2;
    }

    public static boolean i(Context context) {
        return (2 & context.getApplicationInfo().flags) != 0;
    }

    public static String j(Context context) {
        int n2 = context.getApplicationContext().getApplicationInfo().icon;
        if (n2 > 0) {
            return context.getResources().getResourcePackageName(n2);
        }
        return context.getPackageName();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String k(Context context) {
        InputStream inputStream;
        Throwable throwable;
        block8 : {
            block7 : {
                String string;
                inputStream = context.getResources().openRawResource(i.l(context));
                try {
                    String string2 = i.b(inputStream);
                    boolean bl = i.d(string2);
                    string = bl ? null : string2;
                }
                catch (Exception exception) {
                    break block7;
                }
                i.a((Closeable)inputStream, "Failed to close icon input stream.");
                return string;
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    inputStream = null;
                    break block8;
                }
                catch (Exception exception) {
                    inputStream = null;
                }
            }
            try {
                void var1_7;
                c.g().e("Fabric", "Could not calculate hash for app icon.", (Throwable)var1_7);
            }
            catch (Throwable throwable3) {
                // empty catch block
            }
            i.a((Closeable)inputStream, "Failed to close icon input stream.");
            return null;
        }
        i.a((Closeable)inputStream, "Failed to close icon input stream.");
        throw throwable;
    }

    public static int l(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String m(Context context) {
        int n2 = i.a(context, "io.fabric.android.build_id", "string");
        if (n2 == 0) {
            n2 = i.a(context, "com.crashlytics.android.build_id", "string");
        }
        if (n2 != 0) {
            String string = context.getResources().getString(n2);
            l l2 = c.g();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Build ID is: ");
            stringBuilder.append(string);
            l2.a("Fabric", stringBuilder.toString());
            return string;
        }
        return null;
    }

    @SuppressLint(value={"MissingPermission"})
    public static boolean n(Context context) {
        if (i.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            return networkInfo != null && networkInfo.isConnectedOrConnecting();
        }
        return true;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        public static final /* enum */ a i = new a();
        public static final /* enum */ a j = new a();
        private static final Map<String, a> k;
        private static final /* synthetic */ a[] l;

        static {
            a[] arra = new a[]{a, b, c, d, e, f, g, h, i, j};
            l = arra;
            k = new HashMap(4);
            k.put((Object)"armeabi-v7a", (Object)g);
            k.put((Object)"armeabi", (Object)f);
            k.put((Object)"arm64-v8a", (Object)j);
            k.put((Object)"x86", (Object)a);
        }

        static a a() {
            String string = Build.CPU_ABI;
            if (TextUtils.isEmpty((CharSequence)string)) {
                c.g().a("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return h;
            }
            String string2 = string.toLowerCase(Locale.US);
            a a2 = (a)((Object)k.get((Object)string2));
            if (a2 == null) {
                a2 = h;
            }
            return a2;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])l.clone();
        }
    }

}

