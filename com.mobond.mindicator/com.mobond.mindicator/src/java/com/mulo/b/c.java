/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Handler
 *  android.util.Log
 *  com.mulo.b.c$3
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.mulo.b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.Log;
import com.a.a.n;
import com.a.a.o;
import com.a.a.p;
import com.a.a.r;
import com.a.a.u;
import com.mobond.mindicator.ui.j;
import com.mulo.b.a;
import com.mulo.b.b;
import com.mulo.b.c;
import com.mulo.b.d;
import com.mulo.b.e;
import com.mulo.b.f;
import com.mulo.b.g;
import com.mulo.b.h;
import java.io.IOException;
import java.util.Map;

public class c {
    public static f a(String string, h h2, d d2, b b2) {
        return c.a("GET", string, h2, d2, b2, true);
    }

    public static f a(String string, h h2, d d2, b b2, boolean bl) {
        return c.a("GET", string, h2, d2, b2, bl);
    }

    /*
     * Exception decompiling
     */
    private static f a(String var0, String var1, h var2, d var3, b var4, boolean var5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public static String a(String string, h h2, d d2) {
        return new String(c.a((String)string, (h)h2, (d)d2, null).a);
    }

    static /* synthetic */ void a(d d2) {
        c.b(d2);
    }

    public static void a(String string, h h2, a a2, Activity activity) {
        c.a(string, h2, null, a2, null, null, null, null, activity);
    }

    public static void a(String string, h h2, d d2, a a2) {
        c.a("POST", string, h2, d2, null, a2);
    }

    public static void a(String string, h h2, d d2, a a2, Object object, j j2, Context context, String string2) {
        c.a(string, h2, d2, a2, object, j2, context, string2, null);
    }

    public static void a(final String string, final h h2, final d d2, final a a2, final Object object, final j j2, final Context context, String string2, final Activity activity) {
        final g g2 = new g(){

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void run() {
                String string3;
                f f2;
                block15 : {
                    IOException iOException;
                    block18 : {
                        Exception exception;
                        block17 : {
                            Throwable throwable;
                            block16 : {
                                f2 = null;
                                if (this.i) {
                                    return;
                                }
                                String string2 = string;
                                if (string.startsWith("http://mobondhrd.appspot.com/") && context != null) {
                                    string2 = e.a(string, context);
                                }
                                f f3 = c.b(string2, h2, d2);
                                try {
                                    boolean bl = this.i;
                                    if (bl) {
                                        return;
                                    }
                                    f2 = f3;
                                    string3 = null;
                                    break block15;
                                }
                                catch (Throwable throwable2) {
                                    throwable = throwable2;
                                    f2 = f3;
                                    break block16;
                                }
                                catch (Exception exception2) {
                                    exception = exception2;
                                    f2 = f3;
                                    break block17;
                                }
                                catch (IOException iOException2) {
                                    iOException = iOException2;
                                    f2 = f3;
                                    break block18;
                                }
                                catch (Throwable throwable3) {
                                    // empty catch block
                                }
                            }
                            throwable.printStackTrace();
                            string3 = "Network Error 3";
                            break block15;
                            catch (Exception exception3) {
                                // empty catch block
                            }
                        }
                        exception.printStackTrace();
                        string3 = "Network Error 2";
                        break block15;
                        catch (IOException iOException3) {
                            // empty catch block
                        }
                    }
                    iOException.printStackTrace();
                    string3 = "Network Error 1";
                }
                if (this.i) {
                    return;
                }
                j j22 = j2;
                if (j22 != null) {
                    j22.l().post(new Runnable(){

                        public void run() {
                            ProgressDialog progressDialog = j2.k();
                            if (progressDialog != null && progressDialog.isShowing()) {
                                try {
                                    progressDialog.dismiss();
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                }
                            }
                            if (activity != null) {
                                activity.runOnUiThread(new Runnable(){

                                    public void run() {
                                        if (string3 != null) {
                                            if (!context.getClass().getName().contains((CharSequence)"StationMap")) {
                                                com.mobond.mindicator.ui.n.d((Context)j2.m(), string3);
                                            }
                                            a2.a();
                                            return;
                                        }
                                        a2.a(f2.a, f2.b, object);
                                    }
                                });
                                return;
                            }
                            if (string3 != null) {
                                if (!context.getClass().getName().contains((CharSequence)"StationMap")) {
                                    com.mobond.mindicator.ui.n.d((Context)j2.m(), string3);
                                }
                                a2.a();
                                return;
                            }
                            a2.a(f2.a, f2.b, object);
                        }

                    });
                    return;
                }
                Activity activity2 = activity;
                if (activity2 != null) {
                    activity2.runOnUiThread(new Runnable(){

                        public void run() {
                            if (string3 != null) {
                                a2.a();
                                return;
                            }
                            a2.a(f2.a, f2.b, object);
                        }
                    });
                    return;
                }
                if (string3 != null) {
                    a2.a();
                    return;
                }
                a2.a(f2.a, f2.b, object);
            }

        };
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener(){

            public void onCancel(DialogInterface dialogInterface) {
                Log.d((String)"ConnectionUtil", (String)"onCancel called.");
                g2.i = true;
            }
        };
        if (j2 != null) {
            String string3 = context.getString(2131755277);
            String string4 = string2 != null && !string2.trim().equals((Object)"") ? string2 : string3;
            j2.a(ProgressDialog.show((Context)j2.m(), null, (CharSequence)string4, (boolean)true, (boolean)true, (DialogInterface.OnCancelListener)onCancelListener));
        }
        new Thread((Runnable)g2).start();
    }

    private static void a(final String string, final String string2, final h h2, final d d2, final Object object, final a a2) {
        g g2 = new g(){

            /*
             * Exception decompiling
             */
            @Override
            public void run() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
                // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
                // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
                // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
        };
        new Thread((Runnable)g2).start();
    }

    public static void a(String string, Map<String, String> map, final a a2, o o2, String string2, boolean bl) {
        3 var6_6 = new 3(1, string, (p.b)new p.b<String>(){

            public void a(String string) {
                a2.a(string.getBytes(), null, null);
            }

            @Override
            public /* synthetic */ void onResponse(Object object) {
                this.a((String)object);
            }
        }, new p.a(){

            @Override
            public void onErrorResponse(u u2) {
                a2.a();
            }
        }, map);
        if (bl) {
            var6_6.setRetryPolicy(new com.a.a.e(10000, 5, 1.0f));
        }
        o2.a(string2);
        var6_6.setTag(string2);
        o2.a(var6_6);
    }

    public static boolean a(Activity activity) {
        if (((ConnectivityManager)activity.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            com.mobond.mindicator.ui.n.d((Context)activity, "Check Internet");
            return false;
        }
        return true;
    }

    public static boolean a(Context context) {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    public static f b(String string, h h2, d d2) {
        return c.a(string, h2, d2, null);
    }

    public static f b(String string, h h2, d d2, b b2) {
        return c.a("POST", string, h2, d2, b2, true);
    }

    private static void b(d d2) {
    }

    public static void b(String string, h h2, d d2, a a2) {
        c.a("GET", string, h2, d2, null, a2);
    }

    public static String c(String string, h h2, d d2) {
        return new String(c.b((String)string, (h)h2, (d)d2, null).a);
    }

}

