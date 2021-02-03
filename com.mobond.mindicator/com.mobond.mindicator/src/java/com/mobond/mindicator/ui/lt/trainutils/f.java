/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  com.mobond.mindicator.ui.lt.trainutils.f$1
 *  com.mulo.a.d.a
 *  com.mulo.a.d.b
 *  com.mulo.a.d.h
 *  com.mulo.a.d.i
 *  com.mulo.a.d.l
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Type
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Date
 *  java.util.Locale
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.d;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.lt.a;
import com.mobond.mindicator.ui.lt.trainutils.AlarmReceiver;
import com.mobond.mindicator.ui.lt.trainutils.b;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mulo.a.d.h;
import com.mulo.a.d.i;
import com.mulo.a.d.l;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;

public class f {
    public static final String[] a = new String[]{"PUNE", "SHIVAJI NAGAR", "KHADKI", "DAPODI", "KASARWADI", "PIMPRI", "CHINCHWAD", "AKURDI", "DEHU ROAD", "BEGDEWADI", "GHORAWADI", "TALEGAON", "VADGAON", "KANHE", "KAMSHET", "MALAVLI", "LONAVLA"};
    public static Comparator<d> b = new Comparator<d>(){

        public int a(d d2, d d3) {
            return Long.valueOf((long)d2.t).compareTo(Long.valueOf((long)d3.t));
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((d)object, (d)object2);
        }
    };

    public static int a() {
        return 101;
    }

    public static int a(String string, String string2) {
        String[] arrstring;
        int n2 = -1;
        int n3 = -1;
        for (int i2 = 0; i2 < (arrstring = a).length; ++i2) {
            if (string.equals((Object)arrstring[i2])) {
                n2 = i2;
            }
            if (!string2.equals((Object)a[i2])) continue;
            n3 = i2;
        }
        if (n2 < n3) {
            return 2;
        }
        return 1;
    }

    private static d a(String string, String string2, int n2, String string3, String string4, Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 3);
        calendar.set(12, 0);
        com.mulo.a.d.a a2 = h.a((String)string4, (int)n2, (String)string, (Calendar)calendar, (Boolean)false, (String)string2, (Object)context);
        if (a2 != null) {
            for (int i2 = 0; i2 < a2.a.length; ++i2) {
                if (!string3.equalsIgnoreCase((String)a2.h.get(i2))) continue;
                d d2 = new d();
                d2.b = a2.a[i2].substring(0, a2.a[i2].indexOf(35));
                String string5 = (String)a2.e.get(i2);
                (String)a2.f.get(i2);
                d2.q = string5;
                d2.c = h.b((String)string4, (String)a2.a[i2], (String)string, (Object)context);
                if (d2.c.contains((CharSequence)"#E#")) {
                    d2.r = true;
                    d2.c = d2.c.replace((CharSequence)"#E#", (CharSequence)"").trim();
                } else if (d2.c.contains((CharSequence)"#E-BO#")) {
                    if (string.equals((Object)"BORIVALI")) {
                        d2.r = true;
                    }
                    d2.c = d2.c.replace((CharSequence)"#E-BO#", (CharSequence)"").trim();
                }
                d2.a();
                d2.p = a2.a[i2];
                d2.w = string4;
                d2.s = (String)a2.h.get(i2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(" - ");
                stringBuilder.append(string2);
                d2.v = stringBuilder.toString();
                d2.x = n2;
                return d2;
            }
        }
        return null;
    }

    public static d a(String string, String string2, String string3, Context context) {
        if (f.a(string2)) {
            return f.a(string2, string3, f.a(string2, string3), string, "P", context);
        }
        l l2 = com.mulo.a.d.b.b((String)string2, (String)string3, (String)"Direct Train", (int)120, (boolean)false, (Object)context);
        if (l2 != null) {
            String string4 = ((i)l2.d.get((int)0)).f;
            return f.a(string2, string3, ((i)l2.d.get((int)0)).n, string, string4, context);
        }
        return null;
    }

    private static d a(ArrayList<d> arrayList) {
        if (arrayList.size() > 0) {
            return (d)arrayList.get(0);
        }
        return null;
    }

    public static String a(Context context) {
        return com.mobond.mindicator.a.a(context).L();
    }

    public static String a(String string, int n2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm", Locale.ENGLISH);
        Date date = simpleDateFormat.parse(string);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(12, n2);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void a(final Context context, final Intent intent) {
        String string = context.getString(2131755068);
        d.a a2 = new d.a(context);
        a2.b((CharSequence)string).a(true).a((CharSequence)"GO TO TRAIN", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                context.startActivity(intent);
            }
        }).b((CharSequence)"DISMISS", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        a2.b().show();
    }

    public static void a(Context context, d d2) {
        ArrayList<d> arrayList = f.b(context);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            d d3 = (d)arrayList.get(i2);
            if (d3 == null) continue;
            d3.a(d2, context);
        }
        Collections.sort(arrayList, b);
        d d4 = f.a(arrayList);
        if (d4 != null) {
            f.c(context, d4);
        }
    }

    public static void a(Context context, String string) {
        d.a a2 = new d.a(context);
        a2.a((CharSequence)"Oops..");
        a2.b((CharSequence)string).a(false).a((CharSequence)"OK", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.dismiss();
            }
        });
        a2.b().show();
    }

    public static void a(Context context, ArrayList<d> arrayList) {
        String string = new com.google.a.f().a(arrayList);
        com.mobond.mindicator.a.a(context).u(string);
        f.e(context);
    }

    public static boolean a(String string) {
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (!string.trim().equals((Object)a[i2])) continue;
            return true;
        }
        return false;
    }

    public static boolean a(String string, Context context) {
        ArrayList<d> arrayList = f.b(context);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((d)arrayList.get((int)i2)).s.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    public static d b(String string, Context context) {
        ArrayList<d> arrayList = f.b(context);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((d)arrayList.get((int)i2)).s.equalsIgnoreCase(string)) continue;
            return (d)arrayList.get(i2);
        }
        return null;
    }

    public static String b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("S:");
        stringBuilder.append(string.replace((CharSequence)"- ", (CharSequence)"  D:"));
        return stringBuilder.toString();
    }

    public static ArrayList<d> b(Context context) {
        String string = f.a(context);
        ArrayList arrayList = new ArrayList();
        if (string != null && !string.isEmpty()) {
            arrayList = (ArrayList)new com.google.a.f().a(string, new 1().b());
        }
        boolean bl = false;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (arrayList.get(i2) != null) continue;
            arrayList.remove(i2);
            --i2;
            bl = true;
        }
        if (bl) {
            f.a(context, (ArrayList<d>)arrayList);
        }
        return arrayList;
    }

    public static void b(Context context, d d2) {
        int n2 = f.a();
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra("tn", d2.s);
        intent.setAction("alert");
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)268435456);
        if (alarmManager != null) {
            alarmManager.cancel(pendingIntent);
        }
    }

    public static ArrayList<d> c(Context context) {
        ArrayList<d> arrayList = f.b(context);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            ((d)arrayList.get(i2)).b();
        }
        Collections.sort(arrayList, b);
        return arrayList;
    }

    private static void c(Context context, d d2) {
        long l2 = d2.t;
        int n2 = f.a();
        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra("tn", d2.s);
        intent.setAction("alert");
        PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)context.getApplicationContext(), (int)n2, (Intent)intent, (int)134217728);
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if (alarmManager != null) {
            int n3 = Build.VERSION.SDK_INT;
            if (n3 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, l2, pendingIntent);
                return;
            }
            if (n3 >= 19) {
                alarmManager.setExact(0, l2, pendingIntent);
                return;
            }
            alarmManager.set(0, l2, pendingIntent);
        }
    }

    public static boolean c(String string, Context context) {
        ArrayList<d> arrayList = f.b(context);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((d)arrayList.get((int)i2)).s.equalsIgnoreCase(string)) continue;
            return ((d)arrayList.get((int)i2)).z;
        }
        return false;
    }

    public static d d(Context context) {
        ArrayList<d> arrayList = f.b(context);
        int n2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            ((d)arrayList.get(i2)).a((d)null);
        }
        Collections.sort(arrayList, b);
        long l2 = Calendar.getInstance().getTimeInMillis();
        while (n2 < arrayList.size()) {
            long l3 = ((d)arrayList.get((int)n2)).t - l2;
            if (l3 > 0L && l3 < 180000L) {
                d d2 = (d)arrayList.get(n2);
                if (!a.b(d2.s, context)) {
                    return d2;
                }
            } else {
                long l4 = l2 - (((d)arrayList.get((int)n2)).t - 86400000L);
                if (l4 > 0L && l4 < 900000L) {
                    d d3 = (d)arrayList.get(n2);
                    if (!a.b(d3.s, context)) {
                        return d3;
                    }
                }
            }
            ++n2;
        }
        return null;
    }

    public static void e(Context context) {
        f.a(context, null);
    }

    public static void f(Context context) {
        ArrayList<d> arrayList = f.b(context);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            d d2 = (d)arrayList.get(i2);
            if (!d2.z) continue;
            f.b(context, d2);
            new b(context).f(d2.s);
            arrayList.remove(i2);
            --i2;
        }
        f.a(context, arrayList);
    }

}

