/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ab;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cp;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.em;
import com.amazon.device.ads.fc;
import com.amazon.device.ads.h;
import java.util.Locale;
import org.json.JSONObject;

class as
implements ab {
    private static final String a = "as";
    private static final String b;
    private final cp c;
    private final h d;
    private final a e = new a(this);
    private final fc f;
    private final cy g;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(function (window, console){\n    var version = '1.0',\n    debug = function(msg) {\n        console.log(\"Amazon Javascript log: \" + msg);\n    },\n    is_array = function (obj) {\n        return Object.prototype.toString.call(obj) === '[object Array]';\n    },\n    forEach = function (array, fn) {\n        var i;\n        for (i = 0; i < array.length; i++) {\n            if (i in array) {\n                fn.call(null, array[i], i);\n            }\n        }\n    },\n    listeners = [],\n    events = {\n        backButton: 'backButton'\n    },\n    invokeListeners = function(event, args) {\n        var eventListeners = listeners[event] || [];\n        // fire all the listeners\n        forEach(eventListeners, function(listener){\n            try {\n                listener.apply(null, args);\n            }catch(e){\n                debug(\"Error executing \" + event + \" listener\");\n                debug(e);\n            }\n        });\n    },\n    backButtonEvent = function() {\n        invokeListeners(\"backButton\");\n    };\n    window.amazonBridge = {\n        backButton : backButtonEvent\n    };\n    window.amazon = {\n        // Command Flow\n        addEventListener : function(event, listener){\n            var eventListeners = listeners[event] || [],\n            alreadyRegistered = false;\n            \n            //verify the event is one that will actually occur\n            if (!events.hasOwnProperty(event)){\n                return;\n            }\n            \n            //register first set of listeners for this event\n            if (!is_array(listeners[event])) {\n                listeners[event] = eventListeners;\n            }\n            \n            forEach(eventListeners, function(l){ \n                // Listener already registered, so no need to add it.\n                    if (listener === l){\n                        alreadyRegistered = true;\n                    }\n                }\n            );\n            if (!alreadyRegistered){\n                listeners[event].push(listener);\n            }\n        },\n        removeEventListener : function(event, listener){\n            if (listeners.hasOwnProperty(event)) {\n                var eventListeners = listeners[event];\n                if (eventListeners) {\n                    var idx = eventListeners.indexOf(listener);\n                    if (idx !== -1) {\n                        eventListeners.splice(idx, 1);\n                    }\n                }\n            }\n        },\n        enableCloseButton: function(enable){\n            amazonObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"EnableCloseButton\", JSON.stringify({\"enable\": enable}));\n");
        stringBuilder.append("        },\n");
        stringBuilder.append("        overrideBackButton: function(override){\n");
        stringBuilder.append("            amazonObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"OverrideBackButton\", JSON.stringify({\"override\": override}));\n");
        stringBuilder.append("        },\n");
        stringBuilder.append("        openInExternalBrowser: function(url){\n");
        stringBuilder.append("            amazonObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"OpenInExternalBrowser\", JSON.stringify({\"url\": url}));\n");
        stringBuilder.append("        },\n");
        stringBuilder.append("        getSDKVersion: function(){\n");
        stringBuilder.append("            var json = JSON.parse(amazonObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetSDKVersion\", null));\n");
        stringBuilder.append("            return json.sdkVersion;\n");
        stringBuilder.append("        },\n");
        stringBuilder.append("        getVersion: function(){\n");
        stringBuilder.append("            return version;\n");
        stringBuilder.append("        },\n");
        stringBuilder.append("    };\n");
        stringBuilder.append("})(window, console);");
        b = stringBuilder.toString();
    }

    public as(h h2, cp cp2) {
        this(h2, cp2, new fc(), new cz());
    }

    as(h h2, cp cp2, fc fc2, cz cz2) {
        this.d = h2;
        this.c = cp2;
        this.f = fc2;
        this.g = cz2.a(a);
        this.c.a(new b(this));
        this.c.a(new d(this));
        this.c.a(new c(this));
        this.c.a(new e(this));
    }

    private void a(String string) {
        if (!this.d.l()) {
            this.a("Unable to open a URL while the ad is not visible", "open");
            return;
        }
        cy cy2 = this.g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opening URL ");
        stringBuilder.append(string);
        cy2.d(stringBuilder.toString());
        if (this.f.a(string)) {
            this.d.d(string);
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("URL ");
        stringBuilder2.append(string);
        stringBuilder2.append(" is not a valid URL");
        String string2 = stringBuilder2.toString();
        this.g.d(string2);
        this.a(string2, "open");
    }

    private void a(String string, String string2) {
        this.d.a(String.format((Locale)Locale.US, (String)"amazonBridge.error('%s', '%s');", (Object[])new Object[]{string, string2}));
    }

    private void a(boolean bl) {
        if (!this.g()) {
            return;
        }
        if (bl) {
            this.d.a(true);
            return;
        }
        this.d.d();
    }

    private void b(boolean bl) {
        this.d.c(bl);
    }

    private void f() {
        this.d.a("amazonBridge.backButton();");
    }

    private boolean g() {
        return this.d.m();
    }

    private String h() {
        return em.a();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public cp.a b() {
        return this.c.b();
    }

    @Override
    public String c() {
        return "amazonObject";
    }

    @Override
    public String d() {
        return b;
    }

    @Override
    public dt e() {
        return this.e;
    }

    private static class a
    implements dt {
        private final as a;

        public a(as as2) {
            this.a = as2;
        }

        @Override
        public void a(ds ds2, h h2) {
            if (ds2.a().equals((Object)ds.a.j)) {
                this.a.f();
            }
        }
    }

    private static class b
    extends cp.b {
        private final as a;

        public b(as as2) {
            super("EnableCloseButton");
            this.a = as2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.a(co.a(jSONObject, "enable", true));
            return null;
        }
    }

    private static class c
    extends cp.b {
        private final as a;

        public c(as as2) {
            super("OpenInExternalBrowser");
            this.a = as2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.a(co.a(jSONObject, "url", null));
            return null;
        }
    }

    private static class d
    extends cp.b {
        private final as a;

        public d(as as2) {
            super("OverrideBackButton");
            this.a = as2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.b(co.a(jSONObject, "override", false));
            return null;
        }
    }

    private static class e
    extends cp.b {
        private final as a;

        protected e(as as2) {
            super("GetSDKVersion");
            this.a = as2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            co.b(jSONObject2, "sdkVersion", this.a.h());
            return jSONObject2;
        }
    }

}

