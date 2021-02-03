/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.fragment.app.d
 *  androidx.fragment.app.e
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.multicity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.a.a.k;
import com.a.a.u;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.b;
import com.mobond.mindicator.c;
import com.mobond.mindicator.e;
import com.mobond.mindicator.ui.ExpandableHeightGridView;
import com.mobond.mindicator.ui.ExpandableHeightListView;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.lt.AddTrainActivity;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mobond.mindicator.ui.msrtc.MsrtcMainActivity;
import com.mobond.mindicator.ui.multicity.Multicity_home;
import com.mobond.mindicator.ui.multicity.a;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.j;
import com.mobond.mindicator.util.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
extends androidx.fragment.app.d {
    public static final String[] a = new String[]{"WESTERN LINE", "CENTRAL LINE", "HARBOUR LINE", "TRANS HARBOUR LINE", "URAN LINE"};
    public static final String[] b = new String[]{"RAILWAY PENALTIES", "TRAFFIC PENALTIES"};
    @SuppressLint(value={"StaticFieldLeak"})
    public static RelativeLayout c;
    RelativeLayout A;
    RelativeLayout B;
    RelativeLayout C;
    b D;
    boolean E = false;
    String F;
    String G;
    j H;
    ExpandableHeightListView I;
    RelativeLayout J;
    View K;
    View L;
    View M;
    RelativeLayout N;
    TextView O;
    TextView P;
    TextView Q;
    TextView R;
    TextView S;
    View T;
    View U;
    View V;
    TextView W;
    View X = null;
    ProgressDialog Y;
    public Activity d;
    ExpandableHeightGridView e;
    c f;
    ArrayList<String> g = new ArrayList();
    ArrayList<String> h = new ArrayList();
    ArrayList<String> i = new ArrayList();
    ArrayList<String> j = new ArrayList();
    ArrayList<String> k = new ArrayList();
    JSONObject l = new JSONObject();
    JSONObject m = new JSONObject();
    ArrayList<String> n = new ArrayList();
    ArrayList<String> o = new ArrayList();
    ArrayList<e> p = new ArrayList();
    TextView q;
    TextView r;
    TextView s;
    TextView t;
    TextView u;
    TextView v;
    LinearLayout w;
    LinearLayout x;
    LinearLayout y;
    LinearLayout z;

    public static void a(Activity activity) {
        if (Integer.parseInt((String)new JSONObject(new String(com.mulo.util.e.a(com.mulo.util.e.a((Object)activity, "../config.json")))).getString("minversion")) > Integer.parseInt((String)h.a(activity))) {
            c.setVisibility(0);
        }
    }

    public static void a(Activity activity, String string) {
        Dialog dialog = new Dialog((Context)activity);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131492984);
        LinearLayout linearLayout = (LinearLayout)dialog.findViewById(2131296998);
        for (int i2 = 0; i2 < a.length; ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131492952, (ViewGroup)linearLayout, false);
            TextView textView = (TextView)viewGroup.findViewById(2131297117);
            TextView textView2 = (TextView)viewGroup.findViewById(2131296655);
            RelativeLayout relativeLayout = (RelativeLayout)viewGroup.findViewById(2131297186);
            textView.setText((CharSequence)g.a(a[i2], g.a));
            if (i2 == a.length - 1) {
                textView2.setVisibility(8);
            }
            relativeLayout.setOnClickListener(new View.OnClickListener(dialog, activity, i2, string){
                final /* synthetic */ Dialog a;
                final /* synthetic */ Activity b;
                final /* synthetic */ int c;
                final /* synthetic */ String d;
                {
                    this.a = dialog;
                    this.b = activity;
                    this.c = n2;
                    this.d = string;
                }

                public void onClick(View view) {
                    n.a(this.a);
                    com.mobond.mindicator.ui.train.TrainsAtStationUI.a(this.b, a.a[this.c], "", this.d);
                }
            });
            linearLayout.addView((View)viewGroup);
        }
        dialog.show();
    }

    public static void a(Context context, String string, String string2, String string3) {
        ConfigurationManager.a(context, string.toUpperCase(), string2.toUpperCase(), string3.toUpperCase());
    }

    private void a(d d2) {
        this.V.setOnClickListener(new View.OnClickListener(this, d2){
            final /* synthetic */ d a;
            final /* synthetic */ a b;
            {
                this.b = a2;
                this.a = d2;
            }

            public void onClick(View view) {
                com.mobond.mindicator.ui.train.TraceTrainUI2.a((Context)this.b.getActivity(), "YES_HOME");
                if (com.mobond.mindicator.a.a.a((Context)this.b.getActivity())) {
                    if ((Multicity_home)this.b.getActivity() != null && this.b.getActivity() instanceof Multicity_home) {
                        String string = this.b.D.F();
                        this.b.S.setText((CharSequence)"");
                        this.b.S.setVisibility(8);
                        String string2 = this.a.s;
                        String string3 = this.a.v;
                        String string4 = this.a.w;
                        String string5 = this.a.v.split("-")[0].trim();
                        String string6 = this.a.v.split("-")[1].trim();
                        String string7 = this.a.p;
                        int n2 = this.a.x;
                        ((Multicity_home)this.b.getActivity()).a(string2, string3, string4, string5, string7, string6, n2, string);
                        this.b.W.setVisibility(0);
                        this.b.U.setVisibility(4);
                        this.b.T.setVisibility(8);
                        return;
                    }
                } else {
                    n.f((Context)this.b.getActivity(), "Please wait..");
                    if ((Multicity_home)this.b.getActivity() != null && this.b.getActivity() instanceof Multicity_home) {
                        ((Multicity_home)this.b.getActivity()).x = true;
                    }
                    com.mobond.mindicator.a.a.b((Activity)this.b.getActivity());
                }
            }
        });
        this.N.setOnClickListener(new View.OnClickListener(this, d2){
            final /* synthetic */ d a;
            final /* synthetic */ a b;
            {
                this.b = a2;
                this.a = d2;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.b.getActivity(), com.mobond.mindicator.ui.train.TraceTrainUI2.class);
                intent.putExtra("selected_route", this.a.w);
                intent.putExtra("you_are_at", this.a.v.split("-")[0].trim());
                intent.putExtra("user_selected_dest", this.a.v.split("-")[1].trim());
                intent.putExtra("selected_train_string", this.a.p);
                intent.putExtra("tn", this.a.s);
                intent.putExtra("selected_direction", this.a.x);
                intent.putExtra("extra_dr", (android.os.Parcelable)this.a);
                this.b.startActivity(intent);
            }
        });
        this.T.setOnClickListener(new View.OnClickListener(this, d2){
            final /* synthetic */ d a;
            final /* synthetic */ a b;
            {
                this.b = a2;
                this.a = d2;
            }

            public void onClick(View view) {
                this.b.L.setVisibility(8);
                com.mobond.mindicator.ui.lt.a.a(this.a.s, (Context)this.b.getActivity());
            }
        });
    }

    private void a(d d2, boolean bl) {
        if (this.isAdded()) {
            this.N.setVisibility(0);
            this.Q.setText((CharSequence)d2.b);
            if (bl) {
                this.W.setVisibility(0);
                this.U.setVisibility(4);
                this.T.setVisibility(8);
            } else {
                this.W.setVisibility(8);
                this.U.setVisibility(0);
                this.S.setText((CharSequence)this.getString(2131755075));
                this.S.setVisibility(0);
                this.T.setVisibility(0);
            }
            this.R.setText((CharSequence)f.b(d2.v));
            this.a(d2);
        }
    }

    static /* synthetic */ void a(a a2, String string, String string2, String string3) {
        a2.a(string, string2, string3);
    }

    static /* synthetic */ void a(a a2, String string, String string2, boolean bl) {
        a2.a(string, string2, bl);
    }

    private void a(String string, Bitmap bitmap) {
        Log.d((String)"123456", (String)"saveBitmap ");
        File file = new File(ConfigurationManager.b().getFilesDir(), string);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)fileOutputStream);
            fileOutputStream.close();
            Log.d((String)"123456", (String)"success ");
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IOException ");
            stringBuilder.append(iOException.getMessage());
            Log.d((String)"123456", (String)stringBuilder.toString());
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FileNotFoundException ");
            stringBuilder.append(fileNotFoundException.getMessage());
            Log.d((String)"123456", (String)stringBuilder.toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String string, String string2, String string3) {
        ArrayList arrayList;
        block7 : {
            JSONArray jSONArray;
            block8 : {
                n.a((Dialog)this.Y);
                if (string3 == null) return;
                try {
                    JSONObject jSONObject = new JSONObject(string3);
                    if (jSONObject.getString("code").equals((Object)"400")) {
                        n.d(this.getContext(), jSONObject.getString("message"));
                        return;
                    }
                    if (jSONObject.getBoolean("isuserregistered")) {
                        GoogleLoginActivity.c(this.getContext());
                        this.D.t(jSONObject.getString("displayname"));
                        this.D.q(jSONObject.getString("mobile"));
                        this.D.r(jSONObject.optString("access"));
                        this.D.c(jSONObject.optBoolean("isverified"));
                        n.c(this.getContext(), "Successfully Login");
                        this.f();
                        arrayList = new ArrayList();
                        if (!jSONObject.has("trains")) break block7;
                        jSONArray = jSONObject.getJSONArray("trains");
                        break block8;
                    }
                    if (!(this.d instanceof Multicity_home)) return;
                    {
                        ((Multicity_home)this.d).b(string, string2);
                        return;
                    }
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
                return;
            }
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                d d2 = f.a(jSONObject.getString("tn"), jSONObject.getString("src"), jSONObject.getString("dest"), this.getContext());
                if (d2 == null) continue;
                arrayList.add((Object)d2);
            }
        }
        if (arrayList.size() != 0) {
            f.a(this.getContext(), (ArrayList<d>)arrayList);
            return;
        }
        this.startActivity(new Intent((Context)this.getActivity(), AddTrainActivity.class));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String string, String string2, boolean bl) {
        if (bl) {
            Intent intent = new Intent((Context)this.d, WebUI.class);
            com.mulo.util.g g2 = new com.mulo.util.g();
            com.mulo.util.e.a(g2.a(), g2);
            g2.a = string;
            g2.g = true;
            intent.putExtra("webuidatakey", g2.a());
            this.startActivity(intent);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (string2 != null) {
                intent.setPackage(string2);
            }
            intent.setData(Uri.parse((String)string));
            this.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            this.a(string, string2, true);
            return;
        }
    }

    private Bitmap b(String string) {
        Log.d((String)"123456", (String)"getBitmapFromLocalDisk : ");
        try {
            File file = new File(this.getContext().getFilesDir(), string);
            if (file.exists()) {
                Bitmap bitmap = BitmapFactory.decodeFile((String)file.getPath());
                return bitmap;
            }
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception : ");
            stringBuilder.append(exception.getMessage());
            Log.d((String)"123456", (String)stringBuilder.toString());
        }
        return null;
    }

    private void e() {
        this.f();
    }

    private void f() {
        this.L.setVisibility(0);
        this.M.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ a a;
            {
                this.a = a2;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.a.getActivity(), AddTrainActivity.class);
                this.a.startActivity(intent);
            }
        });
        this.K.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ a a;
            {
                this.a = a2;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.a.getActivity(), AddTrainActivity.class);
                this.a.startActivity(intent);
            }
        });
        this.O.setText((CharSequence)this.D.J());
    }

    public void a() {
        String string = ConfigurationManager.b(this.getContext());
        TextView textView = this.r;
        Object[] arrobject = new Object[]{string.toUpperCase()};
        textView.setText((CharSequence)g.a(String.format((String)"EXPLORE %s", (Object[])arrobject), g.a));
        String[] arrstring = new String[6];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.mulo.util.e.a(string, new char[]{' '}));
        stringBuilder.append(" Map");
        arrstring[0] = stringBuilder.toString();
        arrstring[1] = "How to travel?";
        arrstring[2] = "Popular places";
        arrstring[3] = "Shopping";
        arrstring[4] = "Food & Drink";
        arrstring[5] = "Hotels";
        int[] arrn = new int[]{2131231178, 2131231174, 2131231188, 2131231192, 2131231170, 2131231173};
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)this.getActivity()).inflate(2131493074, (ViewGroup)this.w, false);
            RelativeLayout relativeLayout = (RelativeLayout)viewGroup.findViewById(2131297242);
            TextView textView2 = (TextView)viewGroup.findViewById(2131296740);
            ((ImageView)viewGroup.findViewById(2131296739)).setImageResource(arrn[i2]);
            textView2.setText((CharSequence)g.a(arrstring[i2], g.a));
            if (i2 % 2 == 0) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, (Drawable)new ColorDrawable(this.getResources().getColor(2131100278)));
                stateListDrawable.addState(new int[]{16842908}, (Drawable)new ColorDrawable(this.getResources().getColor(2131099851)));
                stateListDrawable.addState(new int[0], (Drawable)new ColorDrawable(this.getResources().getColor(2131099851)));
                relativeLayout.setBackgroundDrawable((Drawable)stateListDrawable);
            } else {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, (Drawable)new ColorDrawable(this.getResources().getColor(2131100278)));
                stateListDrawable.addState(new int[]{16842908}, (Drawable)new ColorDrawable(this.getResources().getColor(2131099852)));
                stateListDrawable.addState(new int[0], (Drawable)new ColorDrawable(this.getResources().getColor(2131099852)));
                relativeLayout.setBackgroundDrawable((Drawable)stateListDrawable);
            }
            viewGroup.setTag((Object)arrstring[i2]);
            viewGroup.setOnClickListener(new View.OnClickListener(this, i2, arrstring){
                final /* synthetic */ int a;
                final /* synthetic */ String[] b;
                final /* synthetic */ a c;
                {
                    this.c = a2;
                    this.a = n2;
                    this.b = arrstring;
                }

                public void onClick(View view) {
                    String string;
                    int n2 = this.a;
                    if (n2 == 0) {
                        a a2 = this.c;
                        a2.startActivity(new Intent((Context)a2.d, com.mobond.mindicator.ui.multicity.CityMap.class));
                        ((Multicity_home)this.c.d).y = true;
                        return;
                    }
                    if (n2 == 1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("http://mobondhrd.appspot.com/howtotravel/i.jsp?city=");
                        stringBuilder.append(ConfigurationManager.b((Context)this.c.d));
                        string = stringBuilder.toString();
                    } else if (n2 == 2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("http://mobondhrd.appspot.com/places/i.jsp?city=");
                        stringBuilder.append(ConfigurationManager.b((Context)this.c.d));
                        string = stringBuilder.toString();
                    } else if (n2 == 3) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("http://mobondhrd.appspot.com/shopping/i.jsp?city=");
                        stringBuilder.append(ConfigurationManager.b((Context)this.c.d));
                        string = stringBuilder.toString();
                    } else if (n2 == 4) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("http://mobondhrd.appspot.com/food/i.jsp?city=");
                        stringBuilder.append(ConfigurationManager.b((Context)this.c.d));
                        string = stringBuilder.toString();
                    } else {
                        String[] arrstring = this.c.G.split(",");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("http://mobondhrd.appspot.com/hotels/i.jsp?city=&latitude=");
                        stringBuilder.append(arrstring[0]);
                        stringBuilder.append("&longitude=");
                        stringBuilder.append(arrstring[1]);
                        string = stringBuilder.toString();
                    }
                    String string2 = com.mulo.b.e.a(string, (Context)this.c.d);
                    Intent intent = new Intent((Context)this.c.d, WebUI.class);
                    com.mulo.util.g g2 = new com.mulo.util.g();
                    com.mulo.util.e.a(g2.a(), g2);
                    g2.a = string2;
                    intent.putExtra("webuidatakey", g2.a());
                    intent.putExtra("webuititle", this.b[this.a]);
                    this.c.startActivity(intent);
                    ((Multicity_home)this.c.d).y = true;
                }
            });
            if (i2 == 0 && string.equalsIgnoreCase("pune")) continue;
            this.w.addView((View)viewGroup);
        }
    }

    public void a(Context context) {
        Dialog dialog = new Dialog((Context)this.d);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131492984);
        LinearLayout linearLayout = (LinearLayout)dialog.findViewById(2131296998);
        for (int i2 = 0; i2 < b.length; ++i2) {
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)context).inflate(2131492952, (ViewGroup)linearLayout, false);
            TextView textView = (TextView)viewGroup.findViewById(2131297117);
            RelativeLayout relativeLayout = (RelativeLayout)viewGroup.findViewById(2131297186);
            TextView textView2 = (TextView)viewGroup.findViewById(2131296655);
            textView.setText((CharSequence)b[i2]);
            textView.setTag((Object)b[i2]);
            if (i2 == b.length - 1) {
                textView2.setVisibility(8);
            }
            relativeLayout.setOnClickListener(new View.OnClickListener(this, textView){
                final /* synthetic */ TextView a;
                final /* synthetic */ a b;
                {
                    this.b = a2;
                    this.a = textView;
                }

                public void onClick(View view) {
                    Intent intent = new Intent(this.b.getContext(), com.mobond.mindicator.ui.penalties.PenaltyList.class);
                    String string = this.a.getTag().toString();
                    if (string.equals((Object)a.b[0])) {
                        intent.putExtra("type", "railway");
                        intent.putExtra("title", "Railway Penalties");
                        this.b.startActivity(intent);
                        ((Multicity_home)this.b.d).y = true;
                        return;
                    }
                    if (string.equals((Object)a.b[1])) {
                        intent.putExtra("type", "traffic");
                        intent.putExtra("title", "Traffic Penalties");
                        this.b.startActivity(intent);
                        ((Multicity_home)this.b.d).y = true;
                    }
                }
            });
            linearLayout.addView((View)viewGroup);
        }
        dialog.show();
    }

    public void a(d d2, Context context) {
        if (this.isAdded()) {
            if (d2 != null) {
                this.a(d2, true);
                return;
            }
            d d3 = f.d(context);
            if (d3 != null) {
                this.a(d3, false);
                return;
            }
            this.N.setVisibility(8);
        }
    }

    public void a(String string) {
        if (this.isAdded() && string != null) {
            this.S.setVisibility(0);
            this.S.setText((CharSequence)string);
        }
    }

    public void a(String string, String string2) {
        if (this.isAdded()) {
            this.Y = new ProgressDialog(this.getContext());
            this.Y.setMessage((CharSequence)"Loading..");
            this.Y.setCancelable(false);
            this.Y.show();
            com.mobond.mindicator.ui.lt.trainutils.a.a(string2, this.D.H(), new com.mulo.b.a(this, string, string2){
                final /* synthetic */ String a;
                final /* synthetic */ String b;
                final /* synthetic */ a c;
                {
                    this.c = a2;
                    this.a = string;
                    this.b = string2;
                }

                public void a() {
                    n.a((Dialog)this.c.Y);
                }

                public void a(byte[] arrby, byte[] arrby2, Object object) {
                    String string = new String(arrby);
                    a.a(this.c, this.a, this.b, string);
                }
            }, (Activity)this.getActivity());
        }
    }

    /*
     * Exception decompiling
     */
    public void a(String var1, JSONObject var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl263 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    /*
     * Exception decompiling
     */
    public void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl165 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    public void c() {
        if (h.a(ConfigurationManager.b(this.getContext()), (Activity)this.getActivity()) == 1) {
            this.B.setVisibility(0);
            return;
        }
        this.B.setVisibility(8);
    }

    public void d() {
        if (b.g() > Integer.parseInt((String)"20210102")) {
            this.C.setVisibility(0);
            return;
        }
        this.C.setVisibility(8);
    }

    public void onAttach(Context context) {
        if (context instanceof Activity) {
            this.d = (Activity)context;
        }
        super.onAttach(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(Bundle bundle) {
        int n2;
        int n3;
        int n4;
        block11 : {
            block10 : {
                super.onCreate(bundle);
                this.D = com.mobond.mindicator.a.a(this.d);
                try {
                    this.b();
                    this.p.clear();
                    n3 = this.g.size();
                    n2 = 12;
                    if (n3 > 4) break block10;
                    n2 = 4;
                    n4 = 0;
                    break block11;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
            if (n3 <= 8) {
                n2 = 8;
                n4 = 0;
            } else if (n3 <= n2) {
                n4 = 0;
            } else {
                n2 = 0;
                n4 = 0;
            }
        }
        while (n4 < n2) {
            if (n4 < n3) {
                String string = (String)this.g.get(n4);
                String string2 = string.replace((CharSequence)" ", (CharSequence)"");
                if (string2.contains((CharSequence)"chat")) {
                    string2 = "trainchat";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("multicity_");
                stringBuilder.append(string2);
                String string3 = stringBuilder.toString();
                int n5 = this.d.getResources().getIdentifier(string3, "drawable", this.d.getPackageName());
                Bitmap bitmap = BitmapFactory.decodeResource((Resources)this.getResources(), (int)n5);
                this.p.add((Object)new e(bitmap, string));
            } else {
                Bitmap bitmap = BitmapFactory.decodeResource((Resources)this.getResources(), (int)17170445);
                this.p.add((Object)new e(bitmap, "          "));
            }
            ++n4;
        }
    }

    /*
     * Exception decompiling
     */
    public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl444 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onPause() {
        super.onPause();
        Activity activity = this.d;
        if (activity instanceof Multicity_home) {
            ((Multicity_home)activity).h();
            ((Multicity_home)this.d).f();
        }
    }

    public void onResume() {
        super.onResume();
        this.H.b();
        this.e();
        Activity activity = this.d;
        if (activity instanceof Multicity_home) {
            ((Multicity_home)activity).n();
            ((Multicity_home)this.d).e();
        }
    }

    public void onStop() {
        super.onStop();
    }

}

