/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.widget.ArrayAdapter
 *  android.widget.RadioButton
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  com.mulo.a.d.h
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package com.mobond.mindicator.ui.safety;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.n;
import com.mulo.a.d.h;

public class SetTrainDetails
extends Activity {
    RadioButton a;
    RadioButton b;
    RadioButton c;
    String d = null;
    String e = null;
    Spinner f = null;

    public static String a(Context context) {
        try {
            b b2 = a.a(context);
            String string = b2.b("td_coach_key");
            String string2 = b2.b("td_train_destination_key");
            long l2 = Long.parseLong((String)b2.b("td_timestamp_key"));
            if (System.currentTimeMillis() - l2 < 10800000L) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Coach:");
                stringBuilder.append(string);
                stringBuilder.append(" Dest:");
                stringBuilder.append(string2);
                String string3 = stringBuilder.toString();
                return string3;
            }
            return null;
        }
        catch (Exception exception) {
            Log.d((String)"Exception in getTrainDetails", (String)"getTrainDetails", (Throwable)exception);
            return null;
        }
    }

    public void onCoachEndClicked(View view) {
        this.d = "END";
        this.a.setChecked(false);
        this.b.setChecked(false);
        this.c.setChecked(true);
    }

    public void onCoachMiddleClicked(View view) {
        this.d = "MIDDLE";
        this.a.setChecked(false);
        this.b.setChecked(true);
        this.c.setChecked(false);
    }

    public void onCoachStartClicked(View view) {
        this.d = "START";
        this.a.setChecked(true);
        this.b.setChecked(false);
        this.c.setChecked(false);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493160);
        this.a = (RadioButton)this.findViewById(2131297148);
        this.b = (RadioButton)this.findViewById(2131297146);
        this.c = (RadioButton)this.findViewById(2131297142);
        this.f = (Spinner)this.findViewById(2131297557);
        String[] arrstring = h.c((Object)((Object)this));
        Object[] arrobject = new String[1 + arrstring.length];
        arrobject[0] = "--Select Station--";
        System.arraycopy((Object)arrstring, (int)0, (Object)arrobject, (int)1, (int)arrstring.length);
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, arrobject);
        this.f.setAdapter((SpinnerAdapter)arrayAdapter);
    }

    public void onSave(View view) {
        if (this.d == null) {
            n.d((Context)this, "Set Coach Position");
            return;
        }
        this.e = null;
        if (this.f.getSelectedItemPosition() != 0) {
            this.e = (String)this.f.getSelectedItem();
        }
        if (this.e == null) {
            n.d((Context)this, "Select train destination");
            return;
        }
        b b2 = a.a(this);
        b2.b("td_coach_key", this.d);
        b2.b("td_train_destination_key", this.e);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(System.currentTimeMillis());
        b2.b("td_timestamp_key", stringBuilder.toString());
        n.e((Context)this, "Train details saved");
        this.finish();
    }
}

