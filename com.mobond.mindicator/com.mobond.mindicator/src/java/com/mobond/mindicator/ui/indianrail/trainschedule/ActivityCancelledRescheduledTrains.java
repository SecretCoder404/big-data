/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.text.InputFilter
 *  android.text.InputFilter$LengthFilter
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.WebView
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.concurrent.Executor
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.trainschedule;

import android.app.Activity;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.ui.indianrail.irplugin.CommonCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivityCancelledRescheduledTrains;
import com.mobond.mindicator.ui.indianrail.trainschedule.b;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityCancelledRescheduledTrains
extends com.mobond.mindicator.ui.indianrail.util.a {
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    private static final String[] f;
    WebView e;
    private String[] g;
    private String h = "LOADING";
    private EditText i;
    private ImageButton j;
    private Activity k;
    private ListView l;
    private View m;
    private Button n;
    private b p;

    static {
        f = new String[]{"CANCELLED/PARTIALLY CANCELLED/RESCHEDULED"};
    }

    static /* synthetic */ EditText a(ActivityCancelledRescheduledTrains activityCancelledRescheduledTrains) {
        return activityCancelledRescheduledTrains.i;
    }

    static /* synthetic */ String a(ActivityCancelledRescheduledTrains activityCancelledRescheduledTrains, String string) {
        activityCancelledRescheduledTrains.h = string;
        return string;
    }

    public static String a(String string) {
        return string.toLowerCase().replace((CharSequence)"jan", (CharSequence)ActivitySeatStatus.e[0]).toLowerCase().replace((CharSequence)"feb", (CharSequence)ActivitySeatStatus.e[1]).toLowerCase().replace((CharSequence)"mar", (CharSequence)ActivitySeatStatus.e[2]).toLowerCase().replace((CharSequence)"apr", (CharSequence)ActivitySeatStatus.e[3]).toLowerCase().replace((CharSequence)"may", (CharSequence)ActivitySeatStatus.e[4]).toLowerCase().replace((CharSequence)"jun", (CharSequence)ActivitySeatStatus.e[5]).toLowerCase().replace((CharSequence)"jul", (CharSequence)ActivitySeatStatus.e[6]).toLowerCase().replace((CharSequence)"aug", (CharSequence)ActivitySeatStatus.e[7]).toLowerCase().replace((CharSequence)"sep", (CharSequence)ActivitySeatStatus.e[8]).toLowerCase().replace((CharSequence)"oct", (CharSequence)ActivitySeatStatus.e[9]).toLowerCase().replace((CharSequence)"nov", (CharSequence)ActivitySeatStatus.e[10]).toLowerCase().replace((CharSequence)"dec", (CharSequence)ActivitySeatStatus.e[11]).toUpperCase();
    }

    private void a() {
        this.b(this.h);
    }

    private void a(Activity activity, ListView listView, JSONArray jSONArray) {
        try {
            this.p = new b(activity, listView, jSONArray);
            listView.setAdapter((ListAdapter)this.p);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    static /* synthetic */ void a(ActivityCancelledRescheduledTrains activityCancelledRescheduledTrains, String string, boolean bl) {
        activityCancelledRescheduledTrains.a(string, bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(String var1_1, boolean var2_2) {
        block8 : {
            block7 : {
                var3_3 = new StringBuilder();
                var3_3.append("fromNtes : ");
                var3_3.append(var2_2);
                var3_3.append(" RESPONSE ");
                var3_3.append(var1_1);
                Log.e((String)"HANDLERESPONSE", (String)var3_3.toString());
                if (var1_1 == null) ** GOTO lbl19
                if (var1_1.isEmpty() && !var2_2) {
                    this.c();
                    return;
                }
                try {
                    block9 : {
                        var9_4 = new JSONObject(var1_1);
                        var10_5 = new JSONArray();
                        var12_6 = new JSONArray[]{var9_4.getJSONArray("allCancelledTrains"), var9_4.getJSONArray("allPartiallyCancelledTrains"), var9_4.getJSONArray("trains"), var9_4.getJSONArray("allDivertedTrains")};
                        var13_7 = new String[]{ActivityCancelledRescheduledTrains.a, ActivityCancelledRescheduledTrains.b, ActivityCancelledRescheduledTrains.c, ActivityCancelledRescheduledTrains.d};
                        this.g = var13_7;
                        var14_8 = 0;
                        break block9;
lbl19: // 1 sources:
                        this.h = "FAILED";
                        break block7;
                    }
lbl22: // 2 sources:
                    do {
                        if (var14_8 < var12_6.length) {
                            var15_9 = var12_6[var14_8];
                            var16_10 = var15_9.length();
                            var17_11 = this.g[var14_8];
                            break block8;
                        }
                        this.a(this.k, this.l, var10_5);
                        this.h = "SUCCESS";
                        break;
                    } while (true);
                }
                catch (JSONException var11_14) {
                    this.h = "FAILED";
                    var11_14.printStackTrace();
                }
            }
            this.a();
            return;
        }
        for (var18_12 = 0; var18_12 < var16_10; ++var18_12) {
            var19_13 = var15_9.getJSONObject(var18_12);
            var19_13.put("type", (Object)var17_11);
            var10_5.put((Object)var19_13);
        }
        ++var14_8;
        ** while (true)
    }

    static /* synthetic */ ImageButton b(ActivityCancelledRescheduledTrains activityCancelledRescheduledTrains) {
        return activityCancelledRescheduledTrains.j;
    }

    private void b() {
        new AsyncTask<Void, Integer, String>(this){
            final /* synthetic */ ActivityCancelledRescheduledTrains a;
            {
                this.a = activityCancelledRescheduledTrains;
            }

            protected /* varargs */ String a(Void ... arrvoid) {
                try {
                    String string = IRParserProvider.getIRParser().getCancelledRescheduledTrains(null, null, null);
                    return string;
                }
                catch (java.lang.Exception exception) {
                    exception.printStackTrace();
                    return null;
                }
            }

            public void a(String string) {
                ActivityCancelledRescheduledTrains.a(this.a, string, false);
            }

            protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                return this.a((Void[])arrobject);
            }

            public /* synthetic */ void onPostExecute(Object object) {
                this.a((String)object);
            }

            public void onPreExecute() {
                ActivityCancelledRescheduledTrains.a(this.a, "LOADING");
                ActivityCancelledRescheduledTrains.e(this.a);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    }

    private void b(String string) {
        if (this.m != null && this.n != null) {
            int n2 = -1;
            int n3 = string.hashCode();
            if (n3 != -1149187101) {
                if (n3 != 1054633244) {
                    if (n3 == 2066319421 && string.equals((Object)"FAILED")) {
                        n2 = 2;
                    }
                } else if (string.equals((Object)"LOADING")) {
                    n2 = 0;
                }
            } else if (string.equals((Object)"SUCCESS")) {
                n2 = 1;
            }
            switch (n2) {
                default: {
                    return;
                }
                case 2: {
                    this.m.setVisibility(8);
                    this.n.setVisibility(0);
                    return;
                }
                case 1: {
                    this.m.setVisibility(8);
                    this.n.setVisibility(8);
                    return;
                }
                case 0: 
            }
            this.m.setVisibility(0);
            this.n.setVisibility(8);
        }
    }

    static /* synthetic */ b c(ActivityCancelledRescheduledTrains activityCancelledRescheduledTrains) {
        return activityCancelledRescheduledTrains.p;
    }

    private void c() {
        this.h = "LOADING";
        this.a();
        IRParserProvider.getIRParser().getCancelledRescheduledTrainsNew((Activity)this, new CommonCallbacks(this){
            final /* synthetic */ ActivityCancelledRescheduledTrains a;
            {
                this.a = activityCancelledRescheduledTrains;
            }

            public void onError(String string) {
            }

            public void onSuccess(String string) {
                this.a.runOnUiThread(new java.lang.Runnable(this, string){
                    final /* synthetic */ String a;
                    final /* synthetic */ 6 b;
                    {
                        this.b = var1_1;
                        this.a = string;
                    }

                    public void run() {
                        ActivityCancelledRescheduledTrains.a(this.b.a, this.a, true);
                    }
                });
            }
        }, this.e);
    }

    static /* synthetic */ void d(ActivityCancelledRescheduledTrains activityCancelledRescheduledTrains) {
        activityCancelledRescheduledTrains.b();
    }

    static /* synthetic */ void e(ActivityCancelledRescheduledTrains activityCancelledRescheduledTrains) {
        activityCancelledRescheduledTrains.a();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493014);
        this.k = this;
        this.e = (WebView)this.findViewById(2131297676);
        this.findViewById(2131297526).setVisibility(0);
        Toolbar toolbar = (Toolbar)this.findViewById(2131297524);
        toolbar.setTitle((CharSequence)this.getResources().getString(2131755085));
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().a(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityCancelledRescheduledTrains a;
            {
                this.a = activityCancelledRescheduledTrains;
            }

            public void onClick(View view) {
                android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(ActivityCancelledRescheduledTrains.a(this.a).getWindowToken(), 0);
                }
                this.a.finish();
            }
        });
        this.i = (EditText)this.findViewById(2131296700);
        this.i.setHint((CharSequence)this.getResources().getString(2131755085));
        this.i.setInputType(96);
        InputFilter[] arrinputFilter = new InputFilter[]{new InputFilter.LengthFilter(10)};
        this.i.setFilters(arrinputFilter);
        this.i.addTextChangedListener(new TextWatcher(this){
            final /* synthetic */ ActivityCancelledRescheduledTrains a;
            {
                this.a = activityCancelledRescheduledTrains;
            }

            public void afterTextChanged(android.text.Editable editable) {
                if (editable.length() > 0) {
                    ActivityCancelledRescheduledTrains.b(this.a).setVisibility(0);
                } else {
                    ActivityCancelledRescheduledTrains.b(this.a).setVisibility(8);
                }
                if (ActivityCancelledRescheduledTrains.c(this.a) != null) {
                    ActivityCancelledRescheduledTrains.c(this.a).a(editable.toString());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }

            public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }
        });
        this.j = (ImageButton)this.findViewById(2131296556);
        this.j.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityCancelledRescheduledTrains a;
            {
                this.a = activityCancelledRescheduledTrains;
            }

            public void onClick(View view) {
                ActivityCancelledRescheduledTrains.a(this.a).setText((CharSequence)"");
                ActivityCancelledRescheduledTrains.a(this.a).requestFocus();
                android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((View)ActivityCancelledRescheduledTrains.a(this.a), 1);
                }
            }
        });
        this.l = (ListView)this.findViewById(2131296936);
        this.m = this.findViewById(2131297115);
        this.n = (Button)this.findViewById(2131297230);
        this.b("LOADING");
        this.n.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityCancelledRescheduledTrains a;
            {
                this.a = activityCancelledRescheduledTrains;
            }

            public void onClick(View view) {
                ActivityCancelledRescheduledTrains.d(this.a);
            }
        });
        this.b();
    }
}

