/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.location.Location
 *  android.location.LocationListener
 *  android.location.LocationManager
 *  com.google.android.gms.common.api.b
 *  com.google.android.gms.common.api.k
 *  com.google.android.gms.d.e
 *  com.google.android.gms.d.k
 *  com.google.android.gms.location.LocationRequest
 *  com.google.android.gms.location.LocationResult
 *  com.google.android.gms.location.b
 *  com.google.android.gms.location.d
 *  com.google.android.gms.location.e
 *  com.google.android.gms.location.f
 *  com.google.android.gms.location.g
 *  com.google.android.gms.location.g$a
 *  com.google.android.gms.location.h
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.k;
import com.google.android.gms.d.e;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.d;
import com.google.android.gms.location.f;
import com.google.android.gms.location.g;
import com.google.android.gms.location.h;
import com.mobond.mindicator.a.a;

public class a
implements com.google.android.gms.location.e {
    private long a = -1L;
    private long b = 30000L;
    private long c = 5000L;
    private long d = -1L;
    private boolean e = false;
    public double f;
    public double g;
    int h = 100;
    LocationListener i = new LocationListener(this){
        final /* synthetic */ a a;
        {
            this.a = a2;
        }

        public void onLocationChanged(Location location) {
            this.a.a(location);
        }

        public void onProviderDisabled(String string) {
        }

        public void onProviderEnabled(String string) {
        }

        public void onStatusChanged(String string, int n2, android.os.Bundle bundle) {
        }
    };
    private LocationRequest j;
    private com.google.android.gms.location.b k;
    private d l;

    public static boolean a(Context context) {
        return ((LocationManager)context.getSystemService("location")).isProviderEnabled("gps");
    }

    private long b() {
        return this.a;
    }

    public static void b(final Activity activity) {
        LocationRequest locationRequest = LocationRequest.a().a(100).a(10000L).c(1000L);
        g.a a2 = new g.a().a(locationRequest);
        a2.a(true);
        f.a((Activity)activity).a(a2.a()).a((e)new e<h>(){

            public void onComplete(com.google.android.gms.d.k<h> k2) {
                try {
                    (h)k2.a(b.class);
                    return;
                }
                catch (b b2) {
                    if (b2.a() != 6) {
                        return;
                    }
                    try {
                        ((k)b2).a(activity, 199);
                    }
                    catch (IntentSender.SendIntentException sendIntentException) {}
                    return;
                }
            }
        });
    }

    private void c(Context context) {
        this.k = f.a((Context)context);
        this.l = new d(){

            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);
                a.this.a(locationResult.a());
            }
        };
    }

    /*
     * Exception decompiling
     */
    public void a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl18 : RETURN : trying to set 0 previously set to 1
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

    public void a(int n2) {
        this.h = n2;
    }

    public void a(long l2) {
        this.d = l2;
    }

    public void a(Activity activity) {
        if (!a.a((Context)activity)) {
            a.b(activity);
            return;
        }
        this.b((Context)activity);
    }

    public void a(Location location) {
        this.f = location.getLatitude();
        this.g = location.getLongitude();
    }

    public void b(long l2) {
        this.b = l2;
    }

    /*
     * Exception decompiling
     */
    public void b(Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl60 : RETURN : trying to set 0 previously set to 1
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

}

