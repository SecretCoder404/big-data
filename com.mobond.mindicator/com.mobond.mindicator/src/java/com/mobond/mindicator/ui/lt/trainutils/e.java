/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  com.mobond.mindicator.ui.lt.trainutils.e$1
 *  com.mulo.b.a
 *  com.mulo.b.c
 *  com.mulo.b.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mobond.mindicator.ui.lt.trainutils.e;
import com.mulo.b.a;
import com.mulo.b.c;
import com.mulo.b.h;
import java.util.ArrayList;

public class e
extends SQLiteOpenHelper {
    Context a;

    public e(Context context) {
        super(context, "db_tower", null, 1);
        this.a = context;
    }

    public static long a(Context context) {
        return context.getSharedPreferences("toweruploadSharedPref", 0).getLong("uploadedtime", 0L);
    }

    public static void b(Context context) {
        long l2 = System.currentTimeMillis();
        e e2 = new e(context);
        ArrayList<String> arrayList = e2.b();
        if (l2 - e.a(context) > 864000000L || arrayList.size() >= 10) {
            String string = "";
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                if (string.isEmpty()) {
                    string = (String)arrayList.get(i2);
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(",");
                stringBuilder.append((String)arrayList.get(i2));
                string = stringBuilder.toString();
            }
            if (!string.isEmpty()) {
                h h2 = new h();
                h2.a("tw", string);
                c.a((String)"https://mobondhrd.appspot.com/mtracker/utw", (h)h2, null, (a)new 1(e2));
            }
        }
    }

    private void c() {
        SharedPreferences.Editor editor = this.a.getSharedPreferences("toweruploadSharedPref", 0).edit();
        editor.putLong("uploadedtime", System.currentTimeMillis());
        editor.apply();
        editor.commit();
    }

    public void a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_status", "uploaded");
            sQLiteDatabase.update("tower_table", contentValues, null, null);
            sQLiteDatabase.close();
            this.c();
        }
        catch (Exception exception) {}
    }

    public boolean a(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM tower_table WHERE towerId = '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Cursor cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        boolean bl = cursor.getCount() > 0;
        cursor.close();
        sQLiteDatabase.close();
        return bl;
    }

    public ArrayList<String> b() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT * FROM tower_table WHERE upload_status = 'pending'", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            arrayList.add((Object)cursor.getString(cursor.getColumnIndex("towerId")));
            cursor.moveToNext();
        }
        cursor.close();
        sQLiteDatabase.close();
        return arrayList;
    }

    public void b(String string) {
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("towerId", string);
        contentValues.put("upload_status", "pending");
        sQLiteDatabase.insert("tower_table", null, contentValues);
        sQLiteDatabase.close();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE tower_table ( towerId TEXT, upload_status TEXT ) ");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        this.onCreate(sQLiteDatabase);
    }
}

