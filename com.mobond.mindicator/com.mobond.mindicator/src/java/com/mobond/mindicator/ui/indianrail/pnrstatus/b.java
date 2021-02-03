/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.AsyncTask
 *  androidx.h.a.a
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Locale
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import androidx.h.a.a;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class b
extends AsyncTask<Void, Integer, String[]> {
    static String a;
    static boolean b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    @SuppressLint(value={"StaticFieldLeak"})
    private Context h;
    private String i = null;
    private c j;
    private long k;
    private long l;

    b(String string, String string2, String string3, String string4, String string5, Context context) {
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = string;
        this.h = context;
        this.j = new c(context);
        a = context.getResources().getString(2131755277);
        String string6 = this.j.h(string);
        if (!(string6.isEmpty() || string6.equals((Object)"Loading Failed") || string6.equals((Object)a))) {
            this.i = string6;
        }
        this.k = -1L;
        this.l = -1L;
        this.j.a(string, a);
    }

    private static long a(int n2, String string) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append("");
            Date date = simpleDateFormat.parse(stringBuilder.toString());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (string.contains((CharSequence)"AM") || string.contains((CharSequence)"PM")) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
                Date date2 = simpleDateFormat2.parse(simpleDateFormat2.format(new SimpleDateFormat("hh:mm a", Locale.ENGLISH).parse(string.trim())));
                calendar.set(11, date2.getHours());
                calendar.set(12, date2.getMinutes());
            }
            long l2 = calendar.getTimeInMillis();
            return l2;
        }
        catch (ParseException parseException) {
            return -1L;
        }
    }

    private String a(String string) {
        return new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(new SimpleDateFormat("hh:mm a", Locale.ENGLISH).parse(string.trim()));
    }

    private int b(String string) {
        try {
            Date date = new SimpleDateFormat("d MMM,yyyy", Locale.ENGLISH).parse(string);
            int n2 = Integer.parseInt((String)new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(date));
            return n2;
        }
        catch (ParseException parseException) {
            return 0;
        }
    }

    private boolean c(String string) {
        return string == null || string.equals((Object)"parseE") || string.equals((Object)"000") || string.equals((Object)"00");
        {
        }
    }

    public void a(String[] arrstring) {
        try {
            String string = arrstring[0];
            String string2 = arrstring[1];
            if (!this.c(string) && !this.c(string2) && this.k != -1L && this.l != -1L) {
                this.j.a(this.g, string, string2, this.k, this.l);
            } else if (this.i != null) {
                this.j.a(this.g, this.i);
            } else {
                this.j.a(this.g, "Loading Failed");
            }
            b = false;
            a.a((Context)this.h).a(new Intent("DEPARTURE_TIME_CHECK"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.j.close();
    }

    /*
     * Exception decompiling
     */
    protected /* varargs */ String[] a(Void ... var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl106 : IINC : trying to set 1 previously set to 0
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

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }

    public /* synthetic */ void onPostExecute(Object object) {
        this.a((String[])object);
    }

    public void onPreExecute() {
        b = true;
        a.a((Context)this.h).a(new Intent("DEPARTURE_TIME_CHECK"));
    }
}

