/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 */
package com.a.a;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class v {
    public static String a = "Volley";
    public static boolean b = Log.isLoggable((String)a, (int)2);
    private static final String c = v.class.getName();

    public static /* varargs */ void a(String string, Object ... arrobject) {
        if (b) {
            Log.v((String)a, (String)v.e(string, arrobject));
        }
    }

    public static /* varargs */ void a(Throwable throwable, String string, Object ... arrobject) {
        Log.e((String)a, (String)v.e(string, arrobject), (Throwable)throwable);
    }

    public static /* varargs */ void b(String string, Object ... arrobject) {
        Log.d((String)a, (String)v.e(string, arrobject));
    }

    public static /* varargs */ void c(String string, Object ... arrobject) {
        Log.e((String)a, (String)v.e(string, arrobject));
    }

    public static /* varargs */ void d(String string, Object ... arrobject) {
        Log.wtf((String)a, (String)v.e(string, arrobject));
    }

    private static /* varargs */ String e(String string, Object ... arrobject) {
        if (arrobject != null) {
            string = String.format((Locale)Locale.US, (String)string, (Object[])arrobject);
        }
        StackTraceElement[] arrstackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
        String string2 = "<unknown>";
        for (int i2 = 2; i2 < arrstackTraceElement.length; ++i2) {
            if (arrstackTraceElement[i2].getClassName().equals((Object)c)) continue;
            String string3 = arrstackTraceElement[i2].getClassName();
            String string4 = string3.substring(1 + string3.lastIndexOf(46));
            String string5 = string4.substring(1 + string4.lastIndexOf(36));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string5);
            stringBuilder.append(".");
            stringBuilder.append(arrstackTraceElement[i2].getMethodName());
            string2 = stringBuilder.toString();
            break;
        }
        Locale locale = Locale.US;
        Object[] arrobject2 = new Object[]{Thread.currentThread().getId(), string2, string};
        return String.format((Locale)locale, (String)"[%d] %s: %s", (Object[])arrobject2);
    }

    static class com.a.a.v$a {
        public static final boolean a = v.b;
        private final List<a> b = new ArrayList();
        private boolean c = false;

        com.a.a.v$a() {
        }

        private long a() {
            if (this.b.size() == 0) {
                return 0L;
            }
            long l2 = ((a)this.b.get((int)0)).c;
            List<a> list = this.b;
            return ((a)list.get((int)(-1 + list.size()))).c - l2;
        }

        public void a(String string) {
            com.a.a.v$a a2 = this;
            synchronized (a2) {
                long l2;
                block5 : {
                    this.c = true;
                    l2 = this.a();
                    if (l2 > 0L) break block5;
                    return;
                }
                long l3 = ((a)this.b.get((int)0)).c;
                Object[] arrobject = new Object[]{l2, string};
                v.b("(%-4d ms) %s", arrobject);
                for (a a3 : this.b) {
                    long l4 = a3.c;
                    Object[] arrobject2 = new Object[]{l4 - l3, a3.b, a3.a};
                    v.b("(+%-4d) [%2d] %s", arrobject2);
                    l3 = l4;
                }
                return;
            }
        }

        public void a(String string, long l2) {
            com.a.a.v$a a2 = this;
            synchronized (a2) {
                if (!this.c) {
                    List<a> list = this.b;
                    a a3 = new a(string, l2, SystemClock.elapsedRealtime());
                    list.add((Object)a3);
                    return;
                }
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        protected void finalize() {
            if (!this.c) {
                this.a("Request on the loose");
                v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        private static class a {
            public final String a;
            public final long b;
            public final long c;

            public a(String string, long l2, long l3) {
                this.a = string;
                this.b = l2;
                this.c = l3;
            }
        }

    }

}

