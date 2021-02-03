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
 *  android.content.IntentFilter
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.media.Ringtone
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.os.Vibrator
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  androidx.core.app.h
 *  androidx.core.app.h$c
 *  androidx.core.app.h$d
 *  androidx.core.app.h$e
 *  androidx.core.content.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Locale
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.alarm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.core.app.h;
import com.mobond.mindicator.SampleSchedulingService;
import com.mobond.mindicator.g;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityAlarmRing;
import com.mobond.mindicator.ui.indianrail.checklist.CheckLists;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

public class ActivityAlarmRing
extends e {
    private ArrayList<Integer> a;
    private BroadcastReceiver b;
    private HashMap<Integer, Ringtone> c;
    private c d;
    private Vibrator e;

    public static int a() {
        boolean bl = Build.VERSION.SDK_INT >= 21;
        if (bl) {
            return 2131231214;
        }
        return 2131231213;
    }

    public static Intent a(int n2) {
        Intent intent = new Intent("alarmIF");
        intent.putExtra("id", n2);
        return intent;
    }

    public static Intent a(Context context, int n2, String string) {
        Intent intent = new Intent(context, SampleSchedulingService.class);
        intent.putExtra("START_SEARCH_HOTELS_FLAG", true);
        intent.putExtra("id", n2);
        intent.putExtra("stationcode", string);
        return intent;
    }

    public static String a(Context context, String string) {
        if (com.mobond.mindicator.a.b(context).D()) {
            string = string.toLowerCase().replace((CharSequence)"jan", (CharSequence)"\u091c\u0928\u0935\u0930\u0940").toLowerCase().replace((CharSequence)"feb", (CharSequence)"\u092b\u093c\u0930\u0935\u0930\u0940").toLowerCase().replace((CharSequence)"mar", (CharSequence)"\u092e\u093e\u0930\u094d\u091a").toLowerCase().replace((CharSequence)"apr", (CharSequence)"\u0905\u092a\u094d\u0930\u0948\u0932").toLowerCase().replace((CharSequence)"may", (CharSequence)"\u092e\u0908").toLowerCase().replace((CharSequence)"jun", (CharSequence)"\u091c\u0942\u0928").toLowerCase().replace((CharSequence)"jul", (CharSequence)"\u091c\u0941\u0932\u093e\u0908").toLowerCase().replace((CharSequence)"aug", (CharSequence)"\u0905\u0917\u0938\u094d\u0924").toLowerCase().replace((CharSequence)"sep", (CharSequence)"\u0938\u093f\u0924\u0902\u092c\u0930").toLowerCase().replace((CharSequence)"oct", (CharSequence)"\u0905\u0915\u094d\u091f\u0942\u092c\u0930").toLowerCase().replace((CharSequence)"nov", (CharSequence)"\u0928\u0935\u0902\u092c\u0930").toLowerCase().replace((CharSequence)"dec", (CharSequence)"\u0926\u093f\u0938\u0902\u092c\u0930");
        }
        return string.toUpperCase();
    }

    static /* synthetic */ ArrayList a(ActivityAlarmRing activityAlarmRing) {
        return activityAlarmRing.a;
    }

    public static void a(Context context, int n2) {
        NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        Intent intent = new Intent(context, CheckLists.class);
        intent.setFlags(268435456);
        intent.putExtra("id", n2);
        PendingIntent pendingIntent = PendingIntent.getActivity((Context)context, (int)(n2 + 2), (Intent)intent, (int)134217728);
        h.d d2 = g.a(context, notificationManager, null, false).a(ActivityAlarmRing.a()).e(context.getResources().getColor(2131099880)).a((CharSequence)context.getString(2131755292)).d(true).a(pendingIntent);
        String string = context.getString(2131755288);
        d2.b((CharSequence)string);
        d2.a(-16776961, 1000, 500);
        if (Build.VERSION.SDK_INT >= 16) {
            d2.a((h.e)new h.c().a((CharSequence)string));
        }
        Notification notification = d2.b();
        notification.flags = 16 | notification.flags;
        if (notificationManager != null) {
            notificationManager.notify(n2, notification);
        }
    }

    private void a(String[] arrstring) {
        int n2 = Integer.parseInt((String)arrstring[0]);
        this.d.a(n2, true);
        if (arrstring[4].equals((Object)"STATION_ALARM_MANUAL") || arrstring[4].equals((Object)"STATION_ALARM_VIA_PNR")) {
            this.b(n2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String[] a(Context var0, String var1_1, String var2_2) {
        var3_3 = new String[2];
        a.b(var0);
        var9_4 = new JSONObject(var1_1);
        var10_5 = var9_4.getString("date");
        var11_6 = null;
        if (var2_2 == null) ** GOTO lbl27
        {
            catch (Exception var4_16) {
                var4_16.printStackTrace();
                var3_3[0] = var0.getString(2131755364);
                var5_17 = new StringBuilder();
                var5_17.append(var3_3[0]);
                var5_17.append("");
                var3_3[1] = var5_17.toString();
                return var3_3;
            }
        }
        try {
            var32_7 = var2_2.isEmpty();
            var11_6 = null;
            if (!var32_7) {
                var33_8 = new SimpleDateFormat("HH:mm", Locale.US);
                var11_6 = new SimpleDateFormat("h:mm a", Locale.US).format(var33_8.parse(var2_2));
                var11_6 = var11_6.toLowerCase();
            }
            ** GOTO lbl27
        }
        catch (Exception var31_9) {
            block7 : {
                block6 : {
                    var31_9.printStackTrace();
lbl27: // 3 sources:
                    var12_10 = new SimpleDateFormat("d MMM,yyyy", Locale.US);
                    var13_11 = ActivityAlarmRing.a(var0, new SimpleDateFormat("d MMM", Locale.US).format(var12_10.parse(var10_5)).toUpperCase());
                    var14_12 = new StringBuilder();
                    if (var11_6 == null) break block6;
                    var15_13 = new StringBuilder();
                    var15_13.append(var11_6);
                    var15_13.append("  ");
                    var18_14 = var15_13.toString();
                    break block7;
                }
                var18_14 = "";
            }
            var14_12.append(var18_14);
            var14_12.append(var13_11);
            var14_12.append(", ");
            var14_12.append(var0.getString(2131755221));
            var14_12.append(" ");
            var14_12.append(f.a(var0, a.a(var9_4.getString("from").trim())));
            var3_3[0] = var14_12.toString();
            var25_15 = new StringBuilder();
            var25_15.append(var3_3[0]);
            var25_15.append("\n");
            var25_15.append(var9_4.getString("train_number").replace((CharSequence)"*", (CharSequence)""));
            var25_15.append("- ");
            var25_15.append(var9_4.getString("train_name"));
            var3_3[1] = var25_15.toString();
        }
        return var3_3;
    }

    static /* synthetic */ c b(ActivityAlarmRing activityAlarmRing) {
        return activityAlarmRing.d;
    }

    private void b(int n2) {
        NotificationManager notificationManager = (NotificationManager)this.getSystemService("notification");
        Intent intent = ActivityAlarmRing.a(n2);
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)this.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
        String[] arrstring = this.d.a(n2);
        if (arrstring != null) {
            Bitmap bitmap = BitmapFactory.decodeResource((Resources)this.getResources(), (int)2131231213);
            String string = arrstring[2].contains((CharSequence)"[") ? arrstring[2].substring(0, arrstring[2].indexOf(91)) : arrstring[2];
            h.d d2 = g.a(this.getApplicationContext(), notificationManager, new long[]{1000L, 500L}, true).a(ActivityAlarmRing.a()).a(bitmap).e(this.getResources().getColor(2131099880));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" - ");
            stringBuilder.append(arrstring[5].replace((CharSequence)"  ", (CharSequence)" ").toLowerCase());
            h.d d3 = d2.a((CharSequence)stringBuilder.toString()).d(true).b(pendingIntent).a(pendingIntent);
            d3.b((CharSequence)this.getApplicationContext().getString(2131755063));
            d3.a(-16776961, 1000, 500);
            d3.a(RingtoneManager.getDefaultUri((int)2));
            d3.a(17301550, (CharSequence)"Turn Off", pendingIntent);
            Notification notification = d3.b();
            if (notificationManager != null) {
                notificationManager.notify(n2, notification);
            }
            this.c(n2);
            return;
        }
        this.sendBroadcast(intent);
    }

    public static void b(Context context, int n2, String string) {
        String[] arrstring = new c(context).b(string);
        if (arrstring != null) {
            NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            Intent intent = new Intent(context, ActivityPnrStatus.class);
            intent.setFlags(268435456);
            intent.putExtra("json", arrstring[0]);
            intent.putExtra("s_date", arrstring[1]);
            intent.putExtra("pnr", string);
            PendingIntent pendingIntent = PendingIntent.getActivity((Context)context, (int)n2, (Intent)intent, (int)134217728);
            h.d d2 = g.a(context, notificationManager, null, false).a(ActivityAlarmRing.a()).e(context.getResources().getColor(2131099880)).a((CharSequence)context.getString(2131755370)).d(true).a(pendingIntent);
            String[] arrstring2 = ActivityAlarmRing.a(context, arrstring[0], arrstring[2]);
            d2.b((CharSequence)arrstring2[0]);
            d2.a(-16776961, 1000, 500);
            Intent intent2 = new Intent(context, SampleSchedulingService.class);
            intent2.putExtra("START_EXTERNAL_ALARM_FLAG", true);
            intent2.putExtra("id", n2);
            Context context2 = context.getApplicationContext();
            int n3 = n2 + 1;
            PendingIntent pendingIntent2 = PendingIntent.getService((Context)context2, (int)n3, (Intent)intent2, (int)134217728);
            d2.a(17301550, (CharSequence)context.getString(2131755353), pendingIntent2);
            if (Build.VERSION.SDK_INT >= 16) {
                d2.d(2);
                d2.a((h.e)new h.c().a((CharSequence)arrstring2[1]));
            }
            Notification notification = d2.b();
            notification.flags = 16 | notification.flags;
            if (notificationManager != null) {
                notificationManager.notify(n2, notification);
            }
            ActivityAlarmRing.a(context, n3);
        }
    }

    static /* synthetic */ HashMap c(ActivityAlarmRing activityAlarmRing) {
        return activityAlarmRing.c;
    }

    private void c(int n2) {
        Uri uri = RingtoneManager.getDefaultUri((int)4);
        Ringtone ringtone = RingtoneManager.getRingtone((Context)this.getApplicationContext(), (Uri)uri);
        if (ringtone != null) {
            this.c.put((Object)n2, (Object)ringtone);
            ((Ringtone)this.c.get((Object)n2)).play();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onCreate(Bundle bundle) {
        try {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            super.onCreate(bundle);
            this.a = new ArrayList();
            int n2 = this.getIntent().getIntExtra("id", -1);
            this.a.add((Object)n2);
            this.d = new c(this.getApplicationContext());
            this.getWindow().addFlags(6815872);
            PowerManager.WakeLock wakeLock = ((PowerManager)this.getSystemService("power")).newWakeLock(268435466, "mindicator:mywakelock");
            wakeLock.acquire();
            wakeLock.release();
            this.setContentView(2131493011);
            String[] arrstring = this.d.a(n2);
            String string = arrstring[2].contains((CharSequence)"[") ? arrstring[2].substring(0, arrstring[2].indexOf(91)) : arrstring[2];
            String string2 = arrstring[2].contains((CharSequence)"[") ? arrstring[2].substring(1 + arrstring[2].indexOf(91), arrstring[2].indexOf("]")) : string;
            TextView textView = (TextView)this.findViewById(2131297486);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string);
            stringBuilder3.append(" - ");
            stringBuilder3.append(arrstring[5].replace((CharSequence)"  ", (CharSequence)" ").toLowerCase());
            textView.setText((CharSequence)stringBuilder3.toString());
            Calendar calendar = Calendar.getInstance();
            int n3 = calendar.get(11);
            int n4 = calendar.get(12);
            TextView textView2 = (TextView)this.findViewById(2131297485);
            StringBuilder stringBuilder4 = new StringBuilder();
            if (n3 < 10) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("0");
                stringBuilder.append(n3);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(n3);
            }
            String string3 = stringBuilder.toString();
            stringBuilder4.append(string3);
            stringBuilder4.append(":");
            if (n4 < 10) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("0");
                stringBuilder2.append(n4);
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("");
                stringBuilder2.append(n4);
            }
            String string4 = stringBuilder2.toString();
            stringBuilder4.append(string4);
            textView2.setText((CharSequence)stringBuilder4.toString());
            TextView textView3 = (TextView)this.findViewById(2131296380);
            String string5 = n3 < 12 ? "am" : "pm";
            textView3.setText((CharSequence)string5);
            View view = this.findViewById(2131296471);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, (Drawable)new ColorDrawable(-1463529));
            stateListDrawable.addState(new int[0], (Drawable)new ColorDrawable(androidx.core.content.a.c((Context)this.getApplicationContext(), (int)2131099793)));
            view.setBackgroundDrawable((Drawable)stateListDrawable);
            view.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ ActivityAlarmRing a;
                {
                    this.a = activityAlarmRing;
                }

                public void onClick(View view) {
                    for (int i2 = 0; i2 < ActivityAlarmRing.a(this.a).size(); ++i2) {
                        ActivityAlarmRing activityAlarmRing = this.a;
                        activityAlarmRing.sendBroadcast(ActivityAlarmRing.a((Integer)ActivityAlarmRing.a(activityAlarmRing).get(i2)));
                    }
                    this.a.finish();
                }
            });
            View view2 = this.findViewById(2131296472);
            StateListDrawable stateListDrawable2 = new StateListDrawable();
            stateListDrawable2.addState(new int[]{16842919}, (Drawable)new ColorDrawable(-1463529));
            stateListDrawable2.addState(new int[0], (Drawable)new ColorDrawable(androidx.core.content.a.c((Context)this.getApplicationContext(), (int)2131099793)));
            view2.setBackgroundDrawable((Drawable)stateListDrawable2);
            view2.setOnClickListener(new View.OnClickListener(this, n2, string2){
                final /* synthetic */ int a;
                final /* synthetic */ String b;
                final /* synthetic */ ActivityAlarmRing c;
                {
                    this.c = activityAlarmRing;
                    this.a = n2;
                    this.b = string;
                }

                public void onClick(View view) {
                    ActivityAlarmRing activityAlarmRing = this.c;
                    activityAlarmRing.startService(ActivityAlarmRing.a(activityAlarmRing.getApplicationContext(), this.a, this.b));
                    this.c.finish();
                }
            });
            if (this.c == null) {
                this.c = new HashMap();
            }
            this.b = new BroadcastReceiver(this){
                final /* synthetic */ ActivityAlarmRing a;
                {
                    this.a = activityAlarmRing;
                }

                public void onReceive(Context context, Intent intent) {
                    if (intent != null && intent.hasExtra("id")) {
                        int n2 = intent.getIntExtra("id", -1);
                        ActivityAlarmRing.b(this.a).b(n2);
                        NotificationManager notificationManager = (NotificationManager)this.a.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(n2);
                        }
                        if (ActivityAlarmRing.c(this.a).get((Object)n2) != null) {
                            ((Ringtone)ActivityAlarmRing.c(this.a).get((Object)n2)).stop();
                            ActivityAlarmRing.c(this.a).remove((Object)n2);
                        }
                    }
                    this.a.finish();
                }
            };
            this.e = (Vibrator)this.getSystemService("vibrator");
            if (this.e != null && this.e.hasVibrator()) {
                long[] arrl = new long[]{3000L, 1000L};
                this.e.vibrate(arrl, 0);
            }
            if (n2 != -1) {
                this.a(this.d.a(n2));
            }
            this.registerReceiver(this.b, new IntentFilter("alarmIF"));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.finish();
            return;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            this.unregisterReceiver(this.b);
            this.e.cancel();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.a.add((Object)intent.getIntExtra("id", -1));
    }
}

