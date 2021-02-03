/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.os.AsyncTask
 *  android.util.Log
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Iterator
 *  java.util.Vector
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.util.Log;
import com.mobond.mindicator.GetPeriodicLocationReceiver;
import com.mobond.mindicator.SampleAlarmReceiver;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.pnrstatus.b;
import com.mobond.mindicator.ui.indianrail.pnrstatus.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public class c
extends SQLiteOpenHelper {
    private Context a;

    public c(Context context) {
        super(context, "db_pnr", null, 1);
        this.a = context;
    }

    private a a(long l2, long l3) {
        ArrayList<com.mobond.mindicator.ui.indianrail.alarm.c> arrayList = this.d();
        for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
            com.mobond.mindicator.ui.indianrail.alarm.c c2 = (com.mobond.mindicator.ui.indianrail.alarm.c)arrayList.get(i2);
            com.mobond.mindicator.ui.indianrail.alarm.c c3 = (com.mobond.mindicator.ui.indianrail.alarm.c)arrayList.get(i2 + 1);
            if (!this.a(c2.b, l2, l3) && !this.a(c3.b, l2, l3)) {
                continue;
            }
            return new a(true, c3.c);
        }
        return new a(false, "");
    }

    private void a(String string, long l2, String string2) {
        String[] arrstring = string2.split(":");
        int n2 = Integer.parseInt((String)arrstring[0]);
        int n3 = Integer.parseInt((String)arrstring[1]);
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(l2);
            calendar.set(11, n2);
            calendar.set(12, n3);
            calendar.add(11, -2);
            long l3 = calendar.getTimeInMillis();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("1111 setStickyNotification2HoursPrior :-");
            stringBuilder.append(string);
            stringBuilder.append(" two_hours_prior_departure_time:");
            stringBuilder.append(l3);
            Log.d((String)"1111", (String)stringBuilder.toString());
            SampleAlarmReceiver.a(this.a, string, l3, "PNR_ALARM_2_HOURS_BEFORE_STICKY_NOTIFICATION");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private boolean a(long l2, long l3, long l4) {
        return l3 < l2 && l2 < l4;
    }

    private void e() {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT * FROM alarm", null);
        if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
            while (cursor.moveToNext()) {
            }
            cursor.close();
        }
        sQLiteDatabase.close();
    }

    private boolean j(String string) {
        SQLiteDatabase sQLiteDatabase = this.getReadableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT old_result FROM pnr_data WHERE `pnr`='");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                String string2 = cursor.getString(0);
                try {
                    boolean bl = new JSONObject(string2).getBoolean("is_anyone_confirmed");
                    cursor.close();
                    sQLiteDatabase.close();
                    return bl;
                }
                catch (JSONException jSONException) {
                    cursor.close();
                    sQLiteDatabase.close();
                    return false;
                }
            }
            cursor.close();
        }
        sQLiteDatabase.close();
        return false;
    }

    public int a(String string) {
        this.e();
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        String[] arrstring = new String[1];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('%');
        stringBuilder.append(string);
        stringBuilder.append('%');
        arrstring[0] = stringBuilder.toString();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT * FROM alarm WHERE stationname LIKE ? AND alarmtype = 'STATION_ALARM_VIA_PNR'", arrstring);
        if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
            int n2 = cursor.getInt(1);
            cursor.close();
            sQLiteDatabase.close();
            return n2;
        }
        sQLiteDatabase.close();
        return -1;
    }

    public ArrayList<long[]> a() {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT alarmid, triggermillis FROM alarm WHERE is_alarm_activated= 1", null);
        ArrayList arrayList = null;
        if (cursor != null) {
            int n2 = cursor.getCount();
            arrayList = null;
            if (n2 > 0) {
                boolean bl = cursor.moveToFirst();
                arrayList = null;
                if (bl) {
                    ArrayList arrayList2 = new ArrayList();
                    do {
                        long[] arrl = new long[]{cursor.getInt(0), cursor.getLong(1)};
                        arrayList2.add((Object)arrl);
                    } while (cursor.moveToNext());
                    cursor.close();
                    arrayList = arrayList2;
                }
            }
        }
        sQLiteDatabase.close();
        return arrayList;
    }

    public void a(int n2, boolean bl) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("isongoing", Integer.valueOf((int)bl));
        String[] arrstring = new String[]{String.valueOf((int)n2)};
        sQLiteDatabase.update("alarm", contentValues, "alarmid=?", arrstring);
        sQLiteDatabase.close();
    }

    void a(String string, String string2) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("departuretime", string2);
        sQLiteDatabase.update("pnr_data", contentValues, "pnr = ?", new String[]{string});
        sQLiteDatabase.close();
    }

    public void a(String string, String string2, int n2, String string3, long l2, String string4) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("alarmid", Integer.valueOf((int)n2));
        contentValues.put("triggermillis", Long.valueOf((long)l2));
        contentValues.put("stationname", string);
        contentValues.put("stationtime", string2);
        contentValues.put("trainnumber", string3);
        contentValues.put("alarmtype", string4);
        String[] arrstring = new String[]{String.valueOf((int)n2), string3};
        if (sQLiteDatabase.update("alarm", contentValues, "alarmid=? AND trainnumber=?", arrstring) == 0) {
            sQLiteDatabase.insert("alarm", null, contentValues);
        }
        sQLiteDatabase.close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(String string, String string2, Activity activity, String string3, boolean bl, boolean bl2, long l2, int n2) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        block19 : {
            int n3;
            long l3;
            JSONObject jSONObject;
            block25 : {
                block20 : {
                    block21 : {
                        String string4;
                        int n4;
                        String string5;
                        int n5;
                        Calendar calendar;
                        String string6;
                        block23 : {
                            block22 : {
                                ContentValues contentValues;
                                block24 : {
                                    sQLiteDatabase = this.getWritableDatabase();
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("SELECT old_result, isallconfirmed, departuretime FROM pnr_data WHERE `pnr`='");
                                    stringBuilder.append(string);
                                    stringBuilder.append("'");
                                    cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
                                    contentValues = new ContentValues();
                                    contentValues.put("old_date", Long.valueOf((long)System.currentTimeMillis()));
                                    contentValues.put("old_result", string2);
                                    contentValues.put("isallconfirmed", String.valueOf((boolean)bl));
                                    if (cursor == null || !cursor.moveToFirst() || cursor.getCount() <= 0) break block24;
                                    String string7 = cursor.getString(0);
                                    if (!string7.substring(0, string7.indexOf("next_alarm_time")).equals((Object)string2.substring(0, string2.indexOf("next_alarm_time"))) && activity == null) {
                                        String string8;
                                        Context context = this.a;
                                        if (cursor.getString(1).equals((Object)"true")) {
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append(this.a.getString(2131755347));
                                            stringBuilder2.append(string3);
                                            string8 = stringBuilder2.toString();
                                        } else {
                                            string8 = string3;
                                        }
                                        e.a(context, string, string8);
                                    }
                                    sQLiteDatabase.update("pnr_data", contentValues, "pnr = ?", new String[]{string});
                                    String string9 = cursor.getString(2);
                                    if (!string9.isEmpty() && !string9.equals((Object)"Loading Failed")) {
                                        if (bl2) {
                                            this.a(string, l2, string9);
                                        }
                                    } else {
                                        try {
                                            JSONObject jSONObject2 = new JSONObject(string2);
                                            b b2 = new b(string, jSONObject2.getString("train_number"), jSONObject2.getString("date"), jSONObject2.getString("from").trim(), jSONObject2.getString("to").trim(), this.a);
                                            b2.execute((Object[])new Void[0]);
                                        }
                                        catch (JSONException jSONException) {
                                            jSONException.printStackTrace();
                                        }
                                    }
                                    break block19;
                                }
                                Log.d((String)"1111", (String)"1111 --  2222");
                                contentValues.put("pnr", string);
                                contentValues.put("departuredate", Long.valueOf((long)l2));
                                sQLiteDatabase.insert("pnr_data", null, contentValues);
                                try {
                                    if (string2.equals((Object)"flushed")) break block19;
                                    jSONObject = new JSONObject(string2);
                                    if (n2 < 0 || jSONObject.getBoolean("is_all_canmod")) break block20;
                                    if (jSONObject.getBoolean("chart_prepared") && !jSONObject.getBoolean("is_all_confirmed")) {
                                        return;
                                    }
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("[");
                                    stringBuilder.append(jSONObject.getString("from").trim());
                                    stringBuilder.append("]");
                                    String string10 = stringBuilder.toString();
                                    StringBuilder stringBuilder3 = new StringBuilder();
                                    stringBuilder3.append("[");
                                    stringBuilder3.append(jSONObject.getString("to").trim());
                                    stringBuilder3.append("]");
                                    String string11 = stringBuilder3.toString();
                                    string6 = IRParserProvider.getIRParser().replaceAllKeepNumbersTrain(jSONObject.getString("train_number"));
                                    calendar = Calendar.getInstance();
                                    calendar.setTimeInMillis(l2);
                                    f f2 = com.mobond.mindicator.ui.indianrail.a.a.a(string6, this.a);
                                    if (f2 == null) break block21;
                                    Vector<g> vector = f2.a();
                                    if (vector == null) break block22;
                                    Iterator iterator = vector.iterator();
                                    int n6 = 0;
                                    while (iterator.hasNext()) {
                                        g g2 = (g)iterator.next();
                                        if (g2.a.contains((CharSequence)string10)) {
                                            n6 = Integer.parseInt((String)g2.g) - 1;
                                            continue;
                                        }
                                        if (!g2.a.contains((CharSequence)string11)) continue;
                                        string4 = g2.a;
                                        String string12 = g2.b;
                                        n4 = g2.d;
                                        n5 = Integer.parseInt((String)g2.g) - n6;
                                        string5 = string12;
                                        break block23;
                                    }
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                    break block19;
                                }
                            }
                            string4 = null;
                            n5 = 0;
                            n4 = 0;
                            string5 = null;
                        }
                        if (string4 != null) {
                            calendar.set(11, 0);
                            calendar.set(12, n4);
                            calendar.set(13, 0);
                            calendar.add(5, n5 - 1);
                            calendar.add(12, -20);
                            long l4 = calendar.getTimeInMillis();
                            if (l4 > System.currentTimeMillis()) {
                                Context context = this.a;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(string4);
                                stringBuilder.append(" ");
                                stringBuilder.append(string);
                                SampleAlarmReceiver.a(context, stringBuilder.toString(), string5, n4, string6, l4, "STATION_ALARM_VIA_PNR");
                                n3 = 2;
                            } else {
                                n3 = 2;
                            }
                        } else {
                            n3 = 2;
                        }
                        break block25;
                    }
                    n3 = 2;
                    break block25;
                }
                n3 = 2;
            }
            if (n2 >= n3 && (l3 = IRParserProvider.getIRParser().get2DaysPriorTime(jSONObject.getString("date"))) != -1L) {
                SampleAlarmReceiver.a(this.a, string, l3, "PNR_ALARM_TWO_DAYS_PRIOR_JOURNEY");
            }
            b b3 = new b(string, jSONObject.getString("train_number"), jSONObject.getString("date"), jSONObject.getString("from").trim(), jSONObject.getString("to").trim(), this.a);
            b3.execute((Object[])new Void[0]);
        }
        if (cursor != null) {
            cursor.close();
        }
        sQLiteDatabase.close();
    }

    void a(String string, String string2, String string3, long l2, long l3) {
        this.a(string, string2);
        a a2 = this.a(l2, l3);
        if (a2.a()) {
            GetPeriodicLocationReceiver.b(this.a, a2.b());
            return;
        }
        if (this.j(string)) {
            GetPeriodicLocationReceiver.a(this.a, string, string2, l2);
            GetPeriodicLocationReceiver.b(this.a, string, string3, l3);
        }
    }

    public String[] a(int n2) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM alarm WHERE alarmid=");
        stringBuilder.append(n2);
        stringBuilder.append(";");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
            String[] arrstring = new String[]{String.valueOf((int)cursor.getInt(1)), String.valueOf((int)cursor.getInt(2)), cursor.getString(3), cursor.getString(4), cursor.getString(6), cursor.getString(7)};
            cursor.close();
            sQLiteDatabase.close();
            return arrstring;
        }
        sQLiteDatabase.close();
        return null;
    }

    public ArrayList<com.mobond.mindicator.ui.indianrail.alarm.c> b() {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT * FROM alarm WHERE alarmtype='STATION_ALARM_MANUAL' OR alarmtype='STATION_ALARM_VIA_PNR'", null);
        ArrayList arrayList = null;
        if (cursor != null) {
            int n2 = cursor.getCount();
            arrayList = null;
            if (n2 > 0) {
                boolean bl = cursor.moveToFirst();
                arrayList = null;
                if (bl) {
                    ArrayList arrayList2 = new ArrayList();
                    do {
                        com.mobond.mindicator.ui.indianrail.alarm.c c2 = new com.mobond.mindicator.ui.indianrail.alarm.c(cursor.getInt(1), cursor.getLong(2), cursor.getString(3), cursor.getString(7), cursor.getString(4), cursor.getString(6), cursor.getInt(8));
                        arrayList2.add(0, (Object)c2);
                    } while (cursor.moveToNext());
                    cursor.close();
                    arrayList = arrayList2;
                }
            }
        }
        sQLiteDatabase.close();
        return arrayList;
    }

    public void b(int n2) {
        SampleAlarmReceiver.a(this.a, n2, "STATION_ALARM_MANUAL");
        SampleAlarmReceiver.a(this.a, n2, "STATION_ALARM_VIA_PNR");
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        String[] arrstring = new String[]{String.valueOf((int)n2)};
        sQLiteDatabase.delete("alarm", "alarmid=?", arrstring);
        sQLiteDatabase.close();
    }

    public String[] b(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT  old_result, old_date, departuretime FROM pnr_data WHERE pnr LIKE '");
        stringBuilder.append(string);
        stringBuilder.append("%'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null && cursor.moveToFirst()) {
            String[] arrstring = new String[]{cursor.getString(0), cursor.getString(1), cursor.getString(2)};
            cursor.close();
            sQLiteDatabase.close();
            return arrstring;
        }
        if (cursor != null) {
            cursor.close();
        }
        sQLiteDatabase.close();
        return null;
    }

    public ArrayList<com.mobond.mindicator.ui.indianrail.alarm.c> c() {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT * FROM alarm ORDER BY triggermillis", null);
        ArrayList arrayList = null;
        if (cursor != null) {
            int n2 = cursor.getCount();
            arrayList = null;
            if (n2 > 0) {
                boolean bl = cursor.moveToFirst();
                arrayList = null;
                if (bl) {
                    ArrayList arrayList2 = new ArrayList();
                    do {
                        com.mobond.mindicator.ui.indianrail.alarm.c c2 = new com.mobond.mindicator.ui.indianrail.alarm.c(cursor.getInt(1), cursor.getLong(2), cursor.getString(3), cursor.getString(7), cursor.getString(4), cursor.getString(6), cursor.getInt(8));
                        arrayList2.add(0, (Object)c2);
                    } while (cursor.moveToNext());
                    cursor.close();
                    arrayList = arrayList2;
                }
            }
        }
        sQLiteDatabase.close();
        return arrayList;
    }

    public void c(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("trainnumber LIKE 'JOURNEY_%");
        stringBuilder.append(string);
        stringBuilder.append("'");
        sQLiteDatabase.delete("alarm", stringBuilder.toString(), null);
        sQLiteDatabase.close();
    }

    public ArrayList<com.mobond.mindicator.ui.indianrail.alarm.c> d() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT * FROM alarm WHERE alarmtype='START_PERIODIC_LOCATION_ALARM' OR alarmtype='END_PERIODIC_LOCATION_ALARM' ORDER BY stationname, alarmtype DESC", null);
        while (cursor.moveToNext()) {
            com.mobond.mindicator.ui.indianrail.alarm.c c2 = new com.mobond.mindicator.ui.indianrail.alarm.c(cursor.getInt(1), cursor.getLong(2), cursor.getString(3), cursor.getString(7), cursor.getString(4), cursor.getString(6), cursor.getInt(8));
            arrayList.add((Object)c2);
        }
        cursor.close();
        sQLiteDatabase.close();
        return arrayList;
    }

    void d(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pnr LIKE '%");
        stringBuilder.append(string);
        stringBuilder.append("%'");
        sQLiteDatabase.delete("pnr_data", stringBuilder.toString(), null);
        sQLiteDatabase.close();
    }

    public void e(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stationname LIKE '%");
        stringBuilder.append(string);
        stringBuilder.append("%'");
        sQLiteDatabase.delete("alarm", stringBuilder.toString(), null);
        sQLiteDatabase.close();
    }

    public void f(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stationname LIKE '%");
        stringBuilder.append(string);
        stringBuilder.append("%' AND ");
        stringBuilder.append("alarmtype");
        stringBuilder.append(" LIKE 'PNR_ALARM_%'");
        sQLiteDatabase.delete("alarm", stringBuilder.toString(), null);
        sQLiteDatabase.close();
    }

    Calendar g(String string) {
        SQLiteDatabase sQLiteDatabase = this.getReadableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT departuredate,departuretime FROM pnr_data WHERE `pnr`='");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                Calendar calendar = Calendar.getInstance();
                long l2 = cursor.getLong(0);
                long l3 = IRParserProvider.getIRParser().get1HourPriorDepartureTime(cursor.getString(1));
                cursor.close();
                if (l3 == -1L) {
                    l3 = 0L;
                }
                calendar.setTimeInMillis(l2 + l3);
                sQLiteDatabase.close();
                return calendar;
            }
            cursor.close();
        }
        sQLiteDatabase.close();
        return null;
    }

    String h(String string) {
        SQLiteDatabase sQLiteDatabase = this.getReadableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT departuretime FROM pnr_data WHERE `pnr`='");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                String string2 = cursor.getString(0);
                cursor.close();
                sQLiteDatabase.close();
                return string2;
            }
            cursor.close();
        }
        sQLiteDatabase.close();
        return "";
    }

    public String i(String string) {
        SQLiteDatabase sQLiteDatabase = this.getReadableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT old_result FROM pnr_data WHERE `pnr`='");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                String string2 = cursor.getString(0);
                cursor.close();
                return string2;
            }
            cursor.close();
            sQLiteDatabase.close();
        }
        return "";
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table pnr_data(id INTEGER PRIMARY KEY, pnr TEXT DEFAULT 'error', old_result TEXT DEFAULT 'error', old_date TEXT DEFAULT '0', isallconfirmed TEXT DEFAULT 'false',departuretime TEXT DEFAULT '',fcmtopic TEXT DEFAULT '',departuredate INTEGER DEFAULT -1,CONSTRAINT pnr_unique UNIQUE (pnr))");
        sQLiteDatabase.execSQL("create table alarm(id INTEGER PRIMARY KEY, alarmid INTEGER DEFAULT -1, triggermillis INTEGER DEFAULT '-1',stationname TEXT, trainnumber TEXT, isongoing INTEGER DEFAULT 0,alarmtype TEXT, stationtime TEXT, is_alarm_activated INTEGER DEFAULT 1)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        this.onCreate(sQLiteDatabase);
    }

    private class a {
        boolean a;
        String b;

        a(boolean bl, String string) {
            this.a = bl;
            this.b = string;
        }

        boolean a() {
            return this.a;
        }

        String b() {
            return this.b;
        }
    }

}

