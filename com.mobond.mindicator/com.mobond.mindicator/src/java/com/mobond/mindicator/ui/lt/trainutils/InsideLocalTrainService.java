/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningServiceInfo
 *  android.app.AlarmManager
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.Service
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.media.AudioAttributes
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Binder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.telephony.CellIdentityGsm
 *  android.telephony.CellIdentityLte
 *  android.telephony.CellIdentityWcdma
 *  android.telephony.CellInfo
 *  android.telephony.CellInfoGsm
 *  android.telephony.CellInfoLte
 *  android.telephony.CellInfoWcdma
 *  android.telephony.CellLocation
 *  android.telephony.CellSignalStrengthGsm
 *  android.telephony.CellSignalStrengthLte
 *  android.telephony.CellSignalStrengthWcdma
 *  android.telephony.PhoneStateListener
 *  android.telephony.TelephonyManager
 *  android.util.Log
 *  android.widget.RemoteViews
 *  androidx.core.app.h
 *  androidx.core.app.h$d
 *  androidx.h.a.a
 *  com.google.android.gms.maps.model.LatLng
 *  com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing
 *  com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService$1
 *  com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService$2
 *  com.mobond.mindicator.ui.train.TraceTrainUI2
 *  com.mobond.mindicator.util.OnlineDbUpdateService
 *  com.mobond.mindicator.util.c
 *  com.mulo.a.d.h
 *  com.mulo.a.d.j
 *  com.mulo.b.a
 *  com.mulo.util.b
 *  java.io.InputStream
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Hashtable
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Executor
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.h;
import com.a.a.a.r;
import com.a.a.o;
import com.google.android.gms.maps.model.LatLng;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.lt.trainutils.AlarmReceiver;
import com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService;
import com.mobond.mindicator.ui.lt.trainutils.c;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mobond.mindicator.ui.train.TraceTrainUI2;
import com.mobond.mindicator.util.OnlineDbUpdateService;
import com.mulo.a.d.h;
import com.mulo.a.d.j;
import com.mulo.util.e;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class InsideLocalTrainService
extends Service {
    private static final Object H = new Object();
    static Hashtable o = null;
    static com.mulo.util.b p = null;
    int A = 0;
    ArrayList<String> B = new ArrayList();
    boolean C = false;
    boolean D = false;
    boolean E = false;
    com.mobond.mindicator.b F;
    o G;
    private RemoteViews I;
    private b J;
    private Binder K = new a();
    private NotificationManager L;
    private Notification M;
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    LatLng h;
    boolean i;
    String j = "START";
    String k = "UPDATE";
    String l = "END";
    String m = this.j;
    j[] n;
    PhoneStateListener q;
    TelephonyManager r;
    public Context s;
    String t = "";
    public com.mobond.mindicator.ui.lt.a.a u;
    com.mobond.mindicator.ui.lt.trainutils.a.a v;
    long w = 0L;
    List<c> x = new ArrayList();
    public com.mobond.mindicator.ui.lt.trainutils.a.c y;
    public long z = 0L;

    public static LatLng a(String string, Context context) {
        return InsideLocalTrainService.a(string, context, false);
    }

    public static LatLng a(String string, Context context, boolean bl) {
        try {
            InsideLocalTrainService.b(context);
            LatLng latLng = InsideLocalTrainService.a(string, bl);
            return latLng;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static LatLng a(String string, boolean bl) {
        float[] arrf = InsideLocalTrainService.c(string, bl);
        if (arrf != null) {
            return new LatLng((double)arrf[0], (double)arrf[1]);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private String a(CellLocation var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl83.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    private ArrayList<c> a(List<CellInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                int n2;
                int n3;
                int n4;
                int n5;
                int n6;
                CellInfo cellInfo = (CellInfo)list.get(i2);
                boolean bl = cellInfo instanceof CellInfoGsm;
                boolean bl2 = true;
                if (bl) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm)cellInfo;
                    CellIdentityGsm cellIdentityGsm = cellInfoGsm.getCellIdentity();
                    n2 = cellIdentityGsm.getMcc();
                    boolean bl3 = n2 == 404;
                    if (n2 != 405) {
                        bl2 = false;
                    }
                    if (bl2 | bl3) {
                        n6 = cellIdentityGsm.getMnc();
                        n5 = cellIdentityGsm.getLac();
                        n4 = cellIdentityGsm.getCid();
                        n3 = cellInfoGsm.getCellSignalStrength().getLevel();
                    } else {
                        n3 = 0;
                        n4 = 0;
                        n6 = 0;
                        n5 = 0;
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte)cellInfo;
                    CellIdentityLte cellIdentityLte = cellInfoLte.getCellIdentity();
                    n2 = cellIdentityLte.getMcc();
                    boolean bl4 = n2 == 404;
                    if (n2 != 405) {
                        bl2 = false;
                    }
                    if (bl2 | bl4) {
                        n6 = cellIdentityLte.getMnc();
                        n5 = cellIdentityLte.getTac();
                        n4 = cellIdentityLte.getCi();
                        n3 = cellInfoLte.getCellSignalStrength().getLevel();
                    } else {
                        n3 = 0;
                        n4 = 0;
                        n6 = 0;
                        n5 = 0;
                    }
                } else if (Build.VERSION.SDK_INT >= 18 && cellInfo instanceof CellInfoWcdma) {
                    CellInfoWcdma cellInfoWcdma = (CellInfoWcdma)cellInfo;
                    CellIdentityWcdma cellIdentityWcdma = cellInfoWcdma.getCellIdentity();
                    n2 = cellIdentityWcdma.getMcc();
                    boolean bl5 = n2 == 404;
                    if (n2 != 405) {
                        bl2 = false;
                    }
                    if (bl2 | bl5) {
                        n6 = cellIdentityWcdma.getMnc();
                        n5 = cellIdentityWcdma.getLac();
                        n4 = cellIdentityWcdma.getCid();
                        n3 = cellInfoWcdma.getCellSignalStrength().getLevel();
                    } else {
                        n3 = 0;
                        n4 = 0;
                        n6 = 0;
                        n5 = 0;
                    }
                } else {
                    n3 = 0;
                    n4 = 0;
                    n6 = 0;
                    n2 = 0;
                    n5 = 0;
                }
                if (n2 != 404 && n2 != 405 || n6 <= 0 || n5 <= 0 || n4 <= 0 || n5 == Integer.MAX_VALUE || n4 == Integer.MAX_VALUE) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n2);
                stringBuilder.append(":");
                stringBuilder.append(n6);
                stringBuilder.append(":");
                stringBuilder.append(n5);
                stringBuilder.append(":");
                stringBuilder.append(n4);
                arrayList.add((Object)new c(stringBuilder.toString(), n3));
            }
        }
        Collections.sort((List)arrayList, (Comparator)new Comparator<c>(){

            @TargetApi(value=17)
            public int a(c c2, c c3) {
                int n2 = c2.b;
                return c3.b - n2;
            }

            @TargetApi(value=17)
            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((c)object, (c)object2);
            }
        });
        return arrayList;
    }

    private void a(Context context, String string, String string2, String string3, String string4, String string5, com.mobond.mindicator.ui.lt.trainutils.a.c c2, boolean bl) {
        if (string3 != null) {
            if (!GoogleLoginActivity.b(context) && this.F.O() == null) {
                com.mobond.mindicator.ui.lt.trainutils.a.a(string3, (com.mulo.b.a)new 1(this, string3), context);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"tn", (Object)string2);
            hashMap.put((Object)"u", (Object)string3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2.a);
            stringBuilder.append("");
            hashMap.put((Object)"i", (Object)stringBuilder.toString());
            if (c2.b != null) {
                hashMap.put((Object)"os", (Object)c2.b);
            } else {
                hashMap.put((Object)"os", (Object)"");
            }
            if (this.b > 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.b);
                stringBuilder2.append("");
                hashMap.put((Object)"ud", (Object)stringBuilder2.toString());
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(c2.i);
            stringBuilder3.append("");
            hashMap.put((Object)"dst", (Object)stringBuilder3.toString());
            hashMap.put((Object)"ps", (Object)c2.c);
            hashMap.put((Object)"ns", (Object)c2.d);
            hashMap.put((Object)"st", (Object)c2.e);
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(c2.f);
            stringBuilder4.append("");
            hashMap.put((Object)"d", (Object)stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(c2.g);
            stringBuilder5.append("");
            hashMap.put((Object)"mv", (Object)stringBuilder5.toString());
            hashMap.put((Object)"a", (Object)string4);
            hashMap.put((Object)"tw", (Object)string);
            hashMap.put((Object)"l", (Object)string5);
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(this.D);
            stringBuilder6.append("");
            hashMap.put((Object)"rt", (Object)stringBuilder6.toString());
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append(this.E);
            stringBuilder7.append("");
            hashMap.put((Object)"ss", (Object)stringBuilder7.toString());
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append(this.F.N());
            stringBuilder8.append("");
            hashMap.put((Object)"v", (Object)stringBuilder8.toString());
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append(System.currentTimeMillis());
            stringBuilder9.append("");
            hashMap.put((Object)"ut", (Object)stringBuilder9.toString());
            hashMap.put((Object)"b", (Object)"20210102");
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append(this.c(c2.b));
            stringBuilder10.append("");
            hashMap.put((Object)"rd", (Object)stringBuilder10.toString());
            StringBuilder stringBuilder11 = new StringBuilder();
            stringBuilder11.append(f.c(string2, context));
            stringBuilder11.append("");
            hashMap.put((Object)"vlt", (Object)stringBuilder11.toString());
            this.m = this.k;
            try {
                com.mobond.mindicator.ui.lt.trainutils.a.a((Map<String, String>)hashMap, (com.mulo.b.a)new 2(this, context), this.G, bl);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Exception decompiling
     */
    @SuppressLint(value={"MissingPermission"})
    @TargetApi(value=17)
    private void a(CellLocation var1, boolean var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl264.1 : ALOAD : trying to set 1 previously set to 0
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

    /*
     * Exception decompiling
     */
    private void a(ArrayList<c> var1, Context var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl31.1 : RETURN : trying to set 1 previously set to 0
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

    private void a(j[] arrj) {
        this.B.clear();
        for (int i2 = 0; i2 < arrj.length; ++i2) {
            String string = arrj[i2].a;
            this.B.add((Object)string);
            if (i2 >= -1 + arrj.length) continue;
            ArrayList arrayList = com.mobond.mindicator.util.c.a((String)string, (String)arrj[i2 + 1].a);
            this.B.addAll((Collection)arrayList);
        }
    }

    private boolean a(com.mobond.mindicator.ui.lt.trainutils.a.c c2) {
        String string = this.g.split("-")[1].trim();
        if (c2.b != null && c2.b.equals((Object)string)) {
            return true;
        }
        if (c2.c != null && c2.c.equals((Object)string)) {
            return true;
        }
        String string2 = c2.b != null ? c2.b : c2.c;
        int n2 = -1;
        int n3 = -1;
        for (int i2 = 0; i2 < this.B.size(); ++i2) {
            String string3 = (String)this.B.get(i2);
            if (string2.equals((Object)string3)) {
                n2 = i2;
            }
            if (!string3.equals((Object)string)) continue;
            n3 = i2;
        }
        return n2 != -1 && n3 != -1 && n2 >= n3;
    }

    public static LatLng b(String string, boolean bl) {
        try {
            if (o != null || p != null) {
                LatLng latLng = InsideLocalTrainService.a(string, bl);
                return latLng;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static void b(Context context) {
        if (o == null || p == null) {
            byte[] arrby = com.mobond.mindicator.ui.indianrail.a.a.b(e.a(new OnlineDbUpdateService().a(context, OnlineDbUpdateService.j, OnlineDbUpdateService.j)));
            o = new Hashtable();
            com.mulo.util.b b2 = new com.mulo.util.b(arrby);
            int n2 = b2.d(0);
            String string = b2.c(4, n2);
            int n3 = n2 + 4;
            int n4 = b2.d(n3);
            p = b2.b(n3 + 4, n4);
            String[] arrstring = string.split(",");
            for (int i2 = 0; i2 < arrstring.length; i2 += 2) {
                o.put((Object)arrstring[i2], (Object)arrstring[i2 + 1]);
            }
        }
    }

    private void b(com.mobond.mindicator.ui.lt.trainutils.a.c c2) {
        this.u = new com.mobond.mindicator.ui.lt.a.a();
        this.u.e = c2.f;
        this.u.c = c2.e;
        this.u.a = c2.h;
        this.u.g = c2.g;
        String string = "";
        if (this.u.b()) {
            String string2 = c2.e;
            int n2 = -1;
            switch (string2.hashCode()) {
                default: {
                    break;
                }
                case 51: {
                    if (!string2.equals((Object)"3")) break;
                    n2 = 3;
                    break;
                }
                case 50: {
                    if (!string2.equals((Object)"2")) break;
                    n2 = 2;
                    break;
                }
                case 49: {
                    if (!string2.equals((Object)"1")) break;
                    n2 = 1;
                    break;
                }
                case 48: {
                    if (!string2.equals((Object)"0")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    break;
                }
                case 3: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.getString(2131755394));
                    stringBuilder.append(" ");
                    stringBuilder.append(c2.d);
                    string = stringBuilder.toString();
                    this.u.b = c2.c;
                    break;
                }
                case 2: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.getString(2131755393));
                    stringBuilder.append(" ");
                    stringBuilder.append(c2.c);
                    stringBuilder.append(" - ");
                    stringBuilder.append(c2.d);
                    string = stringBuilder.toString();
                    this.u.b = c2.c;
                    break;
                }
                case 1: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.getString(2131755392));
                    stringBuilder.append(" ");
                    stringBuilder.append(c2.c);
                    string = stringBuilder.toString();
                    this.u.b = c2.c;
                    break;
                }
                case 0: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.getString(2131755391));
                    stringBuilder.append(" ");
                    stringBuilder.append(c2.b);
                    string = stringBuilder.toString();
                    this.u.b = c2.b;
                }
            }
            this.u.d = string;
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", (Serializable)this.u);
            Intent intent = new Intent("com.mobond.mindicator.ui.livetrain.trainutils.InsideLocalTrainService.broadcast");
            intent.putExtra("tn", this.a);
            intent.putExtra("bundle", bundle);
            intent.putExtra("homescreentraininfo", this.u.d);
            intent.putExtra("posfound", true);
            androidx.h.a.a.a((Context)this).a(intent);
        }
    }

    private void b(String string) {
        Intent intent = new Intent("com.mobond.mindicator.ui.livetrain.trainutils.InsideLocalTrainService.broadcast");
        intent.putExtra("message", string);
        androidx.h.a.a.a((Context)this).a(intent);
    }

    private Notification c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("inside_train_no_vibrate_05", (CharSequence)"User Mumbai Local Inside Train", 4);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound(null, null);
            notificationChannel.setVibrationPattern(new long[]{0L});
            notificationChannel.setLockscreenVisibility(1);
            this.L.createNotificationChannel(notificationChannel);
        }
        this.I = new RemoteViews(context.getPackageName(), 2131493122);
        this.I.setTextViewText(2131297550, (CharSequence)this.f.split("#")[0].trim());
        this.I.setTextViewText(2131297544, (CharSequence)f.b(this.g));
        com.mobond.mindicator.ui.lt.a.a a2 = this.u;
        if (a2 != null && a2.b()) {
            this.I.setTextViewText(2131297555, (CharSequence)this.u.d);
            this.I.setViewVisibility(2131297555, 0);
            this.I.setViewVisibility(2131297544, 8);
        } else {
            this.I.setViewVisibility(2131297555, 8);
            this.I.setViewVisibility(2131297544, 0);
        }
        Intent intent = new Intent(context, TraceTrainUI2.class);
        intent.addFlags(536870912);
        intent.putExtra("selected_route", this.d);
        intent.putExtra("you_are_at", this.e);
        intent.putExtra("selected_train_string", this.f);
        intent.putExtra("tn", this.a);
        intent.putExtra("selected_direction", this.b);
        PendingIntent pendingIntent = PendingIntent.getActivity((Context)context, (int)1245, (Intent)intent, (int)134217728);
        this.M = new h.d(context, "inside_train_no_vibrate_05").a(pendingIntent).a(this.I).b(true).c(true).a(ActivityAlarmRing.a()).a(System.currentTimeMillis()).b();
        return this.M;
    }

    private boolean c(String string) {
        ArrayList<String> arrayList;
        return string != null && string.equals((Object)((String)(arrayList = this.B).get(arrayList.size() - 1)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static float[] c(String string, boolean bl) {
        String[] arrstring = string.split(":");
        String string2 = arrstring[0];
        String string3 = arrstring[1];
        String string4 = arrstring[2];
        int n2 = Integer.parseInt((String)arrstring[3]);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(string3);
        stringBuilder.append(":");
        stringBuilder.append(string4);
        String string5 = stringBuilder.toString();
        if (!o.containsKey((Object)string5)) return null;
        String[] arrstring2 = ((String)o.get((Object)string5)).split(":");
        int n3 = Integer.parseInt((String)arrstring2[0]);
        int n4 = Integer.parseInt((String)arrstring2[1]);
        com.mulo.util.b b2 = p.b(n3, n4);
        int n5 = 0;
        do {
            block5 : {
                try {
                    if (n5 < b2.c()) {
                        if (n2 == b2.d(n5)) {
                            int n6 = n5 + 4;
                            return new float[]{b2.c(n6), b2.c(n6 + 4)};
                        }
                        break block5;
                    }
                    if (!bl) return null;
                    return new float[]{b2.c(4), b2.c(8)};
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Exception 4  ");
                    stringBuilder2.append(exception.getMessage());
                    Log.d((String)"77777", (String)stringBuilder2.toString());
                }
                return null;
            }
            n5 += 12;
        } while (true);
    }

    private Notification d(Context context) {
        String string = this.g.split("-")[1].trim();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("inside_train_no_vibrate_05", (CharSequence)"User Mumbai Local Inside Train", 4);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound(null, null);
            notificationChannel.setVibrationPattern(new long[]{0L});
            notificationChannel.setLockscreenVisibility(1);
            this.L.createNotificationChannel(notificationChannel);
        }
        h.d d2 = new h.d(context, "inside_train_no_vibrate_05");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("You have reached ");
        stringBuilder.append(string);
        return d2.a((CharSequence)stringBuilder.toString()).b((CharSequence)"Thank you for sharing live train status").d(true).c(true).a(ActivityAlarmRing.a()).a(System.currentTimeMillis()).b();
    }

    static /* synthetic */ Object e() {
        return H;
    }

    private void f() {
        if (this.a(this.s)) {
            Intent intent = new Intent(this.s, AlarmReceiver.class);
            intent.setAction("cancel_noti");
            PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)this.s.getApplicationContext(), (int)1014, (Intent)intent, (int)268435456);
            AlarmManager alarmManager = (AlarmManager)this.s.getSystemService("alarm");
            long l2 = 3600000L + System.currentTimeMillis();
            if (alarmManager != null) {
                int n2 = Build.VERSION.SDK_INT;
                if (n2 >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(0, l2, pendingIntent);
                } else if (n2 >= 19) {
                    alarmManager.setExact(0, l2, pendingIntent);
                } else {
                    alarmManager.set(0, l2, pendingIntent);
                }
            }
            this.L.notify(1919, this.d(this.s));
        }
    }

    @SuppressLint(value={"MissingPermission"})
    @TargetApi(value=17)
    private void g() {
        this.q = new PhoneStateListener(){

            public void onCellLocationChanged(CellLocation cellLocation) {
                super.onCellLocationChanged(cellLocation);
                try {
                    InsideLocalTrainService.this.a(cellLocation, true);
                }
                catch (Exception exception) {}
            }
        };
        this.r.listen(this.q, 16);
        CellLocation.requestLocationUpdate();
    }

    private void h() {
        this.r.listen(this.q, 0);
    }

    public void a() {
        this.a(false);
    }

    /*
     * Exception decompiling
     */
    public void a(String var1) {
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

    public void a(boolean bl) {
        b b2 = this.J;
        if (b2 != null) {
            b2.a();
            this.J.cancel(true);
        }
        if (this.q != null) {
            this.h();
        }
        if (this.a != null) {
            String string = this.g.split("-")[1].trim();
            Intent intent = new Intent("com.mobond.mindicator.ui.livetrain.trainutils.InsideLocalTrainService.broadcast");
            intent.putExtra("inside_train_off", true);
            intent.putExtra("is_user_reached_dest", bl);
            intent.putExtra("dest", string);
            intent.putExtra("tn", new String(this.a));
            androidx.h.a.a.a((Context)this).a(intent);
        }
        this.stopSelf();
    }

    public boolean a(Context context) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager)context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (!this.getClass().getName().equals((Object)runningServiceInfo.service.getClassName()) || !runningServiceInfo.foreground) continue;
            return true;
        }
        return false;
    }

    public void b() {
        if (!this.a(this.s)) {
            return;
        }
        if (this.y != null) {
            boolean bl = System.currentTimeMillis() - this.y.h > 60000L;
            if (this.y.j && !bl) {
                if (this.a(this.y)) {
                    this.m = this.l;
                    this.a(this.s, this.t, this.a, this.c, this.m, this.d, this.y, true);
                    this.c();
                    return;
                }
                this.a(this.s, this.t, this.a, this.c, this.m, this.d, this.y, false);
                return;
            }
            String string = this.y.k;
            if (string != null && !this.C) {
                this.b(string);
            }
        }
    }

    public void c() {
        this.f();
        this.a(true);
    }

    public void d() {
        this.C = true;
    }

    public IBinder onBind(Intent intent) {
        return this.K;
    }

    public void onCreate() {
        super.onCreate();
        this.s = this;
        this.F = com.mobond.mindicator.a.a(this.s);
        this.L = (NotificationManager)this.getSystemService("notification");
        this.r = (TelephonyManager)this.s.getSystemService("phone");
        this.G = r.a(this.s);
    }

    public void onDestroy() {
        Log.d((String)"1111", (String)"InsideLocalTrainService onDestroy.");
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        if (intent.getBooleanExtra("stop_service", false)) {
            this.a();
        } else {
            try {
                this.C = false;
                this.a = intent.getStringExtra("tn");
                this.b = intent.getIntExtra("selected_direction", 0);
                this.c = intent.getStringExtra("userid");
                this.g = intent.getStringExtra("subtitle");
                this.d = intent.getStringExtra("selected_route");
                this.e = intent.getStringExtra("you_are_at");
                this.f = intent.getStringExtra("selected_train_string");
                this.D = intent.getBooleanExtra("rt", false);
                this.startForeground(1818, this.c(this.s));
                if (Build.VERSION.SDK_INT >= 17) {
                    this.g();
                }
                this.n = h.b((String)this.d, (String)this.f, (Object)this.s);
                this.a(this.n);
                this.v = new com.mobond.mindicator.ui.lt.trainutils.a.a(this.n, this.b, this.s);
                if (this.e.equalsIgnoreCase(this.n[0].a)) {
                    this.E = true;
                }
                this.J = new b(this, 30000);
                this.J.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
            }
            catch (Exception exception) {
                Log.d((String)"LocalInsideTrainService", (String)exception.getMessage(), (Throwable)exception);
            }
        }
        return 2;
    }

    public class a
    extends Binder {
        public InsideLocalTrainService a() {
            return InsideLocalTrainService.this;
        }
    }

    public static class b
    extends AsyncTask<Void, Void, Void> {
        private long a = 0L;
        private boolean b = true;
        private int c;
        private WeakReference<InsideLocalTrainService> d;

        b(InsideLocalTrainService insideLocalTrainService, int n2) {
            this.d = new WeakReference((Object)insideLocalTrainService);
            this.c = n2;
        }

        private long b() {
            return System.currentTimeMillis() - ((InsideLocalTrainService)this.d.get()).z;
        }

        /*
         * Exception decompiling
         */
        protected /* varargs */ Void a(Void ... var1) {
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
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        /*
         * Exception decompiling
         */
        void a() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl15.1 : ALOAD_3 : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
            return this.a((Void[])arrobject);
        }
    }

}

