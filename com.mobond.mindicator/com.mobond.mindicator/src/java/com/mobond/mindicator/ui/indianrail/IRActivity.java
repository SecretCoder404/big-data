/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.Html
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  androidx.core.app.a
 *  androidx.core.content.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.FeedbackUI;
import com.mobond.mindicator.ui.alert.News;
import com.mobond.mindicator.ui.indianrail.IRActivity;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.pnrstatus.d;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.k;
import com.mobond.mindicator.ui.penalties.PenaltyList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class IRActivity
extends com.mobond.mindicator.ui.indianrail.util.a {
    public static com.mobond.mindicator.d a;
    public static com.mobond.mindicator.d b;
    @SuppressLint(value={"StaticFieldLeak"})
    public static TextView c;
    private static Vector<f> p;
    private ViewGroup A;
    private View B;
    public RelativeLayout d;
    public ImageView e;
    LinearLayout f;
    LinearLayout g;
    b h;
    boolean i = false;
    RelativeLayout j;
    TextView k;
    TextView l;
    View m;
    TextView n;
    private boolean q;
    private com.mobond.mindicator.ui.indianrail.util.a r;
    private TextView s;
    private TextView t;
    private Vector<String> u = new Vector();
    private Vector<String> v;
    private ArrayAdapter<String> w;
    private Vector<String> x;
    private ArrayAdapter<String> y;
    private View z;

    static /* synthetic */ com.mobond.mindicator.ui.indianrail.util.a a(IRActivity iRActivity) {
        return iRActivity.r;
    }

    public static Vector<f> a(Activity activity) {
        try {
            if (p == null) {
                p = com.mobond.mindicator.ui.indianrail.a.a.a((Context)activity);
            }
            Vector<f> vector = p;
            return vector;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(Context context, String string) {
        ConfigurationManager.a(context, "IR", string, "ANALYTICS_CLICK");
    }

    static /* synthetic */ void a(IRActivity iRActivity, String string, String string2) {
        iRActivity.b(string, string2);
    }

    static /* synthetic */ void a(IRActivity iRActivity, String string, boolean bl) {
        iRActivity.a(string, bl);
    }

    static /* synthetic */ void a(IRActivity iRActivity, boolean bl, String string, String string2) {
        iRActivity.a(bl, string, string2);
    }

    private void a(String string, boolean bl) {
        Vector<String> vector;
        String string2 = com.mobond.mindicator.ui.indianrail.a.a.a(string);
        int n2 = 0;
        if (bl) {
            if (!this.v.contains((Object)string2)) {
                this.v.add(0, (Object)string2);
                this.y.notifyDataSetChanged();
            } else {
                this.v.remove((Object)string2);
                this.v.add(0, (Object)string2);
            }
            vector = this.v;
        } else {
            if (!this.x.contains((Object)string2)) {
                this.x.add(0, (Object)string2);
                this.w.notifyDataSetChanged();
            } else {
                this.x.remove((Object)string2);
                this.x.add(0, (Object)string2);
            }
            vector = this.x;
        }
        b b2 = com.mobond.mindicator.a.b((Activity)this.r);
        JSONArray jSONArray = new JSONArray();
        for (String string3 : vector) {
            if (n2 > 5) break;
            jSONArray.put((Object)string3);
            ++n2;
        }
        String string4 = bl ? "from_to_history" : "to_history";
        b2.b(string4, jSONArray.toString());
    }

    private void a(boolean bl, String string, String string2) {
        Intent intent = new Intent((Context)this, ActivitySeatStatus.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.a((Context)this.r, com.mobond.mindicator.ui.indianrail.a.a.a(string)));
        stringBuilder.append(" - ");
        stringBuilder.append(f.a((Context)this.r, com.mobond.mindicator.ui.indianrail.a.a.a(string2)));
        intent.putExtra("title", stringBuilder.toString());
        intent.putExtra("getSeats", bl);
        intent.putExtra("src", string);
        intent.putExtra("dest", string2);
        this.startActivity(intent);
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            boolean bl = false;
            if (networkInfo != null) {
                bl = true;
            }
            return bl;
        }
        return false;
    }

    static /* synthetic */ boolean a(IRActivity iRActivity, String string) {
        return iRActivity.a(string);
    }

    private boolean a(String string) {
        return this.u.contains((Object)string);
    }

    static /* synthetic */ TextView b(IRActivity iRActivity) {
        return iRActivity.s;
    }

    public static void b(Activity activity) {
        Intent intent = new Intent((Context)activity, News.class);
        intent.putExtra("urlParameter", "type=indianrail");
        intent.putExtra("chatroom", false);
        intent.putExtra("alerttype", "ir_alerts_content");
        IRActivity.a((Context)activity, "IR_NEWS_CLICK");
        activity.startActivity(intent);
    }

    public static void b(Context context) {
        Log.d((String)"5555", (String)"5555 fetch call 1111");
        com.mobond.mindicator.fcm.a.a().a(new Runnable(context){
            final /* synthetic */ Context a;
            {
                this.a = context;
            }

            public void run() {
                Log.d((String)"5555", (String)"5555 fetch called");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ADTYPE_HOME_V2 Value: ");
                stringBuilder.append(com.mobond.mindicator.fcm.a.a("ADTYPE_HOME_V2"));
                Log.d((String)"5555", (String)stringBuilder.toString());
                Intent intent = new Intent(this.a, com.mobond.mindicator.util.OnlineDbUpdateService.class);
                com.mobond.mindicator.util.OnlineDbUpdateService.a(this.a, intent);
            }
        });
    }

    private void b(String string, String string2) {
        String string3 = this.r.getString(2131755287);
        String string4 = this.r.getString(2131755346);
        String string5 = this.r.getString(2131755219);
        if (this.q) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<b>");
            stringBuilder.append(string3);
            stringBuilder.append("</b>");
            string3 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("<big>");
            stringBuilder2.append(string4);
            stringBuilder2.append("</big>");
            string4 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("<big>");
            stringBuilder3.append(string5);
            stringBuilder3.append("</big>");
            string5 = stringBuilder3.toString();
        }
        d.a a2 = new d.a((Context)this.r);
        a2.a((CharSequence)Html.fromHtml((String)string3));
        a2.b(2131755366);
        a2.a((CharSequence)Html.fromHtml((String)string4), new DialogInterface.OnClickListener(this, string, string2){
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ IRActivity c;
            {
                this.c = iRActivity;
                this.a = string;
                this.b = string2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                IRActivity.a(this.c, false, this.a, this.b);
            }
        });
        a2.b((CharSequence)Html.fromHtml((String)string5), new DialogInterface.OnClickListener(this){
            final /* synthetic */ IRActivity a;
            {
                this.a = iRActivity;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        });
        a2.b().show();
    }

    static /* synthetic */ TextView c(IRActivity iRActivity) {
        return iRActivity.t;
    }

    static /* synthetic */ boolean d(IRActivity iRActivity) {
        return iRActivity.h();
    }

    private void e() {
        Intent intent = new Intent((Context)this.r, FeedbackUI.class);
        intent.putExtra("feedbacktype", FeedbackUI.h);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("App Version: v17.0.186 Eagle\nApp Build: A:T:20210102\nPhone Model: ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append("\nSDK: ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append("\nManufacturer: ");
        stringBuilder.append(Build.MANUFACTURER);
        stringBuilder.append("\nCity: m-train\n\n");
        intent.putExtra("info", stringBuilder.toString());
        this.startActivity(intent);
    }

    static /* synthetic */ void e(IRActivity iRActivity) {
        iRActivity.e();
    }

    private void f() {
        this.A.removeAllViews();
        Vector<f> vector = com.mobond.mindicator.ui.indianrail.trainschedule.a.a((Context)this.r);
        if (vector.size() > 0) {
            this.z.setVisibility(0);
            for (f f2 : vector) {
                View view = LayoutInflater.from((Context)this.r).inflate(2131493036, this.A, false);
                ((TextView)view.findViewById(2131297562)).setText((CharSequence)f2.a);
                ((TextView)view.findViewById(2131297561)).setText((CharSequence)f2.e);
                String string = f2.j;
                TextView textView = (TextView)view.findViewById(2131297392);
                textView.setText((CharSequence)string);
                textView.post(new Runnable(this, textView, f2){
                    final /* synthetic */ TextView a;
                    final /* synthetic */ f b;
                    final /* synthetic */ IRActivity c;
                    {
                        this.c = iRActivity;
                        this.a = textView;
                        this.b = f2;
                    }

                    /*
                     * Exception decompiling
                     */
                    public void run(}
            }
        }
        java.lang.IllegalStateException: Parameters not created
        
        