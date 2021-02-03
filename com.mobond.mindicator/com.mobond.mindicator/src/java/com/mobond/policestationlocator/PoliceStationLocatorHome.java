/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.location.Location
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 *  android.text.Html
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.view.animation.ScaleAnimation
 *  android.view.animation.TranslateAnimation
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.appcompat.app.e
 *  androidx.fragment.app.d
 *  androidx.fragment.app.j
 *  com.google.android.gms.common.GooglePlayServicesUtil
 *  com.google.android.gms.maps.a
 *  com.google.android.gms.maps.b
 *  com.google.android.gms.maps.c
 *  com.google.android.gms.maps.c$a
 *  com.google.android.gms.maps.c$b
 *  com.google.android.gms.maps.e
 *  com.google.android.gms.maps.g
 *  com.google.android.gms.maps.model.CameraPosition
 *  com.google.android.gms.maps.model.LatLng
 *  com.google.android.gms.maps.model.LatLngBounds
 *  com.google.android.gms.maps.model.a
 *  com.google.android.gms.maps.model.b
 *  com.google.android.gms.maps.model.e
 *  com.google.android.gms.maps.model.f
 *  com.google.android.gms.maps.model.h
 *  com.google.android.libraries.places.api.Places
 *  com.google.android.libraries.places.api.model.Place
 *  com.google.android.libraries.places.api.model.Place$Field
 *  com.google.android.libraries.places.widget.Autocomplete
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.zip.GZIPInputStream
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.policestationlocator;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.d;
import androidx.fragment.app.j;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.h;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.util.OnlineDbUpdateService;
import com.mobond.policestationlocator.FetchAddressIntentService;
import com.mobond.policestationlocator.PoliceStationLocatorHome;
import com.mobond.policestationlocator.PoliceStationsList;
import com.mobond.policestationlocator.b.c;
import com.mobond.policestationlocator.util.CustomMapFragment;
import com.mobond.policestationlocator.util.a;
import com.mulo.util.b;
import com.mulo.util.e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PoliceStationLocatorHome
extends androidx.appcompat.app.e
implements com.google.android.gms.maps.e {
    private TranslateAnimation A;
    private int B = 0;
    private a C;
    private boolean D = false;
    private LatLngBounds E = new LatLngBounds(new LatLng(18.8886596, 72.7801523), new LatLng(19.3405388, 73.1076822));
    private ViewGroup F;
    private boolean G = false;
    private String H = "<b>This area is not supported for locating police s</b><br><br>Supported Areas are:<br><br>1) Churchgate to Dahisar<br>2) C.S.T to Mankhurd & Mulund.";
    private Activity I;
    int a = 1;
    List<Place.Field> b;
    boolean c;
    private final String d = "This Area is Not Supported";
    private final String e = "TERMS";
    private final String f = "PoliceStationLocator";
    private final String g = "isTermsAccepted";
    private ArrayList<JSONArray> h = null;
    private com.google.android.gms.maps.c i;
    private LatLng j;
    private ArrayList<c> k = null;
    private CustomMapFragment l;
    private String m = "";
    private int n = -2;
    private com.google.android.gms.maps.model.e o = null;
    private TextView p;
    private int q = -1;
    private ImageView r;
    private ImageView s;
    private com.mobond.mindicator.a.a t;
    private TextView u;
    private ViewGroup v;
    private ViewGroup w;
    private ViewGroup x;
    private ScrollView y;
    private TranslateAnimation z;

    public PoliceStationLocatorHome() {
        Object[] arrobject = new Place.Field[]{Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG};
        this.b = Arrays.asList((Object[])arrobject);
        this.c = true;
    }

    static /* synthetic */ int a(PoliceStationLocatorHome policeStationLocatorHome, int n2) {
        policeStationLocatorHome.B = n2;
        return n2;
    }

    static /* synthetic */ LatLng a(PoliceStationLocatorHome policeStationLocatorHome, LatLng latLng) {
        policeStationLocatorHome.j = latLng;
        return latLng;
    }

    private void a() {
        this.translateDownUp((View)this.w);
    }

    private void a(double d2, double d3) {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(d2, d3), 13.0f, this.i.a().c, this.i.a().d);
        this.i.a(com.google.android.gms.maps.b.a((CameraPosition)cameraPosition), 1000, null);
        this.c = false;
    }

    static /* synthetic */ void a(PoliceStationLocatorHome policeStationLocatorHome, String string, String string2, String string3, String string4) {
        policeStationLocatorHome.b(string, string2, string3, string4);
    }

    private void a(String string) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (this.h == null) {
            this.h = new ArrayList();
        }
        new Handler().post(new Runnable(this, string){
            final /* synthetic */ String a;
            final /* synthetic */ PoliceStationLocatorHome b;
            {
                this.b = policeStationLocatorHome;
                this.a = string;
            }

            public void run() {
                int n2;
                JSONArray jSONArray;
                try {
                    jSONArray = new JSONArray(this.a);
                    n2 = 0;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                do {
                    if (n2 >= jSONArray.length()) break;
                    JSONArray jSONArray2 = jSONArray.getJSONObject(n2).getJSONArray("l");
                    PoliceStationLocatorHome.n(this.b).add((Object)jSONArray.getJSONObject(n2).getJSONArray("i"));
                    int n3 = 0;
                    do {
                        block11 : {
                            if (n3 >= jSONArray2.length()) break;
                            if (jSONArray2.getJSONObject(n3).getString("pts").equalsIgnoreCase("")) break block11;
                            String[] arrstring = jSONArray2.getJSONObject(n3).getString("pts").split(",");
                            ArrayList arrayList = new ArrayList();
                            int n4 = 0;
                            do {
                                if (n4 >= arrstring.length) break;
                                arrayList.add((Object)new LatLng(Double.parseDouble((String)arrstring[n4]), Double.parseDouble((String)arrstring[n4 + 1])));
                                n4 += 2;
                            } while (true);
                            com.google.android.gms.maps.model.i i2 = new com.google.android.gms.maps.model.i();
                            java.util.Iterator iterator = arrayList.iterator();
                            while (iterator.hasNext()) {
                                i2.a((LatLng)iterator.next());
                            }
                            i2.a(-15717757);
                            i2.a(3.0f);
                            i2.b(1343236739);
                            c c2 = new c();
                            c2.b = jSONArray2.getJSONObject(n3).getString("n");
                            c2.c = jSONArray2.getJSONObject(n3).getString("p");
                            c2.d = jSONArray2.getJSONObject(n3).getString("d");
                            c2.e = jSONArray2.getJSONObject(n3).getString("c");
                            c2.a = PoliceStationLocatorHome.i(this.b).a(i2);
                            c2.f = n2;
                            PoliceStationLocatorHome.h(this.b).add((Object)c2);
                        }
                        ++n3;
                    } while (true);
                    ++n2;
                } while (true);
            }
        });
    }

    private void a(String string, String string2, String string3, String string4) {
        Dialog dialog = new Dialog((Context)this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131493157);
        dialog.findViewById(2131297057).setOnClickListener(new View.OnClickListener(this, string3, dialog){
            final /* synthetic */ String a;
            final /* synthetic */ Dialog b;
            final /* synthetic */ PoliceStationLocatorHome c;
            {
                this.c = policeStationLocatorHome;
                this.a = string;
                this.b = dialog;
            }

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setType("text/plain");
                intent.setData(Uri.parse((String)this.a));
                String[] arrstring = new String[]{this.a};
                intent.putExtra("android.intent.extra.EMAIL", arrstring);
                try {
                    intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
                    this.c.startActivity(intent);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("text/plain");
                    intent2.putExtra("android.intent.extra.TITLE", "Choose Email Client");
                    String[] arrstring2 = new String[]{this.a};
                    intent2.putExtra("android.intent.extra.EMAIL", arrstring2);
                    this.c.startActivity(intent2);
                }
                this.b.dismiss();
            }
        });
        ((TextView)dialog.findViewById(2131297683)).setText((CharSequence)Html.fromHtml((String)string2));
        ((TextView)dialog.findViewById(2131297517)).setText((CharSequence)string);
        ((Button)dialog.findViewById(2131297057)).setText((CharSequence)string4);
        if (string.equals((Object)"TERMS") && !this.getSharedPreferences("PoliceStationLocator", 0).getBoolean("isTermsAccepted", false)) {
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener(this, dialog){
                final /* synthetic */ Dialog a;
                final /* synthetic */ PoliceStationLocatorHome b;
                {
                    this.b = policeStationLocatorHome;
                    this.a = dialog;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.a.cancel();
                    this.b.finish();
                }
            });
        }
        dialog.setTitle(null);
        dialog.show();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(JSONArray jSONArray, int n2, String string, String string2, double d2, double d3) {
        this.v.removeAllViews();
        for (int i2 = 0; i2 <= jSONArray.length(); ++i2) {
            void var33_9;
            block19 : {
                TextView textView;
                ViewGroup viewGroup;
                block18 : {
                    viewGroup = (ViewGroup)LayoutInflater.from((Context)this.I).inflate(2131493084, null);
                    textView = (TextView)viewGroup.findViewById(2131297083);
                    if (i2 != 0) break block18;
                    textView.setText((CharSequence)Html.fromHtml((String)string));
                    ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from((Context)this.I).inflate(2131493084, null);
                    ((TextView)viewGroup2.findViewById(2131297083)).setText((CharSequence)"Navigate to Police Station");
                    ((ImageView)viewGroup2.findViewById(2131297082)).setImageResource(2131230956);
                    try {
                        viewGroup2.setOnClickListener(this.c(d2, d3));
                        this.v.addView((View)viewGroup);
                        this.v.addView((View)viewGroup2);
                        continue;
                    }
                    catch (JSONException jSONException) {
                        break block19;
                    }
                }
                int n3 = i2 - 1;
                String string3 = jSONArray.getJSONObject(n3).getString("t");
                String string4 = jSONArray.getJSONObject(n3).getString("n");
                textView.setText((CharSequence)string4);
                if (!string3.equalsIgnoreCase("mob") && !string3.equalsIgnoreCase("tel")) {
                    if (string3.equalsIgnoreCase("url")) {
                        ((ImageView)viewGroup.findViewById(2131297082)).setImageResource(2131231200);
                        viewGroup.setOnClickListener(new View.OnClickListener(this, jSONArray.getJSONObject(n3).getString("l")){
                            final /* synthetic */ String a;
                            final /* synthetic */ PoliceStationLocatorHome b;
                            {
                                this.b = policeStationLocatorHome;
                                this.a = string;
                            }

                            public void onClick(View view) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse((String)this.a));
                                this.b.startActivity(intent);
                            }
                        });
                    }
                } else {
                    ((ImageView)viewGroup.findViewById(2131297082)).setImageResource(2131231198);
                    viewGroup.setOnClickListener(new View.OnClickListener(this, string4){
                        final /* synthetic */ String a;
                        final /* synthetic */ PoliceStationLocatorHome b;
                        {
                            this.b = policeStationLocatorHome;
                            this.a = string;
                        }

                        public void onClick(View view) {
                            n.b(PoliceStationLocatorHome.c(this.b), this.a);
                        }
                    });
                }
                this.v.addView((View)viewGroup);
                continue;
                catch (JSONException jSONException) {
                    // empty catch block
                }
            }
            var33_9.printStackTrace();
        }
        int i3 = 0;
        do {
            block20 : {
                void var12_18;
                block21 : {
                    if (i3 >= ((JSONArray)this.h.get(n2)).length()) {
                        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.I).inflate(2131493084, null);
                        ((TextView)viewGroup.findViewById(2131297083)).setText((CharSequence)"Submit Information Error");
                        ((ImageView)viewGroup.findViewById(2131297082)).setImageResource(2131230979);
                        viewGroup.setOnClickListener(new View.OnClickListener(this, string2){
                            final /* synthetic */ String a;
                            final /* synthetic */ PoliceStationLocatorHome b;
                            {
                                this.b = policeStationLocatorHome;
                                this.a = string;
                            }

                            public void onClick(View view) {
                                Intent intent = new Intent(this.b.getApplicationContext(), com.mobond.mindicator.ui.FeedbackUI.class);
                                intent.putExtra("feedbacktype", com.mobond.mindicator.ui.FeedbackUI.g);
                                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                                stringBuilder.append("App Version: v17.0.186 Eagle\nApp Build: A:T:20210102\nPhone Model: ");
                                stringBuilder.append(android.os.Build.MODEL);
                                stringBuilder.append("\nSDK: ");
                                stringBuilder.append(android.os.Build$VERSION.SDK_INT);
                                stringBuilder.append("\nManufacturer: ");
                                stringBuilder.append(android.os.Build.MANUFACTURER);
                                stringBuilder.append("\nCity: ");
                                stringBuilder.append(com.mobond.mindicator.ConfigurationManager.b(this.b.getApplicationContext()));
                                stringBuilder.append("\n\n\n");
                                stringBuilder.append(this.a);
                                intent.putExtra("info", stringBuilder.toString());
                                this.b.startActivityForResult(intent, 0);
                            }
                        });
                        this.v.addView((View)viewGroup);
                        this.q = n2;
                        return;
                    }
                    String string5 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("type");
                    String string6 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("url");
                    if (string5.equalsIgnoreCase("d_url")) {
                        String string7 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("title");
                        String string8 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("message");
                        String string9 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("positive_button_text");
                        String string10 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("alert_title");
                        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.I).inflate(2131493084, null);
                        ((ImageView)viewGroup.findViewById(2131297082)).setImageResource(2131231200);
                        ((TextView)viewGroup.findViewById(2131297083)).setText((CharSequence)string7);
                        View.OnClickListener onClickListener = new View.OnClickListener(this, string10, string8, string6, string9){
                            final /* synthetic */ String a;
                            final /* synthetic */ String b;
                            final /* synthetic */ String c;
                            final /* synthetic */ String d;
                            final /* synthetic */ PoliceStationLocatorHome e;
                            {
                                this.e = policeStationLocatorHome;
                                this.a = string;
                                this.b = string2;
                                this.c = string3;
                                this.d = string4;
                            }

                            public void onClick(View view) {
                                PoliceStationLocatorHome.a(this.e, this.a, this.b, this.c, this.d);
                            }
                        };
                        viewGroup.setOnClickListener(onClickListener);
                        this.v.addView((View)viewGroup);
                        break block20;
                    }
                    if (string5.equalsIgnoreCase("url")) {
                        String string11 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("title");
                        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.I).inflate(2131493084, null);
                        ((ImageView)viewGroup.findViewById(2131297082)).setImageResource(2131231200);
                        ((TextView)viewGroup.findViewById(2131297083)).setText((CharSequence)string11);
                        viewGroup.setOnClickListener(new View.OnClickListener(this, string6){
                            final /* synthetic */ String a;
                            final /* synthetic */ PoliceStationLocatorHome b;
                            {
                                this.b = policeStationLocatorHome;
                                this.a = string;
                            }

                            public void onClick(View view) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse((String)this.a));
                                this.b.startActivity(intent);
                            }
                        });
                        this.v.addView((View)viewGroup);
                        break block20;
                    }
                    if (string5.equalsIgnoreCase("email")) {
                        String string12 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("title");
                        String string13 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("message");
                        String string14 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("positive_button_text");
                        String string15 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("alert_title");
                        ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.I).inflate(2131493084, null);
                        ((ImageView)viewGroup.findViewById(2131297082)).setImageResource(2131231034);
                        ((TextView)viewGroup.findViewById(2131297083)).setText((CharSequence)string12);
                        View.OnClickListener onClickListener = new View.OnClickListener(this, string15, string13, string6, string14){
                            final /* synthetic */ String a;
                            final /* synthetic */ String b;
                            final /* synthetic */ String c;
                            final /* synthetic */ String d;
                            final /* synthetic */ PoliceStationLocatorHome e;
                            {
                                this.e = policeStationLocatorHome;
                                this.a = string;
                                this.b = string2;
                                this.c = string3;
                                this.d = string4;
                            }

                            public void onClick(View view) {
                                PoliceStationLocatorHome.b(this.e, this.a, this.b, this.c, this.d);
                            }
                        };
                        viewGroup.setOnClickListener(onClickListener);
                        this.v.addView((View)viewGroup);
                        break block20;
                    }
                    if (!string5.equalsIgnoreCase("tel")) break block20;
                    String string16 = ((JSONArray)this.h.get(n2)).getJSONObject(i3).getString("title");
                    ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.I).inflate(2131493084, null);
                    ImageView imageView = (ImageView)viewGroup.findViewById(2131297082);
                    try {
                        imageView.setImageResource(2131231198);
                        ((TextView)viewGroup.findViewById(2131297083)).setText((CharSequence)string16);
                        viewGroup.setOnClickListener(new View.OnClickListener(this, string16){
                            final /* synthetic */ String a;
                            final /* synthetic */ PoliceStationLocatorHome b;
                            {
                                this.b = policeStationLocatorHome;
                                this.a = string;
                            }

                            public void onClick(View view) {
                                n.b(PoliceStationLocatorHome.c(this.b), this.a);
                            }
                        });
                        this.v.addView((View)viewGroup);
                        break block20;
                    }
                    catch (JSONException jSONException) {
                        break block21;
                    }
                    catch (JSONException jSONException) {
                        // empty catch block
                    }
                }
                var12_18.printStackTrace();
            }
            ++i3;
        } while (true);
    }

    static /* synthetic */ boolean a(PoliceStationLocatorHome policeStationLocatorHome, boolean bl) {
        policeStationLocatorHome.D = bl;
        return bl;
    }

    private void b() {
        this.translateUpDown((View)this.w);
    }

    private void b(double d2, double d3) {
        if ((float)this.y.getMeasuredHeight() > 60.0f * this.getResources().getDisplayMetrics().density) {
            this.collapse((View)this.y);
        }
        com.google.android.gms.maps.a a2 = com.google.android.gms.maps.b.a((LatLng)new LatLng(d2, d3));
        com.google.android.gms.maps.a a3 = com.google.android.gms.maps.b.a((float)13.0f);
        this.i.a(a2);
        this.i.b(a3);
    }

    private void b(int n2) {
        if (n2 != this.q) {
            this.r.setVisibility(8);
            this.s.setVisibility(8);
        }
        for (int i2 = 0; i2 < ((JSONArray)this.h.get(n2)).length(); ++i2) {
            try {
                String string = ((JSONArray)this.h.get(n2)).getJSONObject(i2).getString("type");
                String string2 = ((JSONArray)this.h.get(n2)).getJSONObject(i2).getString("url");
                if (n2 == this.q) continue;
                if (string.equalsIgnoreCase("fb")) {
                    this.r.setVisibility(0);
                    this.r.setOnClickListener(new View.OnClickListener(this, string2){
                        final /* synthetic */ String a;
                        final /* synthetic */ PoliceStationLocatorHome b;
                        {
                            this.b = policeStationLocatorHome;
                            this.a = string;
                        }

                        public void onClick(View view) {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse((String)this.a));
                            this.b.startActivity(intent);
                        }
                    });
                    continue;
                }
                if (!string.equalsIgnoreCase("tw")) continue;
                this.s.setVisibility(0);
                this.s.setOnClickListener(new View.OnClickListener(this, string2){
                    final /* synthetic */ String a;
                    final /* synthetic */ PoliceStationLocatorHome b;
                    {
                        this.b = policeStationLocatorHome;
                        this.a = string;
                    }

                    public void onClick(View view) {
                        try {
                            String string = this.a.replace((CharSequence)"https://twitter.com/", (CharSequence)"").replace((CharSequence)"?lang=en", (CharSequence)"");
                            PoliceStationLocatorHome policeStationLocatorHome = this.b;
                            java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                            stringBuilder.append("twitter://user?screen_name=");
                            stringBuilder.append(string);
                            policeStationLocatorHome.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString())));
                            return;
                        }
                        catch (Exception exception) {
                            this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)this.a)));
                            return;
                        }
                    }
                });
                continue;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        this.q = n2;
    }

    static /* synthetic */ void b(PoliceStationLocatorHome policeStationLocatorHome, String string, String string2, String string3, String string4) {
        policeStationLocatorHome.a(string, string2, string3, string4);
    }

    private void b(String string) {
        this.u.setText((CharSequence)Html.fromHtml((String)string));
    }

    private void b(String string, String string2, String string3, String string4) {
        Dialog dialog = new Dialog((Context)this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131493157);
        dialog.findViewById(2131297057).setOnClickListener(new View.OnClickListener(this, string3, string, dialog){
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ Dialog c;
            final /* synthetic */ PoliceStationLocatorHome d;
            {
                this.d = policeStationLocatorHome;
                this.a = string;
                this.b = string2;
                this.c = dialog;
            }

            public void onClick(View view) {
                if (this.a != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse((String)this.a));
                    this.d.startActivity(intent);
                }
                if (this.b.equals((Object)"TERMS")) {
                    android.content.SharedPreferences$Editor editor = this.d.getSharedPreferences("PoliceStationLocator", 0).edit();
                    editor.putBoolean("isTermsAccepted", true);
                    editor.apply();
                }
                this.c.dismiss();
            }
        });
        ((TextView)dialog.findViewById(2131297683)).setText((CharSequence)Html.fromHtml((String)string2));
        ((TextView)dialog.findViewById(2131297517)).setText((CharSequence)string);
        ((Button)dialog.findViewById(2131297057)).setText((CharSequence)string4);
        if (string.equals((Object)"TERMS") && !this.getSharedPreferences("PoliceStationLocator", 0).getBoolean("isTermsAccepted", false)) {
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener(this, dialog){
                final /* synthetic */ Dialog a;
                final /* synthetic */ PoliceStationLocatorHome b;
                {
                    this.b = policeStationLocatorHome;
                    this.a = dialog;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.a.cancel();
                    this.b.finish();
                }
            });
        }
        dialog.setTitle(null);
        dialog.show();
    }

    static /* synthetic */ Activity c(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.I;
    }

    private View.OnClickListener c(double d2, double d3) {
        View.OnClickListener onClickListener = new View.OnClickListener(this, d2, d3){
            final /* synthetic */ double a;
            final /* synthetic */ double b;
            final /* synthetic */ PoliceStationLocatorHome c;
            {
                this.c = policeStationLocatorHome;
                this.a = d2;
                this.b = d3;
            }

            public void onClick(View view) {
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append("https://maps.googleapis.com/maps/api/directions/json?origin=");
                stringBuilder.append(PoliceStationLocatorHome.m((PoliceStationLocatorHome)this.c).a);
                stringBuilder.append(",");
                stringBuilder.append(PoliceStationLocatorHome.m((PoliceStationLocatorHome)this.c).b);
                stringBuilder.append("&destination=");
                stringBuilder.append(this.a);
                stringBuilder.append(",");
                stringBuilder.append(this.b);
                stringBuilder.append("&key=");
                stringBuilder.append("AIzaSyCz6QgtQ7mSG9NtfjOTyfrTY8pM9lSfTZA");
                String string = stringBuilder.toString();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                try {
                    this.c.startActivity(intent);
                    return;
                }
                catch (android.content.ActivityNotFoundException activityNotFoundException) {
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                        this.c.startActivity(intent2);
                        return;
                    }
                    catch (android.content.ActivityNotFoundException activityNotFoundException2) {
                        Toast.makeText((Context)this.c.getApplicationContext(), (CharSequence)"Please install a maps application", (int)1).show();
                        return;
                    }
                }
            }
        };
        return onClickListener;
    }

    private void c() {
        this.G = true;
        this.collapseInfoBox((View)this.F);
        CameraPosition cameraPosition = new CameraPosition(new LatLng(this.t.f, this.t.g), 13.0f, this.i.a().c, this.i.a().d);
        this.i.a(com.google.android.gms.maps.b.a((CameraPosition)cameraPosition), 1000, null);
        this.findViewById(2131296863).startAnimation(AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771982));
        new Handler().postDelayed(new Runnable(this){
            final /* synthetic */ PoliceStationLocatorHome a;
            {
                this.a = policeStationLocatorHome;
            }

            public void run() {
                try {
                    GradientDrawable gradientDrawable = (GradientDrawable)PoliceStationLocatorHome.g(this.a).getBackground();
                    gradientDrawable.setColor(this.a.getResources().getColor(2131099751));
                    PoliceStationLocatorHome.g(this.a).setBackgroundDrawable((Drawable)gradientDrawable);
                    ((TextView)PoliceStationLocatorHome.g(this.a).findViewById(2131296887)).setText((CharSequence)"This Area is Not Supported");
                    ((ImageView)PoliceStationLocatorHome.g(this.a).findViewById(2131296885)).setImageResource(2131231212);
                    return;
                }
                catch (Exception exception) {
                    n.c(this.a.getApplicationContext(), exception.toString());
                    return;
                }
            }
        }, 400L);
    }

    private void d() {
        this.m = "";
        try {
            this.m = new String(new b(e.a((InputStream)new GZIPInputStream(new OnlineDbUpdateService().a((Context)this.I, "policedb", "policedb")))).a());
            return;
        }
        catch (Exception exception) {
            this.m = "";
            exception.printStackTrace();
            return;
        }
    }

    static /* synthetic */ void d(PoliceStationLocatorHome policeStationLocatorHome) {
        policeStationLocatorHome.a();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void e() {
        boolean bl;
        int n2;
        block16 : {
            int n3;
            block15 : {
                boolean bl2 = false;
                for (int i2 = 0; i2 < this.k.size(); ++i2) {
                    LatLng latLng = this.j;
                    if (latLng == null) continue;
                    if (this.a(new LatLng(latLng.a, this.j.b), (List<LatLng>)((c)this.k.get((int)i2)).a.a())) {
                        int n4 = this.n;
                        if (i2 == n4) {
                            return;
                        }
                        if (n4 >= 0) {
                            ((c)this.k.get((int)n4)).a.a(3.0f);
                            ((c)this.k.get((int)this.n)).a.a(1343236739);
                        }
                        ((c)this.k.get((int)i2)).a.a(10.0f);
                        ((c)this.k.get((int)i2)).a.a(16777471);
                        n3 = i2;
                        bl = false;
                        break block15;
                    }
                    bl2 = true;
                }
                bl = bl2;
                n3 = -99;
            }
            int n5 = this.n;
            if (n5 == n3) return;
            if (n5 == -1 && bl) {
                return;
            }
            if (!bl) {
                void var8_18;
                block17 : {
                    String string = ((c)this.k.get((int)n3)).c;
                    double d2 = Double.parseDouble((String)string.substring(0, string.indexOf(",")));
                    double d3 = Double.parseDouble((String)string.substring(1 + string.indexOf(",")));
                    if (this.o != null) {
                        this.o.a();
                    }
                    this.o = this.i.a(new f().a(new LatLng(d2, d3)).a(((c)this.k.get((int)n3)).b).a(com.google.android.gms.maps.model.b.a((int)2131231243)));
                    this.o.b();
                    this.b(((c)this.k.get((int)n3)).f);
                    JSONArray jSONArray = new JSONArray(((c)this.k.get((int)n3)).e);
                    int n6 = ((c)this.k.get((int)n3)).f;
                    String string2 = ((c)this.k.get((int)n3)).d;
                    String string3 = ((c)this.k.get((int)n3)).b;
                    n2 = -1;
                    try {
                        this.a(jSONArray, n6, string2, string3, d2, d3);
                        if (this.n > n2 && !bl) {
                            this.p.setText((CharSequence)((c)this.k.get((int)n3)).b);
                            this.bounce((View)this.y);
                        }
                        if (this.n < 0 && !bl) {
                            this.p.setText((CharSequence)((c)this.k.get((int)n3)).b);
                            this.a((View)this.x, true);
                            if (this.G) {
                                this.collapseInfoBox((View)this.F);
                            }
                        }
                        this.findViewById(2131297122).setOnClickListener(new View.OnClickListener(this){
                            final /* synthetic */ PoliceStationLocatorHome a;
                            {
                                this.a = policeStationLocatorHome;
                            }

                            public void onClick(View view) {
                                if ((float)PoliceStationLocatorHome.o(this.a).getMeasuredHeight() < 60.0f * this.a.getResources().getDisplayMetrics().density) {
                                    PoliceStationLocatorHome policeStationLocatorHome = this.a;
                                    policeStationLocatorHome.a((View)PoliceStationLocatorHome.o(policeStationLocatorHome), false);
                                    return;
                                }
                                PoliceStationLocatorHome policeStationLocatorHome = this.a;
                                policeStationLocatorHome.collapse((View)PoliceStationLocatorHome.o(policeStationLocatorHome));
                            }
                        });
                        this.collapse((View)this.v);
                        this.n = n3;
                        break block16;
                    }
                    catch (Exception exception) {
                        break block17;
                    }
                    catch (Exception exception) {
                        n2 = -1;
                    }
                }
                var8_18.printStackTrace();
            } else {
                n2 = -1;
            }
        }
        int n7 = this.n;
        if (n7 <= n2) return;
        if (!bl) return;
        ((c)this.k.get((int)n7)).a.a(3.0f);
        ((c)this.k.get((int)this.n)).a.a(1343236739);
        this.o.a();
        this.o = null;
        this.n = n2;
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        this.q = n2;
        this.collapse((View)this.x);
        this.collapse((View)this.y);
        if (!this.G) return;
        this.expandInfoBox((View)this.F);
    }

    static /* synthetic */ void e(PoliceStationLocatorHome policeStationLocatorHome) {
        policeStationLocatorHome.b();
    }

    static /* synthetic */ LatLngBounds f(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.E;
    }

    private boolean f() {
        int n2 = GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)this);
        if (n2 != 0) {
            if (GooglePlayServicesUtil.isUserRecoverableError((int)n2)) {
                this.a(n2);
            } else {
                Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"This device doesn't support Play services, App will not work normally", (int)1).show();
                this.finish();
            }
            return false;
        }
        return true;
    }

    static /* synthetic */ ViewGroup g(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.F;
    }

    static /* synthetic */ ArrayList h(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.k;
    }

    static /* synthetic */ com.google.android.gms.maps.c i(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.i;
    }

    static /* synthetic */ void j(PoliceStationLocatorHome policeStationLocatorHome) {
        policeStationLocatorHome.e();
    }

    static /* synthetic */ boolean k(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.D;
    }

    static /* synthetic */ TextView l(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.u;
    }

    static /* synthetic */ LatLng m(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.j;
    }

    static /* synthetic */ ArrayList n(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.h;
    }

    static /* synthetic */ ScrollView o(PoliceStationLocatorHome policeStationLocatorHome) {
        return policeStationLocatorHome.y;
    }

    void a(int n2) {
        GooglePlayServicesUtil.getErrorDialog((int)n2, (Activity)this, (int)1001).show();
    }

    public void a(View view, boolean bl) {
        int n2;
        if (bl) {
            n2 = (int)(60.0f * this.getResources().getDisplayMetrics().density);
        } else {
            this.v.measure(-1, -2);
            n2 = this.v.getMeasuredHeight() + (int)(16.0f * this.getResources().getDisplayMetrics().density) > this.getResources().getDisplayMetrics().heightPixels / 2 ? this.getResources().getDisplayMetrics().heightPixels / 2 : this.v.getMeasuredHeight() + (int)(16.0f * this.getResources().getDisplayMetrics().density);
        }
        Animation animation = new Animation(this, bl, view, n2){
            final /* synthetic */ boolean a;
            final /* synthetic */ View b;
            final /* synthetic */ int c;
            final /* synthetic */ PoliceStationLocatorHome d;
            {
                this.d = policeStationLocatorHome;
                this.a = bl;
                this.b = view;
                this.c = n2;
            }

            protected void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                if (this.a) {
                    this.b.getLayoutParams().height = f2 == 1.0f ? -2 : (int)(f2 * (float)this.c);
                    this.b.requestLayout();
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
                int n2 = f2 == 1.0f ? this.c : (int)(f2 * (float)this.c);
                layoutParams.height = n2;
                this.b.requestLayout();
            }

            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(300L);
        view.startAnimation(animation);
    }

    public void a(com.google.android.gms.maps.c c2) {
        this.i = c2;
        this.i.a(true);
        this.i.c().d(false);
        this.i.c().a(true);
        this.i.c().c(false);
        this.i.c().b(false);
        this.i.a(new c.b(this){
            final /* synthetic */ PoliceStationLocatorHome a;
            {
                this.a = policeStationLocatorHome;
            }

            public void a() {
                if (PoliceStationLocatorHome.h(this.a) != null) {
                    PoliceStationLocatorHome policeStationLocatorHome = this.a;
                    PoliceStationLocatorHome.a(policeStationLocatorHome, PoliceStationLocatorHome.i((PoliceStationLocatorHome)policeStationLocatorHome).a().a);
                    PoliceStationLocatorHome.j(this.a);
                    if (!PoliceStationLocatorHome.k(this.a)) {
                        if (this.a.c) {
                            PoliceStationLocatorHome.l(this.a).setText((CharSequence)"");
                            return;
                        }
                        PoliceStationLocatorHome policeStationLocatorHome2 = this.a;
                        policeStationLocatorHome2.c = true;
                        policeStationLocatorHome2.a(PoliceStationLocatorHome.m(policeStationLocatorHome2));
                    }
                }
            }
        });
        if (!this.m.equalsIgnoreCase("")) {
            this.a(this.m);
            this.b(19.0243199, 72.8345704);
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)((View)this.l.getView().findViewById(Integer.parseInt((String)"1")).getParent()).findViewById(Integer.parseInt((String)"2")).getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(12, -1);
                float f2 = this.getResources().getDisplayMetrics().density;
                layoutParams.setMargins(0, 0, (int)(16.0f * f2), (int)(f2 * 100.0f));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.C = new ResultReceiver(new Handler()){

                protected void onReceiveResult(int n2, Bundle bundle) {
                    PoliceStationLocatorHome.this.b(bundle.getString("com.mobond.mindicator.RESULT_DATA_KEY"));
                }
            };
            return;
        }
        n.d((Context)this, "Error reading data");
        this.finish();
    }

    protected void a(LatLng latLng) {
        Intent intent = new Intent((Context)this, FetchAddressIntentService.class);
        intent.putExtra("com.mobond.mindicator.RECEIVER", (Parcelable)this.C);
        intent.putExtra("com.mobond.mindicator.LOCATION_DATA_EXTRA", (Parcelable)latLng);
        this.startService(intent);
    }

    public boolean a(LatLng latLng, List<LatLng> list) {
        int n2 = list.size() - 1;
        int n3 = 0;
        boolean bl = false;
        while (n3 < list.size()) {
            boolean bl2;
            boolean bl3 = ((LatLng)list.get((int)n3)).b > latLng.b;
            if (bl3 != (bl2 = ((LatLng)list.get((int)n2)).b > latLng.b) && latLng.a < (((LatLng)list.get((int)n2)).a - ((LatLng)list.get((int)n3)).a) * (latLng.b - ((LatLng)list.get((int)n3)).b) / (((LatLng)list.get((int)n2)).b - ((LatLng)list.get((int)n3)).b) + ((LatLng)list.get((int)n3)).a) {
                bl ^= true;
            }
            int n4 = n3 + 1;
            n2 = n3;
            n3 = n4;
        }
        return bl;
    }

    public void bounce(View view) {
        if ((float)view.getMeasuredHeight() > 60.0f * this.getResources().getDisplayMetrics().density) {
            this.collapse(view);
            return;
        }
        Animation animation = new Animation(this, view, (int)(48.0f * this.getResources().getDisplayMetrics().density)){
            final /* synthetic */ View a;
            final /* synthetic */ int b;
            final /* synthetic */ PoliceStationLocatorHome c;
            {
                this.c = policeStationLocatorHome;
                this.a = view;
                this.b = n2;
            }

            protected void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                if (f2 <= 0.5f) {
                    this.a.getLayoutParams().height = (int)(f2 * (float)this.b);
                }
                if (f2 > 0.5f && f2 <= 1.0f) {
                    ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                    int n2 = this.b;
                    layoutParams.height = n2 - (int)(f2 * (float)n2);
                }
                this.a.requestLayout();
            }

            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(300L);
        view.startAnimation(animation);
    }

    public void collapse(View view) {
        Animation animation = new Animation(this, view, view.getMeasuredHeight()){
            final /* synthetic */ View a;
            final /* synthetic */ int b;
            final /* synthetic */ PoliceStationLocatorHome c;
            {
                this.c = policeStationLocatorHome;
                this.a = view;
                this.b = n2;
            }

            protected void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                int n2 = this.b;
                layoutParams.height = n2 - (int)(f2 * (float)n2);
                this.a.requestLayout();
            }

            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(300L);
        view.startAnimation(animation);
    }

    public void collapseInfoBox(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener(this, view){
            final /* synthetic */ View a;
            final /* synthetic */ PoliceStationLocatorHome b;
            {
                this.b = policeStationLocatorHome;
                this.a = view;
            }

            public void onAnimationEnd(Animation animation) {
                this.a.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation((Animation)scaleAnimation);
    }

    public void expandInfoBox(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener(this, view){
            final /* synthetic */ View a;
            final /* synthetic */ PoliceStationLocatorHome b;
            {
                this.b = policeStationLocatorHome;
                this.a = view;
            }

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                this.a.setVisibility(0);
            }
        });
        view.startAnimation((Animation)scaleAnimation);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n2 == 199) {
            switch (n3) {
                default: {
                    return;
                }
                case 0: {
                    n.d((Context)this, this.getString(2131755213));
                    this.finish();
                    return;
                }
                case -1: 
            }
            this.t.b(this.getApplicationContext());
            return;
        }
        if (n2 == this.a) {
            if (n3 == -1) {
                Place place = Autocomplete.getPlaceFromIntent((Intent)intent);
                place.getName();
                String[] arrstring = String.valueOf((Object)place.getLatLng()).replace((CharSequence)"lat/lng: (", (CharSequence)"").replace((CharSequence)")", (CharSequence)"").split(",");
                String string = arrstring[0];
                String string2 = arrstring[1];
                this.a(Double.parseDouble((String)string), Double.parseDouble((String)string2));
                return;
            }
            if (n3 == 2) {
                Autocomplete.getStatusFromIntent((Intent)intent);
                return;
            }
        } else if (n2 == 1001) {
            n.c(this.getApplicationContext(), "Rec");
        }
    }

    public void onBackPressed() {
        if ((float)this.y.getMeasuredHeight() > 60.0f * this.getResources().getDisplayMetrics().density) {
            this.collapse((View)this.y);
            return;
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493085);
        this.I = this;
        if (!Places.isInitialized()) {
            Places.initialize((Context)this.getApplicationContext(), (String)"AIzaSyCz6QgtQ7mSG9NtfjOTyfrTY8pM9lSfTZA");
        }
        this.f();
        this.d();
        this.l = (CustomMapFragment)this.getSupportFragmentManager().a(2131296976);
        this.l.a((com.google.android.gms.maps.e)this);
        this.u = (TextView)this.findViewById(2131297277);
        this.w = (ViewGroup)this.findViewById(2131297534);
        this.x = (ViewGroup)this.findViewById(2131296577);
        this.p = (TextView)this.findViewById(2131297510);
        this.r = (ImageView)this.findViewById(2131296743);
        this.s = (ImageView)this.findViewById(2131297589);
        this.v = (ViewGroup)this.findViewById(2131296579);
        this.y = (ScrollView)this.findViewById(2131296578);
        this.F = (ViewGroup)this.findViewById(2131297347);
        this.u.setEnabled(true);
        this.t = new com.mobond.mindicator.a.a(){

            @Override
            public void a(Location location) {
                super.a(location);
                PoliceStationLocatorHome.this.t.a();
                PoliceStationLocatorHome.this.c();
            }
        };
        this.t.a(100);
        new Handler().postDelayed(new Runnable(this){
            final /* synthetic */ PoliceStationLocatorHome a;
            {
                this.a = policeStationLocatorHome;
            }

            public void run() {
                PoliceStationLocatorHome.a(this.a).a(PoliceStationLocatorHome.c(this.a));
            }
        }, 1500L);
        n.a((Activity)this, "Police Station Locator");
        this.l.a(new a.a(this){
            final /* synthetic */ PoliceStationLocatorHome a;
            {
                this.a = policeStationLocatorHome;
            }

            public void a(android.view.MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    default: {
                        return;
                    }
                    case 1: {
                        PoliceStationLocatorHome.e(this.a);
                        PoliceStationLocatorHome.a(this.a, false);
                        return;
                    }
                    case 0: 
                }
                PoliceStationLocatorHome.d(this.a);
                PoliceStationLocatorHome.a(this.a, true);
            }
        });
        this.u.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ PoliceStationLocatorHome a;
            {
                this.a = policeStationLocatorHome;
            }

            public void onClick(View view) {
                try {
                    Intent intent = new com.google.android.libraries.places.widget.Autocomplete$IntentBuilder(com.google.android.libraries.places.widget.model.AutocompleteActivityMode.FULLSCREEN, this.a.b).setLocationBias((com.google.android.libraries.places.api.model.LocationBias)com.google.android.libraries.places.api.model.RectangularBounds.newInstance((LatLngBounds)PoliceStationLocatorHome.f(this.a))).build((Context)PoliceStationLocatorHome.c(this.a));
                    this.a.startActivityForResult(intent, this.a.a);
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
        });
        GradientDrawable gradientDrawable = (GradientDrawable)this.F.getBackground();
        gradientDrawable.setColor(-16777216);
        this.F.setBackgroundDrawable((Drawable)gradientDrawable);
        ((ImageView)this.F.findViewById(2131296885)).setColorFilter(-1);
        if (!this.getSharedPreferences("PoliceStationLocator", 0).getBoolean("isTermsAccepted", false)) {
            this.showTerms(this.findViewById(2131297472));
        }
    }

    public void showAllPoliceStations(View view) {
        Intent intent = new Intent(this.getApplicationContext(), PoliceStationsList.class);
        intent.putExtra("mumbai_police_json", this.m);
        this.startActivity(intent);
    }

    public void showErrorMessage(View view) {
        this.b("UNSUPPORTED AREA", this.H, null, "DISMISS");
    }

    public void showTerms(View view) {
        this.b("TERMS", "By using this feature, you agree to be legally bound by the terms and conditions given below. <br><br>Though all efforts have been made to ensure the accuracy of the content including territorial jurisdiction of Police Stations, the same should not be construed as a statement of law or used for any legal purposes. In case of any ambiguity or doubts, users are requested to verify with the Police Department and to obtain appropriate professional advice.<br><br>Under no circumstances Mobond will be liable for any expense, loss or damage including, without limitation, indirect or consequential loss or damage, or any expense, loss of damage whatsoever arising from use, or loss of use, of data, arising out of or in connection with the use of this feature.", null, "I ACCEPT");
    }

    public void translateDownUp(View view) {
        TranslateAnimation translateAnimation;
        TranslateAnimation translateAnimation2 = this.A;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
        }
        int n2 = view.getMeasuredHeight();
        this.z = translateAnimation = new TranslateAnimation(this, 0.0f, 0.0f, this.B, -n2, n2){
            final /* synthetic */ int a;
            final /* synthetic */ PoliceStationLocatorHome b;
            {
                this.b = policeStationLocatorHome;
                this.a = n2;
                super(f2, f3, f4, f5);
            }

            protected void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                PoliceStationLocatorHome.a(this.b, -1 * (int)(f2 * (float)this.a));
                super.applyTransformation(f2, transformation);
            }
        };
        this.z.setDuration(300L);
        this.z.setFillAfter(true);
        view.startAnimation((Animation)this.z);
    }

    public void translateUpDown(View view) {
        TranslateAnimation translateAnimation;
        TranslateAnimation translateAnimation2 = this.z;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
        }
        int n2 = this.B;
        this.A = translateAnimation = new TranslateAnimation(this, 0.0f, 0.0f, n2, 0.0f, n2){
            final /* synthetic */ int a;
            final /* synthetic */ PoliceStationLocatorHome b;
            {
                this.b = policeStationLocatorHome;
                this.a = n2;
                super(f2, f3, f4, f5);
            }

            protected void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                PoliceStationLocatorHome policeStationLocatorHome = this.b;
                int n2 = this.a;
                PoliceStationLocatorHome.a(policeStationLocatorHome, n2 - (int)(f2 * (float)n2));
                super.applyTransformation(f2, transformation);
            }
        };
        this.A.setDuration(300L);
        this.A.setFillAfter(true);
        view.startAnimation((Animation)this.A);
    }

    public void visitCitizenPortal(View view) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(Uri.parse((String)"https://www.mhpolice.maharashtra.gov.in/"));
            this.startActivity(intent);
        }
        catch (Exception exception) {}
    }

}

