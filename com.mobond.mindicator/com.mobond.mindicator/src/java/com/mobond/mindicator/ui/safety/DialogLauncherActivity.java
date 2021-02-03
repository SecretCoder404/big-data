/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mobond.mindicator.ui.safety;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.mobond.mindicator.ui.safety.MissedCallReceiver;

public class DialogLauncherActivity
extends Activity {
    private void a(final Context context, final String string, String string2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context).setIcon(2131231078).setTitle(2131755070).setCancelable(false);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Emergency SMS is sent to ");
        stringBuilder.append(string2);
        stringBuilder.append(" due to ");
        stringBuilder.append(2);
        stringBuilder.append(" missed calls. Please call back him/her.");
        builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)"OK", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                MissedCallReceiver.a(context, string);
                DialogLauncherActivity.this.finish();
            }
        }).create().show();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a((Context)this, this.getIntent().getStringExtra("contactnumber"), this.getIntent().getStringExtra("contactname"));
    }

}

