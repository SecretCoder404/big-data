/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.text.Editable
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$BadTokenException
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  androidx.core.content.a
 *  androidx.fragment.app.e
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$a
 *  androidx.recyclerview.widget.RecyclerView$i
 *  androidx.recyclerview.widget.RecyclerView$n
 *  androidx.recyclerview.widget.RecyclerView$x
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
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.lt;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.lt.PeopleSharing;
import com.mobond.mindicator.ui.lt.a.b;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.TraceTrainUI2;
import com.mobond.mindicator.util.b;
import com.mulo.b.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PeopleSharing
extends androidx.appcompat.app.e
implements f.b,
f.c,
b.a {
    ProgressBar A;
    boolean B = false;
    View C;
    TextView a;
    TextView b;
    TextView c;
    RelativeLayout d;
    RecyclerView e;
    com.mobond.mindicator.b f;
    ArrayList<b> g = new ArrayList();
    SharedPreferences h;
    String i;
    String j;
    Dialog k;
    EditText l;
    EditText m;
    TextView n;
    View o;
    com.google.android.gms.common.api.f p;
    com.mobond.mindicator.util.b q;
    String r = "";
    String s = "reg";
    String t = "update";
    String u;
    d v;
    String w;
    FloatingActionButton x;
    ArrayList<String> y;
    String z;

    private void a(Activity activity) {
        View view;
        if (activity != null && (view = activity.getCurrentFocus()) != null) {
            ((InputMethodManager)activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void a(Spinner spinner) {
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        for (int i2 = 0; i2 < this.y.size() - 1; ++i2) {
            String string = ((String)this.y.get(i2)).split("#")[0];
            String string2 = ((String)this.y.get(i2)).split("#")[1];
            String string3 = ((String)this.y.get(i2)).split("#")[2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            arrayList.add((Object)stringBuilder.toString());
            if (!string3.equals((Object)this.u)) continue;
            n2 = i2;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (List)arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter)arrayAdapter);
        spinner.setSelection(n2);
    }

    private void a(Spinner spinner, Spinner spinner2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"- Select Destination -");
        boolean bl = false;
        for (int i2 = 0; i2 < this.y.size(); ++i2) {
            String string = ((String)this.y.get(i2)).split("#")[0];
            String string2 = ((String)this.y.get(i2)).split("#")[1];
            String string3 = ((String)this.y.get(i2)).split("#")[2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            String string4 = stringBuilder.toString();
            if (bl) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                stringBuilder2.append(" ");
                stringBuilder2.append(string2);
                stringBuilder2.append(" ");
                stringBuilder2.append(string3);
                arrayList.add((Object)stringBuilder2.toString());
            }
            if (string4.equals(spinner.getSelectedItem())) {
                bl = true;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (List)arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            spinner2.setAdapter((SpinnerAdapter)arrayAdapter);
        }
    }

    private void a(d d2, String string, String string2, String string3, String string4) {
        ProgressDialog progressDialog = new ProgressDialog((Context)this);
        progressDialog.setMessage((CharSequence)"Adding Train..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        if (GoogleLoginActivity.b((Context)this)) {
            h h2 = new h();
            h2.a("tn", d2.s);
            h2.a("u", this.f.E());
            h2.a("l", d2.w);
            h2.a("bt", string2);
            h2.a("bs", string);
            h2.a("at", string4);
            h2.a("as", string3);
            h2.a("a", "add");
            h2.a("isvol", "true");
            com.mulo.b.a a2 = new com.mulo.b.a(this, progressDialog, d2, string, string3){
                final /* synthetic */ ProgressDialog a;
                final /* synthetic */ d b;
                final /* synthetic */ String c;
                final /* synthetic */ String d;
                final /* synthetic */ PeopleSharing e;
                {
                    this.e = peopleSharing;
                    this.a = progressDialog;
                    this.b = d2;
                    this.c = string;
                    this.d = string2;
                }

                public void a() {
                    n.d((Context)PeopleSharing.b(this.e), "Check Internet");
                    n.a((Dialog)this.a);
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public void a(byte[] arrby, byte[] arrby2, Object object) {
                    ArrayList<d> arrayList;
                    block4 : {
                        String string = new String(arrby);
                        n.a((Dialog)this.a);
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            if (jSONObject.optString("code").equals((Object)"400")) {
                                n.d((Context)this.e, jSONObject.optString("message"));
                                return;
                            }
                            arrayList = f.b((Context)PeopleSharing.b(this.e));
                            d d2 = this.b;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(this.c);
                            stringBuilder.append(" - ");
                            stringBuilder.append(this.d);
                            d2.v = stringBuilder.toString();
                            this.b.z = true;
                            if (!f.a(this.b.s, (Context)this.e)) break block4;
                        }
                        catch (JSONException jSONException) {
                            jSONException.printStackTrace();
                            return;
                        }
                        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                            if (!((d)arrayList.get((int)i2)).s.equals((Object)this.e.w)) continue;
                            arrayList.remove(i2);
                            break;
                        }
                    }
                    arrayList.add((Object)this.b);
                    f.a((Context)PeopleSharing.b(this.e), arrayList);
                    n.c((Context)this.e, "Thank you for becoming volunteer");
                    this.e.startActivity(new Intent((Context)this.e, com.mobond.mindicator.ui.lt.AddTrainActivity.class).putExtra("tntoscroll", this.b.s));
                    this.e.finish();
                }
            };
            com.mobond.mindicator.ui.lt.trainutils.a.a(h2, a2, (Activity)this);
        }
    }

    static /* synthetic */ void a(PeopleSharing peopleSharing) {
        peopleSharing.i();
    }

    static /* synthetic */ void a(PeopleSharing peopleSharing, Spinner spinner, Spinner spinner2) {
        peopleSharing.a(spinner, spinner2);
    }

    static /* synthetic */ void a(PeopleSharing peopleSharing, d d2, String string, String string2, String string3, String string4) {
        peopleSharing.a(d2, string, string2, string3, string4);
    }

    static /* synthetic */ void a(PeopleSharing peopleSharing, String string) {
        peopleSharing.c(string);
    }

    static /* synthetic */ void a(PeopleSharing peopleSharing, String string, ProgressDialog progressDialog) {
        peopleSharing.a(string, progressDialog);
    }

    static /* synthetic */ void a(PeopleSharing peopleSharing, String string, String string2, String string3) {
        peopleSharing.a(string, string2, string3);
    }

    private void a(String string, ProgressDialog progressDialog) {
        n.a((Dialog)progressDialog);
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getString("code").equals((Object)"400")) {
                n.d((Context)this.h(), jSONObject.getString("message"));
                return;
            }
            n.c((Context)this.h(), "Successfully Updated");
            this.f.q(this.l.getText().toString());
            this.f.c(true);
            this.g();
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String string, String string2, String string3) {
        int n2;
        ArrayList arrayList;
        JSONArray jSONArray;
        ArrayList<d> arrayList2;
        if (string3 == null) return;
        try {
            JSONObject jSONObject = new JSONObject(string3);
            if (jSONObject.getString("code").equals((Object)"400")) {
                n.d((Context)this.h(), jSONObject.getString("message"));
                return;
            }
            if (!jSONObject.getBoolean("isuserregistered")) {
                this.a(false);
                return;
            }
            GoogleLoginActivity.c((Context)this.h());
            this.f.t(jSONObject.getString("displayname"));
            this.f.q(jSONObject.getString("mobile"));
            this.f.r(jSONObject.optString("access"));
            this.f.c(jSONObject.optBoolean("isverified"));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isverified : ");
            stringBuilder.append(jSONObject.optBoolean("isverified"));
            Log.d((String)"99999", (String)stringBuilder.toString());
            if (!jSONObject.optBoolean("isverified")) {
                this.a(true);
            } else {
                n.c((Context)this.h(), "Successfully Login");
                this.g();
            }
            if (!jSONObject.has("trains")) return;
            arrayList = new ArrayList();
            arrayList2 = f.b((Context)this.h());
            jSONArray = jSONObject.getJSONArray("trains");
            n2 = 0;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
        do {
            block16 : {
                boolean bl;
                d d2;
                String string4;
                block15 : {
                    block14 : {
                        if (n2 >= jSONArray.length()) break block14;
                        JSONObject jSONObject = jSONArray.getJSONObject(n2);
                        string4 = jSONObject.getString("tn");
                        String string5 = jSONObject.getString("src");
                        String string6 = jSONObject.getString("dest");
                        bl = jSONObject.optBoolean("isvol", false);
                        d2 = f.b(string4, (Context)this.h());
                        if (d2 != null) break block15;
                        d d3 = f.a(string4, string5, string6, (Context)this.h());
                        if (d3 != null) {
                            d3.z = bl;
                            arrayList.add((Object)d3);
                        }
                        break block16;
                    }
                    if (arrayList.size() == 0) return;
                    {
                        arrayList2.addAll((Collection)arrayList);
                        f.a((Context)this.h(), arrayList2);
                        return;
                    }
                }
                int n3 = 0;
                do {
                    block18 : {
                        block17 : {
                            if (n3 >= arrayList2.size()) break block17;
                            if (!((d)arrayList2.get((int)n3)).s.equals((Object)string4)) break block18;
                            arrayList2.remove(n3);
                        }
                        d2.z = bl;
                        arrayList.add((Object)d2);
                        break;
                    }
                    ++n3;
                } while (true);
            }
            ++n2;
        } while (true);
    }

    private void a(String string, String string2, String string3, String string4) {
        this.a(this.h());
        ProgressDialog progressDialog = new ProgressDialog((Context)this.h());
        progressDialog.setMessage((CharSequence)"Saving..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        com.mobond.mindicator.ui.lt.trainutils.a.a(string, string2, string3, string4, true, this.f.H(), new com.mulo.b.a(this, progressDialog, string2, string3){
            final /* synthetic */ ProgressDialog a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ PeopleSharing d;
            {
                this.d = peopleSharing;
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
                PeopleSharing.b(this.d, string, this.b, this.c);
            }
        }, this.h());
    }

    static /* synthetic */ boolean a(PeopleSharing peopleSharing, String string, String string2) {
        return peopleSharing.b(string, string2);
    }

    static /* synthetic */ Activity b(PeopleSharing peopleSharing) {
        return peopleSharing.h();
    }

    private void b(Spinner spinner) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"- Select Destination -");
        for (int i2 = 1; i2 < this.y.size(); ++i2) {
            String string = ((String)this.y.get(i2)).split("#")[0];
            String string2 = ((String)this.y.get(i2)).split("#")[1];
            String string3 = ((String)this.y.get(i2)).split("#")[2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            arrayList.add((Object)stringBuilder.toString());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (List)arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter)arrayAdapter);
    }

    static /* synthetic */ void b(PeopleSharing peopleSharing, String string, String string2, String string3) {
        peopleSharing.b(string, string2, string3);
    }

    private void b(String string, String string2, String string3) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getString("code").equals((Object)"400")) {
                n.d((Context)this.h(), jSONObject.getString("message"));
                return;
            }
            n.c((Context)this.h(), jSONObject.getString("message"));
            GoogleLoginActivity.c((Context)this.h());
            this.f.q(string2);
            this.f.t(string3);
            this.g();
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    static /* synthetic */ boolean b(PeopleSharing peopleSharing, String string) {
        return peopleSharing.d(string);
    }

    private boolean b(String string, String string2) {
        if (string2 != null && !string2.equals((Object)"- Select Destination -")) {
            int n2 = -1;
            int n3 = -1;
            for (int i2 = 0; i2 < this.y.size(); ++i2) {
                String string3 = ((String)this.y.get(i2)).split("#")[0];
                String string4 = ((String)this.y.get(i2)).split("#")[1];
                String string5 = ((String)this.y.get(i2)).split("#")[2];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(" ");
                stringBuilder.append(string4);
                stringBuilder.append(" ");
                stringBuilder.append(string5);
                String string6 = stringBuilder.toString();
                if (string6.equals((Object)string)) {
                    n3 = i2;
                }
                if (!string6.equals((Object)string2)) continue;
                n2 = i2;
            }
            if (n2 > n3) {
                return true;
            }
            if (n3 == n2) {
                n.d((Context)this, "Source and Destination cannot be same");
                return false;
            }
            n.d((Context)this, "Please select valid source and destination");
            return false;
        }
        n.d((Context)this, "Please select destination");
        return false;
    }

    static /* synthetic */ void c(PeopleSharing peopleSharing) {
        peopleSharing.f();
    }

    static /* synthetic */ void c(PeopleSharing peopleSharing, String string) {
        peopleSharing.e(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(String string) {
        block5 : {
            if (!string.isEmpty()) {
                JSONArray jSONArray;
                try {
                    this.g.clear();
                    JSONObject jSONObject = new JSONObject(string);
                    if (!jSONObject.has("list")) break block5;
                    jSONArray = jSONObject.getJSONArray("list");
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                    break block5;
                }
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    b b2 = new b();
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    b2.a = new StringBuffer(jSONObject.getString("u")).reverse().toString();
                    b2.b = jSONObject.getString("un");
                    b2.d = jSONObject.getString("m");
                    b2.e = jSONObject.getInt("lk");
                    b2.f = jSONObject.getInt("dk");
                    b2.g = jSONObject.optString("bl", null);
                    b2.h = jSONObject.optBoolean("vlt", false);
                    b2.c = jSONObject.optString("std", null);
                    this.g.add((Object)b2);
                }
            }
        }
        if (this.g.size() > 0) {
            this.e.setAdapter((RecyclerView.a)new RecyclerView.a<a>(){

                private String a(String string) {
                    if (string != null) {
                        return new String(IRParser.Base64.decode(string));
                    }
                    return "";
                }

                private void a(a a2, String string, b b2, int n2) {
                    a2.l.setOnClickListener(new View.OnClickListener(this, string, b2, n2){
                        final /* synthetic */ String a;
                        final /* synthetic */ b b;
                        final /* synthetic */ int c;
                        final /* synthetic */ a d;
                        {
                            this.d = a2;
                            this.a = string;
                            this.b = b2;
                            this.c = n2;
                        }

                        public void onClick(View view) {
                            if (!this.d.PeopleSharing.this.B) {
                                this.d.PeopleSharing.this.B = true;
                                String string = this.a;
                                if (string != null) {
                                    if (string.equals((Object)"liked")) {
                                        a.a(this.d, "2", this.b, this.c);
                                        return;
                                    }
                                    if (this.a.equals((Object)"disliked")) {
                                        a.a(this.d, "0", this.b, this.c, true);
                                        return;
                                    }
                                } else {
                                    a.a(this.d, "0", this.b, this.c);
                                }
                            }
                        }
                    });
                    a2.m.setOnClickListener(new View.OnClickListener(this, string, b2, n2){
                        final /* synthetic */ String a;
                        final /* synthetic */ b b;
                        final /* synthetic */ int c;
                        final /* synthetic */ a d;
                        {
                            this.d = a2;
                            this.a = string;
                            this.b = b2;
                            this.c = n2;
                        }

                        public void onClick(View view) {
                            if (!this.d.PeopleSharing.this.B) {
                                this.d.PeopleSharing.this.B = true;
                                String string = this.a;
                                if (string != null) {
                                    if (string.equals((Object)"disliked")) {
                                        a.a(this.d, "3", this.b, this.c);
                                        return;
                                    }
                                    if (this.a.equals((Object)"liked")) {
                                        a.a(this.d, "1", this.b, this.c, true);
                                        return;
                                    }
                                } else {
                                    a.a(this.d, "1", this.b, this.c);
                                }
                            }
                        }
                    });
                }

                static /* synthetic */ void a(a a2, String string, b b2, int n2) {
                    a2.a(string, b2, n2);
                }

                static /* synthetic */ void a(a a2, String string, b b2, int n2, boolean bl) {
                    a2.a(string, b2, n2, bl);
                }

                private void a(String string, b b2, int n2) {
                    this.a(string, b2, n2, false);
                }

                private void a(final String string, final b b2, final int n2, final boolean bl) {
                    PeopleSharing.this.A.setVisibility(0);
                    final String string2 = b2.a;
                    String string3 = PeopleSharing.this.w;
                    com.mulo.b.a a2 = new com.mulo.b.a(){

                        @Override
                        public void a() {
                            PeopleSharing.this.B = false;
                            PeopleSharing.this.A.setVisibility(8);
                            n.d((Context)PeopleSharing.this, "Check Internet");
                        }

                        @Override
                        public void a(byte[] arrby, byte[] arrby2, Object object) {
                            PeopleSharing.this.A.setVisibility(8);
                            if (string.equals((Object)"0")) {
                                PeopleSharing.this.c(PeopleSharing.this.w, string2);
                                b b22 = (b)PeopleSharing.this.g.get(n2);
                                b22.e = 1 + b22.e;
                                if (bl) {
                                    b b3 = (b)PeopleSharing.this.g.get(n2);
                                    b3.f = -1 + b3.f;
                                }
                            } else if (string.equals((Object)"1")) {
                                PeopleSharing.this.d(PeopleSharing.this.w, string2);
                                b b4 = (b)PeopleSharing.this.g.get(n2);
                                b4.f = 1 + b4.f;
                                if (bl) {
                                    b b5 = (b)PeopleSharing.this.g.get(n2);
                                    b5.e = -1 + b5.e;
                                }
                            } else {
                                if (string.equals((Object)"2")) {
                                    b b6 = (b)PeopleSharing.this.g.get(n2);
                                    b6.e = -1 + b6.e;
                                } else if (string.equals((Object)"3")) {
                                    b b7 = (b)PeopleSharing.this.g.get(n2);
                                    b7.f = -1 + b7.f;
                                }
                                PeopleSharing.this.e(PeopleSharing.this.w, b2.a);
                            }
                            if (PeopleSharing.this.e.getAdapter() != null) {
                                PeopleSharing.this.e.getAdapter().notifyDataSetChanged();
                            }
                            PeopleSharing.this.B = false;
                        }
                    };
                    com.mobond.mindicator.ui.lt.trainutils.a.a(string3, string2, string, bl, a2, (Activity)PeopleSharing.this);
                }

                public a a(ViewGroup viewGroup, int n2) {
                    return new a(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131492930, null));
                }

                public void a(a a2, int n2) {
                    b b2 = (b)PeopleSharing.this.g.get(n2);
                    if (PeopleSharing.this.z != null && PeopleSharing.this.z.equals((Object)this.a(b2.a))) {
                        a2.g.setVisibility(0);
                        a2.a.setText((CharSequence)"YOU");
                    } else {
                        a2.g.setVisibility(8);
                        a2.a.setText((CharSequence)b2.b);
                    }
                    if (b2.c != null) {
                        a2.b.setText((CharSequence)b2.c);
                        a2.b.setVisibility(0);
                    } else {
                        a2.b.setVisibility(8);
                    }
                    PeopleSharing peopleSharing = PeopleSharing.this;
                    String string = peopleSharing.f(peopleSharing.w, b2.a);
                    if (string == null) {
                        a2.i.setColorFilter(androidx.core.content.a.c((Context)PeopleSharing.this, (int)2131099782), PorterDuff.Mode.SRC_IN);
                        a2.h.setColorFilter(androidx.core.content.a.c((Context)PeopleSharing.this, (int)2131099782), PorterDuff.Mode.SRC_IN);
                    } else if (string.equals((Object)"liked")) {
                        a2.i.setColorFilter(androidx.core.content.a.c((Context)PeopleSharing.this, (int)2131099781), PorterDuff.Mode.SRC_IN);
                        a2.h.setColorFilter(androidx.core.content.a.c((Context)PeopleSharing.this, (int)2131099782), PorterDuff.Mode.SRC_IN);
                        if (b2.e == 0) {
                            b2.e = 1;
                        }
                    } else if (string.equals((Object)"disliked")) {
                        a2.i.setColorFilter(androidx.core.content.a.c((Context)PeopleSharing.this, (int)2131099782), PorterDuff.Mode.SRC_IN);
                        a2.h.setColorFilter(androidx.core.content.a.c((Context)PeopleSharing.this, (int)2131100242), PorterDuff.Mode.SRC_IN);
                        if (b2.f == 0) {
                            b2.f = 1;
                        }
                    }
                    a2.c.setText((CharSequence)b2.d);
                    TextView textView = a2.d;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.e);
                    stringBuilder.append("");
                    textView.setText((CharSequence)stringBuilder.toString());
                    TextView textView2 = a2.e;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(b2.f);
                    stringBuilder2.append("");
                    textView2.setText((CharSequence)stringBuilder2.toString());
                    if (b2.g != null && !b2.g.isEmpty() && !b2.g.equals((Object)"0")) {
                        TextView textView3 = a2.f;
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(b2.g);
                        stringBuilder3.append("");
                        textView3.setText((CharSequence)stringBuilder3.toString());
                        a2.n.setVisibility(0);
                    } else {
                        a2.n.setVisibility(8);
                    }
                    this.a(a2, string, b2, n2);
                }

                public int getItemCount() {
                    return PeopleSharing.this.g.size();
                }

                public /* synthetic */ void onBindViewHolder(RecyclerView.x x2, int n2) {
                    this.a((a)x2, n2);
                }

                public /* synthetic */ RecyclerView.x onCreateViewHolder(ViewGroup viewGroup, int n2) {
                    return this.a(viewGroup, n2);
                }

                public class a
                extends RecyclerView.x {
                    TextView a;
                    TextView b;
                    TextView c;
                    TextView d;
                    TextView e;
                    TextView f;
                    ImageView g;
                    ImageView h;
                    ImageView i;
                    ImageView j;
                    LinearLayout k;
                    LinearLayout l;
                    LinearLayout m;
                    LinearLayout n;

                    public a(View view) {
                        super(view);
                        this.a = (TextView)view.findViewById(2131297632);
                        this.b = (TextView)view.findViewById(2131297625);
                        this.c = (TextView)view.findViewById(2131297616);
                        this.d = (TextView)view.findViewById(2131297614);
                        this.e = (TextView)view.findViewById(2131297609);
                        this.f = (TextView)view.findViewById(2131297606);
                        this.g = (ImageView)view.findViewById(2131296793);
                        this.i = (ImageView)view.findViewById(2131296879);
                        this.h = (ImageView)view.findViewById(2131296878);
                        this.k = (LinearLayout)view.findViewById(2131296920);
                        this.j = (ImageView)view.findViewById(2131296876);
                        this.l = (LinearLayout)view.findViewById(2131296957);
                        this.m = (LinearLayout)view.findViewById(2131296956);
                        this.n = (LinearLayout)view.findViewById(2131296955);
                    }
                }

            });
            return;
        }
        this.c.setVisibility(0);
        this.c.setText((CharSequence)"No user sharing live train.\n\nTap to refresh");
        this.c.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ PeopleSharing a;
            {
                this.a = peopleSharing;
            }

            public void onClick(View view) {
                PeopleSharing.a(this.a);
            }
        });
    }

    private void c(String string, String string2) {
        SharedPreferences.Editor editor = this.h.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("liked_");
        stringBuilder2.append(System.currentTimeMillis());
        editor.putString(string3, stringBuilder2.toString());
        editor.apply();
    }

    private void d() {
        this.h = this.getSharedPreferences("sharedpreflikes", 0);
        this.A = (ProgressBar)this.findViewById(2131297127);
        this.f = com.mobond.mindicator.a.a((Activity)this);
        this.z = this.f.F();
        this.v = (d)this.getIntent().getParcelableExtra("extra_dr");
        this.u = this.getIntent().getStringExtra("boardingstation");
        this.y = this.getIntent().getStringArrayListExtra("trace");
        this.w = this.v.s;
        this.d = (RelativeLayout)this.findViewById(2131296438);
        this.x = (FloatingActionButton)this.findViewById(2131296759);
        this.e = (RecyclerView)this.findViewById(2131297180);
        this.e.setLayoutManager((RecyclerView.i)new LinearLayoutManager((Context)this));
        this.a = (TextView)this.findViewById(2131297628);
        this.c = (TextView)this.findViewById(2131296719);
        this.b = (TextView)this.findViewById(2131297354);
        this.a.setText((CharSequence)this.w);
        TextView textView = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((String)this.y.get(0)).split("#")[2]);
        stringBuilder.append(" - ");
        ArrayList<String> arrayList = this.y;
        stringBuilder.append(((String)arrayList.get(-1 + arrayList.size())).split("#")[2]);
        textView.setText((CharSequence)stringBuilder.toString());
        TextView textView2 = (TextView)this.findViewById(2131296425);
        TextView textView3 = (TextView)this.findViewById(2131296533);
        textView2.setText((CharSequence)"m-Indicator");
        textView3.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.i();
        this.x.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ PeopleSharing a;
            {
                this.a = peopleSharing;
            }

            public void onClick(View view) {
                PeopleSharing.a(this.a);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ PeopleSharing a;
            {
                this.a = peopleSharing;
            }

            public void onClick(View view) {
                PeopleSharing peopleSharing = this.a;
                peopleSharing.q = com.mobond.mindicator.util.b.a(PeopleSharing.b(peopleSharing));
                PeopleSharing.c(this.a);
            }
        });
        if (GoogleLoginActivity.b((Context)this) && this.f.N() && f.c(this.w, (Context)this)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
        this.e.a(new RecyclerView.n(this){
            final /* synthetic */ PeopleSharing a;
            {
                this.a = peopleSharing;
            }

            public void onScrollStateChanged(RecyclerView recyclerView, int n2) {
                super.onScrollStateChanged(recyclerView, n2);
                if (n2 != 2 && n2 != 1) {
                    this.a.x.b();
                    return;
                }
                this.a.x.c();
            }
        });
    }

    static /* synthetic */ void d(PeopleSharing peopleSharing) {
        peopleSharing.g();
    }

    private void d(String string, String string2) {
        SharedPreferences.Editor editor = this.h.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("disliked_");
        stringBuilder2.append(System.currentTimeMillis());
        editor.putString(string3, stringBuilder2.toString());
        editor.apply();
    }

    private boolean d(String string) {
        if (string.isEmpty()) {
            n.d((Context)this.h(), "Please enter mobile number");
            return false;
        }
        if (string.length() != 10) {
            n.d((Context)this.h(), "Please enter valid mobile number");
            return false;
        }
        if (!string.contains((CharSequence)"+") && !string.contains((CharSequence)"-")) {
            return true;
        }
        n.d((Context)this.h(), "Please enter valid mobile number");
        return false;
    }

    private void e() {
        if (this.C == null) {
            this.C = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/2269602980", "167101606757479_1239838659483763", "ca-app-pub-5449278086868932/9009431450", "167101606757479_1235757836558512", 3, null);
        }
    }

    private void e(String string) {
        this.q.a(string);
    }

    private void e(String string, String string2) {
        SharedPreferences.Editor editor = this.h.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        editor.remove(stringBuilder.toString());
        editor.apply();
    }

    private String f(String string, String string2) {
        SharedPreferences sharedPreferences = this.h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        String string3 = sharedPreferences.getString(stringBuilder.toString(), null);
        if (string3 != null) {
            String[] arrstring = string3.split("_");
            long l2 = Long.parseLong((String)arrstring[1]);
            if (System.currentTimeMillis() - l2 > 1200000L) {
                SharedPreferences.Editor editor = this.h.edit();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                stringBuilder2.append("_");
                stringBuilder2.append(string2);
                editor.remove(stringBuilder2.toString());
                editor.apply();
                Log.d((String)"55555", (String)"TIMEOUT");
            } else {
                Log.d((String)"55555", (String)"PROPER");
                return arrstring[0];
            }
        }
        Log.d((String)"55555", (String)"NULL");
        return null;
    }

    private void f() {
        Dialog dialog = new Dialog((Context)this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131493061);
        dialog.getWindow().setLayout(-1, -2);
        dialog.show();
        dialog.findViewById(2131296443).setOnClickListener(new View.OnClickListener(this, dialog){
            final /* synthetic */ Dialog a;
            final /* synthetic */ PeopleSharing b;
            {
                this.b = peopleSharing;
                this.a = dialog;
            }

            public void onClick(View view) {
                TraceTrainUI2.a((Context)this.b, "VOLUNTEER");
                if (com.mulo.b.c.a((Context)PeopleSharing.b(this.b))) {
                    n.a(this.a);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("isMtracker : ");
                    stringBuilder.append(GoogleLoginActivity.b((Context)this.b));
                    Log.d((String)"101010", (String)stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("verfied : ");
                    stringBuilder2.append(this.b.f.N());
                    Log.d((String)"101010", (String)stringBuilder2.toString());
                    if (GoogleLoginActivity.b((Context)this.b) && this.b.f.N()) {
                        PeopleSharing.d(this.b);
                        return;
                    }
                    this.b.a();
                    return;
                }
                n.d((Context)PeopleSharing.b(this.b), PeopleSharing.b(this.b).getResources().getString(2131755095));
            }
        });
        dialog.findViewById(2131297611).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ PeopleSharing a;
            {
                this.a = peopleSharing;
            }

            public void onClick(View view) {
                com.mobond.mindicator.ui.lt.AddTrainActivity.a((Context)PeopleSharing.b(this.a), "vNxAv73uzTk");
            }
        });
    }

    static /* synthetic */ void f(PeopleSharing peopleSharing, String string, String string2) {
        peopleSharing.g(string, string2);
    }

    private void g() {
        if (f.a(this.w, (Context)this)) {
            d d2 = f.b(this.w, (Context)this);
            String string = d2.v.split("-")[0].trim();
            String string2 = d2.v.split("-")[1].trim();
            String string3 = "";
            String string4 = "";
            for (int i2 = 0; i2 < this.y.size(); ++i2) {
                String string5 = ((String)this.y.get(i2)).split("#")[0];
                String string6 = ((String)this.y.get(i2)).split("#")[1];
                String string7 = ((String)this.y.get(i2)).split("#")[2];
                if (string.equals((Object)string7)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string5);
                    stringBuilder.append(" ");
                    stringBuilder.append(string6);
                    string3 = stringBuilder.toString();
                }
                if (!string2.equals((Object)string7)) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string5);
                stringBuilder.append(" ");
                stringBuilder.append(string6);
                string4 = stringBuilder.toString();
            }
            this.a(d2, string, string3, string2, string4);
            return;
        }
        Dialog dialog = new Dialog((Context)this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131492936);
        dialog.getWindow().setLayout(-1, -2);
        dialog.show();
        TextView textView = (TextView)dialog.findViewById(2131297631);
        TextView textView2 = (TextView)dialog.findViewById(2131296437);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Train : ");
        stringBuilder.append(this.w);
        stringBuilder.append("  ");
        stringBuilder.append(((String)this.y.get(0)).split("#")[2]);
        stringBuilder.append(" - ");
        ArrayList<String> arrayList = this.y;
        stringBuilder.append(((String)arrayList.get(arrayList.size() - 1)).split("#")[2]);
        textView.setText((CharSequence)stringBuilder.toString());
        Spinner spinner = (Spinner)dialog.findViewById(2131297405);
        Spinner spinner2 = (Spinner)dialog.findViewById(2131297404);
        this.a(spinner);
        this.b(spinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(this, spinner, spinner2){
            final /* synthetic */ Spinner a;
            final /* synthetic */ Spinner b;
            final /* synthetic */ PeopleSharing c;
            {
                this.c = peopleSharing;
                this.a = spinner;
                this.b = spinner2;
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int n2, long l2) {
                PeopleSharing.a(this.c, this.a, this.b);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this, spinner, spinner2){
            final /* synthetic */ Spinner a;
            final /* synthetic */ Spinner b;
            final /* synthetic */ PeopleSharing c;
            {
                this.c = peopleSharing;
                this.a = spinner;
                this.b = spinner2;
            }

            public void onClick(View view) {
                PeopleSharing peopleSharing = this.c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.a.getSelectedItem());
                stringBuilder.append("");
                String string = stringBuilder.toString();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.b.getSelectedItem());
                stringBuilder2.append("");
                if (PeopleSharing.a(peopleSharing, string, stringBuilder2.toString())) {
                    String string2 = this.a.getSelectedItem().toString().split(" ")[0];
                    String string3 = this.a.getSelectedItem().toString().split(" ")[1];
                    String string4 = this.a.getSelectedItem().toString();
                    String string5 = string4.substring(string4.indexOf(string3) + string3.length()).trim();
                    String string6 = this.b.getSelectedItem().toString().split(" ")[0];
                    String string7 = this.b.getSelectedItem().toString().split(" ")[1];
                    String string8 = this.b.getSelectedItem().toString();
                    String string9 = string8.substring(string8.indexOf(string7) + string7.length()).trim();
                    PeopleSharing peopleSharing2 = this.c;
                    d d2 = peopleSharing2.v;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string2);
                    stringBuilder3.append(" ");
                    stringBuilder3.append(string3);
                    String string10 = stringBuilder3.toString();
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(string6);
                    stringBuilder4.append(" ");
                    stringBuilder4.append(string7);
                    PeopleSharing.a(peopleSharing2, d2, string5, string10, string9, stringBuilder4.toString());
                }
            }
        });
    }

    private void g(String string, String string2) {
        com.mobond.mindicator.util.b b2 = this.q;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+91");
        stringBuilder.append(string);
        b2.a(stringBuilder.toString(), this, string2);
    }

    private Activity h() {
        return this;
    }

    private void i() {
        this.c.setVisibility(8);
        this.A.setVisibility(0);
        com.mobond.mindicator.ui.lt.trainutils.a.b(this.w, new com.mulo.b.a(this){
            final /* synthetic */ PeopleSharing a;
            {
                this.a = peopleSharing;
            }

            public void a() {
                this.a.c.setVisibility(0);
                this.a.c.setText((CharSequence)"Check Internet Connection.\n\nTap to retry");
                this.a.A.setVisibility(8);
                this.a.c.setOnClickListener(new View.OnClickListener(this){
                    final /* synthetic */ 13 a;
                    {
                        this.a = var1_1;
                    }

                    public void onClick(View view) {
                        PeopleSharing.a(this.a.a);
                    }
                });
            }

            public void a(byte[] arrby, byte[] arrby2, Object object) {
                this.a.A.setVisibility(8);
                PeopleSharing.a(this.a, new String(arrby));
            }
        }, (Activity)this);
    }

    private void j() {
        this.k();
        HintRequest hintRequest = new HintRequest.a().a(true).a();
        PendingIntent pendingIntent = com.google.android.gms.auth.api.a.g.a(this.p, hintRequest);
        try {
            this.startIntentSenderForResult(pendingIntent.getIntentSender(), 151, null, 0, 0, 0);
            return;
        }
        catch (IntentSender.SendIntentException sendIntentException) {
            sendIntentException.printStackTrace();
            return;
        }
    }

    private void k() {
        com.google.android.gms.common.api.f f2 = this.p;
        if (f2 == null || !f2.j()) {
            this.p = new f.a((Context)this).a((f.b)this).a((e)this, 0, (f.c)this).a(com.google.android.gms.auth.api.a.d).b();
        }
    }

    public void a() {
        this.startActivityForResult(new Intent((Context)this.h(), GoogleLoginActivity.class), 2345);
    }

    public void a(int n2) {
    }

    public void a(Bundle bundle) {
    }

    @Override
    public void a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onVerificationCompleted  actionToDO ");
        stringBuilder.append(string);
        Log.d((String)"101010", (String)stringBuilder.toString());
        n.a(this.k);
        if (string.equals((Object)this.s)) {
            String string2 = this.j;
            String string3 = this.l.getText().toString();
            String string4 = this.i;
            this.a(string2, string3, string4, string4);
            return;
        }
        if (string.equals((Object)this.t)) {
            this.c();
        }
    }

    public void a(String string, String string2) {
        ProgressDialog progressDialog = new ProgressDialog((Context)this.h());
        progressDialog.setMessage((CharSequence)"Loading..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        com.mobond.mindicator.ui.lt.trainutils.a.a(string2, this.f.H(), new com.mulo.b.a(this, progressDialog, string, string2){
            final /* synthetic */ ProgressDialog a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ PeopleSharing d;
            {
                this.d = peopleSharing;
                this.a = progressDialog;
                this.b = string;
                this.c = string2;
            }

            public void a() {
                n.a((Dialog)this.a);
            }

            public void a(byte[] arrby, byte[] arrby2, Object object) {
                String string = new String(arrby);
                n.a((Dialog)this.a);
                PeopleSharing.a(this.d, this.b, this.c, string);
            }
        }, this.h());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(boolean bl) {
        try {
            this.k = new Dialog((Context)this.h());
            this.k.requestWindowFeature(1);
            this.k.setContentView(2131492937);
            this.k.getWindow().setLayout(-1, -2);
            this.k.show();
            this.l = (EditText)this.k.findViewById(2131296704);
            this.n = (TextView)this.k.findViewById(2131296442);
            this.m = (EditText)this.k.findViewById(2131296705);
            this.o = this.k.findViewById(2131297066);
            this.n.setOnClickListener(new View.OnClickListener(this){
                final /* synthetic */ PeopleSharing a;
                {
                    this.a = peopleSharing;
                }

                public void onClick(View view) {
                    if (this.a.n.getText().toString().trim().equalsIgnoreCase("verify")) {
                        PeopleSharing peopleSharing = this.a;
                        if (PeopleSharing.b(peopleSharing, peopleSharing.l.getText().toString())) {
                            PeopleSharing peopleSharing2 = this.a;
                            PeopleSharing.f(peopleSharing2, peopleSharing2.l.getText().toString(), this.a.r);
                            return;
                        }
                    } else {
                        if (!this.a.m.getText().toString().isEmpty()) {
                            PeopleSharing peopleSharing = this.a;
                            PeopleSharing.c(peopleSharing, peopleSharing.m.getText().toString());
                            return;
                        }
                        n.d((Context)this.a, "Enter OTP");
                    }
                }
            });
            this.r = bl ? this.t : this.s;
            this.j();
            return;
        }
        catch (WindowManager.BadTokenException badTokenException) {}
    }

    @Override
    public void b() {
        Log.d((String)"101010", (String)"onCodeSent");
        Dialog dialog = this.k;
        if (dialog != null && dialog.isShowing()) {
            this.o.setVisibility(0);
            this.l.setEnabled(false);
            this.n.setText((CharSequence)"SUBMIT OTP");
        }
    }

    public void b(com.google.android.gms.common.b b2) {
    }

    @Override
    public void b(String string) {
        n.d((Context)this, string);
    }

    public void c() {
        this.a(this.h());
        ProgressDialog progressDialog = new ProgressDialog((Context)this.h());
        progressDialog.setMessage((CharSequence)"Updating Profile..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        com.mobond.mindicator.ui.lt.trainutils.a.a(this.f.E(), this.l.getText().toString().trim(), this.f.J(), this.f.M(), true, new com.mulo.b.a(this, progressDialog){
            final /* synthetic */ ProgressDialog a;
            final /* synthetic */ PeopleSharing b;
            {
                this.b = peopleSharing;
                this.a = progressDialog;
            }

            public void a() {
                n.a((Dialog)this.a);
            }

            public void a(byte[] arrby, byte[] arrby2, Object object) {
                String string = new String(arrby);
                PeopleSharing.a(this.b, string, this.a);
            }
        }, this.h());
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        if (n2 == 2345 && n3 == -1) {
            String string = GoogleLoginActivity.d((Context)this);
            GoogleLoginActivity.f((Context)this);
            String string2 = GoogleLoginActivity.e((Context)this);
            this.i = string;
            this.j = string2;
            this.a(string, string2);
            return;
        }
        if (n2 == 151 && n3 == -1) {
            String string = ((Credential)intent.getParcelableExtra("com.google.android.gms.credentials.Credential")).a();
            EditText editText = this.l;
            if (editText != null && this.n != null) {
                editText.setText((CharSequence)TraceTrainUI2.d(string));
                this.n.performClick();
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492900);
        this.d();
    }

    protected void onResume() {
        super.onResume();
        this.e();
    }

}

