/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Iterator
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import com.mobond.mindicator.ui.indianrail.pnrstatus.f;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

class g {
    int a;
    boolean b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    String m;
    ArrayList<f> n;

    g(JSONObject jSONObject) {
        this.c = jSONObject.getString("pnr");
        this.d = jSONObject.getString("class");
        this.a = jSONObject.getInt("noOfPassengers");
        this.e = jSONObject.getString("train_no");
        this.f = jSONObject.getString("trainName");
        this.b = jSONObject.getBoolean("chartPrepared");
        this.h = jSONObject.getString("doj");
        this.i = jSONObject.getString("train_depart_time");
        this.g = jSONObject.getString("quota");
        JSONArray jSONArray = jSONObject.getJSONArray("paxInfo");
        this.n = new ArrayList();
        int n2 = 0;
        do {
            if (n2 >= jSONArray.length()) break;
            JSONObject jSONObject2 = jSONArray.getJSONObject(n2);
            f f2 = new f();
            f2.a = jSONObject2.getString("booking_status");
            f2.b = jSONObject2.getString("booking_no");
            f2.c = jSONObject2.getString("current_status");
            f2.d = jSONObject2.getString("current_no");
            f2.e = jSONObject2.getString("booking_coach_id");
            f2.f = jSONObject2.getString("current_coach_id");
            f2.g = jSONObject2.getInt("pax_no");
            this.n.add((Object)f2);
            ++n2;
        } while (true);
        try {
            this.k = jSONObject.getJSONObject("from").getString("stationCode");
            this.j = jSONObject.getJSONObject("to").getString("stationCode");
            this.m = jSONObject.getJSONObject("boardingStation").getString("stationCode");
            this.l = jSONObject.getJSONObject("reservationUpto").getString("stationCode");
        }
        catch (Exception exception) {}
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("train_number", (Object)this.e);
            jSONObject.put("train_name", (Object)this.f);
            jSONObject.put("date", (Object)this.h);
            jSONObject.put("from", (Object)this.k);
            jSONObject.put("class", (Object)this.d);
            jSONObject.put("to", (Object)this.j);
            jSONObject.put("reserved_upto", (Object)this.l);
            jSONObject.put("boarding_point", (Object)this.m);
            JSONArray jSONArray = new JSONArray();
            Iterator iterator = this.n.iterator();
            do {
                String string;
                if (!iterator.hasNext()) {
                    jSONObject.put("passengers", (Object)jSONArray);
                    jSONObject.put("chart_prepared", this.b);
                    jSONObject.put("is_anyone_confirmed", false);
                    jSONObject.put("days_diff", 0);
                    jSONObject.put("is_all_confirmed", false);
                    jSONObject.put("is_all_canmod", true);
                    jSONObject.put("date_in_millis", System.currentTimeMillis());
                    jSONObject.put("next_alarm_time", System.currentTimeMillis());
                    jSONObject.put("title_text", (Object)"Title");
                    jSONObject.put("schedule_1_hr_prior_dep_query", (Object)"true");
                    return jSONObject;
                }
                f f2 = (f)iterator.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("passenger", this.n.indexOf((Object)f2));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f2.a);
                stringBuilder.append("/");
                stringBuilder.append(f2.b);
                jSONObject2.put("old_status", (Object)stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f2.c);
                if (f2.f.equals((Object)"-")) {
                    string = "";
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("/");
                    stringBuilder3.append(f2.f);
                    string = stringBuilder3.toString();
                }
                stringBuilder2.append(string);
                stringBuilder2.append("/");
                stringBuilder2.append(f2.d);
                jSONObject2.put("current_status", (Object)stringBuilder2.toString());
                jSONArray.put((Object)jSONObject2);
            } while (true);
        }
        catch (Exception exception) {
            return null;
        }
    }
}

