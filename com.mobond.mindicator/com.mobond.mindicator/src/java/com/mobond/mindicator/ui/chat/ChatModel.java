/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  com.google.firebase.database.g
 *  com.google.firebase.database.j
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 */
package com.mobond.mindicator.ui.chat;

import androidx.annotation.Keep;
import com.google.firebase.database.g;
import com.google.firebase.database.j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@j
@Keep
public class ChatModel {
    private static final String TAG = "ChatModel";
    @g
    private boolean heighLight = false;
    private String i;
    @g
    private boolean isSelected = false;
    private int lc = 0;
    private String m;
    private String n;
    private String ri = "";
    private String rm = "";
    private String rn = "";
    private int sc = 0;
    private String t = "";
    @g
    private String temp = "";
    private long time = 0L;

    public ChatModel() {
    }

    public ChatModel(String string, String string2, String string3, int n2, int n3, long l2, String string4, String string5, String string6) {
        this.m = string;
        this.i = string2;
        this.n = string3;
        this.lc = n2;
        this.sc = n3;
        this.time = l2;
        this.rm = string4;
        this.ri = string5;
        this.rn = string6;
    }

    public String getI() {
        return this.i;
    }

    public int getLc() {
        return this.lc;
    }

    public String getM() {
        return this.m;
    }

    public String getN() {
        return this.n;
    }

    public String getRi() {
        return this.ri;
    }

    public String getRm() {
        return this.rm;
    }

    public String getRn() {
        return this.rn;
    }

    public int getSc() {
        return this.sc;
    }

    public String getT() {
        return this.t;
    }

    public long getTime() {
        return this.time;
    }

    @g
    public boolean isHeighLight() {
        return this.heighLight;
    }

    @g
    public boolean isLike() {
        return false;
    }

    @g
    public boolean isSelected() {
        return this.isSelected;
    }

    @g
    public void setHeighLight(boolean bl2) {
        this.heighLight = bl2;
    }

    public void setI(String string) {
        this.i = string;
    }

    public void setLc(int n2) {
        this.lc = n2;
    }

    public void setM(String string) {
        this.m = string;
    }

    public void setN(String string) {
        this.n = string;
    }

    public void setRi(String string) {
        this.ri = string;
    }

    public void setRm(String string) {
        this.rm = string;
    }

    public void setRn(String string) {
        this.rn = string;
    }

    public void setSc(int n2) {
        this.sc = n2;
    }

    @g
    public void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public void setT(String string) {
        this.t = string;
    }

    public void setTime(long l2) {
        this.time = l2;
        Date date = new Date(l2);
        this.t = new SimpleDateFormat("dd MMM hh:mm a", Locale.ENGLISH).format(date);
    }
}

