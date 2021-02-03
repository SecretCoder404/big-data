/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.TextView
 *  android.widget.Toast
 *  com.crashlytics.android.Crashlytics
 *  com.mobond.mindicator.ui.jobs.JobApplicationFormUI
 *  com.mobond.mindicator.ui.jobs.SubscribeToJobNotification
 *  com.mulo.b.e
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.StringTokenizer
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.mobond.mindicator.ui.jobs.JobApplicationFormUI;
import com.mobond.mindicator.ui.jobs.SubscribeToJobNotification;
import com.mulo.b.e;
import java.util.List;
import java.util.StringTokenizer;

public class n {
    static int a = 100;

    public static void a(final Activity activity, final String string) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public void run() {
                View view = activity.getLayoutInflater().inflate(2131493141, (ViewGroup)activity.findViewById(2131297522));
                TextView textView = (TextView)view.findViewById(2131297474);
                textView.setText((CharSequence)string);
                textView.setGravity(17);
                textView.setTypeface(Typeface.DEFAULT);
                Toast toast = new Toast((Context)activity);
                toast.setGravity(16, 0, 0);
                toast.setDuration(0);
                toast.setView(view);
                toast.show();
            }
        });
    }

    public static void a(Dialog dialog) {
        if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                    return;
                }
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("HANDLED EXCEPTION in UIUTIL dismissDialog() : ");
                stringBuilder.append(exception.getMessage());
                Crashlytics.logException((Throwable)new Throwable(stringBuilder.toString()));
            }
        }
    }

    public static void a(Context context, View view, String string) {
        n.d(context, string);
    }

    public static void a(final Context context, final String string) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public void run() {
                Toast toast = Toast.makeText((Context)context, (CharSequence)string, (int)1);
                toast.setGravity(16, 0, 0);
                toast.show();
            }
        });
    }

    /*
     * Exception decompiling
     */
    public static void a(String var0, Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl68 : RETURN : trying to set 0 previously set to 1
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean a(Context context, WebView webView, String string) {
        if (string.contains((CharSequence)"mobondhandle=system")) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
            return true;
        }
        if (string.contains((CharSequence)"mobondhandle=http")) {
            n.a(string, context);
            return true;
        }
        if (string.contains((CharSequence)"mobondhandle=youtube")) {
            string2 = com.mulo.util.e.a(string, "v");
            stringBuilder = new StringBuilder();
            stringBuilder.append("vnd.youtube:");
            stringBuilder.append(string2);
            intent = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString()));
            if (!context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
                context.startActivity(intent);
                return true;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
            return true;
        }
        if (webView != null && string.contains((CharSequence)"mobondhandle=jobapplicationform")) {
            string3 = com.mulo.util.e.a(string, "jobheader");
            intent = new Intent(webView.getContext(), JobApplicationFormUI.class);
            intent.putExtra("job_header", string3);
            intent.putExtra("jobid", com.mulo.util.e.a(string, "jobid"));
            intent.putExtra("employeremail", com.mulo.util.e.a(string, "employeremail"));
            ((Activity)context).startActivityForResult(intent, 0);
            return true;
        }
        if (webView != null && string.indexOf("mobondhandle=jobnotification") != -1) {
            context.startActivity(new Intent(webView.getContext(), SubscribeToJobNotification.class));
            return true;
        }
        if (string.indexOf("mobondhandle=map") != -1) {
            string4 = com.mulo.util.e.a(string, "lat");
            string5 = com.mulo.util.e.a(string, "lon");
            string6 = com.mulo.util.e.a(string, "title");
            stringBuilder = new StringBuilder();
            stringBuilder.append("geo:0,0?q=");
            stringBuilder.append(string4);
            stringBuilder.append(",");
            stringBuilder.append(string5);
            stringBuilder.append("(");
            stringBuilder.append(string6);
            stringBuilder.append(")");
            intent = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString()));
            intent.setPackage("com.google.android.apps.maps");
            context.startActivity(intent);
            return true;
        }
        if (string.indexOf("mobondhandle=places") != -1) {
            Log.d((String)"uiutilmap", (String)"mapplaces");
            intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
            intent.setPackage("com.google.android.apps.maps");
            context.startActivity(intent);
            return true;
        }
        if (webView != null && string.indexOf("mobondhandle=post") != -1) {
            string7 = com.mulo.util.e.a(string, "postdata");
            stringBuilder = new StringBuilder();
            stringBuilder.append("postdata: ");
            stringBuilder.append(string7);
            Log.d((String)"UIUtil", (String)stringBuilder.toString());
            string8 = string.replace((CharSequence)"mobondhandle=post", (CharSequence)"");
            if (string7 != null) {
                webView.postUrl(string8, string7.getBytes());
                return true;
            }
            webView.postUrl(string8, null);
            return true;
        }
        if (webView != null && (string.startsWith("http:") || string.startsWith("https:"))) {
            if (string.startsWith("http://m.mobond.com") || string.startsWith("http://mobondhrd.appspot.com")) {
                string = e.a((String)string, (Context)context);
            }
            if (string.indexOf("youtube.com") == -1) {
                Log.d((String)"bus_booking_url", (String)string);
                stringBuilder = new StringBuilder();
                stringBuilder.append("webView ");
                stringBuilder.append((Object)webView);
                Log.d((String)"bus_booking_url", (String)stringBuilder.toString());
                webView.loadUrl(string);
                return true;
            }
            string9 = com.mulo.util.e.a(string, "v");
            stringBuilder = new StringBuilder();
            stringBuilder.append("vnd.youtube:");
            stringBuilder.append(string9);
            intent = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString()));
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                context.startActivity(intent);
                return true;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
            return true;
        }
        if (string.startsWith("wtai://wp/ap;")) {
            stringTokenizer = new StringTokenizer(string, ";");
            stringTokenizer.nextToken();
            string10 = stringTokenizer.nextToken();
            string11 = stringTokenizer.nextToken();
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("name", string11);
            intent.putExtra("phone", string10);
            ((Activity)context).startActivityForResult(intent, n.a);
            return true;
        }
        if (!string.startsWith("mailto:")) ** GOTO lbl121
        try {
            intent = new Intent("android.intent.action.VIEW");
            intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
            string12 = string.substring(1 + string.indexOf(58), string.length());
            arrstring = new String[]{string12};
            if (string12.equals((Object)"support@mobond.com")) {
                intent.putExtra("android.intent.extra.SUBJECT", "Feedback");
                stringBuilder = new StringBuilder();
                stringBuilder.append("App Version: v17.0.186 Eagle\nApp Build: A:T:20210102\nPhone Model: ");
                stringBuilder.append(Build.MODEL);
                stringBuilder.append("\nSDK: ");
                stringBuilder.append(Build.VERSION.SDK_INT);
                stringBuilder.append("\nManufacturer: ");
                stringBuilder.append(Build.MANUFACTURER);
                stringBuilder.append("\n\nPlease write your feedback from here.\n\n");
                intent.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
            }
            intent.putExtra("android.intent.extra.EMAIL", arrstring);
            context.startActivity(intent);
            return true;
        }
        catch (Exception v0) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
                return true;
            }
            catch (Exception v1) {}
lbl121: // 2 sources:
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
            return true;
        }
        return true;
        catch (Exception exception) {
            Log.d((String)"UIUtil.handleUrl", (String)"UIUtil.handleUrl Exception", (Throwable)exception);
            return false;
        }
    }

    public static void b(Activity activity, String string) {
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tel:");
        stringBuilder.append(string);
        intent.setData(Uri.parse((String)stringBuilder.toString()));
        activity.startActivity(intent);
    }

    public static void b(final Context context, final String string) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public void run() {
                Toast toast = Toast.makeText((Context)context, (CharSequence)string, (int)0);
                toast.setGravity(16, 0, 0);
                toast.show();
            }
        });
    }

    public static void c(final Context context, final String string) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public void run() {
                View view = LayoutInflater.from((Context)context).inflate(2131493141, null).findViewById(2131297522);
                TextView textView = (TextView)view.findViewById(2131297474);
                textView.setText((CharSequence)string);
                textView.setGravity(17);
                textView.setTypeface(Typeface.DEFAULT);
                Toast toast = new Toast(context);
                toast.setGravity(16, 0, 0);
                toast.setDuration(1);
                toast.setView(view);
                toast.show();
            }
        });
    }

    public static void d(final Context context, final String string) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public void run() {
                View view = LayoutInflater.from((Context)context).inflate(2131493141, null).findViewById(2131297522);
                view.setBackgroundResource(2131231272);
                TextView textView = (TextView)view.findViewById(2131297474);
                textView.setText((CharSequence)string);
                textView.setGravity(17);
                textView.setTypeface(Typeface.DEFAULT);
                Toast toast = new Toast(context);
                toast.setGravity(16, 0, 0);
                toast.setDuration(0);
                toast.setView(view);
                toast.show();
            }
        });
    }

    public static void e(final Context context, final String string) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public void run() {
                View view = LayoutInflater.from((Context)context).inflate(2131493141, null).findViewById(2131297522);
                view.setBackgroundResource(2131231271);
                TextView textView = (TextView)view.findViewById(2131297474);
                textView.setText((CharSequence)string);
                textView.setGravity(17);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setTextColor(context.getResources().getColor(2131099694));
                Toast toast = new Toast(context);
                toast.setGravity(16, 0, 0);
                toast.setDuration(0);
                toast.setView(view);
                toast.show();
            }
        });
    }

    public static void f(Context context, String string) {
        Toast toast = Toast.makeText((Context)context, (CharSequence)string, (int)0);
        toast.setGravity(17, 0, 0);
        toast.show();
    }

}

