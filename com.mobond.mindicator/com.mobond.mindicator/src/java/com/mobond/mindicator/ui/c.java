/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.Uri
 *  android.os.Handler
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.Display
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.core.content.a
 *  com.facebook.ads.AdChoicesView
 *  com.facebook.ads.AdListener
 *  com.facebook.ads.AdSize
 *  com.facebook.ads.AdView
 *  com.facebook.ads.InterstitialAd
 *  com.facebook.ads.InterstitialAdListener
 *  com.facebook.ads.MediaView
 *  com.facebook.ads.NativeAd
 *  com.facebook.ads.NativeAdBase
 *  com.facebook.ads.NativeAdLayout
 *  com.facebook.ads.NativeAdListener
 *  com.facebook.ads.NativeBannerAd
 *  com.google.android.gms.ads.a.d
 *  com.google.android.gms.ads.a.d$a
 *  com.google.android.gms.ads.b
 *  com.google.android.gms.ads.c
 *  com.google.android.gms.ads.c$a
 *  com.google.android.gms.ads.d
 *  com.google.android.gms.ads.d$a
 *  com.google.android.gms.ads.e
 *  com.google.android.gms.ads.formats.MediaView
 *  com.google.android.gms.ads.formats.UnifiedNativeAdView
 *  com.google.android.gms.ads.formats.b
 *  com.google.android.gms.ads.formats.b$b
 *  com.google.android.gms.ads.formats.c
 *  com.google.android.gms.ads.formats.c$a
 *  com.google.android.gms.ads.formats.j
 *  com.google.android.gms.ads.formats.j$a
 *  com.google.android.gms.ads.g
 *  com.google.android.gms.ads.j
 *  com.google.android.gms.ads.k
 *  com.google.android.gms.ads.m
 *  com.mobond.mindicator.ui.AnimatedGifImageView
 *  com.mobond.mindicator.ui.c$1
 *  com.mobond.mindicator.ui.c$10
 *  com.mobond.mindicator.ui.c$11
 *  com.mobond.mindicator.ui.c$12
 *  com.mobond.mindicator.ui.c$13
 *  com.mobond.mindicator.ui.c$14
 *  com.mobond.mindicator.ui.c$15
 *  com.mobond.mindicator.ui.c$16
 *  com.mobond.mindicator.ui.c$17
 *  com.mobond.mindicator.ui.c$6
 *  com.mobond.mindicator.ui.c$7
 *  com.mobond.mindicator.ui.c$8
 *  com.mobond.mindicator.ui.c$9
 *  com.mobond.mindicator.ui.k
 *  com.mulo.b.e
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Vector
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.device.ads.cm;
import com.amazon.device.ads.p;
import com.amazon.device.ads.q;
import com.amazon.device.ads.y;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.ads.a.d;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.m;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.AnimatedGifImageView;
import com.mobond.mindicator.ui.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;

public class c {
    public static int a;
    public static int b;
    public static com.google.android.gms.ads.j c;
    public static InterstitialAd d;
    public static cm e;
    public static boolean f;
    public static Vector<Object> g;

    static {
        g = new Vector();
    }

    public static float a(float f2) {
        return Math.round((float)(f2 * ((float)Resources.getSystem().getDisplayMetrics().densityDpi / 160.0f)));
    }

    public static int a(Activity activity) {
        if (a == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            a = displayMetrics.widthPixels;
        }
        return a;
    }

    private static int a(String string, String string2, int n2) {
        String string3 = "";
        if (string != "ca-app-pub-5449278086868932/8862800847" && string2 != "ca-app-pub-5449278086868932/2495764777") {
            if (string != "ca-app-pub-5449278086868932/8814463646" && string2 != "ca-app-pub-5449278086868932/2827166481") {
                if (string2 == "ca-app-pub-5449278086868932/1803705332") {
                    string3 = "ADTYPE_RAIL_AB_TAB";
                } else if (string2 == "ca-app-pub-5449278086868932/2673933872") {
                    string3 = "ADTYPE_RAIL_FARE_TAB";
                } else if (string != "ca-app-pub-5449278086868932/5581795649" && string2 != "ca-app-pub-5449278086868932/5808553047") {
                    if (string2 == "ca-app-pub-5449278086868932/3752145001") {
                        string3 = "ADTYPE_RAIL_TRAINS_AT_STATION_UI_MERGED";
                    } else if (string != "ca-app-pub-5449278086868932/2269602980" && string2 != "ca-app-pub-5449278086868932/9009431450") {
                        if (string != "ca-app-pub-5449278086868932/7058528848" && string2 != "ca-app-pub-5449278086868932/8462636540") {
                            if (string != "ca-app-pub-5449278086868932/8535262043" && string2 != "ca-app-pub-5449278086868932/8654208238") {
                                if (string != "ca-app-pub-5449278086868932/1011995242" && string2 != "ca-app-pub-5449278086868932/4134355207") {
                                    if (string != "ca-app-pub-5449278086868932/1618940842" && string2 != "ca-app-pub-5449278086868932/4916953830") {
                                        if (string != "ca-app-pub-5449278086868932/4212480449" && string2 != "ca-app-pub-5449278086868932/7915841632") {
                                            if (string != "ca-app-pub-5449278086868932/1588077097" && string2 != "ca-app-pub-5449278086868932/5164365847") {
                                                if (string2 == "ca-app-pub-5449278086868932/4472911333") {
                                                    string3 = "ADTYPE_BUS_HOME";
                                                } else if (string != "ca-app-pub-5449278086868932/9453592041" && string2 != "ca-app-pub-5449278086868932/3131909501") {
                                                    if (string != "ca-app-pub-5449278086868932/3407058446" && string2 != "ca-app-pub-5449278086868932/5730152689") {
                                                        if (string != "ca-app-pub-5449278086868932/4883791647" && string2 != "ca-app-pub-5449278086868932/4294137300") {
                                                            if (string != "ca-app-pub-5449278086868932/4317363979" && string2 != "ca-app-pub-5449278086868932/2789483946") {
                                                                if (string != "ca-app-pub-5449278086868932/6360524847" && string2 != "ca-app-pub-5449278086868932/2884497495") {
                                                                    if (string != "ca-app-pub-5449278086868932/3127856846" && string2 != "ca-app-pub-5449278086868932/5482740674") {
                                                                        if (string == "ca-app-pub-5449278086868932/4604590046") {
                                                                            string3 = "ADTYPE_IR_SELECT_STATION";
                                                                        } else if (string != "ca-app-pub-5449278086868932/6081323245" && string2 != "ca-app-pub-5449278086868932/5196155433") {
                                                                            if (string != "ca-app-pub-5449278086868932/9034789644" && string2 != "ca-app-pub-5449278086868932/9585637215") {
                                                                                if (string != "ca-app-pub-5449278086868932/1511522842" && string2 != "ca-app-pub-5449278086868932/5383857690") {
                                                                                    if (string != "ca-app-pub-5449278086868932/4464989249" && string2 != "ca-app-pub-5449278086868932/2953135470") {
                                                                                        if (string != "ca-app-pub-5449278086868932/5724672771" && string2 != "ca-app-pub-5449278086868932/5099597292") {
                                                                                            if (string != "ca-app-pub-5449278086868932/5533101087" && string2 != "ca-app-pub-5449278086868932/9897817773") {
                                                                                                if (string != "ca-app-pub-5449278086868932/5882846849" && string2 != "ca-app-pub-5449278086868932/5519589065") {
                                                                                                    if (string != "ca-app-pub-5449278086868932/7359580046" && string2 != "ca-app-pub-5449278086868932/6126093727") {
                                                                                                        if (string != "ca-app-pub-5449278086868932/8836313246" && string2 != "ca-app-pub-5449278086868932/4809142623") {
                                                                                                            if (string != "ca-app-pub-5449278086868932/1313046442" && string2 != "ca-app-pub-5449278086868932/7024242427") {
                                                                                                                if (string != "ca-app-pub-5449278086868932/9843348351" && string2 != "ca-app-pub-5449278086868932/1033549143") {
                                                                                                                    if (string != "ca-app-pub-5449278086868932/8121404277" && string2 != "ca-app-pub-5449278086868932/5000714311") {
                                                                                                                        if (string != "ca-app-pub-5449278086868932/6199372042" && string2 != "ca-app-pub-5449278086868932/6710571171") {
                                                                                                                            if (string != "ca-app-pub-5449278086868932/4583038044" && string2 != "ca-app-pub-5449278086868932/1496583576") {
                                                                                                                                if (string != "ca-app-pub-5449278086868932/7536504447" && string2 != "ca-app-pub-5449278086868932/3814435789") {
                                                                                                                                    if (string != "ca-app-pub-5449278086868932/7482078444" && string2 != "ca-app-pub-5449278086868932/3164888467") {
                                                                                                                                        if (string != "ca-app-pub-5449278086868932/4722638841" && string2 != "ca-app-pub-5449278086868932/4424933586") {
                                                                                                                                            if (string != "ca-app-pub-5449278086868932/6338972840" && string2 != "ca-app-pub-5449278086868932/4425999245") {
                                                                                                                                                if (string != "ca-app-pub-5449278086868932/7815706041" && string2 != "ca-app-pub-5449278086868932/6863394666") {
                                                                                                                                                    if (string != "ca-app-pub-5449278086868932/4618660044" && string2 != "ca-app-pub-5449278086868932/7982100875") {
                                                                                                                                                        if (string != "ca-app-pub-5449278086868932/9292439244" && string2 != "ca-app-pub-5449278086868932/9678325929") {
                                                                                                                                                            if (string != "ca-app-pub-5449278086868932/2659246490" && string2 != "ca-app-pub-5449278086868932/1113440191") {
                                                                                                                                                                if (string2 == "ca-app-pub-5449278086868932/4334020976") {
                                                                                                                                                                    string3 = "ADTYPE_NEWS_ALERT";
                                                                                                                                                                } else if (string != "ca-app-pub-5449278086868932/5875733127" && string2 != "ca-app-pub-5449278086868932/7851638700") {
                                                                                                                                                                    if (string2 == "ca-app-pub-5449278086868932/1716653926") {
                                                                                                                                                                        string3 = "ADTYPE_EXIT";
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    string3 = "ADTYPE_WEBUI";
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                string3 = "ADTYPE_TRAFFIC_PENALTIES";
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            string3 = "ADTYPE_NATAK";
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        string3 = "ADTYPE_PROPERTY";
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    string3 = "ADTYPE_EMERGENCY";
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                string3 = "ADTYPE_PICNIC";
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            string3 = "ADTYPE_JOBS";
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        string3 = "ADTYPE_TRAIN_CHAT";
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    string3 = "ADTYPE_FERRY";
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                string3 = "ADTYPE_TAXI";
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            string3 = "ADTYPE_AUTO";
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        string3 = "ADTYPE_MSRTC_BUS_DEPOT";
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    string3 = "ADTYPE_MSRTC_BUS_ROUTE_DETAILS";
                                                                                                                }
                                                                                                            } else {
                                                                                                                string3 = "ADTYPE_MSRTC_BUS_ROUTE";
                                                                                                            }
                                                                                                        } else {
                                                                                                            string3 = "ADTYPE_MSRTC_BUS_LIST_UI";
                                                                                                        }
                                                                                                    } else {
                                                                                                        string3 = "ADTYPE_MSRTC_AC";
                                                                                                    }
                                                                                                } else {
                                                                                                    string3 = "ADTYPE_MSRTC_HOME";
                                                                                                }
                                                                                            } else {
                                                                                                string3 = "ADTYPE_IR_ALARMS";
                                                                                            }
                                                                                        } else {
                                                                                            string3 = "ADTYPE_IR_PACKING";
                                                                                        }
                                                                                    } else {
                                                                                        string3 = "ADTYPE_IR_PNR";
                                                                                    }
                                                                                } else {
                                                                                    string3 = "ADTYPE_IR_TRAIN_DETAILS_RESULT";
                                                                                }
                                                                            } else {
                                                                                string3 = "ADTYPE_IR_SEAT_AVL_RESULT_V2";
                                                                            }
                                                                        } else {
                                                                            string3 = "ADTYPE_IR_SEARCH_RESULT_V2";
                                                                        }
                                                                    } else {
                                                                        string3 = "ADTYPE_IR_HOME";
                                                                    }
                                                                } else {
                                                                    string3 = "ADTYPE_BUS_TIMING_UI";
                                                                }
                                                            } else {
                                                                string3 = "ADTYPE_BUS_SELECT_STOP";
                                                            }
                                                        } else {
                                                            string3 = "ADTYPE_BUS_ROUTE_UI";
                                                        }
                                                    } else {
                                                        string3 = "ADTYPE_BUS_NUMBERS_UI";
                                                    }
                                                } else {
                                                    string3 = "ADTYPE_BUS_SELECT_SOURCE_DEST";
                                                }
                                            } else {
                                                string3 = "ADTYPE_RAIL_AB_RESULT_UI";
                                            }
                                        } else {
                                            string3 = "ADTYPE_RAIL_DESTINATION_SELECT_UI";
                                        }
                                    } else {
                                        string3 = "ADTYPE_RAIL_SOURCE_SELECT_UI";
                                    }
                                } else {
                                    string3 = "ADTYPE_RAIL_YOU_ARE_AT";
                                }
                            } else {
                                string3 = "ADTYPE_RAIL_SELECT_DIRECTION";
                            }
                        } else {
                            string3 = "ADTYPE_RAIL_SELECT_LINE";
                        }
                    } else {
                        string3 = "ADTYPE_RAIL_TRACE_TRAIN_UI";
                    }
                } else {
                    string3 = "ADTYPE_RAIL_TRAINS_AT_STATION_UI";
                }
            } else {
                string3 = "ADTYPE_RAIL_STATION_TAB";
            }
        } else {
            string3 = "ADTYPE_HOME_V2";
        }
        String string4 = com.mobond.mindicator.fcm.a.a(string3);
        if (string4 != null) {
            int n3 = -1;
            switch (string4.hashCode()) {
                default: {
                    break;
                }
                case 1683199679: {
                    if (!string4.equals((Object)"NATIVE_SMALL")) break;
                    n3 = 3;
                    break;
                }
                case 1676393715: {
                    if (!string4.equals((Object)"NATIVE_LARGE")) break;
                    n3 = 5;
                    break;
                }
                case 460506269: {
                    if (!string4.equals((Object)"NATIVE_MEDIUM")) break;
                    n3 = 4;
                    break;
                }
                case 79011047: {
                    if (!string4.equals((Object)"SMALL")) break;
                    n3 = 1;
                    break;
                }
                case 2402104: {
                    if (!string4.equals((Object)"NONE")) break;
                    n3 = 0;
                    break;
                }
                case -10879412: {
                    if (!string4.equals((Object)"NATIVE_ULTRA_SMALL")) break;
                    n3 = 2;
                    break;
                }
                case -361751482: {
                    if (!string4.equals((Object)"NATIVE_EXIT")) break;
                    n3 = 6;
                }
            }
            switch (n3) {
                default: {
                    return 2;
                }
                case 6: {
                    return 6;
                }
                case 5: {
                    return 5;
                }
                case 4: {
                    return 4;
                }
                case 3: {
                    if (string2 == "ca-app-pub-5449278086868932/5482740674") {
                        return 4;
                    }
                    return 3;
                }
                case 2: {
                    return 1;
                }
                case 1: {
                    return 2;
                }
                case 0: 
            }
            return 0;
        }
        return n2;
    }

    public static View a(Activity activity, int n2, b b2, k k2) {
        LinearLayout linearLayout = new LinearLayout((Context)activity);
        c.a a2 = new c.a((Context)activity, "/79488325/dfpnativeadunit_exit");
        15 var6_6 = new 15(activity, n2, k2, linearLayout, b2);
        a2.a((j.a)var6_6).a((com.google.android.gms.ads.b)new 14(b2)).a(new c.a().a()).a().a(c.b((Context)activity));
        return linearLayout;
    }

    static /* synthetic */ View a(Activity activity, View view, String string, String string2, int n2, b b2, int n3) {
        return c.b(activity, view, string, string2, n2, b2, n3);
    }

    public static View a(Activity activity, View view, String string, String string2, String string3, String string4, int n2, int n3, int n4, b b2) {
        return c.a(activity, view, string, string2, string3, string4, -1, -1, n4, b2, new k(), false, null);
    }

    /*
     * Exception decompiling
     */
    public static View a(Activity var0, View var1, String var2, String var3, String var4, String var5, int var6, int var7, int var8, b var9, k var10, boolean var11, String var12) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl237.1 : ACONST_NULL : trying to set 0 previously set to 1
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

    public static View a(Activity activity, View view, String string, String string2, String string3, String string4, int n2, int n3, int n4, b b2, String string5) {
        return c.a(activity, view, string, string2, string3, string4, -1, -1, n4, b2, new k(), false, string5);
    }

    public static View a(Activity activity, View view, String string, String string2, String string3, String string4, int n2, b b2) {
        return c.a(activity, view, string, string2, string3, string4, -1, -1, n2, b2, null);
    }

    public static View a(Activity activity, View view, String string, String string2, String string3, String string4, int n2, b b2, k k2, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prepareAdView 111 adtype:");
        stringBuilder.append(n2);
        stringBuilder.append(" activty:");
        stringBuilder.append(activity.getClass().getName());
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        return c.a(activity, view, string, string2, string3, string4, -1, -1, n2, b2, k2, bl2, null);
    }

    public static View a(Activity activity, View view, String string, String string2, String string3, String string4, int n2, b b2, k k2, boolean bl2, String string5) {
        return c.a(activity, view, string, string2, string3, string4, -1, -1, n2, b2, k2, bl2, string5);
    }

    public static View a(Activity activity, View view, String string, String string2, String string3, String string4, int n2, b b2, String string5) {
        return c.a(activity, view, string, string2, string3, string4, -1, -1, n2, b2, string5);
    }

    private static View a(Activity activity, View view, String string, String string2, String string3, String string4, String string5, int n2, b b2, k k2, boolean bl2) {
        LinearLayout linearLayout = new LinearLayout((Context)activity);
        c.a a2 = new c.a((Context)activity, string5);
        17 var13_13 = new 17(n2, activity, k2, view, linearLayout, b2);
        c.a a3 = a2.a((j.a)var13_13);
        16 var15_15 = new 16(activity, view, string, string2, string3, string4, n2, b2, k2, bl2);
        a3.a((com.google.android.gms.ads.b)var15_15).a(new c.a().a()).a().a(c.b((Context)activity));
        return linearLayout;
    }

    static /* synthetic */ View a(Activity activity, NativeAdBase nativeAdBase, int n2, k k2) {
        return c.b(activity, nativeAdBase, n2, k2);
    }

    static /* synthetic */ View a(Activity activity, j j2, int n2, k k2) {
        return c.b(activity, j2, n2, k2);
    }

    static /* synthetic */ View a(Activity activity, String string, String string2, b b2, int n2, k k2, int n3) {
        return c.b(activity, string, string2, b2, n2, k2, n3);
    }

    static d a(Context context) {
        String string;
        com.mobond.mindicator.b b2 = a.a(context);
        d.a a2 = new d.a();
        a2.b("C36806ADE27969B7D546A695F1535322");
        a2.b("209753DD0A9C645B508BD059B75720B8");
        a2.b("a37660f2-c6c9-493c-89eb-b41ab85e286e");
        a2.b("0f55cf9a341413e9");
        String string2 = b2.b("selected_station");
        if (string2 != null && !string2.equals((Object)"")) {
            a2.a(string2);
        }
        if ((string = b2.A()) != null && !string.equals((Object)"")) {
            a2.a(string);
        }
        return a2.a();
    }

    static /* synthetic */ UnifiedNativeAdView a(Activity activity, int n2, j j2, k k2, boolean bl2) {
        return c.b(activity, n2, j2, k2, bl2);
    }

    public static g a(Activity activity, View view, String string, View view2) {
        return null;
    }

    static /* synthetic */ void a(Activity activity, int n2, j j2, UnifiedNativeAdView unifiedNativeAdView, k k2, boolean bl2) {
        c.b(activity, n2, j2, unifiedNativeAdView, k2, bl2);
    }

    public static void a(Context context, int n2) {
        f = false;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("loadInterstitialAd ");
        stringBuilder.append(n2);
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        String[] arrstring = com.mobond.mindicator.b.b(context);
        if (n2 < arrstring.length) {
            if (arrstring[n2].trim().equals((Object)"admob")) {
                c.c(context, n2);
                return;
            }
            if (arrstring[n2].trim().equals((Object)"facebook")) {
                c.b(context, n2);
                return;
            }
            if (arrstring[n2].trim().equals((Object)"amazon")) {
                c.d(context, n2);
            }
        }
    }

    public static void a(View view) {
        if (view instanceof g) {
            ((g)view).a();
            return;
        }
        if (view instanceof m) {
            ((m)view).a();
        }
    }

    public static void a(ViewGroup viewGroup) {
    }

    public static boolean a() {
        com.google.android.gms.ads.j j2;
        InterstitialAd interstitialAd;
        cm cm2;
        if (!f && (interstitialAd = d) != null && interstitialAd.isAdLoaded()) {
            f = true;
            d.show();
            d = null;
            return true;
        }
        if (!f && (j2 = c) != null && j2.a()) {
            f = true;
            c.b();
            c = null;
            return true;
        }
        if (!f && (cm2 = e) != null && cm2.g()) {
            f = true;
            e.i();
            e = null;
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private static boolean a(String var0, Activity var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl63.1 : ICONST_0 : trying to set 1 previously set to 0
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

    public static int b(Activity activity) {
        if (b == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            b = displayMetrics.heightPixels;
        }
        return b;
    }

    private static View b(Activity activity, View view, String string, String string2, int n2, b b2, int n3) {
        String[] arrstring = com.mobond.mindicator.b.a((Context)activity);
        if (n3 < arrstring.length) {
            if (arrstring[n3].equals((Object)"facebook")) {
                return c.c(activity, view, string, string2, n2, b2, n3);
            }
            if (arrstring[n3].equals((Object)"admob")) {
                return c.d(activity, view, string, string2, n2, b2, n3);
            }
            if (arrstring[n3].equals((Object)"amazon")) {
                return c.e(activity, view, string, string2, n2, b2, n3);
            }
        }
        if (b2 != null) {
            b2.a();
        }
        return null;
    }

    private static View b(Activity activity, NativeAdBase nativeAdBase, int n2, k k2) {
        RelativeLayout relativeLayout;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("111 populateFbNativeAd adtype:");
        stringBuilder.append(n2);
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("222 fbNativeAd.getAdBodyText():");
        stringBuilder2.append(nativeAdBase.getAdBodyText());
        stringBuilder2.append(" activity:");
        stringBuilder2.append(activity.getClass().getName());
        Log.d((String)"xxxx", (String)stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("333 fbNativeAd.getAdSocialContext():");
        stringBuilder3.append(nativeAdBase.getAdSocialContext());
        stringBuilder3.append(" activity:");
        stringBuilder3.append(activity.getClass().getName());
        Log.d((String)"xxxx", (String)stringBuilder3.toString());
        if (n2 == 1) {
            relativeLayout = (RelativeLayout)activity.getLayoutInflater().inflate(2131492919, null);
        } else if (n2 == 3) {
            relativeLayout = (RelativeLayout)activity.getLayoutInflater().inflate(2131492918, null);
        } else if (n2 == 4) {
            relativeLayout = (RelativeLayout)activity.getLayoutInflater().inflate(2131492917, null);
        } else if (n2 == 5) {
            relativeLayout = (RelativeLayout)activity.getLayoutInflater().inflate(2131492916, null);
        } else {
            relativeLayout = null;
            if (n2 == 6) {
                relativeLayout = (RelativeLayout)activity.getLayoutInflater().inflate(2131492915, null);
            }
        }
        if (relativeLayout != null) {
            ImageView imageView = (ImageView)relativeLayout.findViewById(2131297010);
            TextView textView = (TextView)relativeLayout.findViewById(2131297012);
            textView.setText((CharSequence)nativeAdBase.getAdvertiserName());
            textView.setTextColor(Color.parseColor((String)k2.a));
            final MediaView mediaView = (MediaView)relativeLayout.findViewById(2131297011);
            if (mediaView != null) {
                mediaView.setVisibility(8);
                if (n2 == 5 || n2 == 6) {
                    new Handler().postDelayed(new Runnable(){

                        public void run() {
                            mediaView.setVisibility(0);
                        }
                    }, 1000L);
                }
            }
            TextView textView2 = (TextView)relativeLayout.findViewById(2131297007);
            textView2.setTextColor(Color.parseColor((String)k2.b));
            textView2.setText((CharSequence)nativeAdBase.getAdBodyText());
            if (n2 != 6) {
                relativeLayout.findViewById(2131296834).setBackgroundColor(Color.parseColor((String)k2.f));
            }
            TextView textView3 = (TextView)relativeLayout.findViewById(2131297008);
            textView3.setTextColor(Color.parseColor((String)k2.d));
            View view = relativeLayout.findViewById(2131297009);
            if (n2 != 3 && n2 != 1) {
                textView3.setText((CharSequence)nativeAdBase.getAdCallToAction().toUpperCase());
            } else {
                textView3.setText((CharSequence)nativeAdBase.getAdCallToAction().replace((CharSequence)" ", (CharSequence)"\n").toUpperCase());
            }
            AdChoicesView adChoicesView = new AdChoicesView(relativeLayout.getContext(), nativeAdBase, true);
            LinearLayout linearLayout = (LinearLayout)relativeLayout.findViewById(2131296345);
            linearLayout.removeAllViews();
            linearLayout.addView((View)adChoicesView);
            if (activity.getLocalClassName().contains((CharSequence)"ui.indianrail")) {
                view.setBackgroundColor(androidx.core.content.a.c((Context)activity, (int)2131099879));
            }
            ArrayList arrayList = new ArrayList();
            if (mediaView != null) {
                arrayList.add((Object)mediaView);
            }
            arrayList.add((Object)textView);
            arrayList.add((Object)textView2);
            arrayList.add((Object)imageView);
            arrayList.add((Object)textView3);
            if (nativeAdBase instanceof NativeBannerAd) {
                ((NativeBannerAd)nativeAdBase).registerViewForInteraction((View)relativeLayout, imageView, (List)arrayList);
                return relativeLayout;
            }
            if (nativeAdBase instanceof NativeAd) {
                ((NativeAd)nativeAdBase).registerViewForInteraction((View)relativeLayout, mediaView, imageView, (List)arrayList);
            }
        }
        return relativeLayout;
    }

    private static View b(final Activity activity, j j2, int n2, k k2) {
        UnifiedNativeAdView unifiedNativeAdView;
        if (n2 == 1) {
            unifiedNativeAdView = (UnifiedNativeAdView)activity.getLayoutInflater().inflate(2131492926, null);
        } else if (n2 == 3) {
            unifiedNativeAdView = (UnifiedNativeAdView)activity.getLayoutInflater().inflate(2131492925, null);
        } else if (n2 == 4) {
            unifiedNativeAdView = (UnifiedNativeAdView)activity.getLayoutInflater().inflate(2131492924, null);
        } else if (n2 == 5) {
            unifiedNativeAdView = (UnifiedNativeAdView)activity.getLayoutInflater().inflate(2131492923, null);
        } else {
            unifiedNativeAdView = null;
            if (n2 == 6) {
                unifiedNativeAdView = (UnifiedNativeAdView)activity.getLayoutInflater().inflate(2131492922, null);
            }
        }
        if (unifiedNativeAdView != null) {
            ImageView imageView = (ImageView)unifiedNativeAdView.findViewById(2131297010);
            unifiedNativeAdView.setIconView((View)imageView);
            Animation animation = AnimationUtils.loadAnimation((Context)activity, (int)2130771993);
            b.b b2 = j2.d();
            if (b2 != null) {
                imageView.setImageDrawable(b2.a());
                imageView.setAnimation(animation);
                imageView.startAnimation(animation);
            } else {
                imageView.setVisibility(8);
            }
            TextView textView = (TextView)unifiedNativeAdView.findViewById(2131297012);
            unifiedNativeAdView.setHeadlineView((View)textView);
            textView.setText((CharSequence)j2.a());
            textView.setTextColor(Color.parseColor((String)k2.a));
            TextView textView2 = (TextView)unifiedNativeAdView.findViewById(2131297007);
            unifiedNativeAdView.setBodyView((View)textView2);
            textView2.setText((CharSequence)j2.c());
            textView2.setTextColor(Color.parseColor((String)k2.b));
            if (n2 != 6) {
                unifiedNativeAdView.findViewById(2131296834).setBackgroundColor(Color.parseColor((String)k2.f));
            }
            TextView textView3 = (TextView)unifiedNativeAdView.findViewById(2131297008);
            unifiedNativeAdView.setCallToActionView((View)textView3);
            textView3.setTextColor(Color.parseColor((String)k2.d));
            if (n2 != 3 && n2 != 1) {
                textView3.setText((CharSequence)j2.e().toUpperCase());
            } else {
                textView3.setText((CharSequence)j2.e().replace((CharSequence)" ", (CharSequence)"\n").toUpperCase());
            }
            FrameLayout frameLayout = (FrameLayout)unifiedNativeAdView.findViewById(2131297009);
            if (activity.getLocalClassName().contains((CharSequence)"ui.indianrail")) {
                frameLayout.setBackgroundColor(androidx.core.content.a.c((Context)activity, (int)2131099879));
            }
            if (n2 == 5 || n2 == 6) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("1111 populateAdmobUnifiedNativeAdView adtype:");
                stringBuilder.append(n2);
                Log.d((String)"xxxx", (String)stringBuilder.toString());
                final com.google.android.gms.ads.formats.MediaView mediaView = (com.google.android.gms.ads.formats.MediaView)unifiedNativeAdView.findViewById(2131297011);
                mediaView.setMediaContent(j2.l());
                mediaView.setImageScaleType(ImageView.ScaleType.FIT_XY);
                mediaView.setVisibility(0);
                unifiedNativeAdView.setMediaView(mediaView);
                List list = j2.b();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("2222 populateAdmobUnifiedNativeAdView images.size():");
                stringBuilder2.append(list.size());
                stringBuilder2.append(activity.getClass().getName());
                Log.d((String)"xxxx", (String)stringBuilder2.toString());
                if (list != null && !list.isEmpty()) {
                    final Drawable drawable = ((b.b)list.get(0)).a();
                    Log.d((String)"xxxx", (String)"2211 populateAdmobUnifiedNativeAdView");
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("3333 populateAdmobUnifiedNativeAdView imgDr:");
                    stringBuilder3.append((Object)drawable);
                    Log.d((String)"xxxx", (String)stringBuilder3.toString());
                    mediaView.post(new Runnable(){

                        public void run() {
                            int n2 = mediaView.getWidth();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("2222 populateAdmobUnifiedNativeAdView imageViewWidth:");
                            stringBuilder.append(n2);
                            stringBuilder.append(" ");
                            stringBuilder.append(activity.getClass().getName());
                            Log.d((String)"xxxx", (String)stringBuilder.toString());
                            if (n2 == 0) {
                                Log.d((String)"xxxx", (String)"2222 11");
                                n2 = c.a(activity);
                                Log.d((String)"xxxx", (String)"2222 22");
                            }
                            int n3 = drawable.getIntrinsicWidth();
                            int n4 = drawable.getIntrinsicHeight();
                            Log.d((String)"xxxx", (String)"2222 33");
                            int n5 = Math.round((float)((float)n2 / (float)n3 * (float)n4));
                            Log.d((String)"xxxx", (String)"2222 44");
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n2, n5);
                            Log.d((String)"xxxx", (String)"2222 55");
                            mediaView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("2222 66 imageViewWidth:");
                            stringBuilder2.append(n2);
                            stringBuilder2.append(" newHeight:");
                            stringBuilder2.append(n5);
                            Log.d((String)"xxxx", (String)stringBuilder2.toString());
                        }
                    });
                }
            }
            Log.d((String)"xxxx", (String)"5555 setNativeAd called:");
            unifiedNativeAdView.setNativeAd(j2);
        }
        return unifiedNativeAdView;
    }

    private static View b(Activity activity, String string, String string2, b b2, int n2, k k2, int n3) {
        String[] arrstring = com.mobond.mindicator.b.a((Context)activity);
        if (n3 < arrstring.length) {
            if (arrstring[n3].equals((Object)"facebook")) {
                return c.c(activity, string, string2, b2, n2, k2, n3);
            }
            if (arrstring[n3].equals((Object)"admob")) {
                return c.d(activity, string, string2, b2, n2, k2, n3);
            }
            if (arrstring[n3].equals((Object)"amazon")) {
                return c.b(activity, string, string2, b2, n2, k2, n3 + 1);
            }
        }
        if (b2 != null) {
            b2.a();
        }
        return null;
    }

    static com.google.android.gms.ads.a.d b(Context context) {
        String string;
        com.mobond.mindicator.b b2 = a.a(context);
        d.a a2 = new d.a();
        a2.a("C36806ADE27969B7D546A695F1535322");
        a2.a("209753DD0A9C645B508BD059B75720B8");
        String string2 = b2.A();
        if (string2 != null && !string2.equals((Object)"")) {
            a2.a("city", string2);
        }
        if ((string = b2.b("selected_station")) != null && !string.equals((Object)"")) {
            a2.a("station", string);
        }
        return a2.a();
    }

    private static UnifiedNativeAdView b(final Activity activity, int n2, j j2, k k2, boolean bl2) {
        UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)activity.getLayoutInflater().inflate(2131492910, null);
        final List list = j2.b();
        String string = j2.c();
        if (!list.isEmpty()) {
            final Drawable drawable = ((b.b)list.get(0)).a();
            if (string.equalsIgnoreCase("gif")) {
                final AnimatedGifImageView animatedGifImageView = (AnimatedGifImageView)unifiedNativeAdView.findViewById(2131296584);
                if (animatedGifImageView != null) {
                    unifiedNativeAdView.setImageView((View)animatedGifImageView);
                    new Thread(new Runnable(){

                        public void run() {
                            try {
                                String string = String.valueOf((Object)((b.b)list.get(0)).b());
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("uri     ");
                                stringBuilder.append(string);
                                Log.d((String)"click1", (String)stringBuilder.toString());
                                final byte[] arrby = com.mulo.b.e.b((String)string);
                                activity.runOnUiThread(new Runnable(){

                                    public void run() {
                                        try {
                                            Log.d((String)"click1", (String)"start");
                                            animatedGifImageView.a(arrby, AnimatedGifImageView.a.b);
                                            animatedGifImageView.setVisibility(0);
                                            return;
                                        }
                                        catch (Exception exception) {
                                            exception.printStackTrace();
                                            return;
                                        }
                                    }
                                });
                                return;
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                return;
                            }
                        }

                    }).start();
                }
            } else {
                final ImageView imageView = (ImageView)unifiedNativeAdView.findViewById(2131296585);
                if (imageView != null) {
                    imageView.setVisibility(0);
                    unifiedNativeAdView.setImageView((View)imageView);
                    imageView.post(new Runnable(){

                        public void run() {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                            imageView.setAdjustViewBounds(true);
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
        }
        unifiedNativeAdView.setNativeAd(j2);
        return unifiedNativeAdView;
    }

    private static void b(final Activity activity, int n2, j j2, UnifiedNativeAdView unifiedNativeAdView, k k2, boolean bl2) {
        List list;
        FrameLayout frameLayout;
        ImageView imageView = (ImageView)unifiedNativeAdView.findViewById(2131297010);
        TextView textView = (TextView)unifiedNativeAdView.findViewById(2131297012);
        TextView textView2 = (TextView)unifiedNativeAdView.findViewById(2131297007);
        TextView textView3 = (TextView)unifiedNativeAdView.findViewById(2131297008);
        TextView textView4 = (TextView)unifiedNativeAdView.findViewById(2131297009);
        if (textView != null) {
            unifiedNativeAdView.setHeadlineView((View)textView);
        }
        if (imageView != null) {
            Animation animation = AnimationUtils.loadAnimation((Context)activity, (int)2130771993);
            imageView.setAnimation(animation);
            unifiedNativeAdView.setIconView((View)imageView);
            imageView.startAnimation(animation);
        }
        if (textView2 != null) {
            unifiedNativeAdView.setBodyView((View)textView2);
        }
        if (textView4 != null) {
            unifiedNativeAdView.setCallToActionView((View)textView4);
        }
        String string = j2.a();
        textView.setText((CharSequence)string);
        if (textView != null) {
            if (!string.isEmpty() && !string.equals((Object)"none")) {
                textView.setTextColor(Color.parseColor((String)k2.a));
                textView.setText((CharSequence)string);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        String string2 = j2.c();
        textView2.setText((CharSequence)string2);
        if (textView2 != null) {
            if (!(string2.isEmpty() || string2.equals((Object)"gif") || string2.equals((Object)"none"))) {
                textView2.setVisibility(0);
                textView2.setText((CharSequence)j2.c());
                textView2.setTextColor(Color.parseColor((String)k2.b));
            } else {
                textView2.setVisibility(8);
            }
        }
        if (textView3 != null) {
            textView3.setTextColor(Color.parseColor((String)k2.d));
            String string3 = j2.e();
            if (string3 != null) {
                if (!string3.isEmpty() && !string3.equals((Object)"none")) {
                    if (n2 != 3 && n2 != 2 && n2 != 1) {
                        textView3.setText((CharSequence)string3.toUpperCase());
                        View view = unifiedNativeAdView.findViewById(2131296834);
                        if (view != null) {
                            view.setBackgroundColor(Color.parseColor((String)k2.f));
                        }
                    } else {
                        textView3.setText((CharSequence)string3.replace((CharSequence)" ", (CharSequence)"\n").toUpperCase());
                    }
                    textView3.setVisibility(0);
                } else {
                    textView3.setVisibility(8);
                }
            }
        }
        if ((frameLayout = (FrameLayout)unifiedNativeAdView.findViewById(2131297009)) != null) {
            frameLayout.setBackgroundColor(Color.parseColor((String)k2.e));
        }
        if (!(list = j2.b()).isEmpty()) {
            final Drawable drawable = ((b.b)list.get(0)).a();
            if (string2.equalsIgnoreCase("gif")) {
                final AnimatedGifImageView animatedGifImageView = (AnimatedGifImageView)unifiedNativeAdView.findViewById(2131296584);
                if (animatedGifImageView != null) {
                    unifiedNativeAdView.setImageView((View)animatedGifImageView);
                    if (textView3 == null || textView3.getVisibility() == 8) {
                        unifiedNativeAdView.setCallToActionView((View)animatedGifImageView);
                    }
                    new Thread(new Runnable(){

                        public void run() {
                            try {
                                String string = String.valueOf((Object)((b.b)list.get(0)).b());
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("uri     ");
                                stringBuilder.append(string);
                                Log.d((String)"click1", (String)stringBuilder.toString());
                                final byte[] arrby = com.mulo.b.e.b((String)string);
                                activity.runOnUiThread(new Runnable(){

                                    public void run() {
                                        try {
                                            Log.d((String)"click1", (String)"start");
                                            animatedGifImageView.a(arrby, AnimatedGifImageView.a.b);
                                            animatedGifImageView.setVisibility(0);
                                            return;
                                        }
                                        catch (Exception exception) {
                                            exception.printStackTrace();
                                            return;
                                        }
                                    }
                                });
                                return;
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                return;
                            }
                        }

                    }).start();
                }
            } else {
                final ImageView imageView2 = (ImageView)unifiedNativeAdView.findViewById(2131296585);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    if (textView3 == null || textView3.getVisibility() == 8) {
                        unifiedNativeAdView.setCallToActionView((View)imageView2);
                    }
                    imageView2.post(new Runnable(){

                        public void run() {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            imageView2.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                            imageView2.setAdjustViewBounds(true);
                            imageView2.setImageDrawable(drawable);
                        }
                    });
                }
            }
        }
        unifiedNativeAdView.setNativeAd(j2);
    }

    private static void b(Context context, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("interstitialAdFb : ");
        stringBuilder.append((Object)d);
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        if (d == null) {
            d = new InterstitialAd(context, "167101606757479_1235760949891534");
            d.loadAd();
            d.setAdListener((InterstitialAdListener)new 9(context, n2));
        }
    }

    public static void b(View view) {
        if (view instanceof g) {
            ((g)view).b();
            return;
        }
        if (view instanceof m) {
            ((m)view).b();
        }
    }

    public static void b(ViewGroup viewGroup) {
    }

    public static boolean b() {
        com.google.android.gms.ads.j j2;
        if (!f && (j2 = c) != null && j2.a()) {
            return c.d();
        }
        return false;
    }

    private static View c(Activity activity, View view, String string, String string2, int n2, b b2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prepareFanBannerAd ");
        stringBuilder.append(n3);
        stringBuilder.append(" ");
        stringBuilder.append(activity.getClass().getName());
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        if (string2 == null) {
            return c.b(activity, view, string, string2, n2, b2, n3 + 1);
        }
        AdView adView = new AdView((Context)activity, string2, AdSize.BANNER_HEIGHT_50);
        6 var14_9 = new 6(activity, n3, view, string, string2, n2, b2, adView);
        adView.setAdListener((AdListener)var14_9);
        adView.loadAd();
        return adView;
    }

    private static View c(Activity activity, String string, String string2, b b2, int n2, k k2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prepareNativeFbAd ");
        stringBuilder.append(n3);
        stringBuilder.append(" ");
        stringBuilder.append(activity.getClass().getName());
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        if (string2 == null) {
            return c.b(activity, string, string2, b2, n2, k2, n3 + 1);
        }
        NativeAdLayout nativeAdLayout = new NativeAdLayout((Context)activity);
        nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Object object = n2 != 5 && n2 != 6 ? new NativeBannerAd((Context)activity, string2) : new NativeAd((Context)activity, string2);
        1 var15_10 = new 1((NativeAdBase)object, activity, nativeAdLayout, n2, k2, b2, n3, string, string2);
        object.setAdListener((NativeAdListener)var15_10);
        object.loadAd();
        return nativeAdLayout;
    }

    /*
     * Exception decompiling
     */
    public static void c() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl12.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    public static void c(Context context) {
        c.a(context, 0);
    }

    private static void c(Context context, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("interstitialAdmobAd : ");
        stringBuilder.append((Object)c);
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        if (c == null) {
            c = new com.google.android.gms.ads.j(context);
            c.a("ca-app-pub-5449278086868932/1489970845");
            c.a((com.google.android.gms.ads.b)new 10(context, n2));
            d d2 = c.a(context);
            c.a(d2);
        }
    }

    public static void c(View view) {
        if (view instanceof g) {
            ((g)view).c();
            return;
        }
        if (view instanceof m) {
            ((m)view).c();
            return;
        }
        if (view instanceof UnifiedNativeAdView) {
            ((UnifiedNativeAdView)view).a();
            return;
        }
        if (view instanceof AdView) {
            ((AdView)view).destroy();
        }
    }

    private static View d(Activity activity, View view, String string, String string2, int n2, b b2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prepareAdmobBannerAds ");
        stringBuilder.append(n3);
        stringBuilder.append(" ");
        stringBuilder.append(activity.getClass().getName());
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        if (string == null) {
            return c.b(activity, view, string, string2, n2, b2, n3 + 1);
        }
        g g2 = new g((Context)activity);
        g2.setAdSize(e.g);
        g2.setAdUnitId(string);
        7 var14_9 = new 7(activity, n3, view, string, string2, n2, b2, g2, n2);
        g2.setAdListener((com.google.android.gms.ads.b)var14_9);
        g2.a(c.a((Context)activity));
        return g2;
    }

    private static View d(Activity activity, String string, String string2, b b2, int n2, k k2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prepareNativeAdmobAd ");
        stringBuilder.append(n3);
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        if (string == null) {
            return c.b(activity, string, string2, b2, n2, k2, n3 + 1);
        }
        LinearLayout linearLayout = new LinearLayout((Context)activity);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        c.a a2 = new c.a((Context)activity, string);
        13 var13_10 = new 13(n3, activity, n2, k2, linearLayout, b2);
        c.a a3 = a2.a((j.a)var13_10);
        12 var15_12 = new 12(n3, activity, string, string2, b2, n2, k2, linearLayout);
        a3.a((com.google.android.gms.ads.b)var15_12).a(new c.a().b(k2.g).b(false).c(1).a()).a().a(c.a((Context)activity));
        return linearLayout;
    }

    /*
     * Exception decompiling
     */
    public static JSONObject d(Context var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl25.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    private static void d(Context context, int n2) {
        try {
            y.a("a9c8f9b0fdda4897879543253dadf08a");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loadInterstitialAmazon : ");
            stringBuilder.append((Object)e);
            Log.d((String)"xxxx", (String)stringBuilder.toString());
            if (e == null) {
                e = new cm(context);
                e.a((q)new 11(context, n2));
                e.b();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean d() {
        f = true;
        c.b();
        c = null;
        return true;
    }

    private static View e(Activity activity, View view, String string, String string2, int n2, b b2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prepareAdmobBannerAds ");
        stringBuilder.append(n3);
        Log.d((String)"xxxx", (String)stringBuilder.toString());
        p p2 = new p((Context)activity);
        p2.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        8 var12_9 = new 8(b2, n2, n3, activity, view, string, string2);
        p2.setListener((q)var12_9);
        try {
            y.a("a9c8f9b0fdda4897879543253dadf08a");
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("IllegalArgumentException thrown: in prepareAmazonBannerAds ");
            stringBuilder2.append(illegalArgumentException.toString());
            Log.e((String)"xxxx", (String)stringBuilder2.toString());
            return null;
        }
        p2.t();
        p2.e();
        return p2;
    }

    private static boolean e(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return networkInfo != null && networkInfo.isConnected();
    }

}

