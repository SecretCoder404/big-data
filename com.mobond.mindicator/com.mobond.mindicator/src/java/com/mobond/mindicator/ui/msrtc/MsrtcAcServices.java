/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  com.crashlytics.android.Crashlytics
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Hashtable
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.msrtc;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.crashlytics.android.Crashlytics;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.msrtc.BusList;
import com.mobond.mindicator.ui.msrtc.MsrtcAcServices;
import com.mobond.mindicator.ui.msrtc.MsrtcMainActivity;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

public class MsrtcAcServices
extends e {
    b a;
    LinearLayout b;
    String c;
    private View d;

    public void exitac(View view) {
        this.finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493066);
        this.a = com.mobond.mindicator.a.a((Activity)this);
        this.a.a("msrtc_language", "marathi");
        this.b = (LinearLayout)this.findViewById(2131297361);
        this.d = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/7359580046", "167101606757479_1239841936150102", "ca-app-pub-5449278086868932/6126093727", "167101606757479_1235754379892191", 3, null);
        String[] arrstring = new String[]{"DADAR - PUNE", "THANE - PUNE", "BORIVALI - PUNE", "NASHIK - PUNE", "AURANGABAD - PUNE", "KOLHAPUR - PUNE", "SANGLI - PUNE"};
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String[] arrstring2 = arrstring[i2].split("-");
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.getApplicationContext()).inflate(2131493065, (ViewGroup)this.b, false);
            TextView textView = (TextView)viewGroup.findViewById(2131297673);
            TextView textView2 = (TextView)viewGroup.findViewById(2131297674);
            String string = arrstring2[0].trim();
            String string2 = arrstring2[1].trim();
            textView.setText((CharSequence)arrstring[i2]);
            textView2.setText((CharSequence)String.format((String)"%s - %s", (Object[])new Object[]{string2, string}));
            if (MsrtcMainActivity.d == null) {
                MsrtcMainActivity.d = new Hashtable();
                try {
                    MsrtcMainActivity.a((Activity)this);
                }
                catch (Exception exception) {
                    Crashlytics.logException((Throwable)exception);
                }
            }
            short s2 = (Short)MsrtcMainActivity.d.get((Object)string);
            short s3 = (Short)MsrtcMainActivity.d.get((Object)string2);
            textView.setOnClickListener(new View.OnClickListener(this, s2, s3, textView){
                final /* synthetic */ short a;
                final /* synthetic */ short b;
                final /* synthetic */ TextView c;
                final /* synthetic */ MsrtcAcServices d;
                {
                    this.d = msrtcAcServices;
                    this.a = s2;
                    this.b = s3;
                    this.c = textView;
                }

                public void onClick(View view) {
                    AsyncTask<Object, Integer, Boolean> asyncTask = new AsyncTask<Object, Integer, Boolean>(){
                        Dialog a;
                        String b = "A";
                        Short c;
                        Short d;

                        protected /* varargs */ Boolean a(Object ... arrobject) {
                            try {
                                this.c = (short)((Short)arrobject[0]);
                                this.d = (short)((Short)arrobject[1]);
                                Integer n2 = (Integer)arrobject[2];
                                this.b = (String)arrobject[3];
                                MsrtcAcServices.this.c = (String)arrobject[4];
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("src ");
                                stringBuilder.append((Object)this.c);
                                stringBuilder.append("dest");
                                stringBuilder.append((Object)this.d);
                                stringBuilder.append(" bus_type ");
                                stringBuilder.append((Object)n2);
                                Log.d((String)"msrtcatob", (String)stringBuilder.toString());
                                com.mulo.a.c.a.a((Activity)MsrtcAcServices.this).b((Activity)MsrtcAcServices.this);
                                if (this.b.equals((Object)"A")) {
                                    BusList.a = com.mulo.a.c.a.a((Activity)MsrtcAcServices.this).a(this.c, n2);
                                } else if (this.b.equals((Object)"AB")) {
                                    BusList.a = com.mulo.a.c.a.a((Activity)MsrtcAcServices.this).b(this.c, this.d, n2);
                                }
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                            }
                            return true;
                        }

                        protected void a(Boolean bl) {
                            this.a.dismiss();
                            if (BusList.a != null && BusList.a.size() > 0) {
                                Intent intent = new Intent((Context)MsrtcAcServices.this, BusList.class);
                                intent.putExtra("source_index", (Serializable)this.c);
                                intent.putExtra("destination_index", (Serializable)this.d);
                                intent.putExtra("stop_name", MsrtcAcServices.this.c);
                                intent.putExtra("search_type", "AB");
                                intent.putExtra("bus_type", 0);
                                intent.putExtra("ac", "true");
                                MsrtcAcServices.this.startActivity(intent);
                            }
                        }

                        protected /* varargs */ void a(Integer ... arrinteger) {
                            super.onProgressUpdate((Object[])arrinteger);
                        }

                        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
                            return this.a(arrobject);
                        }

                        protected /* synthetic */ void onPostExecute(Object object) {
                            this.a((Boolean)object);
                        }

                        protected void onPreExecute() {
                            super.onPreExecute();
                            this.a = new Dialog((Context)MsrtcAcServices.this);
                            this.a.requestWindowFeature(1);
                            this.a.setContentView(2131492976);
                            this.a.setCancelable(false);
                            this.a.show();
                        }

                        protected /* synthetic */ void onProgressUpdate(Object[] arrobject) {
                            this.a((Integer[])arrobject);
                        }
                    };
                    java.util.concurrent.Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                    Object[] arrobject = new Object[]{this.a, this.b, 0, "AB", this.c.getText().toString()};
                    asyncTask.executeOnExecutor(executor, arrobject);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener(this, s3, s2, textView2){
                final /* synthetic */ short a;
                final /* synthetic */ short b;
                final /* synthetic */ TextView c;
                final /* synthetic */ MsrtcAcServices d;
                {
                    this.d = msrtcAcServices;
                    this.a = s2;
                    this.b = s3;
                    this.c = textView;
                }

                public void onClick(View view) {
                    AsyncTask<Object, Integer, Boolean> asyncTask = new /* invalid duplicate definition of identical inner class */;
                    java.util.concurrent.Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                    Object[] arrobject = new Object[]{this.a, this.b, 0, "AB", this.c.getText().toString()};
                    asyncTask.executeOnExecutor(executor, arrobject);
                }
            });
            this.b.addView((View)viewGroup);
        }
    }

    protected void onDestroy() {
        c.c(this.d);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.d);
    }

    public void onResume() {
        super.onResume();
        c.a(this.d);
    }

}

