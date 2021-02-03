/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 *  android.util.Log
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus
 *  com.mobond.mindicator.ui.indianrail.seatavailability.b.b$1
 *  com.mobond.mindicator.ui.indianrail.seatavailability.b.b$2
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package com.mobond.mindicator.ui.indianrail.seatavailability.b;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.irplugin.SeatAvailabilityInterface;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.indianrail.seatavailability.b.a;
import com.mobond.mindicator.ui.indianrail.seatavailability.b.b;

public class b
implements Runnable {
    private String a;
    private String b;
    private int c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private byte j;
    private int k;
    private ActivitySeatStatus l;
    private boolean m;

    public b(String string, String string2, int n2, int n3, String string3, String string4, String string5, int n4, byte by, int n5, ActivitySeatStatus activitySeatStatus, boolean bl) {
        this.b = string;
        this.a = string2;
        this.c = n2;
        this.d = n3;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.i = n4;
        this.j = by;
        this.k = n5;
        this.l = activitySeatStatus;
        this.m = bl;
    }

    public b(String string, String string2, int n2, int n3, String string3, String string4, String string5, String string6, int n4, byte by, int n5, ActivitySeatStatus activitySeatStatus, boolean bl) {
        this.b = string;
        this.a = string2;
        this.c = n2;
        this.d = n3;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.i = n4;
        this.j = by;
        this.k = n5;
        this.l = activitySeatStatus;
        this.m = bl;
        this.h = string6;
    }

    private Thread a() {
        return Thread.currentThread();
    }

    static /* synthetic */ void a(b b2) {
        b2.b();
    }

    static /* synthetic */ void a(b b2, boolean bl, String string) {
        b2.a(bl, string);
    }

    private void a(boolean bl, String string) {
        if (!this.l.h) {
            if (bl) {
                a.a().a(this.a, this.i, "EXCEPTION", this.a().getId());
                return;
            }
            if (!string.equals((Object)"CANCELLED")) {
                if (this.g != null) {
                    a.a().a(this.a, this.i, "SUCCESS", string, this.a().getId());
                    return;
                }
                try {
                    a.a().a(this.a, string, this.c, this.d, this.i, this.a().getId());
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
            a.a().a(this.a, this.i);
        }
    }

    private void b() {
        try {
            a.a().a(this.a().getId(), this.a, this.i, this.m);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"queryrunnable", (String)"Exception in handlePostResponse", (Throwable)exception);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void run() {
        Process.setThreadPriority((int)1);
        var3_1 = new boolean[1];
        {
            catch (Exception var1_3) {
                Log.d((String)"queryrunnable", (String)var1_3.getMessage(), (Throwable)var1_3);
                return;
            }
        }
        try {
            if (this.g != null) {
                IRParserProvider.getIRParser().getSeatStatus(this.h, this.a, this.c, this.d, this.e, this.f, this.g, this.k, (Context)this.l, (SeatAvailabilityInterface)new 1(this, var3_1));
            } else {
                IRParserProvider.getIRParser().getClasses(this.a, this.c, this.d, this.e, this.f, this.k, (SeatAvailabilityInterface)new 2(this, var3_1));
            }
            ** GOTO lbl17
        }
        catch (Exception var4_2) {
            var4_2.printStackTrace();
            var3_1[0] = true;
lbl17: // 3 sources:
            this.j = (byte)(1 + this.j);
            return;
        }
    }
}

