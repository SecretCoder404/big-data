/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Log
 *  com.mobond.mindicator.util.e
 *  com.mulo.a.b.a
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.mobond.mindicator.fcm.a;
import com.mobond.mindicator.util.e;

public class b {
    Context a;
    private SharedPreferences b;
    private String c;

    public b(Context context) {
        this.a = context;
        this.c = "m-indicator";
        this.b = context.getSharedPreferences(this.c, 0);
    }

    public b(Context context, String string) {
        this.a = context;
        this.c = string;
        this.b = context.getSharedPreferences(string, 0);
    }

    private static String S() {
        return a.a("stationname_branding");
    }

    /*
     * Exception decompiling
     */
    public static String a(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl29.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    public static boolean a() {
        return Boolean.valueOf((String)a.a("get_pnr_from_railofyapi"));
    }

    public static String[] a(Context context) {
        String string = a.a("ad_priority_sequence");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ad_priority_seq ");
        stringBuilder.append(string);
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        return string.split(",");
    }

    public static boolean b() {
        return Boolean.valueOf((String)a.a("interstitial_tracetrain"));
    }

    public static String[] b(Context context) {
        return a.a("ad_priority_sequence_interstitial").split(",");
    }

    private void c(int n2) {
        SharedPreferences.Editor editor = this.b.edit();
        editor.putInt("count1", n2);
        editor.apply();
    }

    public static boolean c() {
        return Boolean.valueOf((String)a.a("interstitial_trainatstationui"));
    }

    public static String d() {
        return a.a("ads_tab");
    }

    public static boolean d(Context context) {
        return context.getString(2131755070).equalsIgnoreCase("m-Indicator");
    }

    public static boolean e() {
        return Boolean.valueOf((String)a.a("exit_native_enabled"));
    }

    public static boolean f() {
        String string = a.a("isshow_jobsindicator_onexit");
        return string != null && string.equals((Object)"true");
    }

    public static int g() {
        return Integer.parseInt((String)a.a("latest_app_version_date"));
    }

    public static boolean h() {
        return Boolean.valueOf((String)a.a("stop_ads_train_alert"));
    }

    public String A() {
        return this.a("city", "mumbai");
    }

    public void B() {
        this.b("isNotificationReceived", true);
    }

    public boolean C() {
        return this.c("isNotificationReceived");
    }

    public boolean D() {
        return this.w().equals((Object)"hi");
    }

    public String E() {
        return this.b("gplus_userEmail");
    }

    public String F() {
        String string = this.b("md5registered");
        if (string == null) {
            string = this.b("gplus_userEmail");
        }
        if (string == null) {
            string = this.b("md5hashid");
        }
        return string;
    }

    public String G() {
        String string = this.b("md5registered");
        if (string == null && (string = this.b("gplus_userEmail")) != null) {
            string = e.a((String)string);
        }
        if (string == null) {
            string = this.b("md5hashid");
        }
        return string;
    }

    public String H() {
        return this.b("md5hashid");
    }

    public String I() {
        return this.b("mobile");
    }

    public String J() {
        return this.b("displayname");
    }

    public String K() {
        return this.a("blessing", null);
    }

    public String L() {
        return this.b("mytrains");
    }

    public String M() {
        return this.a("accessmobilenumber", "");
    }

    public boolean N() {
        return this.a("ismobileverified", false);
    }

    public String O() {
        return this.b("md5registered");
    }

    public void P() {
        this.c(1 + this.b.getInt("count1", 0));
    }

    public void Q() {
        this.c(-1 + this.b.getInt("count1", 0));
    }

    public int R() {
        return this.b.getInt("count1", 0);
    }

    public int a(String string, int n2) {
        return this.b.getInt(string, n2);
    }

    public String a(String string, String string2) {
        return this.b.getString(string, string2);
    }

    public void a(int n2) {
        this.b("ad_not_shown_count", n2);
    }

    public void a(com.mulo.a.b.a a2) {
        this.b("job_name", a2.a);
        this.b("job_education", a2.b);
        this.b("job_experience", a2.c);
        this.b("job_experienceindustry", a2.d);
        this.b("job_birthyear", a2.e);
        this.b("job_homelocation", a2.f);
        this.b("job_expectedsalary", a2.g);
        this.b("job_email", a2.h);
        this.b("job_phone", a2.i);
        this.b("job_gender", a2.j);
        this.b("job_resumepath", a2.k);
    }

    public void a(boolean bl2) {
        this.b("key_is_security_registration_completed", bl2);
    }

    public boolean a(String string, boolean bl2) {
        return this.b.getBoolean(string, bl2);
    }

    public String b(String string) {
        return this.b.getString(string, null);
    }

    public void b(int n2) {
        this.b("station_map_blink_count", n2);
    }

    public void b(String string, int n2) {
        SharedPreferences.Editor editor = this.b.edit();
        editor.putInt(string, n2);
        editor.apply();
        editor.commit();
    }

    public void b(String string, String string2) {
        SharedPreferences.Editor editor = this.b.edit();
        editor.putString(string, string2);
        editor.apply();
        editor.commit();
    }

    public void b(String string, boolean bl2) {
        SharedPreferences.Editor editor = this.b.edit();
        editor.putBoolean(string, bl2);
        editor.apply();
        editor.commit();
    }

    public void b(boolean bl2) {
        this.b("out_of_memory", bl2);
    }

    public String c(Context context) {
        return this.b("app_language");
    }

    public void c(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_station_history_list");
        this.b(stringBuilder.toString(), string2);
    }

    public void c(boolean bl2) {
        this.b("ismobileverified", bl2);
    }

    public boolean c(String string) {
        return this.b.getBoolean(string, false);
    }

    public void d(String string) {
        SharedPreferences.Editor editor = this.b.edit();
        editor.remove(string);
        editor.apply();
        editor.commit();
    }

    public void d(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_train_fav_list");
        this.b(stringBuilder.toString(), string2);
    }

    public void e(String string) {
        this.b("safetycontact1name_key", string);
    }

    public void f(String string) {
        this.b("safetycontact1number_key", string);
    }

    public void g(String string) {
        this.b("safetycontact2name_key", string);
    }

    public void h(String string) {
        this.b("safetycontact2number_key", string);
    }

    public void i() {
        this.d("safetycontact1numberlastcalltime_key");
    }

    public void i(String string) {
        this.b("safetycontact1numbercallcount_key", string);
    }

    public void j() {
        SharedPreferences.Editor editor = this.b.edit();
        editor.remove("safetycontact1name_key");
        editor.apply();
    }

    public void j(String string) {
        this.b("gcm_reg_id_key", string);
    }

    public void k() {
        SharedPreferences.Editor editor = this.b.edit();
        editor.remove("safetycontact1number_key");
        editor.apply();
    }

    public void k(String string) {
        this.b("app_language", string);
    }

    public String l(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_station_history_list");
        return this.a(stringBuilder.toString(), "");
    }

    public void l() {
        SharedPreferences.Editor editor = this.b.edit();
        editor.remove("safetycontact2name_key");
        editor.apply();
    }

    public void m() {
        SharedPreferences.Editor editor = this.b.edit();
        editor.remove("safetycontact2number_key");
        editor.apply();
    }

    public void m(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_station_history_list");
        this.d(stringBuilder.toString());
    }

    public String n() {
        return this.b("KEY_IS_SAFETY_SHORTCUT_INSTALLED");
    }

    public String n(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_train_fav_list");
        return this.a(stringBuilder.toString(), "");
    }

    public void o() {
        this.b("KEY_IS_SAFETY_SHORTCUT_INSTALLED", "KEY_IS_SAFETY_SHORTCUT_INSTALLED");
    }

    public void o(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("_train_fav_list");
        this.d(stringBuilder.toString());
    }

    public String p() {
        return this.b("gcm_reg_id_key");
    }

    public void p(String string) {
        this.b("md5registered", string);
    }

    public void q(String string) {
        this.b("mobile", string);
    }

    public boolean q() {
        return true ^ this.c("is_first_time_app_opened");
    }

    public void r() {
        this.b("is_first_time_app_opened", true);
    }

    public void r(String string) {
        this.b("accessmobilenumber", string);
    }

    public String s() {
        return this.a("WHATS_NEW_SEEN_VERSION", null);
    }

    public void s(String string) {
        this.b("md5hashid", string);
    }

    public void t() {
        this.b("WHATS_NEW_SEEN_VERSION", "17.0.186");
    }

    public void t(String string) {
        this.b("displayname", string);
    }

    public void u() {
        this.b("USER_REGISTRATION_ONLINE", "A:T:20210102");
    }

    public void u(String string) {
        this.b("mytrains", string);
    }

    public int v() {
        return this.a("ad_not_shown_count", 0);
    }

    public String w() {
        return "en";
    }

    public int x() {
        return this.a("station_map_blink_count", 0);
    }

    public boolean y() {
        return this.c("out_of_memory");
    }

    public com.mulo.a.b.a z() {
        com.mulo.a.b.a a2 = new com.mulo.a.b.a(this.b("job_name"), this.b("job_education"), this.b("job_experience"), this.b("job_experienceindustry"), this.b("job_birthyear"), this.b("job_homelocation"), this.b("job_expectedsalary"), this.b("job_email"), this.b("job_phone"), this.b("job_gender"), this.b("job_resumepath"));
        return a2;
    }
}

