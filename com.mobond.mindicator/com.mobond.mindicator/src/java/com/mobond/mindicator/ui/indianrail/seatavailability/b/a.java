/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.widget.Toast
 *  com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus
 *  com.mobond.mindicator.ui.indianrail.seatavailability.b
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 */
package com.mobond.mindicator.ui.indianrail.seatavailability.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;
import com.mobond.mindicator.ui.indianrail.a.d;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.indianrail.seatavailability.b;
import com.mobond.mindicator.ui.indianrail.seatavailability.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class a {
    private static a c;
    public HashMap<Long, Thread> a = new HashMap();
    long b;
    private ExecutorService d = Executors.newFixedThreadPool((int)4);
    private int e = 0;
    private ActivitySeatStatus f;
    private int g = 10;

    @SuppressLint(value={"UseSparseArrays"})
    private a(ActivitySeatStatus activitySeatStatus) {
        this.f = activitySeatStatus;
        this.e = 0;
    }

    public static a a() {
        return c;
    }

    public static void a(ActivitySeatStatus activitySeatStatus) {
        c = new a(activitySeatStatus);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(boolean bl) {
        a a2 = this;
        synchronized (a2) {
            this.e = bl ? 1 + this.e : -1 + this.e;
            return;
        }
    }

    void a(long l2, String string, int n2, boolean bl) {
        a a2 = this;
        synchronized (a2) {
            if (this.f != null && !this.f.h) {
                byte by;
                ActivitySeatStatus activitySeatStatus = this.f;
                com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.f.i.a.get(n2);
                b2.j = by = (byte)(-1 + b2.j);
                activitySeatStatus.a(n2, string, by, 6);
                if (!bl) {
                    this.a(false);
                    if (this.e < 4 && this.g != -100) {
                        this.f.d();
                    }
                }
            }
            return;
        }
    }

    public void a(com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2, String string, int n2, int n3, int n4, byte by, Toast toast) {
        byte by2;
        f f2;
        f f3 = b2.a;
        byte by3 = b2.j;
        if (string != null) {
            byte by4 = (byte)(by3 + 1);
            com.mobond.mindicator.ui.indianrail.seatavailability.b.b b3 = new com.mobond.mindicator.ui.indianrail.seatavailability.b.b(f3.e, f3.a, n2, n3, f3.q, f3.r, "", string, n4, by, 60000, this.f, true);
            Thread thread = new Thread((Runnable)b3);
            this.b = thread.getId();
            this.a.put((Object)thread.getId(), (Object)thread);
            thread.start();
            toast.setText(2131755277);
            toast.show();
            by2 = by4;
            f2 = f3;
        } else {
            byte by5 = (byte)(by3 + 1);
            String string2 = f3.e;
            String string3 = f3.a;
            String string4 = f3.q;
            String string5 = f3.r;
            ActivitySeatStatus activitySeatStatus = this.f;
            f2 = f3;
            com.mobond.mindicator.ui.indianrail.seatavailability.b.b b4 = new com.mobond.mindicator.ui.indianrail.seatavailability.b.b(string2, string3, n2, n3, string4, string5, null, n4, by, 60000, activitySeatStatus, true);
            Thread thread = new Thread((Runnable)b4);
            this.a.put((Object)thread.getId(), (Object)thread);
            thread.start();
            toast.setText(2131755277);
            toast.show();
            by2 = by5;
        }
        this.f.a(n4, f2.a, by2, 6);
        this.f.b(n4);
    }

    public void a(String string, int n2) {
        this.f.a(string, n2);
    }

    public void a(String string, int n2, String string2, long l2) {
        int n3 = this.g;
        if (n3 != 100 && n3 != -100) {
            this.g = n3 - 1;
            if (this.g == 0) {
                this.g = -100;
                this.f.f();
            }
        }
        this.f.a(n2, string, string2, 6);
        this.f.b(n2);
    }

    public void a(String string, int n2, String string2, String string3, long l2) {
        if (this.g != 100) {
            this.g = 100;
        }
        this.f.a(n2, string, string2, string3);
        this.f.b(n2);
    }

    public void a(String string, String string2, int n2, int n3, int n4, long l2) {
        this.f.a(string, string2);
        com.mobond.mindicator.ui.indianrail.seatavailability.a.b b2 = (com.mobond.mindicator.ui.indianrail.seatavailability.a.b)this.f.i.a.get(n4);
        d.a(string, b2.a.e, b2.a.t, b2.a.q, b2.a.r, ((com.mobond.mindicator.ui.indianrail.seatavailability.a.c)this.f.m.a.get((Object)string)).b, ((com.mobond.mindicator.ui.indianrail.seatavailability.a.c)this.f.m.a.get((Object)string)).a, null, (Context)this.f);
        this.f.a(n2, n3, n4, (byte)0);
        this.f.b(n4);
    }

    public void b() {
        this.d.shutdownNow();
    }

    void c() {
        if (this.a.containsKey((Object)this.b)) {
            this.a.remove((Object)this.b);
        }
    }
}

