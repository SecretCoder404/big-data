/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ListView
 *  android.widget.TextView
 *  java.io.File
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package com.mobond.mindicator.ui.penalties;

import a.a.a.a.c;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

public class PenaltyList
extends e {
    HashMap<String, String> N = new HashMap();

    @Override
    public void a() {
    }

    public void a(Context context, String string) {
        String[] arrstring = ((String)this.N.get((Object)string.replace((CharSequence)" ", (CharSequence)""))).split("#");
        if (!arrstring[0].equals((Object)"")) {
            Dialog dialog = new Dialog((Context)this.m());
            dialog.requestWindowFeature(1);
            dialog.setContentView(2131493095);
            TextView textView = (TextView)dialog.findViewById(2131297251);
            TextView textView2 = (TextView)dialog.findViewById(2131296317);
            TextView textView3 = (TextView)dialog.findViewById(2131296791);
            textView.setText((CharSequence)arrstring[1]);
            textView2.setText((CharSequence)arrstring[0]);
            textView3.setText((CharSequence)arrstring[2]);
            dialog.show();
        }
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        String string = this.a((int)n2).b;
        this.a(this.getApplicationContext(), string);
    }

    public void d(String string) {
        String[] arrstring;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PENALTY".toLowerCase());
        stringBuilder.append(File.separator);
        stringBuilder.append(string);
        InputStream inputStream = com.mulo.util.e.a(this, stringBuilder.toString());
        c c2 = new c((Reader)new InputStreamReader(inputStream));
        while ((arrstring = c2.a()) != null) {
            HashMap<String, String> hashMap = this.N;
            String string2 = arrstring[1].replace((CharSequence)" ", (CharSequence)"");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(arrstring[0]);
            stringBuilder2.append("#");
            stringBuilder2.append(arrstring[1]);
            stringBuilder2.append("#");
            stringBuilder2.append(arrstring[2]);
            hashMap.put((Object)string2, (Object)stringBuilder2.toString());
            d d2 = new d();
            d2.b = arrstring[1];
            d2.c = arrstring[2];
            this.e.add((Object)d2);
        }
        inputStream.close();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/2659246490", "167101606757479_1239843976149898", "ca-app-pub-5449278086868932/1113440191", "167101606757479_1235758373225125", 3);
        super.onCreate(bundle);
        String string = this.getIntent().getStringExtra("type");
        this.b(this.getIntent().getStringExtra("title"));
        try {
            this.d(string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.e();
        this.f(2131230908);
        this.e(2131230834);
        if (this.getIntent().getBooleanExtra("fromIR", false)) {
            this.c(this.getResources().getColor(2131099879));
            this.d(this.getResources().getColor(2131099880));
        }
    }
}

