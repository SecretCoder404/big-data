/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package d.a.a.a.a.g;

import d.a.a.a.a.g.b;
import d.a.a.a.a.g.c;
import d.a.a.a.a.g.e;
import d.a.a.a.a.g.f;
import d.a.a.a.a.g.m;
import d.a.a.a.a.g.o;
import d.a.a.a.a.g.p;
import d.a.a.a.a.g.t;
import d.a.a.a.a.g.u;
import d.a.a.a.a.g.v;
import org.json.JSONObject;

class k
implements v {
    k() {
    }

    private long a(d.a.a.a.a.b.k k2, long l2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.getLong("expires_at");
        }
        return k2.a() + l2 * 1000L;
    }

    private e a(JSONObject jSONObject) {
        String string = jSONObject.getString("identifier");
        String string2 = jSONObject.getString("status");
        String string3 = jSONObject.getString("url");
        String string4 = jSONObject.getString("reports_url");
        String string5 = jSONObject.getString("ndk_reports_url");
        boolean bl = jSONObject.optBoolean("update_required", false);
        c c2 = jSONObject.has("icon") && jSONObject.getJSONObject("icon").has("hash") ? this.b(jSONObject.getJSONObject("icon")) : null;
        e e2 = new e(string, string2, string3, string4, string5, bl, c2);
        return e2;
    }

    private c b(JSONObject jSONObject) {
        return new c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    private m c(JSONObject jSONObject) {
        boolean bl = jSONObject.optBoolean("prompt_enabled", false);
        boolean bl2 = jSONObject.optBoolean("collect_logged_exceptions", true);
        boolean bl3 = jSONObject.optBoolean("collect_reports", true);
        boolean bl4 = jSONObject.optBoolean("collect_analytics", false);
        boolean bl5 = jSONObject.optBoolean("firebase_crashlytics_enabled", false);
        m m2 = new m(bl, bl2, bl3, bl4, bl5);
        return m2;
    }

    private b d(JSONObject jSONObject) {
        String string = jSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events");
        int n2 = jSONObject.optInt("flush_interval_secs", 600);
        int n3 = jSONObject.optInt("max_byte_size_per_file", 8000);
        int n4 = jSONObject.optInt("max_file_count_per_send", 1);
        int n5 = jSONObject.optInt("max_pending_send_file_count", 100);
        boolean bl = jSONObject.optBoolean("forward_to_google_analytics", false);
        boolean bl2 = jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false);
        boolean bl3 = jSONObject.optBoolean("track_custom_events", true);
        boolean bl4 = jSONObject.optBoolean("track_predefined_events", true);
        int n6 = jSONObject.optInt("sampling_rate", 1);
        boolean bl5 = jSONObject.optBoolean("flush_on_background", true);
        b b2 = new b(string, n2, n3, n4, n5, bl, bl2, bl3, bl4, n6, bl5);
        return b2;
    }

    private p e(JSONObject jSONObject) {
        int n2 = jSONObject.optInt("log_buffer_size", 64000);
        int n3 = jSONObject.optInt("max_chained_exception_depth", 8);
        int n4 = jSONObject.optInt("max_custom_exception_events", 64);
        int n5 = jSONObject.optInt("max_custom_key_value_pairs", 64);
        int n6 = jSONObject.optInt("identifier_mask", 255);
        boolean bl = jSONObject.optBoolean("send_session_without_crash", false);
        int n7 = jSONObject.optInt("max_complete_sessions_count", 4);
        p p2 = new p(n2, n3, n4, n5, n6, bl, n7);
        return p2;
    }

    private o f(JSONObject jSONObject) {
        String string = jSONObject.optString("title", "Send Crash Report?");
        String string2 = jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report.");
        String string3 = jSONObject.optString("send_button_title", "Send");
        boolean bl = jSONObject.optBoolean("show_cancel_button", true);
        String string4 = jSONObject.optString("cancel_button_title", "Don't Send");
        boolean bl2 = jSONObject.optBoolean("show_always_send_button", true);
        String string5 = jSONObject.optString("always_send_button_title", "Always Send");
        o o2 = new o(string, string2, string3, bl, string4, bl2, string5);
        return o2;
    }

    private f g(JSONObject jSONObject) {
        return new f(jSONObject.optString("update_endpoint", u.a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    @Override
    public t a(d.a.a.a.a.b.k k2, JSONObject jSONObject) {
        int n2 = jSONObject.optInt("settings_version", 0);
        int n3 = jSONObject.optInt("cache_duration", 3600);
        e e2 = this.a(jSONObject.getJSONObject("app"));
        p p2 = this.e(jSONObject.getJSONObject("session"));
        o o2 = this.f(jSONObject.getJSONObject("prompt"));
        m m2 = this.c(jSONObject.getJSONObject("features"));
        b b2 = this.d(jSONObject.getJSONObject("analytics"));
        f f2 = this.g(jSONObject.getJSONObject("beta"));
        long l2 = this.a(k2, n3, jSONObject);
        t t2 = new t(l2, e2, p2, o2, m2, b2, f2, n2, n3);
        return t2;
    }
}

