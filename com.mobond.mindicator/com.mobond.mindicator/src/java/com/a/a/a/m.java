/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.a.a.a;

import com.a.a.a.g;
import com.a.a.a.n;
import com.a.a.k;
import com.a.a.p;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class m
extends n<JSONObject> {
    public m(int n2, String string, JSONObject jSONObject, p.b<JSONObject> b2, p.a a2) {
        String string2 = jSONObject == null ? null : jSONObject.toString();
        super(n2, string, string2, b2, a2);
    }

    public m(String string, JSONObject jSONObject, p.b<JSONObject> b2, p.a a2) {
        int n2 = jSONObject == null ? 0 : 1;
        this(n2, string, jSONObject, b2, a2);
    }

    @Override
    protected p<JSONObject> parseNetworkResponse(k k2) {
        try {
            p<JSONObject> p2 = p.a(new JSONObject(new String(k2.b, g.a(k2.c, "utf-8"))), g.a(k2));
            return p2;
        }
        catch (JSONException jSONException) {
            return p.a(new com.a.a.m(jSONException));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return p.a(new com.a.a.m(unsupportedEncodingException));
        }
    }
}

