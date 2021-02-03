/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.location.Location
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.text.Html
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.webkit.WebView
 *  android.widget.Button
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.RadioGroup
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.appcompat.widget.AppCompatRadioButton
 *  androidx.appcompat.widget.SwitchCompat
 *  androidx.appcompat.widget.Toolbar
 *  androidx.appcompat.widget.Toolbar$c
 *  androidx.core.app.a
 *  androidx.fragment.app.d
 *  androidx.fragment.app.e
 *  androidx.fragment.app.j
 *  androidx.fragment.app.n
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$f
 *  androidx.viewpager.widget.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.trainschedule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j;
import androidx.viewpager.widget.ViewPager;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.chat.ChatScreenHSV;
import com.mobond.mindicator.ui.indianrail.IRActivity;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mobond.mindicator.ui.indianrail.irplugin.CommonCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrInput;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule;
import com.mobond.mindicator.ui.indianrail.util.views.SlidingTabLayout;
import com.mobond.mindicator.ui.n;
import com.mulo.util.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActivityTrainSchedule
extends com.mobond.mindicator.ui.indianrail.util.a {
    public String[] a;
    String b;
    String c;
    String d;
    f e;
    private String f;
    private MenuItem g;
    private ViewPager h;
    private String i = null;
    private d j;
    private View k;
    private TextView l;
    private ImageView m;
    private int n;

    private int a(long l2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        return e.a(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    static /* synthetic */ int a(ActivityTrainSchedule activityTrainSchedule, int n2) {
        activityTrainSchedule.n = n2;
        return n2;
    }

    static /* synthetic */ ImageView a(ActivityTrainSchedule activityTrainSchedule) {
        return activityTrainSchedule.m;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String a(String string, Activity activity) {
        com.mobond.mindicator.ui.indianrail.pnrstatus.c c2 = new com.mobond.mindicator.ui.indianrail.pnrstatus.c((Context)activity);
        ArrayList<String> arrayList = ActivityPnrInput.a((Context)activity);
        StringBuilder stringBuilder = new StringBuilder();
        if (arrayList == null) return null;
        int n2 = 0;
        while (n2 < arrayList.size()) {
            try {
                String string2 = (String)arrayList.get(n2);
                JSONObject jSONObject = new JSONObject(c2.i(string2));
                if (jSONObject.getString("train_number").equals((Object)string) && this.a(jSONObject)) {
                    String string3 = String.valueOf((int)this.a(jSONObject.getLong("date_in_millis")));
                    String string4 = jSONObject.getString("boarding_point");
                    String string5 = jSONObject.getBoolean("is_anyone_confirmed") ? "0" : "1";
                    stringBuilder.append(string2);
                    stringBuilder.append(",");
                    stringBuilder.append(string3);
                    stringBuilder.append(",");
                    stringBuilder.append(string4);
                    stringBuilder.append(",");
                    stringBuilder.append(string5);
                    return stringBuilder.toString();
                }
            }
            catch (Exception exception) {
                com.mobond.mindicator.ui.indianrail.a.a.a((Context)activity, exception.getMessage(), exception);
            }
            ++n2;
        }
        return null;
    }

    private void a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SPOT ");
        stringBuilder.append(this.c.trim());
        this.a(stringBuilder.toString(), "139");
        ConfigurationManager.a((Context)this, "IR", "button_press", "SPOT TRAIN");
    }

    private void a(Activity activity, String string, String string2) {
        IRActivity.a((Context)activity, "IR_CHAT_CLICKED");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IR_");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        Intent intent = new Intent((Context)activity, ChatScreenHSV.class);
        intent.putExtra("alerttype", "ir_alerts_content");
        intent.putExtra("CHATROOMKEY", string3);
        intent.putExtra("CHATROOMTITLE", string);
        intent.putExtra("CHATTYPE", "CT");
        intent.putExtra("HIDEAD", "false");
        intent.putExtra("CHATGIPARENT", "IR");
        intent.putExtra("brandLLColor", "#1b83d6");
        intent.putExtra("actionBarColor", "#2196f3");
        intent.putExtra("helpfulChatBgColor", "#AA1b83d6");
        intent.putExtra("sendImgBgColor", "#1b83d6");
        activity.startActivity(intent);
    }

    static /* synthetic */ void a(ActivityTrainSchedule activityTrainSchedule, Activity activity, String string, String string2) {
        activityTrainSchedule.a(activity, string, string2);
    }

    private boolean a(JSONObject jSONObject) {
        int n2 = this.a(jSONObject.getLong("date_in_millis"));
        int n3 = e.a();
        return n3 - 4 < n2 && n2 <= n3;
    }

    static /* synthetic */ MenuItem b(ActivityTrainSchedule activityTrainSchedule) {
        return activityTrainSchedule.g;
    }

    private static void b(String string) {
    }

    static /* synthetic */ ViewPager c(ActivityTrainSchedule activityTrainSchedule) {
        return activityTrainSchedule.h;
    }

    static /* synthetic */ d d(ActivityTrainSchedule activityTrainSchedule) {
        return activityTrainSchedule.j;
    }

    static /* synthetic */ int f(ActivityTrainSchedule activityTrainSchedule) {
        return activityTrainSchedule.n;
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        if (n2 == 199) {
            if (n3 == -1) {
                if (this.j.b != null) {
                    this.j.b.x.b((Context)this);
                    return;
                }
            } else if (n3 == 0) {
                n.d((Context)this, this.getString(2131755213));
                if (this.j.b != null) {
                    if (this.j.b.w != null && this.j.b.w.isShowing()) {
                        this.j.b.w.dismiss();
                    }
                    this.j.b.o.setChecked(false);
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.setContentView(2131493054);
        this.k = com.mobond.mindicator.ui.c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/1511522842", "167101606757479_1239841476150148", "ca-app-pub-5449278086868932/5383857690", "167101606757479_1235754263225536", 3, null);
        Intent intent = this.getIntent();
        this.c = intent.getStringExtra("num").trim().substring(0, 5).trim();
        this.b = intent.getStringExtra("name");
        this.d = intent.hasExtra("pnr") ? intent.getStringExtra("pnr") : this.a(this.c, (Activity)this);
        if (intent.hasExtra("boardingStnCode")) {
            this.i = intent.getStringExtra("boardingStnCode");
        }
        if (intent.hasExtra("coach_pos")) {
            String string2 = intent.getStringExtra("coach_pos");
            int n2 = string2.indexOf(": ");
            int n3 = string2.indexOf("\n");
            if (n2 != -1 && n3 != -1) {
                this.f = string2.substring(n2 + 2, n3);
            }
        }
        try {
            this.e = com.mobond.mindicator.ui.indianrail.a.a.a(this.c, (Context)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Log.d((String)"activitytrainschedule", (String)exception.getMessage(), (Throwable)exception);
        }
        f f2 = this.e;
        if (f2 != null) {
            com.mobond.mindicator.ui.indianrail.trainschedule.a.a((Context)this, f2.a, this.e.e, this.e.j, false);
            if (this.b == null) {
                this.b = this.e.e;
            }
        }
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        if (this.b.isEmpty()) {
            string = "";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" - ");
            stringBuilder2.append(this.b);
            string = stringBuilder2.toString();
        }
        stringBuilder.append(string);
        String string3 = stringBuilder.toString();
        toolbar.setTitle((CharSequence)string3);
        this.setSupportActionBar(toolbar);
        ((FrameLayout)this.findViewById(2131296509)).setVisibility(0);
        this.l = (TextView)this.findViewById(2131296892);
        this.l.setOnClickListener(new View.OnClickListener(this, string3){
            final /* synthetic */ String a;
            final /* synthetic */ ActivityTrainSchedule b;
            {
                this.b = activityTrainSchedule;
                this.a = string;
            }

            public void onClick(View view) {
                ActivityTrainSchedule activityTrainSchedule = this.b;
                ActivityTrainSchedule.a(activityTrainSchedule, (Activity)activityTrainSchedule, this.a, activityTrainSchedule.c);
            }
        });
        this.m = (ImageView)this.findViewById(2131297367);
        this.m.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityTrainSchedule a;
            {
                this.a = activityTrainSchedule;
            }

            public void onClick(View view) {
                ActivityTrainSchedule activityTrainSchedule = this.a;
                com.mobond.mindicator.ui.indianrail.util.b.a((Activity)activityTrainSchedule, (View)ActivityTrainSchedule.a(activityTrainSchedule));
            }
        });
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout)this.findViewById(2131297377);
        this.h = (ViewPager)this.findViewById(2131297666);
        String[] arrstring = new String[]{this.getString(2131755367), this.getString(2131755343), this.getString(2131755227)};
        this.a = arrstring;
        this.j = new d(this.getSupportFragmentManager());
        this.h.setAdapter((androidx.viewpager.widget.a)this.j);
        slidingTabLayout.setViewPager(this.h);
        slidingTabLayout.setOnPageChangeListener(new ViewPager.f(this){
            final /* synthetic */ ActivityTrainSchedule a;
            {
                this.a = activityTrainSchedule;
            }

            public void a(int n2) {
                ActivityTrainSchedule.a(this.a, n2);
                if (n2 == 1) {
                    if (ActivityTrainSchedule.b(this.a) != null) {
                        ActivityTrainSchedule.b(this.a).setVisible(true);
                    }
                    ActivityTrainSchedule.c(this.a).setOffscreenPageLimit(3);
                    IRActivity.a((Context)this.a, "RUNNING STATUS");
                    return;
                }
                if (n2 == 2) {
                    ActivityTrainSchedule.c(this.a).setOffscreenPageLimit(3);
                    if (ActivityTrainSchedule.b(this.a) != null) {
                        ActivityTrainSchedule.b(this.a).setVisible(false);
                    }
                    IRActivity.a((Context)this.a, "COACH POSITION");
                    return;
                }
                if (ActivityTrainSchedule.b(this.a) != null) {
                    ActivityTrainSchedule.b(this.a).setVisible(false);
                }
            }

            public void a(int n2, float f2, int n3) {
            }

            public void b(int n2) {
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.c(this){
            final /* synthetic */ ActivityTrainSchedule a;
            {
                this.a = activityTrainSchedule;
            }

            public boolean a(MenuItem menuItem) {
                if (menuItem.getItemId() == ActivityTrainSchedule.b(this.a).getItemId() && ActivityTrainSchedule.d(this.a) != null && d.a(ActivityTrainSchedule.d(this.a)) != null) {
                    if (b.a(d.a(ActivityTrainSchedule.d(this.a)))) {
                        b.a(d.a(ActivityTrainSchedule.d(this.a)), this.a);
                    } else {
                        b b2 = d.a(ActivityTrainSchedule.d(this.a));
                        ActivityTrainSchedule activityTrainSchedule = this.a;
                        b.a(b2, (Activity)activityTrainSchedule, activityTrainSchedule.c);
                    }
                    return true;
                }
                return false;
            }
        });
        if (intent.hasExtra("page_pos")) {
            this.h.a(intent.getIntExtra("page_pos", 0), true);
            return;
        }
        if (intent.hasExtra("coach_pos")) {
            this.h.a(2, true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131558405, menu);
        this.g = menu.findItem(2131297181);
        if (this.h.getCurrentItem() == 1) {
            this.g.setVisible(true);
            return true;
        }
        this.g.setVisible(false);
        return true;
    }

    protected void onDestroy() {
        com.mobond.mindicator.ui.c.c(this.k);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        com.mobond.mindicator.ui.c.b(this.k);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 104) {
            if (arrn.length > 0 && arrn[0] == 0) {
                if (this.j.b != null) {
                    this.j.b.x.b((Context)this);
                    return;
                }
            } else {
                if (this.j.b != null) {
                    if (this.j.b.w != null && this.j.b.w.isShowing()) {
                        this.j.b.w.dismiss();
                    }
                    this.j.b.o.setChecked(false);
                }
                if (!androidx.core.app.a.a((Activity)this, (String)arrstring[0])) {
                    com.mobond.mindicator.a.a((Activity)this).b(Arrays.toString((Object[])arrstring), true);
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        com.mobond.mindicator.ui.c.a(this.k);
    }

    public static class a
    extends androidx.fragment.app.d {
        private String a;
        private ActivityTrainSchedule b;

        static /* synthetic */ ActivityTrainSchedule a(a a2) {
            return a2.b;
        }

        private static a b() {
            return new a();
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.b = (ActivityTrainSchedule)this.getActivity();
            if (this.b.e != null) {
                this.a = this.b.e.v;
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View view;
            block7 : {
                view = layoutInflater.inflate(2131493032, viewGroup, false);
                view.setBackgroundColor(-14606047);
                LinearLayout linearLayout = (LinearLayout)view.findViewById(2131296569);
                ViewGroup viewGroup2 = (ViewGroup)view.findViewById(2131297267);
                View[] arrview = new View[]{null};
                String string = this.a;
                if (string == null || string.isEmpty()) break block7;
                String[] arrstring = this.a.split(",");
                int n2 = arrstring.length;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                while (n5 < n2) {
                    int n6;
                    View view2;
                    String string2;
                    int n7;
                    String[][] arrstring2;
                    int n8;
                    View view3;
                    block11 : {
                        block10 : {
                            block8 : {
                                block9 : {
                                    string2 = arrstring[n5];
                                    view3 = LayoutInflater.from((Context)this.b).inflate(2131493033, null, false);
                                    TextView textView = (TextView)view3.findViewById(2131296567);
                                    textView.setText((CharSequence)string2);
                                    arrstring2 = IRParserProvider.getIRParser().getCoachComment(string2);
                                    TextView textView2 = (TextView)view3.findViewById(2131296590);
                                    n6 = n5;
                                    Locale locale = Locale.ENGLISH;
                                    n8 = n2;
                                    view2 = view;
                                    Object[] arrobject = new Object[]{n4};
                                    textView2.setText((CharSequence)String.format((Locale)locale, (String)"%d", (Object[])arrobject));
                                    textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, textView){
                                        final /* synthetic */ TextView a;
                                        final /* synthetic */ a b;
                                        {
                                            this.b = a2;
                                            this.a = textView;
                                        }

                                        public void onGlobalLayout() {
                                            if (android.os.Build$VERSION.SDK_INT < 16) {
                                                this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                                            } else {
                                                this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                                            }
                                            this.a.getHeight();
                                            if (this.a.getLineCount() > 1) {
                                                this.a.setTextSize(2, (float)11);
                                            }
                                        }
                                    });
                                    linearLayout.addView(view3);
                                    if (this.b.f == null) break block8;
                                    if (!string2.equalsIgnoreCase(this.b.f)) break block9;
                                    arrview[0] = view3;
                                    break block10;
                                }
                                if (arrview[0] != null || n3 != 0 || !string2.equals((Object)"S1")) break block10;
                                n7 = n4;
                                break block11;
                            }
                            if (arrview[0] == null && arrstring2[0][1] != null && !arrstring2[0][1].startsWith("\n")) {
                                arrview[0] = view3;
                            }
                        }
                        n7 = n3;
                    }
                    if (n4 == 0) {
                        view3.findViewById(2131297533).setVisibility(4);
                        view3.setPadding(0, 16 * (int)this.getResources().getDisplayMetrics().density, 0, 0);
                    } else if (n4 == arrstring.length - 1) {
                        view3.findViewById(2131296417).setVisibility(4);
                        view3.setPadding(0, 0, 0, 16 * (int)this.getResources().getDisplayMetrics().density);
                    }
                    int n9 = n4;
                    View.OnClickListener onClickListener = new View.OnClickListener(this, arrstring2, string2, viewGroup2, arrview, view3){
                        final /* synthetic */ String[][] a;
                        final /* synthetic */ String b;
                        final /* synthetic */ ViewGroup c;
                        final /* synthetic */ View[] d;
                        final /* synthetic */ View e;
                        final /* synthetic */ a f;
                        {
                            this.f = a2;
                            this.a = arrstring;
                            this.b = string;
                            this.c = viewGroup;
                            this.d = arrview;
                            this.e = view;
                        }

                        /*
                         * Unable to fully structure code
                         * Enabled aggressive block sorting
                         * Lifted jumps to return sites
                         */
                        public void onClick(View var1_1) {
                            block41 : {
                                block44 : {
                                    block42 : {
                                        block43 : {
                                            block40 : {
                                                var2_2 = this.a;
                                                if (var2_2[0][0] == null) return;
                                                var3_3 = var2_2[0];
                                                var4_4 = 1;
                                                if (var3_3[var4_4] == null) return;
                                                var5_5 = new StringBuilder();
                                                var5_5.append("<b><big>");
                                                var5_5.append(this.b);
                                                var5_5.append("</big></b>    ");
                                                var5_5.append(this.a[0][0]);
                                                var10_6 = var5_5.toString();
                                                this.c.removeAllViews();
                                                if (!this.a[0][var4_4].startsWith("\n")) break block40;
                                                var11_7 = new TextView((Context)a.a(this.f));
                                                var11_7.setTextColor(-1118482);
                                                var11_7.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                                                var11_7.setTextSize(2, 21.0f);
                                                var11_7.setGravity(17);
                                                var11_7.setLayoutParams((android.view.ViewGroup$LayoutParams)new android.widget.FrameLayout$LayoutParams(-1, -2));
                                                var11_7.setText((CharSequence)this.a[0][var4_4]);
                                                this.d[0].findViewById(2131296606).setVisibility(4);
                                                this.e.findViewById(2131296606).setVisibility(4);
                                                this.c.addView((View)var11_7);
                                                break block41;
                                            }
                                            var12_8 = this.a[0][var4_4];
                                            var13_9 = var12_8.hashCode();
                                            if (var13_9 == 115) break block42;
                                            if (var13_9 == 3105) break block43;
                                            switch (var13_9) {
                                                default: {
                                                    switch (var13_9) {
                                                        default: {
                                                            switch (var13_9) {
                                                                default: {
                                                                    ** GOTO lbl-1000
                                                                }
                                                                case 3322: {
                                                                    if (var12_8.equals((Object)"hb")) {
                                                                        var4_4 = 10;
                                                                        ** break;
                                                                    }
                                                                    ** GOTO lbl-1000
                                                                }
                                                                case 3321: {
                                                                    if (var12_8.equals((Object)"ha")) {
                                                                        var4_4 = 9;
                                                                        ** break;
                                                                    }
                                                                    ** GOTO lbl-1000
lbl47: // 2 sources:
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        case 104: {
                                                            if (var12_8.equals((Object)"h")) {
                                                                var4_4 = 7;
                                                                ** break;
                                                            }
                                                            ** GOTO lbl-1000
                                                        }
                                                        case 103: {
                                                            if (var12_8.equals((Object)"g")) {
                                                                var4_4 = 6;
                                                                ** break;
                                                            }
                                                            ** GOTO lbl-1000
lbl59: // 2 sources:
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 101: {
                                                    if (var12_8.equals((Object)"e")) {
                                                        var4_4 = 5;
                                                        ** break;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                case 100: {
                                                    if (var12_8.equals((Object)"d")) {
                                                        var4_4 = 4;
                                                        ** break;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                case 99: {
                                                    if (var12_8.equals((Object)"c")) {
                                                        var4_4 = 3;
                                                        ** break;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                case 98: {
                                                    if (var12_8.equals((Object)"b")) {
                                                        var4_4 = 2;
                                                        ** break;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                case 97: {
                                                    if (var12_8.equals((Object)"a")) {
                                                        var4_4 = 0;
                                                        ** break;
                                                    }
                                                    ** GOTO lbl-1000
lbl86: // 5 sources:
                                                    break;
                                                }
                                            }
                                            break block44;
                                        }
                                        if (!var12_8.equals((Object)"ab")) ** GOTO lbl-1000
                                        break block44;
                                    }
                                    if (var12_8.equals((Object)"s")) {
                                        var4_4 = 8;
                                    } else lbl-1000: // 12 sources:
                                    {
                                        var4_4 = -1;
                                    }
                                }
                                switch (var4_4) {
                                    default: {
                                        ** break;
                                    }
                                    case 10: {
                                        var25_10 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493030, this.c, false);
                                        ((TextView)var25_10.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var25_10);
                                        ** break;
                                    }
                                    case 9: {
                                        var24_11 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493029, this.c, false);
                                        ((TextView)var24_11.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var24_11);
                                        ** break;
                                    }
                                    case 8: {
                                        var23_12 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493031, this.c, false);
                                        ((TextView)var23_12.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var23_12);
                                        ** break;
                                    }
                                    case 7: {
                                        var22_13 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493028, this.c, false);
                                        ((TextView)var22_13.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var22_13);
                                        ** break;
                                    }
                                    case 6: {
                                        var21_14 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493027, this.c, false);
                                        ((TextView)var21_14.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var21_14);
                                        ** break;
                                    }
                                    case 5: {
                                        var20_15 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493026, this.c, false);
                                        ((TextView)var20_15.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var20_15);
                                        ** break;
                                    }
                                    case 4: {
                                        var19_16 = a.a((a)this.f).b.contains((CharSequence)"SHATABDI") != false ? LayoutInflater.from((Context)a.a(this.f)).inflate(2131493025, this.c, false) : LayoutInflater.from((Context)a.a(this.f)).inflate(2131493024, this.c, false);
                                        ((TextView)var19_16.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var19_16);
                                        ** break;
                                    }
                                    case 3: {
                                        if (!a.a((a)this.f).b.contains((CharSequence)"SHATABDI") && !a.a((a)this.f).b.contains((CharSequence)"DURONTO")) {
                                            var18_17 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493022, this.c, false);
                                            ((TextView)var18_17.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                            this.c.addView(var18_17);
                                            ** break;
                                        }
                                        var17_18 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493023, this.c, false);
                                        ((TextView)var17_18.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var17_18);
                                        ** break;
                                    }
                                    case 2: {
                                        var16_19 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493021, this.c, false);
                                        ((TextView)var16_19.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var16_19);
                                        ** break;
                                    }
                                    case 1: {
                                        var15_20 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493020, this.c, false);
                                        ((TextView)var15_20.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                        this.c.addView(var15_20);
                                        ** break;
                                    }
                                    case 0: 
                                }
                                var14_21 = LayoutInflater.from((Context)a.a(this.f)).inflate(2131493019, this.c, false);
                                ((TextView)var14_21.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)var10_6));
                                this.c.addView(var14_21);
lbl159: // 13 sources:
                                this.d[0].findViewById(2131296606).setVisibility(4);
                                this.e.findViewById(2131296606).setVisibility(0);
                            }
                            this.d[0].findViewById(2131296568).setBackgroundResource(2131230917);
                            this.e.findViewById(2131296568).setBackgroundResource(2131230918);
                            this.d[0] = this.e;
                            this.c.scrollTo(0, 0);
                        }
                    };
                    view3.setOnClickListener(onClickListener);
                    n4 = n9 + 1;
                    n5 = n6 + 1;
                    n3 = n7;
                    n2 = n8;
                    view = view2;
                }
                View view4 = view;
                if (this.b.f != null && arrview[0] == null) {
                    arrview[0] = linearLayout.getChildAt(n3);
                }
                if (arrview[0] == null) {
                    arrview[0] = linearLayout.getChildAt(0);
                }
                arrview[0].performClick();
                ScrollView scrollView = (ScrollView)linearLayout.getParent();
                scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, scrollView, arrview){
                    final /* synthetic */ ScrollView a;
                    final /* synthetic */ View[] b;
                    final /* synthetic */ a c;
                    {
                        this.c = a2;
                        this.a = scrollView;
                        this.b = arrview;
                    }

                    public void onGlobalLayout() {
                        if (android.os.Build$VERSION.SDK_INT < 16) {
                            this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                        } else {
                            this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                        }
                        if (ActivityTrainSchedule.h(a.a(this.c)) != null) {
                            this.a.scrollTo(0, (int)this.b[0].getY());
                        }
                    }
                });
                return view4;
            }
            View view5 = view;
            view5.findViewById(2131296886).setVisibility(0);
            return view5;
        }
    }

    public static class b
    extends androidx.fragment.app.d {
        private boolean A = false;
        boolean a = false;
        a.b b = null;
        public WebView c;
        private ActivityTrainSchedule d;
        private ListView e;
        private RadioGroup f;
        private AppCompatRadioButton g;
        private AppCompatRadioButton h;
        private AppCompatRadioButton i;
        private AppCompatRadioButton[] j;
        private HashMap<Integer, a> k;
        private View l;
        private View m;
        private RelativeLayout n;
        private SwitchCompat o;
        private Button p;
        private Button q;
        private TextView r;
        private int s = -10;
        private int t = -1;
        private boolean u = false;
        private boolean v = false;
        private ProgressDialog w;
        private com.mobond.mindicator.a.a x;
        private Vector<g> y;
        private com.mobond.mindicator.ui.indianrail.trainschedule.c z;

        private int a(String string) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM yyyy", Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(string));
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            return (int)((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000L);
        }

        private void a(int n2) {
            HashMap<Integer, a> hashMap = this.k;
            if (hashMap != null && !hashMap.isEmpty() && !this.v) {
                a a2 = this.k.get((Object)n2);
                if (a2 != null) {
                    this.e.setAdapter((ListAdapter)new com.mobond.mindicator.ui.indianrail.trainschedule.c(this.d, a2));
                    this.e.setSelection(-1 + a2.i);
                    return;
                }
                int n3 = (Integer)new ArrayList((Collection)this.k.keySet()).get(0);
                if (this.k.get((Object)n3) != null) {
                    a a3 = this.k.get((Object)n3);
                    this.e.setAdapter((ListAdapter)new com.mobond.mindicator.ui.indianrail.trainschedule.c(this.d, a3));
                    this.e.setSelection(-1 + a3.i);
                    return;
                }
            } else if (!this.v) {
                this.l.setVisibility(8);
                this.p.setVisibility(0);
                this.q.setVisibility(0);
                this.e.setAdapter(null);
            }
        }

        private void a(Activity activity, ProgressDialog progressDialog) {
            String string = activity.getString(2131755225);
            String string2 = activity.getString(2131755222);
            progressDialog.setTitle((CharSequence)Html.fromHtml((String)activity.getString(2131755231)));
            progressDialog.setMessage((CharSequence)activity.getString(2131755230));
            progressDialog.setCancelable(true);
            progressDialog.setButton((CharSequence)Html.fromHtml((String)string), new DialogInterface.OnClickListener(this, progressDialog){
                final /* synthetic */ ProgressDialog a;
                final /* synthetic */ b b;
                {
                    this.b = b2;
                    this.a = progressDialog;
                }

                public void onClick(DialogInterface dialogInterface, int n2) {
                    this.a.dismiss();
                    b.k(this.b);
                }
            });
            progressDialog.setButton2((CharSequence)Html.fromHtml((String)string2), new DialogInterface.OnClickListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onClick(DialogInterface dialogInterface, int n2) {
                }
            });
            progressDialog.show();
        }

        private void a(Activity activity, String string) {
            ProgressDialog progressDialog;
            if (this.k == null) {
                this.m.setVisibility(0);
                this.l.setVisibility(8);
                this.p.setVisibility(8);
                this.q.setVisibility(0);
                progressDialog = null;
            } else {
                progressDialog = new ProgressDialog((Context)activity);
                this.a(activity, progressDialog);
            }
            this.a(activity, string, progressDialog);
            this.b(string, progressDialog);
        }

        private void a(Activity activity, String string, ProgressDialog progressDialog) {
            new Thread(new Runnable(this, string, activity, progressDialog){
                final /* synthetic */ String a;
                final /* synthetic */ Activity b;
                final /* synthetic */ ProgressDialog c;
                final /* synthetic */ b d;
                {
                    this.d = b2;
                    this.a = string;
                    this.b = activity;
                    this.c = progressDialog;
                }

                public void run() {
                    try {
                        com.mulo.b.h h2 = new com.mulo.b.h();
                        h2.a("trainno", this.a);
                        String string = com.mulo.b.c.a("http://mobondhrd.appspot.com/irgetrunningstatus", h2, null);
                        this.b.runOnUiThread(new Runnable(this, string){
                            final /* synthetic */ String a;
                            final /* synthetic */ 9 b;
                            {
                                this.b = var1_1;
                                this.a = string;
                            }

                            public void run() {
                                if (this.b.d.isAdded()) {
                                    b.a(this.b.d, this.a, this.b.c);
                                }
                            }
                        });
                        return;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        return;
                    }
                }
            }).start();
        }

        private void a(View view) {
            this.c = (WebView)view.findViewById(2131297676);
            this.e = (ListView)view.findViewById(2131297439);
            this.r = (TextView)view.findViewById(2131296886);
            this.n = (RelativeLayout)view.findViewById(2131296385);
            this.f = (RadioGroup)view.findViewById(2131296609);
            this.g = (AppCompatRadioButton)view.findViewById(2131297137);
            this.h = (AppCompatRadioButton)view.findViewById(2131297138);
            this.i = (AppCompatRadioButton)view.findViewById(2131297139);
            AppCompatRadioButton[] arrappCompatRadioButton = this.j = new AppCompatRadioButton[3];
            arrappCompatRadioButton[0] = this.g;
            arrappCompatRadioButton[1] = this.h;
            arrappCompatRadioButton[2] = this.i;
            this.p = (Button)view.findViewById(2131297230);
            this.q = (Button)view.findViewById(2131297383);
            this.l = view.findViewById(2131296828);
            this.m = view.findViewById(2131297129);
            this.o = (SwitchCompat)view.findViewById(2131297689);
            this.o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                    b.a(this.a, bl);
                    if (b.a(this.a)) {
                        IRActivity.a((Context)b.e(this.a), "IR_USER_INSIDE_TRAIN_CLICKED");
                        if (com.mobond.mindicator.h.a((Context)b.e(this.a), "android.permission.ACCESS_FINE_LOCATION")) {
                            b b2 = this.a;
                            b.a(b2, b.e(b2));
                            return;
                        }
                        com.mobond.mindicator.h.a((Activity)b.e(this.a), "LOCATION", new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 104);
                        return;
                    }
                    b.f(this.a).setVisibility(0);
                    int n2 = b.g(this.a).isChecked() && b.g(this.a).getTag() != null ? (Integer)b.g(this.a).getTag() : (b.h(this.a).isChecked() && b.h(this.a).getTag() != null ? (Integer)b.h(this.a).getTag() : (b.i(this.a).isChecked() && b.i(this.a).getTag() != null ? (Integer)b.i(this.a).getTag() : b.j(this.a)));
                    b.a(this.a, n2);
                }
            });
            this.q.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onClick(View view) {
                    b.k(this.a);
                }
            });
            this.p.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onClick(View view) {
                    if (b.a(this.a)) {
                        b b2 = this.a;
                        b.a(b2, b.e(b2));
                        return;
                    }
                    b b3 = this.a;
                    b.a(b3, (Activity)b.e(b3), b.e((b)this.a).c);
                }
            });
        }

        private void a(a.b b2, String string, String[] arrstring, boolean bl) {
            if (this.v) {
                int n2 = b2.d();
                if (bl) {
                    com.mobond.mindicator.ui.indianrail.trainschedule.c c2;
                    this.z = c2 = new com.mobond.mindicator.ui.indianrail.trainschedule.c(this.d, this.y, b2, string, arrstring);
                    this.l.setVisibility(0);
                    this.e.setAdapter((ListAdapter)this.z);
                    this.e.setSelection(n2 - 1);
                } else {
                    this.z.a(b2);
                    this.z.a(arrstring);
                }
                ProgressDialog progressDialog = this.w;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.w.dismiss();
                }
            }
        }

        static /* synthetic */ void a(b b2, int n2) {
            b2.a(n2);
        }

        static /* synthetic */ void a(b b2, Activity activity, String string) {
            b2.a(activity, string);
        }

        static /* synthetic */ void a(b b2, ActivityTrainSchedule activityTrainSchedule) {
            b2.a(activityTrainSchedule);
        }

        static /* synthetic */ void a(b b2, String string, ProgressDialog progressDialog) {
            b2.a(string, progressDialog);
        }

        private void a(ActivityTrainSchedule activityTrainSchedule) {
            this.w = new ProgressDialog((Context)activityTrainSchedule);
            this.w.setCanceledOnTouchOutside(false);
            this.w.setOnCancelListener(new DialogInterface.OnCancelListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    dialogInterface.dismiss();
                    b.d(this.a).setChecked(false);
                }
            });
            this.w.setMessage((CharSequence)activityTrainSchedule.getString(2131755247));
            this.w.show();
            this.a = false;
            this.f.setVisibility(8);
            this.m.setVisibility(8);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this, activityTrainSchedule){
                final /* synthetic */ ActivityTrainSchedule a;
                final /* synthetic */ b b;
                {
                    this.b = b2;
                    this.a = activityTrainSchedule;
                }

                public void run() {
                    b.b(this.b).a((Activity)this.a);
                }
            }, 1800L);
        }

        /*
         * Exception decompiling
         */
        private void a(String var1, ProgressDialog var2) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl572 : RETURN : trying to set 0 previously set to 1
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        public static boolean a(Context context) {
            return !Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"mock_location").equals((Object)"0");
        }

        static /* synthetic */ boolean a(b b2) {
            return b2.v;
        }

        static /* synthetic */ boolean a(b b2, boolean bl) {
            b2.v = bl;
            return bl;
        }

        static /* synthetic */ int b(b b2, int n2) {
            b2.s = n2;
            return n2;
        }

        private static b b() {
            return new b();
        }

        @SuppressLint(value={"StaticFieldLeak"})
        private void b(String string, ProgressDialog progressDialog) {
            IRParserProvider.getIRParser().getRunningStatusViaWeb((Activity)this.getActivity(), string, new CommonCallbacks(this, progressDialog){
                final /* synthetic */ ProgressDialog a;
                final /* synthetic */ b b;
                {
                    this.b = b2;
                    this.a = progressDialog;
                }

                public void onError(String string) {
                }

                public void onSuccess(String string) {
                    this.b.getActivity().runOnUiThread(new Runnable(this, string){
                        final /* synthetic */ String a;
                        final /* synthetic */ 3 b;
                        {
                            this.b = var1_1;
                            this.a = string;
                        }

                        public void run() {
                            if (this.b.b.isAdded()) {
                                b.a(this.b.b, this.a, this.b.a);
                            }
                            if (b.m(this.b.b) == null) {
                                b.o(this.b.b).setVisibility(8);
                            }
                        }
                    });
                }
            }, this.c);
        }

        static /* synthetic */ int c(b b2, int n2) {
            b2.t = n2;
            return n2;
        }

        private void c() {
            this.x = new com.mobond.mindicator.a.a(){

                @Override
                public void a(Location location) {
                    super.a(location);
                    if (b.this.y == null) {
                        b b2 = b.this;
                        b2.y = b2.e();
                    }
                    try {
                        String[] arrstring = new String[2];
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(location.getLongitude());
                        stringBuilder.append("");
                        arrstring[0] = stringBuilder.toString();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(location.getLatitude());
                        stringBuilder2.append("");
                        arrstring[1] = stringBuilder2.toString();
                        b.this.b = com.mobond.mindicator.ui.indianrail.a.a.a((Context)b.this.d, (List<g>)b.this.y, b.a((Context)b.this.d), location, b.this.b);
                        if (b.this.b != null) {
                            if (!b.this.a) {
                                b.this.a = true;
                                if (!b.this.b.b()) {
                                    n.a((Context)b.this.d, (View)b.this.e, b.this.d.getString(2131755273));
                                }
                                b.this.a(b.this.b, b.e((b)b.this).d, arrstring, true);
                                return;
                            }
                            b.this.a(b.this.b, b.e((b)b.this).d, arrstring, false);
                            return;
                        }
                        if (b.this.w != null && b.this.w.isShowing()) {
                            b.this.w.dismiss();
                        }
                        n.d((Context)b.this.d, b.this.d.getString(2131755238));
                        b.this.o.setChecked(false);
                        return;
                    }
                    catch (Exception exception) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("exception: ");
                        stringBuilder.append(exception.getMessage());
                        Log.d((String)"run_near11", (String)stringBuilder.toString(), (Throwable)exception);
                        return;
                    }
                }
            };
            this.x.a(100);
        }

        private void d() {
            this.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                    int n2 = (Integer)b.g(this.a).getTag();
                    if (bl) {
                        b.b(this.a, n2);
                        b.c(this.a, 0);
                        b.a(this.a, n2);
                    }
                }
            });
            this.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                    int n2 = (Integer)b.h(this.a).getTag();
                    if (bl) {
                        b.b(this.a, n2);
                        b.c(this.a, 1);
                        b.a(this.a, n2);
                    }
                }
            });
            this.i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                final /* synthetic */ b a;
                {
                    this.a = b2;
                }

                public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                    int n2 = (Integer)b.i(this.a).getTag();
                    if (bl) {
                        b.b(this.a, n2);
                        b.c(this.a, 2);
                        b.a(this.a, n2);
                    }
                }
            });
            this.u = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private Vector<g> e() {
            Vector<g> vector = null;
            try {
                com.mobond.mindicator.ui.indianrail.util.c c2 = new com.mobond.mindicator.ui.indianrail.util.c((Context)this.d);
                int n2 = c2.a(this.d.c);
                vector = null;
                if (n2 != 0) {
                    return c2.b(this.d.c);
                }
                vector = this.d.e.a();
                for (g g2 : vector) {
                    g2.i = com.mobond.mindicator.ui.indianrail.a.a.d(g2.a);
                }
                return vector;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return vector;
        }

        static /* synthetic */ RadioGroup f(b b2) {
            return b2.f;
        }

        private void f() {
            this.d.a();
        }

        static /* synthetic */ AppCompatRadioButton g(b b2) {
            return b2.g;
        }

        static /* synthetic */ AppCompatRadioButton h(b b2) {
            return b2.h;
        }

        static /* synthetic */ AppCompatRadioButton i(b b2) {
            return b2.i;
        }

        static /* synthetic */ int j(b b2) {
            return b2.s;
        }

        static /* synthetic */ void k(b b2) {
            b2.f();
        }

        static /* synthetic */ RelativeLayout o(b b2) {
            return b2.n;
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.d = (ActivityTrainSchedule)this.getActivity();
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View view = layoutInflater.inflate(2131493042, viewGroup, false);
            this.a(view);
            ActivityTrainSchedule activityTrainSchedule = this.d;
            this.a((Activity)activityTrainSchedule, activityTrainSchedule.c);
            if (this.d.e != null) {
                this.y = this.e();
            }
            this.c();
            return view;
        }

        public void onDetach() {
            super.onDetach();
        }

        public void onPause() {
            this.x.a();
            super.onPause();
        }

        public void onResume() {
            if (this.v) {
                this.x.a((Activity)this.d);
            }
            super.onResume();
        }

    }

    public static class c
    extends androidx.fragment.app.d {
        private ActivityTrainSchedule a;
        private ListView b;
        private Vector<g> c;
        private String d;
        private Button e;
        private View f;
        private String g;
        private RelativeLayout h;
        private TextView i;

        static /* synthetic */ String a(c c2) {
            return c2.d;
        }

        private String a(ActivityTrainSchedule activityTrainSchedule, int n2, int n3) {
            int n4 = e.a();
            if (n2 > 0 && n3 > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(activityTrainSchedule.e.h);
                stringBuilder.append("");
                String string = e.c(stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(activityTrainSchedule.e.i);
                stringBuilder2.append("");
                String string2 = e.c(stringBuilder2.toString());
                if (n2 == n3) {
                    return activityTrainSchedule.getString(2131755530, new Object[]{string});
                }
                if (n2 < n4) {
                    return activityTrainSchedule.getString(2131755531, new Object[]{string2});
                }
                return activityTrainSchedule.getString(2131755529, new Object[]{string, string2});
            }
            if (n2 == 0 && n3 > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(activityTrainSchedule.e.i);
                stringBuilder.append("");
                return activityTrainSchedule.getString(2131755531, new Object[]{e.c(stringBuilder.toString())});
            }
            if (n2 > 0 && n3 == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(activityTrainSchedule.e.h);
                stringBuilder.append("");
                return activityTrainSchedule.getString(2131755532, new Object[]{e.c(stringBuilder.toString())});
            }
            return null;
        }

        static /* synthetic */ void a(c c2, String string) {
            c2.a(string);
        }

        static /* synthetic */ void a(c c2, JSONArray jSONArray, boolean bl) {
            c2.a(jSONArray, bl);
        }

        static /* synthetic */ void a(c c2, boolean bl) {
            c2.a(bl);
        }

        @SuppressLint(value={"StaticFieldLeak"})
        private void a(String string) {
            ActivityTrainSchedule.b("GETTING ROUTE FROM SERVER GOV");
            new AsyncTask<Void, Integer, String>(this, string){
                final /* synthetic */ String a;
                final /* synthetic */ c b;
                {
                    this.b = c2;
                    this.a = string;
                }

                protected /* varargs */ String a(Void ... arrvoid) {
                    try {
                        String string = IRParserProvider.getIRParser().getTrainTimeTable(this.a);
                        return string;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        return null;
                    }
                }

                public void a(String string) {
                    if (this.b.isAdded()) {
                        if (string != null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("route_response: ");
                            stringBuilder.append(string);
                            ActivityTrainSchedule.a(stringBuilder.toString());
                            try {
                                c.a(this.b, new JSONArray(string), false);
                                c.a(this.b, false);
                                return;
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                return;
                            }
                        }
                        c.a(this.b, true);
                    }
                }

                protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                    return this.a((Void[])arrobject);
                }

                public /* synthetic */ void onPostExecute(Object object) {
                    this.a((String)object);
                }

                public void onPreExecute() {
                    c.b(this.b);
                }
            }.execute((Object[])new Void[0]);
        }

        private void a(JSONArray jSONArray, boolean bl) {
            int n2 = jSONArray.length();
            String string = jSONArray.getJSONObject(n2 - 1).getString("arrival");
            Vector<g> vector = this.c;
            boolean bl2 = true;
            if (vector != null) {
                int n3 = vector.size();
                if (((g)this.c.get((int)(n3 - 1))).b.equals((Object)string) && n2 == n3) {
                    bl2 = false;
                }
            }
            if (bl2) {
                new com.mobond.mindicator.ui.indianrail.util.c((Context)this.a).a(this.a.c, jSONArray, bl);
                this.d();
            }
        }

        private void a(boolean bl) {
            if (bl) {
                if (this.c == null) {
                    this.f.setVisibility(8);
                    this.e.setVisibility(0);
                    return;
                }
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
            }
        }

        private static c b() {
            return new c();
        }

        static /* synthetic */ void b(c c2) {
            c2.e();
        }

        private void c() {
            try {
                com.mobond.mindicator.ui.indianrail.util.c c2 = new com.mobond.mindicator.ui.indianrail.util.c((Context)this.a);
                int n2 = com.mobond.mindicator.ui.indianrail.a.a.d((Context)this.a);
                if (c2.a(this.d) > n2) {
                    if (this.c != null) {
                        this.c.clear();
                        this.c = null;
                    }
                    this.c = c2.b(this.d);
                    return;
                }
                this.c = this.a.e.a();
                for (g g2 : this.c) {
                    g2.i = com.mobond.mindicator.ui.indianrail.a.a.d(g2.a);
                }
            }
            catch (Exception exception) {
                ActivityTrainSchedule.b(exception.getMessage());
            }
        }

        private void d() {
            this.c();
            if (this.c != null) {
                int n2;
                if (this.g != null) {
                    for (n2 = 0; n2 < this.c.size(); ++n2) {
                        if (!((g)this.c.get((int)n2)).i.equals((Object)this.g)) {
                            continue;
                        }
                        break;
                    }
                } else {
                    n2 = 0;
                }
                this.b.setAdapter((ListAdapter)new com.mobond.mindicator.ui.indianrail.trainschedule.d(this.c, this.a, n2));
                this.b.setSelection(n2 - 1);
            }
        }

        private void e() {
            if (this.c == null) {
                this.f.setVisibility(0);
                this.e.setVisibility(8);
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.a = (ActivityTrainSchedule)this.getActivity();
            this.d = this.a.c;
            this.g = this.a.i;
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View view = layoutInflater.inflate(2131493053, viewGroup, false);
            this.b = (ListView)view.findViewById(2131296936);
            this.h = (RelativeLayout)view.findViewById(2131297547);
            this.i = (TextView)view.findViewById(2131297548);
            this.e = (Button)view.findViewById(2131297230);
            this.f = view.findViewById(2131297129);
            this.e.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ c a;
                {
                    this.a = c2;
                }

                public void onClick(View view) {
                    c c2 = this.a;
                    c.a(c2, c.a(c2));
                }
            });
            this.d();
            this.e();
            if (this.a.e != null) {
                block5 : {
                    String string;
                    try {
                        this.h.setVisibility(0);
                        string = this.a(this.a, this.a.e.h, this.a.e.i);
                        if (string == null) break block5;
                    }
                    catch (Exception exception) {
                        this.h.setVisibility(8);
                        ActivityTrainSchedule.b(exception.getMessage());
                        return view;
                    }
                    this.i.setText((CharSequence)string);
                    return view;
                }
                this.h.setVisibility(8);
                return view;
            }
            this.h.setVisibility(8);
            return view;
        }
    }

    private class d
    extends androidx.fragment.app.n {
        private b b;
        private c c;

        private d(j j2) {
            super(j2);
        }

        static /* synthetic */ c b(d d2) {
            return d2.c;
        }

        public androidx.fragment.app.d a(int n2) {
            switch (n2) {
                default: {
                    return a.b();
                }
                case 2: {
                    return a.b();
                }
                case 1: {
                    if (this.b == null) {
                        this.b = b.b();
                    }
                    return this.b;
                }
                case 0: 
            }
            if (this.c == null) {
                this.c = c.b();
            }
            return this.c;
        }

        public int b() {
            return ActivityTrainSchedule.this.a.length;
        }

        public CharSequence c(int n2) {
            return ActivityTrainSchedule.this.a[n2];
        }
    }

}

