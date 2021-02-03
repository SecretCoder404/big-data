/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.util.Log
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.ListView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.mobond.mindicator.ui.safety;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.e;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.safety.SafetyUI;
import com.mobond.mindicator.ui.safety.a;
import com.mulo.util.g;

public class SafetyUI
extends e {
    private static String Q = "SAFETY_ACTION";
    private static String R = "Western Railway\nHelpline - RPF";
    private static String S = "Central Railway\nHelpline - RPF";
    private static String T = "Safety Instructions";
    private static String U = "How it works?";
    private static String V = "Your Name";
    d N = null;
    d O = null;
    d P = null;
    private d W = null;

    private SafetyUI() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Activity activity, Context context, String string, boolean bl, String string2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("safety ");
            stringBuilder.append(com.mulo.util.e.b());
            Log.d((String)"safety", (String)stringBuilder.toString());
            if (string2 == null) {
                string2 = "";
            }
            if (!bl) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string2);
                stringBuilder2.append("\nMy approx location is ");
                string2 = stringBuilder2.toString();
            }
            String string3 = com.mulo.b.e.b(context);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append("\n http://m.mobond.com/safe?loid=");
            stringBuilder3.append(string3);
            stringBuilder3.append("\nm-Indicator ");
            stringBuilder3.append(com.mulo.util.e.b());
            String string4 = stringBuilder3.toString();
            a a2 = new a(context);
            Object[] arrobject = new String[]{string, string4.trim(), string3};
            a2.execute(arrobject);
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Sending approx location SMS to ");
            stringBuilder4.append(string);
            n.a(context, stringBuilder4.toString());
            return;
        }
        catch (Exception exception) {
            Log.d((String)"safety", (String)"safety Exception in sending SMS 111", (Throwable)exception);
            n.d((Context)activity, "SMS could not be sent.\nPlease check network.");
            return;
        }
    }

    private void a(Context context, String string, String string2, String string3) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle((CharSequence)"Enter ");
        builder.setMessage((CharSequence)string3);
        EditText editText = new EditText((Context)this);
        builder.setView((View)editText);
        if (string2 != null) {
            editText.setText((CharSequence)string2);
        } else {
            editText.setText((CharSequence)"");
        }
        builder.setPositiveButton((CharSequence)"Ok", new DialogInterface.OnClickListener(this, editText, string, context){
            final /* synthetic */ EditText a;
            final /* synthetic */ String b;
            final /* synthetic */ Context c;
            final /* synthetic */ SafetyUI d;
            {
                this.d = safetyUI;
                this.a = editText;
                this.b = string;
                this.c = context;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
                String string = this.a.getText().toString();
                if (this.b.equals((Object)"safetyyourname_key")) {
                    com.mobond.mindicator.a.a(this.c).b("safetyyourname_key", string);
                    if (!string.trim().equals((Object)"")) {
                        this.d.N.b = string;
                    } else if (string.trim().equals((Object)"")) {
                        this.d.N.b = SafetyUI.r();
                        com.mobond.mindicator.a.a(this.c).d("safetyyourname_key");
                    }
                    this.d.i();
                    return;
                }
                if (SafetyUI.a(this.d, string)) {
                    String string2 = string.replaceAll("[^+0-9]", "");
                    if (this.b.equals((Object)"safetycontact1number_key")) {
                        com.mobond.mindicator.a.a(this.c).e("Contact 1");
                        com.mobond.mindicator.a.a(this.c).b("safetycontact1number_key", string2);
                        com.mobond.mindicator.a.a(this.c).b("safetycontact1numbercallcount_key", "0");
                        com.mobond.mindicator.a.a(this.c).d("safetycontact1numberlastcalltime_key");
                        this.d.O.c = string2;
                    } else if (this.b.equals((Object)"safetycontact2number_key")) {
                        com.mobond.mindicator.a.a(this.c).b("safetycontact2name_key", "Contact 2");
                        com.mobond.mindicator.a.a(this.c).b("safetycontact2number_key", string2);
                        com.mobond.mindicator.a.a(this.c).b("safetycontact2numbercallcount_key", "0");
                        com.mobond.mindicator.a.a(this.c).d("safetycontact2numberlastcalltime_key");
                        this.d.P.c = string2;
                    }
                    this.d.i();
                }
            }
        });
        builder.setNegativeButton((CharSequence)"Cancel", new DialogInterface.OnClickListener(this){
            final /* synthetic */ SafetyUI a;
            {
                this.a = safetyUI;
            }

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        });
        builder.show();
    }

    static /* synthetic */ boolean a(SafetyUI safetyUI, String string) {
        return safetyUI.d(string);
    }

    private boolean d(String string) {
        if (string != null && string.matches("[0-9]{10,13}")) {
            return true;
        }
        n.c((Context)this, "Please enter correct mobile number.");
        return false;
    }

    static /* synthetic */ String r() {
        return V;
    }

    private void s() {
        if (this.W.i.equals((Object)"Contact 1")) {
            this.a((Context)this, "safetycontact1number_key", com.mobond.mindicator.a.a((Activity)this).b("safetycontact1number_key"), "Emergency contact number");
            return;
        }
        if (this.W.i.equals((Object)"Contact 2")) {
            this.a((Context)this, "safetycontact2number_key", com.mobond.mindicator.a.a((Activity)this).b("safetycontact2number_key"), "Emergency contact number");
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void a(ListView listView, View view, int n2, long l2) {
        d d2 = this.a(n2);
        if (d2.a != 2) {
            if (d2.i.equals((Object)T)) {
                String string = com.mulo.b.e.a("http://mobondhrd.appspot.com/womensafetyinstructions.jsp", (Context)this);
                Intent intent = new Intent((Context)this, WebUI.class);
                g g2 = new g();
                com.mulo.util.e.a(g2.a(), g2);
                g2.a = string;
                intent.putExtra("webuidatakey", g2.a());
                this.startActivity(intent);
                return;
            }
            if (d2.i.equals((Object)U)) {
                Intent intent = new Intent((Context)this, WebUI.class);
                g g3 = new g();
                com.mulo.util.e.a(g3.a(), g3);
                g3.a = "file:///android_asset/safety/safetyhowitworks.html";
                intent.putExtra("webuidatakey", g3.a());
                this.startActivity(intent);
                return;
            }
            if (d2.i.equals((Object)"Create Shortcut")) {
                return;
            }
            if (d2.i.equals((Object)"Reset Contacts")) {
                com.mobond.mindicator.a.a((Activity)this).j();
                com.mobond.mindicator.a.a((Activity)this).k();
                com.mobond.mindicator.a.a((Activity)this).l();
                com.mobond.mindicator.a.a((Activity)this).m();
                d d3 = this.O;
                d3.b = "Contact 1";
                d3.c = "Relative's phone number";
                d d4 = this.P;
                d4.b = "Contact 2";
                d4.c = "Relative's phone number";
                this.i();
                return;
            }
            if (!d2.i.equals((Object)"Contact 1") && !d2.i.equals((Object)"Contact 2")) {
                if (d2.i.equals((Object)V)) {
                    String string = com.mobond.mindicator.a.a(view.getContext()).b("safetyyourname_key");
                    this.a(view.getContext(), "safetyyourname_key", string, "Enter your name");
                    return;
                }
            } else {
                this.W = d2;
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setDataAndType(Uri.parse((String)"content://contacts"), "vnd.android.cursor.dir/phone_v2");
                this.startActivityForResult(intent, 1);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n2 == 1) {
            Cursor cursor;
            String string;
            if (n3 != -1) return;
            try {
                Uri uri = intent.getData();
                String[] arrstring = new String[]{"data1", "display_name"};
                cursor = this.getContentResolver().query(uri, arrstring, null, null, null);
                if (cursor == null) return;
            }
            catch (Exception exception) {
                this.s();
                return;
            }
            cursor.moveToFirst();
            String string2 = cursor.getString(cursor.getColumnIndex("data1")).replaceAll("[^+0-9]", "");
            this.W.b = string = cursor.getString(cursor.getColumnIndex("display_name"));
            this.W.c = string2;
            if (this.W.i.equals((Object)"Contact 1")) {
                com.mobond.mindicator.a.a((Activity)this).e(string);
                com.mobond.mindicator.a.a((Activity)this).f(string2);
                com.mobond.mindicator.a.a((Activity)this).i("0");
                com.mobond.mindicator.a.a((Activity)this).i();
            }
            if (this.W.i.equals((Object)"Contact 2")) {
                com.mobond.mindicator.a.a((Activity)this).g(string);
                com.mobond.mindicator.a.a((Activity)this).h(string2);
                com.mobond.mindicator.a.a((Activity)this).b("safetycontact2numbercallcount_key", "0");
                com.mobond.mindicator.a.a((Activity)this).d("safetycontact2numberlastcalltime_key");
            }
            this.i();
            cursor.close();
            return;
        }
        if (n2 != 2 || intent == null) return;
        String string = intent.getStringExtra("name");
        String string3 = intent.getStringExtra("contact_name1");
        String string4 = intent.getStringExtra("cell_number1");
        String string5 = intent.getStringExtra("contact_name2");
        String string6 = intent.getStringExtra("cell_number2");
        this.N.b = string;
        d d2 = this.O;
        d2.b = string3;
        d2.c = string4;
        d d3 = this.P;
        d3.b = string5;
        d3.c = string6;
        this.i();
    }
}

