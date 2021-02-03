/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.Toast
 *  com.google.android.gms.auth.api.signin.GoogleSignInAccount
 *  com.google.android.gms.auth.api.signin.GoogleSignInOptions
 *  com.google.android.gms.auth.api.signin.GoogleSignInOptions$a
 *  com.google.android.gms.auth.api.signin.a
 *  com.google.android.gms.auth.api.signin.c
 *  com.google.android.gms.common.api.b
 *  com.google.android.gms.common.e
 *  com.google.android.gms.d.k
 *  com.mulo.b.c
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.e;
import com.google.android.gms.d.k;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mulo.b.c;

public class GoogleLoginActivity
extends Activity {
    private static final String d = "GoogleLoginActivity";
    boolean a = false;
    b b;
    com.google.android.gms.auth.api.signin.c c;
    private ProgressDialog e;

    private void a() {
        this.startActivityForResult(this.c.a(), 9001);
        this.e.show();
    }

    private void a(GoogleSignInAccount googleSignInAccount) {
        this.b.b("gplus_isRegistered", true);
        this.b.b("gplus_userName", googleSignInAccount.e());
        this.b.b("gplus_userEmail", googleSignInAccount.c());
        this.b.b("gplus_userGPlusID", googleSignInAccount.a());
        this.b();
    }

    public static boolean a(Context context) {
        return a.a(context).c("gplus_isRegistered");
    }

    private void b() {
        this.setResult(-1, new Intent());
        this.finish();
    }

    public static boolean b(Context context) {
        return a.a(context).c("isMtracker");
    }

    public static void c(Context context) {
        a.a(context).b("isMtracker", true);
    }

    private boolean c() {
        e e2 = e.a();
        int n2 = e2.a((Context)this);
        if (n2 != 0) {
            if (e2.a(n2)) {
                Dialog dialog = e2.a((Activity)this, n2, 1001);
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();
                return false;
            }
            Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"This device doesn't support Play services, App will not work normally", (int)1).show();
            this.finish();
            return false;
        }
        return true;
    }

    public static String d(Context context) {
        return a.a(context).b("gplus_userName");
    }

    public static String e(Context context) {
        return a.a(context).b("gplus_userEmail");
    }

    public static String f(Context context) {
        return a.a(context).b("gplus_userGPlusID");
    }

    @SuppressLint(value={"RestrictedApi"})
    public static void g(Context context) {
        b b2 = a.a(context);
        b2.d("gplus_isRegistered");
        b2.d("gplus_userName");
        b2.d("gplus_userEmail");
        b2.d("gplus_userGPlusID");
        b2.d("gplus_userimageurl");
        b2.d("gplus_ageRange");
        b2.d("gplus_gender");
        b2.d("displayname");
        b2.d("blessing");
        b2.d("mobile");
        b2.d("isMtracker");
        b2.d("rank");
        b2.d("ismobileverified");
        b2.d("accessmobilenumber");
        b2.d("md5registered");
        b2.d("md5hashid");
        f.f(context);
        com.google.android.gms.auth.api.signin.a.a((Context)context, (GoogleSignInOptions)new GoogleSignInOptions.a(GoogleSignInOptions.f).b().d()).b();
    }

    public void finish() {
        if (this.e.isShowing()) {
            this.e.dismiss();
        }
        super.finish();
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        if (n2 == 9001) {
            if (n3 == -1) {
                k k2 = com.google.android.gms.auth.api.signin.a.a((Intent)intent);
                try {
                    this.a((GoogleSignInAccount)k2.a(com.google.android.gms.common.api.b.class));
                    return;
                }
                catch (com.google.android.gms.common.api.b b2) {
                    b2.printStackTrace();
                    Toast.makeText((Context)this, (CharSequence)"Google sign in failed", (int)0).show();
                    this.e.dismiss();
                    this.finish();
                    return;
                }
            }
            this.e.dismiss();
            this.finish();
            return;
        }
        if (n2 == 1001 && n3 == 0) {
            Toast.makeText((Context)this, (CharSequence)"Google Play Services must be installed.", (int)0).show();
            this.finish();
        }
    }

    @SuppressLint(value={"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 26) {
            this.setRequestedOrientation(1);
        }
        this.setContentView(2131493004);
        this.b = a.a(this);
        this.e = new ProgressDialog((Context)this, 5);
        this.e.setMessage((CharSequence)"Just a moment...");
        this.c = com.google.android.gms.auth.api.signin.a.a((Activity)this, (GoogleSignInOptions)new GoogleSignInOptions.a(GoogleSignInOptions.f).a(this.getString(2131755144)).b().d());
        this.a();
        c.a((Activity)this);
    }

    public void onLoginClicked(View view) {
        if (this.c()) {
            this.a();
            c.a((Activity)this);
        }
    }

    protected void onPause() {
        super.onPause();
        this.findViewById(2131296401).setBackgroundColor(Color.parseColor((String)"#00000000"));
    }

    protected void onResume() {
        super.onResume();
        if (!this.a) {
            this.a = true;
            this.c();
        }
        this.findViewById(2131296401).setBackgroundColor(Color.parseColor((String)"#EE222222"));
    }
}

