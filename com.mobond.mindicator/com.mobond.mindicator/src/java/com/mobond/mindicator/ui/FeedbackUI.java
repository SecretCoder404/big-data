/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.Editable
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.TextView
 *  androidx.core.content.a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.mobond.mindicator.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.FeedbackUI;
import com.mobond.mindicator.ui.i;
import com.mobond.mindicator.ui.n;
import com.mulo.b.c;
import com.mulo.b.h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeedbackUI
extends i
implements com.mulo.b.a {
    public static String a = "GENERAL";
    public static String b = "RAILWAY";
    public static String c = "RAILWAY_ROUTE";
    public static String d = "BUS";
    public static String e = "RAILMAP";
    public static String f = "MSRTC";
    public static String g = "POLICE_STATION_LOCATOR";
    public static String h = "INDIAN_RAIL";
    public String i = null;
    public String j = null;
    EditText k;
    EditText l;
    EditText m;
    View n;
    TextView o;
    TextView p;
    b q;

    public static boolean a(String string) {
        return Pattern.compile((String)"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher((CharSequence)string).matches();
    }

    private boolean b() {
        return (FeedbackUI.a(this.k.getText().toString()) || this.b(this.l.getText().toString())) && !this.m.getText().toString().isEmpty();
    }

    private boolean b(String string) {
        return string.length() >= 10;
    }

    @Override
    public void a() {
        n.c((Context)this, "Error Occurred. Please try after some time");
    }

    @Override
    public void a(byte[] arrby, byte[] arrby2, Object object) {
        this.finish();
        n.c((Context)this, "Feedback submitted");
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q = a.a(this.m());
        this.setContentView(2131492995);
        this.o = (TextView)this.findViewById(2131296425);
        this.o.setText((CharSequence)"m-Indicator");
        this.p = (TextView)this.findViewById(2131296533);
        this.p.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        this.n = this.findViewById(2131296764);
        this.n.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ FeedbackUI a;
            {
                this.a = feedbackUI;
            }

            public void onClick(View view) {
                this.a.onFeedbackSubmit(view);
            }
        });
        this.k = (EditText)this.findViewById(2131296709);
        this.l = (EditText)this.findViewById(2131297085);
        this.m = (EditText)this.findViewById(2131296765);
        EditText editText = this.k;
        if (this.q.E() != null) {
            this.k.setText((CharSequence)this.q.E());
            editText = this.l;
        }
        if (this.q.I() != null) {
            this.l.setText((CharSequence)this.q.I());
            editText = this.m;
        }
        this.j = this.getIntent().getStringExtra("info");
        this.i = this.getIntent().getStringExtra("feedbacktype");
        if (this.i.equals((Object)h)) {
            this.findViewById(2131296426).setBackgroundColor(androidx.core.content.a.c((Context)this, (int)2131099879));
            this.findViewById(2131297450).setBackgroundColor(androidx.core.content.a.c((Context)this, (int)2131099879));
        }
        editText.requestFocus();
    }

    public void onFeedbackSubmit(View view) {
        if (this.b()) {
            h h2 = new h();
            h2.a("feedbacktype", this.i);
            h2.a("emailid", this.k.getText().toString());
            h2.a("phonenumber", this.l.getText().toString());
            h2.a("info", this.j);
            h2.a("content", this.m.getText().toString());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedbackUI data: ");
            stringBuilder.append(this.m.getText().toString());
            Log.d((String)"FeedbackUI", (String)stringBuilder.toString());
            c.a("http://mobondhrd.appspot.com/feedback", h2, null, this, null, this, this.getApplicationContext(), "Sending..");
            return;
        }
        if (!this.m.getText().toString().isEmpty()) {
            if (this.k.getText().toString().isEmpty() && !this.l.getText().toString().isEmpty()) {
                n.c((Context)this, "Please enter correct phone number.");
                return;
            }
            if (!this.k.getText().toString().isEmpty() && this.l.getText().toString().isEmpty()) {
                n.c((Context)this, "Please enter correct email address.");
                return;
            }
            n.c((Context)this, "Please enter correct phone number or email address");
            return;
        }
        n.c((Context)this, "Please write your feedback.");
    }
}

