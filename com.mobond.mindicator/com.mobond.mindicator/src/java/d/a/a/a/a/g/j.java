/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package d.a.a.a.a.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import d.a.a.a.a.b.k;
import d.a.a.a.a.b.q;
import d.a.a.a.a.f.d;
import d.a.a.a.a.g.g;
import d.a.a.a.a.g.r;
import d.a.a.a.a.g.s;
import d.a.a.a.a.g.t;
import d.a.a.a.a.g.v;
import d.a.a.a.a.g.w;
import d.a.a.a.a.g.x;
import d.a.a.a.c;
import d.a.a.a.i;
import d.a.a.a.l;
import org.json.JSONObject;

class j
implements s {
    private final w a;
    private final v b;
    private final k c;
    private final g d;
    private final x e;
    private final i f;
    private final d.a.a.a.a.f.c g;

    public j(i i2, w w2, k k2, v v2, g g2, x x2) {
        this.f = i2;
        this.a = w2;
        this.c = k2;
        this.b = v2;
        this.d = g2;
        this.e = x2;
        this.g = new d(this.f);
    }

    private void a(JSONObject jSONObject, String string) {
        l l2 = c.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(jSONObject.toString());
        l2.a("Fabric", stringBuilder.toString());
    }

    private t b(r r2) {
        t t2;
        block9 : {
            void var3_9;
            block13 : {
                block10 : {
                    block11 : {
                        t t3;
                        block12 : {
                            t2 = null;
                            boolean bl = r.b.equals((Object)r2);
                            t2 = null;
                            if (bl) break block9;
                            JSONObject jSONObject = this.d.a();
                            if (jSONObject == null) break block10;
                            t3 = this.b.a(this.c, jSONObject);
                            if (t3 == null) break block11;
                            this.a(jSONObject, "Loaded cached settings: ");
                            long l2 = this.c.a();
                            if (r.c.equals((Object)r2) || !t3.a(l2)) break block12;
                            c.g().a("Fabric", "Cached settings have expired.");
                            return null;
                        }
                        try {
                            c.g().a("Fabric", "Returning cached settings.");
                            return t3;
                        }
                        catch (Exception exception) {
                            t2 = t3;
                        }
                        break block13;
                    }
                    c.g().e("Fabric", "Failed to transform cached settings data.", null);
                    return null;
                }
                try {
                    c.g().a("Fabric", "No cached settings data found.");
                    return null;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            c.g().e("Fabric", "Failed to get cached settings", (Throwable)var3_9);
        }
        return t2;
    }

    @Override
    public t a() {
        return this.a(r.a);
    }

    @Override
    public t a(r r2) {
        t t2;
        block11 : {
            block10 : {
                boolean bl = new q().c(this.f.getContext());
                t2 = null;
                if (!bl) {
                    c.g().a("Fabric", "Not fetching settings, because data collection is disabled by Firebase.");
                    return null;
                }
                boolean bl2 = c.h();
                t2 = null;
                if (bl2) break block10;
                boolean bl3 = this.d();
                t2 = null;
                if (bl3) break block10;
                try {
                    t2 = this.b(r2);
                }
                catch (Exception exception) {
                    c.g().e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
                }
            }
            if (t2 == null) {
                JSONObject jSONObject = this.e.a(this.a);
                if (jSONObject == null) break block11;
                t2 = this.b.a(this.c, jSONObject);
                this.d.a(t2.g, jSONObject);
                this.a(jSONObject, "Loaded settings: ");
                this.a(this.b());
            }
        }
        if (t2 == null) {
            t t3 = this.b(r.c);
            return t3;
        }
        return t2;
    }

    @SuppressLint(value={"CommitPrefEdits"})
    boolean a(String string) {
        SharedPreferences.Editor editor = this.g.b();
        editor.putString("existing_instance_identifier", string);
        return this.g.a(editor);
    }

    String b() {
        String[] arrstring = new String[]{d.a.a.a.a.b.i.m(this.f.getContext())};
        return d.a.a.a.a.b.i.a(arrstring);
    }

    String c() {
        return this.g.a().getString("existing_instance_identifier", "");
    }

    boolean d() {
        return true ^ this.c().equals((Object)this.b());
    }
}

