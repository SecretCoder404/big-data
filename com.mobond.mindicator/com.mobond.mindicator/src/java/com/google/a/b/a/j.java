/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.sql.Date
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 */
package com.google.a.b.a;

import com.google.a.c.a;
import com.google.a.d.b;
import com.google.a.d.c;
import com.google.a.f;
import com.google.a.t;
import com.google.a.v;
import com.google.a.w;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class j
extends v<java.sql.Date> {
    public static final w a = new w(){

        @Override
        public <T> v<T> a(f f2, a<T> a2) {
            if (a2.a() == java.sql.Date.class) {
                return new j();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public java.sql.Date a(com.google.a.d.a a2) {
        j j2 = this;
        synchronized (j2) {
            if (a2.f() == b.i) {
                a2.j();
                return null;
            }
            try {
                return new java.sql.Date(this.b.parse(a2.h()).getTime());
            }
            catch (ParseException parseException) {
                throw new t(parseException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(c c2, java.sql.Date date) {
        j j2 = this;
        synchronized (j2) {
            String string = date == null ? null : this.b.format((Date)date);
            c2.b(string);
            return;
        }
    }

    @Override
    public /* synthetic */ Object b(com.google.a.d.a a2) {
        return this.a(a2);
    }

}

