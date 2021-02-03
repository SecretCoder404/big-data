/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.e
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Hashtable
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.mobond.mindicator.ui.indianrail.checklist;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.mobond.mindicator.a;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.indianrail.checklist.CheckLists;
import com.mobond.mindicator.ui.n;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public class CheckLists
extends e {
    public static Hashtable<String, String> a;
    public static String b;
    static b c;
    public LinearLayout d;
    private View e;

    public void a() {
        try {
            for (Map.Entry entry : a.entrySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(entry.getKey());
                String string = stringBuilder.toString();
                b b2 = c;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("checklist_checked_");
                stringBuilder2.append(string.replace((CharSequence)" ", (CharSequence)""));
                b2.b(stringBuilder2.toString(), "#");
                b b3 = c;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("checklist_removed_");
                stringBuilder3.append(string.replace((CharSequence)" ", (CharSequence)""));
                b3.b(stringBuilder3.toString(), "#");
            }
            this.d.removeAllViews();
            this.a(this.getApplicationContext());
            n.c(this.getApplicationContext(), this.getResources().getString(2131755469));
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public void a(Context context) {
        a = new Hashtable();
        String[] arrstring = new String[10];
        arrstring[0] = "Documents";
        int n2 = 1;
        arrstring[n2] = "Boys Clothes";
        arrstring[2] = "Girls Clothes";
        arrstring[3] = "Kids";
        arrstring[4] = "Essentials";
        arrstring[5] = "Accessories";
        arrstring[6] = "Games";
        arrstring[7] = "Medicines";
        arrstring[8] = "Food Items";
        arrstring[9] = "Do Remember";
        if (b == null) {
            b = a.b(context).D() ? "[[\"\u0926\u0938\u094d\u0924\u093e\u0935\u0947\u091c\u093c\",\"\u091f\u093f\u0915\u091f\",\"\u0921\u0947\u092c\u093f\u091f \u0914\u0930 \u0915\u094d\u0930\u0947\u0921\u093f\u091f \u0915\u093e\u0930\u094d\u0921\",\"\u0928\u0958\u0926 \u092a\u0948\u0938\u0947 / \u092c\u091f\u0941\u0906\",\"\u0939\u094b\u091f\u0932 \u0915\u093e \u092a\u0924\u093e\",\"\u0939\u094b\u091f\u0932 \u092e\u0947\u0902 \u0930\u0939\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u092a\u0939\u091a\u093e\u0928 \u092a\u094d\u0930\u092e\u093e\u0923 (ID Card) - \u092a\u0948\u0928 \u092f\u093e \u092a\u093e\u0938\u092a\u094b\u0930\u094d\u091f\",\"\u0921\u094d\u0930\u093e\u0907\u0935\u093f\u0902\u0917 \u0932\u093e\u0907\u0938\u0947\u0902\u0938\",\"\u092e\u0939\u0924\u094d\u0935\u092a\u0942\u0930\u094d\u0923 \u0928\u093e\u092e \u0914\u0930 \u0938\u0902\u092a\u0930\u094d\u0915 \u0935\u093e\u0932\u0940 \u0921\u093e\u092f\u0930\u0940\",\"\u0935\u093f\u0926\u0947\u0936\u0940 \u092f\u093e\u0924\u094d\u0930\u093e \u0915\u0947 \u0932\u093f\u090f \u092a\u093e\u0938\u092a\u094b\u0930\u094d\u091f / \u0935\u0940\u091c\u093e\",\"\u0938\u093e\u092e\u093e\u0928 \u0915\u0947 \u0932\u093f\u090f \u091f\u0948\u0917\"],[\"\u0932\u095c\u0915\u094b\u0902 \u0915\u0947 \u0915\u092a\u0921\u093c\u0947\",\"\u0924\u094c\u0932\u093f\u092f\u093e\",\"\u0905\u0902\u0924\u0930\u094d\u0935\u0938\u094d\u0924\u094d\u0930\",\"\u091f\u0940-\u0936\u0930\u094d\u091f / \u0936\u0930\u094d\u091f\",\"\u091c\u0940\u0928\u094d\u0938\",\"\u0936\u0949\u0930\u094d\u091f\u094d\u0938\",\"\u0930\u0942\u092e\u093e\u0932\",\"\u091c\u0942\u0924\u0947 \u0914\u0930 \u092e\u094b\u091c\u0947\",\"\u0938\u094b\u0928\u0947 \u0915\u0947 \u0915\u092a\u095c\u0947\",\"\u092c\u0947\u0932\u094d\u091f\",\"\u091c\u0948\u0915\u0947\u091f\",\"\u0938\u094d\u0935\u0947\u091f\u0930\",\"\u0938\u094d\u0935\u093f\u092e\u0938\u0942\u091f\",\"\u091f\u094b\u092a\u0940 ( \u0939\u0948\u091f )\"],[\"\u0932\u095c\u0915\u093f\u092f\u094b\u0902 \u0915\u0947 \u0915\u092a\u095c\u0947\",\"\u0924\u094c\u0932\u093f\u092f\u093e\",\"\u0905\u0902\u0924\u0930\u094d\u0935\u0938\u094d\u0924\u094d\u0930\",\"\u0932\u0921\u093c\u0915\u093f\u092f\u094b\u0902 \u0915\u0940 \u091f\u0949\u092a\",\"\u091f\u0940-\u0936\u0930\u094d\u091f\",\"\u091c\u0940\u0928\u094d\u0938\",\"\u0936\u0949\u0930\u094d\u091f\u094d\u0938\",\"\u0907\u0924\u0930 \u0915\u092a\u095c\u0947\",\"\u0930\u0942\u092e\u093e\u0932\",\"\u0938\u094d\u0915\u093e\u0930\u094d\u092b \",\"\u0938\u0948\u0902\u0921\u0932\",\"\u091c\u0942\u0924\u0947 \u0914\u0930 \u092e\u094b\u091c\u0947\",\"\u0938\u094b\u0928\u0947 \u0915\u0947 \u0915\u092a\u095c\u0947\",\"\u0938\u0948\u0928\u093f\u091f\u0930\u0940 \u0928\u0948\u092a\u0915\u093f\u0928\",\"\u091c\u0948\u0915\u0947\u091f\",\"\u0938\u094d\u0935\u0947\u091f\u0930\",\"\u0938\u094d\u0935\u093f\u092e\u0938\u0942\u091f\",\"\u091f\u094b\u092a\u0940 ( \u0939\u0948\u091f )\"],[\"\u092c\u091a\u094d\u091a\u0947\u0902\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u0947 \u0915\u092a\u0921\u0947\u0902\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u093e \u0916\u093e\u0928\u093e\",\"\u0917\u0940\u0932\u093e  \u092a\u094b\u0902\u091b\u093e / \u0932\u0902\u0917\u094b\u091f\",\"\u0916\u093f\u0932\u094c\u0928\u0947\",\"\u0906\u092a\u093e\u0924\u0915\u093e\u0932\u0940\u0928 \u0926\u0935\u093e\u090f\u0902\",\"\u0928\u093e\u0936\u094d\u0924\u093e\",\"\u092c\u0947\u092c\u0940 \u0932\u094b\u0936\u0928\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u093e \u0907\u0924\u0930 \u0916\u093e\u0928\u093e\",\"\u092c\u091a\u094d\u091a\u094b\u0902 \u0915\u0940 \u0917\u093e\u0921\u093c\u0940\"],[\"\u0905\u0924\u094d\u092f\u093e\u0935\u0936\u094d\u092f\u0915 \u0935\u0938\u094d\u0924\u0941\u090f\u0902\",\"\u092a\u093e\u0928\u0940 \u0915\u0940 \u092c\u094b\u0924\u0932\",\"\u091f\u0942\u0925\u092a\u0947\u0938\u094d\u091f \u0914\u0930 \u091f\u0942\u0925\u092c\u094d\u0930\u0936\",\"\u0915\u0902\u0918\u0940 \u0914\u0930 \u0936\u0947\u0935\u093f\u0902\u0917 \u0915\u093f\u091f\",\"\u0938\u093e\u092c\u0941\u0928 \u0914\u0930 \u092b\u0947\u0938 \u0935\u0949\u0936\",\"\u0921\u093f\u0913\u0921\u094b\u0930\u0947\u0902\u091f\u094d\u0938\",\"\u0924\u0947\u0932 \u0914\u0930 \u0936\u0948\u0902\u092a\u0942\",\"\u0938\u0928\u0938\u094d\u0915\u094d\u0930\u0940\u0928 \u0914\u0930 \u092e\u0949\u0907\u0938\u094d\u091a\u0930\u093e\u0907\u091c\u0930\u094d\u0938\",\"\u0938\u093e\u092e\u093e\u0928\u094d\u092f \u092e\u0947\u0915\u0905\u092a \u0914\u0930 \u0906\u092d\u0942\u0937\u0923 \u0938\u093e\u092e\u0917\u094d\u0930\u0940\",\"\u092c\u091f\u0941\u0906, \u092a\u0930\u094d\u0938\",\"\u0938\u0947\u092b\u093c\u094d\u091f\u0940 \u092a\u093f\u0928\",\"\u091f\u094d\u0930\u0947\u0928 \u092f\u093e\u0924\u094d\u0930\u093f\u092f\u094b\u0902 \u0915\u0947 \u0932\u093f\u090f \u0924\u093e\u0932\u093e \u0914\u0930 \u091c\u093c\u0902\u091c\u0940\u0930\",\"\u0938\u0947\u0928\u093f\u091f\u093e\u0907\u091c\u0930\u094d\u0938 \u0914\u0930 \u091f\u093f\u0936\u094d\u092f\u0942 \u092a\u0947\u092a\u0930\"],[\"\u0938\u0939\u093e\u092f\u0915 \u0938\u093e\u092e\u0917\u094d\u0930\u0940\",\"\u092a\u095d\u093e\u0908 \u0915\u093e \u0914\u0930 \u0927\u0942\u092a \u0915\u093e \u091a\u0936\u094d\u092e\u093e\",\"\u0907\u092f\u0930\u092b\u093c\u094b\u0928\",\"\u092a\u093e\u0935\u0930 \u092c\u0948\u0902\u0915\",\"\u092e\u094b\u092c\u093e\u0907\u0932 \u092b\u094b\u0928\",\"\u092e\u094b\u092c\u093e\u0907\u0932 \u091a\u093e\u0930\u094d\u091c\u0930\",\"\u0915\u0948\u092e\u0930\u093e, SD \u0915\u093e\u0930\u094d\u0921, \u0915\u0948\u092e\u0930\u093e \u091a\u093e\u0930\u094d\u091c\u0930\",\"\u091f\u0949\u0930\u094d\u091a\",\"\u092a\u0947\u0928 + \u0928\u094b\u091f\u092c\u0941\u0915\",\"\u092a\u0922\u093c\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u092a\u0941\u0938\u094d\u0924\u0915\u0947\u0902 / \u092e\u0948\u0917\u095b\u0940\u0928\",\"\u0932\u0948\u092a\u091f\u0949\u092a, \u091f\u0948\u092c \u0914\u0930 \u0915\u093f\u0902\u0921\u0932\",\"\u092e\u091a\u094d\u091b\u0930 \u0928\u093f\u0930\u094b\u0927\u0915 \u2013 \u0913\u0921\u094b\u092e\u0949\u0938, \u0915\u0949\u0907\u0932 + \u092e\u0948\u091a \u092c\u0949\u0915\u094d\u0938, \u0917\u0941\u0921 \u0928\u093e\u0907\u091f\",\"\u0909\u0932\u094d\u091f\u0940 \u0915\u0947 \u0932\u093f\u090f \u0906\u092a\u093e\u0924\u0915\u093e\u0932\u0940\u0928 \u092c\u0948\u0917\",\"\u0936\u0949\u092a\u093f\u0902\u0917 \u0915\u0947 \u0932\u093f\u090f \u0905\u0924\u093f\u0930\u093f\u0915\u094d\u0924 \u0915\u0948\u0930\u0940 \u092c\u0948\u0917\"],[\"\u0916\u0947\u0932\",\"\u0924\u093e\u0936 \u0915\u093e \u092a\u0924\u094d\u0924\u093e - \u0909\u0928\u094b / \u0930\u092e\u094d\u092e\u0940\",\"\u092b\u0941\u091f\u092c\u0949\u0932 / \u092c\u093e\u0938\u094d\u0915\u0947\u091f \u092c\u0949\u0932\",\"\u0938\u093e\u0902\u092a \u0914\u0930 \u0938\u0940\u0922\u093c\u0940\",\"\u0915\u094d\u0930\u093f\u0915\u0947\u091f\",\"\u092b\u094d\u0930\u093f\u0938\u094d\u092c\u0940\",\"\u0924\u0940\u0930\u0902\u0926\u093e\u091c\u093c\u0940\",\"\u092c\u0948\u0921\u092e\u093f\u0902\u091f\u0928\",\"\u092a\u094d\u0930\u0924\u093f\u092f\u094b\u0917\u093f\u0924\u093e - \u092c\u093f\u0928\u093e \u0939\u093e\u0925\u094b\u0902 \u0938\u0947 \u092e\u0942\u0902\u0917\u092b\u0932\u0940 \u0959\u093e\u0913 - \u092a\u0939\u0932\u0947 \u0916\u0924\u094d\u092e \u0915\u0930\u0928\u0947 \u0935\u093e\u0932\u093e \u0935\u093f\u091c\u0947\u0924\u093e\",\"\u091a\u094b\u0930 \u2013 \u092a\u0941\u0932\u093f\u0938 \u0915\u093e \u0916\u0947\u0932\",\"\u092c\u094b\u0930\u093e \u0926\u094c\u0921\u093c (\u0938\u0948\u0915 \u0930\u0947\u0938)\",\"\u0905\u0902\u0924\u093e\u0915\u094d\u0937\u0930\u0940\"],[\"\u0926\u0935\u093e\u0908\u092f\u093e\u0901\",\"Hyoscine - \u092f\u093e\u0924\u094d\u0930\u093e \u0915\u0947 \u0926\u094c\u0930\u093e\u0928 \u0909\u0932\u091f\u0940 \u0928 \u0906\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f\",\"ENO \u2013 \u0905\u092e\u094d\u0932\u0924\u093e\",\"\u092a\u0941\u0926\u093f\u0928 \u0939\u0930\u093e -  \u092a\u0947\u091f \u0926\u0930\u094d\u0926, \u0917\u0948\u0938 \u0905\u0925\u0935\u093e \u0905\u092a\u091a\u0928\",\"\u0935\u0949\u0932\u093f\u0928\u0940 \u0938\u094d\u092a\u094d\u0930\u0947 - \u092e\u093e\u0902\u0938\u092a\u0947\u0936\u093f\u092f\u094b\u0902 \u0915\u0940 \u0926\u0930\u094d\u0926 \u0938\u0947 \u0930\u093e\u0939\u0924\",\"\u092a\u091f\u094d\u091f\u0940 (\u092c\u0948\u0902\u0921\u0947\u091c)\",\"\u0915\u094d\u0930\u094b\u0938\u093f\u0928 - \u092c\u0941\u0916\u093e\u0930\",\"\u0935\u093f\u0915\u094d\u0938 \u090f\u0915\u094d\u0936\u0928 500 - \u0938\u093f\u0930\u0926\u0930\u094d\u0926, \u0928\u093e\u0915 \u092c\u0902\u0926 \u0939\u094b\u0928\u093e, \u0917\u0932\u0947 \u092e\u0947\u0902 \u0926\u0930\u094d\u0926, \u0936\u093e\u0930\u0940\u0930\u093f\u0915 \u0926\u0930\u094d\u0926\",\"\u0938\u0949\u092b\u094d\u0930\u092e\u093e\u0907\u0938\u093f\u0928 -  \u091a\u094b\u091f \u0915\u0947 \u0932\u093f\u090f\",\"\u0921\u0947\u091f\u0949\u0932\"],[\"\u0916\u093e\u0926\u094d\u092f \u0935\u0938\u094d\u0924\u0941\u090f\u0902\",\"\u0928\u093e\u0936\u094d\u0924\u093e\",\"\u0938\u0942\u0916\u0940 \u092d\u0947\u0932\",\"\u0916\u093e\u0916\u0930\u093e\",\"\u092e\u0947\u0925\u0940 \u0925\u0947\u092a\u094d\u0932\u093e\",\"\u091a\u0915\u0932\u0940\",\"\u091a\u093f\u092a\u094d\u0938\",\"\u0938\u0941\u0915\u093e \u092e\u0947\u0935\u093e\",\"\u092e\u093f\u0920\u093e\u0907\u092f\u093e\u0901\",\"\u0915\u0949\u092b\u0940 \u092a\u093e\u0909\u0921\u0930\",\"\u0928\u0942\u0921\u0932\u094d\u0938\",\"\u092b\u0932\"],[\"\u092f\u0939 \u092f\u093e\u0926 \u0930\u0916\u093f\u090f\",\"\u0917\u0948\u0938 \u0935\u093e\u0932\u094d\u0935 \u092c\u0902\u0926 \u0915\u0930\u0947\u0902\",\"\u092c\u0924\u094d\u0924\u0940 / \u0917\u0940\u095b\u0930 / \u092e\u0947\u0928 \u0938\u094d\u0935\u093f\u091a \u092c\u0902\u0926 \u0915\u0930\u0947\u0902\",\"\u0938\u092d\u0940 \u092a\u093e\u0928\u0940 \u0915\u0947 \u0928\u0932 \u092c\u0902\u0926 \u0915\u0930\u0947\u0902\",\"\u092a\u094c\u0927\u094b\u0902 \u0915\u094b \u092a\u093e\u0928\u0940 \u0926\u0947\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0935\u094d\u092f\u0935\u0938\u094d\u0925\u093e \u0915\u0930\u0947\u0902\",\"\u092a\u093e\u0932\u0924\u0942 \u092a\u0936\u0941 \u0915\u0940 \u0926\u0947\u0916\u092d\u093e\u0932 \u0915\u0947 \u0932\u093f\u090f \u092a\u0930\u094d\u092f\u093e\u092f\",\"\u0926\u0942\u0927\u0935\u093e\u0932\u0947 \u0915\u094b \u092a\u0942\u0930\u094d\u0935\u0938\u0942\u091a\u0928\u093e \u0926\u0947\u0902\",\" \u0905\u0916\u093c\u092c\u093e\u0930 \u092a\u0939\u0941\u0901\u091a\u093e\u0928\u0947 \u0935\u093e\u0932\u0947 \u0915\u094b \u092a\u0942\u0930\u094d\u0935\u0938\u0942\u091a\u0928\u093e \u0926\u0947\u0902\",\"\u091b\u0941\u091f\u094d\u091f\u0940 \u0938\u094d\u0925\u093e\u0928, \u092a\u0924\u093e \u0914\u0930 \u0938\u0902\u092a\u0930\u094d\u0915 \u0915\u0947 \u092c\u093e\u0930\u0947 \u092e\u0947\u0902 \u0915\u0930\u0940\u092c\u0940 \u0930\u093f\u0936\u094d\u0924\u0947\u0926\u093e\u0930 \u0915\u094b \u0938\u0942\u091a\u093f\u0924 \u0915\u0930\u0947\u0902\",\"\u0938\u0941\u0930\u0915\u094d\u0937\u093e \u0918\u0902\u091f\u0940 \u091a\u093e\u0932\u0942 \u0915\u0930\u0947\u0902\",\" \u0905\u0932\u092e\u093e\u0930\u0940 \u092c\u0902\u0926 \u0915\u0930\u0915\u0947 \u091c\u093e\u090f\u0902\"]]" : "[[\"Documents\",\"Tickets\",\"Debit & Credit Cards\",\"Cash Money/Wallet\",\"Hotel Address\",\"ID Card for Hotel Stay - PAN or Passport\",\"Driving License\",\"Diary with important contact number and names\",\"Passport / Visa for Foreign Tour\",\"Name Tags for Luggage\"],[\"Boys Clothes\",\"Towel\",\"Inners\",\"T-Shirts/Shirts\",\"Jeans\",\"Shorts\",\"Handkerchief \",\"Shoes & Socks\",\"Sleepwear\",\"Belt\",\"Jacket\",\"Sweaters\",\"Swimsuits\",\"Hats\"],[\"Girls Clothes\",\"Towel\",\"Inners\",\"Tops\",\"T-Shirt\",\"Jeans\",\"Shorts\",\"Dresses\",\"Handkerchief\",\"Scarves \",\"Sandals\",\"Shoes & Socks\",\"Sleepwear\",\"Sanitary Napkin\",\"Jacket\",\"Sweaters\",\"Swimsuits\",\"Hats\"],[\"Kids\",\"Baby Clothes\",\"Baby Food\",\"Wet Wipes/ Nappies\",\"Toys\",\"Emergency Medicines\",\"Snacks\",\"Baby Lotions\",\"Baby Feeding Essentials\",\"Baby Carrier\"],[\"Essentials\",\"Water Bottle\",\"Toothpaste & Toothbrush\",\"Comb & Shaving Kit\",\"Soap & Face Wash\",\"Deodorants\",\"Oils & Shampoos\",\"Sunscreens & Moisturisers\",\"Basic Makeup & Jewellery Accessories \",\"Wallet, Purse\",\"Safety Pins\",\"Lock & Chain for train travellers\",\"Hand Sanitizers &Tissue Papers\"],[\"Accessories\",\"Reading Glass & Sunglasses\",\"Ear Phones\",\"Powerbank\",\"Mobile Phone\",\"Mobile Charger\",\"Camera, SD Card, Camera Charger\",\"Torch\",\"Pen + Notebook\",\"Books / Magazines for Reading\",\"Laptops, Tabs & Kindle\",\"Mosquito Repellents - Odomos -Coil + Match box -Good Knight \",\"Emergency Bags for Vomitting \",\"Extra Carry Bag for shopping\"],[\"Games\",\"Playing Cards - UNO / Rummy / Cheat\",\"Football / Basketball\",\"Snakes & Ladder\",\"Cricket bat & ball\",\" Frisbee \",\"Archery\",\"Badminton \",\"Competition - Peanuts eating in dish without touching hands - First one to finish becomes winner \",\"Chor-Police on Paper\",\"Sack Race\",\"Antakshari \"],[\"Medicines\",\"Hyoscine-Vomiting Tablet for Travel Sickness\",\"ENO - Acidity\",\"Pudin Hara -Stomach Ache, Gas and Indigestion\",\"Volini Spray - Muscle pain relief\",\"Bandage\",\"Crocin - Fever\",\"Vicks Action 500 - Headache, Blocked nose, Sore throat, Body ache\",\"Soframycin - for wounds\",\"Dettol\"],[\"Food Items\",\"Snacks\",\"Dry Bhel\",\"Khakra\",\"Methi Thepla\",\"Chakli\",\"Chips\",\"Dry Fruits\",\"Sweets\",\"Coffee Powder\",\"Instant Noodles\",\"Fruits\"],[\"Do Remember\",\"Turn Off Gas Valve\",\"Switch Off Lights/Gysure/Main Switch\",\"Close all water taps\",\"Make provision for watering the plants\",\"Make alternatives for Pet Care\",\"Inform Milk Man\",\"Inform News Paper Delivery boy\",\"Inform close relative about Holiday Location, Address & Contact Number\",\"Switch On the Safety Alarms\",\"Lock Cupboards\"]]";
        }
        JSONArray jSONArray = new JSONArray(b);
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            int n3;
            int n4;
            int n5;
            JSONArray jSONArray2;
            String string = jSONArray.getJSONArray(i2).getString(0);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i3 = 1; i3 < jSONArray.getJSONArray(i2).length(); ++i3) {
                if (i3 == n2) {
                    stringBuilder = new StringBuilder(jSONArray.getJSONArray(i2).getString(i3));
                    continue;
                }
                stringBuilder.append("#");
                stringBuilder.append(jSONArray.getJSONArray(i2).getString(i3));
            }
            a.put((Object)string.replace((CharSequence)" ", (CharSequence)"").toLowerCase(), (Object)stringBuilder.toString());
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)context).inflate(2131493015, (ViewGroup)this.d, false);
            TextView textView = (TextView)viewGroup.findViewById(2131296529);
            ImageView imageView = (ImageView)viewGroup.findViewById(2131296525);
            TextView textView2 = (TextView)viewGroup.findViewById(2131296526);
            ImageView imageView2 = (ImageView)viewGroup.findViewById(2131296524);
            int n6 = jSONArray.getJSONArray(i2).length() - n2;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("checklist_checked_");
            stringBuilder2.append(string.replace((CharSequence)" ", (CharSequence)"").toLowerCase());
            String string2 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("checklist_removed_");
            stringBuilder3.append(string.replace((CharSequence)" ", (CharSequence)"").toLowerCase());
            String string3 = stringBuilder3.toString();
            String string4 = c.a(string2, "#");
            String string5 = c.a(string3, "#");
            if (string4.length() != n2) {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("checked_items_list ");
                int n7 = string4.length();
                jSONArray2 = jSONArray;
                n5 = 1;
                stringBuilder4.append(string4.substring(n5, n7 - n5));
                Log.d((String)"jsokey", (String)stringBuilder4.toString());
                n4 = string4.substring(n5, string4.length() - n5).split("#").length;
            } else {
                jSONArray2 = jSONArray;
                n5 = 1;
                n4 = 0;
            }
            if (string5.length() != n5) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("removeed_items_list ");
                stringBuilder5.append(string5.substring(n5, string5.length() - n5));
                Log.d((String)"jsokey", (String)stringBuilder5.toString());
                n3 = string5.substring(n5, string5.length() - n5).split("#").length;
            } else {
                n3 = 0;
            }
            int n8 = n6 - n3;
            int n9 = n8 - n4;
            if (n9 == 0) {
                imageView2.setImageResource(2131230884);
            }
            Resources resources = context.getResources();
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append("checklist_");
            stringBuilder6.append(arrstring[i2].replace((CharSequence)" ", (CharSequence)"_").toLowerCase());
            int n10 = resources.getIdentifier(stringBuilder6.toString(), "drawable", context.getPackageName());
            textView.setText((CharSequence)string);
            imageView.setImageResource(n10);
            String string6 = this.getResources().getString(2131755096);
            Object[] arrobject = new Object[]{n9, n8};
            textView2.setText((CharSequence)String.format((String)string6, (Object[])arrobject));
            viewGroup.setOnClickListener(new View.OnClickListener(this, context, string){
                final /* synthetic */ Context a;
                final /* synthetic */ String b;
                final /* synthetic */ CheckLists c;
                {
                    this.c = checkLists;
                    this.a = context;
                    this.b = string;
                }

                public void onClick(View view) {
                    Intent intent = new Intent(this.a, com.mobond.mindicator.ui.indianrail.checklist.CheckListsDetails.class);
                    intent.putExtra("title", this.b);
                    this.c.startActivity(intent);
                }
            });
            this.d.addView((View)viewGroup);
            jSONArray = jSONArray2;
            n2 = 1;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493017);
        this.e = c.a((Activity)this, this.findViewById(2131296343), "ca-app-pub-5449278086868932/5724672771", "167101606757479_1239841612816801", "ca-app-pub-5449278086868932/5099597292", "167101606757479_1235753696558926", 3, null);
        Intent intent = this.getIntent();
        if (intent != null && intent.hasExtra("id")) {
            int n2 = intent.getIntExtra("id", -1);
            NotificationManager notificationManager = (NotificationManager)this.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(n2);
            }
        }
        c = a.b((Activity)this);
        this.d = (LinearLayout)this.findViewById(2131296528);
        TextView textView = (TextView)this.findViewById(2131296558);
        boolean bl = c.D();
        if (bl) {
            textView.setTextSize(16.0f);
        }
        ImageView imageView = (ImageView)this.findViewById(2131296397);
        try {
            this.a(this.getApplicationContext());
        }
        catch (JSONException jSONException) {
            this.a();
            jSONException.printStackTrace();
        }
        textView.setOnClickListener(new View.OnClickListener(this, bl){
            final /* synthetic */ boolean a;
            final /* synthetic */ CheckLists b;
            {
                this.b = checkLists;
                this.a = bl;
            }

            public void onClick(View view) {
                String string = this.b.getResources().getString(2131755150);
                String string2 = this.b.getResources().getString(2131755149);
                String string3 = this.b.getResources().getString(2131755468);
                if (this.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("<big>");
                    stringBuilder.append(string);
                    stringBuilder.append("</big>");
                    string = stringBuilder.toString();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("<big>");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("</big>");
                    string2 = stringBuilder2.toString();
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("<b>");
                    stringBuilder3.append(string3);
                    stringBuilder3.append("</b>");
                    string3 = stringBuilder3.toString();
                }
                androidx.appcompat.app.d$a a2 = new androidx.appcompat.app.d$a((Context)this.b);
                a2.a((CharSequence)android.text.Html.fromHtml((String)string3));
                a2.b((CharSequence)this.b.getResources().getString(2131755467)).a(false).a((CharSequence)android.text.Html.fromHtml((String)string), new android.content.DialogInterface$OnClickListener(this){
                    final /* synthetic */ 1 a;
                    {
                        this.a = var1_1;
                    }

                    public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                        this.a.b.a();
                    }
                }).b((CharSequence)android.text.Html.fromHtml((String)string2), new android.content.DialogInterface$OnClickListener(this){
                    final /* synthetic */ 1 a;
                    {
                        this.a = var1_1;
                    }

                    public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                        dialogInterface.cancel();
                    }
                });
                a2.b().show();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ CheckLists a;
            {
                this.a = checkLists;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    protected void onDestroy() {
        c.c(this.e);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        c.b(this.e);
    }

    public void onResume() {
        super.onResume();
        c.a(this.e);
        try {
            this.d.removeAllViews();
            this.a(this.getApplicationContext());
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }
}

