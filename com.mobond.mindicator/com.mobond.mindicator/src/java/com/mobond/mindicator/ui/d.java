/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Locale
 */
package com.mobond.mindicator.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.mobond.mindicator.ui.lt.trainutils.b;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class d
implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>(){

        public d a(Parcel parcel) {
            return new d(parcel);
        }

        public d[] a(int n2) {
            return new d[n2];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return this.a(parcel);
        }

        public /* synthetic */ Object[] newArray(int n2) {
            return this.a(n2);
        }
    };
    public int A;
    public int B;
    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public Object j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public String q;
    public boolean r;
    public String s;
    public long t;
    public int u;
    public String v;
    public String w;
    public int x;
    public boolean y;
    public boolean z;

    public d() {
        this.a = 1;
        this.e = Color.rgb((int)255, (int)255, (int)255);
        this.f = Color.rgb((int)173, (int)173, (int)173);
        this.g = Color.rgb((int)173, (int)173, (int)173);
        this.h = -1;
        this.k = false;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.r = false;
        this.t = 0L;
        this.u = 0;
        this.v = "";
        this.x = -1;
        this.y = false;
        this.z = false;
        this.A = -1;
        this.B = -1;
    }

    protected d(Parcel parcel) {
        int n2;
        this.a = n2 = 1;
        this.e = Color.rgb((int)255, (int)255, (int)255);
        this.f = Color.rgb((int)173, (int)173, (int)173);
        this.g = Color.rgb((int)173, (int)173, (int)173);
        this.h = -1;
        this.k = false;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.r = false;
        this.t = 0L;
        this.u = 0;
        this.v = "";
        this.x = -1;
        this.y = false;
        this.z = false;
        this.A = -1;
        this.B = -1;
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        boolean bl = parcel.readByte() != 0;
        this.k = bl;
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
        boolean bl2 = parcel.readByte() != 0;
        this.r = bl2;
        this.s = parcel.readString();
        this.t = parcel.readLong();
        this.u = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        boolean bl3 = parcel.readByte() != 0;
        this.y = bl3;
        if (parcel.readByte() == 0) {
            n2 = 0;
        }
        this.z = n2;
    }

    private int a(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        try {
            int n2 = Integer.parseInt((String)simpleDateFormat2.format(simpleDateFormat.parse(string)).split(":")[0]);
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public void a() {
        if (!(this.b.endsWith(" S") || this.b.contains((CharSequence)" S ") || this.b.contains((CharSequence)" S-") || this.b.trim().length() == 8)) {
            this.o = 2;
            return;
        }
        this.o = 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(d d2) {
        String[] arrstring = this.b.split(" ");
        String string = arrstring[0];
        String string2 = arrstring[1];
        Integer.parseInt((String)string.split(":")[0]);
        int n2 = Integer.parseInt((String)string.split(":")[1]);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        int n3 = this.a(stringBuilder.toString());
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, n3);
            calendar.set(12, n2);
            calendar.set(13, 0);
            if (System.currentTimeMillis() > calendar.getTimeInMillis()) {
                calendar.add(6, 1);
            } else if (d2 != null && d2.s.equals((Object)this.s)) {
                calendar.add(6, 1);
            }
            this.t = calendar.getTimeInMillis();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Log.d((String)"LOG", (String)"EXCEPTION IN TIME");
            return;
        }
    }

    public void a(d d2, Context context) {
        String[] arrstring = this.b.split(" ");
        String string = arrstring[0];
        String string2 = arrstring[1];
        Integer.parseInt((String)string.split(":")[0]);
        int n2 = Integer.parseInt((String)string.split(":")[1]);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        int n3 = this.a(stringBuilder.toString());
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, n3);
        calendar.set(12, n2);
        calendar.set(13, 0);
        long l2 = calendar.getTimeInMillis() - (long)(60000 * new b(context).a(this.s, this.z));
        if (System.currentTimeMillis() > l2) {
            calendar.add(6, 1);
        } else if (d2 != null && d2.s.equals((Object)this.s)) {
            calendar.add(6, 1);
        }
        this.t = calendar.getTimeInMillis() - (long)(60000 * new b(context).a(this.s, this.z));
    }

    public void b() {
        String[] arrstring = this.b.split(" ");
        String string = arrstring[0];
        String string2 = arrstring[1];
        Integer.parseInt((String)string.split(":")[0]);
        int n2 = Integer.parseInt((String)string.split(":")[1]);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        int n3 = this.a(stringBuilder.toString());
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, n3);
            calendar.set(12, n2);
            calendar.set(13, 0);
            this.t = calendar.getTimeInMillis();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Log.d((String)"LOG", (String)"EXCEPTION IN TIME");
            return;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeByte((byte)(this.k ? 1 : 0));
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeByte((byte)(this.r ? 1 : 0));
        parcel.writeString(this.s);
        parcel.writeLong(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeByte((byte)(this.y ? 1 : 0));
        parcel.writeByte((byte)(this.z ? 1 : 0));
    }

}

