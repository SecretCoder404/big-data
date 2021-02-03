/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.webkit.WebView
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Map
 */
package com.mobond.mindicator.ui.indianrail.irplugin;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.mobond.mindicator.ui.indianrail.irplugin.CommonCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.PNRCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.SeatAvailabilityInterface;
import java.text.SimpleDateFormat;
import java.util.Map;

interface IRParserInterface {
    public void disconnect();

    public String extractPnrFromSMS(String var1, String var2);

    public String formatIntoAMPM(String var1, boolean var2);

    public long get1HourPriorDepartureTime(String var1);

    public long get2DaysPriorTime(String var1);

    public SimpleDateFormat getCancelledRescheduledDateFormat();

    public String getCancelledRescheduledTrains(String var1, String var2, String var3);

    public void getCancelledRescheduledTrainsNew(Activity var1, CommonCallbacks var2, WebView var3);

    public String getClasses(String var1, int var2, int var3, String var4, String var5, int var6, SeatAvailabilityInterface var7);

    public String getClearDelayTimeFromMinutes(int var1);

    public String[][] getCoachComment(String var1);

    public String[] getCurrentStatusAndComment(String var1, String var2, String var3);

    public int getIRParserVersion();

    public String getImageResultFromMobond(String var1, String var2);

    public void getPNRResults(Activity var1, String var2, PNRCallbacks var3);

    public Object[] getPNRorSeatAvailCaptchaResults(String var1, String var2, String var3, String var4, Map<String, String> var5);

    public String getPnrDepartureTimeFromMNTES(String var1, String var2, String var3);

    public String getPnrStatus(String var1, String var2, String var3, String var4);

    public String getRunningStatus(String var1);

    public Object[] getRunningStatusFromWeb(String var1, String var2, String var3, Map<String, String> var4);

    public void getRunningStatusViaWeb(Activity var1, String var2, CommonCallbacks var3, WebView var4);

    public String getSeatStatus(String var1, String var2, int var3, int var4, String var5, String var6, String var7, int var8, Context var9, SeatAvailabilityInterface var10);

    public String getStartDateClean(String var1);

    public String getTrainTimeTable(String var1);

    public String getTrainsList(String var1, String var2);

    public String getdMMMyyyyDate();

    public String replaceAllKeepNumbersTrain(String var1);

    public Object[] requestCancelledNRescheduleTrains(String var1, String var2, String var3, String var4, Map<String, String> var5);

    public Object[] requestPNR(String var1, String var2, String var3, String var4, Map<String, String> var5);

    public Object[] requestSeatAvailability(String var1, String var2, String var3, String var4, Map<String, String> var5);
}

