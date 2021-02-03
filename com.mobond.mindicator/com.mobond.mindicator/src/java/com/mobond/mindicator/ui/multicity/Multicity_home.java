/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.app.ProgressDialog
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.content.ServiceConnection
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.text.Html
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.b
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.app.a
 *  androidx.core.content.a
 *  androidx.core.g.q
 *  androidx.core.g.u
 *  androidx.drawerlayout.widget.DrawerLayout
 *  androidx.drawerlayout.widget.DrawerLayout$c
 *  androidx.fragment.app.d
 *  androidx.fragment.app.e
 *  androidx.fragment.app.j
 *  androidx.fragment.app.n
 *  androidx.h.a.a
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.a
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient
 *  com.google.android.gms.auth.api.a
 *  com.google.android.gms.auth.api.credentials.Credential
 *  com.google.android.gms.auth.api.credentials.HintRequest
 *  com.google.android.gms.auth.api.credentials.HintRequest$a
 *  com.google.android.gms.auth.api.credentials.a
 *  com.google.android.gms.common.api.a
 *  com.google.android.gms.common.api.f
 *  com.google.android.gms.common.api.f$a
 *  com.google.android.gms.common.api.f$b
 *  com.google.android.gms.common.api.f$c
 *  com.google.android.gms.common.b
 *  com.google.android.gms.common.g
 *  com.google.android.gms.common.h
 *  com.google.android.gms.d.g
 *  com.google.android.gms.d.k
 *  com.google.android.material.internal.NavigationMenuView
 *  com.google.android.material.navigation.NavigationView
 *  com.google.android.material.navigation.NavigationView$a
 *  com.google.firebase.iid.FirebaseInstanceId
 *  com.google.firebase.iid.a
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URL
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Vector
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.multicity;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.g.q;
import androidx.core.g.u;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.j;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.f;
import com.google.android.gms.d.k;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.iid.FirebaseInstanceId;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.RegInfo2;
import com.mobond.mindicator.SplashUI;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.alert.News;
import com.mobond.mindicator.ui.cabs.CabsActivity;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.indianrail.IRActivity;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.lt.AddTrainActivity;
import com.mobond.mindicator.ui.lt.trainutils.GetAlertJobIntentService;
import com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mobond.mindicator.ui.msrtc.MsrtcMainActivity;
import com.mobond.mindicator.ui.multicity.Multicity_home;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.TrainActivity;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mobond.mindicator.util.a;
import com.mobond.policestationlocator.PoliceStationLocatorHome;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public class Multicity_home
extends com.mobond.mindicator.ui.indianrail.util.a
implements f.b,
f.c,
NavigationView.a {
    public static ViewPager a;
    static SharedPreferences b;
    private static final String z = "Multicity_home";
    private LinearLayout A;
    private LinearLayout B;
    private LinearLayout C;
    private byte D = (byte)3;
    private View E;
    private String F;
    private String G;
    private String H;
    private Activity I;
    private boolean J = false;
    private d K;
    private ServiceConnection L = new ServiceConnection(this){
        final /* synthetic */ Multicity_home a;
        {
            this.a = multicity_home;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.a.t = ((com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService$a)iBinder).a();
            com.mobond.mindicator.ui.multicity.a a2 = (com.mobond.mindicator.ui.multicity.a)((e)Multicity_home.a.getAdapter()).a(0);
            if (this.a.t != null) {
                if (this.a.t.a((Context)this.a)) {
                    a2.a(f.a(this.a.t.a, this.a.t.e.toUpperCase().trim(), this.a.t.g.split("-")[1].trim(), (Context)this.a), (Context)this.a);
                    if (this.a.t.u != null) {
                        a2.a(this.a.t.u.d);
                    }
                    return;
                }
                a2.a(null, (Context)this.a);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    public String c = "LAST_OPENED_TAB";
    com.mobond.mindicator.b d;
    RelativeLayout e;
    String[] f = new String[]{"SHAREit", "Select Language", "Rate us", "Upgrade", "Feedback", "Contact us", "Advertise with us", "Terms & Conditions", "New Feature guide", "Version", "Mobond"};
    int[] g = new int[]{2131231295, 2131231088, 2131231242, 2131231335, 2131230987, 2131230943, 2131230815, 2131231310, 2131231206, 2131231088, 2131230944};
    String[] h = ConfigurationManager.a;
    ImageView i;
    ImageView j;
    ImageView k;
    ImageView l;
    ImageView m;
    TextView n;
    TextView p;
    TextView q;
    DrawerLayout r;
    String s = "DELETECACHEDATE";
    InsideLocalTrainService t;
    com.google.android.gms.common.api.f u;
    EditText v;
    TextView w;
    public boolean x = false;
    public boolean y = false;

    public static void a(Activity activity) {
        com.mobond.mindicator.a.a(activity).t();
        Intent intent = new Intent((Context)activity, WebUI.class);
        com.mulo.util.g g2 = new com.mulo.util.g();
        com.mulo.util.e.a(g2.a(), g2);
        g2.a = "file:///android_asset/tourguide/tourguide.html";
        intent.putExtra("webuidatakey", g2.a());
        intent.putExtra("BIG_CLOSE_BUTTON", true);
        intent.putExtra("IS_FIRST_TIME_OPENED", true);
        activity.startActivity(intent);
    }

    private void a(ViewPager viewPager) {
        e e2 = new e(this.getSupportFragmentManager());
        e2.a(new com.mobond.mindicator.ui.multicity.a(), ConfigurationManager.b(this.getApplicationContext()).toUpperCase());
        viewPager.setAdapter((androidx.viewpager.widget.a)e2);
    }

    static /* synthetic */ void a(Multicity_home multicity_home) {
        multicity_home.u();
    }

    static /* synthetic */ void a(Multicity_home multicity_home, String string, String string2, String string3) {
        multicity_home.a(string, string2, string3);
    }

    static /* synthetic */ void a(Multicity_home multicity_home, String string, String string2, String string3, String string4) {
        multicity_home.a(string, string2, string3, string4);
    }

    private void a(String string, String string2, String string3) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getString("code").equals((Object)"400")) {
                n.d((Context)this.m(), jSONObject.getString("message"));
                return;
            }
            n.c((Context)this.m(), jSONObject.getString("message"));
            GoogleLoginActivity.c((Context)this.m());
            this.d.q(string2);
            this.d.t(string3);
            this.startActivity(new Intent((Context)this.m(), AddTrainActivity.class));
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    private void a(String string, String string2, String string3, String string4) {
        this.b(this.m());
        ProgressDialog progressDialog = new ProgressDialog((Context)this);
        progressDialog.setMessage((CharSequence)"Saving..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        com.mobond.mindicator.ui.lt.trainutils.a.a(string, string2, string3, string4, false, this.d.H(), new com.mulo.b.a(this, progressDialog, string2, string3){
            final /* synthetic */ ProgressDialog a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ Multicity_home d;
            {
                this.d = multicity_home;
                this.a = progressDialog;
                this.b = string;
                this.c = string2;
            }

            public void a() {
                n.a((Dialog)this.a);
            }

            public void a(byte[] arrby, byte[] arrby2, Object object) {
                n.a((Dialog)this.a);
                String string = new String(arrby);
                Multicity_home.a(this.d, string, this.b, this.c);
            }
        }, this.m());
    }

    public static boolean a(File file) {
        Log.d((String)z, (String)"dir cleaned hahahahah");
        if (file != null && file.isDirectory()) {
            String[] arrstring = file.list();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                if (Multicity_home.a(new File(file, arrstring[i2]))) continue;
                return false;
            }
            return file.delete();
        }
        if (file != null && file.isFile()) {
            return file.delete();
        }
        return false;
    }

    private void b(Activity activity) {
        View view;
        if (activity != null && (view = activity.getCurrentFocus()) != null) {
            ((InputMethodManager)activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    static /* synthetic */ void b(Multicity_home multicity_home) {
        multicity_home.q();
    }

    static /* synthetic */ boolean b(Multicity_home multicity_home, String string) {
        return multicity_home.e(string);
    }

    static /* synthetic */ byte c(Multicity_home multicity_home) {
        return multicity_home.D;
    }

    private String c(String string) {
        String string2 = string.replaceAll(" ", "").replaceAll("[^0-9]", "");
        return string2.substring(-10 + string2.length());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Context context) {
        try {
            String string = String.valueOf((int)com.mulo.util.e.a());
            int n2 = Integer.parseInt((String)com.mulo.util.e.b(b.getString("clear_Date", "20160502"), string));
            if (n2 >= 15) {
                File file = context.getCacheDir();
                String string2 = z;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("111 cache path - ");
                stringBuilder.append((Object)file);
                Log.d((String)string2, (String)stringBuilder.toString());
                Multicity_home.a(file);
                SharedPreferences.Editor editor = b.edit();
                editor.putString("clear_Date", string);
                editor.apply();
            }
            String string3 = z;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DATE DIFF IS  - ");
            stringBuilder.append(n2);
            Log.d((String)string3, (String)stringBuilder.toString());
            return;
        }
        catch (Exception exception) {}
    }

    static /* synthetic */ Activity d(Multicity_home multicity_home) {
        return multicity_home.I;
    }

    public static void d(Context context) {
        Log.d((String)z, (String)"5555 fetch call 1111");
        com.mobond.mindicator.fcm.a.a().a(new Runnable(context){
            final /* synthetic */ Context a;
            {
                this.a = context;
            }

            public void run() {
                Log.d((String)Multicity_home.p(), (String)"5555 fetch call 222");
                Intent intent = new Intent(this.a, com.mobond.mindicator.util.OnlineDbUpdateService.class);
                com.mobond.mindicator.util.OnlineDbUpdateService.a(this.a, intent);
            }
        });
    }

    private void d(String string) {
        d.a a2 = new d.a((Context)this);
        a2.b((CharSequence)string).a(true).a((CharSequence)"OK", new DialogInterface.OnClickListener(this){
            final /* synthetic */ Multicity_home a;
            {
                this.a = multicity_home;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        a2.b().show();
    }

    public static void e(Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"market://details?id=com.mobond.mindicator")));
    }

    private boolean e(String string) {
        if (string.isEmpty()) {
            n.d((Context)this.m(), "Please enter mobile number");
            return false;
        }
        if (string.length() != 10) {
            n.d((Context)this.m(), "Please enter valid mobile number");
            return false;
        }
        if (!string.contains((CharSequence)"+") && !string.contains((CharSequence)"-")) {
            return true;
        }
        n.d((Context)this.m(), "Please enter valid mobile number");
        return false;
    }

    public static void f(Context context) {
        context.startActivity(Intent.makeRestartActivityTask((ComponentName)context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent()));
        Runtime.getRuntime().exit(0);
    }

    public static void g() {
        TrainActivity.b = null;
        SplashUI.a = null;
    }

    public static void onShareAlertNewsClickedStatic(View view) {
        Log.d((String)z, (String)"2222 onShareAlertNewsClicked ");
        n.e(view.getContext(), "Please wait..");
        try {
            PackageManager packageManager = view.getContext().getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            String string = Html.fromHtml((String)view.getTag().toString()).toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("\n\n- Install m-Indicator https://goo.gl/gmduc8");
            String string2 = stringBuilder.toString();
            packageManager.getPackageInfo("com.whatsapp", 128);
            intent.setPackage("com.whatsapp");
            intent.putExtra("android.intent.extra.TEXT", string2);
            view.getContext().startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share with"));
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            n.d(view.getContext(), "WhatsApp is not Installed");
            return;
        }
    }

    private void q() {
        Dialog dialog = new Dialog((Context)this);
        dialog.setTitle((CharSequence)"Select Language");
        dialog.setContentView(2131492984);
        LinearLayout linearLayout = (LinearLayout)dialog.findViewById(2131296998);
        String[] arrstring = new String[]{"English", "\u092e\u0930\u093e\u0920\u0940"};
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this).inflate(2131492952, (ViewGroup)linearLayout, false);
            TextView textView = (TextView)viewGroup.findViewById(2131297117);
            TextView textView2 = (TextView)viewGroup.findViewById(2131296655);
            RelativeLayout relativeLayout = (RelativeLayout)viewGroup.findViewById(2131297186);
            textView.setText((CharSequence)g.a(arrstring[i2], g.a));
            if (i2 == arrstring.length - 1) {
                textView2.setVisibility(8);
            }
            relativeLayout.setOnClickListener(new View.OnClickListener(this, dialog, arrstring, i2){
                final /* synthetic */ Dialog a;
                final /* synthetic */ String[] b;
                final /* synthetic */ int c;
                final /* synthetic */ Multicity_home d;
                {
                    this.d = multicity_home;
                    this.a = dialog;
                    this.b = arrstring;
                    this.c = n2;
                }

                public void onClick(View view) {
                    n.a(this.a);
                    String string = this.b[this.c];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("s:");
                    stringBuilder.append(string);
                    Log.d((String)"5555", (String)stringBuilder.toString());
                    if (string.equals((Object)this.b[1])) {
                        this.d.d.k("mr");
                    } else {
                        this.d.d.k("en");
                    }
                    Multicity_home.f((Context)this.d.m());
                }
            });
            linearLayout.addView((View)viewGroup);
        }
        dialog.show();
    }

    private boolean r() {
        return this.c() > 0x80000000L;
    }

    private void s() {
        FirebaseInstanceId.a().d().a((Activity)this, (com.google.android.gms.d.g)new com.google.android.gms.d.g<com.google.firebase.iid.a>(this){
            final /* synthetic */ Multicity_home a;
            {
                this.a = multicity_home;
            }

            public void a(com.google.firebase.iid.a a2) {
                String string = a2.b();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("token : ");
                stringBuilder.append(string);
                Log.d((String)"5353535", (String)stringBuilder.toString());
                com.mobond.mindicator.a.a((Activity)this.a).j(string);
            }
        });
    }

    private void t() {
        String string = this.I.getString(2131755290);
        String string2 = this.I.getString(2131755214);
        String string3 = this.I.getString(2131755172);
        String string4 = "To show nearby stations, please grant Location Permission.";
        if (com.mobond.mindicator.a.a(this.I).D()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<b>");
            stringBuilder.append(string4);
            stringBuilder.append("</b>");
            string4 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("<big>");
            stringBuilder2.append(string2);
            stringBuilder2.append("</big>");
            stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("<big>");
            stringBuilder3.append(string);
            stringBuilder3.append("</big>");
            string = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("<big>");
            stringBuilder4.append(string3);
            stringBuilder4.append("</big>");
            stringBuilder4.toString();
        }
        d.a a2 = new d.a((Context)this.I);
        a2.a((CharSequence)this.I.getString(2131755215, new Object[]{"LOCATION"}));
        a2.b((CharSequence)string4);
        a2.a((CharSequence)Html.fromHtml((String)string), new DialogInterface.OnClickListener(this){
            final /* synthetic */ Multicity_home a;
            {
                this.a = multicity_home;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                h.a(Multicity_home.d(this.a), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 110);
                this.a.d.b("loc_launch_permission_asked", true);
            }
        });
        a2.a(false);
        a2.b().show();
    }

    /*
     * Exception decompiling
     */
    private void u() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl323 : IINC : trying to set 1 previously set to 0
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

    private void v() {
        InsideLocalTrainService insideLocalTrainService = this.t;
        if (insideLocalTrainService != null) {
            insideLocalTrainService.d();
        }
    }

    private void w() {
        com.google.android.gms.common.api.f f2 = this.u;
        if (f2 == null || !f2.j()) {
            this.u = new f.a((Context)this).a((f.b)this).a((androidx.fragment.app.e)this, 1, (f.c)this).a(com.google.android.gms.auth.api.a.d).b();
        }
    }

    private void x() {
        this.w();
        HintRequest hintRequest = new HintRequest.a().a(true).a();
        PendingIntent pendingIntent = com.google.android.gms.auth.api.a.g.a(this.u, hintRequest);
        try {
            this.startIntentSenderForResult(pendingIntent.getIntentSender(), 151, null, 0, 0, 0);
            return;
        }
        catch (IntentSender.SendIntentException sendIntentException) {
            sendIntentException.printStackTrace();
            return;
        }
    }

    private void y() {
        if (com.mulo.b.c.a((Context)this)) {
            com.mobond.mindicator.util.a a2 = new com.mobond.mindicator.util.a();
            a2.getClass();
            a.a a3 = new a.a(this, a2, null, "http://cdn.mobond.com/mi/mi_config", "mi_config", false){
                final /* synthetic */ Multicity_home a;
                {
                    this.a = multicity_home;
                    a2.getClass();
                    super(a2, activity, string, string2, bl);
                }

                public void a() {
                    super.a();
                }
            };
            a3.execute((Object[])new URL[0]);
        }
    }

    public void a() {
        if (this.d.H() == null) {
            new AsyncTask<String, String, String>(){

                protected /* varargs */ String a(String ... arrstring) {
                    String string;
                    block6 : {
                        try {
                            string = AdvertisingIdClient.getAdvertisingIdInfo((Context)Multicity_home.this).getId();
                            break block6;
                        }
                        catch (com.google.android.gms.common.h h2) {
                            h2.printStackTrace();
                        }
                        catch (com.google.android.gms.common.g g2) {
                            g2.printStackTrace();
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                        string = null;
                    }
                    if (string == null) {
                        string = Multicity_home.this.d.p();
                    }
                    if (string != null) {
                        String string2 = com.mobond.mindicator.util.e.a(string);
                        Multicity_home.this.d.s(string2);
                    }
                    return null;
                }

                protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                    return this.a((String[])arrobject);
                }
            }.execute((Object[])new String[0]);
        }
    }

    public void a(int n2) {
    }

    /*
     * Exception decompiling
     */
    public void a(Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl26 : FAKE_TRY : trying to set 1 previously set to 0
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

    public void a(Bundle bundle) {
    }

    public void a(String string, int n2) {
        ConfigurationManager.a(this.getApplicationContext(), string);
        if (n2 == 1) {
            this.d.b(this.c, 0);
            this.b(string);
            this.finish();
            Intent intent = new Intent((Context)this, Multicity_home.class);
            intent.setFlags(335544320);
            this.startActivity(intent);
        }
    }

    public void a(String string, String string2, String string3, String string4, String string5, String string6, int n2, String string7) {
        if (!this.j()) {
            this.n();
        }
        Intent intent = new Intent(this.getApplicationContext(), InsideLocalTrainService.class);
        intent.putExtra("userid", string7);
        intent.putExtra("tn", string);
        intent.putExtra("subtitle", string2);
        intent.putExtra("selected_route", string3);
        intent.putExtra("you_are_at", string4);
        intent.putExtra("selected_train_string", string5);
        intent.putExtra("user_selected_dest", string6);
        intent.putExtra("selected_direction", n2);
        intent.putExtra("rt", true);
        androidx.core.content.a.a((Context)this, (Intent)intent);
    }

    public void a(boolean bl) {
        this.J = bl;
    }

    public boolean a(MenuItem menuItem) {
        ((DrawerLayout)this.findViewById(2131296695)).f(8388611);
        return true;
    }

    public boolean a(String string) {
        try {
            this.getPackageManager().getPackageInfo(string, 1);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public void b() {
        SharedPreferences sharedPreferences = this.getSharedPreferences("SHAREDPREFDIRECTIONINT1", 0);
        if (!sharedPreferences.getBoolean("isFixed", false)) {
            ArrayList<com.mobond.mindicator.ui.d> arrayList = f.b((Context)this.I);
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                String string;
                String string2;
                com.mobond.mindicator.ui.d d2;
                String string3;
                com.mobond.mindicator.ui.d d3 = (com.mobond.mindicator.ui.d)arrayList.get(i2);
                if (d3.x != -1 || (d2 = f.a(string2 = d3.s, string3 = d3.v.split("-")[0].trim(), string = d3.v.split("-")[1].trim(), (Context)this.m())) == null) continue;
                d2.x = GetAlertJobIntentService.a(string3, string, d2.w, d2.p, (Context)this.m());
                arrayList.set(i2, (Object)d2);
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("isFixed", true);
            editor.apply();
            f.a((Context)this.m(), arrayList);
        }
    }

    /*
     * Exception decompiling
     */
    public void b(Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl26 : ALOAD_1 : trying to set 1 previously set to 0
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

    public void b(com.google.android.gms.common.b b2) {
    }

    public void b(String string) {
        String[] arrstring;
        for (int i2 = 0; i2 < (arrstring = this.h).length; ++i2) {
            String string2 = arrstring[i2].toLowerCase();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("_global_android");
            String string3 = stringBuilder.toString();
            if (string2.equalsIgnoreCase(string.toLowerCase())) {
                com.mobond.mindicator.fcm.b.a(string3);
                String string4 = z;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("subscribed to ");
                stringBuilder2.append(string2);
                stringBuilder2.append(" ");
                stringBuilder2.append(string3);
                Log.d((String)string4, (String)stringBuilder2.toString());
                continue;
            }
            com.mobond.mindicator.fcm.b.b(string3);
            String string5 = z;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("unsubscribed to ");
            stringBuilder3.append(string2);
            stringBuilder3.append(" ");
            stringBuilder3.append(string3);
            Log.d((String)string5, (String)stringBuilder3.toString());
        }
    }

    public void b(String string, String string2) {
        this.x();
        Dialog dialog = new Dialog((Context)this.m());
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131492937);
        dialog.getWindow().setLayout(-1, -2);
        dialog.show();
        this.v = (EditText)dialog.findViewById(2131296704);
        this.w = (TextView)dialog.findViewById(2131296442);
        this.w.setOnClickListener(new View.OnClickListener(this, dialog, string2, string){
            final /* synthetic */ Dialog a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ Multicity_home d;
            {
                this.d = multicity_home;
                this.a = dialog;
                this.b = string;
                this.c = string2;
            }

            public void onClick(View view) {
                Multicity_home multicity_home = this.d;
                if (Multicity_home.b(multicity_home, multicity_home.v.getText().toString())) {
                    n.a(this.a);
                    Multicity_home multicity_home2 = this.d;
                    String string = this.b;
                    String string2 = multicity_home2.v.getText().toString();
                    String string3 = this.c;
                    Multicity_home.a(multicity_home2, string, string2, string3, string3);
                }
            }
        });
    }

    public long c() {
        ActivityManager activityManager = (ActivityManager)this.getApplicationContext().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public void e() {
        androidx.h.a.a.a((Context)this).a((BroadcastReceiver)this.K, new IntentFilter("com.mobond.mindicator.ui.livetrain.trainutils.InsideLocalTrainService.broadcast"));
    }

    public void f() {
        androidx.h.a.a.a((Context)this).a((BroadcastReceiver)this.K);
    }

    public void h() {
        if (this.j()) {
            this.unbindService(this.L);
            this.t = null;
        }
    }

    public ServiceConnection i() {
        return this.L;
    }

    public boolean j() {
        return this.J;
    }

    public void n() {
        if (this.bindService(new Intent((Context)this, InsideLocalTrainService.class), this.i(), 1)) {
            this.a(true);
            return;
        }
        this.a(false);
    }

    public void o() {
        if (this.j() && this.t != null) {
            this.unbindService(this.i());
            this.t.a();
            this.t = null;
            this.a(false);
        }
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        if (n2 != 151) {
            if (n2 != 2345) {
                return;
            }
            if (n3 == -1) {
                String string = GoogleLoginActivity.d((Context)this);
                GoogleLoginActivity.f((Context)this);
                String string2 = GoogleLoginActivity.e((Context)this);
                ((com.mobond.mindicator.ui.multicity.a)((e)a.getAdapter()).a(0)).a(string, string2);
                return;
            }
        } else if (n3 == -1) {
            String string = ((Credential)intent.getParcelableExtra("com.google.android.gms.credentials.Credential")).a();
            EditText editText = this.v;
            if (editText != null && this.w != null) {
                editText.setText((CharSequence)this.c(string));
                this.w.performClick();
            }
        }
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout)this.findViewById(2131296695);
        if (drawerLayout.g(8388611)) {
            drawerLayout.f(8388611);
            return;
        }
        int n2 = a.getCurrentItem();
        this.d.b(this.c, n2);
        Multicity_home.c((Context)this);
        this.setResult(-1, new Intent());
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y = false;
        this.I = this;
        Multicity_home.d((Context)this);
        this.y();
        com.mulo.a.b.b = true;
        this.setContentView(2131493077);
        this.b();
        f.e((Context)this.m());
        this.d = com.mobond.mindicator.a.a((Activity)this);
        String string = this.d.c((Context)this.m());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("app_lang: ");
        stringBuilder.append(string);
        Log.d((String)"2222", (String)stringBuilder.toString());
        if (string == null) {
            this.q();
        }
        if (!this.d.a("loc_launch_permission_asked", false)) {
            if (!h.a((Context)this.I, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                if (!h.a(this.I, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                    this.t();
                }
            }
        }
        int n2 = com.mobond.mindicator.a.a((Activity)this).v();
        if (com.mulo.b.c.a((Context)this)) {
            com.mobond.mindicator.a.a((Activity)this).a(n2 + 1);
        }
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        this.setSupportActionBar(toolbar);
        this.K = new BroadcastReceiver(){

            public void onReceive(Context context, Intent intent) {
                com.mobond.mindicator.ui.multicity.a a2 = (com.mobond.mindicator.ui.multicity.a)((e)Multicity_home.a.getAdapter()).a(0);
                if (intent != null) {
                    if (intent.getBooleanExtra("inside_train_off", false)) {
                        Multicity_home.this.o();
                        a2.a(null, (Context)Multicity_home.this);
                        return;
                    }
                    if (intent.getBooleanExtra("posfound", false)) {
                        a2.a(intent.getStringExtra("homescreentraininfo"));
                        return;
                    }
                    if (intent.hasExtra("message")) {
                        String string = intent.getStringExtra("message");
                        Multicity_home.this.d(string);
                        Multicity_home.this.v();
                    }
                }
            }
        };
        this.F = ConfigurationManager.b((Context)this);
        this.G = com.mulo.util.e.a(this.F, new char[]{' '});
        b = this.getSharedPreferences(this.s, 0);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(ConfigurationManager.b(this.getApplicationContext()));
        stringBuilder2.append("_");
        stringBuilder2.append("alerts_content");
        this.H = stringBuilder2.toString();
        if (!this.d.C()) {
            com.mobond.mindicator.fcm.b.a("global");
        }
        this.r = (DrawerLayout)this.findViewById(2131296695);
        androidx.appcompat.app.b b2 = new androidx.appcompat.app.b((Activity)this, this.r, toolbar, 2131755420, 2131755419);
        this.r.a((DrawerLayout.c)b2);
        b2.a();
        NavigationView navigationView = (NavigationView)this.findViewById(2131297014);
        navigationView.setNavigationItemSelectedListener((NavigationView.a)this);
        a = (ViewPager)this.findViewById(2131297669);
        this.a(a);
        this.i = (ImageView)this.findViewById(2131296600);
        this.a(ConfigurationManager.b(this.getApplicationContext()), 0);
        View view = navigationView.c(0);
        ((NavigationMenuView)navigationView.getChildAt(0)).setVerticalScrollBarEnabled(false);
        this.A = (LinearLayout)view.findViewById(2131296277);
        this.B = (LinearLayout)view.findViewById(2131296535);
        TextView textView = (TextView)view.findViewById(2131297586);
        u.a((View)textView, (q)new q(this, textView){
            final /* synthetic */ TextView a;
            final /* synthetic */ Multicity_home b;
            {
                this.b = multicity_home;
                this.a = textView;
            }

            public androidx.core.g.ac a(View view, androidx.core.g.ac ac2) {
                this.a.getLayoutParams().height = ac2.b();
                return ac2;
            }
        });
        this.e = (RelativeLayout)view.findViewById(2131296405);
        this.j = (ImageView)view.findViewById(2131297170);
        this.k = (ImageView)view.findViewById(2131296742);
        this.l = (ImageView)view.findViewById(2131297588);
        this.m = (ImageView)view.findViewById(2131297366);
        this.n = (TextView)view.findViewById(2131296694);
        this.p = (TextView)view.findViewById(2131296384);
        this.n.setText((CharSequence)g.a(this.G, g.a));
        this.q = (TextView)this.findViewById(2131296534);
        this.C = (LinearLayout)this.findViewById(2131297026);
        this.C.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ Multicity_home a;
            {
                this.a = multicity_home;
            }

            public void onClick(View view) {
                this.a.onNewsAlertClicked(view);
            }
        });
        this.q.setText((CharSequence)g.a(this.G, g.a));
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this).inflate(2131493073, (ViewGroup)this.B, false);
            TextView textView2 = (TextView)viewGroup.findViewById(2131297485);
            if (this.h[i2].equalsIgnoreCase(ConfigurationManager.b(this.getApplicationContext()).toUpperCase())) {
                ((ImageView)viewGroup.findViewById(2131296856)).setBackgroundDrawable(this.getResources().getDrawable(2131231163));
            }
            textView2.setText((CharSequence)com.mulo.util.e.a(g.a(this.h[i2], g.a), new char[]{' '}));
            viewGroup.setOnClickListener(new View.OnClickListener(this, i2){
                final /* synthetic */ int a;
                final /* synthetic */ Multicity_home b;
                {
                    this.b = multicity_home;
                    this.a = n2;
                }

                public void onClick(View view) {
                    this.b.d.b("isCityChange", "yes");
                    Multicity_home multicity_home = this.b;
                    multicity_home.a(multicity_home.h[this.a].toLowerCase(), 1);
                }
            });
            this.B.addView((View)viewGroup);
        }
        for (int i3 = 0; i3 < this.f.length; ++i3) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this).inflate(2131493062, (ViewGroup)this.A, false);
            ((TextView)viewGroup.findViewById(2131297485)).setText((CharSequence)g.a(this.f[i3], g.a));
            viewGroup.setOnClickListener(new View.OnClickListener(this, i3){
                final /* synthetic */ int a;
                final /* synthetic */ Multicity_home b;
                {
                    this.b = multicity_home;
                    this.a = n2;
                }

                /*
                 * Exception decompiling
                 */
                public void onClick(}
        }
        java.lang.IllegalStateException: Parameters not created
        
        