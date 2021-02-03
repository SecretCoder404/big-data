/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ListView
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.autotaxi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mobond.mindicator.ui.n;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ComplaintNumberList
extends e {
    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        n.b((Activity)this, this.a((int)n2).b);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.a("ca-app-pub-5449278086868932/6199372042", "167101606757479_1239842692816693", "ca-app-pub-5449278086868932/6710571171", "167101606757479_1235749733225989", 3);
        super.onCreate(bundle);
        this.b("Auto Taxi Complaint Numbers");
        new byte[0];
        try {
            JSONArray jSONArray = new JSONObject(new String(com.mulo.util.e.a(com.mulo.util.e.a(this, "../config.json"))).toString()).getJSONObject("auto").getJSONArray("complaint");
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                d d2 = new d();
                d2.b = jSONArray.getJSONObject(i2).getString("no");
                d2.c = jSONArray.getJSONObject(i2).getString("name");
                this.e.add((Object)d2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        {
            continue;
            break;
        }
        this.e();
    }
}

