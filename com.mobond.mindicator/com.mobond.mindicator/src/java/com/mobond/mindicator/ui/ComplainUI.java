/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.widget.TextView
 *  com.mobond.mindicator.ui.n
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.mobond.mindicator.ui.n;
import java.util.ArrayList;

public class ComplainUI
extends Activity {
    String a;
    String b;
    String c = "Not compulsory";
    TextView d;
    private final int e = 1;
    private Uri f;

    private void a(Intent intent, String string, String string2, String string3, String string4) {
        intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        this.b(intent, string, string2, string3, string4);
    }

    private void b(Intent intent, String string, String string2, String string3, String string4) {
        intent.setType("application/octet-stream");
        String[] arrstring = new String[]{this.b};
        intent.putExtra("android.intent.extra.EMAIL", arrstring);
        if (this.f != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)this.f);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Complaint [m-Indicator]: ");
        stringBuilder.append(string3);
        String string5 = stringBuilder.toString();
        intent.putExtra("android.intent.extra.SUBJECT", string5);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Dear Sir/Madam,\n\n");
        stringBuilder2.append(string4);
        stringBuilder2.append("\n\nThank you.\n-");
        stringBuilder2.append(string);
        stringBuilder2.append("\nSent using m-Indicator\n\nContact details of complainant:\nName: ");
        stringBuilder2.append(string);
        stringBuilder2.append("\nPhone Number: ");
        stringBuilder2.append(string2);
        intent.putExtra("android.intent.extra.TEXT", stringBuilder2.toString());
        intent.putExtra("android.intent.extra.SUBJECT", string5);
        this.startActivity(intent);
        this.finish();
    }

    /*
     * Exception decompiling
     */
    public void a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl54 : ALOAD_0 : trying to set 1 previously set to 0
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
        Log.d((String)"ComplainUI", (String)"onActivityResult: 111");
        if (n3 == -1) {
            Log.d((String)"ComplainUI", (String)"onActivityResult: 222");
            if (n2 == 1) {
                Log.d((String)"ComplainUI", (String)"onActivityResult: 333");
                this.f = intent.getData();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onActivityResult: 444");
                stringBuilder.append(this.f.toString());
                Log.d((String)"ComplainUI", (String)stringBuilder.toString());
                this.d.setText((CharSequence)this.f.getPath());
            }
        }
    }

    public void onAttachPhotoButtonClicked(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        this.startActivityForResult(Intent.createChooser((Intent)intent, (CharSequence)"Select Picture"), 1);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492956);
        this.a = this.getIntent().getExtras().getString("selected_route");
        if (this.a.equals((Object)"MM1WD")) {
            this.setTitle((CharSequence)"Complain To: Mumbai Metro Authority");
            this.b = "customercare@reliancemumbaimetro.com";
        } else if (this.a.equals((Object)"NMMT")) {
            this.setTitle((CharSequence)"Complain To: NMMT Authority");
            this.b = "nmmtmail@gmail.com";
        }
        this.d = (TextView)this.findViewById(2131296972);
    }

    public void onRemovePhotoButtonClicked(View view) {
        this.d.setText((CharSequence)this.c);
        this.f = null;
        n.d((Context)this, (String)"Picture removed.");
    }

    public void onSendButtonClicked(View view) {
        this.a();
    }
}

