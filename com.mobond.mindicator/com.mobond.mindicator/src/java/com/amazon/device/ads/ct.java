/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Date
 *  java.util.Locale
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.ab;
import com.amazon.device.ads.al;
import com.amazon.device.ads.bc;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bj;
import com.amazon.device.ads.bu;
import com.amazon.device.ads.bv;
import com.amazon.device.ads.cb;
import com.amazon.device.ads.ce;
import com.amazon.device.ads.ch;
import com.amazon.device.ads.cj;
import com.amazon.device.ads.ck;
import com.amazon.device.ads.cl;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cp;
import com.amazon.device.ads.cq;
import com.amazon.device.ads.ct;
import com.amazon.device.ads.cu;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.da;
import com.amazon.device.ads.dg;
import com.amazon.device.ads.dj;
import com.amazon.device.ads.dk;
import com.amazon.device.ads.dm;
import com.amazon.device.ads.dp;
import com.amazon.device.ads.dq;
import com.amazon.device.ads.dr;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.ef;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.en;
import com.amazon.device.ads.eq;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.fb;
import com.amazon.device.ads.fc;
import com.amazon.device.ads.n;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

class ct
implements ab {
    private static final String a = "ct";
    private static final String b;
    private final cy c;
    private final dj d;
    private final ez.d e;
    private final bc f;
    private final dg g;
    private final bv h;
    private final dk i;
    private final dq j;
    private boolean k = true;
    private dt l;
    private final com.amazon.device.ads.h m;
    private final cp n;
    private final fc o;
    private final al p;
    private final ej.k q;
    private final ce r;
    private final a s;
    private final cl t;
    private final cq u;
    private final eq v;
    private FrameLayout w;
    private ViewGroup x;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(function (window, console) {\n    var is_array = function (obj) {\n        return Object.prototype.toString.call(obj) === '[object Array]';\n    },\n    registerViewabilityInterest = function(){\n       mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"RegisterViewabilityInterest\", null);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    deregisterViewabilityInterest = function(){\n");
        stringBuilder.append("       mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"DeregisterViewabilityInterest\", null);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    forEach = function (array, fn) {\n");
        stringBuilder.append("        var i;\n");
        stringBuilder.append("        for (i = 0; i < array.length; i++) {\n");
        stringBuilder.append("            if (i in array) {\n");
        stringBuilder.append("                fn.call(null, array[i], i);\n");
        stringBuilder.append("            }\n");
        stringBuilder.append("        }\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    events = {\n");
        stringBuilder.append("            error: 'error',\n");
        stringBuilder.append("            ready: 'ready',\n");
        stringBuilder.append("            sizeChange: 'sizeChange',\n");
        stringBuilder.append("            stateChange: 'stateChange',\n");
        stringBuilder.append("            viewableChange: 'viewableChange'\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    states = [\"loading\",\"default\",\"expanded\",\"resized\",\"hidden\"],\n");
        stringBuilder.append("    placementTypes = [\"inline\", \"interstitial\"],\n");
        stringBuilder.append("    listeners = [],\n");
        stringBuilder.append("    version = '2.0',\n");
        stringBuilder.append("    currentState = \"loading\",\n");
        stringBuilder.append("    currentlyViewable = false,\n");
        stringBuilder.append("    supportedFeatures = null,\n");
        stringBuilder.append("    orientationProperties = {\"allowOrientationChange\":true,\"forceOrientation\":\"none\"},\n");
        stringBuilder.append("    // Error Event fires listeners\n");
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
        stringBuilder.append("    },\n");
        stringBuilder.append("    debug = function(msg) {\n");
        stringBuilder.append("        console.log(\"MRAID log: \" + msg);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    readyEvent = function() {\n");
        stringBuilder.append("        debug(\"MRAID ready\");\n");
        stringBuilder.append("        invokeListeners(\"ready\");\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    errorEvent = function(message, action) {\n");
        stringBuilder.append("        debug(\"error: \" + message + \" action: \" + action);\n");
        stringBuilder.append("        var args = [message, action];\n");
        stringBuilder.append("        invokeListeners(\"error\", args);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    stateChangeEvent = function(state) {\n");
        stringBuilder.append("        debug(\"stateChange: \" + state);\n");
        stringBuilder.append("        var args = [state];\n");
        stringBuilder.append("        currentState = state;\n");
        stringBuilder.append("        invokeListeners(\"stateChange\", args);\n");
        stringBuilder.append("    },\n");
        stringBuilder.append("    viewableChangeEvent = function(viewable) {\n");
        stringBuilder.append("        if (viewable != currentlyViewable) {");
        stringBuilder.append("            debug(\"viewableChange: \" + viewable);\n");
        stringBuilder.append("            var args = [viewable];\n");
        stringBuilder.append("            invokeListeners(\"viewableChange\", args);\n");
        stringBuilder.append("            currentlyViewable = viewable;\n");
        stringBuilder.append("        }\n");
        stringBuilder.append("    }, \n");
        stringBuilder.append("    sizeChangeEvent = function(width, height) {\n");
        stringBuilder.append("        debug(\"sizeChange: \" + width + \"x\" + height);\n");
        stringBuilder.append("        var args = [width, height];\n");
        stringBuilder.append("        invokeListeners(\"sizeChange\", args);\n");
        stringBuilder.append("    };\n");
        stringBuilder.append("    window.mraidBridge = {\n");
        stringBuilder.append("            error : errorEvent,\n");
        stringBuilder.append("            ready : readyEvent,\n");
        stringBuilder.append("            stateChange : stateChangeEvent,\n");
        stringBuilder.append("            sizeChange : sizeChangeEvent,\n");
        stringBuilder.append("            viewableChange : viewableChangeEvent\n");
        stringBuilder.append("    };\n");
        stringBuilder.append("    // Define the mraid object\n");
        stringBuilder.append("    window.mraid = {\n");
        stringBuilder.append("            // Command Flow\n");
        stringBuilder.append("            addEventListener : function(event, listener){\n");
        stringBuilder.append("                var eventListeners = listeners[event] || [],\n");
        stringBuilder.append("                alreadyRegistered = false;\n");
        stringBuilder.append("                \n");
        stringBuilder.append("                //verify the event is one that will actually occur\n");
        stringBuilder.append("                if (!events.hasOwnProperty(event)){\n");
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
        stringBuilder.append("                    debug('Registering Listener for ' + event + ': ' + listener)\n");
        stringBuilder.append("                    listeners[event].push(listener);\n");
        stringBuilder.append("                    if (event = 'viewableChange'){ \n");
        stringBuilder.append("                       registerViewabilityInterest();  \n");
        stringBuilder.append("                    } \n");
        stringBuilder.append("                }\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            removeEventListener : function(event, listener){\n");
        stringBuilder.append("                if (listeners.hasOwnProperty(event)) {\n");
        stringBuilder.append("                    var eventListeners = listeners[event];\n");
        stringBuilder.append("                    if (eventListeners) {\n");
        stringBuilder.append("                        var idx = eventListeners.indexOf(listener);\n");
        stringBuilder.append("                        if (idx !== -1) {\n");
        stringBuilder.append("                           eventListeners.splice(idx, 1);\n");
        stringBuilder.append("                           if (event = 'viewableChange'){ \n");
        stringBuilder.append("                               deregisterViewabilityInterest();  \n");
        stringBuilder.append("                           } \n");
        stringBuilder.append("                        }\n");
        stringBuilder.append("                    }\n");
        stringBuilder.append("                }\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            useCustomClose: function(bool){\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"UseCustomClose\", JSON.stringify({useCustomClose: bool}));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            // Support\n");
        stringBuilder.append("            supports: function(feature){\n");
        stringBuilder.append("                if (!supportedFeatures)\n");
        stringBuilder.append("                {\n");
        stringBuilder.append("                    supportedFeatures = JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"Supports\", null));\n");
        stringBuilder.append("                }\n");
        stringBuilder.append("                return supportedFeatures[feature];\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            // Properties\n");
        stringBuilder.append("            getVersion: function(){\n");
        stringBuilder.append("                return version;\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getState: function(){\n");
        stringBuilder.append("                return currentState;\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getPlacementType: function(){\n");
        stringBuilder.append("                var json = JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetPlacementType\", null));\n");
        stringBuilder.append("                return json.placementType;\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            isViewable: function(){\n");
        stringBuilder.append("                var json = JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"IsViewable\", null));\n");
        stringBuilder.append("                return json.isViewable;\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getExpandProperties: function(){\n");
        stringBuilder.append("                return JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetExpandProperties\", null));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            setExpandProperties: function(properties){\n");
        stringBuilder.append("                //Backwards compatibility with MRAID 1.0 creatives\n");
        stringBuilder.append("                if (!!properties.lockOrientation){\n");
        stringBuilder.append("                    mraid.setOrientationProperties({\"allowOrientationChange\":false});\n");
        stringBuilder.append("                }\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"SetExpandProperties\", JSON.stringify(properties));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getOrientationProperties: function(){\n");
        stringBuilder.append("                return orientationProperties;\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            setOrientationProperties: function(properties){\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"SetOrientationProperties\", JSON.stringify(properties));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getResizeProperties: function(){\n");
        stringBuilder.append("                return JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetResizeProperties\", null));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            setResizeProperties: function(properties){\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"SetResizeProperties\", JSON.stringify(properties));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getCurrentPosition: function(){\n");
        stringBuilder.append("                return JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetCurrentPosition\", null));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getMaxSize: function(){\n");
        stringBuilder.append("                return JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetMaxSize\", null));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getDefaultPosition: function(){\n");
        stringBuilder.append("                return JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetDefaultPosition\", null));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            getScreenSize: function(){\n");
        stringBuilder.append("                return JSON.parse(mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"GetScreenSize\", null));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            // Operations\n");
        stringBuilder.append("            open: function(url) {\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"Open\", JSON.stringify({url: url}));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            close: function() {\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"Close\", null);\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            expand: function(url) {\n");
        stringBuilder.append("                if (url !== undefined) {\n");
        stringBuilder.append("                    mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"Expand\", JSON.stringify({url: url}));\n");
        stringBuilder.append("                } else {\n");
        stringBuilder.append("                    mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"Expand\", JSON.stringify({url: \"\"}));\n");
        stringBuilder.append("                }\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            resize: function() {\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"Resize\", null);\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            createCalendarEvent: function(eventObject) {\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"CreateCalendarEvent\", JSON.stringify(eventObject));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            playVideo: function(url){\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"PlayVideo\", JSON.stringify({url: url}));\n");
        stringBuilder.append("            },\n");
        stringBuilder.append("            storePicture: function(url){\n");
        stringBuilder.append("                mraidObject.");
        stringBuilder.append(cp.a());
        stringBuilder.append("(\"StorePicture\", JSON.stringify({url: url}));\n");
        stringBuilder.append("            }\n");
        stringBuilder.append("    };\n");
        stringBuilder.append("})(window, console);\n");
        stringBuilder.append("");
        b = stringBuilder.toString();
    }

    ct(com.amazon.device.ads.h h2, cp cp2) {
        this(h2, cp2, new dj(), new cz(), new ez.d(), ej.a(), new ce(), new Object(){

            public AlertDialog.Builder a(Context context) {
                return new AlertDialog.Builder(context);
            }
        }, new fc(), new al(), new cl(), new bv(), new dg(), new dk(), new dq(), new bc(), new cq(), new eq());
    }

    ct(com.amazon.device.ads.h h2, cp cp2, dj dj2, cz cz2, ez.d d2, ej.k k2, ce ce2, a a2, fc fc2, al al2, cl cl2, bv bv2, dg dg2, dk dk2, dq dq2, bc bc2, cq cq2, eq eq2) {
        this.m = h2;
        this.n = cp2;
        this.c = cz2.a(a);
        this.d = dj2;
        this.e = d2;
        this.q = k2;
        this.r = ce2;
        this.s = a2;
        this.o = fc2;
        this.p = al2;
        this.t = cl2;
        this.h = bv2;
        this.g = dg2;
        this.i = dk2;
        this.j = dq2;
        this.f = bc2;
        this.u = cq2;
        this.v = eq2;
        this.r();
    }

    private void a(Bitmap bitmap) {
        AlertDialog.Builder builder = this.s.a(this.s());
        builder.setTitle((CharSequence)"Would you like to save the image to your gallery?");
        builder.setPositiveButton((CharSequence)"Yes", new DialogInterface.OnClickListener(this, bitmap){
            final /* synthetic */ Bitmap a;
            final /* synthetic */ ct b;
            {
                this.b = ct2;
                this.a = bitmap;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                String string = ct.c(this.b).a(ct.b(this.b), this.a, "AdImage", "Image created by rich media ad.");
                if (eh.a(string)) {
                    ct.a(this.b, "Picture could not be stored to device.", "storePicture");
                    return;
                }
                android.media.MediaScannerConnection.scanFile((Context)ct.b(this.b), (String[])new String[]{string}, null, null);
            }
        });
        builder.setNegativeButton((CharSequence)"No", new DialogInterface.OnClickListener(this){
            final /* synthetic */ ct a;
            {
                this.a = ct2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                ct.a(this.a, "User chose not to store image.", "storePicture");
            }
        });
        builder.show();
    }

    @TargetApi(value=14)
    private void a(bj bj2) {
        Intent intent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
        intent.putExtra("title", bj2.a());
        if (!eh.a(bj2.b())) {
            intent.putExtra("eventLocation", bj2.b());
        }
        if (!eh.a(bj2.c())) {
            intent.putExtra("description", bj2.c());
        }
        intent.putExtra("beginTime", bj2.d().getTime());
        if (bj2.e() != null) {
            intent.putExtra("endTime", bj2.e().getTime());
        }
        this.s().startActivity(intent);
    }

    static /* synthetic */ void a(ct ct2, Bitmap bitmap) {
        ct2.a(bitmap);
    }

    static /* synthetic */ void a(ct ct2, dq dq2, ef ef2) {
        ct2.a(dq2, ef2);
    }

    static /* synthetic */ void a(ct ct2, dq dq2, ef ef2, ef ef3) {
        ct2.a(dq2, ef2, ef3);
    }

    static /* synthetic */ void a(ct ct2, com.amazon.device.ads.h h2) {
        ct2.b(h2);
    }

    static /* synthetic */ void a(ct ct2, String string) {
        ct2.e(string);
    }

    static /* synthetic */ void a(ct ct2, String string, String string2) {
        ct2.a(string, string2);
    }

    private void a(dq dq2, ef ef2) {
        ef ef3 = this.m.h();
        if (ef3 == null) {
            this.m.a(new ViewTreeObserver.OnGlobalLayoutListener(this, dq2, ef2){
                final /* synthetic */ dq a;
                final /* synthetic */ ef b;
                final /* synthetic */ ct c;
                {
                    this.c = ct2;
                    this.a = dq2;
                    this.b = ef2;
                }

                public void onGlobalLayout() {
                    ct.d(this.c).b(this);
                    ef ef2 = ct.d(this.c).h();
                    ct.a(this.c, this.a, this.b, ef2);
                }
            });
            return;
        }
        this.a(dq2, ef2, ef3);
    }

    private void a(dq dq2, ef ef2, ef ef3) {
        if (ef3 == null) {
            this.c.d("Size is null");
            return;
        }
        this.w();
        int n2 = this.p.b(this.i.b() + dq2.e());
        int n3 = this.p.b(this.i.c() + dq2.f());
        dp dp2 = dp.a(dq2.g());
        int n4 = this.p.b(ef3.a());
        int n5 = this.p.b(ef3.b());
        if (!dq2.h()) {
            if (ef2.a() > n4) {
                ef2.a(n4);
            }
            if (ef2.b() > n5) {
                ef2.b(n5);
            }
            if (n2 < 0) {
                n2 = 0;
            } else if (n2 + ef2.a() > n4) {
                n2 = n4 - ef2.a();
            }
            if (n3 < 0) {
                n3 = 0;
            } else if (n3 + ef2.b() > n5) {
                n3 = n5 - ef2.b();
            }
        } else if (!this.a(dp2, n3, n2, ef2, n4, n5)) {
            this.a("Resize failed because close event area must be entirely on screen.", "resize");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ef2.a(), ef2.b());
        this.m.a(this.x, (ViewGroup.LayoutParams)layoutParams, false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ef2.a(), ef2.b());
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = n2;
        layoutParams2.topMargin = n3;
        if (this.w.equals((Object)this.x.getParent())) {
            this.x.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        } else {
            this.w.addView((View)this.x, (ViewGroup.LayoutParams)layoutParams2);
        }
        this.m.a(false, dp2);
        ViewTreeObserver viewTreeObserver = this.x.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, viewTreeObserver){
            final /* synthetic */ ViewTreeObserver a;
            final /* synthetic */ ct b;
            {
                this.b = ct2;
                this.a = viewTreeObserver;
            }

            public void onGlobalLayout() {
                ct.e(this.b).a(this.a, this);
                int[] arrn = new int[2];
                ct.f(this.b).getLocationOnScreen(arrn);
                android.graphics.Rect rect = new android.graphics.Rect(arrn[0], arrn[1], arrn[0] + ct.f(this.b).getWidth(), arrn[1] + ct.f(this.b).getHeight());
                com.amazon.device.ads.n n2 = new com.amazon.device.ads.n(n.a.d);
                n2.a("positionOnScreen", (Object)rect);
                ct.d(this.b).a(n2);
                ct.d(this.b).a("mraidBridge.stateChange('resized');");
                this.b.p();
            }
        });
    }

    private void a(String string, bv bv2) {
        if (this.t.a().a(AdActivity.class).a(this.m.e().getApplicationContext()).a("adapter", da.class.getName()).a("url", string).a("expandProperties", bv2.toString()).a("orientationProperties", this.g.toString()).a()) {
            this.c.d("Successfully expanded ad");
        }
    }

    private void a(String string, String string2) {
        this.m.a(String.format((Locale)Locale.US, (String)"mraidBridge.error('%s', '%s');", (Object[])new Object[]{string, string2}));
    }

    private boolean a(dp dp2, int n2, int n3, ef ef2, int n4, int n5) {
        int n6;
        int n7;
        int n8 = this.p.b(50);
        switch (4.a[dp2.ordinal()]) {
            default: {
                n6 = 0;
                n2 = 0;
                n3 = 0;
                n7 = 0;
                break;
            }
            case 7: {
                int n9 = n2 + ef2.b() / 2;
                int n10 = n8 / 2;
                int n11 = n9 - n10;
                n3 = n3 + ef2.a() / 2 - n10;
                int n12 = n11 + n8;
                n7 = n3 + n8;
                n2 = n11;
                n6 = n12;
                break;
            }
            case 6: {
                n6 = n2 + ef2.b();
                n3 = n3 + ef2.a() / 2 - n8 / 2;
                n2 = n6 - n8;
                n7 = n3 + n8;
                break;
            }
            case 5: {
                n6 = n2 + ef2.b();
                int n13 = n3 + ef2.a();
                int n14 = n6 - n8;
                int n15 = n13 - n8;
                n7 = n13;
                n2 = n14;
                n3 = n15;
                break;
            }
            case 4: {
                n6 = n2 + ef2.b();
                n2 = n6 - n8;
                n7 = n3 + n8;
                break;
            }
            case 3: {
                n3 = n3 + ef2.a() / 2 - n8 / 2;
                n6 = n2 + n8;
                n7 = n3 + n8;
                break;
            }
            case 2: {
                int n16 = n3 + ef2.a();
                int n17 = n2 + n8;
                int n18 = n16 - n8;
                n7 = n16;
                n6 = n17;
                n3 = n18;
                break;
            }
            case 1: {
                n6 = n2 + n8;
                n7 = n3 + n8;
            }
        }
        if (n2 >= 0 && n3 >= 0 && n6 <= n5) {
            return n7 <= n4;
        }
        return false;
    }

    static /* synthetic */ Context b(ct ct2) {
        return ct2.s();
    }

    private ef b(dq dq2) {
        int n2 = dq2.c();
        int n3 = dq2.d();
        return new ef(this.p.b(n2), this.p.b(n3));
    }

    @SuppressLint(value={"InlinedApi"})
    private void b(com.amazon.device.ads.h h2) {
        h2.a((Activity)null);
        if (this.k) {
            this.c.d("Expanded With URL");
            h2.b();
        } else {
            this.c.d("Not Expanded with URL");
        }
        h2.a((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1, 17));
        h2.d();
        h2.a(new com.amazon.device.ads.n(n.a.b));
        h2.a("mraidBridge.stateChange('default');");
        h2.a(new ViewTreeObserver.OnGlobalLayoutListener(this, h2){
            final /* synthetic */ com.amazon.device.ads.h a;
            final /* synthetic */ ct b;
            {
                this.b = ct2;
                this.a = h2;
            }

            public void onGlobalLayout() {
                this.a.b(this);
                this.b.p();
            }
        });
    }

    static /* synthetic */ ce c(ct ct2) {
        return ct2.r;
    }

    static /* synthetic */ com.amazon.device.ads.h d(ct ct2) {
        return ct2.m;
    }

    static /* synthetic */ eq e(ct ct2) {
        return ct2.v;
    }

    private void e(String string) {
        ez.g g2;
        block3 : {
            ez ez2 = this.e.a();
            ez2.d(true);
            ez2.d(string);
            try {
                g2 = ez2.c();
                if (g2 != null) break block3;
            }
            catch (ez.c c2) {
                this.a("Server could not be contacted to download picture.", "storePicture");
                return;
            }
            this.a("Server could not be contacted to download picture.", "storePicture");
            return;
        }
        Bitmap bitmap = new ch(g2.a(), this.r).a();
        if (bitmap == null) {
            this.a("Picture could not be retrieved from server.", "storePicture");
            return;
        }
        this.q.a(new Runnable(this, bitmap){
            final /* synthetic */ Bitmap a;
            final /* synthetic */ ct b;
            {
                this.b = ct2;
                this.a = bitmap;
            }

            public void run() {
                ct.a(this.b, this.a);
            }
        }, ej.b.b, ej.c.a);
    }

    static /* synthetic */ ViewGroup f(ct ct2) {
        return ct2.x;
    }

    private void r() {
        this.n.a(new b(this));
        this.n.a(new c(this));
        this.n.a(new e(this));
        this.n.a(new f(this));
        this.n.a(new g(this));
        this.n.a(new h(this));
        this.n.a(new i(this));
        this.n.a(new j(this));
        this.n.a(new k(this));
        this.n.a(new l(this));
        this.n.a(new n(this));
        this.n.a(new o(this));
        this.n.a(new q(this));
        this.n.a(new r(this));
        this.n.a(new s(this));
        this.n.a(new t(this));
        this.n.a(new u(this));
        this.n.a(new v(this));
        this.n.a(new w(this));
        this.n.a(new m(this));
        this.n.a(new p(this));
        this.n.a(new d(this));
    }

    private Context s() {
        return this.m.e();
    }

    private void t() {
        if (this.m.m()) {
            this.m.b(true ^ this.h.c());
        }
    }

    private com.amazon.device.ads.h u() {
        return this.m;
    }

    private boolean v() {
        return this.m.w();
    }

    private void w() {
        if (this.x == null) {
            if (this.w == null) {
                this.w = (FrameLayout)this.m.y();
            }
            this.x = this.u.a(this.s(), cq.a.a, "resizedView");
        }
    }

    private void x() {
        this.m.t();
    }

    private void y() {
        this.m.u();
    }

    void a(int n2, int n3, int n4, int n5) {
        this.i.a(new ef(n2, n3));
        this.i.a(n4);
        this.i.b(n5);
    }

    void a(dq dq2) {
        ef ef2 = this.b(dq2);
        this.q.a(new Runnable(this, dq2, ef2){
            final /* synthetic */ dq a;
            final /* synthetic */ ef b;
            final /* synthetic */ ct c;
            {
                this.c = ct2;
                this.a = dq2;
                this.b = ef2;
            }

            public void run() {
                ct.a(this.c, this.a, this.b);
            }
        }, ej.b.a, ej.c.a);
    }

    void a(com.amazon.device.ads.h h2) {
        cy cy2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Collapsing expanded ad ");
        stringBuilder.append((Object)this);
        cy2.d(stringBuilder.toString());
        this.q.a(new Runnable(this, h2){
            final /* synthetic */ com.amazon.device.ads.h a;
            final /* synthetic */ ct b;
            {
                this.b = ct2;
                this.a = h2;
            }

            public void run() {
                ct.a(this.b, this.a);
            }
        }, ej.b.a, ej.c.a);
    }

    public void a(String string) {
        if (this.m.j()) {
            this.a("Unable to expand an interstitial ad placement", "expand");
            return;
        }
        if (this.m.m()) {
            this.a("Unable to expand while expanded.", "expand");
            return;
        }
        if (!this.m.l()) {
            this.a("Unable to expand ad while it is not visible.", "expand");
            return;
        }
        if (this.h.a() < 50 && this.h.a() != -1 || this.h.b() < 50 && this.h.b() != -1) {
            this.a("Expand size is too small, must leave room for close.", "expand");
            return;
        }
        if (!eh.b(string)) {
            if (this.o.a(string)) {
                final bv bv2 = this.h.d();
                this.m.a(string, new dm(){

                    @Override
                    public void a(String string) {
                        ct.this.u().b("mraidBridge.stateChange('expanded');");
                        ct.this.u().b("mraidBridge.ready();");
                        com.amazon.device.ads.k.a(ct.this.u());
                        ct.this.a(string, bv2);
                    }
                });
                return;
            }
            this.a("Unable to expand with invalid URL.", "expand");
            return;
        }
        com.amazon.device.ads.k.a(this.m);
        this.a(null, this.h);
    }

    public void a(String string, String string2, String string3, String string4, String string5) {
        bj bj2;
        if (!bd.a(14)) {
            this.c.d("API version does not support calendar operations.");
            this.a("API version does not support calendar operations.", "createCalendarEvent");
            return;
        }
        try {
            bj2 = new bj(string, string2, string3, string4, string5);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.c.d(illegalArgumentException.getMessage());
            this.a(illegalArgumentException.getMessage(), "createCalendarEvent");
            return;
        }
        this.a(bj2);
    }

    public void a(JSONObject jSONObject) {
        if (this.m.j() && !this.m.m()) {
            this.m.s();
        }
        this.g.a(jSONObject);
        this.q();
    }

    public void a(boolean bl2) {
        this.h.a(bl2);
        this.t();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public cp.a b() {
        return this.n.b();
    }

    public void b(String string) {
        if (!this.m.l()) {
            this.a("Unable to play a video while the ad is not visible", "playVideo");
            return;
        }
        if (eh.a(string)) {
            this.a("Unable to play a video without a URL", "playVideo");
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", string);
            Intent intent = new Intent(this.s(), AdActivity.class);
            intent.putExtra("adapter", en.class.getName());
            intent.putExtras(bundle);
            this.s().startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            this.c.d("Failed to open VideoAction activity");
            this.a("Internal SDK Failure. Unable to launch VideoActionHandler", "playVideo");
            return;
        }
    }

    public void b(JSONObject jSONObject) {
        this.h.a(jSONObject);
        this.t();
    }

    @Override
    public String c() {
        return "mraidObject";
    }

    public void c(String string) {
        if (!this.m.l()) {
            this.a("Unable to open a URL while the ad is not visible", "open");
            return;
        }
        cy cy2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opening URL ");
        stringBuilder.append(string);
        cy2.d(stringBuilder.toString());
        if (this.o.a(string)) {
            String string2 = fb.b(string);
            if (!"http".equals((Object)string2) && !"https".equals((Object)string2)) {
                this.m.c(string);
                return;
            }
            new Object(){
                private static final String a = "cj$a";
                private final cy b;
                private final com.amazon.device.ads.bg c;
                private Context d;
                private String e;
                private boolean f;
                {
                    this(com.amazon.device.ads.bg.a(), new cz());
                }
                {
                    this.c = bg2;
                    this.b = cz2.a(a);
                }

                public cj.a a() {
                    this.f = true;
                    return this;
                }

                public cj.a a(Context context) {
                    this.d = context;
                    return this;
                }

                public cj.a a(String string) {
                    this.e = string;
                    return this;
                }

                public void b() {
                    if (this.d != null) {
                        if (!eh.b(this.e)) {
                            if (!this.c.c()) {
                                cy cy2 = this.b;
                                Object[] arrobject = new Object[]{this.e};
                                cy2.e("Could not load application assets, failed to open URI: %s", arrobject);
                                return;
                            }
                            Intent intent = new Intent(this.d, AdActivity.class);
                            intent.putExtra("adapter", cj.class.getName());
                            intent.putExtra("extra_url", this.e);
                            intent.putExtra("extra_open_btn", this.f);
                            intent.addFlags(268435456);
                            this.d.startActivity(intent);
                            return;
                        }
                        throw new IllegalArgumentException("Url must not be null or white space");
                    }
                    throw new IllegalArgumentException("Context must not be null");
                }
            }.a(this.s()).a().a(string).b();
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("URL ");
        stringBuilder2.append(string);
        stringBuilder2.append(" is not a valid URL");
        String string3 = stringBuilder2.toString();
        this.c.d(string3);
        this.a(string3, "open");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c(JSONObject jSONObject) {
        if (!this.j.a(jSONObject)) {
            this.a("Invalid resize properties", "setResizeProperties");
            return;
        }
        if (this.j.c() >= 50 && this.j.d() >= 50) {
            ef ef2 = this.m.h();
            if (this.j.c() <= ef2.a() && this.j.d() <= ef2.b()) {
                if (!this.j.h()) return;
                ef ef3 = this.b(this.j);
                int n2 = this.p.b(this.i.b() + this.j.e());
                int n3 = this.p.b(this.i.c() + this.j.f());
                if (this.a(dp.a(this.j.g()), n3, n2, ef3, this.p.b(ef2.a()), this.p.b(ef2.b()))) return;
                this.a("Invalid resize properties. Close event area must be entirely on screen.", "setResizeProperties");
                this.j.a();
                return;
            }
            this.a("Resize properties width and height cannot be larger than the maximum size.", "setResizeProperties");
            this.j.a();
            return;
        }
        this.a("Resize properties width and height must be greater than 50dp in order to fit the close button.", "setResizeProperties");
        this.j.a();
    }

    @Override
    public String d() {
        return b;
    }

    public void d(String string) {
        if (!this.d.b(this.s())) {
            this.a("Picture could not be stored because permission was denied.", "storePicture");
            return;
        }
        this.q.a(new Runnable(this, string){
            final /* synthetic */ String a;
            final /* synthetic */ ct b;
            {
                this.b = ct2;
                this.a = string;
            }

            public void run() {
                ct.a(this.b, this.a);
            }
        }, ej.b.a, ej.c.b);
    }

    @Override
    public dt e() {
        if (this.l == null) {
            this.l = new cu(this);
        }
        return this.l;
    }

    public JSONObject f() {
        if (this.m.g() == null) {
            this.a("Current position is unavailable because the ad has not yet been displayed.", "getCurrentPosition");
            return new dk(new ef(0, 0), 0, 0).d();
        }
        return this.m.g().d();
    }

    public JSONObject g() {
        return this.i.d();
    }

    public JSONObject h() {
        ef ef2 = this.m.h();
        if (ef2 == null) {
            return new ef(0, 0).c();
        }
        return ef2.c();
    }

    public JSONObject i() {
        ef ef2 = this.m.i();
        if (ef2 == null) {
            return new ef(0, 0).c();
        }
        return ef2.c();
    }

    public String j() {
        if (this.m.j()) {
            return "interstitial";
        }
        return "inline";
    }

    public JSONObject k() {
        ef ef2;
        bv bv2 = this.h.d();
        if (bv2.a() == -1) {
            ef2 = this.m.i();
            bv2.a(ef2.a());
        } else {
            ef2 = null;
        }
        if (bv2.b() == -1) {
            if (ef2 == null) {
                ef2 = this.m.i();
            }
            bv2.b(ef2.b());
        }
        return bv2.e();
    }

    public JSONObject l() {
        return this.j.i();
    }

    public void m() {
        if (!this.m.c()) {
            this.a("Unable to close ad in its current state.", "close");
        }
    }

    public void n() {
        if (this.m.j()) {
            this.a("Unable to resize an interstitial ad placement.", "resize");
            return;
        }
        if (this.m.m()) {
            this.a("Unable to resize while expanded.", "resize");
            return;
        }
        if (!this.m.l()) {
            this.a("Unable to resize ad while it is not visible.", "resize");
            return;
        }
        dq dq2 = this.j;
        if (dq2 != null && dq2.b()) {
            this.a(this.j);
            return;
        }
        this.a("Resize properties must be set before calling resize.", "resize");
    }

    public JSONObject o() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("sms", this.s().getPackageManager().hasSystemFeature("android.hardware.telephony"));
            jSONObject.put("tel", this.s().getPackageManager().hasSystemFeature("android.hardware.telephony"));
            jSONObject.put("calendar", bd.a(14));
            jSONObject.put("storePicture", this.d.b(this.s()));
            jSONObject.put("inlineVideo", bd.a(11));
        }
        catch (JSONException jSONException) {}
        return jSONObject;
    }

    void p() {
        dk dk2 = this.m.g();
        if (dk2 != null) {
            com.amazon.device.ads.h h2 = this.m;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mraidBridge.sizeChange(");
            stringBuilder.append(dk2.a().a());
            stringBuilder.append(",");
            stringBuilder.append(dk2.a().b());
            stringBuilder.append(");");
            h2.a(stringBuilder.toString());
        }
    }

    void q() {
        if (this.m.l()) {
            if (!this.m.m()) {
                return;
            }
            Activity activity = this.m.z();
            if (activity == null) {
                this.c.f("unable to handle orientation property change on a non-expanded ad");
                return;
            }
            int n2 = activity.getRequestedOrientation();
            dk dk2 = this.m.g();
            cy cy2 = this.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Current Orientation: ");
            stringBuilder.append(n2);
            cy2.d(stringBuilder.toString());
            switch (4.b[this.g.b().ordinal()]) {
                default: {
                    break;
                }
                case 2: {
                    activity.setRequestedOrientation(6);
                    break;
                }
                case 1: {
                    activity.setRequestedOrientation(7);
                }
            }
            if (cb.c.equals((Object)this.g.b())) {
                if (this.g.a().booleanValue()) {
                    if (activity.getRequestedOrientation() != -1) {
                        activity.setRequestedOrientation(-1);
                    }
                } else if (this.m.m()) {
                    activity.setRequestedOrientation(bu.a((Context)activity, this.f));
                }
            }
            int n3 = activity.getRequestedOrientation();
            cy cy3 = this.c;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("New Orientation: ");
            stringBuilder2.append(n3);
            cy3.d(stringBuilder2.toString());
            if (n3 != n2 && dk2 != null) {
                dk dk3 = this.m.g();
                if (dk2.a().a() != dk3.a().a()) {
                    this.m.a(new ViewTreeObserver.OnGlobalLayoutListener(this){
                        final /* synthetic */ ct a;
                        {
                            this.a = ct2;
                        }

                        public void onGlobalLayout() {
                            ct.d(this.a).b(this);
                            this.a.p();
                        }
                    });
                }
            }
            return;
        }
    }

    private static class b
    extends cp.b {
        private final ct a;

        public b(ct ct2) {
            super("Close");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.m();
            return null;
        }
    }

    private static class c
    extends cp.b {
        private final ct a;

        public c(ct ct2) {
            super("CreateCalendarEvent");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.a(co.a(jSONObject, "description", null), co.a(jSONObject, "location", null), co.a(jSONObject, "summary", null), co.a(jSONObject, "start", null), co.a(jSONObject, "end", null));
            return null;
        }
    }

    private static class d
    extends cp.b {
        private final ct a;

        public d(ct ct2) {
            super("DeregisterViewabilityInterest");
            this.a = ct2;
        }

        @Override
        protected JSONObject a(JSONObject jSONObject) {
            this.a.y();
            return null;
        }
    }

    private static class e
    extends cp.b {
        private final ct a;

        public e(ct ct2) {
            super("Expand");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.a(co.a(jSONObject, "url", null));
            return null;
        }
    }

    private static class f
    extends cp.b {
        private final ct a;

        public f(ct ct2) {
            super("GetCurrentPosition");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            return this.a.f();
        }
    }

    private static class g
    extends cp.b {
        private final ct a;

        public g(ct ct2) {
            super("GetDefaultPosition");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            return this.a.g();
        }
    }

    private static class h
    extends cp.b {
        private final ct a;

        public h(ct ct2) {
            super("GetExpandProperties");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            return this.a.k();
        }
    }

    private static class i
    extends cp.b {
        private final ct a;

        public i(ct ct2) {
            super("GetMaxSize");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            return this.a.h();
        }
    }

    private static class j
    extends cp.b {
        private final ct a;

        public j(ct ct2) {
            super("GetPlacementType");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            co.b(jSONObject2, "placementType", this.a.j());
            return jSONObject2;
        }
    }

    private static class k
    extends cp.b {
        private final ct a;

        public k(ct ct2) {
            super("GetResizeProperties");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            return this.a.l();
        }
    }

    private static class l
    extends cp.b {
        private final ct a;

        public l(ct ct2) {
            super("GetScreenSize");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            return this.a.i();
        }
    }

    private static class m
    extends cp.b {
        private final ct a;

        public m(ct ct2) {
            super("IsViewable");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            co.b(jSONObject2, "isViewable", this.a.v());
            return jSONObject2;
        }
    }

    private static class n
    extends cp.b {
        private final ct a;

        public n(ct ct2) {
            super("Open");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.c(co.a(jSONObject, "url", null));
            return null;
        }
    }

    private static class o
    extends cp.b {
        private final ct a;

        public o(ct ct2) {
            super("PlayVideo");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.b(co.a(jSONObject, "url", null));
            return null;
        }
    }

    private static class p
    extends cp.b {
        private final ct a;

        public p(ct ct2) {
            super("RegisterViewabilityInterest");
            this.a = ct2;
        }

        @Override
        protected JSONObject a(JSONObject jSONObject) {
            this.a.x();
            return null;
        }
    }

    private static class q
    extends cp.b {
        private final ct a;

        public q(ct ct2) {
            super("Resize");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.n();
            return null;
        }
    }

    private static class r
    extends cp.b {
        private final ct a;

        public r(ct ct2) {
            super("SetExpandProperties");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.b(jSONObject);
            return null;
        }
    }

    private static class s
    extends cp.b {
        private final ct a;

        public s(ct ct2) {
            super("SetOrientationProperties");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.a(jSONObject);
            return null;
        }
    }

    private static class t
    extends cp.b {
        private final ct a;

        public t(ct ct2) {
            super("SetResizeProperties");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.c(jSONObject);
            return null;
        }
    }

    private static class u
    extends cp.b {
        private final ct a;

        public u(ct ct2) {
            super("StorePicture");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.d(co.a(jSONObject, "url", null));
            return null;
        }
    }

    private static class v
    extends cp.b {
        private final ct a;

        public v(ct ct2) {
            super("Supports");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            return this.a.o();
        }
    }

    private static class w
    extends cp.b {
        private final ct a;

        public w(ct ct2) {
            super("UseCustomClose");
            this.a = ct2;
        }

        @Override
        public JSONObject a(JSONObject jSONObject) {
            this.a.a(co.a(jSONObject, "useCustomClose", false));
            return null;
        }
    }

}

