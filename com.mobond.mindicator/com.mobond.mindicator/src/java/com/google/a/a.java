/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.sql.Date
 *  java.sql.Timestamp
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package com.google.a;

import com.google.a.b.e;
import com.google.a.b.j;
import com.google.a.d.b;
import com.google.a.d.c;
import com.google.a.t;
import com.google.a.v;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class a
extends v<java.util.Date> {
    private final Class<? extends java.util.Date> a;
    private final List<DateFormat> b = new ArrayList();

    public a(Class<? extends java.util.Date> class_, int n2, int n3) {
        this.a = a.a(class_);
        this.b.add((Object)DateFormat.getDateTimeInstance((int)n2, (int)n3, (Locale)Locale.US));
        if (!Locale.getDefault().equals((Object)Locale.US)) {
            this.b.add((Object)DateFormat.getDateTimeInstance((int)n2, (int)n3));
        }
        if (e.b()) {
            this.b.add((Object)j.a(n2, n3));
        }
    }

    a(Class<? extends java.util.Date> class_, String string) {
        this.a = a.a(class_);
        this.b.add((Object)new SimpleDateFormat(string, Locale.US));
        if (!Locale.getDefault().equals((Object)Locale.US)) {
            this.b.add((Object)new SimpleDateFormat(string));
        }
    }

    private static Class<? extends java.util.Date> a(Class<? extends java.util.Date> class_) {
        if (class_ != java.util.Date.class && class_ != Date.class) {
            if (class_ == Timestamp.class) {
                return class_;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Date type must be one of ");
            stringBuilder.append(java.util.Date.class);
            stringBuilder.append(", ");
            stringBuilder.append(Timestamp.class);
            stringBuilder.append(", or ");
            stringBuilder.append(Date.class);
            stringBuilder.append(" but was ");
            stringBuilder.append(class_);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return class_;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private java.util.Date a(String string) {
        List<DateFormat> list;
        List<DateFormat> list2 = list = this.b;
        synchronized (list2) {
            Iterator iterator = this.b.iterator();
            if (iterator.hasNext()) {
                DateFormat dateFormat = (DateFormat)iterator.next();
                return dateFormat.parse(string);
            }
            try {
                return com.google.a.b.a.a.a.a(string, new ParsePosition(0));
            }
            catch (ParseException parseException) {
                throw new t(string, parseException);
            }
        }
    }

    public java.util.Date a(com.google.a.d.a a2) {
        if (a2.f() == b.i) {
            a2.j();
            return null;
        }
        java.util.Date date = this.a(a2.h());
        Class<? extends java.util.Date> class_ = this.a;
        if (class_ == java.util.Date.class) {
            return date;
        }
        if (class_ == Timestamp.class) {
            return new Timestamp(date.getTime());
        }
        if (class_ == Date.class) {
            return new Date(date.getTime());
        }
        throw new AssertionError();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(c c2, java.util.Date date) {
        List<DateFormat> list;
        if (date == null) {
            c2.f();
            return;
        }
        List<DateFormat> list2 = list = this.b;
        synchronized (list2) {
            c2.b(((DateFormat)this.b.get(0)).format(date));
            return;
        }
    }

    @Override
    public /* synthetic */ Object b(com.google.a.d.a a2) {
        return this.a(a2);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat)this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDateTypeAdapter(");
            stringBuilder.append(((SimpleDateFormat)dateFormat).toPattern());
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultDateTypeAdapter(");
        stringBuilder.append(dateFormat.getClass().getSimpleName());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

