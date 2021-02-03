/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.app.ProgressDialog
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.content.ServiceConnection
 *  android.content.SharedPreferences
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.media.AudioManager
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.os.Vibrator
 *  android.speech.tts.TextToSpeech
 *  android.speech.tts.TextToSpeech$OnInitListener
 *  android.text.Editable
 *  android.text.Html
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.view.animation.Animation
 *  android.view.animation.RotateAnimation
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.ExpandableListAdapter
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnGroupClickListener
 *  android.widget.ExpandableListView$OnGroupExpandListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  androidx.appcompat.widget.SwitchCompat
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.app.a
 *  androidx.core.content.a
 *  androidx.fragment.app.e
 *  androidx.h.a.a
 *  com.google.android.gms.auth.api.a
 *  com.google.android.gms.auth.api.credentials.HintRequest
 *  com.google.android.gms.auth.api.credentials.HintRequest$a
 *  com.google.android.gms.auth.api.credentials.a
 *  com.google.android.gms.common.api.a
 *  com.google.android.gms.common.api.f
 *  com.google.android.gms.common.api.f$a
 *  com.google.android.gms.common.api.f$b
 *  com.google.android.gms.common.api.f$c
 *  com.google.android.gms.common.b
 *  com.google.android.gms.maps.model.LatLng
 *  com.google.android.material.bottomsheet.BottomSheetBehavior
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.io.FileDescriptor
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Timer
 *  java.util.TimerTask
 *  java.util.Vector
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.train;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.Html;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.ui.FeedbackUI;
import com.mobond.mindicator.ui.b;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.g;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.lt.AddTrainActivity;
import com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.safety.TrainLocationEntryRPFUI;
import com.mobond.mindicator.ui.train.TraceTrainUI2;
import com.mobond.mindicator.ui.train.e;
import com.mobond.mindicator.util.b;
import com.mulo.a.d.h;
import com.mulo.a.d.j;
import java.io.FileDescriptor;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TraceTrainUI2
extends BaseAppCompatActivity
implements f.b,
f.c,
b,
b.a {
    TextView A;
    com.mobond.mindicator.ui.lt.a.a B = new com.mobond.mindicator.ui.lt.a.a();
    Timer C;
    Timer D;
    TextView E;
    TextView F;
    TextView G;
    InsideLocalTrainService H;
    RelativeLayout I;
    View J;
    SwitchCompat K;
    public String L;
    String M = "";
    FloatingActionButton N;
    FloatingActionButton O;
    com.mobond.mindicator.b P;
    boolean Q = true;
    Spinner R;
    RelativeLayout S;
    LinearLayout T;
    String U;
    TextView V;
    TextView W;
    com.google.android.gms.common.api.f X;
    EditText Y;
    EditText Z;
    String a = null;
    Dialog aA;
    int aB = 0;
    boolean aC = false;
    FloatingActionButton aD;
    TextView aE;
    d aF;
    com.mobond.mindicator.util.f aG = new com.mobond.mindicator.util.f();
    Runnable aH = new Runnable(this){
        final /* synthetic */ TraceTrainUI2 a;
        {
            this.a = traceTrainUI2;
        }

        public void run() {
            TraceTrainUI2.o(this.a);
            TraceTrainUI2.m(this.a);
        }
    };
    RotateAnimation aI;
    private int aJ = -1;
    private Toolbar aK;
    private boolean aL;
    private a aM;
    private boolean aN = false;
    private final int aO = 30000;
    private final int aP = 30000;
    private final int aQ = 15000;
    private int aR = -1;
    private ServiceConnection aS;
    private TextToSpeech aT;
    private String aU;
    private String aV;
    private BottomSheetBehavior aW;
    private LinearLayout aX;
    TextView aa;
    View ab;
    boolean ac = true;
    boolean ad = false;
    String ae = "";
    String af = "";
    String ag = "reg";
    String ah = "update";
    boolean ai = false;
    Handler aj;
    boolean ak = false;
    boolean al = false;
    boolean am = false;
    boolean an = false;
    String ao = null;
    MediaPlayer ap;
    Vibrator aq;
    androidx.appcompat.app.d ar;
    com.mobond.mindicator.ui.lt.trainutils.b as;
    boolean at;
    boolean au;
    boolean av;
    boolean aw = true;
    String ax;
    int ay;
    com.mobond.mindicator.util.b az;
    String b = null;
    String c = null;
    String d = null;
    boolean e = true;
    SharedPreferences f;
    String g;
    String[] h;
    public SparseArray<com.mobond.mindicator.ui.train.c> i = new SparseArray();
    Vector<String> j;
    public boolean k = true;
    public ArrayList<String> l = new ArrayList();
    public int m = -1;
    public boolean n = true;
    public int o = 0;
    View p;
    String q = "ca-app-pub-5449278086868932/2269602980";
    String r = "167101606757479_1239838659483763";
    String s = "ca-app-pub-5449278086868932/9009431450";
    String t = "167101606757479_1235757836558512";
    TextView u;
    ExpandableListView v;
    RelativeLayout w;
    RelativeLayout x;
    ImageView y;
    TextView z;

    public TraceTrainUI2() {
        RotateAnimation rotateAnimation;
        this.aI = rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
    }

    private void A() {
        InsideLocalTrainService insideLocalTrainService = this.H;
        if (insideLocalTrainService != null) {
            insideLocalTrainService.d();
        }
    }

    private void B() {
        try {
            this.K.setChecked(false);
            this.a((com.mobond.mindicator.ui.lt.a.a)null);
            this.J();
            this.E();
            this.N.b();
        }
        catch (Exception exception) {}
    }

    private void C() {
        this.aI.setDuration(1000L);
        this.aI.setRepeatCount(-1);
        this.N.startAnimation((Animation)this.aI);
    }

    private void D() {
        Timer timer = this.D;
        if (timer != null) {
            timer.cancel();
            this.D = null;
        }
    }

    private void E() {
        if (!this.K.isChecked() && this.D == null) {
            this.D = new Timer();
            this.D.scheduleAtFixedRate(new TimerTask(this){
                final /* synthetic */ TraceTrainUI2 a;
                {
                    this.a = traceTrainUI2;
                }

                public void run() {
                    this.a.runOnUiThread(new Runnable(this){
                        final /* synthetic */ 19 a;
                        {
                            this.a = var1_1;
                        }

                        public void run() {
                            this.a.a.c(false);
                        }
                    });
                }
            }, 0L, 15000L);
        }
    }

    private void F() {
        if (this.C == null) {
            this.C = new Timer();
            this.C.scheduleAtFixedRate(new TimerTask(this){
                final /* synthetic */ TraceTrainUI2 a;
                {
                    this.a = traceTrainUI2;
                }

                public void run() {
                    this.a.runOnUiThread(new Runnable(this){
                        final /* synthetic */ 22 a;
                        {
                            this.a = var1_1;
                        }

                        public void run() {
                            if (this.a.a.v.getExpandableListAdapter() != null) {
                                ((e)this.a.a.v.getExpandableListAdapter()).notifyDataSetChanged();
                            }
                        }
                    });
                }
            }, 30000L, 30000L);
        }
    }

    private void G() {
        InsideLocalTrainService insideLocalTrainService;
        this.q();
        this.V.clearAnimation();
        if (this.g() && (insideLocalTrainService = this.H) != null && insideLocalTrainService.a((Context)this)) {
            this.unbindService(this.f());
            this.H.a();
            this.H = null;
            this.b(false);
        } else {
            this.z();
        }
        this.Q = true;
    }

    private void H() {
        if (this.ac) {
            if (f.a(this.L, (Context)this.L())) {
                this.al = true;
                return;
            }
            this.al = false;
        }
    }

    private ArrayList<String> I() {
        ArrayList arrayList = new ArrayList();
        boolean bl = false;
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            String string = (String)this.l.get(i2);
            if (string.equals((Object)"#LIVEPOS#")) continue;
            if (!string.contains((CharSequence)"#NOSTOP#")) {
                String string2 = ((String)this.l.get(i2)).split("#", -1)[2];
                if (bl) {
                    arrayList.add((Object)string2);
                }
                if (!string2.equals((Object)this.a)) continue;
                bl = true;
                continue;
            }
            String string3 = string.split("#")[0];
            if (!this.B.b() || !string3.equals((Object)this.B.b)) continue;
            bl = true;
        }
        return arrayList;
    }

    private void J() {
        RelativeLayout relativeLayout = this.S;
        relativeLayout.setVisibility(0);
        ArrayList<String> arrayList = this.I();
        if (arrayList.size() != 0) {
            int n2;
            if (this.U != null) {
                n2 = -1;
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    if (!this.U.equals(arrayList.get(i2))) continue;
                    n2 = i2;
                }
            } else {
                n2 = -1 + arrayList.size();
            }
            if (n2 != -1) {
                ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 2131493134, arrayList);
                arrayAdapter.setDropDownViewResource(17367049);
                this.R.setAdapter((SpinnerAdapter)arrayAdapter);
                this.R.setSelection(n2);
                this.V.setText((CharSequence)arrayList.get(n2));
                this.R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(this, arrayList){
                    final /* synthetic */ ArrayList a;
                    final /* synthetic */ TraceTrainUI2 b;
                    {
                        this.b = traceTrainUI2;
                        this.a = arrayList;
                    }

                    public void onItemSelected(AdapterView<?> adapterView, View view, int n2, long l2) {
                        this.b.U = (String)this.a.get(n2);
                        this.b.V.setText((CharSequence)this.b.U);
                        if (this.b.H != null && this.b.H.a((Context)this.b)) {
                            this.b.H.a(this.b.U);
                        }
                    }

                    public void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });
            }
        }
    }

    private void K() {
        this.a(true, false);
    }

    private Activity L() {
        return this;
    }

    private void M() {
        com.google.android.gms.common.api.f f2 = this.X;
        if (f2 == null || !f2.j()) {
            this.X = new f.a((Context)this).a((f.b)this).a((androidx.fragment.app.e)this, 0, (f.c)this).a(com.google.android.gms.auth.api.a.d).b();
        }
    }

    private void N() {
        this.M();
        HintRequest hintRequest = new HintRequest.a().a(true).a();
        PendingIntent pendingIntent = com.google.android.gms.auth.api.a.g.a(this.X, hintRequest);
        try {
            this.startIntentSenderForResult(pendingIntent.getIntentSender(), 151, null, 0, 0, 0);
            return;
        }
        catch (IntentSender.SendIntentException sendIntentException) {
            sendIntentException.printStackTrace();
            return;
        }
    }

    private void O() {
        this.a("Train Added", false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void P() {
        LatLng latLng;
        String string = this.P.F();
        String string2 = com.mobond.mindicator.ui.lt.trainutils.a.a.a((Context)this.L());
        if (string2 == null || string == null || (latLng = InsideLocalTrainService.a(string2, (Context)this.L())) == null) return;
        j[] arrj = h.b(this.d, this.c, (Object)this.L());
        com.mobond.mindicator.ui.lt.trainutils.a.c c2 = new com.mobond.mindicator.ui.lt.trainutils.a.a(arrj, this.ay, (Context)this.L()).a(latLng);
        if (c2 == null) return;
        try {
            if (!c2.j) return;
            com.mulo.b.h h2 = new com.mulo.b.h();
            h2.a("a", "CANCEL");
            h2.a("tn", this.L);
            h2.a("u", string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(System.currentTimeMillis());
            stringBuilder.append("");
            h2.a("ut", stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.P.N());
            stringBuilder2.append("");
            h2.a("v", stringBuilder2.toString());
            h2.a("b", "20210102");
            com.mobond.mindicator.ui.lt.trainutils.a.b(h2, new com.mulo.b.a(this){
                final /* synthetic */ TraceTrainUI2 a;
                {
                    this.a = traceTrainUI2;
                }

                public void a() {
                    n.d((Context)TraceTrainUI2.a(this.a), "Check Internet");
                }

                public void a(byte[] arrby, byte[] arrby2, Object object) {
                    android.widget.Toast.makeText((Context)TraceTrainUI2.a(this.a), (CharSequence)"Thanks for sharing train information.", (int)0).show();
                }
            }, this.L());
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void Q() {
        d.a a2 = new d.a((Context)this);
        a2.b((CharSequence)"Are you sure ?\n(This will impact lakhs of users)").a(true).a((CharSequence)"YES, THIS TRAIN IS CANCELLED", new DialogInterface.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
                if (com.mobond.mindicator.h.a((Context)this.a, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                    TraceTrainUI2.u(this.a);
                    return;
                }
                if (com.mobond.mindicator.h.a((Activity)this.a, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                    com.mobond.mindicator.h.a((Activity)this.a, 112);
                    return;
                }
                TraceTrainUI2 traceTrainUI2 = this.a;
                TraceTrainUI2.a(traceTrainUI2, (Activity)traceTrainUI2, traceTrainUI2.getString(2131755437), 112);
            }
        }).b((CharSequence)"DISMISS", new DialogInterface.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        a2.b().show();
    }

    static /* synthetic */ int a(TraceTrainUI2 traceTrainUI2, int n2) {
        traceTrainUI2.aJ = n2;
        return n2;
    }

    private void a(Activity activity) {
        View view;
        if (activity != null && (view = activity.getCurrentFocus()) != null) {
            ((InputMethodManager)activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void a(Activity activity, String string, int n2) {
        String string2 = activity.getString(2131755290);
        String string3 = activity.getString(2131755214);
        String string4 = activity.getString(2131755172);
        if (com.mobond.mindicator.a.a(activity).D()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<b>");
            stringBuilder.append(string);
            stringBuilder.append("</b>");
            string = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("<big>");
            stringBuilder2.append(string3);
            stringBuilder2.append("</big>");
            stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("<big>");
            stringBuilder3.append(string2);
            stringBuilder3.append("</big>");
            string2 = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("<big>");
            stringBuilder4.append(string4);
            stringBuilder4.append("</big>");
            stringBuilder4.toString();
        }
        d.a a2 = new d.a((Context)activity);
        a2.a((CharSequence)activity.getString(2131755215, new Object[]{"LOCATION"}));
        a2.b((CharSequence)string);
        a2.a((CharSequence)Html.fromHtml((String)string2), new DialogInterface.OnClickListener(this, activity, n2){
            final /* synthetic */ Activity a;
            final /* synthetic */ int b;
            final /* synthetic */ TraceTrainUI2 c;
            {
                this.c = traceTrainUI2;
                this.a = activity;
                this.b = n2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                com.mobond.mindicator.h.a(this.a, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this.b);
            }
        });
        a2.b().show();
    }

    public static void a(Context context, String string) {
        ConfigurationManager.a(context, "LIVE_TRAIN", string, "ANALYTICS_CLICK");
    }

    private void a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.K.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private void a(Spinner spinner) {
        String[] arrstring;
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        for (int i2 = 0; i2 < (arrstring = this.h).length - 1; ++i2) {
            String string = arrstring[i2].split("#")[0];
            String string2 = this.h[i2].split("#")[1];
            String string3 = this.h[i2].split("#")[2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            arrayList.add((Object)stringBuilder.toString());
            if (!string3.equals((Object)this.a)) continue;
            n2 = i2;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (List)arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter)arrayAdapter);
        spinner.setSelection(n2);
    }

    private void a(Spinner spinner, Spinner spinner2) {
        String[] arrstring;
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"- Select Destination -");
        boolean bl = false;
        for (int i2 = 0; i2 < (arrstring = this.h).length; ++i2) {
            String string = arrstring[i2].split("#")[0];
            String string2 = this.h[i2].split("#")[1];
            String string3 = this.h[i2].split("#")[2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            String string4 = stringBuilder.toString();
            if (bl) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                stringBuilder2.append(" ");
                stringBuilder2.append(string2);
                stringBuilder2.append(" ");
                stringBuilder2.append(string3);
                arrayList.add((Object)stringBuilder2.toString());
            }
            if (string4.equals(spinner.getSelectedItem())) {
                bl = true;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (List)arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            spinner2.setAdapter((SpinnerAdapter)arrayAdapter);
        }
    }

    private void a(d d2, String string, String string2, String string3, String string4, String string5, boolean bl) {
        ProgressDialog progressDialog = new ProgressDialog((Context)this);
        if (bl) {
            progressDialog.setMessage((CharSequence)"Adding Train..");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
        if (GoogleLoginActivity.b((Context)this)) {
            com.mulo.b.h h2 = new com.mulo.b.h();
            h2.a("tn", d2.s);
            h2.a("u", this.P.E());
            h2.a("l", this.d);
            h2.a("bt", string2);
            h2.a("bs", string);
            h2.a("at", string4);
            h2.a("as", string3);
            h2.a("a", "add");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(bl);
            stringBuilder.append("");
            h2.a("isvol", stringBuilder.toString());
            com.mulo.b.a a2 = new com.mulo.b.a(this, bl, progressDialog, d2, string5){
                final /* synthetic */ boolean a;
                final /* synthetic */ ProgressDialog b;
                final /* synthetic */ d c;
                final /* synthetic */ String d;
                final /* synthetic */ TraceTrainUI2 e;
                {
                    this.e = traceTrainUI2;
                    this.a = bl;
                    this.b = progressDialog;
                    this.c = d2;
                    this.d = string;
                }

                public void a() {
                    if (this.a) {
                        n.a((Dialog)this.b);
                    }
                }

                public void a(byte[] arrby, byte[] arrby2, Object object) {
                    if (this.a) {
                        String string = new String(arrby);
                        n.a((Dialog)this.b);
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            if (jSONObject.optString("code").equals((Object)"400")) {
                                n.d((Context)this.e, jSONObject.optString("message"));
                                return;
                            }
                            TraceTrainUI2.a(this.e, this.c, this.d, this.a);
                            return;
                        }
                        catch (JSONException jSONException) {
                            jSONException.printStackTrace();
                        }
                    }
                }
            };
            com.mobond.mindicator.ui.lt.trainutils.a.a(h2, a2, (Activity)this);
        }
        if (!bl) {
            this.a(d2, string5, bl);
        }
    }

    private void a(d d2, String string, boolean bl) {
        this.al = true;
        d2.x = this.ay;
        d2.z = bl;
        ArrayList<d> arrayList = f.b((Context)this.L());
        if (f.a(d2.s, (Context)this)) {
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                if (!((d)arrayList.get((int)i2)).s.equals((Object)this.L)) continue;
                arrayList.remove(i2);
                break;
            }
        }
        arrayList.add((Object)d2);
        f.a((Context)this.L(), arrayList);
        n.c((Context)this, string);
        this.startActivity(new Intent((Context)this, AddTrainActivity.class).putExtra("tntoscroll", d2.s));
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, Activity activity, String string, int n2) {
        traceTrainUI2.a(activity, string, n2);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        traceTrainUI2.a(onCheckedChangeListener);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, Spinner spinner, Spinner spinner2) {
        traceTrainUI2.a(spinner, spinner2);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, d d2, String string, String string2, String string3, String string4, String string5, boolean bl) {
        traceTrainUI2.a(d2, string, string2, string3, string4, string5, bl);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, d d2, String string, boolean bl) {
        traceTrainUI2.a(d2, string, bl);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, String string) {
        traceTrainUI2.f(string);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, String string, ProgressDialog progressDialog) {
        traceTrainUI2.a(string, progressDialog);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, String string, String string2) {
        traceTrainUI2.c(string, string2);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, String string, String string2, String string3) {
        traceTrainUI2.a(string, string2, string3);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, String string, String string2, String string3, boolean bl) {
        traceTrainUI2.a(string, string2, string3, bl);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, String string, boolean bl) {
        traceTrainUI2.a(string, bl);
    }

    static /* synthetic */ void a(TraceTrainUI2 traceTrainUI2, boolean bl) {
        traceTrainUI2.e(bl);
    }

    private void a(String string, int n2) {
        if (this.ac) {
            ((TextView)this.findViewById(2131296890)).setVisibility(0);
            ((TextView)this.findViewById(2131296890)).setText((CharSequence)string);
            ((TextView)this.findViewById(2131296890)).setBackgroundColor(n2);
            return;
        }
        ((TextView)this.findViewById(2131296890)).setVisibility(8);
    }

    private void a(String string, ProgressDialog progressDialog) {
        n.a((Dialog)progressDialog);
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getString("code").equals((Object)"400")) {
                n.d((Context)this.L(), jSONObject.getString("message"));
                return;
            }
            n.c((Context)this.L(), "Successfully Updated");
            this.P.q(this.Y.getText().toString());
            this.P.c(true);
            if (this.ae.equals((Object)"INSIDETRAIN")) {
                this.K.setChecked(true);
                return;
            }
            if (this.ae.equals((Object)"TRAINCANCEL")) {
                this.Q();
                return;
            }
            if (this.ae.equals((Object)"VOLUNTEER")) {
                this.a("Thank you for becoming volunteer", true);
                return;
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(String string, d d2) {
        String string2;
        String string3;
        block11 : {
            JSONObject jSONObject;
            block12 : {
                block10 : {
                    if (string == null || string.isEmpty()) return;
                    jSONObject = new JSONObject(string);
                    string3 = "Train Alert";
                    if (!this.as.e(d2.s).equals((Object)"hindi")) break block10;
                    this.ao = jSONObject.getString("hi_voice_msg");
                    string2 = jSONObject.getString("hi_disp_msg");
                    string3 = "\u091f\u094d\u0930\u0947\u0928 \u0938\u0942\u091a\u0928\u093e!";
                    break block11;
                }
                if (!this.as.e(d2.s).equals((Object)"english")) break block12;
                this.ao = jSONObject.getString("en_voice_msg");
                string2 = jSONObject.getString("en_disp_msg");
                string3 = "Train Alert!";
                break block11;
            }
            boolean bl = this.as.e(d2.s).equals((Object)"marathi");
            string2 = null;
            if (!bl) break block11;
            this.ao = jSONObject.getString("mr_voice_msg");
            string2 = jSONObject.getString("mr_disp_msg");
            string3 = "\u091f\u094d\u0930\u0947\u0928 \u0938\u0942\u091a\u0928\u093e!";
        }
        if (this.aw) {
            this.aw = false;
            this.o();
            if (this.au) {
                this.p();
            }
        }
        if (string2 == null) return;
        try {
            this.a(string3, string2, d2);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    private void a(String string, String string2, d d2) {
        d.a a2 = new d.a((Context)this);
        a2.a((CharSequence)string);
        a2.b((CharSequence)Html.fromHtml((String)string2));
        a2.a(true);
        a2.a((CharSequence)"SETTINGS", new DialogInterface.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.dismiss();
                Intent intent = new Intent((Context)TraceTrainUI2.a(this.a), AddTrainActivity.class);
                this.a.startActivity(intent);
            }
        });
        a2.b((CharSequence)"CLOSE", new DialogInterface.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.dismiss();
                if (TraceTrainUI2.b(this.a) != null && TraceTrainUI2.b(this.a).isSpeaking()) {
                    TraceTrainUI2.b(this.a).stop();
                }
            }
        });
        this.ar = a2.b();
        this.ar.show();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String string, String string2, String string3) {
        int n2;
        ArrayList arrayList;
        JSONArray jSONArray;
        ArrayList<d> arrayList2;
        block22 : {
            if (string3 == null) return;
            try {
                JSONObject jSONObject = new JSONObject(string3);
                if (jSONObject.getString("code").equals((Object)"400")) {
                    n.d((Context)this.L(), jSONObject.getString("message"));
                    return;
                }
                if (jSONObject.getBoolean("isuserregistered")) {
                    GoogleLoginActivity.c((Context)this.L());
                    this.P.t(jSONObject.getString("displayname"));
                    this.P.q(jSONObject.getString("mobile"));
                    this.P.r(jSONObject.optString("access"));
                    this.P.c(jSONObject.optBoolean("isverified"));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("isverified : ");
                    stringBuilder.append(jSONObject.optBoolean("isverified"));
                    Log.d((String)"99999", (String)stringBuilder.toString());
                    if (!this.ae.equals((Object)"TRAINCANCEL") && !this.ae.equals((Object)"INSIDETRAIN")) {
                        if (!jSONObject.optBoolean("isverified")) {
                            this.K();
                        } else {
                            n.c((Context)this.L(), "Successfully Login");
                            if (this.ae.equals((Object)"VOLUNTEER")) {
                                this.a("Thank you for becoming volunteer", true);
                            }
                        }
                    } else if (this.ae.equals((Object)"INSIDETRAIN")) {
                        this.K.setChecked(true);
                    } else if (this.ae.equals((Object)"TRAINCANCEL")) {
                        this.Q();
                    }
                    if (!jSONObject.has("trains")) return;
                    arrayList = new ArrayList();
                    arrayList2 = f.b((Context)this.L());
                    jSONArray = jSONObject.getJSONArray("trains");
                    n2 = 0;
                    break block22;
                }
                if (!this.ae.equals((Object)"TRAINCANCEL") && !this.ae.equals((Object)"INSIDETRAIN")) {
                    this.a(false, false);
                    return;
                }
                this.a(false, false);
                return;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                return;
            }
        }
        do {
            block25 : {
                boolean bl;
                d d2;
                String string4;
                block24 : {
                    block23 : {
                        if (n2 >= jSONArray.length()) break block23;
                        JSONObject jSONObject = jSONArray.getJSONObject(n2);
                        string4 = jSONObject.getString("tn");
                        String string5 = jSONObject.getString("src");
                        String string6 = jSONObject.getString("dest");
                        bl = jSONObject.optBoolean("isvol", false);
                        d2 = f.b(string4, (Context)this.L());
                        if (d2 != null) break block24;
                        d d3 = f.a(string4, string5, string6, (Context)this.L());
                        if (d3 != null) {
                            d3.z = bl;
                            arrayList.add((Object)d3);
                        }
                        break block25;
                    }
                    if (arrayList.size() == 0) return;
                    {
                        arrayList2.addAll((Collection)arrayList);
                        f.a((Context)this.L(), arrayList2);
                        return;
                    }
                }
                int n3 = 0;
                do {
                    block27 : {
                        block26 : {
                            if (n3 >= arrayList2.size()) break block26;
                            if (!((d)arrayList2.get((int)n3)).s.equals((Object)string4)) break block27;
                            arrayList2.remove(n3);
                        }
                        d2.z = bl;
                        arrayList.add((Object)d2);
                        break;
                    }
                    ++n3;
                } while (true);
            }
            ++n2;
        } while (true);
    }

    private void a(String string, String string2, String string3, String string4, boolean bl) {
        this.a(this.L());
        ProgressDialog progressDialog = new ProgressDialog((Context)this.L());
        progressDialog.setMessage((CharSequence)"Saving..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        String string5 = this.P.H();
        com.mulo.b.a a2 = new com.mulo.b.a(this, progressDialog, string2, string3, bl){
            final /* synthetic */ ProgressDialog a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ boolean d;
            final /* synthetic */ TraceTrainUI2 e;
            {
                this.e = traceTrainUI2;
                this.a = progressDialog;
                this.b = string;
                this.c = string2;
                this.d = bl;
            }

            public void a() {
                n.a((Dialog)this.a);
            }

            public void a(byte[] arrby, byte[] arrby2, Object object) {
                n.a((Dialog)this.a);
                String string = new String(arrby);
                TraceTrainUI2.a(this.e, string, this.b, this.c, this.d);
            }
        };
        com.mobond.mindicator.ui.lt.trainutils.a.a(string, string2, string3, string4, bl, string5, a2, this.L());
    }

    private void a(String string, String string2, String string3, boolean bl) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getString("code").equals((Object)"400")) {
                n.d((Context)this.L(), jSONObject.getString("message"));
                return;
            }
            n.c((Context)this.L(), jSONObject.getString("message"));
            GoogleLoginActivity.c((Context)this.L());
            this.P.q(string2);
            this.P.t(string3);
            this.P.c(bl);
            if (this.ae.equals((Object)"INSIDETRAIN")) {
                this.K.setChecked(true);
                return;
            }
            if (this.ae.equals((Object)"TRAINCANCEL")) {
                this.Q();
                return;
            }
            if (this.ae.equals((Object)"VOLUNTEER")) {
                this.a("Thank you for becoming volunteer", true);
                return;
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    private void a(String string, boolean bl) {
        if (f.a(this.L, (Context)this) && bl) {
            String[] arrstring;
            d d2 = f.b(this.L, (Context)this);
            String string2 = d2.v.split("-")[0].trim();
            String string3 = d2.v.split("-")[1].trim();
            String string4 = "";
            String string5 = "";
            for (int i2 = 0; i2 < (arrstring = this.h).length; ++i2) {
                String string6 = arrstring[i2].split("#")[0];
                String string7 = this.h[i2].split("#")[1];
                String string8 = this.h[i2].split("#")[2];
                if (string2.equals((Object)string8)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string6);
                    stringBuilder.append(" ");
                    stringBuilder.append(string7);
                    string5 = stringBuilder.toString();
                }
                if (!string3.equals((Object)string8)) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string6);
                stringBuilder.append(" ");
                stringBuilder.append(string7);
                string4 = stringBuilder.toString();
            }
            this.a(d2, string2, string5, string3, string4, "Thank you for becoming volunteer", bl);
            return;
        }
        Dialog dialog = new Dialog((Context)this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131492936);
        dialog.getWindow().setLayout(-1, -2);
        dialog.show();
        TextView textView = (TextView)dialog.findViewById(2131297631);
        TextView textView2 = (TextView)dialog.findViewById(2131296437);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Train : ");
        stringBuilder.append(this.L);
        stringBuilder.append("  ");
        stringBuilder.append(this.h[0].split("#")[2]);
        stringBuilder.append(" - ");
        String[] arrstring = this.h;
        stringBuilder.append(arrstring[arrstring.length - 1].split("#")[2]);
        textView.setText((CharSequence)stringBuilder.toString());
        Spinner spinner = (Spinner)dialog.findViewById(2131297405);
        Spinner spinner2 = (Spinner)dialog.findViewById(2131297404);
        this.a(spinner);
        this.b(spinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(this, spinner, spinner2){
            final /* synthetic */ Spinner a;
            final /* synthetic */ Spinner b;
            final /* synthetic */ TraceTrainUI2 c;
            {
                this.c = traceTrainUI2;
                this.a = spinner;
                this.b = spinner2;
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int n2, long l2) {
                TraceTrainUI2.a(this.c, this.a, this.b);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this, spinner, spinner2, dialog, string, bl){
            final /* synthetic */ Spinner a;
            final /* synthetic */ Spinner b;
            final /* synthetic */ Dialog c;
            final /* synthetic */ String d;
            final /* synthetic */ boolean e;
            final /* synthetic */ TraceTrainUI2 f;
            {
                this.f = traceTrainUI2;
                this.a = spinner;
                this.b = spinner2;
                this.c = dialog;
                this.d = string;
                this.e = bl;
            }

            public void onClick(View view) {
                TraceTrainUI2 traceTrainUI2 = this.f;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.a.getSelectedItem());
                stringBuilder.append("");
                String string = stringBuilder.toString();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.b.getSelectedItem());
                stringBuilder2.append("");
                if (TraceTrainUI2.b(traceTrainUI2, string, stringBuilder2.toString())) {
                    this.c.dismiss();
                    String string2 = this.a.getSelectedItem().toString().split(" ")[0];
                    String string3 = this.a.getSelectedItem().toString().split(" ")[1];
                    String string4 = this.a.getSelectedItem().toString();
                    String string5 = string4.substring(string4.indexOf(string3) + string3.length()).trim();
                    String string6 = this.b.getSelectedItem().toString().split(" ")[0];
                    String string7 = this.b.getSelectedItem().toString().split(" ")[1];
                    String string8 = this.b.getSelectedItem().toString();
                    String string9 = string8.substring(string8.indexOf(string7) + string7.length()).trim();
                    if (this.f.aF == null) {
                        TraceTrainUI2 traceTrainUI22 = this.f;
                        traceTrainUI22.aF = f.a(traceTrainUI22.L, string5, string9, (Context)this.f);
                    } else {
                        d d2 = this.f.aF;
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(string5);
                        stringBuilder3.append(" - ");
                        stringBuilder3.append(string9);
                        d2.v = stringBuilder3.toString();
                        this.f.aF.w = this.f.d;
                    }
                    TraceTrainUI2 traceTrainUI23 = this.f;
                    d d3 = traceTrainUI23.aF;
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(string2);
                    stringBuilder4.append(" ");
                    stringBuilder4.append(string3);
                    String string10 = stringBuilder4.toString();
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append(string6);
                    stringBuilder5.append(" ");
                    stringBuilder5.append(string7);
                    TraceTrainUI2.a(traceTrainUI23, d3, string5, string10, string9, stringBuilder5.toString(), this.d, this.e);
                }
            }
        };
        textView2.setOnClickListener(onClickListener);
    }

    private void a(ArrayList<String> arrayList, com.mobond.mindicator.ui.lt.a.a a2, int n2) {
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            String string = (String)arrayList.get(i2);
            if (a2.b.equals((Object)string)) {
                if (a2.c.equals((Object)"0")) {
                    ArrayList<String> arrayList2 = this.l;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append("#NOSTOP#LIVEPOS#");
                    arrayList2.add((Object)stringBuilder.toString());
                    this.aR = n2 + i2;
                    continue;
                }
                ArrayList<String> arrayList3 = this.l;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("#NOSTOP#");
                arrayList3.add((Object)stringBuilder.toString());
                this.l.add((Object)"#LIVEPOS#");
                this.aR = 1 + (n2 + i2);
                continue;
            }
            ArrayList<String> arrayList4 = this.l;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("#NOSTOP#");
            arrayList4.add((Object)stringBuilder.toString());
        }
    }

    static /* synthetic */ TextToSpeech b(TraceTrainUI2 traceTrainUI2) {
        return traceTrainUI2.aT;
    }

    private void b(Spinner spinner) {
        String[] arrstring;
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"- Select Destination -");
        for (int i2 = 1; i2 < (arrstring = this.h).length; ++i2) {
            String string = arrstring[i2].split("#")[0];
            String string2 = this.h[i2].split("#")[1];
            String string3 = this.h[i2].split("#")[2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            arrayList.add((Object)stringBuilder.toString());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (List)arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter)arrayAdapter);
    }

    static /* synthetic */ void b(TraceTrainUI2 traceTrainUI2, String string, boolean bl) {
        traceTrainUI2.b(string, bl);
    }

    private void b(String string, boolean bl) {
        Dialog dialog = this.aA;
        if (dialog != null && dialog.isShowing()) {
            this.aA.dismiss();
        }
        if (string.equals((Object)this.ag)) {
            String string2 = this.aU;
            String string3 = this.Y.getText().toString();
            String string4 = this.aV;
            this.a(string2, string3, string4, string4, bl);
            return;
        }
        if (string.equals((Object)this.ah)) {
            this.d(bl);
        }
    }

    static /* synthetic */ boolean b(TraceTrainUI2 traceTrainUI2, String string, String string2) {
        return traceTrainUI2.b(string, string2);
    }

    private boolean b(String string, String string2) {
        if (string2 != null && !string2.equals((Object)"- Select Destination -")) {
            String[] arrstring;
            int n2 = -1;
            int n3 = -1;
            for (int i2 = 0; i2 < (arrstring = this.h).length; ++i2) {
                String string3 = arrstring[i2].split("#")[0];
                String string4 = this.h[i2].split("#")[1];
                String string5 = this.h[i2].split("#")[2];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(" ");
                stringBuilder.append(string4);
                stringBuilder.append(" ");
                stringBuilder.append(string5);
                String string6 = stringBuilder.toString();
                if (string6.equals((Object)string)) {
                    n3 = i2;
                }
                if (!string6.equals((Object)string2)) continue;
                n2 = i2;
            }
            if (n2 > n3) {
                return true;
            }
            if (n3 == n2) {
                n.d((Context)this, "Source and Destination cannot be same");
                return false;
            }
            n.d((Context)this, "Please select valid source and destination");
            return false;
        }
        n.d((Context)this, "Please select destination");
        return false;
    }

    static /* synthetic */ int c(TraceTrainUI2 traceTrainUI2) {
        return traceTrainUI2.aJ;
    }

    private void c(String string, String string2) {
        com.mobond.mindicator.util.b b2 = this.az;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+91");
        stringBuilder.append(string);
        b2.a(stringBuilder.toString(), this, string2);
    }

    static /* synthetic */ boolean c(TraceTrainUI2 traceTrainUI2, String string) {
        return traceTrainUI2.j(string);
    }

    static /* synthetic */ Toolbar d(TraceTrainUI2 traceTrainUI2) {
        return traceTrainUI2.aK;
    }

    public static String d(String string) {
        try {
            String string2 = string.replaceAll(" ", "").replaceAll("[^0-9]", "");
            String string3 = string2.substring(-10 + string2.length());
            return string3;
        }
        catch (Exception exception) {
            return "";
        }
    }

    static /* synthetic */ void d(TraceTrainUI2 traceTrainUI2, String string) {
        traceTrainUI2.l(string);
    }

    static /* synthetic */ BottomSheetBehavior e(TraceTrainUI2 traceTrainUI2) {
        return traceTrainUI2.aW;
    }

    private void e(boolean bl) {
        Dialog dialog = new Dialog((Context)this.L());
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131493061);
        dialog.getWindow().setLayout(-1, -2);
        dialog.show();
        if (bl && this.P.N() && f.c(this.L, (Context)this)) {
            dialog.findViewById(2131296443).setVisibility(8);
            dialog.findViewById(2131297604).setVisibility(0);
        }
        dialog.findViewById(2131296443).setOnClickListener(new View.OnClickListener(this, dialog, bl){
            final /* synthetic */ Dialog a;
            final /* synthetic */ boolean b;
            final /* synthetic */ TraceTrainUI2 c;
            {
                this.c = traceTrainUI2;
                this.a = dialog;
                this.b = bl;
            }

            public void onClick(View view) {
                TraceTrainUI2.a((Context)this.c, "VOLUNTEER");
                if (com.mulo.b.c.a((Context)TraceTrainUI2.a(this.c))) {
                    n.a(this.a);
                    if (this.b && this.c.P.N()) {
                        TraceTrainUI2.a(this.c, "Thank you for becoming volunteer", true);
                        return;
                    }
                    TraceTrainUI2 traceTrainUI2 = this.c;
                    traceTrainUI2.ae = "VOLUNTEER";
                    traceTrainUI2.l();
                    return;
                }
                n.d((Context)TraceTrainUI2.a(this.c), TraceTrainUI2.a(this.c).getResources().getString(2131755095));
            }
        });
        dialog.findViewById(2131297611).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(View view) {
                AddTrainActivity.a((Context)TraceTrainUI2.a(this.a), "vNxAv73uzTk");
            }
        });
    }

    static /* synthetic */ void f(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.w();
    }

    private void f(String string) {
        if (this.an && string != null) {
            this.aT.setPitch(1.0f);
            this.aT.setSpeechRate(0.8f);
            this.aT.speak(string, 0, null);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private String g(String var1_1) {
        block20 : {
            block16 : {
                block17 : {
                    block18 : {
                        block19 : {
                            var2_2 = var1_1.hashCode();
                            if (var2_2 == 67) break block16;
                            if (var2_2 == 72) break block17;
                            if (var2_2 == 80) break block18;
                            if (var2_2 == 87) break block19;
                            switch (var2_2) {
                                default: {
                                    ** GOTO lbl-1000
                                }
                                case 85: {
                                    if (var1_1.equals((Object)"U")) {
                                        var3_3 = 4;
                                        ** break;
                                    }
                                    ** GOTO lbl-1000
                                }
                                case 84: {
                                    if (var1_1.equals((Object)"T")) {
                                        var3_3 = 3;
                                        ** break;
                                    }
                                    ** GOTO lbl-1000
lbl19: // 2 sources:
                                    break;
                                }
                            }
                            break block20;
                        }
                        if (!var1_1.equals((Object)"W")) ** GOTO lbl-1000
                        var3_3 = 0;
                        break block20;
                    }
                    if (!var1_1.equals((Object)"P")) ** GOTO lbl-1000
                    var3_3 = 5;
                    break block20;
                }
                if (!var1_1.equals((Object)"H")) ** GOTO lbl-1000
                var3_3 = 2;
                break block20;
            }
            if (var1_1.equals((Object)"C")) {
                var3_3 = 1;
            } else lbl-1000: // 7 sources:
            {
                var3_3 = -1;
            }
        }
        switch (var3_3) {
            default: {
                return null;
            }
            case 5: {
                return "PUNE CHAT";
            }
            case 4: {
                return com.mobond.mindicator.ui.multicity.a.a[4];
            }
            case 3: {
                return com.mobond.mindicator.ui.multicity.a.a[3];
            }
            case 2: {
                return com.mobond.mindicator.ui.multicity.a.a[2];
            }
            case 1: {
                return com.mobond.mindicator.ui.multicity.a.a[1];
            }
            case 0: 
        }
        return com.mobond.mindicator.ui.multicity.a.a[0];
    }

    static /* synthetic */ void g(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.Q();
    }

    private static String h(String string) {
        return new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(new SimpleDateFormat("hh:mma", Locale.ENGLISH).parse(string.trim()));
    }

    static /* synthetic */ void h(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.O();
    }

    static /* synthetic */ void i(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.v();
    }

    private void i(String string) {
        f.a((Context)this, string);
    }

    static /* synthetic */ void j(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.E();
    }

    private boolean j(String string) {
        if (string.isEmpty()) {
            n.d((Context)this.L(), "Please enter mobile number");
            return false;
        }
        if (string.length() != 10) {
            n.d((Context)this.L(), "Please enter valid mobile number");
            return false;
        }
        if (!string.contains((CharSequence)"+") && !string.contains((CharSequence)"-")) {
            return true;
        }
        n.d((Context)this.L(), "Please enter valid mobile number");
        return false;
    }

    static /* synthetic */ void k(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.D();
    }

    private void k(String string) {
        d.a a2 = new d.a((Context)this);
        a2.a((CharSequence)"Oops..");
        a2.b((CharSequence)string).a(true).a((CharSequence)"OK", new DialogInterface.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        a2.b().show();
    }

    private void l(String string) {
        this.az.a(string);
    }

    private void n() {
        this.getWindow().addFlags(6815872);
        PowerManager.WakeLock wakeLock = ((PowerManager)this.getSystemService("power")).newWakeLock(268435466, "androidtest:mywakelock");
        wakeLock.acquire(15000L);
        wakeLock.release();
    }

    private void o() {
        if (this.aT == null) {
            this.aT = new TextToSpeech((Context)this, new TextToSpeech.OnInitListener(this){
                final /* synthetic */ TraceTrainUI2 a;
                {
                    this.a = traceTrainUI2;
                }

                public void onInit(int n2) {
                    TraceTrainUI2 traceTrainUI2;
                    if (n2 == 0) {
                        int n3 = -1;
                        if (this.a.ax.equals((Object)"english")) {
                            Locale locale = new Locale("en", "IN");
                            n3 = TraceTrainUI2.b(this.a).isLanguageAvailable(locale) == 0 ? TraceTrainUI2.b(this.a).setLanguage(locale) : TraceTrainUI2.b(this.a).setLanguage(Locale.ENGLISH);
                        } else if ((this.a.ax.equals((Object)"hindi") || this.a.ax.equals((Object)"marathi")) && Build.VERSION.SDK_INT >= 21) {
                            n3 = TraceTrainUI2.b(this.a).setLanguage(Locale.forLanguageTag((String)"hin"));
                        }
                        if (n3 == 0) {
                            this.a.an = true;
                        }
                    }
                    if (!(traceTrainUI2 = this.a).a((Context)traceTrainUI2)) {
                        if (this.a.av && this.a.at) {
                            this.a.a(true);
                            return;
                        }
                        if (this.a.av) {
                            TraceTrainUI2 traceTrainUI22 = this.a;
                            TraceTrainUI2.a(traceTrainUI22, traceTrainUI22.ao);
                            return;
                        }
                        if (this.a.at) {
                            this.a.a(false);
                        }
                    }
                }
            });
        }
    }

    static /* synthetic */ void o(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.q();
    }

    private void p() {
        long[] arrl = new long[]{500L, 1000L};
        if (this.aq.hasVibrator()) {
            this.aq.vibrate(arrl, -1);
        }
    }

    private void q() {
        if (this.B.b()) {
            String string;
            if (this.B.h) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.B.d);
                stringBuilder.append(", ");
                stringBuilder.append(e.a(this.B.e));
                string = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.B.d);
                stringBuilder.append(", ");
                stringBuilder.append(e.a(this.B.e));
                stringBuilder.append(" (Less Accurate)");
                string = stringBuilder.toString();
            }
            this.a(string, this.getResources().getColor(2131099781));
            return;
        }
        if (this.B.d != null && this.B.d.contains((CharSequence)"Cancelled")) {
            this.a(this.B.d, this.getResources().getColor(2131100265));
            return;
        }
        if (!com.mulo.b.c.a((Context)this) && !this.K.isChecked() && this.ac) {
            this.r();
            return;
        }
        this.s();
    }

    private void r() {
        this.a("Turn on internet to get live train status", this.getResources().getColor(2131100265));
    }

    private void s() {
        ((TextView)this.findViewById(2131296890)).setVisibility(8);
    }

    private void t() {
        int n2;
        block4 : {
            for (n2 = 0; n2 < this.l.size(); ++n2) {
                if (!((String)this.l.get(n2)).contains((CharSequence)this.a)) {
                    continue;
                }
                break block4;
            }
            n2 = -1;
        }
        if (n2 != -1) {
            this.n = true;
            int n3 = n2 - 2;
            int n4 = n3 < 0 ? 0 : n3;
            this.m = n2;
            this.u();
            if (this.Q) {
                this.c(n4);
            }
        }
    }

    static /* synthetic */ void t(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.s();
    }

    private void u() {
        ((e)this.v.getExpandableListAdapter()).b(this.m);
    }

    static /* synthetic */ void u(TraceTrainUI2 traceTrainUI2) {
        traceTrainUI2.P();
    }

    private void v() {
        if (this.k && this.p == null) {
            this.p = c.a((Activity)this, this.findViewById(2131296343), this.q, this.r, this.s, this.t, 3, this, "/79488325/dfpnativeadunit_tracetrain");
        }
    }

    private void w() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ConfigurationManager.b((Context)this));
        stringBuilder.append("_");
        stringBuilder.append("alerts_content");
        String string = stringBuilder.toString();
        String string2 = this.g(this.d);
        this.findViewById(2131296516).setOnClickListener(new View.OnClickListener(this, string2, string){
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ TraceTrainUI2 c;
            {
                this.c = traceTrainUI2;
                this.a = string;
                this.b = string2;
            }

            public void onClick(View view) {
                if (this.a == null) {
                    com.mobond.mindicator.ui.multicity.a.a((Activity)this.c, this.b);
                    return;
                }
                TraceTrainUI2.e(this.c).b(5);
                com.mobond.mindicator.ui.train.TrainsAtStationUI.a((Activity)this.c, this.a, "", this.b);
            }
        });
        this.findViewById(2131297568).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(View view) {
                TraceTrainUI2.e(this.a).b(5);
                TraceTrainUI2.g(this.a);
            }
        });
        this.findViewById(2131296718).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(View view) {
                TraceTrainUI2.e(this.a).b(5);
                this.a.c("Error");
            }
        });
        this.findViewById(2131296602).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(View view) {
                TraceTrainUI2.e(this.a).b(5);
                TraceTrainUI2.h(this.a);
            }
        });
        if (this.al) {
            this.findViewById(2131296952).setVisibility(8);
        }
        this.findViewById(2131297608).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(View view) {
                TraceTrainUI2.e(this.a).b(5);
            }
        });
    }

    private void x() {
        String string = this.g.contains((CharSequence)"delhi") ? "Adarsh Nagar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nAIIMS,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nAkshardham,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nAnand Vihar ISBT,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nArjangarh,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nAshok Park Main,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nAzadpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nBadarpur,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nBadkal Mor,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nBarakhamba Road,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nBata Chowk,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nBelvedere Towers,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nBotanical Garden,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nCentral Secretariate,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,Huda City Centre:DOWN:DL_YELLOW,Huda City Centre:UP:DL_YELLOW\nChandni Chowk,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nChawri Bazar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nChhattarpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nCivil Lines,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nCyber City,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nDelhi Aero City,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nDhaula Kuan,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nDilshad Garden,Rithala:UP:DL_RED,,,\nDwarka,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 10,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 11,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 12,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 13,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 14,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 21,Vaishali/Noida City Centre:DOWN:DL_BLUE,New Delhi:UP:DL_ORANGE,,\nDwarka Sector 8,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 9,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwraka Mor,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nEscorts Mujesar,ITO:UP:DL_VIOLET,,,\nGTB Nagar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nGhitorni,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nGolf Course,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nGovind Puri,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nGreen Park,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nGuru Dronacharya,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nHaiderpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nHauz Khas,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nHuda City Centre,Samaypur Badli:UP:DL_YELLOW,,,\nIGI Airport,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nIFFCO Chowk,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nINA,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nInderlok,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED\nIndraprastha,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nITO,Escorts Mujesar:DOWN:DL_VIOLET,,,\nJahangir Puri,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nJanakpuri East,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nJanakpuri West,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nJangpura,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJanpath,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJasola Appllo,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJhandewalan,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nJhilmil,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nJLN Stadium,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJor Bagh,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nKailash Colony,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nKalkaji Mandir,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nKanhaiya Nagar,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nKarkarduma,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nKarol Bagh,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nKashmere Gate,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,Huda City Centre:DOWN:DL_YELLOW,Huda City Centre:UP:DL_YELLOW\nKaushabi,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nKeshav Puram,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nKhan Market,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nKirti Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,Mundka:UP:DL_GREEN,\nKohat Enclave,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nLajpat Nagar,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nLaxmi Nagar,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nM G Road,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nMadipur,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nMalviya Nagar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nMandi House,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET\nMansarovar Park,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nMayur Vihar,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nMayur Vihar Extension,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nMewala Maharajpur,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nModel Town,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nMohan Estate,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nMoolchand,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nMoti Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nMoulsari Avenue,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nMundka,Kirti Nagar:DOWN:DL_GREEN,,,\nNangloi,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nNangloi Railway Station,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nNawada,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNeelam Chowk,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nNehru Place,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nNetaji Subhash Place,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nNew Ashok Nagar,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNew Delhi,Dwarka Sector 21:DOWN:DL_ORANGE,Samaypur Badli:UP:DL_YELLOW,Huda City Centre:DOWN:DL_YELLOW,\nNHPC Chowk,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nNirman Vihar,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida City Centre,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida Sector 15,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida Sector 16,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida Sector 18,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nOkhla,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nOld Faridabad,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nPashchim Vihar East,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nPashchim Vihar West,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nPatel Chowk,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nPatel Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nPeeragarhi,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nPhase 2,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nPhase 3,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nPitampura,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nPragati Maidan,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nPratap Nagar,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nPreet Vihar,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nPulbangash,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nPunjabi Bagh,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nQutub Minar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nRace Course,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nRajdhani Park,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nRajendra Place,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRajiv Chowk,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,Huda City Centre:DOWN:DL_YELLOW,Huda City Centre:UP:DL_YELLOW\nRajouri Garden,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRamesh Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRamkrishna Ashram Marg,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRithala,Dilshad Garden:DOWN:DL_RED,,,\nRohini East,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nRohini Sector 18,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nRohini West,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nSaket,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nSamaypur Badli,Huda City Centre:DOWN:DL_YELLOW,,,\nSarai,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nSarita Vihar,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nSatguru Ram Sigh Marg,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nSector 28,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nSeelampur,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShadipur,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nShahdara,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShastri Nagar,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShastri Park,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShivaji Park,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nShivaji Stadium,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nSikanderpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nSikanderpur Down,Sikanderpur Up:UP:DL_RAPID,,,\nSikanderpur Up,Sikanderpur Down:DOWN:DL_RAPID,,,\nSubhash Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nSultanpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nSurajmal Stadium,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nTagore Garden,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nTilak Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nTis Hazari,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nTughlakabad,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nUdyog Bhavan,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nUdyog Nagar,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nUttam Nagar East,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nUttam Nagar West,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nVaishali,Dwarka Sector 21:UP:DL_BLUE,,,\nVidhan Sabha,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nVishwavidyalaya,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nWelcome,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nYamuna Bank,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,," : "Airoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nAman Lodge,Matheran:UP:NM,Neral:DOWN:NM,,,,\nAmbernath,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nAmbivli,CSMT:UP:C,Kasara:DOWN:C,,,,\nAndheri,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nApta,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nAsangaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nAtgaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nBadlapur,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBamandongri,Kharkopar:DOWN:U,Nerul/Belapur CBD:UP:U,,,,\nBandra,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nBelapur CBD,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nBhandup,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nBhayander,Churchgate:UP:W,Virar:DOWN:W,,,,\nBhivpuri Road,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBhiwandi Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nBoisar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nBorivali,Churchgate:UP:W,Virar/Dahanu:DOWN:W,,,,\nByculla,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nCSMT,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCharni Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nChembur,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChinchpokli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nChunabhatti,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChurchgate,Borivali/Virar/Dahanu:DOWN:W,,,,,\nCotton Green,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCurrey Road,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nDadar,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,\nDahanu Road,Churchgate/Virar:UP:W,Panvel:DOWN:DVP,,,,\nDahisar,Churchgate:UP:W,Virar:DOWN:W,,,,\nDativali,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nDiva Jn,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Roha:UP:DPR,Vasai Road:UP:DVP,,\nDockyard Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nDolavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nDombivli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Virar/Boisar:UP:DVP,,,\nGTB Nagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGhansoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nGhatkopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nGoregaon,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,,,\nGovandi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGrant Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nHamarapur,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJite,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJogeshwari,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nJuchandra Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nJuinagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nJumapatti,Matheran:UP:NM,Neral:DOWN:NM,,,,\nKalamboli,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nKalva,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKalyan,CSMT:UP:C,Khopoli/Kasara:DOWN:C,,,,\nKaman Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKandivali,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nKanjur Marg,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKarjat,CSMT:UP:C,Khopoli:DOWN:C,,,,\nKasara,CSMT:UP:C,,,,,\nKasu,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nKelavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nKelva Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nKhadavli,CSMT:UP:C,Kasara:DOWN:C,,,,\nKhandeshwar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKhar Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nKharbao,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKhardi,CSMT:UP:C,Kasara:DOWN:C,,,,\nKharghar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKharkopar,Nerul/Belapur CBD:UP:U,,,,,\nKhopoli,CSMT/Karjat:UP:C,,,,,\nKings Circle,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,,,\nKopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vasai/Dahanu:UP:DVP,Panvel:DOWN:DVP,,\nKoparkhairne,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nKurla,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel:DOWN:H,Andheri:UP:H,\nLower Parel,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nLowjee,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nMahalakshmi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMahim Jn,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nMalad,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nManasarovar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nMankhurd,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nMarine Lines,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMasjid,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nMatheran,Aman Lodge:DOWN:NM,Neral:DOWN:NM,,,,\nMatunga,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMatunga Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMira Road,Churchgate:UP:W,Virar:DOWN:W,,,,\nMulund,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMumbai Central,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,,,,\nMumbra,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNagothane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNahur,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNaigaon,Churchgate:UP:W,Virar:DOWN:W,,,,\nNalla Sopara,Churchgate:UP:W,Virar:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nNavade Road,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nNeral,CSMT:UP:C,Karjat/Khopoli:DOWN:C,Matheran:UP:NM,,,\nNerul,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nNidi,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNilje,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nUmbermali,CSMT:UP:C,Kasara:DOWN:C,,,,\nPalasdhari,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nPalghar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nPanvel,CSMT:UP:H,Andheri:UP:H,Thane:UP:T,Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP\nParel,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nPen,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nPrabhadevi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nRabale,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nRam Mandir,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nRasayani,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nReay Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nRoha,Panvel/Diva:DOWN:DPR,,,,,\nSandhurst Road,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nSanpada,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nSanta Cruz,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nSaphale,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nSeawood Darave,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nSewri,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nShahad,CSMT:UP:C,Kasara:DOWN:C,,,,\nShelu,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nSion,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nSomtane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nTaloja Panchanand,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nThakurli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nThane,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vashi/Nerul/Panvel:DOWN:T,,,\nThansit,CSMT:UP:C,Kasara:DOWN:C,,,,\nTilaknagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nTitwala,CSMT:UP:C,Kasara:DOWN:C,,,,\nTurbhe,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nUlhas Nagar,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nUmroli Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVadala Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nVaitarana,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVangani,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nVangaon,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVasai Road,Churchgate:UP:W,Virar/Dahanu:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nVashi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nVasind,CSMT:UP:C,Kasara:DOWN:C,,,,\nVidyavihar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVikhroli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVile Parle,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nVirar,Churchgate:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVithalwadi,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nWaterpipe,Matheran:UP:NM,Neral:DOWN:NM,,,,\nPune,Lonavla:DOWN:P,,,,,\nShivaji Nagar,Pune:UP:P,Lonavla:DOWN:P,,,,\nKhadki,Pune:UP:P,Lonavla:DOWN:P,,,,\nDapodi,Pune:UP:P,Lonavla:DOWN:P,,,,\nKasarwadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nPimpri,Pune:UP:P,Lonavla:DOWN:P,,,,\nChinchwad,Pune:UP:P,Lonavla:DOWN:P,,,,\nAkurdi,Pune:UP:P,Lonavla:DOWN:P,,,,\nDehu Road,Pune:UP:P,Lonavla:DOWN:P,,,,\nBegdewadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nGhorawadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nTalegaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nVadgaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nKanhe,Pune:UP:P,Lonavla:DOWN:P,,,,\nKamshet,Pune:UP:P,Lonavla:DOWN:P,,,,\nMalavli,Pune:UP:P,Lonavla:DOWN:P,,,,\nLonavla,Pune:UP:P,,,,,";
        this.i.clear();
        if (this.j == null) {
            this.j = com.mulo.a.d.b.a(this, "local/sdr");
        }
        String[] arrstring = string.split("\n");
        Iterator iterator = this.l.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            String string2 = ((String)iterator.next()).split("#", -1)[2];
            int n3 = arrstring.length;
            int n4 = n2;
            for (int i2 = 0; i2 < n3; ++i2) {
                String[] arrstring2 = arrstring[i2].split(",");
                String string3 = arrstring2[0];
                if (!string2.equalsIgnoreCase(string3)) continue;
                com.mobond.mindicator.ui.train.c c2 = new com.mobond.mindicator.ui.train.c(string3);
                String string4 = string3.toUpperCase();
                if (this.j.contains((Object)string4)) {
                    c2.a.add((Object)"Destination");
                }
                for (int i3 = 0; i3 < arrstring2.length; ++i3) {
                    if (i3 == 0) continue;
                    c2.a.add((Object)arrstring2[i3]);
                }
                c2.a.add((Object)"Station Map");
                SparseArray<com.mobond.mindicator.ui.train.c> sparseArray = this.i;
                int n5 = n4 + 1;
                sparseArray.append(n4, (Object)c2);
                n4 = n5;
            }
            n2 = n4;
        }
        e e2 = new e((Activity)this, this.l, this.B, this.i, this.m, this.o, false);
        this.v.setAdapter((ExpandableListAdapter)e2);
    }

    private void y() {
        this.aS = new ServiceConnection(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onServiceConnected(android.content.ComponentName componentName, IBinder iBinder) {
                TraceTrainUI2 traceTrainUI2 = this.a;
                traceTrainUI2.ad = false;
                traceTrainUI2.H = ((com.mobond.mindicator.ui.lt.trainutils.InsideLocalTrainService$a)iBinder).a();
                TraceTrainUI2.a(this.a, null);
                if (this.a.H.a((Context)this.a)) {
                    if (this.a.H.a.equals((Object)this.a.L)) {
                        this.a.K.setChecked(true);
                        this.a.N.c();
                        TraceTrainUI2.k(this.a);
                        this.a.k();
                        if (this.a.H.u != null) {
                            com.mobond.mindicator.ui.lt.a.a a2 = this.a.H.u;
                            this.a.a(a2);
                        }
                        if (this.a.U == null) {
                            TraceTrainUI2 traceTrainUI22 = this.a;
                            traceTrainUI22.U = traceTrainUI22.H.g.split("-")[1].trim();
                        } else {
                            this.a.H.a(this.a.U);
                        }
                        TraceTrainUI2.l(this.a);
                    } else {
                        this.a.ad = true;
                    }
                } else {
                    if (this.a.ak && com.mobond.mindicator.a.a.a((Context)this.a)) {
                        this.a.K.setChecked(true);
                        this.a.i();
                    } else if (this.a.K.isChecked()) {
                        TraceTrainUI2.m(this.a);
                    }
                    if (this.a.a != null && this.a.a.equals((Object)com.mobond.mindicator.ui.lt.trainutils.a.a.a)) {
                        Animation animation = android.view.animation.AnimationUtils.loadAnimation((Context)this.a, (int)2130771981);
                        this.a.J.setVisibility(0);
                        this.a.J.setAnimation(animation);
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener(this){
                    final /* synthetic */ 17 a;
                    {
                        this.a = var1_1;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("isChecked : ");
                        stringBuilder.append(bl);
                        Log.d((String)"00000", (String)stringBuilder.toString());
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("IS PERMISSION GRANTED : ");
                        stringBuilder2.append(com.mobond.mindicator.h.a((Context)this.a.a, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}));
                        Log.d((String)"00000", (String)stringBuilder2.toString());
                        if (bl) {
                            if (com.mobond.mindicator.h.a((Context)this.a.a, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                                TraceTrainUI2.a((Context)this.a.a, "YES_TRACE");
                                if (com.mobond.mindicator.a.a.a((Context)this.a.a)) {
                                    this.a.a.i();
                                    return;
                                }
                                n.f((Context)TraceTrainUI2.a(this.a.a), "Please wait..");
                                this.a.a.K.setChecked(false);
                                this.a.a.ak = true;
                                com.mobond.mindicator.a.a.b((Activity)this.a.a);
                                return;
                            }
                            this.a.a.K.setChecked(false);
                            if (com.mobond.mindicator.h.a((Activity)this.a.a, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                                com.mobond.mindicator.h.a((Activity)this.a.a, 111);
                                return;
                            }
                            TraceTrainUI2.a(this.a.a, (Activity)this.a.a, this.a.a.getString(2131755270), 111);
                            return;
                        }
                        TraceTrainUI2.n(this.a.a);
                    }
                };
                TraceTrainUI2.a(this.a, onCheckedChangeListener);
                TraceTrainUI2.o(this.a);
                this.a.ak = false;
            }

            public void onServiceDisconnected(android.content.ComponentName componentName) {
                TraceTrainUI2 traceTrainUI2 = this.a;
                traceTrainUI2.H = null;
                traceTrainUI2.ak = false;
            }
        };
    }

    private void z() {
        this.U = this.getIntent().getExtras().getString("user_selected_dest");
        this.S.setVisibility(8);
    }

    @Override
    public void a() {
    }

    public void a(int n2) {
    }

    public void a(Bundle bundle) {
    }

    public void a(com.mobond.mindicator.ui.lt.a.a a2) {
        int n2;
        this.aR = -1;
        this.l.clear();
        if (a2 != null && a2.b()) {
            String[] arrstring;
            this.F.setVisibility(0);
            this.B.a(a2);
            boolean bl = false;
            boolean bl2 = true;
            for (int i2 = 0; i2 < (arrstring = this.h).length; ++i2) {
                String[] arrstring2;
                boolean bl3;
                String string = arrstring[i2].split("#", -1)[2];
                if (bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.h[i2].split("#", -1)[0]);
                    stringBuilder.append(" ");
                    stringBuilder.append(this.h[i2].split("#", -1)[1]);
                    String string2 = stringBuilder.toString();
                    try {
                        String string3 = f.a(string2, a2.e);
                        a2.i.put((Object)string, (Object)string3);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (a2.b.equals((Object)string)) {
                    boolean bl4;
                    if (a2.c.equals((Object)"0")) {
                        ArrayList<String> arrayList = this.l;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.h[i2]);
                        stringBuilder.append("#LIVEPOS#");
                        arrayList.add((Object)stringBuilder.toString());
                        this.aR = i2;
                        bl4 = false;
                        bl2 = false;
                    } else {
                        this.l.add((Object)this.h[i2]);
                        this.l.add((Object)"#LIVEPOS#");
                        this.aR = i2 + 1;
                        bl4 = true;
                    }
                    bl3 = bl4;
                    bl = true;
                } else {
                    this.l.add((Object)this.h[i2]);
                    bl3 = false;
                }
                if (!bl2 || i2 >= (arrstring2 = this.h).length - 1) continue;
                ArrayList<String> arrayList = com.mobond.mindicator.util.c.a(string, arrstring2[i2 + 1].split("#", -1)[2]);
                for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                    if (!((String)arrayList.get(i3)).equals((Object)a2.b)) continue;
                    bl = true;
                    bl3 = true;
                    break;
                }
                if (!bl3) continue;
                this.a(arrayList, a2, i2);
                bl2 = false;
            }
        } else {
            this.B.a();
            this.l.addAll((Collection)Arrays.asList((Object[])this.h));
            this.F.setVisibility(8);
        }
        if (a2 != null && a2.f != -1) {
            TextView textView = this.aE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a2.f);
            stringBuilder.append("");
            textView.setText((CharSequence)stringBuilder.toString());
        } else {
            this.aE.setText((CharSequence)"");
        }
        this.t();
        if (this.Q && (n2 = this.aR) != -1) {
            this.Q = false;
            this.d(n2);
        }
        this.q();
    }

    @Override
    public void a(String string) {
        this.b(string, true);
    }

    public void a(String string, String string2) {
        ProgressDialog progressDialog = new ProgressDialog((Context)this.L());
        progressDialog.setMessage((CharSequence)"Loading..");
        progressDialog.setCancelable(false);
        progressDialog.show();
        com.mobond.mindicator.ui.lt.trainutils.a.a(string2, this.P.H(), new com.mulo.b.a(this, progressDialog, string, string2){
            final /* synthetic */ ProgressDialog a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ TraceTrainUI2 d;
            {
                this.d = traceTrainUI2;
                this.a = progressDialog;
                this.b = string;
                this.c = string2;
            }

            public void a() {
                n.a((Dialog)this.a);
            }

            public void a(byte[] arrby, byte[] arrby2, Object object) {
                String string = new String(arrby);
                n.a((Dialog)this.a);
                TraceTrainUI2.a(this.d, this.b, this.c, string);
            }
        }, this.L());
    }

    public void a(boolean bl) {
        try {
            if (this.ap.isPlaying()) {
                this.ap.stop();
                this.ap.release();
                this.ap = new MediaPlayer();
            }
            AssetFileDescriptor assetFileDescriptor = this.getAssets().openFd("r.mp3");
            this.ap.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            assetFileDescriptor.close();
            this.ap.prepare();
            this.ap.setVolume(1.0f, 1.0f);
            this.ap.setLooping(false);
            this.ap.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this, bl){
                final /* synthetic */ boolean a;
                final /* synthetic */ TraceTrainUI2 b;
                {
                    this.b = traceTrainUI2;
                    this.a = bl;
                }

                public void onCompletion(MediaPlayer mediaPlayer) {
                    if (this.a) {
                        TraceTrainUI2 traceTrainUI2 = this.b;
                        TraceTrainUI2.a(traceTrainUI2, traceTrainUI2.ao);
                    }
                }
            });
            this.ap.start();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void a(boolean bl, boolean bl2) {
        this.aA = new Dialog((Context)this.L());
        this.aA.requestWindowFeature(1);
        this.aA.setContentView(2131492937);
        this.aA.getWindow().setLayout(-1, -2);
        this.aA.show();
        this.Y = (EditText)this.aA.findViewById(2131296704);
        this.aa = (TextView)this.aA.findViewById(2131296442);
        this.Z = (EditText)this.aA.findViewById(2131296705);
        this.ab = this.aA.findViewById(2131297066);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isVerficationNeeded : ");
        stringBuilder.append(bl2);
        Log.d((String)"55555", (String)stringBuilder.toString());
        if (bl2) {
            this.aa.setText((CharSequence)"VERIFY");
        } else {
            this.aa.setText((CharSequence)"SAVE");
        }
        this.aa.setOnClickListener(new View.OnClickListener(this, bl2){
            final /* synthetic */ boolean a;
            final /* synthetic */ TraceTrainUI2 b;
            {
                this.b = traceTrainUI2;
                this.a = bl;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public void onClick(View view) {
                if (this.a) {
                    if (this.b.aa.getText().toString().trim().equals((Object)"VERIFY")) {
                        TraceTrainUI2 traceTrainUI2 = this.b;
                        if (!TraceTrainUI2.c(traceTrainUI2, traceTrainUI2.Y.getText().toString())) return;
                        TraceTrainUI2 traceTrainUI22 = this.b;
                        TraceTrainUI2.a(traceTrainUI22, traceTrainUI22.Y.getText().toString(), this.b.af);
                        return;
                    }
                    if (!this.b.Z.getText().toString().isEmpty()) {
                        TraceTrainUI2 traceTrainUI2 = this.b;
                        TraceTrainUI2.d(traceTrainUI2, traceTrainUI2.Z.getText().toString());
                        return;
                    }
                    n.d((Context)this.b, "Enter OTP");
                    return;
                }
                TraceTrainUI2 traceTrainUI2 = this.b;
                TraceTrainUI2.b(traceTrainUI2, traceTrainUI2.af, false);
            }
        });
        this.af = bl ? this.ah : this.ag;
        this.N();
    }

    public void a(String[] arrstring) {
        this.l = new ArrayList((Collection)new Vector((Collection)Arrays.asList((Object[])arrstring)));
        this.c();
    }

    public boolean a(Context context) {
        switch (((AudioManager)context.getSystemService("audio")).getRingerMode()) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
        }
        return true;
    }

    @Override
    public void b() {
        Dialog dialog = this.aA;
        if (dialog != null && dialog.isShowing()) {
            this.ab.setVisibility(0);
            this.Y.setEnabled(false);
            this.aa.setText((CharSequence)"SUBMIT OTP");
        }
    }

    @Override
    public void b(int n2) {
        this.aL = true;
    }

    public void b(com.google.android.gms.common.b b2) {
    }

    @Override
    public void b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error : ");
        stringBuilder.append(string);
        Log.d((String)"99999", (String)stringBuilder.toString());
        n.d((Context)this, string);
    }

    public void b(boolean bl) {
        this.aN = bl;
    }

    public void button1Action(View view) {
        Intent intent = new Intent(view.getContext(), TrainLocationEntryRPFUI.class);
        intent.putExtra("selected_train_string", this.c);
        intent.putExtra("you_are_at", this.a);
        this.startActivity(intent);
    }

    public void c() {
        this.P = com.mobond.mindicator.a.a((Activity)this);
        if (this.am && com.mobond.mindicator.b.h()) {
            this.k = false;
        }
        this.v();
        this.V = (TextView)this.findViewById(2131296714);
        this.v = (ExpandableListView)this.findViewById(2131296935);
        this.R = (Spinner)this.findViewById(2131296631);
        this.S = (RelativeLayout)this.findViewById(2131297193);
        this.T = (LinearLayout)this.findViewById(2131296960);
        this.T.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            public void onClick(View view) {
                this.a.R.performClick();
            }
        });
        this.x();
        this.v.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener(this){
            final /* synthetic */ TraceTrainUI2 a;
            {
                this.a = traceTrainUI2;
            }

            /*
             * Exception decompiling
             */
            public boolean onGroupClick(}
        java.lang.IllegalStateException: Parameters not created
        
        