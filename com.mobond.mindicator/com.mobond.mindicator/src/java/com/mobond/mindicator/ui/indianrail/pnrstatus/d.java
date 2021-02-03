/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.util.Log
 *  com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider
 *  com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrInput
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserProvider;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrInput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class d
extends AsyncTask<Void, Void, Void> {
    @SuppressLint(value={"StaticFieldLeak"})
    private Activity a;

    public d(Activity activity) {
        this.a = activity;
    }

    static void a(Activity activity) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -120);
        Date date = calendar.getTime();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("date>=");
        stringBuilder.append(date.getTime());
        String string = stringBuilder.toString();
        Uri uri = Uri.parse((String)"content://sms/inbox");
        Cursor cursor = activity.getContentResolver().query(uri, null, string, null, null);
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String string2 = cursor.getString(cursor.getColumnIndex("body"));
                String string3 = IRParserProvider.getIRParser().extractPnrFromSMS("", string2);
                if (string3 == null) continue;
                if (!arrayList.contains((Object)string3)) {
                    arrayList.add((Object)string3);
                }
                if (arrayList.size() < 5) continue;
            }
            cursor.close();
        }
        for (int i2 = -1 + arrayList.size(); i2 >= 0; --i2) {
            String string4 = a.b(activity).a("pnr_all", null);
            if (string4 != null && string4.contains((CharSequence)arrayList.get(i2))) continue;
            ActivityPnrInput.a((Context)activity, (String)((String)arrayList.get(i2)), (boolean)false);
        }
    }

    protected /* varargs */ Void a(Void ... arrvoid) {
        try {
            d.a(this.a);
        }
        catch (Exception exception) {
            Log.d((String)"pnr_inbox", (String)"Exception ", (Throwable)exception);
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

