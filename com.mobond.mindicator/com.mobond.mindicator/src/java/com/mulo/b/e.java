/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.CellInfo
 *  android.telephony.CellInfoCdma
 *  android.telephony.CellInfoGsm
 *  android.telephony.CellInfoLte
 *  android.telephony.CellInfoWcdma
 *  android.telephony.CellSignalStrengthCdma
 *  android.telephony.CellSignalStrengthGsm
 *  android.telephony.CellSignalStrengthLte
 *  android.telephony.CellSignalStrengthWcdma
 *  android.telephony.TelephonyManager
 *  android.util.Log
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Hashtable
 *  java.util.List
 */
package com.mulo.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.mobond.mindicator.a;
import com.mulo.b.h;
import com.mulo.b.j;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Hashtable;
import java.util.List;

public class e {
    public static String a;
    private static String b;

    public static String a() {
        return b;
    }

    public static String a(Context context) {
        h h2 = new h();
        e.a(h2, context);
        Hashtable<String, String> hashtable = h2.a();
        if (hashtable.containsKey((Object)"PHONETYPE")) {
            String string = (String)hashtable.get((Object)"PHONETYPE");
            if (string.equals((Object)"GSM")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)hashtable.get((Object)"GSM_MCC"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"GSM_MNC"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"GSM_LAC"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"GSM_CID"));
                return stringBuilder.toString();
            }
            boolean bl = string.equals((Object)"CDMA");
            String string2 = null;
            if (bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)hashtable.get((Object)"CDMA_SID"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"CDMA_NID"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"CDMA_BASE_STATION_ID"));
                string2 = stringBuilder.toString();
            }
            return string2;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(TelephonyManager telephonyManager, Context context) {
        if (Build.VERSION.SDK_INT < 18) return null;
        List list = telephonyManager.getAllCellInfo();
        if (list == null) return null;
        int n2 = 0;
        do {
            block8 : {
                String string;
                block9 : {
                    if (n2 >= list.size()) return null;
                    CellInfo cellInfo = (CellInfo)list.get(n2);
                    if (!cellInfo.isRegistered()) break block8;
                    if (cellInfo == null) return null;
                    try {
                        if (cellInfo instanceof CellInfoGsm) {
                            CellInfoGsm cellInfoGsm = (CellInfoGsm)cellInfo;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("");
                            stringBuilder.append(cellInfoGsm.getCellSignalStrength().getDbm());
                            string = stringBuilder.toString();
                            break block9;
                        }
                        if (cellInfo instanceof CellInfoLte) {
                            CellInfoLte cellInfoLte = (CellInfoLte)cellInfo;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("");
                            stringBuilder.append(cellInfoLte.getCellSignalStrength().getDbm());
                            string = stringBuilder.toString();
                            break block9;
                        }
                        if (cellInfo instanceof CellInfoWcdma) {
                            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma)cellInfo;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("");
                            stringBuilder.append(cellInfoWcdma.getCellSignalStrength().getDbm());
                            string = stringBuilder.toString();
                            break block9;
                        }
                        if (!(cellInfo instanceof CellInfoCdma)) return null;
                        CellInfoCdma cellInfoCdma = (CellInfoCdma)cellInfo;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("");
                        stringBuilder.append(cellInfoCdma.getCellSignalStrength().getDbm());
                        string = stringBuilder.toString();
                    }
                    catch (Exception exception) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("");
                        stringBuilder.append(exception.getMessage());
                        Log.d((String)"addLocat111", (String)stringBuilder.toString());
                    }
                }
                if (string == null) return null;
                return string;
                return null;
            }
            ++n2;
        } while (true);
    }

    private static String a(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream));
        String string = bufferedReader.readLine();
        while (string != null) {
            stringBuilder.append(string);
            string = bufferedReader.readLine();
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String a(String string) {
        InputStream inputStream;
        void var1_5;
        block4 : {
            String string2;
            inputStream = e.c(string);
            try {
                string2 = e.a(inputStream);
                if (inputStream == null) return string2;
            }
            catch (Throwable throwable) {}
            inputStream.close();
            return string2;
            break block4;
            catch (Throwable throwable) {
                inputStream = null;
            }
        }
        if (inputStream == null) throw var1_5;
        inputStream.close();
        throw var1_5;
    }

    @SuppressLint(value={"NewApi"})
    public static String a(String string, Context context) {
        String string2 = string.trim();
        h h2 = new h();
        h2.a("BUILDID", "A:T:20210102");
        try {
            h2.a("SV", "17.0.186");
            h2.a("city", a.a(context).A().toLowerCase());
            e.a(h2, context);
        }
        catch (Exception exception) {
            Log.d((String)"getMobondUrlString", (String)"exception", (Throwable)exception);
        }
        String string3 = "";
        if (string2.contains((CharSequence)"/") && !string2.endsWith("/")) {
            if (!string2.contains((CharSequence)"?")) {
                string3 = "?";
            } else if (!string2.endsWith("?")) {
                string3 = "&";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            stringBuilder.append("PROTO=5&EN=");
            stringBuilder.append(j.a(h2.c()));
            return stringBuilder.toString();
        }
        return string2;
    }

    /*
     * Exception decompiling
     */
    private static void a(h var0, Context var1) {
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

    public static String b(Context context) {
        h h2 = new h();
        e.a(h2, context);
        Hashtable<String, String> hashtable = h2.a();
        if (hashtable.containsKey((Object)"PHONETYPE")) {
            String string;
            String string2 = (String)hashtable.get((Object)"PHONETYPE");
            if (string2.equals((Object)"GSM")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)hashtable.get((Object)"GSM_MCC"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"GSM_MNC"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"GSM_LAC"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"GSM_CID"));
                string = stringBuilder.toString();
            } else if (string2.equals((Object)"CDMA")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)hashtable.get((Object)"CDMA_SID"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"CDMA_NID"));
                stringBuilder.append(":");
                stringBuilder.append((String)hashtable.get((Object)"CDMA_BASE_STATION_ID"));
                string = stringBuilder.toString();
            } else {
                string = null;
            }
            if (string2.equals((Object)"GSM")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("v2g");
                stringBuilder.append(com.mulo.util.e.b(string));
                return stringBuilder.toString();
            }
            if (string2.equals((Object)"CDMA")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("v2c");
                stringBuilder.append(com.mulo.util.e.b(string));
                return stringBuilder.toString();
            }
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] b(String string) {
        InputStream inputStream;
        void var1_5;
        block4 : {
            byte[] arrby;
            inputStream = e.c(string);
            try {
                arrby = com.mulo.util.e.a(inputStream);
                if (inputStream == null) return arrby;
            }
            catch (Throwable throwable) {}
            inputStream.close();
            return arrby;
            break block4;
            catch (Throwable throwable) {
                inputStream = null;
            }
        }
        if (inputStream == null) throw var1_5;
        inputStream.close();
        throw var1_5;
    }

    private static InputStream c(String string) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        return httpURLConnection.getInputStream();
    }
}

