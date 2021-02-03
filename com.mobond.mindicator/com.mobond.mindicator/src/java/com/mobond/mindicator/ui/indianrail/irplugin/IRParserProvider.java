/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Log
 *  android.webkit.WebView
 *  dalvik.system.DexClassLoader
 *  java.io.File
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Method
 *  java.text.SimpleDateFormat
 *  java.util.HashMap
 *  java.util.Map
 */
package com.mobond.mindicator.ui.indianrail.irplugin;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.indianrail.irplugin.CommonCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParser;
import com.mobond.mindicator.ui.indianrail.irplugin.IRParserInterface;
import com.mobond.mindicator.ui.indianrail.irplugin.PNRCallbacks;
import com.mobond.mindicator.ui.indianrail.irplugin.SeatAvailabilityInterface;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class IRParserProvider
implements IRParserInterface {
    private static final String IRPARSER_CLASS_PATH = "irplugin.IRParser";
    private static final String disconnect = "disconnect";
    private static final String extractPnrFromSMS = "extractPnrFromSMS";
    private static final String formatIntoAMPM = "formatIntoAMPM";
    private static final String get1HourPriorDepartureTime = "get1HourPriorDepartureTime";
    private static final String get2DaysPriorTime = "get2DaysPriorTime";
    private static final String getCancelledRescheduledDateFormat = "getCancelledRescheduledDateFormat";
    private static final String getCancelledRescheduledTrains = "getCancelledRescheduledTrains";
    private static final String getCancelledRescheduledTrainsNew = "getCancelledRescheduledTrainsNew";
    private static final String getClasses = "getClasses";
    private static final String getClearDelayTimeFromMinutes = "getClearDelayTimeFromMinutes";
    private static final String getCoachComment = "getCoachComment";
    private static final String getCurrentStatusAndComment = "getCurrentStatusAndComment";
    private static final String getIRParserVersion = "getIRParserVersion";
    private static final String getImageResultFromMobond = "getImageResultFromMobond";
    private static final String getPNRResults = "getPNRResults";
    private static final String getPNRorSeatAvailCaptchaResults = "getPNRorSeatAvailCaptchaResults";
    private static final String getPnrDepartureTimeFromMNTES = "getPnrDepartureTimeFromMNTES";
    private static final String getPnrStatus = "getPnrStatus";
    private static final String getRunningStatus = "getRunningStatus";
    private static final String getRunningStatusFromWeb = "getRunningStatusFromWeb";
    private static final String getRunningStatusViaWeb = "getRunningStatusViaWeb";
    private static final String getSeatStatus = "getSeatStatus";
    private static final String getStartDateClean = "getStartDateClean";
    private static final String getTrainTimeTable = "getTrainTimeTable";
    private static final String getTrainsList = "getTrainsList";
    private static final String getdMMMyyyyDate = "getdMMMyyyyDate";
    private static final String[] irParserMethodNames = new String[]{"disconnect", "getTrainsList", "getSeatStatus", "getClasses", "getPnrStatus", "getPnrDepartureTimeFromMNTES", "extractPnrFromSMS", "getCurrentStatusAndComment", "get1HourPriorDepartureTime", "get2DaysPriorTime", "getCoachComment", "getTrainTimeTable", "getdMMMyyyyDate", "getRunningStatus", "getClearDelayTimeFromMinutes", "getStartDateClean", "formatIntoAMPM", "replaceAllKeepNumbersTrain", "getCancelledRescheduledTrains", "getCancelledRescheduledDateFormat", "getRunningStatusFromWeb", "getPNRorSeatAvailCaptchaResults", "requestPNR", "requestSeatAvailability", "requestCancelledNRescheduleTrains", "getImageResultFromMobond", "getPNRResults", "getRunningStatusViaWeb", "getCancelledRescheduledTrainsNew"};
    private static IRParserProvider irParserProvider;
    private static final String replaceAllKeepNumbersTrain = "replaceAllKeepNumbersTrain";
    private static final String requestCancelledNRescheduleTrains = "requestCancelledNRescheduleTrains";
    private static final String requestPNR = "requestPNR";
    private static final String requestSeatAvailability = "requestSeatAvailability";
    private Object classObjectReference;
    private HashMap<String, Method> irParserMethods;

    /*
     * Exception decompiling
     */
    private IRParserProvider() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static IRParserProvider getIRParser() {
        if (irParserProvider == null) {
            irParserProvider = new IRParserProvider();
        }
        return irParserProvider;
    }

    private Class<?> loadParserClass() {
        File file = new File(ConfigurationManager.b().getFilesDir(), "irparserdb");
        try {
            if (file.exists()) {
                String string = file.getAbsolutePath();
                Class class_ = new DexClassLoader(string, string.substring(0, string.lastIndexOf(File.separator)), null, this.getClass().getClassLoader()).loadClass(IRPARSER_CLASS_PATH);
                Object object = class_.newInstance();
                int n2 = (Integer)class_.getMethod(getIRParserVersion, new Class[0]).invoke(object, new Object[0]);
                if (n2 > 2019041601) {
                    return class_;
                }
                return null;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static void logger(String string) {
        Log.d((String)"IRParserProvider", (String)string);
    }

    @Override
    public void disconnect() {
        try {
            ((Method)this.irParserMethods.get((Object)disconnect)).invoke(this.classObjectReference, new Object[0]);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public String extractPnrFromSMS(String string, String string2) {
        Object object = ((Method)this.irParserMethods.get((Object)extractPnrFromSMS)).invoke(this.classObjectReference, new Object[]{string, string2});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public String formatIntoAMPM(String string, boolean bl) {
        try {
            Method method = (Method)this.irParserMethods.get((Object)formatIntoAMPM);
            Object object = this.classObjectReference;
            Object[] arrobject = new Object[]{string, bl};
            String string2 = (String)method.invoke(object, arrobject);
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }

    @Override
    public long get1HourPriorDepartureTime(String string) {
        try {
            long l2 = (Long)((Method)this.irParserMethods.get((Object)get1HourPriorDepartureTime)).invoke(this.classObjectReference, new Object[]{string});
            return l2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return -1L;
        }
    }

    @Override
    public long get2DaysPriorTime(String string) {
        try {
            long l2 = (Long)((Method)this.irParserMethods.get((Object)get2DaysPriorTime)).invoke(this.classObjectReference, new Object[]{string});
            return l2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return -1L;
        }
    }

    @Override
    public SimpleDateFormat getCancelledRescheduledDateFormat() {
        try {
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat)((Method)this.irParserMethods.get((Object)getCancelledRescheduledDateFormat)).invoke(this.classObjectReference, new Object[0]);
            return simpleDateFormat;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public String getCancelledRescheduledTrains(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("classObjectReference: ");
        stringBuilder.append(this.classObjectReference.getClass().getCanonicalName());
        Log.d((String)"1111", (String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("classObjectReference: ");
        stringBuilder2.append(((IRParser)this.classObjectReference).getIRParserVersion());
        Log.d((String)"1111", (String)stringBuilder2.toString());
        Object object = ((Method)this.irParserMethods.get((Object)getCancelledRescheduledTrains)).invoke(this.classObjectReference, new Object[]{string, string2, string3});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public void getCancelledRescheduledTrainsNew(Activity activity, CommonCallbacks commonCallbacks, WebView webView) {
        try {
            ((Method)this.irParserMethods.get((Object)getCancelledRescheduledTrainsNew)).invoke(this.classObjectReference, new Object[]{activity, commonCallbacks, webView});
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public String getClasses(String string, int n2, int n3, String string2, String string3, int n4, SeatAvailabilityInterface seatAvailabilityInterface) {
        Method method = (Method)this.irParserMethods.get((Object)getClasses);
        Object object = this.classObjectReference;
        Object[] arrobject = new Object[]{string, n2, n3, string2, string3, n4, seatAvailabilityInterface};
        Object object2 = method.invoke(object, arrobject);
        if (object2 == null) {
            return null;
        }
        return (String)object2;
    }

    @Override
    public String getClearDelayTimeFromMinutes(int n2) {
        try {
            Method method = (Method)this.irParserMethods.get((Object)getClearDelayTimeFromMinutes);
            Object object = this.classObjectReference;
            Object[] arrobject = new Object[]{n2};
            String string = (String)method.invoke(object, arrobject);
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(n2);
            return stringBuilder.toString();
        }
    }

    @Override
    public String[][] getCoachComment(String string) {
        try {
            String[][] arrstring = (String[][])((Method)this.irParserMethods.get((Object)getCoachComment)).invoke(this.classObjectReference, new Object[]{string});
            return arrstring;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String[0][];
        }
    }

    @Override
    public String[] getCurrentStatusAndComment(String string, String string2, String string3) {
        try {
            String[] arrstring = (String[])((Method)this.irParserMethods.get((Object)getCurrentStatusAndComment)).invoke(this.classObjectReference, new Object[]{string, string2, string3});
            return arrstring;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String[2];
        }
    }

    @Override
    public int getIRParserVersion() {
        return 0;
    }

    @Override
    public String getImageResultFromMobond(String string, String string2) {
        Object object = ((Method)this.irParserMethods.get((Object)getImageResultFromMobond)).invoke(this.classObjectReference, new Object[]{string, string2});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public void getPNRResults(Activity activity, String string, PNRCallbacks pNRCallbacks) {
        try {
            ((Method)this.irParserMethods.get((Object)getPNRResults)).invoke(this.classObjectReference, new Object[]{activity, string, pNRCallbacks});
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public Object[] getPNRorSeatAvailCaptchaResults(String string, String string2, String string3, String string4, Map<String, String> map) {
        Object object = ((Method)this.irParserMethods.get((Object)getPNRorSeatAvailCaptchaResults)).invoke(this.classObjectReference, new Object[]{string, string2, string3, string4, map});
        if (object == null) {
            return null;
        }
        return (Object[])object;
    }

    @Override
    public String getPnrDepartureTimeFromMNTES(String string, String string2, String string3) {
        Object object = ((Method)this.irParserMethods.get((Object)getPnrDepartureTimeFromMNTES)).invoke(this.classObjectReference, new Object[]{string, string2, string3});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public String getPnrStatus(String string, String string2, String string3, String string4) {
        Object object = ((Method)this.irParserMethods.get((Object)getPnrStatus)).invoke(this.classObjectReference, new Object[]{string, string2, string3, string4});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public String getRunningStatus(String string) {
        Object object = ((Method)this.irParserMethods.get((Object)getRunningStatus)).invoke(this.classObjectReference, new Object[]{string});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public Object[] getRunningStatusFromWeb(String string, String string2, String string3, Map<String, String> map) {
        Object object = ((Method)this.irParserMethods.get((Object)getRunningStatusFromWeb)).invoke(this.classObjectReference, new Object[]{string, string2, string3, map});
        if (object == null) {
            return null;
        }
        return (Object[])object;
    }

    @Override
    public void getRunningStatusViaWeb(Activity activity, String string, CommonCallbacks commonCallbacks, WebView webView) {
        try {
            ((Method)this.irParserMethods.get((Object)getRunningStatusViaWeb)).invoke(this.classObjectReference, new Object[]{activity, string, commonCallbacks, webView});
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public String getSeatStatus(String string, String string2, int n2, int n3, String string3, String string4, String string5, int n4, Context context, SeatAvailabilityInterface seatAvailabilityInterface) {
        Method method = (Method)this.irParserMethods.get((Object)getSeatStatus);
        Object object = this.classObjectReference;
        Object[] arrobject = new Object[]{string, string2, n2, n3, string3, string4, string5, n4, context, seatAvailabilityInterface};
        Object object2 = method.invoke(object, arrobject);
        if (object2 == null) {
            return null;
        }
        return (String)object2;
    }

    @Override
    public String getStartDateClean(String string) {
        Object object = ((Method)this.irParserMethods.get((Object)getStartDateClean)).invoke(this.classObjectReference, new Object[]{string});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public String getTrainTimeTable(String string) {
        Object object = ((Method)this.irParserMethods.get((Object)getTrainTimeTable)).invoke(this.classObjectReference, new Object[]{string});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public String getTrainsList(String string, String string2) {
        Object object = ((Method)this.irParserMethods.get((Object)getTrainsList)).invoke(this.classObjectReference, new Object[]{string, string2});
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public String getdMMMyyyyDate() {
        Object object = ((Method)this.irParserMethods.get((Object)getdMMMyyyyDate)).invoke(this.classObjectReference, new Object[0]);
        if (object == null) {
            return null;
        }
        return (String)object;
    }

    @Override
    public String replaceAllKeepNumbersTrain(String string) {
        try {
            String string2 = (String)((Method)this.irParserMethods.get((Object)replaceAllKeepNumbersTrain)).invoke(this.classObjectReference, new Object[]{string});
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }

    @Override
    public Object[] requestCancelledNRescheduleTrains(String string, String string2, String string3, String string4, Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("requestCancelledNRescheduleTrains classObjectReference: ");
        stringBuilder.append(this.classObjectReference.getClass().getCanonicalName());
        Log.d((String)"1111", (String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("requestCancelledNRescheduleTrains classObjectReference: ");
        stringBuilder2.append(((IRParser)this.classObjectReference).getIRParserVersion());
        Log.d((String)"1111", (String)stringBuilder2.toString());
        Object object = ((Method)this.irParserMethods.get((Object)requestCancelledNRescheduleTrains)).invoke(this.classObjectReference, new Object[]{string, string2, string3, string4, map});
        if (object == null) {
            return null;
        }
        return (Object[])object;
    }

    @Override
    public Object[] requestPNR(String string, String string2, String string3, String string4, Map<String, String> map) {
        Object object = ((Method)this.irParserMethods.get((Object)requestPNR)).invoke(this.classObjectReference, new Object[]{string, string2, string3, string4, map});
        if (object == null) {
            return null;
        }
        return (Object[])object;
    }

    @Override
    public Object[] requestSeatAvailability(String string, String string2, String string3, String string4, Map<String, String> map) {
        Object object = ((Method)this.irParserMethods.get((Object)requestSeatAvailability)).invoke(this.classObjectReference, new Object[]{string, string2, string3, string4, map});
        if (object == null) {
            return null;
        }
        return (Object[])object;
    }
}

