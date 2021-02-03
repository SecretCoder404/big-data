/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package d.a.a.a.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import d.a.a.a.a.b.b;
import d.a.a.a.a.b.d;
import d.a.a.a.a.b.e;
import d.a.a.a.a.b.f;
import d.a.a.a.a.b.h;

class c {
    private final Context a;
    private final d.a.a.a.a.f.c b;

    public c(Context context) {
        this.a = context.getApplicationContext();
        this.b = new d.a.a.a.a.f.d(context, "TwitterAdvertisingInfoPreferences");
    }

    private void a(final b b2) {
        new Thread((Runnable)new h(){

            @Override
            public void onRun() {
                b b22 = c.this.e();
                if (!b2.equals(b22)) {
                    d.a.a.a.c.g().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    c.this.b(b22);
                }
            }
        }).start();
    }

    @SuppressLint(value={"CommitPrefEdits"})
    private void b(b b2) {
        if (this.c(b2)) {
            d.a.a.a.a.f.c c2 = this.b;
            c2.a(c2.b().putString("advertising_id", b2.a).putBoolean("limit_ad_tracking_enabled", b2.b));
            return;
        }
        d.a.a.a.a.f.c c3 = this.b;
        c3.a(c3.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    private boolean c(b b2) {
        return b2 != null && !TextUtils.isEmpty((CharSequence)b2.a);
    }

    private b e() {
        b b2 = this.c().a();
        if (!this.c(b2)) {
            b b3 = this.d().a();
            if (!this.c(b3)) {
                d.a.a.a.c.g().a("Fabric", "AdvertisingInfo not present");
                return b3;
            }
            d.a.a.a.c.g().a("Fabric", "Using AdvertisingInfo from Service Provider");
            return b3;
        }
        d.a.a.a.c.g().a("Fabric", "Using AdvertisingInfo from Reflection Provider");
        return b2;
    }

    public b a() {
        b b2 = this.b();
        if (this.c(b2)) {
            d.a.a.a.c.g().a("Fabric", "Using AdvertisingInfo from Preference Store");
            this.a(b2);
            return b2;
        }
        b b3 = this.e();
        this.b(b3);
        return b3;
    }

    protected b b() {
        return new b(this.b.a().getString("advertising_id", ""), this.b.a().getBoolean("limit_ad_tracking_enabled", false));
    }

    public f c() {
        return new d(this.a);
    }

    public f d() {
        return new e(this.a);
    }

}

