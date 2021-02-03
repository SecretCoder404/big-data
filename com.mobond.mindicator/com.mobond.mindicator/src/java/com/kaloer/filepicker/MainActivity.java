/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.TextView
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.String
 */
package com.kaloer.filepicker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.kaloer.filepicker.FilePickerActivity;
import java.io.File;

public class MainActivity
extends Activity
implements View.OnClickListener {
    private TextView a;
    private Button b;

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (n3 == -1) {
            if (n2 != 1) {
                return;
            }
            if (intent.hasExtra("file_path")) {
                File file = new File(intent.getStringExtra("file_path"));
                this.a.setText((CharSequence)file.getPath());
            }
        }
    }

    public void onClick(View view) {
        this.startActivityForResult(new Intent((Context)this, FilePickerActivity.class), 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492999);
        this.a = (TextView)this.findViewById(2131296780);
        this.b = (Button)this.findViewById(2131297429);
        this.b.setOnClickListener((View.OnClickListener)this);
    }
}

