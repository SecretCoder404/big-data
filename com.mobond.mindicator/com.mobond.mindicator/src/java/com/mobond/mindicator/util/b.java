/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.util.Log
 *  com.google.android.gms.d.e
 *  com.google.android.gms.d.k
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.ab
 *  com.google.firebase.auth.ac
 *  com.google.firebase.auth.ac$a
 *  com.google.firebase.auth.ac$b
 *  com.google.firebase.auth.c
 *  com.google.firebase.auth.d
 *  com.google.firebase.d
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.TimeUnit
 */
package com.mobond.mindicator.util;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.d.e;
import com.google.android.gms.d.k;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ab;
import com.google.firebase.auth.ac;
import com.google.firebase.auth.c;
import com.google.firebase.auth.d;
import com.mobond.mindicator.ui.n;
import java.util.concurrent.TimeUnit;

public class b {
    private String a;
    private ac.a b;
    private FirebaseAuth c = FirebaseAuth.getInstance();
    private Activity d;
    private a e;
    private String f;
    private ProgressDialog g;
    private ac.b h = new ac.b(){

        public void a(ab ab2) {
            b.this.a(ab2);
        }

        public void a(com.google.firebase.d d2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onVerificationFailed ");
            stringBuilder.append(d2.getMessage());
            Log.d((String)"555", (String)stringBuilder.toString());
            n.a((Dialog)b.this.g);
            b.this.e.b("Something Went Wrong");
        }

        public void a(String string) {
            super.a(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onCodeAutoRetrievalTimeOut ");
            stringBuilder.append(string);
            Log.d((String)"555", (String)stringBuilder.toString());
        }

        public void a(String string, ac.a a2) {
            super.a(string, a2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onCodeSent ");
            stringBuilder.append(string);
            Log.d((String)"555", (String)stringBuilder.toString());
            b.this.a = string;
            b.this.b = a2;
            n.a((Dialog)b.this.g);
            b.this.e.b();
        }
    };

    public b(Activity activity) {
        this.d = activity;
        this.g = new ProgressDialog((Context)activity);
    }

    public static b a(Activity activity) {
        return new b(activity);
    }

    private void a(ab ab2) {
        this.g.setCancelable(false);
        this.g.setMessage((CharSequence)"Verifying OTP..");
        this.g.show();
        this.c.a((c)ab2).a(this.d, (e)new e<d>(){

            public void onComplete(k<d> k2) {
                if (k2.b()) {
                    n.a((Dialog)b.this.g);
                    b.this.e.a(b.this.f);
                    return;
                }
                n.a((Dialog)b.this.g);
                b.this.e.b("Invalid OTP");
            }
        });
    }

    public void a(String string) {
        this.a(ac.a((String)this.a, (String)string));
    }

    public void a(String string, a a2, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sendOTPtoMobile : ");
        stringBuilder.append(string);
        Log.d((String)"555", (String)stringBuilder.toString());
        this.e = a2;
        this.f = string2;
        this.g.setCancelable(false);
        this.g.setMessage((CharSequence)"Sending OTP..");
        this.g.show();
        ac.a().a(string, 60L, TimeUnit.SECONDS, this.d, this.h);
    }

    public static interface a {
        public void a(String var1);

        public void b();

        public void b(String var1);
    }

}

