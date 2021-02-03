/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.location.Location
 *  android.net.ConnectivityManager
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.text.InputFilter
 *  android.text.InputFilter$LengthFilter
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.core.app.a
 *  androidx.core.content.a
 *  com.google.android.gms.common.api.f
 *  com.google.android.gms.common.api.f$b
 *  com.google.android.gms.common.api.h
 *  com.google.android.gms.common.api.n
 *  com.google.android.gms.location.LocationRequest
 *  com.google.android.gms.location.a
 *  com.google.android.gms.location.e
 *  com.google.android.gms.location.f
 *  com.google.android.gms.location.g
 *  com.google.android.gms.location.g$a
 *  com.google.android.gms.location.i
 *  com.google.android.gms.location.k
 *  com.google.firebase.database.a
 *  com.google.firebase.database.e
 *  com.google.firebase.database.h
 *  com.google.firebase.database.n
 *  com.google.firebase.database.q
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Arrays
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.chat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.f;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import com.google.android.gms.location.k;
import com.google.firebase.database.e;
import com.google.firebase.database.q;
import com.mobond.mindicator.BaseAppCompatActivity;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.SplashUI;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.alert.News;
import com.mobond.mindicator.ui.c;
import com.mobond.mindicator.ui.chat.ChatModel;
import com.mobond.mindicator.ui.chat.ChatScreenHSV;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.n;
import com.mulo.b.j;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint(value={"NewApi"})
public class ChatScreenHSV
extends BaseAppCompatActivity
implements f.b,
com.google.android.gms.location.e,
com.mobond.mindicator.ui.b {
    private ListView A;
    private ListView B;
    private RelativeLayout C;
    private EditText D;
    private TextView E;
    private View F;
    private ProgressBar G;
    private ProgressBar H;
    private String I;
    private String J;
    private String K = null;
    private com.mobond.mindicator.ui.chat.a L = null;
    private com.mobond.mindicator.ui.chat.a M = null;
    private Toast N;
    private String O = "";
    private Activity P;
    private com.google.android.gms.common.api.f Q;
    private double R;
    private double S;
    private long T;
    private boolean U = false;
    private LocationRequest V;
    private RelativeLayout W;
    private TextView X;
    private TextView Y;
    private TextView Z;
    String a;
    private TextView aa;
    private View ab;
    private View ac;
    private View ad;
    private View ae;
    private String af;
    private boolean ag = false;
    private int ah;
    private long ai = 0L;
    private boolean aj = false;
    private com.google.firebase.database.n ak;
    private long al;
    private ImageButton am;
    private boolean an = false;
    private View ao;
    private LinearLayout ap;
    private boolean aq;
    private boolean ar;
    private View as;
    private String at;
    String b;
    public String c;
    boolean d;
    boolean e = false;
    TextView f;
    ArrayList<ChatModel> g = new ArrayList();
    ArrayList<ChatModel> h = new ArrayList();
    ArrayList<ChatModel> i = new ArrayList();
    com.google.firebase.database.a j;
    ListView k;
    String l;
    TextView m;
    RelativeLayout n;
    TextView o;
    TextView p;
    ImageView q;
    ImageView r;
    ConnectivityManager s;
    Button t;
    ImageView u;
    boolean v = false;
    ViewGroup w;
    Button x;
    private final Object y = new Object();
    private RelativeLayout z;

    static /* synthetic */ Object B(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.y;
    }

    static /* synthetic */ void C(ChatScreenHSV chatScreenHSV) {
        chatScreenHSV.s();
    }

    static /* synthetic */ long a(ChatScreenHSV chatScreenHSV, long l2) {
        chatScreenHSV.al = l2;
        return l2;
    }

    static /* synthetic */ Activity a(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.P;
    }

    public static ColorStateList a(int n2, int n3) {
        return new ColorStateList((int[][])new int[][]{{16842919}, new int[0]}, new int[]{n3, n2});
    }

    static /* synthetic */ ChatModel a(ChatScreenHSV chatScreenHSV, JSONObject jSONObject) {
        return chatScreenHSV.a(jSONObject);
    }

    private ChatModel a(JSONObject jSONObject) {
        ChatModel chatModel = new ChatModel();
        chatModel.setI(jSONObject.getString("i"));
        chatModel.setM(jSONObject.getString("m"));
        chatModel.setN(jSONObject.getString("n"));
        chatModel.setTime(jSONObject.getLong("time"));
        if (jSONObject.has("ri")) {
            chatModel.setRi(jSONObject.getString("ri"));
        }
        if (jSONObject.has("rm")) {
            chatModel.setRm(jSONObject.getString("rm"));
        }
        if (jSONObject.has("rn")) {
            chatModel.setRn(jSONObject.getString("rn"));
        }
        if (jSONObject.has("lc")) {
            chatModel.setLc(jSONObject.getInt("lc"));
        }
        if (jSONObject.has("sc")) {
            chatModel.setSc(jSONObject.getInt("sc"));
        }
        return chatModel;
    }

    static /* synthetic */ String a(ChatScreenHSV chatScreenHSV, String string) {
        chatScreenHSV.at = string;
        return string;
    }

    public static void a(Activity activity) {
        Toast.makeText((Context)activity, (CharSequence)"Logging in..", (int)0).show();
        activity.startActivityForResult(new Intent((Context)activity, GoogleLoginActivity.class), 2345);
    }

    private void a(EditText editText) {
        editText.setLongClickable(false);
        editText.setCustomSelectionActionModeCallback(new ActionMode.Callback(this){
            final /* synthetic */ ChatScreenHSV a;
            {
                this.a = chatScreenHSV;
            }

            public boolean onActionItemClicked(ActionMode actionMode, android.view.MenuItem menuItem) {
                return false;
            }

            public boolean onCreateActionMode(ActionMode actionMode, android.view.Menu menu) {
                return false;
            }

            public void onDestroyActionMode(ActionMode actionMode) {
            }

            public boolean onPrepareActionMode(ActionMode actionMode, android.view.Menu menu) {
                return false;
            }
        });
        editText.setOnLongClickListener(new View.OnLongClickListener(this){
            final /* synthetic */ ChatScreenHSV a;
            {
                this.a = chatScreenHSV;
            }

            public boolean onLongClick(View view) {
                return true;
            }
        });
    }

    static /* synthetic */ void a(ChatScreenHSV chatScreenHSV, Activity activity) {
        chatScreenHSV.b(activity);
    }

    private void a(Integer n2, Integer n3, Integer n4, Integer n5, Integer n6) {
        if (n2 != null) {
            this.ac.setBackgroundColor(n2.intValue());
        }
        if (n3 != null) {
            this.ad.setBackgroundColor(n3.intValue());
        }
        if (n4 != null) {
            this.ap.setBackgroundColor(n4.intValue());
        }
        if (n5 != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                int n7 = androidx.core.content.a.c((Context)this.P, (int)2131099725);
                ((GradientDrawable)this.F.getBackground()).setColor(ChatScreenHSV.a(n5, n7));
            } else {
                this.F.getBackground().setColorFilter(n5.intValue(), PorterDuff.Mode.DST_OVER);
            }
        }
        if (n6 != null) {
            this.D.setHintTextColor(n6.intValue());
        }
    }

    private void a(String string, String string2, String string3) {
        if (string != null && this.at != null) {
            com.mulo.b.h h2 = new com.mulo.b.h();
            h2.a("fcm_id", this.at);
            h2.a("email", string3);
            h2.a("name", string2);
            h2.a("plus_id", string);
            h2.a("st", "register");
            new Thread(this, h2){
                final /* synthetic */ com.mulo.b.h a;
                final /* synthetic */ ChatScreenHSV b;
                {
                    this.b = chatScreenHSV;
                    this.a = h2;
                }

                public void run() {
                    try {
                        com.mulo.b.c.b("http://mobondhrd.appspot.com/chat?", this.a, null);
                        return;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        return;
                    }
                }
            }.start();
        }
    }

    public static boolean a(Context context) {
        return true ^ Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"mock_location").equals((Object)"0");
    }

    static /* synthetic */ boolean a(ChatScreenHSV chatScreenHSV, boolean bl) {
        chatScreenHSV.an = bl;
        return bl;
    }

    private void b(Activity activity) {
        Dialog dialog = new Dialog((Context)activity);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131492984);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(activity.getString(2131755491));
        stringBuilder.append(",182$");
        stringBuilder.append(activity.getString(2131755164));
        stringBuilder.append(",9004499733$");
        stringBuilder.append(activity.getString(2131755162));
        stringBuilder.append(",9987645307");
        String string = stringBuilder.toString();
        LinearLayout linearLayout = (LinearLayout)dialog.findViewById(2131296998);
        ((TextView)dialog.findViewById(2131297510)).setText((CharSequence)activity.getString(2131755196));
        dialog.findViewById(2131297510).setVisibility(0);
        String[] arrstring = string.split("\\$");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String[] arrstring2 = arrstring[i2].split(",");
            ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131493037, (ViewGroup)linearLayout, false);
            TextView textView = (TextView)viewGroup.findViewById(2131297084);
            ((TextView)viewGroup.findViewById(2131297004)).setText((CharSequence)arrstring2[0]);
            textView.setText((CharSequence)arrstring2[1]);
            viewGroup.setOnClickListener(new View.OnClickListener(this, activity, i2, arrstring2){
                final /* synthetic */ Activity a;
                final /* synthetic */ int b;
                final /* synthetic */ String[] c;
                final /* synthetic */ ChatScreenHSV d;
                {
                    this.d = chatScreenHSV;
                    this.a = activity;
                    this.b = n2;
                    this.c = arrstring;
                }

                public void onClick(View view) {
                    android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager)this.a.getSystemService("clipboard");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("mobond_cb_help_");
                    stringBuilder.append(this.b);
                    android.content.ClipData clipData = android.content.ClipData.newPlainText((CharSequence)stringBuilder.toString(), (CharSequence)this.c[1]);
                    if (clipboardManager != null) {
                        Toast.makeText((Context)this.a, (int)2131755430, (int)0).show();
                        clipboardManager.setPrimaryClip(clipData);
                    }
                }
            });
            linearLayout.addView((View)viewGroup);
        }
        dialog.show();
    }

    static /* synthetic */ boolean b(ChatScreenHSV chatScreenHSV, boolean bl) {
        chatScreenHSV.aq = bl;
        return bl;
    }

    static /* synthetic */ boolean c(ChatScreenHSV chatScreenHSV, boolean bl) {
        chatScreenHSV.aj = bl;
        return bl;
    }

    static /* synthetic */ Toast d(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.N;
    }

    static /* synthetic */ String e(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.O;
    }

    static /* synthetic */ String f(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.I;
    }

    static /* synthetic */ TextView g(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.Y;
    }

    static /* synthetic */ TextView h(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.X;
    }

    static /* synthetic */ TextView i(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.Z;
    }

    static /* synthetic */ double j(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.R;
    }

    static /* synthetic */ double k(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.S;
    }

    static /* synthetic */ long l(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.T;
    }

    static /* synthetic */ String m(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.af;
    }

    private void n() {
        if (this.aq) {
            this.am.setVisibility(0);
            return;
        }
        this.am.setVisibility(8);
    }

    private void o() {
        this.W.setVisibility(8);
        this.X.setText((CharSequence)"");
        this.Y.setText((CharSequence)"");
        this.Z.setText((CharSequence)"");
        this.D.setHint((CharSequence)this.getString(2131755536));
    }

    private void p() {
        this.w = (ViewGroup)this.getLayoutInflater().inflate(2131492951, (ViewGroup)this.A, false);
        this.x = (Button)this.w.findViewById(2131296434);
        this.x.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ChatScreenHSV a;
            {
                this.a = chatScreenHSV;
            }

            public void onClick(View view) {
                this.a.x.setEnabled(false);
                ChatScreenHSV.y(this.a);
            }
        });
        this.A.addHeaderView((View)this.w, null, false);
    }

    static /* synthetic */ void p(ChatScreenHSV chatScreenHSV) {
        chatScreenHSV.o();
    }

    static /* synthetic */ ListView q(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.A;
    }

    private void q() {
        com.google.firebase.database.n n2;
        if (this.K != null) {
            com.google.firebase.database.n n3 = com.google.firebase.database.h.a().b().a("CHAT").a(this.K).a(this.J).c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.al);
            n2 = n3.c(stringBuilder.toString()).a(300);
        } else {
            com.google.firebase.database.n n4 = com.google.firebase.database.h.a().b().a("CHAT").a(this.J).c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.al);
            n2 = n4.c(stringBuilder.toString()).a(300);
        }
        this.H.setVisibility(0);
        this.getWindow().setFlags(16, 16);
        this.x.setText(2131755387);
        n2.a(new q(this){
            final /* synthetic */ ChatScreenHSV a;
            {
                this.a = chatScreenHSV;
            }

            public void a(com.google.firebase.database.b b2) {
                if (!b2.a()) {
                    ChatScreenHSV.q(this.a).removeHeaderView((View)this.a.w);
                    ChatScreenHSV.z(this.a).setVisibility(8);
                    return;
                }
                if (b2.b() < 300L) {
                    ChatScreenHSV.q(this.a).removeHeaderView((View)this.a.w);
                }
                this.a.h.clear();
                java.util.Iterator iterator = b2.e().iterator();
                while (iterator.hasNext()) {
                    ChatModel chatModel = (ChatModel)((com.google.firebase.database.b)iterator.next()).a(ChatModel.class);
                    this.a.h.add((Object)chatModel);
                }
                ChatScreenHSV chatScreenHSV = this.a;
                ChatScreenHSV.a(chatScreenHSV, ((ChatModel)chatScreenHSV.h.get(0)).getTime() - 1L);
                for (int i2 = 0; i2 < this.a.h.size(); ++i2) {
                    ChatModel chatModel = (ChatModel)this.a.h.get(this.a.h.size() - 1 - i2);
                    this.a.g.add(0, (Object)chatModel);
                }
                ChatScreenHSV.u(this.a).notifyDataSetChanged();
                ChatScreenHSV.q(this.a).post(new Runnable(this){
                    final /* synthetic */ 9 a;
                    {
                        this.a = var1_1;
                    }

                    public void run() {
                        ChatScreenHSV.q(this.a.a).setSelection(this.a.a.h.size());
                    }
                });
                ChatScreenHSV.z(this.a).setVisibility(8);
                this.a.getWindow().clearFlags(16);
                this.a.x.setText(2131755386);
                this.a.x.setEnabled(true);
            }

            public void a(com.google.firebase.database.c c2) {
                this.a.x.setVisibility(8);
                this.a.getWindow().clearFlags(16);
                this.a.x.setText(2131755386);
                this.a.x.setEnabled(true);
            }
        });
    }

    static /* synthetic */ RelativeLayout r(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.z;
    }

    private void r() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            if (((ChatModel)this.g.get(i2)).getTime() != this.ai) continue;
            n2 = i2;
        }
        if (n2 != 0) {
            this.ai = 0L;
            this.aj = true;
            this.A.post(new Runnable(this, n2){
                final /* synthetic */ int a;
                final /* synthetic */ ChatScreenHSV b;
                {
                    this.b = chatScreenHSV;
                    this.a = n2;
                }

                public void run() {
                    ChatScreenHSV.q(this.b).setSelection(this.a);
                }
            });
            ((ChatModel)this.g.get(n2)).setHeighLight(true);
        }
        this.L.notifyDataSetChanged();
    }

    static /* synthetic */ TextView s(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.E;
    }

    private void s() {
        ViewGroup viewGroup;
        long l2;
        this.t();
        if (this.g.size() < 300 && (viewGroup = this.w) != null) {
            this.A.removeHeaderView((View)viewGroup);
        }
        if (!this.g.isEmpty()) {
            this.al = ((ChatModel)this.g.get(0)).getTime() - 1L;
            ArrayList<ChatModel> arrayList = this.g;
            l2 = 1L + ((ChatModel)arrayList.get(-1 + arrayList.size())).getTime();
        } else {
            l2 = System.currentTimeMillis();
        }
        if (this.K != null) {
            com.google.firebase.database.n n2 = com.google.firebase.database.h.a((String)this.a).b().a("CHAT").a(this.K).a(this.J).c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(l2);
            this.ak = n2.b(stringBuilder.toString());
        } else {
            com.google.firebase.database.n n3 = com.google.firebase.database.h.a((String)this.a).b().a("CHAT").a(this.J).c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(l2);
            this.ak = n3.b(stringBuilder.toString());
        }
        this.ak.a(this.j);
    }

    private void t() {
        this.j = new com.google.firebase.database.a(this){
            final /* synthetic */ ChatScreenHSV a;
            {
                this.a = chatScreenHSV;
            }

            public void a(com.google.firebase.database.b b2) {
                ChatModel chatModel = (ChatModel)b2.a(ChatModel.class);
                for (int i2 = 0; i2 < this.a.g.size(); ++i2) {
                    if (((ChatModel)this.a.g.get(i2)).getTime() != chatModel.getTime()) continue;
                    this.a.g.remove(i2);
                    break;
                }
                this.a.e();
            }

            public void a(com.google.firebase.database.b b2, String string) {
                android.util.Log.d((String)"ChatScreenHSV", (String)"onChildAdded");
                ChatModel chatModel = (ChatModel)b2.a(ChatModel.class);
                if (this.a.g.size() > 10000) {
                    this.a.g.remove(0);
                }
                this.a.g.add((Object)chatModel);
                this.a.e();
            }

            public void a(com.google.firebase.database.c c2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("databaseError Details : ");
                stringBuilder.append(c2.b());
                stringBuilder.append(" databaseError Code : ");
                stringBuilder.append(c2.a());
                android.util.Log.d((String)"ChatScreenHSV", (String)stringBuilder.toString());
            }

            public void b(com.google.firebase.database.b b2, String string) {
                android.util.Log.d((String)"ChatScreenHSV", (String)"onChildChanged");
                ChatModel chatModel = (ChatModel)b2.a(ChatModel.class);
                for (int i2 = 0; i2 < this.a.g.size(); ++i2) {
                    if (((ChatModel)this.a.g.get(i2)).getTime() != chatModel.getTime()) continue;
                    this.a.g.set(i2, (Object)chatModel);
                    break;
                }
                this.a.e();
            }

            public void c(com.google.firebase.database.b b2, String string) {
                android.util.Log.d((String)"ChatScreenHSV", (String)"onChildMoved");
            }
        };
    }

    static /* synthetic */ boolean t(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.ar;
    }

    static /* synthetic */ com.mobond.mindicator.ui.chat.a u(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.L;
    }

    static /* synthetic */ boolean v(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.aq;
    }

    static /* synthetic */ void w(ChatScreenHSV chatScreenHSV) {
        chatScreenHSV.n();
    }

    static /* synthetic */ boolean x(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.an;
    }

    static /* synthetic */ void y(ChatScreenHSV chatScreenHSV) {
        chatScreenHSV.q();
    }

    static /* synthetic */ ProgressBar z(ChatScreenHSV chatScreenHSV) {
        return chatScreenHSV.H;
    }

    public JSONObject a(String string) {
        String string2 = com.mulo.b.c.a(string, null, null);
        JSONObject jSONObject = null;
        if (string2 != null) {
            jSONObject = new JSONObject(string2.trim());
        }
        return jSONObject;
    }

    @Override
    public void a() {
    }

    public void a(int n2) {
    }

    public void a(Location location) {
        if (location != null) {
            this.j();
            this.R = location.getLatitude();
            this.S = location.getLongitude();
            this.d = ChatScreenHSV.a((Context)this);
            this.T = System.currentTimeMillis();
        }
    }

    public void a(Bundle bundle) {
        if (!com.mobond.mindicator.a.a.a((Context)this.P)) {
            String string = this.O;
            if (string != null && !string.isEmpty()) {
                this.g();
                return;
            }
        } else {
            this.h();
        }
    }

    public void b() {
        View view = this.ab;
        if (view != null && this.ag) {
            view.setVisibility(0);
        }
    }

    @Override
    public void b(int n2) {
        this.ag = true;
        this.ah = n2;
    }

    public void c() {
        View view = this.ab;
        if (view != null && this.ah == 3) {
            view.setVisibility(8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        Object object;
        this.v = false;
        Object object2 = object = this.y;
        synchronized (object2) {
            this.y.notify();
            return;
        }
    }

    public void e() {
        if (this.L == null) {
            com.mobond.mindicator.ui.chat.a a2;
            this.L = a2 = new com.mobond.mindicator.ui.chat.a(this.g, (Activity)this, this.O, this.J, this.K, this.ar, this.b);
            this.p();
            this.A.setAdapter((ListAdapter)this.L);
            this.A.clearFocus();
            if (this.ai != 0L) {
                this.r();
                return;
            }
            if (!this.aj) {
                this.A.post(new Runnable(this){
                    final /* synthetic */ ChatScreenHSV a;
                    {
                        this.a = chatScreenHSV;
                    }

                    public void run() {
                        ChatScreenHSV.q(this.a).setSelection(-1 + ChatScreenHSV.u(this.a).getCount());
                    }
                });
                return;
            }
        } else {
            if (this.ai != 0L) {
                this.r();
                return;
            }
            if (!this.aj && this.A.getLastVisiblePosition() == -1 + this.A.getCount()) {
                this.L.notifyDataSetChanged();
                this.A.post(new Runnable(this){
                    final /* synthetic */ ChatScreenHSV a;
                    {
                        this.a = chatScreenHSV;
                    }

                    public void run() {
                        ChatScreenHSV.q(this.a).setSelection(-1 + ChatScreenHSV.u(this.a).getCount());
                    }
                });
            }
            this.L.notifyDataSetChanged();
        }
    }

    public void f() {
        if (this.B != null) {
            com.mobond.mindicator.ui.chat.a a2 = this.M;
            if (a2 == null) {
                com.mobond.mindicator.ui.chat.a a3;
                this.M = a3 = new com.mobond.mindicator.ui.chat.a(this.i, this.P, this.O, this.J, this.K, this.ar, this.b);
                this.B.setAdapter((ListAdapter)this.M);
                this.B.setSelection(this.i.size());
                return;
            }
            a2.notifyDataSetChanged();
        }
    }

    void g() {
        LocationRequest locationRequest = LocationRequest.a();
        locationRequest.a(100);
        locationRequest.a(30000L);
        locationRequest.c(5000L);
        g.a a2 = new g.a().a(locationRequest);
        a2.a(true);
        f.d.a(this.Q, a2.a()).a((com.google.android.gms.common.api.n)new com.google.android.gms.common.api.n<i>(this){
            final /* synthetic */ ChatScreenHSV a;
            {
                this.a = chatScreenHSV;
            }

            /*
             * Exception decompiling
             */
            public void a(}
        java.lang.IllegalStateException: Parameters not created
        
        