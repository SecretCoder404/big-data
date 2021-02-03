/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package com.google.a.b.a;

import com.google.a.b.a.a.a;
import com.google.a.b.e;
import com.google.a.b.j;
import com.google.a.d.b;
import com.google.a.f;
import com.google.a.t;
import com.google.a.v;
import com.google.a.w;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class c
extends v<Date> {
    public static final w a = new w(){

        @Override
        public <T> v<T> a(f f2, com.google.a.c.a<T> a2) {
            if (a2.a() == Date.class) {
                return new c();
            }
            return null;
        }
    };
    private final List<DateFormat> b = new ArrayList();

    public c() {
        this.b.add((Object)DateFormat.getDateTimeInstance((int)2, (int)2, (Locale)Locale.US));
        if (!Locale.getDefault().equals((Object)Locale.US)) {
            this.b.add((Object)DateFormat.getDateTimeInstance((int)2, (int)2));
        }
        if (e.b()) {
            this.b.add((Object)j.a(2, 2));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Date a(String string) {
        c c2 = this;
        synchronized (c2) {
            Iterator iterator = this.b.iterator();
            if (iterator.hasNext()) {
                DateFormat dateFormat = (DateFormat)iterator.next();
                return dateFormat.parse(string);
            }
            try {
                return a.a(string, new ParsePosition(0));
            }
            catch (ParseException parseException) {
                throw new t(string, parseException);
            }
        }
    }

    public Date a(com.google.a.d.a a2) {
        if (a2.f() == b.i) {
            a2.j();
            return null;
        }
        return this.a(a2.h());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(com.google.a.d.c c2, Date date) {
        c c3 = this;
        synchronized (c3) {
            if (date == null) {
                c2.f();
                return;
            }
            c2.b(((DateFormat)this.b.get(0)).format(date));
            return;
        }
    }

    @Override
    public /* synthetic */ Object b(com.google.a.d.a a2) {
        return this.a(a2);
    }

}

