/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.TextView
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.Class
 *  java.lang.String
 */
package com.mobond.mindicator.ui.train;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.ExpandableHeightListView;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.train.SelectDirectionUI;
import com.mobond.mindicator.ui.train.j;

public class SelectLineUI
extends BaseAppCompatActivity {
    private static Toolbar h;
    b a;
    boolean b = false;
    String c;
    TextView d;
    View e;
    j f;
    ExpandableHeightListView g;

    public void a(String string) {
        Intent intent = new Intent((Context)this, SelectDirectionUI.class);
        intent.putExtra("selected_route", string);
        this.startActivityForResult(intent, 0);
    }

    /*
     * Exception decompiling
     */
    @SuppressLint(value={"NewApi"})
    @Override
    protected void onCreate(Bundle var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl176 : ALOAD_0 : trying to set 1 previously set to 0
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

    protected void onDestroy() {
        c.c(this.e);
        super.onDestroy();
    }

    public void onPause() {
        c.b(this.e);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f.b();
        c.a(this.e);
    }
}

