/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package com.amazon.device.ads;

import com.amazon.device.ads.eh;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class bj {
    public static final List<String> a = Collections.unmodifiableList((List)new ArrayList<String>(){
        {
            this.add((Object)"yyyy-MM-dd'T'HH:mmZZZZZ");
            this.add((Object)"yyyy-MM-dd'T'HH:mmZ");
            this.add((Object)"yyyy-MM-dd'T'HH:mm");
            this.add((Object)"yyyy-MM-dd");
        }
    });
    private String b;
    private String c;
    private String d;
    private Date e;
    private Date f;

    public bj(String string, String string2, String string3, String string4, String string5) {
        if (!eh.a(string)) {
            this.b = string;
            this.c = string2;
            this.d = string3;
            if (!eh.a(string4)) {
                this.e = this.a(string4);
                if (eh.a(string5)) {
                    this.f = null;
                    return;
                }
                this.f = this.a(string5);
                return;
            }
            throw new IllegalArgumentException("No start date for event");
        }
        throw new IllegalArgumentException("No description for event");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Date a(String string) {
        Date date;
        Iterator iterator = a.iterator();
        if (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            {
                date = new SimpleDateFormat(string2, Locale.US).parse(string);
            }
        } else {
            date = null;
        }
        if (date != null) {
            return date;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not parse datetime string ");
        stringBuilder.append(string);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public Date d() {
        return this.e;
    }

    public Date e() {
        return this.f;
    }

}

