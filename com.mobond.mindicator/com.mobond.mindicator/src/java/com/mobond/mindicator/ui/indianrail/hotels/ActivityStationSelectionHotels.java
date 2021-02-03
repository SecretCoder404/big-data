/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.ListView
 *  android.widget.TextView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.app.a
 *  androidx.core.content.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.LinkedHashMap
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.hotels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.hotels.ActivityStationSelectionHotels;
import com.mobond.mindicator.ui.n;
import com.mulo.util.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityStationSelectionHotels
extends BaseAppCompatActivity {
    private EditText a;
    private ImageButton b;
    private ListView c;
    private ProgressDialog d;
    private com.mobond.mindicator.a.a e;
    private LinkedHashMap<String, a.a> f;
    private Activity g;
    private View h;

    static /* synthetic */ com.mobond.mindicator.a.a a(ActivityStationSelectionHotels activityStationSelectionHotels, com.mobond.mindicator.a.a a2) {
        activityStationSelectionHotels.e = a2;
        return a2;
    }

    static /* synthetic */ LinkedHashMap a(ActivityStationSelectionHotels activityStationSelectionHotels, LinkedHashMap linkedHashMap) {
        activityStationSelectionHotels.f = linkedHashMap;
        return linkedHashMap;
    }

    public static void a(Context context, String string, boolean bl) {
        Intent intent = new Intent(context, WebUI.class);
        com.mulo.util.g g2 = new com.mulo.util.g();
        e.a(g2.a(), g2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://mobondhrd.appspot.com/hotels/i.jsp?city=");
        stringBuilder.append(string);
        g2.a = stringBuilder.toString();
        intent.putExtra("webuidatakey", g2.a());
        intent.putExtra("webuititle", context.getString(2131755258));
        if (bl) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    static /* synthetic */ ProgressDialog b(ActivityStationSelectionHotels activityStationSelectionHotels) {
        return activityStationSelectionHotels.d;
    }

    static /* synthetic */ com.mobond.mindicator.a.a c(ActivityStationSelectionHotels activityStationSelectionHotels) {
        return activityStationSelectionHotels.e;
    }

    static /* synthetic */ ListView d(ActivityStationSelectionHotels activityStationSelectionHotels) {
        return activityStationSelectionHotels.c;
    }

    static /* synthetic */ EditText e(ActivityStationSelectionHotels activityStationSelectionHotels) {
        return activityStationSelectionHotels.a;
    }

    static /* synthetic */ ImageButton f(ActivityStationSelectionHotels activityStationSelectionHotels) {
        return activityStationSelectionHotels.b;
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        if (n2 == 199) {
            if (n3 == -1) {
                this.e.b(this.getApplicationContext());
                return;
            }
            if (n3 == 0) {
                n.d((Context)this, this.getString(2131755213));
                ProgressDialog progressDialog = this.d;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493049);
        this.g = this;
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        this.setSupportActionBar(toolbar);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().a(true);
        }
        this.findViewById(2131297240).setBackgroundColor(androidx.core.content.a.c((Context)this.getApplicationContext(), (int)2131099748));
        this.h = this.findViewById(2131297016);
        this.h.setVisibility(0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, (Drawable)new ColorDrawable(-13858752));
        stateListDrawable.addState(new int[0], (Drawable)new ColorDrawable(-13129136));
        this.h.setBackgroundDrawable((Drawable)stateListDrawable);
        this.h.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityStationSelectionHotels a;
            {
                this.a = activityStationSelectionHotels;
            }

            public void onClick(View view) {
                if (com.mobond.mindicator.h.a((Context)ActivityStationSelectionHotels.a(this.a), "android.permission.ACCESS_FINE_LOCATION")) {
                    ActivityStationSelectionHotels.b(this.a).show();
                    if (ActivityStationSelectionHotels.c(this.a) == null) {
                        ActivityStationSelectionHotels.a(this.a, new com.mobond.mindicator.a.a(this){
                            final /* synthetic */ 1 a;
                            {
                                this.a = var1_1;
                            }

                            public void a(android.location.Location location) {
                                super.a(location);
                                ActivityStationSelectionHotels.c(this.a.a).a();
                                ActivityStationSelectionHotels.b(this.a.a).dismiss();
                                Activity activity = ActivityStationSelectionHotels.a(this.a.a);
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("&latitude=");
                                stringBuilder.append(ActivityStationSelectionHotels.c((ActivityStationSelectionHotels)this.a.a).f);
                                stringBuilder.append("&longitude=");
                                stringBuilder.append(ActivityStationSelectionHotels.c((ActivityStationSelectionHotels)this.a.a).g);
                                ActivityStationSelectionHotels.a((Context)activity, stringBuilder.toString(), false);
                            }
                        });
                        ActivityStationSelectionHotels.c(this.a).a(100);
                        ActivityStationSelectionHotels.c(this.a).a(ActivityStationSelectionHotels.a(this.a));
                        return;
                    }
                    ActivityStationSelectionHotels.c(this.a).a(ActivityStationSelectionHotels.a(this.a));
                    return;
                }
                com.mobond.mindicator.h.a(ActivityStationSelectionHotels.a(this.a), "LOCATION", new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 106);
            }
        });
        this.c = (ListView)this.findViewById(2131296936);
        this.a = (EditText)this.findViewById(2131296700);
        this.a.setHint((CharSequence)this.getResources().getString(2131755510));
        this.a.setInputType(96);
        this.b = (ImageButton)this.findViewById(2131296556);
        this.d = new ProgressDialog((Context)this);
        this.d.setCancelable(false);
        this.d.setTitle((CharSequence)this.getString(2131755276));
        this.d.setMessage((CharSequence)this.getString(2131755446));
        this.d.show();
        new Thread(new Runnable(this, toolbar){
            final /* synthetic */ Toolbar a;
            final /* synthetic */ ActivityStationSelectionHotels b;
            {
                this.b = activityStationSelectionHotels;
                this.a = toolbar;
            }

            public void run() {
                try {
                    ActivityStationSelectionHotels.a(this.b, com.mobond.mindicator.ui.indianrail.a.a.e((Context)ActivityStationSelectionHotels.a(this.b)));
                    this.b.runOnUiThread(new Runnable(this){
                        final /* synthetic */ 2 a;
                        {
                            this.a = var1_1;
                        }

                        public void run() {
                            BaseAdapter baseAdapter = new BaseAdapter(ActivityStationSelectionHotels.a(this.a.b)){
                                private ArrayList<a.a> b = new ArrayList();
                                private ArrayList<a.a> c;
                                private ArrayList<a.a> d;
                                private LayoutInflater e;
                                private a.a f = new a.a("", "", "", null);
                                {
                                    for (String string : ActivityStationSelectionHotels.this.f.keySet()) {
                                        this.b.add(ActivityStationSelectionHotels.this.f.get((Object)string));
                                    }
                                    this.c = new ArrayList();
                                    this.d = this.c();
                                    this.b();
                                    this.e = (LayoutInflater)activity.getSystemService("layout_inflater");
                                }

                                private ArrayList<a.a> a() {
                                    return this.c;
                                }

                                static /* synthetic */ ArrayList a(a a2) {
                                    return a2.a();
                                }

                                static /* synthetic */ void a(a a2, String string) {
                                    a2.a(string);
                                }

                                static /* synthetic */ void a(a a2, String string, String string2, String string3) {
                                    a2.a(string, string2, string3);
                                }

                                private void a(String string) {
                                    this.c.clear();
                                    if (string.length() == 0) {
                                        this.b();
                                    } else {
                                        String string2 = string.toLowerCase();
                                        this.c.add((Object)this.f);
                                        for (a.a a2 : this.b) {
                                            if (!a2.e.contains((CharSequence)string2)) continue;
                                            this.c.add((Object)a2);
                                        }
                                    }
                                    this.notifyDataSetChanged();
                                }

                                private void a(String string, String string2, String string3) {
                                    int n2 = 0;
                                    do {
                                        block7 : {
                                            try {
                                                if (n2 < this.d.size()) {
                                                    if (((a.a)this.d.get((int)n2)).a.equals((Object)string)) {
                                                        return;
                                                    }
                                                    break block7;
                                                }
                                                a.a a2 = new a.a(string, string2, string3, null);
                                                a2.f = true;
                                                this.d.add(0, (Object)a2);
                                                if (this.d.size() > 5) {
                                                    this.d.remove(5);
                                                }
                                                b b2 = com.mobond.mindicator.a.a(ActivityStationSelectionHotels.this.g);
                                                JSONArray jSONArray = new JSONArray();
                                                for (a.a a3 : this.d) {
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put("name", (Object)a3.a);
                                                    jSONObject.put("lat", (Object)a3.c);
                                                    jSONObject.put("lon", (Object)a3.d);
                                                    jSONArray.put((Object)jSONObject);
                                                }
                                                b2.b("station_history", jSONArray.toString());
                                                return;
                                            }
                                            catch (JSONException jSONException) {
                                                jSONException.printStackTrace();
                                                return;
                                            }
                                        }
                                        ++n2;
                                    } while (true);
                                }

                                private void b() {
                                    this.c.addAll(this.b);
                                    this.c.addAll(0, this.d);
                                    this.c.add(0, (Object)this.f);
                                }

                                /*
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                private ArrayList<a.a> c() {
                                    int n2;
                                    JSONArray jSONArray;
                                    ArrayList arrayList = new ArrayList();
                                    String string = com.mobond.mindicator.a.a(ActivityStationSelectionHotels.this.g).a("station_history", null);
                                    if (string == null) return arrayList;
                                    try {
                                        jSONArray = new JSONArray(string);
                                        n2 = 0;
                                    }
                                    catch (JSONException jSONException) {
                                        jSONException.printStackTrace();
                                    }
                                    do {
                                        if (n2 >= jSONArray.length()) return arrayList;
                                        JSONObject jSONObject = jSONArray.getJSONObject(n2);
                                        a.a a2 = new a.a(jSONObject.getString("name"), jSONObject.getString("lat"), jSONObject.getString("lon"), null);
                                        a2.f = true;
                                        arrayList.add((Object)a2);
                                        ++n2;
                                    } while (true);
                                    return arrayList;
                                }

                                public int getCount() {
                                    return this.c.size();
                                }

                                public Object getItem(int n2) {
                                    return n2;
                                }

                                public long getItemId(int n2) {
                                    return n2;
                                }

                                public View getView(int n2, View view, ViewGroup viewGroup) {
                                    a a2;
                                    if (view == null) {
                                        view = this.e.inflate(2131493050, viewGroup, false);
                                        a2 = new a();
                                        a2.b = (TextView)view.findViewById(2131297245);
                                        a2.c = (ImageView)view.findViewById(2131296865);
                                        view.setTag((Object)a2);
                                    } else {
                                        a2 = (a)view.getTag();
                                    }
                                    if (((a.a)this.c.get((int)n2)).f) {
                                        a2.c.setAlpha(0.5f);
                                        a2.b.setTextColor(1358954495);
                                    } else {
                                        a2.c.setAlpha(1.0f);
                                        a2.b.setTextColor(-1);
                                    }
                                    a2.b.setText((CharSequence)g.a(((a.a)this.c.get((int)n2)).a, g.a));
                                    if (n2 % 2 == 0) {
                                        view.setBackgroundResource(2131230838);
                                        return view;
                                    }
                                    view.setBackgroundResource(2131231006);
                                    return view;
                                }

                                private class a {
                                    private TextView b;
                                    private ImageView c;

                                    private a() {
                                    }
                                }

                            };
                            ActivityStationSelectionHotels.d(this.a.b).setAdapter((android.widget.ListAdapter)baseAdapter);
                            ActivityStationSelectionHotels.d(this.a.b).setOnItemClickListener(new android.widget.AdapterView$OnItemClickListener(this, baseAdapter){
                                final /* synthetic */ a a;
                                final /* synthetic */ com.mobond.mindicator.ui.indianrail.hotels.ActivityStationSelectionHotels$2$1 b;
                                {
                                    this.b = var1_1;
                                    this.a = a2;
                                }

                                public void onItemClick(android.widget.AdapterView<?> adapterView, View view, int n2, long l2) {
                                    ArrayList arrayList = a.a(this.a);
                                    ActivityStationSelectionHotels.a(view.getContext(), ((a.a)arrayList.get(n2)).a(), false);
                                    a.a(this.a, ((a.a)arrayList.get((int)n2)).a, ((a.a)arrayList.get((int)n2)).c, ((a.a)arrayList.get((int)n2)).d);
                                }
                            });
                            ActivityStationSelectionHotels.f(this.a.b).setOnClickListener(new View.OnClickListener(this){
                                final /* synthetic */ com.mobond.mindicator.ui.indianrail.hotels.ActivityStationSelectionHotels$2$1 a;
                                {
                                    this.a = var1_1;
                                }

                                public void onClick(View view) {
                                    ActivityStationSelectionHotels.e(this.a.a.b).setText((CharSequence)"");
                                    ActivityStationSelectionHotels.e(this.a.a.b).requestFocus();
                                    android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager)this.a.a.b.getSystemService("input_method");
                                    if (inputMethodManager != null) {
                                        inputMethodManager.showSoftInput((View)ActivityStationSelectionHotels.e(this.a.a.b), 1);
                                    }
                                }
                            });
                            this.a.a.setNavigationOnClickListener(new View.OnClickListener(this){
                                final /* synthetic */ com.mobond.mindicator.ui.indianrail.hotels.ActivityStationSelectionHotels$2$1 a;
                                {
                                    this.a = var1_1;
                                }

                                public void onClick(View view) {
                                    android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager)this.a.a.b.getSystemService("input_method");
                                    if (inputMethodManager != null) {
                                        inputMethodManager.hideSoftInputFromWindow(ActivityStationSelectionHotels.e(this.a.a.b).getWindowToken(), 0);
                                    }
                                    this.a.a.b.finish();
                                }
                            });
                            ActivityStationSelectionHotels.e(this.a.b).addTextChangedListener(new android.text.TextWatcher(this, baseAdapter){
                                final /* synthetic */ a a;
                                final /* synthetic */ com.mobond.mindicator.ui.indianrail.hotels.ActivityStationSelectionHotels$2$1 b;
                                {
                                    this.b = var1_1;
                                    this.a = a2;
                                }

                                public void afterTextChanged(android.text.Editable editable) {
                                    if (editable.length() == 0) {
                                        ActivityStationSelectionHotels.f(this.b.a.b).setVisibility(8);
                                    } else {
                                        ActivityStationSelectionHotels.f(this.b.a.b).setVisibility(0);
                                    }
                                    a.a(this.a, editable.toString());
                                }

                                public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
                                }

                                public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
                                }
                            });
                            if (ActivityStationSelectionHotels.b(this.a.b).isShowing()) {
                                ActivityStationSelectionHotels.b(this.a.b).dismiss();
                            }
                            ActivityStationSelectionHotels.b(this.a.b).setCancelable(true);
                            ActivityStationSelectionHotels.b(this.a.b).setTitle((CharSequence)this.a.b.getString(2131755247));
                            ActivityStationSelectionHotels.b(this.a.b).setMessage((CharSequence)this.a.b.getString(2131755446));
                            ActivityStationSelectionHotels.b(this.a.b).setOnCancelListener(new android.content.DialogInterface$OnCancelListener(this){
                                final /* synthetic */ com.mobond.mindicator.ui.indianrail.hotels.ActivityStationSelectionHotels$2$1 a;
                                {
                                    this.a = var1_1;
                                }

                                public void onCancel(android.content.DialogInterface dialogInterface) {
                                    if (ActivityStationSelectionHotels.c(this.a.a.b) != null) {
                                        ActivityStationSelectionHotels.c(this.a.a.b).a();
                                    }
                                }
                            });
                        }
                    });
                    return;
                }
                catch (java.lang.Exception exception) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("exception: ");
                    stringBuilder.append(exception.getMessage());
                    android.util.Log.d((String)"ex", (String)stringBuilder.toString(), (java.lang.Throwable)exception);
                    if (ActivityStationSelectionHotels.b(this.b).isShowing()) {
                        ActivityStationSelectionHotels.b(this.b).dismiss();
                    }
                    n.d(this.b.getApplicationContext(), this.b.getString(2131755266));
                    return;
                }
            }
        }).start();
    }

    public void onDestroy() {
        super.onDestroy();
        com.mobond.mindicator.a.a a2 = this.e;
        if (a2 != null) {
            a2.a();
        }
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 106) {
            if (arrn.length > 0 && arrn[0] == 0) {
                this.h.performClick();
                return;
            }
            if (!androidx.core.app.a.a((Activity)this, (String)arrstring[0])) {
                com.mobond.mindicator.a.a((Activity)this).b(Arrays.toString((Object[])arrstring), true);
            }
        }
    }

}

