/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.Log
 *  com.mobond.mindicator.ui.train.fastestroute.RailRouteFinderSearchResultActivity
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.fastestroute.RailRouteFinderSearchResultActivity;
import com.mulo.a.d.b;
import com.mulo.a.d.i;
import com.mulo.a.d.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

class f
extends AsyncTask<String, String, String> {
    Activity a;
    ArrayList<String> b;
    String c;
    int d;
    boolean e;
    boolean f;
    boolean g;
    String h;
    String i;
    boolean j;
    int k;
    int l;
    boolean m = false;
    l n = null;
    private ProgressDialog o;

    public f(Activity activity, ArrayList<String> arrayList, String string, int n2, boolean bl, boolean bl2, boolean bl3, String string2, String string3, boolean bl4, int n3) {
        this.a = activity;
        this.b = arrayList;
        this.c = string;
        this.d = n2;
        this.e = bl;
        this.f = bl2;
        this.g = bl3;
        this.h = string2.toUpperCase();
        this.i = string3.toUpperCase();
        this.j = bl4;
        this.k = n3;
    }

    protected void a(String string) {
        this.o.dismiss();
        if (this.m) {
            ((RailRouteFinderSearchResultActivity)this.a).a(this.n, this.b);
        }
        if (this.j) {
            if (this.l > 0) {
                Activity activity = this.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("You saved ");
                stringBuilder.append(this.l);
                stringBuilder.append(" min");
                n.a(activity, stringBuilder.toString());
                return;
            }
            n.a(this.a, "No change");
        }
    }

    protected /* varargs */ void a(String ... arrstring) {
        this.o.setProgress(Integer.parseInt((String)arrstring[0]));
    }

    protected /* varargs */ String b(String ... arrstring) {
        try {
            if (this.f) {
                if (this.j) {
                    this.n = b.b(this.h, this.i, this.c, this.d, true, (Object)this.a);
                    l l2 = b.a(this.h, this.i, this.c, this.n.f, true, (Object)this.a);
                    if (l2.f == this.n.f) {
                        this.n = l2;
                    } else if (b.a(l2.f, this.n.f)) {
                        this.n = l2;
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(this.h);
                    stringBuilder.append("-");
                    stringBuilder.append(this.i);
                    stringBuilder.append("-");
                    stringBuilder.append(this.c);
                    stringBuilder.append("-");
                    stringBuilder.append(this.d);
                    Log.d((String)"GetNextConnectedTrain", (String)stringBuilder.toString());
                    this.n = b.b(this.h, this.i, this.c, this.d, false, (Object)this.a);
                }
            } else if (this.g) {
                this.n = this.j ? b.a(this.h, this.i, this.c, this.d, true, (Object)this.a) : b.a(this.h, this.i, this.c, this.d, false, (Object)this.a);
            }
            if (this.n != null && this.n.d != null && !this.n.d.isEmpty()) {
                if (this.j) {
                    this.l = this.k - this.n.b();
                }
                if (this.e) {
                    this.m = true;
                } else {
                    Intent intent = new Intent((Context)this.a, RailRouteFinderSearchResultActivity.class);
                    intent.putExtra("tm", this.d);
                    if (this.g) {
                        intent.putExtra("isdestsearch", true);
                    } else {
                        intent.putExtra("isdestsearch", false);
                    }
                    intent.putExtra("source_stn", this.h);
                    intent.putExtra("destination_stn", this.i);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("tr", (Serializable)this.n);
                    bundle.putSerializable("viaroutesArrayList", this.b);
                    intent.putExtras(bundle);
                    this.a.startActivity(intent);
                }
            } else {
                n.d((Context)this.a, "Error occurred");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.b((String[])arrobject);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((String)object);
    }

    protected void onPreExecute() {
        super.onPreExecute();
        this.o = new ProgressDialog((Context)this.a);
        this.o.setMessage((CharSequence)"Thinking..");
        this.o.setCancelable(false);
        this.o.show();
    }

    protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
        this.a((String[])arrobject);
    }
}

