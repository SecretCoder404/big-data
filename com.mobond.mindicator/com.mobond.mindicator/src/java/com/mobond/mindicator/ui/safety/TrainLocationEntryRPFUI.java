/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.safety;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.safety.SafetyUI2;
import com.mulo.util.e;

public class TrainLocationEntryRPFUI
extends Activity {
    EditText a;
    Button b;
    TextView c;
    int d;
    String e;
    String f;
    Spinner g;
    String h;

    private void a() {
        String string = a.a(this).b("safetyyourname_key");
        if (string != null && !string.trim().equals((Object)"")) {
            this.b.setText((CharSequence)string);
            return;
        }
        this.b.setText((CharSequence)"Set your name");
    }

    private void b() {
        n.a((Context)this, "Your train information is saved.\nThis information will be sent to RPF when you click on Safety icon.");
        b b2 = a.a(this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.d);
        b2.b("safety_compartment_date_int_key", stringBuilder.toString());
        b b3 = a.a(this);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("");
        stringBuilder2.append(this.e);
        b3.b("safety_compartment_date_string_key", stringBuilder2.toString());
        b b4 = a.a(this);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("");
        stringBuilder3.append(this.h);
        b4.b("safety_compartment_train_key", stringBuilder3.toString());
        b b5 = a.a(this);
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("");
        stringBuilder4.append(this.g.getSelectedItem());
        b5.b("safety_compartment_position_key", stringBuilder4.toString());
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493151);
        this.setTitle((CharSequence)"Women Safety by RPF");
        String string = this.getIntent().getExtras().getString("selected_train_string");
        int n2 = string.indexOf(35);
        if (n2 != -1) {
            string = string.substring(0, n2 - 1).trim();
        }
        this.f = this.getIntent().getExtras().getString("you_are_at");
        this.a = (EditText)this.findViewById(2131297570);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FROM: ");
        stringBuilder.append(this.f);
        stringBuilder.append("   ");
        stringBuilder.append(string);
        this.h = stringBuilder.toString();
        this.a.setText((CharSequence)this.h);
        this.b = (Button)this.findViewById(2131297006);
        this.a();
        this.d = e.a();
        this.e = e.b();
        this.c = (TextView)this.findViewById(2131296611);
        this.c.setText((CharSequence)this.e);
        this.g = (Spinner)this.findViewById(2131296573);
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (Object[])new String[]{"FRONT", "MIDDLE", "END"});
        this.g.setAdapter((SpinnerAdapter)arrayAdapter);
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (n2 == 4) {
            this.b();
        }
        return super.onKeyDown(n2, keyEvent);
    }

    public void onNameButtonClicked(View view) {
        Log.d((String)"SafetyUI", (String)"SafetyUI TrainLocatorEntryRPFUI onClick called");
        Intent intent = new Intent(view.getContext(), SafetyUI2.class);
        intent.setFlags(268435456);
        this.startActivityForResult(intent, 0);
    }

    protected void onResume() {
        super.onResume();
        this.a();
    }

    public void onSaveClicked(View view) {
        this.b();
    }
}

