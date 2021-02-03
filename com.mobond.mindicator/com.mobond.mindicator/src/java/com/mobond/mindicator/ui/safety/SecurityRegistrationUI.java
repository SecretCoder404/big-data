/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.Editable
 *  android.util.Log
 *  android.view.View
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.RadioButton
 *  android.widget.TextView
 *  androidx.core.app.a
 *  com.mobond.mindicator.ui.WebUI
 *  com.mobond.mindicator.ui.multicity.a
 *  com.mulo.b.i
 *  com.mulo.util.g
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Random
 */
package com.mobond.mindicator.ui.safety;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.safety.SafetyUI2;
import com.mulo.b.i;
import com.mulo.util.e;
import com.mulo.util.g;
import java.util.Arrays;
import java.util.Random;

public class SecurityRegistrationUI
extends Activity {
    RadioButton a;
    RadioButton b;
    Button c;
    String d;
    String e;
    String f;
    String g;
    String h;
    BroadcastReceiver i;
    ProgressDialog j;
    TextView k;
    TextView l;

    public static String a(Context context) {
        b b2 = a.a(context);
        String string = b2.b("sr_name_key");
        String string2 = b2.b("sr_gender_key");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name:");
        stringBuilder.append(string);
        stringBuilder.append("-");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public String a() {
        int n2 = 1000 + new Random().nextInt(9000);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    void a(String string) {
        if (h.a((Context)this, "android.permission.SEND_SMS")) {
            this.h = this.a();
            this.b();
            this.c();
            i.b((Context)this, (String)string, (String)this.h);
            return;
        }
        h.a(this, "PHONE, CONTACT & SMS", SafetyUI2.a, 108);
    }

    public void b() {
        this.i = new BroadcastReceiver(){

            /*
             * Exception decompiling
             */
            public void onReceive(Context var1, Intent var2) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
                // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
                // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
                // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        this.registerReceiver(this.i, intentFilter);
    }

    void c() {
        this.j = new ProgressDialog((Context)this);
        this.j.setCancelable(false);
        this.j.setMessage((CharSequence)"Verifying mobile number..");
        this.j.setButton(-2, (CharSequence)"Cancel", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                SecurityRegistrationUI securityRegistrationUI = SecurityRegistrationUI.this;
                securityRegistrationUI.unregisterReceiver(securityRegistrationUI.i);
                dialogInterface.dismiss();
            }
        });
        this.j.show();
    }

    void d() {
        Intent intent = new Intent("android.intent.action.PICK", Uri.parse((String)"content://contacts"));
        intent.setType("vnd.android.cursor.dir/phone_v2");
        this.startActivityForResult(intent, 1);
    }

    void e() {
        b b2 = a.a(this);
        b2.b("sr_name_key", this.d);
        b2.b("sr_gender_key", this.e);
        b2.b("sr_your_mobile_number_key", this.f);
        b2.b("sr_relatives_mobile_number_key", this.g);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n2 == 1 && n3 == -1) {
            try {
                Uri uri = intent.getData();
                String[] arrstring = new String[]{"data1", "display_name"};
                Cursor cursor = this.getContentResolver().query(uri, arrstring, null, null, null);
                cursor.moveToFirst();
                String string = cursor.getString(cursor.getColumnIndex("data1")).replaceAll("[^+0-9]", "");
                this.k.setText((CharSequence)string);
                return;
            }
            catch (Exception exception) {
                Log.d((String)"SafetyUI", (String)"SafetyUI Exception in onActivityResult PICK_CONTACT", (Throwable)exception);
                n.d((Context)this, "Put phone number manually");
            }
        }
    }

    public void onClickHowItWorks(View view) {
        Intent intent = new Intent((Context)this, WebUI.class);
        g g2 = new g();
        e.a(g2.a(), g2);
        g2.a = "file:///android_asset/safety/safetyhowitworks.html";
        intent.putExtra("webuidatakey", g2.a());
        this.startActivity(intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493159);
        this.a = (RadioButton)this.findViewById(2131297145);
        this.b = (RadioButton)this.findViewById(2131297143);
        this.a.setChecked(false);
        this.b.setChecked(false);
        this.c = (Button)this.findViewById(2131297448);
        this.l = (TextView)this.findViewById(2131296533);
        this.l.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.k = (TextView)this.findViewById(2131297216);
        this.getWindow().setSoftInputMode(2);
        boolean bl = this.getIntent().hasExtra("sr_iseditfromprofile_key") ? this.getIntent().getExtras().getBoolean("sr_iseditfromprofile_key", false) : false;
        if (bl) {
            this.findViewById(2131296592).setVisibility(0);
            this.findViewById(2131296591).setVisibility(0);
            b b2 = a.a(this);
            this.d = b2.b("sr_name_key");
            this.e = b2.b("sr_gender_key");
            this.f = b2.b("sr_your_mobile_number_key");
            this.g = b2.b("sr_relatives_mobile_number_key");
            ((EditText)this.findViewById(2131297004)).setText((CharSequence)this.d);
            if (this.e.equals((Object)"M")) {
                this.a.setChecked(true);
                this.b.setChecked(false);
            } else if (this.e.equals((Object)"F")) {
                this.a.setChecked(false);
                this.b.setChecked(true);
            }
            ((EditText)this.findViewById(2131297692)).setText((CharSequence)this.f);
            ((EditText)this.findViewById(2131297216)).setText((CharSequence)this.g);
        }
    }

    public void onCreateShortcutClicked(View view) {
        n.c((Context)this, "Please wait..");
        com.mobond.mindicator.ui.multicity.a.a((Context)this, (String)"WOMEN_SAFETY", (String)"CREATE_SHORTCUT", (String)"SAFETY_SHORTCUT");
        SafetyUI2.a(this, true);
    }

    public void onGenderFemaleButtonClicked(View view) {
        this.e = "F";
        this.a.setChecked(false);
        this.b.setChecked(true);
    }

    public void onGenderMaleButtonClicked(View view) {
        this.e = "M";
        this.a.setChecked(true);
        this.b.setChecked(false);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 108) {
            int n3 = arrn.length;
            boolean bl = true;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4 = arrn[i2];
                bl = bl && n4 == 0;
            }
            if (bl) {
                this.a(this.f);
                return;
            }
            int n5 = arrstring.length;
            boolean bl2 = true;
            for (int i3 = 0; i3 < n5; ++i3) {
                String string = arrstring[i3];
                bl2 = bl2 && androidx.core.app.a.a((Activity)this, (String)string);
            }
            if (!bl2) {
                a.a(this).b(Arrays.toString((Object[])arrstring), true);
            }
        }
    }

    public void onSelectContactClicked(View view) {
        this.d();
    }

    public void onSubmitClicked(View view) {
        this.d = ((EditText)this.findViewById(2131297004)).getText().toString();
        this.f = ((EditText)this.findViewById(2131297692)).getText().toString();
        this.g = ((EditText)this.findViewById(2131297216)).getText().toString();
        String string = this.d;
        if (string != null && !string.trim().equals((Object)"")) {
            if (this.e != null) {
                String string2 = this.f;
                if (string2 != null && string2.length() >= 10) {
                    String string3 = this.g;
                    if (string3 != null && string3.length() >= 10) {
                        this.a(this.f);
                        return;
                    }
                    n.d((Context)this, "Enter correct mobile number");
                    return;
                }
                n.d((Context)this, "Enter correct mobile number");
                return;
            }
            n.d((Context)this, "Select gender");
            return;
        }
        n.d((Context)this, "Enter name");
    }

}

