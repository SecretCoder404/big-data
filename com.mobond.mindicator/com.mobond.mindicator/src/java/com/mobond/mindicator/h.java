/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Html
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  androidx.core.app.a
 *  androidx.core.content.a
 *  com.mobond.mindicator.ui.n
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package com.mobond.mindicator;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import androidx.appcompat.app.d;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.n;
import com.mulo.util.e;
import java.util.Arrays;

public class h {
    public static void a(final Activity activity, final int n2) {
        String string;
        String string2 = activity.getString(2131755248);
        String string3 = activity.getString(2131755222);
        switch (n2) {
            default: {
                string = activity.getString(2131755240);
                break;
            }
            case 110: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(activity.getString(2131755388));
                stringBuilder.append(" ");
                stringBuilder.append(activity.getString(2131755070));
                stringBuilder.append(" ");
                stringBuilder.append(activity.getString(2131755073));
                String string4 = stringBuilder.toString();
                String string5 = activity.getString(2131755172);
                string = string4;
                string3 = string5;
                break;
            }
            case 109: {
                string = activity.getString(2131755358);
                break;
            }
            case 108: {
                string = activity.getString(2131755554);
                break;
            }
            case 106: 
            case 107: {
                string = activity.getString(2131755421);
                break;
            }
            case 105: {
                string = activity.getString(2131755448);
                break;
            }
            case 104: {
                string = activity.getString(2131755268);
                break;
            }
            case 103: {
                string = activity.getString(2131755082);
                break;
            }
            case 102: {
                string = activity.getString(2131755093);
                break;
            }
            case 101: {
                string = activity.getString(2131755198);
                break;
            }
            case 100: {
                string = activity.getString(2131755378);
            }
        }
        if (a.a(activity).D()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<b>");
            stringBuilder.append(string);
            stringBuilder.append("</b>");
            string = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("<big>");
            stringBuilder2.append(string2);
            stringBuilder2.append("</big>");
            string2 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("<big>");
            stringBuilder3.append(string3);
            stringBuilder3.append("</big>");
            string3 = stringBuilder3.toString();
        }
        d.a a2 = new d.a((Context)activity);
        a2.b((CharSequence)string);
        a2.a((CharSequence)string2, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts((String)"package", (String)activity.getPackageName(), null));
                activity.startActivity(intent);
            }
        });
        a2.b((CharSequence)string3, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n22) {
                dialogInterface.dismiss();
                if (n2 == 110) {
                    Activity activity2 = activity;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(activity.getString(2131755070));
                    stringBuilder.append(" will not work without Location Permission");
                    n.d((Context)activity2, (String)stringBuilder.toString());
                    activity.finish();
                }
            }
        });
        a2.a(false);
        a2.b().show();
    }

    public static void a(Activity activity, String string, String[] arrstring, int n2) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (h.a(activity, arrstring)) {
                h.a(activity, n2);
                return;
            }
            h.b(activity, string, arrstring, n2);
        }
    }

    public static void a(Activity activity, String[] arrstring, int n2) {
        androidx.core.app.a.a((Activity)activity, (String[])arrstring, (int)n2);
    }

    public static boolean a(Activity activity, String[] arrstring) {
        return a.a(activity).a(Arrays.toString((Object[])arrstring), false);
    }

    public static boolean a(Context context, String string) {
        return androidx.core.content.a.b((Context)context, (String)string) == 0;
    }

    public static boolean a(Context context, String[] arrstring) {
        if (arrstring.length == 0) {
            return true;
        }
        int n2 = arrstring.length;
        boolean bl2 = true;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = arrstring[i2];
            bl2 = bl2 && androidx.core.content.a.b((Context)context, (String)string) == 0;
        }
        return bl2;
    }

    private static void b(final Activity activity, String string, final String[] arrstring, final int n2) {
        String string2;
        String string3;
        String string4 = activity.getString(2131755214);
        String string5 = activity.getString(2131755222);
        switch (n2) {
            default: {
                string2 = activity.getString(2131755240, new Object[]{e.a(string, new char[]{',', ' ', '&'}).replace((CharSequence)"Sms", (CharSequence)"SMS")});
                break;
            }
            case 112: {
                string2 = activity.getString(2131755437);
                break;
            }
            case 111: {
                string2 = activity.getString(2131755270);
                break;
            }
            case 109: {
                string2 = activity.getString(2131755358);
                break;
            }
            case 108: {
                string2 = activity.getString(2131755555);
                break;
            }
            case 106: 
            case 107: {
                string2 = activity.getString(2131755422);
                break;
            }
            case 105: {
                string2 = activity.getString(2131755449);
                break;
            }
            case 104: {
                string2 = activity.getString(2131755269);
                break;
            }
            case 103: {
                string2 = activity.getString(2131755083);
                break;
            }
            case 102: {
                string2 = activity.getString(2131755094);
                break;
            }
            case 101: {
                string2 = activity.getString(2131755199);
                break;
            }
            case 100: {
                string2 = activity.getString(2131755379);
            }
        }
        if (arrstring.length > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(activity.getString(2131755215, new Object[]{string}));
            stringBuilder.append("s");
            string3 = stringBuilder.toString();
        } else {
            string3 = activity.getString(2131755215, new Object[]{string});
        }
        if (n2 != 109) {
            if (b.d((Context)activity)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(activity.getResources().getQuantityString(2131623936, arrstring.length));
                string2 = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(activity.getResources().getString(2131755235));
                string2 = stringBuilder.toString();
            }
        }
        if (a.a(activity).D()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<b>");
            stringBuilder.append(string3);
            stringBuilder.append("</b>");
            string3 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("<big>");
            stringBuilder2.append(string4);
            stringBuilder2.append("</big>");
            string4 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("<big>");
            stringBuilder3.append(string5);
            stringBuilder3.append("</big>");
            string5 = stringBuilder3.toString();
        }
        d.a a2 = new d.a((Context)activity);
        a2.a((CharSequence)string3);
        a2.b((CharSequence)string2);
        a2.a((CharSequence)Html.fromHtml((String)string4), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n22) {
                androidx.core.app.a.a((Activity)activity, (String[])arrstring, (int)n2);
            }
        });
        a2.b((CharSequence)Html.fromHtml((String)string5), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        });
        a2.a(false);
        a2.b().show();
    }

}

