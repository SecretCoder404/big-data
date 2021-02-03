/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.widget.Toast
 *  com.google.android.gms.common.GooglePlayServicesUtil
 *  com.google.android.gms.common.api.Scope
 *  com.google.android.gms.common.api.a
 *  com.google.android.gms.common.api.f
 *  com.google.android.gms.common.api.f$a
 *  com.google.android.gms.common.api.f$b
 *  com.google.android.gms.common.api.f$c
 *  com.google.android.gms.common.api.h
 *  com.google.android.gms.common.api.m
 *  com.google.android.gms.common.api.n
 *  com.google.android.gms.common.b
 *  com.google.android.gms.plus.a
 *  com.google.android.gms.plus.a.a.a
 *  com.google.android.gms.plus.a.a.a$a
 *  com.google.android.gms.plus.a.a.a$b
 *  com.google.android.gms.plus.b
 *  com.google.android.gms.plus.b$a
 *  com.google.android.gms.plus.c
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.login;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.plus.a.a.a;
import com.google.android.gms.plus.b;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mulo.b.c;

public class GPlusLoginActivity
extends Activity
implements f.b,
f.c,
n<b.a> {
    boolean a = false;
    boolean b = false;
    b c;
    private ProgressDialog d;
    private f e;
    private boolean f;
    private boolean g;
    private com.google.android.gms.common.b h;

    private void a() {
        this.e = new f.a((Context)this).a((f.b)this).a((f.c)this).a(com.google.android.gms.plus.c.b).a(new Scope("profile")).b();
    }

    /*
     * Exception decompiling
     */
    private void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl29 : RETURN : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    private void c() {
        this.setResult(-1, new Intent());
        this.finish();
    }

    private void d() {
        if (!this.e.k()) {
            this.g = true;
            this.b();
        }
    }

    private boolean e() {
        int n2 = GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)this);
        if (n2 != 0) {
            if (GooglePlayServicesUtil.isUserRecoverableError((int)n2)) {
                this.b(n2);
            } else {
                Toast.makeText((Context)this, (CharSequence)"This device doesn't support Play services, App will not work normally", (int)1).show();
                this.finish();
            }
            return false;
        }
        return true;
    }

    public void a(int n2) {
        this.e.e();
    }

    public void a(Bundle bundle) {
        com.google.android.gms.plus.c.e.a(this.e, null).a((n)this);
        this.g = false;
        com.google.android.gms.plus.a.a.a a2 = com.google.android.gms.plus.c.e.a(this.e);
        if (a2 != null) {
            String string = a2.b();
            String string2 = a2.a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ddd name: ");
            stringBuilder.append(string2);
            Log.d((String)"ddd", (String)stringBuilder.toString());
            String string3 = com.google.android.gms.plus.c.f.b(this.e);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ddd email: ");
            stringBuilder2.append(string3);
            Log.d((String)"ddd", (String)stringBuilder2.toString());
            String string4 = a2.e() ? a2.d().toString() : null;
            boolean bl = a2.g();
            String string5 = null;
            if (bl) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("");
                stringBuilder3.append(a2.f());
                string5 = stringBuilder3.toString();
            }
            String string6 = a2.c().b();
            com.google.android.gms.plus.c.f.a(this.e);
            this.e.g();
            this.c.b("gplus_isRegistered", true);
            this.c.b("gplus_userName", string2);
            this.c.b("gplus_userEmail", string3);
            this.c.b("gplus_userGPlusID", string);
            this.c.b("gplus_userimageurl", string6);
            this.c.b("gplus_ageRange", string4);
            this.c.b("gplus_gender", string5);
            this.c();
        }
    }

    public void a(b.a a2) {
    }

    void b(int n2) {
        GooglePlayServicesUtil.getErrorDialog((int)n2, (Activity)this, (int)1001).show();
    }

    public void b(com.google.android.gms.common.b b2) {
        Log.d((String)"ddd", (String)"ddd gggg 444");
        try {
            this.d.hide();
        }
        catch (Exception exception) {}
        if (!b2.a()) {
            GooglePlayServicesUtil.getErrorDialog((int)b2.c(), (Activity)this, (int)0).show();
            return;
        }
        if (!this.f) {
            this.h = b2;
            if (this.g) {
                this.b();
            }
        }
    }

    public void finish() {
        if (this.d.isShowing()) {
            this.d.dismiss();
        }
        super.finish();
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        Log.d((String)"ddd", (String)"ddd gggg 555");
        if (n2 == 0) {
            Log.d((String)"ddd", (String)"ddd gggg 666");
            if (n3 != -1) {
                Log.d((String)"ddd", (String)"ddd gggg 777");
                this.g = false;
                this.d.hide();
            }
            this.f = false;
            if (!this.e.k()) {
                this.e.e();
            }
        } else if (n2 == 1001 && n3 == 0) {
            Toast.makeText((Context)this, (CharSequence)"Google Play Services must be installed.", (int)0).show();
            this.finish();
        }
        super.onActivityResult(n2, n3, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493004);
        this.c = a.a(this);
        this.d = new ProgressDialog((Context)this, 5);
        this.d.setMessage((CharSequence)"Just a moment...");
        this.a();
        this.d();
        c.a(this);
    }

    public void onLoginClicked(View view) {
        this.d();
        c.a(this);
    }

    protected void onPause() {
        super.onPause();
        this.findViewById(2131296401).setBackgroundColor(Color.parseColor((String)"#00000000"));
    }

    protected void onResume() {
        super.onResume();
        if (!this.b) {
            this.b = true;
            this.e();
        }
        this.findViewById(2131296401).setBackgroundColor(Color.parseColor((String)"#EE222222"));
    }

    protected void onStart() {
        super.onStart();
        this.e.e();
    }

    protected void onStop() {
        super.onStop();
        if (this.e.j()) {
            this.e.g();
        }
    }
}

