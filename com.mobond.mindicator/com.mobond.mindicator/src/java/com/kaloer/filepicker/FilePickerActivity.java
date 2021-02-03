/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ListActivity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.ListView
 *  android.widget.TextView
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package com.kaloer.filepicker;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilePickerActivity
extends ListActivity {
    protected File a;
    protected ArrayList<File> b;
    protected c c;
    protected boolean d = false;
    protected String[] e;

    protected void a() {
        this.b.clear();
        a a2 = new a(this.e);
        File[] arrfile = this.a.listFiles((FilenameFilter)a2);
        if (arrfile != null && arrfile.length > 0) {
            for (File file : arrfile) {
                if (file.isHidden() && !this.d) continue;
                this.b.add((Object)file);
            }
            Collections.sort(this.b, (Comparator)new b());
        }
        this.setTitle((CharSequence)this.a.getPath());
        this.c.notifyDataSetChanged();
    }

    public void onBackPressed() {
        if (this.a.getParentFile() != null) {
            this.a = this.a.getParentFile();
            this.a();
            return;
        }
        super.onBackPressed();
    }

    /*
     * Exception decompiling
     */
    protected void onCreate(Bundle var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl117 : ALOAD_0 : trying to set 1 previously set to 0
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

    protected void onListItemClick(ListView listView, View view, int n2, long l2) {
        File file = (File)listView.getItemAtPosition(n2);
        if (file.isFile()) {
            Intent intent = new Intent();
            intent.putExtra("file_path", file.getAbsolutePath());
            this.setResult(-1, intent);
            this.finish();
        } else {
            this.a = file;
            this.a();
        }
        super.onListItemClick(listView, view, n2, l2);
    }

    protected void onResume() {
        this.a();
        super.onResume();
    }

    private class a
    implements FilenameFilter {
        private String[] b;

        public a(String[] arrstring) {
            this.b = arrstring;
        }

        public boolean accept(File file, String string) {
            if (new File(file, string).isDirectory()) {
                return true;
            }
            String[] arrstring = this.b;
            if (arrstring != null && arrstring.length > 0) {
                String[] arrstring2;
                for (int i2 = 0; i2 < (arrstring2 = this.b).length; ++i2) {
                    if (!string.endsWith(arrstring2[i2])) continue;
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    private class b
    implements Comparator<File> {
        private b() {
        }

        public int a(File file, File file2) {
            if (file == file2) {
                return 0;
            }
            if (file.isDirectory() && file2.isFile()) {
                return -1;
            }
            if (file.isFile() && file2.isDirectory()) {
                return 1;
            }
            return file.getName().compareToIgnoreCase(file2.getName());
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((File)object, (File)object2);
        }
    }

    private class c
    extends ArrayAdapter<File> {
        private List<File> b;

        public c(Context context, List<File> list) {
            super(context, 2131492998, 16908308, list);
            this.b = list;
        }

        public View getView(int n2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131492998, viewGroup, false);
            }
            File file = (File)this.b.get(n2);
            ImageView imageView = (ImageView)view.findViewById(2131296781);
            TextView textView = (TextView)view.findViewById(2131296782);
            textView.setSingleLine(true);
            textView.setText((CharSequence)file.getName());
            if (file.isFile()) {
                imageView.setImageResource(2131230990);
                return view;
            }
            imageView.setImageResource(2131230995);
            return view;
        }
    }

}

