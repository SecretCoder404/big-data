/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.Editable
 *  android.util.Log
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.RadioButton
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.core.app.a
 *  androidx.core.content.FileProvider
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URLDecoder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
package com.mobond.mindicator.ui.jobs;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.mobond.mindicator.a;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.i;
import com.mobond.mindicator.ui.jobs.JobApplicationFormUI;
import com.mobond.mindicator.ui.n;
import com.mulo.b.c;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JobApplicationFormUI
extends i
implements com.mulo.b.a {
    String a = "M";
    String b;
    String c;
    TextView d;
    String e = "Not compulsory";
    String f = "";
    private final int g = 1;

    private void a(Intent intent, com.mulo.a.b.a a2, File file) {
        intent.setType("text/html");
        Iterator iterator = this.getPackageManager().queryIntentActivities(intent, 0).iterator();
        String string = null;
        while (iterator.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo)iterator.next();
            if (!resolveInfo.activityInfo.packageName.equals((Object)"com.google.android.gm") || (string = resolveInfo.activityInfo.name) == null || string.isEmpty()) continue;
        }
        if (string != null) {
            intent.setClassName("com.google.android.gm", string);
        }
        this.b(intent, a2, file);
    }

    private void b(Intent intent, com.mulo.a.b.a a2, File file) {
        intent.setType("application/octet-stream");
        String[] arrstring = new String[]{this.c};
        intent.putExtra("android.intent.extra.EMAIL", arrstring);
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getApplicationContext().getPackageName());
        stringBuilder.append(".provider");
        Uri uri = FileProvider.a((Context)this, (String)stringBuilder.toString(), (File)file);
        arrayList.add((Object)uri);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        Log.d((String)"JobApplicationFormUI", (String)uri.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Resume: ");
        stringBuilder2.append(a2.a);
        intent.putExtra("android.intent.extra.SUBJECT", stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Dear Sir/Madam,\n\nWith reference to your advertisement posted on Jobs Indicator I am attaching my resume with this email.Summary of my profile is given below.\n\nName: ");
        stringBuilder3.append(a2.a);
        stringBuilder3.append("\nEducation: ");
        stringBuilder3.append(a2.b);
        stringBuilder3.append("\nExperience in years: ");
        stringBuilder3.append(a2.c);
        stringBuilder3.append("\nExperience in domain: ");
        stringBuilder3.append(a2.d);
        stringBuilder3.append("\nBirth Year: ");
        stringBuilder3.append(a2.e);
        stringBuilder3.append("\nHome Location: ");
        stringBuilder3.append(a2.f);
        String string = stringBuilder3.toString();
        if (a2.g != null && !a2.g.trim().equals((Object)"")) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string);
            stringBuilder4.append("\nExpected Salary: ");
            stringBuilder4.append(a2.g);
            string = stringBuilder4.toString();
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(string);
        stringBuilder5.append("\nEmail id: ");
        stringBuilder5.append(a2.h);
        stringBuilder5.append("\nPhone Number: ");
        stringBuilder5.append(a2.i);
        stringBuilder5.append("\n\nThank you.\n-");
        stringBuilder5.append(a2.a);
        stringBuilder5.append("\nSent using Jobs Indicator, www.mobond.com");
        intent.putExtra("android.intent.extra.TEXT", stringBuilder5.toString());
        this.startActivity(intent);
        this.finish();
    }

    private com.mulo.a.b.a d() {
        String string = ((EditText)this.findViewById(2131297004)).getText().toString();
        String string2 = ((EditText)this.findViewById(2131296706)).getText().toString();
        String string3 = ((EditText)this.findViewById(2131296735)).getText().toString();
        String string4 = ((EditText)this.findViewById(2131296736)).getText().toString();
        String string5 = ((EditText)this.findViewById(2131296403)).getText().toString();
        String string6 = ((EditText)this.findViewById(2131296847)).getText().toString();
        String string7 = ((EditText)this.findViewById(2131296734)).getText().toString();
        String string8 = ((EditText)this.findViewById(2131296707)).getText().toString();
        String string9 = ((EditText)this.findViewById(2131297081)).getText().toString();
        String string10 = ((TextView)this.findViewById(2131296972)).getText().toString();
        String string11 = string10.equals((Object)this.e) ? "" : string10;
        com.mulo.a.b.a a2 = new com.mulo.a.b.a(string, string2, string3, string4, string5, string6, string7, string8, string9, this.a, string11);
        a.a(this).a(a2);
        return a2;
    }

    /*
     * Exception decompiling
     */
    private void e() {
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

    @Override
    public void a() {
        Toast.makeText((Context)this.getBaseContext(), (CharSequence)"Error Occured.", (int)0).show();
    }

    @Override
    public void a(byte[] arrby, byte[] arrby2, Object object) {
        this.c();
    }

    public void b() {
        com.mulo.a.b.a a2 = this.d();
        com.mulo.b.h h2 = new com.mulo.b.h();
        h2.a("jobid", this.b);
        h2.a("employeremail", this.c);
        h2.a("name", a2.a);
        h2.a("edu", a2.b);
        h2.a("exp", a2.c);
        h2.a("expind", a2.d);
        h2.a("birthyr", a2.e);
        h2.a("home", a2.f);
        h2.a("expectedsalary", a2.g);
        h2.a("email", a2.h);
        h2.a("phone", a2.i);
        h2.a("gender", a2.j);
        c.a("http://mobondhrd.appspot.com/jobsformsubmitservlet?", h2, null, this, null, this, this.getApplicationContext(), null);
    }

    /*
     * Exception decompiling
     */
    public void c() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl47 : ALOAD_0 : trying to set 1 previously set to 0
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

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n3 == -1) {
            if (n2 != 1) {
                return;
            }
            if (intent.hasExtra("file_path")) {
                File file = new File(intent.getStringExtra("file_path"));
                this.d.setText((CharSequence)file.getPath());
                this.d();
                n.d((Context)this, "Resume Attached.");
            }
        }
    }

    public void onApplyButtonClicked(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this).setIcon(17301543).setTitle((CharSequence)"Confirm");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Do you really want to apply for ");
        stringBuilder.append(this.f);
        stringBuilder.append("?");
        builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)"Yes", new DialogInterface.OnClickListener(this){
            final /* synthetic */ JobApplicationFormUI a;
            {
                this.a = jobApplicationFormUI;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                this.a.b();
            }
        }).setNegativeButton((CharSequence)"No", null).show();
    }

    public void onAttachResumeButtonClicked(View view) {
        if (h.a((Context)this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.e();
            return;
        }
        h.a(this, "STORAGE", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
    }

    public void onBackPressed() {
        this.d();
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493058);
        this.setTitle((CharSequence)"JOB APPLICATION FORM");
        try {
            this.f = this.getIntent().getExtras().getString("job_header");
            this.f = URLDecoder.decode((String)this.f, (String)"UTF-8");
            this.b = this.getIntent().getExtras().getString("jobid");
            this.b = URLDecoder.decode((String)this.b, (String)"UTF-8");
            this.c = this.getIntent().getExtras().getString("employeremail");
            this.c = URLDecoder.decode((String)this.c, (String)"UTF-8");
        }
        catch (Exception exception) {}
        ((TextView)this.findViewById(2131296903)).setText((CharSequence)this.f);
        com.mulo.a.b.a a2 = a.a(this).z();
        if (a2.a != null) {
            ((EditText)this.findViewById(2131297004)).setText((CharSequence)a2.a);
        }
        if (a2.b != null) {
            ((EditText)this.findViewById(2131296706)).setText((CharSequence)a2.b);
        }
        if (a2.c != null) {
            ((EditText)this.findViewById(2131296735)).setText((CharSequence)a2.c);
        }
        if (a2.d != null) {
            ((EditText)this.findViewById(2131296736)).setText((CharSequence)a2.d);
        }
        if (a2.e != null) {
            ((EditText)this.findViewById(2131296403)).setText((CharSequence)a2.e);
        }
        if (a2.f != null) {
            ((EditText)this.findViewById(2131296847)).setText((CharSequence)a2.f);
        }
        if (a2.g != null) {
            ((EditText)this.findViewById(2131296734)).setText((CharSequence)a2.g);
        }
        if (a2.h != null) {
            ((EditText)this.findViewById(2131296707)).setText((CharSequence)a2.h);
        }
        if (a2.i != null) {
            ((EditText)this.findViewById(2131297081)).setText((CharSequence)a2.i);
        }
        if (a2.j != null) {
            if (a2.j.equals((Object)"M")) {
                RadioButton radioButton = (RadioButton)this.findViewById(2131297145);
                RadioButton radioButton2 = (RadioButton)this.findViewById(2131297143);
                radioButton.setChecked(true);
                radioButton2.setChecked(false);
            } else if (a2.j.equals((Object)"F")) {
                RadioButton radioButton = (RadioButton)this.findViewById(2131297145);
                RadioButton radioButton3 = (RadioButton)this.findViewById(2131297143);
                radioButton.setChecked(false);
                radioButton3.setChecked(true);
            }
        }
        if (a2.k != null && !a2.k.trim().equals((Object)"")) {
            ((TextView)this.findViewById(2131296972)).setText((CharSequence)a2.k);
        }
        this.d = (TextView)this.findViewById(2131296972);
    }

    public void onGenderFemaleButtonClicked(View view) {
        this.a = "F";
        RadioButton radioButton = (RadioButton)this.findViewById(2131297145);
        RadioButton radioButton2 = (RadioButton)this.findViewById(2131297143);
        radioButton.setChecked(false);
        radioButton2.setChecked(true);
    }

    public void onGenderMaleButtonClicked(View view) {
        this.a = "M";
        RadioButton radioButton = (RadioButton)this.findViewById(2131297145);
        RadioButton radioButton2 = (RadioButton)this.findViewById(2131297143);
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
    }

    public void onRemoveResumeButtonClicked(View view) {
        this.d.setText((CharSequence)this.e);
        n.d((Context)this, "Resume removed.");
        this.d();
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 100) {
            if (arrn.length > 0 && arrn[0] == 0) {
                this.e();
                return;
            }
            if (!androidx.core.app.a.a((Activity)this, (String)arrstring[0])) {
                a.a(this).b(Arrays.toString((Object[])arrstring), true);
            }
        }
    }
}

