/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.text.Html
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.indianrail.alarm;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.indianrail.alarm.ActivityEditAlarms;

public class ActivityEditAlarms
extends e {
    private View a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493012);
        this.a = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/5533101087", "167101606757479_1239841762816786", "ca-app-pub-5449278086868932/9897817773", "167101606757479_1235753426558953", 3, null);
        ((ListView)this.findViewById(2131296936)).setAdapter((ListAdapter)new com.mobond.mindicator.ui.indianrail.alarm.a((Activity)this, (TextView)this.findViewById(2131297036)));
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        if (a.b((Activity)this).D()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<big>");
            stringBuilder.append(this.getResources().getString(2131755251));
            stringBuilder.append("</big>");
            toolbar.setTitle((CharSequence)Html.fromHtml((String)stringBuilder.toString()));
        } else {
            toolbar.setTitle((CharSequence)this.getResources().getString(2131755251));
        }
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().a(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityEditAlarms a;
            {
                this.a = activityEditAlarms;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    protected void onDestroy() {
        c.c(this.a);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.a);
    }

    public void onResume() {
        super.onResume();
        c.a(this.a);
    }
}

