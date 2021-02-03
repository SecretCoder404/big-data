/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mobond.mindicator.ui.indianrail.a.a;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mulo.util.e;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c
extends SQLiteOpenHelper {
    private Context a;

    public c(Context context) {
        super(context, "db_train", null, 1);
        this.a = context;
    }

    public int a(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT time FROM train_rows WHERE trainnumber = '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null && cursor.moveToFirst()) {
            return cursor.getInt(0);
        }
        if (cursor != null) {
            cursor.close();
        }
        sQLiteDatabase.close();
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string, JSONArray jSONArray, boolean bl) {
        SQLiteDatabase sQLiteDatabase;
        block5 : {
            int n2;
            sQLiteDatabase = this.getWritableDatabase();
            String[] arrstring = new String[1];
            arrstring[0] = string;
            sQLiteDatabase.delete("train_rows", "trainnumber=?", arrstring);
            try {
                n2 = e.a();
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                break block5;
            }
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                ContentValues contentValues = new ContentValues();
                String string2 = jSONObject.getString("station_short");
                if (bl) {
                    contentValues.put("stationname", a.f(string2));
                } else {
                    contentValues.put("stationname", jSONObject.getString("station_full"));
                }
                contentValues.put("time", Integer.valueOf((int)n2));
                contentValues.put("trainnumber", string);
                contentValues.put("stationcode", string2);
                String string3 = jSONObject.getString("arrival").trim();
                String string4 = jSONObject.getString("departure").trim();
                String string5 = string3.isEmpty() ? string4 : string3;
                contentValues.put("arrivaltime", string5);
                String string6 = string3.isEmpty() ? "dep_min" : "arr_min";
                int n3 = jSONObject.getInt(string6);
                contentValues.put("arrivaltimeminutes", Integer.valueOf((int)n3));
                contentValues.put("departuretime", string4);
                contentValues.put("halt", jSONObject.getString("halt"));
                contentValues.put("distance", jSONObject.getString("distance"));
                contentValues.put("day", jSONObject.getString("day"));
                sQLiteDatabase.insert("train_rows", null, contentValues);
            }
        }
        sQLiteDatabase.close();
    }

    public Vector<g> b(String string) {
        Vector vector = new Vector();
        Vector<g> vector2 = a.a(string, this.a).a();
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM train_rows WHERE trainnumber = '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        if (cursor != null && cursor.moveToFirst()) {
            boolean bl = true;
            do {
                g g2 = new g();
                g2.i = cursor.getString(3);
                g2.a = cursor.getString(4);
                int n2 = 0;
                if (bl) {
                    g2.b = cursor.getString(7);
                    bl = false;
                } else {
                    g2.b = cursor.getString(5);
                }
                g2.d = cursor.getInt(6);
                g2.f = cursor.getString(9);
                g2.g = cursor.getString(10);
                g2.e = cursor.getString(8);
                while (n2 < vector2.size()) {
                    if (g2.i.equalsIgnoreCase(((g)vector2.get((int)n2)).i)) {
                        g2.j = ((g)vector2.get((int)n2)).j;
                        break;
                    }
                    ++n2;
                }
                vector.add((Object)g2);
            } while (cursor.moveToNext());
        }
        if (cursor != null) {
            cursor.close();
        }
        sQLiteDatabase.close();
        return vector;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE train_rows ( id INTEGER PRIMARY KEY, time INTEGER, trainnumber TEXT, stationcode TEXT, stationname TEXT, arrivaltime TEXT, arrivaltimeminutes INTEGER, departuretime TEXT, halt TEXT, distance TEXT, day TEXT )");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        this.onCreate(sQLiteDatabase);
    }
}

