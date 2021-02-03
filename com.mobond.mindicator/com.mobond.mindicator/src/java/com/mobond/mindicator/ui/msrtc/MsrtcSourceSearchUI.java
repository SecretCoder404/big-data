/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.ListView
 *  android.widget.Spinner
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.msrtc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.msrtc.MsrtcMainActivity;
import com.mobond.mindicator.ui.msrtc.MsrtcSourceSearchUI;
import com.mulo.a.c.c;
import java.util.ArrayList;
import java.util.Vector;

public class MsrtcSourceSearchUI
extends com.mobond.mindicator.ui.msrtc.a {
    String R = null;
    String S = null;
    Vector<c> T = new Vector();
    b U;
    Spinner V;
    Spinner W;
    EditText X;
    Toolbar Y;
    String Z = null;
    Boolean aa = false;

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        String[] arrstring = ((d)this.h.get((int)n2)).i.split("#");
        String string = arrstring[0];
        String string2 = arrstring[1];
        String string3 = arrstring[2];
        String string4 = arrstring[3];
        Intent intent = new Intent();
        intent.putExtra("bus_stop2", this.S);
        intent.putExtra("stopName", string);
        intent.putExtra("district", string3);
        intent.putExtra("taluka", string2);
        intent.putExtra("stop_index", string4);
        intent.putExtra("source_index", this.getIntent().getShortExtra("source_index", (short)0));
        intent.putExtra("dest_index", this.getIntent().getShortExtra("dest_index", (short)0));
        intent.putExtra("SOURCE_NAME", this.getIntent().getStringExtra("SOURCE_NAME"));
        intent.putExtra("DESTINATION_NAME", this.getIntent().getStringExtra("DESTINATION_NAME"));
        intent.putExtra("SOURCE_DISTRICT", this.getIntent().getStringExtra("SOURCE_DISTRICT"));
        intent.putExtra("DESTINATION_DISTRICT", this.getIntent().getStringExtra("DESTINATION_DISTRICT"));
        this.setResult(-1, intent);
        this.finish();
    }

    public void button1Action(View view) {
    }

    public void onBackPressed() {
        String string;
        Intent intent = new Intent();
        String string2 = this.R;
        if (string2 != null && !string2.equals((Object)"")) {
            intent.putExtra("bus_stop1", this.R);
        }
        if ((string = this.S) != null && !string.equals((Object)"")) {
            intent.putExtra("bus_stop2", this.S);
        }
        this.setResult(-1, intent);
        this.finish();
        super.onBackPressed();
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.c = false;
        super.onCreate(bundle);
        this.d(1);
        this.U = a.a((Activity)this);
        this.V = (Spinner)this.findViewById(2131296653);
        this.W = (Spinner)this.findViewById(2131297467);
        this.X = (EditText)this.findViewById(2131297278);
        this.Y = (Toolbar)this.findViewById(2131297523);
        Bundle bundle2 = this.getIntent().getExtras();
        if (bundle2 != null && bundle2.containsKey("bus_stop1")) {
            this.R = bundle2.getString("bus_stop1");
        }
        if (bundle2 != null && bundle2.containsKey("bus_stop2")) {
            this.S = bundle2.getString("bus_stop2");
        }
        try {
            this.T = com.mulo.a.c.a.a((Activity)this).c((Activity)this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (MsrtcMainActivity.b.equalsIgnoreCase("marathi")) {
            this.d();
        } else {
            this.e();
        }
        if (com.mobond.mindicator.fcm.a.a("msrtc_show_bottom_ads").equalsIgnoreCase("false")) {
            this.f();
        }
        this.a(true);
        this.g = MsrtcMainActivity.c;
        Log.d((String)"stopvector", (String)"Loop start");
        Log.d((String)"stopvector", (String)"loop end");
        this.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" - ");
        stringBuilder.append(this.U.a("last_district", "All"));
        Log.d((String)"history", (String)stringBuilder.toString());
        String string = bundle2.getString("hint");
        this.g();
        this.b(string);
        this.c(18);
        this.a(2131231145);
        this.b(2131230908);
        this.a(string);
    }

    protected void onStart() {
        super.onStart();
        this.findViewById(2131297274).performClick();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final /* synthetic */ MsrtcSourceSearchUI a;
            {
                this.a = msrtcSourceSearchUI;
            }

            public void run() {
                ((android.view.inputmethod.InputMethodManager)this.a.getSystemService("input_method")).showSoftInput((View)this.a.b, 1);
            }
        }, 100L);
    }
}

