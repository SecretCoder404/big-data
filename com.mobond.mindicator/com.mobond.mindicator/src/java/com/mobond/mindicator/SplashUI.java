/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.net.URL
 *  java.util.concurrent.Executor
 */
package com.mobond.mindicator;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.RegInfo2;
import com.mobond.mindicator.SplashUI;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.AdUI;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.i;
import com.mobond.mindicator.ui.k;
import com.mobond.mindicator.ui.multicity.Multicity_home;
import com.mobond.mindicator.ui.n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.concurrent.Executor;

public class SplashUI
extends i {
    public static View a;
    b b;
    private final Integer c = 1;
    private final Integer d = 3;
    private SplashUI e;

    public static View a(Activity activity, View view) {
        if (a == null) {
            k k2 = new k();
            k2.a = "#FFFFFF";
            k2.b = "#707070";
            k2.f = "#303030";
            a = c.a(activity, view, "ca-app-pub-5449278086868932/8862800847", "167101606757479_853949841405982", "ca-app-pub-5449278086868932/2495764777", "167101606757479_1230371800430449", 5, null, k2, true);
        }
        return a;
    }

    public static void a(Activity activity) {
        Dialog dialog = new Dialog((Context)activity);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131492988);
        dialog.findViewById(2131297688).setOnClickListener(new View.OnClickListener(dialog, activity){
            final /* synthetic */ Dialog a;
            final /* synthetic */ Activity b;
            {
                this.a = dialog;
                this.b = activity;
            }

            public void onClick(View view) {
                n.a(this.a);
                Multicity_home.c((Context)this.b);
                if (android.os.Build$VERSION.SDK_INT >= 16) {
                    this.b.finishAffinity();
                    return;
                }
                androidx.core.app.a.a((Activity)this.b);
            }
        });
        dialog.findViewById(2131297037).setOnClickListener(new View.OnClickListener(dialog){
            final /* synthetic */ Dialog a;
            {
                this.a = dialog;
            }

            public void onClick(View view) {
                n.a(this.a);
            }
        });
        dialog.findViewById(2131297168).setOnClickListener(new View.OnClickListener(activity){
            final /* synthetic */ Activity a;
            {
                this.a = activity;
            }

            public void onClick(View view) {
                try {
                    Multicity_home.e((Context)this.a);
                    return;
                }
                catch (Exception exception) {
                    this.a.finish();
                    return;
                }
            }
        });
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener(dialog){
            final /* synthetic */ Dialog a;
            {
                this.a = dialog;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.a.cancel();
            }
        });
        dialog.setTitle(null);
        dialog.show();
    }

    public void a(Context context, String string, String string2, String string3) {
        ConfigurationManager.a(context, string.toUpperCase(), string2.toUpperCase(), string3.toUpperCase());
    }

    public void a(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("deleted ");
        stringBuilder.append((Object)file);
        Log.d((String)"msdelete", (String)stringBuilder.toString());
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 == null) continue;
                this.a(file2);
            }
            Log.d((String)"msdelete", (String)"directory hai");
        } else {
            Log.d((String)"msdelete", (String)"not a dir");
        }
        file.delete();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d((String)"1111", (String)"1111 onCreate started");
        Multicity_home.g();
        this.e = this;
        try {
            if ((4194304 & this.getIntent().getFlags()) != 0) {
                this.finish();
                return;
            }
            this.setContentView(2131493135);
            ((TextView)this.findViewById(2131297661)).setText((CharSequence)String.format((String)"%s,%s", (Object[])new Object[]{"v17.0.186 Eagle", "02 Jan 2021"}));
            this.b = com.mobond.mindicator.a.a(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Log.d((String)"e", (String)exception.getMessage());
        }
        int n2 = com.mobond.mindicator.a.a(this).v();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("adnotshowncount: ");
        stringBuilder.append(n2);
        Log.d((String)"prepareAdView", (String)stringBuilder.toString());
        if (n2 > 3 && com.mulo.b.c.a((Context)this)) {
            SplashUI.a(this, null);
        }
        new AsyncTask<URL, Integer, Integer>(this){
            private WeakReference<SplashUI> a;
            {
                this.a = new WeakReference((Object)splashUI);
            }

            protected /* varargs */ Integer a(URL ... arruRL) {
                try {
                    com.mulo.a.b.b = false;
                    if (RegInfo2.a((Context)this.a.get())) {
                        Thread.sleep((long)500L);
                        return ((SplashUI)this.a.get()).d;
                    }
                    Thread.sleep((long)600L);
                    Integer n = ((SplashUI)this.a.get()).c;
                    return n;
                }
                catch (Exception exception) {
                    Log.d((String)"SplashUIAsyncTask", (String)"SplashUIAsyncTask Exception", (Throwable)exception);
                    return 0;
                }
            }

            protected void a(Integer n) {
                if (this.a.get() != null) {
                    if (((SplashUI)this.a.get()).b == null) {
                        ((SplashUI)this.a.get()).b = com.mobond.mindicator.a.a((Activity)this.a.get());
                    }
                    Intent intent = ((SplashUI)this.a.get()).getIntent();
                    if (n.equals((Object)((SplashUI)this.a.get()).c)) {
                        Intent intent2 = new Intent((Context)this.a.get(), AdUI.class);
                        if (intent.hasExtra("isalert")) {
                            intent2.putExtra("isalert", intent.getExtras().getString("isalert"));
                        }
                        if (intent.hasExtra("alert_type")) {
                            intent2.putExtra("alert_type", intent.getExtras().getString("alert_type"));
                        }
                        if (intent.hasExtra("activityname")) {
                            intent2.putExtra("activityname", intent.getExtras().getString("activityname"));
                        }
                        if (intent.hasExtra("openchatroom")) {
                            intent2.putExtra("openchatroom", intent.getExtras().getString("openchatroom"));
                        }
                        if (intent.hasExtra("openmsrtc")) {
                            intent2.putExtra("openmsrtc", intent.getExtras().getString("openmsrtc"));
                        }
                        if (intent.hasExtra("openir")) {
                            intent2.putExtra("openir", intent.getExtras().getString("openir"));
                        }
                        if (intent.hasExtra("focusmessageTime")) {
                            intent2.putExtra("focusmessageTime", intent.getExtras().getString("focusmessageTime"));
                        }
                        if (intent.hasExtra("FIRE_DB_URL_KEY")) {
                            intent2.putExtra("FIRE_DB_URL_KEY", intent.getExtras().getString("FIRE_DB_URL_KEY"));
                        }
                        if (intent.hasExtra("multicity_cityname")) {
                            String string = intent.getExtras().getString("multicity_cityname");
                            ((SplashUI)this.a.get()).b.b("city", string);
                            ConfigurationManager.a((Context)this.a.get(), string);
                            Log.d((String)"multicity_cityname", (String)string);
                        }
                        if (intent.hasExtra("analytics_id")) {
                            ((SplashUI)this.a.get()).a((Context)this.a.get(), "ANALYTICS_FIREBASE_NOTIFICATION", intent.getExtras().getString("analytics_id"), "ANALYTICS_CLICK");
                        }
                        ((SplashUI)this.a.get()).startActivityForResult(intent2, 0);
                        ((SplashUI)this.a.get()).finish();
                        return;
                    }
                    if (n.equals((Object)((SplashUI)this.a.get()).d)) {
                        File file = ((SplashUI)this.a.get()).getFilesDir();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(file.getAbsolutePath());
                        stringBuilder.append("/indicator");
                        File file2 = new File(stringBuilder.toString());
                        if (file2.exists()) {
                            ((SplashUI)this.a.get()).a(file2);
                        }
                        ((SplashUI)this.a.get()).b.r();
                        ConfigurationManager.d((Context)this.a.get());
                        Intent intent3 = new Intent((Context)this.a.get(), Multicity_home.class);
                        intent3.putExtra("IS_FIRST_TIME_OPENED", true);
                        ((SplashUI)this.a.get()).startActivity(intent3);
                        ((SplashUI)this.a.get()).finish();
                    }
                }
            }

            protected /* varargs */ void a(Integer ... arrinteger) {
                if (arrinteger[0] == 1) {
                    n.d((Context)this.a.get(), "File creation error");
                    return;
                }
                if (arrinteger[0] == 2) {
                    n.d((Context)this.a.get(), "Image creation error");
                    return;
                }
                if (arrinteger[0] == 3) {
                    n.d((Context)this.a.get(), "Reading configuration error");
                }
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
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new URL[]{null, null, null});
        String string = this.b.c((Context)this);
        if (string != null) {
            g.a(string);
        }
    }

}

