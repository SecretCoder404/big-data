/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.Toast
 *  androidx.core.content.FileProvider
 *  com.mobond.mindicator.ui.indianrail.IRActivity
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package com.mobond.mindicator.ui.indianrail.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.mobond.mindicator.ui.indianrail.IRActivity;
import java.io.File;

public class b {
    private static boolean a;

    public static void a(final Activity activity, View view) {
        if (!a) {
            IRActivity.a((Context)activity, (String)"SCREENSHOT_CLICKED");
            a = true;
            View view2 = view.getRootView().findViewById(16908290);
            final Bitmap bitmap = Bitmap.createBitmap((int)view2.getWidth(), (int)view2.getHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            view2.draw(canvas);
            canvas.setBitmap(null);
            new Thread(new Runnable(){

                /*
                 * Exception decompiling
                 */
                public void run() {
                    // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                    // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl44 : ICONST_0 : trying to set 1 previously set to 0
                    // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

            }).start();
        }
    }

    static /* synthetic */ boolean a(boolean bl) {
        a = bl;
        return bl;
    }

    private static void b(Context context) {
        File file = context.getCacheDir();
        if (file.exists()) {
            file.delete();
        }
    }

}

