/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.res.Resources
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.text.Html
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.widget.Toolbar
 *  androidx.appcompat.widget.Toolbar$c
 *  androidx.h.a.a
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrStatus;
import com.mobond.mindicator.ui.indianrail.pnrstatus.b;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.pnrstatus.e;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityPnrStatus
extends com.mobond.mindicator.ui.indianrail.util.a {
    private ViewGroup a;
    private String b;
    private c c;
    private BroadcastReceiver d;
    private String e;
    private String f = "";
    private String g = "";
    private ActivityPnrStatus h;
    private View i;
    private String j;

    static /* synthetic */ String a(ActivityPnrStatus activityPnrStatus) {
        return activityPnrStatus.b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private String a(String var1_1) {
        block23 : {
            block14 : {
                block15 : {
                    block16 : {
                        block17 : {
                            block18 : {
                                block19 : {
                                    block20 : {
                                        block21 : {
                                            block22 : {
                                                var2_2 = var1_1.hashCode();
                                                if (var2_2 == 1584) break block14;
                                                if (var2_2 == 1615) break block15;
                                                if (var2_2 == 1633) break block16;
                                                if (var2_2 == 1646) break block17;
                                                if (var2_2 == 1650) break block18;
                                                if (var2_2 == 2144) break block19;
                                                if (var2_2 == 2204) break block20;
                                                if (var2_2 == 2206) break block21;
                                                if (var2_2 == 2237) break block22;
                                                if (var2_2 != 2649 || !var1_1.equals((Object)"SL")) ** GOTO lbl-1000
                                                var3_3 = 6;
                                                break block23;
                                            }
                                            if (!var1_1.equals((Object)"FC")) ** GOTO lbl-1000
                                            var3_3 = 5;
                                            break block23;
                                        }
                                        if (!var1_1.equals((Object)"EC")) ** GOTO lbl-1000
                                        var3_3 = 8;
                                        break block23;
                                    }
                                    if (!var1_1.equals((Object)"EA")) ** GOTO lbl-1000
                                    var3_3 = 9;
                                    break block23;
                                }
                                if (!var1_1.equals((Object)"CC")) ** GOTO lbl-1000
                                var3_3 = 4;
                                break block23;
                            }
                            if (!var1_1.equals((Object)"3E")) ** GOTO lbl-1000
                            var3_3 = 3;
                            break block23;
                        }
                        if (!var1_1.equals((Object)"3A")) ** GOTO lbl-1000
                        var3_3 = 2;
                        break block23;
                    }
                    if (!var1_1.equals((Object)"2S")) ** GOTO lbl-1000
                    var3_3 = 7;
                    break block23;
                }
                if (!var1_1.equals((Object)"2A")) ** GOTO lbl-1000
                var3_3 = 1;
                break block23;
            }
            if (var1_1.equals((Object)"1A")) {
                var3_3 = 0;
            } else lbl-1000: // 10 sources:
            {
                var3_3 = -1;
            }
        }
        switch (var3_3) {
            default: {
                return "";
            }
            case 9: {
                return " - ANUBHUTI CLASS";
            }
            case 8: {
                return " - EXECUTIVE CLASS";
            }
            case 7: {
                return " - SECOND SEATING";
            }
            case 6: {
                return " - SLEEPER CLASS";
            }
            case 5: {
                return " - FIRST CLASS";
            }
            case 4: {
                return " - AC CHAIR CAR";
            }
            case 3: {
                return " - 3 AC Economy";
            }
            case 2: {
                return " - THIRD AC";
            }
            case 1: {
                return " - SECOND AC";
            }
            case 0: 
        }
        return " - FIRST AC";
    }

    private void a() {
        if (this.getIntent() != null && this.getIntent().hasExtra("id")) {
            Intent intent = new Intent("alarmIF");
            intent.putExtra("id", this.getIntent().getIntExtra("id", -1));
            this.sendBroadcast(intent);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(Intent intent) {
        int n2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        this.a.removeAllViews();
        try {
            this.e = intent.getStringExtra("json");
            jSONObject = new JSONObject(this.e);
            jSONArray = jSONObject.getJSONArray("passengers");
            n2 = 0;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        do {
            if (n2 < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(n2);
                if (n2 == jSONArray.length() - 1) {
                    this.a(jSONObject2.getString("old_status"), jSONObject2.getString("current_status"), jSONObject2.optString("coach_position"), n2 + 1, true);
                } else {
                    this.a(jSONObject2.getString("old_status"), jSONObject2.getString("current_status"), jSONObject2.optString("coach_position"), n2 + 1, false);
                }
            } else {
                this.f = jSONObject.getString("train_number");
                f f2 = a.a(this.f, (Context)this.h);
                this.g = f2 != null ? f2.e : jSONObject.getString("train_name");
                this.j = jSONObject.getString("from").replaceAll("\\s+", "");
                String string = jSONObject.getString("to").replaceAll("\\s+", "");
                ((TextView)this.findViewById(2131297118)).setText((CharSequence)this.b);
                TextView textView = (TextView)this.findViewById(2131297553);
                Object[] arrobject = new Object[]{this.f, this.g};
                textView.setText((CharSequence)String.format((String)"%s - %s", (Object[])arrobject));
                ((TextView)this.findViewById(2131296399)).setText((CharSequence)ActivityCancelledRescheduledTrains.a(jSONObject.getString("date")));
                String string2 = jSONObject.getString("class").trim();
                ((TextView)this.findViewById(2131296553)).setText((CharSequence)string2.concat(this.a(string2)));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM, h:mm a", Locale.US);
                TextView textView2 = (TextView)this.findViewById(2131296597);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<b>");
                stringBuilder.append(this.getResources().getString(2131755298));
                stringBuilder.append("</b><br><small><font color=#bdbdbd>");
                stringBuilder.append(ActivityCancelledRescheduledTrains.a(simpleDateFormat.format(new Date(Long.parseLong((String)intent.getStringExtra("s_date"))))));
                stringBuilder.append("</small></font>");
                textView2.setText((CharSequence)Html.fromHtml((String)stringBuilder.toString()));
                a.b((Context)this.h);
                ((TextView)this.findViewById(2131296806)).setText((CharSequence)a.f(this.j));
                ((TextView)this.findViewById(2131297520)).setText((CharSequence)a.f(string));
                TextView textView3 = (TextView)this.findViewById(2131296507);
                if (jSONObject.getBoolean("chart_prepared")) {
                    textView3.setText(2131755092);
                    textView3.setBackgroundColor(-1509911);
                    textView3.setTextColor(-13070788);
                    return;
                }
                textView3.setText(2131755091);
                textView3.setBackgroundColor(15267305);
                textView3.setTextColor(-14606047);
                return;
            }
            ++n2;
        } while (true);
    }

    static /* synthetic */ void a(ActivityPnrStatus activityPnrStatus, String string, boolean bl) {
        activityPnrStatus.a(string, bl);
    }

    private void a(String string, String string2, String string3, int n2, boolean bl) {
        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.h).inflate(2131493039, this.a, false);
        ((TextView)viewGroup.findViewById(2131297408)).setText((CharSequence)String.valueOf((int)n2));
        TextView textView = (TextView)viewGroup.findViewById(2131297060);
        textView.setTag((Object)2);
        String[] arrstring = IRParserProvider.getIRParser().getCurrentStatusAndComment(string, string2, string3);
        ((TextView)viewGroup.findViewById(2131296596)).setText((CharSequence)Html.fromHtml((String)arrstring[0]));
        if (arrstring[1] != null) {
            Button button = (Button)viewGroup.findViewById(2131296566);
            button.setVisibility(0);
            Object[] arrobject = new Object[]{arrstring[1]};
            button.setText((CharSequence)String.format((String)"%s", (Object[])arrobject));
            button.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ ActivityPnrStatus a;
                {
                    this.a = activityPnrStatus;
                }

                public void onClick(View view) {
                    Intent intent = new Intent(this.a.getApplicationContext(), com.mobond.mindicator.ui.indianrail.trainschedule.ActivityTrainSchedule.class);
                    intent.putExtra("num", IRParserProvider.getIRParser().replaceAllKeepNumbersTrain(ActivityPnrStatus.e(ActivityPnrStatus.b(this.a))));
                    intent.putExtra("name", ActivityPnrStatus.f(this.a));
                    intent.putExtra("boardingStnCode", ActivityPnrStatus.g(this.a));
                    intent.putExtra("coach_pos", ((Button)view).getText().toString());
                    this.a.startActivity(intent);
                }
            });
        }
        ((TextView)viewGroup.findViewById(2131296572)).setText((CharSequence)Html.fromHtml((String)arrstring[2]));
        textView.setText((CharSequence)String.format((String)"Old: %s", (Object[])new Object[]{string}));
        if (bl) {
            viewGroup.setBackgroundResource(2131230866);
        } else {
            viewGroup.setBackgroundColor(-1);
        }
        viewGroup.setOnClickListener(new View.OnClickListener(this, textView){
            final /* synthetic */ TextView a;
            final /* synthetic */ ActivityPnrStatus b;
            {
                this.b = activityPnrStatus;
                this.a = textView;
            }

            public void onClick(View view) {
                android.view.animation.Animation animation;
                if ((java.lang.Integer)this.a.getTag() == 2) {
                    this.a.measure(-2, -2);
                    int n2 = this.a.getMeasuredHeight();
                    this.a.getLayoutParams().height = 1;
                    this.a.setVisibility(0);
                    this.a.setTag((Object)0);
                    animation = new android.view.animation.Animation(this, n2){
                        final /* synthetic */ int a;
                        final /* synthetic */ 5 b;
                        {
                            this.b = var1_1;
                            this.a = n2;
                        }

                        protected void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                            if (f2 == 1.0f) {
                                this.b.a.getLayoutParams().height = -2;
                                this.b.a.setTag((Object)1);
                            } else {
                                this.b.a.getLayoutParams().height = (int)(f2 * (float)this.a);
                            }
                            this.b.a.requestLayout();
                        }

                        public boolean willChangeBounds() {
                            return true;
                        }
                    };
                } else if ((java.lang.Integer)this.a.getTag() == 1) {
                    this.a.setTag((Object)0);
                    animation = new android.view.animation.Animation(this, this.a.getMeasuredHeight()){
                        final /* synthetic */ int a;
                        final /* synthetic */ 5 b;
                        {
                            this.b = var1_1;
                            this.a = n2;
                        }

                        protected void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                            if (f2 == 1.0f) {
                                this.b.a.setVisibility(8);
                                this.b.a.setTag((Object)2);
                                return;
                            }
                            android.view.ViewGroup$LayoutParams layoutParams = this.b.a.getLayoutParams();
                            int n2 = this.a;
                            layoutParams.height = n2 - (int)(f2 * (float)n2);
                            this.b.a.requestLayout();
                        }

                        public boolean willChangeBounds() {
                            return true;
                        }
                    };
                } else {
                    animation = null;
                }
                if (animation != null) {
                    animation.setDuration(300L);
                    this.a.startAnimation(animation);
                }
            }
        });
        this.a.addView((View)viewGroup);
    }

    private void a(String string, boolean bl) {
        this.findViewById(2131297182).setVisibility(0);
        if (string.equals((Object)b.a)) {
            if (bl && !b.b) {
                TextView textView = (TextView)this.findViewById(2131296432);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<small>");
                stringBuilder.append(this.getResources().getString(2131755329));
                stringBuilder.append("</small>");
                textView.setText((CharSequence)Html.fromHtml((String)stringBuilder.toString()));
                this.c.a(this.b, "Loading Failed");
                return;
            }
            TextView textView = (TextView)this.findViewById(2131296432);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<small>");
            stringBuilder.append(this.getResources().getString(2131755277));
            stringBuilder.append("</small>");
            textView.setText((CharSequence)Html.fromHtml((String)stringBuilder.toString()));
            this.findViewById(2131297182).setVisibility(8);
            return;
        }
        if (!string.equals((Object)"Loading Failed") && !string.isEmpty()) {
            ((TextView)this.findViewById(2131296432)).setText((CharSequence)string);
            return;
        }
        TextView textView = (TextView)this.findViewById(2131296432);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<small>");
        stringBuilder.append(this.getResources().getString(2131755329));
        stringBuilder.append("</small>");
        textView.setText((CharSequence)Html.fromHtml((String)stringBuilder.toString()));
    }

    static /* synthetic */ ActivityPnrStatus b(ActivityPnrStatus activityPnrStatus) {
        return activityPnrStatus.h;
    }

    static /* synthetic */ ViewGroup c(ActivityPnrStatus activityPnrStatus) {
        return activityPnrStatus.a;
    }

    static /* synthetic */ c d(ActivityPnrStatus activityPnrStatus) {
        return activityPnrStatus.c;
    }

    static /* synthetic */ String e(ActivityPnrStatus activityPnrStatus) {
        return activityPnrStatus.f;
    }

    static /* synthetic */ String f(ActivityPnrStatus activityPnrStatus) {
        return activityPnrStatus.g;
    }

    static /* synthetic */ String g(ActivityPnrStatus activityPnrStatus) {
        return activityPnrStatus.j;
    }

    public void getDepartureTime(View view) {
        if (!this.c.h(this.b).equals((Object)b.a)) {
            try {
                JSONObject jSONObject = new JSONObject(this.e);
                b b2 = new b(this.b, jSONObject.getString("train_number"), jSONObject.getString("date"), jSONObject.getString("from").trim(), jSONObject.getString("to").trim(), this.getApplicationContext());
                b2.execute((Object[])new Void[0]);
                return;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493040);
        this.i = com.mobond.mindicator.ui.c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/4464989249", "167101606757479_1239841552816807", "ca-app-pub-5449278086868932/2953135470", "167101606757479_1235753749892254", 3, null);
        this.h = this;
        this.c = new c(this.getApplicationContext());
        this.a = (ViewGroup)this.findViewById(2131296580);
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        toolbar.setTitle((CharSequence)"");
        this.setSupportActionBar(toolbar);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().a(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityPnrStatus a;
            {
                this.a = activityPnrStatus;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.c(this){
            final /* synthetic */ ActivityPnrStatus a;
            {
                this.a = activityPnrStatus;
            }

            public boolean a(MenuItem menuItem) {
                if (menuItem.getItemId() == 2131297181) {
                    ActivityPnrStatus activityPnrStatus = this.a;
                    e e2 = new e((Activity)activityPnrStatus, ActivityPnrStatus.a(activityPnrStatus), ActivityPnrStatus.b(this.a), this.a.getApplicationContext(), false);
                    e2.a();
                } else if (menuItem.getItemId() == 2131297368) {
                    com.mobond.mindicator.ui.indianrail.util.b.a((Activity)ActivityPnrStatus.b(this.a), (View)ActivityPnrStatus.c(this.a));
                }
                return false;
            }
        });
        Intent intent = this.getIntent();
        this.b = intent.getStringExtra("pnr");
        this.d = new BroadcastReceiver(this){
            final /* synthetic */ ActivityPnrStatus a;
            {
                this.a = activityPnrStatus;
            }

            public void onReceive(Context context, Intent intent) {
                ActivityPnrStatus activityPnrStatus = this.a;
                ActivityPnrStatus.a(activityPnrStatus, ActivityPnrStatus.d(activityPnrStatus).h(ActivityPnrStatus.a(this.a)), false);
            }
        };
        androidx.h.a.a.a((Context)this.getApplicationContext()).a(this.d, new IntentFilter("DEPARTURE_TIME_CHECK"));
        this.a(intent);
        if (intent.hasExtra("doReload")) {
            e e2 = new e((Activity)this, this.b, this.h, this.getApplicationContext(), false);
            e2.a();
        }
        this.a(this.c.h(this.b), true);
        this.a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131558405, menu);
        menu.findItem(2131297368).setVisible(true);
        return true;
    }

    protected void onDestroy() {
        com.mobond.mindicator.ui.c.c(this.i);
        if (this.d != null) {
            androidx.h.a.a.a((Context)this.getApplicationContext()).a(this.d);
            this.d = null;
        }
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        this.a(intent);
    }

    public void onPause() {
        super.onPause();
        com.mobond.mindicator.ui.c.b(this.i);
    }

    public void onResume() {
        super.onResume();
        com.mobond.mindicator.ui.c.a(this.i);
    }

    public void openTrainSchedule(View view) {
        com.mobond.mindicator.ui.indianrail.trainschedule.a.a(view.getContext(), this.g, IRParserProvider.getIRParser().replaceAllKeepNumbersTrain(this.h.f), this.j, "TRAIN");
    }
}

