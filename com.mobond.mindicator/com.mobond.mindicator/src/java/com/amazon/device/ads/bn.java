/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Properties
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.co;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;

class bn {
    private static final bn a = new bn();
    private static final String b = bn.class.getSimpleName();
    private final Properties c = new Properties();
    private final cy d;
    private final co.a e;

    public bn() {
        this(new co.a(), new cz());
    }

    bn(co.a a2, cz cz2) {
        this.e = a2;
        this.d = cz2.a(b);
    }

    public static bn a() {
        return a;
    }

    public Boolean a(String string, Boolean bl2) {
        String string2 = this.c.getProperty(string);
        if (string2 == null) {
            return bl2;
        }
        try {
            Boolean bl3 = Boolean.parseBoolean((String)string2);
            return bl3;
        }
        catch (NumberFormatException numberFormatException) {
            this.d.e("Unable to parse boolean debug property - property: %s, value: %s", new Object[]{string, string2});
            return bl2;
        }
    }

    public Integer a(String string, Integer n2) {
        String string2 = this.c.getProperty(string);
        if (string2 == null) {
            return n2;
        }
        try {
            Integer n3 = Integer.parseInt((String)string2);
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            this.d.e("Unable to parse integer debug property - property: %s, value: %s", new Object[]{string, string2});
            return n2;
        }
    }

    public Long a(String string, Long l2) {
        String string2 = this.c.getProperty(string);
        if (string2 == null) {
            return l2;
        }
        try {
            Long l3 = Long.parseLong((String)string2);
            return l3;
        }
        catch (NumberFormatException numberFormatException) {
            this.d.e("Unable to parse long debug property - property: %s, value: %s", new Object[]{string, string2});
            return l2;
        }
    }

    public String a(String string, String string2) {
        return this.c.getProperty(string, string2);
    }

    public JSONObject a(String string, JSONObject jSONObject) {
        String string2 = this.c.getProperty(string);
        if (string2 == null) {
            return jSONObject;
        }
        return this.e.a(string2);
    }

    public void a(JSONObject jSONObject) {
        this.b();
        Map<String, String> map = this.e.a(jSONObject);
        this.c.putAll(map);
    }

    public boolean a(String string) {
        return this.c.containsKey((Object)string);
    }

    public void b() {
        this.c.clear();
    }
}

