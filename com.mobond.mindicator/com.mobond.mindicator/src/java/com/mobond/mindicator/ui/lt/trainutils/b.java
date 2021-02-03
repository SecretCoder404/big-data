/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.content.Context;
import android.content.SharedPreferences;
import com.mobond.mindicator.ui.lt.trainutils.f;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    private SharedPreferences a;

    public b(Context context) {
        this.a = context.getSharedPreferences("alertsetting", 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String a(boolean bl) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isring", true);
            jSONObject.put("isvibrate", true);
            jSONObject.put("isvoice", true);
            if (bl) {
                jSONObject.put("alertbefore", 0);
            } else {
                jSONObject.put("alertbefore", 5);
            }
            jSONObject.put("days", (Object)"23456");
            jSONObject.put("language", (Object)"hindi");
            return jSONObject.toString();
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void a(String string, String string2) {
        SharedPreferences.Editor editor = this.a.edit();
        editor.putString(string, string2);
        editor.apply();
    }

    public int a(String string, boolean bl) {
        String string2 = this.a.getString(string, null);
        if (string2 != null) {
            try {
                int n2 = new JSONObject(string2).getInt("alertbefore");
                return n2;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        if (bl) {
            return 0;
        }
        return 5;
    }

    public void a(String string, int n2, Context context, boolean bl) {
        String string2 = this.a.getString(string, this.a(bl));
        try {
            JSONObject jSONObject = new JSONObject(string2);
            jSONObject.put("alertbefore", n2);
            this.a(string, jSONObject.toString());
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        f.a(context, null);
    }

    public void a(String string, String string2, boolean bl) {
        String string3 = this.a.getString(string, this.a(bl));
        try {
            JSONObject jSONObject = new JSONObject(string3);
            jSONObject.put("days", (Object)string2);
            this.a(string, jSONObject.toString());
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public void a(String string, boolean bl, boolean bl2) {
        String string2 = this.a.getString(string, this.a(bl2));
        try {
            JSONObject jSONObject = new JSONObject(string2);
            jSONObject.put("isring", bl);
            this.a(string, jSONObject.toString());
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public boolean a(String string) {
        String string2 = this.a.getString(string, null);
        if (string2 != null) {
            try {
                boolean bl = new JSONObject(string2).getBoolean("isring");
                return bl;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return true;
    }

    public void b(String string, String string2, boolean bl) {
        String string3 = this.a.getString(string, this.a(bl));
        try {
            JSONObject jSONObject = new JSONObject(string3);
            jSONObject.put("language", (Object)string2);
            this.a(string, jSONObject.toString());
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public void b(String string, boolean bl, boolean bl2) {
        String string2 = this.a.getString(string, this.a(bl2));
        try {
            JSONObject jSONObject = new JSONObject(string2);
            jSONObject.put("isvibrate", bl);
            this.a(string, jSONObject.toString());
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public boolean b(String string) {
        String string2 = this.a.getString(string, null);
        if (string2 != null) {
            try {
                boolean bl = new JSONObject(string2).getBoolean("isvibrate");
                return bl;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return true;
    }

    public void c(String string, boolean bl, boolean bl2) {
        String string2 = this.a.getString(string, this.a(bl2));
        try {
            JSONObject jSONObject = new JSONObject(string2);
            jSONObject.put("isvoice", bl);
            this.a(string, jSONObject.toString());
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public boolean c(String string) {
        String string2 = this.a.getString(string, null);
        if (string2 != null) {
            try {
                boolean bl = new JSONObject(string2).getBoolean("isvoice");
                return bl;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return true;
    }

    public String d(String string) {
        String string2 = this.a.getString(string, null);
        if (string2 != null) {
            try {
                String string3 = new JSONObject(string2).getString("days");
                return string3;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return "23456";
    }

    public String e(String string) {
        String string2 = this.a.getString(string, null);
        if (string2 != null) {
            try {
                String string3 = new JSONObject(string2).getString("language");
                return string3;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return "hindi";
    }

    public void f(String string) {
        SharedPreferences.Editor editor = this.a.edit();
        editor.remove(string);
        editor.apply();
    }
}

