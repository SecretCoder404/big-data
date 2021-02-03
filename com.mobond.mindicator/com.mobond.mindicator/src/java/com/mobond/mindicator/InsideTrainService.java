/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningServiceInfo
 *  android.app.NotificationManager
 *  android.app.Service
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  android.util.Log
 *  androidx.h.a.a
 *  com.mobond.mindicator.InsideTrainService$1
 *  com.mobond.mindicator.InsideTrainService$2
 *  com.mobond.mindicator.a.a
 *  com.mobond.mindicator.ui.indianrail.a.a
 *  com.mobond.mindicator.ui.indianrail.a.a$b
 *  com.mobond.mindicator.ui.indianrail.a.f
 *  com.mobond.mindicator.ui.indianrail.a.g
 *  com.mobond.mindicator.ui.indianrail.util.c
 *  com.mulo.b.a
 *  com.mulo.b.c
 *  com.mulo.b.h
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Vector
 */
package com.mobond.mindicator;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.mobond.mindicator.InsideTrainService;
import com.mobond.mindicator.a.a;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mobond.mindicator.ui.indianrail.util.c;
import java.util.List;
import java.util.Vector;

public class InsideTrainService
extends Service {
    private int a = 0;
    private a b;
    private NotificationManager c;
    private Vector<g> d;
    private a.b e = null;
    private String f;
    private String g;
    private String h;
    private String i;
    private Context j;

    static /* synthetic */ int a(InsideTrainService insideTrainService, int n2) {
        insideTrainService.a = n2;
        return n2;
    }

    static /* synthetic */ a.b a(InsideTrainService insideTrainService, a.b b2) {
        insideTrainService.e = b2;
        return b2;
    }

    static /* synthetic */ String a(InsideTrainService insideTrainService, String string) {
        insideTrainService.h = string;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Vector<g> a(Context context, String string) {
        Vector vector = null;
        try {
            c c2 = new c(context);
            int n2 = c2.a(string);
            vector = null;
            if (n2 != 0) {
                return c2.b(string);
            }
            f f2 = com.mobond.mindicator.ui.indianrail.a.a.a((String)string, (Context)context);
            vector = null;
            if (f2 == null) return vector;
            {
                vector = f2.a();
                for (g g2 : vector) {
                    g2.i = com.mobond.mindicator.ui.indianrail.a.a.d((String)g2.a);
                }
                return vector;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return vector;
    }

    static /* synthetic */ Vector a(InsideTrainService insideTrainService) {
        return insideTrainService.d;
    }

    static /* synthetic */ Vector a(InsideTrainService insideTrainService, Context context, String string) {
        return insideTrainService.a(context, string);
    }

    static /* synthetic */ Vector a(InsideTrainService insideTrainService, Vector vector) {
        insideTrainService.d = vector;
        return vector;
    }

    private void a() {
        this.b = new 1(this);
    }

    private void a(Context context, a.b b2, String[] arrstring) {
        String string = arrstring[0];
        String string2 = arrstring[1];
        String string3 = b2.k().isEmpty() ? b2.i() : b2.j();
        String string4 = String.valueOf((int)b2.l());
        String string5 = this.f;
        String string6 = this.g;
        com.mulo.b.h h2 = new com.mulo.b.h();
        h2.a("lat", string2);
        h2.a("lon", string);
        h2.a("nextstncode", string3);
        h2.a("distfromnextstn", string4);
        h2.a("trainnumber", string5);
        h2.a("lang", com.mobond.mindicator.a.a(context).w());
        if (string6 != null) {
            String[] arrstring2 = string6.split(",");
            h2.a("pnr", arrstring2[0]);
            h2.a("pnrdateofjrny", arrstring2[1]);
            h2.a("pnrboardingstncode", arrstring2[2]);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(arrstring2[3].equals((Object)"0"));
            h2.a("pnrconf", stringBuilder.toString());
        }
        com.mulo.b.c.a((String)"http://mobondhrd.appspot.com/irputrunninggpsdata", (com.mulo.b.h)h2, null, (com.mulo.b.a)new 2(this), null, null, (Context)context, null);
    }

    static /* synthetic */ void a(InsideTrainService insideTrainService, Context context, a.b b2, String[] arrstring) {
        insideTrainService.a(context, b2, arrstring);
    }

    static /* synthetic */ Context b(InsideTrainService insideTrainService) {
        return insideTrainService.j;
    }

    static /* synthetic */ String b(InsideTrainService insideTrainService, String string) {
        insideTrainService.i = string;
        return string;
    }

    private void b() {
        this.b.a();
        this.stopForeground(true);
        this.stopSelf();
        Intent intent = new Intent("com.mobond.mindicator.InsideTrainService.broadcast");
        intent.putExtra("inside_train_off", true);
        androidx.h.a.a.a((Context)this.j).a(intent);
    }

    static /* synthetic */ String c(InsideTrainService insideTrainService) {
        return insideTrainService.f;
    }

    static /* synthetic */ a.b d(InsideTrainService insideTrainService) {
        return insideTrainService.e;
    }

    static /* synthetic */ NotificationManager e(InsideTrainService insideTrainService) {
        return insideTrainService.c;
    }

    static /* synthetic */ String f(InsideTrainService insideTrainService) {
        return insideTrainService.h;
    }

    static /* synthetic */ String g(InsideTrainService insideTrainService) {
        return insideTrainService.i;
    }

    static /* synthetic */ int h(InsideTrainService insideTrainService) {
        return insideTrainService.a;
    }

    static /* synthetic */ void i(InsideTrainService insideTrainService) {
        insideTrainService.b();
    }

    public boolean a(Context context) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager)context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (!this.getClass().getName().equals((Object)runningServiceInfo.service.getClassName()) || !runningServiceInfo.foreground) continue;
            return true;
        }
        return false;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        this.j = this;
        this.c = (NotificationManager)this.getSystemService("notification");
        this.a();
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        Log.d((String)"InsideLocalTrainService", (String)"in onStartCommand");
        boolean bl2 = intent.getBooleanExtra("stop_foreground_service", false);
        this.f = intent.getStringExtra("com.mobond.mindicator.InsideTrainService.extra.trainnumber");
        this.g = intent.getStringExtra("com.mobond.mindicator.InsideTrainService.extra.pnr_associated_with_train");
        Log.d((String)"InsideLocalTrainService", (String)"onStartCommand: 1111");
        if (bl2) {
            this.b();
        } else if (h.a(this.j, "android.permission.ACCESS_FINE_LOCATION") && a.a((Context)this)) {
            this.b.b((Context)this);
        } else {
            this.b.a();
        }
        return 2;
    }
}

