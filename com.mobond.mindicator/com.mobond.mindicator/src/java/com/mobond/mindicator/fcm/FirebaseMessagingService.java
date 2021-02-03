/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.location.Location
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings
 *  android.provider.Settings$System
 *  android.telephony.CellLocation
 *  android.telephony.TelephonyManager
 *  android.telephony.gsm.GsmCellLocation
 *  android.text.TextUtils
 *  android.util.Log
 *  androidx.core.app.h
 *  androidx.core.app.h$a
 *  androidx.core.app.h$a$a
 *  androidx.core.app.h$b
 *  androidx.core.app.h$c
 *  androidx.core.app.h$d
 *  androidx.core.app.h$e
 *  com.google.firebase.messaging.FirebaseMessagingService
 *  com.google.firebase.messaging.b
 *  com.google.firebase.messaging.b$a
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Map
 */
package com.mobond.mindicator.fcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.h;
import com.google.firebase.messaging.b;
import com.mobond.mindicator.RegInfo2;
import com.mobond.mindicator.SplashUI;
import com.mobond.mindicator.fcm.FirebaseMessagingService;
import com.mobond.mindicator.fcm.b;
import com.mobond.mindicator.g;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mulo.b.c;
import com.mulo.b.e;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class FirebaseMessagingService
extends com.google.firebase.messaging.FirebaseMessagingService {
    Context a;

    public static double a(double d2) {
        return d2 * 0.017453292519943295;
    }

    public static void a(Context context, int n2) {
        NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(n2);
        }
    }

    private static boolean a(Context context, String string) {
        try {
            context.getPackageManager().getPackageInfo(string, 1);
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    private boolean a(String string, com.google.firebase.messaging.b b2) {
        TelephonyManager telephonyManager = (TelephonyManager)this.a.getSystemService("phone");
        if (telephonyManager != null) {
            GsmCellLocation gsmCellLocation;
            int n2 = telephonyManager.getPhoneType();
            CellLocation.requestLocationUpdate();
            if (n2 == 1 && h.a(this.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") && (gsmCellLocation = (GsmCellLocation)telephonyManager.getCellLocation()) != null) {
                String string2 = telephonyManager.getNetworkOperator();
                String string3 = string2.substring(0, 3);
                String string4 = string2.substring(3);
                int n3 = gsmCellLocation.getLac();
                int n4 = gsmCellLocation.getCid();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(":");
                stringBuilder.append(string4);
                stringBuilder.append(":");
                stringBuilder.append(n3);
                stringBuilder.append(":");
                stringBuilder.append(n4);
                String string5 = stringBuilder.toString();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("tower info: ");
                stringBuilder2.append(string5);
                Log.d((String)"fcmpush", (String)stringBuilder2.toString());
                if (string.contains((CharSequence)string5)) {
                    this.b(b2);
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void b(com.google.firebase.messaging.b b2) {
        Intent intent;
        block28 : {
            boolean bl;
            String string;
            String string2;
            com.mobond.mindicator.a.a((Context)this).B();
            if (b2.a().size() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Message data payload: ");
                stringBuilder.append((Object)b2.a());
                Log.d((String)"fcmpush", (String)stringBuilder.toString());
            }
            if (b2.b() != null) {
                String string3 = b2.b().a();
                if (string3 == null) {
                    string3 = (String)b2.a().get((Object)"title");
                }
                if ((string2 = b2.b().b()) == null) {
                    string2 = (String)b2.a().get((Object)"message");
                    string = string3;
                } else {
                    string = string3;
                }
            } else {
                String string4 = (String)b2.a().get((Object)"title");
                string2 = (String)b2.a().get((Object)"message");
                string = string4;
            }
            String string5 = (String)b2.a().get((Object)"imageurl");
            String string6 = (String)b2.a().get((Object)"activityname");
            String string7 = (String)b2.a().get((Object)"autostart");
            String string8 = (String)b2.a().get((Object)"update_remote_config");
            String string9 = (String)b2.a().get((Object)"openurl");
            String string10 = (String)b2.a().get((Object)"isalert");
            String string11 = (String)b2.a().get((Object)"alert_type");
            String string12 = (String)b2.a().get((Object)"analytics_id");
            String string13 = (String)b2.a().get((Object)"issound");
            String string14 = (String)b2.a().get((Object)"isping");
            String string15 = (String)b2.a().get((Object)"openchatroom");
            String string16 = (String)b2.a().get((Object)"giparent");
            Map map = b2.a();
            String string17 = string2;
            String string18 = (String)map.get((Object)"db_url");
            String string19 = (String)b2.a().get((Object)"i");
            String string20 = (String)b2.a().get((Object)"t");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("openurl ");
            stringBuilder.append(string9);
            stringBuilder.append("isalert ");
            stringBuilder.append(string10);
            stringBuilder.append(" alert_type: ");
            stringBuilder.append(string11);
            Log.d((String)"fcmpuchc", (String)stringBuilder.toString());
            if (string7 == null || string7.equalsIgnoreCase("")) {
                string7 = "false";
            }
            if (string8 != null && string8.equalsIgnoreCase("true")) {
                com.mobond.mindicator.fcm.a.a().a(null);
            }
            Bitmap bitmap = string5 != null ? this.c(string5) : null;
            if (string11 != null) {
                if (string11.equals((Object)"ir")) {
                    bl = true;
                } else if (string11.equals((Object)"mumbai")) {
                    bl = this.a.getSharedPreferences("m-indicator", 0).getString("city", "mumbai").toLowerCase().equals((Object)"mumbai");
                } else {
                    String string21 = this.a.getSharedPreferences("m-indicator", 0).getString("city", "mumbai").toLowerCase();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("com.mobond.mindicator.");
                    stringBuilder2.append(string11);
                    String string22 = stringBuilder2.toString();
                    if (string21.equals((Object)string11) && FirebaseMessagingService.a(this.a, string22)) {
                        bl = true;
                    } else {
                        boolean bl2 = (string21.equals((Object)"mumbai") || string21.equals((Object)"pune")) && string11.equals((Object)"msrtc") && FirebaseMessagingService.a(this.a, string22);
                        bl = bl2;
                    }
                }
                if (string11.equals((Object)"all")) {
                    bl = true;
                }
            } else {
                bl = true;
            }
            String string23 = !bl ? "" : string17;
            if (string7.equalsIgnoreCase("false")) {
                if (string23 == null) return;
                if (string23.equalsIgnoreCase("")) return;
                this.a(string, string23, bitmap, string6, string9, string10, string12, string13, string14, string11, string15, string16, string18, string19, string20);
                return;
            }
            if (string6 != null && !string6.equalsIgnoreCase("")) {
                void var40_36;
                block29 : {
                    block30 : {
                        Class.forName((String)string6);
                        try {
                            intent = new Intent((Context)this, SplashUI.class);
                        }
                        catch (Exception exception) {
                            break block30;
                        }
                        try {
                            intent.putExtra("activityname", string6);
                            break block28;
                        }
                        catch (Exception exception) {
                            break block29;
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    intent = null;
                }
                var40_36.printStackTrace();
            } else {
                intent = new Intent((Context)this, SplashUI.class);
            }
        }
        if (intent == null) return;
        PendingIntent pendingIntent = PendingIntent.getActivity((Context)this.getApplicationContext(), (int)1, (Intent)intent, (int)268435456);
        try {
            pendingIntent.send();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void b(String string, final com.google.firebase.messaging.b b2) {
        String[] arrstring = string.split("_");
        final String string2 = arrstring[0];
        final String string3 = arrstring[1];
        final String string4 = arrstring[2];
        com.mobond.mindicator.a.a a2 = new com.mobond.mindicator.a.a(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public void a(Location location) {
                super.a(location);
                this.a();
                double d2 = location.getLatitude();
                double d3 = location.getLongitude();
                if (d2 == 0.0 || d3 == 0.0) return;
                try {
                    if (!(FirebaseMessagingService.this.a(d2, d3, Double.parseDouble((String)string2), Double.parseDouble((String)string3)) < Double.parseDouble((String)string4))) return;
                    FirebaseMessagingService.this.b(b2);
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        };
        a2.a(102);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this, a2){
            final /* synthetic */ com.mobond.mindicator.a.a a;
            final /* synthetic */ FirebaseMessagingService b;
            {
                this.b = firebaseMessagingService;
                this.a = a2;
            }

            public void run() {
                if (h.a(this.b.a, "android.permission.ACCESS_FINE_LOCATION") && com.mobond.mindicator.a.a.a(this.b.getApplicationContext())) {
                    this.a.b(this.b.getApplicationContext());
                }
            }
        }, 800L);
    }

    private Bitmap c(String string) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)httpURLConnection.getInputStream());
            return bitmap;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Log.d((String)"fcmpush", (String)"image load error");
            return null;
        }
    }

    public double a(double d2, double d3, double d4, double d5) {
        double d6 = FirebaseMessagingService.a(d4 - d2);
        double d7 = FirebaseMessagingService.a(d5 - d3);
        double d8 = FirebaseMessagingService.a(0.0);
        double d9 = FirebaseMessagingService.a(0.0);
        double d10 = d6 / 2.0;
        double d11 = Math.sin((double)d10) * Math.sin((double)d10);
        double d12 = d7 / 2.0;
        double d13 = d11 + Math.sin((double)d12) * Math.sin((double)d12) * Math.cos((double)d8) * Math.cos((double)d9);
        double d14 = 2.0 * Math.atan2((double)Math.sqrt((double)d13), (double)Math.sqrt((double)(1.0 - d13)));
        double d15 = 6371;
        Double.isNaN((double)d15);
        return 1000.0 * (d15 * d14);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(com.google.firebase.messaging.b b2) {
        try {
            this.a = this.getApplicationContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Push received ");
            stringBuilder.append((Object)this.a);
            Log.d((String)"fcmpush", (String)stringBuilder.toString());
            String string = (String)b2.a().get((Object)"lat_lon_range");
            String string2 = (String)b2.a().get((Object)"tower");
            if (string2 != null) {
                if (this.a(string2, b2)) return;
                if (string == null) return;
                this.b(string, b2);
                return;
            }
            if (string != null) {
                this.b(string, b2);
                return;
            }
            this.b(b2);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(String var1_1, String var2_2, Bitmap var3_3, String var4_4, String var5_5, String var6_6, String var7_7, String var8_8, String var9_9, String var10_10, String var11_11, String var12_12, String var13_13, String var14_14, String var15_15) {
        var16_16 = new StringBuilder();
        var16_16.append("recieved 111 title:");
        var16_16.append(var1_1);
        var16_16.append("\nmessage:");
        var16_16.append(var2_2);
        var16_16.append("\nactivityname:");
        var16_16.append(var4_4);
        var16_16.append("\nopenurl:");
        var16_16.append(var5_5);
        var16_16.append("\nisalert:");
        var16_16.append(var6_6);
        Log.d((String)"fcmpush", (String)var16_16.toString());
        var28_17 = Boolean.parseBoolean((String)var8_8);
        if (var4_4 == null) ** GOTO lbl-1000
        try {
            if (!var4_4.equalsIgnoreCase("")) {
                Class.forName((String)var4_4);
                var36_18 = new Intent((Context)this, SplashUI.class);
                var36_18.putExtra("activityname", var4_4);
            } else if (var5_5 != null && !var5_5.equalsIgnoreCase("")) {
                var29_19 = new StringBuilder();
                var29_19.append("recieve 222 ");
                var29_19.append(var5_5);
                Log.d((String)"fcmpuchc", (String)var29_19.toString());
                var33_20 = new Intent("android.intent.action.VIEW");
                var33_20.addFlags(268435456);
                if (var5_5.contains((CharSequence)"mobondhandle=http") && com.mulo.util.e.a(this.a, "com.android.chrome")) {
                    var33_20.setPackage("com.android.chrome");
                } else if (var5_5.contains((CharSequence)"mobondhandle=youtube") && com.mulo.util.e.a(this.a, "com.google.android.youtube")) {
                    var33_20.setPackage("com.google.android.youtube");
                }
                var33_20.setData(Uri.parse((String)var5_5));
                var36_18 = var33_20;
            } else {
                var36_18 = new Intent((Context)this, SplashUI.class);
            }
            if (var6_6 != null && var6_6.equals((Object)"true")) {
                var36_18.putExtra("isalert", var6_6);
            }
            if (var10_10 != null) {
                var36_18.putExtra("alert_type", var10_10);
            }
            if (var13_13 != null) {
                var36_18.putExtra("FIRE_DB_URL_KEY", var13_13);
            }
            if (var7_7 != null && !var7_7.trim().equalsIgnoreCase("")) {
                var36_18.putExtra("analytics_id", var7_7);
            }
            if (var11_11 != null && !var11_11.trim().equalsIgnoreCase("")) {
                var36_18.putExtra("openchatroom", var11_11);
            }
            if (var12_12 != null && !var12_12.trim().equalsIgnoreCase("")) {
                var36_18.putExtra("CHATGIPARENT", var12_12);
            }
            if (var15_15 != null && !var15_15.trim().equalsIgnoreCase("")) {
                var36_18.putExtra("focusmessageTime", var15_15);
            }
            var39_21 = BitmapFactory.decodeResource((Resources)this.getResources(), (int)2131231078);
            var40_22 = (NotificationManager)this.getSystemService("notification");
            var36_18.addFlags(67108864);
            var42_23 = (int)System.currentTimeMillis();
            if (!TextUtils.isEmpty((CharSequence)var4_4) && var4_4.equalsIgnoreCase("com.mobond.mindicator.ui.chat.ChatScreenHSV")) {
                var43_24 = PendingIntent.getActivity((Context)this.getApplicationContext(), (int)var42_23, (Intent)var36_18, (int)1073741824);
                var59_25 = new Intent((Context)this, onReplyClickReceiver.class);
                var59_25.putExtras(var36_18.getExtras());
                var59_25.putExtra("notification_id", var42_23);
                var62_26 = new h.a.a(2131231019, (CharSequence)"Reply", PendingIntent.getBroadcast((Context)this.getApplicationContext(), (int)var42_23, (Intent)var59_25, (int)1073741824)).a();
                var63_27 = new Intent((Context)this, onClickReceiver.class);
                var63_27.putExtra("gi", var11_11);
                var63_27.putExtra("giparent", var12_12);
                var63_27.putExtra("i", var14_14);
                var63_27.putExtra("m", var2_2);
                var63_27.putExtra("notification_id", var42_23);
                var69_28 = new h.a.a(2131231019, (CharSequence)"Block User", PendingIntent.getBroadcast((Context)this.getApplicationContext(), (int)var42_23, (Intent)var63_27, (int)1073741824)).a();
                var44_29 = g.a(this.getApplicationContext(), var40_22, new long[]{100L, 200L, 100L, 500L}, var28_17).d(true).a((CharSequence)var1_1).b((CharSequence)var2_2).a(var62_26).a(var69_28).d(true).a(ActivityAlarmRing.a());
            } else {
                var43_24 = PendingIntent.getActivity((Context)this.getApplicationContext(), (int)0, (Intent)var36_18, (int)1073741824);
                var44_29 = g.a(this.getApplicationContext(), var40_22, new long[]{100L, 200L, 100L, 500L}, var28_17).d(true).a((CharSequence)var1_1).b((CharSequence)var2_2).a(ActivityAlarmRing.a());
            }
            if (Build.VERSION.SDK_INT > 15) {
                var44_29.a(var39_21);
                var45_30 = var3_3;
            } else {
                var45_30 = var3_3;
            }
            if (var45_30 != null) {
                var44_29.a((h.e)new h.b().a(var45_30).a((CharSequence)var2_2));
                var47_31 = var8_8;
            } else {
                var44_29.a((h.e)new h.c().a((CharSequence)var2_2));
                var47_31 = var8_8;
            }
            if (var47_31 != null && var47_31.equals((Object)"true")) {
                var44_29.a(-65536, 3000, 3000);
                var44_29.a(Settings.System.DEFAULT_NOTIFICATION_URI);
            }
            var44_29.a(var43_24);
            var40_22.notify(var42_23, var44_29.b());
            if (var7_7 != null && !var7_7.trim().equalsIgnoreCase("")) {
                Log.d((String)"analytics_id", (String)var7_7);
                com.mobond.mindicator.ui.multicity.a.a((Context)this, "ANALYTICS_FIREBASE_NOTIFICATION", var7_7, "ANALYTICS_DISPLAY");
                var49_32 = var9_9;
            } else {
                var49_32 = var9_9;
            }
            if (var49_32 != null && var49_32.equals((Object)"true")) {
                Log.d((String)"fcmpuchc", (String)"isping");
                new AsyncTask<URL, Integer, Integer>(){

                    protected /* varargs */ Integer a(URL ... arruRL) {
                        try {
                            e.a(e.a("http://mobondhrd.appspot.com/regcheck?isping=true", FirebaseMessagingService.this.a));
                            Log.d((String)"fcmpuchc", (String)"isping called");
                        }
                        catch (Exception exception) {}
                        return 0;
                    }

                    protected void a(Integer n2) {
                        super.onPostExecute((Object)n2);
                    }

                    protected /* varargs */ void a(Integer ... arrinteger) {
                    }

                    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                        return this.a((URL[])arrobject);
                    }

                    protected /* synthetic */ void onPostExecute(Object object) {
                        this.a((Integer)object);
                    }

                    protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
                        this.a((Integer[])arrobject);
                    }
                }.execute((Object[])new URL[]{null, null, null});
            }
            if (var6_6 == null) return;
            var6_6.equals((Object)"true");
            return;
        }
        catch (Exception var51_33) {}
        var51_33.printStackTrace();
    }

    public void b(String string) {
        super.b(string);
        b.a("global");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1111 Token ");
        stringBuilder.append(string);
        Log.d((String)"1111 fcmtoken", (String)stringBuilder.toString());
        if (string != null) {
            RegInfo2.a(string, (Context)this);
        }
    }

}

