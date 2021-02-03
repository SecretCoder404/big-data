/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 */
package com.amazon.device.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class ck {
    private Activity a;
    private Context b;
    private Class<?> c;
    private TreeMap<String, String> d = new TreeMap();

    ck() {
    }

    public ck a(Context context) {
        this.b = context;
        return this;
    }

    public ck a(Class<?> class_) {
        this.c = class_;
        return this;
    }

    public ck a(String string, String string2) {
        this.d.put((Object)string, (Object)string2);
        return this;
    }

    public boolean a() {
        Intent intent;
        block5 : {
            try {
                intent = new Intent(this.b, this.c);
                for (Map.Entry entry : this.d.entrySet()) {
                    intent.putExtra((String)entry.getKey(), (String)entry.getValue());
                }
                if (this.a == null) break block5;
                this.a.startActivity(intent);
                return true;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                return false;
            }
        }
        if (this.b != null) {
            intent.addFlags(268435456);
            this.b.startActivity(intent);
            return true;
        }
        return false;
    }
}

