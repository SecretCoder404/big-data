/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.ab;
import com.amazon.device.ads.au;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cp;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.em;
import com.amazon.device.ads.h;
import org.json.JSONObject;

class ba
implements ab {
    private static final String a = "ba";
    private static final String g;
    private static final String h;
    private final h b;
    private final cp c;
    private final cy d;
    private dt e;
    private final ee f;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(function (window, console) {\n    var is_array = function (obj) {\n        return Object.prototype.toString.call(obj) === '[object Array]';\n    },\n    addViewTreeObservers = function(){\n       viewableAdSDKBridge.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"AddObserversToViewTree\", null);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    removeViewTreeObservers = function(){\n");
        stringBuilder.append("       viewableAdSDKBridge.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"RemoveObserversFromViewTree\", null);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    forEach = function (array, fn) {\n");
        stringBuilder.append("        var i;\n");
        stringBuilder.append("        for (i = 0; i < array.length; i++) {\n");
        stringBuilder.append("            if (i in array) {\n");
        stringBuilder.append("                fn.call(null, array[i], i);\n");
        stringBuilder.append("            }\n");
        stringBuilder.append("        }\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    listeners = [],\n");
        stringBuilder.append("    version = 1.1,\n");
        stringBuilder.append("    invokeListeners = function(event, args) {\n");
        stringBuilder.append("        var eventListeners = listeners[event] || [];\n");
        stringBuilder.append("        // fire all the listeners\n");
        stringBuilder.append("        forEach(eventListeners, function(listener){\n");
        stringBuilder.append("            try {\n");
        stringBuilder.append("                listener.apply(null, args);\n");
        stringBuilder.append("            }catch(e){\n");
        stringBuilder.append("                debug(\"Error executing \" + event + \" listener\");\n");
        stringBuilder.append("                debug(e);\n");
        stringBuilder.append("            }\n");
        stringBuilder.append("        });\n");
        stringBuilder.append("    }\n");
        stringBuilder.append("    debug = function(msg) {\n");
        stringBuilder.append("        console.log(\"SDK JS API log: \" + msg);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    viewabilityChangeEvent = function(viewable) {\n");
        stringBuilder.append("        debug(\"viewableChange: \" + viewable);\n");
        stringBuilder.append("        var jsonObject = JSON.parse(viewable);\n");
        stringBuilder.append("        var args = [jsonObject];\n");
        stringBuilder.append("        invokeListeners(\"Viewability\", args);\n");
        stringBuilder.append("    }, \n");
        stringBuilder.append("    window.viewableBridge = {\n");
        stringBuilder.append("       viewabilityChange : viewabilityChangeEvent\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    /* we can add new event properties in future */  \n");
        stringBuilder.append("    window.Event = {\n");
        stringBuilder.append("            Viewability: 'Viewability'\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    // Define the amazonmobileadsviewablebridge object\n");
        stringBuilder.append("    window.amazonmobileadsviewablebridge = {\n");
        stringBuilder.append("            // Command Flow\n");
        stringBuilder.append("            addEventListener : function(event, listener){\n");
        stringBuilder.append("                var eventListeners = listeners[event] || [],\n");
        stringBuilder.append("                alreadyRegistered = false;\n");
        stringBuilder.append("                \n");
        stringBuilder.append("                //verify the event is one that will actually occur/ verfiy it's supported by SDK\n");
        stringBuilder.append("                if (!Event.hasOwnProperty(event)){\n");
        stringBuilder.append("                    return;\n");
        stringBuilder.append("                }\n");
        stringBuilder.append("                \n");
        stringBuilder.append("                //register first set of listeners for this event\n");
        stringBuilder.append("                if (!is_array(listeners[event])) {\n");
        stringBuilder.append("                    listeners[event] = eventListeners;\n");
        stringBuilder.append("                }\n");
        stringBuilder.append("                \n");
        stringBuilder.append("                forEach(eventListeners, function(l){ \n");
        stringBuilder.append("                    // Listener already registered, so no need to add it.\n");
        stringBuilder.append("                        if (listener === l){\n");
        stringBuilder.append("                            alreadyRegistered = true;\n");
        stringBuilder.append("                        }\n");
        stringBuilder.append("                    }\n");
        stringBuilder.append("                );\n");
        stringBuilder.append("                if (!alreadyRegistered){\n");
        stringBuilder.append("                    listeners[event].push(listener);\n");
        stringBuilder.append("                    if (event = Event.Viewability){ \n");
        stringBuilder.append("                       addViewTreeObservers();  \n");
        stringBuilder.append("                   } \n");
        stringBuilder.append("                }\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            removeEventListener : function(event, listener){\n");
        stringBuilder.append("                if (listeners.hasOwnProperty(event)) {\n");
        stringBuilder.append("                    var eventListeners = listeners[event];\n");
        stringBuilder.append("                    if (eventListeners) {\n");
        stringBuilder.append("                        var idx = eventListeners.indexOf(listener);\n");
        stringBuilder.append("                        if (idx !== -1) {\n");
        stringBuilder.append("                            eventListeners.splice(idx, 1);\n");
        stringBuilder.append("                            if (event = Event.Viewability){ \n");
        stringBuilder.append("                               removeViewTreeObservers();  \n");
        stringBuilder.append("                             } \n");
        stringBuilder.append("                        }\n");
        stringBuilder.append("                    }\n");
        stringBuilder.append("                }\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getSDKVersion: function(){\n");
        stringBuilder.append("               var json = JSON.parse(viewableAdSDKBridge.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetSDKVersion\", null));\n");
        stringBuilder.append("               return json.sdkVersion;\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getVersion: function(){\n");
        stringBuilder.append("                return version;\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("    };\n");
        stringBuilder.append("})(window, console);\n");
        g = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("function(){\n                var json = JSON.parse(viewableAdSDKBridge.");
        stringBuilder2.append(cp.a());
        stringBuilder2.append("(\"GetInstrumentationURL\", null));\n");
        stringBuilder2.append("                return json.instrumentationPixelUrl;\n");
        stringBuilder2.append("            }");
        h = stringBuilder2.toString();
    }

    public ba(h h2, cp cp2) {
        this(h2, cp2, ee.a(), new cz());
    }

    ba(h h2, cp cp2, ee ee2, cz cz2) {
        this.b = h2;
        this.c = cp2;
        this.d = cz2.a(a);
        this.f = ee2;
        this.c.a(new a(this));
        this.c.a(new c(this));
        this.c.a(new b(this));
        this.c.a(new d(this));
    }

    private String f() {
        String string = this.f.a("viewableJSSettingsNameAmazonAdSDK", (String)null);
        if (string == null) {
            this.d.e("Viewability Javascript is null");
            return "";
        }
        Object[] arrobject = new Object[]{h, this.b.A()};
        return String.format((String)string, (Object[])arrobject);
    }

    private String g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(g);
        stringBuilder.append(this.f());
        return stringBuilder.toString();
    }

    private String h() {
        return em.a();
    }

    private void i() {
        this.b.t();
    }

    private void j() {
        this.b.u();
    }

    private String k() {
        return this.b.v();
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
        return "viewableAdSDKBridge";
    }

    @Override
    public String d() {
        return this.g();
    }

    @Override
    public dt e() {
        if (this.e == null) {
            this.e = new au();
        }
        return this.e;
    }

    private static class a
    extends cp.b {
        private final ba a;

        public a(ba ba2) {
            super("AddObserversToViewTree");
            this.a = ba2;
        }

        @Override
        protected JSONObject a(JSONObject jSONObject) {
            this.a.i();
            return null;
        }
    }

    private static class b
    extends cp.b {
        private final ba a;

        public b(ba ba2) {
            super("GetInstrumentationURL");
            this.a = ba2;
        }

        @Override
        protected JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            co.b(jSONObject2, "instrumentationPixelUrl", this.a.k());
            return jSONObject2;
        }
    }

    private static class c
    extends cp.b {
        private final ba a;

        public c(ba ba2) {
            super("RemoveObserversFromViewTree");
            this.a = ba2;
        }

        @Override
        protected JSONObject a(JSONObject jSONObject) {
            this.a.j();
            return null;
        }
    }

    private static class d
    extends cp.b {
        private final ba a;

        protected d(ba ba2) {
            super("GetSDKVersion");
            this.a = ba2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            co.b(jSONObject2, "sdkVersion", this.a.h());
            return jSONObject2;
        }
    }

}

