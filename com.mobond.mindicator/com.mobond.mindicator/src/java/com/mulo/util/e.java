/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.res.AssetManager
 *  android.util.Log
 *  com.mulo.util.g
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.PrintStream
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Hashtable
 *  java.util.Locale
 *  java.util.Random
 *  java.util.StringTokenizer
 *  java.util.zip.GZIPInputStream
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 */
package com.mulo.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import com.mulo.util.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class e {
    private static Hashtable a;

    public static int a() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis()));
        int n2 = calendar.get(1);
        int n3 = 1 + calendar.get(2);
        int n4 = calendar.get(5);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n2);
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("");
        stringBuilder2.append(n3);
        String string2 = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("");
        stringBuilder3.append(n4);
        String string3 = stringBuilder3.toString();
        if (n3 < 10) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("0");
            stringBuilder4.append(n3);
            string2 = stringBuilder4.toString();
        }
        if (n4 < 10) {
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("0");
            stringBuilder5.append(n4);
            string3 = stringBuilder5.toString();
        }
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(string);
        stringBuilder6.append(string2);
        stringBuilder6.append(string3);
        return Integer.parseInt((String)stringBuilder6.toString());
    }

    public static int a(int n2, int n3) {
        return n2 + new Random(System.currentTimeMillis()).nextInt(n3 - n2);
    }

    public static int a(int n2, int n3, int n4) {
        int n5 = n3 + 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n2);
        String string = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("");
        stringBuilder2.append(n5);
        String string2 = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("");
        stringBuilder3.append(n4);
        String string3 = stringBuilder3.toString();
        if (n5 < 10) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("0");
            stringBuilder4.append(n5);
            string2 = stringBuilder4.toString();
        }
        if (n4 < 10) {
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("0");
            stringBuilder5.append(n4);
            string3 = stringBuilder5.toString();
        }
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(string);
        stringBuilder6.append(string2);
        stringBuilder6.append(string3);
        return Integer.parseInt((String)stringBuilder6.toString());
    }

    public static int a(String string, Context context) {
        try {
            File file = context.getFilesDir();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("db.zip");
            File file2 = new File(file, stringBuilder.toString());
            if (file2.exists()) {
                ZipFile zipFile = new ZipFile(file2.getPath());
                int n2 = Integer.parseInt((String)e.b(zipFile.getInputStream(zipFile.getEntry("version.txt"))).trim());
                return n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return -1;
    }

    public static g a(String string) {
        Object object = e.g().get((Object)string);
        if (object != null) {
            return (g)object;
        }
        return null;
    }

    public static InputStream a(Object object, String string) {
        String string2;
        Context context;
        String string3;
        boolean bl2;
        block10 : {
            block9 : {
                context = (Context)object;
                string2 = context.getSharedPreferences("m-indicator", 0).getString("city", "mumbai").toLowerCase();
                string3 = string.replace((CharSequence)"../", (CharSequence)"");
                if (string3.contains((CharSequence)"auto") || string3.contains((CharSequence)"bus") || string3.contains((CharSequence)"emergency") || string3.contains((CharSequence)"local") || string3.contains((CharSequence)"penalty") || string3.contains((CharSequence)"taxi") || string3.contains((CharSequence)"config") || string3.contains((CharSequence)"map") || string3.contains((CharSequence)"ferry")) {
                    if (string2.equals((Object)"pune") && string3.contains((CharSequence)"local") && !string3.contains((CharSequence)"local/P") && !string3.contains((CharSequence)"local/sdr")) {
                        string2 = "mumbai";
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("/");
                    stringBuilder.append(string3);
                    string3 = stringBuilder.toString();
                }
                if (string3.startsWith("mumbai/")) break block9;
                boolean bl3 = string3.startsWith("pune/");
                bl2 = false;
                if (!bl3) break block10;
            }
            int n2 = Integer.parseInt((String)"20210102");
            int n3 = e.a(string2, context);
            bl2 = false;
            if (n3 > n2) {
                bl2 = true;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("/");
                string3 = string3.replace((CharSequence)stringBuilder.toString(), (CharSequence)"");
            }
        }
        if (bl2) {
            File file = context.getFilesDir();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("db.zip");
            File file2 = new File(file, stringBuilder.toString());
            try {
                ZipFile zipFile = new ZipFile(file2.getPath());
                InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(string3));
                return inputStream;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string2);
                stringBuilder2.append("/");
                stringBuilder2.append(string3);
                return e.a(string2, stringBuilder2.toString(), context);
            }
        }
        return e.a(string2, string3, context);
    }

    public static InputStream a(String string, String string2, Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("city : ");
        stringBuilder.append(string);
        Log.d((String)"55555", (String)stringBuilder.toString());
        return context.createPackageContext("com.mobond.mindicator", 0).getAssets().open(string2);
    }

    private static String a(long l2, int n2) {
        char[] arrc = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int[] arrn = new int[]{60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0};
        StringBuffer stringBuffer = new StringBuffer(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrc[(int)(15L & l2 >> arrn[i2 + (16 - n2)])]);
        }
        return stringBuffer.toString();
    }

    public static String a(String string, String string2) {
        try {
            if (string.indexOf(63) > -1) {
                String string3 = string.substring(1 + string.indexOf(63));
                Hashtable hashtable = new Hashtable();
                StringTokenizer stringTokenizer = new StringTokenizer(string3, "&");
                while (stringTokenizer.hasMoreTokens()) {
                    StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken(), "=");
                    hashtable.put((Object)stringTokenizer2.nextToken(), (Object)stringTokenizer2.nextToken());
                }
                String string4 = (String)hashtable.get((Object)string2);
                return string4;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static String a(String string, char[] arrc) {
        if (string.equals((Object)"CSMT")) {
            return "CSMT";
        }
        if (string.equals((Object)"BELAPUR CBD")) {
            return "Belapur CBD";
        }
        if (string.equals((Object)"Belapur Cbd")) {
            return "Belapur CBD";
        }
        if (string.equals((Object)"GTB NAGAR")) {
            return "GTB Nagar";
        }
        if (string.equals((Object)"Gtb Nagar")) {
            return "GTB Nagar";
        }
        if (string.equals((Object)"ANAND VIHAR ISBT")) {
            return "Anand Vihar ISBT";
        }
        if (string.equals((Object)"IFFCO CHOWK")) {
            return "IFFCO Chowk";
        }
        if (string.equals((Object)"IGI AIRPORT")) {
            return "IGI Airport";
        }
        if (string.equals((Object)"INA")) {
            return "INA";
        }
        if (string.equals((Object)"NHPC CHOWK")) {
            return "NHPC Chowk";
        }
        if (string.equals((Object)"ITO")) {
            return "ITO";
        }
        if (string.equals((Object)"JLN STADIUM")) {
            return "JLN Stadium";
        }
        if (string.equals((Object)"AIIMS")) {
            return "AIIMS";
        }
        if (string != null) {
            if (string.length() == 0) {
                return string;
            }
            int n2 = string.length();
            StringBuffer stringBuffer = new StringBuffer(n2);
            int n3 = arrc != null ? arrc.length : 0;
            boolean bl2 = true;
            for (int i2 = 0; i2 < n2; ++i2) {
                boolean bl3;
                char c2;
                block21 : {
                    c2 = string.charAt(i2);
                    if (arrc == null) {
                        bl3 = Character.isWhitespace((char)c2);
                    } else {
                        for (int i3 = 0; i3 < n3; ++i3) {
                            if (c2 != arrc[i3]) continue;
                            bl3 = true;
                            break block21;
                        }
                        bl3 = false;
                    }
                }
                if (bl3) {
                    stringBuffer.append(c2);
                    bl2 = true;
                    continue;
                }
                if (bl2) {
                    stringBuffer.append(Character.toTitleCase((char)c2));
                    bl2 = false;
                    continue;
                }
                stringBuffer.append(Character.toLowerCase((char)c2));
            }
            return stringBuffer.toString();
        }
        return string;
    }

    public static String a(byte[] arrby) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            stringBuffer.append(e.a((long)arrby[i2], 2));
        }
        return stringBuffer.toString();
    }

    public static void a(String string, g g2) {
        e.g().put((Object)string, (Object)g2);
    }

    public static boolean a(Context context, String string) {
        try {
            context.getPackageManager().getPackageInfo(string, 1);
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public static byte[] a(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[1024];
        while ((n2 = inputStream.read(arrby, 0, arrby.length)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static String[] a(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length];
        int n2 = -1 + arrstring.length;
        int n3 = 0;
        while (n3 < arrstring.length) {
            arrstring2[n2] = arrstring[n3];
            ++n3;
            --n2;
        }
        return arrstring2;
    }

    public static String b() {
        return new SimpleDateFormat("dd MMM HH:mm", Locale.ENGLISH).format(new Date());
    }

    public static String b(int n2, int n3) {
        String string;
        String string2;
        Calendar.getInstance();
        if (n2 == 0) {
            string2 = "AM";
            n2 = 12;
        } else if (n2 >= 12) {
            if (n2 > 12) {
                n2 -= 12;
            }
            string2 = "PM";
        } else {
            string2 = "AM";
        }
        if (n3 < 10) {
            if (n2 < 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0");
                stringBuilder.append(n2);
                stringBuilder.append(":0");
                stringBuilder.append(n3);
                string = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n2);
                stringBuilder.append(":0");
                stringBuilder.append(n3);
                string = stringBuilder.toString();
            }
        } else if (n2 < 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0");
            stringBuilder.append(n2);
            stringBuilder.append(":");
            stringBuilder.append(n3);
            string = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append(":");
            stringBuilder.append(n3);
            string = stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String b(InputStream inputStream) {
        return new String(e.a(inputStream), "UTF-8");
    }

    public static String b(String string) {
        int n2 = e.a(1, 9);
        StringBuffer stringBuffer = new StringBuffer(string);
        for (int i2 = 0; i2 < stringBuffer.length(); ++i2) {
            char c2 = stringBuffer.charAt(i2);
            if (c2 == ':') {
                stringBuffer.setCharAt(i2, ':');
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(c2);
            stringBuffer.setCharAt(i2, Character.valueOf((char)Character.forDigit((int)((n2 + Integer.parseInt((String)stringBuilder.toString())) % 10), (int)10)).charValue());
        }
        stringBuffer.insert(0, (Object)Character.valueOf((char)Character.forDigit((int)n2, (int)10)));
        return stringBuffer.toString();
    }

    public static String b(String string, String string2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        try {
            Date date = simpleDateFormat.parse(string);
            long l2 = simpleDateFormat.parse(string2).getTime() - date.getTime();
            long l3 = l2 / 1000L % 60L;
            long l4 = l2 / 60000L % 60L;
            long l5 = l2 / 3600000L % 24L;
            long l6 = l2 / 86400000L;
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l6);
            stringBuilder.append(" days, ");
            printStream.print(stringBuilder.toString());
            PrintStream printStream2 = System.out;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(l5);
            stringBuilder2.append(" hours, ");
            printStream2.print(stringBuilder2.toString());
            PrintStream printStream3 = System.out;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(l4);
            stringBuilder3.append(" minutes, ");
            printStream3.print(stringBuilder3.toString());
            PrintStream printStream4 = System.out;
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(l3);
            stringBuilder4.append(" seconds.");
            printStream4.print(stringBuilder4.toString());
            String string3 = Long.toString((long)l6);
            return string3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "0";
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] b(byte[] arrby) {
        block18 : {
            gZIPInputStream = new GZIPInputStream((InputStream)new ByteArrayInputStream(arrby));
            byteArrayOutputStream2 = new ByteArrayOutputStream();
            ** GOTO lbl20
            {
                block19 : {
                    catch (Throwable throwable2) {
                        byteArrayOutputStream = null;
                        break block18;
                    }
                    catch (IOException iOException) {
                        byteArrayOutputStream2 = null;
                        break block19;
                    }
                    catch (Throwable throwable3) {
                        byteArrayOutputStream = null;
                        gZIPInputStream = null;
                        break block18;
                    }
                    catch (IOException iOException) {
                        byteArrayOutputStream2 = null;
                        gZIPInputStream = null;
                        break block19;
                    }
lbl20: // 1 sources:
                    do {
                        block20 : {
                            n2 = gZIPInputStream.read();
                            if (n2 != -1) break block20;
                            arrby2 = byteArrayOutputStream2.toByteArray();
                            try {
                                gZIPInputStream.close();
                                byteArrayOutputStream2.close();
                                return arrby2;
                            }
                            catch (IOException iOException) {
                                iOException.printStackTrace();
                                return arrby2;
                            }
                        }
                        ** try [egrp 4[TRYBLOCK] [10 : 63->113)] { 
lbl35: // 2 sources:
                        byteArrayOutputStream2.write(n2);
                        continue;
                        break;
                    } while (true);
                    catch (IOException iOException) {}
                }
                var7_9.printStackTrace();
            }
            try {
                gZIPInputStream.close();
                byteArrayOutputStream2.close();
                return null;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return null;
            }
lbl47: // 2 sources:
            catch (Throwable throwable4) {
                byteArrayOutputStream = byteArrayOutputStream2;
                throwable = throwable4;
            }
        }
        try {
            gZIPInputStream.close();
            byteArrayOutputStream.close();
            throw throwable;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        throw throwable;
    }

    public static int c() {
        Calendar calendar = Calendar.getInstance();
        return 60 * calendar.get(11) + calendar.get(12);
    }

    public static String c(String string) {
        Date date = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(string);
        return new SimpleDateFormat("d MMM yyyy", Locale.ENGLISH).format(date);
    }

    public static int d() {
        Calendar calendar = Calendar.getInstance();
        return 3600 * calendar.get(11) + 60 * calendar.get(12);
    }

    public static String d(String string) {
        if (string != null && string.trim().length() > 0) {
            String[] arrstring = string.split("\\s+");
            int n2 = arrstring.length;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < n2; ++i2) {
                String string2 = arrstring[i2];
                stringBuffer.append(Character.toUpperCase((char)string2.charAt(0)));
                stringBuffer.append(string2.substring(1).toLowerCase());
                stringBuffer.append(" ");
            }
            return stringBuffer.toString();
        }
        return "";
    }

    public static String e() {
        Calendar calendar = Calendar.getInstance();
        int n2 = calendar.get(11);
        int n3 = calendar.get(12);
        if (n3 < 10) {
            if (n2 < 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0");
                stringBuilder.append(n2);
                stringBuilder.append(":0");
                stringBuilder.append(n3);
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append(":0");
            stringBuilder.append(n3);
            return stringBuilder.toString();
        }
        if (n2 < 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0");
            stringBuilder.append(n2);
            stringBuilder.append(":");
            stringBuilder.append(n3);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(":");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public static String f() {
        String string;
        String string2;
        Calendar calendar = Calendar.getInstance();
        int n2 = calendar.get(11);
        if (n2 == 0) {
            string = "AM";
            n2 = 12;
        } else if (n2 >= 12) {
            if (n2 > 12) {
                n2 -= 12;
            }
            string = "PM";
        } else {
            string = "AM";
        }
        int n3 = calendar.get(12);
        if (n3 < 10) {
            if (n2 < 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0");
                stringBuilder.append(n2);
                stringBuilder.append(":0");
                stringBuilder.append(n3);
                string2 = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n2);
                stringBuilder.append(":0");
                stringBuilder.append(n3);
                string2 = stringBuilder.toString();
            }
        } else if (n2 < 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0");
            stringBuilder.append(n2);
            stringBuilder.append(":");
            stringBuilder.append(n3);
            string2 = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append(":");
            stringBuilder.append(n3);
            string2 = stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private static Hashtable g() {
        if (a == null) {
            a = new Hashtable();
        }
        return a;
    }
}

