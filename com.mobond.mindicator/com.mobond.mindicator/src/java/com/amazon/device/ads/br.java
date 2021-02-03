/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.wifi.WifiInfo
 *  android.net.wifi.WifiManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.WindowManager
 *  com.amazon.device.ads.cy
 *  java.lang.CharSequence
 *  java.lang.ExceptionInInitializerError
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.bl;
import com.amazon.device.ads.bu;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ef;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ek;
import com.amazon.device.ads.fb;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

class br {
    private static final String a = "br";
    private String b = Build.MANUFACTURER;
    private String c = Build.MODEL;
    private String d = Build.VERSION.RELEASE;
    private ek e;
    private String f;
    private boolean g;
    private boolean h;
    private String i;
    private boolean j;
    private boolean k;
    private String l;
    private boolean m;
    private boolean n;
    private String o;
    private float p;
    private String q;
    private String r;
    private String s;
    private ef t;
    private ef u;
    private final cy v;
    private final cx w;
    private final bc x;

    public br(Context context, ek ek2) {
        this(context, ek2, cx.a(), new cz(), new bc());
    }

    br(Context context, ek ek2, cx cx2, cz cz2, bc bc2) {
        this.v = cz2.a(a);
        this.w = cx2;
        this.x = bc2;
        this.A();
        this.b(context);
        this.z();
        this.c(context);
        this.e = ek2;
    }

    private void A() {
        String string = Locale.getDefault().getCountry();
        if (string == null || string.length() <= 0) {
            string = null;
        }
        this.r = string;
    }

    private void b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        if (telephonyManager != null) {
            String string = telephonyManager.getNetworkOperatorName();
            if (string == null || string.length() <= 0) {
                string = null;
            }
            this.q = string;
        }
    }

    private void c(Context context) {
        if (this.b.equals((Object)"motorola") && this.c.equals((Object)"MB502")) {
            this.p = 1.0f;
        } else {
            WindowManager windowManager = (WindowManager)context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.p = displayMetrics.scaledDensity;
        }
        this.o = Float.toString((float)this.p);
    }

    private void u() {
        if (!this.h) {
            this.a();
        }
    }

    private void v() {
        if (!this.k) {
            this.w();
        }
    }

    /*
     * Exception decompiling
     */
    private void w() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl11 : ALOAD_1 : trying to set 1 previously set to 0
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

    private void x() {
        if (!this.n) {
            this.y();
        }
    }

    private void y() {
        String string = Settings.Secure.getString((ContentResolver)this.w.k().getContentResolver(), (String)"android_id");
        if (!eh.a(string) && !string.equalsIgnoreCase("9774d56d682e549c")) {
            this.l = fb.a(eh.c(string));
        } else {
            this.l = null;
            this.m = true;
        }
        this.n = true;
    }

    private void z() {
        String string = Locale.getDefault().getLanguage();
        if (string == null || string.length() <= 0) {
            string = null;
        }
        this.s = string;
    }

    protected void a() {
        WifiInfo wifiInfo;
        block10 : {
            WifiManager wifiManager = (WifiManager)this.w.k().getSystemService("wifi");
            if (wifiManager != null) {
                try {
                    wifiInfo = wifiManager.getConnectionInfo();
                    break block10;
                }
                catch (ExceptionInInitializerError exceptionInInitializerError) {
                    this.v.c("Unable to get Wifi connection information: %s", new Object[]{exceptionInInitializerError});
                }
                catch (SecurityException securityException) {
                    this.v.c("Unable to get Wifi connection information: %s", new Object[]{securityException});
                }
            }
            wifiInfo = null;
        }
        if (wifiInfo == null) {
            this.f = null;
        } else {
            String string = wifiInfo.getMacAddress();
            if (string != null && string.length() != 0) {
                if (!Pattern.compile((String)"((([0-9a-fA-F]){1,2}[-:]){5}([0-9a-fA-F]){1,2})").matcher((CharSequence)string).find()) {
                    this.f = null;
                    this.g = true;
                } else {
                    this.f = fb.a(eh.c(string));
                }
            } else {
                this.f = null;
                this.g = true;
            }
        }
        this.h = true;
    }

    public void a(Context context) {
        this.e.a(context);
    }

    public void a(ek ek2) {
        this.e = ek2;
    }

    public void a(String string) {
        this.e.a(string);
    }

    public ef b(String string) {
        ef ef2;
        ef ef3;
        if (string.equals((Object)"portrait") && (ef3 = this.u) != null) {
            return ef3;
        }
        if (string.equals((Object)"landscape") && (ef2 = this.t) != null) {
            return ef2;
        }
        WindowManager windowManager = (WindowManager)this.w.k().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf((int)displayMetrics.widthPixels));
        stringBuilder.append("x");
        stringBuilder.append(String.valueOf((int)displayMetrics.heightPixels));
        String string2 = stringBuilder.toString();
        if (string.equals((Object)"portrait")) {
            this.u = new ef(string2);
            return this.u;
        }
        if (string.equals((Object)"landscape")) {
            this.t = new ef(string2);
            return this.t;
        }
        return new ef(string2);
    }

    public String b() {
        return "android";
    }

    public String c() {
        return this.b;
    }

    JSONObject c(String string) {
        JSONObject jSONObject = this.t();
        co.b(jSONObject, "orientation", string);
        co.b(jSONObject, "screenSize", this.b(string).toString());
        co.b(jSONObject, "connectionType", new bl(this.w).b());
        return jSONObject;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return "Android";
    }

    public String f() {
        return this.d;
    }

    public String g() {
        this.u();
        return this.f;
    }

    public boolean h() {
        this.u();
        return this.g;
    }

    public String i() {
        this.v();
        return this.i;
    }

    public boolean j() {
        this.v();
        return this.j;
    }

    public String k() {
        this.x();
        return this.l;
    }

    public boolean l() {
        this.x();
        return this.m;
    }

    public String m() {
        return this.q;
    }

    public String n() {
        return this.r;
    }

    public String o() {
        return this.s;
    }

    public String p() {
        return this.o;
    }

    public float q() {
        return this.p;
    }

    public String r() {
        return this.e.a();
    }

    public String s() {
        switch (bu.a(this.w.k(), this.x)) {
            default: {
                return "unknown";
            }
            case 1: 
            case 9: {
                return "portrait";
            }
            case 0: 
            case 8: 
        }
        return "landscape";
    }

    public JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        co.b(jSONObject, "make", this.c());
        co.b(jSONObject, "model", this.d());
        co.b(jSONObject, "os", this.e());
        co.b(jSONObject, "osVersion", this.f());
        co.b(jSONObject, "scalingFactor", this.p());
        co.b(jSONObject, "language", this.o());
        co.b(jSONObject, "country", this.n());
        co.b(jSONObject, "carrier", this.m());
        return jSONObject;
    }
}

